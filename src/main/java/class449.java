import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class449 {
   @OriginalMember(
      owner = "client!hea",
      name = "b",
      descriptor = "I"
   )
   private int field6376 = 2;
   @OriginalMember(
      owner = "client!hea",
      name = "f",
      descriptor = "[I"
   )
   private int[] field6374 = new int[2];
   @OriginalMember(
      owner = "client!hea",
      name = "a",
      descriptor = "[I"
   )
   private int[] field6377 = new int[2];
   @OriginalMember(
      owner = "client!hea",
      name = "i",
      descriptor = "I"
   )
   public int field6375;
   @OriginalMember(
      owner = "client!hea",
      name = "h",
      descriptor = "I"
   )
   public int field6378;
   @OriginalMember(
      owner = "client!hea",
      name = "e",
      descriptor = "I"
   )
   public int field6379;
   @OriginalMember(
      owner = "client!hea",
      name = "d",
      descriptor = "I"
   )
   private int field6380;
   @OriginalMember(
      owner = "client!hea",
      name = "g",
      descriptor = "I"
   )
   private int field6381;
   @OriginalMember(
      owner = "client!hea",
      name = "c",
      descriptor = "I"
   )
   private int field6382;
   @OriginalMember(
      owner = "client!hea",
      name = "j",
      descriptor = "I"
   )
   private int field6383;
   @OriginalMember(
      owner = "client!hea",
      name = "k",
      descriptor = "I"
   )
   private int field6384;

   @OriginalMember(
      owner = "client!hea",
      name = "b",
      descriptor = "(Lwf;)V",
      line = 3
   )
   public final void method3284(class147 arg0) {
      this.field6379 = arg0.method1143(-15465);
      this.field6375 = arg0.method1164(19693);
      this.field6378 = arg0.method1164(19693);
      this.method3286(arg0);
   }

   @OriginalMember(
      owner = "client!hea",
      name = "a",
      descriptor = "(I)I",
      line = 13
   )
   public final int method3285(int arg0) {
      if (this.field6384 >= this.field6383) {
         this.field6382 = this.field6377[this.field6381++] << 15;
         if (this.field6381 >= this.field6376) {
            this.field6381 = this.field6376 - 1;
         }

         this.field6383 = (int)((double)this.field6374[this.field6381] / 65536.0D * (double)arg0);
         if (this.field6383 > this.field6384) {
            this.field6380 = ((this.field6377[this.field6381] << 15) - this.field6382) / (this.field6383 - this.field6384);
         }
      }

      this.field6382 += this.field6380;
      ++this.field6384;
      return this.field6382 - this.field6380 >> 15;
   }

   @OriginalMember(
      owner = "client!hea",
      name = "a",
      descriptor = "(Lwf;)V",
      line = 32
   )
   public final void method3286(class147 arg0) {
      this.field6376 = arg0.method1143(-15465);
      this.field6374 = new int[this.field6376];
      this.field6377 = new int[this.field6376];

      for(int var2 = 0; var2 < this.field6376; ++var2) {
         this.field6374[var2] = arg0.method1211(-26166);
         this.field6377[var2] = arg0.method1211(-26166);
      }

   }

   @OriginalMember(
      owner = "client!hea",
      name = "a",
      descriptor = "()V",
      line = 48
   )
   public final void method3287() {
      this.field6383 = 0;
      this.field6381 = 0;
      this.field6380 = 0;
      this.field6382 = 0;
      this.field6384 = 0;
   }

   @OriginalMember(
      owner = "client!hea",
      name = "<init>",
      descriptor = "()V",
      line = 55
   )
   public class449() {
      this.field6374[0] = 0;
      this.field6374[1] = 65535;
      this.field6377[0] = 0;
      this.field6377[1] = 65535;
   }
}
