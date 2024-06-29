import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class410 {
   @OriginalMember(
      owner = "client!ml",
      name = "f",
      descriptor = "I"
   )
   public int field5775;
   @OriginalMember(
      owner = "client!ml",
      name = "c",
      descriptor = "I"
   )
   private int field5778;
   @OriginalMember(
      owner = "client!ml",
      name = "b",
      descriptor = "[I"
   )
   private int[] field5776;
   @OriginalMember(
      owner = "client!ml",
      name = "d",
      descriptor = "[I"
   )
   private int[] field5774;
   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "[[F"
   )
   private float[][] field5777;
   @OriginalMember(
      owner = "client!ml",
      name = "e",
      descriptor = "[I"
   )
   private int[] field5779;

   @OriginalMember(
      owner = "client!ml",
      name = "b",
      descriptor = "()V"
   )
   private final void method3105() {
      int[] var1 = new int[this.field5778];
      int[] var2 = new int[33];

      for(int var3 = 0; var3 < this.field5778; ++var3) {
         int var14 = this.field5776[var3];
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

      this.field5779 = new int[8];
      int var4 = 0;

      for(int var5 = 0; var5 < this.field5778; ++var5) {
         int var6 = this.field5776[var5];
         if (var6 != 0) {
            int var7 = var1[var5];
            int var8 = 0;

            for(int var9 = 0; var9 < var6; ++var9) {
               int var10 = Integer.MIN_VALUE >>> var9;
               if ((var7 & var10) != 0) {
                  if (this.field5779[var8] == 0) {
                     this.field5779[var8] = var4;
                  }

                  var8 = this.field5779[var8];
               } else {
                  ++var8;
               }

               if (var8 >= this.field5779.length) {
                  int[] var11 = new int[this.field5779.length * 2];

                  for(int var12 = 0; var12 < this.field5779.length; ++var12) {
                     var11[var12] = this.field5779[var12];
                  }

                  this.field5779 = var11;
               }

               int var13 = var10 >>> 1;
            }

            this.field5779[var8] = ~var5;
            if (var8 >= var4) {
               var4 = var8 + 1;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "(II)I"
   )
   private static final int method3106(int arg0, int arg1) {
      int var2;
      for(var2 = (int)Math.pow((double)arg0, 1.0D / (double)arg1) + 1; class63.method472(var2, 1, arg1) > arg0; --var2) {
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "()I"
   )
   public final int method3107() {
      int var1;
      for(var1 = 0; this.field5779[var1] >= 0; var1 = class36.method282() != 0 ? this.field5779[var1] : var1 + 1) {
      }

      return ~this.field5779[var1];
   }

   @OriginalMember(
      owner = "client!ml",
      name = "<init>",
      descriptor = "()V"
   )
   public class410() {
      class36.method276(24);
      this.field5775 = class36.method276(16);
      this.field5778 = class36.method276(24);
      this.field5776 = new int[this.field5778];
      boolean var1 = class36.method282() != 0;
      if (var1) {
         int var2 = 0;
         int var3 = class36.method276(5) + 1;

         while(var2 < this.field5778) {
            int var4 = class36.method276(class138.method1155(this.field5778 - var2, (byte)-122));

            for(int var5 = 0; var5 < var4; ++var5) {
               this.field5776[var2++] = var3;
            }

            ++var3;
         }
      } else {
         boolean var6 = class36.method282() != 0;

         for(int var7 = 0; var7 < this.field5778; ++var7) {
            if (var6 && class36.method282() == 0) {
               this.field5776[var7] = 0;
            } else {
               this.field5776[var7] = class36.method276(5) + 1;
            }
         }
      }

      this.method3105();
      int var8 = class36.method276(4);
      if (var8 > 0) {
         float var9 = class36.method286(class36.method276(32));
         float var10 = class36.method286(class36.method276(32));
         int var11 = class36.method276(4) + 1;
         boolean var12 = class36.method282() != 0;
         int var13;
         if (var8 == 1) {
            var13 = method3106(this.field5778, this.field5775);
         } else {
            var13 = this.field5778 * this.field5775;
         }

         this.field5774 = new int[var13];

         for(int var14 = 0; var14 < var13; ++var14) {
            this.field5774[var14] = class36.method276(var11);
         }

         this.field5777 = new float[this.field5778][this.field5775];
         if (var8 == 1) {
            for(int var15 = 0; var15 < this.field5778; ++var15) {
               float var16 = 0.0F;
               int var17 = 1;

               for(int var18 = 0; var18 < this.field5775; ++var18) {
                  int var19 = var15 / var17 % var13;
                  float var20 = (float)this.field5774[var19] * var10 + var9 + var16;
                  this.field5777[var15][var18] = var20;
                  if (var12) {
                     var16 = var20;
                  }

                  var17 = var13 * var17;
               }
            }

            return;
         }

         for(int var21 = 0; var21 < this.field5778; ++var21) {
            float var22 = 0.0F;
            int var23 = this.field5775 * var21;

            for(int var24 = 0; var24 < this.field5775; ++var24) {
               float var25 = (float)this.field5774[var23] * var10 + var9 + var22;
               this.field5777[var21][var24] = var25;
               if (var12) {
                  var22 = var25;
               }

               ++var23;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!ml",
      name = "c",
      descriptor = "()[F"
   )
   public final float[] method3108() {
      return this.field5777[this.method3107()];
   }
}
