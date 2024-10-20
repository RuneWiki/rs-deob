package deob;

@ObfuscatedName("ed")
public class class132 extends class140 {

    @ObfuscatedName("ed.c")
    public static class132 field1862 = new class132();

    @ObfuscatedName("ed.i")
    public static byte[] field1892 = new byte[1];

    @ObfuscatedName("ed.o")
    public static class132 field1870 = new class132();

    @ObfuscatedName("ed.j")
    public static byte[] field1845 = new byte[1];

    @ObfuscatedName("ed.k")
    public int field1846 = 0;

    @ObfuscatedName("ed.x")
    public int[] field1847;

    @ObfuscatedName("ed.z")
    public int[] field1844;

    @ObfuscatedName("ed.p")
    public int[] field1849;

    @ObfuscatedName("ed.w")
    public int field1850 = 0;

    @ObfuscatedName("ed.r")
    public int[] field1899;

    @ObfuscatedName("ed.d")
    public int[] field1865;

    @ObfuscatedName("ed.a")
    public int[] field1853;

    @ObfuscatedName("ed.e")
    public int[] field1854;

    @ObfuscatedName("ed.f")
    public int[] field1886;

    @ObfuscatedName("ed.l")
    public int[] field1856;

    @ObfuscatedName("ed.m")
    public byte[] field1871;

    @ObfuscatedName("ed.b")
    public byte[] field1858;

    @ObfuscatedName("ed.h")
    public byte[] field1859;

    @ObfuscatedName("ed.t")
    public short[] field1860;

    @ObfuscatedName("ed.v")
    public byte field1861 = 0;

    @ObfuscatedName("ed.n")
    public int field1893 = 0;

    @ObfuscatedName("ed.u")
    public int[] field1863;

    @ObfuscatedName("ed.q")
    public int[] field1864;

    @ObfuscatedName("ed.g")
    public int[] field1884;

    @ObfuscatedName("ed.y")
    public int[][] field1909;

    @ObfuscatedName("ed.s")
    public int[][] field1857;

    @ObfuscatedName("ed.ac")
    public boolean field1851 = false;

    @ObfuscatedName("ed.ap")
    public int field1869;

    @ObfuscatedName("ed.al")
    public int field1867;

    @ObfuscatedName("ed.ai")
    public int field1908;

    @ObfuscatedName("ed.ab")
    public int field1872;

    @ObfuscatedName("ed.ak")
    public int field1873;

    @ObfuscatedName("ed.as")
    public int field1874;

    @ObfuscatedName("ed.aa")
    public int field1875;

    @ObfuscatedName("ed.ah")
    public int field1876;

    @ObfuscatedName("ed.ao")
    public int field1877 = -1;

    @ObfuscatedName("ed.am")
    public int field1878 = -1;

    @ObfuscatedName("ed.aq")
    public int field1879 = -1;

    @ObfuscatedName("ed.af")
    public static boolean[] field1881 = new boolean[4700];

    @ObfuscatedName("ed.aw")
    public static boolean[] field1903 = new boolean[4700];

    @ObfuscatedName("ed.ax")
    public static int[] field1883 = new int[4700];

    @ObfuscatedName("ed.ag")
    public static int[] field1866 = new int[4700];

    @ObfuscatedName("ed.ay")
    public static int[] field1885 = new int[4700];

    @ObfuscatedName("ed.ad")
    public static int[] field1905 = new int[4700];

    @ObfuscatedName("ed.at")
    public static int[] field1887 = new int[4700];

    @ObfuscatedName("ed.av")
    public static int[] field1888 = new int[4700];

    @ObfuscatedName("ed.aj")
    public static int[] field1890 = new int[1600];

    @ObfuscatedName("ed.ar")
    public static int[][] field1891 = new int[1600][512];

    @ObfuscatedName("ed.au")
    public static int[] field1904 = new int[12];

    @ObfuscatedName("ed.an")
    public static int[][] field1842 = new int[12][2000];

    @ObfuscatedName("ed.bv")
    public static int[] field1843 = new int[2000];

    @ObfuscatedName("ed.bw")
    public static int[] field1895 = new int[2000];

    @ObfuscatedName("ed.bj")
    public static int[] field1896 = new int[12];

    @ObfuscatedName("ed.ba")
    public static int[] field1897 = new int[10];

    @ObfuscatedName("ed.bl")
    public static int[] field1898 = new int[10];

    @ObfuscatedName("ed.br")
    public static int[] field1868 = new int[10];

    @ObfuscatedName("ed.bp")
    public static boolean field1882 = true;

    @ObfuscatedName("ed.bt")
    public static int[] field1906 = class135.field1956;

    @ObfuscatedName("ed.by")
    public static int[] field1907 = class135.field1934;

    @ObfuscatedName("ed.be")
    public static int[] field1852 = class135.field1938;

    @ObfuscatedName("ed.bs")
    public static int[] field1855 = class135.field1952;

    public class132() {
    }

    public class132(class132[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1846 = 0;
        this.field1850 = 0;
        this.field1893 = 0;
        this.field1861 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class132 var8 = arg0[var7];
            if (var8 != null) {
                this.field1846 += var8.field1846;
                this.field1850 += var8.field1850;
                this.field1893 += var8.field1893;
                if (var8.field1871 == null) {
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
        this.field1847 = new int[this.field1846];
        this.field1844 = new int[this.field1846];
        this.field1849 = new int[this.field1846];
        this.field1899 = new int[this.field1850];
        this.field1865 = new int[this.field1850];
        this.field1853 = new int[this.field1850];
        this.field1854 = new int[this.field1850];
        this.field1886 = new int[this.field1850];
        this.field1856 = new int[this.field1850];
        if (var3) {
            this.field1871 = new byte[this.field1850];
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
        if (this.field1893 > 0) {
            this.field1863 = new int[this.field1893];
            this.field1864 = new int[this.field1893];
            this.field1884 = new int[this.field1893];
        }
        this.field1846 = 0;
        this.field1850 = 0;
        this.field1893 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class132 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1850; var11++) {
                    this.field1899[this.field1850] = var10.field1899[var11] + this.field1846;
                    this.field1865[this.field1850] = var10.field1865[var11] + this.field1846;
                    this.field1853[this.field1850] = var10.field1853[var11] + this.field1846;
                    this.field1854[this.field1850] = var10.field1854[var11];
                    this.field1886[this.field1850] = var10.field1886[var11];
                    this.field1856[this.field1850] = var10.field1856[var11];
                    if (var3) {
                        if (var10.field1871 == null) {
                            this.field1871[this.field1850] = var10.field1861;
                        } else {
                            this.field1871[this.field1850] = var10.field1871[var11];
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
                            this.field1859[this.field1850] = (byte) (var10.field1859[var11] + this.field1893);
                        }
                    }
                    this.field1850++;
                }
                for (int var12 = 0; var12 < var10.field1893; var12++) {
                    this.field1863[this.field1893] = var10.field1863[var12] + this.field1846;
                    this.field1864[this.field1893] = var10.field1864[var12] + this.field1846;
                    this.field1884[this.field1893] = var10.field1884[var12] + this.field1846;
                    this.field1893++;
                }
                for (int var13 = 0; var13 < var10.field1846; var13++) {
                    this.field1847[this.field1846] = var10.field1847[var13];
                    this.field1844[this.field1846] = var10.field1844[var13];
                    this.field1849[this.field1846] = var10.field1849[var13];
                    this.field1846++;
                }
            }
        }
    }

    @ObfuscatedName("ed.c([[IIIIZI)Led;")
    public class132 method2470(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2475();
        int var7 = arg1 - this.field1908;
        int var8 = this.field1908 + arg1;
        int var9 = arg3 - this.field1908;
        int var10 = this.field1908 + arg3;
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
        class132 var15;
        if (arg4) {
            var15 = new class132();
            var15.field1846 = this.field1846;
            var15.field1850 = this.field1850;
            var15.field1893 = this.field1893;
            var15.field1847 = this.field1847;
            var15.field1849 = this.field1849;
            var15.field1899 = this.field1899;
            var15.field1865 = this.field1865;
            var15.field1853 = this.field1853;
            var15.field1854 = this.field1854;
            var15.field1886 = this.field1886;
            var15.field1856 = this.field1856;
            var15.field1871 = this.field1871;
            var15.field1858 = this.field1858;
            var15.field1859 = this.field1859;
            var15.field1860 = this.field1860;
            var15.field1861 = this.field1861;
            var15.field1863 = this.field1863;
            var15.field1864 = this.field1864;
            var15.field1884 = this.field1884;
            var15.field1909 = this.field1909;
            var15.field1857 = this.field1857;
            var15.field1851 = this.field1851;
            var15.field1844 = new int[var15.field1846];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1846; var16++) {
                int var17 = this.field1847[var16] + arg1;
                int var18 = this.field1849[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1844[var16] = this.field1844[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1846; var26++) {
                int var27 = (-this.field1844[var26] << 16) / this.field2043;
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
                    var15.field1844[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1844[var26];
                }
            }
        }
        var15.method2484();
        return var15;
    }

    @ObfuscatedName("ed.i(Z)Led;")
    public class132 method2551(boolean arg0) {
        if (!arg0 && field1892.length < this.field1850) {
            field1892 = new byte[this.field1850 + 100];
        }
        return this.method2473(arg0, field1862, field1892);
    }

    @ObfuscatedName("ed.o(Z)Led;")
    public class132 method2503(boolean arg0) {
        if (!arg0 && field1845.length < this.field1850) {
            field1845 = new byte[this.field1850 + 100];
        }
        return this.method2473(arg0, field1870, field1845);
    }

    @ObfuscatedName("ed.j(ZLed;[B)Led;")
    public class132 method2473(boolean arg0, class132 arg1, byte[] arg2) {
        arg1.field1846 = this.field1846;
        arg1.field1850 = this.field1850;
        arg1.field1893 = this.field1893;
        if (arg1.field1847 == null || arg1.field1847.length < this.field1846) {
            arg1.field1847 = new int[this.field1846 + 100];
            arg1.field1844 = new int[this.field1846 + 100];
            arg1.field1849 = new int[this.field1846 + 100];
        }
        for (int var4 = 0; var4 < this.field1846; var4++) {
            arg1.field1847[var4] = this.field1847[var4];
            arg1.field1844[var4] = this.field1844[var4];
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
        arg1.field1899 = this.field1899;
        arg1.field1865 = this.field1865;
        arg1.field1853 = this.field1853;
        arg1.field1854 = this.field1854;
        arg1.field1886 = this.field1886;
        arg1.field1856 = this.field1856;
        arg1.field1871 = this.field1871;
        arg1.field1859 = this.field1859;
        arg1.field1860 = this.field1860;
        arg1.field1861 = this.field1861;
        arg1.field1863 = this.field1863;
        arg1.field1864 = this.field1864;
        arg1.field1884 = this.field1884;
        arg1.field1909 = this.field1909;
        arg1.field1857 = this.field1857;
        arg1.field1851 = this.field1851;
        arg1.method2484();
        return arg1;
    }

    @ObfuscatedName("ed.k(I)V")
    public void method2474(int arg0) {
        if (this.field1877 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1907[arg0];
        int var9 = field1906[arg0];
        for (int var10 = 0; var10 < this.field1846; var10++) {
            int var11 = class135.method2597(this.field1847[var10], this.field1849[var10], var8, var9);
            int var12 = this.field1844[var10];
            int var13 = class135.method2598(this.field1847[var10], this.field1849[var10], var8, var9);
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            if (var13 > var7) {
                var7 = var13;
            }
        }
        this.field1874 = (var2 + var5) / 2;
        this.field1875 = (var3 + var6) / 2;
        this.field1876 = (var4 + var7) / 2;
        this.field1877 = (var5 - var2 + 1) / 2;
        this.field1878 = (var6 - var3 + 1) / 2;
        this.field1879 = (var7 - var4 + 1) / 2;
        if (this.field1877 < 32) {
            this.field1877 = 32;
        }
        if (this.field1879 < 32) {
            this.field1879 = 32;
        }
        if (this.field1851) {
            this.field1877 += 8;
            this.field1879 += 8;
        }
    }

    @ObfuscatedName("ed.x()V")
    public void method2475() {
        if (this.field1869 == 1) {
            return;
        }
        this.field1869 = 1;
        this.field2043 = 0;
        this.field1867 = 0;
        this.field1908 = 0;
        for (int var1 = 0; var1 < this.field1846; var1++) {
            int var2 = this.field1847[var1];
            int var3 = this.field1844[var1];
            int var4 = this.field1849[var1];
            if (-var3 > this.field2043) {
                this.field2043 = -var3;
            }
            if (var3 > this.field1867) {
                this.field1867 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1908) {
                this.field1908 = var5;
            }
        }
        this.field1908 = (int) (Math.sqrt((double) this.field1908) + 0.99D);
        this.field1873 = (int) (Math.sqrt((double) (this.field2043 * this.field2043 + this.field1908 * this.field1908)) + 0.99D);
        this.field1872 = this.field1873 + (int) (Math.sqrt((double) (this.field1908 * this.field1908 + this.field1867 * this.field1867)) + 0.99D);
    }

    @ObfuscatedName("ed.z()V")
    public void method2476() {
        if (this.field1869 == 2) {
            return;
        }
        this.field1869 = 2;
        this.field1908 = 0;
        for (int var1 = 0; var1 < this.field1846; var1++) {
            int var2 = this.field1847[var1];
            int var3 = this.field1844[var1];
            int var4 = this.field1849[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1908) {
                this.field1908 = var5;
            }
        }
        this.field1908 = (int) (Math.sqrt((double) this.field1908) + 0.99D);
        this.field1873 = this.field1908;
        this.field1872 = this.field1908 + this.field1908;
    }

    @ObfuscatedName("ed.p()I")
    public int method2477() {
        this.method2475();
        return this.field1908;
    }

    @ObfuscatedName("ed.r()V")
    public void method2484() {
        this.field1869 = 0;
        this.field1877 = -1;
    }

    @ObfuscatedName("ed.d(Lee;I)V")
    public void method2547(class143 arg0, int arg1) {
        if (this.field1909 == null || arg1 == -1) {
            return;
        }
        class130 var3 = arg0.field2064[arg1];
        class137 var4 = var3.field1815;
        Statics.field1900 = 0;
        Statics.field1901 = 0;
        Statics.field1902 = 0;
        for (int var5 = 0; var5 < var3.field1807; var5++) {
            int var6 = var3.field1812[var5];
            this.method2481(var4.field1976[var6], var4.field1972[var6], var3.field1813[var5], var3.field1810[var5], var3.field1811[var5]);
        }
        this.method2484();
    }

    @ObfuscatedName("ed.a(Lee;ILee;I[I)V")
    public void method2480(class143 arg0, int arg1, class143 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2547(arg0, arg1);
            return;
        }
        class130 var6 = arg0.field2064[arg1];
        class130 var7 = arg2.field2064[arg3];
        class137 var8 = var6.field1815;
        Statics.field1900 = 0;
        Statics.field1901 = 0;
        Statics.field1902 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1807; var11++) {
            int var12 = var6.field1812[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1976[var12] == 0) {
                this.method2481(var8.field1976[var12], var8.field1972[var12], var6.field1813[var11], var6.field1810[var11], var6.field1811[var11]);
            }
        }
        Statics.field1900 = 0;
        Statics.field1901 = 0;
        Statics.field1902 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1807; var15++) {
            int var16 = var7.field1812[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1976[var16] == 0) {
                this.method2481(var8.field1976[var16], var8.field1972[var16], var7.field1813[var15], var7.field1810[var15], var7.field1811[var15]);
            }
        }
        this.method2484();
    }

    @ObfuscatedName("ed.b(I[IIII)V")
    public void method2481(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1900 = 0;
            Statics.field1901 = 0;
            Statics.field1902 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1909.length) {
                    int[] var10 = this.field1909[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1900 += this.field1847[var12];
                        Statics.field1901 += this.field1844[var12];
                        Statics.field1902 += this.field1849[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1900 = Statics.field1900 / var7 + arg2;
                Statics.field1901 = Statics.field1901 / var7 + arg3;
                Statics.field1902 = Statics.field1902 / var7 + arg4;
            } else {
                Statics.field1900 = arg2;
                Statics.field1901 = arg3;
                Statics.field1902 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1909.length) {
                    int[] var15 = this.field1909[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1847[var17] += arg2;
                        this.field1844[var17] += arg3;
                        this.field1849[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1909.length) {
                    int[] var20 = this.field1909[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1847[var22] -= Statics.field1900;
                        this.field1844[var22] -= Statics.field1901;
                        this.field1849[var22] -= Statics.field1902;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1906[var25];
                            int var27 = field1907[var25];
                            int var28 = this.field1847[var22] * var27 + this.field1844[var22] * var26 >> 16;
                            this.field1844[var22] = this.field1844[var22] * var27 - this.field1847[var22] * var26 >> 16;
                            this.field1847[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1906[var23];
                            int var30 = field1907[var23];
                            int var31 = this.field1844[var22] * var30 - this.field1849[var22] * var29 >> 16;
                            this.field1849[var22] = this.field1849[var22] * var30 + this.field1844[var22] * var29 >> 16;
                            this.field1844[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1906[var24];
                            int var33 = field1907[var24];
                            int var34 = this.field1849[var22] * var32 + this.field1847[var22] * var33 >> 16;
                            this.field1849[var22] = this.field1849[var22] * var33 - this.field1847[var22] * var32 >> 16;
                            this.field1847[var22] = var34;
                        }
                        this.field1847[var22] += Statics.field1900;
                        this.field1844[var22] += Statics.field1901;
                        this.field1849[var22] += Statics.field1902;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1909.length) {
                    int[] var37 = this.field1909[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1847[var39] -= Statics.field1900;
                        this.field1844[var39] -= Statics.field1901;
                        this.field1849[var39] -= Statics.field1902;
                        this.field1847[var39] = this.field1847[var39] * arg2 / 128;
                        this.field1844[var39] = this.field1844[var39] * arg3 / 128;
                        this.field1849[var39] = this.field1849[var39] * arg4 / 128;
                        this.field1847[var39] += Statics.field1900;
                        this.field1844[var39] += Statics.field1901;
                        this.field1849[var39] += Statics.field1902;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1857 != null && this.field1858 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1857.length) {
                    int[] var42 = this.field1857[var41];
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

    @ObfuscatedName("ed.h()V")
    public void method2482() {
        for (int var1 = 0; var1 < this.field1846; var1++) {
            int var2 = this.field1847[var1];
            this.field1847[var1] = this.field1849[var1];
            this.field1849[var1] = -var2;
        }
        this.method2484();
    }

    @ObfuscatedName("ed.n()V")
    public void method2483() {
        for (int var1 = 0; var1 < this.field1846; var1++) {
            this.field1847[var1] = -this.field1847[var1];
            this.field1849[var1] = -this.field1849[var1];
        }
        this.method2484();
    }

    @ObfuscatedName("ed.u()V")
    public void method2533() {
        for (int var1 = 0; var1 < this.field1846; var1++) {
            int var2 = this.field1849[var1];
            this.field1849[var1] = this.field1847[var1];
            this.field1847[var1] = -var2;
        }
        this.method2484();
    }

    @ObfuscatedName("ed.q(I)V")
    public void method2544(int arg0) {
        int var2 = field1906[arg0];
        int var3 = field1907[arg0];
        for (int var4 = 0; var4 < this.field1846; var4++) {
            int var5 = this.field1844[var4] * var3 - this.field1849[var4] * var2 >> 16;
            this.field1849[var4] = this.field1849[var4] * var3 + this.field1844[var4] * var2 >> 16;
            this.field1844[var4] = var5;
        }
        this.method2484();
    }

    @ObfuscatedName("ed.g(III)V")
    public void method2486(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1846; var4++) {
            this.field1847[var4] += arg0;
            this.field1844[var4] += arg1;
            this.field1849[var4] += arg2;
        }
        this.method2484();
    }

    @ObfuscatedName("ed.y(III)V")
    public void method2468(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1846; var4++) {
            this.field1847[var4] = this.field1847[var4] * arg0 / 128;
            this.field1844[var4] = this.field1844[var4] * arg1 / 128;
            this.field1849[var4] = this.field1849[var4] * arg2 / 128;
        }
        this.method2484();
    }

    @ObfuscatedName("ed.s(IIIIIII)V")
    public final void method2488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1890[0] = -1;
        if (this.field1869 != 2 && this.field1869 != 1) {
            this.method2476();
        }
        int var8 = Statics.field1943;
        int var9 = Statics.field1944;
        int var10 = field1906[arg0];
        int var11 = field1907[arg0];
        int var12 = field1906[arg1];
        int var13 = field1907[arg1];
        int var14 = field1906[arg2];
        int var15 = field1907[arg2];
        int var16 = field1906[arg3];
        int var17 = field1907[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1846; var19++) {
            int var20 = this.field1847[var19];
            int var21 = this.field1844[var19];
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
            field1885[var19] = var30 - var18;
            field1883[var19] = class135.field1942 * var26 / var30 + var8;
            field1866[var19] = class135.field1942 * var29 / var30 + var9;
            if (this.field1893 > 0) {
                field1905[var19] = var26;
                field1887[var19] = var29;
                field1888[var19] = var30;
            }
        }
        try {
            this.method2498(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ed.ac(IIIIIIII)V")
    public final void method2489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1890[0] = -1;
        if (this.field1869 != 2 && this.field1869 != 1) {
            this.method2476();
        }
        int var9 = Statics.field1943;
        int var10 = Statics.field1944;
        int var11 = field1906[arg0];
        int var12 = field1907[arg0];
        int var13 = field1906[arg1];
        int var14 = field1907[arg1];
        int var15 = field1906[arg2];
        int var16 = field1907[arg2];
        int var17 = field1906[arg3];
        int var18 = field1907[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1846; var20++) {
            int var21 = this.field1847[var20];
            int var22 = this.field1844[var20];
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
            field1885[var20] = var31 - var19;
            field1883[var20] = class135.field1942 * var27 / arg7 + var9;
            field1866[var20] = class135.field1942 * var30 / arg7 + var10;
            if (this.field1893 > 0) {
                field1905[var20] = var27;
                field1887[var20] = var30;
                field1888[var20] = var31;
            }
        }
        try {
            this.method2498(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ed.cr(IIIIIIIII)V")
    public void method2490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1890[0] = -1;
        if (this.field1869 != 1) {
            this.method2475();
        }
        this.method2474(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1908 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1908) * class135.field1942;
        if (var15 / var13 >= Statics.field1948) {
            return;
        }
        int var16 = (this.field1908 + var14) * class135.field1942;
        if (var16 / var13 <= Statics.field1947) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1908 * arg1 >> 16;
        int var19 = (var17 + var18) * class135.field1942;
        if (var19 / var13 <= Statics.field1946) {
            return;
        }
        int var20 = (this.field2043 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class135.field1942;
        if (var21 / var13 >= Statics.field1950) {
            return;
        }
        int var22 = (this.field2043 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1893 > 0;
        int var26 = class133.field1913;
        int var28 = class133.method558();
        boolean var29 = class133.field1917;
        if (class8.field229 && arg8 > 0) {
            if (class133.method224(this, arg5, arg6, arg7)) {
                class8.method516(this, arg5, arg6, arg7, -65281);
            } else if (class8.field231 == class12.field253) {
                class8.method516(this, arg5, arg6, arg7, -16776961);
            }
        }
        if (class8.field226 && arg8 > 0) {
            int var32 = var11 - var12;
            if (var32 <= 50) {
                var32 = 50;
            }
            int var37;
            int var38;
            if (var14 > 0) {
                var37 = var15 / var13;
                var38 = var16 / var32;
            } else {
                var38 = var16 / var13;
                var37 = var15 / var32;
            }
            int var39;
            int var40;
            if (var17 > 0) {
                var39 = var21 / var13;
                var40 = var19 / var32;
            } else {
                var40 = var19 / var13;
                var39 = var21 / var32;
            }
            int var41 = -8355840;
            int var42 = var26 - Statics.field1943;
            int var43 = var28 - Statics.field1944;
            if (var42 > var37 && var42 < var38 && var43 > var39 && var43 < var40) {
                var41 = -256;
            }
            Statics.method4171(Statics.field1943 + var37, Statics.field1944 + var39, Statics.field1943 + var38, Statics.field1944 + var40, var41);
        }
        boolean var44 = false;
        if (arg8 > 0 && var29) {
            boolean var45 = false;
            if (field1882) {
                var45 = class133.method224(this, arg5, arg6, arg7);
            } else {
                int var46 = var11 - var12;
                if (var46 <= 50) {
                    var46 = 50;
                }
                int var47;
                int var48;
                if (var14 > 0) {
                    var47 = var15 / var13;
                    var48 = var16 / var46;
                } else {
                    var48 = var16 / var13;
                    var47 = var15 / var46;
                }
                int var49;
                int var50;
                if (var17 > 0) {
                    var49 = var21 / var13;
                    var50 = var19 / var46;
                } else {
                    var50 = var19 / var13;
                    var49 = var21 / var46;
                }
                int var51 = var26 - Statics.field1943;
                int var52 = var28 - Statics.field1944;
                if (var51 > var47 && var51 < var48 && var52 > var49 && var52 < var50) {
                    var45 = true;
                }
            }
            if (var45) {
                if (this.field1851) {
                    class133.method1837(arg8);
                } else {
                    var44 = true;
                }
            }
        }
        int var53 = Statics.field1943;
        int var54 = Statics.field1944;
        int var55 = 0;
        int var56 = 0;
        if (arg0 != 0) {
            var55 = field1906[arg0];
            var56 = field1907[arg0];
        }
        for (int var57 = 0; var57 < this.field1846; var57++) {
            int var58 = this.field1847[var57];
            int var59 = this.field1844[var57];
            int var60 = this.field1849[var57];
            if (arg0 != 0) {
                int var61 = var55 * var60 + var56 * var58 >> 16;
                var60 = var56 * var60 - var55 * var58 >> 16;
                var58 = var61;
            }
            int var62 = arg5 + var58;
            int var63 = arg6 + var59;
            int var64 = arg7 + var60;
            int var65 = arg3 * var64 + arg4 * var62 >> 16;
            int var66 = arg4 * var64 - arg3 * var62 >> 16;
            int var68 = arg2 * var63 - arg1 * var66 >> 16;
            int var69 = arg1 * var63 + arg2 * var66 >> 16;
            field1885[var57] = var69 - var11;
            if (var69 >= 50) {
                field1883[var57] = class135.field1942 * var65 / var69 + var53;
                field1866[var57] = class135.field1942 * var68 / var69 + var54;
            } else {
                field1883[var57] = -5000;
                var23 = true;
            }
            if (var25) {
                field1905[var57] = var65;
                field1887[var57] = var68;
                field1888[var57] = var69;
            }
        }
        try {
            this.method2498(var23, var44, this.field1851, arg8);
        } catch (Exception var72) {
        }
    }

    @ObfuscatedName("ed.ap(ZZZI)V")
    public final void method2498(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1872 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1872; var5++) {
            field1890[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field228 && arg1) {
            class132 var7 = this;
            for (int var8 = 0; var8 < var7.field1850; var8++) {
                if (var7.field1856[var8] != -2) {
                    int var9 = var7.field1899[var8];
                    int var10 = var7.field1865[var8];
                    int var11 = var7.field1853[var8];
                    int var12 = field1883[var9];
                    int var13 = field1883[var10];
                    int var14 = field1883[var11];
                    class8.method386(field1866[var9], field1866[var10], field1866[var11], var12, var13, var14, var6);
                }
            }
        }
        for (int var15 = 0; var15 < this.field1850; var15++) {
            if (this.field1856[var15] != -2) {
                int var16 = this.field1899[var15];
                int var17 = this.field1865[var15];
                int var18 = this.field1853[var15];
                int var19 = field1883[var16];
                int var20 = field1883[var17];
                int var21 = field1883[var18];
                if (arg0 && var19 == -5000 || var20 == -5000 || var21 == -5000) {
                    int var22 = field1905[var16];
                    int var23 = field1905[var17];
                    int var24 = field1905[var18];
                    int var25 = field1887[var16];
                    int var26 = field1887[var17];
                    int var27 = field1887[var18];
                    int var28 = field1888[var16];
                    int var29 = field1888[var17];
                    int var30 = field1888[var18];
                    int var31 = var22 - var23;
                    int var32 = var24 - var23;
                    int var33 = var25 - var26;
                    int var34 = var27 - var26;
                    int var35 = var28 - var29;
                    int var36 = var30 - var29;
                    int var37 = var33 * var36 - var34 * var35;
                    int var38 = var32 * var35 - var31 * var36;
                    int var39 = var31 * var34 - var32 * var33;
                    if (var29 * var39 + var23 * var37 + var26 * var38 > 0) {
                        field1903[var15] = true;
                        int var40 = (field1885[var16] + field1885[var17] + field1885[var18]) / 3 + this.field1873;
                        field1891[var40][field1890[var40]++] = var15;
                    }
                } else {
                    if (arg1) {
                        int var41 = field1866[var16];
                        int var42 = field1866[var17];
                        int var43 = field1866[var18];
                        int var44 = class133.field1920 + var6;
                        boolean var45;
                        if (var44 < var41 && var44 < var42 && var44 < var43) {
                            var45 = false;
                        } else {
                            int var46 = class133.field1920 - var6;
                            if (var46 > var41 && var46 > var42 && var46 > var43) {
                                var45 = false;
                            } else {
                                int var47 = class133.field1913 + var6;
                                if (var47 < var19 && var47 < var20 && var47 < var21) {
                                    var45 = false;
                                } else {
                                    int var48 = class133.field1913 - var6;
                                    if (var48 > var19 && var48 > var20 && var48 > var21) {
                                        var45 = false;
                                    } else {
                                        var45 = true;
                                    }
                                }
                            }
                        }
                        if (var45) {
                            class133.method1837(arg3);
                            arg1 = false;
                        }
                    }
                    if ((field1866[var18] - field1866[var17]) * (var19 - var20) - (field1866[var16] - field1866[var17]) * (var21 - var20) > 0) {
                        field1903[var15] = false;
                        if (var19 >= 0 && var20 >= 0 && var21 >= 0 && var19 <= Statics.field1949 && var20 <= Statics.field1949 && var21 <= Statics.field1949) {
                            field1881[var15] = false;
                        } else {
                            field1881[var15] = true;
                        }
                        int var49 = (field1885[var16] + field1885[var17] + field1885[var18]) / 3 + this.field1873;
                        field1891[var49][field1890[var49]++] = var15;
                    }
                }
            }
        }
        if (this.field1871 == null) {
            for (int var50 = this.field1872 - 1; var50 >= 0; var50--) {
                int var51 = field1890[var50];
                if (var51 > 0) {
                    int[] var52 = field1891[var50];
                    for (int var53 = 0; var53 < var51; var53++) {
                        this.method2469(var52[var53]);
                    }
                }
            }
            return;
        }
        for (int var54 = 0; var54 < 12; var54++) {
            field1904[var54] = 0;
            field1896[var54] = 0;
        }
        for (int var55 = this.field1872 - 1; var55 >= 0; var55--) {
            int var56 = field1890[var55];
            if (var56 > 0) {
                int[] var57 = field1891[var55];
                for (int var58 = 0; var58 < var56; var58++) {
                    int var59 = var57[var58];
                    byte var60 = this.field1871[var59];
                    int var61 = field1904[var60]++;
                    field1842[var60][var61] = var59;
                    if (var60 < 10) {
                        field1896[var60] += var55;
                    } else if (var60 == 10) {
                        field1843[var61] = var55;
                    } else {
                        field1895[var61] = var55;
                    }
                }
            }
        }
        int var62 = 0;
        if (field1904[1] > 0 || field1904[2] > 0) {
            var62 = (field1896[1] + field1896[2]) / (field1904[1] + field1904[2]);
        }
        int var63 = 0;
        if (field1904[3] > 0 || field1904[4] > 0) {
            var63 = (field1896[3] + field1896[4]) / (field1904[3] + field1904[4]);
        }
        int var64 = 0;
        if (field1904[6] > 0 || field1904[8] > 0) {
            var64 = (field1896[6] + field1896[8]) / (field1904[6] + field1904[8]);
        }
        int var65 = 0;
        int var66 = field1904[10];
        int[] var67 = field1842[10];
        int[] var68 = field1843;
        if (var65 == var66) {
            var65 = 0;
            var66 = field1904[11];
            var67 = field1842[11];
            var68 = field1895;
        }
        int var69;
        if (var65 < var66) {
            var69 = var68[var65];
        } else {
            var69 = -1000;
        }
        for (int var70 = 0; var70 < 10; var70++) {
            while (var70 == 0 && var69 > var62) {
                this.method2469(var67[var65++]);
                if (var65 == var66 && field1842[11] != var67) {
                    var65 = 0;
                    var66 = field1904[11];
                    var67 = field1842[11];
                    var68 = field1895;
                }
                if (var65 < var66) {
                    var69 = var68[var65];
                } else {
                    var69 = -1000;
                }
            }
            while (var70 == 3 && var69 > var63) {
                this.method2469(var67[var65++]);
                if (var65 == var66 && field1842[11] != var67) {
                    var65 = 0;
                    var66 = field1904[11];
                    var67 = field1842[11];
                    var68 = field1895;
                }
                if (var65 < var66) {
                    var69 = var68[var65];
                } else {
                    var69 = -1000;
                }
            }
            while (var70 == 5 && var69 > var64) {
                this.method2469(var67[var65++]);
                if (var65 == var66 && field1842[11] != var67) {
                    var65 = 0;
                    var66 = field1904[11];
                    var67 = field1842[11];
                    var68 = field1895;
                }
                if (var65 < var66) {
                    var69 = var68[var65];
                } else {
                    var69 = -1000;
                }
            }
            int var71 = field1904[var70];
            int[] var72 = field1842[var70];
            for (int var73 = 0; var73 < var71; var73++) {
                this.method2469(var72[var73]);
            }
        }
        while (var69 != -1000) {
            this.method2469(var67[var65++]);
            if (var65 == var66 && field1842[11] != var67) {
                var65 = 0;
                var67 = field1842[11];
                var66 = field1904[11];
                var68 = field1895;
            }
            if (var65 < var66) {
                var69 = var68[var65];
            } else {
                var69 = -1000;
            }
        }
    }

    @ObfuscatedName("ed.al(I)V")
    public final void method2469(int arg0) {
        if (field1903[arg0]) {
            this.method2553(arg0);
            return;
        }
        int var2 = this.field1899[arg0];
        int var3 = this.field1865[arg0];
        int var4 = this.field1853[arg0];
        class135.field1941 = field1881[arg0];
        if (this.field1858 == null) {
            class135.field1935 = 0;
        } else {
            class135.field1935 = this.field1858[arg0] & 0xFF;
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
                var8 = this.field1884[var5];
            }
            if (this.field1856[arg0] == -1) {
                class135.method2632(field1866[var2], field1866[var3], field1866[var4], field1883[var2], field1883[var3], field1883[var4], this.field1854[arg0], this.field1854[arg0], this.field1854[arg0], field1905[var6], field1905[var7], field1905[var8], field1887[var6], field1887[var7], field1887[var8], field1888[var6], field1888[var7], field1888[var8], this.field1860[arg0]);
            } else {
                class135.method2632(field1866[var2], field1866[var3], field1866[var4], field1883[var2], field1883[var3], field1883[var4], this.field1854[arg0], this.field1886[arg0], this.field1856[arg0], field1905[var6], field1905[var7], field1905[var8], field1887[var6], field1887[var7], field1887[var8], field1888[var6], field1888[var7], field1888[var8], this.field1860[arg0]);
            }
        } else if (this.field1856[arg0] == -1) {
            class135.method2591(field1866[var2], field1866[var3], field1866[var4], field1883[var2], field1883[var3], field1883[var4], field1852[this.field1854[arg0]]);
        } else {
            class135.method2589(field1866[var2], field1866[var3], field1866[var4], field1883[var2], field1883[var3], field1883[var4], this.field1854[arg0], this.field1886[arg0], this.field1856[arg0]);
        }
    }

    @ObfuscatedName("ed.ai(I)V")
    public final void method2553(int arg0) {
        int var2 = Statics.field1943;
        int var3 = Statics.field1944;
        int var4 = 0;
        int var5 = this.field1899[arg0];
        int var6 = this.field1865[arg0];
        int var7 = this.field1853[arg0];
        int var8 = field1888[var5];
        int var9 = field1888[var6];
        int var10 = field1888[var7];
        if (this.field1858 == null) {
            class135.field1935 = 0;
        } else {
            class135.field1935 = this.field1858[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1897[var4] = field1883[var5];
            field1898[var4] = field1866[var5];
            field1868[var4++] = this.field1854[arg0];
        } else {
            int var11 = field1905[var5];
            int var12 = field1887[var5];
            int var13 = this.field1854[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1855[var10 - var8];
                field1897[var4] = (((field1905[var7] - var11) * var14 >> 16) + var11) * class135.field1942 / 50 + var2;
                field1898[var4] = (((field1887[var7] - var12) * var14 >> 16) + var12) * class135.field1942 / 50 + var3;
                field1868[var4++] = ((this.field1856[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1855[var9 - var8];
                field1897[var4] = (((field1905[var6] - var11) * var15 >> 16) + var11) * class135.field1942 / 50 + var2;
                field1898[var4] = (((field1887[var6] - var12) * var15 >> 16) + var12) * class135.field1942 / 50 + var3;
                field1868[var4++] = ((this.field1886[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1897[var4] = field1883[var6];
            field1898[var4] = field1866[var6];
            field1868[var4++] = this.field1886[arg0];
        } else {
            int var16 = field1905[var6];
            int var17 = field1887[var6];
            int var18 = this.field1886[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1855[var8 - var9];
                field1897[var4] = (((field1905[var5] - var16) * var19 >> 16) + var16) * class135.field1942 / 50 + var2;
                field1898[var4] = (((field1887[var5] - var17) * var19 >> 16) + var17) * class135.field1942 / 50 + var3;
                field1868[var4++] = ((this.field1854[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1855[var10 - var9];
                field1897[var4] = (((field1905[var7] - var16) * var20 >> 16) + var16) * class135.field1942 / 50 + var2;
                field1898[var4] = (((field1887[var7] - var17) * var20 >> 16) + var17) * class135.field1942 / 50 + var3;
                field1868[var4++] = ((this.field1856[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1897[var4] = field1883[var7];
            field1898[var4] = field1866[var7];
            field1868[var4++] = this.field1856[arg0];
        } else {
            int var21 = field1905[var7];
            int var22 = field1887[var7];
            int var23 = this.field1856[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1855[var9 - var10];
                field1897[var4] = (((field1905[var6] - var21) * var24 >> 16) + var21) * class135.field1942 / 50 + var2;
                field1898[var4] = (((field1887[var6] - var22) * var24 >> 16) + var22) * class135.field1942 / 50 + var3;
                field1868[var4++] = ((this.field1886[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1855[var8 - var10];
                field1897[var4] = (((field1905[var5] - var21) * var25 >> 16) + var21) * class135.field1942 / 50 + var2;
                field1898[var4] = (((field1887[var5] - var22) * var25 >> 16) + var22) * class135.field1942 / 50 + var3;
                field1868[var4++] = ((this.field1854[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1897[0];
        int var27 = field1897[1];
        int var28 = field1897[2];
        int var29 = field1898[0];
        int var30 = field1898[1];
        int var31 = field1898[2];
        class135.field1941 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1949 || var27 > Statics.field1949 || var28 > Statics.field1949) {
                class135.field1941 = true;
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
                    var35 = this.field1884[var32];
                }
                if (this.field1856[arg0] == -1) {
                    class135.method2632(var29, var30, var31, var26, var27, var28, this.field1854[arg0], this.field1854[arg0], this.field1854[arg0], field1905[var33], field1905[var34], field1905[var35], field1887[var33], field1887[var34], field1887[var35], field1888[var33], field1888[var34], field1888[var35], this.field1860[arg0]);
                } else {
                    class135.method2632(var29, var30, var31, var26, var27, var28, field1868[0], field1868[1], field1868[2], field1905[var33], field1905[var34], field1905[var35], field1887[var33], field1887[var34], field1887[var35], field1888[var33], field1888[var34], field1888[var35], this.field1860[arg0]);
                }
            } else if (this.field1856[arg0] == -1) {
                class135.method2591(var29, var30, var31, var26, var27, var28, field1852[this.field1854[arg0]]);
            } else {
                class135.method2589(var29, var30, var31, var26, var27, var28, field1868[0], field1868[1], field1868[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1949 || var27 > Statics.field1949 || var28 > Statics.field1949 || field1897[3] < 0 || field1897[3] > Statics.field1949) {
            class135.field1941 = true;
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
                var39 = this.field1884[var36];
            }
            short var40 = this.field1860[arg0];
            if (this.field1856[arg0] == -1) {
                class135.method2632(var29, var30, var31, var26, var27, var28, this.field1854[arg0], this.field1854[arg0], this.field1854[arg0], field1905[var37], field1905[var38], field1905[var39], field1887[var37], field1887[var38], field1887[var39], field1888[var37], field1888[var38], field1888[var39], var40);
                class135.method2632(var29, var31, field1898[3], var26, var28, field1897[3], this.field1854[arg0], this.field1854[arg0], this.field1854[arg0], field1905[var37], field1905[var38], field1905[var39], field1887[var37], field1887[var38], field1887[var39], field1888[var37], field1888[var38], field1888[var39], var40);
            } else {
                class135.method2632(var29, var30, var31, var26, var27, var28, field1868[0], field1868[1], field1868[2], field1905[var37], field1905[var38], field1905[var39], field1887[var37], field1887[var38], field1887[var39], field1888[var37], field1888[var38], field1888[var39], var40);
                class135.method2632(var29, var31, field1898[3], var26, var28, field1897[3], field1868[0], field1868[2], field1868[3], field1905[var37], field1905[var38], field1905[var39], field1887[var37], field1887[var38], field1887[var39], field1888[var37], field1888[var38], field1888[var39], var40);
            }
        } else if (this.field1856[arg0] == -1) {
            int var41 = field1852[this.field1854[arg0]];
            class135.method2591(var29, var30, var31, var26, var27, var28, var41);
            class135.method2591(var29, var31, field1898[3], var26, var28, field1897[3], var41);
        } else {
            class135.method2589(var29, var30, var31, var26, var27, var28, field1868[0], field1868[1], field1868[2]);
            class135.method2589(var29, var31, field1898[3], var26, var28, field1897[3], field1868[0], field1868[2], field1868[3]);
        }
    }
}
