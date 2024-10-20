package deob;

@ObfuscatedName("dr")
public class class106 extends class86 {

    @ObfuscatedName("dr.a")
    public static class106 field1847 = new class106();

    @ObfuscatedName("dr.w")
    public static byte[] field1837 = new byte[1];

    @ObfuscatedName("dr.d")
    public static class106 field1805 = new class106();

    @ObfuscatedName("dr.c")
    public static byte[] field1797 = new byte[1];

    @ObfuscatedName("dr.y")
    public int field1798 = 0;

    @ObfuscatedName("dr.k")
    public int[] field1799;

    @ObfuscatedName("dr.r")
    public int[] field1800;

    @ObfuscatedName("dr.p")
    public int[] field1840;

    @ObfuscatedName("dr.q")
    public int field1802 = 0;

    @ObfuscatedName("dr.m")
    public int[] field1794;

    @ObfuscatedName("dr.e")
    public int[] field1836;

    @ObfuscatedName("dr.x")
    public int[] field1801;

    @ObfuscatedName("dr.z")
    public int[] field1806;

    @ObfuscatedName("dr.i")
    public int[] field1807;

    @ObfuscatedName("dr.t")
    public int[] field1808;

    @ObfuscatedName("dr.n")
    public byte[] field1809;

    @ObfuscatedName("dr.u")
    public byte[] field1834;

    @ObfuscatedName("dr.g")
    public byte[] field1811;

    @ObfuscatedName("dr.j")
    public short[] field1812;

    @ObfuscatedName("dr.h")
    public byte field1796 = 0;

    @ObfuscatedName("dr.s")
    public int field1814 = 0;

    @ObfuscatedName("dr.f")
    public int[] field1803;

    @ObfuscatedName("dr.b")
    public int[] field1835;

    @ObfuscatedName("dr.l")
    public int[] field1817;

    @ObfuscatedName("dr.o")
    public int[][] field1818;

    @ObfuscatedName("dr.v")
    public int[][] field1823;

    @ObfuscatedName("dr.ad")
    public boolean field1820 = false;

    @ObfuscatedName("dr.ar")
    public int field1850;

    @ObfuscatedName("dr.ah")
    public int field1822;

    @ObfuscatedName("dr.ay")
    public int field1843;

    @ObfuscatedName("dr.af")
    public int field1824;

    @ObfuscatedName("dr.al")
    public int field1825;

    @ObfuscatedName("dr.an")
    public static boolean[] field1821 = new boolean[4700];

    @ObfuscatedName("dr.az")
    public static boolean[] field1828 = new boolean[4700];

    @ObfuscatedName("dr.ac")
    public static int[] field1829 = new int[4700];

    @ObfuscatedName("dr.ao")
    public static int[] field1830 = new int[4700];

    @ObfuscatedName("dr.ax")
    public static int[] field1831 = new int[4700];

    @ObfuscatedName("dr.at")
    public static int[] field1832 = new int[4700];

    @ObfuscatedName("dr.ab")
    public static int[] field1833 = new int[4700];

    @ObfuscatedName("dr.ae")
    public static int[] field1855 = new int[4700];

    @ObfuscatedName("dr.am")
    public static int[] field1813 = new int[1600];

    @ObfuscatedName("dr.aj")
    public static int[][] field1839 = new int[1600][512];

    @ObfuscatedName("dr.aq")
    public static int[] field1838 = new int[12];

    @ObfuscatedName("dr.ag")
    public static int[][] field1819 = new int[12][2000];

    @ObfuscatedName("dr.ap")
    public static int[] field1858 = new int[2000];

    @ObfuscatedName("dr.ak")
    public static int[] field1841 = new int[2000];

    @ObfuscatedName("dr.as")
    public static int[] field1842 = new int[12];

    @ObfuscatedName("dr.aa")
    public static int[] field1827 = new int[10];

    @ObfuscatedName("dr.av")
    public static int[] field1844 = new int[10];

    @ObfuscatedName("dr.aw")
    public static int[] field1845 = new int[10];

    @ObfuscatedName("dr.bm")
    public static boolean field1849 = false;

    @ObfuscatedName("dr.bl")
    public static int field1795 = 0;

    @ObfuscatedName("dr.bk")
    public static int field1851 = 0;

    @ObfuscatedName("dr.bi")
    public static int field1852 = 0;

    @ObfuscatedName("dr.by")
    public static int[] field1853 = new int[1000];

    @ObfuscatedName("dr.bc")
    public static int[] field1854 = class92.field1594;

    @ObfuscatedName("dr.bu")
    public static int[] field1804 = class92.field1595;

    @ObfuscatedName("dr.ba")
    public static int[] field1856 = class92.field1590;

    @ObfuscatedName("dr.bd")
    public static int[] field1857 = class92.field1587;

    public class106() {
    }

    public class106(class106[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1798 = 0;
        this.field1802 = 0;
        this.field1814 = 0;
        this.field1796 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class106 var8 = arg0[var7];
            if (var8 != null) {
                this.field1798 += var8.field1798;
                this.field1802 += var8.field1802;
                this.field1814 += var8.field1814;
                if (var8.field1809 == null) {
                    if (this.field1796 == -1) {
                        this.field1796 = var8.field1796;
                    }
                    if (this.field1796 != var8.field1796) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1834 != null;
                var5 |= var8.field1812 != null;
                var6 |= var8.field1811 != null;
            }
        }
        this.field1799 = new int[this.field1798];
        this.field1800 = new int[this.field1798];
        this.field1840 = new int[this.field1798];
        this.field1794 = new int[this.field1802];
        this.field1836 = new int[this.field1802];
        this.field1801 = new int[this.field1802];
        this.field1806 = new int[this.field1802];
        this.field1807 = new int[this.field1802];
        this.field1808 = new int[this.field1802];
        if (var3) {
            this.field1809 = new byte[this.field1802];
        }
        if (var4) {
            this.field1834 = new byte[this.field1802];
        }
        if (var5) {
            this.field1812 = new short[this.field1802];
        }
        if (var6) {
            this.field1811 = new byte[this.field1802];
        }
        if (this.field1814 > 0) {
            this.field1803 = new int[this.field1814];
            this.field1835 = new int[this.field1814];
            this.field1817 = new int[this.field1814];
        }
        this.field1798 = 0;
        this.field1802 = 0;
        this.field1814 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class106 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1802; var11++) {
                    this.field1794[this.field1802] = var10.field1794[var11] + this.field1798;
                    this.field1836[this.field1802] = var10.field1836[var11] + this.field1798;
                    this.field1801[this.field1802] = var10.field1801[var11] + this.field1798;
                    this.field1806[this.field1802] = var10.field1806[var11];
                    this.field1807[this.field1802] = var10.field1807[var11];
                    this.field1808[this.field1802] = var10.field1808[var11];
                    if (var3) {
                        if (var10.field1809 == null) {
                            this.field1809[this.field1802] = var10.field1796;
                        } else {
                            this.field1809[this.field1802] = var10.field1809[var11];
                        }
                    }
                    if (var4 && var10.field1834 != null) {
                        this.field1834[this.field1802] = var10.field1834[var11];
                    }
                    if (var5) {
                        if (var10.field1812 == null) {
                            this.field1812[this.field1802] = -1;
                        } else {
                            this.field1812[this.field1802] = var10.field1812[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1811 == null || var10.field1811[var11] == -1) {
                            this.field1811[this.field1802] = -1;
                        } else {
                            this.field1811[this.field1802] = (byte) (var10.field1811[var11] + this.field1814);
                        }
                    }
                    this.field1802++;
                }
                for (int var12 = 0; var12 < var10.field1814; var12++) {
                    this.field1803[this.field1814] = var10.field1803[var12] + this.field1798;
                    this.field1835[this.field1814] = var10.field1835[var12] + this.field1798;
                    this.field1817[this.field1814] = var10.field1817[var12] + this.field1798;
                    this.field1814++;
                }
                for (int var13 = 0; var13 < var10.field1798; var13++) {
                    this.field1799[this.field1798] = var10.field1799[var13];
                    this.field1800[this.field1798] = var10.field1800[var13];
                    this.field1840[this.field1798] = var10.field1840[var13];
                    this.field1798++;
                }
            }
        }
    }

    @ObfuscatedName("dr.a([[IIIIZI)Ldr;")
    public class106 method2309(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2274();
        int var7 = arg1 - this.field1843;
        int var8 = this.field1843 + arg1;
        int var9 = arg3 - this.field1843;
        int var10 = this.field1843 + arg3;
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
            var15.field1798 = this.field1798;
            var15.field1802 = this.field1802;
            var15.field1814 = this.field1814;
            var15.field1799 = this.field1799;
            var15.field1840 = this.field1840;
            var15.field1794 = this.field1794;
            var15.field1836 = this.field1836;
            var15.field1801 = this.field1801;
            var15.field1806 = this.field1806;
            var15.field1807 = this.field1807;
            var15.field1808 = this.field1808;
            var15.field1809 = this.field1809;
            var15.field1834 = this.field1834;
            var15.field1811 = this.field1811;
            var15.field1812 = this.field1812;
            var15.field1796 = this.field1796;
            var15.field1803 = this.field1803;
            var15.field1835 = this.field1835;
            var15.field1817 = this.field1817;
            var15.field1818 = this.field1818;
            var15.field1823 = this.field1823;
            var15.field1820 = this.field1820;
            var15.field1800 = new int[var15.field1798];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1798; var16++) {
                int var17 = this.field1799[var16] + arg1;
                int var18 = this.field1840[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1800[var16] = this.field1800[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1798; var26++) {
                int var27 = (-this.field1800[var26] << 16) / this.field1466;
                if (var27 < arg5) {
                    int var28 = this.field1799[var26] + arg1;
                    int var29 = this.field1840[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1800[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1800[var26];
                }
            }
        }
        var15.field1850 = 0;
        return var15;
    }

    @ObfuscatedName("dr.w(Z)Ldr;")
    public class106 method2326(boolean arg0) {
        if (!arg0 && field1837.length < this.field1802) {
            field1837 = new byte[this.field1802 + 100];
        }
        return this.method2249(arg0, field1847, field1837);
    }

    @ObfuscatedName("dr.c(Z)Ldr;")
    public class106 method2248(boolean arg0) {
        if (!arg0 && field1797.length < this.field1802) {
            field1797 = new byte[this.field1802 + 100];
        }
        return this.method2249(arg0, field1805, field1797);
    }

    @ObfuscatedName("dr.y(ZLdr;[B)Ldr;")
    public class106 method2249(boolean arg0, class106 arg1, byte[] arg2) {
        arg1.field1798 = this.field1798;
        arg1.field1802 = this.field1802;
        arg1.field1814 = this.field1814;
        if (arg1.field1799 == null || arg1.field1799.length < this.field1798) {
            arg1.field1799 = new int[this.field1798 + 100];
            arg1.field1800 = new int[this.field1798 + 100];
            arg1.field1840 = new int[this.field1798 + 100];
        }
        for (int var4 = 0; var4 < this.field1798; var4++) {
            arg1.field1799[var4] = this.field1799[var4];
            arg1.field1800[var4] = this.field1800[var4];
            arg1.field1840[var4] = this.field1840[var4];
        }
        if (arg0) {
            arg1.field1834 = this.field1834;
        } else {
            arg1.field1834 = arg2;
            if (this.field1834 == null) {
                for (int var5 = 0; var5 < this.field1802; var5++) {
                    arg1.field1834[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1802; var6++) {
                    arg1.field1834[var6] = this.field1834[var6];
                }
            }
        }
        arg1.field1794 = this.field1794;
        arg1.field1836 = this.field1836;
        arg1.field1801 = this.field1801;
        arg1.field1806 = this.field1806;
        arg1.field1807 = this.field1807;
        arg1.field1808 = this.field1808;
        arg1.field1809 = this.field1809;
        arg1.field1811 = this.field1811;
        arg1.field1812 = this.field1812;
        arg1.field1796 = this.field1796;
        arg1.field1803 = this.field1803;
        arg1.field1835 = this.field1835;
        arg1.field1817 = this.field1817;
        arg1.field1818 = this.field1818;
        arg1.field1823 = this.field1823;
        arg1.field1820 = this.field1820;
        arg1.field1850 = 0;
        return arg1;
    }

    @ObfuscatedName("dr.k()V")
    public void method2274() {
        if (this.field1850 == 1) {
            return;
        }
        this.field1850 = 1;
        this.field1466 = 0;
        this.field1822 = 0;
        this.field1843 = 0;
        for (int var1 = 0; var1 < this.field1798; var1++) {
            int var2 = this.field1799[var1];
            int var3 = this.field1800[var1];
            int var4 = this.field1840[var1];
            if (-var3 > this.field1466) {
                this.field1466 = -var3;
            }
            if (var3 > this.field1822) {
                this.field1822 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1843) {
                this.field1843 = var5;
            }
        }
        this.field1843 = (int) (Math.sqrt((double) this.field1843) + 0.99D);
        this.field1825 = (int) (Math.sqrt((double) (this.field1466 * this.field1466 + this.field1843 * this.field1843)) + 0.99D);
        this.field1824 = this.field1825 + (int) (Math.sqrt((double) (this.field1843 * this.field1843 + this.field1822 * this.field1822)) + 0.99D);
    }

    @ObfuscatedName("dr.r()V")
    public void method2251() {
        if (this.field1850 == 2) {
            return;
        }
        this.field1850 = 2;
        this.field1843 = 0;
        for (int var1 = 0; var1 < this.field1798; var1++) {
            int var2 = this.field1799[var1];
            int var3 = this.field1800[var1];
            int var4 = this.field1840[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1843) {
                this.field1843 = var5;
            }
        }
        this.field1843 = (int) (Math.sqrt((double) this.field1843) + 0.99D);
        this.field1825 = this.field1843;
        this.field1824 = this.field1843 + this.field1843;
    }

    @ObfuscatedName("dr.p()I")
    public int method2282() {
        this.method2274();
        return this.field1843;
    }

    @ObfuscatedName("dr.q(Lcl;I)V")
    public void method2316(class104 arg0, int arg1) {
        if (this.field1818 == null || arg1 == -1) {
            return;
        }
        class89 var3 = arg0.field1771[arg1];
        class103 var4 = var3.field1550;
        Statics.field1846 = 0;
        Statics.field1810 = 0;
        Statics.field1848 = 0;
        for (int var5 = 0; var5 < var3.field1546; var5++) {
            int var6 = var3.field1547[var5];
            this.method2255(var4.field1762[var6], var4.field1763[var6], var3.field1548[var5], var3.field1549[var5], var3.field1541[var5]);
        }
        this.field1850 = 0;
    }

    @ObfuscatedName("dr.m(Lcl;ILcl;I[I)V")
    public void method2254(class104 arg0, int arg1, class104 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2316(arg0, arg1);
            return;
        }
        class89 var6 = arg0.field1771[arg1];
        class89 var7 = arg2.field1771[arg3];
        class103 var8 = var6.field1550;
        Statics.field1846 = 0;
        Statics.field1810 = 0;
        Statics.field1848 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1546; var11++) {
            int var12 = var6.field1547[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1762[var12] == 0) {
                this.method2255(var8.field1762[var12], var8.field1763[var12], var6.field1548[var11], var6.field1549[var11], var6.field1541[var11]);
            }
        }
        Statics.field1846 = 0;
        Statics.field1810 = 0;
        Statics.field1848 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1546; var15++) {
            int var16 = var7.field1547[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1762[var16] == 0) {
                this.method2255(var8.field1762[var16], var8.field1763[var16], var7.field1548[var15], var7.field1549[var15], var7.field1541[var15]);
            }
        }
        this.field1850 = 0;
    }

    @ObfuscatedName("dr.e(I[IIII)V")
    public void method2255(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1846 = 0;
            Statics.field1810 = 0;
            Statics.field1848 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1818.length) {
                    int[] var10 = this.field1818[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1846 += this.field1799[var12];
                        Statics.field1810 += this.field1800[var12];
                        Statics.field1848 += this.field1840[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1846 = Statics.field1846 / var7 + arg2;
                Statics.field1810 = Statics.field1810 / var7 + arg3;
                Statics.field1848 = Statics.field1848 / var7 + arg4;
            } else {
                Statics.field1846 = arg2;
                Statics.field1810 = arg3;
                Statics.field1848 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1818.length) {
                    int[] var15 = this.field1818[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1799[var17] += arg2;
                        this.field1800[var17] += arg3;
                        this.field1840[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1818.length) {
                    int[] var20 = this.field1818[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1799[var22] -= Statics.field1846;
                        this.field1800[var22] -= Statics.field1810;
                        this.field1840[var22] -= Statics.field1848;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1854[var25];
                            int var27 = field1804[var25];
                            int var28 = this.field1800[var22] * var26 + this.field1799[var22] * var27 >> 16;
                            this.field1800[var22] = this.field1800[var22] * var27 - this.field1799[var22] * var26 >> 16;
                            this.field1799[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1854[var23];
                            int var30 = field1804[var23];
                            int var31 = this.field1800[var22] * var30 - this.field1840[var22] * var29 >> 16;
                            this.field1840[var22] = this.field1840[var22] * var30 + this.field1800[var22] * var29 >> 16;
                            this.field1800[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1854[var24];
                            int var33 = field1804[var24];
                            int var34 = this.field1840[var22] * var32 + this.field1799[var22] * var33 >> 16;
                            this.field1840[var22] = this.field1840[var22] * var33 - this.field1799[var22] * var32 >> 16;
                            this.field1799[var22] = var34;
                        }
                        this.field1799[var22] += Statics.field1846;
                        this.field1800[var22] += Statics.field1810;
                        this.field1840[var22] += Statics.field1848;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1818.length) {
                    int[] var37 = this.field1818[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1799[var39] -= Statics.field1846;
                        this.field1800[var39] -= Statics.field1810;
                        this.field1840[var39] -= Statics.field1848;
                        this.field1799[var39] = this.field1799[var39] * arg2 / 128;
                        this.field1800[var39] = this.field1800[var39] * arg3 / 128;
                        this.field1840[var39] = this.field1840[var39] * arg4 / 128;
                        this.field1799[var39] += Statics.field1846;
                        this.field1800[var39] += Statics.field1810;
                        this.field1840[var39] += Statics.field1848;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1823 != null && this.field1834 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1823.length) {
                    int[] var42 = this.field1823[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1834[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1834[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dr.x()V")
    public void method2256() {
        for (int var1 = 0; var1 < this.field1798; var1++) {
            int var2 = this.field1799[var1];
            this.field1799[var1] = this.field1840[var1];
            this.field1840[var1] = -var2;
        }
        this.field1850 = 0;
    }

    @ObfuscatedName("dr.z()V")
    public void method2257() {
        for (int var1 = 0; var1 < this.field1798; var1++) {
            this.field1799[var1] = -this.field1799[var1];
            this.field1840[var1] = -this.field1840[var1];
        }
        this.field1850 = 0;
    }

    @ObfuscatedName("dr.n()V")
    public void method2258() {
        for (int var1 = 0; var1 < this.field1798; var1++) {
            int var2 = this.field1840[var1];
            this.field1840[var1] = this.field1799[var1];
            this.field1799[var1] = -var2;
        }
        this.field1850 = 0;
    }

    @ObfuscatedName("dr.u(I)V")
    public void method2259(int arg0) {
        int var2 = field1854[arg0];
        int var3 = field1804[arg0];
        for (int var4 = 0; var4 < this.field1798; var4++) {
            int var5 = this.field1800[var4] * var3 - this.field1840[var4] * var2 >> 16;
            this.field1840[var4] = this.field1840[var4] * var3 + this.field1800[var4] * var2 >> 16;
            this.field1800[var4] = var5;
        }
        this.field1850 = 0;
    }

    @ObfuscatedName("dr.g(III)V")
    public void method2260(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1798; var4++) {
            this.field1799[var4] += arg0;
            this.field1800[var4] += arg1;
            this.field1840[var4] += arg2;
        }
        this.field1850 = 0;
    }

    @ObfuscatedName("dr.j(III)V")
    public void method2261(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1798; var4++) {
            this.field1799[var4] = this.field1799[var4] * arg0 / 128;
            this.field1800[var4] = this.field1800[var4] * arg1 / 128;
            this.field1840[var4] = this.field1840[var4] * arg2 / 128;
        }
        this.field1850 = 0;
    }

    @ObfuscatedName("dr.h(IIIIIII)V")
    public final void method2276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1813[0] = -1;
        if (this.field1850 != 2 && this.field1850 != 1) {
            this.method2251();
        }
        int var8 = Statics.field1581;
        int var9 = Statics.field1582;
        int var10 = field1854[arg0];
        int var11 = field1804[arg0];
        int var12 = field1854[arg1];
        int var13 = field1804[arg1];
        int var14 = field1854[arg2];
        int var15 = field1804[arg2];
        int var16 = field1854[arg3];
        int var17 = field1804[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1798; var19++) {
            int var20 = this.field1799[var19];
            int var21 = this.field1800[var19];
            int var22 = this.field1840[var19];
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
            field1831[var19] = var30 - var18;
            field1829[var19] = class92.field1580 * var26 / var30 + var8;
            field1830[var19] = class92.field1580 * var29 / var30 + var9;
            if (this.field1814 > 0) {
                field1832[var19] = var26;
                field1833[var19] = var29;
                field1855[var19] = var30;
            }
        }
        try {
            this.method2265(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dr.s(IIIIIIII)V")
    public final void method2315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1813[0] = -1;
        if (this.field1850 != 2 && this.field1850 != 1) {
            this.method2251();
        }
        int var9 = Statics.field1581;
        int var10 = Statics.field1582;
        int var11 = field1854[arg0];
        int var12 = field1804[arg0];
        int var13 = field1854[arg1];
        int var14 = field1804[arg1];
        int var15 = field1854[arg2];
        int var16 = field1804[arg2];
        int var17 = field1854[arg3];
        int var18 = field1804[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1798; var20++) {
            int var21 = this.field1799[var20];
            int var22 = this.field1800[var20];
            int var23 = this.field1840[var20];
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
            field1831[var20] = var31 - var19;
            field1829[var20] = class92.field1580 * var27 / arg7 + var9;
            field1830[var20] = class92.field1580 * var30 / arg7 + var10;
            if (this.field1814 > 0) {
                field1832[var20] = var27;
                field1833[var20] = var30;
                field1855[var20] = var31;
            }
        }
        try {
            this.method2265(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dr.at(IIIIIIIII)V")
    public void method1872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1813[0] = -1;
        if (this.field1850 != 1) {
            this.method2274();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1843 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1843) * class92.field1580;
        if (var15 / var13 >= Statics.field1579) {
            return;
        }
        int var16 = (this.field1843 + var14) * class92.field1580;
        if (var16 / var13 <= Statics.field1585) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1843 * arg1 >> 16;
        int var19 = (var17 + var18) * class92.field1580;
        if (var19 / var13 <= Statics.field1588) {
            return;
        }
        int var20 = (this.field1466 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class92.field1580;
        if (var21 / var13 >= Statics.field1586) {
            return;
        }
        int var22 = (this.field1466 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1814 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1849) {
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
            int var32 = field1795 - Statics.field1581;
            int var33 = field1851 - Statics.field1582;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1820) {
                    field1853[field1852++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1581;
        int var35 = Statics.field1582;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1854[arg0];
            var37 = field1804[arg0];
        }
        for (int var38 = 0; var38 < this.field1798; var38++) {
            int var39 = this.field1799[var38];
            int var40 = this.field1800[var38];
            int var41 = this.field1840[var38];
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
            field1831[var38] = var50 - var11;
            if (var50 >= 50) {
                field1829[var38] = class92.field1580 * var46 / var50 + var34;
                field1830[var38] = class92.field1580 * var49 / var50 + var35;
            } else {
                field1829[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1832[var38] = var46;
                field1833[var38] = var49;
                field1855[var38] = var50;
            }
        }
        try {
            this.method2265(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dr.f(ZZI)V")
    public final void method2265(boolean arg0, boolean arg1, int arg2) {
        if (this.field1824 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1824; var4++) {
            field1813[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1802; var5++) {
            if (this.field1808[var5] != -2) {
                int var6 = this.field1794[var5];
                int var7 = this.field1836[var5];
                int var8 = this.field1801[var5];
                int var9 = field1829[var6];
                int var10 = field1829[var7];
                int var11 = field1829[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1832[var6];
                    int var13 = field1832[var7];
                    int var14 = field1832[var8];
                    int var15 = field1833[var6];
                    int var16 = field1833[var7];
                    int var17 = field1833[var8];
                    int var18 = field1855[var6];
                    int var19 = field1855[var7];
                    int var20 = field1855[var8];
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
                        field1828[var5] = true;
                        int var30 = (field1831[var6] + field1831[var7] + field1831[var8]) / 3 + this.field1825;
                        field1839[var30][field1813[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2271(field1795, field1851, field1830[var6], field1830[var7], field1830[var8], var9, var10, var11)) {
                        field1853[field1852++] = arg2;
                        arg1 = false;
                    }
                    if ((field1830[var8] - field1830[var7]) * (var9 - var10) - (field1830[var6] - field1830[var7]) * (var11 - var10) > 0) {
                        field1828[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1571 && var10 <= Statics.field1571 && var11 <= Statics.field1571) {
                            field1821[var5] = false;
                        } else {
                            field1821[var5] = true;
                        }
                        int var31 = (field1831[var6] + field1831[var7] + field1831[var8]) / 3 + this.field1825;
                        field1839[var31][field1813[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1809 == null) {
            for (int var32 = this.field1824 - 1; var32 >= 0; var32--) {
                int var33 = field1813[var32];
                if (var33 > 0) {
                    int[] var34 = field1839[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2250(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1838[var36] = 0;
            field1842[var36] = 0;
        }
        for (int var37 = this.field1824 - 1; var37 >= 0; var37--) {
            int var38 = field1813[var37];
            if (var38 > 0) {
                int[] var39 = field1839[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1809[var41];
                    int var43 = field1838[var42]++;
                    field1819[var42][var43] = var41;
                    if (var42 < 10) {
                        field1842[var42] += var37;
                    } else if (var42 == 10) {
                        field1858[var43] = var37;
                    } else {
                        field1841[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1838[1] > 0 || field1838[2] > 0) {
            var44 = (field1842[1] + field1842[2]) / (field1838[1] + field1838[2]);
        }
        int var45 = 0;
        if (field1838[3] > 0 || field1838[4] > 0) {
            var45 = (field1842[3] + field1842[4]) / (field1838[3] + field1838[4]);
        }
        int var46 = 0;
        if (field1838[6] > 0 || field1838[8] > 0) {
            var46 = (field1842[6] + field1842[8]) / (field1838[6] + field1838[8]);
        }
        int var47 = 0;
        int var48 = field1838[10];
        int[] var49 = field1819[10];
        int[] var50 = field1858;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1838[11];
            var49 = field1819[11];
            var50 = field1841;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2250(var49[var47++]);
                if (var47 == var48 && field1819[11] != var49) {
                    var47 = 0;
                    var48 = field1838[11];
                    var49 = field1819[11];
                    var50 = field1841;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2250(var49[var47++]);
                if (var47 == var48 && field1819[11] != var49) {
                    var47 = 0;
                    var48 = field1838[11];
                    var49 = field1819[11];
                    var50 = field1841;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2250(var49[var47++]);
                if (var47 == var48 && field1819[11] != var49) {
                    var47 = 0;
                    var48 = field1838[11];
                    var49 = field1819[11];
                    var50 = field1841;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1838[var52];
            int[] var54 = field1819[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2250(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2250(var49[var47++]);
            if (var47 == var48 && field1819[11] != var49) {
                var47 = 0;
                var49 = field1819[11];
                var48 = field1838[11];
                var50 = field1841;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dr.b(I)V")
    public final void method2250(int arg0) {
        if (field1828[arg0]) {
            this.method2267(arg0);
            return;
        }
        int var2 = this.field1794[arg0];
        int var3 = this.field1836[arg0];
        int var4 = this.field1801[arg0];
        class92.field1577 = field1821[arg0];
        if (this.field1834 == null) {
            class92.field1575 = 0;
        } else {
            class92.field1575 = this.field1834[arg0] & 0xFF;
        }
        if (this.field1812 != null && this.field1812[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1811 == null || this.field1811[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1811[arg0] & 0xFF;
                var6 = this.field1803[var5];
                var7 = this.field1835[var5];
                var8 = this.field1817[var5];
            }
            if (this.field1808[arg0] == -1) {
                class92.method2101(field1830[var2], field1830[var3], field1830[var4], field1829[var2], field1829[var3], field1829[var4], this.field1806[arg0], this.field1806[arg0], this.field1806[arg0], field1832[var6], field1832[var7], field1832[var8], field1833[var6], field1833[var7], field1833[var8], field1855[var6], field1855[var7], field1855[var8], this.field1812[arg0]);
            } else {
                class92.method2101(field1830[var2], field1830[var3], field1830[var4], field1829[var2], field1829[var3], field1829[var4], this.field1806[arg0], this.field1807[arg0], this.field1808[arg0], field1832[var6], field1832[var7], field1832[var8], field1833[var6], field1833[var7], field1833[var8], field1855[var6], field1855[var7], field1855[var8], this.field1812[arg0]);
            }
        } else if (this.field1808[arg0] == -1) {
            class92.method2051(field1830[var2], field1830[var3], field1830[var4], field1829[var2], field1829[var3], field1829[var4], field1856[this.field1806[arg0]]);
        } else {
            class92.method2049(field1830[var2], field1830[var3], field1830[var4], field1829[var2], field1829[var3], field1829[var4], this.field1806[arg0], this.field1807[arg0], this.field1808[arg0]);
        }
    }

    @ObfuscatedName("dr.l(I)V")
    public final void method2267(int arg0) {
        int var2 = Statics.field1581;
        int var3 = Statics.field1582;
        int var4 = 0;
        int var5 = this.field1794[arg0];
        int var6 = this.field1836[arg0];
        int var7 = this.field1801[arg0];
        int var8 = field1855[var5];
        int var9 = field1855[var6];
        int var10 = field1855[var7];
        if (this.field1834 == null) {
            class92.field1575 = 0;
        } else {
            class92.field1575 = this.field1834[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1827[var4] = field1829[var5];
            field1844[var4] = field1830[var5];
            field1845[var4++] = this.field1806[arg0];
        } else {
            int var11 = field1832[var5];
            int var12 = field1833[var5];
            int var13 = this.field1806[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1857[var10 - var8];
                field1827[var4] = (((field1832[var7] - var11) * var14 >> 16) + var11) * class92.field1580 / 50 + var2;
                field1844[var4] = (((field1833[var7] - var12) * var14 >> 16) + var12) * class92.field1580 / 50 + var3;
                field1845[var4++] = ((this.field1808[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1857[var9 - var8];
                field1827[var4] = (((field1832[var6] - var11) * var15 >> 16) + var11) * class92.field1580 / 50 + var2;
                field1844[var4] = (((field1833[var6] - var12) * var15 >> 16) + var12) * class92.field1580 / 50 + var3;
                field1845[var4++] = ((this.field1807[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1827[var4] = field1829[var6];
            field1844[var4] = field1830[var6];
            field1845[var4++] = this.field1807[arg0];
        } else {
            int var16 = field1832[var6];
            int var17 = field1833[var6];
            int var18 = this.field1807[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1857[var8 - var9];
                field1827[var4] = (((field1832[var5] - var16) * var19 >> 16) + var16) * class92.field1580 / 50 + var2;
                field1844[var4] = (((field1833[var5] - var17) * var19 >> 16) + var17) * class92.field1580 / 50 + var3;
                field1845[var4++] = ((this.field1806[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1857[var10 - var9];
                field1827[var4] = (((field1832[var7] - var16) * var20 >> 16) + var16) * class92.field1580 / 50 + var2;
                field1844[var4] = (((field1833[var7] - var17) * var20 >> 16) + var17) * class92.field1580 / 50 + var3;
                field1845[var4++] = ((this.field1808[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1827[var4] = field1829[var7];
            field1844[var4] = field1830[var7];
            field1845[var4++] = this.field1808[arg0];
        } else {
            int var21 = field1832[var7];
            int var22 = field1833[var7];
            int var23 = this.field1808[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1857[var9 - var10];
                field1827[var4] = (((field1832[var6] - var21) * var24 >> 16) + var21) * class92.field1580 / 50 + var2;
                field1844[var4] = (((field1833[var6] - var22) * var24 >> 16) + var22) * class92.field1580 / 50 + var3;
                field1845[var4++] = ((this.field1807[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1857[var8 - var10];
                field1827[var4] = (((field1832[var5] - var21) * var25 >> 16) + var21) * class92.field1580 / 50 + var2;
                field1844[var4] = (((field1833[var5] - var22) * var25 >> 16) + var22) * class92.field1580 / 50 + var3;
                field1845[var4++] = ((this.field1806[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1827[0];
        int var27 = field1827[1];
        int var28 = field1827[2];
        int var29 = field1844[0];
        int var30 = field1844[1];
        int var31 = field1844[2];
        class92.field1577 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1571 || var27 > Statics.field1571 || var28 > Statics.field1571) {
                class92.field1577 = true;
            }
            if (this.field1812 != null && this.field1812[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1811 == null || this.field1811[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1811[arg0] & 0xFF;
                    var33 = this.field1803[var32];
                    var34 = this.field1835[var32];
                    var35 = this.field1817[var32];
                }
                if (this.field1808[arg0] == -1) {
                    class92.method2101(var29, var30, var31, var26, var27, var28, this.field1806[arg0], this.field1806[arg0], this.field1806[arg0], field1832[var33], field1832[var34], field1832[var35], field1833[var33], field1833[var34], field1833[var35], field1855[var33], field1855[var34], field1855[var35], this.field1812[arg0]);
                } else {
                    class92.method2101(var29, var30, var31, var26, var27, var28, field1845[0], field1845[1], field1845[2], field1832[var33], field1832[var34], field1832[var35], field1833[var33], field1833[var34], field1833[var35], field1855[var33], field1855[var34], field1855[var35], this.field1812[arg0]);
                }
            } else if (this.field1808[arg0] == -1) {
                class92.method2051(var29, var30, var31, var26, var27, var28, field1856[this.field1806[arg0]]);
            } else {
                class92.method2049(var29, var30, var31, var26, var27, var28, field1845[0], field1845[1], field1845[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1571 || var27 > Statics.field1571 || var28 > Statics.field1571 || field1827[3] < 0 || field1827[3] > Statics.field1571) {
            class92.field1577 = true;
        }
        if (this.field1812 != null && this.field1812[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1811 == null || this.field1811[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1811[arg0] & 0xFF;
                var37 = this.field1803[var36];
                var38 = this.field1835[var36];
                var39 = this.field1817[var36];
            }
            short var40 = this.field1812[arg0];
            if (this.field1808[arg0] == -1) {
                class92.method2101(var29, var30, var31, var26, var27, var28, this.field1806[arg0], this.field1806[arg0], this.field1806[arg0], field1832[var37], field1832[var38], field1832[var39], field1833[var37], field1833[var38], field1833[var39], field1855[var37], field1855[var38], field1855[var39], var40);
                class92.method2101(var29, var31, field1844[3], var26, var28, field1827[3], this.field1806[arg0], this.field1806[arg0], this.field1806[arg0], field1832[var37], field1832[var38], field1832[var39], field1833[var37], field1833[var38], field1833[var39], field1855[var37], field1855[var38], field1855[var39], var40);
            } else {
                class92.method2101(var29, var30, var31, var26, var27, var28, field1845[0], field1845[1], field1845[2], field1832[var37], field1832[var38], field1832[var39], field1833[var37], field1833[var38], field1833[var39], field1855[var37], field1855[var38], field1855[var39], var40);
                class92.method2101(var29, var31, field1844[3], var26, var28, field1827[3], field1845[0], field1845[2], field1845[3], field1832[var37], field1832[var38], field1832[var39], field1833[var37], field1833[var38], field1833[var39], field1855[var37], field1855[var38], field1855[var39], var40);
            }
        } else if (this.field1808[arg0] == -1) {
            int var41 = field1856[this.field1806[arg0]];
            class92.method2051(var29, var30, var31, var26, var27, var28, var41);
            class92.method2051(var29, var31, field1844[3], var26, var28, field1827[3], var41);
        } else {
            class92.method2049(var29, var30, var31, var26, var27, var28, field1845[0], field1845[1], field1845[2]);
            class92.method2049(var29, var31, field1844[3], var26, var28, field1827[3], field1845[0], field1845[2], field1845[3]);
        }
    }

    @ObfuscatedName("dr.o(IIIIIIII)Z")
    public final boolean method2271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
