package deob;

@ObfuscatedName("df")
public class class112 extends class94 {

    @ObfuscatedName("df.g")
    public static class112 field1872 = new class112();

    @ObfuscatedName("df.m")
    public static byte[] field1847 = new byte[1];

    @ObfuscatedName("df.v")
    public static class112 field1890 = new class112();

    @ObfuscatedName("df.r")
    public static byte[] field1849 = new byte[1];

    @ObfuscatedName("df.n")
    public int field1850 = 0;

    @ObfuscatedName("df.i")
    public int[] field1851;

    @ObfuscatedName("df.s")
    public int[] field1905;

    @ObfuscatedName("df.w")
    public int[] field1906;

    @ObfuscatedName("df.d")
    public int field1854 = 0;

    @ObfuscatedName("df.t")
    public int[] field1855;

    @ObfuscatedName("df.f")
    public int[] field1856;

    @ObfuscatedName("df.b")
    public int[] field1857;

    @ObfuscatedName("df.z")
    public int[] field1858;

    @ObfuscatedName("df.l")
    public int[] field1875;

    @ObfuscatedName("df.e")
    public int[] field1859;

    @ObfuscatedName("df.p")
    public byte[] field1861;

    @ObfuscatedName("df.o")
    public byte[] field1907;

    @ObfuscatedName("df.h")
    public byte[] field1863;

    @ObfuscatedName("df.j")
    public short[] field1864;

    @ObfuscatedName("df.x")
    public byte field1865 = 0;

    @ObfuscatedName("df.k")
    public int field1898 = 0;

    @ObfuscatedName("df.a")
    public int[] field1867;

    @ObfuscatedName("df.y")
    public int[] field1870;

    @ObfuscatedName("df.q")
    public int[] field1869;

    @ObfuscatedName("df.c")
    public int[][] field1892;

    @ObfuscatedName("df.u")
    public int[][] field1871;

    @ObfuscatedName("df.ah")
    public boolean field1848 = false;

    @ObfuscatedName("df.az")
    public int field1873;

    @ObfuscatedName("df.au")
    public int field1874;

    @ObfuscatedName("df.ae")
    public int field1852;

    @ObfuscatedName("df.aa")
    public int field1860;

    @ObfuscatedName("df.av")
    public int field1877;

    @ObfuscatedName("df.ak")
    public static boolean[] field1879 = new boolean[4096];

    @ObfuscatedName("df.ad")
    public static boolean[] field1880 = new boolean[4096];

    @ObfuscatedName("df.at")
    public static int[] field1866 = new int[4096];

    @ObfuscatedName("df.an")
    public static int[] field1868 = new int[4096];

    @ObfuscatedName("df.aw")
    public static int[] field1883 = new int[4096];

    @ObfuscatedName("df.am")
    public static int[] field1884 = new int[4096];

    @ObfuscatedName("df.af")
    public static int[] field1885 = new int[4096];

    @ObfuscatedName("df.as")
    public static int[] field1886 = new int[4096];

    @ObfuscatedName("df.ab")
    public static int[] field1862 = new int[1600];

    @ObfuscatedName("df.ay")
    public static int[][] field1889 = new int[1600][512];

    @ObfuscatedName("df.ar")
    public static int[] field1882 = new int[12];

    @ObfuscatedName("df.aj")
    public static int[][] field1911 = new int[12][2000];

    @ObfuscatedName("df.ai")
    public static int[] field1881 = new int[2000];

    @ObfuscatedName("df.ax")
    public static int[] field1893 = new int[2000];

    @ObfuscatedName("df.al")
    public static int[] field1894 = new int[12];

    @ObfuscatedName("df.ag")
    public static int[] field1895 = new int[10];

    @ObfuscatedName("df.ap")
    public static int[] field1896 = new int[10];

    @ObfuscatedName("df.ac")
    public static int[] field1897 = new int[10];

    @ObfuscatedName("df.bx")
    public static boolean field1901 = false;

    @ObfuscatedName("df.bn")
    public static int field1902 = 0;

    @ObfuscatedName("df.be")
    public static int field1878 = 0;

    @ObfuscatedName("df.bs")
    public static int field1904 = 0;

    @ObfuscatedName("df.bk")
    public static int[] field1888 = new int[1000];

    @ObfuscatedName("df.bu")
    public static int[] field1876 = class104.field1778;

    @ObfuscatedName("df.by")
    public static int[] field1903 = class104.field1779;

    @ObfuscatedName("df.bd")
    public static int[] field1846 = class104.field1775;

    @ObfuscatedName("df.bq")
    public static int[] field1909 = class104.field1777;

    public class112() {
    }

    public class112(class112[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1850 = 0;
        this.field1854 = 0;
        this.field1898 = 0;
        this.field1865 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class112 var8 = arg0[var7];
            if (var8 != null) {
                this.field1850 += var8.field1850;
                this.field1854 += var8.field1854;
                this.field1898 += var8.field1898;
                if (var8.field1861 == null) {
                    if (this.field1865 == -1) {
                        this.field1865 = var8.field1865;
                    }
                    if (this.field1865 != var8.field1865) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1907 != null;
                var5 |= var8.field1864 != null;
                var6 |= var8.field1863 != null;
            }
        }
        this.field1851 = new int[this.field1850];
        this.field1905 = new int[this.field1850];
        this.field1906 = new int[this.field1850];
        this.field1855 = new int[this.field1854];
        this.field1856 = new int[this.field1854];
        this.field1857 = new int[this.field1854];
        this.field1858 = new int[this.field1854];
        this.field1875 = new int[this.field1854];
        this.field1859 = new int[this.field1854];
        if (var3) {
            this.field1861 = new byte[this.field1854];
        }
        if (var4) {
            this.field1907 = new byte[this.field1854];
        }
        if (var5) {
            this.field1864 = new short[this.field1854];
        }
        if (var6) {
            this.field1863 = new byte[this.field1854];
        }
        if (this.field1898 > 0) {
            this.field1867 = new int[this.field1898];
            this.field1870 = new int[this.field1898];
            this.field1869 = new int[this.field1898];
        }
        this.field1850 = 0;
        this.field1854 = 0;
        this.field1898 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class112 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1854; var11++) {
                    this.field1855[this.field1854] = var10.field1855[var11] + this.field1850;
                    this.field1856[this.field1854] = var10.field1856[var11] + this.field1850;
                    this.field1857[this.field1854] = var10.field1857[var11] + this.field1850;
                    this.field1858[this.field1854] = var10.field1858[var11];
                    this.field1875[this.field1854] = var10.field1875[var11];
                    this.field1859[this.field1854] = var10.field1859[var11];
                    if (var3) {
                        if (var10.field1861 == null) {
                            this.field1861[this.field1854] = var10.field1865;
                        } else {
                            this.field1861[this.field1854] = var10.field1861[var11];
                        }
                    }
                    if (var4 && var10.field1907 != null) {
                        this.field1907[this.field1854] = var10.field1907[var11];
                    }
                    if (var5) {
                        if (var10.field1864 == null) {
                            this.field1864[this.field1854] = -1;
                        } else {
                            this.field1864[this.field1854] = var10.field1864[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1863 == null || var10.field1863[var11] == -1) {
                            this.field1863[this.field1854] = -1;
                        } else {
                            this.field1863[this.field1854] = (byte) (var10.field1863[var11] + this.field1898);
                        }
                    }
                    this.field1854++;
                }
                for (int var12 = 0; var12 < var10.field1898; var12++) {
                    this.field1867[this.field1898] = var10.field1867[var12] + this.field1850;
                    this.field1870[this.field1898] = var10.field1870[var12] + this.field1850;
                    this.field1869[this.field1898] = var10.field1869[var12] + this.field1850;
                    this.field1898++;
                }
                for (int var13 = 0; var13 < var10.field1850; var13++) {
                    this.field1851[this.field1850] = var10.field1851[var13];
                    this.field1905[this.field1850] = var10.field1905[var13];
                    this.field1906[this.field1850] = var10.field1906[var13];
                    this.field1850++;
                }
            }
        }
    }

    @ObfuscatedName("df.g([[IIIIZI)Ldf;")
    public class112 method2203(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2270();
        int var7 = arg1 - this.field1852;
        int var8 = this.field1852 + arg1;
        int var9 = arg3 - this.field1852;
        int var10 = this.field1852 + arg3;
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
            var15.field1850 = this.field1850;
            var15.field1854 = this.field1854;
            var15.field1898 = this.field1898;
            var15.field1851 = this.field1851;
            var15.field1906 = this.field1906;
            var15.field1855 = this.field1855;
            var15.field1856 = this.field1856;
            var15.field1857 = this.field1857;
            var15.field1858 = this.field1858;
            var15.field1875 = this.field1875;
            var15.field1859 = this.field1859;
            var15.field1861 = this.field1861;
            var15.field1907 = this.field1907;
            var15.field1863 = this.field1863;
            var15.field1864 = this.field1864;
            var15.field1865 = this.field1865;
            var15.field1867 = this.field1867;
            var15.field1870 = this.field1870;
            var15.field1869 = this.field1869;
            var15.field1892 = this.field1892;
            var15.field1871 = this.field1871;
            var15.field1848 = this.field1848;
            var15.field1905 = new int[var15.field1850];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1850; var16++) {
                int var17 = this.field1851[var16] + arg1;
                int var18 = this.field1906[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1905[var16] = this.field1905[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1850; var26++) {
                int var27 = (-this.field1905[var26] << 16) / this.field1549;
                if (var27 < arg5) {
                    int var28 = this.field1851[var26] + arg1;
                    int var29 = this.field1906[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1905[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1905[var26];
                }
            }
        }
        var15.field1873 = 0;
        return var15;
    }

    @ObfuscatedName("df.v(Z)Ldf;")
    public class112 method2262(boolean arg0) {
        if (!arg0 && field1847.length < this.field1854) {
            field1847 = new byte[this.field1854 + 100];
        }
        return this.method2216(arg0, field1872, field1847);
    }

    @ObfuscatedName("df.r(Z)Ldf;")
    public class112 method2205(boolean arg0) {
        if (!arg0 && field1849.length < this.field1854) {
            field1849 = new byte[this.field1854 + 100];
        }
        return this.method2216(arg0, field1890, field1849);
    }

    @ObfuscatedName("df.n(ZLdf;[B)Ldf;")
    public class112 method2216(boolean arg0, class112 arg1, byte[] arg2) {
        arg1.field1850 = this.field1850;
        arg1.field1854 = this.field1854;
        arg1.field1898 = this.field1898;
        if (arg1.field1851 == null || arg1.field1851.length < this.field1850) {
            arg1.field1851 = new int[this.field1850 + 100];
            arg1.field1905 = new int[this.field1850 + 100];
            arg1.field1906 = new int[this.field1850 + 100];
        }
        for (int var4 = 0; var4 < this.field1850; var4++) {
            arg1.field1851[var4] = this.field1851[var4];
            arg1.field1905[var4] = this.field1905[var4];
            arg1.field1906[var4] = this.field1906[var4];
        }
        if (arg0) {
            arg1.field1907 = this.field1907;
        } else {
            arg1.field1907 = arg2;
            if (this.field1907 == null) {
                for (int var5 = 0; var5 < this.field1854; var5++) {
                    arg1.field1907[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1854; var6++) {
                    arg1.field1907[var6] = this.field1907[var6];
                }
            }
        }
        arg1.field1855 = this.field1855;
        arg1.field1856 = this.field1856;
        arg1.field1857 = this.field1857;
        arg1.field1858 = this.field1858;
        arg1.field1875 = this.field1875;
        arg1.field1859 = this.field1859;
        arg1.field1861 = this.field1861;
        arg1.field1863 = this.field1863;
        arg1.field1864 = this.field1864;
        arg1.field1865 = this.field1865;
        arg1.field1867 = this.field1867;
        arg1.field1870 = this.field1870;
        arg1.field1869 = this.field1869;
        arg1.field1892 = this.field1892;
        arg1.field1871 = this.field1871;
        arg1.field1848 = this.field1848;
        arg1.field1873 = 0;
        return arg1;
    }

    @ObfuscatedName("df.i()V")
    public void method2270() {
        if (this.field1873 == 1) {
            return;
        }
        this.field1873 = 1;
        this.field1549 = 0;
        this.field1874 = 0;
        this.field1852 = 0;
        for (int var1 = 0; var1 < this.field1850; var1++) {
            int var2 = this.field1851[var1];
            int var3 = this.field1905[var1];
            int var4 = this.field1906[var1];
            if (-var3 > this.field1549) {
                this.field1549 = -var3;
            }
            if (var3 > this.field1874) {
                this.field1874 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1852) {
                this.field1852 = var5;
            }
        }
        this.field1852 = (int) (Math.sqrt((double) this.field1852) + 0.99D);
        this.field1877 = (int) (Math.sqrt((double) (this.field1549 * this.field1549 + this.field1852 * this.field1852)) + 0.99D);
        this.field1860 = this.field1877 + (int) (Math.sqrt((double) (this.field1874 * this.field1874 + this.field1852 * this.field1852)) + 0.99D);
    }

    @ObfuscatedName("df.f()V")
    public void method2207() {
        if (this.field1873 == 2) {
            return;
        }
        this.field1873 = 2;
        this.field1852 = 0;
        for (int var1 = 0; var1 < this.field1850; var1++) {
            int var2 = this.field1851[var1];
            int var3 = this.field1905[var1];
            int var4 = this.field1906[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1852) {
                this.field1852 = var5;
            }
        }
        this.field1852 = (int) (Math.sqrt((double) this.field1852) + 0.99D);
        this.field1877 = this.field1852;
        this.field1860 = this.field1852 + this.field1852;
    }

    @ObfuscatedName("df.b()I")
    public int method2280() {
        this.method2270();
        return this.field1852;
    }

    @ObfuscatedName("df.z(Ldw;I)V")
    public void method2210(class109 arg0, int arg1) {
        if (this.field1892 == null || arg1 == -1) {
            return;
        }
        class97 var3 = arg0.field1812[arg1];
        class105 var4 = var3.field1627;
        Statics.field1908 = 0;
        Statics.field1899 = 0;
        Statics.field1900 = 0;
        for (int var5 = 0; var5 < var3.field1633; var5++) {
            int var6 = var3.field1628[var5];
            this.method2211(var4.field1785[var6], var4.field1783[var6], var3.field1634[var5], var3.field1635[var5], var3.field1629[var5]);
        }
        this.field1873 = 0;
    }

    @ObfuscatedName("df.l(Ldw;ILdw;I[I)V")
    public void method2202(class109 arg0, int arg1, class109 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2210(arg0, arg1);
            return;
        }
        class97 var6 = arg0.field1812[arg1];
        class97 var7 = arg2.field1812[arg3];
        class105 var8 = var6.field1627;
        Statics.field1908 = 0;
        Statics.field1899 = 0;
        Statics.field1900 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1633; var11++) {
            int var12 = var6.field1628[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1785[var12] == 0) {
                this.method2211(var8.field1785[var12], var8.field1783[var12], var6.field1634[var11], var6.field1635[var11], var6.field1629[var11]);
            }
        }
        Statics.field1908 = 0;
        Statics.field1899 = 0;
        Statics.field1900 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1633; var15++) {
            int var16 = var7.field1628[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1785[var16] == 0) {
                this.method2211(var8.field1785[var16], var8.field1783[var16], var7.field1634[var15], var7.field1635[var15], var7.field1629[var15]);
            }
        }
        this.field1873 = 0;
    }

    @ObfuscatedName("df.e(I[IIII)V")
    public void method2211(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1908 = 0;
            Statics.field1899 = 0;
            Statics.field1900 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1892.length) {
                    int[] var10 = this.field1892[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1908 += this.field1851[var12];
                        Statics.field1899 += this.field1905[var12];
                        Statics.field1900 += this.field1906[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1908 = Statics.field1908 / var7 + arg2;
                Statics.field1899 = Statics.field1899 / var7 + arg3;
                Statics.field1900 = Statics.field1900 / var7 + arg4;
            } else {
                Statics.field1908 = arg2;
                Statics.field1899 = arg3;
                Statics.field1900 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1892.length) {
                    int[] var15 = this.field1892[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1851[var17] += arg2;
                        this.field1905[var17] += arg3;
                        this.field1906[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1892.length) {
                    int[] var20 = this.field1892[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1851[var22] -= Statics.field1908;
                        this.field1905[var22] -= Statics.field1899;
                        this.field1906[var22] -= Statics.field1900;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1876[var25];
                            int var27 = field1903[var25];
                            int var28 = this.field1905[var22] * var26 + this.field1851[var22] * var27 >> 16;
                            this.field1905[var22] = this.field1905[var22] * var27 - this.field1851[var22] * var26 >> 16;
                            this.field1851[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1876[var23];
                            int var30 = field1903[var23];
                            int var31 = this.field1905[var22] * var30 - this.field1906[var22] * var29 >> 16;
                            this.field1906[var22] = this.field1906[var22] * var30 + this.field1905[var22] * var29 >> 16;
                            this.field1905[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1876[var24];
                            int var33 = field1903[var24];
                            int var34 = this.field1906[var22] * var32 + this.field1851[var22] * var33 >> 16;
                            this.field1906[var22] = this.field1906[var22] * var33 - this.field1851[var22] * var32 >> 16;
                            this.field1851[var22] = var34;
                        }
                        this.field1851[var22] += Statics.field1908;
                        this.field1905[var22] += Statics.field1899;
                        this.field1906[var22] += Statics.field1900;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1892.length) {
                    int[] var37 = this.field1892[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1851[var39] -= Statics.field1908;
                        this.field1905[var39] -= Statics.field1899;
                        this.field1906[var39] -= Statics.field1900;
                        this.field1851[var39] = this.field1851[var39] * arg2 / 128;
                        this.field1905[var39] = this.field1905[var39] * arg3 / 128;
                        this.field1906[var39] = this.field1906[var39] * arg4 / 128;
                        this.field1851[var39] += Statics.field1908;
                        this.field1905[var39] += Statics.field1899;
                        this.field1906[var39] += Statics.field1900;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1871 != null && this.field1907 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1871.length) {
                    int[] var42 = this.field1871[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1907[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1907[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("df.p()V")
    public void method2214() {
        for (int var1 = 0; var1 < this.field1850; var1++) {
            int var2 = this.field1851[var1];
            this.field1851[var1] = this.field1906[var1];
            this.field1906[var1] = -var2;
        }
        this.field1873 = 0;
    }

    @ObfuscatedName("df.o()V")
    public void method2283() {
        for (int var1 = 0; var1 < this.field1850; var1++) {
            this.field1851[var1] = -this.field1851[var1];
            this.field1906[var1] = -this.field1906[var1];
        }
        this.field1873 = 0;
    }

    @ObfuscatedName("df.h()V")
    public void method2213() {
        for (int var1 = 0; var1 < this.field1850; var1++) {
            int var2 = this.field1906[var1];
            this.field1906[var1] = this.field1851[var1];
            this.field1851[var1] = -var2;
        }
        this.field1873 = 0;
    }

    @ObfuscatedName("df.j(I)V")
    public void method2215(int arg0) {
        int var2 = field1876[arg0];
        int var3 = field1903[arg0];
        for (int var4 = 0; var4 < this.field1850; var4++) {
            int var5 = this.field1905[var4] * var3 - this.field1906[var4] * var2 >> 16;
            this.field1906[var4] = this.field1906[var4] * var3 + this.field1905[var4] * var2 >> 16;
            this.field1905[var4] = var5;
        }
        this.field1873 = 0;
    }

    @ObfuscatedName("df.x(III)V")
    public void method2209(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1850; var4++) {
            this.field1851[var4] += arg0;
            this.field1905[var4] += arg1;
            this.field1906[var4] += arg2;
        }
        this.field1873 = 0;
    }

    @ObfuscatedName("df.k(III)V")
    public void method2217(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1850; var4++) {
            this.field1851[var4] = this.field1851[var4] * arg0 / 128;
            this.field1905[var4] = this.field1905[var4] * arg1 / 128;
            this.field1906[var4] = this.field1906[var4] * arg2 / 128;
        }
        this.field1873 = 0;
    }

    @ObfuscatedName("df.a(IIIIIII)V")
    public final void method2218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1862[0] = -1;
        if (this.field1873 != 2 && this.field1873 != 1) {
            this.method2207();
        }
        int var8 = Statics.field1765;
        int var9 = Statics.field1770;
        int var10 = field1876[arg0];
        int var11 = field1903[arg0];
        int var12 = field1876[arg1];
        int var13 = field1903[arg1];
        int var14 = field1876[arg2];
        int var15 = field1903[arg2];
        int var16 = field1876[arg3];
        int var17 = field1903[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1850; var19++) {
            int var20 = this.field1851[var19];
            int var21 = this.field1905[var19];
            int var22 = this.field1906[var19];
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
            field1883[var19] = var30 - var18;
            field1866[var19] = (var26 << 9) / var30 + var8;
            field1868[var19] = (var29 << 9) / var30 + var9;
            if (this.field1898 > 0) {
                field1884[var19] = var26;
                field1885[var19] = var29;
                field1886[var19] = var30;
            }
        }
        try {
            this.method2221(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("df.y(IIIIIIII)V")
    public final void method2219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1862[0] = -1;
        if (this.field1873 != 2 && this.field1873 != 1) {
            this.method2207();
        }
        int var9 = Statics.field1765;
        int var10 = Statics.field1770;
        int var11 = field1876[arg0];
        int var12 = field1903[arg0];
        int var13 = field1876[arg1];
        int var14 = field1903[arg1];
        int var15 = field1876[arg2];
        int var16 = field1903[arg2];
        int var17 = field1876[arg3];
        int var18 = field1903[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1850; var20++) {
            int var21 = this.field1851[var20];
            int var22 = this.field1905[var20];
            int var23 = this.field1906[var20];
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
            field1883[var20] = var31 - var19;
            field1866[var20] = (var27 << 9) / arg7 + var9;
            field1868[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1898 > 0) {
                field1884[var20] = var27;
                field1885[var20] = var30;
                field1886[var20] = var31;
            }
        }
        try {
            this.method2221(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("df.ah(IIIIIIIII)V")
    public void method1841(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1862[0] = -1;
        if (this.field1873 != 1) {
            this.method2270();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1852 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1852 << 9;
        if (var15 / var13 >= Statics.field1763) {
            return;
        }
        int var16 = this.field1852 + var14 << 9;
        if (var16 / var13 <= Statics.field1771) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1852 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1774) {
            return;
        }
        int var20 = (this.field1549 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1772) {
            return;
        }
        int var22 = (this.field1549 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1898 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1901) {
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
            int var32 = field1902 - Statics.field1765;
            int var33 = field1878 - Statics.field1770;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1848) {
                    field1888[field1904++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1765;
        int var35 = Statics.field1770;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1876[arg0];
            var37 = field1903[arg0];
        }
        for (int var38 = 0; var38 < this.field1850; var38++) {
            int var39 = this.field1851[var38];
            int var40 = this.field1905[var38];
            int var41 = this.field1906[var38];
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
            field1883[var38] = var50 - var11;
            if (var50 >= 50) {
                field1866[var38] = (var46 << 9) / var50 + var34;
                field1868[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1866[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1884[var38] = var46;
                field1885[var38] = var49;
                field1886[var38] = var50;
            }
        }
        try {
            this.method2221(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("df.q(ZZI)V")
    public final void method2221(boolean arg0, boolean arg1, int arg2) {
        if (this.field1860 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1860; var4++) {
            field1862[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1854; var5++) {
            if (this.field1859[var5] != -2) {
                int var6 = this.field1855[var5];
                int var7 = this.field1856[var5];
                int var8 = this.field1857[var5];
                int var9 = field1866[var6];
                int var10 = field1866[var7];
                int var11 = field1866[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1884[var6];
                    int var13 = field1884[var7];
                    int var14 = field1884[var8];
                    int var15 = field1885[var6];
                    int var16 = field1885[var7];
                    int var17 = field1885[var8];
                    int var18 = field1886[var6];
                    int var19 = field1886[var7];
                    int var20 = field1886[var8];
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
                        field1880[var5] = true;
                        int var30 = (field1883[var6] + field1883[var7] + field1883[var8]) / 3 + this.field1877;
                        field1889[var30][field1862[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2272(field1902, field1878, field1868[var6], field1868[var7], field1868[var8], var9, var10, var11)) {
                        field1888[field1904++] = arg2;
                        arg1 = false;
                    }
                    if ((field1868[var8] - field1868[var7]) * (var9 - var10) - (field1868[var6] - field1868[var7]) * (var11 - var10) > 0) {
                        field1880[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1767 && var10 <= Statics.field1767 && var11 <= Statics.field1767) {
                            field1879[var5] = false;
                        } else {
                            field1879[var5] = true;
                        }
                        int var31 = (field1883[var6] + field1883[var7] + field1883[var8]) / 3 + this.field1877;
                        field1889[var31][field1862[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1861 == null) {
            for (int var32 = this.field1860 - 1; var32 >= 0; var32--) {
                int var33 = field1862[var32];
                if (var33 > 0) {
                    int[] var34 = field1889[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2222(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1882[var36] = 0;
            field1894[var36] = 0;
        }
        for (int var37 = this.field1860 - 1; var37 >= 0; var37--) {
            int var38 = field1862[var37];
            if (var38 > 0) {
                int[] var39 = field1889[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1861[var41];
                    int var43 = field1882[var42]++;
                    field1911[var42][var43] = var41;
                    if (var42 < 10) {
                        field1894[var42] += var37;
                    } else if (var42 == 10) {
                        field1881[var43] = var37;
                    } else {
                        field1893[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1882[1] > 0 || field1882[2] > 0) {
            var44 = (field1894[1] + field1894[2]) / (field1882[1] + field1882[2]);
        }
        int var45 = 0;
        if (field1882[3] > 0 || field1882[4] > 0) {
            var45 = (field1894[3] + field1894[4]) / (field1882[3] + field1882[4]);
        }
        int var46 = 0;
        if (field1882[6] > 0 || field1882[8] > 0) {
            var46 = (field1894[6] + field1894[8]) / (field1882[6] + field1882[8]);
        }
        int var47 = 0;
        int var48 = field1882[10];
        int[] var49 = field1911[10];
        int[] var50 = field1881;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1882[11];
            var49 = field1911[11];
            var50 = field1893;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2222(var49[var47++]);
                if (var47 == var48 && field1911[11] != var49) {
                    var47 = 0;
                    var48 = field1882[11];
                    var49 = field1911[11];
                    var50 = field1893;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2222(var49[var47++]);
                if (var47 == var48 && field1911[11] != var49) {
                    var47 = 0;
                    var48 = field1882[11];
                    var49 = field1911[11];
                    var50 = field1893;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2222(var49[var47++]);
                if (var47 == var48 && field1911[11] != var49) {
                    var47 = 0;
                    var48 = field1882[11];
                    var49 = field1911[11];
                    var50 = field1893;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1882[var52];
            int[] var54 = field1911[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2222(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2222(var49[var47++]);
            if (var47 == var48 && field1911[11] != var49) {
                var47 = 0;
                var49 = field1911[11];
                var48 = field1882[11];
                var50 = field1893;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("df.c(I)V")
    public final void method2222(int arg0) {
        if (field1880[arg0]) {
            this.method2268(arg0);
            return;
        }
        int var2 = this.field1855[arg0];
        int var3 = this.field1856[arg0];
        int var4 = this.field1857[arg0];
        class104.field1769 = field1879[arg0];
        if (this.field1907 == null) {
            class104.field1759 = 0;
        } else {
            class104.field1759 = this.field1907[arg0] & 0xFF;
        }
        if (this.field1864 != null && this.field1864[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1863 == null || this.field1863[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1863[arg0] & 0xFF;
                var6 = this.field1867[var5];
                var7 = this.field1870[var5];
                var8 = this.field1869[var5];
            }
            if (this.field1859[arg0] == -1) {
                class104.method2109(field1868[var2], field1868[var3], field1868[var4], field1866[var2], field1866[var3], field1866[var4], this.field1858[arg0], this.field1858[arg0], this.field1858[arg0], field1884[var6], field1884[var7], field1884[var8], field1885[var6], field1885[var7], field1885[var8], field1886[var6], field1886[var7], field1886[var8], this.field1864[arg0]);
            } else {
                class104.method2109(field1868[var2], field1868[var3], field1868[var4], field1866[var2], field1866[var3], field1866[var4], this.field1858[arg0], this.field1875[arg0], this.field1859[arg0], field1884[var6], field1884[var7], field1884[var8], field1885[var6], field1885[var7], field1885[var8], field1886[var6], field1886[var7], field1886[var8], this.field1864[arg0]);
            }
        } else if (this.field1859[arg0] == -1) {
            class104.method2117(field1868[var2], field1868[var3], field1868[var4], field1866[var2], field1866[var3], field1866[var4], field1846[this.field1858[arg0]]);
        } else {
            class104.method2105(field1868[var2], field1868[var3], field1868[var4], field1866[var2], field1866[var3], field1866[var4], this.field1858[arg0], this.field1875[arg0], this.field1859[arg0]);
        }
    }

    @ObfuscatedName("df.u(I)V")
    public final void method2268(int arg0) {
        int var2 = Statics.field1765;
        int var3 = Statics.field1770;
        int var4 = 0;
        int var5 = this.field1855[arg0];
        int var6 = this.field1856[arg0];
        int var7 = this.field1857[arg0];
        int var8 = field1886[var5];
        int var9 = field1886[var6];
        int var10 = field1886[var7];
        if (this.field1907 == null) {
            class104.field1759 = 0;
        } else {
            class104.field1759 = this.field1907[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1895[var4] = field1866[var5];
            field1896[var4] = field1868[var5];
            field1897[var4++] = this.field1858[arg0];
        } else {
            int var11 = field1884[var5];
            int var12 = field1885[var5];
            int var13 = this.field1858[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1909[var10 - var8];
                field1895[var4] = (((field1884[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1896[var4] = (((field1885[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1897[var4++] = ((this.field1859[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1909[var9 - var8];
                field1895[var4] = (((field1884[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1896[var4] = (((field1885[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1897[var4++] = ((this.field1875[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1895[var4] = field1866[var6];
            field1896[var4] = field1868[var6];
            field1897[var4++] = this.field1875[arg0];
        } else {
            int var16 = field1884[var6];
            int var17 = field1885[var6];
            int var18 = this.field1875[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1909[var8 - var9];
                field1895[var4] = (((field1884[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1896[var4] = (((field1885[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1897[var4++] = ((this.field1858[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1909[var10 - var9];
                field1895[var4] = (((field1884[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1896[var4] = (((field1885[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1897[var4++] = ((this.field1859[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1895[var4] = field1866[var7];
            field1896[var4] = field1868[var7];
            field1897[var4++] = this.field1859[arg0];
        } else {
            int var21 = field1884[var7];
            int var22 = field1885[var7];
            int var23 = this.field1859[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1909[var9 - var10];
                field1895[var4] = (((field1884[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1896[var4] = (((field1885[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1897[var4++] = ((this.field1875[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1909[var8 - var10];
                field1895[var4] = (((field1884[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1896[var4] = (((field1885[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1897[var4++] = ((this.field1858[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1895[0];
        int var27 = field1895[1];
        int var28 = field1895[2];
        int var29 = field1896[0];
        int var30 = field1896[1];
        int var31 = field1896[2];
        class104.field1769 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1767 || var27 > Statics.field1767 || var28 > Statics.field1767) {
                class104.field1769 = true;
            }
            if (this.field1864 != null && this.field1864[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1863 == null || this.field1863[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1863[arg0] & 0xFF;
                    var33 = this.field1867[var32];
                    var34 = this.field1870[var32];
                    var35 = this.field1869[var32];
                }
                if (this.field1859[arg0] == -1) {
                    class104.method2109(var29, var30, var31, var26, var27, var28, this.field1858[arg0], this.field1858[arg0], this.field1858[arg0], field1884[var33], field1884[var34], field1884[var35], field1885[var33], field1885[var34], field1885[var35], field1886[var33], field1886[var34], field1886[var35], this.field1864[arg0]);
                } else {
                    class104.method2109(var29, var30, var31, var26, var27, var28, field1897[0], field1897[1], field1897[2], field1884[var33], field1884[var34], field1884[var35], field1885[var33], field1885[var34], field1885[var35], field1886[var33], field1886[var34], field1886[var35], this.field1864[arg0]);
                }
            } else if (this.field1859[arg0] == -1) {
                class104.method2117(var29, var30, var31, var26, var27, var28, field1846[this.field1858[arg0]]);
            } else {
                class104.method2105(var29, var30, var31, var26, var27, var28, field1897[0], field1897[1], field1897[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1767 || var27 > Statics.field1767 || var28 > Statics.field1767 || field1895[3] < 0 || field1895[3] > Statics.field1767) {
            class104.field1769 = true;
        }
        if (this.field1864 != null && this.field1864[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1863 == null || this.field1863[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1863[arg0] & 0xFF;
                var37 = this.field1867[var36];
                var38 = this.field1870[var36];
                var39 = this.field1869[var36];
            }
            short var40 = this.field1864[arg0];
            if (this.field1859[arg0] == -1) {
                class104.method2109(var29, var30, var31, var26, var27, var28, this.field1858[arg0], this.field1858[arg0], this.field1858[arg0], field1884[var37], field1884[var38], field1884[var39], field1885[var37], field1885[var38], field1885[var39], field1886[var37], field1886[var38], field1886[var39], var40);
                class104.method2109(var29, var31, field1896[3], var26, var28, field1895[3], this.field1858[arg0], this.field1858[arg0], this.field1858[arg0], field1884[var37], field1884[var38], field1884[var39], field1885[var37], field1885[var38], field1885[var39], field1886[var37], field1886[var38], field1886[var39], var40);
            } else {
                class104.method2109(var29, var30, var31, var26, var27, var28, field1897[0], field1897[1], field1897[2], field1884[var37], field1884[var38], field1884[var39], field1885[var37], field1885[var38], field1885[var39], field1886[var37], field1886[var38], field1886[var39], var40);
                class104.method2109(var29, var31, field1896[3], var26, var28, field1895[3], field1897[0], field1897[2], field1897[3], field1884[var37], field1884[var38], field1884[var39], field1885[var37], field1885[var38], field1885[var39], field1886[var37], field1886[var38], field1886[var39], var40);
            }
        } else if (this.field1859[arg0] == -1) {
            int var41 = field1846[this.field1858[arg0]];
            class104.method2117(var29, var30, var31, var26, var27, var28, var41);
            class104.method2117(var29, var31, field1896[3], var26, var28, field1895[3], var41);
        } else {
            class104.method2105(var29, var30, var31, var26, var27, var28, field1897[0], field1897[1], field1897[2]);
            class104.method2105(var29, var31, field1896[3], var26, var28, field1895[3], field1897[0], field1897[2], field1897[3]);
        }
    }

    @ObfuscatedName("df.aq(IIIIIIII)Z")
    public final boolean method2272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
