package deob;

@ObfuscatedName("dp")
public class class109 extends class89 {

    @ObfuscatedName("dp.a")
    public static class109 field1908 = new class109();

    @ObfuscatedName("dp.d")
    public static byte[] field1884 = new byte[1];

    @ObfuscatedName("dp.v")
    public static class109 field1942 = new class109();

    @ObfuscatedName("dp.r")
    public static byte[] field1885 = new byte[1];

    @ObfuscatedName("dp.z")
    public int field1896 = 0;

    @ObfuscatedName("dp.t")
    public int[] field1892;

    @ObfuscatedName("dp.n")
    public int[] field1889;

    @ObfuscatedName("dp.i")
    public int[] field1890;

    @ObfuscatedName("dp.g")
    public int field1891 = 0;

    @ObfuscatedName("dp.m")
    public int[] field1919;

    @ObfuscatedName("dp.k")
    public int[] field1893;

    @ObfuscatedName("dp.x")
    public int[] field1894;

    @ObfuscatedName("dp.u")
    public int[] field1906;

    @ObfuscatedName("dp.j")
    public int[] field1888;

    @ObfuscatedName("dp.q")
    public int[] field1897;

    @ObfuscatedName("dp.w")
    public byte[] field1898;

    @ObfuscatedName("dp.b")
    public byte[] field1899;

    @ObfuscatedName("dp.p")
    public byte[] field1895;

    @ObfuscatedName("dp.o")
    public short[] field1901;

    @ObfuscatedName("dp.y")
    public byte field1902 = 0;

    @ObfuscatedName("dp.s")
    public int field1903 = 0;

    @ObfuscatedName("dp.e")
    public int[] field1935;

    @ObfuscatedName("dp.h")
    public int[] field1924;

    @ObfuscatedName("dp.l")
    public int[] field1925;

    @ObfuscatedName("dp.c")
    public int[][] field1907;

    @ObfuscatedName("dp.f")
    public int[][] field1920;

    @ObfuscatedName("dp.ac")
    public boolean field1909 = false;

    @ObfuscatedName("dp.as")
    public int field1910;

    @ObfuscatedName("dp.af")
    public int field1923;

    @ObfuscatedName("dp.am")
    public int field1912;

    @ObfuscatedName("dp.ap")
    public int field1913;

    @ObfuscatedName("dp.aa")
    public int field1914;

    @ObfuscatedName("dp.av")
    public static boolean[] field1916 = new boolean[4700];

    @ObfuscatedName("dp.ao")
    public static boolean[] field1917 = new boolean[4700];

    @ObfuscatedName("dp.aq")
    public static int[] field1918 = new int[4700];

    @ObfuscatedName("dp.ax")
    public static int[] field1900 = new int[4700];

    @ObfuscatedName("dp.at")
    public static int[] field1886 = new int[4700];

    @ObfuscatedName("dp.aw")
    public static int[] field1904 = new int[4700];

    @ObfuscatedName("dp.ab")
    public static int[] field1922 = new int[4700];

    @ObfuscatedName("dp.al")
    public static int[] field1938 = new int[4700];

    @ObfuscatedName("dp.ah")
    public static int[] field1921 = new int[1600];

    @ObfuscatedName("dp.ak")
    public static int[][] field1926 = new int[1600][512];

    @ObfuscatedName("dp.ai")
    public static int[] field1927 = new int[12];

    @ObfuscatedName("dp.az")
    public static int[][] field1928 = new int[12][2000];

    @ObfuscatedName("dp.au")
    public static int[] field1887 = new int[2000];

    @ObfuscatedName("dp.ay")
    public static int[] field1930 = new int[2000];

    @ObfuscatedName("dp.ag")
    public static int[] field1931 = new int[12];

    @ObfuscatedName("dp.ae")
    public static int[] field1932 = new int[10];

    @ObfuscatedName("dp.an")
    public static int[] field1929 = new int[10];

    @ObfuscatedName("dp.aj")
    public static int[] field1936 = new int[10];

    @ObfuscatedName("dp.bn")
    public static boolean field1883 = false;

    @ObfuscatedName("dp.bs")
    public static int field1939 = 0;

    @ObfuscatedName("dp.bc")
    public static int field1940 = 0;

    @ObfuscatedName("dp.bq")
    public static int field1941 = 0;

    @ObfuscatedName("dp.bp")
    public static int[] field1911 = new int[1000];

    @ObfuscatedName("dp.bo")
    public static int[] field1943 = class95.field1671;

    @ObfuscatedName("dp.bd")
    public static int[] field1944 = class95.field1677;

    @ObfuscatedName("dp.bj")
    public static int[] field1945 = class95.field1672;

    @ObfuscatedName("dp.bh")
    public static int[] field1946 = class95.field1667;

    public class109() {
    }

    public class109(class109[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1896 = 0;
        this.field1891 = 0;
        this.field1903 = 0;
        this.field1902 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class109 var8 = arg0[var7];
            if (var8 != null) {
                this.field1896 += var8.field1896;
                this.field1891 += var8.field1891;
                this.field1903 += var8.field1903;
                if (var8.field1898 == null) {
                    if (this.field1902 == -1) {
                        this.field1902 = var8.field1902;
                    }
                    if (this.field1902 != var8.field1902) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1899 != null;
                var5 |= var8.field1901 != null;
                var6 |= var8.field1895 != null;
            }
        }
        this.field1892 = new int[this.field1896];
        this.field1889 = new int[this.field1896];
        this.field1890 = new int[this.field1896];
        this.field1919 = new int[this.field1891];
        this.field1893 = new int[this.field1891];
        this.field1894 = new int[this.field1891];
        this.field1906 = new int[this.field1891];
        this.field1888 = new int[this.field1891];
        this.field1897 = new int[this.field1891];
        if (var3) {
            this.field1898 = new byte[this.field1891];
        }
        if (var4) {
            this.field1899 = new byte[this.field1891];
        }
        if (var5) {
            this.field1901 = new short[this.field1891];
        }
        if (var6) {
            this.field1895 = new byte[this.field1891];
        }
        if (this.field1903 > 0) {
            this.field1935 = new int[this.field1903];
            this.field1924 = new int[this.field1903];
            this.field1925 = new int[this.field1903];
        }
        this.field1896 = 0;
        this.field1891 = 0;
        this.field1903 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class109 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1891; var11++) {
                    this.field1919[this.field1891] = var10.field1919[var11] + this.field1896;
                    this.field1893[this.field1891] = var10.field1893[var11] + this.field1896;
                    this.field1894[this.field1891] = var10.field1894[var11] + this.field1896;
                    this.field1906[this.field1891] = var10.field1906[var11];
                    this.field1888[this.field1891] = var10.field1888[var11];
                    this.field1897[this.field1891] = var10.field1897[var11];
                    if (var3) {
                        if (var10.field1898 == null) {
                            this.field1898[this.field1891] = var10.field1902;
                        } else {
                            this.field1898[this.field1891] = var10.field1898[var11];
                        }
                    }
                    if (var4 && var10.field1899 != null) {
                        this.field1899[this.field1891] = var10.field1899[var11];
                    }
                    if (var5) {
                        if (var10.field1901 == null) {
                            this.field1901[this.field1891] = -1;
                        } else {
                            this.field1901[this.field1891] = var10.field1901[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1895 == null || var10.field1895[var11] == -1) {
                            this.field1895[this.field1891] = -1;
                        } else {
                            this.field1895[this.field1891] = (byte) (var10.field1895[var11] + this.field1903);
                        }
                    }
                    this.field1891++;
                }
                for (int var12 = 0; var12 < var10.field1903; var12++) {
                    this.field1935[this.field1903] = var10.field1935[var12] + this.field1896;
                    this.field1924[this.field1903] = var10.field1924[var12] + this.field1896;
                    this.field1925[this.field1903] = var10.field1925[var12] + this.field1896;
                    this.field1903++;
                }
                for (int var13 = 0; var13 < var10.field1896; var13++) {
                    this.field1892[this.field1896] = var10.field1892[var13];
                    this.field1889[this.field1896] = var10.field1889[var13];
                    this.field1890[this.field1896] = var10.field1890[var13];
                    this.field1896++;
                }
            }
        }
    }

    @ObfuscatedName("dp.a([[IIIIZI)Ldp;")
    public class109 method2196(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2220();
        int var7 = arg1 - this.field1912;
        int var8 = this.field1912 + arg1;
        int var9 = arg3 - this.field1912;
        int var10 = this.field1912 + arg3;
        if (var7 < 0 || var8 + 128 >> 7 >= arg0.length || var9 < 0 || var10 + 128 >> 7 >= arg0[0].length) {
            return this;
        }
        int var11 = var7 >> 7;
        int var12 = var8 + 127 >> 7;
        int var13 = var9 >> 7;
        int var14 = var10 + 127 >> 7;
        if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
            return this;
        }
        class109 var15;
        if (arg4) {
            var15 = new class109();
            var15.field1896 = this.field1896;
            var15.field1891 = this.field1891;
            var15.field1903 = this.field1903;
            var15.field1892 = this.field1892;
            var15.field1890 = this.field1890;
            var15.field1919 = this.field1919;
            var15.field1893 = this.field1893;
            var15.field1894 = this.field1894;
            var15.field1906 = this.field1906;
            var15.field1888 = this.field1888;
            var15.field1897 = this.field1897;
            var15.field1898 = this.field1898;
            var15.field1899 = this.field1899;
            var15.field1895 = this.field1895;
            var15.field1901 = this.field1901;
            var15.field1902 = this.field1902;
            var15.field1935 = this.field1935;
            var15.field1924 = this.field1924;
            var15.field1925 = this.field1925;
            var15.field1907 = this.field1907;
            var15.field1920 = this.field1920;
            var15.field1909 = this.field1909;
            var15.field1889 = new int[var15.field1896];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1896; var16++) {
                int var17 = this.field1892[var16] + arg1;
                int var18 = this.field1890[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1889[var16] = this.field1889[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1896; var26++) {
                int var27 = (-this.field1889[var26] << 16) / this.field1549;
                if (var27 < arg5) {
                    int var28 = this.field1892[var26] + arg1;
                    int var29 = this.field1890[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1889[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1889[var26];
                }
            }
        }
        var15.field1910 = 0;
        return var15;
    }

    @ObfuscatedName("dp.d(Z)Ldp;")
    public class109 method2231(boolean arg0) {
        if (!arg0 && field1884.length < this.field1891) {
            field1884 = new byte[this.field1891 + 100];
        }
        return this.method2199(arg0, field1908, field1884);
    }

    @ObfuscatedName("dp.r(Z)Ldp;")
    public class109 method2226(boolean arg0) {
        if (!arg0 && field1885.length < this.field1891) {
            field1885 = new byte[this.field1891 + 100];
        }
        return this.method2199(arg0, field1942, field1885);
    }

    @ObfuscatedName("dp.z(ZLdp;[B)Ldp;")
    public class109 method2199(boolean arg0, class109 arg1, byte[] arg2) {
        arg1.field1896 = this.field1896;
        arg1.field1891 = this.field1891;
        arg1.field1903 = this.field1903;
        if (arg1.field1892 == null || arg1.field1892.length < this.field1896) {
            arg1.field1892 = new int[this.field1896 + 100];
            arg1.field1889 = new int[this.field1896 + 100];
            arg1.field1890 = new int[this.field1896 + 100];
        }
        for (int var4 = 0; var4 < this.field1896; var4++) {
            arg1.field1892[var4] = this.field1892[var4];
            arg1.field1889[var4] = this.field1889[var4];
            arg1.field1890[var4] = this.field1890[var4];
        }
        if (arg0) {
            arg1.field1899 = this.field1899;
        } else {
            arg1.field1899 = arg2;
            if (this.field1899 == null) {
                for (int var5 = 0; var5 < this.field1891; var5++) {
                    arg1.field1899[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1891; var6++) {
                    arg1.field1899[var6] = this.field1899[var6];
                }
            }
        }
        arg1.field1919 = this.field1919;
        arg1.field1893 = this.field1893;
        arg1.field1894 = this.field1894;
        arg1.field1906 = this.field1906;
        arg1.field1888 = this.field1888;
        arg1.field1897 = this.field1897;
        arg1.field1898 = this.field1898;
        arg1.field1895 = this.field1895;
        arg1.field1901 = this.field1901;
        arg1.field1902 = this.field1902;
        arg1.field1935 = this.field1935;
        arg1.field1924 = this.field1924;
        arg1.field1925 = this.field1925;
        arg1.field1907 = this.field1907;
        arg1.field1920 = this.field1920;
        arg1.field1909 = this.field1909;
        arg1.field1910 = 0;
        return arg1;
    }

    @ObfuscatedName("dp.t()V")
    public void method2220() {
        if (this.field1910 == 1) {
            return;
        }
        this.field1910 = 1;
        this.field1549 = 0;
        this.field1923 = 0;
        this.field1912 = 0;
        for (int var1 = 0; var1 < this.field1896; var1++) {
            int var2 = this.field1892[var1];
            int var3 = this.field1889[var1];
            int var4 = this.field1890[var1];
            if (-var3 > this.field1549) {
                this.field1549 = -var3;
            }
            if (var3 > this.field1923) {
                this.field1923 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1912) {
                this.field1912 = var5;
            }
        }
        this.field1912 = (int) (Math.sqrt((double) this.field1912) + 0.99D);
        this.field1914 = (int) (Math.sqrt((double) (this.field1549 * this.field1549 + this.field1912 * this.field1912)) + 0.99D);
        this.field1913 = this.field1914 + (int) (Math.sqrt((double) (this.field1923 * this.field1923 + this.field1912 * this.field1912)) + 0.99D);
    }

    @ObfuscatedName("dp.n()V")
    public void method2201() {
        if (this.field1910 == 2) {
            return;
        }
        this.field1910 = 2;
        this.field1912 = 0;
        for (int var1 = 0; var1 < this.field1896; var1++) {
            int var2 = this.field1892[var1];
            int var3 = this.field1889[var1];
            int var4 = this.field1890[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1912) {
                this.field1912 = var5;
            }
        }
        this.field1912 = (int) (Math.sqrt((double) this.field1912) + 0.99D);
        this.field1914 = this.field1912;
        this.field1913 = this.field1912 + this.field1912;
    }

    @ObfuscatedName("dp.i()I")
    public int method2202() {
        this.method2220();
        return this.field1912;
    }

    @ObfuscatedName("dp.g(Ldm;I)V")
    public void method2200(class107 arg0, int arg1) {
        if (this.field1907 == null || arg1 == -1) {
            return;
        }
        class92 var3 = arg0.field1859[arg1];
        class106 var4 = var3.field1628;
        Statics.field1905 = 0;
        Statics.field1933 = 0;
        Statics.field1937 = 0;
        for (int var5 = 0; var5 < var3.field1629; var5++) {
            int var6 = var3.field1630[var5];
            this.method2229(var4.field1848[var6], var4.field1847[var6], var3.field1624[var5], var3.field1625[var5], var3.field1631[var5]);
        }
        this.field1910 = 0;
    }

    @ObfuscatedName("dp.m(Ldm;ILdm;I[I)V")
    public void method2203(class107 arg0, int arg1, class107 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2200(arg0, arg1);
            return;
        }
        class92 var6 = arg0.field1859[arg1];
        class92 var7 = arg2.field1859[arg3];
        class106 var8 = var6.field1628;
        Statics.field1905 = 0;
        Statics.field1933 = 0;
        Statics.field1937 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1629; var11++) {
            int var12 = var6.field1630[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1848[var12] == 0) {
                this.method2229(var8.field1848[var12], var8.field1847[var12], var6.field1624[var11], var6.field1625[var11], var6.field1631[var11]);
            }
        }
        Statics.field1905 = 0;
        Statics.field1933 = 0;
        Statics.field1937 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1629; var15++) {
            int var16 = var7.field1630[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1848[var16] == 0) {
                this.method2229(var8.field1848[var16], var8.field1847[var16], var7.field1624[var15], var7.field1625[var15], var7.field1631[var15]);
            }
        }
        this.field1910 = 0;
    }

    @ObfuscatedName("dp.k(I[IIII)V")
    public void method2229(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1905 = 0;
            Statics.field1933 = 0;
            Statics.field1937 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1907.length) {
                    int[] var10 = this.field1907[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1905 += this.field1892[var12];
                        Statics.field1933 += this.field1889[var12];
                        Statics.field1937 += this.field1890[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1905 = Statics.field1905 / var7 + arg2;
                Statics.field1933 = Statics.field1933 / var7 + arg3;
                Statics.field1937 = Statics.field1937 / var7 + arg4;
            } else {
                Statics.field1905 = arg2;
                Statics.field1933 = arg3;
                Statics.field1937 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1907.length) {
                    int[] var15 = this.field1907[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1892[var17] += arg2;
                        this.field1889[var17] += arg3;
                        this.field1890[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1907.length) {
                    int[] var20 = this.field1907[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1892[var22] -= Statics.field1905;
                        this.field1889[var22] -= Statics.field1933;
                        this.field1890[var22] -= Statics.field1937;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1943[var25];
                            int var27 = field1944[var25];
                            int var28 = this.field1892[var22] * var27 + this.field1889[var22] * var26 >> 16;
                            this.field1889[var22] = this.field1889[var22] * var27 - this.field1892[var22] * var26 >> 16;
                            this.field1892[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1943[var23];
                            int var30 = field1944[var23];
                            int var31 = this.field1889[var22] * var30 - this.field1890[var22] * var29 >> 16;
                            this.field1890[var22] = this.field1890[var22] * var30 + this.field1889[var22] * var29 >> 16;
                            this.field1889[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1943[var24];
                            int var33 = field1944[var24];
                            int var34 = this.field1892[var22] * var33 + this.field1890[var22] * var32 >> 16;
                            this.field1890[var22] = this.field1890[var22] * var33 - this.field1892[var22] * var32 >> 16;
                            this.field1892[var22] = var34;
                        }
                        this.field1892[var22] += Statics.field1905;
                        this.field1889[var22] += Statics.field1933;
                        this.field1890[var22] += Statics.field1937;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1907.length) {
                    int[] var37 = this.field1907[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1892[var39] -= Statics.field1905;
                        this.field1889[var39] -= Statics.field1933;
                        this.field1890[var39] -= Statics.field1937;
                        this.field1892[var39] = this.field1892[var39] * arg2 / 128;
                        this.field1889[var39] = this.field1889[var39] * arg3 / 128;
                        this.field1890[var39] = this.field1890[var39] * arg4 / 128;
                        this.field1892[var39] += Statics.field1905;
                        this.field1889[var39] += Statics.field1933;
                        this.field1890[var39] += Statics.field1937;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1920 != null && this.field1899 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1920.length) {
                    int[] var42 = this.field1920[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1899[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1899[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dp.x()V")
    public void method2205() {
        for (int var1 = 0; var1 < this.field1896; var1++) {
            int var2 = this.field1892[var1];
            this.field1892[var1] = this.field1890[var1];
            this.field1890[var1] = -var2;
        }
        this.field1910 = 0;
    }

    @ObfuscatedName("dp.q()V")
    public void method2206() {
        for (int var1 = 0; var1 < this.field1896; var1++) {
            this.field1892[var1] = -this.field1892[var1];
            this.field1890[var1] = -this.field1890[var1];
        }
        this.field1910 = 0;
    }

    @ObfuscatedName("dp.w()V")
    public void method2207() {
        for (int var1 = 0; var1 < this.field1896; var1++) {
            int var2 = this.field1890[var1];
            this.field1890[var1] = this.field1892[var1];
            this.field1892[var1] = -var2;
        }
        this.field1910 = 0;
    }

    @ObfuscatedName("dp.b(I)V")
    public void method2208(int arg0) {
        int var2 = field1943[arg0];
        int var3 = field1944[arg0];
        for (int var4 = 0; var4 < this.field1896; var4++) {
            int var5 = this.field1889[var4] * var3 - this.field1890[var4] * var2 >> 16;
            this.field1890[var4] = this.field1890[var4] * var3 + this.field1889[var4] * var2 >> 16;
            this.field1889[var4] = var5;
        }
        this.field1910 = 0;
    }

    @ObfuscatedName("dp.p(III)V")
    public void method2209(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1896; var4++) {
            this.field1892[var4] += arg0;
            this.field1889[var4] += arg1;
            this.field1890[var4] += arg2;
        }
        this.field1910 = 0;
    }

    @ObfuscatedName("dp.o(III)V")
    public void method2210(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1896; var4++) {
            this.field1892[var4] = this.field1892[var4] * arg0 / 128;
            this.field1889[var4] = this.field1889[var4] * arg1 / 128;
            this.field1890[var4] = this.field1890[var4] * arg2 / 128;
        }
        this.field1910 = 0;
    }

    @ObfuscatedName("dp.y(IIIIIII)V")
    public final void method2194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1921[0] = -1;
        if (this.field1910 != 2 && this.field1910 != 1) {
            this.method2201();
        }
        int var8 = Statics.field1669;
        int var9 = Statics.field1675;
        int var10 = field1943[arg0];
        int var11 = field1944[arg0];
        int var12 = field1943[arg1];
        int var13 = field1944[arg1];
        int var14 = field1943[arg2];
        int var15 = field1944[arg2];
        int var16 = field1943[arg3];
        int var17 = field1944[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1896; var19++) {
            int var20 = this.field1892[var19];
            int var21 = this.field1889[var19];
            int var22 = this.field1890[var19];
            if (arg2 != 0) {
                int var23 = var14 * var21 + var15 * var20 >> 16;
                var21 = var15 * var21 - var14 * var20 >> 16;
                var20 = var23;
            }
            if (arg0 != 0) {
                int var24 = var11 * var21 - var10 * var22 >> 16;
                var22 = var10 * var21 + var11 * var22 >> 16;
                var21 = var24;
            }
            if (arg1 != 0) {
                int var25 = var12 * var22 + var13 * var20 >> 16;
                var22 = var13 * var22 - var12 * var20 >> 16;
                var20 = var25;
            }
            int var26 = arg4 + var20;
            int var27 = arg5 + var21;
            int var28 = arg6 + var22;
            int var29 = var17 * var27 - var16 * var28 >> 16;
            int var30 = var16 * var27 + var17 * var28 >> 16;
            field1886[var19] = var30 - var18;
            field1918[var19] = class95.field1662 * var26 / var30 + var8;
            field1900[var19] = class95.field1662 * var29 / var30 + var9;
            if (this.field1903 > 0) {
                field1904[var19] = var26;
                field1922[var19] = var29;
                field1938[var19] = var30;
            }
        }
        try {
            this.method2239(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dp.s(IIIIIIII)V")
    public final void method2212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1921[0] = -1;
        if (this.field1910 != 2 && this.field1910 != 1) {
            this.method2201();
        }
        int var9 = Statics.field1669;
        int var10 = Statics.field1675;
        int var11 = field1943[arg0];
        int var12 = field1944[arg0];
        int var13 = field1943[arg1];
        int var14 = field1944[arg1];
        int var15 = field1943[arg2];
        int var16 = field1944[arg2];
        int var17 = field1943[arg3];
        int var18 = field1944[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1896; var20++) {
            int var21 = this.field1892[var20];
            int var22 = this.field1889[var20];
            int var23 = this.field1890[var20];
            if (arg2 != 0) {
                int var24 = var15 * var22 + var16 * var21 >> 16;
                var22 = var16 * var22 - var15 * var21 >> 16;
                var21 = var24;
            }
            if (arg0 != 0) {
                int var25 = var12 * var22 - var11 * var23 >> 16;
                var23 = var11 * var22 + var12 * var23 >> 16;
                var22 = var25;
            }
            if (arg1 != 0) {
                int var26 = var13 * var23 + var14 * var21 >> 16;
                var23 = var14 * var23 - var13 * var21 >> 16;
                var21 = var26;
            }
            int var27 = arg4 + var21;
            int var28 = arg5 + var22;
            int var29 = arg6 + var23;
            int var30 = var18 * var28 - var17 * var29 >> 16;
            int var31 = var17 * var28 + var18 * var29 >> 16;
            field1886[var20] = var31 - var19;
            field1918[var20] = class95.field1662 * var27 / arg7 + var9;
            field1900[var20] = class95.field1662 * var30 / arg7 + var10;
            if (this.field1903 > 0) {
                field1904[var20] = var27;
                field1922[var20] = var30;
                field1938[var20] = var31;
            }
        }
        try {
            this.method2239(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dp.at(IIIIIIIII)V")
    public void method1831(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1921[0] = -1;
        if (this.field1910 != 1) {
            this.method2220();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1912 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1912) * class95.field1662;
        if (var15 / var13 >= Statics.field1653) {
            return;
        }
        int var16 = (this.field1912 + var14) * class95.field1662;
        if (var16 / var13 <= Statics.field1660) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1912 * arg1 >> 16;
        int var19 = (var17 + var18) * class95.field1662;
        if (var19 / var13 <= Statics.field1668) {
            return;
        }
        int var20 = (this.field1549 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class95.field1662;
        if (var21 / var13 >= Statics.field1670) {
            return;
        }
        int var22 = (this.field1549 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1903 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1883) {
            int var27 = var11 - var12;
            if (var27 <= 50) {
                var27 = 50;
            }
            int var28;
            int var29;
            if (var14 > 0) {
                var28 = var15 / var13;
                var29 = var16 / var27;
            } else {
                var29 = var16 / var13;
                var28 = var15 / var27;
            }
            int var30;
            int var31;
            if (var17 > 0) {
                var30 = var21 / var13;
                var31 = var19 / var27;
            } else {
                var31 = var19 / var13;
                var30 = var21 / var27;
            }
            int var32 = field1939 - Statics.field1669;
            int var33 = field1940 - Statics.field1675;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1909) {
                    field1911[field1941++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1669;
        int var35 = Statics.field1675;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1943[arg0];
            var37 = field1944[arg0];
        }
        for (int var38 = 0; var38 < this.field1896; var38++) {
            int var39 = this.field1892[var38];
            int var40 = this.field1889[var38];
            int var41 = this.field1890[var38];
            if (arg0 != 0) {
                int var42 = var36 * var41 + var37 * var39 >> 16;
                var41 = var37 * var41 - var36 * var39 >> 16;
                var39 = var42;
            }
            int var43 = arg5 + var39;
            int var44 = arg6 + var40;
            int var45 = arg7 + var41;
            int var46 = arg3 * var45 + arg4 * var43 >> 16;
            int var47 = arg4 * var45 - arg3 * var43 >> 16;
            int var49 = arg2 * var44 - arg1 * var47 >> 16;
            int var50 = arg1 * var44 + arg2 * var47 >> 16;
            field1886[var38] = var50 - var11;
            if (var50 >= 50) {
                field1918[var38] = class95.field1662 * var46 / var50 + var34;
                field1900[var38] = class95.field1662 * var49 / var50 + var35;
            } else {
                field1918[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1904[var38] = var46;
                field1922[var38] = var49;
                field1938[var38] = var50;
            }
        }
        try {
            this.method2239(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dp.e(ZZI)V")
    public final void method2239(boolean arg0, boolean arg1, int arg2) {
        if (this.field1913 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1913; var4++) {
            field1921[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1891; var5++) {
            if (this.field1897[var5] != -2) {
                int var6 = this.field1919[var5];
                int var7 = this.field1893[var5];
                int var8 = this.field1894[var5];
                int var9 = field1918[var6];
                int var10 = field1918[var7];
                int var11 = field1918[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1904[var6];
                    int var13 = field1904[var7];
                    int var14 = field1904[var8];
                    int var15 = field1922[var6];
                    int var16 = field1922[var7];
                    int var17 = field1922[var8];
                    int var18 = field1938[var6];
                    int var19 = field1938[var7];
                    int var20 = field1938[var8];
                    int var21 = var12 - var13;
                    int var22 = var14 - var13;
                    int var23 = var15 - var16;
                    int var24 = var17 - var16;
                    int var25 = var18 - var19;
                    int var26 = var20 - var19;
                    int var27 = var23 * var26 - var24 * var25;
                    int var28 = var22 * var25 - var21 * var26;
                    int var29 = var21 * var24 - var22 * var23;
                    if (var19 * var29 + var13 * var27 + var16 * var28 > 0) {
                        field1917[var5] = true;
                        int var30 = (field1886[var6] + field1886[var7] + field1886[var8]) / 3 + this.field1914;
                        field1926[var30][field1921[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2259(field1939, field1940, field1900[var6], field1900[var7], field1900[var8], var9, var10, var11)) {
                        field1911[field1941++] = arg2;
                        arg1 = false;
                    }
                    if ((field1900[var8] - field1900[var7]) * (var9 - var10) - (field1900[var6] - field1900[var7]) * (var11 - var10) > 0) {
                        field1917[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1665 && var10 <= Statics.field1665 && var11 <= Statics.field1665) {
                            field1916[var5] = false;
                        } else {
                            field1916[var5] = true;
                        }
                        int var31 = (field1886[var6] + field1886[var7] + field1886[var8]) / 3 + this.field1914;
                        field1926[var31][field1921[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1898 == null) {
            for (int var32 = this.field1913 - 1; var32 >= 0; var32--) {
                int var33 = field1921[var32];
                if (var33 > 0) {
                    int[] var34 = field1926[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2214(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1927[var36] = 0;
            field1931[var36] = 0;
        }
        for (int var37 = this.field1913 - 1; var37 >= 0; var37--) {
            int var38 = field1921[var37];
            if (var38 > 0) {
                int[] var39 = field1926[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1898[var41];
                    int var43 = field1927[var42]++;
                    field1928[var42][var43] = var41;
                    if (var42 < 10) {
                        field1931[var42] += var37;
                    } else if (var42 == 10) {
                        field1887[var43] = var37;
                    } else {
                        field1930[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1927[1] > 0 || field1927[2] > 0) {
            var44 = (field1931[1] + field1931[2]) / (field1927[1] + field1927[2]);
        }
        int var45 = 0;
        if (field1927[3] > 0 || field1927[4] > 0) {
            var45 = (field1931[3] + field1931[4]) / (field1927[3] + field1927[4]);
        }
        int var46 = 0;
        if (field1927[6] > 0 || field1927[8] > 0) {
            var46 = (field1931[6] + field1931[8]) / (field1927[6] + field1927[8]);
        }
        int var47 = 0;
        int var48 = field1927[10];
        int[] var49 = field1928[10];
        int[] var50 = field1887;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1927[11];
            var49 = field1928[11];
            var50 = field1930;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2214(var49[var47++]);
                if (var47 == var48 && field1928[11] != var49) {
                    var47 = 0;
                    var48 = field1927[11];
                    var49 = field1928[11];
                    var50 = field1930;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2214(var49[var47++]);
                if (var47 == var48 && field1928[11] != var49) {
                    var47 = 0;
                    var48 = field1927[11];
                    var49 = field1928[11];
                    var50 = field1930;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2214(var49[var47++]);
                if (var47 == var48 && field1928[11] != var49) {
                    var47 = 0;
                    var48 = field1927[11];
                    var49 = field1928[11];
                    var50 = field1930;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1927[var52];
            int[] var54 = field1928[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2214(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2214(var49[var47++]);
            if (var47 == var48 && field1928[11] != var49) {
                var47 = 0;
                var49 = field1928[11];
                var48 = field1927[11];
                var50 = field1930;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dp.h(I)V")
    public final void method2214(int arg0) {
        if (field1917[arg0]) {
            this.method2215(arg0);
            return;
        }
        int var2 = this.field1919[arg0];
        int var3 = this.field1893[arg0];
        int var4 = this.field1894[arg0];
        class95.field1664 = field1916[arg0];
        if (this.field1899 == null) {
            class95.field1657 = 0;
        } else {
            class95.field1657 = this.field1899[arg0] & 0xFF;
        }
        if (this.field1901 != null && this.field1901[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1895 == null || this.field1895[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1895[arg0] & 0xFF;
                var6 = this.field1935[var5];
                var7 = this.field1924[var5];
                var8 = this.field1925[var5];
            }
            if (this.field1897[arg0] == -1) {
                class95.method2010(field1900[var2], field1900[var3], field1900[var4], field1918[var2], field1918[var3], field1918[var4], this.field1906[arg0], this.field1906[arg0], this.field1906[arg0], field1904[var6], field1904[var7], field1904[var8], field1922[var6], field1922[var7], field1922[var8], field1938[var6], field1938[var7], field1938[var8], this.field1901[arg0]);
            } else {
                class95.method2010(field1900[var2], field1900[var3], field1900[var4], field1918[var2], field1918[var3], field1918[var4], this.field1906[arg0], this.field1888[arg0], this.field1897[arg0], field1904[var6], field1904[var7], field1904[var8], field1922[var6], field1922[var7], field1922[var8], field1938[var6], field1938[var7], field1938[var8], this.field1901[arg0]);
            }
        } else if (this.field1897[arg0] == -1) {
            class95.method2016(field1900[var2], field1900[var3], field1900[var4], field1918[var2], field1918[var3], field1918[var4], field1945[this.field1906[arg0]]);
        } else {
            class95.method2014(field1900[var2], field1900[var3], field1900[var4], field1918[var2], field1918[var3], field1918[var4], this.field1906[arg0], this.field1888[arg0], this.field1897[arg0]);
        }
    }

    @ObfuscatedName("dp.l(I)V")
    public final void method2215(int arg0) {
        int var2 = Statics.field1669;
        int var3 = Statics.field1675;
        int var4 = 0;
        int var5 = this.field1919[arg0];
        int var6 = this.field1893[arg0];
        int var7 = this.field1894[arg0];
        int var8 = field1938[var5];
        int var9 = field1938[var6];
        int var10 = field1938[var7];
        if (this.field1899 == null) {
            class95.field1657 = 0;
        } else {
            class95.field1657 = this.field1899[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1932[var4] = field1918[var5];
            field1929[var4] = field1900[var5];
            field1936[var4++] = this.field1906[arg0];
        } else {
            int var11 = field1904[var5];
            int var12 = field1922[var5];
            int var13 = this.field1906[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1946[var10 - var8];
                field1932[var4] = (((field1904[var7] - var11) * var14 >> 16) + var11) * class95.field1662 / 50 + var2;
                field1929[var4] = (((field1922[var7] - var12) * var14 >> 16) + var12) * class95.field1662 / 50 + var3;
                field1936[var4++] = ((this.field1897[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1946[var9 - var8];
                field1932[var4] = (((field1904[var6] - var11) * var15 >> 16) + var11) * class95.field1662 / 50 + var2;
                field1929[var4] = (((field1922[var6] - var12) * var15 >> 16) + var12) * class95.field1662 / 50 + var3;
                field1936[var4++] = ((this.field1888[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1932[var4] = field1918[var6];
            field1929[var4] = field1900[var6];
            field1936[var4++] = this.field1888[arg0];
        } else {
            int var16 = field1904[var6];
            int var17 = field1922[var6];
            int var18 = this.field1888[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1946[var8 - var9];
                field1932[var4] = (((field1904[var5] - var16) * var19 >> 16) + var16) * class95.field1662 / 50 + var2;
                field1929[var4] = (((field1922[var5] - var17) * var19 >> 16) + var17) * class95.field1662 / 50 + var3;
                field1936[var4++] = ((this.field1906[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1946[var10 - var9];
                field1932[var4] = (((field1904[var7] - var16) * var20 >> 16) + var16) * class95.field1662 / 50 + var2;
                field1929[var4] = (((field1922[var7] - var17) * var20 >> 16) + var17) * class95.field1662 / 50 + var3;
                field1936[var4++] = ((this.field1897[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1932[var4] = field1918[var7];
            field1929[var4] = field1900[var7];
            field1936[var4++] = this.field1897[arg0];
        } else {
            int var21 = field1904[var7];
            int var22 = field1922[var7];
            int var23 = this.field1897[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1946[var9 - var10];
                field1932[var4] = (((field1904[var6] - var21) * var24 >> 16) + var21) * class95.field1662 / 50 + var2;
                field1929[var4] = (((field1922[var6] - var22) * var24 >> 16) + var22) * class95.field1662 / 50 + var3;
                field1936[var4++] = ((this.field1888[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1946[var8 - var10];
                field1932[var4] = (((field1904[var5] - var21) * var25 >> 16) + var21) * class95.field1662 / 50 + var2;
                field1929[var4] = (((field1922[var5] - var22) * var25 >> 16) + var22) * class95.field1662 / 50 + var3;
                field1936[var4++] = ((this.field1906[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1932[0];
        int var27 = field1932[1];
        int var28 = field1932[2];
        int var29 = field1929[0];
        int var30 = field1929[1];
        int var31 = field1929[2];
        class95.field1664 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1665 || var27 > Statics.field1665 || var28 > Statics.field1665) {
                class95.field1664 = true;
            }
            if (this.field1901 != null && this.field1901[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1895 == null || this.field1895[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1895[arg0] & 0xFF;
                    var33 = this.field1935[var32];
                    var34 = this.field1924[var32];
                    var35 = this.field1925[var32];
                }
                if (this.field1897[arg0] == -1) {
                    class95.method2010(var29, var30, var31, var26, var27, var28, this.field1906[arg0], this.field1906[arg0], this.field1906[arg0], field1904[var33], field1904[var34], field1904[var35], field1922[var33], field1922[var34], field1922[var35], field1938[var33], field1938[var34], field1938[var35], this.field1901[arg0]);
                } else {
                    class95.method2010(var29, var30, var31, var26, var27, var28, field1936[0], field1936[1], field1936[2], field1904[var33], field1904[var34], field1904[var35], field1922[var33], field1922[var34], field1922[var35], field1938[var33], field1938[var34], field1938[var35], this.field1901[arg0]);
                }
            } else if (this.field1897[arg0] == -1) {
                class95.method2016(var29, var30, var31, var26, var27, var28, field1945[this.field1906[arg0]]);
            } else {
                class95.method2014(var29, var30, var31, var26, var27, var28, field1936[0], field1936[1], field1936[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1665 || var27 > Statics.field1665 || var28 > Statics.field1665 || field1932[3] < 0 || field1932[3] > Statics.field1665) {
            class95.field1664 = true;
        }
        if (this.field1901 != null && this.field1901[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1895 == null || this.field1895[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1895[arg0] & 0xFF;
                var37 = this.field1935[var36];
                var38 = this.field1924[var36];
                var39 = this.field1925[var36];
            }
            short var40 = this.field1901[arg0];
            if (this.field1897[arg0] == -1) {
                class95.method2010(var29, var30, var31, var26, var27, var28, this.field1906[arg0], this.field1906[arg0], this.field1906[arg0], field1904[var37], field1904[var38], field1904[var39], field1922[var37], field1922[var38], field1922[var39], field1938[var37], field1938[var38], field1938[var39], var40);
                class95.method2010(var29, var31, field1929[3], var26, var28, field1932[3], this.field1906[arg0], this.field1906[arg0], this.field1906[arg0], field1904[var37], field1904[var38], field1904[var39], field1922[var37], field1922[var38], field1922[var39], field1938[var37], field1938[var38], field1938[var39], var40);
            } else {
                class95.method2010(var29, var30, var31, var26, var27, var28, field1936[0], field1936[1], field1936[2], field1904[var37], field1904[var38], field1904[var39], field1922[var37], field1922[var38], field1922[var39], field1938[var37], field1938[var38], field1938[var39], var40);
                class95.method2010(var29, var31, field1929[3], var26, var28, field1932[3], field1936[0], field1936[2], field1936[3], field1904[var37], field1904[var38], field1904[var39], field1922[var37], field1922[var38], field1922[var39], field1938[var37], field1938[var38], field1938[var39], var40);
            }
        } else if (this.field1897[arg0] == -1) {
            int var41 = field1945[this.field1906[arg0]];
            class95.method2016(var29, var30, var31, var26, var27, var28, var41);
            class95.method2016(var29, var31, field1929[3], var26, var28, field1932[3], var41);
        } else {
            class95.method2014(var29, var30, var31, var26, var27, var28, field1936[0], field1936[1], field1936[2]);
            class95.method2014(var29, var31, field1929[3], var26, var28, field1932[3], field1936[0], field1936[2], field1936[3]);
        }
    }

    @ObfuscatedName("dp.c(IIIIIIII)Z")
    public final boolean method2259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }
}
