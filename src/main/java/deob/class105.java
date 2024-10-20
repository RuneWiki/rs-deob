package deob;

@ObfuscatedName("dn")
public class class105 extends class85 {

    @ObfuscatedName("dn.d")
    public static class105 field1819 = new class105();

    @ObfuscatedName("dn.p")
    public static byte[] field1788 = new byte[1];

    @ObfuscatedName("dn.v")
    public static class105 field1789 = new class105();

    @ObfuscatedName("dn.l")
    public static byte[] field1790 = new byte[1];

    @ObfuscatedName("dn.y")
    public int field1791 = 0;

    @ObfuscatedName("dn.w")
    public int[] field1792;

    @ObfuscatedName("dn.u")
    public int[] field1813;

    @ObfuscatedName("dn.a")
    public int[] field1794;

    @ObfuscatedName("dn.e")
    public int field1837 = 0;

    @ObfuscatedName("dn.b")
    public int[] field1796;

    @ObfuscatedName("dn.o")
    public int[] field1797;

    @ObfuscatedName("dn.m")
    public int[] field1798;

    @ObfuscatedName("dn.x")
    public int[] field1799;

    @ObfuscatedName("dn.k")
    public int[] field1800;

    @ObfuscatedName("dn.n")
    public int[] field1801;

    @ObfuscatedName("dn.j")
    public byte[] field1821;

    @ObfuscatedName("dn.t")
    public byte[] field1803;

    @ObfuscatedName("dn.z")
    public byte[] field1804;

    @ObfuscatedName("dn.h")
    public short[] field1787;

    @ObfuscatedName("dn.i")
    public byte field1817 = 0;

    @ObfuscatedName("dn.q")
    public int field1807 = 0;

    @ObfuscatedName("dn.r")
    public int[] field1808;

    @ObfuscatedName("dn.s")
    public int[] field1809;

    @ObfuscatedName("dn.g")
    public int[] field1844;

    @ObfuscatedName("dn.f")
    public int[][] field1811;

    @ObfuscatedName("dn.c")
    public int[][] field1802;

    @ObfuscatedName("dn.ae")
    public boolean field1815 = false;

    @ObfuscatedName("dn.ao")
    public int field1795;

    @ObfuscatedName("dn.ak")
    public int field1851;

    @ObfuscatedName("dn.ah")
    public int field1816;

    @ObfuscatedName("dn.al")
    public int field1833;

    @ObfuscatedName("dn.ax")
    public int field1818;

    @ObfuscatedName("dn.ad")
    public static boolean[] field1820 = new boolean[4096];

    @ObfuscatedName("dn.aw")
    public static boolean[] field1840 = new boolean[4096];

    @ObfuscatedName("dn.as")
    public static int[] field1822 = new int[4096];

    @ObfuscatedName("dn.ai")
    public static int[] field1823 = new int[4096];

    @ObfuscatedName("dn.aj")
    public static int[] field1824 = new int[4096];

    @ObfuscatedName("dn.ap")
    public static int[] field1825 = new int[4096];

    @ObfuscatedName("dn.ar")
    public static int[] field1826 = new int[4096];

    @ObfuscatedName("dn.ac")
    public static int[] field1827 = new int[4096];

    @ObfuscatedName("dn.af")
    public static int[] field1829 = new int[1600];

    @ObfuscatedName("dn.aa")
    public static int[][] field1805 = new int[1600][512];

    @ObfuscatedName("dn.ab")
    public static int[] field1831 = new int[12];

    @ObfuscatedName("dn.av")
    public static int[][] field1839 = new int[12][2000];

    @ObfuscatedName("dn.au")
    public static int[] field1806 = new int[2000];

    @ObfuscatedName("dn.ay")
    public static int[] field1834 = new int[2000];

    @ObfuscatedName("dn.ag")
    public static int[] field1793 = new int[12];

    @ObfuscatedName("dn.an")
    public static int[] field1836 = new int[10];

    @ObfuscatedName("dn.am")
    public static int[] field1812 = new int[10];

    @ObfuscatedName("dn.at")
    public static int[] field1838 = new int[10];

    @ObfuscatedName("dn.bk")
    public static boolean field1842 = false;

    @ObfuscatedName("dn.bd")
    public static int field1843 = 0;

    @ObfuscatedName("dn.br")
    public static int field1849 = 0;

    @ObfuscatedName("dn.bq")
    public static int field1845 = 0;

    @ObfuscatedName("dn.bm")
    public static int[] field1828 = new int[1000];

    @ObfuscatedName("dn.be")
    public static int[] field1847 = class91.field1570;

    @ObfuscatedName("dn.bb")
    public static int[] field1848 = class91.field1575;

    @ObfuscatedName("dn.bh")
    public static int[] field1846 = class91.field1576;

    @ObfuscatedName("dn.bg")
    public static int[] field1850 = class91.field1579;

    public class105() {
    }

    public class105(class105[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1791 = 0;
        this.field1837 = 0;
        this.field1807 = 0;
        this.field1817 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class105 var8 = arg0[var7];
            if (var8 != null) {
                this.field1791 += var8.field1791;
                this.field1837 += var8.field1837;
                this.field1807 += var8.field1807;
                if (var8.field1821 == null) {
                    if (this.field1817 == -1) {
                        this.field1817 = var8.field1817;
                    }
                    if (this.field1817 != var8.field1817) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1803 != null;
                var5 |= var8.field1787 != null;
                var6 |= var8.field1804 != null;
            }
        }
        this.field1792 = new int[this.field1791];
        this.field1813 = new int[this.field1791];
        this.field1794 = new int[this.field1791];
        this.field1796 = new int[this.field1837];
        this.field1797 = new int[this.field1837];
        this.field1798 = new int[this.field1837];
        this.field1799 = new int[this.field1837];
        this.field1800 = new int[this.field1837];
        this.field1801 = new int[this.field1837];
        if (var3) {
            this.field1821 = new byte[this.field1837];
        }
        if (var4) {
            this.field1803 = new byte[this.field1837];
        }
        if (var5) {
            this.field1787 = new short[this.field1837];
        }
        if (var6) {
            this.field1804 = new byte[this.field1837];
        }
        if (this.field1807 > 0) {
            this.field1808 = new int[this.field1807];
            this.field1809 = new int[this.field1807];
            this.field1844 = new int[this.field1807];
        }
        this.field1791 = 0;
        this.field1837 = 0;
        this.field1807 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class105 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1837; var11++) {
                    this.field1796[this.field1837] = var10.field1796[var11] + this.field1791;
                    this.field1797[this.field1837] = var10.field1797[var11] + this.field1791;
                    this.field1798[this.field1837] = var10.field1798[var11] + this.field1791;
                    this.field1799[this.field1837] = var10.field1799[var11];
                    this.field1800[this.field1837] = var10.field1800[var11];
                    this.field1801[this.field1837] = var10.field1801[var11];
                    if (var3) {
                        if (var10.field1821 == null) {
                            this.field1821[this.field1837] = var10.field1817;
                        } else {
                            this.field1821[this.field1837] = var10.field1821[var11];
                        }
                    }
                    if (var4 && var10.field1803 != null) {
                        this.field1803[this.field1837] = var10.field1803[var11];
                    }
                    if (var5) {
                        if (var10.field1787 == null) {
                            this.field1787[this.field1837] = -1;
                        } else {
                            this.field1787[this.field1837] = var10.field1787[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1804 == null || var10.field1804[var11] == -1) {
                            this.field1804[this.field1837] = -1;
                        } else {
                            this.field1804[this.field1837] = (byte) (var10.field1804[var11] + this.field1807);
                        }
                    }
                    this.field1837++;
                }
                for (int var12 = 0; var12 < var10.field1807; var12++) {
                    this.field1808[this.field1807] = var10.field1808[var12] + this.field1791;
                    this.field1809[this.field1807] = var10.field1809[var12] + this.field1791;
                    this.field1844[this.field1807] = var10.field1844[var12] + this.field1791;
                    this.field1807++;
                }
                for (int var13 = 0; var13 < var10.field1791; var13++) {
                    this.field1792[this.field1791] = var10.field1792[var13];
                    this.field1813[this.field1791] = var10.field1813[var13];
                    this.field1794[this.field1791] = var10.field1794[var13];
                    this.field1791++;
                }
            }
        }
    }

    @ObfuscatedName("dn.d([[IIIIZI)Ldn;")
    public class105 method2153(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2157();
        int var7 = arg1 - this.field1816;
        int var8 = this.field1816 + arg1;
        int var9 = arg3 - this.field1816;
        int var10 = this.field1816 + arg3;
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
            var15.field1791 = this.field1791;
            var15.field1837 = this.field1837;
            var15.field1807 = this.field1807;
            var15.field1792 = this.field1792;
            var15.field1794 = this.field1794;
            var15.field1796 = this.field1796;
            var15.field1797 = this.field1797;
            var15.field1798 = this.field1798;
            var15.field1799 = this.field1799;
            var15.field1800 = this.field1800;
            var15.field1801 = this.field1801;
            var15.field1821 = this.field1821;
            var15.field1803 = this.field1803;
            var15.field1804 = this.field1804;
            var15.field1787 = this.field1787;
            var15.field1817 = this.field1817;
            var15.field1808 = this.field1808;
            var15.field1809 = this.field1809;
            var15.field1844 = this.field1844;
            var15.field1811 = this.field1811;
            var15.field1802 = this.field1802;
            var15.field1815 = this.field1815;
            var15.field1813 = new int[var15.field1791];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1791; var16++) {
                int var17 = this.field1792[var16] + arg1;
                int var18 = this.field1794[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1813[var16] = this.field1813[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1791; var26++) {
                int var27 = (-this.field1813[var26] << 16) / this.field1448;
                if (var27 < arg5) {
                    int var28 = this.field1792[var26] + arg1;
                    int var29 = this.field1794[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1813[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1813[var26];
                }
            }
        }
        var15.field1795 = 0;
        return var15;
    }

    @ObfuscatedName("dn.p(Z)Ldn;")
    public class105 method2154(boolean arg0) {
        if (!arg0 && field1788.length < this.field1837) {
            field1788 = new byte[this.field1837 + 100];
        }
        return this.method2156(arg0, field1819, field1788);
    }

    @ObfuscatedName("dn.l(Z)Ldn;")
    public class105 method2155(boolean arg0) {
        if (!arg0 && field1790.length < this.field1837) {
            field1790 = new byte[this.field1837 + 100];
        }
        return this.method2156(arg0, field1789, field1790);
    }

    @ObfuscatedName("dn.y(ZLdn;[B)Ldn;")
    public class105 method2156(boolean arg0, class105 arg1, byte[] arg2) {
        arg1.field1791 = this.field1791;
        arg1.field1837 = this.field1837;
        arg1.field1807 = this.field1807;
        if (arg1.field1792 == null || arg1.field1792.length < this.field1791) {
            arg1.field1792 = new int[this.field1791 + 100];
            arg1.field1813 = new int[this.field1791 + 100];
            arg1.field1794 = new int[this.field1791 + 100];
        }
        for (int var4 = 0; var4 < this.field1791; var4++) {
            arg1.field1792[var4] = this.field1792[var4];
            arg1.field1813[var4] = this.field1813[var4];
            arg1.field1794[var4] = this.field1794[var4];
        }
        if (arg0) {
            arg1.field1803 = this.field1803;
        } else {
            arg1.field1803 = arg2;
            if (this.field1803 == null) {
                for (int var5 = 0; var5 < this.field1837; var5++) {
                    arg1.field1803[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1837; var6++) {
                    arg1.field1803[var6] = this.field1803[var6];
                }
            }
        }
        arg1.field1796 = this.field1796;
        arg1.field1797 = this.field1797;
        arg1.field1798 = this.field1798;
        arg1.field1799 = this.field1799;
        arg1.field1800 = this.field1800;
        arg1.field1801 = this.field1801;
        arg1.field1821 = this.field1821;
        arg1.field1804 = this.field1804;
        arg1.field1787 = this.field1787;
        arg1.field1817 = this.field1817;
        arg1.field1808 = this.field1808;
        arg1.field1809 = this.field1809;
        arg1.field1844 = this.field1844;
        arg1.field1811 = this.field1811;
        arg1.field1802 = this.field1802;
        arg1.field1815 = this.field1815;
        arg1.field1795 = 0;
        return arg1;
    }

    @ObfuscatedName("dn.w()V")
    public void method2157() {
        if (this.field1795 == 1) {
            return;
        }
        this.field1795 = 1;
        this.field1448 = 0;
        this.field1851 = 0;
        this.field1816 = 0;
        for (int var1 = 0; var1 < this.field1791; var1++) {
            int var2 = this.field1792[var1];
            int var3 = this.field1813[var1];
            int var4 = this.field1794[var1];
            if (-var3 > this.field1448) {
                this.field1448 = -var3;
            }
            if (var3 > this.field1851) {
                this.field1851 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1816) {
                this.field1816 = var5;
            }
        }
        this.field1816 = (int) (Math.sqrt((double) this.field1816) + 0.99D);
        this.field1818 = (int) (Math.sqrt((double) (this.field1448 * this.field1448 + this.field1816 * this.field1816)) + 0.99D);
        this.field1833 = this.field1818 + (int) (Math.sqrt((double) (this.field1851 * this.field1851 + this.field1816 * this.field1816)) + 0.99D);
    }

    @ObfuscatedName("dn.u()V")
    public void method2158() {
        if (this.field1795 == 2) {
            return;
        }
        this.field1795 = 2;
        this.field1816 = 0;
        for (int var1 = 0; var1 < this.field1791; var1++) {
            int var2 = this.field1792[var1];
            int var3 = this.field1813[var1];
            int var4 = this.field1794[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1816) {
                this.field1816 = var5;
            }
        }
        this.field1816 = (int) (Math.sqrt((double) this.field1816) + 0.99D);
        this.field1818 = this.field1816;
        this.field1833 = this.field1816 + this.field1816;
    }

    @ObfuscatedName("dn.a()I")
    public int method2159() {
        this.method2157();
        return this.field1816;
    }

    @ObfuscatedName("dn.e(Lcu;I)V")
    public void method2160(class103 arg0, int arg1) {
        if (this.field1811 == null || arg1 == -1) {
            return;
        }
        class88 var3 = arg0.field1759[arg1];
        class102 var4 = var3.field1530;
        Statics.field1830 = 0;
        Statics.field1814 = 0;
        Statics.field1841 = 0;
        for (int var5 = 0; var5 < var3.field1531; var5++) {
            int var6 = var3.field1532[var5];
            this.method2162(var4.field1748[var6], var4.field1751[var6], var3.field1527[var5], var3.field1534[var5], var3.field1535[var5]);
        }
        this.field1795 = 0;
    }

    @ObfuscatedName("dn.b(Lcu;ILcu;I[I)V")
    public void method2167(class103 arg0, int arg1, class103 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2160(arg0, arg1);
            return;
        }
        class88 var6 = arg0.field1759[arg1];
        class88 var7 = arg2.field1759[arg3];
        class102 var8 = var6.field1530;
        Statics.field1830 = 0;
        Statics.field1814 = 0;
        Statics.field1841 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1531; var11++) {
            int var12 = var6.field1532[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1748[var12] == 0) {
                this.method2162(var8.field1748[var12], var8.field1751[var12], var6.field1527[var11], var6.field1534[var11], var6.field1535[var11]);
            }
        }
        Statics.field1830 = 0;
        Statics.field1814 = 0;
        Statics.field1841 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1531; var15++) {
            int var16 = var7.field1532[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1748[var16] == 0) {
                this.method2162(var8.field1748[var16], var8.field1751[var16], var7.field1527[var15], var7.field1534[var15], var7.field1535[var15]);
            }
        }
        this.field1795 = 0;
    }

    @ObfuscatedName("dn.m(I[IIII)V")
    public void method2162(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1830 = 0;
            Statics.field1814 = 0;
            Statics.field1841 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1811.length) {
                    int[] var10 = this.field1811[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1830 += this.field1792[var12];
                        Statics.field1814 += this.field1813[var12];
                        Statics.field1841 += this.field1794[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1830 = Statics.field1830 / var7 + arg2;
                Statics.field1814 = Statics.field1814 / var7 + arg3;
                Statics.field1841 = Statics.field1841 / var7 + arg4;
            } else {
                Statics.field1830 = arg2;
                Statics.field1814 = arg3;
                Statics.field1841 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1811.length) {
                    int[] var15 = this.field1811[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1792[var17] += arg2;
                        this.field1813[var17] += arg3;
                        this.field1794[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1811.length) {
                    int[] var20 = this.field1811[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1792[var22] -= Statics.field1830;
                        this.field1813[var22] -= Statics.field1814;
                        this.field1794[var22] -= Statics.field1841;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1847[var25];
                            int var27 = field1848[var25];
                            int var28 = this.field1813[var22] * var26 + this.field1792[var22] * var27 >> 16;
                            this.field1813[var22] = this.field1813[var22] * var27 - this.field1792[var22] * var26 >> 16;
                            this.field1792[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1847[var23];
                            int var30 = field1848[var23];
                            int var31 = this.field1813[var22] * var30 - this.field1794[var22] * var29 >> 16;
                            this.field1794[var22] = this.field1813[var22] * var29 + this.field1794[var22] * var30 >> 16;
                            this.field1813[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1847[var24];
                            int var33 = field1848[var24];
                            int var34 = this.field1794[var22] * var32 + this.field1792[var22] * var33 >> 16;
                            this.field1794[var22] = this.field1794[var22] * var33 - this.field1792[var22] * var32 >> 16;
                            this.field1792[var22] = var34;
                        }
                        this.field1792[var22] += Statics.field1830;
                        this.field1813[var22] += Statics.field1814;
                        this.field1794[var22] += Statics.field1841;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1811.length) {
                    int[] var37 = this.field1811[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1792[var39] -= Statics.field1830;
                        this.field1813[var39] -= Statics.field1814;
                        this.field1794[var39] -= Statics.field1841;
                        this.field1792[var39] = this.field1792[var39] * arg2 / 128;
                        this.field1813[var39] = this.field1813[var39] * arg3 / 128;
                        this.field1794[var39] = this.field1794[var39] * arg4 / 128;
                        this.field1792[var39] += Statics.field1830;
                        this.field1813[var39] += Statics.field1814;
                        this.field1794[var39] += Statics.field1841;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1802 != null && this.field1803 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1802.length) {
                    int[] var42 = this.field1802[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1803[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1803[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dn.x()V")
    public void method2186() {
        for (int var1 = 0; var1 < this.field1791; var1++) {
            int var2 = this.field1792[var1];
            this.field1792[var1] = this.field1794[var1];
            this.field1794[var1] = -var2;
        }
        this.field1795 = 0;
    }

    @ObfuscatedName("dn.k()V")
    public void method2164() {
        for (int var1 = 0; var1 < this.field1791; var1++) {
            this.field1792[var1] = -this.field1792[var1];
            this.field1794[var1] = -this.field1794[var1];
        }
        this.field1795 = 0;
    }

    @ObfuscatedName("dn.n()V")
    public void method2165() {
        for (int var1 = 0; var1 < this.field1791; var1++) {
            int var2 = this.field1794[var1];
            this.field1794[var1] = this.field1792[var1];
            this.field1792[var1] = -var2;
        }
        this.field1795 = 0;
    }

    @ObfuscatedName("dn.j(I)V")
    public void method2166(int arg0) {
        int var2 = field1847[arg0];
        int var3 = field1848[arg0];
        for (int var4 = 0; var4 < this.field1791; var4++) {
            int var5 = this.field1813[var4] * var3 - this.field1794[var4] * var2 >> 16;
            this.field1794[var4] = this.field1813[var4] * var2 + this.field1794[var4] * var3 >> 16;
            this.field1813[var4] = var5;
        }
        this.field1795 = 0;
    }

    @ObfuscatedName("dn.t(III)V")
    public void method2169(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1791; var4++) {
            this.field1792[var4] += arg0;
            this.field1813[var4] += arg1;
            this.field1794[var4] += arg2;
        }
        this.field1795 = 0;
    }

    @ObfuscatedName("dn.z(III)V")
    public void method2168(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1791; var4++) {
            this.field1792[var4] = this.field1792[var4] * arg0 / 128;
            this.field1813[var4] = this.field1813[var4] * arg1 / 128;
            this.field1794[var4] = this.field1794[var4] * arg2 / 128;
        }
        this.field1795 = 0;
    }

    @ObfuscatedName("dn.h(IIIIIII)V")
    public final void method2183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1829[0] = -1;
        if (this.field1795 != 2 && this.field1795 != 1) {
            this.method2158();
        }
        int var8 = Statics.field1567;
        int var9 = Statics.field1568;
        int var10 = field1847[arg0];
        int var11 = field1848[arg0];
        int var12 = field1847[arg1];
        int var13 = field1848[arg1];
        int var14 = field1847[arg2];
        int var15 = field1848[arg2];
        int var16 = field1847[arg3];
        int var17 = field1848[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1791; var19++) {
            int var20 = this.field1792[var19];
            int var21 = this.field1813[var19];
            int var22 = this.field1794[var19];
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
            field1824[var19] = var30 - var18;
            field1822[var19] = class91.field1566 * var26 / var30 + var8;
            field1823[var19] = class91.field1566 * var29 / var30 + var9;
            if (this.field1807 > 0) {
                field1825[var19] = var26;
                field1826[var19] = var29;
                field1827[var19] = var30;
            }
        }
        try {
            this.method2218(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dn.i(IIIIIIII)V")
    public final void method2206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1829[0] = -1;
        if (this.field1795 != 2 && this.field1795 != 1) {
            this.method2158();
        }
        int var9 = Statics.field1567;
        int var10 = Statics.field1568;
        int var11 = field1847[arg0];
        int var12 = field1848[arg0];
        int var13 = field1847[arg1];
        int var14 = field1848[arg1];
        int var15 = field1847[arg2];
        int var16 = field1848[arg2];
        int var17 = field1847[arg3];
        int var18 = field1848[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1791; var20++) {
            int var21 = this.field1792[var20];
            int var22 = this.field1813[var20];
            int var23 = this.field1794[var20];
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
            field1824[var20] = var31 - var19;
            field1822[var20] = class91.field1566 * var27 / arg7 + var9;
            field1823[var20] = class91.field1566 * var30 / arg7 + var10;
            if (this.field1807 > 0) {
                field1825[var20] = var27;
                field1826[var20] = var30;
                field1827[var20] = var31;
            }
        }
        try {
            this.method2218(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dn.c(IIIIIIIII)V")
    public void method1765(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1829[0] = -1;
        if (this.field1795 != 1) {
            this.method2157();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1816 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1816) * class91.field1566;
        if (var15 / var13 >= Statics.field1557) {
            return;
        }
        int var16 = (this.field1816 + var14) * class91.field1566;
        if (var16 / var13 <= Statics.field1571) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1816 * arg1 >> 16;
        int var19 = (var17 + var18) * class91.field1566;
        if (var19 / var13 <= Statics.field1581) {
            return;
        }
        int var20 = (this.field1448 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class91.field1566;
        if (var21 / var13 >= Statics.field1563) {
            return;
        }
        int var22 = (this.field1448 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1807 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1842) {
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
            int var32 = field1843 - Statics.field1567;
            int var33 = field1849 - Statics.field1568;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1815) {
                    field1828[field1845++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1567;
        int var35 = Statics.field1568;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1847[arg0];
            var37 = field1848[arg0];
        }
        for (int var38 = 0; var38 < this.field1791; var38++) {
            int var39 = this.field1792[var38];
            int var40 = this.field1813[var38];
            int var41 = this.field1794[var38];
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
            field1824[var38] = var50 - var11;
            if (var50 >= 50) {
                field1822[var38] = class91.field1566 * var46 / var50 + var34;
                field1823[var38] = class91.field1566 * var49 / var50 + var35;
            } else {
                field1822[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1825[var38] = var46;
                field1826[var38] = var49;
                field1827[var38] = var50;
            }
        }
        try {
            this.method2218(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dn.q(ZZI)V")
    public final void method2218(boolean arg0, boolean arg1, int arg2) {
        if (this.field1833 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1833; var4++) {
            field1829[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1837; var5++) {
            if (this.field1801[var5] != -2) {
                int var6 = this.field1796[var5];
                int var7 = this.field1797[var5];
                int var8 = this.field1798[var5];
                int var9 = field1822[var6];
                int var10 = field1822[var7];
                int var11 = field1822[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1825[var6];
                    int var13 = field1825[var7];
                    int var14 = field1825[var8];
                    int var15 = field1826[var6];
                    int var16 = field1826[var7];
                    int var17 = field1826[var8];
                    int var18 = field1827[var6];
                    int var19 = field1827[var7];
                    int var20 = field1827[var8];
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
                        int var30 = (field1824[var6] + field1824[var7] + field1824[var8]) / 3 + this.field1818;
                        field1805[var30][field1829[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2170(field1843, field1849, field1823[var6], field1823[var7], field1823[var8], var9, var10, var11)) {
                        field1828[field1845++] = arg2;
                        arg1 = false;
                    }
                    if ((field1823[var8] - field1823[var7]) * (var9 - var10) - (field1823[var6] - field1823[var7]) * (var11 - var10) > 0) {
                        field1840[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1574 && var10 <= Statics.field1574 && var11 <= Statics.field1574) {
                            field1820[var5] = false;
                        } else {
                            field1820[var5] = true;
                        }
                        int var31 = (field1824[var6] + field1824[var7] + field1824[var8]) / 3 + this.field1818;
                        field1805[var31][field1829[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1821 == null) {
            for (int var32 = this.field1833 - 1; var32 >= 0; var32--) {
                int var33 = field1829[var32];
                if (var33 > 0) {
                    int[] var34 = field1805[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2174(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1831[var36] = 0;
            field1793[var36] = 0;
        }
        for (int var37 = this.field1833 - 1; var37 >= 0; var37--) {
            int var38 = field1829[var37];
            if (var38 > 0) {
                int[] var39 = field1805[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1821[var41];
                    int var43 = field1831[var42]++;
                    field1839[var42][var43] = var41;
                    if (var42 < 10) {
                        field1793[var42] += var37;
                    } else if (var42 == 10) {
                        field1806[var43] = var37;
                    } else {
                        field1834[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1831[1] > 0 || field1831[2] > 0) {
            var44 = (field1793[1] + field1793[2]) / (field1831[1] + field1831[2]);
        }
        int var45 = 0;
        if (field1831[3] > 0 || field1831[4] > 0) {
            var45 = (field1793[3] + field1793[4]) / (field1831[3] + field1831[4]);
        }
        int var46 = 0;
        if (field1831[6] > 0 || field1831[8] > 0) {
            var46 = (field1793[6] + field1793[8]) / (field1831[6] + field1831[8]);
        }
        int var47 = 0;
        int var48 = field1831[10];
        int[] var49 = field1839[10];
        int[] var50 = field1806;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1831[11];
            var49 = field1839[11];
            var50 = field1834;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2174(var49[var47++]);
                if (var47 == var48 && field1839[11] != var49) {
                    var47 = 0;
                    var48 = field1831[11];
                    var49 = field1839[11];
                    var50 = field1834;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2174(var49[var47++]);
                if (var47 == var48 && field1839[11] != var49) {
                    var47 = 0;
                    var48 = field1831[11];
                    var49 = field1839[11];
                    var50 = field1834;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2174(var49[var47++]);
                if (var47 == var48 && field1839[11] != var49) {
                    var47 = 0;
                    var48 = field1831[11];
                    var49 = field1839[11];
                    var50 = field1834;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1831[var52];
            int[] var54 = field1839[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2174(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2174(var49[var47++]);
            if (var47 == var48 && field1839[11] != var49) {
                var47 = 0;
                var49 = field1839[11];
                var48 = field1831[11];
                var50 = field1834;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dn.r(I)V")
    public final void method2174(int arg0) {
        if (field1840[arg0]) {
            this.method2172(arg0);
            return;
        }
        int var2 = this.field1796[arg0];
        int var3 = this.field1797[arg0];
        int var4 = this.field1798[arg0];
        class91.field1562 = field1820[arg0];
        if (this.field1803 == null) {
            class91.field1561 = 0;
        } else {
            class91.field1561 = this.field1803[arg0] & 0xFF;
        }
        if (this.field1787 != null && this.field1787[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1804 == null || this.field1804[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1804[arg0] & 0xFF;
                var6 = this.field1808[var5];
                var7 = this.field1809[var5];
                var8 = this.field1844[var5];
            }
            if (this.field1801[arg0] == -1) {
                class91.method1965(field1823[var2], field1823[var3], field1823[var4], field1822[var2], field1822[var3], field1822[var4], this.field1799[arg0], this.field1799[arg0], this.field1799[arg0], field1825[var6], field1825[var7], field1825[var8], field1826[var6], field1826[var7], field1826[var8], field1827[var6], field1827[var7], field1827[var8], this.field1787[arg0]);
            } else {
                class91.method1965(field1823[var2], field1823[var3], field1823[var4], field1822[var2], field1822[var3], field1822[var4], this.field1799[arg0], this.field1800[arg0], this.field1801[arg0], field1825[var6], field1825[var7], field1825[var8], field1826[var6], field1826[var7], field1826[var8], field1827[var6], field1827[var7], field1827[var8], this.field1787[arg0]);
            }
        } else if (this.field1801[arg0] == -1) {
            class91.method1971(field1823[var2], field1823[var3], field1823[var4], field1822[var2], field1822[var3], field1822[var4], field1846[this.field1799[arg0]]);
        } else {
            class91.method1986(field1823[var2], field1823[var3], field1823[var4], field1822[var2], field1822[var3], field1822[var4], this.field1799[arg0], this.field1800[arg0], this.field1801[arg0]);
        }
    }

    @ObfuscatedName("dn.s(I)V")
    public final void method2172(int arg0) {
        int var2 = Statics.field1567;
        int var3 = Statics.field1568;
        int var4 = 0;
        int var5 = this.field1796[arg0];
        int var6 = this.field1797[arg0];
        int var7 = this.field1798[arg0];
        int var8 = field1827[var5];
        int var9 = field1827[var6];
        int var10 = field1827[var7];
        if (this.field1803 == null) {
            class91.field1561 = 0;
        } else {
            class91.field1561 = this.field1803[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1836[var4] = field1822[var5];
            field1812[var4] = field1823[var5];
            field1838[var4++] = this.field1799[arg0];
        } else {
            int var11 = field1825[var5];
            int var12 = field1826[var5];
            int var13 = this.field1799[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1850[var10 - var8];
                field1836[var4] = (((field1825[var7] - var11) * var14 >> 16) + var11) * class91.field1566 / 50 + var2;
                field1812[var4] = (((field1826[var7] - var12) * var14 >> 16) + var12) * class91.field1566 / 50 + var3;
                field1838[var4++] = ((this.field1801[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1850[var9 - var8];
                field1836[var4] = (((field1825[var6] - var11) * var15 >> 16) + var11) * class91.field1566 / 50 + var2;
                field1812[var4] = (((field1826[var6] - var12) * var15 >> 16) + var12) * class91.field1566 / 50 + var3;
                field1838[var4++] = ((this.field1800[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1836[var4] = field1822[var6];
            field1812[var4] = field1823[var6];
            field1838[var4++] = this.field1800[arg0];
        } else {
            int var16 = field1825[var6];
            int var17 = field1826[var6];
            int var18 = this.field1800[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1850[var8 - var9];
                field1836[var4] = (((field1825[var5] - var16) * var19 >> 16) + var16) * class91.field1566 / 50 + var2;
                field1812[var4] = (((field1826[var5] - var17) * var19 >> 16) + var17) * class91.field1566 / 50 + var3;
                field1838[var4++] = ((this.field1799[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1850[var10 - var9];
                field1836[var4] = (((field1825[var7] - var16) * var20 >> 16) + var16) * class91.field1566 / 50 + var2;
                field1812[var4] = (((field1826[var7] - var17) * var20 >> 16) + var17) * class91.field1566 / 50 + var3;
                field1838[var4++] = ((this.field1801[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1836[var4] = field1822[var7];
            field1812[var4] = field1823[var7];
            field1838[var4++] = this.field1801[arg0];
        } else {
            int var21 = field1825[var7];
            int var22 = field1826[var7];
            int var23 = this.field1801[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1850[var9 - var10];
                field1836[var4] = (((field1825[var6] - var21) * var24 >> 16) + var21) * class91.field1566 / 50 + var2;
                field1812[var4] = (((field1826[var6] - var22) * var24 >> 16) + var22) * class91.field1566 / 50 + var3;
                field1838[var4++] = ((this.field1800[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1850[var8 - var10];
                field1836[var4] = (((field1825[var5] - var21) * var25 >> 16) + var21) * class91.field1566 / 50 + var2;
                field1812[var4] = (((field1826[var5] - var22) * var25 >> 16) + var22) * class91.field1566 / 50 + var3;
                field1838[var4++] = ((this.field1799[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1836[0];
        int var27 = field1836[1];
        int var28 = field1836[2];
        int var29 = field1812[0];
        int var30 = field1812[1];
        int var31 = field1812[2];
        class91.field1562 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1574 || var27 > Statics.field1574 || var28 > Statics.field1574) {
                class91.field1562 = true;
            }
            if (this.field1787 != null && this.field1787[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1804 == null || this.field1804[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1804[arg0] & 0xFF;
                    var33 = this.field1808[var32];
                    var34 = this.field1809[var32];
                    var35 = this.field1844[var32];
                }
                if (this.field1801[arg0] == -1) {
                    class91.method1965(var29, var30, var31, var26, var27, var28, this.field1799[arg0], this.field1799[arg0], this.field1799[arg0], field1825[var33], field1825[var34], field1825[var35], field1826[var33], field1826[var34], field1826[var35], field1827[var33], field1827[var34], field1827[var35], this.field1787[arg0]);
                } else {
                    class91.method1965(var29, var30, var31, var26, var27, var28, field1838[0], field1838[1], field1838[2], field1825[var33], field1825[var34], field1825[var35], field1826[var33], field1826[var34], field1826[var35], field1827[var33], field1827[var34], field1827[var35], this.field1787[arg0]);
                }
            } else if (this.field1801[arg0] == -1) {
                class91.method1971(var29, var30, var31, var26, var27, var28, field1846[this.field1799[arg0]]);
            } else {
                class91.method1986(var29, var30, var31, var26, var27, var28, field1838[0], field1838[1], field1838[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1574 || var27 > Statics.field1574 || var28 > Statics.field1574 || field1836[3] < 0 || field1836[3] > Statics.field1574) {
            class91.field1562 = true;
        }
        if (this.field1787 != null && this.field1787[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1804 == null || this.field1804[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1804[arg0] & 0xFF;
                var37 = this.field1808[var36];
                var38 = this.field1809[var36];
                var39 = this.field1844[var36];
            }
            short var40 = this.field1787[arg0];
            if (this.field1801[arg0] == -1) {
                class91.method1965(var29, var30, var31, var26, var27, var28, this.field1799[arg0], this.field1799[arg0], this.field1799[arg0], field1825[var37], field1825[var38], field1825[var39], field1826[var37], field1826[var38], field1826[var39], field1827[var37], field1827[var38], field1827[var39], var40);
                class91.method1965(var29, var31, field1812[3], var26, var28, field1836[3], this.field1799[arg0], this.field1799[arg0], this.field1799[arg0], field1825[var37], field1825[var38], field1825[var39], field1826[var37], field1826[var38], field1826[var39], field1827[var37], field1827[var38], field1827[var39], var40);
            } else {
                class91.method1965(var29, var30, var31, var26, var27, var28, field1838[0], field1838[1], field1838[2], field1825[var37], field1825[var38], field1825[var39], field1826[var37], field1826[var38], field1826[var39], field1827[var37], field1827[var38], field1827[var39], var40);
                class91.method1965(var29, var31, field1812[3], var26, var28, field1836[3], field1838[0], field1838[2], field1838[3], field1825[var37], field1825[var38], field1825[var39], field1826[var37], field1826[var38], field1826[var39], field1827[var37], field1827[var38], field1827[var39], var40);
            }
        } else if (this.field1801[arg0] == -1) {
            int var41 = field1846[this.field1799[arg0]];
            class91.method1971(var29, var30, var31, var26, var27, var28, var41);
            class91.method1971(var29, var31, field1812[3], var26, var28, field1836[3], var41);
        } else {
            class91.method1986(var29, var30, var31, var26, var27, var28, field1838[0], field1838[1], field1838[2]);
            class91.method1986(var29, var31, field1812[3], var26, var28, field1836[3], field1838[0], field1838[2], field1838[3]);
        }
    }

    @ObfuscatedName("dn.g(IIIIIIII)Z")
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
