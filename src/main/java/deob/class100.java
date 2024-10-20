package deob;

@ObfuscatedName("cp")
public class class100 extends class80 {

    @ObfuscatedName("cp.n")
    public static class100 field1738 = new class100();

    @ObfuscatedName("cp.o")
    public static byte[] field1728 = new byte[1];

    @ObfuscatedName("cp.a")
    public static class100 field1729 = new class100();

    @ObfuscatedName("cp.w")
    public static byte[] field1730 = new byte[1];

    @ObfuscatedName("cp.m")
    public int field1731 = 0;

    @ObfuscatedName("cp.h")
    public int[] field1791;

    @ObfuscatedName("cp.i")
    public int[] field1733;

    @ObfuscatedName("cp.r")
    public int[] field1734;

    @ObfuscatedName("cp.l")
    public int field1753 = 0;

    @ObfuscatedName("cp.f")
    public int[] field1736;

    @ObfuscatedName("cp.e")
    public int[] field1737;

    @ObfuscatedName("cp.z")
    public int[] field1752;

    @ObfuscatedName("cp.v")
    public int[] field1765;

    @ObfuscatedName("cp.x")
    public int[] field1740;

    @ObfuscatedName("cp.q")
    public int[] field1741;

    @ObfuscatedName("cp.b")
    public byte[] field1768;

    @ObfuscatedName("cp.u")
    public byte[] field1758;

    @ObfuscatedName("cp.t")
    public byte[] field1744;

    @ObfuscatedName("cp.s")
    public short[] field1756;

    @ObfuscatedName("cp.p")
    public byte field1727 = 0;

    @ObfuscatedName("cp.d")
    public int field1787 = 0;

    @ObfuscatedName("cp.j")
    public int[] field1748;

    @ObfuscatedName("cp.k")
    public int[] field1749;

    @ObfuscatedName("cp.y")
    public int[] field1785;

    @ObfuscatedName("cp.c")
    public int[][] field1751;

    @ObfuscatedName("cp.g")
    public int[][] field1776;

    @ObfuscatedName("cp.av")
    public boolean field1745 = false;

    @ObfuscatedName("cp.ag")
    public int field1754;

    @ObfuscatedName("cp.aq")
    public int field1755;

    @ObfuscatedName("cp.an")
    public int field1742;

    @ObfuscatedName("cp.ao")
    public int field1757;

    @ObfuscatedName("cp.aj")
    public int field1732;

    @ObfuscatedName("cp.ac")
    public static boolean[] field1760 = new boolean[4096];

    @ObfuscatedName("cp.al")
    public static boolean[] field1761 = new boolean[4096];

    @ObfuscatedName("cp.au")
    public static int[] field1762 = new int[4096];

    @ObfuscatedName("cp.ap")
    public static int[] field1763 = new int[4096];

    @ObfuscatedName("cp.ar")
    public static int[] field1769 = new int[4096];

    @ObfuscatedName("cp.ah")
    public static int[] field1746 = new int[4096];

    @ObfuscatedName("cp.ae")
    public static int[] field1743 = new int[4096];

    @ObfuscatedName("cp.ay")
    public static int[] field1767 = new int[4096];

    @ObfuscatedName("cp.at")
    public static int[] field1788 = new int[1600];

    @ObfuscatedName("cp.as")
    public static int[][] field1770 = new int[1600][512];

    @ObfuscatedName("cp.af")
    public static int[] field1764 = new int[12];

    @ObfuscatedName("cp.aa")
    public static int[][] field1772 = new int[12][2000];

    @ObfuscatedName("cp.ad")
    public static int[] field1766 = new int[2000];

    @ObfuscatedName("cp.ai")
    public static int[] field1774 = new int[2000];

    @ObfuscatedName("cp.aw")
    public static int[] field1775 = new int[12];

    @ObfuscatedName("cp.ak")
    public static int[] field1739 = new int[10];

    @ObfuscatedName("cp.az")
    public static int[] field1771 = new int[10];

    @ObfuscatedName("cp.am")
    public static int[] field1778 = new int[10];

    @ObfuscatedName("cp.bv")
    public static boolean field1782 = false;

    @ObfuscatedName("cp.bl")
    public static int field1783 = 0;

    @ObfuscatedName("cp.bu")
    public static int field1784 = 0;

    @ObfuscatedName("cp.bm")
    public static int field1777 = 0;

    @ObfuscatedName("cp.bo")
    public static int[] field1786 = new int[1000];

    @ObfuscatedName("cp.ba")
    public static int[] field1750 = class86.field1520;

    @ObfuscatedName("cp.by")
    public static int[] field1773 = class86.field1521;

    @ObfuscatedName("cp.bt")
    public static int[] field1789 = class86.field1514;

    @ObfuscatedName("cp.bp")
    public static int[] field1790 = class86.field1519;

    public class100() {
    }

    public class100(class100[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1731 = 0;
        this.field1753 = 0;
        this.field1787 = 0;
        this.field1727 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class100 var8 = arg0[var7];
            if (var8 != null) {
                this.field1731 += var8.field1731;
                this.field1753 += var8.field1753;
                this.field1787 += var8.field1787;
                if (var8.field1768 == null) {
                    if (this.field1727 == -1) {
                        this.field1727 = var8.field1727;
                    }
                    if (this.field1727 != var8.field1727) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1758 != null;
                var5 |= var8.field1756 != null;
                var6 |= var8.field1744 != null;
            }
        }
        this.field1791 = new int[this.field1731];
        this.field1733 = new int[this.field1731];
        this.field1734 = new int[this.field1731];
        this.field1736 = new int[this.field1753];
        this.field1737 = new int[this.field1753];
        this.field1752 = new int[this.field1753];
        this.field1765 = new int[this.field1753];
        this.field1740 = new int[this.field1753];
        this.field1741 = new int[this.field1753];
        if (var3) {
            this.field1768 = new byte[this.field1753];
        }
        if (var4) {
            this.field1758 = new byte[this.field1753];
        }
        if (var5) {
            this.field1756 = new short[this.field1753];
        }
        if (var6) {
            this.field1744 = new byte[this.field1753];
        }
        if (this.field1787 > 0) {
            this.field1748 = new int[this.field1787];
            this.field1749 = new int[this.field1787];
            this.field1785 = new int[this.field1787];
        }
        this.field1731 = 0;
        this.field1753 = 0;
        this.field1787 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class100 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1753; var11++) {
                    this.field1736[this.field1753] = var10.field1736[var11] + this.field1731;
                    this.field1737[this.field1753] = var10.field1737[var11] + this.field1731;
                    this.field1752[this.field1753] = var10.field1752[var11] + this.field1731;
                    this.field1765[this.field1753] = var10.field1765[var11];
                    this.field1740[this.field1753] = var10.field1740[var11];
                    this.field1741[this.field1753] = var10.field1741[var11];
                    if (var3) {
                        if (var10.field1768 == null) {
                            this.field1768[this.field1753] = var10.field1727;
                        } else {
                            this.field1768[this.field1753] = var10.field1768[var11];
                        }
                    }
                    if (var4 && var10.field1758 != null) {
                        this.field1758[this.field1753] = var10.field1758[var11];
                    }
                    if (var5) {
                        if (var10.field1756 == null) {
                            this.field1756[this.field1753] = -1;
                        } else {
                            this.field1756[this.field1753] = var10.field1756[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1744 == null || var10.field1744[var11] == -1) {
                            this.field1744[this.field1753] = -1;
                        } else {
                            this.field1744[this.field1753] = (byte) (var10.field1744[var11] + this.field1787);
                        }
                    }
                    this.field1753++;
                }
                for (int var12 = 0; var12 < var10.field1787; var12++) {
                    this.field1748[this.field1787] = var10.field1748[var12] + this.field1731;
                    this.field1749[this.field1787] = var10.field1749[var12] + this.field1731;
                    this.field1785[this.field1787] = var10.field1785[var12] + this.field1731;
                    this.field1787++;
                }
                for (int var13 = 0; var13 < var10.field1731; var13++) {
                    this.field1791[this.field1731] = var10.field1791[var13];
                    this.field1733[this.field1731] = var10.field1733[var13];
                    this.field1734[this.field1731] = var10.field1734[var13];
                    this.field1731++;
                }
            }
        }
    }

    @ObfuscatedName("cp.n([[IIIIZI)Lcp;")
    public class100 method2077(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2080();
        int var7 = arg1 - this.field1742;
        int var8 = this.field1742 + arg1;
        int var9 = arg3 - this.field1742;
        int var10 = this.field1742 + arg3;
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
            var15.field1731 = this.field1731;
            var15.field1753 = this.field1753;
            var15.field1787 = this.field1787;
            var15.field1791 = this.field1791;
            var15.field1734 = this.field1734;
            var15.field1736 = this.field1736;
            var15.field1737 = this.field1737;
            var15.field1752 = this.field1752;
            var15.field1765 = this.field1765;
            var15.field1740 = this.field1740;
            var15.field1741 = this.field1741;
            var15.field1768 = this.field1768;
            var15.field1758 = this.field1758;
            var15.field1744 = this.field1744;
            var15.field1756 = this.field1756;
            var15.field1727 = this.field1727;
            var15.field1748 = this.field1748;
            var15.field1749 = this.field1749;
            var15.field1785 = this.field1785;
            var15.field1751 = this.field1751;
            var15.field1776 = this.field1776;
            var15.field1745 = this.field1745;
            var15.field1733 = new int[var15.field1731];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1731; var16++) {
                int var17 = this.field1791[var16] + arg1;
                int var18 = this.field1734[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1733[var16] = this.field1733[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1731; var26++) {
                int var27 = (-this.field1733[var26] << 16) / this.field1392;
                if (var27 < arg5) {
                    int var28 = this.field1791[var26] + arg1;
                    int var29 = this.field1734[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1733[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1733[var26];
                }
            }
        }
        var15.field1754 = 0;
        return var15;
    }

    @ObfuscatedName("cp.a(Z)Lcp;")
    public class100 method2078(boolean arg0) {
        if (!arg0 && field1728.length < this.field1753) {
            field1728 = new byte[this.field1753 + 100];
        }
        return this.method2079(arg0, field1738, field1728);
    }

    @ObfuscatedName("cp.m(Z)Lcp;")
    public class100 method2129(boolean arg0) {
        if (!arg0 && field1730.length < this.field1753) {
            field1730 = new byte[this.field1753 + 100];
        }
        return this.method2079(arg0, field1729, field1730);
    }

    @ObfuscatedName("cp.h(ZLcp;[B)Lcp;")
    public class100 method2079(boolean arg0, class100 arg1, byte[] arg2) {
        arg1.field1731 = this.field1731;
        arg1.field1753 = this.field1753;
        arg1.field1787 = this.field1787;
        if (arg1.field1791 == null || arg1.field1791.length < this.field1731) {
            arg1.field1791 = new int[this.field1731 + 100];
            arg1.field1733 = new int[this.field1731 + 100];
            arg1.field1734 = new int[this.field1731 + 100];
        }
        for (int var4 = 0; var4 < this.field1731; var4++) {
            arg1.field1791[var4] = this.field1791[var4];
            arg1.field1733[var4] = this.field1733[var4];
            arg1.field1734[var4] = this.field1734[var4];
        }
        if (arg0) {
            arg1.field1758 = this.field1758;
        } else {
            arg1.field1758 = arg2;
            if (this.field1758 == null) {
                for (int var5 = 0; var5 < this.field1753; var5++) {
                    arg1.field1758[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1753; var6++) {
                    arg1.field1758[var6] = this.field1758[var6];
                }
            }
        }
        arg1.field1736 = this.field1736;
        arg1.field1737 = this.field1737;
        arg1.field1752 = this.field1752;
        arg1.field1765 = this.field1765;
        arg1.field1740 = this.field1740;
        arg1.field1741 = this.field1741;
        arg1.field1768 = this.field1768;
        arg1.field1744 = this.field1744;
        arg1.field1756 = this.field1756;
        arg1.field1727 = this.field1727;
        arg1.field1748 = this.field1748;
        arg1.field1749 = this.field1749;
        arg1.field1785 = this.field1785;
        arg1.field1751 = this.field1751;
        arg1.field1776 = this.field1776;
        arg1.field1745 = this.field1745;
        arg1.field1754 = 0;
        return arg1;
    }

    @ObfuscatedName("cp.i()V")
    public void method2080() {
        if (this.field1754 == 1) {
            return;
        }
        this.field1754 = 1;
        this.field1392 = 0;
        this.field1755 = 0;
        this.field1742 = 0;
        for (int var1 = 0; var1 < this.field1731; var1++) {
            int var2 = this.field1791[var1];
            int var3 = this.field1733[var1];
            int var4 = this.field1734[var1];
            if (-var3 > this.field1392) {
                this.field1392 = -var3;
            }
            if (var3 > this.field1755) {
                this.field1755 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1742) {
                this.field1742 = var5;
            }
        }
        this.field1742 = (int) (Math.sqrt((double) this.field1742) + 0.99D);
        this.field1732 = (int) (Math.sqrt((double) (this.field1392 * this.field1392 + this.field1742 * this.field1742)) + 0.99D);
        this.field1757 = this.field1732 + (int) (Math.sqrt((double) (this.field1755 * this.field1755 + this.field1742 * this.field1742)) + 0.99D);
    }

    @ObfuscatedName("cp.r()V")
    public void method2081() {
        if (this.field1754 == 2) {
            return;
        }
        this.field1754 = 2;
        this.field1742 = 0;
        for (int var1 = 0; var1 < this.field1731; var1++) {
            int var2 = this.field1791[var1];
            int var3 = this.field1733[var1];
            int var4 = this.field1734[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1742) {
                this.field1742 = var5;
            }
        }
        this.field1742 = (int) (Math.sqrt((double) this.field1742) + 0.99D);
        this.field1732 = this.field1742;
        this.field1757 = this.field1742 + this.field1742;
    }

    @ObfuscatedName("cp.l()I")
    public int method2082() {
        this.method2080();
        return this.field1742;
    }

    @ObfuscatedName("cp.f(Lcb;I)V")
    public void method2083(class98 arg0, int arg1) {
        if (this.field1751 == null || arg1 == -1) {
            return;
        }
        class83 var3 = arg0.field1702[arg1];
        class97 var4 = var3.field1469;
        Statics.field1779 = 0;
        Statics.field1780 = 0;
        Statics.field1781 = 0;
        for (int var5 = 0; var5 < var3.field1470; var5++) {
            int var6 = var3.field1473[var5];
            this.method2085(var4.field1692[var6], var4.field1693[var6], var3.field1474[var5], var3.field1475[var5], var3.field1477[var5]);
        }
        this.field1754 = 0;
    }

    @ObfuscatedName("cp.e(Lcb;ILcb;I[I)V")
    public void method2084(class98 arg0, int arg1, class98 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2083(arg0, arg1);
            return;
        }
        class83 var6 = arg0.field1702[arg1];
        class83 var7 = arg2.field1702[arg3];
        class97 var8 = var6.field1469;
        Statics.field1779 = 0;
        Statics.field1780 = 0;
        Statics.field1781 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1470; var11++) {
            int var12 = var6.field1473[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1692[var12] == 0) {
                this.method2085(var8.field1692[var12], var8.field1693[var12], var6.field1474[var11], var6.field1475[var11], var6.field1477[var11]);
            }
        }
        Statics.field1779 = 0;
        Statics.field1780 = 0;
        Statics.field1781 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1470; var15++) {
            int var16 = var7.field1473[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1692[var16] == 0) {
                this.method2085(var8.field1692[var16], var8.field1693[var16], var7.field1474[var15], var7.field1475[var15], var7.field1477[var15]);
            }
        }
        this.field1754 = 0;
    }

    @ObfuscatedName("cp.z(I[IIII)V")
    public void method2085(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1779 = 0;
            Statics.field1780 = 0;
            Statics.field1781 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1751.length) {
                    int[] var10 = this.field1751[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1779 += this.field1791[var12];
                        Statics.field1780 += this.field1733[var12];
                        Statics.field1781 += this.field1734[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1779 = Statics.field1779 / var7 + arg2;
                Statics.field1780 = Statics.field1780 / var7 + arg3;
                Statics.field1781 = Statics.field1781 / var7 + arg4;
            } else {
                Statics.field1779 = arg2;
                Statics.field1780 = arg3;
                Statics.field1781 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1751.length) {
                    int[] var15 = this.field1751[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1791[var17] += arg2;
                        this.field1733[var17] += arg3;
                        this.field1734[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1751.length) {
                    int[] var20 = this.field1751[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1791[var22] -= Statics.field1779;
                        this.field1733[var22] -= Statics.field1780;
                        this.field1734[var22] -= Statics.field1781;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1750[var25];
                            int var27 = field1773[var25];
                            int var28 = this.field1791[var22] * var27 + this.field1733[var22] * var26 >> 16;
                            this.field1733[var22] = this.field1733[var22] * var27 - this.field1791[var22] * var26 >> 16;
                            this.field1791[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1750[var23];
                            int var30 = field1773[var23];
                            int var31 = this.field1733[var22] * var30 - this.field1734[var22] * var29 >> 16;
                            this.field1734[var22] = this.field1734[var22] * var30 + this.field1733[var22] * var29 >> 16;
                            this.field1733[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1750[var24];
                            int var33 = field1773[var24];
                            int var34 = this.field1791[var22] * var33 + this.field1734[var22] * var32 >> 16;
                            this.field1734[var22] = this.field1734[var22] * var33 - this.field1791[var22] * var32 >> 16;
                            this.field1791[var22] = var34;
                        }
                        this.field1791[var22] += Statics.field1779;
                        this.field1733[var22] += Statics.field1780;
                        this.field1734[var22] += Statics.field1781;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1751.length) {
                    int[] var37 = this.field1751[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1791[var39] -= Statics.field1779;
                        this.field1733[var39] -= Statics.field1780;
                        this.field1734[var39] -= Statics.field1781;
                        this.field1791[var39] = this.field1791[var39] * arg2 / 128;
                        this.field1733[var39] = this.field1733[var39] * arg3 / 128;
                        this.field1734[var39] = this.field1734[var39] * arg4 / 128;
                        this.field1791[var39] += Statics.field1779;
                        this.field1733[var39] += Statics.field1780;
                        this.field1734[var39] += Statics.field1781;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1776 != null && this.field1758 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1776.length) {
                    int[] var42 = this.field1776[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1758[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1758[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cp.v()V")
    public void method2086() {
        for (int var1 = 0; var1 < this.field1731; var1++) {
            int var2 = this.field1791[var1];
            this.field1791[var1] = this.field1734[var1];
            this.field1734[var1] = -var2;
        }
        this.field1754 = 0;
    }

    @ObfuscatedName("cp.x()V")
    public void method2087() {
        for (int var1 = 0; var1 < this.field1731; var1++) {
            this.field1791[var1] = -this.field1791[var1];
            this.field1734[var1] = -this.field1734[var1];
        }
        this.field1754 = 0;
    }

    @ObfuscatedName("cp.q()V")
    public void method2088() {
        for (int var1 = 0; var1 < this.field1731; var1++) {
            int var2 = this.field1734[var1];
            this.field1734[var1] = this.field1791[var1];
            this.field1791[var1] = -var2;
        }
        this.field1754 = 0;
    }

    @ObfuscatedName("cp.b(I)V")
    public void method2089(int arg0) {
        int var2 = field1750[arg0];
        int var3 = field1773[arg0];
        for (int var4 = 0; var4 < this.field1731; var4++) {
            int var5 = this.field1733[var4] * var3 - this.field1734[var4] * var2 >> 16;
            this.field1734[var4] = this.field1734[var4] * var3 + this.field1733[var4] * var2 >> 16;
            this.field1733[var4] = var5;
        }
        this.field1754 = 0;
    }

    @ObfuscatedName("cp.u(III)V")
    public void method2098(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1731; var4++) {
            this.field1791[var4] += arg0;
            this.field1733[var4] += arg1;
            this.field1734[var4] += arg2;
        }
        this.field1754 = 0;
    }

    @ObfuscatedName("cp.t(III)V")
    public void method2091(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1731; var4++) {
            this.field1791[var4] = this.field1791[var4] * arg0 / 128;
            this.field1733[var4] = this.field1733[var4] * arg1 / 128;
            this.field1734[var4] = this.field1734[var4] * arg2 / 128;
        }
        this.field1754 = 0;
    }

    @ObfuscatedName("cp.s(IIIIIII)V")
    public final void method2092(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1788[0] = -1;
        if (this.field1754 != 2 && this.field1754 != 1) {
            this.method2081();
        }
        int var8 = Statics.field1507;
        int var9 = Statics.field1508;
        int var10 = field1750[arg0];
        int var11 = field1773[arg0];
        int var12 = field1750[arg1];
        int var13 = field1773[arg1];
        int var14 = field1750[arg2];
        int var15 = field1773[arg2];
        int var16 = field1750[arg3];
        int var17 = field1773[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1731; var19++) {
            int var20 = this.field1791[var19];
            int var21 = this.field1733[var19];
            int var22 = this.field1734[var19];
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
            field1769[var19] = var30 - var18;
            field1762[var19] = class86.field1506 * var26 / var30 + var8;
            field1763[var19] = class86.field1506 * var29 / var30 + var9;
            if (this.field1787 > 0) {
                field1746[var19] = var26;
                field1743[var19] = var29;
                field1767[var19] = var30;
            }
        }
        try {
            this.method2094(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cp.p(IIIIIIII)V")
    public final void method2107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1788[0] = -1;
        if (this.field1754 != 2 && this.field1754 != 1) {
            this.method2081();
        }
        int var9 = Statics.field1507;
        int var10 = Statics.field1508;
        int var11 = field1750[arg0];
        int var12 = field1773[arg0];
        int var13 = field1750[arg1];
        int var14 = field1773[arg1];
        int var15 = field1750[arg2];
        int var16 = field1773[arg2];
        int var17 = field1750[arg3];
        int var18 = field1773[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1731; var20++) {
            int var21 = this.field1791[var20];
            int var22 = this.field1733[var20];
            int var23 = this.field1734[var20];
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
            field1769[var20] = var31 - var19;
            field1762[var20] = class86.field1506 * var27 / arg7 + var9;
            field1763[var20] = class86.field1506 * var30 / arg7 + var10;
            if (this.field1787 > 0) {
                field1746[var20] = var27;
                field1743[var20] = var30;
                field1767[var20] = var31;
            }
        }
        try {
            this.method2094(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cp.c(IIIIIIIII)V")
    public void method1698(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1788[0] = -1;
        if (this.field1754 != 1) {
            this.method2080();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1742 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1742) * class86.field1506;
        if (var15 / var13 >= Statics.field1517) {
            return;
        }
        int var16 = (this.field1742 + var14) * class86.field1506;
        if (var16 / var13 <= Statics.field1511) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1742 * arg1 >> 16;
        int var19 = (var17 + var18) * class86.field1506;
        if (var19 / var13 <= Statics.field1503) {
            return;
        }
        int var20 = (this.field1392 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class86.field1506;
        if (var21 / var13 >= Statics.field1509) {
            return;
        }
        int var22 = (this.field1392 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1787 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1782) {
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
            int var32 = field1783 - Statics.field1507;
            int var33 = field1784 - Statics.field1508;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1745) {
                    field1786[field1777++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1507;
        int var35 = Statics.field1508;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1750[arg0];
            var37 = field1773[arg0];
        }
        for (int var38 = 0; var38 < this.field1731; var38++) {
            int var39 = this.field1791[var38];
            int var40 = this.field1733[var38];
            int var41 = this.field1734[var38];
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
            field1769[var38] = var50 - var11;
            if (var50 >= 50) {
                field1762[var38] = class86.field1506 * var46 / var50 + var34;
                field1763[var38] = class86.field1506 * var49 / var50 + var35;
            } else {
                field1762[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1746[var38] = var46;
                field1743[var38] = var49;
                field1767[var38] = var50;
            }
        }
        try {
            this.method2094(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cp.d(ZZI)V")
    public final void method2094(boolean arg0, boolean arg1, int arg2) {
        if (this.field1757 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1757; var4++) {
            field1788[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1753; var5++) {
            if (this.field1741[var5] != -2) {
                int var6 = this.field1736[var5];
                int var7 = this.field1737[var5];
                int var8 = this.field1752[var5];
                int var9 = field1762[var6];
                int var10 = field1762[var7];
                int var11 = field1762[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1746[var6];
                    int var13 = field1746[var7];
                    int var14 = field1746[var8];
                    int var15 = field1743[var6];
                    int var16 = field1743[var7];
                    int var17 = field1743[var8];
                    int var18 = field1767[var6];
                    int var19 = field1767[var7];
                    int var20 = field1767[var8];
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
                        field1761[var5] = true;
                        int var30 = (field1769[var6] + field1769[var7] + field1769[var8]) / 3 + this.field1732;
                        field1770[var30][field1788[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2105(field1783, field1784, field1763[var6], field1763[var7], field1763[var8], var9, var10, var11)) {
                        field1786[field1777++] = arg2;
                        arg1 = false;
                    }
                    if ((field1763[var8] - field1763[var7]) * (var9 - var10) - (field1763[var6] - field1763[var7]) * (var11 - var10) > 0) {
                        field1761[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1518 && var10 <= Statics.field1518 && var11 <= Statics.field1518) {
                            field1760[var5] = false;
                        } else {
                            field1760[var5] = true;
                        }
                        int var31 = (field1769[var6] + field1769[var7] + field1769[var8]) / 3 + this.field1732;
                        field1770[var31][field1788[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1768 == null) {
            for (int var32 = this.field1757 - 1; var32 >= 0; var32--) {
                int var33 = field1788[var32];
                if (var33 > 0) {
                    int[] var34 = field1770[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2106(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1764[var36] = 0;
            field1775[var36] = 0;
        }
        for (int var37 = this.field1757 - 1; var37 >= 0; var37--) {
            int var38 = field1788[var37];
            if (var38 > 0) {
                int[] var39 = field1770[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1768[var41];
                    int var43 = field1764[var42]++;
                    field1772[var42][var43] = var41;
                    if (var42 < 10) {
                        field1775[var42] += var37;
                    } else if (var42 == 10) {
                        field1766[var43] = var37;
                    } else {
                        field1774[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1764[1] > 0 || field1764[2] > 0) {
            var44 = (field1775[1] + field1775[2]) / (field1764[1] + field1764[2]);
        }
        int var45 = 0;
        if (field1764[3] > 0 || field1764[4] > 0) {
            var45 = (field1775[3] + field1775[4]) / (field1764[3] + field1764[4]);
        }
        int var46 = 0;
        if (field1764[6] > 0 || field1764[8] > 0) {
            var46 = (field1775[6] + field1775[8]) / (field1764[6] + field1764[8]);
        }
        int var47 = 0;
        int var48 = field1764[10];
        int[] var49 = field1772[10];
        int[] var50 = field1766;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1764[11];
            var49 = field1772[11];
            var50 = field1774;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2106(var49[var47++]);
                if (var47 == var48 && field1772[11] != var49) {
                    var47 = 0;
                    var48 = field1764[11];
                    var49 = field1772[11];
                    var50 = field1774;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2106(var49[var47++]);
                if (var47 == var48 && field1772[11] != var49) {
                    var47 = 0;
                    var48 = field1764[11];
                    var49 = field1772[11];
                    var50 = field1774;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2106(var49[var47++]);
                if (var47 == var48 && field1772[11] != var49) {
                    var47 = 0;
                    var48 = field1764[11];
                    var49 = field1772[11];
                    var50 = field1774;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1764[var52];
            int[] var54 = field1772[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2106(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2106(var49[var47++]);
            if (var47 == var48 && field1772[11] != var49) {
                var47 = 0;
                var49 = field1772[11];
                var48 = field1764[11];
                var50 = field1774;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cp.j(I)V")
    public final void method2106(int arg0) {
        if (field1761[arg0]) {
            this.method2111(arg0);
            return;
        }
        int var2 = this.field1736[arg0];
        int var3 = this.field1737[arg0];
        int var4 = this.field1752[arg0];
        class86.field1502 = field1760[arg0];
        if (this.field1758 == null) {
            class86.field1501 = 0;
        } else {
            class86.field1501 = this.field1758[arg0] & 0xFF;
        }
        if (this.field1756 != null && this.field1756[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1744 == null || this.field1744[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1744[arg0] & 0xFF;
                var6 = this.field1748[var5];
                var7 = this.field1749[var5];
                var8 = this.field1785[var5];
            }
            if (this.field1741[arg0] == -1) {
                class86.method1905(field1763[var2], field1763[var3], field1763[var4], field1762[var2], field1762[var3], field1762[var4], this.field1765[arg0], this.field1765[arg0], this.field1765[arg0], field1746[var6], field1746[var7], field1746[var8], field1743[var6], field1743[var7], field1743[var8], field1767[var6], field1767[var7], field1767[var8], this.field1756[arg0]);
            } else {
                class86.method1905(field1763[var2], field1763[var3], field1763[var4], field1762[var2], field1762[var3], field1762[var4], this.field1765[arg0], this.field1740[arg0], this.field1741[arg0], field1746[var6], field1746[var7], field1746[var8], field1743[var6], field1743[var7], field1743[var8], field1767[var6], field1767[var7], field1767[var8], this.field1756[arg0]);
            }
        } else if (this.field1741[arg0] == -1) {
            class86.method1889(field1763[var2], field1763[var3], field1763[var4], field1762[var2], field1762[var3], field1762[var4], field1789[this.field1765[arg0]]);
        } else {
            class86.method1887(field1763[var2], field1763[var3], field1763[var4], field1762[var2], field1762[var3], field1762[var4], this.field1765[arg0], this.field1740[arg0], this.field1741[arg0]);
        }
    }

    @ObfuscatedName("cp.k(I)V")
    public final void method2111(int arg0) {
        int var2 = Statics.field1507;
        int var3 = Statics.field1508;
        int var4 = 0;
        int var5 = this.field1736[arg0];
        int var6 = this.field1737[arg0];
        int var7 = this.field1752[arg0];
        int var8 = field1767[var5];
        int var9 = field1767[var6];
        int var10 = field1767[var7];
        if (this.field1758 == null) {
            class86.field1501 = 0;
        } else {
            class86.field1501 = this.field1758[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1739[var4] = field1762[var5];
            field1771[var4] = field1763[var5];
            field1778[var4++] = this.field1765[arg0];
        } else {
            int var11 = field1746[var5];
            int var12 = field1743[var5];
            int var13 = this.field1765[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1790[var10 - var8];
                field1739[var4] = (((field1746[var7] - var11) * var14 >> 16) + var11) * class86.field1506 / 50 + var2;
                field1771[var4] = (((field1743[var7] - var12) * var14 >> 16) + var12) * class86.field1506 / 50 + var3;
                field1778[var4++] = ((this.field1741[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1790[var9 - var8];
                field1739[var4] = (((field1746[var6] - var11) * var15 >> 16) + var11) * class86.field1506 / 50 + var2;
                field1771[var4] = (((field1743[var6] - var12) * var15 >> 16) + var12) * class86.field1506 / 50 + var3;
                field1778[var4++] = ((this.field1740[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1739[var4] = field1762[var6];
            field1771[var4] = field1763[var6];
            field1778[var4++] = this.field1740[arg0];
        } else {
            int var16 = field1746[var6];
            int var17 = field1743[var6];
            int var18 = this.field1740[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1790[var8 - var9];
                field1739[var4] = (((field1746[var5] - var16) * var19 >> 16) + var16) * class86.field1506 / 50 + var2;
                field1771[var4] = (((field1743[var5] - var17) * var19 >> 16) + var17) * class86.field1506 / 50 + var3;
                field1778[var4++] = ((this.field1765[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1790[var10 - var9];
                field1739[var4] = (((field1746[var7] - var16) * var20 >> 16) + var16) * class86.field1506 / 50 + var2;
                field1771[var4] = (((field1743[var7] - var17) * var20 >> 16) + var17) * class86.field1506 / 50 + var3;
                field1778[var4++] = ((this.field1741[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1739[var4] = field1762[var7];
            field1771[var4] = field1763[var7];
            field1778[var4++] = this.field1741[arg0];
        } else {
            int var21 = field1746[var7];
            int var22 = field1743[var7];
            int var23 = this.field1741[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1790[var9 - var10];
                field1739[var4] = (((field1746[var6] - var21) * var24 >> 16) + var21) * class86.field1506 / 50 + var2;
                field1771[var4] = (((field1743[var6] - var22) * var24 >> 16) + var22) * class86.field1506 / 50 + var3;
                field1778[var4++] = ((this.field1740[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1790[var8 - var10];
                field1739[var4] = (((field1746[var5] - var21) * var25 >> 16) + var21) * class86.field1506 / 50 + var2;
                field1771[var4] = (((field1743[var5] - var22) * var25 >> 16) + var22) * class86.field1506 / 50 + var3;
                field1778[var4++] = ((this.field1765[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1739[0];
        int var27 = field1739[1];
        int var28 = field1739[2];
        int var29 = field1771[0];
        int var30 = field1771[1];
        int var31 = field1771[2];
        class86.field1502 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1518 || var27 > Statics.field1518 || var28 > Statics.field1518) {
                class86.field1502 = true;
            }
            if (this.field1756 != null && this.field1756[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1744 == null || this.field1744[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1744[arg0] & 0xFF;
                    var33 = this.field1748[var32];
                    var34 = this.field1749[var32];
                    var35 = this.field1785[var32];
                }
                if (this.field1741[arg0] == -1) {
                    class86.method1905(var29, var30, var31, var26, var27, var28, this.field1765[arg0], this.field1765[arg0], this.field1765[arg0], field1746[var33], field1746[var34], field1746[var35], field1743[var33], field1743[var34], field1743[var35], field1767[var33], field1767[var34], field1767[var35], this.field1756[arg0]);
                } else {
                    class86.method1905(var29, var30, var31, var26, var27, var28, field1778[0], field1778[1], field1778[2], field1746[var33], field1746[var34], field1746[var35], field1743[var33], field1743[var34], field1743[var35], field1767[var33], field1767[var34], field1767[var35], this.field1756[arg0]);
                }
            } else if (this.field1741[arg0] == -1) {
                class86.method1889(var29, var30, var31, var26, var27, var28, field1789[this.field1765[arg0]]);
            } else {
                class86.method1887(var29, var30, var31, var26, var27, var28, field1778[0], field1778[1], field1778[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1518 || var27 > Statics.field1518 || var28 > Statics.field1518 || field1739[3] < 0 || field1739[3] > Statics.field1518) {
            class86.field1502 = true;
        }
        if (this.field1756 != null && this.field1756[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1744 == null || this.field1744[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1744[arg0] & 0xFF;
                var37 = this.field1748[var36];
                var38 = this.field1749[var36];
                var39 = this.field1785[var36];
            }
            short var40 = this.field1756[arg0];
            if (this.field1741[arg0] == -1) {
                class86.method1905(var29, var30, var31, var26, var27, var28, this.field1765[arg0], this.field1765[arg0], this.field1765[arg0], field1746[var37], field1746[var38], field1746[var39], field1743[var37], field1743[var38], field1743[var39], field1767[var37], field1767[var38], field1767[var39], var40);
                class86.method1905(var29, var31, field1771[3], var26, var28, field1739[3], this.field1765[arg0], this.field1765[arg0], this.field1765[arg0], field1746[var37], field1746[var38], field1746[var39], field1743[var37], field1743[var38], field1743[var39], field1767[var37], field1767[var38], field1767[var39], var40);
            } else {
                class86.method1905(var29, var30, var31, var26, var27, var28, field1778[0], field1778[1], field1778[2], field1746[var37], field1746[var38], field1746[var39], field1743[var37], field1743[var38], field1743[var39], field1767[var37], field1767[var38], field1767[var39], var40);
                class86.method1905(var29, var31, field1771[3], var26, var28, field1739[3], field1778[0], field1778[2], field1778[3], field1746[var37], field1746[var38], field1746[var39], field1743[var37], field1743[var38], field1743[var39], field1767[var37], field1767[var38], field1767[var39], var40);
            }
        } else if (this.field1741[arg0] == -1) {
            int var41 = field1789[this.field1765[arg0]];
            class86.method1889(var29, var30, var31, var26, var27, var28, var41);
            class86.method1889(var29, var31, field1771[3], var26, var28, field1739[3], var41);
        } else {
            class86.method1887(var29, var30, var31, var26, var27, var28, field1778[0], field1778[1], field1778[2]);
            class86.method1887(var29, var31, field1771[3], var26, var28, field1739[3], field1778[0], field1778[2], field1778[3]);
        }
    }

    @ObfuscatedName("cp.y(IIIIIIII)Z")
    public final boolean method2105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
