package deob;

@ObfuscatedName("ds")
public class class109 extends class89 {

    @ObfuscatedName("ds.e")
    public static class109 field1882 = new class109();

    @ObfuscatedName("ds.l")
    public static byte[] field1876 = new byte[1];

    @ObfuscatedName("ds.c")
    public static class109 field1939 = new class109();

    @ObfuscatedName("ds.h")
    public static byte[] field1878 = new byte[1];

    @ObfuscatedName("ds.r")
    public int field1879 = 0;

    @ObfuscatedName("ds.a")
    public int[] field1938;

    @ObfuscatedName("ds.b")
    public int[] field1883;

    @ObfuscatedName("ds.u")
    public int[] field1881;

    @ObfuscatedName("ds.o")
    public int field1916 = 0;

    @ObfuscatedName("ds.p")
    public int[] field1875;

    @ObfuscatedName("ds.i")
    public int[] field1885;

    @ObfuscatedName("ds.q")
    public int[] field1886;

    @ObfuscatedName("ds.g")
    public int[] field1887;

    @ObfuscatedName("ds.j")
    public int[] field1877;

    @ObfuscatedName("ds.w")
    public int[] field1889;

    @ObfuscatedName("ds.x")
    public byte[] field1890;

    @ObfuscatedName("ds.f")
    public byte[] field1917;

    @ObfuscatedName("ds.t")
    public byte[] field1880;

    @ObfuscatedName("ds.z")
    public short[] field1893;

    @ObfuscatedName("ds.y")
    public byte field1920 = 0;

    @ObfuscatedName("ds.m")
    public int field1895 = 0;

    @ObfuscatedName("ds.v")
    public int[] field1896;

    @ObfuscatedName("ds.k")
    public int[] field1926;

    @ObfuscatedName("ds.n")
    public int[] field1928;

    @ObfuscatedName("ds.d")
    public int[][] field1899;

    @ObfuscatedName("ds.s")
    public int[][] field1900;

    @ObfuscatedName("ds.ah")
    public boolean field1930 = false;

    @ObfuscatedName("ds.ak")
    public int field1922;

    @ObfuscatedName("ds.as")
    public int field1892;

    @ObfuscatedName("ds.ae")
    public int field1904;

    @ObfuscatedName("ds.ao")
    public int field1905;

    @ObfuscatedName("ds.av")
    public int field1906;

    @ObfuscatedName("ds.ap")
    public static boolean[] field1908 = new boolean[4700];

    @ObfuscatedName("ds.an")
    public static boolean[] field1909 = new boolean[4700];

    @ObfuscatedName("ds.aw")
    public static int[] field1910 = new int[4700];

    @ObfuscatedName("ds.ad")
    public static int[] field1911 = new int[4700];

    @ObfuscatedName("ds.aa")
    public static int[] field1912 = new int[4700];

    @ObfuscatedName("ds.at")
    public static int[] field1913 = new int[4700];

    @ObfuscatedName("ds.ag")
    public static int[] field1891 = new int[4700];

    @ObfuscatedName("ds.aq")
    public static int[] field1915 = new int[4700];

    @ObfuscatedName("ds.ax")
    public static int[] field1923 = new int[1600];

    @ObfuscatedName("ds.ai")
    public static int[][] field1918 = new int[1600][512];

    @ObfuscatedName("ds.ar")
    public static int[] field1919 = new int[12];

    @ObfuscatedName("ds.ab")
    public static int[][] field1902 = new int[12][2000];

    @ObfuscatedName("ds.aj")
    public static int[] field1921 = new int[2000];

    @ObfuscatedName("ds.au")
    public static int[] field1903 = new int[2000];

    @ObfuscatedName("ds.am")
    public static int[] field1884 = new int[12];

    @ObfuscatedName("ds.az")
    public static int[] field1924 = new int[10];

    @ObfuscatedName("ds.ay")
    public static int[] field1897 = new int[10];

    @ObfuscatedName("ds.ac")
    public static int[] field1894 = new int[10];

    @ObfuscatedName("ds.bp")
    public static boolean field1914 = false;

    @ObfuscatedName("ds.bq")
    public static int field1931 = 0;

    @ObfuscatedName("ds.bt")
    public static int field1932 = 0;

    @ObfuscatedName("ds.by")
    public static int field1933 = 0;

    @ObfuscatedName("ds.ba")
    public static int[] field1934 = new int[1000];

    @ObfuscatedName("ds.bg")
    public static int[] field1935 = class95.field1656;

    @ObfuscatedName("ds.bh")
    public static int[] field1901 = class95.field1654;

    @ObfuscatedName("ds.bc")
    public static int[] field1937 = class95.field1652;

    @ObfuscatedName("ds.bb")
    public static int[] field1936 = class95.field1635;

    public class109() {
    }

    public class109(class109[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1879 = 0;
        this.field1916 = 0;
        this.field1895 = 0;
        this.field1920 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class109 var8 = arg0[var7];
            if (var8 != null) {
                this.field1879 += var8.field1879;
                this.field1916 += var8.field1916;
                this.field1895 += var8.field1895;
                if (var8.field1890 == null) {
                    if (this.field1920 == -1) {
                        this.field1920 = var8.field1920;
                    }
                    if (this.field1920 != var8.field1920) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1917 != null;
                var5 |= var8.field1893 != null;
                var6 |= var8.field1880 != null;
            }
        }
        this.field1938 = new int[this.field1879];
        this.field1883 = new int[this.field1879];
        this.field1881 = new int[this.field1879];
        this.field1875 = new int[this.field1916];
        this.field1885 = new int[this.field1916];
        this.field1886 = new int[this.field1916];
        this.field1887 = new int[this.field1916];
        this.field1877 = new int[this.field1916];
        this.field1889 = new int[this.field1916];
        if (var3) {
            this.field1890 = new byte[this.field1916];
        }
        if (var4) {
            this.field1917 = new byte[this.field1916];
        }
        if (var5) {
            this.field1893 = new short[this.field1916];
        }
        if (var6) {
            this.field1880 = new byte[this.field1916];
        }
        if (this.field1895 > 0) {
            this.field1896 = new int[this.field1895];
            this.field1926 = new int[this.field1895];
            this.field1928 = new int[this.field1895];
        }
        this.field1879 = 0;
        this.field1916 = 0;
        this.field1895 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class109 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1916; var11++) {
                    this.field1875[this.field1916] = var10.field1875[var11] + this.field1879;
                    this.field1885[this.field1916] = var10.field1885[var11] + this.field1879;
                    this.field1886[this.field1916] = var10.field1886[var11] + this.field1879;
                    this.field1887[this.field1916] = var10.field1887[var11];
                    this.field1877[this.field1916] = var10.field1877[var11];
                    this.field1889[this.field1916] = var10.field1889[var11];
                    if (var3) {
                        if (var10.field1890 == null) {
                            this.field1890[this.field1916] = var10.field1920;
                        } else {
                            this.field1890[this.field1916] = var10.field1890[var11];
                        }
                    }
                    if (var4 && var10.field1917 != null) {
                        this.field1917[this.field1916] = var10.field1917[var11];
                    }
                    if (var5) {
                        if (var10.field1893 == null) {
                            this.field1893[this.field1916] = -1;
                        } else {
                            this.field1893[this.field1916] = var10.field1893[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1880 == null || var10.field1880[var11] == -1) {
                            this.field1880[this.field1916] = -1;
                        } else {
                            this.field1880[this.field1916] = (byte) (var10.field1880[var11] + this.field1895);
                        }
                    }
                    this.field1916++;
                }
                for (int var12 = 0; var12 < var10.field1895; var12++) {
                    this.field1896[this.field1895] = var10.field1896[var12] + this.field1879;
                    this.field1926[this.field1895] = var10.field1926[var12] + this.field1879;
                    this.field1928[this.field1895] = var10.field1928[var12] + this.field1879;
                    this.field1895++;
                }
                for (int var13 = 0; var13 < var10.field1879; var13++) {
                    this.field1938[this.field1879] = var10.field1938[var13];
                    this.field1883[this.field1879] = var10.field1883[var13];
                    this.field1881[this.field1879] = var10.field1881[var13];
                    this.field1879++;
                }
            }
        }
    }

    @ObfuscatedName("ds.e([[IIIIZI)Lds;")
    public class109 method2244(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2248();
        int var7 = arg1 - this.field1904;
        int var8 = this.field1904 + arg1;
        int var9 = arg3 - this.field1904;
        int var10 = this.field1904 + arg3;
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
            var15.field1879 = this.field1879;
            var15.field1916 = this.field1916;
            var15.field1895 = this.field1895;
            var15.field1938 = this.field1938;
            var15.field1881 = this.field1881;
            var15.field1875 = this.field1875;
            var15.field1885 = this.field1885;
            var15.field1886 = this.field1886;
            var15.field1887 = this.field1887;
            var15.field1877 = this.field1877;
            var15.field1889 = this.field1889;
            var15.field1890 = this.field1890;
            var15.field1917 = this.field1917;
            var15.field1880 = this.field1880;
            var15.field1893 = this.field1893;
            var15.field1920 = this.field1920;
            var15.field1896 = this.field1896;
            var15.field1926 = this.field1926;
            var15.field1928 = this.field1928;
            var15.field1899 = this.field1899;
            var15.field1900 = this.field1900;
            var15.field1930 = this.field1930;
            var15.field1883 = new int[var15.field1879];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1879; var16++) {
                int var17 = this.field1938[var16] + arg1;
                int var18 = this.field1881[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1883[var16] = this.field1883[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1879; var26++) {
                int var27 = (-this.field1883[var26] << 16) / this.field1530;
                if (var27 < arg5) {
                    int var28 = this.field1938[var26] + arg1;
                    int var29 = this.field1881[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1883[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1883[var26];
                }
            }
        }
        var15.field1922 = 0;
        return var15;
    }

    @ObfuscatedName("ds.l(Z)Lds;")
    public class109 method2315(boolean arg0) {
        if (!arg0 && field1876.length < this.field1916) {
            field1876 = new byte[this.field1916 + 100];
        }
        return this.method2247(arg0, field1882, field1876);
    }

    @ObfuscatedName("ds.h(Z)Lds;")
    public class109 method2310(boolean arg0) {
        if (!arg0 && field1878.length < this.field1916) {
            field1878 = new byte[this.field1916 + 100];
        }
        return this.method2247(arg0, field1939, field1878);
    }

    @ObfuscatedName("ds.r(ZLds;[B)Lds;")
    public class109 method2247(boolean arg0, class109 arg1, byte[] arg2) {
        arg1.field1879 = this.field1879;
        arg1.field1916 = this.field1916;
        arg1.field1895 = this.field1895;
        if (arg1.field1938 == null || arg1.field1938.length < this.field1879) {
            arg1.field1938 = new int[this.field1879 + 100];
            arg1.field1883 = new int[this.field1879 + 100];
            arg1.field1881 = new int[this.field1879 + 100];
        }
        for (int var4 = 0; var4 < this.field1879; var4++) {
            arg1.field1938[var4] = this.field1938[var4];
            arg1.field1883[var4] = this.field1883[var4];
            arg1.field1881[var4] = this.field1881[var4];
        }
        if (arg0) {
            arg1.field1917 = this.field1917;
        } else {
            arg1.field1917 = arg2;
            if (this.field1917 == null) {
                for (int var5 = 0; var5 < this.field1916; var5++) {
                    arg1.field1917[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1916; var6++) {
                    arg1.field1917[var6] = this.field1917[var6];
                }
            }
        }
        arg1.field1875 = this.field1875;
        arg1.field1885 = this.field1885;
        arg1.field1886 = this.field1886;
        arg1.field1887 = this.field1887;
        arg1.field1877 = this.field1877;
        arg1.field1889 = this.field1889;
        arg1.field1890 = this.field1890;
        arg1.field1880 = this.field1880;
        arg1.field1893 = this.field1893;
        arg1.field1920 = this.field1920;
        arg1.field1896 = this.field1896;
        arg1.field1926 = this.field1926;
        arg1.field1928 = this.field1928;
        arg1.field1899 = this.field1899;
        arg1.field1900 = this.field1900;
        arg1.field1930 = this.field1930;
        arg1.field1922 = 0;
        return arg1;
    }

    @ObfuscatedName("ds.a()V")
    public void method2248() {
        if (this.field1922 == 1) {
            return;
        }
        this.field1922 = 1;
        this.field1530 = 0;
        this.field1892 = 0;
        this.field1904 = 0;
        for (int var1 = 0; var1 < this.field1879; var1++) {
            int var2 = this.field1938[var1];
            int var3 = this.field1883[var1];
            int var4 = this.field1881[var1];
            if (-var3 > this.field1530) {
                this.field1530 = -var3;
            }
            if (var3 > this.field1892) {
                this.field1892 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1904) {
                this.field1904 = var5;
            }
        }
        this.field1904 = (int) (Math.sqrt((double) this.field1904) + 0.99D);
        this.field1906 = (int) (Math.sqrt((double) (this.field1530 * this.field1530 + this.field1904 * this.field1904)) + 0.99D);
        this.field1905 = this.field1906 + (int) (Math.sqrt((double) (this.field1904 * this.field1904 + this.field1892 * this.field1892)) + 0.99D);
    }

    @ObfuscatedName("ds.b()V")
    public void method2249() {
        if (this.field1922 == 2) {
            return;
        }
        this.field1922 = 2;
        this.field1904 = 0;
        for (int var1 = 0; var1 < this.field1879; var1++) {
            int var2 = this.field1938[var1];
            int var3 = this.field1883[var1];
            int var4 = this.field1881[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1904) {
                this.field1904 = var5;
            }
        }
        this.field1904 = (int) (Math.sqrt((double) this.field1904) + 0.99D);
        this.field1906 = this.field1904;
        this.field1905 = this.field1904 + this.field1904;
    }

    @ObfuscatedName("ds.u()I")
    public int method2243() {
        this.method2248();
        return this.field1904;
    }

    @ObfuscatedName("ds.o(Ldn;I)V")
    public void method2251(class107 arg0, int arg1) {
        if (this.field1899 == null || arg1 == -1) {
            return;
        }
        class92 var3 = arg0.field1849[arg1];
        class106 var4 = var3.field1610;
        Statics.field1927 = 0;
        Statics.field1898 = 0;
        Statics.field1929 = 0;
        for (int var5 = 0; var5 < var3.field1612; var5++) {
            int var6 = var3.field1606[var5];
            this.method2253(var4.field1844[var6], var4.field1839[var6], var3.field1613[var5], var3.field1614[var5], var3.field1615[var5]);
        }
        this.field1922 = 0;
    }

    @ObfuscatedName("ds.p(Ldn;ILdn;I[I)V")
    public void method2252(class107 arg0, int arg1, class107 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2251(arg0, arg1);
            return;
        }
        class92 var6 = arg0.field1849[arg1];
        class92 var7 = arg2.field1849[arg3];
        class106 var8 = var6.field1610;
        Statics.field1927 = 0;
        Statics.field1898 = 0;
        Statics.field1929 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1612; var11++) {
            int var12 = var6.field1606[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1844[var12] == 0) {
                this.method2253(var8.field1844[var12], var8.field1839[var12], var6.field1613[var11], var6.field1614[var11], var6.field1615[var11]);
            }
        }
        Statics.field1927 = 0;
        Statics.field1898 = 0;
        Statics.field1929 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1612; var15++) {
            int var16 = var7.field1606[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1844[var16] == 0) {
                this.method2253(var8.field1844[var16], var8.field1839[var16], var7.field1613[var15], var7.field1614[var15], var7.field1615[var15]);
            }
        }
        this.field1922 = 0;
    }

    @ObfuscatedName("ds.w(I[IIII)V")
    public void method2253(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1927 = 0;
            Statics.field1898 = 0;
            Statics.field1929 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1899.length) {
                    int[] var10 = this.field1899[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1927 += this.field1938[var12];
                        Statics.field1898 += this.field1883[var12];
                        Statics.field1929 += this.field1881[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1927 = Statics.field1927 / var7 + arg2;
                Statics.field1898 = Statics.field1898 / var7 + arg3;
                Statics.field1929 = Statics.field1929 / var7 + arg4;
            } else {
                Statics.field1927 = arg2;
                Statics.field1898 = arg3;
                Statics.field1929 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1899.length) {
                    int[] var15 = this.field1899[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1938[var17] += arg2;
                        this.field1883[var17] += arg3;
                        this.field1881[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1899.length) {
                    int[] var20 = this.field1899[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1938[var22] -= Statics.field1927;
                        this.field1883[var22] -= Statics.field1898;
                        this.field1881[var22] -= Statics.field1929;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1935[var25];
                            int var27 = field1901[var25];
                            int var28 = this.field1938[var22] * var27 + this.field1883[var22] * var26 >> 16;
                            this.field1883[var22] = this.field1883[var22] * var27 - this.field1938[var22] * var26 >> 16;
                            this.field1938[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1935[var23];
                            int var30 = field1901[var23];
                            int var31 = this.field1883[var22] * var30 - this.field1881[var22] * var29 >> 16;
                            this.field1881[var22] = this.field1883[var22] * var29 + this.field1881[var22] * var30 >> 16;
                            this.field1883[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1935[var24];
                            int var33 = field1901[var24];
                            int var34 = this.field1938[var22] * var33 + this.field1881[var22] * var32 >> 16;
                            this.field1881[var22] = this.field1881[var22] * var33 - this.field1938[var22] * var32 >> 16;
                            this.field1938[var22] = var34;
                        }
                        this.field1938[var22] += Statics.field1927;
                        this.field1883[var22] += Statics.field1898;
                        this.field1881[var22] += Statics.field1929;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1899.length) {
                    int[] var37 = this.field1899[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1938[var39] -= Statics.field1927;
                        this.field1883[var39] -= Statics.field1898;
                        this.field1881[var39] -= Statics.field1929;
                        this.field1938[var39] = this.field1938[var39] * arg2 / 128;
                        this.field1883[var39] = this.field1883[var39] * arg3 / 128;
                        this.field1881[var39] = this.field1881[var39] * arg4 / 128;
                        this.field1938[var39] += Statics.field1927;
                        this.field1883[var39] += Statics.field1898;
                        this.field1881[var39] += Statics.field1929;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1900 != null && this.field1917 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1900.length) {
                    int[] var42 = this.field1900[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1917[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1917[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ds.x()V")
    public void method2254() {
        for (int var1 = 0; var1 < this.field1879; var1++) {
            int var2 = this.field1938[var1];
            this.field1938[var1] = this.field1881[var1];
            this.field1881[var1] = -var2;
        }
        this.field1922 = 0;
    }

    @ObfuscatedName("ds.f()V")
    public void method2255() {
        for (int var1 = 0; var1 < this.field1879; var1++) {
            this.field1938[var1] = -this.field1938[var1];
            this.field1881[var1] = -this.field1881[var1];
        }
        this.field1922 = 0;
    }

    @ObfuscatedName("ds.t()V")
    public void method2256() {
        for (int var1 = 0; var1 < this.field1879; var1++) {
            int var2 = this.field1881[var1];
            this.field1881[var1] = this.field1938[var1];
            this.field1938[var1] = -var2;
        }
        this.field1922 = 0;
    }

    @ObfuscatedName("ds.z(I)V")
    public void method2265(int arg0) {
        int var2 = field1935[arg0];
        int var3 = field1901[arg0];
        for (int var4 = 0; var4 < this.field1879; var4++) {
            int var5 = this.field1883[var4] * var3 - this.field1881[var4] * var2 >> 16;
            this.field1881[var4] = this.field1883[var4] * var2 + this.field1881[var4] * var3 >> 16;
            this.field1883[var4] = var5;
        }
        this.field1922 = 0;
    }

    @ObfuscatedName("ds.y(III)V")
    public void method2257(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1879; var4++) {
            this.field1938[var4] += arg0;
            this.field1883[var4] += arg1;
            this.field1881[var4] += arg2;
        }
        this.field1922 = 0;
    }

    @ObfuscatedName("ds.m(III)V")
    public void method2268(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1879; var4++) {
            this.field1938[var4] = this.field1938[var4] * arg0 / 128;
            this.field1883[var4] = this.field1883[var4] * arg1 / 128;
            this.field1881[var4] = this.field1881[var4] * arg2 / 128;
        }
        this.field1922 = 0;
    }

    @ObfuscatedName("ds.v(IIIIIII)V")
    public final void method2286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1923[0] = -1;
        if (this.field1922 != 2 && this.field1922 != 1) {
            this.method2249();
        }
        int var8 = Statics.field1643;
        int var9 = Statics.field1649;
        int var10 = field1935[arg0];
        int var11 = field1901[arg0];
        int var12 = field1935[arg1];
        int var13 = field1901[arg1];
        int var14 = field1935[arg2];
        int var15 = field1901[arg2];
        int var16 = field1935[arg3];
        int var17 = field1901[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1879; var19++) {
            int var20 = this.field1938[var19];
            int var21 = this.field1883[var19];
            int var22 = this.field1881[var19];
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
            field1912[var19] = var30 - var18;
            field1910[var19] = class95.field1642 * var26 / var30 + var8;
            field1911[var19] = class95.field1642 * var29 / var30 + var9;
            if (this.field1895 > 0) {
                field1913[var19] = var26;
                field1891[var19] = var29;
                field1915[var19] = var30;
            }
        }
        try {
            this.method2261(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ds.k(IIIIIIII)V")
    public final void method2280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1923[0] = -1;
        if (this.field1922 != 2 && this.field1922 != 1) {
            this.method2249();
        }
        int var9 = Statics.field1643;
        int var10 = Statics.field1649;
        int var11 = field1935[arg0];
        int var12 = field1901[arg0];
        int var13 = field1935[arg1];
        int var14 = field1901[arg1];
        int var15 = field1935[arg2];
        int var16 = field1901[arg2];
        int var17 = field1935[arg3];
        int var18 = field1901[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1879; var20++) {
            int var21 = this.field1938[var20];
            int var22 = this.field1883[var20];
            int var23 = this.field1881[var20];
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
            field1912[var20] = var31 - var19;
            field1910[var20] = class95.field1642 * var27 / arg7 + var9;
            field1911[var20] = class95.field1642 * var30 / arg7 + var10;
            if (this.field1895 > 0) {
                field1913[var20] = var27;
                field1891[var20] = var30;
                field1915[var20] = var31;
            }
        }
        try {
            this.method2261(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ds.af(IIIIIIIII)V")
    public void method1881(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1923[0] = -1;
        if (this.field1922 != 1) {
            this.method2248();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1904 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1904) * class95.field1642;
        if (var15 / var13 >= Statics.field1648) {
            return;
        }
        int var16 = (this.field1904 + var14) * class95.field1642;
        if (var16 / var13 <= Statics.field1646) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1904 * arg1 >> 16;
        int var19 = (var17 + var18) * class95.field1642;
        if (var19 / var13 <= Statics.field1657) {
            return;
        }
        int var20 = (this.field1530 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class95.field1642;
        if (var21 / var13 >= Statics.field1650) {
            return;
        }
        int var22 = (this.field1530 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1895 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1914) {
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
            int var32 = field1931 - Statics.field1643;
            int var33 = field1932 - Statics.field1649;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1930) {
                    field1934[field1933++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1643;
        int var35 = Statics.field1649;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1935[arg0];
            var37 = field1901[arg0];
        }
        for (int var38 = 0; var38 < this.field1879; var38++) {
            int var39 = this.field1938[var38];
            int var40 = this.field1883[var38];
            int var41 = this.field1881[var38];
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
            field1912[var38] = var50 - var11;
            if (var50 >= 50) {
                field1910[var38] = class95.field1642 * var46 / var50 + var34;
                field1911[var38] = class95.field1642 * var49 / var50 + var35;
            } else {
                field1910[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1913[var38] = var46;
                field1891[var38] = var49;
                field1915[var38] = var50;
            }
        }
        try {
            this.method2261(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("ds.n(ZZI)V")
    public final void method2261(boolean arg0, boolean arg1, int arg2) {
        if (this.field1905 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1905; var4++) {
            field1923[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1916; var5++) {
            if (this.field1889[var5] != -2) {
                int var6 = this.field1875[var5];
                int var7 = this.field1885[var5];
                int var8 = this.field1886[var5];
                int var9 = field1910[var6];
                int var10 = field1910[var7];
                int var11 = field1910[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1913[var6];
                    int var13 = field1913[var7];
                    int var14 = field1913[var8];
                    int var15 = field1891[var6];
                    int var16 = field1891[var7];
                    int var17 = field1891[var8];
                    int var18 = field1915[var6];
                    int var19 = field1915[var7];
                    int var20 = field1915[var8];
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
                        field1909[var5] = true;
                        int var30 = (field1912[var6] + field1912[var7] + field1912[var8]) / 3 + this.field1906;
                        field1918[var30][field1923[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2294(field1931, field1932, field1911[var6], field1911[var7], field1911[var8], var9, var10, var11)) {
                        field1934[field1933++] = arg2;
                        arg1 = false;
                    }
                    if ((field1911[var8] - field1911[var7]) * (var9 - var10) - (field1911[var6] - field1911[var7]) * (var11 - var10) > 0) {
                        field1909[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1645 && var10 <= Statics.field1645 && var11 <= Statics.field1645) {
                            field1908[var5] = false;
                        } else {
                            field1908[var5] = true;
                        }
                        int var31 = (field1912[var6] + field1912[var7] + field1912[var8]) / 3 + this.field1906;
                        field1918[var31][field1923[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1890 == null) {
            for (int var32 = this.field1905 - 1; var32 >= 0; var32--) {
                int var33 = field1923[var32];
                if (var33 > 0) {
                    int[] var34 = field1918[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2262(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1919[var36] = 0;
            field1884[var36] = 0;
        }
        for (int var37 = this.field1905 - 1; var37 >= 0; var37--) {
            int var38 = field1923[var37];
            if (var38 > 0) {
                int[] var39 = field1918[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1890[var41];
                    int var43 = field1919[var42]++;
                    field1902[var42][var43] = var41;
                    if (var42 < 10) {
                        field1884[var42] += var37;
                    } else if (var42 == 10) {
                        field1921[var43] = var37;
                    } else {
                        field1903[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1919[1] > 0 || field1919[2] > 0) {
            var44 = (field1884[1] + field1884[2]) / (field1919[1] + field1919[2]);
        }
        int var45 = 0;
        if (field1919[3] > 0 || field1919[4] > 0) {
            var45 = (field1884[3] + field1884[4]) / (field1919[3] + field1919[4]);
        }
        int var46 = 0;
        if (field1919[6] > 0 || field1919[8] > 0) {
            var46 = (field1884[6] + field1884[8]) / (field1919[6] + field1919[8]);
        }
        int var47 = 0;
        int var48 = field1919[10];
        int[] var49 = field1902[10];
        int[] var50 = field1921;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1919[11];
            var49 = field1902[11];
            var50 = field1903;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2262(var49[var47++]);
                if (var47 == var48 && field1902[11] != var49) {
                    var47 = 0;
                    var48 = field1919[11];
                    var49 = field1902[11];
                    var50 = field1903;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2262(var49[var47++]);
                if (var47 == var48 && field1902[11] != var49) {
                    var47 = 0;
                    var48 = field1919[11];
                    var49 = field1902[11];
                    var50 = field1903;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2262(var49[var47++]);
                if (var47 == var48 && field1902[11] != var49) {
                    var47 = 0;
                    var48 = field1919[11];
                    var49 = field1902[11];
                    var50 = field1903;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1919[var52];
            int[] var54 = field1902[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2262(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2262(var49[var47++]);
            if (var47 == var48 && field1902[11] != var49) {
                var47 = 0;
                var49 = field1902[11];
                var48 = field1919[11];
                var50 = field1903;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("ds.d(I)V")
    public final void method2262(int arg0) {
        if (field1909[arg0]) {
            this.method2263(arg0);
            return;
        }
        int var2 = this.field1875[arg0];
        int var3 = this.field1885[arg0];
        int var4 = this.field1886[arg0];
        class95.field1633 = field1908[arg0];
        if (this.field1917 == null) {
            class95.field1637 = 0;
        } else {
            class95.field1637 = this.field1917[arg0] & 0xFF;
        }
        if (this.field1893 != null && this.field1893[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1880 == null || this.field1880[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1880[arg0] & 0xFF;
                var6 = this.field1896[var5];
                var7 = this.field1926[var5];
                var8 = this.field1928[var5];
            }
            if (this.field1889[arg0] == -1) {
                class95.method2075(field1911[var2], field1911[var3], field1911[var4], field1910[var2], field1910[var3], field1910[var4], this.field1887[arg0], this.field1887[arg0], this.field1887[arg0], field1913[var6], field1913[var7], field1913[var8], field1891[var6], field1891[var7], field1891[var8], field1915[var6], field1915[var7], field1915[var8], this.field1893[arg0]);
            } else {
                class95.method2075(field1911[var2], field1911[var3], field1911[var4], field1910[var2], field1910[var3], field1910[var4], this.field1887[arg0], this.field1877[arg0], this.field1889[arg0], field1913[var6], field1913[var7], field1913[var8], field1891[var6], field1891[var7], field1891[var8], field1915[var6], field1915[var7], field1915[var8], this.field1893[arg0]);
            }
        } else if (this.field1889[arg0] == -1) {
            class95.method2074(field1911[var2], field1911[var3], field1911[var4], field1910[var2], field1910[var3], field1910[var4], field1937[this.field1887[arg0]]);
        } else {
            class95.method2072(field1911[var2], field1911[var3], field1911[var4], field1910[var2], field1910[var3], field1910[var4], this.field1887[arg0], this.field1877[arg0], this.field1889[arg0]);
        }
    }

    @ObfuscatedName("ds.s(I)V")
    public final void method2263(int arg0) {
        int var2 = Statics.field1643;
        int var3 = Statics.field1649;
        int var4 = 0;
        int var5 = this.field1875[arg0];
        int var6 = this.field1885[arg0];
        int var7 = this.field1886[arg0];
        int var8 = field1915[var5];
        int var9 = field1915[var6];
        int var10 = field1915[var7];
        if (this.field1917 == null) {
            class95.field1637 = 0;
        } else {
            class95.field1637 = this.field1917[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1924[var4] = field1910[var5];
            field1897[var4] = field1911[var5];
            field1894[var4++] = this.field1887[arg0];
        } else {
            int var11 = field1913[var5];
            int var12 = field1891[var5];
            int var13 = this.field1887[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1936[var10 - var8];
                field1924[var4] = (((field1913[var7] - var11) * var14 >> 16) + var11) * class95.field1642 / 50 + var2;
                field1897[var4] = (((field1891[var7] - var12) * var14 >> 16) + var12) * class95.field1642 / 50 + var3;
                field1894[var4++] = ((this.field1889[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1936[var9 - var8];
                field1924[var4] = (((field1913[var6] - var11) * var15 >> 16) + var11) * class95.field1642 / 50 + var2;
                field1897[var4] = (((field1891[var6] - var12) * var15 >> 16) + var12) * class95.field1642 / 50 + var3;
                field1894[var4++] = ((this.field1877[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1924[var4] = field1910[var6];
            field1897[var4] = field1911[var6];
            field1894[var4++] = this.field1877[arg0];
        } else {
            int var16 = field1913[var6];
            int var17 = field1891[var6];
            int var18 = this.field1877[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1936[var8 - var9];
                field1924[var4] = (((field1913[var5] - var16) * var19 >> 16) + var16) * class95.field1642 / 50 + var2;
                field1897[var4] = (((field1891[var5] - var17) * var19 >> 16) + var17) * class95.field1642 / 50 + var3;
                field1894[var4++] = ((this.field1887[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1936[var10 - var9];
                field1924[var4] = (((field1913[var7] - var16) * var20 >> 16) + var16) * class95.field1642 / 50 + var2;
                field1897[var4] = (((field1891[var7] - var17) * var20 >> 16) + var17) * class95.field1642 / 50 + var3;
                field1894[var4++] = ((this.field1889[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1924[var4] = field1910[var7];
            field1897[var4] = field1911[var7];
            field1894[var4++] = this.field1889[arg0];
        } else {
            int var21 = field1913[var7];
            int var22 = field1891[var7];
            int var23 = this.field1889[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1936[var9 - var10];
                field1924[var4] = (((field1913[var6] - var21) * var24 >> 16) + var21) * class95.field1642 / 50 + var2;
                field1897[var4] = (((field1891[var6] - var22) * var24 >> 16) + var22) * class95.field1642 / 50 + var3;
                field1894[var4++] = ((this.field1877[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1936[var8 - var10];
                field1924[var4] = (((field1913[var5] - var21) * var25 >> 16) + var21) * class95.field1642 / 50 + var2;
                field1897[var4] = (((field1891[var5] - var22) * var25 >> 16) + var22) * class95.field1642 / 50 + var3;
                field1894[var4++] = ((this.field1887[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1924[0];
        int var27 = field1924[1];
        int var28 = field1924[2];
        int var29 = field1897[0];
        int var30 = field1897[1];
        int var31 = field1897[2];
        class95.field1633 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1645 || var27 > Statics.field1645 || var28 > Statics.field1645) {
                class95.field1633 = true;
            }
            if (this.field1893 != null && this.field1893[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1880 == null || this.field1880[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1880[arg0] & 0xFF;
                    var33 = this.field1896[var32];
                    var34 = this.field1926[var32];
                    var35 = this.field1928[var32];
                }
                if (this.field1889[arg0] == -1) {
                    class95.method2075(var29, var30, var31, var26, var27, var28, this.field1887[arg0], this.field1887[arg0], this.field1887[arg0], field1913[var33], field1913[var34], field1913[var35], field1891[var33], field1891[var34], field1891[var35], field1915[var33], field1915[var34], field1915[var35], this.field1893[arg0]);
                } else {
                    class95.method2075(var29, var30, var31, var26, var27, var28, field1894[0], field1894[1], field1894[2], field1913[var33], field1913[var34], field1913[var35], field1891[var33], field1891[var34], field1891[var35], field1915[var33], field1915[var34], field1915[var35], this.field1893[arg0]);
                }
            } else if (this.field1889[arg0] == -1) {
                class95.method2074(var29, var30, var31, var26, var27, var28, field1937[this.field1887[arg0]]);
            } else {
                class95.method2072(var29, var30, var31, var26, var27, var28, field1894[0], field1894[1], field1894[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1645 || var27 > Statics.field1645 || var28 > Statics.field1645 || field1924[3] < 0 || field1924[3] > Statics.field1645) {
            class95.field1633 = true;
        }
        if (this.field1893 != null && this.field1893[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1880 == null || this.field1880[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1880[arg0] & 0xFF;
                var37 = this.field1896[var36];
                var38 = this.field1926[var36];
                var39 = this.field1928[var36];
            }
            short var40 = this.field1893[arg0];
            if (this.field1889[arg0] == -1) {
                class95.method2075(var29, var30, var31, var26, var27, var28, this.field1887[arg0], this.field1887[arg0], this.field1887[arg0], field1913[var37], field1913[var38], field1913[var39], field1891[var37], field1891[var38], field1891[var39], field1915[var37], field1915[var38], field1915[var39], var40);
                class95.method2075(var29, var31, field1897[3], var26, var28, field1924[3], this.field1887[arg0], this.field1887[arg0], this.field1887[arg0], field1913[var37], field1913[var38], field1913[var39], field1891[var37], field1891[var38], field1891[var39], field1915[var37], field1915[var38], field1915[var39], var40);
            } else {
                class95.method2075(var29, var30, var31, var26, var27, var28, field1894[0], field1894[1], field1894[2], field1913[var37], field1913[var38], field1913[var39], field1891[var37], field1891[var38], field1891[var39], field1915[var37], field1915[var38], field1915[var39], var40);
                class95.method2075(var29, var31, field1897[3], var26, var28, field1924[3], field1894[0], field1894[2], field1894[3], field1913[var37], field1913[var38], field1913[var39], field1891[var37], field1891[var38], field1891[var39], field1915[var37], field1915[var38], field1915[var39], var40);
            }
        } else if (this.field1889[arg0] == -1) {
            int var41 = field1937[this.field1887[arg0]];
            class95.method2074(var29, var30, var31, var26, var27, var28, var41);
            class95.method2074(var29, var31, field1897[3], var26, var28, field1924[3], var41);
        } else {
            class95.method2072(var29, var30, var31, var26, var27, var28, field1894[0], field1894[1], field1894[2]);
            class95.method2072(var29, var31, field1897[3], var26, var28, field1924[3], field1894[0], field1894[2], field1894[3]);
        }
    }

    @ObfuscatedName("ds.ah(IIIIIIII)Z")
    public final boolean method2294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
