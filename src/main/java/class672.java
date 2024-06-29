import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class672 extends class673 {
   @OriginalMember(
      owner = "client!ii",
      name = "T",
      descriptor = "Z"
   )
   private static boolean field9957 = false;
   @OriginalMember(
      owner = "client!ii",
      name = "s",
      descriptor = "I"
   )
   private int field9934;
   @OriginalMember(
      owner = "client!ii",
      name = "C",
      descriptor = "I"
   )
   private int field9935;
   @OriginalMember(
      owner = "client!ii",
      name = "z",
      descriptor = "I"
   )
   private static int field9938;
   @OriginalMember(
      owner = "client!ii",
      name = "n",
      descriptor = "I"
   )
   private int field9943;
   @OriginalMember(
      owner = "client!ii",
      name = "t",
      descriptor = "I"
   )
   private int field9945;
   @OriginalMember(
      owner = "client!ii",
      name = "q",
      descriptor = "I"
   )
   private static int field9946;
   @OriginalMember(
      owner = "client!ii",
      name = "r",
      descriptor = "I"
   )
   private static int field9948;
   @OriginalMember(
      owner = "client!ii",
      name = "O",
      descriptor = "I"
   )
   private int field9952;
   @OriginalMember(
      owner = "client!ii",
      name = "S",
      descriptor = "I"
   )
   private int field9954;
   @OriginalMember(
      owner = "client!ii",
      name = "B",
      descriptor = "I"
   )
   private int field9959;
   @OriginalMember(
      owner = "client!ii",
      name = "N",
      descriptor = "I"
   )
   private int field9962;
   @OriginalMember(
      owner = "client!ii",
      name = "m",
      descriptor = "I"
   )
   private static int field9963;
   @OriginalMember(
      owner = "client!ii",
      name = "M",
      descriptor = "Z"
   )
   private boolean field9941;
   @OriginalMember(
      owner = "client!ii",
      name = "G",
      descriptor = "Z"
   )
   private boolean field9955;
   @OriginalMember(
      owner = "client!ii",
      name = "p",
      descriptor = "[B"
   )
   private static byte[] field9956;
   @OriginalMember(
      owner = "client!ii",
      name = "u",
      descriptor = "[B"
   )
   private byte[] field9961;
   @OriginalMember(
      owner = "client!ii",
      name = "Q",
      descriptor = "[F"
   )
   private static float[] field9931;
   @OriginalMember(
      owner = "client!ii",
      name = "v",
      descriptor = "[F"
   )
   private static float[] field9933;
   @OriginalMember(
      owner = "client!ii",
      name = "H",
      descriptor = "[F"
   )
   private static float[] field9936;
   @OriginalMember(
      owner = "client!ii",
      name = "E",
      descriptor = "[F"
   )
   private float[] field9940;
   @OriginalMember(
      owner = "client!ii",
      name = "D",
      descriptor = "[F"
   )
   private static float[] field9944;
   @OriginalMember(
      owner = "client!ii",
      name = "K",
      descriptor = "[F"
   )
   private static float[] field9947;
   @OriginalMember(
      owner = "client!ii",
      name = "I",
      descriptor = "[F"
   )
   private static float[] field9960;
   @OriginalMember(
      owner = "client!ii",
      name = "o",
      descriptor = "[F"
   )
   private static float[] field9964;
   @OriginalMember(
      owner = "client!ii",
      name = "w",
      descriptor = "[I"
   )
   private static int[] field9942;
   @OriginalMember(
      owner = "client!ii",
      name = "L",
      descriptor = "[I"
   )
   private static int[] field9951;
   @OriginalMember(
      owner = "client!ii",
      name = "x",
      descriptor = "[I"
   )
   private static int[] field9958;
   @OriginalMember(
      owner = "client!ii",
      name = "A",
      descriptor = "[Lew;"
   )
   private static class253[] field9932;
   @OriginalMember(
      owner = "client!ii",
      name = "P",
      descriptor = "[Lrb;"
   )
   private static class261[] field9950;
   @OriginalMember(
      owner = "client!ii",
      name = "R",
      descriptor = "[Lnga;"
   )
   private static class269[] field9949;
   @OriginalMember(
      owner = "client!ii",
      name = "y",
      descriptor = "[Lsu;"
   )
   public static class547[] field9937;
   @OriginalMember(
      owner = "client!ii",
      name = "F",
      descriptor = "[Z"
   )
   private static boolean[] field9953;
   @OriginalMember(
      owner = "client!ii",
      name = "l",
      descriptor = "[[B"
   )
   private byte[][] field9939;

   @OriginalMember(
      owner = "client!ii",
      name = "a",
      descriptor = "(Lww;)Z"
   )
   private static final boolean method4912(class339 arg0) {
      if (!field9957) {
         byte[] var1 = arg0.method2697(0, 0, false);
         if (var1 == null) {
            return false;
         }

         method4921(var1);
      }

      return true;
   }

   @OriginalMember(
      owner = "client!ii",
      name = "a",
      descriptor = "([I)Lgb;"
   )
   public final class521 method4913(int[] arg0) {
      if (arg0 != null && arg0[0] <= 0) {
         return null;
      } else {
         if (this.field9961 == null) {
            this.field9943 = 0;
            this.field9940 = new float[field9963];
            this.field9961 = new byte[this.field9952];
            this.field9962 = 0;
            this.field9959 = 0;
         }

         while(this.field9959 < this.field9939.length) {
            if (arg0 != null && arg0[0] <= 0) {
               return null;
            }

            float[] var3 = this.method4920(this.field9959);
            if (var3 != null) {
               int var4 = this.field9962;
               int var5 = var3.length;
               if (var5 > this.field9952 - var4) {
                  var5 = this.field9952 - var4;
               }

               for(int var6 = 0; var6 < var5; ++var6) {
                  int var7 = (int)(var3[var6] * 128.0F + 128.0F);
                  if ((var7 & -256) != 0) {
                     var7 = ~var7 >> 31;
                  }

                  this.field9961[var4++] = (byte)(var7 - 128);
               }

               if (arg0 != null) {
                  arg0[0] -= var4 - this.field9962;
               }

               this.field9962 = var4;
            }

            ++this.field9959;
         }

         this.field9940 = null;
         byte[] var2 = this.field9961;
         this.field9961 = null;
         return new class521(this.field9945, var2, this.field9935, this.field9954, this.field9941);
      }
   }

   @OriginalMember(
      owner = "client!ii",
      name = "a",
      descriptor = "(I)I"
   )
   public static final int method4914(int arg0) {
      int var1 = 0;
      int var2 = 0;

      while(arg0 >= 8 - field9948) {
         int var4 = 8 - field9948;
         int var5 = (1 << var4) - 1;
         var1 += (field9956[field9938] >> field9948 & var5) << var2;
         field9948 = 0;
         ++field9938;
         var2 += var4;
         arg0 -= var4;
      }

      if (arg0 > 0) {
         int var3 = (1 << arg0) - 1;
         var1 += (field9956[field9938] >> field9948 & var3) << var2;
         field9948 += arg0;
      }

      return var1;
   }

   @OriginalMember(
      owner = "client!ii",
      name = "a",
      descriptor = "(Lww;I)Lii;"
   )
   public static final class672 method4915(class339 arg0, int arg1) {
      if (!method4912(arg0)) {
         arg0.method2681((byte)68, arg1);
         return null;
      } else {
         byte[] var2 = arg0.method2700(arg1, -2);
         return var2 == null ? null : new class672(var2);
      }
   }

   @OriginalMember(
      owner = "client!ii",
      name = "b",
      descriptor = "([B)V"
   )
   private final void method4916(byte[] arg0) {
      class66 var2 = new class66(arg0);
      this.field9945 = var2.method610(-106);
      this.field9952 = var2.method610(-77);
      this.field9935 = var2.method610(-118);
      this.field9954 = var2.method610(126);
      if (this.field9954 < 0) {
         this.field9954 = ~this.field9954;
         this.field9941 = true;
      }

      int var3 = var2.method610(125);
      this.field9939 = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.method640(255);
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.method632(0, var5, (byte)35, var7);
         this.field9939[var4] = var7;
      }

   }

   @OriginalMember(
      owner = "client!ii",
      name = "a",
      descriptor = "([BI)V"
   )
   private static final void method4917(byte[] arg0, int arg1) {
      field9956 = arg0;
      field9938 = arg1;
      field9948 = 0;
   }

   @OriginalMember(
      owner = "client!ii",
      name = "a",
      descriptor = "(Lww;II)Lii;"
   )
   public static final class672 method4918(class339 arg0, int arg1, int arg2) {
      if (!method4912(arg0)) {
         arg0.method2690(arg1, arg2, 110);
         return null;
      } else {
         byte[] var3 = arg0.method2697(arg2, arg1, false);
         return var3 == null ? null : new class672(var3);
      }
   }

   @OriginalMember(
      owner = "client!ii",
      name = "a",
      descriptor = "()I"
   )
   public static final int method4919() {
      int var0 = field9956[field9938] >> field9948 & 1;
      ++field9948;
      field9938 += field9948 >> 3;
      field9948 &= 7;
      return var0;
   }

   @OriginalMember(
      owner = "client!ii",
      name = "b",
      descriptor = "(I)[F"
   )
   private final float[] method4920(int arg0) {
      method4917(this.field9939[arg0], 0);
      method4919();
      int var2 = method4914(class291.method2349((byte)114, field9958.length - 1));
      boolean var3 = field9953[var2];
      int var4 = var3 ? field9963 : field9946;
      boolean var5 = false;
      boolean var6 = false;
      if (var3) {
         var5 = method4919() != 0;
         var6 = method4919() != 0;
      }

      int var7 = var4 >> 1;
      int var8;
      int var9;
      int var10;
      if (var3 && !var5) {
         var8 = (var4 >> 2) - (field9946 >> 2);
         var9 = (field9946 >> 2) + (var4 >> 2);
         var10 = field9946 >> 1;
      } else {
         var8 = 0;
         var9 = var7;
         var10 = var4 >> 1;
      }

      int var11;
      int var12;
      int var13;
      if (var3 && !var6) {
         var11 = var4 - (var4 >> 2) - (field9946 >> 2);
         var12 = (field9946 >> 2) + (var4 - (var4 >> 2));
         var13 = field9946 >> 1;
      } else {
         var11 = var7;
         var12 = var4;
         var13 = var4 >> 1;
      }

      class269 var14 = field9949[field9958[var2]];
      int var15 = var14.field3439;
      int var16 = var14.field3438[var15];
      boolean var17 = !field9932[var16].method2037();
      boolean var18 = var17;

      for(int var19 = 0; var19 < var14.field3437; ++var19) {
         class261 var95 = field9950[var14.field3440[var19]];
         float[] var96 = field9960;
         var95.method2097(var96, var4 >> 1, var18);
      }

      if (!var17) {
         int var20 = var14.field3439;
         int var21 = var14.field3438[var20];
         field9932[var21].method2033(field9960, var4 >> 1);
      }

      if (var17) {
         for(int var22 = var4 >> 1; var22 < var4; ++var22) {
            field9960[var22] = 0.0F;
         }
      } else {
         int var23 = var4 >> 1;
         int var24 = var4 >> 2;
         int var25 = var4 >> 3;
         float[] var26 = field9960;

         for(int var27 = 0; var27 < var23; ++var27) {
            var26[var27] *= 0.5F;
         }

         for(int var28 = var23; var28 < var4; ++var28) {
            var26[var28] = -var26[var4 - var28 - 1];
         }

         float[] var29 = var3 ? field9933 : field9964;
         float[] var30 = var3 ? field9944 : field9931;
         float[] var31 = var3 ? field9947 : field9936;
         int[] var32 = var3 ? field9951 : field9942;

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

         int var35 = class291.method2349((byte)98, var4 - 1);

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
            field9960[var46] *= (float)Math.sin((double)var56 * 1.5707963267948966D * (double)var56);
         }

         for(int var47 = var11; var47 < var12; ++var47) {
            float var55 = (float)Math.sin(((double)(var47 - var11) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            field9960[var47] *= (float)Math.sin((double)var55 * 1.5707963267948966D * (double)var55);
         }
      }

      float[] var48 = null;
      if (this.field9943 > 0) {
         int var49 = this.field9943 + var4 >> 2;
         var48 = new float[var49];
         if (!this.field9955) {
            for(int var50 = 0; var50 < this.field9934; ++var50) {
               int var51 = (this.field9943 >> 1) + var50;
               var48[var50] += this.field9940[var51];
            }
         }

         if (!var17) {
            for(int var52 = var8; var52 < var4 >> 1; ++var52) {
               int var53 = var48.length - (var4 >> 1) + var52;
               var48[var53] += field9960[var52];
            }
         }
      }

      float[] var54 = this.field9940;
      this.field9940 = field9960;
      field9960 = var54;
      this.field9943 = var4;
      this.field9934 = var12 - (var4 >> 1);
      this.field9955 = var17;
      return var48;
   }

   @OriginalMember(
      owner = "client!ii",
      name = "<init>",
      descriptor = "([B)V"
   )
   private class672(byte[] arg0) {
      this.method4916(arg0);
   }

   @OriginalMember(
      owner = "client!ii",
      name = "a",
      descriptor = "([B)V"
   )
   private static final void method4921(byte[] arg0) {
      method4917(arg0, 0);
      field9946 = 1 << method4914(4);
      field9963 = 1 << method4914(4);
      field9960 = new float[field9963];

      for(int var1 = 0; var1 < 2; ++var1) {
         int var14 = var1 != 0 ? field9963 : field9946;
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
         int var25 = class291.method2349((byte)108, var17 - 1);

         for(int var26 = 0; var26 < var17; ++var26) {
            var24[var26] = class735.method5320(var26, var25, (byte)-96);
         }

         if (var1 != 0) {
            field9933 = var18;
            field9944 = var20;
            field9947 = var22;
            field9951 = var24;
         } else {
            field9964 = var18;
            field9931 = var20;
            field9936 = var22;
            field9942 = var24;
         }
      }

      int var2 = method4914(8) + 1;
      field9937 = new class547[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         field9937[var3] = new class547();
      }

      int var4 = method4914(6) + 1;

      for(int var5 = 0; var5 < var4; ++var5) {
         method4914(16);
      }

      int var6 = method4914(6) + 1;
      field9932 = new class253[var6];

      for(int var7 = 0; var7 < var6; ++var7) {
         field9932[var7] = new class253();
      }

      int var8 = method4914(6) + 1;
      field9950 = new class261[var8];

      for(int var9 = 0; var9 < var8; ++var9) {
         field9950[var9] = new class261();
      }

      int var10 = method4914(6) + 1;
      field9949 = new class269[var10];

      for(int var11 = 0; var11 < var10; ++var11) {
         field9949[var11] = new class269();
      }

      int var12 = method4914(6) + 1;
      field9953 = new boolean[var12];
      field9958 = new int[var12];

      for(int var13 = 0; var13 < var12; ++var13) {
         field9953[var13] = method4919() != 0;
         method4914(16);
         method4914(16);
         field9958[var13] = method4914(8);
      }

      field9957 = true;
   }

   @OriginalMember(
      owner = "client!ii",
      name = "b",
      descriptor = "()V"
   )
   public static void method4922() {
      field9956 = null;
      field9937 = null;
      field9932 = null;
      field9950 = null;
      field9949 = null;
      field9953 = null;
      field9958 = null;
      field9960 = null;
      field9964 = null;
      field9931 = null;
      field9936 = null;
      field9933 = null;
      field9944 = null;
      field9947 = null;
      field9942 = null;
      field9951 = null;
   }

   @OriginalMember(
      owner = "client!ii",
      name = "c",
      descriptor = "(I)F"
   )
   public static final float method4923(int arg0) {
      int var1 = arg0 & 2097151;
      int var2 = arg0 & Integer.MIN_VALUE;
      int var3 = (arg0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }
}
