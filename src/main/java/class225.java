import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class225 {
   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "I"
   )
   public int field3338;
   @OriginalMember(
      owner = "client!jf",
      name = "b",
      descriptor = "I"
   )
   private int field3340;
   @OriginalMember(
      owner = "client!jf",
      name = "f",
      descriptor = "[I"
   )
   private int[] field3339;
   @OriginalMember(
      owner = "client!jf",
      name = "d",
      descriptor = "[I"
   )
   private int[] field3341;
   @OriginalMember(
      owner = "client!jf",
      name = "c",
      descriptor = "[[F"
   )
   private float[][] field3342;
   @OriginalMember(
      owner = "client!jf",
      name = "e",
      descriptor = "[I"
   )
   private int[] field3343;

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "()[F",
      line = 3
   )
   public final float[] method1881() {
      return this.field3342[this.method1882()];
   }

   @OriginalMember(
      owner = "client!jf",
      name = "c",
      descriptor = "()I",
      line = 7
   )
   public final int method1882() {
      int var1;
      for(var1 = 0; this.field3343[var1] >= 0; var1 = class214.method1828() != 0 ? this.field3343[var1] : var1 + 1) {
      }

      return ~this.field3343[var1];
   }

   @OriginalMember(
      owner = "client!jf",
      name = "b",
      descriptor = "()V",
      line = 16
   )
   private final void method1883() {
      int[] var1 = new int[this.field3340];
      int[] var2 = new int[33];

      for(int var3 = 0; var3 < this.field3340; ++var3) {
         int var14 = this.field3339[var3];
         if (var14 != 0) {
            int var15 = 1 << 32 - var14;
            int var16 = var2[var14];
            var1[var3] = var16;
            int var17;
            if ((var16 & var15) != 0) {
               var17 = var2[var14 - 1];
            } else {
               var17 = var16 | var15;

               for(int var18 = var14 - 1; var18 >= 1; --var18) {
                  int var19 = var2[var18];
                  if (var16 != var19) {
                     break;
                  }

                  int var20 = 1 << 32 - var18;
                  if ((var19 & var20) != 0) {
                     var2[var18] = var2[var18 - 1];
                     break;
                  }

                  var2[var18] = var19 | var20;
               }
            }

            var2[var14] = var17;

            for(int var21 = var14 + 1; var21 <= 32; ++var21) {
               int var22 = var2[var21];
               if (var16 == var22) {
                  var2[var21] = var17;
               }
            }
         }
      }

      this.field3343 = new int[8];
      int var4 = 0;

      for(int var5 = 0; var5 < this.field3340; ++var5) {
         int var6 = this.field3339[var5];
         if (var6 != 0) {
            int var7 = var1[var5];
            int var8 = 0;

            for(int var9 = 0; var9 < var6; ++var9) {
               int var10 = Integer.MIN_VALUE >>> var9;
               if ((var7 & var10) != 0) {
                  if (this.field3343[var8] == 0) {
                     this.field3343[var8] = var4;
                  }

                  var8 = this.field3343[var8];
               } else {
                  ++var8;
               }

               if (var8 >= this.field3343.length) {
                  int[] var11 = new int[this.field3343.length * 2];

                  for(int var12 = 0; var12 < this.field3343.length; ++var12) {
                     var11[var12] = this.field3343[var12];
                  }

                  this.field3343 = var11;
               }

               int var13 = var10 >>> 1;
            }

            this.field3343[var8] = ~var5;
            if (var8 >= var4) {
               var4 = var8 + 1;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "(II)I",
      line = 157
   )
   private static final int method1884(int arg0, int arg1) {
      int var2;
      for(var2 = (int)Math.pow((double)arg0, 1.0D / (double)arg1) + 1; class349.method2690(var2, arg1, -8739) > arg0; --var2) {
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!jf",
      name = "<init>",
      descriptor = "()V",
      line = 165
   )
   public class225() {
      class214.method1824(24);
      this.field3338 = class214.method1824(16);
      this.field3340 = class214.method1824(24);
      this.field3339 = new int[this.field3340];
      boolean var1 = class214.method1828() != 0;
      if (var1) {
         int var2 = 0;
         int var3 = class214.method1824(5) + 1;

         while(var2 < this.field3340) {
            int var4 = class214.method1824(class752.method5444(-79, this.field3340 - var2));

            for(int var5 = 0; var5 < var4; ++var5) {
               this.field3339[var2++] = var3;
            }

            ++var3;
         }
      } else {
         boolean var6 = class214.method1828() != 0;

         for(int var7 = 0; var7 < this.field3340; ++var7) {
            if (var6 && class214.method1828() == 0) {
               this.field3339[var7] = 0;
            } else {
               this.field3339[var7] = class214.method1824(5) + 1;
            }
         }
      }

      this.method1883();
      int var8 = class214.method1824(4);
      if (var8 > 0) {
         float var9 = class214.method1826(class214.method1824(32));
         float var10 = class214.method1826(class214.method1824(32));
         int var11 = class214.method1824(4) + 1;
         boolean var12 = class214.method1828() != 0;
         int var13;
         if (var8 == 1) {
            var13 = method1884(this.field3340, this.field3338);
         } else {
            var13 = this.field3340 * this.field3338;
         }

         this.field3341 = new int[var13];

         for(int var14 = 0; var14 < var13; ++var14) {
            this.field3341[var14] = class214.method1824(var11);
         }

         this.field3342 = new float[this.field3340][this.field3338];
         if (var8 == 1) {
            for(int var15 = 0; var15 < this.field3340; ++var15) {
               float var16 = 0.0F;
               int var17 = 1;

               for(int var18 = 0; var18 < this.field3338; ++var18) {
                  int var19 = var15 / var17 % var13;
                  float var20 = (float)this.field3341[var19] * var10 + var9 + var16;
                  this.field3342[var15][var18] = var20;
                  if (var12) {
                     var16 = var20;
                  }

                  var17 = var13 * var17;
               }
            }

            return;
         }

         for(int var21 = 0; var21 < this.field3340; ++var21) {
            float var22 = 0.0F;
            int var23 = this.field3338 * var21;

            for(int var24 = 0; var24 < this.field3338; ++var24) {
               float var25 = (float)this.field3341[var23] * var10 + var9 + var22;
               this.field3342[var21][var24] = var25;
               if (var12) {
                  var22 = var25;
               }

               ++var23;
            }
         }
      }

   }
}
