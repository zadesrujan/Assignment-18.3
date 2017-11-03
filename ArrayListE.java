package ary;
//here we cretaed package as ary which that organizes a set of related classes and interfaces.
import java.util.ArrayList;
import java.util.*;

public class ArrayListE{   //creating the class name as ArraListExample

	public static void main(String[] args) { //creating main method
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
      	//void : returns to no value.
		//main : is special because it will start the program.
		
		ArrayList <Integer> studentMarks =new  ArrayList<Integer>(); //here I'm creating an array list of student marks of type integer 
		
		 studentMarks.add (10); //creating the list objects and initializing the variables  in it 
		 studentMarks.add (20);
		 studentMarks.add (30);
		 studentMarks.add (40);
		 studentMarks.add (50);
		 
		System.out.println( "The elements present in the arraylist are :  "+studentMarks);
		//system : is a class in java language pacakge.
				//out : static member of the system class.
				//println : to print what is output.
			 
		
		
		// here I'm showing the number of elements present in the ArrayList
		int size = studentMarks.size();  //creating the size of the ArrayList  
		System.out.println("Size of the arraylist is :  "+size);   //it shows the size of the number of elements present in it 
		
		//here I'm displaying whether the element is found or not in the ArrayList objects
		System.out.println("Checking  whether the element is present or not : ");
		
		if(studentMarks.contains(533)) { //by using if loop taking the condition as if studentMarks contains the value it prints  
			System.out.println("The element is found"); //the value is found
			
		}
		else{
			System.out.println("The element is  not found"); //else it displays value not found 
			
		}
          
		//here I'm converting the ArrayList into Array
		Integer marks[] = studentMarks.toArray (new Integer[studentMarks.size()]); //creating a method to convert into Array by passing the arguments of studentMarks.size 
		
		System.out.println("Converting the elements of arraylist to an array"); 
		
		for(Integer student : marks){  //using for each  loop traversing the elements of the ArrayList to Array
            System.out.println(student);  
        }  
		
		//here I'm displaying  how the element is replaced by an other value
		System.out.println("ArrayList before replacing the element: " + studentMarks);  
		// by using  studentMarks.set(index,element)method we can replace the value
		studentMarks.set(2, 40);                                                      
		//here I'm replacing the third element 53 which of Array index 2 by the value 40
		System.out.println("ArrayList after replacing the element: " + studentMarks);  
		//it displays the list after replacing the value

		
	
	}
}

