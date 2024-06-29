import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class765 {
   @OriginalMember(
      owner = "client!fm",
      name = "b",
      descriptor = "I"
   )
   private int field11233 = class116.method967(16);
   @OriginalMember(
      owner = "client!fm",
      name = "c",
      descriptor = "I"
   )
   private int field11236 = class116.method967(24);
   @OriginalMember(
      owner = "client!fm",
      name = "g",
      descriptor = "I"
   )
   private int field11232 = class116.method967(24);
   @OriginalMember(
      owner = "client!fm",
      name = "d",
      descriptor = "I"
   )
   private int field11234 = class116.method967(24) + 1;
   @OriginalMember(
      owner = "client!fm",
      name = "f",
      descriptor = "I"
   )
   private int field11235 = class116.method967(6) + 1;
   @OriginalMember(
      owner = "client!fm",
      name = "e",
      descriptor = "I"
   )
   private int field11237 = class116.method967(8);
   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "[I"
   )
   private int[] field11231;

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "([FIZ)V",
      line = 12
   )
   public final void method5541(float[] arg0, int arg1, boolean arg2) {
      for(int var4 = 0; var4 < arg1; ++var4) {
         arg0[var4] = 0.0F;
      }

      if (!arg2) {
         int var5 = class116.field1405[this.field11237].field10522;
         int var6 = this.field11232 - this.field11236;
         int var7 = var6 / this.field11234;
         int[] var8 = new int[var7];

         for(int var9 = 0; var9 < 8; ++var9) {
            int var10 = 0;

            while(var10 < var7) {
               if (var9 == 0) {
                  int var11 = class116.field1405[this.field11237].method5113();

                  for(int var12 = var5 - 1; var12 >= 0; --var12) {
                     if (var10 + var12 < var7) {
                        var8[var10 + var12] = var11 % this.field11235;
                     }

                     var11 /= this.field11235;
                  }
               }

               for(int var13 = 0; var13 < var5; ++var13) {
                  int var14 = var8[var10];
                  int var15 = this.field11231[var14 * 8 + var9];
                  if (var15 >= 0) {
                     int var16 = this.field11234 * var10 + this.field11236;
                     class702 var17 = class116.field1405[var15];
                     if (this.field11233 == 0) {
                        int var18 = this.field11234 / var17.field10522;

                        for(int var19 = 0; var19 < var18; ++var19) {
                           float[] var20 = var17.method5112();

                           for(int var21 = 0; var21 < var17.field10522; ++var21) {
                              arg0[var18 * var21 + var16 + var19] += var20[var21];
                           }
                        }
                     } else {
                        int var22 = 0;

                        while(var22 < this.field11234) {
                           float[] var23 = var17.method5112();

                           for(int var24 = 0; var24 < var17.field10522; ++var24) {
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
      owner = "client!fm",
      name = "<init>",
      descriptor = "()V",
      line = 133
   )
   public class765() {
      int[] var1 = new int[this.field11235];

      for(int var2 = 0; var2 < this.field11235; ++var2) {
         int var4 = 0;
         int var5 = class116.method967(3);
         boolean var6 = class116.method969() != 0;
         if (var6) {
            var4 = class116.method967(5);
         }

         var1[var2] = var4 << 3 | var5;
      }

      this.field11231 = new int[this.field11235 * 8];

      for(int var3 = 0; var3 < this.field11235 * 8; ++var3) {
         this.field11231[var3] = (var1[var3 >> 3] & 1 << (var3 & 7)) != 0 ? class116.method967(8) : -1;
      }

   }
}
