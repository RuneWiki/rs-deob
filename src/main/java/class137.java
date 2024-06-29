import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class137 {

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "Z")
    private static boolean field3317 = false;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    private static int field3305;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    private int field3306;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    private static int field3313;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    private int field3315;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    private static int field3319;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    private static int field3321;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    private int field3325;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    private static int field3329;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    private int field3332;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
    private static int field3334;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "Z")
    private static boolean field3322;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "Z")
    private boolean field3327;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "[B")
    private static byte[] field3310;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "[F")
    private static float[] field3307;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "[F")
    private static float[] field3309;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "[F")
    private static float[] field3316;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "[F")
    private static float[] field3320;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "[F")
    private static float[] field3324;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "[F")
    private static float[] field3326;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "[F")
    private static float[] field3328;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "[F")
    private static float[] field3333;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "[I")
    private static int[] field3308;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "[I")
    private static int[] field3330;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "[I")
    private static int[] field3331;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "[Lqa;")
    private static class112[] field3304;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "[Lue;")
    private static class140[] field3323;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "[Lwb;")
    private static class149[] field3314;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "[Lje;")
    public static class67[] field3311;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "[Z")
    private static boolean[] field3318;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "[[B")
    private byte[][] field3312;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lg;II)Lub;")
    public static final class137 method1107(class43 arg0, int arg1, int arg2) {
        if (method1116(arg0)) {
            byte[] var3 = arg0.method324(0, arg2, arg1);
            return var3 == null ? null : new class137(var3);
        } else {
            arg0.method341(arg2, arg1, -15623);
            return null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I")
    public static final int method1108(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3334) {
            int var4 = 8 - field3334;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3310[field3321] >> field3334 & var5) << var2;
            field3334 = 0;
            field3321++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3310[field3321] >> field3334 & var3) << var2;
            field3334 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)[F")
    private final float[] method1109(int arg0) {
        method1114(this.field3312[arg0], 0);
        method1117();
        int var2 = method1108(class145.method1187(field3331.length - 1, false));
        boolean var3 = field3318[var2];
        int var4 = var3 ? field3305 : field3313;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1117() != 0;
            var6 = method1117() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3313 >> 2);
            var9 = (field3313 >> 2) + (var4 >> 2);
            var10 = field3313 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3313 >> 2);
            var12 = (field3313 >> 2) + (var4 - (var4 >> 2));
            var13 = field3313 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class149 var14 = field3314[field3331[var2]];
        int var15 = var14.field3710;
        int var16 = var14.field3712[var15];
        boolean var17 = !field3304[var16].method913();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3711; var19++) {
            class140 var95 = field3323[var14.field3709[var19]];
            float[] var96 = field3309;
            var95.method1130(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field3710;
            int var21 = var14.field3712[var20];
            field3304[var21].method918(field3309, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field3309[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field3309;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3328 : field3326;
            float[] var30 = var3 ? field3324 : field3320;
            float[] var31 = var3 ? field3307 : field3316;
            int[] var32 = var3 ? field3330 : field3308;
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
            int var35 = class145.method1187(var4 - 1, false);
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
                field3309[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3309[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (field3329 > 0) {
            int var49 = field3329 + var4 >> 2;
            var48 = new float[var49];
            if (!field3322) {
                for (int var50 = 0; var50 < field3319; var50++) {
                    int var51 = (field3329 >> 1) + var50;
                    var48[var50] += field3333[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3309[var52];
                }
            }
        }
        float[] var54 = field3333;
        field3333 = field3309;
        field3309 = var54;
        field3329 = var4;
        field3319 = var12 - (var4 >> 1);
        field3322 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([B)V")
    private final void method1110(byte[] arg0) {
        class59 var2 = new class59(arg0);
        this.field3306 = var2.method498((byte) 124);
        this.field3332 = var2.method498((byte) 125);
        this.field3315 = var2.method498((byte) 122);
        this.field3325 = var2.method498((byte) 125);
        if (this.field3325 < 0) {
            this.field3325 = ~this.field3325;
            this.field3327 = true;
        }
        int var3 = var2.method498((byte) -34);
        this.field3312 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method480(0);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method482(var5, 0, var7, false);
            this.field3312[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "()Lke;")
    public final class74 method1111() {
        field3329 = 0;
        byte[] var1 = new byte[this.field3332];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3312.length; var3++) {
            float[] var4 = this.method1109(var3);
            if (var4 != null) {
                int var5 = var4.length;
                if (var5 > this.field3332 - var2) {
                    var5 = this.field3332 - var2;
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
        return new class74(this.field3306, var1, this.field3315, this.field3325, this.field3327);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "()V")
    public static void method1112() {
        field3310 = null;
        field3311 = null;
        field3304 = null;
        field3323 = null;
        field3314 = null;
        field3318 = null;
        field3331 = null;
        field3333 = null;
        field3309 = null;
        field3326 = null;
        field3320 = null;
        field3316 = null;
        field3328 = null;
        field3324 = null;
        field3307 = null;
        field3308 = null;
        field3330 = null;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)F")
    public static final float method1113(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([BI)V")
    private static final void method1114(byte[] arg0, int arg1) {
        field3310 = arg0;
        field3321 = arg1;
        field3334 = 0;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "([B)V")
    private static final void method1115(byte[] arg0) {
        method1114(arg0, 0);
        field3313 = 0x1 << method1108(4);
        field3305 = 0x1 << method1108(4);
        field3309 = new float[field3305];
        field3333 = new float[field3305];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3313 : field3305;
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
            int var25 = class145.method1187(var17 - 1, false);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class77.method617(var26, var25, (byte) 87);
            }
            if (var1 == 0) {
                field3326 = var18;
                field3320 = var20;
                field3316 = var22;
                field3308 = var24;
            } else {
                field3328 = var18;
                field3324 = var20;
                field3307 = var22;
                field3330 = var24;
            }
        }
        int var2 = method1108(8) + 1;
        field3311 = new class67[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3311[var3] = new class67();
        }
        int var4 = method1108(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1108(16);
        }
        int var6 = method1108(6) + 1;
        field3304 = new class112[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3304[var7] = new class112();
        }
        int var8 = method1108(6) + 1;
        field3323 = new class140[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3323[var9] = new class140();
        }
        int var10 = method1108(6) + 1;
        field3314 = new class149[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3314[var11] = new class149();
        }
        int var12 = method1108(6) + 1;
        field3318 = new boolean[var12];
        field3331 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3318[var13] = method1117() != 0;
            method1108(16);
            method1108(16);
            field3331[var13] = method1108(8);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lg;)Z")
    private static final boolean method1116(class43 arg0) {
        if (!field3317) {
            byte[] var1 = arg0.method324(0, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1115(var1);
            field3317 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "()I")
    public static final int method1117() {
        int var0 = field3310[field3321] >> field3334 & 0x1;
        field3334++;
        field3321 += field3334 >> 3;
        field3334 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "([B)V")
    private class137(byte[] arg0) {
        this.method1110(arg0);
    }
}
