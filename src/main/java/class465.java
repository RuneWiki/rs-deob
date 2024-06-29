import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class465 extends class261 {

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "Z")
    private static boolean field6890 = false;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    private int field6896;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    private int field6897;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    private static int field6901;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
    private static int field6906;

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
    private static int field6907;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "I")
    private int field6908;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
    private int field6909;

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
    private static int field6914;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "I")
    private int field6915;

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "I")
    private int field6917;

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "I")
    private int field6920;

    @OriginalMember(owner = "client!fh", name = "Q", descriptor = "I")
    private int field6922;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "Z")
    private boolean field6892;

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "Z")
    private boolean field6913;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "[B")
    private static byte[] field6904;

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "[B")
    private byte[] field6921;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "[F")
    private static float[] field6893;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "[F")
    private static float[] field6895;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "[F")
    private static float[] field6898;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "[F")
    private static float[] field6903;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "[F")
    private static float[] field6910;

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "[F")
    private static float[] field6911;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "[F")
    private static float[] field6916;

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "[F")
    private float[] field6918;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "[I")
    private static int[] field6891;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "[I")
    private static int[] field6894;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "[I")
    private static int[] field6900;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "[Lho;")
    public static class104[] field6905;

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "[Lld;")
    private static class117[] field6919;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "[Lkg;")
    private static class180[] field6899;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "[Leu;")
    private static class337[] field6902;

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "[Z")
    private static boolean[] field6923;

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "[[B")
    private byte[][] field6912;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lph;I)Lfh;")
    public static final class465 method2782(class459 arg0, int arg1) {
        if (method2785(arg0)) {
            byte[] var2 = arg0.method2760((byte) 75, arg1);
            return var2 == null ? null : new class465(var2);
        } else {
            arg0.method2739(arg1, -62);
            return null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([I)Lwq;")
    public final class116 method2783(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field6921 == null) {
            this.field6915 = 0;
            this.field6918 = new float[field6906];
            this.field6921 = new byte[this.field6908];
            this.field6922 = 0;
            this.field6920 = 0;
        }
        while (this.field6920 < this.field6912.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method2789(this.field6920);
            if (var3 != null) {
                int var4 = this.field6922;
                int var5 = var3.length;
                if (var5 > this.field6908 - var4) {
                    var5 = this.field6908 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field6921[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field6922;
                }
                this.field6922 = var4;
            }
            this.field6920++;
        }
        this.field6918 = null;
        byte[] var2 = this.field6921;
        this.field6921 = null;
        return new class116(this.field6896, var2, this.field6917, this.field6897, this.field6892);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([B)V")
    private static final void method2784(byte[] arg0) {
        method2787(arg0, 0);
        field6914 = 0x1 << method2793(4);
        field6906 = 0x1 << method2793(4);
        field6911 = new float[field6906];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field6914 : field6906;
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
            int var25 = class170.method1189(0, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class497.method3005(var26, 80, var25);
            }
            if (var1 == 0) {
                field6903 = var18;
                field6895 = var20;
                field6910 = var22;
                field6894 = var24;
            } else {
                field6916 = var18;
                field6893 = var20;
                field6898 = var22;
                field6891 = var24;
            }
        }
        int var2 = method2793(8) + 1;
        field6905 = new class104[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field6905[var3] = new class104();
        }
        int var4 = method2793(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method2793(16);
        }
        int var6 = method2793(6) + 1;
        field6902 = new class337[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field6902[var7] = new class337();
        }
        int var8 = method2793(6) + 1;
        field6919 = new class117[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field6919[var9] = new class117();
        }
        int var10 = method2793(6) + 1;
        field6899 = new class180[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field6899[var11] = new class180();
        }
        int var12 = method2793(6) + 1;
        field6923 = new boolean[var12];
        field6900 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field6923[var13] = method2788() != 0;
            method2793(16);
            method2793(16);
            field6900[var13] = method2793(8);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lph;)Z")
    private static final boolean method2785(class459 arg0) {
        if (!field6890) {
            byte[] var1 = arg0.method2757(0, 0, (byte) -121);
            if (var1 == null) {
                return false;
            }
            method2784(var1);
            field6890 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "([B)V")
    private final void method2786(byte[] arg0) {
        class289 var2 = new class289(arg0);
        this.field6896 = var2.method1815((byte) -88);
        this.field6908 = var2.method1815((byte) -69);
        this.field6917 = var2.method1815((byte) -41);
        this.field6897 = var2.method1815((byte) -92);
        if (this.field6897 < 0) {
            this.field6897 = ~this.field6897;
            this.field6892 = true;
        }
        int var3 = var2.method1815((byte) -80);
        this.field6912 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1858(-3256);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1849(var5, -1, var7, 0);
            this.field6912[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([BI)V")
    private static final void method2787(byte[] arg0, int arg1) {
        field6904 = arg0;
        field6907 = arg1;
        field6901 = 0;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "()I")
    public static final int method2788() {
        int var0 = field6904[field6907] >> field6901 & 0x1;
        field6901++;
        field6907 += field6901 >> 3;
        field6901 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)[F")
    private final float[] method2789(int arg0) {
        method2787(this.field6912[arg0], 0);
        method2788();
        int var2 = method2793(class170.method1189(0, field6900.length - 1));
        boolean var3 = field6923[var2];
        int var4 = var3 ? field6906 : field6914;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2788() != 0;
            var6 = method2788() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field6914 >> 2);
            var9 = (field6914 >> 2) + (var4 >> 2);
            var10 = field6914 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field6914 >> 2);
            var12 = (field6914 >> 2) + (var4 - (var4 >> 2));
            var13 = field6914 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class180 var14 = field6899[field6900[var2]];
        int var15 = var14.field2922;
        int var16 = var14.field2923[var15];
        boolean var17 = !field6902[var16].method2116();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2921; var19++) {
            class117 var95 = field6919[var14.field2920[var19]];
            float[] var96 = field6911;
            var95.method956(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2922;
            int var21 = var14.field2923[var20];
            field6902[var21].method2114(field6911, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field6911[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field6911;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field6916 : field6903;
            float[] var30 = var3 ? field6893 : field6895;
            float[] var31 = var3 ? field6898 : field6910;
            int[] var32 = var3 ? field6891 : field6894;
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
            int var35 = class170.method1189(0, var4 - 1);
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
                field6911[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field6911[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field6915 > 0) {
            int var49 = this.field6915 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field6913) {
                for (int var50 = 0; var50 < this.field6909; var50++) {
                    int var51 = (this.field6915 >> 1) + var50;
                    var48[var50] += this.field6918[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field6911[var52];
                }
            }
        }
        float[] var54 = this.field6918;
        this.field6918 = field6911;
        field6911 = var54;
        this.field6915 = var4;
        this.field6909 = var12 - (var4 >> 1);
        this.field6913 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)F")
    public static final float method2790(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "()V")
    public static void method2791() {
        field6904 = null;
        field6905 = null;
        field6902 = null;
        field6919 = null;
        field6899 = null;
        field6923 = null;
        field6900 = null;
        field6911 = null;
        field6903 = null;
        field6895 = null;
        field6910 = null;
        field6916 = null;
        field6893 = null;
        field6898 = null;
        field6894 = null;
        field6891 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lph;II)Lfh;")
    public static final class465 method2792(class459 arg0, int arg1, int arg2) {
        if (method2785(arg0)) {
            byte[] var3 = arg0.method2757(arg1, arg2, (byte) -124);
            return var3 == null ? null : new class465(var3);
        } else {
            arg0.method2741(arg2, 1164, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "([B)V")
    private class465(byte[] arg0) {
        this.method2786(arg0);
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)I")
    public static final int method2793(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field6901) {
            int var4 = 8 - field6901;
            int var5 = (0x1 << var4) - 1;
            var1 += (field6904[field6907] >> field6901 & var5) << var2;
            field6901 = 0;
            field6907++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field6904[field6907] >> field6901 & var3) << var2;
            field6901 += arg0;
        }
        return var1;
    }
}
