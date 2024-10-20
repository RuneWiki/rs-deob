package deob;

@ObfuscatedName("dr")
public class class112 extends class94 {

    @ObfuscatedName("dr.b")
    public static class112 field1929 = new class112();

    @ObfuscatedName("dr.c")
    public static byte[] field1925 = new byte[1];

    @ObfuscatedName("dr.j")
    public static class112 field1886 = new class112();

    @ObfuscatedName("dr.i")
    public static byte[] field1912 = new byte[1];

    @ObfuscatedName("dr.k")
    public int field1908 = 0;

    @ObfuscatedName("dr.q")
    public int[] field1874;

    @ObfuscatedName("dr.t")
    public int[] field1875;

    @ObfuscatedName("dr.v")
    public int[] field1919;

    @ObfuscatedName("dr.y")
    public int field1877 = 0;

    @ObfuscatedName("dr.w")
    public int[] field1878;

    @ObfuscatedName("dr.g")
    public int[] field1879;

    @ObfuscatedName("dr.s")
    public int[] field1880;

    @ObfuscatedName("dr.n")
    public int[] field1881;

    @ObfuscatedName("dr.x")
    public int[] field1882;

    @ObfuscatedName("dr.o")
    public int[] field1883;

    @ObfuscatedName("dr.l")
    public byte[] field1890;

    @ObfuscatedName("dr.u")
    public byte[] field1885;

    @ObfuscatedName("dr.z")
    public byte[] field1901;

    @ObfuscatedName("dr.d")
    public short[] field1887;

    @ObfuscatedName("dr.m")
    public byte field1888 = 0;

    @ObfuscatedName("dr.f")
    public int field1872 = 0;

    @ObfuscatedName("dr.a")
    public int[] field1889;

    @ObfuscatedName("dr.h")
    public int[] field1892;

    @ObfuscatedName("dr.p")
    public int[] field1891;

    @ObfuscatedName("dr.e")
    public int[][] field1893;

    @ObfuscatedName("dr.r")
    public int[][] field1884;

    @ObfuscatedName("dr.av")
    public boolean field1895 = false;

    @ObfuscatedName("dr.an")
    public int field1896;

    @ObfuscatedName("dr.ae")
    public int field1897;

    @ObfuscatedName("dr.au")
    public int field1898;

    @ObfuscatedName("dr.ag")
    public int field1870;

    @ObfuscatedName("dr.at")
    public int field1918;

    @ObfuscatedName("dr.aw")
    public static boolean[] field1920 = new boolean[4096];

    @ObfuscatedName("dr.ah")
    public static boolean[] field1900 = new boolean[4096];

    @ObfuscatedName("dr.ai")
    public static int[] field1904 = new int[4096];

    @ObfuscatedName("dr.ap")
    public static int[] field1905 = new int[4096];

    @ObfuscatedName("dr.ad")
    public static int[] field1906 = new int[4096];

    @ObfuscatedName("dr.ay")
    public static int[] field1907 = new int[4096];

    @ObfuscatedName("dr.az")
    public static int[] field1894 = new int[4096];

    @ObfuscatedName("dr.ab")
    public static int[] field1933 = new int[4096];

    @ObfuscatedName("dr.as")
    public static int[] field1911 = new int[1600];

    @ObfuscatedName("dr.aa")
    public static int[][] field1902 = new int[1600][512];

    @ObfuscatedName("dr.af")
    public static int[] field1913 = new int[12];

    @ObfuscatedName("dr.ax")
    public static int[][] field1914 = new int[12][2000];

    @ObfuscatedName("dr.aq")
    public static int[] field1915 = new int[2000];

    @ObfuscatedName("dr.ao")
    public static int[] field1916 = new int[2000];

    @ObfuscatedName("dr.ar")
    public static int[] field1917 = new int[12];

    @ObfuscatedName("dr.aj")
    public static int[] field1935 = new int[10];

    @ObfuscatedName("dr.al")
    public static int[] field1876 = new int[10];

    @ObfuscatedName("dr.ak")
    public static int[] field1873 = new int[10];

    @ObfuscatedName("dr.bq")
    public static boolean field1924 = false;

    @ObfuscatedName("dr.bh")
    public static int field1903 = 0;

    @ObfuscatedName("dr.bo")
    public static int field1926 = 0;

    @ObfuscatedName("dr.bx")
    public static int field1927 = 0;

    @ObfuscatedName("dr.bw")
    public static int[] field1928 = new int[1000];

    @ObfuscatedName("dr.bz")
    public static int[] field1899 = class104.field1800;

    @ObfuscatedName("dr.bb")
    public static int[] field1930 = class104.field1801;

    @ObfuscatedName("dr.bl")
    public static int[] field1931 = class104.field1798;

    @ObfuscatedName("dr.bf")
    public static int[] field1932 = class104.field1792;

    public class112() {
    }

    public class112(class112[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1908 = 0;
        this.field1877 = 0;
        this.field1872 = 0;
        this.field1888 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class112 var8 = arg0[var7];
            if (var8 != null) {
                this.field1908 += var8.field1908;
                this.field1877 += var8.field1877;
                this.field1872 += var8.field1872;
                if (var8.field1890 == null) {
                    if (this.field1888 == -1) {
                        this.field1888 = var8.field1888;
                    }
                    if (this.field1888 != var8.field1888) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1885 != null;
                var5 |= var8.field1887 != null;
                var6 |= var8.field1901 != null;
            }
        }
        this.field1874 = new int[this.field1908];
        this.field1875 = new int[this.field1908];
        this.field1919 = new int[this.field1908];
        this.field1878 = new int[this.field1877];
        this.field1879 = new int[this.field1877];
        this.field1880 = new int[this.field1877];
        this.field1881 = new int[this.field1877];
        this.field1882 = new int[this.field1877];
        this.field1883 = new int[this.field1877];
        if (var3) {
            this.field1890 = new byte[this.field1877];
        }
        if (var4) {
            this.field1885 = new byte[this.field1877];
        }
        if (var5) {
            this.field1887 = new short[this.field1877];
        }
        if (var6) {
            this.field1901 = new byte[this.field1877];
        }
        if (this.field1872 > 0) {
            this.field1889 = new int[this.field1872];
            this.field1892 = new int[this.field1872];
            this.field1891 = new int[this.field1872];
        }
        this.field1908 = 0;
        this.field1877 = 0;
        this.field1872 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class112 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1877; var11++) {
                    this.field1878[this.field1877] = var10.field1878[var11] + this.field1908;
                    this.field1879[this.field1877] = var10.field1879[var11] + this.field1908;
                    this.field1880[this.field1877] = var10.field1880[var11] + this.field1908;
                    this.field1881[this.field1877] = var10.field1881[var11];
                    this.field1882[this.field1877] = var10.field1882[var11];
                    this.field1883[this.field1877] = var10.field1883[var11];
                    if (var3) {
                        if (var10.field1890 == null) {
                            this.field1890[this.field1877] = var10.field1888;
                        } else {
                            this.field1890[this.field1877] = var10.field1890[var11];
                        }
                    }
                    if (var4 && var10.field1885 != null) {
                        this.field1885[this.field1877] = var10.field1885[var11];
                    }
                    if (var5) {
                        if (var10.field1887 == null) {
                            this.field1887[this.field1877] = -1;
                        } else {
                            this.field1887[this.field1877] = var10.field1887[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1901 == null || var10.field1901[var11] == -1) {
                            this.field1901[this.field1877] = -1;
                        } else {
                            this.field1901[this.field1877] = (byte) (var10.field1901[var11] + this.field1872);
                        }
                    }
                    this.field1877++;
                }
                for (int var12 = 0; var12 < var10.field1872; var12++) {
                    this.field1889[this.field1872] = var10.field1889[var12] + this.field1908;
                    this.field1892[this.field1872] = var10.field1892[var12] + this.field1908;
                    this.field1891[this.field1872] = var10.field1891[var12] + this.field1908;
                    this.field1872++;
                }
                for (int var13 = 0; var13 < var10.field1908; var13++) {
                    this.field1874[this.field1908] = var10.field1874[var13];
                    this.field1875[this.field1908] = var10.field1875[var13];
                    this.field1919[this.field1908] = var10.field1919[var13];
                    this.field1908++;
                }
            }
        }
    }

    @ObfuscatedName("dr.b([[IIIIZI)Ldr;")
    public class112 method2207(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2196();
        int var7 = arg1 - this.field1898;
        int var8 = this.field1898 + arg1;
        int var9 = arg3 - this.field1898;
        int var10 = this.field1898 + arg3;
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
            var15.field1908 = this.field1908;
            var15.field1877 = this.field1877;
            var15.field1872 = this.field1872;
            var15.field1874 = this.field1874;
            var15.field1919 = this.field1919;
            var15.field1878 = this.field1878;
            var15.field1879 = this.field1879;
            var15.field1880 = this.field1880;
            var15.field1881 = this.field1881;
            var15.field1882 = this.field1882;
            var15.field1883 = this.field1883;
            var15.field1890 = this.field1890;
            var15.field1885 = this.field1885;
            var15.field1901 = this.field1901;
            var15.field1887 = this.field1887;
            var15.field1888 = this.field1888;
            var15.field1889 = this.field1889;
            var15.field1892 = this.field1892;
            var15.field1891 = this.field1891;
            var15.field1893 = this.field1893;
            var15.field1884 = this.field1884;
            var15.field1895 = this.field1895;
            var15.field1875 = new int[var15.field1908];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1908; var16++) {
                int var17 = this.field1874[var16] + arg1;
                int var18 = this.field1919[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1875[var16] = this.field1875[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1908; var26++) {
                int var27 = (-this.field1875[var26] << 16) / this.field1572;
                if (var27 < arg5) {
                    int var28 = this.field1874[var26] + arg1;
                    int var29 = this.field1919[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1875[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1875[var26];
                }
            }
        }
        var15.field1896 = 0;
        return var15;
    }

    @ObfuscatedName("dr.j(Z)Ldr;")
    public class112 method2242(boolean arg0) {
        if (!arg0 && field1925.length < this.field1877) {
            field1925 = new byte[this.field1877 + 100];
        }
        return this.method2195(arg0, field1929, field1925);
    }

    @ObfuscatedName("dr.i(Z)Ldr;")
    public class112 method2194(boolean arg0) {
        if (!arg0 && field1912.length < this.field1877) {
            field1912 = new byte[this.field1877 + 100];
        }
        return this.method2195(arg0, field1886, field1912);
    }

    @ObfuscatedName("dr.v(ZLdr;[B)Ldr;")
    public class112 method2195(boolean arg0, class112 arg1, byte[] arg2) {
        arg1.field1908 = this.field1908;
        arg1.field1877 = this.field1877;
        arg1.field1872 = this.field1872;
        if (arg1.field1874 == null || arg1.field1874.length < this.field1908) {
            arg1.field1874 = new int[this.field1908 + 100];
            arg1.field1875 = new int[this.field1908 + 100];
            arg1.field1919 = new int[this.field1908 + 100];
        }
        for (int var4 = 0; var4 < this.field1908; var4++) {
            arg1.field1874[var4] = this.field1874[var4];
            arg1.field1875[var4] = this.field1875[var4];
            arg1.field1919[var4] = this.field1919[var4];
        }
        if (arg0) {
            arg1.field1885 = this.field1885;
        } else {
            arg1.field1885 = arg2;
            if (this.field1885 == null) {
                for (int var5 = 0; var5 < this.field1877; var5++) {
                    arg1.field1885[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1877; var6++) {
                    arg1.field1885[var6] = this.field1885[var6];
                }
            }
        }
        arg1.field1878 = this.field1878;
        arg1.field1879 = this.field1879;
        arg1.field1880 = this.field1880;
        arg1.field1881 = this.field1881;
        arg1.field1882 = this.field1882;
        arg1.field1883 = this.field1883;
        arg1.field1890 = this.field1890;
        arg1.field1901 = this.field1901;
        arg1.field1887 = this.field1887;
        arg1.field1888 = this.field1888;
        arg1.field1889 = this.field1889;
        arg1.field1892 = this.field1892;
        arg1.field1891 = this.field1891;
        arg1.field1893 = this.field1893;
        arg1.field1884 = this.field1884;
        arg1.field1895 = this.field1895;
        arg1.field1896 = 0;
        return arg1;
    }

    @ObfuscatedName("dr.y()V")
    public void method2196() {
        if (this.field1896 == 1) {
            return;
        }
        this.field1896 = 1;
        this.field1572 = 0;
        this.field1897 = 0;
        this.field1898 = 0;
        for (int var1 = 0; var1 < this.field1908; var1++) {
            int var2 = this.field1874[var1];
            int var3 = this.field1875[var1];
            int var4 = this.field1919[var1];
            if (-var3 > this.field1572) {
                this.field1572 = -var3;
            }
            if (var3 > this.field1897) {
                this.field1897 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1898) {
                this.field1898 = var5;
            }
        }
        this.field1898 = (int) (Math.sqrt((double) this.field1898) + 0.99D);
        this.field1918 = (int) (Math.sqrt((double) (this.field1572 * this.field1572 + this.field1898 * this.field1898)) + 0.99D);
        this.field1870 = this.field1918 + (int) (Math.sqrt((double) (this.field1898 * this.field1898 + this.field1897 * this.field1897)) + 0.99D);
    }

    @ObfuscatedName("dr.w()V")
    public void method2197() {
        if (this.field1896 == 2) {
            return;
        }
        this.field1896 = 2;
        this.field1898 = 0;
        for (int var1 = 0; var1 < this.field1908; var1++) {
            int var2 = this.field1874[var1];
            int var3 = this.field1875[var1];
            int var4 = this.field1919[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1898) {
                this.field1898 = var5;
            }
        }
        this.field1898 = (int) (Math.sqrt((double) this.field1898) + 0.99D);
        this.field1918 = this.field1898;
        this.field1870 = this.field1898 + this.field1898;
    }

    @ObfuscatedName("dr.g()I")
    public int method2235() {
        this.method2196();
        return this.field1898;
    }

    @ObfuscatedName("dr.s(Ldf;I)V")
    public void method2199(class109 arg0, int arg1) {
        if (this.field1893 == null || arg1 == -1) {
            return;
        }
        class97 var3 = arg0.field1838[arg1];
        class105 var4 = var3.field1658;
        Statics.field1921 = 0;
        Statics.field1922 = 0;
        Statics.field1923 = 0;
        for (int var5 = 0; var5 < var3.field1659; var5++) {
            int var6 = var3.field1654[var5];
            this.method2201(var4.field1804[var6], var4.field1805[var6], var3.field1660[var5], var3.field1662[var5], var3.field1661[var5]);
        }
        this.field1896 = 0;
    }

    @ObfuscatedName("dr.n(Ldf;ILdf;I[I)V")
    public void method2200(class109 arg0, int arg1, class109 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2199(arg0, arg1);
            return;
        }
        class97 var6 = arg0.field1838[arg1];
        class97 var7 = arg2.field1838[arg3];
        class105 var8 = var6.field1658;
        Statics.field1921 = 0;
        Statics.field1922 = 0;
        Statics.field1923 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1659; var11++) {
            int var12 = var6.field1654[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1804[var12] == 0) {
                this.method2201(var8.field1804[var12], var8.field1805[var12], var6.field1660[var11], var6.field1662[var11], var6.field1661[var11]);
            }
        }
        Statics.field1921 = 0;
        Statics.field1922 = 0;
        Statics.field1923 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1659; var15++) {
            int var16 = var7.field1654[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1804[var16] == 0) {
                this.method2201(var8.field1804[var16], var8.field1805[var16], var7.field1660[var15], var7.field1662[var15], var7.field1661[var15]);
            }
        }
        this.field1896 = 0;
    }

    @ObfuscatedName("dr.x(I[IIII)V")
    public void method2201(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1921 = 0;
            Statics.field1922 = 0;
            Statics.field1923 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1893.length) {
                    int[] var10 = this.field1893[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1921 += this.field1874[var12];
                        Statics.field1922 += this.field1875[var12];
                        Statics.field1923 += this.field1919[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1921 = Statics.field1921 / var7 + arg2;
                Statics.field1922 = Statics.field1922 / var7 + arg3;
                Statics.field1923 = Statics.field1923 / var7 + arg4;
            } else {
                Statics.field1921 = arg2;
                Statics.field1922 = arg3;
                Statics.field1923 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1893.length) {
                    int[] var15 = this.field1893[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1874[var17] += arg2;
                        this.field1875[var17] += arg3;
                        this.field1919[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1893.length) {
                    int[] var20 = this.field1893[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1874[var22] -= Statics.field1921;
                        this.field1875[var22] -= Statics.field1922;
                        this.field1919[var22] -= Statics.field1923;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1899[var25];
                            int var27 = field1930[var25];
                            int var28 = this.field1875[var22] * var26 + this.field1874[var22] * var27 >> 16;
                            this.field1875[var22] = this.field1875[var22] * var27 - this.field1874[var22] * var26 >> 16;
                            this.field1874[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1899[var23];
                            int var30 = field1930[var23];
                            int var31 = this.field1875[var22] * var30 - this.field1919[var22] * var29 >> 16;
                            this.field1919[var22] = this.field1919[var22] * var30 + this.field1875[var22] * var29 >> 16;
                            this.field1875[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1899[var24];
                            int var33 = field1930[var24];
                            int var34 = this.field1919[var22] * var32 + this.field1874[var22] * var33 >> 16;
                            this.field1919[var22] = this.field1919[var22] * var33 - this.field1874[var22] * var32 >> 16;
                            this.field1874[var22] = var34;
                        }
                        this.field1874[var22] += Statics.field1921;
                        this.field1875[var22] += Statics.field1922;
                        this.field1919[var22] += Statics.field1923;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1893.length) {
                    int[] var37 = this.field1893[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1874[var39] -= Statics.field1921;
                        this.field1875[var39] -= Statics.field1922;
                        this.field1919[var39] -= Statics.field1923;
                        this.field1874[var39] = this.field1874[var39] * arg2 / 128;
                        this.field1875[var39] = this.field1875[var39] * arg3 / 128;
                        this.field1919[var39] = this.field1919[var39] * arg4 / 128;
                        this.field1874[var39] += Statics.field1921;
                        this.field1875[var39] += Statics.field1922;
                        this.field1919[var39] += Statics.field1923;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1884 != null && this.field1885 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1884.length) {
                    int[] var42 = this.field1884[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1885[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1885[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dr.o()V")
    public void method2202() {
        for (int var1 = 0; var1 < this.field1908; var1++) {
            int var2 = this.field1874[var1];
            this.field1874[var1] = this.field1919[var1];
            this.field1919[var1] = -var2;
        }
        this.field1896 = 0;
    }

    @ObfuscatedName("dr.l()V")
    public void method2203() {
        for (int var1 = 0; var1 < this.field1908; var1++) {
            this.field1874[var1] = -this.field1874[var1];
            this.field1919[var1] = -this.field1919[var1];
        }
        this.field1896 = 0;
    }

    @ObfuscatedName("dr.u()V")
    public void method2204() {
        for (int var1 = 0; var1 < this.field1908; var1++) {
            int var2 = this.field1919[var1];
            this.field1919[var1] = this.field1874[var1];
            this.field1874[var1] = -var2;
        }
        this.field1896 = 0;
    }

    @ObfuscatedName("dr.z(I)V")
    public void method2237(int arg0) {
        int var2 = field1899[arg0];
        int var3 = field1930[arg0];
        for (int var4 = 0; var4 < this.field1908; var4++) {
            int var5 = this.field1875[var4] * var3 - this.field1919[var4] * var2 >> 16;
            this.field1919[var4] = this.field1919[var4] * var3 + this.field1875[var4] * var2 >> 16;
            this.field1875[var4] = var5;
        }
        this.field1896 = 0;
    }

    @ObfuscatedName("dr.d(III)V")
    public void method2205(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1908; var4++) {
            this.field1874[var4] += arg0;
            this.field1875[var4] += arg1;
            this.field1919[var4] += arg2;
        }
        this.field1896 = 0;
    }

    @ObfuscatedName("dr.m(III)V")
    public void method2206(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1908; var4++) {
            this.field1874[var4] = this.field1874[var4] * arg0 / 128;
            this.field1875[var4] = this.field1875[var4] * arg1 / 128;
            this.field1919[var4] = this.field1919[var4] * arg2 / 128;
        }
        this.field1896 = 0;
    }

    @ObfuscatedName("dr.f(IIIIIII)V")
    public final void method2239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1911[0] = -1;
        if (this.field1896 != 2 && this.field1896 != 1) {
            this.method2197();
        }
        int var8 = Statics.field1787;
        int var9 = Statics.field1788;
        int var10 = field1899[arg0];
        int var11 = field1930[arg0];
        int var12 = field1899[arg1];
        int var13 = field1930[arg1];
        int var14 = field1899[arg2];
        int var15 = field1930[arg2];
        int var16 = field1899[arg3];
        int var17 = field1930[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1908; var19++) {
            int var20 = this.field1874[var19];
            int var21 = this.field1875[var19];
            int var22 = this.field1919[var19];
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
            field1906[var19] = var30 - var18;
            field1904[var19] = (var26 << 9) / var30 + var8;
            field1905[var19] = (var29 << 9) / var30 + var9;
            if (this.field1872 > 0) {
                field1907[var19] = var26;
                field1894[var19] = var29;
                field1933[var19] = var30;
            }
        }
        try {
            this.method2217(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dr.r(IIIIIIII)V")
    public final void method2208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1911[0] = -1;
        if (this.field1896 != 2 && this.field1896 != 1) {
            this.method2197();
        }
        int var9 = Statics.field1787;
        int var10 = Statics.field1788;
        int var11 = field1899[arg0];
        int var12 = field1930[arg0];
        int var13 = field1899[arg1];
        int var14 = field1930[arg1];
        int var15 = field1899[arg2];
        int var16 = field1930[arg2];
        int var17 = field1899[arg3];
        int var18 = field1930[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1908; var20++) {
            int var21 = this.field1874[var20];
            int var22 = this.field1875[var20];
            int var23 = this.field1919[var20];
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
            field1906[var20] = var31 - var19;
            field1904[var20] = (var27 << 9) / arg7 + var9;
            field1905[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1872 > 0) {
                field1907[var20] = var27;
                field1894[var20] = var30;
                field1933[var20] = var31;
            }
        }
        try {
            this.method2217(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dr.a(IIIIIIIII)V")
    public void method1809(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1911[0] = -1;
        if (this.field1896 != 1) {
            this.method2196();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1898 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1898 << 9;
        if (var15 / var13 >= Statics.field1791) {
            return;
        }
        int var16 = this.field1898 + var14 << 9;
        if (var16 / var13 <= Statics.field1796) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1898 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1777) {
            return;
        }
        int var20 = (this.field1572 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1793) {
            return;
        }
        int var22 = (this.field1572 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1872 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1924) {
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
            int var32 = field1903 - Statics.field1787;
            int var33 = field1926 - Statics.field1788;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1895) {
                    field1928[field1927++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1787;
        int var35 = Statics.field1788;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1899[arg0];
            var37 = field1930[arg0];
        }
        for (int var38 = 0; var38 < this.field1908; var38++) {
            int var39 = this.field1874[var38];
            int var40 = this.field1875[var38];
            int var41 = this.field1919[var38];
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
            field1906[var38] = var50 - var11;
            if (var50 >= 50) {
                field1904[var38] = (var46 << 9) / var50 + var34;
                field1905[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1904[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1907[var38] = var46;
                field1894[var38] = var49;
                field1933[var38] = var50;
            }
        }
        try {
            this.method2217(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dr.av(ZZI)V")
    public final void method2217(boolean arg0, boolean arg1, int arg2) {
        if (this.field1870 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1870; var4++) {
            field1911[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1877; var5++) {
            if (this.field1883[var5] != -2) {
                int var6 = this.field1878[var5];
                int var7 = this.field1879[var5];
                int var8 = this.field1880[var5];
                int var9 = field1904[var6];
                int var10 = field1904[var7];
                int var11 = field1904[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1907[var6];
                    int var13 = field1907[var7];
                    int var14 = field1907[var8];
                    int var15 = field1894[var6];
                    int var16 = field1894[var7];
                    int var17 = field1894[var8];
                    int var18 = field1933[var6];
                    int var19 = field1933[var7];
                    int var20 = field1933[var8];
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
                        field1900[var5] = true;
                        int var30 = (field1906[var6] + field1906[var7] + field1906[var8]) / 3 + this.field1918;
                        field1902[var30][field1911[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2213(field1903, field1926, field1905[var6], field1905[var7], field1905[var8], var9, var10, var11)) {
                        field1928[field1927++] = arg2;
                        arg1 = false;
                    }
                    if ((field1905[var8] - field1905[var7]) * (var9 - var10) - (field1905[var6] - field1905[var7]) * (var11 - var10) > 0) {
                        field1900[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1789 && var10 <= Statics.field1789 && var11 <= Statics.field1789) {
                            field1920[var5] = false;
                        } else {
                            field1920[var5] = true;
                        }
                        int var31 = (field1906[var6] + field1906[var7] + field1906[var8]) / 3 + this.field1918;
                        field1902[var31][field1911[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1890 == null) {
            for (int var32 = this.field1870 - 1; var32 >= 0; var32--) {
                int var33 = field1911[var32];
                if (var33 > 0) {
                    int[] var34 = field1902[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2211(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1913[var36] = 0;
            field1917[var36] = 0;
        }
        for (int var37 = this.field1870 - 1; var37 >= 0; var37--) {
            int var38 = field1911[var37];
            if (var38 > 0) {
                int[] var39 = field1902[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1890[var41];
                    int var43 = field1913[var42]++;
                    field1914[var42][var43] = var41;
                    if (var42 < 10) {
                        field1917[var42] += var37;
                    } else if (var42 == 10) {
                        field1915[var43] = var37;
                    } else {
                        field1916[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1913[1] > 0 || field1913[2] > 0) {
            var44 = (field1917[1] + field1917[2]) / (field1913[1] + field1913[2]);
        }
        int var45 = 0;
        if (field1913[3] > 0 || field1913[4] > 0) {
            var45 = (field1917[3] + field1917[4]) / (field1913[3] + field1913[4]);
        }
        int var46 = 0;
        if (field1913[6] > 0 || field1913[8] > 0) {
            var46 = (field1917[6] + field1917[8]) / (field1913[6] + field1913[8]);
        }
        int var47 = 0;
        int var48 = field1913[10];
        int[] var49 = field1914[10];
        int[] var50 = field1915;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1913[11];
            var49 = field1914[11];
            var50 = field1916;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2211(var49[var47++]);
                if (var47 == var48 && field1914[11] != var49) {
                    var47 = 0;
                    var48 = field1913[11];
                    var49 = field1914[11];
                    var50 = field1916;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2211(var49[var47++]);
                if (var47 == var48 && field1914[11] != var49) {
                    var47 = 0;
                    var48 = field1913[11];
                    var49 = field1914[11];
                    var50 = field1916;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2211(var49[var47++]);
                if (var47 == var48 && field1914[11] != var49) {
                    var47 = 0;
                    var48 = field1913[11];
                    var49 = field1914[11];
                    var50 = field1916;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1913[var52];
            int[] var54 = field1914[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2211(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2211(var49[var47++]);
            if (var47 == var48 && field1914[11] != var49) {
                var47 = 0;
                var49 = field1914[11];
                var48 = field1913[11];
                var50 = field1916;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dr.an(I)V")
    public final void method2211(int arg0) {
        if (field1900[arg0]) {
            this.method2212(arg0);
            return;
        }
        int var2 = this.field1878[arg0];
        int var3 = this.field1879[arg0];
        int var4 = this.field1880[arg0];
        class104.field1799 = field1920[arg0];
        if (this.field1885 == null) {
            class104.field1781 = 0;
        } else {
            class104.field1781 = this.field1885[arg0] & 0xFF;
        }
        if (this.field1887 != null && this.field1887[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1901 == null || this.field1901[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1901[arg0] & 0xFF;
                var6 = this.field1889[var5];
                var7 = this.field1892[var5];
                var8 = this.field1891[var5];
            }
            if (this.field1883[arg0] == -1) {
                class104.method2093(field1905[var2], field1905[var3], field1905[var4], field1904[var2], field1904[var3], field1904[var4], this.field1881[arg0], this.field1881[arg0], this.field1881[arg0], field1907[var6], field1907[var7], field1907[var8], field1894[var6], field1894[var7], field1894[var8], field1933[var6], field1933[var7], field1933[var8], this.field1887[arg0]);
            } else {
                class104.method2093(field1905[var2], field1905[var3], field1905[var4], field1904[var2], field1904[var3], field1904[var4], this.field1881[arg0], this.field1882[arg0], this.field1883[arg0], field1907[var6], field1907[var7], field1907[var8], field1894[var6], field1894[var7], field1894[var8], field1933[var6], field1933[var7], field1933[var8], this.field1887[arg0]);
            }
        } else if (this.field1883[arg0] == -1) {
            class104.method2091(field1905[var2], field1905[var3], field1905[var4], field1904[var2], field1904[var3], field1904[var4], field1931[this.field1881[arg0]]);
        } else {
            class104.method2139(field1905[var2], field1905[var3], field1905[var4], field1904[var2], field1904[var3], field1904[var4], this.field1881[arg0], this.field1882[arg0], this.field1883[arg0]);
        }
    }

    @ObfuscatedName("dr.ae(I)V")
    public final void method2212(int arg0) {
        int var2 = Statics.field1787;
        int var3 = Statics.field1788;
        int var4 = 0;
        int var5 = this.field1878[arg0];
        int var6 = this.field1879[arg0];
        int var7 = this.field1880[arg0];
        int var8 = field1933[var5];
        int var9 = field1933[var6];
        int var10 = field1933[var7];
        if (this.field1885 == null) {
            class104.field1781 = 0;
        } else {
            class104.field1781 = this.field1885[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1935[var4] = field1904[var5];
            field1876[var4] = field1905[var5];
            field1873[var4++] = this.field1881[arg0];
        } else {
            int var11 = field1907[var5];
            int var12 = field1894[var5];
            int var13 = this.field1881[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1932[var10 - var8];
                field1935[var4] = (((field1907[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1876[var4] = (((field1894[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1873[var4++] = ((this.field1883[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1932[var9 - var8];
                field1935[var4] = (((field1907[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1876[var4] = (((field1894[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1873[var4++] = ((this.field1882[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1935[var4] = field1904[var6];
            field1876[var4] = field1905[var6];
            field1873[var4++] = this.field1882[arg0];
        } else {
            int var16 = field1907[var6];
            int var17 = field1894[var6];
            int var18 = this.field1882[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1932[var8 - var9];
                field1935[var4] = (((field1907[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1876[var4] = (((field1894[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1873[var4++] = ((this.field1881[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1932[var10 - var9];
                field1935[var4] = (((field1907[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1876[var4] = (((field1894[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1873[var4++] = ((this.field1883[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1935[var4] = field1904[var7];
            field1876[var4] = field1905[var7];
            field1873[var4++] = this.field1883[arg0];
        } else {
            int var21 = field1907[var7];
            int var22 = field1894[var7];
            int var23 = this.field1883[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1932[var9 - var10];
                field1935[var4] = (((field1907[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1876[var4] = (((field1894[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1873[var4++] = ((this.field1882[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1932[var8 - var10];
                field1935[var4] = (((field1907[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1876[var4] = (((field1894[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1873[var4++] = ((this.field1881[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1935[0];
        int var27 = field1935[1];
        int var28 = field1935[2];
        int var29 = field1876[0];
        int var30 = field1876[1];
        int var31 = field1876[2];
        class104.field1799 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1789 || var27 > Statics.field1789 || var28 > Statics.field1789) {
                class104.field1799 = true;
            }
            if (this.field1887 != null && this.field1887[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1901 == null || this.field1901[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1901[arg0] & 0xFF;
                    var33 = this.field1889[var32];
                    var34 = this.field1892[var32];
                    var35 = this.field1891[var32];
                }
                if (this.field1883[arg0] == -1) {
                    class104.method2093(var29, var30, var31, var26, var27, var28, this.field1881[arg0], this.field1881[arg0], this.field1881[arg0], field1907[var33], field1907[var34], field1907[var35], field1894[var33], field1894[var34], field1894[var35], field1933[var33], field1933[var34], field1933[var35], this.field1887[arg0]);
                } else {
                    class104.method2093(var29, var30, var31, var26, var27, var28, field1873[0], field1873[1], field1873[2], field1907[var33], field1907[var34], field1907[var35], field1894[var33], field1894[var34], field1894[var35], field1933[var33], field1933[var34], field1933[var35], this.field1887[arg0]);
                }
            } else if (this.field1883[arg0] == -1) {
                class104.method2091(var29, var30, var31, var26, var27, var28, field1931[this.field1881[arg0]]);
            } else {
                class104.method2139(var29, var30, var31, var26, var27, var28, field1873[0], field1873[1], field1873[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1789 || var27 > Statics.field1789 || var28 > Statics.field1789 || field1935[3] < 0 || field1935[3] > Statics.field1789) {
            class104.field1799 = true;
        }
        if (this.field1887 != null && this.field1887[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1901 == null || this.field1901[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1901[arg0] & 0xFF;
                var37 = this.field1889[var36];
                var38 = this.field1892[var36];
                var39 = this.field1891[var36];
            }
            short var40 = this.field1887[arg0];
            if (this.field1883[arg0] == -1) {
                class104.method2093(var29, var30, var31, var26, var27, var28, this.field1881[arg0], this.field1881[arg0], this.field1881[arg0], field1907[var37], field1907[var38], field1907[var39], field1894[var37], field1894[var38], field1894[var39], field1933[var37], field1933[var38], field1933[var39], var40);
                class104.method2093(var29, var31, field1876[3], var26, var28, field1935[3], this.field1881[arg0], this.field1881[arg0], this.field1881[arg0], field1907[var37], field1907[var38], field1907[var39], field1894[var37], field1894[var38], field1894[var39], field1933[var37], field1933[var38], field1933[var39], var40);
            } else {
                class104.method2093(var29, var30, var31, var26, var27, var28, field1873[0], field1873[1], field1873[2], field1907[var37], field1907[var38], field1907[var39], field1894[var37], field1894[var38], field1894[var39], field1933[var37], field1933[var38], field1933[var39], var40);
                class104.method2093(var29, var31, field1876[3], var26, var28, field1935[3], field1873[0], field1873[2], field1873[3], field1907[var37], field1907[var38], field1907[var39], field1894[var37], field1894[var38], field1894[var39], field1933[var37], field1933[var38], field1933[var39], var40);
            }
        } else if (this.field1883[arg0] == -1) {
            int var41 = field1931[this.field1881[arg0]];
            class104.method2091(var29, var30, var31, var26, var27, var28, var41);
            class104.method2091(var29, var31, field1876[3], var26, var28, field1935[3], var41);
        } else {
            class104.method2139(var29, var30, var31, var26, var27, var28, field1873[0], field1873[1], field1873[2]);
            class104.method2139(var29, var31, field1876[3], var26, var28, field1935[3], field1873[0], field1873[2], field1873[3]);
        }
    }

    @ObfuscatedName("dr.au(IIIIIIII)Z")
    public final boolean method2213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
