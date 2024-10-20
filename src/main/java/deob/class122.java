package deob;

@ObfuscatedName("de")
public class class122 extends class130 {

    @ObfuscatedName("de.y")
    public static class122 field1631 = new class122();

    @ObfuscatedName("de.c")
    public static byte[] field1689 = new byte[1];

    @ObfuscatedName("de.n")
    public static class122 field1664 = new class122();

    @ObfuscatedName("de.u")
    public static byte[] field1643 = new byte[1];

    @ObfuscatedName("de.i")
    public int field1671 = 0;

    @ObfuscatedName("de.r")
    public int[] field1635;

    @ObfuscatedName("de.j")
    public int[] field1636;

    @ObfuscatedName("de.p")
    public int[] field1637;

    @ObfuscatedName("de.e")
    public int field1695 = 0;

    @ObfuscatedName("de.s")
    public int[] field1639;

    @ObfuscatedName("de.v")
    public int[] field1640;

    @ObfuscatedName("de.k")
    public int[] field1647;

    @ObfuscatedName("de.o")
    public int[] field1642;

    @ObfuscatedName("de.q")
    public int[] field1666;

    @ObfuscatedName("de.l")
    public int[] field1644;

    @ObfuscatedName("de.f")
    public byte[] field1645;

    @ObfuscatedName("de.z")
    public byte[] field1646;

    @ObfuscatedName("de.a")
    public byte[] field1633;

    @ObfuscatedName("de.x")
    public short[] field1648;

    @ObfuscatedName("de.b")
    public byte field1656 = 0;

    @ObfuscatedName("de.w")
    public int field1634 = 0;

    @ObfuscatedName("de.g")
    public int[] field1641;

    @ObfuscatedName("de.d")
    public int[] field1684;

    @ObfuscatedName("de.m")
    public int[] field1653;

    @ObfuscatedName("de.t")
    public int[][] field1654;

    @ObfuscatedName("de.h")
    public int[][] field1655;

    @ObfuscatedName("de.an")
    public boolean field1632 = false;

    @ObfuscatedName("de.al")
    public int field1657;

    @ObfuscatedName("de.ah")
    public int field1658;

    @ObfuscatedName("de.ad")
    public int field1659;

    @ObfuscatedName("de.aa")
    public int field1660;

    @ObfuscatedName("de.ag")
    public int field1661;

    @ObfuscatedName("de.av")
    public int field1630;

    @ObfuscatedName("de.am")
    public int field1663;

    @ObfuscatedName("de.ap")
    public int field1674;

    @ObfuscatedName("de.au")
    public int field1665 = -1;

    @ObfuscatedName("de.ae")
    public int field1662 = -1;

    @ObfuscatedName("de.ai")
    public int field1667 = -1;

    @ObfuscatedName("de.aw")
    public static boolean[] field1669 = new boolean[4700];

    @ObfuscatedName("de.ac")
    public static boolean[] field1670 = new boolean[4700];

    @ObfuscatedName("de.aq")
    public static int[] field1677 = new int[4700];

    @ObfuscatedName("de.az")
    public static int[] field1672 = new int[4700];

    @ObfuscatedName("de.ay")
    public static int[] field1673 = new int[4700];

    @ObfuscatedName("de.ao")
    public static int[] field1650 = new int[4700];

    @ObfuscatedName("de.ak")
    public static int[] field1675 = new int[4700];

    @ObfuscatedName("de.af")
    public static int[] field1690 = new int[4700];

    @ObfuscatedName("de.ar")
    public static int[] field1678 = new int[1600];

    @ObfuscatedName("de.at")
    public static int[][] field1679 = new int[1600][512];

    @ObfuscatedName("de.aj")
    public static int[] field1680 = new int[12];

    @ObfuscatedName("de.as")
    public static int[][] field1681 = new int[12][2000];

    @ObfuscatedName("de.br")
    public static int[] field1682 = new int[2000];

    @ObfuscatedName("de.bd")
    public static int[] field1683 = new int[2000];

    @ObfuscatedName("de.bp")
    public static int[] field1685 = new int[12];

    @ObfuscatedName("de.bk")
    public static int[] field1649 = new int[10];

    @ObfuscatedName("de.bm")
    public static int[] field1686 = new int[10];

    @ObfuscatedName("de.bc")
    public static int[] field1687 = new int[10];

    @ObfuscatedName("de.bg")
    public static boolean field1691 = true;

    @ObfuscatedName("de.bu")
    public static int[] field1694 = class125.field1747;

    @ObfuscatedName("de.bj")
    public static int[] field1651 = class125.field1748;

    @ObfuscatedName("de.bl")
    public static int[] field1696 = class125.field1736;

    @ObfuscatedName("de.bv")
    public static int[] field1697 = class125.field1742;

    public class122() {
    }

    public class122(class122[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1671 = 0;
        this.field1695 = 0;
        this.field1634 = 0;
        this.field1656 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class122 var8 = arg0[var7];
            if (var8 != null) {
                this.field1671 += var8.field1671;
                this.field1695 += var8.field1695;
                this.field1634 += var8.field1634;
                if (var8.field1645 == null) {
                    if (this.field1656 == -1) {
                        this.field1656 = var8.field1656;
                    }
                    if (this.field1656 != var8.field1656) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1646 != null;
                var5 |= var8.field1648 != null;
                var6 |= var8.field1633 != null;
            }
        }
        this.field1635 = new int[this.field1671];
        this.field1636 = new int[this.field1671];
        this.field1637 = new int[this.field1671];
        this.field1639 = new int[this.field1695];
        this.field1640 = new int[this.field1695];
        this.field1647 = new int[this.field1695];
        this.field1642 = new int[this.field1695];
        this.field1666 = new int[this.field1695];
        this.field1644 = new int[this.field1695];
        if (var3) {
            this.field1645 = new byte[this.field1695];
        }
        if (var4) {
            this.field1646 = new byte[this.field1695];
        }
        if (var5) {
            this.field1648 = new short[this.field1695];
        }
        if (var6) {
            this.field1633 = new byte[this.field1695];
        }
        if (this.field1634 > 0) {
            this.field1641 = new int[this.field1634];
            this.field1684 = new int[this.field1634];
            this.field1653 = new int[this.field1634];
        }
        this.field1671 = 0;
        this.field1695 = 0;
        this.field1634 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class122 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1695; var11++) {
                    this.field1639[this.field1695] = var10.field1639[var11] + this.field1671;
                    this.field1640[this.field1695] = var10.field1640[var11] + this.field1671;
                    this.field1647[this.field1695] = var10.field1647[var11] + this.field1671;
                    this.field1642[this.field1695] = var10.field1642[var11];
                    this.field1666[this.field1695] = var10.field1666[var11];
                    this.field1644[this.field1695] = var10.field1644[var11];
                    if (var3) {
                        if (var10.field1645 == null) {
                            this.field1645[this.field1695] = var10.field1656;
                        } else {
                            this.field1645[this.field1695] = var10.field1645[var11];
                        }
                    }
                    if (var4 && var10.field1646 != null) {
                        this.field1646[this.field1695] = var10.field1646[var11];
                    }
                    if (var5) {
                        if (var10.field1648 == null) {
                            this.field1648[this.field1695] = -1;
                        } else {
                            this.field1648[this.field1695] = var10.field1648[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1633 == null || var10.field1633[var11] == -1) {
                            this.field1633[this.field1695] = -1;
                        } else {
                            this.field1633[this.field1695] = (byte) (var10.field1633[var11] + this.field1634);
                        }
                    }
                    this.field1695++;
                }
                for (int var12 = 0; var12 < var10.field1634; var12++) {
                    this.field1641[this.field1634] = var10.field1641[var12] + this.field1671;
                    this.field1684[this.field1634] = var10.field1684[var12] + this.field1671;
                    this.field1653[this.field1634] = var10.field1653[var12] + this.field1671;
                    this.field1634++;
                }
                for (int var13 = 0; var13 < var10.field1671; var13++) {
                    this.field1635[this.field1671] = var10.field1635[var13];
                    this.field1636[this.field1671] = var10.field1636[var13];
                    this.field1637[this.field1671] = var10.field1637[var13];
                    this.field1671++;
                }
            }
        }
    }

    @ObfuscatedName("de.y([[IIIIZI)Lde;")
    public class122 method2468(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2473();
        int var7 = arg1 - this.field1659;
        int var8 = this.field1659 + arg1;
        int var9 = arg3 - this.field1659;
        int var10 = this.field1659 + arg3;
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
            var15.field1671 = this.field1671;
            var15.field1695 = this.field1695;
            var15.field1634 = this.field1634;
            var15.field1635 = this.field1635;
            var15.field1637 = this.field1637;
            var15.field1639 = this.field1639;
            var15.field1640 = this.field1640;
            var15.field1647 = this.field1647;
            var15.field1642 = this.field1642;
            var15.field1666 = this.field1666;
            var15.field1644 = this.field1644;
            var15.field1645 = this.field1645;
            var15.field1646 = this.field1646;
            var15.field1633 = this.field1633;
            var15.field1648 = this.field1648;
            var15.field1656 = this.field1656;
            var15.field1641 = this.field1641;
            var15.field1684 = this.field1684;
            var15.field1653 = this.field1653;
            var15.field1654 = this.field1654;
            var15.field1655 = this.field1655;
            var15.field1632 = this.field1632;
            var15.field1636 = new int[var15.field1671];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1671; var16++) {
                int var17 = this.field1635[var16] + arg1;
                int var18 = this.field1637[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1636[var16] = this.field1636[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1671; var26++) {
                int var27 = (-this.field1636[var26] << 16) / this.field1828;
                if (var27 < arg5) {
                    int var28 = this.field1635[var26] + arg1;
                    int var29 = this.field1637[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1636[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1636[var26];
                }
            }
        }
        var15.method2476();
        return var15;
    }

    @ObfuscatedName("de.c(Z)Lde;")
    public class122 method2469(boolean arg0) {
        if (!arg0 && field1689.length < this.field1695) {
            field1689 = new byte[this.field1695 + 100];
        }
        return this.method2509(arg0, field1631, field1689);
    }

    @ObfuscatedName("de.n(Z)Lde;")
    public class122 method2477(boolean arg0) {
        if (!arg0 && field1643.length < this.field1695) {
            field1643 = new byte[this.field1695 + 100];
        }
        return this.method2509(arg0, field1664, field1643);
    }

    @ObfuscatedName("de.u(ZLde;[B)Lde;")
    public class122 method2509(boolean arg0, class122 arg1, byte[] arg2) {
        arg1.field1671 = this.field1671;
        arg1.field1695 = this.field1695;
        arg1.field1634 = this.field1634;
        if (arg1.field1635 == null || arg1.field1635.length < this.field1671) {
            arg1.field1635 = new int[this.field1671 + 100];
            arg1.field1636 = new int[this.field1671 + 100];
            arg1.field1637 = new int[this.field1671 + 100];
        }
        for (int var4 = 0; var4 < this.field1671; var4++) {
            arg1.field1635[var4] = this.field1635[var4];
            arg1.field1636[var4] = this.field1636[var4];
            arg1.field1637[var4] = this.field1637[var4];
        }
        if (arg0) {
            arg1.field1646 = this.field1646;
        } else {
            arg1.field1646 = arg2;
            if (this.field1646 == null) {
                for (int var5 = 0; var5 < this.field1695; var5++) {
                    arg1.field1646[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1695; var6++) {
                    arg1.field1646[var6] = this.field1646[var6];
                }
            }
        }
        arg1.field1639 = this.field1639;
        arg1.field1640 = this.field1640;
        arg1.field1647 = this.field1647;
        arg1.field1642 = this.field1642;
        arg1.field1666 = this.field1666;
        arg1.field1644 = this.field1644;
        arg1.field1645 = this.field1645;
        arg1.field1633 = this.field1633;
        arg1.field1648 = this.field1648;
        arg1.field1656 = this.field1656;
        arg1.field1641 = this.field1641;
        arg1.field1684 = this.field1684;
        arg1.field1653 = this.field1653;
        arg1.field1654 = this.field1654;
        arg1.field1655 = this.field1655;
        arg1.field1632 = this.field1632;
        arg1.method2476();
        return arg1;
    }

    @ObfuscatedName("de.i(I)V")
    public void method2472(int arg0) {
        if (this.field1665 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1651[arg0];
        int var9 = field1694[arg0];
        for (int var10 = 0; var10 < this.field1671; var10++) {
            int var11 = class125.method2606(this.field1635[var10], this.field1637[var10], var8, var9);
            int var12 = this.field1636[var10];
            int var13 = class125.method2637(this.field1635[var10], this.field1637[var10], var8, var9);
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
        this.field1630 = (var2 + var5) / 2;
        this.field1663 = (var3 + var6) / 2;
        this.field1674 = (var4 + var7) / 2;
        this.field1665 = (var5 - var2 + 1) / 2;
        this.field1662 = (var6 - var3 + 1) / 2;
        this.field1667 = (var7 - var4 + 1) / 2;
        if (this.field1665 < 32) {
            this.field1665 = 32;
        }
        if (this.field1667 < 32) {
            this.field1667 = 32;
        }
        if (this.field1632) {
            this.field1665 += 8;
            this.field1667 += 8;
        }
    }

    @ObfuscatedName("de.p()V")
    public void method2473() {
        if (this.field1657 == 1) {
            return;
        }
        this.field1657 = 1;
        this.field1828 = 0;
        this.field1658 = 0;
        this.field1659 = 0;
        for (int var1 = 0; var1 < this.field1671; var1++) {
            int var2 = this.field1635[var1];
            int var3 = this.field1636[var1];
            int var4 = this.field1637[var1];
            if (-var3 > this.field1828) {
                this.field1828 = -var3;
            }
            if (var3 > this.field1658) {
                this.field1658 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1659) {
                this.field1659 = var5;
            }
        }
        this.field1659 = (int) (Math.sqrt((double) this.field1659) + 0.99D);
        this.field1661 = (int) (Math.sqrt((double) (this.field1828 * this.field1828 + this.field1659 * this.field1659)) + 0.99D);
        this.field1660 = this.field1661 + (int) (Math.sqrt((double) (this.field1659 * this.field1659 + this.field1658 * this.field1658)) + 0.99D);
    }

    @ObfuscatedName("de.e()V")
    public void method2474() {
        if (this.field1657 == 2) {
            return;
        }
        this.field1657 = 2;
        this.field1659 = 0;
        for (int var1 = 0; var1 < this.field1671; var1++) {
            int var2 = this.field1635[var1];
            int var3 = this.field1636[var1];
            int var4 = this.field1637[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1659) {
                this.field1659 = var5;
            }
        }
        this.field1659 = (int) (Math.sqrt((double) this.field1659) + 0.99D);
        this.field1661 = this.field1659;
        this.field1660 = this.field1659 + this.field1659;
    }

    @ObfuscatedName("de.s()I")
    public int method2475() {
        this.method2473();
        return this.field1659;
    }

    @ObfuscatedName("de.k()V")
    public void method2476() {
        this.field1657 = 0;
        this.field1665 = -1;
    }

    @ObfuscatedName("de.o(Les;I)V")
    public void method2496(class133 arg0, int arg1) {
        if (this.field1654 == null || arg1 == -1) {
            return;
        }
        class120 var3 = arg0.field1849[arg1];
        class127 var4 = var3.field1597;
        Statics.field1688 = 0;
        Statics.field1676 = 0;
        Statics.field1652 = 0;
        for (int var5 = 0; var5 < var3.field1595; var5++) {
            int var6 = var3.field1593[var5];
            this.method2479(var4.field1760[var6], var4.field1761[var6], var3.field1599[var5], var3.field1601[var5], var3.field1602[var5]);
        }
        this.method2476();
    }

    @ObfuscatedName("de.q(Les;ILes;I[I)V")
    public void method2478(class133 arg0, int arg1, class133 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2496(arg0, arg1);
            return;
        }
        class120 var6 = arg0.field1849[arg1];
        class120 var7 = arg2.field1849[arg3];
        class127 var8 = var6.field1597;
        Statics.field1688 = 0;
        Statics.field1676 = 0;
        Statics.field1652 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1595; var11++) {
            int var12 = var6.field1593[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1760[var12] == 0) {
                this.method2479(var8.field1760[var12], var8.field1761[var12], var6.field1599[var11], var6.field1601[var11], var6.field1602[var11]);
            }
        }
        Statics.field1688 = 0;
        Statics.field1676 = 0;
        Statics.field1652 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1595; var15++) {
            int var16 = var7.field1593[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1760[var16] == 0) {
                this.method2479(var8.field1760[var16], var8.field1761[var16], var7.field1599[var15], var7.field1601[var15], var7.field1602[var15]);
            }
        }
        this.method2476();
    }

    @ObfuscatedName("de.l(I[IIII)V")
    public void method2479(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1688 = 0;
            Statics.field1676 = 0;
            Statics.field1652 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1654.length) {
                    int[] var10 = this.field1654[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1688 += this.field1635[var12];
                        Statics.field1676 += this.field1636[var12];
                        Statics.field1652 += this.field1637[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1688 = Statics.field1688 / var7 + arg2;
                Statics.field1676 = Statics.field1676 / var7 + arg3;
                Statics.field1652 = Statics.field1652 / var7 + arg4;
            } else {
                Statics.field1688 = arg2;
                Statics.field1676 = arg3;
                Statics.field1652 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1654.length) {
                    int[] var15 = this.field1654[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1635[var17] += arg2;
                        this.field1636[var17] += arg3;
                        this.field1637[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1654.length) {
                    int[] var20 = this.field1654[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1635[var22] -= Statics.field1688;
                        this.field1636[var22] -= Statics.field1676;
                        this.field1637[var22] -= Statics.field1652;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1694[var25];
                            int var27 = field1651[var25];
                            int var28 = this.field1636[var22] * var26 + this.field1635[var22] * var27 >> 16;
                            this.field1636[var22] = this.field1636[var22] * var27 - this.field1635[var22] * var26 >> 16;
                            this.field1635[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1694[var23];
                            int var30 = field1651[var23];
                            int var31 = this.field1636[var22] * var30 - this.field1637[var22] * var29 >> 16;
                            this.field1637[var22] = this.field1637[var22] * var30 + this.field1636[var22] * var29 >> 16;
                            this.field1636[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1694[var24];
                            int var33 = field1651[var24];
                            int var34 = this.field1637[var22] * var32 + this.field1635[var22] * var33 >> 16;
                            this.field1637[var22] = this.field1637[var22] * var33 - this.field1635[var22] * var32 >> 16;
                            this.field1635[var22] = var34;
                        }
                        this.field1635[var22] += Statics.field1688;
                        this.field1636[var22] += Statics.field1676;
                        this.field1637[var22] += Statics.field1652;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1654.length) {
                    int[] var37 = this.field1654[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1635[var39] -= Statics.field1688;
                        this.field1636[var39] -= Statics.field1676;
                        this.field1637[var39] -= Statics.field1652;
                        this.field1635[var39] = this.field1635[var39] * arg2 / 128;
                        this.field1636[var39] = this.field1636[var39] * arg3 / 128;
                        this.field1637[var39] = this.field1637[var39] * arg4 / 128;
                        this.field1635[var39] += Statics.field1688;
                        this.field1636[var39] += Statics.field1676;
                        this.field1637[var39] += Statics.field1652;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1655 != null && this.field1646 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1655.length) {
                    int[] var42 = this.field1655[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1646[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1646[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("de.f()V")
    public void method2537() {
        for (int var1 = 0; var1 < this.field1671; var1++) {
            int var2 = this.field1635[var1];
            this.field1635[var1] = this.field1637[var1];
            this.field1637[var1] = -var2;
        }
        this.method2476();
    }

    @ObfuscatedName("de.z()V")
    public void method2519() {
        for (int var1 = 0; var1 < this.field1671; var1++) {
            this.field1635[var1] = -this.field1635[var1];
            this.field1637[var1] = -this.field1637[var1];
        }
        this.method2476();
    }

    @ObfuscatedName("de.a()V")
    public void method2482() {
        for (int var1 = 0; var1 < this.field1671; var1++) {
            int var2 = this.field1637[var1];
            this.field1637[var1] = this.field1635[var1];
            this.field1635[var1] = -var2;
        }
        this.method2476();
    }

    @ObfuscatedName("de.x(I)V")
    public void method2532(int arg0) {
        int var2 = field1694[arg0];
        int var3 = field1651[arg0];
        for (int var4 = 0; var4 < this.field1671; var4++) {
            int var5 = this.field1636[var4] * var3 - this.field1637[var4] * var2 >> 16;
            this.field1637[var4] = this.field1637[var4] * var3 + this.field1636[var4] * var2 >> 16;
            this.field1636[var4] = var5;
        }
        this.method2476();
    }

    @ObfuscatedName("de.b(III)V")
    public void method2484(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1671; var4++) {
            this.field1635[var4] += arg0;
            this.field1636[var4] += arg1;
            this.field1637[var4] += arg2;
        }
        this.method2476();
    }

    @ObfuscatedName("de.w(III)V")
    public void method2485(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1671; var4++) {
            this.field1635[var4] = this.field1635[var4] * arg0 / 128;
            this.field1636[var4] = this.field1636[var4] * arg1 / 128;
            this.field1637[var4] = this.field1637[var4] * arg2 / 128;
        }
        this.method2476();
    }

    @ObfuscatedName("de.g(IIIIIII)V")
    public final void method2490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1678[0] = -1;
        if (this.field1657 != 2 && this.field1657 != 1) {
            this.method2474();
        }
        int var8 = Statics.field1734;
        int var9 = Statics.field1732;
        int var10 = field1694[arg0];
        int var11 = field1651[arg0];
        int var12 = field1694[arg1];
        int var13 = field1651[arg1];
        int var14 = field1694[arg2];
        int var15 = field1651[arg2];
        int var16 = field1694[arg3];
        int var17 = field1651[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1671; var19++) {
            int var20 = this.field1635[var19];
            int var21 = this.field1636[var19];
            int var22 = this.field1637[var19];
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
            field1673[var19] = var30 - var18;
            field1677[var19] = class125.field1733 * var26 / var30 + var8;
            field1672[var19] = class125.field1733 * var29 / var30 + var9;
            if (this.field1634 > 0) {
                field1650[var19] = var26;
                field1675[var19] = var29;
                field1690[var19] = var30;
            }
        }
        try {
            this.method2467(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("de.d(IIIIIIII)V")
    public final void method2483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1678[0] = -1;
        if (this.field1657 != 2 && this.field1657 != 1) {
            this.method2474();
        }
        int var9 = Statics.field1734;
        int var10 = Statics.field1732;
        int var11 = field1694[arg0];
        int var12 = field1651[arg0];
        int var13 = field1694[arg1];
        int var14 = field1651[arg1];
        int var15 = field1694[arg2];
        int var16 = field1651[arg2];
        int var17 = field1694[arg3];
        int var18 = field1651[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1671; var20++) {
            int var21 = this.field1635[var20];
            int var22 = this.field1636[var20];
            int var23 = this.field1637[var20];
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
            field1673[var20] = var31 - var19;
            field1677[var20] = class125.field1733 * var27 / arg7 + var9;
            field1672[var20] = class125.field1733 * var30 / arg7 + var10;
            if (this.field1634 > 0) {
                field1650[var20] = var27;
                field1675[var20] = var30;
                field1690[var20] = var31;
            }
        }
        try {
            this.method2467(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("de.cm(IIIIIIIIJ)V")
    public void method2470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1678[0] = -1;
        if (this.field1657 != 1) {
            this.method2473();
        }
        this.method2472(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field1659 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field1659) * class125.field1733;
        if (var16 / var14 >= Statics.field1739) {
            return;
        }
        int var17 = (this.field1659 + var15) * class125.field1733;
        if (var17 / var14 <= Statics.field1738) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field1659 * arg1 >> 16;
        int var20 = (var18 + var19) * class125.field1733;
        if (var20 / var14 <= Statics.field1740) {
            return;
        }
        int var21 = (this.field1828 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class125.field1733;
        if (var22 / var14 >= Statics.field1741) {
            return;
        }
        int var23 = (this.field1828 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field1634 > 0;
        int var27 = class123.method708();
        int var28 = class123.field1702;
        boolean var30 = class123.method3084();
        boolean var31 = arg8 != 0L;
        if (var31) {
            boolean var32 = (int) (arg8 >>> 16 & 0x1L) == 1;
            var31 = !var32;
        }
        boolean var35 = false;
        if (var31 && var30) {
            boolean var36 = false;
            if (field1691) {
                var36 = class123.method2319(this, arg5, arg6, arg7);
            } else {
                int var37 = var12 - var13;
                if (var37 <= 50) {
                    var37 = 50;
                }
                int var38;
                int var39;
                if (var15 > 0) {
                    var38 = var16 / var14;
                    var39 = var17 / var37;
                } else {
                    var39 = var17 / var14;
                    var38 = var16 / var37;
                }
                int var40;
                int var41;
                if (var18 > 0) {
                    var40 = var22 / var14;
                    var41 = var20 / var37;
                } else {
                    var41 = var20 / var14;
                    var40 = var22 / var37;
                }
                int var42 = var27 - Statics.field1734;
                int var43 = var28 - Statics.field1732;
                if (var42 > var38 && var42 < var39 && var43 > var40 && var43 < var41) {
                    var36 = true;
                }
            }
            if (var36) {
                if (this.field1632) {
                    class123.field1709[++class123.field1708 - 1] = arg8;
                } else {
                    var35 = true;
                }
            }
        }
        int var46 = Statics.field1734;
        int var47 = Statics.field1732;
        int var48 = 0;
        int var49 = 0;
        if (arg0 != 0) {
            var48 = field1694[arg0];
            var49 = field1651[arg0];
        }
        for (int var50 = 0; var50 < this.field1671; var50++) {
            int var51 = this.field1635[var50];
            int var52 = this.field1636[var50];
            int var53 = this.field1637[var50];
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
            field1673[var50] = var62 - var12;
            if (var62 >= 50) {
                field1677[var50] = class125.field1733 * var58 / var62 + var46;
                field1672[var50] = class125.field1733 * var61 / var62 + var47;
            } else {
                field1677[var50] = -5000;
                var24 = true;
            }
            if (var26) {
                field1650[var50] = var58;
                field1675[var50] = var61;
                field1690[var50] = var62;
            }
        }
        try {
            this.method2467(var24, var35, this.field1632, arg8);
        } catch (Exception var65) {
        }
    }

    @ObfuscatedName("de.m(ZZZJ)V")
    public final void method2467(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field1660 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field1660; var6++) {
            field1678[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field1695; var8++) {
            if (this.field1644[var8] != -2) {
                int var9 = this.field1639[var8];
                int var10 = this.field1640[var8];
                int var11 = this.field1647[var8];
                int var12 = field1677[var9];
                int var13 = field1677[var10];
                int var14 = field1677[var11];
                if (arg0 && var12 == -5000 || var13 == -5000 || var14 == -5000) {
                    int var15 = field1650[var9];
                    int var16 = field1650[var10];
                    int var17 = field1650[var11];
                    int var18 = field1675[var9];
                    int var19 = field1675[var10];
                    int var20 = field1675[var11];
                    int var21 = field1690[var9];
                    int var22 = field1690[var10];
                    int var23 = field1690[var11];
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
                        field1670[var8] = true;
                        int var33 = (field1673[var9] + field1673[var10] + field1673[var11]) / 3 + this.field1661;
                        field1679[var33][field1678[var33]++] = var8;
                    }
                } else {
                    if (arg1 && class123.method10(field1672[var9], field1672[var10], field1672[var11], var12, var13, var14, var7)) {
                        class123.field1709[++class123.field1708 - 1] = arg3;
                        arg1 = false;
                    }
                    if ((field1672[var11] - field1672[var10]) * (var12 - var13) - (field1672[var9] - field1672[var10]) * (var14 - var13) > 0) {
                        field1670[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field1746 && var13 <= Statics.field1746 && var14 <= Statics.field1746) {
                            field1669[var8] = false;
                        } else {
                            field1669[var8] = true;
                        }
                        int var36 = (field1673[var9] + field1673[var10] + field1673[var11]) / 3 + this.field1661;
                        field1679[var36][field1678[var36]++] = var8;
                    }
                }
            }
        }
        if (this.field1645 == null) {
            for (int var37 = this.field1660 - 1; var37 >= 0; var37--) {
                int var38 = field1678[var37];
                if (var38 > 0) {
                    int[] var39 = field1679[var37];
                    for (int var40 = 0; var40 < var38; var40++) {
                        this.method2488(var39[var40]);
                    }
                }
            }
            return;
        }
        for (int var41 = 0; var41 < 12; var41++) {
            field1680[var41] = 0;
            field1685[var41] = 0;
        }
        for (int var42 = this.field1660 - 1; var42 >= 0; var42--) {
            int var43 = field1678[var42];
            if (var43 > 0) {
                int[] var44 = field1679[var42];
                for (int var45 = 0; var45 < var43; var45++) {
                    int var46 = var44[var45];
                    byte var47 = this.field1645[var46];
                    int var48 = field1680[var47]++;
                    field1681[var47][var48] = var46;
                    if (var47 < 10) {
                        field1685[var47] += var42;
                    } else if (var47 == 10) {
                        field1682[var48] = var42;
                    } else {
                        field1683[var48] = var42;
                    }
                }
            }
        }
        int var49 = 0;
        if (field1680[1] > 0 || field1680[2] > 0) {
            var49 = (field1685[1] + field1685[2]) / (field1680[1] + field1680[2]);
        }
        int var50 = 0;
        if (field1680[3] > 0 || field1680[4] > 0) {
            var50 = (field1685[3] + field1685[4]) / (field1680[3] + field1680[4]);
        }
        int var51 = 0;
        if (field1680[6] > 0 || field1680[8] > 0) {
            var51 = (field1685[6] + field1685[8]) / (field1680[6] + field1680[8]);
        }
        int var52 = 0;
        int var53 = field1680[10];
        int[] var54 = field1681[10];
        int[] var55 = field1682;
        if (var52 == var53) {
            var52 = 0;
            var53 = field1680[11];
            var54 = field1681[11];
            var55 = field1683;
        }
        int var56;
        if (var52 < var53) {
            var56 = var55[var52];
        } else {
            var56 = -1000;
        }
        for (int var57 = 0; var57 < 10; var57++) {
            while (var57 == 0 && var56 > var49) {
                this.method2488(var54[var52++]);
                if (var52 == var53 && field1681[11] != var54) {
                    var52 = 0;
                    var53 = field1680[11];
                    var54 = field1681[11];
                    var55 = field1683;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            while (var57 == 3 && var56 > var50) {
                this.method2488(var54[var52++]);
                if (var52 == var53 && field1681[11] != var54) {
                    var52 = 0;
                    var53 = field1680[11];
                    var54 = field1681[11];
                    var55 = field1683;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            while (var57 == 5 && var56 > var51) {
                this.method2488(var54[var52++]);
                if (var52 == var53 && field1681[11] != var54) {
                    var52 = 0;
                    var53 = field1680[11];
                    var54 = field1681[11];
                    var55 = field1683;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            int var58 = field1680[var57];
            int[] var59 = field1681[var57];
            for (int var60 = 0; var60 < var58; var60++) {
                this.method2488(var59[var60]);
            }
        }
        while (var56 != -1000) {
            this.method2488(var54[var52++]);
            if (var52 == var53 && field1681[11] != var54) {
                var52 = 0;
                var54 = field1681[11];
                var53 = field1680[11];
                var55 = field1683;
            }
            if (var52 < var53) {
                var56 = var55[var52];
            } else {
                var56 = -1000;
            }
        }
    }

    @ObfuscatedName("de.t(I)V")
    public final void method2488(int arg0) {
        if (field1670[arg0]) {
            this.method2491(arg0);
            return;
        }
        int var2 = this.field1639[arg0];
        int var3 = this.field1640[arg0];
        int var4 = this.field1647[arg0];
        class125.field1725 = field1669[arg0];
        if (this.field1646 == null) {
            class125.field1726 = 0;
        } else {
            class125.field1726 = this.field1646[arg0] & 0xFF;
        }
        if (this.field1648 != null && this.field1648[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1633 == null || this.field1633[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1633[arg0] & 0xFF;
                var6 = this.field1641[var5];
                var7 = this.field1684[var5];
                var8 = this.field1653[var5];
            }
            if (this.field1644[arg0] == -1) {
                class125.method2604(field1672[var2], field1672[var3], field1672[var4], field1677[var2], field1677[var3], field1677[var4], this.field1642[arg0], this.field1642[arg0], this.field1642[arg0], field1650[var6], field1650[var7], field1650[var8], field1675[var6], field1675[var7], field1675[var8], field1690[var6], field1690[var7], field1690[var8], this.field1648[arg0]);
            } else {
                class125.method2604(field1672[var2], field1672[var3], field1672[var4], field1677[var2], field1677[var3], field1677[var4], this.field1642[arg0], this.field1666[arg0], this.field1644[arg0], field1650[var6], field1650[var7], field1650[var8], field1675[var6], field1675[var7], field1675[var8], field1690[var6], field1690[var7], field1690[var8], this.field1648[arg0]);
            }
        } else if (this.field1644[arg0] == -1) {
            class125.method2599(field1672[var2], field1672[var3], field1672[var4], field1677[var2], field1677[var3], field1677[var4], field1696[this.field1642[arg0]]);
        } else {
            class125.method2630(field1672[var2], field1672[var3], field1672[var4], field1677[var2], field1677[var3], field1677[var4], this.field1642[arg0], this.field1666[arg0], this.field1644[arg0]);
        }
    }

    @ObfuscatedName("de.h(I)V")
    public final void method2491(int arg0) {
        int var2 = Statics.field1734;
        int var3 = Statics.field1732;
        int var4 = 0;
        int var5 = this.field1639[arg0];
        int var6 = this.field1640[arg0];
        int var7 = this.field1647[arg0];
        int var8 = field1690[var5];
        int var9 = field1690[var6];
        int var10 = field1690[var7];
        if (this.field1646 == null) {
            class125.field1726 = 0;
        } else {
            class125.field1726 = this.field1646[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1649[var4] = field1677[var5];
            field1686[var4] = field1672[var5];
            field1687[var4++] = this.field1642[arg0];
        } else {
            int var11 = field1650[var5];
            int var12 = field1675[var5];
            int var13 = this.field1642[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1697[var10 - var8];
                field1649[var4] = (((field1650[var7] - var11) * var14 >> 16) + var11) * class125.field1733 / 50 + var2;
                field1686[var4] = (((field1675[var7] - var12) * var14 >> 16) + var12) * class125.field1733 / 50 + var3;
                field1687[var4++] = ((this.field1644[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1697[var9 - var8];
                field1649[var4] = (((field1650[var6] - var11) * var15 >> 16) + var11) * class125.field1733 / 50 + var2;
                field1686[var4] = (((field1675[var6] - var12) * var15 >> 16) + var12) * class125.field1733 / 50 + var3;
                field1687[var4++] = ((this.field1666[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1649[var4] = field1677[var6];
            field1686[var4] = field1672[var6];
            field1687[var4++] = this.field1666[arg0];
        } else {
            int var16 = field1650[var6];
            int var17 = field1675[var6];
            int var18 = this.field1666[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1697[var8 - var9];
                field1649[var4] = (((field1650[var5] - var16) * var19 >> 16) + var16) * class125.field1733 / 50 + var2;
                field1686[var4] = (((field1675[var5] - var17) * var19 >> 16) + var17) * class125.field1733 / 50 + var3;
                field1687[var4++] = ((this.field1642[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1697[var10 - var9];
                field1649[var4] = (((field1650[var7] - var16) * var20 >> 16) + var16) * class125.field1733 / 50 + var2;
                field1686[var4] = (((field1675[var7] - var17) * var20 >> 16) + var17) * class125.field1733 / 50 + var3;
                field1687[var4++] = ((this.field1644[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1649[var4] = field1677[var7];
            field1686[var4] = field1672[var7];
            field1687[var4++] = this.field1644[arg0];
        } else {
            int var21 = field1650[var7];
            int var22 = field1675[var7];
            int var23 = this.field1644[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1697[var9 - var10];
                field1649[var4] = (((field1650[var6] - var21) * var24 >> 16) + var21) * class125.field1733 / 50 + var2;
                field1686[var4] = (((field1675[var6] - var22) * var24 >> 16) + var22) * class125.field1733 / 50 + var3;
                field1687[var4++] = ((this.field1666[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1697[var8 - var10];
                field1649[var4] = (((field1650[var5] - var21) * var25 >> 16) + var21) * class125.field1733 / 50 + var2;
                field1686[var4] = (((field1675[var5] - var22) * var25 >> 16) + var22) * class125.field1733 / 50 + var3;
                field1687[var4++] = ((this.field1642[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1649[0];
        int var27 = field1649[1];
        int var28 = field1649[2];
        int var29 = field1686[0];
        int var30 = field1686[1];
        int var31 = field1686[2];
        class125.field1725 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1746 || var27 > Statics.field1746 || var28 > Statics.field1746) {
                class125.field1725 = true;
            }
            if (this.field1648 != null && this.field1648[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1633 == null || this.field1633[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1633[arg0] & 0xFF;
                    var33 = this.field1641[var32];
                    var34 = this.field1684[var32];
                    var35 = this.field1653[var32];
                }
                if (this.field1644[arg0] == -1) {
                    class125.method2604(var29, var30, var31, var26, var27, var28, this.field1642[arg0], this.field1642[arg0], this.field1642[arg0], field1650[var33], field1650[var34], field1650[var35], field1675[var33], field1675[var34], field1675[var35], field1690[var33], field1690[var34], field1690[var35], this.field1648[arg0]);
                } else {
                    class125.method2604(var29, var30, var31, var26, var27, var28, field1687[0], field1687[1], field1687[2], field1650[var33], field1650[var34], field1650[var35], field1675[var33], field1675[var34], field1675[var35], field1690[var33], field1690[var34], field1690[var35], this.field1648[arg0]);
                }
            } else if (this.field1644[arg0] == -1) {
                class125.method2599(var29, var30, var31, var26, var27, var28, field1696[this.field1642[arg0]]);
            } else {
                class125.method2630(var29, var30, var31, var26, var27, var28, field1687[0], field1687[1], field1687[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1746 || var27 > Statics.field1746 || var28 > Statics.field1746 || field1649[3] < 0 || field1649[3] > Statics.field1746) {
            class125.field1725 = true;
        }
        if (this.field1648 != null && this.field1648[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1633 == null || this.field1633[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1633[arg0] & 0xFF;
                var37 = this.field1641[var36];
                var38 = this.field1684[var36];
                var39 = this.field1653[var36];
            }
            short var40 = this.field1648[arg0];
            if (this.field1644[arg0] == -1) {
                class125.method2604(var29, var30, var31, var26, var27, var28, this.field1642[arg0], this.field1642[arg0], this.field1642[arg0], field1650[var37], field1650[var38], field1650[var39], field1675[var37], field1675[var38], field1675[var39], field1690[var37], field1690[var38], field1690[var39], var40);
                class125.method2604(var29, var31, field1686[3], var26, var28, field1649[3], this.field1642[arg0], this.field1642[arg0], this.field1642[arg0], field1650[var37], field1650[var38], field1650[var39], field1675[var37], field1675[var38], field1675[var39], field1690[var37], field1690[var38], field1690[var39], var40);
            } else {
                class125.method2604(var29, var30, var31, var26, var27, var28, field1687[0], field1687[1], field1687[2], field1650[var37], field1650[var38], field1650[var39], field1675[var37], field1675[var38], field1675[var39], field1690[var37], field1690[var38], field1690[var39], var40);
                class125.method2604(var29, var31, field1686[3], var26, var28, field1649[3], field1687[0], field1687[2], field1687[3], field1650[var37], field1650[var38], field1650[var39], field1675[var37], field1675[var38], field1675[var39], field1690[var37], field1690[var38], field1690[var39], var40);
            }
        } else if (this.field1644[arg0] == -1) {
            int var41 = field1696[this.field1642[arg0]];
            class125.method2599(var29, var30, var31, var26, var27, var28, var41);
            class125.method2599(var29, var31, field1686[3], var26, var28, field1649[3], var41);
        } else {
            class125.method2630(var29, var30, var31, var26, var27, var28, field1687[0], field1687[1], field1687[2]);
            class125.method2630(var29, var31, field1686[3], var26, var28, field1649[3], field1687[0], field1687[2], field1687[3]);
        }
    }
}
