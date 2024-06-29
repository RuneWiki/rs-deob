import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class521 extends class342 {
   @OriginalMember(
      owner = "client!gb",
      name = "q",
      descriptor = "I"
   )
   public int field7318;
   @OriginalMember(
      owner = "client!gb",
      name = "m",
      descriptor = "[B"
   )
   public byte[] field7317;
   @OriginalMember(
      owner = "client!gb",
      name = "n",
      descriptor = "I"
   )
   public int field7319;
   @OriginalMember(
      owner = "client!gb",
      name = "o",
      descriptor = "I"
   )
   public int field7320;
   @OriginalMember(
      owner = "client!gb",
      name = "p",
      descriptor = "Z"
   )
   public boolean field7316;

   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "(Lul;)Lgb;"
   )
   public final class521 method3910(class491 arg0) {
      this.field7317 = arg0.method3735(this.field7317, false);
      this.field7318 = arg0.method3733(this.field7318, true);
      if (this.field7320 == this.field7319) {
         this.field7319 = this.field7320 = arg0.method3732(29558, this.field7319);
      } else {
         this.field7319 = arg0.method3732(29558, this.field7319);
         this.field7320 = arg0.method3732(29558, this.field7320);
         if (this.field7320 == this.field7319) {
            --this.field7319;
         }
      }

      return this;
   }

   @OriginalMember(
      owner = "client!gb",
      name = "<init>",
      descriptor = "(I[BII)V"
   )
   public class521(int arg0, byte[] arg1, int arg2, int arg3) {
      this.field7318 = arg0;
      this.field7317 = arg1;
      this.field7319 = arg2;
      this.field7320 = arg3;
   }

   @OriginalMember(
      owner = "client!gb",
      name = "<init>",
      descriptor = "(I[BIIZ)V"
   )
   public class521(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
      this.field7318 = arg0;
      this.field7317 = arg1;
      this.field7319 = arg2;
      this.field7320 = arg3;
      this.field7316 = arg4;
   }
}
