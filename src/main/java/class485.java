import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public interface class485 {
   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(I)J"
   )
   long method3516(int arg0);

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(Z)I"
   )
   int method3517(boolean arg0);

   @OriginalMember(
      owner = "client!wr",
      name = "b",
      descriptor = "(I)I"
   )
   int method3518(int arg0);

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(II[BZ)V"
   )
   void method3519(int arg0, int arg1, byte[] arg2, boolean arg3);
}
