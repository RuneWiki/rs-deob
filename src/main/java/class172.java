import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class172 extends class166 {

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "Z")
    private static boolean field2701 = false;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
    private static int field2686;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    private static int field2687;

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "I")
    private int field2692;

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "I")
    private int field2697;

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "I")
    private static int field2700;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "I")
    private int field2702;

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "I")
    private static int field2707;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "I")
    private int field2708;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "I")
    private int field2709;

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "I")
    private int field2713;

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "I")
    private int field2715;

    @OriginalMember(owner = "client!aa", name = "X", descriptor = "I")
    private int field2716;

    @OriginalMember(owner = "client!aa", name = "C", descriptor = "Z")
    private boolean field2695;

    @OriginalMember(owner = "client!aa", name = "G", descriptor = "Z")
    private boolean field2699;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "[B")
    private static byte[] field2690;

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "[B")
    private byte[] field2714;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "[F")
    private float[] field2683;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "[F")
    private static float[] field2684;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "[F")
    private static float[] field2685;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "[F")
    private static float[] field2691;

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "[F")
    private static float[] field2703;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "[F")
    private static float[] field2705;

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "[F")
    private static float[] field2711;

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "[F")
    private static float[] field2712;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "[I")
    private static int[] field2688;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "[I")
    private static int[] field2689;

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "[I")
    private static int[] field2696;

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "[Lbj;")
    private static class156[] field2706;

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "[Lba;")
    private static class169[] field2698;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "[Lrf;")
    public static class289[] field2710;

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "[Lqc;")
    private static class64[] field2693;

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "[Z")
    private static boolean[] field2694;

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "[[B")
    private byte[][] field2704;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([B)V")
    private static final void method1159(byte[] arg0) {
        method1168(arg0, 0);
        field2700 = 0x1 << method1169(4);
        field2687 = 0x1 << method1169(4);
        field2691 = new float[field2687];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2700 : field2687;
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
            int var25 = class97.method717(var17 - 1, (byte) -117);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class180.method1228(var26, false, var25);
            }
            if (var1 == 0) {
                field2684 = var18;
                field2712 = var20;
                field2703 = var22;
                field2688 = var24;
            } else {
                field2711 = var18;
                field2705 = var20;
                field2685 = var22;
                field2696 = var24;
            }
        }
        int var2 = method1169(8) + 1;
        field2710 = new class289[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2710[var3] = new class289();
        }
        int var4 = method1169(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1169(16);
        }
        int var6 = method1169(6) + 1;
        field2698 = new class169[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2698[var7] = new class169();
        }
        int var8 = method1169(6) + 1;
        field2693 = new class64[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2693[var9] = new class64();
        }
        int var10 = method1169(6) + 1;
        field2706 = new class156[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2706[var11] = new class156();
        }
        int var12 = method1169(6) + 1;
        field2694 = new boolean[var12];
        field2689 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2694[var13] = method1164() != 0;
            method1169(16);
            method1169(16);
            field2689[var13] = method1169(8);
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)[F")
    private final float[] method1160(int arg0) {
        method1168(this.field2704[arg0], 0);
        method1164();
        int var2 = method1169(class97.method717(field2689.length - 1, (byte) 50));
        boolean var3 = field2694[var2];
        int var4 = var3 ? field2687 : field2700;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1164() != 0;
            var6 = method1164() != 0;
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
        class156 var14 = field2706[field2689[var2]];
        int var15 = var14.field2417;
        int var16 = var14.field2416[var15];
        boolean var17 = !field2698[var16].method1135();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2415; var19++) {
            class64 var95 = field2693[var14.field2418[var19]];
            float[] var96 = field2691;
            var95.method479(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2417;
            int var21 = var14.field2416[var20];
            field2698[var21].method1141(field2691, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2691[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2691;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2711 : field2684;
            float[] var30 = var3 ? field2705 : field2712;
            float[] var31 = var3 ? field2685 : field2703;
            int[] var32 = var3 ? field2696 : field2688;
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
            int var35 = class97.method717(var4 - 1, (byte) -101);
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
                field2691[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2691[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2702 > 0) {
            int var49 = this.field2702 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2699) {
                for (int var50 = 0; var50 < this.field2708; var50++) {
                    int var51 = (this.field2702 >> 1) + var50;
                    var48[var50] += this.field2683[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2691[var52];
                }
            }
        }
        float[] var54 = this.field2683;
        this.field2683 = field2691;
        field2691 = var54;
        this.field2702 = var4;
        this.field2708 = var12 - (var4 >> 1);
        this.field2699 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lhc;)Z")
    private static final boolean method1161(class235 arg0) {
        if (!field2701) {
            byte[] var1 = arg0.method1590(0, (byte) -25, 0);
            if (var1 == null) {
                return false;
            }
            method1159(var1);
            field2701 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([I)Lah;")
    public final class285 method1162(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2714 == null) {
            this.field2702 = 0;
            this.field2683 = new float[field2687];
            this.field2714 = new byte[this.field2713];
            this.field2716 = 0;
            this.field2715 = 0;
        }
        while (this.field2715 < this.field2704.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1160(this.field2715);
            if (var3 != null) {
                int var4 = this.field2716;
                int var5 = var3.length;
                if (var5 > this.field2713 - var4) {
                    var5 = this.field2713 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2714[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2716;
                }
                this.field2716 = var4;
            }
            this.field2715++;
        }
        this.field2683 = null;
        byte[] var2 = this.field2714;
        this.field2714 = null;
        return new class285(this.field2692, var2, this.field2709, this.field2697, this.field2695);
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)F")
    public static final float method1163(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()I")
    public static final int method1164() {
        int var0 = field2690[field2707] >> field2686 & 0x1;
        field2686++;
        field2707 += field2686 >> 3;
        field2686 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "([B)V")
    private final void method1165(byte[] arg0) {
        class88 var2 = new class88(arg0);
        this.field2692 = var2.method641(-1);
        this.field2713 = var2.method641(-1);
        this.field2709 = var2.method641(-1);
        this.field2697 = var2.method641(-1);
        if (this.field2697 < 0) {
            this.field2697 = ~this.field2697;
            this.field2695 = true;
        }
        int var3 = var2.method641(-1);
        this.field2704 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method633(124);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method662(var7, var5, 0, (byte) 122);
            this.field2704[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lhc;II)Laa;")
    public static final class172 method1166(class235 arg0, int arg1, int arg2) {
        if (method1161(arg0)) {
            byte[] var3 = arg0.method1590(arg2, (byte) -25, arg1);
            return var3 == null ? null : new class172(var3);
        } else {
            arg0.method1615(-44, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "()V")
    public static void method1167() {
        field2690 = null;
        field2710 = null;
        field2698 = null;
        field2693 = null;
        field2706 = null;
        field2694 = null;
        field2689 = null;
        field2691 = null;
        field2684 = null;
        field2712 = null;
        field2703 = null;
        field2711 = null;
        field2705 = null;
        field2685 = null;
        field2688 = null;
        field2696 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([BI)V")
    private static final void method1168(byte[] arg0, int arg1) {
        field2690 = arg0;
        field2707 = arg1;
        field2686 = 0;
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)I")
    public static final int method1169(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2686) {
            int var4 = 8 - field2686;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2690[field2707] >> field2686 & var5) << var2;
            field2686 = 0;
            field2707++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2690[field2707] >> field2686 & var3) << var2;
            field2686 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "([B)V")
    private class172(byte[] arg0) {
        this.method1165(arg0);
    }
}
