import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class91 {
   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "I"
   )
   public int field1191;
   @OriginalMember(
      owner = "client!kca",
      name = "c",
      descriptor = "I"
   )
   private int field1192;
   @OriginalMember(
      owner = "client!kca",
      name = "e",
      descriptor = "[I"
   )
   private int[] field1190;
   @OriginalMember(
      owner = "client!kca",
      name = "f",
      descriptor = "[I"
   )
   private int[] field1188;
   @OriginalMember(
      owner = "client!kca",
      name = "b",
      descriptor = "[[F"
   )
   private float[][] field1189;
   @OriginalMember(
      owner = "client!kca",
      name = "d",
      descriptor = "[I"
   )
   private int[] field1193;

   @OriginalMember(
      owner = "client!kca",
      name = "b",
      descriptor = "()I",
      line = 5
   )
   public final int method793() {
      int var1;
      for(var1 = 0; this.field1193[var1] >= 0; var1 = class332.method2453() != 0 ? this.field1193[var1] : var1 + 1) {
      }

      return ~this.field1193[var1];
   }

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "()[F",
      line = 12
   )
   public final float[] method794() {
      return this.field1189[this.method793()];
   }

   @OriginalMember(
      owner = "client!kca",
      name = "c",
      descriptor = "()V",
      line = 17
   )
   private final void method795() {
      int[] var1 = new int[this.field1192];
      int[] var2 = new int[33];

      for(int var3 = 0; var3 < this.field1192; ++var3) {
         int var14 = this.field1190[var3];
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

      this.field1193 = new int[8];
      int var4 = 0;

      for(int var5 = 0; var5 < this.field1192; ++var5) {
         int var6 = this.field1190[var5];
         if (var6 != 0) {
            int var7 = var1[var5];
            int var8 = 0;

            for(int var9 = 0; var9 < var6; ++var9) {
               int var10 = Integer.MIN_VALUE >>> var9;
               if ((var7 & var10) != 0) {
                  if (this.field1193[var8] == 0) {
                     this.field1193[var8] = var4;
                  }

                  var8 = this.field1193[var8];
               } else {
                  ++var8;
               }

               if (var8 >= this.field1193.length) {
                  int[] var11 = new int[this.field1193.length * 2];

                  for(int var12 = 0; var12 < this.field1193.length; ++var12) {
                     var11[var12] = this.field1193[var12];
                  }

                  this.field1193 = var11;
               }

               int var13 = var10 >>> 1;
            }

            this.field1193[var8] = ~var5;
            if (var8 >= var4) {
               var4 = var8 + 1;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "(II)I",
      line = 156
   )
   private static final int method796(int arg0, int arg1) {
      int var2;
      for(var2 = (int)Math.pow((double)arg0, 1.0D / (double)arg1) + 1; class614.method4462(true, arg1, var2) > arg0; --var2) {
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!kca",
      name = "<init>",
      descriptor = "()V",
      line = 165
   )
   public class91() {
      class332.method2461(24);
      this.field1191 = class332.method2461(16);
      this.field1192 = class332.method2461(24);
      this.field1190 = new int[this.field1192];
      boolean var1 = class332.method2453() != 0;
      if (var1) {
         int var2 = 0;
         int var3 = class332.method2461(5) + 1;

         while(var2 < this.field1192) {
            int var4 = class332.method2461(class456.method3326(this.field1192 - var2, (byte)125));

            for(int var5 = 0; var5 < var4; ++var5) {
               this.field1190[var2++] = var3;
            }

            ++var3;
         }
      } else {
         boolean var6 = class332.method2453() != 0;

         for(int var7 = 0; var7 < this.field1192; ++var7) {
            if (var6 && class332.method2453() == 0) {
               this.field1190[var7] = 0;
            } else {
               this.field1190[var7] = class332.method2461(5) + 1;
            }
         }
      }

      this.method795();
      int var8 = class332.method2461(4);
      if (var8 > 0) {
         float var9 = class332.method2454(class332.method2461(32));
         float var10 = class332.method2454(class332.method2461(32));
         int var11 = class332.method2461(4) + 1;
         boolean var12 = class332.method2453() != 0;
         int var13;
         if (var8 == 1) {
            var13 = method796(this.field1192, this.field1191);
         } else {
            var13 = this.field1192 * this.field1191;
         }

         this.field1188 = new int[var13];

         for(int var14 = 0; var14 < var13; ++var14) {
            this.field1188[var14] = class332.method2461(var11);
         }

         this.field1189 = new float[this.field1192][this.field1191];
         if (var8 == 1) {
            for(int var15 = 0; var15 < this.field1192; ++var15) {
               float var16 = 0.0F;
               int var17 = 1;

               for(int var18 = 0; var18 < this.field1191; ++var18) {
                  int var19 = var15 / var17 % var13;
                  float var20 = (float)this.field1188[var19] * var10 + var9 + var16;
                  this.field1189[var15][var18] = var20;
                  if (var12) {
                     var16 = var20;
                  }

                  var17 = var13 * var17;
               }
            }

            return;
         }

         for(int var21 = 0; var21 < this.field1192; ++var21) {
            float var22 = 0.0F;
            int var23 = this.field1191 * var21;

            for(int var24 = 0; var24 < this.field1191; ++var24) {
               float var25 = (float)this.field1188[var23] * var10 + var9 + var22;
               this.field1189[var21][var24] = var25;
               if (var12) {
                  var22 = var25;
               }

               ++var23;
            }
         }
      }

   }
}
