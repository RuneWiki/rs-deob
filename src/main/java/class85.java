import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class85 {

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "Z")
    private static boolean field1905 = false;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    private static int field1890;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    private static int field1900;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    private static int field1901;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    private static int field1903;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    private static int field1904;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    private int field1910;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    private int field1912;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    private int field1914;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    private static int field1919;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
    private int field1920;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "Z")
    private boolean field1897;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "Z")
    private static boolean field1906;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "[B")
    private static byte[] field1916;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "[F")
    private static float[] field1892;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "[F")
    private static float[] field1893;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "[F")
    private static float[] field1896;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "[F")
    private static float[] field1899;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "[F")
    private static float[] field1902;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "[F")
    private static float[] field1913;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "[F")
    private static float[] field1917;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "[F")
    private static float[] field1918;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "[I")
    private static int[] field1891;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "[I")
    private static int[] field1911;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "[I")
    private static int[] field1915;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "[Lvb;")
    private static class144[] field1909;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "[Lce;")
    private static class20[] field1907;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "[Lgd;")
    private static class46[] field1894;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "[Lk;")
    public static class69[] field1895;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "[Z")
    private static boolean[] field1908;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "[[B")
    private byte[][] field1898;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([BI)V", line = 6)
    private static final void method722(byte[] arg0, int arg1) {
        field1916 = arg0;
        field1901 = arg1;
        field1904 = 0;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([B)V", line = 11)
    private static final void method723(byte[] arg0) {
        method722(arg0, 0);
        field1903 = 0x1 << method731(4);
        field1919 = 0x1 << method731(4);
        field1917 = new float[field1919];
        field1913 = new float[field1919];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field1903 : field1919;
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
            int var25 = class18.method221(75, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class134.method1091(var25, 0, var26);
            }
            if (var1 == 0) {
                field1918 = var18;
                field1899 = var20;
                field1893 = var22;
                field1911 = var24;
            } else {
                field1892 = var18;
                field1902 = var20;
                field1896 = var22;
                field1891 = var24;
            }
        }
        int var2 = method731(8) + 1;
        field1895 = new class69[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1895[var3] = new class69();
        }
        int var4 = method731(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method731(16);
        }
        int var6 = method731(6) + 1;
        field1894 = new class46[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field1894[var7] = new class46();
        }
        int var8 = method731(6) + 1;
        field1909 = new class144[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field1909[var9] = new class144();
        }
        int var10 = method731(6) + 1;
        field1907 = new class20[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field1907[var11] = new class20();
        }
        int var12 = method731(6) + 1;
        field1908 = new boolean[var12];
        field1915 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field1908[var13] = method729() != 0;
            method731(16);
            method731(16);
            field1915[var13] = method731(8);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)[F", line = 164)
    private final float[] method724(int arg0) {
        method722(this.field1898[arg0], 0);
        method729();
        int var2 = method731(class18.method221(67, field1915.length - 1));
        boolean var3 = field1908[var2];
        int var4 = var3 ? field1919 : field1903;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method729() != 0;
            var6 = method729() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1903 >> 2);
            var9 = (field1903 >> 2) + (var4 >> 2);
            var10 = field1903 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1903 >> 2);
            var12 = (field1903 >> 2) + (var4 - (var4 >> 2));
            var13 = field1903 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class20 var14 = field1907[field1915[var2]];
        int var15 = var14.field541;
        int var16 = var14.field542[var15];
        boolean var17 = !field1894[var16].method527();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field540; var19++) {
            class144 var95 = field1909[var14.field543[var19]];
            float[] var96 = field1917;
            var95.method1164(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field541;
            int var21 = var14.field542[var20];
            field1894[var21].method528(field1917, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field1917[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field1917;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field1892 : field1918;
            float[] var30 = var3 ? field1902 : field1899;
            float[] var31 = var3 ? field1896 : field1893;
            int[] var32 = var3 ? field1891 : field1911;
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
            int var35 = class18.method221(68, var4 - 1);
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
                field1917[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field1917[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (field1900 > 0) {
            int var49 = field1900 + var4 >> 2;
            var48 = new float[var49];
            if (!field1906) {
                for (int var50 = 0; var50 < field1890; var50++) {
                    int var51 = (field1900 >> 1) + var50;
                    var48[var50] += field1913[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field1917[var52];
                }
            }
        }
        float[] var54 = field1913;
        field1913 = field1917;
        field1917 = var54;
        field1900 = var4;
        field1890 = var12 - (var4 >> 1);
        field1906 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Loc;)Z", line = 581)
    private static final boolean method725(class100 arg0) {
        if (!field1905) {
            byte[] var1 = arg0.method839(5, 0, 0);
            if (var1 == null) {
                return false;
            }
            method723(var1);
            field1905 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Loc;II)Lmb;", line = 598)
    public static final class85 method726(class100 arg0, int arg1, int arg2) {
        if (method725(arg0)) {
            byte[] var3 = arg0.method839(5, arg1, arg2);
            return var3 == null ? null : new class85(var3);
        } else {
            arg0.method835((byte) 43, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "()V", line = 612)
    public static void method727() {
        field1916 = null;
        field1895 = null;
        field1894 = null;
        field1909 = null;
        field1907 = null;
        field1908 = null;
        field1915 = null;
        field1913 = null;
        field1917 = null;
        field1918 = null;
        field1899 = null;
        field1893 = null;
        field1892 = null;
        field1902 = null;
        field1896 = null;
        field1911 = null;
        field1891 = null;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "()Lpa;", line = 632)
    public final class105 method728() {
        field1900 = 0;
        byte[] var1 = new byte[this.field1914];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1898.length; var3++) {
            float[] var4 = this.method724(var3);
            if (var4 != null) {
                int var5 = var4.length;
                if (var5 > this.field1914 - var2) {
                    var5 = this.field1914 - var2;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var4[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    var1[var2++] = (byte) (var7 - 128);
                }
            }
        }
        return new class105(this.field1920, var1, this.field1910, this.field1912, this.field1897);
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "()I", line = 675)
    public static final int method729() {
        int var0 = field1916[field1901] >> field1904 & 0x1;
        field1904++;
        field1901 += field1904 >> 3;
        field1904 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "([B)V", line = 686)
    private final void method730(byte[] arg0) {
        class25 var2 = new class25(arg0);
        this.field1920 = var2.method313((byte) -104);
        this.field1914 = var2.method313((byte) 115);
        this.field1910 = var2.method313((byte) 122);
        this.field1912 = var2.method313((byte) 86);
        if (this.field1912 < 0) {
            this.field1912 = ~this.field1912;
            this.field1897 = true;
        }
        int var3 = var2.method313((byte) 98);
        this.field1898 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method322((byte) -50);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method305(0, (byte) 88, var7, var5);
            this.field1898[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)I", line = 742)
    public static final int method731(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1904) {
            int var4 = 8 - field1904;
            int var5 = (0x1 << var4) - 1;
            var1 += (field1916[field1901] >> field1904 & var5) << var2;
            field1904 = 0;
            field1901++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field1916[field1901] >> field1904 & var3) << var2;
            field1904 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)F", line = 772)
    public static final float method732(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([B)V", line = 793)
    private class85(byte[] arg0) {
        this.method730(arg0);
    }
}
