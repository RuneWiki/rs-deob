import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class433 extends class176 {

    @OriginalMember(owner = "client!mq", name = "N", descriptor = "Z")
    private static boolean field6174 = false;

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
    private static int field6147;

    @OriginalMember(owner = "client!mq", name = "n", descriptor = "I")
    private int field6148;

    @OriginalMember(owner = "client!mq", name = "s", descriptor = "I")
    private int field6153;

    @OriginalMember(owner = "client!mq", name = "A", descriptor = "I")
    private int field6161;

    @OriginalMember(owner = "client!mq", name = "G", descriptor = "I")
    private int field6167;

    @OriginalMember(owner = "client!mq", name = "I", descriptor = "I")
    private static int field6169;

    @OriginalMember(owner = "client!mq", name = "J", descriptor = "I")
    private static int field6170;

    @OriginalMember(owner = "client!mq", name = "K", descriptor = "I")
    private int field6171;

    @OriginalMember(owner = "client!mq", name = "L", descriptor = "I")
    private int field6172;

    @OriginalMember(owner = "client!mq", name = "O", descriptor = "I")
    private static int field6175;

    @OriginalMember(owner = "client!mq", name = "R", descriptor = "I")
    private int field6178;

    @OriginalMember(owner = "client!mq", name = "T", descriptor = "I")
    private int field6180;

    @OriginalMember(owner = "client!mq", name = "u", descriptor = "Z")
    private boolean field6155;

    @OriginalMember(owner = "client!mq", name = "x", descriptor = "Z")
    private boolean field6158;

    @OriginalMember(owner = "client!mq", name = "p", descriptor = "[B")
    private static byte[] field6150;

    @OriginalMember(owner = "client!mq", name = "S", descriptor = "[B")
    private byte[] field6179;

    @OriginalMember(owner = "client!mq", name = "q", descriptor = "[F")
    private static float[] field6151;

    @OriginalMember(owner = "client!mq", name = "r", descriptor = "[F")
    private static float[] field6152;

    @OriginalMember(owner = "client!mq", name = "t", descriptor = "[F")
    private static float[] field6154;

    @OriginalMember(owner = "client!mq", name = "v", descriptor = "[F")
    private static float[] field6156;

    @OriginalMember(owner = "client!mq", name = "w", descriptor = "[F")
    private float[] field6157;

    @OriginalMember(owner = "client!mq", name = "F", descriptor = "[F")
    private static float[] field6166;

    @OriginalMember(owner = "client!mq", name = "H", descriptor = "[F")
    private static float[] field6168;

    @OriginalMember(owner = "client!mq", name = "Q", descriptor = "[F")
    private static float[] field6177;

    @OriginalMember(owner = "client!mq", name = "o", descriptor = "[I")
    private static int[] field6149;

    @OriginalMember(owner = "client!mq", name = "D", descriptor = "[I")
    private static int[] field6164;

    @OriginalMember(owner = "client!mq", name = "E", descriptor = "[I")
    private static int[] field6165;

    @OriginalMember(owner = "client!mq", name = "B", descriptor = "[Ltw;")
    private static class172[] field6162;

    @OriginalMember(owner = "client!mq", name = "z", descriptor = "[Lcd;")
    private static class262[] field6160;

    @OriginalMember(owner = "client!mq", name = "M", descriptor = "[Lug;")
    public static class482[] field6173;

    @OriginalMember(owner = "client!mq", name = "P", descriptor = "[Lsn;")
    private static class540[] field6176;

    @OriginalMember(owner = "client!mq", name = "C", descriptor = "[Z")
    private static boolean[] field6163;

    @OriginalMember(owner = "client!mq", name = "y", descriptor = "[[B")
    private byte[][] field6159;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "([BI)V")
    private static final void method2566(byte[] arg0, int arg1) {
        field6150 = arg0;
        field6147 = arg1;
        field6169 = 0;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lan;II)Lmq;")
    public static final class433 method2567(class21 arg0, int arg1, int arg2) {
        if (method2569(arg0)) {
            byte[] var3 = arg0.method240(arg1, arg2, (byte) -124);
            return var3 == null ? null : new class433(var3);
        } else {
            arg0.method229(arg1, -1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "([B)V")
    private final void method2568(byte[] arg0) {
        class11 var2 = new class11(arg0);
        this.field6161 = var2.method119(-64);
        this.field6171 = var2.method119(-84);
        this.field6172 = var2.method119(-112);
        this.field6153 = var2.method119(-24);
        if (this.field6153 < 0) {
            this.field6153 = ~this.field6153;
            this.field6155 = true;
        }
        int var3 = var2.method119(-40);
        this.field6159 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method110((byte) 111);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method75(0, var5, (byte) 111, var7);
            this.field6159[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lan;)Z")
    private static final boolean method2569(class21 arg0) {
        if (!field6174) {
            byte[] var1 = arg0.method240(0, 0, (byte) -124);
            if (var1 == null) {
                return false;
            }
            method2574(var1);
            field6174 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)F")
    public static final float method2570(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "()V")
    public static void method2571() {
        field6150 = null;
        field6173 = null;
        field6160 = null;
        field6162 = null;
        field6176 = null;
        field6163 = null;
        field6149 = null;
        field6154 = null;
        field6151 = null;
        field6152 = null;
        field6177 = null;
        field6168 = null;
        field6156 = null;
        field6166 = null;
        field6164 = null;
        field6165 = null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lan;I)Lmq;")
    public static final class433 method2572(class21 arg0, int arg1) {
        if (method2569(arg0)) {
            byte[] var2 = arg0.method242(arg1, (byte) -119);
            return var2 == null ? null : new class433(var2);
        } else {
            arg0.method221(arg1, (byte) -63);
            return null;
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)I")
    public static final int method2573(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field6169) {
            int var4 = 8 - field6169;
            int var5 = (0x1 << var4) - 1;
            var1 += (field6150[field6147] >> field6169 & var5) << var2;
            field6169 = 0;
            field6147++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field6150[field6147] >> field6169 & var3) << var2;
            field6169 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "([B)V")
    private static final void method2574(byte[] arg0) {
        method2566(arg0, 0);
        field6175 = 0x1 << method2573(4);
        field6170 = 0x1 << method2573(4);
        field6154 = new float[field6170];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field6175 : field6170;
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
            int var25 = class98.method703(var17 - 1, 0);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class175.method1113(var25, var26, false);
            }
            if (var1 == 0) {
                field6151 = var18;
                field6152 = var20;
                field6177 = var22;
                field6164 = var24;
            } else {
                field6168 = var18;
                field6156 = var20;
                field6166 = var22;
                field6165 = var24;
            }
        }
        int var2 = method2573(8) + 1;
        field6173 = new class482[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field6173[var3] = new class482();
        }
        int var4 = method2573(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method2573(16);
        }
        int var6 = method2573(6) + 1;
        field6160 = new class262[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field6160[var7] = new class262();
        }
        int var8 = method2573(6) + 1;
        field6162 = new class172[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field6162[var9] = new class172();
        }
        int var10 = method2573(6) + 1;
        field6176 = new class540[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field6176[var11] = new class540();
        }
        int var12 = method2573(6) + 1;
        field6163 = new boolean[var12];
        field6149 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field6163[var13] = method2577() != 0;
            method2573(16);
            method2573(16);
            field6149[var13] = method2573(8);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "([I)Lke;")
    public final class514 method2575(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field6179 == null) {
            this.field6148 = 0;
            this.field6157 = new float[field6170];
            this.field6179 = new byte[this.field6171];
            this.field6178 = 0;
            this.field6180 = 0;
        }
        while (this.field6180 < this.field6159.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method2576(this.field6180);
            if (var3 != null) {
                int var4 = this.field6178;
                int var5 = var3.length;
                if (var5 > this.field6171 - var4) {
                    var5 = this.field6171 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field6179[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field6178;
                }
                this.field6178 = var4;
            }
            this.field6180++;
        }
        this.field6157 = null;
        byte[] var2 = this.field6179;
        this.field6179 = null;
        return new class514(this.field6161, var2, this.field6172, this.field6153, this.field6155);
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(I)[F")
    private final float[] method2576(int arg0) {
        method2566(this.field6159[arg0], 0);
        method2577();
        int var2 = method2573(class98.method703(field6149.length - 1, 0));
        boolean var3 = field6163[var2];
        int var4 = var3 ? field6170 : field6175;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2577() != 0;
            var6 = method2577() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field6175 >> 2);
            var9 = (field6175 >> 2) + (var4 >> 2);
            var10 = field6175 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field6175 >> 2);
            var12 = (field6175 >> 2) + (var4 - (var4 >> 2));
            var13 = field6175 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class540 var14 = field6176[field6149[var2]];
        int var15 = var14.field7530;
        int var16 = var14.field7527[var15];
        boolean var17 = !field6160[var16].method1711();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field7529; var19++) {
            class172 var95 = field6162[var14.field7528[var19]];
            float[] var96 = field6154;
            var95.method1090(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field7530;
            int var21 = var14.field7527[var20];
            field6160[var21].method1709(field6154, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field6154[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field6154;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field6168 : field6151;
            float[] var30 = var3 ? field6156 : field6152;
            float[] var31 = var3 ? field6166 : field6177;
            int[] var32 = var3 ? field6165 : field6164;
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
            int var35 = class98.method703(var4 - 1, 0);
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
                field6154[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field6154[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field6148 > 0) {
            int var49 = this.field6148 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field6158) {
                for (int var50 = 0; var50 < this.field6167; var50++) {
                    int var51 = (this.field6148 >> 1) + var50;
                    var48[var50] += this.field6157[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field6154[var52];
                }
            }
        }
        float[] var54 = this.field6157;
        this.field6157 = field6154;
        field6154 = var54;
        this.field6148 = var4;
        this.field6167 = var12 - (var4 >> 1);
        this.field6158 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "([B)V")
    private class433(byte[] arg0) {
        this.method2568(arg0);
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "()I")
    public static final int method2577() {
        int var0 = field6150[field6147] >> field6169 & 0x1;
        field6169++;
        field6147 += field6169 >> 3;
        field6169 &= 0x7;
        return var0;
    }
}
