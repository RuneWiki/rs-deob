package deob;

@ObfuscatedName("df")
public class class106 extends class86 {

    @ObfuscatedName("df.j")
    public static class106 field1805 = new class106();

    @ObfuscatedName("df.h")
    public static byte[] field1785 = new byte[1];

    @ObfuscatedName("df.m")
    public static class106 field1792 = new class106();

    @ObfuscatedName("df.z")
    public static byte[] field1809 = new byte[1];

    @ObfuscatedName("df.x")
    public int field1788 = 0;

    @ObfuscatedName("df.e")
    public int[] field1789;

    @ObfuscatedName("df.i")
    public int[] field1790;

    @ObfuscatedName("df.c")
    public int[] field1845;

    @ObfuscatedName("df.n")
    public int field1797 = 0;

    @ObfuscatedName("df.l")
    public int[] field1793;

    @ObfuscatedName("df.u")
    public int[] field1794;

    @ObfuscatedName("df.r")
    public int[] field1832;

    @ObfuscatedName("df.a")
    public int[] field1796;

    @ObfuscatedName("df.d")
    public int[] field1784;

    @ObfuscatedName("df.p")
    public int[] field1798;

    @ObfuscatedName("df.q")
    public byte[] field1827;

    @ObfuscatedName("df.b")
    public byte[] field1800;

    @ObfuscatedName("df.t")
    public byte[] field1801;

    @ObfuscatedName("df.y")
    public short[] field1802;

    @ObfuscatedName("df.w")
    public byte field1803 = 0;

    @ObfuscatedName("df.g")
    public int field1804 = 0;

    @ObfuscatedName("df.s")
    public int[] field1787;

    @ObfuscatedName("df.k")
    public int[] field1806;

    @ObfuscatedName("df.o")
    public int[] field1807;

    @ObfuscatedName("df.v")
    public int[][] field1808;

    @ObfuscatedName("df.f")
    public int[][] field1846;

    @ObfuscatedName("df.au")
    public boolean field1810 = false;

    @ObfuscatedName("df.aq")
    public int field1839;

    @ObfuscatedName("df.ab")
    public int field1812;

    @ObfuscatedName("df.am")
    public int field1813;

    @ObfuscatedName("df.an")
    public int field1814;

    @ObfuscatedName("df.aj")
    public int field1815;

    @ObfuscatedName("df.ao")
    public static boolean[] field1817 = new boolean[4700];

    @ObfuscatedName("df.ag")
    public static boolean[] field1842 = new boolean[4700];

    @ObfuscatedName("df.as")
    public static int[] field1818 = new int[4700];

    @ObfuscatedName("df.az")
    public static int[] field1820 = new int[4700];

    @ObfuscatedName("df.av")
    public static int[] field1791 = new int[4700];

    @ObfuscatedName("df.ax")
    public static int[] field1838 = new int[4700];

    @ObfuscatedName("df.aa")
    public static int[] field1823 = new int[4700];

    @ObfuscatedName("df.ah")
    public static int[] field1824 = new int[4700];

    @ObfuscatedName("df.ae")
    public static int[] field1826 = new int[1600];

    @ObfuscatedName("df.at")
    public static int[][] field1821 = new int[1600][512];

    @ObfuscatedName("df.ar")
    public static int[] field1834 = new int[12];

    @ObfuscatedName("df.aw")
    public static int[][] field1829 = new int[12][2000];

    @ObfuscatedName("df.ac")
    public static int[] field1822 = new int[2000];

    @ObfuscatedName("df.ap")
    public static int[] field1831 = new int[2000];

    @ObfuscatedName("df.af")
    public static int[] field1828 = new int[12];

    @ObfuscatedName("df.al")
    public static int[] field1833 = new int[10];

    @ObfuscatedName("df.ad")
    public static int[] field1819 = new int[10];

    @ObfuscatedName("df.ak")
    public static int[] field1835 = new int[10];

    @ObfuscatedName("df.bx")
    public static boolean field1816 = false;

    @ObfuscatedName("df.be")
    public static int field1840 = 0;

    @ObfuscatedName("df.bo")
    public static int field1841 = 0;

    @ObfuscatedName("df.bn")
    public static int field1799 = 0;

    @ObfuscatedName("df.bm")
    public static int[] field1825 = new int[1000];

    @ObfuscatedName("df.ba")
    public static int[] field1844 = class92.field1572;

    @ObfuscatedName("df.bq")
    public static int[] field1811 = class92.field1573;

    @ObfuscatedName("df.bc")
    public static int[] field1836 = class92.field1568;

    @ObfuscatedName("df.bs")
    public static int[] field1847 = class92.field1571;

    public class106() {
    }

    public class106(class106[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1788 = 0;
        this.field1797 = 0;
        this.field1804 = 0;
        this.field1803 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class106 var8 = arg0[var7];
            if (var8 != null) {
                this.field1788 += var8.field1788;
                this.field1797 += var8.field1797;
                this.field1804 += var8.field1804;
                if (var8.field1827 == null) {
                    if (this.field1803 == -1) {
                        this.field1803 = var8.field1803;
                    }
                    if (this.field1803 != var8.field1803) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1800 != null;
                var5 |= var8.field1802 != null;
                var6 |= var8.field1801 != null;
            }
        }
        this.field1789 = new int[this.field1788];
        this.field1790 = new int[this.field1788];
        this.field1845 = new int[this.field1788];
        this.field1793 = new int[this.field1797];
        this.field1794 = new int[this.field1797];
        this.field1832 = new int[this.field1797];
        this.field1796 = new int[this.field1797];
        this.field1784 = new int[this.field1797];
        this.field1798 = new int[this.field1797];
        if (var3) {
            this.field1827 = new byte[this.field1797];
        }
        if (var4) {
            this.field1800 = new byte[this.field1797];
        }
        if (var5) {
            this.field1802 = new short[this.field1797];
        }
        if (var6) {
            this.field1801 = new byte[this.field1797];
        }
        if (this.field1804 > 0) {
            this.field1787 = new int[this.field1804];
            this.field1806 = new int[this.field1804];
            this.field1807 = new int[this.field1804];
        }
        this.field1788 = 0;
        this.field1797 = 0;
        this.field1804 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class106 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1797; var11++) {
                    this.field1793[this.field1797] = var10.field1793[var11] + this.field1788;
                    this.field1794[this.field1797] = var10.field1794[var11] + this.field1788;
                    this.field1832[this.field1797] = var10.field1832[var11] + this.field1788;
                    this.field1796[this.field1797] = var10.field1796[var11];
                    this.field1784[this.field1797] = var10.field1784[var11];
                    this.field1798[this.field1797] = var10.field1798[var11];
                    if (var3) {
                        if (var10.field1827 == null) {
                            this.field1827[this.field1797] = var10.field1803;
                        } else {
                            this.field1827[this.field1797] = var10.field1827[var11];
                        }
                    }
                    if (var4 && var10.field1800 != null) {
                        this.field1800[this.field1797] = var10.field1800[var11];
                    }
                    if (var5) {
                        if (var10.field1802 == null) {
                            this.field1802[this.field1797] = -1;
                        } else {
                            this.field1802[this.field1797] = var10.field1802[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1801 == null || var10.field1801[var11] == -1) {
                            this.field1801[this.field1797] = -1;
                        } else {
                            this.field1801[this.field1797] = (byte) (var10.field1801[var11] + this.field1804);
                        }
                    }
                    this.field1797++;
                }
                for (int var12 = 0; var12 < var10.field1804; var12++) {
                    this.field1787[this.field1804] = var10.field1787[var12] + this.field1788;
                    this.field1806[this.field1804] = var10.field1806[var12] + this.field1788;
                    this.field1807[this.field1804] = var10.field1807[var12] + this.field1788;
                    this.field1804++;
                }
                for (int var13 = 0; var13 < var10.field1788; var13++) {
                    this.field1789[this.field1788] = var10.field1789[var13];
                    this.field1790[this.field1788] = var10.field1790[var13];
                    this.field1845[this.field1788] = var10.field1845[var13];
                    this.field1788++;
                }
            }
        }
    }

    @ObfuscatedName("df.j([[IIIIZI)Ldf;")
    public class106 method2213(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2203();
        int var7 = arg1 - this.field1813;
        int var8 = this.field1813 + arg1;
        int var9 = arg3 - this.field1813;
        int var10 = this.field1813 + arg3;
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
            var15.field1788 = this.field1788;
            var15.field1797 = this.field1797;
            var15.field1804 = this.field1804;
            var15.field1789 = this.field1789;
            var15.field1845 = this.field1845;
            var15.field1793 = this.field1793;
            var15.field1794 = this.field1794;
            var15.field1832 = this.field1832;
            var15.field1796 = this.field1796;
            var15.field1784 = this.field1784;
            var15.field1798 = this.field1798;
            var15.field1827 = this.field1827;
            var15.field1800 = this.field1800;
            var15.field1801 = this.field1801;
            var15.field1802 = this.field1802;
            var15.field1803 = this.field1803;
            var15.field1787 = this.field1787;
            var15.field1806 = this.field1806;
            var15.field1807 = this.field1807;
            var15.field1808 = this.field1808;
            var15.field1846 = this.field1846;
            var15.field1810 = this.field1810;
            var15.field1790 = new int[var15.field1788];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1788; var16++) {
                int var17 = this.field1789[var16] + arg1;
                int var18 = this.field1845[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1790[var16] = this.field1790[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1788; var26++) {
                int var27 = (-this.field1790[var26] << 16) / this.field1444;
                if (var27 < arg5) {
                    int var28 = this.field1789[var26] + arg1;
                    int var29 = this.field1845[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1790[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1790[var26];
                }
            }
        }
        var15.field1839 = 0;
        return var15;
    }

    @ObfuscatedName("df.h(Z)Ldf;")
    public class106 method2157(boolean arg0) {
        if (!arg0 && field1785.length < this.field1797) {
            field1785 = new byte[this.field1797 + 100];
        }
        return this.method2159(arg0, field1805, field1785);
    }

    @ObfuscatedName("df.z(Z)Ldf;")
    public class106 method2158(boolean arg0) {
        if (!arg0 && field1809.length < this.field1797) {
            field1809 = new byte[this.field1797 + 100];
        }
        return this.method2159(arg0, field1792, field1809);
    }

    @ObfuscatedName("df.x(ZLdf;[B)Ldf;")
    public class106 method2159(boolean arg0, class106 arg1, byte[] arg2) {
        arg1.field1788 = this.field1788;
        arg1.field1797 = this.field1797;
        arg1.field1804 = this.field1804;
        if (arg1.field1789 == null || arg1.field1789.length < this.field1788) {
            arg1.field1789 = new int[this.field1788 + 100];
            arg1.field1790 = new int[this.field1788 + 100];
            arg1.field1845 = new int[this.field1788 + 100];
        }
        for (int var4 = 0; var4 < this.field1788; var4++) {
            arg1.field1789[var4] = this.field1789[var4];
            arg1.field1790[var4] = this.field1790[var4];
            arg1.field1845[var4] = this.field1845[var4];
        }
        if (arg0) {
            arg1.field1800 = this.field1800;
        } else {
            arg1.field1800 = arg2;
            if (this.field1800 == null) {
                for (int var5 = 0; var5 < this.field1797; var5++) {
                    arg1.field1800[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1797; var6++) {
                    arg1.field1800[var6] = this.field1800[var6];
                }
            }
        }
        arg1.field1793 = this.field1793;
        arg1.field1794 = this.field1794;
        arg1.field1832 = this.field1832;
        arg1.field1796 = this.field1796;
        arg1.field1784 = this.field1784;
        arg1.field1798 = this.field1798;
        arg1.field1827 = this.field1827;
        arg1.field1801 = this.field1801;
        arg1.field1802 = this.field1802;
        arg1.field1803 = this.field1803;
        arg1.field1787 = this.field1787;
        arg1.field1806 = this.field1806;
        arg1.field1807 = this.field1807;
        arg1.field1808 = this.field1808;
        arg1.field1846 = this.field1846;
        arg1.field1810 = this.field1810;
        arg1.field1839 = 0;
        return arg1;
    }

    @ObfuscatedName("df.e()V")
    public void method2203() {
        if (this.field1839 == 1) {
            return;
        }
        this.field1839 = 1;
        this.field1444 = 0;
        this.field1812 = 0;
        this.field1813 = 0;
        for (int var1 = 0; var1 < this.field1788; var1++) {
            int var2 = this.field1789[var1];
            int var3 = this.field1790[var1];
            int var4 = this.field1845[var1];
            if (-var3 > this.field1444) {
                this.field1444 = -var3;
            }
            if (var3 > this.field1812) {
                this.field1812 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1813) {
                this.field1813 = var5;
            }
        }
        this.field1813 = (int) (Math.sqrt((double) this.field1813) + 0.99D);
        this.field1815 = (int) (Math.sqrt((double) (this.field1444 * this.field1444 + this.field1813 * this.field1813)) + 0.99D);
        this.field1814 = this.field1815 + (int) (Math.sqrt((double) (this.field1813 * this.field1813 + this.field1812 * this.field1812)) + 0.99D);
    }

    @ObfuscatedName("df.i()V")
    public void method2181() {
        if (this.field1839 == 2) {
            return;
        }
        this.field1839 = 2;
        this.field1813 = 0;
        for (int var1 = 0; var1 < this.field1788; var1++) {
            int var2 = this.field1789[var1];
            int var3 = this.field1790[var1];
            int var4 = this.field1845[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1813) {
                this.field1813 = var5;
            }
        }
        this.field1813 = (int) (Math.sqrt((double) this.field1813) + 0.99D);
        this.field1815 = this.field1813;
        this.field1814 = this.field1813 + this.field1813;
    }

    @ObfuscatedName("df.c()I")
    public int method2189() {
        this.method2203();
        return this.field1813;
    }

    @ObfuscatedName("df.n(Lch;I)V")
    public void method2161(class104 arg0, int arg1) {
        if (this.field1808 == null || arg1 == -1) {
            return;
        }
        class89 var3 = arg0.field1756[arg1];
        class103 var4 = var3.field1519;
        Statics.field1843 = 0;
        Statics.field1837 = 0;
        Statics.field1795 = 0;
        for (int var5 = 0; var5 < var3.field1524; var5++) {
            int var6 = var3.field1525[var5];
            this.method2163(var4.field1745[var6], var4.field1743[var6], var3.field1526[var5], var3.field1528[var5], var3.field1523[var5]);
        }
        this.field1839 = 0;
    }

    @ObfuscatedName("df.l(Lch;ILch;I[I)V")
    public void method2162(class104 arg0, int arg1, class104 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2161(arg0, arg1);
            return;
        }
        class89 var6 = arg0.field1756[arg1];
        class89 var7 = arg2.field1756[arg3];
        class103 var8 = var6.field1519;
        Statics.field1843 = 0;
        Statics.field1837 = 0;
        Statics.field1795 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1524; var11++) {
            int var12 = var6.field1525[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1745[var12] == 0) {
                this.method2163(var8.field1745[var12], var8.field1743[var12], var6.field1526[var11], var6.field1528[var11], var6.field1523[var11]);
            }
        }
        Statics.field1843 = 0;
        Statics.field1837 = 0;
        Statics.field1795 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1524; var15++) {
            int var16 = var7.field1525[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1745[var16] == 0) {
                this.method2163(var8.field1745[var16], var8.field1743[var16], var7.field1526[var15], var7.field1528[var15], var7.field1523[var15]);
            }
        }
        this.field1839 = 0;
    }

    @ObfuscatedName("df.u(I[IIII)V")
    public void method2163(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1843 = 0;
            Statics.field1837 = 0;
            Statics.field1795 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1808.length) {
                    int[] var10 = this.field1808[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1843 += this.field1789[var12];
                        Statics.field1837 += this.field1790[var12];
                        Statics.field1795 += this.field1845[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1843 = Statics.field1843 / var7 + arg2;
                Statics.field1837 = Statics.field1837 / var7 + arg3;
                Statics.field1795 = Statics.field1795 / var7 + arg4;
            } else {
                Statics.field1843 = arg2;
                Statics.field1837 = arg3;
                Statics.field1795 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1808.length) {
                    int[] var15 = this.field1808[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1789[var17] += arg2;
                        this.field1790[var17] += arg3;
                        this.field1845[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1808.length) {
                    int[] var20 = this.field1808[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1789[var22] -= Statics.field1843;
                        this.field1790[var22] -= Statics.field1837;
                        this.field1845[var22] -= Statics.field1795;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1844[var25];
                            int var27 = field1811[var25];
                            int var28 = this.field1790[var22] * var26 + this.field1789[var22] * var27 >> 16;
                            this.field1790[var22] = this.field1790[var22] * var27 - this.field1789[var22] * var26 >> 16;
                            this.field1789[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1844[var23];
                            int var30 = field1811[var23];
                            int var31 = this.field1790[var22] * var30 - this.field1845[var22] * var29 >> 16;
                            this.field1845[var22] = this.field1845[var22] * var30 + this.field1790[var22] * var29 >> 16;
                            this.field1790[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1844[var24];
                            int var33 = field1811[var24];
                            int var34 = this.field1845[var22] * var32 + this.field1789[var22] * var33 >> 16;
                            this.field1845[var22] = this.field1845[var22] * var33 - this.field1789[var22] * var32 >> 16;
                            this.field1789[var22] = var34;
                        }
                        this.field1789[var22] += Statics.field1843;
                        this.field1790[var22] += Statics.field1837;
                        this.field1845[var22] += Statics.field1795;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1808.length) {
                    int[] var37 = this.field1808[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1789[var39] -= Statics.field1843;
                        this.field1790[var39] -= Statics.field1837;
                        this.field1845[var39] -= Statics.field1795;
                        this.field1789[var39] = this.field1789[var39] * arg2 / 128;
                        this.field1790[var39] = this.field1790[var39] * arg3 / 128;
                        this.field1845[var39] = this.field1845[var39] * arg4 / 128;
                        this.field1789[var39] += Statics.field1843;
                        this.field1790[var39] += Statics.field1837;
                        this.field1845[var39] += Statics.field1795;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1846 != null && this.field1800 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1846.length) {
                    int[] var42 = this.field1846[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1800[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1800[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("df.a()V")
    public void method2164() {
        for (int var1 = 0; var1 < this.field1788; var1++) {
            int var2 = this.field1789[var1];
            this.field1789[var1] = this.field1845[var1];
            this.field1845[var1] = -var2;
        }
        this.field1839 = 0;
    }

    @ObfuscatedName("df.d()V")
    public void method2178() {
        for (int var1 = 0; var1 < this.field1788; var1++) {
            this.field1789[var1] = -this.field1789[var1];
            this.field1845[var1] = -this.field1845[var1];
        }
        this.field1839 = 0;
    }

    @ObfuscatedName("df.p()V")
    public void method2166() {
        for (int var1 = 0; var1 < this.field1788; var1++) {
            int var2 = this.field1845[var1];
            this.field1845[var1] = this.field1789[var1];
            this.field1789[var1] = -var2;
        }
        this.field1839 = 0;
    }

    @ObfuscatedName("df.q(I)V")
    public void method2198(int arg0) {
        int var2 = field1844[arg0];
        int var3 = field1811[arg0];
        for (int var4 = 0; var4 < this.field1788; var4++) {
            int var5 = this.field1790[var4] * var3 - this.field1845[var4] * var2 >> 16;
            this.field1845[var4] = this.field1845[var4] * var3 + this.field1790[var4] * var2 >> 16;
            this.field1790[var4] = var5;
        }
        this.field1839 = 0;
    }

    @ObfuscatedName("df.b(III)V")
    public void method2168(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1788; var4++) {
            this.field1789[var4] += arg0;
            this.field1790[var4] += arg1;
            this.field1845[var4] += arg2;
        }
        this.field1839 = 0;
    }

    @ObfuscatedName("df.t(III)V")
    public void method2192(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1788; var4++) {
            this.field1789[var4] = this.field1789[var4] * arg0 / 128;
            this.field1790[var4] = this.field1790[var4] * arg1 / 128;
            this.field1845[var4] = this.field1845[var4] * arg2 / 128;
        }
        this.field1839 = 0;
    }

    @ObfuscatedName("df.y(IIIIIII)V")
    public final void method2170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1826[0] = -1;
        if (this.field1839 != 2 && this.field1839 != 1) {
            this.method2181();
        }
        int var8 = Statics.field1560;
        int var9 = Statics.field1549;
        int var10 = field1844[arg0];
        int var11 = field1811[arg0];
        int var12 = field1844[arg1];
        int var13 = field1811[arg1];
        int var14 = field1844[arg2];
        int var15 = field1811[arg2];
        int var16 = field1844[arg3];
        int var17 = field1811[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1788; var19++) {
            int var20 = this.field1789[var19];
            int var21 = this.field1790[var19];
            int var22 = this.field1845[var19];
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
            field1791[var19] = var30 - var18;
            field1818[var19] = class92.field1554 * var26 / var30 + var8;
            field1820[var19] = class92.field1554 * var29 / var30 + var9;
            if (this.field1804 > 0) {
                field1838[var19] = var26;
                field1823[var19] = var29;
                field1824[var19] = var30;
            }
        }
        try {
            this.method2172(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("df.w(IIIIIIII)V")
    public final void method2176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1826[0] = -1;
        if (this.field1839 != 2 && this.field1839 != 1) {
            this.method2181();
        }
        int var9 = Statics.field1560;
        int var10 = Statics.field1549;
        int var11 = field1844[arg0];
        int var12 = field1811[arg0];
        int var13 = field1844[arg1];
        int var14 = field1811[arg1];
        int var15 = field1844[arg2];
        int var16 = field1811[arg2];
        int var17 = field1844[arg3];
        int var18 = field1811[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1788; var20++) {
            int var21 = this.field1789[var20];
            int var22 = this.field1790[var20];
            int var23 = this.field1845[var20];
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
            field1791[var20] = var31 - var19;
            field1818[var20] = class92.field1554 * var27 / arg7 + var9;
            field1820[var20] = class92.field1554 * var30 / arg7 + var10;
            if (this.field1804 > 0) {
                field1838[var20] = var27;
                field1823[var20] = var30;
                field1824[var20] = var31;
            }
        }
        try {
            this.method2172(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("df.au(IIIIIIIII)V")
    public void method1782(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1826[0] = -1;
        if (this.field1839 != 1) {
            this.method2203();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1813 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1813) * class92.field1554;
        if (var15 / var13 >= Statics.field1562) {
            return;
        }
        int var16 = (this.field1813 + var14) * class92.field1554;
        if (var16 / var13 <= Statics.field1563) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1813 * arg1 >> 16;
        int var19 = (var17 + var18) * class92.field1554;
        if (var19 / var13 <= Statics.field1565) {
            return;
        }
        int var20 = (this.field1444 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class92.field1554;
        if (var21 / var13 >= Statics.field1566) {
            return;
        }
        int var22 = (this.field1444 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1804 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1816) {
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
            int var32 = field1840 - Statics.field1560;
            int var33 = field1841 - Statics.field1549;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1810) {
                    field1825[field1799++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1560;
        int var35 = Statics.field1549;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1844[arg0];
            var37 = field1811[arg0];
        }
        for (int var38 = 0; var38 < this.field1788; var38++) {
            int var39 = this.field1789[var38];
            int var40 = this.field1790[var38];
            int var41 = this.field1845[var38];
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
            field1791[var38] = var50 - var11;
            if (var50 >= 50) {
                field1818[var38] = class92.field1554 * var46 / var50 + var34;
                field1820[var38] = class92.field1554 * var49 / var50 + var35;
            } else {
                field1818[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1838[var38] = var46;
                field1823[var38] = var49;
                field1824[var38] = var50;
            }
        }
        try {
            this.method2172(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("df.g(ZZI)V")
    public final void method2172(boolean arg0, boolean arg1, int arg2) {
        if (this.field1814 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1814; var4++) {
            field1826[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1797; var5++) {
            if (this.field1798[var5] != -2) {
                int var6 = this.field1793[var5];
                int var7 = this.field1794[var5];
                int var8 = this.field1832[var5];
                int var9 = field1818[var6];
                int var10 = field1818[var7];
                int var11 = field1818[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1838[var6];
                    int var13 = field1838[var7];
                    int var14 = field1838[var8];
                    int var15 = field1823[var6];
                    int var16 = field1823[var7];
                    int var17 = field1823[var8];
                    int var18 = field1824[var6];
                    int var19 = field1824[var7];
                    int var20 = field1824[var8];
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
                        field1842[var5] = true;
                        int var30 = (field1791[var6] + field1791[var7] + field1791[var8]) / 3 + this.field1815;
                        field1821[var30][field1826[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2175(field1840, field1841, field1820[var6], field1820[var7], field1820[var8], var9, var10, var11)) {
                        field1825[field1799++] = arg2;
                        arg1 = false;
                    }
                    if ((field1820[var8] - field1820[var7]) * (var9 - var10) - (field1820[var6] - field1820[var7]) * (var11 - var10) > 0) {
                        field1842[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1561 && var10 <= Statics.field1561 && var11 <= Statics.field1561) {
                            field1817[var5] = false;
                        } else {
                            field1817[var5] = true;
                        }
                        int var31 = (field1791[var6] + field1791[var7] + field1791[var8]) / 3 + this.field1815;
                        field1821[var31][field1826[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1827 == null) {
            for (int var32 = this.field1814 - 1; var32 >= 0; var32--) {
                int var33 = field1826[var32];
                if (var33 > 0) {
                    int[] var34 = field1821[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2173(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1834[var36] = 0;
            field1828[var36] = 0;
        }
        for (int var37 = this.field1814 - 1; var37 >= 0; var37--) {
            int var38 = field1826[var37];
            if (var38 > 0) {
                int[] var39 = field1821[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1827[var41];
                    int var43 = field1834[var42]++;
                    field1829[var42][var43] = var41;
                    if (var42 < 10) {
                        field1828[var42] += var37;
                    } else if (var42 == 10) {
                        field1822[var43] = var37;
                    } else {
                        field1831[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1834[1] > 0 || field1834[2] > 0) {
            var44 = (field1828[1] + field1828[2]) / (field1834[1] + field1834[2]);
        }
        int var45 = 0;
        if (field1834[3] > 0 || field1834[4] > 0) {
            var45 = (field1828[3] + field1828[4]) / (field1834[3] + field1834[4]);
        }
        int var46 = 0;
        if (field1834[6] > 0 || field1834[8] > 0) {
            var46 = (field1828[6] + field1828[8]) / (field1834[6] + field1834[8]);
        }
        int var47 = 0;
        int var48 = field1834[10];
        int[] var49 = field1829[10];
        int[] var50 = field1822;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1834[11];
            var49 = field1829[11];
            var50 = field1831;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2173(var49[var47++]);
                if (var47 == var48 && field1829[11] != var49) {
                    var47 = 0;
                    var48 = field1834[11];
                    var49 = field1829[11];
                    var50 = field1831;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2173(var49[var47++]);
                if (var47 == var48 && field1829[11] != var49) {
                    var47 = 0;
                    var48 = field1834[11];
                    var49 = field1829[11];
                    var50 = field1831;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2173(var49[var47++]);
                if (var47 == var48 && field1829[11] != var49) {
                    var47 = 0;
                    var48 = field1834[11];
                    var49 = field1829[11];
                    var50 = field1831;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1834[var52];
            int[] var54 = field1829[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2173(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2173(var49[var47++]);
            if (var47 == var48 && field1829[11] != var49) {
                var47 = 0;
                var49 = field1829[11];
                var48 = field1834[11];
                var50 = field1831;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("df.s(I)V")
    public final void method2173(int arg0) {
        if (field1842[arg0]) {
            this.method2174(arg0);
            return;
        }
        int var2 = this.field1793[arg0];
        int var3 = this.field1794[arg0];
        int var4 = this.field1832[arg0];
        class92.field1569 = field1817[arg0];
        if (this.field1800 == null) {
            class92.field1553 = 0;
        } else {
            class92.field1553 = this.field1800[arg0] & 0xFF;
        }
        if (this.field1802 != null && this.field1802[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1801 == null || this.field1801[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1801[arg0] & 0xFF;
                var6 = this.field1787[var5];
                var7 = this.field1806[var5];
                var8 = this.field1807[var5];
            }
            if (this.field1798[arg0] == -1) {
                class92.method1997(field1820[var2], field1820[var3], field1820[var4], field1818[var2], field1818[var3], field1818[var4], this.field1796[arg0], this.field1796[arg0], this.field1796[arg0], field1838[var6], field1838[var7], field1838[var8], field1823[var6], field1823[var7], field1823[var8], field1824[var6], field1824[var7], field1824[var8], this.field1802[arg0]);
            } else {
                class92.method1997(field1820[var2], field1820[var3], field1820[var4], field1818[var2], field1818[var3], field1818[var4], this.field1796[arg0], this.field1784[arg0], this.field1798[arg0], field1838[var6], field1838[var7], field1838[var8], field1823[var6], field1823[var7], field1823[var8], field1824[var6], field1824[var7], field1824[var8], this.field1802[arg0]);
            }
        } else if (this.field1798[arg0] == -1) {
            class92.method1978(field1820[var2], field1820[var3], field1820[var4], field1818[var2], field1818[var3], field1818[var4], field1836[this.field1796[arg0]]);
        } else {
            class92.method1984(field1820[var2], field1820[var3], field1820[var4], field1818[var2], field1818[var3], field1818[var4], this.field1796[arg0], this.field1784[arg0], this.field1798[arg0]);
        }
    }

    @ObfuscatedName("df.k(I)V")
    public final void method2174(int arg0) {
        int var2 = Statics.field1560;
        int var3 = Statics.field1549;
        int var4 = 0;
        int var5 = this.field1793[arg0];
        int var6 = this.field1794[arg0];
        int var7 = this.field1832[arg0];
        int var8 = field1824[var5];
        int var9 = field1824[var6];
        int var10 = field1824[var7];
        if (this.field1800 == null) {
            class92.field1553 = 0;
        } else {
            class92.field1553 = this.field1800[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1833[var4] = field1818[var5];
            field1819[var4] = field1820[var5];
            field1835[var4++] = this.field1796[arg0];
        } else {
            int var11 = field1838[var5];
            int var12 = field1823[var5];
            int var13 = this.field1796[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1847[var10 - var8];
                field1833[var4] = (((field1838[var7] - var11) * var14 >> 16) + var11) * class92.field1554 / 50 + var2;
                field1819[var4] = (((field1823[var7] - var12) * var14 >> 16) + var12) * class92.field1554 / 50 + var3;
                field1835[var4++] = ((this.field1798[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1847[var9 - var8];
                field1833[var4] = (((field1838[var6] - var11) * var15 >> 16) + var11) * class92.field1554 / 50 + var2;
                field1819[var4] = (((field1823[var6] - var12) * var15 >> 16) + var12) * class92.field1554 / 50 + var3;
                field1835[var4++] = ((this.field1784[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1833[var4] = field1818[var6];
            field1819[var4] = field1820[var6];
            field1835[var4++] = this.field1784[arg0];
        } else {
            int var16 = field1838[var6];
            int var17 = field1823[var6];
            int var18 = this.field1784[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1847[var8 - var9];
                field1833[var4] = (((field1838[var5] - var16) * var19 >> 16) + var16) * class92.field1554 / 50 + var2;
                field1819[var4] = (((field1823[var5] - var17) * var19 >> 16) + var17) * class92.field1554 / 50 + var3;
                field1835[var4++] = ((this.field1796[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1847[var10 - var9];
                field1833[var4] = (((field1838[var7] - var16) * var20 >> 16) + var16) * class92.field1554 / 50 + var2;
                field1819[var4] = (((field1823[var7] - var17) * var20 >> 16) + var17) * class92.field1554 / 50 + var3;
                field1835[var4++] = ((this.field1798[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1833[var4] = field1818[var7];
            field1819[var4] = field1820[var7];
            field1835[var4++] = this.field1798[arg0];
        } else {
            int var21 = field1838[var7];
            int var22 = field1823[var7];
            int var23 = this.field1798[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1847[var9 - var10];
                field1833[var4] = (((field1838[var6] - var21) * var24 >> 16) + var21) * class92.field1554 / 50 + var2;
                field1819[var4] = (((field1823[var6] - var22) * var24 >> 16) + var22) * class92.field1554 / 50 + var3;
                field1835[var4++] = ((this.field1784[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1847[var8 - var10];
                field1833[var4] = (((field1838[var5] - var21) * var25 >> 16) + var21) * class92.field1554 / 50 + var2;
                field1819[var4] = (((field1823[var5] - var22) * var25 >> 16) + var22) * class92.field1554 / 50 + var3;
                field1835[var4++] = ((this.field1796[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1833[0];
        int var27 = field1833[1];
        int var28 = field1833[2];
        int var29 = field1819[0];
        int var30 = field1819[1];
        int var31 = field1819[2];
        class92.field1569 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1561 || var27 > Statics.field1561 || var28 > Statics.field1561) {
                class92.field1569 = true;
            }
            if (this.field1802 != null && this.field1802[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1801 == null || this.field1801[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1801[arg0] & 0xFF;
                    var33 = this.field1787[var32];
                    var34 = this.field1806[var32];
                    var35 = this.field1807[var32];
                }
                if (this.field1798[arg0] == -1) {
                    class92.method1997(var29, var30, var31, var26, var27, var28, this.field1796[arg0], this.field1796[arg0], this.field1796[arg0], field1838[var33], field1838[var34], field1838[var35], field1823[var33], field1823[var34], field1823[var35], field1824[var33], field1824[var34], field1824[var35], this.field1802[arg0]);
                } else {
                    class92.method1997(var29, var30, var31, var26, var27, var28, field1835[0], field1835[1], field1835[2], field1838[var33], field1838[var34], field1838[var35], field1823[var33], field1823[var34], field1823[var35], field1824[var33], field1824[var34], field1824[var35], this.field1802[arg0]);
                }
            } else if (this.field1798[arg0] == -1) {
                class92.method1978(var29, var30, var31, var26, var27, var28, field1836[this.field1796[arg0]]);
            } else {
                class92.method1984(var29, var30, var31, var26, var27, var28, field1835[0], field1835[1], field1835[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1561 || var27 > Statics.field1561 || var28 > Statics.field1561 || field1833[3] < 0 || field1833[3] > Statics.field1561) {
            class92.field1569 = true;
        }
        if (this.field1802 != null && this.field1802[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1801 == null || this.field1801[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1801[arg0] & 0xFF;
                var37 = this.field1787[var36];
                var38 = this.field1806[var36];
                var39 = this.field1807[var36];
            }
            short var40 = this.field1802[arg0];
            if (this.field1798[arg0] == -1) {
                class92.method1997(var29, var30, var31, var26, var27, var28, this.field1796[arg0], this.field1796[arg0], this.field1796[arg0], field1838[var37], field1838[var38], field1838[var39], field1823[var37], field1823[var38], field1823[var39], field1824[var37], field1824[var38], field1824[var39], var40);
                class92.method1997(var29, var31, field1819[3], var26, var28, field1833[3], this.field1796[arg0], this.field1796[arg0], this.field1796[arg0], field1838[var37], field1838[var38], field1838[var39], field1823[var37], field1823[var38], field1823[var39], field1824[var37], field1824[var38], field1824[var39], var40);
            } else {
                class92.method1997(var29, var30, var31, var26, var27, var28, field1835[0], field1835[1], field1835[2], field1838[var37], field1838[var38], field1838[var39], field1823[var37], field1823[var38], field1823[var39], field1824[var37], field1824[var38], field1824[var39], var40);
                class92.method1997(var29, var31, field1819[3], var26, var28, field1833[3], field1835[0], field1835[2], field1835[3], field1838[var37], field1838[var38], field1838[var39], field1823[var37], field1823[var38], field1823[var39], field1824[var37], field1824[var38], field1824[var39], var40);
            }
        } else if (this.field1798[arg0] == -1) {
            int var41 = field1836[this.field1796[arg0]];
            class92.method1978(var29, var30, var31, var26, var27, var28, var41);
            class92.method1978(var29, var31, field1819[3], var26, var28, field1833[3], var41);
        } else {
            class92.method1984(var29, var30, var31, var26, var27, var28, field1835[0], field1835[1], field1835[2]);
            class92.method1984(var29, var31, field1819[3], var26, var28, field1833[3], field1835[0], field1835[2], field1835[3]);
        }
    }

    @ObfuscatedName("df.o(IIIIIIII)Z")
    public final boolean method2175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
