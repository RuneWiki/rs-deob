package deob;

@ObfuscatedName("dh")
public class class111 extends class93 {

    @ObfuscatedName("dh.z")
    public static class111 field1858 = new class111();

    @ObfuscatedName("dh.h")
    public static byte[] field1840 = new byte[1];

    @ObfuscatedName("dh.c")
    public static class111 field1886 = new class111();

    @ObfuscatedName("dh.p")
    public static byte[] field1853 = new byte[1];

    @ObfuscatedName("dh.i")
    public int field1875 = 0;

    @ObfuscatedName("dh.v")
    public int[] field1888;

    @ObfuscatedName("dh.l")
    public int[] field1845;

    @ObfuscatedName("dh.m")
    public int[] field1855;

    @ObfuscatedName("dh.g")
    public int field1847 = 0;

    @ObfuscatedName("dh.t")
    public int[] field1848;

    @ObfuscatedName("dh.o")
    public int[] field1849;

    @ObfuscatedName("dh.b")
    public int[] field1844;

    @ObfuscatedName("dh.d")
    public int[] field1851;

    @ObfuscatedName("dh.k")
    public int[] field1852;

    @ObfuscatedName("dh.f")
    public int[] field1839;

    @ObfuscatedName("dh.e")
    public byte[] field1846;

    @ObfuscatedName("dh.u")
    public byte[] field1841;

    @ObfuscatedName("dh.n")
    public byte[] field1843;

    @ObfuscatedName("dh.q")
    public short[] field1854;

    @ObfuscatedName("dh.y")
    public byte field1856 = 0;

    @ObfuscatedName("dh.a")
    public int field1859 = 0;

    @ObfuscatedName("dh.r")
    public int[] field1860;

    @ObfuscatedName("dh.x")
    public int[] field1861;

    @ObfuscatedName("dh.w")
    public int[] field1862;

    @ObfuscatedName("dh.j")
    public int[][] field1850;

    @ObfuscatedName("dh.s")
    public int[][] field1864;

    @ObfuscatedName("dh.au")
    public boolean field1865 = false;

    @ObfuscatedName("dh.ay")
    public int field1866;

    @ObfuscatedName("dh.ar")
    public int field1867;

    @ObfuscatedName("dh.aj")
    public int field1863;

    @ObfuscatedName("dh.ad")
    public int field1869;

    @ObfuscatedName("dh.at")
    public int field1887;

    @ObfuscatedName("dh.aw")
    public static boolean[] field1872 = new boolean[4096];

    @ObfuscatedName("dh.ax")
    public static boolean[] field1873 = new boolean[4096];

    @ObfuscatedName("dh.am")
    public static int[] field1874 = new int[4096];

    @ObfuscatedName("dh.an")
    public static int[] field1868 = new int[4096];

    @ObfuscatedName("dh.ap")
    public static int[] field1876 = new int[4096];

    @ObfuscatedName("dh.ae")
    public static int[] field1877 = new int[4096];

    @ObfuscatedName("dh.av")
    public static int[] field1857 = new int[4096];

    @ObfuscatedName("dh.ac")
    public static int[] field1879 = new int[4096];

    @ObfuscatedName("dh.ak")
    public static int[] field1881 = new int[1600];

    @ObfuscatedName("dh.ag")
    public static int[][] field1893 = new int[1600][512];

    @ObfuscatedName("dh.ah")
    public static int[] field1883 = new int[12];

    @ObfuscatedName("dh.af")
    public static int[][] field1884 = new int[12][2000];

    @ObfuscatedName("dh.aa")
    public static int[] field1885 = new int[2000];

    @ObfuscatedName("dh.ab")
    public static int[] field1870 = new int[2000];

    @ObfuscatedName("dh.ao")
    public static int[] field1878 = new int[12];

    @ObfuscatedName("dh.al")
    public static int[] field1897 = new int[10];

    @ObfuscatedName("dh.aq")
    public static int[] field1889 = new int[10];

    @ObfuscatedName("dh.az")
    public static int[] field1890 = new int[10];

    @ObfuscatedName("dh.bt")
    public static boolean field1894 = false;

    @ObfuscatedName("dh.bu")
    public static int field1895 = 0;

    @ObfuscatedName("dh.bc")
    public static int field1896 = 0;

    @ObfuscatedName("dh.bw")
    public static int field1842 = 0;

    @ObfuscatedName("dh.bj")
    public static int[] field1898 = new int[1000];

    @ObfuscatedName("dh.bl")
    public static int[] field1882 = class103.field1757;

    @ObfuscatedName("dh.be")
    public static int[] field1900 = class103.field1746;

    @ObfuscatedName("dh.bz")
    public static int[] field1901 = class103.field1758;

    @ObfuscatedName("dh.bm")
    public static int[] field1902 = class103.field1761;

    public class111() {
    }

    public class111(class111[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1875 = 0;
        this.field1847 = 0;
        this.field1859 = 0;
        this.field1856 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class111 var8 = arg0[var7];
            if (var8 != null) {
                this.field1875 += var8.field1875;
                this.field1847 += var8.field1847;
                this.field1859 += var8.field1859;
                if (var8.field1846 == null) {
                    if (this.field1856 == -1) {
                        this.field1856 = var8.field1856;
                    }
                    if (this.field1856 != var8.field1856) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1841 != null;
                var5 |= var8.field1854 != null;
                var6 |= var8.field1843 != null;
            }
        }
        this.field1888 = new int[this.field1875];
        this.field1845 = new int[this.field1875];
        this.field1855 = new int[this.field1875];
        this.field1848 = new int[this.field1847];
        this.field1849 = new int[this.field1847];
        this.field1844 = new int[this.field1847];
        this.field1851 = new int[this.field1847];
        this.field1852 = new int[this.field1847];
        this.field1839 = new int[this.field1847];
        if (var3) {
            this.field1846 = new byte[this.field1847];
        }
        if (var4) {
            this.field1841 = new byte[this.field1847];
        }
        if (var5) {
            this.field1854 = new short[this.field1847];
        }
        if (var6) {
            this.field1843 = new byte[this.field1847];
        }
        if (this.field1859 > 0) {
            this.field1860 = new int[this.field1859];
            this.field1861 = new int[this.field1859];
            this.field1862 = new int[this.field1859];
        }
        this.field1875 = 0;
        this.field1847 = 0;
        this.field1859 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class111 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1847; var11++) {
                    this.field1848[this.field1847] = var10.field1848[var11] + this.field1875;
                    this.field1849[this.field1847] = var10.field1849[var11] + this.field1875;
                    this.field1844[this.field1847] = var10.field1844[var11] + this.field1875;
                    this.field1851[this.field1847] = var10.field1851[var11];
                    this.field1852[this.field1847] = var10.field1852[var11];
                    this.field1839[this.field1847] = var10.field1839[var11];
                    if (var3) {
                        if (var10.field1846 == null) {
                            this.field1846[this.field1847] = var10.field1856;
                        } else {
                            this.field1846[this.field1847] = var10.field1846[var11];
                        }
                    }
                    if (var4 && var10.field1841 != null) {
                        this.field1841[this.field1847] = var10.field1841[var11];
                    }
                    if (var5) {
                        if (var10.field1854 == null) {
                            this.field1854[this.field1847] = -1;
                        } else {
                            this.field1854[this.field1847] = var10.field1854[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1843 == null || var10.field1843[var11] == -1) {
                            this.field1843[this.field1847] = -1;
                        } else {
                            this.field1843[this.field1847] = (byte) (var10.field1843[var11] + this.field1859);
                        }
                    }
                    this.field1847++;
                }
                for (int var12 = 0; var12 < var10.field1859; var12++) {
                    this.field1860[this.field1859] = var10.field1860[var12] + this.field1875;
                    this.field1861[this.field1859] = var10.field1861[var12] + this.field1875;
                    this.field1862[this.field1859] = var10.field1862[var12] + this.field1875;
                    this.field1859++;
                }
                for (int var13 = 0; var13 < var10.field1875; var13++) {
                    this.field1888[this.field1875] = var10.field1888[var13];
                    this.field1845[this.field1875] = var10.field1845[var13];
                    this.field1855[this.field1875] = var10.field1855[var13];
                    this.field1875++;
                }
            }
        }
    }

    @ObfuscatedName("dh.z([[IIIIZI)Ldh;")
    public class111 method2215(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2219();
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
        class111 var15;
        if (arg4) {
            var15 = new class111();
            var15.field1875 = this.field1875;
            var15.field1847 = this.field1847;
            var15.field1859 = this.field1859;
            var15.field1888 = this.field1888;
            var15.field1855 = this.field1855;
            var15.field1848 = this.field1848;
            var15.field1849 = this.field1849;
            var15.field1844 = this.field1844;
            var15.field1851 = this.field1851;
            var15.field1852 = this.field1852;
            var15.field1839 = this.field1839;
            var15.field1846 = this.field1846;
            var15.field1841 = this.field1841;
            var15.field1843 = this.field1843;
            var15.field1854 = this.field1854;
            var15.field1856 = this.field1856;
            var15.field1860 = this.field1860;
            var15.field1861 = this.field1861;
            var15.field1862 = this.field1862;
            var15.field1850 = this.field1850;
            var15.field1864 = this.field1864;
            var15.field1865 = this.field1865;
            var15.field1845 = new int[var15.field1875];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1875; var16++) {
                int var17 = this.field1888[var16] + arg1;
                int var18 = this.field1855[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1845[var16] = this.field1845[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1875; var26++) {
                int var27 = (-this.field1845[var26] << 16) / this.field1537;
                if (var27 < arg5) {
                    int var28 = this.field1888[var26] + arg1;
                    int var29 = this.field1855[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1845[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1845[var26];
                }
            }
        }
        var15.field1866 = 0;
        return var15;
    }

    @ObfuscatedName("dh.c(Z)Ldh;")
    public class111 method2216(boolean arg0) {
        if (!arg0 && field1840.length < this.field1847) {
            field1840 = new byte[this.field1847 + 100];
        }
        return this.method2218(arg0, field1858, field1840);
    }

    @ObfuscatedName("dh.p(Z)Ldh;")
    public class111 method2217(boolean arg0) {
        if (!arg0 && field1853.length < this.field1847) {
            field1853 = new byte[this.field1847 + 100];
        }
        return this.method2218(arg0, field1886, field1853);
    }

    @ObfuscatedName("dh.i(ZLdh;[B)Ldh;")
    public class111 method2218(boolean arg0, class111 arg1, byte[] arg2) {
        arg1.field1875 = this.field1875;
        arg1.field1847 = this.field1847;
        arg1.field1859 = this.field1859;
        if (arg1.field1888 == null || arg1.field1888.length < this.field1875) {
            arg1.field1888 = new int[this.field1875 + 100];
            arg1.field1845 = new int[this.field1875 + 100];
            arg1.field1855 = new int[this.field1875 + 100];
        }
        for (int var4 = 0; var4 < this.field1875; var4++) {
            arg1.field1888[var4] = this.field1888[var4];
            arg1.field1845[var4] = this.field1845[var4];
            arg1.field1855[var4] = this.field1855[var4];
        }
        if (arg0) {
            arg1.field1841 = this.field1841;
        } else {
            arg1.field1841 = arg2;
            if (this.field1841 == null) {
                for (int var5 = 0; var5 < this.field1847; var5++) {
                    arg1.field1841[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1847; var6++) {
                    arg1.field1841[var6] = this.field1841[var6];
                }
            }
        }
        arg1.field1848 = this.field1848;
        arg1.field1849 = this.field1849;
        arg1.field1844 = this.field1844;
        arg1.field1851 = this.field1851;
        arg1.field1852 = this.field1852;
        arg1.field1839 = this.field1839;
        arg1.field1846 = this.field1846;
        arg1.field1843 = this.field1843;
        arg1.field1854 = this.field1854;
        arg1.field1856 = this.field1856;
        arg1.field1860 = this.field1860;
        arg1.field1861 = this.field1861;
        arg1.field1862 = this.field1862;
        arg1.field1850 = this.field1850;
        arg1.field1864 = this.field1864;
        arg1.field1865 = this.field1865;
        arg1.field1866 = 0;
        return arg1;
    }

    @ObfuscatedName("dh.v()V")
    public void method2219() {
        if (this.field1866 == 1) {
            return;
        }
        this.field1866 = 1;
        this.field1537 = 0;
        this.field1867 = 0;
        this.field1863 = 0;
        for (int var1 = 0; var1 < this.field1875; var1++) {
            int var2 = this.field1888[var1];
            int var3 = this.field1845[var1];
            int var4 = this.field1855[var1];
            if (-var3 > this.field1537) {
                this.field1537 = -var3;
            }
            if (var3 > this.field1867) {
                this.field1867 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1863) {
                this.field1863 = var5;
            }
        }
        this.field1863 = (int) (Math.sqrt((double) this.field1863) + 0.99D);
        this.field1887 = (int) (Math.sqrt((double) (this.field1537 * this.field1537 + this.field1863 * this.field1863)) + 0.99D);
        this.field1869 = this.field1887 + (int) (Math.sqrt((double) (this.field1867 * this.field1867 + this.field1863 * this.field1863)) + 0.99D);
    }

    @ObfuscatedName("dh.g()V")
    public void method2220() {
        if (this.field1866 == 2) {
            return;
        }
        this.field1866 = 2;
        this.field1863 = 0;
        for (int var1 = 0; var1 < this.field1875; var1++) {
            int var2 = this.field1888[var1];
            int var3 = this.field1845[var1];
            int var4 = this.field1855[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1863) {
                this.field1863 = var5;
            }
        }
        this.field1863 = (int) (Math.sqrt((double) this.field1863) + 0.99D);
        this.field1887 = this.field1863;
        this.field1869 = this.field1863 + this.field1863;
    }

    @ObfuscatedName("dh.t()I")
    public int method2221() {
        this.method2219();
        return this.field1863;
    }

    @ObfuscatedName("dh.o(Ldx;I)V")
    public void method2252(class108 arg0, int arg1) {
        if (this.field1850 == null || arg1 == -1) {
            return;
        }
        class96 var3 = arg0.field1799[arg1];
        class104 var4 = var3.field1614;
        Statics.field1891 = 0;
        Statics.field1892 = 0;
        Statics.field1899 = 0;
        for (int var5 = 0; var5 < var3.field1617; var5++) {
            int var6 = var3.field1618[var5];
            this.method2224(var4.field1771[var6], var4.field1767[var6], var3.field1621[var5], var3.field1620[var5], var3.field1612[var5]);
        }
        this.field1866 = 0;
    }

    @ObfuscatedName("dh.b(Ldx;ILdx;I[I)V")
    public void method2276(class108 arg0, int arg1, class108 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2252(arg0, arg1);
            return;
        }
        class96 var6 = arg0.field1799[arg1];
        class96 var7 = arg2.field1799[arg3];
        class104 var8 = var6.field1614;
        Statics.field1891 = 0;
        Statics.field1892 = 0;
        Statics.field1899 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1617; var11++) {
            int var12 = var6.field1618[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1771[var12] == 0) {
                this.method2224(var8.field1771[var12], var8.field1767[var12], var6.field1621[var11], var6.field1620[var11], var6.field1612[var11]);
            }
        }
        Statics.field1891 = 0;
        Statics.field1892 = 0;
        Statics.field1899 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1617; var15++) {
            int var16 = var7.field1618[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1771[var16] == 0) {
                this.method2224(var8.field1771[var16], var8.field1767[var16], var7.field1621[var15], var7.field1620[var15], var7.field1612[var15]);
            }
        }
        this.field1866 = 0;
    }

    @ObfuscatedName("dh.d(I[IIII)V")
    public void method2224(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1891 = 0;
            Statics.field1892 = 0;
            Statics.field1899 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1850.length) {
                    int[] var10 = this.field1850[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1891 += this.field1888[var12];
                        Statics.field1892 += this.field1845[var12];
                        Statics.field1899 += this.field1855[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1891 = Statics.field1891 / var7 + arg2;
                Statics.field1892 = Statics.field1892 / var7 + arg3;
                Statics.field1899 = Statics.field1899 / var7 + arg4;
            } else {
                Statics.field1891 = arg2;
                Statics.field1892 = arg3;
                Statics.field1899 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1850.length) {
                    int[] var15 = this.field1850[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1888[var17] += arg2;
                        this.field1845[var17] += arg3;
                        this.field1855[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1850.length) {
                    int[] var20 = this.field1850[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1888[var22] -= Statics.field1891;
                        this.field1845[var22] -= Statics.field1892;
                        this.field1855[var22] -= Statics.field1899;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1882[var25];
                            int var27 = field1900[var25];
                            int var28 = this.field1888[var22] * var27 + this.field1845[var22] * var26 >> 16;
                            this.field1845[var22] = this.field1845[var22] * var27 - this.field1888[var22] * var26 >> 16;
                            this.field1888[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1882[var23];
                            int var30 = field1900[var23];
                            int var31 = this.field1845[var22] * var30 - this.field1855[var22] * var29 >> 16;
                            this.field1855[var22] = this.field1855[var22] * var30 + this.field1845[var22] * var29 >> 16;
                            this.field1845[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1882[var24];
                            int var33 = field1900[var24];
                            int var34 = this.field1888[var22] * var33 + this.field1855[var22] * var32 >> 16;
                            this.field1855[var22] = this.field1855[var22] * var33 - this.field1888[var22] * var32 >> 16;
                            this.field1888[var22] = var34;
                        }
                        this.field1888[var22] += Statics.field1891;
                        this.field1845[var22] += Statics.field1892;
                        this.field1855[var22] += Statics.field1899;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1850.length) {
                    int[] var37 = this.field1850[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1888[var39] -= Statics.field1891;
                        this.field1845[var39] -= Statics.field1892;
                        this.field1855[var39] -= Statics.field1899;
                        this.field1888[var39] = this.field1888[var39] * arg2 / 128;
                        this.field1845[var39] = this.field1845[var39] * arg3 / 128;
                        this.field1855[var39] = this.field1855[var39] * arg4 / 128;
                        this.field1888[var39] += Statics.field1891;
                        this.field1845[var39] += Statics.field1892;
                        this.field1855[var39] += Statics.field1899;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1864 != null && this.field1841 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1864.length) {
                    int[] var42 = this.field1864[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1841[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1841[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dh.k()V")
    public void method2225() {
        for (int var1 = 0; var1 < this.field1875; var1++) {
            int var2 = this.field1888[var1];
            this.field1888[var1] = this.field1855[var1];
            this.field1855[var1] = -var2;
        }
        this.field1866 = 0;
    }

    @ObfuscatedName("dh.f()V")
    public void method2214() {
        for (int var1 = 0; var1 < this.field1875; var1++) {
            this.field1888[var1] = -this.field1888[var1];
            this.field1855[var1] = -this.field1855[var1];
        }
        this.field1866 = 0;
    }

    @ObfuscatedName("dh.e()V")
    public void method2241() {
        for (int var1 = 0; var1 < this.field1875; var1++) {
            int var2 = this.field1855[var1];
            this.field1855[var1] = this.field1888[var1];
            this.field1888[var1] = -var2;
        }
        this.field1866 = 0;
    }

    @ObfuscatedName("dh.u(I)V")
    public void method2260(int arg0) {
        int var2 = field1882[arg0];
        int var3 = field1900[arg0];
        for (int var4 = 0; var4 < this.field1875; var4++) {
            int var5 = this.field1845[var4] * var3 - this.field1855[var4] * var2 >> 16;
            this.field1855[var4] = this.field1855[var4] * var3 + this.field1845[var4] * var2 >> 16;
            this.field1845[var4] = var5;
        }
        this.field1866 = 0;
    }

    @ObfuscatedName("dh.n(III)V")
    public void method2238(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1875; var4++) {
            this.field1888[var4] += arg0;
            this.field1845[var4] += arg1;
            this.field1855[var4] += arg2;
        }
        this.field1866 = 0;
    }

    @ObfuscatedName("dh.q(III)V")
    public void method2226(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1875; var4++) {
            this.field1888[var4] = this.field1888[var4] * arg0 / 128;
            this.field1845[var4] = this.field1845[var4] * arg1 / 128;
            this.field1855[var4] = this.field1855[var4] * arg2 / 128;
        }
        this.field1866 = 0;
    }

    @ObfuscatedName("dh.y(IIIIIII)V")
    public final void method2231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1881[0] = -1;
        if (this.field1866 != 2 && this.field1866 != 1) {
            this.method2220();
        }
        int var8 = Statics.field1748;
        int var9 = Statics.field1750;
        int var10 = field1882[arg0];
        int var11 = field1900[arg0];
        int var12 = field1882[arg1];
        int var13 = field1900[arg1];
        int var14 = field1882[arg2];
        int var15 = field1900[arg2];
        int var16 = field1882[arg3];
        int var17 = field1900[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1875; var19++) {
            int var20 = this.field1888[var19];
            int var21 = this.field1845[var19];
            int var22 = this.field1855[var19];
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
            field1876[var19] = var30 - var18;
            field1874[var19] = (var26 << 9) / var30 + var8;
            field1868[var19] = (var29 << 9) / var30 + var9;
            if (this.field1859 > 0) {
                field1877[var19] = var26;
                field1857[var19] = var29;
                field1879[var19] = var30;
            }
        }
        try {
            this.method2233(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dh.a(IIIIIIII)V")
    public final void method2232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1881[0] = -1;
        if (this.field1866 != 2 && this.field1866 != 1) {
            this.method2220();
        }
        int var9 = Statics.field1748;
        int var10 = Statics.field1750;
        int var11 = field1882[arg0];
        int var12 = field1900[arg0];
        int var13 = field1882[arg1];
        int var14 = field1900[arg1];
        int var15 = field1882[arg2];
        int var16 = field1900[arg2];
        int var17 = field1882[arg3];
        int var18 = field1900[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1875; var20++) {
            int var21 = this.field1888[var20];
            int var22 = this.field1845[var20];
            int var23 = this.field1855[var20];
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
            field1876[var20] = var31 - var19;
            field1874[var20] = (var27 << 9) / arg7 + var9;
            field1868[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1859 > 0) {
                field1877[var20] = var27;
                field1857[var20] = var30;
                field1879[var20] = var31;
            }
        }
        try {
            this.method2233(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dh.s(IIIIIIIII)V")
    public void method1828(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1881[0] = -1;
        if (this.field1866 != 1) {
            this.method2219();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1863 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1863 << 9;
        if (var15 / var13 >= Statics.field1754) {
            return;
        }
        int var16 = this.field1863 + var14 << 9;
        if (var16 / var13 <= Statics.field1753) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1863 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1755) {
            return;
        }
        int var20 = (this.field1537 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1756) {
            return;
        }
        int var22 = (this.field1537 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1859 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1894) {
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
            int var32 = field1895 - Statics.field1748;
            int var33 = field1896 - Statics.field1750;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1865) {
                    field1898[field1842++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1748;
        int var35 = Statics.field1750;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1882[arg0];
            var37 = field1900[arg0];
        }
        for (int var38 = 0; var38 < this.field1875; var38++) {
            int var39 = this.field1888[var38];
            int var40 = this.field1845[var38];
            int var41 = this.field1855[var38];
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
            field1876[var38] = var50 - var11;
            if (var50 >= 50) {
                field1874[var38] = (var46 << 9) / var50 + var34;
                field1868[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1874[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1877[var38] = var46;
                field1857[var38] = var49;
                field1879[var38] = var50;
            }
        }
        try {
            this.method2233(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dh.r(ZZI)V")
    public final void method2233(boolean arg0, boolean arg1, int arg2) {
        if (this.field1869 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1869; var4++) {
            field1881[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1847; var5++) {
            if (this.field1839[var5] != -2) {
                int var6 = this.field1848[var5];
                int var7 = this.field1849[var5];
                int var8 = this.field1844[var5];
                int var9 = field1874[var6];
                int var10 = field1874[var7];
                int var11 = field1874[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1877[var6];
                    int var13 = field1877[var7];
                    int var14 = field1877[var8];
                    int var15 = field1857[var6];
                    int var16 = field1857[var7];
                    int var17 = field1857[var8];
                    int var18 = field1879[var6];
                    int var19 = field1879[var7];
                    int var20 = field1879[var8];
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
                        field1873[var5] = true;
                        int var30 = (field1876[var6] + field1876[var7] + field1876[var8]) / 3 + this.field1887;
                        field1893[var30][field1881[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2236(field1895, field1896, field1868[var6], field1868[var7], field1868[var8], var9, var10, var11)) {
                        field1898[field1842++] = arg2;
                        arg1 = false;
                    }
                    if ((field1868[var8] - field1868[var7]) * (var9 - var10) - (field1868[var6] - field1868[var7]) * (var11 - var10) > 0) {
                        field1873[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1751 && var10 <= Statics.field1751 && var11 <= Statics.field1751) {
                            field1872[var5] = false;
                        } else {
                            field1872[var5] = true;
                        }
                        int var31 = (field1876[var6] + field1876[var7] + field1876[var8]) / 3 + this.field1887;
                        field1893[var31][field1881[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1846 == null) {
            for (int var32 = this.field1869 - 1; var32 >= 0; var32--) {
                int var33 = field1881[var32];
                if (var33 > 0) {
                    int[] var34 = field1893[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2234(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1883[var36] = 0;
            field1878[var36] = 0;
        }
        for (int var37 = this.field1869 - 1; var37 >= 0; var37--) {
            int var38 = field1881[var37];
            if (var38 > 0) {
                int[] var39 = field1893[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1846[var41];
                    int var43 = field1883[var42]++;
                    field1884[var42][var43] = var41;
                    if (var42 < 10) {
                        field1878[var42] += var37;
                    } else if (var42 == 10) {
                        field1885[var43] = var37;
                    } else {
                        field1870[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1883[1] > 0 || field1883[2] > 0) {
            var44 = (field1878[1] + field1878[2]) / (field1883[1] + field1883[2]);
        }
        int var45 = 0;
        if (field1883[3] > 0 || field1883[4] > 0) {
            var45 = (field1878[3] + field1878[4]) / (field1883[3] + field1883[4]);
        }
        int var46 = 0;
        if (field1883[6] > 0 || field1883[8] > 0) {
            var46 = (field1878[6] + field1878[8]) / (field1883[6] + field1883[8]);
        }
        int var47 = 0;
        int var48 = field1883[10];
        int[] var49 = field1884[10];
        int[] var50 = field1885;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1883[11];
            var49 = field1884[11];
            var50 = field1870;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2234(var49[var47++]);
                if (var47 == var48 && field1884[11] != var49) {
                    var47 = 0;
                    var48 = field1883[11];
                    var49 = field1884[11];
                    var50 = field1870;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2234(var49[var47++]);
                if (var47 == var48 && field1884[11] != var49) {
                    var47 = 0;
                    var48 = field1883[11];
                    var49 = field1884[11];
                    var50 = field1870;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2234(var49[var47++]);
                if (var47 == var48 && field1884[11] != var49) {
                    var47 = 0;
                    var48 = field1883[11];
                    var49 = field1884[11];
                    var50 = field1870;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1883[var52];
            int[] var54 = field1884[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2234(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2234(var49[var47++]);
            if (var47 == var48 && field1884[11] != var49) {
                var47 = 0;
                var49 = field1884[11];
                var48 = field1883[11];
                var50 = field1870;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dh.x(I)V")
    public final void method2234(int arg0) {
        if (field1873[arg0]) {
            this.method2235(arg0);
            return;
        }
        int var2 = this.field1848[arg0];
        int var3 = this.field1849[arg0];
        int var4 = this.field1844[arg0];
        class103.field1747 = field1872[arg0];
        if (this.field1841 == null) {
            class103.field1743 = 0;
        } else {
            class103.field1743 = this.field1841[arg0] & 0xFF;
        }
        if (this.field1854 != null && this.field1854[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1843 == null || this.field1843[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1843[arg0] & 0xFF;
                var6 = this.field1860[var5];
                var7 = this.field1861[var5];
                var8 = this.field1862[var5];
            }
            if (this.field1839[arg0] == -1) {
                class103.method2131(field1868[var2], field1868[var3], field1868[var4], field1874[var2], field1874[var3], field1874[var4], this.field1851[arg0], this.field1851[arg0], this.field1851[arg0], field1877[var6], field1877[var7], field1877[var8], field1857[var6], field1857[var7], field1857[var8], field1879[var6], field1879[var7], field1879[var8], this.field1854[arg0]);
            } else {
                class103.method2131(field1868[var2], field1868[var3], field1868[var4], field1874[var2], field1874[var3], field1874[var4], this.field1851[arg0], this.field1852[arg0], this.field1839[arg0], field1877[var6], field1877[var7], field1877[var8], field1857[var6], field1857[var7], field1857[var8], field1879[var6], field1879[var7], field1879[var8], this.field1854[arg0]);
            }
        } else if (this.field1839[arg0] == -1) {
            class103.method2117(field1868[var2], field1868[var3], field1868[var4], field1874[var2], field1874[var3], field1874[var4], field1901[this.field1851[arg0]]);
        } else {
            class103.method2144(field1868[var2], field1868[var3], field1868[var4], field1874[var2], field1874[var3], field1874[var4], this.field1851[arg0], this.field1852[arg0], this.field1839[arg0]);
        }
    }

    @ObfuscatedName("dh.w(I)V")
    public final void method2235(int arg0) {
        int var2 = Statics.field1748;
        int var3 = Statics.field1750;
        int var4 = 0;
        int var5 = this.field1848[arg0];
        int var6 = this.field1849[arg0];
        int var7 = this.field1844[arg0];
        int var8 = field1879[var5];
        int var9 = field1879[var6];
        int var10 = field1879[var7];
        if (this.field1841 == null) {
            class103.field1743 = 0;
        } else {
            class103.field1743 = this.field1841[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1897[var4] = field1874[var5];
            field1889[var4] = field1868[var5];
            field1890[var4++] = this.field1851[arg0];
        } else {
            int var11 = field1877[var5];
            int var12 = field1857[var5];
            int var13 = this.field1851[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1902[var10 - var8];
                field1897[var4] = (((field1877[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1889[var4] = (((field1857[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1890[var4++] = ((this.field1839[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1902[var9 - var8];
                field1897[var4] = (((field1877[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1889[var4] = (((field1857[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1890[var4++] = ((this.field1852[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1897[var4] = field1874[var6];
            field1889[var4] = field1868[var6];
            field1890[var4++] = this.field1852[arg0];
        } else {
            int var16 = field1877[var6];
            int var17 = field1857[var6];
            int var18 = this.field1852[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1902[var8 - var9];
                field1897[var4] = (((field1877[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1889[var4] = (((field1857[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1890[var4++] = ((this.field1851[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1902[var10 - var9];
                field1897[var4] = (((field1877[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1889[var4] = (((field1857[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1890[var4++] = ((this.field1839[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1897[var4] = field1874[var7];
            field1889[var4] = field1868[var7];
            field1890[var4++] = this.field1839[arg0];
        } else {
            int var21 = field1877[var7];
            int var22 = field1857[var7];
            int var23 = this.field1839[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1902[var9 - var10];
                field1897[var4] = (((field1877[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1889[var4] = (((field1857[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1890[var4++] = ((this.field1852[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1902[var8 - var10];
                field1897[var4] = (((field1877[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1889[var4] = (((field1857[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1890[var4++] = ((this.field1851[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1897[0];
        int var27 = field1897[1];
        int var28 = field1897[2];
        int var29 = field1889[0];
        int var30 = field1889[1];
        int var31 = field1889[2];
        class103.field1747 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1751 || var27 > Statics.field1751 || var28 > Statics.field1751) {
                class103.field1747 = true;
            }
            if (this.field1854 != null && this.field1854[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1843 == null || this.field1843[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1843[arg0] & 0xFF;
                    var33 = this.field1860[var32];
                    var34 = this.field1861[var32];
                    var35 = this.field1862[var32];
                }
                if (this.field1839[arg0] == -1) {
                    class103.method2131(var29, var30, var31, var26, var27, var28, this.field1851[arg0], this.field1851[arg0], this.field1851[arg0], field1877[var33], field1877[var34], field1877[var35], field1857[var33], field1857[var34], field1857[var35], field1879[var33], field1879[var34], field1879[var35], this.field1854[arg0]);
                } else {
                    class103.method2131(var29, var30, var31, var26, var27, var28, field1890[0], field1890[1], field1890[2], field1877[var33], field1877[var34], field1877[var35], field1857[var33], field1857[var34], field1857[var35], field1879[var33], field1879[var34], field1879[var35], this.field1854[arg0]);
                }
            } else if (this.field1839[arg0] == -1) {
                class103.method2117(var29, var30, var31, var26, var27, var28, field1901[this.field1851[arg0]]);
            } else {
                class103.method2144(var29, var30, var31, var26, var27, var28, field1890[0], field1890[1], field1890[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1751 || var27 > Statics.field1751 || var28 > Statics.field1751 || field1897[3] < 0 || field1897[3] > Statics.field1751) {
            class103.field1747 = true;
        }
        if (this.field1854 != null && this.field1854[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1843 == null || this.field1843[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1843[arg0] & 0xFF;
                var37 = this.field1860[var36];
                var38 = this.field1861[var36];
                var39 = this.field1862[var36];
            }
            short var40 = this.field1854[arg0];
            if (this.field1839[arg0] == -1) {
                class103.method2131(var29, var30, var31, var26, var27, var28, this.field1851[arg0], this.field1851[arg0], this.field1851[arg0], field1877[var37], field1877[var38], field1877[var39], field1857[var37], field1857[var38], field1857[var39], field1879[var37], field1879[var38], field1879[var39], var40);
                class103.method2131(var29, var31, field1889[3], var26, var28, field1897[3], this.field1851[arg0], this.field1851[arg0], this.field1851[arg0], field1877[var37], field1877[var38], field1877[var39], field1857[var37], field1857[var38], field1857[var39], field1879[var37], field1879[var38], field1879[var39], var40);
            } else {
                class103.method2131(var29, var30, var31, var26, var27, var28, field1890[0], field1890[1], field1890[2], field1877[var37], field1877[var38], field1877[var39], field1857[var37], field1857[var38], field1857[var39], field1879[var37], field1879[var38], field1879[var39], var40);
                class103.method2131(var29, var31, field1889[3], var26, var28, field1897[3], field1890[0], field1890[2], field1890[3], field1877[var37], field1877[var38], field1877[var39], field1857[var37], field1857[var38], field1857[var39], field1879[var37], field1879[var38], field1879[var39], var40);
            }
        } else if (this.field1839[arg0] == -1) {
            int var41 = field1901[this.field1851[arg0]];
            class103.method2117(var29, var30, var31, var26, var27, var28, var41);
            class103.method2117(var29, var31, field1889[3], var26, var28, field1897[3], var41);
        } else {
            class103.method2144(var29, var30, var31, var26, var27, var28, field1890[0], field1890[1], field1890[2]);
            class103.method2144(var29, var31, field1889[3], var26, var28, field1897[3], field1890[0], field1890[2], field1890[3]);
        }
    }

    @ObfuscatedName("dh.j(IIIIIIII)Z")
    public final boolean method2236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
