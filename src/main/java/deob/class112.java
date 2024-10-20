package deob;

@ObfuscatedName("dl")
public class class112 extends class94 {

    @ObfuscatedName("dl.c")
    public static class112 field1909 = new class112();

    @ObfuscatedName("dl.q")
    public static byte[] field1913 = new byte[1];

    @ObfuscatedName("dl.y")
    public static class112 field1870 = new class112();

    @ObfuscatedName("dl.v")
    public static byte[] field1871 = new byte[1];

    @ObfuscatedName("dl.g")
    public int field1872 = 0;

    @ObfuscatedName("dl.x")
    public int[] field1873;

    @ObfuscatedName("dl.u")
    public int[] field1893;

    @ObfuscatedName("dl.l")
    public int[] field1875;

    @ObfuscatedName("dl.a")
    public int field1876 = 0;

    @ObfuscatedName("dl.h")
    public int[] field1906;

    @ObfuscatedName("dl.t")
    public int[] field1878;

    @ObfuscatedName("dl.m")
    public int[] field1879;

    @ObfuscatedName("dl.s")
    public int[] field1881;

    @ObfuscatedName("dl.j")
    public int[] field1927;

    @ObfuscatedName("dl.b")
    public int[] field1882;

    @ObfuscatedName("dl.n")
    public byte[] field1883;

    @ObfuscatedName("dl.z")
    public byte[] field1884;

    @ObfuscatedName("dl.d")
    public byte[] field1885;

    @ObfuscatedName("dl.f")
    public short[] field1874;

    @ObfuscatedName("dl.o")
    public byte field1887 = 0;

    @ObfuscatedName("dl.r")
    public int field1891 = 0;

    @ObfuscatedName("dl.k")
    public int[] field1889;

    @ObfuscatedName("dl.w")
    public int[] field1890;

    @ObfuscatedName("dl.e")
    public int[] field1925;

    @ObfuscatedName("dl.p")
    public int[][] field1892;

    @ObfuscatedName("dl.i")
    public int[][] field1895;

    @ObfuscatedName("dl.ap")
    public boolean field1919 = false;

    @ObfuscatedName("dl.as")
    public int field1921;

    @ObfuscatedName("dl.ak")
    public int field1896;

    @ObfuscatedName("dl.af")
    public int field1897;

    @ObfuscatedName("dl.ag")
    public int field1898;

    @ObfuscatedName("dl.aj")
    public int field1901;

    @ObfuscatedName("dl.an")
    public static boolean[] field1888 = new boolean[4096];

    @ObfuscatedName("dl.ad")
    public static boolean[] field1902 = new boolean[4096];

    @ObfuscatedName("dl.ai")
    public static int[] field1903 = new int[4096];

    @ObfuscatedName("dl.ae")
    public static int[] field1880 = new int[4096];

    @ObfuscatedName("dl.au")
    public static int[] field1905 = new int[4096];

    @ObfuscatedName("dl.at")
    public static int[] field1886 = new int[4096];

    @ObfuscatedName("dl.ax")
    public static int[] field1907 = new int[4096];

    @ObfuscatedName("dl.aq")
    public static int[] field1908 = new int[4096];

    @ObfuscatedName("dl.ao")
    public static int[] field1929 = new int[1600];

    @ObfuscatedName("dl.aa")
    public static int[][] field1904 = new int[1600][512];

    @ObfuscatedName("dl.ah")
    public static int[] field1912 = new int[12];

    @ObfuscatedName("dl.av")
    public static int[][] field1877 = new int[12][2000];

    @ObfuscatedName("dl.am")
    public static int[] field1914 = new int[2000];

    @ObfuscatedName("dl.ab")
    public static int[] field1894 = new int[2000];

    @ObfuscatedName("dl.az")
    public static int[] field1911 = new int[12];

    @ObfuscatedName("dl.al")
    public static int[] field1917 = new int[10];

    @ObfuscatedName("dl.ar")
    public static int[] field1918 = new int[10];

    @ObfuscatedName("dl.ay")
    public static int[] field1916 = new int[10];

    @ObfuscatedName("dl.bl")
    public static boolean field1923 = false;

    @ObfuscatedName("dl.bd")
    public static int field1924 = 0;

    @ObfuscatedName("dl.bm")
    public static int field1868 = 0;

    @ObfuscatedName("dl.ba")
    public static int field1926 = 0;

    @ObfuscatedName("dl.bu")
    public static int[] field1931 = new int[1000];

    @ObfuscatedName("dl.bb")
    public static int[] field1928 = class104.field1776;

    @ObfuscatedName("dl.by")
    public static int[] field1915 = class104.field1789;

    @ObfuscatedName("dl.bo")
    public static int[] field1930 = class104.field1785;

    @ObfuscatedName("dl.bg")
    public static int[] field1922 = class104.field1788;

    public class112() {
    }

    public class112(class112[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1872 = 0;
        this.field1876 = 0;
        this.field1891 = 0;
        this.field1887 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class112 var8 = arg0[var7];
            if (var8 != null) {
                this.field1872 += var8.field1872;
                this.field1876 += var8.field1876;
                this.field1891 += var8.field1891;
                if (var8.field1883 == null) {
                    if (this.field1887 == -1) {
                        this.field1887 = var8.field1887;
                    }
                    if (this.field1887 != var8.field1887) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1884 != null;
                var5 |= var8.field1874 != null;
                var6 |= var8.field1885 != null;
            }
        }
        this.field1873 = new int[this.field1872];
        this.field1893 = new int[this.field1872];
        this.field1875 = new int[this.field1872];
        this.field1906 = new int[this.field1876];
        this.field1878 = new int[this.field1876];
        this.field1879 = new int[this.field1876];
        this.field1881 = new int[this.field1876];
        this.field1927 = new int[this.field1876];
        this.field1882 = new int[this.field1876];
        if (var3) {
            this.field1883 = new byte[this.field1876];
        }
        if (var4) {
            this.field1884 = new byte[this.field1876];
        }
        if (var5) {
            this.field1874 = new short[this.field1876];
        }
        if (var6) {
            this.field1885 = new byte[this.field1876];
        }
        if (this.field1891 > 0) {
            this.field1889 = new int[this.field1891];
            this.field1890 = new int[this.field1891];
            this.field1925 = new int[this.field1891];
        }
        this.field1872 = 0;
        this.field1876 = 0;
        this.field1891 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class112 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1876; var11++) {
                    this.field1906[this.field1876] = var10.field1906[var11] + this.field1872;
                    this.field1878[this.field1876] = var10.field1878[var11] + this.field1872;
                    this.field1879[this.field1876] = var10.field1879[var11] + this.field1872;
                    this.field1881[this.field1876] = var10.field1881[var11];
                    this.field1927[this.field1876] = var10.field1927[var11];
                    this.field1882[this.field1876] = var10.field1882[var11];
                    if (var3) {
                        if (var10.field1883 == null) {
                            this.field1883[this.field1876] = var10.field1887;
                        } else {
                            this.field1883[this.field1876] = var10.field1883[var11];
                        }
                    }
                    if (var4 && var10.field1884 != null) {
                        this.field1884[this.field1876] = var10.field1884[var11];
                    }
                    if (var5) {
                        if (var10.field1874 == null) {
                            this.field1874[this.field1876] = -1;
                        } else {
                            this.field1874[this.field1876] = var10.field1874[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1885 == null || var10.field1885[var11] == -1) {
                            this.field1885[this.field1876] = -1;
                        } else {
                            this.field1885[this.field1876] = (byte) (var10.field1885[var11] + this.field1891);
                        }
                    }
                    this.field1876++;
                }
                for (int var12 = 0; var12 < var10.field1891; var12++) {
                    this.field1889[this.field1891] = var10.field1889[var12] + this.field1872;
                    this.field1890[this.field1891] = var10.field1890[var12] + this.field1872;
                    this.field1925[this.field1891] = var10.field1925[var12] + this.field1872;
                    this.field1891++;
                }
                for (int var13 = 0; var13 < var10.field1872; var13++) {
                    this.field1873[this.field1872] = var10.field1873[var13];
                    this.field1893[this.field1872] = var10.field1893[var13];
                    this.field1875[this.field1872] = var10.field1875[var13];
                    this.field1872++;
                }
            }
        }
    }

    @ObfuscatedName("dl.c([[IIIIZI)Ldl;")
    public class112 method2134(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2192();
        int var7 = arg1 - this.field1897;
        int var8 = this.field1897 + arg1;
        int var9 = arg3 - this.field1897;
        int var10 = this.field1897 + arg3;
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
            var15.field1872 = this.field1872;
            var15.field1876 = this.field1876;
            var15.field1891 = this.field1891;
            var15.field1873 = this.field1873;
            var15.field1875 = this.field1875;
            var15.field1906 = this.field1906;
            var15.field1878 = this.field1878;
            var15.field1879 = this.field1879;
            var15.field1881 = this.field1881;
            var15.field1927 = this.field1927;
            var15.field1882 = this.field1882;
            var15.field1883 = this.field1883;
            var15.field1884 = this.field1884;
            var15.field1885 = this.field1885;
            var15.field1874 = this.field1874;
            var15.field1887 = this.field1887;
            var15.field1889 = this.field1889;
            var15.field1890 = this.field1890;
            var15.field1925 = this.field1925;
            var15.field1892 = this.field1892;
            var15.field1895 = this.field1895;
            var15.field1919 = this.field1919;
            var15.field1893 = new int[var15.field1872];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1872; var16++) {
                int var17 = this.field1873[var16] + arg1;
                int var18 = this.field1875[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1893[var16] = this.field1893[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1872; var26++) {
                int var27 = (-this.field1893[var26] << 16) / this.field1569;
                if (var27 < arg5) {
                    int var28 = this.field1873[var26] + arg1;
                    int var29 = this.field1875[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1893[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1893[var26];
                }
            }
        }
        var15.field1921 = 0;
        return var15;
    }

    @ObfuscatedName("dl.y(Z)Ldl;")
    public class112 method2138(boolean arg0) {
        if (!arg0 && field1913.length < this.field1876) {
            field1913 = new byte[this.field1876 + 100];
        }
        return this.method2160(arg0, field1909, field1913);
    }

    @ObfuscatedName("dl.v(Z)Ldl;")
    public class112 method2136(boolean arg0) {
        if (!arg0 && field1871.length < this.field1876) {
            field1871 = new byte[this.field1876 + 100];
        }
        return this.method2160(arg0, field1870, field1871);
    }

    @ObfuscatedName("dl.g(ZLdl;[B)Ldl;")
    public class112 method2160(boolean arg0, class112 arg1, byte[] arg2) {
        arg1.field1872 = this.field1872;
        arg1.field1876 = this.field1876;
        arg1.field1891 = this.field1891;
        if (arg1.field1873 == null || arg1.field1873.length < this.field1872) {
            arg1.field1873 = new int[this.field1872 + 100];
            arg1.field1893 = new int[this.field1872 + 100];
            arg1.field1875 = new int[this.field1872 + 100];
        }
        for (int var4 = 0; var4 < this.field1872; var4++) {
            arg1.field1873[var4] = this.field1873[var4];
            arg1.field1893[var4] = this.field1893[var4];
            arg1.field1875[var4] = this.field1875[var4];
        }
        if (arg0) {
            arg1.field1884 = this.field1884;
        } else {
            arg1.field1884 = arg2;
            if (this.field1884 == null) {
                for (int var5 = 0; var5 < this.field1876; var5++) {
                    arg1.field1884[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1876; var6++) {
                    arg1.field1884[var6] = this.field1884[var6];
                }
            }
        }
        arg1.field1906 = this.field1906;
        arg1.field1878 = this.field1878;
        arg1.field1879 = this.field1879;
        arg1.field1881 = this.field1881;
        arg1.field1927 = this.field1927;
        arg1.field1882 = this.field1882;
        arg1.field1883 = this.field1883;
        arg1.field1885 = this.field1885;
        arg1.field1874 = this.field1874;
        arg1.field1887 = this.field1887;
        arg1.field1889 = this.field1889;
        arg1.field1890 = this.field1890;
        arg1.field1925 = this.field1925;
        arg1.field1892 = this.field1892;
        arg1.field1895 = this.field1895;
        arg1.field1919 = this.field1919;
        arg1.field1921 = 0;
        return arg1;
    }

    @ObfuscatedName("dl.x()V")
    public void method2192() {
        if (this.field1921 == 1) {
            return;
        }
        this.field1921 = 1;
        this.field1569 = 0;
        this.field1896 = 0;
        this.field1897 = 0;
        for (int var1 = 0; var1 < this.field1872; var1++) {
            int var2 = this.field1873[var1];
            int var3 = this.field1893[var1];
            int var4 = this.field1875[var1];
            if (-var3 > this.field1569) {
                this.field1569 = -var3;
            }
            if (var3 > this.field1896) {
                this.field1896 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1897) {
                this.field1897 = var5;
            }
        }
        this.field1897 = (int) (Math.sqrt((double) this.field1897) + 0.99D);
        this.field1901 = (int) (Math.sqrt((double) (this.field1569 * this.field1569 + this.field1897 * this.field1897)) + 0.99D);
        this.field1898 = this.field1901 + (int) (Math.sqrt((double) (this.field1897 * this.field1897 + this.field1896 * this.field1896)) + 0.99D);
    }

    @ObfuscatedName("dl.l()V")
    public void method2139() {
        if (this.field1921 == 2) {
            return;
        }
        this.field1921 = 2;
        this.field1897 = 0;
        for (int var1 = 0; var1 < this.field1872; var1++) {
            int var2 = this.field1873[var1];
            int var3 = this.field1893[var1];
            int var4 = this.field1875[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1897) {
                this.field1897 = var5;
            }
        }
        this.field1897 = (int) (Math.sqrt((double) this.field1897) + 0.99D);
        this.field1901 = this.field1897;
        this.field1898 = this.field1897 + this.field1897;
    }

    @ObfuscatedName("dl.a()I")
    public int method2140() {
        this.method2192();
        return this.field1897;
    }

    @ObfuscatedName("dl.h(Lda;I)V")
    public void method2141(class109 arg0, int arg1) {
        if (this.field1892 == null || arg1 == -1) {
            return;
        }
        class97 var3 = arg0.field1834[arg1];
        class105 var4 = var3.field1646;
        Statics.field1920 = 0;
        Statics.field1899 = 0;
        Statics.field1869 = 0;
        for (int var5 = 0; var5 < var3.field1651; var5++) {
            int var6 = var3.field1652[var5];
            this.method2143(var4.field1791[var6], var4.field1794[var6], var3.field1653[var5], var3.field1654[var5], var3.field1655[var5]);
        }
        this.field1921 = 0;
    }

    @ObfuscatedName("dl.t(Lda;ILda;I[I)V")
    public void method2163(class109 arg0, int arg1, class109 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2141(arg0, arg1);
            return;
        }
        class97 var6 = arg0.field1834[arg1];
        class97 var7 = arg2.field1834[arg3];
        class105 var8 = var6.field1646;
        Statics.field1920 = 0;
        Statics.field1899 = 0;
        Statics.field1869 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1651; var11++) {
            int var12 = var6.field1652[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1791[var12] == 0) {
                this.method2143(var8.field1791[var12], var8.field1794[var12], var6.field1653[var11], var6.field1654[var11], var6.field1655[var11]);
            }
        }
        Statics.field1920 = 0;
        Statics.field1899 = 0;
        Statics.field1869 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1651; var15++) {
            int var16 = var7.field1652[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1791[var16] == 0) {
                this.method2143(var8.field1791[var16], var8.field1794[var16], var7.field1653[var15], var7.field1654[var15], var7.field1655[var15]);
            }
        }
        this.field1921 = 0;
    }

    @ObfuscatedName("dl.m(I[IIII)V")
    public void method2143(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1920 = 0;
            Statics.field1899 = 0;
            Statics.field1869 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1892.length) {
                    int[] var10 = this.field1892[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1920 += this.field1873[var12];
                        Statics.field1899 += this.field1893[var12];
                        Statics.field1869 += this.field1875[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1920 = Statics.field1920 / var7 + arg2;
                Statics.field1899 = Statics.field1899 / var7 + arg3;
                Statics.field1869 = Statics.field1869 / var7 + arg4;
            } else {
                Statics.field1920 = arg2;
                Statics.field1899 = arg3;
                Statics.field1869 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1892.length) {
                    int[] var15 = this.field1892[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1873[var17] += arg2;
                        this.field1893[var17] += arg3;
                        this.field1875[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1892.length) {
                    int[] var20 = this.field1892[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1873[var22] -= Statics.field1920;
                        this.field1893[var22] -= Statics.field1899;
                        this.field1875[var22] -= Statics.field1869;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1928[var25];
                            int var27 = field1915[var25];
                            int var28 = this.field1893[var22] * var26 + this.field1873[var22] * var27 >> 16;
                            this.field1893[var22] = this.field1893[var22] * var27 - this.field1873[var22] * var26 >> 16;
                            this.field1873[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1928[var23];
                            int var30 = field1915[var23];
                            int var31 = this.field1893[var22] * var30 - this.field1875[var22] * var29 >> 16;
                            this.field1875[var22] = this.field1893[var22] * var29 + this.field1875[var22] * var30 >> 16;
                            this.field1893[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1928[var24];
                            int var33 = field1915[var24];
                            int var34 = this.field1875[var22] * var32 + this.field1873[var22] * var33 >> 16;
                            this.field1875[var22] = this.field1875[var22] * var33 - this.field1873[var22] * var32 >> 16;
                            this.field1873[var22] = var34;
                        }
                        this.field1873[var22] += Statics.field1920;
                        this.field1893[var22] += Statics.field1899;
                        this.field1875[var22] += Statics.field1869;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1892.length) {
                    int[] var37 = this.field1892[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1873[var39] -= Statics.field1920;
                        this.field1893[var39] -= Statics.field1899;
                        this.field1875[var39] -= Statics.field1869;
                        this.field1873[var39] = this.field1873[var39] * arg2 / 128;
                        this.field1893[var39] = this.field1893[var39] * arg3 / 128;
                        this.field1875[var39] = this.field1875[var39] * arg4 / 128;
                        this.field1873[var39] += Statics.field1920;
                        this.field1893[var39] += Statics.field1899;
                        this.field1875[var39] += Statics.field1869;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1895 != null && this.field1884 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1895.length) {
                    int[] var42 = this.field1895[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1884[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1884[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dl.s()V")
    public void method2144() {
        for (int var1 = 0; var1 < this.field1872; var1++) {
            int var2 = this.field1873[var1];
            this.field1873[var1] = this.field1875[var1];
            this.field1875[var1] = -var2;
        }
        this.field1921 = 0;
    }

    @ObfuscatedName("dl.j()V")
    public void method2145() {
        for (int var1 = 0; var1 < this.field1872; var1++) {
            this.field1873[var1] = -this.field1873[var1];
            this.field1875[var1] = -this.field1875[var1];
        }
        this.field1921 = 0;
    }

    @ObfuscatedName("dl.b()V")
    public void method2146() {
        for (int var1 = 0; var1 < this.field1872; var1++) {
            int var2 = this.field1875[var1];
            this.field1875[var1] = this.field1873[var1];
            this.field1873[var1] = -var2;
        }
        this.field1921 = 0;
    }

    @ObfuscatedName("dl.n(I)V")
    public void method2147(int arg0) {
        int var2 = field1928[arg0];
        int var3 = field1915[arg0];
        for (int var4 = 0; var4 < this.field1872; var4++) {
            int var5 = this.field1893[var4] * var3 - this.field1875[var4] * var2 >> 16;
            this.field1875[var4] = this.field1893[var4] * var2 + this.field1875[var4] * var3 >> 16;
            this.field1893[var4] = var5;
        }
        this.field1921 = 0;
    }

    @ObfuscatedName("dl.z(III)V")
    public void method2148(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1872; var4++) {
            this.field1873[var4] += arg0;
            this.field1893[var4] += arg1;
            this.field1875[var4] += arg2;
        }
        this.field1921 = 0;
    }

    @ObfuscatedName("dl.d(III)V")
    public void method2149(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1872; var4++) {
            this.field1873[var4] = this.field1873[var4] * arg0 / 128;
            this.field1893[var4] = this.field1893[var4] * arg1 / 128;
            this.field1875[var4] = this.field1875[var4] * arg2 / 128;
        }
        this.field1921 = 0;
    }

    @ObfuscatedName("dl.f(IIIIIII)V")
    public final void method2150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1929[0] = -1;
        if (this.field1921 != 2 && this.field1921 != 1) {
            this.method2139();
        }
        int var8 = Statics.field1768;
        int var9 = Statics.field1777;
        int var10 = field1928[arg0];
        int var11 = field1915[arg0];
        int var12 = field1928[arg1];
        int var13 = field1915[arg1];
        int var14 = field1928[arg2];
        int var15 = field1915[arg2];
        int var16 = field1928[arg3];
        int var17 = field1915[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1872; var19++) {
            int var20 = this.field1873[var19];
            int var21 = this.field1893[var19];
            int var22 = this.field1875[var19];
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
            field1905[var19] = var30 - var18;
            field1903[var19] = (var26 << 9) / var30 + var8;
            field1880[var19] = (var29 << 9) / var30 + var9;
            if (this.field1891 > 0) {
                field1886[var19] = var26;
                field1907[var19] = var29;
                field1908[var19] = var30;
            }
        }
        try {
            this.method2153(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dl.o(IIIIIIII)V")
    public final void method2151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1929[0] = -1;
        if (this.field1921 != 2 && this.field1921 != 1) {
            this.method2139();
        }
        int var9 = Statics.field1768;
        int var10 = Statics.field1777;
        int var11 = field1928[arg0];
        int var12 = field1915[arg0];
        int var13 = field1928[arg1];
        int var14 = field1915[arg1];
        int var15 = field1928[arg2];
        int var16 = field1915[arg2];
        int var17 = field1928[arg3];
        int var18 = field1915[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1872; var20++) {
            int var21 = this.field1873[var20];
            int var22 = this.field1893[var20];
            int var23 = this.field1875[var20];
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
            field1905[var20] = var31 - var19;
            field1903[var20] = (var27 << 9) / arg7 + var9;
            field1880[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1891 > 0) {
                field1886[var20] = var27;
                field1907[var20] = var30;
                field1908[var20] = var31;
            }
        }
        try {
            this.method2153(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dl.k(IIIIIIIII)V")
    public void method1781(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1929[0] = -1;
        if (this.field1921 != 1) {
            this.method2192();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1897 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1897 << 9;
        if (var15 / var13 >= Statics.field1790) {
            return;
        }
        int var16 = this.field1897 + var14 << 9;
        if (var16 / var13 <= Statics.field1766) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1897 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1782) {
            return;
        }
        int var20 = (this.field1569 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1783) {
            return;
        }
        int var22 = (this.field1569 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1891 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1923) {
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
            int var32 = field1924 - Statics.field1768;
            int var33 = field1868 - Statics.field1777;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1919) {
                    field1931[field1926++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1768;
        int var35 = Statics.field1777;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1928[arg0];
            var37 = field1915[arg0];
        }
        for (int var38 = 0; var38 < this.field1872; var38++) {
            int var39 = this.field1873[var38];
            int var40 = this.field1893[var38];
            int var41 = this.field1875[var38];
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
            field1905[var38] = var50 - var11;
            if (var50 >= 50) {
                field1903[var38] = (var46 << 9) / var50 + var34;
                field1880[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1903[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1886[var38] = var46;
                field1907[var38] = var49;
                field1908[var38] = var50;
            }
        }
        try {
            this.method2153(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dl.r(ZZI)V")
    public final void method2153(boolean arg0, boolean arg1, int arg2) {
        if (this.field1898 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1898; var4++) {
            field1929[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1876; var5++) {
            if (this.field1882[var5] != -2) {
                int var6 = this.field1906[var5];
                int var7 = this.field1878[var5];
                int var8 = this.field1879[var5];
                int var9 = field1903[var6];
                int var10 = field1903[var7];
                int var11 = field1903[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1886[var6];
                    int var13 = field1886[var7];
                    int var14 = field1886[var8];
                    int var15 = field1907[var6];
                    int var16 = field1907[var7];
                    int var17 = field1907[var8];
                    int var18 = field1908[var6];
                    int var19 = field1908[var7];
                    int var20 = field1908[var8];
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
                        field1902[var5] = true;
                        int var30 = (field1905[var6] + field1905[var7] + field1905[var8]) / 3 + this.field1901;
                        field1904[var30][field1929[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2156(field1924, field1868, field1880[var6], field1880[var7], field1880[var8], var9, var10, var11)) {
                        field1931[field1926++] = arg2;
                        arg1 = false;
                    }
                    if ((field1880[var8] - field1880[var7]) * (var9 - var10) - (field1880[var6] - field1880[var7]) * (var11 - var10) > 0) {
                        field1902[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1778 && var10 <= Statics.field1778 && var11 <= Statics.field1778) {
                            field1888[var5] = false;
                        } else {
                            field1888[var5] = true;
                        }
                        int var31 = (field1905[var6] + field1905[var7] + field1905[var8]) / 3 + this.field1901;
                        field1904[var31][field1929[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1883 == null) {
            for (int var32 = this.field1898 - 1; var32 >= 0; var32--) {
                int var33 = field1929[var32];
                if (var33 > 0) {
                    int[] var34 = field1904[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2154(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1912[var36] = 0;
            field1911[var36] = 0;
        }
        for (int var37 = this.field1898 - 1; var37 >= 0; var37--) {
            int var38 = field1929[var37];
            if (var38 > 0) {
                int[] var39 = field1904[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1883[var41];
                    int var43 = field1912[var42]++;
                    field1877[var42][var43] = var41;
                    if (var42 < 10) {
                        field1911[var42] += var37;
                    } else if (var42 == 10) {
                        field1914[var43] = var37;
                    } else {
                        field1894[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1912[1] > 0 || field1912[2] > 0) {
            var44 = (field1911[1] + field1911[2]) / (field1912[1] + field1912[2]);
        }
        int var45 = 0;
        if (field1912[3] > 0 || field1912[4] > 0) {
            var45 = (field1911[3] + field1911[4]) / (field1912[3] + field1912[4]);
        }
        int var46 = 0;
        if (field1912[6] > 0 || field1912[8] > 0) {
            var46 = (field1911[6] + field1911[8]) / (field1912[6] + field1912[8]);
        }
        int var47 = 0;
        int var48 = field1912[10];
        int[] var49 = field1877[10];
        int[] var50 = field1914;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1912[11];
            var49 = field1877[11];
            var50 = field1894;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2154(var49[var47++]);
                if (var47 == var48 && field1877[11] != var49) {
                    var47 = 0;
                    var48 = field1912[11];
                    var49 = field1877[11];
                    var50 = field1894;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2154(var49[var47++]);
                if (var47 == var48 && field1877[11] != var49) {
                    var47 = 0;
                    var48 = field1912[11];
                    var49 = field1877[11];
                    var50 = field1894;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2154(var49[var47++]);
                if (var47 == var48 && field1877[11] != var49) {
                    var47 = 0;
                    var48 = field1912[11];
                    var49 = field1877[11];
                    var50 = field1894;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1912[var52];
            int[] var54 = field1877[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2154(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2154(var49[var47++]);
            if (var47 == var48 && field1877[11] != var49) {
                var47 = 0;
                var49 = field1877[11];
                var48 = field1912[11];
                var50 = field1894;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dl.i(I)V")
    public final void method2154(int arg0) {
        if (field1902[arg0]) {
            this.method2132(arg0);
            return;
        }
        int var2 = this.field1906[arg0];
        int var3 = this.field1878[arg0];
        int var4 = this.field1879[arg0];
        class104.field1786 = field1888[arg0];
        if (this.field1884 == null) {
            class104.field1770 = 0;
        } else {
            class104.field1770 = this.field1884[arg0] & 0xFF;
        }
        if (this.field1874 != null && this.field1874[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1885 == null || this.field1885[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1885[arg0] & 0xFF;
                var6 = this.field1889[var5];
                var7 = this.field1890[var5];
                var8 = this.field1925[var5];
            }
            if (this.field1882[arg0] == -1) {
                class104.method2045(field1880[var2], field1880[var3], field1880[var4], field1903[var2], field1903[var3], field1903[var4], this.field1881[arg0], this.field1881[arg0], this.field1881[arg0], field1886[var6], field1886[var7], field1886[var8], field1907[var6], field1907[var7], field1907[var8], field1908[var6], field1908[var7], field1908[var8], this.field1874[arg0]);
            } else {
                class104.method2045(field1880[var2], field1880[var3], field1880[var4], field1903[var2], field1903[var3], field1903[var4], this.field1881[arg0], this.field1927[arg0], this.field1882[arg0], field1886[var6], field1886[var7], field1886[var8], field1907[var6], field1907[var7], field1907[var8], field1908[var6], field1908[var7], field1908[var8], this.field1874[arg0]);
            }
        } else if (this.field1882[arg0] == -1) {
            class104.method2043(field1880[var2], field1880[var3], field1880[var4], field1903[var2], field1903[var3], field1903[var4], field1930[this.field1881[arg0]]);
        } else {
            class104.method2041(field1880[var2], field1880[var3], field1880[var4], field1903[var2], field1903[var3], field1903[var4], this.field1881[arg0], this.field1927[arg0], this.field1882[arg0]);
        }
    }

    @ObfuscatedName("dl.ap(I)V")
    public final void method2132(int arg0) {
        int var2 = Statics.field1768;
        int var3 = Statics.field1777;
        int var4 = 0;
        int var5 = this.field1906[arg0];
        int var6 = this.field1878[arg0];
        int var7 = this.field1879[arg0];
        int var8 = field1908[var5];
        int var9 = field1908[var6];
        int var10 = field1908[var7];
        if (this.field1884 == null) {
            class104.field1770 = 0;
        } else {
            class104.field1770 = this.field1884[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1917[var4] = field1903[var5];
            field1918[var4] = field1880[var5];
            field1916[var4++] = this.field1881[arg0];
        } else {
            int var11 = field1886[var5];
            int var12 = field1907[var5];
            int var13 = this.field1881[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1922[var10 - var8];
                field1917[var4] = (((field1886[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1918[var4] = (((field1907[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1916[var4++] = ((this.field1882[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1922[var9 - var8];
                field1917[var4] = (((field1886[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1918[var4] = (((field1907[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1916[var4++] = ((this.field1927[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1917[var4] = field1903[var6];
            field1918[var4] = field1880[var6];
            field1916[var4++] = this.field1927[arg0];
        } else {
            int var16 = field1886[var6];
            int var17 = field1907[var6];
            int var18 = this.field1927[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1922[var8 - var9];
                field1917[var4] = (((field1886[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1918[var4] = (((field1907[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1916[var4++] = ((this.field1881[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1922[var10 - var9];
                field1917[var4] = (((field1886[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1918[var4] = (((field1907[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1916[var4++] = ((this.field1882[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1917[var4] = field1903[var7];
            field1918[var4] = field1880[var7];
            field1916[var4++] = this.field1882[arg0];
        } else {
            int var21 = field1886[var7];
            int var22 = field1907[var7];
            int var23 = this.field1882[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1922[var9 - var10];
                field1917[var4] = (((field1886[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1918[var4] = (((field1907[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1916[var4++] = ((this.field1927[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1922[var8 - var10];
                field1917[var4] = (((field1886[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1918[var4] = (((field1907[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1916[var4++] = ((this.field1881[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1917[0];
        int var27 = field1917[1];
        int var28 = field1917[2];
        int var29 = field1918[0];
        int var30 = field1918[1];
        int var31 = field1918[2];
        class104.field1786 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1778 || var27 > Statics.field1778 || var28 > Statics.field1778) {
                class104.field1786 = true;
            }
            if (this.field1874 != null && this.field1874[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1885 == null || this.field1885[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1885[arg0] & 0xFF;
                    var33 = this.field1889[var32];
                    var34 = this.field1890[var32];
                    var35 = this.field1925[var32];
                }
                if (this.field1882[arg0] == -1) {
                    class104.method2045(var29, var30, var31, var26, var27, var28, this.field1881[arg0], this.field1881[arg0], this.field1881[arg0], field1886[var33], field1886[var34], field1886[var35], field1907[var33], field1907[var34], field1907[var35], field1908[var33], field1908[var34], field1908[var35], this.field1874[arg0]);
                } else {
                    class104.method2045(var29, var30, var31, var26, var27, var28, field1916[0], field1916[1], field1916[2], field1886[var33], field1886[var34], field1886[var35], field1907[var33], field1907[var34], field1907[var35], field1908[var33], field1908[var34], field1908[var35], this.field1874[arg0]);
                }
            } else if (this.field1882[arg0] == -1) {
                class104.method2043(var29, var30, var31, var26, var27, var28, field1930[this.field1881[arg0]]);
            } else {
                class104.method2041(var29, var30, var31, var26, var27, var28, field1916[0], field1916[1], field1916[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1778 || var27 > Statics.field1778 || var28 > Statics.field1778 || field1917[3] < 0 || field1917[3] > Statics.field1778) {
            class104.field1786 = true;
        }
        if (this.field1874 != null && this.field1874[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1885 == null || this.field1885[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1885[arg0] & 0xFF;
                var37 = this.field1889[var36];
                var38 = this.field1890[var36];
                var39 = this.field1925[var36];
            }
            short var40 = this.field1874[arg0];
            if (this.field1882[arg0] == -1) {
                class104.method2045(var29, var30, var31, var26, var27, var28, this.field1881[arg0], this.field1881[arg0], this.field1881[arg0], field1886[var37], field1886[var38], field1886[var39], field1907[var37], field1907[var38], field1907[var39], field1908[var37], field1908[var38], field1908[var39], var40);
                class104.method2045(var29, var31, field1918[3], var26, var28, field1917[3], this.field1881[arg0], this.field1881[arg0], this.field1881[arg0], field1886[var37], field1886[var38], field1886[var39], field1907[var37], field1907[var38], field1907[var39], field1908[var37], field1908[var38], field1908[var39], var40);
            } else {
                class104.method2045(var29, var30, var31, var26, var27, var28, field1916[0], field1916[1], field1916[2], field1886[var37], field1886[var38], field1886[var39], field1907[var37], field1907[var38], field1907[var39], field1908[var37], field1908[var38], field1908[var39], var40);
                class104.method2045(var29, var31, field1918[3], var26, var28, field1917[3], field1916[0], field1916[2], field1916[3], field1886[var37], field1886[var38], field1886[var39], field1907[var37], field1907[var38], field1907[var39], field1908[var37], field1908[var38], field1908[var39], var40);
            }
        } else if (this.field1882[arg0] == -1) {
            int var41 = field1930[this.field1881[arg0]];
            class104.method2043(var29, var30, var31, var26, var27, var28, var41);
            class104.method2043(var29, var31, field1918[3], var26, var28, field1917[3], var41);
        } else {
            class104.method2041(var29, var30, var31, var26, var27, var28, field1916[0], field1916[1], field1916[2]);
            class104.method2041(var29, var31, field1918[3], var26, var28, field1917[3], field1916[0], field1916[2], field1916[3]);
        }
    }

    @ObfuscatedName("dl.as(IIIIIIII)Z")
    public final boolean method2156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
