import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class221 extends class188 {

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "Z")
    private static boolean field3320 = false;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    private int field3327;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    private static int field3328;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    private int field3329;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
    private int field3332;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
    private static int field3333;

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
    private static int field3336;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "I")
    private int field3337;

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
    private int field3344;

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
    private static int field3345;

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "I")
    private int field3348;

    @OriginalMember(owner = "client!ta", name = "P", descriptor = "I")
    private int field3350;

    @OriginalMember(owner = "client!ta", name = "Q", descriptor = "I")
    private int field3351;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "Z")
    private boolean field3330;

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "Z")
    private boolean field3343;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "[B")
    private static byte[] field3325;

    @OriginalMember(owner = "client!ta", name = "R", descriptor = "[B")
    private byte[] field3352;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "[F")
    private float[] field3322;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "[F")
    private static float[] field3323;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "[F")
    private static float[] field3324;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "[F")
    private static float[] field3326;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "[F")
    private static float[] field3331;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "[F")
    private static float[] field3334;

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "[F")
    private static float[] field3335;

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "[F")
    private static float[] field3341;

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "[I")
    private static int[] field3338;

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "[I")
    private static int[] field3340;

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "[I")
    private static int[] field3342;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "[Lkl;")
    private static class150[] field3321;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "[Lqe;")
    private static class209[] field3347;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "[Lci;")
    private static class224[] field3319;

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "[Lqh;")
    public static class330[] field3339;

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "[Z")
    private static boolean[] field3346;

    @OriginalMember(owner = "client!ta", name = "O", descriptor = "[[B")
    private byte[][] field3349;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([B)V", line = 4)
    private final void method1538(byte[] arg0) {
        class143 var2 = new class143(arg0);
        this.field3327 = var2.method1057(-123);
        this.field3348 = var2.method1057(-115);
        this.field3337 = var2.method1057(-101);
        this.field3344 = var2.method1057(-112);
        if (this.field3344 < 0) {
            this.field3344 = ~this.field3344;
            this.field3330 = true;
        }
        int var3 = var2.method1057(-102);
        this.field3349 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1043(true);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1020(var5, var7, (byte) 67, 0);
            this.field3349[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([I)Lfn;", line = 46)
    public final class37 method1539(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3352 == null) {
            this.field3332 = 0;
            this.field3322 = new float[field3336];
            this.field3352 = new byte[this.field3348];
            this.field3351 = 0;
            this.field3350 = 0;
        }
        while (this.field3350 < this.field3349.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1547(this.field3350);
            if (var2 != null) {
                int var3 = this.field3351;
                int var4 = var2.length;
                if (var4 > this.field3348 - var3) {
                    var4 = this.field3348 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field3352[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field3351;
                }
                this.field3351 = var3;
            }
            this.field3350++;
        }
        this.field3322 = null;
        byte[] var7 = this.field3352;
        this.field3352 = null;
        return new class37(this.field3327, var7, this.field3337, this.field3344, this.field3330);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([BI)V", line = 114)
    private static final void method1540(byte[] arg0, int arg1) {
        field3325 = arg0;
        field3345 = arg1;
        field3333 = 0;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)I", line = 120)
    public static final int method1541(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3333) {
            int var3 = 8 - field3333;
            int var4 = (0x1 << var3) - 1;
            var1 += (field3325[field3345] >> field3333 & var4) << var2;
            field3333 = 0;
            field3345++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field3325[field3345] >> field3333 & var5) << var2;
            field3333 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lnk;)Z", line = 147)
    private static final boolean method1542(class16 arg0) {
        if (!field3320) {
            byte[] var1 = arg0.method100(0, 0, (byte) -107);
            if (var1 == null) {
                return false;
            }
            method1544(var1);
            field3320 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()I", line = 166)
    public static final int method1543() {
        int var0 = field3325[field3345] >> field3333 & 0x1;
        field3333++;
        field3345 += field3333 >> 3;
        field3333 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "([B)V", line = 180)
    private static final void method1544(byte[] arg0) {
        method1540(arg0, 0);
        field3328 = 0x1 << method1541(4);
        field3336 = 0x1 << method1541(4);
        field3335 = new float[field3336];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field3328 : field3336;
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
            int var13 = class333.method2305(var5 - 1, (byte) -29);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class353.method2443(var13, var14, (byte) -111);
            }
            if (var1 == 0) {
                field3324 = var6;
                field3334 = var8;
                field3326 = var10;
                field3340 = var12;
            } else {
                field3323 = var6;
                field3341 = var8;
                field3331 = var10;
                field3338 = var12;
            }
        }
        int var15 = method1541(8) + 1;
        field3339 = new class330[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field3339[var16] = new class330();
        }
        int var17 = method1541(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method1541(16);
        }
        int var19 = method1541(6) + 1;
        field3321 = new class150[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field3321[var20] = new class150();
        }
        int var21 = method1541(6) + 1;
        field3319 = new class224[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field3319[var22] = new class224();
        }
        int var23 = method1541(6) + 1;
        field3347 = new class209[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field3347[var24] = new class209();
        }
        int var25 = method1541(6) + 1;
        field3346 = new boolean[var25];
        field3342 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field3346[var26] = method1543() != 0;
            method1541(16);
            method1541(16);
            field3342[var26] = method1541(8);
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()V", line = 332)
    public static void method1545() {
        field3325 = null;
        field3339 = null;
        field3321 = null;
        field3319 = null;
        field3347 = null;
        field3346 = null;
        field3342 = null;
        field3335 = null;
        field3324 = null;
        field3334 = null;
        field3326 = null;
        field3323 = null;
        field3341 = null;
        field3331 = null;
        field3340 = null;
        field3338 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lnk;II)Lta;", line = 356)
    public static final class221 method1546(class16 arg0, int arg1, int arg2) {
        if (method1542(arg0)) {
            byte[] var3 = arg0.method100(arg1, arg2, (byte) -107);
            return var3 == null ? null : new class221(var3);
        } else {
            arg0.method95(arg1, arg2, (byte) 71);
            return null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)[F", line = 370)
    private final float[] method1547(int arg0) {
        method1540(this.field3349[arg0], 0);
        method1543();
        int var2 = method1541(class333.method2305(field3342.length - 1, (byte) -46));
        boolean var3 = field3346[var2];
        int var4 = var3 ? field3336 : field3328;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1543() != 0;
            var6 = method1543() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3328 >> 2);
            var9 = (field3328 >> 2) + (var4 >> 2);
            var10 = field3328 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3328 >> 2);
            var12 = (field3328 >> 2) + (var4 - (var4 >> 2));
            var13 = field3328 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class209 var14 = field3347[field3342[var2]];
        int var15 = var14.field3153;
        int var16 = var14.field3155[var15];
        boolean var17 = !field3321[var16].method1097();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3152; var19++) {
            class224 var20 = field3319[var14.field3154[var19]];
            float[] var21 = field3335;
            var20.method1561(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field3153;
            int var23 = var14.field3155[var22];
            field3321[var23].method1095(field3335, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field3335[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field3335;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field3323 : field3324;
            float[] var32 = var3 ? field3341 : field3334;
            float[] var33 = var3 ? field3331 : field3326;
            int[] var34 = var3 ? field3338 : field3340;
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
            int var47 = class333.method2305(var4 - 1, (byte) 120);
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
                field3335[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3335[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field3332 > 0) {
            int var91 = this.field3332 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field3343) {
                for (int var92 = 0; var92 < this.field3329; var92++) {
                    int var93 = (this.field3332 >> 1) + var92;
                    var90[var92] += this.field3322[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field3335[var94];
                }
            }
        }
        float[] var96 = this.field3322;
        this.field3322 = field3335;
        field3335 = var96;
        this.field3332 = var4;
        this.field3329 = var12 - (var4 >> 1);
        this.field3343 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)F", line = 784)
    public static final float method1548(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "([B)V", line = 803)
    private class221(byte[] arg0) {
        this.method1538(arg0);
    }
}
