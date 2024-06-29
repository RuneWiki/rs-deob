import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public interface class516 {
   @OriginalMember(
      owner = "client!uba",
      name = "a",
      descriptor = "(III[B)V"
   )
   void method1402(int arg0, int arg1, int arg2, byte[] arg3);

   @OriginalMember(
      owner = "client!uba",
      name = "b",
      descriptor = "(I)I"
   )
   int method1397(int arg0);

   @OriginalMember(
      owner = "client!uba",
      name = "a",
      descriptor = "(Z)I"
   )
   int method1399(boolean arg0);

   @OriginalMember(
      owner = "client!uba",
      name = "a",
      descriptor = "(I)J"
   )
   long method1396(int arg0);
}
