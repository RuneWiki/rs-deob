import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class197 extends class151 {

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "Z")
    private static boolean field3656 = false;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    private static int field3643;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    private int field3644;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    private static int field3645;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    private int field3646;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    private int field3647;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
    private static int field3653;

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
    private int field3662;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
    private static int field3666;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
    private int field3668;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
    private int field3669;

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "I")
    private int field3673;

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "I")
    private int field3674;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "Z")
    private boolean field3642;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "Z")
    private boolean field3649;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "[B")
    private static byte[] field3650;

    @OriginalMember(owner = "client!sc", name = "W", descriptor = "[B")
    private byte[] field3675;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "[F")
    private static float[] field3652;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "[F")
    private static float[] field3654;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "[F")
    private static float[] field3655;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "[F")
    private static float[] field3658;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "[F")
    private static float[] field3661;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "[F")
    private float[] field3665;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "[F")
    private static float[] field3671;

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "[F")
    private static float[] field3672;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "[I")
    private static int[] field3648;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "[I")
    private static int[] field3657;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "[I")
    private static int[] field3659;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "[Lna;")
    private static class142[] field3651;

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "[Lqb;")
    private static class176[] field3670;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "[Lbh;")
    public static class20[] field3667;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "[Lvd;")
    private static class228[] field3664;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "[Z")
    private static boolean[] field3663;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "[[B")
    private byte[][] field3660;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([BI)V")
    private static final void method1246(byte[] arg0, int arg1) {
        field3650 = arg0;
        field3645 = arg1;
        field3643 = 0;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)I")
    public static final int method1247(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3643) {
            int var4 = 8 - field3643;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3650[field3645] >> field3643 & var5) << var2;
            field3643 = 0;
            field3645++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3650[field3645] >> field3643 & var3) << var2;
            field3643 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)F")
    public static final float method1248(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()V")
    public static void method1249() {
        field3650 = null;
        field3667 = null;
        field3664 = null;
        field3670 = null;
        field3651 = null;
        field3663 = null;
        field3657 = null;
        field3671 = null;
        field3661 = null;
        field3658 = null;
        field3652 = null;
        field3655 = null;
        field3654 = null;
        field3672 = null;
        field3648 = null;
        field3659 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([I)Lqc;")
    public final class177 method1250(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3675 == null) {
            this.field3644 = 0;
            this.field3665 = new float[field3653];
            this.field3675 = new byte[this.field3668];
            this.field3673 = 0;
            this.field3674 = 0;
        }
        while (this.field3674 < this.field3660.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1251(this.field3674);
            if (var3 != null) {
                int var4 = this.field3673;
                int var5 = var3.length;
                if (var5 > this.field3668 - var4) {
                    var5 = this.field3668 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field3675[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field3673;
                }
                this.field3673 = var4;
            }
            this.field3674++;
        }
        this.field3665 = null;
        byte[] var2 = this.field3675;
        this.field3675 = null;
        return new class177(this.field3646, var2, this.field3669, this.field3647, this.field3642);
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)[F")
    private final float[] method1251(int arg0) {
        method1246(this.field3660[arg0], 0);
        method1256();
        int var2 = method1247(class135.method922((byte) -126, field3657.length - 1));
        boolean var3 = field3663[var2];
        int var4 = var3 ? field3653 : field3666;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1256() != 0;
            var6 = method1256() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3666 >> 2);
            var9 = (field3666 >> 2) + (var4 >> 2);
            var10 = field3666 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3666 >> 2);
            var12 = (field3666 >> 2) + (var4 - (var4 >> 2));
            var13 = field3666 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class142 var14 = field3651[field3657[var2]];
        int var15 = var14.field2673;
        int var16 = var14.field2672[var15];
        boolean var17 = !field3664[var16].method1456();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2670; var19++) {
            class176 var95 = field3670[var14.field2671[var19]];
            float[] var96 = field3671;
            var95.method1147(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2673;
            int var21 = var14.field2672[var20];
            field3664[var21].method1455(field3671, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field3671[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field3671;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3655 : field3661;
            float[] var30 = var3 ? field3654 : field3658;
            float[] var31 = var3 ? field3672 : field3652;
            int[] var32 = var3 ? field3659 : field3648;
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
            int var35 = class135.method922((byte) -107, var4 - 1);
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
                field3671[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3671[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field3644 > 0) {
            int var49 = this.field3644 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field3649) {
                for (int var50 = 0; var50 < this.field3662; var50++) {
                    int var51 = (this.field3644 >> 1) + var50;
                    var48[var50] += this.field3665[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3671[var52];
                }
            }
        }
        float[] var54 = this.field3665;
        this.field3665 = field3671;
        field3671 = var54;
        this.field3644 = var4;
        this.field3662 = var12 - (var4 >> 1);
        this.field3649 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([B)V")
    private final void method1252(byte[] arg0) {
        class112 var2 = new class112(arg0);
        this.field3646 = var2.method759(93);
        this.field3668 = var2.method759(74);
        this.field3669 = var2.method759(124);
        this.field3647 = var2.method759(49);
        if (this.field3647 < 0) {
            this.field3647 = ~this.field3647;
            this.field3642 = true;
        }
        int var3 = var2.method759(51);
        this.field3660 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method716(-1308);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method723(var7, 0, var5, 0);
            this.field3660[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lpb;II)Lsc;")
    public static final class197 method1253(class165 arg0, int arg1, int arg2) {
        if (method1254(arg0)) {
            byte[] var3 = arg0.method1079(arg1, 103, arg2);
            return var3 == null ? null : new class197(var3);
        } else {
            arg0.method1091(-111, arg2, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lpb;)Z")
    private static final boolean method1254(class165 arg0) {
        if (!field3656) {
            byte[] var1 = arg0.method1079(0, -67, 0);
            if (var1 == null) {
                return false;
            }
            method1255(var1);
            field3656 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "([B)V")
    private static final void method1255(byte[] arg0) {
        method1246(arg0, 0);
        field3666 = 0x1 << method1247(4);
        field3653 = 0x1 << method1247(4);
        field3671 = new float[field3653];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3666 : field3653;
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
            int var25 = class135.method922((byte) 112, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class125.method818(var26, var25, (byte) 71);
            }
            if (var1 == 0) {
                field3661 = var18;
                field3658 = var20;
                field3652 = var22;
                field3648 = var24;
            } else {
                field3655 = var18;
                field3654 = var20;
                field3672 = var22;
                field3659 = var24;
            }
        }
        int var2 = method1247(8) + 1;
        field3667 = new class20[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3667[var3] = new class20();
        }
        int var4 = method1247(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1247(16);
        }
        int var6 = method1247(6) + 1;
        field3664 = new class228[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3664[var7] = new class228();
        }
        int var8 = method1247(6) + 1;
        field3670 = new class176[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3670[var9] = new class176();
        }
        int var10 = method1247(6) + 1;
        field3651 = new class142[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3651[var11] = new class142();
        }
        int var12 = method1247(6) + 1;
        field3663 = new boolean[var12];
        field3657 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3663[var13] = method1256() != 0;
            method1247(16);
            method1247(16);
            field3657[var13] = method1247(8);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "()I")
    public static final int method1256() {
        int var0 = field3650[field3645] >> field3643 & 0x1;
        field3643++;
        field3645 += field3643 >> 3;
        field3643 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "([B)V")
    private class197(byte[] arg0) {
        this.method1252(arg0);
    }
}
