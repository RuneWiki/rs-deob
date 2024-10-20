package deob;

@ObfuscatedName("ds")
public class class122 extends class130 {

    @ObfuscatedName("ds.f")
    public static class122 field1671 = new class122();

    @ObfuscatedName("ds.h")
    public static byte[] field1623 = new byte[1];

    @ObfuscatedName("ds.e")
    public static class122 field1624 = new class122();

    @ObfuscatedName("ds.b")
    public static byte[] field1652 = new byte[1];

    @ObfuscatedName("ds.l")
    public int field1626 = 0;

    @ObfuscatedName("ds.w")
    public int[] field1627;

    @ObfuscatedName("ds.d")
    public int[] field1628;

    @ObfuscatedName("ds.n")
    public int[] field1643;

    @ObfuscatedName("ds.s")
    public int field1625 = 0;

    @ObfuscatedName("ds.g")
    public int[] field1658;

    @ObfuscatedName("ds.a")
    public int[] field1632;

    @ObfuscatedName("ds.r")
    public int[] field1633;

    @ObfuscatedName("ds.k")
    public int[] field1634;

    @ObfuscatedName("ds.m")
    public int[] field1631;

    @ObfuscatedName("ds.q")
    public int[] field1663;

    @ObfuscatedName("ds.x")
    public byte[] field1637;

    @ObfuscatedName("ds.u")
    public byte[] field1638;

    @ObfuscatedName("ds.o")
    public byte[] field1640;

    @ObfuscatedName("ds.t")
    public short[] field1654;

    @ObfuscatedName("ds.v")
    public byte field1641 = 0;

    @ObfuscatedName("ds.p")
    public int field1648 = 0;

    @ObfuscatedName("ds.z")
    public int[] field1629;

    @ObfuscatedName("ds.j")
    public int[] field1644;

    @ObfuscatedName("ds.i")
    public int[] field1645;

    @ObfuscatedName("ds.c")
    public int[][] field1646;

    @ObfuscatedName("ds.y")
    public int[][] field1647;

    @ObfuscatedName("ds.av")
    public boolean field1642 = false;

    @ObfuscatedName("ds.as")
    public int field1649;

    @ObfuscatedName("ds.al")
    public int field1650;

    @ObfuscatedName("ds.ax")
    public int field1651;

    @ObfuscatedName("ds.ay")
    public int field1672;

    @ObfuscatedName("ds.aa")
    public int field1653;

    @ObfuscatedName("ds.ag")
    public int field1622;

    @ObfuscatedName("ds.aj")
    public int field1655;

    @ObfuscatedName("ds.an")
    public int field1656;

    @ObfuscatedName("ds.ap")
    public int field1657 = -1;

    @ObfuscatedName("ds.am")
    public int field1630 = -1;

    @ObfuscatedName("ds.ae")
    public int field1659 = -1;

    @ObfuscatedName("ds.ah")
    public static boolean[] field1661 = new boolean[4700];

    @ObfuscatedName("ds.aq")
    public static boolean[] field1662 = new boolean[4700];

    @ObfuscatedName("ds.af")
    public static int[] field1635 = new int[4700];

    @ObfuscatedName("ds.ab")
    public static int[] field1664 = new int[4700];

    @ObfuscatedName("ds.ar")
    public static int[] field1660 = new int[4700];

    @ObfuscatedName("ds.ao")
    public static int[] field1666 = new int[4700];

    @ObfuscatedName("ds.at")
    public static int[] field1667 = new int[4700];

    @ObfuscatedName("ds.ad")
    public static int[] field1665 = new int[4700];

    @ObfuscatedName("ds.ak")
    public static int[] field1670 = new int[1600];

    @ObfuscatedName("ds.au")
    public static int[][] field1636 = new int[1600][512];

    @ObfuscatedName("ds.az")
    public static int[] field1639 = new int[12];

    @ObfuscatedName("ds.aw")
    public static int[][] field1673 = new int[12][2000];

    @ObfuscatedName("ds.bv")
    public static int[] field1674 = new int[2000];

    @ObfuscatedName("ds.bh")
    public static int[] field1675 = new int[2000];

    @ObfuscatedName("ds.bq")
    public static int[] field1668 = new int[12];

    @ObfuscatedName("ds.bm")
    public static int[] field1677 = new int[10];

    @ObfuscatedName("ds.bw")
    public static int[] field1678 = new int[10];

    @ObfuscatedName("ds.bi")
    public static int[] field1679 = new int[10];

    @ObfuscatedName("ds.bo")
    public static boolean field1683 = true;

    @ObfuscatedName("ds.bn")
    public static int[] field1686 = class125.field1742;

    @ObfuscatedName("ds.be")
    public static int[] field1687 = class125.field1743;

    @ObfuscatedName("ds.bs")
    public static int[] field1688 = class125.field1741;

    @ObfuscatedName("ds.bc")
    public static int[] field1689 = class125.field1736;

    public class122() {
    }

    public class122(class122[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1626 = 0;
        this.field1625 = 0;
        this.field1648 = 0;
        this.field1641 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class122 var8 = arg0[var7];
            if (var8 != null) {
                this.field1626 += var8.field1626;
                this.field1625 += var8.field1625;
                this.field1648 += var8.field1648;
                if (var8.field1637 == null) {
                    if (this.field1641 == -1) {
                        this.field1641 = var8.field1641;
                    }
                    if (this.field1641 != var8.field1641) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1638 != null;
                var5 |= var8.field1654 != null;
                var6 |= var8.field1640 != null;
            }
        }
        this.field1627 = new int[this.field1626];
        this.field1628 = new int[this.field1626];
        this.field1643 = new int[this.field1626];
        this.field1658 = new int[this.field1625];
        this.field1632 = new int[this.field1625];
        this.field1633 = new int[this.field1625];
        this.field1634 = new int[this.field1625];
        this.field1631 = new int[this.field1625];
        this.field1663 = new int[this.field1625];
        if (var3) {
            this.field1637 = new byte[this.field1625];
        }
        if (var4) {
            this.field1638 = new byte[this.field1625];
        }
        if (var5) {
            this.field1654 = new short[this.field1625];
        }
        if (var6) {
            this.field1640 = new byte[this.field1625];
        }
        if (this.field1648 > 0) {
            this.field1629 = new int[this.field1648];
            this.field1644 = new int[this.field1648];
            this.field1645 = new int[this.field1648];
        }
        this.field1626 = 0;
        this.field1625 = 0;
        this.field1648 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class122 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1625; var11++) {
                    this.field1658[this.field1625] = var10.field1658[var11] + this.field1626;
                    this.field1632[this.field1625] = var10.field1632[var11] + this.field1626;
                    this.field1633[this.field1625] = var10.field1633[var11] + this.field1626;
                    this.field1634[this.field1625] = var10.field1634[var11];
                    this.field1631[this.field1625] = var10.field1631[var11];
                    this.field1663[this.field1625] = var10.field1663[var11];
                    if (var3) {
                        if (var10.field1637 == null) {
                            this.field1637[this.field1625] = var10.field1641;
                        } else {
                            this.field1637[this.field1625] = var10.field1637[var11];
                        }
                    }
                    if (var4 && var10.field1638 != null) {
                        this.field1638[this.field1625] = var10.field1638[var11];
                    }
                    if (var5) {
                        if (var10.field1654 == null) {
                            this.field1654[this.field1625] = -1;
                        } else {
                            this.field1654[this.field1625] = var10.field1654[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1640 == null || var10.field1640[var11] == -1) {
                            this.field1640[this.field1625] = -1;
                        } else {
                            this.field1640[this.field1625] = (byte) (var10.field1640[var11] + this.field1648);
                        }
                    }
                    this.field1625++;
                }
                for (int var12 = 0; var12 < var10.field1648; var12++) {
                    this.field1629[this.field1648] = var10.field1629[var12] + this.field1626;
                    this.field1644[this.field1648] = var10.field1644[var12] + this.field1626;
                    this.field1645[this.field1648] = var10.field1645[var12] + this.field1626;
                    this.field1648++;
                }
                for (int var13 = 0; var13 < var10.field1626; var13++) {
                    this.field1627[this.field1626] = var10.field1627[var13];
                    this.field1628[this.field1626] = var10.field1628[var13];
                    this.field1643[this.field1626] = var10.field1643[var13];
                    this.field1626++;
                }
            }
        }
    }

    @ObfuscatedName("ds.f([[IIIIZI)Lds;")
    public class122 method2486(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2534();
        int var7 = arg1 - this.field1651;
        int var8 = this.field1651 + arg1;
        int var9 = arg3 - this.field1651;
        int var10 = this.field1651 + arg3;
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
        class122 var15;
        if (arg4) {
            var15 = new class122();
            var15.field1626 = this.field1626;
            var15.field1625 = this.field1625;
            var15.field1648 = this.field1648;
            var15.field1627 = this.field1627;
            var15.field1643 = this.field1643;
            var15.field1658 = this.field1658;
            var15.field1632 = this.field1632;
            var15.field1633 = this.field1633;
            var15.field1634 = this.field1634;
            var15.field1631 = this.field1631;
            var15.field1663 = this.field1663;
            var15.field1637 = this.field1637;
            var15.field1638 = this.field1638;
            var15.field1640 = this.field1640;
            var15.field1654 = this.field1654;
            var15.field1641 = this.field1641;
            var15.field1629 = this.field1629;
            var15.field1644 = this.field1644;
            var15.field1645 = this.field1645;
            var15.field1646 = this.field1646;
            var15.field1647 = this.field1647;
            var15.field1642 = this.field1642;
            var15.field1628 = new int[var15.field1626];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1626; var16++) {
                int var17 = this.field1627[var16] + arg1;
                int var18 = this.field1643[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1628[var16] = this.field1628[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1626; var26++) {
                int var27 = (-this.field1628[var26] << 16) / this.field1829;
                if (var27 < arg5) {
                    int var28 = this.field1627[var26] + arg1;
                    int var29 = this.field1643[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1628[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1628[var26];
                }
            }
        }
        var15.method2494();
        return var15;
    }

    @ObfuscatedName("ds.h(Z)Lds;")
    public class122 method2487(boolean arg0) {
        if (!arg0 && field1623.length < this.field1625) {
            field1623 = new byte[this.field1625 + 100];
        }
        return this.method2522(arg0, field1671, field1623);
    }

    @ObfuscatedName("ds.e(Z)Lds;")
    public class122 method2488(boolean arg0) {
        if (!arg0 && field1652.length < this.field1625) {
            field1652 = new byte[this.field1625 + 100];
        }
        return this.method2522(arg0, field1624, field1652);
    }

    @ObfuscatedName("ds.b(ZLds;[B)Lds;")
    public class122 method2522(boolean arg0, class122 arg1, byte[] arg2) {
        arg1.field1626 = this.field1626;
        arg1.field1625 = this.field1625;
        arg1.field1648 = this.field1648;
        if (arg1.field1627 == null || arg1.field1627.length < this.field1626) {
            arg1.field1627 = new int[this.field1626 + 100];
            arg1.field1628 = new int[this.field1626 + 100];
            arg1.field1643 = new int[this.field1626 + 100];
        }
        for (int var4 = 0; var4 < this.field1626; var4++) {
            arg1.field1627[var4] = this.field1627[var4];
            arg1.field1628[var4] = this.field1628[var4];
            arg1.field1643[var4] = this.field1643[var4];
        }
        if (arg0) {
            arg1.field1638 = this.field1638;
        } else {
            arg1.field1638 = arg2;
            if (this.field1638 == null) {
                for (int var5 = 0; var5 < this.field1625; var5++) {
                    arg1.field1638[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1625; var6++) {
                    arg1.field1638[var6] = this.field1638[var6];
                }
            }
        }
        arg1.field1658 = this.field1658;
        arg1.field1632 = this.field1632;
        arg1.field1633 = this.field1633;
        arg1.field1634 = this.field1634;
        arg1.field1631 = this.field1631;
        arg1.field1663 = this.field1663;
        arg1.field1637 = this.field1637;
        arg1.field1640 = this.field1640;
        arg1.field1654 = this.field1654;
        arg1.field1641 = this.field1641;
        arg1.field1629 = this.field1629;
        arg1.field1644 = this.field1644;
        arg1.field1645 = this.field1645;
        arg1.field1646 = this.field1646;
        arg1.field1647 = this.field1647;
        arg1.field1642 = this.field1642;
        arg1.method2494();
        return arg1;
    }

    @ObfuscatedName("ds.l(I)V")
    public void method2490(int arg0) {
        if (this.field1657 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1687[arg0];
        int var9 = field1686[arg0];
        for (int var10 = 0; var10 < this.field1626; var10++) {
            int var11 = class125.method2619(this.field1627[var10], this.field1643[var10], var8, var9);
            int var12 = this.field1628[var10];
            int var13 = class125.method2605(this.field1627[var10], this.field1643[var10], var8, var9);
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            if (var13 > var7) {
                var7 = var13;
            }
        }
        this.field1622 = (var2 + var5) / 2;
        this.field1655 = (var3 + var6) / 2;
        this.field1656 = (var4 + var7) / 2;
        this.field1657 = (var5 - var2 + 1) / 2;
        this.field1630 = (var6 - var3 + 1) / 2;
        this.field1659 = (var7 - var4 + 1) / 2;
        if (this.field1657 < 32) {
            this.field1657 = 32;
        }
        if (this.field1659 < 32) {
            this.field1659 = 32;
        }
        if (this.field1642) {
            this.field1657 += 8;
            this.field1659 += 8;
        }
    }

    @ObfuscatedName("ds.w()V")
    public void method2534() {
        if (this.field1649 == 1) {
            return;
        }
        this.field1649 = 1;
        this.field1829 = 0;
        this.field1650 = 0;
        this.field1651 = 0;
        for (int var1 = 0; var1 < this.field1626; var1++) {
            int var2 = this.field1627[var1];
            int var3 = this.field1628[var1];
            int var4 = this.field1643[var1];
            if (-var3 > this.field1829) {
                this.field1829 = -var3;
            }
            if (var3 > this.field1650) {
                this.field1650 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1651) {
                this.field1651 = var5;
            }
        }
        this.field1651 = (int) (Math.sqrt((double) this.field1651) + 0.99D);
        this.field1653 = (int) (Math.sqrt((double) (this.field1829 * this.field1829 + this.field1651 * this.field1651)) + 0.99D);
        this.field1672 = this.field1653 + (int) (Math.sqrt((double) (this.field1651 * this.field1651 + this.field1650 * this.field1650)) + 0.99D);
    }

    @ObfuscatedName("ds.d()V")
    public void method2492() {
        if (this.field1649 == 2) {
            return;
        }
        this.field1649 = 2;
        this.field1651 = 0;
        for (int var1 = 0; var1 < this.field1626; var1++) {
            int var2 = this.field1627[var1];
            int var3 = this.field1628[var1];
            int var4 = this.field1643[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1651) {
                this.field1651 = var5;
            }
        }
        this.field1651 = (int) (Math.sqrt((double) this.field1651) + 0.99D);
        this.field1653 = this.field1651;
        this.field1672 = this.field1651 + this.field1651;
    }

    @ObfuscatedName("ds.n()I")
    public int method2493() {
        this.method2534();
        return this.field1651;
    }

    @ObfuscatedName("ds.g()V")
    public void method2494() {
        this.field1649 = 0;
        this.field1657 = -1;
    }

    @ObfuscatedName("ds.k(Lev;I)V")
    public void method2495(class133 arg0, int arg1) {
        if (this.field1646 == null || arg1 == -1) {
            return;
        }
        class120 var3 = arg0.field1850[arg1];
        class127 var4 = var3.field1592;
        Statics.field1680 = 0;
        Statics.field1681 = 0;
        Statics.field1682 = 0;
        for (int var5 = 0; var5 < var3.field1593; var5++) {
            int var6 = var3.field1594[var5];
            this.method2497(var4.field1758[var6], var4.field1759[var6], var3.field1598[var5], var3.field1591[var5], var3.field1596[var5]);
        }
        this.method2494();
    }

    @ObfuscatedName("ds.m(Lev;ILev;I[I)V")
    public void method2555(class133 arg0, int arg1, class133 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2495(arg0, arg1);
            return;
        }
        class120 var6 = arg0.field1850[arg1];
        class120 var7 = arg2.field1850[arg3];
        class127 var8 = var6.field1592;
        Statics.field1680 = 0;
        Statics.field1681 = 0;
        Statics.field1682 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1593; var11++) {
            int var12 = var6.field1594[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1758[var12] == 0) {
                this.method2497(var8.field1758[var12], var8.field1759[var12], var6.field1598[var11], var6.field1591[var11], var6.field1596[var11]);
            }
        }
        Statics.field1680 = 0;
        Statics.field1681 = 0;
        Statics.field1682 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1593; var15++) {
            int var16 = var7.field1594[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1758[var16] == 0) {
                this.method2497(var8.field1758[var16], var8.field1759[var16], var7.field1598[var15], var7.field1591[var15], var7.field1596[var15]);
            }
        }
        this.method2494();
    }

    @ObfuscatedName("ds.q(I[IIII)V")
    public void method2497(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1680 = 0;
            Statics.field1681 = 0;
            Statics.field1682 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1646.length) {
                    int[] var10 = this.field1646[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1680 += this.field1627[var12];
                        Statics.field1681 += this.field1628[var12];
                        Statics.field1682 += this.field1643[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1680 = Statics.field1680 / var7 + arg2;
                Statics.field1681 = Statics.field1681 / var7 + arg3;
                Statics.field1682 = Statics.field1682 / var7 + arg4;
            } else {
                Statics.field1680 = arg2;
                Statics.field1681 = arg3;
                Statics.field1682 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1646.length) {
                    int[] var15 = this.field1646[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1627[var17] += arg2;
                        this.field1628[var17] += arg3;
                        this.field1643[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1646.length) {
                    int[] var20 = this.field1646[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1627[var22] -= Statics.field1680;
                        this.field1628[var22] -= Statics.field1681;
                        this.field1643[var22] -= Statics.field1682;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1686[var25];
                            int var27 = field1687[var25];
                            int var28 = this.field1628[var22] * var26 + this.field1627[var22] * var27 >> 16;
                            this.field1628[var22] = this.field1628[var22] * var27 - this.field1627[var22] * var26 >> 16;
                            this.field1627[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1686[var23];
                            int var30 = field1687[var23];
                            int var31 = this.field1628[var22] * var30 - this.field1643[var22] * var29 >> 16;
                            this.field1643[var22] = this.field1643[var22] * var30 + this.field1628[var22] * var29 >> 16;
                            this.field1628[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1686[var24];
                            int var33 = field1687[var24];
                            int var34 = this.field1643[var22] * var32 + this.field1627[var22] * var33 >> 16;
                            this.field1643[var22] = this.field1643[var22] * var33 - this.field1627[var22] * var32 >> 16;
                            this.field1627[var22] = var34;
                        }
                        this.field1627[var22] += Statics.field1680;
                        this.field1628[var22] += Statics.field1681;
                        this.field1643[var22] += Statics.field1682;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1646.length) {
                    int[] var37 = this.field1646[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1627[var39] -= Statics.field1680;
                        this.field1628[var39] -= Statics.field1681;
                        this.field1643[var39] -= Statics.field1682;
                        this.field1627[var39] = this.field1627[var39] * arg2 / 128;
                        this.field1628[var39] = this.field1628[var39] * arg3 / 128;
                        this.field1643[var39] = this.field1643[var39] * arg4 / 128;
                        this.field1627[var39] += Statics.field1680;
                        this.field1628[var39] += Statics.field1681;
                        this.field1643[var39] += Statics.field1682;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1647 != null && this.field1638 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1647.length) {
                    int[] var42 = this.field1647[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1638[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1638[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ds.x()V")
    public void method2499() {
        for (int var1 = 0; var1 < this.field1626; var1++) {
            int var2 = this.field1627[var1];
            this.field1627[var1] = this.field1643[var1];
            this.field1643[var1] = -var2;
        }
        this.method2494();
    }

    @ObfuscatedName("ds.u()V")
    public void method2498() {
        for (int var1 = 0; var1 < this.field1626; var1++) {
            this.field1627[var1] = -this.field1627[var1];
            this.field1643[var1] = -this.field1643[var1];
        }
        this.method2494();
    }

    @ObfuscatedName("ds.o()V")
    public void method2505() {
        for (int var1 = 0; var1 < this.field1626; var1++) {
            int var2 = this.field1643[var1];
            this.field1643[var1] = this.field1627[var1];
            this.field1627[var1] = -var2;
        }
        this.method2494();
    }

    @ObfuscatedName("ds.t(I)V")
    public void method2500(int arg0) {
        int var2 = field1686[arg0];
        int var3 = field1687[arg0];
        for (int var4 = 0; var4 < this.field1626; var4++) {
            int var5 = this.field1628[var4] * var3 - this.field1643[var4] * var2 >> 16;
            this.field1643[var4] = this.field1643[var4] * var3 + this.field1628[var4] * var2 >> 16;
            this.field1628[var4] = var5;
        }
        this.method2494();
    }

    @ObfuscatedName("ds.v(III)V")
    public void method2501(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1626; var4++) {
            this.field1627[var4] += arg0;
            this.field1628[var4] += arg1;
            this.field1643[var4] += arg2;
        }
        this.method2494();
    }

    @ObfuscatedName("ds.p(III)V")
    public void method2502(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1626; var4++) {
            this.field1627[var4] = this.field1627[var4] * arg0 / 128;
            this.field1628[var4] = this.field1628[var4] * arg1 / 128;
            this.field1643[var4] = this.field1643[var4] * arg2 / 128;
        }
        this.method2494();
    }

    @ObfuscatedName("ds.z(IIIIIII)V")
    public final void method2503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1670[0] = -1;
        if (this.field1649 != 2 && this.field1649 != 1) {
            this.method2492();
        }
        int var8 = Statics.field1725;
        int var9 = Statics.field1730;
        int var10 = field1686[arg0];
        int var11 = field1687[arg0];
        int var12 = field1686[arg1];
        int var13 = field1687[arg1];
        int var14 = field1686[arg2];
        int var15 = field1687[arg2];
        int var16 = field1686[arg3];
        int var17 = field1687[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1626; var19++) {
            int var20 = this.field1627[var19];
            int var21 = this.field1628[var19];
            int var22 = this.field1643[var19];
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
            field1660[var19] = var30 - var18;
            field1635[var19] = class125.field1717 * var26 / var30 + var8;
            field1664[var19] = class125.field1717 * var29 / var30 + var9;
            if (this.field1648 > 0) {
                field1666[var19] = var26;
                field1667[var19] = var29;
                field1665[var19] = var30;
            }
        }
        try {
            this.method2506(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ds.j(IIIIIIII)V")
    public final void method2560(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1670[0] = -1;
        if (this.field1649 != 2 && this.field1649 != 1) {
            this.method2492();
        }
        int var9 = Statics.field1725;
        int var10 = Statics.field1730;
        int var11 = field1686[arg0];
        int var12 = field1687[arg0];
        int var13 = field1686[arg1];
        int var14 = field1687[arg1];
        int var15 = field1686[arg2];
        int var16 = field1687[arg2];
        int var17 = field1686[arg3];
        int var18 = field1687[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1626; var20++) {
            int var21 = this.field1627[var20];
            int var22 = this.field1628[var20];
            int var23 = this.field1643[var20];
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
            field1660[var20] = var31 - var19;
            field1635[var20] = class125.field1717 * var27 / arg7 + var9;
            field1664[var20] = class125.field1717 * var30 / arg7 + var10;
            if (this.field1648 > 0) {
                field1666[var20] = var27;
                field1667[var20] = var30;
                field1665[var20] = var31;
            }
        }
        try {
            this.method2506(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ds.cj(IIIIIIIIJ)V")
    public void method2496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1670[0] = -1;
        if (this.field1649 != 1) {
            this.method2534();
        }
        this.method2490(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field1651 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field1651) * class125.field1717;
        if (var16 / var14 >= Statics.field1738) {
            return;
        }
        int var17 = (this.field1651 + var15) * class125.field1717;
        if (var17 / var14 <= Statics.field1733) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field1651 * arg1 >> 16;
        int var20 = (var18 + var19) * class125.field1717;
        if (var20 / var14 <= Statics.field1735) {
            return;
        }
        int var21 = (this.field1829 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class125.field1717;
        if (var22 / var14 >= Statics.field1724) {
            return;
        }
        int var23 = (this.field1829 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field1648 > 0;
        int var27 = class123.field1693;
        int var29 = class123.method122();
        boolean var30 = class123.field1702;
        boolean var32 = class123.method3556(arg8);
        boolean var33 = false;
        if (var32 && var30) {
            boolean var34 = false;
            if (field1683) {
                var34 = class123.method1015(this, arg5, arg6, arg7);
            } else {
                int var35 = var12 - var13;
                if (var35 <= 50) {
                    var35 = 50;
                }
                int var36;
                int var37;
                if (var15 > 0) {
                    var36 = var16 / var14;
                    var37 = var17 / var35;
                } else {
                    var37 = var17 / var14;
                    var36 = var16 / var35;
                }
                int var38;
                int var39;
                if (var18 > 0) {
                    var38 = var22 / var14;
                    var39 = var20 / var35;
                } else {
                    var39 = var20 / var14;
                    var38 = var22 / var35;
                }
                int var40 = var27 - Statics.field1725;
                int var41 = var29 - Statics.field1730;
                if (var40 > var36 && var40 < var37 && var41 > var38 && var41 < var39) {
                    var34 = true;
                }
            }
            if (var34) {
                if (this.field1642) {
                    class123.method1000(arg8);
                } else {
                    var33 = true;
                }
            }
        }
        int var42 = Statics.field1725;
        int var43 = Statics.field1730;
        int var44 = 0;
        int var45 = 0;
        if (arg0 != 0) {
            var44 = field1686[arg0];
            var45 = field1687[arg0];
        }
        for (int var46 = 0; var46 < this.field1626; var46++) {
            int var47 = this.field1627[var46];
            int var48 = this.field1628[var46];
            int var49 = this.field1643[var46];
            if (arg0 != 0) {
                int var50 = var44 * var49 + var45 * var47 >> 16;
                var49 = var45 * var49 - var44 * var47 >> 16;
                var47 = var50;
            }
            int var51 = arg5 + var47;
            int var52 = arg6 + var48;
            int var53 = arg7 + var49;
            int var54 = arg3 * var53 + arg4 * var51 >> 16;
            int var55 = arg4 * var53 - arg3 * var51 >> 16;
            int var57 = arg2 * var52 - arg1 * var55 >> 16;
            int var58 = arg1 * var52 + arg2 * var55 >> 16;
            field1660[var46] = var58 - var12;
            if (var58 >= 50) {
                field1635[var46] = class125.field1717 * var54 / var58 + var42;
                field1664[var46] = class125.field1717 * var57 / var58 + var43;
            } else {
                field1635[var46] = -5000;
                var24 = true;
            }
            if (var26) {
                field1666[var46] = var54;
                field1667[var46] = var57;
                field1665[var46] = var58;
            }
        }
        try {
            this.method2506(var24, var33, this.field1642, arg8);
        } catch (Exception var61) {
        }
    }

    @ObfuscatedName("ds.c(ZZZJ)V")
    public final void method2506(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field1672 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field1672; var6++) {
            field1670[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field1625; var8++) {
            if (this.field1663[var8] != -2) {
                int var9 = this.field1658[var8];
                int var10 = this.field1632[var8];
                int var11 = this.field1633[var8];
                int var12 = field1635[var9];
                int var13 = field1635[var10];
                int var14 = field1635[var11];
                if (arg0 && (var12 == -5000 || var13 == -5000 || var14 == -5000)) {
                    int var15 = field1666[var9];
                    int var16 = field1666[var10];
                    int var17 = field1666[var11];
                    int var18 = field1667[var9];
                    int var19 = field1667[var10];
                    int var20 = field1667[var11];
                    int var21 = field1665[var9];
                    int var22 = field1665[var10];
                    int var23 = field1665[var11];
                    int var24 = var15 - var16;
                    int var25 = var17 - var16;
                    int var26 = var18 - var19;
                    int var27 = var20 - var19;
                    int var28 = var21 - var22;
                    int var29 = var23 - var22;
                    int var30 = var26 * var29 - var27 * var28;
                    int var31 = var25 * var28 - var24 * var29;
                    int var32 = var24 * var27 - var25 * var26;
                    if (var22 * var32 + var16 * var30 + var19 * var31 > 0) {
                        field1662[var8] = true;
                        int var33 = (field1660[var9] + field1660[var10] + field1660[var11]) / 3 + this.field1653;
                        field1636[var33][field1670[var33]++] = var8;
                    }
                } else {
                    if (arg1 && class123.method3001(field1664[var9], field1664[var10], field1664[var11], var12, var13, var14, var7)) {
                        class123.method1000(arg3);
                        arg1 = false;
                    }
                    if ((field1664[var11] - field1664[var10]) * (var12 - var13) - (field1664[var9] - field1664[var10]) * (var14 - var13) > 0) {
                        field1662[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field1731 && var13 <= Statics.field1731 && var14 <= Statics.field1731) {
                            field1661[var8] = false;
                        } else {
                            field1661[var8] = true;
                        }
                        int var34 = (field1660[var9] + field1660[var10] + field1660[var11]) / 3 + this.field1653;
                        field1636[var34][field1670[var34]++] = var8;
                    }
                }
            }
        }
        if (this.field1637 == null) {
            for (int var35 = this.field1672 - 1; var35 >= 0; var35--) {
                int var36 = field1670[var35];
                if (var36 > 0) {
                    int[] var37 = field1636[var35];
                    for (int var38 = 0; var38 < var36; var38++) {
                        this.method2538(var37[var38]);
                    }
                }
            }
            return;
        }
        for (int var39 = 0; var39 < 12; var39++) {
            field1639[var39] = 0;
            field1668[var39] = 0;
        }
        for (int var40 = this.field1672 - 1; var40 >= 0; var40--) {
            int var41 = field1670[var40];
            if (var41 > 0) {
                int[] var42 = field1636[var40];
                for (int var43 = 0; var43 < var41; var43++) {
                    int var44 = var42[var43];
                    byte var45 = this.field1637[var44];
                    int var46 = field1639[var45]++;
                    field1673[var45][var46] = var44;
                    if (var45 < 10) {
                        field1668[var45] += var40;
                    } else if (var45 == 10) {
                        field1674[var46] = var40;
                    } else {
                        field1675[var46] = var40;
                    }
                }
            }
        }
        int var47 = 0;
        if (field1639[1] > 0 || field1639[2] > 0) {
            var47 = (field1668[1] + field1668[2]) / (field1639[1] + field1639[2]);
        }
        int var48 = 0;
        if (field1639[3] > 0 || field1639[4] > 0) {
            var48 = (field1668[3] + field1668[4]) / (field1639[3] + field1639[4]);
        }
        int var49 = 0;
        if (field1639[6] > 0 || field1639[8] > 0) {
            var49 = (field1668[6] + field1668[8]) / (field1639[6] + field1639[8]);
        }
        int var50 = 0;
        int var51 = field1639[10];
        int[] var52 = field1673[10];
        int[] var53 = field1674;
        if (var50 == var51) {
            var50 = 0;
            var51 = field1639[11];
            var52 = field1673[11];
            var53 = field1675;
        }
        int var54;
        if (var50 < var51) {
            var54 = var53[var50];
        } else {
            var54 = -1000;
        }
        for (int var55 = 0; var55 < 10; var55++) {
            while (var55 == 0 && var54 > var47) {
                this.method2538(var52[var50++]);
                if (var50 == var51 && field1673[11] != var52) {
                    var50 = 0;
                    var51 = field1639[11];
                    var52 = field1673[11];
                    var53 = field1675;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            while (var55 == 3 && var54 > var48) {
                this.method2538(var52[var50++]);
                if (var50 == var51 && field1673[11] != var52) {
                    var50 = 0;
                    var51 = field1639[11];
                    var52 = field1673[11];
                    var53 = field1675;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            while (var55 == 5 && var54 > var49) {
                this.method2538(var52[var50++]);
                if (var50 == var51 && field1673[11] != var52) {
                    var50 = 0;
                    var51 = field1639[11];
                    var52 = field1673[11];
                    var53 = field1675;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            int var56 = field1639[var55];
            int[] var57 = field1673[var55];
            for (int var58 = 0; var58 < var56; var58++) {
                this.method2538(var57[var58]);
            }
        }
        while (var54 != -1000) {
            this.method2538(var52[var50++]);
            if (var50 == var51 && field1673[11] != var52) {
                var50 = 0;
                var52 = field1673[11];
                var51 = field1639[11];
                var53 = field1675;
            }
            if (var50 < var51) {
                var54 = var53[var50];
            } else {
                var54 = -1000;
            }
        }
    }

    @ObfuscatedName("ds.av(I)V")
    public final void method2538(int arg0) {
        if (field1662[arg0]) {
            this.method2508(arg0);
            return;
        }
        int var2 = this.field1658[arg0];
        int var3 = this.field1632[arg0];
        int var4 = this.field1633[arg0];
        class125.field1728 = field1661[arg0];
        if (this.field1638 == null) {
            class125.field1721 = 0;
        } else {
            class125.field1721 = this.field1638[arg0] & 0xFF;
        }
        if (this.field1654 != null && this.field1654[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1640 == null || this.field1640[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1640[arg0] & 0xFF;
                var6 = this.field1629[var5];
                var7 = this.field1644[var5];
                var8 = this.field1645[var5];
            }
            if (this.field1663[arg0] == -1) {
                class125.method2614(field1664[var2], field1664[var3], field1664[var4], field1635[var2], field1635[var3], field1635[var4], this.field1634[arg0], this.field1634[arg0], this.field1634[arg0], field1666[var6], field1666[var7], field1666[var8], field1667[var6], field1667[var7], field1667[var8], field1665[var6], field1665[var7], field1665[var8], this.field1654[arg0]);
            } else {
                class125.method2614(field1664[var2], field1664[var3], field1664[var4], field1635[var2], field1635[var3], field1635[var4], this.field1634[arg0], this.field1631[arg0], this.field1663[arg0], field1666[var6], field1666[var7], field1666[var8], field1667[var6], field1667[var7], field1667[var8], field1665[var6], field1665[var7], field1665[var8], this.field1654[arg0]);
            }
        } else if (this.field1663[arg0] == -1) {
            class125.method2612(field1664[var2], field1664[var3], field1664[var4], field1635[var2], field1635[var3], field1635[var4], field1688[this.field1634[arg0]]);
        } else {
            class125.method2610(field1664[var2], field1664[var3], field1664[var4], field1635[var2], field1635[var3], field1635[var4], this.field1634[arg0], this.field1631[arg0], this.field1663[arg0]);
        }
    }

    @ObfuscatedName("ds.as(I)V")
    public final void method2508(int arg0) {
        int var2 = Statics.field1725;
        int var3 = Statics.field1730;
        int var4 = 0;
        int var5 = this.field1658[arg0];
        int var6 = this.field1632[arg0];
        int var7 = this.field1633[arg0];
        int var8 = field1665[var5];
        int var9 = field1665[var6];
        int var10 = field1665[var7];
        if (this.field1638 == null) {
            class125.field1721 = 0;
        } else {
            class125.field1721 = this.field1638[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1677[var4] = field1635[var5];
            field1678[var4] = field1664[var5];
            field1679[var4++] = this.field1634[arg0];
        } else {
            int var11 = field1666[var5];
            int var12 = field1667[var5];
            int var13 = this.field1634[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1689[var10 - var8];
                field1677[var4] = (((field1666[var7] - var11) * var14 >> 16) + var11) * class125.field1717 / 50 + var2;
                field1678[var4] = (((field1667[var7] - var12) * var14 >> 16) + var12) * class125.field1717 / 50 + var3;
                field1679[var4++] = ((this.field1663[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1689[var9 - var8];
                field1677[var4] = (((field1666[var6] - var11) * var15 >> 16) + var11) * class125.field1717 / 50 + var2;
                field1678[var4] = (((field1667[var6] - var12) * var15 >> 16) + var12) * class125.field1717 / 50 + var3;
                field1679[var4++] = ((this.field1631[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1677[var4] = field1635[var6];
            field1678[var4] = field1664[var6];
            field1679[var4++] = this.field1631[arg0];
        } else {
            int var16 = field1666[var6];
            int var17 = field1667[var6];
            int var18 = this.field1631[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1689[var8 - var9];
                field1677[var4] = (((field1666[var5] - var16) * var19 >> 16) + var16) * class125.field1717 / 50 + var2;
                field1678[var4] = (((field1667[var5] - var17) * var19 >> 16) + var17) * class125.field1717 / 50 + var3;
                field1679[var4++] = ((this.field1634[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1689[var10 - var9];
                field1677[var4] = (((field1666[var7] - var16) * var20 >> 16) + var16) * class125.field1717 / 50 + var2;
                field1678[var4] = (((field1667[var7] - var17) * var20 >> 16) + var17) * class125.field1717 / 50 + var3;
                field1679[var4++] = ((this.field1663[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1677[var4] = field1635[var7];
            field1678[var4] = field1664[var7];
            field1679[var4++] = this.field1663[arg0];
        } else {
            int var21 = field1666[var7];
            int var22 = field1667[var7];
            int var23 = this.field1663[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1689[var9 - var10];
                field1677[var4] = (((field1666[var6] - var21) * var24 >> 16) + var21) * class125.field1717 / 50 + var2;
                field1678[var4] = (((field1667[var6] - var22) * var24 >> 16) + var22) * class125.field1717 / 50 + var3;
                field1679[var4++] = ((this.field1631[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1689[var8 - var10];
                field1677[var4] = (((field1666[var5] - var21) * var25 >> 16) + var21) * class125.field1717 / 50 + var2;
                field1678[var4] = (((field1667[var5] - var22) * var25 >> 16) + var22) * class125.field1717 / 50 + var3;
                field1679[var4++] = ((this.field1634[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1677[0];
        int var27 = field1677[1];
        int var28 = field1677[2];
        int var29 = field1678[0];
        int var30 = field1678[1];
        int var31 = field1678[2];
        class125.field1728 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1731 || var27 > Statics.field1731 || var28 > Statics.field1731) {
                class125.field1728 = true;
            }
            if (this.field1654 != null && this.field1654[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1640 == null || this.field1640[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1640[arg0] & 0xFF;
                    var33 = this.field1629[var32];
                    var34 = this.field1644[var32];
                    var35 = this.field1645[var32];
                }
                if (this.field1663[arg0] == -1) {
                    class125.method2614(var29, var30, var31, var26, var27, var28, this.field1634[arg0], this.field1634[arg0], this.field1634[arg0], field1666[var33], field1666[var34], field1666[var35], field1667[var33], field1667[var34], field1667[var35], field1665[var33], field1665[var34], field1665[var35], this.field1654[arg0]);
                } else {
                    class125.method2614(var29, var30, var31, var26, var27, var28, field1679[0], field1679[1], field1679[2], field1666[var33], field1666[var34], field1666[var35], field1667[var33], field1667[var34], field1667[var35], field1665[var33], field1665[var34], field1665[var35], this.field1654[arg0]);
                }
            } else if (this.field1663[arg0] == -1) {
                class125.method2612(var29, var30, var31, var26, var27, var28, field1688[this.field1634[arg0]]);
            } else {
                class125.method2610(var29, var30, var31, var26, var27, var28, field1679[0], field1679[1], field1679[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1731 || var27 > Statics.field1731 || var28 > Statics.field1731 || field1677[3] < 0 || field1677[3] > Statics.field1731) {
            class125.field1728 = true;
        }
        if (this.field1654 != null && this.field1654[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1640 == null || this.field1640[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1640[arg0] & 0xFF;
                var37 = this.field1629[var36];
                var38 = this.field1644[var36];
                var39 = this.field1645[var36];
            }
            short var40 = this.field1654[arg0];
            if (this.field1663[arg0] == -1) {
                class125.method2614(var29, var30, var31, var26, var27, var28, this.field1634[arg0], this.field1634[arg0], this.field1634[arg0], field1666[var37], field1666[var38], field1666[var39], field1667[var37], field1667[var38], field1667[var39], field1665[var37], field1665[var38], field1665[var39], var40);
                class125.method2614(var29, var31, field1678[3], var26, var28, field1677[3], this.field1634[arg0], this.field1634[arg0], this.field1634[arg0], field1666[var37], field1666[var38], field1666[var39], field1667[var37], field1667[var38], field1667[var39], field1665[var37], field1665[var38], field1665[var39], var40);
            } else {
                class125.method2614(var29, var30, var31, var26, var27, var28, field1679[0], field1679[1], field1679[2], field1666[var37], field1666[var38], field1666[var39], field1667[var37], field1667[var38], field1667[var39], field1665[var37], field1665[var38], field1665[var39], var40);
                class125.method2614(var29, var31, field1678[3], var26, var28, field1677[3], field1679[0], field1679[2], field1679[3], field1666[var37], field1666[var38], field1666[var39], field1667[var37], field1667[var38], field1667[var39], field1665[var37], field1665[var38], field1665[var39], var40);
            }
        } else if (this.field1663[arg0] == -1) {
            int var41 = field1688[this.field1634[arg0]];
            class125.method2612(var29, var30, var31, var26, var27, var28, var41);
            class125.method2612(var29, var31, field1678[3], var26, var28, field1677[3], var41);
        } else {
            class125.method2610(var29, var30, var31, var26, var27, var28, field1679[0], field1679[1], field1679[2]);
            class125.method2610(var29, var31, field1678[3], var26, var28, field1677[3], field1679[0], field1679[2], field1679[3]);
        }
    }
}
