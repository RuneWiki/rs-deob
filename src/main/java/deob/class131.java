package deob;

@ObfuscatedName("en")
public class class131 extends class139 {

    @ObfuscatedName("en.p")
    public static class131 field1841 = new class131();

    @ObfuscatedName("en.i")
    public static byte[] field1832 = new byte[1];

    @ObfuscatedName("en.w")
    public static class131 field1802 = new class131();

    @ObfuscatedName("en.s")
    public static byte[] field1803 = new byte[1];

    @ObfuscatedName("en.j")
    public int field1868 = 0;

    @ObfuscatedName("en.a")
    public int[] field1805;

    @ObfuscatedName("en.t")
    public int[] field1801;

    @ObfuscatedName("en.r")
    public int[] field1807;

    @ObfuscatedName("en.m")
    public int field1808 = 0;

    @ObfuscatedName("en.h")
    public int[] field1809;

    @ObfuscatedName("en.o")
    public int[] field1860;

    @ObfuscatedName("en.x")
    public int[] field1811;

    @ObfuscatedName("en.q")
    public int[] field1848;

    @ObfuscatedName("en.v")
    public int[] field1845;

    @ObfuscatedName("en.n")
    public int[] field1814;

    @ObfuscatedName("en.y")
    public byte[] field1800;

    @ObfuscatedName("en.d")
    public byte[] field1816;

    @ObfuscatedName("en.l")
    public byte[] field1817;

    @ObfuscatedName("en.f")
    public short[] field1818;

    @ObfuscatedName("en.k")
    public byte field1812 = 0;

    @ObfuscatedName("en.e")
    public int field1820 = 0;

    @ObfuscatedName("en.u")
    public int[] field1821;

    @ObfuscatedName("en.g")
    public int[] field1822;

    @ObfuscatedName("en.z")
    public int[] field1823;

    @ObfuscatedName("en.b")
    public int[][] field1824;

    @ObfuscatedName("en.c")
    public int[][] field1825;

    @ObfuscatedName("en.aa")
    public boolean field1826 = false;

    @ObfuscatedName("en.ap")
    public int field1827;

    @ObfuscatedName("en.ao")
    public int field1830;

    @ObfuscatedName("en.ar")
    public int field1829;

    @ObfuscatedName("en.ay")
    public int field1867;

    @ObfuscatedName("en.ax")
    public int field1831;

    @ObfuscatedName("en.ae")
    public int field1844;

    @ObfuscatedName("en.ah")
    public int field1833;

    @ObfuscatedName("en.ai")
    public int field1834;

    @ObfuscatedName("en.au")
    public int field1835 = -1;

    @ObfuscatedName("en.am")
    public int field1804 = -1;

    @ObfuscatedName("en.af")
    public int field1837 = -1;

    @ObfuscatedName("en.ag")
    public static boolean[] field1850 = new boolean[4700];

    @ObfuscatedName("en.av")
    public static boolean[] field1840 = new boolean[4700];

    @ObfuscatedName("en.aw")
    public static int[] field1851 = new int[4700];

    @ObfuscatedName("en.ad")
    public static int[] field1842 = new int[4700];

    @ObfuscatedName("en.ab")
    public static int[] field1843 = new int[4700];

    @ObfuscatedName("en.aq")
    public static int[] field1815 = new int[4700];

    @ObfuscatedName("en.ac")
    public static int[] field1854 = new int[4700];

    @ObfuscatedName("en.ak")
    public static int[] field1846 = new int[4700];

    @ObfuscatedName("en.as")
    public static int[] field1839 = new int[1600];

    @ObfuscatedName("en.at")
    public static int[][] field1849 = new int[1600][512];

    @ObfuscatedName("en.aj")
    public static int[] field1865 = new int[12];

    @ObfuscatedName("en.al")
    public static int[][] field1836 = new int[12][2000];

    @ObfuscatedName("en.bw")
    public static int[] field1852 = new int[2000];

    @ObfuscatedName("en.bt")
    public static int[] field1853 = new int[2000];

    @ObfuscatedName("en.by")
    public static int[] field1813 = new int[12];

    @ObfuscatedName("en.bq")
    public static int[] field1855 = new int[10];

    @ObfuscatedName("en.bf")
    public static int[] field1856 = new int[10];

    @ObfuscatedName("en.bp")
    public static int[] field1857 = new int[10];

    @ObfuscatedName("en.bg")
    public static boolean field1819 = true;

    @ObfuscatedName("en.br")
    public static int[] field1864 = class134.field1889;

    @ObfuscatedName("en.bs")
    public static int[] field1828 = class134.field1911;

    @ObfuscatedName("en.be")
    public static int[] field1866 = class134.field1906;

    @ObfuscatedName("en.bk")
    public static int[] field1861 = class134.field1909;

    public class131() {
    }

    public class131(class131[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1868 = 0;
        this.field1808 = 0;
        this.field1820 = 0;
        this.field1812 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class131 var8 = arg0[var7];
            if (var8 != null) {
                this.field1868 += var8.field1868;
                this.field1808 += var8.field1808;
                this.field1820 += var8.field1820;
                if (var8.field1800 == null) {
                    if (this.field1812 == -1) {
                        this.field1812 = var8.field1812;
                    }
                    if (this.field1812 != var8.field1812) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1816 != null;
                var5 |= var8.field1818 != null;
                var6 |= var8.field1817 != null;
            }
        }
        this.field1805 = new int[this.field1868];
        this.field1801 = new int[this.field1868];
        this.field1807 = new int[this.field1868];
        this.field1809 = new int[this.field1808];
        this.field1860 = new int[this.field1808];
        this.field1811 = new int[this.field1808];
        this.field1848 = new int[this.field1808];
        this.field1845 = new int[this.field1808];
        this.field1814 = new int[this.field1808];
        if (var3) {
            this.field1800 = new byte[this.field1808];
        }
        if (var4) {
            this.field1816 = new byte[this.field1808];
        }
        if (var5) {
            this.field1818 = new short[this.field1808];
        }
        if (var6) {
            this.field1817 = new byte[this.field1808];
        }
        if (this.field1820 > 0) {
            this.field1821 = new int[this.field1820];
            this.field1822 = new int[this.field1820];
            this.field1823 = new int[this.field1820];
        }
        this.field1868 = 0;
        this.field1808 = 0;
        this.field1820 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class131 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1808; var11++) {
                    this.field1809[this.field1808] = var10.field1809[var11] + this.field1868;
                    this.field1860[this.field1808] = var10.field1860[var11] + this.field1868;
                    this.field1811[this.field1808] = var10.field1811[var11] + this.field1868;
                    this.field1848[this.field1808] = var10.field1848[var11];
                    this.field1845[this.field1808] = var10.field1845[var11];
                    this.field1814[this.field1808] = var10.field1814[var11];
                    if (var3) {
                        if (var10.field1800 == null) {
                            this.field1800[this.field1808] = var10.field1812;
                        } else {
                            this.field1800[this.field1808] = var10.field1800[var11];
                        }
                    }
                    if (var4 && var10.field1816 != null) {
                        this.field1816[this.field1808] = var10.field1816[var11];
                    }
                    if (var5) {
                        if (var10.field1818 == null) {
                            this.field1818[this.field1808] = -1;
                        } else {
                            this.field1818[this.field1808] = var10.field1818[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1817 == null || var10.field1817[var11] == -1) {
                            this.field1817[this.field1808] = -1;
                        } else {
                            this.field1817[this.field1808] = (byte) (var10.field1817[var11] + this.field1820);
                        }
                    }
                    this.field1808++;
                }
                for (int var12 = 0; var12 < var10.field1820; var12++) {
                    this.field1821[this.field1820] = var10.field1821[var12] + this.field1868;
                    this.field1822[this.field1820] = var10.field1822[var12] + this.field1868;
                    this.field1823[this.field1820] = var10.field1823[var12] + this.field1868;
                    this.field1820++;
                }
                for (int var13 = 0; var13 < var10.field1868; var13++) {
                    this.field1805[this.field1868] = var10.field1805[var13];
                    this.field1801[this.field1868] = var10.field1801[var13];
                    this.field1807[this.field1868] = var10.field1807[var13];
                    this.field1868++;
                }
            }
        }
    }

    @ObfuscatedName("en.p([[IIIIZI)Len;")
    public class131 method2471(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2484();
        int var7 = arg1 - this.field1829;
        int var8 = this.field1829 + arg1;
        int var9 = arg3 - this.field1829;
        int var10 = this.field1829 + arg3;
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
            var15.field1868 = this.field1868;
            var15.field1808 = this.field1808;
            var15.field1820 = this.field1820;
            var15.field1805 = this.field1805;
            var15.field1807 = this.field1807;
            var15.field1809 = this.field1809;
            var15.field1860 = this.field1860;
            var15.field1811 = this.field1811;
            var15.field1848 = this.field1848;
            var15.field1845 = this.field1845;
            var15.field1814 = this.field1814;
            var15.field1800 = this.field1800;
            var15.field1816 = this.field1816;
            var15.field1817 = this.field1817;
            var15.field1818 = this.field1818;
            var15.field1812 = this.field1812;
            var15.field1821 = this.field1821;
            var15.field1822 = this.field1822;
            var15.field1823 = this.field1823;
            var15.field1824 = this.field1824;
            var15.field1825 = this.field1825;
            var15.field1826 = this.field1826;
            var15.field1801 = new int[var15.field1868];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1868; var16++) {
                int var17 = this.field1805[var16] + arg1;
                int var18 = this.field1807[var16] + arg3;
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
            for (int var26 = 0; var26 < var15.field1868; var26++) {
                int var27 = (-this.field1801[var26] << 16) / this.field1998;
                if (var27 < arg5) {
                    int var28 = this.field1805[var26] + arg1;
                    int var29 = this.field1807[var26] + arg3;
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
        var15.method2468();
        return var15;
    }

    @ObfuscatedName("en.i(Z)Len;")
    public class131 method2462(boolean arg0) {
        if (!arg0 && field1832.length < this.field1808) {
            field1832 = new byte[this.field1808 + 100];
        }
        return this.method2521(arg0, field1841, field1832);
    }

    @ObfuscatedName("en.w(Z)Len;")
    public class131 method2486(boolean arg0) {
        if (!arg0 && field1803.length < this.field1808) {
            field1803 = new byte[this.field1808 + 100];
        }
        return this.method2521(arg0, field1802, field1803);
    }

    @ObfuscatedName("en.s(ZLen;[B)Len;")
    public class131 method2521(boolean arg0, class131 arg1, byte[] arg2) {
        arg1.field1868 = this.field1868;
        arg1.field1808 = this.field1808;
        arg1.field1820 = this.field1820;
        if (arg1.field1805 == null || arg1.field1805.length < this.field1868) {
            arg1.field1805 = new int[this.field1868 + 100];
            arg1.field1801 = new int[this.field1868 + 100];
            arg1.field1807 = new int[this.field1868 + 100];
        }
        for (int var4 = 0; var4 < this.field1868; var4++) {
            arg1.field1805[var4] = this.field1805[var4];
            arg1.field1801[var4] = this.field1801[var4];
            arg1.field1807[var4] = this.field1807[var4];
        }
        if (arg0) {
            arg1.field1816 = this.field1816;
        } else {
            arg1.field1816 = arg2;
            if (this.field1816 == null) {
                for (int var5 = 0; var5 < this.field1808; var5++) {
                    arg1.field1816[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1808; var6++) {
                    arg1.field1816[var6] = this.field1816[var6];
                }
            }
        }
        arg1.field1809 = this.field1809;
        arg1.field1860 = this.field1860;
        arg1.field1811 = this.field1811;
        arg1.field1848 = this.field1848;
        arg1.field1845 = this.field1845;
        arg1.field1814 = this.field1814;
        arg1.field1800 = this.field1800;
        arg1.field1817 = this.field1817;
        arg1.field1818 = this.field1818;
        arg1.field1812 = this.field1812;
        arg1.field1821 = this.field1821;
        arg1.field1822 = this.field1822;
        arg1.field1823 = this.field1823;
        arg1.field1824 = this.field1824;
        arg1.field1825 = this.field1825;
        arg1.field1826 = this.field1826;
        arg1.method2468();
        return arg1;
    }

    @ObfuscatedName("en.j(I)V")
    public void method2464(int arg0) {
        if (this.field1835 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1828[arg0];
        int var9 = field1864[arg0];
        for (int var10 = 0; var10 < this.field1868; var10++) {
            int var11 = class134.method2582(this.field1805[var10], this.field1807[var10], var8, var9);
            int var12 = this.field1801[var10];
            int var13 = class134.method2565(this.field1805[var10], this.field1807[var10], var8, var9);
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
        this.field1844 = (var2 + var5) / 2;
        this.field1833 = (var3 + var6) / 2;
        this.field1834 = (var4 + var7) / 2;
        this.field1835 = (var5 - var2 + 1) / 2;
        this.field1804 = (var6 - var3 + 1) / 2;
        this.field1837 = (var7 - var4 + 1) / 2;
        if (this.field1835 < 32) {
            this.field1835 = 32;
        }
        if (this.field1837 < 32) {
            this.field1837 = 32;
        }
        if (this.field1826) {
            this.field1835 += 8;
            this.field1837 += 8;
        }
    }

    @ObfuscatedName("en.a()V")
    public void method2484() {
        if (this.field1827 == 1) {
            return;
        }
        this.field1827 = 1;
        this.field1998 = 0;
        this.field1830 = 0;
        this.field1829 = 0;
        for (int var1 = 0; var1 < this.field1868; var1++) {
            int var2 = this.field1805[var1];
            int var3 = this.field1801[var1];
            int var4 = this.field1807[var1];
            if (-var3 > this.field1998) {
                this.field1998 = -var3;
            }
            if (var3 > this.field1830) {
                this.field1830 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1829) {
                this.field1829 = var5;
            }
        }
        this.field1829 = (int) (Math.sqrt((double) this.field1829) + 0.99D);
        this.field1831 = (int) (Math.sqrt((double) (this.field1998 * this.field1998 + this.field1829 * this.field1829)) + 0.99D);
        this.field1867 = this.field1831 + (int) (Math.sqrt((double) (this.field1830 * this.field1830 + this.field1829 * this.field1829)) + 0.99D);
    }

    @ObfuscatedName("en.t()V")
    public void method2466() {
        if (this.field1827 == 2) {
            return;
        }
        this.field1827 = 2;
        this.field1829 = 0;
        for (int var1 = 0; var1 < this.field1868; var1++) {
            int var2 = this.field1805[var1];
            int var3 = this.field1801[var1];
            int var4 = this.field1807[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1829) {
                this.field1829 = var5;
            }
        }
        this.field1829 = (int) (Math.sqrt((double) this.field1829) + 0.99D);
        this.field1831 = this.field1829;
        this.field1867 = this.field1829 + this.field1829;
    }

    @ObfuscatedName("en.r()I")
    public int method2467() {
        this.method2484();
        return this.field1829;
    }

    @ObfuscatedName("en.h()V")
    public void method2468() {
        this.field1827 = 0;
        this.field1835 = -1;
    }

    @ObfuscatedName("en.o(Leq;I)V")
    public void method2469(class142 arg0, int arg1) {
        if (this.field1824 == null || arg1 == -1) {
            return;
        }
        class129 var3 = arg0.field2017[arg1];
        class136 var4 = var3.field1764;
        Statics.field1858 = 0;
        Statics.field1859 = 0;
        Statics.field1810 = 0;
        for (int var5 = 0; var5 < var3.field1774; var5++) {
            int var6 = var3.field1770[var5];
            this.method2504(var4.field1929[var6], var4.field1927[var6], var3.field1771[var5], var3.field1772[var5], var3.field1773[var5]);
        }
        this.method2468();
    }

    @ObfuscatedName("en.x(Leq;ILeq;I[I)V")
    public void method2522(class142 arg0, int arg1, class142 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2469(arg0, arg1);
            return;
        }
        class129 var6 = arg0.field2017[arg1];
        class129 var7 = arg2.field2017[arg3];
        class136 var8 = var6.field1764;
        Statics.field1858 = 0;
        Statics.field1859 = 0;
        Statics.field1810 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1774; var11++) {
            int var12 = var6.field1770[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1929[var12] == 0) {
                this.method2504(var8.field1929[var12], var8.field1927[var12], var6.field1771[var11], var6.field1772[var11], var6.field1773[var11]);
            }
        }
        Statics.field1858 = 0;
        Statics.field1859 = 0;
        Statics.field1810 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1774; var15++) {
            int var16 = var7.field1770[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1929[var16] == 0) {
                this.method2504(var8.field1929[var16], var8.field1927[var16], var7.field1771[var15], var7.field1772[var15], var7.field1773[var15]);
            }
        }
        this.method2468();
    }

    @ObfuscatedName("en.q(I[IIII)V")
    public void method2504(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1858 = 0;
            Statics.field1859 = 0;
            Statics.field1810 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1824.length) {
                    int[] var10 = this.field1824[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1858 += this.field1805[var12];
                        Statics.field1859 += this.field1801[var12];
                        Statics.field1810 += this.field1807[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1858 = Statics.field1858 / var7 + arg2;
                Statics.field1859 = Statics.field1859 / var7 + arg3;
                Statics.field1810 = Statics.field1810 / var7 + arg4;
            } else {
                Statics.field1858 = arg2;
                Statics.field1859 = arg3;
                Statics.field1810 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1824.length) {
                    int[] var15 = this.field1824[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1805[var17] += arg2;
                        this.field1801[var17] += arg3;
                        this.field1807[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1824.length) {
                    int[] var20 = this.field1824[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1805[var22] -= Statics.field1858;
                        this.field1801[var22] -= Statics.field1859;
                        this.field1807[var22] -= Statics.field1810;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1864[var25];
                            int var27 = field1828[var25];
                            int var28 = this.field1805[var22] * var27 + this.field1801[var22] * var26 >> 16;
                            this.field1801[var22] = this.field1801[var22] * var27 - this.field1805[var22] * var26 >> 16;
                            this.field1805[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1864[var23];
                            int var30 = field1828[var23];
                            int var31 = this.field1801[var22] * var30 - this.field1807[var22] * var29 >> 16;
                            this.field1807[var22] = this.field1807[var22] * var30 + this.field1801[var22] * var29 >> 16;
                            this.field1801[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1864[var24];
                            int var33 = field1828[var24];
                            int var34 = this.field1807[var22] * var32 + this.field1805[var22] * var33 >> 16;
                            this.field1807[var22] = this.field1807[var22] * var33 - this.field1805[var22] * var32 >> 16;
                            this.field1805[var22] = var34;
                        }
                        this.field1805[var22] += Statics.field1858;
                        this.field1801[var22] += Statics.field1859;
                        this.field1807[var22] += Statics.field1810;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1824.length) {
                    int[] var37 = this.field1824[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1805[var39] -= Statics.field1858;
                        this.field1801[var39] -= Statics.field1859;
                        this.field1807[var39] -= Statics.field1810;
                        this.field1805[var39] = this.field1805[var39] * arg2 / 128;
                        this.field1801[var39] = this.field1801[var39] * arg3 / 128;
                        this.field1807[var39] = this.field1807[var39] * arg4 / 128;
                        this.field1805[var39] += Statics.field1858;
                        this.field1801[var39] += Statics.field1859;
                        this.field1807[var39] += Statics.field1810;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1825 != null && this.field1816 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1825.length) {
                    int[] var42 = this.field1825[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1816[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1816[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("en.d()V")
    public void method2472() {
        for (int var1 = 0; var1 < this.field1868; var1++) {
            int var2 = this.field1805[var1];
            this.field1805[var1] = this.field1807[var1];
            this.field1807[var1] = -var2;
        }
        this.method2468();
    }

    @ObfuscatedName("en.l()V")
    public void method2494() {
        for (int var1 = 0; var1 < this.field1868; var1++) {
            this.field1805[var1] = -this.field1805[var1];
            this.field1807[var1] = -this.field1807[var1];
        }
        this.method2468();
    }

    @ObfuscatedName("en.f()V")
    public void method2474() {
        for (int var1 = 0; var1 < this.field1868; var1++) {
            int var2 = this.field1807[var1];
            this.field1807[var1] = this.field1805[var1];
            this.field1805[var1] = -var2;
        }
        this.method2468();
    }

    @ObfuscatedName("en.k(I)V")
    public void method2475(int arg0) {
        int var2 = field1864[arg0];
        int var3 = field1828[arg0];
        for (int var4 = 0; var4 < this.field1868; var4++) {
            int var5 = this.field1801[var4] * var3 - this.field1807[var4] * var2 >> 16;
            this.field1807[var4] = this.field1807[var4] * var3 + this.field1801[var4] * var2 >> 16;
            this.field1801[var4] = var5;
        }
        this.method2468();
    }

    @ObfuscatedName("en.e(III)V")
    public void method2476(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1868; var4++) {
            this.field1805[var4] += arg0;
            this.field1801[var4] += arg1;
            this.field1807[var4] += arg2;
        }
        this.method2468();
    }

    @ObfuscatedName("en.u(III)V")
    public void method2491(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1868; var4++) {
            this.field1805[var4] = this.field1805[var4] * arg0 / 128;
            this.field1801[var4] = this.field1801[var4] * arg1 / 128;
            this.field1807[var4] = this.field1807[var4] * arg2 / 128;
        }
        this.method2468();
    }

    @ObfuscatedName("en.z(IIIIIII)V")
    public final void method2477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1839[0] = -1;
        if (this.field1827 != 2 && this.field1827 != 1) {
            this.method2466();
        }
        int var8 = Statics.field1907;
        int var9 = Statics.field1898;
        int var10 = field1864[arg0];
        int var11 = field1828[arg0];
        int var12 = field1864[arg1];
        int var13 = field1828[arg1];
        int var14 = field1864[arg2];
        int var15 = field1828[arg2];
        int var16 = field1864[arg3];
        int var17 = field1828[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1868; var19++) {
            int var20 = this.field1805[var19];
            int var21 = this.field1801[var19];
            int var22 = this.field1807[var19];
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
            field1843[var19] = var30 - var18;
            field1851[var19] = class134.field1896 * var26 / var30 + var8;
            field1842[var19] = class134.field1896 * var29 / var30 + var9;
            if (this.field1820 > 0) {
                field1815[var19] = var26;
                field1854[var19] = var29;
                field1846[var19] = var30;
            }
        }
        try {
            this.method2480(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("en.b(IIIIIIII)V")
    public final void method2478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1839[0] = -1;
        if (this.field1827 != 2 && this.field1827 != 1) {
            this.method2466();
        }
        int var9 = Statics.field1907;
        int var10 = Statics.field1898;
        int var11 = field1864[arg0];
        int var12 = field1828[arg0];
        int var13 = field1864[arg1];
        int var14 = field1828[arg1];
        int var15 = field1864[arg2];
        int var16 = field1828[arg2];
        int var17 = field1864[arg3];
        int var18 = field1828[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1868; var20++) {
            int var21 = this.field1805[var20];
            int var22 = this.field1801[var20];
            int var23 = this.field1807[var20];
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
            field1843[var20] = var31 - var19;
            field1851[var20] = class134.field1896 * var27 / arg7 + var9;
            field1842[var20] = class134.field1896 * var30 / arg7 + var10;
            if (this.field1820 > 0) {
                field1815[var20] = var27;
                field1854[var20] = var30;
                field1846[var20] = var31;
            }
        }
        try {
            this.method2480(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("en.cg(IIIIIIIII)V")
    public void method2461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1839[0] = -1;
        if (this.field1827 != 1) {
            this.method2484();
        }
        this.method2464(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1829 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1829) * class134.field1896;
        if (var15 / var13 >= Statics.field1899) {
            return;
        }
        int var16 = (this.field1829 + var14) * class134.field1896;
        if (var16 / var13 <= Statics.field1901) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1829 * arg1 >> 16;
        int var19 = (var17 + var18) * class134.field1896;
        if (var19 / var13 <= Statics.field1887) {
            return;
        }
        int var20 = (this.field1998 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class134.field1896;
        if (var21 / var13 >= Statics.field1904) {
            return;
        }
        int var22 = (this.field1998 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1820 > 0;
        int var26 = class132.method623();
        int var27 = class132.method61();
        boolean var28 = class132.field1877;
        if (class8.field227 && arg8 > 0) {
            if (class132.method133(this, arg5, arg6, arg7)) {
                class8.field225.method3533(new class11(this, arg5, arg6, arg7, -65281));
            } else if (class8.field223 == class12.field256) {
                class8.field225.method3533(new class11(this, arg5, arg6, arg7, -16776961));
            }
        }
        if (class8.field221 && arg8 > 0) {
            int var31 = var11 - var12;
            if (var31 <= 50) {
                var31 = 50;
            }
            int var36;
            int var37;
            if (var14 > 0) {
                var36 = var15 / var13;
                var37 = var16 / var31;
            } else {
                var37 = var16 / var13;
                var36 = var15 / var31;
            }
            int var38;
            int var39;
            if (var17 > 0) {
                var38 = var21 / var13;
                var39 = var19 / var31;
            } else {
                var39 = var19 / var13;
                var38 = var21 / var31;
            }
            int var40 = -8355840;
            int var41 = var26 - Statics.field1907;
            int var42 = var27 - Statics.field1898;
            if (var41 > var36 && var41 < var37 && var42 > var38 && var42 < var39) {
                var40 = -256;
            }
            int var43 = Statics.field1907 + var36;
            int var44 = Statics.field1898 + var38;
            int var45 = Statics.field1907 + var37;
            int var46 = Statics.field1898 + var39;
            class8.field225.method3533(new class9(var43, var44, var45, var46, var40));
        }
        boolean var47 = false;
        if (arg8 > 0 && var28) {
            boolean var48 = false;
            if (field1819) {
                var48 = class132.method133(this, arg5, arg6, arg7);
            } else {
                int var49 = var11 - var12;
                if (var49 <= 50) {
                    var49 = 50;
                }
                int var50;
                int var51;
                if (var14 > 0) {
                    var50 = var15 / var13;
                    var51 = var16 / var49;
                } else {
                    var51 = var16 / var13;
                    var50 = var15 / var49;
                }
                int var52;
                int var53;
                if (var17 > 0) {
                    var52 = var21 / var13;
                    var53 = var19 / var49;
                } else {
                    var53 = var19 / var13;
                    var52 = var21 / var49;
                }
                int var54 = var26 - Statics.field1907;
                int var55 = var27 - Statics.field1898;
                if (var54 > var50 && var54 < var51 && var55 > var52 && var55 < var53) {
                    var48 = true;
                }
            }
            if (var48) {
                if (this.field1826) {
                    class132.field1875[++class132.field1878 - 1] = arg8;
                } else {
                    var47 = true;
                }
            }
        }
        int var57 = Statics.field1907;
        int var58 = Statics.field1898;
        int var59 = 0;
        int var60 = 0;
        if (arg0 != 0) {
            var59 = field1864[arg0];
            var60 = field1828[arg0];
        }
        for (int var61 = 0; var61 < this.field1868; var61++) {
            int var62 = this.field1805[var61];
            int var63 = this.field1801[var61];
            int var64 = this.field1807[var61];
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
            field1843[var61] = var73 - var11;
            if (var73 >= 50) {
                field1851[var61] = class134.field1896 * var69 / var73 + var57;
                field1842[var61] = class134.field1896 * var72 / var73 + var58;
            } else {
                field1851[var61] = -5000;
                var23 = true;
            }
            if (var25) {
                field1815[var61] = var69;
                field1854[var61] = var72;
                field1846[var61] = var73;
            }
        }
        try {
            this.method2480(var23, var47, this.field1826, arg8);
        } catch (Exception var76) {
        }
    }

    @ObfuscatedName("en.c(ZZZI)V")
    public final void method2480(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1867 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1867; var5++) {
            field1839[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field220 && arg1) {
            class8.method482(this, var6);
        }
        for (int var7 = 0; var7 < this.field1808; var7++) {
            if (this.field1814[var7] != -2) {
                int var8 = this.field1809[var7];
                int var9 = this.field1860[var7];
                int var10 = this.field1811[var7];
                int var11 = field1851[var8];
                int var12 = field1851[var9];
                int var13 = field1851[var10];
                if (arg0 && var11 == -5000 || var12 == -5000 || var13 == -5000) {
                    int var14 = field1815[var8];
                    int var15 = field1815[var9];
                    int var16 = field1815[var10];
                    int var17 = field1854[var8];
                    int var18 = field1854[var9];
                    int var19 = field1854[var10];
                    int var20 = field1846[var8];
                    int var21 = field1846[var9];
                    int var22 = field1846[var10];
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
                        field1840[var7] = true;
                        int var32 = (field1843[var8] + field1843[var9] + field1843[var10]) / 3 + this.field1831;
                        field1849[var32][field1839[var32]++] = var7;
                    }
                } else {
                    if (arg1) {
                        int var33 = field1842[var8];
                        int var34 = field1842[var9];
                        int var35 = field1842[var10];
                        int var36 = class132.field1872 + var6;
                        boolean var37;
                        if (var36 < var33 && var36 < var34 && var36 < var35) {
                            var37 = false;
                        } else {
                            int var38 = class132.field1872 - var6;
                            if (var38 > var33 && var38 > var34 && var38 > var35) {
                                var37 = false;
                            } else {
                                int var39 = class132.field1871 + var6;
                                if (var39 < var11 && var39 < var12 && var39 < var13) {
                                    var37 = false;
                                } else {
                                    int var40 = class132.field1871 - var6;
                                    if (var40 > var11 && var40 > var12 && var40 > var13) {
                                        var37 = false;
                                    } else {
                                        var37 = true;
                                    }
                                }
                            }
                        }
                        if (var37) {
                            class132.field1875[++class132.field1878 - 1] = arg3;
                            arg1 = false;
                        }
                    }
                    if ((field1842[var10] - field1842[var9]) * (var11 - var12) - (field1842[var8] - field1842[var9]) * (var13 - var12) > 0) {
                        field1840[var7] = false;
                        if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= Statics.field1903 && var12 <= Statics.field1903 && var13 <= Statics.field1903) {
                            field1850[var7] = false;
                        } else {
                            field1850[var7] = true;
                        }
                        int var42 = (field1843[var8] + field1843[var9] + field1843[var10]) / 3 + this.field1831;
                        field1849[var42][field1839[var42]++] = var7;
                    }
                }
            }
        }
        if (this.field1800 == null) {
            for (int var43 = this.field1867 - 1; var43 >= 0; var43--) {
                int var44 = field1839[var43];
                if (var44 > 0) {
                    int[] var45 = field1849[var43];
                    for (int var46 = 0; var46 < var44; var46++) {
                        this.method2481(var45[var46]);
                    }
                }
            }
            return;
        }
        for (int var47 = 0; var47 < 12; var47++) {
            field1865[var47] = 0;
            field1813[var47] = 0;
        }
        for (int var48 = this.field1867 - 1; var48 >= 0; var48--) {
            int var49 = field1839[var48];
            if (var49 > 0) {
                int[] var50 = field1849[var48];
                for (int var51 = 0; var51 < var49; var51++) {
                    int var52 = var50[var51];
                    byte var53 = this.field1800[var52];
                    int var54 = field1865[var53]++;
                    field1836[var53][var54] = var52;
                    if (var53 < 10) {
                        field1813[var53] += var48;
                    } else if (var53 == 10) {
                        field1852[var54] = var48;
                    } else {
                        field1853[var54] = var48;
                    }
                }
            }
        }
        int var55 = 0;
        if (field1865[1] > 0 || field1865[2] > 0) {
            var55 = (field1813[1] + field1813[2]) / (field1865[1] + field1865[2]);
        }
        int var56 = 0;
        if (field1865[3] > 0 || field1865[4] > 0) {
            var56 = (field1813[3] + field1813[4]) / (field1865[3] + field1865[4]);
        }
        int var57 = 0;
        if (field1865[6] > 0 || field1865[8] > 0) {
            var57 = (field1813[6] + field1813[8]) / (field1865[6] + field1865[8]);
        }
        int var58 = 0;
        int var59 = field1865[10];
        int[] var60 = field1836[10];
        int[] var61 = field1852;
        if (var58 == var59) {
            var58 = 0;
            var59 = field1865[11];
            var60 = field1836[11];
            var61 = field1853;
        }
        int var62;
        if (var58 < var59) {
            var62 = var61[var58];
        } else {
            var62 = -1000;
        }
        for (int var63 = 0; var63 < 10; var63++) {
            while (var63 == 0 && var62 > var55) {
                this.method2481(var60[var58++]);
                if (var58 == var59 && field1836[11] != var60) {
                    var58 = 0;
                    var59 = field1865[11];
                    var60 = field1836[11];
                    var61 = field1853;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            while (var63 == 3 && var62 > var56) {
                this.method2481(var60[var58++]);
                if (var58 == var59 && field1836[11] != var60) {
                    var58 = 0;
                    var59 = field1865[11];
                    var60 = field1836[11];
                    var61 = field1853;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            while (var63 == 5 && var62 > var57) {
                this.method2481(var60[var58++]);
                if (var58 == var59 && field1836[11] != var60) {
                    var58 = 0;
                    var59 = field1865[11];
                    var60 = field1836[11];
                    var61 = field1853;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            int var64 = field1865[var63];
            int[] var65 = field1836[var63];
            for (int var66 = 0; var66 < var64; var66++) {
                this.method2481(var65[var66]);
            }
        }
        while (var62 != -1000) {
            this.method2481(var60[var58++]);
            if (var58 == var59 && field1836[11] != var60) {
                var58 = 0;
                var60 = field1836[11];
                var59 = field1865[11];
                var61 = field1853;
            }
            if (var58 < var59) {
                var62 = var61[var58];
            } else {
                var62 = -1000;
            }
        }
    }

    @ObfuscatedName("en.aa(I)V")
    public final void method2481(int arg0) {
        if (field1840[arg0]) {
            this.method2460(arg0);
            return;
        }
        int var2 = this.field1809[arg0];
        int var3 = this.field1860[arg0];
        int var4 = this.field1811[arg0];
        class134.field1910 = field1850[arg0];
        if (this.field1816 == null) {
            class134.field1885 = 0;
        } else {
            class134.field1885 = this.field1816[arg0] & 0xFF;
        }
        if (this.field1818 != null && this.field1818[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1817 == null || this.field1817[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1817[arg0] & 0xFF;
                var6 = this.field1821[var5];
                var7 = this.field1822[var5];
                var8 = this.field1823[var5];
            }
            if (this.field1814[arg0] == -1) {
                class134.method2577(field1842[var2], field1842[var3], field1842[var4], field1851[var2], field1851[var3], field1851[var4], this.field1848[arg0], this.field1848[arg0], this.field1848[arg0], field1815[var6], field1815[var7], field1815[var8], field1854[var6], field1854[var7], field1854[var8], field1846[var6], field1846[var7], field1846[var8], this.field1818[arg0]);
            } else {
                class134.method2577(field1842[var2], field1842[var3], field1842[var4], field1851[var2], field1851[var3], field1851[var4], this.field1848[arg0], this.field1845[arg0], this.field1814[arg0], field1815[var6], field1815[var7], field1815[var8], field1854[var6], field1854[var7], field1854[var8], field1846[var6], field1846[var7], field1846[var8], this.field1818[arg0]);
            }
        } else if (this.field1814[arg0] == -1) {
            class134.method2558(field1842[var2], field1842[var3], field1842[var4], field1851[var2], field1851[var3], field1851[var4], field1866[this.field1848[arg0]]);
        } else {
            class134.method2556(field1842[var2], field1842[var3], field1842[var4], field1851[var2], field1851[var3], field1851[var4], this.field1848[arg0], this.field1845[arg0], this.field1814[arg0]);
        }
    }

    @ObfuscatedName("en.ap(I)V")
    public final void method2460(int arg0) {
        int var2 = Statics.field1907;
        int var3 = Statics.field1898;
        int var4 = 0;
        int var5 = this.field1809[arg0];
        int var6 = this.field1860[arg0];
        int var7 = this.field1811[arg0];
        int var8 = field1846[var5];
        int var9 = field1846[var6];
        int var10 = field1846[var7];
        if (this.field1816 == null) {
            class134.field1885 = 0;
        } else {
            class134.field1885 = this.field1816[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1855[var4] = field1851[var5];
            field1856[var4] = field1842[var5];
            field1857[var4++] = this.field1848[arg0];
        } else {
            int var11 = field1815[var5];
            int var12 = field1854[var5];
            int var13 = this.field1848[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1861[var10 - var8];
                field1855[var4] = (((field1815[var7] - var11) * var14 >> 16) + var11) * class134.field1896 / 50 + var2;
                field1856[var4] = (((field1854[var7] - var12) * var14 >> 16) + var12) * class134.field1896 / 50 + var3;
                field1857[var4++] = ((this.field1814[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1861[var9 - var8];
                field1855[var4] = (((field1815[var6] - var11) * var15 >> 16) + var11) * class134.field1896 / 50 + var2;
                field1856[var4] = (((field1854[var6] - var12) * var15 >> 16) + var12) * class134.field1896 / 50 + var3;
                field1857[var4++] = ((this.field1845[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1855[var4] = field1851[var6];
            field1856[var4] = field1842[var6];
            field1857[var4++] = this.field1845[arg0];
        } else {
            int var16 = field1815[var6];
            int var17 = field1854[var6];
            int var18 = this.field1845[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1861[var8 - var9];
                field1855[var4] = (((field1815[var5] - var16) * var19 >> 16) + var16) * class134.field1896 / 50 + var2;
                field1856[var4] = (((field1854[var5] - var17) * var19 >> 16) + var17) * class134.field1896 / 50 + var3;
                field1857[var4++] = ((this.field1848[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1861[var10 - var9];
                field1855[var4] = (((field1815[var7] - var16) * var20 >> 16) + var16) * class134.field1896 / 50 + var2;
                field1856[var4] = (((field1854[var7] - var17) * var20 >> 16) + var17) * class134.field1896 / 50 + var3;
                field1857[var4++] = ((this.field1814[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1855[var4] = field1851[var7];
            field1856[var4] = field1842[var7];
            field1857[var4++] = this.field1814[arg0];
        } else {
            int var21 = field1815[var7];
            int var22 = field1854[var7];
            int var23 = this.field1814[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1861[var9 - var10];
                field1855[var4] = (((field1815[var6] - var21) * var24 >> 16) + var21) * class134.field1896 / 50 + var2;
                field1856[var4] = (((field1854[var6] - var22) * var24 >> 16) + var22) * class134.field1896 / 50 + var3;
                field1857[var4++] = ((this.field1845[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1861[var8 - var10];
                field1855[var4] = (((field1815[var5] - var21) * var25 >> 16) + var21) * class134.field1896 / 50 + var2;
                field1856[var4] = (((field1854[var5] - var22) * var25 >> 16) + var22) * class134.field1896 / 50 + var3;
                field1857[var4++] = ((this.field1848[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1855[0];
        int var27 = field1855[1];
        int var28 = field1855[2];
        int var29 = field1856[0];
        int var30 = field1856[1];
        int var31 = field1856[2];
        class134.field1910 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1903 || var27 > Statics.field1903 || var28 > Statics.field1903) {
                class134.field1910 = true;
            }
            if (this.field1818 != null && this.field1818[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1817 == null || this.field1817[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1817[arg0] & 0xFF;
                    var33 = this.field1821[var32];
                    var34 = this.field1822[var32];
                    var35 = this.field1823[var32];
                }
                if (this.field1814[arg0] == -1) {
                    class134.method2577(var29, var30, var31, var26, var27, var28, this.field1848[arg0], this.field1848[arg0], this.field1848[arg0], field1815[var33], field1815[var34], field1815[var35], field1854[var33], field1854[var34], field1854[var35], field1846[var33], field1846[var34], field1846[var35], this.field1818[arg0]);
                } else {
                    class134.method2577(var29, var30, var31, var26, var27, var28, field1857[0], field1857[1], field1857[2], field1815[var33], field1815[var34], field1815[var35], field1854[var33], field1854[var34], field1854[var35], field1846[var33], field1846[var34], field1846[var35], this.field1818[arg0]);
                }
            } else if (this.field1814[arg0] == -1) {
                class134.method2558(var29, var30, var31, var26, var27, var28, field1866[this.field1848[arg0]]);
            } else {
                class134.method2556(var29, var30, var31, var26, var27, var28, field1857[0], field1857[1], field1857[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1903 || var27 > Statics.field1903 || var28 > Statics.field1903 || field1855[3] < 0 || field1855[3] > Statics.field1903) {
            class134.field1910 = true;
        }
        if (this.field1818 != null && this.field1818[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1817 == null || this.field1817[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1817[arg0] & 0xFF;
                var37 = this.field1821[var36];
                var38 = this.field1822[var36];
                var39 = this.field1823[var36];
            }
            short var40 = this.field1818[arg0];
            if (this.field1814[arg0] == -1) {
                class134.method2577(var29, var30, var31, var26, var27, var28, this.field1848[arg0], this.field1848[arg0], this.field1848[arg0], field1815[var37], field1815[var38], field1815[var39], field1854[var37], field1854[var38], field1854[var39], field1846[var37], field1846[var38], field1846[var39], var40);
                class134.method2577(var29, var31, field1856[3], var26, var28, field1855[3], this.field1848[arg0], this.field1848[arg0], this.field1848[arg0], field1815[var37], field1815[var38], field1815[var39], field1854[var37], field1854[var38], field1854[var39], field1846[var37], field1846[var38], field1846[var39], var40);
            } else {
                class134.method2577(var29, var30, var31, var26, var27, var28, field1857[0], field1857[1], field1857[2], field1815[var37], field1815[var38], field1815[var39], field1854[var37], field1854[var38], field1854[var39], field1846[var37], field1846[var38], field1846[var39], var40);
                class134.method2577(var29, var31, field1856[3], var26, var28, field1855[3], field1857[0], field1857[2], field1857[3], field1815[var37], field1815[var38], field1815[var39], field1854[var37], field1854[var38], field1854[var39], field1846[var37], field1846[var38], field1846[var39], var40);
            }
        } else if (this.field1814[arg0] == -1) {
            int var41 = field1866[this.field1848[arg0]];
            class134.method2558(var29, var30, var31, var26, var27, var28, var41);
            class134.method2558(var29, var31, field1856[3], var26, var28, field1855[3], var41);
        } else {
            class134.method2556(var29, var30, var31, var26, var27, var28, field1857[0], field1857[1], field1857[2]);
            class134.method2556(var29, var31, field1856[3], var26, var28, field1855[3], field1857[0], field1857[2], field1857[3]);
        }
    }
}
