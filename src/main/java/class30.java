import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class30 {
   @OriginalMember(
      owner = "client!uc",
      name = "c",
      descriptor = "I"
   )
   public static int field436 = 0;
   @OriginalMember(
      owner = "client!uc",
      name = "b",
      descriptor = "I"
   )
   public static int field437 = -1;
   @OriginalMember(
      owner = "client!uc",
      name = "a",
      descriptor = "I"
   )
   public static int field435;

   @OriginalMember(
      owner = "client!uc",
      name = "a",
      descriptor = "(III)Lsv;"
   )
   public static final class688 method271(int arg0, int arg1, int arg2) {
      class517 var3 = class663.field9659[arg0][arg1][arg2];
      return var3 == null ? null : var3.field7469;
   }
}
