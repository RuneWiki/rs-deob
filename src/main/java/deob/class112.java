package deob;

@ObfuscatedName("dk")
public class class112 extends class94 {

    @ObfuscatedName("dk.t")
    public static class112 field1941 = new class112();

    @ObfuscatedName("dk.l")
    public static byte[] field1879 = new byte[1];

    @ObfuscatedName("dk.c")
    public static class112 field1904 = new class112();

    @ObfuscatedName("dk.d")
    public static byte[] field1881 = new byte[1];

    @ObfuscatedName("dk.b")
    public int field1924 = 0;

    @ObfuscatedName("dk.i")
    public int[] field1942;

    @ObfuscatedName("dk.p")
    public int[] field1884;

    @ObfuscatedName("dk.y")
    public int[] field1895;

    @ObfuscatedName("dk.u")
    public int field1886 = 0;

    @ObfuscatedName("dk.z")
    public int[] field1907;

    @ObfuscatedName("dk.j")
    public int[] field1888;

    @ObfuscatedName("dk.h")
    public int[] field1889;

    @ObfuscatedName("dk.x")
    public int[] field1890;

    @ObfuscatedName("dk.q")
    public int[] field1929;

    @ObfuscatedName("dk.w")
    public int[] field1892;

    @ObfuscatedName("dk.k")
    public byte[] field1893;

    @ObfuscatedName("dk.o")
    public byte[] field1894;

    @ObfuscatedName("dk.f")
    public byte[] field1938;

    @ObfuscatedName("dk.r")
    public short[] field1896;

    @ObfuscatedName("dk.s")
    public byte field1922 = 0;

    @ObfuscatedName("dk.g")
    public int field1898 = 0;

    @ObfuscatedName("dk.m")
    public int[] field1899;

    @ObfuscatedName("dk.a")
    public int[] field1900;

    @ObfuscatedName("dk.n")
    public int[] field1901;

    @ObfuscatedName("dk.v")
    public int[][] field1913;

    @ObfuscatedName("dk.e")
    public int[][] field1902;

    @ObfuscatedName("dk.ar")
    public boolean field1878 = false;

    @ObfuscatedName("dk.ak")
    public int field1905;

    @ObfuscatedName("dk.ap")
    public int field1935;

    @ObfuscatedName("dk.aa")
    public int field1932;

    @ObfuscatedName("dk.av")
    public int field1908;

    @ObfuscatedName("dk.aq")
    public int field1909;

    @ObfuscatedName("dk.al")
    public static boolean[] field1883 = new boolean[4096];

    @ObfuscatedName("dk.ax")
    public static boolean[] field1912 = new boolean[4096];

    @ObfuscatedName("dk.as")
    public static int[] field1928 = new int[4096];

    @ObfuscatedName("dk.ah")
    public static int[] field1914 = new int[4096];

    @ObfuscatedName("dk.ae")
    public static int[] field1915 = new int[4096];

    @ObfuscatedName("dk.ac")
    public static int[] field1916 = new int[4096];

    @ObfuscatedName("dk.af")
    public static int[] field1917 = new int[4096];

    @ObfuscatedName("dk.aj")
    public static int[] field1918 = new int[4096];

    @ObfuscatedName("dk.au")
    public static int[] field1920 = new int[1600];

    @ObfuscatedName("dk.at")
    public static int[][] field1921 = new int[1600][512];

    @ObfuscatedName("dk.az")
    public static int[] field1911 = new int[12];

    @ObfuscatedName("dk.ag")
    public static int[][] field1923 = new int[12][2000];

    @ObfuscatedName("dk.am")
    public static int[] field1880 = new int[2000];

    @ObfuscatedName("dk.ai")
    public static int[] field1925 = new int[2000];

    @ObfuscatedName("dk.ab")
    public static int[] field1926 = new int[12];

    @ObfuscatedName("dk.ay")
    public static int[] field1927 = new int[10];

    @ObfuscatedName("dk.aw")
    public static int[] field1897 = new int[10];

    @ObfuscatedName("dk.ad")
    public static int[] field1931 = new int[10];

    @ObfuscatedName("dk.bk")
    public static boolean field1933 = false;

    @ObfuscatedName("dk.bl")
    public static int field1934 = 0;

    @ObfuscatedName("dk.bi")
    public static int field1910 = 0;

    @ObfuscatedName("dk.br")
    public static int field1936 = 0;

    @ObfuscatedName("dk.bb")
    public static int[] field1882 = new int[1000];

    @ObfuscatedName("dk.bm")
    public static int[] field1885 = class104.field1814;

    @ObfuscatedName("dk.bw")
    public static int[] field1939 = class104.field1815;

    @ObfuscatedName("dk.bc")
    public static int[] field1940 = class104.field1810;

    @ObfuscatedName("dk.bo")
    public static int[] field1891 = class104.field1797;

    public class112() {
    }

    public class112(class112[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1924 = 0;
        this.field1886 = 0;
        this.field1898 = 0;
        this.field1922 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class112 var8 = arg0[var7];
            if (var8 != null) {
                this.field1924 += var8.field1924;
                this.field1886 += var8.field1886;
                this.field1898 += var8.field1898;
                if (var8.field1893 == null) {
                    if (this.field1922 == -1) {
                        this.field1922 = var8.field1922;
                    }
                    if (this.field1922 != var8.field1922) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1894 != null;
                var5 |= var8.field1896 != null;
                var6 |= var8.field1938 != null;
            }
        }
        this.field1942 = new int[this.field1924];
        this.field1884 = new int[this.field1924];
        this.field1895 = new int[this.field1924];
        this.field1907 = new int[this.field1886];
        this.field1888 = new int[this.field1886];
        this.field1889 = new int[this.field1886];
        this.field1890 = new int[this.field1886];
        this.field1929 = new int[this.field1886];
        this.field1892 = new int[this.field1886];
        if (var3) {
            this.field1893 = new byte[this.field1886];
        }
        if (var4) {
            this.field1894 = new byte[this.field1886];
        }
        if (var5) {
            this.field1896 = new short[this.field1886];
        }
        if (var6) {
            this.field1938 = new byte[this.field1886];
        }
        if (this.field1898 > 0) {
            this.field1899 = new int[this.field1898];
            this.field1900 = new int[this.field1898];
            this.field1901 = new int[this.field1898];
        }
        this.field1924 = 0;
        this.field1886 = 0;
        this.field1898 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class112 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1886; var11++) {
                    this.field1907[this.field1886] = var10.field1907[var11] + this.field1924;
                    this.field1888[this.field1886] = var10.field1888[var11] + this.field1924;
                    this.field1889[this.field1886] = var10.field1889[var11] + this.field1924;
                    this.field1890[this.field1886] = var10.field1890[var11];
                    this.field1929[this.field1886] = var10.field1929[var11];
                    this.field1892[this.field1886] = var10.field1892[var11];
                    if (var3) {
                        if (var10.field1893 == null) {
                            this.field1893[this.field1886] = var10.field1922;
                        } else {
                            this.field1893[this.field1886] = var10.field1893[var11];
                        }
                    }
                    if (var4 && var10.field1894 != null) {
                        this.field1894[this.field1886] = var10.field1894[var11];
                    }
                    if (var5) {
                        if (var10.field1896 == null) {
                            this.field1896[this.field1886] = -1;
                        } else {
                            this.field1896[this.field1886] = var10.field1896[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1938 == null || var10.field1938[var11] == -1) {
                            this.field1938[this.field1886] = -1;
                        } else {
                            this.field1938[this.field1886] = (byte) (var10.field1938[var11] + this.field1898);
                        }
                    }
                    this.field1886++;
                }
                for (int var12 = 0; var12 < var10.field1898; var12++) {
                    this.field1899[this.field1898] = var10.field1899[var12] + this.field1924;
                    this.field1900[this.field1898] = var10.field1900[var12] + this.field1924;
                    this.field1901[this.field1898] = var10.field1901[var12] + this.field1924;
                    this.field1898++;
                }
                for (int var13 = 0; var13 < var10.field1924; var13++) {
                    this.field1942[this.field1924] = var10.field1942[var13];
                    this.field1884[this.field1924] = var10.field1884[var13];
                    this.field1895[this.field1924] = var10.field1895[var13];
                    this.field1924++;
                }
            }
        }
    }

    @ObfuscatedName("dk.t([[IIIIZI)Ldk;")
    public class112 method2234(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2238();
        int var7 = arg1 - this.field1932;
        int var8 = this.field1932 + arg1;
        int var9 = arg3 - this.field1932;
        int var10 = this.field1932 + arg3;
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
        class112 var15;
        if (arg4) {
            var15 = new class112();
            var15.field1924 = this.field1924;
            var15.field1886 = this.field1886;
            var15.field1898 = this.field1898;
            var15.field1942 = this.field1942;
            var15.field1895 = this.field1895;
            var15.field1907 = this.field1907;
            var15.field1888 = this.field1888;
            var15.field1889 = this.field1889;
            var15.field1890 = this.field1890;
            var15.field1929 = this.field1929;
            var15.field1892 = this.field1892;
            var15.field1893 = this.field1893;
            var15.field1894 = this.field1894;
            var15.field1938 = this.field1938;
            var15.field1896 = this.field1896;
            var15.field1922 = this.field1922;
            var15.field1899 = this.field1899;
            var15.field1900 = this.field1900;
            var15.field1901 = this.field1901;
            var15.field1913 = this.field1913;
            var15.field1902 = this.field1902;
            var15.field1878 = this.field1878;
            var15.field1884 = new int[var15.field1924];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1924; var16++) {
                int var17 = this.field1942[var16] + arg1;
                int var18 = this.field1895[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1884[var16] = this.field1884[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1924; var26++) {
                int var27 = (-this.field1884[var26] << 16) / this.field1588;
                if (var27 < arg5) {
                    int var28 = this.field1942[var26] + arg1;
                    int var29 = this.field1895[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1884[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1884[var26];
                }
            }
        }
        var15.field1905 = 0;
        return var15;
    }

    @ObfuscatedName("dk.c(Z)Ldk;")
    public class112 method2235(boolean arg0) {
        if (!arg0 && field1879.length < this.field1886) {
            field1879 = new byte[this.field1886 + 100];
        }
        return this.method2237(arg0, field1941, field1879);
    }

    @ObfuscatedName("dk.d(Z)Ldk;")
    public class112 method2236(boolean arg0) {
        if (!arg0 && field1881.length < this.field1886) {
            field1881 = new byte[this.field1886 + 100];
        }
        return this.method2237(arg0, field1904, field1881);
    }

    @ObfuscatedName("dk.b(ZLdk;[B)Ldk;")
    public class112 method2237(boolean arg0, class112 arg1, byte[] arg2) {
        arg1.field1924 = this.field1924;
        arg1.field1886 = this.field1886;
        arg1.field1898 = this.field1898;
        if (arg1.field1942 == null || arg1.field1942.length < this.field1924) {
            arg1.field1942 = new int[this.field1924 + 100];
            arg1.field1884 = new int[this.field1924 + 100];
            arg1.field1895 = new int[this.field1924 + 100];
        }
        for (int var4 = 0; var4 < this.field1924; var4++) {
            arg1.field1942[var4] = this.field1942[var4];
            arg1.field1884[var4] = this.field1884[var4];
            arg1.field1895[var4] = this.field1895[var4];
        }
        if (arg0) {
            arg1.field1894 = this.field1894;
        } else {
            arg1.field1894 = arg2;
            if (this.field1894 == null) {
                for (int var5 = 0; var5 < this.field1886; var5++) {
                    arg1.field1894[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1886; var6++) {
                    arg1.field1894[var6] = this.field1894[var6];
                }
            }
        }
        arg1.field1907 = this.field1907;
        arg1.field1888 = this.field1888;
        arg1.field1889 = this.field1889;
        arg1.field1890 = this.field1890;
        arg1.field1929 = this.field1929;
        arg1.field1892 = this.field1892;
        arg1.field1893 = this.field1893;
        arg1.field1938 = this.field1938;
        arg1.field1896 = this.field1896;
        arg1.field1922 = this.field1922;
        arg1.field1899 = this.field1899;
        arg1.field1900 = this.field1900;
        arg1.field1901 = this.field1901;
        arg1.field1913 = this.field1913;
        arg1.field1902 = this.field1902;
        arg1.field1878 = this.field1878;
        arg1.field1905 = 0;
        return arg1;
    }

    @ObfuscatedName("dk.i()V")
    public void method2238() {
        if (this.field1905 == 1) {
            return;
        }
        this.field1905 = 1;
        this.field1588 = 0;
        this.field1935 = 0;
        this.field1932 = 0;
        for (int var1 = 0; var1 < this.field1924; var1++) {
            int var2 = this.field1942[var1];
            int var3 = this.field1884[var1];
            int var4 = this.field1895[var1];
            if (-var3 > this.field1588) {
                this.field1588 = -var3;
            }
            if (var3 > this.field1935) {
                this.field1935 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1932) {
                this.field1932 = var5;
            }
        }
        this.field1932 = (int) (Math.sqrt((double) this.field1932) + 0.99D);
        this.field1909 = (int) (Math.sqrt((double) (this.field1588 * this.field1588 + this.field1932 * this.field1932)) + 0.99D);
        this.field1908 = this.field1909 + (int) (Math.sqrt((double) (this.field1935 * this.field1935 + this.field1932 * this.field1932)) + 0.99D);
    }

    @ObfuscatedName("dk.p()V")
    public void method2239() {
        if (this.field1905 == 2) {
            return;
        }
        this.field1905 = 2;
        this.field1932 = 0;
        for (int var1 = 0; var1 < this.field1924; var1++) {
            int var2 = this.field1942[var1];
            int var3 = this.field1884[var1];
            int var4 = this.field1895[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1932) {
                this.field1932 = var5;
            }
        }
        this.field1932 = (int) (Math.sqrt((double) this.field1932) + 0.99D);
        this.field1909 = this.field1932;
        this.field1908 = this.field1932 + this.field1932;
    }

    @ObfuscatedName("dk.y()I")
    public int method2244() {
        this.method2238();
        return this.field1932;
    }

    @ObfuscatedName("dk.j(Ldw;I)V")
    public void method2241(class109 arg0, int arg1) {
        if (this.field1913 == null || arg1 == -1) {
            return;
        }
        class97 var3 = arg0.field1848[arg1];
        class105 var4 = var3.field1664;
        Statics.field1930 = 0;
        Statics.field1937 = 0;
        Statics.field1906 = 0;
        for (int var5 = 0; var5 < var3.field1668; var5++) {
            int var6 = var3.field1669[var5];
            this.method2256(var4.field1819[var6], var4.field1816[var6], var3.field1671[var5], var3.field1663[var5], var3.field1672[var5]);
        }
        this.field1905 = 0;
    }

    @ObfuscatedName("dk.h(Ldw;ILdw;I[I)V")
    public void method2242(class109 arg0, int arg1, class109 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2241(arg0, arg1);
            return;
        }
        class97 var6 = arg0.field1848[arg1];
        class97 var7 = arg2.field1848[arg3];
        class105 var8 = var6.field1664;
        Statics.field1930 = 0;
        Statics.field1937 = 0;
        Statics.field1906 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1668; var11++) {
            int var12 = var6.field1669[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1819[var12] == 0) {
                this.method2256(var8.field1819[var12], var8.field1816[var12], var6.field1671[var11], var6.field1663[var11], var6.field1672[var11]);
            }
        }
        Statics.field1930 = 0;
        Statics.field1937 = 0;
        Statics.field1906 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1668; var15++) {
            int var16 = var7.field1669[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1819[var16] == 0) {
                this.method2256(var8.field1819[var16], var8.field1816[var16], var7.field1671[var15], var7.field1663[var15], var7.field1672[var15]);
            }
        }
        this.field1905 = 0;
    }

    @ObfuscatedName("dk.x(I[IIII)V")
    public void method2256(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1930 = 0;
            Statics.field1937 = 0;
            Statics.field1906 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1913.length) {
                    int[] var10 = this.field1913[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1930 += this.field1942[var12];
                        Statics.field1937 += this.field1884[var12];
                        Statics.field1906 += this.field1895[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1930 = Statics.field1930 / var7 + arg2;
                Statics.field1937 = Statics.field1937 / var7 + arg3;
                Statics.field1906 = Statics.field1906 / var7 + arg4;
            } else {
                Statics.field1930 = arg2;
                Statics.field1937 = arg3;
                Statics.field1906 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1913.length) {
                    int[] var15 = this.field1913[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1942[var17] += arg2;
                        this.field1884[var17] += arg3;
                        this.field1895[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1913.length) {
                    int[] var20 = this.field1913[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1942[var22] -= Statics.field1930;
                        this.field1884[var22] -= Statics.field1937;
                        this.field1895[var22] -= Statics.field1906;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1885[var25];
                            int var27 = field1939[var25];
                            int var28 = this.field1942[var22] * var27 + this.field1884[var22] * var26 >> 16;
                            this.field1884[var22] = this.field1884[var22] * var27 - this.field1942[var22] * var26 >> 16;
                            this.field1942[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1885[var23];
                            int var30 = field1939[var23];
                            int var31 = this.field1884[var22] * var30 - this.field1895[var22] * var29 >> 16;
                            this.field1895[var22] = this.field1895[var22] * var30 + this.field1884[var22] * var29 >> 16;
                            this.field1884[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1885[var24];
                            int var33 = field1939[var24];
                            int var34 = this.field1942[var22] * var33 + this.field1895[var22] * var32 >> 16;
                            this.field1895[var22] = this.field1895[var22] * var33 - this.field1942[var22] * var32 >> 16;
                            this.field1942[var22] = var34;
                        }
                        this.field1942[var22] += Statics.field1930;
                        this.field1884[var22] += Statics.field1937;
                        this.field1895[var22] += Statics.field1906;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1913.length) {
                    int[] var37 = this.field1913[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1942[var39] -= Statics.field1930;
                        this.field1884[var39] -= Statics.field1937;
                        this.field1895[var39] -= Statics.field1906;
                        this.field1942[var39] = this.field1942[var39] * arg2 / 128;
                        this.field1884[var39] = this.field1884[var39] * arg3 / 128;
                        this.field1895[var39] = this.field1895[var39] * arg4 / 128;
                        this.field1942[var39] += Statics.field1930;
                        this.field1884[var39] += Statics.field1937;
                        this.field1895[var39] += Statics.field1906;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1902 != null && this.field1894 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1902.length) {
                    int[] var42 = this.field1902[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1894[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1894[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dk.q()V")
    public void method2295() {
        for (int var1 = 0; var1 < this.field1924; var1++) {
            int var2 = this.field1942[var1];
            this.field1942[var1] = this.field1895[var1];
            this.field1895[var1] = -var2;
        }
        this.field1905 = 0;
    }

    @ObfuscatedName("dk.w()V")
    public void method2245() {
        for (int var1 = 0; var1 < this.field1924; var1++) {
            this.field1942[var1] = -this.field1942[var1];
            this.field1895[var1] = -this.field1895[var1];
        }
        this.field1905 = 0;
    }

    @ObfuscatedName("dk.k()V")
    public void method2296() {
        for (int var1 = 0; var1 < this.field1924; var1++) {
            int var2 = this.field1895[var1];
            this.field1895[var1] = this.field1942[var1];
            this.field1942[var1] = -var2;
        }
        this.field1905 = 0;
    }

    @ObfuscatedName("dk.o(I)V")
    public void method2247(int arg0) {
        int var2 = field1885[arg0];
        int var3 = field1939[arg0];
        for (int var4 = 0; var4 < this.field1924; var4++) {
            int var5 = this.field1884[var4] * var3 - this.field1895[var4] * var2 >> 16;
            this.field1895[var4] = this.field1895[var4] * var3 + this.field1884[var4] * var2 >> 16;
            this.field1884[var4] = var5;
        }
        this.field1905 = 0;
    }

    @ObfuscatedName("dk.f(III)V")
    public void method2243(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1924; var4++) {
            this.field1942[var4] += arg0;
            this.field1884[var4] += arg1;
            this.field1895[var4] += arg2;
        }
        this.field1905 = 0;
    }

    @ObfuscatedName("dk.r(III)V")
    public void method2294(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1924; var4++) {
            this.field1942[var4] = this.field1942[var4] * arg0 / 128;
            this.field1884[var4] = this.field1884[var4] * arg1 / 128;
            this.field1895[var4] = this.field1895[var4] * arg2 / 128;
        }
        this.field1905 = 0;
    }

    @ObfuscatedName("dk.s(IIIIIII)V")
    public final void method2250(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1920[0] = -1;
        if (this.field1905 != 2 && this.field1905 != 1) {
            this.method2239();
        }
        int var8 = Statics.field1801;
        int var9 = Statics.field1804;
        int var10 = field1885[arg0];
        int var11 = field1939[arg0];
        int var12 = field1885[arg1];
        int var13 = field1939[arg1];
        int var14 = field1885[arg2];
        int var15 = field1939[arg2];
        int var16 = field1885[arg3];
        int var17 = field1939[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1924; var19++) {
            int var20 = this.field1942[var19];
            int var21 = this.field1884[var19];
            int var22 = this.field1895[var19];
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
            field1928[var19] = (var26 << 9) / var30 + var8;
            field1914[var19] = (var29 << 9) / var30 + var9;
            if (this.field1898 > 0) {
                field1916[var19] = var26;
                field1917[var19] = var29;
                field1918[var19] = var30;
            }
        }
        try {
            this.method2292(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dk.g(IIIIIIII)V")
    public final void method2251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1920[0] = -1;
        if (this.field1905 != 2 && this.field1905 != 1) {
            this.method2239();
        }
        int var9 = Statics.field1801;
        int var10 = Statics.field1804;
        int var11 = field1885[arg0];
        int var12 = field1939[arg0];
        int var13 = field1885[arg1];
        int var14 = field1939[arg1];
        int var15 = field1885[arg2];
        int var16 = field1939[arg2];
        int var17 = field1885[arg3];
        int var18 = field1939[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1924; var20++) {
            int var21 = this.field1942[var20];
            int var22 = this.field1884[var20];
            int var23 = this.field1895[var20];
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
            field1928[var20] = (var27 << 9) / arg7 + var9;
            field1914[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1898 > 0) {
                field1916[var20] = var27;
                field1917[var20] = var30;
                field1918[var20] = var31;
            }
        }
        try {
            this.method2292(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dk.ap(IIIIIIIII)V")
    public void method1878(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1920[0] = -1;
        if (this.field1905 != 1) {
            this.method2238();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1932 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1932 << 9;
        if (var15 / var13 >= Statics.field1806) {
            return;
        }
        int var16 = this.field1932 + var14 << 9;
        if (var16 / var13 <= Statics.field1805) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1932 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1807) {
            return;
        }
        int var20 = (this.field1588 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1791) {
            return;
        }
        int var22 = (this.field1588 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1898 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1933) {
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
            int var32 = field1934 - Statics.field1801;
            int var33 = field1910 - Statics.field1804;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1878) {
                    field1882[field1936++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1801;
        int var35 = Statics.field1804;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1885[arg0];
            var37 = field1939[arg0];
        }
        for (int var38 = 0; var38 < this.field1924; var38++) {
            int var39 = this.field1942[var38];
            int var40 = this.field1884[var38];
            int var41 = this.field1895[var38];
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
            field1915[var38] = var50 - var11;
            if (var50 >= 50) {
                field1928[var38] = (var46 << 9) / var50 + var34;
                field1914[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1928[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1916[var38] = var46;
                field1917[var38] = var49;
                field1918[var38] = var50;
            }
        }
        try {
            this.method2292(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dk.m(ZZI)V")
    public final void method2292(boolean arg0, boolean arg1, int arg2) {
        if (this.field1908 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1908; var4++) {
            field1920[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1886; var5++) {
            if (this.field1892[var5] != -2) {
                int var6 = this.field1907[var5];
                int var7 = this.field1888[var5];
                int var8 = this.field1889[var5];
                int var9 = field1928[var6];
                int var10 = field1928[var7];
                int var11 = field1928[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1916[var6];
                    int var13 = field1916[var7];
                    int var14 = field1916[var8];
                    int var15 = field1917[var6];
                    int var16 = field1917[var7];
                    int var17 = field1917[var8];
                    int var18 = field1918[var6];
                    int var19 = field1918[var7];
                    int var20 = field1918[var8];
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
                        field1912[var5] = true;
                        int var30 = (field1915[var6] + field1915[var7] + field1915[var8]) / 3 + this.field1909;
                        field1921[var30][field1920[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2255(field1934, field1910, field1914[var6], field1914[var7], field1914[var8], var9, var10, var11)) {
                        field1882[field1936++] = arg2;
                        arg1 = false;
                    }
                    if ((field1914[var8] - field1914[var7]) * (var9 - var10) - (field1914[var6] - field1914[var7]) * (var11 - var10) > 0) {
                        field1912[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1803 && var10 <= Statics.field1803 && var11 <= Statics.field1803) {
                            field1883[var5] = false;
                        } else {
                            field1883[var5] = true;
                        }
                        int var31 = (field1915[var6] + field1915[var7] + field1915[var8]) / 3 + this.field1909;
                        field1921[var31][field1920[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1893 == null) {
            for (int var32 = this.field1908 - 1; var32 >= 0; var32--) {
                int var33 = field1920[var32];
                if (var33 > 0) {
                    int[] var34 = field1921[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2253(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1911[var36] = 0;
            field1926[var36] = 0;
        }
        for (int var37 = this.field1908 - 1; var37 >= 0; var37--) {
            int var38 = field1920[var37];
            if (var38 > 0) {
                int[] var39 = field1921[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1893[var41];
                    int var43 = field1911[var42]++;
                    field1923[var42][var43] = var41;
                    if (var42 < 10) {
                        field1926[var42] += var37;
                    } else if (var42 == 10) {
                        field1880[var43] = var37;
                    } else {
                        field1925[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1911[1] > 0 || field1911[2] > 0) {
            var44 = (field1926[1] + field1926[2]) / (field1911[1] + field1911[2]);
        }
        int var45 = 0;
        if (field1911[3] > 0 || field1911[4] > 0) {
            var45 = (field1926[3] + field1926[4]) / (field1911[3] + field1911[4]);
        }
        int var46 = 0;
        if (field1911[6] > 0 || field1911[8] > 0) {
            var46 = (field1926[6] + field1926[8]) / (field1911[6] + field1911[8]);
        }
        int var47 = 0;
        int var48 = field1911[10];
        int[] var49 = field1923[10];
        int[] var50 = field1880;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1911[11];
            var49 = field1923[11];
            var50 = field1925;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2253(var49[var47++]);
                if (var47 == var48 && field1923[11] != var49) {
                    var47 = 0;
                    var48 = field1911[11];
                    var49 = field1923[11];
                    var50 = field1925;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2253(var49[var47++]);
                if (var47 == var48 && field1923[11] != var49) {
                    var47 = 0;
                    var48 = field1911[11];
                    var49 = field1923[11];
                    var50 = field1925;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2253(var49[var47++]);
                if (var47 == var48 && field1923[11] != var49) {
                    var47 = 0;
                    var48 = field1911[11];
                    var49 = field1923[11];
                    var50 = field1925;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1911[var52];
            int[] var54 = field1923[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2253(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2253(var49[var47++]);
            if (var47 == var48 && field1923[11] != var49) {
                var47 = 0;
                var49 = field1923[11];
                var48 = field1911[11];
                var50 = field1925;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dk.a(I)V")
    public final void method2253(int arg0) {
        if (field1912[arg0]) {
            this.method2254(arg0);
            return;
        }
        int var2 = this.field1907[arg0];
        int var3 = this.field1888[arg0];
        int var4 = this.field1889[arg0];
        class104.field1795 = field1883[arg0];
        if (this.field1894 == null) {
            class104.field1813 = 0;
        } else {
            class104.field1813 = this.field1894[arg0] & 0xFF;
        }
        if (this.field1896 != null && this.field1896[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1938 == null || this.field1938[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1938[arg0] & 0xFF;
                var6 = this.field1899[var5];
                var7 = this.field1900[var5];
                var8 = this.field1901[var5];
            }
            if (this.field1892[arg0] == -1) {
                class104.method2154(field1914[var2], field1914[var3], field1914[var4], field1928[var2], field1928[var3], field1928[var4], this.field1890[arg0], this.field1890[arg0], this.field1890[arg0], field1916[var6], field1916[var7], field1916[var8], field1917[var6], field1917[var7], field1917[var8], field1918[var6], field1918[var7], field1918[var8], this.field1896[arg0]);
            } else {
                class104.method2154(field1914[var2], field1914[var3], field1914[var4], field1928[var2], field1928[var3], field1928[var4], this.field1890[arg0], this.field1929[arg0], this.field1892[arg0], field1916[var6], field1916[var7], field1916[var8], field1917[var6], field1917[var7], field1917[var8], field1918[var6], field1918[var7], field1918[var8], this.field1896[arg0]);
            }
        } else if (this.field1892[arg0] == -1) {
            class104.method2152(field1914[var2], field1914[var3], field1914[var4], field1928[var2], field1928[var3], field1928[var4], field1940[this.field1890[arg0]]);
        } else {
            class104.method2150(field1914[var2], field1914[var3], field1914[var4], field1928[var2], field1928[var3], field1928[var4], this.field1890[arg0], this.field1929[arg0], this.field1892[arg0]);
        }
    }

    @ObfuscatedName("dk.n(I)V")
    public final void method2254(int arg0) {
        int var2 = Statics.field1801;
        int var3 = Statics.field1804;
        int var4 = 0;
        int var5 = this.field1907[arg0];
        int var6 = this.field1888[arg0];
        int var7 = this.field1889[arg0];
        int var8 = field1918[var5];
        int var9 = field1918[var6];
        int var10 = field1918[var7];
        if (this.field1894 == null) {
            class104.field1813 = 0;
        } else {
            class104.field1813 = this.field1894[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1927[var4] = field1928[var5];
            field1897[var4] = field1914[var5];
            field1931[var4++] = this.field1890[arg0];
        } else {
            int var11 = field1916[var5];
            int var12 = field1917[var5];
            int var13 = this.field1890[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1891[var10 - var8];
                field1927[var4] = (((field1916[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1897[var4] = (((field1917[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1931[var4++] = ((this.field1892[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1891[var9 - var8];
                field1927[var4] = (((field1916[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1897[var4] = (((field1917[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1931[var4++] = ((this.field1929[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1927[var4] = field1928[var6];
            field1897[var4] = field1914[var6];
            field1931[var4++] = this.field1929[arg0];
        } else {
            int var16 = field1916[var6];
            int var17 = field1917[var6];
            int var18 = this.field1929[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1891[var8 - var9];
                field1927[var4] = (((field1916[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1897[var4] = (((field1917[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1931[var4++] = ((this.field1890[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1891[var10 - var9];
                field1927[var4] = (((field1916[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1897[var4] = (((field1917[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1931[var4++] = ((this.field1892[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1927[var4] = field1928[var7];
            field1897[var4] = field1914[var7];
            field1931[var4++] = this.field1892[arg0];
        } else {
            int var21 = field1916[var7];
            int var22 = field1917[var7];
            int var23 = this.field1892[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1891[var9 - var10];
                field1927[var4] = (((field1916[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1897[var4] = (((field1917[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1931[var4++] = ((this.field1929[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1891[var8 - var10];
                field1927[var4] = (((field1916[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1897[var4] = (((field1917[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1931[var4++] = ((this.field1890[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1927[0];
        int var27 = field1927[1];
        int var28 = field1927[2];
        int var29 = field1897[0];
        int var30 = field1897[1];
        int var31 = field1897[2];
        class104.field1795 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1803 || var27 > Statics.field1803 || var28 > Statics.field1803) {
                class104.field1795 = true;
            }
            if (this.field1896 != null && this.field1896[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1938 == null || this.field1938[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1938[arg0] & 0xFF;
                    var33 = this.field1899[var32];
                    var34 = this.field1900[var32];
                    var35 = this.field1901[var32];
                }
                if (this.field1892[arg0] == -1) {
                    class104.method2154(var29, var30, var31, var26, var27, var28, this.field1890[arg0], this.field1890[arg0], this.field1890[arg0], field1916[var33], field1916[var34], field1916[var35], field1917[var33], field1917[var34], field1917[var35], field1918[var33], field1918[var34], field1918[var35], this.field1896[arg0]);
                } else {
                    class104.method2154(var29, var30, var31, var26, var27, var28, field1931[0], field1931[1], field1931[2], field1916[var33], field1916[var34], field1916[var35], field1917[var33], field1917[var34], field1917[var35], field1918[var33], field1918[var34], field1918[var35], this.field1896[arg0]);
                }
            } else if (this.field1892[arg0] == -1) {
                class104.method2152(var29, var30, var31, var26, var27, var28, field1940[this.field1890[arg0]]);
            } else {
                class104.method2150(var29, var30, var31, var26, var27, var28, field1931[0], field1931[1], field1931[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1803 || var27 > Statics.field1803 || var28 > Statics.field1803 || field1927[3] < 0 || field1927[3] > Statics.field1803) {
            class104.field1795 = true;
        }
        if (this.field1896 != null && this.field1896[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1938 == null || this.field1938[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1938[arg0] & 0xFF;
                var37 = this.field1899[var36];
                var38 = this.field1900[var36];
                var39 = this.field1901[var36];
            }
            short var40 = this.field1896[arg0];
            if (this.field1892[arg0] == -1) {
                class104.method2154(var29, var30, var31, var26, var27, var28, this.field1890[arg0], this.field1890[arg0], this.field1890[arg0], field1916[var37], field1916[var38], field1916[var39], field1917[var37], field1917[var38], field1917[var39], field1918[var37], field1918[var38], field1918[var39], var40);
                class104.method2154(var29, var31, field1897[3], var26, var28, field1927[3], this.field1890[arg0], this.field1890[arg0], this.field1890[arg0], field1916[var37], field1916[var38], field1916[var39], field1917[var37], field1917[var38], field1917[var39], field1918[var37], field1918[var38], field1918[var39], var40);
            } else {
                class104.method2154(var29, var30, var31, var26, var27, var28, field1931[0], field1931[1], field1931[2], field1916[var37], field1916[var38], field1916[var39], field1917[var37], field1917[var38], field1917[var39], field1918[var37], field1918[var38], field1918[var39], var40);
                class104.method2154(var29, var31, field1897[3], var26, var28, field1927[3], field1931[0], field1931[2], field1931[3], field1916[var37], field1916[var38], field1916[var39], field1917[var37], field1917[var38], field1917[var39], field1918[var37], field1918[var38], field1918[var39], var40);
            }
        } else if (this.field1892[arg0] == -1) {
            int var41 = field1940[this.field1890[arg0]];
            class104.method2152(var29, var30, var31, var26, var27, var28, var41);
            class104.method2152(var29, var31, field1897[3], var26, var28, field1927[3], var41);
        } else {
            class104.method2150(var29, var30, var31, var26, var27, var28, field1931[0], field1931[1], field1931[2]);
            class104.method2150(var29, var31, field1897[3], var26, var28, field1927[3], field1931[0], field1931[2], field1931[3]);
        }
    }

    @ObfuscatedName("dk.v(IIIIIIII)Z")
    public final boolean method2255(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
