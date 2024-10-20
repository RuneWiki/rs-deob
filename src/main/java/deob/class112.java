package deob;

@ObfuscatedName("dj")
public class class112 extends class94 {

    @ObfuscatedName("dj.p")
    public static class112 field1887 = new class112();

    @ObfuscatedName("dj.i")
    public static byte[] field1866 = new byte[1];

    @ObfuscatedName("dj.o")
    public static class112 field1862 = new class112();

    @ObfuscatedName("dj.n")
    public static byte[] field1863 = new byte[1];

    @ObfuscatedName("dj.l")
    public int field1864 = 0;

    @ObfuscatedName("dj.v")
    public int[] field1865;

    @ObfuscatedName("dj.g")
    public int[] field1908;

    @ObfuscatedName("dj.x")
    public int[] field1896;

    @ObfuscatedName("dj.c")
    public int field1905 = 0;

    @ObfuscatedName("dj.f")
    public int[] field1869;

    @ObfuscatedName("dj.r")
    public int[] field1918;

    @ObfuscatedName("dj.d")
    public int[] field1919;

    @ObfuscatedName("dj.a")
    public int[] field1872;

    @ObfuscatedName("dj.q")
    public int[] field1873;

    @ObfuscatedName("dj.u")
    public int[] field1874;

    @ObfuscatedName("dj.w")
    public byte[] field1880;

    @ObfuscatedName("dj.s")
    public byte[] field1876;

    @ObfuscatedName("dj.e")
    public byte[] field1915;

    @ObfuscatedName("dj.b")
    public short[] field1878;

    @ObfuscatedName("dj.j")
    public byte field1907 = 0;

    @ObfuscatedName("dj.h")
    public int field1870 = 0;

    @ObfuscatedName("dj.m")
    public int[] field1881;

    @ObfuscatedName("dj.y")
    public int[] field1882;

    @ObfuscatedName("dj.t")
    public int[] field1883;

    @ObfuscatedName("dj.k")
    public int[][] field1904;

    @ObfuscatedName("dj.z")
    public int[][] field1920;

    @ObfuscatedName("dj.at")
    public boolean field1886 = false;

    @ObfuscatedName("dj.ay")
    public int field1875;

    @ObfuscatedName("dj.ae")
    public int field1888;

    @ObfuscatedName("dj.af")
    public int field1889;

    @ObfuscatedName("dj.ao")
    public int field1890;

    @ObfuscatedName("dj.ad")
    public int field1891;

    @ObfuscatedName("dj.ah")
    public static boolean[] field1893 = new boolean[4096];

    @ObfuscatedName("dj.aq")
    public static boolean[] field1894 = new boolean[4096];

    @ObfuscatedName("dj.ar")
    public static int[] field1895 = new int[4096];

    @ObfuscatedName("dj.aa")
    public static int[] field1860 = new int[4096];

    @ObfuscatedName("dj.an")
    public static int[] field1897 = new int[4096];

    @ObfuscatedName("dj.ab")
    public static int[] field1912 = new int[4096];

    @ObfuscatedName("dj.ai")
    public static int[] field1871 = new int[4096];

    @ObfuscatedName("dj.ac")
    public static int[] field1900 = new int[4096];

    @ObfuscatedName("dj.au")
    public static int[] field1902 = new int[1600];

    @ObfuscatedName("dj.am")
    public static int[][] field1903 = new int[1600][512];

    @ObfuscatedName("dj.ag")
    public static int[] field1926 = new int[12];

    @ObfuscatedName("dj.al")
    public static int[][] field1885 = new int[12][2000];

    @ObfuscatedName("dj.av")
    public static int[] field1906 = new int[2000];

    @ObfuscatedName("dj.aw")
    public static int[] field1898 = new int[2000];

    @ObfuscatedName("dj.ax")
    public static int[] field1861 = new int[12];

    @ObfuscatedName("dj.az")
    public static int[] field1909 = new int[10];

    @ObfuscatedName("dj.ap")
    public static int[] field1910 = new int[10];

    @ObfuscatedName("dj.as")
    public static int[] field1911 = new int[10];

    @ObfuscatedName("dj.ba")
    public static boolean field1868 = false;

    @ObfuscatedName("dj.bd")
    public static int field1884 = 0;

    @ObfuscatedName("dj.bb")
    public static int field1917 = 0;

    @ObfuscatedName("dj.bk")
    public static int field1916 = 0;

    @ObfuscatedName("dj.bx")
    public static int[] field1867 = new int[1000];

    @ObfuscatedName("dj.bv")
    public static int[] field1877 = class104.field1790;

    @ObfuscatedName("dj.bq")
    public static int[] field1921 = class104.field1791;

    @ObfuscatedName("dj.bj")
    public static int[] field1922 = class104.field1767;

    @ObfuscatedName("dj.bg")
    public static int[] field1923 = class104.field1789;

    public class112() {
    }

    public class112(class112[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1864 = 0;
        this.field1905 = 0;
        this.field1870 = 0;
        this.field1907 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class112 var8 = arg0[var7];
            if (var8 != null) {
                this.field1864 += var8.field1864;
                this.field1905 += var8.field1905;
                this.field1870 += var8.field1870;
                if (var8.field1880 == null) {
                    if (this.field1907 == -1) {
                        this.field1907 = var8.field1907;
                    }
                    if (this.field1907 != var8.field1907) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1876 != null;
                var5 |= var8.field1878 != null;
                var6 |= var8.field1915 != null;
            }
        }
        this.field1865 = new int[this.field1864];
        this.field1908 = new int[this.field1864];
        this.field1896 = new int[this.field1864];
        this.field1869 = new int[this.field1905];
        this.field1918 = new int[this.field1905];
        this.field1919 = new int[this.field1905];
        this.field1872 = new int[this.field1905];
        this.field1873 = new int[this.field1905];
        this.field1874 = new int[this.field1905];
        if (var3) {
            this.field1880 = new byte[this.field1905];
        }
        if (var4) {
            this.field1876 = new byte[this.field1905];
        }
        if (var5) {
            this.field1878 = new short[this.field1905];
        }
        if (var6) {
            this.field1915 = new byte[this.field1905];
        }
        if (this.field1870 > 0) {
            this.field1881 = new int[this.field1870];
            this.field1882 = new int[this.field1870];
            this.field1883 = new int[this.field1870];
        }
        this.field1864 = 0;
        this.field1905 = 0;
        this.field1870 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class112 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1905; var11++) {
                    this.field1869[this.field1905] = var10.field1869[var11] + this.field1864;
                    this.field1918[this.field1905] = var10.field1918[var11] + this.field1864;
                    this.field1919[this.field1905] = var10.field1919[var11] + this.field1864;
                    this.field1872[this.field1905] = var10.field1872[var11];
                    this.field1873[this.field1905] = var10.field1873[var11];
                    this.field1874[this.field1905] = var10.field1874[var11];
                    if (var3) {
                        if (var10.field1880 == null) {
                            this.field1880[this.field1905] = var10.field1907;
                        } else {
                            this.field1880[this.field1905] = var10.field1880[var11];
                        }
                    }
                    if (var4 && var10.field1876 != null) {
                        this.field1876[this.field1905] = var10.field1876[var11];
                    }
                    if (var5) {
                        if (var10.field1878 == null) {
                            this.field1878[this.field1905] = -1;
                        } else {
                            this.field1878[this.field1905] = var10.field1878[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1915 == null || var10.field1915[var11] == -1) {
                            this.field1915[this.field1905] = -1;
                        } else {
                            this.field1915[this.field1905] = (byte) (var10.field1915[var11] + this.field1870);
                        }
                    }
                    this.field1905++;
                }
                for (int var12 = 0; var12 < var10.field1870; var12++) {
                    this.field1881[this.field1870] = var10.field1881[var12] + this.field1864;
                    this.field1882[this.field1870] = var10.field1882[var12] + this.field1864;
                    this.field1883[this.field1870] = var10.field1883[var12] + this.field1864;
                    this.field1870++;
                }
                for (int var13 = 0; var13 < var10.field1864; var13++) {
                    this.field1865[this.field1864] = var10.field1865[var13];
                    this.field1908[this.field1864] = var10.field1908[var13];
                    this.field1896[this.field1864] = var10.field1896[var13];
                    this.field1864++;
                }
            }
        }
    }

    @ObfuscatedName("dj.p([[IIIIZI)Ldj;")
    public class112 method2330(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2317();
        int var7 = arg1 - this.field1889;
        int var8 = this.field1889 + arg1;
        int var9 = arg3 - this.field1889;
        int var10 = this.field1889 + arg3;
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
            var15.field1864 = this.field1864;
            var15.field1905 = this.field1905;
            var15.field1870 = this.field1870;
            var15.field1865 = this.field1865;
            var15.field1896 = this.field1896;
            var15.field1869 = this.field1869;
            var15.field1918 = this.field1918;
            var15.field1919 = this.field1919;
            var15.field1872 = this.field1872;
            var15.field1873 = this.field1873;
            var15.field1874 = this.field1874;
            var15.field1880 = this.field1880;
            var15.field1876 = this.field1876;
            var15.field1915 = this.field1915;
            var15.field1878 = this.field1878;
            var15.field1907 = this.field1907;
            var15.field1881 = this.field1881;
            var15.field1882 = this.field1882;
            var15.field1883 = this.field1883;
            var15.field1904 = this.field1904;
            var15.field1920 = this.field1920;
            var15.field1886 = this.field1886;
            var15.field1908 = new int[var15.field1864];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1864; var16++) {
                int var17 = this.field1865[var16] + arg1;
                int var18 = this.field1896[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1908[var16] = this.field1908[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1864; var26++) {
                int var27 = (-this.field1908[var26] << 16) / this.field1550;
                if (var27 < arg5) {
                    int var28 = this.field1865[var26] + arg1;
                    int var29 = this.field1896[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1908[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1908[var26];
                }
            }
        }
        var15.field1875 = 0;
        return var15;
    }

    @ObfuscatedName("dj.o(Z)Ldj;")
    public class112 method2268(boolean arg0) {
        if (!arg0 && field1866.length < this.field1905) {
            field1866 = new byte[this.field1905 + 100];
        }
        return this.method2270(arg0, field1887, field1866);
    }

    @ObfuscatedName("dj.n(Z)Ldj;")
    public class112 method2269(boolean arg0) {
        if (!arg0 && field1863.length < this.field1905) {
            field1863 = new byte[this.field1905 + 100];
        }
        return this.method2270(arg0, field1862, field1863);
    }

    @ObfuscatedName("dj.l(ZLdj;[B)Ldj;")
    public class112 method2270(boolean arg0, class112 arg1, byte[] arg2) {
        arg1.field1864 = this.field1864;
        arg1.field1905 = this.field1905;
        arg1.field1870 = this.field1870;
        if (arg1.field1865 == null || arg1.field1865.length < this.field1864) {
            arg1.field1865 = new int[this.field1864 + 100];
            arg1.field1908 = new int[this.field1864 + 100];
            arg1.field1896 = new int[this.field1864 + 100];
        }
        for (int var4 = 0; var4 < this.field1864; var4++) {
            arg1.field1865[var4] = this.field1865[var4];
            arg1.field1908[var4] = this.field1908[var4];
            arg1.field1896[var4] = this.field1896[var4];
        }
        if (arg0) {
            arg1.field1876 = this.field1876;
        } else {
            arg1.field1876 = arg2;
            if (this.field1876 == null) {
                for (int var5 = 0; var5 < this.field1905; var5++) {
                    arg1.field1876[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1905; var6++) {
                    arg1.field1876[var6] = this.field1876[var6];
                }
            }
        }
        arg1.field1869 = this.field1869;
        arg1.field1918 = this.field1918;
        arg1.field1919 = this.field1919;
        arg1.field1872 = this.field1872;
        arg1.field1873 = this.field1873;
        arg1.field1874 = this.field1874;
        arg1.field1880 = this.field1880;
        arg1.field1915 = this.field1915;
        arg1.field1878 = this.field1878;
        arg1.field1907 = this.field1907;
        arg1.field1881 = this.field1881;
        arg1.field1882 = this.field1882;
        arg1.field1883 = this.field1883;
        arg1.field1904 = this.field1904;
        arg1.field1920 = this.field1920;
        arg1.field1886 = this.field1886;
        arg1.field1875 = 0;
        return arg1;
    }

    @ObfuscatedName("dj.v()V")
    public void method2317() {
        if (this.field1875 == 1) {
            return;
        }
        this.field1875 = 1;
        this.field1550 = 0;
        this.field1888 = 0;
        this.field1889 = 0;
        for (int var1 = 0; var1 < this.field1864; var1++) {
            int var2 = this.field1865[var1];
            int var3 = this.field1908[var1];
            int var4 = this.field1896[var1];
            if (-var3 > this.field1550) {
                this.field1550 = -var3;
            }
            if (var3 > this.field1888) {
                this.field1888 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1889) {
                this.field1889 = var5;
            }
        }
        this.field1889 = (int) (Math.sqrt((double) this.field1889) + 0.99D);
        this.field1891 = (int) (Math.sqrt((double) (this.field1550 * this.field1550 + this.field1889 * this.field1889)) + 0.99D);
        this.field1890 = this.field1891 + (int) (Math.sqrt((double) (this.field1889 * this.field1889 + this.field1888 * this.field1888)) + 0.99D);
    }

    @ObfuscatedName("dj.x()V")
    public void method2272() {
        if (this.field1875 == 2) {
            return;
        }
        this.field1875 = 2;
        this.field1889 = 0;
        for (int var1 = 0; var1 < this.field1864; var1++) {
            int var2 = this.field1865[var1];
            int var3 = this.field1908[var1];
            int var4 = this.field1896[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1889) {
                this.field1889 = var5;
            }
        }
        this.field1889 = (int) (Math.sqrt((double) this.field1889) + 0.99D);
        this.field1891 = this.field1889;
        this.field1890 = this.field1889 + this.field1889;
    }

    @ObfuscatedName("dj.c()I")
    public int method2273() {
        this.method2317();
        return this.field1889;
    }

    @ObfuscatedName("dj.f(Ldi;I)V")
    public void method2312(class109 arg0, int arg1) {
        if (this.field1904 == null || arg1 == -1) {
            return;
        }
        class97 var3 = arg0.field1829[arg1];
        class105 var4 = var3.field1639;
        Statics.field1879 = 0;
        Statics.field1913 = 0;
        Statics.field1914 = 0;
        for (int var5 = 0; var5 < var3.field1640; var5++) {
            int var6 = var3.field1641[var5];
            this.method2276(var4.field1792[var6], var4.field1795[var6], var3.field1642[var5], var3.field1643[var5], var3.field1644[var5]);
        }
        this.field1875 = 0;
    }

    @ObfuscatedName("dj.r(Ldi;ILdi;I[I)V")
    public void method2275(class109 arg0, int arg1, class109 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2312(arg0, arg1);
            return;
        }
        class97 var6 = arg0.field1829[arg1];
        class97 var7 = arg2.field1829[arg3];
        class105 var8 = var6.field1639;
        Statics.field1879 = 0;
        Statics.field1913 = 0;
        Statics.field1914 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1640; var11++) {
            int var12 = var6.field1641[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1792[var12] == 0) {
                this.method2276(var8.field1792[var12], var8.field1795[var12], var6.field1642[var11], var6.field1643[var11], var6.field1644[var11]);
            }
        }
        Statics.field1879 = 0;
        Statics.field1913 = 0;
        Statics.field1914 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1640; var15++) {
            int var16 = var7.field1641[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1792[var16] == 0) {
                this.method2276(var8.field1792[var16], var8.field1795[var16], var7.field1642[var15], var7.field1643[var15], var7.field1644[var15]);
            }
        }
        this.field1875 = 0;
    }

    @ObfuscatedName("dj.d(I[IIII)V")
    public void method2276(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1879 = 0;
            Statics.field1913 = 0;
            Statics.field1914 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1904.length) {
                    int[] var10 = this.field1904[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1879 += this.field1865[var12];
                        Statics.field1913 += this.field1908[var12];
                        Statics.field1914 += this.field1896[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1879 = Statics.field1879 / var7 + arg2;
                Statics.field1913 = Statics.field1913 / var7 + arg3;
                Statics.field1914 = Statics.field1914 / var7 + arg4;
            } else {
                Statics.field1879 = arg2;
                Statics.field1913 = arg3;
                Statics.field1914 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1904.length) {
                    int[] var15 = this.field1904[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1865[var17] += arg2;
                        this.field1908[var17] += arg3;
                        this.field1896[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1904.length) {
                    int[] var20 = this.field1904[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1865[var22] -= Statics.field1879;
                        this.field1908[var22] -= Statics.field1913;
                        this.field1896[var22] -= Statics.field1914;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1877[var25];
                            int var27 = field1921[var25];
                            int var28 = this.field1908[var22] * var26 + this.field1865[var22] * var27 >> 16;
                            this.field1908[var22] = this.field1908[var22] * var27 - this.field1865[var22] * var26 >> 16;
                            this.field1865[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1877[var23];
                            int var30 = field1921[var23];
                            int var31 = this.field1908[var22] * var30 - this.field1896[var22] * var29 >> 16;
                            this.field1896[var22] = this.field1908[var22] * var29 + this.field1896[var22] * var30 >> 16;
                            this.field1908[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1877[var24];
                            int var33 = field1921[var24];
                            int var34 = this.field1896[var22] * var32 + this.field1865[var22] * var33 >> 16;
                            this.field1896[var22] = this.field1896[var22] * var33 - this.field1865[var22] * var32 >> 16;
                            this.field1865[var22] = var34;
                        }
                        this.field1865[var22] += Statics.field1879;
                        this.field1908[var22] += Statics.field1913;
                        this.field1896[var22] += Statics.field1914;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1904.length) {
                    int[] var37 = this.field1904[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1865[var39] -= Statics.field1879;
                        this.field1908[var39] -= Statics.field1913;
                        this.field1896[var39] -= Statics.field1914;
                        this.field1865[var39] = this.field1865[var39] * arg2 / 128;
                        this.field1908[var39] = this.field1908[var39] * arg3 / 128;
                        this.field1896[var39] = this.field1896[var39] * arg4 / 128;
                        this.field1865[var39] += Statics.field1879;
                        this.field1908[var39] += Statics.field1913;
                        this.field1896[var39] += Statics.field1914;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1920 != null && this.field1876 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1920.length) {
                    int[] var42 = this.field1920[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1876[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1876[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dj.a()V")
    public void method2286() {
        for (int var1 = 0; var1 < this.field1864; var1++) {
            int var2 = this.field1865[var1];
            this.field1865[var1] = this.field1896[var1];
            this.field1896[var1] = -var2;
        }
        this.field1875 = 0;
    }

    @ObfuscatedName("dj.q()V")
    public void method2278() {
        for (int var1 = 0; var1 < this.field1864; var1++) {
            this.field1865[var1] = -this.field1865[var1];
            this.field1896[var1] = -this.field1896[var1];
        }
        this.field1875 = 0;
    }

    @ObfuscatedName("dj.u()V")
    public void method2279() {
        for (int var1 = 0; var1 < this.field1864; var1++) {
            int var2 = this.field1896[var1];
            this.field1896[var1] = this.field1865[var1];
            this.field1865[var1] = -var2;
        }
        this.field1875 = 0;
    }

    @ObfuscatedName("dj.w(I)V")
    public void method2288(int arg0) {
        int var2 = field1877[arg0];
        int var3 = field1921[arg0];
        for (int var4 = 0; var4 < this.field1864; var4++) {
            int var5 = this.field1908[var4] * var3 - this.field1896[var4] * var2 >> 16;
            this.field1896[var4] = this.field1908[var4] * var2 + this.field1896[var4] * var3 >> 16;
            this.field1908[var4] = var5;
        }
        this.field1875 = 0;
    }

    @ObfuscatedName("dj.s(III)V")
    public void method2281(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1864; var4++) {
            this.field1865[var4] += arg0;
            this.field1908[var4] += arg1;
            this.field1896[var4] += arg2;
        }
        this.field1875 = 0;
    }

    @ObfuscatedName("dj.e(III)V")
    public void method2274(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1864; var4++) {
            this.field1865[var4] = this.field1865[var4] * arg0 / 128;
            this.field1908[var4] = this.field1908[var4] * arg1 / 128;
            this.field1896[var4] = this.field1896[var4] * arg2 / 128;
        }
        this.field1875 = 0;
    }

    @ObfuscatedName("dj.b(IIIIIII)V")
    public final void method2267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1902[0] = -1;
        if (this.field1875 != 2 && this.field1875 != 1) {
            this.method2272();
        }
        int var8 = Statics.field1777;
        int var9 = Statics.field1778;
        int var10 = field1877[arg0];
        int var11 = field1921[arg0];
        int var12 = field1877[arg1];
        int var13 = field1921[arg1];
        int var14 = field1877[arg2];
        int var15 = field1921[arg2];
        int var16 = field1877[arg3];
        int var17 = field1921[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1864; var19++) {
            int var20 = this.field1865[var19];
            int var21 = this.field1908[var19];
            int var22 = this.field1896[var19];
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
            field1897[var19] = var30 - var18;
            field1895[var19] = (var26 << 9) / var30 + var8;
            field1860[var19] = (var29 << 9) / var30 + var9;
            if (this.field1870 > 0) {
                field1912[var19] = var26;
                field1871[var19] = var29;
                field1900[var19] = var30;
            }
        }
        try {
            this.method2285(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dj.j(IIIIIIII)V")
    public final void method2283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1902[0] = -1;
        if (this.field1875 != 2 && this.field1875 != 1) {
            this.method2272();
        }
        int var9 = Statics.field1777;
        int var10 = Statics.field1778;
        int var11 = field1877[arg0];
        int var12 = field1921[arg0];
        int var13 = field1877[arg1];
        int var14 = field1921[arg1];
        int var15 = field1877[arg2];
        int var16 = field1921[arg2];
        int var17 = field1877[arg3];
        int var18 = field1921[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1864; var20++) {
            int var21 = this.field1865[var20];
            int var22 = this.field1908[var20];
            int var23 = this.field1896[var20];
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
            field1897[var20] = var31 - var19;
            field1895[var20] = (var27 << 9) / arg7 + var9;
            field1860[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1870 > 0) {
                field1912[var20] = var27;
                field1871[var20] = var30;
                field1900[var20] = var31;
            }
        }
        try {
            this.method2285(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dj.t(IIIIIIIII)V")
    public void method1917(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1902[0] = -1;
        if (this.field1875 != 1) {
            this.method2317();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1889 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1889 << 9;
        if (var15 / var13 >= Statics.field1782) {
            return;
        }
        int var16 = this.field1889 + var14 << 9;
        if (var16 / var13 <= Statics.field1781) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1889 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1783) {
            return;
        }
        int var20 = (this.field1550 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1784) {
            return;
        }
        int var22 = (this.field1550 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1870 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1868) {
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
            int var32 = field1884 - Statics.field1777;
            int var33 = field1917 - Statics.field1778;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1886) {
                    field1867[field1916++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1777;
        int var35 = Statics.field1778;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1877[arg0];
            var37 = field1921[arg0];
        }
        for (int var38 = 0; var38 < this.field1864; var38++) {
            int var39 = this.field1865[var38];
            int var40 = this.field1908[var38];
            int var41 = this.field1896[var38];
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
            field1897[var38] = var50 - var11;
            if (var50 >= 50) {
                field1895[var38] = (var46 << 9) / var50 + var34;
                field1860[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1895[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1912[var38] = var46;
                field1871[var38] = var49;
                field1900[var38] = var50;
            }
        }
        try {
            this.method2285(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dj.h(ZZI)V")
    public final void method2285(boolean arg0, boolean arg1, int arg2) {
        if (this.field1890 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1890; var4++) {
            field1902[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1905; var5++) {
            if (this.field1874[var5] != -2) {
                int var6 = this.field1869[var5];
                int var7 = this.field1918[var5];
                int var8 = this.field1919[var5];
                int var9 = field1895[var6];
                int var10 = field1895[var7];
                int var11 = field1895[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1912[var6];
                    int var13 = field1912[var7];
                    int var14 = field1912[var8];
                    int var15 = field1871[var6];
                    int var16 = field1871[var7];
                    int var17 = field1871[var8];
                    int var18 = field1900[var6];
                    int var19 = field1900[var7];
                    int var20 = field1900[var8];
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
                        field1894[var5] = true;
                        int var30 = (field1897[var6] + field1897[var7] + field1897[var8]) / 3 + this.field1891;
                        field1903[var30][field1902[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2319(field1884, field1917, field1860[var6], field1860[var7], field1860[var8], var9, var10, var11)) {
                        field1867[field1916++] = arg2;
                        arg1 = false;
                    }
                    if ((field1860[var8] - field1860[var7]) * (var9 - var10) - (field1860[var6] - field1860[var7]) * (var11 - var10) > 0) {
                        field1894[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1779 && var10 <= Statics.field1779 && var11 <= Statics.field1779) {
                            field1893[var5] = false;
                        } else {
                            field1893[var5] = true;
                        }
                        int var31 = (field1897[var6] + field1897[var7] + field1897[var8]) / 3 + this.field1891;
                        field1903[var31][field1902[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1880 == null) {
            for (int var32 = this.field1890 - 1; var32 >= 0; var32--) {
                int var33 = field1902[var32];
                if (var33 > 0) {
                    int[] var34 = field1903[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2277(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1926[var36] = 0;
            field1861[var36] = 0;
        }
        for (int var37 = this.field1890 - 1; var37 >= 0; var37--) {
            int var38 = field1902[var37];
            if (var38 > 0) {
                int[] var39 = field1903[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1880[var41];
                    int var43 = field1926[var42]++;
                    field1885[var42][var43] = var41;
                    if (var42 < 10) {
                        field1861[var42] += var37;
                    } else if (var42 == 10) {
                        field1906[var43] = var37;
                    } else {
                        field1898[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1926[1] > 0 || field1926[2] > 0) {
            var44 = (field1861[1] + field1861[2]) / (field1926[1] + field1926[2]);
        }
        int var45 = 0;
        if (field1926[3] > 0 || field1926[4] > 0) {
            var45 = (field1861[3] + field1861[4]) / (field1926[3] + field1926[4]);
        }
        int var46 = 0;
        if (field1926[6] > 0 || field1926[8] > 0) {
            var46 = (field1861[6] + field1861[8]) / (field1926[6] + field1926[8]);
        }
        int var47 = 0;
        int var48 = field1926[10];
        int[] var49 = field1885[10];
        int[] var50 = field1906;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1926[11];
            var49 = field1885[11];
            var50 = field1898;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2277(var49[var47++]);
                if (var47 == var48 && field1885[11] != var49) {
                    var47 = 0;
                    var48 = field1926[11];
                    var49 = field1885[11];
                    var50 = field1898;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2277(var49[var47++]);
                if (var47 == var48 && field1885[11] != var49) {
                    var47 = 0;
                    var48 = field1926[11];
                    var49 = field1885[11];
                    var50 = field1898;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2277(var49[var47++]);
                if (var47 == var48 && field1885[11] != var49) {
                    var47 = 0;
                    var48 = field1926[11];
                    var49 = field1885[11];
                    var50 = field1898;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1926[var52];
            int[] var54 = field1885[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2277(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2277(var49[var47++]);
            if (var47 == var48 && field1885[11] != var49) {
                var47 = 0;
                var49 = field1885[11];
                var48 = field1926[11];
                var50 = field1898;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dj.m(I)V")
    public final void method2277(int arg0) {
        if (field1894[arg0]) {
            this.method2287(arg0);
            return;
        }
        int var2 = this.field1869[arg0];
        int var3 = this.field1918[arg0];
        int var4 = this.field1919[arg0];
        class104.field1772 = field1893[arg0];
        if (this.field1876 == null) {
            class104.field1770 = 0;
        } else {
            class104.field1770 = this.field1876[arg0] & 0xFF;
        }
        if (this.field1878 != null && this.field1878[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1915 == null || this.field1915[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1915[arg0] & 0xFF;
                var6 = this.field1881[var5];
                var7 = this.field1882[var5];
                var8 = this.field1883[var5];
            }
            if (this.field1874[arg0] == -1) {
                class104.method2205(field1860[var2], field1860[var3], field1860[var4], field1895[var2], field1895[var3], field1895[var4], this.field1872[arg0], this.field1872[arg0], this.field1872[arg0], field1912[var6], field1912[var7], field1912[var8], field1871[var6], field1871[var7], field1871[var8], field1900[var6], field1900[var7], field1900[var8], this.field1878[arg0]);
            } else {
                class104.method2205(field1860[var2], field1860[var3], field1860[var4], field1895[var2], field1895[var3], field1895[var4], this.field1872[arg0], this.field1873[arg0], this.field1874[arg0], field1912[var6], field1912[var7], field1912[var8], field1871[var6], field1871[var7], field1871[var8], field1900[var6], field1900[var7], field1900[var8], this.field1878[arg0]);
            }
        } else if (this.field1874[arg0] == -1) {
            class104.method2192(field1860[var2], field1860[var3], field1860[var4], field1895[var2], field1895[var3], field1895[var4], field1922[this.field1872[arg0]]);
        } else {
            class104.method2173(field1860[var2], field1860[var3], field1860[var4], field1895[var2], field1895[var3], field1895[var4], this.field1872[arg0], this.field1873[arg0], this.field1874[arg0]);
        }
    }

    @ObfuscatedName("dj.y(I)V")
    public final void method2287(int arg0) {
        int var2 = Statics.field1777;
        int var3 = Statics.field1778;
        int var4 = 0;
        int var5 = this.field1869[arg0];
        int var6 = this.field1918[arg0];
        int var7 = this.field1919[arg0];
        int var8 = field1900[var5];
        int var9 = field1900[var6];
        int var10 = field1900[var7];
        if (this.field1876 == null) {
            class104.field1770 = 0;
        } else {
            class104.field1770 = this.field1876[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1909[var4] = field1895[var5];
            field1910[var4] = field1860[var5];
            field1911[var4++] = this.field1872[arg0];
        } else {
            int var11 = field1912[var5];
            int var12 = field1871[var5];
            int var13 = this.field1872[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1923[var10 - var8];
                field1909[var4] = (((field1912[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1910[var4] = (((field1871[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1911[var4++] = ((this.field1874[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1923[var9 - var8];
                field1909[var4] = (((field1912[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1910[var4] = (((field1871[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1911[var4++] = ((this.field1873[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1909[var4] = field1895[var6];
            field1910[var4] = field1860[var6];
            field1911[var4++] = this.field1873[arg0];
        } else {
            int var16 = field1912[var6];
            int var17 = field1871[var6];
            int var18 = this.field1873[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1923[var8 - var9];
                field1909[var4] = (((field1912[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1910[var4] = (((field1871[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1911[var4++] = ((this.field1872[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1923[var10 - var9];
                field1909[var4] = (((field1912[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1910[var4] = (((field1871[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1911[var4++] = ((this.field1874[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1909[var4] = field1895[var7];
            field1910[var4] = field1860[var7];
            field1911[var4++] = this.field1874[arg0];
        } else {
            int var21 = field1912[var7];
            int var22 = field1871[var7];
            int var23 = this.field1874[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1923[var9 - var10];
                field1909[var4] = (((field1912[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1910[var4] = (((field1871[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1911[var4++] = ((this.field1873[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1923[var8 - var10];
                field1909[var4] = (((field1912[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1910[var4] = (((field1871[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1911[var4++] = ((this.field1872[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1909[0];
        int var27 = field1909[1];
        int var28 = field1909[2];
        int var29 = field1910[0];
        int var30 = field1910[1];
        int var31 = field1910[2];
        class104.field1772 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1779 || var27 > Statics.field1779 || var28 > Statics.field1779) {
                class104.field1772 = true;
            }
            if (this.field1878 != null && this.field1878[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1915 == null || this.field1915[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1915[arg0] & 0xFF;
                    var33 = this.field1881[var32];
                    var34 = this.field1882[var32];
                    var35 = this.field1883[var32];
                }
                if (this.field1874[arg0] == -1) {
                    class104.method2205(var29, var30, var31, var26, var27, var28, this.field1872[arg0], this.field1872[arg0], this.field1872[arg0], field1912[var33], field1912[var34], field1912[var35], field1871[var33], field1871[var34], field1871[var35], field1900[var33], field1900[var34], field1900[var35], this.field1878[arg0]);
                } else {
                    class104.method2205(var29, var30, var31, var26, var27, var28, field1911[0], field1911[1], field1911[2], field1912[var33], field1912[var34], field1912[var35], field1871[var33], field1871[var34], field1871[var35], field1900[var33], field1900[var34], field1900[var35], this.field1878[arg0]);
                }
            } else if (this.field1874[arg0] == -1) {
                class104.method2192(var29, var30, var31, var26, var27, var28, field1922[this.field1872[arg0]]);
            } else {
                class104.method2173(var29, var30, var31, var26, var27, var28, field1911[0], field1911[1], field1911[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1779 || var27 > Statics.field1779 || var28 > Statics.field1779 || field1909[3] < 0 || field1909[3] > Statics.field1779) {
            class104.field1772 = true;
        }
        if (this.field1878 != null && this.field1878[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1915 == null || this.field1915[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1915[arg0] & 0xFF;
                var37 = this.field1881[var36];
                var38 = this.field1882[var36];
                var39 = this.field1883[var36];
            }
            short var40 = this.field1878[arg0];
            if (this.field1874[arg0] == -1) {
                class104.method2205(var29, var30, var31, var26, var27, var28, this.field1872[arg0], this.field1872[arg0], this.field1872[arg0], field1912[var37], field1912[var38], field1912[var39], field1871[var37], field1871[var38], field1871[var39], field1900[var37], field1900[var38], field1900[var39], var40);
                class104.method2205(var29, var31, field1910[3], var26, var28, field1909[3], this.field1872[arg0], this.field1872[arg0], this.field1872[arg0], field1912[var37], field1912[var38], field1912[var39], field1871[var37], field1871[var38], field1871[var39], field1900[var37], field1900[var38], field1900[var39], var40);
            } else {
                class104.method2205(var29, var30, var31, var26, var27, var28, field1911[0], field1911[1], field1911[2], field1912[var37], field1912[var38], field1912[var39], field1871[var37], field1871[var38], field1871[var39], field1900[var37], field1900[var38], field1900[var39], var40);
                class104.method2205(var29, var31, field1910[3], var26, var28, field1909[3], field1911[0], field1911[2], field1911[3], field1912[var37], field1912[var38], field1912[var39], field1871[var37], field1871[var38], field1871[var39], field1900[var37], field1900[var38], field1900[var39], var40);
            }
        } else if (this.field1874[arg0] == -1) {
            int var41 = field1922[this.field1872[arg0]];
            class104.method2192(var29, var30, var31, var26, var27, var28, var41);
            class104.method2192(var29, var31, field1910[3], var26, var28, field1909[3], var41);
        } else {
            class104.method2173(var29, var30, var31, var26, var27, var28, field1911[0], field1911[1], field1911[2]);
            class104.method2173(var29, var31, field1910[3], var26, var28, field1909[3], field1911[0], field1911[2], field1911[3]);
        }
    }

    @ObfuscatedName("dj.z(IIIIIIII)Z")
    public final boolean method2319(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
