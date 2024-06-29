import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class269 {
   @OriginalMember(
      owner = "client!nga",
      name = "c",
      descriptor = "I"
   )
   public int field3437;
   @OriginalMember(
      owner = "client!nga",
      name = "b",
      descriptor = "I"
   )
   public int field3439;
   @OriginalMember(
      owner = "client!nga",
      name = "d",
      descriptor = "[I"
   )
   public int[] field3438;
   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "[I"
   )
   public int[] field3440;

   @OriginalMember(
      owner = "client!nga",
      name = "<init>",
      descriptor = "()V"
   )
   public class269() {
      class672.method4914(16);
      this.field3437 = class672.method4919() != 0 ? class672.method4914(4) + 1 : 1;
      if (class672.method4919() != 0) {
         class672.method4914(8);
      }

      class672.method4914(2);
      if (this.field3437 > 1) {
         this.field3439 = class672.method4914(4);
      }

      this.field3438 = new int[this.field3437];
      this.field3440 = new int[this.field3437];

      for(int var1 = 0; var1 < this.field3437; ++var1) {
         class672.method4914(8);
         this.field3438[var1] = class672.method4914(8);
         this.field3440[var1] = class672.method4914(8);
      }

   }
}
