package deob;

@ObfuscatedName("ch")
public class class100 extends class80 {

    @ObfuscatedName("ch.q")
    public static class100 field1706 = new class100();

    @ObfuscatedName("ch.s")
    public static byte[] field1687 = new byte[1];

    @ObfuscatedName("ch.h")
    public static class100 field1688 = new class100();

    @ObfuscatedName("ch.e")
    public static byte[] field1689 = new byte[1];

    @ObfuscatedName("ch.n")
    public int field1713 = 0;

    @ObfuscatedName("ch.t")
    public int[] field1691;

    @ObfuscatedName("ch.l")
    public int[] field1690;

    @ObfuscatedName("ch.m")
    public int[] field1727;

    @ObfuscatedName("ch.o")
    public int field1733 = 0;

    @ObfuscatedName("ch.k")
    public int[] field1693;

    @ObfuscatedName("ch.p")
    public int[] field1719;

    @ObfuscatedName("ch.u")
    public int[] field1697;

    @ObfuscatedName("ch.g")
    public int[] field1716;

    @ObfuscatedName("ch.a")
    public int[] field1699;

    @ObfuscatedName("ch.y")
    public int[] field1700;

    @ObfuscatedName("ch.d")
    public byte[] field1737;

    @ObfuscatedName("ch.b")
    public byte[] field1702;

    @ObfuscatedName("ch.j")
    public byte[] field1703;

    @ObfuscatedName("ch.f")
    public short[] field1704;

    @ObfuscatedName("ch.w")
    public byte field1705 = 0;

    @ObfuscatedName("ch.z")
    public int field1707 = 0;

    @ObfuscatedName("ch.x")
    public int[] field1746;

    @ObfuscatedName("ch.v")
    public int[] field1708;

    @ObfuscatedName("ch.i")
    public int[] field1709;

    @ObfuscatedName("ch.c")
    public int[][] field1710;

    @ObfuscatedName("ch.r")
    public int[][] field1711;

    @ObfuscatedName("ch.an")
    public boolean field1722 = false;

    @ObfuscatedName("ch.ad")
    public int field1718;

    @ObfuscatedName("ch.ai")
    public int field1714;

    @ObfuscatedName("ch.ae")
    public int field1715;

    @ObfuscatedName("ch.aq")
    public int field1701;

    @ObfuscatedName("ch.av")
    public int field1717;

    @ObfuscatedName("ch.ac")
    public static boolean[] field1695 = new boolean[4096];

    @ObfuscatedName("ch.ak")
    public static boolean[] field1720 = new boolean[4096];

    @ObfuscatedName("ch.aa")
    public static int[] field1721 = new int[4096];

    @ObfuscatedName("ch.al")
    public static int[] field1686 = new int[4096];

    @ObfuscatedName("ch.ao")
    public static int[] field1723 = new int[4096];

    @ObfuscatedName("ch.af")
    public static int[] field1735 = new int[4096];

    @ObfuscatedName("ch.as")
    public static int[] field1725 = new int[4096];

    @ObfuscatedName("ch.ab")
    public static int[] field1726 = new int[4096];

    @ObfuscatedName("ch.ax")
    public static int[] field1728 = new int[1600];

    @ObfuscatedName("ch.au")
    public static int[][] field1729 = new int[1600][512];

    @ObfuscatedName("ch.ap")
    public static int[] field1730 = new int[12];

    @ObfuscatedName("ch.aw")
    public static int[][] field1712 = new int[12][2000];

    @ObfuscatedName("ch.ar")
    public static int[] field1732 = new int[2000];

    @ObfuscatedName("ch.at")
    public static int[] field1739 = new int[2000];

    @ObfuscatedName("ch.ah")
    public static int[] field1734 = new int[12];

    @ObfuscatedName("ch.ag")
    public static int[] field1741 = new int[10];

    @ObfuscatedName("ch.aj")
    public static int[] field1736 = new int[10];

    @ObfuscatedName("ch.az")
    public static int[] field1744 = new int[10];

    @ObfuscatedName("ch.bn")
    public static boolean field1698 = false;

    @ObfuscatedName("ch.bz")
    public static int field1742 = 0;

    @ObfuscatedName("ch.bx")
    public static int field1743 = 0;

    @ObfuscatedName("ch.bs")
    public static int field1692 = 0;

    @ObfuscatedName("ch.bt")
    public static int[] field1745 = new int[1000];

    @ObfuscatedName("ch.by")
    public static int[] field1696 = class86.field1480;

    @ObfuscatedName("ch.ba")
    public static int[] field1747 = class86.field1464;

    @ObfuscatedName("ch.bv")
    public static int[] field1694 = class86.field1460;

    @ObfuscatedName("ch.bc")
    public static int[] field1749 = class86.field1479;

    public class100() {
    }

    public class100(class100[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1713 = 0;
        this.field1733 = 0;
        this.field1707 = 0;
        this.field1705 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class100 var8 = arg0[var7];
            if (var8 != null) {
                this.field1713 += var8.field1713;
                this.field1733 += var8.field1733;
                this.field1707 += var8.field1707;
                if (var8.field1737 == null) {
                    if (this.field1705 == -1) {
                        this.field1705 = var8.field1705;
                    }
                    if (this.field1705 != var8.field1705) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1702 != null;
                var5 |= var8.field1704 != null;
                var6 |= var8.field1703 != null;
            }
        }
        this.field1691 = new int[this.field1713];
        this.field1690 = new int[this.field1713];
        this.field1727 = new int[this.field1713];
        this.field1693 = new int[this.field1733];
        this.field1719 = new int[this.field1733];
        this.field1697 = new int[this.field1733];
        this.field1716 = new int[this.field1733];
        this.field1699 = new int[this.field1733];
        this.field1700 = new int[this.field1733];
        if (var3) {
            this.field1737 = new byte[this.field1733];
        }
        if (var4) {
            this.field1702 = new byte[this.field1733];
        }
        if (var5) {
            this.field1704 = new short[this.field1733];
        }
        if (var6) {
            this.field1703 = new byte[this.field1733];
        }
        if (this.field1707 > 0) {
            this.field1746 = new int[this.field1707];
            this.field1708 = new int[this.field1707];
            this.field1709 = new int[this.field1707];
        }
        this.field1713 = 0;
        this.field1733 = 0;
        this.field1707 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class100 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1733; var11++) {
                    this.field1693[this.field1733] = var10.field1693[var11] + this.field1713;
                    this.field1719[this.field1733] = var10.field1719[var11] + this.field1713;
                    this.field1697[this.field1733] = var10.field1697[var11] + this.field1713;
                    this.field1716[this.field1733] = var10.field1716[var11];
                    this.field1699[this.field1733] = var10.field1699[var11];
                    this.field1700[this.field1733] = var10.field1700[var11];
                    if (var3) {
                        if (var10.field1737 == null) {
                            this.field1737[this.field1733] = var10.field1705;
                        } else {
                            this.field1737[this.field1733] = var10.field1737[var11];
                        }
                    }
                    if (var4 && var10.field1702 != null) {
                        this.field1702[this.field1733] = var10.field1702[var11];
                    }
                    if (var5) {
                        if (var10.field1704 == null) {
                            this.field1704[this.field1733] = -1;
                        } else {
                            this.field1704[this.field1733] = var10.field1704[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1703 == null || var10.field1703[var11] == -1) {
                            this.field1703[this.field1733] = -1;
                        } else {
                            this.field1703[this.field1733] = (byte) (var10.field1703[var11] + this.field1707);
                        }
                    }
                    this.field1733++;
                }
                for (int var12 = 0; var12 < var10.field1707; var12++) {
                    this.field1746[this.field1707] = var10.field1746[var12] + this.field1713;
                    this.field1708[this.field1707] = var10.field1708[var12] + this.field1713;
                    this.field1709[this.field1707] = var10.field1709[var12] + this.field1713;
                    this.field1707++;
                }
                for (int var13 = 0; var13 < var10.field1713; var13++) {
                    this.field1691[this.field1713] = var10.field1691[var13];
                    this.field1690[this.field1713] = var10.field1690[var13];
                    this.field1727[this.field1713] = var10.field1727[var13];
                    this.field1713++;
                }
            }
        }
    }

    @ObfuscatedName("ch.q([[IIIIZI)Lch;")
    public class100 method1993(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1995();
        int var7 = arg1 - this.field1715;
        int var8 = this.field1715 + arg1;
        int var9 = arg3 - this.field1715;
        int var10 = this.field1715 + arg3;
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
            var15.field1713 = this.field1713;
            var15.field1733 = this.field1733;
            var15.field1707 = this.field1707;
            var15.field1691 = this.field1691;
            var15.field1727 = this.field1727;
            var15.field1693 = this.field1693;
            var15.field1719 = this.field1719;
            var15.field1697 = this.field1697;
            var15.field1716 = this.field1716;
            var15.field1699 = this.field1699;
            var15.field1700 = this.field1700;
            var15.field1737 = this.field1737;
            var15.field1702 = this.field1702;
            var15.field1703 = this.field1703;
            var15.field1704 = this.field1704;
            var15.field1705 = this.field1705;
            var15.field1746 = this.field1746;
            var15.field1708 = this.field1708;
            var15.field1709 = this.field1709;
            var15.field1710 = this.field1710;
            var15.field1711 = this.field1711;
            var15.field1722 = this.field1722;
            var15.field1690 = new int[var15.field1713];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1713; var16++) {
                int var17 = this.field1691[var16] + arg1;
                int var18 = this.field1727[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1690[var16] = this.field1690[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1713; var26++) {
                int var27 = (-this.field1690[var26] << 16) / this.field1355;
                if (var27 < arg5) {
                    int var28 = this.field1691[var26] + arg1;
                    int var29 = this.field1727[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1690[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1690[var26];
                }
            }
        }
        var15.field1718 = 0;
        return var15;
    }

    @ObfuscatedName("ch.h(Z)Lch;")
    public class100 method1992(boolean arg0) {
        if (!arg0 && field1687.length < this.field1733) {
            field1687 = new byte[this.field1733 + 100];
        }
        return this.method1994(arg0, field1706, field1687);
    }

    @ObfuscatedName("ch.e(Z)Lch;")
    public class100 method2059(boolean arg0) {
        if (!arg0 && field1689.length < this.field1733) {
            field1689 = new byte[this.field1733 + 100];
        }
        return this.method1994(arg0, field1688, field1689);
    }

    @ObfuscatedName("ch.n(ZLch;[B)Lch;")
    public class100 method1994(boolean arg0, class100 arg1, byte[] arg2) {
        arg1.field1713 = this.field1713;
        arg1.field1733 = this.field1733;
        arg1.field1707 = this.field1707;
        if (arg1.field1691 == null || arg1.field1691.length < this.field1713) {
            arg1.field1691 = new int[this.field1713 + 100];
            arg1.field1690 = new int[this.field1713 + 100];
            arg1.field1727 = new int[this.field1713 + 100];
        }
        for (int var4 = 0; var4 < this.field1713; var4++) {
            arg1.field1691[var4] = this.field1691[var4];
            arg1.field1690[var4] = this.field1690[var4];
            arg1.field1727[var4] = this.field1727[var4];
        }
        if (arg0) {
            arg1.field1702 = this.field1702;
        } else {
            arg1.field1702 = arg2;
            if (this.field1702 == null) {
                for (int var5 = 0; var5 < this.field1733; var5++) {
                    arg1.field1702[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1733; var6++) {
                    arg1.field1702[var6] = this.field1702[var6];
                }
            }
        }
        arg1.field1693 = this.field1693;
        arg1.field1719 = this.field1719;
        arg1.field1697 = this.field1697;
        arg1.field1716 = this.field1716;
        arg1.field1699 = this.field1699;
        arg1.field1700 = this.field1700;
        arg1.field1737 = this.field1737;
        arg1.field1703 = this.field1703;
        arg1.field1704 = this.field1704;
        arg1.field1705 = this.field1705;
        arg1.field1746 = this.field1746;
        arg1.field1708 = this.field1708;
        arg1.field1709 = this.field1709;
        arg1.field1710 = this.field1710;
        arg1.field1711 = this.field1711;
        arg1.field1722 = this.field1722;
        arg1.field1718 = 0;
        return arg1;
    }

    @ObfuscatedName("ch.t()V")
    public void method1995() {
        if (this.field1718 == 1) {
            return;
        }
        this.field1718 = 1;
        this.field1355 = 0;
        this.field1714 = 0;
        this.field1715 = 0;
        for (int var1 = 0; var1 < this.field1713; var1++) {
            int var2 = this.field1691[var1];
            int var3 = this.field1690[var1];
            int var4 = this.field1727[var1];
            if (-var3 > this.field1355) {
                this.field1355 = -var3;
            }
            if (var3 > this.field1714) {
                this.field1714 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1715) {
                this.field1715 = var5;
            }
        }
        this.field1715 = (int) (Math.sqrt((double) this.field1715) + 0.99D);
        this.field1717 = (int) (Math.sqrt((double) (this.field1355 * this.field1355 + this.field1715 * this.field1715)) + 0.99D);
        this.field1701 = this.field1717 + (int) (Math.sqrt((double) (this.field1715 * this.field1715 + this.field1714 * this.field1714)) + 0.99D);
    }

    @ObfuscatedName("ch.p()V")
    public void method1996() {
        if (this.field1718 == 2) {
            return;
        }
        this.field1718 = 2;
        this.field1715 = 0;
        for (int var1 = 0; var1 < this.field1713; var1++) {
            int var2 = this.field1691[var1];
            int var3 = this.field1690[var1];
            int var4 = this.field1727[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1715) {
                this.field1715 = var5;
            }
        }
        this.field1715 = (int) (Math.sqrt((double) this.field1715) + 0.99D);
        this.field1717 = this.field1715;
        this.field1701 = this.field1715 + this.field1715;
    }

    @ObfuscatedName("ch.u()I")
    public int method1997() {
        this.method1995();
        return this.field1715;
    }

    @ObfuscatedName("ch.g(Lcc;I)V")
    public void method1998(class98 arg0, int arg1) {
        if (this.field1710 == null || arg1 == -1) {
            return;
        }
        class83 var3 = arg0.field1660[arg1];
        class97 var4 = var3.field1438;
        Statics.field1738 = 0;
        Statics.field1731 = 0;
        Statics.field1752 = 0;
        for (int var5 = 0; var5 < var3.field1435; var5++) {
            int var6 = var3.field1439[var5];
            this.method2000(var4.field1652[var6], var4.field1650[var6], var3.field1437[var5], var3.field1441[var5], var3.field1442[var5]);
        }
        this.field1718 = 0;
    }

    @ObfuscatedName("ch.a(Lcc;ILcc;I[I)V")
    public void method1999(class98 arg0, int arg1, class98 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1998(arg0, arg1);
            return;
        }
        class83 var6 = arg0.field1660[arg1];
        class83 var7 = arg2.field1660[arg3];
        class97 var8 = var6.field1438;
        Statics.field1738 = 0;
        Statics.field1731 = 0;
        Statics.field1752 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1435; var11++) {
            int var12 = var6.field1439[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1652[var12] == 0) {
                this.method2000(var8.field1652[var12], var8.field1650[var12], var6.field1437[var11], var6.field1441[var11], var6.field1442[var11]);
            }
        }
        Statics.field1738 = 0;
        Statics.field1731 = 0;
        Statics.field1752 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1435; var15++) {
            int var16 = var7.field1439[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1652[var16] == 0) {
                this.method2000(var8.field1652[var16], var8.field1650[var16], var7.field1437[var15], var7.field1441[var15], var7.field1442[var15]);
            }
        }
        this.field1718 = 0;
    }

    @ObfuscatedName("ch.y(I[IIII)V")
    public void method2000(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1738 = 0;
            Statics.field1731 = 0;
            Statics.field1752 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1710.length) {
                    int[] var10 = this.field1710[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1738 += this.field1691[var12];
                        Statics.field1731 += this.field1690[var12];
                        Statics.field1752 += this.field1727[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1738 = Statics.field1738 / var7 + arg2;
                Statics.field1731 = Statics.field1731 / var7 + arg3;
                Statics.field1752 = Statics.field1752 / var7 + arg4;
            } else {
                Statics.field1738 = arg2;
                Statics.field1731 = arg3;
                Statics.field1752 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1710.length) {
                    int[] var15 = this.field1710[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1691[var17] += arg2;
                        this.field1690[var17] += arg3;
                        this.field1727[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1710.length) {
                    int[] var20 = this.field1710[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1691[var22] -= Statics.field1738;
                        this.field1690[var22] -= Statics.field1731;
                        this.field1727[var22] -= Statics.field1752;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1696[var25];
                            int var27 = field1747[var25];
                            int var28 = this.field1691[var22] * var27 + this.field1690[var22] * var26 >> 16;
                            this.field1690[var22] = this.field1690[var22] * var27 - this.field1691[var22] * var26 >> 16;
                            this.field1691[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1696[var23];
                            int var30 = field1747[var23];
                            int var31 = this.field1690[var22] * var30 - this.field1727[var22] * var29 >> 16;
                            this.field1727[var22] = this.field1727[var22] * var30 + this.field1690[var22] * var29 >> 16;
                            this.field1690[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1696[var24];
                            int var33 = field1747[var24];
                            int var34 = this.field1727[var22] * var32 + this.field1691[var22] * var33 >> 16;
                            this.field1727[var22] = this.field1727[var22] * var33 - this.field1691[var22] * var32 >> 16;
                            this.field1691[var22] = var34;
                        }
                        this.field1691[var22] += Statics.field1738;
                        this.field1690[var22] += Statics.field1731;
                        this.field1727[var22] += Statics.field1752;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1710.length) {
                    int[] var37 = this.field1710[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1691[var39] -= Statics.field1738;
                        this.field1690[var39] -= Statics.field1731;
                        this.field1727[var39] -= Statics.field1752;
                        this.field1691[var39] = this.field1691[var39] * arg2 / 128;
                        this.field1690[var39] = this.field1690[var39] * arg3 / 128;
                        this.field1727[var39] = this.field1727[var39] * arg4 / 128;
                        this.field1691[var39] += Statics.field1738;
                        this.field1690[var39] += Statics.field1731;
                        this.field1727[var39] += Statics.field1752;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1711 != null && this.field1702 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1711.length) {
                    int[] var42 = this.field1711[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1702[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1702[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ch.d()V")
    public void method2011() {
        for (int var1 = 0; var1 < this.field1713; var1++) {
            int var2 = this.field1691[var1];
            this.field1691[var1] = this.field1727[var1];
            this.field1727[var1] = -var2;
        }
        this.field1718 = 0;
    }

    @ObfuscatedName("ch.b()V")
    public void method2007() {
        for (int var1 = 0; var1 < this.field1713; var1++) {
            this.field1691[var1] = -this.field1691[var1];
            this.field1727[var1] = -this.field1727[var1];
        }
        this.field1718 = 0;
    }

    @ObfuscatedName("ch.j()V")
    public void method2003() {
        for (int var1 = 0; var1 < this.field1713; var1++) {
            int var2 = this.field1727[var1];
            this.field1727[var1] = this.field1691[var1];
            this.field1691[var1] = -var2;
        }
        this.field1718 = 0;
    }

    @ObfuscatedName("ch.f(I)V")
    public void method2004(int arg0) {
        int var2 = field1696[arg0];
        int var3 = field1747[arg0];
        for (int var4 = 0; var4 < this.field1713; var4++) {
            int var5 = this.field1690[var4] * var3 - this.field1727[var4] * var2 >> 16;
            this.field1727[var4] = this.field1727[var4] * var3 + this.field1690[var4] * var2 >> 16;
            this.field1690[var4] = var5;
        }
        this.field1718 = 0;
    }

    @ObfuscatedName("ch.w(III)V")
    public void method2026(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1713; var4++) {
            this.field1691[var4] += arg0;
            this.field1690[var4] += arg1;
            this.field1727[var4] += arg2;
        }
        this.field1718 = 0;
    }

    @ObfuscatedName("ch.z(III)V")
    public void method2006(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1713; var4++) {
            this.field1691[var4] = this.field1691[var4] * arg0 / 128;
            this.field1690[var4] = this.field1690[var4] * arg1 / 128;
            this.field1727[var4] = this.field1727[var4] * arg2 / 128;
        }
        this.field1718 = 0;
    }

    @ObfuscatedName("ch.x(IIIIIII)V")
    public final void method2012(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1728[0] = -1;
        if (this.field1718 != 2 && this.field1718 != 1) {
            this.method1996();
        }
        int var8 = Statics.field1457;
        int var9 = Statics.field1468;
        int var10 = field1696[arg0];
        int var11 = field1747[arg0];
        int var12 = field1696[arg1];
        int var13 = field1747[arg1];
        int var14 = field1696[arg2];
        int var15 = field1747[arg2];
        int var16 = field1696[arg3];
        int var17 = field1747[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1713; var19++) {
            int var20 = this.field1691[var19];
            int var21 = this.field1690[var19];
            int var22 = this.field1727[var19];
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
            field1723[var19] = var30 - var18;
            field1721[var19] = (var26 << 9) / var30 + var8;
            field1686[var19] = (var29 << 9) / var30 + var9;
            if (this.field1707 > 0) {
                field1735[var19] = var26;
                field1725[var19] = var29;
                field1726[var19] = var30;
            }
        }
        try {
            this.method2009(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ch.v(IIIIIIII)V")
    public final void method2008(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1728[0] = -1;
        if (this.field1718 != 2 && this.field1718 != 1) {
            this.method1996();
        }
        int var9 = Statics.field1457;
        int var10 = Statics.field1468;
        int var11 = field1696[arg0];
        int var12 = field1747[arg0];
        int var13 = field1696[arg1];
        int var14 = field1747[arg1];
        int var15 = field1696[arg2];
        int var16 = field1747[arg2];
        int var17 = field1696[arg3];
        int var18 = field1747[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1713; var20++) {
            int var21 = this.field1691[var20];
            int var22 = this.field1690[var20];
            int var23 = this.field1727[var20];
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
            field1723[var20] = var31 - var19;
            field1721[var20] = (var27 << 9) / arg7 + var9;
            field1686[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1707 > 0) {
                field1735[var20] = var27;
                field1725[var20] = var30;
                field1726[var20] = var31;
            }
        }
        try {
            this.method2009(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ch.ae(IIIIIIIII)V")
    public void method1611(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1728[0] = -1;
        if (this.field1718 != 1) {
            this.method1995();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1715 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1715 << 9;
        if (var15 / var13 >= Statics.field1472) {
            return;
        }
        int var16 = this.field1715 + var14 << 9;
        if (var16 / var13 <= Statics.field1471) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1715 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1473) {
            return;
        }
        int var20 = (this.field1355 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1474) {
            return;
        }
        int var22 = (this.field1355 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1707 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1698) {
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
            int var32 = field1742 - Statics.field1457;
            int var33 = field1743 - Statics.field1468;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1722) {
                    field1745[field1692++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1457;
        int var35 = Statics.field1468;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1696[arg0];
            var37 = field1747[arg0];
        }
        for (int var38 = 0; var38 < this.field1713; var38++) {
            int var39 = this.field1691[var38];
            int var40 = this.field1690[var38];
            int var41 = this.field1727[var38];
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
            field1723[var38] = var50 - var11;
            if (var50 >= 50) {
                field1721[var38] = (var46 << 9) / var50 + var34;
                field1686[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1721[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1735[var38] = var46;
                field1725[var38] = var49;
                field1726[var38] = var50;
            }
        }
        try {
            this.method2009(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("ch.i(ZZI)V")
    public final void method2009(boolean arg0, boolean arg1, int arg2) {
        if (this.field1701 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1701; var4++) {
            field1728[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1733; var5++) {
            if (this.field1700[var5] != -2) {
                int var6 = this.field1693[var5];
                int var7 = this.field1719[var5];
                int var8 = this.field1697[var5];
                int var9 = field1721[var6];
                int var10 = field1721[var7];
                int var11 = field1721[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1735[var6];
                    int var13 = field1735[var7];
                    int var14 = field1735[var8];
                    int var15 = field1725[var6];
                    int var16 = field1725[var7];
                    int var17 = field1725[var8];
                    int var18 = field1726[var6];
                    int var19 = field1726[var7];
                    int var20 = field1726[var8];
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
                        field1720[var5] = true;
                        int var30 = (field1723[var6] + field1723[var7] + field1723[var8]) / 3 + this.field1717;
                        field1729[var30][field1728[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2023(field1742, field1743, field1686[var6], field1686[var7], field1686[var8], var9, var10, var11)) {
                        field1745[field1692++] = arg2;
                        arg1 = false;
                    }
                    if ((field1686[var8] - field1686[var7]) * (var9 - var10) - (field1686[var6] - field1686[var7]) * (var11 - var10) > 0) {
                        field1720[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1476 && var10 <= Statics.field1476 && var11 <= Statics.field1476) {
                            field1695[var5] = false;
                        } else {
                            field1695[var5] = true;
                        }
                        int var31 = (field1723[var6] + field1723[var7] + field1723[var8]) / 3 + this.field1717;
                        field1729[var31][field1728[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1737 == null) {
            for (int var32 = this.field1701 - 1; var32 >= 0; var32--) {
                int var33 = field1728[var32];
                if (var33 > 0) {
                    int[] var34 = field1729[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2005(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1730[var36] = 0;
            field1734[var36] = 0;
        }
        for (int var37 = this.field1701 - 1; var37 >= 0; var37--) {
            int var38 = field1728[var37];
            if (var38 > 0) {
                int[] var39 = field1729[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1737[var41];
                    int var43 = field1730[var42]++;
                    field1712[var42][var43] = var41;
                    if (var42 < 10) {
                        field1734[var42] += var37;
                    } else if (var42 == 10) {
                        field1732[var43] = var37;
                    } else {
                        field1739[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1730[1] > 0 || field1730[2] > 0) {
            var44 = (field1734[1] + field1734[2]) / (field1730[1] + field1730[2]);
        }
        int var45 = 0;
        if (field1730[3] > 0 || field1730[4] > 0) {
            var45 = (field1734[3] + field1734[4]) / (field1730[3] + field1730[4]);
        }
        int var46 = 0;
        if (field1730[6] > 0 || field1730[8] > 0) {
            var46 = (field1734[6] + field1734[8]) / (field1730[6] + field1730[8]);
        }
        int var47 = 0;
        int var48 = field1730[10];
        int[] var49 = field1712[10];
        int[] var50 = field1732;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1730[11];
            var49 = field1712[11];
            var50 = field1739;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2005(var49[var47++]);
                if (var47 == var48 && field1712[11] != var49) {
                    var47 = 0;
                    var48 = field1730[11];
                    var49 = field1712[11];
                    var50 = field1739;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2005(var49[var47++]);
                if (var47 == var48 && field1712[11] != var49) {
                    var47 = 0;
                    var48 = field1730[11];
                    var49 = field1712[11];
                    var50 = field1739;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2005(var49[var47++]);
                if (var47 == var48 && field1712[11] != var49) {
                    var47 = 0;
                    var48 = field1730[11];
                    var49 = field1712[11];
                    var50 = field1739;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1730[var52];
            int[] var54 = field1712[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2005(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2005(var49[var47++]);
            if (var47 == var48 && field1712[11] != var49) {
                var47 = 0;
                var49 = field1712[11];
                var48 = field1730[11];
                var50 = field1739;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("ch.c(I)V")
    public final void method2005(int arg0) {
        if (field1720[arg0]) {
            this.method2020(arg0);
            return;
        }
        int var2 = this.field1693[arg0];
        int var3 = this.field1719[arg0];
        int var4 = this.field1697[arg0];
        class86.field1467 = field1695[arg0];
        if (this.field1702 == null) {
            class86.field1461 = 0;
        } else {
            class86.field1461 = this.field1702[arg0] & 0xFF;
        }
        if (this.field1704 != null && this.field1704[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1703 == null || this.field1703[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1703[arg0] & 0xFF;
                var6 = this.field1746[var5];
                var7 = this.field1708[var5];
                var8 = this.field1709[var5];
            }
            if (this.field1700[arg0] == -1) {
                class86.method1795(field1686[var2], field1686[var3], field1686[var4], field1721[var2], field1721[var3], field1721[var4], this.field1716[arg0], this.field1716[arg0], this.field1716[arg0], field1735[var6], field1735[var7], field1735[var8], field1725[var6], field1725[var7], field1725[var8], field1726[var6], field1726[var7], field1726[var8], this.field1704[arg0]);
            } else {
                class86.method1795(field1686[var2], field1686[var3], field1686[var4], field1721[var2], field1721[var3], field1721[var4], this.field1716[arg0], this.field1699[arg0], this.field1700[arg0], field1735[var6], field1735[var7], field1735[var8], field1725[var6], field1725[var7], field1725[var8], field1726[var6], field1726[var7], field1726[var8], this.field1704[arg0]);
            }
        } else if (this.field1700[arg0] == -1) {
            class86.method1799(field1686[var2], field1686[var3], field1686[var4], field1721[var2], field1721[var3], field1721[var4], field1694[this.field1716[arg0]]);
        } else {
            class86.method1797(field1686[var2], field1686[var3], field1686[var4], field1721[var2], field1721[var3], field1721[var4], this.field1716[arg0], this.field1699[arg0], this.field1700[arg0]);
        }
    }

    @ObfuscatedName("ch.r(I)V")
    public final void method2020(int arg0) {
        int var2 = Statics.field1457;
        int var3 = Statics.field1468;
        int var4 = 0;
        int var5 = this.field1693[arg0];
        int var6 = this.field1719[arg0];
        int var7 = this.field1697[arg0];
        int var8 = field1726[var5];
        int var9 = field1726[var6];
        int var10 = field1726[var7];
        if (this.field1702 == null) {
            class86.field1461 = 0;
        } else {
            class86.field1461 = this.field1702[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1741[var4] = field1721[var5];
            field1736[var4] = field1686[var5];
            field1744[var4++] = this.field1716[arg0];
        } else {
            int var11 = field1735[var5];
            int var12 = field1725[var5];
            int var13 = this.field1716[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1749[var10 - var8];
                field1741[var4] = (((field1735[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1736[var4] = (((field1725[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1744[var4++] = ((this.field1700[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1749[var9 - var8];
                field1741[var4] = (((field1735[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1736[var4] = (((field1725[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1744[var4++] = ((this.field1699[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1741[var4] = field1721[var6];
            field1736[var4] = field1686[var6];
            field1744[var4++] = this.field1699[arg0];
        } else {
            int var16 = field1735[var6];
            int var17 = field1725[var6];
            int var18 = this.field1699[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1749[var8 - var9];
                field1741[var4] = (((field1735[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1736[var4] = (((field1725[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1744[var4++] = ((this.field1716[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1749[var10 - var9];
                field1741[var4] = (((field1735[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1736[var4] = (((field1725[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1744[var4++] = ((this.field1700[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1741[var4] = field1721[var7];
            field1736[var4] = field1686[var7];
            field1744[var4++] = this.field1700[arg0];
        } else {
            int var21 = field1735[var7];
            int var22 = field1725[var7];
            int var23 = this.field1700[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1749[var9 - var10];
                field1741[var4] = (((field1735[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1736[var4] = (((field1725[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1744[var4++] = ((this.field1699[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1749[var8 - var10];
                field1741[var4] = (((field1735[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1736[var4] = (((field1725[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1744[var4++] = ((this.field1716[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1741[0];
        int var27 = field1741[1];
        int var28 = field1741[2];
        int var29 = field1736[0];
        int var30 = field1736[1];
        int var31 = field1736[2];
        class86.field1467 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1476 || var27 > Statics.field1476 || var28 > Statics.field1476) {
                class86.field1467 = true;
            }
            if (this.field1704 != null && this.field1704[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1703 == null || this.field1703[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1703[arg0] & 0xFF;
                    var33 = this.field1746[var32];
                    var34 = this.field1708[var32];
                    var35 = this.field1709[var32];
                }
                if (this.field1700[arg0] == -1) {
                    class86.method1795(var29, var30, var31, var26, var27, var28, this.field1716[arg0], this.field1716[arg0], this.field1716[arg0], field1735[var33], field1735[var34], field1735[var35], field1725[var33], field1725[var34], field1725[var35], field1726[var33], field1726[var34], field1726[var35], this.field1704[arg0]);
                } else {
                    class86.method1795(var29, var30, var31, var26, var27, var28, field1744[0], field1744[1], field1744[2], field1735[var33], field1735[var34], field1735[var35], field1725[var33], field1725[var34], field1725[var35], field1726[var33], field1726[var34], field1726[var35], this.field1704[arg0]);
                }
            } else if (this.field1700[arg0] == -1) {
                class86.method1799(var29, var30, var31, var26, var27, var28, field1694[this.field1716[arg0]]);
            } else {
                class86.method1797(var29, var30, var31, var26, var27, var28, field1744[0], field1744[1], field1744[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1476 || var27 > Statics.field1476 || var28 > Statics.field1476 || field1741[3] < 0 || field1741[3] > Statics.field1476) {
            class86.field1467 = true;
        }
        if (this.field1704 != null && this.field1704[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1703 == null || this.field1703[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1703[arg0] & 0xFF;
                var37 = this.field1746[var36];
                var38 = this.field1708[var36];
                var39 = this.field1709[var36];
            }
            short var40 = this.field1704[arg0];
            if (this.field1700[arg0] == -1) {
                class86.method1795(var29, var30, var31, var26, var27, var28, this.field1716[arg0], this.field1716[arg0], this.field1716[arg0], field1735[var37], field1735[var38], field1735[var39], field1725[var37], field1725[var38], field1725[var39], field1726[var37], field1726[var38], field1726[var39], var40);
                class86.method1795(var29, var31, field1736[3], var26, var28, field1741[3], this.field1716[arg0], this.field1716[arg0], this.field1716[arg0], field1735[var37], field1735[var38], field1735[var39], field1725[var37], field1725[var38], field1725[var39], field1726[var37], field1726[var38], field1726[var39], var40);
            } else {
                class86.method1795(var29, var30, var31, var26, var27, var28, field1744[0], field1744[1], field1744[2], field1735[var37], field1735[var38], field1735[var39], field1725[var37], field1725[var38], field1725[var39], field1726[var37], field1726[var38], field1726[var39], var40);
                class86.method1795(var29, var31, field1736[3], var26, var28, field1741[3], field1744[0], field1744[2], field1744[3], field1735[var37], field1735[var38], field1735[var39], field1725[var37], field1725[var38], field1725[var39], field1726[var37], field1726[var38], field1726[var39], var40);
            }
        } else if (this.field1700[arg0] == -1) {
            int var41 = field1694[this.field1716[arg0]];
            class86.method1799(var29, var30, var31, var26, var27, var28, var41);
            class86.method1799(var29, var31, field1736[3], var26, var28, field1741[3], var41);
        } else {
            class86.method1797(var29, var30, var31, var26, var27, var28, field1744[0], field1744[1], field1744[2]);
            class86.method1797(var29, var31, field1736[3], var26, var28, field1741[3], field1744[0], field1744[2], field1744[3]);
        }
    }

    @ObfuscatedName("ch.an(IIIIIIII)Z")
    public final boolean method2023(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
