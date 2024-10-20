package deob;

@ObfuscatedName("dl")
public class class112 extends class94 {

    @ObfuscatedName("dl.i")
    public static class112 field1870 = new class112();

    @ObfuscatedName("dl.v")
    public static byte[] field1864 = new byte[1];

    @ObfuscatedName("dl.m")
    public static class112 field1865 = new class112();

    @ObfuscatedName("dl.j")
    public static byte[] field1881 = new byte[1];

    @ObfuscatedName("dl.o")
    public int field1867 = 0;

    @ObfuscatedName("dl.l")
    public int[] field1868;

    @ObfuscatedName("dl.g")
    public int[] field1869;

    @ObfuscatedName("dl.w")
    public int[] field1916;

    @ObfuscatedName("dl.c")
    public int field1871 = 0;

    @ObfuscatedName("dl.z")
    public int[] field1872;

    @ObfuscatedName("dl.f")
    public int[] field1873;

    @ObfuscatedName("dl.a")
    public int[] field1874;

    @ObfuscatedName("dl.d")
    public int[] field1875;

    @ObfuscatedName("dl.e")
    public int[] field1891;

    @ObfuscatedName("dl.y")
    public int[] field1877;

    @ObfuscatedName("dl.k")
    public byte[] field1887;

    @ObfuscatedName("dl.h")
    public byte[] field1863;

    @ObfuscatedName("dl.x")
    public byte[] field1880;

    @ObfuscatedName("dl.b")
    public short[] field1927;

    @ObfuscatedName("dl.n")
    public byte field1882 = 0;

    @ObfuscatedName("dl.q")
    public int field1883 = 0;

    @ObfuscatedName("dl.r")
    public int[] field1910;

    @ObfuscatedName("dl.u")
    public int[] field1907;

    @ObfuscatedName("dl.p")
    public int[] field1886;

    @ObfuscatedName("dl.t")
    public int[][] field1878;

    @ObfuscatedName("dl.s")
    public int[][] field1899;

    @ObfuscatedName("dl.ah")
    public boolean field1889 = false;

    @ObfuscatedName("dl.ar")
    public int field1890;

    @ObfuscatedName("dl.ac")
    public int field1901;

    @ObfuscatedName("dl.as")
    public int field1896;

    @ObfuscatedName("dl.ag")
    public int field1893;

    @ObfuscatedName("dl.ak")
    public int field1894;

    @ObfuscatedName("dl.ap")
    public static boolean[] field1884 = new boolean[4096];

    @ObfuscatedName("dl.au")
    public static boolean[] field1902 = new boolean[4096];

    @ObfuscatedName("dl.aq")
    public static int[] field1898 = new int[4096];

    @ObfuscatedName("dl.at")
    public static int[] field1876 = new int[4096];

    @ObfuscatedName("dl.aw")
    public static int[] field1900 = new int[4096];

    @ObfuscatedName("dl.ai")
    public static int[] field1911 = new int[4096];

    @ObfuscatedName("dl.ae")
    public static int[] field1903 = new int[4096];

    @ObfuscatedName("dl.ab")
    public static int[] field1897 = new int[4096];

    @ObfuscatedName("dl.ax")
    public static int[] field1905 = new int[1600];

    @ObfuscatedName("dl.ao")
    public static int[][] field1908 = new int[1600][512];

    @ObfuscatedName("dl.al")
    public static int[] field1866 = new int[12];

    @ObfuscatedName("dl.az")
    public static int[][] field1885 = new int[12][2000];

    @ObfuscatedName("dl.aj")
    public static int[] field1909 = new int[2000];

    @ObfuscatedName("dl.an")
    public static int[] field1879 = new int[2000];

    @ObfuscatedName("dl.ad")
    public static int[] field1920 = new int[12];

    @ObfuscatedName("dl.af")
    public static int[] field1912 = new int[10];

    @ObfuscatedName("dl.av")
    public static int[] field1913 = new int[10];

    @ObfuscatedName("dl.aa")
    public static int[] field1914 = new int[10];

    @ObfuscatedName("dl.bw")
    public static boolean field1918 = false;

    @ObfuscatedName("dl.bj")
    public static int field1888 = 0;

    @ObfuscatedName("dl.bs")
    public static int field1892 = 0;

    @ObfuscatedName("dl.bi")
    public static int field1921 = 0;

    @ObfuscatedName("dl.bb")
    public static int[] field1922 = new int[1000];

    @ObfuscatedName("dl.bk")
    public static int[] field1923 = class104.field1769;

    @ObfuscatedName("dl.bm")
    public static int[] field1924 = class104.field1787;

    @ObfuscatedName("dl.bd")
    public static int[] field1925 = class104.field1783;

    @ObfuscatedName("dl.bx")
    public static int[] field1906 = class104.field1786;

    public class112() {
    }

    public class112(class112[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1867 = 0;
        this.field1871 = 0;
        this.field1883 = 0;
        this.field1882 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class112 var8 = arg0[var7];
            if (var8 != null) {
                this.field1867 += var8.field1867;
                this.field1871 += var8.field1871;
                this.field1883 += var8.field1883;
                if (var8.field1887 == null) {
                    if (this.field1882 == -1) {
                        this.field1882 = var8.field1882;
                    }
                    if (this.field1882 != var8.field1882) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1863 != null;
                var5 |= var8.field1927 != null;
                var6 |= var8.field1880 != null;
            }
        }
        this.field1868 = new int[this.field1867];
        this.field1869 = new int[this.field1867];
        this.field1916 = new int[this.field1867];
        this.field1872 = new int[this.field1871];
        this.field1873 = new int[this.field1871];
        this.field1874 = new int[this.field1871];
        this.field1875 = new int[this.field1871];
        this.field1891 = new int[this.field1871];
        this.field1877 = new int[this.field1871];
        if (var3) {
            this.field1887 = new byte[this.field1871];
        }
        if (var4) {
            this.field1863 = new byte[this.field1871];
        }
        if (var5) {
            this.field1927 = new short[this.field1871];
        }
        if (var6) {
            this.field1880 = new byte[this.field1871];
        }
        if (this.field1883 > 0) {
            this.field1910 = new int[this.field1883];
            this.field1907 = new int[this.field1883];
            this.field1886 = new int[this.field1883];
        }
        this.field1867 = 0;
        this.field1871 = 0;
        this.field1883 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class112 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1871; var11++) {
                    this.field1872[this.field1871] = var10.field1872[var11] + this.field1867;
                    this.field1873[this.field1871] = var10.field1873[var11] + this.field1867;
                    this.field1874[this.field1871] = var10.field1874[var11] + this.field1867;
                    this.field1875[this.field1871] = var10.field1875[var11];
                    this.field1891[this.field1871] = var10.field1891[var11];
                    this.field1877[this.field1871] = var10.field1877[var11];
                    if (var3) {
                        if (var10.field1887 == null) {
                            this.field1887[this.field1871] = var10.field1882;
                        } else {
                            this.field1887[this.field1871] = var10.field1887[var11];
                        }
                    }
                    if (var4 && var10.field1863 != null) {
                        this.field1863[this.field1871] = var10.field1863[var11];
                    }
                    if (var5) {
                        if (var10.field1927 == null) {
                            this.field1927[this.field1871] = -1;
                        } else {
                            this.field1927[this.field1871] = var10.field1927[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1880 == null || var10.field1880[var11] == -1) {
                            this.field1880[this.field1871] = -1;
                        } else {
                            this.field1880[this.field1871] = (byte) (var10.field1880[var11] + this.field1883);
                        }
                    }
                    this.field1871++;
                }
                for (int var12 = 0; var12 < var10.field1883; var12++) {
                    this.field1910[this.field1883] = var10.field1910[var12] + this.field1867;
                    this.field1907[this.field1883] = var10.field1907[var12] + this.field1867;
                    this.field1886[this.field1883] = var10.field1886[var12] + this.field1867;
                    this.field1883++;
                }
                for (int var13 = 0; var13 < var10.field1867; var13++) {
                    this.field1868[this.field1867] = var10.field1868[var13];
                    this.field1869[this.field1867] = var10.field1869[var13];
                    this.field1916[this.field1867] = var10.field1916[var13];
                    this.field1867++;
                }
            }
        }
    }

    @ObfuscatedName("dl.i([[IIIIZI)Ldl;")
    public class112 method2314(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2273();
        int var7 = arg1 - this.field1896;
        int var8 = this.field1896 + arg1;
        int var9 = arg3 - this.field1896;
        int var10 = this.field1896 + arg3;
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
            var15.field1867 = this.field1867;
            var15.field1871 = this.field1871;
            var15.field1883 = this.field1883;
            var15.field1868 = this.field1868;
            var15.field1916 = this.field1916;
            var15.field1872 = this.field1872;
            var15.field1873 = this.field1873;
            var15.field1874 = this.field1874;
            var15.field1875 = this.field1875;
            var15.field1891 = this.field1891;
            var15.field1877 = this.field1877;
            var15.field1887 = this.field1887;
            var15.field1863 = this.field1863;
            var15.field1880 = this.field1880;
            var15.field1927 = this.field1927;
            var15.field1882 = this.field1882;
            var15.field1910 = this.field1910;
            var15.field1907 = this.field1907;
            var15.field1886 = this.field1886;
            var15.field1878 = this.field1878;
            var15.field1899 = this.field1899;
            var15.field1889 = this.field1889;
            var15.field1869 = new int[var15.field1867];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1867; var16++) {
                int var17 = this.field1868[var16] + arg1;
                int var18 = this.field1916[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1869[var16] = this.field1869[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1867; var26++) {
                int var27 = (-this.field1869[var26] << 16) / this.field1556;
                if (var27 < arg5) {
                    int var28 = this.field1868[var26] + arg1;
                    int var29 = this.field1916[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1869[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1869[var26];
                }
            }
        }
        var15.field1890 = 0;
        return var15;
    }

    @ObfuscatedName("dl.m(Z)Ldl;")
    public class112 method2270(boolean arg0) {
        if (!arg0 && field1864.length < this.field1871) {
            field1864 = new byte[this.field1871 + 100];
        }
        return this.method2272(arg0, field1870, field1864);
    }

    @ObfuscatedName("dl.j(Z)Ldl;")
    public class112 method2271(boolean arg0) {
        if (!arg0 && field1881.length < this.field1871) {
            field1881 = new byte[this.field1871 + 100];
        }
        return this.method2272(arg0, field1865, field1881);
    }

    @ObfuscatedName("dl.o(ZLdl;[B)Ldl;")
    public class112 method2272(boolean arg0, class112 arg1, byte[] arg2) {
        arg1.field1867 = this.field1867;
        arg1.field1871 = this.field1871;
        arg1.field1883 = this.field1883;
        if (arg1.field1868 == null || arg1.field1868.length < this.field1867) {
            arg1.field1868 = new int[this.field1867 + 100];
            arg1.field1869 = new int[this.field1867 + 100];
            arg1.field1916 = new int[this.field1867 + 100];
        }
        for (int var4 = 0; var4 < this.field1867; var4++) {
            arg1.field1868[var4] = this.field1868[var4];
            arg1.field1869[var4] = this.field1869[var4];
            arg1.field1916[var4] = this.field1916[var4];
        }
        if (arg0) {
            arg1.field1863 = this.field1863;
        } else {
            arg1.field1863 = arg2;
            if (this.field1863 == null) {
                for (int var5 = 0; var5 < this.field1871; var5++) {
                    arg1.field1863[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1871; var6++) {
                    arg1.field1863[var6] = this.field1863[var6];
                }
            }
        }
        arg1.field1872 = this.field1872;
        arg1.field1873 = this.field1873;
        arg1.field1874 = this.field1874;
        arg1.field1875 = this.field1875;
        arg1.field1891 = this.field1891;
        arg1.field1877 = this.field1877;
        arg1.field1887 = this.field1887;
        arg1.field1880 = this.field1880;
        arg1.field1927 = this.field1927;
        arg1.field1882 = this.field1882;
        arg1.field1910 = this.field1910;
        arg1.field1907 = this.field1907;
        arg1.field1886 = this.field1886;
        arg1.field1878 = this.field1878;
        arg1.field1899 = this.field1899;
        arg1.field1889 = this.field1889;
        arg1.field1890 = 0;
        return arg1;
    }

    @ObfuscatedName("dl.g()V")
    public void method2273() {
        if (this.field1890 == 1) {
            return;
        }
        this.field1890 = 1;
        this.field1556 = 0;
        this.field1901 = 0;
        this.field1896 = 0;
        for (int var1 = 0; var1 < this.field1867; var1++) {
            int var2 = this.field1868[var1];
            int var3 = this.field1869[var1];
            int var4 = this.field1916[var1];
            if (-var3 > this.field1556) {
                this.field1556 = -var3;
            }
            if (var3 > this.field1901) {
                this.field1901 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1896) {
                this.field1896 = var5;
            }
        }
        this.field1896 = (int) (Math.sqrt((double) this.field1896) + 0.99D);
        this.field1894 = (int) (Math.sqrt((double) (this.field1556 * this.field1556 + this.field1896 * this.field1896)) + 0.99D);
        this.field1893 = this.field1894 + (int) (Math.sqrt((double) (this.field1901 * this.field1901 + this.field1896 * this.field1896)) + 0.99D);
    }

    @ObfuscatedName("dl.w()V")
    public void method2274() {
        if (this.field1890 == 2) {
            return;
        }
        this.field1890 = 2;
        this.field1896 = 0;
        for (int var1 = 0; var1 < this.field1867; var1++) {
            int var2 = this.field1868[var1];
            int var3 = this.field1869[var1];
            int var4 = this.field1916[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1896) {
                this.field1896 = var5;
            }
        }
        this.field1896 = (int) (Math.sqrt((double) this.field1896) + 0.99D);
        this.field1894 = this.field1896;
        this.field1893 = this.field1896 + this.field1896;
    }

    @ObfuscatedName("dl.c()I")
    public int method2275() {
        this.method2273();
        return this.field1896;
    }

    @ObfuscatedName("dl.z(Ldk;I)V")
    public void method2276(class109 arg0, int arg1) {
        if (this.field1878 == null || arg1 == -1) {
            return;
        }
        class97 var3 = arg0.field1826[arg1];
        class105 var4 = var3.field1636;
        Statics.field1915 = 0;
        Statics.field1919 = 0;
        Statics.field1917 = 0;
        for (int var5 = 0; var5 < var3.field1637; var5++) {
            int var6 = var3.field1640[var5];
            this.method2278(var4.field1791[var6], var4.field1792[var6], var3.field1632[var5], var3.field1642[var5], var3.field1641[var5]);
        }
        this.field1890 = 0;
    }

    @ObfuscatedName("dl.f(Ldk;ILdk;I[I)V")
    public void method2277(class109 arg0, int arg1, class109 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2276(arg0, arg1);
            return;
        }
        class97 var6 = arg0.field1826[arg1];
        class97 var7 = arg2.field1826[arg3];
        class105 var8 = var6.field1636;
        Statics.field1915 = 0;
        Statics.field1919 = 0;
        Statics.field1917 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1637; var11++) {
            int var12 = var6.field1640[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1791[var12] == 0) {
                this.method2278(var8.field1791[var12], var8.field1792[var12], var6.field1632[var11], var6.field1642[var11], var6.field1641[var11]);
            }
        }
        Statics.field1915 = 0;
        Statics.field1919 = 0;
        Statics.field1917 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1637; var15++) {
            int var16 = var7.field1640[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1791[var16] == 0) {
                this.method2278(var8.field1791[var16], var8.field1792[var16], var7.field1632[var15], var7.field1642[var15], var7.field1641[var15]);
            }
        }
        this.field1890 = 0;
    }

    @ObfuscatedName("dl.a(I[IIII)V")
    public void method2278(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1915 = 0;
            Statics.field1919 = 0;
            Statics.field1917 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1878.length) {
                    int[] var10 = this.field1878[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1915 += this.field1868[var12];
                        Statics.field1919 += this.field1869[var12];
                        Statics.field1917 += this.field1916[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1915 = Statics.field1915 / var7 + arg2;
                Statics.field1919 = Statics.field1919 / var7 + arg3;
                Statics.field1917 = Statics.field1917 / var7 + arg4;
            } else {
                Statics.field1915 = arg2;
                Statics.field1919 = arg3;
                Statics.field1917 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1878.length) {
                    int[] var15 = this.field1878[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1868[var17] += arg2;
                        this.field1869[var17] += arg3;
                        this.field1916[var17] += arg4;
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
                        this.field1868[var22] -= Statics.field1915;
                        this.field1869[var22] -= Statics.field1919;
                        this.field1916[var22] -= Statics.field1917;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1923[var25];
                            int var27 = field1924[var25];
                            int var28 = this.field1869[var22] * var26 + this.field1868[var22] * var27 >> 16;
                            this.field1869[var22] = this.field1869[var22] * var27 - this.field1868[var22] * var26 >> 16;
                            this.field1868[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1923[var23];
                            int var30 = field1924[var23];
                            int var31 = this.field1869[var22] * var30 - this.field1916[var22] * var29 >> 16;
                            this.field1916[var22] = this.field1916[var22] * var30 + this.field1869[var22] * var29 >> 16;
                            this.field1869[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1923[var24];
                            int var33 = field1924[var24];
                            int var34 = this.field1916[var22] * var32 + this.field1868[var22] * var33 >> 16;
                            this.field1916[var22] = this.field1916[var22] * var33 - this.field1868[var22] * var32 >> 16;
                            this.field1868[var22] = var34;
                        }
                        this.field1868[var22] += Statics.field1915;
                        this.field1869[var22] += Statics.field1919;
                        this.field1916[var22] += Statics.field1917;
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
                        this.field1868[var39] -= Statics.field1915;
                        this.field1869[var39] -= Statics.field1919;
                        this.field1916[var39] -= Statics.field1917;
                        this.field1868[var39] = this.field1868[var39] * arg2 / 128;
                        this.field1869[var39] = this.field1869[var39] * arg3 / 128;
                        this.field1916[var39] = this.field1916[var39] * arg4 / 128;
                        this.field1868[var39] += Statics.field1915;
                        this.field1869[var39] += Statics.field1919;
                        this.field1916[var39] += Statics.field1917;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1899 != null && this.field1863 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1899.length) {
                    int[] var42 = this.field1899[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1863[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1863[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dl.d()V")
    public void method2320() {
        for (int var1 = 0; var1 < this.field1867; var1++) {
            int var2 = this.field1868[var1];
            this.field1868[var1] = this.field1916[var1];
            this.field1916[var1] = -var2;
        }
        this.field1890 = 0;
    }

    @ObfuscatedName("dl.e()V")
    public void method2280() {
        for (int var1 = 0; var1 < this.field1867; var1++) {
            this.field1868[var1] = -this.field1868[var1];
            this.field1916[var1] = -this.field1916[var1];
        }
        this.field1890 = 0;
    }

    @ObfuscatedName("dl.y()V")
    public void method2281() {
        for (int var1 = 0; var1 < this.field1867; var1++) {
            int var2 = this.field1916[var1];
            this.field1916[var1] = this.field1868[var1];
            this.field1868[var1] = -var2;
        }
        this.field1890 = 0;
    }

    @ObfuscatedName("dl.k(I)V")
    public void method2282(int arg0) {
        int var2 = field1923[arg0];
        int var3 = field1924[arg0];
        for (int var4 = 0; var4 < this.field1867; var4++) {
            int var5 = this.field1869[var4] * var3 - this.field1916[var4] * var2 >> 16;
            this.field1916[var4] = this.field1916[var4] * var3 + this.field1869[var4] * var2 >> 16;
            this.field1869[var4] = var5;
        }
        this.field1890 = 0;
    }

    @ObfuscatedName("dl.h(III)V")
    public void method2283(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1867; var4++) {
            this.field1868[var4] += arg0;
            this.field1869[var4] += arg1;
            this.field1916[var4] += arg2;
        }
        this.field1890 = 0;
    }

    @ObfuscatedName("dl.x(III)V")
    public void method2288(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1867; var4++) {
            this.field1868[var4] = this.field1868[var4] * arg0 / 128;
            this.field1869[var4] = this.field1869[var4] * arg1 / 128;
            this.field1916[var4] = this.field1916[var4] * arg2 / 128;
        }
        this.field1890 = 0;
    }

    @ObfuscatedName("dl.b(IIIIIII)V")
    public final void method2279(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1905[0] = -1;
        if (this.field1890 != 2 && this.field1890 != 1) {
            this.method2274();
        }
        int var8 = Statics.field1774;
        int var9 = Statics.field1775;
        int var10 = field1923[arg0];
        int var11 = field1924[arg0];
        int var12 = field1923[arg1];
        int var13 = field1924[arg1];
        int var14 = field1923[arg2];
        int var15 = field1924[arg2];
        int var16 = field1923[arg3];
        int var17 = field1924[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1867; var19++) {
            int var20 = this.field1868[var19];
            int var21 = this.field1869[var19];
            int var22 = this.field1916[var19];
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
            field1900[var19] = var30 - var18;
            field1898[var19] = (var26 << 9) / var30 + var8;
            field1876[var19] = (var29 << 9) / var30 + var9;
            if (this.field1883 > 0) {
                field1911[var19] = var26;
                field1903[var19] = var29;
                field1897[var19] = var30;
            }
        }
        try {
            this.method2304(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dl.n(IIIIIIII)V")
    public final void method2291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1905[0] = -1;
        if (this.field1890 != 2 && this.field1890 != 1) {
            this.method2274();
        }
        int var9 = Statics.field1774;
        int var10 = Statics.field1775;
        int var11 = field1923[arg0];
        int var12 = field1924[arg0];
        int var13 = field1923[arg1];
        int var14 = field1924[arg1];
        int var15 = field1923[arg2];
        int var16 = field1924[arg2];
        int var17 = field1923[arg3];
        int var18 = field1924[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1867; var20++) {
            int var21 = this.field1868[var20];
            int var22 = this.field1869[var20];
            int var23 = this.field1916[var20];
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
            field1900[var20] = var31 - var19;
            field1898[var20] = (var27 << 9) / arg7 + var9;
            field1876[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1883 > 0) {
                field1911[var20] = var27;
                field1903[var20] = var30;
                field1897[var20] = var31;
            }
        }
        try {
            this.method2304(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dl.r(IIIIIIIII)V")
    public void method1889(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1905[0] = -1;
        if (this.field1890 != 1) {
            this.method2273();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1896 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1896 << 9;
        if (var15 / var13 >= Statics.field1779) {
            return;
        }
        int var16 = this.field1896 + var14 << 9;
        if (var16 / var13 <= Statics.field1766) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1896 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1773) {
            return;
        }
        int var20 = (this.field1556 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1785) {
            return;
        }
        int var22 = (this.field1556 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1883 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1918) {
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
            int var32 = field1888 - Statics.field1774;
            int var33 = field1892 - Statics.field1775;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1889) {
                    field1922[field1921++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1774;
        int var35 = Statics.field1775;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1923[arg0];
            var37 = field1924[arg0];
        }
        for (int var38 = 0; var38 < this.field1867; var38++) {
            int var39 = this.field1868[var38];
            int var40 = this.field1869[var38];
            int var41 = this.field1916[var38];
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
            field1900[var38] = var50 - var11;
            if (var50 >= 50) {
                field1898[var38] = (var46 << 9) / var50 + var34;
                field1876[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1898[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1911[var38] = var46;
                field1903[var38] = var49;
                field1897[var38] = var50;
            }
        }
        try {
            this.method2304(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dl.q(ZZI)V")
    public final void method2304(boolean arg0, boolean arg1, int arg2) {
        if (this.field1893 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1893; var4++) {
            field1905[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1871; var5++) {
            if (this.field1877[var5] != -2) {
                int var6 = this.field1872[var5];
                int var7 = this.field1873[var5];
                int var8 = this.field1874[var5];
                int var9 = field1898[var6];
                int var10 = field1898[var7];
                int var11 = field1898[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1911[var6];
                    int var13 = field1911[var7];
                    int var14 = field1911[var8];
                    int var15 = field1903[var6];
                    int var16 = field1903[var7];
                    int var17 = field1903[var8];
                    int var18 = field1897[var6];
                    int var19 = field1897[var7];
                    int var20 = field1897[var8];
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
                        int var30 = (field1900[var6] + field1900[var7] + field1900[var8]) / 3 + this.field1894;
                        field1908[var30][field1905[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2290(field1888, field1892, field1876[var6], field1876[var7], field1876[var8], var9, var10, var11)) {
                        field1922[field1921++] = arg2;
                        arg1 = false;
                    }
                    if ((field1876[var8] - field1876[var7]) * (var9 - var10) - (field1876[var6] - field1876[var7]) * (var11 - var10) > 0) {
                        field1902[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1776 && var10 <= Statics.field1776 && var11 <= Statics.field1776) {
                            field1884[var5] = false;
                        } else {
                            field1884[var5] = true;
                        }
                        int var31 = (field1900[var6] + field1900[var7] + field1900[var8]) / 3 + this.field1894;
                        field1908[var31][field1905[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1887 == null) {
            for (int var32 = this.field1893 - 1; var32 >= 0; var32--) {
                int var33 = field1905[var32];
                if (var33 > 0) {
                    int[] var34 = field1908[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2323(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1866[var36] = 0;
            field1920[var36] = 0;
        }
        for (int var37 = this.field1893 - 1; var37 >= 0; var37--) {
            int var38 = field1905[var37];
            if (var38 > 0) {
                int[] var39 = field1908[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1887[var41];
                    int var43 = field1866[var42]++;
                    field1885[var42][var43] = var41;
                    if (var42 < 10) {
                        field1920[var42] += var37;
                    } else if (var42 == 10) {
                        field1909[var43] = var37;
                    } else {
                        field1879[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1866[1] > 0 || field1866[2] > 0) {
            var44 = (field1920[1] + field1920[2]) / (field1866[1] + field1866[2]);
        }
        int var45 = 0;
        if (field1866[3] > 0 || field1866[4] > 0) {
            var45 = (field1920[3] + field1920[4]) / (field1866[3] + field1866[4]);
        }
        int var46 = 0;
        if (field1866[6] > 0 || field1866[8] > 0) {
            var46 = (field1920[6] + field1920[8]) / (field1866[6] + field1866[8]);
        }
        int var47 = 0;
        int var48 = field1866[10];
        int[] var49 = field1885[10];
        int[] var50 = field1909;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1866[11];
            var49 = field1885[11];
            var50 = field1879;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2323(var49[var47++]);
                if (var47 == var48 && field1885[11] != var49) {
                    var47 = 0;
                    var48 = field1866[11];
                    var49 = field1885[11];
                    var50 = field1879;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2323(var49[var47++]);
                if (var47 == var48 && field1885[11] != var49) {
                    var47 = 0;
                    var48 = field1866[11];
                    var49 = field1885[11];
                    var50 = field1879;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2323(var49[var47++]);
                if (var47 == var48 && field1885[11] != var49) {
                    var47 = 0;
                    var48 = field1866[11];
                    var49 = field1885[11];
                    var50 = field1879;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1866[var52];
            int[] var54 = field1885[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2323(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2323(var49[var47++]);
            if (var47 == var48 && field1885[11] != var49) {
                var47 = 0;
                var49 = field1885[11];
                var48 = field1866[11];
                var50 = field1879;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dl.ah(I)V")
    public final void method2323(int arg0) {
        if (field1902[arg0]) {
            this.method2289(arg0);
            return;
        }
        int var2 = this.field1872[arg0];
        int var3 = this.field1873[arg0];
        int var4 = this.field1874[arg0];
        class104.field1778 = field1884[arg0];
        if (this.field1863 == null) {
            class104.field1768 = 0;
        } else {
            class104.field1768 = this.field1863[arg0] & 0xFF;
        }
        if (this.field1927 != null && this.field1927[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1880 == null || this.field1880[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1880[arg0] & 0xFF;
                var6 = this.field1910[var5];
                var7 = this.field1907[var5];
                var8 = this.field1886[var5];
            }
            if (this.field1877[arg0] == -1) {
                class104.method2183(field1876[var2], field1876[var3], field1876[var4], field1898[var2], field1898[var3], field1898[var4], this.field1875[arg0], this.field1875[arg0], this.field1875[arg0], field1911[var6], field1911[var7], field1911[var8], field1903[var6], field1903[var7], field1903[var8], field1897[var6], field1897[var7], field1897[var8], this.field1927[arg0]);
            } else {
                class104.method2183(field1876[var2], field1876[var3], field1876[var4], field1898[var2], field1898[var3], field1898[var4], this.field1875[arg0], this.field1891[arg0], this.field1877[arg0], field1911[var6], field1911[var7], field1911[var8], field1903[var6], field1903[var7], field1903[var8], field1897[var6], field1897[var7], field1897[var8], this.field1927[arg0]);
            }
        } else if (this.field1877[arg0] == -1) {
            class104.method2181(field1876[var2], field1876[var3], field1876[var4], field1898[var2], field1898[var3], field1898[var4], field1925[this.field1875[arg0]]);
        } else {
            class104.method2179(field1876[var2], field1876[var3], field1876[var4], field1898[var2], field1898[var3], field1898[var4], this.field1875[arg0], this.field1891[arg0], this.field1877[arg0]);
        }
    }

    @ObfuscatedName("dl.ar(I)V")
    public final void method2289(int arg0) {
        int var2 = Statics.field1774;
        int var3 = Statics.field1775;
        int var4 = 0;
        int var5 = this.field1872[arg0];
        int var6 = this.field1873[arg0];
        int var7 = this.field1874[arg0];
        int var8 = field1897[var5];
        int var9 = field1897[var6];
        int var10 = field1897[var7];
        if (this.field1863 == null) {
            class104.field1768 = 0;
        } else {
            class104.field1768 = this.field1863[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1912[var4] = field1898[var5];
            field1913[var4] = field1876[var5];
            field1914[var4++] = this.field1875[arg0];
        } else {
            int var11 = field1911[var5];
            int var12 = field1903[var5];
            int var13 = this.field1875[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1906[var10 - var8];
                field1912[var4] = (((field1911[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1913[var4] = (((field1903[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1914[var4++] = ((this.field1877[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1906[var9 - var8];
                field1912[var4] = (((field1911[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1913[var4] = (((field1903[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1914[var4++] = ((this.field1891[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1912[var4] = field1898[var6];
            field1913[var4] = field1876[var6];
            field1914[var4++] = this.field1891[arg0];
        } else {
            int var16 = field1911[var6];
            int var17 = field1903[var6];
            int var18 = this.field1891[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1906[var8 - var9];
                field1912[var4] = (((field1911[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1913[var4] = (((field1903[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1914[var4++] = ((this.field1875[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1906[var10 - var9];
                field1912[var4] = (((field1911[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1913[var4] = (((field1903[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1914[var4++] = ((this.field1877[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1912[var4] = field1898[var7];
            field1913[var4] = field1876[var7];
            field1914[var4++] = this.field1877[arg0];
        } else {
            int var21 = field1911[var7];
            int var22 = field1903[var7];
            int var23 = this.field1877[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1906[var9 - var10];
                field1912[var4] = (((field1911[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1913[var4] = (((field1903[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1914[var4++] = ((this.field1891[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1906[var8 - var10];
                field1912[var4] = (((field1911[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1913[var4] = (((field1903[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1914[var4++] = ((this.field1875[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1912[0];
        int var27 = field1912[1];
        int var28 = field1912[2];
        int var29 = field1913[0];
        int var30 = field1913[1];
        int var31 = field1913[2];
        class104.field1778 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1776 || var27 > Statics.field1776 || var28 > Statics.field1776) {
                class104.field1778 = true;
            }
            if (this.field1927 != null && this.field1927[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1880 == null || this.field1880[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1880[arg0] & 0xFF;
                    var33 = this.field1910[var32];
                    var34 = this.field1907[var32];
                    var35 = this.field1886[var32];
                }
                if (this.field1877[arg0] == -1) {
                    class104.method2183(var29, var30, var31, var26, var27, var28, this.field1875[arg0], this.field1875[arg0], this.field1875[arg0], field1911[var33], field1911[var34], field1911[var35], field1903[var33], field1903[var34], field1903[var35], field1897[var33], field1897[var34], field1897[var35], this.field1927[arg0]);
                } else {
                    class104.method2183(var29, var30, var31, var26, var27, var28, field1914[0], field1914[1], field1914[2], field1911[var33], field1911[var34], field1911[var35], field1903[var33], field1903[var34], field1903[var35], field1897[var33], field1897[var34], field1897[var35], this.field1927[arg0]);
                }
            } else if (this.field1877[arg0] == -1) {
                class104.method2181(var29, var30, var31, var26, var27, var28, field1925[this.field1875[arg0]]);
            } else {
                class104.method2179(var29, var30, var31, var26, var27, var28, field1914[0], field1914[1], field1914[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1776 || var27 > Statics.field1776 || var28 > Statics.field1776 || field1912[3] < 0 || field1912[3] > Statics.field1776) {
            class104.field1778 = true;
        }
        if (this.field1927 != null && this.field1927[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1880 == null || this.field1880[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1880[arg0] & 0xFF;
                var37 = this.field1910[var36];
                var38 = this.field1907[var36];
                var39 = this.field1886[var36];
            }
            short var40 = this.field1927[arg0];
            if (this.field1877[arg0] == -1) {
                class104.method2183(var29, var30, var31, var26, var27, var28, this.field1875[arg0], this.field1875[arg0], this.field1875[arg0], field1911[var37], field1911[var38], field1911[var39], field1903[var37], field1903[var38], field1903[var39], field1897[var37], field1897[var38], field1897[var39], var40);
                class104.method2183(var29, var31, field1913[3], var26, var28, field1912[3], this.field1875[arg0], this.field1875[arg0], this.field1875[arg0], field1911[var37], field1911[var38], field1911[var39], field1903[var37], field1903[var38], field1903[var39], field1897[var37], field1897[var38], field1897[var39], var40);
            } else {
                class104.method2183(var29, var30, var31, var26, var27, var28, field1914[0], field1914[1], field1914[2], field1911[var37], field1911[var38], field1911[var39], field1903[var37], field1903[var38], field1903[var39], field1897[var37], field1897[var38], field1897[var39], var40);
                class104.method2183(var29, var31, field1913[3], var26, var28, field1912[3], field1914[0], field1914[2], field1914[3], field1911[var37], field1911[var38], field1911[var39], field1903[var37], field1903[var38], field1903[var39], field1897[var37], field1897[var38], field1897[var39], var40);
            }
        } else if (this.field1877[arg0] == -1) {
            int var41 = field1925[this.field1875[arg0]];
            class104.method2181(var29, var30, var31, var26, var27, var28, var41);
            class104.method2181(var29, var31, field1913[3], var26, var28, field1912[3], var41);
        } else {
            class104.method2179(var29, var30, var31, var26, var27, var28, field1914[0], field1914[1], field1914[2]);
            class104.method2179(var29, var31, field1913[3], var26, var28, field1912[3], field1914[0], field1914[2], field1914[3]);
        }
    }

    @ObfuscatedName("dl.ac(IIIIIIII)Z")
    public final boolean method2290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
