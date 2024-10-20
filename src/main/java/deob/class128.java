package deob;

@ObfuscatedName("do")
public class class128 extends class136 {

    @ObfuscatedName("do.s")
    public static class128 field1719 = new class128();

    @ObfuscatedName("do.j")
    public static byte[] field1651 = new byte[1];

    @ObfuscatedName("do.i")
    public static class128 field1652 = new class128();

    @ObfuscatedName("do.k")
    public static byte[] field1653 = new byte[1];

    @ObfuscatedName("do.u")
    public int field1695 = 0;

    @ObfuscatedName("do.n")
    public int[] field1689;

    @ObfuscatedName("do.t")
    public int[] field1656;

    @ObfuscatedName("do.q")
    public int[] field1657;

    @ObfuscatedName("do.x")
    public int field1658 = 0;

    @ObfuscatedName("do.d")
    public int[] field1683;

    @ObfuscatedName("do.f")
    public int[] field1660;

    @ObfuscatedName("do.c")
    public int[] field1686;

    @ObfuscatedName("do.r")
    public int[] field1662;

    @ObfuscatedName("do.y")
    public int[] field1663;

    @ObfuscatedName("do.p")
    public int[] field1668;

    @ObfuscatedName("do.b")
    public byte[] field1665;

    @ObfuscatedName("do.g")
    public byte[] field1666;

    @ObfuscatedName("do.e")
    public byte[] field1667;

    @ObfuscatedName("do.z")
    public short[] field1718;

    @ObfuscatedName("do.a")
    public byte field1691 = 0;

    @ObfuscatedName("do.w")
    public int field1700 = 0;

    @ObfuscatedName("do.l")
    public int[] field1692;

    @ObfuscatedName("do.h")
    public int[] field1672;

    @ObfuscatedName("do.v")
    public int[] field1673;

    @ObfuscatedName("do.m")
    public int[][] field1674;

    @ObfuscatedName("do.o")
    public int[][] field1675;

    @ObfuscatedName("do.av")
    public boolean field1676 = false;

    @ObfuscatedName("do.am")
    public int field1713;

    @ObfuscatedName("do.ai")
    public int field1678;

    @ObfuscatedName("do.af")
    public int field1685;

    @ObfuscatedName("do.az")
    public int field1680;

    @ObfuscatedName("do.aj")
    public int field1681;

    @ObfuscatedName("do.an")
    public int field1682;

    @ObfuscatedName("do.at")
    public int field1694;

    @ObfuscatedName("do.as")
    public int field1669;

    @ObfuscatedName("do.ak")
    public int field1684 = -1;

    @ObfuscatedName("do.ao")
    public int field1659 = -1;

    @ObfuscatedName("do.ac")
    public int field1687 = -1;

    @ObfuscatedName("do.au")
    public static boolean[] field1671 = new boolean[4700];

    @ObfuscatedName("do.ax")
    public static boolean[] field1690 = new boolean[4700];

    @ObfuscatedName("do.ag")
    public static int[] field1650 = new int[4700];

    @ObfuscatedName("do.aa")
    public static int[] field1703 = new int[4700];

    @ObfuscatedName("do.ap")
    public static int[] field1693 = new int[4700];

    @ObfuscatedName("do.aq")
    public static int[] field1709 = new int[4700];

    @ObfuscatedName("do.ay")
    public static int[] field1664 = new int[4700];

    @ObfuscatedName("do.ad")
    public static int[] field1696 = new int[4700];

    @ObfuscatedName("do.ah")
    public static int[] field1697 = new int[1600];

    @ObfuscatedName("do.ab")
    public static int[][] field1699 = new int[1600][512];

    @ObfuscatedName("do.aw")
    public static int[] field1670 = new int[12];

    @ObfuscatedName("do.ae")
    public static int[][] field1701 = new int[12][2000];

    @ObfuscatedName("do.bk")
    public static int[] field1702 = new int[2000];

    @ObfuscatedName("do.bw")
    public static int[] field1661 = new int[2000];

    @ObfuscatedName("do.bo")
    public static int[] field1704 = new int[12];

    @ObfuscatedName("do.bn")
    public static int[] field1705 = new int[10];

    @ObfuscatedName("do.bp")
    public static int[] field1706 = new int[10];

    @ObfuscatedName("do.bz")
    public static int[] field1707 = new int[10];

    @ObfuscatedName("do.bq")
    public static boolean field1711 = true;

    @ObfuscatedName("do.bi")
    public static int[] field1714 = class131.field1767;

    @ObfuscatedName("do.bf")
    public static int[] field1715 = class131.field1768;

    @ObfuscatedName("do.bd")
    public static int[] field1716 = class131.field1763;

    @ObfuscatedName("do.br")
    public static int[] field1717 = class131.field1766;

    public class128() {
    }

    public class128(class128[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1695 = 0;
        this.field1658 = 0;
        this.field1700 = 0;
        this.field1691 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class128 var8 = arg0[var7];
            if (var8 != null) {
                this.field1695 += var8.field1695;
                this.field1658 += var8.field1658;
                this.field1700 += var8.field1700;
                if (var8.field1665 == null) {
                    if (this.field1691 == -1) {
                        this.field1691 = var8.field1691;
                    }
                    if (this.field1691 != var8.field1691) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1666 != null;
                var5 |= var8.field1718 != null;
                var6 |= var8.field1667 != null;
            }
        }
        this.field1689 = new int[this.field1695];
        this.field1656 = new int[this.field1695];
        this.field1657 = new int[this.field1695];
        this.field1683 = new int[this.field1658];
        this.field1660 = new int[this.field1658];
        this.field1686 = new int[this.field1658];
        this.field1662 = new int[this.field1658];
        this.field1663 = new int[this.field1658];
        this.field1668 = new int[this.field1658];
        if (var3) {
            this.field1665 = new byte[this.field1658];
        }
        if (var4) {
            this.field1666 = new byte[this.field1658];
        }
        if (var5) {
            this.field1718 = new short[this.field1658];
        }
        if (var6) {
            this.field1667 = new byte[this.field1658];
        }
        if (this.field1700 > 0) {
            this.field1692 = new int[this.field1700];
            this.field1672 = new int[this.field1700];
            this.field1673 = new int[this.field1700];
        }
        this.field1695 = 0;
        this.field1658 = 0;
        this.field1700 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class128 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1658; var11++) {
                    this.field1683[this.field1658] = var10.field1683[var11] + this.field1695;
                    this.field1660[this.field1658] = var10.field1660[var11] + this.field1695;
                    this.field1686[this.field1658] = var10.field1686[var11] + this.field1695;
                    this.field1662[this.field1658] = var10.field1662[var11];
                    this.field1663[this.field1658] = var10.field1663[var11];
                    this.field1668[this.field1658] = var10.field1668[var11];
                    if (var3) {
                        if (var10.field1665 == null) {
                            this.field1665[this.field1658] = var10.field1691;
                        } else {
                            this.field1665[this.field1658] = var10.field1665[var11];
                        }
                    }
                    if (var4 && var10.field1666 != null) {
                        this.field1666[this.field1658] = var10.field1666[var11];
                    }
                    if (var5) {
                        if (var10.field1718 == null) {
                            this.field1718[this.field1658] = -1;
                        } else {
                            this.field1718[this.field1658] = var10.field1718[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1667 == null || var10.field1667[var11] == -1) {
                            this.field1667[this.field1658] = -1;
                        } else {
                            this.field1667[this.field1658] = (byte) (var10.field1667[var11] + this.field1700);
                        }
                    }
                    this.field1658++;
                }
                for (int var12 = 0; var12 < var10.field1700; var12++) {
                    this.field1692[this.field1700] = var10.field1692[var12] + this.field1695;
                    this.field1672[this.field1700] = var10.field1672[var12] + this.field1695;
                    this.field1673[this.field1700] = var10.field1673[var12] + this.field1695;
                    this.field1700++;
                }
                for (int var13 = 0; var13 < var10.field1695; var13++) {
                    this.field1689[this.field1695] = var10.field1689[var13];
                    this.field1656[this.field1695] = var10.field1656[var13];
                    this.field1657[this.field1695] = var10.field1657[var13];
                    this.field1695++;
                }
            }
        }
    }

    @ObfuscatedName("do.s([[IIIIZI)Ldo;")
    public class128 method2622(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2627();
        int var7 = arg1 - this.field1685;
        int var8 = this.field1685 + arg1;
        int var9 = arg3 - this.field1685;
        int var10 = this.field1685 + arg3;
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
            var15.field1695 = this.field1695;
            var15.field1658 = this.field1658;
            var15.field1700 = this.field1700;
            var15.field1689 = this.field1689;
            var15.field1657 = this.field1657;
            var15.field1683 = this.field1683;
            var15.field1660 = this.field1660;
            var15.field1686 = this.field1686;
            var15.field1662 = this.field1662;
            var15.field1663 = this.field1663;
            var15.field1668 = this.field1668;
            var15.field1665 = this.field1665;
            var15.field1666 = this.field1666;
            var15.field1667 = this.field1667;
            var15.field1718 = this.field1718;
            var15.field1691 = this.field1691;
            var15.field1692 = this.field1692;
            var15.field1672 = this.field1672;
            var15.field1673 = this.field1673;
            var15.field1674 = this.field1674;
            var15.field1675 = this.field1675;
            var15.field1676 = this.field1676;
            var15.field1656 = new int[var15.field1695];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1695; var16++) {
                int var17 = this.field1689[var16] + arg1;
                int var18 = this.field1657[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1656[var16] = this.field1656[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1695; var26++) {
                int var27 = (-this.field1656[var26] << 16) / this.field1851;
                if (var27 < arg5) {
                    int var28 = this.field1689[var26] + arg1;
                    int var29 = this.field1657[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1656[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1656[var26];
                }
            }
        }
        var15.method2630();
        return var15;
    }

    @ObfuscatedName("do.j(Z)Ldo;")
    public class128 method2623(boolean arg0) {
        if (!arg0 && field1651.length < this.field1658) {
            field1651 = new byte[this.field1658 + 100];
        }
        return this.method2625(arg0, field1719, field1651);
    }

    @ObfuscatedName("do.i(Z)Ldo;")
    public class128 method2624(boolean arg0) {
        if (!arg0 && field1653.length < this.field1658) {
            field1653 = new byte[this.field1658 + 100];
        }
        return this.method2625(arg0, field1652, field1653);
    }

    @ObfuscatedName("do.k(ZLdo;[B)Ldo;")
    public class128 method2625(boolean arg0, class128 arg1, byte[] arg2) {
        arg1.field1695 = this.field1695;
        arg1.field1658 = this.field1658;
        arg1.field1700 = this.field1700;
        if (arg1.field1689 == null || arg1.field1689.length < this.field1695) {
            arg1.field1689 = new int[this.field1695 + 100];
            arg1.field1656 = new int[this.field1695 + 100];
            arg1.field1657 = new int[this.field1695 + 100];
        }
        for (int var4 = 0; var4 < this.field1695; var4++) {
            arg1.field1689[var4] = this.field1689[var4];
            arg1.field1656[var4] = this.field1656[var4];
            arg1.field1657[var4] = this.field1657[var4];
        }
        if (arg0) {
            arg1.field1666 = this.field1666;
        } else {
            arg1.field1666 = arg2;
            if (this.field1666 == null) {
                for (int var5 = 0; var5 < this.field1658; var5++) {
                    arg1.field1666[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1658; var6++) {
                    arg1.field1666[var6] = this.field1666[var6];
                }
            }
        }
        arg1.field1683 = this.field1683;
        arg1.field1660 = this.field1660;
        arg1.field1686 = this.field1686;
        arg1.field1662 = this.field1662;
        arg1.field1663 = this.field1663;
        arg1.field1668 = this.field1668;
        arg1.field1665 = this.field1665;
        arg1.field1667 = this.field1667;
        arg1.field1718 = this.field1718;
        arg1.field1691 = this.field1691;
        arg1.field1692 = this.field1692;
        arg1.field1672 = this.field1672;
        arg1.field1673 = this.field1673;
        arg1.field1674 = this.field1674;
        arg1.field1675 = this.field1675;
        arg1.field1676 = this.field1676;
        arg1.method2630();
        return arg1;
    }

    @ObfuscatedName("do.u(I)V")
    public void method2626(int arg0) {
        if (this.field1684 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1715[arg0];
        int var9 = field1714[arg0];
        for (int var10 = 0; var10 < this.field1695; var10++) {
            int var11 = class131.method2761(this.field1689[var10], this.field1657[var10], var8, var9);
            int var12 = this.field1656[var10];
            int var13 = class131.method2762(this.field1689[var10], this.field1657[var10], var8, var9);
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
        this.field1694 = (var3 + var6) / 2;
        this.field1669 = (var4 + var7) / 2;
        this.field1684 = (var5 - var2 + 1) / 2;
        this.field1659 = (var6 - var3 + 1) / 2;
        this.field1687 = (var7 - var4 + 1) / 2;
        if (this.field1684 < 32) {
            this.field1684 = 32;
        }
        if (this.field1687 < 32) {
            this.field1687 = 32;
        }
        if (this.field1676) {
            this.field1684 += 8;
            this.field1687 += 8;
        }
    }

    @ObfuscatedName("do.n()V")
    public void method2627() {
        if (this.field1713 == 1) {
            return;
        }
        this.field1713 = 1;
        this.field1851 = 0;
        this.field1678 = 0;
        this.field1685 = 0;
        for (int var1 = 0; var1 < this.field1695; var1++) {
            int var2 = this.field1689[var1];
            int var3 = this.field1656[var1];
            int var4 = this.field1657[var1];
            if (-var3 > this.field1851) {
                this.field1851 = -var3;
            }
            if (var3 > this.field1678) {
                this.field1678 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1685) {
                this.field1685 = var5;
            }
        }
        this.field1685 = (int) (Math.sqrt((double) this.field1685) + 0.99D);
        this.field1681 = (int) (Math.sqrt((double) (this.field1851 * this.field1851 + this.field1685 * this.field1685)) + 0.99D);
        this.field1680 = this.field1681 + (int) (Math.sqrt((double) (this.field1685 * this.field1685 + this.field1678 * this.field1678)) + 0.99D);
    }

    @ObfuscatedName("do.t()V")
    public void method2705() {
        if (this.field1713 == 2) {
            return;
        }
        this.field1713 = 2;
        this.field1685 = 0;
        for (int var1 = 0; var1 < this.field1695; var1++) {
            int var2 = this.field1689[var1];
            int var3 = this.field1656[var1];
            int var4 = this.field1657[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1685) {
                this.field1685 = var5;
            }
        }
        this.field1685 = (int) (Math.sqrt((double) this.field1685) + 0.99D);
        this.field1681 = this.field1685;
        this.field1680 = this.field1685 + this.field1685;
    }

    @ObfuscatedName("do.q()I")
    public int method2657() {
        this.method2627();
        return this.field1685;
    }

    @ObfuscatedName("do.d()V")
    public void method2630() {
        this.field1713 = 0;
        this.field1684 = -1;
    }

    @ObfuscatedName("do.f(Lee;I)V")
    public void method2631(class139 arg0, int arg1) {
        if (this.field1674 == null || arg1 == -1) {
            return;
        }
        class126 var3 = arg0.field1871[arg1];
        class133 var4 = var3.field1619;
        Statics.field1654 = 0;
        Statics.field1655 = 0;
        Statics.field1698 = 0;
        for (int var5 = 0; var5 < var3.field1617; var5++) {
            int var6 = var3.field1621[var5];
            this.method2620(var4.field1776[var6], var4.field1778[var6], var3.field1623[var5], var3.field1615[var5], var3.field1624[var5]);
        }
        this.method2630();
    }

    @ObfuscatedName("do.c(Lee;ILee;I[I)V")
    public void method2632(class139 arg0, int arg1, class139 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2631(arg0, arg1);
            return;
        }
        class126 var6 = arg0.field1871[arg1];
        class126 var7 = arg2.field1871[arg3];
        class133 var8 = var6.field1619;
        Statics.field1654 = 0;
        Statics.field1655 = 0;
        Statics.field1698 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1617; var11++) {
            int var12 = var6.field1621[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1776[var12] == 0) {
                this.method2620(var8.field1776[var12], var8.field1778[var12], var6.field1623[var11], var6.field1615[var11], var6.field1624[var11]);
            }
        }
        Statics.field1654 = 0;
        Statics.field1655 = 0;
        Statics.field1698 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1617; var15++) {
            int var16 = var7.field1621[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1776[var16] == 0) {
                this.method2620(var8.field1776[var16], var8.field1778[var16], var7.field1623[var15], var7.field1615[var15], var7.field1624[var15]);
            }
        }
        this.method2630();
    }

    @ObfuscatedName("do.r(I[IIII)V")
    public void method2620(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1654 = 0;
            Statics.field1655 = 0;
            Statics.field1698 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1674.length) {
                    int[] var10 = this.field1674[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1654 += this.field1689[var12];
                        Statics.field1655 += this.field1656[var12];
                        Statics.field1698 += this.field1657[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1654 = Statics.field1654 / var7 + arg2;
                Statics.field1655 = Statics.field1655 / var7 + arg3;
                Statics.field1698 = Statics.field1698 / var7 + arg4;
            } else {
                Statics.field1654 = arg2;
                Statics.field1655 = arg3;
                Statics.field1698 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1674.length) {
                    int[] var15 = this.field1674[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1689[var17] += arg2;
                        this.field1656[var17] += arg3;
                        this.field1657[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1674.length) {
                    int[] var20 = this.field1674[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1689[var22] -= Statics.field1654;
                        this.field1656[var22] -= Statics.field1655;
                        this.field1657[var22] -= Statics.field1698;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1714[var25];
                            int var27 = field1715[var25];
                            int var28 = this.field1689[var22] * var27 + this.field1656[var22] * var26 >> 16;
                            this.field1656[var22] = this.field1656[var22] * var27 - this.field1689[var22] * var26 >> 16;
                            this.field1689[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1714[var23];
                            int var30 = field1715[var23];
                            int var31 = this.field1656[var22] * var30 - this.field1657[var22] * var29 >> 16;
                            this.field1657[var22] = this.field1657[var22] * var30 + this.field1656[var22] * var29 >> 16;
                            this.field1656[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1714[var24];
                            int var33 = field1715[var24];
                            int var34 = this.field1689[var22] * var33 + this.field1657[var22] * var32 >> 16;
                            this.field1657[var22] = this.field1657[var22] * var33 - this.field1689[var22] * var32 >> 16;
                            this.field1689[var22] = var34;
                        }
                        this.field1689[var22] += Statics.field1654;
                        this.field1656[var22] += Statics.field1655;
                        this.field1657[var22] += Statics.field1698;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1674.length) {
                    int[] var37 = this.field1674[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1689[var39] -= Statics.field1654;
                        this.field1656[var39] -= Statics.field1655;
                        this.field1657[var39] -= Statics.field1698;
                        this.field1689[var39] = this.field1689[var39] * arg2 / 128;
                        this.field1656[var39] = this.field1656[var39] * arg3 / 128;
                        this.field1657[var39] = this.field1657[var39] * arg4 / 128;
                        this.field1689[var39] += Statics.field1654;
                        this.field1656[var39] += Statics.field1655;
                        this.field1657[var39] += Statics.field1698;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1675 != null && this.field1666 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1675.length) {
                    int[] var42 = this.field1675[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1666[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1666[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("do.y()V")
    public void method2668() {
        for (int var1 = 0; var1 < this.field1695; var1++) {
            int var2 = this.field1689[var1];
            this.field1689[var1] = this.field1657[var1];
            this.field1657[var1] = -var2;
        }
        this.method2630();
    }

    @ObfuscatedName("do.p()V")
    public void method2660() {
        for (int var1 = 0; var1 < this.field1695; var1++) {
            this.field1689[var1] = -this.field1689[var1];
            this.field1657[var1] = -this.field1657[var1];
        }
        this.method2630();
    }

    @ObfuscatedName("do.g()V")
    public void method2636() {
        for (int var1 = 0; var1 < this.field1695; var1++) {
            int var2 = this.field1657[var1];
            this.field1657[var1] = this.field1689[var1];
            this.field1689[var1] = -var2;
        }
        this.method2630();
    }

    @ObfuscatedName("do.e(I)V")
    public void method2637(int arg0) {
        int var2 = field1714[arg0];
        int var3 = field1715[arg0];
        for (int var4 = 0; var4 < this.field1695; var4++) {
            int var5 = this.field1656[var4] * var3 - this.field1657[var4] * var2 >> 16;
            this.field1657[var4] = this.field1657[var4] * var3 + this.field1656[var4] * var2 >> 16;
            this.field1656[var4] = var5;
        }
        this.method2630();
    }

    @ObfuscatedName("do.z(III)V")
    public void method2638(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1695; var4++) {
            this.field1689[var4] += arg0;
            this.field1656[var4] += arg1;
            this.field1657[var4] += arg2;
        }
        this.method2630();
    }

    @ObfuscatedName("do.w(III)V")
    public void method2707(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1695; var4++) {
            this.field1689[var4] = this.field1689[var4] * arg0 / 128;
            this.field1656[var4] = this.field1656[var4] * arg1 / 128;
            this.field1657[var4] = this.field1657[var4] * arg2 / 128;
        }
        this.method2630();
    }

    @ObfuscatedName("do.l(IIIIIII)V")
    public final void method2692(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1697[0] = -1;
        if (this.field1713 != 2 && this.field1713 != 1) {
            this.method2705();
        }
        int var8 = Statics.field1742;
        int var9 = Statics.field1755;
        int var10 = field1714[arg0];
        int var11 = field1715[arg0];
        int var12 = field1714[arg1];
        int var13 = field1715[arg1];
        int var14 = field1714[arg2];
        int var15 = field1715[arg2];
        int var16 = field1714[arg3];
        int var17 = field1715[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1695; var19++) {
            int var20 = this.field1689[var19];
            int var21 = this.field1656[var19];
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
            field1693[var19] = var30 - var18;
            field1650[var19] = class131.field1753 * var26 / var30 + var8;
            field1703[var19] = class131.field1753 * var29 / var30 + var9;
            if (this.field1700 > 0) {
                field1709[var19] = var26;
                field1664[var19] = var29;
                field1696[var19] = var30;
            }
        }
        try {
            this.method2643(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("do.h(IIIIIIII)V")
    public final void method2628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1697[0] = -1;
        if (this.field1713 != 2 && this.field1713 != 1) {
            this.method2705();
        }
        int var9 = Statics.field1742;
        int var10 = Statics.field1755;
        int var11 = field1714[arg0];
        int var12 = field1715[arg0];
        int var13 = field1714[arg1];
        int var14 = field1715[arg1];
        int var15 = field1714[arg2];
        int var16 = field1715[arg2];
        int var17 = field1714[arg3];
        int var18 = field1715[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1695; var20++) {
            int var21 = this.field1689[var20];
            int var22 = this.field1656[var20];
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
            field1693[var20] = var31 - var19;
            field1650[var20] = class131.field1753 * var27 / arg7 + var9;
            field1703[var20] = class131.field1753 * var30 / arg7 + var10;
            if (this.field1700 > 0) {
                field1709[var20] = var27;
                field1664[var20] = var30;
                field1696[var20] = var31;
            }
        }
        try {
            this.method2643(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("do.cm(IIIIIIIIJ)V")
    public void method2642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1697[0] = -1;
        if (this.field1713 != 1) {
            this.method2627();
        }
        this.method2626(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field1685 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field1685) * class131.field1753;
        if (var16 / var14 >= Statics.field1754) {
            return;
        }
        int var17 = (this.field1685 + var15) * class131.field1753;
        if (var17 / var14 <= Statics.field1759) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field1685 * arg1 >> 16;
        int var20 = (var18 + var19) * class131.field1753;
        if (var20 / var14 <= Statics.field1744) {
            return;
        }
        int var21 = (this.field1851 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class131.field1753;
        if (var22 / var14 >= Statics.field1747) {
            return;
        }
        int var23 = (this.field1851 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field1700 > 0;
        int var27 = class129.method1057();
        int var28 = class129.field1720;
        boolean var30 = class129.method3349();
        boolean var31 = class129.method4020(arg8);
        boolean var32 = false;
        if (var31 && var30) {
            boolean var33 = false;
            if (field1711) {
                boolean var35;
                if (class129.method3349()) {
                    if (!class129.field1723) {
                        int var36 = Statics.field1812;
                        int var37 = Statics.field1801;
                        int var38 = Statics.field1809;
                        int var39 = Statics.field1810;
                        byte var40 = 50;
                        short var41 = 3500;
                        int var42 = (class129.field1721 - Statics.field1742) * var40 / class131.field1753;
                        int var43 = (class129.field1720 - Statics.field1755) * var40 / class131.field1753;
                        int var44 = (class129.field1721 - Statics.field1742) * var41 / class131.field1753;
                        int var45 = (class129.field1720 - Statics.field1755) * var41 / class131.field1753;
                        int var46 = class131.method2765(var43, var40, var37, var36);
                        int var47 = class131.method2764(var43, var40, var37, var36);
                        int var49 = class131.method2765(var45, var41, var37, var36);
                        int var50 = class131.method2764(var45, var41, var37, var36);
                        int var52 = class131.method2763(var42, var47, var39, var38);
                        int var53 = class131.method2781(var42, var47, var39, var38);
                        int var55 = class131.method2763(var44, var50, var39, var38);
                        int var56 = class131.method2781(var44, var50, var39, var38);
                        Statics.field1724 = (var52 + var55) / 2;
                        Statics.field1725 = (var46 + var49) / 2;
                        Statics.field2329 = (var53 + var56) / 2;
                        Statics.field1726 = (var55 - var52) / 2;
                        Statics.field1727 = (var49 - var46) / 2;
                        Statics.field51 = (var56 - var53) / 2;
                        Statics.field1425 = Math.abs(Statics.field1726);
                        Statics.field390 = Math.abs(Statics.field1727);
                        Statics.field1728 = Math.abs(Statics.field51);
                    }
                    int var58 = this.field1682 + arg5;
                    int var59 = this.field1694 + arg6;
                    int var60 = this.field1669 + arg7;
                    int var61 = this.field1684;
                    int var62 = this.field1659;
                    int var63 = this.field1687;
                    int var64 = Statics.field1724 - var58;
                    int var65 = Statics.field1725 - var59;
                    int var66 = Statics.field2329 - var60;
                    if (Math.abs(var64) > Statics.field1425 + var61) {
                        var35 = false;
                    } else if (Math.abs(var65) > Statics.field390 + var62) {
                        var35 = false;
                    } else if (Math.abs(var66) > Statics.field1728 + var63) {
                        var35 = false;
                    } else if (Math.abs(Statics.field1727 * var66 - Statics.field51 * var65) > Statics.field390 * var63 + Statics.field1728 * var62) {
                        var35 = false;
                    } else if (Math.abs(Statics.field51 * var64 - Statics.field1726 * var66) > Statics.field1728 * var61 + Statics.field1425 * var63) {
                        var35 = false;
                    } else if (Math.abs(Statics.field1726 * var65 - Statics.field1727 * var64) > Statics.field390 * var61 + Statics.field1425 * var62) {
                        var35 = false;
                    } else {
                        var35 = true;
                    }
                } else {
                    var35 = false;
                }
                var33 = var35;
            } else {
                int var67 = var12 - var13;
                if (var67 <= 50) {
                    var67 = 50;
                }
                int var68;
                int var69;
                if (var15 > 0) {
                    var68 = var16 / var14;
                    var69 = var17 / var67;
                } else {
                    var69 = var17 / var14;
                    var68 = var16 / var67;
                }
                int var70;
                int var71;
                if (var18 > 0) {
                    var70 = var22 / var14;
                    var71 = var20 / var67;
                } else {
                    var71 = var20 / var14;
                    var70 = var22 / var67;
                }
                int var72 = var27 - Statics.field1742;
                int var73 = var28 - Statics.field1755;
                if (var72 > var68 && var72 < var69 && var73 > var70 && var73 < var71) {
                    var33 = true;
                }
            }
            if (var33) {
                if (this.field1676) {
                    class129.method629(arg8);
                } else {
                    var32 = true;
                }
            }
        }
        int var74 = Statics.field1742;
        int var75 = Statics.field1755;
        int var76 = 0;
        int var77 = 0;
        if (arg0 != 0) {
            var76 = field1714[arg0];
            var77 = field1715[arg0];
        }
        for (int var78 = 0; var78 < this.field1695; var78++) {
            int var79 = this.field1689[var78];
            int var80 = this.field1656[var78];
            int var81 = this.field1657[var78];
            if (arg0 != 0) {
                int var82 = var76 * var81 + var77 * var79 >> 16;
                var81 = var77 * var81 - var76 * var79 >> 16;
                var79 = var82;
            }
            int var83 = arg5 + var79;
            int var84 = arg6 + var80;
            int var85 = arg7 + var81;
            int var86 = arg3 * var85 + arg4 * var83 >> 16;
            int var87 = arg4 * var85 - arg3 * var83 >> 16;
            int var89 = arg2 * var84 - arg1 * var87 >> 16;
            int var90 = arg1 * var84 + arg2 * var87 >> 16;
            field1693[var78] = var90 - var12;
            if (var90 >= 50) {
                field1650[var78] = class131.field1753 * var86 / var90 + var74;
                field1703[var78] = class131.field1753 * var89 / var90 + var75;
            } else {
                field1650[var78] = -5000;
                var24 = true;
            }
            if (var26) {
                field1709[var78] = var86;
                field1664[var78] = var89;
                field1696[var78] = var90;
            }
        }
        try {
            this.method2643(var24, var32, this.field1676, arg8);
        } catch (Exception var93) {
        }
    }

    @ObfuscatedName("do.v(ZZZJ)V")
    public final void method2643(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field1680 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field1680; var6++) {
            field1697[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field1658; var8++) {
            if (this.field1668[var8] != -2) {
                int var9 = this.field1683[var8];
                int var10 = this.field1660[var8];
                int var11 = this.field1686[var8];
                int var12 = field1650[var9];
                int var13 = field1650[var10];
                int var14 = field1650[var11];
                if (arg0 && var12 == -5000 || var13 == -5000 || var14 == -5000) {
                    int var15 = field1709[var9];
                    int var16 = field1709[var10];
                    int var17 = field1709[var11];
                    int var18 = field1664[var9];
                    int var19 = field1664[var10];
                    int var20 = field1664[var11];
                    int var21 = field1696[var9];
                    int var22 = field1696[var10];
                    int var23 = field1696[var11];
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
                        field1690[var8] = true;
                        int var33 = (field1693[var9] + field1693[var10] + field1693[var11]) / 3 + this.field1681;
                        field1699[var33][field1697[var33]++] = var8;
                    }
                } else {
                    if (arg1) {
                        int var34 = field1703[var9];
                        int var35 = field1703[var10];
                        int var36 = field1703[var11];
                        int var37 = class129.field1720 + var7;
                        boolean var38;
                        if (var37 < var34 && var37 < var35 && var37 < var36) {
                            var38 = false;
                        } else {
                            int var39 = class129.field1720 - var7;
                            if (var39 > var34 && var39 > var35 && var39 > var36) {
                                var38 = false;
                            } else {
                                int var40 = class129.field1721 + var7;
                                if (var40 < var12 && var40 < var13 && var40 < var14) {
                                    var38 = false;
                                } else {
                                    int var41 = class129.field1721 - var7;
                                    if (var41 > var12 && var41 > var13 && var41 > var14) {
                                        var38 = false;
                                    } else {
                                        var38 = true;
                                    }
                                }
                            }
                        }
                        if (var38) {
                            class129.method629(arg3);
                            arg1 = false;
                        }
                    }
                    if ((field1703[var11] - field1703[var10]) * (var12 - var13) - (field1703[var9] - field1703[var10]) * (var14 - var13) > 0) {
                        field1690[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field1756 && var13 <= Statics.field1756 && var14 <= Statics.field1756) {
                            field1671[var8] = false;
                        } else {
                            field1671[var8] = true;
                        }
                        int var42 = (field1693[var9] + field1693[var10] + field1693[var11]) / 3 + this.field1681;
                        field1699[var42][field1697[var42]++] = var8;
                    }
                }
            }
        }
        if (this.field1665 == null) {
            for (int var43 = this.field1680 - 1; var43 >= 0; var43--) {
                int var44 = field1697[var43];
                if (var44 > 0) {
                    int[] var45 = field1699[var43];
                    for (int var46 = 0; var46 < var44; var46++) {
                        this.method2648(var45[var46]);
                    }
                }
            }
            return;
        }
        for (int var47 = 0; var47 < 12; var47++) {
            field1670[var47] = 0;
            field1704[var47] = 0;
        }
        for (int var48 = this.field1680 - 1; var48 >= 0; var48--) {
            int var49 = field1697[var48];
            if (var49 > 0) {
                int[] var50 = field1699[var48];
                for (int var51 = 0; var51 < var49; var51++) {
                    int var52 = var50[var51];
                    byte var53 = this.field1665[var52];
                    int var54 = field1670[var53]++;
                    field1701[var53][var54] = var52;
                    if (var53 < 10) {
                        field1704[var53] += var48;
                    } else if (var53 == 10) {
                        field1702[var54] = var48;
                    } else {
                        field1661[var54] = var48;
                    }
                }
            }
        }
        int var55 = 0;
        if (field1670[1] > 0 || field1670[2] > 0) {
            var55 = (field1704[1] + field1704[2]) / (field1670[1] + field1670[2]);
        }
        int var56 = 0;
        if (field1670[3] > 0 || field1670[4] > 0) {
            var56 = (field1704[3] + field1704[4]) / (field1670[3] + field1670[4]);
        }
        int var57 = 0;
        if (field1670[6] > 0 || field1670[8] > 0) {
            var57 = (field1704[6] + field1704[8]) / (field1670[6] + field1670[8]);
        }
        int var58 = 0;
        int var59 = field1670[10];
        int[] var60 = field1701[10];
        int[] var61 = field1702;
        if (var58 == var59) {
            var58 = 0;
            var59 = field1670[11];
            var60 = field1701[11];
            var61 = field1661;
        }
        int var62;
        if (var58 < var59) {
            var62 = var61[var58];
        } else {
            var62 = -1000;
        }
        for (int var63 = 0; var63 < 10; var63++) {
            while (var63 == 0 && var62 > var55) {
                this.method2648(var60[var58++]);
                if (var58 == var59 && field1701[11] != var60) {
                    var58 = 0;
                    var59 = field1670[11];
                    var60 = field1701[11];
                    var61 = field1661;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            while (var63 == 3 && var62 > var56) {
                this.method2648(var60[var58++]);
                if (var58 == var59 && field1701[11] != var60) {
                    var58 = 0;
                    var59 = field1670[11];
                    var60 = field1701[11];
                    var61 = field1661;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            while (var63 == 5 && var62 > var57) {
                this.method2648(var60[var58++]);
                if (var58 == var59 && field1701[11] != var60) {
                    var58 = 0;
                    var59 = field1670[11];
                    var60 = field1701[11];
                    var61 = field1661;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            int var64 = field1670[var63];
            int[] var65 = field1701[var63];
            for (int var66 = 0; var66 < var64; var66++) {
                this.method2648(var65[var66]);
            }
        }
        while (var62 != -1000) {
            this.method2648(var60[var58++]);
            if (var58 == var59 && field1701[11] != var60) {
                var58 = 0;
                var60 = field1701[11];
                var59 = field1670[11];
                var61 = field1661;
            }
            if (var58 < var59) {
                var62 = var61[var58];
            } else {
                var62 = -1000;
            }
        }
    }

    @ObfuscatedName("do.m(I)V")
    public final void method2648(int arg0) {
        if (field1690[arg0]) {
            this.method2647(arg0);
            return;
        }
        int var2 = this.field1683[arg0];
        int var3 = this.field1660[arg0];
        int var4 = this.field1686[arg0];
        class131.field1761 = field1671[arg0];
        if (this.field1666 == null) {
            class131.field1758 = 0;
        } else {
            class131.field1758 = this.field1666[arg0] & 0xFF;
        }
        if (this.field1718 != null && this.field1718[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1667 == null || this.field1667[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1667[arg0] & 0xFF;
                var6 = this.field1692[var5];
                var7 = this.field1672[var5];
                var8 = this.field1673[var5];
            }
            if (this.field1668[arg0] == -1) {
                class131.method2756(field1703[var2], field1703[var3], field1703[var4], field1650[var2], field1650[var3], field1650[var4], this.field1662[arg0], this.field1662[arg0], this.field1662[arg0], field1709[var6], field1709[var7], field1709[var8], field1664[var6], field1664[var7], field1664[var8], field1696[var6], field1696[var7], field1696[var8], this.field1718[arg0]);
            } else {
                class131.method2756(field1703[var2], field1703[var3], field1703[var4], field1650[var2], field1650[var3], field1650[var4], this.field1662[arg0], this.field1663[arg0], this.field1668[arg0], field1709[var6], field1709[var7], field1709[var8], field1664[var6], field1664[var7], field1664[var8], field1696[var6], field1696[var7], field1696[var8], this.field1718[arg0]);
            }
        } else if (this.field1668[arg0] == -1) {
            class131.method2754(field1703[var2], field1703[var3], field1703[var4], field1650[var2], field1650[var3], field1650[var4], field1716[this.field1662[arg0]]);
        } else {
            class131.method2752(field1703[var2], field1703[var3], field1703[var4], field1650[var2], field1650[var3], field1650[var4], this.field1662[arg0], this.field1663[arg0], this.field1668[arg0]);
        }
    }

    @ObfuscatedName("do.o(I)V")
    public final void method2647(int arg0) {
        int var2 = Statics.field1742;
        int var3 = Statics.field1755;
        int var4 = 0;
        int var5 = this.field1683[arg0];
        int var6 = this.field1660[arg0];
        int var7 = this.field1686[arg0];
        int var8 = field1696[var5];
        int var9 = field1696[var6];
        int var10 = field1696[var7];
        if (this.field1666 == null) {
            class131.field1758 = 0;
        } else {
            class131.field1758 = this.field1666[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1705[var4] = field1650[var5];
            field1706[var4] = field1703[var5];
            field1707[var4++] = this.field1662[arg0];
        } else {
            int var11 = field1709[var5];
            int var12 = field1664[var5];
            int var13 = this.field1662[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1717[var10 - var8];
                field1705[var4] = (((field1709[var7] - var11) * var14 >> 16) + var11) * class131.field1753 / 50 + var2;
                field1706[var4] = (((field1664[var7] - var12) * var14 >> 16) + var12) * class131.field1753 / 50 + var3;
                field1707[var4++] = ((this.field1668[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1717[var9 - var8];
                field1705[var4] = (((field1709[var6] - var11) * var15 >> 16) + var11) * class131.field1753 / 50 + var2;
                field1706[var4] = (((field1664[var6] - var12) * var15 >> 16) + var12) * class131.field1753 / 50 + var3;
                field1707[var4++] = ((this.field1663[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1705[var4] = field1650[var6];
            field1706[var4] = field1703[var6];
            field1707[var4++] = this.field1663[arg0];
        } else {
            int var16 = field1709[var6];
            int var17 = field1664[var6];
            int var18 = this.field1663[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1717[var8 - var9];
                field1705[var4] = (((field1709[var5] - var16) * var19 >> 16) + var16) * class131.field1753 / 50 + var2;
                field1706[var4] = (((field1664[var5] - var17) * var19 >> 16) + var17) * class131.field1753 / 50 + var3;
                field1707[var4++] = ((this.field1662[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1717[var10 - var9];
                field1705[var4] = (((field1709[var7] - var16) * var20 >> 16) + var16) * class131.field1753 / 50 + var2;
                field1706[var4] = (((field1664[var7] - var17) * var20 >> 16) + var17) * class131.field1753 / 50 + var3;
                field1707[var4++] = ((this.field1668[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1705[var4] = field1650[var7];
            field1706[var4] = field1703[var7];
            field1707[var4++] = this.field1668[arg0];
        } else {
            int var21 = field1709[var7];
            int var22 = field1664[var7];
            int var23 = this.field1668[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1717[var9 - var10];
                field1705[var4] = (((field1709[var6] - var21) * var24 >> 16) + var21) * class131.field1753 / 50 + var2;
                field1706[var4] = (((field1664[var6] - var22) * var24 >> 16) + var22) * class131.field1753 / 50 + var3;
                field1707[var4++] = ((this.field1663[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1717[var8 - var10];
                field1705[var4] = (((field1709[var5] - var21) * var25 >> 16) + var21) * class131.field1753 / 50 + var2;
                field1706[var4] = (((field1664[var5] - var22) * var25 >> 16) + var22) * class131.field1753 / 50 + var3;
                field1707[var4++] = ((this.field1662[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1705[0];
        int var27 = field1705[1];
        int var28 = field1705[2];
        int var29 = field1706[0];
        int var30 = field1706[1];
        int var31 = field1706[2];
        class131.field1761 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1756 || var27 > Statics.field1756 || var28 > Statics.field1756) {
                class131.field1761 = true;
            }
            if (this.field1718 != null && this.field1718[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1667 == null || this.field1667[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1667[arg0] & 0xFF;
                    var33 = this.field1692[var32];
                    var34 = this.field1672[var32];
                    var35 = this.field1673[var32];
                }
                if (this.field1668[arg0] == -1) {
                    class131.method2756(var29, var30, var31, var26, var27, var28, this.field1662[arg0], this.field1662[arg0], this.field1662[arg0], field1709[var33], field1709[var34], field1709[var35], field1664[var33], field1664[var34], field1664[var35], field1696[var33], field1696[var34], field1696[var35], this.field1718[arg0]);
                } else {
                    class131.method2756(var29, var30, var31, var26, var27, var28, field1707[0], field1707[1], field1707[2], field1709[var33], field1709[var34], field1709[var35], field1664[var33], field1664[var34], field1664[var35], field1696[var33], field1696[var34], field1696[var35], this.field1718[arg0]);
                }
            } else if (this.field1668[arg0] == -1) {
                class131.method2754(var29, var30, var31, var26, var27, var28, field1716[this.field1662[arg0]]);
            } else {
                class131.method2752(var29, var30, var31, var26, var27, var28, field1707[0], field1707[1], field1707[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1756 || var27 > Statics.field1756 || var28 > Statics.field1756 || field1705[3] < 0 || field1705[3] > Statics.field1756) {
            class131.field1761 = true;
        }
        if (this.field1718 != null && this.field1718[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1667 == null || this.field1667[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1667[arg0] & 0xFF;
                var37 = this.field1692[var36];
                var38 = this.field1672[var36];
                var39 = this.field1673[var36];
            }
            short var40 = this.field1718[arg0];
            if (this.field1668[arg0] == -1) {
                class131.method2756(var29, var30, var31, var26, var27, var28, this.field1662[arg0], this.field1662[arg0], this.field1662[arg0], field1709[var37], field1709[var38], field1709[var39], field1664[var37], field1664[var38], field1664[var39], field1696[var37], field1696[var38], field1696[var39], var40);
                class131.method2756(var29, var31, field1706[3], var26, var28, field1705[3], this.field1662[arg0], this.field1662[arg0], this.field1662[arg0], field1709[var37], field1709[var38], field1709[var39], field1664[var37], field1664[var38], field1664[var39], field1696[var37], field1696[var38], field1696[var39], var40);
            } else {
                class131.method2756(var29, var30, var31, var26, var27, var28, field1707[0], field1707[1], field1707[2], field1709[var37], field1709[var38], field1709[var39], field1664[var37], field1664[var38], field1664[var39], field1696[var37], field1696[var38], field1696[var39], var40);
                class131.method2756(var29, var31, field1706[3], var26, var28, field1705[3], field1707[0], field1707[2], field1707[3], field1709[var37], field1709[var38], field1709[var39], field1664[var37], field1664[var38], field1664[var39], field1696[var37], field1696[var38], field1696[var39], var40);
            }
        } else if (this.field1668[arg0] == -1) {
            int var41 = field1716[this.field1662[arg0]];
            class131.method2754(var29, var30, var31, var26, var27, var28, var41);
            class131.method2754(var29, var31, field1706[3], var26, var28, field1705[3], var41);
        } else {
            class131.method2752(var29, var30, var31, var26, var27, var28, field1707[0], field1707[1], field1707[2]);
            class131.method2752(var29, var31, field1706[3], var26, var28, field1705[3], field1707[0], field1707[2], field1707[3]);
        }
    }
}
