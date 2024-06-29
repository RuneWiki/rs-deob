import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class297 extends class270 {

    @OriginalMember(owner = "client!ofa", name = "S", descriptor = "Z")
    private static boolean field3907 = false;

    @OriginalMember(owner = "client!ofa", name = "n", descriptor = "I")
    private int field3876;

    @OriginalMember(owner = "client!ofa", name = "u", descriptor = "I")
    private int field3883;

    @OriginalMember(owner = "client!ofa", name = "w", descriptor = "I")
    private static int field3885;

    @OriginalMember(owner = "client!ofa", name = "A", descriptor = "I")
    private int field3889;

    @OriginalMember(owner = "client!ofa", name = "C", descriptor = "I")
    private static int field3891;

    @OriginalMember(owner = "client!ofa", name = "E", descriptor = "I")
    private int field3893;

    @OriginalMember(owner = "client!ofa", name = "H", descriptor = "I")
    private static int field3896;

    @OriginalMember(owner = "client!ofa", name = "I", descriptor = "I")
    private int field3897;

    @OriginalMember(owner = "client!ofa", name = "M", descriptor = "I")
    private static int field3901;

    @OriginalMember(owner = "client!ofa", name = "O", descriptor = "I")
    private int field3903;

    @OriginalMember(owner = "client!ofa", name = "Q", descriptor = "I")
    private int field3905;

    @OriginalMember(owner = "client!ofa", name = "T", descriptor = "I")
    private int field3908;

    @OriginalMember(owner = "client!ofa", name = "v", descriptor = "Z")
    private boolean field3884;

    @OriginalMember(owner = "client!ofa", name = "G", descriptor = "Z")
    private boolean field3895;

    @OriginalMember(owner = "client!ofa", name = "m", descriptor = "[B")
    private static byte[] field3875;

    @OriginalMember(owner = "client!ofa", name = "R", descriptor = "[B")
    private byte[] field3906;

    @OriginalMember(owner = "client!ofa", name = "r", descriptor = "[F")
    private static float[] field3880;

    @OriginalMember(owner = "client!ofa", name = "s", descriptor = "[F")
    private static float[] field3881;

    @OriginalMember(owner = "client!ofa", name = "t", descriptor = "[F")
    private static float[] field3882;

    @OriginalMember(owner = "client!ofa", name = "z", descriptor = "[F")
    private static float[] field3888;

    @OriginalMember(owner = "client!ofa", name = "B", descriptor = "[F")
    private static float[] field3890;

    @OriginalMember(owner = "client!ofa", name = "D", descriptor = "[F")
    private float[] field3892;

    @OriginalMember(owner = "client!ofa", name = "F", descriptor = "[F")
    private static float[] field3894;

    @OriginalMember(owner = "client!ofa", name = "P", descriptor = "[F")
    private static float[] field3904;

    @OriginalMember(owner = "client!ofa", name = "x", descriptor = "[I")
    private static int[] field3886;

    @OriginalMember(owner = "client!ofa", name = "J", descriptor = "[I")
    private static int[] field3898;

    @OriginalMember(owner = "client!ofa", name = "K", descriptor = "[I")
    private static int[] field3899;

    @OriginalMember(owner = "client!ofa", name = "o", descriptor = "[Lqea;")
    private static class114[] field3877;

    @OriginalMember(owner = "client!ofa", name = "q", descriptor = "[Lub;")
    public static class20[] field3879;

    @OriginalMember(owner = "client!ofa", name = "L", descriptor = "[Lkl;")
    private static class71[] field3900;

    @OriginalMember(owner = "client!ofa", name = "p", descriptor = "[Lsd;")
    private static class82[] field3878;

    @OriginalMember(owner = "client!ofa", name = "y", descriptor = "[Z")
    private static boolean[] field3887;

    @OriginalMember(owner = "client!ofa", name = "N", descriptor = "[[B")
    private byte[][] field3902;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "()I", line = 6)
    public static final int method1679() {
        int var0 = field3875[field3885] >> field3891 & 0x1;
        field3891++;
        field3885 += field3891 >> 3;
        field3891 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Ljo;)Z", line = 14)
    private static final boolean method1680(class303 arg0) {
        if (!field3907) {
            byte[] var1 = arg0.method1719(0, 0, 4);
            if (var1 == null) {
                return false;
            }
            method1682(var1);
            field3907 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "()V", line = 30)
    public static void method1681() {
        field3875 = null;
        field3879 = null;
        field3878 = null;
        field3877 = null;
        field3900 = null;
        field3887 = null;
        field3886 = null;
        field3890 = null;
        field3882 = null;
        field3881 = null;
        field3904 = null;
        field3880 = null;
        field3888 = null;
        field3894 = null;
        field3899 = null;
        field3898 = null;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "([B)V", line = 51)
    private static final void method1682(byte[] arg0) {
        method1687(arg0, 0);
        field3901 = 0x1 << method1686(4);
        field3896 = 0x1 << method1686(4);
        field3890 = new float[field3896];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3901 : field3896;
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
            int var25 = class465.method2644(var17 - 1, 4);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class599.method3351((byte) 7, var25, var26);
            }
            if (var1 == 0) {
                field3882 = var18;
                field3881 = var20;
                field3904 = var22;
                field3899 = var24;
            } else {
                field3880 = var18;
                field3888 = var20;
                field3894 = var22;
                field3898 = var24;
            }
        }
        int var2 = method1686(8) + 1;
        field3879 = new class20[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3879[var3] = new class20();
        }
        int var4 = method1686(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1686(16);
        }
        int var6 = method1686(6) + 1;
        field3878 = new class82[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3878[var7] = new class82();
        }
        int var8 = method1686(6) + 1;
        field3877 = new class114[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3877[var9] = new class114();
        }
        int var10 = method1686(6) + 1;
        field3900 = new class71[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3900[var11] = new class71();
        }
        int var12 = method1686(6) + 1;
        field3887 = new boolean[var12];
        field3886 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3887[var13] = method1679() != 0;
            method1686(16);
            method1686(16);
            field3886[var13] = method1686(8);
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Ljo;II)Lofa;", line = 212)
    public static final class297 method1683(class303 arg0, int arg1, int arg2) {
        if (method1680(arg0)) {
            byte[] var3 = arg0.method1719(arg2, arg1, 4);
            return var3 == null ? null : new class297(var3);
        } else {
            arg0.method1739(arg1, arg2, -2);
            return null;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "([B)V", line = 233)
    private final void method1684(byte[] arg0) {
        class452 var2 = new class452(arg0);
        this.field3889 = var2.method2575((byte) -48);
        this.field3903 = var2.method2575((byte) -48);
        this.field3883 = var2.method2575((byte) -48);
        this.field3893 = var2.method2575((byte) -48);
        if (this.field3893 < 0) {
            this.field3893 = ~this.field3893;
            this.field3895 = true;
        }
        int var3 = var2.method2575((byte) -48);
        this.field3902 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2541(75);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2552(0, 4, var5, var7);
            this.field3902[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)F", line = 280)
    public static final float method1685(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "(I)I", line = 292)
    public static final int method1686(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3891) {
            int var4 = 8 - field3891;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3875[field3885] >> field3891 & var5) << var2;
            field3891 = 0;
            field3885++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3875[field3885] >> field3891 & var3) << var2;
            field3891 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "([BI)V", line = 320)
    private static final void method1687(byte[] arg0, int arg1) {
        field3875 = arg0;
        field3885 = arg1;
        field3891 = 0;
    }

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "(I)[F", line = 325)
    private final float[] method1688(int arg0) {
        method1687(this.field3902[arg0], 0);
        method1679();
        int var2 = method1686(class465.method2644(field3886.length - 1, 4));
        boolean var3 = field3887[var2];
        int var4 = var3 ? field3896 : field3901;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1679() != 0;
            var6 = method1679() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3901 >> 2);
            var9 = (field3901 >> 2) + (var4 >> 2);
            var10 = field3901 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3901 >> 2);
            var12 = (field3901 >> 2) + (var4 - (var4 >> 2));
            var13 = field3901 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class71 var14 = field3900[field3886[var2]];
        int var15 = var14.field754;
        int var16 = var14.field757[var15];
        boolean var17 = !field3878[var16].method528();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field756; var19++) {
            class114 var95 = field3877[var14.field755[var19]];
            float[] var96 = field3890;
            var95.method702(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field754;
            int var21 = var14.field757[var20];
            field3878[var21].method525(field3890, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field3890[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field3890;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3880 : field3882;
            float[] var30 = var3 ? field3888 : field3881;
            float[] var31 = var3 ? field3894 : field3904;
            int[] var32 = var3 ? field3898 : field3899;
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
            int var35 = class465.method2644(var4 - 1, 4);
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
                field3890[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3890[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field3876 > 0) {
            int var49 = this.field3876 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field3884) {
                for (int var50 = 0; var50 < this.field3897; var50++) {
                    int var51 = (this.field3876 >> 1) + var50;
                    var48[var50] += this.field3892[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3890[var52];
                }
            }
        }
        float[] var54 = this.field3892;
        this.field3892 = field3890;
        field3890 = var54;
        this.field3876 = var4;
        this.field3897 = var12 - (var4 >> 1);
        this.field3884 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Ljo;I)Lofa;", line = 737)
    public static final class297 method1689(class303 arg0, int arg1) {
        if (method1680(arg0)) {
            byte[] var2 = arg0.method1722(arg1, 0);
            return var2 == null ? null : new class297(var2);
        } else {
            arg0.method1711(arg1, 1);
            return null;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "([I)Lwb;", line = 752)
    public final class298 method1690(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3906 == null) {
            this.field3876 = 0;
            this.field3892 = new float[field3896];
            this.field3906 = new byte[this.field3903];
            this.field3908 = 0;
            this.field3905 = 0;
        }
        while (this.field3905 < this.field3902.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1688(this.field3905);
            if (var3 != null) {
                int var4 = this.field3908;
                int var5 = var3.length;
                if (var5 > this.field3903 - var4) {
                    var5 = this.field3903 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field3906[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field3908;
                }
                this.field3908 = var4;
            }
            this.field3905++;
        }
        this.field3892 = null;
        byte[] var2 = this.field3906;
        this.field3906 = null;
        return new class298(this.field3889, var2, this.field3883, this.field3893, this.field3895);
    }

    @OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "([B)V", line = 812)
    private class297(byte[] arg0) {
        this.method1684(arg0);
    }
}
