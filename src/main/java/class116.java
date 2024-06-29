import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class116 extends class347 {
   @OriginalMember(
      owner = "client!eg",
      name = "y",
      descriptor = "Z"
   )
   private static boolean field1385 = false;
   @OriginalMember(
      owner = "client!eg",
      name = "E",
      descriptor = "I"
   )
   private static int field1386;
   @OriginalMember(
      owner = "client!eg",
      name = "J",
      descriptor = "I"
   )
   private static int field1389;
   @OriginalMember(
      owner = "client!eg",
      name = "i",
      descriptor = "I"
   )
   private int field1390;
   @OriginalMember(
      owner = "client!eg",
      name = "B",
      descriptor = "I"
   )
   private int field1395;
   @OriginalMember(
      owner = "client!eg",
      name = "l",
      descriptor = "I"
   )
   private static int field1397;
   @OriginalMember(
      owner = "client!eg",
      name = "r",
      descriptor = "I"
   )
   private int field1399;
   @OriginalMember(
      owner = "client!eg",
      name = "L",
      descriptor = "I"
   )
   private int field1400;
   @OriginalMember(
      owner = "client!eg",
      name = "t",
      descriptor = "I"
   )
   private static int field1403;
   @OriginalMember(
      owner = "client!eg",
      name = "Q",
      descriptor = "I"
   )
   private int field1412;
   @OriginalMember(
      owner = "client!eg",
      name = "D",
      descriptor = "I"
   )
   private int field1415;
   @OriginalMember(
      owner = "client!eg",
      name = "H",
      descriptor = "I"
   )
   private int field1416;
   @OriginalMember(
      owner = "client!eg",
      name = "N",
      descriptor = "I"
   )
   private int field1418;
   @OriginalMember(
      owner = "client!eg",
      name = "x",
      descriptor = "Z"
   )
   private boolean field1401;
   @OriginalMember(
      owner = "client!eg",
      name = "j",
      descriptor = "Z"
   )
   private boolean field1410;
   @OriginalMember(
      owner = "client!eg",
      name = "u",
      descriptor = "[B"
   )
   private static byte[] field1414;
   @OriginalMember(
      owner = "client!eg",
      name = "s",
      descriptor = "[B"
   )
   private byte[] field1417;
   @OriginalMember(
      owner = "client!eg",
      name = "w",
      descriptor = "[F"
   )
   private static float[] field1388;
   @OriginalMember(
      owner = "client!eg",
      name = "K",
      descriptor = "[F"
   )
   private static float[] field1392;
   @OriginalMember(
      owner = "client!eg",
      name = "p",
      descriptor = "[F"
   )
   private static float[] field1393;
   @OriginalMember(
      owner = "client!eg",
      name = "o",
      descriptor = "[F"
   )
   private float[] field1396;
   @OriginalMember(
      owner = "client!eg",
      name = "M",
      descriptor = "[F"
   )
   private static float[] field1406;
   @OriginalMember(
      owner = "client!eg",
      name = "n",
      descriptor = "[F"
   )
   private static float[] field1407;
   @OriginalMember(
      owner = "client!eg",
      name = "F",
      descriptor = "[F"
   )
   private static float[] field1409;
   @OriginalMember(
      owner = "client!eg",
      name = "z",
      descriptor = "[F"
   )
   private static float[] field1411;
   @OriginalMember(
      owner = "client!eg",
      name = "v",
      descriptor = "[I"
   )
   private static int[] field1387;
   @OriginalMember(
      owner = "client!eg",
      name = "m",
      descriptor = "[I"
   )
   private static int[] field1391;
   @OriginalMember(
      owner = "client!eg",
      name = "k",
      descriptor = "[I"
   )
   private static int[] field1408;
   @OriginalMember(
      owner = "client!eg",
      name = "P",
      descriptor = "[Lfq;"
   )
   private static class211[] field1398;
   @OriginalMember(
      owner = "client!eg",
      name = "q",
      descriptor = "[Lsj;"
   )
   private static class484[] field1413;
   @OriginalMember(
      owner = "client!eg",
      name = "C",
      descriptor = "[Lfb;"
   )
   public static class702[] field1405;
   @OriginalMember(
      owner = "client!eg",
      name = "A",
      descriptor = "[Lfm;"
   )
   private static class765[] field1394;
   @OriginalMember(
      owner = "client!eg",
      name = "G",
      descriptor = "[Z"
   )
   private static boolean[] field1402;
   @OriginalMember(
      owner = "client!eg",
      name = "O",
      descriptor = "[[B"
   )
   private byte[][] field1404;

   @OriginalMember(
      owner = "client!eg",
      name = "a",
      descriptor = "(I)[F"
   )
   private final float[] method964(int arg0) {
      method975(this.field1404[arg0], 0);
      method969();
      int var2 = method967(class788.method5654(29990, field1391.length - 1));
      boolean var3 = field1402[var2];
      int var4 = var3 ? field1403 : field1389;
      boolean var5 = false;
      boolean var6 = false;
      if (var3) {
         var5 = method969() != 0;
         var6 = method969() != 0;
      }

      int var7 = var4 >> 1;
      int var8;
      int var9;
      int var10;
      if (var3 && !var5) {
         var8 = (var4 >> 2) - (field1389 >> 2);
         var9 = (field1389 >> 2) + (var4 >> 2);
         var10 = field1389 >> 1;
      } else {
         var8 = 0;
         var9 = var7;
         var10 = var4 >> 1;
      }

      int var11;
      int var12;
      int var13;
      if (var3 && !var6) {
         var11 = var4 - (var4 >> 2) - (field1389 >> 2);
         var12 = (field1389 >> 2) + (var4 - (var4 >> 2));
         var13 = field1389 >> 1;
      } else {
         var11 = var7;
         var12 = var4;
         var13 = var4 >> 1;
      }

      class484 var14 = field1413[field1391[var2]];
      int var15 = var14.field7177;
      int var16 = var14.field7179[var15];
      boolean var17 = !field1398[var16].method1596();
      boolean var18 = var17;

      for(int var19 = 0; var19 < var14.field7178; ++var19) {
         class765 var95 = field1394[var14.field7176[var19]];
         float[] var96 = field1407;
         var95.method5541(var96, var4 >> 1, var18);
      }

      if (!var17) {
         int var20 = var14.field7177;
         int var21 = var14.field7179[var20];
         field1398[var21].method1599(field1407, var4 >> 1);
      }

      if (var17) {
         for(int var22 = var4 >> 1; var22 < var4; ++var22) {
            field1407[var22] = 0.0F;
         }
      } else {
         int var23 = var4 >> 1;
         int var24 = var4 >> 2;
         int var25 = var4 >> 3;
         float[] var26 = field1407;

         for(int var27 = 0; var27 < var23; ++var27) {
            var26[var27] *= 0.5F;
         }

         for(int var28 = var23; var28 < var4; ++var28) {
            var26[var28] = -var26[var4 - var28 - 1];
         }

         float[] var29 = var3 ? field1392 : field1409;
         float[] var30 = var3 ? field1411 : field1406;
         float[] var31 = var3 ? field1388 : field1393;
         int[] var32 = var3 ? field1387 : field1408;

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

         int var35 = class788.method5654(29990, var4 - 1);

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
            field1407[var46] *= (float)Math.sin((double)var56 * 1.5707963267948966D * (double)var56);
         }

         for(int var47 = var11; var47 < var12; ++var47) {
            float var55 = (float)Math.sin(((double)(var47 - var11) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            field1407[var47] *= (float)Math.sin((double)var55 * 1.5707963267948966D * (double)var55);
         }
      }

      float[] var48 = null;
      if (this.field1412 > 0) {
         int var49 = this.field1412 + var4 >> 2;
         var48 = new float[var49];
         if (!this.field1401) {
            for(int var50 = 0; var50 < this.field1400; ++var50) {
               int var51 = (this.field1412 >> 1) + var50;
               var48[var50] += this.field1396[var51];
            }
         }

         if (!var17) {
            for(int var52 = var8; var52 < var4 >> 1; ++var52) {
               int var53 = var48.length - (var4 >> 1) + var52;
               var48[var53] += field1407[var52];
            }
         }
      }

      float[] var54 = this.field1396;
      this.field1396 = field1407;
      field1407 = var54;
      this.field1412 = var4;
      this.field1400 = var12 - (var4 >> 1);
      this.field1401 = var17;
      return var48;
   }

   @OriginalMember(
      owner = "client!eg",
      name = "a",
      descriptor = "(Leaa;I)Leg;"
   )
   public static final class116 method965(class526 arg0, int arg1) {
      if (!method972(arg0)) {
         arg0.method3884((byte)-99, arg1);
         return null;
      } else {
         byte[] var2 = arg0.method3888((byte)40, arg1);
         return var2 == null ? null : new class116(var2);
      }
   }

   @OriginalMember(
      owner = "client!eg",
      name = "a",
      descriptor = "([B)V"
   )
   private final void method966(byte[] arg0) {
      class128 var2 = new class128(arg0);
      this.field1415 = var2.method1041(4758);
      this.field1395 = var2.method1041(4758);
      this.field1399 = var2.method1041(4758);
      this.field1390 = var2.method1041(4758);
      if (this.field1390 < 0) {
         this.field1390 = ~this.field1390;
         this.field1410 = true;
      }

      int var3 = var2.method1041(4758);
      this.field1404 = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.method1104(255);
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.method1102(var5, var7, 0, (byte)49);
         this.field1404[var4] = var7;
      }

   }

   @OriginalMember(
      owner = "client!eg",
      name = "b",
      descriptor = "(I)I"
   )
   public static final int method967(int arg0) {
      int var1 = 0;
      int var2 = 0;

      while(arg0 >= 8 - field1386) {
         int var4 = 8 - field1386;
         int var5 = (1 << var4) - 1;
         var1 += (field1414[field1397] >> field1386 & var5) << var2;
         field1386 = 0;
         ++field1397;
         var2 += var4;
         arg0 -= var4;
      }

      if (arg0 > 0) {
         int var3 = (1 << arg0) - 1;
         var1 += (field1414[field1397] >> field1386 & var3) << var2;
         field1386 += arg0;
      }

      return var1;
   }

   @OriginalMember(
      owner = "client!eg",
      name = "a",
      descriptor = "()V"
   )
   public static void method968() {
      field1414 = null;
      field1405 = null;
      field1398 = null;
      field1394 = null;
      field1413 = null;
      field1402 = null;
      field1391 = null;
      field1407 = null;
      field1409 = null;
      field1406 = null;
      field1393 = null;
      field1392 = null;
      field1411 = null;
      field1388 = null;
      field1408 = null;
      field1387 = null;
   }

   @OriginalMember(
      owner = "client!eg",
      name = "b",
      descriptor = "()I"
   )
   public static final int method969() {
      int var0 = field1414[field1397] >> field1386 & 1;
      ++field1386;
      field1397 += field1386 >> 3;
      field1386 &= 7;
      return var0;
   }

   @OriginalMember(
      owner = "client!eg",
      name = "a",
      descriptor = "([I)Ljaa;"
   )
   public final class640 method970(int[] arg0) {
      if (arg0 != null && arg0[0] <= 0) {
         return null;
      } else {
         if (this.field1417 == null) {
            this.field1412 = 0;
            this.field1396 = new float[field1403];
            this.field1417 = new byte[this.field1395];
            this.field1418 = 0;
            this.field1416 = 0;
         }

         while(this.field1416 < this.field1404.length) {
            if (arg0 != null && arg0[0] <= 0) {
               return null;
            }

            float[] var3 = this.method964(this.field1416);
            if (var3 != null) {
               int var4 = this.field1418;
               int var5 = var3.length;
               if (var5 > this.field1395 - var4) {
                  var5 = this.field1395 - var4;
               }

               for(int var6 = 0; var6 < var5; ++var6) {
                  int var7 = (int)(var3[var6] * 128.0F + 128.0F);
                  if ((var7 & -256) != 0) {
                     var7 = ~var7 >> 31;
                  }

                  this.field1417[var4++] = (byte)(var7 - 128);
               }

               if (arg0 != null) {
                  arg0[0] -= var4 - this.field1418;
               }

               this.field1418 = var4;
            }

            ++this.field1416;
         }

         this.field1396 = null;
         byte[] var2 = this.field1417;
         this.field1417 = null;
         return new class640(this.field1415, var2, this.field1399, this.field1390, this.field1410);
      }
   }

   @OriginalMember(
      owner = "client!eg",
      name = "e",
      descriptor = "(I)F"
   )
   public static final float method971(int arg0) {
      int var1 = arg0 & 2097151;
      int var2 = arg0 & Integer.MIN_VALUE;
      int var3 = (arg0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }

   @OriginalMember(
      owner = "client!eg",
      name = "a",
      descriptor = "(Leaa;)Z"
   )
   private static final boolean method972(class526 arg0) {
      if (!field1385) {
         byte[] var1 = arg0.method3899(-112, 0, 0);
         if (var1 == null) {
            return false;
         }

         method973(var1);
      }

      return true;
   }

   @OriginalMember(
      owner = "client!eg",
      name = "b",
      descriptor = "([B)V"
   )
   private static final void method973(byte[] arg0) {
      method975(arg0, 0);
      field1389 = 1 << method967(4);
      field1403 = 1 << method967(4);
      field1407 = new float[field1403];

      for(int var1 = 0; var1 < 2; ++var1) {
         int var14 = var1 != 0 ? field1403 : field1389;
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
         int var25 = class788.method5654(29990, var17 - 1);

         for(int var26 = 0; var26 < var17; ++var26) {
            var24[var26] = class354.method2764(var25, var26, (byte)37);
         }

         if (var1 != 0) {
            field1392 = var18;
            field1411 = var20;
            field1388 = var22;
            field1387 = var24;
         } else {
            field1409 = var18;
            field1406 = var20;
            field1393 = var22;
            field1408 = var24;
         }
      }

      int var2 = method967(8) + 1;
      field1405 = new class702[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         field1405[var3] = new class702();
      }

      int var4 = method967(6) + 1;

      for(int var5 = 0; var5 < var4; ++var5) {
         method967(16);
      }

      int var6 = method967(6) + 1;
      field1398 = new class211[var6];

      for(int var7 = 0; var7 < var6; ++var7) {
         field1398[var7] = new class211();
      }

      int var8 = method967(6) + 1;
      field1394 = new class765[var8];

      for(int var9 = 0; var9 < var8; ++var9) {
         field1394[var9] = new class765();
      }

      int var10 = method967(6) + 1;
      field1413 = new class484[var10];

      for(int var11 = 0; var11 < var10; ++var11) {
         field1413[var11] = new class484();
      }

      int var12 = method967(6) + 1;
      field1402 = new boolean[var12];
      field1391 = new int[var12];

      for(int var13 = 0; var13 < var12; ++var13) {
         field1402[var13] = method969() != 0;
         method967(16);
         method967(16);
         field1391[var13] = method967(8);
      }

      field1385 = true;
   }

   @OriginalMember(
      owner = "client!eg",
      name = "a",
      descriptor = "(Leaa;II)Leg;"
   )
   public static final class116 method974(class526 arg0, int arg1, int arg2) {
      if (!method972(arg0)) {
         arg0.method3889(arg2, -115, arg1);
         return null;
      } else {
         byte[] var3 = arg0.method3899(-78, arg2, arg1);
         return var3 == null ? null : new class116(var3);
      }
   }

   @OriginalMember(
      owner = "client!eg",
      name = "a",
      descriptor = "([BI)V"
   )
   private static final void method975(byte[] arg0, int arg1) {
      field1414 = arg0;
      field1397 = arg1;
      field1386 = 0;
   }

   @OriginalMember(
      owner = "client!eg",
      name = "<init>",
      descriptor = "([B)V"
   )
   private class116(byte[] arg0) {
      this.method966(arg0);
   }
}
