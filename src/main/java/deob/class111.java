package deob;

@ObfuscatedName("dm")
public class class111 extends class93 {

    @ObfuscatedName("dm.p")
    public static class111 field1918 = new class111();

    @ObfuscatedName("dm.j")
    public static byte[] field1866 = new byte[1];

    @ObfuscatedName("dm.w")
    public static class111 field1867 = new class111();

    @ObfuscatedName("dm.h")
    public static byte[] field1868 = new byte[1];

    @ObfuscatedName("dm.v")
    public int field1904 = 0;

    @ObfuscatedName("dm.k")
    public int[] field1909;

    @ObfuscatedName("dm.g")
    public int[] field1871;

    @ObfuscatedName("dm.n")
    public int[] field1872;

    @ObfuscatedName("dm.c")
    public int field1892 = 0;

    @ObfuscatedName("dm.o")
    public int[] field1874;

    @ObfuscatedName("dm.u")
    public int[] field1875;

    @ObfuscatedName("dm.z")
    public int[] field1916;

    @ObfuscatedName("dm.e")
    public int[] field1877;

    @ObfuscatedName("dm.l")
    public int[] field1878;

    @ObfuscatedName("dm.m")
    public int[] field1900;

    @ObfuscatedName("dm.s")
    public byte[] field1880;

    @ObfuscatedName("dm.i")
    public byte[] field1881;

    @ObfuscatedName("dm.y")
    public byte[] field1882;

    @ObfuscatedName("dm.d")
    public short[] field1883;

    @ObfuscatedName("dm.f")
    public byte field1884 = 0;

    @ObfuscatedName("dm.a")
    public int field1885 = 0;

    @ObfuscatedName("dm.x")
    public int[] field1886;

    @ObfuscatedName("dm.r")
    public int[] field1920;

    @ObfuscatedName("dm.t")
    public int[] field1870;

    @ObfuscatedName("dm.b")
    public int[][] field1889;

    @ObfuscatedName("dm.q")
    public int[][] field1930;

    @ObfuscatedName("dm.ae")
    public boolean field1891 = false;

    @ObfuscatedName("dm.at")
    public int field1895;

    @ObfuscatedName("dm.aj")
    public int field1926;

    @ObfuscatedName("dm.aq")
    public int field1894;

    @ObfuscatedName("dm.ac")
    public int field1902;

    @ObfuscatedName("dm.az")
    public int field1896;

    @ObfuscatedName("dm.am")
    public static boolean[] field1898 = new boolean[4096];

    @ObfuscatedName("dm.ad")
    public static boolean[] field1907 = new boolean[4096];

    @ObfuscatedName("dm.an")
    public static int[] field1925 = new int[4096];

    @ObfuscatedName("dm.al")
    public static int[] field1901 = new int[4096];

    @ObfuscatedName("dm.ab")
    public static int[] field1924 = new int[4096];

    @ObfuscatedName("dm.af")
    public static int[] field1903 = new int[4096];

    @ObfuscatedName("dm.ap")
    public static int[] field1876 = new int[4096];

    @ObfuscatedName("dm.as")
    public static int[] field1905 = new int[4096];

    @ObfuscatedName("dm.ay")
    public static int[] field1931 = new int[1600];

    @ObfuscatedName("dm.ah")
    public static int[][] field1908 = new int[1600][512];

    @ObfuscatedName("dm.aa")
    public static int[] field1899 = new int[12];

    @ObfuscatedName("dm.ag")
    public static int[][] field1910 = new int[12][2000];

    @ObfuscatedName("dm.au")
    public static int[] field1911 = new int[2000];

    @ObfuscatedName("dm.aw")
    public static int[] field1912 = new int[2000];

    @ObfuscatedName("dm.ar")
    public static int[] field1913 = new int[12];

    @ObfuscatedName("dm.ai")
    public static int[] field1914 = new int[10];

    @ObfuscatedName("dm.ak")
    public static int[] field1873 = new int[10];

    @ObfuscatedName("dm.ax")
    public static int[] field1893 = new int[10];

    @ObfuscatedName("dm.br")
    public static boolean field1915 = false;

    @ObfuscatedName("dm.ba")
    public static int field1921 = 0;

    @ObfuscatedName("dm.bn")
    public static int field1922 = 0;

    @ObfuscatedName("dm.bo")
    public static int field1923 = 0;

    @ObfuscatedName("dm.bq")
    public static int[] field1869 = new int[1000];

    @ObfuscatedName("dm.bd")
    public static int[] field1865 = class103.field1790;

    @ObfuscatedName("dm.bl")
    public static int[] field1890 = class103.field1787;

    @ObfuscatedName("dm.bu")
    public static int[] field1927 = class103.field1786;

    @ObfuscatedName("dm.bg")
    public static int[] field1928 = class103.field1777;

    public class111() {
    }

    public class111(class111[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1904 = 0;
        this.field1892 = 0;
        this.field1885 = 0;
        this.field1884 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class111 var8 = arg0[var7];
            if (var8 != null) {
                this.field1904 += var8.field1904;
                this.field1892 += var8.field1892;
                this.field1885 += var8.field1885;
                if (var8.field1880 == null) {
                    if (this.field1884 == -1) {
                        this.field1884 = var8.field1884;
                    }
                    if (this.field1884 != var8.field1884) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1881 != null;
                var5 |= var8.field1883 != null;
                var6 |= var8.field1882 != null;
            }
        }
        this.field1909 = new int[this.field1904];
        this.field1871 = new int[this.field1904];
        this.field1872 = new int[this.field1904];
        this.field1874 = new int[this.field1892];
        this.field1875 = new int[this.field1892];
        this.field1916 = new int[this.field1892];
        this.field1877 = new int[this.field1892];
        this.field1878 = new int[this.field1892];
        this.field1900 = new int[this.field1892];
        if (var3) {
            this.field1880 = new byte[this.field1892];
        }
        if (var4) {
            this.field1881 = new byte[this.field1892];
        }
        if (var5) {
            this.field1883 = new short[this.field1892];
        }
        if (var6) {
            this.field1882 = new byte[this.field1892];
        }
        if (this.field1885 > 0) {
            this.field1886 = new int[this.field1885];
            this.field1920 = new int[this.field1885];
            this.field1870 = new int[this.field1885];
        }
        this.field1904 = 0;
        this.field1892 = 0;
        this.field1885 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class111 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1892; var11++) {
                    this.field1874[this.field1892] = var10.field1874[var11] + this.field1904;
                    this.field1875[this.field1892] = var10.field1875[var11] + this.field1904;
                    this.field1916[this.field1892] = var10.field1916[var11] + this.field1904;
                    this.field1877[this.field1892] = var10.field1877[var11];
                    this.field1878[this.field1892] = var10.field1878[var11];
                    this.field1900[this.field1892] = var10.field1900[var11];
                    if (var3) {
                        if (var10.field1880 == null) {
                            this.field1880[this.field1892] = var10.field1884;
                        } else {
                            this.field1880[this.field1892] = var10.field1880[var11];
                        }
                    }
                    if (var4 && var10.field1881 != null) {
                        this.field1881[this.field1892] = var10.field1881[var11];
                    }
                    if (var5) {
                        if (var10.field1883 == null) {
                            this.field1883[this.field1892] = -1;
                        } else {
                            this.field1883[this.field1892] = var10.field1883[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1882 == null || var10.field1882[var11] == -1) {
                            this.field1882[this.field1892] = -1;
                        } else {
                            this.field1882[this.field1892] = (byte) (var10.field1882[var11] + this.field1885);
                        }
                    }
                    this.field1892++;
                }
                for (int var12 = 0; var12 < var10.field1885; var12++) {
                    this.field1886[this.field1885] = var10.field1886[var12] + this.field1904;
                    this.field1920[this.field1885] = var10.field1920[var12] + this.field1904;
                    this.field1870[this.field1885] = var10.field1870[var12] + this.field1904;
                    this.field1885++;
                }
                for (int var13 = 0; var13 < var10.field1904; var13++) {
                    this.field1909[this.field1904] = var10.field1909[var13];
                    this.field1871[this.field1904] = var10.field1871[var13];
                    this.field1872[this.field1904] = var10.field1872[var13];
                    this.field1904++;
                }
            }
        }
    }

    @ObfuscatedName("dm.p([[IIIIZI)Ldm;")
    public class111 method2180(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2184();
        int var7 = arg1 - this.field1894;
        int var8 = this.field1894 + arg1;
        int var9 = arg3 - this.field1894;
        int var10 = this.field1894 + arg3;
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
        class111 var15;
        if (arg4) {
            var15 = new class111();
            var15.field1904 = this.field1904;
            var15.field1892 = this.field1892;
            var15.field1885 = this.field1885;
            var15.field1909 = this.field1909;
            var15.field1872 = this.field1872;
            var15.field1874 = this.field1874;
            var15.field1875 = this.field1875;
            var15.field1916 = this.field1916;
            var15.field1877 = this.field1877;
            var15.field1878 = this.field1878;
            var15.field1900 = this.field1900;
            var15.field1880 = this.field1880;
            var15.field1881 = this.field1881;
            var15.field1882 = this.field1882;
            var15.field1883 = this.field1883;
            var15.field1884 = this.field1884;
            var15.field1886 = this.field1886;
            var15.field1920 = this.field1920;
            var15.field1870 = this.field1870;
            var15.field1889 = this.field1889;
            var15.field1930 = this.field1930;
            var15.field1891 = this.field1891;
            var15.field1871 = new int[var15.field1904];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1904; var16++) {
                int var17 = this.field1909[var16] + arg1;
                int var18 = this.field1872[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1871[var16] = this.field1871[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1904; var26++) {
                int var27 = (-this.field1871[var26] << 16) / this.field1558;
                if (var27 < arg5) {
                    int var28 = this.field1909[var26] + arg1;
                    int var29 = this.field1872[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1871[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1871[var26];
                }
            }
        }
        var15.field1895 = 0;
        return var15;
    }

    @ObfuscatedName("dm.w(Z)Ldm;")
    public class111 method2181(boolean arg0) {
        if (!arg0 && field1866.length < this.field1892) {
            field1866 = new byte[this.field1892 + 100];
        }
        return this.method2223(arg0, field1918, field1866);
    }

    @ObfuscatedName("dm.h(Z)Ldm;")
    public class111 method2182(boolean arg0) {
        if (!arg0 && field1868.length < this.field1892) {
            field1868 = new byte[this.field1892 + 100];
        }
        return this.method2223(arg0, field1867, field1868);
    }

    @ObfuscatedName("dm.o(ZLdm;[B)Ldm;")
    public class111 method2223(boolean arg0, class111 arg1, byte[] arg2) {
        arg1.field1904 = this.field1904;
        arg1.field1892 = this.field1892;
        arg1.field1885 = this.field1885;
        if (arg1.field1909 == null || arg1.field1909.length < this.field1904) {
            arg1.field1909 = new int[this.field1904 + 100];
            arg1.field1871 = new int[this.field1904 + 100];
            arg1.field1872 = new int[this.field1904 + 100];
        }
        for (int var4 = 0; var4 < this.field1904; var4++) {
            arg1.field1909[var4] = this.field1909[var4];
            arg1.field1871[var4] = this.field1871[var4];
            arg1.field1872[var4] = this.field1872[var4];
        }
        if (arg0) {
            arg1.field1881 = this.field1881;
        } else {
            arg1.field1881 = arg2;
            if (this.field1881 == null) {
                for (int var5 = 0; var5 < this.field1892; var5++) {
                    arg1.field1881[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1892; var6++) {
                    arg1.field1881[var6] = this.field1881[var6];
                }
            }
        }
        arg1.field1874 = this.field1874;
        arg1.field1875 = this.field1875;
        arg1.field1916 = this.field1916;
        arg1.field1877 = this.field1877;
        arg1.field1878 = this.field1878;
        arg1.field1900 = this.field1900;
        arg1.field1880 = this.field1880;
        arg1.field1882 = this.field1882;
        arg1.field1883 = this.field1883;
        arg1.field1884 = this.field1884;
        arg1.field1886 = this.field1886;
        arg1.field1920 = this.field1920;
        arg1.field1870 = this.field1870;
        arg1.field1889 = this.field1889;
        arg1.field1930 = this.field1930;
        arg1.field1891 = this.field1891;
        arg1.field1895 = 0;
        return arg1;
    }

    @ObfuscatedName("dm.u()V")
    public void method2184() {
        if (this.field1895 == 1) {
            return;
        }
        this.field1895 = 1;
        this.field1558 = 0;
        this.field1926 = 0;
        this.field1894 = 0;
        for (int var1 = 0; var1 < this.field1904; var1++) {
            int var2 = this.field1909[var1];
            int var3 = this.field1871[var1];
            int var4 = this.field1872[var1];
            if (-var3 > this.field1558) {
                this.field1558 = -var3;
            }
            if (var3 > this.field1926) {
                this.field1926 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1894) {
                this.field1894 = var5;
            }
        }
        this.field1894 = (int) (Math.sqrt((double) this.field1894) + 0.99D);
        this.field1896 = (int) (Math.sqrt((double) (this.field1558 * this.field1558 + this.field1894 * this.field1894)) + 0.99D);
        this.field1902 = this.field1896 + (int) (Math.sqrt((double) (this.field1926 * this.field1926 + this.field1894 * this.field1894)) + 0.99D);
    }

    @ObfuscatedName("dm.z()V")
    public void method2240() {
        if (this.field1895 == 2) {
            return;
        }
        this.field1895 = 2;
        this.field1894 = 0;
        for (int var1 = 0; var1 < this.field1904; var1++) {
            int var2 = this.field1909[var1];
            int var3 = this.field1871[var1];
            int var4 = this.field1872[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1894) {
                this.field1894 = var5;
            }
        }
        this.field1894 = (int) (Math.sqrt((double) this.field1894) + 0.99D);
        this.field1896 = this.field1894;
        this.field1902 = this.field1894 + this.field1894;
    }

    @ObfuscatedName("dm.e()I")
    public int method2185() {
        this.method2184();
        return this.field1894;
    }

    @ObfuscatedName("dm.l(Ldf;I)V")
    public void method2194(class108 arg0, int arg1) {
        if (this.field1889 == null || arg1 == -1) {
            return;
        }
        class96 var3 = arg0.field1825[arg1];
        class104 var4 = var3.field1638;
        Statics.field1917 = 0;
        Statics.field1887 = 0;
        Statics.field1919 = 0;
        for (int var5 = 0; var5 < var3.field1640; var5++) {
            int var6 = var3.field1642[var5];
            this.method2188(var4.field1793[var6], var4.field1795[var6], var3.field1641[var5], var3.field1635[var5], var3.field1643[var5]);
        }
        this.field1895 = 0;
    }

    @ObfuscatedName("dm.m(Ldf;ILdf;I[I)V")
    public void method2187(class108 arg0, int arg1, class108 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2194(arg0, arg1);
            return;
        }
        class96 var6 = arg0.field1825[arg1];
        class96 var7 = arg2.field1825[arg3];
        class104 var8 = var6.field1638;
        Statics.field1917 = 0;
        Statics.field1887 = 0;
        Statics.field1919 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1640; var11++) {
            int var12 = var6.field1642[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1793[var12] == 0) {
                this.method2188(var8.field1793[var12], var8.field1795[var12], var6.field1641[var11], var6.field1635[var11], var6.field1643[var11]);
            }
        }
        Statics.field1917 = 0;
        Statics.field1887 = 0;
        Statics.field1919 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1640; var15++) {
            int var16 = var7.field1642[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1793[var16] == 0) {
                this.method2188(var8.field1793[var16], var8.field1795[var16], var7.field1641[var15], var7.field1635[var15], var7.field1643[var15]);
            }
        }
        this.field1895 = 0;
    }

    @ObfuscatedName("dm.s(I[IIII)V")
    public void method2188(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1917 = 0;
            Statics.field1887 = 0;
            Statics.field1919 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1889.length) {
                    int[] var10 = this.field1889[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1917 += this.field1909[var12];
                        Statics.field1887 += this.field1871[var12];
                        Statics.field1919 += this.field1872[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1917 = Statics.field1917 / var7 + arg2;
                Statics.field1887 = Statics.field1887 / var7 + arg3;
                Statics.field1919 = Statics.field1919 / var7 + arg4;
            } else {
                Statics.field1917 = arg2;
                Statics.field1887 = arg3;
                Statics.field1919 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1889.length) {
                    int[] var15 = this.field1889[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1909[var17] += arg2;
                        this.field1871[var17] += arg3;
                        this.field1872[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1889.length) {
                    int[] var20 = this.field1889[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1909[var22] -= Statics.field1917;
                        this.field1871[var22] -= Statics.field1887;
                        this.field1872[var22] -= Statics.field1919;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1865[var25];
                            int var27 = field1890[var25];
                            int var28 = this.field1909[var22] * var27 + this.field1871[var22] * var26 >> 16;
                            this.field1871[var22] = this.field1871[var22] * var27 - this.field1909[var22] * var26 >> 16;
                            this.field1909[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1865[var23];
                            int var30 = field1890[var23];
                            int var31 = this.field1871[var22] * var30 - this.field1872[var22] * var29 >> 16;
                            this.field1872[var22] = this.field1872[var22] * var30 + this.field1871[var22] * var29 >> 16;
                            this.field1871[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1865[var24];
                            int var33 = field1890[var24];
                            int var34 = this.field1909[var22] * var33 + this.field1872[var22] * var32 >> 16;
                            this.field1872[var22] = this.field1872[var22] * var33 - this.field1909[var22] * var32 >> 16;
                            this.field1909[var22] = var34;
                        }
                        this.field1909[var22] += Statics.field1917;
                        this.field1871[var22] += Statics.field1887;
                        this.field1872[var22] += Statics.field1919;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1889.length) {
                    int[] var37 = this.field1889[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1909[var39] -= Statics.field1917;
                        this.field1871[var39] -= Statics.field1887;
                        this.field1872[var39] -= Statics.field1919;
                        this.field1909[var39] = this.field1909[var39] * arg2 / 128;
                        this.field1871[var39] = this.field1871[var39] * arg3 / 128;
                        this.field1872[var39] = this.field1872[var39] * arg4 / 128;
                        this.field1909[var39] += Statics.field1917;
                        this.field1871[var39] += Statics.field1887;
                        this.field1872[var39] += Statics.field1919;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1930 != null && this.field1881 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1930.length) {
                    int[] var42 = this.field1930[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1881[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1881[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dm.i()V")
    public void method2189() {
        for (int var1 = 0; var1 < this.field1904; var1++) {
            int var2 = this.field1909[var1];
            this.field1909[var1] = this.field1872[var1];
            this.field1872[var1] = -var2;
        }
        this.field1895 = 0;
    }

    @ObfuscatedName("dm.y()V")
    public void method2193() {
        for (int var1 = 0; var1 < this.field1904; var1++) {
            this.field1909[var1] = -this.field1909[var1];
            this.field1872[var1] = -this.field1872[var1];
        }
        this.field1895 = 0;
    }

    @ObfuscatedName("dm.d()V")
    public void method2191() {
        for (int var1 = 0; var1 < this.field1904; var1++) {
            int var2 = this.field1872[var1];
            this.field1872[var1] = this.field1909[var1];
            this.field1909[var1] = -var2;
        }
        this.field1895 = 0;
    }

    @ObfuscatedName("dm.f(I)V")
    public void method2192(int arg0) {
        int var2 = field1865[arg0];
        int var3 = field1890[arg0];
        for (int var4 = 0; var4 < this.field1904; var4++) {
            int var5 = this.field1871[var4] * var3 - this.field1872[var4] * var2 >> 16;
            this.field1872[var4] = this.field1872[var4] * var3 + this.field1871[var4] * var2 >> 16;
            this.field1871[var4] = var5;
        }
        this.field1895 = 0;
    }

    @ObfuscatedName("dm.a(III)V")
    public void method2183(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1904; var4++) {
            this.field1909[var4] += arg0;
            this.field1871[var4] += arg1;
            this.field1872[var4] += arg2;
        }
        this.field1895 = 0;
    }

    @ObfuscatedName("dm.x(III)V")
    public void method2239(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1904; var4++) {
            this.field1909[var4] = this.field1909[var4] * arg0 / 128;
            this.field1871[var4] = this.field1871[var4] * arg1 / 128;
            this.field1872[var4] = this.field1872[var4] * arg2 / 128;
        }
        this.field1895 = 0;
    }

    @ObfuscatedName("dm.r(IIIIIII)V")
    public final void method2210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1931[0] = -1;
        if (this.field1895 != 2 && this.field1895 != 1) {
            this.method2240();
        }
        int var8 = Statics.field1779;
        int var9 = Statics.field1791;
        int var10 = field1865[arg0];
        int var11 = field1890[arg0];
        int var12 = field1865[arg1];
        int var13 = field1890[arg1];
        int var14 = field1865[arg2];
        int var15 = field1890[arg2];
        int var16 = field1865[arg3];
        int var17 = field1890[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1904; var19++) {
            int var20 = this.field1909[var19];
            int var21 = this.field1871[var19];
            int var22 = this.field1872[var19];
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
            field1924[var19] = var30 - var18;
            field1925[var19] = (var26 << 9) / var30 + var8;
            field1901[var19] = (var29 << 9) / var30 + var9;
            if (this.field1885 > 0) {
                field1903[var19] = var26;
                field1876[var19] = var29;
                field1905[var19] = var30;
            }
        }
        try {
            this.method2196(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dm.t(IIIIIIII)V")
    public final void method2195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1931[0] = -1;
        if (this.field1895 != 2 && this.field1895 != 1) {
            this.method2240();
        }
        int var9 = Statics.field1779;
        int var10 = Statics.field1791;
        int var11 = field1865[arg0];
        int var12 = field1890[arg0];
        int var13 = field1865[arg1];
        int var14 = field1890[arg1];
        int var15 = field1865[arg2];
        int var16 = field1890[arg2];
        int var17 = field1865[arg3];
        int var18 = field1890[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1904; var20++) {
            int var21 = this.field1909[var20];
            int var22 = this.field1871[var20];
            int var23 = this.field1872[var20];
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
            field1924[var20] = var31 - var19;
            field1925[var20] = (var27 << 9) / arg7 + var9;
            field1901[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1885 > 0) {
                field1903[var20] = var27;
                field1876[var20] = var30;
                field1905[var20] = var31;
            }
        }
        try {
            this.method2196(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dm.b(IIIIIIIII)V")
    public void method1828(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1931[0] = -1;
        if (this.field1895 != 1) {
            this.method2184();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1894 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1894 << 9;
        if (var15 / var13 >= Statics.field1782) {
            return;
        }
        int var16 = this.field1894 + var14 << 9;
        if (var16 / var13 <= Statics.field1781) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1894 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1783) {
            return;
        }
        int var20 = (this.field1558 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1784) {
            return;
        }
        int var22 = (this.field1558 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1885 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1915) {
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
            int var32 = field1921 - Statics.field1779;
            int var33 = field1922 - Statics.field1791;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1891) {
                    field1869[field1923++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1779;
        int var35 = Statics.field1791;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1865[arg0];
            var37 = field1890[arg0];
        }
        for (int var38 = 0; var38 < this.field1904; var38++) {
            int var39 = this.field1909[var38];
            int var40 = this.field1871[var38];
            int var41 = this.field1872[var38];
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
            field1924[var38] = var50 - var11;
            if (var50 >= 50) {
                field1925[var38] = (var46 << 9) / var50 + var34;
                field1901[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1925[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1903[var38] = var46;
                field1876[var38] = var49;
                field1905[var38] = var50;
            }
        }
        try {
            this.method2196(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dm.ae(ZZI)V")
    public final void method2196(boolean arg0, boolean arg1, int arg2) {
        if (this.field1902 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1902; var4++) {
            field1931[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1892; var5++) {
            if (this.field1900[var5] != -2) {
                int var6 = this.field1874[var5];
                int var7 = this.field1875[var5];
                int var8 = this.field1916[var5];
                int var9 = field1925[var6];
                int var10 = field1925[var7];
                int var11 = field1925[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1903[var6];
                    int var13 = field1903[var7];
                    int var14 = field1903[var8];
                    int var15 = field1876[var6];
                    int var16 = field1876[var7];
                    int var17 = field1876[var8];
                    int var18 = field1905[var6];
                    int var19 = field1905[var7];
                    int var20 = field1905[var8];
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
                        field1907[var5] = true;
                        int var30 = (field1924[var6] + field1924[var7] + field1924[var8]) / 3 + this.field1896;
                        field1908[var30][field1931[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2218(field1921, field1922, field1901[var6], field1901[var7], field1901[var8], var9, var10, var11)) {
                        field1869[field1923++] = arg2;
                        arg1 = false;
                    }
                    if ((field1901[var8] - field1901[var7]) * (var9 - var10) - (field1901[var6] - field1901[var7]) * (var11 - var10) > 0) {
                        field1907[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1771 && var10 <= Statics.field1771 && var11 <= Statics.field1771) {
                            field1898[var5] = false;
                        } else {
                            field1898[var5] = true;
                        }
                        int var31 = (field1924[var6] + field1924[var7] + field1924[var8]) / 3 + this.field1896;
                        field1908[var31][field1931[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1880 == null) {
            for (int var32 = this.field1902 - 1; var32 >= 0; var32--) {
                int var33 = field1931[var32];
                if (var33 > 0) {
                    int[] var34 = field1908[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2197(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1899[var36] = 0;
            field1913[var36] = 0;
        }
        for (int var37 = this.field1902 - 1; var37 >= 0; var37--) {
            int var38 = field1931[var37];
            if (var38 > 0) {
                int[] var39 = field1908[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1880[var41];
                    int var43 = field1899[var42]++;
                    field1910[var42][var43] = var41;
                    if (var42 < 10) {
                        field1913[var42] += var37;
                    } else if (var42 == 10) {
                        field1911[var43] = var37;
                    } else {
                        field1912[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1899[1] > 0 || field1899[2] > 0) {
            var44 = (field1913[1] + field1913[2]) / (field1899[1] + field1899[2]);
        }
        int var45 = 0;
        if (field1899[3] > 0 || field1899[4] > 0) {
            var45 = (field1913[3] + field1913[4]) / (field1899[3] + field1899[4]);
        }
        int var46 = 0;
        if (field1899[6] > 0 || field1899[8] > 0) {
            var46 = (field1913[6] + field1913[8]) / (field1899[6] + field1899[8]);
        }
        int var47 = 0;
        int var48 = field1899[10];
        int[] var49 = field1910[10];
        int[] var50 = field1911;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1899[11];
            var49 = field1910[11];
            var50 = field1912;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2197(var49[var47++]);
                if (var47 == var48 && field1910[11] != var49) {
                    var47 = 0;
                    var48 = field1899[11];
                    var49 = field1910[11];
                    var50 = field1912;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2197(var49[var47++]);
                if (var47 == var48 && field1910[11] != var49) {
                    var47 = 0;
                    var48 = field1899[11];
                    var49 = field1910[11];
                    var50 = field1912;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2197(var49[var47++]);
                if (var47 == var48 && field1910[11] != var49) {
                    var47 = 0;
                    var48 = field1899[11];
                    var49 = field1910[11];
                    var50 = field1912;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1899[var52];
            int[] var54 = field1910[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2197(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2197(var49[var47++]);
            if (var47 == var48 && field1910[11] != var49) {
                var47 = 0;
                var49 = field1910[11];
                var48 = field1899[11];
                var50 = field1912;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dm.at(I)V")
    public final void method2197(int arg0) {
        if (field1907[arg0]) {
            this.method2242(arg0);
            return;
        }
        int var2 = this.field1874[arg0];
        int var3 = this.field1875[arg0];
        int var4 = this.field1916[arg0];
        class103.field1770 = field1898[arg0];
        if (this.field1881 == null) {
            class103.field1767 = 0;
        } else {
            class103.field1767 = this.field1881[arg0] & 0xFF;
        }
        if (this.field1883 != null && this.field1883[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1882 == null || this.field1882[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1882[arg0] & 0xFF;
                var6 = this.field1886[var5];
                var7 = this.field1920[var5];
                var8 = this.field1870[var5];
            }
            if (this.field1900[arg0] == -1) {
                class103.method2096(field1901[var2], field1901[var3], field1901[var4], field1925[var2], field1925[var3], field1925[var4], this.field1877[arg0], this.field1877[arg0], this.field1877[arg0], field1903[var6], field1903[var7], field1903[var8], field1876[var6], field1876[var7], field1876[var8], field1905[var6], field1905[var7], field1905[var8], this.field1883[arg0]);
            } else {
                class103.method2096(field1901[var2], field1901[var3], field1901[var4], field1925[var2], field1925[var3], field1925[var4], this.field1877[arg0], this.field1878[arg0], this.field1900[arg0], field1903[var6], field1903[var7], field1903[var8], field1876[var6], field1876[var7], field1876[var8], field1905[var6], field1905[var7], field1905[var8], this.field1883[arg0]);
            }
        } else if (this.field1900[arg0] == -1) {
            class103.method2108(field1901[var2], field1901[var3], field1901[var4], field1925[var2], field1925[var3], field1925[var4], field1927[this.field1877[arg0]]);
        } else {
            class103.method2092(field1901[var2], field1901[var3], field1901[var4], field1925[var2], field1925[var3], field1925[var4], this.field1877[arg0], this.field1878[arg0], this.field1900[arg0]);
        }
    }

    @ObfuscatedName("dm.aj(I)V")
    public final void method2242(int arg0) {
        int var2 = Statics.field1779;
        int var3 = Statics.field1791;
        int var4 = 0;
        int var5 = this.field1874[arg0];
        int var6 = this.field1875[arg0];
        int var7 = this.field1916[arg0];
        int var8 = field1905[var5];
        int var9 = field1905[var6];
        int var10 = field1905[var7];
        if (this.field1881 == null) {
            class103.field1767 = 0;
        } else {
            class103.field1767 = this.field1881[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1914[var4] = field1925[var5];
            field1873[var4] = field1901[var5];
            field1893[var4++] = this.field1877[arg0];
        } else {
            int var11 = field1903[var5];
            int var12 = field1876[var5];
            int var13 = this.field1877[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1928[var10 - var8];
                field1914[var4] = (((field1903[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1873[var4] = (((field1876[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1893[var4++] = ((this.field1900[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1928[var9 - var8];
                field1914[var4] = (((field1903[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1873[var4] = (((field1876[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1893[var4++] = ((this.field1878[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1914[var4] = field1925[var6];
            field1873[var4] = field1901[var6];
            field1893[var4++] = this.field1878[arg0];
        } else {
            int var16 = field1903[var6];
            int var17 = field1876[var6];
            int var18 = this.field1878[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1928[var8 - var9];
                field1914[var4] = (((field1903[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1873[var4] = (((field1876[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1893[var4++] = ((this.field1877[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1928[var10 - var9];
                field1914[var4] = (((field1903[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1873[var4] = (((field1876[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1893[var4++] = ((this.field1900[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1914[var4] = field1925[var7];
            field1873[var4] = field1901[var7];
            field1893[var4++] = this.field1900[arg0];
        } else {
            int var21 = field1903[var7];
            int var22 = field1876[var7];
            int var23 = this.field1900[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1928[var9 - var10];
                field1914[var4] = (((field1903[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1873[var4] = (((field1876[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1893[var4++] = ((this.field1878[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1928[var8 - var10];
                field1914[var4] = (((field1903[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1873[var4] = (((field1876[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1893[var4++] = ((this.field1877[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1914[0];
        int var27 = field1914[1];
        int var28 = field1914[2];
        int var29 = field1873[0];
        int var30 = field1873[1];
        int var31 = field1873[2];
        class103.field1770 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1771 || var27 > Statics.field1771 || var28 > Statics.field1771) {
                class103.field1770 = true;
            }
            if (this.field1883 != null && this.field1883[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1882 == null || this.field1882[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1882[arg0] & 0xFF;
                    var33 = this.field1886[var32];
                    var34 = this.field1920[var32];
                    var35 = this.field1870[var32];
                }
                if (this.field1900[arg0] == -1) {
                    class103.method2096(var29, var30, var31, var26, var27, var28, this.field1877[arg0], this.field1877[arg0], this.field1877[arg0], field1903[var33], field1903[var34], field1903[var35], field1876[var33], field1876[var34], field1876[var35], field1905[var33], field1905[var34], field1905[var35], this.field1883[arg0]);
                } else {
                    class103.method2096(var29, var30, var31, var26, var27, var28, field1893[0], field1893[1], field1893[2], field1903[var33], field1903[var34], field1903[var35], field1876[var33], field1876[var34], field1876[var35], field1905[var33], field1905[var34], field1905[var35], this.field1883[arg0]);
                }
            } else if (this.field1900[arg0] == -1) {
                class103.method2108(var29, var30, var31, var26, var27, var28, field1927[this.field1877[arg0]]);
            } else {
                class103.method2092(var29, var30, var31, var26, var27, var28, field1893[0], field1893[1], field1893[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1771 || var27 > Statics.field1771 || var28 > Statics.field1771 || field1914[3] < 0 || field1914[3] > Statics.field1771) {
            class103.field1770 = true;
        }
        if (this.field1883 != null && this.field1883[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1882 == null || this.field1882[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1882[arg0] & 0xFF;
                var37 = this.field1886[var36];
                var38 = this.field1920[var36];
                var39 = this.field1870[var36];
            }
            short var40 = this.field1883[arg0];
            if (this.field1900[arg0] == -1) {
                class103.method2096(var29, var30, var31, var26, var27, var28, this.field1877[arg0], this.field1877[arg0], this.field1877[arg0], field1903[var37], field1903[var38], field1903[var39], field1876[var37], field1876[var38], field1876[var39], field1905[var37], field1905[var38], field1905[var39], var40);
                class103.method2096(var29, var31, field1873[3], var26, var28, field1914[3], this.field1877[arg0], this.field1877[arg0], this.field1877[arg0], field1903[var37], field1903[var38], field1903[var39], field1876[var37], field1876[var38], field1876[var39], field1905[var37], field1905[var38], field1905[var39], var40);
            } else {
                class103.method2096(var29, var30, var31, var26, var27, var28, field1893[0], field1893[1], field1893[2], field1903[var37], field1903[var38], field1903[var39], field1876[var37], field1876[var38], field1876[var39], field1905[var37], field1905[var38], field1905[var39], var40);
                class103.method2096(var29, var31, field1873[3], var26, var28, field1914[3], field1893[0], field1893[2], field1893[3], field1903[var37], field1903[var38], field1903[var39], field1876[var37], field1876[var38], field1876[var39], field1905[var37], field1905[var38], field1905[var39], var40);
            }
        } else if (this.field1900[arg0] == -1) {
            int var41 = field1927[this.field1877[arg0]];
            class103.method2108(var29, var30, var31, var26, var27, var28, var41);
            class103.method2108(var29, var31, field1873[3], var26, var28, field1914[3], var41);
        } else {
            class103.method2092(var29, var30, var31, var26, var27, var28, field1893[0], field1893[1], field1893[2]);
            class103.method2092(var29, var31, field1873[3], var26, var28, field1914[3], field1893[0], field1893[2], field1893[3]);
        }
    }

    @ObfuscatedName("dm.aq(IIIIIIII)Z")
    public final boolean method2218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
