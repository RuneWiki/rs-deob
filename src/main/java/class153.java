import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class153 extends class64 {

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "Z")
    private static boolean field2792 = false;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    private int field2775;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    private int field2779;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
    private int field2780;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    private int field2781;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "I")
    private int field2784;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
    private static int field2786;

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "I")
    private static int field2788;

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "I")
    private static int field2794;

    @OriginalMember(owner = "client!ni", name = "P", descriptor = "I")
    private static int field2798;

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "I")
    private int field2800;

    @OriginalMember(owner = "client!ni", name = "U", descriptor = "I")
    private int field2803;

    @OriginalMember(owner = "client!ni", name = "Y", descriptor = "I")
    private int field2807;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "Z")
    private boolean field2777;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "Z")
    private boolean field2783;

    @OriginalMember(owner = "client!ni", name = "S", descriptor = "[B")
    private static byte[] field2801;

    @OriginalMember(owner = "client!ni", name = "V", descriptor = "[B")
    private byte[] field2804;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "[F")
    private static float[] field2774;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "[F")
    private static float[] field2778;

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "[F")
    private static float[] field2787;

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "[F")
    private float[] field2789;

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "[F")
    private static float[] field2793;

    @OriginalMember(owner = "client!ni", name = "N", descriptor = "[F")
    private static float[] field2796;

    @OriginalMember(owner = "client!ni", name = "T", descriptor = "[F")
    private static float[] field2802;

    @OriginalMember(owner = "client!ni", name = "W", descriptor = "[F")
    private static float[] field2805;

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "[I")
    private static int[] field2785;

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "[I")
    private static int[] field2797;

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "[I")
    private static int[] field2799;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "[Ldh;")
    public static class120[] field2782;

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "[Llb;")
    private static class130[] field2791;

    @OriginalMember(owner = "client!ni", name = "X", descriptor = "[Lfh;")
    private static class132[] field2806;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "[Li;")
    private static class56[] field2776;

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "[Z")
    private static boolean[] field2790;

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "[[B")
    private byte[][] field2795;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "()V")
    public static void method1079() {
        field2801 = null;
        field2782 = null;
        field2791 = null;
        field2776 = null;
        field2806 = null;
        field2790 = null;
        field2799 = null;
        field2796 = null;
        field2793 = null;
        field2774 = null;
        field2805 = null;
        field2787 = null;
        field2802 = null;
        field2778 = null;
        field2797 = null;
        field2785 = null;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "()I")
    public static final int method1080() {
        int var0 = field2801[field2788] >> field2794 & 0x1;
        field2794++;
        field2788 += field2794 >> 3;
        field2794 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([B)V")
    private final void method1081(byte[] arg0) {
        class74 var2 = new class74(arg0);
        this.field2781 = var2.method498((byte) 126);
        this.field2800 = var2.method498((byte) 125);
        this.field2780 = var2.method498((byte) 125);
        this.field2784 = var2.method498((byte) 126);
        if (this.field2784 < 0) {
            this.field2784 = ~this.field2784;
            this.field2777 = true;
        }
        int var3 = var2.method498((byte) 126);
        this.field2795 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method489((byte) -44);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method528(var5, 0, -2, var7);
            this.field2795[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([I)Lji;")
    public final class42 method1082(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2804 == null) {
            this.field2775 = 0;
            this.field2789 = new float[field2786];
            this.field2804 = new byte[this.field2800];
            this.field2803 = 0;
            this.field2807 = 0;
        }
        while (this.field2807 < this.field2795.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1088(this.field2807);
            if (var3 != null) {
                int var4 = this.field2803;
                int var5 = var3.length;
                if (var5 > this.field2800 - var4) {
                    var5 = this.field2800 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2804[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2803;
                }
                this.field2803 = var4;
            }
            this.field2807++;
        }
        this.field2789 = null;
        byte[] var2 = this.field2804;
        this.field2804 = null;
        return new class42(this.field2781, var2, this.field2780, this.field2784, this.field2777);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "([B)V")
    private static final void method1083(byte[] arg0) {
        method1085(arg0, 0);
        field2798 = 0x1 << method1087(4);
        field2786 = 0x1 << method1087(4);
        field2796 = new float[field2786];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2798 : field2786;
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
            int var25 = class261.method1818((byte) -22, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class92.method674(120, var26, var25);
            }
            if (var1 == 0) {
                field2793 = var18;
                field2774 = var20;
                field2805 = var22;
                field2797 = var24;
            } else {
                field2787 = var18;
                field2802 = var20;
                field2778 = var22;
                field2785 = var24;
            }
        }
        int var2 = method1087(8) + 1;
        field2782 = new class120[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2782[var3] = new class120();
        }
        int var4 = method1087(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1087(16);
        }
        int var6 = method1087(6) + 1;
        field2791 = new class130[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2791[var7] = new class130();
        }
        int var8 = method1087(6) + 1;
        field2776 = new class56[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2776[var9] = new class56();
        }
        int var10 = method1087(6) + 1;
        field2806 = new class132[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2806[var11] = new class132();
        }
        int var12 = method1087(6) + 1;
        field2790 = new boolean[var12];
        field2799 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2790[var13] = method1080() != 0;
            method1087(16);
            method1087(16);
            field2799[var13] = method1087(8);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lal;)Z")
    private static final boolean method1084(class230 arg0) {
        if (!field2792) {
            byte[] var1 = arg0.method1562(-809612665, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1083(var1);
            field2792 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([BI)V")
    private static final void method1085(byte[] arg0, int arg1) {
        field2801 = arg0;
        field2788 = arg1;
        field2794 = 0;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lal;II)Lni;")
    public static final class153 method1086(class230 arg0, int arg1, int arg2) {
        if (method1084(arg0)) {
            byte[] var3 = arg0.method1562(-809612665, arg2, arg1);
            return var3 == null ? null : new class153(var3);
        } else {
            arg0.method1541(true, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)I")
    public static final int method1087(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2794) {
            int var4 = 8 - field2794;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2801[field2788] >> field2794 & var5) << var2;
            field2794 = 0;
            field2788++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2801[field2788] >> field2794 & var3) << var2;
            field2794 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)[F")
    private final float[] method1088(int arg0) {
        method1085(this.field2795[arg0], 0);
        method1080();
        int var2 = method1087(class261.method1818((byte) -22, field2799.length - 1));
        boolean var3 = field2790[var2];
        int var4 = var3 ? field2786 : field2798;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1080() != 0;
            var6 = method1080() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2798 >> 2);
            var9 = (field2798 >> 2) + (var4 >> 2);
            var10 = field2798 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2798 >> 2);
            var12 = (field2798 >> 2) + (var4 - (var4 >> 2));
            var13 = field2798 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class132 var14 = field2806[field2799[var2]];
        int var15 = var14.field2409;
        int var16 = var14.field2408[var15];
        boolean var17 = !field2791[var16].method907();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2411; var19++) {
            class56 var95 = field2776[var14.field2410[var19]];
            float[] var96 = field2796;
            var95.method353(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2409;
            int var21 = var14.field2408[var20];
            field2791[var21].method911(field2796, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2796[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2796;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2787 : field2793;
            float[] var30 = var3 ? field2802 : field2774;
            float[] var31 = var3 ? field2778 : field2805;
            int[] var32 = var3 ? field2785 : field2797;
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
            int var35 = class261.method1818((byte) -22, var4 - 1);
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
                field2796[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2796[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2775 > 0) {
            int var49 = this.field2775 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2783) {
                for (int var50 = 0; var50 < this.field2779; var50++) {
                    int var51 = (this.field2775 >> 1) + var50;
                    var48[var50] += this.field2789[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2796[var52];
                }
            }
        }
        float[] var54 = this.field2789;
        this.field2789 = field2796;
        field2796 = var54;
        this.field2775 = var4;
        this.field2779 = var12 - (var4 >> 1);
        this.field2783 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)F")
    public static final float method1089(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "([B)V")
    private class153(byte[] arg0) {
        this.method1081(arg0);
    }
}
