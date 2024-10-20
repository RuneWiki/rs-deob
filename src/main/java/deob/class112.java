package deob;

@ObfuscatedName("dw")
public class class112 extends class94 {

    @ObfuscatedName("dw.a")
    public static class112 field1879 = new class112();

    @ObfuscatedName("dw.r")
    public static byte[] field1859 = new byte[1];

    @ObfuscatedName("dw.u")
    public static class112 field1835 = new class112();

    @ObfuscatedName("dw.t")
    public static byte[] field1836 = new byte[1];

    @ObfuscatedName("dw.k")
    public int field1860 = 0;

    @ObfuscatedName("dw.x")
    public int[] field1838;

    @ObfuscatedName("dw.v")
    public int[] field1839;

    @ObfuscatedName("dw.g")
    public int[] field1873;

    @ObfuscatedName("dw.n")
    public int field1841 = 0;

    @ObfuscatedName("dw.q")
    public int[] field1842;

    @ObfuscatedName("dw.i")
    public int[] field1851;

    @ObfuscatedName("dw.p")
    public int[] field1844;

    @ObfuscatedName("dw.e")
    public int[] field1845;

    @ObfuscatedName("dw.o")
    public int[] field1846;

    @ObfuscatedName("dw.j")
    public int[] field1847;

    @ObfuscatedName("dw.s")
    public byte[] field1848;

    @ObfuscatedName("dw.b")
    public byte[] field1849;

    @ObfuscatedName("dw.c")
    public byte[] field1850;

    @ObfuscatedName("dw.m")
    public short[] field1890;

    @ObfuscatedName("dw.z")
    public byte field1852 = 0;

    @ObfuscatedName("dw.h")
    public int field1864 = 0;

    @ObfuscatedName("dw.f")
    public int[] field1854;

    @ObfuscatedName("dw.w")
    public int[] field1833;

    @ObfuscatedName("dw.l")
    public int[] field1856;

    @ObfuscatedName("dw.d")
    public int[][] field1857;

    @ObfuscatedName("dw.y")
    public int[][] field1858;

    @ObfuscatedName("dw.ah")
    public boolean field1853 = false;

    @ObfuscatedName("dw.ad")
    public int field1897;

    @ObfuscatedName("dw.au")
    public int field1861;

    @ObfuscatedName("dw.as")
    public int field1865;

    @ObfuscatedName("dw.ag")
    public int field1871;

    @ObfuscatedName("dw.ab")
    public int field1894;

    @ObfuscatedName("dw.af")
    public static boolean[] field1881 = new boolean[4096];

    @ObfuscatedName("dw.ay")
    public static boolean[] field1896 = new boolean[4096];

    @ObfuscatedName("dw.ax")
    public static int[] field1868 = new int[4096];

    @ObfuscatedName("dw.aa")
    public static int[] field1869 = new int[4096];

    @ObfuscatedName("dw.ak")
    public static int[] field1870 = new int[4096];

    @ObfuscatedName("dw.ac")
    public static int[] field1886 = new int[4096];

    @ObfuscatedName("dw.aj")
    public static int[] field1872 = new int[4096];

    @ObfuscatedName("dw.av")
    public static int[] field1862 = new int[4096];

    @ObfuscatedName("dw.an")
    public static int[] field1875 = new int[1600];

    @ObfuscatedName("dw.ap")
    public static int[][] field1876 = new int[1600][512];

    @ObfuscatedName("dw.at")
    public static int[] field1877 = new int[12];

    @ObfuscatedName("dw.ae")
    public static int[][] field1878 = new int[12][2000];

    @ObfuscatedName("dw.aw")
    public static int[] field1866 = new int[2000];

    @ObfuscatedName("dw.am")
    public static int[] field1880 = new int[2000];

    @ObfuscatedName("dw.ar")
    public static int[] field1885 = new int[12];

    @ObfuscatedName("dw.ai")
    public static int[] field1882 = new int[10];

    @ObfuscatedName("dw.ao")
    public static int[] field1883 = new int[10];

    @ObfuscatedName("dw.az")
    public static int[] field1884 = new int[10];

    @ObfuscatedName("dw.by")
    public static boolean field1888 = false;

    @ObfuscatedName("dw.bk")
    public static int field1889 = 0;

    @ObfuscatedName("dw.be")
    public static int field1892 = 0;

    @ObfuscatedName("dw.bc")
    public static int field1891 = 0;

    @ObfuscatedName("dw.bl")
    public static int[] field1837 = new int[1000];

    @ObfuscatedName("dw.ba")
    public static int[] field1899 = class104.field1753;

    @ObfuscatedName("dw.bx")
    public static int[] field1843 = class104.field1754;

    @ObfuscatedName("dw.bq")
    public static int[] field1895 = class104.field1746;

    @ObfuscatedName("dw.bu")
    public static int[] field1840 = class104.field1752;

    public class112() {
    }

    public class112(class112[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1860 = 0;
        this.field1841 = 0;
        this.field1864 = 0;
        this.field1852 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class112 var8 = arg0[var7];
            if (var8 != null) {
                this.field1860 += var8.field1860;
                this.field1841 += var8.field1841;
                this.field1864 += var8.field1864;
                if (var8.field1848 == null) {
                    if (this.field1852 == -1) {
                        this.field1852 = var8.field1852;
                    }
                    if (this.field1852 != var8.field1852) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1849 != null;
                var5 |= var8.field1890 != null;
                var6 |= var8.field1850 != null;
            }
        }
        this.field1838 = new int[this.field1860];
        this.field1839 = new int[this.field1860];
        this.field1873 = new int[this.field1860];
        this.field1842 = new int[this.field1841];
        this.field1851 = new int[this.field1841];
        this.field1844 = new int[this.field1841];
        this.field1845 = new int[this.field1841];
        this.field1846 = new int[this.field1841];
        this.field1847 = new int[this.field1841];
        if (var3) {
            this.field1848 = new byte[this.field1841];
        }
        if (var4) {
            this.field1849 = new byte[this.field1841];
        }
        if (var5) {
            this.field1890 = new short[this.field1841];
        }
        if (var6) {
            this.field1850 = new byte[this.field1841];
        }
        if (this.field1864 > 0) {
            this.field1854 = new int[this.field1864];
            this.field1833 = new int[this.field1864];
            this.field1856 = new int[this.field1864];
        }
        this.field1860 = 0;
        this.field1841 = 0;
        this.field1864 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class112 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1841; var11++) {
                    this.field1842[this.field1841] = var10.field1842[var11] + this.field1860;
                    this.field1851[this.field1841] = var10.field1851[var11] + this.field1860;
                    this.field1844[this.field1841] = var10.field1844[var11] + this.field1860;
                    this.field1845[this.field1841] = var10.field1845[var11];
                    this.field1846[this.field1841] = var10.field1846[var11];
                    this.field1847[this.field1841] = var10.field1847[var11];
                    if (var3) {
                        if (var10.field1848 == null) {
                            this.field1848[this.field1841] = var10.field1852;
                        } else {
                            this.field1848[this.field1841] = var10.field1848[var11];
                        }
                    }
                    if (var4 && var10.field1849 != null) {
                        this.field1849[this.field1841] = var10.field1849[var11];
                    }
                    if (var5) {
                        if (var10.field1890 == null) {
                            this.field1890[this.field1841] = -1;
                        } else {
                            this.field1890[this.field1841] = var10.field1890[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1850 == null || var10.field1850[var11] == -1) {
                            this.field1850[this.field1841] = -1;
                        } else {
                            this.field1850[this.field1841] = (byte) (var10.field1850[var11] + this.field1864);
                        }
                    }
                    this.field1841++;
                }
                for (int var12 = 0; var12 < var10.field1864; var12++) {
                    this.field1854[this.field1864] = var10.field1854[var12] + this.field1860;
                    this.field1833[this.field1864] = var10.field1833[var12] + this.field1860;
                    this.field1856[this.field1864] = var10.field1856[var12] + this.field1860;
                    this.field1864++;
                }
                for (int var13 = 0; var13 < var10.field1860; var13++) {
                    this.field1838[this.field1860] = var10.field1838[var13];
                    this.field1839[this.field1860] = var10.field1839[var13];
                    this.field1873[this.field1860] = var10.field1873[var13];
                    this.field1860++;
                }
            }
        }
    }

    @ObfuscatedName("dw.a([[IIIIZI)Ldw;")
    public class112 method2207(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2179();
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
        class112 var15;
        if (arg4) {
            var15 = new class112();
            var15.field1860 = this.field1860;
            var15.field1841 = this.field1841;
            var15.field1864 = this.field1864;
            var15.field1838 = this.field1838;
            var15.field1873 = this.field1873;
            var15.field1842 = this.field1842;
            var15.field1851 = this.field1851;
            var15.field1844 = this.field1844;
            var15.field1845 = this.field1845;
            var15.field1846 = this.field1846;
            var15.field1847 = this.field1847;
            var15.field1848 = this.field1848;
            var15.field1849 = this.field1849;
            var15.field1850 = this.field1850;
            var15.field1890 = this.field1890;
            var15.field1852 = this.field1852;
            var15.field1854 = this.field1854;
            var15.field1833 = this.field1833;
            var15.field1856 = this.field1856;
            var15.field1857 = this.field1857;
            var15.field1858 = this.field1858;
            var15.field1853 = this.field1853;
            var15.field1839 = new int[var15.field1860];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1860; var16++) {
                int var17 = this.field1838[var16] + arg1;
                int var18 = this.field1873[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1839[var16] = this.field1839[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1860; var26++) {
                int var27 = (-this.field1839[var26] << 16) / this.field1518;
                if (var27 < arg5) {
                    int var28 = this.field1838[var26] + arg1;
                    int var29 = this.field1873[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1839[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1839[var26];
                }
            }
        }
        var15.field1897 = 0;
        return var15;
    }

    @ObfuscatedName("dw.u(Z)Ldw;")
    public class112 method2176(boolean arg0) {
        if (!arg0 && field1859.length < this.field1841) {
            field1859 = new byte[this.field1841 + 100];
        }
        return this.method2229(arg0, field1879, field1859);
    }

    @ObfuscatedName("dw.t(Z)Ldw;")
    public class112 method2177(boolean arg0) {
        if (!arg0 && field1836.length < this.field1841) {
            field1836 = new byte[this.field1841 + 100];
        }
        return this.method2229(arg0, field1835, field1836);
    }

    @ObfuscatedName("dw.k(ZLdw;[B)Ldw;")
    public class112 method2229(boolean arg0, class112 arg1, byte[] arg2) {
        arg1.field1860 = this.field1860;
        arg1.field1841 = this.field1841;
        arg1.field1864 = this.field1864;
        if (arg1.field1838 == null || arg1.field1838.length < this.field1860) {
            arg1.field1838 = new int[this.field1860 + 100];
            arg1.field1839 = new int[this.field1860 + 100];
            arg1.field1873 = new int[this.field1860 + 100];
        }
        for (int var4 = 0; var4 < this.field1860; var4++) {
            arg1.field1838[var4] = this.field1838[var4];
            arg1.field1839[var4] = this.field1839[var4];
            arg1.field1873[var4] = this.field1873[var4];
        }
        if (arg0) {
            arg1.field1849 = this.field1849;
        } else {
            arg1.field1849 = arg2;
            if (this.field1849 == null) {
                for (int var5 = 0; var5 < this.field1841; var5++) {
                    arg1.field1849[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1841; var6++) {
                    arg1.field1849[var6] = this.field1849[var6];
                }
            }
        }
        arg1.field1842 = this.field1842;
        arg1.field1851 = this.field1851;
        arg1.field1844 = this.field1844;
        arg1.field1845 = this.field1845;
        arg1.field1846 = this.field1846;
        arg1.field1847 = this.field1847;
        arg1.field1848 = this.field1848;
        arg1.field1850 = this.field1850;
        arg1.field1890 = this.field1890;
        arg1.field1852 = this.field1852;
        arg1.field1854 = this.field1854;
        arg1.field1833 = this.field1833;
        arg1.field1856 = this.field1856;
        arg1.field1857 = this.field1857;
        arg1.field1858 = this.field1858;
        arg1.field1853 = this.field1853;
        arg1.field1897 = 0;
        return arg1;
    }

    @ObfuscatedName("dw.q()V")
    public void method2179() {
        if (this.field1897 == 1) {
            return;
        }
        this.field1897 = 1;
        this.field1518 = 0;
        this.field1861 = 0;
        this.field1865 = 0;
        for (int var1 = 0; var1 < this.field1860; var1++) {
            int var2 = this.field1838[var1];
            int var3 = this.field1839[var1];
            int var4 = this.field1873[var1];
            if (-var3 > this.field1518) {
                this.field1518 = -var3;
            }
            if (var3 > this.field1861) {
                this.field1861 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1865) {
                this.field1865 = var5;
            }
        }
        this.field1865 = (int) (Math.sqrt((double) this.field1865) + 0.99D);
        this.field1894 = (int) (Math.sqrt((double) (this.field1518 * this.field1518 + this.field1865 * this.field1865)) + 0.99D);
        this.field1871 = this.field1894 + (int) (Math.sqrt((double) (this.field1865 * this.field1865 + this.field1861 * this.field1861)) + 0.99D);
    }

    @ObfuscatedName("dw.i()V")
    public void method2180() {
        if (this.field1897 == 2) {
            return;
        }
        this.field1897 = 2;
        this.field1865 = 0;
        for (int var1 = 0; var1 < this.field1860; var1++) {
            int var2 = this.field1838[var1];
            int var3 = this.field1839[var1];
            int var4 = this.field1873[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1865) {
                this.field1865 = var5;
            }
        }
        this.field1865 = (int) (Math.sqrt((double) this.field1865) + 0.99D);
        this.field1894 = this.field1865;
        this.field1871 = this.field1865 + this.field1865;
    }

    @ObfuscatedName("dw.p()I")
    public int method2222() {
        this.method2179();
        return this.field1865;
    }

    @ObfuscatedName("dw.e(Lda;I)V")
    public void method2198(class109 arg0, int arg1) {
        if (this.field1857 == null || arg1 == -1) {
            return;
        }
        class97 var3 = arg0.field1797[arg1];
        class105 var4 = var3.field1598;
        Statics.field1893 = 0;
        Statics.field1855 = 0;
        Statics.field1887 = 0;
        for (int var5 = 0; var5 < var3.field1602; var5++) {
            int var6 = var3.field1604[var5];
            this.method2184(var4.field1758[var6], var4.field1760[var6], var3.field1607[var5], var3.field1601[var5], var3.field1606[var5]);
        }
        this.field1897 = 0;
    }

    @ObfuscatedName("dw.o(Lda;ILda;I[I)V")
    public void method2183(class109 arg0, int arg1, class109 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2198(arg0, arg1);
            return;
        }
        class97 var6 = arg0.field1797[arg1];
        class97 var7 = arg2.field1797[arg3];
        class105 var8 = var6.field1598;
        Statics.field1893 = 0;
        Statics.field1855 = 0;
        Statics.field1887 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1602; var11++) {
            int var12 = var6.field1604[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1758[var12] == 0) {
                this.method2184(var8.field1758[var12], var8.field1760[var12], var6.field1607[var11], var6.field1601[var11], var6.field1606[var11]);
            }
        }
        Statics.field1893 = 0;
        Statics.field1855 = 0;
        Statics.field1887 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1602; var15++) {
            int var16 = var7.field1604[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1758[var16] == 0) {
                this.method2184(var8.field1758[var16], var8.field1760[var16], var7.field1607[var15], var7.field1601[var15], var7.field1606[var15]);
            }
        }
        this.field1897 = 0;
    }

    @ObfuscatedName("dw.j(I[IIII)V")
    public void method2184(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1893 = 0;
            Statics.field1855 = 0;
            Statics.field1887 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1857.length) {
                    int[] var10 = this.field1857[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1893 += this.field1838[var12];
                        Statics.field1855 += this.field1839[var12];
                        Statics.field1887 += this.field1873[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1893 = Statics.field1893 / var7 + arg2;
                Statics.field1855 = Statics.field1855 / var7 + arg3;
                Statics.field1887 = Statics.field1887 / var7 + arg4;
            } else {
                Statics.field1893 = arg2;
                Statics.field1855 = arg3;
                Statics.field1887 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1857.length) {
                    int[] var15 = this.field1857[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1838[var17] += arg2;
                        this.field1839[var17] += arg3;
                        this.field1873[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1857.length) {
                    int[] var20 = this.field1857[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1838[var22] -= Statics.field1893;
                        this.field1839[var22] -= Statics.field1855;
                        this.field1873[var22] -= Statics.field1887;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1899[var25];
                            int var27 = field1843[var25];
                            int var28 = this.field1839[var22] * var26 + this.field1838[var22] * var27 >> 16;
                            this.field1839[var22] = this.field1839[var22] * var27 - this.field1838[var22] * var26 >> 16;
                            this.field1838[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1899[var23];
                            int var30 = field1843[var23];
                            int var31 = this.field1839[var22] * var30 - this.field1873[var22] * var29 >> 16;
                            this.field1873[var22] = this.field1873[var22] * var30 + this.field1839[var22] * var29 >> 16;
                            this.field1839[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1899[var24];
                            int var33 = field1843[var24];
                            int var34 = this.field1873[var22] * var32 + this.field1838[var22] * var33 >> 16;
                            this.field1873[var22] = this.field1873[var22] * var33 - this.field1838[var22] * var32 >> 16;
                            this.field1838[var22] = var34;
                        }
                        this.field1838[var22] += Statics.field1893;
                        this.field1839[var22] += Statics.field1855;
                        this.field1873[var22] += Statics.field1887;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1857.length) {
                    int[] var37 = this.field1857[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1838[var39] -= Statics.field1893;
                        this.field1839[var39] -= Statics.field1855;
                        this.field1873[var39] -= Statics.field1887;
                        this.field1838[var39] = this.field1838[var39] * arg2 / 128;
                        this.field1839[var39] = this.field1839[var39] * arg3 / 128;
                        this.field1873[var39] = this.field1873[var39] * arg4 / 128;
                        this.field1838[var39] += Statics.field1893;
                        this.field1839[var39] += Statics.field1855;
                        this.field1873[var39] += Statics.field1887;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1858 != null && this.field1849 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1858.length) {
                    int[] var42 = this.field1858[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1849[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1849[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dw.s()V")
    public void method2208() {
        for (int var1 = 0; var1 < this.field1860; var1++) {
            int var2 = this.field1838[var1];
            this.field1838[var1] = this.field1873[var1];
            this.field1873[var1] = -var2;
        }
        this.field1897 = 0;
    }

    @ObfuscatedName("dw.b()V")
    public void method2186() {
        for (int var1 = 0; var1 < this.field1860; var1++) {
            this.field1838[var1] = -this.field1838[var1];
            this.field1873[var1] = -this.field1873[var1];
        }
        this.field1897 = 0;
    }

    @ObfuscatedName("dw.c()V")
    public void method2225() {
        for (int var1 = 0; var1 < this.field1860; var1++) {
            int var2 = this.field1873[var1];
            this.field1873[var1] = this.field1838[var1];
            this.field1838[var1] = -var2;
        }
        this.field1897 = 0;
    }

    @ObfuscatedName("dw.m(I)V")
    public void method2188(int arg0) {
        int var2 = field1899[arg0];
        int var3 = field1843[arg0];
        for (int var4 = 0; var4 < this.field1860; var4++) {
            int var5 = this.field1839[var4] * var3 - this.field1873[var4] * var2 >> 16;
            this.field1873[var4] = this.field1873[var4] * var3 + this.field1839[var4] * var2 >> 16;
            this.field1839[var4] = var5;
        }
        this.field1897 = 0;
    }

    @ObfuscatedName("dw.z(III)V")
    public void method2189(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1860; var4++) {
            this.field1838[var4] += arg0;
            this.field1839[var4] += arg1;
            this.field1873[var4] += arg2;
        }
        this.field1897 = 0;
    }

    @ObfuscatedName("dw.h(III)V")
    public void method2228(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1860; var4++) {
            this.field1838[var4] = this.field1838[var4] * arg0 / 128;
            this.field1839[var4] = this.field1839[var4] * arg1 / 128;
            this.field1873[var4] = this.field1873[var4] * arg2 / 128;
        }
        this.field1897 = 0;
    }

    @ObfuscatedName("dw.f(IIIIIII)V")
    public final void method2191(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1875[0] = -1;
        if (this.field1897 != 2 && this.field1897 != 1) {
            this.method2180();
        }
        int var8 = Statics.field1740;
        int var9 = Statics.field1741;
        int var10 = field1899[arg0];
        int var11 = field1843[arg0];
        int var12 = field1899[arg1];
        int var13 = field1843[arg1];
        int var14 = field1899[arg2];
        int var15 = field1843[arg2];
        int var16 = field1899[arg3];
        int var17 = field1843[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1860; var19++) {
            int var20 = this.field1838[var19];
            int var21 = this.field1839[var19];
            int var22 = this.field1873[var19];
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
            field1870[var19] = var30 - var18;
            field1868[var19] = (var26 << 9) / var30 + var8;
            field1869[var19] = (var29 << 9) / var30 + var9;
            if (this.field1864 > 0) {
                field1886[var19] = var26;
                field1872[var19] = var29;
                field1862[var19] = var30;
            }
        }
        try {
            this.method2192(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dw.w(IIIIIIII)V")
    public final void method2239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1875[0] = -1;
        if (this.field1897 != 2 && this.field1897 != 1) {
            this.method2180();
        }
        int var9 = Statics.field1740;
        int var10 = Statics.field1741;
        int var11 = field1899[arg0];
        int var12 = field1843[arg0];
        int var13 = field1899[arg1];
        int var14 = field1843[arg1];
        int var15 = field1899[arg2];
        int var16 = field1843[arg2];
        int var17 = field1899[arg3];
        int var18 = field1843[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1860; var20++) {
            int var21 = this.field1838[var20];
            int var22 = this.field1839[var20];
            int var23 = this.field1873[var20];
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
            field1870[var20] = var31 - var19;
            field1868[var20] = (var27 << 9) / arg7 + var9;
            field1869[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1864 > 0) {
                field1886[var20] = var27;
                field1872[var20] = var30;
                field1862[var20] = var31;
            }
        }
        try {
            this.method2192(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dw.as(IIIIIIIII)V")
    public void method1796(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1875[0] = -1;
        if (this.field1897 != 1) {
            this.method2179();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1865 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1865 << 9;
        if (var15 / var13 >= Statics.field1745) {
            return;
        }
        int var16 = this.field1865 + var14 << 9;
        if (var16 / var13 <= Statics.field1744) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1865 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1733) {
            return;
        }
        int var20 = (this.field1518 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1747) {
            return;
        }
        int var22 = (this.field1518 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1864 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1888) {
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
            int var32 = field1889 - Statics.field1740;
            int var33 = field1892 - Statics.field1741;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1853) {
                    field1837[field1891++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1740;
        int var35 = Statics.field1741;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1899[arg0];
            var37 = field1843[arg0];
        }
        for (int var38 = 0; var38 < this.field1860; var38++) {
            int var39 = this.field1838[var38];
            int var40 = this.field1839[var38];
            int var41 = this.field1873[var38];
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
            field1870[var38] = var50 - var11;
            if (var50 >= 50) {
                field1868[var38] = (var46 << 9) / var50 + var34;
                field1869[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1868[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1886[var38] = var46;
                field1872[var38] = var49;
                field1862[var38] = var50;
            }
        }
        try {
            this.method2192(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dw.l(ZZI)V")
    public final void method2192(boolean arg0, boolean arg1, int arg2) {
        if (this.field1871 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1871; var4++) {
            field1875[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1841; var5++) {
            if (this.field1847[var5] != -2) {
                int var6 = this.field1842[var5];
                int var7 = this.field1851[var5];
                int var8 = this.field1844[var5];
                int var9 = field1868[var6];
                int var10 = field1868[var7];
                int var11 = field1868[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1886[var6];
                    int var13 = field1886[var7];
                    int var14 = field1886[var8];
                    int var15 = field1872[var6];
                    int var16 = field1872[var7];
                    int var17 = field1872[var8];
                    int var18 = field1862[var6];
                    int var19 = field1862[var7];
                    int var20 = field1862[var8];
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
                        field1896[var5] = true;
                        int var30 = (field1870[var6] + field1870[var7] + field1870[var8]) / 3 + this.field1894;
                        field1876[var30][field1875[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2196(field1889, field1892, field1869[var6], field1869[var7], field1869[var8], var9, var10, var11)) {
                        field1837[field1891++] = arg2;
                        arg1 = false;
                    }
                    if ((field1869[var8] - field1869[var7]) * (var9 - var10) - (field1869[var6] - field1869[var7]) * (var11 - var10) > 0) {
                        field1896[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1742 && var10 <= Statics.field1742 && var11 <= Statics.field1742) {
                            field1881[var5] = false;
                        } else {
                            field1881[var5] = true;
                        }
                        int var31 = (field1870[var6] + field1870[var7] + field1870[var8]) / 3 + this.field1894;
                        field1876[var31][field1875[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1848 == null) {
            for (int var32 = this.field1871 - 1; var32 >= 0; var32--) {
                int var33 = field1875[var32];
                if (var33 > 0) {
                    int[] var34 = field1876[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2194(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1877[var36] = 0;
            field1885[var36] = 0;
        }
        for (int var37 = this.field1871 - 1; var37 >= 0; var37--) {
            int var38 = field1875[var37];
            if (var38 > 0) {
                int[] var39 = field1876[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1848[var41];
                    int var43 = field1877[var42]++;
                    field1878[var42][var43] = var41;
                    if (var42 < 10) {
                        field1885[var42] += var37;
                    } else if (var42 == 10) {
                        field1866[var43] = var37;
                    } else {
                        field1880[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1877[1] > 0 || field1877[2] > 0) {
            var44 = (field1885[1] + field1885[2]) / (field1877[1] + field1877[2]);
        }
        int var45 = 0;
        if (field1877[3] > 0 || field1877[4] > 0) {
            var45 = (field1885[3] + field1885[4]) / (field1877[3] + field1877[4]);
        }
        int var46 = 0;
        if (field1877[6] > 0 || field1877[8] > 0) {
            var46 = (field1885[6] + field1885[8]) / (field1877[6] + field1877[8]);
        }
        int var47 = 0;
        int var48 = field1877[10];
        int[] var49 = field1878[10];
        int[] var50 = field1866;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1877[11];
            var49 = field1878[11];
            var50 = field1880;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2194(var49[var47++]);
                if (var47 == var48 && field1878[11] != var49) {
                    var47 = 0;
                    var48 = field1877[11];
                    var49 = field1878[11];
                    var50 = field1880;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2194(var49[var47++]);
                if (var47 == var48 && field1878[11] != var49) {
                    var47 = 0;
                    var48 = field1877[11];
                    var49 = field1878[11];
                    var50 = field1880;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2194(var49[var47++]);
                if (var47 == var48 && field1878[11] != var49) {
                    var47 = 0;
                    var48 = field1877[11];
                    var49 = field1878[11];
                    var50 = field1880;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1877[var52];
            int[] var54 = field1878[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2194(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2194(var49[var47++]);
            if (var47 == var48 && field1878[11] != var49) {
                var47 = 0;
                var49 = field1878[11];
                var48 = field1877[11];
                var50 = field1880;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dw.d(I)V")
    public final void method2194(int arg0) {
        if (field1896[arg0]) {
            this.method2178(arg0);
            return;
        }
        int var2 = this.field1842[arg0];
        int var3 = this.field1851[arg0];
        int var4 = this.field1844[arg0];
        class104.field1743 = field1881[arg0];
        if (this.field1849 == null) {
            class104.field1734 = 0;
        } else {
            class104.field1734 = this.field1849[arg0] & 0xFF;
        }
        if (this.field1890 != null && this.field1890[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1850 == null || this.field1850[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1850[arg0] & 0xFF;
                var6 = this.field1854[var5];
                var7 = this.field1833[var5];
                var8 = this.field1856[var5];
            }
            if (this.field1847[arg0] == -1) {
                class104.method2093(field1869[var2], field1869[var3], field1869[var4], field1868[var2], field1868[var3], field1868[var4], this.field1845[arg0], this.field1845[arg0], this.field1845[arg0], field1886[var6], field1886[var7], field1886[var8], field1872[var6], field1872[var7], field1872[var8], field1862[var6], field1862[var7], field1862[var8], this.field1890[arg0]);
            } else {
                class104.method2093(field1869[var2], field1869[var3], field1869[var4], field1868[var2], field1868[var3], field1868[var4], this.field1845[arg0], this.field1846[arg0], this.field1847[arg0], field1886[var6], field1886[var7], field1886[var8], field1872[var6], field1872[var7], field1872[var8], field1862[var6], field1862[var7], field1862[var8], this.field1890[arg0]);
            }
        } else if (this.field1847[arg0] == -1) {
            class104.method2091(field1869[var2], field1869[var3], field1869[var4], field1868[var2], field1868[var3], field1868[var4], field1895[this.field1845[arg0]]);
        } else {
            class104.method2089(field1869[var2], field1869[var3], field1869[var4], field1868[var2], field1868[var3], field1868[var4], this.field1845[arg0], this.field1846[arg0], this.field1847[arg0]);
        }
    }

    @ObfuscatedName("dw.y(I)V")
    public final void method2178(int arg0) {
        int var2 = Statics.field1740;
        int var3 = Statics.field1741;
        int var4 = 0;
        int var5 = this.field1842[arg0];
        int var6 = this.field1851[arg0];
        int var7 = this.field1844[arg0];
        int var8 = field1862[var5];
        int var9 = field1862[var6];
        int var10 = field1862[var7];
        if (this.field1849 == null) {
            class104.field1734 = 0;
        } else {
            class104.field1734 = this.field1849[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1882[var4] = field1868[var5];
            field1883[var4] = field1869[var5];
            field1884[var4++] = this.field1845[arg0];
        } else {
            int var11 = field1886[var5];
            int var12 = field1872[var5];
            int var13 = this.field1845[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1840[var10 - var8];
                field1882[var4] = (((field1886[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1883[var4] = (((field1872[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1884[var4++] = ((this.field1847[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1840[var9 - var8];
                field1882[var4] = (((field1886[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1883[var4] = (((field1872[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1884[var4++] = ((this.field1846[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1882[var4] = field1868[var6];
            field1883[var4] = field1869[var6];
            field1884[var4++] = this.field1846[arg0];
        } else {
            int var16 = field1886[var6];
            int var17 = field1872[var6];
            int var18 = this.field1846[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1840[var8 - var9];
                field1882[var4] = (((field1886[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1883[var4] = (((field1872[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1884[var4++] = ((this.field1845[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1840[var10 - var9];
                field1882[var4] = (((field1886[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1883[var4] = (((field1872[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1884[var4++] = ((this.field1847[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1882[var4] = field1868[var7];
            field1883[var4] = field1869[var7];
            field1884[var4++] = this.field1847[arg0];
        } else {
            int var21 = field1886[var7];
            int var22 = field1872[var7];
            int var23 = this.field1847[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1840[var9 - var10];
                field1882[var4] = (((field1886[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1883[var4] = (((field1872[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1884[var4++] = ((this.field1846[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1840[var8 - var10];
                field1882[var4] = (((field1886[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1883[var4] = (((field1872[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1884[var4++] = ((this.field1845[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1882[0];
        int var27 = field1882[1];
        int var28 = field1882[2];
        int var29 = field1883[0];
        int var30 = field1883[1];
        int var31 = field1883[2];
        class104.field1743 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1742 || var27 > Statics.field1742 || var28 > Statics.field1742) {
                class104.field1743 = true;
            }
            if (this.field1890 != null && this.field1890[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1850 == null || this.field1850[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1850[arg0] & 0xFF;
                    var33 = this.field1854[var32];
                    var34 = this.field1833[var32];
                    var35 = this.field1856[var32];
                }
                if (this.field1847[arg0] == -1) {
                    class104.method2093(var29, var30, var31, var26, var27, var28, this.field1845[arg0], this.field1845[arg0], this.field1845[arg0], field1886[var33], field1886[var34], field1886[var35], field1872[var33], field1872[var34], field1872[var35], field1862[var33], field1862[var34], field1862[var35], this.field1890[arg0]);
                } else {
                    class104.method2093(var29, var30, var31, var26, var27, var28, field1884[0], field1884[1], field1884[2], field1886[var33], field1886[var34], field1886[var35], field1872[var33], field1872[var34], field1872[var35], field1862[var33], field1862[var34], field1862[var35], this.field1890[arg0]);
                }
            } else if (this.field1847[arg0] == -1) {
                class104.method2091(var29, var30, var31, var26, var27, var28, field1895[this.field1845[arg0]]);
            } else {
                class104.method2089(var29, var30, var31, var26, var27, var28, field1884[0], field1884[1], field1884[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1742 || var27 > Statics.field1742 || var28 > Statics.field1742 || field1882[3] < 0 || field1882[3] > Statics.field1742) {
            class104.field1743 = true;
        }
        if (this.field1890 != null && this.field1890[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1850 == null || this.field1850[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1850[arg0] & 0xFF;
                var37 = this.field1854[var36];
                var38 = this.field1833[var36];
                var39 = this.field1856[var36];
            }
            short var40 = this.field1890[arg0];
            if (this.field1847[arg0] == -1) {
                class104.method2093(var29, var30, var31, var26, var27, var28, this.field1845[arg0], this.field1845[arg0], this.field1845[arg0], field1886[var37], field1886[var38], field1886[var39], field1872[var37], field1872[var38], field1872[var39], field1862[var37], field1862[var38], field1862[var39], var40);
                class104.method2093(var29, var31, field1883[3], var26, var28, field1882[3], this.field1845[arg0], this.field1845[arg0], this.field1845[arg0], field1886[var37], field1886[var38], field1886[var39], field1872[var37], field1872[var38], field1872[var39], field1862[var37], field1862[var38], field1862[var39], var40);
            } else {
                class104.method2093(var29, var30, var31, var26, var27, var28, field1884[0], field1884[1], field1884[2], field1886[var37], field1886[var38], field1886[var39], field1872[var37], field1872[var38], field1872[var39], field1862[var37], field1862[var38], field1862[var39], var40);
                class104.method2093(var29, var31, field1883[3], var26, var28, field1882[3], field1884[0], field1884[2], field1884[3], field1886[var37], field1886[var38], field1886[var39], field1872[var37], field1872[var38], field1872[var39], field1862[var37], field1862[var38], field1862[var39], var40);
            }
        } else if (this.field1847[arg0] == -1) {
            int var41 = field1895[this.field1845[arg0]];
            class104.method2091(var29, var30, var31, var26, var27, var28, var41);
            class104.method2091(var29, var31, field1883[3], var26, var28, field1882[3], var41);
        } else {
            class104.method2089(var29, var30, var31, var26, var27, var28, field1884[0], field1884[1], field1884[2]);
            class104.method2089(var29, var31, field1883[3], var26, var28, field1882[3], field1884[0], field1884[2], field1884[3]);
        }
    }

    @ObfuscatedName("dw.ah(IIIIIIII)Z")
    public final boolean method2196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
