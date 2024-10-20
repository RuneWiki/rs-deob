package deob;

@ObfuscatedName("cs")
public class class100 extends class80 {

    @ObfuscatedName("cs.t")
    public static class100 field1728 = new class100();

    @ObfuscatedName("cs.b")
    public static byte[] field1723 = new byte[1];

    @ObfuscatedName("cs.p")
    public static class100 field1719 = new class100();

    @ObfuscatedName("cs.e")
    public static byte[] field1775 = new byte[1];

    @ObfuscatedName("cs.i")
    public int field1752 = 0;

    @ObfuscatedName("cs.o")
    public int[] field1722;

    @ObfuscatedName("cs.f")
    public int[] field1772;

    @ObfuscatedName("cs.d")
    public int[] field1724;

    @ObfuscatedName("cs.j")
    public int field1725 = 0;

    @ObfuscatedName("cs.x")
    public int[] field1726;

    @ObfuscatedName("cs.v")
    public int[] field1727;

    @ObfuscatedName("cs.a")
    public int[] field1718;

    @ObfuscatedName("cs.l")
    public int[] field1777;

    @ObfuscatedName("cs.h")
    public int[] field1753;

    @ObfuscatedName("cs.c")
    public int[] field1731;

    @ObfuscatedName("cs.u")
    public byte[] field1732;

    @ObfuscatedName("cs.r")
    public byte[] field1733;

    @ObfuscatedName("cs.k")
    public byte[] field1734;

    @ObfuscatedName("cs.w")
    public short[] field1773;

    @ObfuscatedName("cs.q")
    public byte field1736 = 0;

    @ObfuscatedName("cs.g")
    public int field1737 = 0;

    @ObfuscatedName("cs.z")
    public int[] field1766;

    @ObfuscatedName("cs.m")
    public int[] field1739;

    @ObfuscatedName("cs.y")
    public int[] field1740;

    @ObfuscatedName("cs.n")
    public int[][] field1741;

    @ObfuscatedName("cs.s")
    public int[][] field1742;

    @ObfuscatedName("cs.ac")
    public boolean field1743 = false;

    @ObfuscatedName("cs.au")
    public int field1744;

    @ObfuscatedName("cs.ap")
    public int field1745;

    @ObfuscatedName("cs.ah")
    public int field1765;

    @ObfuscatedName("cs.ae")
    public int field1730;

    @ObfuscatedName("cs.ag")
    public int field1748;

    @ObfuscatedName("cs.at")
    public static boolean[] field1747 = new boolean[4096];

    @ObfuscatedName("cs.aw")
    public static boolean[] field1751 = new boolean[4096];

    @ObfuscatedName("cs.ay")
    public static int[] field1762 = new int[4096];

    @ObfuscatedName("cs.ao")
    public static int[] field1764 = new int[4096];

    @ObfuscatedName("cs.al")
    public static int[] field1754 = new int[4096];

    @ObfuscatedName("cs.ab")
    public static int[] field1735 = new int[4096];

    @ObfuscatedName("cs.aj")
    public static int[] field1756 = new int[4096];

    @ObfuscatedName("cs.ak")
    public static int[] field1738 = new int[4096];

    @ObfuscatedName("cs.ai")
    public static int[] field1759 = new int[1600];

    @ObfuscatedName("cs.ax")
    public static int[][] field1760 = new int[1600][512];

    @ObfuscatedName("cs.az")
    public static int[] field1761 = new int[12];

    @ObfuscatedName("cs.aq")
    public static int[][] field1729 = new int[12][2000];

    @ObfuscatedName("cs.ad")
    public static int[] field1746 = new int[2000];

    @ObfuscatedName("cs.af")
    public static int[] field1721 = new int[2000];

    @ObfuscatedName("cs.aa")
    public static int[] field1755 = new int[12];

    @ObfuscatedName("cs.av")
    public static int[] field1717 = new int[10];

    @ObfuscatedName("cs.an")
    public static int[] field1763 = new int[10];

    @ObfuscatedName("cs.am")
    public static int[] field1768 = new int[10];

    @ObfuscatedName("cs.bn")
    public static boolean field1750 = false;

    @ObfuscatedName("cs.bu")
    public static int field1780 = 0;

    @ObfuscatedName("cs.bl")
    public static int field1767 = 0;

    @ObfuscatedName("cs.by")
    public static int field1774 = 0;

    @ObfuscatedName("cs.bi")
    public static int[] field1776 = new int[1000];

    @ObfuscatedName("cs.bg")
    public static int[] field1781 = class86.field1504;

    @ObfuscatedName("cs.bw")
    public static int[] field1778 = class86.field1491;

    @ObfuscatedName("cs.bf")
    public static int[] field1779 = class86.field1487;

    @ObfuscatedName("cs.bk")
    public static int[] field1720 = class86.field1505;

    public class100() {
    }

    public class100(class100[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1752 = 0;
        this.field1725 = 0;
        this.field1737 = 0;
        this.field1736 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class100 var8 = arg0[var7];
            if (var8 != null) {
                this.field1752 += var8.field1752;
                this.field1725 += var8.field1725;
                this.field1737 += var8.field1737;
                if (var8.field1732 == null) {
                    if (this.field1736 == -1) {
                        this.field1736 = var8.field1736;
                    }
                    if (this.field1736 != var8.field1736) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1733 != null;
                var5 |= var8.field1773 != null;
                var6 |= var8.field1734 != null;
            }
        }
        this.field1722 = new int[this.field1752];
        this.field1772 = new int[this.field1752];
        this.field1724 = new int[this.field1752];
        this.field1726 = new int[this.field1725];
        this.field1727 = new int[this.field1725];
        this.field1718 = new int[this.field1725];
        this.field1777 = new int[this.field1725];
        this.field1753 = new int[this.field1725];
        this.field1731 = new int[this.field1725];
        if (var3) {
            this.field1732 = new byte[this.field1725];
        }
        if (var4) {
            this.field1733 = new byte[this.field1725];
        }
        if (var5) {
            this.field1773 = new short[this.field1725];
        }
        if (var6) {
            this.field1734 = new byte[this.field1725];
        }
        if (this.field1737 > 0) {
            this.field1766 = new int[this.field1737];
            this.field1739 = new int[this.field1737];
            this.field1740 = new int[this.field1737];
        }
        this.field1752 = 0;
        this.field1725 = 0;
        this.field1737 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class100 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1725; var11++) {
                    this.field1726[this.field1725] = var10.field1726[var11] + this.field1752;
                    this.field1727[this.field1725] = var10.field1727[var11] + this.field1752;
                    this.field1718[this.field1725] = var10.field1718[var11] + this.field1752;
                    this.field1777[this.field1725] = var10.field1777[var11];
                    this.field1753[this.field1725] = var10.field1753[var11];
                    this.field1731[this.field1725] = var10.field1731[var11];
                    if (var3) {
                        if (var10.field1732 == null) {
                            this.field1732[this.field1725] = var10.field1736;
                        } else {
                            this.field1732[this.field1725] = var10.field1732[var11];
                        }
                    }
                    if (var4 && var10.field1733 != null) {
                        this.field1733[this.field1725] = var10.field1733[var11];
                    }
                    if (var5) {
                        if (var10.field1773 == null) {
                            this.field1773[this.field1725] = -1;
                        } else {
                            this.field1773[this.field1725] = var10.field1773[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1734 == null || var10.field1734[var11] == -1) {
                            this.field1734[this.field1725] = -1;
                        } else {
                            this.field1734[this.field1725] = (byte) (var10.field1734[var11] + this.field1737);
                        }
                    }
                    this.field1725++;
                }
                for (int var12 = 0; var12 < var10.field1737; var12++) {
                    this.field1766[this.field1737] = var10.field1766[var12] + this.field1752;
                    this.field1739[this.field1737] = var10.field1739[var12] + this.field1752;
                    this.field1740[this.field1737] = var10.field1740[var12] + this.field1752;
                    this.field1737++;
                }
                for (int var13 = 0; var13 < var10.field1752; var13++) {
                    this.field1722[this.field1752] = var10.field1722[var13];
                    this.field1772[this.field1752] = var10.field1772[var13];
                    this.field1724[this.field1752] = var10.field1724[var13];
                    this.field1752++;
                }
            }
        }
    }

    @ObfuscatedName("cs.t([[IIIIZI)Lcs;")
    public class100 method2046(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2020();
        int var7 = arg1 - this.field1765;
        int var8 = this.field1765 + arg1;
        int var9 = arg3 - this.field1765;
        int var10 = this.field1765 + arg3;
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
            var15.field1752 = this.field1752;
            var15.field1725 = this.field1725;
            var15.field1737 = this.field1737;
            var15.field1722 = this.field1722;
            var15.field1724 = this.field1724;
            var15.field1726 = this.field1726;
            var15.field1727 = this.field1727;
            var15.field1718 = this.field1718;
            var15.field1777 = this.field1777;
            var15.field1753 = this.field1753;
            var15.field1731 = this.field1731;
            var15.field1732 = this.field1732;
            var15.field1733 = this.field1733;
            var15.field1734 = this.field1734;
            var15.field1773 = this.field1773;
            var15.field1736 = this.field1736;
            var15.field1766 = this.field1766;
            var15.field1739 = this.field1739;
            var15.field1740 = this.field1740;
            var15.field1741 = this.field1741;
            var15.field1742 = this.field1742;
            var15.field1743 = this.field1743;
            var15.field1772 = new int[var15.field1752];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1752; var16++) {
                int var17 = this.field1722[var16] + arg1;
                int var18 = this.field1724[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1772[var16] = this.field1772[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1752; var26++) {
                int var27 = (-this.field1772[var26] << 16) / this.field1364;
                if (var27 < arg5) {
                    int var28 = this.field1722[var26] + arg1;
                    int var29 = this.field1724[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1772[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1772[var26];
                }
            }
        }
        var15.field1744 = 0;
        return var15;
    }

    @ObfuscatedName("cs.p(Z)Lcs;")
    public class100 method2053(boolean arg0) {
        if (!arg0 && field1723.length < this.field1725) {
            field1723 = new byte[this.field1725 + 100];
        }
        return this.method2028(arg0, field1728, field1723);
    }

    @ObfuscatedName("cs.e(Z)Lcs;")
    public class100 method2018(boolean arg0) {
        if (!arg0 && field1775.length < this.field1725) {
            field1775 = new byte[this.field1725 + 100];
        }
        return this.method2028(arg0, field1719, field1775);
    }

    @ObfuscatedName("cs.i(ZLcs;[B)Lcs;")
    public class100 method2028(boolean arg0, class100 arg1, byte[] arg2) {
        arg1.field1752 = this.field1752;
        arg1.field1725 = this.field1725;
        arg1.field1737 = this.field1737;
        if (arg1.field1722 == null || arg1.field1722.length < this.field1752) {
            arg1.field1722 = new int[this.field1752 + 100];
            arg1.field1772 = new int[this.field1752 + 100];
            arg1.field1724 = new int[this.field1752 + 100];
        }
        for (int var4 = 0; var4 < this.field1752; var4++) {
            arg1.field1722[var4] = this.field1722[var4];
            arg1.field1772[var4] = this.field1772[var4];
            arg1.field1724[var4] = this.field1724[var4];
        }
        if (arg0) {
            arg1.field1733 = this.field1733;
        } else {
            arg1.field1733 = arg2;
            if (this.field1733 == null) {
                for (int var5 = 0; var5 < this.field1725; var5++) {
                    arg1.field1733[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1725; var6++) {
                    arg1.field1733[var6] = this.field1733[var6];
                }
            }
        }
        arg1.field1726 = this.field1726;
        arg1.field1727 = this.field1727;
        arg1.field1718 = this.field1718;
        arg1.field1777 = this.field1777;
        arg1.field1753 = this.field1753;
        arg1.field1731 = this.field1731;
        arg1.field1732 = this.field1732;
        arg1.field1734 = this.field1734;
        arg1.field1773 = this.field1773;
        arg1.field1736 = this.field1736;
        arg1.field1766 = this.field1766;
        arg1.field1739 = this.field1739;
        arg1.field1740 = this.field1740;
        arg1.field1741 = this.field1741;
        arg1.field1742 = this.field1742;
        arg1.field1743 = this.field1743;
        arg1.field1744 = 0;
        return arg1;
    }

    @ObfuscatedName("cs.f()V")
    public void method2020() {
        if (this.field1744 == 1) {
            return;
        }
        this.field1744 = 1;
        this.field1364 = 0;
        this.field1745 = 0;
        this.field1765 = 0;
        for (int var1 = 0; var1 < this.field1752; var1++) {
            int var2 = this.field1722[var1];
            int var3 = this.field1772[var1];
            int var4 = this.field1724[var1];
            if (-var3 > this.field1364) {
                this.field1364 = -var3;
            }
            if (var3 > this.field1745) {
                this.field1745 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1765) {
                this.field1765 = var5;
            }
        }
        this.field1765 = (int) (Math.sqrt((double) this.field1765) + 0.99D);
        this.field1748 = (int) (Math.sqrt((double) (this.field1364 * this.field1364 + this.field1765 * this.field1765)) + 0.99D);
        this.field1730 = this.field1748 + (int) (Math.sqrt((double) (this.field1765 * this.field1765 + this.field1745 * this.field1745)) + 0.99D);
    }

    @ObfuscatedName("cs.d()V")
    public void method2021() {
        if (this.field1744 == 2) {
            return;
        }
        this.field1744 = 2;
        this.field1765 = 0;
        for (int var1 = 0; var1 < this.field1752; var1++) {
            int var2 = this.field1722[var1];
            int var3 = this.field1772[var1];
            int var4 = this.field1724[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1765) {
                this.field1765 = var5;
            }
        }
        this.field1765 = (int) (Math.sqrt((double) this.field1765) + 0.99D);
        this.field1748 = this.field1765;
        this.field1730 = this.field1765 + this.field1765;
    }

    @ObfuscatedName("cs.j()I")
    public int method2022() {
        this.method2020();
        return this.field1765;
    }

    @ObfuscatedName("cs.x(Lcw;I)V")
    public void method2043(class98 arg0, int arg1) {
        if (this.field1741 == null || arg1 == -1) {
            return;
        }
        class83 var3 = arg0.field1685[arg1];
        class97 var4 = var3.field1451;
        Statics.field1769 = 0;
        Statics.field1770 = 0;
        Statics.field1771 = 0;
        for (int var5 = 0; var5 < var3.field1452; var5++) {
            int var6 = var3.field1457[var5];
            this.method2094(var4.field1680[var6], var4.field1681[var6], var3.field1456[var5], var3.field1455[var5], var3.field1447[var5]);
        }
        this.field1744 = 0;
    }

    @ObfuscatedName("cs.v(Lcw;ILcw;I[I)V")
    public void method2032(class98 arg0, int arg1, class98 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2043(arg0, arg1);
            return;
        }
        class83 var6 = arg0.field1685[arg1];
        class83 var7 = arg2.field1685[arg3];
        class97 var8 = var6.field1451;
        Statics.field1769 = 0;
        Statics.field1770 = 0;
        Statics.field1771 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1452; var11++) {
            int var12 = var6.field1457[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1680[var12] == 0) {
                this.method2094(var8.field1680[var12], var8.field1681[var12], var6.field1456[var11], var6.field1455[var11], var6.field1447[var11]);
            }
        }
        Statics.field1769 = 0;
        Statics.field1770 = 0;
        Statics.field1771 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1452; var15++) {
            int var16 = var7.field1457[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1680[var16] == 0) {
                this.method2094(var8.field1680[var16], var8.field1681[var16], var7.field1456[var15], var7.field1455[var15], var7.field1447[var15]);
            }
        }
        this.field1744 = 0;
    }

    @ObfuscatedName("cs.a(I[IIII)V")
    public void method2094(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1769 = 0;
            Statics.field1770 = 0;
            Statics.field1771 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1741.length) {
                    int[] var10 = this.field1741[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1769 += this.field1722[var12];
                        Statics.field1770 += this.field1772[var12];
                        Statics.field1771 += this.field1724[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1769 = Statics.field1769 / var7 + arg2;
                Statics.field1770 = Statics.field1770 / var7 + arg3;
                Statics.field1771 = Statics.field1771 / var7 + arg4;
            } else {
                Statics.field1769 = arg2;
                Statics.field1770 = arg3;
                Statics.field1771 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1741.length) {
                    int[] var15 = this.field1741[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1722[var17] += arg2;
                        this.field1772[var17] += arg3;
                        this.field1724[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1741.length) {
                    int[] var20 = this.field1741[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1722[var22] -= Statics.field1769;
                        this.field1772[var22] -= Statics.field1770;
                        this.field1724[var22] -= Statics.field1771;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1781[var25];
                            int var27 = field1778[var25];
                            int var28 = this.field1772[var22] * var26 + this.field1722[var22] * var27 >> 16;
                            this.field1772[var22] = this.field1772[var22] * var27 - this.field1722[var22] * var26 >> 16;
                            this.field1722[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1781[var23];
                            int var30 = field1778[var23];
                            int var31 = this.field1772[var22] * var30 - this.field1724[var22] * var29 >> 16;
                            this.field1724[var22] = this.field1772[var22] * var29 + this.field1724[var22] * var30 >> 16;
                            this.field1772[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1781[var24];
                            int var33 = field1778[var24];
                            int var34 = this.field1724[var22] * var32 + this.field1722[var22] * var33 >> 16;
                            this.field1724[var22] = this.field1724[var22] * var33 - this.field1722[var22] * var32 >> 16;
                            this.field1722[var22] = var34;
                        }
                        this.field1722[var22] += Statics.field1769;
                        this.field1772[var22] += Statics.field1770;
                        this.field1724[var22] += Statics.field1771;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1741.length) {
                    int[] var37 = this.field1741[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1722[var39] -= Statics.field1769;
                        this.field1772[var39] -= Statics.field1770;
                        this.field1724[var39] -= Statics.field1771;
                        this.field1722[var39] = this.field1722[var39] * arg2 / 128;
                        this.field1772[var39] = this.field1772[var39] * arg3 / 128;
                        this.field1724[var39] = this.field1724[var39] * arg4 / 128;
                        this.field1722[var39] += Statics.field1769;
                        this.field1772[var39] += Statics.field1770;
                        this.field1724[var39] += Statics.field1771;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1742 != null && this.field1733 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1742.length) {
                    int[] var42 = this.field1742[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1733[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1733[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cs.l()V")
    public void method2038() {
        for (int var1 = 0; var1 < this.field1752; var1++) {
            int var2 = this.field1722[var1];
            this.field1722[var1] = this.field1724[var1];
            this.field1724[var1] = -var2;
        }
        this.field1744 = 0;
    }

    @ObfuscatedName("cs.h()V")
    public void method2027() {
        for (int var1 = 0; var1 < this.field1752; var1++) {
            this.field1722[var1] = -this.field1722[var1];
            this.field1724[var1] = -this.field1724[var1];
        }
        this.field1744 = 0;
    }

    @ObfuscatedName("cs.c()V")
    public void method2039() {
        for (int var1 = 0; var1 < this.field1752; var1++) {
            int var2 = this.field1724[var1];
            this.field1724[var1] = this.field1722[var1];
            this.field1722[var1] = -var2;
        }
        this.field1744 = 0;
    }

    @ObfuscatedName("cs.u(I)V")
    public void method2029(int arg0) {
        int var2 = field1781[arg0];
        int var3 = field1778[arg0];
        for (int var4 = 0; var4 < this.field1752; var4++) {
            int var5 = this.field1772[var4] * var3 - this.field1724[var4] * var2 >> 16;
            this.field1724[var4] = this.field1772[var4] * var2 + this.field1724[var4] * var3 >> 16;
            this.field1772[var4] = var5;
        }
        this.field1744 = 0;
    }

    @ObfuscatedName("cs.r(III)V")
    public void method2030(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1752; var4++) {
            this.field1722[var4] += arg0;
            this.field1772[var4] += arg1;
            this.field1724[var4] += arg2;
        }
        this.field1744 = 0;
    }

    @ObfuscatedName("cs.k(III)V")
    public void method2023(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1752; var4++) {
            this.field1722[var4] = this.field1722[var4] * arg0 / 128;
            this.field1772[var4] = this.field1772[var4] * arg1 / 128;
            this.field1724[var4] = this.field1724[var4] * arg2 / 128;
        }
        this.field1744 = 0;
    }

    @ObfuscatedName("cs.w(IIIIIII)V")
    public final void method2015(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1759[0] = -1;
        if (this.field1744 != 2 && this.field1744 != 1) {
            this.method2021();
        }
        int var8 = Statics.field1492;
        int var9 = Statics.field1493;
        int var10 = field1781[arg0];
        int var11 = field1778[arg0];
        int var12 = field1781[arg1];
        int var13 = field1778[arg1];
        int var14 = field1781[arg2];
        int var15 = field1778[arg2];
        int var16 = field1781[arg3];
        int var17 = field1778[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1752; var19++) {
            int var20 = this.field1722[var19];
            int var21 = this.field1772[var19];
            int var22 = this.field1724[var19];
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
            field1754[var19] = var30 - var18;
            field1762[var19] = class86.field1502 * var26 / var30 + var8;
            field1764[var19] = class86.field1502 * var29 / var30 + var9;
            if (this.field1737 > 0) {
                field1735[var19] = var26;
                field1756[var19] = var29;
                field1738[var19] = var30;
            }
        }
        try {
            this.method2092(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cs.q(IIIIIIII)V")
    public final void method2071(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1759[0] = -1;
        if (this.field1744 != 2 && this.field1744 != 1) {
            this.method2021();
        }
        int var9 = Statics.field1492;
        int var10 = Statics.field1493;
        int var11 = field1781[arg0];
        int var12 = field1778[arg0];
        int var13 = field1781[arg1];
        int var14 = field1778[arg1];
        int var15 = field1781[arg2];
        int var16 = field1778[arg2];
        int var17 = field1781[arg3];
        int var18 = field1778[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1752; var20++) {
            int var21 = this.field1722[var20];
            int var22 = this.field1772[var20];
            int var23 = this.field1724[var20];
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
            field1754[var20] = var31 - var19;
            field1762[var20] = class86.field1502 * var27 / arg7 + var9;
            field1764[var20] = class86.field1502 * var30 / arg7 + var10;
            if (this.field1737 > 0) {
                field1735[var20] = var27;
                field1756[var20] = var30;
                field1738[var20] = var31;
            }
        }
        try {
            this.method2092(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cs.ap(IIIIIIIII)V")
    public void method1644(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1759[0] = -1;
        if (this.field1744 != 1) {
            this.method2020();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1765 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1765) * class86.field1502;
        if (var15 / var13 >= Statics.field1497) {
            return;
        }
        int var16 = (this.field1765 + var14) * class86.field1502;
        if (var16 / var13 <= Statics.field1496) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1765 * arg1 >> 16;
        int var19 = (var17 + var18) * class86.field1502;
        if (var19 / var13 <= Statics.field1498) {
            return;
        }
        int var20 = (this.field1364 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class86.field1502;
        if (var21 / var13 >= Statics.field1494) {
            return;
        }
        int var22 = (this.field1364 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1737 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1750) {
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
            int var32 = field1780 - Statics.field1492;
            int var33 = field1767 - Statics.field1493;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1743) {
                    field1776[field1774++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1492;
        int var35 = Statics.field1493;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1781[arg0];
            var37 = field1778[arg0];
        }
        for (int var38 = 0; var38 < this.field1752; var38++) {
            int var39 = this.field1722[var38];
            int var40 = this.field1772[var38];
            int var41 = this.field1724[var38];
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
            field1754[var38] = var50 - var11;
            if (var50 >= 50) {
                field1762[var38] = class86.field1502 * var46 / var50 + var34;
                field1764[var38] = class86.field1502 * var49 / var50 + var35;
            } else {
                field1762[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1735[var38] = var46;
                field1756[var38] = var49;
                field1738[var38] = var50;
            }
        }
        try {
            this.method2092(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cs.g(ZZI)V")
    public final void method2092(boolean arg0, boolean arg1, int arg2) {
        if (this.field1730 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1730; var4++) {
            field1759[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1725; var5++) {
            if (this.field1731[var5] != -2) {
                int var6 = this.field1726[var5];
                int var7 = this.field1727[var5];
                int var8 = this.field1718[var5];
                int var9 = field1762[var6];
                int var10 = field1762[var7];
                int var11 = field1762[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1735[var6];
                    int var13 = field1735[var7];
                    int var14 = field1735[var8];
                    int var15 = field1756[var6];
                    int var16 = field1756[var7];
                    int var17 = field1756[var8];
                    int var18 = field1738[var6];
                    int var19 = field1738[var7];
                    int var20 = field1738[var8];
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
                        field1751[var5] = true;
                        int var30 = (field1754[var6] + field1754[var7] + field1754[var8]) / 3 + this.field1748;
                        field1760[var30][field1759[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2086(field1780, field1767, field1764[var6], field1764[var7], field1764[var8], var9, var10, var11)) {
                        field1776[field1774++] = arg2;
                        arg1 = false;
                    }
                    if ((field1764[var8] - field1764[var7]) * (var9 - var10) - (field1764[var6] - field1764[var7]) * (var11 - var10) > 0) {
                        field1751[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1482 && var10 <= Statics.field1482 && var11 <= Statics.field1482) {
                            field1747[var5] = false;
                        } else {
                            field1747[var5] = true;
                        }
                        int var31 = (field1754[var6] + field1754[var7] + field1754[var8]) / 3 + this.field1748;
                        field1760[var31][field1759[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1732 == null) {
            for (int var32 = this.field1730 - 1; var32 >= 0; var32--) {
                int var33 = field1759[var32];
                if (var33 > 0) {
                    int[] var34 = field1760[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2083(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1761[var36] = 0;
            field1755[var36] = 0;
        }
        for (int var37 = this.field1730 - 1; var37 >= 0; var37--) {
            int var38 = field1759[var37];
            if (var38 > 0) {
                int[] var39 = field1760[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1732[var41];
                    int var43 = field1761[var42]++;
                    field1729[var42][var43] = var41;
                    if (var42 < 10) {
                        field1755[var42] += var37;
                    } else if (var42 == 10) {
                        field1746[var43] = var37;
                    } else {
                        field1721[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1761[1] > 0 || field1761[2] > 0) {
            var44 = (field1755[1] + field1755[2]) / (field1761[1] + field1761[2]);
        }
        int var45 = 0;
        if (field1761[3] > 0 || field1761[4] > 0) {
            var45 = (field1755[3] + field1755[4]) / (field1761[3] + field1761[4]);
        }
        int var46 = 0;
        if (field1761[6] > 0 || field1761[8] > 0) {
            var46 = (field1755[6] + field1755[8]) / (field1761[6] + field1761[8]);
        }
        int var47 = 0;
        int var48 = field1761[10];
        int[] var49 = field1729[10];
        int[] var50 = field1746;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1761[11];
            var49 = field1729[11];
            var50 = field1721;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2083(var49[var47++]);
                if (var47 == var48 && field1729[11] != var49) {
                    var47 = 0;
                    var48 = field1761[11];
                    var49 = field1729[11];
                    var50 = field1721;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2083(var49[var47++]);
                if (var47 == var48 && field1729[11] != var49) {
                    var47 = 0;
                    var48 = field1761[11];
                    var49 = field1729[11];
                    var50 = field1721;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2083(var49[var47++]);
                if (var47 == var48 && field1729[11] != var49) {
                    var47 = 0;
                    var48 = field1761[11];
                    var49 = field1729[11];
                    var50 = field1721;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1761[var52];
            int[] var54 = field1729[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2083(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2083(var49[var47++]);
            if (var47 == var48 && field1729[11] != var49) {
                var47 = 0;
                var49 = field1729[11];
                var48 = field1761[11];
                var50 = field1721;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cs.z(I)V")
    public final void method2083(int arg0) {
        if (field1751[arg0]) {
            this.method2036(arg0);
            return;
        }
        int var2 = this.field1726[arg0];
        int var3 = this.field1727[arg0];
        int var4 = this.field1718[arg0];
        class86.field1506 = field1747[arg0];
        if (this.field1733 == null) {
            class86.field1486 = 0;
        } else {
            class86.field1486 = this.field1733[arg0] & 0xFF;
        }
        if (this.field1773 != null && this.field1773[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1734 == null || this.field1734[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1734[arg0] & 0xFF;
                var6 = this.field1766[var5];
                var7 = this.field1739[var5];
                var8 = this.field1740[var5];
            }
            if (this.field1731[arg0] == -1) {
                class86.method1851(field1764[var2], field1764[var3], field1764[var4], field1762[var2], field1762[var3], field1762[var4], this.field1777[arg0], this.field1777[arg0], this.field1777[arg0], field1735[var6], field1735[var7], field1735[var8], field1756[var6], field1756[var7], field1756[var8], field1738[var6], field1738[var7], field1738[var8], this.field1773[arg0]);
            } else {
                class86.method1851(field1764[var2], field1764[var3], field1764[var4], field1762[var2], field1762[var3], field1762[var4], this.field1777[arg0], this.field1753[arg0], this.field1731[arg0], field1735[var6], field1735[var7], field1735[var8], field1756[var6], field1756[var7], field1756[var8], field1738[var6], field1738[var7], field1738[var8], this.field1773[arg0]);
            }
        } else if (this.field1731[arg0] == -1) {
            class86.method1849(field1764[var2], field1764[var3], field1764[var4], field1762[var2], field1762[var3], field1762[var4], field1779[this.field1777[arg0]]);
        } else {
            class86.method1847(field1764[var2], field1764[var3], field1764[var4], field1762[var2], field1762[var3], field1762[var4], this.field1777[arg0], this.field1753[arg0], this.field1731[arg0]);
        }
    }

    @ObfuscatedName("cs.m(I)V")
    public final void method2036(int arg0) {
        int var2 = Statics.field1492;
        int var3 = Statics.field1493;
        int var4 = 0;
        int var5 = this.field1726[arg0];
        int var6 = this.field1727[arg0];
        int var7 = this.field1718[arg0];
        int var8 = field1738[var5];
        int var9 = field1738[var6];
        int var10 = field1738[var7];
        if (this.field1733 == null) {
            class86.field1486 = 0;
        } else {
            class86.field1486 = this.field1733[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1717[var4] = field1762[var5];
            field1763[var4] = field1764[var5];
            field1768[var4++] = this.field1777[arg0];
        } else {
            int var11 = field1735[var5];
            int var12 = field1756[var5];
            int var13 = this.field1777[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1720[var10 - var8];
                field1717[var4] = (((field1735[var7] - var11) * var14 >> 16) + var11) * class86.field1502 / 50 + var2;
                field1763[var4] = (((field1756[var7] - var12) * var14 >> 16) + var12) * class86.field1502 / 50 + var3;
                field1768[var4++] = ((this.field1731[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1720[var9 - var8];
                field1717[var4] = (((field1735[var6] - var11) * var15 >> 16) + var11) * class86.field1502 / 50 + var2;
                field1763[var4] = (((field1756[var6] - var12) * var15 >> 16) + var12) * class86.field1502 / 50 + var3;
                field1768[var4++] = ((this.field1753[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1717[var4] = field1762[var6];
            field1763[var4] = field1764[var6];
            field1768[var4++] = this.field1753[arg0];
        } else {
            int var16 = field1735[var6];
            int var17 = field1756[var6];
            int var18 = this.field1753[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1720[var8 - var9];
                field1717[var4] = (((field1735[var5] - var16) * var19 >> 16) + var16) * class86.field1502 / 50 + var2;
                field1763[var4] = (((field1756[var5] - var17) * var19 >> 16) + var17) * class86.field1502 / 50 + var3;
                field1768[var4++] = ((this.field1777[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1720[var10 - var9];
                field1717[var4] = (((field1735[var7] - var16) * var20 >> 16) + var16) * class86.field1502 / 50 + var2;
                field1763[var4] = (((field1756[var7] - var17) * var20 >> 16) + var17) * class86.field1502 / 50 + var3;
                field1768[var4++] = ((this.field1731[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1717[var4] = field1762[var7];
            field1763[var4] = field1764[var7];
            field1768[var4++] = this.field1731[arg0];
        } else {
            int var21 = field1735[var7];
            int var22 = field1756[var7];
            int var23 = this.field1731[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1720[var9 - var10];
                field1717[var4] = (((field1735[var6] - var21) * var24 >> 16) + var21) * class86.field1502 / 50 + var2;
                field1763[var4] = (((field1756[var6] - var22) * var24 >> 16) + var22) * class86.field1502 / 50 + var3;
                field1768[var4++] = ((this.field1753[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1720[var8 - var10];
                field1717[var4] = (((field1735[var5] - var21) * var25 >> 16) + var21) * class86.field1502 / 50 + var2;
                field1763[var4] = (((field1756[var5] - var22) * var25 >> 16) + var22) * class86.field1502 / 50 + var3;
                field1768[var4++] = ((this.field1777[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1717[0];
        int var27 = field1717[1];
        int var28 = field1717[2];
        int var29 = field1763[0];
        int var30 = field1763[1];
        int var31 = field1763[2];
        class86.field1506 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1482 || var27 > Statics.field1482 || var28 > Statics.field1482) {
                class86.field1506 = true;
            }
            if (this.field1773 != null && this.field1773[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1734 == null || this.field1734[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1734[arg0] & 0xFF;
                    var33 = this.field1766[var32];
                    var34 = this.field1739[var32];
                    var35 = this.field1740[var32];
                }
                if (this.field1731[arg0] == -1) {
                    class86.method1851(var29, var30, var31, var26, var27, var28, this.field1777[arg0], this.field1777[arg0], this.field1777[arg0], field1735[var33], field1735[var34], field1735[var35], field1756[var33], field1756[var34], field1756[var35], field1738[var33], field1738[var34], field1738[var35], this.field1773[arg0]);
                } else {
                    class86.method1851(var29, var30, var31, var26, var27, var28, field1768[0], field1768[1], field1768[2], field1735[var33], field1735[var34], field1735[var35], field1756[var33], field1756[var34], field1756[var35], field1738[var33], field1738[var34], field1738[var35], this.field1773[arg0]);
                }
            } else if (this.field1731[arg0] == -1) {
                class86.method1849(var29, var30, var31, var26, var27, var28, field1779[this.field1777[arg0]]);
            } else {
                class86.method1847(var29, var30, var31, var26, var27, var28, field1768[0], field1768[1], field1768[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1482 || var27 > Statics.field1482 || var28 > Statics.field1482 || field1717[3] < 0 || field1717[3] > Statics.field1482) {
            class86.field1506 = true;
        }
        if (this.field1773 != null && this.field1773[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1734 == null || this.field1734[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1734[arg0] & 0xFF;
                var37 = this.field1766[var36];
                var38 = this.field1739[var36];
                var39 = this.field1740[var36];
            }
            short var40 = this.field1773[arg0];
            if (this.field1731[arg0] == -1) {
                class86.method1851(var29, var30, var31, var26, var27, var28, this.field1777[arg0], this.field1777[arg0], this.field1777[arg0], field1735[var37], field1735[var38], field1735[var39], field1756[var37], field1756[var38], field1756[var39], field1738[var37], field1738[var38], field1738[var39], var40);
                class86.method1851(var29, var31, field1763[3], var26, var28, field1717[3], this.field1777[arg0], this.field1777[arg0], this.field1777[arg0], field1735[var37], field1735[var38], field1735[var39], field1756[var37], field1756[var38], field1756[var39], field1738[var37], field1738[var38], field1738[var39], var40);
            } else {
                class86.method1851(var29, var30, var31, var26, var27, var28, field1768[0], field1768[1], field1768[2], field1735[var37], field1735[var38], field1735[var39], field1756[var37], field1756[var38], field1756[var39], field1738[var37], field1738[var38], field1738[var39], var40);
                class86.method1851(var29, var31, field1763[3], var26, var28, field1717[3], field1768[0], field1768[2], field1768[3], field1735[var37], field1735[var38], field1735[var39], field1756[var37], field1756[var38], field1756[var39], field1738[var37], field1738[var38], field1738[var39], var40);
            }
        } else if (this.field1731[arg0] == -1) {
            int var41 = field1779[this.field1777[arg0]];
            class86.method1849(var29, var30, var31, var26, var27, var28, var41);
            class86.method1849(var29, var31, field1763[3], var26, var28, field1717[3], var41);
        } else {
            class86.method1847(var29, var30, var31, var26, var27, var28, field1768[0], field1768[1], field1768[2]);
            class86.method1847(var29, var31, field1763[3], var26, var28, field1717[3], field1768[0], field1768[2], field1768[3]);
        }
    }

    @ObfuscatedName("cs.y(IIIIIIII)Z")
    public final boolean method2086(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
