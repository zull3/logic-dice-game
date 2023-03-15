import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    //Variables 
    int noOfThrows = 0;
    int currentThrow = 0;
    int noOfOnes = 0;
    int noOfTwos = 0;
    int noOfThrees = 0;
    int noOfFours = 0;
    int noOfFives = 0;
    int noOfSixs = 0;

    Scanner input = new Scanner (System.in);

    System.out.print("Enter number of throws:");
    noOfThrows = input.nextInt();

    //Roll the dices
    for (int roll = 0; roll < noOfThrows; roll ++)
    {
      //Random a throw 1-6
      currentThrow = (int)(Math.random()*6)+1;
      //Print the dice thrown no.
      System.out.print(currentThrow + " ");

      //Update statistics
      if ( currentThrow == 1) //Dice shows 1
      {
        noOfOnes ++; //Increase number of Ones by 1
      }
      else if (currentThrow == 2) //If dice shows 2
      {
        noOfTwos ++; //Increase the number of twos by 1
      }
      else if (currentThrow == 3) //If dice shows 3
      {
        noOfThrees ++; //Increase the number of threes by 1
      }  
      else if (currentThrow == 4) //If dice shows 4
      {
        noOfFours ++; //Increase the number of fours by 1
      }  
      else if (currentThrow == 5) //If dice shows 5
      {
        noOfFives ++; //Increase the number of fives by 1
      }
      else 
      {
        noOfSixs ++; //Otherwise its a 6
      }
    }
    
    //Presents no of ones
    System.out.print("\n1:");
    
    //Print a # for every 1
    for (int i = 0; i < noOfOnes; i ++)
    {
      System.out.print("#");
    } 
    //Presents no of twos
    System.out.print("\n2:");
    for (int i = 0; i < noOfTwos; i ++)
    {
      System.out.print("#");
    }
    //Presents no of threes
    System.out.print("\n3:");
    for (int i = 0; i < noOfThrees; i ++)
    {
      System.out.print("#");
    }
    //Presents no of fours
    System.out.print("\n4:");
    for (int i = 0; i < noOfFours; i ++)
    {
      System.out.print("#");
    }
    //Presents no of fives
    System.out.print("\n5:");
    for (int i = 0; i < noOfFives; i ++)
    {
      System.out.print("#");
    }
    //Presents no of sixes
    System.out.print("\n6:");
    for (int i = 0; i < noOfSixs; i ++)
    {
       System.out.print("#");
    }
  }
}