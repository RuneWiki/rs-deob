package deob;

@ObfuscatedName("dl")
public class class105 extends class85 {

    @ObfuscatedName("dl.k")
    public static class105 field1794 = new class105();

    @ObfuscatedName("dl.h")
    public static byte[] field1808 = new byte[1];

    @ObfuscatedName("dl.o")
    public static class105 field1761 = new class105();

    @ObfuscatedName("dl.z")
    public static byte[] field1762 = new byte[1];

    @ObfuscatedName("dl.c")
    public int field1763 = 0;

    @ObfuscatedName("dl.d")
    public int[] field1775;

    @ObfuscatedName("dl.l")
    public int[] field1765;

    @ObfuscatedName("dl.b")
    public int[] field1810;

    @ObfuscatedName("dl.j")
    public int field1792 = 0;

    @ObfuscatedName("dl.f")
    public int[] field1796;

    @ObfuscatedName("dl.i")
    public int[] field1769;

    @ObfuscatedName("dl.g")
    public int[] field1770;

    @ObfuscatedName("dl.t")
    public int[] field1771;

    @ObfuscatedName("dl.e")
    public int[] field1772;

    @ObfuscatedName("dl.q")
    public int[] field1773;

    @ObfuscatedName("dl.u")
    public byte[] field1774;

    @ObfuscatedName("dl.r")
    public byte[] field1767;

    @ObfuscatedName("dl.a")
    public byte[] field1782;

    @ObfuscatedName("dl.m")
    public short[] field1817;

    @ObfuscatedName("dl.y")
    public byte field1778 = 0;

    @ObfuscatedName("dl.x")
    public int field1779 = 0;

    @ObfuscatedName("dl.n")
    public int[] field1759;

    @ObfuscatedName("dl.v")
    public int[] field1781;

    @ObfuscatedName("dl.s")
    public int[] field1788;

    @ObfuscatedName("dl.w")
    public int[][] field1783;

    @ObfuscatedName("dl.p")
    public int[][] field1784;

    @ObfuscatedName("dl.ao")
    public boolean field1777 = false;

    @ObfuscatedName("dl.ae")
    public int field1806;

    @ObfuscatedName("dl.ay")
    public int field1787;

    @ObfuscatedName("dl.ad")
    public int field1785;

    @ObfuscatedName("dl.as")
    public int field1789;

    @ObfuscatedName("dl.ag")
    public int field1790;

    @ObfuscatedName("dl.ar")
    public static boolean[] field1801 = new boolean[4096];

    @ObfuscatedName("dl.az")
    public static boolean[] field1793 = new boolean[4096];

    @ObfuscatedName("dl.aw")
    public static int[] field1766 = new int[4096];

    @ObfuscatedName("dl.at")
    public static int[] field1795 = new int[4096];

    @ObfuscatedName("dl.ap")
    public static int[] field1780 = new int[4096];

    @ObfuscatedName("dl.al")
    public static int[] field1776 = new int[4096];

    @ObfuscatedName("dl.aq")
    public static int[] field1798 = new int[4096];

    @ObfuscatedName("dl.aa")
    public static int[] field1797 = new int[4096];

    @ObfuscatedName("dl.ah")
    public static int[] field1760 = new int[1600];

    @ObfuscatedName("dl.av")
    public static int[][] field1802 = new int[1600][512];

    @ObfuscatedName("dl.af")
    public static int[] field1803 = new int[12];

    @ObfuscatedName("dl.ai")
    public static int[][] field1804 = new int[12][2000];

    @ObfuscatedName("dl.ak")
    public static int[] field1805 = new int[2000];

    @ObfuscatedName("dl.ab")
    public static int[] field1799 = new int[2000];

    @ObfuscatedName("dl.aj")
    public static int[] field1807 = new int[12];

    @ObfuscatedName("dl.ac")
    public static int[] field1816 = new int[10];

    @ObfuscatedName("dl.am")
    public static int[] field1809 = new int[10];

    @ObfuscatedName("dl.an")
    public static int[] field1819 = new int[10];

    @ObfuscatedName("dl.bp")
    public static boolean field1814 = false;

    @ObfuscatedName("dl.by")
    public static int field1815 = 0;

    @ObfuscatedName("dl.bc")
    public static int field1786 = 0;

    @ObfuscatedName("dl.be")
    public static int field1824 = 0;

    @ObfuscatedName("dl.bw")
    public static int[] field1818 = new int[1000];

    @ObfuscatedName("dl.bh")
    public static int[] field1764 = class91.field1555;

    @ObfuscatedName("dl.bn")
    public static int[] field1768 = class91.field1556;

    @ObfuscatedName("dl.bx")
    public static int[] field1821 = class91.field1536;

    @ObfuscatedName("dl.bs")
    public static int[] field1822 = class91.field1551;

    public class105() {
    }

    public class105(class105[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1763 = 0;
        this.field1792 = 0;
        this.field1779 = 0;
        this.field1778 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class105 var8 = arg0[var7];
            if (var8 != null) {
                this.field1763 += var8.field1763;
                this.field1792 += var8.field1792;
                this.field1779 += var8.field1779;
                if (var8.field1774 == null) {
                    if (this.field1778 == -1) {
                        this.field1778 = var8.field1778;
                    }
                    if (this.field1778 != var8.field1778) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1767 != null;
                var5 |= var8.field1817 != null;
                var6 |= var8.field1782 != null;
            }
        }
        this.field1775 = new int[this.field1763];
        this.field1765 = new int[this.field1763];
        this.field1810 = new int[this.field1763];
        this.field1796 = new int[this.field1792];
        this.field1769 = new int[this.field1792];
        this.field1770 = new int[this.field1792];
        this.field1771 = new int[this.field1792];
        this.field1772 = new int[this.field1792];
        this.field1773 = new int[this.field1792];
        if (var3) {
            this.field1774 = new byte[this.field1792];
        }
        if (var4) {
            this.field1767 = new byte[this.field1792];
        }
        if (var5) {
            this.field1817 = new short[this.field1792];
        }
        if (var6) {
            this.field1782 = new byte[this.field1792];
        }
        if (this.field1779 > 0) {
            this.field1759 = new int[this.field1779];
            this.field1781 = new int[this.field1779];
            this.field1788 = new int[this.field1779];
        }
        this.field1763 = 0;
        this.field1792 = 0;
        this.field1779 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class105 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1792; var11++) {
                    this.field1796[this.field1792] = var10.field1796[var11] + this.field1763;
                    this.field1769[this.field1792] = var10.field1769[var11] + this.field1763;
                    this.field1770[this.field1792] = var10.field1770[var11] + this.field1763;
                    this.field1771[this.field1792] = var10.field1771[var11];
                    this.field1772[this.field1792] = var10.field1772[var11];
                    this.field1773[this.field1792] = var10.field1773[var11];
                    if (var3) {
                        if (var10.field1774 == null) {
                            this.field1774[this.field1792] = var10.field1778;
                        } else {
                            this.field1774[this.field1792] = var10.field1774[var11];
                        }
                    }
                    if (var4 && var10.field1767 != null) {
                        this.field1767[this.field1792] = var10.field1767[var11];
                    }
                    if (var5) {
                        if (var10.field1817 == null) {
                            this.field1817[this.field1792] = -1;
                        } else {
                            this.field1817[this.field1792] = var10.field1817[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1782 == null || var10.field1782[var11] == -1) {
                            this.field1782[this.field1792] = -1;
                        } else {
                            this.field1782[this.field1792] = (byte) (var10.field1782[var11] + this.field1779);
                        }
                    }
                    this.field1792++;
                }
                for (int var12 = 0; var12 < var10.field1779; var12++) {
                    this.field1759[this.field1779] = var10.field1759[var12] + this.field1763;
                    this.field1781[this.field1779] = var10.field1781[var12] + this.field1763;
                    this.field1788[this.field1779] = var10.field1788[var12] + this.field1763;
                    this.field1779++;
                }
                for (int var13 = 0; var13 < var10.field1763; var13++) {
                    this.field1775[this.field1763] = var10.field1775[var13];
                    this.field1765[this.field1763] = var10.field1765[var13];
                    this.field1810[this.field1763] = var10.field1810[var13];
                    this.field1763++;
                }
            }
        }
    }

    @ObfuscatedName("dl.k([[IIIIZI)Ldl;")
    public class105 method2137(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2149();
        int var7 = arg1 - this.field1785;
        int var8 = this.field1785 + arg1;
        int var9 = arg3 - this.field1785;
        int var10 = this.field1785 + arg3;
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
            var15.field1763 = this.field1763;
            var15.field1792 = this.field1792;
            var15.field1779 = this.field1779;
            var15.field1775 = this.field1775;
            var15.field1810 = this.field1810;
            var15.field1796 = this.field1796;
            var15.field1769 = this.field1769;
            var15.field1770 = this.field1770;
            var15.field1771 = this.field1771;
            var15.field1772 = this.field1772;
            var15.field1773 = this.field1773;
            var15.field1774 = this.field1774;
            var15.field1767 = this.field1767;
            var15.field1782 = this.field1782;
            var15.field1817 = this.field1817;
            var15.field1778 = this.field1778;
            var15.field1759 = this.field1759;
            var15.field1781 = this.field1781;
            var15.field1788 = this.field1788;
            var15.field1783 = this.field1783;
            var15.field1784 = this.field1784;
            var15.field1777 = this.field1777;
            var15.field1765 = new int[var15.field1763];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1763; var16++) {
                int var17 = this.field1775[var16] + arg1;
                int var18 = this.field1810[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1765[var16] = this.field1765[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1763; var26++) {
                int var27 = (-this.field1765[var26] << 16) / this.field1420;
                if (var27 < arg5) {
                    int var28 = this.field1775[var26] + arg1;
                    int var29 = this.field1810[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1765[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1765[var26];
                }
            }
        }
        var15.field1806 = 0;
        return var15;
    }

    @ObfuscatedName("dl.h(Z)Ldl;")
    public class105 method2138(boolean arg0) {
        if (!arg0 && field1808.length < this.field1792) {
            field1808 = new byte[this.field1792 + 100];
        }
        return this.method2197(arg0, field1794, field1808);
    }

    @ObfuscatedName("dl.z(Z)Ldl;")
    public class105 method2182(boolean arg0) {
        if (!arg0 && field1762.length < this.field1792) {
            field1762 = new byte[this.field1792 + 100];
        }
        return this.method2197(arg0, field1761, field1762);
    }

    @ObfuscatedName("dl.c(ZLdl;[B)Ldl;")
    public class105 method2197(boolean arg0, class105 arg1, byte[] arg2) {
        arg1.field1763 = this.field1763;
        arg1.field1792 = this.field1792;
        arg1.field1779 = this.field1779;
        if (arg1.field1775 == null || arg1.field1775.length < this.field1763) {
            arg1.field1775 = new int[this.field1763 + 100];
            arg1.field1765 = new int[this.field1763 + 100];
            arg1.field1810 = new int[this.field1763 + 100];
        }
        for (int var4 = 0; var4 < this.field1763; var4++) {
            arg1.field1775[var4] = this.field1775[var4];
            arg1.field1765[var4] = this.field1765[var4];
            arg1.field1810[var4] = this.field1810[var4];
        }
        if (arg0) {
            arg1.field1767 = this.field1767;
        } else {
            arg1.field1767 = arg2;
            if (this.field1767 == null) {
                for (int var5 = 0; var5 < this.field1792; var5++) {
                    arg1.field1767[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1792; var6++) {
                    arg1.field1767[var6] = this.field1767[var6];
                }
            }
        }
        arg1.field1796 = this.field1796;
        arg1.field1769 = this.field1769;
        arg1.field1770 = this.field1770;
        arg1.field1771 = this.field1771;
        arg1.field1772 = this.field1772;
        arg1.field1773 = this.field1773;
        arg1.field1774 = this.field1774;
        arg1.field1782 = this.field1782;
        arg1.field1817 = this.field1817;
        arg1.field1778 = this.field1778;
        arg1.field1759 = this.field1759;
        arg1.field1781 = this.field1781;
        arg1.field1788 = this.field1788;
        arg1.field1783 = this.field1783;
        arg1.field1784 = this.field1784;
        arg1.field1777 = this.field1777;
        arg1.field1806 = 0;
        return arg1;
    }

    @ObfuscatedName("dl.d()V")
    public void method2149() {
        if (this.field1806 == 1) {
            return;
        }
        this.field1806 = 1;
        this.field1420 = 0;
        this.field1787 = 0;
        this.field1785 = 0;
        for (int var1 = 0; var1 < this.field1763; var1++) {
            int var2 = this.field1775[var1];
            int var3 = this.field1765[var1];
            int var4 = this.field1810[var1];
            if (-var3 > this.field1420) {
                this.field1420 = -var3;
            }
            if (var3 > this.field1787) {
                this.field1787 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1785) {
                this.field1785 = var5;
            }
        }
        this.field1785 = (int) (Math.sqrt((double) this.field1785) + 0.99D);
        this.field1790 = (int) (Math.sqrt((double) (this.field1420 * this.field1420 + this.field1785 * this.field1785)) + 0.99D);
        this.field1789 = this.field1790 + (int) (Math.sqrt((double) (this.field1787 * this.field1787 + this.field1785 * this.field1785)) + 0.99D);
    }

    @ObfuscatedName("dl.l()V")
    public void method2159() {
        if (this.field1806 == 2) {
            return;
        }
        this.field1806 = 2;
        this.field1785 = 0;
        for (int var1 = 0; var1 < this.field1763; var1++) {
            int var2 = this.field1775[var1];
            int var3 = this.field1765[var1];
            int var4 = this.field1810[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1785) {
                this.field1785 = var5;
            }
        }
        this.field1785 = (int) (Math.sqrt((double) this.field1785) + 0.99D);
        this.field1790 = this.field1785;
        this.field1789 = this.field1785 + this.field1785;
    }

    @ObfuscatedName("dl.b()I")
    public int method2143() {
        this.method2149();
        return this.field1785;
    }

    @ObfuscatedName("dl.j(Lcq;I)V")
    public void method2144(class103 arg0, int arg1) {
        if (this.field1783 == null || arg1 == -1) {
            return;
        }
        class88 var3 = arg0.field1736[arg1];
        class102 var4 = var3.field1505;
        Statics.field1811 = 0;
        Statics.field1812 = 0;
        Statics.field1813 = 0;
        for (int var5 = 0; var5 < var3.field1506; var5++) {
            int var6 = var3.field1507[var5];
            this.method2146(var4.field1729[var6], var4.field1727[var6], var3.field1509[var5], var3.field1504[var5], var3.field1501[var5]);
        }
        this.field1806 = 0;
    }

    @ObfuscatedName("dl.f(Lcq;ILcq;I[I)V")
    public void method2163(class103 arg0, int arg1, class103 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2144(arg0, arg1);
            return;
        }
        class88 var6 = arg0.field1736[arg1];
        class88 var7 = arg2.field1736[arg3];
        class102 var8 = var6.field1505;
        Statics.field1811 = 0;
        Statics.field1812 = 0;
        Statics.field1813 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1506; var11++) {
            int var12 = var6.field1507[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1729[var12] == 0) {
                this.method2146(var8.field1729[var12], var8.field1727[var12], var6.field1509[var11], var6.field1504[var11], var6.field1501[var11]);
            }
        }
        Statics.field1811 = 0;
        Statics.field1812 = 0;
        Statics.field1813 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1506; var15++) {
            int var16 = var7.field1507[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1729[var16] == 0) {
                this.method2146(var8.field1729[var16], var8.field1727[var16], var7.field1509[var15], var7.field1504[var15], var7.field1501[var15]);
            }
        }
        this.field1806 = 0;
    }

    @ObfuscatedName("dl.t(I[IIII)V")
    public void method2146(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1811 = 0;
            Statics.field1812 = 0;
            Statics.field1813 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1783.length) {
                    int[] var10 = this.field1783[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1811 += this.field1775[var12];
                        Statics.field1812 += this.field1765[var12];
                        Statics.field1813 += this.field1810[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1811 = Statics.field1811 / var7 + arg2;
                Statics.field1812 = Statics.field1812 / var7 + arg3;
                Statics.field1813 = Statics.field1813 / var7 + arg4;
            } else {
                Statics.field1811 = arg2;
                Statics.field1812 = arg3;
                Statics.field1813 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1783.length) {
                    int[] var15 = this.field1783[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1775[var17] += arg2;
                        this.field1765[var17] += arg3;
                        this.field1810[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1783.length) {
                    int[] var20 = this.field1783[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1775[var22] -= Statics.field1811;
                        this.field1765[var22] -= Statics.field1812;
                        this.field1810[var22] -= Statics.field1813;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1764[var25];
                            int var27 = field1768[var25];
                            int var28 = this.field1775[var22] * var27 + this.field1765[var22] * var26 >> 16;
                            this.field1765[var22] = this.field1765[var22] * var27 - this.field1775[var22] * var26 >> 16;
                            this.field1775[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1764[var23];
                            int var30 = field1768[var23];
                            int var31 = this.field1765[var22] * var30 - this.field1810[var22] * var29 >> 16;
                            this.field1810[var22] = this.field1810[var22] * var30 + this.field1765[var22] * var29 >> 16;
                            this.field1765[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1764[var24];
                            int var33 = field1768[var24];
                            int var34 = this.field1810[var22] * var32 + this.field1775[var22] * var33 >> 16;
                            this.field1810[var22] = this.field1810[var22] * var33 - this.field1775[var22] * var32 >> 16;
                            this.field1775[var22] = var34;
                        }
                        this.field1775[var22] += Statics.field1811;
                        this.field1765[var22] += Statics.field1812;
                        this.field1810[var22] += Statics.field1813;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1783.length) {
                    int[] var37 = this.field1783[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1775[var39] -= Statics.field1811;
                        this.field1765[var39] -= Statics.field1812;
                        this.field1810[var39] -= Statics.field1813;
                        this.field1775[var39] = this.field1775[var39] * arg2 / 128;
                        this.field1765[var39] = this.field1765[var39] * arg3 / 128;
                        this.field1810[var39] = this.field1810[var39] * arg4 / 128;
                        this.field1775[var39] += Statics.field1811;
                        this.field1765[var39] += Statics.field1812;
                        this.field1810[var39] += Statics.field1813;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1784 != null && this.field1767 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1784.length) {
                    int[] var42 = this.field1784[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1767[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1767[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dl.e()V")
    public void method2147() {
        for (int var1 = 0; var1 < this.field1763; var1++) {
            int var2 = this.field1775[var1];
            this.field1775[var1] = this.field1810[var1];
            this.field1810[var1] = -var2;
        }
        this.field1806 = 0;
    }

    @ObfuscatedName("dl.q()V")
    public void method2148() {
        for (int var1 = 0; var1 < this.field1763; var1++) {
            this.field1775[var1] = -this.field1775[var1];
            this.field1810[var1] = -this.field1810[var1];
        }
        this.field1806 = 0;
    }

    @ObfuscatedName("dl.u()V")
    public void method2158() {
        for (int var1 = 0; var1 < this.field1763; var1++) {
            int var2 = this.field1810[var1];
            this.field1810[var1] = this.field1775[var1];
            this.field1775[var1] = -var2;
        }
        this.field1806 = 0;
    }

    @ObfuscatedName("dl.r(I)V")
    public void method2150(int arg0) {
        int var2 = field1764[arg0];
        int var3 = field1768[arg0];
        for (int var4 = 0; var4 < this.field1763; var4++) {
            int var5 = this.field1765[var4] * var3 - this.field1810[var4] * var2 >> 16;
            this.field1810[var4] = this.field1810[var4] * var3 + this.field1765[var4] * var2 >> 16;
            this.field1765[var4] = var5;
        }
        this.field1806 = 0;
    }

    @ObfuscatedName("dl.a(III)V")
    public void method2141(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1763; var4++) {
            this.field1775[var4] += arg0;
            this.field1765[var4] += arg1;
            this.field1810[var4] += arg2;
        }
        this.field1806 = 0;
    }

    @ObfuscatedName("dl.m(III)V")
    public void method2152(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1763; var4++) {
            this.field1775[var4] = this.field1775[var4] * arg0 / 128;
            this.field1765[var4] = this.field1765[var4] * arg1 / 128;
            this.field1810[var4] = this.field1810[var4] * arg2 / 128;
        }
        this.field1806 = 0;
    }

    @ObfuscatedName("dl.y(IIIIIII)V")
    public final void method2184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1760[0] = -1;
        if (this.field1806 != 2 && this.field1806 != 1) {
            this.method2159();
        }
        int var8 = Statics.field1542;
        int var9 = Statics.field1543;
        int var10 = field1764[arg0];
        int var11 = field1768[arg0];
        int var12 = field1764[arg1];
        int var13 = field1768[arg1];
        int var14 = field1764[arg2];
        int var15 = field1768[arg2];
        int var16 = field1764[arg3];
        int var17 = field1768[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1763; var19++) {
            int var20 = this.field1775[var19];
            int var21 = this.field1765[var19];
            int var22 = this.field1810[var19];
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
            field1780[var19] = var30 - var18;
            field1766[var19] = class91.field1541 * var26 / var30 + var8;
            field1795[var19] = class91.field1541 * var29 / var30 + var9;
            if (this.field1779 > 0) {
                field1776[var19] = var26;
                field1798[var19] = var29;
                field1797[var19] = var30;
            }
        }
        try {
            this.method2155(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dl.x(IIIIIIII)V")
    public final void method2171(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1760[0] = -1;
        if (this.field1806 != 2 && this.field1806 != 1) {
            this.method2159();
        }
        int var9 = Statics.field1542;
        int var10 = Statics.field1543;
        int var11 = field1764[arg0];
        int var12 = field1768[arg0];
        int var13 = field1764[arg1];
        int var14 = field1768[arg1];
        int var15 = field1764[arg2];
        int var16 = field1768[arg2];
        int var17 = field1764[arg3];
        int var18 = field1768[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1763; var20++) {
            int var21 = this.field1775[var20];
            int var22 = this.field1765[var20];
            int var23 = this.field1810[var20];
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
            field1780[var20] = var31 - var19;
            field1766[var20] = class91.field1541 * var27 / arg7 + var9;
            field1795[var20] = class91.field1541 * var30 / arg7 + var10;
            if (this.field1779 > 0) {
                field1776[var20] = var27;
                field1798[var20] = var30;
                field1797[var20] = var31;
            }
        }
        try {
            this.method2155(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dl.au(IIIIIIIII)V")
    public void method1755(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1760[0] = -1;
        if (this.field1806 != 1) {
            this.method2149();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1785 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1785) * class91.field1541;
        if (var15 / var13 >= Statics.field1547) {
            return;
        }
        int var16 = (this.field1785 + var14) * class91.field1541;
        if (var16 / var13 <= Statics.field1546) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1785 * arg1 >> 16;
        int var19 = (var17 + var18) * class91.field1541;
        if (var19 / var13 <= Statics.field1548) {
            return;
        }
        int var20 = (this.field1420 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class91.field1541;
        if (var21 / var13 >= Statics.field1544) {
            return;
        }
        int var22 = (this.field1420 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1779 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1814) {
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
            int var32 = field1815 - Statics.field1542;
            int var33 = field1786 - Statics.field1543;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1777) {
                    field1818[field1824++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1542;
        int var35 = Statics.field1543;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1764[arg0];
            var37 = field1768[arg0];
        }
        for (int var38 = 0; var38 < this.field1763; var38++) {
            int var39 = this.field1775[var38];
            int var40 = this.field1765[var38];
            int var41 = this.field1810[var38];
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
            field1780[var38] = var50 - var11;
            if (var50 >= 50) {
                field1766[var38] = class91.field1541 * var46 / var50 + var34;
                field1795[var38] = class91.field1541 * var49 / var50 + var35;
            } else {
                field1766[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1776[var38] = var46;
                field1798[var38] = var49;
                field1797[var38] = var50;
            }
        }
        try {
            this.method2155(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dl.n(ZZI)V")
    public final void method2155(boolean arg0, boolean arg1, int arg2) {
        if (this.field1789 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1789; var4++) {
            field1760[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1792; var5++) {
            if (this.field1773[var5] != -2) {
                int var6 = this.field1796[var5];
                int var7 = this.field1769[var5];
                int var8 = this.field1770[var5];
                int var9 = field1766[var6];
                int var10 = field1766[var7];
                int var11 = field1766[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1776[var6];
                    int var13 = field1776[var7];
                    int var14 = field1776[var8];
                    int var15 = field1798[var6];
                    int var16 = field1798[var7];
                    int var17 = field1798[var8];
                    int var18 = field1797[var6];
                    int var19 = field1797[var7];
                    int var20 = field1797[var8];
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
                        field1793[var5] = true;
                        int var30 = (field1780[var6] + field1780[var7] + field1780[var8]) / 3 + this.field1790;
                        field1802[var30][field1760[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2199(field1815, field1786, field1795[var6], field1795[var7], field1795[var8], var9, var10, var11)) {
                        field1818[field1824++] = arg2;
                        arg1 = false;
                    }
                    if ((field1795[var8] - field1795[var7]) * (var9 - var10) - (field1795[var6] - field1795[var7]) * (var11 - var10) > 0) {
                        field1793[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1535 && var10 <= Statics.field1535 && var11 <= Statics.field1535) {
                            field1801[var5] = false;
                        } else {
                            field1801[var5] = true;
                        }
                        int var31 = (field1780[var6] + field1780[var7] + field1780[var8]) / 3 + this.field1790;
                        field1802[var31][field1760[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1774 == null) {
            for (int var32 = this.field1789 - 1; var32 >= 0; var32--) {
                int var33 = field1760[var32];
                if (var33 > 0) {
                    int[] var34 = field1802[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2156(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1803[var36] = 0;
            field1807[var36] = 0;
        }
        for (int var37 = this.field1789 - 1; var37 >= 0; var37--) {
            int var38 = field1760[var37];
            if (var38 > 0) {
                int[] var39 = field1802[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1774[var41];
                    int var43 = field1803[var42]++;
                    field1804[var42][var43] = var41;
                    if (var42 < 10) {
                        field1807[var42] += var37;
                    } else if (var42 == 10) {
                        field1805[var43] = var37;
                    } else {
                        field1799[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1803[1] > 0 || field1803[2] > 0) {
            var44 = (field1807[1] + field1807[2]) / (field1803[1] + field1803[2]);
        }
        int var45 = 0;
        if (field1803[3] > 0 || field1803[4] > 0) {
            var45 = (field1807[3] + field1807[4]) / (field1803[3] + field1803[4]);
        }
        int var46 = 0;
        if (field1803[6] > 0 || field1803[8] > 0) {
            var46 = (field1807[6] + field1807[8]) / (field1803[6] + field1803[8]);
        }
        int var47 = 0;
        int var48 = field1803[10];
        int[] var49 = field1804[10];
        int[] var50 = field1805;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1803[11];
            var49 = field1804[11];
            var50 = field1799;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2156(var49[var47++]);
                if (var47 == var48 && field1804[11] != var49) {
                    var47 = 0;
                    var48 = field1803[11];
                    var49 = field1804[11];
                    var50 = field1799;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2156(var49[var47++]);
                if (var47 == var48 && field1804[11] != var49) {
                    var47 = 0;
                    var48 = field1803[11];
                    var49 = field1804[11];
                    var50 = field1799;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2156(var49[var47++]);
                if (var47 == var48 && field1804[11] != var49) {
                    var47 = 0;
                    var48 = field1803[11];
                    var49 = field1804[11];
                    var50 = field1799;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1803[var52];
            int[] var54 = field1804[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2156(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2156(var49[var47++]);
            if (var47 == var48 && field1804[11] != var49) {
                var47 = 0;
                var49 = field1804[11];
                var48 = field1803[11];
                var50 = field1799;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dl.v(I)V")
    public final void method2156(int arg0) {
        if (field1793[arg0]) {
            this.method2157(arg0);
            return;
        }
        int var2 = this.field1796[arg0];
        int var3 = this.field1769[arg0];
        int var4 = this.field1770[arg0];
        class91.field1552 = field1801[arg0];
        if (this.field1767 == null) {
            class91.field1538 = 0;
        } else {
            class91.field1538 = this.field1767[arg0] & 0xFF;
        }
        if (this.field1817 != null && this.field1817[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1782 == null || this.field1782[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1782[arg0] & 0xFF;
                var6 = this.field1759[var5];
                var7 = this.field1781[var5];
                var8 = this.field1788[var5];
            }
            if (this.field1773[arg0] == -1) {
                class91.method1961(field1795[var2], field1795[var3], field1795[var4], field1766[var2], field1766[var3], field1766[var4], this.field1771[arg0], this.field1771[arg0], this.field1771[arg0], field1776[var6], field1776[var7], field1776[var8], field1798[var6], field1798[var7], field1798[var8], field1797[var6], field1797[var7], field1797[var8], this.field1817[arg0]);
            } else {
                class91.method1961(field1795[var2], field1795[var3], field1795[var4], field1766[var2], field1766[var3], field1766[var4], this.field1771[arg0], this.field1772[arg0], this.field1773[arg0], field1776[var6], field1776[var7], field1776[var8], field1798[var6], field1798[var7], field1798[var8], field1797[var6], field1797[var7], field1797[var8], this.field1817[arg0]);
            }
        } else if (this.field1773[arg0] == -1) {
            class91.method2015(field1795[var2], field1795[var3], field1795[var4], field1766[var2], field1766[var3], field1766[var4], field1821[this.field1771[arg0]]);
        } else {
            class91.method1992(field1795[var2], field1795[var3], field1795[var4], field1766[var2], field1766[var3], field1766[var4], this.field1771[arg0], this.field1772[arg0], this.field1773[arg0]);
        }
    }

    @ObfuscatedName("dl.s(I)V")
    public final void method2157(int arg0) {
        int var2 = Statics.field1542;
        int var3 = Statics.field1543;
        int var4 = 0;
        int var5 = this.field1796[arg0];
        int var6 = this.field1769[arg0];
        int var7 = this.field1770[arg0];
        int var8 = field1797[var5];
        int var9 = field1797[var6];
        int var10 = field1797[var7];
        if (this.field1767 == null) {
            class91.field1538 = 0;
        } else {
            class91.field1538 = this.field1767[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1816[var4] = field1766[var5];
            field1809[var4] = field1795[var5];
            field1819[var4++] = this.field1771[arg0];
        } else {
            int var11 = field1776[var5];
            int var12 = field1798[var5];
            int var13 = this.field1771[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1822[var10 - var8];
                field1816[var4] = (((field1776[var7] - var11) * var14 >> 16) + var11) * class91.field1541 / 50 + var2;
                field1809[var4] = (((field1798[var7] - var12) * var14 >> 16) + var12) * class91.field1541 / 50 + var3;
                field1819[var4++] = ((this.field1773[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1822[var9 - var8];
                field1816[var4] = (((field1776[var6] - var11) * var15 >> 16) + var11) * class91.field1541 / 50 + var2;
                field1809[var4] = (((field1798[var6] - var12) * var15 >> 16) + var12) * class91.field1541 / 50 + var3;
                field1819[var4++] = ((this.field1772[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1816[var4] = field1766[var6];
            field1809[var4] = field1795[var6];
            field1819[var4++] = this.field1772[arg0];
        } else {
            int var16 = field1776[var6];
            int var17 = field1798[var6];
            int var18 = this.field1772[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1822[var8 - var9];
                field1816[var4] = (((field1776[var5] - var16) * var19 >> 16) + var16) * class91.field1541 / 50 + var2;
                field1809[var4] = (((field1798[var5] - var17) * var19 >> 16) + var17) * class91.field1541 / 50 + var3;
                field1819[var4++] = ((this.field1771[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1822[var10 - var9];
                field1816[var4] = (((field1776[var7] - var16) * var20 >> 16) + var16) * class91.field1541 / 50 + var2;
                field1809[var4] = (((field1798[var7] - var17) * var20 >> 16) + var17) * class91.field1541 / 50 + var3;
                field1819[var4++] = ((this.field1773[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1816[var4] = field1766[var7];
            field1809[var4] = field1795[var7];
            field1819[var4++] = this.field1773[arg0];
        } else {
            int var21 = field1776[var7];
            int var22 = field1798[var7];
            int var23 = this.field1773[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1822[var9 - var10];
                field1816[var4] = (((field1776[var6] - var21) * var24 >> 16) + var21) * class91.field1541 / 50 + var2;
                field1809[var4] = (((field1798[var6] - var22) * var24 >> 16) + var22) * class91.field1541 / 50 + var3;
                field1819[var4++] = ((this.field1772[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1822[var8 - var10];
                field1816[var4] = (((field1776[var5] - var21) * var25 >> 16) + var21) * class91.field1541 / 50 + var2;
                field1809[var4] = (((field1798[var5] - var22) * var25 >> 16) + var22) * class91.field1541 / 50 + var3;
                field1819[var4++] = ((this.field1771[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1816[0];
        int var27 = field1816[1];
        int var28 = field1816[2];
        int var29 = field1809[0];
        int var30 = field1809[1];
        int var31 = field1809[2];
        class91.field1552 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1535 || var27 > Statics.field1535 || var28 > Statics.field1535) {
                class91.field1552 = true;
            }
            if (this.field1817 != null && this.field1817[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1782 == null || this.field1782[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1782[arg0] & 0xFF;
                    var33 = this.field1759[var32];
                    var34 = this.field1781[var32];
                    var35 = this.field1788[var32];
                }
                if (this.field1773[arg0] == -1) {
                    class91.method1961(var29, var30, var31, var26, var27, var28, this.field1771[arg0], this.field1771[arg0], this.field1771[arg0], field1776[var33], field1776[var34], field1776[var35], field1798[var33], field1798[var34], field1798[var35], field1797[var33], field1797[var34], field1797[var35], this.field1817[arg0]);
                } else {
                    class91.method1961(var29, var30, var31, var26, var27, var28, field1819[0], field1819[1], field1819[2], field1776[var33], field1776[var34], field1776[var35], field1798[var33], field1798[var34], field1798[var35], field1797[var33], field1797[var34], field1797[var35], this.field1817[arg0]);
                }
            } else if (this.field1773[arg0] == -1) {
                class91.method2015(var29, var30, var31, var26, var27, var28, field1821[this.field1771[arg0]]);
            } else {
                class91.method1992(var29, var30, var31, var26, var27, var28, field1819[0], field1819[1], field1819[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1535 || var27 > Statics.field1535 || var28 > Statics.field1535 || field1816[3] < 0 || field1816[3] > Statics.field1535) {
            class91.field1552 = true;
        }
        if (this.field1817 != null && this.field1817[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1782 == null || this.field1782[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1782[arg0] & 0xFF;
                var37 = this.field1759[var36];
                var38 = this.field1781[var36];
                var39 = this.field1788[var36];
            }
            short var40 = this.field1817[arg0];
            if (this.field1773[arg0] == -1) {
                class91.method1961(var29, var30, var31, var26, var27, var28, this.field1771[arg0], this.field1771[arg0], this.field1771[arg0], field1776[var37], field1776[var38], field1776[var39], field1798[var37], field1798[var38], field1798[var39], field1797[var37], field1797[var38], field1797[var39], var40);
                class91.method1961(var29, var31, field1809[3], var26, var28, field1816[3], this.field1771[arg0], this.field1771[arg0], this.field1771[arg0], field1776[var37], field1776[var38], field1776[var39], field1798[var37], field1798[var38], field1798[var39], field1797[var37], field1797[var38], field1797[var39], var40);
            } else {
                class91.method1961(var29, var30, var31, var26, var27, var28, field1819[0], field1819[1], field1819[2], field1776[var37], field1776[var38], field1776[var39], field1798[var37], field1798[var38], field1798[var39], field1797[var37], field1797[var38], field1797[var39], var40);
                class91.method1961(var29, var31, field1809[3], var26, var28, field1816[3], field1819[0], field1819[2], field1819[3], field1776[var37], field1776[var38], field1776[var39], field1798[var37], field1798[var38], field1798[var39], field1797[var37], field1797[var38], field1797[var39], var40);
            }
        } else if (this.field1773[arg0] == -1) {
            int var41 = field1821[this.field1771[arg0]];
            class91.method2015(var29, var30, var31, var26, var27, var28, var41);
            class91.method2015(var29, var31, field1809[3], var26, var28, field1816[3], var41);
        } else {
            class91.method1992(var29, var30, var31, var26, var27, var28, field1819[0], field1819[1], field1819[2]);
            class91.method1992(var29, var31, field1809[3], var26, var28, field1816[3], field1819[0], field1819[2], field1819[3]);
        }
    }

    @ObfuscatedName("dl.w(IIIIIIII)Z")
    public final boolean method2199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
