import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class702 {
   @OriginalMember(
      owner = "client!fb",
      name = "b",
      descriptor = "I"
   )
   public int field10522;
   @OriginalMember(
      owner = "client!fb",
      name = "c",
      descriptor = "I"
   )
   private int field10523;
   @OriginalMember(
      owner = "client!fb",
      name = "e",
      descriptor = "[I"
   )
   private int[] field10521;
   @OriginalMember(
      owner = "client!fb",
      name = "f",
      descriptor = "[I"
   )
   private int[] field10524;
   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "[[F"
   )
   private float[][] field10525;
   @OriginalMember(
      owner = "client!fb",
      name = "d",
      descriptor = "[I"
   )
   private int[] field10526;

   @OriginalMember(
      owner = "client!fb",
      name = "c",
      descriptor = "()[F"
   )
   public final float[] method5112() {
      return this.field10525[this.method5113()];
   }

   @OriginalMember(
      owner = "client!fb",
      name = "b",
      descriptor = "()I"
   )
   public final int method5113() {
      int var1;
      for(var1 = 0; this.field10526[var1] >= 0; var1 = class116.method969() != 0 ? this.field10526[var1] : var1 + 1) {
      }

      return ~this.field10526[var1];
   }

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "()V"
   )
   private final void method5114() {
      int[] var1 = new int[this.field10523];
      int[] var2 = new int[33];

      for(int var3 = 0; var3 < this.field10523; ++var3) {
         int var14 = this.field10521[var3];
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

      this.field10526 = new int[8];
      int var4 = 0;

      for(int var5 = 0; var5 < this.field10523; ++var5) {
         int var6 = this.field10521[var5];
         if (var6 != 0) {
            int var7 = var1[var5];
            int var8 = 0;

            for(int var9 = 0; var9 < var6; ++var9) {
               int var10 = Integer.MIN_VALUE >>> var9;
               if ((var7 & var10) != 0) {
                  if (this.field10526[var8] == 0) {
                     this.field10526[var8] = var4;
                  }

                  var8 = this.field10526[var8];
               } else {
                  ++var8;
               }

               if (var8 >= this.field10526.length) {
                  int[] var11 = new int[this.field10526.length * 2];

                  for(int var12 = 0; var12 < this.field10526.length; ++var12) {
                     var11[var12] = this.field10526[var12];
                  }

                  this.field10526 = var11;
               }

               int var13 = var10 >>> 1;
            }

            this.field10526[var8] = ~var5;
            if (var8 >= var4) {
               var4 = var8 + 1;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(II)I"
   )
   private static final int method5115(int arg0, int arg1) {
      int var2;
      for(var2 = (int)Math.pow((double)arg0, 1.0D / (double)arg1) + 1; class330.method2503(var2, arg1, 1) > arg0; --var2) {
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!fb",
      name = "<init>",
      descriptor = "()V"
   )
   public class702() {
      class116.method967(24);
      this.field10522 = class116.method967(16);
      this.field10523 = class116.method967(24);
      this.field10521 = new int[this.field10523];
      boolean var1 = class116.method969() != 0;
      if (var1) {
         int var2 = 0;
         int var3 = class116.method967(5) + 1;

         while(var2 < this.field10523) {
            int var4 = class116.method967(class788.method5654(29990, this.field10523 - var2));

            for(int var5 = 0; var5 < var4; ++var5) {
               this.field10521[var2++] = var3;
            }

            ++var3;
         }
      } else {
         boolean var6 = class116.method969() != 0;

         for(int var7 = 0; var7 < this.field10523; ++var7) {
            if (var6 && class116.method969() == 0) {
               this.field10521[var7] = 0;
            } else {
               this.field10521[var7] = class116.method967(5) + 1;
            }
         }
      }

      this.method5114();
      int var8 = class116.method967(4);
      if (var8 > 0) {
         float var9 = class116.method971(class116.method967(32));
         float var10 = class116.method971(class116.method967(32));
         int var11 = class116.method967(4) + 1;
         boolean var12 = class116.method969() != 0;
         int var13;
         if (var8 == 1) {
            var13 = method5115(this.field10523, this.field10522);
         } else {
            var13 = this.field10523 * this.field10522;
         }

         this.field10524 = new int[var13];

         for(int var14 = 0; var14 < var13; ++var14) {
            this.field10524[var14] = class116.method967(var11);
         }

         this.field10525 = new float[this.field10523][this.field10522];
         if (var8 == 1) {
            for(int var15 = 0; var15 < this.field10523; ++var15) {
               float var16 = 0.0F;
               int var17 = 1;

               for(int var18 = 0; var18 < this.field10522; ++var18) {
                  int var19 = var15 / var17 % var13;
                  float var20 = (float)this.field10524[var19] * var10 + var9 + var16;
                  this.field10525[var15][var18] = var20;
                  if (var12) {
                     var16 = var20;
                  }

                  var17 = var13 * var17;
               }
            }

            return;
         }

         for(int var21 = 0; var21 < this.field10523; ++var21) {
            float var22 = 0.0F;
            int var23 = this.field10522 * var21;

            for(int var24 = 0; var24 < this.field10522; ++var24) {
               float var25 = (float)this.field10524[var23] * var10 + var9 + var22;
               this.field10525[var21][var24] = var25;
               if (var12) {
                  var22 = var25;
               }

               ++var23;
            }
         }
      }

   }
}
