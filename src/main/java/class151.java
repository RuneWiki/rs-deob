import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class151 extends class163 {

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "Z")
    private static boolean field2707 = false;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
    private static int field2685;

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "I")
    private int field2692;

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "I")
    private static int field2695;

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
    private int field2698;

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "I")
    private static int field2700;

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "I")
    private int field2705;

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "I")
    private static int field2706;

    @OriginalMember(owner = "client!pa", name = "S", descriptor = "I")
    private int field2710;

    @OriginalMember(owner = "client!pa", name = "U", descriptor = "I")
    private int field2712;

    @OriginalMember(owner = "client!pa", name = "V", descriptor = "I")
    private int field2713;

    @OriginalMember(owner = "client!pa", name = "W", descriptor = "I")
    private int field2714;

    @OriginalMember(owner = "client!pa", name = "Y", descriptor = "I")
    private int field2716;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "Z")
    private boolean field2684;

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "Z")
    private boolean field2690;

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "[B")
    private static byte[] field2701;

    @OriginalMember(owner = "client!pa", name = "X", descriptor = "[B")
    private byte[] field2715;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "[F")
    private static float[] field2683;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "[F")
    private static float[] field2688;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "[F")
    private static float[] field2691;

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "[F")
    private static float[] field2693;

    @OriginalMember(owner = "client!pa", name = "E", descriptor = "[F")
    private static float[] field2696;

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "[F")
    private float[] field2708;

    @OriginalMember(owner = "client!pa", name = "R", descriptor = "[F")
    private static float[] field2709;

    @OriginalMember(owner = "client!pa", name = "T", descriptor = "[F")
    private static float[] field2711;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "[I")
    private static int[] field2687;

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "[I")
    private static int[] field2689;

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "[I")
    private static int[] field2702;

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "[Lhl;")
    private static class220[] field2694;

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "[La;")
    private static class266[] field2703;

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "[Lnk;")
    public static class309[] field2699;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "[Lcm;")
    private static class312[] field2686;

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "[Z")
    private static boolean[] field2697;

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "[[B")
    private byte[][] field2704;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([B)V", line = 4)
    private final void method1127(byte[] arg0) {
        class41 var2 = new class41(arg0);
        this.field2710 = var2.method327(4);
        this.field2705 = var2.method327(4);
        this.field2713 = var2.method327(4);
        this.field2712 = var2.method327(4);
        if (this.field2712 < 0) {
            this.field2712 = ~this.field2712;
            this.field2690 = true;
        }
        int var3 = var2.method327(4);
        this.field2704 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method357(false);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method353(var5, var7, true, 0);
            this.field2704[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "()V", line = 50)
    public static void method1128() {
        field2701 = null;
        field2699 = null;
        field2686 = null;
        field2703 = null;
        field2694 = null;
        field2697 = null;
        field2689 = null;
        field2683 = null;
        field2688 = null;
        field2696 = null;
        field2711 = null;
        field2693 = null;
        field2709 = null;
        field2691 = null;
        field2687 = null;
        field2702 = null;
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)[F", line = 69)
    private final float[] method1129(int arg0) {
        method1135(this.field2704[arg0], 0);
        method1130();
        int var2 = method1136(class311.method2154(-17, field2689.length - 1));
        boolean var3 = field2697[var2];
        int var4 = var3 ? field2685 : field2700;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1130() != 0;
            var6 = method1130() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2700 >> 2);
            var9 = (field2700 >> 2) + (var4 >> 2);
            var10 = field2700 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2700 >> 2);
            var12 = (field2700 >> 2) + (var4 - (var4 >> 2));
            var13 = field2700 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class220 var14 = field2694[field2689[var2]];
        int var15 = var14.field3863;
        int var16 = var14.field3866[var15];
        boolean var17 = !field2686[var16].method2159();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3865; var19++) {
            class266 var20 = field2703[var14.field3864[var19]];
            float[] var21 = field2683;
            var20.method1850(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field3863;
            int var23 = var14.field3866[var22];
            field2686[var23].method2162(field2683, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field2683[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field2683;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field2693 : field2688;
            float[] var32 = var3 ? field2709 : field2696;
            float[] var33 = var3 ? field2691 : field2711;
            int[] var34 = var3 ? field2702 : field2687;
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
            int var47 = class311.method2154(-17, var4 - 1);
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
                field2683[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2683[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field2692 > 0) {
            int var91 = this.field2692 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field2684) {
                for (int var92 = 0; var92 < this.field2698; var92++) {
                    int var93 = (this.field2692 >> 1) + var92;
                    var90[var92] += this.field2708[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field2683[var94];
                }
            }
        }
        float[] var96 = this.field2708;
        this.field2708 = field2683;
        field2683 = var96;
        this.field2692 = var4;
        this.field2698 = var12 - (var4 >> 1);
        this.field2684 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "()I", line = 490)
    public static final int method1130() {
        int var0 = field2701[field2706] >> field2695 & 0x1;
        field2695++;
        field2706 += field2695 >> 3;
        field2695 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)F", line = 499)
    public static final float method1131(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([I)Lof;", line = 511)
    public final class268 method1132(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2715 == null) {
            this.field2692 = 0;
            this.field2708 = new float[field2685];
            this.field2715 = new byte[this.field2705];
            this.field2716 = 0;
            this.field2714 = 0;
        }
        while (this.field2714 < this.field2704.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1129(this.field2714);
            if (var2 != null) {
                int var3 = this.field2716;
                int var4 = var2.length;
                if (var4 > this.field2705 - var3) {
                    var4 = this.field2705 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field2715[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field2716;
                }
                this.field2716 = var3;
            }
            this.field2714++;
        }
        this.field2708 = null;
        byte[] var7 = this.field2715;
        this.field2715 = null;
        return new class268(this.field2710, var7, this.field2713, this.field2712, this.field2690);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lng;)Z", line = 574)
    private static final boolean method1133(class138 arg0) {
        if (!field2707) {
            byte[] var1 = arg0.method1016(0, 100, 0);
            if (var1 == null) {
                return false;
            }
            method1137(var1);
            field2707 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lng;II)Lpa;", line = 591)
    public static final class151 method1134(class138 arg0, int arg1, int arg2) {
        if (method1133(arg0)) {
            byte[] var3 = arg0.method1016(arg1, 100, arg2);
            return var3 == null ? null : new class151(var3);
        } else {
            arg0.method1021(arg1, -93, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([BI)V", line = 607)
    private static final void method1135(byte[] arg0, int arg1) {
        field2701 = arg0;
        field2706 = arg1;
        field2695 = 0;
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)I", line = 618)
    public static final int method1136(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2695) {
            int var3 = 8 - field2695;
            int var4 = (0x1 << var3) - 1;
            var1 += (field2701[field2706] >> field2695 & var4) << var2;
            field2695 = 0;
            field2706++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field2701[field2706] >> field2695 & var5) << var2;
            field2695 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "([B)V", line = 646)
    private static final void method1137(byte[] arg0) {
        method1135(arg0, 0);
        field2700 = 0x1 << method1136(4);
        field2685 = 0x1 << method1136(4);
        field2683 = new float[field2685];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field2700 : field2685;
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
            int var13 = class311.method2154(-17, var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class282.method1974(var14, var13, true);
            }
            if (var1 == 0) {
                field2688 = var6;
                field2696 = var8;
                field2711 = var10;
                field2687 = var12;
            } else {
                field2693 = var6;
                field2709 = var8;
                field2691 = var10;
                field2702 = var12;
            }
        }
        int var15 = method1136(8) + 1;
        field2699 = new class309[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field2699[var16] = new class309();
        }
        int var17 = method1136(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method1136(16);
        }
        int var19 = method1136(6) + 1;
        field2686 = new class312[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field2686[var20] = new class312();
        }
        int var21 = method1136(6) + 1;
        field2703 = new class266[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field2703[var22] = new class266();
        }
        int var23 = method1136(6) + 1;
        field2694 = new class220[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field2694[var24] = new class220();
        }
        int var25 = method1136(6) + 1;
        field2697 = new boolean[var25];
        field2689 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field2697[var26] = method1130() != 0;
            method1136(16);
            method1136(16);
            field2689[var26] = method1136(8);
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "([B)V", line = 803)
    private class151(byte[] arg0) {
        this.method1127(arg0);
    }
}
