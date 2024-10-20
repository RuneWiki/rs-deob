package deob;

@ObfuscatedName("ds")
public class class122 extends class130 {

    @ObfuscatedName("ds.f")
    public static class122 field1699 = new class122();

    @ObfuscatedName("ds.l")
    public static byte[] field1638 = new byte[1];

    @ObfuscatedName("ds.w")
    public static class122 field1661 = new class122();

    @ObfuscatedName("ds.s")
    public static byte[] field1640 = new byte[1];

    @ObfuscatedName("ds.e")
    public int field1704 = 0;

    @ObfuscatedName("ds.a")
    public int[] field1642;

    @ObfuscatedName("ds.c")
    public int[] field1705;

    @ObfuscatedName("ds.p")
    public int[] field1644;

    @ObfuscatedName("ds.r")
    public int field1645 = 0;

    @ObfuscatedName("ds.m")
    public int[] field1646;

    @ObfuscatedName("ds.d")
    public int[] field1684;

    @ObfuscatedName("ds.z")
    public int[] field1648;

    @ObfuscatedName("ds.x")
    public int[] field1649;

    @ObfuscatedName("ds.v")
    public int[] field1650;

    @ObfuscatedName("ds.g")
    public int[] field1637;

    @ObfuscatedName("ds.j")
    public byte[] field1683;

    @ObfuscatedName("ds.b")
    public byte[] field1653;

    @ObfuscatedName("ds.u")
    public byte[] field1654;

    @ObfuscatedName("ds.t")
    public short[] field1655;

    @ObfuscatedName("ds.n")
    public byte field1656 = 0;

    @ObfuscatedName("ds.h")
    public int field1651 = 0;

    @ObfuscatedName("ds.o")
    public int[] field1672;

    @ObfuscatedName("ds.i")
    public int[] field1657;

    @ObfuscatedName("ds.k")
    public int[] field1660;

    @ObfuscatedName("ds.q")
    public int[][] field1687;

    @ObfuscatedName("ds.y")
    public int[][] field1662;

    @ObfuscatedName("ds.av")
    public boolean field1663 = false;

    @ObfuscatedName("ds.ag")
    public int field1664;

    @ObfuscatedName("ds.af")
    public int field1665;

    @ObfuscatedName("ds.az")
    public int field1666;

    @ObfuscatedName("ds.at")
    public int field1667;

    @ObfuscatedName("ds.ac")
    public int field1668;

    @ObfuscatedName("ds.am")
    public int field1669;

    @ObfuscatedName("ds.aw")
    public int field1659;

    @ObfuscatedName("ds.aa")
    public int field1671;

    @ObfuscatedName("ds.as")
    public int field1686 = -1;

    @ObfuscatedName("ds.al")
    public int field1673 = -1;

    @ObfuscatedName("ds.ad")
    public int field1674 = -1;

    @ObfuscatedName("ds.ao")
    public static boolean[] field1643 = new boolean[4700];

    @ObfuscatedName("ds.ae")
    public static boolean[] field1677 = new boolean[4700];

    @ObfuscatedName("ds.ap")
    public static int[] field1678 = new int[4700];

    @ObfuscatedName("ds.ar")
    public static int[] field1679 = new int[4700];

    @ObfuscatedName("ds.ab")
    public static int[] field1680 = new int[4700];

    @ObfuscatedName("ds.aq")
    public static int[] field1681 = new int[4700];

    @ObfuscatedName("ds.au")
    public static int[] field1682 = new int[4700];

    @ObfuscatedName("ds.aj")
    public static int[] field1676 = new int[4700];

    @ObfuscatedName("ds.ai")
    public static int[] field1652 = new int[1600];

    @ObfuscatedName("ds.an")
    public static int[][] field1658 = new int[1600][512];

    @ObfuscatedName("ds.ay")
    public static int[] field1685 = new int[12];

    @ObfuscatedName("ds.ak")
    public static int[][] field1688 = new int[12][2000];

    @ObfuscatedName("ds.be")
    public static int[] field1641 = new int[2000];

    @ObfuscatedName("ds.bo")
    public static int[] field1690 = new int[2000];

    @ObfuscatedName("ds.bx")
    public static int[] field1691 = new int[12];

    @ObfuscatedName("ds.bf")
    public static int[] field1703 = new int[10];

    @ObfuscatedName("ds.bl")
    public static int[] field1693 = new int[10];

    @ObfuscatedName("ds.bs")
    public static int[] field1694 = new int[10];

    @ObfuscatedName("ds.bw")
    public static boolean field1698 = true;

    @ObfuscatedName("ds.bn")
    public static int[] field1701 = class125.field1749;

    @ObfuscatedName("ds.bv")
    public static int[] field1702 = class125.field1743;

    @ObfuscatedName("ds.bu")
    public static int[] field1692 = class125.field1745;

    @ObfuscatedName("ds.bk")
    public static int[] field1647 = class125.field1734;

    public class122() {
    }

    public class122(class122[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1704 = 0;
        this.field1645 = 0;
        this.field1651 = 0;
        this.field1656 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class122 var8 = arg0[var7];
            if (var8 != null) {
                this.field1704 += var8.field1704;
                this.field1645 += var8.field1645;
                this.field1651 += var8.field1651;
                if (var8.field1683 == null) {
                    if (this.field1656 == -1) {
                        this.field1656 = var8.field1656;
                    }
                    if (this.field1656 != var8.field1656) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1653 != null;
                var5 |= var8.field1655 != null;
                var6 |= var8.field1654 != null;
            }
        }
        this.field1642 = new int[this.field1704];
        this.field1705 = new int[this.field1704];
        this.field1644 = new int[this.field1704];
        this.field1646 = new int[this.field1645];
        this.field1684 = new int[this.field1645];
        this.field1648 = new int[this.field1645];
        this.field1649 = new int[this.field1645];
        this.field1650 = new int[this.field1645];
        this.field1637 = new int[this.field1645];
        if (var3) {
            this.field1683 = new byte[this.field1645];
        }
        if (var4) {
            this.field1653 = new byte[this.field1645];
        }
        if (var5) {
            this.field1655 = new short[this.field1645];
        }
        if (var6) {
            this.field1654 = new byte[this.field1645];
        }
        if (this.field1651 > 0) {
            this.field1672 = new int[this.field1651];
            this.field1657 = new int[this.field1651];
            this.field1660 = new int[this.field1651];
        }
        this.field1704 = 0;
        this.field1645 = 0;
        this.field1651 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class122 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1645; var11++) {
                    this.field1646[this.field1645] = var10.field1646[var11] + this.field1704;
                    this.field1684[this.field1645] = var10.field1684[var11] + this.field1704;
                    this.field1648[this.field1645] = var10.field1648[var11] + this.field1704;
                    this.field1649[this.field1645] = var10.field1649[var11];
                    this.field1650[this.field1645] = var10.field1650[var11];
                    this.field1637[this.field1645] = var10.field1637[var11];
                    if (var3) {
                        if (var10.field1683 == null) {
                            this.field1683[this.field1645] = var10.field1656;
                        } else {
                            this.field1683[this.field1645] = var10.field1683[var11];
                        }
                    }
                    if (var4 && var10.field1653 != null) {
                        this.field1653[this.field1645] = var10.field1653[var11];
                    }
                    if (var5) {
                        if (var10.field1655 == null) {
                            this.field1655[this.field1645] = -1;
                        } else {
                            this.field1655[this.field1645] = var10.field1655[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1654 == null || var10.field1654[var11] == -1) {
                            this.field1654[this.field1645] = -1;
                        } else {
                            this.field1654[this.field1645] = (byte) (var10.field1654[var11] + this.field1651);
                        }
                    }
                    this.field1645++;
                }
                for (int var12 = 0; var12 < var10.field1651; var12++) {
                    this.field1672[this.field1651] = var10.field1672[var12] + this.field1704;
                    this.field1657[this.field1651] = var10.field1657[var12] + this.field1704;
                    this.field1660[this.field1651] = var10.field1660[var12] + this.field1704;
                    this.field1651++;
                }
                for (int var13 = 0; var13 < var10.field1704; var13++) {
                    this.field1642[this.field1704] = var10.field1642[var13];
                    this.field1705[this.field1704] = var10.field1705[var13];
                    this.field1644[this.field1704] = var10.field1644[var13];
                    this.field1704++;
                }
            }
        }
    }

    @ObfuscatedName("ds.f([[IIIIZI)Lds;")
    public class122 method2530(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2535();
        int var7 = arg1 - this.field1666;
        int var8 = this.field1666 + arg1;
        int var9 = arg3 - this.field1666;
        int var10 = this.field1666 + arg3;
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
            var15.field1704 = this.field1704;
            var15.field1645 = this.field1645;
            var15.field1651 = this.field1651;
            var15.field1642 = this.field1642;
            var15.field1644 = this.field1644;
            var15.field1646 = this.field1646;
            var15.field1684 = this.field1684;
            var15.field1648 = this.field1648;
            var15.field1649 = this.field1649;
            var15.field1650 = this.field1650;
            var15.field1637 = this.field1637;
            var15.field1683 = this.field1683;
            var15.field1653 = this.field1653;
            var15.field1654 = this.field1654;
            var15.field1655 = this.field1655;
            var15.field1656 = this.field1656;
            var15.field1672 = this.field1672;
            var15.field1657 = this.field1657;
            var15.field1660 = this.field1660;
            var15.field1687 = this.field1687;
            var15.field1662 = this.field1662;
            var15.field1663 = this.field1663;
            var15.field1705 = new int[var15.field1704];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1704; var16++) {
                int var17 = this.field1642[var16] + arg1;
                int var18 = this.field1644[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1705[var16] = this.field1705[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1704; var26++) {
                int var27 = (-this.field1705[var26] << 16) / this.field1841;
                if (var27 < arg5) {
                    int var28 = this.field1642[var26] + arg1;
                    int var29 = this.field1644[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1705[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1705[var26];
                }
            }
        }
        var15.method2538();
        return var15;
    }

    @ObfuscatedName("ds.l(Z)Lds;")
    public class122 method2536(boolean arg0) {
        if (!arg0 && field1638.length < this.field1645) {
            field1638 = new byte[this.field1645 + 100];
        }
        return this.method2533(arg0, field1699, field1638);
    }

    @ObfuscatedName("ds.w(Z)Lds;")
    public class122 method2532(boolean arg0) {
        if (!arg0 && field1640.length < this.field1645) {
            field1640 = new byte[this.field1645 + 100];
        }
        return this.method2533(arg0, field1661, field1640);
    }

    @ObfuscatedName("ds.s(ZLds;[B)Lds;")
    public class122 method2533(boolean arg0, class122 arg1, byte[] arg2) {
        arg1.field1704 = this.field1704;
        arg1.field1645 = this.field1645;
        arg1.field1651 = this.field1651;
        if (arg1.field1642 == null || arg1.field1642.length < this.field1704) {
            arg1.field1642 = new int[this.field1704 + 100];
            arg1.field1705 = new int[this.field1704 + 100];
            arg1.field1644 = new int[this.field1704 + 100];
        }
        for (int var4 = 0; var4 < this.field1704; var4++) {
            arg1.field1642[var4] = this.field1642[var4];
            arg1.field1705[var4] = this.field1705[var4];
            arg1.field1644[var4] = this.field1644[var4];
        }
        if (arg0) {
            arg1.field1653 = this.field1653;
        } else {
            arg1.field1653 = arg2;
            if (this.field1653 == null) {
                for (int var5 = 0; var5 < this.field1645; var5++) {
                    arg1.field1653[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1645; var6++) {
                    arg1.field1653[var6] = this.field1653[var6];
                }
            }
        }
        arg1.field1646 = this.field1646;
        arg1.field1684 = this.field1684;
        arg1.field1648 = this.field1648;
        arg1.field1649 = this.field1649;
        arg1.field1650 = this.field1650;
        arg1.field1637 = this.field1637;
        arg1.field1683 = this.field1683;
        arg1.field1654 = this.field1654;
        arg1.field1655 = this.field1655;
        arg1.field1656 = this.field1656;
        arg1.field1672 = this.field1672;
        arg1.field1657 = this.field1657;
        arg1.field1660 = this.field1660;
        arg1.field1687 = this.field1687;
        arg1.field1662 = this.field1662;
        arg1.field1663 = this.field1663;
        arg1.method2538();
        return arg1;
    }

    @ObfuscatedName("ds.e(I)V")
    public void method2531(int arg0) {
        if (this.field1686 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1702[arg0];
        int var9 = field1701[arg0];
        for (int var10 = 0; var10 < this.field1704; var10++) {
            int var11 = class125.method2646(this.field1642[var10], this.field1644[var10], var8, var9);
            int var12 = this.field1705[var10];
            int var13 = class125.method2659(this.field1642[var10], this.field1644[var10], var8, var9);
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
        this.field1669 = (var2 + var5) / 2;
        this.field1659 = (var3 + var6) / 2;
        this.field1671 = (var4 + var7) / 2;
        this.field1686 = (var5 - var2 + 1) / 2;
        this.field1673 = (var6 - var3 + 1) / 2;
        this.field1674 = (var7 - var4 + 1) / 2;
        if (this.field1686 < 32) {
            this.field1686 = 32;
        }
        if (this.field1674 < 32) {
            this.field1674 = 32;
        }
        if (this.field1663) {
            this.field1686 += 8;
            this.field1674 += 8;
        }
    }

    @ObfuscatedName("ds.c()V")
    public void method2535() {
        if (this.field1664 == 1) {
            return;
        }
        this.field1664 = 1;
        this.field1841 = 0;
        this.field1665 = 0;
        this.field1666 = 0;
        for (int var1 = 0; var1 < this.field1704; var1++) {
            int var2 = this.field1642[var1];
            int var3 = this.field1705[var1];
            int var4 = this.field1644[var1];
            if (-var3 > this.field1841) {
                this.field1841 = -var3;
            }
            if (var3 > this.field1665) {
                this.field1665 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1666) {
                this.field1666 = var5;
            }
        }
        this.field1666 = (int) (Math.sqrt((double) this.field1666) + 0.99D);
        this.field1668 = (int) (Math.sqrt((double) (this.field1841 * this.field1841 + this.field1666 * this.field1666)) + 0.99D);
        this.field1667 = this.field1668 + (int) (Math.sqrt((double) (this.field1666 * this.field1666 + this.field1665 * this.field1665)) + 0.99D);
    }

    @ObfuscatedName("ds.p()V")
    public void method2553() {
        if (this.field1664 == 2) {
            return;
        }
        this.field1664 = 2;
        this.field1666 = 0;
        for (int var1 = 0; var1 < this.field1704; var1++) {
            int var2 = this.field1642[var1];
            int var3 = this.field1705[var1];
            int var4 = this.field1644[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1666) {
                this.field1666 = var5;
            }
        }
        this.field1666 = (int) (Math.sqrt((double) this.field1666) + 0.99D);
        this.field1668 = this.field1666;
        this.field1667 = this.field1666 + this.field1666;
    }

    @ObfuscatedName("ds.r()I")
    public int method2537() {
        this.method2535();
        return this.field1666;
    }

    @ObfuscatedName("ds.d()V")
    public void method2538() {
        this.field1664 = 0;
        this.field1686 = -1;
    }

    @ObfuscatedName("ds.z(Let;I)V")
    public void method2539(class133 arg0, int arg1) {
        if (this.field1687 == null || arg1 == -1) {
            return;
        }
        class120 var3 = arg0.field1862[arg1];
        class127 var4 = var3.field1605;
        Statics.field1695 = 0;
        Statics.field1696 = 0;
        Statics.field1689 = 0;
        for (int var5 = 0; var5 < var3.field1606; var5++) {
            int var6 = var3.field1607[var5];
            this.method2555(var4.field1761[var6], var4.field1762[var6], var3.field1611[var5], var3.field1602[var5], var3.field1610[var5]);
        }
        this.method2538();
    }

    @ObfuscatedName("ds.x(Let;ILet;I[I)V")
    public void method2540(class133 arg0, int arg1, class133 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2539(arg0, arg1);
            return;
        }
        class120 var6 = arg0.field1862[arg1];
        class120 var7 = arg2.field1862[arg3];
        class127 var8 = var6.field1605;
        Statics.field1695 = 0;
        Statics.field1696 = 0;
        Statics.field1689 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1606; var11++) {
            int var12 = var6.field1607[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1761[var12] == 0) {
                this.method2555(var8.field1761[var12], var8.field1762[var12], var6.field1611[var11], var6.field1602[var11], var6.field1610[var11]);
            }
        }
        Statics.field1695 = 0;
        Statics.field1696 = 0;
        Statics.field1689 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1606; var15++) {
            int var16 = var7.field1607[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1761[var16] == 0) {
                this.method2555(var8.field1761[var16], var8.field1762[var16], var7.field1611[var15], var7.field1602[var15], var7.field1610[var15]);
            }
        }
        this.method2538();
    }

    @ObfuscatedName("ds.v(I[IIII)V")
    public void method2555(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1695 = 0;
            Statics.field1696 = 0;
            Statics.field1689 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1687.length) {
                    int[] var10 = this.field1687[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1695 += this.field1642[var12];
                        Statics.field1696 += this.field1705[var12];
                        Statics.field1689 += this.field1644[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1695 = Statics.field1695 / var7 + arg2;
                Statics.field1696 = Statics.field1696 / var7 + arg3;
                Statics.field1689 = Statics.field1689 / var7 + arg4;
            } else {
                Statics.field1695 = arg2;
                Statics.field1696 = arg3;
                Statics.field1689 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1687.length) {
                    int[] var15 = this.field1687[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1642[var17] += arg2;
                        this.field1705[var17] += arg3;
                        this.field1644[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1687.length) {
                    int[] var20 = this.field1687[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1642[var22] -= Statics.field1695;
                        this.field1705[var22] -= Statics.field1696;
                        this.field1644[var22] -= Statics.field1689;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1701[var25];
                            int var27 = field1702[var25];
                            int var28 = this.field1705[var22] * var26 + this.field1642[var22] * var27 >> 16;
                            this.field1705[var22] = this.field1705[var22] * var27 - this.field1642[var22] * var26 >> 16;
                            this.field1642[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1701[var23];
                            int var30 = field1702[var23];
                            int var31 = this.field1705[var22] * var30 - this.field1644[var22] * var29 >> 16;
                            this.field1644[var22] = this.field1705[var22] * var29 + this.field1644[var22] * var30 >> 16;
                            this.field1705[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1701[var24];
                            int var33 = field1702[var24];
                            int var34 = this.field1644[var22] * var32 + this.field1642[var22] * var33 >> 16;
                            this.field1644[var22] = this.field1644[var22] * var33 - this.field1642[var22] * var32 >> 16;
                            this.field1642[var22] = var34;
                        }
                        this.field1642[var22] += Statics.field1695;
                        this.field1705[var22] += Statics.field1696;
                        this.field1644[var22] += Statics.field1689;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1687.length) {
                    int[] var37 = this.field1687[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1642[var39] -= Statics.field1695;
                        this.field1705[var39] -= Statics.field1696;
                        this.field1644[var39] -= Statics.field1689;
                        this.field1642[var39] = this.field1642[var39] * arg2 / 128;
                        this.field1705[var39] = this.field1705[var39] * arg3 / 128;
                        this.field1644[var39] = this.field1644[var39] * arg4 / 128;
                        this.field1642[var39] += Statics.field1695;
                        this.field1705[var39] += Statics.field1696;
                        this.field1644[var39] += Statics.field1689;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1662 != null && this.field1653 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1662.length) {
                    int[] var42 = this.field1662[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1653[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1653[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ds.g()V")
    public void method2588() {
        for (int var1 = 0; var1 < this.field1704; var1++) {
            int var2 = this.field1642[var1];
            this.field1642[var1] = this.field1644[var1];
            this.field1644[var1] = -var2;
        }
        this.method2538();
    }

    @ObfuscatedName("ds.u()V")
    public void method2543() {
        for (int var1 = 0; var1 < this.field1704; var1++) {
            this.field1642[var1] = -this.field1642[var1];
            this.field1644[var1] = -this.field1644[var1];
        }
        this.method2538();
    }

    @ObfuscatedName("ds.o()V")
    public void method2544() {
        for (int var1 = 0; var1 < this.field1704; var1++) {
            int var2 = this.field1644[var1];
            this.field1644[var1] = this.field1642[var1];
            this.field1642[var1] = -var2;
        }
        this.method2538();
    }

    @ObfuscatedName("ds.i(I)V")
    public void method2545(int arg0) {
        int var2 = field1701[arg0];
        int var3 = field1702[arg0];
        for (int var4 = 0; var4 < this.field1704; var4++) {
            int var5 = this.field1705[var4] * var3 - this.field1644[var4] * var2 >> 16;
            this.field1644[var4] = this.field1705[var4] * var2 + this.field1644[var4] * var3 >> 16;
            this.field1705[var4] = var5;
        }
        this.method2538();
    }

    @ObfuscatedName("ds.k(III)V")
    public void method2566(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1704; var4++) {
            this.field1642[var4] += arg0;
            this.field1705[var4] += arg1;
            this.field1644[var4] += arg2;
        }
        this.method2538();
    }

    @ObfuscatedName("ds.q(III)V")
    public void method2581(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1704; var4++) {
            this.field1642[var4] = this.field1642[var4] * arg0 / 128;
            this.field1705[var4] = this.field1705[var4] * arg1 / 128;
            this.field1644[var4] = this.field1644[var4] * arg2 / 128;
        }
        this.method2538();
    }

    @ObfuscatedName("ds.y(IIIIIII)V")
    public final void method2548(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1652[0] = -1;
        if (this.field1664 != 2 && this.field1664 != 1) {
            this.method2553();
        }
        int var8 = Statics.field1736;
        int var9 = Statics.field1726;
        int var10 = field1701[arg0];
        int var11 = field1702[arg0];
        int var12 = field1701[arg1];
        int var13 = field1702[arg1];
        int var14 = field1701[arg2];
        int var15 = field1702[arg2];
        int var16 = field1701[arg3];
        int var17 = field1702[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1704; var19++) {
            int var20 = this.field1642[var19];
            int var21 = this.field1705[var19];
            int var22 = this.field1644[var19];
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
            field1680[var19] = var30 - var18;
            field1678[var19] = class125.field1735 * var26 / var30 + var8;
            field1679[var19] = class125.field1735 * var29 / var30 + var9;
            if (this.field1651 > 0) {
                field1681[var19] = var26;
                field1682[var19] = var29;
                field1676[var19] = var30;
            }
        }
        try {
            this.method2551(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ds.av(IIIIIIII)V")
    public final void method2549(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1652[0] = -1;
        if (this.field1664 != 2 && this.field1664 != 1) {
            this.method2553();
        }
        int var9 = Statics.field1736;
        int var10 = Statics.field1726;
        int var11 = field1701[arg0];
        int var12 = field1702[arg0];
        int var13 = field1701[arg1];
        int var14 = field1702[arg1];
        int var15 = field1701[arg2];
        int var16 = field1702[arg2];
        int var17 = field1701[arg3];
        int var18 = field1702[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1704; var20++) {
            int var21 = this.field1642[var20];
            int var22 = this.field1705[var20];
            int var23 = this.field1644[var20];
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
            field1680[var20] = var31 - var19;
            field1678[var20] = class125.field1735 * var27 / arg7 + var9;
            field1679[var20] = class125.field1735 * var30 / arg7 + var10;
            if (this.field1651 > 0) {
                field1681[var20] = var27;
                field1682[var20] = var30;
                field1676[var20] = var31;
            }
        }
        try {
            this.method2551(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ds.cw(IIIIIIIIJ)V")
    public void method2550(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1652[0] = -1;
        if (this.field1664 != 1) {
            this.method2535();
        }
        this.method2531(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field1666 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field1666) * class125.field1735;
        if (var16 / var14 >= Statics.field1741) {
            return;
        }
        int var17 = (this.field1666 + var15) * class125.field1735;
        if (var17 / var14 <= Statics.field1744) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field1666 * arg1 >> 16;
        int var20 = (var18 + var19) * class125.field1735;
        if (var20 / var14 <= Statics.field1740) {
            return;
        }
        int var21 = (this.field1841 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class125.field1735;
        if (var22 / var14 >= Statics.field1742) {
            return;
        }
        int var23 = (this.field1841 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field1651 > 0;
        int var27 = class123.field1710;
        int var29 = class123.method23();
        boolean var30 = class123.method603();
        boolean var31 = arg8 != 0L;
        if (var31) {
            boolean var32 = (int) (arg8 >>> 16 & 0x1L) == 1;
            var31 = !var32;
        }
        boolean var35 = false;
        if (var31 && var30) {
            boolean var36 = false;
            if (field1698) {
                var36 = class123.method94(this, arg5, arg6, arg7);
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
                int var42 = var27 - Statics.field1736;
                int var43 = var29 - Statics.field1726;
                if (var42 > var38 && var42 < var39 && var43 > var40 && var43 < var41) {
                    var36 = true;
                }
            }
            if (var36) {
                if (this.field1663) {
                    class123.method1563(arg8);
                } else {
                    var35 = true;
                }
            }
        }
        int var44 = Statics.field1736;
        int var45 = Statics.field1726;
        int var46 = 0;
        int var47 = 0;
        if (arg0 != 0) {
            var46 = field1701[arg0];
            var47 = field1702[arg0];
        }
        for (int var48 = 0; var48 < this.field1704; var48++) {
            int var49 = this.field1642[var48];
            int var50 = this.field1705[var48];
            int var51 = this.field1644[var48];
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
            field1680[var48] = var60 - var12;
            if (var60 >= 50) {
                field1678[var48] = class125.field1735 * var56 / var60 + var44;
                field1679[var48] = class125.field1735 * var59 / var60 + var45;
            } else {
                field1678[var48] = -5000;
                var24 = true;
            }
            if (var26) {
                field1681[var48] = var56;
                field1682[var48] = var59;
                field1676[var48] = var60;
            }
        }
        try {
            this.method2551(var24, var35, this.field1663, arg8);
        } catch (Exception var63) {
        }
    }

    @ObfuscatedName("ds.ag(ZZZJ)V")
    public final void method2551(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field1667 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field1667; var6++) {
            field1652[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field1645; var8++) {
            if (this.field1637[var8] != -2) {
                int var9 = this.field1646[var8];
                int var10 = this.field1684[var8];
                int var11 = this.field1648[var8];
                int var12 = field1678[var9];
                int var13 = field1678[var10];
                int var14 = field1678[var11];
                if (arg0 && var12 == -5000 || var13 == -5000 || var14 == -5000) {
                    int var15 = field1681[var9];
                    int var16 = field1681[var10];
                    int var17 = field1681[var11];
                    int var18 = field1682[var9];
                    int var19 = field1682[var10];
                    int var20 = field1682[var11];
                    int var21 = field1676[var9];
                    int var22 = field1676[var10];
                    int var23 = field1676[var11];
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
                        field1677[var8] = true;
                        int var33 = (field1680[var9] + field1680[var10] + field1680[var11]) / 3 + this.field1668;
                        field1658[var33][field1652[var33]++] = var8;
                    }
                } else {
                    if (arg1) {
                        int var34 = field1679[var9];
                        int var35 = field1679[var10];
                        int var36 = field1679[var11];
                        int var37 = class123.field1709 + var7;
                        boolean var38;
                        if (var37 < var34 && var37 < var35 && var37 < var36) {
                            var38 = false;
                        } else {
                            int var39 = class123.field1709 - var7;
                            if (var39 > var34 && var39 > var35 && var39 > var36) {
                                var38 = false;
                            } else {
                                int var40 = class123.field1710 + var7;
                                if (var40 < var12 && var40 < var13 && var40 < var14) {
                                    var38 = false;
                                } else {
                                    int var41 = class123.field1710 - var7;
                                    if (var41 > var12 && var41 > var13 && var41 > var14) {
                                        var38 = false;
                                    } else {
                                        var38 = true;
                                    }
                                }
                            }
                        }
                        if (var38) {
                            class123.field1714[++class123.field1707 - 1] = arg3;
                            arg1 = false;
                        }
                    }
                    if ((field1679[var11] - field1679[var10]) * (var12 - var13) - (field1679[var9] - field1679[var10]) * (var14 - var13) > 0) {
                        field1677[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field1737 && var13 <= Statics.field1737 && var14 <= Statics.field1737) {
                            field1643[var8] = false;
                        } else {
                            field1643[var8] = true;
                        }
                        int var44 = (field1680[var9] + field1680[var10] + field1680[var11]) / 3 + this.field1668;
                        field1658[var44][field1652[var44]++] = var8;
                    }
                }
            }
        }
        if (this.field1683 == null) {
            for (int var45 = this.field1667 - 1; var45 >= 0; var45--) {
                int var46 = field1652[var45];
                if (var46 > 0) {
                    int[] var47 = field1658[var45];
                    for (int var48 = 0; var48 < var46; var48++) {
                        this.method2552(var47[var48]);
                    }
                }
            }
            return;
        }
        for (int var49 = 0; var49 < 12; var49++) {
            field1685[var49] = 0;
            field1691[var49] = 0;
        }
        for (int var50 = this.field1667 - 1; var50 >= 0; var50--) {
            int var51 = field1652[var50];
            if (var51 > 0) {
                int[] var52 = field1658[var50];
                for (int var53 = 0; var53 < var51; var53++) {
                    int var54 = var52[var53];
                    byte var55 = this.field1683[var54];
                    int var56 = field1685[var55]++;
                    field1688[var55][var56] = var54;
                    if (var55 < 10) {
                        field1691[var55] += var50;
                    } else if (var55 == 10) {
                        field1641[var56] = var50;
                    } else {
                        field1690[var56] = var50;
                    }
                }
            }
        }
        int var57 = 0;
        if (field1685[1] > 0 || field1685[2] > 0) {
            var57 = (field1691[1] + field1691[2]) / (field1685[1] + field1685[2]);
        }
        int var58 = 0;
        if (field1685[3] > 0 || field1685[4] > 0) {
            var58 = (field1691[3] + field1691[4]) / (field1685[3] + field1685[4]);
        }
        int var59 = 0;
        if (field1685[6] > 0 || field1685[8] > 0) {
            var59 = (field1691[6] + field1691[8]) / (field1685[6] + field1685[8]);
        }
        int var60 = 0;
        int var61 = field1685[10];
        int[] var62 = field1688[10];
        int[] var63 = field1641;
        if (var60 == var61) {
            var60 = 0;
            var61 = field1685[11];
            var62 = field1688[11];
            var63 = field1690;
        }
        int var64;
        if (var60 < var61) {
            var64 = var63[var60];
        } else {
            var64 = -1000;
        }
        for (int var65 = 0; var65 < 10; var65++) {
            while (var65 == 0 && var64 > var57) {
                this.method2552(var62[var60++]);
                if (var60 == var61 && field1688[11] != var62) {
                    var60 = 0;
                    var61 = field1685[11];
                    var62 = field1688[11];
                    var63 = field1690;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            while (var65 == 3 && var64 > var58) {
                this.method2552(var62[var60++]);
                if (var60 == var61 && field1688[11] != var62) {
                    var60 = 0;
                    var61 = field1685[11];
                    var62 = field1688[11];
                    var63 = field1690;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            while (var65 == 5 && var64 > var59) {
                this.method2552(var62[var60++]);
                if (var60 == var61 && field1688[11] != var62) {
                    var60 = 0;
                    var61 = field1685[11];
                    var62 = field1688[11];
                    var63 = field1690;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            int var66 = field1685[var65];
            int[] var67 = field1688[var65];
            for (int var68 = 0; var68 < var66; var68++) {
                this.method2552(var67[var68]);
            }
        }
        while (var64 != -1000) {
            this.method2552(var62[var60++]);
            if (var60 == var61 && field1688[11] != var62) {
                var60 = 0;
                var62 = field1688[11];
                var61 = field1685[11];
                var63 = field1690;
            }
            if (var60 < var61) {
                var64 = var63[var60];
            } else {
                var64 = -1000;
            }
        }
    }

    @ObfuscatedName("ds.af(I)V")
    public final void method2552(int arg0) {
        if (field1677[arg0]) {
            this.method2592(arg0);
            return;
        }
        int var2 = this.field1646[arg0];
        int var3 = this.field1684[arg0];
        int var4 = this.field1648[arg0];
        class125.field1738 = field1643[arg0];
        if (this.field1653 == null) {
            class125.field1728 = 0;
        } else {
            class125.field1728 = this.field1653[arg0] & 0xFF;
        }
        if (this.field1655 != null && this.field1655[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1654 == null || this.field1654[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1654[arg0] & 0xFF;
                var6 = this.field1672[var5];
                var7 = this.field1657[var5];
                var8 = this.field1660[var5];
            }
            if (this.field1637[arg0] == -1) {
                class125.method2653(field1679[var2], field1679[var3], field1679[var4], field1678[var2], field1678[var3], field1678[var4], this.field1649[arg0], this.field1649[arg0], this.field1649[arg0], field1681[var6], field1681[var7], field1681[var8], field1682[var6], field1682[var7], field1682[var8], field1676[var6], field1676[var7], field1676[var8], this.field1655[arg0]);
            } else {
                class125.method2653(field1679[var2], field1679[var3], field1679[var4], field1678[var2], field1678[var3], field1678[var4], this.field1649[arg0], this.field1650[arg0], this.field1637[arg0], field1681[var6], field1681[var7], field1681[var8], field1682[var6], field1682[var7], field1682[var8], field1676[var6], field1676[var7], field1676[var8], this.field1655[arg0]);
            }
        } else if (this.field1637[arg0] == -1) {
            class125.method2718(field1679[var2], field1679[var3], field1679[var4], field1678[var2], field1678[var3], field1678[var4], field1692[this.field1649[arg0]]);
        } else {
            class125.method2649(field1679[var2], field1679[var3], field1679[var4], field1678[var2], field1678[var3], field1678[var4], this.field1649[arg0], this.field1650[arg0], this.field1637[arg0]);
        }
    }

    @ObfuscatedName("ds.az(I)V")
    public final void method2592(int arg0) {
        int var2 = Statics.field1736;
        int var3 = Statics.field1726;
        int var4 = 0;
        int var5 = this.field1646[arg0];
        int var6 = this.field1684[arg0];
        int var7 = this.field1648[arg0];
        int var8 = field1676[var5];
        int var9 = field1676[var6];
        int var10 = field1676[var7];
        if (this.field1653 == null) {
            class125.field1728 = 0;
        } else {
            class125.field1728 = this.field1653[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1703[var4] = field1678[var5];
            field1693[var4] = field1679[var5];
            field1694[var4++] = this.field1649[arg0];
        } else {
            int var11 = field1681[var5];
            int var12 = field1682[var5];
            int var13 = this.field1649[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1647[var10 - var8];
                field1703[var4] = (((field1681[var7] - var11) * var14 >> 16) + var11) * class125.field1735 / 50 + var2;
                field1693[var4] = (((field1682[var7] - var12) * var14 >> 16) + var12) * class125.field1735 / 50 + var3;
                field1694[var4++] = ((this.field1637[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1647[var9 - var8];
                field1703[var4] = (((field1681[var6] - var11) * var15 >> 16) + var11) * class125.field1735 / 50 + var2;
                field1693[var4] = (((field1682[var6] - var12) * var15 >> 16) + var12) * class125.field1735 / 50 + var3;
                field1694[var4++] = ((this.field1650[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1703[var4] = field1678[var6];
            field1693[var4] = field1679[var6];
            field1694[var4++] = this.field1650[arg0];
        } else {
            int var16 = field1681[var6];
            int var17 = field1682[var6];
            int var18 = this.field1650[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1647[var8 - var9];
                field1703[var4] = (((field1681[var5] - var16) * var19 >> 16) + var16) * class125.field1735 / 50 + var2;
                field1693[var4] = (((field1682[var5] - var17) * var19 >> 16) + var17) * class125.field1735 / 50 + var3;
                field1694[var4++] = ((this.field1649[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1647[var10 - var9];
                field1703[var4] = (((field1681[var7] - var16) * var20 >> 16) + var16) * class125.field1735 / 50 + var2;
                field1693[var4] = (((field1682[var7] - var17) * var20 >> 16) + var17) * class125.field1735 / 50 + var3;
                field1694[var4++] = ((this.field1637[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1703[var4] = field1678[var7];
            field1693[var4] = field1679[var7];
            field1694[var4++] = this.field1637[arg0];
        } else {
            int var21 = field1681[var7];
            int var22 = field1682[var7];
            int var23 = this.field1637[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1647[var9 - var10];
                field1703[var4] = (((field1681[var6] - var21) * var24 >> 16) + var21) * class125.field1735 / 50 + var2;
                field1693[var4] = (((field1682[var6] - var22) * var24 >> 16) + var22) * class125.field1735 / 50 + var3;
                field1694[var4++] = ((this.field1650[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1647[var8 - var10];
                field1703[var4] = (((field1681[var5] - var21) * var25 >> 16) + var21) * class125.field1735 / 50 + var2;
                field1693[var4] = (((field1682[var5] - var22) * var25 >> 16) + var22) * class125.field1735 / 50 + var3;
                field1694[var4++] = ((this.field1649[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1703[0];
        int var27 = field1703[1];
        int var28 = field1703[2];
        int var29 = field1693[0];
        int var30 = field1693[1];
        int var31 = field1693[2];
        class125.field1738 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1737 || var27 > Statics.field1737 || var28 > Statics.field1737) {
                class125.field1738 = true;
            }
            if (this.field1655 != null && this.field1655[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1654 == null || this.field1654[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1654[arg0] & 0xFF;
                    var33 = this.field1672[var32];
                    var34 = this.field1657[var32];
                    var35 = this.field1660[var32];
                }
                if (this.field1637[arg0] == -1) {
                    class125.method2653(var29, var30, var31, var26, var27, var28, this.field1649[arg0], this.field1649[arg0], this.field1649[arg0], field1681[var33], field1681[var34], field1681[var35], field1682[var33], field1682[var34], field1682[var35], field1676[var33], field1676[var34], field1676[var35], this.field1655[arg0]);
                } else {
                    class125.method2653(var29, var30, var31, var26, var27, var28, field1694[0], field1694[1], field1694[2], field1681[var33], field1681[var34], field1681[var35], field1682[var33], field1682[var34], field1682[var35], field1676[var33], field1676[var34], field1676[var35], this.field1655[arg0]);
                }
            } else if (this.field1637[arg0] == -1) {
                class125.method2718(var29, var30, var31, var26, var27, var28, field1692[this.field1649[arg0]]);
            } else {
                class125.method2649(var29, var30, var31, var26, var27, var28, field1694[0], field1694[1], field1694[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1737 || var27 > Statics.field1737 || var28 > Statics.field1737 || field1703[3] < 0 || field1703[3] > Statics.field1737) {
            class125.field1738 = true;
        }
        if (this.field1655 != null && this.field1655[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1654 == null || this.field1654[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1654[arg0] & 0xFF;
                var37 = this.field1672[var36];
                var38 = this.field1657[var36];
                var39 = this.field1660[var36];
            }
            short var40 = this.field1655[arg0];
            if (this.field1637[arg0] == -1) {
                class125.method2653(var29, var30, var31, var26, var27, var28, this.field1649[arg0], this.field1649[arg0], this.field1649[arg0], field1681[var37], field1681[var38], field1681[var39], field1682[var37], field1682[var38], field1682[var39], field1676[var37], field1676[var38], field1676[var39], var40);
                class125.method2653(var29, var31, field1693[3], var26, var28, field1703[3], this.field1649[arg0], this.field1649[arg0], this.field1649[arg0], field1681[var37], field1681[var38], field1681[var39], field1682[var37], field1682[var38], field1682[var39], field1676[var37], field1676[var38], field1676[var39], var40);
            } else {
                class125.method2653(var29, var30, var31, var26, var27, var28, field1694[0], field1694[1], field1694[2], field1681[var37], field1681[var38], field1681[var39], field1682[var37], field1682[var38], field1682[var39], field1676[var37], field1676[var38], field1676[var39], var40);
                class125.method2653(var29, var31, field1693[3], var26, var28, field1703[3], field1694[0], field1694[2], field1694[3], field1681[var37], field1681[var38], field1681[var39], field1682[var37], field1682[var38], field1682[var39], field1676[var37], field1676[var38], field1676[var39], var40);
            }
        } else if (this.field1637[arg0] == -1) {
            int var41 = field1692[this.field1649[arg0]];
            class125.method2718(var29, var30, var31, var26, var27, var28, var41);
            class125.method2718(var29, var31, field1693[3], var26, var28, field1703[3], var41);
        } else {
            class125.method2649(var29, var30, var31, var26, var27, var28, field1694[0], field1694[1], field1694[2]);
            class125.method2649(var29, var31, field1693[3], var26, var28, field1703[3], field1694[0], field1694[2], field1694[3]);
        }
    }
}
