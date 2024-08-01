import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fe")
public class class56 extends class71 {

    @OriginalMember(owner = "fe", name = "n", descriptor = "Z")
    private static boolean field1118 = false;

    @OriginalMember(owner = "fe", name = "q", descriptor = "I")
    private static int field1121;

    @OriginalMember(owner = "fe", name = "r", descriptor = "I")
    private int field1122;

    @OriginalMember(owner = "fe", name = "x", descriptor = "I")
    private int field1128;

    @OriginalMember(owner = "fe", name = "A", descriptor = "I")
    private int field1131;

    @OriginalMember(owner = "fe", name = "C", descriptor = "I")
    private int field1133;

    @OriginalMember(owner = "fe", name = "I", descriptor = "I")
    private int field1139;

    @OriginalMember(owner = "fe", name = "L", descriptor = "I")
    private static int field1142;

    @OriginalMember(owner = "fe", name = "M", descriptor = "I")
    private static int field1143;

    @OriginalMember(owner = "fe", name = "O", descriptor = "I")
    private static int field1145;

    @OriginalMember(owner = "fe", name = "P", descriptor = "I")
    private int field1146;

    @OriginalMember(owner = "fe", name = "R", descriptor = "I")
    private int field1148;

    @OriginalMember(owner = "fe", name = "U", descriptor = "I")
    private int field1151;

    @OriginalMember(owner = "fe", name = "p", descriptor = "Z")
    private boolean field1120;

    @OriginalMember(owner = "fe", name = "z", descriptor = "Z")
    private boolean field1130;

    @OriginalMember(owner = "fe", name = "N", descriptor = "[B")
    private static byte[] field1144;

    @OriginalMember(owner = "fe", name = "S", descriptor = "[B")
    private byte[] field1149;

    @OriginalMember(owner = "fe", name = "v", descriptor = "[F")
    private static float[] field1126;

    @OriginalMember(owner = "fe", name = "w", descriptor = "[F")
    private static float[] field1127;

    @OriginalMember(owner = "fe", name = "B", descriptor = "[F")
    private static float[] field1132;

    @OriginalMember(owner = "fe", name = "E", descriptor = "[F")
    private static float[] field1135;

    @OriginalMember(owner = "fe", name = "F", descriptor = "[F")
    private static float[] field1136;

    @OriginalMember(owner = "fe", name = "H", descriptor = "[F")
    private static float[] field1138;

    @OriginalMember(owner = "fe", name = "J", descriptor = "[F")
    private static float[] field1140;

    @OriginalMember(owner = "fe", name = "K", descriptor = "[F")
    private float[] field1141;

    @OriginalMember(owner = "fe", name = "s", descriptor = "[I")
    private static int[] field1123;

    @OriginalMember(owner = "fe", name = "y", descriptor = "[I")
    private static int[] field1129;

    @OriginalMember(owner = "fe", name = "G", descriptor = "[I")
    private static int[] field1137;

    @OriginalMember(owner = "fe", name = "o", descriptor = "[Loc;")
    private static class133[] field1119;

    @OriginalMember(owner = "fe", name = "u", descriptor = "[Lqc;")
    private static class151[] field1125;

    @OriginalMember(owner = "fe", name = "Q", descriptor = "[Lg;")
    private static class61[] field1147;

    @OriginalMember(owner = "fe", name = "t", descriptor = "[Lgd;")
    public static class64[] field1124;

    @OriginalMember(owner = "fe", name = "T", descriptor = "[Z")
    private static boolean[] field1150;

    @OriginalMember(owner = "fe", name = "D", descriptor = "[[B")
    private byte[][] field1134;

    @OriginalMember(owner = "fe", name = "a", descriptor = "(I)I")
    public static final int method363(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1145) {
            int var4 = 8 - field1145;
            int var5 = (0x1 << var4) - 1;
            var1 += (field1144[field1121] >> field1145 & var5) << var2;
            field1145 = 0;
            field1121++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field1144[field1121] >> field1145 & var3) << var2;
            field1145 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "fe", name = "a", descriptor = "()V")
    public static void method364() {
        field1144 = null;
        field1124 = null;
        field1147 = null;
        field1119 = null;
        field1125 = null;
        field1150 = null;
        field1123 = null;
        field1126 = null;
        field1140 = null;
        field1138 = null;
        field1132 = null;
        field1136 = null;
        field1135 = null;
        field1127 = null;
        field1129 = null;
        field1137 = null;
    }

    @OriginalMember(owner = "fe", name = "a", descriptor = "([BI)V")
    private static final void method365(byte[] arg0, int arg1) {
        field1144 = arg0;
        field1121 = arg1;
        field1145 = 0;
    }

    @OriginalMember(owner = "fe", name = "a", descriptor = "([I)Lk;")
    public final class94 method366(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1149 == null) {
            this.field1128 = 0;
            this.field1141 = new float[field1142];
            this.field1149 = new byte[this.field1133];
            this.field1148 = 0;
            this.field1151 = 0;
        }
        while (this.field1151 < this.field1134.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method370(this.field1151);
            if (var3 != null) {
                int var4 = this.field1148;
                int var5 = var3.length;
                if (var5 > this.field1133 - var4) {
                    var5 = this.field1133 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field1149[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field1148;
                }
                this.field1148 = var4;
            }
            this.field1151++;
        }
        this.field1141 = null;
        byte[] var2 = this.field1149;
        this.field1149 = null;
        return new class94(this.field1122, var2, this.field1139, this.field1146, this.field1120);
    }

    @OriginalMember(owner = "fe", name = "a", descriptor = "([B)V")
    private static final void method367(byte[] arg0) {
        method365(arg0, 0);
        field1143 = 0x1 << method363(4);
        field1142 = 0x1 << method363(4);
        field1126 = new float[field1142];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field1143 : field1142;
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
            int var25 = class59.method389(-5, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class44.method310(var26, (byte) -91, var25);
            }
            if (var1 == 0) {
                field1140 = var18;
                field1138 = var20;
                field1132 = var22;
                field1129 = var24;
            } else {
                field1136 = var18;
                field1135 = var20;
                field1127 = var22;
                field1137 = var24;
            }
        }
        int var2 = method363(8) + 1;
        field1124 = new class64[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1124[var3] = new class64();
        }
        int var4 = method363(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method363(16);
        }
        int var6 = method363(6) + 1;
        field1147 = new class61[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field1147[var7] = new class61();
        }
        int var8 = method363(6) + 1;
        field1119 = new class133[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field1119[var9] = new class133();
        }
        int var10 = method363(6) + 1;
        field1125 = new class151[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field1125[var11] = new class151();
        }
        int var12 = method363(6) + 1;
        field1150 = new boolean[var12];
        field1123 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field1150[var13] = method372() != 0;
            method363(16);
            method363(16);
            field1123[var13] = method363(8);
        }
    }

    @OriginalMember(owner = "fe", name = "a", descriptor = "(Lbg;)Z")
    private static final boolean method368(class18 arg0) {
        if (!field1118) {
            byte[] var1 = arg0.method147(0, 0, 0);
            if (var1 == null) {
                return false;
            }
            method367(var1);
            field1118 = true;
        }
        return true;
    }

    @OriginalMember(owner = "fe", name = "a", descriptor = "(Lbg;II)Lfe;")
    public static final class56 method369(class18 arg0, int arg1, int arg2) {
        if (method368(arg0)) {
            byte[] var3 = arg0.method147(0, arg2, arg1);
            return var3 == null ? null : new class56(var3);
        } else {
            arg0.method161(arg2, arg1, -120);
            return null;
        }
    }

    @OriginalMember(owner = "fe", name = "b", descriptor = "(I)[F")
    private final float[] method370(int arg0) {
        method365(this.field1134[arg0], 0);
        method372();
        int var2 = method363(class59.method389(-5, field1123.length - 1));
        boolean var3 = field1150[var2];
        int var4 = var3 ? field1142 : field1143;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method372() != 0;
            var6 = method372() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1143 >> 2);
            var9 = (field1143 >> 2) + (var4 >> 2);
            var10 = field1143 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1143 >> 2);
            var12 = (field1143 >> 2) + (var4 - (var4 >> 2));
            var13 = field1143 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class151 var14 = field1125[field1123[var2]];
        int var15 = var14.field2902;
        int var16 = var14.field2904[var15];
        boolean var17 = !field1147[var16].method398();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2903; var19++) {
            class133 var95 = field1119[var14.field2901[var19]];
            float[] var96 = field1126;
            var95.method947(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2902;
            int var21 = var14.field2904[var20];
            field1147[var21].method402(field1126, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field1126[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field1126;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field1136 : field1140;
            float[] var30 = var3 ? field1135 : field1138;
            float[] var31 = var3 ? field1127 : field1132;
            int[] var32 = var3 ? field1137 : field1129;
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
            int var35 = class59.method389(-5, var4 - 1);
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
                field1126[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field1126[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field1128 > 0) {
            int var49 = this.field1128 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field1130) {
                for (int var50 = 0; var50 < this.field1131; var50++) {
                    int var51 = (this.field1128 >> 1) + var50;
                    var48[var50] += this.field1141[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field1126[var52];
                }
            }
        }
        float[] var54 = this.field1141;
        this.field1141 = field1126;
        field1126 = var54;
        this.field1128 = var4;
        this.field1131 = var12 - (var4 >> 1);
        this.field1130 = var17;
        return var48;
    }

    @OriginalMember(owner = "fe", name = "c", descriptor = "(I)F")
    public static final float method371(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "fe", name = "b", descriptor = "()I")
    public static final int method372() {
        int var0 = field1144[field1121] >> field1145 & 0x1;
        field1145++;
        field1121 += field1145 >> 3;
        field1145 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "fe", name = "b", descriptor = "([B)V")
    private final void method373(byte[] arg0) {
        class86 var2 = new class86(arg0);
        this.field1122 = var2.method582(15);
        this.field1133 = var2.method582(15);
        this.field1139 = var2.method582(15);
        this.field1146 = var2.method582(15);
        if (this.field1146 < 0) {
            this.field1146 = ~this.field1146;
            this.field1120 = true;
        }
        int var3 = var2.method582(15);
        this.field1134 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method598((byte) 126);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method583(var7, 0, var5, 1174839336);
            this.field1134[var4] = var7;
        }
    }

    @OriginalMember(owner = "fe", name = "<init>", descriptor = "([B)V")
    private class56(byte[] arg0) {
        this.method373(arg0);
    }
}
