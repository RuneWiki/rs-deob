package deob;

@ObfuscatedName("db")
public class class105 extends class85 {

    @ObfuscatedName("db.h")
    public static class105 field1835 = new class105();

    @ObfuscatedName("db.m")
    public static byte[] field1793 = new byte[1];

    @ObfuscatedName("db.i")
    public static class105 field1794 = new class105();

    @ObfuscatedName("db.q")
    public static byte[] field1824 = new byte[1];

    @ObfuscatedName("db.p")
    public int field1830 = 0;

    @ObfuscatedName("db.c")
    public int[] field1797;

    @ObfuscatedName("db.f")
    public int[] field1798;

    @ObfuscatedName("db.y")
    public int[] field1837;

    @ObfuscatedName("db.w")
    public int field1857 = 0;

    @ObfuscatedName("db.l")
    public int[] field1801;

    @ObfuscatedName("db.v")
    public int[] field1802;

    @ObfuscatedName("db.k")
    public int[] field1799;

    @ObfuscatedName("db.o")
    public int[] field1804;

    @ObfuscatedName("db.u")
    public int[] field1805;

    @ObfuscatedName("db.s")
    public int[] field1806;

    @ObfuscatedName("db.g")
    public byte[] field1839;

    @ObfuscatedName("db.x")
    public byte[] field1808;

    @ObfuscatedName("db.a")
    public byte[] field1843;

    @ObfuscatedName("db.t")
    public short[] field1811;

    @ObfuscatedName("db.z")
    public byte field1796 = 0;

    @ObfuscatedName("db.r")
    public int field1800 = 0;

    @ObfuscatedName("db.d")
    public int[] field1795;

    @ObfuscatedName("db.n")
    public int[] field1814;

    @ObfuscatedName("db.j")
    public int[] field1815;

    @ObfuscatedName("db.b")
    public int[][] field1803;

    @ObfuscatedName("db.e")
    public int[][] field1817;

    @ObfuscatedName("db.ai")
    public boolean field1807 = false;

    @ObfuscatedName("db.ao")
    public int field1819;

    @ObfuscatedName("db.af")
    public int field1820;

    @ObfuscatedName("db.ab")
    public int field1831;

    @ObfuscatedName("db.ax")
    public int field1822;

    @ObfuscatedName("db.ap")
    public int field1812;

    @ObfuscatedName("db.av")
    public static boolean[] field1825 = new boolean[4096];

    @ObfuscatedName("db.am")
    public static boolean[] field1826 = new boolean[4096];

    @ObfuscatedName("db.aa")
    public static int[] field1827 = new int[4096];

    @ObfuscatedName("db.aq")
    public static int[] field1818 = new int[4096];

    @ObfuscatedName("db.ad")
    public static int[] field1829 = new int[4096];

    @ObfuscatedName("db.ar")
    public static int[] field1816 = new int[4096];

    @ObfuscatedName("db.ag")
    public static int[] field1823 = new int[4096];

    @ObfuscatedName("db.ae")
    public static int[] field1832 = new int[4096];

    @ObfuscatedName("db.az")
    public static int[] field1834 = new int[1600];

    @ObfuscatedName("db.ac")
    public static int[][] field1810 = new int[1600][512];

    @ObfuscatedName("db.ay")
    public static int[] field1836 = new int[12];

    @ObfuscatedName("db.al")
    public static int[][] field1828 = new int[12][2000];

    @ObfuscatedName("db.at")
    public static int[] field1838 = new int[2000];

    @ObfuscatedName("db.aj")
    public static int[] field1821 = new int[2000];

    @ObfuscatedName("db.aw")
    public static int[] field1840 = new int[12];

    @ObfuscatedName("db.au")
    public static int[] field1841 = new int[10];

    @ObfuscatedName("db.ah")
    public static int[] field1842 = new int[10];

    @ObfuscatedName("db.an")
    public static int[] field1849 = new int[10];

    @ObfuscatedName("db.ba")
    public static boolean field1847 = false;

    @ObfuscatedName("db.bj")
    public static int field1813 = 0;

    @ObfuscatedName("db.bx")
    public static int field1856 = 0;

    @ObfuscatedName("db.bi")
    public static int field1850 = 0;

    @ObfuscatedName("db.be")
    public static int[] field1851 = new int[1000];

    @ObfuscatedName("db.bp")
    public static int[] field1852 = class91.field1561;

    @ObfuscatedName("db.br")
    public static int[] field1853 = class91.field1585;

    @ObfuscatedName("db.by")
    public static int[] field1854 = class91.field1580;

    @ObfuscatedName("db.bs")
    public static int[] field1855 = class91.field1584;

    public class105() {
    }

    public class105(class105[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1830 = 0;
        this.field1857 = 0;
        this.field1800 = 0;
        this.field1796 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class105 var8 = arg0[var7];
            if (var8 != null) {
                this.field1830 += var8.field1830;
                this.field1857 += var8.field1857;
                this.field1800 += var8.field1800;
                if (var8.field1839 == null) {
                    if (this.field1796 == -1) {
                        this.field1796 = var8.field1796;
                    }
                    if (this.field1796 != var8.field1796) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1808 != null;
                var5 |= var8.field1811 != null;
                var6 |= var8.field1843 != null;
            }
        }
        this.field1797 = new int[this.field1830];
        this.field1798 = new int[this.field1830];
        this.field1837 = new int[this.field1830];
        this.field1801 = new int[this.field1857];
        this.field1802 = new int[this.field1857];
        this.field1799 = new int[this.field1857];
        this.field1804 = new int[this.field1857];
        this.field1805 = new int[this.field1857];
        this.field1806 = new int[this.field1857];
        if (var3) {
            this.field1839 = new byte[this.field1857];
        }
        if (var4) {
            this.field1808 = new byte[this.field1857];
        }
        if (var5) {
            this.field1811 = new short[this.field1857];
        }
        if (var6) {
            this.field1843 = new byte[this.field1857];
        }
        if (this.field1800 > 0) {
            this.field1795 = new int[this.field1800];
            this.field1814 = new int[this.field1800];
            this.field1815 = new int[this.field1800];
        }
        this.field1830 = 0;
        this.field1857 = 0;
        this.field1800 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class105 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1857; var11++) {
                    this.field1801[this.field1857] = var10.field1801[var11] + this.field1830;
                    this.field1802[this.field1857] = var10.field1802[var11] + this.field1830;
                    this.field1799[this.field1857] = var10.field1799[var11] + this.field1830;
                    this.field1804[this.field1857] = var10.field1804[var11];
                    this.field1805[this.field1857] = var10.field1805[var11];
                    this.field1806[this.field1857] = var10.field1806[var11];
                    if (var3) {
                        if (var10.field1839 == null) {
                            this.field1839[this.field1857] = var10.field1796;
                        } else {
                            this.field1839[this.field1857] = var10.field1839[var11];
                        }
                    }
                    if (var4 && var10.field1808 != null) {
                        this.field1808[this.field1857] = var10.field1808[var11];
                    }
                    if (var5) {
                        if (var10.field1811 == null) {
                            this.field1811[this.field1857] = -1;
                        } else {
                            this.field1811[this.field1857] = var10.field1811[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1843 == null || var10.field1843[var11] == -1) {
                            this.field1843[this.field1857] = -1;
                        } else {
                            this.field1843[this.field1857] = (byte) (var10.field1843[var11] + this.field1800);
                        }
                    }
                    this.field1857++;
                }
                for (int var12 = 0; var12 < var10.field1800; var12++) {
                    this.field1795[this.field1800] = var10.field1795[var12] + this.field1830;
                    this.field1814[this.field1800] = var10.field1814[var12] + this.field1830;
                    this.field1815[this.field1800] = var10.field1815[var12] + this.field1830;
                    this.field1800++;
                }
                for (int var13 = 0; var13 < var10.field1830; var13++) {
                    this.field1797[this.field1830] = var10.field1797[var13];
                    this.field1798[this.field1830] = var10.field1798[var13];
                    this.field1837[this.field1830] = var10.field1837[var13];
                    this.field1830++;
                }
            }
        }
    }

    @ObfuscatedName("db.h([[IIIIZI)Ldb;")
    public class105 method2145(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2121();
        int var7 = arg1 - this.field1831;
        int var8 = this.field1831 + arg1;
        int var9 = arg3 - this.field1831;
        int var10 = this.field1831 + arg3;
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
        class105 var15;
        if (arg4) {
            var15 = new class105();
            var15.field1830 = this.field1830;
            var15.field1857 = this.field1857;
            var15.field1800 = this.field1800;
            var15.field1797 = this.field1797;
            var15.field1837 = this.field1837;
            var15.field1801 = this.field1801;
            var15.field1802 = this.field1802;
            var15.field1799 = this.field1799;
            var15.field1804 = this.field1804;
            var15.field1805 = this.field1805;
            var15.field1806 = this.field1806;
            var15.field1839 = this.field1839;
            var15.field1808 = this.field1808;
            var15.field1843 = this.field1843;
            var15.field1811 = this.field1811;
            var15.field1796 = this.field1796;
            var15.field1795 = this.field1795;
            var15.field1814 = this.field1814;
            var15.field1815 = this.field1815;
            var15.field1803 = this.field1803;
            var15.field1817 = this.field1817;
            var15.field1807 = this.field1807;
            var15.field1798 = new int[var15.field1830];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1830; var16++) {
                int var17 = this.field1797[var16] + arg1;
                int var18 = this.field1837[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1798[var16] = this.field1798[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1830; var26++) {
                int var27 = (-this.field1798[var26] << 16) / this.field1458;
                if (var27 < arg5) {
                    int var28 = this.field1797[var26] + arg1;
                    int var29 = this.field1837[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1798[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1798[var26];
                }
            }
        }
        var15.field1819 = 0;
        return var15;
    }

    @ObfuscatedName("db.m(Z)Ldb;")
    public class105 method2118(boolean arg0) {
        if (!arg0 && field1793.length < this.field1857) {
            field1793 = new byte[this.field1857 + 100];
        }
        return this.method2144(arg0, field1835, field1793);
    }

    @ObfuscatedName("db.q(Z)Ldb;")
    public class105 method2119(boolean arg0) {
        if (!arg0 && field1824.length < this.field1857) {
            field1824 = new byte[this.field1857 + 100];
        }
        return this.method2144(arg0, field1794, field1824);
    }

    @ObfuscatedName("db.p(ZLdb;[B)Ldb;")
    public class105 method2144(boolean arg0, class105 arg1, byte[] arg2) {
        arg1.field1830 = this.field1830;
        arg1.field1857 = this.field1857;
        arg1.field1800 = this.field1800;
        if (arg1.field1797 == null || arg1.field1797.length < this.field1830) {
            arg1.field1797 = new int[this.field1830 + 100];
            arg1.field1798 = new int[this.field1830 + 100];
            arg1.field1837 = new int[this.field1830 + 100];
        }
        for (int var4 = 0; var4 < this.field1830; var4++) {
            arg1.field1797[var4] = this.field1797[var4];
            arg1.field1798[var4] = this.field1798[var4];
            arg1.field1837[var4] = this.field1837[var4];
        }
        if (arg0) {
            arg1.field1808 = this.field1808;
        } else {
            arg1.field1808 = arg2;
            if (this.field1808 == null) {
                for (int var5 = 0; var5 < this.field1857; var5++) {
                    arg1.field1808[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1857; var6++) {
                    arg1.field1808[var6] = this.field1808[var6];
                }
            }
        }
        arg1.field1801 = this.field1801;
        arg1.field1802 = this.field1802;
        arg1.field1799 = this.field1799;
        arg1.field1804 = this.field1804;
        arg1.field1805 = this.field1805;
        arg1.field1806 = this.field1806;
        arg1.field1839 = this.field1839;
        arg1.field1843 = this.field1843;
        arg1.field1811 = this.field1811;
        arg1.field1796 = this.field1796;
        arg1.field1795 = this.field1795;
        arg1.field1814 = this.field1814;
        arg1.field1815 = this.field1815;
        arg1.field1803 = this.field1803;
        arg1.field1817 = this.field1817;
        arg1.field1807 = this.field1807;
        arg1.field1819 = 0;
        return arg1;
    }

    @ObfuscatedName("db.c()V")
    public void method2121() {
        if (this.field1819 == 1) {
            return;
        }
        this.field1819 = 1;
        this.field1458 = 0;
        this.field1820 = 0;
        this.field1831 = 0;
        for (int var1 = 0; var1 < this.field1830; var1++) {
            int var2 = this.field1797[var1];
            int var3 = this.field1798[var1];
            int var4 = this.field1837[var1];
            if (-var3 > this.field1458) {
                this.field1458 = -var3;
            }
            if (var3 > this.field1820) {
                this.field1820 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1831) {
                this.field1831 = var5;
            }
        }
        this.field1831 = (int) (Math.sqrt((double) this.field1831) + 0.99D);
        this.field1812 = (int) (Math.sqrt((double) (this.field1458 * this.field1458 + this.field1831 * this.field1831)) + 0.99D);
        this.field1822 = this.field1812 + (int) (Math.sqrt((double) (this.field1831 * this.field1831 + this.field1820 * this.field1820)) + 0.99D);
    }

    @ObfuscatedName("db.f()V")
    public void method2122() {
        if (this.field1819 == 2) {
            return;
        }
        this.field1819 = 2;
        this.field1831 = 0;
        for (int var1 = 0; var1 < this.field1830; var1++) {
            int var2 = this.field1797[var1];
            int var3 = this.field1798[var1];
            int var4 = this.field1837[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1831) {
                this.field1831 = var5;
            }
        }
        this.field1831 = (int) (Math.sqrt((double) this.field1831) + 0.99D);
        this.field1812 = this.field1831;
        this.field1822 = this.field1831 + this.field1831;
    }

    @ObfuscatedName("db.y()I")
    public int method2123() {
        this.method2121();
        return this.field1831;
    }

    @ObfuscatedName("db.w(Lcp;I)V")
    public void method2143(class103 arg0, int arg1) {
        if (this.field1803 == null || arg1 == -1) {
            return;
        }
        class88 var3 = arg0.field1770[arg1];
        class102 var4 = var3.field1540;
        Statics.field1844 = 0;
        Statics.field1845 = 0;
        Statics.field1846 = 0;
        for (int var5 = 0; var5 < var3.field1541; var5++) {
            int var6 = var3.field1542[var5];
            this.method2126(var4.field1761[var6], var4.field1762[var6], var3.field1543[var5], var3.field1539[var5], var3.field1546[var5]);
        }
        this.field1819 = 0;
    }

    @ObfuscatedName("db.l(Lcp;ILcp;I[I)V")
    public void method2177(class103 arg0, int arg1, class103 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2143(arg0, arg1);
            return;
        }
        class88 var6 = arg0.field1770[arg1];
        class88 var7 = arg2.field1770[arg3];
        class102 var8 = var6.field1540;
        Statics.field1844 = 0;
        Statics.field1845 = 0;
        Statics.field1846 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1541; var11++) {
            int var12 = var6.field1542[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1761[var12] == 0) {
                this.method2126(var8.field1761[var12], var8.field1762[var12], var6.field1543[var11], var6.field1539[var11], var6.field1546[var11]);
            }
        }
        Statics.field1844 = 0;
        Statics.field1845 = 0;
        Statics.field1846 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1541; var15++) {
            int var16 = var7.field1542[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1761[var16] == 0) {
                this.method2126(var8.field1761[var16], var8.field1762[var16], var7.field1543[var15], var7.field1539[var15], var7.field1546[var15]);
            }
        }
        this.field1819 = 0;
    }

    @ObfuscatedName("db.v(I[IIII)V")
    public void method2126(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1844 = 0;
            Statics.field1845 = 0;
            Statics.field1846 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1803.length) {
                    int[] var10 = this.field1803[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1844 += this.field1797[var12];
                        Statics.field1845 += this.field1798[var12];
                        Statics.field1846 += this.field1837[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1844 = Statics.field1844 / var7 + arg2;
                Statics.field1845 = Statics.field1845 / var7 + arg3;
                Statics.field1846 = Statics.field1846 / var7 + arg4;
            } else {
                Statics.field1844 = arg2;
                Statics.field1845 = arg3;
                Statics.field1846 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1803.length) {
                    int[] var15 = this.field1803[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1797[var17] += arg2;
                        this.field1798[var17] += arg3;
                        this.field1837[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1803.length) {
                    int[] var20 = this.field1803[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1797[var22] -= Statics.field1844;
                        this.field1798[var22] -= Statics.field1845;
                        this.field1837[var22] -= Statics.field1846;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1852[var25];
                            int var27 = field1853[var25];
                            int var28 = this.field1798[var22] * var26 + this.field1797[var22] * var27 >> 16;
                            this.field1798[var22] = this.field1798[var22] * var27 - this.field1797[var22] * var26 >> 16;
                            this.field1797[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1852[var23];
                            int var30 = field1853[var23];
                            int var31 = this.field1798[var22] * var30 - this.field1837[var22] * var29 >> 16;
                            this.field1837[var22] = this.field1837[var22] * var30 + this.field1798[var22] * var29 >> 16;
                            this.field1798[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1852[var24];
                            int var33 = field1853[var24];
                            int var34 = this.field1837[var22] * var32 + this.field1797[var22] * var33 >> 16;
                            this.field1837[var22] = this.field1837[var22] * var33 - this.field1797[var22] * var32 >> 16;
                            this.field1797[var22] = var34;
                        }
                        this.field1797[var22] += Statics.field1844;
                        this.field1798[var22] += Statics.field1845;
                        this.field1837[var22] += Statics.field1846;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1803.length) {
                    int[] var37 = this.field1803[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1797[var39] -= Statics.field1844;
                        this.field1798[var39] -= Statics.field1845;
                        this.field1837[var39] -= Statics.field1846;
                        this.field1797[var39] = this.field1797[var39] * arg2 / 128;
                        this.field1798[var39] = this.field1798[var39] * arg3 / 128;
                        this.field1837[var39] = this.field1837[var39] * arg4 / 128;
                        this.field1797[var39] += Statics.field1844;
                        this.field1798[var39] += Statics.field1845;
                        this.field1837[var39] += Statics.field1846;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1817 != null && this.field1808 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1817.length) {
                    int[] var42 = this.field1817[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1808[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1808[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("db.k()V")
    public void method2127() {
        for (int var1 = 0; var1 < this.field1830; var1++) {
            int var2 = this.field1797[var1];
            this.field1797[var1] = this.field1837[var1];
            this.field1837[var1] = -var2;
        }
        this.field1819 = 0;
    }

    @ObfuscatedName("db.o()V")
    public void method2128() {
        for (int var1 = 0; var1 < this.field1830; var1++) {
            this.field1797[var1] = -this.field1797[var1];
            this.field1837[var1] = -this.field1837[var1];
        }
        this.field1819 = 0;
    }

    @ObfuscatedName("db.u()V")
    public void method2178() {
        for (int var1 = 0; var1 < this.field1830; var1++) {
            int var2 = this.field1837[var1];
            this.field1837[var1] = this.field1797[var1];
            this.field1797[var1] = -var2;
        }
        this.field1819 = 0;
    }

    @ObfuscatedName("db.s(I)V")
    public void method2129(int arg0) {
        int var2 = field1852[arg0];
        int var3 = field1853[arg0];
        for (int var4 = 0; var4 < this.field1830; var4++) {
            int var5 = this.field1798[var4] * var3 - this.field1837[var4] * var2 >> 16;
            this.field1837[var4] = this.field1837[var4] * var3 + this.field1798[var4] * var2 >> 16;
            this.field1798[var4] = var5;
        }
        this.field1819 = 0;
    }

    @ObfuscatedName("db.g(III)V")
    public void method2130(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1830; var4++) {
            this.field1797[var4] += arg0;
            this.field1798[var4] += arg1;
            this.field1837[var4] += arg2;
        }
        this.field1819 = 0;
    }

    @ObfuscatedName("db.z(III)V")
    public void method2131(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1830; var4++) {
            this.field1797[var4] = this.field1797[var4] * arg0 / 128;
            this.field1798[var4] = this.field1798[var4] * arg1 / 128;
            this.field1837[var4] = this.field1837[var4] * arg2 / 128;
        }
        this.field1819 = 0;
    }

    @ObfuscatedName("db.r(IIIIIII)V")
    public final void method2132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1834[0] = -1;
        if (this.field1819 != 2 && this.field1819 != 1) {
            this.method2122();
        }
        int var8 = Statics.field1571;
        int var9 = Statics.field1565;
        int var10 = field1852[arg0];
        int var11 = field1853[arg0];
        int var12 = field1852[arg1];
        int var13 = field1853[arg1];
        int var14 = field1852[arg2];
        int var15 = field1853[arg2];
        int var16 = field1852[arg3];
        int var17 = field1853[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1830; var19++) {
            int var20 = this.field1797[var19];
            int var21 = this.field1798[var19];
            int var22 = this.field1837[var19];
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
            field1829[var19] = var30 - var18;
            field1827[var19] = class91.field1570 * var26 / var30 + var8;
            field1818[var19] = class91.field1570 * var29 / var30 + var9;
            if (this.field1800 > 0) {
                field1816[var19] = var26;
                field1823[var19] = var29;
                field1832[var19] = var30;
            }
        }
        try {
            this.method2135(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("db.d(IIIIIIII)V")
    public final void method2133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1834[0] = -1;
        if (this.field1819 != 2 && this.field1819 != 1) {
            this.method2122();
        }
        int var9 = Statics.field1571;
        int var10 = Statics.field1565;
        int var11 = field1852[arg0];
        int var12 = field1853[arg0];
        int var13 = field1852[arg1];
        int var14 = field1853[arg1];
        int var15 = field1852[arg2];
        int var16 = field1853[arg2];
        int var17 = field1852[arg3];
        int var18 = field1853[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1830; var20++) {
            int var21 = this.field1797[var20];
            int var22 = this.field1798[var20];
            int var23 = this.field1837[var20];
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
            field1829[var20] = var31 - var19;
            field1827[var20] = class91.field1570 * var27 / arg7 + var9;
            field1818[var20] = class91.field1570 * var30 / arg7 + var10;
            if (this.field1800 > 0) {
                field1816[var20] = var27;
                field1823[var20] = var30;
                field1832[var20] = var31;
            }
        }
        try {
            this.method2135(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("db.ap(IIIIIIIII)V")
    public void method1749(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1834[0] = -1;
        if (this.field1819 != 1) {
            this.method2121();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1831 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1831) * class91.field1570;
        if (var15 / var13 >= Statics.field1583) {
            return;
        }
        int var16 = (this.field1831 + var14) * class91.field1570;
        if (var16 / var13 <= Statics.field1575) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1831 * arg1 >> 16;
        int var19 = (var17 + var18) * class91.field1570;
        if (var19 / var13 <= Statics.field1577) {
            return;
        }
        int var20 = (this.field1458 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class91.field1570;
        if (var21 / var13 >= Statics.field1578) {
            return;
        }
        int var22 = (this.field1458 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1800 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1847) {
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
            int var32 = field1813 - Statics.field1571;
            int var33 = field1856 - Statics.field1565;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1807) {
                    field1851[field1850++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1571;
        int var35 = Statics.field1565;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1852[arg0];
            var37 = field1853[arg0];
        }
        for (int var38 = 0; var38 < this.field1830; var38++) {
            int var39 = this.field1797[var38];
            int var40 = this.field1798[var38];
            int var41 = this.field1837[var38];
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
            field1829[var38] = var50 - var11;
            if (var50 >= 50) {
                field1827[var38] = class91.field1570 * var46 / var50 + var34;
                field1818[var38] = class91.field1570 * var49 / var50 + var35;
            } else {
                field1827[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1816[var38] = var46;
                field1823[var38] = var49;
                field1832[var38] = var50;
            }
        }
        try {
            this.method2135(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("db.n(ZZI)V")
    public final void method2135(boolean arg0, boolean arg1, int arg2) {
        if (this.field1822 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1822; var4++) {
            field1834[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1857; var5++) {
            if (this.field1806[var5] != -2) {
                int var6 = this.field1801[var5];
                int var7 = this.field1802[var5];
                int var8 = this.field1799[var5];
                int var9 = field1827[var6];
                int var10 = field1827[var7];
                int var11 = field1827[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1816[var6];
                    int var13 = field1816[var7];
                    int var14 = field1816[var8];
                    int var15 = field1823[var6];
                    int var16 = field1823[var7];
                    int var17 = field1823[var8];
                    int var18 = field1832[var6];
                    int var19 = field1832[var7];
                    int var20 = field1832[var8];
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
                        field1826[var5] = true;
                        int var30 = (field1829[var6] + field1829[var7] + field1829[var8]) / 3 + this.field1812;
                        field1810[var30][field1834[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2138(field1813, field1856, field1818[var6], field1818[var7], field1818[var8], var9, var10, var11)) {
                        field1851[field1850++] = arg2;
                        arg1 = false;
                    }
                    if ((field1818[var8] - field1818[var7]) * (var9 - var10) - (field1818[var6] - field1818[var7]) * (var11 - var10) > 0) {
                        field1826[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1573 && var10 <= Statics.field1573 && var11 <= Statics.field1573) {
                            field1825[var5] = false;
                        } else {
                            field1825[var5] = true;
                        }
                        int var31 = (field1829[var6] + field1829[var7] + field1829[var8]) / 3 + this.field1812;
                        field1810[var31][field1834[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1839 == null) {
            for (int var32 = this.field1822 - 1; var32 >= 0; var32--) {
                int var33 = field1834[var32];
                if (var33 > 0) {
                    int[] var34 = field1810[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2136(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1836[var36] = 0;
            field1840[var36] = 0;
        }
        for (int var37 = this.field1822 - 1; var37 >= 0; var37--) {
            int var38 = field1834[var37];
            if (var38 > 0) {
                int[] var39 = field1810[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1839[var41];
                    int var43 = field1836[var42]++;
                    field1828[var42][var43] = var41;
                    if (var42 < 10) {
                        field1840[var42] += var37;
                    } else if (var42 == 10) {
                        field1838[var43] = var37;
                    } else {
                        field1821[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1836[1] > 0 || field1836[2] > 0) {
            var44 = (field1840[1] + field1840[2]) / (field1836[1] + field1836[2]);
        }
        int var45 = 0;
        if (field1836[3] > 0 || field1836[4] > 0) {
            var45 = (field1840[3] + field1840[4]) / (field1836[3] + field1836[4]);
        }
        int var46 = 0;
        if (field1836[6] > 0 || field1836[8] > 0) {
            var46 = (field1840[6] + field1840[8]) / (field1836[6] + field1836[8]);
        }
        int var47 = 0;
        int var48 = field1836[10];
        int[] var49 = field1828[10];
        int[] var50 = field1838;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1836[11];
            var49 = field1828[11];
            var50 = field1821;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2136(var49[var47++]);
                if (var47 == var48 && field1828[11] != var49) {
                    var47 = 0;
                    var48 = field1836[11];
                    var49 = field1828[11];
                    var50 = field1821;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2136(var49[var47++]);
                if (var47 == var48 && field1828[11] != var49) {
                    var47 = 0;
                    var48 = field1836[11];
                    var49 = field1828[11];
                    var50 = field1821;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2136(var49[var47++]);
                if (var47 == var48 && field1828[11] != var49) {
                    var47 = 0;
                    var48 = field1836[11];
                    var49 = field1828[11];
                    var50 = field1821;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1836[var52];
            int[] var54 = field1828[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2136(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2136(var49[var47++]);
            if (var47 == var48 && field1828[11] != var49) {
                var47 = 0;
                var49 = field1828[11];
                var48 = field1836[11];
                var50 = field1821;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("db.j(I)V")
    public final void method2136(int arg0) {
        if (field1826[arg0]) {
            this.method2137(arg0);
            return;
        }
        int var2 = this.field1801[arg0];
        int var3 = this.field1802[arg0];
        int var4 = this.field1799[arg0];
        class91.field1579 = field1825[arg0];
        if (this.field1808 == null) {
            class91.field1572 = 0;
        } else {
            class91.field1572 = this.field1808[arg0] & 0xFF;
        }
        if (this.field1811 != null && this.field1811[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1843 == null || this.field1843[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1843[arg0] & 0xFF;
                var6 = this.field1795[var5];
                var7 = this.field1814[var5];
                var8 = this.field1815[var5];
            }
            if (this.field1806[arg0] == -1) {
                class91.method1952(field1818[var2], field1818[var3], field1818[var4], field1827[var2], field1827[var3], field1827[var4], this.field1804[arg0], this.field1804[arg0], this.field1804[arg0], field1816[var6], field1816[var7], field1816[var8], field1823[var6], field1823[var7], field1823[var8], field1832[var6], field1832[var7], field1832[var8], this.field1811[arg0]);
            } else {
                class91.method1952(field1818[var2], field1818[var3], field1818[var4], field1827[var2], field1827[var3], field1827[var4], this.field1804[arg0], this.field1805[arg0], this.field1806[arg0], field1816[var6], field1816[var7], field1816[var8], field1823[var6], field1823[var7], field1823[var8], field1832[var6], field1832[var7], field1832[var8], this.field1811[arg0]);
            }
        } else if (this.field1806[arg0] == -1) {
            class91.method1950(field1818[var2], field1818[var3], field1818[var4], field1827[var2], field1827[var3], field1827[var4], field1854[this.field1804[arg0]]);
        } else {
            class91.method1989(field1818[var2], field1818[var3], field1818[var4], field1827[var2], field1827[var3], field1827[var4], this.field1804[arg0], this.field1805[arg0], this.field1806[arg0]);
        }
    }

    @ObfuscatedName("db.b(I)V")
    public final void method2137(int arg0) {
        int var2 = Statics.field1571;
        int var3 = Statics.field1565;
        int var4 = 0;
        int var5 = this.field1801[arg0];
        int var6 = this.field1802[arg0];
        int var7 = this.field1799[arg0];
        int var8 = field1832[var5];
        int var9 = field1832[var6];
        int var10 = field1832[var7];
        if (this.field1808 == null) {
            class91.field1572 = 0;
        } else {
            class91.field1572 = this.field1808[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1841[var4] = field1827[var5];
            field1842[var4] = field1818[var5];
            field1849[var4++] = this.field1804[arg0];
        } else {
            int var11 = field1816[var5];
            int var12 = field1823[var5];
            int var13 = this.field1804[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1855[var10 - var8];
                field1841[var4] = (((field1816[var7] - var11) * var14 >> 16) + var11) * class91.field1570 / 50 + var2;
                field1842[var4] = (((field1823[var7] - var12) * var14 >> 16) + var12) * class91.field1570 / 50 + var3;
                field1849[var4++] = ((this.field1806[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1855[var9 - var8];
                field1841[var4] = (((field1816[var6] - var11) * var15 >> 16) + var11) * class91.field1570 / 50 + var2;
                field1842[var4] = (((field1823[var6] - var12) * var15 >> 16) + var12) * class91.field1570 / 50 + var3;
                field1849[var4++] = ((this.field1805[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1841[var4] = field1827[var6];
            field1842[var4] = field1818[var6];
            field1849[var4++] = this.field1805[arg0];
        } else {
            int var16 = field1816[var6];
            int var17 = field1823[var6];
            int var18 = this.field1805[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1855[var8 - var9];
                field1841[var4] = (((field1816[var5] - var16) * var19 >> 16) + var16) * class91.field1570 / 50 + var2;
                field1842[var4] = (((field1823[var5] - var17) * var19 >> 16) + var17) * class91.field1570 / 50 + var3;
                field1849[var4++] = ((this.field1804[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1855[var10 - var9];
                field1841[var4] = (((field1816[var7] - var16) * var20 >> 16) + var16) * class91.field1570 / 50 + var2;
                field1842[var4] = (((field1823[var7] - var17) * var20 >> 16) + var17) * class91.field1570 / 50 + var3;
                field1849[var4++] = ((this.field1806[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1841[var4] = field1827[var7];
            field1842[var4] = field1818[var7];
            field1849[var4++] = this.field1806[arg0];
        } else {
            int var21 = field1816[var7];
            int var22 = field1823[var7];
            int var23 = this.field1806[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1855[var9 - var10];
                field1841[var4] = (((field1816[var6] - var21) * var24 >> 16) + var21) * class91.field1570 / 50 + var2;
                field1842[var4] = (((field1823[var6] - var22) * var24 >> 16) + var22) * class91.field1570 / 50 + var3;
                field1849[var4++] = ((this.field1805[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1855[var8 - var10];
                field1841[var4] = (((field1816[var5] - var21) * var25 >> 16) + var21) * class91.field1570 / 50 + var2;
                field1842[var4] = (((field1823[var5] - var22) * var25 >> 16) + var22) * class91.field1570 / 50 + var3;
                field1849[var4++] = ((this.field1804[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1841[0];
        int var27 = field1841[1];
        int var28 = field1841[2];
        int var29 = field1842[0];
        int var30 = field1842[1];
        int var31 = field1842[2];
        class91.field1579 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1573 || var27 > Statics.field1573 || var28 > Statics.field1573) {
                class91.field1579 = true;
            }
            if (this.field1811 != null && this.field1811[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1843 == null || this.field1843[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1843[arg0] & 0xFF;
                    var33 = this.field1795[var32];
                    var34 = this.field1814[var32];
                    var35 = this.field1815[var32];
                }
                if (this.field1806[arg0] == -1) {
                    class91.method1952(var29, var30, var31, var26, var27, var28, this.field1804[arg0], this.field1804[arg0], this.field1804[arg0], field1816[var33], field1816[var34], field1816[var35], field1823[var33], field1823[var34], field1823[var35], field1832[var33], field1832[var34], field1832[var35], this.field1811[arg0]);
                } else {
                    class91.method1952(var29, var30, var31, var26, var27, var28, field1849[0], field1849[1], field1849[2], field1816[var33], field1816[var34], field1816[var35], field1823[var33], field1823[var34], field1823[var35], field1832[var33], field1832[var34], field1832[var35], this.field1811[arg0]);
                }
            } else if (this.field1806[arg0] == -1) {
                class91.method1950(var29, var30, var31, var26, var27, var28, field1854[this.field1804[arg0]]);
            } else {
                class91.method1989(var29, var30, var31, var26, var27, var28, field1849[0], field1849[1], field1849[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1573 || var27 > Statics.field1573 || var28 > Statics.field1573 || field1841[3] < 0 || field1841[3] > Statics.field1573) {
            class91.field1579 = true;
        }
        if (this.field1811 != null && this.field1811[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1843 == null || this.field1843[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1843[arg0] & 0xFF;
                var37 = this.field1795[var36];
                var38 = this.field1814[var36];
                var39 = this.field1815[var36];
            }
            short var40 = this.field1811[arg0];
            if (this.field1806[arg0] == -1) {
                class91.method1952(var29, var30, var31, var26, var27, var28, this.field1804[arg0], this.field1804[arg0], this.field1804[arg0], field1816[var37], field1816[var38], field1816[var39], field1823[var37], field1823[var38], field1823[var39], field1832[var37], field1832[var38], field1832[var39], var40);
                class91.method1952(var29, var31, field1842[3], var26, var28, field1841[3], this.field1804[arg0], this.field1804[arg0], this.field1804[arg0], field1816[var37], field1816[var38], field1816[var39], field1823[var37], field1823[var38], field1823[var39], field1832[var37], field1832[var38], field1832[var39], var40);
            } else {
                class91.method1952(var29, var30, var31, var26, var27, var28, field1849[0], field1849[1], field1849[2], field1816[var37], field1816[var38], field1816[var39], field1823[var37], field1823[var38], field1823[var39], field1832[var37], field1832[var38], field1832[var39], var40);
                class91.method1952(var29, var31, field1842[3], var26, var28, field1841[3], field1849[0], field1849[2], field1849[3], field1816[var37], field1816[var38], field1816[var39], field1823[var37], field1823[var38], field1823[var39], field1832[var37], field1832[var38], field1832[var39], var40);
            }
        } else if (this.field1806[arg0] == -1) {
            int var41 = field1854[this.field1804[arg0]];
            class91.method1950(var29, var30, var31, var26, var27, var28, var41);
            class91.method1950(var29, var31, field1842[3], var26, var28, field1841[3], var41);
        } else {
            class91.method1989(var29, var30, var31, var26, var27, var28, field1849[0], field1849[1], field1849[2]);
            class91.method1989(var29, var31, field1842[3], var26, var28, field1841[3], field1849[0], field1849[2], field1849[3]);
        }
    }

    @ObfuscatedName("db.e(IIIIIIII)Z")
    public final boolean method2138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
