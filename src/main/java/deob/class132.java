package deob;

@ObfuscatedName("eh")
public class class132 extends class140 {

    @ObfuscatedName("eh.w")
    public static class132 field1924 = new class132();

    @ObfuscatedName("eh.s")
    public static byte[] field1912 = new byte[1];

    @ObfuscatedName("eh.q")
    public static class132 field1913 = new class132();

    @ObfuscatedName("eh.o")
    public static byte[] field1972 = new byte[1];

    @ObfuscatedName("eh.g")
    public int field1978 = 0;

    @ObfuscatedName("eh.v")
    public int[] field1916;

    @ObfuscatedName("eh.p")
    public int[] field1917;

    @ObfuscatedName("eh.e")
    public int[] field1957;

    @ObfuscatedName("eh.d")
    public int field1964 = 0;

    @ObfuscatedName("eh.x")
    public int[] field1946;

    @ObfuscatedName("eh.z")
    public int[] field1921;

    @ObfuscatedName("eh.n")
    public int[] field1922;

    @ObfuscatedName("eh.u")
    public int[] field1919;

    @ObfuscatedName("eh.t")
    public int[] field1914;

    @ObfuscatedName("eh.a")
    public int[] field1934;

    @ObfuscatedName("eh.i")
    public byte[] field1926;

    @ObfuscatedName("eh.h")
    public byte[] field1927;

    @ObfuscatedName("eh.b")
    public byte[] field1928;

    @ObfuscatedName("eh.j")
    public short[] field1929;

    @ObfuscatedName("eh.y")
    public byte field1930 = 0;

    @ObfuscatedName("eh.k")
    public int field1925 = 0;

    @ObfuscatedName("eh.c")
    public int[] field1950;

    @ObfuscatedName("eh.r")
    public int[] field1933;

    @ObfuscatedName("eh.m")
    public int[] field1923;

    @ObfuscatedName("eh.l")
    public int[][] field1935;

    @ObfuscatedName("eh.f")
    public int[][] field1936;

    @ObfuscatedName("eh.ap")
    public boolean field1937 = false;

    @ObfuscatedName("eh.af")
    public int field1938;

    @ObfuscatedName("eh.aa")
    public int field1939;

    @ObfuscatedName("eh.ay")
    public int field1940;

    @ObfuscatedName("eh.aw")
    public int field1941;

    @ObfuscatedName("eh.az")
    public int field1942;

    @ObfuscatedName("eh.at")
    public int field1968;

    @ObfuscatedName("eh.ao")
    public int field1944;

    @ObfuscatedName("eh.aq")
    public int field1945;

    @ObfuscatedName("eh.ax")
    public int field1965 = -1;

    @ObfuscatedName("eh.av")
    public int field1947 = -1;

    @ObfuscatedName("eh.al")
    public int field1948 = -1;

    @ObfuscatedName("eh.ab")
    public static boolean[] field1951 = new boolean[4700];

    @ObfuscatedName("eh.aj")
    public static boolean[] field1920 = new boolean[4700];

    @ObfuscatedName("eh.ac")
    public static int[] field1952 = new int[4700];

    @ObfuscatedName("eh.ad")
    public static int[] field1953 = new int[4700];

    @ObfuscatedName("eh.am")
    public static int[] field1915 = new int[4700];

    @ObfuscatedName("eh.ah")
    public static int[] field1955 = new int[4700];

    @ObfuscatedName("eh.ak")
    public static int[] field1918 = new int[4700];

    @ObfuscatedName("eh.ar")
    public static int[] field1969 = new int[4700];

    @ObfuscatedName("eh.ai")
    public static int[] field1959 = new int[1600];

    @ObfuscatedName("eh.au")
    public static int[][] field1960 = new int[1600][512];

    @ObfuscatedName("eh.an")
    public static int[] field1943 = new int[12];

    @ObfuscatedName("eh.as")
    public static int[][] field1962 = new int[12][2000];

    @ObfuscatedName("eh.br")
    public static int[] field1911 = new int[2000];

    @ObfuscatedName("eh.bj")
    public static int[] field1931 = new int[2000];

    @ObfuscatedName("eh.bf")
    public static int[] field1932 = new int[12];

    @ObfuscatedName("eh.bw")
    public static int[] field1966 = new int[10];

    @ObfuscatedName("eh.bs")
    public static int[] field1967 = new int[10];

    @ObfuscatedName("eh.bp")
    public static int[] field1956 = new int[10];

    @ObfuscatedName("eh.bn")
    public static boolean field1954 = true;

    @ObfuscatedName("eh.bc")
    public static int[] field1975 = class135.field2024;

    @ObfuscatedName("eh.bd")
    public static int[] field1976 = class135.field2025;

    @ObfuscatedName("eh.bo")
    public static int[] field1963 = class135.field2020;

    @ObfuscatedName("eh.bq")
    public static int[] field1977 = class135.field2023;

    public class132() {
    }

    public class132(class132[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1978 = 0;
        this.field1964 = 0;
        this.field1925 = 0;
        this.field1930 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class132 var8 = arg0[var7];
            if (var8 != null) {
                this.field1978 += var8.field1978;
                this.field1964 += var8.field1964;
                this.field1925 += var8.field1925;
                if (var8.field1926 == null) {
                    if (this.field1930 == -1) {
                        this.field1930 = var8.field1930;
                    }
                    if (this.field1930 != var8.field1930) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1927 != null;
                var5 |= var8.field1929 != null;
                var6 |= var8.field1928 != null;
            }
        }
        this.field1916 = new int[this.field1978];
        this.field1917 = new int[this.field1978];
        this.field1957 = new int[this.field1978];
        this.field1946 = new int[this.field1964];
        this.field1921 = new int[this.field1964];
        this.field1922 = new int[this.field1964];
        this.field1919 = new int[this.field1964];
        this.field1914 = new int[this.field1964];
        this.field1934 = new int[this.field1964];
        if (var3) {
            this.field1926 = new byte[this.field1964];
        }
        if (var4) {
            this.field1927 = new byte[this.field1964];
        }
        if (var5) {
            this.field1929 = new short[this.field1964];
        }
        if (var6) {
            this.field1928 = new byte[this.field1964];
        }
        if (this.field1925 > 0) {
            this.field1950 = new int[this.field1925];
            this.field1933 = new int[this.field1925];
            this.field1923 = new int[this.field1925];
        }
        this.field1978 = 0;
        this.field1964 = 0;
        this.field1925 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class132 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1964; var11++) {
                    this.field1946[this.field1964] = var10.field1946[var11] + this.field1978;
                    this.field1921[this.field1964] = var10.field1921[var11] + this.field1978;
                    this.field1922[this.field1964] = var10.field1922[var11] + this.field1978;
                    this.field1919[this.field1964] = var10.field1919[var11];
                    this.field1914[this.field1964] = var10.field1914[var11];
                    this.field1934[this.field1964] = var10.field1934[var11];
                    if (var3) {
                        if (var10.field1926 == null) {
                            this.field1926[this.field1964] = var10.field1930;
                        } else {
                            this.field1926[this.field1964] = var10.field1926[var11];
                        }
                    }
                    if (var4 && var10.field1927 != null) {
                        this.field1927[this.field1964] = var10.field1927[var11];
                    }
                    if (var5) {
                        if (var10.field1929 == null) {
                            this.field1929[this.field1964] = -1;
                        } else {
                            this.field1929[this.field1964] = var10.field1929[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1928 == null || var10.field1928[var11] == -1) {
                            this.field1928[this.field1964] = -1;
                        } else {
                            this.field1928[this.field1964] = (byte) (var10.field1928[var11] + this.field1925);
                        }
                    }
                    this.field1964++;
                }
                for (int var12 = 0; var12 < var10.field1925; var12++) {
                    this.field1950[this.field1925] = var10.field1950[var12] + this.field1978;
                    this.field1933[this.field1925] = var10.field1933[var12] + this.field1978;
                    this.field1923[this.field1925] = var10.field1923[var12] + this.field1978;
                    this.field1925++;
                }
                for (int var13 = 0; var13 < var10.field1978; var13++) {
                    this.field1916[this.field1978] = var10.field1916[var13];
                    this.field1917[this.field1978] = var10.field1917[var13];
                    this.field1957[this.field1978] = var10.field1957[var13];
                    this.field1978++;
                }
            }
        }
    }

    @ObfuscatedName("eh.w([[IIIIZI)Leh;")
    public class132 method2379(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2358();
        int var7 = arg1 - this.field1940;
        int var8 = this.field1940 + arg1;
        int var9 = arg3 - this.field1940;
        int var10 = this.field1940 + arg3;
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
        class132 var15;
        if (arg4) {
            var15 = new class132();
            var15.field1978 = this.field1978;
            var15.field1964 = this.field1964;
            var15.field1925 = this.field1925;
            var15.field1916 = this.field1916;
            var15.field1957 = this.field1957;
            var15.field1946 = this.field1946;
            var15.field1921 = this.field1921;
            var15.field1922 = this.field1922;
            var15.field1919 = this.field1919;
            var15.field1914 = this.field1914;
            var15.field1934 = this.field1934;
            var15.field1926 = this.field1926;
            var15.field1927 = this.field1927;
            var15.field1928 = this.field1928;
            var15.field1929 = this.field1929;
            var15.field1930 = this.field1930;
            var15.field1950 = this.field1950;
            var15.field1933 = this.field1933;
            var15.field1923 = this.field1923;
            var15.field1935 = this.field1935;
            var15.field1936 = this.field1936;
            var15.field1937 = this.field1937;
            var15.field1917 = new int[var15.field1978];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1978; var16++) {
                int var17 = this.field1916[var16] + arg1;
                int var18 = this.field1957[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1917[var16] = this.field1917[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1978; var26++) {
                int var27 = (-this.field1917[var26] << 16) / this.field2103;
                if (var27 < arg5) {
                    int var28 = this.field1916[var26] + arg1;
                    int var29 = this.field1957[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1917[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1917[var26];
                }
            }
        }
        var15.method2361();
        return var15;
    }

    @ObfuscatedName("eh.s(Z)Leh;")
    public class132 method2428(boolean arg0) {
        if (!arg0 && field1912.length < this.field1964) {
            field1912 = new byte[this.field1964 + 100];
        }
        return this.method2356(arg0, field1924, field1912);
    }

    @ObfuscatedName("eh.o(Z)Leh;")
    public class132 method2429(boolean arg0) {
        if (!arg0 && field1972.length < this.field1964) {
            field1972 = new byte[this.field1964 + 100];
        }
        return this.method2356(arg0, field1913, field1972);
    }

    @ObfuscatedName("eh.g(ZLeh;[B)Leh;")
    public class132 method2356(boolean arg0, class132 arg1, byte[] arg2) {
        arg1.field1978 = this.field1978;
        arg1.field1964 = this.field1964;
        arg1.field1925 = this.field1925;
        if (arg1.field1916 == null || arg1.field1916.length < this.field1978) {
            arg1.field1916 = new int[this.field1978 + 100];
            arg1.field1917 = new int[this.field1978 + 100];
            arg1.field1957 = new int[this.field1978 + 100];
        }
        for (int var4 = 0; var4 < this.field1978; var4++) {
            arg1.field1916[var4] = this.field1916[var4];
            arg1.field1917[var4] = this.field1917[var4];
            arg1.field1957[var4] = this.field1957[var4];
        }
        if (arg0) {
            arg1.field1927 = this.field1927;
        } else {
            arg1.field1927 = arg2;
            if (this.field1927 == null) {
                for (int var5 = 0; var5 < this.field1964; var5++) {
                    arg1.field1927[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1964; var6++) {
                    arg1.field1927[var6] = this.field1927[var6];
                }
            }
        }
        arg1.field1946 = this.field1946;
        arg1.field1921 = this.field1921;
        arg1.field1922 = this.field1922;
        arg1.field1919 = this.field1919;
        arg1.field1914 = this.field1914;
        arg1.field1934 = this.field1934;
        arg1.field1926 = this.field1926;
        arg1.field1928 = this.field1928;
        arg1.field1929 = this.field1929;
        arg1.field1930 = this.field1930;
        arg1.field1950 = this.field1950;
        arg1.field1933 = this.field1933;
        arg1.field1923 = this.field1923;
        arg1.field1935 = this.field1935;
        arg1.field1936 = this.field1936;
        arg1.field1937 = this.field1937;
        arg1.method2361();
        return arg1;
    }

    @ObfuscatedName("eh.v(I)V")
    public void method2357(int arg0) {
        if (this.field1965 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1976[arg0];
        int var9 = field1975[arg0];
        for (int var10 = 0; var10 < this.field1978; var10++) {
            int var11 = class135.method2459(this.field1916[var10], this.field1957[var10], var8, var9);
            int var12 = this.field1917[var10];
            int var13 = class135.method2474(this.field1916[var10], this.field1957[var10], var8, var9);
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            if (var13 > var7) {
                var7 = var13;
            }
        }
        this.field1968 = (var2 + var5) / 2;
        this.field1944 = (var3 + var6) / 2;
        this.field1945 = (var4 + var7) / 2;
        this.field1965 = (var5 - var2 + 1) / 2;
        this.field1947 = (var6 - var3 + 1) / 2;
        this.field1948 = (var7 - var4 + 1) / 2;
        if (this.field1965 < 32) {
            this.field1965 = 32;
        }
        if (this.field1948 < 32) {
            this.field1948 = 32;
        }
        if (this.field1937) {
            this.field1965 += 8;
            this.field1948 += 8;
        }
    }

    @ObfuscatedName("eh.p()V")
    public void method2358() {
        if (this.field1938 == 1) {
            return;
        }
        this.field1938 = 1;
        this.field2103 = 0;
        this.field1939 = 0;
        this.field1940 = 0;
        for (int var1 = 0; var1 < this.field1978; var1++) {
            int var2 = this.field1916[var1];
            int var3 = this.field1917[var1];
            int var4 = this.field1957[var1];
            if (-var3 > this.field2103) {
                this.field2103 = -var3;
            }
            if (var3 > this.field1939) {
                this.field1939 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1940) {
                this.field1940 = var5;
            }
        }
        this.field1940 = (int) (Math.sqrt((double) this.field1940) + 0.99D);
        this.field1942 = (int) (Math.sqrt((double) (this.field2103 * this.field2103 + this.field1940 * this.field1940)) + 0.99D);
        this.field1941 = this.field1942 + (int) (Math.sqrt((double) (this.field1940 * this.field1940 + this.field1939 * this.field1939)) + 0.99D);
    }

    @ObfuscatedName("eh.e()V")
    public void method2359() {
        if (this.field1938 == 2) {
            return;
        }
        this.field1938 = 2;
        this.field1940 = 0;
        for (int var1 = 0; var1 < this.field1978; var1++) {
            int var2 = this.field1916[var1];
            int var3 = this.field1917[var1];
            int var4 = this.field1957[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1940) {
                this.field1940 = var5;
            }
        }
        this.field1940 = (int) (Math.sqrt((double) this.field1940) + 0.99D);
        this.field1942 = this.field1940;
        this.field1941 = this.field1940 + this.field1940;
    }

    @ObfuscatedName("eh.d()I")
    public int method2395() {
        this.method2358();
        return this.field1940;
    }

    @ObfuscatedName("eh.x()V")
    public void method2361() {
        this.field1938 = 0;
        this.field1965 = -1;
    }

    @ObfuscatedName("eh.b(Leo;I)V")
    public void method2425(class143 arg0, int arg1) {
        if (this.field1935 == null || arg1 == -1) {
            return;
        }
        class130 var3 = arg0.field2128[arg1];
        class137 var4 = var3.field1876;
        Statics.field1961 = 0;
        Statics.field1970 = 0;
        Statics.field1971 = 0;
        for (int var5 = 0; var5 < var3.field1881; var5++) {
            int var6 = var3.field1882[var5];
            this.method2355(var4.field2034[var6], var4.field2036[var6], var3.field1879[var5], var3.field1884[var5], var3.field1885[var5]);
        }
        this.method2361();
    }

    @ObfuscatedName("eh.j(Leo;ILeo;I[I)V")
    public void method2363(class143 arg0, int arg1, class143 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2425(arg0, arg1);
            return;
        }
        class130 var6 = arg0.field2128[arg1];
        class130 var7 = arg2.field2128[arg3];
        class137 var8 = var6.field1876;
        Statics.field1961 = 0;
        Statics.field1970 = 0;
        Statics.field1971 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1881; var11++) {
            int var12 = var6.field1882[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field2034[var12] == 0) {
                this.method2355(var8.field2034[var12], var8.field2036[var12], var6.field1879[var11], var6.field1884[var11], var6.field1885[var11]);
            }
        }
        Statics.field1961 = 0;
        Statics.field1970 = 0;
        Statics.field1971 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1881; var15++) {
            int var16 = var7.field1882[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field2034[var16] == 0) {
                this.method2355(var8.field2034[var16], var8.field2036[var16], var7.field1879[var15], var7.field1884[var15], var7.field1885[var15]);
            }
        }
        this.method2361();
    }

    @ObfuscatedName("eh.y(I[IIII)V")
    public void method2355(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1961 = 0;
            Statics.field1970 = 0;
            Statics.field1971 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1935.length) {
                    int[] var10 = this.field1935[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1961 += this.field1916[var12];
                        Statics.field1970 += this.field1917[var12];
                        Statics.field1971 += this.field1957[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1961 = Statics.field1961 / var7 + arg2;
                Statics.field1970 = Statics.field1970 / var7 + arg3;
                Statics.field1971 = Statics.field1971 / var7 + arg4;
            } else {
                Statics.field1961 = arg2;
                Statics.field1970 = arg3;
                Statics.field1971 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1935.length) {
                    int[] var15 = this.field1935[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1916[var17] += arg2;
                        this.field1917[var17] += arg3;
                        this.field1957[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1935.length) {
                    int[] var20 = this.field1935[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1916[var22] -= Statics.field1961;
                        this.field1917[var22] -= Statics.field1970;
                        this.field1957[var22] -= Statics.field1971;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1975[var25];
                            int var27 = field1976[var25];
                            int var28 = this.field1917[var22] * var26 + this.field1916[var22] * var27 >> 16;
                            this.field1917[var22] = this.field1917[var22] * var27 - this.field1916[var22] * var26 >> 16;
                            this.field1916[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1975[var23];
                            int var30 = field1976[var23];
                            int var31 = this.field1917[var22] * var30 - this.field1957[var22] * var29 >> 16;
                            this.field1957[var22] = this.field1957[var22] * var30 + this.field1917[var22] * var29 >> 16;
                            this.field1917[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1975[var24];
                            int var33 = field1976[var24];
                            int var34 = this.field1957[var22] * var32 + this.field1916[var22] * var33 >> 16;
                            this.field1957[var22] = this.field1957[var22] * var33 - this.field1916[var22] * var32 >> 16;
                            this.field1916[var22] = var34;
                        }
                        this.field1916[var22] += Statics.field1961;
                        this.field1917[var22] += Statics.field1970;
                        this.field1957[var22] += Statics.field1971;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1935.length) {
                    int[] var37 = this.field1935[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1916[var39] -= Statics.field1961;
                        this.field1917[var39] -= Statics.field1970;
                        this.field1957[var39] -= Statics.field1971;
                        this.field1916[var39] = this.field1916[var39] * arg2 / 128;
                        this.field1917[var39] = this.field1917[var39] * arg3 / 128;
                        this.field1957[var39] = this.field1957[var39] * arg4 / 128;
                        this.field1916[var39] += Statics.field1961;
                        this.field1917[var39] += Statics.field1970;
                        this.field1957[var39] += Statics.field1971;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1936 != null && this.field1927 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1936.length) {
                    int[] var42 = this.field1936[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1927[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1927[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("eh.c()V")
    public void method2365() {
        for (int var1 = 0; var1 < this.field1978; var1++) {
            int var2 = this.field1916[var1];
            this.field1916[var1] = this.field1957[var1];
            this.field1957[var1] = -var2;
        }
        this.method2361();
    }

    @ObfuscatedName("eh.r()V")
    public void method2366() {
        for (int var1 = 0; var1 < this.field1978; var1++) {
            this.field1916[var1] = -this.field1916[var1];
            this.field1957[var1] = -this.field1957[var1];
        }
        this.method2361();
    }

    @ObfuscatedName("eh.m()V")
    public void method2367() {
        for (int var1 = 0; var1 < this.field1978; var1++) {
            int var2 = this.field1957[var1];
            this.field1957[var1] = this.field1916[var1];
            this.field1916[var1] = -var2;
        }
        this.method2361();
    }

    @ObfuscatedName("eh.l(I)V")
    public void method2382(int arg0) {
        int var2 = field1975[arg0];
        int var3 = field1976[arg0];
        for (int var4 = 0; var4 < this.field1978; var4++) {
            int var5 = this.field1917[var4] * var3 - this.field1957[var4] * var2 >> 16;
            this.field1957[var4] = this.field1957[var4] * var3 + this.field1917[var4] * var2 >> 16;
            this.field1917[var4] = var5;
        }
        this.method2361();
    }

    @ObfuscatedName("eh.f(III)V")
    public void method2369(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1978; var4++) {
            this.field1916[var4] += arg0;
            this.field1917[var4] += arg1;
            this.field1957[var4] += arg2;
        }
        this.method2361();
    }

    @ObfuscatedName("eh.ap(III)V")
    public void method2424(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1978; var4++) {
            this.field1916[var4] = this.field1916[var4] * arg0 / 128;
            this.field1917[var4] = this.field1917[var4] * arg1 / 128;
            this.field1957[var4] = this.field1957[var4] * arg2 / 128;
        }
        this.method2361();
    }

    @ObfuscatedName("eh.af(IIIIIII)V")
    public final void method2371(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1959[0] = -1;
        if (this.field1938 != 2 && this.field1938 != 1) {
            this.method2359();
        }
        int var8 = Statics.field2017;
        int var9 = Statics.field2002;
        int var10 = field1975[arg0];
        int var11 = field1976[arg0];
        int var12 = field1975[arg1];
        int var13 = field1976[arg1];
        int var14 = field1975[arg2];
        int var15 = field1976[arg2];
        int var16 = field1975[arg3];
        int var17 = field1976[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1978; var19++) {
            int var20 = this.field1916[var19];
            int var21 = this.field1917[var19];
            int var22 = this.field1957[var19];
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
            field1915[var19] = var30 - var18;
            field1952[var19] = class135.field2010 * var26 / var30 + var8;
            field1953[var19] = class135.field2010 * var29 / var30 + var9;
            if (this.field1925 > 0) {
                field1955[var19] = var26;
                field1918[var19] = var29;
                field1969[var19] = var30;
            }
        }
        try {
            this.method2374(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("eh.aa(IIIIIIII)V")
    public final void method2376(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1959[0] = -1;
        if (this.field1938 != 2 && this.field1938 != 1) {
            this.method2359();
        }
        int var9 = Statics.field2017;
        int var10 = Statics.field2002;
        int var11 = field1975[arg0];
        int var12 = field1976[arg0];
        int var13 = field1975[arg1];
        int var14 = field1976[arg1];
        int var15 = field1975[arg2];
        int var16 = field1976[arg2];
        int var17 = field1975[arg3];
        int var18 = field1976[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1978; var20++) {
            int var21 = this.field1916[var20];
            int var22 = this.field1917[var20];
            int var23 = this.field1957[var20];
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
            field1915[var20] = var31 - var19;
            field1952[var20] = class135.field2010 * var27 / arg7 + var9;
            field1953[var20] = class135.field2010 * var30 / arg7 + var10;
            if (this.field1925 > 0) {
                field1955[var20] = var27;
                field1918[var20] = var30;
                field1969[var20] = var31;
            }
        }
        try {
            this.method2374(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("eh.cd(IIIIIIIII)V")
    public void method2373(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1959[0] = -1;
        if (this.field1938 != 1) {
            this.method2358();
        }
        this.method2357(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1940 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1940) * class135.field2010;
        if (var15 / var13 >= Statics.field2016) {
            return;
        }
        int var16 = (this.field1940 + var14) * class135.field2010;
        if (var16 / var13 <= Statics.field2015) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1940 * arg1 >> 16;
        int var19 = (var17 + var18) * class135.field2010;
        if (var19 / var13 <= Statics.field2012) {
            return;
        }
        int var20 = (this.field2103 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class135.field2010;
        if (var21 / var13 >= Statics.field2018) {
            return;
        }
        int var22 = (this.field2103 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1925 > 0;
        int var26 = class133.field1994;
        int var28 = class133.field1987;
        boolean var30 = class133.method1563();
        if (class8.field246 && arg8 > 0) {
            class8.method4134(this, arg5, arg6, arg7);
        }
        if (class8.field239 && arg8 > 0) {
            int var31 = var11 - var12;
            if (var31 <= 50) {
                var31 = 50;
            }
            int var36;
            int var37;
            if (var14 > 0) {
                var36 = var15 / var13;
                var37 = var16 / var31;
            } else {
                var37 = var16 / var13;
                var36 = var15 / var31;
            }
            int var38;
            int var39;
            if (var17 > 0) {
                var38 = var21 / var13;
                var39 = var19 / var31;
            } else {
                var39 = var19 / var13;
                var38 = var21 / var31;
            }
            int var40 = -8355840;
            int var41 = var26 - Statics.field2017;
            int var42 = var28 - Statics.field2002;
            if (var41 > var36 && var41 < var37 && var42 > var38 && var42 < var39) {
                var40 = -256;
            }
            int var43 = Statics.field2017 + var36;
            int var44 = Statics.field2002 + var38;
            int var45 = Statics.field2017 + var37;
            int var46 = Statics.field2002 + var39;
            class8.field242.method3391(new class9(var43, var44, var45, var46, var40));
        }
        boolean var47 = false;
        if (arg8 > 0 && var30) {
            boolean var48 = false;
            if (field1954) {
                var48 = class133.method4070(this, arg5, arg6, arg7);
            } else {
                int var49 = var11 - var12;
                if (var49 <= 50) {
                    var49 = 50;
                }
                int var50;
                int var51;
                if (var14 > 0) {
                    var50 = var15 / var13;
                    var51 = var16 / var49;
                } else {
                    var51 = var16 / var13;
                    var50 = var15 / var49;
                }
                int var52;
                int var53;
                if (var17 > 0) {
                    var52 = var21 / var13;
                    var53 = var19 / var49;
                } else {
                    var53 = var19 / var13;
                    var52 = var21 / var49;
                }
                int var54 = var26 - Statics.field2017;
                int var55 = var28 - Statics.field2002;
                if (var54 > var50 && var54 < var51 && var55 > var52 && var55 < var53) {
                    var48 = true;
                }
            }
            if (var48) {
                if (this.field1937) {
                    class133.field1990[++class133.field1982 - 1] = arg8;
                } else {
                    var47 = true;
                }
            }
        }
        int var57 = Statics.field2017;
        int var58 = Statics.field2002;
        int var59 = 0;
        int var60 = 0;
        if (arg0 != 0) {
            var59 = field1975[arg0];
            var60 = field1976[arg0];
        }
        for (int var61 = 0; var61 < this.field1978; var61++) {
            int var62 = this.field1916[var61];
            int var63 = this.field1917[var61];
            int var64 = this.field1957[var61];
            if (arg0 != 0) {
                int var65 = var59 * var64 + var60 * var62 >> 16;
                var64 = var60 * var64 - var59 * var62 >> 16;
                var62 = var65;
            }
            int var66 = arg5 + var62;
            int var67 = arg6 + var63;
            int var68 = arg7 + var64;
            int var69 = arg3 * var68 + arg4 * var66 >> 16;
            int var70 = arg4 * var68 - arg3 * var66 >> 16;
            int var72 = arg2 * var67 - arg1 * var70 >> 16;
            int var73 = arg1 * var67 + arg2 * var70 >> 16;
            field1915[var61] = var73 - var11;
            if (var73 >= 50) {
                field1952[var61] = class135.field2010 * var69 / var73 + var57;
                field1953[var61] = class135.field2010 * var72 / var73 + var58;
            } else {
                field1952[var61] = -5000;
                var23 = true;
            }
            if (var25) {
                field1955[var61] = var69;
                field1918[var61] = var72;
                field1969[var61] = var73;
            }
        }
        try {
            this.method2374(var23, var47, this.field1937, arg8);
        } catch (Exception var76) {
        }
    }

    @ObfuscatedName("eh.ay(ZZZI)V")
    public final void method2374(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1941 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1941; var5++) {
            field1959[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field248 && arg1) {
            class132 var7 = this;
            for (int var8 = 0; var8 < var7.field1964; var8++) {
                if (var7.field1934[var8] != -2) {
                    int var9 = var7.field1946[var8];
                    int var10 = var7.field1921[var8];
                    int var11 = var7.field1922[var8];
                    int var12 = field1952[var9];
                    int var13 = field1952[var10];
                    int var14 = field1952[var11];
                    Statics.method727(field1953[var9], field1953[var10], field1953[var11], var12, var13, var14, var6);
                }
            }
        }
        for (int var15 = 0; var15 < this.field1964; var15++) {
            if (this.field1934[var15] != -2) {
                int var16 = this.field1946[var15];
                int var17 = this.field1921[var15];
                int var18 = this.field1922[var15];
                int var19 = field1952[var16];
                int var20 = field1952[var17];
                int var21 = field1952[var18];
                if (arg0 && var19 == -5000 || var20 == -5000 || var21 == -5000) {
                    int var22 = field1955[var16];
                    int var23 = field1955[var17];
                    int var24 = field1955[var18];
                    int var25 = field1918[var16];
                    int var26 = field1918[var17];
                    int var27 = field1918[var18];
                    int var28 = field1969[var16];
                    int var29 = field1969[var17];
                    int var30 = field1969[var18];
                    int var31 = var22 - var23;
                    int var32 = var24 - var23;
                    int var33 = var25 - var26;
                    int var34 = var27 - var26;
                    int var35 = var28 - var29;
                    int var36 = var30 - var29;
                    int var37 = var33 * var36 - var34 * var35;
                    int var38 = var32 * var35 - var31 * var36;
                    int var39 = var31 * var34 - var32 * var33;
                    if (var29 * var39 + var23 * var37 + var26 * var38 > 0) {
                        field1920[var15] = true;
                        int var40 = (field1915[var16] + field1915[var17] + field1915[var18]) / 3 + this.field1942;
                        field1960[var40][field1959[var40]++] = var15;
                    }
                } else {
                    if (arg1) {
                        int var41 = field1953[var16];
                        int var42 = field1953[var17];
                        int var43 = field1953[var18];
                        int var44 = class133.field1987 + var6;
                        boolean var45;
                        if (var44 < var41 && var44 < var42 && var44 < var43) {
                            var45 = false;
                        } else {
                            int var46 = class133.field1987 - var6;
                            if (var46 > var41 && var46 > var42 && var46 > var43) {
                                var45 = false;
                            } else {
                                int var47 = class133.field1994 + var6;
                                if (var47 < var19 && var47 < var20 && var47 < var21) {
                                    var45 = false;
                                } else {
                                    int var48 = class133.field1994 - var6;
                                    if (var48 > var19 && var48 > var20 && var48 > var21) {
                                        var45 = false;
                                    } else {
                                        var45 = true;
                                    }
                                }
                            }
                        }
                        if (var45) {
                            class133.field1990[++class133.field1982 - 1] = arg3;
                            arg1 = false;
                        }
                    }
                    if ((field1953[var18] - field1953[var17]) * (var19 - var20) - (field1953[var16] - field1953[var17]) * (var21 - var20) > 0) {
                        field1920[var15] = false;
                        if (var19 >= 0 && var20 >= 0 && var21 >= 0 && var19 <= Statics.field2013 && var20 <= Statics.field2013 && var21 <= Statics.field2013) {
                            field1951[var15] = false;
                        } else {
                            field1951[var15] = true;
                        }
                        int var50 = (field1915[var16] + field1915[var17] + field1915[var18]) / 3 + this.field1942;
                        field1960[var50][field1959[var50]++] = var15;
                    }
                }
            }
        }
        if (this.field1926 == null) {
            for (int var51 = this.field1941 - 1; var51 >= 0; var51--) {
                int var52 = field1959[var51];
                if (var52 > 0) {
                    int[] var53 = field1960[var51];
                    for (int var54 = 0; var54 < var52; var54++) {
                        this.method2375(var53[var54]);
                    }
                }
            }
            return;
        }
        for (int var55 = 0; var55 < 12; var55++) {
            field1943[var55] = 0;
            field1932[var55] = 0;
        }
        for (int var56 = this.field1941 - 1; var56 >= 0; var56--) {
            int var57 = field1959[var56];
            if (var57 > 0) {
                int[] var58 = field1960[var56];
                for (int var59 = 0; var59 < var57; var59++) {
                    int var60 = var58[var59];
                    byte var61 = this.field1926[var60];
                    int var62 = field1943[var61]++;
                    field1962[var61][var62] = var60;
                    if (var61 < 10) {
                        field1932[var61] += var56;
                    } else if (var61 == 10) {
                        field1911[var62] = var56;
                    } else {
                        field1931[var62] = var56;
                    }
                }
            }
        }
        int var63 = 0;
        if (field1943[1] > 0 || field1943[2] > 0) {
            var63 = (field1932[1] + field1932[2]) / (field1943[1] + field1943[2]);
        }
        int var64 = 0;
        if (field1943[3] > 0 || field1943[4] > 0) {
            var64 = (field1932[3] + field1932[4]) / (field1943[3] + field1943[4]);
        }
        int var65 = 0;
        if (field1943[6] > 0 || field1943[8] > 0) {
            var65 = (field1932[6] + field1932[8]) / (field1943[6] + field1943[8]);
        }
        int var66 = 0;
        int var67 = field1943[10];
        int[] var68 = field1962[10];
        int[] var69 = field1911;
        if (var66 == var67) {
            var66 = 0;
            var67 = field1943[11];
            var68 = field1962[11];
            var69 = field1931;
        }
        int var70;
        if (var66 < var67) {
            var70 = var69[var66];
        } else {
            var70 = -1000;
        }
        for (int var71 = 0; var71 < 10; var71++) {
            while (var71 == 0 && var70 > var63) {
                this.method2375(var68[var66++]);
                if (var66 == var67 && field1962[11] != var68) {
                    var66 = 0;
                    var67 = field1943[11];
                    var68 = field1962[11];
                    var69 = field1931;
                }
                if (var66 < var67) {
                    var70 = var69[var66];
                } else {
                    var70 = -1000;
                }
            }
            while (var71 == 3 && var70 > var64) {
                this.method2375(var68[var66++]);
                if (var66 == var67 && field1962[11] != var68) {
                    var66 = 0;
                    var67 = field1943[11];
                    var68 = field1962[11];
                    var69 = field1931;
                }
                if (var66 < var67) {
                    var70 = var69[var66];
                } else {
                    var70 = -1000;
                }
            }
            while (var71 == 5 && var70 > var65) {
                this.method2375(var68[var66++]);
                if (var66 == var67 && field1962[11] != var68) {
                    var66 = 0;
                    var67 = field1943[11];
                    var68 = field1962[11];
                    var69 = field1931;
                }
                if (var66 < var67) {
                    var70 = var69[var66];
                } else {
                    var70 = -1000;
                }
            }
            int var72 = field1943[var71];
            int[] var73 = field1962[var71];
            for (int var74 = 0; var74 < var72; var74++) {
                this.method2375(var73[var74]);
            }
        }
        while (var70 != -1000) {
            this.method2375(var68[var66++]);
            if (var66 == var67 && field1962[11] != var68) {
                var66 = 0;
                var68 = field1962[11];
                var67 = field1943[11];
                var69 = field1931;
            }
            if (var66 < var67) {
                var70 = var69[var66];
            } else {
                var70 = -1000;
            }
        }
    }

    @ObfuscatedName("eh.aw(I)V")
    public final void method2375(int arg0) {
        if (field1920[arg0]) {
            this.method2404(arg0);
            return;
        }
        int var2 = this.field1946[arg0];
        int var3 = this.field1921[arg0];
        int var4 = this.field1922[arg0];
        class135.field1999 = field1951[arg0];
        if (this.field1927 == null) {
            class135.field2011 = 0;
        } else {
            class135.field2011 = this.field1927[arg0] & 0xFF;
        }
        if (this.field1929 != null && this.field1929[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1928 == null || this.field1928[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1928[arg0] & 0xFF;
                var6 = this.field1950[var5];
                var7 = this.field1933[var5];
                var8 = this.field1923[var5];
            }
            if (this.field1934[arg0] == -1) {
                class135.method2443(field1953[var2], field1953[var3], field1953[var4], field1952[var2], field1952[var3], field1952[var4], this.field1919[arg0], this.field1919[arg0], this.field1919[arg0], field1955[var6], field1955[var7], field1955[var8], field1918[var6], field1918[var7], field1918[var8], field1969[var6], field1969[var7], field1969[var8], this.field1929[arg0]);
            } else {
                class135.method2443(field1953[var2], field1953[var3], field1953[var4], field1952[var2], field1952[var3], field1952[var4], this.field1919[arg0], this.field1914[arg0], this.field1934[arg0], field1955[var6], field1955[var7], field1955[var8], field1918[var6], field1918[var7], field1918[var8], field1969[var6], field1969[var7], field1969[var8], this.field1929[arg0]);
            }
        } else if (this.field1934[arg0] == -1) {
            class135.method2452(field1953[var2], field1953[var3], field1953[var4], field1952[var2], field1952[var3], field1952[var4], field1963[this.field1919[arg0]]);
        } else {
            class135.method2483(field1953[var2], field1953[var3], field1953[var4], field1952[var2], field1952[var3], field1952[var4], this.field1919[arg0], this.field1914[arg0], this.field1934[arg0]);
        }
    }

    @ObfuscatedName("eh.az(I)V")
    public final void method2404(int arg0) {
        int var2 = Statics.field2017;
        int var3 = Statics.field2002;
        int var4 = 0;
        int var5 = this.field1946[arg0];
        int var6 = this.field1921[arg0];
        int var7 = this.field1922[arg0];
        int var8 = field1969[var5];
        int var9 = field1969[var6];
        int var10 = field1969[var7];
        if (this.field1927 == null) {
            class135.field2011 = 0;
        } else {
            class135.field2011 = this.field1927[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1966[var4] = field1952[var5];
            field1967[var4] = field1953[var5];
            field1956[var4++] = this.field1919[arg0];
        } else {
            int var11 = field1955[var5];
            int var12 = field1918[var5];
            int var13 = this.field1919[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1977[var10 - var8];
                field1966[var4] = (((field1955[var7] - var11) * var14 >> 16) + var11) * class135.field2010 / 50 + var2;
                field1967[var4] = (((field1918[var7] - var12) * var14 >> 16) + var12) * class135.field2010 / 50 + var3;
                field1956[var4++] = ((this.field1934[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1977[var9 - var8];
                field1966[var4] = (((field1955[var6] - var11) * var15 >> 16) + var11) * class135.field2010 / 50 + var2;
                field1967[var4] = (((field1918[var6] - var12) * var15 >> 16) + var12) * class135.field2010 / 50 + var3;
                field1956[var4++] = ((this.field1914[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1966[var4] = field1952[var6];
            field1967[var4] = field1953[var6];
            field1956[var4++] = this.field1914[arg0];
        } else {
            int var16 = field1955[var6];
            int var17 = field1918[var6];
            int var18 = this.field1914[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1977[var8 - var9];
                field1966[var4] = (((field1955[var5] - var16) * var19 >> 16) + var16) * class135.field2010 / 50 + var2;
                field1967[var4] = (((field1918[var5] - var17) * var19 >> 16) + var17) * class135.field2010 / 50 + var3;
                field1956[var4++] = ((this.field1919[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1977[var10 - var9];
                field1966[var4] = (((field1955[var7] - var16) * var20 >> 16) + var16) * class135.field2010 / 50 + var2;
                field1967[var4] = (((field1918[var7] - var17) * var20 >> 16) + var17) * class135.field2010 / 50 + var3;
                field1956[var4++] = ((this.field1934[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1966[var4] = field1952[var7];
            field1967[var4] = field1953[var7];
            field1956[var4++] = this.field1934[arg0];
        } else {
            int var21 = field1955[var7];
            int var22 = field1918[var7];
            int var23 = this.field1934[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1977[var9 - var10];
                field1966[var4] = (((field1955[var6] - var21) * var24 >> 16) + var21) * class135.field2010 / 50 + var2;
                field1967[var4] = (((field1918[var6] - var22) * var24 >> 16) + var22) * class135.field2010 / 50 + var3;
                field1956[var4++] = ((this.field1914[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1977[var8 - var10];
                field1966[var4] = (((field1955[var5] - var21) * var25 >> 16) + var21) * class135.field2010 / 50 + var2;
                field1967[var4] = (((field1918[var5] - var22) * var25 >> 16) + var22) * class135.field2010 / 50 + var3;
                field1956[var4++] = ((this.field1919[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1966[0];
        int var27 = field1966[1];
        int var28 = field1966[2];
        int var29 = field1967[0];
        int var30 = field1967[1];
        int var31 = field1967[2];
        class135.field1999 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2013 || var27 > Statics.field2013 || var28 > Statics.field2013) {
                class135.field1999 = true;
            }
            if (this.field1929 != null && this.field1929[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1928 == null || this.field1928[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1928[arg0] & 0xFF;
                    var33 = this.field1950[var32];
                    var34 = this.field1933[var32];
                    var35 = this.field1923[var32];
                }
                if (this.field1934[arg0] == -1) {
                    class135.method2443(var29, var30, var31, var26, var27, var28, this.field1919[arg0], this.field1919[arg0], this.field1919[arg0], field1955[var33], field1955[var34], field1955[var35], field1918[var33], field1918[var34], field1918[var35], field1969[var33], field1969[var34], field1969[var35], this.field1929[arg0]);
                } else {
                    class135.method2443(var29, var30, var31, var26, var27, var28, field1956[0], field1956[1], field1956[2], field1955[var33], field1955[var34], field1955[var35], field1918[var33], field1918[var34], field1918[var35], field1969[var33], field1969[var34], field1969[var35], this.field1929[arg0]);
                }
            } else if (this.field1934[arg0] == -1) {
                class135.method2452(var29, var30, var31, var26, var27, var28, field1963[this.field1919[arg0]]);
            } else {
                class135.method2483(var29, var30, var31, var26, var27, var28, field1956[0], field1956[1], field1956[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2013 || var27 > Statics.field2013 || var28 > Statics.field2013 || field1966[3] < 0 || field1966[3] > Statics.field2013) {
            class135.field1999 = true;
        }
        if (this.field1929 != null && this.field1929[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1928 == null || this.field1928[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1928[arg0] & 0xFF;
                var37 = this.field1950[var36];
                var38 = this.field1933[var36];
                var39 = this.field1923[var36];
            }
            short var40 = this.field1929[arg0];
            if (this.field1934[arg0] == -1) {
                class135.method2443(var29, var30, var31, var26, var27, var28, this.field1919[arg0], this.field1919[arg0], this.field1919[arg0], field1955[var37], field1955[var38], field1955[var39], field1918[var37], field1918[var38], field1918[var39], field1969[var37], field1969[var38], field1969[var39], var40);
                class135.method2443(var29, var31, field1967[3], var26, var28, field1966[3], this.field1919[arg0], this.field1919[arg0], this.field1919[arg0], field1955[var37], field1955[var38], field1955[var39], field1918[var37], field1918[var38], field1918[var39], field1969[var37], field1969[var38], field1969[var39], var40);
            } else {
                class135.method2443(var29, var30, var31, var26, var27, var28, field1956[0], field1956[1], field1956[2], field1955[var37], field1955[var38], field1955[var39], field1918[var37], field1918[var38], field1918[var39], field1969[var37], field1969[var38], field1969[var39], var40);
                class135.method2443(var29, var31, field1967[3], var26, var28, field1966[3], field1956[0], field1956[2], field1956[3], field1955[var37], field1955[var38], field1955[var39], field1918[var37], field1918[var38], field1918[var39], field1969[var37], field1969[var38], field1969[var39], var40);
            }
        } else if (this.field1934[arg0] == -1) {
            int var41 = field1963[this.field1919[arg0]];
            class135.method2452(var29, var30, var31, var26, var27, var28, var41);
            class135.method2452(var29, var31, field1967[3], var26, var28, field1966[3], var41);
        } else {
            class135.method2483(var29, var30, var31, var26, var27, var28, field1956[0], field1956[1], field1956[2]);
            class135.method2483(var29, var31, field1967[3], var26, var28, field1966[3], field1956[0], field1956[2], field1956[3]);
        }
    }
}
