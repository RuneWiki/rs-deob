package deob;

@ObfuscatedName("dy")
public class class106 extends class86 {

    @ObfuscatedName("dy.e")
    public static class106 field1789 = new class106();

    @ObfuscatedName("dy.w")
    public static byte[] field1777 = new byte[1];

    @ObfuscatedName("dy.f")
    public static class106 field1790 = new class106();

    @ObfuscatedName("dy.s")
    public static byte[] field1779 = new byte[1];

    @ObfuscatedName("dy.p")
    public int field1780 = 0;

    @ObfuscatedName("dy.h")
    public int[] field1781;

    @ObfuscatedName("dy.g")
    public int[] field1782;

    @ObfuscatedName("dy.a")
    public int[] field1783;

    @ObfuscatedName("dy.r")
    public int field1784 = 0;

    @ObfuscatedName("dy.k")
    public int[] field1785;

    @ObfuscatedName("dy.m")
    public int[] field1839;

    @ObfuscatedName("dy.n")
    public int[] field1787;

    @ObfuscatedName("dy.y")
    public int[] field1813;

    @ObfuscatedName("dy.i")
    public int[] field1832;

    @ObfuscatedName("dy.j")
    public int[] field1825;

    @ObfuscatedName("dy.l")
    public byte[] field1791;

    @ObfuscatedName("dy.o")
    public byte[] field1792;

    @ObfuscatedName("dy.c")
    public byte[] field1793;

    @ObfuscatedName("dy.x")
    public short[] field1805;

    @ObfuscatedName("dy.b")
    public byte field1795 = 0;

    @ObfuscatedName("dy.q")
    public int field1796 = 0;

    @ObfuscatedName("dy.u")
    public int[] field1797;

    @ObfuscatedName("dy.t")
    public int[] field1818;

    @ObfuscatedName("dy.d")
    public int[] field1799;

    @ObfuscatedName("dy.z")
    public int[][] field1800;

    @ObfuscatedName("dy.v")
    public int[][] field1801;

    @ObfuscatedName("dy.aq")
    public boolean field1802 = false;

    @ObfuscatedName("dy.ap")
    public int field1776;

    @ObfuscatedName("dy.ai")
    public int field1830;

    @ObfuscatedName("dy.ae")
    public int field1798;

    @ObfuscatedName("dy.az")
    public int field1806;

    @ObfuscatedName("dy.ah")
    public int field1807;

    @ObfuscatedName("dy.ab")
    public static boolean[] field1803 = new boolean[4700];

    @ObfuscatedName("dy.aj")
    public static boolean[] field1810 = new boolean[4700];

    @ObfuscatedName("dy.ay")
    public static int[] field1811 = new int[4700];

    @ObfuscatedName("dy.ag")
    public static int[] field1794 = new int[4700];

    @ObfuscatedName("dy.av")
    public static int[] field1786 = new int[4700];

    @ObfuscatedName("dy.af")
    public static int[] field1814 = new int[4700];

    @ObfuscatedName("dy.am")
    public static int[] field1815 = new int[4700];

    @ObfuscatedName("dy.aw")
    public static int[] field1816 = new int[4700];

    @ObfuscatedName("dy.aa")
    public static int[] field1809 = new int[1600];

    @ObfuscatedName("dy.ac")
    public static int[][] field1819 = new int[1600][512];

    @ObfuscatedName("dy.an")
    public static int[] field1820 = new int[12];

    @ObfuscatedName("dy.ax")
    public static int[][] field1826 = new int[12][2000];

    @ObfuscatedName("dy.au")
    public static int[] field1822 = new int[2000];

    @ObfuscatedName("dy.at")
    public static int[] field1823 = new int[2000];

    @ObfuscatedName("dy.ao")
    public static int[] field1778 = new int[12];

    @ObfuscatedName("dy.al")
    public static int[] field1824 = new int[10];

    @ObfuscatedName("dy.ak")
    public static int[] field1838 = new int[10];

    @ObfuscatedName("dy.as")
    public static int[] field1827 = new int[10];

    @ObfuscatedName("dy.br")
    public static boolean field1831 = false;

    @ObfuscatedName("dy.bl")
    public static int field1835 = 0;

    @ObfuscatedName("dy.bd")
    public static int field1833 = 0;

    @ObfuscatedName("dy.bh")
    public static int field1834 = 0;

    @ObfuscatedName("dy.bw")
    public static int[] field1804 = new int[1000];

    @ObfuscatedName("dy.bn")
    public static int[] field1836 = class92.field1569;

    @ObfuscatedName("dy.by")
    public static int[] field1837 = class92.field1555;

    @ObfuscatedName("dy.bu")
    public static int[] field1788 = class92.field1565;

    @ObfuscatedName("dy.bv")
    public static int[] field1821 = class92.field1546;

    public class106() {
    }

    public class106(class106[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1780 = 0;
        this.field1784 = 0;
        this.field1796 = 0;
        this.field1795 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class106 var8 = arg0[var7];
            if (var8 != null) {
                this.field1780 += var8.field1780;
                this.field1784 += var8.field1784;
                this.field1796 += var8.field1796;
                if (var8.field1791 == null) {
                    if (this.field1795 == -1) {
                        this.field1795 = var8.field1795;
                    }
                    if (this.field1795 != var8.field1795) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1792 != null;
                var5 |= var8.field1805 != null;
                var6 |= var8.field1793 != null;
            }
        }
        this.field1781 = new int[this.field1780];
        this.field1782 = new int[this.field1780];
        this.field1783 = new int[this.field1780];
        this.field1785 = new int[this.field1784];
        this.field1839 = new int[this.field1784];
        this.field1787 = new int[this.field1784];
        this.field1813 = new int[this.field1784];
        this.field1832 = new int[this.field1784];
        this.field1825 = new int[this.field1784];
        if (var3) {
            this.field1791 = new byte[this.field1784];
        }
        if (var4) {
            this.field1792 = new byte[this.field1784];
        }
        if (var5) {
            this.field1805 = new short[this.field1784];
        }
        if (var6) {
            this.field1793 = new byte[this.field1784];
        }
        if (this.field1796 > 0) {
            this.field1797 = new int[this.field1796];
            this.field1818 = new int[this.field1796];
            this.field1799 = new int[this.field1796];
        }
        this.field1780 = 0;
        this.field1784 = 0;
        this.field1796 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class106 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1784; var11++) {
                    this.field1785[this.field1784] = var10.field1785[var11] + this.field1780;
                    this.field1839[this.field1784] = var10.field1839[var11] + this.field1780;
                    this.field1787[this.field1784] = var10.field1787[var11] + this.field1780;
                    this.field1813[this.field1784] = var10.field1813[var11];
                    this.field1832[this.field1784] = var10.field1832[var11];
                    this.field1825[this.field1784] = var10.field1825[var11];
                    if (var3) {
                        if (var10.field1791 == null) {
                            this.field1791[this.field1784] = var10.field1795;
                        } else {
                            this.field1791[this.field1784] = var10.field1791[var11];
                        }
                    }
                    if (var4 && var10.field1792 != null) {
                        this.field1792[this.field1784] = var10.field1792[var11];
                    }
                    if (var5) {
                        if (var10.field1805 == null) {
                            this.field1805[this.field1784] = -1;
                        } else {
                            this.field1805[this.field1784] = var10.field1805[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1793 == null || var10.field1793[var11] == -1) {
                            this.field1793[this.field1784] = -1;
                        } else {
                            this.field1793[this.field1784] = (byte) (var10.field1793[var11] + this.field1796);
                        }
                    }
                    this.field1784++;
                }
                for (int var12 = 0; var12 < var10.field1796; var12++) {
                    this.field1797[this.field1796] = var10.field1797[var12] + this.field1780;
                    this.field1818[this.field1796] = var10.field1818[var12] + this.field1780;
                    this.field1799[this.field1796] = var10.field1799[var12] + this.field1780;
                    this.field1796++;
                }
                for (int var13 = 0; var13 < var10.field1780; var13++) {
                    this.field1781[this.field1780] = var10.field1781[var13];
                    this.field1782[this.field1780] = var10.field1782[var13];
                    this.field1783[this.field1780] = var10.field1783[var13];
                    this.field1780++;
                }
            }
        }
    }

    @ObfuscatedName("dy.e([[IIIIZI)Ldy;")
    public class106 method2208(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2183();
        int var7 = arg1 - this.field1798;
        int var8 = this.field1798 + arg1;
        int var9 = arg3 - this.field1798;
        int var10 = this.field1798 + arg3;
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
            var15.field1780 = this.field1780;
            var15.field1784 = this.field1784;
            var15.field1796 = this.field1796;
            var15.field1781 = this.field1781;
            var15.field1783 = this.field1783;
            var15.field1785 = this.field1785;
            var15.field1839 = this.field1839;
            var15.field1787 = this.field1787;
            var15.field1813 = this.field1813;
            var15.field1832 = this.field1832;
            var15.field1825 = this.field1825;
            var15.field1791 = this.field1791;
            var15.field1792 = this.field1792;
            var15.field1793 = this.field1793;
            var15.field1805 = this.field1805;
            var15.field1795 = this.field1795;
            var15.field1797 = this.field1797;
            var15.field1818 = this.field1818;
            var15.field1799 = this.field1799;
            var15.field1800 = this.field1800;
            var15.field1801 = this.field1801;
            var15.field1802 = this.field1802;
            var15.field1782 = new int[var15.field1780];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1780; var16++) {
                int var17 = this.field1781[var16] + arg1;
                int var18 = this.field1783[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1782[var16] = this.field1782[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1780; var26++) {
                int var27 = (-this.field1782[var26] << 16) / this.field1439;
                if (var27 < arg5) {
                    int var28 = this.field1781[var26] + arg1;
                    int var29 = this.field1783[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1782[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1782[var26];
                }
            }
        }
        var15.field1776 = 0;
        return var15;
    }

    @ObfuscatedName("dy.w(Z)Ldy;")
    public class106 method2166(boolean arg0) {
        if (!arg0 && field1777.length < this.field1784) {
            field1777 = new byte[this.field1784 + 100];
        }
        return this.method2168(arg0, field1789, field1777);
    }

    @ObfuscatedName("dy.s(Z)Ldy;")
    public class106 method2207(boolean arg0) {
        if (!arg0 && field1779.length < this.field1784) {
            field1779 = new byte[this.field1784 + 100];
        }
        return this.method2168(arg0, field1790, field1779);
    }

    @ObfuscatedName("dy.p(ZLdy;[B)Ldy;")
    public class106 method2168(boolean arg0, class106 arg1, byte[] arg2) {
        arg1.field1780 = this.field1780;
        arg1.field1784 = this.field1784;
        arg1.field1796 = this.field1796;
        if (arg1.field1781 == null || arg1.field1781.length < this.field1780) {
            arg1.field1781 = new int[this.field1780 + 100];
            arg1.field1782 = new int[this.field1780 + 100];
            arg1.field1783 = new int[this.field1780 + 100];
        }
        for (int var4 = 0; var4 < this.field1780; var4++) {
            arg1.field1781[var4] = this.field1781[var4];
            arg1.field1782[var4] = this.field1782[var4];
            arg1.field1783[var4] = this.field1783[var4];
        }
        if (arg0) {
            arg1.field1792 = this.field1792;
        } else {
            arg1.field1792 = arg2;
            if (this.field1792 == null) {
                for (int var5 = 0; var5 < this.field1784; var5++) {
                    arg1.field1792[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1784; var6++) {
                    arg1.field1792[var6] = this.field1792[var6];
                }
            }
        }
        arg1.field1785 = this.field1785;
        arg1.field1839 = this.field1839;
        arg1.field1787 = this.field1787;
        arg1.field1813 = this.field1813;
        arg1.field1832 = this.field1832;
        arg1.field1825 = this.field1825;
        arg1.field1791 = this.field1791;
        arg1.field1793 = this.field1793;
        arg1.field1805 = this.field1805;
        arg1.field1795 = this.field1795;
        arg1.field1797 = this.field1797;
        arg1.field1818 = this.field1818;
        arg1.field1799 = this.field1799;
        arg1.field1800 = this.field1800;
        arg1.field1801 = this.field1801;
        arg1.field1802 = this.field1802;
        arg1.field1776 = 0;
        return arg1;
    }

    @ObfuscatedName("dy.h()V")
    public void method2183() {
        if (this.field1776 == 1) {
            return;
        }
        this.field1776 = 1;
        this.field1439 = 0;
        this.field1830 = 0;
        this.field1798 = 0;
        for (int var1 = 0; var1 < this.field1780; var1++) {
            int var2 = this.field1781[var1];
            int var3 = this.field1782[var1];
            int var4 = this.field1783[var1];
            if (-var3 > this.field1439) {
                this.field1439 = -var3;
            }
            if (var3 > this.field1830) {
                this.field1830 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1798) {
                this.field1798 = var5;
            }
        }
        this.field1798 = (int) (Math.sqrt((double) this.field1798) + 0.99D);
        this.field1807 = (int) (Math.sqrt((double) (this.field1439 * this.field1439 + this.field1798 * this.field1798)) + 0.99D);
        this.field1806 = this.field1807 + (int) (Math.sqrt((double) (this.field1830 * this.field1830 + this.field1798 * this.field1798)) + 0.99D);
    }

    @ObfuscatedName("dy.g()V")
    public void method2230() {
        if (this.field1776 == 2) {
            return;
        }
        this.field1776 = 2;
        this.field1798 = 0;
        for (int var1 = 0; var1 < this.field1780; var1++) {
            int var2 = this.field1781[var1];
            int var3 = this.field1782[var1];
            int var4 = this.field1783[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1798) {
                this.field1798 = var5;
            }
        }
        this.field1798 = (int) (Math.sqrt((double) this.field1798) + 0.99D);
        this.field1807 = this.field1798;
        this.field1806 = this.field1798 + this.field1798;
    }

    @ObfuscatedName("dy.a()I")
    public int method2169() {
        this.method2183();
        return this.field1798;
    }

    @ObfuscatedName("dy.r(Lcl;I)V")
    public void method2172(class104 arg0, int arg1) {
        if (this.field1800 == null || arg1 == -1) {
            return;
        }
        class89 var3 = arg0.field1748[arg1];
        class103 var4 = var3.field1523;
        Statics.field1828 = 0;
        Statics.field1829 = 0;
        Statics.field1812 = 0;
        for (int var5 = 0; var5 < var3.field1524; var5++) {
            int var6 = var3.field1526[var5];
            this.method2204(var4.field1743[var6], var4.field1741[var6], var3.field1525[var5], var3.field1527[var5], var3.field1528[var5]);
        }
        this.field1776 = 0;
    }

    @ObfuscatedName("dy.k(Lcl;ILcl;I[I)V")
    public void method2175(class104 arg0, int arg1, class104 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2172(arg0, arg1);
            return;
        }
        class89 var6 = arg0.field1748[arg1];
        class89 var7 = arg2.field1748[arg3];
        class103 var8 = var6.field1523;
        Statics.field1828 = 0;
        Statics.field1829 = 0;
        Statics.field1812 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1524; var11++) {
            int var12 = var6.field1526[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1743[var12] == 0) {
                this.method2204(var8.field1743[var12], var8.field1741[var12], var6.field1525[var11], var6.field1527[var11], var6.field1528[var11]);
            }
        }
        Statics.field1828 = 0;
        Statics.field1829 = 0;
        Statics.field1812 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1524; var15++) {
            int var16 = var7.field1526[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1743[var16] == 0) {
                this.method2204(var8.field1743[var16], var8.field1741[var16], var7.field1525[var15], var7.field1527[var15], var7.field1528[var15]);
            }
        }
        this.field1776 = 0;
    }

    @ObfuscatedName("dy.i(I[IIII)V")
    public void method2204(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1828 = 0;
            Statics.field1829 = 0;
            Statics.field1812 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1800.length) {
                    int[] var10 = this.field1800[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1828 += this.field1781[var12];
                        Statics.field1829 += this.field1782[var12];
                        Statics.field1812 += this.field1783[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1828 = Statics.field1828 / var7 + arg2;
                Statics.field1829 = Statics.field1829 / var7 + arg3;
                Statics.field1812 = Statics.field1812 / var7 + arg4;
            } else {
                Statics.field1828 = arg2;
                Statics.field1829 = arg3;
                Statics.field1812 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1800.length) {
                    int[] var15 = this.field1800[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1781[var17] += arg2;
                        this.field1782[var17] += arg3;
                        this.field1783[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1800.length) {
                    int[] var20 = this.field1800[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1781[var22] -= Statics.field1828;
                        this.field1782[var22] -= Statics.field1829;
                        this.field1783[var22] -= Statics.field1812;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1836[var25];
                            int var27 = field1837[var25];
                            int var28 = this.field1782[var22] * var26 + this.field1781[var22] * var27 >> 16;
                            this.field1782[var22] = this.field1782[var22] * var27 - this.field1781[var22] * var26 >> 16;
                            this.field1781[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1836[var23];
                            int var30 = field1837[var23];
                            int var31 = this.field1782[var22] * var30 - this.field1783[var22] * var29 >> 16;
                            this.field1783[var22] = this.field1783[var22] * var30 + this.field1782[var22] * var29 >> 16;
                            this.field1782[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1836[var24];
                            int var33 = field1837[var24];
                            int var34 = this.field1783[var22] * var32 + this.field1781[var22] * var33 >> 16;
                            this.field1783[var22] = this.field1783[var22] * var33 - this.field1781[var22] * var32 >> 16;
                            this.field1781[var22] = var34;
                        }
                        this.field1781[var22] += Statics.field1828;
                        this.field1782[var22] += Statics.field1829;
                        this.field1783[var22] += Statics.field1812;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1800.length) {
                    int[] var37 = this.field1800[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1781[var39] -= Statics.field1828;
                        this.field1782[var39] -= Statics.field1829;
                        this.field1783[var39] -= Statics.field1812;
                        this.field1781[var39] = this.field1781[var39] * arg2 / 128;
                        this.field1782[var39] = this.field1782[var39] * arg3 / 128;
                        this.field1783[var39] = this.field1783[var39] * arg4 / 128;
                        this.field1781[var39] += Statics.field1828;
                        this.field1782[var39] += Statics.field1829;
                        this.field1783[var39] += Statics.field1812;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1801 != null && this.field1792 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1801.length) {
                    int[] var42 = this.field1801[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1792[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1792[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dy.j()V")
    public void method2222() {
        for (int var1 = 0; var1 < this.field1780; var1++) {
            int var2 = this.field1781[var1];
            this.field1781[var1] = this.field1783[var1];
            this.field1783[var1] = -var2;
        }
        this.field1776 = 0;
    }

    @ObfuscatedName("dy.l()V")
    public void method2176() {
        for (int var1 = 0; var1 < this.field1780; var1++) {
            this.field1781[var1] = -this.field1781[var1];
            this.field1783[var1] = -this.field1783[var1];
        }
        this.field1776 = 0;
    }

    @ObfuscatedName("dy.o()V")
    public void method2177() {
        for (int var1 = 0; var1 < this.field1780; var1++) {
            int var2 = this.field1783[var1];
            this.field1783[var1] = this.field1781[var1];
            this.field1781[var1] = -var2;
        }
        this.field1776 = 0;
    }

    @ObfuscatedName("dy.c(I)V")
    public void method2220(int arg0) {
        int var2 = field1836[arg0];
        int var3 = field1837[arg0];
        for (int var4 = 0; var4 < this.field1780; var4++) {
            int var5 = this.field1782[var4] * var3 - this.field1783[var4] * var2 >> 16;
            this.field1783[var4] = this.field1783[var4] * var3 + this.field1782[var4] * var2 >> 16;
            this.field1782[var4] = var5;
        }
        this.field1776 = 0;
    }

    @ObfuscatedName("dy.x(III)V")
    public void method2179(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1780; var4++) {
            this.field1781[var4] += arg0;
            this.field1782[var4] += arg1;
            this.field1783[var4] += arg2;
        }
        this.field1776 = 0;
    }

    @ObfuscatedName("dy.b(III)V")
    public void method2225(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1780; var4++) {
            this.field1781[var4] = this.field1781[var4] * arg0 / 128;
            this.field1782[var4] = this.field1782[var4] * arg1 / 128;
            this.field1783[var4] = this.field1783[var4] * arg2 / 128;
        }
        this.field1776 = 0;
    }

    @ObfuscatedName("dy.q(IIIIIII)V")
    public final void method2221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1809[0] = -1;
        if (this.field1776 != 2 && this.field1776 != 1) {
            this.method2230();
        }
        int var8 = Statics.field1564;
        int var9 = Statics.field1557;
        int var10 = field1836[arg0];
        int var11 = field1837[arg0];
        int var12 = field1836[arg1];
        int var13 = field1837[arg1];
        int var14 = field1836[arg2];
        int var15 = field1837[arg2];
        int var16 = field1836[arg3];
        int var17 = field1837[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1780; var19++) {
            int var20 = this.field1781[var19];
            int var21 = this.field1782[var19];
            int var22 = this.field1783[var19];
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
            field1786[var19] = var30 - var18;
            field1811[var19] = class92.field1556 * var26 / var30 + var8;
            field1794[var19] = class92.field1556 * var29 / var30 + var9;
            if (this.field1796 > 0) {
                field1814[var19] = var26;
                field1815[var19] = var29;
                field1816[var19] = var30;
            }
        }
        try {
            this.method2184(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dy.u(IIIIIIII)V")
    public final void method2182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1809[0] = -1;
        if (this.field1776 != 2 && this.field1776 != 1) {
            this.method2230();
        }
        int var9 = Statics.field1564;
        int var10 = Statics.field1557;
        int var11 = field1836[arg0];
        int var12 = field1837[arg0];
        int var13 = field1836[arg1];
        int var14 = field1837[arg1];
        int var15 = field1836[arg2];
        int var16 = field1837[arg2];
        int var17 = field1836[arg3];
        int var18 = field1837[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1780; var20++) {
            int var21 = this.field1781[var20];
            int var22 = this.field1782[var20];
            int var23 = this.field1783[var20];
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
            field1786[var20] = var31 - var19;
            field1811[var20] = class92.field1556 * var27 / arg7 + var9;
            field1794[var20] = class92.field1556 * var30 / arg7 + var10;
            if (this.field1796 > 0) {
                field1814[var20] = var27;
                field1815[var20] = var30;
                field1816[var20] = var31;
            }
        }
        try {
            this.method2184(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dy.ap(IIIIIIIII)V")
    public void method1776(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1809[0] = -1;
        if (this.field1776 != 1) {
            this.method2183();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1798 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1798) * class92.field1556;
        if (var15 / var13 >= Statics.field1561) {
            return;
        }
        int var16 = (this.field1798 + var14) * class92.field1556;
        if (var16 / var13 <= Statics.field1560) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1798 * arg1 >> 16;
        int var19 = (var17 + var18) * class92.field1556;
        if (var19 / var13 <= Statics.field1562) {
            return;
        }
        int var20 = (this.field1439 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class92.field1556;
        if (var21 / var13 >= Statics.field1563) {
            return;
        }
        int var22 = (this.field1439 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1796 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1831) {
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
            int var32 = field1835 - Statics.field1564;
            int var33 = field1833 - Statics.field1557;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1802) {
                    field1804[field1834++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1564;
        int var35 = Statics.field1557;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1836[arg0];
            var37 = field1837[arg0];
        }
        for (int var38 = 0; var38 < this.field1780; var38++) {
            int var39 = this.field1781[var38];
            int var40 = this.field1782[var38];
            int var41 = this.field1783[var38];
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
            field1786[var38] = var50 - var11;
            if (var50 >= 50) {
                field1811[var38] = class92.field1556 * var46 / var50 + var34;
                field1794[var38] = class92.field1556 * var49 / var50 + var35;
            } else {
                field1811[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1814[var38] = var46;
                field1815[var38] = var49;
                field1816[var38] = var50;
            }
        }
        try {
            this.method2184(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dy.t(ZZI)V")
    public final void method2184(boolean arg0, boolean arg1, int arg2) {
        if (this.field1806 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1806; var4++) {
            field1809[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1784; var5++) {
            if (this.field1825[var5] != -2) {
                int var6 = this.field1785[var5];
                int var7 = this.field1839[var5];
                int var8 = this.field1787[var5];
                int var9 = field1811[var6];
                int var10 = field1811[var7];
                int var11 = field1811[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1814[var6];
                    int var13 = field1814[var7];
                    int var14 = field1814[var8];
                    int var15 = field1815[var6];
                    int var16 = field1815[var7];
                    int var17 = field1815[var8];
                    int var18 = field1816[var6];
                    int var19 = field1816[var7];
                    int var20 = field1816[var8];
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
                        field1810[var5] = true;
                        int var30 = (field1786[var6] + field1786[var7] + field1786[var8]) / 3 + this.field1807;
                        field1819[var30][field1809[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2170(field1835, field1833, field1794[var6], field1794[var7], field1794[var8], var9, var10, var11)) {
                        field1804[field1834++] = arg2;
                        arg1 = false;
                    }
                    if ((field1794[var8] - field1794[var7]) * (var9 - var10) - (field1794[var6] - field1794[var7]) * (var11 - var10) > 0) {
                        field1810[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1558 && var10 <= Statics.field1558 && var11 <= Statics.field1558) {
                            field1803[var5] = false;
                        } else {
                            field1803[var5] = true;
                        }
                        int var31 = (field1786[var6] + field1786[var7] + field1786[var8]) / 3 + this.field1807;
                        field1819[var31][field1809[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1791 == null) {
            for (int var32 = this.field1806 - 1; var32 >= 0; var32--) {
                int var33 = field1809[var32];
                if (var33 > 0) {
                    int[] var34 = field1819[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2185(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1820[var36] = 0;
            field1778[var36] = 0;
        }
        for (int var37 = this.field1806 - 1; var37 >= 0; var37--) {
            int var38 = field1809[var37];
            if (var38 > 0) {
                int[] var39 = field1819[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1791[var41];
                    int var43 = field1820[var42]++;
                    field1826[var42][var43] = var41;
                    if (var42 < 10) {
                        field1778[var42] += var37;
                    } else if (var42 == 10) {
                        field1822[var43] = var37;
                    } else {
                        field1823[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1820[1] > 0 || field1820[2] > 0) {
            var44 = (field1778[1] + field1778[2]) / (field1820[1] + field1820[2]);
        }
        int var45 = 0;
        if (field1820[3] > 0 || field1820[4] > 0) {
            var45 = (field1778[3] + field1778[4]) / (field1820[3] + field1820[4]);
        }
        int var46 = 0;
        if (field1820[6] > 0 || field1820[8] > 0) {
            var46 = (field1778[6] + field1778[8]) / (field1820[6] + field1820[8]);
        }
        int var47 = 0;
        int var48 = field1820[10];
        int[] var49 = field1826[10];
        int[] var50 = field1822;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1820[11];
            var49 = field1826[11];
            var50 = field1823;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2185(var49[var47++]);
                if (var47 == var48 && field1826[11] != var49) {
                    var47 = 0;
                    var48 = field1820[11];
                    var49 = field1826[11];
                    var50 = field1823;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2185(var49[var47++]);
                if (var47 == var48 && field1826[11] != var49) {
                    var47 = 0;
                    var48 = field1820[11];
                    var49 = field1826[11];
                    var50 = field1823;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2185(var49[var47++]);
                if (var47 == var48 && field1826[11] != var49) {
                    var47 = 0;
                    var48 = field1820[11];
                    var49 = field1826[11];
                    var50 = field1823;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1820[var52];
            int[] var54 = field1826[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2185(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2185(var49[var47++]);
            if (var47 == var48 && field1826[11] != var49) {
                var47 = 0;
                var49 = field1826[11];
                var48 = field1820[11];
                var50 = field1823;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dy.d(I)V")
    public final void method2185(int arg0) {
        if (field1810[arg0]) {
            this.method2186(arg0);
            return;
        }
        int var2 = this.field1785[arg0];
        int var3 = this.field1839[arg0];
        int var4 = this.field1787[arg0];
        class92.field1566 = field1803[arg0];
        if (this.field1792 == null) {
            class92.field1550 = 0;
        } else {
            class92.field1550 = this.field1792[arg0] & 0xFF;
        }
        if (this.field1805 != null && this.field1805[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1793 == null || this.field1793[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1793[arg0] & 0xFF;
                var6 = this.field1797[var5];
                var7 = this.field1818[var5];
                var8 = this.field1799[var5];
            }
            if (this.field1825[arg0] == -1) {
                class92.method1970(field1794[var2], field1794[var3], field1794[var4], field1811[var2], field1811[var3], field1811[var4], this.field1813[arg0], this.field1813[arg0], this.field1813[arg0], field1814[var6], field1814[var7], field1814[var8], field1815[var6], field1815[var7], field1815[var8], field1816[var6], field1816[var7], field1816[var8], this.field1805[arg0]);
            } else {
                class92.method1970(field1794[var2], field1794[var3], field1794[var4], field1811[var2], field1811[var3], field1811[var4], this.field1813[arg0], this.field1832[arg0], this.field1825[arg0], field1814[var6], field1814[var7], field1814[var8], field1815[var6], field1815[var7], field1815[var8], field1816[var6], field1816[var7], field1816[var8], this.field1805[arg0]);
            }
        } else if (this.field1825[arg0] == -1) {
            class92.method1968(field1794[var2], field1794[var3], field1794[var4], field1811[var2], field1811[var3], field1811[var4], field1788[this.field1813[arg0]]);
        } else {
            class92.method1976(field1794[var2], field1794[var3], field1794[var4], field1811[var2], field1811[var3], field1811[var4], this.field1813[arg0], this.field1832[arg0], this.field1825[arg0]);
        }
    }

    @ObfuscatedName("dy.z(I)V")
    public final void method2186(int arg0) {
        int var2 = Statics.field1564;
        int var3 = Statics.field1557;
        int var4 = 0;
        int var5 = this.field1785[arg0];
        int var6 = this.field1839[arg0];
        int var7 = this.field1787[arg0];
        int var8 = field1816[var5];
        int var9 = field1816[var6];
        int var10 = field1816[var7];
        if (this.field1792 == null) {
            class92.field1550 = 0;
        } else {
            class92.field1550 = this.field1792[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1824[var4] = field1811[var5];
            field1838[var4] = field1794[var5];
            field1827[var4++] = this.field1813[arg0];
        } else {
            int var11 = field1814[var5];
            int var12 = field1815[var5];
            int var13 = this.field1813[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1821[var10 - var8];
                field1824[var4] = (((field1814[var7] - var11) * var14 >> 16) + var11) * class92.field1556 / 50 + var2;
                field1838[var4] = (((field1815[var7] - var12) * var14 >> 16) + var12) * class92.field1556 / 50 + var3;
                field1827[var4++] = ((this.field1825[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1821[var9 - var8];
                field1824[var4] = (((field1814[var6] - var11) * var15 >> 16) + var11) * class92.field1556 / 50 + var2;
                field1838[var4] = (((field1815[var6] - var12) * var15 >> 16) + var12) * class92.field1556 / 50 + var3;
                field1827[var4++] = ((this.field1832[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1824[var4] = field1811[var6];
            field1838[var4] = field1794[var6];
            field1827[var4++] = this.field1832[arg0];
        } else {
            int var16 = field1814[var6];
            int var17 = field1815[var6];
            int var18 = this.field1832[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1821[var8 - var9];
                field1824[var4] = (((field1814[var5] - var16) * var19 >> 16) + var16) * class92.field1556 / 50 + var2;
                field1838[var4] = (((field1815[var5] - var17) * var19 >> 16) + var17) * class92.field1556 / 50 + var3;
                field1827[var4++] = ((this.field1813[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1821[var10 - var9];
                field1824[var4] = (((field1814[var7] - var16) * var20 >> 16) + var16) * class92.field1556 / 50 + var2;
                field1838[var4] = (((field1815[var7] - var17) * var20 >> 16) + var17) * class92.field1556 / 50 + var3;
                field1827[var4++] = ((this.field1825[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1824[var4] = field1811[var7];
            field1838[var4] = field1794[var7];
            field1827[var4++] = this.field1825[arg0];
        } else {
            int var21 = field1814[var7];
            int var22 = field1815[var7];
            int var23 = this.field1825[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1821[var9 - var10];
                field1824[var4] = (((field1814[var6] - var21) * var24 >> 16) + var21) * class92.field1556 / 50 + var2;
                field1838[var4] = (((field1815[var6] - var22) * var24 >> 16) + var22) * class92.field1556 / 50 + var3;
                field1827[var4++] = ((this.field1832[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1821[var8 - var10];
                field1824[var4] = (((field1814[var5] - var21) * var25 >> 16) + var21) * class92.field1556 / 50 + var2;
                field1838[var4] = (((field1815[var5] - var22) * var25 >> 16) + var22) * class92.field1556 / 50 + var3;
                field1827[var4++] = ((this.field1813[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1824[0];
        int var27 = field1824[1];
        int var28 = field1824[2];
        int var29 = field1838[0];
        int var30 = field1838[1];
        int var31 = field1838[2];
        class92.field1566 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1558 || var27 > Statics.field1558 || var28 > Statics.field1558) {
                class92.field1566 = true;
            }
            if (this.field1805 != null && this.field1805[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1793 == null || this.field1793[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1793[arg0] & 0xFF;
                    var33 = this.field1797[var32];
                    var34 = this.field1818[var32];
                    var35 = this.field1799[var32];
                }
                if (this.field1825[arg0] == -1) {
                    class92.method1970(var29, var30, var31, var26, var27, var28, this.field1813[arg0], this.field1813[arg0], this.field1813[arg0], field1814[var33], field1814[var34], field1814[var35], field1815[var33], field1815[var34], field1815[var35], field1816[var33], field1816[var34], field1816[var35], this.field1805[arg0]);
                } else {
                    class92.method1970(var29, var30, var31, var26, var27, var28, field1827[0], field1827[1], field1827[2], field1814[var33], field1814[var34], field1814[var35], field1815[var33], field1815[var34], field1815[var35], field1816[var33], field1816[var34], field1816[var35], this.field1805[arg0]);
                }
            } else if (this.field1825[arg0] == -1) {
                class92.method1968(var29, var30, var31, var26, var27, var28, field1788[this.field1813[arg0]]);
            } else {
                class92.method1976(var29, var30, var31, var26, var27, var28, field1827[0], field1827[1], field1827[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1558 || var27 > Statics.field1558 || var28 > Statics.field1558 || field1824[3] < 0 || field1824[3] > Statics.field1558) {
            class92.field1566 = true;
        }
        if (this.field1805 != null && this.field1805[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1793 == null || this.field1793[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1793[arg0] & 0xFF;
                var37 = this.field1797[var36];
                var38 = this.field1818[var36];
                var39 = this.field1799[var36];
            }
            short var40 = this.field1805[arg0];
            if (this.field1825[arg0] == -1) {
                class92.method1970(var29, var30, var31, var26, var27, var28, this.field1813[arg0], this.field1813[arg0], this.field1813[arg0], field1814[var37], field1814[var38], field1814[var39], field1815[var37], field1815[var38], field1815[var39], field1816[var37], field1816[var38], field1816[var39], var40);
                class92.method1970(var29, var31, field1838[3], var26, var28, field1824[3], this.field1813[arg0], this.field1813[arg0], this.field1813[arg0], field1814[var37], field1814[var38], field1814[var39], field1815[var37], field1815[var38], field1815[var39], field1816[var37], field1816[var38], field1816[var39], var40);
            } else {
                class92.method1970(var29, var30, var31, var26, var27, var28, field1827[0], field1827[1], field1827[2], field1814[var37], field1814[var38], field1814[var39], field1815[var37], field1815[var38], field1815[var39], field1816[var37], field1816[var38], field1816[var39], var40);
                class92.method1970(var29, var31, field1838[3], var26, var28, field1824[3], field1827[0], field1827[2], field1827[3], field1814[var37], field1814[var38], field1814[var39], field1815[var37], field1815[var38], field1815[var39], field1816[var37], field1816[var38], field1816[var39], var40);
            }
        } else if (this.field1825[arg0] == -1) {
            int var41 = field1788[this.field1813[arg0]];
            class92.method1968(var29, var30, var31, var26, var27, var28, var41);
            class92.method1968(var29, var31, field1838[3], var26, var28, field1824[3], var41);
        } else {
            class92.method1976(var29, var30, var31, var26, var27, var28, field1827[0], field1827[1], field1827[2]);
            class92.method1976(var29, var31, field1838[3], var26, var28, field1824[3], field1827[0], field1827[2], field1827[3]);
        }
    }

    @ObfuscatedName("dy.v(IIIIIIII)Z")
    public final boolean method2170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
