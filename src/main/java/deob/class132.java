package deob;

@ObfuscatedName("ee")
public class class132 extends class140 {

    @ObfuscatedName("ee.g")
    public static class132 field1851 = new class132();

    @ObfuscatedName("ee.e")
    public static byte[] field1855 = new byte[1];

    @ObfuscatedName("ee.b")
    public static class132 field1867 = new class132();

    @ObfuscatedName("ee.z")
    public static byte[] field1825 = new byte[1];

    @ObfuscatedName("ee.n")
    public int field1824 = 0;

    @ObfuscatedName("ee.l")
    public int[] field1827;

    @ObfuscatedName("ee.s")
    public int[] field1828;

    @ObfuscatedName("ee.y")
    public int[] field1829;

    @ObfuscatedName("ee.c")
    public int field1866 = 0;

    @ObfuscatedName("ee.h")
    public int[] field1880;

    @ObfuscatedName("ee.i")
    public int[] field1832;

    @ObfuscatedName("ee.o")
    public int[] field1833;

    @ObfuscatedName("ee.d")
    public int[] field1834;

    @ObfuscatedName("ee.r")
    public int[] field1852;

    @ObfuscatedName("ee.p")
    public int[] field1836;

    @ObfuscatedName("ee.q")
    public byte[] field1837;

    @ObfuscatedName("ee.f")
    public byte[] field1838;

    @ObfuscatedName("ee.j")
    public byte[] field1839;

    @ObfuscatedName("ee.v")
    public short[] field1840;

    @ObfuscatedName("ee.u")
    public byte field1877 = 0;

    @ObfuscatedName("ee.k")
    public int field1842 = 0;

    @ObfuscatedName("ee.w")
    public int[] field1843;

    @ObfuscatedName("ee.m")
    public int[] field1844;

    @ObfuscatedName("ee.a")
    public int[] field1845;

    @ObfuscatedName("ee.x")
    public int[][] field1846;

    @ObfuscatedName("ee.t")
    public int[][] field1847;

    @ObfuscatedName("ee.ax")
    public boolean field1848 = false;

    @ObfuscatedName("ee.ai")
    public int field1872;

    @ObfuscatedName("ee.aj")
    public int field1850;

    @ObfuscatedName("ee.ac")
    public int field1865;

    @ObfuscatedName("ee.ag")
    public int field1874;

    @ObfuscatedName("ee.ay")
    public int field1888;

    @ObfuscatedName("ee.as")
    public int field1854;

    @ObfuscatedName("ee.av")
    public int field1831;

    @ObfuscatedName("ee.ao")
    public int field1856;

    @ObfuscatedName("ee.ak")
    public int field1857 = -1;

    @ObfuscatedName("ee.ad")
    public int field1858 = -1;

    @ObfuscatedName("ee.az")
    public int field1885 = -1;

    @ObfuscatedName("ee.ab")
    public static boolean[] field1835 = new boolean[4700];

    @ObfuscatedName("ee.al")
    public static boolean[] field1862 = new boolean[4700];

    @ObfuscatedName("ee.af")
    public static int[] field1863 = new int[4700];

    @ObfuscatedName("ee.ah")
    public static int[] field1864 = new int[4700];

    @ObfuscatedName("ee.au")
    public static int[] field1853 = new int[4700];

    @ObfuscatedName("ee.ap")
    public static int[] field1823 = new int[4700];

    @ObfuscatedName("ee.at")
    public static int[] field1841 = new int[4700];

    @ObfuscatedName("ee.am")
    public static int[] field1868 = new int[4700];

    @ObfuscatedName("ee.ae")
    public static int[] field1870 = new int[1600];

    @ObfuscatedName("ee.aw")
    public static int[][] field1830 = new int[1600][512];

    @ObfuscatedName("ee.ar")
    public static int[] field1826 = new int[12];

    @ObfuscatedName("ee.aq")
    public static int[][] field1873 = new int[12][2000];

    @ObfuscatedName("ee.bq")
    public static int[] field1822 = new int[2000];

    @ObfuscatedName("ee.bi")
    public static int[] field1875 = new int[2000];

    @ObfuscatedName("ee.bo")
    public static int[] field1859 = new int[12];

    @ObfuscatedName("ee.bj")
    public static int[] field1861 = new int[10];

    @ObfuscatedName("ee.bw")
    public static int[] field1878 = new int[10];

    @ObfuscatedName("ee.bp")
    public static int[] field1879 = new int[10];

    @ObfuscatedName("ee.bb")
    public static boolean field1883 = true;

    @ObfuscatedName("ee.br")
    public static int[] field1886 = class135.field1939;

    @ObfuscatedName("ee.bc")
    public static int[] field1887 = class135.field1921;

    @ObfuscatedName("ee.bf")
    public static int[] field1849 = class135.field1940;

    @ObfuscatedName("ee.bt")
    public static int[] field1889 = class135.field1938;

    public class132() {
    }

    public class132(class132[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1824 = 0;
        this.field1866 = 0;
        this.field1842 = 0;
        this.field1877 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class132 var8 = arg0[var7];
            if (var8 != null) {
                this.field1824 += var8.field1824;
                this.field1866 += var8.field1866;
                this.field1842 += var8.field1842;
                if (var8.field1837 == null) {
                    if (this.field1877 == -1) {
                        this.field1877 = var8.field1877;
                    }
                    if (this.field1877 != var8.field1877) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1838 != null;
                var5 |= var8.field1840 != null;
                var6 |= var8.field1839 != null;
            }
        }
        this.field1827 = new int[this.field1824];
        this.field1828 = new int[this.field1824];
        this.field1829 = new int[this.field1824];
        this.field1880 = new int[this.field1866];
        this.field1832 = new int[this.field1866];
        this.field1833 = new int[this.field1866];
        this.field1834 = new int[this.field1866];
        this.field1852 = new int[this.field1866];
        this.field1836 = new int[this.field1866];
        if (var3) {
            this.field1837 = new byte[this.field1866];
        }
        if (var4) {
            this.field1838 = new byte[this.field1866];
        }
        if (var5) {
            this.field1840 = new short[this.field1866];
        }
        if (var6) {
            this.field1839 = new byte[this.field1866];
        }
        if (this.field1842 > 0) {
            this.field1843 = new int[this.field1842];
            this.field1844 = new int[this.field1842];
            this.field1845 = new int[this.field1842];
        }
        this.field1824 = 0;
        this.field1866 = 0;
        this.field1842 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class132 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1866; var11++) {
                    this.field1880[this.field1866] = var10.field1880[var11] + this.field1824;
                    this.field1832[this.field1866] = var10.field1832[var11] + this.field1824;
                    this.field1833[this.field1866] = var10.field1833[var11] + this.field1824;
                    this.field1834[this.field1866] = var10.field1834[var11];
                    this.field1852[this.field1866] = var10.field1852[var11];
                    this.field1836[this.field1866] = var10.field1836[var11];
                    if (var3) {
                        if (var10.field1837 == null) {
                            this.field1837[this.field1866] = var10.field1877;
                        } else {
                            this.field1837[this.field1866] = var10.field1837[var11];
                        }
                    }
                    if (var4 && var10.field1838 != null) {
                        this.field1838[this.field1866] = var10.field1838[var11];
                    }
                    if (var5) {
                        if (var10.field1840 == null) {
                            this.field1840[this.field1866] = -1;
                        } else {
                            this.field1840[this.field1866] = var10.field1840[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1839 == null || var10.field1839[var11] == -1) {
                            this.field1839[this.field1866] = -1;
                        } else {
                            this.field1839[this.field1866] = (byte) (var10.field1839[var11] + this.field1842);
                        }
                    }
                    this.field1866++;
                }
                for (int var12 = 0; var12 < var10.field1842; var12++) {
                    this.field1843[this.field1842] = var10.field1843[var12] + this.field1824;
                    this.field1844[this.field1842] = var10.field1844[var12] + this.field1824;
                    this.field1845[this.field1842] = var10.field1845[var12] + this.field1824;
                    this.field1842++;
                }
                for (int var13 = 0; var13 < var10.field1824; var13++) {
                    this.field1827[this.field1824] = var10.field1827[var13];
                    this.field1828[this.field1824] = var10.field1828[var13];
                    this.field1829[this.field1824] = var10.field1829[var13];
                    this.field1824++;
                }
            }
        }
    }

    @ObfuscatedName("ee.g([[IIIIZI)Lee;")
    public class132 method2576(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2581();
        int var7 = arg1 - this.field1865;
        int var8 = this.field1865 + arg1;
        int var9 = arg3 - this.field1865;
        int var10 = this.field1865 + arg3;
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
            var15.field1824 = this.field1824;
            var15.field1866 = this.field1866;
            var15.field1842 = this.field1842;
            var15.field1827 = this.field1827;
            var15.field1829 = this.field1829;
            var15.field1880 = this.field1880;
            var15.field1832 = this.field1832;
            var15.field1833 = this.field1833;
            var15.field1834 = this.field1834;
            var15.field1852 = this.field1852;
            var15.field1836 = this.field1836;
            var15.field1837 = this.field1837;
            var15.field1838 = this.field1838;
            var15.field1839 = this.field1839;
            var15.field1840 = this.field1840;
            var15.field1877 = this.field1877;
            var15.field1843 = this.field1843;
            var15.field1844 = this.field1844;
            var15.field1845 = this.field1845;
            var15.field1846 = this.field1846;
            var15.field1847 = this.field1847;
            var15.field1848 = this.field1848;
            var15.field1828 = new int[var15.field1824];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1824; var16++) {
                int var17 = this.field1827[var16] + arg1;
                int var18 = this.field1829[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1828[var16] = this.field1828[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1824; var26++) {
                int var27 = (-this.field1828[var26] << 16) / this.field2025;
                if (var27 < arg5) {
                    int var28 = this.field1827[var26] + arg1;
                    int var29 = this.field1829[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1828[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1828[var26];
                }
            }
        }
        var15.method2642();
        return var15;
    }

    @ObfuscatedName("ee.e(Z)Lee;")
    public class132 method2577(boolean arg0) {
        if (!arg0 && field1855.length < this.field1866) {
            field1855 = new byte[this.field1866 + 100];
        }
        return this.method2579(arg0, field1851, field1855);
    }

    @ObfuscatedName("ee.b(Z)Lee;")
    public class132 method2578(boolean arg0) {
        if (!arg0 && field1825.length < this.field1866) {
            field1825 = new byte[this.field1866 + 100];
        }
        return this.method2579(arg0, field1867, field1825);
    }

    @ObfuscatedName("ee.z(ZLee;[B)Lee;")
    public class132 method2579(boolean arg0, class132 arg1, byte[] arg2) {
        arg1.field1824 = this.field1824;
        arg1.field1866 = this.field1866;
        arg1.field1842 = this.field1842;
        if (arg1.field1827 == null || arg1.field1827.length < this.field1824) {
            arg1.field1827 = new int[this.field1824 + 100];
            arg1.field1828 = new int[this.field1824 + 100];
            arg1.field1829 = new int[this.field1824 + 100];
        }
        for (int var4 = 0; var4 < this.field1824; var4++) {
            arg1.field1827[var4] = this.field1827[var4];
            arg1.field1828[var4] = this.field1828[var4];
            arg1.field1829[var4] = this.field1829[var4];
        }
        if (arg0) {
            arg1.field1838 = this.field1838;
        } else {
            arg1.field1838 = arg2;
            if (this.field1838 == null) {
                for (int var5 = 0; var5 < this.field1866; var5++) {
                    arg1.field1838[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1866; var6++) {
                    arg1.field1838[var6] = this.field1838[var6];
                }
            }
        }
        arg1.field1880 = this.field1880;
        arg1.field1832 = this.field1832;
        arg1.field1833 = this.field1833;
        arg1.field1834 = this.field1834;
        arg1.field1852 = this.field1852;
        arg1.field1836 = this.field1836;
        arg1.field1837 = this.field1837;
        arg1.field1839 = this.field1839;
        arg1.field1840 = this.field1840;
        arg1.field1877 = this.field1877;
        arg1.field1843 = this.field1843;
        arg1.field1844 = this.field1844;
        arg1.field1845 = this.field1845;
        arg1.field1846 = this.field1846;
        arg1.field1847 = this.field1847;
        arg1.field1848 = this.field1848;
        arg1.method2642();
        return arg1;
    }

    @ObfuscatedName("ee.n(I)V")
    public void method2634(int arg0) {
        if (this.field1857 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1887[arg0];
        int var9 = field1886[arg0];
        for (int var10 = 0; var10 < this.field1824; var10++) {
            int var11 = class135.method2689(this.field1827[var10], this.field1829[var10], var8, var9);
            int var12 = this.field1828[var10];
            int var13 = class135.method2690(this.field1827[var10], this.field1829[var10], var8, var9);
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
        this.field1854 = (var2 + var5) / 2;
        this.field1831 = (var3 + var6) / 2;
        this.field1856 = (var4 + var7) / 2;
        this.field1857 = (var5 - var2 + 1) / 2;
        this.field1858 = (var6 - var3 + 1) / 2;
        this.field1885 = (var7 - var4 + 1) / 2;
        if (this.field1857 < 32) {
            this.field1857 = 32;
        }
        if (this.field1885 < 32) {
            this.field1885 = 32;
        }
        if (this.field1848) {
            this.field1857 += 8;
            this.field1885 += 8;
        }
    }

    @ObfuscatedName("ee.l()V")
    public void method2581() {
        if (this.field1872 == 1) {
            return;
        }
        this.field1872 = 1;
        this.field2025 = 0;
        this.field1850 = 0;
        this.field1865 = 0;
        for (int var1 = 0; var1 < this.field1824; var1++) {
            int var2 = this.field1827[var1];
            int var3 = this.field1828[var1];
            int var4 = this.field1829[var1];
            if (-var3 > this.field2025) {
                this.field2025 = -var3;
            }
            if (var3 > this.field1850) {
                this.field1850 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1865) {
                this.field1865 = var5;
            }
        }
        this.field1865 = (int) (Math.sqrt((double) this.field1865) + 0.99D);
        this.field1888 = (int) (Math.sqrt((double) (this.field2025 * this.field2025 + this.field1865 * this.field1865)) + 0.99D);
        this.field1874 = this.field1888 + (int) (Math.sqrt((double) (this.field1865 * this.field1865 + this.field1850 * this.field1850)) + 0.99D);
    }

    @ObfuscatedName("ee.s()V")
    public void method2582() {
        if (this.field1872 == 2) {
            return;
        }
        this.field1872 = 2;
        this.field1865 = 0;
        for (int var1 = 0; var1 < this.field1824; var1++) {
            int var2 = this.field1827[var1];
            int var3 = this.field1828[var1];
            int var4 = this.field1829[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1865) {
                this.field1865 = var5;
            }
        }
        this.field1865 = (int) (Math.sqrt((double) this.field1865) + 0.99D);
        this.field1888 = this.field1865;
        this.field1874 = this.field1865 + this.field1865;
    }

    @ObfuscatedName("ee.y()I")
    public int method2583() {
        this.method2581();
        return this.field1865;
    }

    @ObfuscatedName("ee.o()V")
    public void method2642() {
        this.field1872 = 0;
        this.field1857 = -1;
    }

    @ObfuscatedName("ee.d(Leu;I)V")
    public void method2585(class143 arg0, int arg1) {
        if (this.field1846 == null || arg1 == -1) {
            return;
        }
        class130 var3 = arg0.field2044[arg1];
        class137 var4 = var3.field1788;
        Statics.field1876 = 0;
        Statics.field1881 = 0;
        Statics.field1882 = 0;
        for (int var5 = 0; var5 < var3.field1792; var5++) {
            int var6 = var3.field1793[var5];
            this.method2587(var4.field1953[var6], var4.field1954[var6], var3.field1787[var5], var3.field1795[var5], var3.field1796[var5]);
        }
        this.method2642();
    }

    @ObfuscatedName("ee.r(Leu;ILeu;I[I)V")
    public void method2629(class143 arg0, int arg1, class143 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2585(arg0, arg1);
            return;
        }
        class130 var6 = arg0.field2044[arg1];
        class130 var7 = arg2.field2044[arg3];
        class137 var8 = var6.field1788;
        Statics.field1876 = 0;
        Statics.field1881 = 0;
        Statics.field1882 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1792; var11++) {
            int var12 = var6.field1793[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1953[var12] == 0) {
                this.method2587(var8.field1953[var12], var8.field1954[var12], var6.field1787[var11], var6.field1795[var11], var6.field1796[var11]);
            }
        }
        Statics.field1876 = 0;
        Statics.field1881 = 0;
        Statics.field1882 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1792; var15++) {
            int var16 = var7.field1793[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1953[var16] == 0) {
                this.method2587(var8.field1953[var16], var8.field1954[var16], var7.field1787[var15], var7.field1795[var15], var7.field1796[var15]);
            }
        }
        this.method2642();
    }

    @ObfuscatedName("ee.p(I[IIII)V")
    public void method2587(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1876 = 0;
            Statics.field1881 = 0;
            Statics.field1882 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1846.length) {
                    int[] var10 = this.field1846[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1876 += this.field1827[var12];
                        Statics.field1881 += this.field1828[var12];
                        Statics.field1882 += this.field1829[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1876 = Statics.field1876 / var7 + arg2;
                Statics.field1881 = Statics.field1881 / var7 + arg3;
                Statics.field1882 = Statics.field1882 / var7 + arg4;
            } else {
                Statics.field1876 = arg2;
                Statics.field1881 = arg3;
                Statics.field1882 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1846.length) {
                    int[] var15 = this.field1846[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1827[var17] += arg2;
                        this.field1828[var17] += arg3;
                        this.field1829[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1846.length) {
                    int[] var20 = this.field1846[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1827[var22] -= Statics.field1876;
                        this.field1828[var22] -= Statics.field1881;
                        this.field1829[var22] -= Statics.field1882;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1886[var25];
                            int var27 = field1887[var25];
                            int var28 = this.field1828[var22] * var26 + this.field1827[var22] * var27 >> 16;
                            this.field1828[var22] = this.field1828[var22] * var27 - this.field1827[var22] * var26 >> 16;
                            this.field1827[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1886[var23];
                            int var30 = field1887[var23];
                            int var31 = this.field1828[var22] * var30 - this.field1829[var22] * var29 >> 16;
                            this.field1829[var22] = this.field1829[var22] * var30 + this.field1828[var22] * var29 >> 16;
                            this.field1828[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1886[var24];
                            int var33 = field1887[var24];
                            int var34 = this.field1829[var22] * var32 + this.field1827[var22] * var33 >> 16;
                            this.field1829[var22] = this.field1829[var22] * var33 - this.field1827[var22] * var32 >> 16;
                            this.field1827[var22] = var34;
                        }
                        this.field1827[var22] += Statics.field1876;
                        this.field1828[var22] += Statics.field1881;
                        this.field1829[var22] += Statics.field1882;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1846.length) {
                    int[] var37 = this.field1846[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1827[var39] -= Statics.field1876;
                        this.field1828[var39] -= Statics.field1881;
                        this.field1829[var39] -= Statics.field1882;
                        this.field1827[var39] = this.field1827[var39] * arg2 / 128;
                        this.field1828[var39] = this.field1828[var39] * arg3 / 128;
                        this.field1829[var39] = this.field1829[var39] * arg4 / 128;
                        this.field1827[var39] += Statics.field1876;
                        this.field1828[var39] += Statics.field1881;
                        this.field1829[var39] += Statics.field1882;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1847 != null && this.field1838 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1847.length) {
                    int[] var42 = this.field1847[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1838[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1838[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ee.q()V")
    public void method2588() {
        for (int var1 = 0; var1 < this.field1824; var1++) {
            int var2 = this.field1827[var1];
            this.field1827[var1] = this.field1829[var1];
            this.field1829[var1] = -var2;
        }
        this.method2642();
    }

    @ObfuscatedName("ee.f()V")
    public void method2589() {
        for (int var1 = 0; var1 < this.field1824; var1++) {
            this.field1827[var1] = -this.field1827[var1];
            this.field1829[var1] = -this.field1829[var1];
        }
        this.method2642();
    }

    @ObfuscatedName("ee.j()V")
    public void method2597() {
        for (int var1 = 0; var1 < this.field1824; var1++) {
            int var2 = this.field1829[var1];
            this.field1829[var1] = this.field1827[var1];
            this.field1827[var1] = -var2;
        }
        this.method2642();
    }

    @ObfuscatedName("ee.v(I)V")
    public void method2612(int arg0) {
        int var2 = field1886[arg0];
        int var3 = field1887[arg0];
        for (int var4 = 0; var4 < this.field1824; var4++) {
            int var5 = this.field1828[var4] * var3 - this.field1829[var4] * var2 >> 16;
            this.field1829[var4] = this.field1829[var4] * var3 + this.field1828[var4] * var2 >> 16;
            this.field1828[var4] = var5;
        }
        this.method2642();
    }

    @ObfuscatedName("ee.u(III)V")
    public void method2648(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1824; var4++) {
            this.field1827[var4] += arg0;
            this.field1828[var4] += arg1;
            this.field1829[var4] += arg2;
        }
        this.method2642();
    }

    @ObfuscatedName("ee.k(III)V")
    public void method2592(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1824; var4++) {
            this.field1827[var4] = this.field1827[var4] * arg0 / 128;
            this.field1828[var4] = this.field1828[var4] * arg1 / 128;
            this.field1829[var4] = this.field1829[var4] * arg2 / 128;
        }
        this.method2642();
    }

    @ObfuscatedName("ee.w(IIIIIII)V")
    public final void method2575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1870[0] = -1;
        if (this.field1872 != 2 && this.field1872 != 1) {
            this.method2582();
        }
        int var8 = Statics.field1935;
        int var9 = Statics.field1927;
        int var10 = field1886[arg0];
        int var11 = field1887[arg0];
        int var12 = field1886[arg1];
        int var13 = field1887[arg1];
        int var14 = field1886[arg2];
        int var15 = field1887[arg2];
        int var16 = field1886[arg3];
        int var17 = field1887[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1824; var19++) {
            int var20 = this.field1827[var19];
            int var21 = this.field1828[var19];
            int var22 = this.field1829[var19];
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
            field1853[var19] = var30 - var18;
            field1863[var19] = class135.field1926 * var26 / var30 + var8;
            field1864[var19] = class135.field1926 * var29 / var30 + var9;
            if (this.field1842 > 0) {
                field1823[var19] = var26;
                field1841[var19] = var29;
                field1868[var19] = var30;
            }
        }
        try {
            this.method2596(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ee.x(IIIIIIII)V")
    public final void method2625(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1870[0] = -1;
        if (this.field1872 != 2 && this.field1872 != 1) {
            this.method2582();
        }
        int var9 = Statics.field1935;
        int var10 = Statics.field1927;
        int var11 = field1886[arg0];
        int var12 = field1887[arg0];
        int var13 = field1886[arg1];
        int var14 = field1887[arg1];
        int var15 = field1886[arg2];
        int var16 = field1887[arg2];
        int var17 = field1886[arg3];
        int var18 = field1887[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1824; var20++) {
            int var21 = this.field1827[var20];
            int var22 = this.field1828[var20];
            int var23 = this.field1829[var20];
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
            field1853[var20] = var31 - var19;
            field1863[var20] = class135.field1926 * var27 / arg7 + var9;
            field1864[var20] = class135.field1926 * var30 / arg7 + var10;
            if (this.field1842 > 0) {
                field1823[var20] = var27;
                field1841[var20] = var30;
                field1868[var20] = var31;
            }
        }
        try {
            this.method2596(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ee.cf(IIIIIIIII)V")
    public void method2595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1870[0] = -1;
        if (this.field1872 != 1) {
            this.method2581();
        }
        this.method2634(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1865 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1865) * class135.field1926;
        if (var15 / var13 >= Statics.field1919) {
            return;
        }
        int var16 = (this.field1865 + var14) * class135.field1926;
        if (var16 / var13 <= Statics.field1930) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1865 * arg1 >> 16;
        int var19 = (var17 + var18) * class135.field1926;
        if (var19 / var13 <= Statics.field1918) {
            return;
        }
        int var20 = (this.field2025 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class135.field1926;
        if (var21 / var13 >= Statics.field1933) {
            return;
        }
        int var22 = (this.field2025 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1842 > 0;
        int var26 = class133.method956();
        int var27 = class133.field1894;
        boolean var29 = class133.field1903;
        if (class8.field230 && arg8 > 0) {
            if (class133.method1842(this, arg5, arg6, arg7)) {
                class8.field231.method3757(new class11(this, arg5, arg6, arg7, -65281));
            } else if (class8.field227 == class12.field270) {
                class8.field231.method3757(new class11(this, arg5, arg6, arg7, -16776961));
            }
        }
        if (class8.field228 && arg8 > 0) {
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
            int var42 = var26 - Statics.field1935;
            int var43 = var27 - Statics.field1927;
            if (var42 > var37 && var42 < var38 && var43 > var39 && var43 < var40) {
                var41 = -256;
            }
            int var44 = Statics.field1935 + var37;
            int var45 = Statics.field1927 + var39;
            int var46 = Statics.field1935 + var38;
            int var47 = Statics.field1927 + var40;
            class8.field231.method3757(new class9(var44, var45, var46, var47, var41));
        }
        boolean var48 = false;
        if (arg8 > 0 && var29) {
            boolean var49 = false;
            if (field1883) {
                var49 = class133.method1842(this, arg5, arg6, arg7);
            } else {
                int var50 = var11 - var12;
                if (var50 <= 50) {
                    var50 = 50;
                }
                int var51;
                int var52;
                if (var14 > 0) {
                    var51 = var15 / var13;
                    var52 = var16 / var50;
                } else {
                    var52 = var16 / var13;
                    var51 = var15 / var50;
                }
                int var53;
                int var54;
                if (var17 > 0) {
                    var53 = var21 / var13;
                    var54 = var19 / var50;
                } else {
                    var54 = var19 / var13;
                    var53 = var21 / var50;
                }
                int var55 = var26 - Statics.field1935;
                int var56 = var27 - Statics.field1927;
                if (var55 > var51 && var55 < var52 && var56 > var53 && var56 < var54) {
                    var49 = true;
                }
            }
            if (var49) {
                if (this.field1848) {
                    class133.field1902[++class133.field1901 - 1] = arg8;
                } else {
                    var48 = true;
                }
            }
        }
        int var58 = Statics.field1935;
        int var59 = Statics.field1927;
        int var60 = 0;
        int var61 = 0;
        if (arg0 != 0) {
            var60 = field1886[arg0];
            var61 = field1887[arg0];
        }
        for (int var62 = 0; var62 < this.field1824; var62++) {
            int var63 = this.field1827[var62];
            int var64 = this.field1828[var62];
            int var65 = this.field1829[var62];
            if (arg0 != 0) {
                int var66 = var60 * var65 + var61 * var63 >> 16;
                var65 = var61 * var65 - var60 * var63 >> 16;
                var63 = var66;
            }
            int var67 = arg5 + var63;
            int var68 = arg6 + var64;
            int var69 = arg7 + var65;
            int var70 = arg3 * var69 + arg4 * var67 >> 16;
            int var71 = arg4 * var69 - arg3 * var67 >> 16;
            int var73 = arg2 * var68 - arg1 * var71 >> 16;
            int var74 = arg1 * var68 + arg2 * var71 >> 16;
            field1853[var62] = var74 - var11;
            if (var74 >= 50) {
                field1863[var62] = class135.field1926 * var70 / var74 + var58;
                field1864[var62] = class135.field1926 * var73 / var74 + var59;
            } else {
                field1863[var62] = -5000;
                var23 = true;
            }
            if (var25) {
                field1823[var62] = var70;
                field1841[var62] = var73;
                field1868[var62] = var74;
            }
        }
        try {
            this.method2596(var23, var48, this.field1848, arg8);
        } catch (Exception var77) {
        }
    }

    @ObfuscatedName("ee.t(ZZZI)V")
    public final void method2596(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1874 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1874; var5++) {
            field1870[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field229 && arg1) {
            class8.method4615(this, var6);
        }
        for (int var7 = 0; var7 < this.field1866; var7++) {
            if (this.field1836[var7] != -2) {
                int var8 = this.field1880[var7];
                int var9 = this.field1832[var7];
                int var10 = this.field1833[var7];
                int var11 = field1863[var8];
                int var12 = field1863[var9];
                int var13 = field1863[var10];
                if (arg0 && var11 == -5000 || var12 == -5000 || var13 == -5000) {
                    int var14 = field1823[var8];
                    int var15 = field1823[var9];
                    int var16 = field1823[var10];
                    int var17 = field1841[var8];
                    int var18 = field1841[var9];
                    int var19 = field1841[var10];
                    int var20 = field1868[var8];
                    int var21 = field1868[var9];
                    int var22 = field1868[var10];
                    int var23 = var14 - var15;
                    int var24 = var16 - var15;
                    int var25 = var17 - var18;
                    int var26 = var19 - var18;
                    int var27 = var20 - var21;
                    int var28 = var22 - var21;
                    int var29 = var25 * var28 - var26 * var27;
                    int var30 = var24 * var27 - var23 * var28;
                    int var31 = var23 * var26 - var24 * var25;
                    if (var21 * var31 + var15 * var29 + var18 * var30 > 0) {
                        field1862[var7] = true;
                        int var32 = (field1853[var8] + field1853[var9] + field1853[var10]) / 3 + this.field1888;
                        field1830[var32][field1870[var32]++] = var7;
                    }
                } else {
                    if (arg1) {
                        int var33 = field1864[var8];
                        int var34 = field1864[var9];
                        int var35 = field1864[var10];
                        int var36 = class133.field1894 + var6;
                        boolean var37;
                        if (var36 < var33 && var36 < var34 && var36 < var35) {
                            var37 = false;
                        } else {
                            int var38 = class133.field1894 - var6;
                            if (var38 > var33 && var38 > var34 && var38 > var35) {
                                var37 = false;
                            } else {
                                int var39 = class133.field1899 + var6;
                                if (var39 < var11 && var39 < var12 && var39 < var13) {
                                    var37 = false;
                                } else {
                                    int var40 = class133.field1899 - var6;
                                    if (var40 > var11 && var40 > var12 && var40 > var13) {
                                        var37 = false;
                                    } else {
                                        var37 = true;
                                    }
                                }
                            }
                        }
                        if (var37) {
                            class133.field1902[++class133.field1901 - 1] = arg3;
                            arg1 = false;
                        }
                    }
                    if ((field1864[var10] - field1864[var9]) * (var11 - var12) - (field1864[var8] - field1864[var9]) * (var13 - var12) > 0) {
                        field1862[var7] = false;
                        if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= Statics.field1928 && var12 <= Statics.field1928 && var13 <= Statics.field1928) {
                            field1835[var7] = false;
                        } else {
                            field1835[var7] = true;
                        }
                        int var42 = (field1853[var8] + field1853[var9] + field1853[var10]) / 3 + this.field1888;
                        field1830[var42][field1870[var42]++] = var7;
                    }
                }
            }
        }
        if (this.field1837 == null) {
            for (int var43 = this.field1874 - 1; var43 >= 0; var43--) {
                int var44 = field1870[var43];
                if (var44 > 0) {
                    int[] var45 = field1830[var43];
                    for (int var46 = 0; var46 < var44; var46++) {
                        this.method2590(var45[var46]);
                    }
                }
            }
            return;
        }
        for (int var47 = 0; var47 < 12; var47++) {
            field1826[var47] = 0;
            field1859[var47] = 0;
        }
        for (int var48 = this.field1874 - 1; var48 >= 0; var48--) {
            int var49 = field1870[var48];
            if (var49 > 0) {
                int[] var50 = field1830[var48];
                for (int var51 = 0; var51 < var49; var51++) {
                    int var52 = var50[var51];
                    byte var53 = this.field1837[var52];
                    int var54 = field1826[var53]++;
                    field1873[var53][var54] = var52;
                    if (var53 < 10) {
                        field1859[var53] += var48;
                    } else if (var53 == 10) {
                        field1822[var54] = var48;
                    } else {
                        field1875[var54] = var48;
                    }
                }
            }
        }
        int var55 = 0;
        if (field1826[1] > 0 || field1826[2] > 0) {
            var55 = (field1859[1] + field1859[2]) / (field1826[1] + field1826[2]);
        }
        int var56 = 0;
        if (field1826[3] > 0 || field1826[4] > 0) {
            var56 = (field1859[3] + field1859[4]) / (field1826[3] + field1826[4]);
        }
        int var57 = 0;
        if (field1826[6] > 0 || field1826[8] > 0) {
            var57 = (field1859[6] + field1859[8]) / (field1826[6] + field1826[8]);
        }
        int var58 = 0;
        int var59 = field1826[10];
        int[] var60 = field1873[10];
        int[] var61 = field1822;
        if (var58 == var59) {
            var58 = 0;
            var59 = field1826[11];
            var60 = field1873[11];
            var61 = field1875;
        }
        int var62;
        if (var58 < var59) {
            var62 = var61[var58];
        } else {
            var62 = -1000;
        }
        for (int var63 = 0; var63 < 10; var63++) {
            while (var63 == 0 && var62 > var55) {
                this.method2590(var60[var58++]);
                if (var58 == var59 && field1873[11] != var60) {
                    var58 = 0;
                    var59 = field1826[11];
                    var60 = field1873[11];
                    var61 = field1875;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            while (var63 == 3 && var62 > var56) {
                this.method2590(var60[var58++]);
                if (var58 == var59 && field1873[11] != var60) {
                    var58 = 0;
                    var59 = field1826[11];
                    var60 = field1873[11];
                    var61 = field1875;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            while (var63 == 5 && var62 > var57) {
                this.method2590(var60[var58++]);
                if (var58 == var59 && field1873[11] != var60) {
                    var58 = 0;
                    var59 = field1826[11];
                    var60 = field1873[11];
                    var61 = field1875;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            int var64 = field1826[var63];
            int[] var65 = field1873[var63];
            for (int var66 = 0; var66 < var64; var66++) {
                this.method2590(var65[var66]);
            }
        }
        while (var62 != -1000) {
            this.method2590(var60[var58++]);
            if (var58 == var59 && field1873[11] != var60) {
                var58 = 0;
                var60 = field1873[11];
                var59 = field1826[11];
                var61 = field1875;
            }
            if (var58 < var59) {
                var62 = var61[var58];
            } else {
                var62 = -1000;
            }
        }
    }

    @ObfuscatedName("ee.ax(I)V")
    public final void method2590(int arg0) {
        if (field1862[arg0]) {
            this.method2598(arg0);
            return;
        }
        int var2 = this.field1880[arg0];
        int var3 = this.field1832[arg0];
        int var4 = this.field1833[arg0];
        class135.field1915 = field1835[arg0];
        if (this.field1838 == null) {
            class135.field1931 = 0;
        } else {
            class135.field1931 = this.field1838[arg0] & 0xFF;
        }
        if (this.field1840 != null && this.field1840[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1839 == null || this.field1839[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1839[arg0] & 0xFF;
                var6 = this.field1843[var5];
                var7 = this.field1844[var5];
                var8 = this.field1845[var5];
            }
            if (this.field1836[arg0] == -1) {
                class135.method2684(field1864[var2], field1864[var3], field1864[var4], field1863[var2], field1863[var3], field1863[var4], this.field1834[arg0], this.field1834[arg0], this.field1834[arg0], field1823[var6], field1823[var7], field1823[var8], field1841[var6], field1841[var7], field1841[var8], field1868[var6], field1868[var7], field1868[var8], this.field1840[arg0]);
            } else {
                class135.method2684(field1864[var2], field1864[var3], field1864[var4], field1863[var2], field1863[var3], field1863[var4], this.field1834[arg0], this.field1852[arg0], this.field1836[arg0], field1823[var6], field1823[var7], field1823[var8], field1841[var6], field1841[var7], field1841[var8], field1868[var6], field1868[var7], field1868[var8], this.field1840[arg0]);
            }
        } else if (this.field1836[arg0] == -1) {
            class135.method2682(field1864[var2], field1864[var3], field1864[var4], field1863[var2], field1863[var3], field1863[var4], field1849[this.field1834[arg0]]);
        } else {
            class135.method2680(field1864[var2], field1864[var3], field1864[var4], field1863[var2], field1863[var3], field1863[var4], this.field1834[arg0], this.field1852[arg0], this.field1836[arg0]);
        }
    }

    @ObfuscatedName("ee.ai(I)V")
    public final void method2598(int arg0) {
        int var2 = Statics.field1935;
        int var3 = Statics.field1927;
        int var4 = 0;
        int var5 = this.field1880[arg0];
        int var6 = this.field1832[arg0];
        int var7 = this.field1833[arg0];
        int var8 = field1868[var5];
        int var9 = field1868[var6];
        int var10 = field1868[var7];
        if (this.field1838 == null) {
            class135.field1931 = 0;
        } else {
            class135.field1931 = this.field1838[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1861[var4] = field1863[var5];
            field1878[var4] = field1864[var5];
            field1879[var4++] = this.field1834[arg0];
        } else {
            int var11 = field1823[var5];
            int var12 = field1841[var5];
            int var13 = this.field1834[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1889[var10 - var8];
                field1861[var4] = (((field1823[var7] - var11) * var14 >> 16) + var11) * class135.field1926 / 50 + var2;
                field1878[var4] = (((field1841[var7] - var12) * var14 >> 16) + var12) * class135.field1926 / 50 + var3;
                field1879[var4++] = ((this.field1836[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1889[var9 - var8];
                field1861[var4] = (((field1823[var6] - var11) * var15 >> 16) + var11) * class135.field1926 / 50 + var2;
                field1878[var4] = (((field1841[var6] - var12) * var15 >> 16) + var12) * class135.field1926 / 50 + var3;
                field1879[var4++] = ((this.field1852[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1861[var4] = field1863[var6];
            field1878[var4] = field1864[var6];
            field1879[var4++] = this.field1852[arg0];
        } else {
            int var16 = field1823[var6];
            int var17 = field1841[var6];
            int var18 = this.field1852[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1889[var8 - var9];
                field1861[var4] = (((field1823[var5] - var16) * var19 >> 16) + var16) * class135.field1926 / 50 + var2;
                field1878[var4] = (((field1841[var5] - var17) * var19 >> 16) + var17) * class135.field1926 / 50 + var3;
                field1879[var4++] = ((this.field1834[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1889[var10 - var9];
                field1861[var4] = (((field1823[var7] - var16) * var20 >> 16) + var16) * class135.field1926 / 50 + var2;
                field1878[var4] = (((field1841[var7] - var17) * var20 >> 16) + var17) * class135.field1926 / 50 + var3;
                field1879[var4++] = ((this.field1836[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1861[var4] = field1863[var7];
            field1878[var4] = field1864[var7];
            field1879[var4++] = this.field1836[arg0];
        } else {
            int var21 = field1823[var7];
            int var22 = field1841[var7];
            int var23 = this.field1836[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1889[var9 - var10];
                field1861[var4] = (((field1823[var6] - var21) * var24 >> 16) + var21) * class135.field1926 / 50 + var2;
                field1878[var4] = (((field1841[var6] - var22) * var24 >> 16) + var22) * class135.field1926 / 50 + var3;
                field1879[var4++] = ((this.field1852[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1889[var8 - var10];
                field1861[var4] = (((field1823[var5] - var21) * var25 >> 16) + var21) * class135.field1926 / 50 + var2;
                field1878[var4] = (((field1841[var5] - var22) * var25 >> 16) + var22) * class135.field1926 / 50 + var3;
                field1879[var4++] = ((this.field1834[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1861[0];
        int var27 = field1861[1];
        int var28 = field1861[2];
        int var29 = field1878[0];
        int var30 = field1878[1];
        int var31 = field1878[2];
        class135.field1915 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1928 || var27 > Statics.field1928 || var28 > Statics.field1928) {
                class135.field1915 = true;
            }
            if (this.field1840 != null && this.field1840[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1839 == null || this.field1839[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1839[arg0] & 0xFF;
                    var33 = this.field1843[var32];
                    var34 = this.field1844[var32];
                    var35 = this.field1845[var32];
                }
                if (this.field1836[arg0] == -1) {
                    class135.method2684(var29, var30, var31, var26, var27, var28, this.field1834[arg0], this.field1834[arg0], this.field1834[arg0], field1823[var33], field1823[var34], field1823[var35], field1841[var33], field1841[var34], field1841[var35], field1868[var33], field1868[var34], field1868[var35], this.field1840[arg0]);
                } else {
                    class135.method2684(var29, var30, var31, var26, var27, var28, field1879[0], field1879[1], field1879[2], field1823[var33], field1823[var34], field1823[var35], field1841[var33], field1841[var34], field1841[var35], field1868[var33], field1868[var34], field1868[var35], this.field1840[arg0]);
                }
            } else if (this.field1836[arg0] == -1) {
                class135.method2682(var29, var30, var31, var26, var27, var28, field1849[this.field1834[arg0]]);
            } else {
                class135.method2680(var29, var30, var31, var26, var27, var28, field1879[0], field1879[1], field1879[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1928 || var27 > Statics.field1928 || var28 > Statics.field1928 || field1861[3] < 0 || field1861[3] > Statics.field1928) {
            class135.field1915 = true;
        }
        if (this.field1840 != null && this.field1840[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1839 == null || this.field1839[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1839[arg0] & 0xFF;
                var37 = this.field1843[var36];
                var38 = this.field1844[var36];
                var39 = this.field1845[var36];
            }
            short var40 = this.field1840[arg0];
            if (this.field1836[arg0] == -1) {
                class135.method2684(var29, var30, var31, var26, var27, var28, this.field1834[arg0], this.field1834[arg0], this.field1834[arg0], field1823[var37], field1823[var38], field1823[var39], field1841[var37], field1841[var38], field1841[var39], field1868[var37], field1868[var38], field1868[var39], var40);
                class135.method2684(var29, var31, field1878[3], var26, var28, field1861[3], this.field1834[arg0], this.field1834[arg0], this.field1834[arg0], field1823[var37], field1823[var38], field1823[var39], field1841[var37], field1841[var38], field1841[var39], field1868[var37], field1868[var38], field1868[var39], var40);
            } else {
                class135.method2684(var29, var30, var31, var26, var27, var28, field1879[0], field1879[1], field1879[2], field1823[var37], field1823[var38], field1823[var39], field1841[var37], field1841[var38], field1841[var39], field1868[var37], field1868[var38], field1868[var39], var40);
                class135.method2684(var29, var31, field1878[3], var26, var28, field1861[3], field1879[0], field1879[2], field1879[3], field1823[var37], field1823[var38], field1823[var39], field1841[var37], field1841[var38], field1841[var39], field1868[var37], field1868[var38], field1868[var39], var40);
            }
        } else if (this.field1836[arg0] == -1) {
            int var41 = field1849[this.field1834[arg0]];
            class135.method2682(var29, var30, var31, var26, var27, var28, var41);
            class135.method2682(var29, var31, field1878[3], var26, var28, field1861[3], var41);
        } else {
            class135.method2680(var29, var30, var31, var26, var27, var28, field1879[0], field1879[1], field1879[2]);
            class135.method2680(var29, var31, field1878[3], var26, var28, field1861[3], field1879[0], field1879[2], field1879[3]);
        }
    }
}
