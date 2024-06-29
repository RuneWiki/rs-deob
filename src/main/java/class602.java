import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class602 {
   @OriginalMember(
      owner = "client!iu",
      name = "c",
      descriptor = "I"
   )
   private int field8686 = class214.method1824(16);
   @OriginalMember(
      owner = "client!iu",
      name = "d",
      descriptor = "I"
   )
   private int field8683 = class214.method1824(24);
   @OriginalMember(
      owner = "client!iu",
      name = "e",
      descriptor = "I"
   )
   private int field8687 = class214.method1824(24);
   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "I"
   )
   private int field8684 = class214.method1824(24) + 1;
   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "I"
   )
   private int field8688 = class214.method1824(6) + 1;
   @OriginalMember(
      owner = "client!iu",
      name = "g",
      descriptor = "I"
   )
   private int field8689 = class214.method1824(8);
   @OriginalMember(
      owner = "client!iu",
      name = "f",
      descriptor = "[I"
   )
   private int[] field8685;

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "([FIZ)V"
   )
   public final void method4444(float[] arg0, int arg1, boolean arg2) {
      for(int var4 = 0; var4 < arg1; ++var4) {
         arg0[var4] = 0.0F;
      }

      if (!arg2) {
         int var5 = class214.field3208[this.field8689].field3338;
         int var6 = this.field8687 - this.field8683;
         int var7 = var6 / this.field8684;
         int[] var8 = new int[var7];

         for(int var9 = 0; var9 < 8; ++var9) {
            int var10 = 0;

            while(var10 < var7) {
               if (var9 == 0) {
                  int var11 = class214.field3208[this.field8689].method1882();

                  for(int var12 = var5 - 1; var12 >= 0; --var12) {
                     if (var10 + var12 < var7) {
                        var8[var10 + var12] = var11 % this.field8688;
                     }

                     var11 /= this.field8688;
                  }
               }

               for(int var13 = 0; var13 < var5; ++var13) {
                  int var14 = var8[var10];
                  int var15 = this.field8685[var14 * 8 + var9];
                  if (var15 >= 0) {
                     int var16 = this.field8684 * var10 + this.field8683;
                     class225 var17 = class214.field3208[var15];
                     if (this.field8686 == 0) {
                        int var18 = this.field8684 / var17.field3338;

                        for(int var19 = 0; var19 < var18; ++var19) {
                           float[] var20 = var17.method1881();

                           for(int var21 = 0; var21 < var17.field3338; ++var21) {
                              arg0[var18 * var21 + var16 + var19] += var20[var21];
                           }
                        }
                     } else {
                        int var22 = 0;

                        while(var22 < this.field8684) {
                           float[] var23 = var17.method1881();

                           for(int var24 = 0; var24 < var17.field3338; ++var24) {
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
      owner = "client!iu",
      name = "<init>",
      descriptor = "()V"
   )
   public class602() {
      int[] var1 = new int[this.field8688];

      for(int var2 = 0; var2 < this.field8688; ++var2) {
         int var4 = 0;
         int var5 = class214.method1824(3);
         boolean var6 = class214.method1828() != 0;
         if (var6) {
            var4 = class214.method1824(5);
         }

         var1[var2] = var4 << 3 | var5;
      }

      this.field8685 = new int[this.field8688 * 8];

      for(int var3 = 0; var3 < this.field8688 * 8; ++var3) {
         this.field8685[var3] = (var1[var3 >> 3] & 1 << (var3 & 7)) != 0 ? class214.method1824(8) : -1;
      }

   }
}
