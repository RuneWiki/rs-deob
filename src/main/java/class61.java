import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class61 extends class101 {

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "Z")
    private static boolean field844 = false;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    private int field827;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    private int field829;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
    private static int field835;

    @OriginalMember(owner = "client!mk", name = "E", descriptor = "I")
    private int field841;

    @OriginalMember(owner = "client!mk", name = "G", descriptor = "I")
    private static int field843;

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "I")
    private int field846;

    @OriginalMember(owner = "client!mk", name = "K", descriptor = "I")
    private static int field847;

    @OriginalMember(owner = "client!mk", name = "O", descriptor = "I")
    private int field851;

    @OriginalMember(owner = "client!mk", name = "Q", descriptor = "I")
    private int field853;

    @OriginalMember(owner = "client!mk", name = "S", descriptor = "I")
    private static int field854;

    @OriginalMember(owner = "client!mk", name = "V", descriptor = "I")
    private int field856;

    @OriginalMember(owner = "client!mk", name = "W", descriptor = "I")
    private int field857;

    @OriginalMember(owner = "client!mk", name = "F", descriptor = "Z")
    private boolean field842;

    @OriginalMember(owner = "client!mk", name = "N", descriptor = "Z")
    private boolean field850;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "[B")
    private static byte[] field836;

    @OriginalMember(owner = "client!mk", name = "U", descriptor = "[B")
    private byte[] field855;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "[F")
    private static float[] field825;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "[F")
    private static float[] field831;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "[F")
    private static float[] field832;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "[F")
    private static float[] field834;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "[F")
    private static float[] field837;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "[F")
    private float[] field839;

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "[F")
    private static float[] field840;

    @OriginalMember(owner = "client!mk", name = "I", descriptor = "[F")
    private static float[] field845;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "[I")
    private static int[] field824;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "[I")
    private static int[] field830;

    @OriginalMember(owner = "client!mk", name = "M", descriptor = "[I")
    private static int[] field849;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "[Lwk;")
    public static class153[] field833;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "[Lrt;")
    private static class240[] field828;

    @OriginalMember(owner = "client!mk", name = "L", descriptor = "[Lmu;")
    private static class318[] field848;

    @OriginalMember(owner = "client!mk", name = "P", descriptor = "[Lpt;")
    private static class557[] field852;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "[Z")
    private static boolean[] field826;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "[[B")
    private byte[][] field838;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "()I", line = 6)
    public static final int method422() {
        int var0 = field836[field854] >> field835 & 0x1;
        field835++;
        field854 += field835 >> 3;
        field835 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Laj;I)Lmk;", line = 16)
    public static final class61 method423(class333 arg0, int arg1) {
        if (method433(arg0)) {
            byte[] var2 = arg0.method2114(arg1, false);
            return var2 == null ? null : new class61(var2);
        } else {
            arg0.method2104(-96, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Laj;II)Lmk;", line = 35)
    public static final class61 method424(class333 arg0, int arg1, int arg2) {
        if (method433(arg0)) {
            byte[] var3 = arg0.method2095(arg2, arg1, 1);
            return var3 == null ? null : new class61(var3);
        } else {
            arg0.method2120(-5241, arg2, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([B)V", line = 53)
    private final void method425(byte[] arg0) {
        class376 var2 = new class376(arg0);
        this.field829 = var2.method2384(7);
        this.field846 = var2.method2384(70);
        this.field851 = var2.method2384(94);
        this.field827 = var2.method2384(93);
        if (this.field827 < 0) {
            this.field827 = ~this.field827;
            this.field842 = true;
        }
        int var3 = var2.method2384(93);
        this.field838 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2398(-1372747256);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2389(0, 689125352, var5, var7);
            this.field838[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([I)Lks;", line = 96)
    public final class465 method426(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field855 == null) {
            this.field841 = 0;
            this.field839 = new float[field843];
            this.field855 = new byte[this.field846];
            this.field857 = 0;
            this.field856 = 0;
        }
        while (this.field856 < this.field838.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method429(this.field856);
            if (var3 != null) {
                int var4 = this.field857;
                int var5 = var3.length;
                if (var5 > this.field846 - var4) {
                    var5 = this.field846 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field855[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field857;
                }
                this.field857 = var4;
            }
            this.field856++;
        }
        this.field839 = null;
        byte[] var2 = this.field855;
        this.field855 = null;
        return new class465(this.field829, var2, this.field851, this.field827, this.field842);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)F", line = 158)
    public static final float method427(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "()V", line = 169)
    public static void method428() {
        field836 = null;
        field833 = null;
        field848 = null;
        field828 = null;
        field852 = null;
        field826 = null;
        field824 = null;
        field831 = null;
        field834 = null;
        field845 = null;
        field832 = null;
        field840 = null;
        field825 = null;
        field837 = null;
        field830 = null;
        field849 = null;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)[F", line = 194)
    private final float[] method429(int arg0) {
        method431(this.field838[arg0], 0);
        method422();
        int var2 = method430(class485.method2812(9761, field824.length - 1));
        boolean var3 = field826[var2];
        int var4 = var3 ? field843 : field847;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method422() != 0;
            var6 = method422() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field847 >> 2);
            var9 = (field847 >> 2) + (var4 >> 2);
            var10 = field847 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field847 >> 2);
            var12 = (field847 >> 2) + (var4 - (var4 >> 2));
            var13 = field847 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class557 var14 = field852[field824[var2]];
        int var15 = var14.field7504;
        int var16 = var14.field7506[var15];
        boolean var17 = !field848[var16].method1998();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field7505; var19++) {
            class240 var95 = field828[var14.field7507[var19]];
            float[] var96 = field831;
            var95.method1556(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field7504;
            int var21 = var14.field7506[var20];
            field848[var21].method2004(field831, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field831[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field831;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field840 : field834;
            float[] var30 = var3 ? field825 : field845;
            float[] var31 = var3 ? field837 : field832;
            int[] var32 = var3 ? field849 : field830;
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
            int var35 = class485.method2812(9761, var4 - 1);
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
                field831[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field831[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field841 > 0) {
            int var49 = this.field841 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field850) {
                for (int var50 = 0; var50 < this.field853; var50++) {
                    int var51 = (this.field841 >> 1) + var50;
                    var48[var50] += this.field839[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field831[var52];
                }
            }
        }
        float[] var54 = this.field839;
        this.field839 = field831;
        field831 = var54;
        this.field841 = var4;
        this.field853 = var12 - (var4 >> 1);
        this.field850 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)I", line = 607)
    public static final int method430(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field835) {
            int var4 = 8 - field835;
            int var5 = (0x1 << var4) - 1;
            var1 += (field836[field854] >> field835 & var5) << var2;
            field835 = 0;
            field854++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field836[field854] >> field835 & var3) << var2;
            field835 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([BI)V", line = 638)
    private static final void method431(byte[] arg0, int arg1) {
        field836 = arg0;
        field854 = arg1;
        field835 = 0;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "([B)V", line = 646)
    private static final void method432(byte[] arg0) {
        method431(arg0, 0);
        field847 = 0x1 << method430(4);
        field843 = 0x1 << method430(4);
        field831 = new float[field843];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field847 : field843;
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
            int var25 = class485.method2812(9761, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class302.method1907(8443, var26, var25);
            }
            if (var1 == 0) {
                field834 = var18;
                field845 = var20;
                field832 = var22;
                field830 = var24;
            } else {
                field840 = var18;
                field825 = var20;
                field837 = var22;
                field849 = var24;
            }
        }
        int var2 = method430(8) + 1;
        field833 = new class153[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field833[var3] = new class153();
        }
        int var4 = method430(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method430(16);
        }
        int var6 = method430(6) + 1;
        field848 = new class318[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field848[var7] = new class318();
        }
        int var8 = method430(6) + 1;
        field828 = new class240[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field828[var9] = new class240();
        }
        int var10 = method430(6) + 1;
        field852 = new class557[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field852[var11] = new class557();
        }
        int var12 = method430(6) + 1;
        field826 = new boolean[var12];
        field824 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field826[var13] = method422() != 0;
            method430(16);
            method430(16);
            field824[var13] = method430(8);
        }
        field844 = true;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Laj;)Z", line = 804)
    private static final boolean method433(class333 arg0) {
        if (!field844) {
            byte[] var1 = arg0.method2095(0, 0, 1);
            if (var1 == null) {
                return false;
            }
            method432(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "([B)V", line = 816)
    private class61(byte[] arg0) {
        this.method425(arg0);
    }
}
