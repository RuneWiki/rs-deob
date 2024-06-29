import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class297 {
   @OriginalMember(
      owner = "client!sm",
      name = "i",
      descriptor = "I"
   )
   private int field4123 = 2;
   @OriginalMember(
      owner = "client!sm",
      name = "b",
      descriptor = "[I"
   )
   private int[] field4121 = new int[2];
   @OriginalMember(
      owner = "client!sm",
      name = "g",
      descriptor = "[I"
   )
   private int[] field4122 = new int[2];
   @OriginalMember(
      owner = "client!sm",
      name = "h",
      descriptor = "I"
   )
   public int field4118;
   @OriginalMember(
      owner = "client!sm",
      name = "e",
      descriptor = "I"
   )
   public int field4119;
   @OriginalMember(
      owner = "client!sm",
      name = "d",
      descriptor = "I"
   )
   public int field4120;
   @OriginalMember(
      owner = "client!sm",
      name = "f",
      descriptor = "I"
   )
   private int field4124;
   @OriginalMember(
      owner = "client!sm",
      name = "c",
      descriptor = "I"
   )
   private int field4125;
   @OriginalMember(
      owner = "client!sm",
      name = "j",
      descriptor = "I"
   )
   private int field4126;
   @OriginalMember(
      owner = "client!sm",
      name = "k",
      descriptor = "I"
   )
   private int field4127;
   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "I"
   )
   private int field4128;

   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "()V",
      line = 3
   )
   public final void method2258() {
      this.field4126 = 0;
      this.field4128 = 0;
      this.field4124 = 0;
      this.field4125 = 0;
      this.field4127 = 0;
   }

   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "(Ljj;)V",
      line = 15
   )
   public final void method2259(class128 arg0) {
      this.field4120 = arg0.method1104(255);
      this.field4119 = arg0.method1041(4758);
      this.field4118 = arg0.method1041(4758);
      this.method2261(arg0);
   }

   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "(I)I",
      line = 23
   )
   public final int method2260(int arg0) {
      if (this.field4127 >= this.field4126) {
         this.field4125 = this.field4122[this.field4128++] << 15;
         if (this.field4128 >= this.field4123) {
            this.field4128 = this.field4123 - 1;
         }

         this.field4126 = (int)((double)this.field4121[this.field4128] / 65536.0D * (double)arg0);
         if (this.field4126 > this.field4127) {
            this.field4124 = ((this.field4122[this.field4128] << 15) - this.field4125) / (this.field4126 - this.field4127);
         }
      }

      this.field4125 += this.field4124;
      ++this.field4127;
      return this.field4125 - this.field4124 >> 15;
   }

   @OriginalMember(
      owner = "client!sm",
      name = "b",
      descriptor = "(Ljj;)V",
      line = 40
   )
   public final void method2261(class128 arg0) {
      this.field4123 = arg0.method1104(255);
      this.field4121 = new int[this.field4123];
      this.field4122 = new int[this.field4123];

      for(int var2 = 0; var2 < this.field4123; ++var2) {
         this.field4121[var2] = arg0.method1038((byte)-115);
         this.field4122[var2] = arg0.method1038((byte)-120);
      }

   }

   @OriginalMember(
      owner = "client!sm",
      name = "<init>",
      descriptor = "()V",
      line = 56
   )
   public class297() {
      this.field4121[0] = 0;
      this.field4121[1] = 65535;
      this.field4122[0] = 0;
      this.field4122[1] = 65535;
   }
}
