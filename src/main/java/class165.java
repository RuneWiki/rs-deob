import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class165 {
   @OriginalMember(
      owner = "client!wea",
      name = "i",
      descriptor = "I"
   )
   private int field2610 = 2;
   @OriginalMember(
      owner = "client!wea",
      name = "c",
      descriptor = "[I"
   )
   private int[] field2607 = new int[2];
   @OriginalMember(
      owner = "client!wea",
      name = "b",
      descriptor = "[I"
   )
   private int[] field2609 = new int[2];
   @OriginalMember(
      owner = "client!wea",
      name = "f",
      descriptor = "I"
   )
   public int field2605;
   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "I"
   )
   public int field2606;
   @OriginalMember(
      owner = "client!wea",
      name = "k",
      descriptor = "I"
   )
   public int field2608;
   @OriginalMember(
      owner = "client!wea",
      name = "j",
      descriptor = "I"
   )
   private int field2611;
   @OriginalMember(
      owner = "client!wea",
      name = "e",
      descriptor = "I"
   )
   private int field2612;
   @OriginalMember(
      owner = "client!wea",
      name = "g",
      descriptor = "I"
   )
   private int field2613;
   @OriginalMember(
      owner = "client!wea",
      name = "d",
      descriptor = "I"
   )
   private int field2614;
   @OriginalMember(
      owner = "client!wea",
      name = "h",
      descriptor = "I"
   )
   private int field2615;

   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "()V"
   )
   public final void method1501() {
      this.field2611 = 0;
      this.field2612 = 0;
      this.field2613 = 0;
      this.field2614 = 0;
      this.field2615 = 0;
   }

   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1502(int arg0) {
      if (this.field2615 >= this.field2611) {
         this.field2614 = this.field2609[this.field2612++] << 15;
         if (this.field2612 >= this.field2610) {
            this.field2612 = this.field2610 - 1;
         }

         this.field2611 = (int)((double)this.field2607[this.field2612] / 65536.0D * (double)arg0);
         if (this.field2611 > this.field2615) {
            this.field2613 = ((this.field2609[this.field2612] << 15) - this.field2614) / (this.field2611 - this.field2615);
         }
      }

      this.field2614 += this.field2613;
      ++this.field2615;
      return this.field2614 - this.field2613 >> 15;
   }

   @OriginalMember(
      owner = "client!wea",
      name = "b",
      descriptor = "(Luda;)V"
   )
   public final void method1503(class473 arg0) {
      this.field2606 = arg0.method3564((byte)-112);
      this.field2608 = arg0.method3567(31871);
      this.field2605 = arg0.method3567(31871);
      this.method1504(arg0);
   }

   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "(Luda;)V"
   )
   public final void method1504(class473 arg0) {
      this.field2610 = arg0.method3564((byte)-127);
      this.field2607 = new int[this.field2610];
      this.field2609 = new int[this.field2610];

      for(int var2 = 0; var2 < this.field2610; ++var2) {
         this.field2607[var2] = arg0.method3565(true);
         this.field2609[var2] = arg0.method3565(true);
      }

   }

   @OriginalMember(
      owner = "client!wea",
      name = "<init>",
      descriptor = "()V"
   )
   public class165() {
      this.field2607[0] = 0;
      this.field2607[1] = 65535;
      this.field2609[0] = 0;
      this.field2609[1] = 65535;
   }
}
