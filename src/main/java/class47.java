import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class47 extends class30 {

    @OriginalMember(owner = "client!lj", name = "Y", descriptor = "Z")
    private static boolean field1092 = false;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    private int field1064;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "I")
    private int field1068;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
    private static int field1069;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    private int field1071;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    private int field1072;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
    private int field1077;

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
    private static int field1079;

    @OriginalMember(owner = "client!lj", name = "S", descriptor = "I")
    private int field1086;

    @OriginalMember(owner = "client!lj", name = "U", descriptor = "I")
    private static int field1088;

    @OriginalMember(owner = "client!lj", name = "W", descriptor = "I")
    private int field1090;

    @OriginalMember(owner = "client!lj", name = "X", descriptor = "I")
    private int field1091;

    @OriginalMember(owner = "client!lj", name = "ab", descriptor = "I")
    private static int field1094;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "Z")
    private boolean field1074;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "Z")
    private boolean field1076;

    @OriginalMember(owner = "client!lj", name = "T", descriptor = "[B")
    private static byte[] field1087;

    @OriginalMember(owner = "client!lj", name = "Z", descriptor = "[B")
    private byte[] field1093;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "[F")
    private static float[] field1062;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "[F")
    private static float[] field1063;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "[F")
    private static float[] field1065;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "[F")
    private float[] field1073;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "[F")
    private static float[] field1075;

    @OriginalMember(owner = "client!lj", name = "R", descriptor = "[F")
    private static float[] field1085;

    @OriginalMember(owner = "client!lj", name = "V", descriptor = "[F")
    private static float[] field1089;

    @OriginalMember(owner = "client!lj", name = "bb", descriptor = "[F")
    private static float[] field1095;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "[I")
    private static int[] field1066;

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "[I")
    private static int[] field1081;

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "[I")
    private static int[] field1083;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "[Lkf;")
    private static class218[] field1067;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "[Lvg;")
    public static class235[] field1080;

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "[Ltf;")
    private static class60[] field1084;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "[Lbg;")
    private static class65[] field1070;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "[Z")
    private static boolean[] field1078;

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "[[B")
    private byte[][] field1082;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lmb;II)Llj;")
    public static final class47 method362(class178 arg0, int arg1, int arg2) {
        if (method363(arg0)) {
            byte[] var3 = arg0.method1197(arg2, arg1, -2);
            return var3 == null ? null : new class47(var3);
        } else {
            arg0.method1223(6, arg2, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lmb;)Z")
    private static final boolean method363(class178 arg0) {
        if (!field1092) {
            byte[] var1 = arg0.method1197(0, 0, -2);
            if (var1 == null) {
                return false;
            }
            method371(var1);
            field1092 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "()V")
    public static void method364() {
        field1087 = null;
        field1080 = null;
        field1084 = null;
        field1067 = null;
        field1070 = null;
        field1078 = null;
        field1066 = null;
        field1075 = null;
        field1085 = null;
        field1062 = null;
        field1063 = null;
        field1095 = null;
        field1089 = null;
        field1065 = null;
        field1083 = null;
        field1081 = null;
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)I")
    public static final int method365(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1088) {
            int var4 = 8 - field1088;
            int var5 = (0x1 << var4) - 1;
            var1 += (field1087[field1069] >> field1088 & var5) << var2;
            field1088 = 0;
            field1069++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field1087[field1069] >> field1088 & var3) << var2;
            field1088 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)F")
    public static final float method366(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([B)V")
    private final void method367(byte[] arg0) {
        class152 var2 = new class152(arg0);
        this.field1072 = var2.method1042(116);
        this.field1071 = var2.method1042(121);
        this.field1064 = var2.method1042(120);
        this.field1068 = var2.method1042(113);
        if (this.field1068 < 0) {
            this.field1068 = ~this.field1068;
            this.field1076 = true;
        }
        int var3 = var2.method1042(115);
        this.field1082 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1051((byte) 114);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1050(var7, 0, (byte) 121, var5);
            this.field1082[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "(I)[F")
    private final float[] method368(int arg0) {
        method372(this.field1082[arg0], 0);
        method369();
        int var2 = method365(class221.method1461(field1066.length - 1, -32184));
        boolean var3 = field1078[var2];
        int var4 = var3 ? field1079 : field1094;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method369() != 0;
            var6 = method369() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1094 >> 2);
            var9 = (field1094 >> 2) + (var4 >> 2);
            var10 = field1094 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1094 >> 2);
            var12 = (field1094 >> 2) + (var4 - (var4 >> 2));
            var13 = field1094 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class65 var14 = field1070[field1066[var2]];
        int var15 = var14.field1306;
        int var16 = var14.field1308[var15];
        boolean var17 = !field1084[var16].method448();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1309; var19++) {
            class218 var95 = field1067[var14.field1307[var19]];
            float[] var96 = field1075;
            var95.method1443(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1306;
            int var21 = var14.field1308[var20];
            field1084[var21].method450(field1075, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field1075[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field1075;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field1095 : field1085;
            float[] var30 = var3 ? field1089 : field1062;
            float[] var31 = var3 ? field1065 : field1063;
            int[] var32 = var3 ? field1081 : field1083;
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
            int var35 = class221.method1461(var4 - 1, -32184);
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
                field1075[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field1075[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field1077 > 0) {
            int var49 = this.field1077 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field1074) {
                for (int var50 = 0; var50 < this.field1086; var50++) {
                    int var51 = (this.field1077 >> 1) + var50;
                    var48[var50] += this.field1073[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field1075[var52];
                }
            }
        }
        float[] var54 = this.field1073;
        this.field1073 = field1075;
        field1075 = var54;
        this.field1077 = var4;
        this.field1086 = var12 - (var4 >> 1);
        this.field1074 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "()I")
    public static final int method369() {
        int var0 = field1087[field1069] >> field1088 & 0x1;
        field1088++;
        field1069 += field1088 >> 3;
        field1088 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([I)Loh;")
    public final class261 method370(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1093 == null) {
            this.field1077 = 0;
            this.field1073 = new float[field1079];
            this.field1093 = new byte[this.field1071];
            this.field1091 = 0;
            this.field1090 = 0;
        }
        while (this.field1090 < this.field1082.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method368(this.field1090);
            if (var3 != null) {
                int var4 = this.field1091;
                int var5 = var3.length;
                if (var5 > this.field1071 - var4) {
                    var5 = this.field1071 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field1093[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field1091;
                }
                this.field1091 = var4;
            }
            this.field1090++;
        }
        this.field1073 = null;
        byte[] var2 = this.field1093;
        this.field1093 = null;
        return new class261(this.field1072, var2, this.field1064, this.field1068, this.field1076);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "([B)V")
    private static final void method371(byte[] arg0) {
        method372(arg0, 0);
        field1094 = 0x1 << method365(4);
        field1079 = 0x1 << method365(4);
        field1075 = new float[field1079];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field1094 : field1079;
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
            int var25 = class221.method1461(var17 - 1, -32184);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class159.method1105(var26, -35, var25);
            }
            if (var1 == 0) {
                field1085 = var18;
                field1062 = var20;
                field1063 = var22;
                field1083 = var24;
            } else {
                field1095 = var18;
                field1089 = var20;
                field1065 = var22;
                field1081 = var24;
            }
        }
        int var2 = method365(8) + 1;
        field1080 = new class235[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1080[var3] = new class235();
        }
        int var4 = method365(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method365(16);
        }
        int var6 = method365(6) + 1;
        field1084 = new class60[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field1084[var7] = new class60();
        }
        int var8 = method365(6) + 1;
        field1067 = new class218[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field1067[var9] = new class218();
        }
        int var10 = method365(6) + 1;
        field1070 = new class65[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field1070[var11] = new class65();
        }
        int var12 = method365(6) + 1;
        field1078 = new boolean[var12];
        field1066 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field1078[var13] = method369() != 0;
            method365(16);
            method365(16);
            field1066[var13] = method365(8);
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "([B)V")
    private class47(byte[] arg0) {
        this.method367(arg0);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([BI)V")
    private static final void method372(byte[] arg0, int arg1) {
        field1087 = arg0;
        field1069 = arg1;
        field1088 = 0;
    }
}
