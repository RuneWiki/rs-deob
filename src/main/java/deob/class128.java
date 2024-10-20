package deob;

@ObfuscatedName("dv")
public class class128 extends class136 {

    @ObfuscatedName("dv.a")
    public static class128 field1704 = new class128();

    @ObfuscatedName("dv.t")
    public static byte[] field1696 = new byte[1];

    @ObfuscatedName("dv.n")
    public static class128 field1702 = new class128();

    @ObfuscatedName("dv.q")
    public static byte[] field1681 = new byte[1];

    @ObfuscatedName("dv.v")
    public int field1648 = 0;

    @ObfuscatedName("dv.l")
    public int[] field1656;

    @ObfuscatedName("dv.c")
    public int[] field1650;

    @ObfuscatedName("dv.o")
    public int[] field1651;

    @ObfuscatedName("dv.i")
    public int field1652 = 0;

    @ObfuscatedName("dv.d")
    public int[] field1647;

    @ObfuscatedName("dv.m")
    public int[] field1654;

    @ObfuscatedName("dv.p")
    public int[] field1657;

    @ObfuscatedName("dv.h")
    public int[] field1661;

    @ObfuscatedName("dv.k")
    public int[] field1688;

    @ObfuscatedName("dv.x")
    public int[] field1709;

    @ObfuscatedName("dv.j")
    public byte[] field1659;

    @ObfuscatedName("dv.r")
    public byte[] field1660;

    @ObfuscatedName("dv.e")
    public byte[] field1645;

    @ObfuscatedName("dv.s")
    public short[] field1662;

    @ObfuscatedName("dv.b")
    public byte field1663 = 0;

    @ObfuscatedName("dv.z")
    public int field1664 = 0;

    @ObfuscatedName("dv.f")
    public int[] field1665;

    @ObfuscatedName("dv.g")
    public int[] field1666;

    @ObfuscatedName("dv.w")
    public int[] field1667;

    @ObfuscatedName("dv.u")
    public int[][] field1644;

    @ObfuscatedName("dv.y")
    public int[][] field1669;

    @ObfuscatedName("dv.aa")
    public boolean field1670 = false;

    @ObfuscatedName("dv.aw")
    public int field1671;

    @ObfuscatedName("dv.ar")
    public int field1672;

    @ObfuscatedName("dv.aq")
    public int field1686;

    @ObfuscatedName("dv.ad")
    public int field1674;

    @ObfuscatedName("dv.ag")
    public int field1649;

    @ObfuscatedName("dv.ak")
    public int field1676;

    @ObfuscatedName("dv.av")
    public int field1677;

    @ObfuscatedName("dv.am")
    public int field1678;

    @ObfuscatedName("dv.ab")
    public int field1679 = -1;

    @ObfuscatedName("dv.ax")
    public int field1680 = -1;

    @ObfuscatedName("dv.al")
    public int field1653 = -1;

    @ObfuscatedName("dv.aj")
    public static boolean[] field1683 = new boolean[4700];

    @ObfuscatedName("dv.ae")
    public static boolean[] field1684 = new boolean[4700];

    @ObfuscatedName("dv.au")
    public static int[] field1685 = new int[4700];

    @ObfuscatedName("dv.ah")
    public static int[] field1655 = new int[4700];

    @ObfuscatedName("dv.an")
    public static int[] field1687 = new int[4700];

    @ObfuscatedName("dv.af")
    public static int[] field1675 = new int[4700];

    @ObfuscatedName("dv.ay")
    public static int[] field1703 = new int[4700];

    @ObfuscatedName("dv.az")
    public static int[] field1690 = new int[4700];

    @ObfuscatedName("dv.ai")
    public static int[] field1692 = new int[1600];

    @ObfuscatedName("dv.ac")
    public static int[][] field1693 = new int[1600][512];

    @ObfuscatedName("dv.at")
    public static int[] field1694 = new int[12];

    @ObfuscatedName("dv.as")
    public static int[][] field1646 = new int[12][2000];

    @ObfuscatedName("dv.ba")
    public static int[] field1668 = new int[2000];

    @ObfuscatedName("dv.bg")
    public static int[] field1697 = new int[2000];

    @ObfuscatedName("dv.bc")
    public static int[] field1698 = new int[12];

    @ObfuscatedName("dv.bd")
    public static int[] field1699 = new int[10];

    @ObfuscatedName("dv.bx")
    public static int[] field1700 = new int[10];

    @ObfuscatedName("dv.bl")
    public static int[] field1701 = new int[10];

    @ObfuscatedName("dv.bq")
    public static boolean field1705 = true;

    @ObfuscatedName("dv.bt")
    public static int[] field1708 = class131.field1762;

    @ObfuscatedName("dv.bs")
    public static int[] field1658 = class131.field1752;

    @ObfuscatedName("dv.bj")
    public static int[] field1710 = class131.field1758;

    @ObfuscatedName("dv.bm")
    public static int[] field1689 = class131.field1761;

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
                var6 |= var8.field1645 != null;
            }
        }
        this.field1656 = new int[this.field1648];
        this.field1650 = new int[this.field1648];
        this.field1651 = new int[this.field1648];
        this.field1647 = new int[this.field1652];
        this.field1654 = new int[this.field1652];
        this.field1657 = new int[this.field1652];
        this.field1661 = new int[this.field1652];
        this.field1688 = new int[this.field1652];
        this.field1709 = new int[this.field1652];
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
            this.field1645 = new byte[this.field1652];
        }
        if (this.field1664 > 0) {
            this.field1665 = new int[this.field1664];
            this.field1666 = new int[this.field1664];
            this.field1667 = new int[this.field1664];
        }
        this.field1648 = 0;
        this.field1652 = 0;
        this.field1664 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class128 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1652; var11++) {
                    this.field1647[this.field1652] = var10.field1647[var11] + this.field1648;
                    this.field1654[this.field1652] = var10.field1654[var11] + this.field1648;
                    this.field1657[this.field1652] = var10.field1657[var11] + this.field1648;
                    this.field1661[this.field1652] = var10.field1661[var11];
                    this.field1688[this.field1652] = var10.field1688[var11];
                    this.field1709[this.field1652] = var10.field1709[var11];
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
                        if (var10.field1645 == null || var10.field1645[var11] == -1) {
                            this.field1645[this.field1652] = -1;
                        } else {
                            this.field1645[this.field1652] = (byte) (var10.field1645[var11] + this.field1664);
                        }
                    }
                    this.field1652++;
                }
                for (int var12 = 0; var12 < var10.field1664; var12++) {
                    this.field1665[this.field1664] = var10.field1665[var12] + this.field1648;
                    this.field1666[this.field1664] = var10.field1666[var12] + this.field1648;
                    this.field1667[this.field1664] = var10.field1667[var12] + this.field1648;
                    this.field1664++;
                }
                for (int var13 = 0; var13 < var10.field1648; var13++) {
                    this.field1656[this.field1648] = var10.field1656[var13];
                    this.field1650[this.field1648] = var10.field1650[var13];
                    this.field1651[this.field1648] = var10.field1651[var13];
                    this.field1648++;
                }
            }
        }
    }

    @ObfuscatedName("dv.a([[IIIIZI)Ldv;")
    public class128 method2765(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2734();
        int var7 = arg1 - this.field1686;
        int var8 = this.field1686 + arg1;
        int var9 = arg3 - this.field1686;
        int var10 = this.field1686 + arg3;
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
            var15.field1656 = this.field1656;
            var15.field1651 = this.field1651;
            var15.field1647 = this.field1647;
            var15.field1654 = this.field1654;
            var15.field1657 = this.field1657;
            var15.field1661 = this.field1661;
            var15.field1688 = this.field1688;
            var15.field1709 = this.field1709;
            var15.field1659 = this.field1659;
            var15.field1660 = this.field1660;
            var15.field1645 = this.field1645;
            var15.field1662 = this.field1662;
            var15.field1663 = this.field1663;
            var15.field1665 = this.field1665;
            var15.field1666 = this.field1666;
            var15.field1667 = this.field1667;
            var15.field1644 = this.field1644;
            var15.field1669 = this.field1669;
            var15.field1670 = this.field1670;
            var15.field1650 = new int[var15.field1648];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1648; var16++) {
                int var17 = this.field1656[var16] + arg1;
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
                int var27 = (-this.field1650[var26] << 16) / this.field1849;
                if (var27 < arg5) {
                    int var28 = this.field1656[var26] + arg1;
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
        var15.method2728();
        return var15;
    }

    @ObfuscatedName("dv.t(Z)Ldv;")
    public class128 method2757(boolean arg0) {
        if (!arg0 && field1696.length < this.field1652) {
            field1696 = new byte[this.field1652 + 100];
        }
        return this.method2750(arg0, field1704, field1696);
    }

    @ObfuscatedName("dv.n(Z)Ldv;")
    public class128 method2732(boolean arg0) {
        if (!arg0 && field1681.length < this.field1652) {
            field1681 = new byte[this.field1652 + 100];
        }
        return this.method2750(arg0, field1702, field1681);
    }

    @ObfuscatedName("dv.q(ZLdv;[B)Ldv;")
    public class128 method2750(boolean arg0, class128 arg1, byte[] arg2) {
        arg1.field1648 = this.field1648;
        arg1.field1652 = this.field1652;
        arg1.field1664 = this.field1664;
        if (arg1.field1656 == null || arg1.field1656.length < this.field1648) {
            arg1.field1656 = new int[this.field1648 + 100];
            arg1.field1650 = new int[this.field1648 + 100];
            arg1.field1651 = new int[this.field1648 + 100];
        }
        for (int var4 = 0; var4 < this.field1648; var4++) {
            arg1.field1656[var4] = this.field1656[var4];
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
        arg1.field1647 = this.field1647;
        arg1.field1654 = this.field1654;
        arg1.field1657 = this.field1657;
        arg1.field1661 = this.field1661;
        arg1.field1688 = this.field1688;
        arg1.field1709 = this.field1709;
        arg1.field1659 = this.field1659;
        arg1.field1645 = this.field1645;
        arg1.field1662 = this.field1662;
        arg1.field1663 = this.field1663;
        arg1.field1665 = this.field1665;
        arg1.field1666 = this.field1666;
        arg1.field1667 = this.field1667;
        arg1.field1644 = this.field1644;
        arg1.field1669 = this.field1669;
        arg1.field1670 = this.field1670;
        arg1.method2728();
        return arg1;
    }

    @ObfuscatedName("dv.v(I)V")
    public void method2758(int arg0) {
        if (this.field1679 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1658[arg0];
        int var9 = field1708[arg0];
        for (int var10 = 0; var10 < this.field1648; var10++) {
            int var11 = class131.method2844(this.field1656[var10], this.field1651[var10], var8, var9);
            int var12 = this.field1650[var10];
            int var13 = class131.method2845(this.field1656[var10], this.field1651[var10], var8, var9);
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
        this.field1676 = (var2 + var5) / 2;
        this.field1677 = (var3 + var6) / 2;
        this.field1678 = (var4 + var7) / 2;
        this.field1679 = (var5 - var2 + 1) / 2;
        this.field1680 = (var6 - var3 + 1) / 2;
        this.field1653 = (var7 - var4 + 1) / 2;
        if (this.field1679 < 32) {
            this.field1679 = 32;
        }
        if (this.field1653 < 32) {
            this.field1653 = 32;
        }
        if (this.field1670) {
            this.field1679 += 8;
            this.field1653 += 8;
        }
    }

    @ObfuscatedName("dv.l()V")
    public void method2734() {
        if (this.field1671 == 1) {
            return;
        }
        this.field1671 = 1;
        this.field1849 = 0;
        this.field1672 = 0;
        this.field1686 = 0;
        for (int var1 = 0; var1 < this.field1648; var1++) {
            int var2 = this.field1656[var1];
            int var3 = this.field1650[var1];
            int var4 = this.field1651[var1];
            if (-var3 > this.field1849) {
                this.field1849 = -var3;
            }
            if (var3 > this.field1672) {
                this.field1672 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1686) {
                this.field1686 = var5;
            }
        }
        this.field1686 = (int) (Math.sqrt((double) this.field1686) + 0.99D);
        this.field1649 = (int) (Math.sqrt((double) (this.field1849 * this.field1849 + this.field1686 * this.field1686)) + 0.99D);
        this.field1674 = this.field1649 + (int) (Math.sqrt((double) (this.field1686 * this.field1686 + this.field1672 * this.field1672)) + 0.99D);
    }

    @ObfuscatedName("dv.c()V")
    public void method2735() {
        if (this.field1671 == 2) {
            return;
        }
        this.field1671 = 2;
        this.field1686 = 0;
        for (int var1 = 0; var1 < this.field1648; var1++) {
            int var2 = this.field1656[var1];
            int var3 = this.field1650[var1];
            int var4 = this.field1651[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1686) {
                this.field1686 = var5;
            }
        }
        this.field1686 = (int) (Math.sqrt((double) this.field1686) + 0.99D);
        this.field1649 = this.field1686;
        this.field1674 = this.field1686 + this.field1686;
    }

    @ObfuscatedName("dv.o()I")
    public int method2730() {
        this.method2734();
        return this.field1686;
    }

    @ObfuscatedName("dv.d()V")
    public void method2728() {
        this.field1671 = 0;
        this.field1679 = -1;
    }

    @ObfuscatedName("dv.m(Lem;I)V")
    public void method2738(class139 arg0, int arg1) {
        if (this.field1644 == null || arg1 == -1) {
            return;
        }
        class126 var3 = arg0.field1868[arg1];
        class133 var4 = var3.field1613;
        Statics.field1682 = 0;
        Statics.field1695 = 0;
        Statics.field1673 = 0;
        for (int var5 = 0; var5 < var3.field1614; var5++) {
            int var6 = var3.field1615[var5];
            this.method2798(var4.field1777[var6], var4.field1773[var6], var3.field1616[var5], var3.field1617[var5], var3.field1618[var5]);
        }
        this.method2728();
    }

    @ObfuscatedName("dv.p(Lem;ILem;I[I)V")
    public void method2796(class139 arg0, int arg1, class139 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2738(arg0, arg1);
            return;
        }
        class126 var6 = arg0.field1868[arg1];
        class126 var7 = arg2.field1868[arg3];
        class133 var8 = var6.field1613;
        Statics.field1682 = 0;
        Statics.field1695 = 0;
        Statics.field1673 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1614; var11++) {
            int var12 = var6.field1615[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1777[var12] == 0) {
                this.method2798(var8.field1777[var12], var8.field1773[var12], var6.field1616[var11], var6.field1617[var11], var6.field1618[var11]);
            }
        }
        Statics.field1682 = 0;
        Statics.field1695 = 0;
        Statics.field1673 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1614; var15++) {
            int var16 = var7.field1615[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1777[var16] == 0) {
                this.method2798(var8.field1777[var16], var8.field1773[var16], var7.field1616[var15], var7.field1617[var15], var7.field1618[var15]);
            }
        }
        this.method2728();
    }

    @ObfuscatedName("dv.h(I[IIII)V")
    public void method2798(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1682 = 0;
            Statics.field1695 = 0;
            Statics.field1673 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1644.length) {
                    int[] var10 = this.field1644[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1682 += this.field1656[var12];
                        Statics.field1695 += this.field1650[var12];
                        Statics.field1673 += this.field1651[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1682 = Statics.field1682 / var7 + arg2;
                Statics.field1695 = Statics.field1695 / var7 + arg3;
                Statics.field1673 = Statics.field1673 / var7 + arg4;
            } else {
                Statics.field1682 = arg2;
                Statics.field1695 = arg3;
                Statics.field1673 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1644.length) {
                    int[] var15 = this.field1644[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1656[var17] += arg2;
                        this.field1650[var17] += arg3;
                        this.field1651[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1644.length) {
                    int[] var20 = this.field1644[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1656[var22] -= Statics.field1682;
                        this.field1650[var22] -= Statics.field1695;
                        this.field1651[var22] -= Statics.field1673;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1708[var25];
                            int var27 = field1658[var25];
                            int var28 = this.field1656[var22] * var27 + this.field1650[var22] * var26 >> 16;
                            this.field1650[var22] = this.field1650[var22] * var27 - this.field1656[var22] * var26 >> 16;
                            this.field1656[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1708[var23];
                            int var30 = field1658[var23];
                            int var31 = this.field1650[var22] * var30 - this.field1651[var22] * var29 >> 16;
                            this.field1651[var22] = this.field1651[var22] * var30 + this.field1650[var22] * var29 >> 16;
                            this.field1650[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1708[var24];
                            int var33 = field1658[var24];
                            int var34 = this.field1656[var22] * var33 + this.field1651[var22] * var32 >> 16;
                            this.field1651[var22] = this.field1651[var22] * var33 - this.field1656[var22] * var32 >> 16;
                            this.field1656[var22] = var34;
                        }
                        this.field1656[var22] += Statics.field1682;
                        this.field1650[var22] += Statics.field1695;
                        this.field1651[var22] += Statics.field1673;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1644.length) {
                    int[] var37 = this.field1644[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1656[var39] -= Statics.field1682;
                        this.field1650[var39] -= Statics.field1695;
                        this.field1651[var39] -= Statics.field1673;
                        this.field1656[var39] = this.field1656[var39] * arg2 / 128;
                        this.field1650[var39] = this.field1650[var39] * arg3 / 128;
                        this.field1651[var39] = this.field1651[var39] * arg4 / 128;
                        this.field1656[var39] += Statics.field1682;
                        this.field1650[var39] += Statics.field1695;
                        this.field1651[var39] += Statics.field1673;
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

    @ObfuscatedName("dv.k()V")
    public void method2741() {
        for (int var1 = 0; var1 < this.field1648; var1++) {
            int var2 = this.field1656[var1];
            this.field1656[var1] = this.field1651[var1];
            this.field1651[var1] = -var2;
        }
        this.method2728();
    }

    @ObfuscatedName("dv.x()V")
    public void method2739() {
        for (int var1 = 0; var1 < this.field1648; var1++) {
            this.field1656[var1] = -this.field1656[var1];
            this.field1651[var1] = -this.field1651[var1];
        }
        this.method2728();
    }

    @ObfuscatedName("dv.j()V")
    public void method2743() {
        for (int var1 = 0; var1 < this.field1648; var1++) {
            int var2 = this.field1651[var1];
            this.field1651[var1] = this.field1656[var1];
            this.field1656[var1] = -var2;
        }
        this.method2728();
    }

    @ObfuscatedName("dv.r(I)V")
    public void method2744(int arg0) {
        int var2 = field1708[arg0];
        int var3 = field1658[arg0];
        for (int var4 = 0; var4 < this.field1648; var4++) {
            int var5 = this.field1650[var4] * var3 - this.field1651[var4] * var2 >> 16;
            this.field1651[var4] = this.field1651[var4] * var3 + this.field1650[var4] * var2 >> 16;
            this.field1650[var4] = var5;
        }
        this.method2728();
    }

    @ObfuscatedName("dv.e(III)V")
    public void method2740(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1648; var4++) {
            this.field1656[var4] += arg0;
            this.field1650[var4] += arg1;
            this.field1651[var4] += arg2;
        }
        this.method2728();
    }

    @ObfuscatedName("dv.s(III)V")
    public void method2746(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1648; var4++) {
            this.field1656[var4] = this.field1656[var4] * arg0 / 128;
            this.field1650[var4] = this.field1650[var4] * arg1 / 128;
            this.field1651[var4] = this.field1651[var4] * arg2 / 128;
        }
        this.method2728();
    }

    @ObfuscatedName("dv.b(IIIIIII)V")
    public final void method2747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1692[0] = -1;
        if (this.field1671 != 2 && this.field1671 != 1) {
            this.method2735();
        }
        int var8 = Statics.field1737;
        int var9 = Statics.field1750;
        int var10 = field1708[arg0];
        int var11 = field1658[arg0];
        int var12 = field1708[arg1];
        int var13 = field1658[arg1];
        int var14 = field1708[arg2];
        int var15 = field1658[arg2];
        int var16 = field1708[arg3];
        int var17 = field1658[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1648; var19++) {
            int var20 = this.field1656[var19];
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
            field1687[var19] = var30 - var18;
            field1685[var19] = class131.field1763 * var26 / var30 + var8;
            field1655[var19] = class131.field1763 * var29 / var30 + var9;
            if (this.field1664 > 0) {
                field1675[var19] = var26;
                field1703[var19] = var29;
                field1690[var19] = var30;
            }
        }
        try {
            this.method2736(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dv.w(IIIIIIII)V")
    public final void method2749(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1692[0] = -1;
        if (this.field1671 != 2 && this.field1671 != 1) {
            this.method2735();
        }
        int var9 = Statics.field1737;
        int var10 = Statics.field1750;
        int var11 = field1708[arg0];
        int var12 = field1658[arg0];
        int var13 = field1708[arg1];
        int var14 = field1658[arg1];
        int var15 = field1708[arg2];
        int var16 = field1658[arg2];
        int var17 = field1708[arg3];
        int var18 = field1658[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1648; var20++) {
            int var21 = this.field1656[var20];
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
            field1687[var20] = var31 - var19;
            field1685[var20] = class131.field1763 * var27 / arg7 + var9;
            field1655[var20] = class131.field1763 * var30 / arg7 + var10;
            if (this.field1664 > 0) {
                field1675[var20] = var27;
                field1703[var20] = var30;
                field1690[var20] = var31;
            }
        }
        try {
            this.method2736(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dv.ci(IIIIIIIIJ)V")
    public void method2729(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1692[0] = -1;
        if (this.field1671 != 1) {
            this.method2734();
        }
        this.method2758(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field1686 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field1686) * class131.field1763;
        if (var16 / var14 >= Statics.field1754) {
            return;
        }
        int var17 = (this.field1686 + var15) * class131.field1763;
        if (var17 / var14 <= Statics.field1756) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field1686 * arg1 >> 16;
        int var20 = (var18 + var19) * class131.field1763;
        if (var20 / var14 <= Statics.field1755) {
            return;
        }
        int var21 = (this.field1849 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class131.field1763;
        if (var22 / var14 >= Statics.field1742) {
            return;
        }
        int var23 = (this.field1849 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field1664 > 0;
        int var27 = Statics.method3685();
        int var28 = class129.field1716;
        boolean var30 = class129.method1202();
        boolean var31 = class129.method1944(arg8);
        boolean var32 = false;
        if (var31 && var30) {
            boolean var33 = false;
            if (field1705) {
                boolean var35;
                if (class129.method1202()) {
                    if (!class129.field1726) {
                        int var36 = Statics.field1805;
                        int var37 = Statics.field1779;
                        int var38 = Statics.field1807;
                        int var39 = Statics.field1808;
                        byte var40 = 50;
                        short var41 = 3500;
                        int var42 = (class129.field1715 - Statics.field1737) * var40 / class131.field1763;
                        int var43 = (class129.field1716 - Statics.field1750) * var40 / class131.field1763;
                        int var44 = (class129.field1715 - Statics.field1737) * var41 / class131.field1763;
                        int var45 = (class129.field1716 - Statics.field1750) * var41 / class131.field1763;
                        int var46 = class131.method2848(var43, var40, var37, var36);
                        int var47 = class131.method2825(var43, var40, var37, var36);
                        int var49 = class131.method2848(var45, var41, var37, var36);
                        int var50 = class131.method2825(var45, var41, var37, var36);
                        int var52 = class131.method2851(var42, var47, var39, var38);
                        int var53 = class131.method2847(var42, var47, var39, var38);
                        int var55 = class131.method2851(var44, var50, var39, var38);
                        int var56 = class131.method2847(var44, var50, var39, var38);
                        Statics.field1718 = (var52 + var55) / 2;
                        Statics.field1719 = (var46 + var49) / 2;
                        Statics.field3134 = (var53 + var56) / 2;
                        Statics.field1720 = (var55 - var52) / 2;
                        Statics.field261 = (var49 - var46) / 2;
                        Statics.field1064 = (var56 - var53) / 2;
                        Statics.field2031 = Math.abs(Statics.field1720);
                        Statics.field1147 = Math.abs(Statics.field261);
                        Statics.field1721 = Math.abs(Statics.field1064);
                    }
                    int var58 = this.field1676 + arg5;
                    int var59 = this.field1677 + arg6;
                    int var60 = this.field1678 + arg7;
                    int var61 = this.field1679;
                    int var62 = this.field1680;
                    int var63 = this.field1653;
                    int var64 = Statics.field1718 - var58;
                    int var65 = Statics.field1719 - var59;
                    int var66 = Statics.field3134 - var60;
                    if (Math.abs(var64) > Statics.field2031 + var61) {
                        var35 = false;
                    } else if (Math.abs(var65) > Statics.field1147 + var62) {
                        var35 = false;
                    } else if (Math.abs(var66) > Statics.field1721 + var63) {
                        var35 = false;
                    } else if (Math.abs(Statics.field261 * var66 - Statics.field1064 * var65) > Statics.field1721 * var62 + Statics.field1147 * var63) {
                        var35 = false;
                    } else if (Math.abs(Statics.field1064 * var64 - Statics.field1720 * var66) > Statics.field2031 * var63 + Statics.field1721 * var61) {
                        var35 = false;
                    } else if (Math.abs(Statics.field1720 * var65 - Statics.field261 * var64) > Statics.field2031 * var62 + Statics.field1147 * var61) {
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
                int var72 = var27 - Statics.field1737;
                int var73 = var28 - Statics.field1750;
                if (var72 > var68 && var72 < var69 && var73 > var70 && var73 < var71) {
                    var33 = true;
                }
            }
            if (var33) {
                if (this.field1670) {
                    class129.field1725[++class129.field1722 - 1] = arg8;
                } else {
                    var32 = true;
                }
            }
        }
        int var76 = Statics.field1737;
        int var77 = Statics.field1750;
        int var78 = 0;
        int var79 = 0;
        if (arg0 != 0) {
            var78 = field1708[arg0];
            var79 = field1658[arg0];
        }
        for (int var80 = 0; var80 < this.field1648; var80++) {
            int var81 = this.field1656[var80];
            int var82 = this.field1650[var80];
            int var83 = this.field1651[var80];
            if (arg0 != 0) {
                int var84 = var78 * var83 + var79 * var81 >> 16;
                var83 = var79 * var83 - var78 * var81 >> 16;
                var81 = var84;
            }
            int var85 = arg5 + var81;
            int var86 = arg6 + var82;
            int var87 = arg7 + var83;
            int var88 = arg3 * var87 + arg4 * var85 >> 16;
            int var89 = arg4 * var87 - arg3 * var85 >> 16;
            int var91 = arg2 * var86 - arg1 * var89 >> 16;
            int var92 = arg1 * var86 + arg2 * var89 >> 16;
            field1687[var80] = var92 - var12;
            if (var92 >= 50) {
                field1685[var80] = class131.field1763 * var88 / var92 + var76;
                field1655[var80] = class131.field1763 * var91 / var92 + var77;
            } else {
                field1685[var80] = -5000;
                var24 = true;
            }
            if (var26) {
                field1675[var80] = var88;
                field1703[var80] = var91;
                field1690[var80] = var92;
            }
        }
        try {
            this.method2736(var24, var32, this.field1670, arg8);
        } catch (Exception var95) {
        }
    }

    @ObfuscatedName("dv.u(ZZZJ)V")
    public final void method2736(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field1674 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field1674; var6++) {
            field1692[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field1652; var8++) {
            if (this.field1709[var8] != -2) {
                int var9 = this.field1647[var8];
                int var10 = this.field1654[var8];
                int var11 = this.field1657[var8];
                int var12 = field1685[var9];
                int var13 = field1685[var10];
                int var14 = field1685[var11];
                if (arg0 && var12 == -5000 || var13 == -5000 || var14 == -5000) {
                    int var15 = field1675[var9];
                    int var16 = field1675[var10];
                    int var17 = field1675[var11];
                    int var18 = field1703[var9];
                    int var19 = field1703[var10];
                    int var20 = field1703[var11];
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
                        field1684[var8] = true;
                        int var33 = (field1687[var9] + field1687[var10] + field1687[var11]) / 3 + this.field1649;
                        field1693[var33][field1692[var33]++] = var8;
                    }
                } else {
                    if (arg1) {
                        int var34 = field1655[var9];
                        int var35 = field1655[var10];
                        int var36 = field1655[var11];
                        int var37 = class129.field1716 + var7;
                        boolean var38;
                        if (var37 < var34 && var37 < var35 && var37 < var36) {
                            var38 = false;
                        } else {
                            int var39 = class129.field1716 - var7;
                            if (var39 > var34 && var39 > var35 && var39 > var36) {
                                var38 = false;
                            } else {
                                int var40 = class129.field1715 + var7;
                                if (var40 < var12 && var40 < var13 && var40 < var14) {
                                    var38 = false;
                                } else {
                                    int var41 = class129.field1715 - var7;
                                    if (var41 > var12 && var41 > var13 && var41 > var14) {
                                        var38 = false;
                                    } else {
                                        var38 = true;
                                    }
                                }
                            }
                        }
                        if (var38) {
                            class129.field1725[++class129.field1722 - 1] = arg3;
                            arg1 = false;
                        }
                    }
                    if ((field1655[var11] - field1655[var10]) * (var12 - var13) - (field1655[var9] - field1655[var10]) * (var14 - var13) > 0) {
                        field1684[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field1751 && var13 <= Statics.field1751 && var14 <= Statics.field1751) {
                            field1683[var8] = false;
                        } else {
                            field1683[var8] = true;
                        }
                        int var44 = (field1687[var9] + field1687[var10] + field1687[var11]) / 3 + this.field1649;
                        field1693[var44][field1692[var44]++] = var8;
                    }
                }
            }
        }
        if (this.field1659 == null) {
            for (int var45 = this.field1674 - 1; var45 >= 0; var45--) {
                int var46 = field1692[var45];
                if (var46 > 0) {
                    int[] var47 = field1693[var45];
                    for (int var48 = 0; var48 < var46; var48++) {
                        this.method2751(var47[var48]);
                    }
                }
            }
            return;
        }
        for (int var49 = 0; var49 < 12; var49++) {
            field1694[var49] = 0;
            field1698[var49] = 0;
        }
        for (int var50 = this.field1674 - 1; var50 >= 0; var50--) {
            int var51 = field1692[var50];
            if (var51 > 0) {
                int[] var52 = field1693[var50];
                for (int var53 = 0; var53 < var51; var53++) {
                    int var54 = var52[var53];
                    byte var55 = this.field1659[var54];
                    int var56 = field1694[var55]++;
                    field1646[var55][var56] = var54;
                    if (var55 < 10) {
                        field1698[var55] += var50;
                    } else if (var55 == 10) {
                        field1668[var56] = var50;
                    } else {
                        field1697[var56] = var50;
                    }
                }
            }
        }
        int var57 = 0;
        if (field1694[1] > 0 || field1694[2] > 0) {
            var57 = (field1698[1] + field1698[2]) / (field1694[1] + field1694[2]);
        }
        int var58 = 0;
        if (field1694[3] > 0 || field1694[4] > 0) {
            var58 = (field1698[3] + field1698[4]) / (field1694[3] + field1694[4]);
        }
        int var59 = 0;
        if (field1694[6] > 0 || field1694[8] > 0) {
            var59 = (field1698[6] + field1698[8]) / (field1694[6] + field1694[8]);
        }
        int var60 = 0;
        int var61 = field1694[10];
        int[] var62 = field1646[10];
        int[] var63 = field1668;
        if (var60 == var61) {
            var60 = 0;
            var61 = field1694[11];
            var62 = field1646[11];
            var63 = field1697;
        }
        int var64;
        if (var60 < var61) {
            var64 = var63[var60];
        } else {
            var64 = -1000;
        }
        for (int var65 = 0; var65 < 10; var65++) {
            while (var65 == 0 && var64 > var57) {
                this.method2751(var62[var60++]);
                if (var60 == var61 && field1646[11] != var62) {
                    var60 = 0;
                    var61 = field1694[11];
                    var62 = field1646[11];
                    var63 = field1697;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            while (var65 == 3 && var64 > var58) {
                this.method2751(var62[var60++]);
                if (var60 == var61 && field1646[11] != var62) {
                    var60 = 0;
                    var61 = field1694[11];
                    var62 = field1646[11];
                    var63 = field1697;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            while (var65 == 5 && var64 > var59) {
                this.method2751(var62[var60++]);
                if (var60 == var61 && field1646[11] != var62) {
                    var60 = 0;
                    var61 = field1694[11];
                    var62 = field1646[11];
                    var63 = field1697;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            int var66 = field1694[var65];
            int[] var67 = field1646[var65];
            for (int var68 = 0; var68 < var66; var68++) {
                this.method2751(var67[var68]);
            }
        }
        while (var64 != -1000) {
            this.method2751(var62[var60++]);
            if (var60 == var61 && field1646[11] != var62) {
                var60 = 0;
                var62 = field1646[11];
                var61 = field1694[11];
                var63 = field1697;
            }
            if (var60 < var61) {
                var64 = var63[var60];
            } else {
                var64 = -1000;
            }
        }
    }

    @ObfuscatedName("dv.ad(I)V")
    public final void method2751(int arg0) {
        if (field1684[arg0]) {
            this.method2752(arg0);
            return;
        }
        int var2 = this.field1647[arg0];
        int var3 = this.field1654[arg0];
        int var4 = this.field1657[arg0];
        class131.field1746 = field1683[arg0];
        if (this.field1660 == null) {
            class131.field1741 = 0;
        } else {
            class131.field1741 = this.field1660[arg0] & 0xFF;
        }
        if (this.field1662 != null && this.field1662[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1645 == null || this.field1645[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1645[arg0] & 0xFF;
                var6 = this.field1665[var5];
                var7 = this.field1666[var5];
                var8 = this.field1667[var5];
            }
            if (this.field1709[arg0] == -1) {
                class131.method2890(field1655[var2], field1655[var3], field1655[var4], field1685[var2], field1685[var3], field1685[var4], this.field1661[arg0], this.field1661[arg0], this.field1661[arg0], field1675[var6], field1675[var7], field1675[var8], field1703[var6], field1703[var7], field1703[var8], field1690[var6], field1690[var7], field1690[var8], this.field1662[arg0]);
            } else {
                class131.method2890(field1655[var2], field1655[var3], field1655[var4], field1685[var2], field1685[var3], field1685[var4], this.field1661[arg0], this.field1688[arg0], this.field1709[arg0], field1675[var6], field1675[var7], field1675[var8], field1703[var6], field1703[var7], field1703[var8], field1690[var6], field1690[var7], field1690[var8], this.field1662[arg0]);
            }
        } else if (this.field1709[arg0] == -1) {
            class131.method2837(field1655[var2], field1655[var3], field1655[var4], field1685[var2], field1685[var3], field1685[var4], field1710[this.field1661[arg0]]);
        } else {
            class131.method2835(field1655[var2], field1655[var3], field1655[var4], field1685[var2], field1685[var3], field1685[var4], this.field1661[arg0], this.field1688[arg0], this.field1709[arg0]);
        }
    }

    @ObfuscatedName("dv.ag(I)V")
    public final void method2752(int arg0) {
        int var2 = Statics.field1737;
        int var3 = Statics.field1750;
        int var4 = 0;
        int var5 = this.field1647[arg0];
        int var6 = this.field1654[arg0];
        int var7 = this.field1657[arg0];
        int var8 = field1690[var5];
        int var9 = field1690[var6];
        int var10 = field1690[var7];
        if (this.field1660 == null) {
            class131.field1741 = 0;
        } else {
            class131.field1741 = this.field1660[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1699[var4] = field1685[var5];
            field1700[var4] = field1655[var5];
            field1701[var4++] = this.field1661[arg0];
        } else {
            int var11 = field1675[var5];
            int var12 = field1703[var5];
            int var13 = this.field1661[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1689[var10 - var8];
                field1699[var4] = (((field1675[var7] - var11) * var14 >> 16) + var11) * class131.field1763 / 50 + var2;
                field1700[var4] = (((field1703[var7] - var12) * var14 >> 16) + var12) * class131.field1763 / 50 + var3;
                field1701[var4++] = ((this.field1709[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1689[var9 - var8];
                field1699[var4] = (((field1675[var6] - var11) * var15 >> 16) + var11) * class131.field1763 / 50 + var2;
                field1700[var4] = (((field1703[var6] - var12) * var15 >> 16) + var12) * class131.field1763 / 50 + var3;
                field1701[var4++] = ((this.field1688[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1699[var4] = field1685[var6];
            field1700[var4] = field1655[var6];
            field1701[var4++] = this.field1688[arg0];
        } else {
            int var16 = field1675[var6];
            int var17 = field1703[var6];
            int var18 = this.field1688[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1689[var8 - var9];
                field1699[var4] = (((field1675[var5] - var16) * var19 >> 16) + var16) * class131.field1763 / 50 + var2;
                field1700[var4] = (((field1703[var5] - var17) * var19 >> 16) + var17) * class131.field1763 / 50 + var3;
                field1701[var4++] = ((this.field1661[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1689[var10 - var9];
                field1699[var4] = (((field1675[var7] - var16) * var20 >> 16) + var16) * class131.field1763 / 50 + var2;
                field1700[var4] = (((field1703[var7] - var17) * var20 >> 16) + var17) * class131.field1763 / 50 + var3;
                field1701[var4++] = ((this.field1709[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1699[var4] = field1685[var7];
            field1700[var4] = field1655[var7];
            field1701[var4++] = this.field1709[arg0];
        } else {
            int var21 = field1675[var7];
            int var22 = field1703[var7];
            int var23 = this.field1709[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1689[var9 - var10];
                field1699[var4] = (((field1675[var6] - var21) * var24 >> 16) + var21) * class131.field1763 / 50 + var2;
                field1700[var4] = (((field1703[var6] - var22) * var24 >> 16) + var22) * class131.field1763 / 50 + var3;
                field1701[var4++] = ((this.field1688[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1689[var8 - var10];
                field1699[var4] = (((field1675[var5] - var21) * var25 >> 16) + var21) * class131.field1763 / 50 + var2;
                field1700[var4] = (((field1703[var5] - var22) * var25 >> 16) + var22) * class131.field1763 / 50 + var3;
                field1701[var4++] = ((this.field1661[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1699[0];
        int var27 = field1699[1];
        int var28 = field1699[2];
        int var29 = field1700[0];
        int var30 = field1700[1];
        int var31 = field1700[2];
        class131.field1746 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1751 || var27 > Statics.field1751 || var28 > Statics.field1751) {
                class131.field1746 = true;
            }
            if (this.field1662 != null && this.field1662[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1645 == null || this.field1645[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1645[arg0] & 0xFF;
                    var33 = this.field1665[var32];
                    var34 = this.field1666[var32];
                    var35 = this.field1667[var32];
                }
                if (this.field1709[arg0] == -1) {
                    class131.method2890(var29, var30, var31, var26, var27, var28, this.field1661[arg0], this.field1661[arg0], this.field1661[arg0], field1675[var33], field1675[var34], field1675[var35], field1703[var33], field1703[var34], field1703[var35], field1690[var33], field1690[var34], field1690[var35], this.field1662[arg0]);
                } else {
                    class131.method2890(var29, var30, var31, var26, var27, var28, field1701[0], field1701[1], field1701[2], field1675[var33], field1675[var34], field1675[var35], field1703[var33], field1703[var34], field1703[var35], field1690[var33], field1690[var34], field1690[var35], this.field1662[arg0]);
                }
            } else if (this.field1709[arg0] == -1) {
                class131.method2837(var29, var30, var31, var26, var27, var28, field1710[this.field1661[arg0]]);
            } else {
                class131.method2835(var29, var30, var31, var26, var27, var28, field1701[0], field1701[1], field1701[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1751 || var27 > Statics.field1751 || var28 > Statics.field1751 || field1699[3] < 0 || field1699[3] > Statics.field1751) {
            class131.field1746 = true;
        }
        if (this.field1662 != null && this.field1662[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1645 == null || this.field1645[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1645[arg0] & 0xFF;
                var37 = this.field1665[var36];
                var38 = this.field1666[var36];
                var39 = this.field1667[var36];
            }
            short var40 = this.field1662[arg0];
            if (this.field1709[arg0] == -1) {
                class131.method2890(var29, var30, var31, var26, var27, var28, this.field1661[arg0], this.field1661[arg0], this.field1661[arg0], field1675[var37], field1675[var38], field1675[var39], field1703[var37], field1703[var38], field1703[var39], field1690[var37], field1690[var38], field1690[var39], var40);
                class131.method2890(var29, var31, field1700[3], var26, var28, field1699[3], this.field1661[arg0], this.field1661[arg0], this.field1661[arg0], field1675[var37], field1675[var38], field1675[var39], field1703[var37], field1703[var38], field1703[var39], field1690[var37], field1690[var38], field1690[var39], var40);
            } else {
                class131.method2890(var29, var30, var31, var26, var27, var28, field1701[0], field1701[1], field1701[2], field1675[var37], field1675[var38], field1675[var39], field1703[var37], field1703[var38], field1703[var39], field1690[var37], field1690[var38], field1690[var39], var40);
                class131.method2890(var29, var31, field1700[3], var26, var28, field1699[3], field1701[0], field1701[2], field1701[3], field1675[var37], field1675[var38], field1675[var39], field1703[var37], field1703[var38], field1703[var39], field1690[var37], field1690[var38], field1690[var39], var40);
            }
        } else if (this.field1709[arg0] == -1) {
            int var41 = field1710[this.field1661[arg0]];
            class131.method2837(var29, var30, var31, var26, var27, var28, var41);
            class131.method2837(var29, var31, field1700[3], var26, var28, field1699[3], var41);
        } else {
            class131.method2835(var29, var30, var31, var26, var27, var28, field1701[0], field1701[1], field1701[2]);
            class131.method2835(var29, var31, field1700[3], var26, var28, field1699[3], field1701[0], field1701[2], field1701[3]);
        }
    }
}
