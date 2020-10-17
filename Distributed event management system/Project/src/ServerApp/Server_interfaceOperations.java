package ServerApp;


/**
* ServerApp/Server_interfaceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from G:/workspace/COMP6231-A2-DEMS/src/ServerApp.idl
* Sunday, June 9, 2019 7:09:14 PM EDT
*/

public interface Server_interfaceOperations 
{
  String addEvent (String eventID, String eventType, int bookingCapacity);
  String removeEvent (String eventID, String eventType);
  String listEventAvailability (String eventType);
  String bookEvent (String customerID, String eventID, String eventType);
  String getBookingSchedule (String customerID);
  String cancelEvent (String customerID, String eventType, String eventID);
  String swapEvent (String customerID, String newEventID, String newEventType, String oldEventID, String oldEventType);
} // interface Server_interfaceOperations
