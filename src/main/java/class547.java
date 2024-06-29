import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class547 {
   @OriginalMember(
      owner = "client!su",
      name = "e",
      descriptor = "I"
   )
   public int field8060;
   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "I"
   )
   private int field8063;
   @OriginalMember(
      owner = "client!su",
      name = "b",
      descriptor = "[I"
   )
   private int[] field8061;
   @OriginalMember(
      owner = "client!su",
      name = "c",
      descriptor = "[I"
   )
   private int[] field8059;
   @OriginalMember(
      owner = "client!su",
      name = "f",
      descriptor = "[[F"
   )
   private float[][] field8062;
   @OriginalMember(
      owner = "client!su",
      name = "d",
      descriptor = "[I"
   )
   private int[] field8064;

   @OriginalMember(
      owner = "client!su",
      name = "b",
      descriptor = "()V"
   )
   private final void method4144() {
      int[] var1 = new int[this.field8063];
      int[] var2 = new int[33];

      for(int var3 = 0; var3 < this.field8063; ++var3) {
         int var14 = this.field8061[var3];
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

      this.field8064 = new int[8];
      int var4 = 0;

      for(int var5 = 0; var5 < this.field8063; ++var5) {
         int var6 = this.field8061[var5];
         if (var6 != 0) {
            int var7 = var1[var5];
            int var8 = 0;

            for(int var9 = 0; var9 < var6; ++var9) {
               int var10 = Integer.MIN_VALUE >>> var9;
               if ((var7 & var10) != 0) {
                  if (this.field8064[var8] == 0) {
                     this.field8064[var8] = var4;
                  }

                  var8 = this.field8064[var8];
               } else {
                  ++var8;
               }

               if (var8 >= this.field8064.length) {
                  int[] var11 = new int[this.field8064.length * 2];

                  for(int var12 = 0; var12 < this.field8064.length; ++var12) {
                     var11[var12] = this.field8064[var12];
                  }

                  this.field8064 = var11;
               }

               int var13 = var10 >>> 1;
            }

            this.field8064[var8] = ~var5;
            if (var8 >= var4) {
               var4 = var8 + 1;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "()[F"
   )
   public final float[] method4145() {
      return this.field8062[this.method4146()];
   }

   @OriginalMember(
      owner = "client!su",
      name = "c",
      descriptor = "()I"
   )
   public final int method4146() {
      int var1;
      for(var1 = 0; this.field8064[var1] >= 0; var1 = class672.method4919() != 0 ? this.field8064[var1] : var1 + 1) {
      }

      return ~this.field8064[var1];
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(II)I"
   )
   private static final int method4147(int arg0, int arg1) {
      int var2;
      for(var2 = (int)Math.pow((double)arg0, 1.0D / (double)arg1) + 1; class82.method796(arg1, var2, (byte)74) > arg0; --var2) {
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!su",
      name = "<init>",
      descriptor = "()V"
   )
   public class547() {
      class672.method4914(24);
      this.field8060 = class672.method4914(16);
      this.field8063 = class672.method4914(24);
      this.field8061 = new int[this.field8063];
      boolean var1 = class672.method4919() != 0;
      if (var1) {
         int var2 = 0;
         int var3 = class672.method4914(5) + 1;

         while(var2 < this.field8063) {
            int var4 = class672.method4914(class291.method2349((byte)119, this.field8063 - var2));

            for(int var5 = 0; var5 < var4; ++var5) {
               this.field8061[var2++] = var3;
            }

            ++var3;
         }
      } else {
         boolean var6 = class672.method4919() != 0;

         for(int var7 = 0; var7 < this.field8063; ++var7) {
            if (var6 && class672.method4919() == 0) {
               this.field8061[var7] = 0;
            } else {
               this.field8061[var7] = class672.method4914(5) + 1;
            }
         }
      }

      this.method4144();
      int var8 = class672.method4914(4);
      if (var8 > 0) {
         float var9 = class672.method4923(class672.method4914(32));
         float var10 = class672.method4923(class672.method4914(32));
         int var11 = class672.method4914(4) + 1;
         boolean var12 = class672.method4919() != 0;
         int var13;
         if (var8 == 1) {
            var13 = method4147(this.field8063, this.field8060);
         } else {
            var13 = this.field8063 * this.field8060;
         }

         this.field8059 = new int[var13];

         for(int var14 = 0; var14 < var13; ++var14) {
            this.field8059[var14] = class672.method4914(var11);
         }

         this.field8062 = new float[this.field8063][this.field8060];
         if (var8 == 1) {
            for(int var15 = 0; var15 < this.field8063; ++var15) {
               float var16 = 0.0F;
               int var17 = 1;

               for(int var18 = 0; var18 < this.field8060; ++var18) {
                  int var19 = var15 / var17 % var13;
                  float var20 = (float)this.field8059[var19] * var10 + var9 + var16;
                  this.field8062[var15][var18] = var20;
                  if (var12) {
                     var16 = var20;
                  }

                  var17 = var13 * var17;
               }
            }

            return;
         }

         for(int var21 = 0; var21 < this.field8063; ++var21) {
            float var22 = 0.0F;
            int var23 = this.field8060 * var21;

            for(int var24 = 0; var24 < this.field8060; ++var24) {
               float var25 = (float)this.field8059[var23] * var10 + var9 + var22;
               this.field8062[var21][var24] = var25;
               if (var12) {
                  var22 = var25;
               }

               ++var23;
            }
         }
      }

   }
}
