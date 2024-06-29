import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class129 {

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Z")
    private static boolean field2940 = false;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    private int field2931;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    private static int field2937;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    private int field2939;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    private static int field2942;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    private int field2946;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    private static int field2947;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    private static int field2950;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
    private int field2953;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    private static int field2954;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
    private static int field2956;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "Z")
    private static boolean field2959;

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "Z")
    private boolean field2960;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "[B")
    private static byte[] field2951;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "[F")
    private static float[] field2933;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "[F")
    private static float[] field2935;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "[F")
    private static float[] field2936;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "[F")
    private static float[] field2943;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "[F")
    private static float[] field2944;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "[F")
    private static float[] field2949;

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "[F")
    private static float[] field2957;

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "[F")
    private static float[] field2961;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "[I")
    private static int[] field2945;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "[I")
    private static int[] field2952;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "[I")
    private static int[] field2955;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "[Lpa;")
    private static class104[] field2941;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "[Lre;")
    public static class123[] field2934;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "[Lsc;")
    private static class127[] field2932;

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "[Lhf;")
    private static class55[] field2958;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "[Z")
    private static boolean[] field2948;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "[[B")
    private byte[][] field2938;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "()I")
    public static final int method1042() {
        int var0 = field2951[field2937] >> field2956 & 0x1;
        field2956++;
        field2937 += field2956 >> 3;
        field2956 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lpd;)Z")
    private static final boolean method1043(class108 arg0) {
        if (!field2940) {
            byte[] var1 = arg0.method867(0, 15, 0);
            if (var1 == null) {
                return false;
            }
            method1046(var1);
            field2940 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)[F")
    private final float[] method1044(int arg0) {
        method1052(this.field2938[arg0], 0);
        method1042();
        int var2 = method1050(class65.method508(16, field2945.length - 1));
        boolean var3 = field2948[var2];
        int var4 = var3 ? field2942 : field2954;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1042() != 0;
            var6 = method1042() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2954 >> 2);
            var9 = (field2954 >> 2) + (var4 >> 2);
            var10 = field2954 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2954 >> 2);
            var12 = (field2954 >> 2) + (var4 - (var4 >> 2));
            var13 = field2954 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class127 var14 = field2932[field2945[var2]];
        int var15 = var14.field2866;
        int var16 = var14.field2863[var15];
        boolean var17 = !field2941[var16].method833();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2864; var19++) {
            class55 var95 = field2958[var14.field2865[var19]];
            float[] var96 = field2944;
            var95.method379(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2866;
            int var21 = var14.field2863[var20];
            field2941[var21].method837(field2944, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2944[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2944;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2936 : field2935;
            float[] var30 = var3 ? field2949 : field2957;
            float[] var31 = var3 ? field2933 : field2943;
            int[] var32 = var3 ? field2952 : field2955;
            for (int var33 = 0; var33 < var24; var33++) {
                float var91 = var26[var33 * 4] - var26[var4 - var33 * 4 - 1];
                float var92 = var26[var33 * 4 + 2] - var26[var4 - var33 * 4 - 3];
                float var93 = var29[var33 * 2];
                float var94 = var29[var33 * 2 + 1];
                var26[var4 - var33 * 4 - 1] = var91 * var93 - var92 * var94;
                var26[var4 - var33 * 4 - 3] = var91 * var94 + var92 * var93;
            }
            for (int var34 = 0; var34 < var25; var34++) {
                float var85 = var26[var34 * 4 + var23 + 3];
                float var86 = var26[var34 * 4 + var23 + 1];
                float var87 = var26[var34 * 4 + 3];
                float var88 = var26[var34 * 4 + 1];
                var26[var34 * 4 + var23 + 3] = var85 + var87;
                var26[var34 * 4 + var23 + 1] = var86 + var88;
                float var89 = var29[var23 - var34 * 4 - 4];
                float var90 = var29[var23 - var34 * 4 - 3];
                var26[var34 * 4 + 3] = (var85 - var87) * var89 - (var86 - var88) * var90;
                var26[var34 * 4 + 1] = (var85 - var87) * var90 + (var86 - var88) * var89;
            }
            int var35 = class65.method508(16, var4 - 1);
            for (int var36 = 0; var36 < var35 - 3; var36++) {
                int var72 = var4 >> var36 + 2;
                int var73 = 0x8 << var36;
                for (int var74 = 0; var74 < 0x2 << var36; var74++) {
                    int var75 = var4 - var72 * 2 * var74;
                    int var76 = var4 - (var74 * 2 + 1) * var72;
                    for (int var77 = 0; var77 < var4 >> var36 + 4; var77++) {
                        int var78 = var77 * 4;
                        float var79 = var26[var75 - var78 - 1];
                        float var80 = var26[var75 - var78 - 3];
                        float var81 = var26[var76 - var78 - 1];
                        float var82 = var26[var76 - var78 - 3];
                        var26[var75 - var78 - 1] = var79 + var81;
                        var26[var75 - var78 - 3] = var80 + var82;
                        float var83 = var29[var73 * var77];
                        float var84 = var29[var73 * var77 + 1];
                        var26[var76 - var78 - 1] = (var79 - var81) * var83 - (var80 - var82) * var84;
                        var26[var76 - var78 - 3] = (var79 - var81) * var84 + (var80 - var82) * var83;
                    }
                }
            }
            for (int var37 = 1; var37 < var25 - 1; var37++) {
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
            for (int var38 = 0; var38 < var23; var38++) {
                var26[var38] = var26[var38 * 2 + 1];
            }
            for (int var39 = 0; var39 < var25; var39++) {
                var26[var4 - var39 * 2 - 1] = var26[var39 * 4];
                var26[var4 - var39 * 2 - 2] = var26[var39 * 4 + 1];
                var26[var4 - var24 - var39 * 2 - 1] = var26[var39 * 4 + 2];
                var26[var4 - var24 - var39 * 2 - 2] = var26[var39 * 4 + 3];
            }
            for (int var40 = 0; var40 < var25; var40++) {
                float var57 = var31[var40 * 2];
                float var58 = var31[var40 * 2 + 1];
                float var59 = var26[var40 * 2 + var23];
                float var60 = var26[var40 * 2 + var23 + 1];
                float var61 = var26[var4 - var40 * 2 - 2];
                float var62 = var26[var4 - var40 * 2 - 1];
                float var63 = (var59 - var61) * var58 + (var60 + var62) * var57;
                var26[var40 * 2 + var23] = (var59 + var61 + var63) * 0.5F;
                var26[var4 - var40 * 2 - 2] = (var59 + var61 - var63) * 0.5F;
                float var64 = (var60 + var62) * var58 - (var59 - var61) * var57;
                var26[var40 * 2 + var23 + 1] = (var60 + var64 - var62) * 0.5F;
                var26[var4 - var40 * 2 - 1] = (var62 + var64 - var60) * 0.5F;
            }
            for (int var41 = 0; var41 < var24; var41++) {
                var26[var41] = var30[var41 * 2] * var26[var41 * 2 + var23] + var30[var41 * 2 + 1] * var26[var41 * 2 + var23 + 1];
                var26[var23 - var41 - 1] = var26[var41 * 2 + var23] * var30[var41 * 2 + 1] - var30[var41 * 2] * var26[var41 * 2 + var23 + 1];
            }
            for (int var42 = 0; var42 < var24; var42++) {
                var26[var4 + var42 - var24] = -var26[var42];
            }
            for (int var43 = 0; var43 < var24; var43++) {
                var26[var43] = var26[var24 + var43];
            }
            for (int var44 = 0; var44 < var24; var44++) {
                var26[var24 + var44] = -var26[var24 - var44 - 1];
            }
            for (int var45 = 0; var45 < var24; var45++) {
                var26[var23 + var45] = var26[var4 - var45 - 1];
            }
            for (int var46 = var8; var46 < var9; var46++) {
                float var56 = (float) Math.sin(((double) (var46 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                field2944[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2944[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (field2947 > 0) {
            int var49 = field2947 + var4 >> 2;
            var48 = new float[var49];
            if (!field2959) {
                for (int var50 = 0; var50 < field2950; var50++) {
                    int var51 = (field2947 >> 1) + var50;
                    var48[var50] += field2961[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2944[var52];
                }
            }
        }
        float[] var54 = field2961;
        field2961 = field2944;
        field2944 = var54;
        field2947 = var4;
        field2950 = var12 - (var4 >> 1);
        field2959 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "()V")
    public static void method1045() {
        field2951 = null;
        field2934 = null;
        field2941 = null;
        field2958 = null;
        field2932 = null;
        field2948 = null;
        field2945 = null;
        field2961 = null;
        field2944 = null;
        field2935 = null;
        field2957 = null;
        field2943 = null;
        field2936 = null;
        field2949 = null;
        field2933 = null;
        field2955 = null;
        field2952 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([B)V")
    private static final void method1046(byte[] arg0) {
        method1052(arg0, 0);
        field2954 = 0x1 << method1050(4);
        field2942 = 0x1 << method1050(4);
        field2944 = new float[field2942];
        field2961 = new float[field2942];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2954 : field2942;
            int var15 = var14 >> 1;
            int var16 = var14 >> 2;
            int var17 = var14 >> 3;
            float[] var18 = new float[var15];
            for (int var19 = 0; var19 < var16; var19++) {
                var18[var19 * 2] = (float) Math.cos((double) (var19 * 4) * 3.141592653589793D / (double) var14);
                var18[var19 * 2 + 1] = -((float) Math.sin((double) (var19 * 4) * 3.141592653589793D / (double) var14));
            }
            float[] var20 = new float[var15];
            for (int var21 = 0; var21 < var16; var21++) {
                var20[var21 * 2] = (float) Math.cos((double) (var21 * 2 + 1) * 3.141592653589793D / (double) (var14 * 2));
                var20[var21 * 2 + 1] = (float) Math.sin((double) (var21 * 2 + 1) * 3.141592653589793D / (double) (var14 * 2));
            }
            float[] var22 = new float[var16];
            for (int var23 = 0; var23 < var17; var23++) {
                var22[var23 * 2] = (float) Math.cos((double) (var23 * 4 + 2) * 3.141592653589793D / (double) var14);
                var22[var23 * 2 + 1] = -((float) Math.sin((double) (var23 * 4 + 2) * 3.141592653589793D / (double) var14));
            }
            int[] var24 = new int[var17];
            int var25 = class65.method508(16, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class108.method869(var26, (byte) 83, var25);
            }
            if (var1 == 0) {
                field2935 = var18;
                field2957 = var20;
                field2943 = var22;
                field2955 = var24;
            } else {
                field2936 = var18;
                field2949 = var20;
                field2933 = var22;
                field2952 = var24;
            }
        }
        int var2 = method1050(8) + 1;
        field2934 = new class123[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2934[var3] = new class123();
        }
        int var4 = method1050(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1050(16);
        }
        int var6 = method1050(6) + 1;
        field2941 = new class104[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2941[var7] = new class104();
        }
        int var8 = method1050(6) + 1;
        field2958 = new class55[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2958[var9] = new class55();
        }
        int var10 = method1050(6) + 1;
        field2932 = new class127[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2932[var11] = new class127();
        }
        int var12 = method1050(6) + 1;
        field2948 = new boolean[var12];
        field2945 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2948[var13] = method1042() != 0;
            method1050(16);
            method1050(16);
            field2945[var13] = method1050(8);
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "([B)V")
    private final void method1047(byte[] arg0) {
        class128 var2 = new class128(arg0);
        this.field2953 = var2.method1037(18834);
        this.field2931 = var2.method1037(18834);
        this.field2946 = var2.method1037(18834);
        this.field2939 = var2.method1037(18834);
        if (this.field2939 < 0) {
            this.field2939 = ~this.field2939;
            this.field2960 = true;
        }
        int var3 = var2.method1037(18834);
        this.field2938 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1025(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1034(var7, var5, 0, (byte) -18);
            this.field2938[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lpd;II)Lsd;")
    public static final class129 method1048(class108 arg0, int arg1, int arg2) {
        if (method1043(arg0)) {
            byte[] var3 = arg0.method867(arg1, 15, arg2);
            return var3 == null ? null : new class129(var3);
        } else {
            arg0.method883(arg1, -1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "()Lke;")
    public final class74 method1049() {
        field2947 = 0;
        byte[] var1 = new byte[this.field2931];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2938.length; var3++) {
            float[] var4 = this.method1044(var3);
            if (var4 != null) {
                int var5 = var4.length;
                if (var5 > this.field2931 - var2) {
                    var5 = this.field2931 - var2;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var4[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    var1[var2++] = (byte) (var7 - 128);
                }
            }
        }
        return new class74(this.field2953, var1, this.field2946, this.field2939, this.field2960);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)I")
    public static final int method1050(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2956) {
            int var4 = 8 - field2956;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2951[field2937] >> field2956 & var5) << var2;
            field2956 = 0;
            field2937++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2951[field2937] >> field2956 & var3) << var2;
            field2956 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "([B)V")
    private class129(byte[] arg0) {
        this.method1047(arg0);
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)F")
    public static final float method1051(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([BI)V")
    private static final void method1052(byte[] arg0, int arg1) {
        field2951 = arg0;
        field2937 = arg1;
        field2956 = 0;
    }
}
