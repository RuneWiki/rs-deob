package deob;

@ObfuscatedName("dr")
public class class128 extends class136 {

    @ObfuscatedName("dr.c")
    public static class128 field1703 = new class128();

    @ObfuscatedName("dr.x")
    public static byte[] field1639 = new byte[1];

    @ObfuscatedName("dr.t")
    public static class128 field1682 = new class128();

    @ObfuscatedName("dr.g")
    public static byte[] field1707 = new byte[1];

    @ObfuscatedName("dr.l")
    public int field1666 = 0;

    @ObfuscatedName("dr.u")
    public int[] field1643;

    @ObfuscatedName("dr.j")
    public int[] field1644;

    @ObfuscatedName("dr.v")
    public int[] field1645;

    @ObfuscatedName("dr.d")
    public int field1640 = 0;

    @ObfuscatedName("dr.z")
    public int[] field1647;

    @ObfuscatedName("dr.n")
    public int[] field1648;

    @ObfuscatedName("dr.h")
    public int[] field1685;

    @ObfuscatedName("dr.f")
    public int[] field1650;

    @ObfuscatedName("dr.s")
    public int[] field1651;

    @ObfuscatedName("dr.p")
    public int[] field1652;

    @ObfuscatedName("dr.e")
    public byte[] field1653;

    @ObfuscatedName("dr.i")
    public byte[] field1654;

    @ObfuscatedName("dr.q")
    public byte[] field1702;

    @ObfuscatedName("dr.y")
    public short[] field1663;

    @ObfuscatedName("dr.r")
    public byte field1657 = 0;

    @ObfuscatedName("dr.k")
    public int field1658 = 0;

    @ObfuscatedName("dr.w")
    public int[] field1659;

    @ObfuscatedName("dr.m")
    public int[] field1660;

    @ObfuscatedName("dr.o")
    public int[] field1661;

    @ObfuscatedName("dr.a")
    public int[][] field1662;

    @ObfuscatedName("dr.b")
    public int[][] field1683;

    @ObfuscatedName("dr.ag")
    public boolean field1664 = false;

    @ObfuscatedName("dr.at")
    public int field1665;

    @ObfuscatedName("dr.ao")
    public int field1701;

    @ObfuscatedName("dr.av")
    public int field1667;

    @ObfuscatedName("dr.an")
    public int field1668;

    @ObfuscatedName("dr.al")
    public int field1669;

    @ObfuscatedName("dr.as")
    public int field1680;

    @ObfuscatedName("dr.ad")
    public int field1671;

    @ObfuscatedName("dr.ap")
    public int field1672;

    @ObfuscatedName("dr.ax")
    public int field1641 = -1;

    @ObfuscatedName("dr.aj")
    public int field1674 = -1;

    @ObfuscatedName("dr.ab")
    public int field1675 = -1;

    @ObfuscatedName("dr.ak")
    public static boolean[] field1698 = new boolean[4700];

    @ObfuscatedName("dr.ay")
    public static boolean[] field1686 = new boolean[4700];

    @ObfuscatedName("dr.ae")
    public static int[] field1673 = new int[4700];

    @ObfuscatedName("dr.ah")
    public static int[] field1649 = new int[4700];

    @ObfuscatedName("dr.aa")
    public static int[] field1681 = new int[4700];

    @ObfuscatedName("dr.aq")
    public static int[] field1670 = new int[4700];

    @ObfuscatedName("dr.ar")
    public static int[] field1655 = new int[4700];

    @ObfuscatedName("dr.ac")
    public static int[] field1684 = new int[4700];

    @ObfuscatedName("dr.ai")
    public static int[] field1693 = new int[1600];

    @ObfuscatedName("dr.am")
    public static int[][] field1679 = new int[1600][512];

    @ObfuscatedName("dr.aw")
    public static int[] field1688 = new int[12];

    @ObfuscatedName("dr.au")
    public static int[][] field1689 = new int[12][2000];

    @ObfuscatedName("dr.bg")
    public static int[] field1690 = new int[2000];

    @ObfuscatedName("dr.bn")
    public static int[] field1691 = new int[2000];

    @ObfuscatedName("dr.bk")
    public static int[] field1692 = new int[12];

    @ObfuscatedName("dr.bp")
    public static int[] field1695 = new int[10];

    @ObfuscatedName("dr.bu")
    public static int[] field1694 = new int[10];

    @ObfuscatedName("dr.bi")
    public static int[] field1646 = new int[10];

    @ObfuscatedName("dr.bw")
    public static boolean field1699 = true;

    @ObfuscatedName("dr.bj")
    public static int[] field1697 = class131.field1752;

    @ObfuscatedName("dr.bd")
    public static int[] field1677 = class131.field1737;

    @ObfuscatedName("dr.by")
    public static int[] field1704 = class131.field1748;

    @ObfuscatedName("dr.bh")
    public static int[] field1705 = class131.field1753;

    public class128() {
    }

    public class128(class128[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1666 = 0;
        this.field1640 = 0;
        this.field1658 = 0;
        this.field1657 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class128 var8 = arg0[var7];
            if (var8 != null) {
                this.field1666 += var8.field1666;
                this.field1640 += var8.field1640;
                this.field1658 += var8.field1658;
                if (var8.field1653 == null) {
                    if (this.field1657 == -1) {
                        this.field1657 = var8.field1657;
                    }
                    if (this.field1657 != var8.field1657) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1654 != null;
                var5 |= var8.field1663 != null;
                var6 |= var8.field1702 != null;
            }
        }
        this.field1643 = new int[this.field1666];
        this.field1644 = new int[this.field1666];
        this.field1645 = new int[this.field1666];
        this.field1647 = new int[this.field1640];
        this.field1648 = new int[this.field1640];
        this.field1685 = new int[this.field1640];
        this.field1650 = new int[this.field1640];
        this.field1651 = new int[this.field1640];
        this.field1652 = new int[this.field1640];
        if (var3) {
            this.field1653 = new byte[this.field1640];
        }
        if (var4) {
            this.field1654 = new byte[this.field1640];
        }
        if (var5) {
            this.field1663 = new short[this.field1640];
        }
        if (var6) {
            this.field1702 = new byte[this.field1640];
        }
        if (this.field1658 > 0) {
            this.field1659 = new int[this.field1658];
            this.field1660 = new int[this.field1658];
            this.field1661 = new int[this.field1658];
        }
        this.field1666 = 0;
        this.field1640 = 0;
        this.field1658 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class128 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1640; var11++) {
                    this.field1647[this.field1640] = var10.field1647[var11] + this.field1666;
                    this.field1648[this.field1640] = var10.field1648[var11] + this.field1666;
                    this.field1685[this.field1640] = var10.field1685[var11] + this.field1666;
                    this.field1650[this.field1640] = var10.field1650[var11];
                    this.field1651[this.field1640] = var10.field1651[var11];
                    this.field1652[this.field1640] = var10.field1652[var11];
                    if (var3) {
                        if (var10.field1653 == null) {
                            this.field1653[this.field1640] = var10.field1657;
                        } else {
                            this.field1653[this.field1640] = var10.field1653[var11];
                        }
                    }
                    if (var4 && var10.field1654 != null) {
                        this.field1654[this.field1640] = var10.field1654[var11];
                    }
                    if (var5) {
                        if (var10.field1663 == null) {
                            this.field1663[this.field1640] = -1;
                        } else {
                            this.field1663[this.field1640] = var10.field1663[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1702 == null || var10.field1702[var11] == -1) {
                            this.field1702[this.field1640] = -1;
                        } else {
                            this.field1702[this.field1640] = (byte) (var10.field1702[var11] + this.field1658);
                        }
                    }
                    this.field1640++;
                }
                for (int var12 = 0; var12 < var10.field1658; var12++) {
                    this.field1659[this.field1658] = var10.field1659[var12] + this.field1666;
                    this.field1660[this.field1658] = var10.field1660[var12] + this.field1666;
                    this.field1661[this.field1658] = var10.field1661[var12] + this.field1666;
                    this.field1658++;
                }
                for (int var13 = 0; var13 < var10.field1666; var13++) {
                    this.field1643[this.field1666] = var10.field1643[var13];
                    this.field1644[this.field1666] = var10.field1644[var13];
                    this.field1645[this.field1666] = var10.field1645[var13];
                    this.field1666++;
                }
            }
        }
    }

    @ObfuscatedName("dr.c([[IIIIZI)Ldr;")
    public class128 method2654(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2635();
        int var7 = arg1 - this.field1667;
        int var8 = this.field1667 + arg1;
        int var9 = arg3 - this.field1667;
        int var10 = this.field1667 + arg3;
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
        class128 var15;
        if (arg4) {
            var15 = new class128();
            var15.field1666 = this.field1666;
            var15.field1640 = this.field1640;
            var15.field1658 = this.field1658;
            var15.field1643 = this.field1643;
            var15.field1645 = this.field1645;
            var15.field1647 = this.field1647;
            var15.field1648 = this.field1648;
            var15.field1685 = this.field1685;
            var15.field1650 = this.field1650;
            var15.field1651 = this.field1651;
            var15.field1652 = this.field1652;
            var15.field1653 = this.field1653;
            var15.field1654 = this.field1654;
            var15.field1702 = this.field1702;
            var15.field1663 = this.field1663;
            var15.field1657 = this.field1657;
            var15.field1659 = this.field1659;
            var15.field1660 = this.field1660;
            var15.field1661 = this.field1661;
            var15.field1662 = this.field1662;
            var15.field1683 = this.field1683;
            var15.field1664 = this.field1664;
            var15.field1644 = new int[var15.field1666];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1666; var16++) {
                int var17 = this.field1643[var16] + arg1;
                int var18 = this.field1645[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1644[var16] = this.field1644[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1666; var26++) {
                int var27 = (-this.field1644[var26] << 16) / this.field1837;
                if (var27 < arg5) {
                    int var28 = this.field1643[var26] + arg1;
                    int var29 = this.field1645[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1644[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1644[var26];
                }
            }
        }
        var15.method2672();
        return var15;
    }

    @ObfuscatedName("dr.x(Z)Ldr;")
    public class128 method2631(boolean arg0) {
        if (!arg0 && field1639.length < this.field1640) {
            field1639 = new byte[this.field1640 + 100];
        }
        return this.method2687(arg0, field1703, field1639);
    }

    @ObfuscatedName("dr.t(Z)Ldr;")
    public class128 method2667(boolean arg0) {
        if (!arg0 && field1707.length < this.field1640) {
            field1707 = new byte[this.field1640 + 100];
        }
        return this.method2687(arg0, field1682, field1707);
    }

    @ObfuscatedName("dr.g(ZLdr;[B)Ldr;")
    public class128 method2687(boolean arg0, class128 arg1, byte[] arg2) {
        arg1.field1666 = this.field1666;
        arg1.field1640 = this.field1640;
        arg1.field1658 = this.field1658;
        if (arg1.field1643 == null || arg1.field1643.length < this.field1666) {
            arg1.field1643 = new int[this.field1666 + 100];
            arg1.field1644 = new int[this.field1666 + 100];
            arg1.field1645 = new int[this.field1666 + 100];
        }
        for (int var4 = 0; var4 < this.field1666; var4++) {
            arg1.field1643[var4] = this.field1643[var4];
            arg1.field1644[var4] = this.field1644[var4];
            arg1.field1645[var4] = this.field1645[var4];
        }
        if (arg0) {
            arg1.field1654 = this.field1654;
        } else {
            arg1.field1654 = arg2;
            if (this.field1654 == null) {
                for (int var5 = 0; var5 < this.field1640; var5++) {
                    arg1.field1654[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1640; var6++) {
                    arg1.field1654[var6] = this.field1654[var6];
                }
            }
        }
        arg1.field1647 = this.field1647;
        arg1.field1648 = this.field1648;
        arg1.field1685 = this.field1685;
        arg1.field1650 = this.field1650;
        arg1.field1651 = this.field1651;
        arg1.field1652 = this.field1652;
        arg1.field1653 = this.field1653;
        arg1.field1702 = this.field1702;
        arg1.field1663 = this.field1663;
        arg1.field1657 = this.field1657;
        arg1.field1659 = this.field1659;
        arg1.field1660 = this.field1660;
        arg1.field1661 = this.field1661;
        arg1.field1662 = this.field1662;
        arg1.field1683 = this.field1683;
        arg1.field1664 = this.field1664;
        arg1.method2672();
        return arg1;
    }

    @ObfuscatedName("dr.l(I)V")
    public void method2649(int arg0) {
        if (this.field1641 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1677[arg0];
        int var9 = field1697[arg0];
        for (int var10 = 0; var10 < this.field1666; var10++) {
            int var11 = class131.method2774(this.field1643[var10], this.field1645[var10], var8, var9);
            int var12 = this.field1644[var10];
            int var13 = class131.method2775(this.field1643[var10], this.field1645[var10], var8, var9);
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
        this.field1680 = (var2 + var5) / 2;
        this.field1671 = (var3 + var6) / 2;
        this.field1672 = (var4 + var7) / 2;
        this.field1641 = (var5 - var2 + 1) / 2;
        this.field1674 = (var6 - var3 + 1) / 2;
        this.field1675 = (var7 - var4 + 1) / 2;
        if (this.field1641 < 32) {
            this.field1641 = 32;
        }
        if (this.field1675 < 32) {
            this.field1675 = 32;
        }
        if (this.field1664) {
            this.field1641 += 8;
            this.field1675 += 8;
        }
    }

    @ObfuscatedName("dr.u()V")
    public void method2635() {
        if (this.field1665 == 1) {
            return;
        }
        this.field1665 = 1;
        this.field1837 = 0;
        this.field1701 = 0;
        this.field1667 = 0;
        for (int var1 = 0; var1 < this.field1666; var1++) {
            int var2 = this.field1643[var1];
            int var3 = this.field1644[var1];
            int var4 = this.field1645[var1];
            if (-var3 > this.field1837) {
                this.field1837 = -var3;
            }
            if (var3 > this.field1701) {
                this.field1701 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1667) {
                this.field1667 = var5;
            }
        }
        this.field1667 = (int) (Math.sqrt((double) this.field1667) + 0.99D);
        this.field1669 = (int) (Math.sqrt((double) (this.field1837 * this.field1837 + this.field1667 * this.field1667)) + 0.99D);
        this.field1668 = this.field1669 + (int) (Math.sqrt((double) (this.field1701 * this.field1701 + this.field1667 * this.field1667)) + 0.99D);
    }

    @ObfuscatedName("dr.j()V")
    public void method2632() {
        if (this.field1665 == 2) {
            return;
        }
        this.field1665 = 2;
        this.field1667 = 0;
        for (int var1 = 0; var1 < this.field1666; var1++) {
            int var2 = this.field1643[var1];
            int var3 = this.field1644[var1];
            int var4 = this.field1645[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1667) {
                this.field1667 = var5;
            }
        }
        this.field1667 = (int) (Math.sqrt((double) this.field1667) + 0.99D);
        this.field1669 = this.field1667;
        this.field1668 = this.field1667 + this.field1667;
    }

    @ObfuscatedName("dr.v()I")
    public int method2643() {
        this.method2635();
        return this.field1667;
    }

    @ObfuscatedName("dr.z()V")
    public void method2672() {
        this.field1665 = 0;
        this.field1641 = -1;
    }

    @ObfuscatedName("dr.s(Lev;I)V")
    public void method2639(class139 arg0, int arg1) {
        if (this.field1662 == null || arg1 == -1) {
            return;
        }
        class126 var3 = arg0.field1861[arg1];
        class133 var4 = var3.field1607;
        Statics.field1696 = 0;
        Statics.field1706 = 0;
        Statics.field1638 = 0;
        for (int var5 = 0; var5 < var3.field1608; var5++) {
            int var6 = var3.field1606[var5];
            this.method2641(var4.field1763[var6], var4.field1764[var6], var3.field1610[var5], var3.field1611[var5], var3.field1612[var5]);
        }
        this.method2672();
    }

    @ObfuscatedName("dr.p(Lev;ILev;I[I)V")
    public void method2630(class139 arg0, int arg1, class139 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2639(arg0, arg1);
            return;
        }
        class126 var6 = arg0.field1861[arg1];
        class126 var7 = arg2.field1861[arg3];
        class133 var8 = var6.field1607;
        Statics.field1696 = 0;
        Statics.field1706 = 0;
        Statics.field1638 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1608; var11++) {
            int var12 = var6.field1606[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1763[var12] == 0) {
                this.method2641(var8.field1763[var12], var8.field1764[var12], var6.field1610[var11], var6.field1611[var11], var6.field1612[var11]);
            }
        }
        Statics.field1696 = 0;
        Statics.field1706 = 0;
        Statics.field1638 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1608; var15++) {
            int var16 = var7.field1606[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1763[var16] == 0) {
                this.method2641(var8.field1763[var16], var8.field1764[var16], var7.field1610[var15], var7.field1611[var15], var7.field1612[var15]);
            }
        }
        this.method2672();
    }

    @ObfuscatedName("dr.e(I[IIII)V")
    public void method2641(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1696 = 0;
            Statics.field1706 = 0;
            Statics.field1638 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1662.length) {
                    int[] var10 = this.field1662[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1696 += this.field1643[var12];
                        Statics.field1706 += this.field1644[var12];
                        Statics.field1638 += this.field1645[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1696 = Statics.field1696 / var7 + arg2;
                Statics.field1706 = Statics.field1706 / var7 + arg3;
                Statics.field1638 = Statics.field1638 / var7 + arg4;
            } else {
                Statics.field1696 = arg2;
                Statics.field1706 = arg3;
                Statics.field1638 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1662.length) {
                    int[] var15 = this.field1662[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1643[var17] += arg2;
                        this.field1644[var17] += arg3;
                        this.field1645[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1662.length) {
                    int[] var20 = this.field1662[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1643[var22] -= Statics.field1696;
                        this.field1644[var22] -= Statics.field1706;
                        this.field1645[var22] -= Statics.field1638;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1697[var25];
                            int var27 = field1677[var25];
                            int var28 = this.field1644[var22] * var26 + this.field1643[var22] * var27 >> 16;
                            this.field1644[var22] = this.field1644[var22] * var27 - this.field1643[var22] * var26 >> 16;
                            this.field1643[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1697[var23];
                            int var30 = field1677[var23];
                            int var31 = this.field1644[var22] * var30 - this.field1645[var22] * var29 >> 16;
                            this.field1645[var22] = this.field1645[var22] * var30 + this.field1644[var22] * var29 >> 16;
                            this.field1644[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1697[var24];
                            int var33 = field1677[var24];
                            int var34 = this.field1645[var22] * var32 + this.field1643[var22] * var33 >> 16;
                            this.field1645[var22] = this.field1645[var22] * var33 - this.field1643[var22] * var32 >> 16;
                            this.field1643[var22] = var34;
                        }
                        this.field1643[var22] += Statics.field1696;
                        this.field1644[var22] += Statics.field1706;
                        this.field1645[var22] += Statics.field1638;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1662.length) {
                    int[] var37 = this.field1662[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1643[var39] -= Statics.field1696;
                        this.field1644[var39] -= Statics.field1706;
                        this.field1645[var39] -= Statics.field1638;
                        this.field1643[var39] = this.field1643[var39] * arg2 / 128;
                        this.field1644[var39] = this.field1644[var39] * arg3 / 128;
                        this.field1645[var39] = this.field1645[var39] * arg4 / 128;
                        this.field1643[var39] += Statics.field1696;
                        this.field1644[var39] += Statics.field1706;
                        this.field1645[var39] += Statics.field1638;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1683 != null && this.field1654 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1683.length) {
                    int[] var42 = this.field1683[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1654[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1654[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dr.i()V")
    public void method2642() {
        for (int var1 = 0; var1 < this.field1666; var1++) {
            int var2 = this.field1643[var1];
            this.field1643[var1] = this.field1645[var1];
            this.field1645[var1] = -var2;
        }
        this.method2672();
    }

    @ObfuscatedName("dr.q()V")
    public void method2679() {
        for (int var1 = 0; var1 < this.field1666; var1++) {
            this.field1643[var1] = -this.field1643[var1];
            this.field1645[var1] = -this.field1645[var1];
        }
        this.method2672();
    }

    @ObfuscatedName("dr.r()V")
    public void method2678() {
        for (int var1 = 0; var1 < this.field1666; var1++) {
            int var2 = this.field1645[var1];
            this.field1645[var1] = this.field1643[var1];
            this.field1643[var1] = -var2;
        }
        this.method2672();
    }

    @ObfuscatedName("dr.k(I)V")
    public void method2645(int arg0) {
        int var2 = field1697[arg0];
        int var3 = field1677[arg0];
        for (int var4 = 0; var4 < this.field1666; var4++) {
            int var5 = this.field1644[var4] * var3 - this.field1645[var4] * var2 >> 16;
            this.field1645[var4] = this.field1645[var4] * var3 + this.field1644[var4] * var2 >> 16;
            this.field1644[var4] = var5;
        }
        this.method2672();
    }

    @ObfuscatedName("dr.w(III)V")
    public void method2664(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1666; var4++) {
            this.field1643[var4] += arg0;
            this.field1644[var4] += arg1;
            this.field1645[var4] += arg2;
        }
        this.method2672();
    }

    @ObfuscatedName("dr.m(III)V")
    public void method2647(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1666; var4++) {
            this.field1643[var4] = this.field1643[var4] * arg0 / 128;
            this.field1644[var4] = this.field1644[var4] * arg1 / 128;
            this.field1645[var4] = this.field1645[var4] * arg2 / 128;
        }
        this.method2672();
    }

    @ObfuscatedName("dr.o(IIIIIII)V")
    public final void method2648(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1693[0] = -1;
        if (this.field1665 != 2 && this.field1665 != 1) {
            this.method2632();
        }
        int var8 = Statics.field1739;
        int var9 = Statics.field1740;
        int var10 = field1697[arg0];
        int var11 = field1677[arg0];
        int var12 = field1697[arg1];
        int var13 = field1677[arg1];
        int var14 = field1697[arg2];
        int var15 = field1677[arg2];
        int var16 = field1697[arg3];
        int var17 = field1677[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1666; var19++) {
            int var20 = this.field1643[var19];
            int var21 = this.field1644[var19];
            int var22 = this.field1645[var19];
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
            field1681[var19] = var30 - var18;
            field1673[var19] = class131.field1738 * var26 / var30 + var8;
            field1649[var19] = class131.field1738 * var29 / var30 + var9;
            if (this.field1658 > 0) {
                field1670[var19] = var26;
                field1655[var19] = var29;
                field1684[var19] = var30;
            }
        }
        try {
            this.method2651(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dr.a(IIIIIIII)V")
    public final void method2715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1693[0] = -1;
        if (this.field1665 != 2 && this.field1665 != 1) {
            this.method2632();
        }
        int var9 = Statics.field1739;
        int var10 = Statics.field1740;
        int var11 = field1697[arg0];
        int var12 = field1677[arg0];
        int var13 = field1697[arg1];
        int var14 = field1677[arg1];
        int var15 = field1697[arg2];
        int var16 = field1677[arg2];
        int var17 = field1697[arg3];
        int var18 = field1677[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1666; var20++) {
            int var21 = this.field1643[var20];
            int var22 = this.field1644[var20];
            int var23 = this.field1645[var20];
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
            field1681[var20] = var31 - var19;
            field1673[var20] = class131.field1738 * var27 / arg7 + var9;
            field1649[var20] = class131.field1738 * var30 / arg7 + var10;
            if (this.field1658 > 0) {
                field1670[var20] = var27;
                field1655[var20] = var30;
                field1684[var20] = var31;
            }
        }
        try {
            this.method2651(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dr.cm(IIIIIIIIJ)V")
    public void method2650(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1693[0] = -1;
        if (this.field1665 != 1) {
            this.method2635();
        }
        this.method2649(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field1667 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field1667) * class131.field1738;
        if (var16 / var14 >= Statics.field1744) {
            return;
        }
        int var17 = (this.field1667 + var15) * class131.field1738;
        if (var17 / var14 <= Statics.field1728) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field1667 * arg1 >> 16;
        int var20 = (var18 + var19) * class131.field1738;
        if (var20 / var14 <= Statics.field1745) {
            return;
        }
        int var21 = (this.field1837 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class131.field1738;
        if (var22 / var14 >= Statics.field1746) {
            return;
        }
        int var23 = (this.field1837 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field1658 > 0;
        int var27 = class129.method2302();
        int var28 = class129.field1708;
        boolean var30 = class129.method973();
        boolean var31 = arg8 != 0L;
        if (var31) {
            boolean var32 = (int) (arg8 >>> 16 & 0x1L) == 1;
            var31 = !var32;
        }
        boolean var35 = false;
        if (var31 && var30) {
            boolean var36 = false;
            if (field1699) {
                boolean var38;
                if (class129.method973()) {
                    class129.method3799();
                    int var39 = this.field1680 + arg5;
                    int var40 = this.field1671 + arg6;
                    int var41 = this.field1672 + arg7;
                    int var42 = this.field1641;
                    int var43 = this.field1674;
                    int var44 = this.field1675;
                    int var45 = Statics.field1712 - var39;
                    int var46 = Statics.field3578 - var40;
                    int var47 = Statics.field2727 - var41;
                    if (Math.abs(var45) > Statics.field511 + var42) {
                        var38 = false;
                    } else if (Math.abs(var46) > Statics.field76 + var43) {
                        var38 = false;
                    } else if (Math.abs(var47) > Statics.field2725 + var44) {
                        var38 = false;
                    } else if (Math.abs(Statics.field1713 * var47 - Statics.field3080 * var46) > Statics.field76 * var44 + Statics.field2725 * var43) {
                        var38 = false;
                    } else if (Math.abs(Statics.field3080 * var45 - Statics.field21 * var47) > Statics.field511 * var44 + Statics.field2725 * var42) {
                        var38 = false;
                    } else if (Math.abs(Statics.field21 * var46 - Statics.field1713 * var45) > Statics.field76 * var42 + Statics.field511 * var43) {
                        var38 = false;
                    } else {
                        var38 = true;
                    }
                } else {
                    var38 = false;
                }
                var36 = var38;
            } else {
                int var48 = var12 - var13;
                if (var48 <= 50) {
                    var48 = 50;
                }
                int var49;
                int var50;
                if (var15 > 0) {
                    var49 = var16 / var14;
                    var50 = var17 / var48;
                } else {
                    var50 = var17 / var14;
                    var49 = var16 / var48;
                }
                int var51;
                int var52;
                if (var18 > 0) {
                    var51 = var22 / var14;
                    var52 = var20 / var48;
                } else {
                    var52 = var20 / var14;
                    var51 = var22 / var48;
                }
                int var53 = var27 - Statics.field1739;
                int var54 = var28 - Statics.field1740;
                if (var53 > var49 && var53 < var50 && var54 > var51 && var54 < var52) {
                    var36 = true;
                }
            }
            if (var36) {
                if (this.field1664) {
                    class129.method3627(arg8);
                } else {
                    var35 = true;
                }
            }
        }
        int var55 = Statics.field1739;
        int var56 = Statics.field1740;
        int var57 = 0;
        int var58 = 0;
        if (arg0 != 0) {
            var57 = field1697[arg0];
            var58 = field1677[arg0];
        }
        for (int var59 = 0; var59 < this.field1666; var59++) {
            int var60 = this.field1643[var59];
            int var61 = this.field1644[var59];
            int var62 = this.field1645[var59];
            if (arg0 != 0) {
                int var63 = var57 * var62 + var58 * var60 >> 16;
                var62 = var58 * var62 - var57 * var60 >> 16;
                var60 = var63;
            }
            int var64 = arg5 + var60;
            int var65 = arg6 + var61;
            int var66 = arg7 + var62;
            int var67 = arg3 * var66 + arg4 * var64 >> 16;
            int var68 = arg4 * var66 - arg3 * var64 >> 16;
            int var70 = arg2 * var65 - arg1 * var68 >> 16;
            int var71 = arg1 * var65 + arg2 * var68 >> 16;
            field1681[var59] = var71 - var12;
            if (var71 >= 50) {
                field1673[var59] = class131.field1738 * var67 / var71 + var55;
                field1649[var59] = class131.field1738 * var70 / var71 + var56;
            } else {
                field1673[var59] = -5000;
                var24 = true;
            }
            if (var26) {
                field1670[var59] = var67;
                field1655[var59] = var70;
                field1684[var59] = var71;
            }
        }
        try {
            this.method2651(var24, var35, this.field1664, arg8);
        } catch (Exception var74) {
        }
    }

    @ObfuscatedName("dr.b(ZZZJ)V")
    public final void method2651(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field1668 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field1668; var6++) {
            field1693[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field1640; var8++) {
            if (this.field1652[var8] != -2) {
                int var9 = this.field1647[var8];
                int var10 = this.field1648[var8];
                int var11 = this.field1685[var8];
                int var12 = field1673[var9];
                int var13 = field1673[var10];
                int var14 = field1673[var11];
                if (arg0 && (var12 == -5000 || var13 == -5000 || var14 == -5000)) {
                    int var15 = field1670[var9];
                    int var16 = field1670[var10];
                    int var17 = field1670[var11];
                    int var18 = field1655[var9];
                    int var19 = field1655[var10];
                    int var20 = field1655[var11];
                    int var21 = field1684[var9];
                    int var22 = field1684[var10];
                    int var23 = field1684[var11];
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
                        field1686[var8] = true;
                        int var33 = (field1681[var9] + field1681[var10] + field1681[var11]) / 3 + this.field1669;
                        field1679[var33][field1693[var33]++] = var8;
                    }
                } else {
                    if (arg1 && class129.method566(field1649[var9], field1649[var10], field1649[var11], var12, var13, var14, var7)) {
                        class129.method3627(arg3);
                        arg1 = false;
                    }
                    if ((field1649[var11] - field1649[var10]) * (var12 - var13) - (field1649[var9] - field1649[var10]) * (var14 - var13) > 0) {
                        field1686[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field1742 && var13 <= Statics.field1742 && var14 <= Statics.field1742) {
                            field1698[var8] = false;
                        } else {
                            field1698[var8] = true;
                        }
                        int var34 = (field1681[var9] + field1681[var10] + field1681[var11]) / 3 + this.field1669;
                        field1679[var34][field1693[var34]++] = var8;
                    }
                }
            }
        }
        if (this.field1653 == null) {
            for (int var35 = this.field1668 - 1; var35 >= 0; var35--) {
                int var36 = field1693[var35];
                if (var36 > 0) {
                    int[] var37 = field1679[var35];
                    for (int var38 = 0; var38 < var36; var38++) {
                        this.method2652(var37[var38]);
                    }
                }
            }
            return;
        }
        for (int var39 = 0; var39 < 12; var39++) {
            field1688[var39] = 0;
            field1692[var39] = 0;
        }
        for (int var40 = this.field1668 - 1; var40 >= 0; var40--) {
            int var41 = field1693[var40];
            if (var41 > 0) {
                int[] var42 = field1679[var40];
                for (int var43 = 0; var43 < var41; var43++) {
                    int var44 = var42[var43];
                    byte var45 = this.field1653[var44];
                    int var46 = field1688[var45]++;
                    field1689[var45][var46] = var44;
                    if (var45 < 10) {
                        field1692[var45] += var40;
                    } else if (var45 == 10) {
                        field1690[var46] = var40;
                    } else {
                        field1691[var46] = var40;
                    }
                }
            }
        }
        int var47 = 0;
        if (field1688[1] > 0 || field1688[2] > 0) {
            var47 = (field1692[1] + field1692[2]) / (field1688[1] + field1688[2]);
        }
        int var48 = 0;
        if (field1688[3] > 0 || field1688[4] > 0) {
            var48 = (field1692[3] + field1692[4]) / (field1688[3] + field1688[4]);
        }
        int var49 = 0;
        if (field1688[6] > 0 || field1688[8] > 0) {
            var49 = (field1692[6] + field1692[8]) / (field1688[6] + field1688[8]);
        }
        int var50 = 0;
        int var51 = field1688[10];
        int[] var52 = field1689[10];
        int[] var53 = field1690;
        if (var50 == var51) {
            var50 = 0;
            var51 = field1688[11];
            var52 = field1689[11];
            var53 = field1691;
        }
        int var54;
        if (var50 < var51) {
            var54 = var53[var50];
        } else {
            var54 = -1000;
        }
        for (int var55 = 0; var55 < 10; var55++) {
            while (var55 == 0 && var54 > var47) {
                this.method2652(var52[var50++]);
                if (var50 == var51 && field1689[11] != var52) {
                    var50 = 0;
                    var51 = field1688[11];
                    var52 = field1689[11];
                    var53 = field1691;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            while (var55 == 3 && var54 > var48) {
                this.method2652(var52[var50++]);
                if (var50 == var51 && field1689[11] != var52) {
                    var50 = 0;
                    var51 = field1688[11];
                    var52 = field1689[11];
                    var53 = field1691;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            while (var55 == 5 && var54 > var49) {
                this.method2652(var52[var50++]);
                if (var50 == var51 && field1689[11] != var52) {
                    var50 = 0;
                    var51 = field1688[11];
                    var52 = field1689[11];
                    var53 = field1691;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            int var56 = field1688[var55];
            int[] var57 = field1689[var55];
            for (int var58 = 0; var58 < var56; var58++) {
                this.method2652(var57[var58]);
            }
        }
        while (var54 != -1000) {
            this.method2652(var52[var50++]);
            if (var50 == var51 && field1689[11] != var52) {
                var50 = 0;
                var52 = field1689[11];
                var51 = field1688[11];
                var53 = field1691;
            }
            if (var50 < var51) {
                var54 = var53[var50];
            } else {
                var54 = -1000;
            }
        }
    }

    @ObfuscatedName("dr.ag(I)V")
    public final void method2652(int arg0) {
        if (field1686[arg0]) {
            this.method2653(arg0);
            return;
        }
        int var2 = this.field1647[arg0];
        int var3 = this.field1648[arg0];
        int var4 = this.field1685[arg0];
        class131.field1736 = field1698[arg0];
        if (this.field1654 == null) {
            class131.field1731 = 0;
        } else {
            class131.field1731 = this.field1654[arg0] & 0xFF;
        }
        if (this.field1663 != null && this.field1663[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1702 == null || this.field1702[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1702[arg0] & 0xFF;
                var6 = this.field1659[var5];
                var7 = this.field1660[var5];
                var8 = this.field1661[var5];
            }
            if (this.field1652[arg0] == -1) {
                class131.method2814(field1649[var2], field1649[var3], field1649[var4], field1673[var2], field1673[var3], field1673[var4], this.field1650[arg0], this.field1650[arg0], this.field1650[arg0], field1670[var6], field1670[var7], field1670[var8], field1655[var6], field1655[var7], field1655[var8], field1684[var6], field1684[var7], field1684[var8], this.field1663[arg0]);
            } else {
                class131.method2814(field1649[var2], field1649[var3], field1649[var4], field1673[var2], field1673[var3], field1673[var4], this.field1650[arg0], this.field1651[arg0], this.field1652[arg0], field1670[var6], field1670[var7], field1670[var8], field1655[var6], field1655[var7], field1655[var8], field1684[var6], field1684[var7], field1684[var8], this.field1663[arg0]);
            }
        } else if (this.field1652[arg0] == -1) {
            class131.method2784(field1649[var2], field1649[var3], field1649[var4], field1673[var2], field1673[var3], field1673[var4], field1704[this.field1650[arg0]]);
        } else {
            class131.method2765(field1649[var2], field1649[var3], field1649[var4], field1673[var2], field1673[var3], field1673[var4], this.field1650[arg0], this.field1651[arg0], this.field1652[arg0]);
        }
    }

    @ObfuscatedName("dr.at(I)V")
    public final void method2653(int arg0) {
        int var2 = Statics.field1739;
        int var3 = Statics.field1740;
        int var4 = 0;
        int var5 = this.field1647[arg0];
        int var6 = this.field1648[arg0];
        int var7 = this.field1685[arg0];
        int var8 = field1684[var5];
        int var9 = field1684[var6];
        int var10 = field1684[var7];
        if (this.field1654 == null) {
            class131.field1731 = 0;
        } else {
            class131.field1731 = this.field1654[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1695[var4] = field1673[var5];
            field1694[var4] = field1649[var5];
            field1646[var4++] = this.field1650[arg0];
        } else {
            int var11 = field1670[var5];
            int var12 = field1655[var5];
            int var13 = this.field1650[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1705[var10 - var8];
                field1695[var4] = (((field1670[var7] - var11) * var14 >> 16) + var11) * class131.field1738 / 50 + var2;
                field1694[var4] = (((field1655[var7] - var12) * var14 >> 16) + var12) * class131.field1738 / 50 + var3;
                field1646[var4++] = ((this.field1652[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1705[var9 - var8];
                field1695[var4] = (((field1670[var6] - var11) * var15 >> 16) + var11) * class131.field1738 / 50 + var2;
                field1694[var4] = (((field1655[var6] - var12) * var15 >> 16) + var12) * class131.field1738 / 50 + var3;
                field1646[var4++] = ((this.field1651[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1695[var4] = field1673[var6];
            field1694[var4] = field1649[var6];
            field1646[var4++] = this.field1651[arg0];
        } else {
            int var16 = field1670[var6];
            int var17 = field1655[var6];
            int var18 = this.field1651[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1705[var8 - var9];
                field1695[var4] = (((field1670[var5] - var16) * var19 >> 16) + var16) * class131.field1738 / 50 + var2;
                field1694[var4] = (((field1655[var5] - var17) * var19 >> 16) + var17) * class131.field1738 / 50 + var3;
                field1646[var4++] = ((this.field1650[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1705[var10 - var9];
                field1695[var4] = (((field1670[var7] - var16) * var20 >> 16) + var16) * class131.field1738 / 50 + var2;
                field1694[var4] = (((field1655[var7] - var17) * var20 >> 16) + var17) * class131.field1738 / 50 + var3;
                field1646[var4++] = ((this.field1652[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1695[var4] = field1673[var7];
            field1694[var4] = field1649[var7];
            field1646[var4++] = this.field1652[arg0];
        } else {
            int var21 = field1670[var7];
            int var22 = field1655[var7];
            int var23 = this.field1652[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1705[var9 - var10];
                field1695[var4] = (((field1670[var6] - var21) * var24 >> 16) + var21) * class131.field1738 / 50 + var2;
                field1694[var4] = (((field1655[var6] - var22) * var24 >> 16) + var22) * class131.field1738 / 50 + var3;
                field1646[var4++] = ((this.field1651[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1705[var8 - var10];
                field1695[var4] = (((field1670[var5] - var21) * var25 >> 16) + var21) * class131.field1738 / 50 + var2;
                field1694[var4] = (((field1655[var5] - var22) * var25 >> 16) + var22) * class131.field1738 / 50 + var3;
                field1646[var4++] = ((this.field1650[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1695[0];
        int var27 = field1695[1];
        int var28 = field1695[2];
        int var29 = field1694[0];
        int var30 = field1694[1];
        int var31 = field1694[2];
        class131.field1736 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1742 || var27 > Statics.field1742 || var28 > Statics.field1742) {
                class131.field1736 = true;
            }
            if (this.field1663 != null && this.field1663[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1702 == null || this.field1702[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1702[arg0] & 0xFF;
                    var33 = this.field1659[var32];
                    var34 = this.field1660[var32];
                    var35 = this.field1661[var32];
                }
                if (this.field1652[arg0] == -1) {
                    class131.method2814(var29, var30, var31, var26, var27, var28, this.field1650[arg0], this.field1650[arg0], this.field1650[arg0], field1670[var33], field1670[var34], field1670[var35], field1655[var33], field1655[var34], field1655[var35], field1684[var33], field1684[var34], field1684[var35], this.field1663[arg0]);
                } else {
                    class131.method2814(var29, var30, var31, var26, var27, var28, field1646[0], field1646[1], field1646[2], field1670[var33], field1670[var34], field1670[var35], field1655[var33], field1655[var34], field1655[var35], field1684[var33], field1684[var34], field1684[var35], this.field1663[arg0]);
                }
            } else if (this.field1652[arg0] == -1) {
                class131.method2784(var29, var30, var31, var26, var27, var28, field1704[this.field1650[arg0]]);
            } else {
                class131.method2765(var29, var30, var31, var26, var27, var28, field1646[0], field1646[1], field1646[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1742 || var27 > Statics.field1742 || var28 > Statics.field1742 || field1695[3] < 0 || field1695[3] > Statics.field1742) {
            class131.field1736 = true;
        }
        if (this.field1663 != null && this.field1663[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1702 == null || this.field1702[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1702[arg0] & 0xFF;
                var37 = this.field1659[var36];
                var38 = this.field1660[var36];
                var39 = this.field1661[var36];
            }
            short var40 = this.field1663[arg0];
            if (this.field1652[arg0] == -1) {
                class131.method2814(var29, var30, var31, var26, var27, var28, this.field1650[arg0], this.field1650[arg0], this.field1650[arg0], field1670[var37], field1670[var38], field1670[var39], field1655[var37], field1655[var38], field1655[var39], field1684[var37], field1684[var38], field1684[var39], var40);
                class131.method2814(var29, var31, field1694[3], var26, var28, field1695[3], this.field1650[arg0], this.field1650[arg0], this.field1650[arg0], field1670[var37], field1670[var38], field1670[var39], field1655[var37], field1655[var38], field1655[var39], field1684[var37], field1684[var38], field1684[var39], var40);
            } else {
                class131.method2814(var29, var30, var31, var26, var27, var28, field1646[0], field1646[1], field1646[2], field1670[var37], field1670[var38], field1670[var39], field1655[var37], field1655[var38], field1655[var39], field1684[var37], field1684[var38], field1684[var39], var40);
                class131.method2814(var29, var31, field1694[3], var26, var28, field1695[3], field1646[0], field1646[2], field1646[3], field1670[var37], field1670[var38], field1670[var39], field1655[var37], field1655[var38], field1655[var39], field1684[var37], field1684[var38], field1684[var39], var40);
            }
        } else if (this.field1652[arg0] == -1) {
            int var41 = field1704[this.field1650[arg0]];
            class131.method2784(var29, var30, var31, var26, var27, var28, var41);
            class131.method2784(var29, var31, field1694[3], var26, var28, field1695[3], var41);
        } else {
            class131.method2765(var29, var30, var31, var26, var27, var28, field1646[0], field1646[1], field1646[2]);
            class131.method2765(var29, var31, field1694[3], var26, var28, field1695[3], field1646[0], field1646[2], field1646[3]);
        }
    }
}
