import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class153 extends class193 {

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "Lm;")
    private class242 field1932 = new class242();

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lse;")
    public class282 field1920;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "[[I")
    private int[][] field1925;

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "[[I")
    private int[][] field1955;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public int field1924;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public int field1921;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public int field1923;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "[[[I")
    private int[][][] field1926;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "[[[Lep;")
    private class358[][][] field1937;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "[[[I")
    public int[][][] field1930;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "[[[I")
    public int[][][] field1928;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "[[[I")
    private int[][][] field1933;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "[[[I")
    private int[][][] field1934;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "[[S")
    public short[][] field1931;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "[[B")
    private byte[][] field1919;

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "[[B")
    private byte[][] field1954;

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "[[F")
    private float[][] field1947;

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "[[F")
    private float[][] field1946;

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "[[F")
    private float[][] field1950;

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "Lbo;")
    private class453 field1952;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "Lam;")
    private class76 field1938;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "Lfb;")
    public static class341 field1922 = new class341(1);

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "[I")
    private static int[] field1935 = new int[1];

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "[I")
    private static int[] field1940 = new int[1];

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "[I")
    private static int[] field1939 = new int[1];

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "[F")
    private static float[] field1941 = new float[16];

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    private int field1927;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    private int field1929;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "I")
    private static int field1936;

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "I")
    private int field1945;

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "I")
    private int field1951;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "Lkr;")
    private class26 field1943;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "Lkr;")
    public class26 field1944;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "Lkr;")
    public class26 field1948;

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "Lkr;")
    public class26 field1949;

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "Lkr;")
    public class26 field1953;

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "Lmp;")
    private class89 field1956;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "[Lep;")
    private class358[] field1942;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILc;)Lc;")
    public final class308 method735(int arg0, int arg1, class308 arg2) {
        if ((this.field1919[arg0][arg1] & 0x1) == 0) {
            return null;
        }
        int var4 = this.field1923 >> this.field1920.field4154;
        class220 var5 = (class220) arg2;
        class220 var6;
        if (var5 != null && var5.method1444(var4, 1906328304, var4)) {
            var6 = var5;
            var5.method1443((byte) 94);
        } else {
            var6 = new class220(this.field1920, var4, var4);
        }
        var6.method1442(var4, -1, var4, 0, 0);
        this.method1035(var6, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lse;IIII[[I[[II)V")
    public class153(class282 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field1920 = arg0;
        this.field1925 = arg5;
        this.field1955 = arg6;
        this.field1924 = arg2;
        while (arg7 > 1) {
            this.field1921++;
            arg7 >>= 0x1;
        }
        this.field1923 = 0x1 << this.field1921;
        this.field1926 = new int[arg3][arg4][];
        this.field1937 = new class358[arg3][arg4][];
        this.field1930 = new int[arg3][arg4][];
        this.field1928 = new int[arg3][arg4][];
        this.field1933 = new int[arg3][arg4][];
        this.field1934 = new int[arg3][arg4][];
        this.field1931 = new short[arg3 * arg4][];
        this.field1919 = new byte[arg3][arg4];
        this.field1954 = new byte[arg3 + 1][arg4 + 1];
        this.field1947 = new float[arg3 + 1][arg4 + 1];
        this.field1946 = new float[arg3 + 1][arg4 + 1];
        this.field1950 = new float[arg3 + 1][arg4 + 1];
        for (int var9 = 1; var9 < arg4; var9++) {
            for (int var10 = 1; var10 < arg3; var10++) {
                int var11 = this.field1925[var10 + 1][var9] - this.field1925[var10 - 1][var9];
                int var12 = this.field1925[var10][var9 + 1] - this.field1925[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var11 * var11 + 65536)));
                this.field1947[var10][var9] = (float) var11 * var13;
                this.field1946[var10][var9] = var13 * -256.0F;
                this.field1950[var10][var9] = (float) var12 * var13;
            }
        }
        this.field1952 = new class453(128);
        if ((this.field1924 & 0x10) != 0) {
            this.field1938 = new class76(this.field1920, this);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lis;II)V")
    private final void method1035(class220 arg0, int arg1, int arg2) {
        int[] var4 = this.field1930[arg1][arg2];
        int[] var5 = this.field1928[arg1][arg2];
        int var6 = var4.length;
        if (field1940.length < var6) {
            field1940 = new int[var6];
            field1935 = new int[var6];
        }
        for (int var7 = 0; var7 < var6; var7++) {
            field1940[var7] = (var4[var7] & 0xFF) >> this.field1920.field4154;
            field1935[var7] = (var5[var7] & 0xFF) >> this.field1920.field4154;
        }
        int var8 = 0;
        while (var8 < var6) {
            int var9 = field1940[var8];
            int var10 = field1935[var8++];
            int var11 = field1940[var8];
            int var12 = field1935[var8++];
            int var13 = field1940[var8];
            int var14 = field1935[var8++];
            if ((var9 - var11) * (var12 - var14) - (var12 - var10) * (var13 - var11) > 0) {
                arg0.method1440(var13, var9, var12, -106, var11, var10, var14);
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)I")
    public final int method725(int arg0, int arg1) {
        int var3 = arg0 >> this.field1921;
        int var4 = arg1 >> this.field1921;
        if (var3 < 0 || var4 < 0 || var3 > this.field2681 - 1 || var4 > this.field2685 - 1) {
            return 0;
        }
        int var5 = arg0 & this.field1923 - 1;
        int var6 = arg1 & this.field1923 - 1;
        int var7 = (this.field1923 - var5) * this.field1925[var3][var4] + this.field1925[var3 + 1][var4] * var5 >> this.field1921;
        int var8 = (this.field1923 - var5) * this.field1925[var3][var4 + 1] + this.field1925[var3 + 1][var4 + 1] * var5 >> this.field1921;
        return (this.field1923 - var6) * var7 + var6 * var8 >> this.field1921;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ldn;[I)V")
    public final void method734(class16 arg0, int[] arg1) {
        this.field1932.method1560(-121, new class182(this.field1920, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(III)V")
    public final void method728(int arg0, int arg1, int arg2) {
        if ((this.field1954[arg0][arg1] & 0xFF) < arg2) {
            this.field1954[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
    public final int method722(int arg0, int arg1) {
        return this.field1925[arg0][arg1];
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III[[ZZ)V")
    public final void method739(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        if (this.field1942 == null) {
            return;
        }
        float var6 = this.field1920.field4196;
        float var7 = this.field1920.field4251;
        int var8 = arg2 + arg2 + 1;
        int var9 = var8 * var8;
        if (field1939.length < var9) {
            field1939 = new int[var9];
        }
        if (field1922.field5042.length < this.field1929 * 2) {
            field1922 = new class341(this.field1929 * 2);
        }
        int var10 = arg0 - arg2;
        int var11 = var10;
        if (var10 < 0) {
            var10 = 0;
        }
        int var12 = arg1 - arg2;
        int var13 = var12;
        if (var12 < 0) {
            var12 = 0;
        }
        int var14 = arg0 + arg2;
        if (var14 > this.field2681 - 1) {
            var14 = this.field2681 - 1;
        }
        int var15 = arg1 + arg2;
        if (var15 > this.field2685 - 1) {
            var15 = this.field2685 - 1;
        }
        field1936 = 0;
        for (int var16 = var10; var16 <= var14; var16++) {
            boolean[] var17 = arg3[var16 - var11];
            for (int var18 = var12; var18 <= var15; var18++) {
                if (var17[var18 - var13]) {
                    field1939[field1936++] = this.field2681 * var18 + var16;
                }
            }
        }
        this.field1920.method1871();
        for (int var19 = 0; var19 < this.field1942.length; var19++) {
            this.field1942[var19].method2355(field1939, 1, field1936);
        }
        if (!this.field1932.method1563(11395)) {
            int var20 = this.field1920.field4235;
            int var21 = this.field1920.field4265;
            this.field1920.method483(0, var21);
            this.field1920.method481(var7, var6 - 4.0F);
            this.field1920.method1931(false);
            this.field1920.method1892(false);
            this.field1920.method1933(130);
            this.field1920.method1861(-2);
            this.field1920.method1915(this.field1920.field4208);
            this.field1920.method1911(8448, 7681);
            this.field1920.method1866(0, 34166, 770);
            this.field1920.method1867(0, 34167, 770);
            for (class418 var22 = this.field1932.method1575(0); var22 != null; var22 = this.field1932.method1573((byte) -128)) {
                class182 var23 = (class182) var22;
                var23.method1191(arg0, arg1, arg2, arg3, -121);
            }
            this.field1920.method1866(0, 5890, 768);
            this.field1920.method1867(0, 5890, 770);
            this.field1920.method1915((class344) null);
            this.field1920.method483(var20, var21);
        }
        if (this.field1938 != null) {
            this.field1920.method481(var7, var6 - 8.0F);
            this.field1920.method1871();
            this.field1920.method1883(this.field1948);
            this.field1920.method1878(0, this.field1949);
            this.field1920.method1930();
            this.field1938.method604(arg2, arg4, arg3, 1162127586, arg0, arg1);
        }
        this.field1920.method481(var7, var6);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public final void method729(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
        int var16 = arg8.length;
        int[] var17 = new int[var16 * 3];
        int[] var18 = new int[var16 * 3];
        int[] var19 = new int[var16 * 3];
        int[] var20 = new int[var16 * 3];
        int[] var21 = new int[var16 * 3];
        int[] var22 = new int[var16 * 3];
        int[] var23 = arg3 == null ? null : new int[var16 * 3];
        int var24 = 0;
        for (int var25 = 0; var25 < var16; var25++) {
            int var26 = arg5[var25];
            int var27 = arg6[var25];
            int var28 = arg7[var25];
            var17[var24] = arg2[var26];
            var18[var24] = arg4[var26];
            var19[var24] = arg8[var25];
            var20[var24] = arg9[var25];
            var21[var24] = arg10[var25];
            var22[var24] = arg11[var25];
            if (arg3 != null) {
                var23[var24] = arg3[var26];
            }
            var24++;
            var17[var24] = arg2[var27];
            var18[var24] = arg4[var27];
            var19[var24] = arg8[var25];
            var20[var24] = arg9[var25];
            var21[var24] = arg10[var25];
            var22[var24] = arg11[var25];
            if (arg3 != null) {
                var23[var24] = arg3[var27];
            }
            var24++;
            var17[var24] = arg2[var28];
            var18[var24] = arg4[var28];
            var19[var24] = arg8[var25];
            var20[var24] = arg9[var25];
            var21[var24] = arg10[var25];
            var22[var24] = arg11[var25];
            if (arg3 != null) {
                var23[var24] = arg3[var28];
            }
            var24++;
        }
        this.method726(arg0, arg1, var17, var23, var18, var19, var20, var21, var22, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)V")
    public final void method724(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Lc;IIIIZ)V")
    public final void method733(class308 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field1938 != null && arg0 != null) {
            int var7 = arg1 - (this.field1920.field4180 * arg2 >> 8) >> this.field1920.field4154;
            int var8 = arg3 - (this.field1920.field4240 * arg2 >> 8) >> this.field1920.field4154;
            this.field1938.method611(arg0, var8, -28479, var7);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method740(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        if (this.field1951 <= 0) {
            return;
        }
        opengl var9 = this.field1920.field4140;
        this.field1920.method1899();
        this.field1920.method1903(false);
        this.field1920.method1931(false);
        this.field1920.method1922(false);
        this.field1920.method1892(false);
        this.field1920.method1933(0);
        this.field1920.method1861(-2);
        this.field1920.method1915((class344) null);
        field1941[0] = (float) arg2 / ((float) this.field1923 * 128.0F * (float) this.field1920.field4152);
        field1941[1] = 0.0F;
        field1941[2] = 0.0F;
        field1941[3] = 0.0F;
        field1941[4] = 0.0F;
        field1941[5] = (float) arg2 / ((float) this.field1923 * 128.0F * (float) this.field1920.field4160);
        field1941[6] = 0.0F;
        field1941[7] = 0.0F;
        field1941[8] = 0.0F;
        field1941[9] = 0.0F;
        field1941[10] = 0.0F;
        field1941[11] = 0.0F;
        field1941[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field1920.field4152;
        field1941[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field1920.field4160;
        field1941[14] = 0.0F;
        field1941[15] = 1.0F;
        var9.glMatrixMode(5889);
        var9.glLoadMatrixf(field1941, 0);
        field1941[0] = 1.0F;
        field1941[1] = 0.0F;
        field1941[2] = 0.0F;
        field1941[3] = 0.0F;
        field1941[4] = 0.0F;
        field1941[5] = 0.0F;
        field1941[6] = 1.0F;
        field1941[7] = 0.0F;
        field1941[8] = 0.0F;
        field1941[9] = 1.0F;
        field1941[10] = 0.0F;
        field1941[11] = 0.0F;
        field1941[12] = 0.0F;
        field1941[13] = 0.0F;
        field1941[14] = 0.0F;
        field1941[15] = 1.0F;
        var9.glMatrixMode(5888);
        var9.glLoadMatrixf(field1941, 0);
        this.field1920.method1875();
        this.field1920.method1902(this.field1943);
        this.field1920.method1883(this.field1948);
        this.field1920.method1878(0, this.field1949);
        if ((this.field1924 & 0x7) == 0) {
            this.field1920.method1931(false);
        } else {
            this.field1920.method1886(this.field1944);
            this.field1920.method1931(true);
        }
        this.field1920.method1930();
        if (field1922.field5042.length < this.field1929 * 2) {
            field1922 = new class341(this.field1929 * 2);
        } else {
            field1922.field5049 = 0;
        }
        int var10 = 0;
        if (this.field1920.field4232) {
            for (int var11 = arg4; var11 < arg6; var11++) {
                int var12 = this.field2681 * var11 + arg3;
                for (int var13 = arg3; var13 < arg5; var13++) {
                    if (arg7[var13 - arg3][var11 - arg4]) {
                        short[] var14 = this.field1931[var12];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field1922.method2250(false, var14[var15]);
                                var10++;
                            }
                        }
                    }
                    var12++;
                }
            }
        } else {
            for (int var16 = arg4; var16 < arg6; var16++) {
                int var17 = this.field2681 * var16 + arg3;
                for (int var18 = arg3; var18 < arg5; var18++) {
                    if (arg7[var18 - arg3][var16 - arg4]) {
                        short[] var19 = this.field1931[var17];
                        if (var19 != null) {
                            for (int var20 = 0; var20 < var19.length; var20++) {
                                field1922.method2206(52, var19[var20]);
                                var10++;
                            }
                        }
                    }
                    var17++;
                }
            }
        }
        if (var10 > 0) {
            this.field1920.field4181.method2126(5123, field1922.field5042, field1922.field5049);
            this.field1920.method1891(this.field1920.field4181, 4, 0, var10);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lc;IIIIZ)V")
    public final void method727(class308 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field1938 != null && arg0 != null) {
            int var7 = arg1 - (this.field1920.field4180 * arg2 >> 8) >> this.field1920.field4154;
            int var8 = arg3 - (this.field1920.field4240 * arg2 >> 8) >> this.field1920.field4154;
            this.field1938.method612(var7, var8, arg0, (byte) 75);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public final void method726(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        this.field1926[arg0][arg1] = arg3;
        this.field1930[arg0][arg1] = arg2;
        this.field1928[arg0][arg1] = arg4;
        this.field1933[arg0][arg1] = arg5;
        this.field1934[arg0][arg1] = arg6;
        class358[] var13 = this.field1937[arg0][arg1] = new class358[arg5.length];
        for (int var14 = 0; var14 < arg5.length; var14++) {
            long var15 = (long) arg10 << 48 | (long) arg9 << 32 | (long) (arg7[var14] << 16) | (long) arg8[var14];
            class418 var17 = this.field1952.method2826(false, var15);
            if (var17 == null) {
                var13[var14] = new class358(this, arg7[var14], arg8[var14], arg9, arg10);
                this.field1952.method2815(-1, var15, var13[var14]);
            } else {
                var13[var14] = (class358) var17;
            }
        }
        if (arg11) {
            this.field1919[arg0][arg1] = (byte) (this.field1919[arg0][arg1] | 0x1);
        }
        if (arg5.length > this.field1945) {
            this.field1945 = arg5.length;
        }
        this.field1951 += arg5.length;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "()V")
    public final void method731() {
        if (this.field1951 > 0) {
            byte[][] var1 = new byte[this.field2681 + 1][this.field2685 + 1];
            for (int var2 = 1; var2 < this.field2681; var2++) {
                for (int var3 = 1; var3 < this.field2685; var3++) {
                    var1[var2][var3] = (byte) ((this.field1954[var2][var3] >> 1) + (this.field1954[var2][var3 + 1] >> 3) + (this.field1954[var2][var3 - 1] >> 2) + (this.field1954[var2 - 1][var3] >> 2) + (this.field1954[var2 + 1][var3] >> 3));
                }
            }
            this.field1942 = new class358[this.field1952.method2824((byte) 85)];
            this.field1952.method2811((byte) -110, this.field1942);
            for (int var4 = 0; var4 < this.field1942.length; var4++) {
                this.field1942[var4].method2354(this.field1951, 19320);
            }
            int var5 = 24;
            if (this.field1955 != null) {
                var5 += 4;
            }
            if ((this.field1924 & 0x7) != 0) {
                var5 += 12;
            }
            ByteBuffer var6 = ByteBuffer.allocateDirect(this.field1951 * var5).order(ByteOrder.nativeOrder());
            class358[] var7 = new class358[this.field1951];
            class453 var8 = new class453(class437.method2740(381, this.field1951));
            class358[] var9 = new class358[this.field1945];
            for (int var10 = 0; var10 < this.field2681; var10++) {
                for (int var11 = 0; var11 < this.field2685; var11++) {
                    if (this.field1933[var10][var11] != null) {
                        class358[] var12 = this.field1937[var10][var11];
                        int[] var13 = this.field1926[var10][var11];
                        int[] var14 = this.field1930[var10][var11];
                        int[] var15 = this.field1928[var10][var11];
                        int[] var16 = this.field1934[var10][var11];
                        int[] var17 = this.field1933[var10][var11];
                        if (var16 == null) {
                            var16 = var17;
                        }
                        float var18 = this.field1947[var10][var11];
                        float var19 = this.field1946[var10][var11];
                        float var20 = this.field1950[var10][var11];
                        float var21 = this.field1947[var10][var11 + 1];
                        float var22 = this.field1946[var10][var11 + 1];
                        float var23 = this.field1950[var10][var11 + 1];
                        float var24 = this.field1947[var10 + 1][var11 + 1];
                        float var25 = this.field1946[var10 + 1][var11 + 1];
                        float var26 = this.field1950[var10 + 1][var11 + 1];
                        float var27 = this.field1947[var10 + 1][var11];
                        float var28 = this.field1946[var10 + 1][var11];
                        float var29 = this.field1950[var10 + 1][var11];
                        int var30 = var1[var10][var11] & 0xFF;
                        int var31 = var1[var10][var11 + 1] & 0xFF;
                        int var32 = var1[var10 + 1][var11 + 1] & 0xFF;
                        int var33 = var1[var10 + 1][var11] & 0xFF;
                        float var34;
                        float var35;
                        float var36;
                        float var37;
                        if (this.field1955 == null) {
                            var37 = 0.0F;
                            var36 = 0.0F;
                            var35 = 0.0F;
                            var34 = 0.0F;
                        } else {
                            var34 = (float) this.field1955[var10][var11];
                            var35 = (float) this.field1955[var10][var11 + 1];
                            var36 = (float) this.field1955[var10 + 1][var11 + 1];
                            var37 = (float) this.field1955[var10 + 1][var11];
                        }
                        int var38 = 0;
                        label303: for (int var39 = 0; var39 < var17.length; var39++) {
                            class358 var40 = var12[var39];
                            for (int var41 = 0; var41 < var38; var41++) {
                                if (var9[var41] == var40) {
                                    continue label303;
                                }
                            }
                            var9[var38++] = var40;
                        }
                        short[] var42 = this.field1931[this.field2681 * var11 + var10] = new short[var17.length];
                        for (int var43 = 0; var43 < var17.length; var43++) {
                            int var44 = (var10 << this.field1921) + var14[var43];
                            int var45 = (var11 << this.field1921) + var15[var43];
                            int var46 = var17[var43];
                            int var47 = var16[var43];
                            int var48 = var13 == null ? 0 : var13[var43];
                            long var49 = (long) var47 << 48 | (long) var46 << 32 | (long) (var44 << 16) | (long) var45;
                            int var51 = var14[var43];
                            int var52 = var15[var43];
                            byte var53 = 74;
                            int var54 = 0;
                            float var55 = 1.0F;
                            float var56;
                            float var57;
                            float var58;
                            float var59;
                            int var60;
                            if (var51 == 0 && var52 == 0) {
                                var56 = var18;
                                var57 = var19;
                                var58 = var20;
                                var59 = var34;
                                var60 = var53 - var30;
                            } else if (var51 == 0 && this.field1923 == var52) {
                                var56 = var21;
                                var57 = var22;
                                var58 = var23;
                                var59 = var35;
                                var60 = var53 - var31;
                            } else if (this.field1923 == var51 && this.field1923 == var52) {
                                var56 = var24;
                                var57 = var25;
                                var58 = var26;
                                var59 = var36;
                                var60 = var53 - var32;
                            } else if (this.field1923 == var51 && var52 == 0) {
                                var56 = var27;
                                var57 = var28;
                                var58 = var29;
                                var59 = var37;
                                var60 = var53 - var33;
                            } else {
                                float var61 = (float) var51 / (float) this.field1923;
                                float var62 = (float) var52 / (float) this.field1923;
                                float var63 = (var27 - var18) * var61 + var18;
                                float var64 = (var28 - var19) * var61 + var19;
                                float var65 = (var29 - var20) * var61 + var20;
                                float var66 = (var24 - var21) * var61 + var21;
                                float var67 = (var25 - var22) * var61 + var22;
                                float var68 = (var26 - var23) * var61 + var23;
                                var56 = (var66 - var63) * var62 + var63;
                                var57 = (var67 - var64) * var62 + var64;
                                var58 = (var68 - var65) * var62 + var65;
                                int var69 = ((var33 - var30) * var51 >> this.field1921) + var30;
                                int var70 = ((var32 - var31) * var51 >> this.field1921) + var31;
                                var60 = var53 - (((var70 - var69) * var52 >> this.field1921) + var69);
                                float var71 = (var37 - var34) * var61 + var34;
                                float var72 = (var36 - var35) * var61 + var35;
                                var59 = (var72 - var71) * var62 + var71;
                            }
                            if (var46 != -1) {
                                int var73 = (var46 & 0x7F) * var60 >> 7;
                                if (var73 < 2) {
                                    var73 = 2;
                                } else if (var73 > 126) {
                                    var73 = 126;
                                }
                                var54 = class422.field6127[var46 & 0xFF80 | var73];
                                if ((this.field1924 & 0x7) == 0) {
                                    float var74 = this.field1920.field4188[2] * var58 + this.field1920.field4188[0] * var56 + this.field1920.field4188[1] * var57;
                                    var55 = this.field1920.field4175 + var74 * (var74 > 0.0F ? this.field1920.field4205 : this.field1920.field4244);
                                }
                            }
                            class418 var75 = var8.method2826(false, var49);
                            int var86;
                            if (var75 == null) {
                                int var77;
                                if (var46 == var47) {
                                    var77 = var54;
                                } else {
                                    int var76 = (var47 & 0x7F) * var60 >> 7;
                                    if (var76 < 2) {
                                        var76 = 2;
                                    } else if (var76 > 126) {
                                        var76 = 126;
                                    }
                                    var77 = class422.field6127[var47 & 0xFF80 | var76];
                                    if ((this.field1924 & 0x7) == 0) {
                                        float var78 = this.field1920.field4188[2] * var58 + this.field1920.field4188[0] * var56 + this.field1920.field4188[1] * var57;
                                        float var79 = this.field1920.field4175 + var55 * (var55 > 0.0F ? this.field1920.field4205 : this.field1920.field4244);
                                        int var80 = var77 >> 16 & 0xFF;
                                        int var81 = var77 >> 8 & 0xFF;
                                        int var82 = var77 & 0xFF;
                                        int var83 = (int) ((float) var80 * var79);
                                        if (var83 < 0) {
                                            var83 = 0;
                                        } else if (var83 > 255) {
                                            var83 = 255;
                                        }
                                        int var84 = (int) ((float) var81 * var79);
                                        if (var84 < 0) {
                                            var84 = 0;
                                        } else if (var84 > 255) {
                                            var84 = 255;
                                        }
                                        int var85 = (int) ((float) var82 * var79);
                                        if (var85 < 0) {
                                            var85 = 0;
                                        } else if (var85 > 255) {
                                            var85 = 255;
                                        }
                                        var77 = var83 << 16 | var84 << 8 | var85;
                                    }
                                }
                                var6.putFloat((float) var44);
                                var6.putFloat((float) (this.method725(var44, var45) + var48));
                                var6.putFloat((float) var45);
                                var6.putFloat((float) var44);
                                var6.putFloat((float) var45);
                                var6.put((byte) (var77 >> 16));
                                var6.put((byte) (var77 >> 8));
                                var6.put((byte) var77);
                                var6.put((byte) -1);
                                if ((this.field1924 & 0x7) != 0) {
                                    var6.putFloat(var56);
                                    var6.putFloat(var57);
                                    var6.putFloat(var58);
                                }
                                if (this.field1955 != null) {
                                    var6.putFloat((float) var48 + var59);
                                }
                                var86 = this.field1927++;
                                var42[var43] = (short) var86;
                                if (var46 != -1) {
                                    var7[var86] = var12[var43];
                                }
                                var8.method2815(-1, var49, new class116(var42[var43]));
                            } else {
                                var42[var43] = ((class116) var75).field1512;
                                var86 = var42[var43] & 0xFFFF;
                                if (var46 != -1 && var12[var43].field6091 < var7[var86].field6091) {
                                    var7[var86] = var12[var43];
                                }
                            }
                            for (int var87 = 0; var87 < var38; var87++) {
                                var9[var87].method2353(var60, var55, 23016, var86, var54);
                            }
                            this.field1929++;
                        }
                    }
                }
            }
            for (int var88 = 0; var88 < this.field1927; var88++) {
                class358 var89 = var7[var88];
                if (var89 != null) {
                    var89.method2352((byte) -84, var88);
                }
            }
            for (int var90 = 0; var90 < this.field2681; var90++) {
                for (int var91 = 0; var91 < this.field2685; var91++) {
                    short[] var92 = this.field1931[this.field2681 * var91 + var90];
                    if (var92 != null) {
                        int var93 = 0;
                        int var94 = 0;
                        while (var94 < var92.length) {
                            int var95 = var92[var94++] & 0xFFFF;
                            int var96 = var92[var94++] & 0xFFFF;
                            int var97 = var92[var94++] & 0xFFFF;
                            class358 var98 = var7[var95];
                            class358 var99 = var7[var96];
                            class358 var100 = var7[var97];
                            class358 var101 = null;
                            if (var98 != null) {
                                var98.method2356(var91, var93, -11059, var90);
                                var101 = var98;
                            }
                            if (var99 != null) {
                                var99.method2356(var91, var93, -11059, var90);
                                if (var101 == null || var99.field6091 < var101.field6091) {
                                    var101 = var99;
                                }
                            }
                            if (var100 != null) {
                                var100.method2356(var91, var93, -11059, var90);
                                if (var101 == null || var100.field6091 < var101.field6091) {
                                    var101 = var100;
                                }
                            }
                            if (var101 != null) {
                                if (var98 != null) {
                                    var101.method2352((byte) -84, var95);
                                }
                                if (var99 != null) {
                                    var101.method2352((byte) -84, var96);
                                }
                                if (var100 != null) {
                                    var101.method2352((byte) -84, var97);
                                }
                                var101.method2356(var91, var93, -11059, var90);
                            }
                            var93++;
                        }
                    }
                }
            }
            var6.flip();
            this.field1956 = this.field1920.method1904(var5, var6, false);
            int var102 = 24;
            this.field1948 = new class26(this.field1920, this.field1956, 5126, 3, 0);
            this.field1949 = new class26(this.field1920, this.field1956, 5126, 2, 12);
            this.field1943 = new class26(this.field1920, this.field1956, 5121, 4, 20);
            if ((this.field1924 & 0x7) != 0) {
                this.field1944 = new class26(this.field1920, this.field1956, 5126, 3, var102);
                var102 += 12;
            }
            if (this.field1955 != null) {
                this.field1953 = new class26(this.field1920, this.field1956, 5126, 1, var102);
                var102 += 4;
            }
            long[] var103 = new long[this.field1942.length];
            for (int var104 = 0; var104 < this.field1942.length; var104++) {
                class358 var105 = this.field1942[var104];
                var103[var104] = var105.field6091;
                var105.method2357(101, this.field1927);
            }
            class209.method1368(var103, this.field1942, -1);
            if (this.field1938 != null) {
                this.field1938.method606(-120);
            }
        } else {
            this.field1938 = null;
        }
        this.field1930 = this.field1928 = (int[][][]) null;
        this.field1934 = (int[][][]) null;
        this.field1926 = (int[][][]) null;
        this.field1937 = (class358[][][]) null;
        this.field1933 = (int[][][]) null;
        this.field1954 = (byte[][]) null;
        this.field1952 = null;
        this.field1955 = (int[][]) null;
        this.field1947 = this.field1946 = this.field1950 = (float[][]) null;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(Lc;IIIIZ)Z")
    public final boolean method738(class308 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field1938 == null || arg0 == null) {
            return false;
        } else {
            int var7 = arg1 - (this.field1920.field4180 * arg2 >> 8) >> 3;
            int var8 = arg3 - (this.field1920.field4240 * arg2 >> 8) >> 3;
            return this.field1938.method609(arg0, var8, -8635, var7);
        }
    }
}
