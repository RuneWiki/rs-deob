import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class185 extends class137 {

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "Z")
    private static boolean field3378 = false;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    private int field3375;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    private static int field3377;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
    private int field3382;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    private static int field3383;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
    private int field3384;

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "I")
    private static int field3389;

    @OriginalMember(owner = "client!pi", name = "G", descriptor = "I")
    private static int field3392;

    @OriginalMember(owner = "client!pi", name = "H", descriptor = "I")
    private int field3393;

    @OriginalMember(owner = "client!pi", name = "J", descriptor = "I")
    private int field3395;

    @OriginalMember(owner = "client!pi", name = "P", descriptor = "I")
    private int field3401;

    @OriginalMember(owner = "client!pi", name = "R", descriptor = "I")
    private int field3403;

    @OriginalMember(owner = "client!pi", name = "T", descriptor = "I")
    private int field3405;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "Z")
    private boolean field3385;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "Z")
    private boolean field3386;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "[B")
    private static byte[] field3388;

    @OriginalMember(owner = "client!pi", name = "U", descriptor = "[B")
    private byte[] field3406;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "[F")
    private static float[] field3374;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "[F")
    private static float[] field3376;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "[F")
    private static float[] field3379;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "[F")
    private static float[] field3380;

    @OriginalMember(owner = "client!pi", name = "K", descriptor = "[F")
    private static float[] field3396;

    @OriginalMember(owner = "client!pi", name = "N", descriptor = "[F")
    private float[] field3399;

    @OriginalMember(owner = "client!pi", name = "Q", descriptor = "[F")
    private static float[] field3402;

    @OriginalMember(owner = "client!pi", name = "S", descriptor = "[F")
    private static float[] field3404;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "[I")
    private static int[] field3381;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "[I")
    private static int[] field3387;

    @OriginalMember(owner = "client!pi", name = "O", descriptor = "[I")
    private static int[] field3400;

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "[Lma;")
    private static class150[] field3391;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "[Lij;")
    public static class25[] field3373;

    @OriginalMember(owner = "client!pi", name = "M", descriptor = "[Lub;")
    private static class44[] field3398;

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "[Lai;")
    private static class78[] field3394;

    @OriginalMember(owner = "client!pi", name = "L", descriptor = "[Z")
    private static boolean[] field3397;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "[[B")
    private byte[][] field3390;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)I")
    public static final int method1361(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3383) {
            int var4 = 8 - field3383;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3388[field3392] >> field3383 & var5) << var2;
            field3383 = 0;
            field3392++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3388[field3392] >> field3383 & var3) << var2;
            field3383 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([B)V")
    private final void method1362(byte[] arg0) {
        class81 var2 = new class81(arg0);
        this.field3393 = var2.method620((byte) -82);
        this.field3401 = var2.method620((byte) -82);
        this.field3375 = var2.method620((byte) -82);
        this.field3395 = var2.method620((byte) -82);
        if (this.field3395 < 0) {
            this.field3395 = ~this.field3395;
            this.field3385 = true;
        }
        int var3 = var2.method620((byte) -82);
        this.field3390 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method622(true);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method628(123, var5, var7, 0);
            this.field3390[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "([B)V")
    private static final void method1363(byte[] arg0) {
        method1371(arg0, 0);
        field3389 = 0x1 << method1361(4);
        field3377 = 0x1 << method1361(4);
        field3404 = new float[field3377];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3389 : field3377;
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
            int var25 = class21.method139((byte) -127, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class123.method981(var25, var26, 1);
            }
            if (var1 == 0) {
                field3379 = var18;
                field3376 = var20;
                field3402 = var22;
                field3400 = var24;
            } else {
                field3396 = var18;
                field3374 = var20;
                field3380 = var22;
                field3381 = var24;
            }
        }
        int var2 = method1361(8) + 1;
        field3373 = new class25[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3373[var3] = new class25();
        }
        int var4 = method1361(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1361(16);
        }
        int var6 = method1361(6) + 1;
        field3391 = new class150[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3391[var7] = new class150();
        }
        int var8 = method1361(6) + 1;
        field3398 = new class44[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3398[var9] = new class44();
        }
        int var10 = method1361(6) + 1;
        field3394 = new class78[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3394[var11] = new class78();
        }
        int var12 = method1361(6) + 1;
        field3397 = new boolean[var12];
        field3387 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3397[var13] = method1364() != 0;
            method1361(16);
            method1361(16);
            field3387[var13] = method1361(8);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "()I")
    public static final int method1364() {
        int var0 = field3388[field3392] >> field3383 & 0x1;
        field3383++;
        field3392 += field3383 >> 3;
        field3383 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)[F")
    private final float[] method1365(int arg0) {
        method1371(this.field3390[arg0], 0);
        method1364();
        int var2 = method1361(class21.method139((byte) -127, field3387.length - 1));
        boolean var3 = field3397[var2];
        int var4 = var3 ? field3377 : field3389;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1364() != 0;
            var6 = method1364() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3389 >> 2);
            var9 = (field3389 >> 2) + (var4 >> 2);
            var10 = field3389 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3389 >> 2);
            var12 = (field3389 >> 2) + (var4 - (var4 >> 2));
            var13 = field3389 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class78 var14 = field3394[field3387[var2]];
        int var15 = var14.field1459;
        int var16 = var14.field1460[var15];
        boolean var17 = !field3391[var16].method1116();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1461; var19++) {
            class44 var95 = field3398[var14.field1462[var19]];
            float[] var96 = field3404;
            var95.method330(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1459;
            int var21 = var14.field1460[var20];
            field3391[var21].method1113(field3404, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field3404[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field3404;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3396 : field3379;
            float[] var30 = var3 ? field3374 : field3376;
            float[] var31 = var3 ? field3380 : field3402;
            int[] var32 = var3 ? field3381 : field3400;
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
            int var35 = class21.method139((byte) -127, var4 - 1);
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
                field3404[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3404[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field3382 > 0) {
            int var49 = this.field3382 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field3386) {
                for (int var50 = 0; var50 < this.field3384; var50++) {
                    int var51 = (this.field3382 >> 1) + var50;
                    var48[var50] += this.field3399[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3404[var52];
                }
            }
        }
        float[] var54 = this.field3399;
        this.field3399 = field3404;
        field3404 = var54;
        this.field3382 = var4;
        this.field3384 = var12 - (var4 >> 1);
        this.field3386 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([I)Lqa;")
    public final class167 method1366(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3406 == null) {
            this.field3382 = 0;
            this.field3399 = new float[field3377];
            this.field3406 = new byte[this.field3401];
            this.field3405 = 0;
            this.field3403 = 0;
        }
        while (this.field3403 < this.field3390.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1365(this.field3403);
            if (var3 != null) {
                int var4 = this.field3405;
                int var5 = var3.length;
                if (var5 > this.field3401 - var4) {
                    var5 = this.field3401 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field3406[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field3405;
                }
                this.field3405 = var4;
            }
            this.field3403++;
        }
        this.field3399 = null;
        byte[] var2 = this.field3406;
        this.field3406 = null;
        return new class167(this.field3393, var2, this.field3375, this.field3395, this.field3385);
    }

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)F")
    public static final float method1367(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "()V")
    public static void method1368() {
        field3388 = null;
        field3373 = null;
        field3391 = null;
        field3398 = null;
        field3394 = null;
        field3397 = null;
        field3387 = null;
        field3404 = null;
        field3379 = null;
        field3376 = null;
        field3402 = null;
        field3396 = null;
        field3374 = null;
        field3380 = null;
        field3400 = null;
        field3381 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lpa;)Z")
    private static final boolean method1369(class123 arg0) {
        if (!field3378) {
            byte[] var1 = arg0.method973(0, true, 0);
            if (var1 == null) {
                return false;
            }
            method1363(var1);
            field3378 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lpa;II)Lpi;")
    public static final class185 method1370(class123 arg0, int arg1, int arg2) {
        if (method1369(arg0)) {
            byte[] var3 = arg0.method973(arg1, true, arg2);
            return var3 == null ? null : new class185(var3);
        } else {
            arg0.method977(arg2, arg1, (byte) -13);
            return null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([BI)V")
    private static final void method1371(byte[] arg0, int arg1) {
        field3388 = arg0;
        field3392 = arg1;
        field3383 = 0;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "([B)V")
    private class185(byte[] arg0) {
        this.method1362(arg0);
    }
}
