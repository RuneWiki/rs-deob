package deob;

@ObfuscatedName("cs")
public class class100 extends class80 {

    @ObfuscatedName("cs.n")
    public static class100 field1745 = new class100();

    @ObfuscatedName("cs.g")
    public static byte[] field1740 = new byte[1];

    @ObfuscatedName("cs.a")
    public static class100 field1741 = new class100();

    @ObfuscatedName("cs.m")
    public static byte[] field1742 = new byte[1];

    @ObfuscatedName("cs.s")
    public int field1743 = 0;

    @ObfuscatedName("cs.j")
    public int[] field1744;

    @ObfuscatedName("cs.f")
    public int[] field1781;

    @ObfuscatedName("cs.b")
    public int[] field1758;

    @ObfuscatedName("cs.t")
    public int field1747 = 0;

    @ObfuscatedName("cs.i")
    public int[] field1748;

    @ObfuscatedName("cs.c")
    public int[] field1749;

    @ObfuscatedName("cs.k")
    public int[] field1764;

    @ObfuscatedName("cs.x")
    public int[] field1751;

    @ObfuscatedName("cs.e")
    public int[] field1752;

    @ObfuscatedName("cs.q")
    public int[] field1753;

    @ObfuscatedName("cs.o")
    public byte[] field1754;

    @ObfuscatedName("cs.r")
    public byte[] field1763;

    @ObfuscatedName("cs.v")
    public byte[] field1794;

    @ObfuscatedName("cs.h")
    public short[] field1757;

    @ObfuscatedName("cs.p")
    public byte field1798 = 0;

    @ObfuscatedName("cs.y")
    public int field1801 = 0;

    @ObfuscatedName("cs.z")
    public int[] field1760;

    @ObfuscatedName("cs.u")
    public int[] field1761;

    @ObfuscatedName("cs.w")
    public int[] field1762;

    @ObfuscatedName("cs.d")
    public int[][] field1803;

    @ObfuscatedName("cs.l")
    public int[][] field1755;

    @ObfuscatedName("cs.aj")
    public boolean field1765 = false;

    @ObfuscatedName("cs.aq")
    public int field1766;

    @ObfuscatedName("cs.al")
    public int field1767;

    @ObfuscatedName("cs.az")
    public int field1756;

    @ObfuscatedName("cs.ah")
    public int field1769;

    @ObfuscatedName("cs.ag")
    public int field1795;

    @ObfuscatedName("cs.ao")
    public static boolean[] field1772 = new boolean[4096];

    @ObfuscatedName("cs.am")
    public static boolean[] field1750 = new boolean[4096];

    @ObfuscatedName("cs.ax")
    public static int[] field1775 = new int[4096];

    @ObfuscatedName("cs.at")
    public static int[] field1746 = new int[4096];

    @ObfuscatedName("cs.ar")
    public static int[] field1776 = new int[4096];

    @ObfuscatedName("cs.ai")
    public static int[] field1777 = new int[4096];

    @ObfuscatedName("cs.aw")
    public static int[] field1778 = new int[4096];

    @ObfuscatedName("cs.ak")
    public static int[] field1759 = new int[4096];

    @ObfuscatedName("cs.av")
    public static int[] field1780 = new int[1600];

    @ObfuscatedName("cs.af")
    public static int[][] field1782 = new int[1600][512];

    @ObfuscatedName("cs.ae")
    public static int[] field1783 = new int[12];

    @ObfuscatedName("cs.au")
    public static int[][] field1784 = new int[12][2000];

    @ObfuscatedName("cs.aa")
    public static int[] field1785 = new int[2000];

    @ObfuscatedName("cs.ay")
    public static int[] field1786 = new int[2000];

    @ObfuscatedName("cs.ac")
    public static int[] field1770 = new int[12];

    @ObfuscatedName("cs.ab")
    public static int[] field1788 = new int[10];

    @ObfuscatedName("cs.ap")
    public static int[] field1773 = new int[10];

    @ObfuscatedName("cs.as")
    public static int[] field1790 = new int[10];

    @ObfuscatedName("cs.by")
    public static boolean field1787 = false;

    @ObfuscatedName("cs.bm")
    public static int field1792 = 0;

    @ObfuscatedName("cs.br")
    public static int field1796 = 0;

    @ObfuscatedName("cs.bo")
    public static int field1789 = 0;

    @ObfuscatedName("cs.bt")
    public static int[] field1779 = new int[1000];

    @ObfuscatedName("cs.be")
    public static int[] field1799 = class86.field1539;

    @ObfuscatedName("cs.bh")
    public static int[] field1797 = class86.field1540;

    @ObfuscatedName("cs.bb")
    public static int[] field1768 = class86.field1536;

    @ObfuscatedName("cs.bd")
    public static int[] field1802 = class86.field1538;

    public class100() {
    }

    public class100(class100[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1743 = 0;
        this.field1747 = 0;
        this.field1801 = 0;
        this.field1798 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class100 var8 = arg0[var7];
            if (var8 != null) {
                this.field1743 += var8.field1743;
                this.field1747 += var8.field1747;
                this.field1801 += var8.field1801;
                if (var8.field1754 == null) {
                    if (this.field1798 == -1) {
                        this.field1798 = var8.field1798;
                    }
                    if (this.field1798 != var8.field1798) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1763 != null;
                var5 |= var8.field1757 != null;
                var6 |= var8.field1794 != null;
            }
        }
        this.field1744 = new int[this.field1743];
        this.field1781 = new int[this.field1743];
        this.field1758 = new int[this.field1743];
        this.field1748 = new int[this.field1747];
        this.field1749 = new int[this.field1747];
        this.field1764 = new int[this.field1747];
        this.field1751 = new int[this.field1747];
        this.field1752 = new int[this.field1747];
        this.field1753 = new int[this.field1747];
        if (var3) {
            this.field1754 = new byte[this.field1747];
        }
        if (var4) {
            this.field1763 = new byte[this.field1747];
        }
        if (var5) {
            this.field1757 = new short[this.field1747];
        }
        if (var6) {
            this.field1794 = new byte[this.field1747];
        }
        if (this.field1801 > 0) {
            this.field1760 = new int[this.field1801];
            this.field1761 = new int[this.field1801];
            this.field1762 = new int[this.field1801];
        }
        this.field1743 = 0;
        this.field1747 = 0;
        this.field1801 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class100 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1747; var11++) {
                    this.field1748[this.field1747] = var10.field1748[var11] + this.field1743;
                    this.field1749[this.field1747] = var10.field1749[var11] + this.field1743;
                    this.field1764[this.field1747] = var10.field1764[var11] + this.field1743;
                    this.field1751[this.field1747] = var10.field1751[var11];
                    this.field1752[this.field1747] = var10.field1752[var11];
                    this.field1753[this.field1747] = var10.field1753[var11];
                    if (var3) {
                        if (var10.field1754 == null) {
                            this.field1754[this.field1747] = var10.field1798;
                        } else {
                            this.field1754[this.field1747] = var10.field1754[var11];
                        }
                    }
                    if (var4 && var10.field1763 != null) {
                        this.field1763[this.field1747] = var10.field1763[var11];
                    }
                    if (var5) {
                        if (var10.field1757 == null) {
                            this.field1757[this.field1747] = -1;
                        } else {
                            this.field1757[this.field1747] = var10.field1757[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1794 == null || var10.field1794[var11] == -1) {
                            this.field1794[this.field1747] = -1;
                        } else {
                            this.field1794[this.field1747] = (byte) (var10.field1794[var11] + this.field1801);
                        }
                    }
                    this.field1747++;
                }
                for (int var12 = 0; var12 < var10.field1801; var12++) {
                    this.field1760[this.field1801] = var10.field1760[var12] + this.field1743;
                    this.field1761[this.field1801] = var10.field1761[var12] + this.field1743;
                    this.field1762[this.field1801] = var10.field1762[var12] + this.field1743;
                    this.field1801++;
                }
                for (int var13 = 0; var13 < var10.field1743; var13++) {
                    this.field1744[this.field1743] = var10.field1744[var13];
                    this.field1781[this.field1743] = var10.field1781[var13];
                    this.field1758[this.field1743] = var10.field1758[var13];
                    this.field1743++;
                }
            }
        }
    }

    @ObfuscatedName("cs.n([[IIIIZI)Lcs;")
    public class100 method2081(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2061();
        int var7 = arg1 - this.field1756;
        int var8 = this.field1756 + arg1;
        int var9 = arg3 - this.field1756;
        int var10 = this.field1756 + arg3;
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
        class100 var15;
        if (arg4) {
            var15 = new class100();
            var15.field1743 = this.field1743;
            var15.field1747 = this.field1747;
            var15.field1801 = this.field1801;
            var15.field1744 = this.field1744;
            var15.field1758 = this.field1758;
            var15.field1748 = this.field1748;
            var15.field1749 = this.field1749;
            var15.field1764 = this.field1764;
            var15.field1751 = this.field1751;
            var15.field1752 = this.field1752;
            var15.field1753 = this.field1753;
            var15.field1754 = this.field1754;
            var15.field1763 = this.field1763;
            var15.field1794 = this.field1794;
            var15.field1757 = this.field1757;
            var15.field1798 = this.field1798;
            var15.field1760 = this.field1760;
            var15.field1761 = this.field1761;
            var15.field1762 = this.field1762;
            var15.field1803 = this.field1803;
            var15.field1755 = this.field1755;
            var15.field1765 = this.field1765;
            var15.field1781 = new int[var15.field1743];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1743; var16++) {
                int var17 = this.field1744[var16] + arg1;
                int var18 = this.field1758[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1781[var16] = this.field1781[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1743; var26++) {
                int var27 = (-this.field1781[var26] << 16) / this.field1409;
                if (var27 < arg5) {
                    int var28 = this.field1744[var26] + arg1;
                    int var29 = this.field1758[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1781[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1781[var26];
                }
            }
        }
        var15.field1766 = 0;
        return var15;
    }

    @ObfuscatedName("cs.a(Z)Lcs;")
    public class100 method2058(boolean arg0) {
        if (!arg0 && field1740.length < this.field1747) {
            field1740 = new byte[this.field1747 + 100];
        }
        return this.method2115(arg0, field1745, field1740);
    }

    @ObfuscatedName("cs.m(Z)Lcs;")
    public class100 method2070(boolean arg0) {
        if (!arg0 && field1742.length < this.field1747) {
            field1742 = new byte[this.field1747 + 100];
        }
        return this.method2115(arg0, field1741, field1742);
    }

    @ObfuscatedName("cs.b(ZLcs;[B)Lcs;")
    public class100 method2115(boolean arg0, class100 arg1, byte[] arg2) {
        arg1.field1743 = this.field1743;
        arg1.field1747 = this.field1747;
        arg1.field1801 = this.field1801;
        if (arg1.field1744 == null || arg1.field1744.length < this.field1743) {
            arg1.field1744 = new int[this.field1743 + 100];
            arg1.field1781 = new int[this.field1743 + 100];
            arg1.field1758 = new int[this.field1743 + 100];
        }
        for (int var4 = 0; var4 < this.field1743; var4++) {
            arg1.field1744[var4] = this.field1744[var4];
            arg1.field1781[var4] = this.field1781[var4];
            arg1.field1758[var4] = this.field1758[var4];
        }
        if (arg0) {
            arg1.field1763 = this.field1763;
        } else {
            arg1.field1763 = arg2;
            if (this.field1763 == null) {
                for (int var5 = 0; var5 < this.field1747; var5++) {
                    arg1.field1763[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1747; var6++) {
                    arg1.field1763[var6] = this.field1763[var6];
                }
            }
        }
        arg1.field1748 = this.field1748;
        arg1.field1749 = this.field1749;
        arg1.field1764 = this.field1764;
        arg1.field1751 = this.field1751;
        arg1.field1752 = this.field1752;
        arg1.field1753 = this.field1753;
        arg1.field1754 = this.field1754;
        arg1.field1794 = this.field1794;
        arg1.field1757 = this.field1757;
        arg1.field1798 = this.field1798;
        arg1.field1760 = this.field1760;
        arg1.field1761 = this.field1761;
        arg1.field1762 = this.field1762;
        arg1.field1803 = this.field1803;
        arg1.field1755 = this.field1755;
        arg1.field1765 = this.field1765;
        arg1.field1766 = 0;
        return arg1;
    }

    @ObfuscatedName("cs.t()V")
    public void method2061() {
        if (this.field1766 == 1) {
            return;
        }
        this.field1766 = 1;
        this.field1409 = 0;
        this.field1767 = 0;
        this.field1756 = 0;
        for (int var1 = 0; var1 < this.field1743; var1++) {
            int var2 = this.field1744[var1];
            int var3 = this.field1781[var1];
            int var4 = this.field1758[var1];
            if (-var3 > this.field1409) {
                this.field1409 = -var3;
            }
            if (var3 > this.field1767) {
                this.field1767 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1756) {
                this.field1756 = var5;
            }
        }
        this.field1756 = (int) (Math.sqrt((double) this.field1756) + 0.99D);
        this.field1795 = (int) (Math.sqrt((double) (this.field1409 * this.field1409 + this.field1756 * this.field1756)) + 0.99D);
        this.field1769 = this.field1795 + (int) (Math.sqrt((double) (this.field1767 * this.field1767 + this.field1756 * this.field1756)) + 0.99D);
    }

    @ObfuscatedName("cs.i()V")
    public void method2062() {
        if (this.field1766 == 2) {
            return;
        }
        this.field1766 = 2;
        this.field1756 = 0;
        for (int var1 = 0; var1 < this.field1743; var1++) {
            int var2 = this.field1744[var1];
            int var3 = this.field1781[var1];
            int var4 = this.field1758[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1756) {
                this.field1756 = var5;
            }
        }
        this.field1756 = (int) (Math.sqrt((double) this.field1756) + 0.99D);
        this.field1795 = this.field1756;
        this.field1769 = this.field1756 + this.field1756;
    }

    @ObfuscatedName("cs.c()I")
    public int method2071() {
        this.method2061();
        return this.field1756;
    }

    @ObfuscatedName("cs.k(Lcw;I)V")
    public void method2064(class98 arg0, int arg1) {
        if (this.field1803 == null || arg1 == -1) {
            return;
        }
        class83 var3 = arg0.field1715[arg1];
        class97 var4 = var3.field1489;
        Statics.field1791 = 0;
        Statics.field1774 = 0;
        Statics.field1793 = 0;
        for (int var5 = 0; var5 < var3.field1490; var5++) {
            int var6 = var3.field1491[var5];
            this.method2066(var4.field1708[var6], var4.field1711[var6], var3.field1492[var5], var3.field1493[var5], var3.field1494[var5]);
        }
        this.field1766 = 0;
    }

    @ObfuscatedName("cs.x(Lcw;ILcw;I[I)V")
    public void method2122(class98 arg0, int arg1, class98 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2064(arg0, arg1);
            return;
        }
        class83 var6 = arg0.field1715[arg1];
        class83 var7 = arg2.field1715[arg3];
        class97 var8 = var6.field1489;
        Statics.field1791 = 0;
        Statics.field1774 = 0;
        Statics.field1793 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1490; var11++) {
            int var12 = var6.field1491[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1708[var12] == 0) {
                this.method2066(var8.field1708[var12], var8.field1711[var12], var6.field1492[var11], var6.field1493[var11], var6.field1494[var11]);
            }
        }
        Statics.field1791 = 0;
        Statics.field1774 = 0;
        Statics.field1793 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1490; var15++) {
            int var16 = var7.field1491[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1708[var16] == 0) {
                this.method2066(var8.field1708[var16], var8.field1711[var16], var7.field1492[var15], var7.field1493[var15], var7.field1494[var15]);
            }
        }
        this.field1766 = 0;
    }

    @ObfuscatedName("cs.e(I[IIII)V")
    public void method2066(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1791 = 0;
            Statics.field1774 = 0;
            Statics.field1793 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1803.length) {
                    int[] var10 = this.field1803[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1791 += this.field1744[var12];
                        Statics.field1774 += this.field1781[var12];
                        Statics.field1793 += this.field1758[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1791 = Statics.field1791 / var7 + arg2;
                Statics.field1774 = Statics.field1774 / var7 + arg3;
                Statics.field1793 = Statics.field1793 / var7 + arg4;
            } else {
                Statics.field1791 = arg2;
                Statics.field1774 = arg3;
                Statics.field1793 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1803.length) {
                    int[] var15 = this.field1803[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1744[var17] += arg2;
                        this.field1781[var17] += arg3;
                        this.field1758[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1803.length) {
                    int[] var20 = this.field1803[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1744[var22] -= Statics.field1791;
                        this.field1781[var22] -= Statics.field1774;
                        this.field1758[var22] -= Statics.field1793;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1799[var25];
                            int var27 = field1797[var25];
                            int var28 = this.field1781[var22] * var26 + this.field1744[var22] * var27 >> 16;
                            this.field1781[var22] = this.field1781[var22] * var27 - this.field1744[var22] * var26 >> 16;
                            this.field1744[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1799[var23];
                            int var30 = field1797[var23];
                            int var31 = this.field1781[var22] * var30 - this.field1758[var22] * var29 >> 16;
                            this.field1758[var22] = this.field1781[var22] * var29 + this.field1758[var22] * var30 >> 16;
                            this.field1781[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1799[var24];
                            int var33 = field1797[var24];
                            int var34 = this.field1758[var22] * var32 + this.field1744[var22] * var33 >> 16;
                            this.field1758[var22] = this.field1758[var22] * var33 - this.field1744[var22] * var32 >> 16;
                            this.field1744[var22] = var34;
                        }
                        this.field1744[var22] += Statics.field1791;
                        this.field1781[var22] += Statics.field1774;
                        this.field1758[var22] += Statics.field1793;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1803.length) {
                    int[] var37 = this.field1803[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1744[var39] -= Statics.field1791;
                        this.field1781[var39] -= Statics.field1774;
                        this.field1758[var39] -= Statics.field1793;
                        this.field1744[var39] = this.field1744[var39] * arg2 / 128;
                        this.field1781[var39] = this.field1781[var39] * arg3 / 128;
                        this.field1758[var39] = this.field1758[var39] * arg4 / 128;
                        this.field1744[var39] += Statics.field1791;
                        this.field1781[var39] += Statics.field1774;
                        this.field1758[var39] += Statics.field1793;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1755 != null && this.field1763 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1755.length) {
                    int[] var42 = this.field1755[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1763[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1763[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cs.q()V")
    public void method2067() {
        for (int var1 = 0; var1 < this.field1743; var1++) {
            int var2 = this.field1744[var1];
            this.field1744[var1] = this.field1758[var1];
            this.field1758[var1] = -var2;
        }
        this.field1766 = 0;
    }

    @ObfuscatedName("cs.o()V")
    public void method2068() {
        for (int var1 = 0; var1 < this.field1743; var1++) {
            this.field1744[var1] = -this.field1744[var1];
            this.field1758[var1] = -this.field1758[var1];
        }
        this.field1766 = 0;
    }

    @ObfuscatedName("cs.r()V")
    public void method2069() {
        for (int var1 = 0; var1 < this.field1743; var1++) {
            int var2 = this.field1758[var1];
            this.field1758[var1] = this.field1744[var1];
            this.field1744[var1] = -var2;
        }
        this.field1766 = 0;
    }

    @ObfuscatedName("cs.v(I)V")
    public void method2060(int arg0) {
        int var2 = field1799[arg0];
        int var3 = field1797[arg0];
        for (int var4 = 0; var4 < this.field1743; var4++) {
            int var5 = this.field1781[var4] * var3 - this.field1758[var4] * var2 >> 16;
            this.field1758[var4] = this.field1781[var4] * var2 + this.field1758[var4] * var3 >> 16;
            this.field1781[var4] = var5;
        }
        this.field1766 = 0;
    }

    @ObfuscatedName("cs.h(III)V")
    public void method2112(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1743; var4++) {
            this.field1744[var4] += arg0;
            this.field1781[var4] += arg1;
            this.field1758[var4] += arg2;
        }
        this.field1766 = 0;
    }

    @ObfuscatedName("cs.p(III)V")
    public void method2072(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1743; var4++) {
            this.field1744[var4] = this.field1744[var4] * arg0 / 128;
            this.field1781[var4] = this.field1781[var4] * arg1 / 128;
            this.field1758[var4] = this.field1758[var4] * arg2 / 128;
        }
        this.field1766 = 0;
    }

    @ObfuscatedName("cs.y(IIIIIII)V")
    public final void method2073(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1780[0] = -1;
        if (this.field1766 != 2 && this.field1766 != 1) {
            this.method2062();
        }
        int var8 = Statics.field1526;
        int var9 = Statics.field1516;
        int var10 = field1799[arg0];
        int var11 = field1797[arg0];
        int var12 = field1799[arg1];
        int var13 = field1797[arg1];
        int var14 = field1799[arg2];
        int var15 = field1797[arg2];
        int var16 = field1799[arg3];
        int var17 = field1797[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1743; var19++) {
            int var20 = this.field1744[var19];
            int var21 = this.field1781[var19];
            int var22 = this.field1758[var19];
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
            field1776[var19] = var30 - var18;
            field1775[var19] = class86.field1517 * var26 / var30 + var8;
            field1746[var19] = class86.field1517 * var29 / var30 + var9;
            if (this.field1801 > 0) {
                field1777[var19] = var26;
                field1778[var19] = var29;
                field1759[var19] = var30;
            }
        }
        try {
            this.method2089(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cs.d(IIIIIIII)V")
    public final void method2074(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1780[0] = -1;
        if (this.field1766 != 2 && this.field1766 != 1) {
            this.method2062();
        }
        int var9 = Statics.field1526;
        int var10 = Statics.field1516;
        int var11 = field1799[arg0];
        int var12 = field1797[arg0];
        int var13 = field1799[arg1];
        int var14 = field1797[arg1];
        int var15 = field1799[arg2];
        int var16 = field1797[arg2];
        int var17 = field1799[arg3];
        int var18 = field1797[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1743; var20++) {
            int var21 = this.field1744[var20];
            int var22 = this.field1781[var20];
            int var23 = this.field1758[var20];
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
            field1776[var20] = var31 - var19;
            field1775[var20] = class86.field1517 * var27 / arg7 + var9;
            field1746[var20] = class86.field1517 * var30 / arg7 + var10;
            if (this.field1801 > 0) {
                field1777[var20] = var27;
                field1778[var20] = var30;
                field1759[var20] = var31;
            }
        }
        try {
            this.method2089(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cs.z(IIIIIIIII)V")
    public void method1687(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1780[0] = -1;
        if (this.field1766 != 1) {
            this.method2061();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1756 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1756) * class86.field1517;
        if (var15 / var13 >= Statics.field1531) {
            return;
        }
        int var16 = (this.field1756 + var14) * class86.field1517;
        if (var16 / var13 <= Statics.field1527) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1756 * arg1 >> 16;
        int var19 = (var17 + var18) * class86.field1517;
        if (var19 / var13 <= Statics.field1532) {
            return;
        }
        int var20 = (this.field1409 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class86.field1517;
        if (var21 / var13 >= Statics.field1533) {
            return;
        }
        int var22 = (this.field1409 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1801 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1787) {
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
            int var32 = field1792 - Statics.field1526;
            int var33 = field1796 - Statics.field1516;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1765) {
                    field1779[field1789++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1526;
        int var35 = Statics.field1516;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1799[arg0];
            var37 = field1797[arg0];
        }
        for (int var38 = 0; var38 < this.field1743; var38++) {
            int var39 = this.field1744[var38];
            int var40 = this.field1781[var38];
            int var41 = this.field1758[var38];
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
            field1776[var38] = var50 - var11;
            if (var50 >= 50) {
                field1775[var38] = class86.field1517 * var46 / var50 + var34;
                field1746[var38] = class86.field1517 * var49 / var50 + var35;
            } else {
                field1775[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1777[var38] = var46;
                field1778[var38] = var49;
                field1759[var38] = var50;
            }
        }
        try {
            this.method2089(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cs.l(ZZI)V")
    public final void method2089(boolean arg0, boolean arg1, int arg2) {
        if (this.field1769 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1769; var4++) {
            field1780[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1747; var5++) {
            if (this.field1753[var5] != -2) {
                int var6 = this.field1748[var5];
                int var7 = this.field1749[var5];
                int var8 = this.field1764[var5];
                int var9 = field1775[var6];
                int var10 = field1775[var7];
                int var11 = field1775[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1777[var6];
                    int var13 = field1777[var7];
                    int var14 = field1777[var8];
                    int var15 = field1778[var6];
                    int var16 = field1778[var7];
                    int var17 = field1778[var8];
                    int var18 = field1759[var6];
                    int var19 = field1759[var7];
                    int var20 = field1759[var8];
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
                        field1750[var5] = true;
                        int var30 = (field1776[var6] + field1776[var7] + field1776[var8]) / 3 + this.field1795;
                        field1782[var30][field1780[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2077(field1792, field1796, field1746[var6], field1746[var7], field1746[var8], var9, var10, var11)) {
                        field1779[field1789++] = arg2;
                        arg1 = false;
                    }
                    if ((field1746[var8] - field1746[var7]) * (var9 - var10) - (field1746[var6] - field1746[var7]) * (var11 - var10) > 0) {
                        field1750[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1523 && var10 <= Statics.field1523 && var11 <= Statics.field1523) {
                            field1772[var5] = false;
                        } else {
                            field1772[var5] = true;
                        }
                        int var31 = (field1776[var6] + field1776[var7] + field1776[var8]) / 3 + this.field1795;
                        field1782[var31][field1780[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1754 == null) {
            for (int var32 = this.field1769 - 1; var32 >= 0; var32--) {
                int var33 = field1780[var32];
                if (var33 > 0) {
                    int[] var34 = field1782[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2082(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1783[var36] = 0;
            field1770[var36] = 0;
        }
        for (int var37 = this.field1769 - 1; var37 >= 0; var37--) {
            int var38 = field1780[var37];
            if (var38 > 0) {
                int[] var39 = field1782[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1754[var41];
                    int var43 = field1783[var42]++;
                    field1784[var42][var43] = var41;
                    if (var42 < 10) {
                        field1770[var42] += var37;
                    } else if (var42 == 10) {
                        field1785[var43] = var37;
                    } else {
                        field1786[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1783[1] > 0 || field1783[2] > 0) {
            var44 = (field1770[1] + field1770[2]) / (field1783[1] + field1783[2]);
        }
        int var45 = 0;
        if (field1783[3] > 0 || field1783[4] > 0) {
            var45 = (field1770[3] + field1770[4]) / (field1783[3] + field1783[4]);
        }
        int var46 = 0;
        if (field1783[6] > 0 || field1783[8] > 0) {
            var46 = (field1770[6] + field1770[8]) / (field1783[6] + field1783[8]);
        }
        int var47 = 0;
        int var48 = field1783[10];
        int[] var49 = field1784[10];
        int[] var50 = field1785;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1783[11];
            var49 = field1784[11];
            var50 = field1786;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2082(var49[var47++]);
                if (var47 == var48 && field1784[11] != var49) {
                    var47 = 0;
                    var48 = field1783[11];
                    var49 = field1784[11];
                    var50 = field1786;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2082(var49[var47++]);
                if (var47 == var48 && field1784[11] != var49) {
                    var47 = 0;
                    var48 = field1783[11];
                    var49 = field1784[11];
                    var50 = field1786;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2082(var49[var47++]);
                if (var47 == var48 && field1784[11] != var49) {
                    var47 = 0;
                    var48 = field1783[11];
                    var49 = field1784[11];
                    var50 = field1786;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1783[var52];
            int[] var54 = field1784[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2082(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2082(var49[var47++]);
            if (var47 == var48 && field1784[11] != var49) {
                var47 = 0;
                var49 = field1784[11];
                var48 = field1783[11];
                var50 = field1786;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cs.aj(I)V")
    public final void method2082(int arg0) {
        if (field1750[arg0]) {
            this.method2117(arg0);
            return;
        }
        int var2 = this.field1748[arg0];
        int var3 = this.field1749[arg0];
        int var4 = this.field1764[arg0];
        class86.field1530 = field1772[arg0];
        if (this.field1763 == null) {
            class86.field1520 = 0;
        } else {
            class86.field1520 = this.field1763[arg0] & 0xFF;
        }
        if (this.field1757 != null && this.field1757[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1794 == null || this.field1794[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1794[arg0] & 0xFF;
                var6 = this.field1760[var5];
                var7 = this.field1761[var5];
                var8 = this.field1762[var5];
            }
            if (this.field1753[arg0] == -1) {
                class86.method1879(field1746[var2], field1746[var3], field1746[var4], field1775[var2], field1775[var3], field1775[var4], this.field1751[arg0], this.field1751[arg0], this.field1751[arg0], field1777[var6], field1777[var7], field1777[var8], field1778[var6], field1778[var7], field1778[var8], field1759[var6], field1759[var7], field1759[var8], this.field1757[arg0]);
            } else {
                class86.method1879(field1746[var2], field1746[var3], field1746[var4], field1775[var2], field1775[var3], field1775[var4], this.field1751[arg0], this.field1752[arg0], this.field1753[arg0], field1777[var6], field1777[var7], field1777[var8], field1778[var6], field1778[var7], field1778[var8], field1759[var6], field1759[var7], field1759[var8], this.field1757[arg0]);
            }
        } else if (this.field1753[arg0] == -1) {
            class86.method1877(field1746[var2], field1746[var3], field1746[var4], field1775[var2], field1775[var3], field1775[var4], field1768[this.field1751[arg0]]);
        } else {
            class86.method1873(field1746[var2], field1746[var3], field1746[var4], field1775[var2], field1775[var3], field1775[var4], this.field1751[arg0], this.field1752[arg0], this.field1753[arg0]);
        }
    }

    @ObfuscatedName("cs.aq(I)V")
    public final void method2117(int arg0) {
        int var2 = Statics.field1526;
        int var3 = Statics.field1516;
        int var4 = 0;
        int var5 = this.field1748[arg0];
        int var6 = this.field1749[arg0];
        int var7 = this.field1764[arg0];
        int var8 = field1759[var5];
        int var9 = field1759[var6];
        int var10 = field1759[var7];
        if (this.field1763 == null) {
            class86.field1520 = 0;
        } else {
            class86.field1520 = this.field1763[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1788[var4] = field1775[var5];
            field1773[var4] = field1746[var5];
            field1790[var4++] = this.field1751[arg0];
        } else {
            int var11 = field1777[var5];
            int var12 = field1778[var5];
            int var13 = this.field1751[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1802[var10 - var8];
                field1788[var4] = (((field1777[var7] - var11) * var14 >> 16) + var11) * class86.field1517 / 50 + var2;
                field1773[var4] = (((field1778[var7] - var12) * var14 >> 16) + var12) * class86.field1517 / 50 + var3;
                field1790[var4++] = ((this.field1753[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1802[var9 - var8];
                field1788[var4] = (((field1777[var6] - var11) * var15 >> 16) + var11) * class86.field1517 / 50 + var2;
                field1773[var4] = (((field1778[var6] - var12) * var15 >> 16) + var12) * class86.field1517 / 50 + var3;
                field1790[var4++] = ((this.field1752[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1788[var4] = field1775[var6];
            field1773[var4] = field1746[var6];
            field1790[var4++] = this.field1752[arg0];
        } else {
            int var16 = field1777[var6];
            int var17 = field1778[var6];
            int var18 = this.field1752[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1802[var8 - var9];
                field1788[var4] = (((field1777[var5] - var16) * var19 >> 16) + var16) * class86.field1517 / 50 + var2;
                field1773[var4] = (((field1778[var5] - var17) * var19 >> 16) + var17) * class86.field1517 / 50 + var3;
                field1790[var4++] = ((this.field1751[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1802[var10 - var9];
                field1788[var4] = (((field1777[var7] - var16) * var20 >> 16) + var16) * class86.field1517 / 50 + var2;
                field1773[var4] = (((field1778[var7] - var17) * var20 >> 16) + var17) * class86.field1517 / 50 + var3;
                field1790[var4++] = ((this.field1753[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1788[var4] = field1775[var7];
            field1773[var4] = field1746[var7];
            field1790[var4++] = this.field1753[arg0];
        } else {
            int var21 = field1777[var7];
            int var22 = field1778[var7];
            int var23 = this.field1753[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1802[var9 - var10];
                field1788[var4] = (((field1777[var6] - var21) * var24 >> 16) + var21) * class86.field1517 / 50 + var2;
                field1773[var4] = (((field1778[var6] - var22) * var24 >> 16) + var22) * class86.field1517 / 50 + var3;
                field1790[var4++] = ((this.field1752[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1802[var8 - var10];
                field1788[var4] = (((field1777[var5] - var21) * var25 >> 16) + var21) * class86.field1517 / 50 + var2;
                field1773[var4] = (((field1778[var5] - var22) * var25 >> 16) + var22) * class86.field1517 / 50 + var3;
                field1790[var4++] = ((this.field1751[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1788[0];
        int var27 = field1788[1];
        int var28 = field1788[2];
        int var29 = field1773[0];
        int var30 = field1773[1];
        int var31 = field1773[2];
        class86.field1530 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1523 || var27 > Statics.field1523 || var28 > Statics.field1523) {
                class86.field1530 = true;
            }
            if (this.field1757 != null && this.field1757[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1794 == null || this.field1794[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1794[arg0] & 0xFF;
                    var33 = this.field1760[var32];
                    var34 = this.field1761[var32];
                    var35 = this.field1762[var32];
                }
                if (this.field1753[arg0] == -1) {
                    class86.method1879(var29, var30, var31, var26, var27, var28, this.field1751[arg0], this.field1751[arg0], this.field1751[arg0], field1777[var33], field1777[var34], field1777[var35], field1778[var33], field1778[var34], field1778[var35], field1759[var33], field1759[var34], field1759[var35], this.field1757[arg0]);
                } else {
                    class86.method1879(var29, var30, var31, var26, var27, var28, field1790[0], field1790[1], field1790[2], field1777[var33], field1777[var34], field1777[var35], field1778[var33], field1778[var34], field1778[var35], field1759[var33], field1759[var34], field1759[var35], this.field1757[arg0]);
                }
            } else if (this.field1753[arg0] == -1) {
                class86.method1877(var29, var30, var31, var26, var27, var28, field1768[this.field1751[arg0]]);
            } else {
                class86.method1873(var29, var30, var31, var26, var27, var28, field1790[0], field1790[1], field1790[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1523 || var27 > Statics.field1523 || var28 > Statics.field1523 || field1788[3] < 0 || field1788[3] > Statics.field1523) {
            class86.field1530 = true;
        }
        if (this.field1757 != null && this.field1757[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1794 == null || this.field1794[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1794[arg0] & 0xFF;
                var37 = this.field1760[var36];
                var38 = this.field1761[var36];
                var39 = this.field1762[var36];
            }
            short var40 = this.field1757[arg0];
            if (this.field1753[arg0] == -1) {
                class86.method1879(var29, var30, var31, var26, var27, var28, this.field1751[arg0], this.field1751[arg0], this.field1751[arg0], field1777[var37], field1777[var38], field1777[var39], field1778[var37], field1778[var38], field1778[var39], field1759[var37], field1759[var38], field1759[var39], var40);
                class86.method1879(var29, var31, field1773[3], var26, var28, field1788[3], this.field1751[arg0], this.field1751[arg0], this.field1751[arg0], field1777[var37], field1777[var38], field1777[var39], field1778[var37], field1778[var38], field1778[var39], field1759[var37], field1759[var38], field1759[var39], var40);
            } else {
                class86.method1879(var29, var30, var31, var26, var27, var28, field1790[0], field1790[1], field1790[2], field1777[var37], field1777[var38], field1777[var39], field1778[var37], field1778[var38], field1778[var39], field1759[var37], field1759[var38], field1759[var39], var40);
                class86.method1879(var29, var31, field1773[3], var26, var28, field1788[3], field1790[0], field1790[2], field1790[3], field1777[var37], field1777[var38], field1777[var39], field1778[var37], field1778[var38], field1778[var39], field1759[var37], field1759[var38], field1759[var39], var40);
            }
        } else if (this.field1753[arg0] == -1) {
            int var41 = field1768[this.field1751[arg0]];
            class86.method1877(var29, var30, var31, var26, var27, var28, var41);
            class86.method1877(var29, var31, field1773[3], var26, var28, field1788[3], var41);
        } else {
            class86.method1873(var29, var30, var31, var26, var27, var28, field1790[0], field1790[1], field1790[2]);
            class86.method1873(var29, var31, field1773[3], var26, var28, field1788[3], field1790[0], field1790[2], field1790[3]);
        }
    }

    @ObfuscatedName("cs.al(IIIIIIII)Z")
    public final boolean method2077(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
