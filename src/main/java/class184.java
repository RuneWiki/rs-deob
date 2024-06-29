import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class184 extends class288 {

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "Z")
    private static boolean field2649 = false;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    private static int field2634;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "I")
    private int field2638;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
    private int field2642;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    private int field2643;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
    private int field2644;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
    private int field2645;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
    private static int field2650;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "I")
    private static int field2652;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "I")
    private int field2655;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "I")
    private int field2656;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
    private static int field2657;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "I")
    private int field2658;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "Z")
    private boolean field2628;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "Z")
    private boolean field2635;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "[B")
    private static byte[] field2641;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "[B")
    private byte[] field2659;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "[F")
    private static float[] field2630;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "[F")
    private static float[] field2631;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "[F")
    private static float[] field2632;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "[F")
    private float[] field2633;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "[F")
    private static float[] field2636;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "[F")
    private static float[] field2637;

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "[F")
    private static float[] field2651;

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "[F")
    private static float[] field2654;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "[I")
    private static int[] field2629;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "[I")
    private static int[] field2640;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "[I")
    private static int[] field2647;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "[Lja;")
    private static class126[] field2639;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "[Ldh;")
    private static class148[] field2627;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "[Lte;")
    public static class207[] field2646;

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "[Lie;")
    private static class47[] field2648;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "[Z")
    private static boolean[] field2626;

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "[[B")
    private byte[][] field2653;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lbc;II)Lce;")
    public static final class184 method1188(class282 arg0, int arg1, int arg2) {
        if (method1189(arg0)) {
            byte[] var3 = arg0.method1861(arg2, arg1, 1);
            return var3 == null ? null : new class184(var3);
        } else {
            arg0.method1870((byte) -86, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lbc;)Z")
    private static final boolean method1189(class282 arg0) {
        if (!field2649) {
            byte[] var1 = arg0.method1861(0, 0, 1);
            if (var1 == null) {
                return false;
            }
            method1196(var1);
            field2649 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([I)Lik;")
    public final class295 method1190(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2659 == null) {
            this.field2655 = 0;
            this.field2633 = new float[field2650];
            this.field2659 = new byte[this.field2643];
            this.field2658 = 0;
            this.field2656 = 0;
        }
        while (this.field2656 < this.field2653.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1193(this.field2656);
            if (var3 != null) {
                int var4 = this.field2658;
                int var5 = var3.length;
                if (var5 > this.field2643 - var4) {
                    var5 = this.field2643 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2659[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2658;
                }
                this.field2658 = var4;
            }
            this.field2656++;
        }
        this.field2633 = null;
        byte[] var2 = this.field2659;
        this.field2659 = null;
        return new class295(this.field2645, var2, this.field2638, this.field2644, this.field2635);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([B)V")
    private final void method1191(byte[] arg0) {
        class216 var2 = new class216(arg0);
        this.field2645 = var2.method1358(62);
        this.field2643 = var2.method1358(54);
        this.field2638 = var2.method1358(75);
        this.field2644 = var2.method1358(44);
        if (this.field2644 < 0) {
            this.field2644 = ~this.field2644;
            this.field2635 = true;
        }
        int var3 = var2.method1358(98);
        this.field2653 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1407(117);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1374(var7, 0, var5, (byte) -79);
            this.field2653[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)I")
    public static final int method1192(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2634) {
            int var4 = 8 - field2634;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2641[field2657] >> field2634 & var5) << var2;
            field2634 = 0;
            field2657++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2641[field2657] >> field2634 & var3) << var2;
            field2634 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)[F")
    private final float[] method1193(int arg0) {
        method1197(this.field2653[arg0], 0);
        method1198();
        int var2 = method1192(class176.method1144(106, field2629.length - 1));
        boolean var3 = field2626[var2];
        int var4 = var3 ? field2650 : field2652;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1198() != 0;
            var6 = method1198() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2652 >> 2);
            var9 = (field2652 >> 2) + (var4 >> 2);
            var10 = field2652 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2652 >> 2);
            var12 = (field2652 >> 2) + (var4 - (var4 >> 2));
            var13 = field2652 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class47 var14 = field2648[field2629[var2]];
        int var15 = var14.field550;
        int var16 = var14.field549[var15];
        boolean var17 = !field2639[var16].method816();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field548; var19++) {
            class148 var95 = field2627[var14.field551[var19]];
            float[] var96 = field2632;
            var95.method978(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field550;
            int var21 = var14.field549[var20];
            field2639[var21].method820(field2632, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2632[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2632;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2631 : field2654;
            float[] var30 = var3 ? field2637 : field2651;
            float[] var31 = var3 ? field2630 : field2636;
            int[] var32 = var3 ? field2647 : field2640;
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
            int var35 = class176.method1144(110, var4 - 1);
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
                field2632[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2632[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2655 > 0) {
            int var49 = this.field2655 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2628) {
                for (int var50 = 0; var50 < this.field2642; var50++) {
                    int var51 = (this.field2655 >> 1) + var50;
                    var48[var50] += this.field2633[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2632[var52];
                }
            }
        }
        float[] var54 = this.field2633;
        this.field2633 = field2632;
        field2632 = var54;
        this.field2655 = var4;
        this.field2642 = var12 - (var4 >> 1);
        this.field2628 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)F")
    public static final float method1194(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "()V")
    public static void method1195() {
        field2641 = null;
        field2646 = null;
        field2639 = null;
        field2627 = null;
        field2648 = null;
        field2626 = null;
        field2629 = null;
        field2632 = null;
        field2654 = null;
        field2651 = null;
        field2636 = null;
        field2631 = null;
        field2637 = null;
        field2630 = null;
        field2640 = null;
        field2647 = null;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "([B)V")
    private static final void method1196(byte[] arg0) {
        method1197(arg0, 0);
        field2652 = 0x1 << method1192(4);
        field2650 = 0x1 << method1192(4);
        field2632 = new float[field2650];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2652 : field2650;
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
            int var25 = class176.method1144(121, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class228.method1476((byte) 83, var25, var26);
            }
            if (var1 == 0) {
                field2654 = var18;
                field2651 = var20;
                field2636 = var22;
                field2640 = var24;
            } else {
                field2631 = var18;
                field2637 = var20;
                field2630 = var22;
                field2647 = var24;
            }
        }
        int var2 = method1192(8) + 1;
        field2646 = new class207[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2646[var3] = new class207();
        }
        int var4 = method1192(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1192(16);
        }
        int var6 = method1192(6) + 1;
        field2639 = new class126[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2639[var7] = new class126();
        }
        int var8 = method1192(6) + 1;
        field2627 = new class148[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2627[var9] = new class148();
        }
        int var10 = method1192(6) + 1;
        field2648 = new class47[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2648[var11] = new class47();
        }
        int var12 = method1192(6) + 1;
        field2626 = new boolean[var12];
        field2629 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2626[var13] = method1198() != 0;
            method1192(16);
            method1192(16);
            field2629[var13] = method1192(8);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([BI)V")
    private static final void method1197(byte[] arg0, int arg1) {
        field2641 = arg0;
        field2657 = arg1;
        field2634 = 0;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "()I")
    public static final int method1198() {
        int var0 = field2641[field2657] >> field2634 & 0x1;
        field2634++;
        field2657 += field2634 >> 3;
        field2634 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "([B)V")
    private class184(byte[] arg0) {
        this.method1191(arg0);
    }
}
