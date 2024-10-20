package deob;

@ObfuscatedName("dl")
public class class122 extends class130 {

    @ObfuscatedName("dl.g")
    public static class122 field1642 = new class122();

    @ObfuscatedName("dl.r")
    public static byte[] field1640 = new byte[1];

    @ObfuscatedName("dl.e")
    public static class122 field1641 = new class122();

    @ObfuscatedName("dl.q")
    public static byte[] field1676 = new byte[1];

    @ObfuscatedName("dl.c")
    public int field1664 = 0;

    @ObfuscatedName("dl.l")
    public int[] field1695;

    @ObfuscatedName("dl.b")
    public int[] field1655;

    @ObfuscatedName("dl.w")
    public int[] field1657;

    @ObfuscatedName("dl.n")
    public int field1647 = 0;

    @ObfuscatedName("dl.i")
    public int[] field1648;

    @ObfuscatedName("dl.p")
    public int[] field1649;

    @ObfuscatedName("dl.m")
    public int[] field1697;

    @ObfuscatedName("dl.d")
    public int[] field1651;

    @ObfuscatedName("dl.j")
    public int[] field1707;

    @ObfuscatedName("dl.x")
    public int[] field1669;

    @ObfuscatedName("dl.v")
    public byte[] field1654;

    @ObfuscatedName("dl.h")
    public byte[] field1643;

    @ObfuscatedName("dl.f")
    public byte[] field1656;

    @ObfuscatedName("dl.a")
    public short[] field1645;

    @ObfuscatedName("dl.t")
    public byte field1658 = 0;

    @ObfuscatedName("dl.k")
    public int field1685 = 0;

    @ObfuscatedName("dl.z")
    public int[] field1660;

    @ObfuscatedName("dl.s")
    public int[] field1661;

    @ObfuscatedName("dl.y")
    public int[] field1662;

    @ObfuscatedName("dl.u")
    public int[][] field1663;

    @ObfuscatedName("dl.o")
    public int[][] field1680;

    @ObfuscatedName("dl.af")
    public boolean field1665 = false;

    @ObfuscatedName("dl.an")
    public int field1666;

    @ObfuscatedName("dl.ax")
    public int field1667;

    @ObfuscatedName("dl.aw")
    public int field1668;

    @ObfuscatedName("dl.ae")
    public int field1650;

    @ObfuscatedName("dl.ac")
    public int field1670;

    @ObfuscatedName("dl.az")
    public int field1677;

    @ObfuscatedName("dl.aj")
    public int field1672;

    @ObfuscatedName("dl.ag")
    public int field1659;

    @ObfuscatedName("dl.ab")
    public int field1674 = -1;

    @ObfuscatedName("dl.ar")
    public int field1675 = -1;

    @ObfuscatedName("dl.at")
    public int field1692 = -1;

    @ObfuscatedName("dl.aa")
    public static boolean[] field1678 = new boolean[4700];

    @ObfuscatedName("dl.ai")
    public static boolean[] field1679 = new boolean[4700];

    @ObfuscatedName("dl.ad")
    public static int[] field1644 = new int[4700];

    @ObfuscatedName("dl.al")
    public static int[] field1681 = new int[4700];

    @ObfuscatedName("dl.ak")
    public static int[] field1682 = new int[4700];

    @ObfuscatedName("dl.ao")
    public static int[] field1683 = new int[4700];

    @ObfuscatedName("dl.am")
    public static int[] field1684 = new int[4700];

    @ObfuscatedName("dl.ay")
    public static int[] field1673 = new int[4700];

    @ObfuscatedName("dl.ap")
    public static int[] field1687 = new int[1600];

    @ObfuscatedName("dl.av")
    public static int[][] field1690 = new int[1600][512];

    @ObfuscatedName("dl.au")
    public static int[] field1689 = new int[12];

    @ObfuscatedName("dl.aq")
    public static int[][] field1671 = new int[12][2000];

    @ObfuscatedName("dl.bs")
    public static int[] field1691 = new int[2000];

    @ObfuscatedName("dl.bz")
    public static int[] field1653 = new int[2000];

    @ObfuscatedName("dl.ba")
    public static int[] field1693 = new int[12];

    @ObfuscatedName("dl.bi")
    public static int[] field1694 = new int[10];

    @ObfuscatedName("dl.bp")
    public static int[] field1699 = new int[10];

    @ObfuscatedName("dl.bv")
    public static int[] field1696 = new int[10];

    @ObfuscatedName("dl.bk")
    public static boolean field1700 = true;

    @ObfuscatedName("dl.bc")
    public static int[] field1703 = class125.field1748;

    @ObfuscatedName("dl.bg")
    public static int[] field1704 = class125.field1755;

    @ObfuscatedName("dl.be")
    public static int[] field1705 = class125.field1750;

    @ObfuscatedName("dl.bj")
    public static int[] field1706 = class125.field1745;

    public class122() {
    }

    public class122(class122[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1664 = 0;
        this.field1647 = 0;
        this.field1685 = 0;
        this.field1658 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class122 var8 = arg0[var7];
            if (var8 != null) {
                this.field1664 += var8.field1664;
                this.field1647 += var8.field1647;
                this.field1685 += var8.field1685;
                if (var8.field1654 == null) {
                    if (this.field1658 == -1) {
                        this.field1658 = var8.field1658;
                    }
                    if (this.field1658 != var8.field1658) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1643 != null;
                var5 |= var8.field1645 != null;
                var6 |= var8.field1656 != null;
            }
        }
        this.field1695 = new int[this.field1664];
        this.field1655 = new int[this.field1664];
        this.field1657 = new int[this.field1664];
        this.field1648 = new int[this.field1647];
        this.field1649 = new int[this.field1647];
        this.field1697 = new int[this.field1647];
        this.field1651 = new int[this.field1647];
        this.field1707 = new int[this.field1647];
        this.field1669 = new int[this.field1647];
        if (var3) {
            this.field1654 = new byte[this.field1647];
        }
        if (var4) {
            this.field1643 = new byte[this.field1647];
        }
        if (var5) {
            this.field1645 = new short[this.field1647];
        }
        if (var6) {
            this.field1656 = new byte[this.field1647];
        }
        if (this.field1685 > 0) {
            this.field1660 = new int[this.field1685];
            this.field1661 = new int[this.field1685];
            this.field1662 = new int[this.field1685];
        }
        this.field1664 = 0;
        this.field1647 = 0;
        this.field1685 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class122 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1647; var11++) {
                    this.field1648[this.field1647] = var10.field1648[var11] + this.field1664;
                    this.field1649[this.field1647] = var10.field1649[var11] + this.field1664;
                    this.field1697[this.field1647] = var10.field1697[var11] + this.field1664;
                    this.field1651[this.field1647] = var10.field1651[var11];
                    this.field1707[this.field1647] = var10.field1707[var11];
                    this.field1669[this.field1647] = var10.field1669[var11];
                    if (var3) {
                        if (var10.field1654 == null) {
                            this.field1654[this.field1647] = var10.field1658;
                        } else {
                            this.field1654[this.field1647] = var10.field1654[var11];
                        }
                    }
                    if (var4 && var10.field1643 != null) {
                        this.field1643[this.field1647] = var10.field1643[var11];
                    }
                    if (var5) {
                        if (var10.field1645 == null) {
                            this.field1645[this.field1647] = -1;
                        } else {
                            this.field1645[this.field1647] = var10.field1645[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1656 == null || var10.field1656[var11] == -1) {
                            this.field1656[this.field1647] = -1;
                        } else {
                            this.field1656[this.field1647] = (byte) (var10.field1656[var11] + this.field1685);
                        }
                    }
                    this.field1647++;
                }
                for (int var12 = 0; var12 < var10.field1685; var12++) {
                    this.field1660[this.field1685] = var10.field1660[var12] + this.field1664;
                    this.field1661[this.field1685] = var10.field1661[var12] + this.field1664;
                    this.field1662[this.field1685] = var10.field1662[var12] + this.field1664;
                    this.field1685++;
                }
                for (int var13 = 0; var13 < var10.field1664; var13++) {
                    this.field1695[this.field1664] = var10.field1695[var13];
                    this.field1655[this.field1664] = var10.field1655[var13];
                    this.field1657[this.field1664] = var10.field1657[var13];
                    this.field1664++;
                }
            }
        }
    }

    @ObfuscatedName("dl.g([[IIIIZI)Ldl;")
    public class122 method2666(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2671();
        int var7 = arg1 - this.field1668;
        int var8 = this.field1668 + arg1;
        int var9 = arg3 - this.field1668;
        int var10 = this.field1668 + arg3;
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
            var15.field1664 = this.field1664;
            var15.field1647 = this.field1647;
            var15.field1685 = this.field1685;
            var15.field1695 = this.field1695;
            var15.field1657 = this.field1657;
            var15.field1648 = this.field1648;
            var15.field1649 = this.field1649;
            var15.field1697 = this.field1697;
            var15.field1651 = this.field1651;
            var15.field1707 = this.field1707;
            var15.field1669 = this.field1669;
            var15.field1654 = this.field1654;
            var15.field1643 = this.field1643;
            var15.field1656 = this.field1656;
            var15.field1645 = this.field1645;
            var15.field1658 = this.field1658;
            var15.field1660 = this.field1660;
            var15.field1661 = this.field1661;
            var15.field1662 = this.field1662;
            var15.field1663 = this.field1663;
            var15.field1680 = this.field1680;
            var15.field1665 = this.field1665;
            var15.field1655 = new int[var15.field1664];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1664; var16++) {
                int var17 = this.field1695[var16] + arg1;
                int var18 = this.field1657[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1655[var16] = this.field1655[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1664; var26++) {
                int var27 = (-this.field1655[var26] << 16) / this.field1841;
                if (var27 < arg5) {
                    int var28 = this.field1695[var26] + arg1;
                    int var29 = this.field1657[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1655[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1655[var26];
                }
            }
        }
        var15.method2674();
        return var15;
    }

    @ObfuscatedName("dl.r(Z)Ldl;")
    public class122 method2667(boolean arg0) {
        if (!arg0 && field1640.length < this.field1647) {
            field1640 = new byte[this.field1647 + 100];
        }
        return this.method2669(arg0, field1642, field1640);
    }

    @ObfuscatedName("dl.e(Z)Ldl;")
    public class122 method2679(boolean arg0) {
        if (!arg0 && field1676.length < this.field1647) {
            field1676 = new byte[this.field1647 + 100];
        }
        return this.method2669(arg0, field1641, field1676);
    }

    @ObfuscatedName("dl.q(ZLdl;[B)Ldl;")
    public class122 method2669(boolean arg0, class122 arg1, byte[] arg2) {
        arg1.field1664 = this.field1664;
        arg1.field1647 = this.field1647;
        arg1.field1685 = this.field1685;
        if (arg1.field1695 == null || arg1.field1695.length < this.field1664) {
            arg1.field1695 = new int[this.field1664 + 100];
            arg1.field1655 = new int[this.field1664 + 100];
            arg1.field1657 = new int[this.field1664 + 100];
        }
        for (int var4 = 0; var4 < this.field1664; var4++) {
            arg1.field1695[var4] = this.field1695[var4];
            arg1.field1655[var4] = this.field1655[var4];
            arg1.field1657[var4] = this.field1657[var4];
        }
        if (arg0) {
            arg1.field1643 = this.field1643;
        } else {
            arg1.field1643 = arg2;
            if (this.field1643 == null) {
                for (int var5 = 0; var5 < this.field1647; var5++) {
                    arg1.field1643[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1647; var6++) {
                    arg1.field1643[var6] = this.field1643[var6];
                }
            }
        }
        arg1.field1648 = this.field1648;
        arg1.field1649 = this.field1649;
        arg1.field1697 = this.field1697;
        arg1.field1651 = this.field1651;
        arg1.field1707 = this.field1707;
        arg1.field1669 = this.field1669;
        arg1.field1654 = this.field1654;
        arg1.field1656 = this.field1656;
        arg1.field1645 = this.field1645;
        arg1.field1658 = this.field1658;
        arg1.field1660 = this.field1660;
        arg1.field1661 = this.field1661;
        arg1.field1662 = this.field1662;
        arg1.field1663 = this.field1663;
        arg1.field1680 = this.field1680;
        arg1.field1665 = this.field1665;
        arg1.method2674();
        return arg1;
    }

    @ObfuscatedName("dl.c(I)V")
    public void method2670(int arg0) {
        if (this.field1674 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1704[arg0];
        int var9 = field1703[arg0];
        for (int var10 = 0; var10 < this.field1664; var10++) {
            int var11 = class125.method2776(this.field1695[var10], this.field1657[var10], var8, var9);
            int var12 = this.field1655[var10];
            int var13 = class125.method2793(this.field1695[var10], this.field1657[var10], var8, var9);
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
        this.field1677 = (var2 + var5) / 2;
        this.field1672 = (var3 + var6) / 2;
        this.field1659 = (var4 + var7) / 2;
        this.field1674 = (var5 - var2 + 1) / 2;
        this.field1675 = (var6 - var3 + 1) / 2;
        this.field1692 = (var7 - var4 + 1) / 2;
        if (this.field1674 < 32) {
            this.field1674 = 32;
        }
        if (this.field1692 < 32) {
            this.field1692 = 32;
        }
        if (this.field1665) {
            this.field1674 += 8;
            this.field1692 += 8;
        }
    }

    @ObfuscatedName("dl.i()V")
    public void method2671() {
        if (this.field1666 == 1) {
            return;
        }
        this.field1666 = 1;
        this.field1841 = 0;
        this.field1667 = 0;
        this.field1668 = 0;
        for (int var1 = 0; var1 < this.field1664; var1++) {
            int var2 = this.field1695[var1];
            int var3 = this.field1655[var1];
            int var4 = this.field1657[var1];
            if (-var3 > this.field1841) {
                this.field1841 = -var3;
            }
            if (var3 > this.field1667) {
                this.field1667 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1668) {
                this.field1668 = var5;
            }
        }
        this.field1668 = (int) (Math.sqrt((double) this.field1668) + 0.99D);
        this.field1670 = (int) (Math.sqrt((double) (this.field1841 * this.field1841 + this.field1668 * this.field1668)) + 0.99D);
        this.field1650 = this.field1670 + (int) (Math.sqrt((double) (this.field1668 * this.field1668 + this.field1667 * this.field1667)) + 0.99D);
    }

    @ObfuscatedName("dl.p()V")
    public void method2672() {
        if (this.field1666 == 2) {
            return;
        }
        this.field1666 = 2;
        this.field1668 = 0;
        for (int var1 = 0; var1 < this.field1664; var1++) {
            int var2 = this.field1695[var1];
            int var3 = this.field1655[var1];
            int var4 = this.field1657[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1668) {
                this.field1668 = var5;
            }
        }
        this.field1668 = (int) (Math.sqrt((double) this.field1668) + 0.99D);
        this.field1670 = this.field1668;
        this.field1650 = this.field1668 + this.field1668;
    }

    @ObfuscatedName("dl.m()I")
    public int method2673() {
        this.method2671();
        return this.field1668;
    }

    @ObfuscatedName("dl.j()V")
    public void method2674() {
        this.field1666 = 0;
        this.field1674 = -1;
    }

    @ObfuscatedName("dl.x(Lel;I)V")
    public void method2668(class133 arg0, int arg1) {
        if (this.field1663 == null || arg1 == -1) {
            return;
        }
        class120 var3 = arg0.field1860[arg1];
        class127 var4 = var3.field1609;
        Statics.field1646 = 0;
        Statics.field1698 = 0;
        Statics.field1688 = 0;
        for (int var5 = 0; var5 < var3.field1610; var5++) {
            int var6 = var3.field1611[var5];
            this.method2677(var4.field1765[var6], var4.field1766[var6], var3.field1614[var5], var3.field1605[var5], var3.field1612[var5]);
        }
        this.method2674();
    }

    @ObfuscatedName("dl.v(Lel;ILel;I[I)V")
    public void method2684(class133 arg0, int arg1, class133 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2668(arg0, arg1);
            return;
        }
        class120 var6 = arg0.field1860[arg1];
        class120 var7 = arg2.field1860[arg3];
        class127 var8 = var6.field1609;
        Statics.field1646 = 0;
        Statics.field1698 = 0;
        Statics.field1688 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1610; var11++) {
            int var12 = var6.field1611[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1765[var12] == 0) {
                this.method2677(var8.field1765[var12], var8.field1766[var12], var6.field1614[var11], var6.field1605[var11], var6.field1612[var11]);
            }
        }
        Statics.field1646 = 0;
        Statics.field1698 = 0;
        Statics.field1688 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1610; var15++) {
            int var16 = var7.field1611[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1765[var16] == 0) {
                this.method2677(var8.field1765[var16], var8.field1766[var16], var7.field1614[var15], var7.field1605[var15], var7.field1612[var15]);
            }
        }
        this.method2674();
    }

    @ObfuscatedName("dl.h(I[IIII)V")
    public void method2677(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1646 = 0;
            Statics.field1698 = 0;
            Statics.field1688 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1663.length) {
                    int[] var10 = this.field1663[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1646 += this.field1695[var12];
                        Statics.field1698 += this.field1655[var12];
                        Statics.field1688 += this.field1657[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1646 = Statics.field1646 / var7 + arg2;
                Statics.field1698 = Statics.field1698 / var7 + arg3;
                Statics.field1688 = Statics.field1688 / var7 + arg4;
            } else {
                Statics.field1646 = arg2;
                Statics.field1698 = arg3;
                Statics.field1688 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1663.length) {
                    int[] var15 = this.field1663[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1695[var17] += arg2;
                        this.field1655[var17] += arg3;
                        this.field1657[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1663.length) {
                    int[] var20 = this.field1663[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1695[var22] -= Statics.field1646;
                        this.field1655[var22] -= Statics.field1698;
                        this.field1657[var22] -= Statics.field1688;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1703[var25];
                            int var27 = field1704[var25];
                            int var28 = this.field1695[var22] * var27 + this.field1655[var22] * var26 >> 16;
                            this.field1655[var22] = this.field1655[var22] * var27 - this.field1695[var22] * var26 >> 16;
                            this.field1695[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1703[var23];
                            int var30 = field1704[var23];
                            int var31 = this.field1655[var22] * var30 - this.field1657[var22] * var29 >> 16;
                            this.field1657[var22] = this.field1657[var22] * var30 + this.field1655[var22] * var29 >> 16;
                            this.field1655[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1703[var24];
                            int var33 = field1704[var24];
                            int var34 = this.field1695[var22] * var33 + this.field1657[var22] * var32 >> 16;
                            this.field1657[var22] = this.field1657[var22] * var33 - this.field1695[var22] * var32 >> 16;
                            this.field1695[var22] = var34;
                        }
                        this.field1695[var22] += Statics.field1646;
                        this.field1655[var22] += Statics.field1698;
                        this.field1657[var22] += Statics.field1688;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1663.length) {
                    int[] var37 = this.field1663[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1695[var39] -= Statics.field1646;
                        this.field1655[var39] -= Statics.field1698;
                        this.field1657[var39] -= Statics.field1688;
                        this.field1695[var39] = this.field1695[var39] * arg2 / 128;
                        this.field1655[var39] = this.field1655[var39] * arg3 / 128;
                        this.field1657[var39] = this.field1657[var39] * arg4 / 128;
                        this.field1695[var39] += Statics.field1646;
                        this.field1655[var39] += Statics.field1698;
                        this.field1657[var39] += Statics.field1688;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1680 != null && this.field1643 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1680.length) {
                    int[] var42 = this.field1680[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1643[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1643[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dl.f()V")
    public void method2678() {
        for (int var1 = 0; var1 < this.field1664; var1++) {
            int var2 = this.field1695[var1];
            this.field1695[var1] = this.field1657[var1];
            this.field1657[var1] = -var2;
        }
        this.method2674();
    }

    @ObfuscatedName("dl.a()V")
    public void method2682() {
        for (int var1 = 0; var1 < this.field1664; var1++) {
            this.field1695[var1] = -this.field1695[var1];
            this.field1657[var1] = -this.field1657[var1];
        }
        this.method2674();
    }

    @ObfuscatedName("dl.t()V")
    public void method2694() {
        for (int var1 = 0; var1 < this.field1664; var1++) {
            int var2 = this.field1657[var1];
            this.field1657[var1] = this.field1695[var1];
            this.field1695[var1] = -var2;
        }
        this.method2674();
    }

    @ObfuscatedName("dl.k(I)V")
    public void method2736(int arg0) {
        int var2 = field1703[arg0];
        int var3 = field1704[arg0];
        for (int var4 = 0; var4 < this.field1664; var4++) {
            int var5 = this.field1655[var4] * var3 - this.field1657[var4] * var2 >> 16;
            this.field1657[var4] = this.field1657[var4] * var3 + this.field1655[var4] * var2 >> 16;
            this.field1655[var4] = var5;
        }
        this.method2674();
    }

    @ObfuscatedName("dl.s(III)V")
    public void method2683(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1664; var4++) {
            this.field1695[var4] += arg0;
            this.field1655[var4] += arg1;
            this.field1657[var4] += arg2;
        }
        this.method2674();
    }

    @ObfuscatedName("dl.y(III)V")
    public void method2676(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1664; var4++) {
            this.field1695[var4] = this.field1695[var4] * arg0 / 128;
            this.field1655[var4] = this.field1655[var4] * arg1 / 128;
            this.field1657[var4] = this.field1657[var4] * arg2 / 128;
        }
        this.method2674();
    }

    @ObfuscatedName("dl.u(IIIIIII)V")
    public final void method2723(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1687[0] = -1;
        if (this.field1666 != 2 && this.field1666 != 1) {
            this.method2672();
        }
        int var8 = Statics.field1740;
        int var9 = Statics.field1731;
        int var10 = field1703[arg0];
        int var11 = field1704[arg0];
        int var12 = field1703[arg1];
        int var13 = field1704[arg1];
        int var14 = field1703[arg2];
        int var15 = field1704[arg2];
        int var16 = field1703[arg3];
        int var17 = field1704[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1664; var19++) {
            int var20 = this.field1695[var19];
            int var21 = this.field1655[var19];
            int var22 = this.field1657[var19];
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
            field1682[var19] = var30 - var18;
            field1644[var19] = class125.field1742 * var26 / var30 + var8;
            field1681[var19] = class125.field1742 * var29 / var30 + var9;
            if (this.field1685 > 0) {
                field1683[var19] = var26;
                field1684[var19] = var29;
                field1673[var19] = var30;
            }
        }
        try {
            this.method2687(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dl.o(IIIIIIII)V")
    public final void method2685(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1687[0] = -1;
        if (this.field1666 != 2 && this.field1666 != 1) {
            this.method2672();
        }
        int var9 = Statics.field1740;
        int var10 = Statics.field1731;
        int var11 = field1703[arg0];
        int var12 = field1704[arg0];
        int var13 = field1703[arg1];
        int var14 = field1704[arg1];
        int var15 = field1703[arg2];
        int var16 = field1704[arg2];
        int var17 = field1703[arg3];
        int var18 = field1704[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1664; var20++) {
            int var21 = this.field1695[var20];
            int var22 = this.field1655[var20];
            int var23 = this.field1657[var20];
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
            field1682[var20] = var31 - var19;
            field1644[var20] = class125.field1742 * var27 / arg7 + var9;
            field1681[var20] = class125.field1742 * var30 / arg7 + var10;
            if (this.field1685 > 0) {
                field1683[var20] = var27;
                field1684[var20] = var30;
                field1673[var20] = var31;
            }
        }
        try {
            this.method2687(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dl.cf(IIIIIIIIJ)V")
    public void method2686(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1687[0] = -1;
        if (this.field1666 != 1) {
            this.method2671();
        }
        this.method2670(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field1668 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field1668) * class125.field1742;
        if (var16 / var14 >= Statics.field1746) {
            return;
        }
        int var17 = (this.field1668 + var15) * class125.field1742;
        if (var17 / var14 <= Statics.field1729) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field1668 * arg1 >> 16;
        int var20 = (var18 + var19) * class125.field1742;
        if (var20 / var14 <= Statics.field1747) {
            return;
        }
        int var21 = (this.field1841 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class125.field1742;
        if (var22 / var14 >= Statics.field1741) {
            return;
        }
        int var23 = (this.field1841 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field1685 > 0;
        int var27 = class123.field1713;
        int var29 = class123.method1571();
        boolean var30 = class123.field1712;
        boolean var32 = class123.method225(arg8);
        boolean var33 = false;
        if (var32 && var30) {
            boolean var34 = false;
            if (field1700) {
                var34 = class123.method982(this, arg5, arg6, arg7);
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
                int var40 = var27 - Statics.field1740;
                int var41 = var29 - Statics.field1731;
                if (var40 > var36 && var40 < var37 && var41 > var38 && var41 < var39) {
                    var34 = true;
                }
            }
            if (var34) {
                if (this.field1665) {
                    class123.field1715[++class123.field1714 - 1] = arg8;
                } else {
                    var33 = true;
                }
            }
        }
        int var44 = Statics.field1740;
        int var45 = Statics.field1731;
        int var46 = 0;
        int var47 = 0;
        if (arg0 != 0) {
            var46 = field1703[arg0];
            var47 = field1704[arg0];
        }
        for (int var48 = 0; var48 < this.field1664; var48++) {
            int var49 = this.field1695[var48];
            int var50 = this.field1655[var48];
            int var51 = this.field1657[var48];
            if (arg0 != 0) {
                int var52 = var46 * var51 + var47 * var49 >> 16;
                var51 = var47 * var51 - var46 * var49 >> 16;
                var49 = var52;
            }
            int var53 = arg5 + var49;
            int var54 = arg6 + var50;
            int var55 = arg7 + var51;
            int var56 = arg3 * var55 + arg4 * var53 >> 16;
            int var57 = arg4 * var55 - arg3 * var53 >> 16;
            int var59 = arg2 * var54 - arg1 * var57 >> 16;
            int var60 = arg1 * var54 + arg2 * var57 >> 16;
            field1682[var48] = var60 - var12;
            if (var60 >= 50) {
                field1644[var48] = class125.field1742 * var56 / var60 + var44;
                field1681[var48] = class125.field1742 * var59 / var60 + var45;
            } else {
                field1644[var48] = -5000;
                var24 = true;
            }
            if (var26) {
                field1683[var48] = var56;
                field1684[var48] = var59;
                field1673[var48] = var60;
            }
        }
        try {
            this.method2687(var24, var33, this.field1665, arg8);
        } catch (Exception var63) {
        }
    }

    @ObfuscatedName("dl.af(ZZZJ)V")
    public final void method2687(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field1650 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field1650; var6++) {
            field1687[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field1647; var8++) {
            if (this.field1669[var8] != -2) {
                int var9 = this.field1648[var8];
                int var10 = this.field1649[var8];
                int var11 = this.field1697[var8];
                int var12 = field1644[var9];
                int var13 = field1644[var10];
                int var14 = field1644[var11];
                if (arg0 && (var12 == -5000 || var13 == -5000 || var14 == -5000)) {
                    int var15 = field1683[var9];
                    int var16 = field1683[var10];
                    int var17 = field1683[var11];
                    int var18 = field1684[var9];
                    int var19 = field1684[var10];
                    int var20 = field1684[var11];
                    int var21 = field1673[var9];
                    int var22 = field1673[var10];
                    int var23 = field1673[var11];
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
                        field1679[var8] = true;
                        int var33 = (field1682[var9] + field1682[var10] + field1682[var11]) / 3 + this.field1670;
                        field1690[var33][field1687[var33]++] = var8;
                    }
                } else {
                    if (arg1 && class123.method67(field1681[var9], field1681[var10], field1681[var11], var12, var13, var14, var7)) {
                        class123.field1715[++class123.field1714 - 1] = arg3;
                        arg1 = false;
                    }
                    if ((field1681[var11] - field1681[var10]) * (var12 - var13) - (field1681[var9] - field1681[var10]) * (var14 - var13) > 0) {
                        field1679[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field1743 && var13 <= Statics.field1743 && var14 <= Statics.field1743) {
                            field1678[var8] = false;
                        } else {
                            field1678[var8] = true;
                        }
                        int var36 = (field1682[var9] + field1682[var10] + field1682[var11]) / 3 + this.field1670;
                        field1690[var36][field1687[var36]++] = var8;
                    }
                }
            }
        }
        if (this.field1654 == null) {
            for (int var37 = this.field1650 - 1; var37 >= 0; var37--) {
                int var38 = field1687[var37];
                if (var38 > 0) {
                    int[] var39 = field1690[var37];
                    for (int var40 = 0; var40 < var38; var40++) {
                        this.method2688(var39[var40]);
                    }
                }
            }
            return;
        }
        for (int var41 = 0; var41 < 12; var41++) {
            field1689[var41] = 0;
            field1693[var41] = 0;
        }
        for (int var42 = this.field1650 - 1; var42 >= 0; var42--) {
            int var43 = field1687[var42];
            if (var43 > 0) {
                int[] var44 = field1690[var42];
                for (int var45 = 0; var45 < var43; var45++) {
                    int var46 = var44[var45];
                    byte var47 = this.field1654[var46];
                    int var48 = field1689[var47]++;
                    field1671[var47][var48] = var46;
                    if (var47 < 10) {
                        field1693[var47] += var42;
                    } else if (var47 == 10) {
                        field1691[var48] = var42;
                    } else {
                        field1653[var48] = var42;
                    }
                }
            }
        }
        int var49 = 0;
        if (field1689[1] > 0 || field1689[2] > 0) {
            var49 = (field1693[1] + field1693[2]) / (field1689[1] + field1689[2]);
        }
        int var50 = 0;
        if (field1689[3] > 0 || field1689[4] > 0) {
            var50 = (field1693[3] + field1693[4]) / (field1689[3] + field1689[4]);
        }
        int var51 = 0;
        if (field1689[6] > 0 || field1689[8] > 0) {
            var51 = (field1693[6] + field1693[8]) / (field1689[6] + field1689[8]);
        }
        int var52 = 0;
        int var53 = field1689[10];
        int[] var54 = field1671[10];
        int[] var55 = field1691;
        if (var52 == var53) {
            var52 = 0;
            var53 = field1689[11];
            var54 = field1671[11];
            var55 = field1653;
        }
        int var56;
        if (var52 < var53) {
            var56 = var55[var52];
        } else {
            var56 = -1000;
        }
        for (int var57 = 0; var57 < 10; var57++) {
            while (var57 == 0 && var56 > var49) {
                this.method2688(var54[var52++]);
                if (var52 == var53 && field1671[11] != var54) {
                    var52 = 0;
                    var53 = field1689[11];
                    var54 = field1671[11];
                    var55 = field1653;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            while (var57 == 3 && var56 > var50) {
                this.method2688(var54[var52++]);
                if (var52 == var53 && field1671[11] != var54) {
                    var52 = 0;
                    var53 = field1689[11];
                    var54 = field1671[11];
                    var55 = field1653;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            while (var57 == 5 && var56 > var51) {
                this.method2688(var54[var52++]);
                if (var52 == var53 && field1671[11] != var54) {
                    var52 = 0;
                    var53 = field1689[11];
                    var54 = field1671[11];
                    var55 = field1653;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            int var58 = field1689[var57];
            int[] var59 = field1671[var57];
            for (int var60 = 0; var60 < var58; var60++) {
                this.method2688(var59[var60]);
            }
        }
        while (var56 != -1000) {
            this.method2688(var54[var52++]);
            if (var52 == var53 && field1671[11] != var54) {
                var52 = 0;
                var54 = field1671[11];
                var53 = field1689[11];
                var55 = field1653;
            }
            if (var52 < var53) {
                var56 = var55[var52];
            } else {
                var56 = -1000;
            }
        }
    }

    @ObfuscatedName("dl.an(I)V")
    public final void method2688(int arg0) {
        if (field1679[arg0]) {
            this.method2689(arg0);
            return;
        }
        int var2 = this.field1648[arg0];
        int var3 = this.field1649[arg0];
        int var4 = this.field1697[arg0];
        class125.field1754 = field1678[arg0];
        if (this.field1643 == null) {
            class125.field1733 = 0;
        } else {
            class125.field1733 = this.field1643[arg0] & 0xFF;
        }
        if (this.field1645 != null && this.field1645[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1656 == null || this.field1656[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1656[arg0] & 0xFF;
                var6 = this.field1660[var5];
                var7 = this.field1661[var5];
                var8 = this.field1662[var5];
            }
            if (this.field1669[arg0] == -1) {
                class125.method2787(field1681[var2], field1681[var3], field1681[var4], field1644[var2], field1644[var3], field1644[var4], this.field1651[arg0], this.field1651[arg0], this.field1651[arg0], field1683[var6], field1683[var7], field1683[var8], field1684[var6], field1684[var7], field1684[var8], field1673[var6], field1673[var7], field1673[var8], this.field1645[arg0]);
            } else {
                class125.method2787(field1681[var2], field1681[var3], field1681[var4], field1644[var2], field1644[var3], field1644[var4], this.field1651[arg0], this.field1707[arg0], this.field1669[arg0], field1683[var6], field1683[var7], field1683[var8], field1684[var6], field1684[var7], field1684[var8], field1673[var6], field1673[var7], field1673[var8], this.field1645[arg0]);
            }
        } else if (this.field1669[arg0] == -1) {
            class125.method2785(field1681[var2], field1681[var3], field1681[var4], field1644[var2], field1644[var3], field1644[var4], field1705[this.field1651[arg0]]);
        } else {
            class125.method2783(field1681[var2], field1681[var3], field1681[var4], field1644[var2], field1644[var3], field1644[var4], this.field1651[arg0], this.field1707[arg0], this.field1669[arg0]);
        }
    }

    @ObfuscatedName("dl.ax(I)V")
    public final void method2689(int arg0) {
        int var2 = Statics.field1740;
        int var3 = Statics.field1731;
        int var4 = 0;
        int var5 = this.field1648[arg0];
        int var6 = this.field1649[arg0];
        int var7 = this.field1697[arg0];
        int var8 = field1673[var5];
        int var9 = field1673[var6];
        int var10 = field1673[var7];
        if (this.field1643 == null) {
            class125.field1733 = 0;
        } else {
            class125.field1733 = this.field1643[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1694[var4] = field1644[var5];
            field1699[var4] = field1681[var5];
            field1696[var4++] = this.field1651[arg0];
        } else {
            int var11 = field1683[var5];
            int var12 = field1684[var5];
            int var13 = this.field1651[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1706[var10 - var8];
                field1694[var4] = (((field1683[var7] - var11) * var14 >> 16) + var11) * class125.field1742 / 50 + var2;
                field1699[var4] = (((field1684[var7] - var12) * var14 >> 16) + var12) * class125.field1742 / 50 + var3;
                field1696[var4++] = ((this.field1669[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1706[var9 - var8];
                field1694[var4] = (((field1683[var6] - var11) * var15 >> 16) + var11) * class125.field1742 / 50 + var2;
                field1699[var4] = (((field1684[var6] - var12) * var15 >> 16) + var12) * class125.field1742 / 50 + var3;
                field1696[var4++] = ((this.field1707[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1694[var4] = field1644[var6];
            field1699[var4] = field1681[var6];
            field1696[var4++] = this.field1707[arg0];
        } else {
            int var16 = field1683[var6];
            int var17 = field1684[var6];
            int var18 = this.field1707[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1706[var8 - var9];
                field1694[var4] = (((field1683[var5] - var16) * var19 >> 16) + var16) * class125.field1742 / 50 + var2;
                field1699[var4] = (((field1684[var5] - var17) * var19 >> 16) + var17) * class125.field1742 / 50 + var3;
                field1696[var4++] = ((this.field1651[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1706[var10 - var9];
                field1694[var4] = (((field1683[var7] - var16) * var20 >> 16) + var16) * class125.field1742 / 50 + var2;
                field1699[var4] = (((field1684[var7] - var17) * var20 >> 16) + var17) * class125.field1742 / 50 + var3;
                field1696[var4++] = ((this.field1669[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1694[var4] = field1644[var7];
            field1699[var4] = field1681[var7];
            field1696[var4++] = this.field1669[arg0];
        } else {
            int var21 = field1683[var7];
            int var22 = field1684[var7];
            int var23 = this.field1669[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1706[var9 - var10];
                field1694[var4] = (((field1683[var6] - var21) * var24 >> 16) + var21) * class125.field1742 / 50 + var2;
                field1699[var4] = (((field1684[var6] - var22) * var24 >> 16) + var22) * class125.field1742 / 50 + var3;
                field1696[var4++] = ((this.field1707[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1706[var8 - var10];
                field1694[var4] = (((field1683[var5] - var21) * var25 >> 16) + var21) * class125.field1742 / 50 + var2;
                field1699[var4] = (((field1684[var5] - var22) * var25 >> 16) + var22) * class125.field1742 / 50 + var3;
                field1696[var4++] = ((this.field1651[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1694[0];
        int var27 = field1694[1];
        int var28 = field1694[2];
        int var29 = field1699[0];
        int var30 = field1699[1];
        int var31 = field1699[2];
        class125.field1754 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1743 || var27 > Statics.field1743 || var28 > Statics.field1743) {
                class125.field1754 = true;
            }
            if (this.field1645 != null && this.field1645[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1656 == null || this.field1656[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1656[arg0] & 0xFF;
                    var33 = this.field1660[var32];
                    var34 = this.field1661[var32];
                    var35 = this.field1662[var32];
                }
                if (this.field1669[arg0] == -1) {
                    class125.method2787(var29, var30, var31, var26, var27, var28, this.field1651[arg0], this.field1651[arg0], this.field1651[arg0], field1683[var33], field1683[var34], field1683[var35], field1684[var33], field1684[var34], field1684[var35], field1673[var33], field1673[var34], field1673[var35], this.field1645[arg0]);
                } else {
                    class125.method2787(var29, var30, var31, var26, var27, var28, field1696[0], field1696[1], field1696[2], field1683[var33], field1683[var34], field1683[var35], field1684[var33], field1684[var34], field1684[var35], field1673[var33], field1673[var34], field1673[var35], this.field1645[arg0]);
                }
            } else if (this.field1669[arg0] == -1) {
                class125.method2785(var29, var30, var31, var26, var27, var28, field1705[this.field1651[arg0]]);
            } else {
                class125.method2783(var29, var30, var31, var26, var27, var28, field1696[0], field1696[1], field1696[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1743 || var27 > Statics.field1743 || var28 > Statics.field1743 || field1694[3] < 0 || field1694[3] > Statics.field1743) {
            class125.field1754 = true;
        }
        if (this.field1645 != null && this.field1645[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1656 == null || this.field1656[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1656[arg0] & 0xFF;
                var37 = this.field1660[var36];
                var38 = this.field1661[var36];
                var39 = this.field1662[var36];
            }
            short var40 = this.field1645[arg0];
            if (this.field1669[arg0] == -1) {
                class125.method2787(var29, var30, var31, var26, var27, var28, this.field1651[arg0], this.field1651[arg0], this.field1651[arg0], field1683[var37], field1683[var38], field1683[var39], field1684[var37], field1684[var38], field1684[var39], field1673[var37], field1673[var38], field1673[var39], var40);
                class125.method2787(var29, var31, field1699[3], var26, var28, field1694[3], this.field1651[arg0], this.field1651[arg0], this.field1651[arg0], field1683[var37], field1683[var38], field1683[var39], field1684[var37], field1684[var38], field1684[var39], field1673[var37], field1673[var38], field1673[var39], var40);
            } else {
                class125.method2787(var29, var30, var31, var26, var27, var28, field1696[0], field1696[1], field1696[2], field1683[var37], field1683[var38], field1683[var39], field1684[var37], field1684[var38], field1684[var39], field1673[var37], field1673[var38], field1673[var39], var40);
                class125.method2787(var29, var31, field1699[3], var26, var28, field1694[3], field1696[0], field1696[2], field1696[3], field1683[var37], field1683[var38], field1683[var39], field1684[var37], field1684[var38], field1684[var39], field1673[var37], field1673[var38], field1673[var39], var40);
            }
        } else if (this.field1669[arg0] == -1) {
            int var41 = field1705[this.field1651[arg0]];
            class125.method2785(var29, var30, var31, var26, var27, var28, var41);
            class125.method2785(var29, var31, field1699[3], var26, var28, field1694[3], var41);
        } else {
            class125.method2783(var29, var30, var31, var26, var27, var28, field1696[0], field1696[1], field1696[2]);
            class125.method2783(var29, var31, field1699[3], var26, var28, field1694[3], field1696[0], field1696[2], field1696[3]);
        }
    }
}
