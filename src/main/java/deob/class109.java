package deob;

@ObfuscatedName("dv")
public class class109 extends class89 {

    @ObfuscatedName("dv.l")
    public static class109 field1917 = new class109();

    @ObfuscatedName("dv.g")
    public static byte[] field1910 = new byte[1];

    @ObfuscatedName("dv.r")
    public static class109 field1871 = new class109();

    @ObfuscatedName("dv.e")
    public static byte[] field1926 = new byte[1];

    @ObfuscatedName("dv.h")
    public int field1874 = 0;

    @ObfuscatedName("dv.s")
    public int[] field1875;

    @ObfuscatedName("dv.k")
    public int[] field1912;

    @ObfuscatedName("dv.u")
    public int[] field1894;

    @ObfuscatedName("dv.n")
    public int field1878 = 0;

    @ObfuscatedName("dv.b")
    public int[] field1879;

    @ObfuscatedName("dv.m")
    public int[] field1880;

    @ObfuscatedName("dv.q")
    public int[] field1881;

    @ObfuscatedName("dv.p")
    public int[] field1882;

    @ObfuscatedName("dv.w")
    public int[] field1883;

    @ObfuscatedName("dv.o")
    public int[] field1884;

    @ObfuscatedName("dv.d")
    public byte[] field1935;

    @ObfuscatedName("dv.f")
    public byte[] field1886;

    @ObfuscatedName("dv.z")
    public byte[] field1887;

    @ObfuscatedName("dv.i")
    public short[] field1888;

    @ObfuscatedName("dv.v")
    public byte field1889 = 0;

    @ObfuscatedName("dv.j")
    public int field1909 = 0;

    @ObfuscatedName("dv.x")
    public int[] field1873;

    @ObfuscatedName("dv.t")
    public int[] field1890;

    @ObfuscatedName("dv.y")
    public int[] field1931;

    @ObfuscatedName("dv.a")
    public int[][] field1896;

    @ObfuscatedName("dv.c")
    public int[][] field1895;

    @ObfuscatedName("dv.ad")
    public boolean field1893 = false;

    @ObfuscatedName("dv.as")
    public int field1897;

    @ObfuscatedName("dv.ac")
    public int field1891;

    @ObfuscatedName("dv.ah")
    public int field1899;

    @ObfuscatedName("dv.am")
    public int field1902;

    @ObfuscatedName("dv.aq")
    public int field1901;

    @ObfuscatedName("dv.ak")
    public static boolean[] field1903 = new boolean[4700];

    @ObfuscatedName("dv.ag")
    public static boolean[] field1904 = new boolean[4700];

    @ObfuscatedName("dv.af")
    public static int[] field1905 = new int[4700];

    @ObfuscatedName("dv.ab")
    public static int[] field1906 = new int[4700];

    @ObfuscatedName("dv.ap")
    public static int[] field1907 = new int[4700];

    @ObfuscatedName("dv.ao")
    public static int[] field1908 = new int[4700];

    @ObfuscatedName("dv.ay")
    public static int[] field1872 = new int[4700];

    @ObfuscatedName("dv.ai")
    public static int[] field1916 = new int[4700];

    @ObfuscatedName("dv.ae")
    public static int[] field1911 = new int[1600];

    @ObfuscatedName("dv.ar")
    public static int[][] field1913 = new int[1600][512];

    @ObfuscatedName("dv.at")
    public static int[] field1914 = new int[12];

    @ObfuscatedName("dv.av")
    public static int[][] field1915 = new int[12][2000];

    @ObfuscatedName("dv.aw")
    public static int[] field1900 = new int[2000];

    @ObfuscatedName("dv.au")
    public static int[] field1929 = new int[2000];

    @ObfuscatedName("dv.ax")
    public static int[] field1918 = new int[12];

    @ObfuscatedName("dv.al")
    public static int[] field1919 = new int[10];

    @ObfuscatedName("dv.an")
    public static int[] field1920 = new int[10];

    @ObfuscatedName("dv.aa")
    public static int[] field1921 = new int[10];

    @ObfuscatedName("dv.bt")
    public static boolean field1925 = false;

    @ObfuscatedName("dv.bn")
    public static int field1876 = 0;

    @ObfuscatedName("dv.bo")
    public static int field1927 = 0;

    @ObfuscatedName("dv.bu")
    public static int field1932 = 0;

    @ObfuscatedName("dv.bs")
    public static int[] field1877 = new int[1000];

    @ObfuscatedName("dv.be")
    public static int[] field1930 = class95.field1662;

    @ObfuscatedName("dv.by")
    public static int[] field1922 = class95.field1663;

    @ObfuscatedName("dv.bw")
    public static int[] field1892 = class95.field1660;

    @ObfuscatedName("dv.bm")
    public static int[] field1933 = class95.field1655;

    public class109() {
    }

    public class109(class109[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1874 = 0;
        this.field1878 = 0;
        this.field1909 = 0;
        this.field1889 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class109 var8 = arg0[var7];
            if (var8 != null) {
                this.field1874 += var8.field1874;
                this.field1878 += var8.field1878;
                this.field1909 += var8.field1909;
                if (var8.field1935 == null) {
                    if (this.field1889 == -1) {
                        this.field1889 = var8.field1889;
                    }
                    if (this.field1889 != var8.field1889) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1886 != null;
                var5 |= var8.field1888 != null;
                var6 |= var8.field1887 != null;
            }
        }
        this.field1875 = new int[this.field1874];
        this.field1912 = new int[this.field1874];
        this.field1894 = new int[this.field1874];
        this.field1879 = new int[this.field1878];
        this.field1880 = new int[this.field1878];
        this.field1881 = new int[this.field1878];
        this.field1882 = new int[this.field1878];
        this.field1883 = new int[this.field1878];
        this.field1884 = new int[this.field1878];
        if (var3) {
            this.field1935 = new byte[this.field1878];
        }
        if (var4) {
            this.field1886 = new byte[this.field1878];
        }
        if (var5) {
            this.field1888 = new short[this.field1878];
        }
        if (var6) {
            this.field1887 = new byte[this.field1878];
        }
        if (this.field1909 > 0) {
            this.field1873 = new int[this.field1909];
            this.field1890 = new int[this.field1909];
            this.field1931 = new int[this.field1909];
        }
        this.field1874 = 0;
        this.field1878 = 0;
        this.field1909 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class109 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1878; var11++) {
                    this.field1879[this.field1878] = var10.field1879[var11] + this.field1874;
                    this.field1880[this.field1878] = var10.field1880[var11] + this.field1874;
                    this.field1881[this.field1878] = var10.field1881[var11] + this.field1874;
                    this.field1882[this.field1878] = var10.field1882[var11];
                    this.field1883[this.field1878] = var10.field1883[var11];
                    this.field1884[this.field1878] = var10.field1884[var11];
                    if (var3) {
                        if (var10.field1935 == null) {
                            this.field1935[this.field1878] = var10.field1889;
                        } else {
                            this.field1935[this.field1878] = var10.field1935[var11];
                        }
                    }
                    if (var4 && var10.field1886 != null) {
                        this.field1886[this.field1878] = var10.field1886[var11];
                    }
                    if (var5) {
                        if (var10.field1888 == null) {
                            this.field1888[this.field1878] = -1;
                        } else {
                            this.field1888[this.field1878] = var10.field1888[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1887 == null || var10.field1887[var11] == -1) {
                            this.field1887[this.field1878] = -1;
                        } else {
                            this.field1887[this.field1878] = (byte) (var10.field1887[var11] + this.field1909);
                        }
                    }
                    this.field1878++;
                }
                for (int var12 = 0; var12 < var10.field1909; var12++) {
                    this.field1873[this.field1909] = var10.field1873[var12] + this.field1874;
                    this.field1890[this.field1909] = var10.field1890[var12] + this.field1874;
                    this.field1931[this.field1909] = var10.field1931[var12] + this.field1874;
                    this.field1909++;
                }
                for (int var13 = 0; var13 < var10.field1874; var13++) {
                    this.field1875[this.field1874] = var10.field1875[var13];
                    this.field1912[this.field1874] = var10.field1912[var13];
                    this.field1894[this.field1874] = var10.field1894[var13];
                    this.field1874++;
                }
            }
        }
    }

    @ObfuscatedName("dv.l([[IIIIZI)Ldv;")
    public class109 method2266(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2270();
        int var7 = arg1 - this.field1899;
        int var8 = this.field1899 + arg1;
        int var9 = arg3 - this.field1899;
        int var10 = this.field1899 + arg3;
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
            var15.field1874 = this.field1874;
            var15.field1878 = this.field1878;
            var15.field1909 = this.field1909;
            var15.field1875 = this.field1875;
            var15.field1894 = this.field1894;
            var15.field1879 = this.field1879;
            var15.field1880 = this.field1880;
            var15.field1881 = this.field1881;
            var15.field1882 = this.field1882;
            var15.field1883 = this.field1883;
            var15.field1884 = this.field1884;
            var15.field1935 = this.field1935;
            var15.field1886 = this.field1886;
            var15.field1887 = this.field1887;
            var15.field1888 = this.field1888;
            var15.field1889 = this.field1889;
            var15.field1873 = this.field1873;
            var15.field1890 = this.field1890;
            var15.field1931 = this.field1931;
            var15.field1896 = this.field1896;
            var15.field1895 = this.field1895;
            var15.field1893 = this.field1893;
            var15.field1912 = new int[var15.field1874];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1874; var16++) {
                int var17 = this.field1875[var16] + arg1;
                int var18 = this.field1894[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1912[var16] = this.field1912[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1874; var26++) {
                int var27 = (-this.field1912[var26] << 16) / this.field1539;
                if (var27 < arg5) {
                    int var28 = this.field1875[var26] + arg1;
                    int var29 = this.field1894[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1912[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1912[var26];
                }
            }
        }
        var15.field1897 = 0;
        return var15;
    }

    @ObfuscatedName("dv.g(Z)Ldv;")
    public class109 method2267(boolean arg0) {
        if (!arg0 && field1910.length < this.field1878) {
            field1910 = new byte[this.field1878 + 100];
        }
        return this.method2301(arg0, field1917, field1910);
    }

    @ObfuscatedName("dv.e(Z)Ldv;")
    public class109 method2268(boolean arg0) {
        if (!arg0 && field1926.length < this.field1878) {
            field1926 = new byte[this.field1878 + 100];
        }
        return this.method2301(arg0, field1871, field1926);
    }

    @ObfuscatedName("dv.h(ZLdv;[B)Ldv;")
    public class109 method2301(boolean arg0, class109 arg1, byte[] arg2) {
        arg1.field1874 = this.field1874;
        arg1.field1878 = this.field1878;
        arg1.field1909 = this.field1909;
        if (arg1.field1875 == null || arg1.field1875.length < this.field1874) {
            arg1.field1875 = new int[this.field1874 + 100];
            arg1.field1912 = new int[this.field1874 + 100];
            arg1.field1894 = new int[this.field1874 + 100];
        }
        for (int var4 = 0; var4 < this.field1874; var4++) {
            arg1.field1875[var4] = this.field1875[var4];
            arg1.field1912[var4] = this.field1912[var4];
            arg1.field1894[var4] = this.field1894[var4];
        }
        if (arg0) {
            arg1.field1886 = this.field1886;
        } else {
            arg1.field1886 = arg2;
            if (this.field1886 == null) {
                for (int var5 = 0; var5 < this.field1878; var5++) {
                    arg1.field1886[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1878; var6++) {
                    arg1.field1886[var6] = this.field1886[var6];
                }
            }
        }
        arg1.field1879 = this.field1879;
        arg1.field1880 = this.field1880;
        arg1.field1881 = this.field1881;
        arg1.field1882 = this.field1882;
        arg1.field1883 = this.field1883;
        arg1.field1884 = this.field1884;
        arg1.field1935 = this.field1935;
        arg1.field1887 = this.field1887;
        arg1.field1888 = this.field1888;
        arg1.field1889 = this.field1889;
        arg1.field1873 = this.field1873;
        arg1.field1890 = this.field1890;
        arg1.field1931 = this.field1931;
        arg1.field1896 = this.field1896;
        arg1.field1895 = this.field1895;
        arg1.field1893 = this.field1893;
        arg1.field1897 = 0;
        return arg1;
    }

    @ObfuscatedName("dv.s()V")
    public void method2270() {
        if (this.field1897 == 1) {
            return;
        }
        this.field1897 = 1;
        this.field1539 = 0;
        this.field1891 = 0;
        this.field1899 = 0;
        for (int var1 = 0; var1 < this.field1874; var1++) {
            int var2 = this.field1875[var1];
            int var3 = this.field1912[var1];
            int var4 = this.field1894[var1];
            if (-var3 > this.field1539) {
                this.field1539 = -var3;
            }
            if (var3 > this.field1891) {
                this.field1891 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1899) {
                this.field1899 = var5;
            }
        }
        this.field1899 = (int) (Math.sqrt((double) this.field1899) + 0.99D);
        this.field1901 = (int) (Math.sqrt((double) (this.field1539 * this.field1539 + this.field1899 * this.field1899)) + 0.99D);
        this.field1902 = this.field1901 + (int) (Math.sqrt((double) (this.field1899 * this.field1899 + this.field1891 * this.field1891)) + 0.99D);
    }

    @ObfuscatedName("dv.k()V")
    public void method2271() {
        if (this.field1897 == 2) {
            return;
        }
        this.field1897 = 2;
        this.field1899 = 0;
        for (int var1 = 0; var1 < this.field1874; var1++) {
            int var2 = this.field1875[var1];
            int var3 = this.field1912[var1];
            int var4 = this.field1894[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1899) {
                this.field1899 = var5;
            }
        }
        this.field1899 = (int) (Math.sqrt((double) this.field1899) + 0.99D);
        this.field1901 = this.field1899;
        this.field1902 = this.field1899 + this.field1899;
    }

    @ObfuscatedName("dv.u()I")
    public int method2323() {
        this.method2270();
        return this.field1899;
    }

    @ObfuscatedName("dv.n(Ldl;I)V")
    public void method2273(class107 arg0, int arg1) {
        if (this.field1896 == null || arg1 == -1) {
            return;
        }
        class92 var3 = arg0.field1844[arg1];
        class106 var4 = var3.field1620;
        Statics.field1870 = 0;
        Statics.field1923 = 0;
        Statics.field1924 = 0;
        for (int var5 = 0; var5 < var3.field1621; var5++) {
            int var6 = var3.field1622[var5];
            this.method2275(var4.field1837[var6], var4.field1838[var6], var3.field1624[var5], var3.field1616[var5], var3.field1625[var5]);
        }
        this.field1897 = 0;
    }

    @ObfuscatedName("dv.b(Ldl;ILdl;I[I)V")
    public void method2276(class107 arg0, int arg1, class107 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2273(arg0, arg1);
            return;
        }
        class92 var6 = arg0.field1844[arg1];
        class92 var7 = arg2.field1844[arg3];
        class106 var8 = var6.field1620;
        Statics.field1870 = 0;
        Statics.field1923 = 0;
        Statics.field1924 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1621; var11++) {
            int var12 = var6.field1622[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1837[var12] == 0) {
                this.method2275(var8.field1837[var12], var8.field1838[var12], var6.field1624[var11], var6.field1616[var11], var6.field1625[var11]);
            }
        }
        Statics.field1870 = 0;
        Statics.field1923 = 0;
        Statics.field1924 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1621; var15++) {
            int var16 = var7.field1622[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1837[var16] == 0) {
                this.method2275(var8.field1837[var16], var8.field1838[var16], var7.field1624[var15], var7.field1616[var15], var7.field1625[var15]);
            }
        }
        this.field1897 = 0;
    }

    @ObfuscatedName("dv.m(I[IIII)V")
    public void method2275(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1870 = 0;
            Statics.field1923 = 0;
            Statics.field1924 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1896.length) {
                    int[] var10 = this.field1896[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1870 += this.field1875[var12];
                        Statics.field1923 += this.field1912[var12];
                        Statics.field1924 += this.field1894[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1870 = Statics.field1870 / var7 + arg2;
                Statics.field1923 = Statics.field1923 / var7 + arg3;
                Statics.field1924 = Statics.field1924 / var7 + arg4;
            } else {
                Statics.field1870 = arg2;
                Statics.field1923 = arg3;
                Statics.field1924 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1896.length) {
                    int[] var15 = this.field1896[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1875[var17] += arg2;
                        this.field1912[var17] += arg3;
                        this.field1894[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1896.length) {
                    int[] var20 = this.field1896[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1875[var22] -= Statics.field1870;
                        this.field1912[var22] -= Statics.field1923;
                        this.field1894[var22] -= Statics.field1924;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1930[var25];
                            int var27 = field1922[var25];
                            int var28 = this.field1912[var22] * var26 + this.field1875[var22] * var27 >> 16;
                            this.field1912[var22] = this.field1912[var22] * var27 - this.field1875[var22] * var26 >> 16;
                            this.field1875[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1930[var23];
                            int var30 = field1922[var23];
                            int var31 = this.field1912[var22] * var30 - this.field1894[var22] * var29 >> 16;
                            this.field1894[var22] = this.field1912[var22] * var29 + this.field1894[var22] * var30 >> 16;
                            this.field1912[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1930[var24];
                            int var33 = field1922[var24];
                            int var34 = this.field1894[var22] * var32 + this.field1875[var22] * var33 >> 16;
                            this.field1894[var22] = this.field1894[var22] * var33 - this.field1875[var22] * var32 >> 16;
                            this.field1875[var22] = var34;
                        }
                        this.field1875[var22] += Statics.field1870;
                        this.field1912[var22] += Statics.field1923;
                        this.field1894[var22] += Statics.field1924;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1896.length) {
                    int[] var37 = this.field1896[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1875[var39] -= Statics.field1870;
                        this.field1912[var39] -= Statics.field1923;
                        this.field1894[var39] -= Statics.field1924;
                        this.field1875[var39] = this.field1875[var39] * arg2 / 128;
                        this.field1912[var39] = this.field1912[var39] * arg3 / 128;
                        this.field1894[var39] = this.field1894[var39] * arg4 / 128;
                        this.field1875[var39] += Statics.field1870;
                        this.field1912[var39] += Statics.field1923;
                        this.field1894[var39] += Statics.field1924;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1895 != null && this.field1886 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1895.length) {
                    int[] var42 = this.field1895[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1886[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1886[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dv.o()V")
    public void method2320() {
        for (int var1 = 0; var1 < this.field1874; var1++) {
            int var2 = this.field1875[var1];
            this.field1875[var1] = this.field1894[var1];
            this.field1894[var1] = -var2;
        }
        this.field1897 = 0;
    }

    @ObfuscatedName("dv.d()V")
    public void method2288() {
        for (int var1 = 0; var1 < this.field1874; var1++) {
            this.field1875[var1] = -this.field1875[var1];
            this.field1894[var1] = -this.field1894[var1];
        }
        this.field1897 = 0;
    }

    @ObfuscatedName("dv.f()V")
    public void method2278() {
        for (int var1 = 0; var1 < this.field1874; var1++) {
            int var2 = this.field1894[var1];
            this.field1894[var1] = this.field1875[var1];
            this.field1875[var1] = -var2;
        }
        this.field1897 = 0;
    }

    @ObfuscatedName("dv.z(I)V")
    public void method2279(int arg0) {
        int var2 = field1930[arg0];
        int var3 = field1922[arg0];
        for (int var4 = 0; var4 < this.field1874; var4++) {
            int var5 = this.field1912[var4] * var3 - this.field1894[var4] * var2 >> 16;
            this.field1894[var4] = this.field1912[var4] * var2 + this.field1894[var4] * var3 >> 16;
            this.field1912[var4] = var5;
        }
        this.field1897 = 0;
    }

    @ObfuscatedName("dv.i(III)V")
    public void method2280(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1874; var4++) {
            this.field1875[var4] += arg0;
            this.field1912[var4] += arg1;
            this.field1894[var4] += arg2;
        }
        this.field1897 = 0;
    }

    @ObfuscatedName("dv.v(III)V")
    public void method2272(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1874; var4++) {
            this.field1875[var4] = this.field1875[var4] * arg0 / 128;
            this.field1912[var4] = this.field1912[var4] * arg1 / 128;
            this.field1894[var4] = this.field1894[var4] * arg2 / 128;
        }
        this.field1897 = 0;
    }

    @ObfuscatedName("dv.j(IIIIIII)V")
    public final void method2282(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1911[0] = -1;
        if (this.field1897 != 2 && this.field1897 != 1) {
            this.method2271();
        }
        int var8 = Statics.field1649;
        int var9 = Statics.field1650;
        int var10 = field1930[arg0];
        int var11 = field1922[arg0];
        int var12 = field1930[arg1];
        int var13 = field1922[arg1];
        int var14 = field1930[arg2];
        int var15 = field1922[arg2];
        int var16 = field1930[arg3];
        int var17 = field1922[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1874; var19++) {
            int var20 = this.field1875[var19];
            int var21 = this.field1912[var19];
            int var22 = this.field1894[var19];
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
            field1907[var19] = var30 - var18;
            field1905[var19] = class95.field1661 * var26 / var30 + var8;
            field1906[var19] = class95.field1661 * var29 / var30 + var9;
            if (this.field1909 > 0) {
                field1908[var19] = var26;
                field1872[var19] = var29;
                field1916[var19] = var30;
            }
        }
        try {
            this.method2284(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dv.x(IIIIIIII)V")
    public final void method2283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1911[0] = -1;
        if (this.field1897 != 2 && this.field1897 != 1) {
            this.method2271();
        }
        int var9 = Statics.field1649;
        int var10 = Statics.field1650;
        int var11 = field1930[arg0];
        int var12 = field1922[arg0];
        int var13 = field1930[arg1];
        int var14 = field1922[arg1];
        int var15 = field1930[arg2];
        int var16 = field1922[arg2];
        int var17 = field1930[arg3];
        int var18 = field1922[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1874; var20++) {
            int var21 = this.field1875[var20];
            int var22 = this.field1912[var20];
            int var23 = this.field1894[var20];
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
            field1907[var20] = var31 - var19;
            field1905[var20] = class95.field1661 * var27 / arg7 + var9;
            field1906[var20] = class95.field1661 * var30 / arg7 + var10;
            if (this.field1909 > 0) {
                field1908[var20] = var27;
                field1872[var20] = var30;
                field1916[var20] = var31;
            }
        }
        try {
            this.method2284(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dv.af(IIIIIIIII)V")
    public void method1876(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1911[0] = -1;
        if (this.field1897 != 1) {
            this.method2270();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1899 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1899) * class95.field1661;
        if (var15 / var13 >= Statics.field1654) {
            return;
        }
        int var16 = (this.field1899 + var14) * class95.field1661;
        if (var16 / var13 <= Statics.field1653) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1899 * arg1 >> 16;
        int var19 = (var17 + var18) * class95.field1661;
        if (var19 / var13 <= Statics.field1651) {
            return;
        }
        int var20 = (this.field1539 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class95.field1661;
        if (var21 / var13 >= Statics.field1656) {
            return;
        }
        int var22 = (this.field1539 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1909 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1925) {
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
            int var32 = field1876 - Statics.field1649;
            int var33 = field1927 - Statics.field1650;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1893) {
                    field1877[field1932++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1649;
        int var35 = Statics.field1650;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1930[arg0];
            var37 = field1922[arg0];
        }
        for (int var38 = 0; var38 < this.field1874; var38++) {
            int var39 = this.field1875[var38];
            int var40 = this.field1912[var38];
            int var41 = this.field1894[var38];
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
            field1907[var38] = var50 - var11;
            if (var50 >= 50) {
                field1905[var38] = class95.field1661 * var46 / var50 + var34;
                field1906[var38] = class95.field1661 * var49 / var50 + var35;
            } else {
                field1905[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1908[var38] = var46;
                field1872[var38] = var49;
                field1916[var38] = var50;
            }
        }
        try {
            this.method2284(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dv.t(ZZI)V")
    public final void method2284(boolean arg0, boolean arg1, int arg2) {
        if (this.field1902 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1902; var4++) {
            field1911[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1878; var5++) {
            if (this.field1884[var5] != -2) {
                int var6 = this.field1879[var5];
                int var7 = this.field1880[var5];
                int var8 = this.field1881[var5];
                int var9 = field1905[var6];
                int var10 = field1905[var7];
                int var11 = field1905[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1908[var6];
                    int var13 = field1908[var7];
                    int var14 = field1908[var8];
                    int var15 = field1872[var6];
                    int var16 = field1872[var7];
                    int var17 = field1872[var8];
                    int var18 = field1916[var6];
                    int var19 = field1916[var7];
                    int var20 = field1916[var8];
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
                        field1904[var5] = true;
                        int var30 = (field1907[var6] + field1907[var7] + field1907[var8]) / 3 + this.field1901;
                        field1913[var30][field1911[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2287(field1876, field1927, field1906[var6], field1906[var7], field1906[var8], var9, var10, var11)) {
                        field1877[field1932++] = arg2;
                        arg1 = false;
                    }
                    if ((field1906[var8] - field1906[var7]) * (var9 - var10) - (field1906[var6] - field1906[var7]) * (var11 - var10) > 0) {
                        field1904[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1658 && var10 <= Statics.field1658 && var11 <= Statics.field1658) {
                            field1903[var5] = false;
                        } else {
                            field1903[var5] = true;
                        }
                        int var31 = (field1907[var6] + field1907[var7] + field1907[var8]) / 3 + this.field1901;
                        field1913[var31][field1911[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1935 == null) {
            for (int var32 = this.field1902 - 1; var32 >= 0; var32--) {
                int var33 = field1911[var32];
                if (var33 > 0) {
                    int[] var34 = field1913[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2285(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1914[var36] = 0;
            field1918[var36] = 0;
        }
        for (int var37 = this.field1902 - 1; var37 >= 0; var37--) {
            int var38 = field1911[var37];
            if (var38 > 0) {
                int[] var39 = field1913[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1935[var41];
                    int var43 = field1914[var42]++;
                    field1915[var42][var43] = var41;
                    if (var42 < 10) {
                        field1918[var42] += var37;
                    } else if (var42 == 10) {
                        field1900[var43] = var37;
                    } else {
                        field1929[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1914[1] > 0 || field1914[2] > 0) {
            var44 = (field1918[1] + field1918[2]) / (field1914[1] + field1914[2]);
        }
        int var45 = 0;
        if (field1914[3] > 0 || field1914[4] > 0) {
            var45 = (field1918[3] + field1918[4]) / (field1914[3] + field1914[4]);
        }
        int var46 = 0;
        if (field1914[6] > 0 || field1914[8] > 0) {
            var46 = (field1918[6] + field1918[8]) / (field1914[6] + field1914[8]);
        }
        int var47 = 0;
        int var48 = field1914[10];
        int[] var49 = field1915[10];
        int[] var50 = field1900;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1914[11];
            var49 = field1915[11];
            var50 = field1929;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2285(var49[var47++]);
                if (var47 == var48 && field1915[11] != var49) {
                    var47 = 0;
                    var48 = field1914[11];
                    var49 = field1915[11];
                    var50 = field1929;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2285(var49[var47++]);
                if (var47 == var48 && field1915[11] != var49) {
                    var47 = 0;
                    var48 = field1914[11];
                    var49 = field1915[11];
                    var50 = field1929;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2285(var49[var47++]);
                if (var47 == var48 && field1915[11] != var49) {
                    var47 = 0;
                    var48 = field1914[11];
                    var49 = field1915[11];
                    var50 = field1929;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1914[var52];
            int[] var54 = field1915[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2285(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2285(var49[var47++]);
            if (var47 == var48 && field1915[11] != var49) {
                var47 = 0;
                var49 = field1915[11];
                var48 = field1914[11];
                var50 = field1929;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dv.y(I)V")
    public final void method2285(int arg0) {
        if (field1904[arg0]) {
            this.method2286(arg0);
            return;
        }
        int var2 = this.field1879[arg0];
        int var3 = this.field1880[arg0];
        int var4 = this.field1881[arg0];
        class95.field1657 = field1903[arg0];
        if (this.field1886 == null) {
            class95.field1643 = 0;
        } else {
            class95.field1643 = this.field1886[arg0] & 0xFF;
        }
        if (this.field1888 != null && this.field1888[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1887 == null || this.field1887[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1887[arg0] & 0xFF;
                var6 = this.field1873[var5];
                var7 = this.field1890[var5];
                var8 = this.field1931[var5];
            }
            if (this.field1884[arg0] == -1) {
                class95.method2065(field1906[var2], field1906[var3], field1906[var4], field1905[var2], field1905[var3], field1905[var4], this.field1882[arg0], this.field1882[arg0], this.field1882[arg0], field1908[var6], field1908[var7], field1908[var8], field1872[var6], field1872[var7], field1872[var8], field1916[var6], field1916[var7], field1916[var8], this.field1888[arg0]);
            } else {
                class95.method2065(field1906[var2], field1906[var3], field1906[var4], field1905[var2], field1905[var3], field1905[var4], this.field1882[arg0], this.field1883[arg0], this.field1884[arg0], field1908[var6], field1908[var7], field1908[var8], field1872[var6], field1872[var7], field1872[var8], field1916[var6], field1916[var7], field1916[var8], this.field1888[arg0]);
            }
        } else if (this.field1884[arg0] == -1) {
            class95.method2107(field1906[var2], field1906[var3], field1906[var4], field1905[var2], field1905[var3], field1905[var4], field1892[this.field1882[arg0]]);
        } else {
            class95.method2061(field1906[var2], field1906[var3], field1906[var4], field1905[var2], field1905[var3], field1905[var4], this.field1882[arg0], this.field1883[arg0], this.field1884[arg0]);
        }
    }

    @ObfuscatedName("dv.a(I)V")
    public final void method2286(int arg0) {
        int var2 = Statics.field1649;
        int var3 = Statics.field1650;
        int var4 = 0;
        int var5 = this.field1879[arg0];
        int var6 = this.field1880[arg0];
        int var7 = this.field1881[arg0];
        int var8 = field1916[var5];
        int var9 = field1916[var6];
        int var10 = field1916[var7];
        if (this.field1886 == null) {
            class95.field1643 = 0;
        } else {
            class95.field1643 = this.field1886[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1919[var4] = field1905[var5];
            field1920[var4] = field1906[var5];
            field1921[var4++] = this.field1882[arg0];
        } else {
            int var11 = field1908[var5];
            int var12 = field1872[var5];
            int var13 = this.field1882[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1933[var10 - var8];
                field1919[var4] = (((field1908[var7] - var11) * var14 >> 16) + var11) * class95.field1661 / 50 + var2;
                field1920[var4] = (((field1872[var7] - var12) * var14 >> 16) + var12) * class95.field1661 / 50 + var3;
                field1921[var4++] = ((this.field1884[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1933[var9 - var8];
                field1919[var4] = (((field1908[var6] - var11) * var15 >> 16) + var11) * class95.field1661 / 50 + var2;
                field1920[var4] = (((field1872[var6] - var12) * var15 >> 16) + var12) * class95.field1661 / 50 + var3;
                field1921[var4++] = ((this.field1883[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1919[var4] = field1905[var6];
            field1920[var4] = field1906[var6];
            field1921[var4++] = this.field1883[arg0];
        } else {
            int var16 = field1908[var6];
            int var17 = field1872[var6];
            int var18 = this.field1883[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1933[var8 - var9];
                field1919[var4] = (((field1908[var5] - var16) * var19 >> 16) + var16) * class95.field1661 / 50 + var2;
                field1920[var4] = (((field1872[var5] - var17) * var19 >> 16) + var17) * class95.field1661 / 50 + var3;
                field1921[var4++] = ((this.field1882[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1933[var10 - var9];
                field1919[var4] = (((field1908[var7] - var16) * var20 >> 16) + var16) * class95.field1661 / 50 + var2;
                field1920[var4] = (((field1872[var7] - var17) * var20 >> 16) + var17) * class95.field1661 / 50 + var3;
                field1921[var4++] = ((this.field1884[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1919[var4] = field1905[var7];
            field1920[var4] = field1906[var7];
            field1921[var4++] = this.field1884[arg0];
        } else {
            int var21 = field1908[var7];
            int var22 = field1872[var7];
            int var23 = this.field1884[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1933[var9 - var10];
                field1919[var4] = (((field1908[var6] - var21) * var24 >> 16) + var21) * class95.field1661 / 50 + var2;
                field1920[var4] = (((field1872[var6] - var22) * var24 >> 16) + var22) * class95.field1661 / 50 + var3;
                field1921[var4++] = ((this.field1883[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1933[var8 - var10];
                field1919[var4] = (((field1908[var5] - var21) * var25 >> 16) + var21) * class95.field1661 / 50 + var2;
                field1920[var4] = (((field1872[var5] - var22) * var25 >> 16) + var22) * class95.field1661 / 50 + var3;
                field1921[var4++] = ((this.field1882[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1919[0];
        int var27 = field1919[1];
        int var28 = field1919[2];
        int var29 = field1920[0];
        int var30 = field1920[1];
        int var31 = field1920[2];
        class95.field1657 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1658 || var27 > Statics.field1658 || var28 > Statics.field1658) {
                class95.field1657 = true;
            }
            if (this.field1888 != null && this.field1888[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1887 == null || this.field1887[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1887[arg0] & 0xFF;
                    var33 = this.field1873[var32];
                    var34 = this.field1890[var32];
                    var35 = this.field1931[var32];
                }
                if (this.field1884[arg0] == -1) {
                    class95.method2065(var29, var30, var31, var26, var27, var28, this.field1882[arg0], this.field1882[arg0], this.field1882[arg0], field1908[var33], field1908[var34], field1908[var35], field1872[var33], field1872[var34], field1872[var35], field1916[var33], field1916[var34], field1916[var35], this.field1888[arg0]);
                } else {
                    class95.method2065(var29, var30, var31, var26, var27, var28, field1921[0], field1921[1], field1921[2], field1908[var33], field1908[var34], field1908[var35], field1872[var33], field1872[var34], field1872[var35], field1916[var33], field1916[var34], field1916[var35], this.field1888[arg0]);
                }
            } else if (this.field1884[arg0] == -1) {
                class95.method2107(var29, var30, var31, var26, var27, var28, field1892[this.field1882[arg0]]);
            } else {
                class95.method2061(var29, var30, var31, var26, var27, var28, field1921[0], field1921[1], field1921[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1658 || var27 > Statics.field1658 || var28 > Statics.field1658 || field1919[3] < 0 || field1919[3] > Statics.field1658) {
            class95.field1657 = true;
        }
        if (this.field1888 != null && this.field1888[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1887 == null || this.field1887[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1887[arg0] & 0xFF;
                var37 = this.field1873[var36];
                var38 = this.field1890[var36];
                var39 = this.field1931[var36];
            }
            short var40 = this.field1888[arg0];
            if (this.field1884[arg0] == -1) {
                class95.method2065(var29, var30, var31, var26, var27, var28, this.field1882[arg0], this.field1882[arg0], this.field1882[arg0], field1908[var37], field1908[var38], field1908[var39], field1872[var37], field1872[var38], field1872[var39], field1916[var37], field1916[var38], field1916[var39], var40);
                class95.method2065(var29, var31, field1920[3], var26, var28, field1919[3], this.field1882[arg0], this.field1882[arg0], this.field1882[arg0], field1908[var37], field1908[var38], field1908[var39], field1872[var37], field1872[var38], field1872[var39], field1916[var37], field1916[var38], field1916[var39], var40);
            } else {
                class95.method2065(var29, var30, var31, var26, var27, var28, field1921[0], field1921[1], field1921[2], field1908[var37], field1908[var38], field1908[var39], field1872[var37], field1872[var38], field1872[var39], field1916[var37], field1916[var38], field1916[var39], var40);
                class95.method2065(var29, var31, field1920[3], var26, var28, field1919[3], field1921[0], field1921[2], field1921[3], field1908[var37], field1908[var38], field1908[var39], field1872[var37], field1872[var38], field1872[var39], field1916[var37], field1916[var38], field1916[var39], var40);
            }
        } else if (this.field1884[arg0] == -1) {
            int var41 = field1892[this.field1882[arg0]];
            class95.method2107(var29, var30, var31, var26, var27, var28, var41);
            class95.method2107(var29, var31, field1920[3], var26, var28, field1919[3], var41);
        } else {
            class95.method2061(var29, var30, var31, var26, var27, var28, field1921[0], field1921[1], field1921[2]);
            class95.method2061(var29, var31, field1920[3], var26, var28, field1919[3], field1921[0], field1921[2], field1921[3]);
        }
    }

    @ObfuscatedName("dv.c(IIIIIIII)Z")
    public final boolean method2287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
