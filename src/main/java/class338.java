import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class338 extends class332 {

    @OriginalMember(owner = "client!al", name = "l", descriptor = "Z")
    private static boolean field5224 = false;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    private int field5230;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "I")
    private static int field5231;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "I")
    private int field5236;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "I")
    private int field5237;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "I")
    private static int field5238;

    @OriginalMember(owner = "client!al", name = "A", descriptor = "I")
    private int field5239;

    @OriginalMember(owner = "client!al", name = "B", descriptor = "I")
    private static int field5240;

    @OriginalMember(owner = "client!al", name = "C", descriptor = "I")
    private static int field5241;

    @OriginalMember(owner = "client!al", name = "L", descriptor = "I")
    private int field5250;

    @OriginalMember(owner = "client!al", name = "N", descriptor = "I")
    private int field5252;

    @OriginalMember(owner = "client!al", name = "P", descriptor = "I")
    private int field5254;

    @OriginalMember(owner = "client!al", name = "Q", descriptor = "I")
    private int field5255;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "Z")
    private boolean field5223;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "Z")
    private boolean field5234;

    @OriginalMember(owner = "client!al", name = "K", descriptor = "[B")
    private static byte[] field5249;

    @OriginalMember(owner = "client!al", name = "O", descriptor = "[B")
    private byte[] field5253;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "[F")
    private static float[] field5225;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "[F")
    private static float[] field5226;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "[F")
    private static float[] field5227;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "[F")
    private static float[] field5228;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "[F")
    private static float[] field5235;

    @OriginalMember(owner = "client!al", name = "H", descriptor = "[F")
    private float[] field5246;

    @OriginalMember(owner = "client!al", name = "I", descriptor = "[F")
    private static float[] field5247;

    @OriginalMember(owner = "client!al", name = "M", descriptor = "[F")
    private static float[] field5251;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "[I")
    private static int[] field5232;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "[I")
    private static int[] field5233;

    @OriginalMember(owner = "client!al", name = "G", descriptor = "[I")
    private static int[] field5245;

    @OriginalMember(owner = "client!al", name = "J", descriptor = "[Llg;")
    public static class131[] field5248;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "[Lab;")
    private static class156[] field5222;

    @OriginalMember(owner = "client!al", name = "E", descriptor = "[Luf;")
    private static class24[] field5243;

    @OriginalMember(owner = "client!al", name = "F", descriptor = "[Lkm;")
    private static class341[] field5244;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "[Z")
    private static boolean[] field5229;

    @OriginalMember(owner = "client!al", name = "D", descriptor = "[[B")
    private byte[][] field5242;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "([I)Lgl;", line = 4)
    public final class203 method2334(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field5253 == null) {
            this.field5239 = 0;
            this.field5246 = new float[field5240];
            this.field5253 = new byte[this.field5250];
            this.field5255 = 0;
            this.field5254 = 0;
        }
        while (this.field5254 < this.field5242.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method2343(this.field5254);
            if (var2 != null) {
                int var3 = this.field5255;
                int var4 = var2.length;
                if (var4 > this.field5250 - var3) {
                    var4 = this.field5250 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field5253[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field5255;
                }
                this.field5255 = var3;
            }
            this.field5254++;
        }
        this.field5246 = null;
        byte[] var7 = this.field5253;
        this.field5253 = null;
        return new class203(this.field5230, var7, this.field5237, this.field5252, this.field5223);
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)I", line = 64)
    public static final int method2335(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field5241) {
            int var3 = 8 - field5241;
            int var4 = (0x1 << var3) - 1;
            var1 += (field5249[field5238] >> field5241 & var4) << var2;
            field5241 = 0;
            field5238++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field5249[field5238] >> field5241 & var5) << var2;
            field5241 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Llc;II)Lal;", line = 93)
    public static final class338 method2336(class175 arg0, int arg1, int arg2) {
        if (method2340(arg0)) {
            byte[] var3 = arg0.method1199(28815, arg2, arg1);
            return var3 == null ? null : new class338(var3);
        } else {
            arg0.method1185(arg2, -2, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "([B)V", line = 108)
    private final void method2337(byte[] arg0) {
        class107 var2 = new class107(arg0);
        this.field5230 = var2.method676(true);
        this.field5250 = var2.method676(true);
        this.field5237 = var2.method676(true);
        this.field5252 = var2.method676(true);
        if (this.field5252 < 0) {
            this.field5252 = ~this.field5252;
            this.field5223 = true;
        }
        int var3 = var2.method676(true);
        this.field5242 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method661(-1);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method626(true, var5, 0, var7);
            this.field5242[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "([BI)V", line = 163)
    private static final void method2338(byte[] arg0, int arg1) {
        field5249 = arg0;
        field5238 = arg1;
        field5241 = 0;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "([B)V", line = 169)
    private static final void method2339(byte[] arg0) {
        method2338(arg0, 0);
        field5231 = 0x1 << method2335(4);
        field5240 = 0x1 << method2335(4);
        field5235 = new float[field5240];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field5231 : field5240;
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
            int var13 = class98.method591(var5 - 1, -106);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class49.method295(var14, -1, var13);
            }
            if (var1 == 0) {
                field5225 = var6;
                field5226 = var8;
                field5227 = var10;
                field5245 = var12;
            } else {
                field5251 = var6;
                field5228 = var8;
                field5247 = var10;
                field5233 = var12;
            }
        }
        int var15 = method2335(8) + 1;
        field5248 = new class131[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field5248[var16] = new class131();
        }
        int var17 = method2335(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method2335(16);
        }
        int var19 = method2335(6) + 1;
        field5244 = new class341[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field5244[var20] = new class341();
        }
        int var21 = method2335(6) + 1;
        field5243 = new class24[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field5243[var22] = new class24();
        }
        int var23 = method2335(6) + 1;
        field5222 = new class156[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field5222[var24] = new class156();
        }
        int var25 = method2335(6) + 1;
        field5229 = new boolean[var25];
        field5232 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field5229[var26] = method2341() != 0;
            method2335(16);
            method2335(16);
            field5232[var26] = method2335(8);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Llc;)Z", line = 320)
    private static final boolean method2340(class175 arg0) {
        if (!field5224) {
            byte[] var1 = arg0.method1199(28815, 0, 0);
            if (var1 == null) {
                return false;
            }
            method2339(var1);
            field5224 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "()I", line = 342)
    public static final int method2341() {
        int var0 = field5249[field5238] >> field5241 & 0x1;
        field5241++;
        field5238 += field5241 >> 3;
        field5241 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "()V", line = 356)
    public static void method2342() {
        field5249 = null;
        field5248 = null;
        field5244 = null;
        field5243 = null;
        field5222 = null;
        field5229 = null;
        field5232 = null;
        field5235 = null;
        field5225 = null;
        field5226 = null;
        field5227 = null;
        field5251 = null;
        field5228 = null;
        field5247 = null;
        field5245 = null;
        field5233 = null;
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(I)[F", line = 376)
    private final float[] method2343(int arg0) {
        method2338(this.field5242[arg0], 0);
        method2341();
        int var2 = method2335(class98.method591(field5232.length - 1, -85));
        boolean var3 = field5229[var2];
        int var4 = var3 ? field5240 : field5231;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2341() != 0;
            var6 = method2341() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field5231 >> 2);
            var9 = (field5231 >> 2) + (var4 >> 2);
            var10 = field5231 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field5231 >> 2);
            var12 = (field5231 >> 2) + (var4 - (var4 >> 2));
            var13 = field5231 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class156 var14 = field5222[field5232[var2]];
        int var15 = var14.field2166;
        int var16 = var14.field2165[var15];
        boolean var17 = !field5244[var16].method2364();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2164; var19++) {
            class24 var20 = field5243[var14.field2163[var19]];
            float[] var21 = field5235;
            var20.method157(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field2166;
            int var23 = var14.field2165[var22];
            field5244[var23].method2362(field5235, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field5235[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field5235;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field5251 : field5225;
            float[] var32 = var3 ? field5228 : field5226;
            float[] var33 = var3 ? field5247 : field5227;
            int[] var34 = var3 ? field5233 : field5245;
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
            int var47 = class98.method591(var4 - 1, -90);
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
                field5235[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field5235[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field5239 > 0) {
            int var91 = this.field5239 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field5234) {
                for (int var92 = 0; var92 < this.field5236; var92++) {
                    int var93 = (this.field5239 >> 1) + var92;
                    var90[var92] += this.field5246[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field5235[var94];
                }
            }
        }
        float[] var96 = this.field5246;
        this.field5246 = field5235;
        field5235 = var96;
        this.field5239 = var4;
        this.field5236 = var12 - (var4 >> 1);
        this.field5234 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "([B)V", line = 791)
    private class338(byte[] arg0) {
        this.method2337(arg0);
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(I)F", line = 799)
    public static final float method2344(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }
}
