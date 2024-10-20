package deob;

@ObfuscatedName("dr")
public class class106 extends class86 {

    @ObfuscatedName("dr.f")
    public static class106 field1834 = new class106();

    @ObfuscatedName("dr.u")
    public static byte[] field1805 = new byte[1];

    @ObfuscatedName("dr.x")
    public static class106 field1855 = new class106();

    @ObfuscatedName("dr.b")
    public static byte[] field1817 = new byte[1];

    @ObfuscatedName("dr.l")
    public int field1836 = 0;

    @ObfuscatedName("dr.d")
    public int[] field1866;

    @ObfuscatedName("dr.n")
    public int[] field1810;

    @ObfuscatedName("dr.m")
    public int[] field1816;

    @ObfuscatedName("dr.g")
    public int field1812 = 0;

    @ObfuscatedName("dr.s")
    public int[] field1847;

    @ObfuscatedName("dr.r")
    public int[] field1814;

    @ObfuscatedName("dr.k")
    public int[] field1815;

    @ObfuscatedName("dr.o")
    public int[] field1820;

    @ObfuscatedName("dr.q")
    public int[] field1828;

    @ObfuscatedName("dr.p")
    public int[] field1818;

    @ObfuscatedName("dr.h")
    public byte[] field1819;

    @ObfuscatedName("dr.e")
    public byte[] field1822;

    @ObfuscatedName("dr.t")
    public byte[] field1821;

    @ObfuscatedName("dr.w")
    public short[] field1864;

    @ObfuscatedName("dr.v")
    public byte field1823 = 0;

    @ObfuscatedName("dr.y")
    public int field1824 = 0;

    @ObfuscatedName("dr.c")
    public int[] field1825;

    @ObfuscatedName("dr.i")
    public int[] field1826;

    @ObfuscatedName("dr.a")
    public int[] field1827;

    @ObfuscatedName("dr.z")
    public int[][] field1850;

    @ObfuscatedName("dr.j")
    public int[][] field1829;

    @ObfuscatedName("dr.ag")
    public boolean field1830 = false;

    @ObfuscatedName("dr.ax")
    public int field1831;

    @ObfuscatedName("dr.ao")
    public int field1832;

    @ObfuscatedName("dr.ac")
    public int field1833;

    @ObfuscatedName("dr.aj")
    public int field1856;

    @ObfuscatedName("dr.an")
    public int field1835;

    @ObfuscatedName("dr.as")
    public static boolean[] field1837 = new boolean[4700];

    @ObfuscatedName("dr.av")
    public static boolean[] field1838 = new boolean[4700];

    @ObfuscatedName("dr.am")
    public static int[] field1839 = new int[4700];

    @ObfuscatedName("dr.az")
    public static int[] field1840 = new int[4700];

    @ObfuscatedName("dr.ai")
    public static int[] field1841 = new int[4700];

    @ObfuscatedName("dr.aq")
    public static int[] field1842 = new int[4700];

    @ObfuscatedName("dr.ah")
    public static int[] field1843 = new int[4700];

    @ObfuscatedName("dr.ap")
    public static int[] field1806 = new int[4700];

    @ObfuscatedName("dr.aa")
    public static int[] field1846 = new int[1600];

    @ObfuscatedName("dr.ay")
    public static int[][] field1804 = new int[1600][512];

    @ObfuscatedName("dr.aw")
    public static int[] field1848 = new int[12];

    @ObfuscatedName("dr.ak")
    public static int[][] field1849 = new int[12][2000];

    @ObfuscatedName("dr.ae")
    public static int[] field1811 = new int[2000];

    @ObfuscatedName("dr.ad")
    public static int[] field1844 = new int[2000];

    @ObfuscatedName("dr.au")
    public static int[] field1852 = new int[12];

    @ObfuscatedName("dr.ar")
    public static int[] field1853 = new int[10];

    @ObfuscatedName("dr.at")
    public static int[] field1860 = new int[10];

    @ObfuscatedName("dr.ab")
    public static int[] field1808 = new int[10];

    @ObfuscatedName("dr.bx")
    public static boolean field1859 = false;

    @ObfuscatedName("dr.bq")
    public static int field1854 = 0;

    @ObfuscatedName("dr.bc")
    public static int field1861 = 0;

    @ObfuscatedName("dr.ba")
    public static int field1862 = 0;

    @ObfuscatedName("dr.by")
    public static int[] field1863 = new int[1000];

    @ObfuscatedName("dr.bk")
    public static int[] field1807 = class92.field1598;

    @ObfuscatedName("dr.bm")
    public static int[] field1865 = class92.field1578;

    @ObfuscatedName("dr.be")
    public static int[] field1851 = class92.field1594;

    @ObfuscatedName("dr.bg")
    public static int[] field1867 = class92.field1597;

    public class106() {
    }

    public class106(class106[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1836 = 0;
        this.field1812 = 0;
        this.field1824 = 0;
        this.field1823 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class106 var8 = arg0[var7];
            if (var8 != null) {
                this.field1836 += var8.field1836;
                this.field1812 += var8.field1812;
                this.field1824 += var8.field1824;
                if (var8.field1819 == null) {
                    if (this.field1823 == -1) {
                        this.field1823 = var8.field1823;
                    }
                    if (this.field1823 != var8.field1823) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1822 != null;
                var5 |= var8.field1864 != null;
                var6 |= var8.field1821 != null;
            }
        }
        this.field1866 = new int[this.field1836];
        this.field1810 = new int[this.field1836];
        this.field1816 = new int[this.field1836];
        this.field1847 = new int[this.field1812];
        this.field1814 = new int[this.field1812];
        this.field1815 = new int[this.field1812];
        this.field1820 = new int[this.field1812];
        this.field1828 = new int[this.field1812];
        this.field1818 = new int[this.field1812];
        if (var3) {
            this.field1819 = new byte[this.field1812];
        }
        if (var4) {
            this.field1822 = new byte[this.field1812];
        }
        if (var5) {
            this.field1864 = new short[this.field1812];
        }
        if (var6) {
            this.field1821 = new byte[this.field1812];
        }
        if (this.field1824 > 0) {
            this.field1825 = new int[this.field1824];
            this.field1826 = new int[this.field1824];
            this.field1827 = new int[this.field1824];
        }
        this.field1836 = 0;
        this.field1812 = 0;
        this.field1824 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class106 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1812; var11++) {
                    this.field1847[this.field1812] = var10.field1847[var11] + this.field1836;
                    this.field1814[this.field1812] = var10.field1814[var11] + this.field1836;
                    this.field1815[this.field1812] = var10.field1815[var11] + this.field1836;
                    this.field1820[this.field1812] = var10.field1820[var11];
                    this.field1828[this.field1812] = var10.field1828[var11];
                    this.field1818[this.field1812] = var10.field1818[var11];
                    if (var3) {
                        if (var10.field1819 == null) {
                            this.field1819[this.field1812] = var10.field1823;
                        } else {
                            this.field1819[this.field1812] = var10.field1819[var11];
                        }
                    }
                    if (var4 && var10.field1822 != null) {
                        this.field1822[this.field1812] = var10.field1822[var11];
                    }
                    if (var5) {
                        if (var10.field1864 == null) {
                            this.field1864[this.field1812] = -1;
                        } else {
                            this.field1864[this.field1812] = var10.field1864[var11];
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
                    this.field1825[this.field1824] = var10.field1825[var12] + this.field1836;
                    this.field1826[this.field1824] = var10.field1826[var12] + this.field1836;
                    this.field1827[this.field1824] = var10.field1827[var12] + this.field1836;
                    this.field1824++;
                }
                for (int var13 = 0; var13 < var10.field1836; var13++) {
                    this.field1866[this.field1836] = var10.field1866[var13];
                    this.field1810[this.field1836] = var10.field1810[var13];
                    this.field1816[this.field1836] = var10.field1816[var13];
                    this.field1836++;
                }
            }
        }
    }

    @ObfuscatedName("dr.f([[IIIIZI)Ldr;")
    public class106 method2209(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2195();
        int var7 = arg1 - this.field1833;
        int var8 = this.field1833 + arg1;
        int var9 = arg3 - this.field1833;
        int var10 = this.field1833 + arg3;
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
            var15.field1836 = this.field1836;
            var15.field1812 = this.field1812;
            var15.field1824 = this.field1824;
            var15.field1866 = this.field1866;
            var15.field1816 = this.field1816;
            var15.field1847 = this.field1847;
            var15.field1814 = this.field1814;
            var15.field1815 = this.field1815;
            var15.field1820 = this.field1820;
            var15.field1828 = this.field1828;
            var15.field1818 = this.field1818;
            var15.field1819 = this.field1819;
            var15.field1822 = this.field1822;
            var15.field1821 = this.field1821;
            var15.field1864 = this.field1864;
            var15.field1823 = this.field1823;
            var15.field1825 = this.field1825;
            var15.field1826 = this.field1826;
            var15.field1827 = this.field1827;
            var15.field1850 = this.field1850;
            var15.field1829 = this.field1829;
            var15.field1830 = this.field1830;
            var15.field1810 = new int[var15.field1836];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1836; var16++) {
                int var17 = this.field1866[var16] + arg1;
                int var18 = this.field1816[var16] + arg3;
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
            for (int var26 = 0; var26 < var15.field1836; var26++) {
                int var27 = (-this.field1810[var26] << 16) / this.field1469;
                if (var27 < arg5) {
                    int var28 = this.field1866[var26] + arg1;
                    int var29 = this.field1816[var26] + arg3;
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

    @ObfuscatedName("dr.u(Z)Ldr;")
    public class106 method2192(boolean arg0) {
        if (!arg0 && field1805.length < this.field1812) {
            field1805 = new byte[this.field1812 + 100];
        }
        return this.method2194(arg0, field1834, field1805);
    }

    @ObfuscatedName("dr.b(Z)Ldr;")
    public class106 method2193(boolean arg0) {
        if (!arg0 && field1817.length < this.field1812) {
            field1817 = new byte[this.field1812 + 100];
        }
        return this.method2194(arg0, field1855, field1817);
    }

    @ObfuscatedName("dr.l(ZLdr;[B)Ldr;")
    public class106 method2194(boolean arg0, class106 arg1, byte[] arg2) {
        arg1.field1836 = this.field1836;
        arg1.field1812 = this.field1812;
        arg1.field1824 = this.field1824;
        if (arg1.field1866 == null || arg1.field1866.length < this.field1836) {
            arg1.field1866 = new int[this.field1836 + 100];
            arg1.field1810 = new int[this.field1836 + 100];
            arg1.field1816 = new int[this.field1836 + 100];
        }
        for (int var4 = 0; var4 < this.field1836; var4++) {
            arg1.field1866[var4] = this.field1866[var4];
            arg1.field1810[var4] = this.field1810[var4];
            arg1.field1816[var4] = this.field1816[var4];
        }
        if (arg0) {
            arg1.field1822 = this.field1822;
        } else {
            arg1.field1822 = arg2;
            if (this.field1822 == null) {
                for (int var5 = 0; var5 < this.field1812; var5++) {
                    arg1.field1822[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1812; var6++) {
                    arg1.field1822[var6] = this.field1822[var6];
                }
            }
        }
        arg1.field1847 = this.field1847;
        arg1.field1814 = this.field1814;
        arg1.field1815 = this.field1815;
        arg1.field1820 = this.field1820;
        arg1.field1828 = this.field1828;
        arg1.field1818 = this.field1818;
        arg1.field1819 = this.field1819;
        arg1.field1821 = this.field1821;
        arg1.field1864 = this.field1864;
        arg1.field1823 = this.field1823;
        arg1.field1825 = this.field1825;
        arg1.field1826 = this.field1826;
        arg1.field1827 = this.field1827;
        arg1.field1850 = this.field1850;
        arg1.field1829 = this.field1829;
        arg1.field1830 = this.field1830;
        arg1.field1831 = 0;
        return arg1;
    }

    @ObfuscatedName("dr.d()V")
    public void method2195() {
        if (this.field1831 == 1) {
            return;
        }
        this.field1831 = 1;
        this.field1469 = 0;
        this.field1832 = 0;
        this.field1833 = 0;
        for (int var1 = 0; var1 < this.field1836; var1++) {
            int var2 = this.field1866[var1];
            int var3 = this.field1810[var1];
            int var4 = this.field1816[var1];
            if (-var3 > this.field1469) {
                this.field1469 = -var3;
            }
            if (var3 > this.field1832) {
                this.field1832 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1833) {
                this.field1833 = var5;
            }
        }
        this.field1833 = (int) (Math.sqrt((double) this.field1833) + 0.99D);
        this.field1835 = (int) (Math.sqrt((double) (this.field1469 * this.field1469 + this.field1833 * this.field1833)) + 0.99D);
        this.field1856 = this.field1835 + (int) (Math.sqrt((double) (this.field1833 * this.field1833 + this.field1832 * this.field1832)) + 0.99D);
    }

    @ObfuscatedName("dr.n()V")
    public void method2196() {
        if (this.field1831 == 2) {
            return;
        }
        this.field1831 = 2;
        this.field1833 = 0;
        for (int var1 = 0; var1 < this.field1836; var1++) {
            int var2 = this.field1866[var1];
            int var3 = this.field1810[var1];
            int var4 = this.field1816[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1833) {
                this.field1833 = var5;
            }
        }
        this.field1833 = (int) (Math.sqrt((double) this.field1833) + 0.99D);
        this.field1835 = this.field1833;
        this.field1856 = this.field1833 + this.field1833;
    }

    @ObfuscatedName("dr.m()I")
    public int method2197() {
        this.method2195();
        return this.field1833;
    }

    @ObfuscatedName("dr.g(Lce;I)V")
    public void method2211(class104 arg0, int arg1) {
        if (this.field1850 == null || arg1 == -1) {
            return;
        }
        class89 var3 = arg0.field1775[arg1];
        class103 var4 = var3.field1547;
        Statics.field1845 = 0;
        Statics.field1857 = 0;
        Statics.field1858 = 0;
        for (int var5 = 0; var5 < var3.field1552; var5++) {
            int var6 = var3.field1553[var5];
            this.method2238(var4.field1770[var6], var4.field1768[var6], var3.field1554[var5], var3.field1548[var5], var3.field1551[var5]);
        }
        this.field1831 = 0;
    }

    @ObfuscatedName("dr.s(Lce;ILce;I[I)V")
    public void method2199(class104 arg0, int arg1, class104 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2211(arg0, arg1);
            return;
        }
        class89 var6 = arg0.field1775[arg1];
        class89 var7 = arg2.field1775[arg3];
        class103 var8 = var6.field1547;
        Statics.field1845 = 0;
        Statics.field1857 = 0;
        Statics.field1858 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1552; var11++) {
            int var12 = var6.field1553[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1770[var12] == 0) {
                this.method2238(var8.field1770[var12], var8.field1768[var12], var6.field1554[var11], var6.field1548[var11], var6.field1551[var11]);
            }
        }
        Statics.field1845 = 0;
        Statics.field1857 = 0;
        Statics.field1858 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1552; var15++) {
            int var16 = var7.field1553[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1770[var16] == 0) {
                this.method2238(var8.field1770[var16], var8.field1768[var16], var7.field1554[var15], var7.field1548[var15], var7.field1551[var15]);
            }
        }
        this.field1831 = 0;
    }

    @ObfuscatedName("dr.r(I[IIII)V")
    public void method2238(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1845 = 0;
            Statics.field1857 = 0;
            Statics.field1858 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1850.length) {
                    int[] var10 = this.field1850[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1845 += this.field1866[var12];
                        Statics.field1857 += this.field1810[var12];
                        Statics.field1858 += this.field1816[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1845 = Statics.field1845 / var7 + arg2;
                Statics.field1857 = Statics.field1857 / var7 + arg3;
                Statics.field1858 = Statics.field1858 / var7 + arg4;
            } else {
                Statics.field1845 = arg2;
                Statics.field1857 = arg3;
                Statics.field1858 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1850.length) {
                    int[] var15 = this.field1850[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1866[var17] += arg2;
                        this.field1810[var17] += arg3;
                        this.field1816[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1850.length) {
                    int[] var20 = this.field1850[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1866[var22] -= Statics.field1845;
                        this.field1810[var22] -= Statics.field1857;
                        this.field1816[var22] -= Statics.field1858;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1807[var25];
                            int var27 = field1865[var25];
                            int var28 = this.field1866[var22] * var27 + this.field1810[var22] * var26 >> 16;
                            this.field1810[var22] = this.field1810[var22] * var27 - this.field1866[var22] * var26 >> 16;
                            this.field1866[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1807[var23];
                            int var30 = field1865[var23];
                            int var31 = this.field1810[var22] * var30 - this.field1816[var22] * var29 >> 16;
                            this.field1816[var22] = this.field1816[var22] * var30 + this.field1810[var22] * var29 >> 16;
                            this.field1810[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1807[var24];
                            int var33 = field1865[var24];
                            int var34 = this.field1866[var22] * var33 + this.field1816[var22] * var32 >> 16;
                            this.field1816[var22] = this.field1816[var22] * var33 - this.field1866[var22] * var32 >> 16;
                            this.field1866[var22] = var34;
                        }
                        this.field1866[var22] += Statics.field1845;
                        this.field1810[var22] += Statics.field1857;
                        this.field1816[var22] += Statics.field1858;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1850.length) {
                    int[] var37 = this.field1850[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1866[var39] -= Statics.field1845;
                        this.field1810[var39] -= Statics.field1857;
                        this.field1816[var39] -= Statics.field1858;
                        this.field1866[var39] = this.field1866[var39] * arg2 / 128;
                        this.field1810[var39] = this.field1810[var39] * arg3 / 128;
                        this.field1816[var39] = this.field1816[var39] * arg4 / 128;
                        this.field1866[var39] += Statics.field1845;
                        this.field1810[var39] += Statics.field1857;
                        this.field1816[var39] += Statics.field1858;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1829 != null && this.field1822 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1829.length) {
                    int[] var42 = this.field1829[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1822[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1822[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dr.p()V")
    public void method2221() {
        for (int var1 = 0; var1 < this.field1836; var1++) {
            int var2 = this.field1866[var1];
            this.field1866[var1] = this.field1816[var1];
            this.field1816[var1] = -var2;
        }
        this.field1831 = 0;
    }

    @ObfuscatedName("dr.h()V")
    public void method2253() {
        for (int var1 = 0; var1 < this.field1836; var1++) {
            this.field1866[var1] = -this.field1866[var1];
            this.field1816[var1] = -this.field1816[var1];
        }
        this.field1831 = 0;
    }

    @ObfuscatedName("dr.e()V")
    public void method2201() {
        for (int var1 = 0; var1 < this.field1836; var1++) {
            int var2 = this.field1816[var1];
            this.field1816[var1] = this.field1866[var1];
            this.field1866[var1] = -var2;
        }
        this.field1831 = 0;
    }

    @ObfuscatedName("dr.t(I)V")
    public void method2210(int arg0) {
        int var2 = field1807[arg0];
        int var3 = field1865[arg0];
        for (int var4 = 0; var4 < this.field1836; var4++) {
            int var5 = this.field1810[var4] * var3 - this.field1816[var4] * var2 >> 16;
            this.field1816[var4] = this.field1816[var4] * var3 + this.field1810[var4] * var2 >> 16;
            this.field1810[var4] = var5;
        }
        this.field1831 = 0;
    }

    @ObfuscatedName("dr.w(III)V")
    public void method2203(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1836; var4++) {
            this.field1866[var4] += arg0;
            this.field1810[var4] += arg1;
            this.field1816[var4] += arg2;
        }
        this.field1831 = 0;
    }

    @ObfuscatedName("dr.v(III)V")
    public void method2191(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1836; var4++) {
            this.field1866[var4] = this.field1866[var4] * arg0 / 128;
            this.field1810[var4] = this.field1810[var4] * arg1 / 128;
            this.field1816[var4] = this.field1816[var4] * arg2 / 128;
        }
        this.field1831 = 0;
    }

    @ObfuscatedName("dr.y(IIIIIII)V")
    public final void method2205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1846[0] = -1;
        if (this.field1831 != 2 && this.field1831 != 1) {
            this.method2196();
        }
        int var8 = Statics.field1590;
        int var9 = Statics.field1586;
        int var10 = field1807[arg0];
        int var11 = field1865[arg0];
        int var12 = field1807[arg1];
        int var13 = field1865[arg1];
        int var14 = field1807[arg2];
        int var15 = field1865[arg2];
        int var16 = field1807[arg3];
        int var17 = field1865[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1836; var19++) {
            int var20 = this.field1866[var19];
            int var21 = this.field1810[var19];
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
            field1841[var19] = var30 - var18;
            field1839[var19] = class92.field1584 * var26 / var30 + var8;
            field1840[var19] = class92.field1584 * var29 / var30 + var9;
            if (this.field1824 > 0) {
                field1842[var19] = var26;
                field1843[var19] = var29;
                field1806[var19] = var30;
            }
        }
        try {
            this.method2208(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dr.c(IIIIIIII)V")
    public final void method2206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1846[0] = -1;
        if (this.field1831 != 2 && this.field1831 != 1) {
            this.method2196();
        }
        int var9 = Statics.field1590;
        int var10 = Statics.field1586;
        int var11 = field1807[arg0];
        int var12 = field1865[arg0];
        int var13 = field1807[arg1];
        int var14 = field1865[arg1];
        int var15 = field1807[arg2];
        int var16 = field1865[arg2];
        int var17 = field1807[arg3];
        int var18 = field1865[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1836; var20++) {
            int var21 = this.field1866[var20];
            int var22 = this.field1810[var20];
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
            field1841[var20] = var31 - var19;
            field1839[var20] = class92.field1584 * var27 / arg7 + var9;
            field1840[var20] = class92.field1584 * var30 / arg7 + var10;
            if (this.field1824 > 0) {
                field1842[var20] = var27;
                field1843[var20] = var30;
                field1806[var20] = var31;
            }
        }
        try {
            this.method2208(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dr.ai(IIIIIIIII)V")
    public void method1828(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1846[0] = -1;
        if (this.field1831 != 1) {
            this.method2195();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1833 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1833) * class92.field1584;
        if (var15 / var13 >= Statics.field1581) {
            return;
        }
        int var16 = (this.field1833 + var14) * class92.field1584;
        if (var16 / var13 <= Statics.field1589) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1833 * arg1 >> 16;
        int var19 = (var17 + var18) * class92.field1584;
        if (var19 / var13 <= Statics.field1591) {
            return;
        }
        int var20 = (this.field1469 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class92.field1584;
        if (var21 / var13 >= Statics.field1596) {
            return;
        }
        int var22 = (this.field1469 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1824 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1859) {
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
            int var32 = field1854 - Statics.field1590;
            int var33 = field1861 - Statics.field1586;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1830) {
                    field1863[field1862++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1590;
        int var35 = Statics.field1586;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1807[arg0];
            var37 = field1865[arg0];
        }
        for (int var38 = 0; var38 < this.field1836; var38++) {
            int var39 = this.field1866[var38];
            int var40 = this.field1810[var38];
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
            field1841[var38] = var50 - var11;
            if (var50 >= 50) {
                field1839[var38] = class92.field1584 * var46 / var50 + var34;
                field1840[var38] = class92.field1584 * var49 / var50 + var35;
            } else {
                field1839[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1842[var38] = var46;
                field1843[var38] = var49;
                field1806[var38] = var50;
            }
        }
        try {
            this.method2208(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dr.i(ZZI)V")
    public final void method2208(boolean arg0, boolean arg1, int arg2) {
        if (this.field1856 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1856; var4++) {
            field1846[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1812; var5++) {
            if (this.field1818[var5] != -2) {
                int var6 = this.field1847[var5];
                int var7 = this.field1814[var5];
                int var8 = this.field1815[var5];
                int var9 = field1839[var6];
                int var10 = field1839[var7];
                int var11 = field1839[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1842[var6];
                    int var13 = field1842[var7];
                    int var14 = field1842[var8];
                    int var15 = field1843[var6];
                    int var16 = field1843[var7];
                    int var17 = field1843[var8];
                    int var18 = field1806[var6];
                    int var19 = field1806[var7];
                    int var20 = field1806[var8];
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
                        field1804[var30][field1846[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2244(field1854, field1861, field1840[var6], field1840[var7], field1840[var8], var9, var10, var11)) {
                        field1863[field1862++] = arg2;
                        arg1 = false;
                    }
                    if ((field1840[var8] - field1840[var7]) * (var9 - var10) - (field1840[var6] - field1840[var7]) * (var11 - var10) > 0) {
                        field1838[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1587 && var10 <= Statics.field1587 && var11 <= Statics.field1587) {
                            field1837[var5] = false;
                        } else {
                            field1837[var5] = true;
                        }
                        int var31 = (field1841[var6] + field1841[var7] + field1841[var8]) / 3 + this.field1835;
                        field1804[var31][field1846[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1819 == null) {
            for (int var32 = this.field1856 - 1; var32 >= 0; var32--) {
                int var33 = field1846[var32];
                if (var33 > 0) {
                    int[] var34 = field1804[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2234(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1848[var36] = 0;
            field1852[var36] = 0;
        }
        for (int var37 = this.field1856 - 1; var37 >= 0; var37--) {
            int var38 = field1846[var37];
            if (var38 > 0) {
                int[] var39 = field1804[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1819[var41];
                    int var43 = field1848[var42]++;
                    field1849[var42][var43] = var41;
                    if (var42 < 10) {
                        field1852[var42] += var37;
                    } else if (var42 == 10) {
                        field1811[var43] = var37;
                    } else {
                        field1844[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1848[1] > 0 || field1848[2] > 0) {
            var44 = (field1852[1] + field1852[2]) / (field1848[1] + field1848[2]);
        }
        int var45 = 0;
        if (field1848[3] > 0 || field1848[4] > 0) {
            var45 = (field1852[3] + field1852[4]) / (field1848[3] + field1848[4]);
        }
        int var46 = 0;
        if (field1848[6] > 0 || field1848[8] > 0) {
            var46 = (field1852[6] + field1852[8]) / (field1848[6] + field1848[8]);
        }
        int var47 = 0;
        int var48 = field1848[10];
        int[] var49 = field1849[10];
        int[] var50 = field1811;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1848[11];
            var49 = field1849[11];
            var50 = field1844;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2234(var49[var47++]);
                if (var47 == var48 && field1849[11] != var49) {
                    var47 = 0;
                    var48 = field1848[11];
                    var49 = field1849[11];
                    var50 = field1844;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2234(var49[var47++]);
                if (var47 == var48 && field1849[11] != var49) {
                    var47 = 0;
                    var48 = field1848[11];
                    var49 = field1849[11];
                    var50 = field1844;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2234(var49[var47++]);
                if (var47 == var48 && field1849[11] != var49) {
                    var47 = 0;
                    var48 = field1848[11];
                    var49 = field1849[11];
                    var50 = field1844;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1848[var52];
            int[] var54 = field1849[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2234(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2234(var49[var47++]);
            if (var47 == var48 && field1849[11] != var49) {
                var47 = 0;
                var49 = field1849[11];
                var48 = field1848[11];
                var50 = field1844;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dr.a(I)V")
    public final void method2234(int arg0) {
        if (field1838[arg0]) {
            this.method2207(arg0);
            return;
        }
        int var2 = this.field1847[arg0];
        int var3 = this.field1814[arg0];
        int var4 = this.field1815[arg0];
        class92.field1585 = field1837[arg0];
        if (this.field1822 == null) {
            class92.field1579 = 0;
        } else {
            class92.field1579 = this.field1822[arg0] & 0xFF;
        }
        if (this.field1864 != null && this.field1864[arg0] != -1) {
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
                var7 = this.field1826[var5];
                var8 = this.field1827[var5];
            }
            if (this.field1818[arg0] == -1) {
                class92.method2010(field1840[var2], field1840[var3], field1840[var4], field1839[var2], field1839[var3], field1839[var4], this.field1820[arg0], this.field1820[arg0], this.field1820[arg0], field1842[var6], field1842[var7], field1842[var8], field1843[var6], field1843[var7], field1843[var8], field1806[var6], field1806[var7], field1806[var8], this.field1864[arg0]);
            } else {
                class92.method2010(field1840[var2], field1840[var3], field1840[var4], field1839[var2], field1839[var3], field1839[var4], this.field1820[arg0], this.field1828[arg0], this.field1818[arg0], field1842[var6], field1842[var7], field1842[var8], field1843[var6], field1843[var7], field1843[var8], field1806[var6], field1806[var7], field1806[var8], this.field1864[arg0]);
            }
        } else if (this.field1818[arg0] == -1) {
            class92.method2008(field1840[var2], field1840[var3], field1840[var4], field1839[var2], field1839[var3], field1839[var4], field1851[this.field1820[arg0]]);
        } else {
            class92.method2024(field1840[var2], field1840[var3], field1840[var4], field1839[var2], field1839[var3], field1839[var4], this.field1820[arg0], this.field1828[arg0], this.field1818[arg0]);
        }
    }

    @ObfuscatedName("dr.z(I)V")
    public final void method2207(int arg0) {
        int var2 = Statics.field1590;
        int var3 = Statics.field1586;
        int var4 = 0;
        int var5 = this.field1847[arg0];
        int var6 = this.field1814[arg0];
        int var7 = this.field1815[arg0];
        int var8 = field1806[var5];
        int var9 = field1806[var6];
        int var10 = field1806[var7];
        if (this.field1822 == null) {
            class92.field1579 = 0;
        } else {
            class92.field1579 = this.field1822[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1853[var4] = field1839[var5];
            field1860[var4] = field1840[var5];
            field1808[var4++] = this.field1820[arg0];
        } else {
            int var11 = field1842[var5];
            int var12 = field1843[var5];
            int var13 = this.field1820[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1867[var10 - var8];
                field1853[var4] = (((field1842[var7] - var11) * var14 >> 16) + var11) * class92.field1584 / 50 + var2;
                field1860[var4] = (((field1843[var7] - var12) * var14 >> 16) + var12) * class92.field1584 / 50 + var3;
                field1808[var4++] = ((this.field1818[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1867[var9 - var8];
                field1853[var4] = (((field1842[var6] - var11) * var15 >> 16) + var11) * class92.field1584 / 50 + var2;
                field1860[var4] = (((field1843[var6] - var12) * var15 >> 16) + var12) * class92.field1584 / 50 + var3;
                field1808[var4++] = ((this.field1828[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1853[var4] = field1839[var6];
            field1860[var4] = field1840[var6];
            field1808[var4++] = this.field1828[arg0];
        } else {
            int var16 = field1842[var6];
            int var17 = field1843[var6];
            int var18 = this.field1828[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1867[var8 - var9];
                field1853[var4] = (((field1842[var5] - var16) * var19 >> 16) + var16) * class92.field1584 / 50 + var2;
                field1860[var4] = (((field1843[var5] - var17) * var19 >> 16) + var17) * class92.field1584 / 50 + var3;
                field1808[var4++] = ((this.field1820[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1867[var10 - var9];
                field1853[var4] = (((field1842[var7] - var16) * var20 >> 16) + var16) * class92.field1584 / 50 + var2;
                field1860[var4] = (((field1843[var7] - var17) * var20 >> 16) + var17) * class92.field1584 / 50 + var3;
                field1808[var4++] = ((this.field1818[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1853[var4] = field1839[var7];
            field1860[var4] = field1840[var7];
            field1808[var4++] = this.field1818[arg0];
        } else {
            int var21 = field1842[var7];
            int var22 = field1843[var7];
            int var23 = this.field1818[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1867[var9 - var10];
                field1853[var4] = (((field1842[var6] - var21) * var24 >> 16) + var21) * class92.field1584 / 50 + var2;
                field1860[var4] = (((field1843[var6] - var22) * var24 >> 16) + var22) * class92.field1584 / 50 + var3;
                field1808[var4++] = ((this.field1828[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1867[var8 - var10];
                field1853[var4] = (((field1842[var5] - var21) * var25 >> 16) + var21) * class92.field1584 / 50 + var2;
                field1860[var4] = (((field1843[var5] - var22) * var25 >> 16) + var22) * class92.field1584 / 50 + var3;
                field1808[var4++] = ((this.field1820[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1853[0];
        int var27 = field1853[1];
        int var28 = field1853[2];
        int var29 = field1860[0];
        int var30 = field1860[1];
        int var31 = field1860[2];
        class92.field1585 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1587 || var27 > Statics.field1587 || var28 > Statics.field1587) {
                class92.field1585 = true;
            }
            if (this.field1864 != null && this.field1864[arg0] != -1) {
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
                    var34 = this.field1826[var32];
                    var35 = this.field1827[var32];
                }
                if (this.field1818[arg0] == -1) {
                    class92.method2010(var29, var30, var31, var26, var27, var28, this.field1820[arg0], this.field1820[arg0], this.field1820[arg0], field1842[var33], field1842[var34], field1842[var35], field1843[var33], field1843[var34], field1843[var35], field1806[var33], field1806[var34], field1806[var35], this.field1864[arg0]);
                } else {
                    class92.method2010(var29, var30, var31, var26, var27, var28, field1808[0], field1808[1], field1808[2], field1842[var33], field1842[var34], field1842[var35], field1843[var33], field1843[var34], field1843[var35], field1806[var33], field1806[var34], field1806[var35], this.field1864[arg0]);
                }
            } else if (this.field1818[arg0] == -1) {
                class92.method2008(var29, var30, var31, var26, var27, var28, field1851[this.field1820[arg0]]);
            } else {
                class92.method2024(var29, var30, var31, var26, var27, var28, field1808[0], field1808[1], field1808[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1587 || var27 > Statics.field1587 || var28 > Statics.field1587 || field1853[3] < 0 || field1853[3] > Statics.field1587) {
            class92.field1585 = true;
        }
        if (this.field1864 != null && this.field1864[arg0] != -1) {
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
                var38 = this.field1826[var36];
                var39 = this.field1827[var36];
            }
            short var40 = this.field1864[arg0];
            if (this.field1818[arg0] == -1) {
                class92.method2010(var29, var30, var31, var26, var27, var28, this.field1820[arg0], this.field1820[arg0], this.field1820[arg0], field1842[var37], field1842[var38], field1842[var39], field1843[var37], field1843[var38], field1843[var39], field1806[var37], field1806[var38], field1806[var39], var40);
                class92.method2010(var29, var31, field1860[3], var26, var28, field1853[3], this.field1820[arg0], this.field1820[arg0], this.field1820[arg0], field1842[var37], field1842[var38], field1842[var39], field1843[var37], field1843[var38], field1843[var39], field1806[var37], field1806[var38], field1806[var39], var40);
            } else {
                class92.method2010(var29, var30, var31, var26, var27, var28, field1808[0], field1808[1], field1808[2], field1842[var37], field1842[var38], field1842[var39], field1843[var37], field1843[var38], field1843[var39], field1806[var37], field1806[var38], field1806[var39], var40);
                class92.method2010(var29, var31, field1860[3], var26, var28, field1853[3], field1808[0], field1808[2], field1808[3], field1842[var37], field1842[var38], field1842[var39], field1843[var37], field1843[var38], field1843[var39], field1806[var37], field1806[var38], field1806[var39], var40);
            }
        } else if (this.field1818[arg0] == -1) {
            int var41 = field1851[this.field1820[arg0]];
            class92.method2008(var29, var30, var31, var26, var27, var28, var41);
            class92.method2008(var29, var31, field1860[3], var26, var28, field1853[3], var41);
        } else {
            class92.method2024(var29, var30, var31, var26, var27, var28, field1808[0], field1808[1], field1808[2]);
            class92.method2024(var29, var31, field1860[3], var26, var28, field1853[3], field1808[0], field1808[2], field1808[3]);
        }
    }

    @ObfuscatedName("dr.j(IIIIIIII)Z")
    public final boolean method2244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
