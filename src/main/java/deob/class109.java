package deob;

@ObfuscatedName("dj")
public class class109 extends class89 {

    @ObfuscatedName("dj.x")
    public static class109 field1872 = new class109();

    @ObfuscatedName("dj.r")
    public static byte[] field1909 = new byte[1];

    @ObfuscatedName("dj.j")
    public static class109 field1858 = new class109();

    @ObfuscatedName("dj.z")
    public static byte[] field1859 = new byte[1];

    @ObfuscatedName("dj.i")
    public int field1860 = 0;

    @ObfuscatedName("dj.b")
    public int[] field1861;

    @ObfuscatedName("dj.l")
    public int[] field1862;

    @ObfuscatedName("dj.m")
    public int[] field1863;

    @ObfuscatedName("dj.p")
    public int field1864 = 0;

    @ObfuscatedName("dj.f")
    public int[] field1865;

    @ObfuscatedName("dj.d")
    public int[] field1866;

    @ObfuscatedName("dj.v")
    public int[] field1885;

    @ObfuscatedName("dj.q")
    public int[] field1881;

    @ObfuscatedName("dj.t")
    public int[] field1856;

    @ObfuscatedName("dj.g")
    public int[] field1870;

    @ObfuscatedName("dj.s")
    public byte[] field1871;

    @ObfuscatedName("dj.h")
    public byte[] field1883;

    @ObfuscatedName("dj.u")
    public byte[] field1873;

    @ObfuscatedName("dj.a")
    public short[] field1917;

    @ObfuscatedName("dj.e")
    public byte field1875 = 0;

    @ObfuscatedName("dj.c")
    public int field1878 = 0;

    @ObfuscatedName("dj.n")
    public int[] field1877;

    @ObfuscatedName("dj.y")
    public int[] field1903;

    @ObfuscatedName("dj.k")
    public int[] field1898;

    @ObfuscatedName("dj.w")
    public int[][] field1880;

    @ObfuscatedName("dj.o")
    public int[][] field1912;

    @ObfuscatedName("dj.ah")
    public boolean field1867 = false;

    @ObfuscatedName("dj.an")
    public int field1882;

    @ObfuscatedName("dj.ag")
    public int field1884;

    @ObfuscatedName("dj.as")
    public int field1913;

    @ObfuscatedName("dj.aq")
    public int field1886;

    @ObfuscatedName("dj.ax")
    public int field1887;

    @ObfuscatedName("dj.ap")
    public static boolean[] field1893 = new boolean[4700];

    @ObfuscatedName("dj.ao")
    public static boolean[] field1890 = new boolean[4700];

    @ObfuscatedName("dj.af")
    public static int[] field1891 = new int[4700];

    @ObfuscatedName("dj.au")
    public static int[] field1908 = new int[4700];

    @ObfuscatedName("dj.ab")
    public static int[] field1906 = new int[4700];

    @ObfuscatedName("dj.at")
    public static int[] field1894 = new int[4700];

    @ObfuscatedName("dj.ay")
    public static int[] field1895 = new int[4700];

    @ObfuscatedName("dj.ad")
    public static int[] field1874 = new int[4700];

    @ObfuscatedName("dj.ac")
    public static int[] field1868 = new int[1600];

    @ObfuscatedName("dj.aw")
    public static int[][] field1857 = new int[1600][512];

    @ObfuscatedName("dj.ak")
    public static int[] field1900 = new int[12];

    @ObfuscatedName("dj.ar")
    public static int[][] field1901 = new int[12][2000];

    @ObfuscatedName("dj.aa")
    public static int[] field1902 = new int[2000];

    @ObfuscatedName("dj.av")
    public static int[] field1910 = new int[2000];

    @ObfuscatedName("dj.aj")
    public static int[] field1904 = new int[12];

    @ObfuscatedName("dj.al")
    public static int[] field1889 = new int[10];

    @ObfuscatedName("dj.ai")
    public static int[] field1876 = new int[10];

    @ObfuscatedName("dj.ae")
    public static int[] field1907 = new int[10];

    @ObfuscatedName("dj.bw")
    public static boolean field1911 = false;

    @ObfuscatedName("dj.bg")
    public static int field1899 = 0;

    @ObfuscatedName("dj.bu")
    public static int field1905 = 0;

    @ObfuscatedName("dj.bq")
    public static int field1914 = 0;

    @ObfuscatedName("dj.bb")
    public static int[] field1915 = new int[1000];

    @ObfuscatedName("dj.bz")
    public static int[] field1916 = class95.field1640;

    @ObfuscatedName("dj.bk")
    public static int[] field1896 = class95.field1641;

    @ObfuscatedName("dj.bl")
    public static int[] field1918 = class95.field1636;

    @ObfuscatedName("dj.be")
    public static int[] field1919 = class95.field1639;

    public class109() {
    }

    public class109(class109[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1860 = 0;
        this.field1864 = 0;
        this.field1878 = 0;
        this.field1875 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class109 var8 = arg0[var7];
            if (var8 != null) {
                this.field1860 += var8.field1860;
                this.field1864 += var8.field1864;
                this.field1878 += var8.field1878;
                if (var8.field1871 == null) {
                    if (this.field1875 == -1) {
                        this.field1875 = var8.field1875;
                    }
                    if (this.field1875 != var8.field1875) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1883 != null;
                var5 |= var8.field1917 != null;
                var6 |= var8.field1873 != null;
            }
        }
        this.field1861 = new int[this.field1860];
        this.field1862 = new int[this.field1860];
        this.field1863 = new int[this.field1860];
        this.field1865 = new int[this.field1864];
        this.field1866 = new int[this.field1864];
        this.field1885 = new int[this.field1864];
        this.field1881 = new int[this.field1864];
        this.field1856 = new int[this.field1864];
        this.field1870 = new int[this.field1864];
        if (var3) {
            this.field1871 = new byte[this.field1864];
        }
        if (var4) {
            this.field1883 = new byte[this.field1864];
        }
        if (var5) {
            this.field1917 = new short[this.field1864];
        }
        if (var6) {
            this.field1873 = new byte[this.field1864];
        }
        if (this.field1878 > 0) {
            this.field1877 = new int[this.field1878];
            this.field1903 = new int[this.field1878];
            this.field1898 = new int[this.field1878];
        }
        this.field1860 = 0;
        this.field1864 = 0;
        this.field1878 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class109 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1864; var11++) {
                    this.field1865[this.field1864] = var10.field1865[var11] + this.field1860;
                    this.field1866[this.field1864] = var10.field1866[var11] + this.field1860;
                    this.field1885[this.field1864] = var10.field1885[var11] + this.field1860;
                    this.field1881[this.field1864] = var10.field1881[var11];
                    this.field1856[this.field1864] = var10.field1856[var11];
                    this.field1870[this.field1864] = var10.field1870[var11];
                    if (var3) {
                        if (var10.field1871 == null) {
                            this.field1871[this.field1864] = var10.field1875;
                        } else {
                            this.field1871[this.field1864] = var10.field1871[var11];
                        }
                    }
                    if (var4 && var10.field1883 != null) {
                        this.field1883[this.field1864] = var10.field1883[var11];
                    }
                    if (var5) {
                        if (var10.field1917 == null) {
                            this.field1917[this.field1864] = -1;
                        } else {
                            this.field1917[this.field1864] = var10.field1917[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1873 == null || var10.field1873[var11] == -1) {
                            this.field1873[this.field1864] = -1;
                        } else {
                            this.field1873[this.field1864] = (byte) (var10.field1873[var11] + this.field1878);
                        }
                    }
                    this.field1864++;
                }
                for (int var12 = 0; var12 < var10.field1878; var12++) {
                    this.field1877[this.field1878] = var10.field1877[var12] + this.field1860;
                    this.field1903[this.field1878] = var10.field1903[var12] + this.field1860;
                    this.field1898[this.field1878] = var10.field1898[var12] + this.field1860;
                    this.field1878++;
                }
                for (int var13 = 0; var13 < var10.field1860; var13++) {
                    this.field1861[this.field1860] = var10.field1861[var13];
                    this.field1862[this.field1860] = var10.field1862[var13];
                    this.field1863[this.field1860] = var10.field1863[var13];
                    this.field1860++;
                }
            }
        }
    }

    @ObfuscatedName("dj.x([[IIIIZI)Ldj;")
    public class109 method2219(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2250();
        int var7 = arg1 - this.field1913;
        int var8 = this.field1913 + arg1;
        int var9 = arg3 - this.field1913;
        int var10 = this.field1913 + arg3;
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
        class109 var15;
        if (arg4) {
            var15 = new class109();
            var15.field1860 = this.field1860;
            var15.field1864 = this.field1864;
            var15.field1878 = this.field1878;
            var15.field1861 = this.field1861;
            var15.field1863 = this.field1863;
            var15.field1865 = this.field1865;
            var15.field1866 = this.field1866;
            var15.field1885 = this.field1885;
            var15.field1881 = this.field1881;
            var15.field1856 = this.field1856;
            var15.field1870 = this.field1870;
            var15.field1871 = this.field1871;
            var15.field1883 = this.field1883;
            var15.field1873 = this.field1873;
            var15.field1917 = this.field1917;
            var15.field1875 = this.field1875;
            var15.field1877 = this.field1877;
            var15.field1903 = this.field1903;
            var15.field1898 = this.field1898;
            var15.field1880 = this.field1880;
            var15.field1912 = this.field1912;
            var15.field1867 = this.field1867;
            var15.field1862 = new int[var15.field1860];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1860; var16++) {
                int var17 = this.field1861[var16] + arg1;
                int var18 = this.field1863[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1862[var16] = this.field1862[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1860; var26++) {
                int var27 = (-this.field1862[var26] << 16) / this.field1504;
                if (var27 < arg5) {
                    int var28 = this.field1861[var26] + arg1;
                    int var29 = this.field1863[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1862[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1862[var26];
                }
            }
        }
        var15.field1882 = 0;
        return var15;
    }

    @ObfuscatedName("dj.r(Z)Ldj;")
    public class109 method2220(boolean arg0) {
        if (!arg0 && field1909.length < this.field1864) {
            field1909 = new byte[this.field1864 + 100];
        }
        return this.method2222(arg0, field1872, field1909);
    }

    @ObfuscatedName("dj.z(Z)Ldj;")
    public class109 method2218(boolean arg0) {
        if (!arg0 && field1859.length < this.field1864) {
            field1859 = new byte[this.field1864 + 100];
        }
        return this.method2222(arg0, field1858, field1859);
    }

    @ObfuscatedName("dj.i(ZLdj;[B)Ldj;")
    public class109 method2222(boolean arg0, class109 arg1, byte[] arg2) {
        arg1.field1860 = this.field1860;
        arg1.field1864 = this.field1864;
        arg1.field1878 = this.field1878;
        if (arg1.field1861 == null || arg1.field1861.length < this.field1860) {
            arg1.field1861 = new int[this.field1860 + 100];
            arg1.field1862 = new int[this.field1860 + 100];
            arg1.field1863 = new int[this.field1860 + 100];
        }
        for (int var4 = 0; var4 < this.field1860; var4++) {
            arg1.field1861[var4] = this.field1861[var4];
            arg1.field1862[var4] = this.field1862[var4];
            arg1.field1863[var4] = this.field1863[var4];
        }
        if (arg0) {
            arg1.field1883 = this.field1883;
        } else {
            arg1.field1883 = arg2;
            if (this.field1883 == null) {
                for (int var5 = 0; var5 < this.field1864; var5++) {
                    arg1.field1883[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1864; var6++) {
                    arg1.field1883[var6] = this.field1883[var6];
                }
            }
        }
        arg1.field1865 = this.field1865;
        arg1.field1866 = this.field1866;
        arg1.field1885 = this.field1885;
        arg1.field1881 = this.field1881;
        arg1.field1856 = this.field1856;
        arg1.field1870 = this.field1870;
        arg1.field1871 = this.field1871;
        arg1.field1873 = this.field1873;
        arg1.field1917 = this.field1917;
        arg1.field1875 = this.field1875;
        arg1.field1877 = this.field1877;
        arg1.field1903 = this.field1903;
        arg1.field1898 = this.field1898;
        arg1.field1880 = this.field1880;
        arg1.field1912 = this.field1912;
        arg1.field1867 = this.field1867;
        arg1.field1882 = 0;
        return arg1;
    }

    @ObfuscatedName("dj.b()V")
    public void method2250() {
        if (this.field1882 == 1) {
            return;
        }
        this.field1882 = 1;
        this.field1504 = 0;
        this.field1884 = 0;
        this.field1913 = 0;
        for (int var1 = 0; var1 < this.field1860; var1++) {
            int var2 = this.field1861[var1];
            int var3 = this.field1862[var1];
            int var4 = this.field1863[var1];
            if (-var3 > this.field1504) {
                this.field1504 = -var3;
            }
            if (var3 > this.field1884) {
                this.field1884 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1913) {
                this.field1913 = var5;
            }
        }
        this.field1913 = (int) (Math.sqrt((double) this.field1913) + 0.99D);
        this.field1887 = (int) (Math.sqrt((double) (this.field1504 * this.field1504 + this.field1913 * this.field1913)) + 0.99D);
        this.field1886 = this.field1887 + (int) (Math.sqrt((double) (this.field1913 * this.field1913 + this.field1884 * this.field1884)) + 0.99D);
    }

    @ObfuscatedName("dj.l()V")
    public void method2224() {
        if (this.field1882 == 2) {
            return;
        }
        this.field1882 = 2;
        this.field1913 = 0;
        for (int var1 = 0; var1 < this.field1860; var1++) {
            int var2 = this.field1861[var1];
            int var3 = this.field1862[var1];
            int var4 = this.field1863[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1913) {
                this.field1913 = var5;
            }
        }
        this.field1913 = (int) (Math.sqrt((double) this.field1913) + 0.99D);
        this.field1887 = this.field1913;
        this.field1886 = this.field1913 + this.field1913;
    }

    @ObfuscatedName("dj.m()I")
    public int method2225() {
        this.method2250();
        return this.field1913;
    }

    @ObfuscatedName("dj.p(Ldu;I)V")
    public void method2235(class107 arg0, int arg1) {
        if (this.field1880 == null || arg1 == -1) {
            return;
        }
        class92 var3 = arg0.field1833[arg1];
        class106 var4 = var3.field1587;
        Statics.field1879 = 0;
        Statics.field1892 = 0;
        Statics.field1869 = 0;
        for (int var5 = 0; var5 < var3.field1597; var5++) {
            int var6 = var3.field1593[var5];
            this.method2228(var4.field1822[var6], var4.field1820[var6], var3.field1594[var5], var3.field1589[var5], var3.field1596[var5]);
        }
        this.field1882 = 0;
    }

    @ObfuscatedName("dj.f(Ldu;ILdu;I[I)V")
    public void method2227(class107 arg0, int arg1, class107 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2235(arg0, arg1);
            return;
        }
        class92 var6 = arg0.field1833[arg1];
        class92 var7 = arg2.field1833[arg3];
        class106 var8 = var6.field1587;
        Statics.field1879 = 0;
        Statics.field1892 = 0;
        Statics.field1869 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1597; var11++) {
            int var12 = var6.field1593[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1822[var12] == 0) {
                this.method2228(var8.field1822[var12], var8.field1820[var12], var6.field1594[var11], var6.field1589[var11], var6.field1596[var11]);
            }
        }
        Statics.field1879 = 0;
        Statics.field1892 = 0;
        Statics.field1869 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1597; var15++) {
            int var16 = var7.field1593[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1822[var16] == 0) {
                this.method2228(var8.field1822[var16], var8.field1820[var16], var7.field1594[var15], var7.field1589[var15], var7.field1596[var15]);
            }
        }
        this.field1882 = 0;
    }

    @ObfuscatedName("dj.d(I[IIII)V")
    public void method2228(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1879 = 0;
            Statics.field1892 = 0;
            Statics.field1869 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1880.length) {
                    int[] var10 = this.field1880[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1879 += this.field1861[var12];
                        Statics.field1892 += this.field1862[var12];
                        Statics.field1869 += this.field1863[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1879 = Statics.field1879 / var7 + arg2;
                Statics.field1892 = Statics.field1892 / var7 + arg3;
                Statics.field1869 = Statics.field1869 / var7 + arg4;
            } else {
                Statics.field1879 = arg2;
                Statics.field1892 = arg3;
                Statics.field1869 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1880.length) {
                    int[] var15 = this.field1880[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1861[var17] += arg2;
                        this.field1862[var17] += arg3;
                        this.field1863[var17] += arg4;
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
                        this.field1861[var22] -= Statics.field1879;
                        this.field1862[var22] -= Statics.field1892;
                        this.field1863[var22] -= Statics.field1869;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1916[var25];
                            int var27 = field1896[var25];
                            int var28 = this.field1862[var22] * var26 + this.field1861[var22] * var27 >> 16;
                            this.field1862[var22] = this.field1862[var22] * var27 - this.field1861[var22] * var26 >> 16;
                            this.field1861[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1916[var23];
                            int var30 = field1896[var23];
                            int var31 = this.field1862[var22] * var30 - this.field1863[var22] * var29 >> 16;
                            this.field1863[var22] = this.field1863[var22] * var30 + this.field1862[var22] * var29 >> 16;
                            this.field1862[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1916[var24];
                            int var33 = field1896[var24];
                            int var34 = this.field1863[var22] * var32 + this.field1861[var22] * var33 >> 16;
                            this.field1863[var22] = this.field1863[var22] * var33 - this.field1861[var22] * var32 >> 16;
                            this.field1861[var22] = var34;
                        }
                        this.field1861[var22] += Statics.field1879;
                        this.field1862[var22] += Statics.field1892;
                        this.field1863[var22] += Statics.field1869;
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
                        this.field1861[var39] -= Statics.field1879;
                        this.field1862[var39] -= Statics.field1892;
                        this.field1863[var39] -= Statics.field1869;
                        this.field1861[var39] = this.field1861[var39] * arg2 / 128;
                        this.field1862[var39] = this.field1862[var39] * arg3 / 128;
                        this.field1863[var39] = this.field1863[var39] * arg4 / 128;
                        this.field1861[var39] += Statics.field1879;
                        this.field1862[var39] += Statics.field1892;
                        this.field1863[var39] += Statics.field1869;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1912 != null && this.field1883 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1912.length) {
                    int[] var42 = this.field1912[var41];
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

    @ObfuscatedName("dj.g()V")
    public void method2288() {
        for (int var1 = 0; var1 < this.field1860; var1++) {
            int var2 = this.field1861[var1];
            this.field1861[var1] = this.field1863[var1];
            this.field1863[var1] = -var2;
        }
        this.field1882 = 0;
    }

    @ObfuscatedName("dj.s()V")
    public void method2252() {
        for (int var1 = 0; var1 < this.field1860; var1++) {
            this.field1861[var1] = -this.field1861[var1];
            this.field1863[var1] = -this.field1863[var1];
        }
        this.field1882 = 0;
    }

    @ObfuscatedName("dj.h()V")
    public void method2231() {
        for (int var1 = 0; var1 < this.field1860; var1++) {
            int var2 = this.field1863[var1];
            this.field1863[var1] = this.field1861[var1];
            this.field1861[var1] = -var2;
        }
        this.field1882 = 0;
    }

    @ObfuscatedName("dj.u(I)V")
    public void method2232(int arg0) {
        int var2 = field1916[arg0];
        int var3 = field1896[arg0];
        for (int var4 = 0; var4 < this.field1860; var4++) {
            int var5 = this.field1862[var4] * var3 - this.field1863[var4] * var2 >> 16;
            this.field1863[var4] = this.field1863[var4] * var3 + this.field1862[var4] * var2 >> 16;
            this.field1862[var4] = var5;
        }
        this.field1882 = 0;
    }

    @ObfuscatedName("dj.a(III)V")
    public void method2287(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1860; var4++) {
            this.field1861[var4] += arg0;
            this.field1862[var4] += arg1;
            this.field1863[var4] += arg2;
        }
        this.field1882 = 0;
    }

    @ObfuscatedName("dj.e(III)V")
    public void method2234(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1860; var4++) {
            this.field1861[var4] = this.field1861[var4] * arg0 / 128;
            this.field1862[var4] = this.field1862[var4] * arg1 / 128;
            this.field1863[var4] = this.field1863[var4] * arg2 / 128;
        }
        this.field1882 = 0;
    }

    @ObfuscatedName("dj.c(IIIIIII)V")
    public final void method2226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1868[0] = -1;
        if (this.field1882 != 2 && this.field1882 != 1) {
            this.method2224();
        }
        int var8 = Statics.field1618;
        int var9 = Statics.field1628;
        int var10 = field1916[arg0];
        int var11 = field1896[arg0];
        int var12 = field1916[arg1];
        int var13 = field1896[arg1];
        int var14 = field1916[arg2];
        int var15 = field1896[arg2];
        int var16 = field1916[arg3];
        int var17 = field1896[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1860; var19++) {
            int var20 = this.field1861[var19];
            int var21 = this.field1862[var19];
            int var22 = this.field1863[var19];
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
            field1906[var19] = var30 - var18;
            field1891[var19] = class95.field1627 * var26 / var30 + var8;
            field1908[var19] = class95.field1627 * var29 / var30 + var9;
            if (this.field1878 > 0) {
                field1894[var19] = var26;
                field1895[var19] = var29;
                field1874[var19] = var30;
            }
        }
        try {
            this.method2238(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dj.n(IIIIIIII)V")
    public final void method2236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1868[0] = -1;
        if (this.field1882 != 2 && this.field1882 != 1) {
            this.method2224();
        }
        int var9 = Statics.field1618;
        int var10 = Statics.field1628;
        int var11 = field1916[arg0];
        int var12 = field1896[arg0];
        int var13 = field1916[arg1];
        int var14 = field1896[arg1];
        int var15 = field1916[arg2];
        int var16 = field1896[arg2];
        int var17 = field1916[arg3];
        int var18 = field1896[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1860; var20++) {
            int var21 = this.field1861[var20];
            int var22 = this.field1862[var20];
            int var23 = this.field1863[var20];
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
            field1906[var20] = var31 - var19;
            field1891[var20] = class95.field1627 * var27 / arg7 + var9;
            field1908[var20] = class95.field1627 * var30 / arg7 + var10;
            if (this.field1878 > 0) {
                field1894[var20] = var27;
                field1895[var20] = var30;
                field1874[var20] = var31;
            }
        }
        try {
            this.method2238(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dj.ay(IIIIIIIII)V")
    public void method1821(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1868[0] = -1;
        if (this.field1882 != 1) {
            this.method2250();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1913 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1913) * class95.field1627;
        if (var15 / var13 >= Statics.field1632) {
            return;
        }
        int var16 = (this.field1913 + var14) * class95.field1627;
        if (var16 / var13 <= Statics.field1633) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1913 * arg1 >> 16;
        int var19 = (var17 + var18) * class95.field1627;
        if (var19 / var13 <= Statics.field1617) {
            return;
        }
        int var20 = (this.field1504 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class95.field1627;
        if (var21 / var13 >= Statics.field1634) {
            return;
        }
        int var22 = (this.field1504 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1878 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1911) {
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
            int var32 = field1899 - Statics.field1618;
            int var33 = field1905 - Statics.field1628;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1867) {
                    field1915[field1914++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1618;
        int var35 = Statics.field1628;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1916[arg0];
            var37 = field1896[arg0];
        }
        for (int var38 = 0; var38 < this.field1860; var38++) {
            int var39 = this.field1861[var38];
            int var40 = this.field1862[var38];
            int var41 = this.field1863[var38];
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
            field1906[var38] = var50 - var11;
            if (var50 >= 50) {
                field1891[var38] = class95.field1627 * var46 / var50 + var34;
                field1908[var38] = class95.field1627 * var49 / var50 + var35;
            } else {
                field1891[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1894[var38] = var46;
                field1895[var38] = var49;
                field1874[var38] = var50;
            }
        }
        try {
            this.method2238(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dj.y(ZZI)V")
    public final void method2238(boolean arg0, boolean arg1, int arg2) {
        if (this.field1886 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1886; var4++) {
            field1868[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1864; var5++) {
            if (this.field1870[var5] != -2) {
                int var6 = this.field1865[var5];
                int var7 = this.field1866[var5];
                int var8 = this.field1885[var5];
                int var9 = field1891[var6];
                int var10 = field1891[var7];
                int var11 = field1891[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1894[var6];
                    int var13 = field1894[var7];
                    int var14 = field1894[var8];
                    int var15 = field1895[var6];
                    int var16 = field1895[var7];
                    int var17 = field1895[var8];
                    int var18 = field1874[var6];
                    int var19 = field1874[var7];
                    int var20 = field1874[var8];
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
                        field1890[var5] = true;
                        int var30 = (field1906[var6] + field1906[var7] + field1906[var8]) / 3 + this.field1887;
                        field1857[var30][field1868[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2241(field1899, field1905, field1908[var6], field1908[var7], field1908[var8], var9, var10, var11)) {
                        field1915[field1914++] = arg2;
                        arg1 = false;
                    }
                    if ((field1908[var8] - field1908[var7]) * (var9 - var10) - (field1908[var6] - field1908[var7]) * (var11 - var10) > 0) {
                        field1890[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1629 && var10 <= Statics.field1629 && var11 <= Statics.field1629) {
                            field1893[var5] = false;
                        } else {
                            field1893[var5] = true;
                        }
                        int var31 = (field1906[var6] + field1906[var7] + field1906[var8]) / 3 + this.field1887;
                        field1857[var31][field1868[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1871 == null) {
            for (int var32 = this.field1886 - 1; var32 >= 0; var32--) {
                int var33 = field1868[var32];
                if (var33 > 0) {
                    int[] var34 = field1857[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2239(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1900[var36] = 0;
            field1904[var36] = 0;
        }
        for (int var37 = this.field1886 - 1; var37 >= 0; var37--) {
            int var38 = field1868[var37];
            if (var38 > 0) {
                int[] var39 = field1857[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1871[var41];
                    int var43 = field1900[var42]++;
                    field1901[var42][var43] = var41;
                    if (var42 < 10) {
                        field1904[var42] += var37;
                    } else if (var42 == 10) {
                        field1902[var43] = var37;
                    } else {
                        field1910[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1900[1] > 0 || field1900[2] > 0) {
            var44 = (field1904[1] + field1904[2]) / (field1900[1] + field1900[2]);
        }
        int var45 = 0;
        if (field1900[3] > 0 || field1900[4] > 0) {
            var45 = (field1904[3] + field1904[4]) / (field1900[3] + field1900[4]);
        }
        int var46 = 0;
        if (field1900[6] > 0 || field1900[8] > 0) {
            var46 = (field1904[6] + field1904[8]) / (field1900[6] + field1900[8]);
        }
        int var47 = 0;
        int var48 = field1900[10];
        int[] var49 = field1901[10];
        int[] var50 = field1902;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1900[11];
            var49 = field1901[11];
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
                this.method2239(var49[var47++]);
                if (var47 == var48 && field1901[11] != var49) {
                    var47 = 0;
                    var48 = field1900[11];
                    var49 = field1901[11];
                    var50 = field1910;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2239(var49[var47++]);
                if (var47 == var48 && field1901[11] != var49) {
                    var47 = 0;
                    var48 = field1900[11];
                    var49 = field1901[11];
                    var50 = field1910;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2239(var49[var47++]);
                if (var47 == var48 && field1901[11] != var49) {
                    var47 = 0;
                    var48 = field1900[11];
                    var49 = field1901[11];
                    var50 = field1910;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1900[var52];
            int[] var54 = field1901[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2239(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2239(var49[var47++]);
            if (var47 == var48 && field1901[11] != var49) {
                var47 = 0;
                var49 = field1901[11];
                var48 = field1900[11];
                var50 = field1910;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dj.k(I)V")
    public final void method2239(int arg0) {
        if (field1890[arg0]) {
            this.method2240(arg0);
            return;
        }
        int var2 = this.field1865[arg0];
        int var3 = this.field1866[arg0];
        int var4 = this.field1885[arg0];
        class95.field1621 = field1893[arg0];
        if (this.field1883 == null) {
            class95.field1630 = 0;
        } else {
            class95.field1630 = this.field1883[arg0] & 0xFF;
        }
        if (this.field1917 != null && this.field1917[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1873 == null || this.field1873[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1873[arg0] & 0xFF;
                var6 = this.field1877[var5];
                var7 = this.field1903[var5];
                var8 = this.field1898[var5];
            }
            if (this.field1870[arg0] == -1) {
                class95.method2021(field1908[var2], field1908[var3], field1908[var4], field1891[var2], field1891[var3], field1891[var4], this.field1881[arg0], this.field1881[arg0], this.field1881[arg0], field1894[var6], field1894[var7], field1894[var8], field1895[var6], field1895[var7], field1895[var8], field1874[var6], field1874[var7], field1874[var8], this.field1917[arg0]);
            } else {
                class95.method2021(field1908[var2], field1908[var3], field1908[var4], field1891[var2], field1891[var3], field1891[var4], this.field1881[arg0], this.field1856[arg0], this.field1870[arg0], field1894[var6], field1894[var7], field1894[var8], field1895[var6], field1895[var7], field1895[var8], field1874[var6], field1874[var7], field1874[var8], this.field1917[arg0]);
            }
        } else if (this.field1870[arg0] == -1) {
            class95.method2019(field1908[var2], field1908[var3], field1908[var4], field1891[var2], field1891[var3], field1891[var4], field1918[this.field1881[arg0]]);
        } else {
            class95.method2017(field1908[var2], field1908[var3], field1908[var4], field1891[var2], field1891[var3], field1891[var4], this.field1881[arg0], this.field1856[arg0], this.field1870[arg0]);
        }
    }

    @ObfuscatedName("dj.w(I)V")
    public final void method2240(int arg0) {
        int var2 = Statics.field1618;
        int var3 = Statics.field1628;
        int var4 = 0;
        int var5 = this.field1865[arg0];
        int var6 = this.field1866[arg0];
        int var7 = this.field1885[arg0];
        int var8 = field1874[var5];
        int var9 = field1874[var6];
        int var10 = field1874[var7];
        if (this.field1883 == null) {
            class95.field1630 = 0;
        } else {
            class95.field1630 = this.field1883[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1889[var4] = field1891[var5];
            field1876[var4] = field1908[var5];
            field1907[var4++] = this.field1881[arg0];
        } else {
            int var11 = field1894[var5];
            int var12 = field1895[var5];
            int var13 = this.field1881[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1919[var10 - var8];
                field1889[var4] = (((field1894[var7] - var11) * var14 >> 16) + var11) * class95.field1627 / 50 + var2;
                field1876[var4] = (((field1895[var7] - var12) * var14 >> 16) + var12) * class95.field1627 / 50 + var3;
                field1907[var4++] = ((this.field1870[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1919[var9 - var8];
                field1889[var4] = (((field1894[var6] - var11) * var15 >> 16) + var11) * class95.field1627 / 50 + var2;
                field1876[var4] = (((field1895[var6] - var12) * var15 >> 16) + var12) * class95.field1627 / 50 + var3;
                field1907[var4++] = ((this.field1856[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1889[var4] = field1891[var6];
            field1876[var4] = field1908[var6];
            field1907[var4++] = this.field1856[arg0];
        } else {
            int var16 = field1894[var6];
            int var17 = field1895[var6];
            int var18 = this.field1856[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1919[var8 - var9];
                field1889[var4] = (((field1894[var5] - var16) * var19 >> 16) + var16) * class95.field1627 / 50 + var2;
                field1876[var4] = (((field1895[var5] - var17) * var19 >> 16) + var17) * class95.field1627 / 50 + var3;
                field1907[var4++] = ((this.field1881[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1919[var10 - var9];
                field1889[var4] = (((field1894[var7] - var16) * var20 >> 16) + var16) * class95.field1627 / 50 + var2;
                field1876[var4] = (((field1895[var7] - var17) * var20 >> 16) + var17) * class95.field1627 / 50 + var3;
                field1907[var4++] = ((this.field1870[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1889[var4] = field1891[var7];
            field1876[var4] = field1908[var7];
            field1907[var4++] = this.field1870[arg0];
        } else {
            int var21 = field1894[var7];
            int var22 = field1895[var7];
            int var23 = this.field1870[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1919[var9 - var10];
                field1889[var4] = (((field1894[var6] - var21) * var24 >> 16) + var21) * class95.field1627 / 50 + var2;
                field1876[var4] = (((field1895[var6] - var22) * var24 >> 16) + var22) * class95.field1627 / 50 + var3;
                field1907[var4++] = ((this.field1856[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1919[var8 - var10];
                field1889[var4] = (((field1894[var5] - var21) * var25 >> 16) + var21) * class95.field1627 / 50 + var2;
                field1876[var4] = (((field1895[var5] - var22) * var25 >> 16) + var22) * class95.field1627 / 50 + var3;
                field1907[var4++] = ((this.field1881[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1889[0];
        int var27 = field1889[1];
        int var28 = field1889[2];
        int var29 = field1876[0];
        int var30 = field1876[1];
        int var31 = field1876[2];
        class95.field1621 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1629 || var27 > Statics.field1629 || var28 > Statics.field1629) {
                class95.field1621 = true;
            }
            if (this.field1917 != null && this.field1917[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1873 == null || this.field1873[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1873[arg0] & 0xFF;
                    var33 = this.field1877[var32];
                    var34 = this.field1903[var32];
                    var35 = this.field1898[var32];
                }
                if (this.field1870[arg0] == -1) {
                    class95.method2021(var29, var30, var31, var26, var27, var28, this.field1881[arg0], this.field1881[arg0], this.field1881[arg0], field1894[var33], field1894[var34], field1894[var35], field1895[var33], field1895[var34], field1895[var35], field1874[var33], field1874[var34], field1874[var35], this.field1917[arg0]);
                } else {
                    class95.method2021(var29, var30, var31, var26, var27, var28, field1907[0], field1907[1], field1907[2], field1894[var33], field1894[var34], field1894[var35], field1895[var33], field1895[var34], field1895[var35], field1874[var33], field1874[var34], field1874[var35], this.field1917[arg0]);
                }
            } else if (this.field1870[arg0] == -1) {
                class95.method2019(var29, var30, var31, var26, var27, var28, field1918[this.field1881[arg0]]);
            } else {
                class95.method2017(var29, var30, var31, var26, var27, var28, field1907[0], field1907[1], field1907[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1629 || var27 > Statics.field1629 || var28 > Statics.field1629 || field1889[3] < 0 || field1889[3] > Statics.field1629) {
            class95.field1621 = true;
        }
        if (this.field1917 != null && this.field1917[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1873 == null || this.field1873[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1873[arg0] & 0xFF;
                var37 = this.field1877[var36];
                var38 = this.field1903[var36];
                var39 = this.field1898[var36];
            }
            short var40 = this.field1917[arg0];
            if (this.field1870[arg0] == -1) {
                class95.method2021(var29, var30, var31, var26, var27, var28, this.field1881[arg0], this.field1881[arg0], this.field1881[arg0], field1894[var37], field1894[var38], field1894[var39], field1895[var37], field1895[var38], field1895[var39], field1874[var37], field1874[var38], field1874[var39], var40);
                class95.method2021(var29, var31, field1876[3], var26, var28, field1889[3], this.field1881[arg0], this.field1881[arg0], this.field1881[arg0], field1894[var37], field1894[var38], field1894[var39], field1895[var37], field1895[var38], field1895[var39], field1874[var37], field1874[var38], field1874[var39], var40);
            } else {
                class95.method2021(var29, var30, var31, var26, var27, var28, field1907[0], field1907[1], field1907[2], field1894[var37], field1894[var38], field1894[var39], field1895[var37], field1895[var38], field1895[var39], field1874[var37], field1874[var38], field1874[var39], var40);
                class95.method2021(var29, var31, field1876[3], var26, var28, field1889[3], field1907[0], field1907[2], field1907[3], field1894[var37], field1894[var38], field1894[var39], field1895[var37], field1895[var38], field1895[var39], field1874[var37], field1874[var38], field1874[var39], var40);
            }
        } else if (this.field1870[arg0] == -1) {
            int var41 = field1918[this.field1881[arg0]];
            class95.method2019(var29, var30, var31, var26, var27, var28, var41);
            class95.method2019(var29, var31, field1876[3], var26, var28, field1889[3], var41);
        } else {
            class95.method2017(var29, var30, var31, var26, var27, var28, field1907[0], field1907[1], field1907[2]);
            class95.method2017(var29, var31, field1876[3], var26, var28, field1889[3], field1907[0], field1907[2], field1907[3]);
        }
    }

    @ObfuscatedName("dj.o(IIIIIIII)Z")
    public final boolean method2241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
