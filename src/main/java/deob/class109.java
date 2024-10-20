package deob;

@ObfuscatedName("dg")
public class class109 extends class89 {

    @ObfuscatedName("dg.m")
    public static class109 field1883 = new class109();

    @ObfuscatedName("dg.w")
    public static byte[] field1863 = new byte[1];

    @ObfuscatedName("dg.e")
    public static class109 field1894 = new class109();

    @ObfuscatedName("dg.o")
    public static byte[] field1865 = new byte[1];

    @ObfuscatedName("dg.g")
    public int field1880 = 0;

    @ObfuscatedName("dg.l")
    public int[] field1922;

    @ObfuscatedName("dg.j")
    public int[] field1868;

    @ObfuscatedName("dg.r")
    public int[] field1869;

    @ObfuscatedName("dg.x")
    public int field1870 = 0;

    @ObfuscatedName("dg.k")
    public int[] field1871;

    @ObfuscatedName("dg.v")
    public int[] field1872;

    @ObfuscatedName("dg.h")
    public int[] field1873;

    @ObfuscatedName("dg.u")
    public int[] field1898;

    @ObfuscatedName("dg.y")
    public int[] field1874;

    @ObfuscatedName("dg.p")
    public int[] field1876;

    @ObfuscatedName("dg.s")
    public byte[] field1877;

    @ObfuscatedName("dg.f")
    public byte[] field1878;

    @ObfuscatedName("dg.i")
    public byte[] field1879;

    @ObfuscatedName("dg.d")
    public short[] field1887;

    @ObfuscatedName("dg.t")
    public byte field1881 = 0;

    @ObfuscatedName("dg.c")
    public int field1907 = 0;

    @ObfuscatedName("dg.z")
    public int[] field1891;

    @ObfuscatedName("dg.n")
    public int[] field1888;

    @ObfuscatedName("dg.q")
    public int[] field1885;

    @ObfuscatedName("dg.a")
    public int[][] field1886;

    @ObfuscatedName("dg.b")
    public int[][] field1892;

    @ObfuscatedName("dg.aj")
    public boolean field1925 = false;

    @ObfuscatedName("dg.an")
    public int field1889;

    @ObfuscatedName("dg.ap")
    public int field1890;

    @ObfuscatedName("dg.ar")
    public int field1917;

    @ObfuscatedName("dg.ab")
    public int field1867;

    @ObfuscatedName("dg.ai")
    public int field1866;

    @ObfuscatedName("dg.ax")
    public static boolean[] field1895 = new boolean[4700];

    @ObfuscatedName("dg.ad")
    public static boolean[] field1896 = new boolean[4700];

    @ObfuscatedName("dg.av")
    public static int[] field1897 = new int[4700];

    @ObfuscatedName("dg.aq")
    public static int[] field1900 = new int[4700];

    @ObfuscatedName("dg.af")
    public static int[] field1899 = new int[4700];

    @ObfuscatedName("dg.at")
    public static int[] field1904 = new int[4700];

    @ObfuscatedName("dg.aw")
    public static int[] field1901 = new int[4700];

    @ObfuscatedName("dg.ay")
    public static int[] field1902 = new int[4700];

    @ObfuscatedName("dg.al")
    public static int[] field1921 = new int[1600];

    @ObfuscatedName("dg.as")
    public static int[][] field1905 = new int[1600][512];

    @ObfuscatedName("dg.ac")
    public static int[] field1916 = new int[12];

    @ObfuscatedName("dg.ao")
    public static int[][] field1906 = new int[12][2000];

    @ObfuscatedName("dg.au")
    public static int[] field1884 = new int[2000];

    @ObfuscatedName("dg.am")
    public static int[] field1909 = new int[2000];

    @ObfuscatedName("dg.ag")
    public static int[] field1910 = new int[12];

    @ObfuscatedName("dg.az")
    public static int[] field1882 = new int[10];

    @ObfuscatedName("dg.ak")
    public static int[] field1912 = new int[10];

    @ObfuscatedName("dg.ae")
    public static int[] field1875 = new int[10];

    @ObfuscatedName("dg.bs")
    public static boolean field1864 = false;

    @ObfuscatedName("dg.bt")
    public static int field1918 = 0;

    @ObfuscatedName("dg.bh")
    public static int field1919 = 0;

    @ObfuscatedName("dg.be")
    public static int field1920 = 0;

    @ObfuscatedName("dg.bq")
    public static int[] field1911 = new int[1000];

    @ObfuscatedName("dg.bo")
    public static int[] field1908 = class95.field1661;

    @ObfuscatedName("dg.bm")
    public static int[] field1923 = class95.field1662;

    @ObfuscatedName("dg.by")
    public static int[] field1924 = class95.field1657;

    @ObfuscatedName("dg.ba")
    public static int[] field1893 = class95.field1660;

    public class109() {
    }

    public class109(class109[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1880 = 0;
        this.field1870 = 0;
        this.field1907 = 0;
        this.field1881 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class109 var8 = arg0[var7];
            if (var8 != null) {
                this.field1880 += var8.field1880;
                this.field1870 += var8.field1870;
                this.field1907 += var8.field1907;
                if (var8.field1877 == null) {
                    if (this.field1881 == -1) {
                        this.field1881 = var8.field1881;
                    }
                    if (this.field1881 != var8.field1881) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1878 != null;
                var5 |= var8.field1887 != null;
                var6 |= var8.field1879 != null;
            }
        }
        this.field1922 = new int[this.field1880];
        this.field1868 = new int[this.field1880];
        this.field1869 = new int[this.field1880];
        this.field1871 = new int[this.field1870];
        this.field1872 = new int[this.field1870];
        this.field1873 = new int[this.field1870];
        this.field1898 = new int[this.field1870];
        this.field1874 = new int[this.field1870];
        this.field1876 = new int[this.field1870];
        if (var3) {
            this.field1877 = new byte[this.field1870];
        }
        if (var4) {
            this.field1878 = new byte[this.field1870];
        }
        if (var5) {
            this.field1887 = new short[this.field1870];
        }
        if (var6) {
            this.field1879 = new byte[this.field1870];
        }
        if (this.field1907 > 0) {
            this.field1891 = new int[this.field1907];
            this.field1888 = new int[this.field1907];
            this.field1885 = new int[this.field1907];
        }
        this.field1880 = 0;
        this.field1870 = 0;
        this.field1907 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class109 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1870; var11++) {
                    this.field1871[this.field1870] = var10.field1871[var11] + this.field1880;
                    this.field1872[this.field1870] = var10.field1872[var11] + this.field1880;
                    this.field1873[this.field1870] = var10.field1873[var11] + this.field1880;
                    this.field1898[this.field1870] = var10.field1898[var11];
                    this.field1874[this.field1870] = var10.field1874[var11];
                    this.field1876[this.field1870] = var10.field1876[var11];
                    if (var3) {
                        if (var10.field1877 == null) {
                            this.field1877[this.field1870] = var10.field1881;
                        } else {
                            this.field1877[this.field1870] = var10.field1877[var11];
                        }
                    }
                    if (var4 && var10.field1878 != null) {
                        this.field1878[this.field1870] = var10.field1878[var11];
                    }
                    if (var5) {
                        if (var10.field1887 == null) {
                            this.field1887[this.field1870] = -1;
                        } else {
                            this.field1887[this.field1870] = var10.field1887[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1879 == null || var10.field1879[var11] == -1) {
                            this.field1879[this.field1870] = -1;
                        } else {
                            this.field1879[this.field1870] = (byte) (var10.field1879[var11] + this.field1907);
                        }
                    }
                    this.field1870++;
                }
                for (int var12 = 0; var12 < var10.field1907; var12++) {
                    this.field1891[this.field1907] = var10.field1891[var12] + this.field1880;
                    this.field1888[this.field1907] = var10.field1888[var12] + this.field1880;
                    this.field1885[this.field1907] = var10.field1885[var12] + this.field1880;
                    this.field1907++;
                }
                for (int var13 = 0; var13 < var10.field1880; var13++) {
                    this.field1922[this.field1880] = var10.field1922[var13];
                    this.field1868[this.field1880] = var10.field1868[var13];
                    this.field1869[this.field1880] = var10.field1869[var13];
                    this.field1880++;
                }
            }
        }
    }

    @ObfuscatedName("dg.m([[IIIIZI)Ldg;")
    public class109 method2221(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2237();
        int var7 = arg1 - this.field1917;
        int var8 = this.field1917 + arg1;
        int var9 = arg3 - this.field1917;
        int var10 = this.field1917 + arg3;
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
            var15.field1880 = this.field1880;
            var15.field1870 = this.field1870;
            var15.field1907 = this.field1907;
            var15.field1922 = this.field1922;
            var15.field1869 = this.field1869;
            var15.field1871 = this.field1871;
            var15.field1872 = this.field1872;
            var15.field1873 = this.field1873;
            var15.field1898 = this.field1898;
            var15.field1874 = this.field1874;
            var15.field1876 = this.field1876;
            var15.field1877 = this.field1877;
            var15.field1878 = this.field1878;
            var15.field1879 = this.field1879;
            var15.field1887 = this.field1887;
            var15.field1881 = this.field1881;
            var15.field1891 = this.field1891;
            var15.field1888 = this.field1888;
            var15.field1885 = this.field1885;
            var15.field1886 = this.field1886;
            var15.field1892 = this.field1892;
            var15.field1925 = this.field1925;
            var15.field1868 = new int[var15.field1880];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1880; var16++) {
                int var17 = this.field1922[var16] + arg1;
                int var18 = this.field1869[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1868[var16] = this.field1868[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1880; var26++) {
                int var27 = (-this.field1868[var26] << 16) / this.field1537;
                if (var27 < arg5) {
                    int var28 = this.field1922[var26] + arg1;
                    int var29 = this.field1869[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1868[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1868[var26];
                }
            }
        }
        var15.field1889 = 0;
        return var15;
    }

    @ObfuscatedName("dg.w(Z)Ldg;")
    public class109 method2222(boolean arg0) {
        if (!arg0 && field1863.length < this.field1870) {
            field1863 = new byte[this.field1870 + 100];
        }
        return this.method2269(arg0, field1883, field1863);
    }

    @ObfuscatedName("dg.o(Z)Ldg;")
    public class109 method2223(boolean arg0) {
        if (!arg0 && field1865.length < this.field1870) {
            field1865 = new byte[this.field1870 + 100];
        }
        return this.method2269(arg0, field1894, field1865);
    }

    @ObfuscatedName("dg.g(ZLdg;[B)Ldg;")
    public class109 method2269(boolean arg0, class109 arg1, byte[] arg2) {
        arg1.field1880 = this.field1880;
        arg1.field1870 = this.field1870;
        arg1.field1907 = this.field1907;
        if (arg1.field1922 == null || arg1.field1922.length < this.field1880) {
            arg1.field1922 = new int[this.field1880 + 100];
            arg1.field1868 = new int[this.field1880 + 100];
            arg1.field1869 = new int[this.field1880 + 100];
        }
        for (int var4 = 0; var4 < this.field1880; var4++) {
            arg1.field1922[var4] = this.field1922[var4];
            arg1.field1868[var4] = this.field1868[var4];
            arg1.field1869[var4] = this.field1869[var4];
        }
        if (arg0) {
            arg1.field1878 = this.field1878;
        } else {
            arg1.field1878 = arg2;
            if (this.field1878 == null) {
                for (int var5 = 0; var5 < this.field1870; var5++) {
                    arg1.field1878[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1870; var6++) {
                    arg1.field1878[var6] = this.field1878[var6];
                }
            }
        }
        arg1.field1871 = this.field1871;
        arg1.field1872 = this.field1872;
        arg1.field1873 = this.field1873;
        arg1.field1898 = this.field1898;
        arg1.field1874 = this.field1874;
        arg1.field1876 = this.field1876;
        arg1.field1877 = this.field1877;
        arg1.field1879 = this.field1879;
        arg1.field1887 = this.field1887;
        arg1.field1881 = this.field1881;
        arg1.field1891 = this.field1891;
        arg1.field1888 = this.field1888;
        arg1.field1885 = this.field1885;
        arg1.field1886 = this.field1886;
        arg1.field1892 = this.field1892;
        arg1.field1925 = this.field1925;
        arg1.field1889 = 0;
        return arg1;
    }

    @ObfuscatedName("dg.l()V")
    public void method2237() {
        if (this.field1889 == 1) {
            return;
        }
        this.field1889 = 1;
        this.field1537 = 0;
        this.field1890 = 0;
        this.field1917 = 0;
        for (int var1 = 0; var1 < this.field1880; var1++) {
            int var2 = this.field1922[var1];
            int var3 = this.field1868[var1];
            int var4 = this.field1869[var1];
            if (-var3 > this.field1537) {
                this.field1537 = -var3;
            }
            if (var3 > this.field1890) {
                this.field1890 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1917) {
                this.field1917 = var5;
            }
        }
        this.field1917 = (int) (Math.sqrt((double) this.field1917) + 0.99D);
        this.field1866 = (int) (Math.sqrt((double) (this.field1537 * this.field1537 + this.field1917 * this.field1917)) + 0.99D);
        this.field1867 = this.field1866 + (int) (Math.sqrt((double) (this.field1917 * this.field1917 + this.field1890 * this.field1890)) + 0.99D);
    }

    @ObfuscatedName("dg.j()V")
    public void method2279() {
        if (this.field1889 == 2) {
            return;
        }
        this.field1889 = 2;
        this.field1917 = 0;
        for (int var1 = 0; var1 < this.field1880; var1++) {
            int var2 = this.field1922[var1];
            int var3 = this.field1868[var1];
            int var4 = this.field1869[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1917) {
                this.field1917 = var5;
            }
        }
        this.field1917 = (int) (Math.sqrt((double) this.field1917) + 0.99D);
        this.field1866 = this.field1917;
        this.field1867 = this.field1917 + this.field1917;
    }

    @ObfuscatedName("dg.r()I")
    public int method2227() {
        this.method2237();
        return this.field1917;
    }

    @ObfuscatedName("dg.x(Ldz;I)V")
    public void method2242(class107 arg0, int arg1) {
        if (this.field1886 == null || arg1 == -1) {
            return;
        }
        class92 var3 = arg0.field1842[arg1];
        class106 var4 = var3.field1613;
        Statics.field1914 = 0;
        Statics.field1915 = 0;
        Statics.field1862 = 0;
        for (int var5 = 0; var5 < var3.field1618; var5++) {
            int var6 = var3.field1619[var5];
            this.method2229(var4.field1832[var6], var4.field1833[var6], var3.field1620[var5], var3.field1621[var5], var3.field1623[var5]);
        }
        this.field1889 = 0;
    }

    @ObfuscatedName("dg.y(Ldz;ILdz;I[I)V")
    public void method2267(class107 arg0, int arg1, class107 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2242(arg0, arg1);
            return;
        }
        class92 var6 = arg0.field1842[arg1];
        class92 var7 = arg2.field1842[arg3];
        class106 var8 = var6.field1613;
        Statics.field1914 = 0;
        Statics.field1915 = 0;
        Statics.field1862 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1618; var11++) {
            int var12 = var6.field1619[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1832[var12] == 0) {
                this.method2229(var8.field1832[var12], var8.field1833[var12], var6.field1620[var11], var6.field1621[var11], var6.field1623[var11]);
            }
        }
        Statics.field1914 = 0;
        Statics.field1915 = 0;
        Statics.field1862 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1618; var15++) {
            int var16 = var7.field1619[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1832[var16] == 0) {
                this.method2229(var8.field1832[var16], var8.field1833[var16], var7.field1620[var15], var7.field1621[var15], var7.field1623[var15]);
            }
        }
        this.field1889 = 0;
    }

    @ObfuscatedName("dg.p(I[IIII)V")
    public void method2229(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1914 = 0;
            Statics.field1915 = 0;
            Statics.field1862 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1886.length) {
                    int[] var10 = this.field1886[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1914 += this.field1922[var12];
                        Statics.field1915 += this.field1868[var12];
                        Statics.field1862 += this.field1869[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1914 = Statics.field1914 / var7 + arg2;
                Statics.field1915 = Statics.field1915 / var7 + arg3;
                Statics.field1862 = Statics.field1862 / var7 + arg4;
            } else {
                Statics.field1914 = arg2;
                Statics.field1915 = arg3;
                Statics.field1862 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1886.length) {
                    int[] var15 = this.field1886[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1922[var17] += arg2;
                        this.field1868[var17] += arg3;
                        this.field1869[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1886.length) {
                    int[] var20 = this.field1886[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1922[var22] -= Statics.field1914;
                        this.field1868[var22] -= Statics.field1915;
                        this.field1869[var22] -= Statics.field1862;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1908[var25];
                            int var27 = field1923[var25];
                            int var28 = this.field1922[var22] * var27 + this.field1868[var22] * var26 >> 16;
                            this.field1868[var22] = this.field1868[var22] * var27 - this.field1922[var22] * var26 >> 16;
                            this.field1922[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1908[var23];
                            int var30 = field1923[var23];
                            int var31 = this.field1868[var22] * var30 - this.field1869[var22] * var29 >> 16;
                            this.field1869[var22] = this.field1869[var22] * var30 + this.field1868[var22] * var29 >> 16;
                            this.field1868[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1908[var24];
                            int var33 = field1923[var24];
                            int var34 = this.field1922[var22] * var33 + this.field1869[var22] * var32 >> 16;
                            this.field1869[var22] = this.field1869[var22] * var33 - this.field1922[var22] * var32 >> 16;
                            this.field1922[var22] = var34;
                        }
                        this.field1922[var22] += Statics.field1914;
                        this.field1868[var22] += Statics.field1915;
                        this.field1869[var22] += Statics.field1862;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1886.length) {
                    int[] var37 = this.field1886[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1922[var39] -= Statics.field1914;
                        this.field1868[var39] -= Statics.field1915;
                        this.field1869[var39] -= Statics.field1862;
                        this.field1922[var39] = this.field1922[var39] * arg2 / 128;
                        this.field1868[var39] = this.field1868[var39] * arg3 / 128;
                        this.field1869[var39] = this.field1869[var39] * arg4 / 128;
                        this.field1922[var39] += Statics.field1914;
                        this.field1868[var39] += Statics.field1915;
                        this.field1869[var39] += Statics.field1862;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1892 != null && this.field1878 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1892.length) {
                    int[] var42 = this.field1892[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1878[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1878[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dg.s()V")
    public void method2230() {
        for (int var1 = 0; var1 < this.field1880; var1++) {
            int var2 = this.field1922[var1];
            this.field1922[var1] = this.field1869[var1];
            this.field1869[var1] = -var2;
        }
        this.field1889 = 0;
    }

    @ObfuscatedName("dg.f()V")
    public void method2231() {
        for (int var1 = 0; var1 < this.field1880; var1++) {
            this.field1922[var1] = -this.field1922[var1];
            this.field1869[var1] = -this.field1869[var1];
        }
        this.field1889 = 0;
    }

    @ObfuscatedName("dg.i()V")
    public void method2232() {
        for (int var1 = 0; var1 < this.field1880; var1++) {
            int var2 = this.field1869[var1];
            this.field1869[var1] = this.field1922[var1];
            this.field1922[var1] = -var2;
        }
        this.field1889 = 0;
    }

    @ObfuscatedName("dg.d(I)V")
    public void method2233(int arg0) {
        int var2 = field1908[arg0];
        int var3 = field1923[arg0];
        for (int var4 = 0; var4 < this.field1880; var4++) {
            int var5 = this.field1868[var4] * var3 - this.field1869[var4] * var2 >> 16;
            this.field1869[var4] = this.field1869[var4] * var3 + this.field1868[var4] * var2 >> 16;
            this.field1868[var4] = var5;
        }
        this.field1889 = 0;
    }

    @ObfuscatedName("dg.t(III)V")
    public void method2226(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1880; var4++) {
            this.field1922[var4] += arg0;
            this.field1868[var4] += arg1;
            this.field1869[var4] += arg2;
        }
        this.field1889 = 0;
    }

    @ObfuscatedName("dg.c(III)V")
    public void method2245(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1880; var4++) {
            this.field1922[var4] = this.field1922[var4] * arg0 / 128;
            this.field1868[var4] = this.field1868[var4] * arg1 / 128;
            this.field1869[var4] = this.field1869[var4] * arg2 / 128;
        }
        this.field1889 = 0;
    }

    @ObfuscatedName("dg.z(IIIIIII)V")
    public final void method2270(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1921[0] = -1;
        if (this.field1889 != 2 && this.field1889 != 1) {
            this.method2279();
        }
        int var8 = Statics.field1650;
        int var9 = Statics.field1649;
        int var10 = field1908[arg0];
        int var11 = field1923[arg0];
        int var12 = field1908[arg1];
        int var13 = field1923[arg1];
        int var14 = field1908[arg2];
        int var15 = field1923[arg2];
        int var16 = field1908[arg3];
        int var17 = field1923[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1880; var19++) {
            int var20 = this.field1922[var19];
            int var21 = this.field1868[var19];
            int var22 = this.field1869[var19];
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
            field1899[var19] = var30 - var18;
            field1897[var19] = class95.field1647 * var26 / var30 + var8;
            field1900[var19] = class95.field1647 * var29 / var30 + var9;
            if (this.field1907 > 0) {
                field1904[var19] = var26;
                field1901[var19] = var29;
                field1902[var19] = var30;
            }
        }
        try {
            this.method2258(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dg.n(IIIIIIII)V")
    public final void method2236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1921[0] = -1;
        if (this.field1889 != 2 && this.field1889 != 1) {
            this.method2279();
        }
        int var9 = Statics.field1650;
        int var10 = Statics.field1649;
        int var11 = field1908[arg0];
        int var12 = field1923[arg0];
        int var13 = field1908[arg1];
        int var14 = field1923[arg1];
        int var15 = field1908[arg2];
        int var16 = field1923[arg2];
        int var17 = field1908[arg3];
        int var18 = field1923[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1880; var20++) {
            int var21 = this.field1922[var20];
            int var22 = this.field1868[var20];
            int var23 = this.field1869[var20];
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
            field1899[var20] = var31 - var19;
            field1897[var20] = class95.field1647 * var27 / arg7 + var9;
            field1900[var20] = class95.field1647 * var30 / arg7 + var10;
            if (this.field1907 > 0) {
                field1904[var20] = var27;
                field1901[var20] = var30;
                field1902[var20] = var31;
            }
        }
        try {
            this.method2258(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dg.ai(IIIIIIIII)V")
    public void method1864(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1921[0] = -1;
        if (this.field1889 != 1) {
            this.method2237();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1917 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1917) * class95.field1647;
        if (var15 / var13 >= Statics.field1653) {
            return;
        }
        int var16 = (this.field1917 + var14) * class95.field1647;
        if (var16 / var13 <= Statics.field1655) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1917 * arg1 >> 16;
        int var19 = (var17 + var18) * class95.field1647;
        if (var19 / var13 <= Statics.field1639) {
            return;
        }
        int var20 = (this.field1537 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class95.field1647;
        if (var21 / var13 >= Statics.field1641) {
            return;
        }
        int var22 = (this.field1537 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1907 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1864) {
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
            int var32 = field1918 - Statics.field1650;
            int var33 = field1919 - Statics.field1649;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1925) {
                    field1911[field1920++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1650;
        int var35 = Statics.field1649;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1908[arg0];
            var37 = field1923[arg0];
        }
        for (int var38 = 0; var38 < this.field1880; var38++) {
            int var39 = this.field1922[var38];
            int var40 = this.field1868[var38];
            int var41 = this.field1869[var38];
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
            field1899[var38] = var50 - var11;
            if (var50 >= 50) {
                field1897[var38] = class95.field1647 * var46 / var50 + var34;
                field1900[var38] = class95.field1647 * var49 / var50 + var35;
            } else {
                field1897[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1904[var38] = var46;
                field1901[var38] = var49;
                field1902[var38] = var50;
            }
        }
        try {
            this.method2258(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dg.q(ZZI)V")
    public final void method2258(boolean arg0, boolean arg1, int arg2) {
        if (this.field1867 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1867; var4++) {
            field1921[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1870; var5++) {
            if (this.field1876[var5] != -2) {
                int var6 = this.field1871[var5];
                int var7 = this.field1872[var5];
                int var8 = this.field1873[var5];
                int var9 = field1897[var6];
                int var10 = field1897[var7];
                int var11 = field1897[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1904[var6];
                    int var13 = field1904[var7];
                    int var14 = field1904[var8];
                    int var15 = field1901[var6];
                    int var16 = field1901[var7];
                    int var17 = field1901[var8];
                    int var18 = field1902[var6];
                    int var19 = field1902[var7];
                    int var20 = field1902[var8];
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
                        field1896[var5] = true;
                        int var30 = (field1899[var6] + field1899[var7] + field1899[var8]) / 3 + this.field1866;
                        field1905[var30][field1921[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2240(field1918, field1919, field1900[var6], field1900[var7], field1900[var8], var9, var10, var11)) {
                        field1911[field1920++] = arg2;
                        arg1 = false;
                    }
                    if ((field1900[var8] - field1900[var7]) * (var9 - var10) - (field1900[var6] - field1900[var7]) * (var11 - var10) > 0) {
                        field1896[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1643 && var10 <= Statics.field1643 && var11 <= Statics.field1643) {
                            field1895[var5] = false;
                        } else {
                            field1895[var5] = true;
                        }
                        int var31 = (field1899[var6] + field1899[var7] + field1899[var8]) / 3 + this.field1866;
                        field1905[var31][field1921[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1877 == null) {
            for (int var32 = this.field1867 - 1; var32 >= 0; var32--) {
                int var33 = field1921[var32];
                if (var33 > 0) {
                    int[] var34 = field1905[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2280(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1916[var36] = 0;
            field1910[var36] = 0;
        }
        for (int var37 = this.field1867 - 1; var37 >= 0; var37--) {
            int var38 = field1921[var37];
            if (var38 > 0) {
                int[] var39 = field1905[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1877[var41];
                    int var43 = field1916[var42]++;
                    field1906[var42][var43] = var41;
                    if (var42 < 10) {
                        field1910[var42] += var37;
                    } else if (var42 == 10) {
                        field1884[var43] = var37;
                    } else {
                        field1909[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1916[1] > 0 || field1916[2] > 0) {
            var44 = (field1910[1] + field1910[2]) / (field1916[1] + field1916[2]);
        }
        int var45 = 0;
        if (field1916[3] > 0 || field1916[4] > 0) {
            var45 = (field1910[3] + field1910[4]) / (field1916[3] + field1916[4]);
        }
        int var46 = 0;
        if (field1916[6] > 0 || field1916[8] > 0) {
            var46 = (field1910[6] + field1910[8]) / (field1916[6] + field1916[8]);
        }
        int var47 = 0;
        int var48 = field1916[10];
        int[] var49 = field1906[10];
        int[] var50 = field1884;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1916[11];
            var49 = field1906[11];
            var50 = field1909;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2280(var49[var47++]);
                if (var47 == var48 && field1906[11] != var49) {
                    var47 = 0;
                    var48 = field1916[11];
                    var49 = field1906[11];
                    var50 = field1909;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2280(var49[var47++]);
                if (var47 == var48 && field1906[11] != var49) {
                    var47 = 0;
                    var48 = field1916[11];
                    var49 = field1906[11];
                    var50 = field1909;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2280(var49[var47++]);
                if (var47 == var48 && field1906[11] != var49) {
                    var47 = 0;
                    var48 = field1916[11];
                    var49 = field1906[11];
                    var50 = field1909;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1916[var52];
            int[] var54 = field1906[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2280(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2280(var49[var47++]);
            if (var47 == var48 && field1906[11] != var49) {
                var47 = 0;
                var49 = field1906[11];
                var48 = field1916[11];
                var50 = field1909;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dg.a(I)V")
    public final void method2280(int arg0) {
        if (field1896[arg0]) {
            this.method2239(arg0);
            return;
        }
        int var2 = this.field1871[arg0];
        int var3 = this.field1872[arg0];
        int var4 = this.field1873[arg0];
        class95.field1640 = field1895[arg0];
        if (this.field1878 == null) {
            class95.field1642 = 0;
        } else {
            class95.field1642 = this.field1878[arg0] & 0xFF;
        }
        if (this.field1887 != null && this.field1887[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1879 == null || this.field1879[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1879[arg0] & 0xFF;
                var6 = this.field1891[var5];
                var7 = this.field1888[var5];
                var8 = this.field1885[var5];
            }
            if (this.field1876[arg0] == -1) {
                class95.method2093(field1900[var2], field1900[var3], field1900[var4], field1897[var2], field1897[var3], field1897[var4], this.field1898[arg0], this.field1898[arg0], this.field1898[arg0], field1904[var6], field1904[var7], field1904[var8], field1901[var6], field1901[var7], field1901[var8], field1902[var6], field1902[var7], field1902[var8], this.field1887[arg0]);
            } else {
                class95.method2093(field1900[var2], field1900[var3], field1900[var4], field1897[var2], field1897[var3], field1897[var4], this.field1898[arg0], this.field1874[arg0], this.field1876[arg0], field1904[var6], field1904[var7], field1904[var8], field1901[var6], field1901[var7], field1901[var8], field1902[var6], field1902[var7], field1902[var8], this.field1887[arg0]);
            }
        } else if (this.field1876[arg0] == -1) {
            class95.method2041(field1900[var2], field1900[var3], field1900[var4], field1897[var2], field1897[var3], field1897[var4], field1924[this.field1898[arg0]]);
        } else {
            class95.method2045(field1900[var2], field1900[var3], field1900[var4], field1897[var2], field1897[var3], field1897[var4], this.field1898[arg0], this.field1874[arg0], this.field1876[arg0]);
        }
    }

    @ObfuscatedName("dg.b(I)V")
    public final void method2239(int arg0) {
        int var2 = Statics.field1650;
        int var3 = Statics.field1649;
        int var4 = 0;
        int var5 = this.field1871[arg0];
        int var6 = this.field1872[arg0];
        int var7 = this.field1873[arg0];
        int var8 = field1902[var5];
        int var9 = field1902[var6];
        int var10 = field1902[var7];
        if (this.field1878 == null) {
            class95.field1642 = 0;
        } else {
            class95.field1642 = this.field1878[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1882[var4] = field1897[var5];
            field1912[var4] = field1900[var5];
            field1875[var4++] = this.field1898[arg0];
        } else {
            int var11 = field1904[var5];
            int var12 = field1901[var5];
            int var13 = this.field1898[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1893[var10 - var8];
                field1882[var4] = (((field1904[var7] - var11) * var14 >> 16) + var11) * class95.field1647 / 50 + var2;
                field1912[var4] = (((field1901[var7] - var12) * var14 >> 16) + var12) * class95.field1647 / 50 + var3;
                field1875[var4++] = ((this.field1876[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1893[var9 - var8];
                field1882[var4] = (((field1904[var6] - var11) * var15 >> 16) + var11) * class95.field1647 / 50 + var2;
                field1912[var4] = (((field1901[var6] - var12) * var15 >> 16) + var12) * class95.field1647 / 50 + var3;
                field1875[var4++] = ((this.field1874[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1882[var4] = field1897[var6];
            field1912[var4] = field1900[var6];
            field1875[var4++] = this.field1874[arg0];
        } else {
            int var16 = field1904[var6];
            int var17 = field1901[var6];
            int var18 = this.field1874[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1893[var8 - var9];
                field1882[var4] = (((field1904[var5] - var16) * var19 >> 16) + var16) * class95.field1647 / 50 + var2;
                field1912[var4] = (((field1901[var5] - var17) * var19 >> 16) + var17) * class95.field1647 / 50 + var3;
                field1875[var4++] = ((this.field1898[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1893[var10 - var9];
                field1882[var4] = (((field1904[var7] - var16) * var20 >> 16) + var16) * class95.field1647 / 50 + var2;
                field1912[var4] = (((field1901[var7] - var17) * var20 >> 16) + var17) * class95.field1647 / 50 + var3;
                field1875[var4++] = ((this.field1876[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1882[var4] = field1897[var7];
            field1912[var4] = field1900[var7];
            field1875[var4++] = this.field1876[arg0];
        } else {
            int var21 = field1904[var7];
            int var22 = field1901[var7];
            int var23 = this.field1876[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1893[var9 - var10];
                field1882[var4] = (((field1904[var6] - var21) * var24 >> 16) + var21) * class95.field1647 / 50 + var2;
                field1912[var4] = (((field1901[var6] - var22) * var24 >> 16) + var22) * class95.field1647 / 50 + var3;
                field1875[var4++] = ((this.field1874[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1893[var8 - var10];
                field1882[var4] = (((field1904[var5] - var21) * var25 >> 16) + var21) * class95.field1647 / 50 + var2;
                field1912[var4] = (((field1901[var5] - var22) * var25 >> 16) + var22) * class95.field1647 / 50 + var3;
                field1875[var4++] = ((this.field1898[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1882[0];
        int var27 = field1882[1];
        int var28 = field1882[2];
        int var29 = field1912[0];
        int var30 = field1912[1];
        int var31 = field1912[2];
        class95.field1640 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1643 || var27 > Statics.field1643 || var28 > Statics.field1643) {
                class95.field1640 = true;
            }
            if (this.field1887 != null && this.field1887[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1879 == null || this.field1879[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1879[arg0] & 0xFF;
                    var33 = this.field1891[var32];
                    var34 = this.field1888[var32];
                    var35 = this.field1885[var32];
                }
                if (this.field1876[arg0] == -1) {
                    class95.method2093(var29, var30, var31, var26, var27, var28, this.field1898[arg0], this.field1898[arg0], this.field1898[arg0], field1904[var33], field1904[var34], field1904[var35], field1901[var33], field1901[var34], field1901[var35], field1902[var33], field1902[var34], field1902[var35], this.field1887[arg0]);
                } else {
                    class95.method2093(var29, var30, var31, var26, var27, var28, field1875[0], field1875[1], field1875[2], field1904[var33], field1904[var34], field1904[var35], field1901[var33], field1901[var34], field1901[var35], field1902[var33], field1902[var34], field1902[var35], this.field1887[arg0]);
                }
            } else if (this.field1876[arg0] == -1) {
                class95.method2041(var29, var30, var31, var26, var27, var28, field1924[this.field1898[arg0]]);
            } else {
                class95.method2045(var29, var30, var31, var26, var27, var28, field1875[0], field1875[1], field1875[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1643 || var27 > Statics.field1643 || var28 > Statics.field1643 || field1882[3] < 0 || field1882[3] > Statics.field1643) {
            class95.field1640 = true;
        }
        if (this.field1887 != null && this.field1887[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1879 == null || this.field1879[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1879[arg0] & 0xFF;
                var37 = this.field1891[var36];
                var38 = this.field1888[var36];
                var39 = this.field1885[var36];
            }
            short var40 = this.field1887[arg0];
            if (this.field1876[arg0] == -1) {
                class95.method2093(var29, var30, var31, var26, var27, var28, this.field1898[arg0], this.field1898[arg0], this.field1898[arg0], field1904[var37], field1904[var38], field1904[var39], field1901[var37], field1901[var38], field1901[var39], field1902[var37], field1902[var38], field1902[var39], var40);
                class95.method2093(var29, var31, field1912[3], var26, var28, field1882[3], this.field1898[arg0], this.field1898[arg0], this.field1898[arg0], field1904[var37], field1904[var38], field1904[var39], field1901[var37], field1901[var38], field1901[var39], field1902[var37], field1902[var38], field1902[var39], var40);
            } else {
                class95.method2093(var29, var30, var31, var26, var27, var28, field1875[0], field1875[1], field1875[2], field1904[var37], field1904[var38], field1904[var39], field1901[var37], field1901[var38], field1901[var39], field1902[var37], field1902[var38], field1902[var39], var40);
                class95.method2093(var29, var31, field1912[3], var26, var28, field1882[3], field1875[0], field1875[2], field1875[3], field1904[var37], field1904[var38], field1904[var39], field1901[var37], field1901[var38], field1901[var39], field1902[var37], field1902[var38], field1902[var39], var40);
            }
        } else if (this.field1876[arg0] == -1) {
            int var41 = field1924[this.field1898[arg0]];
            class95.method2041(var29, var30, var31, var26, var27, var28, var41);
            class95.method2041(var29, var31, field1912[3], var26, var28, field1882[3], var41);
        } else {
            class95.method2045(var29, var30, var31, var26, var27, var28, field1875[0], field1875[1], field1875[2]);
            class95.method2045(var29, var31, field1912[3], var26, var28, field1882[3], field1875[0], field1875[2], field1875[3]);
        }
    }

    @ObfuscatedName("dg.aj(IIIIIIII)Z")
    public final boolean method2240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
