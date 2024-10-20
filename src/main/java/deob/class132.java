package deob;

@ObfuscatedName("el")
public class class132 extends class140 {

    @ObfuscatedName("el.d")
    public static class132 field1850 = new class132();

    @ObfuscatedName("el.z")
    public static byte[] field1891 = new byte[1];

    @ObfuscatedName("el.n")
    public static class132 field1853 = new class132();

    @ObfuscatedName("el.r")
    public static byte[] field1837 = new byte[1];

    @ObfuscatedName("el.e")
    public int field1838 = 0;

    @ObfuscatedName("el.y")
    public int[] field1839;

    @ObfuscatedName("el.k")
    public int[] field1840;

    @ObfuscatedName("el.s")
    public int[] field1845;

    @ObfuscatedName("el.p")
    public int field1843 = 0;

    @ObfuscatedName("el.x")
    public int[] field1875;

    @ObfuscatedName("el.m")
    public int[] field1844;

    @ObfuscatedName("el.h")
    public int[] field1871;

    @ObfuscatedName("el.t")
    public int[] field1846;

    @ObfuscatedName("el.i")
    public int[] field1851;

    @ObfuscatedName("el.u")
    public int[] field1848;

    @ObfuscatedName("el.q")
    public byte[] field1849;

    @ObfuscatedName("el.v")
    public byte[] field1877;

    @ObfuscatedName("el.f")
    public byte[] field1872;

    @ObfuscatedName("el.b")
    public short[] field1852;

    @ObfuscatedName("el.c")
    public byte field1842 = 0;

    @ObfuscatedName("el.j")
    public int field1841 = 0;

    @ObfuscatedName("el.l")
    public int[] field1855;

    @ObfuscatedName("el.g")
    public int[] field1856;

    @ObfuscatedName("el.w")
    public int[] field1857;

    @ObfuscatedName("el.o")
    public int[][] field1858;

    @ObfuscatedName("el.a")
    public int[][] field1890;

    @ObfuscatedName("el.ak")
    public boolean field1860 = false;

    @ObfuscatedName("el.ap")
    public int field1859;

    @ObfuscatedName("el.ac")
    public int field1900;

    @ObfuscatedName("el.aw")
    public int field1863;

    @ObfuscatedName("el.as")
    public int field1864;

    @ObfuscatedName("el.au")
    public int field1886;

    @ObfuscatedName("el.al")
    public int field1866;

    @ObfuscatedName("el.af")
    public int field1867;

    @ObfuscatedName("el.ai")
    public int field1868;

    @ObfuscatedName("el.az")
    public int field1869 = -1;

    @ObfuscatedName("el.aq")
    public int field1870 = -1;

    @ObfuscatedName("el.ae")
    public int field1861 = -1;

    @ObfuscatedName("el.ar")
    public static boolean[] field1873 = new boolean[4700];

    @ObfuscatedName("el.ao")
    public static boolean[] field1874 = new boolean[4700];

    @ObfuscatedName("el.at")
    public static int[] field1834 = new int[4700];

    @ObfuscatedName("el.ag")
    public static int[] field1876 = new int[4700];

    @ObfuscatedName("el.an")
    public static int[] field1836 = new int[4700];

    @ObfuscatedName("el.ax")
    public static int[] field1878 = new int[4700];

    @ObfuscatedName("el.ah")
    public static int[] field1879 = new int[4700];

    @ObfuscatedName("el.ab")
    public static int[] field1880 = new int[4700];

    @ObfuscatedName("el.ay")
    public static int[] field1882 = new int[1600];

    @ObfuscatedName("el.aj")
    public static int[][] field1883 = new int[1600][512];

    @ObfuscatedName("el.aa")
    public static int[] field1884 = new int[12];

    @ObfuscatedName("el.av")
    public static int[][] field1889 = new int[12][2000];

    @ObfuscatedName("el.bc")
    public static int[] field1835 = new int[2000];

    @ObfuscatedName("el.br")
    public static int[] field1887 = new int[2000];

    @ObfuscatedName("el.by")
    public static int[] field1888 = new int[12];

    @ObfuscatedName("el.bl")
    public static int[] field1862 = new int[10];

    @ObfuscatedName("el.bs")
    public static int[] field1854 = new int[10];

    @ObfuscatedName("el.bu")
    public static int[] field1903 = new int[10];

    @ObfuscatedName("el.bf")
    public static boolean field1895 = true;

    @ObfuscatedName("el.be")
    public static int[] field1898 = class135.field1940;

    @ObfuscatedName("el.bn")
    public static int[] field1899 = class135.field1945;

    @ObfuscatedName("el.bw")
    public static int[] field1894 = class135.field1919;

    @ObfuscatedName("el.bg")
    public static int[] field1901 = class135.field1943;

    public class132() {
    }

    public class132(class132[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1838 = 0;
        this.field1843 = 0;
        this.field1841 = 0;
        this.field1842 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class132 var8 = arg0[var7];
            if (var8 != null) {
                this.field1838 += var8.field1838;
                this.field1843 += var8.field1843;
                this.field1841 += var8.field1841;
                if (var8.field1849 == null) {
                    if (this.field1842 == -1) {
                        this.field1842 = var8.field1842;
                    }
                    if (this.field1842 != var8.field1842) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1877 != null;
                var5 |= var8.field1852 != null;
                var6 |= var8.field1872 != null;
            }
        }
        this.field1839 = new int[this.field1838];
        this.field1840 = new int[this.field1838];
        this.field1845 = new int[this.field1838];
        this.field1875 = new int[this.field1843];
        this.field1844 = new int[this.field1843];
        this.field1871 = new int[this.field1843];
        this.field1846 = new int[this.field1843];
        this.field1851 = new int[this.field1843];
        this.field1848 = new int[this.field1843];
        if (var3) {
            this.field1849 = new byte[this.field1843];
        }
        if (var4) {
            this.field1877 = new byte[this.field1843];
        }
        if (var5) {
            this.field1852 = new short[this.field1843];
        }
        if (var6) {
            this.field1872 = new byte[this.field1843];
        }
        if (this.field1841 > 0) {
            this.field1855 = new int[this.field1841];
            this.field1856 = new int[this.field1841];
            this.field1857 = new int[this.field1841];
        }
        this.field1838 = 0;
        this.field1843 = 0;
        this.field1841 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class132 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1843; var11++) {
                    this.field1875[this.field1843] = var10.field1875[var11] + this.field1838;
                    this.field1844[this.field1843] = var10.field1844[var11] + this.field1838;
                    this.field1871[this.field1843] = var10.field1871[var11] + this.field1838;
                    this.field1846[this.field1843] = var10.field1846[var11];
                    this.field1851[this.field1843] = var10.field1851[var11];
                    this.field1848[this.field1843] = var10.field1848[var11];
                    if (var3) {
                        if (var10.field1849 == null) {
                            this.field1849[this.field1843] = var10.field1842;
                        } else {
                            this.field1849[this.field1843] = var10.field1849[var11];
                        }
                    }
                    if (var4 && var10.field1877 != null) {
                        this.field1877[this.field1843] = var10.field1877[var11];
                    }
                    if (var5) {
                        if (var10.field1852 == null) {
                            this.field1852[this.field1843] = -1;
                        } else {
                            this.field1852[this.field1843] = var10.field1852[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1872 == null || var10.field1872[var11] == -1) {
                            this.field1872[this.field1843] = -1;
                        } else {
                            this.field1872[this.field1843] = (byte) (var10.field1872[var11] + this.field1841);
                        }
                    }
                    this.field1843++;
                }
                for (int var12 = 0; var12 < var10.field1841; var12++) {
                    this.field1855[this.field1841] = var10.field1855[var12] + this.field1838;
                    this.field1856[this.field1841] = var10.field1856[var12] + this.field1838;
                    this.field1857[this.field1841] = var10.field1857[var12] + this.field1838;
                    this.field1841++;
                }
                for (int var13 = 0; var13 < var10.field1838; var13++) {
                    this.field1839[this.field1838] = var10.field1839[var13];
                    this.field1840[this.field1838] = var10.field1840[var13];
                    this.field1845[this.field1838] = var10.field1845[var13];
                    this.field1838++;
                }
            }
        }
    }

    @ObfuscatedName("el.d([[IIIIZI)Lel;")
    public class132 method2596(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2592();
        int var7 = arg1 - this.field1863;
        int var8 = this.field1863 + arg1;
        int var9 = arg3 - this.field1863;
        int var10 = this.field1863 + arg3;
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
            var15.field1838 = this.field1838;
            var15.field1843 = this.field1843;
            var15.field1841 = this.field1841;
            var15.field1839 = this.field1839;
            var15.field1845 = this.field1845;
            var15.field1875 = this.field1875;
            var15.field1844 = this.field1844;
            var15.field1871 = this.field1871;
            var15.field1846 = this.field1846;
            var15.field1851 = this.field1851;
            var15.field1848 = this.field1848;
            var15.field1849 = this.field1849;
            var15.field1877 = this.field1877;
            var15.field1872 = this.field1872;
            var15.field1852 = this.field1852;
            var15.field1842 = this.field1842;
            var15.field1855 = this.field1855;
            var15.field1856 = this.field1856;
            var15.field1857 = this.field1857;
            var15.field1858 = this.field1858;
            var15.field1890 = this.field1890;
            var15.field1860 = this.field1860;
            var15.field1840 = new int[var15.field1838];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1838; var16++) {
                int var17 = this.field1839[var16] + arg1;
                int var18 = this.field1845[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1840[var16] = this.field1840[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1838; var26++) {
                int var27 = (-this.field1840[var26] << 16) / this.field2027;
                if (var27 < arg5) {
                    int var28 = this.field1839[var26] + arg1;
                    int var29 = this.field1845[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1840[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1840[var26];
                }
            }
        }
        var15.method2531();
        return var15;
    }

    @ObfuscatedName("el.z(Z)Lel;")
    public class132 method2524(boolean arg0) {
        if (!arg0 && field1891.length < this.field1843) {
            field1891 = new byte[this.field1843 + 100];
        }
        return this.method2526(arg0, field1850, field1891);
    }

    @ObfuscatedName("el.n(Z)Lel;")
    public class132 method2549(boolean arg0) {
        if (!arg0 && field1837.length < this.field1843) {
            field1837 = new byte[this.field1843 + 100];
        }
        return this.method2526(arg0, field1853, field1837);
    }

    @ObfuscatedName("el.r(ZLel;[B)Lel;")
    public class132 method2526(boolean arg0, class132 arg1, byte[] arg2) {
        arg1.field1838 = this.field1838;
        arg1.field1843 = this.field1843;
        arg1.field1841 = this.field1841;
        if (arg1.field1839 == null || arg1.field1839.length < this.field1838) {
            arg1.field1839 = new int[this.field1838 + 100];
            arg1.field1840 = new int[this.field1838 + 100];
            arg1.field1845 = new int[this.field1838 + 100];
        }
        for (int var4 = 0; var4 < this.field1838; var4++) {
            arg1.field1839[var4] = this.field1839[var4];
            arg1.field1840[var4] = this.field1840[var4];
            arg1.field1845[var4] = this.field1845[var4];
        }
        if (arg0) {
            arg1.field1877 = this.field1877;
        } else {
            arg1.field1877 = arg2;
            if (this.field1877 == null) {
                for (int var5 = 0; var5 < this.field1843; var5++) {
                    arg1.field1877[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1843; var6++) {
                    arg1.field1877[var6] = this.field1877[var6];
                }
            }
        }
        arg1.field1875 = this.field1875;
        arg1.field1844 = this.field1844;
        arg1.field1871 = this.field1871;
        arg1.field1846 = this.field1846;
        arg1.field1851 = this.field1851;
        arg1.field1848 = this.field1848;
        arg1.field1849 = this.field1849;
        arg1.field1872 = this.field1872;
        arg1.field1852 = this.field1852;
        arg1.field1842 = this.field1842;
        arg1.field1855 = this.field1855;
        arg1.field1856 = this.field1856;
        arg1.field1857 = this.field1857;
        arg1.field1858 = this.field1858;
        arg1.field1890 = this.field1890;
        arg1.field1860 = this.field1860;
        arg1.method2531();
        return arg1;
    }

    @ObfuscatedName("el.e(I)V")
    public void method2527(int arg0) {
        if (this.field1869 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1899[arg0];
        int var9 = field1898[arg0];
        for (int var10 = 0; var10 < this.field1838; var10++) {
            int var11 = class135.method2664(this.field1839[var10], this.field1845[var10], var8, var9);
            int var12 = this.field1840[var10];
            int var13 = class135.method2632(this.field1839[var10], this.field1845[var10], var8, var9);
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
        this.field1866 = (var2 + var5) / 2;
        this.field1867 = (var3 + var6) / 2;
        this.field1868 = (var4 + var7) / 2;
        this.field1869 = (var5 - var2 + 1) / 2;
        this.field1870 = (var6 - var3 + 1) / 2;
        this.field1861 = (var7 - var4 + 1) / 2;
        if (this.field1869 < 32) {
            this.field1869 = 32;
        }
        if (this.field1861 < 32) {
            this.field1861 = 32;
        }
        if (this.field1860) {
            this.field1869 += 8;
            this.field1861 += 8;
        }
    }

    @ObfuscatedName("el.y()V")
    public void method2592() {
        if (this.field1859 == 1) {
            return;
        }
        this.field1859 = 1;
        this.field2027 = 0;
        this.field1900 = 0;
        this.field1863 = 0;
        for (int var1 = 0; var1 < this.field1838; var1++) {
            int var2 = this.field1839[var1];
            int var3 = this.field1840[var1];
            int var4 = this.field1845[var1];
            if (-var3 > this.field2027) {
                this.field2027 = -var3;
            }
            if (var3 > this.field1900) {
                this.field1900 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1863) {
                this.field1863 = var5;
            }
        }
        this.field1863 = (int) (Math.sqrt((double) this.field1863) + 0.99D);
        this.field1886 = (int) (Math.sqrt((double) (this.field2027 * this.field2027 + this.field1863 * this.field1863)) + 0.99D);
        this.field1864 = this.field1886 + (int) (Math.sqrt((double) (this.field1900 * this.field1900 + this.field1863 * this.field1863)) + 0.99D);
    }

    @ObfuscatedName("el.k()V")
    public void method2593() {
        if (this.field1859 == 2) {
            return;
        }
        this.field1859 = 2;
        this.field1863 = 0;
        for (int var1 = 0; var1 < this.field1838; var1++) {
            int var2 = this.field1839[var1];
            int var3 = this.field1840[var1];
            int var4 = this.field1845[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1863) {
                this.field1863 = var5;
            }
        }
        this.field1863 = (int) (Math.sqrt((double) this.field1863) + 0.99D);
        this.field1886 = this.field1863;
        this.field1864 = this.field1863 + this.field1863;
    }

    @ObfuscatedName("el.s()I")
    public int method2530() {
        this.method2592();
        return this.field1863;
    }

    @ObfuscatedName("el.h()V")
    public void method2531() {
        this.field1859 = 0;
        this.field1869 = -1;
    }

    @ObfuscatedName("el.t(Lei;I)V")
    public void method2532(class143 arg0, int arg1) {
        if (this.field1858 == null || arg1 == -1) {
            return;
        }
        class130 var3 = arg0.field2047[arg1];
        class137 var4 = var3.field1803;
        Statics.field1892 = 0;
        Statics.field1893 = 0;
        Statics.field1865 = 0;
        for (int var5 = 0; var5 < var3.field1804; var5++) {
            int var6 = var3.field1807[var5];
            this.method2534(var4.field1955[var6], var4.field1957[var6], var3.field1806[var5], var3.field1799[var5], var3.field1808[var5]);
        }
        this.method2531();
    }

    @ObfuscatedName("el.i(Lei;ILei;I[I)V")
    public void method2533(class143 arg0, int arg1, class143 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2532(arg0, arg1);
            return;
        }
        class130 var6 = arg0.field2047[arg1];
        class130 var7 = arg2.field2047[arg3];
        class137 var8 = var6.field1803;
        Statics.field1892 = 0;
        Statics.field1893 = 0;
        Statics.field1865 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1804; var11++) {
            int var12 = var6.field1807[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1955[var12] == 0) {
                this.method2534(var8.field1955[var12], var8.field1957[var12], var6.field1806[var11], var6.field1799[var11], var6.field1808[var11]);
            }
        }
        Statics.field1892 = 0;
        Statics.field1893 = 0;
        Statics.field1865 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1804; var15++) {
            int var16 = var7.field1807[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1955[var16] == 0) {
                this.method2534(var8.field1955[var16], var8.field1957[var16], var7.field1806[var15], var7.field1799[var15], var7.field1808[var15]);
            }
        }
        this.method2531();
    }

    @ObfuscatedName("el.u(I[IIII)V")
    public void method2534(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1892 = 0;
            Statics.field1893 = 0;
            Statics.field1865 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1858.length) {
                    int[] var10 = this.field1858[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1892 += this.field1839[var12];
                        Statics.field1893 += this.field1840[var12];
                        Statics.field1865 += this.field1845[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1892 = Statics.field1892 / var7 + arg2;
                Statics.field1893 = Statics.field1893 / var7 + arg3;
                Statics.field1865 = Statics.field1865 / var7 + arg4;
            } else {
                Statics.field1892 = arg2;
                Statics.field1893 = arg3;
                Statics.field1865 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1858.length) {
                    int[] var15 = this.field1858[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1839[var17] += arg2;
                        this.field1840[var17] += arg3;
                        this.field1845[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1858.length) {
                    int[] var20 = this.field1858[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1839[var22] -= Statics.field1892;
                        this.field1840[var22] -= Statics.field1893;
                        this.field1845[var22] -= Statics.field1865;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1898[var25];
                            int var27 = field1899[var25];
                            int var28 = this.field1840[var22] * var26 + this.field1839[var22] * var27 >> 16;
                            this.field1840[var22] = this.field1840[var22] * var27 - this.field1839[var22] * var26 >> 16;
                            this.field1839[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1898[var23];
                            int var30 = field1899[var23];
                            int var31 = this.field1840[var22] * var30 - this.field1845[var22] * var29 >> 16;
                            this.field1845[var22] = this.field1845[var22] * var30 + this.field1840[var22] * var29 >> 16;
                            this.field1840[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1898[var24];
                            int var33 = field1899[var24];
                            int var34 = this.field1845[var22] * var32 + this.field1839[var22] * var33 >> 16;
                            this.field1845[var22] = this.field1845[var22] * var33 - this.field1839[var22] * var32 >> 16;
                            this.field1839[var22] = var34;
                        }
                        this.field1839[var22] += Statics.field1892;
                        this.field1840[var22] += Statics.field1893;
                        this.field1845[var22] += Statics.field1865;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1858.length) {
                    int[] var37 = this.field1858[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1839[var39] -= Statics.field1892;
                        this.field1840[var39] -= Statics.field1893;
                        this.field1845[var39] -= Statics.field1865;
                        this.field1839[var39] = this.field1839[var39] * arg2 / 128;
                        this.field1840[var39] = this.field1840[var39] * arg3 / 128;
                        this.field1845[var39] = this.field1845[var39] * arg4 / 128;
                        this.field1839[var39] += Statics.field1892;
                        this.field1840[var39] += Statics.field1893;
                        this.field1845[var39] += Statics.field1865;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1890 != null && this.field1877 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1890.length) {
                    int[] var42 = this.field1890[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1877[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1877[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("el.q()V")
    public void method2559() {
        for (int var1 = 0; var1 < this.field1838; var1++) {
            int var2 = this.field1839[var1];
            this.field1839[var1] = this.field1845[var1];
            this.field1845[var1] = -var2;
        }
        this.method2531();
    }

    @ObfuscatedName("el.v()V")
    public void method2536() {
        for (int var1 = 0; var1 < this.field1838; var1++) {
            this.field1839[var1] = -this.field1839[var1];
            this.field1845[var1] = -this.field1845[var1];
        }
        this.method2531();
    }

    @ObfuscatedName("el.f()V")
    public void method2537() {
        for (int var1 = 0; var1 < this.field1838; var1++) {
            int var2 = this.field1845[var1];
            this.field1845[var1] = this.field1839[var1];
            this.field1839[var1] = -var2;
        }
        this.method2531();
    }

    @ObfuscatedName("el.b(I)V")
    public void method2603(int arg0) {
        int var2 = field1898[arg0];
        int var3 = field1899[arg0];
        for (int var4 = 0; var4 < this.field1838; var4++) {
            int var5 = this.field1840[var4] * var3 - this.field1845[var4] * var2 >> 16;
            this.field1845[var4] = this.field1845[var4] * var3 + this.field1840[var4] * var2 >> 16;
            this.field1840[var4] = var5;
        }
        this.method2531();
    }

    @ObfuscatedName("el.c(III)V")
    public void method2558(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1838; var4++) {
            this.field1839[var4] += arg0;
            this.field1840[var4] += arg1;
            this.field1845[var4] += arg2;
        }
        this.method2531();
    }

    @ObfuscatedName("el.w(III)V")
    public void method2540(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1838; var4++) {
            this.field1839[var4] = this.field1839[var4] * arg0 / 128;
            this.field1840[var4] = this.field1840[var4] * arg1 / 128;
            this.field1845[var4] = this.field1845[var4] * arg2 / 128;
        }
        this.method2531();
    }

    @ObfuscatedName("el.o(IIIIIII)V")
    public final void method2541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1882[0] = -1;
        if (this.field1859 != 2 && this.field1859 != 1) {
            this.method2593();
        }
        int var8 = Statics.field1939;
        int var9 = Statics.field1932;
        int var10 = field1898[arg0];
        int var11 = field1899[arg0];
        int var12 = field1898[arg1];
        int var13 = field1899[arg1];
        int var14 = field1898[arg2];
        int var15 = field1899[arg2];
        int var16 = field1898[arg3];
        int var17 = field1899[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1838; var19++) {
            int var20 = this.field1839[var19];
            int var21 = this.field1840[var19];
            int var22 = this.field1845[var19];
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
            field1836[var19] = var30 - var18;
            field1834[var19] = class135.field1921 * var26 / var30 + var8;
            field1876[var19] = class135.field1921 * var29 / var30 + var9;
            if (this.field1841 > 0) {
                field1878[var19] = var26;
                field1879[var19] = var29;
                field1880[var19] = var30;
            }
        }
        try {
            this.method2544(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("el.a(IIIIIIII)V")
    public final void method2542(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1882[0] = -1;
        if (this.field1859 != 2 && this.field1859 != 1) {
            this.method2593();
        }
        int var9 = Statics.field1939;
        int var10 = Statics.field1932;
        int var11 = field1898[arg0];
        int var12 = field1899[arg0];
        int var13 = field1898[arg1];
        int var14 = field1899[arg1];
        int var15 = field1898[arg2];
        int var16 = field1899[arg2];
        int var17 = field1898[arg3];
        int var18 = field1899[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1838; var20++) {
            int var21 = this.field1839[var20];
            int var22 = this.field1840[var20];
            int var23 = this.field1845[var20];
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
            field1836[var20] = var31 - var19;
            field1834[var20] = class135.field1921 * var27 / arg7 + var9;
            field1876[var20] = class135.field1921 * var30 / arg7 + var10;
            if (this.field1841 > 0) {
                field1878[var20] = var27;
                field1879[var20] = var30;
                field1880[var20] = var31;
            }
        }
        try {
            this.method2544(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("el.cc(IIIIIIIII)V")
    public void method2543(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1882[0] = -1;
        if (this.field1859 != 1) {
            this.method2592();
        }
        this.method2527(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1863 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1863) * class135.field1921;
        if (var15 / var13 >= Statics.field1936) {
            return;
        }
        int var16 = (this.field1863 + var14) * class135.field1921;
        if (var16 / var13 <= Statics.field1920) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1863 * arg1 >> 16;
        int var19 = (var17 + var18) * class135.field1921;
        if (var19 / var13 <= Statics.field1930) {
            return;
        }
        int var20 = (this.field2027 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class135.field1921;
        if (var21 / var13 >= Statics.field1938) {
            return;
        }
        int var22 = (this.field2027 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1841 > 0;
        int var26 = class133.field1904;
        int var28 = class133.field1906;
        boolean var30 = class133.field1907;
        if (class8.field228 && arg8 > 0) {
            if (class133.method4211(this, arg5, arg6, arg7)) {
                class8.field238.method3750(new class11(this, arg5, arg6, arg7, -65281));
            } else if (class8.field230 == class12.field267) {
                class8.field238.method3750(new class11(this, arg5, arg6, arg7, -16776961));
            }
        }
        if (class8.field231 && arg8 > 0) {
            int var33 = var11 - var12;
            if (var33 <= 50) {
                var33 = 50;
            }
            int var38;
            int var39;
            if (var14 > 0) {
                var38 = var15 / var13;
                var39 = var16 / var33;
            } else {
                var39 = var16 / var13;
                var38 = var15 / var33;
            }
            int var40;
            int var41;
            if (var17 > 0) {
                var40 = var21 / var13;
                var41 = var19 / var33;
            } else {
                var41 = var19 / var13;
                var40 = var21 / var33;
            }
            int var42 = -8355840;
            int var43 = var26 - Statics.field1939;
            int var44 = var28 - Statics.field1932;
            if (var43 > var38 && var43 < var39 && var44 > var40 && var44 < var41) {
                var42 = -256;
            }
            class8.method1500(Statics.field1939 + var38, Statics.field1932 + var40, Statics.field1939 + var39, Statics.field1932 + var41, var42);
        }
        boolean var45 = false;
        if (arg8 > 0 && var30) {
            boolean var46 = false;
            if (field1895) {
                var46 = class133.method4211(this, arg5, arg6, arg7);
            } else {
                int var47 = var11 - var12;
                if (var47 <= 50) {
                    var47 = 50;
                }
                int var48;
                int var49;
                if (var14 > 0) {
                    var48 = var15 / var13;
                    var49 = var16 / var47;
                } else {
                    var49 = var16 / var13;
                    var48 = var15 / var47;
                }
                int var50;
                int var51;
                if (var17 > 0) {
                    var50 = var21 / var13;
                    var51 = var19 / var47;
                } else {
                    var51 = var19 / var13;
                    var50 = var21 / var47;
                }
                int var52 = var26 - Statics.field1939;
                int var53 = var28 - Statics.field1932;
                if (var52 > var48 && var52 < var49 && var53 > var50 && var53 < var51) {
                    var46 = true;
                }
            }
            if (var46) {
                if (this.field1860) {
                    class133.field1909[++class133.field1910 - 1] = arg8;
                } else {
                    var45 = true;
                }
            }
        }
        int var55 = Statics.field1939;
        int var56 = Statics.field1932;
        int var57 = 0;
        int var58 = 0;
        if (arg0 != 0) {
            var57 = field1898[arg0];
            var58 = field1899[arg0];
        }
        for (int var59 = 0; var59 < this.field1838; var59++) {
            int var60 = this.field1839[var59];
            int var61 = this.field1840[var59];
            int var62 = this.field1845[var59];
            if (arg0 != 0) {
                int var63 = var57 * var62 + var58 * var60 >> 16;
                var62 = var58 * var62 - var57 * var60 >> 16;
                var60 = var63;
            }
            int var64 = arg5 + var60;
            int var65 = arg6 + var61;
            int var66 = arg7 + var62;
            int var67 = arg3 * var66 + arg4 * var64 >> 16;
            int var68 = arg4 * var66 - arg3 * var64 >> 16;
            int var70 = arg2 * var65 - arg1 * var68 >> 16;
            int var71 = arg1 * var65 + arg2 * var68 >> 16;
            field1836[var59] = var71 - var11;
            if (var71 >= 50) {
                field1834[var59] = class135.field1921 * var67 / var71 + var55;
                field1876[var59] = class135.field1921 * var70 / var71 + var56;
            } else {
                field1834[var59] = -5000;
                var23 = true;
            }
            if (var25) {
                field1878[var59] = var67;
                field1879[var59] = var70;
                field1880[var59] = var71;
            }
        }
        try {
            this.method2544(var23, var45, this.field1860, arg8);
        } catch (Exception var74) {
        }
    }

    @ObfuscatedName("el.ak(ZZZI)V")
    public final void method2544(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1864 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1864; var5++) {
            field1882[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field235 && arg1) {
            class132 var7 = this;
            for (int var8 = 0; var8 < var7.field1843; var8++) {
                if (var7.field1848[var8] != -2) {
                    int var9 = var7.field1875[var8];
                    int var10 = var7.field1844[var8];
                    int var11 = var7.field1871[var8];
                    int var12 = field1834[var9];
                    int var13 = field1834[var10];
                    int var14 = field1834[var11];
                    class8.method4905(field1876[var9], field1876[var10], field1876[var11], var12, var13, var14, var6);
                }
            }
        }
        for (int var15 = 0; var15 < this.field1843; var15++) {
            if (this.field1848[var15] != -2) {
                int var16 = this.field1875[var15];
                int var17 = this.field1844[var15];
                int var18 = this.field1871[var15];
                int var19 = field1834[var16];
                int var20 = field1834[var17];
                int var21 = field1834[var18];
                if (arg0 && var19 == -5000 || var20 == -5000 || var21 == -5000) {
                    int var22 = field1878[var16];
                    int var23 = field1878[var17];
                    int var24 = field1878[var18];
                    int var25 = field1879[var16];
                    int var26 = field1879[var17];
                    int var27 = field1879[var18];
                    int var28 = field1880[var16];
                    int var29 = field1880[var17];
                    int var30 = field1880[var18];
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
                        field1874[var15] = true;
                        int var40 = (field1836[var16] + field1836[var17] + field1836[var18]) / 3 + this.field1886;
                        field1883[var40][field1882[var40]++] = var15;
                    }
                } else {
                    if (arg1) {
                        int var41 = field1876[var16];
                        int var42 = field1876[var17];
                        int var43 = field1876[var18];
                        int var44 = class133.field1906 + var6;
                        boolean var45;
                        if (var44 < var41 && var44 < var42 && var44 < var43) {
                            var45 = false;
                        } else {
                            int var46 = class133.field1906 - var6;
                            if (var46 > var41 && var46 > var42 && var46 > var43) {
                                var45 = false;
                            } else {
                                int var47 = class133.field1904 + var6;
                                if (var47 < var19 && var47 < var20 && var47 < var21) {
                                    var45 = false;
                                } else {
                                    int var48 = class133.field1904 - var6;
                                    if (var48 > var19 && var48 > var20 && var48 > var21) {
                                        var45 = false;
                                    } else {
                                        var45 = true;
                                    }
                                }
                            }
                        }
                        if (var45) {
                            class133.field1909[++class133.field1910 - 1] = arg3;
                            arg1 = false;
                        }
                    }
                    if ((field1876[var18] - field1876[var17]) * (var19 - var20) - (field1876[var16] - field1876[var17]) * (var21 - var20) > 0) {
                        field1874[var15] = false;
                        if (var19 >= 0 && var20 >= 0 && var21 >= 0 && var19 <= Statics.field1933 && var20 <= Statics.field1933 && var21 <= Statics.field1933) {
                            field1873[var15] = false;
                        } else {
                            field1873[var15] = true;
                        }
                        int var50 = (field1836[var16] + field1836[var17] + field1836[var18]) / 3 + this.field1886;
                        field1883[var50][field1882[var50]++] = var15;
                    }
                }
            }
        }
        if (this.field1849 == null) {
            for (int var51 = this.field1864 - 1; var51 >= 0; var51--) {
                int var52 = field1882[var51];
                if (var52 > 0) {
                    int[] var53 = field1883[var51];
                    for (int var54 = 0; var54 < var52; var54++) {
                        this.method2545(var53[var54]);
                    }
                }
            }
            return;
        }
        for (int var55 = 0; var55 < 12; var55++) {
            field1884[var55] = 0;
            field1888[var55] = 0;
        }
        for (int var56 = this.field1864 - 1; var56 >= 0; var56--) {
            int var57 = field1882[var56];
            if (var57 > 0) {
                int[] var58 = field1883[var56];
                for (int var59 = 0; var59 < var57; var59++) {
                    int var60 = var58[var59];
                    byte var61 = this.field1849[var60];
                    int var62 = field1884[var61]++;
                    field1889[var61][var62] = var60;
                    if (var61 < 10) {
                        field1888[var61] += var56;
                    } else if (var61 == 10) {
                        field1835[var62] = var56;
                    } else {
                        field1887[var62] = var56;
                    }
                }
            }
        }
        int var63 = 0;
        if (field1884[1] > 0 || field1884[2] > 0) {
            var63 = (field1888[1] + field1888[2]) / (field1884[1] + field1884[2]);
        }
        int var64 = 0;
        if (field1884[3] > 0 || field1884[4] > 0) {
            var64 = (field1888[3] + field1888[4]) / (field1884[3] + field1884[4]);
        }
        int var65 = 0;
        if (field1884[6] > 0 || field1884[8] > 0) {
            var65 = (field1888[6] + field1888[8]) / (field1884[6] + field1884[8]);
        }
        int var66 = 0;
        int var67 = field1884[10];
        int[] var68 = field1889[10];
        int[] var69 = field1835;
        if (var66 == var67) {
            var66 = 0;
            var67 = field1884[11];
            var68 = field1889[11];
            var69 = field1887;
        }
        int var70;
        if (var66 < var67) {
            var70 = var69[var66];
        } else {
            var70 = -1000;
        }
        for (int var71 = 0; var71 < 10; var71++) {
            while (var71 == 0 && var70 > var63) {
                this.method2545(var68[var66++]);
                if (var66 == var67 && field1889[11] != var68) {
                    var66 = 0;
                    var67 = field1884[11];
                    var68 = field1889[11];
                    var69 = field1887;
                }
                if (var66 < var67) {
                    var70 = var69[var66];
                } else {
                    var70 = -1000;
                }
            }
            while (var71 == 3 && var70 > var64) {
                this.method2545(var68[var66++]);
                if (var66 == var67 && field1889[11] != var68) {
                    var66 = 0;
                    var67 = field1884[11];
                    var68 = field1889[11];
                    var69 = field1887;
                }
                if (var66 < var67) {
                    var70 = var69[var66];
                } else {
                    var70 = -1000;
                }
            }
            while (var71 == 5 && var70 > var65) {
                this.method2545(var68[var66++]);
                if (var66 == var67 && field1889[11] != var68) {
                    var66 = 0;
                    var67 = field1884[11];
                    var68 = field1889[11];
                    var69 = field1887;
                }
                if (var66 < var67) {
                    var70 = var69[var66];
                } else {
                    var70 = -1000;
                }
            }
            int var72 = field1884[var71];
            int[] var73 = field1889[var71];
            for (int var74 = 0; var74 < var72; var74++) {
                this.method2545(var73[var74]);
            }
        }
        while (var70 != -1000) {
            this.method2545(var68[var66++]);
            if (var66 == var67 && field1889[11] != var68) {
                var66 = 0;
                var68 = field1889[11];
                var67 = field1884[11];
                var69 = field1887;
            }
            if (var66 < var67) {
                var70 = var69[var66];
            } else {
                var70 = -1000;
            }
        }
    }

    @ObfuscatedName("el.ap(I)V")
    public final void method2545(int arg0) {
        if (field1874[arg0]) {
            this.method2546(arg0);
            return;
        }
        int var2 = this.field1875[arg0];
        int var3 = this.field1844[arg0];
        int var4 = this.field1871[arg0];
        class135.field1944 = field1873[arg0];
        if (this.field1877 == null) {
            class135.field1923 = 0;
        } else {
            class135.field1923 = this.field1877[arg0] & 0xFF;
        }
        if (this.field1852 != null && this.field1852[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1872 == null || this.field1872[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1872[arg0] & 0xFF;
                var6 = this.field1855[var5];
                var7 = this.field1856[var5];
                var8 = this.field1857[var5];
            }
            if (this.field1848[arg0] == -1) {
                class135.method2621(field1876[var2], field1876[var3], field1876[var4], field1834[var2], field1834[var3], field1834[var4], this.field1846[arg0], this.field1846[arg0], this.field1846[arg0], field1878[var6], field1878[var7], field1878[var8], field1879[var6], field1879[var7], field1879[var8], field1880[var6], field1880[var7], field1880[var8], this.field1852[arg0]);
            } else {
                class135.method2621(field1876[var2], field1876[var3], field1876[var4], field1834[var2], field1834[var3], field1834[var4], this.field1846[arg0], this.field1851[arg0], this.field1848[arg0], field1878[var6], field1878[var7], field1878[var8], field1879[var6], field1879[var7], field1879[var8], field1880[var6], field1880[var7], field1880[var8], this.field1852[arg0]);
            }
        } else if (this.field1848[arg0] == -1) {
            class135.method2637(field1876[var2], field1876[var3], field1876[var4], field1834[var2], field1834[var3], field1834[var4], field1894[this.field1846[arg0]]);
        } else {
            class135.method2623(field1876[var2], field1876[var3], field1876[var4], field1834[var2], field1834[var3], field1834[var4], this.field1846[arg0], this.field1851[arg0], this.field1848[arg0]);
        }
    }

    @ObfuscatedName("el.ac(I)V")
    public final void method2546(int arg0) {
        int var2 = Statics.field1939;
        int var3 = Statics.field1932;
        int var4 = 0;
        int var5 = this.field1875[arg0];
        int var6 = this.field1844[arg0];
        int var7 = this.field1871[arg0];
        int var8 = field1880[var5];
        int var9 = field1880[var6];
        int var10 = field1880[var7];
        if (this.field1877 == null) {
            class135.field1923 = 0;
        } else {
            class135.field1923 = this.field1877[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1862[var4] = field1834[var5];
            field1854[var4] = field1876[var5];
            field1903[var4++] = this.field1846[arg0];
        } else {
            int var11 = field1878[var5];
            int var12 = field1879[var5];
            int var13 = this.field1846[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1901[var10 - var8];
                field1862[var4] = (((field1878[var7] - var11) * var14 >> 16) + var11) * class135.field1921 / 50 + var2;
                field1854[var4] = (((field1879[var7] - var12) * var14 >> 16) + var12) * class135.field1921 / 50 + var3;
                field1903[var4++] = ((this.field1848[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1901[var9 - var8];
                field1862[var4] = (((field1878[var6] - var11) * var15 >> 16) + var11) * class135.field1921 / 50 + var2;
                field1854[var4] = (((field1879[var6] - var12) * var15 >> 16) + var12) * class135.field1921 / 50 + var3;
                field1903[var4++] = ((this.field1851[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1862[var4] = field1834[var6];
            field1854[var4] = field1876[var6];
            field1903[var4++] = this.field1851[arg0];
        } else {
            int var16 = field1878[var6];
            int var17 = field1879[var6];
            int var18 = this.field1851[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1901[var8 - var9];
                field1862[var4] = (((field1878[var5] - var16) * var19 >> 16) + var16) * class135.field1921 / 50 + var2;
                field1854[var4] = (((field1879[var5] - var17) * var19 >> 16) + var17) * class135.field1921 / 50 + var3;
                field1903[var4++] = ((this.field1846[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1901[var10 - var9];
                field1862[var4] = (((field1878[var7] - var16) * var20 >> 16) + var16) * class135.field1921 / 50 + var2;
                field1854[var4] = (((field1879[var7] - var17) * var20 >> 16) + var17) * class135.field1921 / 50 + var3;
                field1903[var4++] = ((this.field1848[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1862[var4] = field1834[var7];
            field1854[var4] = field1876[var7];
            field1903[var4++] = this.field1848[arg0];
        } else {
            int var21 = field1878[var7];
            int var22 = field1879[var7];
            int var23 = this.field1848[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1901[var9 - var10];
                field1862[var4] = (((field1878[var6] - var21) * var24 >> 16) + var21) * class135.field1921 / 50 + var2;
                field1854[var4] = (((field1879[var6] - var22) * var24 >> 16) + var22) * class135.field1921 / 50 + var3;
                field1903[var4++] = ((this.field1851[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1901[var8 - var10];
                field1862[var4] = (((field1878[var5] - var21) * var25 >> 16) + var21) * class135.field1921 / 50 + var2;
                field1854[var4] = (((field1879[var5] - var22) * var25 >> 16) + var22) * class135.field1921 / 50 + var3;
                field1903[var4++] = ((this.field1846[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1862[0];
        int var27 = field1862[1];
        int var28 = field1862[2];
        int var29 = field1854[0];
        int var30 = field1854[1];
        int var31 = field1854[2];
        class135.field1944 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1933 || var27 > Statics.field1933 || var28 > Statics.field1933) {
                class135.field1944 = true;
            }
            if (this.field1852 != null && this.field1852[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1872 == null || this.field1872[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1872[arg0] & 0xFF;
                    var33 = this.field1855[var32];
                    var34 = this.field1856[var32];
                    var35 = this.field1857[var32];
                }
                if (this.field1848[arg0] == -1) {
                    class135.method2621(var29, var30, var31, var26, var27, var28, this.field1846[arg0], this.field1846[arg0], this.field1846[arg0], field1878[var33], field1878[var34], field1878[var35], field1879[var33], field1879[var34], field1879[var35], field1880[var33], field1880[var34], field1880[var35], this.field1852[arg0]);
                } else {
                    class135.method2621(var29, var30, var31, var26, var27, var28, field1903[0], field1903[1], field1903[2], field1878[var33], field1878[var34], field1878[var35], field1879[var33], field1879[var34], field1879[var35], field1880[var33], field1880[var34], field1880[var35], this.field1852[arg0]);
                }
            } else if (this.field1848[arg0] == -1) {
                class135.method2637(var29, var30, var31, var26, var27, var28, field1894[this.field1846[arg0]]);
            } else {
                class135.method2623(var29, var30, var31, var26, var27, var28, field1903[0], field1903[1], field1903[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1933 || var27 > Statics.field1933 || var28 > Statics.field1933 || field1862[3] < 0 || field1862[3] > Statics.field1933) {
            class135.field1944 = true;
        }
        if (this.field1852 != null && this.field1852[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1872 == null || this.field1872[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1872[arg0] & 0xFF;
                var37 = this.field1855[var36];
                var38 = this.field1856[var36];
                var39 = this.field1857[var36];
            }
            short var40 = this.field1852[arg0];
            if (this.field1848[arg0] == -1) {
                class135.method2621(var29, var30, var31, var26, var27, var28, this.field1846[arg0], this.field1846[arg0], this.field1846[arg0], field1878[var37], field1878[var38], field1878[var39], field1879[var37], field1879[var38], field1879[var39], field1880[var37], field1880[var38], field1880[var39], var40);
                class135.method2621(var29, var31, field1854[3], var26, var28, field1862[3], this.field1846[arg0], this.field1846[arg0], this.field1846[arg0], field1878[var37], field1878[var38], field1878[var39], field1879[var37], field1879[var38], field1879[var39], field1880[var37], field1880[var38], field1880[var39], var40);
            } else {
                class135.method2621(var29, var30, var31, var26, var27, var28, field1903[0], field1903[1], field1903[2], field1878[var37], field1878[var38], field1878[var39], field1879[var37], field1879[var38], field1879[var39], field1880[var37], field1880[var38], field1880[var39], var40);
                class135.method2621(var29, var31, field1854[3], var26, var28, field1862[3], field1903[0], field1903[2], field1903[3], field1878[var37], field1878[var38], field1878[var39], field1879[var37], field1879[var38], field1879[var39], field1880[var37], field1880[var38], field1880[var39], var40);
            }
        } else if (this.field1848[arg0] == -1) {
            int var41 = field1894[this.field1846[arg0]];
            class135.method2637(var29, var30, var31, var26, var27, var28, var41);
            class135.method2637(var29, var31, field1854[3], var26, var28, field1862[3], var41);
        } else {
            class135.method2623(var29, var30, var31, var26, var27, var28, field1903[0], field1903[1], field1903[2]);
            class135.method2623(var29, var31, field1854[3], var26, var28, field1862[3], field1903[0], field1903[2], field1903[3]);
        }
    }
}
