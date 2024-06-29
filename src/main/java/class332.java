import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class332 extends class428 {
   @OriginalMember(
      owner = "client!vn",
      name = "Q",
      descriptor = "Z"
   )
   private static boolean field4533 = false;
   @OriginalMember(
      owner = "client!vn",
      name = "A",
      descriptor = "I"
   )
   private static int field4505;
   @OriginalMember(
      owner = "client!vn",
      name = "m",
      descriptor = "I"
   )
   private int field4506;
   @OriginalMember(
      owner = "client!vn",
      name = "H",
      descriptor = "I"
   )
   private static int field4512;
   @OriginalMember(
      owner = "client!vn",
      name = "D",
      descriptor = "I"
   )
   private int field4517;
   @OriginalMember(
      owner = "client!vn",
      name = "t",
      descriptor = "I"
   )
   private static int field4519;
   @OriginalMember(
      owner = "client!vn",
      name = "E",
      descriptor = "I"
   )
   private int field4522;
   @OriginalMember(
      owner = "client!vn",
      name = "x",
      descriptor = "I"
   )
   private int field4525;
   @OriginalMember(
      owner = "client!vn",
      name = "q",
      descriptor = "I"
   )
   private static int field4526;
   @OriginalMember(
      owner = "client!vn",
      name = "P",
      descriptor = "I"
   )
   private int field4530;
   @OriginalMember(
      owner = "client!vn",
      name = "u",
      descriptor = "I"
   )
   private int field4535;
   @OriginalMember(
      owner = "client!vn",
      name = "J",
      descriptor = "I"
   )
   private int field4536;
   @OriginalMember(
      owner = "client!vn",
      name = "K",
      descriptor = "I"
   )
   private int field4538;
   @OriginalMember(
      owner = "client!vn",
      name = "M",
      descriptor = "Z"
   )
   private boolean field4511;
   @OriginalMember(
      owner = "client!vn",
      name = "s",
      descriptor = "Z"
   )
   private boolean field4523;
   @OriginalMember(
      owner = "client!vn",
      name = "I",
      descriptor = "[B"
   )
   private static byte[] field4531;
   @OriginalMember(
      owner = "client!vn",
      name = "w",
      descriptor = "[B"
   )
   private byte[] field4537;
   @OriginalMember(
      owner = "client!vn",
      name = "G",
      descriptor = "[F"
   )
   private static float[] field4507;
   @OriginalMember(
      owner = "client!vn",
      name = "o",
      descriptor = "[F"
   )
   private float[] field4508;
   @OriginalMember(
      owner = "client!vn",
      name = "p",
      descriptor = "[F"
   )
   private static float[] field4510;
   @OriginalMember(
      owner = "client!vn",
      name = "v",
      descriptor = "[F"
   )
   private static float[] field4515;
   @OriginalMember(
      owner = "client!vn",
      name = "F",
      descriptor = "[F"
   )
   private static float[] field4516;
   @OriginalMember(
      owner = "client!vn",
      name = "T",
      descriptor = "[F"
   )
   private static float[] field4518;
   @OriginalMember(
      owner = "client!vn",
      name = "r",
      descriptor = "[F"
   )
   private static float[] field4521;
   @OriginalMember(
      owner = "client!vn",
      name = "B",
      descriptor = "[F"
   )
   private static float[] field4532;
   @OriginalMember(
      owner = "client!vn",
      name = "z",
      descriptor = "[I"
   )
   private static int[] field4513;
   @OriginalMember(
      owner = "client!vn",
      name = "C",
      descriptor = "[I"
   )
   private static int[] field4528;
   @OriginalMember(
      owner = "client!vn",
      name = "n",
      descriptor = "[I"
   )
   private static int[] field4529;
   @OriginalMember(
      owner = "client!vn",
      name = "N",
      descriptor = "[Llka;"
   )
   private static class413[] field4509;
   @OriginalMember(
      owner = "client!vn",
      name = "S",
      descriptor = "[Leb;"
   )
   private static class654[] field4524;
   @OriginalMember(
      owner = "client!vn",
      name = "O",
      descriptor = "[Lsw;"
   )
   private static class789[] field4520;
   @OriginalMember(
      owner = "client!vn",
      name = "R",
      descriptor = "[Lkca;"
   )
   public static class91[] field4514;
   @OriginalMember(
      owner = "client!vn",
      name = "y",
      descriptor = "[Z"
   )
   private static boolean[] field4534;
   @OriginalMember(
      owner = "client!vn",
      name = "L",
      descriptor = "[[B"
   )
   private byte[][] field4527;

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(Lkf;II)Lvn;"
   )
   public static final class332 method2451(class266 arg0, int arg1, int arg2) {
      if (!method2457(arg0)) {
         arg0.method2036(arg2, arg1, 0);
         return null;
      } else {
         byte[] var3 = arg0.method2037(false, arg2, arg1);
         return var3 == null ? null : new class332(var3);
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(Lkf;I)Lvn;"
   )
   public static final class332 method2452(class266 arg0, int arg1) {
      if (!method2457(arg0)) {
         arg0.method2051(arg1, (byte)60);
         return null;
      } else {
         byte[] var2 = arg0.method2061((byte)-85, arg1);
         return var2 == null ? null : new class332(var2);
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "b",
      descriptor = "()I"
   )
   public static final int method2453() {
      int var0 = field4531[field4526] >> field4512 & 1;
      ++field4512;
      field4526 += field4512 >> 3;
      field4512 &= 7;
      return var0;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(I)F"
   )
   public static final float method2454(int arg0) {
      int var1 = arg0 & 2097151;
      int var2 = arg0 & Integer.MIN_VALUE;
      int var3 = (arg0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }

   @OriginalMember(
      owner = "client!vn",
      name = "b",
      descriptor = "(I)[F"
   )
   private final float[] method2455(int arg0) {
      method2459(this.field4527[arg0], 0);
      method2453();
      int var2 = method2461(class456.method3326(field4529.length - 1, (byte)109));
      boolean var3 = field4534[var2];
      int var4 = var3 ? field4505 : field4519;
      boolean var5 = false;
      boolean var6 = false;
      if (var3) {
         var5 = method2453() != 0;
         var6 = method2453() != 0;
      }

      int var7 = var4 >> 1;
      int var8;
      int var9;
      int var10;
      if (var3 && !var5) {
         var8 = (var4 >> 2) - (field4519 >> 2);
         var9 = (field4519 >> 2) + (var4 >> 2);
         var10 = field4519 >> 1;
      } else {
         var8 = 0;
         var9 = var7;
         var10 = var4 >> 1;
      }

      int var11;
      int var12;
      int var13;
      if (var3 && !var6) {
         var11 = var4 - (var4 >> 2) - (field4519 >> 2);
         var12 = (field4519 >> 2) + (var4 - (var4 >> 2));
         var13 = field4519 >> 1;
      } else {
         var11 = var7;
         var12 = var4;
         var13 = var4 >> 1;
      }

      class413 var14 = field4509[field4529[var2]];
      int var15 = var14.field5956;
      int var16 = var14.field5957[var15];
      boolean var17 = !field4520[var16].method5696();
      boolean var18 = var17;

      for(int var19 = 0; var19 < var14.field5954; ++var19) {
         class654 var95 = field4524[var14.field5955[var19]];
         float[] var96 = field4510;
         var95.method4796(var96, var4 >> 1, var18);
      }

      if (!var17) {
         int var20 = var14.field5956;
         int var21 = var14.field5957[var20];
         field4520[var21].method5694(field4510, var4 >> 1);
      }

      if (var17) {
         for(int var22 = var4 >> 1; var22 < var4; ++var22) {
            field4510[var22] = 0.0F;
         }
      } else {
         int var23 = var4 >> 1;
         int var24 = var4 >> 2;
         int var25 = var4 >> 3;
         float[] var26 = field4510;

         for(int var27 = 0; var27 < var23; ++var27) {
            var26[var27] *= 0.5F;
         }

         for(int var28 = var23; var28 < var4; ++var28) {
            var26[var28] = -var26[var4 - var28 - 1];
         }

         float[] var29 = var3 ? field4507 : field4521;
         float[] var30 = var3 ? field4515 : field4518;
         float[] var31 = var3 ? field4516 : field4532;
         int[] var32 = var3 ? field4528 : field4513;

         for(int var33 = 0; var33 < var24; ++var33) {
            float var91 = var26[var33 * 4] - var26[var4 - var33 * 4 - 1];
            float var92 = var26[var33 * 4 + 2] - var26[var4 - var33 * 4 - 3];
            float var93 = var29[var33 * 2];
            float var94 = var29[var33 * 2 + 1];
            var26[var4 - var33 * 4 - 1] = var91 * var93 - var92 * var94;
            var26[var4 - var33 * 4 - 3] = var91 * var94 + var92 * var93;
         }

         for(int var34 = 0; var34 < var25; ++var34) {
            float var85 = var26[var34 * 4 + var23 + 3];
            float var86 = var26[var34 * 4 + var23 + 1];
            float var87 = var26[var34 * 4 + 3];
            float var88 = var26[var34 * 4 + 1];
            var26[var34 * 4 + var23 + 3] = var85 + var87;
            var26[var34 * 4 + var23 + 1] = var86 + var88;
            float var89 = var29[var23 - 4 - var34 * 4];
            float var90 = var29[var23 - 3 - var34 * 4];
            var26[var34 * 4 + 3] = (var85 - var87) * var89 - (var86 - var88) * var90;
            var26[var34 * 4 + 1] = (var85 - var87) * var90 + (var86 - var88) * var89;
         }

         int var35 = class456.method3326(var4 - 1, (byte)115);

         for(int var36 = 0; var36 < var35 - 3; ++var36) {
            int var72 = var4 >> var36 + 2;
            int var73 = 8 << var36;

            for(int var74 = 0; var74 < 2 << var36; ++var74) {
               int var75 = var4 - var72 * 2 * var74;
               int var76 = var4 - (var74 * 2 + 1) * var72;

               for(int var77 = 0; var77 < var4 >> var36 + 4; ++var77) {
                  int var78 = var77 * 4;
                  float var79 = var26[var75 - 1 - var78];
                  float var80 = var26[var75 - 3 - var78];
                  float var81 = var26[var76 - 1 - var78];
                  float var82 = var26[var76 - 3 - var78];
                  var26[var75 - 1 - var78] = var79 + var81;
                  var26[var75 - 3 - var78] = var80 + var82;
                  float var83 = var29[var73 * var77];
                  float var84 = var29[var73 * var77 + 1];
                  var26[var76 - 1 - var78] = (var79 - var81) * var83 - (var80 - var82) * var84;
                  var26[var76 - 3 - var78] = (var79 - var81) * var84 + (var80 - var82) * var83;
               }
            }
         }

         for(int var37 = 1; var37 < var25 - 1; ++var37) {
            int var65 = var32[var37];
            if (var37 < var65) {
               int var66 = var37 * 8;
               int var67 = var65 * 8;
               float var68 = var26[var66 + 1];
               var26[var66 + 1] = var26[var67 + 1];
               var26[var67 + 1] = var68;
               float var69 = var26[var66 + 3];
               var26[var66 + 3] = var26[var67 + 3];
               var26[var67 + 3] = var69;
               float var70 = var26[var66 + 5];
               var26[var66 + 5] = var26[var67 + 5];
               var26[var67 + 5] = var70;
               float var71 = var26[var66 + 7];
               var26[var66 + 7] = var26[var67 + 7];
               var26[var67 + 7] = var71;
            }
         }

         for(int var38 = 0; var38 < var23; ++var38) {
            var26[var38] = var26[var38 * 2 + 1];
         }

         for(int var39 = 0; var39 < var25; ++var39) {
            var26[var4 - 1 - var39 * 2] = var26[var39 * 4];
            var26[var4 - 2 - var39 * 2] = var26[var39 * 4 + 1];
            var26[var4 - var24 - 1 - var39 * 2] = var26[var39 * 4 + 2];
            var26[var4 - var24 - 2 - var39 * 2] = var26[var39 * 4 + 3];
         }

         for(int var40 = 0; var40 < var25; ++var40) {
            float var57 = var31[var40 * 2];
            float var58 = var31[var40 * 2 + 1];
            float var59 = var26[var40 * 2 + var23];
            float var60 = var26[var40 * 2 + var23 + 1];
            float var61 = var26[var4 - 2 - var40 * 2];
            float var62 = var26[var4 - 1 - var40 * 2];
            float var63 = (var59 - var61) * var58 + (var60 + var62) * var57;
            var26[var40 * 2 + var23] = (var59 + var61 + var63) * 0.5F;
            var26[var4 - 2 - var40 * 2] = (var59 + var61 - var63) * 0.5F;
            float var64 = (var60 + var62) * var58 - (var59 - var61) * var57;
            var26[var40 * 2 + var23 + 1] = (var60 - var62 + var64) * 0.5F;
            var26[var4 - 1 - var40 * 2] = (-var60 + var62 + var64) * 0.5F;
         }

         for(int var41 = 0; var41 < var24; ++var41) {
            var26[var41] = var30[var41 * 2] * var26[var41 * 2 + var23] + var30[var41 * 2 + 1] * var26[var41 * 2 + 1 + var23];
            var26[var23 - 1 - var41] = var26[var41 * 2 + var23] * var30[var41 * 2 + 1] - var30[var41 * 2] * var26[var41 * 2 + 1 + var23];
         }

         for(int var42 = 0; var42 < var24; ++var42) {
            var26[var4 - var24 + var42] = -var26[var42];
         }

         for(int var43 = 0; var43 < var24; ++var43) {
            var26[var43] = var26[var24 + var43];
         }

         for(int var44 = 0; var44 < var24; ++var44) {
            var26[var24 + var44] = -var26[var24 - var44 - 1];
         }

         for(int var45 = 0; var45 < var24; ++var45) {
            var26[var23 + var45] = var26[var4 - var45 - 1];
         }

         for(int var46 = var8; var46 < var9; ++var46) {
            float var56 = (float)Math.sin(((double)(var46 - var8) + 0.5D) / (double)var10 * 0.5D * 3.141592653589793D);
            field4510[var46] *= (float)Math.sin((double)var56 * 1.5707963267948966D * (double)var56);
         }

         for(int var47 = var11; var47 < var12; ++var47) {
            float var55 = (float)Math.sin(((double)(var47 - var11) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            field4510[var47] *= (float)Math.sin((double)var55 * 1.5707963267948966D * (double)var55);
         }
      }

      float[] var48 = null;
      if (this.field4525 > 0) {
         int var49 = this.field4525 + var4 >> 2;
         var48 = new float[var49];
         if (!this.field4523) {
            for(int var50 = 0; var50 < this.field4535; ++var50) {
               int var51 = (this.field4525 >> 1) + var50;
               var48[var50] += this.field4508[var51];
            }
         }

         if (!var17) {
            for(int var52 = var8; var52 < var4 >> 1; ++var52) {
               int var53 = var48.length - (var4 >> 1) + var52;
               var48[var53] += field4510[var52];
            }
         }
      }

      float[] var54 = this.field4508;
      this.field4508 = field4510;
      field4510 = var54;
      this.field4525 = var4;
      this.field4535 = var12 - (var4 >> 1);
      this.field4523 = var17;
      return var48;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "([B)V"
   )
   private static final void method2456(byte[] arg0) {
      method2459(arg0, 0);
      field4519 = 1 << method2461(4);
      field4505 = 1 << method2461(4);
      field4510 = new float[field4505];

      for(int var1 = 0; var1 < 2; ++var1) {
         int var14 = var1 != 0 ? field4505 : field4519;
         int var15 = var14 >> 1;
         int var16 = var14 >> 2;
         int var17 = var14 >> 3;
         float[] var18 = new float[var15];

         for(int var19 = 0; var19 < var16; ++var19) {
            var18[var19 * 2] = (float)Math.cos((double)(var19 * 4) * 3.141592653589793D / (double)var14);
            var18[var19 * 2 + 1] = -((float)Math.sin((double)(var19 * 4) * 3.141592653589793D / (double)var14));
         }

         float[] var20 = new float[var15];

         for(int var21 = 0; var21 < var16; ++var21) {
            var20[var21 * 2] = (float)Math.cos((double)(var21 * 2 + 1) * 3.141592653589793D / (double)(var14 * 2));
            var20[var21 * 2 + 1] = (float)Math.sin((double)(var21 * 2 + 1) * 3.141592653589793D / (double)(var14 * 2));
         }

         float[] var22 = new float[var16];

         for(int var23 = 0; var23 < var17; ++var23) {
            var22[var23 * 2] = (float)Math.cos((double)(var23 * 4 + 2) * 3.141592653589793D / (double)var14);
            var22[var23 * 2 + 1] = -((float)Math.sin((double)(var23 * 4 + 2) * 3.141592653589793D / (double)var14));
         }

         int[] var24 = new int[var17];
         int var25 = class456.method3326(var17 - 1, (byte)100);

         for(int var26 = 0; var26 < var17; ++var26) {
            var24[var26] = class773.method5583(var26, true, var25);
         }

         if (var1 != 0) {
            field4507 = var18;
            field4515 = var20;
            field4516 = var22;
            field4528 = var24;
         } else {
            field4521 = var18;
            field4518 = var20;
            field4532 = var22;
            field4513 = var24;
         }
      }

      int var2 = method2461(8) + 1;
      field4514 = new class91[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         field4514[var3] = new class91();
      }

      int var4 = method2461(6) + 1;

      for(int var5 = 0; var5 < var4; ++var5) {
         method2461(16);
      }

      int var6 = method2461(6) + 1;
      field4520 = new class789[var6];

      for(int var7 = 0; var7 < var6; ++var7) {
         field4520[var7] = new class789();
      }

      int var8 = method2461(6) + 1;
      field4524 = new class654[var8];

      for(int var9 = 0; var9 < var8; ++var9) {
         field4524[var9] = new class654();
      }

      int var10 = method2461(6) + 1;
      field4509 = new class413[var10];

      for(int var11 = 0; var11 < var10; ++var11) {
         field4509[var11] = new class413();
      }

      int var12 = method2461(6) + 1;
      field4534 = new boolean[var12];
      field4529 = new int[var12];

      for(int var13 = 0; var13 < var12; ++var13) {
         field4534[var13] = method2453() != 0;
         method2461(16);
         method2461(16);
         field4529[var13] = method2461(8);
      }

      field4533 = true;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(Lkf;)Z"
   )
   private static final boolean method2457(class266 arg0) {
      if (!field4533) {
         byte[] var1 = arg0.method2037(false, 0, 0);
         if (var1 == null) {
            return false;
         }

         method2456(var1);
      }

      return true;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "([I)Lvea;"
   )
   public final class289 method2458(int[] arg0) {
      if (arg0 != null && arg0[0] <= 0) {
         return null;
      } else {
         if (this.field4537 == null) {
            this.field4525 = 0;
            this.field4508 = new float[field4505];
            this.field4537 = new byte[this.field4517];
            this.field4536 = 0;
            this.field4538 = 0;
         }

         while(this.field4538 < this.field4527.length) {
            if (arg0 != null && arg0[0] <= 0) {
               return null;
            }

            float[] var3 = this.method2455(this.field4538);
            if (var3 != null) {
               int var4 = this.field4536;
               int var5 = var3.length;
               if (var5 > this.field4517 - var4) {
                  var5 = this.field4517 - var4;
               }

               for(int var6 = 0; var6 < var5; ++var6) {
                  int var7 = (int)(var3[var6] * 128.0F + 128.0F);
                  if ((var7 & -256) != 0) {
                     var7 = ~var7 >> 31;
                  }

                  this.field4537[var4++] = (byte)(var7 - 128);
               }

               if (arg0 != null) {
                  arg0[0] -= var4 - this.field4536;
               }

               this.field4536 = var4;
            }

            ++this.field4538;
         }

         this.field4508 = null;
         byte[] var2 = this.field4537;
         this.field4537 = null;
         return new class289(this.field4522, var2, this.field4530, this.field4506, this.field4511);
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "([BI)V"
   )
   private static final void method2459(byte[] arg0, int arg1) {
      field4531 = arg0;
      field4526 = arg1;
      field4512 = 0;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "b",
      descriptor = "([B)V"
   )
   private final void method2460(byte[] arg0) {
      class147 var2 = new class147(arg0);
      this.field4522 = var2.method1164(19693);
      this.field4517 = var2.method1164(19693);
      this.field4530 = var2.method1164(19693);
      this.field4506 = var2.method1164(19693);
      if (this.field4506 < 0) {
         this.field4506 = ~this.field4506;
         this.field4511 = true;
      }

      int var3 = var2.method1164(19693);
      this.field4527 = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.method1143(-15465);
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.method1191(-5766, var5, var7, 0);
         this.field4527[var4] = var7;
      }

   }

   @OriginalMember(
      owner = "client!vn",
      name = "c",
      descriptor = "(I)I"
   )
   public static final int method2461(int arg0) {
      int var1 = 0;
      int var2 = 0;

      while(arg0 >= 8 - field4512) {
         int var4 = 8 - field4512;
         int var5 = (1 << var4) - 1;
         var1 += (field4531[field4526] >> field4512 & var5) << var2;
         field4512 = 0;
         ++field4526;
         var2 += var4;
         arg0 -= var4;
      }

      if (arg0 > 0) {
         int var3 = (1 << arg0) - 1;
         var1 += (field4531[field4526] >> field4512 & var3) << var2;
         field4512 += arg0;
      }

      return var1;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "()V"
   )
   public static void method2462() {
      field4531 = null;
      field4514 = null;
      field4520 = null;
      field4524 = null;
      field4509 = null;
      field4534 = null;
      field4529 = null;
      field4510 = null;
      field4521 = null;
      field4518 = null;
      field4532 = null;
      field4507 = null;
      field4515 = null;
      field4516 = null;
      field4513 = null;
      field4528 = null;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "<init>",
      descriptor = "([B)V"
   )
   private class332(byte[] arg0) {
      this.method2460(arg0);
   }
}
