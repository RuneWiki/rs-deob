package deob;

@ObfuscatedName("do")
public class class113 extends class95 {

    @ObfuscatedName("do.e")
    public static class113 field1856 = new class113();

    @ObfuscatedName("do.i")
    public static byte[] field1896 = new byte[1];

    @ObfuscatedName("do.k")
    public static class113 field1857 = new class113();

    @ObfuscatedName("do.q")
    public static byte[] field1911 = new byte[1];

    @ObfuscatedName("do.j")
    public int field1859 = 0;

    @ObfuscatedName("do.z")
    public int[] field1860;

    @ObfuscatedName("do.m")
    public int[] field1861;

    @ObfuscatedName("do.w")
    public int[] field1908;

    @ObfuscatedName("do.a")
    public int field1862 = 0;

    @ObfuscatedName("do.d")
    public int[] field1863;

    @ObfuscatedName("do.u")
    public int[] field1865;

    @ObfuscatedName("do.p")
    public int[] field1866;

    @ObfuscatedName("do.t")
    public int[] field1867;

    @ObfuscatedName("do.g")
    public int[] field1868;

    @ObfuscatedName("do.o")
    public int[] field1899;

    @ObfuscatedName("do.x")
    public byte[] field1870;

    @ObfuscatedName("do.c")
    public byte[] field1871;

    @ObfuscatedName("do.b")
    public byte[] field1872;

    @ObfuscatedName("do.f")
    public short[] field1869;

    @ObfuscatedName("do.s")
    public byte field1898 = 0;

    @ObfuscatedName("do.y")
    public int field1875 = 0;

    @ObfuscatedName("do.r")
    public int[] field1876;

    @ObfuscatedName("do.l")
    public int[] field1877;

    @ObfuscatedName("do.n")
    public int[] field1878;

    @ObfuscatedName("do.h")
    public int[][] field1880;

    @ObfuscatedName("do.v")
    public int[][] field1873;

    @ObfuscatedName("do.ax")
    public boolean field1881 = false;

    @ObfuscatedName("do.ao")
    public int field1882;

    @ObfuscatedName("do.al")
    public int field1883;

    @ObfuscatedName("do.ap")
    public int field1884;

    @ObfuscatedName("do.ak")
    public int field1885;

    @ObfuscatedName("do.aw")
    public int field1886;

    @ObfuscatedName("do.ah")
    public static boolean[] field1888 = new boolean[4096];

    @ObfuscatedName("do.ae")
    public static boolean[] field1889 = new boolean[4096];

    @ObfuscatedName("do.am")
    public static int[] field1917 = new int[4096];

    @ObfuscatedName("do.aq")
    public static int[] field1858 = new int[4096];

    @ObfuscatedName("do.ai")
    public static int[] field1892 = new int[4096];

    @ObfuscatedName("do.an")
    public static int[] field1893 = new int[4096];

    @ObfuscatedName("do.aa")
    public static int[] field1894 = new int[4096];

    @ObfuscatedName("do.ad")
    public static int[] field1895 = new int[4096];

    @ObfuscatedName("do.ar")
    public static int[] field1897 = new int[1600];

    @ObfuscatedName("do.at")
    public static int[][] field1891 = new int[1600][512];

    @ObfuscatedName("do.af")
    public static int[] field1905 = new int[12];

    @ObfuscatedName("do.ay")
    public static int[][] field1900 = new int[12][2000];

    @ObfuscatedName("do.as")
    public static int[] field1901 = new int[2000];

    @ObfuscatedName("do.ag")
    public static int[] field1902 = new int[2000];

    @ObfuscatedName("do.ac")
    public static int[] field1903 = new int[12];

    @ObfuscatedName("do.aj")
    public static int[] field1904 = new int[10];

    @ObfuscatedName("do.ab")
    public static int[] field1906 = new int[10];

    @ObfuscatedName("do.au")
    public static int[] field1864 = new int[10];

    @ObfuscatedName("do.bp")
    public static boolean field1910 = false;

    @ObfuscatedName("do.bl")
    public static int field1907 = 0;

    @ObfuscatedName("do.bv")
    public static int field1879 = 0;

    @ObfuscatedName("do.bk")
    public static int field1913 = 0;

    @ObfuscatedName("do.bd")
    public static int[] field1914 = new int[1000];

    @ObfuscatedName("do.bj")
    public static int[] field1915 = class105.field1755;

    @ObfuscatedName("do.bt")
    public static int[] field1916 = class105.field1765;

    @ObfuscatedName("do.by")
    public static int[] field1912 = class105.field1778;

    @ObfuscatedName("do.bs")
    public static int[] field1918 = class105.field1760;

    public class113() {
    }

    public class113(class113[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1859 = 0;
        this.field1862 = 0;
        this.field1875 = 0;
        this.field1898 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class113 var8 = arg0[var7];
            if (var8 != null) {
                this.field1859 += var8.field1859;
                this.field1862 += var8.field1862;
                this.field1875 += var8.field1875;
                if (var8.field1870 == null) {
                    if (this.field1898 == -1) {
                        this.field1898 = var8.field1898;
                    }
                    if (this.field1898 != var8.field1898) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1871 != null;
                var5 |= var8.field1869 != null;
                var6 |= var8.field1872 != null;
            }
        }
        this.field1860 = new int[this.field1859];
        this.field1861 = new int[this.field1859];
        this.field1908 = new int[this.field1859];
        this.field1863 = new int[this.field1862];
        this.field1865 = new int[this.field1862];
        this.field1866 = new int[this.field1862];
        this.field1867 = new int[this.field1862];
        this.field1868 = new int[this.field1862];
        this.field1899 = new int[this.field1862];
        if (var3) {
            this.field1870 = new byte[this.field1862];
        }
        if (var4) {
            this.field1871 = new byte[this.field1862];
        }
        if (var5) {
            this.field1869 = new short[this.field1862];
        }
        if (var6) {
            this.field1872 = new byte[this.field1862];
        }
        if (this.field1875 > 0) {
            this.field1876 = new int[this.field1875];
            this.field1877 = new int[this.field1875];
            this.field1878 = new int[this.field1875];
        }
        this.field1859 = 0;
        this.field1862 = 0;
        this.field1875 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class113 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1862; var11++) {
                    this.field1863[this.field1862] = var10.field1863[var11] + this.field1859;
                    this.field1865[this.field1862] = var10.field1865[var11] + this.field1859;
                    this.field1866[this.field1862] = var10.field1866[var11] + this.field1859;
                    this.field1867[this.field1862] = var10.field1867[var11];
                    this.field1868[this.field1862] = var10.field1868[var11];
                    this.field1899[this.field1862] = var10.field1899[var11];
                    if (var3) {
                        if (var10.field1870 == null) {
                            this.field1870[this.field1862] = var10.field1898;
                        } else {
                            this.field1870[this.field1862] = var10.field1870[var11];
                        }
                    }
                    if (var4 && var10.field1871 != null) {
                        this.field1871[this.field1862] = var10.field1871[var11];
                    }
                    if (var5) {
                        if (var10.field1869 == null) {
                            this.field1869[this.field1862] = -1;
                        } else {
                            this.field1869[this.field1862] = var10.field1869[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1872 == null || var10.field1872[var11] == -1) {
                            this.field1872[this.field1862] = -1;
                        } else {
                            this.field1872[this.field1862] = (byte) (var10.field1872[var11] + this.field1875);
                        }
                    }
                    this.field1862++;
                }
                for (int var12 = 0; var12 < var10.field1875; var12++) {
                    this.field1876[this.field1875] = var10.field1876[var12] + this.field1859;
                    this.field1877[this.field1875] = var10.field1877[var12] + this.field1859;
                    this.field1878[this.field1875] = var10.field1878[var12] + this.field1859;
                    this.field1875++;
                }
                for (int var13 = 0; var13 < var10.field1859; var13++) {
                    this.field1860[this.field1859] = var10.field1860[var13];
                    this.field1861[this.field1859] = var10.field1861[var13];
                    this.field1908[this.field1859] = var10.field1908[var13];
                    this.field1859++;
                }
            }
        }
    }

    @ObfuscatedName("do.e([[IIIIZI)Ldo;")
    public class113 method2242(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2268();
        int var7 = arg1 - this.field1884;
        int var8 = this.field1884 + arg1;
        int var9 = arg3 - this.field1884;
        int var10 = this.field1884 + arg3;
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
        class113 var15;
        if (arg4) {
            var15 = new class113();
            var15.field1859 = this.field1859;
            var15.field1862 = this.field1862;
            var15.field1875 = this.field1875;
            var15.field1860 = this.field1860;
            var15.field1908 = this.field1908;
            var15.field1863 = this.field1863;
            var15.field1865 = this.field1865;
            var15.field1866 = this.field1866;
            var15.field1867 = this.field1867;
            var15.field1868 = this.field1868;
            var15.field1899 = this.field1899;
            var15.field1870 = this.field1870;
            var15.field1871 = this.field1871;
            var15.field1872 = this.field1872;
            var15.field1869 = this.field1869;
            var15.field1898 = this.field1898;
            var15.field1876 = this.field1876;
            var15.field1877 = this.field1877;
            var15.field1878 = this.field1878;
            var15.field1880 = this.field1880;
            var15.field1873 = this.field1873;
            var15.field1881 = this.field1881;
            var15.field1861 = new int[var15.field1859];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1859; var16++) {
                int var17 = this.field1860[var16] + arg1;
                int var18 = this.field1908[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1861[var16] = this.field1861[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1859; var26++) {
                int var27 = (-this.field1861[var26] << 16) / this.field1545;
                if (var27 < arg5) {
                    int var28 = this.field1860[var26] + arg1;
                    int var29 = this.field1908[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1861[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1861[var26];
                }
            }
        }
        var15.field1882 = 0;
        return var15;
    }

    @ObfuscatedName("do.k(Z)Ldo;")
    public class113 method2300(boolean arg0) {
        if (!arg0 && field1896.length < this.field1862) {
            field1896 = new byte[this.field1862 + 100];
        }
        return this.method2245(arg0, field1856, field1896);
    }

    @ObfuscatedName("do.q(Z)Ldo;")
    public class113 method2279(boolean arg0) {
        if (!arg0 && field1911.length < this.field1862) {
            field1911 = new byte[this.field1862 + 100];
        }
        return this.method2245(arg0, field1857, field1911);
    }

    @ObfuscatedName("do.j(ZLdo;[B)Ldo;")
    public class113 method2245(boolean arg0, class113 arg1, byte[] arg2) {
        arg1.field1859 = this.field1859;
        arg1.field1862 = this.field1862;
        arg1.field1875 = this.field1875;
        if (arg1.field1860 == null || arg1.field1860.length < this.field1859) {
            arg1.field1860 = new int[this.field1859 + 100];
            arg1.field1861 = new int[this.field1859 + 100];
            arg1.field1908 = new int[this.field1859 + 100];
        }
        for (int var4 = 0; var4 < this.field1859; var4++) {
            arg1.field1860[var4] = this.field1860[var4];
            arg1.field1861[var4] = this.field1861[var4];
            arg1.field1908[var4] = this.field1908[var4];
        }
        if (arg0) {
            arg1.field1871 = this.field1871;
        } else {
            arg1.field1871 = arg2;
            if (this.field1871 == null) {
                for (int var5 = 0; var5 < this.field1862; var5++) {
                    arg1.field1871[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1862; var6++) {
                    arg1.field1871[var6] = this.field1871[var6];
                }
            }
        }
        arg1.field1863 = this.field1863;
        arg1.field1865 = this.field1865;
        arg1.field1866 = this.field1866;
        arg1.field1867 = this.field1867;
        arg1.field1868 = this.field1868;
        arg1.field1899 = this.field1899;
        arg1.field1870 = this.field1870;
        arg1.field1872 = this.field1872;
        arg1.field1869 = this.field1869;
        arg1.field1898 = this.field1898;
        arg1.field1876 = this.field1876;
        arg1.field1877 = this.field1877;
        arg1.field1878 = this.field1878;
        arg1.field1880 = this.field1880;
        arg1.field1873 = this.field1873;
        arg1.field1881 = this.field1881;
        arg1.field1882 = 0;
        return arg1;
    }

    @ObfuscatedName("do.z()V")
    public void method2268() {
        if (this.field1882 == 1) {
            return;
        }
        this.field1882 = 1;
        this.field1545 = 0;
        this.field1883 = 0;
        this.field1884 = 0;
        for (int var1 = 0; var1 < this.field1859; var1++) {
            int var2 = this.field1860[var1];
            int var3 = this.field1861[var1];
            int var4 = this.field1908[var1];
            if (-var3 > this.field1545) {
                this.field1545 = -var3;
            }
            if (var3 > this.field1883) {
                this.field1883 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1884) {
                this.field1884 = var5;
            }
        }
        this.field1884 = (int) (Math.sqrt((double) this.field1884) + 0.99D);
        this.field1886 = (int) (Math.sqrt((double) (this.field1545 * this.field1545 + this.field1884 * this.field1884)) + 0.99D);
        this.field1885 = this.field1886 + (int) (Math.sqrt((double) (this.field1884 * this.field1884 + this.field1883 * this.field1883)) + 0.99D);
    }

    @ObfuscatedName("do.w()V")
    public void method2247() {
        if (this.field1882 == 2) {
            return;
        }
        this.field1882 = 2;
        this.field1884 = 0;
        for (int var1 = 0; var1 < this.field1859; var1++) {
            int var2 = this.field1860[var1];
            int var3 = this.field1861[var1];
            int var4 = this.field1908[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1884) {
                this.field1884 = var5;
            }
        }
        this.field1884 = (int) (Math.sqrt((double) this.field1884) + 0.99D);
        this.field1886 = this.field1884;
        this.field1885 = this.field1884 + this.field1884;
    }

    @ObfuscatedName("do.a()I")
    public int method2291() {
        this.method2268();
        return this.field1884;
    }

    @ObfuscatedName("do.d(Ldp;I)V")
    public void method2249(class110 arg0, int arg1) {
        if (this.field1880 == null || arg1 == -1) {
            return;
        }
        class98 var3 = arg0.field1820[arg1];
        class106 var4 = var3.field1627;
        Statics.field1855 = 0;
        Statics.field1890 = 0;
        Statics.field1909 = 0;
        for (int var5 = 0; var5 < var3.field1628; var5++) {
            int var6 = var3.field1629[var5];
            this.method2251(var4.field1780[var6], var4.field1782[var6], var3.field1632[var5], var3.field1631[var5], var3.field1623[var5]);
        }
        this.field1882 = 0;
    }

    @ObfuscatedName("do.u(Ldp;ILdp;I[I)V")
    public void method2250(class110 arg0, int arg1, class110 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2249(arg0, arg1);
            return;
        }
        class98 var6 = arg0.field1820[arg1];
        class98 var7 = arg2.field1820[arg3];
        class106 var8 = var6.field1627;
        Statics.field1855 = 0;
        Statics.field1890 = 0;
        Statics.field1909 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1628; var11++) {
            int var12 = var6.field1629[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1780[var12] == 0) {
                this.method2251(var8.field1780[var12], var8.field1782[var12], var6.field1632[var11], var6.field1631[var11], var6.field1623[var11]);
            }
        }
        Statics.field1855 = 0;
        Statics.field1890 = 0;
        Statics.field1909 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1628; var15++) {
            int var16 = var7.field1629[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1780[var16] == 0) {
                this.method2251(var8.field1780[var16], var8.field1782[var16], var7.field1632[var15], var7.field1631[var15], var7.field1623[var15]);
            }
        }
        this.field1882 = 0;
    }

    @ObfuscatedName("do.p(I[IIII)V")
    public void method2251(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1855 = 0;
            Statics.field1890 = 0;
            Statics.field1909 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1880.length) {
                    int[] var10 = this.field1880[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1855 += this.field1860[var12];
                        Statics.field1890 += this.field1861[var12];
                        Statics.field1909 += this.field1908[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1855 = Statics.field1855 / var7 + arg2;
                Statics.field1890 = Statics.field1890 / var7 + arg3;
                Statics.field1909 = Statics.field1909 / var7 + arg4;
            } else {
                Statics.field1855 = arg2;
                Statics.field1890 = arg3;
                Statics.field1909 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1880.length) {
                    int[] var15 = this.field1880[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1860[var17] += arg2;
                        this.field1861[var17] += arg3;
                        this.field1908[var17] += arg4;
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
                        this.field1860[var22] -= Statics.field1855;
                        this.field1861[var22] -= Statics.field1890;
                        this.field1908[var22] -= Statics.field1909;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1915[var25];
                            int var27 = field1916[var25];
                            int var28 = this.field1861[var22] * var26 + this.field1860[var22] * var27 >> 16;
                            this.field1861[var22] = this.field1861[var22] * var27 - this.field1860[var22] * var26 >> 16;
                            this.field1860[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1915[var23];
                            int var30 = field1916[var23];
                            int var31 = this.field1861[var22] * var30 - this.field1908[var22] * var29 >> 16;
                            this.field1908[var22] = this.field1908[var22] * var30 + this.field1861[var22] * var29 >> 16;
                            this.field1861[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1915[var24];
                            int var33 = field1916[var24];
                            int var34 = this.field1908[var22] * var32 + this.field1860[var22] * var33 >> 16;
                            this.field1908[var22] = this.field1908[var22] * var33 - this.field1860[var22] * var32 >> 16;
                            this.field1860[var22] = var34;
                        }
                        this.field1860[var22] += Statics.field1855;
                        this.field1861[var22] += Statics.field1890;
                        this.field1908[var22] += Statics.field1909;
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
                        this.field1860[var39] -= Statics.field1855;
                        this.field1861[var39] -= Statics.field1890;
                        this.field1908[var39] -= Statics.field1909;
                        this.field1860[var39] = this.field1860[var39] * arg2 / 128;
                        this.field1861[var39] = this.field1861[var39] * arg3 / 128;
                        this.field1908[var39] = this.field1908[var39] * arg4 / 128;
                        this.field1860[var39] += Statics.field1855;
                        this.field1861[var39] += Statics.field1890;
                        this.field1908[var39] += Statics.field1909;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1873 != null && this.field1871 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1873.length) {
                    int[] var42 = this.field1873[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1871[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1871[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("do.t()V")
    public void method2252() {
        for (int var1 = 0; var1 < this.field1859; var1++) {
            int var2 = this.field1860[var1];
            this.field1860[var1] = this.field1908[var1];
            this.field1908[var1] = -var2;
        }
        this.field1882 = 0;
    }

    @ObfuscatedName("do.g()V")
    public void method2253() {
        for (int var1 = 0; var1 < this.field1859; var1++) {
            this.field1860[var1] = -this.field1860[var1];
            this.field1908[var1] = -this.field1908[var1];
        }
        this.field1882 = 0;
    }

    @ObfuscatedName("do.o()V")
    public void method2254() {
        for (int var1 = 0; var1 < this.field1859; var1++) {
            int var2 = this.field1908[var1];
            this.field1908[var1] = this.field1860[var1];
            this.field1860[var1] = -var2;
        }
        this.field1882 = 0;
    }

    @ObfuscatedName("do.x(I)V")
    public void method2290(int arg0) {
        int var2 = field1915[arg0];
        int var3 = field1916[arg0];
        for (int var4 = 0; var4 < this.field1859; var4++) {
            int var5 = this.field1861[var4] * var3 - this.field1908[var4] * var2 >> 16;
            this.field1908[var4] = this.field1908[var4] * var3 + this.field1861[var4] * var2 >> 16;
            this.field1861[var4] = var5;
        }
        this.field1882 = 0;
    }

    @ObfuscatedName("do.c(III)V")
    public void method2261(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1859; var4++) {
            this.field1860[var4] += arg0;
            this.field1861[var4] += arg1;
            this.field1908[var4] += arg2;
        }
        this.field1882 = 0;
    }

    @ObfuscatedName("do.b(III)V")
    public void method2257(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1859; var4++) {
            this.field1860[var4] = this.field1860[var4] * arg0 / 128;
            this.field1861[var4] = this.field1861[var4] * arg1 / 128;
            this.field1908[var4] = this.field1908[var4] * arg2 / 128;
        }
        this.field1882 = 0;
    }

    @ObfuscatedName("do.f(IIIIIII)V")
    public final void method2258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1897[0] = -1;
        if (this.field1882 != 2 && this.field1882 != 1) {
            this.method2247();
        }
        int var8 = Statics.field1771;
        int var9 = Statics.field1761;
        int var10 = field1915[arg0];
        int var11 = field1916[arg0];
        int var12 = field1915[arg1];
        int var13 = field1916[arg1];
        int var14 = field1915[arg2];
        int var15 = field1916[arg2];
        int var16 = field1915[arg3];
        int var17 = field1916[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1859; var19++) {
            int var20 = this.field1860[var19];
            int var21 = this.field1861[var19];
            int var22 = this.field1908[var19];
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
            field1917[var19] = (var26 << 9) / var30 + var8;
            field1858[var19] = (var29 << 9) / var30 + var9;
            if (this.field1875 > 0) {
                field1893[var19] = var26;
                field1894[var19] = var29;
                field1895[var19] = var30;
            }
        }
        try {
            this.method2294(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("do.s(IIIIIIII)V")
    public final void method2259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1897[0] = -1;
        if (this.field1882 != 2 && this.field1882 != 1) {
            this.method2247();
        }
        int var9 = Statics.field1771;
        int var10 = Statics.field1761;
        int var11 = field1915[arg0];
        int var12 = field1916[arg0];
        int var13 = field1915[arg1];
        int var14 = field1916[arg1];
        int var15 = field1915[arg2];
        int var16 = field1916[arg2];
        int var17 = field1915[arg3];
        int var18 = field1916[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1859; var20++) {
            int var21 = this.field1860[var20];
            int var22 = this.field1861[var20];
            int var23 = this.field1908[var20];
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
            field1917[var20] = (var27 << 9) / arg7 + var9;
            field1858[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1875 > 0) {
                field1893[var20] = var27;
                field1894[var20] = var30;
                field1895[var20] = var31;
            }
        }
        try {
            this.method2294(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("do.v(IIIIIIIII)V")
    public void method1885(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1897[0] = -1;
        if (this.field1882 != 1) {
            this.method2268();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1884 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1884 << 9;
        if (var15 / var13 >= Statics.field1770) {
            return;
        }
        int var16 = this.field1884 + var14 << 9;
        if (var16 / var13 <= Statics.field1769) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1884 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1774) {
            return;
        }
        int var20 = (this.field1545 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1772) {
            return;
        }
        int var22 = (this.field1545 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1875 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1910) {
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
            int var32 = field1907 - Statics.field1771;
            int var33 = field1879 - Statics.field1761;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1881) {
                    field1914[field1913++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1771;
        int var35 = Statics.field1761;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1915[arg0];
            var37 = field1916[arg0];
        }
        for (int var38 = 0; var38 < this.field1859; var38++) {
            int var39 = this.field1860[var38];
            int var40 = this.field1861[var38];
            int var41 = this.field1908[var38];
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
            field1892[var38] = var50 - var11;
            if (var50 >= 50) {
                field1917[var38] = (var46 << 9) / var50 + var34;
                field1858[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1917[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1893[var38] = var46;
                field1894[var38] = var49;
                field1895[var38] = var50;
            }
        }
        try {
            this.method2294(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("do.y(ZZI)V")
    public final void method2294(boolean arg0, boolean arg1, int arg2) {
        if (this.field1885 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1885; var4++) {
            field1897[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1862; var5++) {
            if (this.field1899[var5] != -2) {
                int var6 = this.field1863[var5];
                int var7 = this.field1865[var5];
                int var8 = this.field1866[var5];
                int var9 = field1917[var6];
                int var10 = field1917[var7];
                int var11 = field1917[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1893[var6];
                    int var13 = field1893[var7];
                    int var14 = field1893[var8];
                    int var15 = field1894[var6];
                    int var16 = field1894[var7];
                    int var17 = field1894[var8];
                    int var18 = field1895[var6];
                    int var19 = field1895[var7];
                    int var20 = field1895[var8];
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
                        field1889[var5] = true;
                        int var30 = (field1892[var6] + field1892[var7] + field1892[var8]) / 3 + this.field1886;
                        field1891[var30][field1897[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2264(field1907, field1879, field1858[var6], field1858[var7], field1858[var8], var9, var10, var11)) {
                        field1914[field1913++] = arg2;
                        arg1 = false;
                    }
                    if ((field1858[var8] - field1858[var7]) * (var9 - var10) - (field1858[var6] - field1858[var7]) * (var11 - var10) > 0) {
                        field1889[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1767 && var10 <= Statics.field1767 && var11 <= Statics.field1767) {
                            field1888[var5] = false;
                        } else {
                            field1888[var5] = true;
                        }
                        int var31 = (field1892[var6] + field1892[var7] + field1892[var8]) / 3 + this.field1886;
                        field1891[var31][field1897[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1870 == null) {
            for (int var32 = this.field1885 - 1; var32 >= 0; var32--) {
                int var33 = field1897[var32];
                if (var33 > 0) {
                    int[] var34 = field1891[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2262(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1905[var36] = 0;
            field1903[var36] = 0;
        }
        for (int var37 = this.field1885 - 1; var37 >= 0; var37--) {
            int var38 = field1897[var37];
            if (var38 > 0) {
                int[] var39 = field1891[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1870[var41];
                    int var43 = field1905[var42]++;
                    field1900[var42][var43] = var41;
                    if (var42 < 10) {
                        field1903[var42] += var37;
                    } else if (var42 == 10) {
                        field1901[var43] = var37;
                    } else {
                        field1902[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1905[1] > 0 || field1905[2] > 0) {
            var44 = (field1903[1] + field1903[2]) / (field1905[1] + field1905[2]);
        }
        int var45 = 0;
        if (field1905[3] > 0 || field1905[4] > 0) {
            var45 = (field1903[3] + field1903[4]) / (field1905[3] + field1905[4]);
        }
        int var46 = 0;
        if (field1905[6] > 0 || field1905[8] > 0) {
            var46 = (field1903[6] + field1903[8]) / (field1905[6] + field1905[8]);
        }
        int var47 = 0;
        int var48 = field1905[10];
        int[] var49 = field1900[10];
        int[] var50 = field1901;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1905[11];
            var49 = field1900[11];
            var50 = field1902;
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
                if (var47 == var48 && field1900[11] != var49) {
                    var47 = 0;
                    var48 = field1905[11];
                    var49 = field1900[11];
                    var50 = field1902;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2262(var49[var47++]);
                if (var47 == var48 && field1900[11] != var49) {
                    var47 = 0;
                    var48 = field1905[11];
                    var49 = field1900[11];
                    var50 = field1902;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2262(var49[var47++]);
                if (var47 == var48 && field1900[11] != var49) {
                    var47 = 0;
                    var48 = field1905[11];
                    var49 = field1900[11];
                    var50 = field1902;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1905[var52];
            int[] var54 = field1900[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2262(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2262(var49[var47++]);
            if (var47 == var48 && field1900[11] != var49) {
                var47 = 0;
                var49 = field1900[11];
                var48 = field1905[11];
                var50 = field1902;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("do.r(I)V")
    public final void method2262(int arg0) {
        if (field1889[arg0]) {
            this.method2271(arg0);
            return;
        }
        int var2 = this.field1863[arg0];
        int var3 = this.field1865[arg0];
        int var4 = this.field1866[arg0];
        class105.field1766 = field1888[arg0];
        if (this.field1871 == null) {
            class105.field1759 = 0;
        } else {
            class105.field1759 = this.field1871[arg0] & 0xFF;
        }
        if (this.field1869 != null && this.field1869[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1872 == null || this.field1872[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1872[arg0] & 0xFF;
                var6 = this.field1876[var5];
                var7 = this.field1877[var5];
                var8 = this.field1878[var5];
            }
            if (this.field1899[arg0] == -1) {
                class105.method2145(field1858[var2], field1858[var3], field1858[var4], field1917[var2], field1917[var3], field1917[var4], this.field1867[arg0], this.field1867[arg0], this.field1867[arg0], field1893[var6], field1893[var7], field1893[var8], field1894[var6], field1894[var7], field1894[var8], field1895[var6], field1895[var7], field1895[var8], this.field1869[arg0]);
            } else {
                class105.method2145(field1858[var2], field1858[var3], field1858[var4], field1917[var2], field1917[var3], field1917[var4], this.field1867[arg0], this.field1868[arg0], this.field1899[arg0], field1893[var6], field1893[var7], field1893[var8], field1894[var6], field1894[var7], field1894[var8], field1895[var6], field1895[var7], field1895[var8], this.field1869[arg0]);
            }
        } else if (this.field1899[arg0] == -1) {
            class105.method2168(field1858[var2], field1858[var3], field1858[var4], field1917[var2], field1917[var3], field1917[var4], field1912[this.field1867[arg0]]);
        } else {
            class105.method2141(field1858[var2], field1858[var3], field1858[var4], field1917[var2], field1917[var3], field1917[var4], this.field1867[arg0], this.field1868[arg0], this.field1899[arg0]);
        }
    }

    @ObfuscatedName("do.l(I)V")
    public final void method2271(int arg0) {
        int var2 = Statics.field1771;
        int var3 = Statics.field1761;
        int var4 = 0;
        int var5 = this.field1863[arg0];
        int var6 = this.field1865[arg0];
        int var7 = this.field1866[arg0];
        int var8 = field1895[var5];
        int var9 = field1895[var6];
        int var10 = field1895[var7];
        if (this.field1871 == null) {
            class105.field1759 = 0;
        } else {
            class105.field1759 = this.field1871[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1904[var4] = field1917[var5];
            field1906[var4] = field1858[var5];
            field1864[var4++] = this.field1867[arg0];
        } else {
            int var11 = field1893[var5];
            int var12 = field1894[var5];
            int var13 = this.field1867[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1918[var10 - var8];
                field1904[var4] = (((field1893[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1906[var4] = (((field1894[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1864[var4++] = ((this.field1899[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1918[var9 - var8];
                field1904[var4] = (((field1893[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1906[var4] = (((field1894[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1864[var4++] = ((this.field1868[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1904[var4] = field1917[var6];
            field1906[var4] = field1858[var6];
            field1864[var4++] = this.field1868[arg0];
        } else {
            int var16 = field1893[var6];
            int var17 = field1894[var6];
            int var18 = this.field1868[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1918[var8 - var9];
                field1904[var4] = (((field1893[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1906[var4] = (((field1894[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1864[var4++] = ((this.field1867[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1918[var10 - var9];
                field1904[var4] = (((field1893[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1906[var4] = (((field1894[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1864[var4++] = ((this.field1899[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1904[var4] = field1917[var7];
            field1906[var4] = field1858[var7];
            field1864[var4++] = this.field1899[arg0];
        } else {
            int var21 = field1893[var7];
            int var22 = field1894[var7];
            int var23 = this.field1899[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1918[var9 - var10];
                field1904[var4] = (((field1893[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1906[var4] = (((field1894[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1864[var4++] = ((this.field1868[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1918[var8 - var10];
                field1904[var4] = (((field1893[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1906[var4] = (((field1894[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1864[var4++] = ((this.field1867[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1904[0];
        int var27 = field1904[1];
        int var28 = field1904[2];
        int var29 = field1906[0];
        int var30 = field1906[1];
        int var31 = field1906[2];
        class105.field1766 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1767 || var27 > Statics.field1767 || var28 > Statics.field1767) {
                class105.field1766 = true;
            }
            if (this.field1869 != null && this.field1869[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1872 == null || this.field1872[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1872[arg0] & 0xFF;
                    var33 = this.field1876[var32];
                    var34 = this.field1877[var32];
                    var35 = this.field1878[var32];
                }
                if (this.field1899[arg0] == -1) {
                    class105.method2145(var29, var30, var31, var26, var27, var28, this.field1867[arg0], this.field1867[arg0], this.field1867[arg0], field1893[var33], field1893[var34], field1893[var35], field1894[var33], field1894[var34], field1894[var35], field1895[var33], field1895[var34], field1895[var35], this.field1869[arg0]);
                } else {
                    class105.method2145(var29, var30, var31, var26, var27, var28, field1864[0], field1864[1], field1864[2], field1893[var33], field1893[var34], field1893[var35], field1894[var33], field1894[var34], field1894[var35], field1895[var33], field1895[var34], field1895[var35], this.field1869[arg0]);
                }
            } else if (this.field1899[arg0] == -1) {
                class105.method2168(var29, var30, var31, var26, var27, var28, field1912[this.field1867[arg0]]);
            } else {
                class105.method2141(var29, var30, var31, var26, var27, var28, field1864[0], field1864[1], field1864[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1767 || var27 > Statics.field1767 || var28 > Statics.field1767 || field1904[3] < 0 || field1904[3] > Statics.field1767) {
            class105.field1766 = true;
        }
        if (this.field1869 != null && this.field1869[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1872 == null || this.field1872[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1872[arg0] & 0xFF;
                var37 = this.field1876[var36];
                var38 = this.field1877[var36];
                var39 = this.field1878[var36];
            }
            short var40 = this.field1869[arg0];
            if (this.field1899[arg0] == -1) {
                class105.method2145(var29, var30, var31, var26, var27, var28, this.field1867[arg0], this.field1867[arg0], this.field1867[arg0], field1893[var37], field1893[var38], field1893[var39], field1894[var37], field1894[var38], field1894[var39], field1895[var37], field1895[var38], field1895[var39], var40);
                class105.method2145(var29, var31, field1906[3], var26, var28, field1904[3], this.field1867[arg0], this.field1867[arg0], this.field1867[arg0], field1893[var37], field1893[var38], field1893[var39], field1894[var37], field1894[var38], field1894[var39], field1895[var37], field1895[var38], field1895[var39], var40);
            } else {
                class105.method2145(var29, var30, var31, var26, var27, var28, field1864[0], field1864[1], field1864[2], field1893[var37], field1893[var38], field1893[var39], field1894[var37], field1894[var38], field1894[var39], field1895[var37], field1895[var38], field1895[var39], var40);
                class105.method2145(var29, var31, field1906[3], var26, var28, field1904[3], field1864[0], field1864[2], field1864[3], field1893[var37], field1893[var38], field1893[var39], field1894[var37], field1894[var38], field1894[var39], field1895[var37], field1895[var38], field1895[var39], var40);
            }
        } else if (this.field1899[arg0] == -1) {
            int var41 = field1912[this.field1867[arg0]];
            class105.method2168(var29, var30, var31, var26, var27, var28, var41);
            class105.method2168(var29, var31, field1906[3], var26, var28, field1904[3], var41);
        } else {
            class105.method2141(var29, var30, var31, var26, var27, var28, field1864[0], field1864[1], field1864[2]);
            class105.method2141(var29, var31, field1906[3], var26, var28, field1904[3], field1864[0], field1864[2], field1864[3]);
        }
    }

    @ObfuscatedName("do.n(IIIIIIII)Z")
    public final boolean method2264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
