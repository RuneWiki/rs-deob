import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class214 extends class22 {
   @OriginalMember(
      owner = "client!sa",
      name = "j",
      descriptor = "Z"
   )
   private static boolean field3188 = false;
   @OriginalMember(
      owner = "client!sa",
      name = "P",
      descriptor = "I"
   )
   private static int field3193;
   @OriginalMember(
      owner = "client!sa",
      name = "Q",
      descriptor = "I"
   )
   private int field3194;
   @OriginalMember(
      owner = "client!sa",
      name = "v",
      descriptor = "I"
   )
   private int field3196;
   @OriginalMember(
      owner = "client!sa",
      name = "D",
      descriptor = "I"
   )
   private static int field3197;
   @OriginalMember(
      owner = "client!sa",
      name = "F",
      descriptor = "I"
   )
   private int field3200;
   @OriginalMember(
      owner = "client!sa",
      name = "H",
      descriptor = "I"
   )
   private static int field3205;
   @OriginalMember(
      owner = "client!sa",
      name = "r",
      descriptor = "I"
   )
   private int field3210;
   @OriginalMember(
      owner = "client!sa",
      name = "n",
      descriptor = "I"
   )
   private int field3212;
   @OriginalMember(
      owner = "client!sa",
      name = "K",
      descriptor = "I"
   )
   private int field3214;
   @OriginalMember(
      owner = "client!sa",
      name = "x",
      descriptor = "I"
   )
   private int field3216;
   @OriginalMember(
      owner = "client!sa",
      name = "z",
      descriptor = "I"
   )
   private int field3218;
   @OriginalMember(
      owner = "client!sa",
      name = "l",
      descriptor = "I"
   )
   private static int field3220;
   @OriginalMember(
      owner = "client!sa",
      name = "E",
      descriptor = "Z"
   )
   private boolean field3189;
   @OriginalMember(
      owner = "client!sa",
      name = "u",
      descriptor = "Z"
   )
   private boolean field3206;
   @OriginalMember(
      owner = "client!sa",
      name = "p",
      descriptor = "[B"
   )
   private static byte[] field3201;
   @OriginalMember(
      owner = "client!sa",
      name = "o",
      descriptor = "[B"
   )
   private byte[] field3219;
   @OriginalMember(
      owner = "client!sa",
      name = "N",
      descriptor = "[F"
   )
   private static float[] field3190;
   @OriginalMember(
      owner = "client!sa",
      name = "s",
      descriptor = "[F"
   )
   private static float[] field3191;
   @OriginalMember(
      owner = "client!sa",
      name = "J",
      descriptor = "[F"
   )
   private static float[] field3195;
   @OriginalMember(
      owner = "client!sa",
      name = "A",
      descriptor = "[F"
   )
   private static float[] field3202;
   @OriginalMember(
      owner = "client!sa",
      name = "C",
      descriptor = "[F"
   )
   private float[] field3203;
   @OriginalMember(
      owner = "client!sa",
      name = "q",
      descriptor = "[F"
   )
   private static float[] field3215;
   @OriginalMember(
      owner = "client!sa",
      name = "y",
      descriptor = "[F"
   )
   private static float[] field3217;
   @OriginalMember(
      owner = "client!sa",
      name = "G",
      descriptor = "[F"
   )
   private static float[] field3221;
   @OriginalMember(
      owner = "client!sa",
      name = "w",
      descriptor = "[I"
   )
   private static int[] field3192;
   @OriginalMember(
      owner = "client!sa",
      name = "k",
      descriptor = "[I"
   )
   private static int[] field3198;
   @OriginalMember(
      owner = "client!sa",
      name = "m",
      descriptor = "[I"
   )
   private static int[] field3209;
   @OriginalMember(
      owner = "client!sa",
      name = "M",
      descriptor = "[Ljf;"
   )
   public static class225[] field3208;
   @OriginalMember(
      owner = "client!sa",
      name = "B",
      descriptor = "[Lb;"
   )
   private static class351[] field3204;
   @OriginalMember(
      owner = "client!sa",
      name = "t",
      descriptor = "[Llv;"
   )
   private static class466[] field3213;
   @OriginalMember(
      owner = "client!sa",
      name = "O",
      descriptor = "[Liu;"
   )
   private static class602[] field3199;
   @OriginalMember(
      owner = "client!sa",
      name = "I",
      descriptor = "[Z"
   )
   private static boolean[] field3211;
   @OriginalMember(
      owner = "client!sa",
      name = "L",
      descriptor = "[[B"
   )
   private byte[][] field3207;

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(Lhw;II)Lsa;"
   )
   public static final class214 method1819(class141 arg0, int arg1, int arg2) {
      if (!method1827(arg0)) {
         arg0.method1339(arg2, -102, arg1);
         return null;
      } else {
         byte[] var3 = arg0.method1347((byte)126, arg1, arg2);
         return var3 == null ? null : new class214(var3);
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "b",
      descriptor = "([B)V"
   )
   private static final void method1820(byte[] arg0) {
      method1825(arg0, 0);
      field3220 = 1 << method1824(4);
      field3205 = 1 << method1824(4);
      field3195 = new float[field3205];

      for(int var1 = 0; var1 < 2; ++var1) {
         int var14 = var1 != 0 ? field3205 : field3220;
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
         int var25 = class752.method5444(-61, var17 - 1);

         for(int var26 = 0; var26 < var17; ++var26) {
            var24[var26] = class416.method3176(true, var26, var25);
         }

         if (var1 != 0) {
            field3190 = var18;
            field3215 = var20;
            field3191 = var22;
            field3209 = var24;
         } else {
            field3202 = var18;
            field3217 = var20;
            field3221 = var22;
            field3192 = var24;
         }
      }

      int var2 = method1824(8) + 1;
      field3208 = new class225[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         field3208[var3] = new class225();
      }

      int var4 = method1824(6) + 1;

      for(int var5 = 0; var5 < var4; ++var5) {
         method1824(16);
      }

      int var6 = method1824(6) + 1;
      field3213 = new class466[var6];

      for(int var7 = 0; var7 < var6; ++var7) {
         field3213[var7] = new class466();
      }

      int var8 = method1824(6) + 1;
      field3199 = new class602[var8];

      for(int var9 = 0; var9 < var8; ++var9) {
         field3199[var9] = new class602();
      }

      int var10 = method1824(6) + 1;
      field3204 = new class351[var10];

      for(int var11 = 0; var11 < var10; ++var11) {
         field3204[var11] = new class351();
      }

      int var12 = method1824(6) + 1;
      field3211 = new boolean[var12];
      field3198 = new int[var12];

      for(int var13 = 0; var13 < var12; ++var13) {
         field3211[var13] = method1828() != 0;
         method1824(16);
         method1824(16);
         field3198[var13] = method1824(8);
      }

      field3188 = true;
   }

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "()V"
   )
   public static void method1821() {
      field3201 = null;
      field3208 = null;
      field3213 = null;
      field3199 = null;
      field3204 = null;
      field3211 = null;
      field3198 = null;
      field3195 = null;
      field3202 = null;
      field3217 = null;
      field3221 = null;
      field3190 = null;
      field3215 = null;
      field3191 = null;
      field3192 = null;
      field3209 = null;
   }

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(Lhw;I)Lsa;"
   )
   public static final class214 method1822(class141 arg0, int arg1) {
      if (!method1827(arg0)) {
         arg0.method1335((byte)115, arg1);
         return null;
      } else {
         byte[] var2 = arg0.method1331((byte)-98, arg1);
         return var2 == null ? null : new class214(var2);
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "([I)Lri;"
   )
   public final class122 method1823(int[] arg0) {
      if (arg0 != null && arg0[0] <= 0) {
         return null;
      } else {
         if (this.field3219 == null) {
            this.field3212 = 0;
            this.field3203 = new float[field3205];
            this.field3219 = new byte[this.field3210];
            this.field3218 = 0;
            this.field3216 = 0;
         }

         while(this.field3216 < this.field3207.length) {
            if (arg0 != null && arg0[0] <= 0) {
               return null;
            }

            float[] var3 = this.method1830(this.field3216);
            if (var3 != null) {
               int var4 = this.field3218;
               int var5 = var3.length;
               if (var5 > this.field3210 - var4) {
                  var5 = this.field3210 - var4;
               }

               for(int var6 = 0; var6 < var5; ++var6) {
                  int var7 = (int)(var3[var6] * 128.0F + 128.0F);
                  if ((var7 & -256) != 0) {
                     var7 = ~var7 >> 31;
                  }

                  this.field3219[var4++] = (byte)(var7 - 128);
               }

               if (arg0 != null) {
                  arg0[0] -= var4 - this.field3218;
               }

               this.field3218 = var4;
            }

            ++this.field3216;
         }

         this.field3203 = null;
         byte[] var2 = this.field3219;
         this.field3219 = null;
         return new class122(this.field3196, var2, this.field3194, this.field3200, this.field3189);
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(I)I"
   )
   public static final int method1824(int arg0) {
      int var1 = 0;
      int var2 = 0;

      while(arg0 >= 8 - field3193) {
         int var4 = 8 - field3193;
         int var5 = (1 << var4) - 1;
         var1 += (field3201[field3197] >> field3193 & var5) << var2;
         field3193 = 0;
         ++field3197;
         var2 += var4;
         arg0 -= var4;
      }

      if (arg0 > 0) {
         int var3 = (1 << arg0) - 1;
         var1 += (field3201[field3197] >> field3193 & var3) << var2;
         field3193 += arg0;
      }

      return var1;
   }

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "([BI)V"
   )
   private static final void method1825(byte[] arg0, int arg1) {
      field3201 = arg0;
      field3197 = arg1;
      field3193 = 0;
   }

   @OriginalMember(
      owner = "client!sa",
      name = "b",
      descriptor = "(I)F"
   )
   public static final float method1826(int arg0) {
      int var1 = arg0 & 2097151;
      int var2 = arg0 & Integer.MIN_VALUE;
      int var3 = (arg0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(Lhw;)Z"
   )
   private static final boolean method1827(class141 arg0) {
      if (!field3188) {
         byte[] var1 = arg0.method1347((byte)125, 0, 0);
         if (var1 == null) {
            return false;
         }

         method1820(var1);
      }

      return true;
   }

   @OriginalMember(
      owner = "client!sa",
      name = "b",
      descriptor = "()I"
   )
   public static final int method1828() {
      int var0 = field3201[field3197] >> field3193 & 1;
      ++field3193;
      field3197 += field3193 >> 3;
      field3193 &= 7;
      return var0;
   }

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "([B)V"
   )
   private final void method1829(byte[] arg0) {
      class473 var2 = new class473(arg0);
      this.field3196 = var2.method3567(31871);
      this.field3210 = var2.method3567(31871);
      this.field3194 = var2.method3567(31871);
      this.field3200 = var2.method3567(31871);
      if (this.field3200 < 0) {
         this.field3200 = ~this.field3200;
         this.field3189 = true;
      }

      int var3 = var2.method3567(31871);
      this.field3207 = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.method3564((byte)-83);
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.method3562(0, var7, -121, var5);
         this.field3207[var4] = var7;
      }

   }

   @OriginalMember(
      owner = "client!sa",
      name = "e",
      descriptor = "(I)[F"
   )
   private final float[] method1830(int arg0) {
      method1825(this.field3207[arg0], 0);
      method1828();
      int var2 = method1824(class752.method5444(-62, field3198.length - 1));
      boolean var3 = field3211[var2];
      int var4 = var3 ? field3205 : field3220;
      boolean var5 = false;
      boolean var6 = false;
      if (var3) {
         var5 = method1828() != 0;
         var6 = method1828() != 0;
      }

      int var7 = var4 >> 1;
      int var8;
      int var9;
      int var10;
      if (var3 && !var5) {
         var8 = (var4 >> 2) - (field3220 >> 2);
         var9 = (field3220 >> 2) + (var4 >> 2);
         var10 = field3220 >> 1;
      } else {
         var8 = 0;
         var9 = var7;
         var10 = var4 >> 1;
      }

      int var11;
      int var12;
      int var13;
      if (var3 && !var6) {
         var11 = var4 - (var4 >> 2) - (field3220 >> 2);
         var12 = (field3220 >> 2) + (var4 - (var4 >> 2));
         var13 = field3220 >> 1;
      } else {
         var11 = var7;
         var12 = var4;
         var13 = var4 >> 1;
      }

      class351 var14 = field3204[field3198[var2]];
      int var15 = var14.field4973;
      int var16 = var14.field4975[var15];
      boolean var17 = !field3213[var16].method3499();
      boolean var18 = var17;

      for(int var19 = 0; var19 < var14.field4976; ++var19) {
         class602 var95 = field3199[var14.field4974[var19]];
         float[] var96 = field3195;
         var95.method4444(var96, var4 >> 1, var18);
      }

      if (!var17) {
         int var20 = var14.field4973;
         int var21 = var14.field4975[var20];
         field3213[var21].method3500(field3195, var4 >> 1);
      }

      if (var17) {
         for(int var22 = var4 >> 1; var22 < var4; ++var22) {
            field3195[var22] = 0.0F;
         }
      } else {
         int var23 = var4 >> 1;
         int var24 = var4 >> 2;
         int var25 = var4 >> 3;
         float[] var26 = field3195;

         for(int var27 = 0; var27 < var23; ++var27) {
            var26[var27] *= 0.5F;
         }

         for(int var28 = var23; var28 < var4; ++var28) {
            var26[var28] = -var26[var4 - var28 - 1];
         }

         float[] var29 = var3 ? field3190 : field3202;
         float[] var30 = var3 ? field3215 : field3217;
         float[] var31 = var3 ? field3191 : field3221;
         int[] var32 = var3 ? field3209 : field3192;

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

         int var35 = class752.method5444(-42, var4 - 1);

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
            field3195[var46] *= (float)Math.sin((double)var56 * 1.5707963267948966D * (double)var56);
         }

         for(int var47 = var11; var47 < var12; ++var47) {
            float var55 = (float)Math.sin(((double)(var47 - var11) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            field3195[var47] *= (float)Math.sin((double)var55 * 1.5707963267948966D * (double)var55);
         }
      }

      float[] var48 = null;
      if (this.field3212 > 0) {
         int var49 = this.field3212 + var4 >> 2;
         var48 = new float[var49];
         if (!this.field3206) {
            for(int var50 = 0; var50 < this.field3214; ++var50) {
               int var51 = (this.field3212 >> 1) + var50;
               var48[var50] += this.field3203[var51];
            }
         }

         if (!var17) {
            for(int var52 = var8; var52 < var4 >> 1; ++var52) {
               int var53 = var48.length - (var4 >> 1) + var52;
               var48[var53] += field3195[var52];
            }
         }
      }

      float[] var54 = this.field3203;
      this.field3203 = field3195;
      field3195 = var54;
      this.field3212 = var4;
      this.field3214 = var12 - (var4 >> 1);
      this.field3206 = var17;
      return var48;
   }

   @OriginalMember(
      owner = "client!sa",
      name = "<init>",
      descriptor = "([B)V"
   )
   private class214(byte[] arg0) {
      this.method1829(arg0);
   }
}
