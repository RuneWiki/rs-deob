package deob;

@ObfuscatedName("dd")
public class class112 extends class94 {

    @ObfuscatedName("dd.a")
    public static class112 field1859 = new class112();

    @ObfuscatedName("dd.x")
    public static byte[] field1899 = new byte[1];

    @ObfuscatedName("dd.e")
    public static class112 field1855 = new class112();

    @ObfuscatedName("dd.r")
    public static byte[] field1856 = new byte[1];

    @ObfuscatedName("dd.p")
    public int field1857 = 0;

    @ObfuscatedName("dd.n")
    public int[] field1889;

    @ObfuscatedName("dd.o")
    public int[] field1914;

    @ObfuscatedName("dd.l")
    public int[] field1860;

    @ObfuscatedName("dd.t")
    public int field1861 = 0;

    @ObfuscatedName("dd.q")
    public int[] field1862;

    @ObfuscatedName("dd.c")
    public int[] field1880;

    @ObfuscatedName("dd.z")
    public int[] field1864;

    @ObfuscatedName("dd.s")
    public int[] field1915;

    @ObfuscatedName("dd.h")
    public int[] field1866;

    @ObfuscatedName("dd.f")
    public int[] field1882;

    @ObfuscatedName("dd.w")
    public byte[] field1868;

    @ObfuscatedName("dd.d")
    public byte[] field1869;

    @ObfuscatedName("dd.y")
    public byte[] field1884;

    @ObfuscatedName("dd.g")
    public short[] field1871;

    @ObfuscatedName("dd.v")
    public byte field1872 = 0;

    @ObfuscatedName("dd.b")
    public int field1873 = 0;

    @ObfuscatedName("dd.j")
    public int[] field1874;

    @ObfuscatedName("dd.m")
    public int[] field1875;

    @ObfuscatedName("dd.k")
    public int[] field1876;

    @ObfuscatedName("dd.u")
    public int[][] field1877;

    @ObfuscatedName("dd.i")
    public int[][] field1918;

    @ObfuscatedName("dd.ah")
    public boolean field1879 = false;

    @ObfuscatedName("dd.ag")
    public int field1878;

    @ObfuscatedName("dd.ay")
    public int field1881;

    @ObfuscatedName("dd.as")
    public int field1854;

    @ObfuscatedName("dd.aq")
    public int field1883;

    @ObfuscatedName("dd.am")
    public int field1901;

    @ObfuscatedName("dd.av")
    public static boolean[] field1863 = new boolean[4096];

    @ObfuscatedName("dd.at")
    public static boolean[] field1887 = new boolean[4096];

    @ObfuscatedName("dd.ap")
    public static int[] field1900 = new int[4096];

    @ObfuscatedName("dd.ae")
    public static int[] field1897 = new int[4096];

    @ObfuscatedName("dd.af")
    public static int[] field1890 = new int[4096];

    @ObfuscatedName("dd.ai")
    public static int[] field1886 = new int[4096];

    @ObfuscatedName("dd.aj")
    public static int[] field1892 = new int[4096];

    @ObfuscatedName("dd.ax")
    public static int[] field1891 = new int[4096];

    @ObfuscatedName("dd.az")
    public static int[] field1895 = new int[1600];

    @ObfuscatedName("dd.aa")
    public static int[][] field1902 = new int[1600][512];

    @ObfuscatedName("dd.au")
    public static int[] field1896 = new int[12];

    @ObfuscatedName("dd.ar")
    public static int[][] field1898 = new int[12][2000];

    @ObfuscatedName("dd.ao")
    public static int[] field1893 = new int[2000];

    @ObfuscatedName("dd.aw")
    public static int[] field1910 = new int[2000];

    @ObfuscatedName("dd.ab")
    public static int[] field1903 = new int[12];

    @ObfuscatedName("dd.ac")
    public static int[] field1853 = new int[10];

    @ObfuscatedName("dd.ad")
    public static int[] field1905 = new int[10];

    @ObfuscatedName("dd.al")
    public static int[] field1904 = new int[10];

    @ObfuscatedName("dd.bn")
    public static boolean field1908 = false;

    @ObfuscatedName("dd.bd")
    public static int field1909 = 0;

    @ObfuscatedName("dd.ba")
    public static int field1858 = 0;

    @ObfuscatedName("dd.bk")
    public static int field1867 = 0;

    @ObfuscatedName("dd.by")
    public static int[] field1912 = new int[1000];

    @ObfuscatedName("dd.bf")
    public static int[] field1913 = class104.field1785;

    @ObfuscatedName("dd.bo")
    public static int[] field1911 = class104.field1786;

    @ObfuscatedName("dd.bu")
    public static int[] field1888 = class104.field1781;

    @ObfuscatedName("dd.bw")
    public static int[] field1916 = class104.field1784;

    public class112() {
    }

    public class112(class112[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1857 = 0;
        this.field1861 = 0;
        this.field1873 = 0;
        this.field1872 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class112 var8 = arg0[var7];
            if (var8 != null) {
                this.field1857 += var8.field1857;
                this.field1861 += var8.field1861;
                this.field1873 += var8.field1873;
                if (var8.field1868 == null) {
                    if (this.field1872 == -1) {
                        this.field1872 = var8.field1872;
                    }
                    if (this.field1872 != var8.field1872) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1869 != null;
                var5 |= var8.field1871 != null;
                var6 |= var8.field1884 != null;
            }
        }
        this.field1889 = new int[this.field1857];
        this.field1914 = new int[this.field1857];
        this.field1860 = new int[this.field1857];
        this.field1862 = new int[this.field1861];
        this.field1880 = new int[this.field1861];
        this.field1864 = new int[this.field1861];
        this.field1915 = new int[this.field1861];
        this.field1866 = new int[this.field1861];
        this.field1882 = new int[this.field1861];
        if (var3) {
            this.field1868 = new byte[this.field1861];
        }
        if (var4) {
            this.field1869 = new byte[this.field1861];
        }
        if (var5) {
            this.field1871 = new short[this.field1861];
        }
        if (var6) {
            this.field1884 = new byte[this.field1861];
        }
        if (this.field1873 > 0) {
            this.field1874 = new int[this.field1873];
            this.field1875 = new int[this.field1873];
            this.field1876 = new int[this.field1873];
        }
        this.field1857 = 0;
        this.field1861 = 0;
        this.field1873 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class112 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1861; var11++) {
                    this.field1862[this.field1861] = var10.field1862[var11] + this.field1857;
                    this.field1880[this.field1861] = var10.field1880[var11] + this.field1857;
                    this.field1864[this.field1861] = var10.field1864[var11] + this.field1857;
                    this.field1915[this.field1861] = var10.field1915[var11];
                    this.field1866[this.field1861] = var10.field1866[var11];
                    this.field1882[this.field1861] = var10.field1882[var11];
                    if (var3) {
                        if (var10.field1868 == null) {
                            this.field1868[this.field1861] = var10.field1872;
                        } else {
                            this.field1868[this.field1861] = var10.field1868[var11];
                        }
                    }
                    if (var4 && var10.field1869 != null) {
                        this.field1869[this.field1861] = var10.field1869[var11];
                    }
                    if (var5) {
                        if (var10.field1871 == null) {
                            this.field1871[this.field1861] = -1;
                        } else {
                            this.field1871[this.field1861] = var10.field1871[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1884 == null || var10.field1884[var11] == -1) {
                            this.field1884[this.field1861] = -1;
                        } else {
                            this.field1884[this.field1861] = (byte) (var10.field1884[var11] + this.field1873);
                        }
                    }
                    this.field1861++;
                }
                for (int var12 = 0; var12 < var10.field1873; var12++) {
                    this.field1874[this.field1873] = var10.field1874[var12] + this.field1857;
                    this.field1875[this.field1873] = var10.field1875[var12] + this.field1857;
                    this.field1876[this.field1873] = var10.field1876[var12] + this.field1857;
                    this.field1873++;
                }
                for (int var13 = 0; var13 < var10.field1857; var13++) {
                    this.field1889[this.field1857] = var10.field1889[var13];
                    this.field1914[this.field1857] = var10.field1914[var13];
                    this.field1860[this.field1857] = var10.field1860[var13];
                    this.field1857++;
                }
            }
        }
    }

    @ObfuscatedName("dd.a([[IIIIZI)Ldd;")
    public class112 method2180(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2184();
        int var7 = arg1 - this.field1854;
        int var8 = this.field1854 + arg1;
        int var9 = arg3 - this.field1854;
        int var10 = this.field1854 + arg3;
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
            var15.field1857 = this.field1857;
            var15.field1861 = this.field1861;
            var15.field1873 = this.field1873;
            var15.field1889 = this.field1889;
            var15.field1860 = this.field1860;
            var15.field1862 = this.field1862;
            var15.field1880 = this.field1880;
            var15.field1864 = this.field1864;
            var15.field1915 = this.field1915;
            var15.field1866 = this.field1866;
            var15.field1882 = this.field1882;
            var15.field1868 = this.field1868;
            var15.field1869 = this.field1869;
            var15.field1884 = this.field1884;
            var15.field1871 = this.field1871;
            var15.field1872 = this.field1872;
            var15.field1874 = this.field1874;
            var15.field1875 = this.field1875;
            var15.field1876 = this.field1876;
            var15.field1877 = this.field1877;
            var15.field1918 = this.field1918;
            var15.field1879 = this.field1879;
            var15.field1914 = new int[var15.field1857];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1857; var16++) {
                int var17 = this.field1889[var16] + arg1;
                int var18 = this.field1860[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1914[var16] = this.field1914[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1857; var26++) {
                int var27 = (-this.field1914[var26] << 16) / this.field1549;
                if (var27 < arg5) {
                    int var28 = this.field1889[var26] + arg1;
                    int var29 = this.field1860[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1914[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1914[var26];
                }
            }
        }
        var15.field1878 = 0;
        return var15;
    }

    @ObfuscatedName("dd.e(Z)Ldd;")
    public class112 method2181(boolean arg0) {
        if (!arg0 && field1899.length < this.field1861) {
            field1899 = new byte[this.field1861 + 100];
        }
        return this.method2183(arg0, field1859, field1899);
    }

    @ObfuscatedName("dd.r(Z)Ldd;")
    public class112 method2182(boolean arg0) {
        if (!arg0 && field1856.length < this.field1861) {
            field1856 = new byte[this.field1861 + 100];
        }
        return this.method2183(arg0, field1855, field1856);
    }

    @ObfuscatedName("dd.p(ZLdd;[B)Ldd;")
    public class112 method2183(boolean arg0, class112 arg1, byte[] arg2) {
        arg1.field1857 = this.field1857;
        arg1.field1861 = this.field1861;
        arg1.field1873 = this.field1873;
        if (arg1.field1889 == null || arg1.field1889.length < this.field1857) {
            arg1.field1889 = new int[this.field1857 + 100];
            arg1.field1914 = new int[this.field1857 + 100];
            arg1.field1860 = new int[this.field1857 + 100];
        }
        for (int var4 = 0; var4 < this.field1857; var4++) {
            arg1.field1889[var4] = this.field1889[var4];
            arg1.field1914[var4] = this.field1914[var4];
            arg1.field1860[var4] = this.field1860[var4];
        }
        if (arg0) {
            arg1.field1869 = this.field1869;
        } else {
            arg1.field1869 = arg2;
            if (this.field1869 == null) {
                for (int var5 = 0; var5 < this.field1861; var5++) {
                    arg1.field1869[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1861; var6++) {
                    arg1.field1869[var6] = this.field1869[var6];
                }
            }
        }
        arg1.field1862 = this.field1862;
        arg1.field1880 = this.field1880;
        arg1.field1864 = this.field1864;
        arg1.field1915 = this.field1915;
        arg1.field1866 = this.field1866;
        arg1.field1882 = this.field1882;
        arg1.field1868 = this.field1868;
        arg1.field1884 = this.field1884;
        arg1.field1871 = this.field1871;
        arg1.field1872 = this.field1872;
        arg1.field1874 = this.field1874;
        arg1.field1875 = this.field1875;
        arg1.field1876 = this.field1876;
        arg1.field1877 = this.field1877;
        arg1.field1918 = this.field1918;
        arg1.field1879 = this.field1879;
        arg1.field1878 = 0;
        return arg1;
    }

    @ObfuscatedName("dd.o()V")
    public void method2184() {
        if (this.field1878 == 1) {
            return;
        }
        this.field1878 = 1;
        this.field1549 = 0;
        this.field1881 = 0;
        this.field1854 = 0;
        for (int var1 = 0; var1 < this.field1857; var1++) {
            int var2 = this.field1889[var1];
            int var3 = this.field1914[var1];
            int var4 = this.field1860[var1];
            if (-var3 > this.field1549) {
                this.field1549 = -var3;
            }
            if (var3 > this.field1881) {
                this.field1881 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1854) {
                this.field1854 = var5;
            }
        }
        this.field1854 = (int) (Math.sqrt((double) this.field1854) + 0.99D);
        this.field1901 = (int) (Math.sqrt((double) (this.field1549 * this.field1549 + this.field1854 * this.field1854)) + 0.99D);
        this.field1883 = this.field1901 + (int) (Math.sqrt((double) (this.field1881 * this.field1881 + this.field1854 * this.field1854)) + 0.99D);
    }

    @ObfuscatedName("dd.l()V")
    public void method2185() {
        if (this.field1878 == 2) {
            return;
        }
        this.field1878 = 2;
        this.field1854 = 0;
        for (int var1 = 0; var1 < this.field1857; var1++) {
            int var2 = this.field1889[var1];
            int var3 = this.field1914[var1];
            int var4 = this.field1860[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1854) {
                this.field1854 = var5;
            }
        }
        this.field1854 = (int) (Math.sqrt((double) this.field1854) + 0.99D);
        this.field1901 = this.field1854;
        this.field1883 = this.field1854 + this.field1854;
    }

    @ObfuscatedName("dd.t()I")
    public int method2223() {
        this.method2184();
        return this.field1854;
    }

    @ObfuscatedName("dd.q(Ldv;I)V")
    public void method2179(class109 arg0, int arg1) {
        if (this.field1877 == null || arg1 == -1) {
            return;
        }
        class97 var3 = arg0.field1819[arg1];
        class105 var4 = var3.field1632;
        Statics.field1870 = 0;
        Statics.field1906 = 0;
        Statics.field1907 = 0;
        for (int var5 = 0; var5 < var3.field1633; var5++) {
            int var6 = var3.field1634[var5];
            this.method2188(var4.field1789[var6], var4.field1790[var6], var3.field1628[var5], var3.field1635[var5], var3.field1637[var5]);
        }
        this.field1878 = 0;
    }

    @ObfuscatedName("dd.c(Ldv;ILdv;I[I)V")
    public void method2256(class109 arg0, int arg1, class109 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2179(arg0, arg1);
            return;
        }
        class97 var6 = arg0.field1819[arg1];
        class97 var7 = arg2.field1819[arg3];
        class105 var8 = var6.field1632;
        Statics.field1870 = 0;
        Statics.field1906 = 0;
        Statics.field1907 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1633; var11++) {
            int var12 = var6.field1634[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1789[var12] == 0) {
                this.method2188(var8.field1789[var12], var8.field1790[var12], var6.field1628[var11], var6.field1635[var11], var6.field1637[var11]);
            }
        }
        Statics.field1870 = 0;
        Statics.field1906 = 0;
        Statics.field1907 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1633; var15++) {
            int var16 = var7.field1634[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1789[var16] == 0) {
                this.method2188(var8.field1789[var16], var8.field1790[var16], var7.field1628[var15], var7.field1635[var15], var7.field1637[var15]);
            }
        }
        this.field1878 = 0;
    }

    @ObfuscatedName("dd.z(I[IIII)V")
    public void method2188(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1870 = 0;
            Statics.field1906 = 0;
            Statics.field1907 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1877.length) {
                    int[] var10 = this.field1877[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1870 += this.field1889[var12];
                        Statics.field1906 += this.field1914[var12];
                        Statics.field1907 += this.field1860[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1870 = Statics.field1870 / var7 + arg2;
                Statics.field1906 = Statics.field1906 / var7 + arg3;
                Statics.field1907 = Statics.field1907 / var7 + arg4;
            } else {
                Statics.field1870 = arg2;
                Statics.field1906 = arg3;
                Statics.field1907 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1877.length) {
                    int[] var15 = this.field1877[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1889[var17] += arg2;
                        this.field1914[var17] += arg3;
                        this.field1860[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1877.length) {
                    int[] var20 = this.field1877[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1889[var22] -= Statics.field1870;
                        this.field1914[var22] -= Statics.field1906;
                        this.field1860[var22] -= Statics.field1907;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1913[var25];
                            int var27 = field1911[var25];
                            int var28 = this.field1914[var22] * var26 + this.field1889[var22] * var27 >> 16;
                            this.field1914[var22] = this.field1914[var22] * var27 - this.field1889[var22] * var26 >> 16;
                            this.field1889[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1913[var23];
                            int var30 = field1911[var23];
                            int var31 = this.field1914[var22] * var30 - this.field1860[var22] * var29 >> 16;
                            this.field1860[var22] = this.field1914[var22] * var29 + this.field1860[var22] * var30 >> 16;
                            this.field1914[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1913[var24];
                            int var33 = field1911[var24];
                            int var34 = this.field1889[var22] * var33 + this.field1860[var22] * var32 >> 16;
                            this.field1860[var22] = this.field1860[var22] * var33 - this.field1889[var22] * var32 >> 16;
                            this.field1889[var22] = var34;
                        }
                        this.field1889[var22] += Statics.field1870;
                        this.field1914[var22] += Statics.field1906;
                        this.field1860[var22] += Statics.field1907;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1877.length) {
                    int[] var37 = this.field1877[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1889[var39] -= Statics.field1870;
                        this.field1914[var39] -= Statics.field1906;
                        this.field1860[var39] -= Statics.field1907;
                        this.field1889[var39] = this.field1889[var39] * arg2 / 128;
                        this.field1914[var39] = this.field1914[var39] * arg3 / 128;
                        this.field1860[var39] = this.field1860[var39] * arg4 / 128;
                        this.field1889[var39] += Statics.field1870;
                        this.field1914[var39] += Statics.field1906;
                        this.field1860[var39] += Statics.field1907;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1918 != null && this.field1869 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1918.length) {
                    int[] var42 = this.field1918[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1869[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1869[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dd.s()V")
    public void method2189() {
        for (int var1 = 0; var1 < this.field1857; var1++) {
            int var2 = this.field1889[var1];
            this.field1889[var1] = this.field1860[var1];
            this.field1860[var1] = -var2;
        }
        this.field1878 = 0;
    }

    @ObfuscatedName("dd.h()V")
    public void method2190() {
        for (int var1 = 0; var1 < this.field1857; var1++) {
            this.field1889[var1] = -this.field1889[var1];
            this.field1860[var1] = -this.field1860[var1];
        }
        this.field1878 = 0;
    }

    @ObfuscatedName("dd.f()V")
    public void method2191() {
        for (int var1 = 0; var1 < this.field1857; var1++) {
            int var2 = this.field1860[var1];
            this.field1860[var1] = this.field1889[var1];
            this.field1889[var1] = -var2;
        }
        this.field1878 = 0;
    }

    @ObfuscatedName("dd.w(I)V")
    public void method2192(int arg0) {
        int var2 = field1913[arg0];
        int var3 = field1911[arg0];
        for (int var4 = 0; var4 < this.field1857; var4++) {
            int var5 = this.field1914[var4] * var3 - this.field1860[var4] * var2 >> 16;
            this.field1860[var4] = this.field1914[var4] * var2 + this.field1860[var4] * var3 >> 16;
            this.field1914[var4] = var5;
        }
        this.field1878 = 0;
    }

    @ObfuscatedName("dd.d(III)V")
    public void method2246(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1857; var4++) {
            this.field1889[var4] += arg0;
            this.field1914[var4] += arg1;
            this.field1860[var4] += arg2;
        }
        this.field1878 = 0;
    }

    @ObfuscatedName("dd.y(III)V")
    public void method2215(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1857; var4++) {
            this.field1889[var4] = this.field1889[var4] * arg0 / 128;
            this.field1914[var4] = this.field1914[var4] * arg1 / 128;
            this.field1860[var4] = this.field1860[var4] * arg2 / 128;
        }
        this.field1878 = 0;
    }

    @ObfuscatedName("dd.g(IIIIIII)V")
    public final void method2195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1895[0] = -1;
        if (this.field1878 != 2 && this.field1878 != 1) {
            this.method2185();
        }
        int var8 = Statics.field1765;
        int var9 = Statics.field1778;
        int var10 = field1913[arg0];
        int var11 = field1911[arg0];
        int var12 = field1913[arg1];
        int var13 = field1911[arg1];
        int var14 = field1913[arg2];
        int var15 = field1911[arg2];
        int var16 = field1913[arg3];
        int var17 = field1911[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1857; var19++) {
            int var20 = this.field1889[var19];
            int var21 = this.field1914[var19];
            int var22 = this.field1860[var19];
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
            field1900[var19] = (var26 << 9) / var30 + var8;
            field1897[var19] = (var29 << 9) / var30 + var9;
            if (this.field1873 > 0) {
                field1886[var19] = var26;
                field1892[var19] = var29;
                field1891[var19] = var30;
            }
        }
        try {
            this.method2200(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dd.v(IIIIIIII)V")
    public final void method2196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1895[0] = -1;
        if (this.field1878 != 2 && this.field1878 != 1) {
            this.method2185();
        }
        int var9 = Statics.field1765;
        int var10 = Statics.field1778;
        int var11 = field1913[arg0];
        int var12 = field1911[arg0];
        int var13 = field1913[arg1];
        int var14 = field1911[arg1];
        int var15 = field1913[arg2];
        int var16 = field1911[arg2];
        int var17 = field1913[arg3];
        int var18 = field1911[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1857; var20++) {
            int var21 = this.field1889[var20];
            int var22 = this.field1914[var20];
            int var23 = this.field1860[var20];
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
            field1900[var20] = (var27 << 9) / arg7 + var9;
            field1897[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1873 > 0) {
                field1886[var20] = var27;
                field1892[var20] = var30;
                field1891[var20] = var31;
            }
        }
        try {
            this.method2200(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dd.ah(IIIIIIIII)V")
    public void method1808(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1895[0] = -1;
        if (this.field1878 != 1) {
            this.method2184();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1854 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1854 << 9;
        if (var15 / var13 >= Statics.field1777) {
            return;
        }
        int var16 = this.field1854 + var14 << 9;
        if (var16 / var13 <= Statics.field1762) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1854 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1769) {
            return;
        }
        int var20 = (this.field1549 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1779) {
            return;
        }
        int var22 = (this.field1549 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1873 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1908) {
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
            int var32 = field1909 - Statics.field1765;
            int var33 = field1858 - Statics.field1778;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1879) {
                    field1912[field1867++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1765;
        int var35 = Statics.field1778;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1913[arg0];
            var37 = field1911[arg0];
        }
        for (int var38 = 0; var38 < this.field1857; var38++) {
            int var39 = this.field1889[var38];
            int var40 = this.field1914[var38];
            int var41 = this.field1860[var38];
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
                field1900[var38] = (var46 << 9) / var50 + var34;
                field1897[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1900[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1886[var38] = var46;
                field1892[var38] = var49;
                field1891[var38] = var50;
            }
        }
        try {
            this.method2200(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dd.b(ZZI)V")
    public final void method2200(boolean arg0, boolean arg1, int arg2) {
        if (this.field1883 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1883; var4++) {
            field1895[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1861; var5++) {
            if (this.field1882[var5] != -2) {
                int var6 = this.field1862[var5];
                int var7 = this.field1880[var5];
                int var8 = this.field1864[var5];
                int var9 = field1900[var6];
                int var10 = field1900[var7];
                int var11 = field1900[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1886[var6];
                    int var13 = field1886[var7];
                    int var14 = field1886[var8];
                    int var15 = field1892[var6];
                    int var16 = field1892[var7];
                    int var17 = field1892[var8];
                    int var18 = field1891[var6];
                    int var19 = field1891[var7];
                    int var20 = field1891[var8];
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
                        field1887[var5] = true;
                        int var30 = (field1890[var6] + field1890[var7] + field1890[var8]) / 3 + this.field1901;
                        field1902[var30][field1895[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2194(field1909, field1858, field1897[var6], field1897[var7], field1897[var8], var9, var10, var11)) {
                        field1912[field1867++] = arg2;
                        arg1 = false;
                    }
                    if ((field1897[var8] - field1897[var7]) * (var9 - var10) - (field1897[var6] - field1897[var7]) * (var11 - var10) > 0) {
                        field1887[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1775 && var10 <= Statics.field1775 && var11 <= Statics.field1775) {
                            field1863[var5] = false;
                        } else {
                            field1863[var5] = true;
                        }
                        int var31 = (field1890[var6] + field1890[var7] + field1890[var8]) / 3 + this.field1901;
                        field1902[var31][field1895[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1868 == null) {
            for (int var32 = this.field1883 - 1; var32 >= 0; var32--) {
                int var33 = field1895[var32];
                if (var33 > 0) {
                    int[] var34 = field1902[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2198(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1896[var36] = 0;
            field1903[var36] = 0;
        }
        for (int var37 = this.field1883 - 1; var37 >= 0; var37--) {
            int var38 = field1895[var37];
            if (var38 > 0) {
                int[] var39 = field1902[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1868[var41];
                    int var43 = field1896[var42]++;
                    field1898[var42][var43] = var41;
                    if (var42 < 10) {
                        field1903[var42] += var37;
                    } else if (var42 == 10) {
                        field1893[var43] = var37;
                    } else {
                        field1910[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1896[1] > 0 || field1896[2] > 0) {
            var44 = (field1903[1] + field1903[2]) / (field1896[1] + field1896[2]);
        }
        int var45 = 0;
        if (field1896[3] > 0 || field1896[4] > 0) {
            var45 = (field1903[3] + field1903[4]) / (field1896[3] + field1896[4]);
        }
        int var46 = 0;
        if (field1896[6] > 0 || field1896[8] > 0) {
            var46 = (field1903[6] + field1903[8]) / (field1896[6] + field1896[8]);
        }
        int var47 = 0;
        int var48 = field1896[10];
        int[] var49 = field1898[10];
        int[] var50 = field1893;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1896[11];
            var49 = field1898[11];
            var50 = field1910;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2198(var49[var47++]);
                if (var47 == var48 && field1898[11] != var49) {
                    var47 = 0;
                    var48 = field1896[11];
                    var49 = field1898[11];
                    var50 = field1910;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2198(var49[var47++]);
                if (var47 == var48 && field1898[11] != var49) {
                    var47 = 0;
                    var48 = field1896[11];
                    var49 = field1898[11];
                    var50 = field1910;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2198(var49[var47++]);
                if (var47 == var48 && field1898[11] != var49) {
                    var47 = 0;
                    var48 = field1896[11];
                    var49 = field1898[11];
                    var50 = field1910;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1896[var52];
            int[] var54 = field1898[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2198(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2198(var49[var47++]);
            if (var47 == var48 && field1898[11] != var49) {
                var47 = 0;
                var49 = field1898[11];
                var48 = field1896[11];
                var50 = field1910;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dd.j(I)V")
    public final void method2198(int arg0) {
        if (field1887[arg0]) {
            this.method2201(arg0);
            return;
        }
        int var2 = this.field1862[arg0];
        int var3 = this.field1880[arg0];
        int var4 = this.field1864[arg0];
        class104.field1772 = field1863[arg0];
        if (this.field1869 == null) {
            class104.field1766 = 0;
        } else {
            class104.field1766 = this.field1869[arg0] & 0xFF;
        }
        if (this.field1871 != null && this.field1871[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1884 == null || this.field1884[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1884[arg0] & 0xFF;
                var6 = this.field1874[var5];
                var7 = this.field1875[var5];
                var8 = this.field1876[var5];
            }
            if (this.field1882[arg0] == -1) {
                class104.method2122(field1897[var2], field1897[var3], field1897[var4], field1900[var2], field1900[var3], field1900[var4], this.field1915[arg0], this.field1915[arg0], this.field1915[arg0], field1886[var6], field1886[var7], field1886[var8], field1892[var6], field1892[var7], field1892[var8], field1891[var6], field1891[var7], field1891[var8], this.field1871[arg0]);
            } else {
                class104.method2122(field1897[var2], field1897[var3], field1897[var4], field1900[var2], field1900[var3], field1900[var4], this.field1915[arg0], this.field1866[arg0], this.field1882[arg0], field1886[var6], field1886[var7], field1886[var8], field1892[var6], field1892[var7], field1892[var8], field1891[var6], field1891[var7], field1891[var8], this.field1871[arg0]);
            }
        } else if (this.field1882[arg0] == -1) {
            class104.method2079(field1897[var2], field1897[var3], field1897[var4], field1900[var2], field1900[var3], field1900[var4], field1888[this.field1915[arg0]]);
        } else {
            class104.method2129(field1897[var2], field1897[var3], field1897[var4], field1900[var2], field1900[var3], field1900[var4], this.field1915[arg0], this.field1866[arg0], this.field1882[arg0]);
        }
    }

    @ObfuscatedName("dd.m(I)V")
    public final void method2201(int arg0) {
        int var2 = Statics.field1765;
        int var3 = Statics.field1778;
        int var4 = 0;
        int var5 = this.field1862[arg0];
        int var6 = this.field1880[arg0];
        int var7 = this.field1864[arg0];
        int var8 = field1891[var5];
        int var9 = field1891[var6];
        int var10 = field1891[var7];
        if (this.field1869 == null) {
            class104.field1766 = 0;
        } else {
            class104.field1766 = this.field1869[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1853[var4] = field1900[var5];
            field1905[var4] = field1897[var5];
            field1904[var4++] = this.field1915[arg0];
        } else {
            int var11 = field1886[var5];
            int var12 = field1892[var5];
            int var13 = this.field1915[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1916[var10 - var8];
                field1853[var4] = (((field1886[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1905[var4] = (((field1892[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1904[var4++] = ((this.field1882[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1916[var9 - var8];
                field1853[var4] = (((field1886[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1905[var4] = (((field1892[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1904[var4++] = ((this.field1866[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1853[var4] = field1900[var6];
            field1905[var4] = field1897[var6];
            field1904[var4++] = this.field1866[arg0];
        } else {
            int var16 = field1886[var6];
            int var17 = field1892[var6];
            int var18 = this.field1866[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1916[var8 - var9];
                field1853[var4] = (((field1886[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1905[var4] = (((field1892[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1904[var4++] = ((this.field1915[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1916[var10 - var9];
                field1853[var4] = (((field1886[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1905[var4] = (((field1892[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1904[var4++] = ((this.field1882[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1853[var4] = field1900[var7];
            field1905[var4] = field1897[var7];
            field1904[var4++] = this.field1882[arg0];
        } else {
            int var21 = field1886[var7];
            int var22 = field1892[var7];
            int var23 = this.field1882[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1916[var9 - var10];
                field1853[var4] = (((field1886[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1905[var4] = (((field1892[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1904[var4++] = ((this.field1866[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1916[var8 - var10];
                field1853[var4] = (((field1886[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1905[var4] = (((field1892[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1904[var4++] = ((this.field1915[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1853[0];
        int var27 = field1853[1];
        int var28 = field1853[2];
        int var29 = field1905[0];
        int var30 = field1905[1];
        int var31 = field1905[2];
        class104.field1772 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1775 || var27 > Statics.field1775 || var28 > Statics.field1775) {
                class104.field1772 = true;
            }
            if (this.field1871 != null && this.field1871[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1884 == null || this.field1884[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1884[arg0] & 0xFF;
                    var33 = this.field1874[var32];
                    var34 = this.field1875[var32];
                    var35 = this.field1876[var32];
                }
                if (this.field1882[arg0] == -1) {
                    class104.method2122(var29, var30, var31, var26, var27, var28, this.field1915[arg0], this.field1915[arg0], this.field1915[arg0], field1886[var33], field1886[var34], field1886[var35], field1892[var33], field1892[var34], field1892[var35], field1891[var33], field1891[var34], field1891[var35], this.field1871[arg0]);
                } else {
                    class104.method2122(var29, var30, var31, var26, var27, var28, field1904[0], field1904[1], field1904[2], field1886[var33], field1886[var34], field1886[var35], field1892[var33], field1892[var34], field1892[var35], field1891[var33], field1891[var34], field1891[var35], this.field1871[arg0]);
                }
            } else if (this.field1882[arg0] == -1) {
                class104.method2079(var29, var30, var31, var26, var27, var28, field1888[this.field1915[arg0]]);
            } else {
                class104.method2129(var29, var30, var31, var26, var27, var28, field1904[0], field1904[1], field1904[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1775 || var27 > Statics.field1775 || var28 > Statics.field1775 || field1853[3] < 0 || field1853[3] > Statics.field1775) {
            class104.field1772 = true;
        }
        if (this.field1871 != null && this.field1871[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1884 == null || this.field1884[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1884[arg0] & 0xFF;
                var37 = this.field1874[var36];
                var38 = this.field1875[var36];
                var39 = this.field1876[var36];
            }
            short var40 = this.field1871[arg0];
            if (this.field1882[arg0] == -1) {
                class104.method2122(var29, var30, var31, var26, var27, var28, this.field1915[arg0], this.field1915[arg0], this.field1915[arg0], field1886[var37], field1886[var38], field1886[var39], field1892[var37], field1892[var38], field1892[var39], field1891[var37], field1891[var38], field1891[var39], var40);
                class104.method2122(var29, var31, field1905[3], var26, var28, field1853[3], this.field1915[arg0], this.field1915[arg0], this.field1915[arg0], field1886[var37], field1886[var38], field1886[var39], field1892[var37], field1892[var38], field1892[var39], field1891[var37], field1891[var38], field1891[var39], var40);
            } else {
                class104.method2122(var29, var30, var31, var26, var27, var28, field1904[0], field1904[1], field1904[2], field1886[var37], field1886[var38], field1886[var39], field1892[var37], field1892[var38], field1892[var39], field1891[var37], field1891[var38], field1891[var39], var40);
                class104.method2122(var29, var31, field1905[3], var26, var28, field1853[3], field1904[0], field1904[2], field1904[3], field1886[var37], field1886[var38], field1886[var39], field1892[var37], field1892[var38], field1892[var39], field1891[var37], field1891[var38], field1891[var39], var40);
            }
        } else if (this.field1882[arg0] == -1) {
            int var41 = field1888[this.field1915[arg0]];
            class104.method2079(var29, var30, var31, var26, var27, var28, var41);
            class104.method2079(var29, var31, field1905[3], var26, var28, field1853[3], var41);
        } else {
            class104.method2129(var29, var30, var31, var26, var27, var28, field1904[0], field1904[1], field1904[2]);
            class104.method2129(var29, var31, field1905[3], var26, var28, field1853[3], field1904[0], field1904[2], field1904[3]);
        }
    }

    @ObfuscatedName("dd.k(IIIIIIII)Z")
    public final boolean method2194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
