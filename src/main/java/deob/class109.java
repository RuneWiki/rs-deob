package deob;

@ObfuscatedName("do")
public class class109 extends class89 {

    @ObfuscatedName("do.i")
    public static class109 field1873 = new class109();

    @ObfuscatedName("do.h")
    public static byte[] field1891 = new byte[1];

    @ObfuscatedName("do.e")
    public static class109 field1858 = new class109();

    @ObfuscatedName("do.g")
    public static byte[] field1859 = new byte[1];

    @ObfuscatedName("do.n")
    public int field1860 = 0;

    @ObfuscatedName("do.u")
    public int[] field1861;

    @ObfuscatedName("do.d")
    public int[] field1906;

    @ObfuscatedName("do.l")
    public int[] field1871;

    @ObfuscatedName("do.m")
    public int field1864 = 0;

    @ObfuscatedName("do.j")
    public int[] field1907;

    @ObfuscatedName("do.y")
    public int[] field1866;

    @ObfuscatedName("do.s")
    public int[] field1867;

    @ObfuscatedName("do.p")
    public int[] field1872;

    @ObfuscatedName("do.v")
    public int[] field1886;

    @ObfuscatedName("do.r")
    public int[] field1857;

    @ObfuscatedName("do.c")
    public byte[] field1904;

    @ObfuscatedName("do.w")
    public byte[] field1913;

    @ObfuscatedName("do.x")
    public byte[] field1874;

    @ObfuscatedName("do.k")
    public short[] field1885;

    @ObfuscatedName("do.z")
    public byte field1875 = 0;

    @ObfuscatedName("do.q")
    public int field1876 = 0;

    @ObfuscatedName("do.o")
    public int[] field1909;

    @ObfuscatedName("do.f")
    public int[] field1878;

    @ObfuscatedName("do.b")
    public int[] field1919;

    @ObfuscatedName("do.t")
    public int[][] field1880;

    @ObfuscatedName("do.a")
    public int[][] field1881;

    @ObfuscatedName("do.am")
    public boolean field1882 = false;

    @ObfuscatedName("do.as")
    public int field1883;

    @ObfuscatedName("do.ad")
    public int field1884;

    @ObfuscatedName("do.af")
    public int field1868;

    @ObfuscatedName("do.ak")
    public int field1911;

    @ObfuscatedName("do.aq")
    public int field1887;

    @ObfuscatedName("do.ag")
    public static boolean[] field1889 = new boolean[4700];

    @ObfuscatedName("do.al")
    public static boolean[] field1890 = new boolean[4700];

    @ObfuscatedName("do.au")
    public static int[] field1870 = new int[4700];

    @ObfuscatedName("do.ar")
    public static int[] field1914 = new int[4700];

    @ObfuscatedName("do.aw")
    public static int[] field1893 = new int[4700];

    @ObfuscatedName("do.ah")
    public static int[] field1877 = new int[4700];

    @ObfuscatedName("do.ao")
    public static int[] field1895 = new int[4700];

    @ObfuscatedName("do.ax")
    public static int[] field1896 = new int[4700];

    @ObfuscatedName("do.ai")
    public static int[] field1898 = new int[1600];

    @ObfuscatedName("do.ap")
    public static int[][] field1899 = new int[1600][512];

    @ObfuscatedName("do.aa")
    public static int[] field1900 = new int[12];

    @ObfuscatedName("do.ay")
    public static int[][] field1901 = new int[12][2000];

    @ObfuscatedName("do.ab")
    public static int[] field1902 = new int[2000];

    @ObfuscatedName("do.aj")
    public static int[] field1903 = new int[2000];

    @ObfuscatedName("do.az")
    public static int[] field1863 = new int[12];

    @ObfuscatedName("do.av")
    public static int[] field1905 = new int[10];

    @ObfuscatedName("do.ae")
    public static int[] field1894 = new int[10];

    @ObfuscatedName("do.at")
    public static int[] field1892 = new int[10];

    @ObfuscatedName("do.by")
    public static boolean field1856 = false;

    @ObfuscatedName("do.bu")
    public static int field1912 = 0;

    @ObfuscatedName("do.bb")
    public static int field1865 = 0;

    @ObfuscatedName("do.bx")
    public static int field1869 = 0;

    @ObfuscatedName("do.ba")
    public static int[] field1915 = new int[1000];

    @ObfuscatedName("do.bq")
    public static int[] field1916 = class95.field1624;

    @ObfuscatedName("do.bs")
    public static int[] field1917 = class95.field1643;

    @ObfuscatedName("do.bn")
    public static int[] field1918 = class95.field1638;

    @ObfuscatedName("do.bj")
    public static int[] field1879 = class95.field1641;

    public class109() {
    }

    public class109(class109[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1860 = 0;
        this.field1864 = 0;
        this.field1876 = 0;
        this.field1875 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class109 var8 = arg0[var7];
            if (var8 != null) {
                this.field1860 += var8.field1860;
                this.field1864 += var8.field1864;
                this.field1876 += var8.field1876;
                if (var8.field1904 == null) {
                    if (this.field1875 == -1) {
                        this.field1875 = var8.field1875;
                    }
                    if (this.field1875 != var8.field1875) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1913 != null;
                var5 |= var8.field1885 != null;
                var6 |= var8.field1874 != null;
            }
        }
        this.field1861 = new int[this.field1860];
        this.field1906 = new int[this.field1860];
        this.field1871 = new int[this.field1860];
        this.field1907 = new int[this.field1864];
        this.field1866 = new int[this.field1864];
        this.field1867 = new int[this.field1864];
        this.field1872 = new int[this.field1864];
        this.field1886 = new int[this.field1864];
        this.field1857 = new int[this.field1864];
        if (var3) {
            this.field1904 = new byte[this.field1864];
        }
        if (var4) {
            this.field1913 = new byte[this.field1864];
        }
        if (var5) {
            this.field1885 = new short[this.field1864];
        }
        if (var6) {
            this.field1874 = new byte[this.field1864];
        }
        if (this.field1876 > 0) {
            this.field1909 = new int[this.field1876];
            this.field1878 = new int[this.field1876];
            this.field1919 = new int[this.field1876];
        }
        this.field1860 = 0;
        this.field1864 = 0;
        this.field1876 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class109 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1864; var11++) {
                    this.field1907[this.field1864] = var10.field1907[var11] + this.field1860;
                    this.field1866[this.field1864] = var10.field1866[var11] + this.field1860;
                    this.field1867[this.field1864] = var10.field1867[var11] + this.field1860;
                    this.field1872[this.field1864] = var10.field1872[var11];
                    this.field1886[this.field1864] = var10.field1886[var11];
                    this.field1857[this.field1864] = var10.field1857[var11];
                    if (var3) {
                        if (var10.field1904 == null) {
                            this.field1904[this.field1864] = var10.field1875;
                        } else {
                            this.field1904[this.field1864] = var10.field1904[var11];
                        }
                    }
                    if (var4 && var10.field1913 != null) {
                        this.field1913[this.field1864] = var10.field1913[var11];
                    }
                    if (var5) {
                        if (var10.field1885 == null) {
                            this.field1885[this.field1864] = -1;
                        } else {
                            this.field1885[this.field1864] = var10.field1885[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1874 == null || var10.field1874[var11] == -1) {
                            this.field1874[this.field1864] = -1;
                        } else {
                            this.field1874[this.field1864] = (byte) (var10.field1874[var11] + this.field1876);
                        }
                    }
                    this.field1864++;
                }
                for (int var12 = 0; var12 < var10.field1876; var12++) {
                    this.field1909[this.field1876] = var10.field1909[var12] + this.field1860;
                    this.field1878[this.field1876] = var10.field1878[var12] + this.field1860;
                    this.field1919[this.field1876] = var10.field1919[var12] + this.field1860;
                    this.field1876++;
                }
                for (int var13 = 0; var13 < var10.field1860; var13++) {
                    this.field1861[this.field1860] = var10.field1861[var13];
                    this.field1906[this.field1860] = var10.field1906[var13];
                    this.field1871[this.field1860] = var10.field1871[var13];
                    this.field1860++;
                }
            }
        }
    }

    @ObfuscatedName("do.i([[IIIIZI)Ldo;")
    public class109 method2223(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2204();
        int var7 = arg1 - this.field1868;
        int var8 = this.field1868 + arg1;
        int var9 = arg3 - this.field1868;
        int var10 = this.field1868 + arg3;
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
            var15.field1860 = this.field1860;
            var15.field1864 = this.field1864;
            var15.field1876 = this.field1876;
            var15.field1861 = this.field1861;
            var15.field1871 = this.field1871;
            var15.field1907 = this.field1907;
            var15.field1866 = this.field1866;
            var15.field1867 = this.field1867;
            var15.field1872 = this.field1872;
            var15.field1886 = this.field1886;
            var15.field1857 = this.field1857;
            var15.field1904 = this.field1904;
            var15.field1913 = this.field1913;
            var15.field1874 = this.field1874;
            var15.field1885 = this.field1885;
            var15.field1875 = this.field1875;
            var15.field1909 = this.field1909;
            var15.field1878 = this.field1878;
            var15.field1919 = this.field1919;
            var15.field1880 = this.field1880;
            var15.field1881 = this.field1881;
            var15.field1882 = this.field1882;
            var15.field1906 = new int[var15.field1860];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1860; var16++) {
                int var17 = this.field1861[var16] + arg1;
                int var18 = this.field1871[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1906[var16] = this.field1906[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1860; var26++) {
                int var27 = (-this.field1906[var26] << 16) / this.field1511;
                if (var27 < arg5) {
                    int var28 = this.field1861[var26] + arg1;
                    int var29 = this.field1871[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1906[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1906[var26];
                }
            }
        }
        var15.field1883 = 0;
        return var15;
    }

    @ObfuscatedName("do.h(Z)Ldo;")
    public class109 method2227(boolean arg0) {
        if (!arg0 && field1891.length < this.field1864) {
            field1891 = new byte[this.field1864 + 100];
        }
        return this.method2202(arg0, field1873, field1891);
    }

    @ObfuscatedName("do.g(Z)Ldo;")
    public class109 method2252(boolean arg0) {
        if (!arg0 && field1859.length < this.field1864) {
            field1859 = new byte[this.field1864 + 100];
        }
        return this.method2202(arg0, field1858, field1859);
    }

    @ObfuscatedName("do.n(ZLdo;[B)Ldo;")
    public class109 method2202(boolean arg0, class109 arg1, byte[] arg2) {
        arg1.field1860 = this.field1860;
        arg1.field1864 = this.field1864;
        arg1.field1876 = this.field1876;
        if (arg1.field1861 == null || arg1.field1861.length < this.field1860) {
            arg1.field1861 = new int[this.field1860 + 100];
            arg1.field1906 = new int[this.field1860 + 100];
            arg1.field1871 = new int[this.field1860 + 100];
        }
        for (int var4 = 0; var4 < this.field1860; var4++) {
            arg1.field1861[var4] = this.field1861[var4];
            arg1.field1906[var4] = this.field1906[var4];
            arg1.field1871[var4] = this.field1871[var4];
        }
        if (arg0) {
            arg1.field1913 = this.field1913;
        } else {
            arg1.field1913 = arg2;
            if (this.field1913 == null) {
                for (int var5 = 0; var5 < this.field1864; var5++) {
                    arg1.field1913[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1864; var6++) {
                    arg1.field1913[var6] = this.field1913[var6];
                }
            }
        }
        arg1.field1907 = this.field1907;
        arg1.field1866 = this.field1866;
        arg1.field1867 = this.field1867;
        arg1.field1872 = this.field1872;
        arg1.field1886 = this.field1886;
        arg1.field1857 = this.field1857;
        arg1.field1904 = this.field1904;
        arg1.field1874 = this.field1874;
        arg1.field1885 = this.field1885;
        arg1.field1875 = this.field1875;
        arg1.field1909 = this.field1909;
        arg1.field1878 = this.field1878;
        arg1.field1919 = this.field1919;
        arg1.field1880 = this.field1880;
        arg1.field1881 = this.field1881;
        arg1.field1882 = this.field1882;
        arg1.field1883 = 0;
        return arg1;
    }

    @ObfuscatedName("do.u()V")
    public void method2204() {
        if (this.field1883 == 1) {
            return;
        }
        this.field1883 = 1;
        this.field1511 = 0;
        this.field1884 = 0;
        this.field1868 = 0;
        for (int var1 = 0; var1 < this.field1860; var1++) {
            int var2 = this.field1861[var1];
            int var3 = this.field1906[var1];
            int var4 = this.field1871[var1];
            if (-var3 > this.field1511) {
                this.field1511 = -var3;
            }
            if (var3 > this.field1884) {
                this.field1884 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1868) {
                this.field1868 = var5;
            }
        }
        this.field1868 = (int) (Math.sqrt((double) this.field1868) + 0.99D);
        this.field1887 = (int) (Math.sqrt((double) (this.field1511 * this.field1511 + this.field1868 * this.field1868)) + 0.99D);
        this.field1911 = this.field1887 + (int) (Math.sqrt((double) (this.field1884 * this.field1884 + this.field1868 * this.field1868)) + 0.99D);
    }

    @ObfuscatedName("do.d()V")
    public void method2205() {
        if (this.field1883 == 2) {
            return;
        }
        this.field1883 = 2;
        this.field1868 = 0;
        for (int var1 = 0; var1 < this.field1860; var1++) {
            int var2 = this.field1861[var1];
            int var3 = this.field1906[var1];
            int var4 = this.field1871[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1868) {
                this.field1868 = var5;
            }
        }
        this.field1868 = (int) (Math.sqrt((double) this.field1868) + 0.99D);
        this.field1887 = this.field1868;
        this.field1911 = this.field1868 + this.field1868;
    }

    @ObfuscatedName("do.l()I")
    public int method2206() {
        this.method2204();
        return this.field1868;
    }

    @ObfuscatedName("do.m(Ldd;I)V")
    public void method2207(class107 arg0, int arg1) {
        if (this.field1880 == null || arg1 == -1) {
            return;
        }
        class92 var3 = arg0.field1835[arg1];
        class106 var4 = var3.field1594;
        Statics.field1908 = 0;
        Statics.field1862 = 0;
        Statics.field1910 = 0;
        for (int var5 = 0; var5 < var3.field1595; var5++) {
            int var6 = var3.field1596[var5];
            this.method2201(var4.field1819[var6], var4.field1821[var6], var3.field1597[var5], var3.field1598[var5], var3.field1590[var5]);
        }
        this.field1883 = 0;
    }

    @ObfuscatedName("do.j(Ldd;ILdd;I[I)V")
    public void method2208(class107 arg0, int arg1, class107 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2207(arg0, arg1);
            return;
        }
        class92 var6 = arg0.field1835[arg1];
        class92 var7 = arg2.field1835[arg3];
        class106 var8 = var6.field1594;
        Statics.field1908 = 0;
        Statics.field1862 = 0;
        Statics.field1910 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1595; var11++) {
            int var12 = var6.field1596[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1819[var12] == 0) {
                this.method2201(var8.field1819[var12], var8.field1821[var12], var6.field1597[var11], var6.field1598[var11], var6.field1590[var11]);
            }
        }
        Statics.field1908 = 0;
        Statics.field1862 = 0;
        Statics.field1910 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1595; var15++) {
            int var16 = var7.field1596[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1819[var16] == 0) {
                this.method2201(var8.field1819[var16], var8.field1821[var16], var7.field1597[var15], var7.field1598[var15], var7.field1590[var15]);
            }
        }
        this.field1883 = 0;
    }

    @ObfuscatedName("do.r(I[IIII)V")
    public void method2201(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1908 = 0;
            Statics.field1862 = 0;
            Statics.field1910 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1880.length) {
                    int[] var10 = this.field1880[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1908 += this.field1861[var12];
                        Statics.field1862 += this.field1906[var12];
                        Statics.field1910 += this.field1871[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1908 = Statics.field1908 / var7 + arg2;
                Statics.field1862 = Statics.field1862 / var7 + arg3;
                Statics.field1910 = Statics.field1910 / var7 + arg4;
            } else {
                Statics.field1908 = arg2;
                Statics.field1862 = arg3;
                Statics.field1910 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1880.length) {
                    int[] var15 = this.field1880[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1861[var17] += arg2;
                        this.field1906[var17] += arg3;
                        this.field1871[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1880.length) {
                    int[] var20 = this.field1880[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1861[var22] -= Statics.field1908;
                        this.field1906[var22] -= Statics.field1862;
                        this.field1871[var22] -= Statics.field1910;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1916[var25];
                            int var27 = field1917[var25];
                            int var28 = this.field1906[var22] * var26 + this.field1861[var22] * var27 >> 16;
                            this.field1906[var22] = this.field1906[var22] * var27 - this.field1861[var22] * var26 >> 16;
                            this.field1861[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1916[var23];
                            int var30 = field1917[var23];
                            int var31 = this.field1906[var22] * var30 - this.field1871[var22] * var29 >> 16;
                            this.field1871[var22] = this.field1906[var22] * var29 + this.field1871[var22] * var30 >> 16;
                            this.field1906[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1916[var24];
                            int var33 = field1917[var24];
                            int var34 = this.field1871[var22] * var32 + this.field1861[var22] * var33 >> 16;
                            this.field1871[var22] = this.field1871[var22] * var33 - this.field1861[var22] * var32 >> 16;
                            this.field1861[var22] = var34;
                        }
                        this.field1861[var22] += Statics.field1908;
                        this.field1906[var22] += Statics.field1862;
                        this.field1871[var22] += Statics.field1910;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1880.length) {
                    int[] var37 = this.field1880[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1861[var39] -= Statics.field1908;
                        this.field1906[var39] -= Statics.field1862;
                        this.field1871[var39] -= Statics.field1910;
                        this.field1861[var39] = this.field1861[var39] * arg2 / 128;
                        this.field1906[var39] = this.field1906[var39] * arg3 / 128;
                        this.field1871[var39] = this.field1871[var39] * arg4 / 128;
                        this.field1861[var39] += Statics.field1908;
                        this.field1906[var39] += Statics.field1862;
                        this.field1871[var39] += Statics.field1910;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1881 != null && this.field1913 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1881.length) {
                    int[] var42 = this.field1881[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1913[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1913[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("do.c()V")
    public void method2210() {
        for (int var1 = 0; var1 < this.field1860; var1++) {
            int var2 = this.field1861[var1];
            this.field1861[var1] = this.field1871[var1];
            this.field1871[var1] = -var2;
        }
        this.field1883 = 0;
    }

    @ObfuscatedName("do.w()V")
    public void method2230() {
        for (int var1 = 0; var1 < this.field1860; var1++) {
            this.field1861[var1] = -this.field1861[var1];
            this.field1871[var1] = -this.field1871[var1];
        }
        this.field1883 = 0;
    }

    @ObfuscatedName("do.x()V")
    public void method2212() {
        for (int var1 = 0; var1 < this.field1860; var1++) {
            int var2 = this.field1871[var1];
            this.field1871[var1] = this.field1861[var1];
            this.field1861[var1] = -var2;
        }
        this.field1883 = 0;
    }

    @ObfuscatedName("do.k(I)V")
    public void method2213(int arg0) {
        int var2 = field1916[arg0];
        int var3 = field1917[arg0];
        for (int var4 = 0; var4 < this.field1860; var4++) {
            int var5 = this.field1906[var4] * var3 - this.field1871[var4] * var2 >> 16;
            this.field1871[var4] = this.field1906[var4] * var2 + this.field1871[var4] * var3 >> 16;
            this.field1906[var4] = var5;
        }
        this.field1883 = 0;
    }

    @ObfuscatedName("do.z(III)V")
    public void method2214(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1860; var4++) {
            this.field1861[var4] += arg0;
            this.field1906[var4] += arg1;
            this.field1871[var4] += arg2;
        }
        this.field1883 = 0;
    }

    @ObfuscatedName("do.q(III)V")
    public void method2215(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1860; var4++) {
            this.field1861[var4] = this.field1861[var4] * arg0 / 128;
            this.field1906[var4] = this.field1906[var4] * arg1 / 128;
            this.field1871[var4] = this.field1871[var4] * arg2 / 128;
        }
        this.field1883 = 0;
    }

    @ObfuscatedName("do.o(IIIIIII)V")
    public final void method2216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1898[0] = -1;
        if (this.field1883 != 2 && this.field1883 != 1) {
            this.method2205();
        }
        int var8 = Statics.field1620;
        int var9 = Statics.field1630;
        int var10 = field1916[arg0];
        int var11 = field1917[arg0];
        int var12 = field1916[arg1];
        int var13 = field1917[arg1];
        int var14 = field1916[arg2];
        int var15 = field1917[arg2];
        int var16 = field1916[arg3];
        int var17 = field1917[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1860; var19++) {
            int var20 = this.field1861[var19];
            int var21 = this.field1906[var19];
            int var22 = this.field1871[var19];
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
            field1893[var19] = var30 - var18;
            field1870[var19] = class95.field1629 * var26 / var30 + var8;
            field1914[var19] = class95.field1629 * var29 / var30 + var9;
            if (this.field1876 > 0) {
                field1877[var19] = var26;
                field1895[var19] = var29;
                field1896[var19] = var30;
            }
        }
        try {
            this.method2219(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("do.f(IIIIIIII)V")
    public final void method2217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1898[0] = -1;
        if (this.field1883 != 2 && this.field1883 != 1) {
            this.method2205();
        }
        int var9 = Statics.field1620;
        int var10 = Statics.field1630;
        int var11 = field1916[arg0];
        int var12 = field1917[arg0];
        int var13 = field1916[arg1];
        int var14 = field1917[arg1];
        int var15 = field1916[arg2];
        int var16 = field1917[arg2];
        int var17 = field1916[arg3];
        int var18 = field1917[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1860; var20++) {
            int var21 = this.field1861[var20];
            int var22 = this.field1906[var20];
            int var23 = this.field1871[var20];
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
            field1893[var20] = var31 - var19;
            field1870[var20] = class95.field1629 * var27 / arg7 + var9;
            field1914[var20] = class95.field1629 * var30 / arg7 + var10;
            if (this.field1876 > 0) {
                field1877[var20] = var27;
                field1895[var20] = var30;
                field1896[var20] = var31;
            }
        }
        try {
            this.method2219(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("do.ao(IIIIIIIII)V")
    public void method1830(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1898[0] = -1;
        if (this.field1883 != 1) {
            this.method2204();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1868 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1868) * class95.field1629;
        if (var15 / var13 >= Statics.field1619) {
            return;
        }
        int var16 = (this.field1868 + var14) * class95.field1629;
        if (var16 / var13 <= Statics.field1635) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1868 * arg1 >> 16;
        int var19 = (var17 + var18) * class95.field1629;
        if (var19 / var13 <= Statics.field1642) {
            return;
        }
        int var20 = (this.field1511 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class95.field1629;
        if (var21 / var13 >= Statics.field1636) {
            return;
        }
        int var22 = (this.field1511 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1876 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1856) {
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
            int var32 = field1912 - Statics.field1620;
            int var33 = field1865 - Statics.field1630;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1882) {
                    field1915[field1869++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1620;
        int var35 = Statics.field1630;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1916[arg0];
            var37 = field1917[arg0];
        }
        for (int var38 = 0; var38 < this.field1860; var38++) {
            int var39 = this.field1861[var38];
            int var40 = this.field1906[var38];
            int var41 = this.field1871[var38];
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
            field1893[var38] = var50 - var11;
            if (var50 >= 50) {
                field1870[var38] = class95.field1629 * var46 / var50 + var34;
                field1914[var38] = class95.field1629 * var49 / var50 + var35;
            } else {
                field1870[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1877[var38] = var46;
                field1895[var38] = var49;
                field1896[var38] = var50;
            }
        }
        try {
            this.method2219(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("do.b(ZZI)V")
    public final void method2219(boolean arg0, boolean arg1, int arg2) {
        if (this.field1911 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1911; var4++) {
            field1898[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1864; var5++) {
            if (this.field1857[var5] != -2) {
                int var6 = this.field1907[var5];
                int var7 = this.field1866[var5];
                int var8 = this.field1867[var5];
                int var9 = field1870[var6];
                int var10 = field1870[var7];
                int var11 = field1870[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1877[var6];
                    int var13 = field1877[var7];
                    int var14 = field1877[var8];
                    int var15 = field1895[var6];
                    int var16 = field1895[var7];
                    int var17 = field1895[var8];
                    int var18 = field1896[var6];
                    int var19 = field1896[var7];
                    int var20 = field1896[var8];
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
                        field1890[var5] = true;
                        int var30 = (field1893[var6] + field1893[var7] + field1893[var8]) / 3 + this.field1887;
                        field1899[var30][field1898[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2222(field1912, field1865, field1914[var6], field1914[var7], field1914[var8], var9, var10, var11)) {
                        field1915[field1869++] = arg2;
                        arg1 = false;
                    }
                    if ((field1914[var8] - field1914[var7]) * (var9 - var10) - (field1914[var6] - field1914[var7]) * (var11 - var10) > 0) {
                        field1890[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1634 && var10 <= Statics.field1634 && var11 <= Statics.field1634) {
                            field1889[var5] = false;
                        } else {
                            field1889[var5] = true;
                        }
                        int var31 = (field1893[var6] + field1893[var7] + field1893[var8]) / 3 + this.field1887;
                        field1899[var31][field1898[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1904 == null) {
            for (int var32 = this.field1911 - 1; var32 >= 0; var32--) {
                int var33 = field1898[var32];
                if (var33 > 0) {
                    int[] var34 = field1899[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2220(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1900[var36] = 0;
            field1863[var36] = 0;
        }
        for (int var37 = this.field1911 - 1; var37 >= 0; var37--) {
            int var38 = field1898[var37];
            if (var38 > 0) {
                int[] var39 = field1899[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1904[var41];
                    int var43 = field1900[var42]++;
                    field1901[var42][var43] = var41;
                    if (var42 < 10) {
                        field1863[var42] += var37;
                    } else if (var42 == 10) {
                        field1902[var43] = var37;
                    } else {
                        field1903[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1900[1] > 0 || field1900[2] > 0) {
            var44 = (field1863[1] + field1863[2]) / (field1900[1] + field1900[2]);
        }
        int var45 = 0;
        if (field1900[3] > 0 || field1900[4] > 0) {
            var45 = (field1863[3] + field1863[4]) / (field1900[3] + field1900[4]);
        }
        int var46 = 0;
        if (field1900[6] > 0 || field1900[8] > 0) {
            var46 = (field1863[6] + field1863[8]) / (field1900[6] + field1900[8]);
        }
        int var47 = 0;
        int var48 = field1900[10];
        int[] var49 = field1901[10];
        int[] var50 = field1902;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1900[11];
            var49 = field1901[11];
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
                this.method2220(var49[var47++]);
                if (var47 == var48 && field1901[11] != var49) {
                    var47 = 0;
                    var48 = field1900[11];
                    var49 = field1901[11];
                    var50 = field1903;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2220(var49[var47++]);
                if (var47 == var48 && field1901[11] != var49) {
                    var47 = 0;
                    var48 = field1900[11];
                    var49 = field1901[11];
                    var50 = field1903;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2220(var49[var47++]);
                if (var47 == var48 && field1901[11] != var49) {
                    var47 = 0;
                    var48 = field1900[11];
                    var49 = field1901[11];
                    var50 = field1903;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1900[var52];
            int[] var54 = field1901[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2220(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2220(var49[var47++]);
            if (var47 == var48 && field1901[11] != var49) {
                var47 = 0;
                var49 = field1901[11];
                var48 = field1900[11];
                var50 = field1903;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("do.t(I)V")
    public final void method2220(int arg0) {
        if (field1890[arg0]) {
            this.method2221(arg0);
            return;
        }
        int var2 = this.field1907[arg0];
        int var3 = this.field1866[arg0];
        int var4 = this.field1867[arg0];
        class95.field1628 = field1889[arg0];
        if (this.field1913 == null) {
            class95.field1623 = 0;
        } else {
            class95.field1623 = this.field1913[arg0] & 0xFF;
        }
        if (this.field1885 != null && this.field1885[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1874 == null || this.field1874[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1874[arg0] & 0xFF;
                var6 = this.field1909[var5];
                var7 = this.field1878[var5];
                var8 = this.field1919[var5];
            }
            if (this.field1857[arg0] == -1) {
                class95.method2038(field1914[var2], field1914[var3], field1914[var4], field1870[var2], field1870[var3], field1870[var4], this.field1872[arg0], this.field1872[arg0], this.field1872[arg0], field1877[var6], field1877[var7], field1877[var8], field1895[var6], field1895[var7], field1895[var8], field1896[var6], field1896[var7], field1896[var8], this.field1885[arg0]);
            } else {
                class95.method2038(field1914[var2], field1914[var3], field1914[var4], field1870[var2], field1870[var3], field1870[var4], this.field1872[arg0], this.field1886[arg0], this.field1857[arg0], field1877[var6], field1877[var7], field1877[var8], field1895[var6], field1895[var7], field1895[var8], field1896[var6], field1896[var7], field1896[var8], this.field1885[arg0]);
            }
        } else if (this.field1857[arg0] == -1) {
            class95.method2036(field1914[var2], field1914[var3], field1914[var4], field1870[var2], field1870[var3], field1870[var4], field1918[this.field1872[arg0]]);
        } else {
            class95.method2034(field1914[var2], field1914[var3], field1914[var4], field1870[var2], field1870[var3], field1870[var4], this.field1872[arg0], this.field1886[arg0], this.field1857[arg0]);
        }
    }

    @ObfuscatedName("do.a(I)V")
    public final void method2221(int arg0) {
        int var2 = Statics.field1620;
        int var3 = Statics.field1630;
        int var4 = 0;
        int var5 = this.field1907[arg0];
        int var6 = this.field1866[arg0];
        int var7 = this.field1867[arg0];
        int var8 = field1896[var5];
        int var9 = field1896[var6];
        int var10 = field1896[var7];
        if (this.field1913 == null) {
            class95.field1623 = 0;
        } else {
            class95.field1623 = this.field1913[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1905[var4] = field1870[var5];
            field1894[var4] = field1914[var5];
            field1892[var4++] = this.field1872[arg0];
        } else {
            int var11 = field1877[var5];
            int var12 = field1895[var5];
            int var13 = this.field1872[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1879[var10 - var8];
                field1905[var4] = (((field1877[var7] - var11) * var14 >> 16) + var11) * class95.field1629 / 50 + var2;
                field1894[var4] = (((field1895[var7] - var12) * var14 >> 16) + var12) * class95.field1629 / 50 + var3;
                field1892[var4++] = ((this.field1857[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1879[var9 - var8];
                field1905[var4] = (((field1877[var6] - var11) * var15 >> 16) + var11) * class95.field1629 / 50 + var2;
                field1894[var4] = (((field1895[var6] - var12) * var15 >> 16) + var12) * class95.field1629 / 50 + var3;
                field1892[var4++] = ((this.field1886[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1905[var4] = field1870[var6];
            field1894[var4] = field1914[var6];
            field1892[var4++] = this.field1886[arg0];
        } else {
            int var16 = field1877[var6];
            int var17 = field1895[var6];
            int var18 = this.field1886[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1879[var8 - var9];
                field1905[var4] = (((field1877[var5] - var16) * var19 >> 16) + var16) * class95.field1629 / 50 + var2;
                field1894[var4] = (((field1895[var5] - var17) * var19 >> 16) + var17) * class95.field1629 / 50 + var3;
                field1892[var4++] = ((this.field1872[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1879[var10 - var9];
                field1905[var4] = (((field1877[var7] - var16) * var20 >> 16) + var16) * class95.field1629 / 50 + var2;
                field1894[var4] = (((field1895[var7] - var17) * var20 >> 16) + var17) * class95.field1629 / 50 + var3;
                field1892[var4++] = ((this.field1857[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1905[var4] = field1870[var7];
            field1894[var4] = field1914[var7];
            field1892[var4++] = this.field1857[arg0];
        } else {
            int var21 = field1877[var7];
            int var22 = field1895[var7];
            int var23 = this.field1857[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1879[var9 - var10];
                field1905[var4] = (((field1877[var6] - var21) * var24 >> 16) + var21) * class95.field1629 / 50 + var2;
                field1894[var4] = (((field1895[var6] - var22) * var24 >> 16) + var22) * class95.field1629 / 50 + var3;
                field1892[var4++] = ((this.field1886[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1879[var8 - var10];
                field1905[var4] = (((field1877[var5] - var21) * var25 >> 16) + var21) * class95.field1629 / 50 + var2;
                field1894[var4] = (((field1895[var5] - var22) * var25 >> 16) + var22) * class95.field1629 / 50 + var3;
                field1892[var4++] = ((this.field1872[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1905[0];
        int var27 = field1905[1];
        int var28 = field1905[2];
        int var29 = field1894[0];
        int var30 = field1894[1];
        int var31 = field1894[2];
        class95.field1628 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1634 || var27 > Statics.field1634 || var28 > Statics.field1634) {
                class95.field1628 = true;
            }
            if (this.field1885 != null && this.field1885[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1874 == null || this.field1874[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1874[arg0] & 0xFF;
                    var33 = this.field1909[var32];
                    var34 = this.field1878[var32];
                    var35 = this.field1919[var32];
                }
                if (this.field1857[arg0] == -1) {
                    class95.method2038(var29, var30, var31, var26, var27, var28, this.field1872[arg0], this.field1872[arg0], this.field1872[arg0], field1877[var33], field1877[var34], field1877[var35], field1895[var33], field1895[var34], field1895[var35], field1896[var33], field1896[var34], field1896[var35], this.field1885[arg0]);
                } else {
                    class95.method2038(var29, var30, var31, var26, var27, var28, field1892[0], field1892[1], field1892[2], field1877[var33], field1877[var34], field1877[var35], field1895[var33], field1895[var34], field1895[var35], field1896[var33], field1896[var34], field1896[var35], this.field1885[arg0]);
                }
            } else if (this.field1857[arg0] == -1) {
                class95.method2036(var29, var30, var31, var26, var27, var28, field1918[this.field1872[arg0]]);
            } else {
                class95.method2034(var29, var30, var31, var26, var27, var28, field1892[0], field1892[1], field1892[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1634 || var27 > Statics.field1634 || var28 > Statics.field1634 || field1905[3] < 0 || field1905[3] > Statics.field1634) {
            class95.field1628 = true;
        }
        if (this.field1885 != null && this.field1885[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1874 == null || this.field1874[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1874[arg0] & 0xFF;
                var37 = this.field1909[var36];
                var38 = this.field1878[var36];
                var39 = this.field1919[var36];
            }
            short var40 = this.field1885[arg0];
            if (this.field1857[arg0] == -1) {
                class95.method2038(var29, var30, var31, var26, var27, var28, this.field1872[arg0], this.field1872[arg0], this.field1872[arg0], field1877[var37], field1877[var38], field1877[var39], field1895[var37], field1895[var38], field1895[var39], field1896[var37], field1896[var38], field1896[var39], var40);
                class95.method2038(var29, var31, field1894[3], var26, var28, field1905[3], this.field1872[arg0], this.field1872[arg0], this.field1872[arg0], field1877[var37], field1877[var38], field1877[var39], field1895[var37], field1895[var38], field1895[var39], field1896[var37], field1896[var38], field1896[var39], var40);
            } else {
                class95.method2038(var29, var30, var31, var26, var27, var28, field1892[0], field1892[1], field1892[2], field1877[var37], field1877[var38], field1877[var39], field1895[var37], field1895[var38], field1895[var39], field1896[var37], field1896[var38], field1896[var39], var40);
                class95.method2038(var29, var31, field1894[3], var26, var28, field1905[3], field1892[0], field1892[2], field1892[3], field1877[var37], field1877[var38], field1877[var39], field1895[var37], field1895[var38], field1895[var39], field1896[var37], field1896[var38], field1896[var39], var40);
            }
        } else if (this.field1857[arg0] == -1) {
            int var41 = field1918[this.field1872[arg0]];
            class95.method2036(var29, var30, var31, var26, var27, var28, var41);
            class95.method2036(var29, var31, field1894[3], var26, var28, field1905[3], var41);
        } else {
            class95.method2034(var29, var30, var31, var26, var27, var28, field1892[0], field1892[1], field1892[2]);
            class95.method2034(var29, var31, field1894[3], var26, var28, field1905[3], field1892[0], field1892[2], field1892[3]);
        }
    }

    @ObfuscatedName("do.am(IIIIIIII)Z")
    public final boolean method2222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
