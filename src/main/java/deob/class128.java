package deob;

@ObfuscatedName("dh")
public class class128 extends class136 {

    @ObfuscatedName("dh.z")
    public static class128 field1679 = new class128();

    @ObfuscatedName("dh.n")
    public static byte[] field1692 = new byte[1];

    @ObfuscatedName("dh.v")
    public static class128 field1636 = new class128();

    @ObfuscatedName("dh.u")
    public static byte[] field1637 = new byte[1];

    @ObfuscatedName("dh.r")
    public int field1638 = 0;

    @ObfuscatedName("dh.p")
    public int[] field1639;

    @ObfuscatedName("dh.q")
    public int[] field1676;

    @ObfuscatedName("dh.m")
    public int[] field1641;

    @ObfuscatedName("dh.y")
    public int field1642 = 0;

    @ObfuscatedName("dh.i")
    public int[] field1643;

    @ObfuscatedName("dh.c")
    public int[] field1644;

    @ObfuscatedName("dh.b")
    public int[] field1645;

    @ObfuscatedName("dh.o")
    public int[] field1660;

    @ObfuscatedName("dh.a")
    public int[] field1647;

    @ObfuscatedName("dh.e")
    public int[] field1648;

    @ObfuscatedName("dh.w")
    public byte[] field1649;

    @ObfuscatedName("dh.t")
    public byte[] field1650;

    @ObfuscatedName("dh.g")
    public byte[] field1640;

    @ObfuscatedName("dh.x")
    public short[] field1652;

    @ObfuscatedName("dh.h")
    public byte field1635 = 0;

    @ObfuscatedName("dh.s")
    public int field1686 = 0;

    @ObfuscatedName("dh.f")
    public int[] field1655;

    @ObfuscatedName("dh.j")
    public int[] field1656;

    @ObfuscatedName("dh.d")
    public int[] field1654;

    @ObfuscatedName("dh.l")
    public int[][] field1658;

    @ObfuscatedName("dh.k")
    public int[][] field1664;

    @ObfuscatedName("dh.ac")
    public boolean field1697 = false;

    @ObfuscatedName("dh.az")
    public int field1667;

    @ObfuscatedName("dh.aw")
    public int field1662;

    @ObfuscatedName("dh.aa")
    public int field1663;

    @ObfuscatedName("dh.ap")
    public int field1661;

    @ObfuscatedName("dh.ar")
    public int field1685;

    @ObfuscatedName("dh.ab")
    public int field1666;

    @ObfuscatedName("dh.ax")
    public int field1665;

    @ObfuscatedName("dh.as")
    public int field1668;

    @ObfuscatedName("dh.ao")
    public int field1669 = -1;

    @ObfuscatedName("dh.al")
    public int field1687 = -1;

    @ObfuscatedName("dh.ad")
    public int field1671 = -1;

    @ObfuscatedName("dh.ai")
    public static boolean[] field1673 = new boolean[4700];

    @ObfuscatedName("dh.ak")
    public static boolean[] field1674 = new boolean[4700];

    @ObfuscatedName("dh.aq")
    public static int[] field1675 = new int[4700];

    @ObfuscatedName("dh.am")
    public static int[] field1690 = new int[4700];

    @ObfuscatedName("dh.ae")
    public static int[] field1657 = new int[4700];

    @ObfuscatedName("dh.av")
    public static int[] field1678 = new int[4700];

    @ObfuscatedName("dh.ah")
    public static int[] field1653 = new int[4700];

    @ObfuscatedName("dh.ag")
    public static int[] field1680 = new int[4700];

    @ObfuscatedName("dh.ay")
    public static int[] field1682 = new int[1600];

    @ObfuscatedName("dh.au")
    public static int[][] field1683 = new int[1600][512];

    @ObfuscatedName("dh.af")
    public static int[] field1684 = new int[12];

    @ObfuscatedName("dh.at")
    public static int[][] field1646 = new int[12][2000];

    @ObfuscatedName("dh.bx")
    public static int[] field1698 = new int[2000];

    @ObfuscatedName("dh.bh")
    public static int[] field1659 = new int[2000];

    @ObfuscatedName("dh.bd")
    public static int[] field1688 = new int[12];

    @ObfuscatedName("dh.bm")
    public static int[] field1689 = new int[10];

    @ObfuscatedName("dh.bv")
    public static int[] field1677 = new int[10];

    @ObfuscatedName("dh.bj")
    public static int[] field1691 = new int[10];

    @ObfuscatedName("dh.bk")
    public static boolean field1695 = true;

    @ObfuscatedName("dh.be")
    public static int[] field1694 = class131.field1747;

    @ObfuscatedName("dh.bu")
    public static int[] field1699 = class131.field1730;

    @ObfuscatedName("dh.bi")
    public static int[] field1700 = class131.field1751;

    @ObfuscatedName("dh.bb")
    public static int[] field1701 = class131.field1754;

    public class128() {
    }

    public class128(class128[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1638 = 0;
        this.field1642 = 0;
        this.field1686 = 0;
        this.field1635 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class128 var8 = arg0[var7];
            if (var8 != null) {
                this.field1638 += var8.field1638;
                this.field1642 += var8.field1642;
                this.field1686 += var8.field1686;
                if (var8.field1649 == null) {
                    if (this.field1635 == -1) {
                        this.field1635 = var8.field1635;
                    }
                    if (this.field1635 != var8.field1635) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1650 != null;
                var5 |= var8.field1652 != null;
                var6 |= var8.field1640 != null;
            }
        }
        this.field1639 = new int[this.field1638];
        this.field1676 = new int[this.field1638];
        this.field1641 = new int[this.field1638];
        this.field1643 = new int[this.field1642];
        this.field1644 = new int[this.field1642];
        this.field1645 = new int[this.field1642];
        this.field1660 = new int[this.field1642];
        this.field1647 = new int[this.field1642];
        this.field1648 = new int[this.field1642];
        if (var3) {
            this.field1649 = new byte[this.field1642];
        }
        if (var4) {
            this.field1650 = new byte[this.field1642];
        }
        if (var5) {
            this.field1652 = new short[this.field1642];
        }
        if (var6) {
            this.field1640 = new byte[this.field1642];
        }
        if (this.field1686 > 0) {
            this.field1655 = new int[this.field1686];
            this.field1656 = new int[this.field1686];
            this.field1654 = new int[this.field1686];
        }
        this.field1638 = 0;
        this.field1642 = 0;
        this.field1686 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class128 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1642; var11++) {
                    this.field1643[this.field1642] = var10.field1643[var11] + this.field1638;
                    this.field1644[this.field1642] = var10.field1644[var11] + this.field1638;
                    this.field1645[this.field1642] = var10.field1645[var11] + this.field1638;
                    this.field1660[this.field1642] = var10.field1660[var11];
                    this.field1647[this.field1642] = var10.field1647[var11];
                    this.field1648[this.field1642] = var10.field1648[var11];
                    if (var3) {
                        if (var10.field1649 == null) {
                            this.field1649[this.field1642] = var10.field1635;
                        } else {
                            this.field1649[this.field1642] = var10.field1649[var11];
                        }
                    }
                    if (var4 && var10.field1650 != null) {
                        this.field1650[this.field1642] = var10.field1650[var11];
                    }
                    if (var5) {
                        if (var10.field1652 == null) {
                            this.field1652[this.field1642] = -1;
                        } else {
                            this.field1652[this.field1642] = var10.field1652[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1640 == null || var10.field1640[var11] == -1) {
                            this.field1640[this.field1642] = -1;
                        } else {
                            this.field1640[this.field1642] = (byte) (var10.field1640[var11] + this.field1686);
                        }
                    }
                    this.field1642++;
                }
                for (int var12 = 0; var12 < var10.field1686; var12++) {
                    this.field1655[this.field1686] = var10.field1655[var12] + this.field1638;
                    this.field1656[this.field1686] = var10.field1656[var12] + this.field1638;
                    this.field1654[this.field1686] = var10.field1654[var12] + this.field1638;
                    this.field1686++;
                }
                for (int var13 = 0; var13 < var10.field1638; var13++) {
                    this.field1639[this.field1638] = var10.field1639[var13];
                    this.field1676[this.field1638] = var10.field1676[var13];
                    this.field1641[this.field1638] = var10.field1641[var13];
                    this.field1638++;
                }
            }
        }
    }

    @ObfuscatedName("dh.z([[IIIIZI)Ldh;")
    public class128 method2587(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2592();
        int var7 = arg1 - this.field1663;
        int var8 = this.field1663 + arg1;
        int var9 = arg3 - this.field1663;
        int var10 = this.field1663 + arg3;
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
            var15.field1638 = this.field1638;
            var15.field1642 = this.field1642;
            var15.field1686 = this.field1686;
            var15.field1639 = this.field1639;
            var15.field1641 = this.field1641;
            var15.field1643 = this.field1643;
            var15.field1644 = this.field1644;
            var15.field1645 = this.field1645;
            var15.field1660 = this.field1660;
            var15.field1647 = this.field1647;
            var15.field1648 = this.field1648;
            var15.field1649 = this.field1649;
            var15.field1650 = this.field1650;
            var15.field1640 = this.field1640;
            var15.field1652 = this.field1652;
            var15.field1635 = this.field1635;
            var15.field1655 = this.field1655;
            var15.field1656 = this.field1656;
            var15.field1654 = this.field1654;
            var15.field1658 = this.field1658;
            var15.field1664 = this.field1664;
            var15.field1697 = this.field1697;
            var15.field1676 = new int[var15.field1638];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1638; var16++) {
                int var17 = this.field1639[var16] + arg1;
                int var18 = this.field1641[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1676[var16] = this.field1676[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1638; var26++) {
                int var27 = (-this.field1676[var26] << 16) / this.field1843;
                if (var27 < arg5) {
                    int var28 = this.field1639[var26] + arg1;
                    int var29 = this.field1641[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1676[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1676[var26];
                }
            }
        }
        var15.method2630();
        return var15;
    }

    @ObfuscatedName("dh.n(Z)Ldh;")
    public class128 method2588(boolean arg0) {
        if (!arg0 && field1692.length < this.field1642) {
            field1692 = new byte[this.field1642 + 100];
        }
        return this.method2590(arg0, field1679, field1692);
    }

    @ObfuscatedName("dh.v(Z)Ldh;")
    public class128 method2595(boolean arg0) {
        if (!arg0 && field1637.length < this.field1642) {
            field1637 = new byte[this.field1642 + 100];
        }
        return this.method2590(arg0, field1636, field1637);
    }

    @ObfuscatedName("dh.u(ZLdh;[B)Ldh;")
    public class128 method2590(boolean arg0, class128 arg1, byte[] arg2) {
        arg1.field1638 = this.field1638;
        arg1.field1642 = this.field1642;
        arg1.field1686 = this.field1686;
        if (arg1.field1639 == null || arg1.field1639.length < this.field1638) {
            arg1.field1639 = new int[this.field1638 + 100];
            arg1.field1676 = new int[this.field1638 + 100];
            arg1.field1641 = new int[this.field1638 + 100];
        }
        for (int var4 = 0; var4 < this.field1638; var4++) {
            arg1.field1639[var4] = this.field1639[var4];
            arg1.field1676[var4] = this.field1676[var4];
            arg1.field1641[var4] = this.field1641[var4];
        }
        if (arg0) {
            arg1.field1650 = this.field1650;
        } else {
            arg1.field1650 = arg2;
            if (this.field1650 == null) {
                for (int var5 = 0; var5 < this.field1642; var5++) {
                    arg1.field1650[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1642; var6++) {
                    arg1.field1650[var6] = this.field1650[var6];
                }
            }
        }
        arg1.field1643 = this.field1643;
        arg1.field1644 = this.field1644;
        arg1.field1645 = this.field1645;
        arg1.field1660 = this.field1660;
        arg1.field1647 = this.field1647;
        arg1.field1648 = this.field1648;
        arg1.field1649 = this.field1649;
        arg1.field1640 = this.field1640;
        arg1.field1652 = this.field1652;
        arg1.field1635 = this.field1635;
        arg1.field1655 = this.field1655;
        arg1.field1656 = this.field1656;
        arg1.field1654 = this.field1654;
        arg1.field1658 = this.field1658;
        arg1.field1664 = this.field1664;
        arg1.field1697 = this.field1697;
        arg1.method2630();
        return arg1;
    }

    @ObfuscatedName("dh.r(I)V")
    public void method2589(int arg0) {
        if (this.field1669 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1699[arg0];
        int var9 = field1694[arg0];
        for (int var10 = 0; var10 < this.field1638; var10++) {
            int var11 = class131.method2717(this.field1639[var10], this.field1641[var10], var8, var9);
            int var12 = this.field1676[var10];
            int var13 = class131.method2718(this.field1639[var10], this.field1641[var10], var8, var9);
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
        this.field1666 = (var2 + var5) / 2;
        this.field1665 = (var3 + var6) / 2;
        this.field1668 = (var4 + var7) / 2;
        this.field1669 = (var5 - var2 + 1) / 2;
        this.field1687 = (var6 - var3 + 1) / 2;
        this.field1671 = (var7 - var4 + 1) / 2;
        if (this.field1669 < 32) {
            this.field1669 = 32;
        }
        if (this.field1671 < 32) {
            this.field1671 = 32;
        }
        if (this.field1697) {
            this.field1669 += 8;
            this.field1671 += 8;
        }
    }

    @ObfuscatedName("dh.p()V")
    public void method2592() {
        if (this.field1667 == 1) {
            return;
        }
        this.field1667 = 1;
        this.field1843 = 0;
        this.field1662 = 0;
        this.field1663 = 0;
        for (int var1 = 0; var1 < this.field1638; var1++) {
            int var2 = this.field1639[var1];
            int var3 = this.field1676[var1];
            int var4 = this.field1641[var1];
            if (-var3 > this.field1843) {
                this.field1843 = -var3;
            }
            if (var3 > this.field1662) {
                this.field1662 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1663) {
                this.field1663 = var5;
            }
        }
        this.field1663 = (int) (Math.sqrt((double) this.field1663) + 0.99D);
        this.field1685 = (int) (Math.sqrt((double) (this.field1843 * this.field1843 + this.field1663 * this.field1663)) + 0.99D);
        this.field1661 = this.field1685 + (int) (Math.sqrt((double) (this.field1663 * this.field1663 + this.field1662 * this.field1662)) + 0.99D);
    }

    @ObfuscatedName("dh.q()V")
    public void method2593() {
        if (this.field1667 == 2) {
            return;
        }
        this.field1667 = 2;
        this.field1663 = 0;
        for (int var1 = 0; var1 < this.field1638; var1++) {
            int var2 = this.field1639[var1];
            int var3 = this.field1676[var1];
            int var4 = this.field1641[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1663) {
                this.field1663 = var5;
            }
        }
        this.field1663 = (int) (Math.sqrt((double) this.field1663) + 0.99D);
        this.field1685 = this.field1663;
        this.field1661 = this.field1663 + this.field1663;
    }

    @ObfuscatedName("dh.m()I")
    public int method2594() {
        this.method2592();
        return this.field1663;
    }

    @ObfuscatedName("dh.i()V")
    public void method2630() {
        this.field1667 = 0;
        this.field1669 = -1;
    }

    @ObfuscatedName("dh.c(Lep;I)V")
    public void method2596(class139 arg0, int arg1) {
        if (this.field1658 == null || arg1 == -1) {
            return;
        }
        class126 var3 = arg0.field1869[arg1];
        class133 var4 = var3.field1602;
        Statics.field1651 = 0;
        Statics.field1693 = 0;
        Statics.field1634 = 0;
        for (int var5 = 0; var5 < var3.field1603; var5++) {
            int var6 = var3.field1600[var5];
            this.method2598(var4.field1764[var6], var4.field1767[var6], var3.field1605[var5], var3.field1606[var5], var3.field1607[var5]);
        }
        this.method2630();
    }

    @ObfuscatedName("dh.b(Lep;ILep;I[I)V")
    public void method2652(class139 arg0, int arg1, class139 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2596(arg0, arg1);
            return;
        }
        class126 var6 = arg0.field1869[arg1];
        class126 var7 = arg2.field1869[arg3];
        class133 var8 = var6.field1602;
        Statics.field1651 = 0;
        Statics.field1693 = 0;
        Statics.field1634 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1603; var11++) {
            int var12 = var6.field1600[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1764[var12] == 0) {
                this.method2598(var8.field1764[var12], var8.field1767[var12], var6.field1605[var11], var6.field1606[var11], var6.field1607[var11]);
            }
        }
        Statics.field1651 = 0;
        Statics.field1693 = 0;
        Statics.field1634 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1603; var15++) {
            int var16 = var7.field1600[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1764[var16] == 0) {
                this.method2598(var8.field1764[var16], var8.field1767[var16], var7.field1605[var15], var7.field1606[var15], var7.field1607[var15]);
            }
        }
        this.method2630();
    }

    @ObfuscatedName("dh.o(I[IIII)V")
    public void method2598(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1651 = 0;
            Statics.field1693 = 0;
            Statics.field1634 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1658.length) {
                    int[] var10 = this.field1658[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1651 += this.field1639[var12];
                        Statics.field1693 += this.field1676[var12];
                        Statics.field1634 += this.field1641[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1651 = Statics.field1651 / var7 + arg2;
                Statics.field1693 = Statics.field1693 / var7 + arg3;
                Statics.field1634 = Statics.field1634 / var7 + arg4;
            } else {
                Statics.field1651 = arg2;
                Statics.field1693 = arg3;
                Statics.field1634 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1658.length) {
                    int[] var15 = this.field1658[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1639[var17] += arg2;
                        this.field1676[var17] += arg3;
                        this.field1641[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1658.length) {
                    int[] var20 = this.field1658[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1639[var22] -= Statics.field1651;
                        this.field1676[var22] -= Statics.field1693;
                        this.field1641[var22] -= Statics.field1634;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1694[var25];
                            int var27 = field1699[var25];
                            int var28 = this.field1676[var22] * var26 + this.field1639[var22] * var27 >> 16;
                            this.field1676[var22] = this.field1676[var22] * var27 - this.field1639[var22] * var26 >> 16;
                            this.field1639[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1694[var23];
                            int var30 = field1699[var23];
                            int var31 = this.field1676[var22] * var30 - this.field1641[var22] * var29 >> 16;
                            this.field1641[var22] = this.field1676[var22] * var29 + this.field1641[var22] * var30 >> 16;
                            this.field1676[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1694[var24];
                            int var33 = field1699[var24];
                            int var34 = this.field1641[var22] * var32 + this.field1639[var22] * var33 >> 16;
                            this.field1641[var22] = this.field1641[var22] * var33 - this.field1639[var22] * var32 >> 16;
                            this.field1639[var22] = var34;
                        }
                        this.field1639[var22] += Statics.field1651;
                        this.field1676[var22] += Statics.field1693;
                        this.field1641[var22] += Statics.field1634;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1658.length) {
                    int[] var37 = this.field1658[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1639[var39] -= Statics.field1651;
                        this.field1676[var39] -= Statics.field1693;
                        this.field1641[var39] -= Statics.field1634;
                        this.field1639[var39] = this.field1639[var39] * arg2 / 128;
                        this.field1676[var39] = this.field1676[var39] * arg3 / 128;
                        this.field1641[var39] = this.field1641[var39] * arg4 / 128;
                        this.field1639[var39] += Statics.field1651;
                        this.field1676[var39] += Statics.field1693;
                        this.field1641[var39] += Statics.field1634;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1664 != null && this.field1650 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1664.length) {
                    int[] var42 = this.field1664[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1650[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1650[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dh.a()V")
    public void method2599() {
        for (int var1 = 0; var1 < this.field1638; var1++) {
            int var2 = this.field1639[var1];
            this.field1639[var1] = this.field1641[var1];
            this.field1641[var1] = -var2;
        }
        this.method2630();
    }

    @ObfuscatedName("dh.e()V")
    public void method2600() {
        for (int var1 = 0; var1 < this.field1638; var1++) {
            this.field1639[var1] = -this.field1639[var1];
            this.field1641[var1] = -this.field1641[var1];
        }
        this.method2630();
    }

    @ObfuscatedName("dh.x()V")
    public void method2601() {
        for (int var1 = 0; var1 < this.field1638; var1++) {
            int var2 = this.field1641[var1];
            this.field1641[var1] = this.field1639[var1];
            this.field1639[var1] = -var2;
        }
        this.method2630();
    }

    @ObfuscatedName("dh.h(I)V")
    public void method2602(int arg0) {
        int var2 = field1694[arg0];
        int var3 = field1699[arg0];
        for (int var4 = 0; var4 < this.field1638; var4++) {
            int var5 = this.field1676[var4] * var3 - this.field1641[var4] * var2 >> 16;
            this.field1641[var4] = this.field1676[var4] * var2 + this.field1641[var4] * var3 >> 16;
            this.field1676[var4] = var5;
        }
        this.method2630();
    }

    @ObfuscatedName("dh.s(III)V")
    public void method2656(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1638; var4++) {
            this.field1639[var4] += arg0;
            this.field1676[var4] += arg1;
            this.field1641[var4] += arg2;
        }
        this.method2630();
    }

    @ObfuscatedName("dh.f(III)V")
    public void method2635(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1638; var4++) {
            this.field1639[var4] = this.field1639[var4] * arg0 / 128;
            this.field1676[var4] = this.field1676[var4] * arg1 / 128;
            this.field1641[var4] = this.field1641[var4] * arg2 / 128;
        }
        this.method2630();
    }

    @ObfuscatedName("dh.j(IIIIIII)V")
    public final void method2605(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1682[0] = -1;
        if (this.field1667 != 2 && this.field1667 != 1) {
            this.method2593();
        }
        int var8 = Statics.field1742;
        int var9 = Statics.field1746;
        int var10 = field1694[arg0];
        int var11 = field1699[arg0];
        int var12 = field1694[arg1];
        int var13 = field1699[arg1];
        int var14 = field1694[arg2];
        int var15 = field1699[arg2];
        int var16 = field1694[arg3];
        int var17 = field1699[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1638; var19++) {
            int var20 = this.field1639[var19];
            int var21 = this.field1676[var19];
            int var22 = this.field1641[var19];
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
            field1657[var19] = var30 - var18;
            field1675[var19] = class131.field1741 * var26 / var30 + var8;
            field1690[var19] = class131.field1741 * var29 / var30 + var9;
            if (this.field1686 > 0) {
                field1678[var19] = var26;
                field1653[var19] = var29;
                field1680[var19] = var30;
            }
        }
        try {
            this.method2608(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dh.d(IIIIIIII)V")
    public final void method2606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1682[0] = -1;
        if (this.field1667 != 2 && this.field1667 != 1) {
            this.method2593();
        }
        int var9 = Statics.field1742;
        int var10 = Statics.field1746;
        int var11 = field1694[arg0];
        int var12 = field1699[arg0];
        int var13 = field1694[arg1];
        int var14 = field1699[arg1];
        int var15 = field1694[arg2];
        int var16 = field1699[arg2];
        int var17 = field1694[arg3];
        int var18 = field1699[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1638; var20++) {
            int var21 = this.field1639[var20];
            int var22 = this.field1676[var20];
            int var23 = this.field1641[var20];
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
            field1657[var20] = var31 - var19;
            field1675[var20] = class131.field1741 * var27 / arg7 + var9;
            field1690[var20] = class131.field1741 * var30 / arg7 + var10;
            if (this.field1686 > 0) {
                field1678[var20] = var27;
                field1653[var20] = var30;
                field1680[var20] = var31;
            }
        }
        try {
            this.method2608(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dh.cb(IIIIIIIIJ)V")
    public void method2607(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1682[0] = -1;
        if (this.field1667 != 1) {
            this.method2592();
        }
        this.method2589(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field1663 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field1663) * class131.field1741;
        if (var16 / var14 >= Statics.field1739) {
            return;
        }
        int var17 = (this.field1663 + var15) * class131.field1741;
        if (var17 / var14 <= Statics.field1743) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field1663 * arg1 >> 16;
        int var20 = (var18 + var19) * class131.field1741;
        if (var20 / var14 <= Statics.field1749) {
            return;
        }
        int var21 = (this.field1843 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class131.field1741;
        if (var22 / var14 >= Statics.field1733) {
            return;
        }
        int var23 = (this.field1843 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field1686 > 0;
        int var27 = class129.method3146();
        int var28 = class129.field1706;
        boolean var30 = class129.field1721;
        boolean var32 = Statics.method3308(arg8);
        boolean var33 = false;
        if (var32 && var30) {
            boolean var34 = false;
            if (field1695) {
                var34 = class129.method1007(this, arg5, arg6, arg7);
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
                int var40 = var27 - Statics.field1742;
                int var41 = var28 - Statics.field1746;
                if (var40 > var36 && var40 < var37 && var41 > var38 && var41 < var39) {
                    var34 = true;
                }
            }
            if (var34) {
                if (this.field1697) {
                    class129.field1714[++class129.field1713 - 1] = arg8;
                } else {
                    var33 = true;
                }
            }
        }
        int var44 = Statics.field1742;
        int var45 = Statics.field1746;
        int var46 = 0;
        int var47 = 0;
        if (arg0 != 0) {
            var46 = field1694[arg0];
            var47 = field1699[arg0];
        }
        for (int var48 = 0; var48 < this.field1638; var48++) {
            int var49 = this.field1639[var48];
            int var50 = this.field1676[var48];
            int var51 = this.field1641[var48];
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
            field1657[var48] = var60 - var12;
            if (var60 >= 50) {
                field1675[var48] = class131.field1741 * var56 / var60 + var44;
                field1690[var48] = class131.field1741 * var59 / var60 + var45;
            } else {
                field1675[var48] = -5000;
                var24 = true;
            }
            if (var26) {
                field1678[var48] = var56;
                field1653[var48] = var59;
                field1680[var48] = var60;
            }
        }
        try {
            this.method2608(var24, var33, this.field1697, arg8);
        } catch (Exception var63) {
        }
    }

    @ObfuscatedName("dh.l(ZZZJ)V")
    public final void method2608(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field1661 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field1661; var6++) {
            field1682[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field1642; var8++) {
            if (this.field1648[var8] != -2) {
                int var9 = this.field1643[var8];
                int var10 = this.field1644[var8];
                int var11 = this.field1645[var8];
                int var12 = field1675[var9];
                int var13 = field1675[var10];
                int var14 = field1675[var11];
                if (arg0 && var12 == -5000 || var13 == -5000 || var14 == -5000) {
                    int var15 = field1678[var9];
                    int var16 = field1678[var10];
                    int var17 = field1678[var11];
                    int var18 = field1653[var9];
                    int var19 = field1653[var10];
                    int var20 = field1653[var11];
                    int var21 = field1680[var9];
                    int var22 = field1680[var10];
                    int var23 = field1680[var11];
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
                        field1674[var8] = true;
                        int var33 = (field1657[var9] + field1657[var10] + field1657[var11]) / 3 + this.field1685;
                        field1683[var33][field1682[var33]++] = var8;
                    }
                } else {
                    if (arg1) {
                        int var34 = field1690[var9];
                        int var35 = field1690[var10];
                        int var36 = field1690[var11];
                        int var37 = class129.field1706 + var7;
                        boolean var38;
                        if (var37 < var34 && var37 < var35 && var37 < var36) {
                            var38 = false;
                        } else {
                            int var39 = class129.field1706 - var7;
                            if (var39 > var34 && var39 > var35 && var39 > var36) {
                                var38 = false;
                            } else {
                                int var40 = class129.field1705 + var7;
                                if (var40 < var12 && var40 < var13 && var40 < var14) {
                                    var38 = false;
                                } else {
                                    int var41 = class129.field1705 - var7;
                                    if (var41 > var12 && var41 > var13 && var41 > var14) {
                                        var38 = false;
                                    } else {
                                        var38 = true;
                                    }
                                }
                            }
                        }
                        if (var38) {
                            class129.field1714[++class129.field1713 - 1] = arg3;
                            arg1 = false;
                        }
                    }
                    if ((field1690[var11] - field1690[var10]) * (var12 - var13) - (field1690[var9] - field1690[var10]) * (var14 - var13) > 0) {
                        field1674[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field1744 && var13 <= Statics.field1744 && var14 <= Statics.field1744) {
                            field1673[var8] = false;
                        } else {
                            field1673[var8] = true;
                        }
                        int var44 = (field1657[var9] + field1657[var10] + field1657[var11]) / 3 + this.field1685;
                        field1683[var44][field1682[var44]++] = var8;
                    }
                }
            }
        }
        if (this.field1649 == null) {
            for (int var45 = this.field1661 - 1; var45 >= 0; var45--) {
                int var46 = field1682[var45];
                if (var46 > 0) {
                    int[] var47 = field1683[var45];
                    for (int var48 = 0; var48 < var46; var48++) {
                        this.method2609(var47[var48]);
                    }
                }
            }
            return;
        }
        for (int var49 = 0; var49 < 12; var49++) {
            field1684[var49] = 0;
            field1688[var49] = 0;
        }
        for (int var50 = this.field1661 - 1; var50 >= 0; var50--) {
            int var51 = field1682[var50];
            if (var51 > 0) {
                int[] var52 = field1683[var50];
                for (int var53 = 0; var53 < var51; var53++) {
                    int var54 = var52[var53];
                    byte var55 = this.field1649[var54];
                    int var56 = field1684[var55]++;
                    field1646[var55][var56] = var54;
                    if (var55 < 10) {
                        field1688[var55] += var50;
                    } else if (var55 == 10) {
                        field1698[var56] = var50;
                    } else {
                        field1659[var56] = var50;
                    }
                }
            }
        }
        int var57 = 0;
        if (field1684[1] > 0 || field1684[2] > 0) {
            var57 = (field1688[1] + field1688[2]) / (field1684[1] + field1684[2]);
        }
        int var58 = 0;
        if (field1684[3] > 0 || field1684[4] > 0) {
            var58 = (field1688[3] + field1688[4]) / (field1684[3] + field1684[4]);
        }
        int var59 = 0;
        if (field1684[6] > 0 || field1684[8] > 0) {
            var59 = (field1688[6] + field1688[8]) / (field1684[6] + field1684[8]);
        }
        int var60 = 0;
        int var61 = field1684[10];
        int[] var62 = field1646[10];
        int[] var63 = field1698;
        if (var60 == var61) {
            var60 = 0;
            var61 = field1684[11];
            var62 = field1646[11];
            var63 = field1659;
        }
        int var64;
        if (var60 < var61) {
            var64 = var63[var60];
        } else {
            var64 = -1000;
        }
        for (int var65 = 0; var65 < 10; var65++) {
            while (var65 == 0 && var64 > var57) {
                this.method2609(var62[var60++]);
                if (var60 == var61 && field1646[11] != var62) {
                    var60 = 0;
                    var61 = field1684[11];
                    var62 = field1646[11];
                    var63 = field1659;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            while (var65 == 3 && var64 > var58) {
                this.method2609(var62[var60++]);
                if (var60 == var61 && field1646[11] != var62) {
                    var60 = 0;
                    var61 = field1684[11];
                    var62 = field1646[11];
                    var63 = field1659;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            while (var65 == 5 && var64 > var59) {
                this.method2609(var62[var60++]);
                if (var60 == var61 && field1646[11] != var62) {
                    var60 = 0;
                    var61 = field1684[11];
                    var62 = field1646[11];
                    var63 = field1659;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            int var66 = field1684[var65];
            int[] var67 = field1646[var65];
            for (int var68 = 0; var68 < var66; var68++) {
                this.method2609(var67[var68]);
            }
        }
        while (var64 != -1000) {
            this.method2609(var62[var60++]);
            if (var60 == var61 && field1646[11] != var62) {
                var60 = 0;
                var62 = field1646[11];
                var61 = field1684[11];
                var63 = field1659;
            }
            if (var60 < var61) {
                var64 = var63[var60];
            } else {
                var64 = -1000;
            }
        }
    }

    @ObfuscatedName("dh.k(I)V")
    public final void method2609(int arg0) {
        if (field1674[arg0]) {
            this.method2610(arg0);
            return;
        }
        int var2 = this.field1643[arg0];
        int var3 = this.field1644[arg0];
        int var4 = this.field1645[arg0];
        class131.field1734 = field1673[arg0];
        if (this.field1650 == null) {
            class131.field1748 = 0;
        } else {
            class131.field1748 = this.field1650[arg0] & 0xFF;
        }
        if (this.field1652 != null && this.field1652[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1640 == null || this.field1640[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1640[arg0] & 0xFF;
                var6 = this.field1655[var5];
                var7 = this.field1656[var5];
                var8 = this.field1654[var5];
            }
            if (this.field1648[arg0] == -1) {
                class131.method2712(field1690[var2], field1690[var3], field1690[var4], field1675[var2], field1675[var3], field1675[var4], this.field1660[arg0], this.field1660[arg0], this.field1660[arg0], field1678[var6], field1678[var7], field1678[var8], field1653[var6], field1653[var7], field1653[var8], field1680[var6], field1680[var7], field1680[var8], this.field1652[arg0]);
            } else {
                class131.method2712(field1690[var2], field1690[var3], field1690[var4], field1675[var2], field1675[var3], field1675[var4], this.field1660[arg0], this.field1647[arg0], this.field1648[arg0], field1678[var6], field1678[var7], field1678[var8], field1653[var6], field1653[var7], field1653[var8], field1680[var6], field1680[var7], field1680[var8], this.field1652[arg0]);
            }
        } else if (this.field1648[arg0] == -1) {
            class131.method2710(field1690[var2], field1690[var3], field1690[var4], field1675[var2], field1675[var3], field1675[var4], field1700[this.field1660[arg0]]);
        } else {
            class131.method2708(field1690[var2], field1690[var3], field1690[var4], field1675[var2], field1675[var3], field1675[var4], this.field1660[arg0], this.field1647[arg0], this.field1648[arg0]);
        }
    }

    @ObfuscatedName("dh.ac(I)V")
    public final void method2610(int arg0) {
        int var2 = Statics.field1742;
        int var3 = Statics.field1746;
        int var4 = 0;
        int var5 = this.field1643[arg0];
        int var6 = this.field1644[arg0];
        int var7 = this.field1645[arg0];
        int var8 = field1680[var5];
        int var9 = field1680[var6];
        int var10 = field1680[var7];
        if (this.field1650 == null) {
            class131.field1748 = 0;
        } else {
            class131.field1748 = this.field1650[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1689[var4] = field1675[var5];
            field1677[var4] = field1690[var5];
            field1691[var4++] = this.field1660[arg0];
        } else {
            int var11 = field1678[var5];
            int var12 = field1653[var5];
            int var13 = this.field1660[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1701[var10 - var8];
                field1689[var4] = (((field1678[var7] - var11) * var14 >> 16) + var11) * class131.field1741 / 50 + var2;
                field1677[var4] = (((field1653[var7] - var12) * var14 >> 16) + var12) * class131.field1741 / 50 + var3;
                field1691[var4++] = ((this.field1648[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1701[var9 - var8];
                field1689[var4] = (((field1678[var6] - var11) * var15 >> 16) + var11) * class131.field1741 / 50 + var2;
                field1677[var4] = (((field1653[var6] - var12) * var15 >> 16) + var12) * class131.field1741 / 50 + var3;
                field1691[var4++] = ((this.field1647[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1689[var4] = field1675[var6];
            field1677[var4] = field1690[var6];
            field1691[var4++] = this.field1647[arg0];
        } else {
            int var16 = field1678[var6];
            int var17 = field1653[var6];
            int var18 = this.field1647[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1701[var8 - var9];
                field1689[var4] = (((field1678[var5] - var16) * var19 >> 16) + var16) * class131.field1741 / 50 + var2;
                field1677[var4] = (((field1653[var5] - var17) * var19 >> 16) + var17) * class131.field1741 / 50 + var3;
                field1691[var4++] = ((this.field1660[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1701[var10 - var9];
                field1689[var4] = (((field1678[var7] - var16) * var20 >> 16) + var16) * class131.field1741 / 50 + var2;
                field1677[var4] = (((field1653[var7] - var17) * var20 >> 16) + var17) * class131.field1741 / 50 + var3;
                field1691[var4++] = ((this.field1648[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1689[var4] = field1675[var7];
            field1677[var4] = field1690[var7];
            field1691[var4++] = this.field1648[arg0];
        } else {
            int var21 = field1678[var7];
            int var22 = field1653[var7];
            int var23 = this.field1648[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1701[var9 - var10];
                field1689[var4] = (((field1678[var6] - var21) * var24 >> 16) + var21) * class131.field1741 / 50 + var2;
                field1677[var4] = (((field1653[var6] - var22) * var24 >> 16) + var22) * class131.field1741 / 50 + var3;
                field1691[var4++] = ((this.field1647[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1701[var8 - var10];
                field1689[var4] = (((field1678[var5] - var21) * var25 >> 16) + var21) * class131.field1741 / 50 + var2;
                field1677[var4] = (((field1653[var5] - var22) * var25 >> 16) + var22) * class131.field1741 / 50 + var3;
                field1691[var4++] = ((this.field1660[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1689[0];
        int var27 = field1689[1];
        int var28 = field1689[2];
        int var29 = field1677[0];
        int var30 = field1677[1];
        int var31 = field1677[2];
        class131.field1734 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1744 || var27 > Statics.field1744 || var28 > Statics.field1744) {
                class131.field1734 = true;
            }
            if (this.field1652 != null && this.field1652[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1640 == null || this.field1640[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1640[arg0] & 0xFF;
                    var33 = this.field1655[var32];
                    var34 = this.field1656[var32];
                    var35 = this.field1654[var32];
                }
                if (this.field1648[arg0] == -1) {
                    class131.method2712(var29, var30, var31, var26, var27, var28, this.field1660[arg0], this.field1660[arg0], this.field1660[arg0], field1678[var33], field1678[var34], field1678[var35], field1653[var33], field1653[var34], field1653[var35], field1680[var33], field1680[var34], field1680[var35], this.field1652[arg0]);
                } else {
                    class131.method2712(var29, var30, var31, var26, var27, var28, field1691[0], field1691[1], field1691[2], field1678[var33], field1678[var34], field1678[var35], field1653[var33], field1653[var34], field1653[var35], field1680[var33], field1680[var34], field1680[var35], this.field1652[arg0]);
                }
            } else if (this.field1648[arg0] == -1) {
                class131.method2710(var29, var30, var31, var26, var27, var28, field1700[this.field1660[arg0]]);
            } else {
                class131.method2708(var29, var30, var31, var26, var27, var28, field1691[0], field1691[1], field1691[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1744 || var27 > Statics.field1744 || var28 > Statics.field1744 || field1689[3] < 0 || field1689[3] > Statics.field1744) {
            class131.field1734 = true;
        }
        if (this.field1652 != null && this.field1652[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1640 == null || this.field1640[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1640[arg0] & 0xFF;
                var37 = this.field1655[var36];
                var38 = this.field1656[var36];
                var39 = this.field1654[var36];
            }
            short var40 = this.field1652[arg0];
            if (this.field1648[arg0] == -1) {
                class131.method2712(var29, var30, var31, var26, var27, var28, this.field1660[arg0], this.field1660[arg0], this.field1660[arg0], field1678[var37], field1678[var38], field1678[var39], field1653[var37], field1653[var38], field1653[var39], field1680[var37], field1680[var38], field1680[var39], var40);
                class131.method2712(var29, var31, field1677[3], var26, var28, field1689[3], this.field1660[arg0], this.field1660[arg0], this.field1660[arg0], field1678[var37], field1678[var38], field1678[var39], field1653[var37], field1653[var38], field1653[var39], field1680[var37], field1680[var38], field1680[var39], var40);
            } else {
                class131.method2712(var29, var30, var31, var26, var27, var28, field1691[0], field1691[1], field1691[2], field1678[var37], field1678[var38], field1678[var39], field1653[var37], field1653[var38], field1653[var39], field1680[var37], field1680[var38], field1680[var39], var40);
                class131.method2712(var29, var31, field1677[3], var26, var28, field1689[3], field1691[0], field1691[2], field1691[3], field1678[var37], field1678[var38], field1678[var39], field1653[var37], field1653[var38], field1653[var39], field1680[var37], field1680[var38], field1680[var39], var40);
            }
        } else if (this.field1648[arg0] == -1) {
            int var41 = field1700[this.field1660[arg0]];
            class131.method2710(var29, var30, var31, var26, var27, var28, var41);
            class131.method2710(var29, var31, field1677[3], var26, var28, field1689[3], var41);
        } else {
            class131.method2708(var29, var30, var31, var26, var27, var28, field1691[0], field1691[1], field1691[2]);
            class131.method2708(var29, var31, field1677[3], var26, var28, field1689[3], field1691[0], field1691[2], field1691[3]);
        }
    }
}
