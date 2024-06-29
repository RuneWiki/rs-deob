import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class261 {
   @OriginalMember(
      owner = "client!rb",
      name = "a",
      descriptor = "I"
   )
   private int field3317 = class672.method4914(16);
   @OriginalMember(
      owner = "client!rb",
      name = "d",
      descriptor = "I"
   )
   private int field3316 = class672.method4914(24);
   @OriginalMember(
      owner = "client!rb",
      name = "g",
      descriptor = "I"
   )
   private int field3314 = class672.method4914(24);
   @OriginalMember(
      owner = "client!rb",
      name = "b",
      descriptor = "I"
   )
   private int field3311 = class672.method4914(24) + 1;
   @OriginalMember(
      owner = "client!rb",
      name = "f",
      descriptor = "I"
   )
   private int field3312 = class672.method4914(6) + 1;
   @OriginalMember(
      owner = "client!rb",
      name = "e",
      descriptor = "I"
   )
   private int field3315 = class672.method4914(8);
   @OriginalMember(
      owner = "client!rb",
      name = "c",
      descriptor = "[I"
   )
   private int[] field3313;

   @OriginalMember(
      owner = "client!rb",
      name = "a",
      descriptor = "([FIZ)V"
   )
   public final void method2097(float[] arg0, int arg1, boolean arg2) {
      for(int var4 = 0; var4 < arg1; ++var4) {
         arg0[var4] = 0.0F;
      }

      if (!arg2) {
         int var5 = class672.field9937[this.field3315].field8060;
         int var6 = this.field3314 - this.field3316;
         int var7 = var6 / this.field3311;
         int[] var8 = new int[var7];

         for(int var9 = 0; var9 < 8; ++var9) {
            int var10 = 0;

            while(var10 < var7) {
               if (var9 == 0) {
                  int var11 = class672.field9937[this.field3315].method4146();

                  for(int var12 = var5 - 1; var12 >= 0; --var12) {
                     if (var10 + var12 < var7) {
                        var8[var10 + var12] = var11 % this.field3312;
                     }

                     var11 /= this.field3312;
                  }
               }

               for(int var13 = 0; var13 < var5; ++var13) {
                  int var14 = var8[var10];
                  int var15 = this.field3313[var14 * 8 + var9];
                  if (var15 >= 0) {
                     int var16 = this.field3311 * var10 + this.field3316;
                     class547 var17 = class672.field9937[var15];
                     if (this.field3317 == 0) {
                        int var18 = this.field3311 / var17.field8060;

                        for(int var19 = 0; var19 < var18; ++var19) {
                           float[] var20 = var17.method4145();

                           for(int var21 = 0; var21 < var17.field8060; ++var21) {
                              arg0[var18 * var21 + var16 + var19] += var20[var21];
                           }
                        }
                     } else {
                        int var22 = 0;

                        while(var22 < this.field3311) {
                           float[] var23 = var17.method4145();

                           for(int var24 = 0; var24 < var17.field8060; ++var24) {
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
      owner = "client!rb",
      name = "<init>",
      descriptor = "()V"
   )
   public class261() {
      int[] var1 = new int[this.field3312];

      for(int var2 = 0; var2 < this.field3312; ++var2) {
         int var4 = 0;
         int var5 = class672.method4914(3);
         boolean var6 = class672.method4919() != 0;
         if (var6) {
            var4 = class672.method4914(5);
         }

         var1[var2] = var4 << 3 | var5;
      }

      this.field3313 = new int[this.field3312 * 8];

      for(int var3 = 0; var3 < this.field3312 * 8; ++var3) {
         this.field3313[var3] = (var1[var3 >> 3] & 1 << (var3 & 7)) != 0 ? class672.method4914(8) : -1;
      }

   }
}
