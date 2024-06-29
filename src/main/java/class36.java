import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class36 extends class500 {
   @OriginalMember(
      owner = "client!wv",
      name = "B",
      descriptor = "Z"
   )
   private static boolean field427 = false;
   @OriginalMember(
      owner = "client!wv",
      name = "I",
      descriptor = "I"
   )
   private int field406;
   @OriginalMember(
      owner = "client!wv",
      name = "N",
      descriptor = "I"
   )
   private int field408;
   @OriginalMember(
      owner = "client!wv",
      name = "K",
      descriptor = "I"
   )
   private int field410;
   @OriginalMember(
      owner = "client!wv",
      name = "H",
      descriptor = "I"
   )
   private int field411;
   @OriginalMember(
      owner = "client!wv",
      name = "y",
      descriptor = "I"
   )
   private static int field414;
   @OriginalMember(
      owner = "client!wv",
      name = "O",
      descriptor = "I"
   )
   private static int field416;
   @OriginalMember(
      owner = "client!wv",
      name = "E",
      descriptor = "I"
   )
   private static int field420;
   @OriginalMember(
      owner = "client!wv",
      name = "A",
      descriptor = "I"
   )
   private int field423;
   @OriginalMember(
      owner = "client!wv",
      name = "l",
      descriptor = "I"
   )
   private int field429;
   @OriginalMember(
      owner = "client!wv",
      name = "D",
      descriptor = "I"
   )
   private static int field430;
   @OriginalMember(
      owner = "client!wv",
      name = "p",
      descriptor = "I"
   )
   private int field431;
   @OriginalMember(
      owner = "client!wv",
      name = "J",
      descriptor = "I"
   )
   private int field434;
   @OriginalMember(
      owner = "client!wv",
      name = "u",
      descriptor = "Z"
   )
   private boolean field407;
   @OriginalMember(
      owner = "client!wv",
      name = "z",
      descriptor = "Z"
   )
   private boolean field417;
   @OriginalMember(
      owner = "client!wv",
      name = "x",
      descriptor = "[B"
   )
   private static byte[] field426;
   @OriginalMember(
      owner = "client!wv",
      name = "q",
      descriptor = "[B"
   )
   private byte[] field432;
   @OriginalMember(
      owner = "client!wv",
      name = "n",
      descriptor = "[F"
   )
   private static float[] field401;
   @OriginalMember(
      owner = "client!wv",
      name = "k",
      descriptor = "[F"
   )
   private static float[] field403;
   @OriginalMember(
      owner = "client!wv",
      name = "G",
      descriptor = "[F"
   )
   private static float[] field405;
   @OriginalMember(
      owner = "client!wv",
      name = "F",
      descriptor = "[F"
   )
   private static float[] field418;
   @OriginalMember(
      owner = "client!wv",
      name = "t",
      descriptor = "[F"
   )
   private static float[] field419;
   @OriginalMember(
      owner = "client!wv",
      name = "C",
      descriptor = "[F"
   )
   private float[] field424;
   @OriginalMember(
      owner = "client!wv",
      name = "o",
      descriptor = "[F"
   )
   private static float[] field425;
   @OriginalMember(
      owner = "client!wv",
      name = "m",
      descriptor = "[F"
   )
   private static float[] field433;
   @OriginalMember(
      owner = "client!wv",
      name = "s",
      descriptor = "[I"
   )
   private static int[] field402;
   @OriginalMember(
      owner = "client!wv",
      name = "j",
      descriptor = "[I"
   )
   private static int[] field412;
   @OriginalMember(
      owner = "client!wv",
      name = "L",
      descriptor = "[I"
   )
   private static int[] field415;
   @OriginalMember(
      owner = "client!wv",
      name = "w",
      descriptor = "[Lvc;"
   )
   private static class337[] field409;
   @OriginalMember(
      owner = "client!wv",
      name = "M",
      descriptor = "[Lml;"
   )
   public static class410[] field413;
   @OriginalMember(
      owner = "client!wv",
      name = "r",
      descriptor = "[Lkia;"
   )
   private static class652[] field428;
   @OriginalMember(
      owner = "client!wv",
      name = "Q",
      descriptor = "[Lhia;"
   )
   private static class72[] field404;
   @OriginalMember(
      owner = "client!wv",
      name = "v",
      descriptor = "[Z"
   )
   private static boolean[] field422;
   @OriginalMember(
      owner = "client!wv",
      name = "P",
      descriptor = "[[B"
   )
   private byte[][] field421;

   @OriginalMember(
      owner = "client!wv",
      name = "a",
      descriptor = "(Lqh;II)Lwv;"
   )
   public static final class36 method275(class74 arg0, int arg1, int arg2) {
      if (!method280(arg0)) {
         arg0.method724(-25048, arg1, arg2);
         return null;
      } else {
         byte[] var3 = arg0.method732(arg2, arg1, (byte)112);
         return var3 == null ? null : new class36(var3);
      }
   }

   @OriginalMember(
      owner = "client!wv",
      name = "a",
      descriptor = "(I)I"
   )
   public static final int method276(int arg0) {
      int var1 = 0;
      int var2 = 0;

      while(arg0 >= 8 - field430) {
         int var4 = 8 - field430;
         int var5 = (1 << var4) - 1;
         var1 += (field426[field420] >> field430 & var5) << var2;
         field430 = 0;
         ++field420;
         var2 += var4;
         arg0 -= var4;
      }

      if (arg0 > 0) {
         int var3 = (1 << arg0) - 1;
         var1 += (field426[field420] >> field430 & var3) << var2;
         field430 += arg0;
      }

      return var1;
   }

   @OriginalMember(
      owner = "client!wv",
      name = "b",
      descriptor = "()V"
   )
   public static void method277() {
      field426 = null;
      field413 = null;
      field409 = null;
      field404 = null;
      field428 = null;
      field422 = null;
      field415 = null;
      field403 = null;
      field418 = null;
      field433 = null;
      field419 = null;
      field405 = null;
      field401 = null;
      field425 = null;
      field412 = null;
      field402 = null;
   }

   @OriginalMember(
      owner = "client!wv",
      name = "a",
      descriptor = "([I)Lin;"
   )
   public final class98 method278(int[] arg0) {
      if (arg0 != null && arg0[0] <= 0) {
         return null;
      } else {
         if (this.field432 == null) {
            this.field410 = 0;
            this.field424 = new float[field416];
            this.field432 = new byte[this.field411];
            this.field431 = 0;
            this.field434 = 0;
         }

         while(this.field434 < this.field421.length) {
            if (arg0 != null && arg0[0] <= 0) {
               return null;
            }

            float[] var3 = this.method284(this.field434);
            if (var3 != null) {
               int var4 = this.field431;
               int var5 = var3.length;
               if (var5 > this.field411 - var4) {
                  var5 = this.field411 - var4;
               }

               for(int var6 = 0; var6 < var5; ++var6) {
                  int var7 = (int)(var3[var6] * 128.0F + 128.0F);
                  if ((var7 & -256) != 0) {
                     var7 = ~var7 >> 31;
                  }

                  this.field432[var4++] = (byte)(var7 - 128);
               }

               if (arg0 != null) {
                  arg0[0] -= var4 - this.field431;
               }

               this.field431 = var4;
            }

            ++this.field434;
         }

         this.field424 = null;
         byte[] var2 = this.field432;
         this.field432 = null;
         return new class98(this.field423, var2, this.field429, this.field406, this.field417);
      }
   }

   @OriginalMember(
      owner = "client!wv",
      name = "a",
      descriptor = "([BI)V"
   )
   private static final void method279(byte[] arg0, int arg1) {
      field426 = arg0;
      field420 = arg1;
      field430 = 0;
   }

   @OriginalMember(
      owner = "client!wv",
      name = "a",
      descriptor = "(Lqh;)Z"
   )
   private static final boolean method280(class74 arg0) {
      if (!field427) {
         byte[] var1 = arg0.method732(0, 0, (byte)97);
         if (var1 == null) {
            return false;
         }

         method283(var1);
      }

      return true;
   }

   @OriginalMember(
      owner = "client!wv",
      name = "b",
      descriptor = "([B)V"
   )
   private final void method281(byte[] arg0) {
      class594 var2 = new class594(arg0);
      this.field423 = var2.method4302(true);
      this.field411 = var2.method4302(true);
      this.field429 = var2.method4302(true);
      this.field406 = var2.method4302(true);
      if (this.field406 < 0) {
         this.field406 = ~this.field406;
         this.field417 = true;
      }

      int var3 = var2.method4302(true);
      this.field421 = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.method4288((byte)59);
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.method4276(var7, var5, 0, 0);
         this.field421[var4] = var7;
      }

   }

   @OriginalMember(
      owner = "client!wv",
      name = "a",
      descriptor = "()I"
   )
   public static final int method282() {
      int var0 = field426[field420] >> field430 & 1;
      ++field430;
      field420 += field430 >> 3;
      field430 &= 7;
      return var0;
   }

   @OriginalMember(
      owner = "client!wv",
      name = "a",
      descriptor = "([B)V"
   )
   private static final void method283(byte[] arg0) {
      method279(arg0, 0);
      field414 = 1 << method276(4);
      field416 = 1 << method276(4);
      field403 = new float[field416];

      for(int var1 = 0; var1 < 2; ++var1) {
         int var14 = var1 != 0 ? field416 : field414;
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
         int var25 = class138.method1155(var17 - 1, (byte)-122);

         for(int var26 = 0; var26 < var17; ++var26) {
            var24[var26] = class559.method4026(var25, var26, (byte)108);
         }

         if (var1 != 0) {
            field405 = var18;
            field401 = var20;
            field425 = var22;
            field402 = var24;
         } else {
            field418 = var18;
            field433 = var20;
            field419 = var22;
            field412 = var24;
         }
      }

      int var2 = method276(8) + 1;
      field413 = new class410[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         field413[var3] = new class410();
      }

      int var4 = method276(6) + 1;

      for(int var5 = 0; var5 < var4; ++var5) {
         method276(16);
      }

      int var6 = method276(6) + 1;
      field409 = new class337[var6];

      for(int var7 = 0; var7 < var6; ++var7) {
         field409[var7] = new class337();
      }

      int var8 = method276(6) + 1;
      field404 = new class72[var8];

      for(int var9 = 0; var9 < var8; ++var9) {
         field404[var9] = new class72();
      }

      int var10 = method276(6) + 1;
      field428 = new class652[var10];

      for(int var11 = 0; var11 < var10; ++var11) {
         field428[var11] = new class652();
      }

      int var12 = method276(6) + 1;
      field422 = new boolean[var12];
      field415 = new int[var12];

      for(int var13 = 0; var13 < var12; ++var13) {
         field422[var13] = method282() != 0;
         method276(16);
         method276(16);
         field415[var13] = method276(8);
      }

      field427 = true;
   }

   @OriginalMember(
      owner = "client!wv",
      name = "e",
      descriptor = "(I)[F"
   )
   private final float[] method284(int arg0) {
      method279(this.field421[arg0], 0);
      method282();
      int var2 = method276(class138.method1155(field415.length - 1, (byte)-122));
      boolean var3 = field422[var2];
      int var4 = var3 ? field416 : field414;
      boolean var5 = false;
      boolean var6 = false;
      if (var3) {
         var5 = method282() != 0;
         var6 = method282() != 0;
      }

      int var7 = var4 >> 1;
      int var8;
      int var9;
      int var10;
      if (var3 && !var5) {
         var8 = (var4 >> 2) - (field414 >> 2);
         var9 = (field414 >> 2) + (var4 >> 2);
         var10 = field414 >> 1;
      } else {
         var8 = 0;
         var9 = var7;
         var10 = var4 >> 1;
      }

      int var11;
      int var12;
      int var13;
      if (var3 && !var6) {
         var11 = var4 - (var4 >> 2) - (field414 >> 2);
         var12 = (field414 >> 2) + (var4 - (var4 >> 2));
         var13 = field414 >> 1;
      } else {
         var11 = var7;
         var12 = var4;
         var13 = var4 >> 1;
      }

      class652 var14 = field428[field415[var2]];
      int var15 = var14.field9141;
      int var16 = var14.field9142[var15];
      boolean var17 = !field409[var16].method2673();
      boolean var18 = var17;

      for(int var19 = 0; var19 < var14.field9139; ++var19) {
         class72 var95 = field404[var14.field9140[var19]];
         float[] var96 = field403;
         var95.method701(var96, var4 >> 1, var18);
      }

      if (!var17) {
         int var20 = var14.field9141;
         int var21 = var14.field9142[var20];
         field409[var21].method2672(field403, var4 >> 1);
      }

      if (var17) {
         for(int var22 = var4 >> 1; var22 < var4; ++var22) {
            field403[var22] = 0.0F;
         }
      } else {
         int var23 = var4 >> 1;
         int var24 = var4 >> 2;
         int var25 = var4 >> 3;
         float[] var26 = field403;

         for(int var27 = 0; var27 < var23; ++var27) {
            var26[var27] *= 0.5F;
         }

         for(int var28 = var23; var28 < var4; ++var28) {
            var26[var28] = -var26[var4 - var28 - 1];
         }

         float[] var29 = var3 ? field405 : field418;
         float[] var30 = var3 ? field401 : field433;
         float[] var31 = var3 ? field425 : field419;
         int[] var32 = var3 ? field402 : field412;

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

         int var35 = class138.method1155(var4 - 1, (byte)-122);

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
            field403[var46] *= (float)Math.sin((double)var56 * 1.5707963267948966D * (double)var56);
         }

         for(int var47 = var11; var47 < var12; ++var47) {
            float var55 = (float)Math.sin(((double)(var47 - var11) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            field403[var47] *= (float)Math.sin((double)var55 * 1.5707963267948966D * (double)var55);
         }
      }

      float[] var48 = null;
      if (this.field410 > 0) {
         int var49 = this.field410 + var4 >> 2;
         var48 = new float[var49];
         if (!this.field407) {
            for(int var50 = 0; var50 < this.field408; ++var50) {
               int var51 = (this.field410 >> 1) + var50;
               var48[var50] += this.field424[var51];
            }
         }

         if (!var17) {
            for(int var52 = var8; var52 < var4 >> 1; ++var52) {
               int var53 = var48.length - (var4 >> 1) + var52;
               var48[var53] += field403[var52];
            }
         }
      }

      float[] var54 = this.field424;
      this.field424 = field403;
      field403 = var54;
      this.field410 = var4;
      this.field408 = var12 - (var4 >> 1);
      this.field407 = var17;
      return var48;
   }

   @OriginalMember(
      owner = "client!wv",
      name = "<init>",
      descriptor = "([B)V"
   )
   private class36(byte[] arg0) {
      this.method281(arg0);
   }

   @OriginalMember(
      owner = "client!wv",
      name = "a",
      descriptor = "(Lqh;I)Lwv;"
   )
   public static final class36 method285(class74 arg0, int arg1) {
      if (!method280(arg0)) {
         arg0.method717(arg1, (byte)-58);
         return null;
      } else {
         byte[] var2 = arg0.method733(arg1, (byte)-71);
         return var2 == null ? null : new class36(var2);
      }
   }

   @OriginalMember(
      owner = "client!wv",
      name = "b",
      descriptor = "(I)F"
   )
   public static final float method286(int arg0) {
      int var1 = arg0 & 2097151;
      int var2 = arg0 & Integer.MIN_VALUE;
      int var3 = (arg0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }
}
