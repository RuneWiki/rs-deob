package deob;

@ObfuscatedName("dt")
public class class105 extends class85 {

    @ObfuscatedName("dt.c")
    public static class105 field1805 = new class105();

    @ObfuscatedName("dt.h")
    public static byte[] field1778 = new byte[1];

    @ObfuscatedName("dt.k")
    public static class105 field1771 = new class105();

    @ObfuscatedName("dt.t")
    public static byte[] field1772 = new byte[1];

    @ObfuscatedName("dt.g")
    public int field1773 = 0;

    @ObfuscatedName("dt.o")
    public int[] field1774;

    @ObfuscatedName("dt.i")
    public int[] field1793;

    @ObfuscatedName("dt.w")
    public int[] field1792;

    @ObfuscatedName("dt.m")
    public int field1789 = 0;

    @ObfuscatedName("dt.r")
    public int[] field1770;

    @ObfuscatedName("dt.y")
    public int[] field1779;

    @ObfuscatedName("dt.q")
    public int[] field1794;

    @ObfuscatedName("dt.f")
    public int[] field1781;

    @ObfuscatedName("dt.x")
    public int[] field1782;

    @ObfuscatedName("dt.d")
    public int[] field1783;

    @ObfuscatedName("dt.e")
    public byte[] field1784;

    @ObfuscatedName("dt.l")
    public byte[] field1785;

    @ObfuscatedName("dt.u")
    public byte[] field1775;

    @ObfuscatedName("dt.a")
    public short[] field1787;

    @ObfuscatedName("dt.b")
    public byte field1788 = 0;

    @ObfuscatedName("dt.s")
    public int field1790 = 0;

    @ObfuscatedName("dt.v")
    public int[] field1811;

    @ObfuscatedName("dt.j")
    public int[] field1791;

    @ObfuscatedName("dt.z")
    public int[] field1776;

    @ObfuscatedName("dt.n")
    public int[][] field1818;

    @ObfuscatedName("dt.p")
    public int[][] field1817;

    @ObfuscatedName("dt.aj")
    public boolean field1795 = false;

    @ObfuscatedName("dt.aq")
    public int field1813;

    @ObfuscatedName("dt.aw")
    public int field1808;

    @ObfuscatedName("dt.az")
    public int field1798;

    @ObfuscatedName("dt.at")
    public int field1801;

    @ObfuscatedName("dt.af")
    public int field1800;

    @ObfuscatedName("dt.ac")
    public static boolean[] field1802 = new boolean[4096];

    @ObfuscatedName("dt.am")
    public static boolean[] field1797 = new boolean[4096];

    @ObfuscatedName("dt.ao")
    public static int[] field1804 = new int[4096];

    @ObfuscatedName("dt.ad")
    public static int[] field1780 = new int[4096];

    @ObfuscatedName("dt.ak")
    public static int[] field1806 = new int[4096];

    @ObfuscatedName("dt.au")
    public static int[] field1807 = new int[4096];

    @ObfuscatedName("dt.aa")
    public static int[] field1786 = new int[4096];

    @ObfuscatedName("dt.ai")
    public static int[] field1809 = new int[4096];

    @ObfuscatedName("dt.ar")
    public static int[] field1832 = new int[1600];

    @ObfuscatedName("dt.as")
    public static int[][] field1812 = new int[1600][512];

    @ObfuscatedName("dt.ap")
    public static int[] field1777 = new int[12];

    @ObfuscatedName("dt.ag")
    public static int[][] field1814 = new int[12][2000];

    @ObfuscatedName("dt.ab")
    public static int[] field1815 = new int[2000];

    @ObfuscatedName("dt.al")
    public static int[] field1816 = new int[2000];

    @ObfuscatedName("dt.ae")
    public static int[] field1810 = new int[12];

    @ObfuscatedName("dt.ay")
    public static int[] field1769 = new int[10];

    @ObfuscatedName("dt.an")
    public static int[] field1819 = new int[10];

    @ObfuscatedName("dt.ah")
    public static int[] field1824 = new int[10];

    @ObfuscatedName("dt.bk")
    public static boolean field1834 = false;

    @ObfuscatedName("dt.bo")
    public static int field1825 = 0;

    @ObfuscatedName("dt.bi")
    public static int field1826 = 0;

    @ObfuscatedName("dt.bj")
    public static int field1827 = 0;

    @ObfuscatedName("dt.bc")
    public static int[] field1828 = new int[1000];

    @ObfuscatedName("dt.bt")
    public static int[] field1829 = class91.field1566;

    @ObfuscatedName("dt.bm")
    public static int[] field1830 = class91.field1567;

    @ObfuscatedName("dt.bn")
    public static int[] field1831 = class91.field1562;

    @ObfuscatedName("dt.by")
    public static int[] field1820 = class91.field1559;

    public class105() {
    }

    public class105(class105[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1773 = 0;
        this.field1789 = 0;
        this.field1790 = 0;
        this.field1788 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class105 var8 = arg0[var7];
            if (var8 != null) {
                this.field1773 += var8.field1773;
                this.field1789 += var8.field1789;
                this.field1790 += var8.field1790;
                if (var8.field1784 == null) {
                    if (this.field1788 == -1) {
                        this.field1788 = var8.field1788;
                    }
                    if (this.field1788 != var8.field1788) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1785 != null;
                var5 |= var8.field1787 != null;
                var6 |= var8.field1775 != null;
            }
        }
        this.field1774 = new int[this.field1773];
        this.field1793 = new int[this.field1773];
        this.field1792 = new int[this.field1773];
        this.field1770 = new int[this.field1789];
        this.field1779 = new int[this.field1789];
        this.field1794 = new int[this.field1789];
        this.field1781 = new int[this.field1789];
        this.field1782 = new int[this.field1789];
        this.field1783 = new int[this.field1789];
        if (var3) {
            this.field1784 = new byte[this.field1789];
        }
        if (var4) {
            this.field1785 = new byte[this.field1789];
        }
        if (var5) {
            this.field1787 = new short[this.field1789];
        }
        if (var6) {
            this.field1775 = new byte[this.field1789];
        }
        if (this.field1790 > 0) {
            this.field1811 = new int[this.field1790];
            this.field1791 = new int[this.field1790];
            this.field1776 = new int[this.field1790];
        }
        this.field1773 = 0;
        this.field1789 = 0;
        this.field1790 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class105 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1789; var11++) {
                    this.field1770[this.field1789] = var10.field1770[var11] + this.field1773;
                    this.field1779[this.field1789] = var10.field1779[var11] + this.field1773;
                    this.field1794[this.field1789] = var10.field1794[var11] + this.field1773;
                    this.field1781[this.field1789] = var10.field1781[var11];
                    this.field1782[this.field1789] = var10.field1782[var11];
                    this.field1783[this.field1789] = var10.field1783[var11];
                    if (var3) {
                        if (var10.field1784 == null) {
                            this.field1784[this.field1789] = var10.field1788;
                        } else {
                            this.field1784[this.field1789] = var10.field1784[var11];
                        }
                    }
                    if (var4 && var10.field1785 != null) {
                        this.field1785[this.field1789] = var10.field1785[var11];
                    }
                    if (var5) {
                        if (var10.field1787 == null) {
                            this.field1787[this.field1789] = -1;
                        } else {
                            this.field1787[this.field1789] = var10.field1787[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1775 == null || var10.field1775[var11] == -1) {
                            this.field1775[this.field1789] = -1;
                        } else {
                            this.field1775[this.field1789] = (byte) (var10.field1775[var11] + this.field1790);
                        }
                    }
                    this.field1789++;
                }
                for (int var12 = 0; var12 < var10.field1790; var12++) {
                    this.field1811[this.field1790] = var10.field1811[var12] + this.field1773;
                    this.field1791[this.field1790] = var10.field1791[var12] + this.field1773;
                    this.field1776[this.field1790] = var10.field1776[var12] + this.field1773;
                    this.field1790++;
                }
                for (int var13 = 0; var13 < var10.field1773; var13++) {
                    this.field1774[this.field1773] = var10.field1774[var13];
                    this.field1793[this.field1773] = var10.field1793[var13];
                    this.field1792[this.field1773] = var10.field1792[var13];
                    this.field1773++;
                }
            }
        }
    }

    @ObfuscatedName("dt.c([[IIIIZI)Ldt;")
    public class105 method2091(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2095();
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
        class105 var15;
        if (arg4) {
            var15 = new class105();
            var15.field1773 = this.field1773;
            var15.field1789 = this.field1789;
            var15.field1790 = this.field1790;
            var15.field1774 = this.field1774;
            var15.field1792 = this.field1792;
            var15.field1770 = this.field1770;
            var15.field1779 = this.field1779;
            var15.field1794 = this.field1794;
            var15.field1781 = this.field1781;
            var15.field1782 = this.field1782;
            var15.field1783 = this.field1783;
            var15.field1784 = this.field1784;
            var15.field1785 = this.field1785;
            var15.field1775 = this.field1775;
            var15.field1787 = this.field1787;
            var15.field1788 = this.field1788;
            var15.field1811 = this.field1811;
            var15.field1791 = this.field1791;
            var15.field1776 = this.field1776;
            var15.field1818 = this.field1818;
            var15.field1817 = this.field1817;
            var15.field1795 = this.field1795;
            var15.field1793 = new int[var15.field1773];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1773; var16++) {
                int var17 = this.field1774[var16] + arg1;
                int var18 = this.field1792[var16] + arg3;
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
            for (int var26 = 0; var26 < var15.field1773; var26++) {
                int var27 = (-this.field1793[var26] << 16) / this.field1437;
                if (var27 < arg5) {
                    int var28 = this.field1774[var26] + arg1;
                    int var29 = this.field1792[var26] + arg3;
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
        var15.field1813 = 0;
        return var15;
    }

    @ObfuscatedName("dt.h(Z)Ldt;")
    public class105 method2113(boolean arg0) {
        if (!arg0 && field1778.length < this.field1789) {
            field1778 = new byte[this.field1789 + 100];
        }
        return this.method2094(arg0, field1805, field1778);
    }

    @ObfuscatedName("dt.t(Z)Ldt;")
    public class105 method2093(boolean arg0) {
        if (!arg0 && field1772.length < this.field1789) {
            field1772 = new byte[this.field1789 + 100];
        }
        return this.method2094(arg0, field1771, field1772);
    }

    @ObfuscatedName("dt.g(ZLdt;[B)Ldt;")
    public class105 method2094(boolean arg0, class105 arg1, byte[] arg2) {
        arg1.field1773 = this.field1773;
        arg1.field1789 = this.field1789;
        arg1.field1790 = this.field1790;
        if (arg1.field1774 == null || arg1.field1774.length < this.field1773) {
            arg1.field1774 = new int[this.field1773 + 100];
            arg1.field1793 = new int[this.field1773 + 100];
            arg1.field1792 = new int[this.field1773 + 100];
        }
        for (int var4 = 0; var4 < this.field1773; var4++) {
            arg1.field1774[var4] = this.field1774[var4];
            arg1.field1793[var4] = this.field1793[var4];
            arg1.field1792[var4] = this.field1792[var4];
        }
        if (arg0) {
            arg1.field1785 = this.field1785;
        } else {
            arg1.field1785 = arg2;
            if (this.field1785 == null) {
                for (int var5 = 0; var5 < this.field1789; var5++) {
                    arg1.field1785[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1789; var6++) {
                    arg1.field1785[var6] = this.field1785[var6];
                }
            }
        }
        arg1.field1770 = this.field1770;
        arg1.field1779 = this.field1779;
        arg1.field1794 = this.field1794;
        arg1.field1781 = this.field1781;
        arg1.field1782 = this.field1782;
        arg1.field1783 = this.field1783;
        arg1.field1784 = this.field1784;
        arg1.field1775 = this.field1775;
        arg1.field1787 = this.field1787;
        arg1.field1788 = this.field1788;
        arg1.field1811 = this.field1811;
        arg1.field1791 = this.field1791;
        arg1.field1776 = this.field1776;
        arg1.field1818 = this.field1818;
        arg1.field1817 = this.field1817;
        arg1.field1795 = this.field1795;
        arg1.field1813 = 0;
        return arg1;
    }

    @ObfuscatedName("dt.o()V")
    public void method2095() {
        if (this.field1813 == 1) {
            return;
        }
        this.field1813 = 1;
        this.field1437 = 0;
        this.field1808 = 0;
        this.field1798 = 0;
        for (int var1 = 0; var1 < this.field1773; var1++) {
            int var2 = this.field1774[var1];
            int var3 = this.field1793[var1];
            int var4 = this.field1792[var1];
            if (-var3 > this.field1437) {
                this.field1437 = -var3;
            }
            if (var3 > this.field1808) {
                this.field1808 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1798) {
                this.field1798 = var5;
            }
        }
        this.field1798 = (int) (Math.sqrt((double) this.field1798) + 0.99D);
        this.field1800 = (int) (Math.sqrt((double) (this.field1437 * this.field1437 + this.field1798 * this.field1798)) + 0.99D);
        this.field1801 = this.field1800 + (int) (Math.sqrt((double) (this.field1808 * this.field1808 + this.field1798 * this.field1798)) + 0.99D);
    }

    @ObfuscatedName("dt.i()V")
    public void method2096() {
        if (this.field1813 == 2) {
            return;
        }
        this.field1813 = 2;
        this.field1798 = 0;
        for (int var1 = 0; var1 < this.field1773; var1++) {
            int var2 = this.field1774[var1];
            int var3 = this.field1793[var1];
            int var4 = this.field1792[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1798) {
                this.field1798 = var5;
            }
        }
        this.field1798 = (int) (Math.sqrt((double) this.field1798) + 0.99D);
        this.field1800 = this.field1798;
        this.field1801 = this.field1798 + this.field1798;
    }

    @ObfuscatedName("dt.w()I")
    public int method2092() {
        this.method2095();
        return this.field1798;
    }

    @ObfuscatedName("dt.m(Lca;I)V")
    public void method2106(class103 arg0, int arg1) {
        if (this.field1818 == null || arg1 == -1) {
            return;
        }
        class88 var3 = arg0.field1745[arg1];
        class102 var4 = var3.field1517;
        Statics.field1821 = 0;
        Statics.field1822 = 0;
        Statics.field1823 = 0;
        for (int var5 = 0; var5 < var3.field1518; var5++) {
            int var6 = var3.field1519[var5];
            this.method2100(var4.field1732[var6], var4.field1733[var6], var3.field1521[var5], var3.field1522[var5], var3.field1513[var5]);
        }
        this.field1813 = 0;
    }

    @ObfuscatedName("dt.r(Lca;ILca;I[I)V")
    public void method2125(class103 arg0, int arg1, class103 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2106(arg0, arg1);
            return;
        }
        class88 var6 = arg0.field1745[arg1];
        class88 var7 = arg2.field1745[arg3];
        class102 var8 = var6.field1517;
        Statics.field1821 = 0;
        Statics.field1822 = 0;
        Statics.field1823 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1518; var11++) {
            int var12 = var6.field1519[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1732[var12] == 0) {
                this.method2100(var8.field1732[var12], var8.field1733[var12], var6.field1521[var11], var6.field1522[var11], var6.field1513[var11]);
            }
        }
        Statics.field1821 = 0;
        Statics.field1822 = 0;
        Statics.field1823 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1518; var15++) {
            int var16 = var7.field1519[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1732[var16] == 0) {
                this.method2100(var8.field1732[var16], var8.field1733[var16], var7.field1521[var15], var7.field1522[var15], var7.field1513[var15]);
            }
        }
        this.field1813 = 0;
    }

    @ObfuscatedName("dt.y(I[IIII)V")
    public void method2100(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1821 = 0;
            Statics.field1822 = 0;
            Statics.field1823 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1818.length) {
                    int[] var10 = this.field1818[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1821 += this.field1774[var12];
                        Statics.field1822 += this.field1793[var12];
                        Statics.field1823 += this.field1792[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1821 = Statics.field1821 / var7 + arg2;
                Statics.field1822 = Statics.field1822 / var7 + arg3;
                Statics.field1823 = Statics.field1823 / var7 + arg4;
            } else {
                Statics.field1821 = arg2;
                Statics.field1822 = arg3;
                Statics.field1823 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1818.length) {
                    int[] var15 = this.field1818[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1774[var17] += arg2;
                        this.field1793[var17] += arg3;
                        this.field1792[var17] += arg4;
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
                        this.field1774[var22] -= Statics.field1821;
                        this.field1793[var22] -= Statics.field1822;
                        this.field1792[var22] -= Statics.field1823;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1829[var25];
                            int var27 = field1830[var25];
                            int var28 = this.field1793[var22] * var26 + this.field1774[var22] * var27 >> 16;
                            this.field1793[var22] = this.field1793[var22] * var27 - this.field1774[var22] * var26 >> 16;
                            this.field1774[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1829[var23];
                            int var30 = field1830[var23];
                            int var31 = this.field1793[var22] * var30 - this.field1792[var22] * var29 >> 16;
                            this.field1792[var22] = this.field1793[var22] * var29 + this.field1792[var22] * var30 >> 16;
                            this.field1793[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1829[var24];
                            int var33 = field1830[var24];
                            int var34 = this.field1792[var22] * var32 + this.field1774[var22] * var33 >> 16;
                            this.field1792[var22] = this.field1792[var22] * var33 - this.field1774[var22] * var32 >> 16;
                            this.field1774[var22] = var34;
                        }
                        this.field1774[var22] += Statics.field1821;
                        this.field1793[var22] += Statics.field1822;
                        this.field1792[var22] += Statics.field1823;
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
                        this.field1774[var39] -= Statics.field1821;
                        this.field1793[var39] -= Statics.field1822;
                        this.field1792[var39] -= Statics.field1823;
                        this.field1774[var39] = this.field1774[var39] * arg2 / 128;
                        this.field1793[var39] = this.field1793[var39] * arg3 / 128;
                        this.field1792[var39] = this.field1792[var39] * arg4 / 128;
                        this.field1774[var39] += Statics.field1821;
                        this.field1793[var39] += Statics.field1822;
                        this.field1792[var39] += Statics.field1823;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1817 != null && this.field1785 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1817.length) {
                    int[] var42 = this.field1817[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1785[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1785[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dt.d()V")
    public void method2101() {
        for (int var1 = 0; var1 < this.field1773; var1++) {
            int var2 = this.field1774[var1];
            this.field1774[var1] = this.field1792[var1];
            this.field1792[var1] = -var2;
        }
        this.field1813 = 0;
    }

    @ObfuscatedName("dt.e()V")
    public void method2102() {
        for (int var1 = 0; var1 < this.field1773; var1++) {
            this.field1774[var1] = -this.field1774[var1];
            this.field1792[var1] = -this.field1792[var1];
        }
        this.field1813 = 0;
    }

    @ObfuscatedName("dt.l()V")
    public void method2103() {
        for (int var1 = 0; var1 < this.field1773; var1++) {
            int var2 = this.field1792[var1];
            this.field1792[var1] = this.field1774[var1];
            this.field1774[var1] = -var2;
        }
        this.field1813 = 0;
    }

    @ObfuscatedName("dt.u(I)V")
    public void method2098(int arg0) {
        int var2 = field1829[arg0];
        int var3 = field1830[arg0];
        for (int var4 = 0; var4 < this.field1773; var4++) {
            int var5 = this.field1793[var4] * var3 - this.field1792[var4] * var2 >> 16;
            this.field1792[var4] = this.field1793[var4] * var2 + this.field1792[var4] * var3 >> 16;
            this.field1793[var4] = var5;
        }
        this.field1813 = 0;
    }

    @ObfuscatedName("dt.a(III)V")
    public void method2105(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1773; var4++) {
            this.field1774[var4] += arg0;
            this.field1793[var4] += arg1;
            this.field1792[var4] += arg2;
        }
        this.field1813 = 0;
    }

    @ObfuscatedName("dt.b(III)V")
    public void method2128(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1773; var4++) {
            this.field1774[var4] = this.field1774[var4] * arg0 / 128;
            this.field1793[var4] = this.field1793[var4] * arg1 / 128;
            this.field1792[var4] = this.field1792[var4] * arg2 / 128;
        }
        this.field1813 = 0;
    }

    @ObfuscatedName("dt.s(IIIIIII)V")
    public final void method2107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1832[0] = -1;
        if (this.field1813 != 2 && this.field1813 != 1) {
            this.method2096();
        }
        int var8 = Statics.field1553;
        int var9 = Statics.field1565;
        int var10 = field1829[arg0];
        int var11 = field1830[arg0];
        int var12 = field1829[arg1];
        int var13 = field1830[arg1];
        int var14 = field1829[arg2];
        int var15 = field1830[arg2];
        int var16 = field1829[arg3];
        int var17 = field1830[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1773; var19++) {
            int var20 = this.field1774[var19];
            int var21 = this.field1793[var19];
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
            field1806[var19] = var30 - var18;
            field1804[var19] = class91.field1554 * var26 / var30 + var8;
            field1780[var19] = class91.field1554 * var29 / var30 + var9;
            if (this.field1790 > 0) {
                field1807[var19] = var26;
                field1786[var19] = var29;
                field1809[var19] = var30;
            }
        }
        try {
            this.method2109(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dt.v(IIIIIIII)V")
    public final void method2145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1832[0] = -1;
        if (this.field1813 != 2 && this.field1813 != 1) {
            this.method2096();
        }
        int var9 = Statics.field1553;
        int var10 = Statics.field1565;
        int var11 = field1829[arg0];
        int var12 = field1830[arg0];
        int var13 = field1829[arg1];
        int var14 = field1830[arg1];
        int var15 = field1829[arg2];
        int var16 = field1830[arg2];
        int var17 = field1829[arg3];
        int var18 = field1830[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1773; var20++) {
            int var21 = this.field1774[var20];
            int var22 = this.field1793[var20];
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
            field1806[var20] = var31 - var19;
            field1804[var20] = class91.field1554 * var27 / arg7 + var9;
            field1780[var20] = class91.field1554 * var30 / arg7 + var10;
            if (this.field1790 > 0) {
                field1807[var20] = var27;
                field1786[var20] = var30;
                field1809[var20] = var31;
            }
        }
        try {
            this.method2109(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dt.at(IIIIIIIII)V")
    public void method1729(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1832[0] = -1;
        if (this.field1813 != 1) {
            this.method2095();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1798 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1798) * class91.field1554;
        if (var15 / var13 >= Statics.field1558) {
            return;
        }
        int var16 = (this.field1798 + var14) * class91.field1554;
        if (var16 / var13 <= Statics.field1557) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1798 * arg1 >> 16;
        int var19 = (var17 + var18) * class91.field1554;
        if (var19 / var13 <= Statics.field1555) {
            return;
        }
        int var20 = (this.field1437 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class91.field1554;
        if (var21 / var13 >= Statics.field1552) {
            return;
        }
        int var22 = (this.field1437 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1790 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1834) {
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
            int var32 = field1825 - Statics.field1553;
            int var33 = field1826 - Statics.field1565;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1795) {
                    field1828[field1827++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1553;
        int var35 = Statics.field1565;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1829[arg0];
            var37 = field1830[arg0];
        }
        for (int var38 = 0; var38 < this.field1773; var38++) {
            int var39 = this.field1774[var38];
            int var40 = this.field1793[var38];
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
            field1806[var38] = var50 - var11;
            if (var50 >= 50) {
                field1804[var38] = class91.field1554 * var46 / var50 + var34;
                field1780[var38] = class91.field1554 * var49 / var50 + var35;
            } else {
                field1804[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1807[var38] = var46;
                field1786[var38] = var49;
                field1809[var38] = var50;
            }
        }
        try {
            this.method2109(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dt.j(ZZI)V")
    public final void method2109(boolean arg0, boolean arg1, int arg2) {
        if (this.field1801 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1801; var4++) {
            field1832[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1789; var5++) {
            if (this.field1783[var5] != -2) {
                int var6 = this.field1770[var5];
                int var7 = this.field1779[var5];
                int var8 = this.field1794[var5];
                int var9 = field1804[var6];
                int var10 = field1804[var7];
                int var11 = field1804[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1807[var6];
                    int var13 = field1807[var7];
                    int var14 = field1807[var8];
                    int var15 = field1786[var6];
                    int var16 = field1786[var7];
                    int var17 = field1786[var8];
                    int var18 = field1809[var6];
                    int var19 = field1809[var7];
                    int var20 = field1809[var8];
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
                        field1797[var5] = true;
                        int var30 = (field1806[var6] + field1806[var7] + field1806[var8]) / 3 + this.field1800;
                        field1812[var30][field1832[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2108(field1825, field1826, field1780[var6], field1780[var7], field1780[var8], var9, var10, var11)) {
                        field1828[field1827++] = arg2;
                        arg1 = false;
                    }
                    if ((field1780[var8] - field1780[var7]) * (var9 - var10) - (field1780[var6] - field1780[var7]) * (var11 - var10) > 0) {
                        field1797[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1545 && var10 <= Statics.field1545 && var11 <= Statics.field1545) {
                            field1802[var5] = false;
                        } else {
                            field1802[var5] = true;
                        }
                        int var31 = (field1806[var6] + field1806[var7] + field1806[var8]) / 3 + this.field1800;
                        field1812[var31][field1832[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1784 == null) {
            for (int var32 = this.field1801 - 1; var32 >= 0; var32--) {
                int var33 = field1832[var32];
                if (var33 > 0) {
                    int[] var34 = field1812[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2110(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1777[var36] = 0;
            field1810[var36] = 0;
        }
        for (int var37 = this.field1801 - 1; var37 >= 0; var37--) {
            int var38 = field1832[var37];
            if (var38 > 0) {
                int[] var39 = field1812[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1784[var41];
                    int var43 = field1777[var42]++;
                    field1814[var42][var43] = var41;
                    if (var42 < 10) {
                        field1810[var42] += var37;
                    } else if (var42 == 10) {
                        field1815[var43] = var37;
                    } else {
                        field1816[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1777[1] > 0 || field1777[2] > 0) {
            var44 = (field1810[1] + field1810[2]) / (field1777[1] + field1777[2]);
        }
        int var45 = 0;
        if (field1777[3] > 0 || field1777[4] > 0) {
            var45 = (field1810[3] + field1810[4]) / (field1777[3] + field1777[4]);
        }
        int var46 = 0;
        if (field1777[6] > 0 || field1777[8] > 0) {
            var46 = (field1810[6] + field1810[8]) / (field1777[6] + field1777[8]);
        }
        int var47 = 0;
        int var48 = field1777[10];
        int[] var49 = field1814[10];
        int[] var50 = field1815;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1777[11];
            var49 = field1814[11];
            var50 = field1816;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2110(var49[var47++]);
                if (var47 == var48 && field1814[11] != var49) {
                    var47 = 0;
                    var48 = field1777[11];
                    var49 = field1814[11];
                    var50 = field1816;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2110(var49[var47++]);
                if (var47 == var48 && field1814[11] != var49) {
                    var47 = 0;
                    var48 = field1777[11];
                    var49 = field1814[11];
                    var50 = field1816;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2110(var49[var47++]);
                if (var47 == var48 && field1814[11] != var49) {
                    var47 = 0;
                    var48 = field1777[11];
                    var49 = field1814[11];
                    var50 = field1816;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1777[var52];
            int[] var54 = field1814[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2110(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2110(var49[var47++]);
            if (var47 == var48 && field1814[11] != var49) {
                var47 = 0;
                var49 = field1814[11];
                var48 = field1777[11];
                var50 = field1816;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dt.z(I)V")
    public final void method2110(int arg0) {
        if (field1797[arg0]) {
            this.method2090(arg0);
            return;
        }
        int var2 = this.field1770[arg0];
        int var3 = this.field1779[arg0];
        int var4 = this.field1794[arg0];
        class91.field1560 = field1802[arg0];
        if (this.field1785 == null) {
            class91.field1547 = 0;
        } else {
            class91.field1547 = this.field1785[arg0] & 0xFF;
        }
        if (this.field1787 != null && this.field1787[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1775 == null || this.field1775[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1775[arg0] & 0xFF;
                var6 = this.field1811[var5];
                var7 = this.field1791[var5];
                var8 = this.field1776[var5];
            }
            if (this.field1783[arg0] == -1) {
                class91.method1930(field1780[var2], field1780[var3], field1780[var4], field1804[var2], field1804[var3], field1804[var4], this.field1781[arg0], this.field1781[arg0], this.field1781[arg0], field1807[var6], field1807[var7], field1807[var8], field1786[var6], field1786[var7], field1786[var8], field1809[var6], field1809[var7], field1809[var8], this.field1787[arg0]);
            } else {
                class91.method1930(field1780[var2], field1780[var3], field1780[var4], field1804[var2], field1804[var3], field1804[var4], this.field1781[arg0], this.field1782[arg0], this.field1783[arg0], field1807[var6], field1807[var7], field1807[var8], field1786[var6], field1786[var7], field1786[var8], field1809[var6], field1809[var7], field1809[var8], this.field1787[arg0]);
            }
        } else if (this.field1783[arg0] == -1) {
            class91.method1911(field1780[var2], field1780[var3], field1780[var4], field1804[var2], field1804[var3], field1804[var4], field1831[this.field1781[arg0]]);
        } else {
            class91.method1909(field1780[var2], field1780[var3], field1780[var4], field1804[var2], field1804[var3], field1804[var4], this.field1781[arg0], this.field1782[arg0], this.field1783[arg0]);
        }
    }

    @ObfuscatedName("dt.n(I)V")
    public final void method2090(int arg0) {
        int var2 = Statics.field1553;
        int var3 = Statics.field1565;
        int var4 = 0;
        int var5 = this.field1770[arg0];
        int var6 = this.field1779[arg0];
        int var7 = this.field1794[arg0];
        int var8 = field1809[var5];
        int var9 = field1809[var6];
        int var10 = field1809[var7];
        if (this.field1785 == null) {
            class91.field1547 = 0;
        } else {
            class91.field1547 = this.field1785[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1769[var4] = field1804[var5];
            field1819[var4] = field1780[var5];
            field1824[var4++] = this.field1781[arg0];
        } else {
            int var11 = field1807[var5];
            int var12 = field1786[var5];
            int var13 = this.field1781[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1820[var10 - var8];
                field1769[var4] = (((field1807[var7] - var11) * var14 >> 16) + var11) * class91.field1554 / 50 + var2;
                field1819[var4] = (((field1786[var7] - var12) * var14 >> 16) + var12) * class91.field1554 / 50 + var3;
                field1824[var4++] = ((this.field1783[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1820[var9 - var8];
                field1769[var4] = (((field1807[var6] - var11) * var15 >> 16) + var11) * class91.field1554 / 50 + var2;
                field1819[var4] = (((field1786[var6] - var12) * var15 >> 16) + var12) * class91.field1554 / 50 + var3;
                field1824[var4++] = ((this.field1782[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1769[var4] = field1804[var6];
            field1819[var4] = field1780[var6];
            field1824[var4++] = this.field1782[arg0];
        } else {
            int var16 = field1807[var6];
            int var17 = field1786[var6];
            int var18 = this.field1782[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1820[var8 - var9];
                field1769[var4] = (((field1807[var5] - var16) * var19 >> 16) + var16) * class91.field1554 / 50 + var2;
                field1819[var4] = (((field1786[var5] - var17) * var19 >> 16) + var17) * class91.field1554 / 50 + var3;
                field1824[var4++] = ((this.field1781[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1820[var10 - var9];
                field1769[var4] = (((field1807[var7] - var16) * var20 >> 16) + var16) * class91.field1554 / 50 + var2;
                field1819[var4] = (((field1786[var7] - var17) * var20 >> 16) + var17) * class91.field1554 / 50 + var3;
                field1824[var4++] = ((this.field1783[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1769[var4] = field1804[var7];
            field1819[var4] = field1780[var7];
            field1824[var4++] = this.field1783[arg0];
        } else {
            int var21 = field1807[var7];
            int var22 = field1786[var7];
            int var23 = this.field1783[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1820[var9 - var10];
                field1769[var4] = (((field1807[var6] - var21) * var24 >> 16) + var21) * class91.field1554 / 50 + var2;
                field1819[var4] = (((field1786[var6] - var22) * var24 >> 16) + var22) * class91.field1554 / 50 + var3;
                field1824[var4++] = ((this.field1782[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1820[var8 - var10];
                field1769[var4] = (((field1807[var5] - var21) * var25 >> 16) + var21) * class91.field1554 / 50 + var2;
                field1819[var4] = (((field1786[var5] - var22) * var25 >> 16) + var22) * class91.field1554 / 50 + var3;
                field1824[var4++] = ((this.field1781[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1769[0];
        int var27 = field1769[1];
        int var28 = field1769[2];
        int var29 = field1819[0];
        int var30 = field1819[1];
        int var31 = field1819[2];
        class91.field1560 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1545 || var27 > Statics.field1545 || var28 > Statics.field1545) {
                class91.field1560 = true;
            }
            if (this.field1787 != null && this.field1787[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1775 == null || this.field1775[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1775[arg0] & 0xFF;
                    var33 = this.field1811[var32];
                    var34 = this.field1791[var32];
                    var35 = this.field1776[var32];
                }
                if (this.field1783[arg0] == -1) {
                    class91.method1930(var29, var30, var31, var26, var27, var28, this.field1781[arg0], this.field1781[arg0], this.field1781[arg0], field1807[var33], field1807[var34], field1807[var35], field1786[var33], field1786[var34], field1786[var35], field1809[var33], field1809[var34], field1809[var35], this.field1787[arg0]);
                } else {
                    class91.method1930(var29, var30, var31, var26, var27, var28, field1824[0], field1824[1], field1824[2], field1807[var33], field1807[var34], field1807[var35], field1786[var33], field1786[var34], field1786[var35], field1809[var33], field1809[var34], field1809[var35], this.field1787[arg0]);
                }
            } else if (this.field1783[arg0] == -1) {
                class91.method1911(var29, var30, var31, var26, var27, var28, field1831[this.field1781[arg0]]);
            } else {
                class91.method1909(var29, var30, var31, var26, var27, var28, field1824[0], field1824[1], field1824[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1545 || var27 > Statics.field1545 || var28 > Statics.field1545 || field1769[3] < 0 || field1769[3] > Statics.field1545) {
            class91.field1560 = true;
        }
        if (this.field1787 != null && this.field1787[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1775 == null || this.field1775[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1775[arg0] & 0xFF;
                var37 = this.field1811[var36];
                var38 = this.field1791[var36];
                var39 = this.field1776[var36];
            }
            short var40 = this.field1787[arg0];
            if (this.field1783[arg0] == -1) {
                class91.method1930(var29, var30, var31, var26, var27, var28, this.field1781[arg0], this.field1781[arg0], this.field1781[arg0], field1807[var37], field1807[var38], field1807[var39], field1786[var37], field1786[var38], field1786[var39], field1809[var37], field1809[var38], field1809[var39], var40);
                class91.method1930(var29, var31, field1819[3], var26, var28, field1769[3], this.field1781[arg0], this.field1781[arg0], this.field1781[arg0], field1807[var37], field1807[var38], field1807[var39], field1786[var37], field1786[var38], field1786[var39], field1809[var37], field1809[var38], field1809[var39], var40);
            } else {
                class91.method1930(var29, var30, var31, var26, var27, var28, field1824[0], field1824[1], field1824[2], field1807[var37], field1807[var38], field1807[var39], field1786[var37], field1786[var38], field1786[var39], field1809[var37], field1809[var38], field1809[var39], var40);
                class91.method1930(var29, var31, field1819[3], var26, var28, field1769[3], field1824[0], field1824[2], field1824[3], field1807[var37], field1807[var38], field1807[var39], field1786[var37], field1786[var38], field1786[var39], field1809[var37], field1809[var38], field1809[var39], var40);
            }
        } else if (this.field1783[arg0] == -1) {
            int var41 = field1831[this.field1781[arg0]];
            class91.method1911(var29, var30, var31, var26, var27, var28, var41);
            class91.method1911(var29, var31, field1819[3], var26, var28, field1769[3], var41);
        } else {
            class91.method1909(var29, var30, var31, var26, var27, var28, field1824[0], field1824[1], field1824[2]);
            class91.method1909(var29, var31, field1819[3], var26, var28, field1769[3], field1824[0], field1824[2], field1824[3]);
        }
    }

    @ObfuscatedName("dt.p(IIIIIIII)Z")
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
