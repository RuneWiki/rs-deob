package deob;

@ObfuscatedName("ds")
public class class112 extends class94 {

    @ObfuscatedName("ds.p")
    public static class112 field1891 = new class112();

    @ObfuscatedName("ds.e")
    public static byte[] field1860 = new byte[1];

    @ObfuscatedName("ds.a")
    public static class112 field1862 = new class112();

    @ObfuscatedName("ds.h")
    public static byte[] field1888 = new byte[1];

    @ObfuscatedName("ds.y")
    public int field1863 = 0;

    @ObfuscatedName("ds.j")
    public int[] field1864;

    @ObfuscatedName("ds.l")
    public int[] field1865;

    @ObfuscatedName("ds.f")
    public int[] field1866;

    @ObfuscatedName("ds.n")
    public int field1867 = 0;

    @ObfuscatedName("ds.k")
    public int[] field1923;

    @ObfuscatedName("ds.q")
    public int[] field1869;

    @ObfuscatedName("ds.w")
    public int[] field1870;

    @ObfuscatedName("ds.v")
    public int[] field1871;

    @ObfuscatedName("ds.z")
    public int[] field1909;

    @ObfuscatedName("ds.m")
    public int[] field1873;

    @ObfuscatedName("ds.r")
    public byte[] field1874;

    @ObfuscatedName("ds.u")
    public byte[] field1875;

    @ObfuscatedName("ds.i")
    public byte[] field1885;

    @ObfuscatedName("ds.x")
    public short[] field1884;

    @ObfuscatedName("ds.s")
    public byte field1878 = 0;

    @ObfuscatedName("ds.o")
    public int field1908 = 0;

    @ObfuscatedName("ds.g")
    public int[] field1880;

    @ObfuscatedName("ds.d")
    public int[] field1881;

    @ObfuscatedName("ds.t")
    public int[] field1882;

    @ObfuscatedName("ds.b")
    public int[][] field1883;

    @ObfuscatedName("ds.c")
    public int[][] field1879;

    @ObfuscatedName("ds.aw")
    public boolean field1905 = false;

    @ObfuscatedName("ds.ap")
    public int field1886;

    @ObfuscatedName("ds.am")
    public int field1896;

    @ObfuscatedName("ds.az")
    public int field1895;

    @ObfuscatedName("ds.ax")
    public int field1889;

    @ObfuscatedName("ds.af")
    public int field1890;

    @ObfuscatedName("ds.ag")
    public static boolean[] field1892 = new boolean[4096];

    @ObfuscatedName("ds.aj")
    public static boolean[] field1893 = new boolean[4096];

    @ObfuscatedName("ds.aq")
    public static int[] field1894 = new int[4096];

    @ObfuscatedName("ds.ah")
    public static int[] field1914 = new int[4096];

    @ObfuscatedName("ds.ae")
    public static int[] field1861 = new int[4096];

    @ObfuscatedName("ds.ar")
    public static int[] field1897 = new int[4096];

    @ObfuscatedName("ds.ab")
    public static int[] field1898 = new int[4096];

    @ObfuscatedName("ds.ay")
    public static int[] field1899 = new int[4096];

    @ObfuscatedName("ds.ad")
    public static int[] field1877 = new int[1600];

    @ObfuscatedName("ds.al")
    public static int[][] field1902 = new int[1600][512];

    @ObfuscatedName("ds.an")
    public static int[] field1903 = new int[12];

    @ObfuscatedName("ds.at")
    public static int[][] field1904 = new int[12][2000];

    @ObfuscatedName("ds.ak")
    public static int[] field1868 = new int[2000];

    @ObfuscatedName("ds.as")
    public static int[] field1906 = new int[2000];

    @ObfuscatedName("ds.ai")
    public static int[] field1920 = new int[12];

    @ObfuscatedName("ds.ao")
    public static int[] field1901 = new int[10];

    @ObfuscatedName("ds.av")
    public static int[] field1859 = new int[10];

    @ObfuscatedName("ds.au")
    public static int[] field1910 = new int[10];

    @ObfuscatedName("ds.bh")
    public static boolean field1887 = false;

    @ObfuscatedName("ds.bi")
    public static int field1915 = 0;

    @ObfuscatedName("ds.ba")
    public static int field1916 = 0;

    @ObfuscatedName("ds.bf")
    public static int field1917 = 0;

    @ObfuscatedName("ds.bd")
    public static int[] field1913 = new int[1000];

    @ObfuscatedName("ds.bw")
    public static int[] field1919 = class104.field1780;

    @ObfuscatedName("ds.bj")
    public static int[] field1907 = class104.field1784;

    @ObfuscatedName("ds.by")
    public static int[] field1921 = class104.field1783;

    @ObfuscatedName("ds.be")
    public static int[] field1922 = class104.field1782;

    public class112() {
    }

    public class112(class112[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1863 = 0;
        this.field1867 = 0;
        this.field1908 = 0;
        this.field1878 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class112 var8 = arg0[var7];
            if (var8 != null) {
                this.field1863 += var8.field1863;
                this.field1867 += var8.field1867;
                this.field1908 += var8.field1908;
                if (var8.field1874 == null) {
                    if (this.field1878 == -1) {
                        this.field1878 = var8.field1878;
                    }
                    if (this.field1878 != var8.field1878) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1875 != null;
                var5 |= var8.field1884 != null;
                var6 |= var8.field1885 != null;
            }
        }
        this.field1864 = new int[this.field1863];
        this.field1865 = new int[this.field1863];
        this.field1866 = new int[this.field1863];
        this.field1923 = new int[this.field1867];
        this.field1869 = new int[this.field1867];
        this.field1870 = new int[this.field1867];
        this.field1871 = new int[this.field1867];
        this.field1909 = new int[this.field1867];
        this.field1873 = new int[this.field1867];
        if (var3) {
            this.field1874 = new byte[this.field1867];
        }
        if (var4) {
            this.field1875 = new byte[this.field1867];
        }
        if (var5) {
            this.field1884 = new short[this.field1867];
        }
        if (var6) {
            this.field1885 = new byte[this.field1867];
        }
        if (this.field1908 > 0) {
            this.field1880 = new int[this.field1908];
            this.field1881 = new int[this.field1908];
            this.field1882 = new int[this.field1908];
        }
        this.field1863 = 0;
        this.field1867 = 0;
        this.field1908 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class112 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1867; var11++) {
                    this.field1923[this.field1867] = var10.field1923[var11] + this.field1863;
                    this.field1869[this.field1867] = var10.field1869[var11] + this.field1863;
                    this.field1870[this.field1867] = var10.field1870[var11] + this.field1863;
                    this.field1871[this.field1867] = var10.field1871[var11];
                    this.field1909[this.field1867] = var10.field1909[var11];
                    this.field1873[this.field1867] = var10.field1873[var11];
                    if (var3) {
                        if (var10.field1874 == null) {
                            this.field1874[this.field1867] = var10.field1878;
                        } else {
                            this.field1874[this.field1867] = var10.field1874[var11];
                        }
                    }
                    if (var4 && var10.field1875 != null) {
                        this.field1875[this.field1867] = var10.field1875[var11];
                    }
                    if (var5) {
                        if (var10.field1884 == null) {
                            this.field1884[this.field1867] = -1;
                        } else {
                            this.field1884[this.field1867] = var10.field1884[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1885 == null || var10.field1885[var11] == -1) {
                            this.field1885[this.field1867] = -1;
                        } else {
                            this.field1885[this.field1867] = (byte) (var10.field1885[var11] + this.field1908);
                        }
                    }
                    this.field1867++;
                }
                for (int var12 = 0; var12 < var10.field1908; var12++) {
                    this.field1880[this.field1908] = var10.field1880[var12] + this.field1863;
                    this.field1881[this.field1908] = var10.field1881[var12] + this.field1863;
                    this.field1882[this.field1908] = var10.field1882[var12] + this.field1863;
                    this.field1908++;
                }
                for (int var13 = 0; var13 < var10.field1863; var13++) {
                    this.field1864[this.field1863] = var10.field1864[var13];
                    this.field1865[this.field1863] = var10.field1865[var13];
                    this.field1866[this.field1863] = var10.field1866[var13];
                    this.field1863++;
                }
            }
        }
    }

    @ObfuscatedName("ds.p([[IIIIZI)Lds;")
    public class112 method2312(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2303();
        int var7 = arg1 - this.field1895;
        int var8 = this.field1895 + arg1;
        int var9 = arg3 - this.field1895;
        int var10 = this.field1895 + arg3;
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
            var15.field1863 = this.field1863;
            var15.field1867 = this.field1867;
            var15.field1908 = this.field1908;
            var15.field1864 = this.field1864;
            var15.field1866 = this.field1866;
            var15.field1923 = this.field1923;
            var15.field1869 = this.field1869;
            var15.field1870 = this.field1870;
            var15.field1871 = this.field1871;
            var15.field1909 = this.field1909;
            var15.field1873 = this.field1873;
            var15.field1874 = this.field1874;
            var15.field1875 = this.field1875;
            var15.field1885 = this.field1885;
            var15.field1884 = this.field1884;
            var15.field1878 = this.field1878;
            var15.field1880 = this.field1880;
            var15.field1881 = this.field1881;
            var15.field1882 = this.field1882;
            var15.field1883 = this.field1883;
            var15.field1879 = this.field1879;
            var15.field1905 = this.field1905;
            var15.field1865 = new int[var15.field1863];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1863; var16++) {
                int var17 = this.field1864[var16] + arg1;
                int var18 = this.field1866[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1865[var16] = this.field1865[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1863; var26++) {
                int var27 = (-this.field1865[var26] << 16) / this.field1554;
                if (var27 < arg5) {
                    int var28 = this.field1864[var26] + arg1;
                    int var29 = this.field1866[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1865[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1865[var26];
                }
            }
        }
        var15.field1886 = 0;
        return var15;
    }

    @ObfuscatedName("ds.a(Z)Lds;")
    public class112 method2257(boolean arg0) {
        if (!arg0 && field1860.length < this.field1867) {
            field1860 = new byte[this.field1867 + 100];
        }
        return this.method2259(arg0, field1891, field1860);
    }

    @ObfuscatedName("ds.h(Z)Lds;")
    public class112 method2258(boolean arg0) {
        if (!arg0 && field1888.length < this.field1867) {
            field1888 = new byte[this.field1867 + 100];
        }
        return this.method2259(arg0, field1862, field1888);
    }

    @ObfuscatedName("ds.y(ZLds;[B)Lds;")
    public class112 method2259(boolean arg0, class112 arg1, byte[] arg2) {
        arg1.field1863 = this.field1863;
        arg1.field1867 = this.field1867;
        arg1.field1908 = this.field1908;
        if (arg1.field1864 == null || arg1.field1864.length < this.field1863) {
            arg1.field1864 = new int[this.field1863 + 100];
            arg1.field1865 = new int[this.field1863 + 100];
            arg1.field1866 = new int[this.field1863 + 100];
        }
        for (int var4 = 0; var4 < this.field1863; var4++) {
            arg1.field1864[var4] = this.field1864[var4];
            arg1.field1865[var4] = this.field1865[var4];
            arg1.field1866[var4] = this.field1866[var4];
        }
        if (arg0) {
            arg1.field1875 = this.field1875;
        } else {
            arg1.field1875 = arg2;
            if (this.field1875 == null) {
                for (int var5 = 0; var5 < this.field1867; var5++) {
                    arg1.field1875[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1867; var6++) {
                    arg1.field1875[var6] = this.field1875[var6];
                }
            }
        }
        arg1.field1923 = this.field1923;
        arg1.field1869 = this.field1869;
        arg1.field1870 = this.field1870;
        arg1.field1871 = this.field1871;
        arg1.field1909 = this.field1909;
        arg1.field1873 = this.field1873;
        arg1.field1874 = this.field1874;
        arg1.field1885 = this.field1885;
        arg1.field1884 = this.field1884;
        arg1.field1878 = this.field1878;
        arg1.field1880 = this.field1880;
        arg1.field1881 = this.field1881;
        arg1.field1882 = this.field1882;
        arg1.field1883 = this.field1883;
        arg1.field1879 = this.field1879;
        arg1.field1905 = this.field1905;
        arg1.field1886 = 0;
        return arg1;
    }

    @ObfuscatedName("ds.j()V")
    public void method2303() {
        if (this.field1886 == 1) {
            return;
        }
        this.field1886 = 1;
        this.field1554 = 0;
        this.field1896 = 0;
        this.field1895 = 0;
        for (int var1 = 0; var1 < this.field1863; var1++) {
            int var2 = this.field1864[var1];
            int var3 = this.field1865[var1];
            int var4 = this.field1866[var1];
            if (-var3 > this.field1554) {
                this.field1554 = -var3;
            }
            if (var3 > this.field1896) {
                this.field1896 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1895) {
                this.field1895 = var5;
            }
        }
        this.field1895 = (int) (Math.sqrt((double) this.field1895) + 0.99D);
        this.field1890 = (int) (Math.sqrt((double) (this.field1554 * this.field1554 + this.field1895 * this.field1895)) + 0.99D);
        this.field1889 = this.field1890 + (int) (Math.sqrt((double) (this.field1896 * this.field1896 + this.field1895 * this.field1895)) + 0.99D);
    }

    @ObfuscatedName("ds.n()V")
    public void method2330() {
        if (this.field1886 == 2) {
            return;
        }
        this.field1886 = 2;
        this.field1895 = 0;
        for (int var1 = 0; var1 < this.field1863; var1++) {
            int var2 = this.field1864[var1];
            int var3 = this.field1865[var1];
            int var4 = this.field1866[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1895) {
                this.field1895 = var5;
            }
        }
        this.field1895 = (int) (Math.sqrt((double) this.field1895) + 0.99D);
        this.field1890 = this.field1895;
        this.field1889 = this.field1895 + this.field1895;
    }

    @ObfuscatedName("ds.k()I")
    public int method2262() {
        this.method2303();
        return this.field1895;
    }

    @ObfuscatedName("ds.q(Ldk;I)V")
    public void method2270(class109 arg0, int arg1) {
        if (this.field1883 == null || arg1 == -1) {
            return;
        }
        class97 var3 = arg0.field1822[arg1];
        class105 var4 = var3.field1640;
        Statics.field1911 = 0;
        Statics.field1912 = 0;
        Statics.field1876 = 0;
        for (int var5 = 0; var5 < var3.field1635; var5++) {
            int var6 = var3.field1638[var5];
            this.method2265(var4.field1785[var6], var4.field1788[var6], var3.field1639[var5], var3.field1632[var5], var3.field1642[var5]);
        }
        this.field1886 = 0;
    }

    @ObfuscatedName("ds.w(Ldk;ILdk;I[I)V")
    public void method2264(class109 arg0, int arg1, class109 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2270(arg0, arg1);
            return;
        }
        class97 var6 = arg0.field1822[arg1];
        class97 var7 = arg2.field1822[arg3];
        class105 var8 = var6.field1640;
        Statics.field1911 = 0;
        Statics.field1912 = 0;
        Statics.field1876 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1635; var11++) {
            int var12 = var6.field1638[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1785[var12] == 0) {
                this.method2265(var8.field1785[var12], var8.field1788[var12], var6.field1639[var11], var6.field1632[var11], var6.field1642[var11]);
            }
        }
        Statics.field1911 = 0;
        Statics.field1912 = 0;
        Statics.field1876 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1635; var15++) {
            int var16 = var7.field1638[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1785[var16] == 0) {
                this.method2265(var8.field1785[var16], var8.field1788[var16], var7.field1639[var15], var7.field1632[var15], var7.field1642[var15]);
            }
        }
        this.field1886 = 0;
    }

    @ObfuscatedName("ds.v(I[IIII)V")
    public void method2265(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1911 = 0;
            Statics.field1912 = 0;
            Statics.field1876 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1883.length) {
                    int[] var10 = this.field1883[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1911 += this.field1864[var12];
                        Statics.field1912 += this.field1865[var12];
                        Statics.field1876 += this.field1866[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1911 = Statics.field1911 / var7 + arg2;
                Statics.field1912 = Statics.field1912 / var7 + arg3;
                Statics.field1876 = Statics.field1876 / var7 + arg4;
            } else {
                Statics.field1911 = arg2;
                Statics.field1912 = arg3;
                Statics.field1876 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1883.length) {
                    int[] var15 = this.field1883[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1864[var17] += arg2;
                        this.field1865[var17] += arg3;
                        this.field1866[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1883.length) {
                    int[] var20 = this.field1883[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1864[var22] -= Statics.field1911;
                        this.field1865[var22] -= Statics.field1912;
                        this.field1866[var22] -= Statics.field1876;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1919[var25];
                            int var27 = field1907[var25];
                            int var28 = this.field1865[var22] * var26 + this.field1864[var22] * var27 >> 16;
                            this.field1865[var22] = this.field1865[var22] * var27 - this.field1864[var22] * var26 >> 16;
                            this.field1864[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1919[var23];
                            int var30 = field1907[var23];
                            int var31 = this.field1865[var22] * var30 - this.field1866[var22] * var29 >> 16;
                            this.field1866[var22] = this.field1866[var22] * var30 + this.field1865[var22] * var29 >> 16;
                            this.field1865[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1919[var24];
                            int var33 = field1907[var24];
                            int var34 = this.field1866[var22] * var32 + this.field1864[var22] * var33 >> 16;
                            this.field1866[var22] = this.field1866[var22] * var33 - this.field1864[var22] * var32 >> 16;
                            this.field1864[var22] = var34;
                        }
                        this.field1864[var22] += Statics.field1911;
                        this.field1865[var22] += Statics.field1912;
                        this.field1866[var22] += Statics.field1876;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1883.length) {
                    int[] var37 = this.field1883[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1864[var39] -= Statics.field1911;
                        this.field1865[var39] -= Statics.field1912;
                        this.field1866[var39] -= Statics.field1876;
                        this.field1864[var39] = this.field1864[var39] * arg2 / 128;
                        this.field1865[var39] = this.field1865[var39] * arg3 / 128;
                        this.field1866[var39] = this.field1866[var39] * arg4 / 128;
                        this.field1864[var39] += Statics.field1911;
                        this.field1865[var39] += Statics.field1912;
                        this.field1866[var39] += Statics.field1876;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1879 != null && this.field1875 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1879.length) {
                    int[] var42 = this.field1879[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1875[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1875[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ds.z()V")
    public void method2266() {
        for (int var1 = 0; var1 < this.field1863; var1++) {
            int var2 = this.field1864[var1];
            this.field1864[var1] = this.field1866[var1];
            this.field1866[var1] = -var2;
        }
        this.field1886 = 0;
    }

    @ObfuscatedName("ds.m()V")
    public void method2267() {
        for (int var1 = 0; var1 < this.field1863; var1++) {
            this.field1864[var1] = -this.field1864[var1];
            this.field1866[var1] = -this.field1866[var1];
        }
        this.field1886 = 0;
    }

    @ObfuscatedName("ds.r()V")
    public void method2268() {
        for (int var1 = 0; var1 < this.field1863; var1++) {
            int var2 = this.field1866[var1];
            this.field1866[var1] = this.field1864[var1];
            this.field1864[var1] = -var2;
        }
        this.field1886 = 0;
    }

    @ObfuscatedName("ds.u(I)V")
    public void method2290(int arg0) {
        int var2 = field1919[arg0];
        int var3 = field1907[arg0];
        for (int var4 = 0; var4 < this.field1863; var4++) {
            int var5 = this.field1865[var4] * var3 - this.field1866[var4] * var2 >> 16;
            this.field1866[var4] = this.field1866[var4] * var3 + this.field1865[var4] * var2 >> 16;
            this.field1865[var4] = var5;
        }
        this.field1886 = 0;
    }

    @ObfuscatedName("ds.i(III)V")
    public void method2313(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1863; var4++) {
            this.field1864[var4] += arg0;
            this.field1865[var4] += arg1;
            this.field1866[var4] += arg2;
        }
        this.field1886 = 0;
    }

    @ObfuscatedName("ds.x(III)V")
    public void method2271(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1863; var4++) {
            this.field1864[var4] = this.field1864[var4] * arg0 / 128;
            this.field1865[var4] = this.field1865[var4] * arg1 / 128;
            this.field1866[var4] = this.field1866[var4] * arg2 / 128;
        }
        this.field1886 = 0;
    }

    @ObfuscatedName("ds.s(IIIIIII)V")
    public final void method2285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1877[0] = -1;
        if (this.field1886 != 2 && this.field1886 != 1) {
            this.method2330();
        }
        int var8 = Statics.field1770;
        int var9 = Statics.field1771;
        int var10 = field1919[arg0];
        int var11 = field1907[arg0];
        int var12 = field1919[arg1];
        int var13 = field1907[arg1];
        int var14 = field1919[arg2];
        int var15 = field1907[arg2];
        int var16 = field1919[arg3];
        int var17 = field1907[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1863; var19++) {
            int var20 = this.field1864[var19];
            int var21 = this.field1865[var19];
            int var22 = this.field1866[var19];
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
            field1861[var19] = var30 - var18;
            field1894[var19] = (var26 << 9) / var30 + var8;
            field1914[var19] = (var29 << 9) / var30 + var9;
            if (this.field1908 > 0) {
                field1897[var19] = var26;
                field1898[var19] = var29;
                field1899[var19] = var30;
            }
        }
        try {
            this.method2254(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ds.o(IIIIIIII)V")
    public final void method2306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1877[0] = -1;
        if (this.field1886 != 2 && this.field1886 != 1) {
            this.method2330();
        }
        int var9 = Statics.field1770;
        int var10 = Statics.field1771;
        int var11 = field1919[arg0];
        int var12 = field1907[arg0];
        int var13 = field1919[arg1];
        int var14 = field1907[arg1];
        int var15 = field1919[arg2];
        int var16 = field1907[arg2];
        int var17 = field1919[arg3];
        int var18 = field1907[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1863; var20++) {
            int var21 = this.field1864[var20];
            int var22 = this.field1865[var20];
            int var23 = this.field1866[var20];
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
            field1861[var20] = var31 - var19;
            field1894[var20] = (var27 << 9) / arg7 + var9;
            field1914[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1908 > 0) {
                field1897[var20] = var27;
                field1898[var20] = var30;
                field1899[var20] = var31;
            }
        }
        try {
            this.method2254(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ds.t(IIIIIIIII)V")
    public void method1884(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1877[0] = -1;
        if (this.field1886 != 1) {
            this.method2303();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1895 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1895 << 9;
        if (var15 / var13 >= Statics.field1775) {
            return;
        }
        int var16 = this.field1895 + var14 << 9;
        if (var16 / var13 <= Statics.field1769) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1895 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1776) {
            return;
        }
        int var20 = (this.field1554 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1777) {
            return;
        }
        int var22 = (this.field1554 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1908 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1887) {
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
            int var32 = field1915 - Statics.field1770;
            int var33 = field1916 - Statics.field1771;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1905) {
                    field1913[field1917++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1770;
        int var35 = Statics.field1771;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1919[arg0];
            var37 = field1907[arg0];
        }
        for (int var38 = 0; var38 < this.field1863; var38++) {
            int var39 = this.field1864[var38];
            int var40 = this.field1865[var38];
            int var41 = this.field1866[var38];
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
            field1861[var38] = var50 - var11;
            if (var50 >= 50) {
                field1894[var38] = (var46 << 9) / var50 + var34;
                field1914[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1894[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1897[var38] = var46;
                field1898[var38] = var49;
                field1899[var38] = var50;
            }
        }
        try {
            this.method2254(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("ds.g(ZZI)V")
    public final void method2254(boolean arg0, boolean arg1, int arg2) {
        if (this.field1889 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1889; var4++) {
            field1877[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1867; var5++) {
            if (this.field1873[var5] != -2) {
                int var6 = this.field1923[var5];
                int var7 = this.field1869[var5];
                int var8 = this.field1870[var5];
                int var9 = field1894[var6];
                int var10 = field1894[var7];
                int var11 = field1894[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1897[var6];
                    int var13 = field1897[var7];
                    int var14 = field1897[var8];
                    int var15 = field1898[var6];
                    int var16 = field1898[var7];
                    int var17 = field1898[var8];
                    int var18 = field1899[var6];
                    int var19 = field1899[var7];
                    int var20 = field1899[var8];
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
                        field1893[var5] = true;
                        int var30 = (field1861[var6] + field1861[var7] + field1861[var8]) / 3 + this.field1890;
                        field1902[var30][field1877[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2277(field1915, field1916, field1914[var6], field1914[var7], field1914[var8], var9, var10, var11)) {
                        field1913[field1917++] = arg2;
                        arg1 = false;
                    }
                    if ((field1914[var8] - field1914[var7]) * (var9 - var10) - (field1914[var6] - field1914[var7]) * (var11 - var10) > 0) {
                        field1893[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1772 && var10 <= Statics.field1772 && var11 <= Statics.field1772) {
                            field1892[var5] = false;
                        } else {
                            field1892[var5] = true;
                        }
                        int var31 = (field1861[var6] + field1861[var7] + field1861[var8]) / 3 + this.field1890;
                        field1902[var31][field1877[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1874 == null) {
            for (int var32 = this.field1889 - 1; var32 >= 0; var32--) {
                int var33 = field1877[var32];
                if (var33 > 0) {
                    int[] var34 = field1902[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2275(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1903[var36] = 0;
            field1920[var36] = 0;
        }
        for (int var37 = this.field1889 - 1; var37 >= 0; var37--) {
            int var38 = field1877[var37];
            if (var38 > 0) {
                int[] var39 = field1902[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1874[var41];
                    int var43 = field1903[var42]++;
                    field1904[var42][var43] = var41;
                    if (var42 < 10) {
                        field1920[var42] += var37;
                    } else if (var42 == 10) {
                        field1868[var43] = var37;
                    } else {
                        field1906[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1903[1] > 0 || field1903[2] > 0) {
            var44 = (field1920[1] + field1920[2]) / (field1903[1] + field1903[2]);
        }
        int var45 = 0;
        if (field1903[3] > 0 || field1903[4] > 0) {
            var45 = (field1920[3] + field1920[4]) / (field1903[3] + field1903[4]);
        }
        int var46 = 0;
        if (field1903[6] > 0 || field1903[8] > 0) {
            var46 = (field1920[6] + field1920[8]) / (field1903[6] + field1903[8]);
        }
        int var47 = 0;
        int var48 = field1903[10];
        int[] var49 = field1904[10];
        int[] var50 = field1868;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1903[11];
            var49 = field1904[11];
            var50 = field1906;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2275(var49[var47++]);
                if (var47 == var48 && field1904[11] != var49) {
                    var47 = 0;
                    var48 = field1903[11];
                    var49 = field1904[11];
                    var50 = field1906;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2275(var49[var47++]);
                if (var47 == var48 && field1904[11] != var49) {
                    var47 = 0;
                    var48 = field1903[11];
                    var49 = field1904[11];
                    var50 = field1906;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2275(var49[var47++]);
                if (var47 == var48 && field1904[11] != var49) {
                    var47 = 0;
                    var48 = field1903[11];
                    var49 = field1904[11];
                    var50 = field1906;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1903[var52];
            int[] var54 = field1904[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2275(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2275(var49[var47++]);
            if (var47 == var48 && field1904[11] != var49) {
                var47 = 0;
                var49 = field1904[11];
                var48 = field1903[11];
                var50 = field1906;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("ds.d(I)V")
    public final void method2275(int arg0) {
        if (field1893[arg0]) {
            this.method2276(arg0);
            return;
        }
        int var2 = this.field1923[arg0];
        int var3 = this.field1869[arg0];
        int var4 = this.field1870[arg0];
        class104.field1779 = field1892[arg0];
        if (this.field1875 == null) {
            class104.field1764 = 0;
        } else {
            class104.field1764 = this.field1875[arg0] & 0xFF;
        }
        if (this.field1884 != null && this.field1884[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1885 == null || this.field1885[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1885[arg0] & 0xFF;
                var6 = this.field1880[var5];
                var7 = this.field1881[var5];
                var8 = this.field1882[var5];
            }
            if (this.field1873[arg0] == -1) {
                class104.method2167(field1914[var2], field1914[var3], field1914[var4], field1894[var2], field1894[var3], field1894[var4], this.field1871[arg0], this.field1871[arg0], this.field1871[arg0], field1897[var6], field1897[var7], field1897[var8], field1898[var6], field1898[var7], field1898[var8], field1899[var6], field1899[var7], field1899[var8], this.field1884[arg0]);
            } else {
                class104.method2167(field1914[var2], field1914[var3], field1914[var4], field1894[var2], field1894[var3], field1894[var4], this.field1871[arg0], this.field1909[arg0], this.field1873[arg0], field1897[var6], field1897[var7], field1897[var8], field1898[var6], field1898[var7], field1898[var8], field1899[var6], field1899[var7], field1899[var8], this.field1884[arg0]);
            }
        } else if (this.field1873[arg0] == -1) {
            class104.method2155(field1914[var2], field1914[var3], field1914[var4], field1894[var2], field1894[var3], field1894[var4], field1921[this.field1871[arg0]]);
        } else {
            class104.method2163(field1914[var2], field1914[var3], field1914[var4], field1894[var2], field1894[var3], field1894[var4], this.field1871[arg0], this.field1909[arg0], this.field1873[arg0]);
        }
    }

    @ObfuscatedName("ds.c(I)V")
    public final void method2276(int arg0) {
        int var2 = Statics.field1770;
        int var3 = Statics.field1771;
        int var4 = 0;
        int var5 = this.field1923[arg0];
        int var6 = this.field1869[arg0];
        int var7 = this.field1870[arg0];
        int var8 = field1899[var5];
        int var9 = field1899[var6];
        int var10 = field1899[var7];
        if (this.field1875 == null) {
            class104.field1764 = 0;
        } else {
            class104.field1764 = this.field1875[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1901[var4] = field1894[var5];
            field1859[var4] = field1914[var5];
            field1910[var4++] = this.field1871[arg0];
        } else {
            int var11 = field1897[var5];
            int var12 = field1898[var5];
            int var13 = this.field1871[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1922[var10 - var8];
                field1901[var4] = (((field1897[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1859[var4] = (((field1898[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1910[var4++] = ((this.field1873[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1922[var9 - var8];
                field1901[var4] = (((field1897[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1859[var4] = (((field1898[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1910[var4++] = ((this.field1909[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1901[var4] = field1894[var6];
            field1859[var4] = field1914[var6];
            field1910[var4++] = this.field1909[arg0];
        } else {
            int var16 = field1897[var6];
            int var17 = field1898[var6];
            int var18 = this.field1909[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1922[var8 - var9];
                field1901[var4] = (((field1897[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1859[var4] = (((field1898[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1910[var4++] = ((this.field1871[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1922[var10 - var9];
                field1901[var4] = (((field1897[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1859[var4] = (((field1898[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1910[var4++] = ((this.field1873[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1901[var4] = field1894[var7];
            field1859[var4] = field1914[var7];
            field1910[var4++] = this.field1873[arg0];
        } else {
            int var21 = field1897[var7];
            int var22 = field1898[var7];
            int var23 = this.field1873[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1922[var9 - var10];
                field1901[var4] = (((field1897[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1859[var4] = (((field1898[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1910[var4++] = ((this.field1909[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1922[var8 - var10];
                field1901[var4] = (((field1897[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1859[var4] = (((field1898[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1910[var4++] = ((this.field1871[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1901[0];
        int var27 = field1901[1];
        int var28 = field1901[2];
        int var29 = field1859[0];
        int var30 = field1859[1];
        int var31 = field1859[2];
        class104.field1779 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1772 || var27 > Statics.field1772 || var28 > Statics.field1772) {
                class104.field1779 = true;
            }
            if (this.field1884 != null && this.field1884[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1885 == null || this.field1885[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1885[arg0] & 0xFF;
                    var33 = this.field1880[var32];
                    var34 = this.field1881[var32];
                    var35 = this.field1882[var32];
                }
                if (this.field1873[arg0] == -1) {
                    class104.method2167(var29, var30, var31, var26, var27, var28, this.field1871[arg0], this.field1871[arg0], this.field1871[arg0], field1897[var33], field1897[var34], field1897[var35], field1898[var33], field1898[var34], field1898[var35], field1899[var33], field1899[var34], field1899[var35], this.field1884[arg0]);
                } else {
                    class104.method2167(var29, var30, var31, var26, var27, var28, field1910[0], field1910[1], field1910[2], field1897[var33], field1897[var34], field1897[var35], field1898[var33], field1898[var34], field1898[var35], field1899[var33], field1899[var34], field1899[var35], this.field1884[arg0]);
                }
            } else if (this.field1873[arg0] == -1) {
                class104.method2155(var29, var30, var31, var26, var27, var28, field1921[this.field1871[arg0]]);
            } else {
                class104.method2163(var29, var30, var31, var26, var27, var28, field1910[0], field1910[1], field1910[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1772 || var27 > Statics.field1772 || var28 > Statics.field1772 || field1901[3] < 0 || field1901[3] > Statics.field1772) {
            class104.field1779 = true;
        }
        if (this.field1884 != null && this.field1884[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1885 == null || this.field1885[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1885[arg0] & 0xFF;
                var37 = this.field1880[var36];
                var38 = this.field1881[var36];
                var39 = this.field1882[var36];
            }
            short var40 = this.field1884[arg0];
            if (this.field1873[arg0] == -1) {
                class104.method2167(var29, var30, var31, var26, var27, var28, this.field1871[arg0], this.field1871[arg0], this.field1871[arg0], field1897[var37], field1897[var38], field1897[var39], field1898[var37], field1898[var38], field1898[var39], field1899[var37], field1899[var38], field1899[var39], var40);
                class104.method2167(var29, var31, field1859[3], var26, var28, field1901[3], this.field1871[arg0], this.field1871[arg0], this.field1871[arg0], field1897[var37], field1897[var38], field1897[var39], field1898[var37], field1898[var38], field1898[var39], field1899[var37], field1899[var38], field1899[var39], var40);
            } else {
                class104.method2167(var29, var30, var31, var26, var27, var28, field1910[0], field1910[1], field1910[2], field1897[var37], field1897[var38], field1897[var39], field1898[var37], field1898[var38], field1898[var39], field1899[var37], field1899[var38], field1899[var39], var40);
                class104.method2167(var29, var31, field1859[3], var26, var28, field1901[3], field1910[0], field1910[2], field1910[3], field1897[var37], field1897[var38], field1897[var39], field1898[var37], field1898[var38], field1898[var39], field1899[var37], field1899[var38], field1899[var39], var40);
            }
        } else if (this.field1873[arg0] == -1) {
            int var41 = field1921[this.field1871[arg0]];
            class104.method2155(var29, var30, var31, var26, var27, var28, var41);
            class104.method2155(var29, var31, field1859[3], var26, var28, field1901[3], var41);
        } else {
            class104.method2163(var29, var30, var31, var26, var27, var28, field1910[0], field1910[1], field1910[2]);
            class104.method2163(var29, var31, field1859[3], var26, var28, field1901[3], field1910[0], field1910[2], field1910[3]);
        }
    }

    @ObfuscatedName("ds.aw(IIIIIIII)Z")
    public final boolean method2277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
