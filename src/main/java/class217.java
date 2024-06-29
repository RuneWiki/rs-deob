import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class217 extends class154 {

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "Z")
    private static boolean field3334 = false;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    private static int field3319;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    private static int field3320;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    private int field3321;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    private static int field3322;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    private int field3325;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
    private static int field3331;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
    private int field3335;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    private int field3341;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
    private int field3342;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
    private int field3343;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "I")
    private int field3344;

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "I")
    private int field3347;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "Z")
    private boolean field3326;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "Z")
    private boolean field3328;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "[B")
    private static byte[] field3332;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "[B")
    private byte[] field3345;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "[F")
    private static float[] field3317;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "[F")
    private static float[] field3318;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "[F")
    private static float[] field3323;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "[F")
    private static float[] field3324;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "[F")
    private float[] field3327;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "[F")
    private static float[] field3330;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "[F")
    private static float[] field3333;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "[F")
    private static float[] field3346;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "[I")
    private static int[] field3314;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "[I")
    private static int[] field3329;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "[I")
    private static int[] field3336;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "[Lna;")
    private static class155[] field3339;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "[Lr;")
    private static class253[] field3316;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "[Lme;")
    private static class40[] field3337;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "[Lec;")
    public static class62[] field3340;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "[Z")
    private static boolean[] field3338;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "[[B")
    private byte[][] field3315;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([I)Lqm;")
    public final class173 method1409(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3345 == null) {
            this.field3325 = 0;
            this.field3327 = new float[field3320];
            this.field3345 = new byte[this.field3341];
            this.field3347 = 0;
            this.field3344 = 0;
        }
        while (this.field3344 < this.field3315.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1418(this.field3344);
            if (var3 != null) {
                int var4 = this.field3347;
                int var5 = var3.length;
                if (var5 > this.field3341 - var4) {
                    var5 = this.field3341 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field3345[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field3347;
                }
                this.field3347 = var4;
            }
            this.field3344++;
        }
        this.field3327 = null;
        byte[] var2 = this.field3345;
        this.field3345 = null;
        return new class173(this.field3342, var2, this.field3343, this.field3321, this.field3328);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lnh;II)Lke;")
    public static final class217 method1410(class305 arg0, int arg1, int arg2) {
        if (method1413(arg0)) {
            byte[] var3 = arg0.method2050(103, arg1, arg2);
            return var3 == null ? null : new class217(var3);
        } else {
            arg0.method2061(arg1, arg2, false);
            return null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "()V")
    public static void method1411() {
        field3332 = null;
        field3340 = null;
        field3316 = null;
        field3339 = null;
        field3337 = null;
        field3338 = null;
        field3336 = null;
        field3346 = null;
        field3317 = null;
        field3333 = null;
        field3318 = null;
        field3323 = null;
        field3324 = null;
        field3330 = null;
        field3314 = null;
        field3329 = null;
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)I")
    public static final int method1412(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3331) {
            int var4 = 8 - field3331;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3332[field3319] >> field3331 & var5) << var2;
            field3331 = 0;
            field3319++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3332[field3319] >> field3331 & var3) << var2;
            field3331 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lnh;)Z")
    private static final boolean method1413(class305 arg0) {
        if (!field3334) {
            byte[] var1 = arg0.method2050(92, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1419(var1);
            field3334 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "()I")
    public static final int method1414() {
        int var0 = field3332[field3319] >> field3331 & 0x1;
        field3331++;
        field3319 += field3331 >> 3;
        field3331 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([BI)V")
    private static final void method1415(byte[] arg0, int arg1) {
        field3332 = arg0;
        field3319 = arg1;
        field3331 = 0;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([B)V")
    private final void method1416(byte[] arg0) {
        class215 var2 = new class215(arg0);
        this.field3342 = var2.method1383((byte) -123);
        this.field3341 = var2.method1383((byte) 100);
        this.field3343 = var2.method1383((byte) 65);
        this.field3321 = var2.method1383((byte) 81);
        if (this.field3321 < 0) {
            this.field3321 = ~this.field3321;
            this.field3328 = true;
        }
        int var3 = var2.method1383((byte) -116);
        this.field3315 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1374((byte) -60);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1355(255, 0, var5, var7);
            this.field3315[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)F")
    public static final float method1417(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)[F")
    private final float[] method1418(int arg0) {
        method1415(this.field3315[arg0], 0);
        method1414();
        int var2 = method1412(class11.method71(field3336.length - 1, (byte) 68));
        boolean var3 = field3338[var2];
        int var4 = var3 ? field3320 : field3322;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1414() != 0;
            var6 = method1414() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3322 >> 2);
            var9 = (field3322 >> 2) + (var4 >> 2);
            var10 = field3322 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3322 >> 2);
            var12 = (field3322 >> 2) + (var4 - (var4 >> 2));
            var13 = field3322 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class40 var14 = field3337[field3336[var2]];
        int var15 = var14.field604;
        int var16 = var14.field606[var15];
        boolean var17 = !field3316[var16].method1646();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field605; var19++) {
            class155 var95 = field3339[var14.field607[var19]];
            float[] var96 = field3346;
            var95.method967(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field604;
            int var21 = var14.field606[var20];
            field3316[var21].method1648(field3346, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field3346[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field3346;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3323 : field3317;
            float[] var30 = var3 ? field3324 : field3333;
            float[] var31 = var3 ? field3330 : field3318;
            int[] var32 = var3 ? field3329 : field3314;
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
            int var35 = class11.method71(var4 - 1, (byte) 65);
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
                field3346[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3346[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field3325 > 0) {
            int var49 = this.field3325 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field3326) {
                for (int var50 = 0; var50 < this.field3335; var50++) {
                    int var51 = (this.field3325 >> 1) + var50;
                    var48[var50] += this.field3327[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3346[var52];
                }
            }
        }
        float[] var54 = this.field3327;
        this.field3327 = field3346;
        field3346 = var54;
        this.field3325 = var4;
        this.field3335 = var12 - (var4 >> 1);
        this.field3326 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "([B)V")
    private static final void method1419(byte[] arg0) {
        method1415(arg0, 0);
        field3322 = 0x1 << method1412(4);
        field3320 = 0x1 << method1412(4);
        field3346 = new float[field3320];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3322 : field3320;
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
            int var25 = class11.method71(var17 - 1, (byte) 115);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class4.method21(var25, var26, (byte) 11);
            }
            if (var1 == 0) {
                field3317 = var18;
                field3333 = var20;
                field3318 = var22;
                field3314 = var24;
            } else {
                field3323 = var18;
                field3324 = var20;
                field3330 = var22;
                field3329 = var24;
            }
        }
        int var2 = method1412(8) + 1;
        field3340 = new class62[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3340[var3] = new class62();
        }
        int var4 = method1412(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1412(16);
        }
        int var6 = method1412(6) + 1;
        field3316 = new class253[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3316[var7] = new class253();
        }
        int var8 = method1412(6) + 1;
        field3339 = new class155[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3339[var9] = new class155();
        }
        int var10 = method1412(6) + 1;
        field3337 = new class40[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3337[var11] = new class40();
        }
        int var12 = method1412(6) + 1;
        field3338 = new boolean[var12];
        field3336 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3338[var13] = method1414() != 0;
            method1412(16);
            method1412(16);
            field3336[var13] = method1412(8);
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "([B)V")
    private class217(byte[] arg0) {
        this.method1416(arg0);
    }
}
