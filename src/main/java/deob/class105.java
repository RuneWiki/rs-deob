package deob;

@ObfuscatedName("du")
public class class105 extends class85 {

    @ObfuscatedName("du.f")
    public static class105 field1831 = new class105();

    @ObfuscatedName("du.s")
    public static byte[] field1840 = new byte[1];

    @ObfuscatedName("du.q")
    public static class105 field1825 = new class105();

    @ObfuscatedName("du.g")
    public static byte[] field1798 = new byte[1];

    @ObfuscatedName("du.m")
    public int field1799 = 0;

    @ObfuscatedName("du.t")
    public int[] field1854;

    @ObfuscatedName("du.j")
    public int[] field1801;

    @ObfuscatedName("du.n")
    public int[] field1802;

    @ObfuscatedName("du.l")
    public int field1803 = 0;

    @ObfuscatedName("du.i")
    public int[] field1804;

    @ObfuscatedName("du.w")
    public int[] field1832;

    @ObfuscatedName("du.v")
    public int[] field1806;

    @ObfuscatedName("du.o")
    public int[] field1852;

    @ObfuscatedName("du.p")
    public int[] field1857;

    @ObfuscatedName("du.b")
    public int[] field1811;

    @ObfuscatedName("du.z")
    public byte[] field1810;

    @ObfuscatedName("du.k")
    public byte[] field1859;

    @ObfuscatedName("du.r")
    public byte[] field1812;

    @ObfuscatedName("du.d")
    public short[] field1813;

    @ObfuscatedName("du.u")
    public byte field1814 = 0;

    @ObfuscatedName("du.a")
    public int field1815 = 0;

    @ObfuscatedName("du.x")
    public int[] field1805;

    @ObfuscatedName("du.y")
    public int[] field1817;

    @ObfuscatedName("du.c")
    public int[] field1830;

    @ObfuscatedName("du.h")
    public int[][] field1823;

    @ObfuscatedName("du.e")
    public int[][] field1820;

    @ObfuscatedName("du.ab")
    public boolean field1821 = false;

    @ObfuscatedName("du.af")
    public int field1822;

    @ObfuscatedName("du.au")
    public int field1809;

    @ObfuscatedName("du.ae")
    public int field1824;

    @ObfuscatedName("du.ax")
    public int field1795;

    @ObfuscatedName("du.az")
    public int field1856;

    @ObfuscatedName("du.ak")
    public static boolean[] field1828 = new boolean[4096];

    @ObfuscatedName("du.ac")
    public static boolean[] field1829 = new boolean[4096];

    @ObfuscatedName("du.ar")
    public static int[] field1807 = new int[4096];

    @ObfuscatedName("du.ah")
    public static int[] field1797 = new int[4096];

    @ObfuscatedName("du.an")
    public static int[] field1842 = new int[4096];

    @ObfuscatedName("du.aq")
    public static int[] field1833 = new int[4096];

    @ObfuscatedName("du.at")
    public static int[] field1834 = new int[4096];

    @ObfuscatedName("du.am")
    public static int[] field1835 = new int[4096];

    @ObfuscatedName("du.ai")
    public static int[] field1837 = new int[1600];

    @ObfuscatedName("du.ay")
    public static int[][] field1838 = new int[1600][512];

    @ObfuscatedName("du.aw")
    public static int[] field1839 = new int[12];

    @ObfuscatedName("du.ap")
    public static int[][] field1800 = new int[12][2000];

    @ObfuscatedName("du.aj")
    public static int[] field1841 = new int[2000];

    @ObfuscatedName("du.ao")
    public static int[] field1849 = new int[2000];

    @ObfuscatedName("du.ad")
    public static int[] field1843 = new int[12];

    @ObfuscatedName("du.ag")
    public static int[] field1844 = new int[10];

    @ObfuscatedName("du.al")
    public static int[] field1845 = new int[10];

    @ObfuscatedName("du.as")
    public static int[] field1808 = new int[10];

    @ObfuscatedName("du.br")
    public static boolean field1850 = false;

    @ObfuscatedName("du.bk")
    public static int field1851 = 0;

    @ObfuscatedName("du.bp")
    public static int field1846 = 0;

    @ObfuscatedName("du.bx")
    public static int field1853 = 0;

    @ObfuscatedName("du.bl")
    public static int[] field1826 = new int[1000];

    @ObfuscatedName("du.bu")
    public static int[] field1855 = class91.field1579;

    @ObfuscatedName("du.bq")
    public static int[] field1860 = class91.field1591;

    @ObfuscatedName("du.bf")
    public static int[] field1818 = class91.field1586;

    @ObfuscatedName("du.bn")
    public static int[] field1858 = class91.field1589;

    public class105() {
    }

    public class105(class105[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1799 = 0;
        this.field1803 = 0;
        this.field1815 = 0;
        this.field1814 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class105 var8 = arg0[var7];
            if (var8 != null) {
                this.field1799 += var8.field1799;
                this.field1803 += var8.field1803;
                this.field1815 += var8.field1815;
                if (var8.field1810 == null) {
                    if (this.field1814 == -1) {
                        this.field1814 = var8.field1814;
                    }
                    if (this.field1814 != var8.field1814) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1859 != null;
                var5 |= var8.field1813 != null;
                var6 |= var8.field1812 != null;
            }
        }
        this.field1854 = new int[this.field1799];
        this.field1801 = new int[this.field1799];
        this.field1802 = new int[this.field1799];
        this.field1804 = new int[this.field1803];
        this.field1832 = new int[this.field1803];
        this.field1806 = new int[this.field1803];
        this.field1852 = new int[this.field1803];
        this.field1857 = new int[this.field1803];
        this.field1811 = new int[this.field1803];
        if (var3) {
            this.field1810 = new byte[this.field1803];
        }
        if (var4) {
            this.field1859 = new byte[this.field1803];
        }
        if (var5) {
            this.field1813 = new short[this.field1803];
        }
        if (var6) {
            this.field1812 = new byte[this.field1803];
        }
        if (this.field1815 > 0) {
            this.field1805 = new int[this.field1815];
            this.field1817 = new int[this.field1815];
            this.field1830 = new int[this.field1815];
        }
        this.field1799 = 0;
        this.field1803 = 0;
        this.field1815 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class105 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1803; var11++) {
                    this.field1804[this.field1803] = var10.field1804[var11] + this.field1799;
                    this.field1832[this.field1803] = var10.field1832[var11] + this.field1799;
                    this.field1806[this.field1803] = var10.field1806[var11] + this.field1799;
                    this.field1852[this.field1803] = var10.field1852[var11];
                    this.field1857[this.field1803] = var10.field1857[var11];
                    this.field1811[this.field1803] = var10.field1811[var11];
                    if (var3) {
                        if (var10.field1810 == null) {
                            this.field1810[this.field1803] = var10.field1814;
                        } else {
                            this.field1810[this.field1803] = var10.field1810[var11];
                        }
                    }
                    if (var4 && var10.field1859 != null) {
                        this.field1859[this.field1803] = var10.field1859[var11];
                    }
                    if (var5) {
                        if (var10.field1813 == null) {
                            this.field1813[this.field1803] = -1;
                        } else {
                            this.field1813[this.field1803] = var10.field1813[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1812 == null || var10.field1812[var11] == -1) {
                            this.field1812[this.field1803] = -1;
                        } else {
                            this.field1812[this.field1803] = (byte) (var10.field1812[var11] + this.field1815);
                        }
                    }
                    this.field1803++;
                }
                for (int var12 = 0; var12 < var10.field1815; var12++) {
                    this.field1805[this.field1815] = var10.field1805[var12] + this.field1799;
                    this.field1817[this.field1815] = var10.field1817[var12] + this.field1799;
                    this.field1830[this.field1815] = var10.field1830[var12] + this.field1799;
                    this.field1815++;
                }
                for (int var13 = 0; var13 < var10.field1799; var13++) {
                    this.field1854[this.field1799] = var10.field1854[var13];
                    this.field1801[this.field1799] = var10.field1801[var13];
                    this.field1802[this.field1799] = var10.field1802[var13];
                    this.field1799++;
                }
            }
        }
    }

    @ObfuscatedName("du.f([[IIIIZI)Ldu;")
    public class105 method2163(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2161();
        int var7 = arg1 - this.field1824;
        int var8 = this.field1824 + arg1;
        int var9 = arg3 - this.field1824;
        int var10 = this.field1824 + arg3;
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
            var15.field1799 = this.field1799;
            var15.field1803 = this.field1803;
            var15.field1815 = this.field1815;
            var15.field1854 = this.field1854;
            var15.field1802 = this.field1802;
            var15.field1804 = this.field1804;
            var15.field1832 = this.field1832;
            var15.field1806 = this.field1806;
            var15.field1852 = this.field1852;
            var15.field1857 = this.field1857;
            var15.field1811 = this.field1811;
            var15.field1810 = this.field1810;
            var15.field1859 = this.field1859;
            var15.field1812 = this.field1812;
            var15.field1813 = this.field1813;
            var15.field1814 = this.field1814;
            var15.field1805 = this.field1805;
            var15.field1817 = this.field1817;
            var15.field1830 = this.field1830;
            var15.field1823 = this.field1823;
            var15.field1820 = this.field1820;
            var15.field1821 = this.field1821;
            var15.field1801 = new int[var15.field1799];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1799; var16++) {
                int var17 = this.field1854[var16] + arg1;
                int var18 = this.field1802[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1801[var16] = this.field1801[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1799; var26++) {
                int var27 = (-this.field1801[var26] << 16) / this.field1462;
                if (var27 < arg5) {
                    int var28 = this.field1854[var26] + arg1;
                    int var29 = this.field1802[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1801[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1801[var26];
                }
            }
        }
        var15.field1822 = 0;
        return var15;
    }

    @ObfuscatedName("du.s(Z)Ldu;")
    public class105 method2166(boolean arg0) {
        if (!arg0 && field1840.length < this.field1803) {
            field1840 = new byte[this.field1803 + 100];
        }
        return this.method2216(arg0, field1831, field1840);
    }

    @ObfuscatedName("du.g(Z)Ldu;")
    public class105 method2210(boolean arg0) {
        if (!arg0 && field1798.length < this.field1803) {
            field1798 = new byte[this.field1803 + 100];
        }
        return this.method2216(arg0, field1825, field1798);
    }

    @ObfuscatedName("du.m(ZLdu;[B)Ldu;")
    public class105 method2216(boolean arg0, class105 arg1, byte[] arg2) {
        arg1.field1799 = this.field1799;
        arg1.field1803 = this.field1803;
        arg1.field1815 = this.field1815;
        if (arg1.field1854 == null || arg1.field1854.length < this.field1799) {
            arg1.field1854 = new int[this.field1799 + 100];
            arg1.field1801 = new int[this.field1799 + 100];
            arg1.field1802 = new int[this.field1799 + 100];
        }
        for (int var4 = 0; var4 < this.field1799; var4++) {
            arg1.field1854[var4] = this.field1854[var4];
            arg1.field1801[var4] = this.field1801[var4];
            arg1.field1802[var4] = this.field1802[var4];
        }
        if (arg0) {
            arg1.field1859 = this.field1859;
        } else {
            arg1.field1859 = arg2;
            if (this.field1859 == null) {
                for (int var5 = 0; var5 < this.field1803; var5++) {
                    arg1.field1859[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1803; var6++) {
                    arg1.field1859[var6] = this.field1859[var6];
                }
            }
        }
        arg1.field1804 = this.field1804;
        arg1.field1832 = this.field1832;
        arg1.field1806 = this.field1806;
        arg1.field1852 = this.field1852;
        arg1.field1857 = this.field1857;
        arg1.field1811 = this.field1811;
        arg1.field1810 = this.field1810;
        arg1.field1812 = this.field1812;
        arg1.field1813 = this.field1813;
        arg1.field1814 = this.field1814;
        arg1.field1805 = this.field1805;
        arg1.field1817 = this.field1817;
        arg1.field1830 = this.field1830;
        arg1.field1823 = this.field1823;
        arg1.field1820 = this.field1820;
        arg1.field1821 = this.field1821;
        arg1.field1822 = 0;
        return arg1;
    }

    @ObfuscatedName("du.t()V")
    public void method2161() {
        if (this.field1822 == 1) {
            return;
        }
        this.field1822 = 1;
        this.field1462 = 0;
        this.field1809 = 0;
        this.field1824 = 0;
        for (int var1 = 0; var1 < this.field1799; var1++) {
            int var2 = this.field1854[var1];
            int var3 = this.field1801[var1];
            int var4 = this.field1802[var1];
            if (-var3 > this.field1462) {
                this.field1462 = -var3;
            }
            if (var3 > this.field1809) {
                this.field1809 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1824) {
                this.field1824 = var5;
            }
        }
        this.field1824 = (int) (Math.sqrt((double) this.field1824) + 0.99D);
        this.field1856 = (int) (Math.sqrt((double) (this.field1462 * this.field1462 + this.field1824 * this.field1824)) + 0.99D);
        this.field1795 = this.field1856 + (int) (Math.sqrt((double) (this.field1824 * this.field1824 + this.field1809 * this.field1809)) + 0.99D);
    }

    @ObfuscatedName("du.j()V")
    public void method2168() {
        if (this.field1822 == 2) {
            return;
        }
        this.field1822 = 2;
        this.field1824 = 0;
        for (int var1 = 0; var1 < this.field1799; var1++) {
            int var2 = this.field1854[var1];
            int var3 = this.field1801[var1];
            int var4 = this.field1802[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1824) {
                this.field1824 = var5;
            }
        }
        this.field1824 = (int) (Math.sqrt((double) this.field1824) + 0.99D);
        this.field1856 = this.field1824;
        this.field1795 = this.field1824 + this.field1824;
    }

    @ObfuscatedName("du.n()I")
    public int method2169() {
        this.method2161();
        return this.field1824;
    }

    @ObfuscatedName("du.l(Lcz;I)V")
    public void method2170(class103 arg0, int arg1) {
        if (this.field1823 == null || arg1 == -1) {
            return;
        }
        class88 var3 = arg0.field1772[arg1];
        class102 var4 = var3.field1544;
        Statics.field1847 = 0;
        Statics.field1848 = 0;
        Statics.field1816 = 0;
        for (int var5 = 0; var5 < var3.field1545; var5++) {
            int var6 = var3.field1541[var5];
            this.method2164(var4.field1758[var6], var4.field1756[var6], var3.field1547[var5], var3.field1548[var5], var3.field1549[var5]);
        }
        this.field1822 = 0;
    }

    @ObfuscatedName("du.i(Lcz;ILcz;I[I)V")
    public void method2171(class103 arg0, int arg1, class103 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2170(arg0, arg1);
            return;
        }
        class88 var6 = arg0.field1772[arg1];
        class88 var7 = arg2.field1772[arg3];
        class102 var8 = var6.field1544;
        Statics.field1847 = 0;
        Statics.field1848 = 0;
        Statics.field1816 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1545; var11++) {
            int var12 = var6.field1541[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1758[var12] == 0) {
                this.method2164(var8.field1758[var12], var8.field1756[var12], var6.field1547[var11], var6.field1548[var11], var6.field1549[var11]);
            }
        }
        Statics.field1847 = 0;
        Statics.field1848 = 0;
        Statics.field1816 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1545; var15++) {
            int var16 = var7.field1541[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1758[var16] == 0) {
                this.method2164(var8.field1758[var16], var8.field1756[var16], var7.field1547[var15], var7.field1548[var15], var7.field1549[var15]);
            }
        }
        this.field1822 = 0;
    }

    @ObfuscatedName("du.w(I[IIII)V")
    public void method2164(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1847 = 0;
            Statics.field1848 = 0;
            Statics.field1816 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1823.length) {
                    int[] var10 = this.field1823[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1847 += this.field1854[var12];
                        Statics.field1848 += this.field1801[var12];
                        Statics.field1816 += this.field1802[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1847 = Statics.field1847 / var7 + arg2;
                Statics.field1848 = Statics.field1848 / var7 + arg3;
                Statics.field1816 = Statics.field1816 / var7 + arg4;
            } else {
                Statics.field1847 = arg2;
                Statics.field1848 = arg3;
                Statics.field1816 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1823.length) {
                    int[] var15 = this.field1823[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1854[var17] += arg2;
                        this.field1801[var17] += arg3;
                        this.field1802[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1823.length) {
                    int[] var20 = this.field1823[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1854[var22] -= Statics.field1847;
                        this.field1801[var22] -= Statics.field1848;
                        this.field1802[var22] -= Statics.field1816;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1855[var25];
                            int var27 = field1860[var25];
                            int var28 = this.field1854[var22] * var27 + this.field1801[var22] * var26 >> 16;
                            this.field1801[var22] = this.field1801[var22] * var27 - this.field1854[var22] * var26 >> 16;
                            this.field1854[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1855[var23];
                            int var30 = field1860[var23];
                            int var31 = this.field1801[var22] * var30 - this.field1802[var22] * var29 >> 16;
                            this.field1802[var22] = this.field1802[var22] * var30 + this.field1801[var22] * var29 >> 16;
                            this.field1801[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1855[var24];
                            int var33 = field1860[var24];
                            int var34 = this.field1854[var22] * var33 + this.field1802[var22] * var32 >> 16;
                            this.field1802[var22] = this.field1802[var22] * var33 - this.field1854[var22] * var32 >> 16;
                            this.field1854[var22] = var34;
                        }
                        this.field1854[var22] += Statics.field1847;
                        this.field1801[var22] += Statics.field1848;
                        this.field1802[var22] += Statics.field1816;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1823.length) {
                    int[] var37 = this.field1823[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1854[var39] -= Statics.field1847;
                        this.field1801[var39] -= Statics.field1848;
                        this.field1802[var39] -= Statics.field1816;
                        this.field1854[var39] = this.field1854[var39] * arg2 / 128;
                        this.field1801[var39] = this.field1801[var39] * arg3 / 128;
                        this.field1802[var39] = this.field1802[var39] * arg4 / 128;
                        this.field1854[var39] += Statics.field1847;
                        this.field1801[var39] += Statics.field1848;
                        this.field1802[var39] += Statics.field1816;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1820 != null && this.field1859 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1820.length) {
                    int[] var42 = this.field1820[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1859[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1859[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("du.b()V")
    public void method2173() {
        for (int var1 = 0; var1 < this.field1799; var1++) {
            int var2 = this.field1854[var1];
            this.field1854[var1] = this.field1802[var1];
            this.field1802[var1] = -var2;
        }
        this.field1822 = 0;
    }

    @ObfuscatedName("du.z()V")
    public void method2217() {
        for (int var1 = 0; var1 < this.field1799; var1++) {
            this.field1854[var1] = -this.field1854[var1];
            this.field1802[var1] = -this.field1802[var1];
        }
        this.field1822 = 0;
    }

    @ObfuscatedName("du.k()V")
    public void method2205() {
        for (int var1 = 0; var1 < this.field1799; var1++) {
            int var2 = this.field1802[var1];
            this.field1802[var1] = this.field1854[var1];
            this.field1854[var1] = -var2;
        }
        this.field1822 = 0;
    }

    @ObfuscatedName("du.r(I)V")
    public void method2223(int arg0) {
        int var2 = field1855[arg0];
        int var3 = field1860[arg0];
        for (int var4 = 0; var4 < this.field1799; var4++) {
            int var5 = this.field1801[var4] * var3 - this.field1802[var4] * var2 >> 16;
            this.field1802[var4] = this.field1802[var4] * var3 + this.field1801[var4] * var2 >> 16;
            this.field1801[var4] = var5;
        }
        this.field1822 = 0;
    }

    @ObfuscatedName("du.d(III)V")
    public void method2178(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1799; var4++) {
            this.field1854[var4] += arg0;
            this.field1801[var4] += arg1;
            this.field1802[var4] += arg2;
        }
        this.field1822 = 0;
    }

    @ObfuscatedName("du.u(III)V")
    public void method2222(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1799; var4++) {
            this.field1854[var4] = this.field1854[var4] * arg0 / 128;
            this.field1801[var4] = this.field1801[var4] * arg1 / 128;
            this.field1802[var4] = this.field1802[var4] * arg2 / 128;
        }
        this.field1822 = 0;
    }

    @ObfuscatedName("du.a(IIIIIII)V")
    public final void method2179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1837[0] = -1;
        if (this.field1822 != 2 && this.field1822 != 1) {
            this.method2168();
        }
        int var8 = Statics.field1577;
        int var9 = Statics.field1578;
        int var10 = field1855[arg0];
        int var11 = field1860[arg0];
        int var12 = field1855[arg1];
        int var13 = field1860[arg1];
        int var14 = field1855[arg2];
        int var15 = field1860[arg2];
        int var16 = field1855[arg3];
        int var17 = field1860[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1799; var19++) {
            int var20 = this.field1854[var19];
            int var21 = this.field1801[var19];
            int var22 = this.field1802[var19];
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
            field1842[var19] = var30 - var18;
            field1807[var19] = class91.field1572 * var26 / var30 + var8;
            field1797[var19] = class91.field1572 * var29 / var30 + var9;
            if (this.field1815 > 0) {
                field1833[var19] = var26;
                field1834[var19] = var29;
                field1835[var19] = var30;
            }
        }
        try {
            this.method2181(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("du.x(IIIIIIII)V")
    public final void method2189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1837[0] = -1;
        if (this.field1822 != 2 && this.field1822 != 1) {
            this.method2168();
        }
        int var9 = Statics.field1577;
        int var10 = Statics.field1578;
        int var11 = field1855[arg0];
        int var12 = field1860[arg0];
        int var13 = field1855[arg1];
        int var14 = field1860[arg1];
        int var15 = field1855[arg2];
        int var16 = field1860[arg2];
        int var17 = field1855[arg3];
        int var18 = field1860[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1799; var20++) {
            int var21 = this.field1854[var20];
            int var22 = this.field1801[var20];
            int var23 = this.field1802[var20];
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
            field1842[var20] = var31 - var19;
            field1807[var20] = class91.field1572 * var27 / arg7 + var9;
            field1797[var20] = class91.field1572 * var30 / arg7 + var10;
            if (this.field1815 > 0) {
                field1833[var20] = var27;
                field1834[var20] = var30;
                field1835[var20] = var31;
            }
        }
        try {
            this.method2181(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("du.ac(IIIIIIIII)V")
    public void method1780(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1837[0] = -1;
        if (this.field1822 != 1) {
            this.method2161();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1824 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1824) * class91.field1572;
        if (var15 / var13 >= Statics.field1582) {
            return;
        }
        int var16 = (this.field1824 + var14) * class91.field1572;
        if (var16 / var13 <= Statics.field1581) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1824 * arg1 >> 16;
        int var19 = (var17 + var18) * class91.field1572;
        if (var19 / var13 <= Statics.field1590) {
            return;
        }
        int var20 = (this.field1462 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class91.field1572;
        if (var21 / var13 >= Statics.field1584) {
            return;
        }
        int var22 = (this.field1462 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1815 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1850) {
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
            int var32 = field1851 - Statics.field1577;
            int var33 = field1846 - Statics.field1578;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1821) {
                    field1826[field1853++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1577;
        int var35 = Statics.field1578;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1855[arg0];
            var37 = field1860[arg0];
        }
        for (int var38 = 0; var38 < this.field1799; var38++) {
            int var39 = this.field1854[var38];
            int var40 = this.field1801[var38];
            int var41 = this.field1802[var38];
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
            field1842[var38] = var50 - var11;
            if (var50 >= 50) {
                field1807[var38] = class91.field1572 * var46 / var50 + var34;
                field1797[var38] = class91.field1572 * var49 / var50 + var35;
            } else {
                field1807[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1833[var38] = var46;
                field1834[var38] = var49;
                field1835[var38] = var50;
            }
        }
        try {
            this.method2181(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("du.y(ZZI)V")
    public final void method2181(boolean arg0, boolean arg1, int arg2) {
        if (this.field1795 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1795; var4++) {
            field1837[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1803; var5++) {
            if (this.field1811[var5] != -2) {
                int var6 = this.field1804[var5];
                int var7 = this.field1832[var5];
                int var8 = this.field1806[var5];
                int var9 = field1807[var6];
                int var10 = field1807[var7];
                int var11 = field1807[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1833[var6];
                    int var13 = field1833[var7];
                    int var14 = field1833[var8];
                    int var15 = field1834[var6];
                    int var16 = field1834[var7];
                    int var17 = field1834[var8];
                    int var18 = field1835[var6];
                    int var19 = field1835[var7];
                    int var20 = field1835[var8];
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
                        field1829[var5] = true;
                        int var30 = (field1842[var6] + field1842[var7] + field1842[var8]) / 3 + this.field1856;
                        field1838[var30][field1837[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2197(field1851, field1846, field1797[var6], field1797[var7], field1797[var8], var9, var10, var11)) {
                        field1826[field1853++] = arg2;
                        arg1 = false;
                    }
                    if ((field1797[var8] - field1797[var7]) * (var9 - var10) - (field1797[var6] - field1797[var7]) * (var11 - var10) > 0) {
                        field1829[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1583 && var10 <= Statics.field1583 && var11 <= Statics.field1583) {
                            field1828[var5] = false;
                        } else {
                            field1828[var5] = true;
                        }
                        int var31 = (field1842[var6] + field1842[var7] + field1842[var8]) / 3 + this.field1856;
                        field1838[var31][field1837[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1810 == null) {
            for (int var32 = this.field1795 - 1; var32 >= 0; var32--) {
                int var33 = field1837[var32];
                if (var33 > 0) {
                    int[] var34 = field1838[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2180(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1839[var36] = 0;
            field1843[var36] = 0;
        }
        for (int var37 = this.field1795 - 1; var37 >= 0; var37--) {
            int var38 = field1837[var37];
            if (var38 > 0) {
                int[] var39 = field1838[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1810[var41];
                    int var43 = field1839[var42]++;
                    field1800[var42][var43] = var41;
                    if (var42 < 10) {
                        field1843[var42] += var37;
                    } else if (var42 == 10) {
                        field1841[var43] = var37;
                    } else {
                        field1849[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1839[1] > 0 || field1839[2] > 0) {
            var44 = (field1843[1] + field1843[2]) / (field1839[1] + field1839[2]);
        }
        int var45 = 0;
        if (field1839[3] > 0 || field1839[4] > 0) {
            var45 = (field1843[3] + field1843[4]) / (field1839[3] + field1839[4]);
        }
        int var46 = 0;
        if (field1839[6] > 0 || field1839[8] > 0) {
            var46 = (field1843[6] + field1843[8]) / (field1839[6] + field1839[8]);
        }
        int var47 = 0;
        int var48 = field1839[10];
        int[] var49 = field1800[10];
        int[] var50 = field1841;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1839[11];
            var49 = field1800[11];
            var50 = field1849;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2180(var49[var47++]);
                if (var47 == var48 && field1800[11] != var49) {
                    var47 = 0;
                    var48 = field1839[11];
                    var49 = field1800[11];
                    var50 = field1849;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2180(var49[var47++]);
                if (var47 == var48 && field1800[11] != var49) {
                    var47 = 0;
                    var48 = field1839[11];
                    var49 = field1800[11];
                    var50 = field1849;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2180(var49[var47++]);
                if (var47 == var48 && field1800[11] != var49) {
                    var47 = 0;
                    var48 = field1839[11];
                    var49 = field1800[11];
                    var50 = field1849;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1839[var52];
            int[] var54 = field1800[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2180(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2180(var49[var47++]);
            if (var47 == var48 && field1800[11] != var49) {
                var47 = 0;
                var49 = field1800[11];
                var48 = field1839[11];
                var50 = field1849;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("du.c(I)V")
    public final void method2180(int arg0) {
        if (field1829[arg0]) {
            this.method2183(arg0);
            return;
        }
        int var2 = this.field1804[arg0];
        int var3 = this.field1832[arg0];
        int var4 = this.field1806[arg0];
        class91.field1585 = field1828[arg0];
        if (this.field1859 == null) {
            class91.field1567 = 0;
        } else {
            class91.field1567 = this.field1859[arg0] & 0xFF;
        }
        if (this.field1813 != null && this.field1813[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1812 == null || this.field1812[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1812[arg0] & 0xFF;
                var6 = this.field1805[var5];
                var7 = this.field1817[var5];
                var8 = this.field1830[var5];
            }
            if (this.field1811[arg0] == -1) {
                class91.method1977(field1797[var2], field1797[var3], field1797[var4], field1807[var2], field1807[var3], field1807[var4], this.field1852[arg0], this.field1852[arg0], this.field1852[arg0], field1833[var6], field1833[var7], field1833[var8], field1834[var6], field1834[var7], field1834[var8], field1835[var6], field1835[var7], field1835[var8], this.field1813[arg0]);
            } else {
                class91.method1977(field1797[var2], field1797[var3], field1797[var4], field1807[var2], field1807[var3], field1807[var4], this.field1852[arg0], this.field1857[arg0], this.field1811[arg0], field1833[var6], field1833[var7], field1833[var8], field1834[var6], field1834[var7], field1834[var8], field1835[var6], field1835[var7], field1835[var8], this.field1813[arg0]);
            }
        } else if (this.field1811[arg0] == -1) {
            class91.method1975(field1797[var2], field1797[var3], field1797[var4], field1807[var2], field1807[var3], field1807[var4], field1818[this.field1852[arg0]]);
        } else {
            class91.method1973(field1797[var2], field1797[var3], field1797[var4], field1807[var2], field1807[var3], field1807[var4], this.field1852[arg0], this.field1857[arg0], this.field1811[arg0]);
        }
    }

    @ObfuscatedName("du.h(I)V")
    public final void method2183(int arg0) {
        int var2 = Statics.field1577;
        int var3 = Statics.field1578;
        int var4 = 0;
        int var5 = this.field1804[arg0];
        int var6 = this.field1832[arg0];
        int var7 = this.field1806[arg0];
        int var8 = field1835[var5];
        int var9 = field1835[var6];
        int var10 = field1835[var7];
        if (this.field1859 == null) {
            class91.field1567 = 0;
        } else {
            class91.field1567 = this.field1859[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1844[var4] = field1807[var5];
            field1845[var4] = field1797[var5];
            field1808[var4++] = this.field1852[arg0];
        } else {
            int var11 = field1833[var5];
            int var12 = field1834[var5];
            int var13 = this.field1852[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1858[var10 - var8];
                field1844[var4] = (((field1833[var7] - var11) * var14 >> 16) + var11) * class91.field1572 / 50 + var2;
                field1845[var4] = (((field1834[var7] - var12) * var14 >> 16) + var12) * class91.field1572 / 50 + var3;
                field1808[var4++] = ((this.field1811[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1858[var9 - var8];
                field1844[var4] = (((field1833[var6] - var11) * var15 >> 16) + var11) * class91.field1572 / 50 + var2;
                field1845[var4] = (((field1834[var6] - var12) * var15 >> 16) + var12) * class91.field1572 / 50 + var3;
                field1808[var4++] = ((this.field1857[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1844[var4] = field1807[var6];
            field1845[var4] = field1797[var6];
            field1808[var4++] = this.field1857[arg0];
        } else {
            int var16 = field1833[var6];
            int var17 = field1834[var6];
            int var18 = this.field1857[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1858[var8 - var9];
                field1844[var4] = (((field1833[var5] - var16) * var19 >> 16) + var16) * class91.field1572 / 50 + var2;
                field1845[var4] = (((field1834[var5] - var17) * var19 >> 16) + var17) * class91.field1572 / 50 + var3;
                field1808[var4++] = ((this.field1852[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1858[var10 - var9];
                field1844[var4] = (((field1833[var7] - var16) * var20 >> 16) + var16) * class91.field1572 / 50 + var2;
                field1845[var4] = (((field1834[var7] - var17) * var20 >> 16) + var17) * class91.field1572 / 50 + var3;
                field1808[var4++] = ((this.field1811[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1844[var4] = field1807[var7];
            field1845[var4] = field1797[var7];
            field1808[var4++] = this.field1811[arg0];
        } else {
            int var21 = field1833[var7];
            int var22 = field1834[var7];
            int var23 = this.field1811[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1858[var9 - var10];
                field1844[var4] = (((field1833[var6] - var21) * var24 >> 16) + var21) * class91.field1572 / 50 + var2;
                field1845[var4] = (((field1834[var6] - var22) * var24 >> 16) + var22) * class91.field1572 / 50 + var3;
                field1808[var4++] = ((this.field1857[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1858[var8 - var10];
                field1844[var4] = (((field1833[var5] - var21) * var25 >> 16) + var21) * class91.field1572 / 50 + var2;
                field1845[var4] = (((field1834[var5] - var22) * var25 >> 16) + var22) * class91.field1572 / 50 + var3;
                field1808[var4++] = ((this.field1852[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1844[0];
        int var27 = field1844[1];
        int var28 = field1844[2];
        int var29 = field1845[0];
        int var30 = field1845[1];
        int var31 = field1845[2];
        class91.field1585 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1583 || var27 > Statics.field1583 || var28 > Statics.field1583) {
                class91.field1585 = true;
            }
            if (this.field1813 != null && this.field1813[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1812 == null || this.field1812[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1812[arg0] & 0xFF;
                    var33 = this.field1805[var32];
                    var34 = this.field1817[var32];
                    var35 = this.field1830[var32];
                }
                if (this.field1811[arg0] == -1) {
                    class91.method1977(var29, var30, var31, var26, var27, var28, this.field1852[arg0], this.field1852[arg0], this.field1852[arg0], field1833[var33], field1833[var34], field1833[var35], field1834[var33], field1834[var34], field1834[var35], field1835[var33], field1835[var34], field1835[var35], this.field1813[arg0]);
                } else {
                    class91.method1977(var29, var30, var31, var26, var27, var28, field1808[0], field1808[1], field1808[2], field1833[var33], field1833[var34], field1833[var35], field1834[var33], field1834[var34], field1834[var35], field1835[var33], field1835[var34], field1835[var35], this.field1813[arg0]);
                }
            } else if (this.field1811[arg0] == -1) {
                class91.method1975(var29, var30, var31, var26, var27, var28, field1818[this.field1852[arg0]]);
            } else {
                class91.method1973(var29, var30, var31, var26, var27, var28, field1808[0], field1808[1], field1808[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1583 || var27 > Statics.field1583 || var28 > Statics.field1583 || field1844[3] < 0 || field1844[3] > Statics.field1583) {
            class91.field1585 = true;
        }
        if (this.field1813 != null && this.field1813[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1812 == null || this.field1812[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1812[arg0] & 0xFF;
                var37 = this.field1805[var36];
                var38 = this.field1817[var36];
                var39 = this.field1830[var36];
            }
            short var40 = this.field1813[arg0];
            if (this.field1811[arg0] == -1) {
                class91.method1977(var29, var30, var31, var26, var27, var28, this.field1852[arg0], this.field1852[arg0], this.field1852[arg0], field1833[var37], field1833[var38], field1833[var39], field1834[var37], field1834[var38], field1834[var39], field1835[var37], field1835[var38], field1835[var39], var40);
                class91.method1977(var29, var31, field1845[3], var26, var28, field1844[3], this.field1852[arg0], this.field1852[arg0], this.field1852[arg0], field1833[var37], field1833[var38], field1833[var39], field1834[var37], field1834[var38], field1834[var39], field1835[var37], field1835[var38], field1835[var39], var40);
            } else {
                class91.method1977(var29, var30, var31, var26, var27, var28, field1808[0], field1808[1], field1808[2], field1833[var37], field1833[var38], field1833[var39], field1834[var37], field1834[var38], field1834[var39], field1835[var37], field1835[var38], field1835[var39], var40);
                class91.method1977(var29, var31, field1845[3], var26, var28, field1844[3], field1808[0], field1808[2], field1808[3], field1833[var37], field1833[var38], field1833[var39], field1834[var37], field1834[var38], field1834[var39], field1835[var37], field1835[var38], field1835[var39], var40);
            }
        } else if (this.field1811[arg0] == -1) {
            int var41 = field1818[this.field1852[arg0]];
            class91.method1975(var29, var30, var31, var26, var27, var28, var41);
            class91.method1975(var29, var31, field1845[3], var26, var28, field1844[3], var41);
        } else {
            class91.method1973(var29, var30, var31, var26, var27, var28, field1808[0], field1808[1], field1808[2]);
            class91.method1973(var29, var31, field1845[3], var26, var28, field1844[3], field1808[0], field1808[2], field1808[3]);
        }
    }

    @ObfuscatedName("du.e(IIIIIIII)Z")
    public final boolean method2197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
