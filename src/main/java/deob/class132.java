package deob;

@ObfuscatedName("eb")
public class class132 extends class140 {

    @ObfuscatedName("eb.d")
    public static class132 field1928 = new class132();

    @ObfuscatedName("eb.k")
    public static byte[] field1946 = new byte[1];

    @ObfuscatedName("eb.e")
    public static class132 field1915 = new class132();

    @ObfuscatedName("eb.p")
    public static byte[] field1916 = new byte[1];

    @ObfuscatedName("eb.q")
    public int field1950 = 0;

    @ObfuscatedName("eb.s")
    public int[] field1918;

    @ObfuscatedName("eb.r")
    public int[] field1926;

    @ObfuscatedName("eb.g")
    public int[] field1920;

    @ObfuscatedName("eb.v")
    public int field1962 = 0;

    @ObfuscatedName("eb.t")
    public int[] field1922;

    @ObfuscatedName("eb.y")
    public int[] field1923;

    @ObfuscatedName("eb.o")
    public int[] field1924;

    @ObfuscatedName("eb.i")
    public int[] field1979;

    @ObfuscatedName("eb.u")
    public int[] field1927;

    @ObfuscatedName("eb.b")
    public int[] field1936;

    @ObfuscatedName("eb.f")
    public byte[] field1951;

    @ObfuscatedName("eb.j")
    public byte[] field1965;

    @ObfuscatedName("eb.x")
    public byte[] field1930;

    @ObfuscatedName("eb.c")
    public short[] field1976;

    @ObfuscatedName("eb.h")
    public byte field1932 = 0;

    @ObfuscatedName("eb.a")
    public int field1942 = 0;

    @ObfuscatedName("eb.z")
    public int[] field1934;

    @ObfuscatedName("eb.l")
    public int[] field1935;

    @ObfuscatedName("eb.w")
    public int[] field1929;

    @ObfuscatedName("eb.n")
    public int[][] field1937;

    @ObfuscatedName("eb.m")
    public int[][] field1938;

    @ObfuscatedName("eb.ae")
    public boolean field1939 = false;

    @ObfuscatedName("eb.ai")
    public int field1940;

    @ObfuscatedName("eb.ah")
    public int field1941;

    @ObfuscatedName("eb.ab")
    public int field1931;

    @ObfuscatedName("eb.ad")
    public int field1943;

    @ObfuscatedName("eb.ag")
    public int field1944;

    @ObfuscatedName("eb.as")
    public int field1945;

    @ObfuscatedName("eb.af")
    public int field1964;

    @ObfuscatedName("eb.aq")
    public int field1947;

    @ObfuscatedName("eb.am")
    public int field1948 = -1;

    @ObfuscatedName("eb.az")
    public int field1949 = -1;

    @ObfuscatedName("eb.av")
    public int field1925 = -1;

    @ObfuscatedName("eb.ar")
    public static boolean[] field1952 = new boolean[4700];

    @ObfuscatedName("eb.aa")
    public static boolean[] field1919 = new boolean[4700];

    @ObfuscatedName("eb.aj")
    public static int[] field1954 = new int[4700];

    @ObfuscatedName("eb.ap")
    public static int[] field1955 = new int[4700];

    @ObfuscatedName("eb.ao")
    public static int[] field1956 = new int[4700];

    @ObfuscatedName("eb.at")
    public static int[] field1957 = new int[4700];

    @ObfuscatedName("eb.aw")
    public static int[] field1958 = new int[4700];

    @ObfuscatedName("eb.ax")
    public static int[] field1959 = new int[4700];

    @ObfuscatedName("eb.au")
    public static int[] field1961 = new int[1600];

    @ObfuscatedName("eb.al")
    public static int[][] field1921 = new int[1600][512];

    @ObfuscatedName("eb.ay")
    public static int[] field1963 = new int[12];

    @ObfuscatedName("eb.ak")
    public static int[][] field1978 = new int[12][2000];

    @ObfuscatedName("eb.bj")
    public static int[] field1966 = new int[2000];

    @ObfuscatedName("eb.bf")
    public static int[] field1914 = new int[2000];

    @ObfuscatedName("eb.bq")
    public static int[] field1953 = new int[12];

    @ObfuscatedName("eb.bc")
    public static int[] field1968 = new int[10];

    @ObfuscatedName("eb.by")
    public static int[] field1969 = new int[10];

    @ObfuscatedName("eb.bb")
    public static int[] field1970 = new int[10];

    @ObfuscatedName("eb.bi")
    public static boolean field1974 = true;

    @ObfuscatedName("eb.br")
    public static int[] field1977 = class135.field2016;

    @ObfuscatedName("eb.bu")
    public static int[] field1967 = class135.field2023;

    @ObfuscatedName("eb.bv")
    public static int[] field1913 = class135.field2003;

    @ObfuscatedName("eb.bk")
    public static int[] field1971 = class135.field2021;

    public class132() {
    }

    public class132(class132[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1950 = 0;
        this.field1962 = 0;
        this.field1942 = 0;
        this.field1932 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class132 var8 = arg0[var7];
            if (var8 != null) {
                this.field1950 += var8.field1950;
                this.field1962 += var8.field1962;
                this.field1942 += var8.field1942;
                if (var8.field1951 == null) {
                    if (this.field1932 == -1) {
                        this.field1932 = var8.field1932;
                    }
                    if (this.field1932 != var8.field1932) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1965 != null;
                var5 |= var8.field1976 != null;
                var6 |= var8.field1930 != null;
            }
        }
        this.field1918 = new int[this.field1950];
        this.field1926 = new int[this.field1950];
        this.field1920 = new int[this.field1950];
        this.field1922 = new int[this.field1962];
        this.field1923 = new int[this.field1962];
        this.field1924 = new int[this.field1962];
        this.field1979 = new int[this.field1962];
        this.field1927 = new int[this.field1962];
        this.field1936 = new int[this.field1962];
        if (var3) {
            this.field1951 = new byte[this.field1962];
        }
        if (var4) {
            this.field1965 = new byte[this.field1962];
        }
        if (var5) {
            this.field1976 = new short[this.field1962];
        }
        if (var6) {
            this.field1930 = new byte[this.field1962];
        }
        if (this.field1942 > 0) {
            this.field1934 = new int[this.field1942];
            this.field1935 = new int[this.field1942];
            this.field1929 = new int[this.field1942];
        }
        this.field1950 = 0;
        this.field1962 = 0;
        this.field1942 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class132 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1962; var11++) {
                    this.field1922[this.field1962] = var10.field1922[var11] + this.field1950;
                    this.field1923[this.field1962] = var10.field1923[var11] + this.field1950;
                    this.field1924[this.field1962] = var10.field1924[var11] + this.field1950;
                    this.field1979[this.field1962] = var10.field1979[var11];
                    this.field1927[this.field1962] = var10.field1927[var11];
                    this.field1936[this.field1962] = var10.field1936[var11];
                    if (var3) {
                        if (var10.field1951 == null) {
                            this.field1951[this.field1962] = var10.field1932;
                        } else {
                            this.field1951[this.field1962] = var10.field1951[var11];
                        }
                    }
                    if (var4 && var10.field1965 != null) {
                        this.field1965[this.field1962] = var10.field1965[var11];
                    }
                    if (var5) {
                        if (var10.field1976 == null) {
                            this.field1976[this.field1962] = -1;
                        } else {
                            this.field1976[this.field1962] = var10.field1976[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1930 == null || var10.field1930[var11] == -1) {
                            this.field1930[this.field1962] = -1;
                        } else {
                            this.field1930[this.field1962] = (byte) (var10.field1930[var11] + this.field1942);
                        }
                    }
                    this.field1962++;
                }
                for (int var12 = 0; var12 < var10.field1942; var12++) {
                    this.field1934[this.field1942] = var10.field1934[var12] + this.field1950;
                    this.field1935[this.field1942] = var10.field1935[var12] + this.field1950;
                    this.field1929[this.field1942] = var10.field1929[var12] + this.field1950;
                    this.field1942++;
                }
                for (int var13 = 0; var13 < var10.field1950; var13++) {
                    this.field1918[this.field1950] = var10.field1918[var13];
                    this.field1926[this.field1950] = var10.field1926[var13];
                    this.field1920[this.field1950] = var10.field1920[var13];
                    this.field1950++;
                }
            }
        }
    }

    @ObfuscatedName("eb.d([[IIIIZI)Leb;")
    public class132 method2359(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2364();
        int var7 = arg1 - this.field1931;
        int var8 = this.field1931 + arg1;
        int var9 = arg3 - this.field1931;
        int var10 = this.field1931 + arg3;
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
            var15.field1950 = this.field1950;
            var15.field1962 = this.field1962;
            var15.field1942 = this.field1942;
            var15.field1918 = this.field1918;
            var15.field1920 = this.field1920;
            var15.field1922 = this.field1922;
            var15.field1923 = this.field1923;
            var15.field1924 = this.field1924;
            var15.field1979 = this.field1979;
            var15.field1927 = this.field1927;
            var15.field1936 = this.field1936;
            var15.field1951 = this.field1951;
            var15.field1965 = this.field1965;
            var15.field1930 = this.field1930;
            var15.field1976 = this.field1976;
            var15.field1932 = this.field1932;
            var15.field1934 = this.field1934;
            var15.field1935 = this.field1935;
            var15.field1929 = this.field1929;
            var15.field1937 = this.field1937;
            var15.field1938 = this.field1938;
            var15.field1939 = this.field1939;
            var15.field1926 = new int[var15.field1950];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1950; var16++) {
                int var17 = this.field1918[var16] + arg1;
                int var18 = this.field1920[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1926[var16] = this.field1926[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1950; var26++) {
                int var27 = (-this.field1926[var26] << 16) / this.field2115;
                if (var27 < arg5) {
                    int var28 = this.field1918[var26] + arg1;
                    int var29 = this.field1920[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1926[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1926[var26];
                }
            }
        }
        var15.method2425();
        return var15;
    }

    @ObfuscatedName("eb.k(Z)Leb;")
    public class132 method2411(boolean arg0) {
        if (!arg0 && field1946.length < this.field1962) {
            field1946 = new byte[this.field1962 + 100];
        }
        return this.method2374(arg0, field1928, field1946);
    }

    @ObfuscatedName("eb.p(Z)Leb;")
    public class132 method2361(boolean arg0) {
        if (!arg0 && field1916.length < this.field1962) {
            field1916 = new byte[this.field1962 + 100];
        }
        return this.method2374(arg0, field1915, field1916);
    }

    @ObfuscatedName("eb.q(ZLeb;[B)Leb;")
    public class132 method2374(boolean arg0, class132 arg1, byte[] arg2) {
        arg1.field1950 = this.field1950;
        arg1.field1962 = this.field1962;
        arg1.field1942 = this.field1942;
        if (arg1.field1918 == null || arg1.field1918.length < this.field1950) {
            arg1.field1918 = new int[this.field1950 + 100];
            arg1.field1926 = new int[this.field1950 + 100];
            arg1.field1920 = new int[this.field1950 + 100];
        }
        for (int var4 = 0; var4 < this.field1950; var4++) {
            arg1.field1918[var4] = this.field1918[var4];
            arg1.field1926[var4] = this.field1926[var4];
            arg1.field1920[var4] = this.field1920[var4];
        }
        if (arg0) {
            arg1.field1965 = this.field1965;
        } else {
            arg1.field1965 = arg2;
            if (this.field1965 == null) {
                for (int var5 = 0; var5 < this.field1962; var5++) {
                    arg1.field1965[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1962; var6++) {
                    arg1.field1965[var6] = this.field1965[var6];
                }
            }
        }
        arg1.field1922 = this.field1922;
        arg1.field1923 = this.field1923;
        arg1.field1924 = this.field1924;
        arg1.field1979 = this.field1979;
        arg1.field1927 = this.field1927;
        arg1.field1936 = this.field1936;
        arg1.field1951 = this.field1951;
        arg1.field1930 = this.field1930;
        arg1.field1976 = this.field1976;
        arg1.field1932 = this.field1932;
        arg1.field1934 = this.field1934;
        arg1.field1935 = this.field1935;
        arg1.field1929 = this.field1929;
        arg1.field1937 = this.field1937;
        arg1.field1938 = this.field1938;
        arg1.field1939 = this.field1939;
        arg1.method2425();
        return arg1;
    }

    @ObfuscatedName("eb.s(I)V")
    public void method2363(int arg0) {
        if (this.field1948 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1967[arg0];
        int var9 = field1977[arg0];
        for (int var10 = 0; var10 < this.field1950; var10++) {
            int var11 = class135.method2467(this.field1918[var10], this.field1920[var10], var8, var9);
            int var12 = this.field1926[var10];
            int var13 = class135.method2469(this.field1918[var10], this.field1920[var10], var8, var9);
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
        this.field1945 = (var2 + var5) / 2;
        this.field1964 = (var3 + var6) / 2;
        this.field1947 = (var4 + var7) / 2;
        this.field1948 = (var5 - var2 + 1) / 2;
        this.field1949 = (var6 - var3 + 1) / 2;
        this.field1925 = (var7 - var4 + 1) / 2;
        if (this.field1948 < 32) {
            this.field1948 = 32;
        }
        if (this.field1925 < 32) {
            this.field1925 = 32;
        }
        if (this.field1939) {
            this.field1948 += 8;
            this.field1925 += 8;
        }
    }

    @ObfuscatedName("eb.r()V")
    public void method2364() {
        if (this.field1940 == 1) {
            return;
        }
        this.field1940 = 1;
        this.field2115 = 0;
        this.field1941 = 0;
        this.field1931 = 0;
        for (int var1 = 0; var1 < this.field1950; var1++) {
            int var2 = this.field1918[var1];
            int var3 = this.field1926[var1];
            int var4 = this.field1920[var1];
            if (-var3 > this.field2115) {
                this.field2115 = -var3;
            }
            if (var3 > this.field1941) {
                this.field1941 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1931) {
                this.field1931 = var5;
            }
        }
        this.field1931 = (int) (Math.sqrt((double) this.field1931) + 0.99D);
        this.field1944 = (int) (Math.sqrt((double) (this.field2115 * this.field2115 + this.field1931 * this.field1931)) + 0.99D);
        this.field1943 = this.field1944 + (int) (Math.sqrt((double) (this.field1941 * this.field1941 + this.field1931 * this.field1931)) + 0.99D);
    }

    @ObfuscatedName("eb.g()V")
    public void method2367() {
        if (this.field1940 == 2) {
            return;
        }
        this.field1940 = 2;
        this.field1931 = 0;
        for (int var1 = 0; var1 < this.field1950; var1++) {
            int var2 = this.field1918[var1];
            int var3 = this.field1926[var1];
            int var4 = this.field1920[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1931) {
                this.field1931 = var5;
            }
        }
        this.field1931 = (int) (Math.sqrt((double) this.field1931) + 0.99D);
        this.field1944 = this.field1931;
        this.field1943 = this.field1931 + this.field1931;
    }

    @ObfuscatedName("eb.v()I")
    public int method2366() {
        this.method2364();
        return this.field1931;
    }

    @ObfuscatedName("eb.t()V")
    public void method2425() {
        this.field1940 = 0;
        this.field1948 = -1;
    }

    @ObfuscatedName("eb.y(Lei;I)V")
    public void method2409(class143 arg0, int arg1) {
        if (this.field1937 == null || arg1 == -1) {
            return;
        }
        class130 var3 = arg0.field2137[arg1];
        class137 var4 = var3.field1881;
        Statics.field1917 = 0;
        Statics.field1972 = 0;
        Statics.field1973 = 0;
        for (int var5 = 0; var5 < var3.field1882; var5++) {
            int var6 = var3.field1883[var5];
            this.method2370(var4.field2038[var6], var4.field2042[var6], var3.field1885[var5], var3.field1877[var5], var3.field1887[var5]);
        }
        this.method2425();
    }

    @ObfuscatedName("eb.x(Lei;ILei;I[I)V")
    public void method2417(class143 arg0, int arg1, class143 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2409(arg0, arg1);
            return;
        }
        class130 var6 = arg0.field2137[arg1];
        class130 var7 = arg2.field2137[arg3];
        class137 var8 = var6.field1881;
        Statics.field1917 = 0;
        Statics.field1972 = 0;
        Statics.field1973 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1882; var11++) {
            int var12 = var6.field1883[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field2038[var12] == 0) {
                this.method2370(var8.field2038[var12], var8.field2042[var12], var6.field1885[var11], var6.field1877[var11], var6.field1887[var11]);
            }
        }
        Statics.field1917 = 0;
        Statics.field1972 = 0;
        Statics.field1973 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1882; var15++) {
            int var16 = var7.field1883[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field2038[var16] == 0) {
                this.method2370(var8.field2038[var16], var8.field2042[var16], var7.field1885[var15], var7.field1877[var15], var7.field1887[var15]);
            }
        }
        this.method2425();
    }

    @ObfuscatedName("eb.c(I[IIII)V")
    public void method2370(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1917 = 0;
            Statics.field1972 = 0;
            Statics.field1973 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1937.length) {
                    int[] var10 = this.field1937[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1917 += this.field1918[var12];
                        Statics.field1972 += this.field1926[var12];
                        Statics.field1973 += this.field1920[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1917 = Statics.field1917 / var7 + arg2;
                Statics.field1972 = Statics.field1972 / var7 + arg3;
                Statics.field1973 = Statics.field1973 / var7 + arg4;
            } else {
                Statics.field1917 = arg2;
                Statics.field1972 = arg3;
                Statics.field1973 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1937.length) {
                    int[] var15 = this.field1937[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1918[var17] += arg2;
                        this.field1926[var17] += arg3;
                        this.field1920[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1937.length) {
                    int[] var20 = this.field1937[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1918[var22] -= Statics.field1917;
                        this.field1926[var22] -= Statics.field1972;
                        this.field1920[var22] -= Statics.field1973;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1977[var25];
                            int var27 = field1967[var25];
                            int var28 = this.field1926[var22] * var26 + this.field1918[var22] * var27 >> 16;
                            this.field1926[var22] = this.field1926[var22] * var27 - this.field1918[var22] * var26 >> 16;
                            this.field1918[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1977[var23];
                            int var30 = field1967[var23];
                            int var31 = this.field1926[var22] * var30 - this.field1920[var22] * var29 >> 16;
                            this.field1920[var22] = this.field1926[var22] * var29 + this.field1920[var22] * var30 >> 16;
                            this.field1926[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1977[var24];
                            int var33 = field1967[var24];
                            int var34 = this.field1920[var22] * var32 + this.field1918[var22] * var33 >> 16;
                            this.field1920[var22] = this.field1920[var22] * var33 - this.field1918[var22] * var32 >> 16;
                            this.field1918[var22] = var34;
                        }
                        this.field1918[var22] += Statics.field1917;
                        this.field1926[var22] += Statics.field1972;
                        this.field1920[var22] += Statics.field1973;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1937.length) {
                    int[] var37 = this.field1937[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1918[var39] -= Statics.field1917;
                        this.field1926[var39] -= Statics.field1972;
                        this.field1920[var39] -= Statics.field1973;
                        this.field1918[var39] = this.field1918[var39] * arg2 / 128;
                        this.field1926[var39] = this.field1926[var39] * arg3 / 128;
                        this.field1920[var39] = this.field1920[var39] * arg4 / 128;
                        this.field1918[var39] += Statics.field1917;
                        this.field1926[var39] += Statics.field1972;
                        this.field1920[var39] += Statics.field1973;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1938 != null && this.field1965 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1938.length) {
                    int[] var42 = this.field1938[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1965[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1965[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("eb.h()V")
    public void method2426() {
        for (int var1 = 0; var1 < this.field1950; var1++) {
            int var2 = this.field1918[var1];
            this.field1918[var1] = this.field1920[var1];
            this.field1920[var1] = -var2;
        }
        this.method2425();
    }

    @ObfuscatedName("eb.a()V")
    public void method2372() {
        for (int var1 = 0; var1 < this.field1950; var1++) {
            this.field1918[var1] = -this.field1918[var1];
            this.field1920[var1] = -this.field1920[var1];
        }
        this.method2425();
    }

    @ObfuscatedName("eb.w()V")
    public void method2373() {
        for (int var1 = 0; var1 < this.field1950; var1++) {
            int var2 = this.field1920[var1];
            this.field1920[var1] = this.field1918[var1];
            this.field1918[var1] = -var2;
        }
        this.method2425();
    }

    @ObfuscatedName("eb.n(I)V")
    public void method2403(int arg0) {
        int var2 = field1977[arg0];
        int var3 = field1967[arg0];
        for (int var4 = 0; var4 < this.field1950; var4++) {
            int var5 = this.field1926[var4] * var3 - this.field1920[var4] * var2 >> 16;
            this.field1920[var4] = this.field1926[var4] * var2 + this.field1920[var4] * var3 >> 16;
            this.field1926[var4] = var5;
        }
        this.method2425();
    }

    @ObfuscatedName("eb.m(III)V")
    public void method2435(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1950; var4++) {
            this.field1918[var4] += arg0;
            this.field1926[var4] += arg1;
            this.field1920[var4] += arg2;
        }
        this.method2425();
    }

    @ObfuscatedName("eb.ae(III)V")
    public void method2376(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1950; var4++) {
            this.field1918[var4] = this.field1918[var4] * arg0 / 128;
            this.field1926[var4] = this.field1926[var4] * arg1 / 128;
            this.field1920[var4] = this.field1920[var4] * arg2 / 128;
        }
        this.method2425();
    }

    @ObfuscatedName("eb.ai(IIIIIII)V")
    public final void method2377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1961[0] = -1;
        if (this.field1940 != 2 && this.field1940 != 1) {
            this.method2367();
        }
        int var8 = Statics.field2009;
        int var9 = Statics.field2018;
        int var10 = field1977[arg0];
        int var11 = field1967[arg0];
        int var12 = field1977[arg1];
        int var13 = field1967[arg1];
        int var14 = field1977[arg2];
        int var15 = field1967[arg2];
        int var16 = field1977[arg3];
        int var17 = field1967[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1950; var19++) {
            int var20 = this.field1918[var19];
            int var21 = this.field1926[var19];
            int var22 = this.field1920[var19];
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
            field1956[var19] = var30 - var18;
            field1954[var19] = class135.field2010 * var26 / var30 + var8;
            field1955[var19] = class135.field2010 * var29 / var30 + var9;
            if (this.field1942 > 0) {
                field1957[var19] = var26;
                field1958[var19] = var29;
                field1959[var19] = var30;
            }
        }
        try {
            this.method2380(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("eb.ah(IIIIIIII)V")
    public final void method2378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1961[0] = -1;
        if (this.field1940 != 2 && this.field1940 != 1) {
            this.method2367();
        }
        int var9 = Statics.field2009;
        int var10 = Statics.field2018;
        int var11 = field1977[arg0];
        int var12 = field1967[arg0];
        int var13 = field1977[arg1];
        int var14 = field1967[arg1];
        int var15 = field1977[arg2];
        int var16 = field1967[arg2];
        int var17 = field1977[arg3];
        int var18 = field1967[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1950; var20++) {
            int var21 = this.field1918[var20];
            int var22 = this.field1926[var20];
            int var23 = this.field1920[var20];
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
            field1956[var20] = var31 - var19;
            field1954[var20] = class135.field2010 * var27 / arg7 + var9;
            field1955[var20] = class135.field2010 * var30 / arg7 + var10;
            if (this.field1942 > 0) {
                field1957[var20] = var27;
                field1958[var20] = var30;
                field1959[var20] = var31;
            }
        }
        try {
            this.method2380(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("eb.cl(IIIIIIIII)V")
    public void method2379(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1961[0] = -1;
        if (this.field1940 != 1) {
            this.method2364();
        }
        this.method2363(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1931 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1931) * class135.field2010;
        if (var15 / var13 >= Statics.field2014) {
            return;
        }
        int var16 = (this.field1931 + var14) * class135.field2010;
        if (var16 / var13 <= Statics.field2013) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1931 * arg1 >> 16;
        int var19 = (var17 + var18) * class135.field2010;
        if (var19 / var13 <= Statics.field2015) {
            return;
        }
        int var20 = (this.field2115 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class135.field2010;
        if (var21 / var13 >= Statics.field2008) {
            return;
        }
        int var22 = (this.field2115 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1942 > 0;
        int var26 = class133.method78();
        int var27 = class133.method640();
        boolean var28 = class133.method712();
        if (class8.field244 && arg8 > 0) {
            if (class133.method2227(this, arg5, arg6, arg7)) {
                class8.method457(this, arg5, arg6, arg7, -65281);
            } else if (class8.field245 == class12.field271) {
                class8.method457(this, arg5, arg6, arg7, -16776961);
            }
        }
        if (class8.field243 && arg8 > 0) {
            int var30 = var11 - var12;
            if (var30 <= 50) {
                var30 = 50;
            }
            int var35;
            int var36;
            if (var14 > 0) {
                var35 = var15 / var13;
                var36 = var16 / var30;
            } else {
                var36 = var16 / var13;
                var35 = var15 / var30;
            }
            int var37;
            int var38;
            if (var17 > 0) {
                var37 = var21 / var13;
                var38 = var19 / var30;
            } else {
                var38 = var19 / var13;
                var37 = var21 / var30;
            }
            int var39 = -8355840;
            int var40 = var26 - Statics.field2009;
            int var41 = var27 - Statics.field2018;
            if (var40 > var35 && var40 < var36 && var41 > var37 && var41 < var38) {
                var39 = -256;
            }
            class8.method20(Statics.field2009 + var35, Statics.field2018 + var37, Statics.field2009 + var36, Statics.field2018 + var38, var39);
        }
        boolean var42 = false;
        if (arg8 > 0 && var28) {
            boolean var43 = false;
            if (field1974) {
                var43 = class133.method2227(this, arg5, arg6, arg7);
            } else {
                int var44 = var11 - var12;
                if (var44 <= 50) {
                    var44 = 50;
                }
                int var45;
                int var46;
                if (var14 > 0) {
                    var45 = var15 / var13;
                    var46 = var16 / var44;
                } else {
                    var46 = var16 / var13;
                    var45 = var15 / var44;
                }
                int var47;
                int var48;
                if (var17 > 0) {
                    var47 = var21 / var13;
                    var48 = var19 / var44;
                } else {
                    var48 = var19 / var13;
                    var47 = var21 / var44;
                }
                int var49 = var26 - Statics.field2009;
                int var50 = var27 - Statics.field2018;
                if (var49 > var45 && var49 < var46 && var50 > var47 && var50 < var48) {
                    var43 = true;
                }
            }
            if (var43) {
                if (this.field1939) {
                    class133.field1991[++class133.field1990 - 1] = arg8;
                } else {
                    var42 = true;
                }
            }
        }
        int var52 = Statics.field2009;
        int var53 = Statics.field2018;
        int var54 = 0;
        int var55 = 0;
        if (arg0 != 0) {
            var54 = field1977[arg0];
            var55 = field1967[arg0];
        }
        for (int var56 = 0; var56 < this.field1950; var56++) {
            int var57 = this.field1918[var56];
            int var58 = this.field1926[var56];
            int var59 = this.field1920[var56];
            if (arg0 != 0) {
                int var60 = var54 * var59 + var55 * var57 >> 16;
                var59 = var55 * var59 - var54 * var57 >> 16;
                var57 = var60;
            }
            int var61 = arg5 + var57;
            int var62 = arg6 + var58;
            int var63 = arg7 + var59;
            int var64 = arg3 * var63 + arg4 * var61 >> 16;
            int var65 = arg4 * var63 - arg3 * var61 >> 16;
            int var67 = arg2 * var62 - arg1 * var65 >> 16;
            int var68 = arg1 * var62 + arg2 * var65 >> 16;
            field1956[var56] = var68 - var11;
            if (var68 >= 50) {
                field1954[var56] = class135.field2010 * var64 / var68 + var52;
                field1955[var56] = class135.field2010 * var67 / var68 + var53;
            } else {
                field1954[var56] = -5000;
                var23 = true;
            }
            if (var25) {
                field1957[var56] = var64;
                field1958[var56] = var67;
                field1959[var56] = var68;
            }
        }
        try {
            this.method2380(var23, var42, this.field1939, arg8);
        } catch (Exception var71) {
        }
    }

    @ObfuscatedName("eb.ab(ZZZI)V")
    public final void method2380(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1943 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1943; var5++) {
            field1961[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field246 && arg1) {
            class8.method4457(this, var6);
        }
        for (int var7 = 0; var7 < this.field1962; var7++) {
            if (this.field1936[var7] != -2) {
                int var8 = this.field1922[var7];
                int var9 = this.field1923[var7];
                int var10 = this.field1924[var7];
                int var11 = field1954[var8];
                int var12 = field1954[var9];
                int var13 = field1954[var10];
                if (arg0 && var11 == -5000 || var12 == -5000 || var13 == -5000) {
                    int var14 = field1957[var8];
                    int var15 = field1957[var9];
                    int var16 = field1957[var10];
                    int var17 = field1958[var8];
                    int var18 = field1958[var9];
                    int var19 = field1958[var10];
                    int var20 = field1959[var8];
                    int var21 = field1959[var9];
                    int var22 = field1959[var10];
                    int var23 = var14 - var15;
                    int var24 = var16 - var15;
                    int var25 = var17 - var18;
                    int var26 = var19 - var18;
                    int var27 = var20 - var21;
                    int var28 = var22 - var21;
                    int var29 = var25 * var28 - var26 * var27;
                    int var30 = var24 * var27 - var23 * var28;
                    int var31 = var23 * var26 - var24 * var25;
                    if (var21 * var31 + var15 * var29 + var18 * var30 > 0) {
                        field1919[var7] = true;
                        int var32 = (field1956[var8] + field1956[var9] + field1956[var10]) / 3 + this.field1944;
                        field1921[var32][field1961[var32]++] = var7;
                    }
                } else {
                    if (arg1) {
                        int var33 = field1955[var8];
                        int var34 = field1955[var9];
                        int var35 = field1955[var10];
                        int var36 = class133.field1985 + var6;
                        boolean var37;
                        if (var36 < var33 && var36 < var34 && var36 < var35) {
                            var37 = false;
                        } else {
                            int var38 = class133.field1985 - var6;
                            if (var38 > var33 && var38 > var34 && var38 > var35) {
                                var37 = false;
                            } else {
                                int var39 = class133.field1986 + var6;
                                if (var39 < var11 && var39 < var12 && var39 < var13) {
                                    var37 = false;
                                } else {
                                    int var40 = class133.field1986 - var6;
                                    if (var40 > var11 && var40 > var12 && var40 > var13) {
                                        var37 = false;
                                    } else {
                                        var37 = true;
                                    }
                                }
                            }
                        }
                        if (var37) {
                            class133.field1991[++class133.field1990 - 1] = arg3;
                            arg1 = false;
                        }
                    }
                    if ((field1955[var10] - field1955[var9]) * (var11 - var12) - (field1955[var8] - field1955[var9]) * (var13 - var12) > 0) {
                        field1919[var7] = false;
                        if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= Statics.field2011 && var12 <= Statics.field2011 && var13 <= Statics.field2011) {
                            field1952[var7] = false;
                        } else {
                            field1952[var7] = true;
                        }
                        int var42 = (field1956[var8] + field1956[var9] + field1956[var10]) / 3 + this.field1944;
                        field1921[var42][field1961[var42]++] = var7;
                    }
                }
            }
        }
        if (this.field1951 == null) {
            for (int var43 = this.field1943 - 1; var43 >= 0; var43--) {
                int var44 = field1961[var43];
                if (var44 > 0) {
                    int[] var45 = field1921[var43];
                    for (int var46 = 0; var46 < var44; var46++) {
                        this.method2381(var45[var46]);
                    }
                }
            }
            return;
        }
        for (int var47 = 0; var47 < 12; var47++) {
            field1963[var47] = 0;
            field1953[var47] = 0;
        }
        for (int var48 = this.field1943 - 1; var48 >= 0; var48--) {
            int var49 = field1961[var48];
            if (var49 > 0) {
                int[] var50 = field1921[var48];
                for (int var51 = 0; var51 < var49; var51++) {
                    int var52 = var50[var51];
                    byte var53 = this.field1951[var52];
                    int var54 = field1963[var53]++;
                    field1978[var53][var54] = var52;
                    if (var53 < 10) {
                        field1953[var53] += var48;
                    } else if (var53 == 10) {
                        field1966[var54] = var48;
                    } else {
                        field1914[var54] = var48;
                    }
                }
            }
        }
        int var55 = 0;
        if (field1963[1] > 0 || field1963[2] > 0) {
            var55 = (field1953[1] + field1953[2]) / (field1963[1] + field1963[2]);
        }
        int var56 = 0;
        if (field1963[3] > 0 || field1963[4] > 0) {
            var56 = (field1953[3] + field1953[4]) / (field1963[3] + field1963[4]);
        }
        int var57 = 0;
        if (field1963[6] > 0 || field1963[8] > 0) {
            var57 = (field1953[6] + field1953[8]) / (field1963[6] + field1963[8]);
        }
        int var58 = 0;
        int var59 = field1963[10];
        int[] var60 = field1978[10];
        int[] var61 = field1966;
        if (var58 == var59) {
            var58 = 0;
            var59 = field1963[11];
            var60 = field1978[11];
            var61 = field1914;
        }
        int var62;
        if (var58 < var59) {
            var62 = var61[var58];
        } else {
            var62 = -1000;
        }
        for (int var63 = 0; var63 < 10; var63++) {
            while (var63 == 0 && var62 > var55) {
                this.method2381(var60[var58++]);
                if (var58 == var59 && field1978[11] != var60) {
                    var58 = 0;
                    var59 = field1963[11];
                    var60 = field1978[11];
                    var61 = field1914;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            while (var63 == 3 && var62 > var56) {
                this.method2381(var60[var58++]);
                if (var58 == var59 && field1978[11] != var60) {
                    var58 = 0;
                    var59 = field1963[11];
                    var60 = field1978[11];
                    var61 = field1914;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            while (var63 == 5 && var62 > var57) {
                this.method2381(var60[var58++]);
                if (var58 == var59 && field1978[11] != var60) {
                    var58 = 0;
                    var59 = field1963[11];
                    var60 = field1978[11];
                    var61 = field1914;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            int var64 = field1963[var63];
            int[] var65 = field1978[var63];
            for (int var66 = 0; var66 < var64; var66++) {
                this.method2381(var65[var66]);
            }
        }
        while (var62 != -1000) {
            this.method2381(var60[var58++]);
            if (var58 == var59 && field1978[11] != var60) {
                var58 = 0;
                var60 = field1978[11];
                var59 = field1963[11];
                var61 = field1914;
            }
            if (var58 < var59) {
                var62 = var61[var58];
            } else {
                var62 = -1000;
            }
        }
    }

    @ObfuscatedName("eb.ad(I)V")
    public final void method2381(int arg0) {
        if (field1919[arg0]) {
            this.method2382(arg0);
            return;
        }
        int var2 = this.field1922[arg0];
        int var3 = this.field1923[arg0];
        int var4 = this.field1924[arg0];
        class135.field2001 = field1952[arg0];
        if (this.field1965 == null) {
            class135.field2022 = 0;
        } else {
            class135.field2022 = this.field1965[arg0] & 0xFF;
        }
        if (this.field1976 != null && this.field1976[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1930 == null || this.field1930[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1930[arg0] & 0xFF;
                var6 = this.field1934[var5];
                var7 = this.field1935[var5];
                var8 = this.field1929[var5];
            }
            if (this.field1936[arg0] == -1) {
                class135.method2518(field1955[var2], field1955[var3], field1955[var4], field1954[var2], field1954[var3], field1954[var4], this.field1979[arg0], this.field1979[arg0], this.field1979[arg0], field1957[var6], field1957[var7], field1957[var8], field1958[var6], field1958[var7], field1958[var8], field1959[var6], field1959[var7], field1959[var8], this.field1976[arg0]);
            } else {
                class135.method2518(field1955[var2], field1955[var3], field1955[var4], field1954[var2], field1954[var3], field1954[var4], this.field1979[arg0], this.field1927[arg0], this.field1936[arg0], field1957[var6], field1957[var7], field1957[var8], field1958[var6], field1958[var7], field1958[var8], field1959[var6], field1959[var7], field1959[var8], this.field1976[arg0]);
            }
        } else if (this.field1936[arg0] == -1) {
            class135.method2460(field1955[var2], field1955[var3], field1955[var4], field1954[var2], field1954[var3], field1954[var4], field1913[this.field1979[arg0]]);
        } else {
            class135.method2517(field1955[var2], field1955[var3], field1955[var4], field1954[var2], field1954[var3], field1954[var4], this.field1979[arg0], this.field1927[arg0], this.field1936[arg0]);
        }
    }

    @ObfuscatedName("eb.ag(I)V")
    public final void method2382(int arg0) {
        int var2 = Statics.field2009;
        int var3 = Statics.field2018;
        int var4 = 0;
        int var5 = this.field1922[arg0];
        int var6 = this.field1923[arg0];
        int var7 = this.field1924[arg0];
        int var8 = field1959[var5];
        int var9 = field1959[var6];
        int var10 = field1959[var7];
        if (this.field1965 == null) {
            class135.field2022 = 0;
        } else {
            class135.field2022 = this.field1965[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1968[var4] = field1954[var5];
            field1969[var4] = field1955[var5];
            field1970[var4++] = this.field1979[arg0];
        } else {
            int var11 = field1957[var5];
            int var12 = field1958[var5];
            int var13 = this.field1979[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1971[var10 - var8];
                field1968[var4] = (((field1957[var7] - var11) * var14 >> 16) + var11) * class135.field2010 / 50 + var2;
                field1969[var4] = (((field1958[var7] - var12) * var14 >> 16) + var12) * class135.field2010 / 50 + var3;
                field1970[var4++] = ((this.field1936[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1971[var9 - var8];
                field1968[var4] = (((field1957[var6] - var11) * var15 >> 16) + var11) * class135.field2010 / 50 + var2;
                field1969[var4] = (((field1958[var6] - var12) * var15 >> 16) + var12) * class135.field2010 / 50 + var3;
                field1970[var4++] = ((this.field1927[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1968[var4] = field1954[var6];
            field1969[var4] = field1955[var6];
            field1970[var4++] = this.field1927[arg0];
        } else {
            int var16 = field1957[var6];
            int var17 = field1958[var6];
            int var18 = this.field1927[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1971[var8 - var9];
                field1968[var4] = (((field1957[var5] - var16) * var19 >> 16) + var16) * class135.field2010 / 50 + var2;
                field1969[var4] = (((field1958[var5] - var17) * var19 >> 16) + var17) * class135.field2010 / 50 + var3;
                field1970[var4++] = ((this.field1979[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1971[var10 - var9];
                field1968[var4] = (((field1957[var7] - var16) * var20 >> 16) + var16) * class135.field2010 / 50 + var2;
                field1969[var4] = (((field1958[var7] - var17) * var20 >> 16) + var17) * class135.field2010 / 50 + var3;
                field1970[var4++] = ((this.field1936[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1968[var4] = field1954[var7];
            field1969[var4] = field1955[var7];
            field1970[var4++] = this.field1936[arg0];
        } else {
            int var21 = field1957[var7];
            int var22 = field1958[var7];
            int var23 = this.field1936[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1971[var9 - var10];
                field1968[var4] = (((field1957[var6] - var21) * var24 >> 16) + var21) * class135.field2010 / 50 + var2;
                field1969[var4] = (((field1958[var6] - var22) * var24 >> 16) + var22) * class135.field2010 / 50 + var3;
                field1970[var4++] = ((this.field1927[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1971[var8 - var10];
                field1968[var4] = (((field1957[var5] - var21) * var25 >> 16) + var21) * class135.field2010 / 50 + var2;
                field1969[var4] = (((field1958[var5] - var22) * var25 >> 16) + var22) * class135.field2010 / 50 + var3;
                field1970[var4++] = ((this.field1979[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1968[0];
        int var27 = field1968[1];
        int var28 = field1968[2];
        int var29 = field1969[0];
        int var30 = field1969[1];
        int var31 = field1969[2];
        class135.field2001 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2011 || var27 > Statics.field2011 || var28 > Statics.field2011) {
                class135.field2001 = true;
            }
            if (this.field1976 != null && this.field1976[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1930 == null || this.field1930[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1930[arg0] & 0xFF;
                    var33 = this.field1934[var32];
                    var34 = this.field1935[var32];
                    var35 = this.field1929[var32];
                }
                if (this.field1936[arg0] == -1) {
                    class135.method2518(var29, var30, var31, var26, var27, var28, this.field1979[arg0], this.field1979[arg0], this.field1979[arg0], field1957[var33], field1957[var34], field1957[var35], field1958[var33], field1958[var34], field1958[var35], field1959[var33], field1959[var34], field1959[var35], this.field1976[arg0]);
                } else {
                    class135.method2518(var29, var30, var31, var26, var27, var28, field1970[0], field1970[1], field1970[2], field1957[var33], field1957[var34], field1957[var35], field1958[var33], field1958[var34], field1958[var35], field1959[var33], field1959[var34], field1959[var35], this.field1976[arg0]);
                }
            } else if (this.field1936[arg0] == -1) {
                class135.method2460(var29, var30, var31, var26, var27, var28, field1913[this.field1979[arg0]]);
            } else {
                class135.method2517(var29, var30, var31, var26, var27, var28, field1970[0], field1970[1], field1970[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2011 || var27 > Statics.field2011 || var28 > Statics.field2011 || field1968[3] < 0 || field1968[3] > Statics.field2011) {
            class135.field2001 = true;
        }
        if (this.field1976 != null && this.field1976[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1930 == null || this.field1930[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1930[arg0] & 0xFF;
                var37 = this.field1934[var36];
                var38 = this.field1935[var36];
                var39 = this.field1929[var36];
            }
            short var40 = this.field1976[arg0];
            if (this.field1936[arg0] == -1) {
                class135.method2518(var29, var30, var31, var26, var27, var28, this.field1979[arg0], this.field1979[arg0], this.field1979[arg0], field1957[var37], field1957[var38], field1957[var39], field1958[var37], field1958[var38], field1958[var39], field1959[var37], field1959[var38], field1959[var39], var40);
                class135.method2518(var29, var31, field1969[3], var26, var28, field1968[3], this.field1979[arg0], this.field1979[arg0], this.field1979[arg0], field1957[var37], field1957[var38], field1957[var39], field1958[var37], field1958[var38], field1958[var39], field1959[var37], field1959[var38], field1959[var39], var40);
            } else {
                class135.method2518(var29, var30, var31, var26, var27, var28, field1970[0], field1970[1], field1970[2], field1957[var37], field1957[var38], field1957[var39], field1958[var37], field1958[var38], field1958[var39], field1959[var37], field1959[var38], field1959[var39], var40);
                class135.method2518(var29, var31, field1969[3], var26, var28, field1968[3], field1970[0], field1970[2], field1970[3], field1957[var37], field1957[var38], field1957[var39], field1958[var37], field1958[var38], field1958[var39], field1959[var37], field1959[var38], field1959[var39], var40);
            }
        } else if (this.field1936[arg0] == -1) {
            int var41 = field1913[this.field1979[arg0]];
            class135.method2460(var29, var30, var31, var26, var27, var28, var41);
            class135.method2460(var29, var31, field1969[3], var26, var28, field1968[3], var41);
        } else {
            class135.method2517(var29, var30, var31, var26, var27, var28, field1970[0], field1970[1], field1970[2]);
            class135.method2517(var29, var31, field1969[3], var26, var28, field1968[3], field1970[0], field1970[2], field1970[3]);
        }
    }
}
