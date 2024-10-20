package deob;

@ObfuscatedName("dm")
public class class105 extends class85 {

    @ObfuscatedName("dm.o")
    public static class105 field1828 = new class105();

    @ObfuscatedName("dm.f")
    public static byte[] field1790 = new byte[1];

    @ObfuscatedName("dm.i")
    public static class105 field1839 = new class105();

    @ObfuscatedName("dm.h")
    public static byte[] field1796 = new byte[1];

    @ObfuscatedName("dm.q")
    public int field1793 = 0;

    @ObfuscatedName("dm.u")
    public int[] field1842;

    @ObfuscatedName("dm.m")
    public int[] field1801;

    @ObfuscatedName("dm.y")
    public int[] field1792;

    @ObfuscatedName("dm.p")
    public int field1797 = 0;

    @ObfuscatedName("dm.t")
    public int[] field1822;

    @ObfuscatedName("dm.g")
    public int[] field1799;

    @ObfuscatedName("dm.v")
    public int[] field1810;

    @ObfuscatedName("dm.l")
    public int[] field1802;

    @ObfuscatedName("dm.e")
    public int[] field1794;

    @ObfuscatedName("dm.a")
    public int[] field1811;

    @ObfuscatedName("dm.w")
    public byte[] field1804;

    @ObfuscatedName("dm.d")
    public byte[] field1843;

    @ObfuscatedName("dm.z")
    public byte[] field1806;

    @ObfuscatedName("dm.s")
    public short[] field1819;

    @ObfuscatedName("dm.j")
    public byte field1808 = 0;

    @ObfuscatedName("dm.b")
    public int field1809 = 0;

    @ObfuscatedName("dm.r")
    public int[] field1798;

    @ObfuscatedName("dm.n")
    public int[] field1812;

    @ObfuscatedName("dm.c")
    public int[] field1846;

    @ObfuscatedName("dm.k")
    public int[][] field1813;

    @ObfuscatedName("dm.x")
    public int[][] field1814;

    @ObfuscatedName("dm.ar")
    public boolean field1815 = false;

    @ObfuscatedName("dm.as")
    public int field1816;

    @ObfuscatedName("dm.ac")
    public int field1817;

    @ObfuscatedName("dm.ah")
    public int field1818;

    @ObfuscatedName("dm.al")
    public int field1803;

    @ObfuscatedName("dm.am")
    public int field1791;

    @ObfuscatedName("dm.ai")
    public static boolean[] field1830 = new boolean[4096];

    @ObfuscatedName("dm.aa")
    public static boolean[] field1823 = new boolean[4096];

    @ObfuscatedName("dm.ag")
    public static int[] field1807 = new int[4096];

    @ObfuscatedName("dm.an")
    public static int[] field1825 = new int[4096];

    @ObfuscatedName("dm.ap")
    public static int[] field1826 = new int[4096];

    @ObfuscatedName("dm.ay")
    public static int[] field1827 = new int[4096];

    @ObfuscatedName("dm.ax")
    public static int[] field1844 = new int[4096];

    @ObfuscatedName("dm.af")
    public static int[] field1829 = new int[4096];

    @ObfuscatedName("dm.au")
    public static int[] field1795 = new int[1600];

    @ObfuscatedName("dm.ad")
    public static int[][] field1832 = new int[1600][512];

    @ObfuscatedName("dm.ab")
    public static int[] field1833 = new int[12];

    @ObfuscatedName("dm.ao")
    public static int[][] field1834 = new int[12][2000];

    @ObfuscatedName("dm.az")
    public static int[] field1835 = new int[2000];

    @ObfuscatedName("dm.aj")
    public static int[] field1836 = new int[2000];

    @ObfuscatedName("dm.ak")
    public static int[] field1837 = new int[12];

    @ObfuscatedName("dm.aw")
    public static int[] field1838 = new int[10];

    @ObfuscatedName("dm.at")
    public static int[] field1831 = new int[10];

    @ObfuscatedName("dm.aq")
    public static int[] field1840 = new int[10];

    @ObfuscatedName("dm.bj")
    public static boolean field1820 = false;

    @ObfuscatedName("dm.bp")
    public static int field1845 = 0;

    @ObfuscatedName("dm.bh")
    public static int field1800 = 0;

    @ObfuscatedName("dm.bz")
    public static int field1847 = 0;

    @ObfuscatedName("dm.bw")
    public static int[] field1848 = new int[1000];

    @ObfuscatedName("dm.bm")
    public static int[] field1849 = class91.field1579;

    @ObfuscatedName("dm.bn")
    public static int[] field1850 = class91.field1580;

    @ObfuscatedName("dm.bt")
    public static int[] field1851 = class91.field1566;

    @ObfuscatedName("dm.ba")
    public static int[] field1852 = class91.field1556;

    public class105() {
    }

    public class105(class105[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1793 = 0;
        this.field1797 = 0;
        this.field1809 = 0;
        this.field1808 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class105 var8 = arg0[var7];
            if (var8 != null) {
                this.field1793 += var8.field1793;
                this.field1797 += var8.field1797;
                this.field1809 += var8.field1809;
                if (var8.field1804 == null) {
                    if (this.field1808 == -1) {
                        this.field1808 = var8.field1808;
                    }
                    if (this.field1808 != var8.field1808) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1843 != null;
                var5 |= var8.field1819 != null;
                var6 |= var8.field1806 != null;
            }
        }
        this.field1842 = new int[this.field1793];
        this.field1801 = new int[this.field1793];
        this.field1792 = new int[this.field1793];
        this.field1822 = new int[this.field1797];
        this.field1799 = new int[this.field1797];
        this.field1810 = new int[this.field1797];
        this.field1802 = new int[this.field1797];
        this.field1794 = new int[this.field1797];
        this.field1811 = new int[this.field1797];
        if (var3) {
            this.field1804 = new byte[this.field1797];
        }
        if (var4) {
            this.field1843 = new byte[this.field1797];
        }
        if (var5) {
            this.field1819 = new short[this.field1797];
        }
        if (var6) {
            this.field1806 = new byte[this.field1797];
        }
        if (this.field1809 > 0) {
            this.field1798 = new int[this.field1809];
            this.field1812 = new int[this.field1809];
            this.field1846 = new int[this.field1809];
        }
        this.field1793 = 0;
        this.field1797 = 0;
        this.field1809 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class105 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1797; var11++) {
                    this.field1822[this.field1797] = var10.field1822[var11] + this.field1793;
                    this.field1799[this.field1797] = var10.field1799[var11] + this.field1793;
                    this.field1810[this.field1797] = var10.field1810[var11] + this.field1793;
                    this.field1802[this.field1797] = var10.field1802[var11];
                    this.field1794[this.field1797] = var10.field1794[var11];
                    this.field1811[this.field1797] = var10.field1811[var11];
                    if (var3) {
                        if (var10.field1804 == null) {
                            this.field1804[this.field1797] = var10.field1808;
                        } else {
                            this.field1804[this.field1797] = var10.field1804[var11];
                        }
                    }
                    if (var4 && var10.field1843 != null) {
                        this.field1843[this.field1797] = var10.field1843[var11];
                    }
                    if (var5) {
                        if (var10.field1819 == null) {
                            this.field1819[this.field1797] = -1;
                        } else {
                            this.field1819[this.field1797] = var10.field1819[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1806 == null || var10.field1806[var11] == -1) {
                            this.field1806[this.field1797] = -1;
                        } else {
                            this.field1806[this.field1797] = (byte) (var10.field1806[var11] + this.field1809);
                        }
                    }
                    this.field1797++;
                }
                for (int var12 = 0; var12 < var10.field1809; var12++) {
                    this.field1798[this.field1809] = var10.field1798[var12] + this.field1793;
                    this.field1812[this.field1809] = var10.field1812[var12] + this.field1793;
                    this.field1846[this.field1809] = var10.field1846[var12] + this.field1793;
                    this.field1809++;
                }
                for (int var13 = 0; var13 < var10.field1793; var13++) {
                    this.field1842[this.field1793] = var10.field1842[var13];
                    this.field1801[this.field1793] = var10.field1801[var13];
                    this.field1792[this.field1793] = var10.field1792[var13];
                    this.field1793++;
                }
            }
        }
    }

    @ObfuscatedName("dm.o([[IIIIZI)Ldm;")
    public class105 method2089(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2093();
        int var7 = arg1 - this.field1818;
        int var8 = this.field1818 + arg1;
        int var9 = arg3 - this.field1818;
        int var10 = this.field1818 + arg3;
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
            var15.field1793 = this.field1793;
            var15.field1797 = this.field1797;
            var15.field1809 = this.field1809;
            var15.field1842 = this.field1842;
            var15.field1792 = this.field1792;
            var15.field1822 = this.field1822;
            var15.field1799 = this.field1799;
            var15.field1810 = this.field1810;
            var15.field1802 = this.field1802;
            var15.field1794 = this.field1794;
            var15.field1811 = this.field1811;
            var15.field1804 = this.field1804;
            var15.field1843 = this.field1843;
            var15.field1806 = this.field1806;
            var15.field1819 = this.field1819;
            var15.field1808 = this.field1808;
            var15.field1798 = this.field1798;
            var15.field1812 = this.field1812;
            var15.field1846 = this.field1846;
            var15.field1813 = this.field1813;
            var15.field1814 = this.field1814;
            var15.field1815 = this.field1815;
            var15.field1801 = new int[var15.field1793];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1793; var16++) {
                int var17 = this.field1842[var16] + arg1;
                int var18 = this.field1792[var16] + arg3;
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
            for (int var26 = 0; var26 < var15.field1793; var26++) {
                int var27 = (-this.field1801[var26] << 16) / this.field1441;
                if (var27 < arg5) {
                    int var28 = this.field1842[var26] + arg1;
                    int var29 = this.field1792[var26] + arg3;
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
        var15.field1816 = 0;
        return var15;
    }

    @ObfuscatedName("dm.f(Z)Ldm;")
    public class105 method2090(boolean arg0) {
        if (!arg0 && field1790.length < this.field1797) {
            field1790 = new byte[this.field1797 + 100];
        }
        return this.method2112(arg0, field1828, field1790);
    }

    @ObfuscatedName("dm.h(Z)Ldm;")
    public class105 method2091(boolean arg0) {
        if (!arg0 && field1796.length < this.field1797) {
            field1796 = new byte[this.field1797 + 100];
        }
        return this.method2112(arg0, field1839, field1796);
    }

    @ObfuscatedName("dm.q(ZLdm;[B)Ldm;")
    public class105 method2112(boolean arg0, class105 arg1, byte[] arg2) {
        arg1.field1793 = this.field1793;
        arg1.field1797 = this.field1797;
        arg1.field1809 = this.field1809;
        if (arg1.field1842 == null || arg1.field1842.length < this.field1793) {
            arg1.field1842 = new int[this.field1793 + 100];
            arg1.field1801 = new int[this.field1793 + 100];
            arg1.field1792 = new int[this.field1793 + 100];
        }
        for (int var4 = 0; var4 < this.field1793; var4++) {
            arg1.field1842[var4] = this.field1842[var4];
            arg1.field1801[var4] = this.field1801[var4];
            arg1.field1792[var4] = this.field1792[var4];
        }
        if (arg0) {
            arg1.field1843 = this.field1843;
        } else {
            arg1.field1843 = arg2;
            if (this.field1843 == null) {
                for (int var5 = 0; var5 < this.field1797; var5++) {
                    arg1.field1843[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1797; var6++) {
                    arg1.field1843[var6] = this.field1843[var6];
                }
            }
        }
        arg1.field1822 = this.field1822;
        arg1.field1799 = this.field1799;
        arg1.field1810 = this.field1810;
        arg1.field1802 = this.field1802;
        arg1.field1794 = this.field1794;
        arg1.field1811 = this.field1811;
        arg1.field1804 = this.field1804;
        arg1.field1806 = this.field1806;
        arg1.field1819 = this.field1819;
        arg1.field1808 = this.field1808;
        arg1.field1798 = this.field1798;
        arg1.field1812 = this.field1812;
        arg1.field1846 = this.field1846;
        arg1.field1813 = this.field1813;
        arg1.field1814 = this.field1814;
        arg1.field1815 = this.field1815;
        arg1.field1816 = 0;
        return arg1;
    }

    @ObfuscatedName("dm.u()V")
    public void method2093() {
        if (this.field1816 == 1) {
            return;
        }
        this.field1816 = 1;
        this.field1441 = 0;
        this.field1817 = 0;
        this.field1818 = 0;
        for (int var1 = 0; var1 < this.field1793; var1++) {
            int var2 = this.field1842[var1];
            int var3 = this.field1801[var1];
            int var4 = this.field1792[var1];
            if (-var3 > this.field1441) {
                this.field1441 = -var3;
            }
            if (var3 > this.field1817) {
                this.field1817 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1818) {
                this.field1818 = var5;
            }
        }
        this.field1818 = (int) (Math.sqrt((double) this.field1818) + 0.99D);
        this.field1791 = (int) (Math.sqrt((double) (this.field1441 * this.field1441 + this.field1818 * this.field1818)) + 0.99D);
        this.field1803 = this.field1791 + (int) (Math.sqrt((double) (this.field1818 * this.field1818 + this.field1817 * this.field1817)) + 0.99D);
    }

    @ObfuscatedName("dm.m()V")
    public void method2128() {
        if (this.field1816 == 2) {
            return;
        }
        this.field1816 = 2;
        this.field1818 = 0;
        for (int var1 = 0; var1 < this.field1793; var1++) {
            int var2 = this.field1842[var1];
            int var3 = this.field1801[var1];
            int var4 = this.field1792[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1818) {
                this.field1818 = var5;
            }
        }
        this.field1818 = (int) (Math.sqrt((double) this.field1818) + 0.99D);
        this.field1791 = this.field1818;
        this.field1803 = this.field1818 + this.field1818;
    }

    @ObfuscatedName("dm.y()I")
    public int method2095() {
        this.method2093();
        return this.field1818;
    }

    @ObfuscatedName("dm.p(Lcx;I)V")
    public void method2096(class103 arg0, int arg1) {
        if (this.field1813 == null || arg1 == -1) {
            return;
        }
        class88 var3 = arg0.field1767[arg1];
        class102 var4 = var3.field1526;
        Statics.field1841 = 0;
        Statics.field1824 = 0;
        Statics.field1805 = 0;
        for (int var5 = 0; var5 < var3.field1527; var5++) {
            int var6 = var3.field1522[var5];
            this.method2098(var4.field1761[var6], var4.field1759[var6], var3.field1529[var5], var3.field1523[var5], var3.field1531[var5]);
        }
        this.field1816 = 0;
    }

    @ObfuscatedName("dm.t(Lcx;ILcx;I[I)V")
    public void method2156(class103 arg0, int arg1, class103 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2096(arg0, arg1);
            return;
        }
        class88 var6 = arg0.field1767[arg1];
        class88 var7 = arg2.field1767[arg3];
        class102 var8 = var6.field1526;
        Statics.field1841 = 0;
        Statics.field1824 = 0;
        Statics.field1805 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1527; var11++) {
            int var12 = var6.field1522[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1761[var12] == 0) {
                this.method2098(var8.field1761[var12], var8.field1759[var12], var6.field1529[var11], var6.field1523[var11], var6.field1531[var11]);
            }
        }
        Statics.field1841 = 0;
        Statics.field1824 = 0;
        Statics.field1805 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1527; var15++) {
            int var16 = var7.field1522[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1761[var16] == 0) {
                this.method2098(var8.field1761[var16], var8.field1759[var16], var7.field1529[var15], var7.field1523[var15], var7.field1531[var15]);
            }
        }
        this.field1816 = 0;
    }

    @ObfuscatedName("dm.e(I[IIII)V")
    public void method2098(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1841 = 0;
            Statics.field1824 = 0;
            Statics.field1805 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1813.length) {
                    int[] var10 = this.field1813[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1841 += this.field1842[var12];
                        Statics.field1824 += this.field1801[var12];
                        Statics.field1805 += this.field1792[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1841 = Statics.field1841 / var7 + arg2;
                Statics.field1824 = Statics.field1824 / var7 + arg3;
                Statics.field1805 = Statics.field1805 / var7 + arg4;
            } else {
                Statics.field1841 = arg2;
                Statics.field1824 = arg3;
                Statics.field1805 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1813.length) {
                    int[] var15 = this.field1813[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1842[var17] += arg2;
                        this.field1801[var17] += arg3;
                        this.field1792[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1813.length) {
                    int[] var20 = this.field1813[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1842[var22] -= Statics.field1841;
                        this.field1801[var22] -= Statics.field1824;
                        this.field1792[var22] -= Statics.field1805;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1849[var25];
                            int var27 = field1850[var25];
                            int var28 = this.field1842[var22] * var27 + this.field1801[var22] * var26 >> 16;
                            this.field1801[var22] = this.field1801[var22] * var27 - this.field1842[var22] * var26 >> 16;
                            this.field1842[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1849[var23];
                            int var30 = field1850[var23];
                            int var31 = this.field1801[var22] * var30 - this.field1792[var22] * var29 >> 16;
                            this.field1792[var22] = this.field1801[var22] * var29 + this.field1792[var22] * var30 >> 16;
                            this.field1801[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1849[var24];
                            int var33 = field1850[var24];
                            int var34 = this.field1842[var22] * var33 + this.field1792[var22] * var32 >> 16;
                            this.field1792[var22] = this.field1792[var22] * var33 - this.field1842[var22] * var32 >> 16;
                            this.field1842[var22] = var34;
                        }
                        this.field1842[var22] += Statics.field1841;
                        this.field1801[var22] += Statics.field1824;
                        this.field1792[var22] += Statics.field1805;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1813.length) {
                    int[] var37 = this.field1813[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1842[var39] -= Statics.field1841;
                        this.field1801[var39] -= Statics.field1824;
                        this.field1792[var39] -= Statics.field1805;
                        this.field1842[var39] = this.field1842[var39] * arg2 / 128;
                        this.field1801[var39] = this.field1801[var39] * arg3 / 128;
                        this.field1792[var39] = this.field1792[var39] * arg4 / 128;
                        this.field1842[var39] += Statics.field1841;
                        this.field1801[var39] += Statics.field1824;
                        this.field1792[var39] += Statics.field1805;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1814 != null && this.field1843 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1814.length) {
                    int[] var42 = this.field1814[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1843[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1843[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dm.a()V")
    public void method2099() {
        for (int var1 = 0; var1 < this.field1793; var1++) {
            int var2 = this.field1842[var1];
            this.field1842[var1] = this.field1792[var1];
            this.field1792[var1] = -var2;
        }
        this.field1816 = 0;
    }

    @ObfuscatedName("dm.w()V")
    public void method2100() {
        for (int var1 = 0; var1 < this.field1793; var1++) {
            this.field1842[var1] = -this.field1842[var1];
            this.field1792[var1] = -this.field1792[var1];
        }
        this.field1816 = 0;
    }

    @ObfuscatedName("dm.d()V")
    public void method2159() {
        for (int var1 = 0; var1 < this.field1793; var1++) {
            int var2 = this.field1792[var1];
            this.field1792[var1] = this.field1842[var1];
            this.field1842[var1] = -var2;
        }
        this.field1816 = 0;
    }

    @ObfuscatedName("dm.z(I)V")
    public void method2092(int arg0) {
        int var2 = field1849[arg0];
        int var3 = field1850[arg0];
        for (int var4 = 0; var4 < this.field1793; var4++) {
            int var5 = this.field1801[var4] * var3 - this.field1792[var4] * var2 >> 16;
            this.field1792[var4] = this.field1801[var4] * var2 + this.field1792[var4] * var3 >> 16;
            this.field1801[var4] = var5;
        }
        this.field1816 = 0;
    }

    @ObfuscatedName("dm.s(III)V")
    public void method2102(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1793; var4++) {
            this.field1842[var4] += arg0;
            this.field1801[var4] += arg1;
            this.field1792[var4] += arg2;
        }
        this.field1816 = 0;
    }

    @ObfuscatedName("dm.j(III)V")
    public void method2161(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1793; var4++) {
            this.field1842[var4] = this.field1842[var4] * arg0 / 128;
            this.field1801[var4] = this.field1801[var4] * arg1 / 128;
            this.field1792[var4] = this.field1792[var4] * arg2 / 128;
        }
        this.field1816 = 0;
    }

    @ObfuscatedName("dm.b(IIIIIII)V")
    public final void method2103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1795[0] = -1;
        if (this.field1816 != 2 && this.field1816 != 1) {
            this.method2128();
        }
        int var8 = Statics.field1571;
        int var9 = Statics.field1567;
        int var10 = field1849[arg0];
        int var11 = field1850[arg0];
        int var12 = field1849[arg1];
        int var13 = field1850[arg1];
        int var14 = field1849[arg2];
        int var15 = field1850[arg2];
        int var16 = field1849[arg3];
        int var17 = field1850[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1793; var19++) {
            int var20 = this.field1842[var19];
            int var21 = this.field1801[var19];
            int var22 = this.field1792[var19];
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
            field1826[var19] = var30 - var18;
            field1807[var19] = class91.field1565 * var26 / var30 + var8;
            field1825[var19] = class91.field1565 * var29 / var30 + var9;
            if (this.field1809 > 0) {
                field1827[var19] = var26;
                field1844[var19] = var29;
                field1829[var19] = var30;
            }
        }
        try {
            this.method2105(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dm.r(IIIIIIII)V")
    public final void method2104(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1795[0] = -1;
        if (this.field1816 != 2 && this.field1816 != 1) {
            this.method2128();
        }
        int var9 = Statics.field1571;
        int var10 = Statics.field1567;
        int var11 = field1849[arg0];
        int var12 = field1850[arg0];
        int var13 = field1849[arg1];
        int var14 = field1850[arg1];
        int var15 = field1849[arg2];
        int var16 = field1850[arg2];
        int var17 = field1849[arg3];
        int var18 = field1850[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1793; var20++) {
            int var21 = this.field1842[var20];
            int var22 = this.field1801[var20];
            int var23 = this.field1792[var20];
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
            field1826[var20] = var31 - var19;
            field1807[var20] = class91.field1565 * var27 / arg7 + var9;
            field1825[var20] = class91.field1565 * var30 / arg7 + var10;
            if (this.field1809 > 0) {
                field1827[var20] = var27;
                field1844[var20] = var30;
                field1829[var20] = var31;
            }
        }
        try {
            this.method2105(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dm.x(IIIIIIIII)V")
    public void method1716(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1795[0] = -1;
        if (this.field1816 != 1) {
            this.method2093();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1818 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1818) * class91.field1565;
        if (var15 / var13 >= Statics.field1564) {
            return;
        }
        int var16 = (this.field1818 + var14) * class91.field1565;
        if (var16 / var13 <= Statics.field1570) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1818 * arg1 >> 16;
        int var19 = (var17 + var18) * class91.field1565;
        if (var19 / var13 <= Statics.field1572) {
            return;
        }
        int var20 = (this.field1441 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class91.field1565;
        if (var21 / var13 >= Statics.field1568) {
            return;
        }
        int var22 = (this.field1441 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1809 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1820) {
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
            int var32 = field1845 - Statics.field1571;
            int var33 = field1800 - Statics.field1567;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1815) {
                    field1848[field1847++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1571;
        int var35 = Statics.field1567;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1849[arg0];
            var37 = field1850[arg0];
        }
        for (int var38 = 0; var38 < this.field1793; var38++) {
            int var39 = this.field1842[var38];
            int var40 = this.field1801[var38];
            int var41 = this.field1792[var38];
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
            field1826[var38] = var50 - var11;
            if (var50 >= 50) {
                field1807[var38] = class91.field1565 * var46 / var50 + var34;
                field1825[var38] = class91.field1565 * var49 / var50 + var35;
            } else {
                field1807[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1827[var38] = var46;
                field1844[var38] = var49;
                field1829[var38] = var50;
            }
        }
        try {
            this.method2105(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dm.n(ZZI)V")
    public final void method2105(boolean arg0, boolean arg1, int arg2) {
        if (this.field1803 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1803; var4++) {
            field1795[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1797; var5++) {
            if (this.field1811[var5] != -2) {
                int var6 = this.field1822[var5];
                int var7 = this.field1799[var5];
                int var8 = this.field1810[var5];
                int var9 = field1807[var6];
                int var10 = field1807[var7];
                int var11 = field1807[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1827[var6];
                    int var13 = field1827[var7];
                    int var14 = field1827[var8];
                    int var15 = field1844[var6];
                    int var16 = field1844[var7];
                    int var17 = field1844[var8];
                    int var18 = field1829[var6];
                    int var19 = field1829[var7];
                    int var20 = field1829[var8];
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
                        field1823[var5] = true;
                        int var30 = (field1826[var6] + field1826[var7] + field1826[var8]) / 3 + this.field1791;
                        field1832[var30][field1795[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2108(field1845, field1800, field1825[var6], field1825[var7], field1825[var8], var9, var10, var11)) {
                        field1848[field1847++] = arg2;
                        arg1 = false;
                    }
                    if ((field1825[var8] - field1825[var7]) * (var9 - var10) - (field1825[var6] - field1825[var7]) * (var11 - var10) > 0) {
                        field1823[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1569 && var10 <= Statics.field1569 && var11 <= Statics.field1569) {
                            field1830[var5] = false;
                        } else {
                            field1830[var5] = true;
                        }
                        int var31 = (field1826[var6] + field1826[var7] + field1826[var8]) / 3 + this.field1791;
                        field1832[var31][field1795[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1804 == null) {
            for (int var32 = this.field1803 - 1; var32 >= 0; var32--) {
                int var33 = field1795[var32];
                if (var33 > 0) {
                    int[] var34 = field1832[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2106(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1833[var36] = 0;
            field1837[var36] = 0;
        }
        for (int var37 = this.field1803 - 1; var37 >= 0; var37--) {
            int var38 = field1795[var37];
            if (var38 > 0) {
                int[] var39 = field1832[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1804[var41];
                    int var43 = field1833[var42]++;
                    field1834[var42][var43] = var41;
                    if (var42 < 10) {
                        field1837[var42] += var37;
                    } else if (var42 == 10) {
                        field1835[var43] = var37;
                    } else {
                        field1836[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1833[1] > 0 || field1833[2] > 0) {
            var44 = (field1837[1] + field1837[2]) / (field1833[1] + field1833[2]);
        }
        int var45 = 0;
        if (field1833[3] > 0 || field1833[4] > 0) {
            var45 = (field1837[3] + field1837[4]) / (field1833[3] + field1833[4]);
        }
        int var46 = 0;
        if (field1833[6] > 0 || field1833[8] > 0) {
            var46 = (field1837[6] + field1837[8]) / (field1833[6] + field1833[8]);
        }
        int var47 = 0;
        int var48 = field1833[10];
        int[] var49 = field1834[10];
        int[] var50 = field1835;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1833[11];
            var49 = field1834[11];
            var50 = field1836;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2106(var49[var47++]);
                if (var47 == var48 && field1834[11] != var49) {
                    var47 = 0;
                    var48 = field1833[11];
                    var49 = field1834[11];
                    var50 = field1836;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2106(var49[var47++]);
                if (var47 == var48 && field1834[11] != var49) {
                    var47 = 0;
                    var48 = field1833[11];
                    var49 = field1834[11];
                    var50 = field1836;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2106(var49[var47++]);
                if (var47 == var48 && field1834[11] != var49) {
                    var47 = 0;
                    var48 = field1833[11];
                    var49 = field1834[11];
                    var50 = field1836;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1833[var52];
            int[] var54 = field1834[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2106(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2106(var49[var47++]);
            if (var47 == var48 && field1834[11] != var49) {
                var47 = 0;
                var49 = field1834[11];
                var48 = field1833[11];
                var50 = field1836;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dm.c(I)V")
    public final void method2106(int arg0) {
        if (field1823[arg0]) {
            this.method2107(arg0);
            return;
        }
        int var2 = this.field1822[arg0];
        int var3 = this.field1799[arg0];
        int var4 = this.field1810[arg0];
        class91.field1575 = field1830[arg0];
        if (this.field1843 == null) {
            class91.field1560 = 0;
        } else {
            class91.field1560 = this.field1843[arg0] & 0xFF;
        }
        if (this.field1819 != null && this.field1819[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1806 == null || this.field1806[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1806[arg0] & 0xFF;
                var6 = this.field1798[var5];
                var7 = this.field1812[var5];
                var8 = this.field1846[var5];
            }
            if (this.field1811[arg0] == -1) {
                class91.method1946(field1825[var2], field1825[var3], field1825[var4], field1807[var2], field1807[var3], field1807[var4], this.field1802[arg0], this.field1802[arg0], this.field1802[arg0], field1827[var6], field1827[var7], field1827[var8], field1844[var6], field1844[var7], field1844[var8], field1829[var6], field1829[var7], field1829[var8], this.field1819[arg0]);
            } else {
                class91.method1946(field1825[var2], field1825[var3], field1825[var4], field1807[var2], field1807[var3], field1807[var4], this.field1802[arg0], this.field1794[arg0], this.field1811[arg0], field1827[var6], field1827[var7], field1827[var8], field1844[var6], field1844[var7], field1844[var8], field1829[var6], field1829[var7], field1829[var8], this.field1819[arg0]);
            }
        } else if (this.field1811[arg0] == -1) {
            class91.method1908(field1825[var2], field1825[var3], field1825[var4], field1807[var2], field1807[var3], field1807[var4], field1851[this.field1802[arg0]]);
        } else {
            class91.method1906(field1825[var2], field1825[var3], field1825[var4], field1807[var2], field1807[var3], field1807[var4], this.field1802[arg0], this.field1794[arg0], this.field1811[arg0]);
        }
    }

    @ObfuscatedName("dm.k(I)V")
    public final void method2107(int arg0) {
        int var2 = Statics.field1571;
        int var3 = Statics.field1567;
        int var4 = 0;
        int var5 = this.field1822[arg0];
        int var6 = this.field1799[arg0];
        int var7 = this.field1810[arg0];
        int var8 = field1829[var5];
        int var9 = field1829[var6];
        int var10 = field1829[var7];
        if (this.field1843 == null) {
            class91.field1560 = 0;
        } else {
            class91.field1560 = this.field1843[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1838[var4] = field1807[var5];
            field1831[var4] = field1825[var5];
            field1840[var4++] = this.field1802[arg0];
        } else {
            int var11 = field1827[var5];
            int var12 = field1844[var5];
            int var13 = this.field1802[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1852[var10 - var8];
                field1838[var4] = (((field1827[var7] - var11) * var14 >> 16) + var11) * class91.field1565 / 50 + var2;
                field1831[var4] = (((field1844[var7] - var12) * var14 >> 16) + var12) * class91.field1565 / 50 + var3;
                field1840[var4++] = ((this.field1811[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1852[var9 - var8];
                field1838[var4] = (((field1827[var6] - var11) * var15 >> 16) + var11) * class91.field1565 / 50 + var2;
                field1831[var4] = (((field1844[var6] - var12) * var15 >> 16) + var12) * class91.field1565 / 50 + var3;
                field1840[var4++] = ((this.field1794[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1838[var4] = field1807[var6];
            field1831[var4] = field1825[var6];
            field1840[var4++] = this.field1794[arg0];
        } else {
            int var16 = field1827[var6];
            int var17 = field1844[var6];
            int var18 = this.field1794[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1852[var8 - var9];
                field1838[var4] = (((field1827[var5] - var16) * var19 >> 16) + var16) * class91.field1565 / 50 + var2;
                field1831[var4] = (((field1844[var5] - var17) * var19 >> 16) + var17) * class91.field1565 / 50 + var3;
                field1840[var4++] = ((this.field1802[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1852[var10 - var9];
                field1838[var4] = (((field1827[var7] - var16) * var20 >> 16) + var16) * class91.field1565 / 50 + var2;
                field1831[var4] = (((field1844[var7] - var17) * var20 >> 16) + var17) * class91.field1565 / 50 + var3;
                field1840[var4++] = ((this.field1811[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1838[var4] = field1807[var7];
            field1831[var4] = field1825[var7];
            field1840[var4++] = this.field1811[arg0];
        } else {
            int var21 = field1827[var7];
            int var22 = field1844[var7];
            int var23 = this.field1811[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1852[var9 - var10];
                field1838[var4] = (((field1827[var6] - var21) * var24 >> 16) + var21) * class91.field1565 / 50 + var2;
                field1831[var4] = (((field1844[var6] - var22) * var24 >> 16) + var22) * class91.field1565 / 50 + var3;
                field1840[var4++] = ((this.field1794[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1852[var8 - var10];
                field1838[var4] = (((field1827[var5] - var21) * var25 >> 16) + var21) * class91.field1565 / 50 + var2;
                field1831[var4] = (((field1844[var5] - var22) * var25 >> 16) + var22) * class91.field1565 / 50 + var3;
                field1840[var4++] = ((this.field1802[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1838[0];
        int var27 = field1838[1];
        int var28 = field1838[2];
        int var29 = field1831[0];
        int var30 = field1831[1];
        int var31 = field1831[2];
        class91.field1575 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1569 || var27 > Statics.field1569 || var28 > Statics.field1569) {
                class91.field1575 = true;
            }
            if (this.field1819 != null && this.field1819[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1806 == null || this.field1806[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1806[arg0] & 0xFF;
                    var33 = this.field1798[var32];
                    var34 = this.field1812[var32];
                    var35 = this.field1846[var32];
                }
                if (this.field1811[arg0] == -1) {
                    class91.method1946(var29, var30, var31, var26, var27, var28, this.field1802[arg0], this.field1802[arg0], this.field1802[arg0], field1827[var33], field1827[var34], field1827[var35], field1844[var33], field1844[var34], field1844[var35], field1829[var33], field1829[var34], field1829[var35], this.field1819[arg0]);
                } else {
                    class91.method1946(var29, var30, var31, var26, var27, var28, field1840[0], field1840[1], field1840[2], field1827[var33], field1827[var34], field1827[var35], field1844[var33], field1844[var34], field1844[var35], field1829[var33], field1829[var34], field1829[var35], this.field1819[arg0]);
                }
            } else if (this.field1811[arg0] == -1) {
                class91.method1908(var29, var30, var31, var26, var27, var28, field1851[this.field1802[arg0]]);
            } else {
                class91.method1906(var29, var30, var31, var26, var27, var28, field1840[0], field1840[1], field1840[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1569 || var27 > Statics.field1569 || var28 > Statics.field1569 || field1838[3] < 0 || field1838[3] > Statics.field1569) {
            class91.field1575 = true;
        }
        if (this.field1819 != null && this.field1819[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1806 == null || this.field1806[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1806[arg0] & 0xFF;
                var37 = this.field1798[var36];
                var38 = this.field1812[var36];
                var39 = this.field1846[var36];
            }
            short var40 = this.field1819[arg0];
            if (this.field1811[arg0] == -1) {
                class91.method1946(var29, var30, var31, var26, var27, var28, this.field1802[arg0], this.field1802[arg0], this.field1802[arg0], field1827[var37], field1827[var38], field1827[var39], field1844[var37], field1844[var38], field1844[var39], field1829[var37], field1829[var38], field1829[var39], var40);
                class91.method1946(var29, var31, field1831[3], var26, var28, field1838[3], this.field1802[arg0], this.field1802[arg0], this.field1802[arg0], field1827[var37], field1827[var38], field1827[var39], field1844[var37], field1844[var38], field1844[var39], field1829[var37], field1829[var38], field1829[var39], var40);
            } else {
                class91.method1946(var29, var30, var31, var26, var27, var28, field1840[0], field1840[1], field1840[2], field1827[var37], field1827[var38], field1827[var39], field1844[var37], field1844[var38], field1844[var39], field1829[var37], field1829[var38], field1829[var39], var40);
                class91.method1946(var29, var31, field1831[3], var26, var28, field1838[3], field1840[0], field1840[2], field1840[3], field1827[var37], field1827[var38], field1827[var39], field1844[var37], field1844[var38], field1844[var39], field1829[var37], field1829[var38], field1829[var39], var40);
            }
        } else if (this.field1811[arg0] == -1) {
            int var41 = field1851[this.field1802[arg0]];
            class91.method1908(var29, var30, var31, var26, var27, var28, var41);
            class91.method1908(var29, var31, field1831[3], var26, var28, field1838[3], var41);
        } else {
            class91.method1906(var29, var30, var31, var26, var27, var28, field1840[0], field1840[1], field1840[2]);
            class91.method1906(var29, var31, field1831[3], var26, var28, field1838[3], field1840[0], field1840[2], field1840[3]);
        }
    }

    @ObfuscatedName("dm.ah(IIIIIIII)Z")
    public final boolean method2108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
