package deob;

@ObfuscatedName("dw")
public class class128 extends class136 {

    @ObfuscatedName("dw.f")
    public static class128 field1713 = new class128();

    @ObfuscatedName("dw.i")
    public static byte[] field1645 = new byte[1];

    @ObfuscatedName("dw.y")
    public static class128 field1646 = new class128();

    @ObfuscatedName("dw.w")
    public static byte[] field1647 = new byte[1];

    @ObfuscatedName("dw.p")
    public int field1648 = 0;

    @ObfuscatedName("dw.b")
    public int[] field1649;

    @ObfuscatedName("dw.e")
    public int[] field1685;

    @ObfuscatedName("dw.x")
    public int[] field1651;

    @ObfuscatedName("dw.a")
    public int field1650 = 0;

    @ObfuscatedName("dw.d")
    public int[] field1709;

    @ObfuscatedName("dw.c")
    public int[] field1654;

    @ObfuscatedName("dw.o")
    public int[] field1655;

    @ObfuscatedName("dw.v")
    public int[] field1656;

    @ObfuscatedName("dw.k")
    public int[] field1657;

    @ObfuscatedName("dw.s")
    public int[] field1661;

    @ObfuscatedName("dw.l")
    public byte[] field1667;

    @ObfuscatedName("dw.t")
    public byte[] field1660;

    @ObfuscatedName("dw.j")
    public byte[] field1704;

    @ObfuscatedName("dw.n")
    public short[] field1662;

    @ObfuscatedName("dw.u")
    public byte field1663 = 0;

    @ObfuscatedName("dw.z")
    public int field1689 = 0;

    @ObfuscatedName("dw.h")
    public int[] field1665;

    @ObfuscatedName("dw.m")
    public int[] field1666;

    @ObfuscatedName("dw.g")
    public int[] field1694;

    @ObfuscatedName("dw.r")
    public int[][] field1653;

    @ObfuscatedName("dw.q")
    public int[][] field1669;

    @ObfuscatedName("dw.aa")
    public boolean field1670 = false;

    @ObfuscatedName("dw.av")
    public int field1659;

    @ObfuscatedName("dw.aw")
    public int field1672;

    @ObfuscatedName("dw.as")
    public int field1673;

    @ObfuscatedName("dw.ak")
    public int field1674;

    @ObfuscatedName("dw.au")
    public int field1675;

    @ObfuscatedName("dw.ah")
    public int field1686;

    @ObfuscatedName("dw.aq")
    public int field1677;

    @ObfuscatedName("dw.ao")
    public int field1687;

    @ObfuscatedName("dw.an")
    public int field1679 = -1;

    @ObfuscatedName("dw.ar")
    public int field1680 = -1;

    @ObfuscatedName("dw.az")
    public int field1681 = -1;

    @ObfuscatedName("dw.ag")
    public static boolean[] field1658 = new boolean[4700];

    @ObfuscatedName("dw.ac")
    public static boolean[] field1684 = new boolean[4700];

    @ObfuscatedName("dw.al")
    public static int[] field1707 = new int[4700];

    @ObfuscatedName("dw.ae")
    public static int[] field1664 = new int[4700];

    @ObfuscatedName("dw.ad")
    public static int[] field1711 = new int[4700];

    @ObfuscatedName("dw.aj")
    public static int[] field1671 = new int[4700];

    @ObfuscatedName("dw.ax")
    public static int[] field1692 = new int[4700];

    @ObfuscatedName("dw.at")
    public static int[] field1690 = new int[4700];

    @ObfuscatedName("dw.ap")
    public static int[] field1652 = new int[1600];

    @ObfuscatedName("dw.ai")
    public static int[][] field1693 = new int[1600][512];

    @ObfuscatedName("dw.am")
    public static int[] field1706 = new int[12];

    @ObfuscatedName("dw.ab")
    public static int[][] field1695 = new int[12][2000];

    @ObfuscatedName("dw.bj")
    public static int[] field1696 = new int[2000];

    @ObfuscatedName("dw.bg")
    public static int[] field1697 = new int[2000];

    @ObfuscatedName("dw.bw")
    public static int[] field1698 = new int[12];

    @ObfuscatedName("dw.bk")
    public static int[] field1699 = new int[10];

    @ObfuscatedName("dw.bl")
    public static int[] field1700 = new int[10];

    @ObfuscatedName("dw.bq")
    public static int[] field1701 = new int[10];

    @ObfuscatedName("dw.bz")
    public static boolean field1705 = true;

    @ObfuscatedName("dw.bs")
    public static int[] field1683 = class131.field1762;

    @ObfuscatedName("dw.ba")
    public static int[] field1708 = class131.field1737;

    @ObfuscatedName("dw.bn")
    public static int[] field1710 = class131.field1758;

    @ObfuscatedName("dw.bb")
    public static int[] field1676 = class131.field1761;

    public class128() {
    }

    public class128(class128[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1648 = 0;
        this.field1650 = 0;
        this.field1689 = 0;
        this.field1663 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class128 var8 = arg0[var7];
            if (var8 != null) {
                this.field1648 += var8.field1648;
                this.field1650 += var8.field1650;
                this.field1689 += var8.field1689;
                if (var8.field1667 == null) {
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
                var6 |= var8.field1704 != null;
            }
        }
        this.field1649 = new int[this.field1648];
        this.field1685 = new int[this.field1648];
        this.field1651 = new int[this.field1648];
        this.field1709 = new int[this.field1650];
        this.field1654 = new int[this.field1650];
        this.field1655 = new int[this.field1650];
        this.field1656 = new int[this.field1650];
        this.field1657 = new int[this.field1650];
        this.field1661 = new int[this.field1650];
        if (var3) {
            this.field1667 = new byte[this.field1650];
        }
        if (var4) {
            this.field1660 = new byte[this.field1650];
        }
        if (var5) {
            this.field1662 = new short[this.field1650];
        }
        if (var6) {
            this.field1704 = new byte[this.field1650];
        }
        if (this.field1689 > 0) {
            this.field1665 = new int[this.field1689];
            this.field1666 = new int[this.field1689];
            this.field1694 = new int[this.field1689];
        }
        this.field1648 = 0;
        this.field1650 = 0;
        this.field1689 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class128 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1650; var11++) {
                    this.field1709[this.field1650] = var10.field1709[var11] + this.field1648;
                    this.field1654[this.field1650] = var10.field1654[var11] + this.field1648;
                    this.field1655[this.field1650] = var10.field1655[var11] + this.field1648;
                    this.field1656[this.field1650] = var10.field1656[var11];
                    this.field1657[this.field1650] = var10.field1657[var11];
                    this.field1661[this.field1650] = var10.field1661[var11];
                    if (var3) {
                        if (var10.field1667 == null) {
                            this.field1667[this.field1650] = var10.field1663;
                        } else {
                            this.field1667[this.field1650] = var10.field1667[var11];
                        }
                    }
                    if (var4 && var10.field1660 != null) {
                        this.field1660[this.field1650] = var10.field1660[var11];
                    }
                    if (var5) {
                        if (var10.field1662 == null) {
                            this.field1662[this.field1650] = -1;
                        } else {
                            this.field1662[this.field1650] = var10.field1662[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1704 == null || var10.field1704[var11] == -1) {
                            this.field1704[this.field1650] = -1;
                        } else {
                            this.field1704[this.field1650] = (byte) (var10.field1704[var11] + this.field1689);
                        }
                    }
                    this.field1650++;
                }
                for (int var12 = 0; var12 < var10.field1689; var12++) {
                    this.field1665[this.field1689] = var10.field1665[var12] + this.field1648;
                    this.field1666[this.field1689] = var10.field1666[var12] + this.field1648;
                    this.field1694[this.field1689] = var10.field1694[var12] + this.field1648;
                    this.field1689++;
                }
                for (int var13 = 0; var13 < var10.field1648; var13++) {
                    this.field1649[this.field1648] = var10.field1649[var13];
                    this.field1685[this.field1648] = var10.field1685[var13];
                    this.field1651[this.field1648] = var10.field1651[var13];
                    this.field1648++;
                }
            }
        }
    }

    @ObfuscatedName("dw.f([[IIIIZI)Ldw;")
    public class128 method2676(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2691();
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
            var15.field1650 = this.field1650;
            var15.field1689 = this.field1689;
            var15.field1649 = this.field1649;
            var15.field1651 = this.field1651;
            var15.field1709 = this.field1709;
            var15.field1654 = this.field1654;
            var15.field1655 = this.field1655;
            var15.field1656 = this.field1656;
            var15.field1657 = this.field1657;
            var15.field1661 = this.field1661;
            var15.field1667 = this.field1667;
            var15.field1660 = this.field1660;
            var15.field1704 = this.field1704;
            var15.field1662 = this.field1662;
            var15.field1663 = this.field1663;
            var15.field1665 = this.field1665;
            var15.field1666 = this.field1666;
            var15.field1694 = this.field1694;
            var15.field1653 = this.field1653;
            var15.field1669 = this.field1669;
            var15.field1670 = this.field1670;
            var15.field1685 = new int[var15.field1648];
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
                var15.field1685[var16] = this.field1685[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1648; var26++) {
                int var27 = (-this.field1685[var26] << 16) / this.field1850;
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
                    var15.field1685[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1685[var26];
                }
            }
        }
        var15.method2638();
        return var15;
    }

    @ObfuscatedName("dw.i(Z)Ldw;")
    public class128 method2631(boolean arg0) {
        if (!arg0 && field1645.length < this.field1650) {
            field1645 = new byte[this.field1650 + 100];
        }
        return this.method2654(arg0, field1713, field1645);
    }

    @ObfuscatedName("dw.y(Z)Ldw;")
    public class128 method2632(boolean arg0) {
        if (!arg0 && field1647.length < this.field1650) {
            field1647 = new byte[this.field1650 + 100];
        }
        return this.method2654(arg0, field1646, field1647);
    }

    @ObfuscatedName("dw.w(ZLdw;[B)Ldw;")
    public class128 method2654(boolean arg0, class128 arg1, byte[] arg2) {
        arg1.field1648 = this.field1648;
        arg1.field1650 = this.field1650;
        arg1.field1689 = this.field1689;
        if (arg1.field1649 == null || arg1.field1649.length < this.field1648) {
            arg1.field1649 = new int[this.field1648 + 100];
            arg1.field1685 = new int[this.field1648 + 100];
            arg1.field1651 = new int[this.field1648 + 100];
        }
        for (int var4 = 0; var4 < this.field1648; var4++) {
            arg1.field1649[var4] = this.field1649[var4];
            arg1.field1685[var4] = this.field1685[var4];
            arg1.field1651[var4] = this.field1651[var4];
        }
        if (arg0) {
            arg1.field1660 = this.field1660;
        } else {
            arg1.field1660 = arg2;
            if (this.field1660 == null) {
                for (int var5 = 0; var5 < this.field1650; var5++) {
                    arg1.field1660[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1650; var6++) {
                    arg1.field1660[var6] = this.field1660[var6];
                }
            }
        }
        arg1.field1709 = this.field1709;
        arg1.field1654 = this.field1654;
        arg1.field1655 = this.field1655;
        arg1.field1656 = this.field1656;
        arg1.field1657 = this.field1657;
        arg1.field1661 = this.field1661;
        arg1.field1667 = this.field1667;
        arg1.field1704 = this.field1704;
        arg1.field1662 = this.field1662;
        arg1.field1663 = this.field1663;
        arg1.field1665 = this.field1665;
        arg1.field1666 = this.field1666;
        arg1.field1694 = this.field1694;
        arg1.field1653 = this.field1653;
        arg1.field1669 = this.field1669;
        arg1.field1670 = this.field1670;
        arg1.method2638();
        return arg1;
    }

    @ObfuscatedName("dw.p(I)V")
    public void method2634(int arg0) {
        if (this.field1679 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1708[arg0];
        int var9 = field1683[arg0];
        for (int var10 = 0; var10 < this.field1648; var10++) {
            int var11 = class131.method2759(this.field1649[var10], this.field1651[var10], var8, var9);
            int var12 = this.field1685[var10];
            int var13 = class131.method2760(this.field1649[var10], this.field1651[var10], var8, var9);
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
        this.field1686 = (var2 + var5) / 2;
        this.field1677 = (var3 + var6) / 2;
        this.field1687 = (var4 + var7) / 2;
        this.field1679 = (var5 - var2 + 1) / 2;
        this.field1680 = (var6 - var3 + 1) / 2;
        this.field1681 = (var7 - var4 + 1) / 2;
        if (this.field1679 < 32) {
            this.field1679 = 32;
        }
        if (this.field1681 < 32) {
            this.field1681 = 32;
        }
        if (this.field1670) {
            this.field1679 += 8;
            this.field1681 += 8;
        }
    }

    @ObfuscatedName("dw.b()V")
    public void method2691() {
        if (this.field1659 == 1) {
            return;
        }
        this.field1659 = 1;
        this.field1850 = 0;
        this.field1672 = 0;
        this.field1673 = 0;
        for (int var1 = 0; var1 < this.field1648; var1++) {
            int var2 = this.field1649[var1];
            int var3 = this.field1685[var1];
            int var4 = this.field1651[var1];
            if (-var3 > this.field1850) {
                this.field1850 = -var3;
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
        this.field1675 = (int) (Math.sqrt((double) (this.field1850 * this.field1850 + this.field1673 * this.field1673)) + 0.99D);
        this.field1674 = this.field1675 + (int) (Math.sqrt((double) (this.field1673 * this.field1673 + this.field1672 * this.field1672)) + 0.99D);
    }

    @ObfuscatedName("dw.e()V")
    public void method2650() {
        if (this.field1659 == 2) {
            return;
        }
        this.field1659 = 2;
        this.field1673 = 0;
        for (int var1 = 0; var1 < this.field1648; var1++) {
            int var2 = this.field1649[var1];
            int var3 = this.field1685[var1];
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

    @ObfuscatedName("dw.x()I")
    public int method2637() {
        this.method2691();
        return this.field1673;
    }

    @ObfuscatedName("dw.d()V")
    public void method2638() {
        this.field1659 = 0;
        this.field1679 = -1;
    }

    @ObfuscatedName("dw.c(Leq;I)V")
    public void method2692(class139 arg0, int arg1) {
        if (this.field1653 == null || arg1 == -1) {
            return;
        }
        class126 var3 = arg0.field1866[arg1];
        class133 var4 = var3.field1614;
        Statics.field1702 = 0;
        Statics.field1703 = 0;
        Statics.field1678 = 0;
        for (int var5 = 0; var5 < var3.field1613; var5++) {
            int var6 = var3.field1611[var5];
            this.method2655(var4.field1773[var6], var4.field1776[var6], var3.field1610[var5], var3.field1618[var5], var3.field1619[var5]);
        }
        this.method2638();
    }

    @ObfuscatedName("dw.o(Leq;ILeq;I[I)V")
    public void method2633(class139 arg0, int arg1, class139 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2692(arg0, arg1);
            return;
        }
        class126 var6 = arg0.field1866[arg1];
        class126 var7 = arg2.field1866[arg3];
        class133 var8 = var6.field1614;
        Statics.field1702 = 0;
        Statics.field1703 = 0;
        Statics.field1678 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1613; var11++) {
            int var12 = var6.field1611[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1773[var12] == 0) {
                this.method2655(var8.field1773[var12], var8.field1776[var12], var6.field1610[var11], var6.field1618[var11], var6.field1619[var11]);
            }
        }
        Statics.field1702 = 0;
        Statics.field1703 = 0;
        Statics.field1678 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1613; var15++) {
            int var16 = var7.field1611[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1773[var16] == 0) {
                this.method2655(var8.field1773[var16], var8.field1776[var16], var7.field1610[var15], var7.field1618[var15], var7.field1619[var15]);
            }
        }
        this.method2638();
    }

    @ObfuscatedName("dw.l(I[IIII)V")
    public void method2655(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1702 = 0;
            Statics.field1703 = 0;
            Statics.field1678 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1653.length) {
                    int[] var10 = this.field1653[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1702 += this.field1649[var12];
                        Statics.field1703 += this.field1685[var12];
                        Statics.field1678 += this.field1651[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1702 = Statics.field1702 / var7 + arg2;
                Statics.field1703 = Statics.field1703 / var7 + arg3;
                Statics.field1678 = Statics.field1678 / var7 + arg4;
            } else {
                Statics.field1702 = arg2;
                Statics.field1703 = arg3;
                Statics.field1678 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1653.length) {
                    int[] var15 = this.field1653[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1649[var17] += arg2;
                        this.field1685[var17] += arg3;
                        this.field1651[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1653.length) {
                    int[] var20 = this.field1653[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1649[var22] -= Statics.field1702;
                        this.field1685[var22] -= Statics.field1703;
                        this.field1651[var22] -= Statics.field1678;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1683[var25];
                            int var27 = field1708[var25];
                            int var28 = this.field1685[var22] * var26 + this.field1649[var22] * var27 >> 16;
                            this.field1685[var22] = this.field1685[var22] * var27 - this.field1649[var22] * var26 >> 16;
                            this.field1649[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1683[var23];
                            int var30 = field1708[var23];
                            int var31 = this.field1685[var22] * var30 - this.field1651[var22] * var29 >> 16;
                            this.field1651[var22] = this.field1685[var22] * var29 + this.field1651[var22] * var30 >> 16;
                            this.field1685[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1683[var24];
                            int var33 = field1708[var24];
                            int var34 = this.field1651[var22] * var32 + this.field1649[var22] * var33 >> 16;
                            this.field1651[var22] = this.field1651[var22] * var33 - this.field1649[var22] * var32 >> 16;
                            this.field1649[var22] = var34;
                        }
                        this.field1649[var22] += Statics.field1702;
                        this.field1685[var22] += Statics.field1703;
                        this.field1651[var22] += Statics.field1678;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1653.length) {
                    int[] var37 = this.field1653[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1649[var39] -= Statics.field1702;
                        this.field1685[var39] -= Statics.field1703;
                        this.field1651[var39] -= Statics.field1678;
                        this.field1649[var39] = this.field1649[var39] * arg2 / 128;
                        this.field1685[var39] = this.field1685[var39] * arg3 / 128;
                        this.field1651[var39] = this.field1651[var39] * arg4 / 128;
                        this.field1649[var39] += Statics.field1702;
                        this.field1685[var39] += Statics.field1703;
                        this.field1651[var39] += Statics.field1678;
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

    @ObfuscatedName("dw.t()V")
    public void method2663() {
        for (int var1 = 0; var1 < this.field1648; var1++) {
            int var2 = this.field1649[var1];
            this.field1649[var1] = this.field1651[var1];
            this.field1651[var1] = -var2;
        }
        this.method2638();
    }

    @ObfuscatedName("dw.j()V")
    public void method2689() {
        for (int var1 = 0; var1 < this.field1648; var1++) {
            this.field1649[var1] = -this.field1649[var1];
            this.field1651[var1] = -this.field1651[var1];
        }
        this.method2638();
    }

    @ObfuscatedName("dw.n()V")
    public void method2644() {
        for (int var1 = 0; var1 < this.field1648; var1++) {
            int var2 = this.field1651[var1];
            this.field1651[var1] = this.field1649[var1];
            this.field1649[var1] = -var2;
        }
        this.method2638();
    }

    @ObfuscatedName("dw.u(I)V")
    public void method2688(int arg0) {
        int var2 = field1683[arg0];
        int var3 = field1708[arg0];
        for (int var4 = 0; var4 < this.field1648; var4++) {
            int var5 = this.field1685[var4] * var3 - this.field1651[var4] * var2 >> 16;
            this.field1651[var4] = this.field1685[var4] * var2 + this.field1651[var4] * var3 >> 16;
            this.field1685[var4] = var5;
        }
        this.method2638();
    }

    @ObfuscatedName("dw.z(III)V")
    public void method2646(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1648; var4++) {
            this.field1649[var4] += arg0;
            this.field1685[var4] += arg1;
            this.field1651[var4] += arg2;
        }
        this.method2638();
    }

    @ObfuscatedName("dw.h(III)V")
    public void method2647(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1648; var4++) {
            this.field1649[var4] = this.field1649[var4] * arg0 / 128;
            this.field1685[var4] = this.field1685[var4] * arg1 / 128;
            this.field1651[var4] = this.field1651[var4] * arg2 / 128;
        }
        this.method2638();
    }

    @ObfuscatedName("dw.m(IIIIIII)V")
    public final void method2651(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1652[0] = -1;
        if (this.field1659 != 2 && this.field1659 != 1) {
            this.method2650();
        }
        int var8 = Statics.field1749;
        int var9 = Statics.field1750;
        int var10 = field1683[arg0];
        int var11 = field1708[arg0];
        int var12 = field1683[arg1];
        int var13 = field1708[arg1];
        int var14 = field1683[arg2];
        int var15 = field1708[arg2];
        int var16 = field1683[arg3];
        int var17 = field1708[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1648; var19++) {
            int var20 = this.field1649[var19];
            int var21 = this.field1685[var19];
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
            field1711[var19] = var30 - var18;
            field1707[var19] = class131.field1748 * var26 / var30 + var8;
            field1664[var19] = class131.field1748 * var29 / var30 + var9;
            if (this.field1689 > 0) {
                field1671[var19] = var26;
                field1692[var19] = var29;
                field1690[var19] = var30;
            }
        }
        try {
            this.method2636(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dw.aa(IIIIIIII)V")
    public final void method2649(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1652[0] = -1;
        if (this.field1659 != 2 && this.field1659 != 1) {
            this.method2650();
        }
        int var9 = Statics.field1749;
        int var10 = Statics.field1750;
        int var11 = field1683[arg0];
        int var12 = field1708[arg0];
        int var13 = field1683[arg1];
        int var14 = field1708[arg1];
        int var15 = field1683[arg2];
        int var16 = field1708[arg2];
        int var17 = field1683[arg3];
        int var18 = field1708[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1648; var20++) {
            int var21 = this.field1649[var20];
            int var22 = this.field1685[var20];
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
            field1711[var20] = var31 - var19;
            field1707[var20] = class131.field1748 * var27 / arg7 + var9;
            field1664[var20] = class131.field1748 * var30 / arg7 + var10;
            if (this.field1689 > 0) {
                field1671[var20] = var27;
                field1692[var20] = var30;
                field1690[var20] = var31;
            }
        }
        try {
            this.method2636(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dw.ch(IIIIIIIIJ)V")
    public void method2677(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1652[0] = -1;
        if (this.field1659 != 1) {
            this.method2691();
        }
        this.method2634(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field1673 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field1673) * class131.field1748;
        if (var16 / var14 >= Statics.field1760) {
            return;
        }
        int var17 = (this.field1673 + var15) * class131.field1748;
        if (var17 / var14 <= Statics.field1753) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field1673 * arg1 >> 16;
        int var20 = (var18 + var19) * class131.field1748;
        if (var20 / var14 <= Statics.field1755) {
            return;
        }
        int var21 = (this.field1850 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class131.field1748;
        if (var22 / var14 >= Statics.field1756) {
            return;
        }
        int var23 = (this.field1850 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field1689 > 0;
        int var27 = class129.method3716();
        int var28 = class129.method2541();
        boolean var29 = class129.field1724;
        boolean var31 = class129.method649(arg8);
        boolean var32 = false;
        if (var31 && var29) {
            boolean var33 = false;
            if (field1705) {
                var33 = Statics.method3477(this, arg5, arg6, arg7);
            } else {
                int var34 = var12 - var13;
                if (var34 <= 50) {
                    var34 = 50;
                }
                int var35;
                int var36;
                if (var15 > 0) {
                    var35 = var16 / var14;
                    var36 = var17 / var34;
                } else {
                    var36 = var17 / var14;
                    var35 = var16 / var34;
                }
                int var37;
                int var38;
                if (var18 > 0) {
                    var37 = var22 / var14;
                    var38 = var20 / var34;
                } else {
                    var38 = var20 / var14;
                    var37 = var22 / var34;
                }
                int var39 = var27 - Statics.field1749;
                int var40 = var28 - Statics.field1750;
                if (var39 > var35 && var39 < var36 && var40 > var37 && var40 < var38) {
                    var33 = true;
                }
            }
            if (var33) {
                if (this.field1670) {
                    class129.field1726[++class129.field1722 - 1] = arg8;
                } else {
                    var32 = true;
                }
            }
        }
        int var43 = Statics.field1749;
        int var44 = Statics.field1750;
        int var45 = 0;
        int var46 = 0;
        if (arg0 != 0) {
            var45 = field1683[arg0];
            var46 = field1708[arg0];
        }
        for (int var47 = 0; var47 < this.field1648; var47++) {
            int var48 = this.field1649[var47];
            int var49 = this.field1685[var47];
            int var50 = this.field1651[var47];
            if (arg0 != 0) {
                int var51 = var45 * var50 + var46 * var48 >> 16;
                var50 = var46 * var50 - var45 * var48 >> 16;
                var48 = var51;
            }
            int var52 = arg5 + var48;
            int var53 = arg6 + var49;
            int var54 = arg7 + var50;
            int var55 = arg3 * var54 + arg4 * var52 >> 16;
            int var56 = arg4 * var54 - arg3 * var52 >> 16;
            int var58 = arg2 * var53 - arg1 * var56 >> 16;
            int var59 = arg1 * var53 + arg2 * var56 >> 16;
            field1711[var47] = var59 - var12;
            if (var59 >= 50) {
                field1707[var47] = class131.field1748 * var55 / var59 + var43;
                field1664[var47] = class131.field1748 * var58 / var59 + var44;
            } else {
                field1707[var47] = -5000;
                var24 = true;
            }
            if (var26) {
                field1671[var47] = var55;
                field1692[var47] = var58;
                field1690[var47] = var59;
            }
        }
        try {
            this.method2636(var24, var32, this.field1670, arg8);
        } catch (Exception var62) {
        }
    }

    @ObfuscatedName("dw.av(ZZZJ)V")
    public final void method2636(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field1674 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field1674; var6++) {
            field1652[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field1650; var8++) {
            if (this.field1661[var8] != -2) {
                int var9 = this.field1709[var8];
                int var10 = this.field1654[var8];
                int var11 = this.field1655[var8];
                int var12 = field1707[var9];
                int var13 = field1707[var10];
                int var14 = field1707[var11];
                if (arg0 && var12 == -5000 || var13 == -5000 || var14 == -5000) {
                    int var15 = field1671[var9];
                    int var16 = field1671[var10];
                    int var17 = field1671[var11];
                    int var18 = field1692[var9];
                    int var19 = field1692[var10];
                    int var20 = field1692[var11];
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
                        int var33 = (field1711[var9] + field1711[var10] + field1711[var11]) / 3 + this.field1675;
                        field1693[var33][field1652[var33]++] = var8;
                    }
                } else {
                    if (arg1 && class129.method580(field1664[var9], field1664[var10], field1664[var11], var12, var13, var14, var7)) {
                        class129.field1726[++class129.field1722 - 1] = arg3;
                        arg1 = false;
                    }
                    if ((field1664[var11] - field1664[var10]) * (var12 - var13) - (field1664[var9] - field1664[var10]) * (var14 - var13) > 0) {
                        field1684[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field1751 && var13 <= Statics.field1751 && var14 <= Statics.field1751) {
                            field1658[var8] = false;
                        } else {
                            field1658[var8] = true;
                        }
                        int var36 = (field1711[var9] + field1711[var10] + field1711[var11]) / 3 + this.field1675;
                        field1693[var36][field1652[var36]++] = var8;
                    }
                }
            }
        }
        if (this.field1667 == null) {
            for (int var37 = this.field1674 - 1; var37 >= 0; var37--) {
                int var38 = field1652[var37];
                if (var38 > 0) {
                    int[] var39 = field1693[var37];
                    for (int var40 = 0; var40 < var38; var40++) {
                        this.method2670(var39[var40]);
                    }
                }
            }
            return;
        }
        for (int var41 = 0; var41 < 12; var41++) {
            field1706[var41] = 0;
            field1698[var41] = 0;
        }
        for (int var42 = this.field1674 - 1; var42 >= 0; var42--) {
            int var43 = field1652[var42];
            if (var43 > 0) {
                int[] var44 = field1693[var42];
                for (int var45 = 0; var45 < var43; var45++) {
                    int var46 = var44[var45];
                    byte var47 = this.field1667[var46];
                    int var48 = field1706[var47]++;
                    field1695[var47][var48] = var46;
                    if (var47 < 10) {
                        field1698[var47] += var42;
                    } else if (var47 == 10) {
                        field1696[var48] = var42;
                    } else {
                        field1697[var48] = var42;
                    }
                }
            }
        }
        int var49 = 0;
        if (field1706[1] > 0 || field1706[2] > 0) {
            var49 = (field1698[1] + field1698[2]) / (field1706[1] + field1706[2]);
        }
        int var50 = 0;
        if (field1706[3] > 0 || field1706[4] > 0) {
            var50 = (field1698[3] + field1698[4]) / (field1706[3] + field1706[4]);
        }
        int var51 = 0;
        if (field1706[6] > 0 || field1706[8] > 0) {
            var51 = (field1698[6] + field1698[8]) / (field1706[6] + field1706[8]);
        }
        int var52 = 0;
        int var53 = field1706[10];
        int[] var54 = field1695[10];
        int[] var55 = field1696;
        if (var52 == var53) {
            var52 = 0;
            var53 = field1706[11];
            var54 = field1695[11];
            var55 = field1697;
        }
        int var56;
        if (var52 < var53) {
            var56 = var55[var52];
        } else {
            var56 = -1000;
        }
        for (int var57 = 0; var57 < 10; var57++) {
            while (var57 == 0 && var56 > var49) {
                this.method2670(var54[var52++]);
                if (var52 == var53 && field1695[11] != var54) {
                    var52 = 0;
                    var53 = field1706[11];
                    var54 = field1695[11];
                    var55 = field1697;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            while (var57 == 3 && var56 > var50) {
                this.method2670(var54[var52++]);
                if (var52 == var53 && field1695[11] != var54) {
                    var52 = 0;
                    var53 = field1706[11];
                    var54 = field1695[11];
                    var55 = field1697;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            while (var57 == 5 && var56 > var51) {
                this.method2670(var54[var52++]);
                if (var52 == var53 && field1695[11] != var54) {
                    var52 = 0;
                    var53 = field1706[11];
                    var54 = field1695[11];
                    var55 = field1697;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            int var58 = field1706[var57];
            int[] var59 = field1695[var57];
            for (int var60 = 0; var60 < var58; var60++) {
                this.method2670(var59[var60]);
            }
        }
        while (var56 != -1000) {
            this.method2670(var54[var52++]);
            if (var52 == var53 && field1695[11] != var54) {
                var52 = 0;
                var54 = field1695[11];
                var53 = field1706[11];
                var55 = field1697;
            }
            if (var52 < var53) {
                var56 = var55[var52];
            } else {
                var56 = -1000;
            }
        }
    }

    @ObfuscatedName("dw.aw(I)V")
    public final void method2670(int arg0) {
        if (field1684[arg0]) {
            this.method2653(arg0);
            return;
        }
        int var2 = this.field1709[arg0];
        int var3 = this.field1654[arg0];
        int var4 = this.field1655[arg0];
        class131.field1752 = field1658[arg0];
        if (this.field1660 == null) {
            class131.field1741 = 0;
        } else {
            class131.field1741 = this.field1660[arg0] & 0xFF;
        }
        if (this.field1662 != null && this.field1662[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1704 == null || this.field1704[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1704[arg0] & 0xFF;
                var6 = this.field1665[var5];
                var7 = this.field1666[var5];
                var8 = this.field1694[var5];
            }
            if (this.field1661[arg0] == -1) {
                class131.method2754(field1664[var2], field1664[var3], field1664[var4], field1707[var2], field1707[var3], field1707[var4], this.field1656[arg0], this.field1656[arg0], this.field1656[arg0], field1671[var6], field1671[var7], field1671[var8], field1692[var6], field1692[var7], field1692[var8], field1690[var6], field1690[var7], field1690[var8], this.field1662[arg0]);
            } else {
                class131.method2754(field1664[var2], field1664[var3], field1664[var4], field1707[var2], field1707[var3], field1707[var4], this.field1656[arg0], this.field1657[arg0], this.field1661[arg0], field1671[var6], field1671[var7], field1671[var8], field1692[var6], field1692[var7], field1692[var8], field1690[var6], field1690[var7], field1690[var8], this.field1662[arg0]);
            }
        } else if (this.field1661[arg0] == -1) {
            class131.method2752(field1664[var2], field1664[var3], field1664[var4], field1707[var2], field1707[var3], field1707[var4], field1710[this.field1656[arg0]]);
        } else {
            class131.method2744(field1664[var2], field1664[var3], field1664[var4], field1707[var2], field1707[var3], field1707[var4], this.field1656[arg0], this.field1657[arg0], this.field1661[arg0]);
        }
    }

    @ObfuscatedName("dw.as(I)V")
    public final void method2653(int arg0) {
        int var2 = Statics.field1749;
        int var3 = Statics.field1750;
        int var4 = 0;
        int var5 = this.field1709[arg0];
        int var6 = this.field1654[arg0];
        int var7 = this.field1655[arg0];
        int var8 = field1690[var5];
        int var9 = field1690[var6];
        int var10 = field1690[var7];
        if (this.field1660 == null) {
            class131.field1741 = 0;
        } else {
            class131.field1741 = this.field1660[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1699[var4] = field1707[var5];
            field1700[var4] = field1664[var5];
            field1701[var4++] = this.field1656[arg0];
        } else {
            int var11 = field1671[var5];
            int var12 = field1692[var5];
            int var13 = this.field1656[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1676[var10 - var8];
                field1699[var4] = (((field1671[var7] - var11) * var14 >> 16) + var11) * class131.field1748 / 50 + var2;
                field1700[var4] = (((field1692[var7] - var12) * var14 >> 16) + var12) * class131.field1748 / 50 + var3;
                field1701[var4++] = ((this.field1661[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1676[var9 - var8];
                field1699[var4] = (((field1671[var6] - var11) * var15 >> 16) + var11) * class131.field1748 / 50 + var2;
                field1700[var4] = (((field1692[var6] - var12) * var15 >> 16) + var12) * class131.field1748 / 50 + var3;
                field1701[var4++] = ((this.field1657[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1699[var4] = field1707[var6];
            field1700[var4] = field1664[var6];
            field1701[var4++] = this.field1657[arg0];
        } else {
            int var16 = field1671[var6];
            int var17 = field1692[var6];
            int var18 = this.field1657[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1676[var8 - var9];
                field1699[var4] = (((field1671[var5] - var16) * var19 >> 16) + var16) * class131.field1748 / 50 + var2;
                field1700[var4] = (((field1692[var5] - var17) * var19 >> 16) + var17) * class131.field1748 / 50 + var3;
                field1701[var4++] = ((this.field1656[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1676[var10 - var9];
                field1699[var4] = (((field1671[var7] - var16) * var20 >> 16) + var16) * class131.field1748 / 50 + var2;
                field1700[var4] = (((field1692[var7] - var17) * var20 >> 16) + var17) * class131.field1748 / 50 + var3;
                field1701[var4++] = ((this.field1661[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1699[var4] = field1707[var7];
            field1700[var4] = field1664[var7];
            field1701[var4++] = this.field1661[arg0];
        } else {
            int var21 = field1671[var7];
            int var22 = field1692[var7];
            int var23 = this.field1661[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1676[var9 - var10];
                field1699[var4] = (((field1671[var6] - var21) * var24 >> 16) + var21) * class131.field1748 / 50 + var2;
                field1700[var4] = (((field1692[var6] - var22) * var24 >> 16) + var22) * class131.field1748 / 50 + var3;
                field1701[var4++] = ((this.field1657[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1676[var8 - var10];
                field1699[var4] = (((field1671[var5] - var21) * var25 >> 16) + var21) * class131.field1748 / 50 + var2;
                field1700[var4] = (((field1692[var5] - var22) * var25 >> 16) + var22) * class131.field1748 / 50 + var3;
                field1701[var4++] = ((this.field1656[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1699[0];
        int var27 = field1699[1];
        int var28 = field1699[2];
        int var29 = field1700[0];
        int var30 = field1700[1];
        int var31 = field1700[2];
        class131.field1752 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1751 || var27 > Statics.field1751 || var28 > Statics.field1751) {
                class131.field1752 = true;
            }
            if (this.field1662 != null && this.field1662[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1704 == null || this.field1704[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1704[arg0] & 0xFF;
                    var33 = this.field1665[var32];
                    var34 = this.field1666[var32];
                    var35 = this.field1694[var32];
                }
                if (this.field1661[arg0] == -1) {
                    class131.method2754(var29, var30, var31, var26, var27, var28, this.field1656[arg0], this.field1656[arg0], this.field1656[arg0], field1671[var33], field1671[var34], field1671[var35], field1692[var33], field1692[var34], field1692[var35], field1690[var33], field1690[var34], field1690[var35], this.field1662[arg0]);
                } else {
                    class131.method2754(var29, var30, var31, var26, var27, var28, field1701[0], field1701[1], field1701[2], field1671[var33], field1671[var34], field1671[var35], field1692[var33], field1692[var34], field1692[var35], field1690[var33], field1690[var34], field1690[var35], this.field1662[arg0]);
                }
            } else if (this.field1661[arg0] == -1) {
                class131.method2752(var29, var30, var31, var26, var27, var28, field1710[this.field1656[arg0]]);
            } else {
                class131.method2744(var29, var30, var31, var26, var27, var28, field1701[0], field1701[1], field1701[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1751 || var27 > Statics.field1751 || var28 > Statics.field1751 || field1699[3] < 0 || field1699[3] > Statics.field1751) {
            class131.field1752 = true;
        }
        if (this.field1662 != null && this.field1662[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1704 == null || this.field1704[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1704[arg0] & 0xFF;
                var37 = this.field1665[var36];
                var38 = this.field1666[var36];
                var39 = this.field1694[var36];
            }
            short var40 = this.field1662[arg0];
            if (this.field1661[arg0] == -1) {
                class131.method2754(var29, var30, var31, var26, var27, var28, this.field1656[arg0], this.field1656[arg0], this.field1656[arg0], field1671[var37], field1671[var38], field1671[var39], field1692[var37], field1692[var38], field1692[var39], field1690[var37], field1690[var38], field1690[var39], var40);
                class131.method2754(var29, var31, field1700[3], var26, var28, field1699[3], this.field1656[arg0], this.field1656[arg0], this.field1656[arg0], field1671[var37], field1671[var38], field1671[var39], field1692[var37], field1692[var38], field1692[var39], field1690[var37], field1690[var38], field1690[var39], var40);
            } else {
                class131.method2754(var29, var30, var31, var26, var27, var28, field1701[0], field1701[1], field1701[2], field1671[var37], field1671[var38], field1671[var39], field1692[var37], field1692[var38], field1692[var39], field1690[var37], field1690[var38], field1690[var39], var40);
                class131.method2754(var29, var31, field1700[3], var26, var28, field1699[3], field1701[0], field1701[2], field1701[3], field1671[var37], field1671[var38], field1671[var39], field1692[var37], field1692[var38], field1692[var39], field1690[var37], field1690[var38], field1690[var39], var40);
            }
        } else if (this.field1661[arg0] == -1) {
            int var41 = field1710[this.field1656[arg0]];
            class131.method2752(var29, var30, var31, var26, var27, var28, var41);
            class131.method2752(var29, var31, field1700[3], var26, var28, field1699[3], var41);
        } else {
            class131.method2744(var29, var30, var31, var26, var27, var28, field1701[0], field1701[1], field1701[2]);
            class131.method2744(var29, var31, field1700[3], var26, var28, field1699[3], field1701[0], field1701[2], field1701[3]);
        }
    }
}
