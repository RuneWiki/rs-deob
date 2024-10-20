package deob;

@ObfuscatedName("di")
public class class112 extends class94 {

    @ObfuscatedName("di.x")
    public static class112 field1891 = new class112();

    @ObfuscatedName("di.p")
    public static byte[] field1829 = new byte[1];

    @ObfuscatedName("di.k")
    public static class112 field1830 = new class112();

    @ObfuscatedName("di.a")
    public static byte[] field1831 = new byte[1];

    @ObfuscatedName("di.q")
    public int field1832 = 0;

    @ObfuscatedName("di.j")
    public int[] field1839;

    @ObfuscatedName("di.v")
    public int[] field1834;

    @ObfuscatedName("di.w")
    public int[] field1872;

    @ObfuscatedName("di.l")
    public int field1844 = 0;

    @ObfuscatedName("di.s")
    public int[] field1837;

    @ObfuscatedName("di.n")
    public int[] field1838;

    @ObfuscatedName("di.c")
    public int[] field1849;

    @ObfuscatedName("di.h")
    public int[] field1885;

    @ObfuscatedName("di.u")
    public int[] field1841;

    @ObfuscatedName("di.y")
    public int[] field1842;

    @ObfuscatedName("di.b")
    public byte[] field1843;

    @ObfuscatedName("di.t")
    public byte[] field1878;

    @ObfuscatedName("di.r")
    public byte[] field1845;

    @ObfuscatedName("di.g")
    public short[] field1846;

    @ObfuscatedName("di.m")
    public byte field1847 = 0;

    @ObfuscatedName("di.o")
    public int field1889 = 0;

    @ObfuscatedName("di.e")
    public int[] field1871;

    @ObfuscatedName("di.f")
    public int[] field1888;

    @ObfuscatedName("di.i")
    public int[] field1848;

    @ObfuscatedName("di.d")
    public int[][] field1877;

    @ObfuscatedName("di.z")
    public int[][] field1853;

    @ObfuscatedName("di.ai")
    public boolean field1854 = false;

    @ObfuscatedName("di.ag")
    public int field1855;

    @ObfuscatedName("di.as")
    public int field1856;

    @ObfuscatedName("di.al")
    public int field1857;

    @ObfuscatedName("di.aj")
    public int field1858;

    @ObfuscatedName("di.am")
    public int field1859;

    @ObfuscatedName("di.ao")
    public static boolean[] field1852 = new boolean[4096];

    @ObfuscatedName("di.ac")
    public static boolean[] field1862 = new boolean[4096];

    @ObfuscatedName("di.ap")
    public static int[] field1836 = new int[4096];

    @ObfuscatedName("di.at")
    public static int[] field1864 = new int[4096];

    @ObfuscatedName("di.az")
    public static int[] field1865 = new int[4096];

    @ObfuscatedName("di.ae")
    public static int[] field1866 = new int[4096];

    @ObfuscatedName("di.ad")
    public static int[] field1867 = new int[4096];

    @ObfuscatedName("di.aw")
    public static int[] field1868 = new int[4096];

    @ObfuscatedName("di.aq")
    public static int[] field1850 = new int[1600];

    @ObfuscatedName("di.ax")
    public static int[][] field1892 = new int[1600][512];

    @ObfuscatedName("di.af")
    public static int[] field1882 = new int[12];

    @ObfuscatedName("di.ar")
    public static int[][] field1873 = new int[12][2000];

    @ObfuscatedName("di.ay")
    public static int[] field1851 = new int[2000];

    @ObfuscatedName("di.au")
    public static int[] field1875 = new int[2000];

    @ObfuscatedName("di.ak")
    public static int[] field1874 = new int[12];

    @ObfuscatedName("di.aa")
    public static int[] field1861 = new int[10];

    @ObfuscatedName("di.av")
    public static int[] field1828 = new int[10];

    @ObfuscatedName("di.ah")
    public static int[] field1870 = new int[10];

    @ObfuscatedName("di.bc")
    public static boolean field1883 = false;

    @ObfuscatedName("di.bi")
    public static int field1884 = 0;

    @ObfuscatedName("di.bd")
    public static int field1835 = 0;

    @ObfuscatedName("di.bv")
    public static int field1886 = 0;

    @ObfuscatedName("di.bs")
    public static int[] field1887 = new int[1000];

    @ObfuscatedName("di.be")
    public static int[] field1840 = class104.field1752;

    @ObfuscatedName("di.bu")
    public static int[] field1860 = class104.field1731;

    @ObfuscatedName("di.bj")
    public static int[] field1890 = class104.field1748;

    @ObfuscatedName("di.bh")
    public static int[] field1876 = class104.field1735;

    public class112() {
    }

    public class112(class112[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1832 = 0;
        this.field1844 = 0;
        this.field1889 = 0;
        this.field1847 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class112 var8 = arg0[var7];
            if (var8 != null) {
                this.field1832 += var8.field1832;
                this.field1844 += var8.field1844;
                this.field1889 += var8.field1889;
                if (var8.field1843 == null) {
                    if (this.field1847 == -1) {
                        this.field1847 = var8.field1847;
                    }
                    if (this.field1847 != var8.field1847) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1878 != null;
                var5 |= var8.field1846 != null;
                var6 |= var8.field1845 != null;
            }
        }
        this.field1839 = new int[this.field1832];
        this.field1834 = new int[this.field1832];
        this.field1872 = new int[this.field1832];
        this.field1837 = new int[this.field1844];
        this.field1838 = new int[this.field1844];
        this.field1849 = new int[this.field1844];
        this.field1885 = new int[this.field1844];
        this.field1841 = new int[this.field1844];
        this.field1842 = new int[this.field1844];
        if (var3) {
            this.field1843 = new byte[this.field1844];
        }
        if (var4) {
            this.field1878 = new byte[this.field1844];
        }
        if (var5) {
            this.field1846 = new short[this.field1844];
        }
        if (var6) {
            this.field1845 = new byte[this.field1844];
        }
        if (this.field1889 > 0) {
            this.field1871 = new int[this.field1889];
            this.field1888 = new int[this.field1889];
            this.field1848 = new int[this.field1889];
        }
        this.field1832 = 0;
        this.field1844 = 0;
        this.field1889 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class112 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1844; var11++) {
                    this.field1837[this.field1844] = var10.field1837[var11] + this.field1832;
                    this.field1838[this.field1844] = var10.field1838[var11] + this.field1832;
                    this.field1849[this.field1844] = var10.field1849[var11] + this.field1832;
                    this.field1885[this.field1844] = var10.field1885[var11];
                    this.field1841[this.field1844] = var10.field1841[var11];
                    this.field1842[this.field1844] = var10.field1842[var11];
                    if (var3) {
                        if (var10.field1843 == null) {
                            this.field1843[this.field1844] = var10.field1847;
                        } else {
                            this.field1843[this.field1844] = var10.field1843[var11];
                        }
                    }
                    if (var4 && var10.field1878 != null) {
                        this.field1878[this.field1844] = var10.field1878[var11];
                    }
                    if (var5) {
                        if (var10.field1846 == null) {
                            this.field1846[this.field1844] = -1;
                        } else {
                            this.field1846[this.field1844] = var10.field1846[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1845 == null || var10.field1845[var11] == -1) {
                            this.field1845[this.field1844] = -1;
                        } else {
                            this.field1845[this.field1844] = (byte) (var10.field1845[var11] + this.field1889);
                        }
                    }
                    this.field1844++;
                }
                for (int var12 = 0; var12 < var10.field1889; var12++) {
                    this.field1871[this.field1889] = var10.field1871[var12] + this.field1832;
                    this.field1888[this.field1889] = var10.field1888[var12] + this.field1832;
                    this.field1848[this.field1889] = var10.field1848[var12] + this.field1832;
                    this.field1889++;
                }
                for (int var13 = 0; var13 < var10.field1832; var13++) {
                    this.field1839[this.field1832] = var10.field1839[var13];
                    this.field1834[this.field1832] = var10.field1834[var13];
                    this.field1872[this.field1832] = var10.field1872[var13];
                    this.field1832++;
                }
            }
        }
    }

    @ObfuscatedName("di.x([[IIIIZI)Ldi;")
    public class112 method2235(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2242();
        int var7 = arg1 - this.field1857;
        int var8 = this.field1857 + arg1;
        int var9 = arg3 - this.field1857;
        int var10 = this.field1857 + arg3;
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
            var15.field1832 = this.field1832;
            var15.field1844 = this.field1844;
            var15.field1889 = this.field1889;
            var15.field1839 = this.field1839;
            var15.field1872 = this.field1872;
            var15.field1837 = this.field1837;
            var15.field1838 = this.field1838;
            var15.field1849 = this.field1849;
            var15.field1885 = this.field1885;
            var15.field1841 = this.field1841;
            var15.field1842 = this.field1842;
            var15.field1843 = this.field1843;
            var15.field1878 = this.field1878;
            var15.field1845 = this.field1845;
            var15.field1846 = this.field1846;
            var15.field1847 = this.field1847;
            var15.field1871 = this.field1871;
            var15.field1888 = this.field1888;
            var15.field1848 = this.field1848;
            var15.field1877 = this.field1877;
            var15.field1853 = this.field1853;
            var15.field1854 = this.field1854;
            var15.field1834 = new int[var15.field1832];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1832; var16++) {
                int var17 = this.field1839[var16] + arg1;
                int var18 = this.field1872[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1834[var16] = this.field1834[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1832; var26++) {
                int var27 = (-this.field1834[var26] << 16) / this.field1524;
                if (var27 < arg5) {
                    int var28 = this.field1839[var26] + arg1;
                    int var29 = this.field1872[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1834[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1834[var26];
                }
            }
        }
        var15.field1855 = 0;
        return var15;
    }

    @ObfuscatedName("di.k(Z)Ldi;")
    public class112 method2207(boolean arg0) {
        if (!arg0 && field1829.length < this.field1844) {
            field1829 = new byte[this.field1844 + 100];
        }
        return this.method2194(arg0, field1891, field1829);
    }

    @ObfuscatedName("di.v(Z)Ldi;")
    public class112 method2193(boolean arg0) {
        if (!arg0 && field1831.length < this.field1844) {
            field1831 = new byte[this.field1844 + 100];
        }
        return this.method2194(arg0, field1830, field1831);
    }

    @ObfuscatedName("di.w(ZLdi;[B)Ldi;")
    public class112 method2194(boolean arg0, class112 arg1, byte[] arg2) {
        arg1.field1832 = this.field1832;
        arg1.field1844 = this.field1844;
        arg1.field1889 = this.field1889;
        if (arg1.field1839 == null || arg1.field1839.length < this.field1832) {
            arg1.field1839 = new int[this.field1832 + 100];
            arg1.field1834 = new int[this.field1832 + 100];
            arg1.field1872 = new int[this.field1832 + 100];
        }
        for (int var4 = 0; var4 < this.field1832; var4++) {
            arg1.field1839[var4] = this.field1839[var4];
            arg1.field1834[var4] = this.field1834[var4];
            arg1.field1872[var4] = this.field1872[var4];
        }
        if (arg0) {
            arg1.field1878 = this.field1878;
        } else {
            arg1.field1878 = arg2;
            if (this.field1878 == null) {
                for (int var5 = 0; var5 < this.field1844; var5++) {
                    arg1.field1878[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1844; var6++) {
                    arg1.field1878[var6] = this.field1878[var6];
                }
            }
        }
        arg1.field1837 = this.field1837;
        arg1.field1838 = this.field1838;
        arg1.field1849 = this.field1849;
        arg1.field1885 = this.field1885;
        arg1.field1841 = this.field1841;
        arg1.field1842 = this.field1842;
        arg1.field1843 = this.field1843;
        arg1.field1845 = this.field1845;
        arg1.field1846 = this.field1846;
        arg1.field1847 = this.field1847;
        arg1.field1871 = this.field1871;
        arg1.field1888 = this.field1888;
        arg1.field1848 = this.field1848;
        arg1.field1877 = this.field1877;
        arg1.field1853 = this.field1853;
        arg1.field1854 = this.field1854;
        arg1.field1855 = 0;
        return arg1;
    }

    @ObfuscatedName("di.l()V")
    public void method2242() {
        if (this.field1855 == 1) {
            return;
        }
        this.field1855 = 1;
        this.field1524 = 0;
        this.field1856 = 0;
        this.field1857 = 0;
        for (int var1 = 0; var1 < this.field1832; var1++) {
            int var2 = this.field1839[var1];
            int var3 = this.field1834[var1];
            int var4 = this.field1872[var1];
            if (-var3 > this.field1524) {
                this.field1524 = -var3;
            }
            if (var3 > this.field1856) {
                this.field1856 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1857) {
                this.field1857 = var5;
            }
        }
        this.field1857 = (int) (Math.sqrt((double) this.field1857) + 0.99D);
        this.field1859 = (int) (Math.sqrt((double) (this.field1524 * this.field1524 + this.field1857 * this.field1857)) + 0.99D);
        this.field1858 = this.field1859 + (int) (Math.sqrt((double) (this.field1857 * this.field1857 + this.field1856 * this.field1856)) + 0.99D);
    }

    @ObfuscatedName("di.s()V")
    public void method2195() {
        if (this.field1855 == 2) {
            return;
        }
        this.field1855 = 2;
        this.field1857 = 0;
        for (int var1 = 0; var1 < this.field1832; var1++) {
            int var2 = this.field1839[var1];
            int var3 = this.field1834[var1];
            int var4 = this.field1872[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1857) {
                this.field1857 = var5;
            }
        }
        this.field1857 = (int) (Math.sqrt((double) this.field1857) + 0.99D);
        this.field1859 = this.field1857;
        this.field1858 = this.field1857 + this.field1857;
    }

    @ObfuscatedName("di.n()I")
    public int method2196() {
        this.method2242();
        return this.field1857;
    }

    @ObfuscatedName("di.c(Ldv;I)V")
    public void method2197(class109 arg0, int arg1) {
        if (this.field1877 == null || arg1 == -1) {
            return;
        }
        class97 var3 = arg0.field1789[arg1];
        class105 var4 = var3.field1606;
        Statics.field1833 = 0;
        Statics.field1881 = 0;
        Statics.field1879 = 0;
        for (int var5 = 0; var5 < var3.field1607; var5++) {
            int var6 = var3.field1608[var5];
            this.method2199(var4.field1756[var6], var4.field1757[var6], var3.field1609[var5], var3.field1611[var5], var3.field1612[var5]);
        }
        this.field1855 = 0;
    }

    @ObfuscatedName("di.h(Ldv;ILdv;I[I)V")
    public void method2198(class109 arg0, int arg1, class109 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2197(arg0, arg1);
            return;
        }
        class97 var6 = arg0.field1789[arg1];
        class97 var7 = arg2.field1789[arg3];
        class105 var8 = var6.field1606;
        Statics.field1833 = 0;
        Statics.field1881 = 0;
        Statics.field1879 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1607; var11++) {
            int var12 = var6.field1608[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1756[var12] == 0) {
                this.method2199(var8.field1756[var12], var8.field1757[var12], var6.field1609[var11], var6.field1611[var11], var6.field1612[var11]);
            }
        }
        Statics.field1833 = 0;
        Statics.field1881 = 0;
        Statics.field1879 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1607; var15++) {
            int var16 = var7.field1608[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1756[var16] == 0) {
                this.method2199(var8.field1756[var16], var8.field1757[var16], var7.field1609[var15], var7.field1611[var15], var7.field1612[var15]);
            }
        }
        this.field1855 = 0;
    }

    @ObfuscatedName("di.u(I[IIII)V")
    public void method2199(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1833 = 0;
            Statics.field1881 = 0;
            Statics.field1879 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1877.length) {
                    int[] var10 = this.field1877[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1833 += this.field1839[var12];
                        Statics.field1881 += this.field1834[var12];
                        Statics.field1879 += this.field1872[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1833 = Statics.field1833 / var7 + arg2;
                Statics.field1881 = Statics.field1881 / var7 + arg3;
                Statics.field1879 = Statics.field1879 / var7 + arg4;
            } else {
                Statics.field1833 = arg2;
                Statics.field1881 = arg3;
                Statics.field1879 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1877.length) {
                    int[] var15 = this.field1877[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1839[var17] += arg2;
                        this.field1834[var17] += arg3;
                        this.field1872[var17] += arg4;
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
                        this.field1839[var22] -= Statics.field1833;
                        this.field1834[var22] -= Statics.field1881;
                        this.field1872[var22] -= Statics.field1879;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1840[var25];
                            int var27 = field1860[var25];
                            int var28 = this.field1839[var22] * var27 + this.field1834[var22] * var26 >> 16;
                            this.field1834[var22] = this.field1834[var22] * var27 - this.field1839[var22] * var26 >> 16;
                            this.field1839[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1840[var23];
                            int var30 = field1860[var23];
                            int var31 = this.field1834[var22] * var30 - this.field1872[var22] * var29 >> 16;
                            this.field1872[var22] = this.field1872[var22] * var30 + this.field1834[var22] * var29 >> 16;
                            this.field1834[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1840[var24];
                            int var33 = field1860[var24];
                            int var34 = this.field1872[var22] * var32 + this.field1839[var22] * var33 >> 16;
                            this.field1872[var22] = this.field1872[var22] * var33 - this.field1839[var22] * var32 >> 16;
                            this.field1839[var22] = var34;
                        }
                        this.field1839[var22] += Statics.field1833;
                        this.field1834[var22] += Statics.field1881;
                        this.field1872[var22] += Statics.field1879;
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
                        this.field1839[var39] -= Statics.field1833;
                        this.field1834[var39] -= Statics.field1881;
                        this.field1872[var39] -= Statics.field1879;
                        this.field1839[var39] = this.field1839[var39] * arg2 / 128;
                        this.field1834[var39] = this.field1834[var39] * arg3 / 128;
                        this.field1872[var39] = this.field1872[var39] * arg4 / 128;
                        this.field1839[var39] += Statics.field1833;
                        this.field1834[var39] += Statics.field1881;
                        this.field1872[var39] += Statics.field1879;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1853 != null && this.field1878 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1853.length) {
                    int[] var42 = this.field1853[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1878[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1878[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("di.y()V")
    public void method2200() {
        for (int var1 = 0; var1 < this.field1832; var1++) {
            int var2 = this.field1839[var1];
            this.field1839[var1] = this.field1872[var1];
            this.field1872[var1] = -var2;
        }
        this.field1855 = 0;
    }

    @ObfuscatedName("di.b()V")
    public void method2201() {
        for (int var1 = 0; var1 < this.field1832; var1++) {
            this.field1839[var1] = -this.field1839[var1];
            this.field1872[var1] = -this.field1872[var1];
        }
        this.field1855 = 0;
    }

    @ObfuscatedName("di.t()V")
    public void method2202() {
        for (int var1 = 0; var1 < this.field1832; var1++) {
            int var2 = this.field1872[var1];
            this.field1872[var1] = this.field1839[var1];
            this.field1839[var1] = -var2;
        }
        this.field1855 = 0;
    }

    @ObfuscatedName("di.r(I)V")
    public void method2211(int arg0) {
        int var2 = field1840[arg0];
        int var3 = field1860[arg0];
        for (int var4 = 0; var4 < this.field1832; var4++) {
            int var5 = this.field1834[var4] * var3 - this.field1872[var4] * var2 >> 16;
            this.field1872[var4] = this.field1872[var4] * var3 + this.field1834[var4] * var2 >> 16;
            this.field1834[var4] = var5;
        }
        this.field1855 = 0;
    }

    @ObfuscatedName("di.g(III)V")
    public void method2230(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1832; var4++) {
            this.field1839[var4] += arg0;
            this.field1834[var4] += arg1;
            this.field1872[var4] += arg2;
        }
        this.field1855 = 0;
    }

    @ObfuscatedName("di.m(III)V")
    public void method2224(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1832; var4++) {
            this.field1839[var4] = this.field1839[var4] * arg0 / 128;
            this.field1834[var4] = this.field1834[var4] * arg1 / 128;
            this.field1872[var4] = this.field1872[var4] * arg2 / 128;
        }
        this.field1855 = 0;
    }

    @ObfuscatedName("di.o(IIIIIII)V")
    public final void method2205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1850[0] = -1;
        if (this.field1855 != 2 && this.field1855 != 1) {
            this.method2195();
        }
        int var8 = Statics.field1745;
        int var9 = Statics.field1740;
        int var10 = field1840[arg0];
        int var11 = field1860[arg0];
        int var12 = field1840[arg1];
        int var13 = field1860[arg1];
        int var14 = field1840[arg2];
        int var15 = field1860[arg2];
        int var16 = field1840[arg3];
        int var17 = field1860[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1832; var19++) {
            int var20 = this.field1839[var19];
            int var21 = this.field1834[var19];
            int var22 = this.field1872[var19];
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
            field1865[var19] = var30 - var18;
            field1836[var19] = (var26 << 9) / var30 + var8;
            field1864[var19] = (var29 << 9) / var30 + var9;
            if (this.field1889 > 0) {
                field1866[var19] = var26;
                field1867[var19] = var29;
                field1868[var19] = var30;
            }
        }
        try {
            this.method2241(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("di.e(IIIIIIII)V")
    public final void method2225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1850[0] = -1;
        if (this.field1855 != 2 && this.field1855 != 1) {
            this.method2195();
        }
        int var9 = Statics.field1745;
        int var10 = Statics.field1740;
        int var11 = field1840[arg0];
        int var12 = field1860[arg0];
        int var13 = field1840[arg1];
        int var14 = field1860[arg1];
        int var15 = field1840[arg2];
        int var16 = field1860[arg2];
        int var17 = field1840[arg3];
        int var18 = field1860[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1832; var20++) {
            int var21 = this.field1839[var20];
            int var22 = this.field1834[var20];
            int var23 = this.field1872[var20];
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
            field1865[var20] = var31 - var19;
            field1836[var20] = (var27 << 9) / arg7 + var9;
            field1864[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1889 > 0) {
                field1866[var20] = var27;
                field1867[var20] = var30;
                field1868[var20] = var31;
            }
        }
        try {
            this.method2241(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("di.ai(IIIIIIIII)V")
    public void method1811(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1850[0] = -1;
        if (this.field1855 != 1) {
            this.method2242();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1857 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1857 << 9;
        if (var15 / var13 >= Statics.field1744) {
            return;
        }
        int var16 = this.field1857 + var14 << 9;
        if (var16 / var13 <= Statics.field1743) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1857 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1733) {
            return;
        }
        int var20 = (this.field1524 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1746) {
            return;
        }
        int var22 = (this.field1524 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1889 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1883) {
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
            int var32 = field1884 - Statics.field1745;
            int var33 = field1835 - Statics.field1740;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1854) {
                    field1887[field1886++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1745;
        int var35 = Statics.field1740;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1840[arg0];
            var37 = field1860[arg0];
        }
        for (int var38 = 0; var38 < this.field1832; var38++) {
            int var39 = this.field1839[var38];
            int var40 = this.field1834[var38];
            int var41 = this.field1872[var38];
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
            field1865[var38] = var50 - var11;
            if (var50 >= 50) {
                field1836[var38] = (var46 << 9) / var50 + var34;
                field1864[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1836[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1866[var38] = var46;
                field1867[var38] = var49;
                field1868[var38] = var50;
            }
        }
        try {
            this.method2241(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("di.f(ZZI)V")
    public final void method2241(boolean arg0, boolean arg1, int arg2) {
        if (this.field1858 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1858; var4++) {
            field1850[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1844; var5++) {
            if (this.field1842[var5] != -2) {
                int var6 = this.field1837[var5];
                int var7 = this.field1838[var5];
                int var8 = this.field1849[var5];
                int var9 = field1836[var6];
                int var10 = field1836[var7];
                int var11 = field1836[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1866[var6];
                    int var13 = field1866[var7];
                    int var14 = field1866[var8];
                    int var15 = field1867[var6];
                    int var16 = field1867[var7];
                    int var17 = field1867[var8];
                    int var18 = field1868[var6];
                    int var19 = field1868[var7];
                    int var20 = field1868[var8];
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
                        field1862[var5] = true;
                        int var30 = (field1865[var6] + field1865[var7] + field1865[var8]) / 3 + this.field1859;
                        field1892[var30][field1850[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2223(field1884, field1835, field1864[var6], field1864[var7], field1864[var8], var9, var10, var11)) {
                        field1887[field1886++] = arg2;
                        arg1 = false;
                    }
                    if ((field1864[var8] - field1864[var7]) * (var9 - var10) - (field1864[var6] - field1864[var7]) * (var11 - var10) > 0) {
                        field1862[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1741 && var10 <= Statics.field1741 && var11 <= Statics.field1741) {
                            field1852[var5] = false;
                        } else {
                            field1852[var5] = true;
                        }
                        int var31 = (field1865[var6] + field1865[var7] + field1865[var8]) / 3 + this.field1859;
                        field1892[var31][field1850[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1843 == null) {
            for (int var32 = this.field1858 - 1; var32 >= 0; var32--) {
                int var33 = field1850[var32];
                if (var33 > 0) {
                    int[] var34 = field1892[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2208(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1882[var36] = 0;
            field1874[var36] = 0;
        }
        for (int var37 = this.field1858 - 1; var37 >= 0; var37--) {
            int var38 = field1850[var37];
            if (var38 > 0) {
                int[] var39 = field1892[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1843[var41];
                    int var43 = field1882[var42]++;
                    field1873[var42][var43] = var41;
                    if (var42 < 10) {
                        field1874[var42] += var37;
                    } else if (var42 == 10) {
                        field1851[var43] = var37;
                    } else {
                        field1875[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1882[1] > 0 || field1882[2] > 0) {
            var44 = (field1874[1] + field1874[2]) / (field1882[1] + field1882[2]);
        }
        int var45 = 0;
        if (field1882[3] > 0 || field1882[4] > 0) {
            var45 = (field1874[3] + field1874[4]) / (field1882[3] + field1882[4]);
        }
        int var46 = 0;
        if (field1882[6] > 0 || field1882[8] > 0) {
            var46 = (field1874[6] + field1874[8]) / (field1882[6] + field1882[8]);
        }
        int var47 = 0;
        int var48 = field1882[10];
        int[] var49 = field1873[10];
        int[] var50 = field1851;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1882[11];
            var49 = field1873[11];
            var50 = field1875;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2208(var49[var47++]);
                if (var47 == var48 && field1873[11] != var49) {
                    var47 = 0;
                    var48 = field1882[11];
                    var49 = field1873[11];
                    var50 = field1875;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2208(var49[var47++]);
                if (var47 == var48 && field1873[11] != var49) {
                    var47 = 0;
                    var48 = field1882[11];
                    var49 = field1873[11];
                    var50 = field1875;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2208(var49[var47++]);
                if (var47 == var48 && field1873[11] != var49) {
                    var47 = 0;
                    var48 = field1882[11];
                    var49 = field1873[11];
                    var50 = field1875;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1882[var52];
            int[] var54 = field1873[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2208(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2208(var49[var47++]);
            if (var47 == var48 && field1873[11] != var49) {
                var47 = 0;
                var49 = field1873[11];
                var48 = field1882[11];
                var50 = field1875;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("di.i(I)V")
    public final void method2208(int arg0) {
        if (field1862[arg0]) {
            this.method2209(arg0);
            return;
        }
        int var2 = this.field1837[arg0];
        int var3 = this.field1838[arg0];
        int var4 = this.field1849[arg0];
        class104.field1730 = field1852[arg0];
        if (this.field1878 == null) {
            class104.field1742 = 0;
        } else {
            class104.field1742 = this.field1878[arg0] & 0xFF;
        }
        if (this.field1846 != null && this.field1846[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1845 == null || this.field1845[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1845[arg0] & 0xFF;
                var6 = this.field1871[var5];
                var7 = this.field1888[var5];
                var8 = this.field1848[var5];
            }
            if (this.field1842[arg0] == -1) {
                class104.method2099(field1864[var2], field1864[var3], field1864[var4], field1836[var2], field1836[var3], field1836[var4], this.field1885[arg0], this.field1885[arg0], this.field1885[arg0], field1866[var6], field1866[var7], field1866[var8], field1867[var6], field1867[var7], field1867[var8], field1868[var6], field1868[var7], field1868[var8], this.field1846[arg0]);
            } else {
                class104.method2099(field1864[var2], field1864[var3], field1864[var4], field1836[var2], field1836[var3], field1836[var4], this.field1885[arg0], this.field1841[arg0], this.field1842[arg0], field1866[var6], field1866[var7], field1866[var8], field1867[var6], field1867[var7], field1867[var8], field1868[var6], field1868[var7], field1868[var8], this.field1846[arg0]);
            }
        } else if (this.field1842[arg0] == -1) {
            class104.method2097(field1864[var2], field1864[var3], field1864[var4], field1836[var2], field1836[var3], field1836[var4], field1890[this.field1885[arg0]]);
        } else {
            class104.method2104(field1864[var2], field1864[var3], field1864[var4], field1836[var2], field1836[var3], field1836[var4], this.field1885[arg0], this.field1841[arg0], this.field1842[arg0]);
        }
    }

    @ObfuscatedName("di.d(I)V")
    public final void method2209(int arg0) {
        int var2 = Statics.field1745;
        int var3 = Statics.field1740;
        int var4 = 0;
        int var5 = this.field1837[arg0];
        int var6 = this.field1838[arg0];
        int var7 = this.field1849[arg0];
        int var8 = field1868[var5];
        int var9 = field1868[var6];
        int var10 = field1868[var7];
        if (this.field1878 == null) {
            class104.field1742 = 0;
        } else {
            class104.field1742 = this.field1878[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1861[var4] = field1836[var5];
            field1828[var4] = field1864[var5];
            field1870[var4++] = this.field1885[arg0];
        } else {
            int var11 = field1866[var5];
            int var12 = field1867[var5];
            int var13 = this.field1885[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1876[var10 - var8];
                field1861[var4] = (((field1866[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1828[var4] = (((field1867[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1870[var4++] = ((this.field1842[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1876[var9 - var8];
                field1861[var4] = (((field1866[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1828[var4] = (((field1867[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1870[var4++] = ((this.field1841[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1861[var4] = field1836[var6];
            field1828[var4] = field1864[var6];
            field1870[var4++] = this.field1841[arg0];
        } else {
            int var16 = field1866[var6];
            int var17 = field1867[var6];
            int var18 = this.field1841[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1876[var8 - var9];
                field1861[var4] = (((field1866[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1828[var4] = (((field1867[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1870[var4++] = ((this.field1885[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1876[var10 - var9];
                field1861[var4] = (((field1866[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1828[var4] = (((field1867[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1870[var4++] = ((this.field1842[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1861[var4] = field1836[var7];
            field1828[var4] = field1864[var7];
            field1870[var4++] = this.field1842[arg0];
        } else {
            int var21 = field1866[var7];
            int var22 = field1867[var7];
            int var23 = this.field1842[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1876[var9 - var10];
                field1861[var4] = (((field1866[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1828[var4] = (((field1867[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1870[var4++] = ((this.field1841[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1876[var8 - var10];
                field1861[var4] = (((field1866[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1828[var4] = (((field1867[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1870[var4++] = ((this.field1885[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1861[0];
        int var27 = field1861[1];
        int var28 = field1861[2];
        int var29 = field1828[0];
        int var30 = field1828[1];
        int var31 = field1828[2];
        class104.field1730 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1741 || var27 > Statics.field1741 || var28 > Statics.field1741) {
                class104.field1730 = true;
            }
            if (this.field1846 != null && this.field1846[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1845 == null || this.field1845[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1845[arg0] & 0xFF;
                    var33 = this.field1871[var32];
                    var34 = this.field1888[var32];
                    var35 = this.field1848[var32];
                }
                if (this.field1842[arg0] == -1) {
                    class104.method2099(var29, var30, var31, var26, var27, var28, this.field1885[arg0], this.field1885[arg0], this.field1885[arg0], field1866[var33], field1866[var34], field1866[var35], field1867[var33], field1867[var34], field1867[var35], field1868[var33], field1868[var34], field1868[var35], this.field1846[arg0]);
                } else {
                    class104.method2099(var29, var30, var31, var26, var27, var28, field1870[0], field1870[1], field1870[2], field1866[var33], field1866[var34], field1866[var35], field1867[var33], field1867[var34], field1867[var35], field1868[var33], field1868[var34], field1868[var35], this.field1846[arg0]);
                }
            } else if (this.field1842[arg0] == -1) {
                class104.method2097(var29, var30, var31, var26, var27, var28, field1890[this.field1885[arg0]]);
            } else {
                class104.method2104(var29, var30, var31, var26, var27, var28, field1870[0], field1870[1], field1870[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1741 || var27 > Statics.field1741 || var28 > Statics.field1741 || field1861[3] < 0 || field1861[3] > Statics.field1741) {
            class104.field1730 = true;
        }
        if (this.field1846 != null && this.field1846[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1845 == null || this.field1845[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1845[arg0] & 0xFF;
                var37 = this.field1871[var36];
                var38 = this.field1888[var36];
                var39 = this.field1848[var36];
            }
            short var40 = this.field1846[arg0];
            if (this.field1842[arg0] == -1) {
                class104.method2099(var29, var30, var31, var26, var27, var28, this.field1885[arg0], this.field1885[arg0], this.field1885[arg0], field1866[var37], field1866[var38], field1866[var39], field1867[var37], field1867[var38], field1867[var39], field1868[var37], field1868[var38], field1868[var39], var40);
                class104.method2099(var29, var31, field1828[3], var26, var28, field1861[3], this.field1885[arg0], this.field1885[arg0], this.field1885[arg0], field1866[var37], field1866[var38], field1866[var39], field1867[var37], field1867[var38], field1867[var39], field1868[var37], field1868[var38], field1868[var39], var40);
            } else {
                class104.method2099(var29, var30, var31, var26, var27, var28, field1870[0], field1870[1], field1870[2], field1866[var37], field1866[var38], field1866[var39], field1867[var37], field1867[var38], field1867[var39], field1868[var37], field1868[var38], field1868[var39], var40);
                class104.method2099(var29, var31, field1828[3], var26, var28, field1861[3], field1870[0], field1870[2], field1870[3], field1866[var37], field1866[var38], field1866[var39], field1867[var37], field1867[var38], field1867[var39], field1868[var37], field1868[var38], field1868[var39], var40);
            }
        } else if (this.field1842[arg0] == -1) {
            int var41 = field1890[this.field1885[arg0]];
            class104.method2097(var29, var30, var31, var26, var27, var28, var41);
            class104.method2097(var29, var31, field1828[3], var26, var28, field1861[3], var41);
        } else {
            class104.method2104(var29, var30, var31, var26, var27, var28, field1870[0], field1870[1], field1870[2]);
            class104.method2104(var29, var31, field1828[3], var26, var28, field1861[3], field1870[0], field1870[2], field1870[3]);
        }
    }

    @ObfuscatedName("di.z(IIIIIIII)Z")
    public final boolean method2223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
