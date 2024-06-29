import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class136 extends class132 {

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "Z")
    private static boolean field2636 = false;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "I")
    private static int field2618;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "I")
    private int field2619;

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "I")
    private int field2629;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "I")
    private int field2632;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "I")
    private int field2633;

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "I")
    private static int field2634;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
    private int field2635;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "I")
    private static int field2638;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
    private int field2640;

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "I")
    private static int field2642;

    @OriginalMember(owner = "client!mh", name = "W", descriptor = "I")
    private int field2644;

    @OriginalMember(owner = "client!mh", name = "Y", descriptor = "I")
    private int field2646;

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "Z")
    private boolean field2623;

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "Z")
    private boolean field2627;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "[B")
    private static byte[] field2637;

    @OriginalMember(owner = "client!mh", name = "V", descriptor = "[B")
    private byte[] field2643;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "[F")
    private static float[] field2614;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "[F")
    private float[] field2615;

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "[F")
    private static float[] field2620;

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "[F")
    private static float[] field2626;

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "[F")
    private static float[] field2630;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "[F")
    private static float[] field2631;

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "[F")
    private static float[] field2639;

    @OriginalMember(owner = "client!mh", name = "X", descriptor = "[F")
    private static float[] field2645;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "[I")
    private static int[] field2616;

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "[I")
    private static int[] field2621;

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "[I")
    private static int[] field2628;

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "[Lb;")
    private static class12[] field2624;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "[Lqb;")
    private static class170[] field2641;

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "[Laa;")
    private static class2[] field2622;

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "[Lea;")
    public static class45[] field2625;

    @OriginalMember(owner = "client!mh", name = "Z", descriptor = "[Z")
    private static boolean[] field2647;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "[[B")
    private byte[][] field2617;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)F")
    public static final float method854(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(I)I")
    public static final int method855(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2638) {
            int var4 = 8 - field2638;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2637[field2642] >> field2638 & var5) << var2;
            field2638 = 0;
            field2642++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2637[field2642] >> field2638 & var3) << var2;
            field2638 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([B)V")
    private final void method856(byte[] arg0) {
        class109 var2 = new class109(arg0);
        this.field2635 = var2.method710(28908);
        this.field2632 = var2.method710(28908);
        this.field2619 = var2.method710(28908);
        this.field2640 = var2.method710(28908);
        if (this.field2640 < 0) {
            this.field2640 = ~this.field2640;
            this.field2623 = true;
        }
        int var3 = var2.method710(28908);
        this.field2617 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method662((byte) -92);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method669(0, 0, var5, var7);
            this.field2617[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lab;II)Lmh;")
    public static final class136 method857(class3 arg0, int arg1, int arg2) {
        if (method859(arg0)) {
            byte[] var3 = arg0.method33(-29616, arg1, arg2);
            return var3 == null ? null : new class136(var3);
        } else {
            arg0.method15(arg2, arg1, (byte) 118);
            return null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "()V")
    public static void method858() {
        field2637 = null;
        field2625 = null;
        field2622 = null;
        field2641 = null;
        field2624 = null;
        field2647 = null;
        field2616 = null;
        field2645 = null;
        field2614 = null;
        field2620 = null;
        field2639 = null;
        field2626 = null;
        field2631 = null;
        field2630 = null;
        field2621 = null;
        field2628 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lab;)Z")
    private static final boolean method859(class3 arg0) {
        if (!field2636) {
            byte[] var1 = arg0.method33(-29616, 0, 0);
            if (var1 == null) {
                return false;
            }
            method860(var1);
            field2636 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "([B)V")
    private static final void method860(byte[] arg0) {
        method862(arg0, 0);
        field2618 = 0x1 << method855(4);
        field2634 = 0x1 << method855(4);
        field2645 = new float[field2634];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2618 : field2634;
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
            int var25 = class128.method808(var17 - 1, 0);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class200.method1278((byte) 5, var25, var26);
            }
            if (var1 == 0) {
                field2614 = var18;
                field2620 = var20;
                field2639 = var22;
                field2621 = var24;
            } else {
                field2626 = var18;
                field2631 = var20;
                field2630 = var22;
                field2628 = var24;
            }
        }
        int var2 = method855(8) + 1;
        field2625 = new class45[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2625[var3] = new class45();
        }
        int var4 = method855(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method855(16);
        }
        int var6 = method855(6) + 1;
        field2622 = new class2[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2622[var7] = new class2();
        }
        int var8 = method855(6) + 1;
        field2641 = new class170[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2641[var9] = new class170();
        }
        int var10 = method855(6) + 1;
        field2624 = new class12[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2624[var11] = new class12();
        }
        int var12 = method855(6) + 1;
        field2647 = new boolean[var12];
        field2616 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2647[var13] = method863() != 0;
            method855(16);
            method855(16);
            field2616[var13] = method855(8);
        }
    }

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "(I)[F")
    private final float[] method861(int arg0) {
        method862(this.field2617[arg0], 0);
        method863();
        int var2 = method855(class128.method808(field2616.length - 1, 0));
        boolean var3 = field2647[var2];
        int var4 = var3 ? field2634 : field2618;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method863() != 0;
            var6 = method863() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2618 >> 2);
            var9 = (field2618 >> 2) + (var4 >> 2);
            var10 = field2618 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2618 >> 2);
            var12 = (field2618 >> 2) + (var4 - (var4 >> 2));
            var13 = field2618 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class12 var14 = field2624[field2616[var2]];
        int var15 = var14.field220;
        int var16 = var14.field221[var15];
        boolean var17 = !field2622[var16].method6();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field223; var19++) {
            class170 var95 = field2641[var14.field222[var19]];
            float[] var96 = field2645;
            var95.method1086(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field220;
            int var21 = var14.field221[var20];
            field2622[var21].method11(field2645, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2645[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2645;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2626 : field2614;
            float[] var30 = var3 ? field2631 : field2620;
            float[] var31 = var3 ? field2630 : field2639;
            int[] var32 = var3 ? field2628 : field2621;
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
            int var35 = class128.method808(var4 - 1, 0);
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
                field2645[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2645[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2629 > 0) {
            int var49 = this.field2629 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2627) {
                for (int var50 = 0; var50 < this.field2633; var50++) {
                    int var51 = (this.field2629 >> 1) + var50;
                    var48[var50] += this.field2615[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2645[var52];
                }
            }
        }
        float[] var54 = this.field2615;
        this.field2615 = field2645;
        field2645 = var54;
        this.field2629 = var4;
        this.field2633 = var12 - (var4 >> 1);
        this.field2627 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([BI)V")
    private static final void method862(byte[] arg0, int arg1) {
        field2637 = arg0;
        field2642 = arg1;
        field2638 = 0;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "()I")
    public static final int method863() {
        int var0 = field2637[field2642] >> field2638 & 0x1;
        field2638++;
        field2642 += field2638 >> 3;
        field2638 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([I)Lqc;")
    public final class171 method864(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2643 == null) {
            this.field2629 = 0;
            this.field2615 = new float[field2634];
            this.field2643 = new byte[this.field2632];
            this.field2646 = 0;
            this.field2644 = 0;
        }
        while (this.field2644 < this.field2617.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method861(this.field2644);
            if (var3 != null) {
                int var4 = this.field2646;
                int var5 = var3.length;
                if (var5 > this.field2632 - var4) {
                    var5 = this.field2632 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2643[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2646;
                }
                this.field2646 = var4;
            }
            this.field2644++;
        }
        this.field2615 = null;
        byte[] var2 = this.field2643;
        this.field2643 = null;
        return new class171(this.field2635, var2, this.field2619, this.field2640, this.field2623);
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "([B)V")
    private class136(byte[] arg0) {
        this.method856(arg0);
    }
}
