package deob;

@ObfuscatedName("ei")
public class class132 extends class140 {

    @ObfuscatedName("ei.o")
    public static class132 field1857 = new class132();

    @ObfuscatedName("ei.k")
    public static byte[] field1912 = new byte[1];

    @ObfuscatedName("ei.t")
    public static class132 field1851 = new class132();

    @ObfuscatedName("ei.d")
    public static byte[] field1905 = new byte[1];

    @ObfuscatedName("ei.h")
    public int field1883 = 0;

    @ObfuscatedName("ei.m")
    public int[] field1854;

    @ObfuscatedName("ei.z")
    public int[] field1855;

    @ObfuscatedName("ei.i")
    public int[] field1856;

    @ObfuscatedName("ei.u")
    public int field1898 = 0;

    @ObfuscatedName("ei.x")
    public int[] field1858;

    @ObfuscatedName("ei.y")
    public int[] field1889;

    @ObfuscatedName("ei.a")
    public int[] field1860;

    @ObfuscatedName("ei.w")
    public int[] field1853;

    @ObfuscatedName("ei.n")
    public int[] field1862;

    @ObfuscatedName("ei.l")
    public int[] field1863;

    @ObfuscatedName("ei.s")
    public byte[] field1864;

    @ObfuscatedName("ei.v")
    public byte[] field1865;

    @ObfuscatedName("ei.q")
    public byte[] field1866;

    @ObfuscatedName("ei.r")
    public short[] field1852;

    @ObfuscatedName("ei.j")
    public byte field1868 = 0;

    @ObfuscatedName("ei.b")
    public int field1867 = 0;

    @ObfuscatedName("ei.g")
    public int[] field1870;

    @ObfuscatedName("ei.f")
    public int[] field1869;

    @ObfuscatedName("ei.p")
    public int[] field1872;

    @ObfuscatedName("ei.e")
    public int[][] field1873;

    @ObfuscatedName("ei.c")
    public int[][] field1891;

    @ObfuscatedName("ei.ab")
    public boolean field1875 = false;

    @ObfuscatedName("ei.ap")
    public int field1859;

    @ObfuscatedName("ei.ag")
    public int field1850;

    @ObfuscatedName("ei.at")
    public int field1878;

    @ObfuscatedName("ei.ac")
    public int field1879;

    @ObfuscatedName("ei.al")
    public int field1903;

    @ObfuscatedName("ei.ah")
    public int field1881;

    @ObfuscatedName("ei.af")
    public int field1882;

    @ObfuscatedName("ei.aq")
    public int field1886;

    @ObfuscatedName("ei.ai")
    public int field1884 = -1;

    @ObfuscatedName("ei.az")
    public int field1885 = -1;

    @ObfuscatedName("ei.aa")
    public int field1907 = -1;

    @ObfuscatedName("ei.am")
    public static boolean[] field1888 = new boolean[4700];

    @ObfuscatedName("ei.ao")
    public static boolean[] field1849 = new boolean[4700];

    @ObfuscatedName("ei.ax")
    public static int[] field1890 = new int[4700];

    @ObfuscatedName("ei.ad")
    public static int[] field1880 = new int[4700];

    @ObfuscatedName("ei.au")
    public static int[] field1892 = new int[4700];

    @ObfuscatedName("ei.ar")
    public static int[] field1893 = new int[4700];

    @ObfuscatedName("ei.an")
    public static int[] field1894 = new int[4700];

    @ObfuscatedName("ei.ae")
    public static int[] field1895 = new int[4700];

    @ObfuscatedName("ei.ak")
    public static int[] field1897 = new int[1600];

    @ObfuscatedName("ei.as")
    public static int[][] field1861 = new int[1600][512];

    @ObfuscatedName("ei.aj")
    public static int[] field1899 = new int[12];

    @ObfuscatedName("ei.ay")
    public static int[][] field1900 = new int[12][2000];

    @ObfuscatedName("ei.bm")
    public static int[] field1901 = new int[2000];

    @ObfuscatedName("ei.bx")
    public static int[] field1896 = new int[2000];

    @ObfuscatedName("ei.bl")
    public static int[] field1902 = new int[12];

    @ObfuscatedName("ei.bf")
    public static int[] field1904 = new int[10];

    @ObfuscatedName("ei.bp")
    public static int[] field1876 = new int[10];

    @ObfuscatedName("ei.bs")
    public static int[] field1906 = new int[10];

    @ObfuscatedName("ei.bn")
    public static boolean field1910 = true;

    @ObfuscatedName("ei.be")
    public static int[] field1913 = class135.field1963;

    @ObfuscatedName("ei.bq")
    public static int[] field1914 = class135.field1964;

    @ObfuscatedName("ei.bh")
    public static int[] field1915 = class135.field1959;

    @ObfuscatedName("ei.bt")
    public static int[] field1916 = class135.field1953;

    public class132() {
    }

    public class132(class132[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1883 = 0;
        this.field1898 = 0;
        this.field1867 = 0;
        this.field1868 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class132 var8 = arg0[var7];
            if (var8 != null) {
                this.field1883 += var8.field1883;
                this.field1898 += var8.field1898;
                this.field1867 += var8.field1867;
                if (var8.field1864 == null) {
                    if (this.field1868 == -1) {
                        this.field1868 = var8.field1868;
                    }
                    if (this.field1868 != var8.field1868) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1865 != null;
                var5 |= var8.field1852 != null;
                var6 |= var8.field1866 != null;
            }
        }
        this.field1854 = new int[this.field1883];
        this.field1855 = new int[this.field1883];
        this.field1856 = new int[this.field1883];
        this.field1858 = new int[this.field1898];
        this.field1889 = new int[this.field1898];
        this.field1860 = new int[this.field1898];
        this.field1853 = new int[this.field1898];
        this.field1862 = new int[this.field1898];
        this.field1863 = new int[this.field1898];
        if (var3) {
            this.field1864 = new byte[this.field1898];
        }
        if (var4) {
            this.field1865 = new byte[this.field1898];
        }
        if (var5) {
            this.field1852 = new short[this.field1898];
        }
        if (var6) {
            this.field1866 = new byte[this.field1898];
        }
        if (this.field1867 > 0) {
            this.field1870 = new int[this.field1867];
            this.field1869 = new int[this.field1867];
            this.field1872 = new int[this.field1867];
        }
        this.field1883 = 0;
        this.field1898 = 0;
        this.field1867 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class132 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1898; var11++) {
                    this.field1858[this.field1898] = var10.field1858[var11] + this.field1883;
                    this.field1889[this.field1898] = var10.field1889[var11] + this.field1883;
                    this.field1860[this.field1898] = var10.field1860[var11] + this.field1883;
                    this.field1853[this.field1898] = var10.field1853[var11];
                    this.field1862[this.field1898] = var10.field1862[var11];
                    this.field1863[this.field1898] = var10.field1863[var11];
                    if (var3) {
                        if (var10.field1864 == null) {
                            this.field1864[this.field1898] = var10.field1868;
                        } else {
                            this.field1864[this.field1898] = var10.field1864[var11];
                        }
                    }
                    if (var4 && var10.field1865 != null) {
                        this.field1865[this.field1898] = var10.field1865[var11];
                    }
                    if (var5) {
                        if (var10.field1852 == null) {
                            this.field1852[this.field1898] = -1;
                        } else {
                            this.field1852[this.field1898] = var10.field1852[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1866 == null || var10.field1866[var11] == -1) {
                            this.field1866[this.field1898] = -1;
                        } else {
                            this.field1866[this.field1898] = (byte) (var10.field1866[var11] + this.field1867);
                        }
                    }
                    this.field1898++;
                }
                for (int var12 = 0; var12 < var10.field1867; var12++) {
                    this.field1870[this.field1867] = var10.field1870[var12] + this.field1883;
                    this.field1869[this.field1867] = var10.field1869[var12] + this.field1883;
                    this.field1872[this.field1867] = var10.field1872[var12] + this.field1883;
                    this.field1867++;
                }
                for (int var13 = 0; var13 < var10.field1883; var13++) {
                    this.field1854[this.field1883] = var10.field1854[var13];
                    this.field1855[this.field1883] = var10.field1855[var13];
                    this.field1856[this.field1883] = var10.field1856[var13];
                    this.field1883++;
                }
            }
        }
    }

    @ObfuscatedName("ei.o([[IIIIZI)Lei;")
    public class132 method2459(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2512();
        int var7 = arg1 - this.field1878;
        int var8 = this.field1878 + arg1;
        int var9 = arg3 - this.field1878;
        int var10 = this.field1878 + arg3;
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
            var15.field1883 = this.field1883;
            var15.field1898 = this.field1898;
            var15.field1867 = this.field1867;
            var15.field1854 = this.field1854;
            var15.field1856 = this.field1856;
            var15.field1858 = this.field1858;
            var15.field1889 = this.field1889;
            var15.field1860 = this.field1860;
            var15.field1853 = this.field1853;
            var15.field1862 = this.field1862;
            var15.field1863 = this.field1863;
            var15.field1864 = this.field1864;
            var15.field1865 = this.field1865;
            var15.field1866 = this.field1866;
            var15.field1852 = this.field1852;
            var15.field1868 = this.field1868;
            var15.field1870 = this.field1870;
            var15.field1869 = this.field1869;
            var15.field1872 = this.field1872;
            var15.field1873 = this.field1873;
            var15.field1891 = this.field1891;
            var15.field1875 = this.field1875;
            var15.field1855 = new int[var15.field1883];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1883; var16++) {
                int var17 = this.field1854[var16] + arg1;
                int var18 = this.field1856[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1855[var16] = this.field1855[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1883; var26++) {
                int var27 = (-this.field1855[var26] << 16) / this.field2054;
                if (var27 < arg5) {
                    int var28 = this.field1854[var26] + arg1;
                    int var29 = this.field1856[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1855[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1855[var26];
                }
            }
        }
        var15.method2467();
        return var15;
    }

    @ObfuscatedName("ei.k(Z)Lei;")
    public class132 method2505(boolean arg0) {
        if (!arg0 && field1912.length < this.field1898) {
            field1912 = new byte[this.field1898 + 100];
        }
        return this.method2462(arg0, field1857, field1912);
    }

    @ObfuscatedName("ei.t(Z)Lei;")
    public class132 method2478(boolean arg0) {
        if (!arg0 && field1905.length < this.field1898) {
            field1905 = new byte[this.field1898 + 100];
        }
        return this.method2462(arg0, field1851, field1905);
    }

    @ObfuscatedName("ei.d(ZLei;[B)Lei;")
    public class132 method2462(boolean arg0, class132 arg1, byte[] arg2) {
        arg1.field1883 = this.field1883;
        arg1.field1898 = this.field1898;
        arg1.field1867 = this.field1867;
        if (arg1.field1854 == null || arg1.field1854.length < this.field1883) {
            arg1.field1854 = new int[this.field1883 + 100];
            arg1.field1855 = new int[this.field1883 + 100];
            arg1.field1856 = new int[this.field1883 + 100];
        }
        for (int var4 = 0; var4 < this.field1883; var4++) {
            arg1.field1854[var4] = this.field1854[var4];
            arg1.field1855[var4] = this.field1855[var4];
            arg1.field1856[var4] = this.field1856[var4];
        }
        if (arg0) {
            arg1.field1865 = this.field1865;
        } else {
            arg1.field1865 = arg2;
            if (this.field1865 == null) {
                for (int var5 = 0; var5 < this.field1898; var5++) {
                    arg1.field1865[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1898; var6++) {
                    arg1.field1865[var6] = this.field1865[var6];
                }
            }
        }
        arg1.field1858 = this.field1858;
        arg1.field1889 = this.field1889;
        arg1.field1860 = this.field1860;
        arg1.field1853 = this.field1853;
        arg1.field1862 = this.field1862;
        arg1.field1863 = this.field1863;
        arg1.field1864 = this.field1864;
        arg1.field1866 = this.field1866;
        arg1.field1852 = this.field1852;
        arg1.field1868 = this.field1868;
        arg1.field1870 = this.field1870;
        arg1.field1869 = this.field1869;
        arg1.field1872 = this.field1872;
        arg1.field1873 = this.field1873;
        arg1.field1891 = this.field1891;
        arg1.field1875 = this.field1875;
        arg1.method2467();
        return arg1;
    }

    @ObfuscatedName("ei.h(I)V")
    public void method2463(int arg0) {
        if (this.field1884 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1914[arg0];
        int var9 = field1913[arg0];
        for (int var10 = 0; var10 < this.field1883; var10++) {
            int var11 = class135.method2571(this.field1854[var10], this.field1856[var10], var8, var9);
            int var12 = this.field1855[var10];
            int var13 = class135.method2572(this.field1854[var10], this.field1856[var10], var8, var9);
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
        this.field1881 = (var2 + var5) / 2;
        this.field1882 = (var3 + var6) / 2;
        this.field1886 = (var4 + var7) / 2;
        this.field1884 = (var5 - var2 + 1) / 2;
        this.field1885 = (var6 - var3 + 1) / 2;
        this.field1907 = (var7 - var4 + 1) / 2;
        if (this.field1884 < 32) {
            this.field1884 = 32;
        }
        if (this.field1907 < 32) {
            this.field1907 = 32;
        }
        if (this.field1875) {
            this.field1884 += 8;
            this.field1907 += 8;
        }
    }

    @ObfuscatedName("ei.m()V")
    public void method2512() {
        if (this.field1859 == 1) {
            return;
        }
        this.field1859 = 1;
        this.field2054 = 0;
        this.field1850 = 0;
        this.field1878 = 0;
        for (int var1 = 0; var1 < this.field1883; var1++) {
            int var2 = this.field1854[var1];
            int var3 = this.field1855[var1];
            int var4 = this.field1856[var1];
            if (-var3 > this.field2054) {
                this.field2054 = -var3;
            }
            if (var3 > this.field1850) {
                this.field1850 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1878) {
                this.field1878 = var5;
            }
        }
        this.field1878 = (int) (Math.sqrt((double) this.field1878) + 0.99D);
        this.field1903 = (int) (Math.sqrt((double) (this.field2054 * this.field2054 + this.field1878 * this.field1878)) + 0.99D);
        this.field1879 = this.field1903 + (int) (Math.sqrt((double) (this.field1878 * this.field1878 + this.field1850 * this.field1850)) + 0.99D);
    }

    @ObfuscatedName("ei.z()V")
    public void method2465() {
        if (this.field1859 == 2) {
            return;
        }
        this.field1859 = 2;
        this.field1878 = 0;
        for (int var1 = 0; var1 < this.field1883; var1++) {
            int var2 = this.field1854[var1];
            int var3 = this.field1855[var1];
            int var4 = this.field1856[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1878) {
                this.field1878 = var5;
            }
        }
        this.field1878 = (int) (Math.sqrt((double) this.field1878) + 0.99D);
        this.field1903 = this.field1878;
        this.field1879 = this.field1878 + this.field1878;
    }

    @ObfuscatedName("ei.i()I")
    public int method2466() {
        this.method2512();
        return this.field1878;
    }

    @ObfuscatedName("ei.x()V")
    public void method2467() {
        this.field1859 = 0;
        this.field1884 = -1;
    }

    @ObfuscatedName("ei.y(Lef;I)V")
    public void method2468(class143 arg0, int arg1) {
        if (this.field1873 == null || arg1 == -1) {
            return;
        }
        class130 var3 = arg0.field2071[arg1];
        class137 var4 = var3.field1817;
        Statics.field1871 = 0;
        Statics.field1908 = 0;
        Statics.field1909 = 0;
        for (int var5 = 0; var5 < var3.field1820; var5++) {
            int var6 = var3.field1821[var5];
            this.method2470(var4.field1975[var6], var4.field1976[var6], var3.field1822[var5], var3.field1824[var5], var3.field1816[var5]);
        }
        this.method2467();
    }

    @ObfuscatedName("ei.a(Lef;ILef;I[I)V")
    public void method2518(class143 arg0, int arg1, class143 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2468(arg0, arg1);
            return;
        }
        class130 var6 = arg0.field2071[arg1];
        class130 var7 = arg2.field2071[arg3];
        class137 var8 = var6.field1817;
        Statics.field1871 = 0;
        Statics.field1908 = 0;
        Statics.field1909 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1820; var11++) {
            int var12 = var6.field1821[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1975[var12] == 0) {
                this.method2470(var8.field1975[var12], var8.field1976[var12], var6.field1822[var11], var6.field1824[var11], var6.field1816[var11]);
            }
        }
        Statics.field1871 = 0;
        Statics.field1908 = 0;
        Statics.field1909 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1820; var15++) {
            int var16 = var7.field1821[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1975[var16] == 0) {
                this.method2470(var8.field1975[var16], var8.field1976[var16], var7.field1822[var15], var7.field1824[var15], var7.field1816[var15]);
            }
        }
        this.method2467();
    }

    @ObfuscatedName("ei.v(I[IIII)V")
    public void method2470(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1871 = 0;
            Statics.field1908 = 0;
            Statics.field1909 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1873.length) {
                    int[] var10 = this.field1873[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1871 += this.field1854[var12];
                        Statics.field1908 += this.field1855[var12];
                        Statics.field1909 += this.field1856[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1871 = Statics.field1871 / var7 + arg2;
                Statics.field1908 = Statics.field1908 / var7 + arg3;
                Statics.field1909 = Statics.field1909 / var7 + arg4;
            } else {
                Statics.field1871 = arg2;
                Statics.field1908 = arg3;
                Statics.field1909 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1873.length) {
                    int[] var15 = this.field1873[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1854[var17] += arg2;
                        this.field1855[var17] += arg3;
                        this.field1856[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1873.length) {
                    int[] var20 = this.field1873[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1854[var22] -= Statics.field1871;
                        this.field1855[var22] -= Statics.field1908;
                        this.field1856[var22] -= Statics.field1909;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1913[var25];
                            int var27 = field1914[var25];
                            int var28 = this.field1855[var22] * var26 + this.field1854[var22] * var27 >> 16;
                            this.field1855[var22] = this.field1855[var22] * var27 - this.field1854[var22] * var26 >> 16;
                            this.field1854[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1913[var23];
                            int var30 = field1914[var23];
                            int var31 = this.field1855[var22] * var30 - this.field1856[var22] * var29 >> 16;
                            this.field1856[var22] = this.field1856[var22] * var30 + this.field1855[var22] * var29 >> 16;
                            this.field1855[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1913[var24];
                            int var33 = field1914[var24];
                            int var34 = this.field1856[var22] * var32 + this.field1854[var22] * var33 >> 16;
                            this.field1856[var22] = this.field1856[var22] * var33 - this.field1854[var22] * var32 >> 16;
                            this.field1854[var22] = var34;
                        }
                        this.field1854[var22] += Statics.field1871;
                        this.field1855[var22] += Statics.field1908;
                        this.field1856[var22] += Statics.field1909;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1873.length) {
                    int[] var37 = this.field1873[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1854[var39] -= Statics.field1871;
                        this.field1855[var39] -= Statics.field1908;
                        this.field1856[var39] -= Statics.field1909;
                        this.field1854[var39] = this.field1854[var39] * arg2 / 128;
                        this.field1855[var39] = this.field1855[var39] * arg3 / 128;
                        this.field1856[var39] = this.field1856[var39] * arg4 / 128;
                        this.field1854[var39] += Statics.field1871;
                        this.field1855[var39] += Statics.field1908;
                        this.field1856[var39] += Statics.field1909;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1891 != null && this.field1865 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1891.length) {
                    int[] var42 = this.field1891[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1865[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1865[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ei.q()V")
    public void method2471() {
        for (int var1 = 0; var1 < this.field1883; var1++) {
            int var2 = this.field1854[var1];
            this.field1854[var1] = this.field1856[var1];
            this.field1856[var1] = -var2;
        }
        this.method2467();
    }

    @ObfuscatedName("ei.r()V")
    public void method2472() {
        for (int var1 = 0; var1 < this.field1883; var1++) {
            this.field1854[var1] = -this.field1854[var1];
            this.field1856[var1] = -this.field1856[var1];
        }
        this.method2467();
    }

    @ObfuscatedName("ei.j()V")
    public void method2473() {
        for (int var1 = 0; var1 < this.field1883; var1++) {
            int var2 = this.field1856[var1];
            this.field1856[var1] = this.field1854[var1];
            this.field1854[var1] = -var2;
        }
        this.method2467();
    }

    @ObfuscatedName("ei.b(I)V")
    public void method2474(int arg0) {
        int var2 = field1913[arg0];
        int var3 = field1914[arg0];
        for (int var4 = 0; var4 < this.field1883; var4++) {
            int var5 = this.field1855[var4] * var3 - this.field1856[var4] * var2 >> 16;
            this.field1856[var4] = this.field1856[var4] * var3 + this.field1855[var4] * var2 >> 16;
            this.field1855[var4] = var5;
        }
        this.method2467();
    }

    @ObfuscatedName("ei.g(III)V")
    public void method2475(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1883; var4++) {
            this.field1854[var4] += arg0;
            this.field1855[var4] += arg1;
            this.field1856[var4] += arg2;
        }
        this.method2467();
    }

    @ObfuscatedName("ei.f(III)V")
    public void method2476(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1883; var4++) {
            this.field1854[var4] = this.field1854[var4] * arg0 / 128;
            this.field1855[var4] = this.field1855[var4] * arg1 / 128;
            this.field1856[var4] = this.field1856[var4] * arg2 / 128;
        }
        this.method2467();
    }

    @ObfuscatedName("ei.p(IIIIIII)V")
    public final void method2507(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1897[0] = -1;
        if (this.field1859 != 2 && this.field1859 != 1) {
            this.method2465();
        }
        int var8 = Statics.field1949;
        int var9 = Statics.field1951;
        int var10 = field1913[arg0];
        int var11 = field1914[arg0];
        int var12 = field1913[arg1];
        int var13 = field1914[arg1];
        int var14 = field1913[arg2];
        int var15 = field1914[arg2];
        int var16 = field1913[arg3];
        int var17 = field1914[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1883; var19++) {
            int var20 = this.field1854[var19];
            int var21 = this.field1855[var19];
            int var22 = this.field1856[var19];
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
            field1892[var19] = var30 - var18;
            field1890[var19] = class135.field1942 * var26 / var30 + var8;
            field1880[var19] = class135.field1942 * var29 / var30 + var9;
            if (this.field1867 > 0) {
                field1893[var19] = var26;
                field1894[var19] = var29;
                field1895[var19] = var30;
            }
        }
        try {
            this.method2480(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ei.e(IIIIIIII)V")
    public final void method2521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1897[0] = -1;
        if (this.field1859 != 2 && this.field1859 != 1) {
            this.method2465();
        }
        int var9 = Statics.field1949;
        int var10 = Statics.field1951;
        int var11 = field1913[arg0];
        int var12 = field1914[arg0];
        int var13 = field1913[arg1];
        int var14 = field1914[arg1];
        int var15 = field1913[arg2];
        int var16 = field1914[arg2];
        int var17 = field1913[arg3];
        int var18 = field1914[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1883; var20++) {
            int var21 = this.field1854[var20];
            int var22 = this.field1855[var20];
            int var23 = this.field1856[var20];
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
            field1892[var20] = var31 - var19;
            field1890[var20] = class135.field1942 * var27 / arg7 + var9;
            field1880[var20] = class135.field1942 * var30 / arg7 + var10;
            if (this.field1867 > 0) {
                field1893[var20] = var27;
                field1894[var20] = var30;
                field1895[var20] = var31;
            }
        }
        try {
            this.method2480(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ei.cf(IIIIIIIII)V")
    public void method2479(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1897[0] = -1;
        if (this.field1859 != 1) {
            this.method2512();
        }
        this.method2463(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1878 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1878) * class135.field1942;
        if (var15 / var13 >= Statics.field1955) {
            return;
        }
        int var16 = (this.field1878 + var14) * class135.field1942;
        if (var16 / var13 <= Statics.field1954) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1878 * arg1 >> 16;
        int var19 = (var17 + var18) * class135.field1942;
        if (var19 / var13 <= Statics.field1956) {
            return;
        }
        int var20 = (this.field2054 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class135.field1942;
        if (var21 / var13 >= Statics.field1957) {
            return;
        }
        int var22 = (this.field2054 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1867 > 0;
        int var26 = class133.field1923;
        int var28 = class133.method372();
        boolean var29 = class133.method4258();
        if (class8.field239 && arg8 > 0) {
            class8.method1578(this, arg5, arg6, arg7);
        }
        if (class8.field232 && arg8 > 0) {
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
            int var40 = var26 - Statics.field1949;
            int var41 = var28 - Statics.field1951;
            if (var40 > var35 && var40 < var36 && var41 > var37 && var41 < var38) {
                var39 = -256;
            }
            class8.method2855(Statics.field1949 + var35, Statics.field1951 + var37, Statics.field1949 + var36, Statics.field1951 + var38, var39);
        }
        boolean var42 = false;
        if (arg8 > 0 && var29) {
            boolean var43 = false;
            if (field1910) {
                var43 = class133.method2076(this, arg5, arg6, arg7);
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
                int var49 = var26 - Statics.field1949;
                int var50 = var28 - Statics.field1951;
                if (var49 > var45 && var49 < var46 && var50 > var47 && var50 < var48) {
                    var43 = true;
                }
            }
            if (var43) {
                if (this.field1875) {
                    class133.field1930[++class133.field1928 - 1] = arg8;
                } else {
                    var42 = true;
                }
            }
        }
        int var52 = Statics.field1949;
        int var53 = Statics.field1951;
        int var54 = 0;
        int var55 = 0;
        if (arg0 != 0) {
            var54 = field1913[arg0];
            var55 = field1914[arg0];
        }
        for (int var56 = 0; var56 < this.field1883; var56++) {
            int var57 = this.field1854[var56];
            int var58 = this.field1855[var56];
            int var59 = this.field1856[var56];
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
            field1892[var56] = var68 - var11;
            if (var68 >= 50) {
                field1890[var56] = class135.field1942 * var64 / var68 + var52;
                field1880[var56] = class135.field1942 * var67 / var68 + var53;
            } else {
                field1890[var56] = -5000;
                var23 = true;
            }
            if (var25) {
                field1893[var56] = var64;
                field1894[var56] = var67;
                field1895[var56] = var68;
            }
        }
        try {
            this.method2480(var23, var42, this.field1875, arg8);
        } catch (Exception var71) {
        }
    }

    @ObfuscatedName("ei.c(ZZZI)V")
    public final void method2480(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1879 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1879; var5++) {
            field1897[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field233 && arg1) {
            class8.method360(this, var6);
        }
        for (int var7 = 0; var7 < this.field1898; var7++) {
            if (this.field1863[var7] != -2) {
                int var8 = this.field1858[var7];
                int var9 = this.field1889[var7];
                int var10 = this.field1860[var7];
                int var11 = field1890[var8];
                int var12 = field1890[var9];
                int var13 = field1890[var10];
                if (arg0 && var11 == -5000 || var12 == -5000 || var13 == -5000) {
                    int var14 = field1893[var8];
                    int var15 = field1893[var9];
                    int var16 = field1893[var10];
                    int var17 = field1894[var8];
                    int var18 = field1894[var9];
                    int var19 = field1894[var10];
                    int var20 = field1895[var8];
                    int var21 = field1895[var9];
                    int var22 = field1895[var10];
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
                        field1849[var7] = true;
                        int var32 = (field1892[var8] + field1892[var9] + field1892[var10]) / 3 + this.field1903;
                        field1861[var32][field1897[var32]++] = var7;
                    }
                } else {
                    if (arg1) {
                        int var33 = field1880[var8];
                        int var34 = field1880[var9];
                        int var35 = field1880[var10];
                        int var36 = class133.field1919 + var6;
                        boolean var37;
                        if (var36 < var33 && var36 < var34 && var36 < var35) {
                            var37 = false;
                        } else {
                            int var38 = class133.field1919 - var6;
                            if (var38 > var33 && var38 > var34 && var38 > var35) {
                                var37 = false;
                            } else {
                                int var39 = class133.field1923 + var6;
                                if (var39 < var11 && var39 < var12 && var39 < var13) {
                                    var37 = false;
                                } else {
                                    int var40 = class133.field1923 - var6;
                                    if (var40 > var11 && var40 > var12 && var40 > var13) {
                                        var37 = false;
                                    } else {
                                        var37 = true;
                                    }
                                }
                            }
                        }
                        if (var37) {
                            class133.method1783(arg3);
                            arg1 = false;
                        }
                    }
                    if ((field1880[var10] - field1880[var9]) * (var11 - var12) - (field1880[var8] - field1880[var9]) * (var13 - var12) > 0) {
                        field1849[var7] = false;
                        if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= Statics.field1941 && var12 <= Statics.field1941 && var13 <= Statics.field1941) {
                            field1888[var7] = false;
                        } else {
                            field1888[var7] = true;
                        }
                        int var41 = (field1892[var8] + field1892[var9] + field1892[var10]) / 3 + this.field1903;
                        field1861[var41][field1897[var41]++] = var7;
                    }
                }
            }
        }
        if (this.field1864 == null) {
            for (int var42 = this.field1879 - 1; var42 >= 0; var42--) {
                int var43 = field1897[var42];
                if (var43 > 0) {
                    int[] var44 = field1861[var42];
                    for (int var45 = 0; var45 < var43; var45++) {
                        this.method2481(var44[var45]);
                    }
                }
            }
            return;
        }
        for (int var46 = 0; var46 < 12; var46++) {
            field1899[var46] = 0;
            field1902[var46] = 0;
        }
        for (int var47 = this.field1879 - 1; var47 >= 0; var47--) {
            int var48 = field1897[var47];
            if (var48 > 0) {
                int[] var49 = field1861[var47];
                for (int var50 = 0; var50 < var48; var50++) {
                    int var51 = var49[var50];
                    byte var52 = this.field1864[var51];
                    int var53 = field1899[var52]++;
                    field1900[var52][var53] = var51;
                    if (var52 < 10) {
                        field1902[var52] += var47;
                    } else if (var52 == 10) {
                        field1901[var53] = var47;
                    } else {
                        field1896[var53] = var47;
                    }
                }
            }
        }
        int var54 = 0;
        if (field1899[1] > 0 || field1899[2] > 0) {
            var54 = (field1902[1] + field1902[2]) / (field1899[1] + field1899[2]);
        }
        int var55 = 0;
        if (field1899[3] > 0 || field1899[4] > 0) {
            var55 = (field1902[3] + field1902[4]) / (field1899[3] + field1899[4]);
        }
        int var56 = 0;
        if (field1899[6] > 0 || field1899[8] > 0) {
            var56 = (field1902[6] + field1902[8]) / (field1899[6] + field1899[8]);
        }
        int var57 = 0;
        int var58 = field1899[10];
        int[] var59 = field1900[10];
        int[] var60 = field1901;
        if (var57 == var58) {
            var57 = 0;
            var58 = field1899[11];
            var59 = field1900[11];
            var60 = field1896;
        }
        int var61;
        if (var57 < var58) {
            var61 = var60[var57];
        } else {
            var61 = -1000;
        }
        for (int var62 = 0; var62 < 10; var62++) {
            while (var62 == 0 && var61 > var54) {
                this.method2481(var59[var57++]);
                if (var57 == var58 && field1900[11] != var59) {
                    var57 = 0;
                    var58 = field1899[11];
                    var59 = field1900[11];
                    var60 = field1896;
                }
                if (var57 < var58) {
                    var61 = var60[var57];
                } else {
                    var61 = -1000;
                }
            }
            while (var62 == 3 && var61 > var55) {
                this.method2481(var59[var57++]);
                if (var57 == var58 && field1900[11] != var59) {
                    var57 = 0;
                    var58 = field1899[11];
                    var59 = field1900[11];
                    var60 = field1896;
                }
                if (var57 < var58) {
                    var61 = var60[var57];
                } else {
                    var61 = -1000;
                }
            }
            while (var62 == 5 && var61 > var56) {
                this.method2481(var59[var57++]);
                if (var57 == var58 && field1900[11] != var59) {
                    var57 = 0;
                    var58 = field1899[11];
                    var59 = field1900[11];
                    var60 = field1896;
                }
                if (var57 < var58) {
                    var61 = var60[var57];
                } else {
                    var61 = -1000;
                }
            }
            int var63 = field1899[var62];
            int[] var64 = field1900[var62];
            for (int var65 = 0; var65 < var63; var65++) {
                this.method2481(var64[var65]);
            }
        }
        while (var61 != -1000) {
            this.method2481(var59[var57++]);
            if (var57 == var58 && field1900[11] != var59) {
                var57 = 0;
                var59 = field1900[11];
                var58 = field1899[11];
                var60 = field1896;
            }
            if (var57 < var58) {
                var61 = var60[var57];
            } else {
                var61 = -1000;
            }
        }
    }

    @ObfuscatedName("ei.ag(I)V")
    public final void method2481(int arg0) {
        if (field1849[arg0]) {
            this.method2482(arg0);
            return;
        }
        int var2 = this.field1858[arg0];
        int var3 = this.field1889[arg0];
        int var4 = this.field1860[arg0];
        class135.field1962 = field1888[arg0];
        if (this.field1865 == null) {
            class135.field1939 = 0;
        } else {
            class135.field1939 = this.field1865[arg0] & 0xFF;
        }
        if (this.field1852 != null && this.field1852[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1866 == null || this.field1866[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1866[arg0] & 0xFF;
                var6 = this.field1870[var5];
                var7 = this.field1869[var5];
                var8 = this.field1872[var5];
            }
            if (this.field1863[arg0] == -1) {
                class135.method2566(field1880[var2], field1880[var3], field1880[var4], field1890[var2], field1890[var3], field1890[var4], this.field1853[arg0], this.field1853[arg0], this.field1853[arg0], field1893[var6], field1893[var7], field1893[var8], field1894[var6], field1894[var7], field1894[var8], field1895[var6], field1895[var7], field1895[var8], this.field1852[arg0]);
            } else {
                class135.method2566(field1880[var2], field1880[var3], field1880[var4], field1890[var2], field1890[var3], field1890[var4], this.field1853[arg0], this.field1862[arg0], this.field1863[arg0], field1893[var6], field1893[var7], field1893[var8], field1894[var6], field1894[var7], field1894[var8], field1895[var6], field1895[var7], field1895[var8], this.field1852[arg0]);
            }
        } else if (this.field1863[arg0] == -1) {
            class135.method2611(field1880[var2], field1880[var3], field1880[var4], field1890[var2], field1890[var3], field1890[var4], field1915[this.field1853[arg0]]);
        } else {
            class135.method2562(field1880[var2], field1880[var3], field1880[var4], field1890[var2], field1890[var3], field1890[var4], this.field1853[arg0], this.field1862[arg0], this.field1863[arg0]);
        }
    }

    @ObfuscatedName("ei.at(I)V")
    public final void method2482(int arg0) {
        int var2 = Statics.field1949;
        int var3 = Statics.field1951;
        int var4 = 0;
        int var5 = this.field1858[arg0];
        int var6 = this.field1889[arg0];
        int var7 = this.field1860[arg0];
        int var8 = field1895[var5];
        int var9 = field1895[var6];
        int var10 = field1895[var7];
        if (this.field1865 == null) {
            class135.field1939 = 0;
        } else {
            class135.field1939 = this.field1865[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1904[var4] = field1890[var5];
            field1876[var4] = field1880[var5];
            field1906[var4++] = this.field1853[arg0];
        } else {
            int var11 = field1893[var5];
            int var12 = field1894[var5];
            int var13 = this.field1853[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1916[var10 - var8];
                field1904[var4] = (((field1893[var7] - var11) * var14 >> 16) + var11) * class135.field1942 / 50 + var2;
                field1876[var4] = (((field1894[var7] - var12) * var14 >> 16) + var12) * class135.field1942 / 50 + var3;
                field1906[var4++] = ((this.field1863[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1916[var9 - var8];
                field1904[var4] = (((field1893[var6] - var11) * var15 >> 16) + var11) * class135.field1942 / 50 + var2;
                field1876[var4] = (((field1894[var6] - var12) * var15 >> 16) + var12) * class135.field1942 / 50 + var3;
                field1906[var4++] = ((this.field1862[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1904[var4] = field1890[var6];
            field1876[var4] = field1880[var6];
            field1906[var4++] = this.field1862[arg0];
        } else {
            int var16 = field1893[var6];
            int var17 = field1894[var6];
            int var18 = this.field1862[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1916[var8 - var9];
                field1904[var4] = (((field1893[var5] - var16) * var19 >> 16) + var16) * class135.field1942 / 50 + var2;
                field1876[var4] = (((field1894[var5] - var17) * var19 >> 16) + var17) * class135.field1942 / 50 + var3;
                field1906[var4++] = ((this.field1853[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1916[var10 - var9];
                field1904[var4] = (((field1893[var7] - var16) * var20 >> 16) + var16) * class135.field1942 / 50 + var2;
                field1876[var4] = (((field1894[var7] - var17) * var20 >> 16) + var17) * class135.field1942 / 50 + var3;
                field1906[var4++] = ((this.field1863[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1904[var4] = field1890[var7];
            field1876[var4] = field1880[var7];
            field1906[var4++] = this.field1863[arg0];
        } else {
            int var21 = field1893[var7];
            int var22 = field1894[var7];
            int var23 = this.field1863[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1916[var9 - var10];
                field1904[var4] = (((field1893[var6] - var21) * var24 >> 16) + var21) * class135.field1942 / 50 + var2;
                field1876[var4] = (((field1894[var6] - var22) * var24 >> 16) + var22) * class135.field1942 / 50 + var3;
                field1906[var4++] = ((this.field1862[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1916[var8 - var10];
                field1904[var4] = (((field1893[var5] - var21) * var25 >> 16) + var21) * class135.field1942 / 50 + var2;
                field1876[var4] = (((field1894[var5] - var22) * var25 >> 16) + var22) * class135.field1942 / 50 + var3;
                field1906[var4++] = ((this.field1853[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1904[0];
        int var27 = field1904[1];
        int var28 = field1904[2];
        int var29 = field1876[0];
        int var30 = field1876[1];
        int var31 = field1876[2];
        class135.field1962 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1941 || var27 > Statics.field1941 || var28 > Statics.field1941) {
                class135.field1962 = true;
            }
            if (this.field1852 != null && this.field1852[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1866 == null || this.field1866[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1866[arg0] & 0xFF;
                    var33 = this.field1870[var32];
                    var34 = this.field1869[var32];
                    var35 = this.field1872[var32];
                }
                if (this.field1863[arg0] == -1) {
                    class135.method2566(var29, var30, var31, var26, var27, var28, this.field1853[arg0], this.field1853[arg0], this.field1853[arg0], field1893[var33], field1893[var34], field1893[var35], field1894[var33], field1894[var34], field1894[var35], field1895[var33], field1895[var34], field1895[var35], this.field1852[arg0]);
                } else {
                    class135.method2566(var29, var30, var31, var26, var27, var28, field1906[0], field1906[1], field1906[2], field1893[var33], field1893[var34], field1893[var35], field1894[var33], field1894[var34], field1894[var35], field1895[var33], field1895[var34], field1895[var35], this.field1852[arg0]);
                }
            } else if (this.field1863[arg0] == -1) {
                class135.method2611(var29, var30, var31, var26, var27, var28, field1915[this.field1853[arg0]]);
            } else {
                class135.method2562(var29, var30, var31, var26, var27, var28, field1906[0], field1906[1], field1906[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1941 || var27 > Statics.field1941 || var28 > Statics.field1941 || field1904[3] < 0 || field1904[3] > Statics.field1941) {
            class135.field1962 = true;
        }
        if (this.field1852 != null && this.field1852[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1866 == null || this.field1866[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1866[arg0] & 0xFF;
                var37 = this.field1870[var36];
                var38 = this.field1869[var36];
                var39 = this.field1872[var36];
            }
            short var40 = this.field1852[arg0];
            if (this.field1863[arg0] == -1) {
                class135.method2566(var29, var30, var31, var26, var27, var28, this.field1853[arg0], this.field1853[arg0], this.field1853[arg0], field1893[var37], field1893[var38], field1893[var39], field1894[var37], field1894[var38], field1894[var39], field1895[var37], field1895[var38], field1895[var39], var40);
                class135.method2566(var29, var31, field1876[3], var26, var28, field1904[3], this.field1853[arg0], this.field1853[arg0], this.field1853[arg0], field1893[var37], field1893[var38], field1893[var39], field1894[var37], field1894[var38], field1894[var39], field1895[var37], field1895[var38], field1895[var39], var40);
            } else {
                class135.method2566(var29, var30, var31, var26, var27, var28, field1906[0], field1906[1], field1906[2], field1893[var37], field1893[var38], field1893[var39], field1894[var37], field1894[var38], field1894[var39], field1895[var37], field1895[var38], field1895[var39], var40);
                class135.method2566(var29, var31, field1876[3], var26, var28, field1904[3], field1906[0], field1906[2], field1906[3], field1893[var37], field1893[var38], field1893[var39], field1894[var37], field1894[var38], field1894[var39], field1895[var37], field1895[var38], field1895[var39], var40);
            }
        } else if (this.field1863[arg0] == -1) {
            int var41 = field1915[this.field1853[arg0]];
            class135.method2611(var29, var30, var31, var26, var27, var28, var41);
            class135.method2611(var29, var31, field1876[3], var26, var28, field1904[3], var41);
        } else {
            class135.method2562(var29, var30, var31, var26, var27, var28, field1906[0], field1906[1], field1906[2]);
            class135.method2562(var29, var31, field1876[3], var26, var28, field1904[3], field1906[0], field1906[2], field1906[3]);
        }
    }
}
