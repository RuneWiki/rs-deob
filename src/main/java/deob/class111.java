package deob;

@ObfuscatedName("dd")
public class class111 extends class93 {

    @ObfuscatedName("dd.u")
    public static class111 field1837 = new class111();

    @ObfuscatedName("dd.k")
    public static byte[] field1838 = new byte[1];

    @ObfuscatedName("dd.x")
    public static class111 field1839 = new class111();

    @ObfuscatedName("dd.m")
    public static byte[] field1848 = new byte[1];

    @ObfuscatedName("dd.n")
    public int field1841 = 0;

    @ObfuscatedName("dd.q")
    public int[] field1842;

    @ObfuscatedName("dd.a")
    public int[] field1843;

    @ObfuscatedName("dd.g")
    public int[] field1844;

    @ObfuscatedName("dd.j")
    public int field1859 = 0;

    @ObfuscatedName("dd.l")
    public int[] field1846;

    @ObfuscatedName("dd.w")
    public int[] field1847;

    @ObfuscatedName("dd.z")
    public int[] field1895;

    @ObfuscatedName("dd.e")
    public int[] field1885;

    @ObfuscatedName("dd.b")
    public int[] field1889;

    @ObfuscatedName("dd.c")
    public int[] field1851;

    @ObfuscatedName("dd.d")
    public byte[] field1852;

    @ObfuscatedName("dd.h")
    public byte[] field1900;

    @ObfuscatedName("dd.i")
    public byte[] field1854;

    @ObfuscatedName("dd.v")
    public short[] field1855;

    @ObfuscatedName("dd.s")
    public byte field1856 = 0;

    @ObfuscatedName("dd.f")
    public int field1857 = 0;

    @ObfuscatedName("dd.y")
    public int[] field1858;

    @ObfuscatedName("dd.t")
    public int[] field1877;

    @ObfuscatedName("dd.r")
    public int[] field1860;

    @ObfuscatedName("dd.p")
    public int[][] field1861;

    @ObfuscatedName("dd.o")
    public int[][] field1862;

    @ObfuscatedName("dd.ax")
    public boolean field1863 = false;

    @ObfuscatedName("dd.aa")
    public int field1853;

    @ObfuscatedName("dd.af")
    public int field1865;

    @ObfuscatedName("dd.al")
    public int field1866;

    @ObfuscatedName("dd.av")
    public int field1867;

    @ObfuscatedName("dd.ab")
    public int field1864;

    @ObfuscatedName("dd.ai")
    public static boolean[] field1870 = new boolean[4096];

    @ObfuscatedName("dd.ak")
    public static boolean[] field1871 = new boolean[4096];

    @ObfuscatedName("dd.ao")
    public static int[] field1872 = new int[4096];

    @ObfuscatedName("dd.aq")
    public static int[] field1873 = new int[4096];

    @ObfuscatedName("dd.aj")
    public static int[] field1874 = new int[4096];

    @ObfuscatedName("dd.ag")
    public static int[] field1875 = new int[4096];

    @ObfuscatedName("dd.ap")
    public static int[] field1849 = new int[4096];

    @ObfuscatedName("dd.an")
    public static int[] field1845 = new int[4096];

    @ObfuscatedName("dd.au")
    public static int[] field1879 = new int[1600];

    @ObfuscatedName("dd.ay")
    public static int[][] field1880 = new int[1600][512];

    @ObfuscatedName("dd.ah")
    public static int[] field1881 = new int[12];

    @ObfuscatedName("dd.aw")
    public static int[][] field1882 = new int[12][2000];

    @ObfuscatedName("dd.ac")
    public static int[] field1850 = new int[2000];

    @ObfuscatedName("dd.az")
    public static int[] field1884 = new int[2000];

    @ObfuscatedName("dd.am")
    public static int[] field1876 = new int[12];

    @ObfuscatedName("dd.ae")
    public static int[] field1886 = new int[10];

    @ObfuscatedName("dd.at")
    public static int[] field1887 = new int[10];

    @ObfuscatedName("dd.ar")
    public static int[] field1888 = new int[10];

    @ObfuscatedName("dd.bt")
    public static boolean field1892 = false;

    @ObfuscatedName("dd.bl")
    public static int field1893 = 0;

    @ObfuscatedName("dd.bw")
    public static int field1894 = 0;

    @ObfuscatedName("dd.bi")
    public static int field1890 = 0;

    @ObfuscatedName("dd.bn")
    public static int[] field1902 = new int[1000];

    @ObfuscatedName("dd.bq")
    public static int[] field1897 = class103.field1761;

    @ObfuscatedName("dd.bp")
    public static int[] field1898 = class103.field1747;

    @ObfuscatedName("dd.bb")
    public static int[] field1899 = class103.field1746;

    @ObfuscatedName("dd.bg")
    public static int[] field1883 = class103.field1759;

    public class111() {
    }

    public class111(class111[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1841 = 0;
        this.field1859 = 0;
        this.field1857 = 0;
        this.field1856 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class111 var8 = arg0[var7];
            if (var8 != null) {
                this.field1841 += var8.field1841;
                this.field1859 += var8.field1859;
                this.field1857 += var8.field1857;
                if (var8.field1852 == null) {
                    if (this.field1856 == -1) {
                        this.field1856 = var8.field1856;
                    }
                    if (this.field1856 != var8.field1856) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1900 != null;
                var5 |= var8.field1855 != null;
                var6 |= var8.field1854 != null;
            }
        }
        this.field1842 = new int[this.field1841];
        this.field1843 = new int[this.field1841];
        this.field1844 = new int[this.field1841];
        this.field1846 = new int[this.field1859];
        this.field1847 = new int[this.field1859];
        this.field1895 = new int[this.field1859];
        this.field1885 = new int[this.field1859];
        this.field1889 = new int[this.field1859];
        this.field1851 = new int[this.field1859];
        if (var3) {
            this.field1852 = new byte[this.field1859];
        }
        if (var4) {
            this.field1900 = new byte[this.field1859];
        }
        if (var5) {
            this.field1855 = new short[this.field1859];
        }
        if (var6) {
            this.field1854 = new byte[this.field1859];
        }
        if (this.field1857 > 0) {
            this.field1858 = new int[this.field1857];
            this.field1877 = new int[this.field1857];
            this.field1860 = new int[this.field1857];
        }
        this.field1841 = 0;
        this.field1859 = 0;
        this.field1857 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class111 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1859; var11++) {
                    this.field1846[this.field1859] = var10.field1846[var11] + this.field1841;
                    this.field1847[this.field1859] = var10.field1847[var11] + this.field1841;
                    this.field1895[this.field1859] = var10.field1895[var11] + this.field1841;
                    this.field1885[this.field1859] = var10.field1885[var11];
                    this.field1889[this.field1859] = var10.field1889[var11];
                    this.field1851[this.field1859] = var10.field1851[var11];
                    if (var3) {
                        if (var10.field1852 == null) {
                            this.field1852[this.field1859] = var10.field1856;
                        } else {
                            this.field1852[this.field1859] = var10.field1852[var11];
                        }
                    }
                    if (var4 && var10.field1900 != null) {
                        this.field1900[this.field1859] = var10.field1900[var11];
                    }
                    if (var5) {
                        if (var10.field1855 == null) {
                            this.field1855[this.field1859] = -1;
                        } else {
                            this.field1855[this.field1859] = var10.field1855[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1854 == null || var10.field1854[var11] == -1) {
                            this.field1854[this.field1859] = -1;
                        } else {
                            this.field1854[this.field1859] = (byte) (var10.field1854[var11] + this.field1857);
                        }
                    }
                    this.field1859++;
                }
                for (int var12 = 0; var12 < var10.field1857; var12++) {
                    this.field1858[this.field1857] = var10.field1858[var12] + this.field1841;
                    this.field1877[this.field1857] = var10.field1877[var12] + this.field1841;
                    this.field1860[this.field1857] = var10.field1860[var12] + this.field1841;
                    this.field1857++;
                }
                for (int var13 = 0; var13 < var10.field1841; var13++) {
                    this.field1842[this.field1841] = var10.field1842[var13];
                    this.field1843[this.field1841] = var10.field1843[var13];
                    this.field1844[this.field1841] = var10.field1844[var13];
                    this.field1841++;
                }
            }
        }
    }

    @ObfuscatedName("dd.u([[IIIIZI)Ldd;")
    public class111 method2233(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2281();
        int var7 = arg1 - this.field1866;
        int var8 = this.field1866 + arg1;
        int var9 = arg3 - this.field1866;
        int var10 = this.field1866 + arg3;
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
            var15.field1841 = this.field1841;
            var15.field1859 = this.field1859;
            var15.field1857 = this.field1857;
            var15.field1842 = this.field1842;
            var15.field1844 = this.field1844;
            var15.field1846 = this.field1846;
            var15.field1847 = this.field1847;
            var15.field1895 = this.field1895;
            var15.field1885 = this.field1885;
            var15.field1889 = this.field1889;
            var15.field1851 = this.field1851;
            var15.field1852 = this.field1852;
            var15.field1900 = this.field1900;
            var15.field1854 = this.field1854;
            var15.field1855 = this.field1855;
            var15.field1856 = this.field1856;
            var15.field1858 = this.field1858;
            var15.field1877 = this.field1877;
            var15.field1860 = this.field1860;
            var15.field1861 = this.field1861;
            var15.field1862 = this.field1862;
            var15.field1863 = this.field1863;
            var15.field1843 = new int[var15.field1841];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1841; var16++) {
                int var17 = this.field1842[var16] + arg1;
                int var18 = this.field1844[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1843[var16] = this.field1843[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1841; var26++) {
                int var27 = (-this.field1843[var26] << 16) / this.field1525;
                if (var27 < arg5) {
                    int var28 = this.field1842[var26] + arg1;
                    int var29 = this.field1844[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1843[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1843[var26];
                }
            }
        }
        var15.field1853 = 0;
        return var15;
    }

    @ObfuscatedName("dd.x(Z)Ldd;")
    public class111 method2234(boolean arg0) {
        if (!arg0 && field1838.length < this.field1859) {
            field1838 = new byte[this.field1859 + 100];
        }
        return this.method2236(arg0, field1837, field1838);
    }

    @ObfuscatedName("dd.m(Z)Ldd;")
    public class111 method2235(boolean arg0) {
        if (!arg0 && field1848.length < this.field1859) {
            field1848 = new byte[this.field1859 + 100];
        }
        return this.method2236(arg0, field1839, field1848);
    }

    @ObfuscatedName("dd.n(ZLdd;[B)Ldd;")
    public class111 method2236(boolean arg0, class111 arg1, byte[] arg2) {
        arg1.field1841 = this.field1841;
        arg1.field1859 = this.field1859;
        arg1.field1857 = this.field1857;
        if (arg1.field1842 == null || arg1.field1842.length < this.field1841) {
            arg1.field1842 = new int[this.field1841 + 100];
            arg1.field1843 = new int[this.field1841 + 100];
            arg1.field1844 = new int[this.field1841 + 100];
        }
        for (int var4 = 0; var4 < this.field1841; var4++) {
            arg1.field1842[var4] = this.field1842[var4];
            arg1.field1843[var4] = this.field1843[var4];
            arg1.field1844[var4] = this.field1844[var4];
        }
        if (arg0) {
            arg1.field1900 = this.field1900;
        } else {
            arg1.field1900 = arg2;
            if (this.field1900 == null) {
                for (int var5 = 0; var5 < this.field1859; var5++) {
                    arg1.field1900[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1859; var6++) {
                    arg1.field1900[var6] = this.field1900[var6];
                }
            }
        }
        arg1.field1846 = this.field1846;
        arg1.field1847 = this.field1847;
        arg1.field1895 = this.field1895;
        arg1.field1885 = this.field1885;
        arg1.field1889 = this.field1889;
        arg1.field1851 = this.field1851;
        arg1.field1852 = this.field1852;
        arg1.field1854 = this.field1854;
        arg1.field1855 = this.field1855;
        arg1.field1856 = this.field1856;
        arg1.field1858 = this.field1858;
        arg1.field1877 = this.field1877;
        arg1.field1860 = this.field1860;
        arg1.field1861 = this.field1861;
        arg1.field1862 = this.field1862;
        arg1.field1863 = this.field1863;
        arg1.field1853 = 0;
        return arg1;
    }

    @ObfuscatedName("dd.q()V")
    public void method2281() {
        if (this.field1853 == 1) {
            return;
        }
        this.field1853 = 1;
        this.field1525 = 0;
        this.field1865 = 0;
        this.field1866 = 0;
        for (int var1 = 0; var1 < this.field1841; var1++) {
            int var2 = this.field1842[var1];
            int var3 = this.field1843[var1];
            int var4 = this.field1844[var1];
            if (-var3 > this.field1525) {
                this.field1525 = -var3;
            }
            if (var3 > this.field1865) {
                this.field1865 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1866) {
                this.field1866 = var5;
            }
        }
        this.field1866 = (int) (Math.sqrt((double) this.field1866) + 0.99D);
        this.field1864 = (int) (Math.sqrt((double) (this.field1525 * this.field1525 + this.field1866 * this.field1866)) + 0.99D);
        this.field1867 = this.field1864 + (int) (Math.sqrt((double) (this.field1866 * this.field1866 + this.field1865 * this.field1865)) + 0.99D);
    }

    @ObfuscatedName("dd.a()V")
    public void method2237() {
        if (this.field1853 == 2) {
            return;
        }
        this.field1853 = 2;
        this.field1866 = 0;
        for (int var1 = 0; var1 < this.field1841; var1++) {
            int var2 = this.field1842[var1];
            int var3 = this.field1843[var1];
            int var4 = this.field1844[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1866) {
                this.field1866 = var5;
            }
        }
        this.field1866 = (int) (Math.sqrt((double) this.field1866) + 0.99D);
        this.field1864 = this.field1866;
        this.field1867 = this.field1866 + this.field1866;
    }

    @ObfuscatedName("dd.g()I")
    public int method2300() {
        this.method2281();
        return this.field1866;
    }

    @ObfuscatedName("dd.w(Ldw;I)V")
    public void method2269(class108 arg0, int arg1) {
        if (this.field1861 == null || arg1 == -1) {
            return;
        }
        class96 var3 = arg0.field1800[arg1];
        class104 var4 = var3.field1604;
        Statics.field1896 = 0;
        Statics.field1868 = 0;
        Statics.field1891 = 0;
        for (int var5 = 0; var5 < var3.field1605; var5++) {
            int var6 = var3.field1606[var5];
            this.method2232(var4.field1765[var6], var4.field1764[var6], var3.field1607[var5], var3.field1608[var5], var3.field1609[var5]);
        }
        this.field1853 = 0;
    }

    @ObfuscatedName("dd.z(Ldw;ILdw;I[I)V")
    public void method2241(class108 arg0, int arg1, class108 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2269(arg0, arg1);
            return;
        }
        class96 var6 = arg0.field1800[arg1];
        class96 var7 = arg2.field1800[arg3];
        class104 var8 = var6.field1604;
        Statics.field1896 = 0;
        Statics.field1868 = 0;
        Statics.field1891 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1605; var11++) {
            int var12 = var6.field1606[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1765[var12] == 0) {
                this.method2232(var8.field1765[var12], var8.field1764[var12], var6.field1607[var11], var6.field1608[var11], var6.field1609[var11]);
            }
        }
        Statics.field1896 = 0;
        Statics.field1868 = 0;
        Statics.field1891 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1605; var15++) {
            int var16 = var7.field1606[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1765[var16] == 0) {
                this.method2232(var8.field1765[var16], var8.field1764[var16], var7.field1607[var15], var7.field1608[var15], var7.field1609[var15]);
            }
        }
        this.field1853 = 0;
    }

    @ObfuscatedName("dd.e(I[IIII)V")
    public void method2232(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1896 = 0;
            Statics.field1868 = 0;
            Statics.field1891 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1861.length) {
                    int[] var10 = this.field1861[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1896 += this.field1842[var12];
                        Statics.field1868 += this.field1843[var12];
                        Statics.field1891 += this.field1844[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1896 = Statics.field1896 / var7 + arg2;
                Statics.field1868 = Statics.field1868 / var7 + arg3;
                Statics.field1891 = Statics.field1891 / var7 + arg4;
            } else {
                Statics.field1896 = arg2;
                Statics.field1868 = arg3;
                Statics.field1891 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1861.length) {
                    int[] var15 = this.field1861[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1842[var17] += arg2;
                        this.field1843[var17] += arg3;
                        this.field1844[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1861.length) {
                    int[] var20 = this.field1861[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1842[var22] -= Statics.field1896;
                        this.field1843[var22] -= Statics.field1868;
                        this.field1844[var22] -= Statics.field1891;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1897[var25];
                            int var27 = field1898[var25];
                            int var28 = this.field1843[var22] * var26 + this.field1842[var22] * var27 >> 16;
                            this.field1843[var22] = this.field1843[var22] * var27 - this.field1842[var22] * var26 >> 16;
                            this.field1842[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1897[var23];
                            int var30 = field1898[var23];
                            int var31 = this.field1843[var22] * var30 - this.field1844[var22] * var29 >> 16;
                            this.field1844[var22] = this.field1844[var22] * var30 + this.field1843[var22] * var29 >> 16;
                            this.field1843[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1897[var24];
                            int var33 = field1898[var24];
                            int var34 = this.field1844[var22] * var32 + this.field1842[var22] * var33 >> 16;
                            this.field1844[var22] = this.field1844[var22] * var33 - this.field1842[var22] * var32 >> 16;
                            this.field1842[var22] = var34;
                        }
                        this.field1842[var22] += Statics.field1896;
                        this.field1843[var22] += Statics.field1868;
                        this.field1844[var22] += Statics.field1891;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1861.length) {
                    int[] var37 = this.field1861[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1842[var39] -= Statics.field1896;
                        this.field1843[var39] -= Statics.field1868;
                        this.field1844[var39] -= Statics.field1891;
                        this.field1842[var39] = this.field1842[var39] * arg2 / 128;
                        this.field1843[var39] = this.field1843[var39] * arg3 / 128;
                        this.field1844[var39] = this.field1844[var39] * arg4 / 128;
                        this.field1842[var39] += Statics.field1896;
                        this.field1843[var39] += Statics.field1868;
                        this.field1844[var39] += Statics.field1891;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1862 != null && this.field1900 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1862.length) {
                    int[] var42 = this.field1862[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1900[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1900[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dd.b()V")
    public void method2243() {
        for (int var1 = 0; var1 < this.field1841; var1++) {
            int var2 = this.field1842[var1];
            this.field1842[var1] = this.field1844[var1];
            this.field1844[var1] = -var2;
        }
        this.field1853 = 0;
    }

    @ObfuscatedName("dd.c()V")
    public void method2244() {
        for (int var1 = 0; var1 < this.field1841; var1++) {
            this.field1842[var1] = -this.field1842[var1];
            this.field1844[var1] = -this.field1844[var1];
        }
        this.field1853 = 0;
    }

    @ObfuscatedName("dd.d()V")
    public void method2255() {
        for (int var1 = 0; var1 < this.field1841; var1++) {
            int var2 = this.field1844[var1];
            this.field1844[var1] = this.field1842[var1];
            this.field1842[var1] = -var2;
        }
        this.field1853 = 0;
    }

    @ObfuscatedName("dd.h(I)V")
    public void method2246(int arg0) {
        int var2 = field1897[arg0];
        int var3 = field1898[arg0];
        for (int var4 = 0; var4 < this.field1841; var4++) {
            int var5 = this.field1843[var4] * var3 - this.field1844[var4] * var2 >> 16;
            this.field1844[var4] = this.field1844[var4] * var3 + this.field1843[var4] * var2 >> 16;
            this.field1843[var4] = var5;
        }
        this.field1853 = 0;
    }

    @ObfuscatedName("dd.i(III)V")
    public void method2247(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1841; var4++) {
            this.field1842[var4] += arg0;
            this.field1843[var4] += arg1;
            this.field1844[var4] += arg2;
        }
        this.field1853 = 0;
    }

    @ObfuscatedName("dd.v(III)V")
    public void method2279(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1841; var4++) {
            this.field1842[var4] = this.field1842[var4] * arg0 / 128;
            this.field1843[var4] = this.field1843[var4] * arg1 / 128;
            this.field1844[var4] = this.field1844[var4] * arg2 / 128;
        }
        this.field1853 = 0;
    }

    @ObfuscatedName("dd.s(IIIIIII)V")
    public final void method2249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1879[0] = -1;
        if (this.field1853 != 2 && this.field1853 != 1) {
            this.method2237();
        }
        int var8 = Statics.field1748;
        int var9 = Statics.field1749;
        int var10 = field1897[arg0];
        int var11 = field1898[arg0];
        int var12 = field1897[arg1];
        int var13 = field1898[arg1];
        int var14 = field1897[arg2];
        int var15 = field1898[arg2];
        int var16 = field1897[arg3];
        int var17 = field1898[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1841; var19++) {
            int var20 = this.field1842[var19];
            int var21 = this.field1843[var19];
            int var22 = this.field1844[var19];
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
            field1874[var19] = var30 - var18;
            field1872[var19] = (var26 << 9) / var30 + var8;
            field1873[var19] = (var29 << 9) / var30 + var9;
            if (this.field1857 > 0) {
                field1875[var19] = var26;
                field1849[var19] = var29;
                field1845[var19] = var30;
            }
        }
        try {
            this.method2242(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dd.f(IIIIIIII)V")
    public final void method2272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1879[0] = -1;
        if (this.field1853 != 2 && this.field1853 != 1) {
            this.method2237();
        }
        int var9 = Statics.field1748;
        int var10 = Statics.field1749;
        int var11 = field1897[arg0];
        int var12 = field1898[arg0];
        int var13 = field1897[arg1];
        int var14 = field1898[arg1];
        int var15 = field1897[arg2];
        int var16 = field1898[arg2];
        int var17 = field1897[arg3];
        int var18 = field1898[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1841; var20++) {
            int var21 = this.field1842[var20];
            int var22 = this.field1843[var20];
            int var23 = this.field1844[var20];
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
            field1874[var20] = var31 - var19;
            field1872[var20] = (var27 << 9) / arg7 + var9;
            field1873[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1857 > 0) {
                field1875[var20] = var27;
                field1849[var20] = var30;
                field1845[var20] = var31;
            }
        }
        try {
            this.method2242(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dd.al(IIIIIIIII)V")
    public void method1854(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1879[0] = -1;
        if (this.field1853 != 1) {
            this.method2281();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1866 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1866 << 9;
        if (var15 / var13 >= Statics.field1753) {
            return;
        }
        int var16 = this.field1866 + var14 << 9;
        if (var16 / var13 <= Statics.field1760) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1866 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1754) {
            return;
        }
        int var20 = (this.field1525 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1755) {
            return;
        }
        int var22 = (this.field1525 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1857 > 0;
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
            int var32 = field1893 - Statics.field1748;
            int var33 = field1894 - Statics.field1749;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1863) {
                    field1902[field1890++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1748;
        int var35 = Statics.field1749;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1897[arg0];
            var37 = field1898[arg0];
        }
        for (int var38 = 0; var38 < this.field1841; var38++) {
            int var39 = this.field1842[var38];
            int var40 = this.field1843[var38];
            int var41 = this.field1844[var38];
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
            field1874[var38] = var50 - var11;
            if (var50 >= 50) {
                field1872[var38] = (var46 << 9) / var50 + var34;
                field1873[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1872[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1875[var38] = var46;
                field1849[var38] = var49;
                field1845[var38] = var50;
            }
        }
        try {
            this.method2242(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dd.y(ZZI)V")
    public final void method2242(boolean arg0, boolean arg1, int arg2) {
        if (this.field1867 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1867; var4++) {
            field1879[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1859; var5++) {
            if (this.field1851[var5] != -2) {
                int var6 = this.field1846[var5];
                int var7 = this.field1847[var5];
                int var8 = this.field1895[var5];
                int var9 = field1872[var6];
                int var10 = field1872[var7];
                int var11 = field1872[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1875[var6];
                    int var13 = field1875[var7];
                    int var14 = field1875[var8];
                    int var15 = field1849[var6];
                    int var16 = field1849[var7];
                    int var17 = field1849[var8];
                    int var18 = field1845[var6];
                    int var19 = field1845[var7];
                    int var20 = field1845[var8];
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
                        field1871[var5] = true;
                        int var30 = (field1874[var6] + field1874[var7] + field1874[var8]) / 3 + this.field1864;
                        field1880[var30][field1879[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2239(field1893, field1894, field1873[var6], field1873[var7], field1873[var8], var9, var10, var11)) {
                        field1902[field1890++] = arg2;
                        arg1 = false;
                    }
                    if ((field1873[var8] - field1873[var7]) * (var9 - var10) - (field1873[var6] - field1873[var7]) * (var11 - var10) > 0) {
                        field1871[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1750 && var10 <= Statics.field1750 && var11 <= Statics.field1750) {
                            field1870[var5] = false;
                        } else {
                            field1870[var5] = true;
                        }
                        int var31 = (field1874[var6] + field1874[var7] + field1874[var8]) / 3 + this.field1864;
                        field1880[var31][field1879[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1852 == null) {
            for (int var32 = this.field1867 - 1; var32 >= 0; var32--) {
                int var33 = field1879[var32];
                if (var33 > 0) {
                    int[] var34 = field1880[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2251(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1881[var36] = 0;
            field1876[var36] = 0;
        }
        for (int var37 = this.field1867 - 1; var37 >= 0; var37--) {
            int var38 = field1879[var37];
            if (var38 > 0) {
                int[] var39 = field1880[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1852[var41];
                    int var43 = field1881[var42]++;
                    field1882[var42][var43] = var41;
                    if (var42 < 10) {
                        field1876[var42] += var37;
                    } else if (var42 == 10) {
                        field1850[var43] = var37;
                    } else {
                        field1884[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1881[1] > 0 || field1881[2] > 0) {
            var44 = (field1876[1] + field1876[2]) / (field1881[1] + field1881[2]);
        }
        int var45 = 0;
        if (field1881[3] > 0 || field1881[4] > 0) {
            var45 = (field1876[3] + field1876[4]) / (field1881[3] + field1881[4]);
        }
        int var46 = 0;
        if (field1881[6] > 0 || field1881[8] > 0) {
            var46 = (field1876[6] + field1876[8]) / (field1881[6] + field1881[8]);
        }
        int var47 = 0;
        int var48 = field1881[10];
        int[] var49 = field1882[10];
        int[] var50 = field1850;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1881[11];
            var49 = field1882[11];
            var50 = field1884;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2251(var49[var47++]);
                if (var47 == var48 && field1882[11] != var49) {
                    var47 = 0;
                    var48 = field1881[11];
                    var49 = field1882[11];
                    var50 = field1884;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2251(var49[var47++]);
                if (var47 == var48 && field1882[11] != var49) {
                    var47 = 0;
                    var48 = field1881[11];
                    var49 = field1882[11];
                    var50 = field1884;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2251(var49[var47++]);
                if (var47 == var48 && field1882[11] != var49) {
                    var47 = 0;
                    var48 = field1881[11];
                    var49 = field1882[11];
                    var50 = field1884;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1881[var52];
            int[] var54 = field1882[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2251(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2251(var49[var47++]);
            if (var47 == var48 && field1882[11] != var49) {
                var47 = 0;
                var49 = field1882[11];
                var48 = field1881[11];
                var50 = field1884;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dd.t(I)V")
    public final void method2251(int arg0) {
        if (field1871[arg0]) {
            this.method2252(arg0);
            return;
        }
        int var2 = this.field1846[arg0];
        int var3 = this.field1847[arg0];
        int var4 = this.field1895[arg0];
        class103.field1762 = field1870[arg0];
        if (this.field1900 == null) {
            class103.field1757 = 0;
        } else {
            class103.field1757 = this.field1900[arg0] & 0xFF;
        }
        if (this.field1855 != null && this.field1855[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1854 == null || this.field1854[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1854[arg0] & 0xFF;
                var6 = this.field1858[var5];
                var7 = this.field1877[var5];
                var8 = this.field1860[var5];
            }
            if (this.field1851[arg0] == -1) {
                class103.method2144(field1873[var2], field1873[var3], field1873[var4], field1872[var2], field1872[var3], field1872[var4], this.field1885[arg0], this.field1885[arg0], this.field1885[arg0], field1875[var6], field1875[var7], field1875[var8], field1849[var6], field1849[var7], field1849[var8], field1845[var6], field1845[var7], field1845[var8], this.field1855[arg0]);
            } else {
                class103.method2144(field1873[var2], field1873[var3], field1873[var4], field1872[var2], field1872[var3], field1872[var4], this.field1885[arg0], this.field1889[arg0], this.field1851[arg0], field1875[var6], field1875[var7], field1875[var8], field1849[var6], field1849[var7], field1849[var8], field1845[var6], field1845[var7], field1845[var8], this.field1855[arg0]);
            }
        } else if (this.field1851[arg0] == -1) {
            class103.method2164(field1873[var2], field1873[var3], field1873[var4], field1872[var2], field1872[var3], field1872[var4], field1899[this.field1885[arg0]]);
        } else {
            class103.method2185(field1873[var2], field1873[var3], field1873[var4], field1872[var2], field1872[var3], field1872[var4], this.field1885[arg0], this.field1889[arg0], this.field1851[arg0]);
        }
    }

    @ObfuscatedName("dd.r(I)V")
    public final void method2252(int arg0) {
        int var2 = Statics.field1748;
        int var3 = Statics.field1749;
        int var4 = 0;
        int var5 = this.field1846[arg0];
        int var6 = this.field1847[arg0];
        int var7 = this.field1895[arg0];
        int var8 = field1845[var5];
        int var9 = field1845[var6];
        int var10 = field1845[var7];
        if (this.field1900 == null) {
            class103.field1757 = 0;
        } else {
            class103.field1757 = this.field1900[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1886[var4] = field1872[var5];
            field1887[var4] = field1873[var5];
            field1888[var4++] = this.field1885[arg0];
        } else {
            int var11 = field1875[var5];
            int var12 = field1849[var5];
            int var13 = this.field1885[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1883[var10 - var8];
                field1886[var4] = (((field1875[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1887[var4] = (((field1849[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1888[var4++] = ((this.field1851[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1883[var9 - var8];
                field1886[var4] = (((field1875[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1887[var4] = (((field1849[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1888[var4++] = ((this.field1889[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1886[var4] = field1872[var6];
            field1887[var4] = field1873[var6];
            field1888[var4++] = this.field1889[arg0];
        } else {
            int var16 = field1875[var6];
            int var17 = field1849[var6];
            int var18 = this.field1889[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1883[var8 - var9];
                field1886[var4] = (((field1875[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1887[var4] = (((field1849[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1888[var4++] = ((this.field1885[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1883[var10 - var9];
                field1886[var4] = (((field1875[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1887[var4] = (((field1849[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1888[var4++] = ((this.field1851[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1886[var4] = field1872[var7];
            field1887[var4] = field1873[var7];
            field1888[var4++] = this.field1851[arg0];
        } else {
            int var21 = field1875[var7];
            int var22 = field1849[var7];
            int var23 = this.field1851[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1883[var9 - var10];
                field1886[var4] = (((field1875[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1887[var4] = (((field1849[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1888[var4++] = ((this.field1889[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1883[var8 - var10];
                field1886[var4] = (((field1875[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1887[var4] = (((field1849[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1888[var4++] = ((this.field1885[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1886[0];
        int var27 = field1886[1];
        int var28 = field1886[2];
        int var29 = field1887[0];
        int var30 = field1887[1];
        int var31 = field1887[2];
        class103.field1762 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1750 || var27 > Statics.field1750 || var28 > Statics.field1750) {
                class103.field1762 = true;
            }
            if (this.field1855 != null && this.field1855[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1854 == null || this.field1854[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1854[arg0] & 0xFF;
                    var33 = this.field1858[var32];
                    var34 = this.field1877[var32];
                    var35 = this.field1860[var32];
                }
                if (this.field1851[arg0] == -1) {
                    class103.method2144(var29, var30, var31, var26, var27, var28, this.field1885[arg0], this.field1885[arg0], this.field1885[arg0], field1875[var33], field1875[var34], field1875[var35], field1849[var33], field1849[var34], field1849[var35], field1845[var33], field1845[var34], field1845[var35], this.field1855[arg0]);
                } else {
                    class103.method2144(var29, var30, var31, var26, var27, var28, field1888[0], field1888[1], field1888[2], field1875[var33], field1875[var34], field1875[var35], field1849[var33], field1849[var34], field1849[var35], field1845[var33], field1845[var34], field1845[var35], this.field1855[arg0]);
                }
            } else if (this.field1851[arg0] == -1) {
                class103.method2164(var29, var30, var31, var26, var27, var28, field1899[this.field1885[arg0]]);
            } else {
                class103.method2185(var29, var30, var31, var26, var27, var28, field1888[0], field1888[1], field1888[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1750 || var27 > Statics.field1750 || var28 > Statics.field1750 || field1886[3] < 0 || field1886[3] > Statics.field1750) {
            class103.field1762 = true;
        }
        if (this.field1855 != null && this.field1855[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1854 == null || this.field1854[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1854[arg0] & 0xFF;
                var37 = this.field1858[var36];
                var38 = this.field1877[var36];
                var39 = this.field1860[var36];
            }
            short var40 = this.field1855[arg0];
            if (this.field1851[arg0] == -1) {
                class103.method2144(var29, var30, var31, var26, var27, var28, this.field1885[arg0], this.field1885[arg0], this.field1885[arg0], field1875[var37], field1875[var38], field1875[var39], field1849[var37], field1849[var38], field1849[var39], field1845[var37], field1845[var38], field1845[var39], var40);
                class103.method2144(var29, var31, field1887[3], var26, var28, field1886[3], this.field1885[arg0], this.field1885[arg0], this.field1885[arg0], field1875[var37], field1875[var38], field1875[var39], field1849[var37], field1849[var38], field1849[var39], field1845[var37], field1845[var38], field1845[var39], var40);
            } else {
                class103.method2144(var29, var30, var31, var26, var27, var28, field1888[0], field1888[1], field1888[2], field1875[var37], field1875[var38], field1875[var39], field1849[var37], field1849[var38], field1849[var39], field1845[var37], field1845[var38], field1845[var39], var40);
                class103.method2144(var29, var31, field1887[3], var26, var28, field1886[3], field1888[0], field1888[2], field1888[3], field1875[var37], field1875[var38], field1875[var39], field1849[var37], field1849[var38], field1849[var39], field1845[var37], field1845[var38], field1845[var39], var40);
            }
        } else if (this.field1851[arg0] == -1) {
            int var41 = field1899[this.field1885[arg0]];
            class103.method2164(var29, var30, var31, var26, var27, var28, var41);
            class103.method2164(var29, var31, field1887[3], var26, var28, field1886[3], var41);
        } else {
            class103.method2185(var29, var30, var31, var26, var27, var28, field1888[0], field1888[1], field1888[2]);
            class103.method2185(var29, var31, field1887[3], var26, var28, field1886[3], field1888[0], field1888[2], field1888[3]);
        }
    }

    @ObfuscatedName("dd.p(IIIIIIII)Z")
    public final boolean method2239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
