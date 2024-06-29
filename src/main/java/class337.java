import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public interface class337 {
   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "(ZILjava/awt/Component;I)V"
   )
   void method2244(boolean arg0, int arg1, Component arg2, int arg3) throws Exception;

   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "(ZI)V"
   )
   void method2247(boolean arg0, int arg1);

   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "(IB)V"
   )
   void method2246(int arg0, byte arg1);

   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "(IBI)V"
   )
   void method2249(int arg0, byte arg1, int arg2) throws Exception;

   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "(I[I)V"
   )
   void method2248(int arg0, int[] arg1);

   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "(BI)I"
   )
   int method2245(byte arg0, int arg1);
}
