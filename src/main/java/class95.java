import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class95 extends class236 {

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "Z")
    private static boolean field1927 = false;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    private static int field1914;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    private int field1916;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
    private static int field1918;

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
    private int field1921;

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "I")
    private static int field1924;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
    private int field1926;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "I")
    private int field1928;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
    private int field1931;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
    private static int field1933;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "I")
    private int field1934;

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
    private int field1941;

    @OriginalMember(owner = "client!eb", name = "ab", descriptor = "I")
    private int field1944;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "Z")
    private boolean field1913;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "Z")
    private boolean field1936;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "[B")
    private static byte[] field1917;

    @OriginalMember(owner = "client!eb", name = "Z", descriptor = "[B")
    private byte[] field1943;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "[F")
    private static float[] field1915;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "[F")
    private static float[] field1919;

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "[F")
    private static float[] field1920;

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "[F")
    private float[] field1922;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "[F")
    private static float[] field1930;

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "[F")
    private static float[] field1932;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "[F")
    private static float[] field1937;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "[F")
    private static float[] field1938;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "[I")
    private static int[] field1912;

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "[I")
    private static int[] field1925;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "[I")
    private static int[] field1939;

    @OriginalMember(owner = "client!eb", name = "bb", descriptor = "[Ltg;")
    private static class264[] field1945;

    @OriginalMember(owner = "client!eb", name = "Y", descriptor = "[Lsi;")
    private static class267[] field1942;

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "[Lwc;")
    public static class83[] field1923;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "[Lmb;")
    private static class84[] field1940;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "[Z")
    private static boolean[] field1929;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "[[B")
    private byte[][] field1935;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([B)V")
    private final void method770(byte[] arg0) {
        class8 var2 = new class8(arg0);
        this.field1928 = var2.method70(65280);
        this.field1916 = var2.method70(65280);
        this.field1931 = var2.method70(65280);
        this.field1921 = var2.method70(65280);
        if (this.field1921 < 0) {
            this.field1921 = ~this.field1921;
            this.field1913 = true;
        }
        int var3 = var2.method70(65280);
        this.field1935 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method63((byte) 108);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method51(0, var5, (byte) -105, var7);
            this.field1935[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "([B)V")
    private static final void method771(byte[] arg0) {
        method772(arg0, 0);
        field1914 = 0x1 << method776(4);
        field1924 = 0x1 << method776(4);
        field1915 = new float[field1924];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field1914 : field1924;
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
            int var25 = class120.method913(var17 - 1, 16);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class59.method549(var25, false, var26);
            }
            if (var1 == 0) {
                field1937 = var18;
                field1938 = var20;
                field1930 = var22;
                field1925 = var24;
            } else {
                field1932 = var18;
                field1919 = var20;
                field1920 = var22;
                field1939 = var24;
            }
        }
        int var2 = method776(8) + 1;
        field1923 = new class83[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1923[var3] = new class83();
        }
        int var4 = method776(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method776(16);
        }
        int var6 = method776(6) + 1;
        field1942 = new class267[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field1942[var7] = new class267();
        }
        int var8 = method776(6) + 1;
        field1945 = new class264[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field1945[var9] = new class264();
        }
        int var10 = method776(6) + 1;
        field1940 = new class84[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field1940[var11] = new class84();
        }
        int var12 = method776(6) + 1;
        field1929 = new boolean[var12];
        field1912 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field1929[var13] = method778() != 0;
            method776(16);
            method776(16);
            field1912[var13] = method776(8);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([BI)V")
    private static final void method772(byte[] arg0, int arg1) {
        field1917 = arg0;
        field1918 = arg1;
        field1933 = 0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lmc;II)Leb;")
    public static final class95 method773(class151 arg0, int arg1, int arg2) {
        if (method779(arg0)) {
            byte[] var3 = arg0.method1115(arg2, (byte) -125, arg1);
            return var3 == null ? null : new class95(var3);
        } else {
            arg0.method1100(arg2, arg1, (byte) 118);
            return null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)[F")
    private final float[] method774(int arg0) {
        method772(this.field1935[arg0], 0);
        method778();
        int var2 = method776(class120.method913(field1912.length - 1, 16));
        boolean var3 = field1929[var2];
        int var4 = var3 ? field1924 : field1914;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method778() != 0;
            var6 = method778() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1914 >> 2);
            var9 = (field1914 >> 2) + (var4 >> 2);
            var10 = field1914 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1914 >> 2);
            var12 = (field1914 >> 2) + (var4 - (var4 >> 2));
            var13 = field1914 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class84 var14 = field1940[field1912[var2]];
        int var15 = var14.field1762;
        int var16 = var14.field1765[var15];
        boolean var17 = !field1942[var16].method1832();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1763; var19++) {
            class264 var95 = field1945[var14.field1764[var19]];
            float[] var96 = field1915;
            var95.method1820(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1762;
            int var21 = var14.field1765[var20];
            field1942[var21].method1830(field1915, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field1915[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field1915;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field1932 : field1937;
            float[] var30 = var3 ? field1919 : field1938;
            float[] var31 = var3 ? field1920 : field1930;
            int[] var32 = var3 ? field1939 : field1925;
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
            int var35 = class120.method913(var4 - 1, 16);
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
                field1915[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field1915[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field1934 > 0) {
            int var49 = this.field1934 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field1936) {
                for (int var50 = 0; var50 < this.field1926; var50++) {
                    int var51 = (this.field1934 >> 1) + var50;
                    var48[var50] += this.field1922[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field1915[var52];
                }
            }
        }
        float[] var54 = this.field1922;
        this.field1922 = field1915;
        field1915 = var54;
        this.field1934 = var4;
        this.field1926 = var12 - (var4 >> 1);
        this.field1936 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "()V")
    public static void method775() {
        field1917 = null;
        field1923 = null;
        field1942 = null;
        field1945 = null;
        field1940 = null;
        field1929 = null;
        field1912 = null;
        field1915 = null;
        field1937 = null;
        field1938 = null;
        field1930 = null;
        field1932 = null;
        field1919 = null;
        field1920 = null;
        field1925 = null;
        field1939 = null;
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)I")
    public static final int method776(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1933) {
            int var4 = 8 - field1933;
            int var5 = (0x1 << var4) - 1;
            var1 += (field1917[field1918] >> field1933 & var5) << var2;
            field1933 = 0;
            field1918++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field1917[field1918] >> field1933 & var3) << var2;
            field1933 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([I)Lbd;")
    public final class258 method777(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1943 == null) {
            this.field1934 = 0;
            this.field1922 = new float[field1924];
            this.field1943 = new byte[this.field1916];
            this.field1941 = 0;
            this.field1944 = 0;
        }
        while (this.field1944 < this.field1935.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method774(this.field1944);
            if (var3 != null) {
                int var4 = this.field1941;
                int var5 = var3.length;
                if (var5 > this.field1916 - var4) {
                    var5 = this.field1916 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field1943[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field1941;
                }
                this.field1941 = var4;
            }
            this.field1944++;
        }
        this.field1922 = null;
        byte[] var2 = this.field1943;
        this.field1943 = null;
        return new class258(this.field1928, var2, this.field1931, this.field1921, this.field1913);
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "()I")
    public static final int method778() {
        int var0 = field1917[field1918] >> field1933 & 0x1;
        field1933++;
        field1918 += field1933 >> 3;
        field1933 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lmc;)Z")
    private static final boolean method779(class151 arg0) {
        if (!field1927) {
            byte[] var1 = arg0.method1115(0, (byte) -78, 0);
            if (var1 == null) {
                return false;
            }
            method771(var1);
            field1927 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)F")
    public static final float method780(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "([B)V")
    private class95(byte[] arg0) {
        this.method770(arg0);
    }
}
