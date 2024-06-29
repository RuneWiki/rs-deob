import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class488 extends class670 {
   @OriginalMember(
      owner = "client!wb",
      name = "u",
      descriptor = "I"
   )
   public int field7411;
   @OriginalMember(
      owner = "client!wb",
      name = "r",
      descriptor = "I"
   )
   public int field7412;
   @OriginalMember(
      owner = "client!wb",
      name = "q",
      descriptor = "I"
   )
   public int field7414;
   @OriginalMember(
      owner = "client!wb",
      name = "s",
      descriptor = "I"
   )
   public int field7415;
   @OriginalMember(
      owner = "client!wb",
      name = "t",
      descriptor = "J"
   )
   public long field7413;

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "(I)I",
      line = 5
   )
   public final int method3789(int arg0) {
      if (arg0 > -31) {
         this.field7415 = -80;
      }

      return this.field7412;
   }

   @OriginalMember(
      owner = "client!wb",
      name = "c",
      descriptor = "(I)I",
      line = 16
   )
   public final int method3790(int arg0) {
      if (arg0 != 8) {
         this.method3789(32);
      }

      return this.field7411;
   }

   @OriginalMember(
      owner = "client!wb",
      name = "c",
      descriptor = "(B)J",
      line = 27
   )
   public final long method3791(byte arg0) {
      if (arg0 >= -21) {
         this.method3793(101);
      }

      return this.field7413;
   }

   @OriginalMember(
      owner = "client!wb",
      name = "b",
      descriptor = "(B)I",
      line = 38
   )
   public final int method3792(byte arg0) {
      return arg0 <= 97 ? 97 : this.field7414;
   }

   @OriginalMember(
      owner = "client!wb",
      name = "b",
      descriptor = "(I)I",
      line = 51
   )
   public final int method3793(int arg0) {
      if (arg0 != 1) {
         this.method3790(120);
      }

      return this.field7415;
   }
}
