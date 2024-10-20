package deob;

@ObfuscatedName("df")
public class class128 extends class136 {

    @ObfuscatedName("df.u")
    public static class128 field1718 = new class128();

    @ObfuscatedName("df.f")
    public static byte[] field1661 = new byte[1];

    @ObfuscatedName("df.b")
    public static class128 field1662 = new class128();

    @ObfuscatedName("df.g")
    public static byte[] field1663 = new byte[1];

    @ObfuscatedName("df.z")
    public int field1664 = 0;

    @ObfuscatedName("df.p")
    public int[] field1665;

    @ObfuscatedName("df.h")
    public int[] field1722;

    @ObfuscatedName("df.y")
    public int[] field1667;

    @ObfuscatedName("df.w")
    public int field1702 = 0;

    @ObfuscatedName("df.i")
    public int[] field1669;

    @ObfuscatedName("df.k")
    public int[] field1670;

    @ObfuscatedName("df.x")
    public int[] field1666;

    @ObfuscatedName("df.o")
    public int[] field1693;

    @ObfuscatedName("df.e")
    public int[] field1660;

    @ObfuscatedName("df.n")
    public int[] field1712;

    @ObfuscatedName("df.r")
    public byte[] field1675;

    @ObfuscatedName("df.c")
    public byte[] field1676;

    @ObfuscatedName("df.a")
    public byte[] field1677;

    @ObfuscatedName("df.d")
    public short[] field1678;

    @ObfuscatedName("df.s")
    public byte field1679 = 0;

    @ObfuscatedName("df.t")
    public int field1680 = 0;

    @ObfuscatedName("df.m")
    public int[] field1681;

    @ObfuscatedName("df.v")
    public int[] field1706;

    @ObfuscatedName("df.q")
    public int[] field1683;

    @ObfuscatedName("df.l")
    public int[][] field1684;

    @ObfuscatedName("df.j")
    public int[][] field1717;

    @ObfuscatedName("df.af")
    public boolean field1686 = false;

    @ObfuscatedName("df.ad")
    public int field1687;

    @ObfuscatedName("df.am")
    public int field1688;

    @ObfuscatedName("df.ai")
    public int field1703;

    @ObfuscatedName("df.ag")
    public int field1690;

    @ObfuscatedName("df.ao")
    public int field1691;

    @ObfuscatedName("df.aw")
    public int field1692;

    @ObfuscatedName("df.ak")
    public int field1672;

    @ObfuscatedName("df.aa")
    public int field1694;

    @ObfuscatedName("df.ab")
    public int field1695 = -1;

    @ObfuscatedName("df.ar")
    public int field1696 = -1;

    @ObfuscatedName("df.av")
    public int field1697 = -1;

    @ObfuscatedName("df.ac")
    public static boolean[] field1699 = new boolean[4700];

    @ObfuscatedName("df.az")
    public static boolean[] field1707 = new boolean[4700];

    @ObfuscatedName("df.at")
    public static int[] field1701 = new int[4700];

    @ObfuscatedName("df.ae")
    public static int[] field1689 = new int[4700];

    @ObfuscatedName("df.aj")
    public static int[] field1682 = new int[4700];

    @ObfuscatedName("df.ap")
    public static int[] field1704 = new int[4700];

    @ObfuscatedName("df.an")
    public static int[] field1700 = new int[4700];

    @ObfuscatedName("df.al")
    public static int[] field1674 = new int[4700];

    @ObfuscatedName("df.ax")
    public static int[] field1685 = new int[1600];

    @ObfuscatedName("df.au")
    public static int[][] field1709 = new int[1600][512];

    @ObfuscatedName("df.as")
    public static int[] field1710 = new int[12];

    @ObfuscatedName("df.ah")
    public static int[][] field1711 = new int[12][2000];

    @ObfuscatedName("df.bi")
    public static int[] field1725 = new int[2000];

    @ObfuscatedName("df.bo")
    public static int[] field1713 = new int[2000];

    @ObfuscatedName("df.bx")
    public static int[] field1714 = new int[12];

    @ObfuscatedName("df.bu")
    public static int[] field1715 = new int[10];

    @ObfuscatedName("df.bd")
    public static int[] field1716 = new int[10];

    @ObfuscatedName("df.bn")
    public static int[] field1708 = new int[10];

    @ObfuscatedName("df.bf")
    public static boolean field1721 = true;

    @ObfuscatedName("df.ba")
    public static int[] field1724 = class131.field1773;

    @ObfuscatedName("df.bb")
    public static int[] field1668 = class131.field1774;

    @ObfuscatedName("df.bg")
    public static int[] field1726 = class131.field1759;

    @ObfuscatedName("df.bw")
    public static int[] field1727 = class131.field1772;

    public class128() {
    }

    public class128(class128[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1664 = 0;
        this.field1702 = 0;
        this.field1680 = 0;
        this.field1679 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class128 var8 = arg0[var7];
            if (var8 != null) {
                this.field1664 += var8.field1664;
                this.field1702 += var8.field1702;
                this.field1680 += var8.field1680;
                if (var8.field1675 == null) {
                    if (this.field1679 == -1) {
                        this.field1679 = var8.field1679;
                    }
                    if (this.field1679 != var8.field1679) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1676 != null;
                var5 |= var8.field1678 != null;
                var6 |= var8.field1677 != null;
            }
        }
        this.field1665 = new int[this.field1664];
        this.field1722 = new int[this.field1664];
        this.field1667 = new int[this.field1664];
        this.field1669 = new int[this.field1702];
        this.field1670 = new int[this.field1702];
        this.field1666 = new int[this.field1702];
        this.field1693 = new int[this.field1702];
        this.field1660 = new int[this.field1702];
        this.field1712 = new int[this.field1702];
        if (var3) {
            this.field1675 = new byte[this.field1702];
        }
        if (var4) {
            this.field1676 = new byte[this.field1702];
        }
        if (var5) {
            this.field1678 = new short[this.field1702];
        }
        if (var6) {
            this.field1677 = new byte[this.field1702];
        }
        if (this.field1680 > 0) {
            this.field1681 = new int[this.field1680];
            this.field1706 = new int[this.field1680];
            this.field1683 = new int[this.field1680];
        }
        this.field1664 = 0;
        this.field1702 = 0;
        this.field1680 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class128 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1702; var11++) {
                    this.field1669[this.field1702] = var10.field1669[var11] + this.field1664;
                    this.field1670[this.field1702] = var10.field1670[var11] + this.field1664;
                    this.field1666[this.field1702] = var10.field1666[var11] + this.field1664;
                    this.field1693[this.field1702] = var10.field1693[var11];
                    this.field1660[this.field1702] = var10.field1660[var11];
                    this.field1712[this.field1702] = var10.field1712[var11];
                    if (var3) {
                        if (var10.field1675 == null) {
                            this.field1675[this.field1702] = var10.field1679;
                        } else {
                            this.field1675[this.field1702] = var10.field1675[var11];
                        }
                    }
                    if (var4 && var10.field1676 != null) {
                        this.field1676[this.field1702] = var10.field1676[var11];
                    }
                    if (var5) {
                        if (var10.field1678 == null) {
                            this.field1678[this.field1702] = -1;
                        } else {
                            this.field1678[this.field1702] = var10.field1678[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1677 == null || var10.field1677[var11] == -1) {
                            this.field1677[this.field1702] = -1;
                        } else {
                            this.field1677[this.field1702] = (byte) (var10.field1677[var11] + this.field1680);
                        }
                    }
                    this.field1702++;
                }
                for (int var12 = 0; var12 < var10.field1680; var12++) {
                    this.field1681[this.field1680] = var10.field1681[var12] + this.field1664;
                    this.field1706[this.field1680] = var10.field1706[var12] + this.field1664;
                    this.field1683[this.field1680] = var10.field1683[var12] + this.field1664;
                    this.field1680++;
                }
                for (int var13 = 0; var13 < var10.field1664; var13++) {
                    this.field1665[this.field1664] = var10.field1665[var13];
                    this.field1722[this.field1664] = var10.field1722[var13];
                    this.field1667[this.field1664] = var10.field1667[var13];
                    this.field1664++;
                }
            }
        }
    }

    @ObfuscatedName("df.u([[IIIIZI)Ldf;")
    public class128 method2711(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2640();
        int var7 = arg1 - this.field1703;
        int var8 = this.field1703 + arg1;
        int var9 = arg3 - this.field1703;
        int var10 = this.field1703 + arg3;
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
            var15.field1664 = this.field1664;
            var15.field1702 = this.field1702;
            var15.field1680 = this.field1680;
            var15.field1665 = this.field1665;
            var15.field1667 = this.field1667;
            var15.field1669 = this.field1669;
            var15.field1670 = this.field1670;
            var15.field1666 = this.field1666;
            var15.field1693 = this.field1693;
            var15.field1660 = this.field1660;
            var15.field1712 = this.field1712;
            var15.field1675 = this.field1675;
            var15.field1676 = this.field1676;
            var15.field1677 = this.field1677;
            var15.field1678 = this.field1678;
            var15.field1679 = this.field1679;
            var15.field1681 = this.field1681;
            var15.field1706 = this.field1706;
            var15.field1683 = this.field1683;
            var15.field1684 = this.field1684;
            var15.field1717 = this.field1717;
            var15.field1686 = this.field1686;
            var15.field1722 = new int[var15.field1664];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1664; var16++) {
                int var17 = this.field1665[var16] + arg1;
                int var18 = this.field1667[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1722[var16] = this.field1722[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1664; var26++) {
                int var27 = (-this.field1722[var26] << 16) / this.field1863;
                if (var27 < arg5) {
                    int var28 = this.field1665[var26] + arg1;
                    int var29 = this.field1667[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1722[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1722[var26];
                }
            }
        }
        var15.method2683();
        return var15;
    }

    @ObfuscatedName("df.f(Z)Ldf;")
    public class128 method2636(boolean arg0) {
        if (!arg0 && field1661.length < this.field1702) {
            field1661 = new byte[this.field1702 + 100];
        }
        return this.method2638(arg0, field1718, field1661);
    }

    @ObfuscatedName("df.b(Z)Ldf;")
    public class128 method2637(boolean arg0) {
        if (!arg0 && field1663.length < this.field1702) {
            field1663 = new byte[this.field1702 + 100];
        }
        return this.method2638(arg0, field1662, field1663);
    }

    @ObfuscatedName("df.g(ZLdf;[B)Ldf;")
    public class128 method2638(boolean arg0, class128 arg1, byte[] arg2) {
        arg1.field1664 = this.field1664;
        arg1.field1702 = this.field1702;
        arg1.field1680 = this.field1680;
        if (arg1.field1665 == null || arg1.field1665.length < this.field1664) {
            arg1.field1665 = new int[this.field1664 + 100];
            arg1.field1722 = new int[this.field1664 + 100];
            arg1.field1667 = new int[this.field1664 + 100];
        }
        for (int var4 = 0; var4 < this.field1664; var4++) {
            arg1.field1665[var4] = this.field1665[var4];
            arg1.field1722[var4] = this.field1722[var4];
            arg1.field1667[var4] = this.field1667[var4];
        }
        if (arg0) {
            arg1.field1676 = this.field1676;
        } else {
            arg1.field1676 = arg2;
            if (this.field1676 == null) {
                for (int var5 = 0; var5 < this.field1702; var5++) {
                    arg1.field1676[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1702; var6++) {
                    arg1.field1676[var6] = this.field1676[var6];
                }
            }
        }
        arg1.field1669 = this.field1669;
        arg1.field1670 = this.field1670;
        arg1.field1666 = this.field1666;
        arg1.field1693 = this.field1693;
        arg1.field1660 = this.field1660;
        arg1.field1712 = this.field1712;
        arg1.field1675 = this.field1675;
        arg1.field1677 = this.field1677;
        arg1.field1678 = this.field1678;
        arg1.field1679 = this.field1679;
        arg1.field1681 = this.field1681;
        arg1.field1706 = this.field1706;
        arg1.field1683 = this.field1683;
        arg1.field1684 = this.field1684;
        arg1.field1717 = this.field1717;
        arg1.field1686 = this.field1686;
        arg1.method2683();
        return arg1;
    }

    @ObfuscatedName("df.z(I)V")
    public void method2639(int arg0) {
        if (this.field1695 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1668[arg0];
        int var9 = field1724[arg0];
        for (int var10 = 0; var10 < this.field1664; var10++) {
            int var11 = class131.method2774(this.field1665[var10], this.field1667[var10], var8, var9);
            int var12 = this.field1722[var10];
            int var13 = class131.method2816(this.field1665[var10], this.field1667[var10], var8, var9);
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
        this.field1692 = (var2 + var5) / 2;
        this.field1672 = (var3 + var6) / 2;
        this.field1694 = (var4 + var7) / 2;
        this.field1695 = (var5 - var2 + 1) / 2;
        this.field1696 = (var6 - var3 + 1) / 2;
        this.field1697 = (var7 - var4 + 1) / 2;
        if (this.field1695 < 32) {
            this.field1695 = 32;
        }
        if (this.field1697 < 32) {
            this.field1697 = 32;
        }
        if (this.field1686) {
            this.field1695 += 8;
            this.field1697 += 8;
        }
    }

    @ObfuscatedName("df.p()V")
    public void method2640() {
        if (this.field1687 == 1) {
            return;
        }
        this.field1687 = 1;
        this.field1863 = 0;
        this.field1688 = 0;
        this.field1703 = 0;
        for (int var1 = 0; var1 < this.field1664; var1++) {
            int var2 = this.field1665[var1];
            int var3 = this.field1722[var1];
            int var4 = this.field1667[var1];
            if (-var3 > this.field1863) {
                this.field1863 = -var3;
            }
            if (var3 > this.field1688) {
                this.field1688 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1703) {
                this.field1703 = var5;
            }
        }
        this.field1703 = (int) (Math.sqrt((double) this.field1703) + 0.99D);
        this.field1691 = (int) (Math.sqrt((double) (this.field1863 * this.field1863 + this.field1703 * this.field1703)) + 0.99D);
        this.field1690 = this.field1691 + (int) (Math.sqrt((double) (this.field1703 * this.field1703 + this.field1688 * this.field1688)) + 0.99D);
    }

    @ObfuscatedName("df.h()V")
    public void method2695() {
        if (this.field1687 == 2) {
            return;
        }
        this.field1687 = 2;
        this.field1703 = 0;
        for (int var1 = 0; var1 < this.field1664; var1++) {
            int var2 = this.field1665[var1];
            int var3 = this.field1722[var1];
            int var4 = this.field1667[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1703) {
                this.field1703 = var5;
            }
        }
        this.field1703 = (int) (Math.sqrt((double) this.field1703) + 0.99D);
        this.field1691 = this.field1703;
        this.field1690 = this.field1703 + this.field1703;
    }

    @ObfuscatedName("df.y()I")
    public int method2642() {
        this.method2640();
        return this.field1703;
    }

    @ObfuscatedName("df.i()V")
    public void method2683() {
        this.field1687 = 0;
        this.field1695 = -1;
    }

    @ObfuscatedName("df.k(Ler;I)V")
    public void method2644(class139 arg0, int arg1) {
        if (this.field1684 == null || arg1 == -1) {
            return;
        }
        class126 var3 = arg0.field1884[arg1];
        class133 var4 = var3.field1630;
        Statics.field1671 = 0;
        Statics.field1719 = 0;
        Statics.field1720 = 0;
        for (int var5 = 0; var5 < var3.field1631; var5++) {
            int var6 = var3.field1626[var5];
            this.method2646(var4.field1787[var6], var4.field1788[var6], var3.field1633[var5], var3.field1634[var5], var3.field1636[var5]);
        }
        this.method2683();
    }

    @ObfuscatedName("df.x(Ler;ILer;I[I)V")
    public void method2673(class139 arg0, int arg1, class139 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2644(arg0, arg1);
            return;
        }
        class126 var6 = arg0.field1884[arg1];
        class126 var7 = arg2.field1884[arg3];
        class133 var8 = var6.field1630;
        Statics.field1671 = 0;
        Statics.field1719 = 0;
        Statics.field1720 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1631; var11++) {
            int var12 = var6.field1626[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1787[var12] == 0) {
                this.method2646(var8.field1787[var12], var8.field1788[var12], var6.field1633[var11], var6.field1634[var11], var6.field1636[var11]);
            }
        }
        Statics.field1671 = 0;
        Statics.field1719 = 0;
        Statics.field1720 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1631; var15++) {
            int var16 = var7.field1626[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1787[var16] == 0) {
                this.method2646(var8.field1787[var16], var8.field1788[var16], var7.field1633[var15], var7.field1634[var15], var7.field1636[var15]);
            }
        }
        this.method2683();
    }

    @ObfuscatedName("df.o(I[IIII)V")
    public void method2646(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1671 = 0;
            Statics.field1719 = 0;
            Statics.field1720 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1684.length) {
                    int[] var10 = this.field1684[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1671 += this.field1665[var12];
                        Statics.field1719 += this.field1722[var12];
                        Statics.field1720 += this.field1667[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1671 = Statics.field1671 / var7 + arg2;
                Statics.field1719 = Statics.field1719 / var7 + arg3;
                Statics.field1720 = Statics.field1720 / var7 + arg4;
            } else {
                Statics.field1671 = arg2;
                Statics.field1719 = arg3;
                Statics.field1720 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1684.length) {
                    int[] var15 = this.field1684[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1665[var17] += arg2;
                        this.field1722[var17] += arg3;
                        this.field1667[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1684.length) {
                    int[] var20 = this.field1684[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1665[var22] -= Statics.field1671;
                        this.field1722[var22] -= Statics.field1719;
                        this.field1667[var22] -= Statics.field1720;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1724[var25];
                            int var27 = field1668[var25];
                            int var28 = this.field1722[var22] * var26 + this.field1665[var22] * var27 >> 16;
                            this.field1722[var22] = this.field1722[var22] * var27 - this.field1665[var22] * var26 >> 16;
                            this.field1665[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1724[var23];
                            int var30 = field1668[var23];
                            int var31 = this.field1722[var22] * var30 - this.field1667[var22] * var29 >> 16;
                            this.field1667[var22] = this.field1722[var22] * var29 + this.field1667[var22] * var30 >> 16;
                            this.field1722[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1724[var24];
                            int var33 = field1668[var24];
                            int var34 = this.field1667[var22] * var32 + this.field1665[var22] * var33 >> 16;
                            this.field1667[var22] = this.field1667[var22] * var33 - this.field1665[var22] * var32 >> 16;
                            this.field1665[var22] = var34;
                        }
                        this.field1665[var22] += Statics.field1671;
                        this.field1722[var22] += Statics.field1719;
                        this.field1667[var22] += Statics.field1720;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1684.length) {
                    int[] var37 = this.field1684[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1665[var39] -= Statics.field1671;
                        this.field1722[var39] -= Statics.field1719;
                        this.field1667[var39] -= Statics.field1720;
                        this.field1665[var39] = this.field1665[var39] * arg2 / 128;
                        this.field1722[var39] = this.field1722[var39] * arg3 / 128;
                        this.field1667[var39] = this.field1667[var39] * arg4 / 128;
                        this.field1665[var39] += Statics.field1671;
                        this.field1722[var39] += Statics.field1719;
                        this.field1667[var39] += Statics.field1720;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1717 != null && this.field1676 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1717.length) {
                    int[] var42 = this.field1717[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1676[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1676[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("df.e()V")
    public void method2643() {
        for (int var1 = 0; var1 < this.field1664; var1++) {
            int var2 = this.field1665[var1];
            this.field1665[var1] = this.field1667[var1];
            this.field1667[var1] = -var2;
        }
        this.method2683();
    }

    @ObfuscatedName("df.n()V")
    public void method2648() {
        for (int var1 = 0; var1 < this.field1664; var1++) {
            this.field1665[var1] = -this.field1665[var1];
            this.field1667[var1] = -this.field1667[var1];
        }
        this.method2683();
    }

    @ObfuscatedName("df.c()V")
    public void method2649() {
        for (int var1 = 0; var1 < this.field1664; var1++) {
            int var2 = this.field1667[var1];
            this.field1667[var1] = this.field1665[var1];
            this.field1665[var1] = -var2;
        }
        this.method2683();
    }

    @ObfuscatedName("df.s(I)V")
    public void method2650(int arg0) {
        int var2 = field1724[arg0];
        int var3 = field1668[arg0];
        for (int var4 = 0; var4 < this.field1664; var4++) {
            int var5 = this.field1722[var4] * var3 - this.field1667[var4] * var2 >> 16;
            this.field1667[var4] = this.field1722[var4] * var2 + this.field1667[var4] * var3 >> 16;
            this.field1722[var4] = var5;
        }
        this.method2683();
    }

    @ObfuscatedName("df.t(III)V")
    public void method2651(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1664; var4++) {
            this.field1665[var4] += arg0;
            this.field1722[var4] += arg1;
            this.field1667[var4] += arg2;
        }
        this.method2683();
    }

    @ObfuscatedName("df.m(III)V")
    public void method2652(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1664; var4++) {
            this.field1665[var4] = this.field1665[var4] * arg0 / 128;
            this.field1722[var4] = this.field1722[var4] * arg1 / 128;
            this.field1667[var4] = this.field1667[var4] * arg2 / 128;
        }
        this.method2683();
    }

    @ObfuscatedName("df.v(IIIIIII)V")
    public final void method2693(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1685[0] = -1;
        if (this.field1687 != 2 && this.field1687 != 1) {
            this.method2695();
        }
        int var8 = Statics.field1760;
        int var9 = Statics.field1755;
        int var10 = field1724[arg0];
        int var11 = field1668[arg0];
        int var12 = field1724[arg1];
        int var13 = field1668[arg1];
        int var14 = field1724[arg2];
        int var15 = field1668[arg2];
        int var16 = field1724[arg3];
        int var17 = field1668[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1664; var19++) {
            int var20 = this.field1665[var19];
            int var21 = this.field1722[var19];
            int var22 = this.field1667[var19];
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
            field1701[var19] = class131.field1748 * var26 / var30 + var8;
            field1689[var19] = class131.field1748 * var29 / var30 + var9;
            if (this.field1680 > 0) {
                field1704[var19] = var26;
                field1700[var19] = var29;
                field1674[var19] = var30;
            }
        }
        try {
            this.method2655(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("df.q(IIIIIIII)V")
    public final void method2653(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1685[0] = -1;
        if (this.field1687 != 2 && this.field1687 != 1) {
            this.method2695();
        }
        int var9 = Statics.field1760;
        int var10 = Statics.field1755;
        int var11 = field1724[arg0];
        int var12 = field1668[arg0];
        int var13 = field1724[arg1];
        int var14 = field1668[arg1];
        int var15 = field1724[arg2];
        int var16 = field1668[arg2];
        int var17 = field1724[arg3];
        int var18 = field1668[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1664; var20++) {
            int var21 = this.field1665[var20];
            int var22 = this.field1722[var20];
            int var23 = this.field1667[var20];
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
            field1701[var20] = class131.field1748 * var27 / arg7 + var9;
            field1689[var20] = class131.field1748 * var30 / arg7 + var10;
            if (this.field1680 > 0) {
                field1704[var20] = var27;
                field1700[var20] = var30;
                field1674[var20] = var31;
            }
        }
        try {
            this.method2655(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("df.ch(IIIIIIIIJ)V")
    public void method2647(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1685[0] = -1;
        if (this.field1687 != 1) {
            this.method2640();
        }
        this.method2639(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field1703 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field1703) * class131.field1748;
        if (var16 / var14 >= Statics.field1768) {
            return;
        }
        int var17 = (this.field1703 + var15) * class131.field1748;
        if (var17 / var14 <= Statics.field1756) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field1703 * arg1 >> 16;
        int var20 = (var18 + var19) * class131.field1748;
        if (var20 / var14 <= Statics.field1766) {
            return;
        }
        int var21 = (this.field1863 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class131.field1748;
        if (var22 / var14 >= Statics.field1767) {
            return;
        }
        int var23 = (this.field1863 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field1680 > 0;
        int var27 = class129.field1731;
        int var29 = class129.method3396();
        boolean var30 = class129.field1739;
        boolean var32 = class129.method3051(arg8);
        boolean var33 = false;
        if (var32 && var30) {
            boolean var34 = false;
            if (field1721) {
                var34 = class129.method1789(this, arg5, arg6, arg7);
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
                int var40 = var27 - Statics.field1760;
                int var41 = var29 - Statics.field1755;
                if (var40 > var36 && var40 < var37 && var41 > var38 && var41 < var39) {
                    var34 = true;
                }
            }
            if (var34) {
                if (this.field1686) {
                    class129.field1737[++class129.field1736 - 1] = arg8;
                } else {
                    var33 = true;
                }
            }
        }
        int var44 = Statics.field1760;
        int var45 = Statics.field1755;
        int var46 = 0;
        int var47 = 0;
        if (arg0 != 0) {
            var46 = field1724[arg0];
            var47 = field1668[arg0];
        }
        for (int var48 = 0; var48 < this.field1664; var48++) {
            int var49 = this.field1665[var48];
            int var50 = this.field1722[var48];
            int var51 = this.field1667[var48];
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
                field1701[var48] = class131.field1748 * var56 / var60 + var44;
                field1689[var48] = class131.field1748 * var59 / var60 + var45;
            } else {
                field1701[var48] = -5000;
                var24 = true;
            }
            if (var26) {
                field1704[var48] = var56;
                field1700[var48] = var59;
                field1674[var48] = var60;
            }
        }
        try {
            this.method2655(var24, var33, this.field1686, arg8);
        } catch (Exception var63) {
        }
    }

    @ObfuscatedName("df.l(ZZZJ)V")
    public final void method2655(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field1690 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field1690; var6++) {
            field1685[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field1702; var8++) {
            if (this.field1712[var8] != -2) {
                int var9 = this.field1669[var8];
                int var10 = this.field1670[var8];
                int var11 = this.field1666[var8];
                int var12 = field1701[var9];
                int var13 = field1701[var10];
                int var14 = field1701[var11];
                if (arg0 && var12 == -5000 || var13 == -5000 || var14 == -5000) {
                    int var15 = field1704[var9];
                    int var16 = field1704[var10];
                    int var17 = field1704[var11];
                    int var18 = field1700[var9];
                    int var19 = field1700[var10];
                    int var20 = field1700[var11];
                    int var21 = field1674[var9];
                    int var22 = field1674[var10];
                    int var23 = field1674[var11];
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
                        field1707[var8] = true;
                        int var33 = (field1682[var9] + field1682[var10] + field1682[var11]) / 3 + this.field1691;
                        field1709[var33][field1685[var33]++] = var8;
                    }
                } else {
                    if (arg1) {
                        int var34 = field1689[var9];
                        int var35 = field1689[var10];
                        int var36 = field1689[var11];
                        int var37 = class129.field1734 + var7;
                        boolean var38;
                        if (var37 < var34 && var37 < var35 && var37 < var36) {
                            var38 = false;
                        } else {
                            int var39 = class129.field1734 - var7;
                            if (var39 > var34 && var39 > var35 && var39 > var36) {
                                var38 = false;
                            } else {
                                int var40 = class129.field1731 + var7;
                                if (var40 < var12 && var40 < var13 && var40 < var14) {
                                    var38 = false;
                                } else {
                                    int var41 = class129.field1731 - var7;
                                    if (var41 > var12 && var41 > var13 && var41 > var14) {
                                        var38 = false;
                                    } else {
                                        var38 = true;
                                    }
                                }
                            }
                        }
                        if (var38) {
                            class129.field1737[++class129.field1736 - 1] = arg3;
                            arg1 = false;
                        }
                    }
                    if ((field1689[var11] - field1689[var10]) * (var12 - var13) - (field1689[var9] - field1689[var10]) * (var14 - var13) > 0) {
                        field1707[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field1762 && var13 <= Statics.field1762 && var14 <= Statics.field1762) {
                            field1699[var8] = false;
                        } else {
                            field1699[var8] = true;
                        }
                        int var44 = (field1682[var9] + field1682[var10] + field1682[var11]) / 3 + this.field1691;
                        field1709[var44][field1685[var44]++] = var8;
                    }
                }
            }
        }
        if (this.field1675 == null) {
            for (int var45 = this.field1690 - 1; var45 >= 0; var45--) {
                int var46 = field1685[var45];
                if (var46 > 0) {
                    int[] var47 = field1709[var45];
                    for (int var48 = 0; var48 < var46; var48++) {
                        this.method2707(var47[var48]);
                    }
                }
            }
            return;
        }
        for (int var49 = 0; var49 < 12; var49++) {
            field1710[var49] = 0;
            field1714[var49] = 0;
        }
        for (int var50 = this.field1690 - 1; var50 >= 0; var50--) {
            int var51 = field1685[var50];
            if (var51 > 0) {
                int[] var52 = field1709[var50];
                for (int var53 = 0; var53 < var51; var53++) {
                    int var54 = var52[var53];
                    byte var55 = this.field1675[var54];
                    int var56 = field1710[var55]++;
                    field1711[var55][var56] = var54;
                    if (var55 < 10) {
                        field1714[var55] += var50;
                    } else if (var55 == 10) {
                        field1725[var56] = var50;
                    } else {
                        field1713[var56] = var50;
                    }
                }
            }
        }
        int var57 = 0;
        if (field1710[1] > 0 || field1710[2] > 0) {
            var57 = (field1714[1] + field1714[2]) / (field1710[1] + field1710[2]);
        }
        int var58 = 0;
        if (field1710[3] > 0 || field1710[4] > 0) {
            var58 = (field1714[3] + field1714[4]) / (field1710[3] + field1710[4]);
        }
        int var59 = 0;
        if (field1710[6] > 0 || field1710[8] > 0) {
            var59 = (field1714[6] + field1714[8]) / (field1710[6] + field1710[8]);
        }
        int var60 = 0;
        int var61 = field1710[10];
        int[] var62 = field1711[10];
        int[] var63 = field1725;
        if (var60 == var61) {
            var60 = 0;
            var61 = field1710[11];
            var62 = field1711[11];
            var63 = field1713;
        }
        int var64;
        if (var60 < var61) {
            var64 = var63[var60];
        } else {
            var64 = -1000;
        }
        for (int var65 = 0; var65 < 10; var65++) {
            while (var65 == 0 && var64 > var57) {
                this.method2707(var62[var60++]);
                if (var60 == var61 && field1711[11] != var62) {
                    var60 = 0;
                    var61 = field1710[11];
                    var62 = field1711[11];
                    var63 = field1713;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            while (var65 == 3 && var64 > var58) {
                this.method2707(var62[var60++]);
                if (var60 == var61 && field1711[11] != var62) {
                    var60 = 0;
                    var61 = field1710[11];
                    var62 = field1711[11];
                    var63 = field1713;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            while (var65 == 5 && var64 > var59) {
                this.method2707(var62[var60++]);
                if (var60 == var61 && field1711[11] != var62) {
                    var60 = 0;
                    var61 = field1710[11];
                    var62 = field1711[11];
                    var63 = field1713;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            int var66 = field1710[var65];
            int[] var67 = field1711[var65];
            for (int var68 = 0; var68 < var66; var68++) {
                this.method2707(var67[var68]);
            }
        }
        while (var64 != -1000) {
            this.method2707(var62[var60++]);
            if (var60 == var61 && field1711[11] != var62) {
                var60 = 0;
                var62 = field1711[11];
                var61 = field1710[11];
                var63 = field1713;
            }
            if (var60 < var61) {
                var64 = var63[var60];
            } else {
                var64 = -1000;
            }
        }
    }

    @ObfuscatedName("df.j(I)V")
    public final void method2707(int arg0) {
        if (field1707[arg0]) {
            this.method2660(arg0);
            return;
        }
        int var2 = this.field1669[arg0];
        int var3 = this.field1670[arg0];
        int var4 = this.field1666[arg0];
        class131.field1758 = field1699[arg0];
        if (this.field1676 == null) {
            class131.field1752 = 0;
        } else {
            class131.field1752 = this.field1676[arg0] & 0xFF;
        }
        if (this.field1678 != null && this.field1678[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1677 == null || this.field1677[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1677[arg0] & 0xFF;
                var6 = this.field1681[var5];
                var7 = this.field1706[var5];
                var8 = this.field1683[var5];
            }
            if (this.field1712[arg0] == -1) {
                class131.method2769(field1689[var2], field1689[var3], field1689[var4], field1701[var2], field1701[var3], field1701[var4], this.field1693[arg0], this.field1693[arg0], this.field1693[arg0], field1704[var6], field1704[var7], field1704[var8], field1700[var6], field1700[var7], field1700[var8], field1674[var6], field1674[var7], field1674[var8], this.field1678[arg0]);
            } else {
                class131.method2769(field1689[var2], field1689[var3], field1689[var4], field1701[var2], field1701[var3], field1701[var4], this.field1693[arg0], this.field1660[arg0], this.field1712[arg0], field1704[var6], field1704[var7], field1704[var8], field1700[var6], field1700[var7], field1700[var8], field1674[var6], field1674[var7], field1674[var8], this.field1678[arg0]);
            }
        } else if (this.field1712[arg0] == -1) {
            class131.method2790(field1689[var2], field1689[var3], field1689[var4], field1701[var2], field1701[var3], field1701[var4], field1726[this.field1693[arg0]]);
        } else {
            class131.method2765(field1689[var2], field1689[var3], field1689[var4], field1701[var2], field1701[var3], field1701[var4], this.field1693[arg0], this.field1660[arg0], this.field1712[arg0]);
        }
    }

    @ObfuscatedName("df.ad(I)V")
    public final void method2660(int arg0) {
        int var2 = Statics.field1760;
        int var3 = Statics.field1755;
        int var4 = 0;
        int var5 = this.field1669[arg0];
        int var6 = this.field1670[arg0];
        int var7 = this.field1666[arg0];
        int var8 = field1674[var5];
        int var9 = field1674[var6];
        int var10 = field1674[var7];
        if (this.field1676 == null) {
            class131.field1752 = 0;
        } else {
            class131.field1752 = this.field1676[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1715[var4] = field1701[var5];
            field1716[var4] = field1689[var5];
            field1708[var4++] = this.field1693[arg0];
        } else {
            int var11 = field1704[var5];
            int var12 = field1700[var5];
            int var13 = this.field1693[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1727[var10 - var8];
                field1715[var4] = (((field1704[var7] - var11) * var14 >> 16) + var11) * class131.field1748 / 50 + var2;
                field1716[var4] = (((field1700[var7] - var12) * var14 >> 16) + var12) * class131.field1748 / 50 + var3;
                field1708[var4++] = ((this.field1712[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1727[var9 - var8];
                field1715[var4] = (((field1704[var6] - var11) * var15 >> 16) + var11) * class131.field1748 / 50 + var2;
                field1716[var4] = (((field1700[var6] - var12) * var15 >> 16) + var12) * class131.field1748 / 50 + var3;
                field1708[var4++] = ((this.field1660[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1715[var4] = field1701[var6];
            field1716[var4] = field1689[var6];
            field1708[var4++] = this.field1660[arg0];
        } else {
            int var16 = field1704[var6];
            int var17 = field1700[var6];
            int var18 = this.field1660[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1727[var8 - var9];
                field1715[var4] = (((field1704[var5] - var16) * var19 >> 16) + var16) * class131.field1748 / 50 + var2;
                field1716[var4] = (((field1700[var5] - var17) * var19 >> 16) + var17) * class131.field1748 / 50 + var3;
                field1708[var4++] = ((this.field1693[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1727[var10 - var9];
                field1715[var4] = (((field1704[var7] - var16) * var20 >> 16) + var16) * class131.field1748 / 50 + var2;
                field1716[var4] = (((field1700[var7] - var17) * var20 >> 16) + var17) * class131.field1748 / 50 + var3;
                field1708[var4++] = ((this.field1712[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1715[var4] = field1701[var7];
            field1716[var4] = field1689[var7];
            field1708[var4++] = this.field1712[arg0];
        } else {
            int var21 = field1704[var7];
            int var22 = field1700[var7];
            int var23 = this.field1712[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1727[var9 - var10];
                field1715[var4] = (((field1704[var6] - var21) * var24 >> 16) + var21) * class131.field1748 / 50 + var2;
                field1716[var4] = (((field1700[var6] - var22) * var24 >> 16) + var22) * class131.field1748 / 50 + var3;
                field1708[var4++] = ((this.field1660[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1727[var8 - var10];
                field1715[var4] = (((field1704[var5] - var21) * var25 >> 16) + var21) * class131.field1748 / 50 + var2;
                field1716[var4] = (((field1700[var5] - var22) * var25 >> 16) + var22) * class131.field1748 / 50 + var3;
                field1708[var4++] = ((this.field1693[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1715[0];
        int var27 = field1715[1];
        int var28 = field1715[2];
        int var29 = field1716[0];
        int var30 = field1716[1];
        int var31 = field1716[2];
        class131.field1758 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1762 || var27 > Statics.field1762 || var28 > Statics.field1762) {
                class131.field1758 = true;
            }
            if (this.field1678 != null && this.field1678[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1677 == null || this.field1677[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1677[arg0] & 0xFF;
                    var33 = this.field1681[var32];
                    var34 = this.field1706[var32];
                    var35 = this.field1683[var32];
                }
                if (this.field1712[arg0] == -1) {
                    class131.method2769(var29, var30, var31, var26, var27, var28, this.field1693[arg0], this.field1693[arg0], this.field1693[arg0], field1704[var33], field1704[var34], field1704[var35], field1700[var33], field1700[var34], field1700[var35], field1674[var33], field1674[var34], field1674[var35], this.field1678[arg0]);
                } else {
                    class131.method2769(var29, var30, var31, var26, var27, var28, field1708[0], field1708[1], field1708[2], field1704[var33], field1704[var34], field1704[var35], field1700[var33], field1700[var34], field1700[var35], field1674[var33], field1674[var34], field1674[var35], this.field1678[arg0]);
                }
            } else if (this.field1712[arg0] == -1) {
                class131.method2790(var29, var30, var31, var26, var27, var28, field1726[this.field1693[arg0]]);
            } else {
                class131.method2765(var29, var30, var31, var26, var27, var28, field1708[0], field1708[1], field1708[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1762 || var27 > Statics.field1762 || var28 > Statics.field1762 || field1715[3] < 0 || field1715[3] > Statics.field1762) {
            class131.field1758 = true;
        }
        if (this.field1678 != null && this.field1678[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1677 == null || this.field1677[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1677[arg0] & 0xFF;
                var37 = this.field1681[var36];
                var38 = this.field1706[var36];
                var39 = this.field1683[var36];
            }
            short var40 = this.field1678[arg0];
            if (this.field1712[arg0] == -1) {
                class131.method2769(var29, var30, var31, var26, var27, var28, this.field1693[arg0], this.field1693[arg0], this.field1693[arg0], field1704[var37], field1704[var38], field1704[var39], field1700[var37], field1700[var38], field1700[var39], field1674[var37], field1674[var38], field1674[var39], var40);
                class131.method2769(var29, var31, field1716[3], var26, var28, field1715[3], this.field1693[arg0], this.field1693[arg0], this.field1693[arg0], field1704[var37], field1704[var38], field1704[var39], field1700[var37], field1700[var38], field1700[var39], field1674[var37], field1674[var38], field1674[var39], var40);
            } else {
                class131.method2769(var29, var30, var31, var26, var27, var28, field1708[0], field1708[1], field1708[2], field1704[var37], field1704[var38], field1704[var39], field1700[var37], field1700[var38], field1700[var39], field1674[var37], field1674[var38], field1674[var39], var40);
                class131.method2769(var29, var31, field1716[3], var26, var28, field1715[3], field1708[0], field1708[2], field1708[3], field1704[var37], field1704[var38], field1704[var39], field1700[var37], field1700[var38], field1700[var39], field1674[var37], field1674[var38], field1674[var39], var40);
            }
        } else if (this.field1712[arg0] == -1) {
            int var41 = field1726[this.field1693[arg0]];
            class131.method2790(var29, var30, var31, var26, var27, var28, var41);
            class131.method2790(var29, var31, field1716[3], var26, var28, field1715[3], var41);
        } else {
            class131.method2765(var29, var30, var31, var26, var27, var28, field1708[0], field1708[1], field1708[2]);
            class131.method2765(var29, var31, field1716[3], var26, var28, field1715[3], field1708[0], field1708[2], field1708[3]);
        }
    }
}
