import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eka")
public class class763 {
   @OriginalMember(
      owner = "client!eka",
      name = "e",
      descriptor = "I"
   )
   private int field11287 = 2;
   @OriginalMember(
      owner = "client!eka",
      name = "b",
      descriptor = "[I"
   )
   private int[] field11286 = new int[2];
   @OriginalMember(
      owner = "client!eka",
      name = "a",
      descriptor = "[I"
   )
   private int[] field11291 = new int[2];
   @OriginalMember(
      owner = "client!eka",
      name = "j",
      descriptor = "I"
   )
   public int field11288;
   @OriginalMember(
      owner = "client!eka",
      name = "h",
      descriptor = "I"
   )
   public int field11289;
   @OriginalMember(
      owner = "client!eka",
      name = "k",
      descriptor = "I"
   )
   public int field11290;
   @OriginalMember(
      owner = "client!eka",
      name = "c",
      descriptor = "I"
   )
   private int field11292;
   @OriginalMember(
      owner = "client!eka",
      name = "g",
      descriptor = "I"
   )
   private int field11293;
   @OriginalMember(
      owner = "client!eka",
      name = "i",
      descriptor = "I"
   )
   private int field11294;
   @OriginalMember(
      owner = "client!eka",
      name = "d",
      descriptor = "I"
   )
   private int field11295;
   @OriginalMember(
      owner = "client!eka",
      name = "f",
      descriptor = "I"
   )
   private int field11296;

   @OriginalMember(
      owner = "client!eka",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method5589(int arg0) {
      if (this.field11294 >= this.field11295) {
         this.field11296 = this.field11291[this.field11292++] << 15;
         if (this.field11292 >= this.field11287) {
            this.field11292 = this.field11287 - 1;
         }

         this.field11295 = (int)((double)this.field11286[this.field11292] / 65536.0D * (double)arg0);
         if (this.field11295 > this.field11294) {
            this.field11293 = ((this.field11291[this.field11292] << 15) - this.field11296) / (this.field11295 - this.field11294);
         }
      }

      this.field11296 += this.field11293;
      ++this.field11294;
      return this.field11296 - this.field11293 >> 15;
   }

   @OriginalMember(
      owner = "client!eka",
      name = "b",
      descriptor = "(Lica;)V"
   )
   public final void method5590(class354 arg0) {
      this.field11287 = arg0.method2855(-31007);
      this.field11286 = new int[this.field11287];
      this.field11291 = new int[this.field11287];

      for(int var2 = 0; var2 < this.field11287; ++var2) {
         this.field11286[var2] = arg0.method2848(-95);
         this.field11291[var2] = arg0.method2848(-126);
      }

   }

   @OriginalMember(
      owner = "client!eka",
      name = "a",
      descriptor = "()V"
   )
   public final void method5591() {
      this.field11295 = 0;
      this.field11292 = 0;
      this.field11293 = 0;
      this.field11296 = 0;
      this.field11294 = 0;
   }

   @OriginalMember(
      owner = "client!eka",
      name = "a",
      descriptor = "(Lica;)V"
   )
   public final void method5592(class354 arg0) {
      this.field11288 = arg0.method2855(-31007);
      this.field11290 = arg0.method2894(118);
      this.field11289 = arg0.method2894(112);
      this.method5590(arg0);
   }

   @OriginalMember(
      owner = "client!eka",
      name = "<init>",
      descriptor = "()V"
   )
   public class763() {
      this.field11286[0] = 0;
      this.field11286[1] = 65535;
      this.field11291[0] = 0;
      this.field11291[1] = 65535;
   }
}
