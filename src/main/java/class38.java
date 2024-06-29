import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class38 {
   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "I"
   )
   public int field551;
   @OriginalMember(
      owner = "client!wf",
      name = "b",
      descriptor = "I"
   )
   private int field550;
   @OriginalMember(
      owner = "client!wf",
      name = "f",
      descriptor = "[I"
   )
   private int[] field552;
   @OriginalMember(
      owner = "client!wf",
      name = "c",
      descriptor = "[I"
   )
   private int[] field549;
   @OriginalMember(
      owner = "client!wf",
      name = "d",
      descriptor = "[[F"
   )
   private float[][] field553;
   @OriginalMember(
      owner = "client!wf",
      name = "e",
      descriptor = "[I"
   )
   private int[] field554;

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(II)I"
   )
   private static final int method425(int arg0, int arg1) {
      int var2;
      for(var2 = (int)Math.pow((double)arg0, 1.0D / (double)arg1) + 1; class756.method5461(arg1, (byte)-125, var2) > arg0; --var2) {
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "()I"
   )
   public final int method426() {
      int var1;
      for(var1 = 0; this.field554[var1] >= 0; var1 = class469.method3599() != 0 ? this.field554[var1] : var1 + 1) {
      }

      return ~this.field554[var1];
   }

   @OriginalMember(
      owner = "client!wf",
      name = "b",
      descriptor = "()[F"
   )
   public final float[] method427() {
      return this.field553[this.method426()];
   }

   @OriginalMember(
      owner = "client!wf",
      name = "c",
      descriptor = "()V"
   )
   private final void method428() {
      int[] var1 = new int[this.field550];
      int[] var2 = new int[33];

      for(int var3 = 0; var3 < this.field550; ++var3) {
         int var14 = this.field552[var3];
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

      this.field554 = new int[8];
      int var4 = 0;

      for(int var5 = 0; var5 < this.field550; ++var5) {
         int var6 = this.field552[var5];
         if (var6 != 0) {
            int var7 = var1[var5];
            int var8 = 0;

            for(int var9 = 0; var9 < var6; ++var9) {
               int var10 = Integer.MIN_VALUE >>> var9;
               if ((var7 & var10) != 0) {
                  if (this.field554[var8] == 0) {
                     this.field554[var8] = var4;
                  }

                  var8 = this.field554[var8];
               } else {
                  ++var8;
               }

               if (var8 >= this.field554.length) {
                  int[] var11 = new int[this.field554.length * 2];

                  for(int var12 = 0; var12 < this.field554.length; ++var12) {
                     var11[var12] = this.field554[var12];
                  }

                  this.field554 = var11;
               }

               int var13 = var10 >>> 1;
            }

            this.field554[var8] = ~var5;
            if (var8 >= var4) {
               var4 = var8 + 1;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!wf",
      name = "<init>",
      descriptor = "()V"
   )
   public class38() {
      class469.method3598(24);
      this.field551 = class469.method3598(16);
      this.field550 = class469.method3598(24);
      this.field552 = new int[this.field550];
      boolean var1 = class469.method3599() != 0;
      if (var1) {
         int var2 = 0;
         int var3 = class469.method3598(5) + 1;

         while(var2 < this.field550) {
            int var4 = class469.method3598(class682.method4979(this.field550 - var2, true));

            for(int var5 = 0; var5 < var4; ++var5) {
               this.field552[var2++] = var3;
            }

            ++var3;
         }
      } else {
         boolean var6 = class469.method3599() != 0;

         for(int var7 = 0; var7 < this.field550; ++var7) {
            if (var6 && class469.method3599() == 0) {
               this.field552[var7] = 0;
            } else {
               this.field552[var7] = class469.method3598(5) + 1;
            }
         }
      }

      this.method428();
      int var8 = class469.method3598(4);
      if (var8 > 0) {
         float var9 = class469.method3596(class469.method3598(32));
         float var10 = class469.method3596(class469.method3598(32));
         int var11 = class469.method3598(4) + 1;
         boolean var12 = class469.method3599() != 0;
         int var13;
         if (var8 == 1) {
            var13 = method425(this.field550, this.field551);
         } else {
            var13 = this.field551 * this.field550;
         }

         this.field549 = new int[var13];

         for(int var14 = 0; var14 < var13; ++var14) {
            this.field549[var14] = class469.method3598(var11);
         }

         this.field553 = new float[this.field550][this.field551];
         if (var8 == 1) {
            for(int var15 = 0; var15 < this.field550; ++var15) {
               float var16 = 0.0F;
               int var17 = 1;

               for(int var18 = 0; var18 < this.field551; ++var18) {
                  int var19 = var15 / var17 % var13;
                  float var20 = (float)this.field549[var19] * var10 + var9 + var16;
                  this.field553[var15][var18] = var20;
                  if (var12) {
                     var16 = var20;
                  }

                  var17 = var13 * var17;
               }
            }

            return;
         }

         for(int var21 = 0; var21 < this.field550; ++var21) {
            float var22 = 0.0F;
            int var23 = this.field551 * var21;

            for(int var24 = 0; var24 < this.field551; ++var24) {
               float var25 = (float)this.field549[var23] * var10 + var9 + var22;
               this.field553[var21][var24] = var25;
               if (var12) {
                  var22 = var25;
               }

               ++var23;
            }
         }
      }

   }
}
