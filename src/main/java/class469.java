import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class469 extends class247 {
   @OriginalMember(
      owner = "client!ica",
      name = "O",
      descriptor = "Z"
   )
   private static boolean field6799 = false;
   @OriginalMember(
      owner = "client!ica",
      name = "G",
      descriptor = "I"
   )
   private static int field6791;
   @OriginalMember(
      owner = "client!ica",
      name = "E",
      descriptor = "I"
   )
   private int field6792;
   @OriginalMember(
      owner = "client!ica",
      name = "L",
      descriptor = "I"
   )
   private static int field6802;
   @OriginalMember(
      owner = "client!ica",
      name = "M",
      descriptor = "I"
   )
   private int field6803;
   @OriginalMember(
      owner = "client!ica",
      name = "P",
      descriptor = "I"
   )
   private static int field6806;
   @OriginalMember(
      owner = "client!ica",
      name = "F",
      descriptor = "I"
   )
   private int field6807;
   @OriginalMember(
      owner = "client!ica",
      name = "p",
      descriptor = "I"
   )
   private int field6808;
   @OriginalMember(
      owner = "client!ica",
      name = "C",
      descriptor = "I"
   )
   private static int field6813;
   @OriginalMember(
      owner = "client!ica",
      name = "t",
      descriptor = "I"
   )
   private int field6816;
   @OriginalMember(
      owner = "client!ica",
      name = "x",
      descriptor = "I"
   )
   private int field6817;
   @OriginalMember(
      owner = "client!ica",
      name = "m",
      descriptor = "I"
   )
   private int field6819;
   @OriginalMember(
      owner = "client!ica",
      name = "H",
      descriptor = "I"
   )
   private int field6820;
   @OriginalMember(
      owner = "client!ica",
      name = "v",
      descriptor = "Z"
   )
   private boolean field6804;
   @OriginalMember(
      owner = "client!ica",
      name = "y",
      descriptor = "Z"
   )
   private boolean field6815;
   @OriginalMember(
      owner = "client!ica",
      name = "B",
      descriptor = "[B"
   )
   private static byte[] field6811;
   @OriginalMember(
      owner = "client!ica",
      name = "K",
      descriptor = "[B"
   )
   private byte[] field6821;
   @OriginalMember(
      owner = "client!ica",
      name = "J",
      descriptor = "[F"
   )
   private static float[] field6790;
   @OriginalMember(
      owner = "client!ica",
      name = "l",
      descriptor = "[F"
   )
   private static float[] field6793;
   @OriginalMember(
      owner = "client!ica",
      name = "q",
      descriptor = "[F"
   )
   private static float[] field6798;
   @OriginalMember(
      owner = "client!ica",
      name = "o",
      descriptor = "[F"
   )
   private static float[] field6800;
   @OriginalMember(
      owner = "client!ica",
      name = "r",
      descriptor = "[F"
   )
   private static float[] field6805;
   @OriginalMember(
      owner = "client!ica",
      name = "z",
      descriptor = "[F"
   )
   private static float[] field6809;
   @OriginalMember(
      owner = "client!ica",
      name = "w",
      descriptor = "[F"
   )
   private static float[] field6814;
   @OriginalMember(
      owner = "client!ica",
      name = "D",
      descriptor = "[F"
   )
   private float[] field6818;
   @OriginalMember(
      owner = "client!ica",
      name = "s",
      descriptor = "[I"
   )
   private static int[] field6788;
   @OriginalMember(
      owner = "client!ica",
      name = "n",
      descriptor = "[I"
   )
   private static int[] field6794;
   @OriginalMember(
      owner = "client!ica",
      name = "N",
      descriptor = "[I"
   )
   private static int[] field6797;
   @OriginalMember(
      owner = "client!ica",
      name = "u",
      descriptor = "[Ltn;"
   )
   private static class179[] field6795;
   @OriginalMember(
      owner = "client!ica",
      name = "A",
      descriptor = "[Ldj;"
   )
   private static class187[] field6801;
   @OriginalMember(
      owner = "client!ica",
      name = "j",
      descriptor = "[Lwf;"
   )
   public static class38[] field6796;
   @OriginalMember(
      owner = "client!ica",
      name = "I",
      descriptor = "[Lpba;"
   )
   private static class786[] field6789;
   @OriginalMember(
      owner = "client!ica",
      name = "Q",
      descriptor = "[Z"
   )
   private static boolean[] field6812;
   @OriginalMember(
      owner = "client!ica",
      name = "k",
      descriptor = "[[B"
   )
   private byte[][] field6810;

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(Lsa;)Z"
   )
   private static final boolean method3595(class39 arg0) {
      if (!field6799) {
         byte[] var1 = arg0.method460((byte)-11, 0, 0);
         if (var1 == null) {
            return false;
         }

         method3597(var1);
      }

      return true;
   }

   @OriginalMember(
      owner = "client!ica",
      name = "b",
      descriptor = "(I)F"
   )
   public static final float method3596(int arg0) {
      int var1 = arg0 & 2097151;
      int var2 = arg0 & Integer.MIN_VALUE;
      int var3 = (arg0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }

   @OriginalMember(
      owner = "client!ica",
      name = "b",
      descriptor = "([B)V"
   )
   private static final void method3597(byte[] arg0) {
      method3606(arg0, 0);
      field6813 = 1 << method3598(4);
      field6806 = 1 << method3598(4);
      field6800 = new float[field6806];

      for(int var1 = 0; var1 < 2; ++var1) {
         int var14 = var1 != 0 ? field6806 : field6813;
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
         int var25 = class682.method4979(var17 - 1, true);

         for(int var26 = 0; var26 < var17; ++var26) {
            var24[var26] = class107.method1047((byte)1, var26, var25);
         }

         if (var1 != 0) {
            field6809 = var18;
            field6790 = var20;
            field6805 = var22;
            field6794 = var24;
         } else {
            field6798 = var18;
            field6793 = var20;
            field6814 = var22;
            field6797 = var24;
         }
      }

      int var2 = method3598(8) + 1;
      field6796 = new class38[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         field6796[var3] = new class38();
      }

      int var4 = method3598(6) + 1;

      for(int var5 = 0; var5 < var4; ++var5) {
         method3598(16);
      }

      int var6 = method3598(6) + 1;
      field6789 = new class786[var6];

      for(int var7 = 0; var7 < var6; ++var7) {
         field6789[var7] = new class786();
      }

      int var8 = method3598(6) + 1;
      field6801 = new class187[var8];

      for(int var9 = 0; var9 < var8; ++var9) {
         field6801[var9] = new class187();
      }

      int var10 = method3598(6) + 1;
      field6795 = new class179[var10];

      for(int var11 = 0; var11 < var10; ++var11) {
         field6795[var11] = new class179();
      }

      int var12 = method3598(6) + 1;
      field6812 = new boolean[var12];
      field6788 = new int[var12];

      for(int var13 = 0; var13 < var12; ++var13) {
         field6812[var13] = method3599() != 0;
         method3598(16);
         method3598(16);
         field6788[var13] = method3598(8);
      }

      field6799 = true;
   }

   @OriginalMember(
      owner = "client!ica",
      name = "e",
      descriptor = "(I)I"
   )
   public static final int method3598(int arg0) {
      int var1 = 0;
      int var2 = 0;

      while(arg0 >= 8 - field6791) {
         int var4 = 8 - field6791;
         int var5 = (1 << var4) - 1;
         var1 += (field6811[field6802] >> field6791 & var5) << var2;
         field6791 = 0;
         ++field6802;
         var2 += var4;
         arg0 -= var4;
      }

      if (arg0 > 0) {
         int var3 = (1 << arg0) - 1;
         var1 += (field6811[field6802] >> field6791 & var3) << var2;
         field6791 += arg0;
      }

      return var1;
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "()I"
   )
   public static final int method3599() {
      int var0 = field6811[field6802] >> field6791 & 1;
      ++field6791;
      field6802 += field6791 >> 3;
      field6791 &= 7;
      return var0;
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(Lsa;I)Lica;"
   )
   public static final class469 method3600(class39 arg0, int arg1) {
      if (!method3595(arg0)) {
         arg0.method450(0, arg1);
         return null;
      } else {
         byte[] var2 = arg0.method449(arg1, (byte)-62);
         return var2 == null ? null : new class469(var2);
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(Lsa;II)Lica;"
   )
   public static final class469 method3601(class39 arg0, int arg1, int arg2) {
      if (!method3595(arg0)) {
         arg0.method442(true, arg2, arg1);
         return null;
      } else {
         byte[] var3 = arg0.method460((byte)-11, arg2, arg1);
         return var3 == null ? null : new class469(var3);
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "([B)V"
   )
   private final void method3602(byte[] arg0) {
      class65 var2 = new class65(arg0);
      this.field6817 = var2.method701(255);
      this.field6807 = var2.method701(255);
      this.field6816 = var2.method701(255);
      this.field6803 = var2.method701(255);
      if (this.field6803 < 0) {
         this.field6803 = ~this.field6803;
         this.field6815 = true;
      }

      int var3 = var2.method701(255);
      this.field6810 = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.method665(false);
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.method678(var5, -32768, 0, var7);
         this.field6810[var4] = var7;
      }

   }

   @OriginalMember(
      owner = "client!ica",
      name = "b",
      descriptor = "()V"
   )
   public static void method3603() {
      field6811 = null;
      field6796 = null;
      field6789 = null;
      field6801 = null;
      field6795 = null;
      field6812 = null;
      field6788 = null;
      field6800 = null;
      field6798 = null;
      field6793 = null;
      field6814 = null;
      field6809 = null;
      field6790 = null;
      field6805 = null;
      field6797 = null;
      field6794 = null;
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "(I)[F"
   )
   private final float[] method3604(int arg0) {
      method3606(this.field6810[arg0], 0);
      method3599();
      int var2 = method3598(class682.method4979(field6788.length - 1, true));
      boolean var3 = field6812[var2];
      int var4 = var3 ? field6806 : field6813;
      boolean var5 = false;
      boolean var6 = false;
      if (var3) {
         var5 = method3599() != 0;
         var6 = method3599() != 0;
      }

      int var7 = var4 >> 1;
      int var8;
      int var9;
      int var10;
      if (var3 && !var5) {
         var8 = (var4 >> 2) - (field6813 >> 2);
         var9 = (field6813 >> 2) + (var4 >> 2);
         var10 = field6813 >> 1;
      } else {
         var8 = 0;
         var9 = var7;
         var10 = var4 >> 1;
      }

      int var11;
      int var12;
      int var13;
      if (var3 && !var6) {
         var11 = var4 - (var4 >> 2) - (field6813 >> 2);
         var12 = (field6813 >> 2) + (var4 - (var4 >> 2));
         var13 = field6813 >> 1;
      } else {
         var11 = var7;
         var12 = var4;
         var13 = var4 >> 1;
      }

      class179 var14 = field6795[field6788[var2]];
      int var15 = var14.field2633;
      int var16 = var14.field2630[var15];
      boolean var17 = !field6789[var16].method5680();
      boolean var18 = var17;

      for(int var19 = 0; var19 < var14.field2631; ++var19) {
         class187 var95 = field6801[var14.field2632[var19]];
         float[] var96 = field6800;
         var95.method1679(var96, var4 >> 1, var18);
      }

      if (!var17) {
         int var20 = var14.field2633;
         int var21 = var14.field2630[var20];
         field6789[var21].method5683(field6800, var4 >> 1);
      }

      if (var17) {
         for(int var22 = var4 >> 1; var22 < var4; ++var22) {
            field6800[var22] = 0.0F;
         }
      } else {
         int var23 = var4 >> 1;
         int var24 = var4 >> 2;
         int var25 = var4 >> 3;
         float[] var26 = field6800;

         for(int var27 = 0; var27 < var23; ++var27) {
            var26[var27] *= 0.5F;
         }

         for(int var28 = var23; var28 < var4; ++var28) {
            var26[var28] = -var26[var4 - var28 - 1];
         }

         float[] var29 = var3 ? field6809 : field6798;
         float[] var30 = var3 ? field6790 : field6793;
         float[] var31 = var3 ? field6805 : field6814;
         int[] var32 = var3 ? field6794 : field6797;

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

         int var35 = class682.method4979(var4 - 1, true);

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
            field6800[var46] *= (float)Math.sin((double)var56 * 1.5707963267948966D * (double)var56);
         }

         for(int var47 = var11; var47 < var12; ++var47) {
            float var55 = (float)Math.sin(((double)(var47 - var11) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            field6800[var47] *= (float)Math.sin((double)var55 * 1.5707963267948966D * (double)var55);
         }
      }

      float[] var48 = null;
      if (this.field6808 > 0) {
         int var49 = this.field6808 + var4 >> 2;
         var48 = new float[var49];
         if (!this.field6804) {
            for(int var50 = 0; var50 < this.field6792; ++var50) {
               int var51 = (this.field6808 >> 1) + var50;
               var48[var50] += this.field6818[var51];
            }
         }

         if (!var17) {
            for(int var52 = var8; var52 < var4 >> 1; ++var52) {
               int var53 = var48.length - (var4 >> 1) + var52;
               var48[var53] += field6800[var52];
            }
         }
      }

      float[] var54 = this.field6818;
      this.field6818 = field6800;
      field6800 = var54;
      this.field6808 = var4;
      this.field6792 = var12 - (var4 >> 1);
      this.field6804 = var17;
      return var48;
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "([I)Laia;"
   )
   public final class301 method3605(int[] arg0) {
      if (arg0 != null && arg0[0] <= 0) {
         return null;
      } else {
         if (this.field6821 == null) {
            this.field6808 = 0;
            this.field6818 = new float[field6806];
            this.field6821 = new byte[this.field6807];
            this.field6820 = 0;
            this.field6819 = 0;
         }

         while(this.field6819 < this.field6810.length) {
            if (arg0 != null && arg0[0] <= 0) {
               return null;
            }

            float[] var3 = this.method3604(this.field6819);
            if (var3 != null) {
               int var4 = this.field6820;
               int var5 = var3.length;
               if (var5 > this.field6807 - var4) {
                  var5 = this.field6807 - var4;
               }

               for(int var6 = 0; var6 < var5; ++var6) {
                  int var7 = (int)(var3[var6] * 128.0F + 128.0F);
                  if ((var7 & -256) != 0) {
                     var7 = ~var7 >> 31;
                  }

                  this.field6821[var4++] = (byte)(var7 - 128);
               }

               if (arg0 != null) {
                  arg0[0] -= var4 - this.field6820;
               }

               this.field6820 = var4;
            }

            ++this.field6819;
         }

         this.field6818 = null;
         byte[] var2 = this.field6821;
         this.field6821 = null;
         return new class301(this.field6817, var2, this.field6816, this.field6803, this.field6815);
      }
   }

   @OriginalMember(
      owner = "client!ica",
      name = "a",
      descriptor = "([BI)V"
   )
   private static final void method3606(byte[] arg0, int arg1) {
      field6811 = arg0;
      field6802 = arg1;
      field6791 = 0;
   }

   @OriginalMember(
      owner = "client!ica",
      name = "<init>",
      descriptor = "([B)V"
   )
   private class469(byte[] arg0) {
      this.method3602(arg0);
   }
}
