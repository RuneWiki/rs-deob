package deob;

@ObfuscatedName("db")
public class class112 extends class94 {

    @ObfuscatedName("db.i")
    public static class112 field1900 = new class112();

    @ObfuscatedName("db.w")
    public static byte[] field1864 = new byte[1];

    @ObfuscatedName("db.f")
    public static class112 field1865 = new class112();

    @ObfuscatedName("db.e")
    public static byte[] field1884 = new byte[1];

    @ObfuscatedName("db.t")
    public int field1874 = 0;

    @ObfuscatedName("db.d")
    public int[] field1868;

    @ObfuscatedName("db.p")
    public int[] field1869;

    @ObfuscatedName("db.k")
    public int[] field1870;

    @ObfuscatedName("db.r")
    public int field1871 = 0;

    @ObfuscatedName("db.l")
    public int[] field1895;

    @ObfuscatedName("db.a")
    public int[] field1882;

    @ObfuscatedName("db.z")
    public int[] field1863;

    @ObfuscatedName("db.s")
    public int[] field1914;

    @ObfuscatedName("db.m")
    public int[] field1876;

    @ObfuscatedName("db.u")
    public int[] field1877;

    @ObfuscatedName("db.g")
    public byte[] field1909;

    @ObfuscatedName("db.o")
    public byte[] field1879;

    @ObfuscatedName("db.v")
    public byte[] field1880;

    @ObfuscatedName("db.j")
    public short[] field1881;

    @ObfuscatedName("db.n")
    public byte field1919 = 0;

    @ObfuscatedName("db.q")
    public int field1915 = 0;

    @ObfuscatedName("db.c")
    public int[] field1893;

    @ObfuscatedName("db.h")
    public int[] field1885;

    @ObfuscatedName("db.b")
    public int[] field1886;

    @ObfuscatedName("db.y")
    public int[][] field1887;

    @ObfuscatedName("db.x")
    public int[][] field1872;

    @ObfuscatedName("db.ao")
    public boolean field1889 = false;

    @ObfuscatedName("db.ae")
    public int field1890;

    @ObfuscatedName("db.aa")
    public int field1891;

    @ObfuscatedName("db.ah")
    public int field1892;

    @ObfuscatedName("db.aw")
    public int field1866;

    @ObfuscatedName("db.an")
    public int field1894;

    @ObfuscatedName("db.ak")
    public static boolean[] field1897 = new boolean[4096];

    @ObfuscatedName("db.ax")
    public static boolean[] field1883 = new boolean[4096];

    @ObfuscatedName("db.ab")
    public static int[] field1888 = new int[4096];

    @ObfuscatedName("db.af")
    public static int[] field1899 = new int[4096];

    @ObfuscatedName("db.ai")
    public static int[] field1924 = new int[4096];

    @ObfuscatedName("db.at")
    public static int[] field1901 = new int[4096];

    @ObfuscatedName("db.aq")
    public static int[] field1902 = new int[4096];

    @ObfuscatedName("db.ac")
    public static int[] field1903 = new int[4096];

    @ObfuscatedName("db.ag")
    public static int[] field1905 = new int[1600];

    @ObfuscatedName("db.ap")
    public static int[][] field1906 = new int[1600][512];

    @ObfuscatedName("db.am")
    public static int[] field1907 = new int[12];

    @ObfuscatedName("db.as")
    public static int[][] field1908 = new int[12][2000];

    @ObfuscatedName("db.aj")
    public static int[] field1917 = new int[2000];

    @ObfuscatedName("db.ar")
    public static int[] field1910 = new int[2000];

    @ObfuscatedName("db.au")
    public static int[] field1911 = new int[12];

    @ObfuscatedName("db.ad")
    public static int[] field1912 = new int[10];

    @ObfuscatedName("db.az")
    public static int[] field1913 = new int[10];

    @ObfuscatedName("db.ay")
    public static int[] field1896 = new int[10];

    @ObfuscatedName("db.bj")
    public static boolean field1918 = false;

    @ObfuscatedName("db.bu")
    public static int field1878 = 0;

    @ObfuscatedName("db.br")
    public static int field1920 = 0;

    @ObfuscatedName("db.bd")
    public static int field1921 = 0;

    @ObfuscatedName("db.bf")
    public static int[] field1922 = new int[1000];

    @ObfuscatedName("db.bg")
    public static int[] field1867 = class104.field1787;

    @ObfuscatedName("db.bp")
    public static int[] field1898 = class104.field1788;

    @ObfuscatedName("db.bb")
    public static int[] field1925 = class104.field1784;

    @ObfuscatedName("db.bc")
    public static int[] field1926 = class104.field1786;

    public class112() {
    }

    public class112(class112[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1874 = 0;
        this.field1871 = 0;
        this.field1915 = 0;
        this.field1919 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class112 var8 = arg0[var7];
            if (var8 != null) {
                this.field1874 += var8.field1874;
                this.field1871 += var8.field1871;
                this.field1915 += var8.field1915;
                if (var8.field1909 == null) {
                    if (this.field1919 == -1) {
                        this.field1919 = var8.field1919;
                    }
                    if (this.field1919 != var8.field1919) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1879 != null;
                var5 |= var8.field1881 != null;
                var6 |= var8.field1880 != null;
            }
        }
        this.field1868 = new int[this.field1874];
        this.field1869 = new int[this.field1874];
        this.field1870 = new int[this.field1874];
        this.field1895 = new int[this.field1871];
        this.field1882 = new int[this.field1871];
        this.field1863 = new int[this.field1871];
        this.field1914 = new int[this.field1871];
        this.field1876 = new int[this.field1871];
        this.field1877 = new int[this.field1871];
        if (var3) {
            this.field1909 = new byte[this.field1871];
        }
        if (var4) {
            this.field1879 = new byte[this.field1871];
        }
        if (var5) {
            this.field1881 = new short[this.field1871];
        }
        if (var6) {
            this.field1880 = new byte[this.field1871];
        }
        if (this.field1915 > 0) {
            this.field1893 = new int[this.field1915];
            this.field1885 = new int[this.field1915];
            this.field1886 = new int[this.field1915];
        }
        this.field1874 = 0;
        this.field1871 = 0;
        this.field1915 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class112 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1871; var11++) {
                    this.field1895[this.field1871] = var10.field1895[var11] + this.field1874;
                    this.field1882[this.field1871] = var10.field1882[var11] + this.field1874;
                    this.field1863[this.field1871] = var10.field1863[var11] + this.field1874;
                    this.field1914[this.field1871] = var10.field1914[var11];
                    this.field1876[this.field1871] = var10.field1876[var11];
                    this.field1877[this.field1871] = var10.field1877[var11];
                    if (var3) {
                        if (var10.field1909 == null) {
                            this.field1909[this.field1871] = var10.field1919;
                        } else {
                            this.field1909[this.field1871] = var10.field1909[var11];
                        }
                    }
                    if (var4 && var10.field1879 != null) {
                        this.field1879[this.field1871] = var10.field1879[var11];
                    }
                    if (var5) {
                        if (var10.field1881 == null) {
                            this.field1881[this.field1871] = -1;
                        } else {
                            this.field1881[this.field1871] = var10.field1881[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1880 == null || var10.field1880[var11] == -1) {
                            this.field1880[this.field1871] = -1;
                        } else {
                            this.field1880[this.field1871] = (byte) (var10.field1880[var11] + this.field1915);
                        }
                    }
                    this.field1871++;
                }
                for (int var12 = 0; var12 < var10.field1915; var12++) {
                    this.field1893[this.field1915] = var10.field1893[var12] + this.field1874;
                    this.field1885[this.field1915] = var10.field1885[var12] + this.field1874;
                    this.field1886[this.field1915] = var10.field1886[var12] + this.field1874;
                    this.field1915++;
                }
                for (int var13 = 0; var13 < var10.field1874; var13++) {
                    this.field1868[this.field1874] = var10.field1868[var13];
                    this.field1869[this.field1874] = var10.field1869[var13];
                    this.field1870[this.field1874] = var10.field1870[var13];
                    this.field1874++;
                }
            }
        }
    }

    @ObfuscatedName("db.i([[IIIIZI)Ldb;")
    public class112 method2240(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2244();
        int var7 = arg1 - this.field1892;
        int var8 = this.field1892 + arg1;
        int var9 = arg3 - this.field1892;
        int var10 = this.field1892 + arg3;
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
            var15.field1874 = this.field1874;
            var15.field1871 = this.field1871;
            var15.field1915 = this.field1915;
            var15.field1868 = this.field1868;
            var15.field1870 = this.field1870;
            var15.field1895 = this.field1895;
            var15.field1882 = this.field1882;
            var15.field1863 = this.field1863;
            var15.field1914 = this.field1914;
            var15.field1876 = this.field1876;
            var15.field1877 = this.field1877;
            var15.field1909 = this.field1909;
            var15.field1879 = this.field1879;
            var15.field1880 = this.field1880;
            var15.field1881 = this.field1881;
            var15.field1919 = this.field1919;
            var15.field1893 = this.field1893;
            var15.field1885 = this.field1885;
            var15.field1886 = this.field1886;
            var15.field1887 = this.field1887;
            var15.field1872 = this.field1872;
            var15.field1889 = this.field1889;
            var15.field1869 = new int[var15.field1874];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1874; var16++) {
                int var17 = this.field1868[var16] + arg1;
                int var18 = this.field1870[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1869[var16] = this.field1869[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1874; var26++) {
                int var27 = (-this.field1869[var26] << 16) / this.field1548;
                if (var27 < arg5) {
                    int var28 = this.field1868[var26] + arg1;
                    int var29 = this.field1870[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1869[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1869[var26];
                }
            }
        }
        var15.field1890 = 0;
        return var15;
    }

    @ObfuscatedName("db.f(Z)Ldb;")
    public class112 method2241(boolean arg0) {
        if (!arg0 && field1864.length < this.field1871) {
            field1864 = new byte[this.field1871 + 100];
        }
        return this.method2243(arg0, field1900, field1864);
    }

    @ObfuscatedName("db.e(Z)Ldb;")
    public class112 method2308(boolean arg0) {
        if (!arg0 && field1884.length < this.field1871) {
            field1884 = new byte[this.field1871 + 100];
        }
        return this.method2243(arg0, field1865, field1884);
    }

    @ObfuscatedName("db.t(ZLdb;[B)Ldb;")
    public class112 method2243(boolean arg0, class112 arg1, byte[] arg2) {
        arg1.field1874 = this.field1874;
        arg1.field1871 = this.field1871;
        arg1.field1915 = this.field1915;
        if (arg1.field1868 == null || arg1.field1868.length < this.field1874) {
            arg1.field1868 = new int[this.field1874 + 100];
            arg1.field1869 = new int[this.field1874 + 100];
            arg1.field1870 = new int[this.field1874 + 100];
        }
        for (int var4 = 0; var4 < this.field1874; var4++) {
            arg1.field1868[var4] = this.field1868[var4];
            arg1.field1869[var4] = this.field1869[var4];
            arg1.field1870[var4] = this.field1870[var4];
        }
        if (arg0) {
            arg1.field1879 = this.field1879;
        } else {
            arg1.field1879 = arg2;
            if (this.field1879 == null) {
                for (int var5 = 0; var5 < this.field1871; var5++) {
                    arg1.field1879[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1871; var6++) {
                    arg1.field1879[var6] = this.field1879[var6];
                }
            }
        }
        arg1.field1895 = this.field1895;
        arg1.field1882 = this.field1882;
        arg1.field1863 = this.field1863;
        arg1.field1914 = this.field1914;
        arg1.field1876 = this.field1876;
        arg1.field1877 = this.field1877;
        arg1.field1909 = this.field1909;
        arg1.field1880 = this.field1880;
        arg1.field1881 = this.field1881;
        arg1.field1919 = this.field1919;
        arg1.field1893 = this.field1893;
        arg1.field1885 = this.field1885;
        arg1.field1886 = this.field1886;
        arg1.field1887 = this.field1887;
        arg1.field1872 = this.field1872;
        arg1.field1889 = this.field1889;
        arg1.field1890 = 0;
        return arg1;
    }

    @ObfuscatedName("db.d()V")
    public void method2244() {
        if (this.field1890 == 1) {
            return;
        }
        this.field1890 = 1;
        this.field1548 = 0;
        this.field1891 = 0;
        this.field1892 = 0;
        for (int var1 = 0; var1 < this.field1874; var1++) {
            int var2 = this.field1868[var1];
            int var3 = this.field1869[var1];
            int var4 = this.field1870[var1];
            if (-var3 > this.field1548) {
                this.field1548 = -var3;
            }
            if (var3 > this.field1891) {
                this.field1891 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1892) {
                this.field1892 = var5;
            }
        }
        this.field1892 = (int) (Math.sqrt((double) this.field1892) + 0.99D);
        this.field1894 = (int) (Math.sqrt((double) (this.field1548 * this.field1548 + this.field1892 * this.field1892)) + 0.99D);
        this.field1866 = this.field1894 + (int) (Math.sqrt((double) (this.field1892 * this.field1892 + this.field1891 * this.field1891)) + 0.99D);
    }

    @ObfuscatedName("db.l()V")
    public void method2245() {
        if (this.field1890 == 2) {
            return;
        }
        this.field1890 = 2;
        this.field1892 = 0;
        for (int var1 = 0; var1 < this.field1874; var1++) {
            int var2 = this.field1868[var1];
            int var3 = this.field1869[var1];
            int var4 = this.field1870[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1892) {
                this.field1892 = var5;
            }
        }
        this.field1892 = (int) (Math.sqrt((double) this.field1892) + 0.99D);
        this.field1894 = this.field1892;
        this.field1866 = this.field1892 + this.field1892;
    }

    @ObfuscatedName("db.a()I")
    public int method2287() {
        this.method2244();
        return this.field1892;
    }

    @ObfuscatedName("db.z(Ldk;I)V")
    public void method2247(class109 arg0, int arg1) {
        if (this.field1887 == null || arg1 == -1) {
            return;
        }
        class97 var3 = arg0.field1825[arg1];
        class105 var4 = var3.field1634;
        Statics.field1923 = 0;
        Statics.field1916 = 0;
        Statics.field1873 = 0;
        for (int var5 = 0; var5 < var3.field1635; var5++) {
            int var6 = var3.field1630[var5];
            this.method2242(var4.field1790[var6], var4.field1792[var6], var3.field1637[var5], var3.field1638[var5], var3.field1631[var5]);
        }
        this.field1890 = 0;
    }

    @ObfuscatedName("db.s(Ldk;ILdk;I[I)V")
    public void method2248(class109 arg0, int arg1, class109 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2247(arg0, arg1);
            return;
        }
        class97 var6 = arg0.field1825[arg1];
        class97 var7 = arg2.field1825[arg3];
        class105 var8 = var6.field1634;
        Statics.field1923 = 0;
        Statics.field1916 = 0;
        Statics.field1873 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1635; var11++) {
            int var12 = var6.field1630[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1790[var12] == 0) {
                this.method2242(var8.field1790[var12], var8.field1792[var12], var6.field1637[var11], var6.field1638[var11], var6.field1631[var11]);
            }
        }
        Statics.field1923 = 0;
        Statics.field1916 = 0;
        Statics.field1873 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1635; var15++) {
            int var16 = var7.field1630[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1790[var16] == 0) {
                this.method2242(var8.field1790[var16], var8.field1792[var16], var7.field1637[var15], var7.field1638[var15], var7.field1631[var15]);
            }
        }
        this.field1890 = 0;
    }

    @ObfuscatedName("db.m(I[IIII)V")
    public void method2242(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1923 = 0;
            Statics.field1916 = 0;
            Statics.field1873 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1887.length) {
                    int[] var10 = this.field1887[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1923 += this.field1868[var12];
                        Statics.field1916 += this.field1869[var12];
                        Statics.field1873 += this.field1870[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1923 = Statics.field1923 / var7 + arg2;
                Statics.field1916 = Statics.field1916 / var7 + arg3;
                Statics.field1873 = Statics.field1873 / var7 + arg4;
            } else {
                Statics.field1923 = arg2;
                Statics.field1916 = arg3;
                Statics.field1873 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1887.length) {
                    int[] var15 = this.field1887[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1868[var17] += arg2;
                        this.field1869[var17] += arg3;
                        this.field1870[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1887.length) {
                    int[] var20 = this.field1887[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1868[var22] -= Statics.field1923;
                        this.field1869[var22] -= Statics.field1916;
                        this.field1870[var22] -= Statics.field1873;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1867[var25];
                            int var27 = field1898[var25];
                            int var28 = this.field1869[var22] * var26 + this.field1868[var22] * var27 >> 16;
                            this.field1869[var22] = this.field1869[var22] * var27 - this.field1868[var22] * var26 >> 16;
                            this.field1868[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1867[var23];
                            int var30 = field1898[var23];
                            int var31 = this.field1869[var22] * var30 - this.field1870[var22] * var29 >> 16;
                            this.field1870[var22] = this.field1870[var22] * var30 + this.field1869[var22] * var29 >> 16;
                            this.field1869[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1867[var24];
                            int var33 = field1898[var24];
                            int var34 = this.field1870[var22] * var32 + this.field1868[var22] * var33 >> 16;
                            this.field1870[var22] = this.field1870[var22] * var33 - this.field1868[var22] * var32 >> 16;
                            this.field1868[var22] = var34;
                        }
                        this.field1868[var22] += Statics.field1923;
                        this.field1869[var22] += Statics.field1916;
                        this.field1870[var22] += Statics.field1873;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1887.length) {
                    int[] var37 = this.field1887[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1868[var39] -= Statics.field1923;
                        this.field1869[var39] -= Statics.field1916;
                        this.field1870[var39] -= Statics.field1873;
                        this.field1868[var39] = this.field1868[var39] * arg2 / 128;
                        this.field1869[var39] = this.field1869[var39] * arg3 / 128;
                        this.field1870[var39] = this.field1870[var39] * arg4 / 128;
                        this.field1868[var39] += Statics.field1923;
                        this.field1869[var39] += Statics.field1916;
                        this.field1870[var39] += Statics.field1873;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1872 != null && this.field1879 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1872.length) {
                    int[] var42 = this.field1872[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1879[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1879[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("db.u()V")
    public void method2301() {
        for (int var1 = 0; var1 < this.field1874; var1++) {
            int var2 = this.field1868[var1];
            this.field1868[var1] = this.field1870[var1];
            this.field1870[var1] = -var2;
        }
        this.field1890 = 0;
    }

    @ObfuscatedName("db.g()V")
    public void method2260() {
        for (int var1 = 0; var1 < this.field1874; var1++) {
            this.field1868[var1] = -this.field1868[var1];
            this.field1870[var1] = -this.field1870[var1];
        }
        this.field1890 = 0;
    }

    @ObfuscatedName("db.o()V")
    public void method2252() {
        for (int var1 = 0; var1 < this.field1874; var1++) {
            int var2 = this.field1870[var1];
            this.field1870[var1] = this.field1868[var1];
            this.field1868[var1] = -var2;
        }
        this.field1890 = 0;
    }

    @ObfuscatedName("db.v(I)V")
    public void method2253(int arg0) {
        int var2 = field1867[arg0];
        int var3 = field1898[arg0];
        for (int var4 = 0; var4 < this.field1874; var4++) {
            int var5 = this.field1869[var4] * var3 - this.field1870[var4] * var2 >> 16;
            this.field1870[var4] = this.field1870[var4] * var3 + this.field1869[var4] * var2 >> 16;
            this.field1869[var4] = var5;
        }
        this.field1890 = 0;
    }

    @ObfuscatedName("db.j(III)V")
    public void method2264(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1874; var4++) {
            this.field1868[var4] += arg0;
            this.field1869[var4] += arg1;
            this.field1870[var4] += arg2;
        }
        this.field1890 = 0;
    }

    @ObfuscatedName("db.n(III)V")
    public void method2255(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1874; var4++) {
            this.field1868[var4] = this.field1868[var4] * arg0 / 128;
            this.field1869[var4] = this.field1869[var4] * arg1 / 128;
            this.field1870[var4] = this.field1870[var4] * arg2 / 128;
        }
        this.field1890 = 0;
    }

    @ObfuscatedName("db.q(IIIIIII)V")
    public final void method2256(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1905[0] = -1;
        if (this.field1890 != 2 && this.field1890 != 1) {
            this.method2245();
        }
        int var8 = Statics.field1769;
        int var9 = Statics.field1775;
        int var10 = field1867[arg0];
        int var11 = field1898[arg0];
        int var12 = field1867[arg1];
        int var13 = field1898[arg1];
        int var14 = field1867[arg2];
        int var15 = field1898[arg2];
        int var16 = field1867[arg3];
        int var17 = field1898[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1874; var19++) {
            int var20 = this.field1868[var19];
            int var21 = this.field1869[var19];
            int var22 = this.field1870[var19];
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
            field1924[var19] = var30 - var18;
            field1888[var19] = (var26 << 9) / var30 + var8;
            field1899[var19] = (var29 << 9) / var30 + var9;
            if (this.field1915 > 0) {
                field1901[var19] = var26;
                field1902[var19] = var29;
                field1903[var19] = var30;
            }
        }
        try {
            this.method2295(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("db.c(IIIIIIII)V")
    public final void method2257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1905[0] = -1;
        if (this.field1890 != 2 && this.field1890 != 1) {
            this.method2245();
        }
        int var9 = Statics.field1769;
        int var10 = Statics.field1775;
        int var11 = field1867[arg0];
        int var12 = field1898[arg0];
        int var13 = field1867[arg1];
        int var14 = field1898[arg1];
        int var15 = field1867[arg2];
        int var16 = field1898[arg2];
        int var17 = field1867[arg3];
        int var18 = field1898[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1874; var20++) {
            int var21 = this.field1868[var20];
            int var22 = this.field1869[var20];
            int var23 = this.field1870[var20];
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
            field1924[var20] = var31 - var19;
            field1888[var20] = (var27 << 9) / arg7 + var9;
            field1899[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1915 > 0) {
                field1901[var20] = var27;
                field1902[var20] = var30;
                field1903[var20] = var31;
            }
        }
        try {
            this.method2295(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("db.ae(IIIIIIIII)V")
    public void method1867(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1905[0] = -1;
        if (this.field1890 != 1) {
            this.method2244();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1892 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1892 << 9;
        if (var15 / var13 >= Statics.field1779) {
            return;
        }
        int var16 = this.field1892 + var14 << 9;
        if (var16 / var13 <= Statics.field1773) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1892 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1764) {
            return;
        }
        int var20 = (this.field1548 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1781) {
            return;
        }
        int var22 = (this.field1548 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1915 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1918) {
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
            int var32 = field1878 - Statics.field1769;
            int var33 = field1920 - Statics.field1775;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1889) {
                    field1922[field1921++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1769;
        int var35 = Statics.field1775;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1867[arg0];
            var37 = field1898[arg0];
        }
        for (int var38 = 0; var38 < this.field1874; var38++) {
            int var39 = this.field1868[var38];
            int var40 = this.field1869[var38];
            int var41 = this.field1870[var38];
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
            field1924[var38] = var50 - var11;
            if (var50 >= 50) {
                field1888[var38] = (var46 << 9) / var50 + var34;
                field1899[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1888[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1901[var38] = var46;
                field1902[var38] = var49;
                field1903[var38] = var50;
            }
        }
        try {
            this.method2295(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("db.h(ZZI)V")
    public final void method2295(boolean arg0, boolean arg1, int arg2) {
        if (this.field1866 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1866; var4++) {
            field1905[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1871; var5++) {
            if (this.field1877[var5] != -2) {
                int var6 = this.field1895[var5];
                int var7 = this.field1882[var5];
                int var8 = this.field1863[var5];
                int var9 = field1888[var6];
                int var10 = field1888[var7];
                int var11 = field1888[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1901[var6];
                    int var13 = field1901[var7];
                    int var14 = field1901[var8];
                    int var15 = field1902[var6];
                    int var16 = field1902[var7];
                    int var17 = field1902[var8];
                    int var18 = field1903[var6];
                    int var19 = field1903[var7];
                    int var20 = field1903[var8];
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
                        field1883[var5] = true;
                        int var30 = (field1924[var6] + field1924[var7] + field1924[var8]) / 3 + this.field1894;
                        field1906[var30][field1905[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2300(field1878, field1920, field1899[var6], field1899[var7], field1899[var8], var9, var10, var11)) {
                        field1922[field1921++] = arg2;
                        arg1 = false;
                    }
                    if ((field1899[var8] - field1899[var7]) * (var9 - var10) - (field1899[var6] - field1899[var7]) * (var11 - var10) > 0) {
                        field1883[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1776 && var10 <= Statics.field1776 && var11 <= Statics.field1776) {
                            field1897[var5] = false;
                        } else {
                            field1897[var5] = true;
                        }
                        int var31 = (field1924[var6] + field1924[var7] + field1924[var8]) / 3 + this.field1894;
                        field1906[var31][field1905[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1909 == null) {
            for (int var32 = this.field1866 - 1; var32 >= 0; var32--) {
                int var33 = field1905[var32];
                if (var33 > 0) {
                    int[] var34 = field1906[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2285(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1907[var36] = 0;
            field1911[var36] = 0;
        }
        for (int var37 = this.field1866 - 1; var37 >= 0; var37--) {
            int var38 = field1905[var37];
            if (var38 > 0) {
                int[] var39 = field1906[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1909[var41];
                    int var43 = field1907[var42]++;
                    field1908[var42][var43] = var41;
                    if (var42 < 10) {
                        field1911[var42] += var37;
                    } else if (var42 == 10) {
                        field1917[var43] = var37;
                    } else {
                        field1910[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1907[1] > 0 || field1907[2] > 0) {
            var44 = (field1911[1] + field1911[2]) / (field1907[1] + field1907[2]);
        }
        int var45 = 0;
        if (field1907[3] > 0 || field1907[4] > 0) {
            var45 = (field1911[3] + field1911[4]) / (field1907[3] + field1907[4]);
        }
        int var46 = 0;
        if (field1907[6] > 0 || field1907[8] > 0) {
            var46 = (field1911[6] + field1911[8]) / (field1907[6] + field1907[8]);
        }
        int var47 = 0;
        int var48 = field1907[10];
        int[] var49 = field1908[10];
        int[] var50 = field1917;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1907[11];
            var49 = field1908[11];
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
                this.method2285(var49[var47++]);
                if (var47 == var48 && field1908[11] != var49) {
                    var47 = 0;
                    var48 = field1907[11];
                    var49 = field1908[11];
                    var50 = field1910;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2285(var49[var47++]);
                if (var47 == var48 && field1908[11] != var49) {
                    var47 = 0;
                    var48 = field1907[11];
                    var49 = field1908[11];
                    var50 = field1910;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2285(var49[var47++]);
                if (var47 == var48 && field1908[11] != var49) {
                    var47 = 0;
                    var48 = field1907[11];
                    var49 = field1908[11];
                    var50 = field1910;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1907[var52];
            int[] var54 = field1908[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2285(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2285(var49[var47++]);
            if (var47 == var48 && field1908[11] != var49) {
                var47 = 0;
                var49 = field1908[11];
                var48 = field1907[11];
                var50 = field1910;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("db.b(I)V")
    public final void method2285(int arg0) {
        if (field1883[arg0]) {
            this.method2250(arg0);
            return;
        }
        int var2 = this.field1895[arg0];
        int var3 = this.field1882[arg0];
        int var4 = this.field1863[arg0];
        class104.field1778 = field1897[arg0];
        if (this.field1879 == null) {
            class104.field1768 = 0;
        } else {
            class104.field1768 = this.field1879[arg0] & 0xFF;
        }
        if (this.field1881 != null && this.field1881[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1880 == null || this.field1880[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1880[arg0] & 0xFF;
                var6 = this.field1893[var5];
                var7 = this.field1885[var5];
                var8 = this.field1886[var5];
            }
            if (this.field1877[arg0] == -1) {
                class104.method2185(field1899[var2], field1899[var3], field1899[var4], field1888[var2], field1888[var3], field1888[var4], this.field1914[arg0], this.field1914[arg0], this.field1914[arg0], field1901[var6], field1901[var7], field1901[var8], field1902[var6], field1902[var7], field1902[var8], field1903[var6], field1903[var7], field1903[var8], this.field1881[arg0]);
            } else {
                class104.method2185(field1899[var2], field1899[var3], field1899[var4], field1888[var2], field1888[var3], field1888[var4], this.field1914[arg0], this.field1876[arg0], this.field1877[arg0], field1901[var6], field1901[var7], field1901[var8], field1902[var6], field1902[var7], field1902[var8], field1903[var6], field1903[var7], field1903[var8], this.field1881[arg0]);
            }
        } else if (this.field1877[arg0] == -1) {
            class104.method2143(field1899[var2], field1899[var3], field1899[var4], field1888[var2], field1888[var3], field1888[var4], field1925[this.field1914[arg0]]);
        } else {
            class104.method2141(field1899[var2], field1899[var3], field1899[var4], field1888[var2], field1888[var3], field1888[var4], this.field1914[arg0], this.field1876[arg0], this.field1877[arg0]);
        }
    }

    @ObfuscatedName("db.y(I)V")
    public final void method2250(int arg0) {
        int var2 = Statics.field1769;
        int var3 = Statics.field1775;
        int var4 = 0;
        int var5 = this.field1895[arg0];
        int var6 = this.field1882[arg0];
        int var7 = this.field1863[arg0];
        int var8 = field1903[var5];
        int var9 = field1903[var6];
        int var10 = field1903[var7];
        if (this.field1879 == null) {
            class104.field1768 = 0;
        } else {
            class104.field1768 = this.field1879[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1912[var4] = field1888[var5];
            field1913[var4] = field1899[var5];
            field1896[var4++] = this.field1914[arg0];
        } else {
            int var11 = field1901[var5];
            int var12 = field1902[var5];
            int var13 = this.field1914[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1926[var10 - var8];
                field1912[var4] = (((field1901[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1913[var4] = (((field1902[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1896[var4++] = ((this.field1877[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1926[var9 - var8];
                field1912[var4] = (((field1901[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1913[var4] = (((field1902[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1896[var4++] = ((this.field1876[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1912[var4] = field1888[var6];
            field1913[var4] = field1899[var6];
            field1896[var4++] = this.field1876[arg0];
        } else {
            int var16 = field1901[var6];
            int var17 = field1902[var6];
            int var18 = this.field1876[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1926[var8 - var9];
                field1912[var4] = (((field1901[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1913[var4] = (((field1902[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1896[var4++] = ((this.field1914[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1926[var10 - var9];
                field1912[var4] = (((field1901[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1913[var4] = (((field1902[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1896[var4++] = ((this.field1877[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1912[var4] = field1888[var7];
            field1913[var4] = field1899[var7];
            field1896[var4++] = this.field1877[arg0];
        } else {
            int var21 = field1901[var7];
            int var22 = field1902[var7];
            int var23 = this.field1877[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1926[var9 - var10];
                field1912[var4] = (((field1901[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1913[var4] = (((field1902[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1896[var4++] = ((this.field1876[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1926[var8 - var10];
                field1912[var4] = (((field1901[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1913[var4] = (((field1902[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1896[var4++] = ((this.field1914[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1912[0];
        int var27 = field1912[1];
        int var28 = field1912[2];
        int var29 = field1913[0];
        int var30 = field1913[1];
        int var31 = field1913[2];
        class104.field1778 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1776 || var27 > Statics.field1776 || var28 > Statics.field1776) {
                class104.field1778 = true;
            }
            if (this.field1881 != null && this.field1881[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1880 == null || this.field1880[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1880[arg0] & 0xFF;
                    var33 = this.field1893[var32];
                    var34 = this.field1885[var32];
                    var35 = this.field1886[var32];
                }
                if (this.field1877[arg0] == -1) {
                    class104.method2185(var29, var30, var31, var26, var27, var28, this.field1914[arg0], this.field1914[arg0], this.field1914[arg0], field1901[var33], field1901[var34], field1901[var35], field1902[var33], field1902[var34], field1902[var35], field1903[var33], field1903[var34], field1903[var35], this.field1881[arg0]);
                } else {
                    class104.method2185(var29, var30, var31, var26, var27, var28, field1896[0], field1896[1], field1896[2], field1901[var33], field1901[var34], field1901[var35], field1902[var33], field1902[var34], field1902[var35], field1903[var33], field1903[var34], field1903[var35], this.field1881[arg0]);
                }
            } else if (this.field1877[arg0] == -1) {
                class104.method2143(var29, var30, var31, var26, var27, var28, field1925[this.field1914[arg0]]);
            } else {
                class104.method2141(var29, var30, var31, var26, var27, var28, field1896[0], field1896[1], field1896[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1776 || var27 > Statics.field1776 || var28 > Statics.field1776 || field1912[3] < 0 || field1912[3] > Statics.field1776) {
            class104.field1778 = true;
        }
        if (this.field1881 != null && this.field1881[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1880 == null || this.field1880[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1880[arg0] & 0xFF;
                var37 = this.field1893[var36];
                var38 = this.field1885[var36];
                var39 = this.field1886[var36];
            }
            short var40 = this.field1881[arg0];
            if (this.field1877[arg0] == -1) {
                class104.method2185(var29, var30, var31, var26, var27, var28, this.field1914[arg0], this.field1914[arg0], this.field1914[arg0], field1901[var37], field1901[var38], field1901[var39], field1902[var37], field1902[var38], field1902[var39], field1903[var37], field1903[var38], field1903[var39], var40);
                class104.method2185(var29, var31, field1913[3], var26, var28, field1912[3], this.field1914[arg0], this.field1914[arg0], this.field1914[arg0], field1901[var37], field1901[var38], field1901[var39], field1902[var37], field1902[var38], field1902[var39], field1903[var37], field1903[var38], field1903[var39], var40);
            } else {
                class104.method2185(var29, var30, var31, var26, var27, var28, field1896[0], field1896[1], field1896[2], field1901[var37], field1901[var38], field1901[var39], field1902[var37], field1902[var38], field1902[var39], field1903[var37], field1903[var38], field1903[var39], var40);
                class104.method2185(var29, var31, field1913[3], var26, var28, field1912[3], field1896[0], field1896[2], field1896[3], field1901[var37], field1901[var38], field1901[var39], field1902[var37], field1902[var38], field1902[var39], field1903[var37], field1903[var38], field1903[var39], var40);
            }
        } else if (this.field1877[arg0] == -1) {
            int var41 = field1925[this.field1914[arg0]];
            class104.method2143(var29, var30, var31, var26, var27, var28, var41);
            class104.method2143(var29, var31, field1913[3], var26, var28, field1912[3], var41);
        } else {
            class104.method2141(var29, var30, var31, var26, var27, var28, field1896[0], field1896[1], field1896[2]);
            class104.method2141(var29, var31, field1913[3], var26, var28, field1912[3], field1896[0], field1896[2], field1896[3]);
        }
    }

    @ObfuscatedName("db.x(IIIIIIII)Z")
    public final boolean method2300(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
