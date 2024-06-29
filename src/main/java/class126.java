import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class126 extends class166 {

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "Z")
    private static boolean field2579 = false;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    private int field2564;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    private int field2565;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
    private int field2566;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
    private int field2570;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
    private static int field2572;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "I")
    private static int field2573;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "I")
    private int field2574;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "I")
    private int field2575;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "I")
    private static int field2583;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
    private int field2584;

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "I")
    private static int field2589;

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "I")
    private int field2590;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "Z")
    private boolean field2560;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "Z")
    private boolean field2578;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "[B")
    private static byte[] field2580;

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "[B")
    private byte[] field2586;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "[F")
    private static float[] field2557;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "[F")
    private static float[] field2558;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "[F")
    private static float[] field2559;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "[F")
    private float[] field2569;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "[F")
    private static float[] field2571;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "[F")
    private static float[] field2581;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "[F")
    private static float[] field2582;

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "[F")
    private static float[] field2588;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "[I")
    private static int[] field2562;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "[I")
    private static int[] field2576;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "[I")
    private static int[] field2585;

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "[Lo;")
    private static class125[] field2587;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "[Lsc;")
    private static class164[] field2563;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "[Ltc;")
    private static class173[] field2561;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "[Lvg;")
    public static class195[] field2577;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "[Z")
    private static boolean[] field2567;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "[[B")
    private byte[][] field2568;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()I")
    public static final int method767() {
        int var0 = field2580[field2583] >> field2589 & 0x1;
        field2589++;
        field2583 += field2589 >> 3;
        field2589 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)[F")
    private final float[] method768(int arg0) {
        method769(this.field2568[arg0], 0);
        method767();
        int var2 = method776(class108.method704(field2576.length - 1, 92));
        boolean var3 = field2567[var2];
        int var4 = var3 ? field2572 : field2573;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method767() != 0;
            var6 = method767() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2573 >> 2);
            var9 = (field2573 >> 2) + (var4 >> 2);
            var10 = field2573 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2573 >> 2);
            var12 = (field2573 >> 2) + (var4 - (var4 >> 2));
            var13 = field2573 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class125 var14 = field2587[field2576[var2]];
        int var15 = var14.field2554;
        int var16 = var14.field2556[var15];
        boolean var17 = !field2561[var16].method1093();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2555; var19++) {
            class164 var95 = field2563[var14.field2553[var19]];
            float[] var96 = field2559;
            var95.method1005(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2554;
            int var21 = var14.field2556[var20];
            field2561[var21].method1089(field2559, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2559[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2559;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2558 : field2557;
            float[] var30 = var3 ? field2582 : field2571;
            float[] var31 = var3 ? field2581 : field2588;
            int[] var32 = var3 ? field2562 : field2585;
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
            int var35 = class108.method704(var4 - 1, -70);
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
                field2559[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2559[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2566 > 0) {
            int var49 = this.field2566 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2578) {
                for (int var50 = 0; var50 < this.field2565; var50++) {
                    int var51 = (this.field2566 >> 1) + var50;
                    var48[var50] += this.field2569[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2559[var52];
                }
            }
        }
        float[] var54 = this.field2569;
        this.field2569 = field2559;
        field2559 = var54;
        this.field2566 = var4;
        this.field2565 = var12 - (var4 >> 1);
        this.field2578 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([BI)V")
    private static final void method769(byte[] arg0, int arg1) {
        field2580 = arg0;
        field2583 = arg1;
        field2589 = 0;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)F")
    public static final float method770(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([B)V")
    private final void method771(byte[] arg0) {
        class189 var2 = new class189(arg0);
        this.field2564 = var2.method1190(-4);
        this.field2570 = var2.method1190(-4);
        this.field2574 = var2.method1190(-4);
        this.field2575 = var2.method1190(-4);
        if (this.field2575 < 0) {
            this.field2575 = ~this.field2575;
            this.field2560 = true;
        }
        int var3 = var2.method1190(-4);
        this.field2568 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1202(103);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1214(var5, -1, 0, var7);
            this.field2568[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "([B)V")
    private static final void method772(byte[] arg0) {
        method769(arg0, 0);
        field2573 = 0x1 << method776(4);
        field2572 = 0x1 << method776(4);
        field2559 = new float[field2572];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2573 : field2572;
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
            int var25 = class108.method704(var17 - 1, -109);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class162.method999(-24285, var26, var25);
            }
            if (var1 == 0) {
                field2557 = var18;
                field2571 = var20;
                field2588 = var22;
                field2585 = var24;
            } else {
                field2558 = var18;
                field2582 = var20;
                field2581 = var22;
                field2562 = var24;
            }
        }
        int var2 = method776(8) + 1;
        field2577 = new class195[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2577[var3] = new class195();
        }
        int var4 = method776(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method776(16);
        }
        int var6 = method776(6) + 1;
        field2561 = new class173[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2561[var7] = new class173();
        }
        int var8 = method776(6) + 1;
        field2563 = new class164[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2563[var9] = new class164();
        }
        int var10 = method776(6) + 1;
        field2587 = new class125[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2587[var11] = new class125();
        }
        int var12 = method776(6) + 1;
        field2567 = new boolean[var12];
        field2576 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2567[var13] = method767() != 0;
            method776(16);
            method776(16);
            field2576[var13] = method776(8);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()V")
    public static void method773() {
        field2580 = null;
        field2577 = null;
        field2561 = null;
        field2563 = null;
        field2587 = null;
        field2567 = null;
        field2576 = null;
        field2559 = null;
        field2557 = null;
        field2571 = null;
        field2588 = null;
        field2558 = null;
        field2582 = null;
        field2581 = null;
        field2585 = null;
        field2562 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)Ljc;")
    public final class83 method774(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2586 == null) {
            this.field2566 = 0;
            this.field2569 = new float[field2572];
            this.field2586 = new byte[this.field2570];
            this.field2590 = 0;
            this.field2584 = 0;
        }
        while (this.field2584 < this.field2568.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method768(this.field2584);
            if (var3 != null) {
                int var4 = this.field2590;
                int var5 = var3.length;
                if (var5 > this.field2570 - var4) {
                    var5 = this.field2570 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2586[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2590;
                }
                this.field2590 = var4;
            }
            this.field2584++;
        }
        this.field2569 = null;
        byte[] var2 = this.field2586;
        this.field2586 = null;
        return new class83(this.field2564, var2, this.field2574, this.field2575, this.field2560);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lkh;)Z")
    private static final boolean method775(class97 arg0) {
        if (!field2579) {
            byte[] var1 = arg0.method651(4, 0, 0);
            if (var1 == null) {
                return false;
            }
            method772(var1);
            field2579 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)I")
    public static final int method776(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2589) {
            int var4 = 8 - field2589;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2580[field2583] >> field2589 & var5) << var2;
            field2589 = 0;
            field2583++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2580[field2583] >> field2589 & var3) << var2;
            field2589 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "([B)V")
    private class126(byte[] arg0) {
        this.method771(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lkh;II)Loa;")
    public static final class126 method777(class97 arg0, int arg1, int arg2) {
        if (method775(arg0)) {
            byte[] var3 = arg0.method651(4, arg2, arg1);
            return var3 == null ? null : new class126(var3);
        } else {
            arg0.method639(arg1, 0, arg2);
            return null;
        }
    }
}
