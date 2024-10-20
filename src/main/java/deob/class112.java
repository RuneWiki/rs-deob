package deob;

@ObfuscatedName("dw")
public class class112 extends class94 {

    @ObfuscatedName("dw.y")
    public static class112 field1877 = new class112();

    @ObfuscatedName("dw.m")
    public static byte[] field1850 = new byte[1];

    @ObfuscatedName("dw.d")
    public static class112 field1851 = new class112();

    @ObfuscatedName("dw.k")
    public static byte[] field1860 = new byte[1];

    @ObfuscatedName("dw.n")
    public int field1853 = 0;

    @ObfuscatedName("dw.s")
    public int[] field1859;

    @ObfuscatedName("dw.x")
    public int[] field1882;

    @ObfuscatedName("dw.b")
    public int[] field1867;

    @ObfuscatedName("dw.j")
    public int field1857 = 0;

    @ObfuscatedName("dw.p")
    public int[] field1858;

    @ObfuscatedName("dw.l")
    public int[] field1913;

    @ObfuscatedName("dw.i")
    public int[] field1875;

    @ObfuscatedName("dw.r")
    public int[] field1861;

    @ObfuscatedName("dw.o")
    public int[] field1862;

    @ObfuscatedName("dw.c")
    public int[] field1863;

    @ObfuscatedName("dw.f")
    public byte[] field1864;

    @ObfuscatedName("dw.a")
    public byte[] field1905;

    @ObfuscatedName("dw.t")
    public byte[] field1866;

    @ObfuscatedName("dw.u")
    public short[] field1849;

    @ObfuscatedName("dw.z")
    public byte field1868 = 0;

    @ObfuscatedName("dw.v")
    public int field1879 = 0;

    @ObfuscatedName("dw.w")
    public int[] field1852;

    @ObfuscatedName("dw.h")
    public int[] field1871;

    @ObfuscatedName("dw.q")
    public int[] field1872;

    @ObfuscatedName("dw.g")
    public int[][] field1873;

    @ObfuscatedName("dw.e")
    public int[][] field1874;

    @ObfuscatedName("dw.as")
    public boolean field1885 = false;

    @ObfuscatedName("dw.an")
    public int field1876;

    @ObfuscatedName("dw.aj")
    public int field1886;

    @ObfuscatedName("dw.ax")
    public int field1878;

    @ObfuscatedName("dw.av")
    public int field1893;

    @ObfuscatedName("dw.ae")
    public int field1880;

    @ObfuscatedName("dw.aq")
    public static boolean[] field1896 = new boolean[4096];

    @ObfuscatedName("dw.at")
    public static boolean[] field1912 = new boolean[4096];

    @ObfuscatedName("dw.ac")
    public static int[] field1884 = new int[4096];

    @ObfuscatedName("dw.al")
    public static int[] field1891 = new int[4096];

    @ObfuscatedName("dw.ab")
    public static int[] field1902 = new int[4096];

    @ObfuscatedName("dw.aa")
    public static int[] field1887 = new int[4096];

    @ObfuscatedName("dw.ao")
    public static int[] field1888 = new int[4096];

    @ObfuscatedName("dw.ah")
    public static int[] field1889 = new int[4096];

    @ObfuscatedName("dw.aw")
    public static int[] field1883 = new int[1600];

    @ObfuscatedName("dw.az")
    public static int[][] field1869 = new int[1600][512];

    @ObfuscatedName("dw.af")
    public static int[] field1865 = new int[12];

    @ObfuscatedName("dw.ap")
    public static int[][] field1894 = new int[12][2000];

    @ObfuscatedName("dw.ak")
    public static int[] field1895 = new int[2000];

    @ObfuscatedName("dw.ad")
    public static int[] field1890 = new int[2000];

    @ObfuscatedName("dw.ag")
    public static int[] field1897 = new int[12];

    @ObfuscatedName("dw.ay")
    public static int[] field1898 = new int[10];

    @ObfuscatedName("dw.ai")
    public static int[] field1899 = new int[10];

    @ObfuscatedName("dw.ar")
    public static int[] field1900 = new int[10];

    @ObfuscatedName("dw.bl")
    public static boolean field1904 = false;

    @ObfuscatedName("dw.bi")
    public static int field1892 = 0;

    @ObfuscatedName("dw.bh")
    public static int field1906 = 0;

    @ObfuscatedName("dw.bq")
    public static int field1907 = 0;

    @ObfuscatedName("dw.bj")
    public static int[] field1908 = new int[1000];

    @ObfuscatedName("dw.bw")
    public static int[] field1909 = class104.field1770;

    @ObfuscatedName("dw.bg")
    public static int[] field1910 = class104.field1771;

    @ObfuscatedName("dw.bx")
    public static int[] field1911 = class104.field1759;

    @ObfuscatedName("dw.bt")
    public static int[] field1854 = class104.field1769;

    public class112() {
    }

    public class112(class112[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1853 = 0;
        this.field1857 = 0;
        this.field1879 = 0;
        this.field1868 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class112 var8 = arg0[var7];
            if (var8 != null) {
                this.field1853 += var8.field1853;
                this.field1857 += var8.field1857;
                this.field1879 += var8.field1879;
                if (var8.field1864 == null) {
                    if (this.field1868 == -1) {
                        this.field1868 = var8.field1868;
                    }
                    if (this.field1868 != var8.field1868) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1905 != null;
                var5 |= var8.field1849 != null;
                var6 |= var8.field1866 != null;
            }
        }
        this.field1859 = new int[this.field1853];
        this.field1882 = new int[this.field1853];
        this.field1867 = new int[this.field1853];
        this.field1858 = new int[this.field1857];
        this.field1913 = new int[this.field1857];
        this.field1875 = new int[this.field1857];
        this.field1861 = new int[this.field1857];
        this.field1862 = new int[this.field1857];
        this.field1863 = new int[this.field1857];
        if (var3) {
            this.field1864 = new byte[this.field1857];
        }
        if (var4) {
            this.field1905 = new byte[this.field1857];
        }
        if (var5) {
            this.field1849 = new short[this.field1857];
        }
        if (var6) {
            this.field1866 = new byte[this.field1857];
        }
        if (this.field1879 > 0) {
            this.field1852 = new int[this.field1879];
            this.field1871 = new int[this.field1879];
            this.field1872 = new int[this.field1879];
        }
        this.field1853 = 0;
        this.field1857 = 0;
        this.field1879 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class112 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1857; var11++) {
                    this.field1858[this.field1857] = var10.field1858[var11] + this.field1853;
                    this.field1913[this.field1857] = var10.field1913[var11] + this.field1853;
                    this.field1875[this.field1857] = var10.field1875[var11] + this.field1853;
                    this.field1861[this.field1857] = var10.field1861[var11];
                    this.field1862[this.field1857] = var10.field1862[var11];
                    this.field1863[this.field1857] = var10.field1863[var11];
                    if (var3) {
                        if (var10.field1864 == null) {
                            this.field1864[this.field1857] = var10.field1868;
                        } else {
                            this.field1864[this.field1857] = var10.field1864[var11];
                        }
                    }
                    if (var4 && var10.field1905 != null) {
                        this.field1905[this.field1857] = var10.field1905[var11];
                    }
                    if (var5) {
                        if (var10.field1849 == null) {
                            this.field1849[this.field1857] = -1;
                        } else {
                            this.field1849[this.field1857] = var10.field1849[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1866 == null || var10.field1866[var11] == -1) {
                            this.field1866[this.field1857] = -1;
                        } else {
                            this.field1866[this.field1857] = (byte) (var10.field1866[var11] + this.field1879);
                        }
                    }
                    this.field1857++;
                }
                for (int var12 = 0; var12 < var10.field1879; var12++) {
                    this.field1852[this.field1879] = var10.field1852[var12] + this.field1853;
                    this.field1871[this.field1879] = var10.field1871[var12] + this.field1853;
                    this.field1872[this.field1879] = var10.field1872[var12] + this.field1853;
                    this.field1879++;
                }
                for (int var13 = 0; var13 < var10.field1853; var13++) {
                    this.field1859[this.field1853] = var10.field1859[var13];
                    this.field1882[this.field1853] = var10.field1882[var13];
                    this.field1867[this.field1853] = var10.field1867[var13];
                    this.field1853++;
                }
            }
        }
    }

    @ObfuscatedName("dw.y([[IIIIZI)Ldw;")
    public class112 method2255(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2277();
        int var7 = arg1 - this.field1878;
        int var8 = this.field1878 + arg1;
        int var9 = arg3 - this.field1878;
        int var10 = this.field1878 + arg3;
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
            var15.field1853 = this.field1853;
            var15.field1857 = this.field1857;
            var15.field1879 = this.field1879;
            var15.field1859 = this.field1859;
            var15.field1867 = this.field1867;
            var15.field1858 = this.field1858;
            var15.field1913 = this.field1913;
            var15.field1875 = this.field1875;
            var15.field1861 = this.field1861;
            var15.field1862 = this.field1862;
            var15.field1863 = this.field1863;
            var15.field1864 = this.field1864;
            var15.field1905 = this.field1905;
            var15.field1866 = this.field1866;
            var15.field1849 = this.field1849;
            var15.field1868 = this.field1868;
            var15.field1852 = this.field1852;
            var15.field1871 = this.field1871;
            var15.field1872 = this.field1872;
            var15.field1873 = this.field1873;
            var15.field1874 = this.field1874;
            var15.field1885 = this.field1885;
            var15.field1882 = new int[var15.field1853];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1853; var16++) {
                int var17 = this.field1859[var16] + arg1;
                int var18 = this.field1867[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1882[var16] = this.field1882[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1853; var26++) {
                int var27 = (-this.field1882[var26] << 16) / this.field1541;
                if (var27 < arg5) {
                    int var28 = this.field1859[var26] + arg1;
                    int var29 = this.field1867[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1882[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1882[var26];
                }
            }
        }
        var15.field1876 = 0;
        return var15;
    }

    @ObfuscatedName("dw.d(Z)Ldw;")
    public class112 method2266(boolean arg0) {
        if (!arg0 && field1850.length < this.field1857) {
            field1850 = new byte[this.field1857 + 100];
        }
        return this.method2247(arg0, field1877, field1850);
    }

    @ObfuscatedName("dw.k(Z)Ldw;")
    public class112 method2246(boolean arg0) {
        if (!arg0 && field1860.length < this.field1857) {
            field1860 = new byte[this.field1857 + 100];
        }
        return this.method2247(arg0, field1851, field1860);
    }

    @ObfuscatedName("dw.n(ZLdw;[B)Ldw;")
    public class112 method2247(boolean arg0, class112 arg1, byte[] arg2) {
        arg1.field1853 = this.field1853;
        arg1.field1857 = this.field1857;
        arg1.field1879 = this.field1879;
        if (arg1.field1859 == null || arg1.field1859.length < this.field1853) {
            arg1.field1859 = new int[this.field1853 + 100];
            arg1.field1882 = new int[this.field1853 + 100];
            arg1.field1867 = new int[this.field1853 + 100];
        }
        for (int var4 = 0; var4 < this.field1853; var4++) {
            arg1.field1859[var4] = this.field1859[var4];
            arg1.field1882[var4] = this.field1882[var4];
            arg1.field1867[var4] = this.field1867[var4];
        }
        if (arg0) {
            arg1.field1905 = this.field1905;
        } else {
            arg1.field1905 = arg2;
            if (this.field1905 == null) {
                for (int var5 = 0; var5 < this.field1857; var5++) {
                    arg1.field1905[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1857; var6++) {
                    arg1.field1905[var6] = this.field1905[var6];
                }
            }
        }
        arg1.field1858 = this.field1858;
        arg1.field1913 = this.field1913;
        arg1.field1875 = this.field1875;
        arg1.field1861 = this.field1861;
        arg1.field1862 = this.field1862;
        arg1.field1863 = this.field1863;
        arg1.field1864 = this.field1864;
        arg1.field1866 = this.field1866;
        arg1.field1849 = this.field1849;
        arg1.field1868 = this.field1868;
        arg1.field1852 = this.field1852;
        arg1.field1871 = this.field1871;
        arg1.field1872 = this.field1872;
        arg1.field1873 = this.field1873;
        arg1.field1874 = this.field1874;
        arg1.field1885 = this.field1885;
        arg1.field1876 = 0;
        return arg1;
    }

    @ObfuscatedName("dw.s()V")
    public void method2277() {
        if (this.field1876 == 1) {
            return;
        }
        this.field1876 = 1;
        this.field1541 = 0;
        this.field1886 = 0;
        this.field1878 = 0;
        for (int var1 = 0; var1 < this.field1853; var1++) {
            int var2 = this.field1859[var1];
            int var3 = this.field1882[var1];
            int var4 = this.field1867[var1];
            if (-var3 > this.field1541) {
                this.field1541 = -var3;
            }
            if (var3 > this.field1886) {
                this.field1886 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1878) {
                this.field1878 = var5;
            }
        }
        this.field1878 = (int) (Math.sqrt((double) this.field1878) + 0.99D);
        this.field1880 = (int) (Math.sqrt((double) (this.field1541 * this.field1541 + this.field1878 * this.field1878)) + 0.99D);
        this.field1893 = this.field1880 + (int) (Math.sqrt((double) (this.field1886 * this.field1886 + this.field1878 * this.field1878)) + 0.99D);
    }

    @ObfuscatedName("dw.j()V")
    public void method2249() {
        if (this.field1876 == 2) {
            return;
        }
        this.field1876 = 2;
        this.field1878 = 0;
        for (int var1 = 0; var1 < this.field1853; var1++) {
            int var2 = this.field1859[var1];
            int var3 = this.field1882[var1];
            int var4 = this.field1867[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1878) {
                this.field1878 = var5;
            }
        }
        this.field1878 = (int) (Math.sqrt((double) this.field1878) + 0.99D);
        this.field1880 = this.field1878;
        this.field1893 = this.field1878 + this.field1878;
    }

    @ObfuscatedName("dw.p()I")
    public int method2250() {
        this.method2277();
        return this.field1878;
    }

    @ObfuscatedName("dw.l(Ldy;I)V")
    public void method2251(class109 arg0, int arg1) {
        if (this.field1873 == null || arg1 == -1) {
            return;
        }
        class97 var3 = arg0.field1810[arg1];
        class105 var4 = var3.field1619;
        Statics.field1901 = 0;
        Statics.field1856 = 0;
        Statics.field1903 = 0;
        for (int var5 = 0; var5 < var3.field1628; var5++) {
            int var6 = var3.field1625[var5];
            this.method2253(var4.field1774[var6], var4.field1778[var6], var3.field1626[var5], var3.field1627[var5], var3.field1624[var5]);
        }
        this.field1876 = 0;
    }

    @ObfuscatedName("dw.i(Ldy;ILdy;I[I)V")
    public void method2252(class109 arg0, int arg1, class109 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2251(arg0, arg1);
            return;
        }
        class97 var6 = arg0.field1810[arg1];
        class97 var7 = arg2.field1810[arg3];
        class105 var8 = var6.field1619;
        Statics.field1901 = 0;
        Statics.field1856 = 0;
        Statics.field1903 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1628; var11++) {
            int var12 = var6.field1625[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1774[var12] == 0) {
                this.method2253(var8.field1774[var12], var8.field1778[var12], var6.field1626[var11], var6.field1627[var11], var6.field1624[var11]);
            }
        }
        Statics.field1901 = 0;
        Statics.field1856 = 0;
        Statics.field1903 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1628; var15++) {
            int var16 = var7.field1625[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1774[var16] == 0) {
                this.method2253(var8.field1774[var16], var8.field1778[var16], var7.field1626[var15], var7.field1627[var15], var7.field1624[var15]);
            }
        }
        this.field1876 = 0;
    }

    @ObfuscatedName("dw.r(I[IIII)V")
    public void method2253(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1901 = 0;
            Statics.field1856 = 0;
            Statics.field1903 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1873.length) {
                    int[] var10 = this.field1873[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1901 += this.field1859[var12];
                        Statics.field1856 += this.field1882[var12];
                        Statics.field1903 += this.field1867[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1901 = Statics.field1901 / var7 + arg2;
                Statics.field1856 = Statics.field1856 / var7 + arg3;
                Statics.field1903 = Statics.field1903 / var7 + arg4;
            } else {
                Statics.field1901 = arg2;
                Statics.field1856 = arg3;
                Statics.field1903 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1873.length) {
                    int[] var15 = this.field1873[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1859[var17] += arg2;
                        this.field1882[var17] += arg3;
                        this.field1867[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1873.length) {
                    int[] var20 = this.field1873[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1859[var22] -= Statics.field1901;
                        this.field1882[var22] -= Statics.field1856;
                        this.field1867[var22] -= Statics.field1903;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1909[var25];
                            int var27 = field1910[var25];
                            int var28 = this.field1882[var22] * var26 + this.field1859[var22] * var27 >> 16;
                            this.field1882[var22] = this.field1882[var22] * var27 - this.field1859[var22] * var26 >> 16;
                            this.field1859[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1909[var23];
                            int var30 = field1910[var23];
                            int var31 = this.field1882[var22] * var30 - this.field1867[var22] * var29 >> 16;
                            this.field1867[var22] = this.field1882[var22] * var29 + this.field1867[var22] * var30 >> 16;
                            this.field1882[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1909[var24];
                            int var33 = field1910[var24];
                            int var34 = this.field1867[var22] * var32 + this.field1859[var22] * var33 >> 16;
                            this.field1867[var22] = this.field1867[var22] * var33 - this.field1859[var22] * var32 >> 16;
                            this.field1859[var22] = var34;
                        }
                        this.field1859[var22] += Statics.field1901;
                        this.field1882[var22] += Statics.field1856;
                        this.field1867[var22] += Statics.field1903;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1873.length) {
                    int[] var37 = this.field1873[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1859[var39] -= Statics.field1901;
                        this.field1882[var39] -= Statics.field1856;
                        this.field1867[var39] -= Statics.field1903;
                        this.field1859[var39] = this.field1859[var39] * arg2 / 128;
                        this.field1882[var39] = this.field1882[var39] * arg3 / 128;
                        this.field1867[var39] = this.field1867[var39] * arg4 / 128;
                        this.field1859[var39] += Statics.field1901;
                        this.field1882[var39] += Statics.field1856;
                        this.field1867[var39] += Statics.field1903;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1874 != null && this.field1905 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1874.length) {
                    int[] var42 = this.field1874[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1905[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1905[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dw.o()V")
    public void method2254() {
        for (int var1 = 0; var1 < this.field1853; var1++) {
            int var2 = this.field1859[var1];
            this.field1859[var1] = this.field1867[var1];
            this.field1867[var1] = -var2;
        }
        this.field1876 = 0;
    }

    @ObfuscatedName("dw.c()V")
    public void method2296() {
        for (int var1 = 0; var1 < this.field1853; var1++) {
            this.field1859[var1] = -this.field1859[var1];
            this.field1867[var1] = -this.field1867[var1];
        }
        this.field1876 = 0;
    }

    @ObfuscatedName("dw.f()V")
    public void method2256() {
        for (int var1 = 0; var1 < this.field1853; var1++) {
            int var2 = this.field1867[var1];
            this.field1867[var1] = this.field1859[var1];
            this.field1859[var1] = -var2;
        }
        this.field1876 = 0;
    }

    @ObfuscatedName("dw.a(I)V")
    public void method2257(int arg0) {
        int var2 = field1909[arg0];
        int var3 = field1910[arg0];
        for (int var4 = 0; var4 < this.field1853; var4++) {
            int var5 = this.field1882[var4] * var3 - this.field1867[var4] * var2 >> 16;
            this.field1867[var4] = this.field1882[var4] * var2 + this.field1867[var4] * var3 >> 16;
            this.field1882[var4] = var5;
        }
        this.field1876 = 0;
    }

    @ObfuscatedName("dw.t(III)V")
    public void method2322(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1853; var4++) {
            this.field1859[var4] += arg0;
            this.field1882[var4] += arg1;
            this.field1867[var4] += arg2;
        }
        this.field1876 = 0;
    }

    @ObfuscatedName("dw.u(III)V")
    public void method2265(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1853; var4++) {
            this.field1859[var4] = this.field1859[var4] * arg0 / 128;
            this.field1882[var4] = this.field1882[var4] * arg1 / 128;
            this.field1867[var4] = this.field1867[var4] * arg2 / 128;
        }
        this.field1876 = 0;
    }

    @ObfuscatedName("dw.z(IIIIIII)V")
    public final void method2260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1883[0] = -1;
        if (this.field1876 != 2 && this.field1876 != 1) {
            this.method2249();
        }
        int var8 = Statics.field1757;
        int var9 = Statics.field1749;
        int var10 = field1909[arg0];
        int var11 = field1910[arg0];
        int var12 = field1909[arg1];
        int var13 = field1910[arg1];
        int var14 = field1909[arg2];
        int var15 = field1910[arg2];
        int var16 = field1909[arg3];
        int var17 = field1910[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1853; var19++) {
            int var20 = this.field1859[var19];
            int var21 = this.field1882[var19];
            int var22 = this.field1867[var19];
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
            field1902[var19] = var30 - var18;
            field1884[var19] = (var26 << 9) / var30 + var8;
            field1891[var19] = (var29 << 9) / var30 + var9;
            if (this.field1879 > 0) {
                field1887[var19] = var26;
                field1888[var19] = var29;
                field1889[var19] = var30;
            }
        }
        try {
            this.method2264(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dw.v(IIIIIIII)V")
    public final void method2248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1883[0] = -1;
        if (this.field1876 != 2 && this.field1876 != 1) {
            this.method2249();
        }
        int var9 = Statics.field1757;
        int var10 = Statics.field1749;
        int var11 = field1909[arg0];
        int var12 = field1910[arg0];
        int var13 = field1909[arg1];
        int var14 = field1910[arg1];
        int var15 = field1909[arg2];
        int var16 = field1910[arg2];
        int var17 = field1909[arg3];
        int var18 = field1910[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1853; var20++) {
            int var21 = this.field1859[var20];
            int var22 = this.field1882[var20];
            int var23 = this.field1867[var20];
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
            field1902[var20] = var31 - var19;
            field1884[var20] = (var27 << 9) / arg7 + var9;
            field1891[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1879 > 0) {
                field1887[var20] = var27;
                field1888[var20] = var30;
                field1889[var20] = var31;
            }
        }
        try {
            this.method2264(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dw.aj(IIIIIIIII)V")
    public void method1876(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1883[0] = -1;
        if (this.field1876 != 1) {
            this.method2277();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1878 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1878 << 9;
        if (var15 / var13 >= Statics.field1753) {
            return;
        }
        int var16 = this.field1878 + var14 << 9;
        if (var16 / var13 <= Statics.field1754) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1878 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1763) {
            return;
        }
        int var20 = (this.field1541 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1764) {
            return;
        }
        int var22 = (this.field1541 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1879 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1904) {
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
            int var32 = field1892 - Statics.field1757;
            int var33 = field1906 - Statics.field1749;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1885) {
                    field1908[field1907++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1757;
        int var35 = Statics.field1749;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1909[arg0];
            var37 = field1910[arg0];
        }
        for (int var38 = 0; var38 < this.field1853; var38++) {
            int var39 = this.field1859[var38];
            int var40 = this.field1882[var38];
            int var41 = this.field1867[var38];
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
            field1902[var38] = var50 - var11;
            if (var50 >= 50) {
                field1884[var38] = (var46 << 9) / var50 + var34;
                field1891[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1884[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1887[var38] = var46;
                field1888[var38] = var49;
                field1889[var38] = var50;
            }
        }
        try {
            this.method2264(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dw.w(ZZI)V")
    public final void method2264(boolean arg0, boolean arg1, int arg2) {
        if (this.field1893 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1893; var4++) {
            field1883[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1857; var5++) {
            if (this.field1863[var5] != -2) {
                int var6 = this.field1858[var5];
                int var7 = this.field1913[var5];
                int var8 = this.field1875[var5];
                int var9 = field1884[var6];
                int var10 = field1884[var7];
                int var11 = field1884[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1887[var6];
                    int var13 = field1887[var7];
                    int var14 = field1887[var8];
                    int var15 = field1888[var6];
                    int var16 = field1888[var7];
                    int var17 = field1888[var8];
                    int var18 = field1889[var6];
                    int var19 = field1889[var7];
                    int var20 = field1889[var8];
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
                        field1912[var5] = true;
                        int var30 = (field1902[var6] + field1902[var7] + field1902[var8]) / 3 + this.field1880;
                        field1869[var30][field1883[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2298(field1892, field1906, field1891[var6], field1891[var7], field1891[var8], var9, var10, var11)) {
                        field1908[field1907++] = arg2;
                        arg1 = false;
                    }
                    if ((field1891[var8] - field1891[var7]) * (var9 - var10) - (field1891[var6] - field1891[var7]) * (var11 - var10) > 0) {
                        field1912[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1748 && var10 <= Statics.field1748 && var11 <= Statics.field1748) {
                            field1896[var5] = false;
                        } else {
                            field1896[var5] = true;
                        }
                        int var31 = (field1902[var6] + field1902[var7] + field1902[var8]) / 3 + this.field1880;
                        field1869[var31][field1883[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1864 == null) {
            for (int var32 = this.field1893 - 1; var32 >= 0; var32--) {
                int var33 = field1883[var32];
                if (var33 > 0) {
                    int[] var34 = field1869[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2263(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1865[var36] = 0;
            field1897[var36] = 0;
        }
        for (int var37 = this.field1893 - 1; var37 >= 0; var37--) {
            int var38 = field1883[var37];
            if (var38 > 0) {
                int[] var39 = field1869[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1864[var41];
                    int var43 = field1865[var42]++;
                    field1894[var42][var43] = var41;
                    if (var42 < 10) {
                        field1897[var42] += var37;
                    } else if (var42 == 10) {
                        field1895[var43] = var37;
                    } else {
                        field1890[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1865[1] > 0 || field1865[2] > 0) {
            var44 = (field1897[1] + field1897[2]) / (field1865[1] + field1865[2]);
        }
        int var45 = 0;
        if (field1865[3] > 0 || field1865[4] > 0) {
            var45 = (field1897[3] + field1897[4]) / (field1865[3] + field1865[4]);
        }
        int var46 = 0;
        if (field1865[6] > 0 || field1865[8] > 0) {
            var46 = (field1897[6] + field1897[8]) / (field1865[6] + field1865[8]);
        }
        int var47 = 0;
        int var48 = field1865[10];
        int[] var49 = field1894[10];
        int[] var50 = field1895;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1865[11];
            var49 = field1894[11];
            var50 = field1890;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2263(var49[var47++]);
                if (var47 == var48 && field1894[11] != var49) {
                    var47 = 0;
                    var48 = field1865[11];
                    var49 = field1894[11];
                    var50 = field1890;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2263(var49[var47++]);
                if (var47 == var48 && field1894[11] != var49) {
                    var47 = 0;
                    var48 = field1865[11];
                    var49 = field1894[11];
                    var50 = field1890;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2263(var49[var47++]);
                if (var47 == var48 && field1894[11] != var49) {
                    var47 = 0;
                    var48 = field1865[11];
                    var49 = field1894[11];
                    var50 = field1890;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1865[var52];
            int[] var54 = field1894[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2263(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2263(var49[var47++]);
            if (var47 == var48 && field1894[11] != var49) {
                var47 = 0;
                var49 = field1894[11];
                var48 = field1865[11];
                var50 = field1890;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dw.h(I)V")
    public final void method2263(int arg0) {
        if (field1912[arg0]) {
            this.method2258(arg0);
            return;
        }
        int var2 = this.field1858[arg0];
        int var3 = this.field1913[arg0];
        int var4 = this.field1875[arg0];
        class104.field1762 = field1896[arg0];
        if (this.field1905 == null) {
            class104.field1751 = 0;
        } else {
            class104.field1751 = this.field1905[arg0] & 0xFF;
        }
        if (this.field1849 != null && this.field1849[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1866 == null || this.field1866[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1866[arg0] & 0xFF;
                var6 = this.field1852[var5];
                var7 = this.field1871[var5];
                var8 = this.field1872[var5];
            }
            if (this.field1863[arg0] == -1) {
                class104.method2157(field1891[var2], field1891[var3], field1891[var4], field1884[var2], field1884[var3], field1884[var4], this.field1861[arg0], this.field1861[arg0], this.field1861[arg0], field1887[var6], field1887[var7], field1887[var8], field1888[var6], field1888[var7], field1888[var8], field1889[var6], field1889[var7], field1889[var8], this.field1849[arg0]);
            } else {
                class104.method2157(field1891[var2], field1891[var3], field1891[var4], field1884[var2], field1884[var3], field1884[var4], this.field1861[arg0], this.field1862[arg0], this.field1863[arg0], field1887[var6], field1887[var7], field1887[var8], field1888[var6], field1888[var7], field1888[var8], field1889[var6], field1889[var7], field1889[var8], this.field1849[arg0]);
            }
        } else if (this.field1863[arg0] == -1) {
            class104.method2174(field1891[var2], field1891[var3], field1891[var4], field1884[var2], field1884[var3], field1884[var4], field1911[this.field1861[arg0]]);
        } else {
            class104.method2153(field1891[var2], field1891[var3], field1891[var4], field1884[var2], field1884[var3], field1884[var4], this.field1861[arg0], this.field1862[arg0], this.field1863[arg0]);
        }
    }

    @ObfuscatedName("dw.q(I)V")
    public final void method2258(int arg0) {
        int var2 = Statics.field1757;
        int var3 = Statics.field1749;
        int var4 = 0;
        int var5 = this.field1858[arg0];
        int var6 = this.field1913[arg0];
        int var7 = this.field1875[arg0];
        int var8 = field1889[var5];
        int var9 = field1889[var6];
        int var10 = field1889[var7];
        if (this.field1905 == null) {
            class104.field1751 = 0;
        } else {
            class104.field1751 = this.field1905[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1898[var4] = field1884[var5];
            field1899[var4] = field1891[var5];
            field1900[var4++] = this.field1861[arg0];
        } else {
            int var11 = field1887[var5];
            int var12 = field1888[var5];
            int var13 = this.field1861[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1854[var10 - var8];
                field1898[var4] = (((field1887[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1899[var4] = (((field1888[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1900[var4++] = ((this.field1863[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1854[var9 - var8];
                field1898[var4] = (((field1887[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1899[var4] = (((field1888[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1900[var4++] = ((this.field1862[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1898[var4] = field1884[var6];
            field1899[var4] = field1891[var6];
            field1900[var4++] = this.field1862[arg0];
        } else {
            int var16 = field1887[var6];
            int var17 = field1888[var6];
            int var18 = this.field1862[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1854[var8 - var9];
                field1898[var4] = (((field1887[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1899[var4] = (((field1888[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1900[var4++] = ((this.field1861[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1854[var10 - var9];
                field1898[var4] = (((field1887[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1899[var4] = (((field1888[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1900[var4++] = ((this.field1863[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1898[var4] = field1884[var7];
            field1899[var4] = field1891[var7];
            field1900[var4++] = this.field1863[arg0];
        } else {
            int var21 = field1887[var7];
            int var22 = field1888[var7];
            int var23 = this.field1863[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1854[var9 - var10];
                field1898[var4] = (((field1887[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1899[var4] = (((field1888[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1900[var4++] = ((this.field1862[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1854[var8 - var10];
                field1898[var4] = (((field1887[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1899[var4] = (((field1888[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1900[var4++] = ((this.field1861[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1898[0];
        int var27 = field1898[1];
        int var28 = field1898[2];
        int var29 = field1899[0];
        int var30 = field1899[1];
        int var31 = field1899[2];
        class104.field1762 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1748 || var27 > Statics.field1748 || var28 > Statics.field1748) {
                class104.field1762 = true;
            }
            if (this.field1849 != null && this.field1849[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1866 == null || this.field1866[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1866[arg0] & 0xFF;
                    var33 = this.field1852[var32];
                    var34 = this.field1871[var32];
                    var35 = this.field1872[var32];
                }
                if (this.field1863[arg0] == -1) {
                    class104.method2157(var29, var30, var31, var26, var27, var28, this.field1861[arg0], this.field1861[arg0], this.field1861[arg0], field1887[var33], field1887[var34], field1887[var35], field1888[var33], field1888[var34], field1888[var35], field1889[var33], field1889[var34], field1889[var35], this.field1849[arg0]);
                } else {
                    class104.method2157(var29, var30, var31, var26, var27, var28, field1900[0], field1900[1], field1900[2], field1887[var33], field1887[var34], field1887[var35], field1888[var33], field1888[var34], field1888[var35], field1889[var33], field1889[var34], field1889[var35], this.field1849[arg0]);
                }
            } else if (this.field1863[arg0] == -1) {
                class104.method2174(var29, var30, var31, var26, var27, var28, field1911[this.field1861[arg0]]);
            } else {
                class104.method2153(var29, var30, var31, var26, var27, var28, field1900[0], field1900[1], field1900[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1748 || var27 > Statics.field1748 || var28 > Statics.field1748 || field1898[3] < 0 || field1898[3] > Statics.field1748) {
            class104.field1762 = true;
        }
        if (this.field1849 != null && this.field1849[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1866 == null || this.field1866[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1866[arg0] & 0xFF;
                var37 = this.field1852[var36];
                var38 = this.field1871[var36];
                var39 = this.field1872[var36];
            }
            short var40 = this.field1849[arg0];
            if (this.field1863[arg0] == -1) {
                class104.method2157(var29, var30, var31, var26, var27, var28, this.field1861[arg0], this.field1861[arg0], this.field1861[arg0], field1887[var37], field1887[var38], field1887[var39], field1888[var37], field1888[var38], field1888[var39], field1889[var37], field1889[var38], field1889[var39], var40);
                class104.method2157(var29, var31, field1899[3], var26, var28, field1898[3], this.field1861[arg0], this.field1861[arg0], this.field1861[arg0], field1887[var37], field1887[var38], field1887[var39], field1888[var37], field1888[var38], field1888[var39], field1889[var37], field1889[var38], field1889[var39], var40);
            } else {
                class104.method2157(var29, var30, var31, var26, var27, var28, field1900[0], field1900[1], field1900[2], field1887[var37], field1887[var38], field1887[var39], field1888[var37], field1888[var38], field1888[var39], field1889[var37], field1889[var38], field1889[var39], var40);
                class104.method2157(var29, var31, field1899[3], var26, var28, field1898[3], field1900[0], field1900[2], field1900[3], field1887[var37], field1887[var38], field1887[var39], field1888[var37], field1888[var38], field1888[var39], field1889[var37], field1889[var38], field1889[var39], var40);
            }
        } else if (this.field1863[arg0] == -1) {
            int var41 = field1911[this.field1861[arg0]];
            class104.method2174(var29, var30, var31, var26, var27, var28, var41);
            class104.method2174(var29, var31, field1899[3], var26, var28, field1898[3], var41);
        } else {
            class104.method2153(var29, var30, var31, var26, var27, var28, field1900[0], field1900[1], field1900[2]);
            class104.method2153(var29, var31, field1899[3], var26, var28, field1898[3], field1900[0], field1900[2], field1900[3]);
        }
    }

    @ObfuscatedName("dw.g(IIIIIIII)Z")
    public final boolean method2298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
