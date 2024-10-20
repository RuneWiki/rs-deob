package deob;

@ObfuscatedName("dd")
public class class105 extends class85 {

    @ObfuscatedName("dd.j")
    public static class105 field1809 = new class105();

    @ObfuscatedName("dd.l")
    public static byte[] field1805 = new byte[1];

    @ObfuscatedName("dd.a")
    public static class105 field1806 = new class105();

    @ObfuscatedName("dd.i")
    public static byte[] field1807 = new byte[1];

    @ObfuscatedName("dd.f")
    public int field1808 = 0;

    @ObfuscatedName("dd.m")
    public int[] field1847;

    @ObfuscatedName("dd.o")
    public int[] field1810;

    @ObfuscatedName("dd.h")
    public int[] field1811;

    @ObfuscatedName("dd.n")
    public int field1812 = 0;

    @ObfuscatedName("dd.k")
    public int[] field1813;

    @ObfuscatedName("dd.r")
    public int[] field1814;

    @ObfuscatedName("dd.b")
    public int[] field1862;

    @ObfuscatedName("dd.q")
    public int[] field1816;

    @ObfuscatedName("dd.u")
    public int[] field1843;

    @ObfuscatedName("dd.g")
    public int[] field1818;

    @ObfuscatedName("dd.y")
    public byte[] field1833;

    @ObfuscatedName("dd.s")
    public byte[] field1820;

    @ObfuscatedName("dd.d")
    public byte[] field1821;

    @ObfuscatedName("dd.z")
    public short[] field1827;

    @ObfuscatedName("dd.p")
    public byte field1823 = 0;

    @ObfuscatedName("dd.w")
    public int field1824 = 0;

    @ObfuscatedName("dd.t")
    public int[] field1825;

    @ObfuscatedName("dd.c")
    public int[] field1861;

    @ObfuscatedName("dd.x")
    public int[] field1867;

    @ObfuscatedName("dd.e")
    public int[][] field1828;

    @ObfuscatedName("dd.v")
    public int[][] field1819;

    @ObfuscatedName("dd.ab")
    public boolean field1830 = false;

    @ObfuscatedName("dd.ak")
    public int field1831;

    @ObfuscatedName("dd.am")
    public int field1832;

    @ObfuscatedName("dd.aw")
    public int field1844;

    @ObfuscatedName("dd.az")
    public int field1834;

    @ObfuscatedName("dd.ac")
    public int field1835;

    @ObfuscatedName("dd.ai")
    public static boolean[] field1853 = new boolean[4700];

    @ObfuscatedName("dd.ar")
    public static boolean[] field1838 = new boolean[4700];

    @ObfuscatedName("dd.aa")
    public static int[] field1839 = new int[4700];

    @ObfuscatedName("dd.as")
    public static int[] field1840 = new int[4700];

    @ObfuscatedName("dd.ag")
    public static int[] field1841 = new int[4700];

    @ObfuscatedName("dd.af")
    public static int[] field1856 = new int[4700];

    @ObfuscatedName("dd.ao")
    public static int[] field1846 = new int[4700];

    @ObfuscatedName("dd.an")
    public static int[] field1842 = new int[4700];

    @ObfuscatedName("dd.al")
    public static int[] field1866 = new int[1600];

    @ObfuscatedName("dd.aq")
    public static int[][] field1817 = new int[1600][512];

    @ObfuscatedName("dd.ae")
    public static int[] field1815 = new int[12];

    @ObfuscatedName("dd.ap")
    public static int[][] field1849 = new int[12][2000];

    @ObfuscatedName("dd.ad")
    public static int[] field1850 = new int[2000];

    @ObfuscatedName("dd.au")
    public static int[] field1852 = new int[2000];

    @ObfuscatedName("dd.ay")
    public static int[] field1859 = new int[12];

    @ObfuscatedName("dd.av")
    public static int[] field1804 = new int[10];

    @ObfuscatedName("dd.ah")
    public static int[] field1837 = new int[10];

    @ObfuscatedName("dd.aj")
    public static int[] field1845 = new int[10];

    @ObfuscatedName("dd.bg")
    public static boolean field1829 = false;

    @ObfuscatedName("dd.bq")
    public static int field1860 = 0;

    @ObfuscatedName("dd.bl")
    public static int field1822 = 0;

    @ObfuscatedName("dd.br")
    public static int field1854 = 0;

    @ObfuscatedName("dd.bk")
    public static int[] field1863 = new int[1000];

    @ObfuscatedName("dd.be")
    public static int[] field1864 = class91.field1588;

    @ObfuscatedName("dd.bc")
    public static int[] field1865 = class91.field1591;

    @ObfuscatedName("dd.bj")
    public static int[] field1851 = class91.field1587;

    @ObfuscatedName("dd.bi")
    public static int[] field1855 = class91.field1590;

    public class105() {
    }

    public class105(class105[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1808 = 0;
        this.field1812 = 0;
        this.field1824 = 0;
        this.field1823 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class105 var8 = arg0[var7];
            if (var8 != null) {
                this.field1808 += var8.field1808;
                this.field1812 += var8.field1812;
                this.field1824 += var8.field1824;
                if (var8.field1833 == null) {
                    if (this.field1823 == -1) {
                        this.field1823 = var8.field1823;
                    }
                    if (this.field1823 != var8.field1823) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1820 != null;
                var5 |= var8.field1827 != null;
                var6 |= var8.field1821 != null;
            }
        }
        this.field1847 = new int[this.field1808];
        this.field1810 = new int[this.field1808];
        this.field1811 = new int[this.field1808];
        this.field1813 = new int[this.field1812];
        this.field1814 = new int[this.field1812];
        this.field1862 = new int[this.field1812];
        this.field1816 = new int[this.field1812];
        this.field1843 = new int[this.field1812];
        this.field1818 = new int[this.field1812];
        if (var3) {
            this.field1833 = new byte[this.field1812];
        }
        if (var4) {
            this.field1820 = new byte[this.field1812];
        }
        if (var5) {
            this.field1827 = new short[this.field1812];
        }
        if (var6) {
            this.field1821 = new byte[this.field1812];
        }
        if (this.field1824 > 0) {
            this.field1825 = new int[this.field1824];
            this.field1861 = new int[this.field1824];
            this.field1867 = new int[this.field1824];
        }
        this.field1808 = 0;
        this.field1812 = 0;
        this.field1824 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class105 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1812; var11++) {
                    this.field1813[this.field1812] = var10.field1813[var11] + this.field1808;
                    this.field1814[this.field1812] = var10.field1814[var11] + this.field1808;
                    this.field1862[this.field1812] = var10.field1862[var11] + this.field1808;
                    this.field1816[this.field1812] = var10.field1816[var11];
                    this.field1843[this.field1812] = var10.field1843[var11];
                    this.field1818[this.field1812] = var10.field1818[var11];
                    if (var3) {
                        if (var10.field1833 == null) {
                            this.field1833[this.field1812] = var10.field1823;
                        } else {
                            this.field1833[this.field1812] = var10.field1833[var11];
                        }
                    }
                    if (var4 && var10.field1820 != null) {
                        this.field1820[this.field1812] = var10.field1820[var11];
                    }
                    if (var5) {
                        if (var10.field1827 == null) {
                            this.field1827[this.field1812] = -1;
                        } else {
                            this.field1827[this.field1812] = var10.field1827[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1821 == null || var10.field1821[var11] == -1) {
                            this.field1821[this.field1812] = -1;
                        } else {
                            this.field1821[this.field1812] = (byte) (var10.field1821[var11] + this.field1824);
                        }
                    }
                    this.field1812++;
                }
                for (int var12 = 0; var12 < var10.field1824; var12++) {
                    this.field1825[this.field1824] = var10.field1825[var12] + this.field1808;
                    this.field1861[this.field1824] = var10.field1861[var12] + this.field1808;
                    this.field1867[this.field1824] = var10.field1867[var12] + this.field1808;
                    this.field1824++;
                }
                for (int var13 = 0; var13 < var10.field1808; var13++) {
                    this.field1847[this.field1808] = var10.field1847[var13];
                    this.field1810[this.field1808] = var10.field1810[var13];
                    this.field1811[this.field1808] = var10.field1811[var13];
                    this.field1808++;
                }
            }
        }
    }

    @ObfuscatedName("dd.j([[IIIIZI)Ldd;")
    public class105 method2181(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2133();
        int var7 = arg1 - this.field1844;
        int var8 = this.field1844 + arg1;
        int var9 = arg3 - this.field1844;
        int var10 = this.field1844 + arg3;
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
            var15.field1808 = this.field1808;
            var15.field1812 = this.field1812;
            var15.field1824 = this.field1824;
            var15.field1847 = this.field1847;
            var15.field1811 = this.field1811;
            var15.field1813 = this.field1813;
            var15.field1814 = this.field1814;
            var15.field1862 = this.field1862;
            var15.field1816 = this.field1816;
            var15.field1843 = this.field1843;
            var15.field1818 = this.field1818;
            var15.field1833 = this.field1833;
            var15.field1820 = this.field1820;
            var15.field1821 = this.field1821;
            var15.field1827 = this.field1827;
            var15.field1823 = this.field1823;
            var15.field1825 = this.field1825;
            var15.field1861 = this.field1861;
            var15.field1867 = this.field1867;
            var15.field1828 = this.field1828;
            var15.field1819 = this.field1819;
            var15.field1830 = this.field1830;
            var15.field1810 = new int[var15.field1808];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1808; var16++) {
                int var17 = this.field1847[var16] + arg1;
                int var18 = this.field1811[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1810[var16] = this.field1810[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1808; var26++) {
                int var27 = (-this.field1810[var26] << 16) / this.field1462;
                if (var27 < arg5) {
                    int var28 = this.field1847[var26] + arg1;
                    int var29 = this.field1811[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1810[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1810[var26];
                }
            }
        }
        var15.field1831 = 0;
        return var15;
    }

    @ObfuscatedName("dd.l(Z)Ldd;")
    public class105 method2183(boolean arg0) {
        if (!arg0 && field1805.length < this.field1812) {
            field1805 = new byte[this.field1812 + 100];
        }
        return this.method2132(arg0, field1809, field1805);
    }

    @ObfuscatedName("dd.i(Z)Ldd;")
    public class105 method2166(boolean arg0) {
        if (!arg0 && field1807.length < this.field1812) {
            field1807 = new byte[this.field1812 + 100];
        }
        return this.method2132(arg0, field1806, field1807);
    }

    @ObfuscatedName("dd.f(ZLdd;[B)Ldd;")
    public class105 method2132(boolean arg0, class105 arg1, byte[] arg2) {
        arg1.field1808 = this.field1808;
        arg1.field1812 = this.field1812;
        arg1.field1824 = this.field1824;
        if (arg1.field1847 == null || arg1.field1847.length < this.field1808) {
            arg1.field1847 = new int[this.field1808 + 100];
            arg1.field1810 = new int[this.field1808 + 100];
            arg1.field1811 = new int[this.field1808 + 100];
        }
        for (int var4 = 0; var4 < this.field1808; var4++) {
            arg1.field1847[var4] = this.field1847[var4];
            arg1.field1810[var4] = this.field1810[var4];
            arg1.field1811[var4] = this.field1811[var4];
        }
        if (arg0) {
            arg1.field1820 = this.field1820;
        } else {
            arg1.field1820 = arg2;
            if (this.field1820 == null) {
                for (int var5 = 0; var5 < this.field1812; var5++) {
                    arg1.field1820[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1812; var6++) {
                    arg1.field1820[var6] = this.field1820[var6];
                }
            }
        }
        arg1.field1813 = this.field1813;
        arg1.field1814 = this.field1814;
        arg1.field1862 = this.field1862;
        arg1.field1816 = this.field1816;
        arg1.field1843 = this.field1843;
        arg1.field1818 = this.field1818;
        arg1.field1833 = this.field1833;
        arg1.field1821 = this.field1821;
        arg1.field1827 = this.field1827;
        arg1.field1823 = this.field1823;
        arg1.field1825 = this.field1825;
        arg1.field1861 = this.field1861;
        arg1.field1867 = this.field1867;
        arg1.field1828 = this.field1828;
        arg1.field1819 = this.field1819;
        arg1.field1830 = this.field1830;
        arg1.field1831 = 0;
        return arg1;
    }

    @ObfuscatedName("dd.m()V")
    public void method2133() {
        if (this.field1831 == 1) {
            return;
        }
        this.field1831 = 1;
        this.field1462 = 0;
        this.field1832 = 0;
        this.field1844 = 0;
        for (int var1 = 0; var1 < this.field1808; var1++) {
            int var2 = this.field1847[var1];
            int var3 = this.field1810[var1];
            int var4 = this.field1811[var1];
            if (-var3 > this.field1462) {
                this.field1462 = -var3;
            }
            if (var3 > this.field1832) {
                this.field1832 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1844) {
                this.field1844 = var5;
            }
        }
        this.field1844 = (int) (Math.sqrt((double) this.field1844) + 0.99D);
        this.field1835 = (int) (Math.sqrt((double) (this.field1462 * this.field1462 + this.field1844 * this.field1844)) + 0.99D);
        this.field1834 = this.field1835 + (int) (Math.sqrt((double) (this.field1844 * this.field1844 + this.field1832 * this.field1832)) + 0.99D);
    }

    @ObfuscatedName("dd.o()V")
    public void method2129() {
        if (this.field1831 == 2) {
            return;
        }
        this.field1831 = 2;
        this.field1844 = 0;
        for (int var1 = 0; var1 < this.field1808; var1++) {
            int var2 = this.field1847[var1];
            int var3 = this.field1810[var1];
            int var4 = this.field1811[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1844) {
                this.field1844 = var5;
            }
        }
        this.field1844 = (int) (Math.sqrt((double) this.field1844) + 0.99D);
        this.field1835 = this.field1844;
        this.field1834 = this.field1844 + this.field1844;
    }

    @ObfuscatedName("dd.h()I")
    public int method2135() {
        this.method2133();
        return this.field1844;
    }

    @ObfuscatedName("dd.n(Lcs;I)V")
    public void method2186(class103 arg0, int arg1) {
        if (this.field1828 == null || arg1 == -1) {
            return;
        }
        class88 var3 = arg0.field1779[arg1];
        class102 var4 = var3.field1541;
        Statics.field1826 = 0;
        Statics.field1857 = 0;
        Statics.field1858 = 0;
        for (int var5 = 0; var5 < var3.field1542; var5++) {
            int var6 = var3.field1540[var5];
            this.method2137(var4.field1772[var6], var4.field1773[var6], var3.field1544[var5], var3.field1543[var5], var3.field1546[var5]);
        }
        this.field1831 = 0;
    }

    @ObfuscatedName("dd.k(Lcs;ILcs;I[I)V")
    public void method2136(class103 arg0, int arg1, class103 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2186(arg0, arg1);
            return;
        }
        class88 var6 = arg0.field1779[arg1];
        class88 var7 = arg2.field1779[arg3];
        class102 var8 = var6.field1541;
        Statics.field1826 = 0;
        Statics.field1857 = 0;
        Statics.field1858 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1542; var11++) {
            int var12 = var6.field1540[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1772[var12] == 0) {
                this.method2137(var8.field1772[var12], var8.field1773[var12], var6.field1544[var11], var6.field1543[var11], var6.field1546[var11]);
            }
        }
        Statics.field1826 = 0;
        Statics.field1857 = 0;
        Statics.field1858 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1542; var15++) {
            int var16 = var7.field1540[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1772[var16] == 0) {
                this.method2137(var8.field1772[var16], var8.field1773[var16], var7.field1544[var15], var7.field1543[var15], var7.field1546[var15]);
            }
        }
        this.field1831 = 0;
    }

    @ObfuscatedName("dd.b(I[IIII)V")
    public void method2137(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1826 = 0;
            Statics.field1857 = 0;
            Statics.field1858 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1828.length) {
                    int[] var10 = this.field1828[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1826 += this.field1847[var12];
                        Statics.field1857 += this.field1810[var12];
                        Statics.field1858 += this.field1811[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1826 = Statics.field1826 / var7 + arg2;
                Statics.field1857 = Statics.field1857 / var7 + arg3;
                Statics.field1858 = Statics.field1858 / var7 + arg4;
            } else {
                Statics.field1826 = arg2;
                Statics.field1857 = arg3;
                Statics.field1858 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1828.length) {
                    int[] var15 = this.field1828[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1847[var17] += arg2;
                        this.field1810[var17] += arg3;
                        this.field1811[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1828.length) {
                    int[] var20 = this.field1828[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1847[var22] -= Statics.field1826;
                        this.field1810[var22] -= Statics.field1857;
                        this.field1811[var22] -= Statics.field1858;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1864[var25];
                            int var27 = field1865[var25];
                            int var28 = this.field1847[var22] * var27 + this.field1810[var22] * var26 >> 16;
                            this.field1810[var22] = this.field1810[var22] * var27 - this.field1847[var22] * var26 >> 16;
                            this.field1847[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1864[var23];
                            int var30 = field1865[var23];
                            int var31 = this.field1810[var22] * var30 - this.field1811[var22] * var29 >> 16;
                            this.field1811[var22] = this.field1811[var22] * var30 + this.field1810[var22] * var29 >> 16;
                            this.field1810[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1864[var24];
                            int var33 = field1865[var24];
                            int var34 = this.field1847[var22] * var33 + this.field1811[var22] * var32 >> 16;
                            this.field1811[var22] = this.field1811[var22] * var33 - this.field1847[var22] * var32 >> 16;
                            this.field1847[var22] = var34;
                        }
                        this.field1847[var22] += Statics.field1826;
                        this.field1810[var22] += Statics.field1857;
                        this.field1811[var22] += Statics.field1858;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1828.length) {
                    int[] var37 = this.field1828[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1847[var39] -= Statics.field1826;
                        this.field1810[var39] -= Statics.field1857;
                        this.field1811[var39] -= Statics.field1858;
                        this.field1847[var39] = this.field1847[var39] * arg2 / 128;
                        this.field1810[var39] = this.field1810[var39] * arg3 / 128;
                        this.field1811[var39] = this.field1811[var39] * arg4 / 128;
                        this.field1847[var39] += Statics.field1826;
                        this.field1810[var39] += Statics.field1857;
                        this.field1811[var39] += Statics.field1858;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1819 != null && this.field1820 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1819.length) {
                    int[] var42 = this.field1819[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1820[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1820[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dd.q()V")
    public void method2138() {
        for (int var1 = 0; var1 < this.field1808; var1++) {
            int var2 = this.field1847[var1];
            this.field1847[var1] = this.field1811[var1];
            this.field1811[var1] = -var2;
        }
        this.field1831 = 0;
    }

    @ObfuscatedName("dd.u()V")
    public void method2139() {
        for (int var1 = 0; var1 < this.field1808; var1++) {
            this.field1847[var1] = -this.field1847[var1];
            this.field1811[var1] = -this.field1811[var1];
        }
        this.field1831 = 0;
    }

    @ObfuscatedName("dd.g()V")
    public void method2134() {
        for (int var1 = 0; var1 < this.field1808; var1++) {
            int var2 = this.field1811[var1];
            this.field1811[var1] = this.field1847[var1];
            this.field1847[var1] = -var2;
        }
        this.field1831 = 0;
    }

    @ObfuscatedName("dd.y(I)V")
    public void method2141(int arg0) {
        int var2 = field1864[arg0];
        int var3 = field1865[arg0];
        for (int var4 = 0; var4 < this.field1808; var4++) {
            int var5 = this.field1810[var4] * var3 - this.field1811[var4] * var2 >> 16;
            this.field1811[var4] = this.field1811[var4] * var3 + this.field1810[var4] * var2 >> 16;
            this.field1810[var4] = var5;
        }
        this.field1831 = 0;
    }

    @ObfuscatedName("dd.s(III)V")
    public void method2142(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1808; var4++) {
            this.field1847[var4] += arg0;
            this.field1810[var4] += arg1;
            this.field1811[var4] += arg2;
        }
        this.field1831 = 0;
    }

    @ObfuscatedName("dd.d(III)V")
    public void method2180(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1808; var4++) {
            this.field1847[var4] = this.field1847[var4] * arg0 / 128;
            this.field1810[var4] = this.field1810[var4] * arg1 / 128;
            this.field1811[var4] = this.field1811[var4] * arg2 / 128;
        }
        this.field1831 = 0;
    }

    @ObfuscatedName("dd.z(IIIIIII)V")
    public final void method2161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1866[0] = -1;
        if (this.field1831 != 2 && this.field1831 != 1) {
            this.method2129();
        }
        int var8 = Statics.field1578;
        int var9 = Statics.field1579;
        int var10 = field1864[arg0];
        int var11 = field1865[arg0];
        int var12 = field1864[arg1];
        int var13 = field1865[arg1];
        int var14 = field1864[arg2];
        int var15 = field1865[arg2];
        int var16 = field1864[arg3];
        int var17 = field1865[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1808; var19++) {
            int var20 = this.field1847[var19];
            int var21 = this.field1810[var19];
            int var22 = this.field1811[var19];
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
            field1841[var19] = var30 - var18;
            field1839[var19] = class91.field1576 * var26 / var30 + var8;
            field1840[var19] = class91.field1576 * var29 / var30 + var9;
            if (this.field1824 > 0) {
                field1856[var19] = var26;
                field1846[var19] = var29;
                field1842[var19] = var30;
            }
        }
        try {
            this.method2169(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dd.p(IIIIIIII)V")
    public final void method2145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1866[0] = -1;
        if (this.field1831 != 2 && this.field1831 != 1) {
            this.method2129();
        }
        int var9 = Statics.field1578;
        int var10 = Statics.field1579;
        int var11 = field1864[arg0];
        int var12 = field1865[arg0];
        int var13 = field1864[arg1];
        int var14 = field1865[arg1];
        int var15 = field1864[arg2];
        int var16 = field1865[arg2];
        int var17 = field1864[arg3];
        int var18 = field1865[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1808; var20++) {
            int var21 = this.field1847[var20];
            int var22 = this.field1810[var20];
            int var23 = this.field1811[var20];
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
            field1841[var20] = var31 - var19;
            field1839[var20] = class91.field1576 * var27 / arg7 + var9;
            field1840[var20] = class91.field1576 * var30 / arg7 + var10;
            if (this.field1824 > 0) {
                field1856[var20] = var27;
                field1846[var20] = var30;
                field1842[var20] = var31;
            }
        }
        try {
            this.method2169(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dd.v(IIIIIIIII)V")
    public void method1757(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1866[0] = -1;
        if (this.field1831 != 1) {
            this.method2133();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1844 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1844) * class91.field1576;
        if (var15 / var13 >= Statics.field1568) {
            return;
        }
        int var16 = (this.field1844 + var14) * class91.field1576;
        if (var16 / var13 <= Statics.field1582) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1844 * arg1 >> 16;
        int var19 = (var17 + var18) * class91.field1576;
        if (var19 / var13 <= Statics.field1592) {
            return;
        }
        int var20 = (this.field1462 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class91.field1576;
        if (var21 / var13 >= Statics.field1581) {
            return;
        }
        int var22 = (this.field1462 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1824 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1829) {
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
            int var32 = field1860 - Statics.field1578;
            int var33 = field1822 - Statics.field1579;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1830) {
                    field1863[field1854++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1578;
        int var35 = Statics.field1579;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1864[arg0];
            var37 = field1865[arg0];
        }
        for (int var38 = 0; var38 < this.field1808; var38++) {
            int var39 = this.field1847[var38];
            int var40 = this.field1810[var38];
            int var41 = this.field1811[var38];
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
            field1841[var38] = var50 - var11;
            if (var50 >= 50) {
                field1839[var38] = class91.field1576 * var46 / var50 + var34;
                field1840[var38] = class91.field1576 * var49 / var50 + var35;
            } else {
                field1839[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1856[var38] = var46;
                field1846[var38] = var49;
                field1842[var38] = var50;
            }
        }
        try {
            this.method2169(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dd.w(ZZI)V")
    public final void method2169(boolean arg0, boolean arg1, int arg2) {
        if (this.field1834 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1834; var4++) {
            field1866[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1812; var5++) {
            if (this.field1818[var5] != -2) {
                int var6 = this.field1813[var5];
                int var7 = this.field1814[var5];
                int var8 = this.field1862[var5];
                int var9 = field1839[var6];
                int var10 = field1839[var7];
                int var11 = field1839[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1856[var6];
                    int var13 = field1856[var7];
                    int var14 = field1856[var8];
                    int var15 = field1846[var6];
                    int var16 = field1846[var7];
                    int var17 = field1846[var8];
                    int var18 = field1842[var6];
                    int var19 = field1842[var7];
                    int var20 = field1842[var8];
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
                        field1838[var5] = true;
                        int var30 = (field1841[var6] + field1841[var7] + field1841[var8]) / 3 + this.field1835;
                        field1817[var30][field1866[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2157(field1860, field1822, field1840[var6], field1840[var7], field1840[var8], var9, var10, var11)) {
                        field1863[field1854++] = arg2;
                        arg1 = false;
                    }
                    if ((field1840[var8] - field1840[var7]) * (var9 - var10) - (field1840[var6] - field1840[var7]) * (var11 - var10) > 0) {
                        field1838[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1580 && var10 <= Statics.field1580 && var11 <= Statics.field1580) {
                            field1853[var5] = false;
                        } else {
                            field1853[var5] = true;
                        }
                        int var31 = (field1841[var6] + field1841[var7] + field1841[var8]) / 3 + this.field1835;
                        field1817[var31][field1866[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1833 == null) {
            for (int var32 = this.field1834 - 1; var32 >= 0; var32--) {
                int var33 = field1866[var32];
                if (var33 > 0) {
                    int[] var34 = field1817[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2158(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1815[var36] = 0;
            field1859[var36] = 0;
        }
        for (int var37 = this.field1834 - 1; var37 >= 0; var37--) {
            int var38 = field1866[var37];
            if (var38 > 0) {
                int[] var39 = field1817[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1833[var41];
                    int var43 = field1815[var42]++;
                    field1849[var42][var43] = var41;
                    if (var42 < 10) {
                        field1859[var42] += var37;
                    } else if (var42 == 10) {
                        field1850[var43] = var37;
                    } else {
                        field1852[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1815[1] > 0 || field1815[2] > 0) {
            var44 = (field1859[1] + field1859[2]) / (field1815[1] + field1815[2]);
        }
        int var45 = 0;
        if (field1815[3] > 0 || field1815[4] > 0) {
            var45 = (field1859[3] + field1859[4]) / (field1815[3] + field1815[4]);
        }
        int var46 = 0;
        if (field1815[6] > 0 || field1815[8] > 0) {
            var46 = (field1859[6] + field1859[8]) / (field1815[6] + field1815[8]);
        }
        int var47 = 0;
        int var48 = field1815[10];
        int[] var49 = field1849[10];
        int[] var50 = field1850;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1815[11];
            var49 = field1849[11];
            var50 = field1852;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2158(var49[var47++]);
                if (var47 == var48 && field1849[11] != var49) {
                    var47 = 0;
                    var48 = field1815[11];
                    var49 = field1849[11];
                    var50 = field1852;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2158(var49[var47++]);
                if (var47 == var48 && field1849[11] != var49) {
                    var47 = 0;
                    var48 = field1815[11];
                    var49 = field1849[11];
                    var50 = field1852;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2158(var49[var47++]);
                if (var47 == var48 && field1849[11] != var49) {
                    var47 = 0;
                    var48 = field1815[11];
                    var49 = field1849[11];
                    var50 = field1852;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1815[var52];
            int[] var54 = field1849[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2158(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2158(var49[var47++]);
            if (var47 == var48 && field1849[11] != var49) {
                var47 = 0;
                var49 = field1849[11];
                var48 = field1815[11];
                var50 = field1852;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dd.t(I)V")
    public final void method2158(int arg0) {
        if (field1838[arg0]) {
            this.method2149(arg0);
            return;
        }
        int var2 = this.field1813[arg0];
        int var3 = this.field1814[arg0];
        int var4 = this.field1862[arg0];
        class91.field1570 = field1853[arg0];
        if (this.field1820 == null) {
            class91.field1572 = 0;
        } else {
            class91.field1572 = this.field1820[arg0] & 0xFF;
        }
        if (this.field1827 != null && this.field1827[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1821 == null || this.field1821[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1821[arg0] & 0xFF;
                var6 = this.field1825[var5];
                var7 = this.field1861[var5];
                var8 = this.field1867[var5];
            }
            if (this.field1818[arg0] == -1) {
                class91.method1957(field1840[var2], field1840[var3], field1840[var4], field1839[var2], field1839[var3], field1839[var4], this.field1816[arg0], this.field1816[arg0], this.field1816[arg0], field1856[var6], field1856[var7], field1856[var8], field1846[var6], field1846[var7], field1846[var8], field1842[var6], field1842[var7], field1842[var8], this.field1827[arg0]);
            } else {
                class91.method1957(field1840[var2], field1840[var3], field1840[var4], field1839[var2], field1839[var3], field1839[var4], this.field1816[arg0], this.field1843[arg0], this.field1818[arg0], field1856[var6], field1856[var7], field1856[var8], field1846[var6], field1846[var7], field1846[var8], field1842[var6], field1842[var7], field1842[var8], this.field1827[arg0]);
            }
        } else if (this.field1818[arg0] == -1) {
            class91.method1955(field1840[var2], field1840[var3], field1840[var4], field1839[var2], field1839[var3], field1839[var4], field1851[this.field1816[arg0]]);
        } else {
            class91.method1953(field1840[var2], field1840[var3], field1840[var4], field1839[var2], field1839[var3], field1839[var4], this.field1816[arg0], this.field1843[arg0], this.field1818[arg0]);
        }
    }

    @ObfuscatedName("dd.c(I)V")
    public final void method2149(int arg0) {
        int var2 = Statics.field1578;
        int var3 = Statics.field1579;
        int var4 = 0;
        int var5 = this.field1813[arg0];
        int var6 = this.field1814[arg0];
        int var7 = this.field1862[arg0];
        int var8 = field1842[var5];
        int var9 = field1842[var6];
        int var10 = field1842[var7];
        if (this.field1820 == null) {
            class91.field1572 = 0;
        } else {
            class91.field1572 = this.field1820[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1804[var4] = field1839[var5];
            field1837[var4] = field1840[var5];
            field1845[var4++] = this.field1816[arg0];
        } else {
            int var11 = field1856[var5];
            int var12 = field1846[var5];
            int var13 = this.field1816[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1855[var10 - var8];
                field1804[var4] = (((field1856[var7] - var11) * var14 >> 16) + var11) * class91.field1576 / 50 + var2;
                field1837[var4] = (((field1846[var7] - var12) * var14 >> 16) + var12) * class91.field1576 / 50 + var3;
                field1845[var4++] = ((this.field1818[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1855[var9 - var8];
                field1804[var4] = (((field1856[var6] - var11) * var15 >> 16) + var11) * class91.field1576 / 50 + var2;
                field1837[var4] = (((field1846[var6] - var12) * var15 >> 16) + var12) * class91.field1576 / 50 + var3;
                field1845[var4++] = ((this.field1843[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1804[var4] = field1839[var6];
            field1837[var4] = field1840[var6];
            field1845[var4++] = this.field1843[arg0];
        } else {
            int var16 = field1856[var6];
            int var17 = field1846[var6];
            int var18 = this.field1843[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1855[var8 - var9];
                field1804[var4] = (((field1856[var5] - var16) * var19 >> 16) + var16) * class91.field1576 / 50 + var2;
                field1837[var4] = (((field1846[var5] - var17) * var19 >> 16) + var17) * class91.field1576 / 50 + var3;
                field1845[var4++] = ((this.field1816[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1855[var10 - var9];
                field1804[var4] = (((field1856[var7] - var16) * var20 >> 16) + var16) * class91.field1576 / 50 + var2;
                field1837[var4] = (((field1846[var7] - var17) * var20 >> 16) + var17) * class91.field1576 / 50 + var3;
                field1845[var4++] = ((this.field1818[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1804[var4] = field1839[var7];
            field1837[var4] = field1840[var7];
            field1845[var4++] = this.field1818[arg0];
        } else {
            int var21 = field1856[var7];
            int var22 = field1846[var7];
            int var23 = this.field1818[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1855[var9 - var10];
                field1804[var4] = (((field1856[var6] - var21) * var24 >> 16) + var21) * class91.field1576 / 50 + var2;
                field1837[var4] = (((field1846[var6] - var22) * var24 >> 16) + var22) * class91.field1576 / 50 + var3;
                field1845[var4++] = ((this.field1843[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1855[var8 - var10];
                field1804[var4] = (((field1856[var5] - var21) * var25 >> 16) + var21) * class91.field1576 / 50 + var2;
                field1837[var4] = (((field1846[var5] - var22) * var25 >> 16) + var22) * class91.field1576 / 50 + var3;
                field1845[var4++] = ((this.field1816[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1804[0];
        int var27 = field1804[1];
        int var28 = field1804[2];
        int var29 = field1837[0];
        int var30 = field1837[1];
        int var31 = field1837[2];
        class91.field1570 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1580 || var27 > Statics.field1580 || var28 > Statics.field1580) {
                class91.field1570 = true;
            }
            if (this.field1827 != null && this.field1827[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1821 == null || this.field1821[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1821[arg0] & 0xFF;
                    var33 = this.field1825[var32];
                    var34 = this.field1861[var32];
                    var35 = this.field1867[var32];
                }
                if (this.field1818[arg0] == -1) {
                    class91.method1957(var29, var30, var31, var26, var27, var28, this.field1816[arg0], this.field1816[arg0], this.field1816[arg0], field1856[var33], field1856[var34], field1856[var35], field1846[var33], field1846[var34], field1846[var35], field1842[var33], field1842[var34], field1842[var35], this.field1827[arg0]);
                } else {
                    class91.method1957(var29, var30, var31, var26, var27, var28, field1845[0], field1845[1], field1845[2], field1856[var33], field1856[var34], field1856[var35], field1846[var33], field1846[var34], field1846[var35], field1842[var33], field1842[var34], field1842[var35], this.field1827[arg0]);
                }
            } else if (this.field1818[arg0] == -1) {
                class91.method1955(var29, var30, var31, var26, var27, var28, field1851[this.field1816[arg0]]);
            } else {
                class91.method1953(var29, var30, var31, var26, var27, var28, field1845[0], field1845[1], field1845[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1580 || var27 > Statics.field1580 || var28 > Statics.field1580 || field1804[3] < 0 || field1804[3] > Statics.field1580) {
            class91.field1570 = true;
        }
        if (this.field1827 != null && this.field1827[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1821 == null || this.field1821[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1821[arg0] & 0xFF;
                var37 = this.field1825[var36];
                var38 = this.field1861[var36];
                var39 = this.field1867[var36];
            }
            short var40 = this.field1827[arg0];
            if (this.field1818[arg0] == -1) {
                class91.method1957(var29, var30, var31, var26, var27, var28, this.field1816[arg0], this.field1816[arg0], this.field1816[arg0], field1856[var37], field1856[var38], field1856[var39], field1846[var37], field1846[var38], field1846[var39], field1842[var37], field1842[var38], field1842[var39], var40);
                class91.method1957(var29, var31, field1837[3], var26, var28, field1804[3], this.field1816[arg0], this.field1816[arg0], this.field1816[arg0], field1856[var37], field1856[var38], field1856[var39], field1846[var37], field1846[var38], field1846[var39], field1842[var37], field1842[var38], field1842[var39], var40);
            } else {
                class91.method1957(var29, var30, var31, var26, var27, var28, field1845[0], field1845[1], field1845[2], field1856[var37], field1856[var38], field1856[var39], field1846[var37], field1846[var38], field1846[var39], field1842[var37], field1842[var38], field1842[var39], var40);
                class91.method1957(var29, var31, field1837[3], var26, var28, field1804[3], field1845[0], field1845[2], field1845[3], field1856[var37], field1856[var38], field1856[var39], field1846[var37], field1846[var38], field1846[var39], field1842[var37], field1842[var38], field1842[var39], var40);
            }
        } else if (this.field1818[arg0] == -1) {
            int var41 = field1851[this.field1816[arg0]];
            class91.method1955(var29, var30, var31, var26, var27, var28, var41);
            class91.method1955(var29, var31, field1837[3], var26, var28, field1804[3], var41);
        } else {
            class91.method1953(var29, var30, var31, var26, var27, var28, field1845[0], field1845[1], field1845[2]);
            class91.method1953(var29, var31, field1837[3], var26, var28, field1804[3], field1845[0], field1845[2], field1845[3]);
        }
    }

    @ObfuscatedName("dd.x(IIIIIIII)Z")
    public final boolean method2157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
