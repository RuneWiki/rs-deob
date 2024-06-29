import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class170 extends class431 {

    @OriginalMember(owner = "client!ok", name = "I", descriptor = "Z")
    private static boolean field2528 = false;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    private static int field2506;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    private int field2507;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
    private static int field2510;

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "I")
    private int field2517;

    @OriginalMember(owner = "client!ok", name = "A", descriptor = "I")
    private static int field2520;

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "I")
    private int field2521;

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "I")
    private int field2525;

    @OriginalMember(owner = "client!ok", name = "H", descriptor = "I")
    private int field2527;

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
    private static int field2529;

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "I")
    private int field2532;

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "I")
    private int field2533;

    @OriginalMember(owner = "client!ok", name = "P", descriptor = "I")
    private int field2535;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Z")
    private boolean field2504;

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "Z")
    private boolean field2518;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "[B")
    private static byte[] field2515;

    @OriginalMember(owner = "client!ok", name = "Q", descriptor = "[B")
    private byte[] field2536;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "[F")
    private static float[] field2505;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "[F")
    private static float[] field2508;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "[F")
    private static float[] field2509;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "[F")
    private static float[] field2513;

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "[F")
    private static float[] field2514;

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "[F")
    private static float[] field2523;

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "[F")
    private float[] field2524;

    @OriginalMember(owner = "client!ok", name = "R", descriptor = "[F")
    private static float[] field2537;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "[I")
    private static int[] field2511;

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "[I")
    private static int[] field2522;

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "[I")
    private static int[] field2531;

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "[Ldh;")
    private static class212[] field2534;

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "[Lj;")
    public static class381[] field2519;

    @OriginalMember(owner = "client!ok", name = "G", descriptor = "[Lfs;")
    private static class391[] field2526;

    @OriginalMember(owner = "client!ok", name = "K", descriptor = "[Lai;")
    private static class427[] field2530;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "[Z")
    private static boolean[] field2516;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "[[B")
    private byte[][] field2512;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)[F", line = 4)
    private final float[] method1134(int arg0) {
        method1135(this.field2512[arg0], 0);
        method1141();
        int var2 = method1145(class297.method1928(99, field2522.length - 1));
        boolean var3 = field2516[var2];
        int var4 = var3 ? field2510 : field2529;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1141() != 0;
            var6 = method1141() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2529 >> 2);
            var9 = (field2529 >> 2) + (var4 >> 2);
            var10 = field2529 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2529 >> 2);
            var12 = (field2529 >> 2) + (var4 - (var4 >> 2));
            var13 = field2529 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class391 var14 = field2526[field2522[var2]];
        int var15 = var14.field5850;
        int var16 = var14.field5851[var15];
        boolean var17 = !field2534[var16].method1475();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field5848; var19++) {
            class427 var95 = field2530[var14.field5849[var19]];
            float[] var96 = field2514;
            var95.method2666(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field5850;
            int var21 = var14.field5851[var20];
            field2534[var21].method1473(field2514, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2514[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2514;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2505 : field2537;
            float[] var30 = var3 ? field2509 : field2523;
            float[] var31 = var3 ? field2513 : field2508;
            int[] var32 = var3 ? field2531 : field2511;
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
            int var35 = class297.method1928(124, var4 - 1);
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
                field2514[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2514[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2517 > 0) {
            int var49 = this.field2517 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2518) {
                for (int var50 = 0; var50 < this.field2527; var50++) {
                    int var51 = (this.field2517 >> 1) + var50;
                    var48[var50] += this.field2524[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2514[var52];
                }
            }
        }
        float[] var54 = this.field2524;
        this.field2524 = field2514;
        field2514 = var54;
        this.field2517 = var4;
        this.field2527 = var12 - (var4 >> 1);
        this.field2518 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([BI)V", line = 417)
    private static final void method1135(byte[] arg0, int arg1) {
        field2515 = arg0;
        field2506 = arg1;
        field2520 = 0;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([I)Lfv;", line = 429)
    public final class79 method1136(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2536 == null) {
            this.field2517 = 0;
            this.field2524 = new float[field2510];
            this.field2536 = new byte[this.field2525];
            this.field2535 = 0;
            this.field2533 = 0;
        }
        while (this.field2533 < this.field2512.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1134(this.field2533);
            if (var3 != null) {
                int var4 = this.field2535;
                int var5 = var3.length;
                if (var5 > this.field2525 - var4) {
                    var5 = this.field2525 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2536[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2535;
                }
                this.field2535 = var4;
            }
            this.field2533++;
        }
        this.field2524 = null;
        byte[] var2 = this.field2536;
        this.field2536 = null;
        return new class79(this.field2507, var2, this.field2532, this.field2521, this.field2504);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lul;)Z", line = 488)
    private static final boolean method1137(class406 arg0) {
        if (!field2528) {
            byte[] var1 = arg0.method2536(0, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1142(var1);
            field2528 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "(I)F", line = 509)
    public static final float method1138(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "()V", line = 520)
    public static void method1139() {
        field2515 = null;
        field2519 = null;
        field2534 = null;
        field2530 = null;
        field2526 = null;
        field2516 = null;
        field2522 = null;
        field2514 = null;
        field2537 = null;
        field2523 = null;
        field2508 = null;
        field2505 = null;
        field2509 = null;
        field2513 = null;
        field2511 = null;
        field2531 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([B)V", line = 542)
    private final void method1140(byte[] arg0) {
        class217 var2 = new class217(arg0);
        this.field2507 = var2.method1556(100);
        this.field2525 = var2.method1556(108);
        this.field2532 = var2.method1556(120);
        this.field2521 = var2.method1556(119);
        if (this.field2521 < 0) {
            this.field2521 = ~this.field2521;
            this.field2504 = true;
        }
        int var3 = var2.method1556(100);
        this.field2512 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1515((byte) 124);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1540(0, var7, var5, 96);
            this.field2512[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "()I", line = 586)
    public static final int method1141() {
        int var0 = field2515[field2506] >> field2520 & 0x1;
        field2520++;
        field2506 += field2520 >> 3;
        field2520 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "([B)V", line = 597)
    private static final void method1142(byte[] arg0) {
        method1135(arg0, 0);
        field2529 = 0x1 << method1145(4);
        field2510 = 0x1 << method1145(4);
        field2514 = new float[field2510];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2529 : field2510;
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
            int var25 = class297.method1928(-96, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class49.method484(-67, var25, var26);
            }
            if (var1 == 0) {
                field2537 = var18;
                field2523 = var20;
                field2508 = var22;
                field2511 = var24;
            } else {
                field2505 = var18;
                field2509 = var20;
                field2513 = var22;
                field2531 = var24;
            }
        }
        int var2 = method1145(8) + 1;
        field2519 = new class381[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2519[var3] = new class381();
        }
        int var4 = method1145(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1145(16);
        }
        int var6 = method1145(6) + 1;
        field2534 = new class212[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2534[var7] = new class212();
        }
        int var8 = method1145(6) + 1;
        field2530 = new class427[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2530[var9] = new class427();
        }
        int var10 = method1145(6) + 1;
        field2526 = new class391[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2526[var11] = new class391();
        }
        int var12 = method1145(6) + 1;
        field2516 = new boolean[var12];
        field2522 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2516[var13] = method1141() != 0;
            method1145(16);
            method1145(16);
            field2522[var13] = method1145(8);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lul;II)Lok;", line = 750)
    public static final class170 method1143(class406 arg0, int arg1, int arg2) {
        if (method1137(arg0)) {
            byte[] var3 = arg0.method2536(arg1, 0, arg2);
            return var3 == null ? null : new class170(var3);
        } else {
            arg0.method2549(arg2, true, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lul;I)Lok;", line = 764)
    public static final class170 method1144(class406 arg0, int arg1) {
        if (method1137(arg0)) {
            byte[] var2 = arg0.method2558(arg1, 67);
            return var2 == null ? null : new class170(var2);
        } else {
            arg0.method2556((byte) 21, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "([B)V", line = 783)
    private class170(byte[] arg0) {
        this.method1140(arg0);
    }

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "(I)I", line = 796)
    public static final int method1145(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2520) {
            int var4 = 8 - field2520;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2515[field2506] >> field2520 & var5) << var2;
            field2520 = 0;
            field2506++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2515[field2506] >> field2520 & var3) << var2;
            field2520 += arg0;
        }
        return var1;
    }
}
