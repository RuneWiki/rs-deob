import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class691 {
   @OriginalMember(
      owner = "client!dca",
      name = "c",
      descriptor = "I"
   )
   private int field10153 = 2;
   @OriginalMember(
      owner = "client!dca",
      name = "i",
      descriptor = "[I"
   )
   private int[] field10155 = new int[2];
   @OriginalMember(
      owner = "client!dca",
      name = "a",
      descriptor = "[I"
   )
   private int[] field10150 = new int[2];
   @OriginalMember(
      owner = "client!dca",
      name = "j",
      descriptor = "I"
   )
   public int field10151;
   @OriginalMember(
      owner = "client!dca",
      name = "k",
      descriptor = "I"
   )
   public int field10152;
   @OriginalMember(
      owner = "client!dca",
      name = "h",
      descriptor = "I"
   )
   public int field10154;
   @OriginalMember(
      owner = "client!dca",
      name = "g",
      descriptor = "I"
   )
   private int field10156;
   @OriginalMember(
      owner = "client!dca",
      name = "e",
      descriptor = "I"
   )
   private int field10157;
   @OriginalMember(
      owner = "client!dca",
      name = "d",
      descriptor = "I"
   )
   private int field10158;
   @OriginalMember(
      owner = "client!dca",
      name = "f",
      descriptor = "I"
   )
   private int field10159;
   @OriginalMember(
      owner = "client!dca",
      name = "b",
      descriptor = "I"
   )
   private int field10160;

   @OriginalMember(
      owner = "client!dca",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method5044(int arg0) {
      if (this.field10160 >= this.field10157) {
         this.field10158 = this.field10150[this.field10159++] << 15;
         if (this.field10159 >= this.field10153) {
            this.field10159 = this.field10153 - 1;
         }

         this.field10157 = (int)((double)this.field10155[this.field10159] / 65536.0D * (double)arg0);
         if (this.field10157 > this.field10160) {
            this.field10156 = ((this.field10150[this.field10159] << 15) - this.field10158) / (this.field10157 - this.field10160);
         }
      }

      this.field10158 += this.field10156;
      ++this.field10160;
      return this.field10158 - this.field10156 >> 15;
   }

   @OriginalMember(
      owner = "client!dca",
      name = "a",
      descriptor = "(Lgea;)V"
   )
   public final void method5045(class66 arg0) {
      this.field10153 = arg0.method640(255);
      this.field10155 = new int[this.field10153];
      this.field10150 = new int[this.field10153];

      for(int var2 = 0; var2 < this.field10153; ++var2) {
         this.field10155[var2] = arg0.method603(-2);
         this.field10150[var2] = arg0.method603(-2);
      }

   }

   @OriginalMember(
      owner = "client!dca",
      name = "b",
      descriptor = "(Lgea;)V"
   )
   public final void method5046(class66 arg0) {
      this.field10152 = arg0.method640(255);
      this.field10151 = arg0.method610(8);
      this.field10154 = arg0.method610(123);
      this.method5045(arg0);
   }

   @OriginalMember(
      owner = "client!dca",
      name = "<init>",
      descriptor = "()V"
   )
   public class691() {
      this.field10155[0] = 0;
      this.field10155[1] = 65535;
      this.field10150[0] = 0;
      this.field10150[1] = 65535;
   }

   @OriginalMember(
      owner = "client!dca",
      name = "a",
      descriptor = "()V"
   )
   public final void method5047() {
      this.field10157 = 0;
      this.field10159 = 0;
      this.field10156 = 0;
      this.field10158 = 0;
      this.field10160 = 0;
   }
}
