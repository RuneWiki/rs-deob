import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public interface class126 {
   @OriginalMember(
      owner = "client!lfa",
      name = "a",
      descriptor = "(B)I"
   )
   int method1008(byte arg0);

   @OriginalMember(
      owner = "client!lfa",
      name = "a",
      descriptor = "(I)I"
   )
   int method1009(int arg0);

   @OriginalMember(
      owner = "client!lfa",
      name = "a",
      descriptor = "(BI[BI)V"
   )
   void method1010(byte arg0, int arg1, byte[] arg2, int arg3);

   @OriginalMember(
      owner = "client!lfa",
      name = "b",
      descriptor = "(B)J"
   )
   long method1011(byte arg0);
}
