import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class253 extends class333 {

    @OriginalMember(owner = "client!wda", name = "E", descriptor = "Z")
    private static boolean field3167 = false;

    @OriginalMember(owner = "client!wda", name = "l", descriptor = "I")
    private int field3148;

    @OriginalMember(owner = "client!wda", name = "m", descriptor = "I")
    private static int field3149;

    @OriginalMember(owner = "client!wda", name = "n", descriptor = "I")
    private int field3150;

    @OriginalMember(owner = "client!wda", name = "o", descriptor = "I")
    private static int field3151;

    @OriginalMember(owner = "client!wda", name = "q", descriptor = "I")
    private int field3153;

    @OriginalMember(owner = "client!wda", name = "A", descriptor = "I")
    private static int field3163;

    @OriginalMember(owner = "client!wda", name = "G", descriptor = "I")
    private int field3169;

    @OriginalMember(owner = "client!wda", name = "I", descriptor = "I")
    private int field3171;

    @OriginalMember(owner = "client!wda", name = "M", descriptor = "I")
    private int field3175;

    @OriginalMember(owner = "client!wda", name = "N", descriptor = "I")
    private static int field3176;

    @OriginalMember(owner = "client!wda", name = "P", descriptor = "I")
    private int field3178;

    @OriginalMember(owner = "client!wda", name = "Q", descriptor = "I")
    private int field3179;

    @OriginalMember(owner = "client!wda", name = "k", descriptor = "Z")
    private boolean field3147;

    @OriginalMember(owner = "client!wda", name = "C", descriptor = "Z")
    private boolean field3165;

    @OriginalMember(owner = "client!wda", name = "w", descriptor = "[B")
    private static byte[] field3159;

    @OriginalMember(owner = "client!wda", name = "O", descriptor = "[B")
    private byte[] field3177;

    @OriginalMember(owner = "client!wda", name = "p", descriptor = "[F")
    private static float[] field3152;

    @OriginalMember(owner = "client!wda", name = "r", descriptor = "[F")
    private static float[] field3154;

    @OriginalMember(owner = "client!wda", name = "t", descriptor = "[F")
    private static float[] field3156;

    @OriginalMember(owner = "client!wda", name = "v", descriptor = "[F")
    private static float[] field3158;

    @OriginalMember(owner = "client!wda", name = "y", descriptor = "[F")
    private static float[] field3161;

    @OriginalMember(owner = "client!wda", name = "z", descriptor = "[F")
    private static float[] field3162;

    @OriginalMember(owner = "client!wda", name = "B", descriptor = "[F")
    private static float[] field3164;

    @OriginalMember(owner = "client!wda", name = "H", descriptor = "[F")
    private float[] field3170;

    @OriginalMember(owner = "client!wda", name = "F", descriptor = "[I")
    private static int[] field3168;

    @OriginalMember(owner = "client!wda", name = "J", descriptor = "[I")
    private static int[] field3172;

    @OriginalMember(owner = "client!wda", name = "L", descriptor = "[I")
    private static int[] field3174;

    @OriginalMember(owner = "client!wda", name = "s", descriptor = "[Lsv;")
    private static class429[] field3155;

    @OriginalMember(owner = "client!wda", name = "K", descriptor = "[Ldca;")
    private static class544[] field3173;

    @OriginalMember(owner = "client!wda", name = "R", descriptor = "[Lts;")
    public static class54[] field3180;

    @OriginalMember(owner = "client!wda", name = "D", descriptor = "[Luba;")
    private static class685[] field3166;

    @OriginalMember(owner = "client!wda", name = "u", descriptor = "[Z")
    private static boolean[] field3157;

    @OriginalMember(owner = "client!wda", name = "x", descriptor = "[[B")
    private byte[][] field3160;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Ltf;II)Lwda;")
    public static final class253 method1483(class701 arg0, int arg1, int arg2) {
        if (method1484(arg0)) {
            byte[] var3 = arg0.method3854((byte) 107, arg1, arg2);
            return var3 == null ? null : new class253(var3);
        } else {
            arg0.method3860(arg2, (byte) -99, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Ltf;)Z")
    private static final boolean method1484(class701 arg0) {
        if (!field3167) {
            byte[] var1 = arg0.method3854((byte) 74, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1489(var1);
            field3167 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "([I)Lug;")
    public final class450 method1485(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3177 == null) {
            this.field3169 = 0;
            this.field3170 = new float[field3149];
            this.field3177 = new byte[this.field3150];
            this.field3179 = 0;
            this.field3178 = 0;
        }
        while (this.field3178 < this.field3160.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1487(this.field3178);
            if (var3 != null) {
                int var4 = this.field3179;
                int var5 = var3.length;
                if (var5 > this.field3150 - var4) {
                    var5 = this.field3150 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field3177[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field3179;
                }
                this.field3179 = var4;
            }
            this.field3178++;
        }
        this.field3170 = null;
        byte[] var2 = this.field3177;
        this.field3177 = null;
        return new class450(this.field3175, var2, this.field3171, this.field3153, this.field3147);
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Ltf;I)Lwda;")
    public static final class253 method1486(class701 arg0, int arg1) {
        if (method1484(arg0)) {
            byte[] var2 = arg0.method3859((byte) 121, arg1);
            return var2 == null ? null : new class253(var2);
        } else {
            arg0.method3849(arg1, false);
            return null;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)[F")
    private final float[] method1487(int arg0) {
        method1492(this.field3160[arg0], 0);
        method1488();
        int var2 = method1490(class258.method1532(field3174.length - 1, false));
        boolean var3 = field3157[var2];
        int var4 = var3 ? field3149 : field3163;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1488() != 0;
            var6 = method1488() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3163 >> 2);
            var9 = (field3163 >> 2) + (var4 >> 2);
            var10 = field3163 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3163 >> 2);
            var12 = (field3163 >> 2) + (var4 - (var4 >> 2));
            var13 = field3163 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class544 var14 = field3173[field3174[var2]];
        int var15 = var14.field7681;
        int var16 = var14.field7682[var15];
        boolean var17 = !field3166[var16].method3798();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field7684; var19++) {
            class429 var95 = field3155[var14.field7683[var19]];
            float[] var96 = field3164;
            var95.method2474(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field7681;
            int var21 = var14.field7682[var20];
            field3166[var21].method3797(field3164, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field3164[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field3164;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3156 : field3154;
            float[] var30 = var3 ? field3158 : field3162;
            float[] var31 = var3 ? field3152 : field3161;
            int[] var32 = var3 ? field3168 : field3172;
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
            int var35 = class258.method1532(var4 - 1, false);
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
                field3164[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3164[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field3169 > 0) {
            int var49 = this.field3169 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field3165) {
                for (int var50 = 0; var50 < this.field3148; var50++) {
                    int var51 = (this.field3169 >> 1) + var50;
                    var48[var50] += this.field3170[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3164[var52];
                }
            }
        }
        float[] var54 = this.field3170;
        this.field3170 = field3164;
        field3164 = var54;
        this.field3169 = var4;
        this.field3148 = var12 - (var4 >> 1);
        this.field3165 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "()I")
    public static final int method1488() {
        int var0 = field3159[field3151] >> field3176 & 0x1;
        field3176++;
        field3151 += field3176 >> 3;
        field3176 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "([B)V")
    private static final void method1489(byte[] arg0) {
        method1492(arg0, 0);
        field3163 = 0x1 << method1490(4);
        field3149 = 0x1 << method1490(4);
        field3164 = new float[field3149];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3163 : field3149;
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
            int var25 = class258.method1532(var17 - 1, false);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class443.method2569(var25, var26, 255);
            }
            if (var1 == 0) {
                field3154 = var18;
                field3162 = var20;
                field3161 = var22;
                field3172 = var24;
            } else {
                field3156 = var18;
                field3158 = var20;
                field3152 = var22;
                field3168 = var24;
            }
        }
        int var2 = method1490(8) + 1;
        field3180 = new class54[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3180[var3] = new class54();
        }
        int var4 = method1490(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1490(16);
        }
        int var6 = method1490(6) + 1;
        field3166 = new class685[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3166[var7] = new class685();
        }
        int var8 = method1490(6) + 1;
        field3155 = new class429[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3155[var9] = new class429();
        }
        int var10 = method1490(6) + 1;
        field3173 = new class544[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3173[var11] = new class544();
        }
        int var12 = method1490(6) + 1;
        field3157 = new boolean[var12];
        field3174 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3157[var13] = method1488() != 0;
            method1490(16);
            method1490(16);
            field3174[var13] = method1490(8);
        }
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(I)I")
    public static final int method1490(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3176) {
            int var4 = 8 - field3176;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3159[field3151] >> field3176 & var5) << var2;
            field3176 = 0;
            field3151++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3159[field3151] >> field3176 & var3) << var2;
            field3176 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "()V")
    public static void method1491() {
        field3159 = null;
        field3180 = null;
        field3166 = null;
        field3155 = null;
        field3173 = null;
        field3157 = null;
        field3174 = null;
        field3164 = null;
        field3154 = null;
        field3162 = null;
        field3161 = null;
        field3156 = null;
        field3158 = null;
        field3152 = null;
        field3172 = null;
        field3168 = null;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "([BI)V")
    private static final void method1492(byte[] arg0, int arg1) {
        field3159 = arg0;
        field3151 = arg1;
        field3176 = 0;
    }

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "(I)F")
    public static final float method1493(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "([B)V")
    private final void method1494(byte[] arg0) {
        class115 var2 = new class115(arg0);
        this.field3175 = var2.method631(false);
        this.field3150 = var2.method631(false);
        this.field3171 = var2.method631(false);
        this.field3153 = var2.method631(false);
        if (this.field3153 < 0) {
            this.field3153 = ~this.field3153;
            this.field3147 = true;
        }
        int var3 = var2.method631(false);
        this.field3160 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method620((byte) -127);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method628(0, var5, var7, (byte) -105);
            this.field3160[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "([B)V")
    private class253(byte[] arg0) {
        this.method1494(arg0);
    }
}
