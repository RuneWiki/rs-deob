import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class568 extends class544 {

    @OriginalMember(owner = "client!ica", name = "B", descriptor = "Z")
    private static boolean field8342 = false;

    @OriginalMember(owner = "client!ica", name = "m", descriptor = "I")
    private static int field8327;

    @OriginalMember(owner = "client!ica", name = "r", descriptor = "I")
    private static int field8332;

    @OriginalMember(owner = "client!ica", name = "s", descriptor = "I")
    private int field8333;

    @OriginalMember(owner = "client!ica", name = "x", descriptor = "I")
    private static int field8338;

    @OriginalMember(owner = "client!ica", name = "D", descriptor = "I")
    private int field8344;

    @OriginalMember(owner = "client!ica", name = "G", descriptor = "I")
    private int field8347;

    @OriginalMember(owner = "client!ica", name = "I", descriptor = "I")
    private int field8349;

    @OriginalMember(owner = "client!ica", name = "M", descriptor = "I")
    private int field8353;

    @OriginalMember(owner = "client!ica", name = "N", descriptor = "I")
    private int field8354;

    @OriginalMember(owner = "client!ica", name = "Q", descriptor = "I")
    private static int field8357;

    @OriginalMember(owner = "client!ica", name = "R", descriptor = "I")
    private int field8358;

    @OriginalMember(owner = "client!ica", name = "T", descriptor = "I")
    private int field8360;

    @OriginalMember(owner = "client!ica", name = "t", descriptor = "Z")
    private boolean field8334;

    @OriginalMember(owner = "client!ica", name = "J", descriptor = "Z")
    private boolean field8350;

    @OriginalMember(owner = "client!ica", name = "q", descriptor = "[B")
    private static byte[] field8331;

    @OriginalMember(owner = "client!ica", name = "S", descriptor = "[B")
    private byte[] field8359;

    @OriginalMember(owner = "client!ica", name = "o", descriptor = "[F")
    private static float[] field8329;

    @OriginalMember(owner = "client!ica", name = "u", descriptor = "[F")
    private static float[] field8335;

    @OriginalMember(owner = "client!ica", name = "C", descriptor = "[F")
    private static float[] field8343;

    @OriginalMember(owner = "client!ica", name = "E", descriptor = "[F")
    private static float[] field8345;

    @OriginalMember(owner = "client!ica", name = "F", descriptor = "[F")
    private static float[] field8346;

    @OriginalMember(owner = "client!ica", name = "H", descriptor = "[F")
    private static float[] field8348;

    @OriginalMember(owner = "client!ica", name = "K", descriptor = "[F")
    private static float[] field8351;

    @OriginalMember(owner = "client!ica", name = "P", descriptor = "[F")
    private float[] field8356;

    @OriginalMember(owner = "client!ica", name = "y", descriptor = "[I")
    private static int[] field8339;

    @OriginalMember(owner = "client!ica", name = "A", descriptor = "[I")
    private static int[] field8341;

    @OriginalMember(owner = "client!ica", name = "O", descriptor = "[I")
    private static int[] field8355;

    @OriginalMember(owner = "client!ica", name = "w", descriptor = "[Lgg;")
    private static class149[] field8337;

    @OriginalMember(owner = "client!ica", name = "p", descriptor = "[Lub;")
    private static class20[] field8330;

    @OriginalMember(owner = "client!ica", name = "n", descriptor = "[Lpd;")
    private static class214[] field8328;

    @OriginalMember(owner = "client!ica", name = "v", descriptor = "[Lpo;")
    public static class477[] field8336;

    @OriginalMember(owner = "client!ica", name = "L", descriptor = "[Z")
    private static boolean[] field8352;

    @OriginalMember(owner = "client!ica", name = "z", descriptor = "[[B")
    private byte[][] field8340;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Ldn;II)Lica;", line = 5)
    public static final class568 method3307(class438 arg0, int arg1, int arg2) {
        if (method3308(arg0)) {
            byte[] var3 = arg0.method2558(100, arg2, arg1);
            return var3 == null ? null : new class568(var3);
        } else {
            arg0.method2563(arg1, (byte) 98, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Ldn;)Z", line = 21)
    private static final boolean method3308(class438 arg0) {
        if (!field8342) {
            byte[] var1 = arg0.method2558(100, 0, 0);
            if (var1 == null) {
                return false;
            }
            method3316(var1);
            field8342 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "()I", line = 50)
    public static final int method3309() {
        int var0 = field8331[field8357] >> field8338 & 0x1;
        field8338++;
        field8357 += field8338 >> 3;
        field8338 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Ldn;I)Lica;", line = 58)
    public static final class568 method3310(class438 arg0, int arg1) {
        if (method3308(arg0)) {
            byte[] var2 = arg0.method2560(arg1, -6914);
            return var2 == null ? null : new class568(var2);
        } else {
            arg0.method2566(107, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "([B)V", line = 79)
    private final void method3311(byte[] arg0) {
        class374 var2 = new class374(arg0);
        this.field8333 = var2.method2123(false);
        this.field8347 = var2.method2123(false);
        this.field8349 = var2.method2123(false);
        this.field8344 = var2.method2123(false);
        if (this.field8344 < 0) {
            this.field8344 = ~this.field8344;
            this.field8350 = true;
        }
        int var3 = var2.method2123(false);
        this.field8340 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2129(-120);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2147(var7, (byte) 102, 0, var5);
            this.field8340[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "([I)Lmr;", line = 121)
    public final class123 method3312(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field8359 == null) {
            this.field8354 = 0;
            this.field8356 = new float[field8332];
            this.field8359 = new byte[this.field8347];
            this.field8360 = 0;
            this.field8358 = 0;
        }
        while (this.field8358 < this.field8340.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method3315(this.field8358);
            if (var3 != null) {
                int var4 = this.field8360;
                int var5 = var3.length;
                if (var5 > this.field8347 - var4) {
                    var5 = this.field8347 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field8359[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field8360;
                }
                this.field8360 = var4;
            }
            this.field8358++;
        }
        this.field8356 = null;
        byte[] var2 = this.field8359;
        this.field8359 = null;
        return new class123(this.field8333, var2, this.field8349, this.field8344, this.field8350);
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "([BI)V", line = 179)
    private static final void method3313(byte[] arg0, int arg1) {
        field8331 = arg0;
        field8357 = arg1;
        field8338 = 0;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)F", line = 188)
    public static final float method3314(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(I)[F", line = 199)
    private final float[] method3315(int arg0) {
        method3313(this.field8340[arg0], 0);
        method3309();
        int var2 = method3318(class131.method739(field8355.length - 1, 4));
        boolean var3 = field8352[var2];
        int var4 = var3 ? field8332 : field8327;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method3309() != 0;
            var6 = method3309() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field8327 >> 2);
            var9 = (field8327 >> 2) + (var4 >> 2);
            var10 = field8327 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field8327 >> 2);
            var12 = (field8327 >> 2) + (var4 - (var4 >> 2));
            var13 = field8327 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class20 var14 = field8330[field8355[var2]];
        int var15 = var14.field143;
        int var16 = var14.field144[var15];
        boolean var17 = !field8328[var16].method1227();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field142; var19++) {
            class149 var95 = field8337[var14.field145[var19]];
            float[] var96 = field8351;
            var95.method819(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field143;
            int var21 = var14.field144[var20];
            field8328[var21].method1230(field8351, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field8351[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field8351;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field8335 : field8343;
            float[] var30 = var3 ? field8329 : field8346;
            float[] var31 = var3 ? field8345 : field8348;
            int[] var32 = var3 ? field8341 : field8339;
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
            int var35 = class131.method739(var4 - 1, 4);
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
                field8351[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field8351[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field8354 > 0) {
            int var49 = this.field8354 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field8334) {
                for (int var50 = 0; var50 < this.field8353; var50++) {
                    int var51 = (this.field8354 >> 1) + var50;
                    var48[var50] += this.field8356[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field8351[var52];
                }
            }
        }
        float[] var54 = this.field8356;
        this.field8356 = field8351;
        field8351 = var54;
        this.field8354 = var4;
        this.field8353 = var12 - (var4 >> 1);
        this.field8334 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "([B)V", line = 616)
    private static final void method3316(byte[] arg0) {
        method3313(arg0, 0);
        field8327 = 0x1 << method3318(4);
        field8332 = 0x1 << method3318(4);
        field8351 = new float[field8332];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field8327 : field8332;
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
            int var25 = class131.method739(var17 - 1, 4);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class113.method677(-29, var25, var26);
            }
            if (var1 == 0) {
                field8343 = var18;
                field8346 = var20;
                field8348 = var22;
                field8339 = var24;
            } else {
                field8335 = var18;
                field8329 = var20;
                field8345 = var22;
                field8341 = var24;
            }
        }
        int var2 = method3318(8) + 1;
        field8336 = new class477[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field8336[var3] = new class477();
        }
        int var4 = method3318(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method3318(16);
        }
        int var6 = method3318(6) + 1;
        field8328 = new class214[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field8328[var7] = new class214();
        }
        int var8 = method3318(6) + 1;
        field8337 = new class149[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field8337[var9] = new class149();
        }
        int var10 = method3318(6) + 1;
        field8330 = new class20[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field8330[var11] = new class20();
        }
        int var12 = method3318(6) + 1;
        field8352 = new boolean[var12];
        field8355 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field8352[var13] = method3309() != 0;
            method3318(16);
            method3318(16);
            field8355[var13] = method3318(8);
        }
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "()V", line = 769)
    public static void method3317() {
        field8331 = null;
        field8336 = null;
        field8328 = null;
        field8337 = null;
        field8330 = null;
        field8352 = null;
        field8355 = null;
        field8351 = null;
        field8343 = null;
        field8346 = null;
        field8348 = null;
        field8335 = null;
        field8329 = null;
        field8345 = null;
        field8339 = null;
        field8341 = null;
    }

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "(I)I", line = 790)
    public static final int method3318(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field8338) {
            int var4 = 8 - field8338;
            int var5 = (0x1 << var4) - 1;
            var1 += (field8331[field8357] >> field8338 & var5) << var2;
            field8338 = 0;
            field8357++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field8331[field8357] >> field8338 & var3) << var2;
            field8338 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "([B)V", line = 816)
    private class568(byte[] arg0) {
        this.method3311(arg0);
    }
}
