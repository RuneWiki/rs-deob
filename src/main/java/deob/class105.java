package deob;

@ObfuscatedName("dn")
public class class105 extends class85 {

    @ObfuscatedName("dn.a")
    public static class105 field1788 = new class105();

    @ObfuscatedName("dn.r")
    public static byte[] field1804 = new byte[1];

    @ObfuscatedName("dn.f")
    public static class105 field1828 = new class105();

    @ObfuscatedName("dn.s")
    public static byte[] field1816 = new byte[1];

    @ObfuscatedName("dn.y")
    public int field1839 = 0;

    @ObfuscatedName("dn.e")
    public int[] field1847;

    @ObfuscatedName("dn.g")
    public int[] field1793;

    @ObfuscatedName("dn.m")
    public int[] field1794;

    @ObfuscatedName("dn.j")
    public int field1832 = 0;

    @ObfuscatedName("dn.n")
    public int[] field1842;

    @ObfuscatedName("dn.l")
    public int[] field1805;

    @ObfuscatedName("dn.h")
    public int[] field1798;

    @ObfuscatedName("dn.i")
    public int[] field1799;

    @ObfuscatedName("dn.v")
    public int[] field1800;

    @ObfuscatedName("dn.z")
    public int[] field1801;

    @ObfuscatedName("dn.u")
    public byte[] field1789;

    @ObfuscatedName("dn.t")
    public byte[] field1803;

    @ObfuscatedName("dn.b")
    public byte[] field1833;

    @ObfuscatedName("dn.c")
    public short[] field1790;

    @ObfuscatedName("dn.x")
    public byte field1806 = 0;

    @ObfuscatedName("dn.d")
    public int field1807 = 0;

    @ObfuscatedName("dn.p")
    public int[] field1808;

    @ObfuscatedName("dn.q")
    public int[] field1809;

    @ObfuscatedName("dn.w")
    public int[] field1838;

    @ObfuscatedName("dn.k")
    public int[][] field1811;

    @ObfuscatedName("dn.o")
    public int[][] field1812;

    @ObfuscatedName("dn.ad")
    public boolean field1813 = false;

    @ObfuscatedName("dn.at")
    public int field1814;

    @ObfuscatedName("dn.aw")
    public int field1815;

    @ObfuscatedName("dn.ax")
    public int field1836;

    @ObfuscatedName("dn.ak")
    public int field1817;

    @ObfuscatedName("dn.ah")
    public int field1818;

    @ObfuscatedName("dn.as")
    public static boolean[] field1820 = new boolean[4700];

    @ObfuscatedName("dn.ao")
    public static boolean[] field1821 = new boolean[4700];

    @ObfuscatedName("dn.am")
    public static int[] field1822 = new int[4700];

    @ObfuscatedName("dn.ai")
    public static int[] field1849 = new int[4700];

    @ObfuscatedName("dn.ab")
    public static int[] field1824 = new int[4700];

    @ObfuscatedName("dn.al")
    public static int[] field1825 = new int[4700];

    @ObfuscatedName("dn.ar")
    public static int[] field1826 = new int[4700];

    @ObfuscatedName("dn.aa")
    public static int[] field1827 = new int[4700];

    @ObfuscatedName("dn.an")
    public static int[] field1791 = new int[1600];

    @ObfuscatedName("dn.av")
    public static int[][] field1830 = new int[1600][512];

    @ObfuscatedName("dn.aj")
    public static int[] field1831 = new int[12];

    @ObfuscatedName("dn.ap")
    public static int[][] field1819 = new int[12][2000];

    @ObfuscatedName("dn.aq")
    public static int[] field1787 = new int[2000];

    @ObfuscatedName("dn.af")
    public static int[] field1834 = new int[2000];

    @ObfuscatedName("dn.ay")
    public static int[] field1835 = new int[12];

    @ObfuscatedName("dn.au")
    public static int[] field1823 = new int[10];

    @ObfuscatedName("dn.az")
    public static int[] field1837 = new int[10];

    @ObfuscatedName("dn.ae")
    public static int[] field1848 = new int[10];

    @ObfuscatedName("dn.bp")
    public static boolean field1796 = false;

    @ObfuscatedName("dn.bq")
    public static int field1843 = 0;

    @ObfuscatedName("dn.bv")
    public static int field1844 = 0;

    @ObfuscatedName("dn.by")
    public static int field1845 = 0;

    @ObfuscatedName("dn.bu")
    public static int[] field1797 = new int[1000];

    @ObfuscatedName("dn.bo")
    public static int[] field1841 = class91.field1573;

    @ObfuscatedName("dn.bs")
    public static int[] field1792 = class91.field1579;

    @ObfuscatedName("dn.bl")
    public static int[] field1829 = class91.field1574;

    @ObfuscatedName("dn.bn")
    public static int[] field1850 = class91.field1577;

    public class105() {
    }

    public class105(class105[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1839 = 0;
        this.field1832 = 0;
        this.field1807 = 0;
        this.field1806 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class105 var8 = arg0[var7];
            if (var8 != null) {
                this.field1839 += var8.field1839;
                this.field1832 += var8.field1832;
                this.field1807 += var8.field1807;
                if (var8.field1789 == null) {
                    if (this.field1806 == -1) {
                        this.field1806 = var8.field1806;
                    }
                    if (this.field1806 != var8.field1806) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1803 != null;
                var5 |= var8.field1790 != null;
                var6 |= var8.field1833 != null;
            }
        }
        this.field1847 = new int[this.field1839];
        this.field1793 = new int[this.field1839];
        this.field1794 = new int[this.field1839];
        this.field1842 = new int[this.field1832];
        this.field1805 = new int[this.field1832];
        this.field1798 = new int[this.field1832];
        this.field1799 = new int[this.field1832];
        this.field1800 = new int[this.field1832];
        this.field1801 = new int[this.field1832];
        if (var3) {
            this.field1789 = new byte[this.field1832];
        }
        if (var4) {
            this.field1803 = new byte[this.field1832];
        }
        if (var5) {
            this.field1790 = new short[this.field1832];
        }
        if (var6) {
            this.field1833 = new byte[this.field1832];
        }
        if (this.field1807 > 0) {
            this.field1808 = new int[this.field1807];
            this.field1809 = new int[this.field1807];
            this.field1838 = new int[this.field1807];
        }
        this.field1839 = 0;
        this.field1832 = 0;
        this.field1807 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class105 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1832; var11++) {
                    this.field1842[this.field1832] = var10.field1842[var11] + this.field1839;
                    this.field1805[this.field1832] = var10.field1805[var11] + this.field1839;
                    this.field1798[this.field1832] = var10.field1798[var11] + this.field1839;
                    this.field1799[this.field1832] = var10.field1799[var11];
                    this.field1800[this.field1832] = var10.field1800[var11];
                    this.field1801[this.field1832] = var10.field1801[var11];
                    if (var3) {
                        if (var10.field1789 == null) {
                            this.field1789[this.field1832] = var10.field1806;
                        } else {
                            this.field1789[this.field1832] = var10.field1789[var11];
                        }
                    }
                    if (var4 && var10.field1803 != null) {
                        this.field1803[this.field1832] = var10.field1803[var11];
                    }
                    if (var5) {
                        if (var10.field1790 == null) {
                            this.field1790[this.field1832] = -1;
                        } else {
                            this.field1790[this.field1832] = var10.field1790[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1833 == null || var10.field1833[var11] == -1) {
                            this.field1833[this.field1832] = -1;
                        } else {
                            this.field1833[this.field1832] = (byte) (var10.field1833[var11] + this.field1807);
                        }
                    }
                    this.field1832++;
                }
                for (int var12 = 0; var12 < var10.field1807; var12++) {
                    this.field1808[this.field1807] = var10.field1808[var12] + this.field1839;
                    this.field1809[this.field1807] = var10.field1809[var12] + this.field1839;
                    this.field1838[this.field1807] = var10.field1838[var12] + this.field1839;
                    this.field1807++;
                }
                for (int var13 = 0; var13 < var10.field1839; var13++) {
                    this.field1847[this.field1839] = var10.field1847[var13];
                    this.field1793[this.field1839] = var10.field1793[var13];
                    this.field1794[this.field1839] = var10.field1794[var13];
                    this.field1839++;
                }
            }
        }
    }

    @ObfuscatedName("dn.a([[IIIIZI)Ldn;")
    public class105 method2154(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2152();
        int var7 = arg1 - this.field1836;
        int var8 = this.field1836 + arg1;
        int var9 = arg3 - this.field1836;
        int var10 = this.field1836 + arg3;
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
            var15.field1839 = this.field1839;
            var15.field1832 = this.field1832;
            var15.field1807 = this.field1807;
            var15.field1847 = this.field1847;
            var15.field1794 = this.field1794;
            var15.field1842 = this.field1842;
            var15.field1805 = this.field1805;
            var15.field1798 = this.field1798;
            var15.field1799 = this.field1799;
            var15.field1800 = this.field1800;
            var15.field1801 = this.field1801;
            var15.field1789 = this.field1789;
            var15.field1803 = this.field1803;
            var15.field1833 = this.field1833;
            var15.field1790 = this.field1790;
            var15.field1806 = this.field1806;
            var15.field1808 = this.field1808;
            var15.field1809 = this.field1809;
            var15.field1838 = this.field1838;
            var15.field1811 = this.field1811;
            var15.field1812 = this.field1812;
            var15.field1813 = this.field1813;
            var15.field1793 = new int[var15.field1839];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1839; var16++) {
                int var17 = this.field1847[var16] + arg1;
                int var18 = this.field1794[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1793[var16] = this.field1793[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1839; var26++) {
                int var27 = (-this.field1793[var26] << 16) / this.field1449;
                if (var27 < arg5) {
                    int var28 = this.field1847[var26] + arg1;
                    int var29 = this.field1794[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1793[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1793[var26];
                }
            }
        }
        var15.field1814 = 0;
        return var15;
    }

    @ObfuscatedName("dn.r(Z)Ldn;")
    public class105 method2194(boolean arg0) {
        if (!arg0 && field1804.length < this.field1832) {
            field1804 = new byte[this.field1832 + 100];
        }
        return this.method2159(arg0, field1788, field1804);
    }

    @ObfuscatedName("dn.s(Z)Ldn;")
    public class105 method2155(boolean arg0) {
        if (!arg0 && field1816.length < this.field1832) {
            field1816 = new byte[this.field1832 + 100];
        }
        return this.method2159(arg0, field1828, field1816);
    }

    @ObfuscatedName("dn.y(ZLdn;[B)Ldn;")
    public class105 method2159(boolean arg0, class105 arg1, byte[] arg2) {
        arg1.field1839 = this.field1839;
        arg1.field1832 = this.field1832;
        arg1.field1807 = this.field1807;
        if (arg1.field1847 == null || arg1.field1847.length < this.field1839) {
            arg1.field1847 = new int[this.field1839 + 100];
            arg1.field1793 = new int[this.field1839 + 100];
            arg1.field1794 = new int[this.field1839 + 100];
        }
        for (int var4 = 0; var4 < this.field1839; var4++) {
            arg1.field1847[var4] = this.field1847[var4];
            arg1.field1793[var4] = this.field1793[var4];
            arg1.field1794[var4] = this.field1794[var4];
        }
        if (arg0) {
            arg1.field1803 = this.field1803;
        } else {
            arg1.field1803 = arg2;
            if (this.field1803 == null) {
                for (int var5 = 0; var5 < this.field1832; var5++) {
                    arg1.field1803[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1832; var6++) {
                    arg1.field1803[var6] = this.field1803[var6];
                }
            }
        }
        arg1.field1842 = this.field1842;
        arg1.field1805 = this.field1805;
        arg1.field1798 = this.field1798;
        arg1.field1799 = this.field1799;
        arg1.field1800 = this.field1800;
        arg1.field1801 = this.field1801;
        arg1.field1789 = this.field1789;
        arg1.field1833 = this.field1833;
        arg1.field1790 = this.field1790;
        arg1.field1806 = this.field1806;
        arg1.field1808 = this.field1808;
        arg1.field1809 = this.field1809;
        arg1.field1838 = this.field1838;
        arg1.field1811 = this.field1811;
        arg1.field1812 = this.field1812;
        arg1.field1813 = this.field1813;
        arg1.field1814 = 0;
        return arg1;
    }

    @ObfuscatedName("dn.e()V")
    public void method2152() {
        if (this.field1814 == 1) {
            return;
        }
        this.field1814 = 1;
        this.field1449 = 0;
        this.field1815 = 0;
        this.field1836 = 0;
        for (int var1 = 0; var1 < this.field1839; var1++) {
            int var2 = this.field1847[var1];
            int var3 = this.field1793[var1];
            int var4 = this.field1794[var1];
            if (-var3 > this.field1449) {
                this.field1449 = -var3;
            }
            if (var3 > this.field1815) {
                this.field1815 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1836) {
                this.field1836 = var5;
            }
        }
        this.field1836 = (int) (Math.sqrt((double) this.field1836) + 0.99D);
        this.field1818 = (int) (Math.sqrt((double) (this.field1449 * this.field1449 + this.field1836 * this.field1836)) + 0.99D);
        this.field1817 = this.field1818 + (int) (Math.sqrt((double) (this.field1836 * this.field1836 + this.field1815 * this.field1815)) + 0.99D);
    }

    @ObfuscatedName("dn.g()V")
    public void method2158() {
        if (this.field1814 == 2) {
            return;
        }
        this.field1814 = 2;
        this.field1836 = 0;
        for (int var1 = 0; var1 < this.field1839; var1++) {
            int var2 = this.field1847[var1];
            int var3 = this.field1793[var1];
            int var4 = this.field1794[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1836) {
                this.field1836 = var5;
            }
        }
        this.field1836 = (int) (Math.sqrt((double) this.field1836) + 0.99D);
        this.field1818 = this.field1836;
        this.field1817 = this.field1836 + this.field1836;
    }

    @ObfuscatedName("dn.m()I")
    public int method2176() {
        this.method2152();
        return this.field1836;
    }

    @ObfuscatedName("dn.j(Lcw;I)V")
    public void method2209(class103 arg0, int arg1) {
        if (this.field1811 == null || arg1 == -1) {
            return;
        }
        class88 var3 = arg0.field1766[arg1];
        class102 var4 = var3.field1526;
        Statics.field1802 = 0;
        Statics.field1840 = 0;
        Statics.field1810 = 0;
        for (int var5 = 0; var5 < var3.field1532; var5++) {
            int var6 = var3.field1528[var5];
            this.method2161(var4.field1757[var6], var4.field1754[var6], var3.field1530[var5], var3.field1529[var5], var3.field1531[var5]);
        }
        this.field1814 = 0;
    }

    @ObfuscatedName("dn.n(Lcw;ILcw;I[I)V")
    public void method2160(class103 arg0, int arg1, class103 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2209(arg0, arg1);
            return;
        }
        class88 var6 = arg0.field1766[arg1];
        class88 var7 = arg2.field1766[arg3];
        class102 var8 = var6.field1526;
        Statics.field1802 = 0;
        Statics.field1840 = 0;
        Statics.field1810 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1532; var11++) {
            int var12 = var6.field1528[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1757[var12] == 0) {
                this.method2161(var8.field1757[var12], var8.field1754[var12], var6.field1530[var11], var6.field1529[var11], var6.field1531[var11]);
            }
        }
        Statics.field1802 = 0;
        Statics.field1840 = 0;
        Statics.field1810 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1532; var15++) {
            int var16 = var7.field1528[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1757[var16] == 0) {
                this.method2161(var8.field1757[var16], var8.field1754[var16], var7.field1530[var15], var7.field1529[var15], var7.field1531[var15]);
            }
        }
        this.field1814 = 0;
    }

    @ObfuscatedName("dn.l(I[IIII)V")
    public void method2161(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1802 = 0;
            Statics.field1840 = 0;
            Statics.field1810 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1811.length) {
                    int[] var10 = this.field1811[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1802 += this.field1847[var12];
                        Statics.field1840 += this.field1793[var12];
                        Statics.field1810 += this.field1794[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1802 = Statics.field1802 / var7 + arg2;
                Statics.field1840 = Statics.field1840 / var7 + arg3;
                Statics.field1810 = Statics.field1810 / var7 + arg4;
            } else {
                Statics.field1802 = arg2;
                Statics.field1840 = arg3;
                Statics.field1810 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1811.length) {
                    int[] var15 = this.field1811[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1847[var17] += arg2;
                        this.field1793[var17] += arg3;
                        this.field1794[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1811.length) {
                    int[] var20 = this.field1811[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1847[var22] -= Statics.field1802;
                        this.field1793[var22] -= Statics.field1840;
                        this.field1794[var22] -= Statics.field1810;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1841[var25];
                            int var27 = field1792[var25];
                            int var28 = this.field1847[var22] * var27 + this.field1793[var22] * var26 >> 16;
                            this.field1793[var22] = this.field1793[var22] * var27 - this.field1847[var22] * var26 >> 16;
                            this.field1847[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1841[var23];
                            int var30 = field1792[var23];
                            int var31 = this.field1793[var22] * var30 - this.field1794[var22] * var29 >> 16;
                            this.field1794[var22] = this.field1794[var22] * var30 + this.field1793[var22] * var29 >> 16;
                            this.field1793[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1841[var24];
                            int var33 = field1792[var24];
                            int var34 = this.field1847[var22] * var33 + this.field1794[var22] * var32 >> 16;
                            this.field1794[var22] = this.field1794[var22] * var33 - this.field1847[var22] * var32 >> 16;
                            this.field1847[var22] = var34;
                        }
                        this.field1847[var22] += Statics.field1802;
                        this.field1793[var22] += Statics.field1840;
                        this.field1794[var22] += Statics.field1810;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1811.length) {
                    int[] var37 = this.field1811[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1847[var39] -= Statics.field1802;
                        this.field1793[var39] -= Statics.field1840;
                        this.field1794[var39] -= Statics.field1810;
                        this.field1847[var39] = this.field1847[var39] * arg2 / 128;
                        this.field1793[var39] = this.field1793[var39] * arg3 / 128;
                        this.field1794[var39] = this.field1794[var39] * arg4 / 128;
                        this.field1847[var39] += Statics.field1802;
                        this.field1793[var39] += Statics.field1840;
                        this.field1794[var39] += Statics.field1810;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1812 != null && this.field1803 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1812.length) {
                    int[] var42 = this.field1812[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1803[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1803[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dn.h()V")
    public void method2162() {
        for (int var1 = 0; var1 < this.field1839; var1++) {
            int var2 = this.field1847[var1];
            this.field1847[var1] = this.field1794[var1];
            this.field1794[var1] = -var2;
        }
        this.field1814 = 0;
    }

    @ObfuscatedName("dn.i()V")
    public void method2207() {
        for (int var1 = 0; var1 < this.field1839; var1++) {
            this.field1847[var1] = -this.field1847[var1];
            this.field1794[var1] = -this.field1794[var1];
        }
        this.field1814 = 0;
    }

    @ObfuscatedName("dn.v()V")
    public void method2164() {
        for (int var1 = 0; var1 < this.field1839; var1++) {
            int var2 = this.field1794[var1];
            this.field1794[var1] = this.field1847[var1];
            this.field1847[var1] = -var2;
        }
        this.field1814 = 0;
    }

    @ObfuscatedName("dn.b(I)V")
    public void method2165(int arg0) {
        int var2 = field1841[arg0];
        int var3 = field1792[arg0];
        for (int var4 = 0; var4 < this.field1839; var4++) {
            int var5 = this.field1793[var4] * var3 - this.field1794[var4] * var2 >> 16;
            this.field1794[var4] = this.field1794[var4] * var3 + this.field1793[var4] * var2 >> 16;
            this.field1793[var4] = var5;
        }
        this.field1814 = 0;
    }

    @ObfuscatedName("dn.c(III)V")
    public void method2166(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1839; var4++) {
            this.field1847[var4] += arg0;
            this.field1793[var4] += arg1;
            this.field1794[var4] += arg2;
        }
        this.field1814 = 0;
    }

    @ObfuscatedName("dn.x(III)V")
    public void method2167(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1839; var4++) {
            this.field1847[var4] = this.field1847[var4] * arg0 / 128;
            this.field1793[var4] = this.field1793[var4] * arg1 / 128;
            this.field1794[var4] = this.field1794[var4] * arg2 / 128;
        }
        this.field1814 = 0;
    }

    @ObfuscatedName("dn.d(IIIIIII)V")
    public final void method2168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1791[0] = -1;
        if (this.field1814 != 2 && this.field1814 != 1) {
            this.method2158();
        }
        int var8 = Statics.field1555;
        int var9 = Statics.field1576;
        int var10 = field1841[arg0];
        int var11 = field1792[arg0];
        int var12 = field1841[arg1];
        int var13 = field1792[arg1];
        int var14 = field1841[arg2];
        int var15 = field1792[arg2];
        int var16 = field1841[arg3];
        int var17 = field1792[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1839; var19++) {
            int var20 = this.field1847[var19];
            int var21 = this.field1793[var19];
            int var22 = this.field1794[var19];
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
            field1824[var19] = var30 - var18;
            field1822[var19] = class91.field1563 * var26 / var30 + var8;
            field1849[var19] = class91.field1563 * var29 / var30 + var9;
            if (this.field1807 > 0) {
                field1825[var19] = var26;
                field1826[var19] = var29;
                field1827[var19] = var30;
            }
        }
        try {
            this.method2170(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dn.p(IIIIIIII)V")
    public final void method2169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1791[0] = -1;
        if (this.field1814 != 2 && this.field1814 != 1) {
            this.method2158();
        }
        int var9 = Statics.field1555;
        int var10 = Statics.field1576;
        int var11 = field1841[arg0];
        int var12 = field1792[arg0];
        int var13 = field1841[arg1];
        int var14 = field1792[arg1];
        int var15 = field1841[arg2];
        int var16 = field1792[arg2];
        int var17 = field1841[arg3];
        int var18 = field1792[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1839; var20++) {
            int var21 = this.field1847[var20];
            int var22 = this.field1793[var20];
            int var23 = this.field1794[var20];
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
            field1824[var20] = var31 - var19;
            field1822[var20] = class91.field1563 * var27 / arg7 + var9;
            field1849[var20] = class91.field1563 * var30 / arg7 + var10;
            if (this.field1807 > 0) {
                field1825[var20] = var27;
                field1826[var20] = var30;
                field1827[var20] = var31;
            }
        }
        try {
            this.method2170(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dn.ac(IIIIIIIII)V")
    public void method1777(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1791[0] = -1;
        if (this.field1814 != 1) {
            this.method2152();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1836 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1836) * class91.field1563;
        if (var15 / var13 >= Statics.field1565) {
            return;
        }
        int var16 = (this.field1836 + var14) * class91.field1563;
        if (var16 / var13 <= Statics.field1569) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1836 * arg1 >> 16;
        int var19 = (var17 + var18) * class91.field1563;
        if (var19 / var13 <= Statics.field1571) {
            return;
        }
        int var20 = (this.field1449 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class91.field1563;
        if (var21 / var13 >= Statics.field1572) {
            return;
        }
        int var22 = (this.field1449 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1807 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1796) {
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
            int var32 = field1843 - Statics.field1555;
            int var33 = field1844 - Statics.field1576;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1813) {
                    field1797[field1845++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1555;
        int var35 = Statics.field1576;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1841[arg0];
            var37 = field1792[arg0];
        }
        for (int var38 = 0; var38 < this.field1839; var38++) {
            int var39 = this.field1847[var38];
            int var40 = this.field1793[var38];
            int var41 = this.field1794[var38];
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
            field1824[var38] = var50 - var11;
            if (var50 >= 50) {
                field1822[var38] = class91.field1563 * var46 / var50 + var34;
                field1849[var38] = class91.field1563 * var49 / var50 + var35;
            } else {
                field1822[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1825[var38] = var46;
                field1826[var38] = var49;
                field1827[var38] = var50;
            }
        }
        try {
            this.method2170(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dn.q(ZZI)V")
    public final void method2170(boolean arg0, boolean arg1, int arg2) {
        if (this.field1817 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1817; var4++) {
            field1791[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1832; var5++) {
            if (this.field1801[var5] != -2) {
                int var6 = this.field1842[var5];
                int var7 = this.field1805[var5];
                int var8 = this.field1798[var5];
                int var9 = field1822[var6];
                int var10 = field1822[var7];
                int var11 = field1822[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1825[var6];
                    int var13 = field1825[var7];
                    int var14 = field1825[var8];
                    int var15 = field1826[var6];
                    int var16 = field1826[var7];
                    int var17 = field1826[var8];
                    int var18 = field1827[var6];
                    int var19 = field1827[var7];
                    int var20 = field1827[var8];
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
                        field1821[var5] = true;
                        int var30 = (field1824[var6] + field1824[var7] + field1824[var8]) / 3 + this.field1818;
                        field1830[var30][field1791[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2213(field1843, field1844, field1849[var6], field1849[var7], field1849[var8], var9, var10, var11)) {
                        field1797[field1845++] = arg2;
                        arg1 = false;
                    }
                    if ((field1849[var8] - field1849[var7]) * (var9 - var10) - (field1849[var6] - field1849[var7]) * (var11 - var10) > 0) {
                        field1821[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1566 && var10 <= Statics.field1566 && var11 <= Statics.field1566) {
                            field1820[var5] = false;
                        } else {
                            field1820[var5] = true;
                        }
                        int var31 = (field1824[var6] + field1824[var7] + field1824[var8]) / 3 + this.field1818;
                        field1830[var31][field1791[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1789 == null) {
            for (int var32 = this.field1817 - 1; var32 >= 0; var32--) {
                int var33 = field1791[var32];
                if (var33 > 0) {
                    int[] var34 = field1830[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2171(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1831[var36] = 0;
            field1835[var36] = 0;
        }
        for (int var37 = this.field1817 - 1; var37 >= 0; var37--) {
            int var38 = field1791[var37];
            if (var38 > 0) {
                int[] var39 = field1830[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1789[var41];
                    int var43 = field1831[var42]++;
                    field1819[var42][var43] = var41;
                    if (var42 < 10) {
                        field1835[var42] += var37;
                    } else if (var42 == 10) {
                        field1787[var43] = var37;
                    } else {
                        field1834[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1831[1] > 0 || field1831[2] > 0) {
            var44 = (field1835[1] + field1835[2]) / (field1831[1] + field1831[2]);
        }
        int var45 = 0;
        if (field1831[3] > 0 || field1831[4] > 0) {
            var45 = (field1835[3] + field1835[4]) / (field1831[3] + field1831[4]);
        }
        int var46 = 0;
        if (field1831[6] > 0 || field1831[8] > 0) {
            var46 = (field1835[6] + field1835[8]) / (field1831[6] + field1831[8]);
        }
        int var47 = 0;
        int var48 = field1831[10];
        int[] var49 = field1819[10];
        int[] var50 = field1787;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1831[11];
            var49 = field1819[11];
            var50 = field1834;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2171(var49[var47++]);
                if (var47 == var48 && field1819[11] != var49) {
                    var47 = 0;
                    var48 = field1831[11];
                    var49 = field1819[11];
                    var50 = field1834;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2171(var49[var47++]);
                if (var47 == var48 && field1819[11] != var49) {
                    var47 = 0;
                    var48 = field1831[11];
                    var49 = field1819[11];
                    var50 = field1834;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2171(var49[var47++]);
                if (var47 == var48 && field1819[11] != var49) {
                    var47 = 0;
                    var48 = field1831[11];
                    var49 = field1819[11];
                    var50 = field1834;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1831[var52];
            int[] var54 = field1819[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2171(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2171(var49[var47++]);
            if (var47 == var48 && field1819[11] != var49) {
                var47 = 0;
                var49 = field1819[11];
                var48 = field1831[11];
                var50 = field1834;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dn.w(I)V")
    public final void method2171(int arg0) {
        if (field1821[arg0]) {
            this.method2195(arg0);
            return;
        }
        int var2 = this.field1842[arg0];
        int var3 = this.field1805[arg0];
        int var4 = this.field1798[arg0];
        class91.field1578 = field1820[arg0];
        if (this.field1803 == null) {
            class91.field1559 = 0;
        } else {
            class91.field1559 = this.field1803[arg0] & 0xFF;
        }
        if (this.field1790 != null && this.field1790[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1833 == null || this.field1833[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1833[arg0] & 0xFF;
                var6 = this.field1808[var5];
                var7 = this.field1809[var5];
                var8 = this.field1838[var5];
            }
            if (this.field1801[arg0] == -1) {
                class91.method2010(field1849[var2], field1849[var3], field1849[var4], field1822[var2], field1822[var3], field1822[var4], this.field1799[arg0], this.field1799[arg0], this.field1799[arg0], field1825[var6], field1825[var7], field1825[var8], field1826[var6], field1826[var7], field1826[var8], field1827[var6], field1827[var7], field1827[var8], this.field1790[arg0]);
            } else {
                class91.method2010(field1849[var2], field1849[var3], field1849[var4], field1822[var2], field1822[var3], field1822[var4], this.field1799[arg0], this.field1800[arg0], this.field1801[arg0], field1825[var6], field1825[var7], field1825[var8], field1826[var6], field1826[var7], field1826[var8], field1827[var6], field1827[var7], field1827[var8], this.field1790[arg0]);
            }
        } else if (this.field1801[arg0] == -1) {
            class91.method1974(field1849[var2], field1849[var3], field1849[var4], field1822[var2], field1822[var3], field1822[var4], field1829[this.field1799[arg0]]);
        } else {
            class91.method1972(field1849[var2], field1849[var3], field1849[var4], field1822[var2], field1822[var3], field1822[var4], this.field1799[arg0], this.field1800[arg0], this.field1801[arg0]);
        }
    }

    @ObfuscatedName("dn.k(I)V")
    public final void method2195(int arg0) {
        int var2 = Statics.field1555;
        int var3 = Statics.field1576;
        int var4 = 0;
        int var5 = this.field1842[arg0];
        int var6 = this.field1805[arg0];
        int var7 = this.field1798[arg0];
        int var8 = field1827[var5];
        int var9 = field1827[var6];
        int var10 = field1827[var7];
        if (this.field1803 == null) {
            class91.field1559 = 0;
        } else {
            class91.field1559 = this.field1803[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1823[var4] = field1822[var5];
            field1837[var4] = field1849[var5];
            field1848[var4++] = this.field1799[arg0];
        } else {
            int var11 = field1825[var5];
            int var12 = field1826[var5];
            int var13 = this.field1799[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1850[var10 - var8];
                field1823[var4] = (((field1825[var7] - var11) * var14 >> 16) + var11) * class91.field1563 / 50 + var2;
                field1837[var4] = (((field1826[var7] - var12) * var14 >> 16) + var12) * class91.field1563 / 50 + var3;
                field1848[var4++] = ((this.field1801[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1850[var9 - var8];
                field1823[var4] = (((field1825[var6] - var11) * var15 >> 16) + var11) * class91.field1563 / 50 + var2;
                field1837[var4] = (((field1826[var6] - var12) * var15 >> 16) + var12) * class91.field1563 / 50 + var3;
                field1848[var4++] = ((this.field1800[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1823[var4] = field1822[var6];
            field1837[var4] = field1849[var6];
            field1848[var4++] = this.field1800[arg0];
        } else {
            int var16 = field1825[var6];
            int var17 = field1826[var6];
            int var18 = this.field1800[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1850[var8 - var9];
                field1823[var4] = (((field1825[var5] - var16) * var19 >> 16) + var16) * class91.field1563 / 50 + var2;
                field1837[var4] = (((field1826[var5] - var17) * var19 >> 16) + var17) * class91.field1563 / 50 + var3;
                field1848[var4++] = ((this.field1799[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1850[var10 - var9];
                field1823[var4] = (((field1825[var7] - var16) * var20 >> 16) + var16) * class91.field1563 / 50 + var2;
                field1837[var4] = (((field1826[var7] - var17) * var20 >> 16) + var17) * class91.field1563 / 50 + var3;
                field1848[var4++] = ((this.field1801[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1823[var4] = field1822[var7];
            field1837[var4] = field1849[var7];
            field1848[var4++] = this.field1801[arg0];
        } else {
            int var21 = field1825[var7];
            int var22 = field1826[var7];
            int var23 = this.field1801[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1850[var9 - var10];
                field1823[var4] = (((field1825[var6] - var21) * var24 >> 16) + var21) * class91.field1563 / 50 + var2;
                field1837[var4] = (((field1826[var6] - var22) * var24 >> 16) + var22) * class91.field1563 / 50 + var3;
                field1848[var4++] = ((this.field1800[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1850[var8 - var10];
                field1823[var4] = (((field1825[var5] - var21) * var25 >> 16) + var21) * class91.field1563 / 50 + var2;
                field1837[var4] = (((field1826[var5] - var22) * var25 >> 16) + var22) * class91.field1563 / 50 + var3;
                field1848[var4++] = ((this.field1799[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1823[0];
        int var27 = field1823[1];
        int var28 = field1823[2];
        int var29 = field1837[0];
        int var30 = field1837[1];
        int var31 = field1837[2];
        class91.field1578 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1566 || var27 > Statics.field1566 || var28 > Statics.field1566) {
                class91.field1578 = true;
            }
            if (this.field1790 != null && this.field1790[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1833 == null || this.field1833[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1833[arg0] & 0xFF;
                    var33 = this.field1808[var32];
                    var34 = this.field1809[var32];
                    var35 = this.field1838[var32];
                }
                if (this.field1801[arg0] == -1) {
                    class91.method2010(var29, var30, var31, var26, var27, var28, this.field1799[arg0], this.field1799[arg0], this.field1799[arg0], field1825[var33], field1825[var34], field1825[var35], field1826[var33], field1826[var34], field1826[var35], field1827[var33], field1827[var34], field1827[var35], this.field1790[arg0]);
                } else {
                    class91.method2010(var29, var30, var31, var26, var27, var28, field1848[0], field1848[1], field1848[2], field1825[var33], field1825[var34], field1825[var35], field1826[var33], field1826[var34], field1826[var35], field1827[var33], field1827[var34], field1827[var35], this.field1790[arg0]);
                }
            } else if (this.field1801[arg0] == -1) {
                class91.method1974(var29, var30, var31, var26, var27, var28, field1829[this.field1799[arg0]]);
            } else {
                class91.method1972(var29, var30, var31, var26, var27, var28, field1848[0], field1848[1], field1848[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1566 || var27 > Statics.field1566 || var28 > Statics.field1566 || field1823[3] < 0 || field1823[3] > Statics.field1566) {
            class91.field1578 = true;
        }
        if (this.field1790 != null && this.field1790[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1833 == null || this.field1833[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1833[arg0] & 0xFF;
                var37 = this.field1808[var36];
                var38 = this.field1809[var36];
                var39 = this.field1838[var36];
            }
            short var40 = this.field1790[arg0];
            if (this.field1801[arg0] == -1) {
                class91.method2010(var29, var30, var31, var26, var27, var28, this.field1799[arg0], this.field1799[arg0], this.field1799[arg0], field1825[var37], field1825[var38], field1825[var39], field1826[var37], field1826[var38], field1826[var39], field1827[var37], field1827[var38], field1827[var39], var40);
                class91.method2010(var29, var31, field1837[3], var26, var28, field1823[3], this.field1799[arg0], this.field1799[arg0], this.field1799[arg0], field1825[var37], field1825[var38], field1825[var39], field1826[var37], field1826[var38], field1826[var39], field1827[var37], field1827[var38], field1827[var39], var40);
            } else {
                class91.method2010(var29, var30, var31, var26, var27, var28, field1848[0], field1848[1], field1848[2], field1825[var37], field1825[var38], field1825[var39], field1826[var37], field1826[var38], field1826[var39], field1827[var37], field1827[var38], field1827[var39], var40);
                class91.method2010(var29, var31, field1837[3], var26, var28, field1823[3], field1848[0], field1848[2], field1848[3], field1825[var37], field1825[var38], field1825[var39], field1826[var37], field1826[var38], field1826[var39], field1827[var37], field1827[var38], field1827[var39], var40);
            }
        } else if (this.field1801[arg0] == -1) {
            int var41 = field1829[this.field1799[arg0]];
            class91.method1974(var29, var30, var31, var26, var27, var28, var41);
            class91.method1974(var29, var31, field1837[3], var26, var28, field1823[3], var41);
        } else {
            class91.method1972(var29, var30, var31, var26, var27, var28, field1848[0], field1848[1], field1848[2]);
            class91.method1972(var29, var31, field1837[3], var26, var28, field1823[3], field1848[0], field1848[2], field1848[3]);
        }
    }

    @ObfuscatedName("dn.o(IIIIIIII)Z")
    public final boolean method2213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
