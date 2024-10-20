package deob;

@ObfuscatedName("dp")
public class class106 extends class86 {

    @ObfuscatedName("dp.w")
    public static class106 field1869 = new class106();

    @ObfuscatedName("dp.x")
    public static byte[] field1811 = new byte[1];

    @ObfuscatedName("dp.t")
    public static class106 field1812 = new class106();

    @ObfuscatedName("dp.p")
    public static byte[] field1813 = new byte[1];

    @ObfuscatedName("dp.e")
    public int field1814 = 0;

    @ObfuscatedName("dp.y")
    public int[] field1839;

    @ObfuscatedName("dp.m")
    public int[] field1816;

    @ObfuscatedName("dp.c")
    public int[] field1817;

    @ObfuscatedName("dp.v")
    public int field1818 = 0;

    @ObfuscatedName("dp.l")
    public int[] field1819;

    @ObfuscatedName("dp.z")
    public int[] field1820;

    @ObfuscatedName("dp.s")
    public int[] field1821;

    @ObfuscatedName("dp.j")
    public int[] field1858;

    @ObfuscatedName("dp.q")
    public int[] field1823;

    @ObfuscatedName("dp.a")
    public int[] field1847;

    @ObfuscatedName("dp.d")
    public byte[] field1870;

    @ObfuscatedName("dp.u")
    public byte[] field1831;

    @ObfuscatedName("dp.i")
    public byte[] field1827;

    @ObfuscatedName("dp.o")
    public short[] field1857;

    @ObfuscatedName("dp.h")
    public byte field1829 = 0;

    @ObfuscatedName("dp.k")
    public int field1868 = 0;

    @ObfuscatedName("dp.f")
    public int[] field1815;

    @ObfuscatedName("dp.r")
    public int[] field1832;

    @ObfuscatedName("dp.n")
    public int[] field1849;

    @ObfuscatedName("dp.g")
    public int[][] field1834;

    @ObfuscatedName("dp.b")
    public int[][] field1835;

    @ObfuscatedName("dp.af")
    public boolean field1871 = false;

    @ObfuscatedName("dp.am")
    public int field1837;

    @ObfuscatedName("dp.ar")
    public int field1824;

    @ObfuscatedName("dp.ay")
    public int field1854;

    @ObfuscatedName("dp.ai")
    public int field1840;

    @ObfuscatedName("dp.ab")
    public int field1841;

    @ObfuscatedName("dp.ac")
    public static boolean[] field1843 = new boolean[4700];

    @ObfuscatedName("dp.ah")
    public static boolean[] field1844 = new boolean[4700];

    @ObfuscatedName("dp.ae")
    public static int[] field1845 = new int[4700];

    @ObfuscatedName("dp.aj")
    public static int[] field1846 = new int[4700];

    @ObfuscatedName("dp.az")
    public static int[] field1828 = new int[4700];

    @ObfuscatedName("dp.al")
    public static int[] field1848 = new int[4700];

    @ObfuscatedName("dp.ag")
    public static int[] field1838 = new int[4700];

    @ObfuscatedName("dp.ad")
    public static int[] field1850 = new int[4700];

    @ObfuscatedName("dp.ao")
    public static int[] field1852 = new int[1600];

    @ObfuscatedName("dp.ak")
    public static int[][] field1822 = new int[1600][512];

    @ObfuscatedName("dp.at")
    public static int[] field1833 = new int[12];

    @ObfuscatedName("dp.aw")
    public static int[][] field1830 = new int[12][2000];

    @ObfuscatedName("dp.as")
    public static int[] field1856 = new int[2000];

    @ObfuscatedName("dp.aq")
    public static int[] field1836 = new int[2000];

    @ObfuscatedName("dp.ax")
    public static int[] field1872 = new int[12];

    @ObfuscatedName("dp.an")
    public static int[] field1859 = new int[10];

    @ObfuscatedName("dp.aa")
    public static int[] field1826 = new int[10];

    @ObfuscatedName("dp.ap")
    public static int[] field1861 = new int[10];

    @ObfuscatedName("dp.bf")
    public static boolean field1865 = false;

    @ObfuscatedName("dp.bp")
    public static int field1866 = 0;

    @ObfuscatedName("dp.bn")
    public static int field1867 = 0;

    @ObfuscatedName("dp.bg")
    public static int field1853 = 0;

    @ObfuscatedName("dp.bi")
    public static int[] field1860 = new int[1000];

    @ObfuscatedName("dp.bz")
    public static int[] field1855 = class92.field1574;

    @ObfuscatedName("dp.bw")
    public static int[] field1810 = class92.field1596;

    @ObfuscatedName("dp.bm")
    public static int[] field1825 = class92.field1591;

    @ObfuscatedName("dp.bh")
    public static int[] field1873 = class92.field1594;

    public class106() {
    }

    public class106(class106[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1814 = 0;
        this.field1818 = 0;
        this.field1868 = 0;
        this.field1829 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class106 var8 = arg0[var7];
            if (var8 != null) {
                this.field1814 += var8.field1814;
                this.field1818 += var8.field1818;
                this.field1868 += var8.field1868;
                if (var8.field1870 == null) {
                    if (this.field1829 == -1) {
                        this.field1829 = var8.field1829;
                    }
                    if (this.field1829 != var8.field1829) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1831 != null;
                var5 |= var8.field1857 != null;
                var6 |= var8.field1827 != null;
            }
        }
        this.field1839 = new int[this.field1814];
        this.field1816 = new int[this.field1814];
        this.field1817 = new int[this.field1814];
        this.field1819 = new int[this.field1818];
        this.field1820 = new int[this.field1818];
        this.field1821 = new int[this.field1818];
        this.field1858 = new int[this.field1818];
        this.field1823 = new int[this.field1818];
        this.field1847 = new int[this.field1818];
        if (var3) {
            this.field1870 = new byte[this.field1818];
        }
        if (var4) {
            this.field1831 = new byte[this.field1818];
        }
        if (var5) {
            this.field1857 = new short[this.field1818];
        }
        if (var6) {
            this.field1827 = new byte[this.field1818];
        }
        if (this.field1868 > 0) {
            this.field1815 = new int[this.field1868];
            this.field1832 = new int[this.field1868];
            this.field1849 = new int[this.field1868];
        }
        this.field1814 = 0;
        this.field1818 = 0;
        this.field1868 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class106 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1818; var11++) {
                    this.field1819[this.field1818] = var10.field1819[var11] + this.field1814;
                    this.field1820[this.field1818] = var10.field1820[var11] + this.field1814;
                    this.field1821[this.field1818] = var10.field1821[var11] + this.field1814;
                    this.field1858[this.field1818] = var10.field1858[var11];
                    this.field1823[this.field1818] = var10.field1823[var11];
                    this.field1847[this.field1818] = var10.field1847[var11];
                    if (var3) {
                        if (var10.field1870 == null) {
                            this.field1870[this.field1818] = var10.field1829;
                        } else {
                            this.field1870[this.field1818] = var10.field1870[var11];
                        }
                    }
                    if (var4 && var10.field1831 != null) {
                        this.field1831[this.field1818] = var10.field1831[var11];
                    }
                    if (var5) {
                        if (var10.field1857 == null) {
                            this.field1857[this.field1818] = -1;
                        } else {
                            this.field1857[this.field1818] = var10.field1857[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1827 == null || var10.field1827[var11] == -1) {
                            this.field1827[this.field1818] = -1;
                        } else {
                            this.field1827[this.field1818] = (byte) (var10.field1827[var11] + this.field1868);
                        }
                    }
                    this.field1818++;
                }
                for (int var12 = 0; var12 < var10.field1868; var12++) {
                    this.field1815[this.field1868] = var10.field1815[var12] + this.field1814;
                    this.field1832[this.field1868] = var10.field1832[var12] + this.field1814;
                    this.field1849[this.field1868] = var10.field1849[var12] + this.field1814;
                    this.field1868++;
                }
                for (int var13 = 0; var13 < var10.field1814; var13++) {
                    this.field1839[this.field1814] = var10.field1839[var13];
                    this.field1816[this.field1814] = var10.field1816[var13];
                    this.field1817[this.field1814] = var10.field1817[var13];
                    this.field1814++;
                }
            }
        }
    }

    @ObfuscatedName("dp.w([[IIIIZI)Ldp;")
    public class106 method2167(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2189();
        int var7 = arg1 - this.field1854;
        int var8 = this.field1854 + arg1;
        int var9 = arg3 - this.field1854;
        int var10 = this.field1854 + arg3;
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
            var15.field1814 = this.field1814;
            var15.field1818 = this.field1818;
            var15.field1868 = this.field1868;
            var15.field1839 = this.field1839;
            var15.field1817 = this.field1817;
            var15.field1819 = this.field1819;
            var15.field1820 = this.field1820;
            var15.field1821 = this.field1821;
            var15.field1858 = this.field1858;
            var15.field1823 = this.field1823;
            var15.field1847 = this.field1847;
            var15.field1870 = this.field1870;
            var15.field1831 = this.field1831;
            var15.field1827 = this.field1827;
            var15.field1857 = this.field1857;
            var15.field1829 = this.field1829;
            var15.field1815 = this.field1815;
            var15.field1832 = this.field1832;
            var15.field1849 = this.field1849;
            var15.field1834 = this.field1834;
            var15.field1835 = this.field1835;
            var15.field1871 = this.field1871;
            var15.field1816 = new int[var15.field1814];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1814; var16++) {
                int var17 = this.field1839[var16] + arg1;
                int var18 = this.field1817[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1816[var16] = this.field1816[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1814; var26++) {
                int var27 = (-this.field1816[var26] << 16) / this.field1468;
                if (var27 < arg5) {
                    int var28 = this.field1839[var26] + arg1;
                    int var29 = this.field1817[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1816[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1816[var26];
                }
            }
        }
        var15.field1837 = 0;
        return var15;
    }

    @ObfuscatedName("dp.x(Z)Ldp;")
    public class106 method2178(boolean arg0) {
        if (!arg0 && field1811.length < this.field1818) {
            field1811 = new byte[this.field1818 + 100];
        }
        return this.method2165(arg0, field1869, field1811);
    }

    @ObfuscatedName("dp.p(Z)Ldp;")
    public class106 method2169(boolean arg0) {
        if (!arg0 && field1813.length < this.field1818) {
            field1813 = new byte[this.field1818 + 100];
        }
        return this.method2165(arg0, field1812, field1813);
    }

    @ObfuscatedName("dp.e(ZLdp;[B)Ldp;")
    public class106 method2165(boolean arg0, class106 arg1, byte[] arg2) {
        arg1.field1814 = this.field1814;
        arg1.field1818 = this.field1818;
        arg1.field1868 = this.field1868;
        if (arg1.field1839 == null || arg1.field1839.length < this.field1814) {
            arg1.field1839 = new int[this.field1814 + 100];
            arg1.field1816 = new int[this.field1814 + 100];
            arg1.field1817 = new int[this.field1814 + 100];
        }
        for (int var4 = 0; var4 < this.field1814; var4++) {
            arg1.field1839[var4] = this.field1839[var4];
            arg1.field1816[var4] = this.field1816[var4];
            arg1.field1817[var4] = this.field1817[var4];
        }
        if (arg0) {
            arg1.field1831 = this.field1831;
        } else {
            arg1.field1831 = arg2;
            if (this.field1831 == null) {
                for (int var5 = 0; var5 < this.field1818; var5++) {
                    arg1.field1831[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1818; var6++) {
                    arg1.field1831[var6] = this.field1831[var6];
                }
            }
        }
        arg1.field1819 = this.field1819;
        arg1.field1820 = this.field1820;
        arg1.field1821 = this.field1821;
        arg1.field1858 = this.field1858;
        arg1.field1823 = this.field1823;
        arg1.field1847 = this.field1847;
        arg1.field1870 = this.field1870;
        arg1.field1827 = this.field1827;
        arg1.field1857 = this.field1857;
        arg1.field1829 = this.field1829;
        arg1.field1815 = this.field1815;
        arg1.field1832 = this.field1832;
        arg1.field1849 = this.field1849;
        arg1.field1834 = this.field1834;
        arg1.field1835 = this.field1835;
        arg1.field1871 = this.field1871;
        arg1.field1837 = 0;
        return arg1;
    }

    @ObfuscatedName("dp.y()V")
    public void method2189() {
        if (this.field1837 == 1) {
            return;
        }
        this.field1837 = 1;
        this.field1468 = 0;
        this.field1824 = 0;
        this.field1854 = 0;
        for (int var1 = 0; var1 < this.field1814; var1++) {
            int var2 = this.field1839[var1];
            int var3 = this.field1816[var1];
            int var4 = this.field1817[var1];
            if (-var3 > this.field1468) {
                this.field1468 = -var3;
            }
            if (var3 > this.field1824) {
                this.field1824 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1854) {
                this.field1854 = var5;
            }
        }
        this.field1854 = (int) (Math.sqrt((double) this.field1854) + 0.99D);
        this.field1841 = (int) (Math.sqrt((double) (this.field1468 * this.field1468 + this.field1854 * this.field1854)) + 0.99D);
        this.field1840 = this.field1841 + (int) (Math.sqrt((double) (this.field1854 * this.field1854 + this.field1824 * this.field1824)) + 0.99D);
    }

    @ObfuscatedName("dp.m()V")
    public void method2172() {
        if (this.field1837 == 2) {
            return;
        }
        this.field1837 = 2;
        this.field1854 = 0;
        for (int var1 = 0; var1 < this.field1814; var1++) {
            int var2 = this.field1839[var1];
            int var3 = this.field1816[var1];
            int var4 = this.field1817[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1854) {
                this.field1854 = var5;
            }
        }
        this.field1854 = (int) (Math.sqrt((double) this.field1854) + 0.99D);
        this.field1841 = this.field1854;
        this.field1840 = this.field1854 + this.field1854;
    }

    @ObfuscatedName("dp.c()I")
    public int method2173() {
        this.method2189();
        return this.field1854;
    }

    @ObfuscatedName("dp.v(Lco;I)V")
    public void method2234(class104 arg0, int arg1) {
        if (this.field1834 == null || arg1 == -1) {
            return;
        }
        class89 var3 = arg0.field1781[arg1];
        class103 var4 = var3.field1548;
        Statics.field1862 = 0;
        Statics.field1863 = 0;
        Statics.field1864 = 0;
        for (int var5 = 0; var5 < var3.field1549; var5++) {
            int var6 = var3.field1552[var5];
            this.method2176(var4.field1780[var6], var4.field1777[var6], var3.field1551[var5], var3.field1550[var5], var3.field1545[var5]);
        }
        this.field1837 = 0;
    }

    @ObfuscatedName("dp.l(Lco;ILco;I[I)V")
    public void method2175(class104 arg0, int arg1, class104 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2234(arg0, arg1);
            return;
        }
        class89 var6 = arg0.field1781[arg1];
        class89 var7 = arg2.field1781[arg3];
        class103 var8 = var6.field1548;
        Statics.field1862 = 0;
        Statics.field1863 = 0;
        Statics.field1864 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1549; var11++) {
            int var12 = var6.field1552[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1780[var12] == 0) {
                this.method2176(var8.field1780[var12], var8.field1777[var12], var6.field1551[var11], var6.field1550[var11], var6.field1545[var11]);
            }
        }
        Statics.field1862 = 0;
        Statics.field1863 = 0;
        Statics.field1864 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1549; var15++) {
            int var16 = var7.field1552[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1780[var16] == 0) {
                this.method2176(var8.field1780[var16], var8.field1777[var16], var7.field1551[var15], var7.field1550[var15], var7.field1545[var15]);
            }
        }
        this.field1837 = 0;
    }

    @ObfuscatedName("dp.z(I[IIII)V")
    public void method2176(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1862 = 0;
            Statics.field1863 = 0;
            Statics.field1864 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1834.length) {
                    int[] var10 = this.field1834[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1862 += this.field1839[var12];
                        Statics.field1863 += this.field1816[var12];
                        Statics.field1864 += this.field1817[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1862 = Statics.field1862 / var7 + arg2;
                Statics.field1863 = Statics.field1863 / var7 + arg3;
                Statics.field1864 = Statics.field1864 / var7 + arg4;
            } else {
                Statics.field1862 = arg2;
                Statics.field1863 = arg3;
                Statics.field1864 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1834.length) {
                    int[] var15 = this.field1834[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1839[var17] += arg2;
                        this.field1816[var17] += arg3;
                        this.field1817[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1834.length) {
                    int[] var20 = this.field1834[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1839[var22] -= Statics.field1862;
                        this.field1816[var22] -= Statics.field1863;
                        this.field1817[var22] -= Statics.field1864;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1855[var25];
                            int var27 = field1810[var25];
                            int var28 = this.field1839[var22] * var27 + this.field1816[var22] * var26 >> 16;
                            this.field1816[var22] = this.field1816[var22] * var27 - this.field1839[var22] * var26 >> 16;
                            this.field1839[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1855[var23];
                            int var30 = field1810[var23];
                            int var31 = this.field1816[var22] * var30 - this.field1817[var22] * var29 >> 16;
                            this.field1817[var22] = this.field1817[var22] * var30 + this.field1816[var22] * var29 >> 16;
                            this.field1816[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1855[var24];
                            int var33 = field1810[var24];
                            int var34 = this.field1839[var22] * var33 + this.field1817[var22] * var32 >> 16;
                            this.field1817[var22] = this.field1817[var22] * var33 - this.field1839[var22] * var32 >> 16;
                            this.field1839[var22] = var34;
                        }
                        this.field1839[var22] += Statics.field1862;
                        this.field1816[var22] += Statics.field1863;
                        this.field1817[var22] += Statics.field1864;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1834.length) {
                    int[] var37 = this.field1834[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1839[var39] -= Statics.field1862;
                        this.field1816[var39] -= Statics.field1863;
                        this.field1817[var39] -= Statics.field1864;
                        this.field1839[var39] = this.field1839[var39] * arg2 / 128;
                        this.field1816[var39] = this.field1816[var39] * arg3 / 128;
                        this.field1817[var39] = this.field1817[var39] * arg4 / 128;
                        this.field1839[var39] += Statics.field1862;
                        this.field1816[var39] += Statics.field1863;
                        this.field1817[var39] += Statics.field1864;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1835 != null && this.field1831 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1835.length) {
                    int[] var42 = this.field1835[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1831[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1831[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dp.s()V")
    public void method2177() {
        for (int var1 = 0; var1 < this.field1814; var1++) {
            int var2 = this.field1839[var1];
            this.field1839[var1] = this.field1817[var1];
            this.field1817[var1] = -var2;
        }
        this.field1837 = 0;
    }

    @ObfuscatedName("dp.j()V")
    public void method2174() {
        for (int var1 = 0; var1 < this.field1814; var1++) {
            this.field1839[var1] = -this.field1839[var1];
            this.field1817[var1] = -this.field1817[var1];
        }
        this.field1837 = 0;
    }

    @ObfuscatedName("dp.a()V")
    public void method2171() {
        for (int var1 = 0; var1 < this.field1814; var1++) {
            int var2 = this.field1817[var1];
            this.field1817[var1] = this.field1839[var1];
            this.field1839[var1] = -var2;
        }
        this.field1837 = 0;
    }

    @ObfuscatedName("dp.d(I)V")
    public void method2181(int arg0) {
        int var2 = field1855[arg0];
        int var3 = field1810[arg0];
        for (int var4 = 0; var4 < this.field1814; var4++) {
            int var5 = this.field1816[var4] * var3 - this.field1817[var4] * var2 >> 16;
            this.field1817[var4] = this.field1817[var4] * var3 + this.field1816[var4] * var2 >> 16;
            this.field1816[var4] = var5;
        }
        this.field1837 = 0;
    }

    @ObfuscatedName("dp.u(III)V")
    public void method2205(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1814; var4++) {
            this.field1839[var4] += arg0;
            this.field1816[var4] += arg1;
            this.field1817[var4] += arg2;
        }
        this.field1837 = 0;
    }

    @ObfuscatedName("dp.i(III)V")
    public void method2182(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1814; var4++) {
            this.field1839[var4] = this.field1839[var4] * arg0 / 128;
            this.field1816[var4] = this.field1816[var4] * arg1 / 128;
            this.field1817[var4] = this.field1817[var4] * arg2 / 128;
        }
        this.field1837 = 0;
    }

    @ObfuscatedName("dp.o(IIIIIII)V")
    public final void method2213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1852[0] = -1;
        if (this.field1837 != 2 && this.field1837 != 1) {
            this.method2172();
        }
        int var8 = Statics.field1593;
        int var9 = Statics.field1590;
        int var10 = field1855[arg0];
        int var11 = field1810[arg0];
        int var12 = field1855[arg1];
        int var13 = field1810[arg1];
        int var14 = field1855[arg2];
        int var15 = field1810[arg2];
        int var16 = field1855[arg3];
        int var17 = field1810[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1814; var19++) {
            int var20 = this.field1839[var19];
            int var21 = this.field1816[var19];
            int var22 = this.field1817[var19];
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
            field1828[var19] = var30 - var18;
            field1845[var19] = class92.field1581 * var26 / var30 + var8;
            field1846[var19] = class92.field1581 * var29 / var30 + var9;
            if (this.field1868 > 0) {
                field1848[var19] = var26;
                field1838[var19] = var29;
                field1850[var19] = var30;
            }
        }
        try {
            this.method2185(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dp.h(IIIIIIII)V")
    public final void method2222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1852[0] = -1;
        if (this.field1837 != 2 && this.field1837 != 1) {
            this.method2172();
        }
        int var9 = Statics.field1593;
        int var10 = Statics.field1590;
        int var11 = field1855[arg0];
        int var12 = field1810[arg0];
        int var13 = field1855[arg1];
        int var14 = field1810[arg1];
        int var15 = field1855[arg2];
        int var16 = field1810[arg2];
        int var17 = field1855[arg3];
        int var18 = field1810[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1814; var20++) {
            int var21 = this.field1839[var20];
            int var22 = this.field1816[var20];
            int var23 = this.field1817[var20];
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
            field1828[var20] = var31 - var19;
            field1845[var20] = class92.field1581 * var27 / arg7 + var9;
            field1846[var20] = class92.field1581 * var30 / arg7 + var10;
            if (this.field1868 > 0) {
                field1848[var20] = var27;
                field1838[var20] = var30;
                field1850[var20] = var31;
            }
        }
        try {
            this.method2185(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dp.aj(IIIIIIIII)V")
    public void method1780(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1852[0] = -1;
        if (this.field1837 != 1) {
            this.method2189();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1854 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1854) * class92.field1581;
        if (var15 / var13 >= Statics.field1587) {
            return;
        }
        int var16 = (this.field1854 + var14) * class92.field1581;
        if (var16 / var13 <= Statics.field1586) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1854 * arg1 >> 16;
        int var19 = (var17 + var18) * class92.field1581;
        if (var19 / var13 <= Statics.field1588) {
            return;
        }
        int var20 = (this.field1468 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class92.field1581;
        if (var21 / var13 >= Statics.field1589) {
            return;
        }
        int var22 = (this.field1468 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1868 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1865) {
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
            int var32 = field1866 - Statics.field1593;
            int var33 = field1867 - Statics.field1590;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1871) {
                    field1860[field1853++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1593;
        int var35 = Statics.field1590;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1855[arg0];
            var37 = field1810[arg0];
        }
        for (int var38 = 0; var38 < this.field1814; var38++) {
            int var39 = this.field1839[var38];
            int var40 = this.field1816[var38];
            int var41 = this.field1817[var38];
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
            field1828[var38] = var50 - var11;
            if (var50 >= 50) {
                field1845[var38] = class92.field1581 * var46 / var50 + var34;
                field1846[var38] = class92.field1581 * var49 / var50 + var35;
            } else {
                field1845[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1848[var38] = var46;
                field1838[var38] = var49;
                field1850[var38] = var50;
            }
        }
        try {
            this.method2185(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dp.k(ZZI)V")
    public final void method2185(boolean arg0, boolean arg1, int arg2) {
        if (this.field1840 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1840; var4++) {
            field1852[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1818; var5++) {
            if (this.field1847[var5] != -2) {
                int var6 = this.field1819[var5];
                int var7 = this.field1820[var5];
                int var8 = this.field1821[var5];
                int var9 = field1845[var6];
                int var10 = field1845[var7];
                int var11 = field1845[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1848[var6];
                    int var13 = field1848[var7];
                    int var14 = field1848[var8];
                    int var15 = field1838[var6];
                    int var16 = field1838[var7];
                    int var17 = field1838[var8];
                    int var18 = field1850[var6];
                    int var19 = field1850[var7];
                    int var20 = field1850[var8];
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
                        field1844[var5] = true;
                        int var30 = (field1828[var6] + field1828[var7] + field1828[var8]) / 3 + this.field1841;
                        field1822[var30][field1852[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2188(field1866, field1867, field1846[var6], field1846[var7], field1846[var8], var9, var10, var11)) {
                        field1860[field1853++] = arg2;
                        arg1 = false;
                    }
                    if ((field1846[var8] - field1846[var7]) * (var9 - var10) - (field1846[var6] - field1846[var7]) * (var11 - var10) > 0) {
                        field1844[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1584 && var10 <= Statics.field1584 && var11 <= Statics.field1584) {
                            field1843[var5] = false;
                        } else {
                            field1843[var5] = true;
                        }
                        int var31 = (field1828[var6] + field1828[var7] + field1828[var8]) / 3 + this.field1841;
                        field1822[var31][field1852[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1870 == null) {
            for (int var32 = this.field1840 - 1; var32 >= 0; var32--) {
                int var33 = field1852[var32];
                if (var33 > 0) {
                    int[] var34 = field1822[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2186(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1833[var36] = 0;
            field1872[var36] = 0;
        }
        for (int var37 = this.field1840 - 1; var37 >= 0; var37--) {
            int var38 = field1852[var37];
            if (var38 > 0) {
                int[] var39 = field1822[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1870[var41];
                    int var43 = field1833[var42]++;
                    field1830[var42][var43] = var41;
                    if (var42 < 10) {
                        field1872[var42] += var37;
                    } else if (var42 == 10) {
                        field1856[var43] = var37;
                    } else {
                        field1836[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1833[1] > 0 || field1833[2] > 0) {
            var44 = (field1872[1] + field1872[2]) / (field1833[1] + field1833[2]);
        }
        int var45 = 0;
        if (field1833[3] > 0 || field1833[4] > 0) {
            var45 = (field1872[3] + field1872[4]) / (field1833[3] + field1833[4]);
        }
        int var46 = 0;
        if (field1833[6] > 0 || field1833[8] > 0) {
            var46 = (field1872[6] + field1872[8]) / (field1833[6] + field1833[8]);
        }
        int var47 = 0;
        int var48 = field1833[10];
        int[] var49 = field1830[10];
        int[] var50 = field1856;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1833[11];
            var49 = field1830[11];
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
                this.method2186(var49[var47++]);
                if (var47 == var48 && field1830[11] != var49) {
                    var47 = 0;
                    var48 = field1833[11];
                    var49 = field1830[11];
                    var50 = field1836;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2186(var49[var47++]);
                if (var47 == var48 && field1830[11] != var49) {
                    var47 = 0;
                    var48 = field1833[11];
                    var49 = field1830[11];
                    var50 = field1836;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2186(var49[var47++]);
                if (var47 == var48 && field1830[11] != var49) {
                    var47 = 0;
                    var48 = field1833[11];
                    var49 = field1830[11];
                    var50 = field1836;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1833[var52];
            int[] var54 = field1830[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2186(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2186(var49[var47++]);
            if (var47 == var48 && field1830[11] != var49) {
                var47 = 0;
                var49 = field1830[11];
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

    @ObfuscatedName("dp.f(I)V")
    public final void method2186(int arg0) {
        if (field1844[arg0]) {
            this.method2187(arg0);
            return;
        }
        int var2 = this.field1819[arg0];
        int var3 = this.field1820[arg0];
        int var4 = this.field1821[arg0];
        class92.field1582 = field1843[arg0];
        if (this.field1831 == null) {
            class92.field1576 = 0;
        } else {
            class92.field1576 = this.field1831[arg0] & 0xFF;
        }
        if (this.field1857 != null && this.field1857[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1827 == null || this.field1827[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1827[arg0] & 0xFF;
                var6 = this.field1815[var5];
                var7 = this.field1832[var5];
                var8 = this.field1849[var5];
            }
            if (this.field1847[arg0] == -1) {
                class92.method1975(field1846[var2], field1846[var3], field1846[var4], field1845[var2], field1845[var3], field1845[var4], this.field1858[arg0], this.field1858[arg0], this.field1858[arg0], field1848[var6], field1848[var7], field1848[var8], field1838[var6], field1838[var7], field1838[var8], field1850[var6], field1850[var7], field1850[var8], this.field1857[arg0]);
            } else {
                class92.method1975(field1846[var2], field1846[var3], field1846[var4], field1845[var2], field1845[var3], field1845[var4], this.field1858[arg0], this.field1823[arg0], this.field1847[arg0], field1848[var6], field1848[var7], field1848[var8], field1838[var6], field1838[var7], field1838[var8], field1850[var6], field1850[var7], field1850[var8], this.field1857[arg0]);
            }
        } else if (this.field1847[arg0] == -1) {
            class92.method1972(field1846[var2], field1846[var3], field1846[var4], field1845[var2], field1845[var3], field1845[var4], field1825[this.field1858[arg0]]);
        } else {
            class92.method1970(field1846[var2], field1846[var3], field1846[var4], field1845[var2], field1845[var3], field1845[var4], this.field1858[arg0], this.field1823[arg0], this.field1847[arg0]);
        }
    }

    @ObfuscatedName("dp.r(I)V")
    public final void method2187(int arg0) {
        int var2 = Statics.field1593;
        int var3 = Statics.field1590;
        int var4 = 0;
        int var5 = this.field1819[arg0];
        int var6 = this.field1820[arg0];
        int var7 = this.field1821[arg0];
        int var8 = field1850[var5];
        int var9 = field1850[var6];
        int var10 = field1850[var7];
        if (this.field1831 == null) {
            class92.field1576 = 0;
        } else {
            class92.field1576 = this.field1831[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1859[var4] = field1845[var5];
            field1826[var4] = field1846[var5];
            field1861[var4++] = this.field1858[arg0];
        } else {
            int var11 = field1848[var5];
            int var12 = field1838[var5];
            int var13 = this.field1858[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1873[var10 - var8];
                field1859[var4] = (((field1848[var7] - var11) * var14 >> 16) + var11) * class92.field1581 / 50 + var2;
                field1826[var4] = (((field1838[var7] - var12) * var14 >> 16) + var12) * class92.field1581 / 50 + var3;
                field1861[var4++] = ((this.field1847[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1873[var9 - var8];
                field1859[var4] = (((field1848[var6] - var11) * var15 >> 16) + var11) * class92.field1581 / 50 + var2;
                field1826[var4] = (((field1838[var6] - var12) * var15 >> 16) + var12) * class92.field1581 / 50 + var3;
                field1861[var4++] = ((this.field1823[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1859[var4] = field1845[var6];
            field1826[var4] = field1846[var6];
            field1861[var4++] = this.field1823[arg0];
        } else {
            int var16 = field1848[var6];
            int var17 = field1838[var6];
            int var18 = this.field1823[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1873[var8 - var9];
                field1859[var4] = (((field1848[var5] - var16) * var19 >> 16) + var16) * class92.field1581 / 50 + var2;
                field1826[var4] = (((field1838[var5] - var17) * var19 >> 16) + var17) * class92.field1581 / 50 + var3;
                field1861[var4++] = ((this.field1858[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1873[var10 - var9];
                field1859[var4] = (((field1848[var7] - var16) * var20 >> 16) + var16) * class92.field1581 / 50 + var2;
                field1826[var4] = (((field1838[var7] - var17) * var20 >> 16) + var17) * class92.field1581 / 50 + var3;
                field1861[var4++] = ((this.field1847[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1859[var4] = field1845[var7];
            field1826[var4] = field1846[var7];
            field1861[var4++] = this.field1847[arg0];
        } else {
            int var21 = field1848[var7];
            int var22 = field1838[var7];
            int var23 = this.field1847[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1873[var9 - var10];
                field1859[var4] = (((field1848[var6] - var21) * var24 >> 16) + var21) * class92.field1581 / 50 + var2;
                field1826[var4] = (((field1838[var6] - var22) * var24 >> 16) + var22) * class92.field1581 / 50 + var3;
                field1861[var4++] = ((this.field1823[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1873[var8 - var10];
                field1859[var4] = (((field1848[var5] - var21) * var25 >> 16) + var21) * class92.field1581 / 50 + var2;
                field1826[var4] = (((field1838[var5] - var22) * var25 >> 16) + var22) * class92.field1581 / 50 + var3;
                field1861[var4++] = ((this.field1858[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1859[0];
        int var27 = field1859[1];
        int var28 = field1859[2];
        int var29 = field1826[0];
        int var30 = field1826[1];
        int var31 = field1826[2];
        class92.field1582 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1584 || var27 > Statics.field1584 || var28 > Statics.field1584) {
                class92.field1582 = true;
            }
            if (this.field1857 != null && this.field1857[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1827 == null || this.field1827[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1827[arg0] & 0xFF;
                    var33 = this.field1815[var32];
                    var34 = this.field1832[var32];
                    var35 = this.field1849[var32];
                }
                if (this.field1847[arg0] == -1) {
                    class92.method1975(var29, var30, var31, var26, var27, var28, this.field1858[arg0], this.field1858[arg0], this.field1858[arg0], field1848[var33], field1848[var34], field1848[var35], field1838[var33], field1838[var34], field1838[var35], field1850[var33], field1850[var34], field1850[var35], this.field1857[arg0]);
                } else {
                    class92.method1975(var29, var30, var31, var26, var27, var28, field1861[0], field1861[1], field1861[2], field1848[var33], field1848[var34], field1848[var35], field1838[var33], field1838[var34], field1838[var35], field1850[var33], field1850[var34], field1850[var35], this.field1857[arg0]);
                }
            } else if (this.field1847[arg0] == -1) {
                class92.method1972(var29, var30, var31, var26, var27, var28, field1825[this.field1858[arg0]]);
            } else {
                class92.method1970(var29, var30, var31, var26, var27, var28, field1861[0], field1861[1], field1861[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1584 || var27 > Statics.field1584 || var28 > Statics.field1584 || field1859[3] < 0 || field1859[3] > Statics.field1584) {
            class92.field1582 = true;
        }
        if (this.field1857 != null && this.field1857[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1827 == null || this.field1827[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1827[arg0] & 0xFF;
                var37 = this.field1815[var36];
                var38 = this.field1832[var36];
                var39 = this.field1849[var36];
            }
            short var40 = this.field1857[arg0];
            if (this.field1847[arg0] == -1) {
                class92.method1975(var29, var30, var31, var26, var27, var28, this.field1858[arg0], this.field1858[arg0], this.field1858[arg0], field1848[var37], field1848[var38], field1848[var39], field1838[var37], field1838[var38], field1838[var39], field1850[var37], field1850[var38], field1850[var39], var40);
                class92.method1975(var29, var31, field1826[3], var26, var28, field1859[3], this.field1858[arg0], this.field1858[arg0], this.field1858[arg0], field1848[var37], field1848[var38], field1848[var39], field1838[var37], field1838[var38], field1838[var39], field1850[var37], field1850[var38], field1850[var39], var40);
            } else {
                class92.method1975(var29, var30, var31, var26, var27, var28, field1861[0], field1861[1], field1861[2], field1848[var37], field1848[var38], field1848[var39], field1838[var37], field1838[var38], field1838[var39], field1850[var37], field1850[var38], field1850[var39], var40);
                class92.method1975(var29, var31, field1826[3], var26, var28, field1859[3], field1861[0], field1861[2], field1861[3], field1848[var37], field1848[var38], field1848[var39], field1838[var37], field1838[var38], field1838[var39], field1850[var37], field1850[var38], field1850[var39], var40);
            }
        } else if (this.field1847[arg0] == -1) {
            int var41 = field1825[this.field1858[arg0]];
            class92.method1972(var29, var30, var31, var26, var27, var28, var41);
            class92.method1972(var29, var31, field1826[3], var26, var28, field1859[3], var41);
        } else {
            class92.method1970(var29, var30, var31, var26, var27, var28, field1861[0], field1861[1], field1861[2]);
            class92.method1970(var29, var31, field1826[3], var26, var28, field1859[3], field1861[0], field1861[2], field1861[3]);
        }
    }

    @ObfuscatedName("dp.n(IIIIIIII)Z")
    public final boolean method2188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
