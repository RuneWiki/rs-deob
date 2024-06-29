import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class83 extends class223 {

    @OriginalMember(owner = "client!di", name = "n", descriptor = "Z")
    private static boolean field1119 = false;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "I")
    private static int field1122;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "I")
    private int field1124;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "I")
    private static int field1127;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "I")
    private static int field1128;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "I")
    private int field1130;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "I")
    private int field1131;

    @OriginalMember(owner = "client!di", name = "I", descriptor = "I")
    private int field1140;

    @OriginalMember(owner = "client!di", name = "K", descriptor = "I")
    private int field1142;

    @OriginalMember(owner = "client!di", name = "L", descriptor = "I")
    private static int field1143;

    @OriginalMember(owner = "client!di", name = "N", descriptor = "I")
    private int field1145;

    @OriginalMember(owner = "client!di", name = "Q", descriptor = "I")
    private int field1148;

    @OriginalMember(owner = "client!di", name = "R", descriptor = "I")
    private int field1149;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "Z")
    private boolean field1123;

    @OriginalMember(owner = "client!di", name = "O", descriptor = "Z")
    private boolean field1146;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "[B")
    private static byte[] field1125;

    @OriginalMember(owner = "client!di", name = "P", descriptor = "[B")
    private byte[] field1147;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "[F")
    private float[] field1120;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "[F")
    private static float[] field1121;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "[F")
    private static float[] field1129;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "[F")
    private static float[] field1132;

    @OriginalMember(owner = "client!di", name = "C", descriptor = "[F")
    private static float[] field1134;

    @OriginalMember(owner = "client!di", name = "D", descriptor = "[F")
    private static float[] field1135;

    @OriginalMember(owner = "client!di", name = "H", descriptor = "[F")
    private static float[] field1139;

    @OriginalMember(owner = "client!di", name = "J", descriptor = "[F")
    private static float[] field1141;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "[I")
    private static int[] field1126;

    @OriginalMember(owner = "client!di", name = "E", descriptor = "[I")
    private static int[] field1136;

    @OriginalMember(owner = "client!di", name = "F", descriptor = "[I")
    private static int[] field1137;

    @OriginalMember(owner = "client!di", name = "M", descriptor = "[Lvc;")
    private static class207[] field1144;

    @OriginalMember(owner = "client!di", name = "G", descriptor = "[Lfu;")
    private static class266[] field1138;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "[Lli;")
    public static class295[] field1117;

    @OriginalMember(owner = "client!di", name = "S", descriptor = "[Lqs;")
    private static class426[] field1150;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "[Z")
    private static boolean[] field1133;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "[[B")
    private byte[][] field1118;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)I", line = 8)
    public static final int method741(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1127) {
            int var4 = 8 - field1127;
            int var5 = (0x1 << var4) - 1;
            var1 += (field1125[field1128] >> field1127 & var5) << var2;
            field1127 = 0;
            field1128++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field1125[field1128] >> field1127 & var3) << var2;
            field1127 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([BI)V", line = 39)
    private static final void method742(byte[] arg0, int arg1) {
        field1125 = arg0;
        field1128 = arg1;
        field1127 = 0;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lfs;I)Ldi;", line = 45)
    public static final class83 method743(class387 arg0, int arg1) {
        if (method747(arg0)) {
            byte[] var2 = arg0.method2381(arg1, -1);
            return var2 == null ? null : new class83(var2);
        } else {
            arg0.method2384(-1, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "()I", line = 63)
    public static final int method744() {
        int var0 = field1125[field1128] >> field1127 & 0x1;
        field1127++;
        field1128 += field1127 >> 3;
        field1127 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lfs;II)Ldi;", line = 78)
    public static final class83 method745(class387 arg0, int arg1, int arg2) {
        if (method747(arg0)) {
            byte[] var3 = arg0.method2363(arg2, arg1, 118);
            return var3 == null ? null : new class83(var3);
        } else {
            arg0.method2357(arg2, (byte) -124, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([B)V", line = 95)
    private static final void method746(byte[] arg0) {
        method742(arg0, 0);
        field1143 = 0x1 << method741(4);
        field1122 = 0x1 << method741(4);
        field1132 = new float[field1122];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field1143 : field1122;
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
            int var25 = class515.method3055(var17 - 1, (byte) -14);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class476.method2875(var26, 2, var25);
            }
            if (var1 == 0) {
                field1134 = var18;
                field1135 = var20;
                field1121 = var22;
                field1126 = var24;
            } else {
                field1139 = var18;
                field1129 = var20;
                field1141 = var22;
                field1136 = var24;
            }
        }
        int var2 = method741(8) + 1;
        field1117 = new class295[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1117[var3] = new class295();
        }
        int var4 = method741(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method741(16);
        }
        int var6 = method741(6) + 1;
        field1144 = new class207[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field1144[var7] = new class207();
        }
        int var8 = method741(6) + 1;
        field1150 = new class426[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field1150[var9] = new class426();
        }
        int var10 = method741(6) + 1;
        field1138 = new class266[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field1138[var11] = new class266();
        }
        int var12 = method741(6) + 1;
        field1133 = new boolean[var12];
        field1137 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field1133[var13] = method744() != 0;
            method741(16);
            method741(16);
            field1137[var13] = method741(8);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lfs;)Z", line = 249)
    private static final boolean method747(class387 arg0) {
        if (!field1119) {
            byte[] var1 = arg0.method2363(0, 0, 94);
            if (var1 == null) {
                return false;
            }
            method746(var1);
            field1119 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "([B)V", line = 265)
    private final void method748(byte[] arg0) {
        class65 var2 = new class65(arg0);
        this.field1145 = var2.method616((byte) 106);
        this.field1142 = var2.method616((byte) 95);
        this.field1130 = var2.method616((byte) 73);
        this.field1131 = var2.method616((byte) 105);
        if (this.field1131 < 0) {
            this.field1131 = ~this.field1131;
            this.field1146 = true;
        }
        int var3 = var2.method616((byte) 115);
        this.field1118 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method577(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method595((byte) 22, var5, 0, var7);
            this.field1118[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([I)Ljs;", line = 309)
    public final class217 method749(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1147 == null) {
            this.field1140 = 0;
            this.field1120 = new float[field1122];
            this.field1147 = new byte[this.field1142];
            this.field1149 = 0;
            this.field1148 = 0;
        }
        while (this.field1148 < this.field1118.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method752(this.field1148);
            if (var3 != null) {
                int var4 = this.field1149;
                int var5 = var3.length;
                if (var5 > this.field1142 - var4) {
                    var5 = this.field1142 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field1147[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field1149;
                }
                this.field1149 = var4;
            }
            this.field1148++;
        }
        this.field1120 = null;
        byte[] var2 = this.field1147;
        this.field1147 = null;
        return new class217(this.field1145, var2, this.field1130, this.field1131, this.field1146);
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)F", line = 371)
    public static final float method750(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "()V", line = 382)
    public static void method751() {
        field1125 = null;
        field1117 = null;
        field1144 = null;
        field1150 = null;
        field1138 = null;
        field1133 = null;
        field1137 = null;
        field1132 = null;
        field1134 = null;
        field1135 = null;
        field1121 = null;
        field1139 = null;
        field1129 = null;
        field1141 = null;
        field1126 = null;
        field1136 = null;
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(I)[F", line = 400)
    private final float[] method752(int arg0) {
        method742(this.field1118[arg0], 0);
        method744();
        int var2 = method741(class515.method3055(field1137.length - 1, (byte) -14));
        boolean var3 = field1133[var2];
        int var4 = var3 ? field1122 : field1143;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method744() != 0;
            var6 = method744() != 0;
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
        class266 var14 = field1138[field1137[var2]];
        int var15 = var14.field3916;
        int var16 = var14.field3915[var15];
        boolean var17 = !field1144[var16].method1442();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3918; var19++) {
            class426 var95 = field1150[var14.field3917[var19]];
            float[] var96 = field1132;
            var95.method2602(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field3916;
            int var21 = var14.field3915[var20];
            field1144[var21].method1437(field1132, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field1132[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field1132;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field1139 : field1134;
            float[] var30 = var3 ? field1129 : field1135;
            float[] var31 = var3 ? field1141 : field1121;
            int[] var32 = var3 ? field1136 : field1126;
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
            int var35 = class515.method3055(var4 - 1, (byte) -14);
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
                field1132[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field1132[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field1140 > 0) {
            int var49 = this.field1140 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field1123) {
                for (int var50 = 0; var50 < this.field1124; var50++) {
                    int var51 = (this.field1140 >> 1) + var50;
                    var48[var50] += this.field1120[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field1132[var52];
                }
            }
        }
        float[] var54 = this.field1120;
        this.field1120 = field1132;
        field1132 = var54;
        this.field1140 = var4;
        this.field1124 = var12 - (var4 >> 1);
        this.field1123 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "([B)V", line = 812)
    private class83(byte[] arg0) {
        this.method748(arg0);
    }
}
