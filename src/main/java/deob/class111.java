package deob;

@ObfuscatedName("df")
public class class111 extends class93 {

    @ObfuscatedName("df.v")
    public static class111 field1844 = new class111();

    @ObfuscatedName("df.f")
    public static byte[] field1893 = new byte[1];

    @ObfuscatedName("df.n")
    public static class111 field1864 = new class111();

    @ObfuscatedName("df.c")
    public static byte[] field1845 = new byte[1];

    @ObfuscatedName("df.r")
    public int field1881 = 0;

    @ObfuscatedName("df.k")
    public int[] field1847;

    @ObfuscatedName("df.e")
    public int[] field1848;

    @ObfuscatedName("df.q")
    public int[] field1849;

    @ObfuscatedName("df.u")
    public int field1865 = 0;

    @ObfuscatedName("df.s")
    public int[] field1879;

    @ObfuscatedName("df.l")
    public int[] field1852;

    @ObfuscatedName("df.o")
    public int[] field1876;

    @ObfuscatedName("df.h")
    public int[] field1853;

    @ObfuscatedName("df.p")
    public int[] field1900;

    @ObfuscatedName("df.d")
    public int[] field1856;

    @ObfuscatedName("df.m")
    public byte[] field1857;

    @ObfuscatedName("df.z")
    public byte[] field1858;

    @ObfuscatedName("df.t")
    public byte[] field1859;

    @ObfuscatedName("df.i")
    public short[] field1860;

    @ObfuscatedName("df.j")
    public byte field1861 = 0;

    @ObfuscatedName("df.a")
    public int field1862 = 0;

    @ObfuscatedName("df.g")
    public int[] field1863;

    @ObfuscatedName("df.x")
    public int[] field1872;

    @ObfuscatedName("df.b")
    public int[] field1884;

    @ObfuscatedName("df.w")
    public int[][] field1866;

    @ObfuscatedName("df.y")
    public int[][] field1886;

    @ObfuscatedName("df.au")
    public boolean field1868 = false;

    @ObfuscatedName("df.az")
    public int field1898;

    @ObfuscatedName("df.ak")
    public int field1851;

    @ObfuscatedName("df.ah")
    public int field1871;

    @ObfuscatedName("df.aa")
    public int field1885;

    @ObfuscatedName("df.am")
    public int field1873;

    @ObfuscatedName("df.ae")
    public static boolean[] field1875 = new boolean[4096];

    @ObfuscatedName("df.ab")
    public static boolean[] field1901 = new boolean[4096];

    @ObfuscatedName("df.as")
    public static int[] field1877 = new int[4096];

    @ObfuscatedName("df.ai")
    public static int[] field1878 = new int[4096];

    @ObfuscatedName("df.aj")
    public static int[] field1850 = new int[4096];

    @ObfuscatedName("df.an")
    public static int[] field1880 = new int[4096];

    @ObfuscatedName("df.av")
    public static int[] field1846 = new int[4096];

    @ObfuscatedName("df.af")
    public static int[] field1882 = new int[4096];

    @ObfuscatedName("df.ao")
    public static int[] field1867 = new int[1600];

    @ObfuscatedName("df.aw")
    public static int[][] field1888 = new int[1600][512];

    @ObfuscatedName("df.ap")
    public static int[] field1899 = new int[12];

    @ObfuscatedName("df.ay")
    public static int[][] field1887 = new int[12][2000];

    @ObfuscatedName("df.ag")
    public static int[] field1891 = new int[2000];

    @ObfuscatedName("df.ar")
    public static int[] field1889 = new int[2000];

    @ObfuscatedName("df.aq")
    public static int[] field1890 = new int[12];

    @ObfuscatedName("df.ac")
    public static int[] field1869 = new int[10];

    @ObfuscatedName("df.at")
    public static int[] field1892 = new int[10];

    @ObfuscatedName("df.ad")
    public static int[] field1842 = new int[10];

    @ObfuscatedName("df.be")
    public static boolean field1897 = false;

    @ObfuscatedName("df.bp")
    public static int field1854 = 0;

    @ObfuscatedName("df.bi")
    public static int field1843 = 0;

    @ObfuscatedName("df.bf")
    public static int field1870 = 0;

    @ObfuscatedName("df.bo")
    public static int[] field1855 = new int[1000];

    @ObfuscatedName("df.by")
    public static int[] field1902 = class103.field1765;

    @ObfuscatedName("df.bz")
    public static int[] field1903 = class103.field1771;

    @ObfuscatedName("df.bt")
    public static int[] field1904 = class103.field1766;

    @ObfuscatedName("df.bc")
    public static int[] field1905 = class103.field1769;

    public class111() {
    }

    public class111(class111[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1881 = 0;
        this.field1865 = 0;
        this.field1862 = 0;
        this.field1861 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class111 var8 = arg0[var7];
            if (var8 != null) {
                this.field1881 += var8.field1881;
                this.field1865 += var8.field1865;
                this.field1862 += var8.field1862;
                if (var8.field1857 == null) {
                    if (this.field1861 == -1) {
                        this.field1861 = var8.field1861;
                    }
                    if (this.field1861 != var8.field1861) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1858 != null;
                var5 |= var8.field1860 != null;
                var6 |= var8.field1859 != null;
            }
        }
        this.field1847 = new int[this.field1881];
        this.field1848 = new int[this.field1881];
        this.field1849 = new int[this.field1881];
        this.field1879 = new int[this.field1865];
        this.field1852 = new int[this.field1865];
        this.field1876 = new int[this.field1865];
        this.field1853 = new int[this.field1865];
        this.field1900 = new int[this.field1865];
        this.field1856 = new int[this.field1865];
        if (var3) {
            this.field1857 = new byte[this.field1865];
        }
        if (var4) {
            this.field1858 = new byte[this.field1865];
        }
        if (var5) {
            this.field1860 = new short[this.field1865];
        }
        if (var6) {
            this.field1859 = new byte[this.field1865];
        }
        if (this.field1862 > 0) {
            this.field1863 = new int[this.field1862];
            this.field1872 = new int[this.field1862];
            this.field1884 = new int[this.field1862];
        }
        this.field1881 = 0;
        this.field1865 = 0;
        this.field1862 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class111 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1865; var11++) {
                    this.field1879[this.field1865] = var10.field1879[var11] + this.field1881;
                    this.field1852[this.field1865] = var10.field1852[var11] + this.field1881;
                    this.field1876[this.field1865] = var10.field1876[var11] + this.field1881;
                    this.field1853[this.field1865] = var10.field1853[var11];
                    this.field1900[this.field1865] = var10.field1900[var11];
                    this.field1856[this.field1865] = var10.field1856[var11];
                    if (var3) {
                        if (var10.field1857 == null) {
                            this.field1857[this.field1865] = var10.field1861;
                        } else {
                            this.field1857[this.field1865] = var10.field1857[var11];
                        }
                    }
                    if (var4 && var10.field1858 != null) {
                        this.field1858[this.field1865] = var10.field1858[var11];
                    }
                    if (var5) {
                        if (var10.field1860 == null) {
                            this.field1860[this.field1865] = -1;
                        } else {
                            this.field1860[this.field1865] = var10.field1860[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1859 == null || var10.field1859[var11] == -1) {
                            this.field1859[this.field1865] = -1;
                        } else {
                            this.field1859[this.field1865] = (byte) (var10.field1859[var11] + this.field1862);
                        }
                    }
                    this.field1865++;
                }
                for (int var12 = 0; var12 < var10.field1862; var12++) {
                    this.field1863[this.field1862] = var10.field1863[var12] + this.field1881;
                    this.field1872[this.field1862] = var10.field1872[var12] + this.field1881;
                    this.field1884[this.field1862] = var10.field1884[var12] + this.field1881;
                    this.field1862++;
                }
                for (int var13 = 0; var13 < var10.field1881; var13++) {
                    this.field1847[this.field1881] = var10.field1847[var13];
                    this.field1848[this.field1881] = var10.field1848[var13];
                    this.field1849[this.field1881] = var10.field1849[var13];
                    this.field1881++;
                }
            }
        }
    }

    @ObfuscatedName("df.v([[IIIIZI)Ldf;")
    public class111 method2249(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2253();
        int var7 = arg1 - this.field1871;
        int var8 = this.field1871 + arg1;
        int var9 = arg3 - this.field1871;
        int var10 = this.field1871 + arg3;
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
            var15.field1881 = this.field1881;
            var15.field1865 = this.field1865;
            var15.field1862 = this.field1862;
            var15.field1847 = this.field1847;
            var15.field1849 = this.field1849;
            var15.field1879 = this.field1879;
            var15.field1852 = this.field1852;
            var15.field1876 = this.field1876;
            var15.field1853 = this.field1853;
            var15.field1900 = this.field1900;
            var15.field1856 = this.field1856;
            var15.field1857 = this.field1857;
            var15.field1858 = this.field1858;
            var15.field1859 = this.field1859;
            var15.field1860 = this.field1860;
            var15.field1861 = this.field1861;
            var15.field1863 = this.field1863;
            var15.field1872 = this.field1872;
            var15.field1884 = this.field1884;
            var15.field1866 = this.field1866;
            var15.field1886 = this.field1886;
            var15.field1868 = this.field1868;
            var15.field1848 = new int[var15.field1881];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1881; var16++) {
                int var17 = this.field1847[var16] + arg1;
                int var18 = this.field1849[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1848[var16] = this.field1848[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1881; var26++) {
                int var27 = (-this.field1848[var26] << 16) / this.field1531;
                if (var27 < arg5) {
                    int var28 = this.field1847[var26] + arg1;
                    int var29 = this.field1849[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1848[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1848[var26];
                }
            }
        }
        var15.field1898 = 0;
        return var15;
    }

    @ObfuscatedName("df.n(Z)Ldf;")
    public class111 method2276(boolean arg0) {
        if (!arg0 && field1893.length < this.field1865) {
            field1893 = new byte[this.field1865 + 100];
        }
        return this.method2252(arg0, field1844, field1893);
    }

    @ObfuscatedName("df.c(Z)Ldf;")
    public class111 method2273(boolean arg0) {
        if (!arg0 && field1845.length < this.field1865) {
            field1845 = new byte[this.field1865 + 100];
        }
        return this.method2252(arg0, field1864, field1845);
    }

    @ObfuscatedName("df.r(ZLdf;[B)Ldf;")
    public class111 method2252(boolean arg0, class111 arg1, byte[] arg2) {
        arg1.field1881 = this.field1881;
        arg1.field1865 = this.field1865;
        arg1.field1862 = this.field1862;
        if (arg1.field1847 == null || arg1.field1847.length < this.field1881) {
            arg1.field1847 = new int[this.field1881 + 100];
            arg1.field1848 = new int[this.field1881 + 100];
            arg1.field1849 = new int[this.field1881 + 100];
        }
        for (int var4 = 0; var4 < this.field1881; var4++) {
            arg1.field1847[var4] = this.field1847[var4];
            arg1.field1848[var4] = this.field1848[var4];
            arg1.field1849[var4] = this.field1849[var4];
        }
        if (arg0) {
            arg1.field1858 = this.field1858;
        } else {
            arg1.field1858 = arg2;
            if (this.field1858 == null) {
                for (int var5 = 0; var5 < this.field1865; var5++) {
                    arg1.field1858[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1865; var6++) {
                    arg1.field1858[var6] = this.field1858[var6];
                }
            }
        }
        arg1.field1879 = this.field1879;
        arg1.field1852 = this.field1852;
        arg1.field1876 = this.field1876;
        arg1.field1853 = this.field1853;
        arg1.field1900 = this.field1900;
        arg1.field1856 = this.field1856;
        arg1.field1857 = this.field1857;
        arg1.field1859 = this.field1859;
        arg1.field1860 = this.field1860;
        arg1.field1861 = this.field1861;
        arg1.field1863 = this.field1863;
        arg1.field1872 = this.field1872;
        arg1.field1884 = this.field1884;
        arg1.field1866 = this.field1866;
        arg1.field1886 = this.field1886;
        arg1.field1868 = this.field1868;
        arg1.field1898 = 0;
        return arg1;
    }

    @ObfuscatedName("df.k()V")
    public void method2253() {
        if (this.field1898 == 1) {
            return;
        }
        this.field1898 = 1;
        this.field1531 = 0;
        this.field1851 = 0;
        this.field1871 = 0;
        for (int var1 = 0; var1 < this.field1881; var1++) {
            int var2 = this.field1847[var1];
            int var3 = this.field1848[var1];
            int var4 = this.field1849[var1];
            if (-var3 > this.field1531) {
                this.field1531 = -var3;
            }
            if (var3 > this.field1851) {
                this.field1851 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1871) {
                this.field1871 = var5;
            }
        }
        this.field1871 = (int) (Math.sqrt((double) this.field1871) + 0.99D);
        this.field1873 = (int) (Math.sqrt((double) (this.field1531 * this.field1531 + this.field1871 * this.field1871)) + 0.99D);
        this.field1885 = this.field1873 + (int) (Math.sqrt((double) (this.field1871 * this.field1871 + this.field1851 * this.field1851)) + 0.99D);
    }

    @ObfuscatedName("df.s()V")
    public void method2254() {
        if (this.field1898 == 2) {
            return;
        }
        this.field1898 = 2;
        this.field1871 = 0;
        for (int var1 = 0; var1 < this.field1881; var1++) {
            int var2 = this.field1847[var1];
            int var3 = this.field1848[var1];
            int var4 = this.field1849[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1871) {
                this.field1871 = var5;
            }
        }
        this.field1871 = (int) (Math.sqrt((double) this.field1871) + 0.99D);
        this.field1873 = this.field1871;
        this.field1885 = this.field1871 + this.field1871;
    }

    @ObfuscatedName("df.l()I")
    public int method2269() {
        this.method2253();
        return this.field1871;
    }

    @ObfuscatedName("df.o(Lds;I)V")
    public void method2256(class108 arg0, int arg1) {
        if (this.field1866 == null || arg1 == -1) {
            return;
        }
        class96 var3 = arg0.field1808[arg1];
        class104 var4 = var3.field1617;
        Statics.field1894 = 0;
        Statics.field1895 = 0;
        Statics.field1896 = 0;
        for (int var5 = 0; var5 < var3.field1618; var5++) {
            int var6 = var3.field1623[var5];
            this.method2258(var4.field1772[var6], var4.field1775[var6], var3.field1620[var5], var3.field1621[var5], var3.field1622[var5]);
        }
        this.field1898 = 0;
    }

    @ObfuscatedName("df.h(Lds;ILds;I[I)V")
    public void method2267(class108 arg0, int arg1, class108 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2256(arg0, arg1);
            return;
        }
        class96 var6 = arg0.field1808[arg1];
        class96 var7 = arg2.field1808[arg3];
        class104 var8 = var6.field1617;
        Statics.field1894 = 0;
        Statics.field1895 = 0;
        Statics.field1896 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1618; var11++) {
            int var12 = var6.field1623[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1772[var12] == 0) {
                this.method2258(var8.field1772[var12], var8.field1775[var12], var6.field1620[var11], var6.field1621[var11], var6.field1622[var11]);
            }
        }
        Statics.field1894 = 0;
        Statics.field1895 = 0;
        Statics.field1896 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1618; var15++) {
            int var16 = var7.field1623[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1772[var16] == 0) {
                this.method2258(var8.field1772[var16], var8.field1775[var16], var7.field1620[var15], var7.field1621[var15], var7.field1622[var15]);
            }
        }
        this.field1898 = 0;
    }

    @ObfuscatedName("df.p(I[IIII)V")
    public void method2258(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1894 = 0;
            Statics.field1895 = 0;
            Statics.field1896 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1866.length) {
                    int[] var10 = this.field1866[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1894 += this.field1847[var12];
                        Statics.field1895 += this.field1848[var12];
                        Statics.field1896 += this.field1849[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1894 = Statics.field1894 / var7 + arg2;
                Statics.field1895 = Statics.field1895 / var7 + arg3;
                Statics.field1896 = Statics.field1896 / var7 + arg4;
            } else {
                Statics.field1894 = arg2;
                Statics.field1895 = arg3;
                Statics.field1896 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1866.length) {
                    int[] var15 = this.field1866[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1847[var17] += arg2;
                        this.field1848[var17] += arg3;
                        this.field1849[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1866.length) {
                    int[] var20 = this.field1866[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1847[var22] -= Statics.field1894;
                        this.field1848[var22] -= Statics.field1895;
                        this.field1849[var22] -= Statics.field1896;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1902[var25];
                            int var27 = field1903[var25];
                            int var28 = this.field1848[var22] * var26 + this.field1847[var22] * var27 >> 16;
                            this.field1848[var22] = this.field1848[var22] * var27 - this.field1847[var22] * var26 >> 16;
                            this.field1847[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1902[var23];
                            int var30 = field1903[var23];
                            int var31 = this.field1848[var22] * var30 - this.field1849[var22] * var29 >> 16;
                            this.field1849[var22] = this.field1849[var22] * var30 + this.field1848[var22] * var29 >> 16;
                            this.field1848[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1902[var24];
                            int var33 = field1903[var24];
                            int var34 = this.field1849[var22] * var32 + this.field1847[var22] * var33 >> 16;
                            this.field1849[var22] = this.field1849[var22] * var33 - this.field1847[var22] * var32 >> 16;
                            this.field1847[var22] = var34;
                        }
                        this.field1847[var22] += Statics.field1894;
                        this.field1848[var22] += Statics.field1895;
                        this.field1849[var22] += Statics.field1896;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1866.length) {
                    int[] var37 = this.field1866[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1847[var39] -= Statics.field1894;
                        this.field1848[var39] -= Statics.field1895;
                        this.field1849[var39] -= Statics.field1896;
                        this.field1847[var39] = this.field1847[var39] * arg2 / 128;
                        this.field1848[var39] = this.field1848[var39] * arg3 / 128;
                        this.field1849[var39] = this.field1849[var39] * arg4 / 128;
                        this.field1847[var39] += Statics.field1894;
                        this.field1848[var39] += Statics.field1895;
                        this.field1849[var39] += Statics.field1896;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1886 != null && this.field1858 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1886.length) {
                    int[] var42 = this.field1886[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1858[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1858[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("df.d()V")
    public void method2259() {
        for (int var1 = 0; var1 < this.field1881; var1++) {
            int var2 = this.field1847[var1];
            this.field1847[var1] = this.field1849[var1];
            this.field1849[var1] = -var2;
        }
        this.field1898 = 0;
    }

    @ObfuscatedName("df.m()V")
    public void method2260() {
        for (int var1 = 0; var1 < this.field1881; var1++) {
            this.field1847[var1] = -this.field1847[var1];
            this.field1849[var1] = -this.field1849[var1];
        }
        this.field1898 = 0;
    }

    @ObfuscatedName("df.z()V")
    public void method2261() {
        for (int var1 = 0; var1 < this.field1881; var1++) {
            int var2 = this.field1849[var1];
            this.field1849[var1] = this.field1847[var1];
            this.field1847[var1] = -var2;
        }
        this.field1898 = 0;
    }

    @ObfuscatedName("df.t(I)V")
    public void method2262(int arg0) {
        int var2 = field1902[arg0];
        int var3 = field1903[arg0];
        for (int var4 = 0; var4 < this.field1881; var4++) {
            int var5 = this.field1848[var4] * var3 - this.field1849[var4] * var2 >> 16;
            this.field1849[var4] = this.field1849[var4] * var3 + this.field1848[var4] * var2 >> 16;
            this.field1848[var4] = var5;
        }
        this.field1898 = 0;
    }

    @ObfuscatedName("df.i(III)V")
    public void method2263(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1881; var4++) {
            this.field1847[var4] += arg0;
            this.field1848[var4] += arg1;
            this.field1849[var4] += arg2;
        }
        this.field1898 = 0;
    }

    @ObfuscatedName("df.j(III)V")
    public void method2264(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1881; var4++) {
            this.field1847[var4] = this.field1847[var4] * arg0 / 128;
            this.field1848[var4] = this.field1848[var4] * arg1 / 128;
            this.field1849[var4] = this.field1849[var4] * arg2 / 128;
        }
        this.field1898 = 0;
    }

    @ObfuscatedName("df.a(IIIIIII)V")
    public final void method2265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1867[0] = -1;
        if (this.field1898 != 2 && this.field1898 != 1) {
            this.method2254();
        }
        int var8 = Statics.field1757;
        int var9 = Statics.field1758;
        int var10 = field1902[arg0];
        int var11 = field1903[arg0];
        int var12 = field1902[arg1];
        int var13 = field1903[arg1];
        int var14 = field1902[arg2];
        int var15 = field1903[arg2];
        int var16 = field1902[arg3];
        int var17 = field1903[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1881; var19++) {
            int var20 = this.field1847[var19];
            int var21 = this.field1848[var19];
            int var22 = this.field1849[var19];
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
            field1850[var19] = var30 - var18;
            field1877[var19] = (var26 << 9) / var30 + var8;
            field1878[var19] = (var29 << 9) / var30 + var9;
            if (this.field1862 > 0) {
                field1880[var19] = var26;
                field1846[var19] = var29;
                field1882[var19] = var30;
            }
        }
        try {
            this.method2271(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("df.g(IIIIIIII)V")
    public final void method2310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1867[0] = -1;
        if (this.field1898 != 2 && this.field1898 != 1) {
            this.method2254();
        }
        int var9 = Statics.field1757;
        int var10 = Statics.field1758;
        int var11 = field1902[arg0];
        int var12 = field1903[arg0];
        int var13 = field1902[arg1];
        int var14 = field1903[arg1];
        int var15 = field1902[arg2];
        int var16 = field1903[arg2];
        int var17 = field1902[arg3];
        int var18 = field1903[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1881; var20++) {
            int var21 = this.field1847[var20];
            int var22 = this.field1848[var20];
            int var23 = this.field1849[var20];
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
            field1850[var20] = var31 - var19;
            field1877[var20] = (var27 << 9) / arg7 + var9;
            field1878[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1862 > 0) {
                field1880[var20] = var27;
                field1846[var20] = var30;
                field1882[var20] = var31;
            }
        }
        try {
            this.method2271(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("df.az(IIIIIIIII)V")
    public void method1880(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1867[0] = -1;
        if (this.field1898 != 1) {
            this.method2253();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1871 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1871 << 9;
        if (var15 / var13 >= Statics.field1762) {
            return;
        }
        int var16 = this.field1871 + var14 << 9;
        if (var16 / var13 <= Statics.field1763) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1871 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1753) {
            return;
        }
        int var20 = (this.field1531 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1764) {
            return;
        }
        int var22 = (this.field1531 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1862 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1897) {
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
            int var32 = field1854 - Statics.field1757;
            int var33 = field1843 - Statics.field1758;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1868) {
                    field1855[field1870++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1757;
        int var35 = Statics.field1758;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1902[arg0];
            var37 = field1903[arg0];
        }
        for (int var38 = 0; var38 < this.field1881; var38++) {
            int var39 = this.field1847[var38];
            int var40 = this.field1848[var38];
            int var41 = this.field1849[var38];
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
            field1850[var38] = var50 - var11;
            if (var50 >= 50) {
                field1877[var38] = (var46 << 9) / var50 + var34;
                field1878[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1877[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1880[var38] = var46;
                field1846[var38] = var49;
                field1882[var38] = var50;
            }
        }
        try {
            this.method2271(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("df.x(ZZI)V")
    public final void method2271(boolean arg0, boolean arg1, int arg2) {
        if (this.field1885 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1885; var4++) {
            field1867[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1865; var5++) {
            if (this.field1856[var5] != -2) {
                int var6 = this.field1879[var5];
                int var7 = this.field1852[var5];
                int var8 = this.field1876[var5];
                int var9 = field1877[var6];
                int var10 = field1877[var7];
                int var11 = field1877[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1880[var6];
                    int var13 = field1880[var7];
                    int var14 = field1880[var8];
                    int var15 = field1846[var6];
                    int var16 = field1846[var7];
                    int var17 = field1846[var8];
                    int var18 = field1882[var6];
                    int var19 = field1882[var7];
                    int var20 = field1882[var8];
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
                        field1901[var5] = true;
                        int var30 = (field1850[var6] + field1850[var7] + field1850[var8]) / 3 + this.field1873;
                        field1888[var30][field1867[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2270(field1854, field1843, field1878[var6], field1878[var7], field1878[var8], var9, var10, var11)) {
                        field1855[field1870++] = arg2;
                        arg1 = false;
                    }
                    if ((field1878[var8] - field1878[var7]) * (var9 - var10) - (field1878[var6] - field1878[var7]) * (var11 - var10) > 0) {
                        field1901[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1759 && var10 <= Statics.field1759 && var11 <= Statics.field1759) {
                            field1875[var5] = false;
                        } else {
                            field1875[var5] = true;
                        }
                        int var31 = (field1850[var6] + field1850[var7] + field1850[var8]) / 3 + this.field1873;
                        field1888[var31][field1867[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1857 == null) {
            for (int var32 = this.field1885 - 1; var32 >= 0; var32--) {
                int var33 = field1867[var32];
                if (var33 > 0) {
                    int[] var34 = field1888[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2268(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1899[var36] = 0;
            field1890[var36] = 0;
        }
        for (int var37 = this.field1885 - 1; var37 >= 0; var37--) {
            int var38 = field1867[var37];
            if (var38 > 0) {
                int[] var39 = field1888[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1857[var41];
                    int var43 = field1899[var42]++;
                    field1887[var42][var43] = var41;
                    if (var42 < 10) {
                        field1890[var42] += var37;
                    } else if (var42 == 10) {
                        field1891[var43] = var37;
                    } else {
                        field1889[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1899[1] > 0 || field1899[2] > 0) {
            var44 = (field1890[1] + field1890[2]) / (field1899[1] + field1899[2]);
        }
        int var45 = 0;
        if (field1899[3] > 0 || field1899[4] > 0) {
            var45 = (field1890[3] + field1890[4]) / (field1899[3] + field1899[4]);
        }
        int var46 = 0;
        if (field1899[6] > 0 || field1899[8] > 0) {
            var46 = (field1890[6] + field1890[8]) / (field1899[6] + field1899[8]);
        }
        int var47 = 0;
        int var48 = field1899[10];
        int[] var49 = field1887[10];
        int[] var50 = field1891;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1899[11];
            var49 = field1887[11];
            var50 = field1889;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2268(var49[var47++]);
                if (var47 == var48 && field1887[11] != var49) {
                    var47 = 0;
                    var48 = field1899[11];
                    var49 = field1887[11];
                    var50 = field1889;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2268(var49[var47++]);
                if (var47 == var48 && field1887[11] != var49) {
                    var47 = 0;
                    var48 = field1899[11];
                    var49 = field1887[11];
                    var50 = field1889;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2268(var49[var47++]);
                if (var47 == var48 && field1887[11] != var49) {
                    var47 = 0;
                    var48 = field1899[11];
                    var49 = field1887[11];
                    var50 = field1889;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1899[var52];
            int[] var54 = field1887[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2268(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2268(var49[var47++]);
            if (var47 == var48 && field1887[11] != var49) {
                var47 = 0;
                var49 = field1887[11];
                var48 = field1899[11];
                var50 = field1889;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("df.b(I)V")
    public final void method2268(int arg0) {
        if (field1901[arg0]) {
            this.method2293(arg0);
            return;
        }
        int var2 = this.field1879[arg0];
        int var3 = this.field1852[arg0];
        int var4 = this.field1876[arg0];
        class103.field1767 = field1875[arg0];
        if (this.field1858 == null) {
            class103.field1751 = 0;
        } else {
            class103.field1751 = this.field1858[arg0] & 0xFF;
        }
        if (this.field1860 != null && this.field1860[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1859 == null || this.field1859[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1859[arg0] & 0xFF;
                var6 = this.field1863[var5];
                var7 = this.field1872[var5];
                var8 = this.field1884[var5];
            }
            if (this.field1856[arg0] == -1) {
                class103.method2151(field1878[var2], field1878[var3], field1878[var4], field1877[var2], field1877[var3], field1877[var4], this.field1853[arg0], this.field1853[arg0], this.field1853[arg0], field1880[var6], field1880[var7], field1880[var8], field1846[var6], field1846[var7], field1846[var8], field1882[var6], field1882[var7], field1882[var8], this.field1860[arg0]);
            } else {
                class103.method2151(field1878[var2], field1878[var3], field1878[var4], field1877[var2], field1877[var3], field1877[var4], this.field1853[arg0], this.field1900[arg0], this.field1856[arg0], field1880[var6], field1880[var7], field1880[var8], field1846[var6], field1846[var7], field1846[var8], field1882[var6], field1882[var7], field1882[var8], this.field1860[arg0]);
            }
        } else if (this.field1856[arg0] == -1) {
            class103.method2144(field1878[var2], field1878[var3], field1878[var4], field1877[var2], field1877[var3], field1877[var4], field1904[this.field1853[arg0]]);
        } else {
            class103.method2185(field1878[var2], field1878[var3], field1878[var4], field1877[var2], field1877[var3], field1877[var4], this.field1853[arg0], this.field1900[arg0], this.field1856[arg0]);
        }
    }

    @ObfuscatedName("df.w(I)V")
    public final void method2293(int arg0) {
        int var2 = Statics.field1757;
        int var3 = Statics.field1758;
        int var4 = 0;
        int var5 = this.field1879[arg0];
        int var6 = this.field1852[arg0];
        int var7 = this.field1876[arg0];
        int var8 = field1882[var5];
        int var9 = field1882[var6];
        int var10 = field1882[var7];
        if (this.field1858 == null) {
            class103.field1751 = 0;
        } else {
            class103.field1751 = this.field1858[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1869[var4] = field1877[var5];
            field1892[var4] = field1878[var5];
            field1842[var4++] = this.field1853[arg0];
        } else {
            int var11 = field1880[var5];
            int var12 = field1846[var5];
            int var13 = this.field1853[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1905[var10 - var8];
                field1869[var4] = (((field1880[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1892[var4] = (((field1846[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1842[var4++] = ((this.field1856[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1905[var9 - var8];
                field1869[var4] = (((field1880[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1892[var4] = (((field1846[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1842[var4++] = ((this.field1900[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1869[var4] = field1877[var6];
            field1892[var4] = field1878[var6];
            field1842[var4++] = this.field1900[arg0];
        } else {
            int var16 = field1880[var6];
            int var17 = field1846[var6];
            int var18 = this.field1900[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1905[var8 - var9];
                field1869[var4] = (((field1880[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1892[var4] = (((field1846[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1842[var4++] = ((this.field1853[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1905[var10 - var9];
                field1869[var4] = (((field1880[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1892[var4] = (((field1846[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1842[var4++] = ((this.field1856[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1869[var4] = field1877[var7];
            field1892[var4] = field1878[var7];
            field1842[var4++] = this.field1856[arg0];
        } else {
            int var21 = field1880[var7];
            int var22 = field1846[var7];
            int var23 = this.field1856[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1905[var9 - var10];
                field1869[var4] = (((field1880[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1892[var4] = (((field1846[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1842[var4++] = ((this.field1900[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1905[var8 - var10];
                field1869[var4] = (((field1880[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1892[var4] = (((field1846[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1842[var4++] = ((this.field1853[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1869[0];
        int var27 = field1869[1];
        int var28 = field1869[2];
        int var29 = field1892[0];
        int var30 = field1892[1];
        int var31 = field1892[2];
        class103.field1767 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1759 || var27 > Statics.field1759 || var28 > Statics.field1759) {
                class103.field1767 = true;
            }
            if (this.field1860 != null && this.field1860[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1859 == null || this.field1859[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1859[arg0] & 0xFF;
                    var33 = this.field1863[var32];
                    var34 = this.field1872[var32];
                    var35 = this.field1884[var32];
                }
                if (this.field1856[arg0] == -1) {
                    class103.method2151(var29, var30, var31, var26, var27, var28, this.field1853[arg0], this.field1853[arg0], this.field1853[arg0], field1880[var33], field1880[var34], field1880[var35], field1846[var33], field1846[var34], field1846[var35], field1882[var33], field1882[var34], field1882[var35], this.field1860[arg0]);
                } else {
                    class103.method2151(var29, var30, var31, var26, var27, var28, field1842[0], field1842[1], field1842[2], field1880[var33], field1880[var34], field1880[var35], field1846[var33], field1846[var34], field1846[var35], field1882[var33], field1882[var34], field1882[var35], this.field1860[arg0]);
                }
            } else if (this.field1856[arg0] == -1) {
                class103.method2144(var29, var30, var31, var26, var27, var28, field1904[this.field1853[arg0]]);
            } else {
                class103.method2185(var29, var30, var31, var26, var27, var28, field1842[0], field1842[1], field1842[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1759 || var27 > Statics.field1759 || var28 > Statics.field1759 || field1869[3] < 0 || field1869[3] > Statics.field1759) {
            class103.field1767 = true;
        }
        if (this.field1860 != null && this.field1860[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1859 == null || this.field1859[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1859[arg0] & 0xFF;
                var37 = this.field1863[var36];
                var38 = this.field1872[var36];
                var39 = this.field1884[var36];
            }
            short var40 = this.field1860[arg0];
            if (this.field1856[arg0] == -1) {
                class103.method2151(var29, var30, var31, var26, var27, var28, this.field1853[arg0], this.field1853[arg0], this.field1853[arg0], field1880[var37], field1880[var38], field1880[var39], field1846[var37], field1846[var38], field1846[var39], field1882[var37], field1882[var38], field1882[var39], var40);
                class103.method2151(var29, var31, field1892[3], var26, var28, field1869[3], this.field1853[arg0], this.field1853[arg0], this.field1853[arg0], field1880[var37], field1880[var38], field1880[var39], field1846[var37], field1846[var38], field1846[var39], field1882[var37], field1882[var38], field1882[var39], var40);
            } else {
                class103.method2151(var29, var30, var31, var26, var27, var28, field1842[0], field1842[1], field1842[2], field1880[var37], field1880[var38], field1880[var39], field1846[var37], field1846[var38], field1846[var39], field1882[var37], field1882[var38], field1882[var39], var40);
                class103.method2151(var29, var31, field1892[3], var26, var28, field1869[3], field1842[0], field1842[2], field1842[3], field1880[var37], field1880[var38], field1880[var39], field1846[var37], field1846[var38], field1846[var39], field1882[var37], field1882[var38], field1882[var39], var40);
            }
        } else if (this.field1856[arg0] == -1) {
            int var41 = field1904[this.field1853[arg0]];
            class103.method2144(var29, var30, var31, var26, var27, var28, var41);
            class103.method2144(var29, var31, field1892[3], var26, var28, field1869[3], var41);
        } else {
            class103.method2185(var29, var30, var31, var26, var27, var28, field1842[0], field1842[1], field1842[2]);
            class103.method2185(var29, var31, field1892[3], var26, var28, field1869[3], field1842[0], field1842[2], field1842[3]);
        }
    }

    @ObfuscatedName("df.y(IIIIIIII)Z")
    public final boolean method2270(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
