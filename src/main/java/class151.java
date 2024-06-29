import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class151 extends class12 {

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "Z")
    private static boolean field2784 = false;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    private int field2781;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
    private int field2791;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "I")
    private static int field2792;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
    private static int field2793;

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "I")
    private int field2794;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "I")
    private static int field2800;

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "I")
    private static int field2804;

    @OriginalMember(owner = "client!ig", name = "O", descriptor = "I")
    private int field2807;

    @OriginalMember(owner = "client!ig", name = "R", descriptor = "I")
    private int field2810;

    @OriginalMember(owner = "client!ig", name = "S", descriptor = "I")
    private int field2811;

    @OriginalMember(owner = "client!ig", name = "T", descriptor = "I")
    private int field2812;

    @OriginalMember(owner = "client!ig", name = "V", descriptor = "I")
    private int field2814;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "Z")
    private boolean field2782;

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "Z")
    private boolean field2796;

    @OriginalMember(owner = "client!ig", name = "M", descriptor = "[B")
    private static byte[] field2805;

    @OriginalMember(owner = "client!ig", name = "U", descriptor = "[B")
    private byte[] field2813;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "[F")
    private static float[] field2783;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "[F")
    private static float[] field2786;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "[F")
    private static float[] field2788;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "[F")
    private float[] field2790;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "[F")
    private static float[] field2795;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "[F")
    private static float[] field2801;

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "[F")
    private static float[] field2803;

    @OriginalMember(owner = "client!ig", name = "P", descriptor = "[F")
    private static float[] field2808;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "[I")
    private static int[] field2787;

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "[I")
    private static int[] field2802;

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "[I")
    private static int[] field2809;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "[Lad;")
    private static class109[] field2798;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "[Lmf;")
    private static class37[] field2797;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "[Lje;")
    public static class60[] field2799;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "[Lpc;")
    private static class74[] field2789;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "[Z")
    private static boolean[] field2785;

    @OriginalMember(owner = "client!ig", name = "N", descriptor = "[[B")
    private byte[][] field2806;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "()I")
    public static final int method1029() {
        int var0 = field2805[field2792] >> field2793 & 0x1;
        field2793++;
        field2792 += field2793 >> 3;
        field2793 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "()V")
    public static void method1030() {
        field2805 = null;
        field2799 = null;
        field2789 = null;
        field2798 = null;
        field2797 = null;
        field2785 = null;
        field2787 = null;
        field2801 = null;
        field2788 = null;
        field2808 = null;
        field2786 = null;
        field2783 = null;
        field2795 = null;
        field2803 = null;
        field2809 = null;
        field2802 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([B)V")
    private final void method1031(byte[] arg0) {
        class135 var2 = new class135(arg0);
        this.field2810 = var2.method949(3933);
        this.field2781 = var2.method949(3933);
        this.field2807 = var2.method949(3933);
        this.field2811 = var2.method949(3933);
        if (this.field2811 < 0) {
            this.field2811 = ~this.field2811;
            this.field2782 = true;
        }
        int var3 = var2.method949(3933);
        this.field2806 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method920((byte) 66);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method917(var7, var5, -20730, 0);
            this.field2806[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)[F")
    private final float[] method1032(int arg0) {
        method1034(this.field2806[arg0], 0);
        method1029();
        int var2 = method1039(class164.method1082(field2787.length - 1, 4));
        boolean var3 = field2785[var2];
        int var4 = var3 ? field2804 : field2800;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1029() != 0;
            var6 = method1029() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2800 >> 2);
            var9 = (field2800 >> 2) + (var4 >> 2);
            var10 = field2800 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2800 >> 2);
            var12 = (field2800 >> 2) + (var4 - (var4 >> 2));
            var13 = field2800 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class37 var14 = field2797[field2787[var2]];
        int var15 = var14.field859;
        int var16 = var14.field858[var15];
        boolean var17 = !field2789[var16].method525();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field861; var19++) {
            class109 var95 = field2798[var14.field860[var19]];
            float[] var96 = field2801;
            var95.method722(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field859;
            int var21 = var14.field858[var20];
            field2789[var21].method531(field2801, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2801[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2801;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2783 : field2788;
            float[] var30 = var3 ? field2795 : field2808;
            float[] var31 = var3 ? field2803 : field2786;
            int[] var32 = var3 ? field2802 : field2809;
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
            int var35 = class164.method1082(var4 - 1, 4);
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
                field2801[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2801[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2791 > 0) {
            int var49 = this.field2791 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2796) {
                for (int var50 = 0; var50 < this.field2794; var50++) {
                    int var51 = (this.field2791 >> 1) + var50;
                    var48[var50] += this.field2790[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2801[var52];
                }
            }
        }
        float[] var54 = this.field2790;
        this.field2790 = field2801;
        field2801 = var54;
        this.field2791 = var4;
        this.field2794 = var12 - (var4 >> 1);
        this.field2796 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([I)Lfi;")
    public final class222 method1033(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2813 == null) {
            this.field2791 = 0;
            this.field2790 = new float[field2804];
            this.field2813 = new byte[this.field2781];
            this.field2812 = 0;
            this.field2814 = 0;
        }
        while (this.field2814 < this.field2806.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1032(this.field2814);
            if (var3 != null) {
                int var4 = this.field2812;
                int var5 = var3.length;
                if (var5 > this.field2781 - var4) {
                    var5 = this.field2781 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2813[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2812;
                }
                this.field2812 = var4;
            }
            this.field2814++;
        }
        this.field2790 = null;
        byte[] var2 = this.field2813;
        this.field2813 = null;
        return new class222(this.field2810, var2, this.field2807, this.field2811, this.field2782);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([BI)V")
    private static final void method1034(byte[] arg0, int arg1) {
        field2805 = arg0;
        field2792 = arg1;
        field2793 = 0;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "([B)V")
    private static final void method1035(byte[] arg0) {
        method1034(arg0, 0);
        field2800 = 0x1 << method1039(4);
        field2804 = 0x1 << method1039(4);
        field2801 = new float[field2804];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2800 : field2804;
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
            int var25 = class164.method1082(var17 - 1, 4);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class280.method1907(var25, var26, -78);
            }
            if (var1 == 0) {
                field2788 = var18;
                field2808 = var20;
                field2786 = var22;
                field2809 = var24;
            } else {
                field2783 = var18;
                field2795 = var20;
                field2803 = var22;
                field2802 = var24;
            }
        }
        int var2 = method1039(8) + 1;
        field2799 = new class60[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2799[var3] = new class60();
        }
        int var4 = method1039(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1039(16);
        }
        int var6 = method1039(6) + 1;
        field2789 = new class74[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2789[var7] = new class74();
        }
        int var8 = method1039(6) + 1;
        field2798 = new class109[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2798[var9] = new class109();
        }
        int var10 = method1039(6) + 1;
        field2797 = new class37[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2797[var11] = new class37();
        }
        int var12 = method1039(6) + 1;
        field2785 = new boolean[var12];
        field2787 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2785[var13] = method1029() != 0;
            method1039(16);
            method1039(16);
            field2787[var13] = method1039(8);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lfl;)Z")
    private static final boolean method1036(class192 arg0) {
        if (!field2784) {
            byte[] var1 = arg0.method1332(true, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1035(var1);
            field2784 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)F")
    public static final float method1037(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lfl;II)Lig;")
    public static final class151 method1038(class192 arg0, int arg1, int arg2) {
        if (method1036(arg0)) {
            byte[] var3 = arg0.method1332(true, arg2, arg1);
            return var3 == null ? null : new class151(var3);
        } else {
            arg0.method1310(arg1, 2, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)I")
    public static final int method1039(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2793) {
            int var4 = 8 - field2793;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2805[field2792] >> field2793 & var5) << var2;
            field2793 = 0;
            field2792++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2805[field2792] >> field2793 & var3) << var2;
            field2793 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "([B)V")
    private class151(byte[] arg0) {
        this.method1031(arg0);
    }
}
