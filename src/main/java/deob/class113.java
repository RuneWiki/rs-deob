package deob;

@ObfuscatedName("dt")
public class class113 extends class95 {

    @ObfuscatedName("dt.i")
    public static class113 field1872 = new class113();

    @ObfuscatedName("dt.b")
    public static byte[] field1863 = new byte[1];

    @ObfuscatedName("dt.r")
    public static class113 field1881 = new class113();

    @ObfuscatedName("dt.l")
    public static byte[] field1865 = new byte[1];

    @ObfuscatedName("dt.s")
    public int field1866 = 0;

    @ObfuscatedName("dt.d")
    public int[] field1867;

    @ObfuscatedName("dt.e")
    public int[] field1868;

    @ObfuscatedName("dt.u")
    public int[] field1869;

    @ObfuscatedName("dt.q")
    public int field1870 = 0;

    @ObfuscatedName("dt.o")
    public int[] field1871;

    @ObfuscatedName("dt.v")
    public int[] field1894;

    @ObfuscatedName("dt.m")
    public int[] field1906;

    @ObfuscatedName("dt.x")
    public int[] field1874;

    @ObfuscatedName("dt.w")
    public int[] field1875;

    @ObfuscatedName("dt.p")
    public int[] field1876;

    @ObfuscatedName("dt.z")
    public byte[] field1864;

    @ObfuscatedName("dt.h")
    public byte[] field1917;

    @ObfuscatedName("dt.a")
    public byte[] field1879;

    @ObfuscatedName("dt.c")
    public short[] field1880;

    @ObfuscatedName("dt.k")
    public byte field1924 = 0;

    @ObfuscatedName("dt.n")
    public int field1895 = 0;

    @ObfuscatedName("dt.t")
    public int[] field1883;

    @ObfuscatedName("dt.y")
    public int[] field1921;

    @ObfuscatedName("dt.g")
    public int[] field1925;

    @ObfuscatedName("dt.f")
    public int[][] field1886;

    @ObfuscatedName("dt.j")
    public int[][] field1887;

    @ObfuscatedName("dt.af")
    public boolean field1888 = false;

    @ObfuscatedName("dt.ar")
    public int field1889;

    @ObfuscatedName("dt.ax")
    public int field1890;

    @ObfuscatedName("dt.at")
    public int field1891;

    @ObfuscatedName("dt.ah")
    public int field1873;

    @ObfuscatedName("dt.ap")
    public int field1893;

    @ObfuscatedName("dt.ag")
    public static boolean[] field1916 = new boolean[4096];

    @ObfuscatedName("dt.ai")
    public static boolean[] field1882 = new boolean[4096];

    @ObfuscatedName("dt.aw")
    public static int[] field1897 = new int[4096];

    @ObfuscatedName("dt.am")
    public static int[] field1898 = new int[4096];

    @ObfuscatedName("dt.an")
    public static int[] field1899 = new int[4096];

    @ObfuscatedName("dt.as")
    public static int[] field1884 = new int[4096];

    @ObfuscatedName("dt.au")
    public static int[] field1862 = new int[4096];

    @ObfuscatedName("dt.aq")
    public static int[] field1902 = new int[4096];

    @ObfuscatedName("dt.ae")
    public static int[] field1904 = new int[1600];

    @ObfuscatedName("dt.ad")
    public static int[][] field1905 = new int[1600][512];

    @ObfuscatedName("dt.ao")
    public static int[] field1900 = new int[12];

    @ObfuscatedName("dt.aj")
    public static int[][] field1907 = new int[12][2000];

    @ObfuscatedName("dt.aa")
    public static int[] field1908 = new int[2000];

    @ObfuscatedName("dt.al")
    public static int[] field1877 = new int[2000];

    @ObfuscatedName("dt.az")
    public static int[] field1914 = new int[12];

    @ObfuscatedName("dt.av")
    public static int[] field1911 = new int[10];

    @ObfuscatedName("dt.ab")
    public static int[] field1901 = new int[10];

    @ObfuscatedName("dt.ak")
    public static int[] field1913 = new int[10];

    @ObfuscatedName("dt.ba")
    public static boolean field1892 = false;

    @ObfuscatedName("dt.by")
    public static int field1918 = 0;

    @ObfuscatedName("dt.bf")
    public static int field1919 = 0;

    @ObfuscatedName("dt.bo")
    public static int field1920 = 0;

    @ObfuscatedName("dt.bd")
    public static int[] field1885 = new int[1000];

    @ObfuscatedName("dt.bn")
    public static int[] field1922 = class105.field1794;

    @ObfuscatedName("dt.bz")
    public static int[] field1923 = class105.field1795;

    @ObfuscatedName("dt.bl")
    public static int[] field1912 = class105.field1790;

    @ObfuscatedName("dt.bq")
    public static int[] field1910 = class105.field1783;

    public class113() {
    }

    public class113(class113[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1866 = 0;
        this.field1870 = 0;
        this.field1895 = 0;
        this.field1924 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class113 var8 = arg0[var7];
            if (var8 != null) {
                this.field1866 += var8.field1866;
                this.field1870 += var8.field1870;
                this.field1895 += var8.field1895;
                if (var8.field1864 == null) {
                    if (this.field1924 == -1) {
                        this.field1924 = var8.field1924;
                    }
                    if (this.field1924 != var8.field1924) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1917 != null;
                var5 |= var8.field1880 != null;
                var6 |= var8.field1879 != null;
            }
        }
        this.field1867 = new int[this.field1866];
        this.field1868 = new int[this.field1866];
        this.field1869 = new int[this.field1866];
        this.field1871 = new int[this.field1870];
        this.field1894 = new int[this.field1870];
        this.field1906 = new int[this.field1870];
        this.field1874 = new int[this.field1870];
        this.field1875 = new int[this.field1870];
        this.field1876 = new int[this.field1870];
        if (var3) {
            this.field1864 = new byte[this.field1870];
        }
        if (var4) {
            this.field1917 = new byte[this.field1870];
        }
        if (var5) {
            this.field1880 = new short[this.field1870];
        }
        if (var6) {
            this.field1879 = new byte[this.field1870];
        }
        if (this.field1895 > 0) {
            this.field1883 = new int[this.field1895];
            this.field1921 = new int[this.field1895];
            this.field1925 = new int[this.field1895];
        }
        this.field1866 = 0;
        this.field1870 = 0;
        this.field1895 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class113 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1870; var11++) {
                    this.field1871[this.field1870] = var10.field1871[var11] + this.field1866;
                    this.field1894[this.field1870] = var10.field1894[var11] + this.field1866;
                    this.field1906[this.field1870] = var10.field1906[var11] + this.field1866;
                    this.field1874[this.field1870] = var10.field1874[var11];
                    this.field1875[this.field1870] = var10.field1875[var11];
                    this.field1876[this.field1870] = var10.field1876[var11];
                    if (var3) {
                        if (var10.field1864 == null) {
                            this.field1864[this.field1870] = var10.field1924;
                        } else {
                            this.field1864[this.field1870] = var10.field1864[var11];
                        }
                    }
                    if (var4 && var10.field1917 != null) {
                        this.field1917[this.field1870] = var10.field1917[var11];
                    }
                    if (var5) {
                        if (var10.field1880 == null) {
                            this.field1880[this.field1870] = -1;
                        } else {
                            this.field1880[this.field1870] = var10.field1880[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1879 == null || var10.field1879[var11] == -1) {
                            this.field1879[this.field1870] = -1;
                        } else {
                            this.field1879[this.field1870] = (byte) (var10.field1879[var11] + this.field1895);
                        }
                    }
                    this.field1870++;
                }
                for (int var12 = 0; var12 < var10.field1895; var12++) {
                    this.field1883[this.field1895] = var10.field1883[var12] + this.field1866;
                    this.field1921[this.field1895] = var10.field1921[var12] + this.field1866;
                    this.field1925[this.field1895] = var10.field1925[var12] + this.field1866;
                    this.field1895++;
                }
                for (int var13 = 0; var13 < var10.field1866; var13++) {
                    this.field1867[this.field1866] = var10.field1867[var13];
                    this.field1868[this.field1866] = var10.field1868[var13];
                    this.field1869[this.field1866] = var10.field1869[var13];
                    this.field1866++;
                }
            }
        }
    }

    @ObfuscatedName("dt.i([[IIIIZI)Ldt;")
    public class113 method2257(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2271();
        int var7 = arg1 - this.field1891;
        int var8 = this.field1891 + arg1;
        int var9 = arg3 - this.field1891;
        int var10 = this.field1891 + arg3;
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
            var15.field1866 = this.field1866;
            var15.field1870 = this.field1870;
            var15.field1895 = this.field1895;
            var15.field1867 = this.field1867;
            var15.field1869 = this.field1869;
            var15.field1871 = this.field1871;
            var15.field1894 = this.field1894;
            var15.field1906 = this.field1906;
            var15.field1874 = this.field1874;
            var15.field1875 = this.field1875;
            var15.field1876 = this.field1876;
            var15.field1864 = this.field1864;
            var15.field1917 = this.field1917;
            var15.field1879 = this.field1879;
            var15.field1880 = this.field1880;
            var15.field1924 = this.field1924;
            var15.field1883 = this.field1883;
            var15.field1921 = this.field1921;
            var15.field1925 = this.field1925;
            var15.field1886 = this.field1886;
            var15.field1887 = this.field1887;
            var15.field1888 = this.field1888;
            var15.field1868 = new int[var15.field1866];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1866; var16++) {
                int var17 = this.field1867[var16] + arg1;
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
            for (int var26 = 0; var26 < var15.field1866; var26++) {
                int var27 = (-this.field1868[var26] << 16) / this.field1564;
                if (var27 < arg5) {
                    int var28 = this.field1867[var26] + arg1;
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

    @ObfuscatedName("dt.r(Z)Ldt;")
    public class113 method2311(boolean arg0) {
        if (!arg0 && field1863.length < this.field1870) {
            field1863 = new byte[this.field1870 + 100];
        }
        return this.method2260(arg0, field1872, field1863);
    }

    @ObfuscatedName("dt.l(Z)Ldt;")
    public class113 method2309(boolean arg0) {
        if (!arg0 && field1865.length < this.field1870) {
            field1865 = new byte[this.field1870 + 100];
        }
        return this.method2260(arg0, field1881, field1865);
    }

    @ObfuscatedName("dt.s(ZLdt;[B)Ldt;")
    public class113 method2260(boolean arg0, class113 arg1, byte[] arg2) {
        arg1.field1866 = this.field1866;
        arg1.field1870 = this.field1870;
        arg1.field1895 = this.field1895;
        if (arg1.field1867 == null || arg1.field1867.length < this.field1866) {
            arg1.field1867 = new int[this.field1866 + 100];
            arg1.field1868 = new int[this.field1866 + 100];
            arg1.field1869 = new int[this.field1866 + 100];
        }
        for (int var4 = 0; var4 < this.field1866; var4++) {
            arg1.field1867[var4] = this.field1867[var4];
            arg1.field1868[var4] = this.field1868[var4];
            arg1.field1869[var4] = this.field1869[var4];
        }
        if (arg0) {
            arg1.field1917 = this.field1917;
        } else {
            arg1.field1917 = arg2;
            if (this.field1917 == null) {
                for (int var5 = 0; var5 < this.field1870; var5++) {
                    arg1.field1917[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1870; var6++) {
                    arg1.field1917[var6] = this.field1917[var6];
                }
            }
        }
        arg1.field1871 = this.field1871;
        arg1.field1894 = this.field1894;
        arg1.field1906 = this.field1906;
        arg1.field1874 = this.field1874;
        arg1.field1875 = this.field1875;
        arg1.field1876 = this.field1876;
        arg1.field1864 = this.field1864;
        arg1.field1879 = this.field1879;
        arg1.field1880 = this.field1880;
        arg1.field1924 = this.field1924;
        arg1.field1883 = this.field1883;
        arg1.field1921 = this.field1921;
        arg1.field1925 = this.field1925;
        arg1.field1886 = this.field1886;
        arg1.field1887 = this.field1887;
        arg1.field1888 = this.field1888;
        arg1.field1889 = 0;
        return arg1;
    }

    @ObfuscatedName("dt.d()V")
    public void method2271() {
        if (this.field1889 == 1) {
            return;
        }
        this.field1889 = 1;
        this.field1564 = 0;
        this.field1890 = 0;
        this.field1891 = 0;
        for (int var1 = 0; var1 < this.field1866; var1++) {
            int var2 = this.field1867[var1];
            int var3 = this.field1868[var1];
            int var4 = this.field1869[var1];
            if (-var3 > this.field1564) {
                this.field1564 = -var3;
            }
            if (var3 > this.field1890) {
                this.field1890 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1891) {
                this.field1891 = var5;
            }
        }
        this.field1891 = (int) (Math.sqrt((double) this.field1891) + 0.99D);
        this.field1893 = (int) (Math.sqrt((double) (this.field1564 * this.field1564 + this.field1891 * this.field1891)) + 0.99D);
        this.field1873 = this.field1893 + (int) (Math.sqrt((double) (this.field1891 * this.field1891 + this.field1890 * this.field1890)) + 0.99D);
    }

    @ObfuscatedName("dt.e()V")
    public void method2316() {
        if (this.field1889 == 2) {
            return;
        }
        this.field1889 = 2;
        this.field1891 = 0;
        for (int var1 = 0; var1 < this.field1866; var1++) {
            int var2 = this.field1867[var1];
            int var3 = this.field1868[var1];
            int var4 = this.field1869[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1891) {
                this.field1891 = var5;
            }
        }
        this.field1891 = (int) (Math.sqrt((double) this.field1891) + 0.99D);
        this.field1893 = this.field1891;
        this.field1873 = this.field1891 + this.field1891;
    }

    @ObfuscatedName("dt.m()I")
    public int method2262() {
        this.method2271();
        return this.field1891;
    }

    @ObfuscatedName("dt.x(Ldj;I)V")
    public void method2288(class110 arg0, int arg1) {
        if (this.field1886 == null || arg1 == -1) {
            return;
        }
        class98 var3 = arg0.field1829[arg1];
        class106 var4 = var3.field1651;
        Statics.field1896 = 0;
        Statics.field1915 = 0;
        Statics.field1878 = 0;
        for (int var5 = 0; var5 < var3.field1649; var5++) {
            int var6 = var3.field1648[var5];
            this.method2265(var4.field1798[var6], var4.field1796[var6], var3.field1644[var5], var3.field1652[var5], var3.field1653[var5]);
        }
        this.field1889 = 0;
    }

    @ObfuscatedName("dt.w(Ldj;ILdj;I[I)V")
    public void method2264(class110 arg0, int arg1, class110 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2288(arg0, arg1);
            return;
        }
        class98 var6 = arg0.field1829[arg1];
        class98 var7 = arg2.field1829[arg3];
        class106 var8 = var6.field1651;
        Statics.field1896 = 0;
        Statics.field1915 = 0;
        Statics.field1878 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1649; var11++) {
            int var12 = var6.field1648[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1798[var12] == 0) {
                this.method2265(var8.field1798[var12], var8.field1796[var12], var6.field1644[var11], var6.field1652[var11], var6.field1653[var11]);
            }
        }
        Statics.field1896 = 0;
        Statics.field1915 = 0;
        Statics.field1878 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1649; var15++) {
            int var16 = var7.field1648[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1798[var16] == 0) {
                this.method2265(var8.field1798[var16], var8.field1796[var16], var7.field1644[var15], var7.field1652[var15], var7.field1653[var15]);
            }
        }
        this.field1889 = 0;
    }

    @ObfuscatedName("dt.p(I[IIII)V")
    public void method2265(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1896 = 0;
            Statics.field1915 = 0;
            Statics.field1878 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1886.length) {
                    int[] var10 = this.field1886[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1896 += this.field1867[var12];
                        Statics.field1915 += this.field1868[var12];
                        Statics.field1878 += this.field1869[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1896 = Statics.field1896 / var7 + arg2;
                Statics.field1915 = Statics.field1915 / var7 + arg3;
                Statics.field1878 = Statics.field1878 / var7 + arg4;
            } else {
                Statics.field1896 = arg2;
                Statics.field1915 = arg3;
                Statics.field1878 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1886.length) {
                    int[] var15 = this.field1886[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1867[var17] += arg2;
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
                        this.field1867[var22] -= Statics.field1896;
                        this.field1868[var22] -= Statics.field1915;
                        this.field1869[var22] -= Statics.field1878;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1922[var25];
                            int var27 = field1923[var25];
                            int var28 = this.field1868[var22] * var26 + this.field1867[var22] * var27 >> 16;
                            this.field1868[var22] = this.field1868[var22] * var27 - this.field1867[var22] * var26 >> 16;
                            this.field1867[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1922[var23];
                            int var30 = field1923[var23];
                            int var31 = this.field1868[var22] * var30 - this.field1869[var22] * var29 >> 16;
                            this.field1869[var22] = this.field1869[var22] * var30 + this.field1868[var22] * var29 >> 16;
                            this.field1868[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1922[var24];
                            int var33 = field1923[var24];
                            int var34 = this.field1869[var22] * var32 + this.field1867[var22] * var33 >> 16;
                            this.field1869[var22] = this.field1869[var22] * var33 - this.field1867[var22] * var32 >> 16;
                            this.field1867[var22] = var34;
                        }
                        this.field1867[var22] += Statics.field1896;
                        this.field1868[var22] += Statics.field1915;
                        this.field1869[var22] += Statics.field1878;
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
                        this.field1867[var39] -= Statics.field1896;
                        this.field1868[var39] -= Statics.field1915;
                        this.field1869[var39] -= Statics.field1878;
                        this.field1867[var39] = this.field1867[var39] * arg2 / 128;
                        this.field1868[var39] = this.field1868[var39] * arg3 / 128;
                        this.field1869[var39] = this.field1869[var39] * arg4 / 128;
                        this.field1867[var39] += Statics.field1896;
                        this.field1868[var39] += Statics.field1915;
                        this.field1869[var39] += Statics.field1878;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1887 != null && this.field1917 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1887.length) {
                    int[] var42 = this.field1887[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1917[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1917[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dt.z()V")
    public void method2266() {
        for (int var1 = 0; var1 < this.field1866; var1++) {
            int var2 = this.field1867[var1];
            this.field1867[var1] = this.field1869[var1];
            this.field1869[var1] = -var2;
        }
        this.field1889 = 0;
    }

    @ObfuscatedName("dt.h()V")
    public void method2302() {
        for (int var1 = 0; var1 < this.field1866; var1++) {
            this.field1867[var1] = -this.field1867[var1];
            this.field1869[var1] = -this.field1869[var1];
        }
        this.field1889 = 0;
    }

    @ObfuscatedName("dt.a()V")
    public void method2317() {
        for (int var1 = 0; var1 < this.field1866; var1++) {
            int var2 = this.field1869[var1];
            this.field1869[var1] = this.field1867[var1];
            this.field1867[var1] = -var2;
        }
        this.field1889 = 0;
    }

    @ObfuscatedName("dt.c(I)V")
    public void method2269(int arg0) {
        int var2 = field1922[arg0];
        int var3 = field1923[arg0];
        for (int var4 = 0; var4 < this.field1866; var4++) {
            int var5 = this.field1868[var4] * var3 - this.field1869[var4] * var2 >> 16;
            this.field1869[var4] = this.field1869[var4] * var3 + this.field1868[var4] * var2 >> 16;
            this.field1868[var4] = var5;
        }
        this.field1889 = 0;
    }

    @ObfuscatedName("dt.k(III)V")
    public void method2270(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1866; var4++) {
            this.field1867[var4] += arg0;
            this.field1868[var4] += arg1;
            this.field1869[var4] += arg2;
        }
        this.field1889 = 0;
    }

    @ObfuscatedName("dt.f(III)V")
    public void method2263(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1866; var4++) {
            this.field1867[var4] = this.field1867[var4] * arg0 / 128;
            this.field1868[var4] = this.field1868[var4] * arg1 / 128;
            this.field1869[var4] = this.field1869[var4] * arg2 / 128;
        }
        this.field1889 = 0;
    }

    @ObfuscatedName("dt.j(IIIIIII)V")
    public final void method2315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1904[0] = -1;
        if (this.field1889 != 2 && this.field1889 != 1) {
            this.method2316();
        }
        int var8 = Statics.field1781;
        int var9 = Statics.field1782;
        int var10 = field1922[arg0];
        int var11 = field1923[arg0];
        int var12 = field1922[arg1];
        int var13 = field1923[arg1];
        int var14 = field1922[arg2];
        int var15 = field1923[arg2];
        int var16 = field1922[arg3];
        int var17 = field1923[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1866; var19++) {
            int var20 = this.field1867[var19];
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
            field1897[var19] = (var26 << 9) / var30 + var8;
            field1898[var19] = (var29 << 9) / var30 + var9;
            if (this.field1895 > 0) {
                field1884[var19] = var26;
                field1862[var19] = var29;
                field1902[var19] = var30;
            }
        }
        try {
            this.method2305(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dt.af(IIIIIIII)V")
    public final void method2273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1904[0] = -1;
        if (this.field1889 != 2 && this.field1889 != 1) {
            this.method2316();
        }
        int var9 = Statics.field1781;
        int var10 = Statics.field1782;
        int var11 = field1922[arg0];
        int var12 = field1923[arg0];
        int var13 = field1922[arg1];
        int var14 = field1923[arg1];
        int var15 = field1922[arg2];
        int var16 = field1923[arg2];
        int var17 = field1922[arg3];
        int var18 = field1923[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1866; var20++) {
            int var21 = this.field1867[var20];
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
            field1897[var20] = (var27 << 9) / arg7 + var9;
            field1898[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1895 > 0) {
                field1884[var20] = var27;
                field1862[var20] = var30;
                field1902[var20] = var31;
            }
        }
        try {
            this.method2305(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dt.n(IIIIIIIII)V")
    public void method1873(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1904[0] = -1;
        if (this.field1889 != 1) {
            this.method2271();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1891 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1891 << 9;
        if (var15 / var13 >= Statics.field1793) {
            return;
        }
        int var16 = this.field1891 + var14 << 9;
        if (var16 / var13 <= Statics.field1785) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1891 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1776) {
            return;
        }
        int var20 = (this.field1564 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1786) {
            return;
        }
        int var22 = (this.field1564 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1895 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1892) {
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
            int var32 = field1918 - Statics.field1781;
            int var33 = field1919 - Statics.field1782;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1888) {
                    field1885[field1920++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1781;
        int var35 = Statics.field1782;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1922[arg0];
            var37 = field1923[arg0];
        }
        for (int var38 = 0; var38 < this.field1866; var38++) {
            int var39 = this.field1867[var38];
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
                field1897[var38] = (var46 << 9) / var50 + var34;
                field1898[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1897[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1884[var38] = var46;
                field1862[var38] = var49;
                field1902[var38] = var50;
            }
        }
        try {
            this.method2305(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dt.ar(ZZI)V")
    public final void method2305(boolean arg0, boolean arg1, int arg2) {
        if (this.field1873 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1873; var4++) {
            field1904[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1870; var5++) {
            if (this.field1876[var5] != -2) {
                int var6 = this.field1871[var5];
                int var7 = this.field1894[var5];
                int var8 = this.field1906[var5];
                int var9 = field1897[var6];
                int var10 = field1897[var7];
                int var11 = field1897[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1884[var6];
                    int var13 = field1884[var7];
                    int var14 = field1884[var8];
                    int var15 = field1862[var6];
                    int var16 = field1862[var7];
                    int var17 = field1862[var8];
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
                        field1882[var5] = true;
                        int var30 = (field1899[var6] + field1899[var7] + field1899[var8]) / 3 + this.field1893;
                        field1905[var30][field1904[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2277(field1918, field1919, field1898[var6], field1898[var7], field1898[var8], var9, var10, var11)) {
                        field1885[field1920++] = arg2;
                        arg1 = false;
                    }
                    if ((field1898[var8] - field1898[var7]) * (var9 - var10) - (field1898[var6] - field1898[var7]) * (var11 - var10) > 0) {
                        field1882[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1784 && var10 <= Statics.field1784 && var11 <= Statics.field1784) {
                            field1916[var5] = false;
                        } else {
                            field1916[var5] = true;
                        }
                        int var31 = (field1899[var6] + field1899[var7] + field1899[var8]) / 3 + this.field1893;
                        field1905[var31][field1904[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1864 == null) {
            for (int var32 = this.field1873 - 1; var32 >= 0; var32--) {
                int var33 = field1904[var32];
                if (var33 > 0) {
                    int[] var34 = field1905[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2275(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1900[var36] = 0;
            field1914[var36] = 0;
        }
        for (int var37 = this.field1873 - 1; var37 >= 0; var37--) {
            int var38 = field1904[var37];
            if (var38 > 0) {
                int[] var39 = field1905[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1864[var41];
                    int var43 = field1900[var42]++;
                    field1907[var42][var43] = var41;
                    if (var42 < 10) {
                        field1914[var42] += var37;
                    } else if (var42 == 10) {
                        field1908[var43] = var37;
                    } else {
                        field1877[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1900[1] > 0 || field1900[2] > 0) {
            var44 = (field1914[1] + field1914[2]) / (field1900[1] + field1900[2]);
        }
        int var45 = 0;
        if (field1900[3] > 0 || field1900[4] > 0) {
            var45 = (field1914[3] + field1914[4]) / (field1900[3] + field1900[4]);
        }
        int var46 = 0;
        if (field1900[6] > 0 || field1900[8] > 0) {
            var46 = (field1914[6] + field1914[8]) / (field1900[6] + field1900[8]);
        }
        int var47 = 0;
        int var48 = field1900[10];
        int[] var49 = field1907[10];
        int[] var50 = field1908;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1900[11];
            var49 = field1907[11];
            var50 = field1877;
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
                if (var47 == var48 && field1907[11] != var49) {
                    var47 = 0;
                    var48 = field1900[11];
                    var49 = field1907[11];
                    var50 = field1877;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2275(var49[var47++]);
                if (var47 == var48 && field1907[11] != var49) {
                    var47 = 0;
                    var48 = field1900[11];
                    var49 = field1907[11];
                    var50 = field1877;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2275(var49[var47++]);
                if (var47 == var48 && field1907[11] != var49) {
                    var47 = 0;
                    var48 = field1900[11];
                    var49 = field1907[11];
                    var50 = field1877;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1900[var52];
            int[] var54 = field1907[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2275(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2275(var49[var47++]);
            if (var47 == var48 && field1907[11] != var49) {
                var47 = 0;
                var49 = field1907[11];
                var48 = field1900[11];
                var50 = field1877;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dt.ax(I)V")
    public final void method2275(int arg0) {
        if (field1882[arg0]) {
            this.method2276(arg0);
            return;
        }
        int var2 = this.field1871[arg0];
        int var3 = this.field1894[arg0];
        int var4 = this.field1906[arg0];
        class105.field1787 = field1916[arg0];
        if (this.field1917 == null) {
            class105.field1772 = 0;
        } else {
            class105.field1772 = this.field1917[arg0] & 0xFF;
        }
        if (this.field1880 != null && this.field1880[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1879 == null || this.field1879[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1879[arg0] & 0xFF;
                var6 = this.field1883[var5];
                var7 = this.field1921[var5];
                var8 = this.field1925[var5];
            }
            if (this.field1876[arg0] == -1) {
                class105.method2152(field1898[var2], field1898[var3], field1898[var4], field1897[var2], field1897[var3], field1897[var4], this.field1874[arg0], this.field1874[arg0], this.field1874[arg0], field1884[var6], field1884[var7], field1884[var8], field1862[var6], field1862[var7], field1862[var8], field1902[var6], field1902[var7], field1902[var8], this.field1880[arg0]);
            } else {
                class105.method2152(field1898[var2], field1898[var3], field1898[var4], field1897[var2], field1897[var3], field1897[var4], this.field1874[arg0], this.field1875[arg0], this.field1876[arg0], field1884[var6], field1884[var7], field1884[var8], field1862[var6], field1862[var7], field1862[var8], field1902[var6], field1902[var7], field1902[var8], this.field1880[arg0]);
            }
        } else if (this.field1876[arg0] == -1) {
            class105.method2150(field1898[var2], field1898[var3], field1898[var4], field1897[var2], field1897[var3], field1897[var4], field1912[this.field1874[arg0]]);
        } else {
            class105.method2148(field1898[var2], field1898[var3], field1898[var4], field1897[var2], field1897[var3], field1897[var4], this.field1874[arg0], this.field1875[arg0], this.field1876[arg0]);
        }
    }

    @ObfuscatedName("dt.at(I)V")
    public final void method2276(int arg0) {
        int var2 = Statics.field1781;
        int var3 = Statics.field1782;
        int var4 = 0;
        int var5 = this.field1871[arg0];
        int var6 = this.field1894[arg0];
        int var7 = this.field1906[arg0];
        int var8 = field1902[var5];
        int var9 = field1902[var6];
        int var10 = field1902[var7];
        if (this.field1917 == null) {
            class105.field1772 = 0;
        } else {
            class105.field1772 = this.field1917[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1911[var4] = field1897[var5];
            field1901[var4] = field1898[var5];
            field1913[var4++] = this.field1874[arg0];
        } else {
            int var11 = field1884[var5];
            int var12 = field1862[var5];
            int var13 = this.field1874[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1910[var10 - var8];
                field1911[var4] = (((field1884[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1901[var4] = (((field1862[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1913[var4++] = ((this.field1876[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1910[var9 - var8];
                field1911[var4] = (((field1884[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1901[var4] = (((field1862[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1913[var4++] = ((this.field1875[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1911[var4] = field1897[var6];
            field1901[var4] = field1898[var6];
            field1913[var4++] = this.field1875[arg0];
        } else {
            int var16 = field1884[var6];
            int var17 = field1862[var6];
            int var18 = this.field1875[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1910[var8 - var9];
                field1911[var4] = (((field1884[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1901[var4] = (((field1862[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1913[var4++] = ((this.field1874[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1910[var10 - var9];
                field1911[var4] = (((field1884[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1901[var4] = (((field1862[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1913[var4++] = ((this.field1876[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1911[var4] = field1897[var7];
            field1901[var4] = field1898[var7];
            field1913[var4++] = this.field1876[arg0];
        } else {
            int var21 = field1884[var7];
            int var22 = field1862[var7];
            int var23 = this.field1876[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1910[var9 - var10];
                field1911[var4] = (((field1884[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1901[var4] = (((field1862[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1913[var4++] = ((this.field1875[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1910[var8 - var10];
                field1911[var4] = (((field1884[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1901[var4] = (((field1862[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1913[var4++] = ((this.field1874[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1911[0];
        int var27 = field1911[1];
        int var28 = field1911[2];
        int var29 = field1901[0];
        int var30 = field1901[1];
        int var31 = field1901[2];
        class105.field1787 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1784 || var27 > Statics.field1784 || var28 > Statics.field1784) {
                class105.field1787 = true;
            }
            if (this.field1880 != null && this.field1880[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1879 == null || this.field1879[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1879[arg0] & 0xFF;
                    var33 = this.field1883[var32];
                    var34 = this.field1921[var32];
                    var35 = this.field1925[var32];
                }
                if (this.field1876[arg0] == -1) {
                    class105.method2152(var29, var30, var31, var26, var27, var28, this.field1874[arg0], this.field1874[arg0], this.field1874[arg0], field1884[var33], field1884[var34], field1884[var35], field1862[var33], field1862[var34], field1862[var35], field1902[var33], field1902[var34], field1902[var35], this.field1880[arg0]);
                } else {
                    class105.method2152(var29, var30, var31, var26, var27, var28, field1913[0], field1913[1], field1913[2], field1884[var33], field1884[var34], field1884[var35], field1862[var33], field1862[var34], field1862[var35], field1902[var33], field1902[var34], field1902[var35], this.field1880[arg0]);
                }
            } else if (this.field1876[arg0] == -1) {
                class105.method2150(var29, var30, var31, var26, var27, var28, field1912[this.field1874[arg0]]);
            } else {
                class105.method2148(var29, var30, var31, var26, var27, var28, field1913[0], field1913[1], field1913[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1784 || var27 > Statics.field1784 || var28 > Statics.field1784 || field1911[3] < 0 || field1911[3] > Statics.field1784) {
            class105.field1787 = true;
        }
        if (this.field1880 != null && this.field1880[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1879 == null || this.field1879[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1879[arg0] & 0xFF;
                var37 = this.field1883[var36];
                var38 = this.field1921[var36];
                var39 = this.field1925[var36];
            }
            short var40 = this.field1880[arg0];
            if (this.field1876[arg0] == -1) {
                class105.method2152(var29, var30, var31, var26, var27, var28, this.field1874[arg0], this.field1874[arg0], this.field1874[arg0], field1884[var37], field1884[var38], field1884[var39], field1862[var37], field1862[var38], field1862[var39], field1902[var37], field1902[var38], field1902[var39], var40);
                class105.method2152(var29, var31, field1901[3], var26, var28, field1911[3], this.field1874[arg0], this.field1874[arg0], this.field1874[arg0], field1884[var37], field1884[var38], field1884[var39], field1862[var37], field1862[var38], field1862[var39], field1902[var37], field1902[var38], field1902[var39], var40);
            } else {
                class105.method2152(var29, var30, var31, var26, var27, var28, field1913[0], field1913[1], field1913[2], field1884[var37], field1884[var38], field1884[var39], field1862[var37], field1862[var38], field1862[var39], field1902[var37], field1902[var38], field1902[var39], var40);
                class105.method2152(var29, var31, field1901[3], var26, var28, field1911[3], field1913[0], field1913[2], field1913[3], field1884[var37], field1884[var38], field1884[var39], field1862[var37], field1862[var38], field1862[var39], field1902[var37], field1902[var38], field1902[var39], var40);
            }
        } else if (this.field1876[arg0] == -1) {
            int var41 = field1912[this.field1874[arg0]];
            class105.method2150(var29, var30, var31, var26, var27, var28, var41);
            class105.method2150(var29, var31, field1901[3], var26, var28, field1911[3], var41);
        } else {
            class105.method2148(var29, var30, var31, var26, var27, var28, field1913[0], field1913[1], field1913[2]);
            class105.method2148(var29, var31, field1901[3], var26, var28, field1911[3], field1913[0], field1913[2], field1913[3]);
        }
    }

    @ObfuscatedName("dt.ah(IIIIIIII)Z")
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
