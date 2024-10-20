package deob;

@ObfuscatedName("cy")
public class class100 extends class80 {

    @ObfuscatedName("cy.e")
    public static class100 field1720 = new class100();

    @ObfuscatedName("cy.a")
    public static byte[] field1705 = new byte[1];

    @ObfuscatedName("cy.l")
    public static class100 field1677 = new class100();

    @ObfuscatedName("cy.c")
    public static byte[] field1678 = new byte[1];

    @ObfuscatedName("cy.u")
    public int field1675 = 0;

    @ObfuscatedName("cy.w")
    public int[] field1711;

    @ObfuscatedName("cy.i")
    public int[] field1681;

    @ObfuscatedName("cy.r")
    public int[] field1682;

    @ObfuscatedName("cy.f")
    public int field1683 = 0;

    @ObfuscatedName("cy.g")
    public int[] field1684;

    @ObfuscatedName("cy.o")
    public int[] field1685;

    @ObfuscatedName("cy.h")
    public int[] field1686;

    @ObfuscatedName("cy.s")
    public int[] field1687;

    @ObfuscatedName("cy.j")
    public int[] field1688;

    @ObfuscatedName("cy.m")
    public int[] field1740;

    @ObfuscatedName("cy.t")
    public byte[] field1690;

    @ObfuscatedName("cy.z")
    public byte[] field1679;

    @ObfuscatedName("cy.y")
    public byte[] field1692;

    @ObfuscatedName("cy.q")
    public short[] field1709;

    @ObfuscatedName("cy.d")
    public byte field1694 = 0;

    @ObfuscatedName("cy.b")
    public int field1695 = 0;

    @ObfuscatedName("cy.x")
    public int[] field1725;

    @ObfuscatedName("cy.n")
    public int[] field1722;

    @ObfuscatedName("cy.v")
    public int[] field1698;

    @ObfuscatedName("cy.p")
    public int[][] field1699;

    @ObfuscatedName("cy.k")
    public int[][] field1723;

    @ObfuscatedName("cy.ax")
    public boolean field1706 = false;

    @ObfuscatedName("cy.ap")
    public int field1680;

    @ObfuscatedName("cy.ao")
    public int field1703;

    @ObfuscatedName("cy.ai")
    public int field1704;

    @ObfuscatedName("cy.aw")
    public int field1713;

    @ObfuscatedName("cy.am")
    public int field1724;

    @ObfuscatedName("cy.ae")
    public static boolean[] field1708 = new boolean[4096];

    @ObfuscatedName("cy.ab")
    public static boolean[] field1700 = new boolean[4096];

    @ObfuscatedName("cy.av")
    public static int[] field1710 = new int[4096];

    @ObfuscatedName("cy.ay")
    public static int[] field1734 = new int[4096];

    @ObfuscatedName("cy.ag")
    public static int[] field1712 = new int[4096];

    @ObfuscatedName("cy.aj")
    public static int[] field1701 = new int[4096];

    @ObfuscatedName("cy.ah")
    public static int[] field1714 = new int[4096];

    @ObfuscatedName("cy.at")
    public static int[] field1715 = new int[4096];

    @ObfuscatedName("cy.ak")
    public static int[] field1696 = new int[1600];

    @ObfuscatedName("cy.ar")
    public static int[][] field1721 = new int[1600][512];

    @ObfuscatedName("cy.aq")
    public static int[] field1719 = new int[12];

    @ObfuscatedName("cy.ac")
    public static int[][] field1693 = new int[12][2000];

    @ObfuscatedName("cy.ad")
    public static int[] field1697 = new int[2000];

    @ObfuscatedName("cy.an")
    public static int[] field1730 = new int[2000];

    @ObfuscatedName("cy.az")
    public static int[] field1689 = new int[12];

    @ObfuscatedName("cy.af")
    public static int[] field1718 = new int[10];

    @ObfuscatedName("cy.as")
    public static int[] field1691 = new int[10];

    @ObfuscatedName("cy.aa")
    public static int[] field1726 = new int[10];

    @ObfuscatedName("cy.bw")
    public static boolean field1717 = false;

    @ObfuscatedName("cy.bp")
    public static int field1731 = 0;

    @ObfuscatedName("cy.be")
    public static int field1732 = 0;

    @ObfuscatedName("cy.bv")
    public static int field1733 = 0;

    @ObfuscatedName("cy.bc")
    public static int[] field1702 = new int[1000];

    @ObfuscatedName("cy.br")
    public static int[] field1735 = class86.field1449;

    @ObfuscatedName("cy.bu")
    public static int[] field1736 = class86.field1440;

    @ObfuscatedName("cy.ba")
    public static int[] field1737 = class86.field1459;

    @ObfuscatedName("cy.bf")
    public static int[] field1738 = class86.field1445;

    public class100() {
    }

    public class100(class100[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1675 = 0;
        this.field1683 = 0;
        this.field1695 = 0;
        this.field1694 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class100 var8 = arg0[var7];
            if (var8 != null) {
                this.field1675 += var8.field1675;
                this.field1683 += var8.field1683;
                this.field1695 += var8.field1695;
                if (var8.field1690 == null) {
                    if (this.field1694 == -1) {
                        this.field1694 = var8.field1694;
                    }
                    if (this.field1694 != var8.field1694) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1679 != null;
                var5 |= var8.field1709 != null;
                var6 |= var8.field1692 != null;
            }
        }
        this.field1711 = new int[this.field1675];
        this.field1681 = new int[this.field1675];
        this.field1682 = new int[this.field1675];
        this.field1684 = new int[this.field1683];
        this.field1685 = new int[this.field1683];
        this.field1686 = new int[this.field1683];
        this.field1687 = new int[this.field1683];
        this.field1688 = new int[this.field1683];
        this.field1740 = new int[this.field1683];
        if (var3) {
            this.field1690 = new byte[this.field1683];
        }
        if (var4) {
            this.field1679 = new byte[this.field1683];
        }
        if (var5) {
            this.field1709 = new short[this.field1683];
        }
        if (var6) {
            this.field1692 = new byte[this.field1683];
        }
        if (this.field1695 > 0) {
            this.field1725 = new int[this.field1695];
            this.field1722 = new int[this.field1695];
            this.field1698 = new int[this.field1695];
        }
        this.field1675 = 0;
        this.field1683 = 0;
        this.field1695 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class100 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1683; var11++) {
                    this.field1684[this.field1683] = var10.field1684[var11] + this.field1675;
                    this.field1685[this.field1683] = var10.field1685[var11] + this.field1675;
                    this.field1686[this.field1683] = var10.field1686[var11] + this.field1675;
                    this.field1687[this.field1683] = var10.field1687[var11];
                    this.field1688[this.field1683] = var10.field1688[var11];
                    this.field1740[this.field1683] = var10.field1740[var11];
                    if (var3) {
                        if (var10.field1690 == null) {
                            this.field1690[this.field1683] = var10.field1694;
                        } else {
                            this.field1690[this.field1683] = var10.field1690[var11];
                        }
                    }
                    if (var4 && var10.field1679 != null) {
                        this.field1679[this.field1683] = var10.field1679[var11];
                    }
                    if (var5) {
                        if (var10.field1709 == null) {
                            this.field1709[this.field1683] = -1;
                        } else {
                            this.field1709[this.field1683] = var10.field1709[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1692 == null || var10.field1692[var11] == -1) {
                            this.field1692[this.field1683] = -1;
                        } else {
                            this.field1692[this.field1683] = (byte) (var10.field1692[var11] + this.field1695);
                        }
                    }
                    this.field1683++;
                }
                for (int var12 = 0; var12 < var10.field1695; var12++) {
                    this.field1725[this.field1695] = var10.field1725[var12] + this.field1675;
                    this.field1722[this.field1695] = var10.field1722[var12] + this.field1675;
                    this.field1698[this.field1695] = var10.field1698[var12] + this.field1675;
                    this.field1695++;
                }
                for (int var13 = 0; var13 < var10.field1675; var13++) {
                    this.field1711[this.field1675] = var10.field1711[var13];
                    this.field1681[this.field1675] = var10.field1681[var13];
                    this.field1682[this.field1675] = var10.field1682[var13];
                    this.field1675++;
                }
            }
        }
    }

    @ObfuscatedName("cy.e([[IIIIZI)Lcy;")
    public class100 method2028(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2051();
        int var7 = arg1 - this.field1704;
        int var8 = this.field1704 + arg1;
        int var9 = arg3 - this.field1704;
        int var10 = this.field1704 + arg3;
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
        class100 var15;
        if (arg4) {
            var15 = new class100();
            var15.field1675 = this.field1675;
            var15.field1683 = this.field1683;
            var15.field1695 = this.field1695;
            var15.field1711 = this.field1711;
            var15.field1682 = this.field1682;
            var15.field1684 = this.field1684;
            var15.field1685 = this.field1685;
            var15.field1686 = this.field1686;
            var15.field1687 = this.field1687;
            var15.field1688 = this.field1688;
            var15.field1740 = this.field1740;
            var15.field1690 = this.field1690;
            var15.field1679 = this.field1679;
            var15.field1692 = this.field1692;
            var15.field1709 = this.field1709;
            var15.field1694 = this.field1694;
            var15.field1725 = this.field1725;
            var15.field1722 = this.field1722;
            var15.field1698 = this.field1698;
            var15.field1699 = this.field1699;
            var15.field1723 = this.field1723;
            var15.field1706 = this.field1706;
            var15.field1681 = new int[var15.field1675];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1675; var16++) {
                int var17 = this.field1711[var16] + arg1;
                int var18 = this.field1682[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1681[var16] = this.field1681[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1675; var26++) {
                int var27 = (-this.field1681[var26] << 16) / this.field1324;
                if (var27 < arg5) {
                    int var28 = this.field1711[var26] + arg1;
                    int var29 = this.field1682[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1681[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1681[var26];
                }
            }
        }
        var15.field1680 = 0;
        return var15;
    }

    @ObfuscatedName("cy.l(Z)Lcy;")
    public class100 method2058(boolean arg0) {
        if (!arg0 && field1705.length < this.field1683) {
            field1705 = new byte[this.field1683 + 100];
        }
        return this.method2020(arg0, field1720, field1705);
    }

    @ObfuscatedName("cy.c(Z)Lcy;")
    public class100 method2070(boolean arg0) {
        if (!arg0 && field1678.length < this.field1683) {
            field1678 = new byte[this.field1683 + 100];
        }
        return this.method2020(arg0, field1677, field1678);
    }

    @ObfuscatedName("cy.u(ZLcy;[B)Lcy;")
    public class100 method2020(boolean arg0, class100 arg1, byte[] arg2) {
        arg1.field1675 = this.field1675;
        arg1.field1683 = this.field1683;
        arg1.field1695 = this.field1695;
        if (arg1.field1711 == null || arg1.field1711.length < this.field1675) {
            arg1.field1711 = new int[this.field1675 + 100];
            arg1.field1681 = new int[this.field1675 + 100];
            arg1.field1682 = new int[this.field1675 + 100];
        }
        for (int var4 = 0; var4 < this.field1675; var4++) {
            arg1.field1711[var4] = this.field1711[var4];
            arg1.field1681[var4] = this.field1681[var4];
            arg1.field1682[var4] = this.field1682[var4];
        }
        if (arg0) {
            arg1.field1679 = this.field1679;
        } else {
            arg1.field1679 = arg2;
            if (this.field1679 == null) {
                for (int var5 = 0; var5 < this.field1683; var5++) {
                    arg1.field1679[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1683; var6++) {
                    arg1.field1679[var6] = this.field1679[var6];
                }
            }
        }
        arg1.field1684 = this.field1684;
        arg1.field1685 = this.field1685;
        arg1.field1686 = this.field1686;
        arg1.field1687 = this.field1687;
        arg1.field1688 = this.field1688;
        arg1.field1740 = this.field1740;
        arg1.field1690 = this.field1690;
        arg1.field1692 = this.field1692;
        arg1.field1709 = this.field1709;
        arg1.field1694 = this.field1694;
        arg1.field1725 = this.field1725;
        arg1.field1722 = this.field1722;
        arg1.field1698 = this.field1698;
        arg1.field1699 = this.field1699;
        arg1.field1723 = this.field1723;
        arg1.field1706 = this.field1706;
        arg1.field1680 = 0;
        return arg1;
    }

    @ObfuscatedName("cy.w()V")
    public void method2051() {
        if (this.field1680 == 1) {
            return;
        }
        this.field1680 = 1;
        this.field1324 = 0;
        this.field1703 = 0;
        this.field1704 = 0;
        for (int var1 = 0; var1 < this.field1675; var1++) {
            int var2 = this.field1711[var1];
            int var3 = this.field1681[var1];
            int var4 = this.field1682[var1];
            if (-var3 > this.field1324) {
                this.field1324 = -var3;
            }
            if (var3 > this.field1703) {
                this.field1703 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1704) {
                this.field1704 = var5;
            }
        }
        this.field1704 = (int) (Math.sqrt((double) this.field1704) + 0.99D);
        this.field1724 = (int) (Math.sqrt((double) (this.field1324 * this.field1324 + this.field1704 * this.field1704)) + 0.99D);
        this.field1713 = this.field1724 + (int) (Math.sqrt((double) (this.field1704 * this.field1704 + this.field1703 * this.field1703)) + 0.99D);
    }

    @ObfuscatedName("cy.g()V")
    public void method2016() {
        if (this.field1680 == 2) {
            return;
        }
        this.field1680 = 2;
        this.field1704 = 0;
        for (int var1 = 0; var1 < this.field1675; var1++) {
            int var2 = this.field1711[var1];
            int var3 = this.field1681[var1];
            int var4 = this.field1682[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1704) {
                this.field1704 = var5;
            }
        }
        this.field1704 = (int) (Math.sqrt((double) this.field1704) + 0.99D);
        this.field1724 = this.field1704;
        this.field1713 = this.field1704 + this.field1704;
    }

    @ObfuscatedName("cy.o()I")
    public int method2023() {
        this.method2051();
        return this.field1704;
    }

    @ObfuscatedName("cy.h(Lco;I)V")
    public void method2017(class98 arg0, int arg1) {
        if (this.field1699 == null || arg1 == -1) {
            return;
        }
        class83 var3 = arg0.field1655[arg1];
        class97 var4 = var3.field1411;
        Statics.field1727 = 0;
        Statics.field1728 = 0;
        Statics.field1729 = 0;
        for (int var5 = 0; var5 < var3.field1414; var5++) {
            int var6 = var3.field1412[var5];
            this.method2025(var4.field1643[var6], var4.field1644[var6], var3.field1407[var5], var3.field1413[var5], var3.field1416[var5]);
        }
        this.field1680 = 0;
    }

    @ObfuscatedName("cy.s(Lco;ILco;I[I)V")
    public void method2082(class98 arg0, int arg1, class98 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2017(arg0, arg1);
            return;
        }
        class83 var6 = arg0.field1655[arg1];
        class83 var7 = arg2.field1655[arg3];
        class97 var8 = var6.field1411;
        Statics.field1727 = 0;
        Statics.field1728 = 0;
        Statics.field1729 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1414; var11++) {
            int var12 = var6.field1412[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1643[var12] == 0) {
                this.method2025(var8.field1643[var12], var8.field1644[var12], var6.field1407[var11], var6.field1413[var11], var6.field1416[var11]);
            }
        }
        Statics.field1727 = 0;
        Statics.field1728 = 0;
        Statics.field1729 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1414; var15++) {
            int var16 = var7.field1412[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1643[var16] == 0) {
                this.method2025(var8.field1643[var16], var8.field1644[var16], var7.field1407[var15], var7.field1413[var15], var7.field1416[var15]);
            }
        }
        this.field1680 = 0;
    }

    @ObfuscatedName("cy.j(I[IIII)V")
    public void method2025(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1727 = 0;
            Statics.field1728 = 0;
            Statics.field1729 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1699.length) {
                    int[] var10 = this.field1699[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1727 += this.field1711[var12];
                        Statics.field1728 += this.field1681[var12];
                        Statics.field1729 += this.field1682[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1727 = Statics.field1727 / var7 + arg2;
                Statics.field1728 = Statics.field1728 / var7 + arg3;
                Statics.field1729 = Statics.field1729 / var7 + arg4;
            } else {
                Statics.field1727 = arg2;
                Statics.field1728 = arg3;
                Statics.field1729 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1699.length) {
                    int[] var15 = this.field1699[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1711[var17] += arg2;
                        this.field1681[var17] += arg3;
                        this.field1682[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1699.length) {
                    int[] var20 = this.field1699[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1711[var22] -= Statics.field1727;
                        this.field1681[var22] -= Statics.field1728;
                        this.field1682[var22] -= Statics.field1729;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1735[var25];
                            int var27 = field1736[var25];
                            int var28 = this.field1711[var22] * var27 + this.field1681[var22] * var26 >> 16;
                            this.field1681[var22] = this.field1681[var22] * var27 - this.field1711[var22] * var26 >> 16;
                            this.field1711[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1735[var23];
                            int var30 = field1736[var23];
                            int var31 = this.field1681[var22] * var30 - this.field1682[var22] * var29 >> 16;
                            this.field1682[var22] = this.field1682[var22] * var30 + this.field1681[var22] * var29 >> 16;
                            this.field1681[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1735[var24];
                            int var33 = field1736[var24];
                            int var34 = this.field1711[var22] * var33 + this.field1682[var22] * var32 >> 16;
                            this.field1682[var22] = this.field1682[var22] * var33 - this.field1711[var22] * var32 >> 16;
                            this.field1711[var22] = var34;
                        }
                        this.field1711[var22] += Statics.field1727;
                        this.field1681[var22] += Statics.field1728;
                        this.field1682[var22] += Statics.field1729;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1699.length) {
                    int[] var37 = this.field1699[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1711[var39] -= Statics.field1727;
                        this.field1681[var39] -= Statics.field1728;
                        this.field1682[var39] -= Statics.field1729;
                        this.field1711[var39] = this.field1711[var39] * arg2 / 128;
                        this.field1681[var39] = this.field1681[var39] * arg3 / 128;
                        this.field1682[var39] = this.field1682[var39] * arg4 / 128;
                        this.field1711[var39] += Statics.field1727;
                        this.field1681[var39] += Statics.field1728;
                        this.field1682[var39] += Statics.field1729;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1723 != null && this.field1679 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1723.length) {
                    int[] var42 = this.field1723[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1679[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1679[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cy.m()V")
    public void method2038() {
        for (int var1 = 0; var1 < this.field1675; var1++) {
            int var2 = this.field1711[var1];
            this.field1711[var1] = this.field1682[var1];
            this.field1682[var1] = -var2;
        }
        this.field1680 = 0;
    }

    @ObfuscatedName("cy.t()V")
    public void method2027() {
        for (int var1 = 0; var1 < this.field1675; var1++) {
            this.field1711[var1] = -this.field1711[var1];
            this.field1682[var1] = -this.field1682[var1];
        }
        this.field1680 = 0;
    }

    @ObfuscatedName("cy.z()V")
    public void method2024() {
        for (int var1 = 0; var1 < this.field1675; var1++) {
            int var2 = this.field1682[var1];
            this.field1682[var1] = this.field1711[var1];
            this.field1711[var1] = -var2;
        }
        this.field1680 = 0;
    }

    @ObfuscatedName("cy.y(I)V")
    public void method2029(int arg0) {
        int var2 = field1735[arg0];
        int var3 = field1736[arg0];
        for (int var4 = 0; var4 < this.field1675; var4++) {
            int var5 = this.field1681[var4] * var3 - this.field1682[var4] * var2 >> 16;
            this.field1682[var4] = this.field1682[var4] * var3 + this.field1681[var4] * var2 >> 16;
            this.field1681[var4] = var5;
        }
        this.field1680 = 0;
    }

    @ObfuscatedName("cy.q(III)V")
    public void method2030(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1675; var4++) {
            this.field1711[var4] += arg0;
            this.field1681[var4] += arg1;
            this.field1682[var4] += arg2;
        }
        this.field1680 = 0;
    }

    @ObfuscatedName("cy.d(III)V")
    public void method2031(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1675; var4++) {
            this.field1711[var4] = this.field1711[var4] * arg0 / 128;
            this.field1681[var4] = this.field1681[var4] * arg1 / 128;
            this.field1682[var4] = this.field1682[var4] * arg2 / 128;
        }
        this.field1680 = 0;
    }

    @ObfuscatedName("cy.b(IIIIIII)V")
    public final void method2032(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1696[0] = -1;
        if (this.field1680 != 2 && this.field1680 != 1) {
            this.method2016();
        }
        int var8 = Statics.field1450;
        int var9 = Statics.field1451;
        int var10 = field1735[arg0];
        int var11 = field1736[arg0];
        int var12 = field1735[arg1];
        int var13 = field1736[arg1];
        int var14 = field1735[arg2];
        int var15 = field1736[arg2];
        int var16 = field1735[arg3];
        int var17 = field1736[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1675; var19++) {
            int var20 = this.field1711[var19];
            int var21 = this.field1681[var19];
            int var22 = this.field1682[var19];
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
            field1712[var19] = var30 - var18;
            field1710[var19] = (var26 << 9) / var30 + var8;
            field1734[var19] = (var29 << 9) / var30 + var9;
            if (this.field1695 > 0) {
                field1701[var19] = var26;
                field1714[var19] = var29;
                field1715[var19] = var30;
            }
        }
        try {
            this.method2034(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("cy.x(IIIIIIII)V")
    public final void method2033(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1696[0] = -1;
        if (this.field1680 != 2 && this.field1680 != 1) {
            this.method2016();
        }
        int var9 = Statics.field1450;
        int var10 = Statics.field1451;
        int var11 = field1735[arg0];
        int var12 = field1736[arg0];
        int var13 = field1735[arg1];
        int var14 = field1736[arg1];
        int var15 = field1735[arg2];
        int var16 = field1736[arg2];
        int var17 = field1735[arg3];
        int var18 = field1736[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1675; var20++) {
            int var21 = this.field1711[var20];
            int var22 = this.field1681[var20];
            int var23 = this.field1682[var20];
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
            field1712[var20] = var31 - var19;
            field1710[var20] = (var27 << 9) / arg7 + var9;
            field1734[var20] = (var30 << 9) / arg7 + var10;
            if (this.field1695 > 0) {
                field1701[var20] = var27;
                field1714[var20] = var30;
                field1715[var20] = var31;
            }
        }
        try {
            this.method2034(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("cy.k(IIIIIIIII)V")
    public void method1654(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1696[0] = -1;
        if (this.field1680 != 1) {
            this.method2051();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1704 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field1704 << 9;
        if (var15 / var13 >= Statics.field1455) {
            return;
        }
        int var16 = this.field1704 + var14 << 9;
        if (var16 / var13 <= Statics.field1454) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1704 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field1456) {
            return;
        }
        int var20 = (this.field1324 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field1462) {
            return;
        }
        int var22 = (this.field1324 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1695 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field1717) {
            int var27 = var11 - var12;
            if (var27 <= 50) {
                var27 = 50;
            }
            int var28;
            int var29;
            if (var14 > 0) {
                var28 = var15 / var13;
                var29 = var16 / var27;
            } else {
                var29 = var16 / var13;
                var28 = var15 / var27;
            }
            int var30;
            int var31;
            if (var17 > 0) {
                var30 = var21 / var13;
                var31 = var19 / var27;
            } else {
                var31 = var19 / var13;
                var30 = var21 / var27;
            }
            int var32 = field1731 - Statics.field1450;
            int var33 = field1732 - Statics.field1451;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field1706) {
                    field1702[field1733++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field1450;
        int var35 = Statics.field1451;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field1735[arg0];
            var37 = field1736[arg0];
        }
        for (int var38 = 0; var38 < this.field1675; var38++) {
            int var39 = this.field1711[var38];
            int var40 = this.field1681[var38];
            int var41 = this.field1682[var38];
            if (arg0 != 0) {
                int var42 = var36 * var41 + var37 * var39 >> 16;
                var41 = var37 * var41 - var36 * var39 >> 16;
                var39 = var42;
            }
            int var43 = arg5 + var39;
            int var44 = arg6 + var40;
            int var45 = arg7 + var41;
            int var46 = arg3 * var45 + arg4 * var43 >> 16;
            int var47 = arg4 * var45 - arg3 * var43 >> 16;
            int var49 = arg2 * var44 - arg1 * var47 >> 16;
            int var50 = arg1 * var44 + arg2 * var47 >> 16;
            field1712[var38] = var50 - var11;
            if (var50 >= 50) {
                field1710[var38] = (var46 << 9) / var50 + var34;
                field1734[var38] = (var49 << 9) / var50 + var35;
            } else {
                field1710[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field1701[var38] = var46;
                field1714[var38] = var49;
                field1715[var38] = var50;
            }
        }
        try {
            this.method2034(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("cy.n(ZZI)V")
    public final void method2034(boolean arg0, boolean arg1, int arg2) {
        if (this.field1713 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field1713; var4++) {
            field1696[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field1683; var5++) {
            if (this.field1740[var5] != -2) {
                int var6 = this.field1684[var5];
                int var7 = this.field1685[var5];
                int var8 = this.field1686[var5];
                int var9 = field1710[var6];
                int var10 = field1710[var7];
                int var11 = field1710[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field1701[var6];
                    int var13 = field1701[var7];
                    int var14 = field1701[var8];
                    int var15 = field1714[var6];
                    int var16 = field1714[var7];
                    int var17 = field1714[var8];
                    int var18 = field1715[var6];
                    int var19 = field1715[var7];
                    int var20 = field1715[var8];
                    int var21 = var12 - var13;
                    int var22 = var14 - var13;
                    int var23 = var15 - var16;
                    int var24 = var17 - var16;
                    int var25 = var18 - var19;
                    int var26 = var20 - var19;
                    int var27 = var23 * var26 - var24 * var25;
                    int var28 = var22 * var25 - var21 * var26;
                    int var29 = var21 * var24 - var22 * var23;
                    if (var19 * var29 + var13 * var27 + var16 * var28 > 0) {
                        field1700[var5] = true;
                        int var30 = (field1712[var6] + field1712[var7] + field1712[var8]) / 3 + this.field1724;
                        field1721[var30][field1696[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2071(field1731, field1732, field1734[var6], field1734[var7], field1734[var8], var9, var10, var11)) {
                        field1702[field1733++] = arg2;
                        arg1 = false;
                    }
                    if ((field1734[var8] - field1734[var7]) * (var9 - var10) - (field1734[var6] - field1734[var7]) * (var11 - var10) > 0) {
                        field1700[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field1452 && var10 <= Statics.field1452 && var11 <= Statics.field1452) {
                            field1708[var5] = false;
                        } else {
                            field1708[var5] = true;
                        }
                        int var31 = (field1712[var6] + field1712[var7] + field1712[var8]) / 3 + this.field1724;
                        field1721[var31][field1696[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field1690 == null) {
            for (int var32 = this.field1713 - 1; var32 >= 0; var32--) {
                int var33 = field1696[var32];
                if (var33 > 0) {
                    int[] var34 = field1721[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2035(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field1719[var36] = 0;
            field1689[var36] = 0;
        }
        for (int var37 = this.field1713 - 1; var37 >= 0; var37--) {
            int var38 = field1696[var37];
            if (var38 > 0) {
                int[] var39 = field1721[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field1690[var41];
                    int var43 = field1719[var42]++;
                    field1693[var42][var43] = var41;
                    if (var42 < 10) {
                        field1689[var42] += var37;
                    } else if (var42 == 10) {
                        field1697[var43] = var37;
                    } else {
                        field1730[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field1719[1] > 0 || field1719[2] > 0) {
            var44 = (field1689[1] + field1689[2]) / (field1719[1] + field1719[2]);
        }
        int var45 = 0;
        if (field1719[3] > 0 || field1719[4] > 0) {
            var45 = (field1689[3] + field1689[4]) / (field1719[3] + field1719[4]);
        }
        int var46 = 0;
        if (field1719[6] > 0 || field1719[8] > 0) {
            var46 = (field1689[6] + field1689[8]) / (field1719[6] + field1719[8]);
        }
        int var47 = 0;
        int var48 = field1719[10];
        int[] var49 = field1693[10];
        int[] var50 = field1697;
        if (var47 == var48) {
            var47 = 0;
            var48 = field1719[11];
            var49 = field1693[11];
            var50 = field1730;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2035(var49[var47++]);
                if (var47 == var48 && field1693[11] != var49) {
                    var47 = 0;
                    var48 = field1719[11];
                    var49 = field1693[11];
                    var50 = field1730;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2035(var49[var47++]);
                if (var47 == var48 && field1693[11] != var49) {
                    var47 = 0;
                    var48 = field1719[11];
                    var49 = field1693[11];
                    var50 = field1730;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2035(var49[var47++]);
                if (var47 == var48 && field1693[11] != var49) {
                    var47 = 0;
                    var48 = field1719[11];
                    var49 = field1693[11];
                    var50 = field1730;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field1719[var52];
            int[] var54 = field1693[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2035(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2035(var49[var47++]);
            if (var47 == var48 && field1693[11] != var49) {
                var47 = 0;
                var49 = field1693[11];
                var48 = field1719[11];
                var50 = field1730;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("cy.v(I)V")
    public final void method2035(int arg0) {
        if (field1700[arg0]) {
            this.method2036(arg0);
            return;
        }
        int var2 = this.field1684[arg0];
        int var3 = this.field1685[arg0];
        int var4 = this.field1686[arg0];
        class86.field1442 = field1708[arg0];
        if (this.field1679 == null) {
            class86.field1464 = 0;
        } else {
            class86.field1464 = this.field1679[arg0] & 0xFF;
        }
        if (this.field1709 != null && this.field1709[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1692 == null || this.field1692[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1692[arg0] & 0xFF;
                var6 = this.field1725[var5];
                var7 = this.field1722[var5];
                var8 = this.field1698[var5];
            }
            if (this.field1740[arg0] == -1) {
                class86.method1834(field1734[var2], field1734[var3], field1734[var4], field1710[var2], field1710[var3], field1710[var4], this.field1687[arg0], this.field1687[arg0], this.field1687[arg0], field1701[var6], field1701[var7], field1701[var8], field1714[var6], field1714[var7], field1714[var8], field1715[var6], field1715[var7], field1715[var8], this.field1709[arg0]);
            } else {
                class86.method1834(field1734[var2], field1734[var3], field1734[var4], field1710[var2], field1710[var3], field1710[var4], this.field1687[arg0], this.field1688[arg0], this.field1740[arg0], field1701[var6], field1701[var7], field1701[var8], field1714[var6], field1714[var7], field1714[var8], field1715[var6], field1715[var7], field1715[var8], this.field1709[arg0]);
            }
        } else if (this.field1740[arg0] == -1) {
            class86.method1840(field1734[var2], field1734[var3], field1734[var4], field1710[var2], field1710[var3], field1710[var4], field1737[this.field1687[arg0]]);
        } else {
            class86.method1828(field1734[var2], field1734[var3], field1734[var4], field1710[var2], field1710[var3], field1710[var4], this.field1687[arg0], this.field1688[arg0], this.field1740[arg0]);
        }
    }

    @ObfuscatedName("cy.p(I)V")
    public final void method2036(int arg0) {
        int var2 = Statics.field1450;
        int var3 = Statics.field1451;
        int var4 = 0;
        int var5 = this.field1684[arg0];
        int var6 = this.field1685[arg0];
        int var7 = this.field1686[arg0];
        int var8 = field1715[var5];
        int var9 = field1715[var6];
        int var10 = field1715[var7];
        if (this.field1679 == null) {
            class86.field1464 = 0;
        } else {
            class86.field1464 = this.field1679[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1718[var4] = field1710[var5];
            field1691[var4] = field1734[var5];
            field1726[var4++] = this.field1687[arg0];
        } else {
            int var11 = field1701[var5];
            int var12 = field1714[var5];
            int var13 = this.field1687[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1738[var10 - var8];
                field1718[var4] = (((field1701[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field1691[var4] = (((field1714[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field1726[var4++] = ((this.field1740[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1738[var9 - var8];
                field1718[var4] = (((field1701[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field1691[var4] = (((field1714[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field1726[var4++] = ((this.field1688[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1718[var4] = field1710[var6];
            field1691[var4] = field1734[var6];
            field1726[var4++] = this.field1688[arg0];
        } else {
            int var16 = field1701[var6];
            int var17 = field1714[var6];
            int var18 = this.field1688[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1738[var8 - var9];
                field1718[var4] = (((field1701[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field1691[var4] = (((field1714[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field1726[var4++] = ((this.field1687[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1738[var10 - var9];
                field1718[var4] = (((field1701[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field1691[var4] = (((field1714[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field1726[var4++] = ((this.field1740[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1718[var4] = field1710[var7];
            field1691[var4] = field1734[var7];
            field1726[var4++] = this.field1740[arg0];
        } else {
            int var21 = field1701[var7];
            int var22 = field1714[var7];
            int var23 = this.field1740[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1738[var9 - var10];
                field1718[var4] = (((field1701[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field1691[var4] = (((field1714[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field1726[var4++] = ((this.field1688[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1738[var8 - var10];
                field1718[var4] = (((field1701[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field1691[var4] = (((field1714[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field1726[var4++] = ((this.field1687[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1718[0];
        int var27 = field1718[1];
        int var28 = field1718[2];
        int var29 = field1691[0];
        int var30 = field1691[1];
        int var31 = field1691[2];
        class86.field1442 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1452 || var27 > Statics.field1452 || var28 > Statics.field1452) {
                class86.field1442 = true;
            }
            if (this.field1709 != null && this.field1709[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1692 == null || this.field1692[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1692[arg0] & 0xFF;
                    var33 = this.field1725[var32];
                    var34 = this.field1722[var32];
                    var35 = this.field1698[var32];
                }
                if (this.field1740[arg0] == -1) {
                    class86.method1834(var29, var30, var31, var26, var27, var28, this.field1687[arg0], this.field1687[arg0], this.field1687[arg0], field1701[var33], field1701[var34], field1701[var35], field1714[var33], field1714[var34], field1714[var35], field1715[var33], field1715[var34], field1715[var35], this.field1709[arg0]);
                } else {
                    class86.method1834(var29, var30, var31, var26, var27, var28, field1726[0], field1726[1], field1726[2], field1701[var33], field1701[var34], field1701[var35], field1714[var33], field1714[var34], field1714[var35], field1715[var33], field1715[var34], field1715[var35], this.field1709[arg0]);
                }
            } else if (this.field1740[arg0] == -1) {
                class86.method1840(var29, var30, var31, var26, var27, var28, field1737[this.field1687[arg0]]);
            } else {
                class86.method1828(var29, var30, var31, var26, var27, var28, field1726[0], field1726[1], field1726[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1452 || var27 > Statics.field1452 || var28 > Statics.field1452 || field1718[3] < 0 || field1718[3] > Statics.field1452) {
            class86.field1442 = true;
        }
        if (this.field1709 != null && this.field1709[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1692 == null || this.field1692[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1692[arg0] & 0xFF;
                var37 = this.field1725[var36];
                var38 = this.field1722[var36];
                var39 = this.field1698[var36];
            }
            short var40 = this.field1709[arg0];
            if (this.field1740[arg0] == -1) {
                class86.method1834(var29, var30, var31, var26, var27, var28, this.field1687[arg0], this.field1687[arg0], this.field1687[arg0], field1701[var37], field1701[var38], field1701[var39], field1714[var37], field1714[var38], field1714[var39], field1715[var37], field1715[var38], field1715[var39], var40);
                class86.method1834(var29, var31, field1691[3], var26, var28, field1718[3], this.field1687[arg0], this.field1687[arg0], this.field1687[arg0], field1701[var37], field1701[var38], field1701[var39], field1714[var37], field1714[var38], field1714[var39], field1715[var37], field1715[var38], field1715[var39], var40);
            } else {
                class86.method1834(var29, var30, var31, var26, var27, var28, field1726[0], field1726[1], field1726[2], field1701[var37], field1701[var38], field1701[var39], field1714[var37], field1714[var38], field1714[var39], field1715[var37], field1715[var38], field1715[var39], var40);
                class86.method1834(var29, var31, field1691[3], var26, var28, field1718[3], field1726[0], field1726[2], field1726[3], field1701[var37], field1701[var38], field1701[var39], field1714[var37], field1714[var38], field1714[var39], field1715[var37], field1715[var38], field1715[var39], var40);
            }
        } else if (this.field1740[arg0] == -1) {
            int var41 = field1737[this.field1687[arg0]];
            class86.method1840(var29, var30, var31, var26, var27, var28, var41);
            class86.method1840(var29, var31, field1691[3], var26, var28, field1718[3], var41);
        } else {
            class86.method1828(var29, var30, var31, var26, var27, var28, field1726[0], field1726[1], field1726[2]);
            class86.method1828(var29, var31, field1691[3], var26, var28, field1718[3], field1726[0], field1726[2], field1726[3]);
        }
    }

    @ObfuscatedName("cy.ai(IIIIIIII)Z")
    public final boolean method2071(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }
}
