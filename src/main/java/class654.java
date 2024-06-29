import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class654 {
   @OriginalMember(
      owner = "client!eb",
      name = "e",
      descriptor = "I"
   )
   private int field9576 = class332.method2461(16);
   @OriginalMember(
      owner = "client!eb",
      name = "c",
      descriptor = "I"
   )
   private int field9581 = class332.method2461(24);
   @OriginalMember(
      owner = "client!eb",
      name = "b",
      descriptor = "I"
   )
   private int field9578 = class332.method2461(24);
   @OriginalMember(
      owner = "client!eb",
      name = "d",
      descriptor = "I"
   )
   private int field9582 = class332.method2461(24) + 1;
   @OriginalMember(
      owner = "client!eb",
      name = "g",
      descriptor = "I"
   )
   private int field9577 = class332.method2461(6) + 1;
   @OriginalMember(
      owner = "client!eb",
      name = "f",
      descriptor = "I"
   )
   private int field9579 = class332.method2461(8);
   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "[I"
   )
   private int[] field9580;

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "([FIZ)V"
   )
   public final void method4796(float[] arg0, int arg1, boolean arg2) {
      for(int var4 = 0; var4 < arg1; ++var4) {
         arg0[var4] = 0.0F;
      }

      if (!arg2) {
         int var5 = class332.field4514[this.field9579].field1191;
         int var6 = this.field9578 - this.field9581;
         int var7 = var6 / this.field9582;
         int[] var8 = new int[var7];

         for(int var9 = 0; var9 < 8; ++var9) {
            int var10 = 0;

            while(var10 < var7) {
               if (var9 == 0) {
                  int var11 = class332.field4514[this.field9579].method793();

                  for(int var12 = var5 - 1; var12 >= 0; --var12) {
                     if (var10 + var12 < var7) {
                        var8[var10 + var12] = var11 % this.field9577;
                     }

                     var11 /= this.field9577;
                  }
               }

               for(int var13 = 0; var13 < var5; ++var13) {
                  int var14 = var8[var10];
                  int var15 = this.field9580[var14 * 8 + var9];
                  if (var15 >= 0) {
                     int var16 = this.field9582 * var10 + this.field9581;
                     class91 var17 = class332.field4514[var15];
                     if (this.field9576 == 0) {
                        int var18 = this.field9582 / var17.field1191;

                        for(int var19 = 0; var19 < var18; ++var19) {
                           float[] var20 = var17.method794();

                           for(int var21 = 0; var21 < var17.field1191; ++var21) {
                              arg0[var18 * var21 + var16 + var19] += var20[var21];
                           }
                        }
                     } else {
                        int var22 = 0;

                        while(var22 < this.field9582) {
                           float[] var23 = var17.method794();

                           for(int var24 = 0; var24 < var17.field1191; ++var24) {
                              arg0[var16 + var22] += var23[var24];
                              ++var22;
                           }
                        }
                     }
                  }

                  ++var10;
                  if (var10 >= var7) {
                     break;
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "<init>",
      descriptor = "()V"
   )
   public class654() {
      int[] var1 = new int[this.field9577];

      for(int var2 = 0; var2 < this.field9577; ++var2) {
         int var4 = 0;
         int var5 = class332.method2461(3);
         boolean var6 = class332.method2453() != 0;
         if (var6) {
            var4 = class332.method2461(5);
         }

         var1[var2] = var4 << 3 | var5;
      }

      this.field9580 = new int[this.field9577 * 8];

      for(int var3 = 0; var3 < this.field9577 * 8; ++var3) {
         this.field9580[var3] = (var1[var3 >> 3] & 1 << (var3 & 7)) != 0 ? class332.method2461(8) : -1;
      }

   }
}
