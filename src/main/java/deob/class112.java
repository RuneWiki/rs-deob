package deob;

@ObfuscatedName("dp")
public class class112 extends class94 {

    @ObfuscatedName("dp.f")
    public static class112 field1856 = new class112();

    @ObfuscatedName("dp.t")
    public static byte[] field1843 = new byte[1];

    @ObfuscatedName("dp.n")
    public static class112 field1844 = new class112();

    @ObfuscatedName("dp.e")
    public static byte[] field1845 = new byte[1];

    @ObfuscatedName("dp.l")
    public int field1846 = 0;

    @ObfuscatedName("dp.d")
    public int[] field1903;

    @ObfuscatedName("dp.r")
    public int[] field1848;

    @ObfuscatedName("dp.k")
    public int[] field1849;

    @ObfuscatedName("dp.u")
    public int field1850 = 0;

    @ObfuscatedName("dp.o")
    public int[] field1908;

    @ObfuscatedName("dp.g")
    public int[] field1842;

    @ObfuscatedName("dp.s")
    public int[] field1853;

    @ObfuscatedName("dp.b")
    public int[] field1854;

    @ObfuscatedName("dp.v")
    public int[] field1855;

    @ObfuscatedName("dp.j")
    public int[] field1902;

    @ObfuscatedName("dp.q")
    public byte[] field1857;

    @ObfuscatedName("dp.a")
    public byte[] field1858;

    @ObfuscatedName("dp.c")
    public byte[] field1859;

    @ObfuscatedName("dp.m")
    public short[] field1860;

    @ObfuscatedName("dp.z")
    public byte field1889 = 0;

    @ObfuscatedName("dp.w")
    public int field1862 = 0;

    @ObfuscatedName("dp.h")
    public int[] field1863;

    @ObfuscatedName("dp.y")
    public int[] field1864;

    @ObfuscatedName("dp.x")
    public int[] field1879;

    @ObfuscatedName("dp.p")
    public int[][] field1880;

    @ObfuscatedName("dp.i")
    public int[][] field1867;

    @ObfuscatedName("dp.aa")
    public boolean field1868 = false;

    @ObfuscatedName("dp.ax")
    public int field1869;

    @ObfuscatedName("dp.ad")
    public int field1870;

    @ObfuscatedName("dp.af")
    public int field1851;

    @ObfuscatedName("dp.ai")
    public int field1872;

    @ObfuscatedName("dp.ag")
    public int field1885;

    @ObfuscatedName("dp.ac")
    public static boolean[] field1875 = new boolean[4096];

    @ObfuscatedName("dp.al")
    public static boolean[] field1865 = new boolean[4096];

    @ObfuscatedName("dp.at")
    public static int[] field1907 = new int[4096];

    @ObfuscatedName("dp.ah")
    public static int[] field1878 = new int[4096];

    @ObfuscatedName("dp.am")
    public static int[] field1890 = new int[4096];

    @ObfuscatedName("dp.ab")
    public static int[] field1873 = new int[4096];

    @ObfuscatedName("dp.aq")
    public static int[] field1897 = new int[4096];

    @ObfuscatedName("dp.ap")
    public static int[] field1882 = new int[4096];

    @ObfuscatedName("dp.as")
    public static int[] field1884 = new int[1600];

    @ObfuscatedName("dp.az")
    public static int[][] field1871 = new int[1600][512];

    @ObfuscatedName("dp.aw")
    public static int[] field1886 = new int[12];

    @ObfuscatedName("dp.av")
    public static int[][] field1887 = new int[12][2000];

    @ObfuscatedName("dp.ay")
    public static int[] field1888 = new int[2000];

    @ObfuscatedName("dp.aj")
    public static int[] field1881 = new int[2000];

    @ObfuscatedName("dp.ae")
    public static int[] field1901 = new int[12];

    @ObfuscatedName("dp.au")
    public static int[] field1891 = new int[10];

    @ObfuscatedName("dp.ao")
    public static int[] field1892 = new int[10];

    @ObfuscatedName("dp.ak")
    public static int[] field1876 = new int[10];

    @ObfuscatedName("dp.bc")
    public static boolean field1866 = false;

    @ObfuscatedName("dp.bn")
    public static int field1898 = 0;

    @ObfuscatedName("dp.bo")
    public static int field1899 = 0;

    @ObfuscatedName("dp.by")
    public static int field1900 = 0;

    @ObfuscatedName("dp.bi")
    public static int[] field1874 = new int[1000];

    @ObfuscatedName("dp.bk")
    public static int[] field1847 = class104.field1774;

    @ObfuscatedName("dp.ba")
    public static int[] field1852 = class104.field1775;

    @ObfuscatedName("dp.bt")
    public static int[] field1904 = class104.field1751;

    @ObfuscatedName("dp.bs")
    public static int[] field1905 = class104.field1773;

    public class112() {
    }

    public class112(class112[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1846 = 0;
        this.field1850 = 0;
        this.field1862 = 0;
        this.field1889 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class112 var8 = arg0[var7];
            if (var8 != null) {
                this.field1846 += var8.field1846;
                this.field1850 += var8.field1850;
                this.field1862 += var8.field1862;
                if (var8.field1857 == null) {
                    if (this.field1889 == -1) {
                        this.field1889 = var8.field1889;
                    }
                    if (this.field1889 != var8.field1889) {
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
        this.field1903 = new int[this.field1846];
        this.field1848 = new int[this.field1846];
        this.field1849 = new int[this.field1846];
        this.field1908 = new int[this.field1850];
        this.field1842 = new int[this.field1850];
        this.field1853 = new int[this.field1850];
        this.field1854 = new int[this.field1850];
        this.field1855 = new int[this.field1850];
        this.field1902 = new int[this.field1850];
        if (var3) {
            this.field1857 = new byte[this.field1850];
        }
        if (var4) {
            this.field1858 = new byte[this.field1850];
        }
        if (var5) {
            this.field1860 = new short[this.field1850];
        }
        if (var6) {
            this.field1859 = new byte[this.field1850];
        }
        if (this.field1862 > 0) {
            this.field1863 = new int[this.field1862];
            this.field1864 = new int[this.field1862];
            this.field1879 = new int[this.field1862];
        }
        this.field1846 = 0;
        this.field1850 = 0;
        this.field1862 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class112 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1850; var11++) {
                    this.field1908[this.field1850] = var10.field1908[var11] + this.field1846;
                    this.field1842[this.field1850] = var10.field1842[var11] + this.field1846;
                    this.field1853[this.field1850] = var10.field1853[var11] + this.field1846;
                    this.field1854[this.field1850] = var10.field1854[var11];
                    this.field1855[this.field1850] = var10.field1855[var11];
                    this.field1902[this.field1850] = var10.field1902[var11];
                    if (var3) {
                        if (var10.field1857 == null) {
                            this.field1857[this.field1850] = var10.field1889;
                        } else {
                            this.field1857[this.field1850] = var10.field1857[var11];
                        }
                    }
                    if (var4 && var10.field1858 != null) {
                        this.field1858[this.field1850] = var10.field1858[var11];
                    }
                    if (var5) {
                        if (var10.field1860 == null) {
                            this.field1860[this.field1850] = -1;
                        } else {
                            this.field1860[this.field1850] = var10.field1860[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1859 == null || var10.field1859[var11] == -1) {
                            this.field1859[this.field1850] = -1;
                        } else {
                            this.field1859[this.field1850] = (byte) (var10.field1859[var11] + this.field1862);
                        }
                    }
                    this.field1850++;
                }
                for (int var12 = 0; var12 < var10.field1862; var12++) {
                    this.field1863[this.field1862] = var10.field1863[var12] + this.field1846;
                    this.field1864[this.field1862] = var10.field1864[var12] + this.field1846;
                    this.field1879[this.field1862] = var10.field1879[var12] + this.field1846;
                    this.field1862++;
                }
                for (int var13 = 0; var13 < var10.field1846; var13++) {
                    this.field1903[this.field1846] = var10.field1903[var13];
                    this.field1848[this.field1846] = var10.field1848[var13];
                    this.field1849[this.field1846] = var10.field1849[var13];
                    this.field1846++;
                }
            }
        }
    }

    @ObfuscatedName("dp.f([[IIIIZI)Ldp;")
    public class112 method2236(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2240();
        int var7 = arg1 - this.field1851;
        int var8 = this.field1851 + arg1;
        int var9 = arg3 - this.field1851;
        int var10 = this.field1851 + arg3;
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
            var15.field1846 = this.field1846;
            var15.field1850 = this.field1850;
            var15.field1862 = this.field1862;
            var15.field1903 = this.field1903;
            var15.field1849 = this.field1849;
            var15.field1908 = this.field1908;
            var15.field1842 = this.field1842;
            var15.field1853 = this.field1853;
            var15.field1854 = this.field1854;
            var15.field1855 = this.field1855;
            var15.field1902 = this.field1902;
            var15.field1857 = this.field1857;
            var15.field1858 = this.field1858;
            var15.field1859 = this.field1859;
            var15.field1860 = this.field1860;
            var15.field1889 = this.field1889;
            var15.field1863 = this.field1863;
            var15.field1864 = this.field1864;
            var15.field1879 = this.field1879;
            var15.field1880 = this.field1880;
            var15.field1867 = this.field1867;
            var15.field1868 = this.field1868;
            var15.field1848 = new int[var15.field1846];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1846; var16++) {
                int var17 = this.field1903[var16] + arg1;
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
            for (int var26 = 0; var26 < var15.field1846; var26++) {
                int var27 = (-this.field1848[var26] << 16) / this.field1542;
                if (var27 < arg5) {
                    int var28 = this.field1903[var26] + arg1;
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
        var15.field1869 = 0;
        return var15;
    }

    @ObfuscatedName("dp.n(Z)Ldp;")
    public class112 method2263(boolean arg0) {
        if (!arg0 && field1843.length < this.field1850) {
            field1843 = new byte[this.field1850 + 100];
        }
        return this.method2239(arg0, field1856, field1843);
    }

    @ObfuscatedName("dp.e(Z)Ldp;")
    public class112 method2238(boolean arg0) {
        if (!arg0 && field1845.length < this.field1850) {
            field1845 = new byte[this.field1850 + 100];
        }
        return this.method2239(arg0, field1844, field1845);
    }

    @ObfuscatedName("dp.l(ZLdp;[B)Ldp;")
    public class112 method2239(boolean arg0, class112 arg1, byte[] arg2) {
        arg1.field1846 = this.field1846;
        arg1.field1850 = this.field1850;
        arg1.field1862 = this.field1862;
        if (arg1.field1903 == null || arg1.field1903.length < this.field1846) {
            arg1.field1903 = new int[this.field1846 + 100];
            arg1.field1848 = new int[this.field1846 + 100];
            arg1.field1849 = new int[this.field1846 + 100];
        }
        for (int var4 = 0; var4 < this.field1846; var4++) {
            arg1.field1903[var4] = this.field1903[var4];
            arg1.field1848[var4] = this.field1848[var4];
            arg1.field1849[var4] = this.field1849[var4];
        }
        if (arg0) {
            arg1.field1858 = this.field1858;
        } else {
            arg1.field1858 = arg2;
            if (this.field1858 == null) {
                for (int var5 = 0; var5 < this.field1850; var5++) {
                    arg1.field1858[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1850; var6++) {
                    arg1.field1858[var6] = this.field1858[var6];
                }
            }
        }
        arg1.field1908 = this.field1908;
        arg1.field1842 = this.field1842;
        arg1.field1853 = this.field1853;
        arg1.field1854 = this.field1854;
        arg1.field1855 = this.field1855;
        arg1.field1902 = this.field1902;
        arg1.field1857 = this.field1857;
        arg1.field1859 = this.field1859;
        arg1.field1860 = this.field1860;
        arg1.field1889 = this.field1889;
        arg1.field1863 = this.field1863;
        arg1.field1864 = this.field1864;
        arg1.field1879 = this.field1879;
        arg1.field1880 = this.field1880;
        arg1.field1867 = this.field1867;
        arg1.field1868 = this.field1868;
        arg1.field1869 = 0;
        return arg1;
    }

    @ObfuscatedName("dp.d()V")
    public void method2240() {
        if (this.field1869 == 1) {
            return;
        }
        this.field1869 = 1;
        this.field1542 = 0;
        this.field1870 = 0;
        this.field1851 = 0;
        for (int var1 = 0; var1 < this.field1846; var1++) {
            int var2 = this.field1903[var1];
            int var3 = this.field1848[var1];
            int var4 = this.field1849[var1];
            if (-var3 > this.field1542) {
                this.field1542 = -var3;
            }
            if (var3 > this.field1870) {
                this.field1870 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1851) {
                this.field1851 = var5;
            }
        }
        this.field1851 = (int) (Math.sqrt((double) this.field1851) + 0.99D);
        this.field1885 = (int) (Math.sqrt((double) (this.field1542 * this.field1542 + this.field1851 * this.field1851)) + 0.99D);
        this.field1872 = this.field1885 + (int) (Math.sqrt((double) (this.field1870 * this.field1870 + this.field1851 * this.field1851)) + 0.99D);
    }

    @ObfuscatedName("dp.o()V")
    public void method2241() {
        if (this.field1869 == 2) {
            return;
        }
        this.field1869 = 2;
        this.field1851 = 0;
        for (int var1 = 0; var1 < this.field1846; var1++) {
            int var2 = this.field1903[var1];
            int var3 = this.field1848[var1];
            int var4 = this.field1849[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1851) {
                this.field1851 = var5;
            }
        }
        this.field1851 = (int) (Math.sqrt((double) this.field1851) + 0.99D);
        this.field1885 = this.field1851;
        this.field1872 = this.field1851 + this.field1851;
    }

    @ObfuscatedName("dp.g()I")
    public int method2305() {
        this.method2240();
        return this.field1851;
    }

    @ObfuscatedName("dp.s(Ldc;I)V")
    public void method2299(class109 arg0, int arg1) {
        if (this.field1880 == null || arg1 == -1) {
            return;
        }
        class97 var3 = arg0.field1806[arg1];
        class105 var4 = var3.field1623;
        Statics.field1894 = 0;
        Statics.field1895 = 0;
        Statics.field1896 = 0;
        for (int var5 = 0; var5 < var3.field1624; var5++) {
            int var6 = var3.field1625[var5];
            this.method2244(var4.field1779[var6], var4.field1776[var6], var3.field1621[var5], var3.field1627[var5], var3.field1628[var5]);
        }
        this.field1869 = 0;
    }

    @ObfuscatedName("dp.b(Ldc;ILdc;I[I)V")
    public void method2243(class109 arg0, int arg1, class109 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2299(arg0, arg1);
            return;
        }
        class97 var6 = arg0.field1806[arg1];
        class97 var7 = arg2.field1806[arg3];
        class105 var8 = var6.field1623;
        Statics.field1894 = 0;
        Statics.field1895 = 0;
        Statics.field1896 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1624; var11++) {
            int var12 = var6.field1625[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1779[var12] == 0) {
                this.method2244(var8.field1779[var12], var8.field1776[var12], var6.field1621[var11], var6.field1627[var11], var6.field1628[var11]);
            }
        }
        Statics.field1894 = 0;
        Statics.field1895 = 0;
        Statics.field1896 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1624; var15++) {
            int var16 = var7.field1625[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1779[var16] == 0) {
                this.method2244(var8.field1779[var16], var8.field1776[var16], var7.field1621[var15], var7.field1627[var15], var7.field1628[var15]);
            }
        }
        this.field1869 = 0;
    }

    @ObfuscatedName("dp.v(I[IIII)V")
    public void method2244(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1894 = 0;
            Statics.field1895 = 0;
            Statics.field1896 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1880.length) {
                    int[] var10 = this.field1880[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1894 += this.field1903[var12];
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
                if (var14 < this.field1880.length) {
                    int[] var15 = this.field1880[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1903[var17] += arg2;
                        this.field1848[var17] += arg3;
                        this.field1849[var17] += arg4;
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
                        this.field1903[var22] -= Statics.field1894;
                        this.field1848[var22] -= Statics.field1895;
                        this.field1849[var22] -= Statics.field1896;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1847[var25];
                            int var27 = field1852[var25];
                            int var28 = this.field1903[var22] * var27 + this.field1848[var22] * var26 >> 16;
                            this.field1848[var22] = this.field1848[var22] * var27 - this.field1903[var22] * var26 >> 16;
                            this.field1903[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1847[var23];
                            int var30 = field1852[var23];
                            int var31 = this.field1848[var22] * var30 - this.field1849[var22] * var29 >> 16;
                            this.field1849[var22] = this.field1849[var22] * var30 + this.field1848[var22] * var29 >> 16;
                            this.field1848[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1847[var24];
                            int var33 = field1852[var24];
                            int var34 = this.field1903[var22] * var33 + this.field1849[var22] * var32 >> 16;
                            this.field1849[var22] = this.field1849[var22] * var33 - this.field1903[var22] * var32 >> 16;
                            this.field1903[var22] = var34;
                        }
                        this.field1903[var22] += Statics.field1894;
                        this.field1848[var22] += Statics.field1895;
                        this.field1849[var22] += Statics.field1896;
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
                        this.field1903[var39] -= Statics.field1894;
                        this.field1848[var39] -= Statics.field1895;
                        this.field1849[var39] -= Statics.field1896;
                        this.field1903[var39] = this.field1903[var39] * arg2 / 128;
                        this.field1848[var39] = this.field1848[var39] * arg3 / 128;
                        this.field1849[var39] = this.field1849[var39] * arg4 / 128;
                        this.field1903[var39] += Statics.field1894;
                        this.field1848[var39] += Statics.field1895;
                        this.field1849[var39] += Statics.field1896;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1867 != null && this.field1858 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1867.length) {
                    int[] var42 = this.field1867[var41];
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

    @ObfuscatedName("dp.j()V")
    public void method2286() {
        for (int var1 = 0; var1 < this.field1846; var1++) {
            int var2 = this.field1903[var1];
            this.field1903[var1] = this.field1849[var1];
            this.field1849[var1] = -var2;
        }
        this.field1869 = 0;
    }

    @ObfuscatedName("dp.q()V")
    public void method2246() {
        for (int var1 = 0; var1 < this.field1846; var1++) {
            this.field1903[var1] = -this.field1903[var1];
            this.field1849[var1] = -this.field1849[var1];
        }
        this.field1869 = 0;
    }

    @ObfuscatedName("dp.a()V")
    public void method2258() {
        for (int var1 = 0; var1 < this.field1846; var1++) {
            int var2 = this.field1849[var1];
            this.field1849[var1] = this.field1903[var1];
            this.field1903[var1] = -var2;
        }
        this.field1869 = 0;
    }

    @ObfuscatedName("dp.c(I)V")
    public void method2248(int arg0) {
        int var2 = field1847[arg0];
        int var3 = field1852[arg0];
        for (int var4 = 0; var4 < this.field1846; var4++) {
            int var5 = this.field1848[var4] * var3 - this.field1849[var4] * var2 >> 16;
            this.field1849[var4] = this.field1849[var4] * var3 + this.field1848[var4] * var2 >> 16;
            this.field1848[var4] = var5;
        }
        this.field1869 = 0;
    }

    @ObfuscatedName("dp.m(III)V")
    public void method2249(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1846; var4++) {
            this.field1903[var4] += arg0;
            this.field1848[var4] += arg1;
            this.field1849[var4] += arg2;
        }
        this.field1869 = 0;
    }

    @ObfuscatedName("dp.z(III)V")
    public void method2250(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1846; var4++) {
            this.field1903[var4] = this.field1903[var4] * arg0 / 128;
            this.field1848[var4] = this.field1848[var4] * arg1 / 128;
            this.field1849[var4] = this.field1849[var4] * arg2 / 128;
        }
        this.field1869 = 0;
    }

    @ObfuscatedName("dp.w(IIIIIII)V")
    public final void method2251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1884[0] = -1;
        if (this.field1869 != 2 && this.field1869 != 1) {
            this.method2241();
        }
        int var8 = Statics.field1770;
        int var9 = Statics.field1755;
        int var10 = field1847[arg0];
        int var11 = field1852[arg0];
        int var12 = field1847[arg1];
        int var13 = field1852[arg1];
        int var14 = field1847[arg2];
        int var15 = field1852[arg2];
        int var16 = field1847[arg3];
        int var17 = field1852[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1846; var19++) {
            int var20 = this.field1903[var19];
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
            field1890[var19] = var30 - var18;
            field1907[var19] = (var26 << 9) / var30 + var8;
            field1878[var19] = (var29 << 9) / var30 + var9;
            if (this.field1862 > 0) {
                field1873[var19] = var26;
                field1897[var19] = var29;
                field1882[var19] = var30;
            }
        }
        try {
            this.method2254(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dp.h(IIIIIIII)V")
    public final void method2245(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1884[0] = -1;
        if (this.field1869 != 2 && this.field1869 != 1) {
            this.method2241();
        }
        int var9 = Statics.field1770;
        int var10 = Statics.field1755;
        int var11 = field1847[arg0];
        int var12 = field1852[arg0];
        int var13 = field1847[arg1];
        int var14 = field1852[arg1];
        int var15 = field1847[arg2];
        int var16 = field1852[arg2];
        int var17 = field1847[arg3];
        int var18 = field1852[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1846; var20++) {
            int var21 = this.field1903[var20];
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
            field1890[var20] = var31 - var19;
            field1907[var20] = (var27 << 9) / arg7 + var9;
            field1878[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1862 > 0) {
                field1873[var20] = var27;
                field1897[var20] = var30;
                field1882[var20] = var31;
            }
        }
        try {
            this.method2254(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dp.i(IIIIIIIII)V")
    public void method1877(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1884[0] = -1;
        if (this.field1869 != 1) {
            this.method2240();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1851 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1851 << 9;
        if (var15 / var13 >= Statics.field1760) {
            return;
        }
        int var16 = this.field1851 + var14 << 9;
        if (var16 / var13 <= Statics.field1765) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1851 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1756) {
            return;
        }
        int var20 = (this.field1542 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1768) {
            return;
        }
        int var22 = (this.field1542 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1862 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1866) {
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
            int var32 = field1898 - Statics.field1770;
            int var33 = field1899 - Statics.field1755;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1868) {
                    field1874[field1900++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1770;
        int var35 = Statics.field1755;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1847[arg0];
            var37 = field1852[arg0];
        }
        for (int var38 = 0; var38 < this.field1846; var38++) {
            int var39 = this.field1903[var38];
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
            field1890[var38] = var50 - var11;
            if (var50 >= 50) {
                field1907[var38] = (var46 << 9) / var50 + var34;
                field1878[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1907[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1873[var38] = var46;
                field1897[var38] = var49;
                field1882[var38] = var50;
            }
        }
        try {
            this.method2254(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dp.y(ZZI)V")
    public final void method2254(boolean arg0, boolean arg1, int arg2) {
        if (this.field1872 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1872; var4++) {
            field1884[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1850; var5++) {
            if (this.field1902[var5] != -2) {
                int var6 = this.field1908[var5];
                int var7 = this.field1842[var5];
                int var8 = this.field1853[var5];
                int var9 = field1907[var6];
                int var10 = field1907[var7];
                int var11 = field1907[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1873[var6];
                    int var13 = field1873[var7];
                    int var14 = field1873[var8];
                    int var15 = field1897[var6];
                    int var16 = field1897[var7];
                    int var17 = field1897[var8];
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
                        field1865[var5] = true;
                        int var30 = (field1890[var6] + field1890[var7] + field1890[var8]) / 3 + this.field1885;
                        field1871[var30][field1884[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2257(field1898, field1899, field1878[var6], field1878[var7], field1878[var8], var9, var10, var11)) {
                        field1874[field1900++] = arg2;
                        arg1 = false;
                    }
                    if ((field1878[var8] - field1878[var7]) * (var9 - var10) - (field1878[var6] - field1878[var7]) * (var11 - var10) > 0) {
                        field1865[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1763 && var10 <= Statics.field1763 && var11 <= Statics.field1763) {
                            field1875[var5] = false;
                        } else {
                            field1875[var5] = true;
                        }
                        int var31 = (field1890[var6] + field1890[var7] + field1890[var8]) / 3 + this.field1885;
                        field1871[var31][field1884[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1857 == null) {
            for (int var32 = this.field1872 - 1; var32 >= 0; var32--) {
                int var33 = field1884[var32];
                if (var33 > 0) {
                    int[] var34 = field1871[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2247(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1886[var36] = 0;
            field1901[var36] = 0;
        }
        for (int var37 = this.field1872 - 1; var37 >= 0; var37--) {
            int var38 = field1884[var37];
            if (var38 > 0) {
                int[] var39 = field1871[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1857[var41];
                    int var43 = field1886[var42]++;
                    field1887[var42][var43] = var41;
                    if (var42 < 10) {
                        field1901[var42] += var37;
                    } else if (var42 == 10) {
                        field1888[var43] = var37;
                    } else {
                        field1881[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1886[1] > 0 || field1886[2] > 0) {
            var44 = (field1901[1] + field1901[2]) / (field1886[1] + field1886[2]);
        }
        int var45 = 0;
        if (field1886[3] > 0 || field1886[4] > 0) {
            var45 = (field1901[3] + field1901[4]) / (field1886[3] + field1886[4]);
        }
        int var46 = 0;
        if (field1886[6] > 0 || field1886[8] > 0) {
            var46 = (field1901[6] + field1901[8]) / (field1886[6] + field1886[8]);
        }
        int var47 = 0;
        int var48 = field1886[10];
        int[] var49 = field1887[10];
        int[] var50 = field1888;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1886[11];
            var49 = field1887[11];
            var50 = field1881;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2247(var49[var47++]);
                if (var47 == var48 && field1887[11] != var49) {
                    var47 = 0;
                    var48 = field1886[11];
                    var49 = field1887[11];
                    var50 = field1881;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2247(var49[var47++]);
                if (var47 == var48 && field1887[11] != var49) {
                    var47 = 0;
                    var48 = field1886[11];
                    var49 = field1887[11];
                    var50 = field1881;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2247(var49[var47++]);
                if (var47 == var48 && field1887[11] != var49) {
                    var47 = 0;
                    var48 = field1886[11];
                    var49 = field1887[11];
                    var50 = field1881;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1886[var52];
            int[] var54 = field1887[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2247(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2247(var49[var47++]);
            if (var47 == var48 && field1887[11] != var49) {
                var47 = 0;
                var49 = field1887[11];
                var48 = field1886[11];
                var50 = field1881;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dp.x(I)V")
    public final void method2247(int arg0) {
        if (field1865[arg0]) {
            this.method2235(arg0);
            return;
        }
        int var2 = this.field1908[arg0];
        int var3 = this.field1842[arg0];
        int var4 = this.field1853[arg0];
        class104.field1762 = field1875[arg0];
        if (this.field1858 == null) {
            class104.field1767 = 0;
        } else {
            class104.field1767 = this.field1858[arg0] & 0xFF;
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
                var7 = this.field1864[var5];
                var8 = this.field1879[var5];
            }
            if (this.field1902[arg0] == -1) {
                class104.method2154(field1878[var2], field1878[var3], field1878[var4], field1907[var2], field1907[var3], field1907[var4], this.field1854[arg0], this.field1854[arg0], this.field1854[arg0], field1873[var6], field1873[var7], field1873[var8], field1897[var6], field1897[var7], field1897[var8], field1882[var6], field1882[var7], field1882[var8], this.field1860[arg0]);
            } else {
                class104.method2154(field1878[var2], field1878[var3], field1878[var4], field1907[var2], field1907[var3], field1907[var4], this.field1854[arg0], this.field1855[arg0], this.field1902[arg0], field1873[var6], field1873[var7], field1873[var8], field1897[var6], field1897[var7], field1897[var8], field1882[var6], field1882[var7], field1882[var8], this.field1860[arg0]);
            }
        } else if (this.field1902[arg0] == -1) {
            class104.method2142(field1878[var2], field1878[var3], field1878[var4], field1907[var2], field1907[var3], field1907[var4], field1904[this.field1854[arg0]]);
        } else {
            class104.method2151(field1878[var2], field1878[var3], field1878[var4], field1907[var2], field1907[var3], field1907[var4], this.field1854[arg0], this.field1855[arg0], this.field1902[arg0]);
        }
    }

    @ObfuscatedName("dp.p(I)V")
    public final void method2235(int arg0) {
        int var2 = Statics.field1770;
        int var3 = Statics.field1755;
        int var4 = 0;
        int var5 = this.field1908[arg0];
        int var6 = this.field1842[arg0];
        int var7 = this.field1853[arg0];
        int var8 = field1882[var5];
        int var9 = field1882[var6];
        int var10 = field1882[var7];
        if (this.field1858 == null) {
            class104.field1767 = 0;
        } else {
            class104.field1767 = this.field1858[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1891[var4] = field1907[var5];
            field1892[var4] = field1878[var5];
            field1876[var4++] = this.field1854[arg0];
        } else {
            int var11 = field1873[var5];
            int var12 = field1897[var5];
            int var13 = this.field1854[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1905[var10 - var8];
                field1891[var4] = (((field1873[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1892[var4] = (((field1897[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1876[var4++] = ((this.field1902[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1905[var9 - var8];
                field1891[var4] = (((field1873[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1892[var4] = (((field1897[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1876[var4++] = ((this.field1855[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1891[var4] = field1907[var6];
            field1892[var4] = field1878[var6];
            field1876[var4++] = this.field1855[arg0];
        } else {
            int var16 = field1873[var6];
            int var17 = field1897[var6];
            int var18 = this.field1855[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1905[var8 - var9];
                field1891[var4] = (((field1873[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1892[var4] = (((field1897[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1876[var4++] = ((this.field1854[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1905[var10 - var9];
                field1891[var4] = (((field1873[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1892[var4] = (((field1897[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1876[var4++] = ((this.field1902[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1891[var4] = field1907[var7];
            field1892[var4] = field1878[var7];
            field1876[var4++] = this.field1902[arg0];
        } else {
            int var21 = field1873[var7];
            int var22 = field1897[var7];
            int var23 = this.field1902[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1905[var9 - var10];
                field1891[var4] = (((field1873[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1892[var4] = (((field1897[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1876[var4++] = ((this.field1855[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1905[var8 - var10];
                field1891[var4] = (((field1873[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1892[var4] = (((field1897[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1876[var4++] = ((this.field1854[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1891[0];
        int var27 = field1891[1];
        int var28 = field1891[2];
        int var29 = field1892[0];
        int var30 = field1892[1];
        int var31 = field1892[2];
        class104.field1762 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1763 || var27 > Statics.field1763 || var28 > Statics.field1763) {
                class104.field1762 = true;
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
                    var34 = this.field1864[var32];
                    var35 = this.field1879[var32];
                }
                if (this.field1902[arg0] == -1) {
                    class104.method2154(var29, var30, var31, var26, var27, var28, this.field1854[arg0], this.field1854[arg0], this.field1854[arg0], field1873[var33], field1873[var34], field1873[var35], field1897[var33], field1897[var34], field1897[var35], field1882[var33], field1882[var34], field1882[var35], this.field1860[arg0]);
                } else {
                    class104.method2154(var29, var30, var31, var26, var27, var28, field1876[0], field1876[1], field1876[2], field1873[var33], field1873[var34], field1873[var35], field1897[var33], field1897[var34], field1897[var35], field1882[var33], field1882[var34], field1882[var35], this.field1860[arg0]);
                }
            } else if (this.field1902[arg0] == -1) {
                class104.method2142(var29, var30, var31, var26, var27, var28, field1904[this.field1854[arg0]]);
            } else {
                class104.method2151(var29, var30, var31, var26, var27, var28, field1876[0], field1876[1], field1876[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1763 || var27 > Statics.field1763 || var28 > Statics.field1763 || field1891[3] < 0 || field1891[3] > Statics.field1763) {
            class104.field1762 = true;
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
                var38 = this.field1864[var36];
                var39 = this.field1879[var36];
            }
            short var40 = this.field1860[arg0];
            if (this.field1902[arg0] == -1) {
                class104.method2154(var29, var30, var31, var26, var27, var28, this.field1854[arg0], this.field1854[arg0], this.field1854[arg0], field1873[var37], field1873[var38], field1873[var39], field1897[var37], field1897[var38], field1897[var39], field1882[var37], field1882[var38], field1882[var39], var40);
                class104.method2154(var29, var31, field1892[3], var26, var28, field1891[3], this.field1854[arg0], this.field1854[arg0], this.field1854[arg0], field1873[var37], field1873[var38], field1873[var39], field1897[var37], field1897[var38], field1897[var39], field1882[var37], field1882[var38], field1882[var39], var40);
            } else {
                class104.method2154(var29, var30, var31, var26, var27, var28, field1876[0], field1876[1], field1876[2], field1873[var37], field1873[var38], field1873[var39], field1897[var37], field1897[var38], field1897[var39], field1882[var37], field1882[var38], field1882[var39], var40);
                class104.method2154(var29, var31, field1892[3], var26, var28, field1891[3], field1876[0], field1876[2], field1876[3], field1873[var37], field1873[var38], field1873[var39], field1897[var37], field1897[var38], field1897[var39], field1882[var37], field1882[var38], field1882[var39], var40);
            }
        } else if (this.field1902[arg0] == -1) {
            int var41 = field1904[this.field1854[arg0]];
            class104.method2142(var29, var30, var31, var26, var27, var28, var41);
            class104.method2142(var29, var31, field1892[3], var26, var28, field1891[3], var41);
        } else {
            class104.method2151(var29, var30, var31, var26, var27, var28, field1876[0], field1876[1], field1876[2]);
            class104.method2151(var29, var31, field1892[3], var26, var28, field1891[3], field1876[0], field1876[2], field1876[3]);
        }
    }

    @ObfuscatedName("dp.af(IIIIIIII)Z")
    public final boolean method2257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
