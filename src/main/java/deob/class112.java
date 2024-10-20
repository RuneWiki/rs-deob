package deob;

@ObfuscatedName("dc")
public class class112 extends class94 {

    @ObfuscatedName("dc.i")
    public static class112 field1912 = new class112();

    @ObfuscatedName("dc.p")
    public static byte[] field1855 = new byte[1];

    @ObfuscatedName("dc.a")
    public static class112 field1856 = new class112();

    @ObfuscatedName("dc.l")
    public static byte[] field1857 = new byte[1];

    @ObfuscatedName("dc.q")
    public int field1858 = 0;

    @ObfuscatedName("dc.b")
    public int[] field1901;

    @ObfuscatedName("dc.u")
    public int[] field1860;

    @ObfuscatedName("dc.d")
    public int[] field1861;

    @ObfuscatedName("dc.m")
    public int field1862 = 0;

    @ObfuscatedName("dc.v")
    public int[] field1863;

    @ObfuscatedName("dc.j")
    public int[] field1864;

    @ObfuscatedName("dc.f")
    public int[] field1898;

    @ObfuscatedName("dc.h")
    public int[] field1888;

    @ObfuscatedName("dc.o")
    public int[] field1903;

    @ObfuscatedName("dc.z")
    public int[] field1868;

    @ObfuscatedName("dc.k")
    public byte[] field1869;

    @ObfuscatedName("dc.y")
    public byte[] field1870;

    @ObfuscatedName("dc.g")
    public byte[] field1871;

    @ObfuscatedName("dc.e")
    public short[] field1872;

    @ObfuscatedName("dc.s")
    public byte field1891 = 0;

    @ObfuscatedName("dc.t")
    public int field1874 = 0;

    @ObfuscatedName("dc.r")
    public int[] field1875;

    @ObfuscatedName("dc.w")
    public int[] field1876;

    @ObfuscatedName("dc.x")
    public int[] field1866;

    @ObfuscatedName("dc.n")
    public int[][] field1878;

    @ObfuscatedName("dc.c")
    public int[][] field1879;

    @ObfuscatedName("dc.az")
    public boolean field1892 = false;

    @ObfuscatedName("dc.ax")
    public int field1881;

    @ObfuscatedName("dc.aq")
    public int field1910;

    @ObfuscatedName("dc.ap")
    public int field1883;

    @ObfuscatedName("dc.aa")
    public int field1884;

    @ObfuscatedName("dc.ai")
    public int field1885;

    @ObfuscatedName("dc.ag")
    public static boolean[] field1887 = new boolean[4096];

    @ObfuscatedName("dc.as")
    public static boolean[] field1859 = new boolean[4096];

    @ObfuscatedName("dc.ak")
    public static int[] field1889 = new int[4096];

    @ObfuscatedName("dc.al")
    public static int[] field1890 = new int[4096];

    @ObfuscatedName("dc.am")
    public static int[] field1880 = new int[4096];

    @ObfuscatedName("dc.ao")
    public static int[] field1897 = new int[4096];

    @ObfuscatedName("dc.ah")
    public static int[] field1893 = new int[4096];

    @ObfuscatedName("dc.aw")
    public static int[] field1894 = new int[4096];

    @ObfuscatedName("dc.au")
    public static int[] field1896 = new int[1600];

    @ObfuscatedName("dc.af")
    public static int[][] field1873 = new int[1600][512];

    @ObfuscatedName("dc.ab")
    public static int[] field1914 = new int[12];

    @ObfuscatedName("dc.aj")
    public static int[][] field1899 = new int[12][2000];

    @ObfuscatedName("dc.ac")
    public static int[] field1900 = new int[2000];

    @ObfuscatedName("dc.ay")
    public static int[] field1908 = new int[2000];

    @ObfuscatedName("dc.ae")
    public static int[] field1902 = new int[12];

    @ObfuscatedName("dc.ad")
    public static int[] field1882 = new int[10];

    @ObfuscatedName("dc.an")
    public static int[] field1904 = new int[10];

    @ObfuscatedName("dc.at")
    public static int[] field1905 = new int[10];

    @ObfuscatedName("dc.bf")
    public static boolean field1909 = false;

    @ObfuscatedName("dc.bn")
    public static int field1867 = 0;

    @ObfuscatedName("dc.bw")
    public static int field1911 = 0;

    @ObfuscatedName("dc.bd")
    public static int field1877 = 0;

    @ObfuscatedName("dc.ba")
    public static int[] field1913 = new int[1000];

    @ObfuscatedName("dc.bk")
    public static int[] field1919 = class104.field1789;

    @ObfuscatedName("dc.bz")
    public static int[] field1915 = class104.field1781;

    @ObfuscatedName("dc.bh")
    public static int[] field1865 = class104.field1785;

    @ObfuscatedName("dc.bp")
    public static int[] field1917 = class104.field1788;

    public class112() {
    }

    public class112(class112[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1858 = 0;
        this.field1862 = 0;
        this.field1874 = 0;
        this.field1891 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class112 var8 = arg0[var7];
            if (var8 != null) {
                this.field1858 += var8.field1858;
                this.field1862 += var8.field1862;
                this.field1874 += var8.field1874;
                if (var8.field1869 == null) {
                    if (this.field1891 == -1) {
                        this.field1891 = var8.field1891;
                    }
                    if (this.field1891 != var8.field1891) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1870 != null;
                var5 |= var8.field1872 != null;
                var6 |= var8.field1871 != null;
            }
        }
        this.field1901 = new int[this.field1858];
        this.field1860 = new int[this.field1858];
        this.field1861 = new int[this.field1858];
        this.field1863 = new int[this.field1862];
        this.field1864 = new int[this.field1862];
        this.field1898 = new int[this.field1862];
        this.field1888 = new int[this.field1862];
        this.field1903 = new int[this.field1862];
        this.field1868 = new int[this.field1862];
        if (var3) {
            this.field1869 = new byte[this.field1862];
        }
        if (var4) {
            this.field1870 = new byte[this.field1862];
        }
        if (var5) {
            this.field1872 = new short[this.field1862];
        }
        if (var6) {
            this.field1871 = new byte[this.field1862];
        }
        if (this.field1874 > 0) {
            this.field1875 = new int[this.field1874];
            this.field1876 = new int[this.field1874];
            this.field1866 = new int[this.field1874];
        }
        this.field1858 = 0;
        this.field1862 = 0;
        this.field1874 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class112 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1862; var11++) {
                    this.field1863[this.field1862] = var10.field1863[var11] + this.field1858;
                    this.field1864[this.field1862] = var10.field1864[var11] + this.field1858;
                    this.field1898[this.field1862] = var10.field1898[var11] + this.field1858;
                    this.field1888[this.field1862] = var10.field1888[var11];
                    this.field1903[this.field1862] = var10.field1903[var11];
                    this.field1868[this.field1862] = var10.field1868[var11];
                    if (var3) {
                        if (var10.field1869 == null) {
                            this.field1869[this.field1862] = var10.field1891;
                        } else {
                            this.field1869[this.field1862] = var10.field1869[var11];
                        }
                    }
                    if (var4 && var10.field1870 != null) {
                        this.field1870[this.field1862] = var10.field1870[var11];
                    }
                    if (var5) {
                        if (var10.field1872 == null) {
                            this.field1872[this.field1862] = -1;
                        } else {
                            this.field1872[this.field1862] = var10.field1872[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1871 == null || var10.field1871[var11] == -1) {
                            this.field1871[this.field1862] = -1;
                        } else {
                            this.field1871[this.field1862] = (byte) (var10.field1871[var11] + this.field1874);
                        }
                    }
                    this.field1862++;
                }
                for (int var12 = 0; var12 < var10.field1874; var12++) {
                    this.field1875[this.field1874] = var10.field1875[var12] + this.field1858;
                    this.field1876[this.field1874] = var10.field1876[var12] + this.field1858;
                    this.field1866[this.field1874] = var10.field1866[var12] + this.field1858;
                    this.field1874++;
                }
                for (int var13 = 0; var13 < var10.field1858; var13++) {
                    this.field1901[this.field1858] = var10.field1901[var13];
                    this.field1860[this.field1858] = var10.field1860[var13];
                    this.field1861[this.field1858] = var10.field1861[var13];
                    this.field1858++;
                }
            }
        }
    }

    @ObfuscatedName("dc.i([[IIIIZI)Ldc;")
    public class112 method2170(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2174();
        int var7 = arg1 - this.field1883;
        int var8 = this.field1883 + arg1;
        int var9 = arg3 - this.field1883;
        int var10 = this.field1883 + arg3;
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
            var15.field1858 = this.field1858;
            var15.field1862 = this.field1862;
            var15.field1874 = this.field1874;
            var15.field1901 = this.field1901;
            var15.field1861 = this.field1861;
            var15.field1863 = this.field1863;
            var15.field1864 = this.field1864;
            var15.field1898 = this.field1898;
            var15.field1888 = this.field1888;
            var15.field1903 = this.field1903;
            var15.field1868 = this.field1868;
            var15.field1869 = this.field1869;
            var15.field1870 = this.field1870;
            var15.field1871 = this.field1871;
            var15.field1872 = this.field1872;
            var15.field1891 = this.field1891;
            var15.field1875 = this.field1875;
            var15.field1876 = this.field1876;
            var15.field1866 = this.field1866;
            var15.field1878 = this.field1878;
            var15.field1879 = this.field1879;
            var15.field1892 = this.field1892;
            var15.field1860 = new int[var15.field1858];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1858; var16++) {
                int var17 = this.field1901[var16] + arg1;
                int var18 = this.field1861[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1860[var16] = this.field1860[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1858; var26++) {
                int var27 = (-this.field1860[var26] << 16) / this.field1556;
                if (var27 < arg5) {
                    int var28 = this.field1901[var26] + arg1;
                    int var29 = this.field1861[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1860[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1860[var26];
                }
            }
        }
        var15.field1881 = 0;
        return var15;
    }

    @ObfuscatedName("dc.a(Z)Ldc;")
    public class112 method2239(boolean arg0) {
        if (!arg0 && field1855.length < this.field1862) {
            field1855 = new byte[this.field1862 + 100];
        }
        return this.method2173(arg0, field1912, field1855);
    }

    @ObfuscatedName("dc.l(Z)Ldc;")
    public class112 method2237(boolean arg0) {
        if (!arg0 && field1857.length < this.field1862) {
            field1857 = new byte[this.field1862 + 100];
        }
        return this.method2173(arg0, field1856, field1857);
    }

    @ObfuscatedName("dc.d(ZLdc;[B)Ldc;")
    public class112 method2173(boolean arg0, class112 arg1, byte[] arg2) {
        arg1.field1858 = this.field1858;
        arg1.field1862 = this.field1862;
        arg1.field1874 = this.field1874;
        if (arg1.field1901 == null || arg1.field1901.length < this.field1858) {
            arg1.field1901 = new int[this.field1858 + 100];
            arg1.field1860 = new int[this.field1858 + 100];
            arg1.field1861 = new int[this.field1858 + 100];
        }
        for (int var4 = 0; var4 < this.field1858; var4++) {
            arg1.field1901[var4] = this.field1901[var4];
            arg1.field1860[var4] = this.field1860[var4];
            arg1.field1861[var4] = this.field1861[var4];
        }
        if (arg0) {
            arg1.field1870 = this.field1870;
        } else {
            arg1.field1870 = arg2;
            if (this.field1870 == null) {
                for (int var5 = 0; var5 < this.field1862; var5++) {
                    arg1.field1870[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1862; var6++) {
                    arg1.field1870[var6] = this.field1870[var6];
                }
            }
        }
        arg1.field1863 = this.field1863;
        arg1.field1864 = this.field1864;
        arg1.field1898 = this.field1898;
        arg1.field1888 = this.field1888;
        arg1.field1903 = this.field1903;
        arg1.field1868 = this.field1868;
        arg1.field1869 = this.field1869;
        arg1.field1871 = this.field1871;
        arg1.field1872 = this.field1872;
        arg1.field1891 = this.field1891;
        arg1.field1875 = this.field1875;
        arg1.field1876 = this.field1876;
        arg1.field1866 = this.field1866;
        arg1.field1878 = this.field1878;
        arg1.field1879 = this.field1879;
        arg1.field1892 = this.field1892;
        arg1.field1881 = 0;
        return arg1;
    }

    @ObfuscatedName("dc.m()V")
    public void method2174() {
        if (this.field1881 == 1) {
            return;
        }
        this.field1881 = 1;
        this.field1556 = 0;
        this.field1910 = 0;
        this.field1883 = 0;
        for (int var1 = 0; var1 < this.field1858; var1++) {
            int var2 = this.field1901[var1];
            int var3 = this.field1860[var1];
            int var4 = this.field1861[var1];
            if (-var3 > this.field1556) {
                this.field1556 = -var3;
            }
            if (var3 > this.field1910) {
                this.field1910 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1883) {
                this.field1883 = var5;
            }
        }
        this.field1883 = (int) (Math.sqrt((double) this.field1883) + 0.99D);
        this.field1885 = (int) (Math.sqrt((double) (this.field1556 * this.field1556 + this.field1883 * this.field1883)) + 0.99D);
        this.field1884 = this.field1885 + (int) (Math.sqrt((double) (this.field1910 * this.field1910 + this.field1883 * this.field1883)) + 0.99D);
    }

    @ObfuscatedName("dc.v()V")
    public void method2175() {
        if (this.field1881 == 2) {
            return;
        }
        this.field1881 = 2;
        this.field1883 = 0;
        for (int var1 = 0; var1 < this.field1858; var1++) {
            int var2 = this.field1901[var1];
            int var3 = this.field1860[var1];
            int var4 = this.field1861[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1883) {
                this.field1883 = var5;
            }
        }
        this.field1883 = (int) (Math.sqrt((double) this.field1883) + 0.99D);
        this.field1885 = this.field1883;
        this.field1884 = this.field1883 + this.field1883;
    }

    @ObfuscatedName("dc.j()I")
    public int method2176() {
        this.method2174();
        return this.field1883;
    }

    @ObfuscatedName("dc.f(Ldg;I)V")
    public void method2177(class109 arg0, int arg1) {
        if (this.field1878 == null || arg1 == -1) {
            return;
        }
        class97 var3 = arg0.field1818[arg1];
        class105 var4 = var3.field1637;
        Statics.field1906 = 0;
        Statics.field1907 = 0;
        Statics.field1916 = 0;
        for (int var5 = 0; var5 < var3.field1642; var5++) {
            int var6 = var3.field1639[var5];
            this.method2229(var4.field1797[var6], var4.field1791[var6], var3.field1633[var5], var3.field1641[var5], var3.field1640[var5]);
        }
        this.field1881 = 0;
    }

    @ObfuscatedName("dc.h(Ldg;ILdg;I[I)V")
    public void method2178(class109 arg0, int arg1, class109 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2177(arg0, arg1);
            return;
        }
        class97 var6 = arg0.field1818[arg1];
        class97 var7 = arg2.field1818[arg3];
        class105 var8 = var6.field1637;
        Statics.field1906 = 0;
        Statics.field1907 = 0;
        Statics.field1916 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1642; var11++) {
            int var12 = var6.field1639[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1797[var12] == 0) {
                this.method2229(var8.field1797[var12], var8.field1791[var12], var6.field1633[var11], var6.field1641[var11], var6.field1640[var11]);
            }
        }
        Statics.field1906 = 0;
        Statics.field1907 = 0;
        Statics.field1916 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1642; var15++) {
            int var16 = var7.field1639[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1797[var16] == 0) {
                this.method2229(var8.field1797[var16], var8.field1791[var16], var7.field1633[var15], var7.field1641[var15], var7.field1640[var15]);
            }
        }
        this.field1881 = 0;
    }

    @ObfuscatedName("dc.o(I[IIII)V")
    public void method2229(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1906 = 0;
            Statics.field1907 = 0;
            Statics.field1916 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1878.length) {
                    int[] var10 = this.field1878[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1906 += this.field1901[var12];
                        Statics.field1907 += this.field1860[var12];
                        Statics.field1916 += this.field1861[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1906 = Statics.field1906 / var7 + arg2;
                Statics.field1907 = Statics.field1907 / var7 + arg3;
                Statics.field1916 = Statics.field1916 / var7 + arg4;
            } else {
                Statics.field1906 = arg2;
                Statics.field1907 = arg3;
                Statics.field1916 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1878.length) {
                    int[] var15 = this.field1878[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1901[var17] += arg2;
                        this.field1860[var17] += arg3;
                        this.field1861[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1878.length) {
                    int[] var20 = this.field1878[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1901[var22] -= Statics.field1906;
                        this.field1860[var22] -= Statics.field1907;
                        this.field1861[var22] -= Statics.field1916;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1919[var25];
                            int var27 = field1915[var25];
                            int var28 = this.field1901[var22] * var27 + this.field1860[var22] * var26 >> 16;
                            this.field1860[var22] = this.field1860[var22] * var27 - this.field1901[var22] * var26 >> 16;
                            this.field1901[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1919[var23];
                            int var30 = field1915[var23];
                            int var31 = this.field1860[var22] * var30 - this.field1861[var22] * var29 >> 16;
                            this.field1861[var22] = this.field1861[var22] * var30 + this.field1860[var22] * var29 >> 16;
                            this.field1860[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1919[var24];
                            int var33 = field1915[var24];
                            int var34 = this.field1901[var22] * var33 + this.field1861[var22] * var32 >> 16;
                            this.field1861[var22] = this.field1861[var22] * var33 - this.field1901[var22] * var32 >> 16;
                            this.field1901[var22] = var34;
                        }
                        this.field1901[var22] += Statics.field1906;
                        this.field1860[var22] += Statics.field1907;
                        this.field1861[var22] += Statics.field1916;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1878.length) {
                    int[] var37 = this.field1878[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1901[var39] -= Statics.field1906;
                        this.field1860[var39] -= Statics.field1907;
                        this.field1861[var39] -= Statics.field1916;
                        this.field1901[var39] = this.field1901[var39] * arg2 / 128;
                        this.field1860[var39] = this.field1860[var39] * arg3 / 128;
                        this.field1861[var39] = this.field1861[var39] * arg4 / 128;
                        this.field1901[var39] += Statics.field1906;
                        this.field1860[var39] += Statics.field1907;
                        this.field1861[var39] += Statics.field1916;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1879 != null && this.field1870 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1879.length) {
                    int[] var42 = this.field1879[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1870[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1870[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dc.z()V")
    public void method2250() {
        for (int var1 = 0; var1 < this.field1858; var1++) {
            int var2 = this.field1901[var1];
            this.field1901[var1] = this.field1861[var1];
            this.field1861[var1] = -var2;
        }
        this.field1881 = 0;
    }

    @ObfuscatedName("dc.k()V")
    public void method2181() {
        for (int var1 = 0; var1 < this.field1858; var1++) {
            this.field1901[var1] = -this.field1901[var1];
            this.field1861[var1] = -this.field1861[var1];
        }
        this.field1881 = 0;
    }

    @ObfuscatedName("dc.y()V")
    public void method2182() {
        for (int var1 = 0; var1 < this.field1858; var1++) {
            int var2 = this.field1861[var1];
            this.field1861[var1] = this.field1901[var1];
            this.field1901[var1] = -var2;
        }
        this.field1881 = 0;
    }

    @ObfuscatedName("dc.g(I)V")
    public void method2183(int arg0) {
        int var2 = field1919[arg0];
        int var3 = field1915[arg0];
        for (int var4 = 0; var4 < this.field1858; var4++) {
            int var5 = this.field1860[var4] * var3 - this.field1861[var4] * var2 >> 16;
            this.field1861[var4] = this.field1861[var4] * var3 + this.field1860[var4] * var2 >> 16;
            this.field1860[var4] = var5;
        }
        this.field1881 = 0;
    }

    @ObfuscatedName("dc.e(III)V")
    public void method2184(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1858; var4++) {
            this.field1901[var4] += arg0;
            this.field1860[var4] += arg1;
            this.field1861[var4] += arg2;
        }
        this.field1881 = 0;
    }

    @ObfuscatedName("dc.s(III)V")
    public void method2185(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1858; var4++) {
            this.field1901[var4] = this.field1901[var4] * arg0 / 128;
            this.field1860[var4] = this.field1860[var4] * arg1 / 128;
            this.field1861[var4] = this.field1861[var4] * arg2 / 128;
        }
        this.field1881 = 0;
    }

    @ObfuscatedName("dc.t(IIIIIII)V")
    public final void method2186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1896[0] = -1;
        if (this.field1881 != 2 && this.field1881 != 1) {
            this.method2175();
        }
        int var8 = Statics.field1774;
        int var9 = Statics.field1777;
        int var10 = field1919[arg0];
        int var11 = field1915[arg0];
        int var12 = field1919[arg1];
        int var13 = field1915[arg1];
        int var14 = field1919[arg2];
        int var15 = field1915[arg2];
        int var16 = field1919[arg3];
        int var17 = field1915[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1858; var19++) {
            int var20 = this.field1901[var19];
            int var21 = this.field1860[var19];
            int var22 = this.field1861[var19];
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
            field1880[var19] = var30 - var18;
            field1889[var19] = (var26 << 9) / var30 + var8;
            field1890[var19] = (var29 << 9) / var30 + var9;
            if (this.field1874 > 0) {
                field1897[var19] = var26;
                field1893[var19] = var29;
                field1894[var19] = var30;
            }
        }
        try {
            this.method2189(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dc.r(IIIIIIII)V")
    public final void method2187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1896[0] = -1;
        if (this.field1881 != 2 && this.field1881 != 1) {
            this.method2175();
        }
        int var9 = Statics.field1774;
        int var10 = Statics.field1777;
        int var11 = field1919[arg0];
        int var12 = field1915[arg0];
        int var13 = field1919[arg1];
        int var14 = field1915[arg1];
        int var15 = field1919[arg2];
        int var16 = field1915[arg2];
        int var17 = field1919[arg3];
        int var18 = field1915[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1858; var20++) {
            int var21 = this.field1901[var20];
            int var22 = this.field1860[var20];
            int var23 = this.field1861[var20];
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
            field1880[var20] = var31 - var19;
            field1889[var20] = (var27 << 9) / arg7 + var9;
            field1890[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1874 > 0) {
                field1897[var20] = var27;
                field1893[var20] = var30;
                field1894[var20] = var31;
            }
        }
        try {
            this.method2189(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dc.w(IIIIIIIII)V")
    public void method1790(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1896[0] = -1;
        if (this.field1881 != 1) {
            this.method2174();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1883 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1883 << 9;
        if (var15 / var13 >= Statics.field1769) {
            return;
        }
        int var16 = this.field1883 + var14 << 9;
        if (var16 / var13 <= Statics.field1780) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1883 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1790) {
            return;
        }
        int var20 = (this.field1556 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1783) {
            return;
        }
        int var22 = (this.field1556 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1874 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1909) {
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
            int var32 = field1867 - Statics.field1774;
            int var33 = field1911 - Statics.field1777;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1892) {
                    field1913[field1877++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1774;
        int var35 = Statics.field1777;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1919[arg0];
            var37 = field1915[arg0];
        }
        for (int var38 = 0; var38 < this.field1858; var38++) {
            int var39 = this.field1901[var38];
            int var40 = this.field1860[var38];
            int var41 = this.field1861[var38];
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
            field1880[var38] = var50 - var11;
            if (var50 >= 50) {
                field1889[var38] = (var46 << 9) / var50 + var34;
                field1890[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1889[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1897[var38] = var46;
                field1893[var38] = var49;
                field1894[var38] = var50;
            }
        }
        try {
            this.method2189(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dc.c(ZZI)V")
    public final void method2189(boolean arg0, boolean arg1, int arg2) {
        if (this.field1884 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1884; var4++) {
            field1896[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1862; var5++) {
            if (this.field1868[var5] != -2) {
                int var6 = this.field1863[var5];
                int var7 = this.field1864[var5];
                int var8 = this.field1898[var5];
                int var9 = field1889[var6];
                int var10 = field1889[var7];
                int var11 = field1889[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1897[var6];
                    int var13 = field1897[var7];
                    int var14 = field1897[var8];
                    int var15 = field1893[var6];
                    int var16 = field1893[var7];
                    int var17 = field1893[var8];
                    int var18 = field1894[var6];
                    int var19 = field1894[var7];
                    int var20 = field1894[var8];
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
                        field1859[var5] = true;
                        int var30 = (field1880[var6] + field1880[var7] + field1880[var8]) / 3 + this.field1885;
                        field1873[var30][field1896[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2192(field1867, field1911, field1890[var6], field1890[var7], field1890[var8], var9, var10, var11)) {
                        field1913[field1877++] = arg2;
                        arg1 = false;
                    }
                    if ((field1890[var8] - field1890[var7]) * (var9 - var10) - (field1890[var6] - field1890[var7]) * (var11 - var10) > 0) {
                        field1859[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1776 && var10 <= Statics.field1776 && var11 <= Statics.field1776) {
                            field1887[var5] = false;
                        } else {
                            field1887[var5] = true;
                        }
                        int var31 = (field1880[var6] + field1880[var7] + field1880[var8]) / 3 + this.field1885;
                        field1873[var31][field1896[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1869 == null) {
            for (int var32 = this.field1884 - 1; var32 >= 0; var32--) {
                int var33 = field1896[var32];
                if (var33 > 0) {
                    int[] var34 = field1873[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2190(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1914[var36] = 0;
            field1902[var36] = 0;
        }
        for (int var37 = this.field1884 - 1; var37 >= 0; var37--) {
            int var38 = field1896[var37];
            if (var38 > 0) {
                int[] var39 = field1873[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1869[var41];
                    int var43 = field1914[var42]++;
                    field1899[var42][var43] = var41;
                    if (var42 < 10) {
                        field1902[var42] += var37;
                    } else if (var42 == 10) {
                        field1900[var43] = var37;
                    } else {
                        field1908[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1914[1] > 0 || field1914[2] > 0) {
            var44 = (field1902[1] + field1902[2]) / (field1914[1] + field1914[2]);
        }
        int var45 = 0;
        if (field1914[3] > 0 || field1914[4] > 0) {
            var45 = (field1902[3] + field1902[4]) / (field1914[3] + field1914[4]);
        }
        int var46 = 0;
        if (field1914[6] > 0 || field1914[8] > 0) {
            var46 = (field1902[6] + field1902[8]) / (field1914[6] + field1914[8]);
        }
        int var47 = 0;
        int var48 = field1914[10];
        int[] var49 = field1899[10];
        int[] var50 = field1900;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1914[11];
            var49 = field1899[11];
            var50 = field1908;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2190(var49[var47++]);
                if (var47 == var48 && field1899[11] != var49) {
                    var47 = 0;
                    var48 = field1914[11];
                    var49 = field1899[11];
                    var50 = field1908;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2190(var49[var47++]);
                if (var47 == var48 && field1899[11] != var49) {
                    var47 = 0;
                    var48 = field1914[11];
                    var49 = field1899[11];
                    var50 = field1908;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2190(var49[var47++]);
                if (var47 == var48 && field1899[11] != var49) {
                    var47 = 0;
                    var48 = field1914[11];
                    var49 = field1899[11];
                    var50 = field1908;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1914[var52];
            int[] var54 = field1899[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2190(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2190(var49[var47++]);
            if (var47 == var48 && field1899[11] != var49) {
                var47 = 0;
                var49 = field1899[11];
                var48 = field1914[11];
                var50 = field1908;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dc.az(I)V")
    public final void method2190(int arg0) {
        if (field1859[arg0]) {
            this.method2191(arg0);
            return;
        }
        int var2 = this.field1863[arg0];
        int var3 = this.field1864[arg0];
        int var4 = this.field1898[arg0];
        class104.field1770 = field1887[arg0];
        if (this.field1870 == null) {
            class104.field1766 = 0;
        } else {
            class104.field1766 = this.field1870[arg0] & 0xFF;
        }
        if (this.field1872 != null && this.field1872[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1871 == null || this.field1871[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1871[arg0] & 0xFF;
                var6 = this.field1875[var5];
                var7 = this.field1876[var5];
                var8 = this.field1866[var5];
            }
            if (this.field1868[arg0] == -1) {
                class104.method2075(field1890[var2], field1890[var3], field1890[var4], field1889[var2], field1889[var3], field1889[var4], this.field1888[arg0], this.field1888[arg0], this.field1888[arg0], field1897[var6], field1897[var7], field1897[var8], field1893[var6], field1893[var7], field1893[var8], field1894[var6], field1894[var7], field1894[var8], this.field1872[arg0]);
            } else {
                class104.method2075(field1890[var2], field1890[var3], field1890[var4], field1889[var2], field1889[var3], field1889[var4], this.field1888[arg0], this.field1903[arg0], this.field1868[arg0], field1897[var6], field1897[var7], field1897[var8], field1893[var6], field1893[var7], field1893[var8], field1894[var6], field1894[var7], field1894[var8], this.field1872[arg0]);
            }
        } else if (this.field1868[arg0] == -1) {
            class104.method2073(field1890[var2], field1890[var3], field1890[var4], field1889[var2], field1889[var3], field1889[var4], field1865[this.field1888[arg0]]);
        } else {
            class104.method2113(field1890[var2], field1890[var3], field1890[var4], field1889[var2], field1889[var3], field1889[var4], this.field1888[arg0], this.field1903[arg0], this.field1868[arg0]);
        }
    }

    @ObfuscatedName("dc.ax(I)V")
    public final void method2191(int arg0) {
        int var2 = Statics.field1774;
        int var3 = Statics.field1777;
        int var4 = 0;
        int var5 = this.field1863[arg0];
        int var6 = this.field1864[arg0];
        int var7 = this.field1898[arg0];
        int var8 = field1894[var5];
        int var9 = field1894[var6];
        int var10 = field1894[var7];
        if (this.field1870 == null) {
            class104.field1766 = 0;
        } else {
            class104.field1766 = this.field1870[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1882[var4] = field1889[var5];
            field1904[var4] = field1890[var5];
            field1905[var4++] = this.field1888[arg0];
        } else {
            int var11 = field1897[var5];
            int var12 = field1893[var5];
            int var13 = this.field1888[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1917[var10 - var8];
                field1882[var4] = (((field1897[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1904[var4] = (((field1893[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1905[var4++] = ((this.field1868[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1917[var9 - var8];
                field1882[var4] = (((field1897[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1904[var4] = (((field1893[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1905[var4++] = ((this.field1903[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1882[var4] = field1889[var6];
            field1904[var4] = field1890[var6];
            field1905[var4++] = this.field1903[arg0];
        } else {
            int var16 = field1897[var6];
            int var17 = field1893[var6];
            int var18 = this.field1903[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1917[var8 - var9];
                field1882[var4] = (((field1897[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1904[var4] = (((field1893[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1905[var4++] = ((this.field1888[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1917[var10 - var9];
                field1882[var4] = (((field1897[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1904[var4] = (((field1893[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1905[var4++] = ((this.field1868[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1882[var4] = field1889[var7];
            field1904[var4] = field1890[var7];
            field1905[var4++] = this.field1868[arg0];
        } else {
            int var21 = field1897[var7];
            int var22 = field1893[var7];
            int var23 = this.field1868[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1917[var9 - var10];
                field1882[var4] = (((field1897[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1904[var4] = (((field1893[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1905[var4++] = ((this.field1903[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1917[var8 - var10];
                field1882[var4] = (((field1897[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1904[var4] = (((field1893[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1905[var4++] = ((this.field1888[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1882[0];
        int var27 = field1882[1];
        int var28 = field1882[2];
        int var29 = field1904[0];
        int var30 = field1904[1];
        int var31 = field1904[2];
        class104.field1770 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1776 || var27 > Statics.field1776 || var28 > Statics.field1776) {
                class104.field1770 = true;
            }
            if (this.field1872 != null && this.field1872[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1871 == null || this.field1871[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1871[arg0] & 0xFF;
                    var33 = this.field1875[var32];
                    var34 = this.field1876[var32];
                    var35 = this.field1866[var32];
                }
                if (this.field1868[arg0] == -1) {
                    class104.method2075(var29, var30, var31, var26, var27, var28, this.field1888[arg0], this.field1888[arg0], this.field1888[arg0], field1897[var33], field1897[var34], field1897[var35], field1893[var33], field1893[var34], field1893[var35], field1894[var33], field1894[var34], field1894[var35], this.field1872[arg0]);
                } else {
                    class104.method2075(var29, var30, var31, var26, var27, var28, field1905[0], field1905[1], field1905[2], field1897[var33], field1897[var34], field1897[var35], field1893[var33], field1893[var34], field1893[var35], field1894[var33], field1894[var34], field1894[var35], this.field1872[arg0]);
                }
            } else if (this.field1868[arg0] == -1) {
                class104.method2073(var29, var30, var31, var26, var27, var28, field1865[this.field1888[arg0]]);
            } else {
                class104.method2113(var29, var30, var31, var26, var27, var28, field1905[0], field1905[1], field1905[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1776 || var27 > Statics.field1776 || var28 > Statics.field1776 || field1882[3] < 0 || field1882[3] > Statics.field1776) {
            class104.field1770 = true;
        }
        if (this.field1872 != null && this.field1872[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1871 == null || this.field1871[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1871[arg0] & 0xFF;
                var37 = this.field1875[var36];
                var38 = this.field1876[var36];
                var39 = this.field1866[var36];
            }
            short var40 = this.field1872[arg0];
            if (this.field1868[arg0] == -1) {
                class104.method2075(var29, var30, var31, var26, var27, var28, this.field1888[arg0], this.field1888[arg0], this.field1888[arg0], field1897[var37], field1897[var38], field1897[var39], field1893[var37], field1893[var38], field1893[var39], field1894[var37], field1894[var38], field1894[var39], var40);
                class104.method2075(var29, var31, field1904[3], var26, var28, field1882[3], this.field1888[arg0], this.field1888[arg0], this.field1888[arg0], field1897[var37], field1897[var38], field1897[var39], field1893[var37], field1893[var38], field1893[var39], field1894[var37], field1894[var38], field1894[var39], var40);
            } else {
                class104.method2075(var29, var30, var31, var26, var27, var28, field1905[0], field1905[1], field1905[2], field1897[var37], field1897[var38], field1897[var39], field1893[var37], field1893[var38], field1893[var39], field1894[var37], field1894[var38], field1894[var39], var40);
                class104.method2075(var29, var31, field1904[3], var26, var28, field1882[3], field1905[0], field1905[2], field1905[3], field1897[var37], field1897[var38], field1897[var39], field1893[var37], field1893[var38], field1893[var39], field1894[var37], field1894[var38], field1894[var39], var40);
            }
        } else if (this.field1868[arg0] == -1) {
            int var41 = field1865[this.field1888[arg0]];
            class104.method2073(var29, var30, var31, var26, var27, var28, var41);
            class104.method2073(var29, var31, field1904[3], var26, var28, field1882[3], var41);
        } else {
            class104.method2113(var29, var30, var31, var26, var27, var28, field1905[0], field1905[1], field1905[2]);
            class104.method2113(var29, var31, field1904[3], var26, var28, field1882[3], field1905[0], field1905[2], field1905[3]);
        }
    }

    @ObfuscatedName("dc.aq(IIIIIIII)Z")
    public final boolean method2192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
