import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class226 extends class32 {

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "Z")
    private static boolean field3795 = false;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    private int field3782;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    private static int field3784;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    private static int field3787;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    private int field3788;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "I")
    private int field3797;

    @OriginalMember(owner = "client!nj", name = "D", descriptor = "I")
    private int field3801;

    @OriginalMember(owner = "client!nj", name = "H", descriptor = "I")
    private static int field3805;

    @OriginalMember(owner = "client!nj", name = "I", descriptor = "I")
    private static int field3806;

    @OriginalMember(owner = "client!nj", name = "J", descriptor = "I")
    private int field3807;

    @OriginalMember(owner = "client!nj", name = "M", descriptor = "I")
    private int field3810;

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "I")
    private int field3814;

    @OriginalMember(owner = "client!nj", name = "R", descriptor = "I")
    private int field3815;

    @OriginalMember(owner = "client!nj", name = "G", descriptor = "Z")
    private boolean field3804;

    @OriginalMember(owner = "client!nj", name = "O", descriptor = "Z")
    private boolean field3812;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "[B")
    private static byte[] field3786;

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "[B")
    private byte[] field3813;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "[F")
    private static float[] field3785;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "[F")
    private static float[] field3791;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "[F")
    private static float[] field3792;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "[F")
    private static float[] field3793;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "[F")
    private static float[] field3794;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "[F")
    private static float[] field3796;

    @OriginalMember(owner = "client!nj", name = "C", descriptor = "[F")
    private static float[] field3800;

    @OriginalMember(owner = "client!nj", name = "F", descriptor = "[F")
    private float[] field3803;

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "[I")
    private static int[] field3798;

    @OriginalMember(owner = "client!nj", name = "E", descriptor = "[I")
    private static int[] field3802;

    @OriginalMember(owner = "client!nj", name = "L", descriptor = "[I")
    private static int[] field3809;

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "[Lgd;")
    private static class165[] field3811;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "[Lhe;")
    private static class230[] field3790;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "[Loa;")
    private static class234[] field3783;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "[Lrd;")
    public static class92[] field3789;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "[Z")
    private static boolean[] field3799;

    @OriginalMember(owner = "client!nj", name = "K", descriptor = "[[B")
    private byte[][] field3808;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)F")
    public static final float method1540(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)[F")
    private final float[] method1541(int arg0) {
        method1546(this.field3808[arg0], 0);
        method1549();
        int var2 = method1543(class258.method1737(-257, field3809.length - 1));
        boolean var3 = field3799[var2];
        int var4 = var3 ? field3784 : field3806;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1549() != 0;
            var6 = method1549() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3806 >> 2);
            var9 = (field3806 >> 2) + (var4 >> 2);
            var10 = field3806 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3806 >> 2);
            var12 = (field3806 >> 2) + (var4 - (var4 >> 2));
            var13 = field3806 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class234 var14 = field3783[field3809[var2]];
        int var15 = var14.field3923;
        int var16 = var14.field3926[var15];
        boolean var17 = !field3790[var16].method1568();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3925; var19++) {
            class165 var95 = field3811[var14.field3924[var19]];
            float[] var96 = field3792;
            var95.method1146(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field3923;
            int var21 = var14.field3926[var20];
            field3790[var21].method1570(field3792, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field3792[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field3792;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3796 : field3793;
            float[] var30 = var3 ? field3794 : field3785;
            float[] var31 = var3 ? field3791 : field3800;
            int[] var32 = var3 ? field3802 : field3798;
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
            int var35 = class258.method1737(-257, var4 - 1);
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
                field3792[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3792[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field3788 > 0) {
            int var49 = this.field3788 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field3804) {
                for (int var50 = 0; var50 < this.field3810; var50++) {
                    int var51 = (this.field3788 >> 1) + var50;
                    var48[var50] += this.field3803[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3792[var52];
                }
            }
        }
        float[] var54 = this.field3803;
        this.field3803 = field3792;
        field3792 = var54;
        this.field3788 = var4;
        this.field3810 = var12 - (var4 >> 1);
        this.field3804 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([B)V")
    private static final void method1542(byte[] arg0) {
        method1546(arg0, 0);
        field3806 = 0x1 << method1543(4);
        field3784 = 0x1 << method1543(4);
        field3792 = new float[field3784];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3806 : field3784;
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
            int var25 = class258.method1737(-257, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class201.method1338(var25, var26, 782);
            }
            if (var1 == 0) {
                field3793 = var18;
                field3785 = var20;
                field3800 = var22;
                field3798 = var24;
            } else {
                field3796 = var18;
                field3794 = var20;
                field3791 = var22;
                field3802 = var24;
            }
        }
        int var2 = method1543(8) + 1;
        field3789 = new class92[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3789[var3] = new class92();
        }
        int var4 = method1543(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1543(16);
        }
        int var6 = method1543(6) + 1;
        field3790 = new class230[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3790[var7] = new class230();
        }
        int var8 = method1543(6) + 1;
        field3811 = new class165[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3811[var9] = new class165();
        }
        int var10 = method1543(6) + 1;
        field3783 = new class234[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3783[var11] = new class234();
        }
        int var12 = method1543(6) + 1;
        field3799 = new boolean[var12];
        field3809 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3799[var13] = method1549() != 0;
            method1543(16);
            method1543(16);
            field3809[var13] = method1543(8);
        }
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "(I)I")
    public static final int method1543(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3805) {
            int var4 = 8 - field3805;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3786[field3787] >> field3805 & var5) << var2;
            field3805 = 0;
            field3787++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3786[field3787] >> field3805 & var3) << var2;
            field3805 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([I)Lbj;")
    public final class107 method1544(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3813 == null) {
            this.field3788 = 0;
            this.field3803 = new float[field3784];
            this.field3813 = new byte[this.field3807];
            this.field3814 = 0;
            this.field3815 = 0;
        }
        while (this.field3815 < this.field3808.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1541(this.field3815);
            if (var3 != null) {
                int var4 = this.field3814;
                int var5 = var3.length;
                if (var5 > this.field3807 - var4) {
                    var5 = this.field3807 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field3813[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field3814;
                }
                this.field3814 = var4;
            }
            this.field3815++;
        }
        this.field3803 = null;
        byte[] var2 = this.field3813;
        this.field3813 = null;
        return new class107(this.field3782, var2, this.field3801, this.field3797, this.field3812);
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "([B)V")
    private final void method1545(byte[] arg0) {
        class217 var2 = new class217(arg0);
        this.field3782 = var2.method1466((byte) -15);
        this.field3807 = var2.method1466((byte) -15);
        this.field3801 = var2.method1466((byte) -15);
        this.field3797 = var2.method1466((byte) -15);
        if (this.field3797 < 0) {
            this.field3797 = ~this.field3797;
            this.field3812 = true;
        }
        int var3 = var2.method1466((byte) -15);
        this.field3808 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1487(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1456(var7, 128, var5, 0);
            this.field3808[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([BI)V")
    private static final void method1546(byte[] arg0, int arg1) {
        field3786 = arg0;
        field3787 = arg1;
        field3805 = 0;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lda;II)Lnj;")
    public static final class226 method1547(class22 arg0, int arg1, int arg2) {
        if (method1548(arg0)) {
            byte[] var3 = arg0.method190((byte) -95, arg2, arg1);
            return var3 == null ? null : new class226(var3);
        } else {
            arg0.method163(arg2, (byte) 100, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lda;)Z")
    private static final boolean method1548(class22 arg0) {
        if (!field3795) {
            byte[] var1 = arg0.method190((byte) -55, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1542(var1);
            field3795 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "()I")
    public static final int method1549() {
        int var0 = field3786[field3787] >> field3805 & 0x1;
        field3805++;
        field3787 += field3805 >> 3;
        field3805 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "()V")
    public static void method1550() {
        field3786 = null;
        field3789 = null;
        field3790 = null;
        field3811 = null;
        field3783 = null;
        field3799 = null;
        field3809 = null;
        field3792 = null;
        field3793 = null;
        field3785 = null;
        field3800 = null;
        field3796 = null;
        field3794 = null;
        field3791 = null;
        field3798 = null;
        field3802 = null;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "([B)V")
    private class226(byte[] arg0) {
        this.method1545(arg0);
    }
}
