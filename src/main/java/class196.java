import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class196 extends class46 {

    @OriginalMember(owner = "client!wm", name = "K", descriptor = "Z")
    private static boolean field2943 = false;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    private int field2921;

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "I")
    private static int field2926;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "I")
    private static int field2927;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "I")
    private int field2928;

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "I")
    private static int field2929;

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "I")
    private static int field2931;

    @OriginalMember(owner = "client!wm", name = "A", descriptor = "I")
    private int field2933;

    @OriginalMember(owner = "client!wm", name = "D", descriptor = "I")
    private int field2936;

    @OriginalMember(owner = "client!wm", name = "N", descriptor = "I")
    private int field2946;

    @OriginalMember(owner = "client!wm", name = "O", descriptor = "I")
    private int field2947;

    @OriginalMember(owner = "client!wm", name = "T", descriptor = "I")
    private int field2952;

    @OriginalMember(owner = "client!wm", name = "V", descriptor = "I")
    private int field2954;

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "Z")
    private boolean field2930;

    @OriginalMember(owner = "client!wm", name = "P", descriptor = "Z")
    private boolean field2948;

    @OriginalMember(owner = "client!wm", name = "F", descriptor = "[B")
    private static byte[] field2938;

    @OriginalMember(owner = "client!wm", name = "U", descriptor = "[B")
    private byte[] field2953;

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "[F")
    private static float[] field2925;

    @OriginalMember(owner = "client!wm", name = "B", descriptor = "[F")
    private static float[] field2934;

    @OriginalMember(owner = "client!wm", name = "C", descriptor = "[F")
    private static float[] field2935;

    @OriginalMember(owner = "client!wm", name = "H", descriptor = "[F")
    private static float[] field2940;

    @OriginalMember(owner = "client!wm", name = "I", descriptor = "[F")
    private float[] field2941;

    @OriginalMember(owner = "client!wm", name = "L", descriptor = "[F")
    private static float[] field2944;

    @OriginalMember(owner = "client!wm", name = "R", descriptor = "[F")
    private static float[] field2950;

    @OriginalMember(owner = "client!wm", name = "S", descriptor = "[F")
    private static float[] field2951;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "[I")
    private static int[] field2922;

    @OriginalMember(owner = "client!wm", name = "E", descriptor = "[I")
    private static int[] field2937;

    @OriginalMember(owner = "client!wm", name = "J", descriptor = "[I")
    private static int[] field2942;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "[Lao;")
    private static class236[] field2924;

    @OriginalMember(owner = "client!wm", name = "M", descriptor = "[Lm;")
    private static class243[] field2945;

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "[Loi;")
    public static class27[] field2932;

    @OriginalMember(owner = "client!wm", name = "Q", descriptor = "[Ljn;")
    private static class57[] field2949;

    @OriginalMember(owner = "client!wm", name = "G", descriptor = "[Z")
    private static boolean[] field2939;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "[[B")
    private byte[][] field2923;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "(I)F", line = 4)
    public static final float method1392(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "(I)[F", line = 16)
    private final float[] method1393(int arg0) {
        method1395(this.field2923[arg0], 0);
        method1398();
        int var2 = method1396(class34.method284(field2922.length - 1, (byte) 18));
        boolean var3 = field2939[var2];
        int var4 = var3 ? field2929 : field2931;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1398() != 0;
            var6 = method1398() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2931 >> 2);
            var9 = (field2931 >> 2) + (var4 >> 2);
            var10 = field2931 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2931 >> 2);
            var12 = (field2931 >> 2) + (var4 - (var4 >> 2));
            var13 = field2931 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class57 var14 = field2949[field2922[var2]];
        int var15 = var14.field936;
        int var16 = var14.field935[var15];
        boolean var17 = !field2945[var16].method1682();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field933; var19++) {
            class236 var20 = field2924[var14.field934[var19]];
            float[] var21 = field2934;
            var20.method1655(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field936;
            int var23 = var14.field935[var22];
            field2945[var23].method1686(field2934, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field2934[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field2934;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field2950 : field2940;
            float[] var32 = var3 ? field2925 : field2951;
            float[] var33 = var3 ? field2944 : field2935;
            int[] var34 = var3 ? field2942 : field2937;
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
            int var47 = class34.method284(var4 - 1, (byte) 18);
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
                field2934[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2934[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field2936 > 0) {
            int var91 = this.field2936 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field2930) {
                for (int var92 = 0; var92 < this.field2933; var92++) {
                    int var93 = (this.field2936 >> 1) + var92;
                    var90[var92] += this.field2941[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field2934[var94];
                }
            }
        }
        float[] var96 = this.field2941;
        this.field2941 = field2934;
        field2934 = var96;
        this.field2936 = var4;
        this.field2933 = var12 - (var4 >> 1);
        this.field2930 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ll;II)Lwm;", line = 429)
    public static final class196 method1394(class133 arg0, int arg1, int arg2) {
        if (method1400(arg0)) {
            byte[] var3 = arg0.method980(arg1, arg2, 5);
            return var3 == null ? null : new class196(var3);
        } else {
            arg0.method949(arg2, arg1, -17264);
            return null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([BI)V", line = 446)
    private static final void method1395(byte[] arg0, int arg1) {
        field2938 = arg0;
        field2927 = arg1;
        field2926 = 0;
    }

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "(I)I", line = 460)
    public static final int method1396(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2926) {
            int var3 = 8 - field2926;
            int var4 = (0x1 << var3) - 1;
            var1 += (field2938[field2927] >> field2926 & var4) << var2;
            field2926 = 0;
            field2927++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field2938[field2927] >> field2926 & var5) << var2;
            field2926 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "()V", line = 490)
    public static void method1397() {
        field2938 = null;
        field2932 = null;
        field2945 = null;
        field2924 = null;
        field2949 = null;
        field2939 = null;
        field2922 = null;
        field2934 = null;
        field2940 = null;
        field2951 = null;
        field2935 = null;
        field2950 = null;
        field2925 = null;
        field2944 = null;
        field2937 = null;
        field2942 = null;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "()I", line = 509)
    public static final int method1398() {
        int var0 = field2938[field2927] >> field2926 & 0x1;
        field2926++;
        field2927 += field2926 >> 3;
        field2926 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([I)Ljf;", line = 520)
    public final class340 method1399(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2953 == null) {
            this.field2936 = 0;
            this.field2941 = new float[field2929];
            this.field2953 = new byte[this.field2921];
            this.field2954 = 0;
            this.field2952 = 0;
        }
        while (this.field2952 < this.field2923.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1393(this.field2952);
            if (var2 != null) {
                int var3 = this.field2954;
                int var4 = var2.length;
                if (var4 > this.field2921 - var3) {
                    var4 = this.field2921 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field2953[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field2954;
                }
                this.field2954 = var3;
            }
            this.field2952++;
        }
        this.field2941 = null;
        byte[] var7 = this.field2953;
        this.field2953 = null;
        return new class340(this.field2947, var7, this.field2946, this.field2928, this.field2948);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ll;)Z", line = 579)
    private static final boolean method1400(class133 arg0) {
        if (!field2943) {
            byte[] var1 = arg0.method980(0, 0, 5);
            if (var1 == null) {
                return false;
            }
            method1402(var1);
            field2943 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([B)V", line = 604)
    private final void method1401(byte[] arg0) {
        class166 var2 = new class166(arg0);
        this.field2947 = var2.method1137(-28);
        this.field2921 = var2.method1137(-97);
        this.field2946 = var2.method1137(68);
        this.field2928 = var2.method1137(89);
        if (this.field2928 < 0) {
            this.field2928 = ~this.field2928;
            this.field2948 = true;
        }
        int var3 = var2.method1137(67);
        this.field2923 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1178(0);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1124(0, var5, var7, 3);
            this.field2923[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "([B)V", line = 649)
    private static final void method1402(byte[] arg0) {
        method1395(arg0, 0);
        field2931 = 0x1 << method1396(4);
        field2929 = 0x1 << method1396(4);
        field2934 = new float[field2929];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field2931 : field2929;
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
            int var13 = class34.method284(var5 - 1, (byte) 18);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class333.method2314(var14, var13, -14538);
            }
            if (var1 == 0) {
                field2940 = var6;
                field2951 = var8;
                field2935 = var10;
                field2937 = var12;
            } else {
                field2950 = var6;
                field2925 = var8;
                field2944 = var10;
                field2942 = var12;
            }
        }
        int var15 = method1396(8) + 1;
        field2932 = new class27[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field2932[var16] = new class27();
        }
        int var17 = method1396(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method1396(16);
        }
        int var19 = method1396(6) + 1;
        field2945 = new class243[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field2945[var20] = new class243();
        }
        int var21 = method1396(6) + 1;
        field2924 = new class236[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field2924[var22] = new class236();
        }
        int var23 = method1396(6) + 1;
        field2949 = new class57[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field2949[var24] = new class57();
        }
        int var25 = method1396(6) + 1;
        field2939 = new boolean[var25];
        field2922 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field2939[var26] = method1398() != 0;
            method1396(16);
            method1396(16);
            field2922[var26] = method1396(8);
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "([B)V", line = 803)
    private class196(byte[] arg0) {
        this.method1401(arg0);
    }
}
