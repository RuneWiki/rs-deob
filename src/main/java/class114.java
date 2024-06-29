import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class114 {

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "Z")
    private static boolean field2740 = false;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    private static int field2716;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    private static int field2718;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    private int field2722;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    private static int field2728;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    private int field2729;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    private static int field2731;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    private static int field2733;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
    private int field2735;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
    private int field2737;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
    private static int field2744;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "Z")
    private static boolean field2732;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "Z")
    private boolean field2736;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "[B")
    private static byte[] field2727;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "[F")
    private static float[] field2714;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "[F")
    private static float[] field2717;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "[F")
    private static float[] field2726;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "[F")
    private static float[] field2730;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "[F")
    private static float[] field2734;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "[F")
    private static float[] field2738;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "[F")
    private static float[] field2739;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "[F")
    private static float[] field2741;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "[I")
    private static int[] field2721;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "[I")
    private static int[] field2725;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "[I")
    private static int[] field2743;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "[Lp;")
    private static class100[] field2742;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "[Lrd;")
    private static class116[] field2724;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "[Leb;")
    private static class31[] field2723;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "[Lab;")
    public static class3[] field2720;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "[Z")
    private static boolean[] field2715;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "[[B")
    private byte[][] field2719;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([B)V")
    private static final void method931(byte[] arg0) {
        method938(arg0, 0);
        field2744 = 0x1 << method940(4);
        field2716 = 0x1 << method940(4);
        field2717 = new float[field2716];
        field2714 = new float[field2716];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2744 : field2716;
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
            int var25 = class94.method790(var17 - 1, 36);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class143.method1167((byte) -127, var26, var25);
            }
            if (var1 == 0) {
                field2738 = var18;
                field2730 = var20;
                field2726 = var22;
                field2725 = var24;
            } else {
                field2734 = var18;
                field2741 = var20;
                field2739 = var22;
                field2743 = var24;
            }
        }
        int var2 = method940(8) + 1;
        field2720 = new class3[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2720[var3] = new class3();
        }
        int var4 = method940(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method940(16);
        }
        int var6 = method940(6) + 1;
        field2742 = new class100[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2742[var7] = new class100();
        }
        int var8 = method940(6) + 1;
        field2723 = new class31[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2723[var9] = new class31();
        }
        int var10 = method940(6) + 1;
        field2724 = new class116[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2724[var11] = new class116();
        }
        int var12 = method940(6) + 1;
        field2715 = new boolean[var12];
        field2721 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2715[var13] = method932() != 0;
            method940(16);
            method940(16);
            field2721[var13] = method940(8);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "()I")
    public static final int method932() {
        int var0 = field2727[field2733] >> field2728 & 0x1;
        field2728++;
        field2733 += field2728 >> 3;
        field2728 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)[F")
    private final float[] method933(int arg0) {
        method938(this.field2719[arg0], 0);
        method932();
        int var2 = method940(class94.method790(field2721.length - 1, 36));
        boolean var3 = field2715[var2];
        int var4 = var3 ? field2716 : field2744;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method932() != 0;
            var6 = method932() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2744 >> 2);
            var9 = (field2744 >> 2) + (var4 >> 2);
            var10 = field2744 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2744 >> 2);
            var12 = (field2744 >> 2) + (var4 - (var4 >> 2));
            var13 = field2744 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class116 var14 = field2724[field2721[var2]];
        int var15 = var14.field2781;
        int var16 = var14.field2783[var15];
        boolean var17 = !field2742[var16].method822();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2782; var19++) {
            class31 var95 = field2723[var14.field2780[var19]];
            float[] var96 = field2717;
            var95.method229(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2781;
            int var21 = var14.field2783[var20];
            field2742[var21].method821(field2717, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2717[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2717;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2734 : field2738;
            float[] var30 = var3 ? field2741 : field2730;
            float[] var31 = var3 ? field2739 : field2726;
            int[] var32 = var3 ? field2743 : field2725;
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
            int var35 = class94.method790(var4 - 1, 36);
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
                field2717[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2717[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (field2731 > 0) {
            int var49 = field2731 + var4 >> 2;
            var48 = new float[var49];
            if (!field2732) {
                for (int var50 = 0; var50 < field2718; var50++) {
                    int var51 = (field2731 >> 1) + var50;
                    var48[var50] += field2714[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2717[var52];
                }
            }
        }
        float[] var54 = field2714;
        field2714 = field2717;
        field2717 = var54;
        field2731 = var4;
        field2718 = var12 - (var4 >> 1);
        field2732 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "([B)V")
    private final void method934(byte[] arg0) {
        class51 var2 = new class51(arg0);
        this.field2737 = var2.method399(-539722392);
        this.field2722 = var2.method399(-539722392);
        this.field2729 = var2.method399(-539722392);
        this.field2735 = var2.method399(-539722392);
        if (this.field2735 < 0) {
            this.field2735 = ~this.field2735;
            this.field2736 = true;
        }
        int var3 = var2.method399(-539722392);
        this.field2719 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method373(25094);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method398((byte) 63, var7, var5, 0);
            this.field2719[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "()V")
    public static void method935() {
        field2727 = null;
        field2720 = null;
        field2742 = null;
        field2723 = null;
        field2724 = null;
        field2715 = null;
        field2721 = null;
        field2714 = null;
        field2717 = null;
        field2738 = null;
        field2730 = null;
        field2726 = null;
        field2734 = null;
        field2741 = null;
        field2739 = null;
        field2725 = null;
        field2743 = null;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)F")
    public static final float method936(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "()Le;")
    public final class29 method937() {
        field2731 = 0;
        byte[] var1 = new byte[this.field2722];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2719.length; var3++) {
            float[] var4 = this.method933(var3);
            if (var4 != null) {
                int var5 = var4.length;
                if (var5 > this.field2722 - var2) {
                    var5 = this.field2722 - var2;
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
        return new class29(this.field2737, var1, this.field2729, this.field2735, this.field2736);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([BI)V")
    private static final void method938(byte[] arg0, int arg1) {
        field2727 = arg0;
        field2733 = arg1;
        field2728 = 0;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lsd;I)Lrb;")
    public static final class114 method939(class122 arg0, int arg1) {
        if (method941(arg0)) {
            byte[] var2 = arg0.method996(arg1, (byte) -78);
            return var2 == null ? null : new class114(var2);
        } else {
            arg0.method1012(0, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)I")
    public static final int method940(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2728) {
            int var4 = 8 - field2728;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2727[field2733] >> field2728 & var5) << var2;
            field2728 = 0;
            field2733++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2727[field2733] >> field2728 & var3) << var2;
            field2728 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "([B)V")
    private class114(byte[] arg0) {
        this.method934(arg0);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lsd;)Z")
    private static final boolean method941(class122 arg0) {
        if (!field2740) {
            byte[] var1 = arg0.method986(0, 0, (byte) 67);
            if (var1 == null) {
                return false;
            }
            method931(var1);
            field2740 = true;
        }
        return true;
    }
}
