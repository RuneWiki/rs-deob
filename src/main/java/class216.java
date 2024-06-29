import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public interface class216 {
   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(II)I"
   )
   int method1871(int arg0, int arg1);

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(IB)V"
   )
   void method1872(int arg0, byte arg1);

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(BI)V"
   )
   void method1873(byte arg0, int arg1);

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(IIZLjava/awt/Component;)V"
   )
   void method1874(int arg0, int arg1, boolean arg2, Component arg3) throws Exception;

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(I[I)V"
   )
   void method1875(int arg0, int[] arg1);

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(IBI)V"
   )
   void method1876(int arg0, byte arg1, int arg2) throws Exception;
}
