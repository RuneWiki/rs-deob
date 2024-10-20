package deob;

@ObfuscatedName("ee")
public class class131 extends class139 {

    @ObfuscatedName("ee.b")
    public static class131 field1850 = new class131();

    @ObfuscatedName("ee.q")
    public static byte[] field1803 = new byte[1];

    @ObfuscatedName("ee.o")
    public static class131 field1804 = new class131();

    @ObfuscatedName("ee.p")
    public static byte[] field1805 = new byte[1];

    @ObfuscatedName("ee.a")
    public int field1806 = 0;

    @ObfuscatedName("ee.h")
    public int[] field1834;

    @ObfuscatedName("ee.l")
    public int[] field1808;

    @ObfuscatedName("ee.y")
    public int[] field1809;

    @ObfuscatedName("ee.g")
    public int field1810 = 0;

    @ObfuscatedName("ee.c")
    public int[] field1811;

    @ObfuscatedName("ee.u")
    public int[] field1839;

    @ObfuscatedName("ee.r")
    public int[] field1813;

    @ObfuscatedName("ee.d")
    public int[] field1842;

    @ObfuscatedName("ee.v")
    public int[] field1832;

    @ObfuscatedName("ee.s")
    public int[] field1870;

    @ObfuscatedName("ee.t")
    public byte[] field1817;

    @ObfuscatedName("ee.f")
    public byte[] field1818;

    @ObfuscatedName("ee.m")
    public byte[] field1819;

    @ObfuscatedName("ee.x")
    public short[] field1833;

    @ObfuscatedName("ee.w")
    public byte field1816 = 0;

    @ObfuscatedName("ee.j")
    public int field1822 = 0;

    @ObfuscatedName("ee.z")
    public int[] field1814;

    @ObfuscatedName("ee.e")
    public int[] field1824;

    @ObfuscatedName("ee.k")
    public int[] field1812;

    @ObfuscatedName("ee.n")
    public int[][] field1858;

    @ObfuscatedName("ee.i")
    public int[][] field1831;

    @ObfuscatedName("ee.av")
    public boolean field1828 = false;

    @ObfuscatedName("ee.ao")
    public int field1863;

    @ObfuscatedName("ee.am")
    public int field1830;

    @ObfuscatedName("ee.aj")
    public int field1838;

    @ObfuscatedName("ee.ah")
    public int field1802;

    @ObfuscatedName("ee.af")
    public int field1841;

    @ObfuscatedName("ee.ai")
    public int field1823;

    @ObfuscatedName("ee.aq")
    public int field1835;

    @ObfuscatedName("ee.ak")
    public int field1836;

    @ObfuscatedName("ee.al")
    public int field1837 = -1;

    @ObfuscatedName("ee.as")
    public int field1826 = -1;

    @ObfuscatedName("ee.az")
    public int field1868 = -1;

    @ObfuscatedName("ee.ad")
    public static boolean[] field1853 = new boolean[4700];

    @ObfuscatedName("ee.ar")
    public static boolean[] field1862 = new boolean[4700];

    @ObfuscatedName("ee.ag")
    public static int[] field1843 = new int[4700];

    @ObfuscatedName("ee.au")
    public static int[] field1844 = new int[4700];

    @ObfuscatedName("ee.ac")
    public static int[] field1845 = new int[4700];

    @ObfuscatedName("ee.ay")
    public static int[] field1815 = new int[4700];

    @ObfuscatedName("ee.at")
    public static int[] field1847 = new int[4700];

    @ObfuscatedName("ee.aa")
    public static int[] field1848 = new int[4700];

    @ObfuscatedName("ee.ab")
    public static int[] field1821 = new int[1600];

    @ObfuscatedName("ee.ap")
    public static int[][] field1851 = new int[1600][512];

    @ObfuscatedName("ee.ae")
    public static int[] field1825 = new int[12];

    @ObfuscatedName("ee.an")
    public static int[][] field1829 = new int[12][2000];

    @ObfuscatedName("ee.bh")
    public static int[] field1854 = new int[2000];

    @ObfuscatedName("ee.bx")
    public static int[] field1855 = new int[2000];

    @ObfuscatedName("ee.bb")
    public static int[] field1856 = new int[12];

    @ObfuscatedName("ee.bf")
    public static int[] field1857 = new int[10];

    @ObfuscatedName("ee.bp")
    public static int[] field1846 = new int[10];

    @ObfuscatedName("ee.bj")
    public static int[] field1859 = new int[10];

    @ObfuscatedName("ee.bk")
    public static boolean field1852 = true;

    @ObfuscatedName("ee.bg")
    public static int[] field1866 = class134.field1902;

    @ObfuscatedName("ee.bc")
    public static int[] field1820 = class134.field1917;

    @ObfuscatedName("ee.bw")
    public static int[] field1807 = class134.field1908;

    @ObfuscatedName("ee.ba")
    public static int[] field1869 = class134.field1912;

    public class131() {
    }

    public class131(class131[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1806 = 0;
        this.field1810 = 0;
        this.field1822 = 0;
        this.field1816 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class131 var8 = arg0[var7];
            if (var8 != null) {
                this.field1806 += var8.field1806;
                this.field1810 += var8.field1810;
                this.field1822 += var8.field1822;
                if (var8.field1817 == null) {
                    if (this.field1816 == -1) {
                        this.field1816 = var8.field1816;
                    }
                    if (this.field1816 != var8.field1816) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1818 != null;
                var5 |= var8.field1833 != null;
                var6 |= var8.field1819 != null;
            }
        }
        this.field1834 = new int[this.field1806];
        this.field1808 = new int[this.field1806];
        this.field1809 = new int[this.field1806];
        this.field1811 = new int[this.field1810];
        this.field1839 = new int[this.field1810];
        this.field1813 = new int[this.field1810];
        this.field1842 = new int[this.field1810];
        this.field1832 = new int[this.field1810];
        this.field1870 = new int[this.field1810];
        if (var3) {
            this.field1817 = new byte[this.field1810];
        }
        if (var4) {
            this.field1818 = new byte[this.field1810];
        }
        if (var5) {
            this.field1833 = new short[this.field1810];
        }
        if (var6) {
            this.field1819 = new byte[this.field1810];
        }
        if (this.field1822 > 0) {
            this.field1814 = new int[this.field1822];
            this.field1824 = new int[this.field1822];
            this.field1812 = new int[this.field1822];
        }
        this.field1806 = 0;
        this.field1810 = 0;
        this.field1822 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class131 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1810; var11++) {
                    this.field1811[this.field1810] = var10.field1811[var11] + this.field1806;
                    this.field1839[this.field1810] = var10.field1839[var11] + this.field1806;
                    this.field1813[this.field1810] = var10.field1813[var11] + this.field1806;
                    this.field1842[this.field1810] = var10.field1842[var11];
                    this.field1832[this.field1810] = var10.field1832[var11];
                    this.field1870[this.field1810] = var10.field1870[var11];
                    if (var3) {
                        if (var10.field1817 == null) {
                            this.field1817[this.field1810] = var10.field1816;
                        } else {
                            this.field1817[this.field1810] = var10.field1817[var11];
                        }
                    }
                    if (var4 && var10.field1818 != null) {
                        this.field1818[this.field1810] = var10.field1818[var11];
                    }
                    if (var5) {
                        if (var10.field1833 == null) {
                            this.field1833[this.field1810] = -1;
                        } else {
                            this.field1833[this.field1810] = var10.field1833[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1819 == null || var10.field1819[var11] == -1) {
                            this.field1819[this.field1810] = -1;
                        } else {
                            this.field1819[this.field1810] = (byte) (var10.field1819[var11] + this.field1822);
                        }
                    }
                    this.field1810++;
                }
                for (int var12 = 0; var12 < var10.field1822; var12++) {
                    this.field1814[this.field1822] = var10.field1814[var12] + this.field1806;
                    this.field1824[this.field1822] = var10.field1824[var12] + this.field1806;
                    this.field1812[this.field1822] = var10.field1812[var12] + this.field1806;
                    this.field1822++;
                }
                for (int var13 = 0; var13 < var10.field1806; var13++) {
                    this.field1834[this.field1806] = var10.field1834[var13];
                    this.field1808[this.field1806] = var10.field1808[var13];
                    this.field1809[this.field1806] = var10.field1809[var13];
                    this.field1806++;
                }
            }
        }
    }

    @ObfuscatedName("ee.b([[IIIIZI)Lee;")
    public class131 method2536(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2495();
        int var7 = arg1 - this.field1838;
        int var8 = this.field1838 + arg1;
        int var9 = arg3 - this.field1838;
        int var10 = this.field1838 + arg3;
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
        class131 var15;
        if (arg4) {
            var15 = new class131();
            var15.field1806 = this.field1806;
            var15.field1810 = this.field1810;
            var15.field1822 = this.field1822;
            var15.field1834 = this.field1834;
            var15.field1809 = this.field1809;
            var15.field1811 = this.field1811;
            var15.field1839 = this.field1839;
            var15.field1813 = this.field1813;
            var15.field1842 = this.field1842;
            var15.field1832 = this.field1832;
            var15.field1870 = this.field1870;
            var15.field1817 = this.field1817;
            var15.field1818 = this.field1818;
            var15.field1819 = this.field1819;
            var15.field1833 = this.field1833;
            var15.field1816 = this.field1816;
            var15.field1814 = this.field1814;
            var15.field1824 = this.field1824;
            var15.field1812 = this.field1812;
            var15.field1858 = this.field1858;
            var15.field1831 = this.field1831;
            var15.field1828 = this.field1828;
            var15.field1808 = new int[var15.field1806];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1806; var16++) {
                int var17 = this.field1834[var16] + arg1;
                int var18 = this.field1809[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1808[var16] = this.field1808[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1806; var26++) {
                int var27 = (-this.field1808[var26] << 16) / this.field1996;
                if (var27 < arg5) {
                    int var28 = this.field1834[var26] + arg1;
                    int var29 = this.field1809[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1808[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1808[var26];
                }
            }
        }
        var15.method2498();
        return var15;
    }

    @ObfuscatedName("ee.q(Z)Lee;")
    public class131 method2491(boolean arg0) {
        if (!arg0 && field1803.length < this.field1810) {
            field1803 = new byte[this.field1810 + 100];
        }
        return this.method2493(arg0, field1850, field1803);
    }

    @ObfuscatedName("ee.o(Z)Lee;")
    public class131 method2492(boolean arg0) {
        if (!arg0 && field1805.length < this.field1810) {
            field1805 = new byte[this.field1810 + 100];
        }
        return this.method2493(arg0, field1804, field1805);
    }

    @ObfuscatedName("ee.p(ZLee;[B)Lee;")
    public class131 method2493(boolean arg0, class131 arg1, byte[] arg2) {
        arg1.field1806 = this.field1806;
        arg1.field1810 = this.field1810;
        arg1.field1822 = this.field1822;
        if (arg1.field1834 == null || arg1.field1834.length < this.field1806) {
            arg1.field1834 = new int[this.field1806 + 100];
            arg1.field1808 = new int[this.field1806 + 100];
            arg1.field1809 = new int[this.field1806 + 100];
        }
        for (int var4 = 0; var4 < this.field1806; var4++) {
            arg1.field1834[var4] = this.field1834[var4];
            arg1.field1808[var4] = this.field1808[var4];
            arg1.field1809[var4] = this.field1809[var4];
        }
        if (arg0) {
            arg1.field1818 = this.field1818;
        } else {
            arg1.field1818 = arg2;
            if (this.field1818 == null) {
                for (int var5 = 0; var5 < this.field1810; var5++) {
                    arg1.field1818[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1810; var6++) {
                    arg1.field1818[var6] = this.field1818[var6];
                }
            }
        }
        arg1.field1811 = this.field1811;
        arg1.field1839 = this.field1839;
        arg1.field1813 = this.field1813;
        arg1.field1842 = this.field1842;
        arg1.field1832 = this.field1832;
        arg1.field1870 = this.field1870;
        arg1.field1817 = this.field1817;
        arg1.field1819 = this.field1819;
        arg1.field1833 = this.field1833;
        arg1.field1816 = this.field1816;
        arg1.field1814 = this.field1814;
        arg1.field1824 = this.field1824;
        arg1.field1812 = this.field1812;
        arg1.field1858 = this.field1858;
        arg1.field1831 = this.field1831;
        arg1.field1828 = this.field1828;
        arg1.method2498();
        return arg1;
    }

    @ObfuscatedName("ee.a(I)V")
    public void method2529(int arg0) {
        if (this.field1837 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1820[arg0];
        int var9 = field1866[arg0];
        for (int var10 = 0; var10 < this.field1806; var10++) {
            int var11 = class134.method2595(this.field1834[var10], this.field1809[var10], var8, var9);
            int var12 = this.field1808[var10];
            int var13 = class134.method2612(this.field1834[var10], this.field1809[var10], var8, var9);
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            if (var13 > var7) {
                var7 = var13;
            }
        }
        this.field1823 = (var2 + var5) / 2;
        this.field1835 = (var3 + var6) / 2;
        this.field1836 = (var4 + var7) / 2;
        this.field1837 = (var5 - var2 + 1) / 2;
        this.field1826 = (var6 - var3 + 1) / 2;
        this.field1868 = (var7 - var4 + 1) / 2;
        if (this.field1837 < 32) {
            this.field1837 = 32;
        }
        if (this.field1868 < 32) {
            this.field1868 = 32;
        }
        if (this.field1828) {
            this.field1837 += 8;
            this.field1868 += 8;
        }
    }

    @ObfuscatedName("ee.h()V")
    public void method2495() {
        if (this.field1863 == 1) {
            return;
        }
        this.field1863 = 1;
        this.field1996 = 0;
        this.field1830 = 0;
        this.field1838 = 0;
        for (int var1 = 0; var1 < this.field1806; var1++) {
            int var2 = this.field1834[var1];
            int var3 = this.field1808[var1];
            int var4 = this.field1809[var1];
            if (-var3 > this.field1996) {
                this.field1996 = -var3;
            }
            if (var3 > this.field1830) {
                this.field1830 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1838) {
                this.field1838 = var5;
            }
        }
        this.field1838 = (int) (Math.sqrt((double) this.field1838) + 0.99D);
        this.field1841 = (int) (Math.sqrt((double) (this.field1996 * this.field1996 + this.field1838 * this.field1838)) + 0.99D);
        this.field1802 = this.field1841 + (int) (Math.sqrt((double) (this.field1838 * this.field1838 + this.field1830 * this.field1830)) + 0.99D);
    }

    @ObfuscatedName("ee.l()V")
    public void method2496() {
        if (this.field1863 == 2) {
            return;
        }
        this.field1863 = 2;
        this.field1838 = 0;
        for (int var1 = 0; var1 < this.field1806; var1++) {
            int var2 = this.field1834[var1];
            int var3 = this.field1808[var1];
            int var4 = this.field1809[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1838) {
                this.field1838 = var5;
            }
        }
        this.field1838 = (int) (Math.sqrt((double) this.field1838) + 0.99D);
        this.field1841 = this.field1838;
        this.field1802 = this.field1838 + this.field1838;
    }

    @ObfuscatedName("ee.y()I")
    public int method2497() {
        this.method2495();
        return this.field1838;
    }

    @ObfuscatedName("ee.c()V")
    public void method2498() {
        this.field1863 = 0;
        this.field1837 = -1;
    }

    @ObfuscatedName("ee.u(Lej;I)V")
    public void method2506(class142 arg0, int arg1) {
        if (this.field1858 == null || arg1 == -1) {
            return;
        }
        class129 var3 = arg0.field2014[arg1];
        class136 var4 = var3.field1772;
        Statics.field1860 = 0;
        Statics.field1861 = 0;
        Statics.field1867 = 0;
        for (int var5 = 0; var5 < var3.field1773; var5++) {
            int var6 = var3.field1774[var5];
            this.method2549(var4.field1927[var6], var4.field1930[var6], var3.field1775[var5], var3.field1776[var5], var3.field1770[var5]);
        }
        this.method2498();
    }

    @ObfuscatedName("ee.t(Lej;ILej;I[I)V")
    public void method2500(class142 arg0, int arg1, class142 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2506(arg0, arg1);
            return;
        }
        class129 var6 = arg0.field2014[arg1];
        class129 var7 = arg2.field2014[arg3];
        class136 var8 = var6.field1772;
        Statics.field1860 = 0;
        Statics.field1861 = 0;
        Statics.field1867 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1773; var11++) {
            int var12 = var6.field1774[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1927[var12] == 0) {
                this.method2549(var8.field1927[var12], var8.field1930[var12], var6.field1775[var11], var6.field1776[var11], var6.field1770[var11]);
            }
        }
        Statics.field1860 = 0;
        Statics.field1861 = 0;
        Statics.field1867 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1773; var15++) {
            int var16 = var7.field1774[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1927[var16] == 0) {
                this.method2549(var8.field1927[var16], var8.field1930[var16], var7.field1775[var15], var7.field1776[var15], var7.field1770[var15]);
            }
        }
        this.method2498();
    }

    @ObfuscatedName("ee.f(I[IIII)V")
    public void method2549(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1860 = 0;
            Statics.field1861 = 0;
            Statics.field1867 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1858.length) {
                    int[] var10 = this.field1858[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1860 += this.field1834[var12];
                        Statics.field1861 += this.field1808[var12];
                        Statics.field1867 += this.field1809[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1860 = Statics.field1860 / var7 + arg2;
                Statics.field1861 = Statics.field1861 / var7 + arg3;
                Statics.field1867 = Statics.field1867 / var7 + arg4;
            } else {
                Statics.field1860 = arg2;
                Statics.field1861 = arg3;
                Statics.field1867 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1858.length) {
                    int[] var15 = this.field1858[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1834[var17] += arg2;
                        this.field1808[var17] += arg3;
                        this.field1809[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1858.length) {
                    int[] var20 = this.field1858[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1834[var22] -= Statics.field1860;
                        this.field1808[var22] -= Statics.field1861;
                        this.field1809[var22] -= Statics.field1867;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1866[var25];
                            int var27 = field1820[var25];
                            int var28 = this.field1834[var22] * var27 + this.field1808[var22] * var26 >> 16;
                            this.field1808[var22] = this.field1808[var22] * var27 - this.field1834[var22] * var26 >> 16;
                            this.field1834[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1866[var23];
                            int var30 = field1820[var23];
                            int var31 = this.field1808[var22] * var30 - this.field1809[var22] * var29 >> 16;
                            this.field1809[var22] = this.field1809[var22] * var30 + this.field1808[var22] * var29 >> 16;
                            this.field1808[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1866[var24];
                            int var33 = field1820[var24];
                            int var34 = this.field1834[var22] * var33 + this.field1809[var22] * var32 >> 16;
                            this.field1809[var22] = this.field1809[var22] * var33 - this.field1834[var22] * var32 >> 16;
                            this.field1834[var22] = var34;
                        }
                        this.field1834[var22] += Statics.field1860;
                        this.field1808[var22] += Statics.field1861;
                        this.field1809[var22] += Statics.field1867;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1858.length) {
                    int[] var37 = this.field1858[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1834[var39] -= Statics.field1860;
                        this.field1808[var39] -= Statics.field1861;
                        this.field1809[var39] -= Statics.field1867;
                        this.field1834[var39] = this.field1834[var39] * arg2 / 128;
                        this.field1808[var39] = this.field1808[var39] * arg3 / 128;
                        this.field1809[var39] = this.field1809[var39] * arg4 / 128;
                        this.field1834[var39] += Statics.field1860;
                        this.field1808[var39] += Statics.field1861;
                        this.field1809[var39] += Statics.field1867;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1831 != null && this.field1818 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1831.length) {
                    int[] var42 = this.field1831[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1818[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1818[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ee.m()V")
    public void method2502() {
        for (int var1 = 0; var1 < this.field1806; var1++) {
            int var2 = this.field1834[var1];
            this.field1834[var1] = this.field1809[var1];
            this.field1809[var1] = -var2;
        }
        this.method2498();
    }

    @ObfuscatedName("ee.x()V")
    public void method2545() {
        for (int var1 = 0; var1 < this.field1806; var1++) {
            this.field1834[var1] = -this.field1834[var1];
            this.field1809[var1] = -this.field1809[var1];
        }
        this.method2498();
    }

    @ObfuscatedName("ee.w()V")
    public void method2504() {
        for (int var1 = 0; var1 < this.field1806; var1++) {
            int var2 = this.field1809[var1];
            this.field1809[var1] = this.field1834[var1];
            this.field1834[var1] = -var2;
        }
        this.method2498();
    }

    @ObfuscatedName("ee.j(I)V")
    public void method2532(int arg0) {
        int var2 = field1866[arg0];
        int var3 = field1820[arg0];
        for (int var4 = 0; var4 < this.field1806; var4++) {
            int var5 = this.field1808[var4] * var3 - this.field1809[var4] * var2 >> 16;
            this.field1809[var4] = this.field1809[var4] * var3 + this.field1808[var4] * var2 >> 16;
            this.field1808[var4] = var5;
        }
        this.method2498();
    }

    @ObfuscatedName("ee.z(III)V")
    public void method2522(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1806; var4++) {
            this.field1834[var4] += arg0;
            this.field1808[var4] += arg1;
            this.field1809[var4] += arg2;
        }
        this.method2498();
    }

    @ObfuscatedName("ee.e(III)V")
    public void method2499(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1806; var4++) {
            this.field1834[var4] = this.field1834[var4] * arg0 / 128;
            this.field1808[var4] = this.field1808[var4] * arg1 / 128;
            this.field1809[var4] = this.field1809[var4] * arg2 / 128;
        }
        this.method2498();
    }

    @ObfuscatedName("ee.k(IIIIIII)V")
    public final void method2519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1821[0] = -1;
        if (this.field1863 != 2 && this.field1863 != 1) {
            this.method2496();
        }
        int var8 = Statics.field1903;
        int var9 = Statics.field1904;
        int var10 = field1866[arg0];
        int var11 = field1820[arg0];
        int var12 = field1866[arg1];
        int var13 = field1820[arg1];
        int var14 = field1866[arg2];
        int var15 = field1820[arg2];
        int var16 = field1866[arg3];
        int var17 = field1820[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1806; var19++) {
            int var20 = this.field1834[var19];
            int var21 = this.field1808[var19];
            int var22 = this.field1809[var19];
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
            field1845[var19] = var30 - var18;
            field1843[var19] = class134.field1898 * var26 / var30 + var8;
            field1844[var19] = class134.field1898 * var29 / var30 + var9;
            if (this.field1822 > 0) {
                field1815[var19] = var26;
                field1847[var19] = var29;
                field1848[var19] = var30;
            }
        }
        try {
            this.method2511(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ee.ao(IIIIIIII)V")
    public final void method2509(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1821[0] = -1;
        if (this.field1863 != 2 && this.field1863 != 1) {
            this.method2496();
        }
        int var9 = Statics.field1903;
        int var10 = Statics.field1904;
        int var11 = field1866[arg0];
        int var12 = field1820[arg0];
        int var13 = field1866[arg1];
        int var14 = field1820[arg1];
        int var15 = field1866[arg2];
        int var16 = field1820[arg2];
        int var17 = field1866[arg3];
        int var18 = field1820[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1806; var20++) {
            int var21 = this.field1834[var20];
            int var22 = this.field1808[var20];
            int var23 = this.field1809[var20];
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
            field1845[var20] = var31 - var19;
            field1843[var20] = class134.field1898 * var27 / arg7 + var9;
            field1844[var20] = class134.field1898 * var30 / arg7 + var10;
            if (this.field1822 > 0) {
                field1815[var20] = var27;
                field1847[var20] = var30;
                field1848[var20] = var31;
            }
        }
        try {
            this.method2511(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ee.ct(IIIIIIIII)V")
    public void method2510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1821[0] = -1;
        if (this.field1863 != 1) {
            this.method2495();
        }
        this.method2529(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1838 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1838) * class134.field1898;
        if (var15 / var13 >= Statics.field1906) {
            return;
        }
        int var16 = (this.field1838 + var14) * class134.field1898;
        if (var16 / var13 <= Statics.field1907) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1838 * arg1 >> 16;
        int var19 = (var17 + var18) * class134.field1898;
        if (var19 / var13 <= Statics.field1901) {
            return;
        }
        int var20 = (this.field1996 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class134.field1898;
        if (var21 / var13 >= Statics.field1900) {
            return;
        }
        int var22 = (this.field1996 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1822 > 0;
        int var26 = class132.field1875;
        int var28 = class132.field1874;
        boolean var30 = class132.field1872;
        if (class8.field230 && arg8 > 0) {
            class8.method3227(this, arg5, arg6, arg7);
        }
        if (class8.field225 && arg8 > 0) {
            int var32 = var11 - var12;
            if (var32 <= 50) {
                var32 = 50;
            }
            int var37;
            int var38;
            if (var14 > 0) {
                var37 = var15 / var13;
                var38 = var16 / var32;
            } else {
                var38 = var16 / var13;
                var37 = var15 / var32;
            }
            int var39;
            int var40;
            if (var17 > 0) {
                var39 = var21 / var13;
                var40 = var19 / var32;
            } else {
                var40 = var19 / var13;
                var39 = var21 / var32;
            }
            int var41 = -8355840;
            int var42 = var26 - Statics.field1903;
            int var43 = var28 - Statics.field1904;
            if (var42 > var37 && var42 < var38 && var43 > var39 && var43 < var40) {
                var41 = -256;
            }
            int var44 = Statics.field1903 + var37;
            int var45 = Statics.field1904 + var39;
            int var46 = Statics.field1903 + var38;
            int var47 = Statics.field1904 + var40;
            class8.field226.method3720(new class9(var44, var45, var46, var47, var41));
        }
        boolean var48 = false;
        if (arg8 > 0 && var30) {
            boolean var49 = false;
            if (field1852) {
                var49 = class132.method5(this, arg5, arg6, arg7);
            } else {
                int var50 = var11 - var12;
                if (var50 <= 50) {
                    var50 = 50;
                }
                int var51;
                int var52;
                if (var14 > 0) {
                    var51 = var15 / var13;
                    var52 = var16 / var50;
                } else {
                    var52 = var16 / var13;
                    var51 = var15 / var50;
                }
                int var53;
                int var54;
                if (var17 > 0) {
                    var53 = var21 / var13;
                    var54 = var19 / var50;
                } else {
                    var54 = var19 / var13;
                    var53 = var21 / var50;
                }
                int var55 = var26 - Statics.field1903;
                int var56 = var28 - Statics.field1904;
                if (var55 > var51 && var55 < var52 && var56 > var53 && var56 < var54) {
                    var49 = true;
                }
            }
            if (var49) {
                if (this.field1828) {
                    class132.method229(arg8);
                } else {
                    var48 = true;
                }
            }
        }
        int var57 = Statics.field1903;
        int var58 = Statics.field1904;
        int var59 = 0;
        int var60 = 0;
        if (arg0 != 0) {
            var59 = field1866[arg0];
            var60 = field1820[arg0];
        }
        for (int var61 = 0; var61 < this.field1806; var61++) {
            int var62 = this.field1834[var61];
            int var63 = this.field1808[var61];
            int var64 = this.field1809[var61];
            if (arg0 != 0) {
                int var65 = var59 * var64 + var60 * var62 >> 16;
                var64 = var60 * var64 - var59 * var62 >> 16;
                var62 = var65;
            }
            int var66 = arg5 + var62;
            int var67 = arg6 + var63;
            int var68 = arg7 + var64;
            int var69 = arg3 * var68 + arg4 * var66 >> 16;
            int var70 = arg4 * var68 - arg3 * var66 >> 16;
            int var72 = arg2 * var67 - arg1 * var70 >> 16;
            int var73 = arg1 * var67 + arg2 * var70 >> 16;
            field1845[var61] = var73 - var11;
            if (var73 >= 50) {
                field1843[var61] = class134.field1898 * var69 / var73 + var57;
                field1844[var61] = class134.field1898 * var72 / var73 + var58;
            } else {
                field1843[var61] = -5000;
                var23 = true;
            }
            if (var25) {
                field1815[var61] = var69;
                field1847[var61] = var72;
                field1848[var61] = var73;
            }
        }
        try {
            this.method2511(var23, var48, this.field1828, arg8);
        } catch (Exception var76) {
        }
    }

    @ObfuscatedName("ee.am(ZZZI)V")
    public final void method2511(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1802 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1802; var5++) {
            field1821[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field224 && arg1) {
            Statics.method4138(this, var6);
        }
        for (int var7 = 0; var7 < this.field1810; var7++) {
            if (this.field1870[var7] != -2) {
                int var8 = this.field1811[var7];
                int var9 = this.field1839[var7];
                int var10 = this.field1813[var7];
                int var11 = field1843[var8];
                int var12 = field1843[var9];
                int var13 = field1843[var10];
                if (arg0 && var11 == -5000 || var12 == -5000 || var13 == -5000) {
                    int var14 = field1815[var8];
                    int var15 = field1815[var9];
                    int var16 = field1815[var10];
                    int var17 = field1847[var8];
                    int var18 = field1847[var9];
                    int var19 = field1847[var10];
                    int var20 = field1848[var8];
                    int var21 = field1848[var9];
                    int var22 = field1848[var10];
                    int var23 = var14 - var15;
                    int var24 = var16 - var15;
                    int var25 = var17 - var18;
                    int var26 = var19 - var18;
                    int var27 = var20 - var21;
                    int var28 = var22 - var21;
                    int var29 = var25 * var28 - var26 * var27;
                    int var30 = var24 * var27 - var23 * var28;
                    int var31 = var23 * var26 - var24 * var25;
                    if (var21 * var31 + var15 * var29 + var18 * var30 > 0) {
                        field1862[var7] = true;
                        int var32 = (field1845[var8] + field1845[var9] + field1845[var10]) / 3 + this.field1841;
                        field1851[var32][field1821[var32]++] = var7;
                    }
                } else {
                    if (arg1) {
                        int var33 = field1844[var8];
                        int var34 = field1844[var9];
                        int var35 = field1844[var10];
                        int var36 = class132.field1874 + var6;
                        boolean var37;
                        if (var36 < var33 && var36 < var34 && var36 < var35) {
                            var37 = false;
                        } else {
                            int var38 = class132.field1874 - var6;
                            if (var38 > var33 && var38 > var34 && var38 > var35) {
                                var37 = false;
                            } else {
                                int var39 = class132.field1875 + var6;
                                if (var39 < var11 && var39 < var12 && var39 < var13) {
                                    var37 = false;
                                } else {
                                    int var40 = class132.field1875 - var6;
                                    if (var40 > var11 && var40 > var12 && var40 > var13) {
                                        var37 = false;
                                    } else {
                                        var37 = true;
                                    }
                                }
                            }
                        }
                        if (var37) {
                            class132.method229(arg3);
                            arg1 = false;
                        }
                    }
                    if ((field1844[var10] - field1844[var9]) * (var11 - var12) - (field1844[var8] - field1844[var9]) * (var13 - var12) > 0) {
                        field1862[var7] = false;
                        if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= Statics.field1905 && var12 <= Statics.field1905 && var13 <= Statics.field1905) {
                            field1853[var7] = false;
                        } else {
                            field1853[var7] = true;
                        }
                        int var41 = (field1845[var8] + field1845[var9] + field1845[var10]) / 3 + this.field1841;
                        field1851[var41][field1821[var41]++] = var7;
                    }
                }
            }
        }
        if (this.field1817 == null) {
            for (int var42 = this.field1802 - 1; var42 >= 0; var42--) {
                int var43 = field1821[var42];
                if (var43 > 0) {
                    int[] var44 = field1851[var42];
                    for (int var45 = 0; var45 < var43; var45++) {
                        this.method2542(var44[var45]);
                    }
                }
            }
            return;
        }
        for (int var46 = 0; var46 < 12; var46++) {
            field1825[var46] = 0;
            field1856[var46] = 0;
        }
        for (int var47 = this.field1802 - 1; var47 >= 0; var47--) {
            int var48 = field1821[var47];
            if (var48 > 0) {
                int[] var49 = field1851[var47];
                for (int var50 = 0; var50 < var48; var50++) {
                    int var51 = var49[var50];
                    byte var52 = this.field1817[var51];
                    int var53 = field1825[var52]++;
                    field1829[var52][var53] = var51;
                    if (var52 < 10) {
                        field1856[var52] += var47;
                    } else if (var52 == 10) {
                        field1854[var53] = var47;
                    } else {
                        field1855[var53] = var47;
                    }
                }
            }
        }
        int var54 = 0;
        if (field1825[1] > 0 || field1825[2] > 0) {
            var54 = (field1856[1] + field1856[2]) / (field1825[1] + field1825[2]);
        }
        int var55 = 0;
        if (field1825[3] > 0 || field1825[4] > 0) {
            var55 = (field1856[3] + field1856[4]) / (field1825[3] + field1825[4]);
        }
        int var56 = 0;
        if (field1825[6] > 0 || field1825[8] > 0) {
            var56 = (field1856[6] + field1856[8]) / (field1825[6] + field1825[8]);
        }
        int var57 = 0;
        int var58 = field1825[10];
        int[] var59 = field1829[10];
        int[] var60 = field1854;
        if (var57 == var58) {
            var57 = 0;
            var58 = field1825[11];
            var59 = field1829[11];
            var60 = field1855;
        }
        int var61;
        if (var57 < var58) {
            var61 = var60[var57];
        } else {
            var61 = -1000;
        }
        for (int var62 = 0; var62 < 10; var62++) {
            while (var62 == 0 && var61 > var54) {
                this.method2542(var59[var57++]);
                if (var57 == var58 && field1829[11] != var59) {
                    var57 = 0;
                    var58 = field1825[11];
                    var59 = field1829[11];
                    var60 = field1855;
                }
                if (var57 < var58) {
                    var61 = var60[var57];
                } else {
                    var61 = -1000;
                }
            }
            while (var62 == 3 && var61 > var55) {
                this.method2542(var59[var57++]);
                if (var57 == var58 && field1829[11] != var59) {
                    var57 = 0;
                    var58 = field1825[11];
                    var59 = field1829[11];
                    var60 = field1855;
                }
                if (var57 < var58) {
                    var61 = var60[var57];
                } else {
                    var61 = -1000;
                }
            }
            while (var62 == 5 && var61 > var56) {
                this.method2542(var59[var57++]);
                if (var57 == var58 && field1829[11] != var59) {
                    var57 = 0;
                    var58 = field1825[11];
                    var59 = field1829[11];
                    var60 = field1855;
                }
                if (var57 < var58) {
                    var61 = var60[var57];
                } else {
                    var61 = -1000;
                }
            }
            int var63 = field1825[var62];
            int[] var64 = field1829[var62];
            for (int var65 = 0; var65 < var63; var65++) {
                this.method2542(var64[var65]);
            }
        }
        while (var61 != -1000) {
            this.method2542(var59[var57++]);
            if (var57 == var58 && field1829[11] != var59) {
                var57 = 0;
                var59 = field1829[11];
                var58 = field1825[11];
                var60 = field1855;
            }
            if (var57 < var58) {
                var61 = var60[var57];
            } else {
                var61 = -1000;
            }
        }
    }

    @ObfuscatedName("ee.aj(I)V")
    public final void method2542(int arg0) {
        if (field1862[arg0]) {
            this.method2512(arg0);
            return;
        }
        int var2 = this.field1811[arg0];
        int var3 = this.field1839[arg0];
        int var4 = this.field1813[arg0];
        class134.field1916 = field1853[arg0];
        if (this.field1818 == null) {
            class134.field1895 = 0;
        } else {
            class134.field1895 = this.field1818[arg0] & 0xFF;
        }
        if (this.field1833 != null && this.field1833[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1819 == null || this.field1819[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1819[arg0] & 0xFF;
                var6 = this.field1814[var5];
                var7 = this.field1824[var5];
                var8 = this.field1812[var5];
            }
            if (this.field1870[arg0] == -1) {
                class134.method2606(field1844[var2], field1844[var3], field1844[var4], field1843[var2], field1843[var3], field1843[var4], this.field1842[arg0], this.field1842[arg0], this.field1842[arg0], field1815[var6], field1815[var7], field1815[var8], field1847[var6], field1847[var7], field1847[var8], field1848[var6], field1848[var7], field1848[var8], this.field1833[arg0]);
            } else {
                class134.method2606(field1844[var2], field1844[var3], field1844[var4], field1843[var2], field1843[var3], field1843[var4], this.field1842[arg0], this.field1832[arg0], this.field1870[arg0], field1815[var6], field1815[var7], field1815[var8], field1847[var6], field1847[var7], field1847[var8], field1848[var6], field1848[var7], field1848[var8], this.field1833[arg0]);
            }
        } else if (this.field1870[arg0] == -1) {
            class134.method2604(field1844[var2], field1844[var3], field1844[var4], field1843[var2], field1843[var3], field1843[var4], field1807[this.field1842[arg0]]);
        } else {
            class134.method2602(field1844[var2], field1844[var3], field1844[var4], field1843[var2], field1843[var3], field1843[var4], this.field1842[arg0], this.field1832[arg0], this.field1870[arg0]);
        }
    }

    @ObfuscatedName("ee.ah(I)V")
    public final void method2512(int arg0) {
        int var2 = Statics.field1903;
        int var3 = Statics.field1904;
        int var4 = 0;
        int var5 = this.field1811[arg0];
        int var6 = this.field1839[arg0];
        int var7 = this.field1813[arg0];
        int var8 = field1848[var5];
        int var9 = field1848[var6];
        int var10 = field1848[var7];
        if (this.field1818 == null) {
            class134.field1895 = 0;
        } else {
            class134.field1895 = this.field1818[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1857[var4] = field1843[var5];
            field1846[var4] = field1844[var5];
            field1859[var4++] = this.field1842[arg0];
        } else {
            int var11 = field1815[var5];
            int var12 = field1847[var5];
            int var13 = this.field1842[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1869[var10 - var8];
                field1857[var4] = (((field1815[var7] - var11) * var14 >> 16) + var11) * class134.field1898 / 50 + var2;
                field1846[var4] = (((field1847[var7] - var12) * var14 >> 16) + var12) * class134.field1898 / 50 + var3;
                field1859[var4++] = ((this.field1870[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1869[var9 - var8];
                field1857[var4] = (((field1815[var6] - var11) * var15 >> 16) + var11) * class134.field1898 / 50 + var2;
                field1846[var4] = (((field1847[var6] - var12) * var15 >> 16) + var12) * class134.field1898 / 50 + var3;
                field1859[var4++] = ((this.field1832[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1857[var4] = field1843[var6];
            field1846[var4] = field1844[var6];
            field1859[var4++] = this.field1832[arg0];
        } else {
            int var16 = field1815[var6];
            int var17 = field1847[var6];
            int var18 = this.field1832[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1869[var8 - var9];
                field1857[var4] = (((field1815[var5] - var16) * var19 >> 16) + var16) * class134.field1898 / 50 + var2;
                field1846[var4] = (((field1847[var5] - var17) * var19 >> 16) + var17) * class134.field1898 / 50 + var3;
                field1859[var4++] = ((this.field1842[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1869[var10 - var9];
                field1857[var4] = (((field1815[var7] - var16) * var20 >> 16) + var16) * class134.field1898 / 50 + var2;
                field1846[var4] = (((field1847[var7] - var17) * var20 >> 16) + var17) * class134.field1898 / 50 + var3;
                field1859[var4++] = ((this.field1870[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1857[var4] = field1843[var7];
            field1846[var4] = field1844[var7];
            field1859[var4++] = this.field1870[arg0];
        } else {
            int var21 = field1815[var7];
            int var22 = field1847[var7];
            int var23 = this.field1870[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1869[var9 - var10];
                field1857[var4] = (((field1815[var6] - var21) * var24 >> 16) + var21) * class134.field1898 / 50 + var2;
                field1846[var4] = (((field1847[var6] - var22) * var24 >> 16) + var22) * class134.field1898 / 50 + var3;
                field1859[var4++] = ((this.field1832[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1869[var8 - var10];
                field1857[var4] = (((field1815[var5] - var21) * var25 >> 16) + var21) * class134.field1898 / 50 + var2;
                field1846[var4] = (((field1847[var5] - var22) * var25 >> 16) + var22) * class134.field1898 / 50 + var3;
                field1859[var4++] = ((this.field1842[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1857[0];
        int var27 = field1857[1];
        int var28 = field1857[2];
        int var29 = field1846[0];
        int var30 = field1846[1];
        int var31 = field1846[2];
        class134.field1916 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1905 || var27 > Statics.field1905 || var28 > Statics.field1905) {
                class134.field1916 = true;
            }
            if (this.field1833 != null && this.field1833[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1819 == null || this.field1819[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1819[arg0] & 0xFF;
                    var33 = this.field1814[var32];
                    var34 = this.field1824[var32];
                    var35 = this.field1812[var32];
                }
                if (this.field1870[arg0] == -1) {
                    class134.method2606(var29, var30, var31, var26, var27, var28, this.field1842[arg0], this.field1842[arg0], this.field1842[arg0], field1815[var33], field1815[var34], field1815[var35], field1847[var33], field1847[var34], field1847[var35], field1848[var33], field1848[var34], field1848[var35], this.field1833[arg0]);
                } else {
                    class134.method2606(var29, var30, var31, var26, var27, var28, field1859[0], field1859[1], field1859[2], field1815[var33], field1815[var34], field1815[var35], field1847[var33], field1847[var34], field1847[var35], field1848[var33], field1848[var34], field1848[var35], this.field1833[arg0]);
                }
            } else if (this.field1870[arg0] == -1) {
                class134.method2604(var29, var30, var31, var26, var27, var28, field1807[this.field1842[arg0]]);
            } else {
                class134.method2602(var29, var30, var31, var26, var27, var28, field1859[0], field1859[1], field1859[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1905 || var27 > Statics.field1905 || var28 > Statics.field1905 || field1857[3] < 0 || field1857[3] > Statics.field1905) {
            class134.field1916 = true;
        }
        if (this.field1833 != null && this.field1833[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1819 == null || this.field1819[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1819[arg0] & 0xFF;
                var37 = this.field1814[var36];
                var38 = this.field1824[var36];
                var39 = this.field1812[var36];
            }
            short var40 = this.field1833[arg0];
            if (this.field1870[arg0] == -1) {
                class134.method2606(var29, var30, var31, var26, var27, var28, this.field1842[arg0], this.field1842[arg0], this.field1842[arg0], field1815[var37], field1815[var38], field1815[var39], field1847[var37], field1847[var38], field1847[var39], field1848[var37], field1848[var38], field1848[var39], var40);
                class134.method2606(var29, var31, field1846[3], var26, var28, field1857[3], this.field1842[arg0], this.field1842[arg0], this.field1842[arg0], field1815[var37], field1815[var38], field1815[var39], field1847[var37], field1847[var38], field1847[var39], field1848[var37], field1848[var38], field1848[var39], var40);
            } else {
                class134.method2606(var29, var30, var31, var26, var27, var28, field1859[0], field1859[1], field1859[2], field1815[var37], field1815[var38], field1815[var39], field1847[var37], field1847[var38], field1847[var39], field1848[var37], field1848[var38], field1848[var39], var40);
                class134.method2606(var29, var31, field1846[3], var26, var28, field1857[3], field1859[0], field1859[2], field1859[3], field1815[var37], field1815[var38], field1815[var39], field1847[var37], field1847[var38], field1847[var39], field1848[var37], field1848[var38], field1848[var39], var40);
            }
        } else if (this.field1870[arg0] == -1) {
            int var41 = field1807[this.field1842[arg0]];
            class134.method2604(var29, var30, var31, var26, var27, var28, var41);
            class134.method2604(var29, var31, field1846[3], var26, var28, field1857[3], var41);
        } else {
            class134.method2602(var29, var30, var31, var26, var27, var28, field1859[0], field1859[1], field1859[2]);
            class134.method2602(var29, var31, field1846[3], var26, var28, field1857[3], field1859[0], field1859[2], field1859[3]);
        }
    }
}
