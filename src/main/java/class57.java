import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class57 extends class35 {

    @OriginalMember(owner = "client!jn", name = "A", descriptor = "Z")
    private static boolean field1127 = false;

    @OriginalMember(owner = "client!jn", name = "s", descriptor = "I")
    private int field1119;

    @OriginalMember(owner = "client!jn", name = "u", descriptor = "I")
    private int field1121;

    @OriginalMember(owner = "client!jn", name = "x", descriptor = "I")
    private int field1124;

    @OriginalMember(owner = "client!jn", name = "z", descriptor = "I")
    private int field1126;

    @OriginalMember(owner = "client!jn", name = "B", descriptor = "I")
    private static int field1128;

    @OriginalMember(owner = "client!jn", name = "E", descriptor = "I")
    private int field1131;

    @OriginalMember(owner = "client!jn", name = "H", descriptor = "I")
    private static int field1134;

    @OriginalMember(owner = "client!jn", name = "L", descriptor = "I")
    private static int field1138;

    @OriginalMember(owner = "client!jn", name = "N", descriptor = "I")
    private int field1140;

    @OriginalMember(owner = "client!jn", name = "S", descriptor = "I")
    private static int field1144;

    @OriginalMember(owner = "client!jn", name = "U", descriptor = "I")
    private int field1146;

    @OriginalMember(owner = "client!jn", name = "W", descriptor = "I")
    private int field1148;

    @OriginalMember(owner = "client!jn", name = "q", descriptor = "Z")
    private boolean field1117;

    @OriginalMember(owner = "client!jn", name = "K", descriptor = "Z")
    private boolean field1137;

    @OriginalMember(owner = "client!jn", name = "T", descriptor = "[B")
    private static byte[] field1145;

    @OriginalMember(owner = "client!jn", name = "V", descriptor = "[B")
    private byte[] field1147;

    @OriginalMember(owner = "client!jn", name = "t", descriptor = "[F")
    private static float[] field1120;

    @OriginalMember(owner = "client!jn", name = "v", descriptor = "[F")
    private static float[] field1122;

    @OriginalMember(owner = "client!jn", name = "y", descriptor = "[F")
    private static float[] field1125;

    @OriginalMember(owner = "client!jn", name = "C", descriptor = "[F")
    private static float[] field1129;

    @OriginalMember(owner = "client!jn", name = "D", descriptor = "[F")
    private float[] field1130;

    @OriginalMember(owner = "client!jn", name = "G", descriptor = "[F")
    private static float[] field1133;

    @OriginalMember(owner = "client!jn", name = "P", descriptor = "[F")
    private static float[] field1141;

    @OriginalMember(owner = "client!jn", name = "Q", descriptor = "[F")
    private static float[] field1142;

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "[I")
    private static int[] field1115;

    @OriginalMember(owner = "client!jn", name = "I", descriptor = "[I")
    private static int[] field1135;

    @OriginalMember(owner = "client!jn", name = "J", descriptor = "[I")
    private static int[] field1136;

    @OriginalMember(owner = "client!jn", name = "F", descriptor = "[Lti;")
    private static class238[] field1132;

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "[Lqd;")
    private static class251[] field1116;

    @OriginalMember(owner = "client!jn", name = "M", descriptor = "[Lcn;")
    public static class265[] field1139;

    @OriginalMember(owner = "client!jn", name = "r", descriptor = "[Lli;")
    private static class91[] field1118;

    @OriginalMember(owner = "client!jn", name = "R", descriptor = "[Z")
    private static boolean[] field1143;

    @OriginalMember(owner = "client!jn", name = "w", descriptor = "[[B")
    private byte[][] field1123;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lbm;II)Ljn;", line = 16)
    public static final class57 method438(class307 arg0, int arg1, int arg2) {
        if (method444(arg0)) {
            byte[] var3 = arg0.method2036(arg1, arg2, (byte) 79);
            return var3 == null ? null : new class57(var3);
        } else {
            arg0.method2044((byte) 21, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)F", line = 37)
    public static final float method439(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "([B)V", line = 49)
    private static final void method440(byte[] arg0) {
        method447(arg0, 0);
        field1138 = 0x1 << method441(4);
        field1134 = 0x1 << method441(4);
        field1125 = new float[field1134];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field1138 : field1134;
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
            int var13 = class223.method1482(var5 - 1, (byte) 92);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class212.method1436(var13, 1, var14);
            }
            if (var1 == 0) {
                field1133 = var6;
                field1120 = var8;
                field1129 = var10;
                field1115 = var12;
            } else {
                field1122 = var6;
                field1142 = var8;
                field1141 = var10;
                field1136 = var12;
            }
        }
        int var15 = method441(8) + 1;
        field1139 = new class265[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field1139[var16] = new class265();
        }
        int var17 = method441(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method441(16);
        }
        int var19 = method441(6) + 1;
        field1132 = new class238[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field1132[var20] = new class238();
        }
        int var21 = method441(6) + 1;
        field1116 = new class251[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field1116[var22] = new class251();
        }
        int var23 = method441(6) + 1;
        field1118 = new class91[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field1118[var24] = new class91();
        }
        int var25 = method441(6) + 1;
        field1143 = new boolean[var25];
        field1135 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field1143[var26] = method443() != 0;
            method441(16);
            method441(16);
            field1135[var26] = method441(8);
        }
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)I", line = 201)
    public static final int method441(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1128) {
            int var3 = 8 - field1128;
            int var4 = (0x1 << var3) - 1;
            var1 += (field1145[field1144] >> field1128 & var4) << var2;
            field1128 = 0;
            field1144++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field1145[field1144] >> field1128 & var5) << var2;
            field1128 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "([I)Llj;", line = 229)
    public final class5 method442(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1147 == null) {
            this.field1140 = 0;
            this.field1130 = new float[field1134];
            this.field1147 = new byte[this.field1131];
            this.field1148 = 0;
            this.field1146 = 0;
        }
        while (this.field1146 < this.field1123.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method448(this.field1146);
            if (var2 != null) {
                int var3 = this.field1148;
                int var4 = var2.length;
                if (var4 > this.field1131 - var3) {
                    var4 = this.field1131 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field1147[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field1148;
                }
                this.field1148 = var3;
            }
            this.field1146++;
        }
        this.field1130 = null;
        byte[] var7 = this.field1147;
        this.field1147 = null;
        return new class5(this.field1124, var7, this.field1121, this.field1126, this.field1137);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "()I", line = 290)
    public static final int method443() {
        int var0 = field1145[field1144] >> field1128 & 0x1;
        field1128++;
        field1144 += field1128 >> 3;
        field1128 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lbm;)Z", line = 302)
    private static final boolean method444(class307 arg0) {
        if (!field1127) {
            byte[] var1 = arg0.method2036(0, 0, (byte) 64);
            if (var1 == null) {
                return false;
            }
            method440(var1);
            field1127 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "()V", line = 317)
    public static void method445() {
        field1145 = null;
        field1139 = null;
        field1132 = null;
        field1116 = null;
        field1118 = null;
        field1143 = null;
        field1135 = null;
        field1125 = null;
        field1133 = null;
        field1120 = null;
        field1129 = null;
        field1122 = null;
        field1142 = null;
        field1141 = null;
        field1115 = null;
        field1136 = null;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "([B)V", line = 336)
    private final void method446(byte[] arg0) {
        class202 var2 = new class202(arg0);
        this.field1124 = var2.method1346(59);
        this.field1131 = var2.method1346(78);
        this.field1121 = var2.method1346(-128);
        this.field1126 = var2.method1346(107);
        if (this.field1126 < 0) {
            this.field1126 = ~this.field1126;
            this.field1137 = true;
        }
        int var3 = var2.method1346(-123);
        this.field1123 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1317((byte) -112);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1321(0, -9281, var5, var7);
            this.field1123[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "([BI)V", line = 384)
    private static final void method447(byte[] arg0, int arg1) {
        field1145 = arg0;
        field1144 = arg1;
        field1128 = 0;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "([B)V", line = 389)
    private class57(byte[] arg0) {
        this.method446(arg0);
    }

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "(I)[F", line = 395)
    private final float[] method448(int arg0) {
        method447(this.field1123[arg0], 0);
        method443();
        int var2 = method441(class223.method1482(field1135.length - 1, (byte) 94));
        boolean var3 = field1143[var2];
        int var4 = var3 ? field1134 : field1138;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method443() != 0;
            var6 = method443() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1138 >> 2);
            var9 = (field1138 >> 2) + (var4 >> 2);
            var10 = field1138 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1138 >> 2);
            var12 = (field1138 >> 2) + (var4 - (var4 >> 2));
            var13 = field1138 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class91 var14 = field1118[field1135[var2]];
        int var15 = var14.field1671;
        int var16 = var14.field1672[var15];
        boolean var17 = !field1132[var16].method1581();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1670; var19++) {
            class251 var20 = field1116[var14.field1673[var19]];
            float[] var21 = field1125;
            var20.method1693(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field1671;
            int var23 = var14.field1672[var22];
            field1132[var23].method1582(field1125, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field1125[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field1125;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field1122 : field1133;
            float[] var32 = var3 ? field1142 : field1120;
            float[] var33 = var3 ? field1141 : field1129;
            int[] var34 = var3 ? field1136 : field1115;
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
            int var47 = class223.method1482(var4 - 1, (byte) 100);
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
                field1125[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field1125[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field1140 > 0) {
            int var91 = this.field1140 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field1117) {
                for (int var92 = 0; var92 < this.field1119; var92++) {
                    int var93 = (this.field1140 >> 1) + var92;
                    var90[var92] += this.field1130[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field1125[var94];
                }
            }
        }
        float[] var96 = this.field1130;
        this.field1130 = field1125;
        field1125 = var96;
        this.field1140 = var4;
        this.field1119 = var12 - (var4 >> 1);
        this.field1117 = var17;
        return var90;
    }
}
