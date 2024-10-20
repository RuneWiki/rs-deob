package deob;

@ObfuscatedName("dh")
public class class106 extends class86 {

    @ObfuscatedName("dh.s")
    public static class106 field1823 = new class106();

    @ObfuscatedName("dh.j")
    public static byte[] field1836 = new byte[1];

    @ObfuscatedName("dh.p")
    public static class106 field1846 = new class106();

    @ObfuscatedName("dh.x")
    public static byte[] field1812 = new byte[1];

    @ObfuscatedName("dh.d")
    public int field1813 = 0;

    @ObfuscatedName("dh.u")
    public int[] field1814;

    @ObfuscatedName("dh.o")
    public int[] field1840;

    @ObfuscatedName("dh.b")
    public int[] field1816;

    @ObfuscatedName("dh.k")
    public int field1831 = 0;

    @ObfuscatedName("dh.c")
    public int[] field1818;

    @ObfuscatedName("dh.l")
    public int[] field1819;

    @ObfuscatedName("dh.t")
    public int[] field1810;

    @ObfuscatedName("dh.i")
    public int[] field1821;

    @ObfuscatedName("dh.r")
    public int[] field1822;

    @ObfuscatedName("dh.m")
    public int[] field1833;

    @ObfuscatedName("dh.e")
    public byte[] field1824;

    @ObfuscatedName("dh.h")
    public byte[] field1825;

    @ObfuscatedName("dh.z")
    public byte[] field1826;

    @ObfuscatedName("dh.a")
    public short[] field1847;

    @ObfuscatedName("dh.w")
    public byte field1854 = 0;

    @ObfuscatedName("dh.g")
    public int field1829 = 0;

    @ObfuscatedName("dh.y")
    public int[] field1827;

    @ObfuscatedName("dh.f")
    public int[] field1838;

    @ObfuscatedName("dh.q")
    public int[] field1832;

    @ObfuscatedName("dh.n")
    public int[][] field1860;

    @ObfuscatedName("dh.v")
    public int[][] field1834;

    @ObfuscatedName("dh.ab")
    public boolean field1835 = false;

    @ObfuscatedName("dh.ad")
    public int field1811;

    @ObfuscatedName("dh.an")
    public int field1837;

    @ObfuscatedName("dh.au")
    public int field1828;

    @ObfuscatedName("dh.ap")
    public int field1851;

    @ObfuscatedName("dh.am")
    public int field1867;

    @ObfuscatedName("dh.ao")
    public static boolean[] field1842 = new boolean[4700];

    @ObfuscatedName("dh.as")
    public static boolean[] field1843 = new boolean[4700];

    @ObfuscatedName("dh.ai")
    public static int[] field1844 = new int[4700];

    @ObfuscatedName("dh.ah")
    public static int[] field1845 = new int[4700];

    @ObfuscatedName("dh.ax")
    public static int[] field1820 = new int[4700];

    @ObfuscatedName("dh.aa")
    public static int[] field1852 = new int[4700];

    @ObfuscatedName("dh.aq")
    public static int[] field1830 = new int[4700];

    @ObfuscatedName("dh.ay")
    public static int[] field1849 = new int[4700];

    @ObfuscatedName("dh.ar")
    public static int[] field1853 = new int[1600];

    @ObfuscatedName("dh.aw")
    public static int[][] field1839 = new int[1600][512];

    @ObfuscatedName("dh.at")
    public static int[] field1817 = new int[12];

    @ObfuscatedName("dh.af")
    public static int[][] field1857 = new int[12][2000];

    @ObfuscatedName("dh.al")
    public static int[] field1855 = new int[2000];

    @ObfuscatedName("dh.ag")
    public static int[] field1856 = new int[2000];

    @ObfuscatedName("dh.ac")
    public static int[] field1815 = new int[12];

    @ObfuscatedName("dh.ak")
    public static int[] field1858 = new int[10];

    @ObfuscatedName("dh.av")
    public static int[] field1859 = new int[10];

    @ObfuscatedName("dh.az")
    public static int[] field1848 = new int[10];

    @ObfuscatedName("dh.bj")
    public static boolean field1864 = false;

    @ObfuscatedName("dh.bf")
    public static int field1865 = 0;

    @ObfuscatedName("dh.br")
    public static int field1866 = 0;

    @ObfuscatedName("dh.bi")
    public static int field1809 = 0;

    @ObfuscatedName("dh.bh")
    public static int[] field1868 = new int[1000];

    @ObfuscatedName("dh.bv")
    public static int[] field1869 = class92.field1597;

    @ObfuscatedName("dh.bx")
    public static int[] field1870 = class92.field1598;

    @ObfuscatedName("dh.ba")
    public static int[] field1871 = class92.field1581;

    @ObfuscatedName("dh.bs")
    public static int[] field1872 = class92.field1596;

    public class106() {
    }

    public class106(class106[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1813 = 0;
        this.field1831 = 0;
        this.field1829 = 0;
        this.field1854 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class106 var8 = arg0[var7];
            if (var8 != null) {
                this.field1813 += var8.field1813;
                this.field1831 += var8.field1831;
                this.field1829 += var8.field1829;
                if (var8.field1824 == null) {
                    if (this.field1854 == -1) {
                        this.field1854 = var8.field1854;
                    }
                    if (this.field1854 != var8.field1854) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1825 != null;
                var5 |= var8.field1847 != null;
                var6 |= var8.field1826 != null;
            }
        }
        this.field1814 = new int[this.field1813];
        this.field1840 = new int[this.field1813];
        this.field1816 = new int[this.field1813];
        this.field1818 = new int[this.field1831];
        this.field1819 = new int[this.field1831];
        this.field1810 = new int[this.field1831];
        this.field1821 = new int[this.field1831];
        this.field1822 = new int[this.field1831];
        this.field1833 = new int[this.field1831];
        if (var3) {
            this.field1824 = new byte[this.field1831];
        }
        if (var4) {
            this.field1825 = new byte[this.field1831];
        }
        if (var5) {
            this.field1847 = new short[this.field1831];
        }
        if (var6) {
            this.field1826 = new byte[this.field1831];
        }
        if (this.field1829 > 0) {
            this.field1827 = new int[this.field1829];
            this.field1838 = new int[this.field1829];
            this.field1832 = new int[this.field1829];
        }
        this.field1813 = 0;
        this.field1831 = 0;
        this.field1829 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class106 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1831; var11++) {
                    this.field1818[this.field1831] = var10.field1818[var11] + this.field1813;
                    this.field1819[this.field1831] = var10.field1819[var11] + this.field1813;
                    this.field1810[this.field1831] = var10.field1810[var11] + this.field1813;
                    this.field1821[this.field1831] = var10.field1821[var11];
                    this.field1822[this.field1831] = var10.field1822[var11];
                    this.field1833[this.field1831] = var10.field1833[var11];
                    if (var3) {
                        if (var10.field1824 == null) {
                            this.field1824[this.field1831] = var10.field1854;
                        } else {
                            this.field1824[this.field1831] = var10.field1824[var11];
                        }
                    }
                    if (var4 && var10.field1825 != null) {
                        this.field1825[this.field1831] = var10.field1825[var11];
                    }
                    if (var5) {
                        if (var10.field1847 == null) {
                            this.field1847[this.field1831] = -1;
                        } else {
                            this.field1847[this.field1831] = var10.field1847[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1826 == null || var10.field1826[var11] == -1) {
                            this.field1826[this.field1831] = -1;
                        } else {
                            this.field1826[this.field1831] = (byte) (var10.field1826[var11] + this.field1829);
                        }
                    }
                    this.field1831++;
                }
                for (int var12 = 0; var12 < var10.field1829; var12++) {
                    this.field1827[this.field1829] = var10.field1827[var12] + this.field1813;
                    this.field1838[this.field1829] = var10.field1838[var12] + this.field1813;
                    this.field1832[this.field1829] = var10.field1832[var12] + this.field1813;
                    this.field1829++;
                }
                for (int var13 = 0; var13 < var10.field1813; var13++) {
                    this.field1814[this.field1813] = var10.field1814[var13];
                    this.field1840[this.field1813] = var10.field1840[var13];
                    this.field1816[this.field1813] = var10.field1816[var13];
                    this.field1813++;
                }
            }
        }
    }

    @ObfuscatedName("dh.s([[IIIIZI)Ldh;")
    public class106 method2141(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2145();
        int var7 = arg1 - this.field1828;
        int var8 = this.field1828 + arg1;
        int var9 = arg3 - this.field1828;
        int var10 = this.field1828 + arg3;
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
        class106 var15;
        if (arg4) {
            var15 = new class106();
            var15.field1813 = this.field1813;
            var15.field1831 = this.field1831;
            var15.field1829 = this.field1829;
            var15.field1814 = this.field1814;
            var15.field1816 = this.field1816;
            var15.field1818 = this.field1818;
            var15.field1819 = this.field1819;
            var15.field1810 = this.field1810;
            var15.field1821 = this.field1821;
            var15.field1822 = this.field1822;
            var15.field1833 = this.field1833;
            var15.field1824 = this.field1824;
            var15.field1825 = this.field1825;
            var15.field1826 = this.field1826;
            var15.field1847 = this.field1847;
            var15.field1854 = this.field1854;
            var15.field1827 = this.field1827;
            var15.field1838 = this.field1838;
            var15.field1832 = this.field1832;
            var15.field1860 = this.field1860;
            var15.field1834 = this.field1834;
            var15.field1835 = this.field1835;
            var15.field1840 = new int[var15.field1813];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1813; var16++) {
                int var17 = this.field1814[var16] + arg1;
                int var18 = this.field1816[var16] + arg3;
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
            for (int var26 = 0; var26 < var15.field1813; var26++) {
                int var27 = (-this.field1840[var26] << 16) / this.field1466;
                if (var27 < arg5) {
                    int var28 = this.field1814[var26] + arg1;
                    int var29 = this.field1816[var26] + arg3;
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
        var15.field1811 = 0;
        return var15;
    }

    @ObfuscatedName("dh.j(Z)Ldh;")
    public class106 method2142(boolean arg0) {
        if (!arg0 && field1836.length < this.field1831) {
            field1836 = new byte[this.field1831 + 100];
        }
        return this.method2144(arg0, field1823, field1836);
    }

    @ObfuscatedName("dh.x(Z)Ldh;")
    public class106 method2143(boolean arg0) {
        if (!arg0 && field1812.length < this.field1831) {
            field1812 = new byte[this.field1831 + 100];
        }
        return this.method2144(arg0, field1846, field1812);
    }

    @ObfuscatedName("dh.d(ZLdh;[B)Ldh;")
    public class106 method2144(boolean arg0, class106 arg1, byte[] arg2) {
        arg1.field1813 = this.field1813;
        arg1.field1831 = this.field1831;
        arg1.field1829 = this.field1829;
        if (arg1.field1814 == null || arg1.field1814.length < this.field1813) {
            arg1.field1814 = new int[this.field1813 + 100];
            arg1.field1840 = new int[this.field1813 + 100];
            arg1.field1816 = new int[this.field1813 + 100];
        }
        for (int var4 = 0; var4 < this.field1813; var4++) {
            arg1.field1814[var4] = this.field1814[var4];
            arg1.field1840[var4] = this.field1840[var4];
            arg1.field1816[var4] = this.field1816[var4];
        }
        if (arg0) {
            arg1.field1825 = this.field1825;
        } else {
            arg1.field1825 = arg2;
            if (this.field1825 == null) {
                for (int var5 = 0; var5 < this.field1831; var5++) {
                    arg1.field1825[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1831; var6++) {
                    arg1.field1825[var6] = this.field1825[var6];
                }
            }
        }
        arg1.field1818 = this.field1818;
        arg1.field1819 = this.field1819;
        arg1.field1810 = this.field1810;
        arg1.field1821 = this.field1821;
        arg1.field1822 = this.field1822;
        arg1.field1833 = this.field1833;
        arg1.field1824 = this.field1824;
        arg1.field1826 = this.field1826;
        arg1.field1847 = this.field1847;
        arg1.field1854 = this.field1854;
        arg1.field1827 = this.field1827;
        arg1.field1838 = this.field1838;
        arg1.field1832 = this.field1832;
        arg1.field1860 = this.field1860;
        arg1.field1834 = this.field1834;
        arg1.field1835 = this.field1835;
        arg1.field1811 = 0;
        return arg1;
    }

    @ObfuscatedName("dh.u()V")
    public void method2145() {
        if (this.field1811 == 1) {
            return;
        }
        this.field1811 = 1;
        this.field1466 = 0;
        this.field1837 = 0;
        this.field1828 = 0;
        for (int var1 = 0; var1 < this.field1813; var1++) {
            int var2 = this.field1814[var1];
            int var3 = this.field1840[var1];
            int var4 = this.field1816[var1];
            if (-var3 > this.field1466) {
                this.field1466 = -var3;
            }
            if (var3 > this.field1837) {
                this.field1837 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1828) {
                this.field1828 = var5;
            }
        }
        this.field1828 = (int) (Math.sqrt((double) this.field1828) + 0.99D);
        this.field1867 = (int) (Math.sqrt((double) (this.field1466 * this.field1466 + this.field1828 * this.field1828)) + 0.99D);
        this.field1851 = this.field1867 + (int) (Math.sqrt((double) (this.field1837 * this.field1837 + this.field1828 * this.field1828)) + 0.99D);
    }

    @ObfuscatedName("dh.o()V")
    public void method2164() {
        if (this.field1811 == 2) {
            return;
        }
        this.field1811 = 2;
        this.field1828 = 0;
        for (int var1 = 0; var1 < this.field1813; var1++) {
            int var2 = this.field1814[var1];
            int var3 = this.field1840[var1];
            int var4 = this.field1816[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1828) {
                this.field1828 = var5;
            }
        }
        this.field1828 = (int) (Math.sqrt((double) this.field1828) + 0.99D);
        this.field1867 = this.field1828;
        this.field1851 = this.field1828 + this.field1828;
    }

    @ObfuscatedName("dh.b()I")
    public int method2147() {
        this.method2145();
        return this.field1828;
    }

    @ObfuscatedName("dh.k(Lcx;I)V")
    public void method2148(class104 arg0, int arg1) {
        if (this.field1860 == null || arg1 == -1) {
            return;
        }
        class89 var3 = arg0.field1779[arg1];
        class103 var4 = var3.field1549;
        Statics.field1861 = 0;
        Statics.field1862 = 0;
        Statics.field1863 = 0;
        for (int var5 = 0; var5 < var3.field1548; var5++) {
            int var6 = var3.field1546[var5];
            this.method2150(var4.field1774[var6], var4.field1772[var6], var3.field1552[var5], var3.field1545[var5], var3.field1554[var5]);
        }
        this.field1811 = 0;
    }

    @ObfuscatedName("dh.c(Lcx;ILcx;I[I)V")
    public void method2163(class104 arg0, int arg1, class104 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2148(arg0, arg1);
            return;
        }
        class89 var6 = arg0.field1779[arg1];
        class89 var7 = arg2.field1779[arg3];
        class103 var8 = var6.field1549;
        Statics.field1861 = 0;
        Statics.field1862 = 0;
        Statics.field1863 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1548; var11++) {
            int var12 = var6.field1546[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1774[var12] == 0) {
                this.method2150(var8.field1774[var12], var8.field1772[var12], var6.field1552[var11], var6.field1545[var11], var6.field1554[var11]);
            }
        }
        Statics.field1861 = 0;
        Statics.field1862 = 0;
        Statics.field1863 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1548; var15++) {
            int var16 = var7.field1546[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1774[var16] == 0) {
                this.method2150(var8.field1774[var16], var8.field1772[var16], var7.field1552[var15], var7.field1545[var15], var7.field1554[var15]);
            }
        }
        this.field1811 = 0;
    }

    @ObfuscatedName("dh.l(I[IIII)V")
    public void method2150(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1861 = 0;
            Statics.field1862 = 0;
            Statics.field1863 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1860.length) {
                    int[] var10 = this.field1860[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1861 += this.field1814[var12];
                        Statics.field1862 += this.field1840[var12];
                        Statics.field1863 += this.field1816[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1861 = Statics.field1861 / var7 + arg2;
                Statics.field1862 = Statics.field1862 / var7 + arg3;
                Statics.field1863 = Statics.field1863 / var7 + arg4;
            } else {
                Statics.field1861 = arg2;
                Statics.field1862 = arg3;
                Statics.field1863 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1860.length) {
                    int[] var15 = this.field1860[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1814[var17] += arg2;
                        this.field1840[var17] += arg3;
                        this.field1816[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1860.length) {
                    int[] var20 = this.field1860[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1814[var22] -= Statics.field1861;
                        this.field1840[var22] -= Statics.field1862;
                        this.field1816[var22] -= Statics.field1863;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1869[var25];
                            int var27 = field1870[var25];
                            int var28 = this.field1840[var22] * var26 + this.field1814[var22] * var27 >> 16;
                            this.field1840[var22] = this.field1840[var22] * var27 - this.field1814[var22] * var26 >> 16;
                            this.field1814[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1869[var23];
                            int var30 = field1870[var23];
                            int var31 = this.field1840[var22] * var30 - this.field1816[var22] * var29 >> 16;
                            this.field1816[var22] = this.field1840[var22] * var29 + this.field1816[var22] * var30 >> 16;
                            this.field1840[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1869[var24];
                            int var33 = field1870[var24];
                            int var34 = this.field1816[var22] * var32 + this.field1814[var22] * var33 >> 16;
                            this.field1816[var22] = this.field1816[var22] * var33 - this.field1814[var22] * var32 >> 16;
                            this.field1814[var22] = var34;
                        }
                        this.field1814[var22] += Statics.field1861;
                        this.field1840[var22] += Statics.field1862;
                        this.field1816[var22] += Statics.field1863;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1860.length) {
                    int[] var37 = this.field1860[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1814[var39] -= Statics.field1861;
                        this.field1840[var39] -= Statics.field1862;
                        this.field1816[var39] -= Statics.field1863;
                        this.field1814[var39] = this.field1814[var39] * arg2 / 128;
                        this.field1840[var39] = this.field1840[var39] * arg3 / 128;
                        this.field1816[var39] = this.field1816[var39] * arg4 / 128;
                        this.field1814[var39] += Statics.field1861;
                        this.field1840[var39] += Statics.field1862;
                        this.field1816[var39] += Statics.field1863;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1834 != null && this.field1825 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1834.length) {
                    int[] var42 = this.field1834[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1825[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1825[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dh.r()V")
    public void method2151() {
        for (int var1 = 0; var1 < this.field1813; var1++) {
            int var2 = this.field1814[var1];
            this.field1814[var1] = this.field1816[var1];
            this.field1816[var1] = -var2;
        }
        this.field1811 = 0;
    }

    @ObfuscatedName("dh.m()V")
    public void method2195() {
        for (int var1 = 0; var1 < this.field1813; var1++) {
            this.field1814[var1] = -this.field1814[var1];
            this.field1816[var1] = -this.field1816[var1];
        }
        this.field1811 = 0;
    }

    @ObfuscatedName("dh.e()V")
    public void method2153() {
        for (int var1 = 0; var1 < this.field1813; var1++) {
            int var2 = this.field1816[var1];
            this.field1816[var1] = this.field1814[var1];
            this.field1814[var1] = -var2;
        }
        this.field1811 = 0;
    }

    @ObfuscatedName("dh.h(I)V")
    public void method2154(int arg0) {
        int var2 = field1869[arg0];
        int var3 = field1870[arg0];
        for (int var4 = 0; var4 < this.field1813; var4++) {
            int var5 = this.field1840[var4] * var3 - this.field1816[var4] * var2 >> 16;
            this.field1816[var4] = this.field1840[var4] * var2 + this.field1816[var4] * var3 >> 16;
            this.field1840[var4] = var5;
        }
        this.field1811 = 0;
    }

    @ObfuscatedName("dh.z(III)V")
    public void method2155(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1813; var4++) {
            this.field1814[var4] += arg0;
            this.field1840[var4] += arg1;
            this.field1816[var4] += arg2;
        }
        this.field1811 = 0;
    }

    @ObfuscatedName("dh.a(III)V")
    public void method2159(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1813; var4++) {
            this.field1814[var4] = this.field1814[var4] * arg0 / 128;
            this.field1840[var4] = this.field1840[var4] * arg1 / 128;
            this.field1816[var4] = this.field1816[var4] * arg2 / 128;
        }
        this.field1811 = 0;
    }

    @ObfuscatedName("dh.w(IIIIIII)V")
    public final void method2157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1853[0] = -1;
        if (this.field1811 != 2 && this.field1811 != 1) {
            this.method2164();
        }
        int var8 = Statics.field1584;
        int var9 = Statics.field1585;
        int var10 = field1869[arg0];
        int var11 = field1870[arg0];
        int var12 = field1869[arg1];
        int var13 = field1870[arg1];
        int var14 = field1869[arg2];
        int var15 = field1870[arg2];
        int var16 = field1869[arg3];
        int var17 = field1870[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1813; var19++) {
            int var20 = this.field1814[var19];
            int var21 = this.field1840[var19];
            int var22 = this.field1816[var19];
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
            field1820[var19] = var30 - var18;
            field1844[var19] = class92.field1588 * var26 / var30 + var8;
            field1845[var19] = class92.field1588 * var29 / var30 + var9;
            if (this.field1829 > 0) {
                field1852[var19] = var26;
                field1830[var19] = var29;
                field1849[var19] = var30;
            }
        }
        try {
            this.method2160(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dh.g(IIIIIIII)V")
    public final void method2158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1853[0] = -1;
        if (this.field1811 != 2 && this.field1811 != 1) {
            this.method2164();
        }
        int var9 = Statics.field1584;
        int var10 = Statics.field1585;
        int var11 = field1869[arg0];
        int var12 = field1870[arg0];
        int var13 = field1869[arg1];
        int var14 = field1870[arg1];
        int var15 = field1869[arg2];
        int var16 = field1870[arg2];
        int var17 = field1869[arg3];
        int var18 = field1870[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1813; var20++) {
            int var21 = this.field1814[var20];
            int var22 = this.field1840[var20];
            int var23 = this.field1816[var20];
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
            field1820[var20] = var31 - var19;
            field1844[var20] = class92.field1588 * var27 / arg7 + var9;
            field1845[var20] = class92.field1588 * var30 / arg7 + var10;
            if (this.field1829 > 0) {
                field1852[var20] = var27;
                field1830[var20] = var30;
                field1849[var20] = var31;
            }
        }
        try {
            this.method2160(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dh.v(IIIIIIIII)V")
    public void method1763(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1853[0] = -1;
        if (this.field1811 != 1) {
            this.method2145();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1828 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1828) * class92.field1588;
        if (var15 / var13 >= Statics.field1577) {
            return;
        }
        int var16 = (this.field1828 + var14) * class92.field1588;
        if (var16 / var13 <= Statics.field1583) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1828 * arg1 >> 16;
        int var19 = (var17 + var18) * class92.field1588;
        if (var19 / var13 <= Statics.field1574) {
            return;
        }
        int var20 = (this.field1466 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class92.field1588;
        if (var21 / var13 >= Statics.field1591) {
            return;
        }
        int var22 = (this.field1466 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1829 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1864) {
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
            int var32 = field1865 - Statics.field1584;
            int var33 = field1866 - Statics.field1585;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1835) {
                    field1868[field1809++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1584;
        int var35 = Statics.field1585;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1869[arg0];
            var37 = field1870[arg0];
        }
        for (int var38 = 0; var38 < this.field1813; var38++) {
            int var39 = this.field1814[var38];
            int var40 = this.field1840[var38];
            int var41 = this.field1816[var38];
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
            field1820[var38] = var50 - var11;
            if (var50 >= 50) {
                field1844[var38] = class92.field1588 * var46 / var50 + var34;
                field1845[var38] = class92.field1588 * var49 / var50 + var35;
            } else {
                field1844[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1852[var38] = var46;
                field1830[var38] = var49;
                field1849[var38] = var50;
            }
        }
        try {
            this.method2160(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dh.y(ZZI)V")
    public final void method2160(boolean arg0, boolean arg1, int arg2) {
        if (this.field1851 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1851; var4++) {
            field1853[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1831; var5++) {
            if (this.field1833[var5] != -2) {
                int var6 = this.field1818[var5];
                int var7 = this.field1819[var5];
                int var8 = this.field1810[var5];
                int var9 = field1844[var6];
                int var10 = field1844[var7];
                int var11 = field1844[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1852[var6];
                    int var13 = field1852[var7];
                    int var14 = field1852[var8];
                    int var15 = field1830[var6];
                    int var16 = field1830[var7];
                    int var17 = field1830[var8];
                    int var18 = field1849[var6];
                    int var19 = field1849[var7];
                    int var20 = field1849[var8];
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
                        field1843[var5] = true;
                        int var30 = (field1820[var6] + field1820[var7] + field1820[var8]) / 3 + this.field1867;
                        field1839[var30][field1853[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2146(field1865, field1866, field1845[var6], field1845[var7], field1845[var8], var9, var10, var11)) {
                        field1868[field1809++] = arg2;
                        arg1 = false;
                    }
                    if ((field1845[var8] - field1845[var7]) * (var9 - var10) - (field1845[var6] - field1845[var7]) * (var11 - var10) > 0) {
                        field1843[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1590 && var10 <= Statics.field1590 && var11 <= Statics.field1590) {
                            field1842[var5] = false;
                        } else {
                            field1842[var5] = true;
                        }
                        int var31 = (field1820[var6] + field1820[var7] + field1820[var8]) / 3 + this.field1867;
                        field1839[var31][field1853[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1824 == null) {
            for (int var32 = this.field1851 - 1; var32 >= 0; var32--) {
                int var33 = field1853[var32];
                if (var33 > 0) {
                    int[] var34 = field1839[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2206(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1817[var36] = 0;
            field1815[var36] = 0;
        }
        for (int var37 = this.field1851 - 1; var37 >= 0; var37--) {
            int var38 = field1853[var37];
            if (var38 > 0) {
                int[] var39 = field1839[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1824[var41];
                    int var43 = field1817[var42]++;
                    field1857[var42][var43] = var41;
                    if (var42 < 10) {
                        field1815[var42] += var37;
                    } else if (var42 == 10) {
                        field1855[var43] = var37;
                    } else {
                        field1856[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1817[1] > 0 || field1817[2] > 0) {
            var44 = (field1815[1] + field1815[2]) / (field1817[1] + field1817[2]);
        }
        int var45 = 0;
        if (field1817[3] > 0 || field1817[4] > 0) {
            var45 = (field1815[3] + field1815[4]) / (field1817[3] + field1817[4]);
        }
        int var46 = 0;
        if (field1817[6] > 0 || field1817[8] > 0) {
            var46 = (field1815[6] + field1815[8]) / (field1817[6] + field1817[8]);
        }
        int var47 = 0;
        int var48 = field1817[10];
        int[] var49 = field1857[10];
        int[] var50 = field1855;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1817[11];
            var49 = field1857[11];
            var50 = field1856;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2206(var49[var47++]);
                if (var47 == var48 && field1857[11] != var49) {
                    var47 = 0;
                    var48 = field1817[11];
                    var49 = field1857[11];
                    var50 = field1856;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2206(var49[var47++]);
                if (var47 == var48 && field1857[11] != var49) {
                    var47 = 0;
                    var48 = field1817[11];
                    var49 = field1857[11];
                    var50 = field1856;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2206(var49[var47++]);
                if (var47 == var48 && field1857[11] != var49) {
                    var47 = 0;
                    var48 = field1817[11];
                    var49 = field1857[11];
                    var50 = field1856;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1817[var52];
            int[] var54 = field1857[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2206(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2206(var49[var47++]);
            if (var47 == var48 && field1857[11] != var49) {
                var47 = 0;
                var49 = field1857[11];
                var48 = field1817[11];
                var50 = field1856;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dh.f(I)V")
    public final void method2206(int arg0) {
        if (field1843[arg0]) {
            this.method2189(arg0);
            return;
        }
        int var2 = this.field1818[arg0];
        int var3 = this.field1819[arg0];
        int var4 = this.field1810[arg0];
        class92.field1580 = field1842[arg0];
        if (this.field1825 == null) {
            class92.field1578 = 0;
        } else {
            class92.field1578 = this.field1825[arg0] & 0xFF;
        }
        if (this.field1847 != null && this.field1847[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1826 == null || this.field1826[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1826[arg0] & 0xFF;
                var6 = this.field1827[var5];
                var7 = this.field1838[var5];
                var8 = this.field1832[var5];
            }
            if (this.field1833[arg0] == -1) {
                class92.method1995(field1845[var2], field1845[var3], field1845[var4], field1844[var2], field1844[var3], field1844[var4], this.field1821[arg0], this.field1821[arg0], this.field1821[arg0], field1852[var6], field1852[var7], field1852[var8], field1830[var6], field1830[var7], field1830[var8], field1849[var6], field1849[var7], field1849[var8], this.field1847[arg0]);
            } else {
                class92.method1995(field1845[var2], field1845[var3], field1845[var4], field1844[var2], field1844[var3], field1844[var4], this.field1821[arg0], this.field1822[arg0], this.field1833[arg0], field1852[var6], field1852[var7], field1852[var8], field1830[var6], field1830[var7], field1830[var8], field1849[var6], field1849[var7], field1849[var8], this.field1847[arg0]);
            }
        } else if (this.field1833[arg0] == -1) {
            class92.method1965(field1845[var2], field1845[var3], field1845[var4], field1844[var2], field1844[var3], field1844[var4], field1871[this.field1821[arg0]]);
        } else {
            class92.method1994(field1845[var2], field1845[var3], field1845[var4], field1844[var2], field1844[var3], field1844[var4], this.field1821[arg0], this.field1822[arg0], this.field1833[arg0]);
        }
    }

    @ObfuscatedName("dh.q(I)V")
    public final void method2189(int arg0) {
        int var2 = Statics.field1584;
        int var3 = Statics.field1585;
        int var4 = 0;
        int var5 = this.field1818[arg0];
        int var6 = this.field1819[arg0];
        int var7 = this.field1810[arg0];
        int var8 = field1849[var5];
        int var9 = field1849[var6];
        int var10 = field1849[var7];
        if (this.field1825 == null) {
            class92.field1578 = 0;
        } else {
            class92.field1578 = this.field1825[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1858[var4] = field1844[var5];
            field1859[var4] = field1845[var5];
            field1848[var4++] = this.field1821[arg0];
        } else {
            int var11 = field1852[var5];
            int var12 = field1830[var5];
            int var13 = this.field1821[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1872[var10 - var8];
                field1858[var4] = (((field1852[var7] - var11) * var14 >> 16) + var11) * class92.field1588 / 50 + var2;
                field1859[var4] = (((field1830[var7] - var12) * var14 >> 16) + var12) * class92.field1588 / 50 + var3;
                field1848[var4++] = ((this.field1833[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1872[var9 - var8];
                field1858[var4] = (((field1852[var6] - var11) * var15 >> 16) + var11) * class92.field1588 / 50 + var2;
                field1859[var4] = (((field1830[var6] - var12) * var15 >> 16) + var12) * class92.field1588 / 50 + var3;
                field1848[var4++] = ((this.field1822[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1858[var4] = field1844[var6];
            field1859[var4] = field1845[var6];
            field1848[var4++] = this.field1822[arg0];
        } else {
            int var16 = field1852[var6];
            int var17 = field1830[var6];
            int var18 = this.field1822[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1872[var8 - var9];
                field1858[var4] = (((field1852[var5] - var16) * var19 >> 16) + var16) * class92.field1588 / 50 + var2;
                field1859[var4] = (((field1830[var5] - var17) * var19 >> 16) + var17) * class92.field1588 / 50 + var3;
                field1848[var4++] = ((this.field1821[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1872[var10 - var9];
                field1858[var4] = (((field1852[var7] - var16) * var20 >> 16) + var16) * class92.field1588 / 50 + var2;
                field1859[var4] = (((field1830[var7] - var17) * var20 >> 16) + var17) * class92.field1588 / 50 + var3;
                field1848[var4++] = ((this.field1833[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1858[var4] = field1844[var7];
            field1859[var4] = field1845[var7];
            field1848[var4++] = this.field1833[arg0];
        } else {
            int var21 = field1852[var7];
            int var22 = field1830[var7];
            int var23 = this.field1833[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1872[var9 - var10];
                field1858[var4] = (((field1852[var6] - var21) * var24 >> 16) + var21) * class92.field1588 / 50 + var2;
                field1859[var4] = (((field1830[var6] - var22) * var24 >> 16) + var22) * class92.field1588 / 50 + var3;
                field1848[var4++] = ((this.field1822[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1872[var8 - var10];
                field1858[var4] = (((field1852[var5] - var21) * var25 >> 16) + var21) * class92.field1588 / 50 + var2;
                field1859[var4] = (((field1830[var5] - var22) * var25 >> 16) + var22) * class92.field1588 / 50 + var3;
                field1848[var4++] = ((this.field1821[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1858[0];
        int var27 = field1858[1];
        int var28 = field1858[2];
        int var29 = field1859[0];
        int var30 = field1859[1];
        int var31 = field1859[2];
        class92.field1580 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1590 || var27 > Statics.field1590 || var28 > Statics.field1590) {
                class92.field1580 = true;
            }
            if (this.field1847 != null && this.field1847[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1826 == null || this.field1826[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1826[arg0] & 0xFF;
                    var33 = this.field1827[var32];
                    var34 = this.field1838[var32];
                    var35 = this.field1832[var32];
                }
                if (this.field1833[arg0] == -1) {
                    class92.method1995(var29, var30, var31, var26, var27, var28, this.field1821[arg0], this.field1821[arg0], this.field1821[arg0], field1852[var33], field1852[var34], field1852[var35], field1830[var33], field1830[var34], field1830[var35], field1849[var33], field1849[var34], field1849[var35], this.field1847[arg0]);
                } else {
                    class92.method1995(var29, var30, var31, var26, var27, var28, field1848[0], field1848[1], field1848[2], field1852[var33], field1852[var34], field1852[var35], field1830[var33], field1830[var34], field1830[var35], field1849[var33], field1849[var34], field1849[var35], this.field1847[arg0]);
                }
            } else if (this.field1833[arg0] == -1) {
                class92.method1965(var29, var30, var31, var26, var27, var28, field1871[this.field1821[arg0]]);
            } else {
                class92.method1994(var29, var30, var31, var26, var27, var28, field1848[0], field1848[1], field1848[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1590 || var27 > Statics.field1590 || var28 > Statics.field1590 || field1858[3] < 0 || field1858[3] > Statics.field1590) {
            class92.field1580 = true;
        }
        if (this.field1847 != null && this.field1847[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1826 == null || this.field1826[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1826[arg0] & 0xFF;
                var37 = this.field1827[var36];
                var38 = this.field1838[var36];
                var39 = this.field1832[var36];
            }
            short var40 = this.field1847[arg0];
            if (this.field1833[arg0] == -1) {
                class92.method1995(var29, var30, var31, var26, var27, var28, this.field1821[arg0], this.field1821[arg0], this.field1821[arg0], field1852[var37], field1852[var38], field1852[var39], field1830[var37], field1830[var38], field1830[var39], field1849[var37], field1849[var38], field1849[var39], var40);
                class92.method1995(var29, var31, field1859[3], var26, var28, field1858[3], this.field1821[arg0], this.field1821[arg0], this.field1821[arg0], field1852[var37], field1852[var38], field1852[var39], field1830[var37], field1830[var38], field1830[var39], field1849[var37], field1849[var38], field1849[var39], var40);
            } else {
                class92.method1995(var29, var30, var31, var26, var27, var28, field1848[0], field1848[1], field1848[2], field1852[var37], field1852[var38], field1852[var39], field1830[var37], field1830[var38], field1830[var39], field1849[var37], field1849[var38], field1849[var39], var40);
                class92.method1995(var29, var31, field1859[3], var26, var28, field1858[3], field1848[0], field1848[2], field1848[3], field1852[var37], field1852[var38], field1852[var39], field1830[var37], field1830[var38], field1830[var39], field1849[var37], field1849[var38], field1849[var39], var40);
            }
        } else if (this.field1833[arg0] == -1) {
            int var41 = field1871[this.field1821[arg0]];
            class92.method1965(var29, var30, var31, var26, var27, var28, var41);
            class92.method1965(var29, var31, field1859[3], var26, var28, field1858[3], var41);
        } else {
            class92.method1994(var29, var30, var31, var26, var27, var28, field1848[0], field1848[1], field1848[2]);
            class92.method1994(var29, var31, field1859[3], var26, var28, field1858[3], field1848[0], field1848[2], field1848[3]);
        }
    }

    @ObfuscatedName("dh.n(IIIIIIII)Z")
    public final boolean method2146(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
