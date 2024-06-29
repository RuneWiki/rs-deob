import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class341 extends class60 {

    @OriginalMember(owner = "client!km", name = "t", descriptor = "Z")
    private static boolean field5262 = false;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "I")
    private int field5260;

    @OriginalMember(owner = "client!km", name = "w", descriptor = "I")
    private int field5265;

    @OriginalMember(owner = "client!km", name = "x", descriptor = "I")
    private int field5266;

    @OriginalMember(owner = "client!km", name = "H", descriptor = "I")
    private int field5276;

    @OriginalMember(owner = "client!km", name = "I", descriptor = "I")
    private int field5277;

    @OriginalMember(owner = "client!km", name = "J", descriptor = "I")
    private int field5278;

    @OriginalMember(owner = "client!km", name = "M", descriptor = "I")
    private static int field5281;

    @OriginalMember(owner = "client!km", name = "P", descriptor = "I")
    private static int field5284;

    @OriginalMember(owner = "client!km", name = "Q", descriptor = "I")
    private int field5285;

    @OriginalMember(owner = "client!km", name = "R", descriptor = "I")
    private static int field5286;

    @OriginalMember(owner = "client!km", name = "S", descriptor = "I")
    private int field5287;

    @OriginalMember(owner = "client!km", name = "U", descriptor = "I")
    private static int field5289;

    @OriginalMember(owner = "client!km", name = "D", descriptor = "Z")
    private boolean field5272;

    @OriginalMember(owner = "client!km", name = "E", descriptor = "Z")
    private boolean field5273;

    @OriginalMember(owner = "client!km", name = "s", descriptor = "[B")
    private static byte[] field5261;

    @OriginalMember(owner = "client!km", name = "T", descriptor = "[B")
    private byte[] field5288;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "[F")
    private static float[] field5256;

    @OriginalMember(owner = "client!km", name = "u", descriptor = "[F")
    private static float[] field5263;

    @OriginalMember(owner = "client!km", name = "z", descriptor = "[F")
    private float[] field5268;

    @OriginalMember(owner = "client!km", name = "F", descriptor = "[F")
    private static float[] field5274;

    @OriginalMember(owner = "client!km", name = "G", descriptor = "[F")
    private static float[] field5275;

    @OriginalMember(owner = "client!km", name = "K", descriptor = "[F")
    private static float[] field5279;

    @OriginalMember(owner = "client!km", name = "N", descriptor = "[F")
    private static float[] field5282;

    @OriginalMember(owner = "client!km", name = "O", descriptor = "[F")
    private static float[] field5283;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "[I")
    private static int[] field5257;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "[I")
    private static int[] field5258;

    @OriginalMember(owner = "client!km", name = "A", descriptor = "[I")
    private static int[] field5269;

    @OriginalMember(owner = "client!km", name = "L", descriptor = "[Llf;")
    private static class134[] field5280;

    @OriginalMember(owner = "client!km", name = "B", descriptor = "[Lfc;")
    public static class239[] field5270;

    @OriginalMember(owner = "client!km", name = "C", descriptor = "[Lqm;")
    private static class248[] field5271;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "[Lpc;")
    private static class98[] field5259;

    @OriginalMember(owner = "client!km", name = "v", descriptor = "[Z")
    private static boolean[] field5264;

    @OriginalMember(owner = "client!km", name = "y", descriptor = "[[B")
    private byte[][] field5267;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lpk;II)Lkm;", line = 9)
    public static final class341 method2362(class120 arg0, int arg1, int arg2) {
        if (method2370(arg0)) {
            byte[] var3 = arg0.method967(arg1, arg2, 65280);
            return var3 == null ? null : new class341(var3);
        } else {
            arg0.method953(arg2, arg1, true);
            return null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "()I", line = 26)
    public static final int method2363() {
        int var0 = field5261[field5281] >> field5286 & 0x1;
        field5286++;
        field5281 += field5286 >> 3;
        field5286 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)[F", line = 34)
    private final float[] method2364(int arg0) {
        method2365(this.field5267[arg0], 0);
        method2363();
        int var2 = method2366(class294.method2060(2047, field5269.length - 1));
        boolean var3 = field5264[var2];
        int var4 = var3 ? field5289 : field5284;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2363() != 0;
            var6 = method2363() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field5284 >> 2);
            var9 = (field5284 >> 2) + (var4 >> 2);
            var10 = field5284 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field5284 >> 2);
            var12 = (field5284 >> 2) + (var4 - (var4 >> 2));
            var13 = field5284 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class248 var14 = field5271[field5269[var2]];
        int var15 = var14.field3686;
        int var16 = var14.field3688[var15];
        boolean var17 = !field5259[var16].method792();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3685; var19++) {
            class134 var20 = field5280[var14.field3687[var19]];
            float[] var21 = field5256;
            var20.method1030(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field3686;
            int var23 = var14.field3688[var22];
            field5259[var23].method794(field5256, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field5256[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field5256;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field5282 : field5275;
            float[] var32 = var3 ? field5263 : field5279;
            float[] var33 = var3 ? field5283 : field5274;
            int[] var34 = var3 ? field5257 : field5258;
            for (int var35 = 0; var35 < var26; var35++) {
                float var36 = var28[var35 * 4] - var28[var4 - var35 * 4 - 1];
                float var37 = var28[var35 * 4 + 2] - var28[var4 - var35 * 4 - 3];
                float var38 = var31[var35 * 2];
                float var39 = var31[var35 * 2 + 1];
                var28[var4 - var35 * 4 - 1] = var36 * var38 - var37 * var39;
                var28[var4 - var35 * 4 - 3] = var36 * var39 + var37 * var38;
            }
            for (int var40 = 0; var40 < var27; var40++) {
                float var41 = var28[var40 * 4 + var25 + 3];
                float var42 = var28[var40 * 4 + var25 + 1];
                float var43 = var28[var40 * 4 + 3];
                float var44 = var28[var40 * 4 + 1];
                var28[var40 * 4 + var25 + 3] = var41 + var43;
                var28[var40 * 4 + var25 + 1] = var42 + var44;
                float var45 = var31[var25 - var40 * 4 - 4];
                float var46 = var31[var25 - var40 * 4 - 3];
                var28[var40 * 4 + 3] = (var41 - var43) * var45 - (var42 - var44) * var46;
                var28[var40 * 4 + 1] = (var41 - var43) * var46 + (var42 - var44) * var45;
            }
            int var47 = class294.method2060(2047, var4 - 1);
            for (int var48 = 0; var48 < var47 - 3; var48++) {
                int var49 = var4 >> var48 + 2;
                int var50 = 0x8 << var48;
                for (int var51 = 0; var51 < 0x2 << var48; var51++) {
                    int var52 = var4 - var49 * 2 * var51;
                    int var53 = var4 - (var51 * 2 + 1) * var49;
                    for (int var54 = 0; var54 < var4 >> var48 + 4; var54++) {
                        int var55 = var54 * 4;
                        float var56 = var28[var52 - var55 - 1];
                        float var57 = var28[var52 - var55 - 3];
                        float var58 = var28[var53 - var55 - 1];
                        float var59 = var28[var53 - var55 - 3];
                        var28[var52 - var55 - 1] = var56 + var58;
                        var28[var52 - var55 - 3] = var57 + var59;
                        float var60 = var31[var50 * var54];
                        float var61 = var31[var50 * var54 + 1];
                        var28[var53 - var55 - 1] = (var56 - var58) * var60 - (var57 - var59) * var61;
                        var28[var53 - var55 - 3] = (var56 - var58) * var61 + (var57 - var59) * var60;
                    }
                }
            }
            for (int var62 = 1; var62 < var27 - 1; var62++) {
                int var63 = var34[var62];
                if (var62 < var63) {
                    int var64 = var62 * 8;
                    int var65 = var63 * 8;
                    float var66 = var28[var64 + 1];
                    var28[var64 + 1] = var28[var65 + 1];
                    var28[var65 + 1] = var66;
                    float var67 = var28[var64 + 3];
                    var28[var64 + 3] = var28[var65 + 3];
                    var28[var65 + 3] = var67;
                    float var68 = var28[var64 + 5];
                    var28[var64 + 5] = var28[var65 + 5];
                    var28[var65 + 5] = var68;
                    float var69 = var28[var64 + 7];
                    var28[var64 + 7] = var28[var65 + 7];
                    var28[var65 + 7] = var69;
                }
            }
            for (int var70 = 0; var70 < var25; var70++) {
                var28[var70] = var28[var70 * 2 + 1];
            }
            for (int var71 = 0; var71 < var27; var71++) {
                var28[var4 - var71 * 2 - 1] = var28[var71 * 4];
                var28[var4 - var71 * 2 - 2] = var28[var71 * 4 + 1];
                var28[var4 - var26 - var71 * 2 - 1] = var28[var71 * 4 + 2];
                var28[var4 - var26 - var71 * 2 - 2] = var28[var71 * 4 + 3];
            }
            for (int var72 = 0; var72 < var27; var72++) {
                float var73 = var33[var72 * 2];
                float var74 = var33[var72 * 2 + 1];
                float var75 = var28[var72 * 2 + var25];
                float var76 = var28[var72 * 2 + var25 + 1];
                float var77 = var28[var4 - var72 * 2 - 2];
                float var78 = var28[var4 - var72 * 2 - 1];
                float var79 = (var75 - var77) * var74 + (var76 + var78) * var73;
                var28[var72 * 2 + var25] = (var75 + var77 + var79) * 0.5F;
                var28[var4 - var72 * 2 - 2] = (var75 + var77 - var79) * 0.5F;
                float var80 = (var76 + var78) * var74 - (var75 - var77) * var73;
                var28[var72 * 2 + var25 + 1] = (var76 + var80 - var78) * 0.5F;
                var28[var4 - var72 * 2 - 1] = (var78 + var80 - var76) * 0.5F;
            }
            for (int var81 = 0; var81 < var26; var81++) {
                var28[var81] = var32[var81 * 2] * var28[var81 * 2 + var25] + var32[var81 * 2 + 1] * var28[var81 * 2 + var25 + 1];
                var28[var25 - var81 - 1] = var28[var81 * 2 + var25] * var32[var81 * 2 + 1] - var32[var81 * 2] * var28[var81 * 2 + var25 + 1];
            }
            for (int var82 = 0; var82 < var26; var82++) {
                var28[var4 + var82 - var26] = -var28[var82];
            }
            for (int var83 = 0; var83 < var26; var83++) {
                var28[var83] = var28[var26 + var83];
            }
            for (int var84 = 0; var84 < var26; var84++) {
                var28[var26 + var84] = -var28[var26 - var84 - 1];
            }
            for (int var85 = 0; var85 < var26; var85++) {
                var28[var25 + var85] = var28[var4 - var85 - 1];
            }
            for (int var86 = var8; var86 < var9; var86++) {
                float var87 = (float) Math.sin(((double) (var86 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                field5256[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field5256[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field5277 > 0) {
            int var91 = this.field5277 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field5272) {
                for (int var92 = 0; var92 < this.field5276; var92++) {
                    int var93 = (this.field5277 >> 1) + var92;
                    var90[var92] += this.field5268[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field5256[var94];
                }
            }
        }
        float[] var96 = this.field5268;
        this.field5268 = field5256;
        field5256 = var96;
        this.field5277 = var4;
        this.field5276 = var12 - (var4 >> 1);
        this.field5272 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([BI)V", line = 446)
    private static final void method2365(byte[] arg0, int arg1) {
        field5261 = arg0;
        field5281 = arg1;
        field5286 = 0;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)I", line = 465)
    public static final int method2366(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field5286) {
            int var3 = 8 - field5286;
            int var4 = (0x1 << var3) - 1;
            var1 += (field5261[field5281] >> field5286 & var4) << var2;
            field5286 = 0;
            field5281++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field5261[field5281] >> field5286 & var5) << var2;
            field5286 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([B)V", line = 497)
    private final void method2367(byte[] arg0) {
        class1 var2 = new class1(arg0);
        this.field5266 = var2.method33(false);
        this.field5260 = var2.method33(false);
        this.field5265 = var2.method33(false);
        this.field5278 = var2.method33(false);
        if (this.field5278 < 0) {
            this.field5278 = ~this.field5278;
            this.field5273 = true;
        }
        int var3 = var2.method33(false);
        this.field5267 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method15((byte) 71);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method20(var7, 0, (byte) 78, var5);
            this.field5267[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "()V", line = 540)
    public static void method2368() {
        field5261 = null;
        field5270 = null;
        field5259 = null;
        field5280 = null;
        field5271 = null;
        field5264 = null;
        field5269 = null;
        field5256 = null;
        field5275 = null;
        field5279 = null;
        field5274 = null;
        field5282 = null;
        field5263 = null;
        field5283 = null;
        field5258 = null;
        field5257 = null;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "([B)V", line = 558)
    private static final void method2369(byte[] arg0) {
        method2365(arg0, 0);
        field5284 = 0x1 << method2366(4);
        field5289 = 0x1 << method2366(4);
        field5256 = new float[field5289];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field5284 : field5289;
            int var3 = var2 >> 1;
            int var4 = var2 >> 2;
            int var5 = var2 >> 3;
            float[] var6 = new float[var3];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7 * 2] = (float) Math.cos((double) (var7 * 4) * 3.141592653589793D / (double) var2);
                var6[var7 * 2 + 1] = -((float) Math.sin((double) (var7 * 4) * 3.141592653589793D / (double) var2));
            }
            float[] var8 = new float[var3];
            for (int var9 = 0; var9 < var4; var9++) {
                var8[var9 * 2] = (float) Math.cos((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
                var8[var9 * 2 + 1] = (float) Math.sin((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
            }
            float[] var10 = new float[var4];
            for (int var11 = 0; var11 < var5; var11++) {
                var10[var11 * 2] = (float) Math.cos((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2);
                var10[var11 * 2 + 1] = -((float) Math.sin((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2));
            }
            int[] var12 = new int[var5];
            int var13 = class294.method2060(2047, var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class12.method171(12848, var13, var14);
            }
            if (var1 == 0) {
                field5275 = var6;
                field5279 = var8;
                field5274 = var10;
                field5258 = var12;
            } else {
                field5282 = var6;
                field5263 = var8;
                field5283 = var10;
                field5257 = var12;
            }
        }
        int var15 = method2366(8) + 1;
        field5270 = new class239[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field5270[var16] = new class239();
        }
        int var17 = method2366(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method2366(16);
        }
        int var19 = method2366(6) + 1;
        field5259 = new class98[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field5259[var20] = new class98();
        }
        int var21 = method2366(6) + 1;
        field5280 = new class134[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field5280[var22] = new class134();
        }
        int var23 = method2366(6) + 1;
        field5271 = new class248[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field5271[var24] = new class248();
        }
        int var25 = method2366(6) + 1;
        field5264 = new boolean[var25];
        field5269 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field5264[var26] = method2363() != 0;
            method2366(16);
            method2366(16);
            field5269[var26] = method2366(8);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lpk;)Z", line = 711)
    private static final boolean method2370(class120 arg0) {
        if (!field5262) {
            byte[] var1 = arg0.method967(0, 0, 65280);
            if (var1 == null) {
                return false;
            }
            method2369(var1);
            field5262 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(I)F", line = 728)
    public static final float method2371(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "([B)V", line = 743)
    private class341(byte[] arg0) {
        this.method2367(arg0);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([I)Lrk;", line = 747)
    public final class187 method2372(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field5288 == null) {
            this.field5277 = 0;
            this.field5268 = new float[field5289];
            this.field5288 = new byte[this.field5260];
            this.field5287 = 0;
            this.field5285 = 0;
        }
        while (this.field5285 < this.field5267.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method2364(this.field5285);
            if (var2 != null) {
                int var3 = this.field5287;
                int var4 = var2.length;
                if (var4 > this.field5260 - var3) {
                    var4 = this.field5260 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field5288[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field5287;
                }
                this.field5287 = var3;
            }
            this.field5285++;
        }
        this.field5268 = null;
        byte[] var7 = this.field5288;
        this.field5288 = null;
        return new class187(this.field5266, var7, this.field5265, this.field5278, this.field5273);
    }
}
