import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class617 extends class294 {
   @OriginalMember(
      owner = "client!on",
      name = "r",
      descriptor = "Z"
   )
   private static boolean field8943 = false;
   @OriginalMember(
      owner = "client!on",
      name = "t",
      descriptor = "I"
   )
   private static int field8941;
   @OriginalMember(
      owner = "client!on",
      name = "G",
      descriptor = "I"
   )
   private int field8946;
   @OriginalMember(
      owner = "client!on",
      name = "y",
      descriptor = "I"
   )
   private int field8949;
   @OriginalMember(
      owner = "client!on",
      name = "O",
      descriptor = "I"
   )
   private int field8956;
   @OriginalMember(
      owner = "client!on",
      name = "v",
      descriptor = "I"
   )
   private int field8957;
   @OriginalMember(
      owner = "client!on",
      name = "N",
      descriptor = "I"
   )
   private static int field8958;
   @OriginalMember(
      owner = "client!on",
      name = "P",
      descriptor = "I"
   )
   private static int field8962;
   @OriginalMember(
      owner = "client!on",
      name = "K",
      descriptor = "I"
   )
   private int field8964;
   @OriginalMember(
      owner = "client!on",
      name = "R",
      descriptor = "I"
   )
   private static int field8965;
   @OriginalMember(
      owner = "client!on",
      name = "s",
      descriptor = "I"
   )
   private int field8966;
   @OriginalMember(
      owner = "client!on",
      name = "I",
      descriptor = "I"
   )
   private int field8967;
   @OriginalMember(
      owner = "client!on",
      name = "F",
      descriptor = "I"
   )
   private int field8969;
   @OriginalMember(
      owner = "client!on",
      name = "D",
      descriptor = "Z"
   )
   private boolean field8952;
   @OriginalMember(
      owner = "client!on",
      name = "B",
      descriptor = "Z"
   )
   private boolean field8953;
   @OriginalMember(
      owner = "client!on",
      name = "m",
      descriptor = "[B"
   )
   private static byte[] field8950;
   @OriginalMember(
      owner = "client!on",
      name = "L",
      descriptor = "[B"
   )
   private byte[] field8970;
   @OriginalMember(
      owner = "client!on",
      name = "S",
      descriptor = "[F"
   )
   private static float[] field8942;
   @OriginalMember(
      owner = "client!on",
      name = "M",
      descriptor = "[F"
   )
   private static float[] field8945;
   @OriginalMember(
      owner = "client!on",
      name = "T",
      descriptor = "[F"
   )
   private static float[] field8947;
   @OriginalMember(
      owner = "client!on",
      name = "A",
      descriptor = "[F"
   )
   private static float[] field8948;
   @OriginalMember(
      owner = "client!on",
      name = "n",
      descriptor = "[F"
   )
   private static float[] field8951;
   @OriginalMember(
      owner = "client!on",
      name = "U",
      descriptor = "[F"
   )
   private float[] field8959;
   @OriginalMember(
      owner = "client!on",
      name = "J",
      descriptor = "[F"
   )
   private static float[] field8963;
   @OriginalMember(
      owner = "client!on",
      name = "o",
      descriptor = "[F"
   )
   private static float[] field8968;
   @OriginalMember(
      owner = "client!on",
      name = "p",
      descriptor = "[I"
   )
   private static int[] field8939;
   @OriginalMember(
      owner = "client!on",
      name = "E",
      descriptor = "[I"
   )
   private static int[] field8944;
   @OriginalMember(
      owner = "client!on",
      name = "w",
      descriptor = "[I"
   )
   private static int[] field8961;
   @OriginalMember(
      owner = "client!on",
      name = "x",
      descriptor = "[Lht;"
   )
   private static class268[] field8954;
   @OriginalMember(
      owner = "client!on",
      name = "z",
      descriptor = "[Loka;"
   )
   private static class313[] field8960;
   @OriginalMember(
      owner = "client!on",
      name = "C",
      descriptor = "[Lpu;"
   )
   private static class322[] field8940;
   @OriginalMember(
      owner = "client!on",
      name = "H",
      descriptor = "[Lhm;"
   )
   public static class622[] field8938;
   @OriginalMember(
      owner = "client!on",
      name = "q",
      descriptor = "[Z"
   )
   private static boolean[] field8937;
   @OriginalMember(
      owner = "client!on",
      name = "u",
      descriptor = "[[B"
   )
   private byte[][] field8955;

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "([B)V",
      line = 7
   )
   private static final void method4533(byte[] arg0) {
      method4535(arg0, 0);
      field8941 = 1 << method4543(4);
      field8965 = 1 << method4543(4);
      field8945 = new float[field8965];

      for(int var1 = 0; var1 < 2; ++var1) {
         int var14 = var1 != 0 ? field8965 : field8941;
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
         int var25 = class277.method2331(var17 - 1, (byte)124);

         for(int var26 = 0; var26 < var17; ++var26) {
            var24[var26] = class274.method2324(var26, var25, -2);
         }

         if (var1 != 0) {
            field8951 = var18;
            field8963 = var20;
            field8947 = var22;
            field8944 = var24;
         } else {
            field8948 = var18;
            field8968 = var20;
            field8942 = var22;
            field8961 = var24;
         }
      }

      int var2 = method4543(8) + 1;
      field8938 = new class622[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         field8938[var3] = new class622();
      }

      int var4 = method4543(6) + 1;

      for(int var5 = 0; var5 < var4; ++var5) {
         method4543(16);
      }

      int var6 = method4543(6) + 1;
      field8940 = new class322[var6];

      for(int var7 = 0; var7 < var6; ++var7) {
         field8940[var7] = new class322();
      }

      int var8 = method4543(6) + 1;
      field8960 = new class313[var8];

      for(int var9 = 0; var9 < var8; ++var9) {
         field8960[var9] = new class313();
      }

      int var10 = method4543(6) + 1;
      field8954 = new class268[var10];

      for(int var11 = 0; var11 < var10; ++var11) {
         field8954[var11] = new class268();
      }

      int var12 = method4543(6) + 1;
      field8937 = new boolean[var12];
      field8939 = new int[var12];

      for(int var13 = 0; var13 < var12; ++var13) {
         field8937[var13] = method4539() != 0;
         method4543(16);
         method4543(16);
         field8939[var13] = method4543(8);
      }

      field8943 = true;
   }

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "(Lrr;II)Lon;",
      line = 162
   )
   public static final class617 method4534(class678 arg0, int arg1, int arg2) {
      if (!method4540(arg0)) {
         arg0.method4994(arg2, 100, arg1);
         return null;
      } else {
         byte[] var3 = arg0.method5017(arg1, arg2, (byte)71);
         return var3 == null ? null : new class617(var3);
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "([BI)V",
      line = 177
   )
   private static final void method4535(byte[] arg0, int arg1) {
      field8950 = arg0;
      field8958 = arg1;
      field8962 = 0;
   }

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "([I)Lec;",
      line = 185
   )
   public final class184 method4536(int[] arg0) {
      if (arg0 != null && arg0[0] <= 0) {
         return null;
      } else {
         if (this.field8970 == null) {
            this.field8964 = 0;
            this.field8959 = new float[field8965];
            this.field8970 = new byte[this.field8946];
            this.field8967 = 0;
            this.field8969 = 0;
         }

         while(this.field8969 < this.field8955.length) {
            if (arg0 != null && arg0[0] <= 0) {
               return null;
            }

            float[] var3 = this.method4542(this.field8969);
            if (var3 != null) {
               int var4 = this.field8967;
               int var5 = var3.length;
               if (var5 > this.field8946 - var4) {
                  var5 = this.field8946 - var4;
               }

               for(int var6 = 0; var6 < var5; ++var6) {
                  int var7 = (int)(var3[var6] * 128.0F + 128.0F);
                  if ((var7 & -256) != 0) {
                     var7 = ~var7 >> 31;
                  }

                  this.field8970[var4++] = (byte)(var7 - 128);
               }

               if (arg0 != null) {
                  arg0[0] -= var4 - this.field8967;
               }

               this.field8967 = var4;
            }

            ++this.field8969;
         }

         this.field8959 = null;
         byte[] var2 = this.field8970;
         this.field8970 = null;
         return new class184(this.field8949, var2, this.field8966, this.field8956, this.field8953);
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "b",
      descriptor = "()V",
      line = 245
   )
   public static void method4537() {
      field8950 = null;
      field8938 = null;
      field8940 = null;
      field8960 = null;
      field8954 = null;
      field8937 = null;
      field8939 = null;
      field8945 = null;
      field8948 = null;
      field8968 = null;
      field8942 = null;
      field8951 = null;
      field8963 = null;
      field8947 = null;
      field8961 = null;
      field8944 = null;
   }

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "(Lrr;I)Lon;",
      line = 267
   )
   public static final class617 method4538(class678 arg0, int arg1) {
      if (!method4540(arg0)) {
         arg0.method5002(arg1, (byte)97);
         return null;
      } else {
         byte[] var2 = arg0.method5025(0, arg1);
         return var2 == null ? null : new class617(var2);
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "()I",
      line = 284
   )
   public static final int method4539() {
      int var0 = field8950[field8958] >> field8962 & 1;
      ++field8962;
      field8958 += field8962 >> 3;
      field8962 &= 7;
      return var0;
   }

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "(Lrr;)Z",
      line = 294
   )
   private static final boolean method4540(class678 arg0) {
      if (!field8943) {
         byte[] var1 = arg0.method5017(0, 0, (byte)71);
         if (var1 == null) {
            return false;
         }

         method4533(var1);
      }

      return true;
   }

   @OriginalMember(
      owner = "client!on",
      name = "c",
      descriptor = "(I)F",
      line = 308
   )
   public static final float method4541(int arg0) {
      int var1 = arg0 & 2097151;
      int var2 = arg0 & Integer.MIN_VALUE;
      int var3 = (arg0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }

   @OriginalMember(
      owner = "client!on",
      name = "b",
      descriptor = "(I)[F",
      line = 319
   )
   private final float[] method4542(int arg0) {
      method4535(this.field8955[arg0], 0);
      method4539();
      int var2 = method4543(class277.method2331(field8939.length - 1, (byte)124));
      boolean var3 = field8937[var2];
      int var4 = var3 ? field8965 : field8941;
      boolean var5 = false;
      boolean var6 = false;
      if (var3) {
         var5 = method4539() != 0;
         var6 = method4539() != 0;
      }

      int var7 = var4 >> 1;
      int var8;
      int var9;
      int var10;
      if (var3 && !var5) {
         var8 = (var4 >> 2) - (field8941 >> 2);
         var9 = (field8941 >> 2) + (var4 >> 2);
         var10 = field8941 >> 1;
      } else {
         var8 = 0;
         var9 = var7;
         var10 = var4 >> 1;
      }

      int var11;
      int var12;
      int var13;
      if (var3 && !var6) {
         var11 = var4 - (var4 >> 2) - (field8941 >> 2);
         var12 = (field8941 >> 2) + (var4 - (var4 >> 2));
         var13 = field8941 >> 1;
      } else {
         var11 = var7;
         var12 = var4;
         var13 = var4 >> 1;
      }

      class268 var14 = field8954[field8939[var2]];
      int var15 = var14.field4357;
      int var16 = var14.field4358[var15];
      boolean var17 = !field8940[var16].method2641();
      boolean var18 = var17;

      for(int var19 = 0; var19 < var14.field4355; ++var19) {
         class313 var95 = field8960[var14.field4356[var19]];
         float[] var96 = field8945;
         var95.method2604(var96, var4 >> 1, var18);
      }

      if (!var17) {
         int var20 = var14.field4357;
         int var21 = var14.field4358[var20];
         field8940[var21].method2642(field8945, var4 >> 1);
      }

      if (var17) {
         for(int var22 = var4 >> 1; var22 < var4; ++var22) {
            field8945[var22] = 0.0F;
         }
      } else {
         int var23 = var4 >> 1;
         int var24 = var4 >> 2;
         int var25 = var4 >> 3;
         float[] var26 = field8945;

         for(int var27 = 0; var27 < var23; ++var27) {
            var26[var27] *= 0.5F;
         }

         for(int var28 = var23; var28 < var4; ++var28) {
            var26[var28] = -var26[var4 - var28 - 1];
         }

         float[] var29 = var3 ? field8951 : field8948;
         float[] var30 = var3 ? field8963 : field8968;
         float[] var31 = var3 ? field8947 : field8942;
         int[] var32 = var3 ? field8944 : field8961;

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

         int var35 = class277.method2331(var4 - 1, (byte)124);

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
            field8945[var46] *= (float)Math.sin((double)var56 * 1.5707963267948966D * (double)var56);
         }

         for(int var47 = var11; var47 < var12; ++var47) {
            float var55 = (float)Math.sin(((double)(var47 - var11) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            field8945[var47] *= (float)Math.sin((double)var55 * 1.5707963267948966D * (double)var55);
         }
      }

      float[] var48 = null;
      if (this.field8964 > 0) {
         int var49 = this.field8964 + var4 >> 2;
         var48 = new float[var49];
         if (!this.field8952) {
            for(int var50 = 0; var50 < this.field8957; ++var50) {
               int var51 = (this.field8964 >> 1) + var50;
               var48[var50] += this.field8959[var51];
            }
         }

         if (!var17) {
            for(int var52 = var8; var52 < var4 >> 1; ++var52) {
               int var53 = var48.length - (var4 >> 1) + var52;
               var48[var53] += field8945[var52];
            }
         }
      }

      float[] var54 = this.field8959;
      this.field8959 = field8945;
      field8945 = var54;
      this.field8964 = var4;
      this.field8957 = var12 - (var4 >> 1);
      this.field8952 = var17;
      return var48;
   }

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "(I)I",
      line = 736
   )
   public static final int method4543(int arg0) {
      int var1 = 0;
      int var2 = 0;

      while(arg0 >= 8 - field8962) {
         int var4 = 8 - field8962;
         int var5 = (1 << var4) - 1;
         var1 += (field8950[field8958] >> field8962 & var5) << var2;
         field8962 = 0;
         ++field8958;
         var2 += var4;
         arg0 -= var4;
      }

      if (arg0 > 0) {
         int var3 = (1 << arg0) - 1;
         var1 += (field8950[field8958] >> field8962 & var3) << var2;
         field8962 += arg0;
      }

      return var1;
   }

   @OriginalMember(
      owner = "client!on",
      name = "b",
      descriptor = "([B)V",
      line = 764
   )
   private final void method4544(byte[] arg0) {
      class354 var2 = new class354(arg0);
      this.field8949 = var2.method2894(114);
      this.field8946 = var2.method2894(98);
      this.field8966 = var2.method2894(123);
      this.field8956 = var2.method2894(110);
      if (this.field8956 < 0) {
         this.field8956 = ~this.field8956;
         this.field8953 = true;
      }

      int var3 = var2.method2894(109);
      this.field8955 = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.method2855(-31007);
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.method2859(var7, 0, false, var5);
         this.field8955[var4] = var7;
      }

   }

   @OriginalMember(
      owner = "client!on",
      name = "<init>",
      descriptor = "([B)V",
      line = 816
   )
   private class617(byte[] arg0) {
      this.method4544(arg0);
   }
}
