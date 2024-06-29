import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class154 extends class88 {

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "Z")
    private static boolean field2862 = false;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "I")
    private static int field2865;

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "I")
    private int field2866;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
    private static int field2870;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
    private int field2873;

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
    private int field2877;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
    private int field2878;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "I")
    private static int field2879;

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "I")
    private static int field2885;

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "I")
    private int field2886;

    @OriginalMember(owner = "client!nf", name = "W", descriptor = "I")
    private int field2889;

    @OriginalMember(owner = "client!nf", name = "X", descriptor = "I")
    private int field2890;

    @OriginalMember(owner = "client!nf", name = "Y", descriptor = "I")
    private int field2891;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "Z")
    private boolean field2860;

    @OriginalMember(owner = "client!nf", name = "O", descriptor = "Z")
    private boolean field2882;

    @OriginalMember(owner = "client!nf", name = "P", descriptor = "[B")
    private static byte[] field2883;

    @OriginalMember(owner = "client!nf", name = "Z", descriptor = "[B")
    private byte[] field2892;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "[F")
    private float[] field2859;

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "[F")
    private static float[] field2868;

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "[F")
    private static float[] field2869;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "[F")
    private static float[] field2874;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "[F")
    private static float[] field2875;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "[F")
    private static float[] field2876;

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "[F")
    private static float[] field2880;

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "[F")
    private static float[] field2884;

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "[I")
    private static int[] field2871;

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "[I")
    private static int[] field2872;

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "[I")
    private static int[] field2888;

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "[Lj;")
    private static class160[] field2887;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "[Lff;")
    private static class18[] field2864;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "[Ljh;")
    public static class269[] field2881;

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "[Loa;")
    private static class96[] field2863;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "[Z")
    private static boolean[] field2861;

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "[[B")
    private byte[][] field2867;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)[F")
    private final float[] method1164(int arg0) {
        method1167(this.field2867[arg0], 0);
        method1168();
        int var2 = method1169(class28.method160((byte) 114, field2888.length - 1));
        boolean var3 = field2861[var2];
        int var4 = var3 ? field2870 : field2879;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1168() != 0;
            var6 = method1168() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2879 >> 2);
            var9 = (field2879 >> 2) + (var4 >> 2);
            var10 = field2879 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2879 >> 2);
            var12 = (field2879 >> 2) + (var4 - (var4 >> 2));
            var13 = field2879 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class18 var14 = field2864[field2888[var2]];
        int var15 = var14.field239;
        int var16 = var14.field237[var15];
        boolean var17 = !field2863[var16].method703();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field240; var19++) {
            class160 var95 = field2887[var14.field238[var19]];
            float[] var96 = field2868;
            var95.method1203(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field239;
            int var21 = var14.field237[var20];
            field2863[var21].method704(field2868, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2868[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2868;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2874 : field2884;
            float[] var30 = var3 ? field2880 : field2869;
            float[] var31 = var3 ? field2876 : field2875;
            int[] var32 = var3 ? field2871 : field2872;
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
            int var35 = class28.method160((byte) 105, var4 - 1);
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
                field2868[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2868[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2877 > 0) {
            int var49 = this.field2877 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2882) {
                for (int var50 = 0; var50 < this.field2889; var50++) {
                    int var51 = (this.field2877 >> 1) + var50;
                    var48[var50] += this.field2859[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2868[var52];
                }
            }
        }
        float[] var54 = this.field2859;
        this.field2859 = field2868;
        field2868 = var54;
        this.field2877 = var4;
        this.field2889 = var12 - (var4 >> 1);
        this.field2882 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lnc;II)Lnf;")
    public static final class154 method1165(class83 arg0, int arg1, int arg2) {
        if (method1171(arg0)) {
            byte[] var3 = arg0.method590(arg2, arg1, 0);
            return var3 == null ? null : new class154(var3);
        } else {
            arg0.method600(-104, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)F")
    public static final float method1166(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([BI)V")
    private static final void method1167(byte[] arg0, int arg1) {
        field2883 = arg0;
        field2865 = arg1;
        field2885 = 0;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "()I")
    public static final int method1168() {
        int var0 = field2883[field2865] >> field2885 & 0x1;
        field2885++;
        field2865 += field2885 >> 3;
        field2885 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)I")
    public static final int method1169(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2885) {
            int var4 = 8 - field2885;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2883[field2865] >> field2885 & var5) << var2;
            field2885 = 0;
            field2865++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2883[field2865] >> field2885 & var3) << var2;
            field2885 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([B)V")
    private final void method1170(byte[] arg0) {
        class128 var2 = new class128(arg0);
        this.field2873 = var2.method923(true);
        this.field2866 = var2.method923(true);
        this.field2878 = var2.method923(true);
        this.field2886 = var2.method923(true);
        if (this.field2886 < 0) {
            this.field2886 = ~this.field2886;
            this.field2860 = true;
        }
        int var3 = var2.method923(true);
        this.field2867 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method937(false);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method960(var5, var7, -449085448, 0);
            this.field2867[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lnc;)Z")
    private static final boolean method1171(class83 arg0) {
        if (!field2862) {
            byte[] var1 = arg0.method590(0, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1172(var1);
            field2862 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "([B)V")
    private static final void method1172(byte[] arg0) {
        method1167(arg0, 0);
        field2879 = 0x1 << method1169(4);
        field2870 = 0x1 << method1169(4);
        field2868 = new float[field2870];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2879 : field2870;
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
            int var25 = class28.method160((byte) 118, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class110.method824(var25, (byte) 117, var26);
            }
            if (var1 == 0) {
                field2884 = var18;
                field2869 = var20;
                field2875 = var22;
                field2872 = var24;
            } else {
                field2874 = var18;
                field2880 = var20;
                field2876 = var22;
                field2871 = var24;
            }
        }
        int var2 = method1169(8) + 1;
        field2881 = new class269[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2881[var3] = new class269();
        }
        int var4 = method1169(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1169(16);
        }
        int var6 = method1169(6) + 1;
        field2863 = new class96[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2863[var7] = new class96();
        }
        int var8 = method1169(6) + 1;
        field2887 = new class160[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2887[var9] = new class160();
        }
        int var10 = method1169(6) + 1;
        field2864 = new class18[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2864[var11] = new class18();
        }
        int var12 = method1169(6) + 1;
        field2861 = new boolean[var12];
        field2888 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2861[var13] = method1168() != 0;
            method1169(16);
            method1169(16);
            field2888[var13] = method1169(8);
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "()V")
    public static void method1173() {
        field2883 = null;
        field2881 = null;
        field2863 = null;
        field2887 = null;
        field2864 = null;
        field2861 = null;
        field2888 = null;
        field2868 = null;
        field2884 = null;
        field2869 = null;
        field2875 = null;
        field2874 = null;
        field2880 = null;
        field2876 = null;
        field2872 = null;
        field2871 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([I)Lk;")
    public final class174 method1174(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2892 == null) {
            this.field2877 = 0;
            this.field2859 = new float[field2870];
            this.field2892 = new byte[this.field2866];
            this.field2891 = 0;
            this.field2890 = 0;
        }
        while (this.field2890 < this.field2867.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1164(this.field2890);
            if (var3 != null) {
                int var4 = this.field2891;
                int var5 = var3.length;
                if (var5 > this.field2866 - var4) {
                    var5 = this.field2866 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2892[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2891;
                }
                this.field2891 = var4;
            }
            this.field2890++;
        }
        this.field2859 = null;
        byte[] var2 = this.field2892;
        this.field2892 = null;
        return new class174(this.field2873, var2, this.field2878, this.field2886, this.field2860);
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([B)V")
    private class154(byte[] arg0) {
        this.method1170(arg0);
    }
}
