package deob;

@ObfuscatedName("du")
public class class128 extends class136 {

    @ObfuscatedName("du.m")
    public static class128 field1705 = new class128();

    @ObfuscatedName("du.f")
    public static byte[] field1710 = new byte[1];

    @ObfuscatedName("du.q")
    public static class128 field1713 = new class128();

    @ObfuscatedName("du.w")
    public static byte[] field1647 = new byte[1];

    @ObfuscatedName("du.o")
    public int field1648 = 0;

    @ObfuscatedName("du.u")
    public int[] field1649;

    @ObfuscatedName("du.g")
    public int[] field1650;

    @ObfuscatedName("du.l")
    public int[] field1651;

    @ObfuscatedName("du.e")
    public int field1652 = 0;

    @ObfuscatedName("du.x")
    public int[] field1653;

    @ObfuscatedName("du.d")
    public int[] field1654;

    @ObfuscatedName("du.k")
    public int[] field1687;

    @ObfuscatedName("du.n")
    public int[] field1656;

    @ObfuscatedName("du.i")
    public int[] field1695;

    @ObfuscatedName("du.a")
    public int[] field1658;

    @ObfuscatedName("du.z")
    public byte[] field1659;

    @ObfuscatedName("du.j")
    public byte[] field1660;

    @ObfuscatedName("du.s")
    public byte[] field1661;

    @ObfuscatedName("du.t")
    public short[] field1662;

    @ObfuscatedName("du.y")
    public byte field1663 = 0;

    @ObfuscatedName("du.h")
    public int field1664 = 0;

    @ObfuscatedName("du.b")
    public int[] field1665;

    @ObfuscatedName("du.c")
    public int[] field1694;

    @ObfuscatedName("du.r")
    public int[] field1676;

    @ObfuscatedName("du.p")
    public int[][] field1701;

    @ObfuscatedName("du.v")
    public int[][] field1669;

    @ObfuscatedName("du.ag")
    public boolean field1644 = false;

    @ObfuscatedName("du.aq")
    public int field1677;

    @ObfuscatedName("du.aj")
    public int field1672;

    @ObfuscatedName("du.av")
    public int field1673;

    @ObfuscatedName("du.ar")
    public int field1674;

    @ObfuscatedName("du.ac")
    public int field1675;

    @ObfuscatedName("du.ay")
    public int field1682;

    @ObfuscatedName("du.ah")
    public int field1667;

    @ObfuscatedName("du.ak")
    public int field1706;

    @ObfuscatedName("du.aw")
    public int field1679 = -1;

    @ObfuscatedName("du.al")
    public int field1680 = -1;

    @ObfuscatedName("du.ab")
    public int field1681 = -1;

    @ObfuscatedName("du.at")
    public static boolean[] field1671 = new boolean[4700];

    @ObfuscatedName("du.ad")
    public static boolean[] field1684 = new boolean[4700];

    @ObfuscatedName("du.ap")
    public static int[] field1685 = new int[4700];

    @ObfuscatedName("du.as")
    public static int[] field1686 = new int[4700];

    @ObfuscatedName("du.am")
    public static int[] field1668 = new int[4700];

    @ObfuscatedName("du.an")
    public static int[] field1688 = new int[4700];

    @ObfuscatedName("du.az")
    public static int[] field1689 = new int[4700];

    @ObfuscatedName("du.au")
    public static int[] field1707 = new int[4700];

    @ObfuscatedName("du.aa")
    public static int[] field1692 = new int[1600];

    @ObfuscatedName("du.ax")
    public static int[][] field1693 = new int[1600][512];

    @ObfuscatedName("du.af")
    public static int[] field1696 = new int[12];

    @ObfuscatedName("du.ai")
    public static int[][] field1670 = new int[12][2000];

    @ObfuscatedName("du.ba")
    public static int[] field1655 = new int[2000];

    @ObfuscatedName("du.bb")
    public static int[] field1697 = new int[2000];

    @ObfuscatedName("du.bs")
    public static int[] field1698 = new int[12];

    @ObfuscatedName("du.bq")
    public static int[] field1699 = new int[10];

    @ObfuscatedName("du.bn")
    public static int[] field1657 = new int[10];

    @ObfuscatedName("du.bk")
    public static int[] field1700 = new int[10];

    @ObfuscatedName("du.bx")
    public static boolean field1646 = true;

    @ObfuscatedName("du.bm")
    public static int[] field1708 = class131.field1757;

    @ObfuscatedName("du.bl")
    public static int[] field1678 = class131.field1760;

    @ObfuscatedName("du.br")
    public static int[] field1645 = class131.field1755;

    @ObfuscatedName("du.bj")
    public static int[] field1711 = class131.field1758;

    public class128() {
    }

    public class128(class128[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1648 = 0;
        this.field1652 = 0;
        this.field1664 = 0;
        this.field1663 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class128 var8 = arg0[var7];
            if (var8 != null) {
                this.field1648 += var8.field1648;
                this.field1652 += var8.field1652;
                this.field1664 += var8.field1664;
                if (var8.field1659 == null) {
                    if (this.field1663 == -1) {
                        this.field1663 = var8.field1663;
                    }
                    if (this.field1663 != var8.field1663) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1660 != null;
                var5 |= var8.field1662 != null;
                var6 |= var8.field1661 != null;
            }
        }
        this.field1649 = new int[this.field1648];
        this.field1650 = new int[this.field1648];
        this.field1651 = new int[this.field1648];
        this.field1653 = new int[this.field1652];
        this.field1654 = new int[this.field1652];
        this.field1687 = new int[this.field1652];
        this.field1656 = new int[this.field1652];
        this.field1695 = new int[this.field1652];
        this.field1658 = new int[this.field1652];
        if (var3) {
            this.field1659 = new byte[this.field1652];
        }
        if (var4) {
            this.field1660 = new byte[this.field1652];
        }
        if (var5) {
            this.field1662 = new short[this.field1652];
        }
        if (var6) {
            this.field1661 = new byte[this.field1652];
        }
        if (this.field1664 > 0) {
            this.field1665 = new int[this.field1664];
            this.field1694 = new int[this.field1664];
            this.field1676 = new int[this.field1664];
        }
        this.field1648 = 0;
        this.field1652 = 0;
        this.field1664 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class128 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1652; var11++) {
                    this.field1653[this.field1652] = var10.field1653[var11] + this.field1648;
                    this.field1654[this.field1652] = var10.field1654[var11] + this.field1648;
                    this.field1687[this.field1652] = var10.field1687[var11] + this.field1648;
                    this.field1656[this.field1652] = var10.field1656[var11];
                    this.field1695[this.field1652] = var10.field1695[var11];
                    this.field1658[this.field1652] = var10.field1658[var11];
                    if (var3) {
                        if (var10.field1659 == null) {
                            this.field1659[this.field1652] = var10.field1663;
                        } else {
                            this.field1659[this.field1652] = var10.field1659[var11];
                        }
                    }
                    if (var4 && var10.field1660 != null) {
                        this.field1660[this.field1652] = var10.field1660[var11];
                    }
                    if (var5) {
                        if (var10.field1662 == null) {
                            this.field1662[this.field1652] = -1;
                        } else {
                            this.field1662[this.field1652] = var10.field1662[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1661 == null || var10.field1661[var11] == -1) {
                            this.field1661[this.field1652] = -1;
                        } else {
                            this.field1661[this.field1652] = (byte) (var10.field1661[var11] + this.field1664);
                        }
                    }
                    this.field1652++;
                }
                for (int var12 = 0; var12 < var10.field1664; var12++) {
                    this.field1665[this.field1664] = var10.field1665[var12] + this.field1648;
                    this.field1694[this.field1664] = var10.field1694[var12] + this.field1648;
                    this.field1676[this.field1664] = var10.field1676[var12] + this.field1648;
                    this.field1664++;
                }
                for (int var13 = 0; var13 < var10.field1648; var13++) {
                    this.field1649[this.field1648] = var10.field1649[var13];
                    this.field1650[this.field1648] = var10.field1650[var13];
                    this.field1651[this.field1648] = var10.field1651[var13];
                    this.field1648++;
                }
            }
        }
    }

    @ObfuscatedName("du.m([[IIIIZI)Ldu;")
    public class128 method2645(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2659();
        int var7 = arg1 - this.field1673;
        int var8 = this.field1673 + arg1;
        int var9 = arg3 - this.field1673;
        int var10 = this.field1673 + arg3;
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
            var15.field1648 = this.field1648;
            var15.field1652 = this.field1652;
            var15.field1664 = this.field1664;
            var15.field1649 = this.field1649;
            var15.field1651 = this.field1651;
            var15.field1653 = this.field1653;
            var15.field1654 = this.field1654;
            var15.field1687 = this.field1687;
            var15.field1656 = this.field1656;
            var15.field1695 = this.field1695;
            var15.field1658 = this.field1658;
            var15.field1659 = this.field1659;
            var15.field1660 = this.field1660;
            var15.field1661 = this.field1661;
            var15.field1662 = this.field1662;
            var15.field1663 = this.field1663;
            var15.field1665 = this.field1665;
            var15.field1694 = this.field1694;
            var15.field1676 = this.field1676;
            var15.field1701 = this.field1701;
            var15.field1669 = this.field1669;
            var15.field1644 = this.field1644;
            var15.field1650 = new int[var15.field1648];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1648; var16++) {
                int var17 = this.field1649[var16] + arg1;
                int var18 = this.field1651[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1650[var16] = this.field1650[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1648; var26++) {
                int var27 = (-this.field1650[var26] << 16) / this.field1851;
                if (var27 < arg5) {
                    int var28 = this.field1649[var26] + arg1;
                    int var29 = this.field1651[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1650[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1650[var26];
                }
            }
        }
        var15.method2626();
        return var15;
    }

    @ObfuscatedName("du.f(Z)Ldu;")
    public class128 method2647(boolean arg0) {
        if (!arg0 && field1710.length < this.field1652) {
            field1710 = new byte[this.field1652 + 100];
        }
        return this.method2658(arg0, field1705, field1710);
    }

    @ObfuscatedName("du.q(Z)Ldu;")
    public class128 method2620(boolean arg0) {
        if (!arg0 && field1647.length < this.field1652) {
            field1647 = new byte[this.field1652 + 100];
        }
        return this.method2658(arg0, field1713, field1647);
    }

    @ObfuscatedName("du.w(ZLdu;[B)Ldu;")
    public class128 method2658(boolean arg0, class128 arg1, byte[] arg2) {
        arg1.field1648 = this.field1648;
        arg1.field1652 = this.field1652;
        arg1.field1664 = this.field1664;
        if (arg1.field1649 == null || arg1.field1649.length < this.field1648) {
            arg1.field1649 = new int[this.field1648 + 100];
            arg1.field1650 = new int[this.field1648 + 100];
            arg1.field1651 = new int[this.field1648 + 100];
        }
        for (int var4 = 0; var4 < this.field1648; var4++) {
            arg1.field1649[var4] = this.field1649[var4];
            arg1.field1650[var4] = this.field1650[var4];
            arg1.field1651[var4] = this.field1651[var4];
        }
        if (arg0) {
            arg1.field1660 = this.field1660;
        } else {
            arg1.field1660 = arg2;
            if (this.field1660 == null) {
                for (int var5 = 0; var5 < this.field1652; var5++) {
                    arg1.field1660[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1652; var6++) {
                    arg1.field1660[var6] = this.field1660[var6];
                }
            }
        }
        arg1.field1653 = this.field1653;
        arg1.field1654 = this.field1654;
        arg1.field1687 = this.field1687;
        arg1.field1656 = this.field1656;
        arg1.field1695 = this.field1695;
        arg1.field1658 = this.field1658;
        arg1.field1659 = this.field1659;
        arg1.field1661 = this.field1661;
        arg1.field1662 = this.field1662;
        arg1.field1663 = this.field1663;
        arg1.field1665 = this.field1665;
        arg1.field1694 = this.field1694;
        arg1.field1676 = this.field1676;
        arg1.field1701 = this.field1701;
        arg1.field1669 = this.field1669;
        arg1.field1644 = this.field1644;
        arg1.method2626();
        return arg1;
    }

    @ObfuscatedName("du.o(I)V")
    public void method2623(int arg0) {
        if (this.field1679 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1678[arg0];
        int var9 = field1708[arg0];
        for (int var10 = 0; var10 < this.field1648; var10++) {
            int var11 = class131.method2788(this.field1649[var10], this.field1651[var10], var8, var9);
            int var12 = this.field1650[var10];
            int var13 = class131.method2753(this.field1649[var10], this.field1651[var10], var8, var9);
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
        this.field1682 = (var2 + var5) / 2;
        this.field1667 = (var3 + var6) / 2;
        this.field1706 = (var4 + var7) / 2;
        this.field1679 = (var5 - var2 + 1) / 2;
        this.field1680 = (var6 - var3 + 1) / 2;
        this.field1681 = (var7 - var4 + 1) / 2;
        if (this.field1679 < 32) {
            this.field1679 = 32;
        }
        if (this.field1681 < 32) {
            this.field1681 = 32;
        }
        if (this.field1644) {
            this.field1679 += 8;
            this.field1681 += 8;
        }
    }

    @ObfuscatedName("du.u()V")
    public void method2659() {
        if (this.field1677 == 1) {
            return;
        }
        this.field1677 = 1;
        this.field1851 = 0;
        this.field1672 = 0;
        this.field1673 = 0;
        for (int var1 = 0; var1 < this.field1648; var1++) {
            int var2 = this.field1649[var1];
            int var3 = this.field1650[var1];
            int var4 = this.field1651[var1];
            if (-var3 > this.field1851) {
                this.field1851 = -var3;
            }
            if (var3 > this.field1672) {
                this.field1672 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1673) {
                this.field1673 = var5;
            }
        }
        this.field1673 = (int) (Math.sqrt((double) this.field1673) + 0.99D);
        this.field1675 = (int) (Math.sqrt((double) (this.field1851 * this.field1851 + this.field1673 * this.field1673)) + 0.99D);
        this.field1674 = this.field1675 + (int) (Math.sqrt((double) (this.field1673 * this.field1673 + this.field1672 * this.field1672)) + 0.99D);
    }

    @ObfuscatedName("du.g()V")
    public void method2630() {
        if (this.field1677 == 2) {
            return;
        }
        this.field1677 = 2;
        this.field1673 = 0;
        for (int var1 = 0; var1 < this.field1648; var1++) {
            int var2 = this.field1649[var1];
            int var3 = this.field1650[var1];
            int var4 = this.field1651[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1673) {
                this.field1673 = var5;
            }
        }
        this.field1673 = (int) (Math.sqrt((double) this.field1673) + 0.99D);
        this.field1675 = this.field1673;
        this.field1674 = this.field1673 + this.field1673;
    }

    @ObfuscatedName("du.l()I")
    public int method2625() {
        this.method2659();
        return this.field1673;
    }

    @ObfuscatedName("du.x()V")
    public void method2626() {
        this.field1677 = 0;
        this.field1679 = -1;
    }

    @ObfuscatedName("du.d(Len;I)V")
    public void method2627(class139 arg0, int arg1) {
        if (this.field1701 == null || arg1 == -1) {
            return;
        }
        class126 var3 = arg0.field1870[arg1];
        class133 var4 = var3.field1610;
        Statics.field1702 = 0;
        Statics.field1703 = 0;
        Statics.field1704 = 0;
        for (int var5 = 0; var5 < var3.field1615; var5++) {
            int var6 = var3.field1616[var5];
            this.method2693(var4.field1771[var6], var4.field1774[var6], var3.field1617[var5], var3.field1618[var5], var3.field1611[var5]);
        }
        this.method2626();
    }

    @ObfuscatedName("du.a(Len;ILen;I[I)V")
    public void method2628(class139 arg0, int arg1, class139 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2627(arg0, arg1);
            return;
        }
        class126 var6 = arg0.field1870[arg1];
        class126 var7 = arg2.field1870[arg3];
        class133 var8 = var6.field1610;
        Statics.field1702 = 0;
        Statics.field1703 = 0;
        Statics.field1704 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1615; var11++) {
            int var12 = var6.field1616[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1771[var12] == 0) {
                this.method2693(var8.field1771[var12], var8.field1774[var12], var6.field1617[var11], var6.field1618[var11], var6.field1611[var11]);
            }
        }
        Statics.field1702 = 0;
        Statics.field1703 = 0;
        Statics.field1704 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1615; var15++) {
            int var16 = var7.field1616[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1771[var16] == 0) {
                this.method2693(var8.field1771[var16], var8.field1774[var16], var7.field1617[var15], var7.field1618[var15], var7.field1611[var15]);
            }
        }
        this.method2626();
    }

    @ObfuscatedName("du.z(I[IIII)V")
    public void method2693(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1702 = 0;
            Statics.field1703 = 0;
            Statics.field1704 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1701.length) {
                    int[] var10 = this.field1701[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1702 += this.field1649[var12];
                        Statics.field1703 += this.field1650[var12];
                        Statics.field1704 += this.field1651[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1702 = Statics.field1702 / var7 + arg2;
                Statics.field1703 = Statics.field1703 / var7 + arg3;
                Statics.field1704 = Statics.field1704 / var7 + arg4;
            } else {
                Statics.field1702 = arg2;
                Statics.field1703 = arg3;
                Statics.field1704 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1701.length) {
                    int[] var15 = this.field1701[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1649[var17] += arg2;
                        this.field1650[var17] += arg3;
                        this.field1651[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1701.length) {
                    int[] var20 = this.field1701[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1649[var22] -= Statics.field1702;
                        this.field1650[var22] -= Statics.field1703;
                        this.field1651[var22] -= Statics.field1704;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1708[var25];
                            int var27 = field1678[var25];
                            int var28 = this.field1650[var22] * var26 + this.field1649[var22] * var27 >> 16;
                            this.field1650[var22] = this.field1650[var22] * var27 - this.field1649[var22] * var26 >> 16;
                            this.field1649[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1708[var23];
                            int var30 = field1678[var23];
                            int var31 = this.field1650[var22] * var30 - this.field1651[var22] * var29 >> 16;
                            this.field1651[var22] = this.field1651[var22] * var30 + this.field1650[var22] * var29 >> 16;
                            this.field1650[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1708[var24];
                            int var33 = field1678[var24];
                            int var34 = this.field1651[var22] * var32 + this.field1649[var22] * var33 >> 16;
                            this.field1651[var22] = this.field1651[var22] * var33 - this.field1649[var22] * var32 >> 16;
                            this.field1649[var22] = var34;
                        }
                        this.field1649[var22] += Statics.field1702;
                        this.field1650[var22] += Statics.field1703;
                        this.field1651[var22] += Statics.field1704;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1701.length) {
                    int[] var37 = this.field1701[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1649[var39] -= Statics.field1702;
                        this.field1650[var39] -= Statics.field1703;
                        this.field1651[var39] -= Statics.field1704;
                        this.field1649[var39] = this.field1649[var39] * arg2 / 128;
                        this.field1650[var39] = this.field1650[var39] * arg3 / 128;
                        this.field1651[var39] = this.field1651[var39] * arg4 / 128;
                        this.field1649[var39] += Statics.field1702;
                        this.field1650[var39] += Statics.field1703;
                        this.field1651[var39] += Statics.field1704;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1669 != null && this.field1660 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1669.length) {
                    int[] var42 = this.field1669[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1660[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1660[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("du.j()V")
    public void method2660() {
        for (int var1 = 0; var1 < this.field1648; var1++) {
            int var2 = this.field1649[var1];
            this.field1649[var1] = this.field1651[var1];
            this.field1651[var1] = -var2;
        }
        this.method2626();
    }

    @ObfuscatedName("du.s()V")
    public void method2631() {
        for (int var1 = 0; var1 < this.field1648; var1++) {
            this.field1649[var1] = -this.field1649[var1];
            this.field1651[var1] = -this.field1651[var1];
        }
        this.method2626();
    }

    @ObfuscatedName("du.t()V")
    public void method2632() {
        for (int var1 = 0; var1 < this.field1648; var1++) {
            int var2 = this.field1651[var1];
            this.field1651[var1] = this.field1649[var1];
            this.field1649[var1] = -var2;
        }
        this.method2626();
    }

    @ObfuscatedName("du.y(I)V")
    public void method2633(int arg0) {
        int var2 = field1708[arg0];
        int var3 = field1678[arg0];
        for (int var4 = 0; var4 < this.field1648; var4++) {
            int var5 = this.field1650[var4] * var3 - this.field1651[var4] * var2 >> 16;
            this.field1651[var4] = this.field1651[var4] * var3 + this.field1650[var4] * var2 >> 16;
            this.field1650[var4] = var5;
        }
        this.method2626();
    }

    @ObfuscatedName("du.h(III)V")
    public void method2634(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1648; var4++) {
            this.field1649[var4] += arg0;
            this.field1650[var4] += arg1;
            this.field1651[var4] += arg2;
        }
        this.method2626();
    }

    @ObfuscatedName("du.b(III)V")
    public void method2635(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1648; var4++) {
            this.field1649[var4] = this.field1649[var4] * arg0 / 128;
            this.field1650[var4] = this.field1650[var4] * arg1 / 128;
            this.field1651[var4] = this.field1651[var4] * arg2 / 128;
        }
        this.method2626();
    }

    @ObfuscatedName("du.c(IIIIIII)V")
    public final void method2636(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1692[0] = -1;
        if (this.field1677 != 2 && this.field1677 != 1) {
            this.method2630();
        }
        int var8 = Statics.field1746;
        int var9 = Statics.field1747;
        int var10 = field1708[arg0];
        int var11 = field1678[arg0];
        int var12 = field1708[arg1];
        int var13 = field1678[arg1];
        int var14 = field1708[arg2];
        int var15 = field1678[arg2];
        int var16 = field1708[arg3];
        int var17 = field1678[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1648; var19++) {
            int var20 = this.field1649[var19];
            int var21 = this.field1650[var19];
            int var22 = this.field1651[var19];
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
            field1668[var19] = var30 - var18;
            field1685[var19] = class131.field1745 * var26 / var30 + var8;
            field1686[var19] = class131.field1745 * var29 / var30 + var9;
            if (this.field1664 > 0) {
                field1688[var19] = var26;
                field1689[var19] = var29;
                field1707[var19] = var30;
            }
        }
        try {
            this.method2639(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("du.p(IIIIIIII)V")
    public final void method2637(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1692[0] = -1;
        if (this.field1677 != 2 && this.field1677 != 1) {
            this.method2630();
        }
        int var9 = Statics.field1746;
        int var10 = Statics.field1747;
        int var11 = field1708[arg0];
        int var12 = field1678[arg0];
        int var13 = field1708[arg1];
        int var14 = field1678[arg1];
        int var15 = field1708[arg2];
        int var16 = field1678[arg2];
        int var17 = field1708[arg3];
        int var18 = field1678[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1648; var20++) {
            int var21 = this.field1649[var20];
            int var22 = this.field1650[var20];
            int var23 = this.field1651[var20];
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
            field1668[var20] = var31 - var19;
            field1685[var20] = class131.field1745 * var27 / arg7 + var9;
            field1686[var20] = class131.field1745 * var30 / arg7 + var10;
            if (this.field1664 > 0) {
                field1688[var20] = var27;
                field1689[var20] = var30;
                field1707[var20] = var31;
            }
        }
        try {
            this.method2639(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("du.cy(IIIIIIIIJ)V")
    public void method2638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1692[0] = -1;
        if (this.field1677 != 1) {
            this.method2659();
        }
        this.method2623(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field1673 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field1673) * class131.field1745;
        if (var16 / var14 >= Statics.field1751) {
            return;
        }
        int var17 = (this.field1673 + var15) * class131.field1745;
        if (var17 / var14 <= Statics.field1744) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field1673 * arg1 >> 16;
        int var20 = (var18 + var19) * class131.field1745;
        if (var20 / var14 <= Statics.field1750) {
            return;
        }
        int var21 = (this.field1851 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class131.field1745;
        if (var22 / var14 >= Statics.field1753) {
            return;
        }
        int var23 = (this.field1851 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field1664 > 0;
        int var27 = class129.field1714;
        int var29 = class129.field1726;
        boolean var31 = class129.field1724;
        boolean var33 = arg8 != 0L;
        if (var33) {
            boolean var34 = (int) (arg8 >>> 16 & 0x1L) == 1;
            var33 = !var34;
        }
        boolean var37 = false;
        if (var33 && var31) {
            boolean var38 = false;
            if (field1646) {
                var38 = class129.method2278(this, arg5, arg6, arg7);
            } else {
                int var39 = var12 - var13;
                if (var39 <= 50) {
                    var39 = 50;
                }
                int var40;
                int var41;
                if (var15 > 0) {
                    var40 = var16 / var14;
                    var41 = var17 / var39;
                } else {
                    var41 = var17 / var14;
                    var40 = var16 / var39;
                }
                int var42;
                int var43;
                if (var18 > 0) {
                    var42 = var22 / var14;
                    var43 = var20 / var39;
                } else {
                    var43 = var20 / var14;
                    var42 = var22 / var39;
                }
                int var44 = var27 - Statics.field1746;
                int var45 = var29 - Statics.field1747;
                if (var44 > var40 && var44 < var41 && var45 > var42 && var45 < var43) {
                    var38 = true;
                }
            }
            if (var38) {
                if (this.field1644) {
                    class129.method1902(arg8);
                } else {
                    var37 = true;
                }
            }
        }
        int var46 = Statics.field1746;
        int var47 = Statics.field1747;
        int var48 = 0;
        int var49 = 0;
        if (arg0 != 0) {
            var48 = field1708[arg0];
            var49 = field1678[arg0];
        }
        for (int var50 = 0; var50 < this.field1648; var50++) {
            int var51 = this.field1649[var50];
            int var52 = this.field1650[var50];
            int var53 = this.field1651[var50];
            if (arg0 != 0) {
                int var54 = var48 * var53 + var49 * var51 >> 16;
                var53 = var49 * var53 - var48 * var51 >> 16;
                var51 = var54;
            }
            int var55 = arg5 + var51;
            int var56 = arg6 + var52;
            int var57 = arg7 + var53;
            int var58 = arg3 * var57 + arg4 * var55 >> 16;
            int var59 = arg4 * var57 - arg3 * var55 >> 16;
            int var61 = arg2 * var56 - arg1 * var59 >> 16;
            int var62 = arg1 * var56 + arg2 * var59 >> 16;
            field1668[var50] = var62 - var12;
            if (var62 >= 50) {
                field1685[var50] = class131.field1745 * var58 / var62 + var46;
                field1686[var50] = class131.field1745 * var61 / var62 + var47;
            } else {
                field1685[var50] = -5000;
                var24 = true;
            }
            if (var26) {
                field1688[var50] = var58;
                field1689[var50] = var61;
                field1707[var50] = var62;
            }
        }
        try {
            this.method2639(var24, var37, this.field1644, arg8);
        } catch (Exception var65) {
        }
    }

    @ObfuscatedName("du.v(ZZZJ)V")
    public final void method2639(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field1674 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field1674; var6++) {
            field1692[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field1652; var8++) {
            if (this.field1658[var8] != -2) {
                int var9 = this.field1653[var8];
                int var10 = this.field1654[var8];
                int var11 = this.field1687[var8];
                int var12 = field1685[var9];
                int var13 = field1685[var10];
                int var14 = field1685[var11];
                if (arg0 && var12 == -5000 || var13 == -5000 || var14 == -5000) {
                    int var15 = field1688[var9];
                    int var16 = field1688[var10];
                    int var17 = field1688[var11];
                    int var18 = field1689[var9];
                    int var19 = field1689[var10];
                    int var20 = field1689[var11];
                    int var21 = field1707[var9];
                    int var22 = field1707[var10];
                    int var23 = field1707[var11];
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
                        field1684[var8] = true;
                        int var33 = (field1668[var9] + field1668[var10] + field1668[var11]) / 3 + this.field1675;
                        field1693[var33][field1692[var33]++] = var8;
                    }
                } else {
                    if (arg1 && class129.method4747(field1686[var9], field1686[var10], field1686[var11], var12, var13, var14, var7)) {
                        class129.method1902(arg3);
                        arg1 = false;
                    }
                    if ((field1686[var11] - field1686[var10]) * (var12 - var13) - (field1686[var9] - field1686[var10]) * (var14 - var13) > 0) {
                        field1684[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field1739 && var13 <= Statics.field1739 && var14 <= Statics.field1739) {
                            field1671[var8] = false;
                        } else {
                            field1671[var8] = true;
                        }
                        int var34 = (field1668[var9] + field1668[var10] + field1668[var11]) / 3 + this.field1675;
                        field1693[var34][field1692[var34]++] = var8;
                    }
                }
            }
        }
        if (this.field1659 == null) {
            for (int var35 = this.field1674 - 1; var35 >= 0; var35--) {
                int var36 = field1692[var35];
                if (var36 > 0) {
                    int[] var37 = field1693[var35];
                    for (int var38 = 0; var38 < var36; var38++) {
                        this.method2640(var37[var38]);
                    }
                }
            }
            return;
        }
        for (int var39 = 0; var39 < 12; var39++) {
            field1696[var39] = 0;
            field1698[var39] = 0;
        }
        for (int var40 = this.field1674 - 1; var40 >= 0; var40--) {
            int var41 = field1692[var40];
            if (var41 > 0) {
                int[] var42 = field1693[var40];
                for (int var43 = 0; var43 < var41; var43++) {
                    int var44 = var42[var43];
                    byte var45 = this.field1659[var44];
                    int var46 = field1696[var45]++;
                    field1670[var45][var46] = var44;
                    if (var45 < 10) {
                        field1698[var45] += var40;
                    } else if (var45 == 10) {
                        field1655[var46] = var40;
                    } else {
                        field1697[var46] = var40;
                    }
                }
            }
        }
        int var47 = 0;
        if (field1696[1] > 0 || field1696[2] > 0) {
            var47 = (field1698[1] + field1698[2]) / (field1696[1] + field1696[2]);
        }
        int var48 = 0;
        if (field1696[3] > 0 || field1696[4] > 0) {
            var48 = (field1698[3] + field1698[4]) / (field1696[3] + field1696[4]);
        }
        int var49 = 0;
        if (field1696[6] > 0 || field1696[8] > 0) {
            var49 = (field1698[6] + field1698[8]) / (field1696[6] + field1696[8]);
        }
        int var50 = 0;
        int var51 = field1696[10];
        int[] var52 = field1670[10];
        int[] var53 = field1655;
        if (var50 == var51) {
            var50 = 0;
            var51 = field1696[11];
            var52 = field1670[11];
            var53 = field1697;
        }
        int var54;
        if (var50 < var51) {
            var54 = var53[var50];
        } else {
            var54 = -1000;
        }
        for (int var55 = 0; var55 < 10; var55++) {
            while (var55 == 0 && var54 > var47) {
                this.method2640(var52[var50++]);
                if (var50 == var51 && field1670[11] != var52) {
                    var50 = 0;
                    var51 = field1696[11];
                    var52 = field1670[11];
                    var53 = field1697;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            while (var55 == 3 && var54 > var48) {
                this.method2640(var52[var50++]);
                if (var50 == var51 && field1670[11] != var52) {
                    var50 = 0;
                    var51 = field1696[11];
                    var52 = field1670[11];
                    var53 = field1697;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            while (var55 == 5 && var54 > var49) {
                this.method2640(var52[var50++]);
                if (var50 == var51 && field1670[11] != var52) {
                    var50 = 0;
                    var51 = field1696[11];
                    var52 = field1670[11];
                    var53 = field1697;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            int var56 = field1696[var55];
            int[] var57 = field1670[var55];
            for (int var58 = 0; var58 < var56; var58++) {
                this.method2640(var57[var58]);
            }
        }
        while (var54 != -1000) {
            this.method2640(var52[var50++]);
            if (var50 == var51 && field1670[11] != var52) {
                var50 = 0;
                var52 = field1670[11];
                var51 = field1696[11];
                var53 = field1697;
            }
            if (var50 < var51) {
                var54 = var53[var50];
            } else {
                var54 = -1000;
            }
        }
    }

    @ObfuscatedName("du.ag(I)V")
    public final void method2640(int arg0) {
        if (field1684[arg0]) {
            this.method2641(arg0);
            return;
        }
        int var2 = this.field1653[arg0];
        int var3 = this.field1654[arg0];
        int var4 = this.field1687[arg0];
        class131.field1740 = field1671[arg0];
        if (this.field1660 == null) {
            class131.field1756 = 0;
        } else {
            class131.field1756 = this.field1660[arg0] & 0xFF;
        }
        if (this.field1662 != null && this.field1662[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1661 == null || this.field1661[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1661[arg0] & 0xFF;
                var6 = this.field1665[var5];
                var7 = this.field1694[var5];
                var8 = this.field1676[var5];
            }
            if (this.field1658[arg0] == -1) {
                class131.method2735(field1686[var2], field1686[var3], field1686[var4], field1685[var2], field1685[var3], field1685[var4], this.field1656[arg0], this.field1656[arg0], this.field1656[arg0], field1688[var6], field1688[var7], field1688[var8], field1689[var6], field1689[var7], field1689[var8], field1707[var6], field1707[var7], field1707[var8], this.field1662[arg0]);
            } else {
                class131.method2735(field1686[var2], field1686[var3], field1686[var4], field1685[var2], field1685[var3], field1685[var4], this.field1656[arg0], this.field1695[arg0], this.field1658[arg0], field1688[var6], field1688[var7], field1688[var8], field1689[var6], field1689[var7], field1689[var8], field1707[var6], field1707[var7], field1707[var8], this.field1662[arg0]);
            }
        } else if (this.field1658[arg0] == -1) {
            class131.method2769(field1686[var2], field1686[var3], field1686[var4], field1685[var2], field1685[var3], field1685[var4], field1645[this.field1656[arg0]]);
        } else {
            class131.method2786(field1686[var2], field1686[var3], field1686[var4], field1685[var2], field1685[var3], field1685[var4], this.field1656[arg0], this.field1695[arg0], this.field1658[arg0]);
        }
    }

    @ObfuscatedName("du.aq(I)V")
    public final void method2641(int arg0) {
        int var2 = Statics.field1746;
        int var3 = Statics.field1747;
        int var4 = 0;
        int var5 = this.field1653[arg0];
        int var6 = this.field1654[arg0];
        int var7 = this.field1687[arg0];
        int var8 = field1707[var5];
        int var9 = field1707[var6];
        int var10 = field1707[var7];
        if (this.field1660 == null) {
            class131.field1756 = 0;
        } else {
            class131.field1756 = this.field1660[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1699[var4] = field1685[var5];
            field1657[var4] = field1686[var5];
            field1700[var4++] = this.field1656[arg0];
        } else {
            int var11 = field1688[var5];
            int var12 = field1689[var5];
            int var13 = this.field1656[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1711[var10 - var8];
                field1699[var4] = (((field1688[var7] - var11) * var14 >> 16) + var11) * class131.field1745 / 50 + var2;
                field1657[var4] = (((field1689[var7] - var12) * var14 >> 16) + var12) * class131.field1745 / 50 + var3;
                field1700[var4++] = ((this.field1658[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1711[var9 - var8];
                field1699[var4] = (((field1688[var6] - var11) * var15 >> 16) + var11) * class131.field1745 / 50 + var2;
                field1657[var4] = (((field1689[var6] - var12) * var15 >> 16) + var12) * class131.field1745 / 50 + var3;
                field1700[var4++] = ((this.field1695[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1699[var4] = field1685[var6];
            field1657[var4] = field1686[var6];
            field1700[var4++] = this.field1695[arg0];
        } else {
            int var16 = field1688[var6];
            int var17 = field1689[var6];
            int var18 = this.field1695[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1711[var8 - var9];
                field1699[var4] = (((field1688[var5] - var16) * var19 >> 16) + var16) * class131.field1745 / 50 + var2;
                field1657[var4] = (((field1689[var5] - var17) * var19 >> 16) + var17) * class131.field1745 / 50 + var3;
                field1700[var4++] = ((this.field1656[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1711[var10 - var9];
                field1699[var4] = (((field1688[var7] - var16) * var20 >> 16) + var16) * class131.field1745 / 50 + var2;
                field1657[var4] = (((field1689[var7] - var17) * var20 >> 16) + var17) * class131.field1745 / 50 + var3;
                field1700[var4++] = ((this.field1658[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1699[var4] = field1685[var7];
            field1657[var4] = field1686[var7];
            field1700[var4++] = this.field1658[arg0];
        } else {
            int var21 = field1688[var7];
            int var22 = field1689[var7];
            int var23 = this.field1658[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1711[var9 - var10];
                field1699[var4] = (((field1688[var6] - var21) * var24 >> 16) + var21) * class131.field1745 / 50 + var2;
                field1657[var4] = (((field1689[var6] - var22) * var24 >> 16) + var22) * class131.field1745 / 50 + var3;
                field1700[var4++] = ((this.field1695[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1711[var8 - var10];
                field1699[var4] = (((field1688[var5] - var21) * var25 >> 16) + var21) * class131.field1745 / 50 + var2;
                field1657[var4] = (((field1689[var5] - var22) * var25 >> 16) + var22) * class131.field1745 / 50 + var3;
                field1700[var4++] = ((this.field1656[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1699[0];
        int var27 = field1699[1];
        int var28 = field1699[2];
        int var29 = field1657[0];
        int var30 = field1657[1];
        int var31 = field1657[2];
        class131.field1740 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1739 || var27 > Statics.field1739 || var28 > Statics.field1739) {
                class131.field1740 = true;
            }
            if (this.field1662 != null && this.field1662[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1661 == null || this.field1661[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1661[arg0] & 0xFF;
                    var33 = this.field1665[var32];
                    var34 = this.field1694[var32];
                    var35 = this.field1676[var32];
                }
                if (this.field1658[arg0] == -1) {
                    class131.method2735(var29, var30, var31, var26, var27, var28, this.field1656[arg0], this.field1656[arg0], this.field1656[arg0], field1688[var33], field1688[var34], field1688[var35], field1689[var33], field1689[var34], field1689[var35], field1707[var33], field1707[var34], field1707[var35], this.field1662[arg0]);
                } else {
                    class131.method2735(var29, var30, var31, var26, var27, var28, field1700[0], field1700[1], field1700[2], field1688[var33], field1688[var34], field1688[var35], field1689[var33], field1689[var34], field1689[var35], field1707[var33], field1707[var34], field1707[var35], this.field1662[arg0]);
                }
            } else if (this.field1658[arg0] == -1) {
                class131.method2769(var29, var30, var31, var26, var27, var28, field1645[this.field1656[arg0]]);
            } else {
                class131.method2786(var29, var30, var31, var26, var27, var28, field1700[0], field1700[1], field1700[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1739 || var27 > Statics.field1739 || var28 > Statics.field1739 || field1699[3] < 0 || field1699[3] > Statics.field1739) {
            class131.field1740 = true;
        }
        if (this.field1662 != null && this.field1662[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1661 == null || this.field1661[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1661[arg0] & 0xFF;
                var37 = this.field1665[var36];
                var38 = this.field1694[var36];
                var39 = this.field1676[var36];
            }
            short var40 = this.field1662[arg0];
            if (this.field1658[arg0] == -1) {
                class131.method2735(var29, var30, var31, var26, var27, var28, this.field1656[arg0], this.field1656[arg0], this.field1656[arg0], field1688[var37], field1688[var38], field1688[var39], field1689[var37], field1689[var38], field1689[var39], field1707[var37], field1707[var38], field1707[var39], var40);
                class131.method2735(var29, var31, field1657[3], var26, var28, field1699[3], this.field1656[arg0], this.field1656[arg0], this.field1656[arg0], field1688[var37], field1688[var38], field1688[var39], field1689[var37], field1689[var38], field1689[var39], field1707[var37], field1707[var38], field1707[var39], var40);
            } else {
                class131.method2735(var29, var30, var31, var26, var27, var28, field1700[0], field1700[1], field1700[2], field1688[var37], field1688[var38], field1688[var39], field1689[var37], field1689[var38], field1689[var39], field1707[var37], field1707[var38], field1707[var39], var40);
                class131.method2735(var29, var31, field1657[3], var26, var28, field1699[3], field1700[0], field1700[2], field1700[3], field1688[var37], field1688[var38], field1688[var39], field1689[var37], field1689[var38], field1689[var39], field1707[var37], field1707[var38], field1707[var39], var40);
            }
        } else if (this.field1658[arg0] == -1) {
            int var41 = field1645[this.field1656[arg0]];
            class131.method2769(var29, var30, var31, var26, var27, var28, var41);
            class131.method2769(var29, var31, field1657[3], var26, var28, field1699[3], var41);
        } else {
            class131.method2786(var29, var30, var31, var26, var27, var28, field1700[0], field1700[1], field1700[2]);
            class131.method2786(var29, var31, field1657[3], var26, var28, field1699[3], field1700[0], field1700[2], field1700[3]);
        }
    }
}
