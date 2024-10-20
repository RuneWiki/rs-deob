package deob;

@ObfuscatedName("dt")
public class class105 extends class85 {

    @ObfuscatedName("dt.n")
    public static class105 field1823 = new class105();

    @ObfuscatedName("dt.q")
    public static byte[] field1800 = new byte[1];

    @ObfuscatedName("dt.c")
    public static class105 field1830 = new class105();

    @ObfuscatedName("dt.l")
    public static byte[] field1784 = new byte[1];

    @ObfuscatedName("dt.r")
    public int field1790 = 0;

    @ObfuscatedName("dt.u")
    public int[] field1786;

    @ObfuscatedName("dt.j")
    public int[] field1787;

    @ObfuscatedName("dt.w")
    public int[] field1788;

    @ObfuscatedName("dt.y")
    public int field1832 = 0;

    @ObfuscatedName("dt.o")
    public int[] field1846;

    @ObfuscatedName("dt.h")
    public int[] field1791;

    @ObfuscatedName("dt.e")
    public int[] field1792;

    @ObfuscatedName("dt.v")
    public int[] field1793;

    @ObfuscatedName("dt.p")
    public int[] field1794;

    @ObfuscatedName("dt.m")
    public int[] field1795;

    @ObfuscatedName("dt.b")
    public byte[] field1796;

    @ObfuscatedName("dt.s")
    public byte[] field1797;

    @ObfuscatedName("dt.x")
    public byte[] field1798;

    @ObfuscatedName("dt.z")
    public short[] field1799;

    @ObfuscatedName("dt.d")
    public byte field1810 = 0;

    @ObfuscatedName("dt.a")
    public int field1801 = 0;

    @ObfuscatedName("dt.t")
    public int[] field1802;

    @ObfuscatedName("dt.k")
    public int[] field1803;

    @ObfuscatedName("dt.f")
    public int[] field1826;

    @ObfuscatedName("dt.g")
    public int[][] field1831;

    @ObfuscatedName("dt.i")
    public int[][] field1806;

    @ObfuscatedName("dt.ah")
    public boolean field1815 = false;

    @ObfuscatedName("dt.ag")
    public int field1808;

    @ObfuscatedName("dt.ac")
    public int field1783;

    @ObfuscatedName("dt.al")
    public int field1827;

    @ObfuscatedName("dt.aj")
    public int field1811;

    @ObfuscatedName("dt.at")
    public int field1812;

    @ObfuscatedName("dt.aa")
    public static boolean[] field1814 = new boolean[4096];

    @ObfuscatedName("dt.ak")
    public static boolean[] field1840 = new boolean[4096];

    @ObfuscatedName("dt.an")
    public static int[] field1816 = new int[4096];

    @ObfuscatedName("dt.au")
    public static int[] field1817 = new int[4096];

    @ObfuscatedName("dt.ai")
    public static int[] field1818 = new int[4096];

    @ObfuscatedName("dt.az")
    public static int[] field1819 = new int[4096];

    @ObfuscatedName("dt.ao")
    public static int[] field1807 = new int[4096];

    @ObfuscatedName("dt.av")
    public static int[] field1821 = new int[4096];

    @ObfuscatedName("dt.af")
    public static int[] field1841 = new int[1600];

    @ObfuscatedName("dt.ax")
    public static int[][] field1824 = new int[1600][512];

    @ObfuscatedName("dt.ae")
    public static int[] field1825 = new int[12];

    @ObfuscatedName("dt.aw")
    public static int[][] field1809 = new int[12][2000];

    @ObfuscatedName("dt.ay")
    public static int[] field1805 = new int[2000];

    @ObfuscatedName("dt.ab")
    public static int[] field1837 = new int[2000];

    @ObfuscatedName("dt.ar")
    public static int[] field1829 = new int[12];

    @ObfuscatedName("dt.am")
    public static int[] field1785 = new int[10];

    @ObfuscatedName("dt.aq")
    public static int[] field1782 = new int[10];

    @ObfuscatedName("dt.as")
    public static int[] field1789 = new int[10];

    @ObfuscatedName("dt.bh")
    public static boolean field1836 = false;

    @ObfuscatedName("dt.ba")
    public static int field1781 = 0;

    @ObfuscatedName("dt.bc")
    public static int field1820 = 0;

    @ObfuscatedName("dt.bw")
    public static int field1839 = 0;

    @ObfuscatedName("dt.bg")
    public static int[] field1828 = new int[1000];

    @ObfuscatedName("dt.bo")
    public static int[] field1804 = class91.field1577;

    @ObfuscatedName("dt.bl")
    public static int[] field1842 = class91.field1576;

    @ObfuscatedName("dt.bk")
    public static int[] field1843 = class91.field1573;

    @ObfuscatedName("dt.bs")
    public static int[] field1844 = class91.field1562;

    public class105() {
    }

    public class105(class105[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1790 = 0;
        this.field1832 = 0;
        this.field1801 = 0;
        this.field1810 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class105 var8 = arg0[var7];
            if (var8 != null) {
                this.field1790 += var8.field1790;
                this.field1832 += var8.field1832;
                this.field1801 += var8.field1801;
                if (var8.field1796 == null) {
                    if (this.field1810 == -1) {
                        this.field1810 = var8.field1810;
                    }
                    if (this.field1810 != var8.field1810) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1797 != null;
                var5 |= var8.field1799 != null;
                var6 |= var8.field1798 != null;
            }
        }
        this.field1786 = new int[this.field1790];
        this.field1787 = new int[this.field1790];
        this.field1788 = new int[this.field1790];
        this.field1846 = new int[this.field1832];
        this.field1791 = new int[this.field1832];
        this.field1792 = new int[this.field1832];
        this.field1793 = new int[this.field1832];
        this.field1794 = new int[this.field1832];
        this.field1795 = new int[this.field1832];
        if (var3) {
            this.field1796 = new byte[this.field1832];
        }
        if (var4) {
            this.field1797 = new byte[this.field1832];
        }
        if (var5) {
            this.field1799 = new short[this.field1832];
        }
        if (var6) {
            this.field1798 = new byte[this.field1832];
        }
        if (this.field1801 > 0) {
            this.field1802 = new int[this.field1801];
            this.field1803 = new int[this.field1801];
            this.field1826 = new int[this.field1801];
        }
        this.field1790 = 0;
        this.field1832 = 0;
        this.field1801 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class105 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1832; var11++) {
                    this.field1846[this.field1832] = var10.field1846[var11] + this.field1790;
                    this.field1791[this.field1832] = var10.field1791[var11] + this.field1790;
                    this.field1792[this.field1832] = var10.field1792[var11] + this.field1790;
                    this.field1793[this.field1832] = var10.field1793[var11];
                    this.field1794[this.field1832] = var10.field1794[var11];
                    this.field1795[this.field1832] = var10.field1795[var11];
                    if (var3) {
                        if (var10.field1796 == null) {
                            this.field1796[this.field1832] = var10.field1810;
                        } else {
                            this.field1796[this.field1832] = var10.field1796[var11];
                        }
                    }
                    if (var4 && var10.field1797 != null) {
                        this.field1797[this.field1832] = var10.field1797[var11];
                    }
                    if (var5) {
                        if (var10.field1799 == null) {
                            this.field1799[this.field1832] = -1;
                        } else {
                            this.field1799[this.field1832] = var10.field1799[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1798 == null || var10.field1798[var11] == -1) {
                            this.field1798[this.field1832] = -1;
                        } else {
                            this.field1798[this.field1832] = (byte) (var10.field1798[var11] + this.field1801);
                        }
                    }
                    this.field1832++;
                }
                for (int var12 = 0; var12 < var10.field1801; var12++) {
                    this.field1802[this.field1801] = var10.field1802[var12] + this.field1790;
                    this.field1803[this.field1801] = var10.field1803[var12] + this.field1790;
                    this.field1826[this.field1801] = var10.field1826[var12] + this.field1790;
                    this.field1801++;
                }
                for (int var13 = 0; var13 < var10.field1790; var13++) {
                    this.field1786[this.field1790] = var10.field1786[var13];
                    this.field1787[this.field1790] = var10.field1787[var13];
                    this.field1788[this.field1790] = var10.field1788[var13];
                    this.field1790++;
                }
            }
        }
    }

    @ObfuscatedName("dt.n([[IIIIZI)Ldt;")
    public class105 method2172(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2164();
        int var7 = arg1 - this.field1827;
        int var8 = this.field1827 + arg1;
        int var9 = arg3 - this.field1827;
        int var10 = this.field1827 + arg3;
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
            var15.field1790 = this.field1790;
            var15.field1832 = this.field1832;
            var15.field1801 = this.field1801;
            var15.field1786 = this.field1786;
            var15.field1788 = this.field1788;
            var15.field1846 = this.field1846;
            var15.field1791 = this.field1791;
            var15.field1792 = this.field1792;
            var15.field1793 = this.field1793;
            var15.field1794 = this.field1794;
            var15.field1795 = this.field1795;
            var15.field1796 = this.field1796;
            var15.field1797 = this.field1797;
            var15.field1798 = this.field1798;
            var15.field1799 = this.field1799;
            var15.field1810 = this.field1810;
            var15.field1802 = this.field1802;
            var15.field1803 = this.field1803;
            var15.field1826 = this.field1826;
            var15.field1831 = this.field1831;
            var15.field1806 = this.field1806;
            var15.field1815 = this.field1815;
            var15.field1787 = new int[var15.field1790];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1790; var16++) {
                int var17 = this.field1786[var16] + arg1;
                int var18 = this.field1788[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1787[var16] = this.field1787[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1790; var26++) {
                int var27 = (-this.field1787[var26] << 16) / this.field1437;
                if (var27 < arg5) {
                    int var28 = this.field1786[var26] + arg1;
                    int var29 = this.field1788[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1787[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1787[var26];
                }
            }
        }
        var15.field1808 = 0;
        return var15;
    }

    @ObfuscatedName("dt.q(Z)Ldt;")
    public class105 method2173(boolean arg0) {
        if (!arg0 && field1800.length < this.field1832) {
            field1800 = new byte[this.field1832 + 100];
        }
        return this.method2163(arg0, field1823, field1800);
    }

    @ObfuscatedName("dt.l(Z)Ldt;")
    public class105 method2162(boolean arg0) {
        if (!arg0 && field1784.length < this.field1832) {
            field1784 = new byte[this.field1832 + 100];
        }
        return this.method2163(arg0, field1830, field1784);
    }

    @ObfuscatedName("dt.r(ZLdt;[B)Ldt;")
    public class105 method2163(boolean arg0, class105 arg1, byte[] arg2) {
        arg1.field1790 = this.field1790;
        arg1.field1832 = this.field1832;
        arg1.field1801 = this.field1801;
        if (arg1.field1786 == null || arg1.field1786.length < this.field1790) {
            arg1.field1786 = new int[this.field1790 + 100];
            arg1.field1787 = new int[this.field1790 + 100];
            arg1.field1788 = new int[this.field1790 + 100];
        }
        for (int var4 = 0; var4 < this.field1790; var4++) {
            arg1.field1786[var4] = this.field1786[var4];
            arg1.field1787[var4] = this.field1787[var4];
            arg1.field1788[var4] = this.field1788[var4];
        }
        if (arg0) {
            arg1.field1797 = this.field1797;
        } else {
            arg1.field1797 = arg2;
            if (this.field1797 == null) {
                for (int var5 = 0; var5 < this.field1832; var5++) {
                    arg1.field1797[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1832; var6++) {
                    arg1.field1797[var6] = this.field1797[var6];
                }
            }
        }
        arg1.field1846 = this.field1846;
        arg1.field1791 = this.field1791;
        arg1.field1792 = this.field1792;
        arg1.field1793 = this.field1793;
        arg1.field1794 = this.field1794;
        arg1.field1795 = this.field1795;
        arg1.field1796 = this.field1796;
        arg1.field1798 = this.field1798;
        arg1.field1799 = this.field1799;
        arg1.field1810 = this.field1810;
        arg1.field1802 = this.field1802;
        arg1.field1803 = this.field1803;
        arg1.field1826 = this.field1826;
        arg1.field1831 = this.field1831;
        arg1.field1806 = this.field1806;
        arg1.field1815 = this.field1815;
        arg1.field1808 = 0;
        return arg1;
    }

    @ObfuscatedName("dt.u()V")
    public void method2164() {
        if (this.field1808 == 1) {
            return;
        }
        this.field1808 = 1;
        this.field1437 = 0;
        this.field1783 = 0;
        this.field1827 = 0;
        for (int var1 = 0; var1 < this.field1790; var1++) {
            int var2 = this.field1786[var1];
            int var3 = this.field1787[var1];
            int var4 = this.field1788[var1];
            if (-var3 > this.field1437) {
                this.field1437 = -var3;
            }
            if (var3 > this.field1783) {
                this.field1783 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1827) {
                this.field1827 = var5;
            }
        }
        this.field1827 = (int) (Math.sqrt((double) this.field1827) + 0.99D);
        this.field1812 = (int) (Math.sqrt((double) (this.field1437 * this.field1437 + this.field1827 * this.field1827)) + 0.99D);
        this.field1811 = this.field1812 + (int) (Math.sqrt((double) (this.field1827 * this.field1827 + this.field1783 * this.field1783)) + 0.99D);
    }

    @ObfuscatedName("dt.j()V")
    public void method2165() {
        if (this.field1808 == 2) {
            return;
        }
        this.field1808 = 2;
        this.field1827 = 0;
        for (int var1 = 0; var1 < this.field1790; var1++) {
            int var2 = this.field1786[var1];
            int var3 = this.field1787[var1];
            int var4 = this.field1788[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1827) {
                this.field1827 = var5;
            }
        }
        this.field1827 = (int) (Math.sqrt((double) this.field1827) + 0.99D);
        this.field1812 = this.field1827;
        this.field1811 = this.field1827 + this.field1827;
    }

    @ObfuscatedName("dt.w()I")
    public int method2166() {
        this.method2164();
        return this.field1827;
    }

    @ObfuscatedName("dt.y(Lcv;I)V")
    public void method2177(class103 arg0, int arg1) {
        if (this.field1831 == null || arg1 == -1) {
            return;
        }
        class88 var3 = arg0.field1753[arg1];
        class102 var4 = var3.field1530;
        Statics.field1833 = 0;
        Statics.field1834 = 0;
        Statics.field1835 = 0;
        for (int var5 = 0; var5 < var3.field1531; var5++) {
            int var6 = var3.field1532[var5];
            this.method2168(var4.field1746[var6], var4.field1747[var6], var3.field1533[var5], var3.field1526[var5], var3.field1535[var5]);
        }
        this.field1808 = 0;
    }

    @ObfuscatedName("dt.o(Lcv;ILcv;I[I)V")
    public void method2183(class103 arg0, int arg1, class103 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2177(arg0, arg1);
            return;
        }
        class88 var6 = arg0.field1753[arg1];
        class88 var7 = arg2.field1753[arg3];
        class102 var8 = var6.field1530;
        Statics.field1833 = 0;
        Statics.field1834 = 0;
        Statics.field1835 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1531; var11++) {
            int var12 = var6.field1532[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1746[var12] == 0) {
                this.method2168(var8.field1746[var12], var8.field1747[var12], var6.field1533[var11], var6.field1526[var11], var6.field1535[var11]);
            }
        }
        Statics.field1833 = 0;
        Statics.field1834 = 0;
        Statics.field1835 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1531; var15++) {
            int var16 = var7.field1532[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1746[var16] == 0) {
                this.method2168(var8.field1746[var16], var8.field1747[var16], var7.field1533[var15], var7.field1526[var15], var7.field1535[var15]);
            }
        }
        this.field1808 = 0;
    }

    @ObfuscatedName("dt.h(I[IIII)V")
    public void method2168(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1833 = 0;
            Statics.field1834 = 0;
            Statics.field1835 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1831.length) {
                    int[] var10 = this.field1831[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1833 += this.field1786[var12];
                        Statics.field1834 += this.field1787[var12];
                        Statics.field1835 += this.field1788[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1833 = Statics.field1833 / var7 + arg2;
                Statics.field1834 = Statics.field1834 / var7 + arg3;
                Statics.field1835 = Statics.field1835 / var7 + arg4;
            } else {
                Statics.field1833 = arg2;
                Statics.field1834 = arg3;
                Statics.field1835 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1831.length) {
                    int[] var15 = this.field1831[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1786[var17] += arg2;
                        this.field1787[var17] += arg3;
                        this.field1788[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1831.length) {
                    int[] var20 = this.field1831[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1786[var22] -= Statics.field1833;
                        this.field1787[var22] -= Statics.field1834;
                        this.field1788[var22] -= Statics.field1835;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1804[var25];
                            int var27 = field1842[var25];
                            int var28 = this.field1787[var22] * var26 + this.field1786[var22] * var27 >> 16;
                            this.field1787[var22] = this.field1787[var22] * var27 - this.field1786[var22] * var26 >> 16;
                            this.field1786[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1804[var23];
                            int var30 = field1842[var23];
                            int var31 = this.field1787[var22] * var30 - this.field1788[var22] * var29 >> 16;
                            this.field1788[var22] = this.field1788[var22] * var30 + this.field1787[var22] * var29 >> 16;
                            this.field1787[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1804[var24];
                            int var33 = field1842[var24];
                            int var34 = this.field1788[var22] * var32 + this.field1786[var22] * var33 >> 16;
                            this.field1788[var22] = this.field1788[var22] * var33 - this.field1786[var22] * var32 >> 16;
                            this.field1786[var22] = var34;
                        }
                        this.field1786[var22] += Statics.field1833;
                        this.field1787[var22] += Statics.field1834;
                        this.field1788[var22] += Statics.field1835;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1831.length) {
                    int[] var37 = this.field1831[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1786[var39] -= Statics.field1833;
                        this.field1787[var39] -= Statics.field1834;
                        this.field1788[var39] -= Statics.field1835;
                        this.field1786[var39] = this.field1786[var39] * arg2 / 128;
                        this.field1787[var39] = this.field1787[var39] * arg3 / 128;
                        this.field1788[var39] = this.field1788[var39] * arg4 / 128;
                        this.field1786[var39] += Statics.field1833;
                        this.field1787[var39] += Statics.field1834;
                        this.field1788[var39] += Statics.field1835;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1806 != null && this.field1797 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1806.length) {
                    int[] var42 = this.field1806[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1797[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1797[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dt.m()V")
    public void method2169() {
        for (int var1 = 0; var1 < this.field1790; var1++) {
            int var2 = this.field1786[var1];
            this.field1786[var1] = this.field1788[var1];
            this.field1788[var1] = -var2;
        }
        this.field1808 = 0;
    }

    @ObfuscatedName("dt.b()V")
    public void method2170() {
        for (int var1 = 0; var1 < this.field1790; var1++) {
            this.field1786[var1] = -this.field1786[var1];
            this.field1788[var1] = -this.field1788[var1];
        }
        this.field1808 = 0;
    }

    @ObfuscatedName("dt.s()V")
    public void method2171() {
        for (int var1 = 0; var1 < this.field1790; var1++) {
            int var2 = this.field1788[var1];
            this.field1788[var1] = this.field1786[var1];
            this.field1786[var1] = -var2;
        }
        this.field1808 = 0;
    }

    @ObfuscatedName("dt.x(I)V")
    public void method2225(int arg0) {
        int var2 = field1804[arg0];
        int var3 = field1842[arg0];
        for (int var4 = 0; var4 < this.field1790; var4++) {
            int var5 = this.field1787[var4] * var3 - this.field1788[var4] * var2 >> 16;
            this.field1788[var4] = this.field1788[var4] * var3 + this.field1787[var4] * var2 >> 16;
            this.field1787[var4] = var5;
        }
        this.field1808 = 0;
    }

    @ObfuscatedName("dt.z(III)V")
    public void method2191(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1790; var4++) {
            this.field1786[var4] += arg0;
            this.field1787[var4] += arg1;
            this.field1788[var4] += arg2;
        }
        this.field1808 = 0;
    }

    @ObfuscatedName("dt.d(III)V")
    public void method2174(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1790; var4++) {
            this.field1786[var4] = this.field1786[var4] * arg0 / 128;
            this.field1787[var4] = this.field1787[var4] * arg1 / 128;
            this.field1788[var4] = this.field1788[var4] * arg2 / 128;
        }
        this.field1808 = 0;
    }

    @ObfuscatedName("dt.a(IIIIIII)V")
    public final void method2175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1841[0] = -1;
        if (this.field1808 != 2 && this.field1808 != 1) {
            this.method2165();
        }
        int var8 = Statics.field1568;
        int var9 = Statics.field1563;
        int var10 = field1804[arg0];
        int var11 = field1842[arg0];
        int var12 = field1804[arg1];
        int var13 = field1842[arg1];
        int var14 = field1804[arg2];
        int var15 = field1842[arg2];
        int var16 = field1804[arg3];
        int var17 = field1842[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1790; var19++) {
            int var20 = this.field1786[var19];
            int var21 = this.field1787[var19];
            int var22 = this.field1788[var19];
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
            field1818[var19] = var30 - var18;
            field1816[var19] = class91.field1574 * var26 / var30 + var8;
            field1817[var19] = class91.field1574 * var29 / var30 + var9;
            if (this.field1801 > 0) {
                field1819[var19] = var26;
                field1807[var19] = var29;
                field1821[var19] = var30;
            }
        }
        try {
            this.method2190(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dt.t(IIIIIIII)V")
    public final void method2176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1841[0] = -1;
        if (this.field1808 != 2 && this.field1808 != 1) {
            this.method2165();
        }
        int var9 = Statics.field1568;
        int var10 = Statics.field1563;
        int var11 = field1804[arg0];
        int var12 = field1842[arg0];
        int var13 = field1804[arg1];
        int var14 = field1842[arg1];
        int var15 = field1804[arg2];
        int var16 = field1842[arg2];
        int var17 = field1804[arg3];
        int var18 = field1842[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1790; var20++) {
            int var21 = this.field1786[var20];
            int var22 = this.field1787[var20];
            int var23 = this.field1788[var20];
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
            field1818[var20] = var31 - var19;
            field1816[var20] = class91.field1574 * var27 / arg7 + var9;
            field1817[var20] = class91.field1574 * var30 / arg7 + var10;
            if (this.field1801 > 0) {
                field1819[var20] = var27;
                field1807[var20] = var30;
                field1821[var20] = var31;
            }
        }
        try {
            this.method2190(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dt.ap(IIIIIIIII)V")
    public void method1779(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1841[0] = -1;
        if (this.field1808 != 1) {
            this.method2164();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1827 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1827) * class91.field1574;
        if (var15 / var13 >= Statics.field1569) {
            return;
        }
        int var16 = (this.field1827 + var14) * class91.field1574;
        if (var16 / var13 <= Statics.field1555) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1827 * arg1 >> 16;
        int var19 = (var17 + var18) * class91.field1574;
        if (var19 / var13 <= Statics.field1554) {
            return;
        }
        int var20 = (this.field1437 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class91.field1574;
        if (var21 / var13 >= Statics.field1571) {
            return;
        }
        int var22 = (this.field1437 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1801 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1836) {
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
            int var32 = field1781 - Statics.field1568;
            int var33 = field1820 - Statics.field1563;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1815) {
                    field1828[field1839++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1568;
        int var35 = Statics.field1563;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1804[arg0];
            var37 = field1842[arg0];
        }
        for (int var38 = 0; var38 < this.field1790; var38++) {
            int var39 = this.field1786[var38];
            int var40 = this.field1787[var38];
            int var41 = this.field1788[var38];
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
            field1818[var38] = var50 - var11;
            if (var50 >= 50) {
                field1816[var38] = class91.field1574 * var46 / var50 + var34;
                field1817[var38] = class91.field1574 * var49 / var50 + var35;
            } else {
                field1816[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1819[var38] = var46;
                field1807[var38] = var49;
                field1821[var38] = var50;
            }
        }
        try {
            this.method2190(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dt.k(ZZI)V")
    public final void method2190(boolean arg0, boolean arg1, int arg2) {
        if (this.field1811 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1811; var4++) {
            field1841[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1832; var5++) {
            if (this.field1795[var5] != -2) {
                int var6 = this.field1846[var5];
                int var7 = this.field1791[var5];
                int var8 = this.field1792[var5];
                int var9 = field1816[var6];
                int var10 = field1816[var7];
                int var11 = field1816[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1819[var6];
                    int var13 = field1819[var7];
                    int var14 = field1819[var8];
                    int var15 = field1807[var6];
                    int var16 = field1807[var7];
                    int var17 = field1807[var8];
                    int var18 = field1821[var6];
                    int var19 = field1821[var7];
                    int var20 = field1821[var8];
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
                        field1840[var5] = true;
                        int var30 = (field1818[var6] + field1818[var7] + field1818[var8]) / 3 + this.field1812;
                        field1824[var30][field1841[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2180(field1781, field1820, field1817[var6], field1817[var7], field1817[var8], var9, var10, var11)) {
                        field1828[field1839++] = arg2;
                        arg1 = false;
                    }
                    if ((field1817[var8] - field1817[var7]) * (var9 - var10) - (field1817[var6] - field1817[var7]) * (var11 - var10) > 0) {
                        field1840[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1566 && var10 <= Statics.field1566 && var11 <= Statics.field1566) {
                            field1814[var5] = false;
                        } else {
                            field1814[var5] = true;
                        }
                        int var31 = (field1818[var6] + field1818[var7] + field1818[var8]) / 3 + this.field1812;
                        field1824[var31][field1841[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1796 == null) {
            for (int var32 = this.field1811 - 1; var32 >= 0; var32--) {
                int var33 = field1841[var32];
                if (var33 > 0) {
                    int[] var34 = field1824[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2178(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1825[var36] = 0;
            field1829[var36] = 0;
        }
        for (int var37 = this.field1811 - 1; var37 >= 0; var37--) {
            int var38 = field1841[var37];
            if (var38 > 0) {
                int[] var39 = field1824[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1796[var41];
                    int var43 = field1825[var42]++;
                    field1809[var42][var43] = var41;
                    if (var42 < 10) {
                        field1829[var42] += var37;
                    } else if (var42 == 10) {
                        field1805[var43] = var37;
                    } else {
                        field1837[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1825[1] > 0 || field1825[2] > 0) {
            var44 = (field1829[1] + field1829[2]) / (field1825[1] + field1825[2]);
        }
        int var45 = 0;
        if (field1825[3] > 0 || field1825[4] > 0) {
            var45 = (field1829[3] + field1829[4]) / (field1825[3] + field1825[4]);
        }
        int var46 = 0;
        if (field1825[6] > 0 || field1825[8] > 0) {
            var46 = (field1829[6] + field1829[8]) / (field1825[6] + field1825[8]);
        }
        int var47 = 0;
        int var48 = field1825[10];
        int[] var49 = field1809[10];
        int[] var50 = field1805;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1825[11];
            var49 = field1809[11];
            var50 = field1837;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2178(var49[var47++]);
                if (var47 == var48 && field1809[11] != var49) {
                    var47 = 0;
                    var48 = field1825[11];
                    var49 = field1809[11];
                    var50 = field1837;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2178(var49[var47++]);
                if (var47 == var48 && field1809[11] != var49) {
                    var47 = 0;
                    var48 = field1825[11];
                    var49 = field1809[11];
                    var50 = field1837;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2178(var49[var47++]);
                if (var47 == var48 && field1809[11] != var49) {
                    var47 = 0;
                    var48 = field1825[11];
                    var49 = field1809[11];
                    var50 = field1837;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1825[var52];
            int[] var54 = field1809[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2178(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2178(var49[var47++]);
            if (var47 == var48 && field1809[11] != var49) {
                var47 = 0;
                var49 = field1809[11];
                var48 = field1825[11];
                var50 = field1837;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dt.f(I)V")
    public final void method2178(int arg0) {
        if (field1840[arg0]) {
            this.method2198(arg0);
            return;
        }
        int var2 = this.field1846[arg0];
        int var3 = this.field1791[arg0];
        int var4 = this.field1792[arg0];
        class91.field1578 = field1814[arg0];
        if (this.field1797 == null) {
            class91.field1565 = 0;
        } else {
            class91.field1565 = this.field1797[arg0] & 0xFF;
        }
        if (this.field1799 != null && this.field1799[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1798 == null || this.field1798[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1798[arg0] & 0xFF;
                var6 = this.field1802[var5];
                var7 = this.field1803[var5];
                var8 = this.field1826[var5];
            }
            if (this.field1795[arg0] == -1) {
                class91.method1989(field1817[var2], field1817[var3], field1817[var4], field1816[var2], field1816[var3], field1816[var4], this.field1793[arg0], this.field1793[arg0], this.field1793[arg0], field1819[var6], field1819[var7], field1819[var8], field1807[var6], field1807[var7], field1807[var8], field1821[var6], field1821[var7], field1821[var8], this.field1799[arg0]);
            } else {
                class91.method1989(field1817[var2], field1817[var3], field1817[var4], field1816[var2], field1816[var3], field1816[var4], this.field1793[arg0], this.field1794[arg0], this.field1795[arg0], field1819[var6], field1819[var7], field1819[var8], field1807[var6], field1807[var7], field1807[var8], field1821[var6], field1821[var7], field1821[var8], this.field1799[arg0]);
            }
        } else if (this.field1795[arg0] == -1) {
            class91.method1978(field1817[var2], field1817[var3], field1817[var4], field1816[var2], field1816[var3], field1816[var4], field1843[this.field1793[arg0]]);
        } else {
            class91.method1976(field1817[var2], field1817[var3], field1817[var4], field1816[var2], field1816[var3], field1816[var4], this.field1793[arg0], this.field1794[arg0], this.field1795[arg0]);
        }
    }

    @ObfuscatedName("dt.g(I)V")
    public final void method2198(int arg0) {
        int var2 = Statics.field1568;
        int var3 = Statics.field1563;
        int var4 = 0;
        int var5 = this.field1846[arg0];
        int var6 = this.field1791[arg0];
        int var7 = this.field1792[arg0];
        int var8 = field1821[var5];
        int var9 = field1821[var6];
        int var10 = field1821[var7];
        if (this.field1797 == null) {
            class91.field1565 = 0;
        } else {
            class91.field1565 = this.field1797[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1785[var4] = field1816[var5];
            field1782[var4] = field1817[var5];
            field1789[var4++] = this.field1793[arg0];
        } else {
            int var11 = field1819[var5];
            int var12 = field1807[var5];
            int var13 = this.field1793[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1844[var10 - var8];
                field1785[var4] = (((field1819[var7] - var11) * var14 >> 16) + var11) * class91.field1574 / 50 + var2;
                field1782[var4] = (((field1807[var7] - var12) * var14 >> 16) + var12) * class91.field1574 / 50 + var3;
                field1789[var4++] = ((this.field1795[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1844[var9 - var8];
                field1785[var4] = (((field1819[var6] - var11) * var15 >> 16) + var11) * class91.field1574 / 50 + var2;
                field1782[var4] = (((field1807[var6] - var12) * var15 >> 16) + var12) * class91.field1574 / 50 + var3;
                field1789[var4++] = ((this.field1794[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1785[var4] = field1816[var6];
            field1782[var4] = field1817[var6];
            field1789[var4++] = this.field1794[arg0];
        } else {
            int var16 = field1819[var6];
            int var17 = field1807[var6];
            int var18 = this.field1794[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1844[var8 - var9];
                field1785[var4] = (((field1819[var5] - var16) * var19 >> 16) + var16) * class91.field1574 / 50 + var2;
                field1782[var4] = (((field1807[var5] - var17) * var19 >> 16) + var17) * class91.field1574 / 50 + var3;
                field1789[var4++] = ((this.field1793[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1844[var10 - var9];
                field1785[var4] = (((field1819[var7] - var16) * var20 >> 16) + var16) * class91.field1574 / 50 + var2;
                field1782[var4] = (((field1807[var7] - var17) * var20 >> 16) + var17) * class91.field1574 / 50 + var3;
                field1789[var4++] = ((this.field1795[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1785[var4] = field1816[var7];
            field1782[var4] = field1817[var7];
            field1789[var4++] = this.field1795[arg0];
        } else {
            int var21 = field1819[var7];
            int var22 = field1807[var7];
            int var23 = this.field1795[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1844[var9 - var10];
                field1785[var4] = (((field1819[var6] - var21) * var24 >> 16) + var21) * class91.field1574 / 50 + var2;
                field1782[var4] = (((field1807[var6] - var22) * var24 >> 16) + var22) * class91.field1574 / 50 + var3;
                field1789[var4++] = ((this.field1794[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1844[var8 - var10];
                field1785[var4] = (((field1819[var5] - var21) * var25 >> 16) + var21) * class91.field1574 / 50 + var2;
                field1782[var4] = (((field1807[var5] - var22) * var25 >> 16) + var22) * class91.field1574 / 50 + var3;
                field1789[var4++] = ((this.field1793[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1785[0];
        int var27 = field1785[1];
        int var28 = field1785[2];
        int var29 = field1782[0];
        int var30 = field1782[1];
        int var31 = field1782[2];
        class91.field1578 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1566 || var27 > Statics.field1566 || var28 > Statics.field1566) {
                class91.field1578 = true;
            }
            if (this.field1799 != null && this.field1799[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1798 == null || this.field1798[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1798[arg0] & 0xFF;
                    var33 = this.field1802[var32];
                    var34 = this.field1803[var32];
                    var35 = this.field1826[var32];
                }
                if (this.field1795[arg0] == -1) {
                    class91.method1989(var29, var30, var31, var26, var27, var28, this.field1793[arg0], this.field1793[arg0], this.field1793[arg0], field1819[var33], field1819[var34], field1819[var35], field1807[var33], field1807[var34], field1807[var35], field1821[var33], field1821[var34], field1821[var35], this.field1799[arg0]);
                } else {
                    class91.method1989(var29, var30, var31, var26, var27, var28, field1789[0], field1789[1], field1789[2], field1819[var33], field1819[var34], field1819[var35], field1807[var33], field1807[var34], field1807[var35], field1821[var33], field1821[var34], field1821[var35], this.field1799[arg0]);
                }
            } else if (this.field1795[arg0] == -1) {
                class91.method1978(var29, var30, var31, var26, var27, var28, field1843[this.field1793[arg0]]);
            } else {
                class91.method1976(var29, var30, var31, var26, var27, var28, field1789[0], field1789[1], field1789[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1566 || var27 > Statics.field1566 || var28 > Statics.field1566 || field1785[3] < 0 || field1785[3] > Statics.field1566) {
            class91.field1578 = true;
        }
        if (this.field1799 != null && this.field1799[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1798 == null || this.field1798[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1798[arg0] & 0xFF;
                var37 = this.field1802[var36];
                var38 = this.field1803[var36];
                var39 = this.field1826[var36];
            }
            short var40 = this.field1799[arg0];
            if (this.field1795[arg0] == -1) {
                class91.method1989(var29, var30, var31, var26, var27, var28, this.field1793[arg0], this.field1793[arg0], this.field1793[arg0], field1819[var37], field1819[var38], field1819[var39], field1807[var37], field1807[var38], field1807[var39], field1821[var37], field1821[var38], field1821[var39], var40);
                class91.method1989(var29, var31, field1782[3], var26, var28, field1785[3], this.field1793[arg0], this.field1793[arg0], this.field1793[arg0], field1819[var37], field1819[var38], field1819[var39], field1807[var37], field1807[var38], field1807[var39], field1821[var37], field1821[var38], field1821[var39], var40);
            } else {
                class91.method1989(var29, var30, var31, var26, var27, var28, field1789[0], field1789[1], field1789[2], field1819[var37], field1819[var38], field1819[var39], field1807[var37], field1807[var38], field1807[var39], field1821[var37], field1821[var38], field1821[var39], var40);
                class91.method1989(var29, var31, field1782[3], var26, var28, field1785[3], field1789[0], field1789[2], field1789[3], field1819[var37], field1819[var38], field1819[var39], field1807[var37], field1807[var38], field1807[var39], field1821[var37], field1821[var38], field1821[var39], var40);
            }
        } else if (this.field1795[arg0] == -1) {
            int var41 = field1843[this.field1793[arg0]];
            class91.method1978(var29, var30, var31, var26, var27, var28, var41);
            class91.method1978(var29, var31, field1782[3], var26, var28, field1785[3], var41);
        } else {
            class91.method1976(var29, var30, var31, var26, var27, var28, field1789[0], field1789[1], field1789[2]);
            class91.method1976(var29, var31, field1782[3], var26, var28, field1785[3], field1789[0], field1789[2], field1789[3]);
        }
    }

    @ObfuscatedName("dt.i(IIIIIIII)Z")
    public final boolean method2180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
