import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public interface class83 {
   @OriginalMember(
      owner = "client!lp",
      name = "a",
      descriptor = "(B)I"
   )
   int method800(byte arg0);

   @OriginalMember(
      owner = "client!lp",
      name = "b",
      descriptor = "(I)I"
   )
   int method801(int arg0);

   @OriginalMember(
      owner = "client!lp",
      name = "a",
      descriptor = "(I)J"
   )
   long method802(int arg0);

   @OriginalMember(
      owner = "client!lp",
      name = "a",
      descriptor = "(III[B)V"
   )
   void method803(int arg0, int arg1, int arg2, byte[] arg3);
}
