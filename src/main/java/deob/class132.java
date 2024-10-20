package deob;

@ObfuscatedName("ek")
public class class132 extends class140 {

    @ObfuscatedName("ek.t")
    public static class132 field1863 = new class132();

    @ObfuscatedName("ek.q")
    public static byte[] field1825 = new byte[1];

    @ObfuscatedName("ek.i")
    public static class132 field1826 = new class132();

    @ObfuscatedName("ek.a")
    public static byte[] field1827 = new byte[1];

    @ObfuscatedName("ek.l")
    public int field1828 = 0;

    @ObfuscatedName("ek.b")
    public int[] field1829;

    @ObfuscatedName("ek.e")
    public int[] field1830;

    @ObfuscatedName("ek.x")
    public int[] field1831;

    @ObfuscatedName("ek.p")
    public int field1871 = 0;

    @ObfuscatedName("ek.g")
    public int[] field1833;

    @ObfuscatedName("ek.n")
    public int[] field1879;

    @ObfuscatedName("ek.o")
    public int[] field1880;

    @ObfuscatedName("ek.c")
    public int[] field1857;

    @ObfuscatedName("ek.v")
    public int[] field1855;

    @ObfuscatedName("ek.u")
    public int[] field1824;

    @ObfuscatedName("ek.j")
    public byte[] field1839;

    @ObfuscatedName("ek.k")
    public byte[] field1883;

    @ObfuscatedName("ek.z")
    public byte[] field1841;

    @ObfuscatedName("ek.w")
    public short[] field1842;

    @ObfuscatedName("ek.s")
    public byte field1843 = 0;

    @ObfuscatedName("ek.d")
    public int field1853 = 0;

    @ObfuscatedName("ek.f")
    public int[] field1845;

    @ObfuscatedName("ek.r")
    public int[] field1866;

    @ObfuscatedName("ek.y")
    public int[] field1847;

    @ObfuscatedName("ek.h")
    public int[][] field1848;

    @ObfuscatedName("ek.m")
    public int[][] field1849;

    @ObfuscatedName("ek.ay")
    public boolean field1850 = false;

    @ObfuscatedName("ek.ao")
    public int field1851;

    @ObfuscatedName("ek.av")
    public int field1852;

    @ObfuscatedName("ek.aj")
    public int field1876;

    @ObfuscatedName("ek.ae")
    public int field1854;

    @ObfuscatedName("ek.am")
    public int field1834;

    @ObfuscatedName("ek.az")
    public int field1856;

    @ObfuscatedName("ek.ap")
    public int field1859;

    @ObfuscatedName("ek.ah")
    public int field1844;

    @ObfuscatedName("ek.au")
    public int field1835 = -1;

    @ObfuscatedName("ek.ax")
    public int field1860 = -1;

    @ObfuscatedName("ek.ar")
    public int field1861 = -1;

    @ObfuscatedName("ek.ai")
    public static boolean[] field1888 = new boolean[4700];

    @ObfuscatedName("ek.al")
    public static boolean[] field1886 = new boolean[4700];

    @ObfuscatedName("ek.at")
    public static int[] field1865 = new int[4700];

    @ObfuscatedName("ek.ag")
    public static int[] field1836 = new int[4700];

    @ObfuscatedName("ek.as")
    public static int[] field1867 = new int[4700];

    @ObfuscatedName("ek.aw")
    public static int[] field1868 = new int[4700];

    @ObfuscatedName("ek.aq")
    public static int[] field1840 = new int[4700];

    @ObfuscatedName("ek.aa")
    public static int[] field1870 = new int[4700];

    @ObfuscatedName("ek.ak")
    public static int[] field1872 = new int[1600];

    @ObfuscatedName("ek.ab")
    public static int[][] field1869 = new int[1600][512];

    @ObfuscatedName("ek.ac")
    public static int[] field1873 = new int[12];

    @ObfuscatedName("ek.ad")
    public static int[][] field1875 = new int[12][2000];

    @ObfuscatedName("ek.bg")
    public static int[] field1858 = new int[2000];

    @ObfuscatedName("ek.br")
    public static int[] field1864 = new int[2000];

    @ObfuscatedName("ek.ba")
    public static int[] field1878 = new int[12];

    @ObfuscatedName("ek.bk")
    public static int[] field1832 = new int[10];

    @ObfuscatedName("ek.be")
    public static int[] field1838 = new int[10];

    @ObfuscatedName("ek.bc")
    public static int[] field1881 = new int[10];

    @ObfuscatedName("ek.bj")
    public static boolean field1885 = true;

    @ObfuscatedName("ek.bn")
    public static int[] field1874 = class135.field1935;

    @ObfuscatedName("ek.bb")
    public static int[] field1889 = class135.field1936;

    @ObfuscatedName("ek.bq")
    public static int[] field1890 = class135.field1931;

    @ObfuscatedName("ek.bz")
    public static int[] field1891 = class135.field1934;

    public class132() {
    }

    public class132(class132[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1828 = 0;
        this.field1871 = 0;
        this.field1853 = 0;
        this.field1843 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class132 var8 = arg0[var7];
            if (var8 != null) {
                this.field1828 += var8.field1828;
                this.field1871 += var8.field1871;
                this.field1853 += var8.field1853;
                if (var8.field1839 == null) {
                    if (this.field1843 == -1) {
                        this.field1843 = var8.field1843;
                    }
                    if (this.field1843 != var8.field1843) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1883 != null;
                var5 |= var8.field1842 != null;
                var6 |= var8.field1841 != null;
            }
        }
        this.field1829 = new int[this.field1828];
        this.field1830 = new int[this.field1828];
        this.field1831 = new int[this.field1828];
        this.field1833 = new int[this.field1871];
        this.field1879 = new int[this.field1871];
        this.field1880 = new int[this.field1871];
        this.field1857 = new int[this.field1871];
        this.field1855 = new int[this.field1871];
        this.field1824 = new int[this.field1871];
        if (var3) {
            this.field1839 = new byte[this.field1871];
        }
        if (var4) {
            this.field1883 = new byte[this.field1871];
        }
        if (var5) {
            this.field1842 = new short[this.field1871];
        }
        if (var6) {
            this.field1841 = new byte[this.field1871];
        }
        if (this.field1853 > 0) {
            this.field1845 = new int[this.field1853];
            this.field1866 = new int[this.field1853];
            this.field1847 = new int[this.field1853];
        }
        this.field1828 = 0;
        this.field1871 = 0;
        this.field1853 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class132 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1871; var11++) {
                    this.field1833[this.field1871] = var10.field1833[var11] + this.field1828;
                    this.field1879[this.field1871] = var10.field1879[var11] + this.field1828;
                    this.field1880[this.field1871] = var10.field1880[var11] + this.field1828;
                    this.field1857[this.field1871] = var10.field1857[var11];
                    this.field1855[this.field1871] = var10.field1855[var11];
                    this.field1824[this.field1871] = var10.field1824[var11];
                    if (var3) {
                        if (var10.field1839 == null) {
                            this.field1839[this.field1871] = var10.field1843;
                        } else {
                            this.field1839[this.field1871] = var10.field1839[var11];
                        }
                    }
                    if (var4 && var10.field1883 != null) {
                        this.field1883[this.field1871] = var10.field1883[var11];
                    }
                    if (var5) {
                        if (var10.field1842 == null) {
                            this.field1842[this.field1871] = -1;
                        } else {
                            this.field1842[this.field1871] = var10.field1842[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1841 == null || var10.field1841[var11] == -1) {
                            this.field1841[this.field1871] = -1;
                        } else {
                            this.field1841[this.field1871] = (byte) (var10.field1841[var11] + this.field1853);
                        }
                    }
                    this.field1871++;
                }
                for (int var12 = 0; var12 < var10.field1853; var12++) {
                    this.field1845[this.field1853] = var10.field1845[var12] + this.field1828;
                    this.field1866[this.field1853] = var10.field1866[var12] + this.field1828;
                    this.field1847[this.field1853] = var10.field1847[var12] + this.field1828;
                    this.field1853++;
                }
                for (int var13 = 0; var13 < var10.field1828; var13++) {
                    this.field1829[this.field1828] = var10.field1829[var13];
                    this.field1830[this.field1828] = var10.field1830[var13];
                    this.field1831[this.field1828] = var10.field1831[var13];
                    this.field1828++;
                }
            }
        }
    }

    @ObfuscatedName("ek.t([[IIIIZI)Lek;")
    public class132 method2465(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2485();
        int var7 = arg1 - this.field1876;
        int var8 = this.field1876 + arg1;
        int var9 = arg3 - this.field1876;
        int var10 = this.field1876 + arg3;
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
            var15.field1828 = this.field1828;
            var15.field1871 = this.field1871;
            var15.field1853 = this.field1853;
            var15.field1829 = this.field1829;
            var15.field1831 = this.field1831;
            var15.field1833 = this.field1833;
            var15.field1879 = this.field1879;
            var15.field1880 = this.field1880;
            var15.field1857 = this.field1857;
            var15.field1855 = this.field1855;
            var15.field1824 = this.field1824;
            var15.field1839 = this.field1839;
            var15.field1883 = this.field1883;
            var15.field1841 = this.field1841;
            var15.field1842 = this.field1842;
            var15.field1843 = this.field1843;
            var15.field1845 = this.field1845;
            var15.field1866 = this.field1866;
            var15.field1847 = this.field1847;
            var15.field1848 = this.field1848;
            var15.field1849 = this.field1849;
            var15.field1850 = this.field1850;
            var15.field1830 = new int[var15.field1828];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1828; var16++) {
                int var17 = this.field1829[var16] + arg1;
                int var18 = this.field1831[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1830[var16] = this.field1830[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1828; var26++) {
                int var27 = (-this.field1830[var26] << 16) / this.field2020;
                if (var27 < arg5) {
                    int var28 = this.field1829[var26] + arg1;
                    int var29 = this.field1831[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1830[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1830[var26];
                }
            }
        }
        var15.method2534();
        return var15;
    }

    @ObfuscatedName("ek.q(Z)Lek;")
    public class132 method2466(boolean arg0) {
        if (!arg0 && field1825.length < this.field1871) {
            field1825 = new byte[this.field1871 + 100];
        }
        return this.method2481(arg0, field1863, field1825);
    }

    @ObfuscatedName("ek.i(Z)Lek;")
    public class132 method2477(boolean arg0) {
        if (!arg0 && field1827.length < this.field1871) {
            field1827 = new byte[this.field1871 + 100];
        }
        return this.method2481(arg0, field1826, field1827);
    }

    @ObfuscatedName("ek.a(ZLek;[B)Lek;")
    public class132 method2481(boolean arg0, class132 arg1, byte[] arg2) {
        arg1.field1828 = this.field1828;
        arg1.field1871 = this.field1871;
        arg1.field1853 = this.field1853;
        if (arg1.field1829 == null || arg1.field1829.length < this.field1828) {
            arg1.field1829 = new int[this.field1828 + 100];
            arg1.field1830 = new int[this.field1828 + 100];
            arg1.field1831 = new int[this.field1828 + 100];
        }
        for (int var4 = 0; var4 < this.field1828; var4++) {
            arg1.field1829[var4] = this.field1829[var4];
            arg1.field1830[var4] = this.field1830[var4];
            arg1.field1831[var4] = this.field1831[var4];
        }
        if (arg0) {
            arg1.field1883 = this.field1883;
        } else {
            arg1.field1883 = arg2;
            if (this.field1883 == null) {
                for (int var5 = 0; var5 < this.field1871; var5++) {
                    arg1.field1883[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1871; var6++) {
                    arg1.field1883[var6] = this.field1883[var6];
                }
            }
        }
        arg1.field1833 = this.field1833;
        arg1.field1879 = this.field1879;
        arg1.field1880 = this.field1880;
        arg1.field1857 = this.field1857;
        arg1.field1855 = this.field1855;
        arg1.field1824 = this.field1824;
        arg1.field1839 = this.field1839;
        arg1.field1841 = this.field1841;
        arg1.field1842 = this.field1842;
        arg1.field1843 = this.field1843;
        arg1.field1845 = this.field1845;
        arg1.field1866 = this.field1866;
        arg1.field1847 = this.field1847;
        arg1.field1848 = this.field1848;
        arg1.field1849 = this.field1849;
        arg1.field1850 = this.field1850;
        arg1.method2534();
        return arg1;
    }

    @ObfuscatedName("ek.l(I)V")
    public void method2539(int arg0) {
        if (this.field1835 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1889[arg0];
        int var9 = field1874[arg0];
        for (int var10 = 0; var10 < this.field1828; var10++) {
            int var11 = class135.method2575(this.field1829[var10], this.field1831[var10], var8, var9);
            int var12 = this.field1830[var10];
            int var13 = class135.method2595(this.field1829[var10], this.field1831[var10], var8, var9);
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
        this.field1856 = (var2 + var5) / 2;
        this.field1859 = (var3 + var6) / 2;
        this.field1844 = (var4 + var7) / 2;
        this.field1835 = (var5 - var2 + 1) / 2;
        this.field1860 = (var6 - var3 + 1) / 2;
        this.field1861 = (var7 - var4 + 1) / 2;
        if (this.field1835 < 32) {
            this.field1835 = 32;
        }
        if (this.field1861 < 32) {
            this.field1861 = 32;
        }
        if (this.field1850) {
            this.field1835 += 8;
            this.field1861 += 8;
        }
    }

    @ObfuscatedName("ek.b()V")
    public void method2485() {
        if (this.field1851 == 1) {
            return;
        }
        this.field1851 = 1;
        this.field2020 = 0;
        this.field1852 = 0;
        this.field1876 = 0;
        for (int var1 = 0; var1 < this.field1828; var1++) {
            int var2 = this.field1829[var1];
            int var3 = this.field1830[var1];
            int var4 = this.field1831[var1];
            if (-var3 > this.field2020) {
                this.field2020 = -var3;
            }
            if (var3 > this.field1852) {
                this.field1852 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1876) {
                this.field1876 = var5;
            }
        }
        this.field1876 = (int) (Math.sqrt((double) this.field1876) + 0.99D);
        this.field1834 = (int) (Math.sqrt((double) (this.field2020 * this.field2020 + this.field1876 * this.field1876)) + 0.99D);
        this.field1854 = this.field1834 + (int) (Math.sqrt((double) (this.field1876 * this.field1876 + this.field1852 * this.field1852)) + 0.99D);
    }

    @ObfuscatedName("ek.e()V")
    public void method2471() {
        if (this.field1851 == 2) {
            return;
        }
        this.field1851 = 2;
        this.field1876 = 0;
        for (int var1 = 0; var1 < this.field1828; var1++) {
            int var2 = this.field1829[var1];
            int var3 = this.field1830[var1];
            int var4 = this.field1831[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1876) {
                this.field1876 = var5;
            }
        }
        this.field1876 = (int) (Math.sqrt((double) this.field1876) + 0.99D);
        this.field1834 = this.field1876;
        this.field1854 = this.field1876 + this.field1876;
    }

    @ObfuscatedName("ek.x()I")
    public int method2472() {
        this.method2485();
        return this.field1876;
    }

    @ObfuscatedName("ek.o()V")
    public void method2534() {
        this.field1851 = 0;
        this.field1835 = -1;
    }

    @ObfuscatedName("ek.c(Let;I)V")
    public void method2526(class143 arg0, int arg1) {
        if (this.field1848 == null || arg1 == -1) {
            return;
        }
        class130 var3 = arg0.field2040[arg1];
        class137 var4 = var3.field1793;
        Statics.field1882 = 0;
        Statics.field1846 = 0;
        Statics.field1884 = 0;
        for (int var5 = 0; var5 < var3.field1794; var5++) {
            int var6 = var3.field1791[var5];
            this.method2475(var4.field1950[var6], var4.field1951[var6], var3.field1789[var5], var3.field1797[var5], var3.field1798[var5]);
        }
        this.method2534();
    }

    @ObfuscatedName("ek.u(Let;ILet;I[I)V")
    public void method2492(class143 arg0, int arg1, class143 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2526(arg0, arg1);
            return;
        }
        class130 var6 = arg0.field2040[arg1];
        class130 var7 = arg2.field2040[arg3];
        class137 var8 = var6.field1793;
        Statics.field1882 = 0;
        Statics.field1846 = 0;
        Statics.field1884 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1794; var11++) {
            int var12 = var6.field1791[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1950[var12] == 0) {
                this.method2475(var8.field1950[var12], var8.field1951[var12], var6.field1789[var11], var6.field1797[var11], var6.field1798[var11]);
            }
        }
        Statics.field1882 = 0;
        Statics.field1846 = 0;
        Statics.field1884 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1794; var15++) {
            int var16 = var7.field1791[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1950[var16] == 0) {
                this.method2475(var8.field1950[var16], var8.field1951[var16], var7.field1789[var15], var7.field1797[var15], var7.field1798[var15]);
            }
        }
        this.method2534();
    }

    @ObfuscatedName("ek.k(I[IIII)V")
    public void method2475(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1882 = 0;
            Statics.field1846 = 0;
            Statics.field1884 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1848.length) {
                    int[] var10 = this.field1848[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1882 += this.field1829[var12];
                        Statics.field1846 += this.field1830[var12];
                        Statics.field1884 += this.field1831[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1882 = Statics.field1882 / var7 + arg2;
                Statics.field1846 = Statics.field1846 / var7 + arg3;
                Statics.field1884 = Statics.field1884 / var7 + arg4;
            } else {
                Statics.field1882 = arg2;
                Statics.field1846 = arg3;
                Statics.field1884 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1848.length) {
                    int[] var15 = this.field1848[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1829[var17] += arg2;
                        this.field1830[var17] += arg3;
                        this.field1831[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1848.length) {
                    int[] var20 = this.field1848[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1829[var22] -= Statics.field1882;
                        this.field1830[var22] -= Statics.field1846;
                        this.field1831[var22] -= Statics.field1884;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1874[var25];
                            int var27 = field1889[var25];
                            int var28 = this.field1830[var22] * var26 + this.field1829[var22] * var27 >> 16;
                            this.field1830[var22] = this.field1830[var22] * var27 - this.field1829[var22] * var26 >> 16;
                            this.field1829[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1874[var23];
                            int var30 = field1889[var23];
                            int var31 = this.field1830[var22] * var30 - this.field1831[var22] * var29 >> 16;
                            this.field1831[var22] = this.field1831[var22] * var30 + this.field1830[var22] * var29 >> 16;
                            this.field1830[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1874[var24];
                            int var33 = field1889[var24];
                            int var34 = this.field1831[var22] * var32 + this.field1829[var22] * var33 >> 16;
                            this.field1831[var22] = this.field1831[var22] * var33 - this.field1829[var22] * var32 >> 16;
                            this.field1829[var22] = var34;
                        }
                        this.field1829[var22] += Statics.field1882;
                        this.field1830[var22] += Statics.field1846;
                        this.field1831[var22] += Statics.field1884;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1848.length) {
                    int[] var37 = this.field1848[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1829[var39] -= Statics.field1882;
                        this.field1830[var39] -= Statics.field1846;
                        this.field1831[var39] -= Statics.field1884;
                        this.field1829[var39] = this.field1829[var39] * arg2 / 128;
                        this.field1830[var39] = this.field1830[var39] * arg3 / 128;
                        this.field1831[var39] = this.field1831[var39] * arg4 / 128;
                        this.field1829[var39] += Statics.field1882;
                        this.field1830[var39] += Statics.field1846;
                        this.field1831[var39] += Statics.field1884;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1849 != null && this.field1883 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1849.length) {
                    int[] var42 = this.field1849[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1883[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1883[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ek.z()V")
    public void method2476() {
        for (int var1 = 0; var1 < this.field1828; var1++) {
            int var2 = this.field1829[var1];
            this.field1829[var1] = this.field1831[var1];
            this.field1831[var1] = -var2;
        }
        this.method2534();
    }

    @ObfuscatedName("ek.w()V")
    public void method2530() {
        for (int var1 = 0; var1 < this.field1828; var1++) {
            this.field1829[var1] = -this.field1829[var1];
            this.field1831[var1] = -this.field1831[var1];
        }
        this.method2534();
    }

    @ObfuscatedName("ek.s()V")
    public void method2498() {
        for (int var1 = 0; var1 < this.field1828; var1++) {
            int var2 = this.field1831[var1];
            this.field1831[var1] = this.field1829[var1];
            this.field1829[var1] = -var2;
        }
        this.method2534();
    }

    @ObfuscatedName("ek.d(I)V")
    public void method2479(int arg0) {
        int var2 = field1874[arg0];
        int var3 = field1889[arg0];
        for (int var4 = 0; var4 < this.field1828; var4++) {
            int var5 = this.field1830[var4] * var3 - this.field1831[var4] * var2 >> 16;
            this.field1831[var4] = this.field1831[var4] * var3 + this.field1830[var4] * var2 >> 16;
            this.field1830[var4] = var5;
        }
        this.method2534();
    }

    @ObfuscatedName("ek.f(III)V")
    public void method2469(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1828; var4++) {
            this.field1829[var4] += arg0;
            this.field1830[var4] += arg1;
            this.field1831[var4] += arg2;
        }
        this.method2534();
    }

    @ObfuscatedName("ek.r(III)V")
    public void method2513(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1828; var4++) {
            this.field1829[var4] = this.field1829[var4] * arg0 / 128;
            this.field1830[var4] = this.field1830[var4] * arg1 / 128;
            this.field1831[var4] = this.field1831[var4] * arg2 / 128;
        }
        this.method2534();
    }

    @ObfuscatedName("ek.y(IIIIIII)V")
    public final void method2482(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1872[0] = -1;
        if (this.field1851 != 2 && this.field1851 != 1) {
            this.method2471();
        }
        int var8 = Statics.field1921;
        int var9 = Statics.field1911;
        int var10 = field1874[arg0];
        int var11 = field1889[arg0];
        int var12 = field1874[arg1];
        int var13 = field1889[arg1];
        int var14 = field1874[arg2];
        int var15 = field1889[arg2];
        int var16 = field1874[arg3];
        int var17 = field1889[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1828; var19++) {
            int var20 = this.field1829[var19];
            int var21 = this.field1830[var19];
            int var22 = this.field1831[var19];
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
            field1867[var19] = var30 - var18;
            field1865[var19] = class135.field1930 * var26 / var30 + var8;
            field1836[var19] = class135.field1930 * var29 / var30 + var9;
            if (this.field1853 > 0) {
                field1868[var19] = var26;
                field1840[var19] = var29;
                field1870[var19] = var30;
            }
        }
        try {
            this.method2467(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ek.h(IIIIIIII)V")
    public final void method2483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1872[0] = -1;
        if (this.field1851 != 2 && this.field1851 != 1) {
            this.method2471();
        }
        int var9 = Statics.field1921;
        int var10 = Statics.field1911;
        int var11 = field1874[arg0];
        int var12 = field1889[arg0];
        int var13 = field1874[arg1];
        int var14 = field1889[arg1];
        int var15 = field1874[arg2];
        int var16 = field1889[arg2];
        int var17 = field1874[arg3];
        int var18 = field1889[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1828; var20++) {
            int var21 = this.field1829[var20];
            int var22 = this.field1830[var20];
            int var23 = this.field1831[var20];
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
            field1867[var20] = var31 - var19;
            field1865[var20] = class135.field1930 * var27 / arg7 + var9;
            field1836[var20] = class135.field1930 * var30 / arg7 + var10;
            if (this.field1853 > 0) {
                field1868[var20] = var27;
                field1840[var20] = var30;
                field1870[var20] = var31;
            }
        }
        try {
            this.method2467(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ek.cd(IIIIIIIII)V")
    public void method2484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1872[0] = -1;
        if (this.field1851 != 1) {
            this.method2485();
        }
        this.method2539(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1876 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1876) * class135.field1930;
        if (var15 / var13 >= Statics.field1927) {
            return;
        }
        int var16 = (this.field1876 + var14) * class135.field1930;
        if (var16 / var13 <= Statics.field1926) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1876 * arg1 >> 16;
        int var19 = (var17 + var18) * class135.field1930;
        if (var19 / var13 <= Statics.field1928) {
            return;
        }
        int var20 = (this.field2020 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class135.field1930;
        if (var21 / var13 >= Statics.field1913) {
            return;
        }
        int var22 = (this.field2020 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1853 > 0;
        int var26 = class133.field1895;
        int var28 = class133.field1896;
        boolean var30 = class133.field1899;
        if (class8.field227 && arg8 > 0) {
            class8.method2959(this, arg5, arg6, arg7);
        }
        if (class8.field223 && arg8 > 0) {
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
            int var42 = var26 - Statics.field1921;
            int var43 = var28 - Statics.field1911;
            if (var42 > var37 && var42 < var38 && var43 > var39 && var43 < var40) {
                var41 = -256;
            }
            class8.method65(Statics.field1921 + var37, Statics.field1911 + var39, Statics.field1921 + var38, Statics.field1911 + var40, var41);
        }
        boolean var44 = false;
        if (arg8 > 0 && var30) {
            boolean var45 = false;
            if (field1885) {
                var45 = class133.method1086(this, arg5, arg6, arg7);
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
                int var51 = var26 - Statics.field1921;
                int var52 = var28 - Statics.field1911;
                if (var51 > var47 && var51 < var48 && var52 > var49 && var52 < var50) {
                    var45 = true;
                }
            }
            if (var45) {
                if (this.field1850) {
                    class133.method43(arg8);
                } else {
                    var44 = true;
                }
            }
        }
        int var53 = Statics.field1921;
        int var54 = Statics.field1911;
        int var55 = 0;
        int var56 = 0;
        if (arg0 != 0) {
            var55 = field1874[arg0];
            var56 = field1889[arg0];
        }
        for (int var57 = 0; var57 < this.field1828; var57++) {
            int var58 = this.field1829[var57];
            int var59 = this.field1830[var57];
            int var60 = this.field1831[var57];
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
            field1867[var57] = var69 - var11;
            if (var69 >= 50) {
                field1865[var57] = class135.field1930 * var65 / var69 + var53;
                field1836[var57] = class135.field1930 * var68 / var69 + var54;
            } else {
                field1865[var57] = -5000;
                var23 = true;
            }
            if (var25) {
                field1868[var57] = var65;
                field1840[var57] = var68;
                field1870[var57] = var69;
            }
        }
        try {
            this.method2467(var23, var44, this.field1850, arg8);
        } catch (Exception var72) {
        }
    }

    @ObfuscatedName("ek.av(ZZZI)V")
    public final void method2467(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1854 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1854; var5++) {
            field1872[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field228 && arg1) {
            class132 var7 = this;
            for (int var8 = 0; var8 < var7.field1871; var8++) {
                if (var7.field1824[var8] != -2) {
                    int var9 = var7.field1833[var8];
                    int var10 = var7.field1879[var8];
                    int var11 = var7.field1880[var8];
                    int var12 = field1865[var9];
                    int var13 = field1865[var10];
                    int var14 = field1865[var11];
                    int var15 = field1836[var9];
                    int var16 = field1836[var10];
                    int var17 = field1836[var11];
                    int var18 = Math.min(var12, Math.min(var13, var14)) - var6;
                    int var19 = Math.max(var12, Math.max(var13, var14)) + var6;
                    int var20 = Math.min(var15, Math.min(var16, var17)) - var6;
                    int var21 = Math.max(var15, Math.max(var16, var17)) + var6;
                    class8.method65(var18, var20, var19, var21, -49088);
                }
            }
        }
        for (int var22 = 0; var22 < this.field1871; var22++) {
            if (this.field1824[var22] != -2) {
                int var23 = this.field1833[var22];
                int var24 = this.field1879[var22];
                int var25 = this.field1880[var22];
                int var26 = field1865[var23];
                int var27 = field1865[var24];
                int var28 = field1865[var25];
                if (arg0 && var26 == -5000 || var27 == -5000 || var28 == -5000) {
                    int var29 = field1868[var23];
                    int var30 = field1868[var24];
                    int var31 = field1868[var25];
                    int var32 = field1840[var23];
                    int var33 = field1840[var24];
                    int var34 = field1840[var25];
                    int var35 = field1870[var23];
                    int var36 = field1870[var24];
                    int var37 = field1870[var25];
                    int var38 = var29 - var30;
                    int var39 = var31 - var30;
                    int var40 = var32 - var33;
                    int var41 = var34 - var33;
                    int var42 = var35 - var36;
                    int var43 = var37 - var36;
                    int var44 = var40 * var43 - var41 * var42;
                    int var45 = var39 * var42 - var38 * var43;
                    int var46 = var38 * var41 - var39 * var40;
                    if (var36 * var46 + var30 * var44 + var33 * var45 > 0) {
                        field1886[var22] = true;
                        int var47 = (field1867[var23] + field1867[var24] + field1867[var25]) / 3 + this.field1834;
                        field1869[var47][field1872[var47]++] = var22;
                    }
                } else {
                    if (arg1) {
                        int var48 = field1836[var23];
                        int var49 = field1836[var24];
                        int var50 = field1836[var25];
                        int var51 = class133.field1896 + var6;
                        boolean var52;
                        if (var51 < var48 && var51 < var49 && var51 < var50) {
                            var52 = false;
                        } else {
                            int var53 = class133.field1896 - var6;
                            if (var53 > var48 && var53 > var49 && var53 > var50) {
                                var52 = false;
                            } else {
                                int var54 = class133.field1895 + var6;
                                if (var54 < var26 && var54 < var27 && var54 < var28) {
                                    var52 = false;
                                } else {
                                    int var55 = class133.field1895 - var6;
                                    if (var55 > var26 && var55 > var27 && var55 > var28) {
                                        var52 = false;
                                    } else {
                                        var52 = true;
                                    }
                                }
                            }
                        }
                        if (var52) {
                            class133.method43(arg3);
                            arg1 = false;
                        }
                    }
                    if ((field1836[var25] - field1836[var24]) * (var26 - var27) - (field1836[var23] - field1836[var24]) * (var28 - var27) > 0) {
                        field1886[var22] = false;
                        if (var26 >= 0 && var27 >= 0 && var28 >= 0 && var26 <= Statics.field1924 && var27 <= Statics.field1924 && var28 <= Statics.field1924) {
                            field1888[var22] = false;
                        } else {
                            field1888[var22] = true;
                        }
                        int var56 = (field1867[var23] + field1867[var24] + field1867[var25]) / 3 + this.field1834;
                        field1869[var56][field1872[var56]++] = var22;
                    }
                }
            }
        }
        if (this.field1839 == null) {
            for (int var57 = this.field1854 - 1; var57 >= 0; var57--) {
                int var58 = field1872[var57];
                if (var58 > 0) {
                    int[] var59 = field1869[var57];
                    for (int var60 = 0; var60 < var58; var60++) {
                        this.method2486(var59[var60]);
                    }
                }
            }
            return;
        }
        for (int var61 = 0; var61 < 12; var61++) {
            field1873[var61] = 0;
            field1878[var61] = 0;
        }
        for (int var62 = this.field1854 - 1; var62 >= 0; var62--) {
            int var63 = field1872[var62];
            if (var63 > 0) {
                int[] var64 = field1869[var62];
                for (int var65 = 0; var65 < var63; var65++) {
                    int var66 = var64[var65];
                    byte var67 = this.field1839[var66];
                    int var68 = field1873[var67]++;
                    field1875[var67][var68] = var66;
                    if (var67 < 10) {
                        field1878[var67] += var62;
                    } else if (var67 == 10) {
                        field1858[var68] = var62;
                    } else {
                        field1864[var68] = var62;
                    }
                }
            }
        }
        int var69 = 0;
        if (field1873[1] > 0 || field1873[2] > 0) {
            var69 = (field1878[1] + field1878[2]) / (field1873[1] + field1873[2]);
        }
        int var70 = 0;
        if (field1873[3] > 0 || field1873[4] > 0) {
            var70 = (field1878[3] + field1878[4]) / (field1873[3] + field1873[4]);
        }
        int var71 = 0;
        if (field1873[6] > 0 || field1873[8] > 0) {
            var71 = (field1878[6] + field1878[8]) / (field1873[6] + field1873[8]);
        }
        int var72 = 0;
        int var73 = field1873[10];
        int[] var74 = field1875[10];
        int[] var75 = field1858;
        if (var72 == var73) {
            var72 = 0;
            var73 = field1873[11];
            var74 = field1875[11];
            var75 = field1864;
        }
        int var76;
        if (var72 < var73) {
            var76 = var75[var72];
        } else {
            var76 = -1000;
        }
        for (int var77 = 0; var77 < 10; var77++) {
            while (var77 == 0 && var76 > var69) {
                this.method2486(var74[var72++]);
                if (var72 == var73 && field1875[11] != var74) {
                    var72 = 0;
                    var73 = field1873[11];
                    var74 = field1875[11];
                    var75 = field1864;
                }
                if (var72 < var73) {
                    var76 = var75[var72];
                } else {
                    var76 = -1000;
                }
            }
            while (var77 == 3 && var76 > var70) {
                this.method2486(var74[var72++]);
                if (var72 == var73 && field1875[11] != var74) {
                    var72 = 0;
                    var73 = field1873[11];
                    var74 = field1875[11];
                    var75 = field1864;
                }
                if (var72 < var73) {
                    var76 = var75[var72];
                } else {
                    var76 = -1000;
                }
            }
            while (var77 == 5 && var76 > var71) {
                this.method2486(var74[var72++]);
                if (var72 == var73 && field1875[11] != var74) {
                    var72 = 0;
                    var73 = field1873[11];
                    var74 = field1875[11];
                    var75 = field1864;
                }
                if (var72 < var73) {
                    var76 = var75[var72];
                } else {
                    var76 = -1000;
                }
            }
            int var78 = field1873[var77];
            int[] var79 = field1875[var77];
            for (int var80 = 0; var80 < var78; var80++) {
                this.method2486(var79[var80]);
            }
        }
        while (var76 != -1000) {
            this.method2486(var74[var72++]);
            if (var72 == var73 && field1875[11] != var74) {
                var72 = 0;
                var74 = field1875[11];
                var73 = field1873[11];
                var75 = field1864;
            }
            if (var72 < var73) {
                var76 = var75[var72];
            } else {
                var76 = -1000;
            }
        }
    }

    @ObfuscatedName("ek.aj(I)V")
    public final void method2486(int arg0) {
        if (field1886[arg0]) {
            this.method2487(arg0);
            return;
        }
        int var2 = this.field1833[arg0];
        int var3 = this.field1879[arg0];
        int var4 = this.field1880[arg0];
        class135.field1914 = field1888[arg0];
        if (this.field1883 == null) {
            class135.field1925 = 0;
        } else {
            class135.field1925 = this.field1883[arg0] & 0xFF;
        }
        if (this.field1842 != null && this.field1842[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1841 == null || this.field1841[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1841[arg0] & 0xFF;
                var6 = this.field1845[var5];
                var7 = this.field1866[var5];
                var8 = this.field1847[var5];
            }
            if (this.field1824[arg0] == -1) {
                class135.method2570(field1836[var2], field1836[var3], field1836[var4], field1865[var2], field1865[var3], field1865[var4], this.field1857[arg0], this.field1857[arg0], this.field1857[arg0], field1868[var6], field1868[var7], field1868[var8], field1840[var6], field1840[var7], field1840[var8], field1870[var6], field1870[var7], field1870[var8], this.field1842[arg0]);
            } else {
                class135.method2570(field1836[var2], field1836[var3], field1836[var4], field1865[var2], field1865[var3], field1865[var4], this.field1857[arg0], this.field1855[arg0], this.field1824[arg0], field1868[var6], field1868[var7], field1868[var8], field1840[var6], field1840[var7], field1840[var8], field1870[var6], field1870[var7], field1870[var8], this.field1842[arg0]);
            }
        } else if (this.field1824[arg0] == -1) {
            class135.method2640(field1836[var2], field1836[var3], field1836[var4], field1865[var2], field1865[var3], field1865[var4], field1890[this.field1857[arg0]]);
        } else {
            class135.method2566(field1836[var2], field1836[var3], field1836[var4], field1865[var2], field1865[var3], field1865[var4], this.field1857[arg0], this.field1855[arg0], this.field1824[arg0]);
        }
    }

    @ObfuscatedName("ek.ae(I)V")
    public final void method2487(int arg0) {
        int var2 = Statics.field1921;
        int var3 = Statics.field1911;
        int var4 = 0;
        int var5 = this.field1833[arg0];
        int var6 = this.field1879[arg0];
        int var7 = this.field1880[arg0];
        int var8 = field1870[var5];
        int var9 = field1870[var6];
        int var10 = field1870[var7];
        if (this.field1883 == null) {
            class135.field1925 = 0;
        } else {
            class135.field1925 = this.field1883[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1832[var4] = field1865[var5];
            field1838[var4] = field1836[var5];
            field1881[var4++] = this.field1857[arg0];
        } else {
            int var11 = field1868[var5];
            int var12 = field1840[var5];
            int var13 = this.field1857[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1891[var10 - var8];
                field1832[var4] = (((field1868[var7] - var11) * var14 >> 16) + var11) * class135.field1930 / 50 + var2;
                field1838[var4] = (((field1840[var7] - var12) * var14 >> 16) + var12) * class135.field1930 / 50 + var3;
                field1881[var4++] = ((this.field1824[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1891[var9 - var8];
                field1832[var4] = (((field1868[var6] - var11) * var15 >> 16) + var11) * class135.field1930 / 50 + var2;
                field1838[var4] = (((field1840[var6] - var12) * var15 >> 16) + var12) * class135.field1930 / 50 + var3;
                field1881[var4++] = ((this.field1855[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1832[var4] = field1865[var6];
            field1838[var4] = field1836[var6];
            field1881[var4++] = this.field1855[arg0];
        } else {
            int var16 = field1868[var6];
            int var17 = field1840[var6];
            int var18 = this.field1855[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1891[var8 - var9];
                field1832[var4] = (((field1868[var5] - var16) * var19 >> 16) + var16) * class135.field1930 / 50 + var2;
                field1838[var4] = (((field1840[var5] - var17) * var19 >> 16) + var17) * class135.field1930 / 50 + var3;
                field1881[var4++] = ((this.field1857[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1891[var10 - var9];
                field1832[var4] = (((field1868[var7] - var16) * var20 >> 16) + var16) * class135.field1930 / 50 + var2;
                field1838[var4] = (((field1840[var7] - var17) * var20 >> 16) + var17) * class135.field1930 / 50 + var3;
                field1881[var4++] = ((this.field1824[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1832[var4] = field1865[var7];
            field1838[var4] = field1836[var7];
            field1881[var4++] = this.field1824[arg0];
        } else {
            int var21 = field1868[var7];
            int var22 = field1840[var7];
            int var23 = this.field1824[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1891[var9 - var10];
                field1832[var4] = (((field1868[var6] - var21) * var24 >> 16) + var21) * class135.field1930 / 50 + var2;
                field1838[var4] = (((field1840[var6] - var22) * var24 >> 16) + var22) * class135.field1930 / 50 + var3;
                field1881[var4++] = ((this.field1855[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1891[var8 - var10];
                field1832[var4] = (((field1868[var5] - var21) * var25 >> 16) + var21) * class135.field1930 / 50 + var2;
                field1838[var4] = (((field1840[var5] - var22) * var25 >> 16) + var22) * class135.field1930 / 50 + var3;
                field1881[var4++] = ((this.field1857[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1832[0];
        int var27 = field1832[1];
        int var28 = field1832[2];
        int var29 = field1838[0];
        int var30 = field1838[1];
        int var31 = field1838[2];
        class135.field1914 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1924 || var27 > Statics.field1924 || var28 > Statics.field1924) {
                class135.field1914 = true;
            }
            if (this.field1842 != null && this.field1842[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1841 == null || this.field1841[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1841[arg0] & 0xFF;
                    var33 = this.field1845[var32];
                    var34 = this.field1866[var32];
                    var35 = this.field1847[var32];
                }
                if (this.field1824[arg0] == -1) {
                    class135.method2570(var29, var30, var31, var26, var27, var28, this.field1857[arg0], this.field1857[arg0], this.field1857[arg0], field1868[var33], field1868[var34], field1868[var35], field1840[var33], field1840[var34], field1840[var35], field1870[var33], field1870[var34], field1870[var35], this.field1842[arg0]);
                } else {
                    class135.method2570(var29, var30, var31, var26, var27, var28, field1881[0], field1881[1], field1881[2], field1868[var33], field1868[var34], field1868[var35], field1840[var33], field1840[var34], field1840[var35], field1870[var33], field1870[var34], field1870[var35], this.field1842[arg0]);
                }
            } else if (this.field1824[arg0] == -1) {
                class135.method2640(var29, var30, var31, var26, var27, var28, field1890[this.field1857[arg0]]);
            } else {
                class135.method2566(var29, var30, var31, var26, var27, var28, field1881[0], field1881[1], field1881[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1924 || var27 > Statics.field1924 || var28 > Statics.field1924 || field1832[3] < 0 || field1832[3] > Statics.field1924) {
            class135.field1914 = true;
        }
        if (this.field1842 != null && this.field1842[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1841 == null || this.field1841[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1841[arg0] & 0xFF;
                var37 = this.field1845[var36];
                var38 = this.field1866[var36];
                var39 = this.field1847[var36];
            }
            short var40 = this.field1842[arg0];
            if (this.field1824[arg0] == -1) {
                class135.method2570(var29, var30, var31, var26, var27, var28, this.field1857[arg0], this.field1857[arg0], this.field1857[arg0], field1868[var37], field1868[var38], field1868[var39], field1840[var37], field1840[var38], field1840[var39], field1870[var37], field1870[var38], field1870[var39], var40);
                class135.method2570(var29, var31, field1838[3], var26, var28, field1832[3], this.field1857[arg0], this.field1857[arg0], this.field1857[arg0], field1868[var37], field1868[var38], field1868[var39], field1840[var37], field1840[var38], field1840[var39], field1870[var37], field1870[var38], field1870[var39], var40);
            } else {
                class135.method2570(var29, var30, var31, var26, var27, var28, field1881[0], field1881[1], field1881[2], field1868[var37], field1868[var38], field1868[var39], field1840[var37], field1840[var38], field1840[var39], field1870[var37], field1870[var38], field1870[var39], var40);
                class135.method2570(var29, var31, field1838[3], var26, var28, field1832[3], field1881[0], field1881[2], field1881[3], field1868[var37], field1868[var38], field1868[var39], field1840[var37], field1840[var38], field1840[var39], field1870[var37], field1870[var38], field1870[var39], var40);
            }
        } else if (this.field1824[arg0] == -1) {
            int var41 = field1890[this.field1857[arg0]];
            class135.method2640(var29, var30, var31, var26, var27, var28, var41);
            class135.method2640(var29, var31, field1838[3], var26, var28, field1832[3], var41);
        } else {
            class135.method2566(var29, var30, var31, var26, var27, var28, field1881[0], field1881[1], field1881[2]);
            class135.method2566(var29, var31, field1838[3], var26, var28, field1832[3], field1881[0], field1881[2], field1881[3]);
        }
    }
}
