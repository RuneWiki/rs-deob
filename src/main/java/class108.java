import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class108 {

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "Z")
    private static boolean field2569 = false;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    private static int field2563;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    private static int field2567;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    private static int field2572;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    private int field2573;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    private int field2574;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    private int field2578;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    private static int field2579;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    private static int field2582;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    private int field2584;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    private static int field2591;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "Z")
    private boolean field2577;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "Z")
    private static boolean field2585;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "[B")
    private static byte[] field2588;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "[F")
    private static float[] field2564;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "[F")
    private static float[] field2568;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "[F")
    private static float[] field2575;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "[F")
    private static float[] field2576;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "[F")
    private static float[] field2580;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "[F")
    private static float[] field2581;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "[F")
    private static float[] field2583;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "[F")
    private static float[] field2589;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "[I")
    private static int[] field2561;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "[I")
    private static int[] field2562;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "[I")
    private static int[] field2587;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "[Lbb;")
    public static class10[] field2565;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "[Lbc;")
    private static class11[] field2566;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "[Lvb;")
    private static class145[] field2571;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "[Lhe;")
    private static class54[] field2586;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "[Z")
    private static boolean[] field2590;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "[[B")
    private byte[][] field2570;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([B)V")
    private static final void method811(byte[] arg0) {
        method818(arg0, 0);
        field2572 = 0x1 << method814(4);
        field2582 = 0x1 << method814(4);
        field2575 = new float[field2582];
        field2589 = new float[field2582];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2572 : field2582;
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
            int var25 = class117.method938(var17 - 1, (byte) -98);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class66.method470(-58, var25, var26);
            }
            if (var1 == 0) {
                field2583 = var18;
                field2564 = var20;
                field2568 = var22;
                field2562 = var24;
            } else {
                field2581 = var18;
                field2576 = var20;
                field2580 = var22;
                field2561 = var24;
            }
        }
        int var2 = method814(8) + 1;
        field2565 = new class10[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2565[var3] = new class10();
        }
        int var4 = method814(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method814(16);
        }
        int var6 = method814(6) + 1;
        field2586 = new class54[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2586[var7] = new class54();
        }
        int var8 = method814(6) + 1;
        field2571 = new class145[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2571[var9] = new class145();
        }
        int var10 = method814(6) + 1;
        field2566 = new class11[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2566[var11] = new class11();
        }
        int var12 = method814(6) + 1;
        field2590 = new boolean[var12];
        field2587 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2590[var13] = method812() != 0;
            method814(16);
            method814(16);
            field2587[var13] = method814(8);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "()I")
    public static final int method812() {
        int var0 = field2588[field2579] >> field2591 & 0x1;
        field2591++;
        field2579 += field2591 >> 3;
        field2591 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "()V")
    public static void method813() {
        field2588 = null;
        field2565 = null;
        field2586 = null;
        field2571 = null;
        field2566 = null;
        field2590 = null;
        field2587 = null;
        field2589 = null;
        field2575 = null;
        field2583 = null;
        field2564 = null;
        field2568 = null;
        field2581 = null;
        field2576 = null;
        field2580 = null;
        field2562 = null;
        field2561 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)I")
    public static final int method814(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2591) {
            int var4 = 8 - field2591;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2588[field2579] >> field2591 & var5) << var2;
            field2591 = 0;
            field2579++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2588[field2579] >> field2591 & var3) << var2;
            field2591 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "([B)V")
    private final void method815(byte[] arg0) {
        class77 var2 = new class77(arg0);
        this.field2573 = var2.method554((byte) 109);
        this.field2574 = var2.method554((byte) 94);
        this.field2578 = var2.method554((byte) 93);
        this.field2584 = var2.method554((byte) -117);
        if (this.field2584 < 0) {
            this.field2584 = ~this.field2584;
            this.field2577 = true;
        }
        int var3 = var2.method554((byte) 79);
        this.field2570 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method570((byte) 123);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method575(0, var7, 15162, var5);
            this.field2570[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljb;II)Lpd;")
    public static final class108 method816(class64 arg0, int arg1, int arg2) {
        if (method817(arg0)) {
            byte[] var3 = arg0.method458(false, arg2, arg1);
            return var3 == null ? null : new class108(var3);
        } else {
            arg0.method445(arg1, -111, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljb;)Z")
    private static final boolean method817(class64 arg0) {
        if (!field2569) {
            byte[] var1 = arg0.method458(false, 0, 0);
            if (var1 == null) {
                return false;
            }
            method811(var1);
            field2569 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([BI)V")
    private static final void method818(byte[] arg0, int arg1) {
        field2588 = arg0;
        field2579 = arg1;
        field2591 = 0;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "()Lfc;")
    public final class39 method819() {
        field2567 = 0;
        byte[] var1 = new byte[this.field2574];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2570.length; var3++) {
            float[] var4 = this.method821(var3);
            if (var4 != null) {
                int var5 = var4.length;
                if (var5 > this.field2574 - var2) {
                    var5 = this.field2574 - var2;
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
        return new class39(this.field2573, var1, this.field2578, this.field2584, this.field2577);
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "([B)V")
    private class108(byte[] arg0) {
        this.method815(arg0);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)F")
    public static final float method820(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)[F")
    private final float[] method821(int arg0) {
        method818(this.field2570[arg0], 0);
        method812();
        int var2 = method814(class117.method938(field2587.length - 1, (byte) -98));
        boolean var3 = field2590[var2];
        int var4 = var3 ? field2582 : field2572;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method812() != 0;
            var6 = method812() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2572 >> 2);
            var9 = (field2572 >> 2) + (var4 >> 2);
            var10 = field2572 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2572 >> 2);
            var12 = (field2572 >> 2) + (var4 - (var4 >> 2));
            var13 = field2572 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class11 var14 = field2566[field2587[var2]];
        int var15 = var14.field161;
        int var16 = var14.field160[var15];
        boolean var17 = !field2586[var16].method398();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field159; var19++) {
            class145 var95 = field2571[var14.field162[var19]];
            float[] var96 = field2575;
            var95.method1170(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field161;
            int var21 = var14.field160[var20];
            field2586[var21].method402(field2575, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2575[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2575;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2581 : field2583;
            float[] var30 = var3 ? field2576 : field2564;
            float[] var31 = var3 ? field2580 : field2568;
            int[] var32 = var3 ? field2561 : field2562;
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
            int var35 = class117.method938(var4 - 1, (byte) -98);
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
                field2575[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2575[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (field2567 > 0) {
            int var49 = field2567 + var4 >> 2;
            var48 = new float[var49];
            if (!field2585) {
                for (int var50 = 0; var50 < field2563; var50++) {
                    int var51 = (field2567 >> 1) + var50;
                    var48[var50] += field2589[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2575[var52];
                }
            }
        }
        float[] var54 = field2589;
        field2589 = field2575;
        field2575 = var54;
        field2567 = var4;
        field2563 = var12 - (var4 >> 1);
        field2585 = var17;
        return var48;
    }
}
