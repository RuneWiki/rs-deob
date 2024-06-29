import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class144 extends class25 {

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "Z")
    private static boolean field2529 = false;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    private int field2525;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    private int field2531;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    private static int field2532;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    private static int field2534;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
    private static int field2539;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
    private static int field2543;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    private int field2545;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    private int field2546;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    private int field2549;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
    private int field2554;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
    private int field2555;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "I")
    private int field2556;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "Z")
    private boolean field2540;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "Z")
    private boolean field2550;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "[B")
    private static byte[] field2542;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "[B")
    private byte[] field2557;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "[F")
    private static float[] field2524;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "[F")
    private static float[] field2526;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "[F")
    private float[] field2527;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "[F")
    private static float[] field2541;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "[F")
    private static float[] field2544;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "[F")
    private static float[] field2551;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "[F")
    private static float[] field2552;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "[F")
    private static float[] field2553;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "[I")
    private static int[] field2528;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "[I")
    private static int[] field2535;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "[I")
    private static int[] field2547;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "[Lvj;")
    public static class100[] field2533;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "[Lmi;")
    private static class257[] field2548;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "[Lc;")
    private static class293[] field2536;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "[Lcj;")
    private static class305[] field2537;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "[Z")
    private static boolean[] field2538;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "[[B")
    private byte[][] field2530;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)I", line = 9)
    public static final int method1021(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2539) {
            int var3 = 8 - field2539;
            int var4 = (0x1 << var3) - 1;
            var1 += (field2542[field2543] >> field2539 & var4) << var2;
            field2539 = 0;
            field2543++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field2542[field2543] >> field2539 & var5) << var2;
            field2539 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([BI)V", line = 45)
    private static final void method1022(byte[] arg0, int arg1) {
        field2542 = arg0;
        field2543 = arg1;
        field2539 = 0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()I", line = 51)
    public static final int method1023() {
        int var0 = field2542[field2543] >> field2539 & 0x1;
        field2539++;
        field2543 += field2539 >> 3;
        field2539 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)[F", line = 60)
    private final float[] method1024(int arg0) {
        method1022(this.field2530[arg0], 0);
        method1023();
        int var2 = method1021(class213.method1501(-10189, field2547.length - 1));
        boolean var3 = field2538[var2];
        int var4 = var3 ? field2534 : field2532;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1023() != 0;
            var6 = method1023() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2532 >> 2);
            var9 = (field2532 >> 2) + (var4 >> 2);
            var10 = field2532 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2532 >> 2);
            var12 = (field2532 >> 2) + (var4 - (var4 >> 2));
            var13 = field2532 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class293 var14 = field2536[field2547[var2]];
        int var15 = var14.field5047;
        int var16 = var14.field5046[var15];
        boolean var17 = !field2548[var16].method1823();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field5049; var19++) {
            class305 var20 = field2537[var14.field5048[var19]];
            float[] var21 = field2541;
            var20.method2129(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field5047;
            int var23 = var14.field5046[var22];
            field2548[var23].method1830(field2541, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field2541[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field2541;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field2551 : field2553;
            float[] var32 = var3 ? field2526 : field2524;
            float[] var33 = var3 ? field2552 : field2544;
            int[] var34 = var3 ? field2535 : field2528;
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
            int var47 = class213.method1501(-10189, var4 - 1);
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
                field2541[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2541[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field2531 > 0) {
            int var91 = this.field2531 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field2550) {
                for (int var92 = 0; var92 < this.field2549; var92++) {
                    int var93 = (this.field2531 >> 1) + var92;
                    var90[var92] += this.field2527[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field2541[var94];
                }
            }
        }
        float[] var96 = this.field2527;
        this.field2527 = field2541;
        field2541 = var96;
        this.field2531 = var4;
        this.field2549 = var12 - (var4 >> 1);
        this.field2550 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lqm;II)Lge;", line = 472)
    public static final class144 method1025(class222 arg0, int arg1, int arg2) {
        if (method1031(arg0)) {
            byte[] var3 = arg0.method1580(0, arg2, arg1);
            return var3 == null ? null : new class144(var3);
        } else {
            arg0.method1584(arg2, arg1, (byte) -71);
            return null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([B)V", line = 493)
    private static final void method1026(byte[] arg0) {
        method1022(arg0, 0);
        field2532 = 0x1 << method1021(4);
        field2534 = 0x1 << method1021(4);
        field2541 = new float[field2534];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field2532 : field2534;
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
            int var13 = class213.method1501(-10189, var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class135.method963(var14, var13, -127);
            }
            if (var1 == 0) {
                field2553 = var6;
                field2524 = var8;
                field2544 = var10;
                field2528 = var12;
            } else {
                field2551 = var6;
                field2526 = var8;
                field2552 = var10;
                field2535 = var12;
            }
        }
        int var15 = method1021(8) + 1;
        field2533 = new class100[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field2533[var16] = new class100();
        }
        int var17 = method1021(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method1021(16);
        }
        int var19 = method1021(6) + 1;
        field2548 = new class257[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field2548[var20] = new class257();
        }
        int var21 = method1021(6) + 1;
        field2537 = new class305[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field2537[var22] = new class305();
        }
        int var23 = method1021(6) + 1;
        field2536 = new class293[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field2536[var24] = new class293();
        }
        int var25 = method1021(6) + 1;
        field2538 = new boolean[var25];
        field2547 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field2538[var26] = method1023() != 0;
            method1021(16);
            method1021(16);
            field2547[var26] = method1021(8);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "([B)V", line = 645)
    private final void method1027(byte[] arg0) {
        class13 var2 = new class13(arg0);
        this.field2554 = var2.method105((byte) 105);
        this.field2545 = var2.method105((byte) 92);
        this.field2525 = var2.method105((byte) 62);
        this.field2546 = var2.method105((byte) 54);
        if (this.field2546 < 0) {
            this.field2546 = ~this.field2546;
            this.field2540 = true;
        }
        int var3 = var2.method105((byte) 40);
        this.field2530 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method152((byte) -92);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method148(var7, -2, 0, var5);
            this.field2530[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([I)Lbe;", line = 691)
    public final class286 method1028(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2557 == null) {
            this.field2531 = 0;
            this.field2527 = new float[field2534];
            this.field2557 = new byte[this.field2545];
            this.field2556 = 0;
            this.field2555 = 0;
        }
        while (this.field2555 < this.field2530.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1024(this.field2555);
            if (var2 != null) {
                int var3 = this.field2556;
                int var4 = var2.length;
                if (var4 > this.field2545 - var3) {
                    var4 = this.field2545 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field2557[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field2556;
                }
                this.field2556 = var3;
            }
            this.field2555++;
        }
        this.field2527 = null;
        byte[] var7 = this.field2557;
        this.field2557 = null;
        return new class286(this.field2554, var7, this.field2525, this.field2546, this.field2540);
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)F", line = 750)
    public static final float method1029(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "()V", line = 761)
    public static void method1030() {
        field2542 = null;
        field2533 = null;
        field2548 = null;
        field2537 = null;
        field2536 = null;
        field2538 = null;
        field2547 = null;
        field2541 = null;
        field2553 = null;
        field2524 = null;
        field2544 = null;
        field2551 = null;
        field2526 = null;
        field2552 = null;
        field2528 = null;
        field2535 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lqm;)Z", line = 779)
    private static final boolean method1031(class222 arg0) {
        if (!field2529) {
            byte[] var1 = arg0.method1580(0, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1026(var1);
            field2529 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "([B)V", line = 803)
    private class144(byte[] arg0) {
        this.method1027(arg0);
    }
}
