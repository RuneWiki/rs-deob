package deob;

@ObfuscatedName("dv")
public class class127 extends class135 {

    @ObfuscatedName("dv.a")
    public static class127 field1666 = new class127();

    @ObfuscatedName("dv.s")
    public static byte[] field1662 = new byte[1];

    @ObfuscatedName("dv.g")
    public static class127 field1691 = new class127();

    @ObfuscatedName("dv.x")
    public static byte[] field1664 = new byte[1];

    @ObfuscatedName("dv.h")
    public int field1687 = 0;

    @ObfuscatedName("dv.f")
    public int[] field1725;

    @ObfuscatedName("dv.p")
    public int[] field1667;

    @ObfuscatedName("dv.m")
    public int[] field1668;

    @ObfuscatedName("dv.q")
    public int field1669 = 0;

    @ObfuscatedName("dv.b")
    public int[] field1670;

    @ObfuscatedName("dv.n")
    public int[] field1671;

    @ObfuscatedName("dv.e")
    public int[] field1719;

    @ObfuscatedName("dv.r")
    public int[] field1673;

    @ObfuscatedName("dv.t")
    public int[] field1674;

    @ObfuscatedName("dv.l")
    public int[] field1675;

    @ObfuscatedName("dv.o")
    public byte[] field1676;

    @ObfuscatedName("dv.u")
    public byte[] field1677;

    @ObfuscatedName("dv.y")
    public byte[] field1730;

    @ObfuscatedName("dv.k")
    public short[] field1679;

    @ObfuscatedName("dv.v")
    public byte field1672 = 0;

    @ObfuscatedName("dv.d")
    public int field1690 = 0;

    @ObfuscatedName("dv.w")
    public int[] field1729;

    @ObfuscatedName("dv.i")
    public int[] field1683;

    @ObfuscatedName("dv.c")
    public int[] field1684;

    @ObfuscatedName("dv.j")
    public int[][] field1685;

    @ObfuscatedName("dv.z")
    public int[][] field1686;

    @ObfuscatedName("dv.ag")
    public boolean field1697 = false;

    @ObfuscatedName("dv.af")
    public int field1688;

    @ObfuscatedName("dv.ay")
    public int field1689;

    @ObfuscatedName("dv.aa")
    public int field1707;

    @ObfuscatedName("dv.ab")
    public int field1715;

    @ObfuscatedName("dv.ah")
    public int field1712;

    @ObfuscatedName("dv.aw")
    public int field1693;

    @ObfuscatedName("dv.an")
    public int field1694;

    @ObfuscatedName("dv.at")
    public int field1695;

    @ObfuscatedName("dv.ae")
    public int field1696 = -1;

    @ObfuscatedName("dv.av")
    public int field1705 = -1;

    @ObfuscatedName("dv.au")
    public int field1698 = -1;

    @ObfuscatedName("dv.as")
    public static boolean[] field1700 = new boolean[4700];

    @ObfuscatedName("dv.ar")
    public static boolean[] field1680 = new boolean[4700];

    @ObfuscatedName("dv.ai")
    public static int[] field1702 = new int[4700];

    @ObfuscatedName("dv.aq")
    public static int[] field1703 = new int[4700];

    @ObfuscatedName("dv.al")
    public static int[] field1682 = new int[4700];

    @ObfuscatedName("dv.az")
    public static int[] field1681 = new int[4700];

    @ObfuscatedName("dv.ac")
    public static int[] field1663 = new int[4700];

    @ObfuscatedName("dv.ao")
    public static int[] field1704 = new int[4700];

    @ObfuscatedName("dv.ax")
    public static int[] field1709 = new int[1600];

    @ObfuscatedName("dv.ap")
    public static int[][] field1710 = new int[1600][512];

    @ObfuscatedName("dv.ak")
    public static int[] field1723 = new int[12];

    @ObfuscatedName("dv.am")
    public static int[][] field1716 = new int[12][2000];

    @ObfuscatedName("dv.bf")
    public static int[] field1713 = new int[2000];

    @ObfuscatedName("dv.bo")
    public static int[] field1714 = new int[2000];

    @ObfuscatedName("dv.be")
    public static int[] field1701 = new int[12];

    @ObfuscatedName("dv.bd")
    public static int[] field1706 = new int[10];

    @ObfuscatedName("dv.bz")
    public static int[] field1717 = new int[10];

    @ObfuscatedName("dv.bi")
    public static int[] field1718 = new int[10];

    @ObfuscatedName("dv.bk")
    public static boolean field1722 = true;

    @ObfuscatedName("dv.bl")
    public static int[] field1665 = class130.field1779;

    @ObfuscatedName("dv.bb")
    public static int[] field1726 = class130.field1768;

    @ObfuscatedName("dv.bw")
    public static int[] field1727 = class130.field1775;

    @ObfuscatedName("dv.bh")
    public static int[] field1711 = class130.field1778;

    public class127() {
    }

    public class127(class127[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1687 = 0;
        this.field1669 = 0;
        this.field1690 = 0;
        this.field1672 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class127 var8 = arg0[var7];
            if (var8 != null) {
                this.field1687 += var8.field1687;
                this.field1669 += var8.field1669;
                this.field1690 += var8.field1690;
                if (var8.field1676 == null) {
                    if (this.field1672 == -1) {
                        this.field1672 = var8.field1672;
                    }
                    if (this.field1672 != var8.field1672) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1677 != null;
                var5 |= var8.field1679 != null;
                var6 |= var8.field1730 != null;
            }
        }
        this.field1725 = new int[this.field1687];
        this.field1667 = new int[this.field1687];
        this.field1668 = new int[this.field1687];
        this.field1670 = new int[this.field1669];
        this.field1671 = new int[this.field1669];
        this.field1719 = new int[this.field1669];
        this.field1673 = new int[this.field1669];
        this.field1674 = new int[this.field1669];
        this.field1675 = new int[this.field1669];
        if (var3) {
            this.field1676 = new byte[this.field1669];
        }
        if (var4) {
            this.field1677 = new byte[this.field1669];
        }
        if (var5) {
            this.field1679 = new short[this.field1669];
        }
        if (var6) {
            this.field1730 = new byte[this.field1669];
        }
        if (this.field1690 > 0) {
            this.field1729 = new int[this.field1690];
            this.field1683 = new int[this.field1690];
            this.field1684 = new int[this.field1690];
        }
        this.field1687 = 0;
        this.field1669 = 0;
        this.field1690 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class127 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1669; var11++) {
                    this.field1670[this.field1669] = var10.field1670[var11] + this.field1687;
                    this.field1671[this.field1669] = var10.field1671[var11] + this.field1687;
                    this.field1719[this.field1669] = var10.field1719[var11] + this.field1687;
                    this.field1673[this.field1669] = var10.field1673[var11];
                    this.field1674[this.field1669] = var10.field1674[var11];
                    this.field1675[this.field1669] = var10.field1675[var11];
                    if (var3) {
                        if (var10.field1676 == null) {
                            this.field1676[this.field1669] = var10.field1672;
                        } else {
                            this.field1676[this.field1669] = var10.field1676[var11];
                        }
                    }
                    if (var4 && var10.field1677 != null) {
                        this.field1677[this.field1669] = var10.field1677[var11];
                    }
                    if (var5) {
                        if (var10.field1679 == null) {
                            this.field1679[this.field1669] = -1;
                        } else {
                            this.field1679[this.field1669] = var10.field1679[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1730 == null || var10.field1730[var11] == -1) {
                            this.field1730[this.field1669] = -1;
                        } else {
                            this.field1730[this.field1669] = (byte) (var10.field1730[var11] + this.field1690);
                        }
                    }
                    this.field1669++;
                }
                for (int var12 = 0; var12 < var10.field1690; var12++) {
                    this.field1729[this.field1690] = var10.field1729[var12] + this.field1687;
                    this.field1683[this.field1690] = var10.field1683[var12] + this.field1687;
                    this.field1684[this.field1690] = var10.field1684[var12] + this.field1687;
                    this.field1690++;
                }
                for (int var13 = 0; var13 < var10.field1687; var13++) {
                    this.field1725[this.field1687] = var10.field1725[var13];
                    this.field1667[this.field1687] = var10.field1667[var13];
                    this.field1668[this.field1687] = var10.field1668[var13];
                    this.field1687++;
                }
            }
        }
    }

    @ObfuscatedName("dv.a([[IIIIZI)Ldv;")
    public class127 method2677(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2683();
        int var7 = arg1 - this.field1707;
        int var8 = this.field1707 + arg1;
        int var9 = arg3 - this.field1707;
        int var10 = this.field1707 + arg3;
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
        class127 var15;
        if (arg4) {
            var15 = new class127();
            var15.field1687 = this.field1687;
            var15.field1669 = this.field1669;
            var15.field1690 = this.field1690;
            var15.field1725 = this.field1725;
            var15.field1668 = this.field1668;
            var15.field1670 = this.field1670;
            var15.field1671 = this.field1671;
            var15.field1719 = this.field1719;
            var15.field1673 = this.field1673;
            var15.field1674 = this.field1674;
            var15.field1675 = this.field1675;
            var15.field1676 = this.field1676;
            var15.field1677 = this.field1677;
            var15.field1730 = this.field1730;
            var15.field1679 = this.field1679;
            var15.field1672 = this.field1672;
            var15.field1729 = this.field1729;
            var15.field1683 = this.field1683;
            var15.field1684 = this.field1684;
            var15.field1685 = this.field1685;
            var15.field1686 = this.field1686;
            var15.field1697 = this.field1697;
            var15.field1667 = new int[var15.field1687];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1687; var16++) {
                int var17 = this.field1725[var16] + arg1;
                int var18 = this.field1668[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1667[var16] = this.field1667[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1687; var26++) {
                int var27 = (-this.field1667[var26] << 16) / this.field1863;
                if (var27 < arg5) {
                    int var28 = this.field1725[var26] + arg1;
                    int var29 = this.field1668[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1667[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1667[var26];
                }
            }
        }
        var15.method2676();
        return var15;
    }

    @ObfuscatedName("dv.s(Z)Ldv;")
    public class127 method2678(boolean arg0) {
        if (!arg0 && field1662.length < this.field1669) {
            field1662 = new byte[this.field1669 + 100];
        }
        return this.method2727(arg0, field1666, field1662);
    }

    @ObfuscatedName("dv.g(Z)Ldv;")
    public class127 method2679(boolean arg0) {
        if (!arg0 && field1664.length < this.field1669) {
            field1664 = new byte[this.field1669 + 100];
        }
        return this.method2727(arg0, field1691, field1664);
    }

    @ObfuscatedName("dv.x(ZLdv;[B)Ldv;")
    public class127 method2727(boolean arg0, class127 arg1, byte[] arg2) {
        arg1.field1687 = this.field1687;
        arg1.field1669 = this.field1669;
        arg1.field1690 = this.field1690;
        if (arg1.field1725 == null || arg1.field1725.length < this.field1687) {
            arg1.field1725 = new int[this.field1687 + 100];
            arg1.field1667 = new int[this.field1687 + 100];
            arg1.field1668 = new int[this.field1687 + 100];
        }
        for (int var4 = 0; var4 < this.field1687; var4++) {
            arg1.field1725[var4] = this.field1725[var4];
            arg1.field1667[var4] = this.field1667[var4];
            arg1.field1668[var4] = this.field1668[var4];
        }
        if (arg0) {
            arg1.field1677 = this.field1677;
        } else {
            arg1.field1677 = arg2;
            if (this.field1677 == null) {
                for (int var5 = 0; var5 < this.field1669; var5++) {
                    arg1.field1677[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1669; var6++) {
                    arg1.field1677[var6] = this.field1677[var6];
                }
            }
        }
        arg1.field1670 = this.field1670;
        arg1.field1671 = this.field1671;
        arg1.field1719 = this.field1719;
        arg1.field1673 = this.field1673;
        arg1.field1674 = this.field1674;
        arg1.field1675 = this.field1675;
        arg1.field1676 = this.field1676;
        arg1.field1730 = this.field1730;
        arg1.field1679 = this.field1679;
        arg1.field1672 = this.field1672;
        arg1.field1729 = this.field1729;
        arg1.field1683 = this.field1683;
        arg1.field1684 = this.field1684;
        arg1.field1685 = this.field1685;
        arg1.field1686 = this.field1686;
        arg1.field1697 = this.field1697;
        arg1.method2676();
        return arg1;
    }

    @ObfuscatedName("dv.h(I)V")
    public void method2706(int arg0) {
        if (this.field1696 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1726[arg0];
        int var9 = field1665[arg0];
        for (int var10 = 0; var10 < this.field1687; var10++) {
            int var11 = class130.method2826(this.field1725[var10], this.field1668[var10], var8, var9);
            int var12 = this.field1667[var10];
            int var13 = class130.method2867(this.field1725[var10], this.field1668[var10], var8, var9);
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
        this.field1693 = (var2 + var5) / 2;
        this.field1694 = (var3 + var6) / 2;
        this.field1695 = (var4 + var7) / 2;
        this.field1696 = (var5 - var2 + 1) / 2;
        this.field1705 = (var6 - var3 + 1) / 2;
        this.field1698 = (var7 - var4 + 1) / 2;
        if (this.field1696 < 32) {
            this.field1696 = 32;
        }
        if (this.field1698 < 32) {
            this.field1698 = 32;
        }
        if (this.field1697) {
            this.field1696 += 8;
            this.field1698 += 8;
        }
    }

    @ObfuscatedName("dv.f()V")
    public void method2683() {
        if (this.field1688 == 1) {
            return;
        }
        this.field1688 = 1;
        this.field1863 = 0;
        this.field1689 = 0;
        this.field1707 = 0;
        for (int var1 = 0; var1 < this.field1687; var1++) {
            int var2 = this.field1725[var1];
            int var3 = this.field1667[var1];
            int var4 = this.field1668[var1];
            if (-var3 > this.field1863) {
                this.field1863 = -var3;
            }
            if (var3 > this.field1689) {
                this.field1689 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1707) {
                this.field1707 = var5;
            }
        }
        this.field1707 = (int) (Math.sqrt((double) this.field1707) + 0.99D);
        this.field1712 = (int) (Math.sqrt((double) (this.field1863 * this.field1863 + this.field1707 * this.field1707)) + 0.99D);
        this.field1715 = this.field1712 + (int) (Math.sqrt((double) (this.field1707 * this.field1707 + this.field1689 * this.field1689)) + 0.99D);
    }

    @ObfuscatedName("dv.p()V")
    public void method2709() {
        if (this.field1688 == 2) {
            return;
        }
        this.field1688 = 2;
        this.field1707 = 0;
        for (int var1 = 0; var1 < this.field1687; var1++) {
            int var2 = this.field1725[var1];
            int var3 = this.field1667[var1];
            int var4 = this.field1668[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1707) {
                this.field1707 = var5;
            }
        }
        this.field1707 = (int) (Math.sqrt((double) this.field1707) + 0.99D);
        this.field1712 = this.field1707;
        this.field1715 = this.field1707 + this.field1707;
    }

    @ObfuscatedName("dv.m()I")
    public int method2717() {
        this.method2683();
        return this.field1707;
    }

    @ObfuscatedName("dv.b()V")
    public void method2676() {
        this.field1688 = 0;
        this.field1696 = -1;
    }

    @ObfuscatedName("dv.n(Lei;I)V")
    public void method2685(class138 arg0, int arg1) {
        if (this.field1685 == null || arg1 == -1) {
            return;
        }
        class125 var3 = arg0.field1883[arg1];
        class132 var4 = var3.field1631;
        Statics.field1692 = 0;
        Statics.field1720 = 0;
        Statics.field1721 = 0;
        for (int var5 = 0; var5 < var3.field1632; var5++) {
            int var6 = var3.field1633[var5];
            this.method2687(var4.field1792[var6], var4.field1793[var6], var3.field1634[var5], var3.field1635[var5], var3.field1627[var5]);
        }
        this.method2676();
    }

    @ObfuscatedName("dv.e(Lei;ILei;I[I)V")
    public void method2682(class138 arg0, int arg1, class138 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2685(arg0, arg1);
            return;
        }
        class125 var6 = arg0.field1883[arg1];
        class125 var7 = arg2.field1883[arg3];
        class132 var8 = var6.field1631;
        Statics.field1692 = 0;
        Statics.field1720 = 0;
        Statics.field1721 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1632; var11++) {
            int var12 = var6.field1633[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1792[var12] == 0) {
                this.method2687(var8.field1792[var12], var8.field1793[var12], var6.field1634[var11], var6.field1635[var11], var6.field1627[var11]);
            }
        }
        Statics.field1692 = 0;
        Statics.field1720 = 0;
        Statics.field1721 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1632; var15++) {
            int var16 = var7.field1633[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1792[var16] == 0) {
                this.method2687(var8.field1792[var16], var8.field1793[var16], var7.field1634[var15], var7.field1635[var15], var7.field1627[var15]);
            }
        }
        this.method2676();
    }

    @ObfuscatedName("dv.r(I[IIII)V")
    public void method2687(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1692 = 0;
            Statics.field1720 = 0;
            Statics.field1721 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1685.length) {
                    int[] var10 = this.field1685[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1692 += this.field1725[var12];
                        Statics.field1720 += this.field1667[var12];
                        Statics.field1721 += this.field1668[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1692 = Statics.field1692 / var7 + arg2;
                Statics.field1720 = Statics.field1720 / var7 + arg3;
                Statics.field1721 = Statics.field1721 / var7 + arg4;
            } else {
                Statics.field1692 = arg2;
                Statics.field1720 = arg3;
                Statics.field1721 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1685.length) {
                    int[] var15 = this.field1685[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1725[var17] += arg2;
                        this.field1667[var17] += arg3;
                        this.field1668[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1685.length) {
                    int[] var20 = this.field1685[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1725[var22] -= Statics.field1692;
                        this.field1667[var22] -= Statics.field1720;
                        this.field1668[var22] -= Statics.field1721;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1665[var25];
                            int var27 = field1726[var25];
                            int var28 = this.field1725[var22] * var27 + this.field1667[var22] * var26 >> 16;
                            this.field1667[var22] = this.field1667[var22] * var27 - this.field1725[var22] * var26 >> 16;
                            this.field1725[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1665[var23];
                            int var30 = field1726[var23];
                            int var31 = this.field1667[var22] * var30 - this.field1668[var22] * var29 >> 16;
                            this.field1668[var22] = this.field1668[var22] * var30 + this.field1667[var22] * var29 >> 16;
                            this.field1667[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1665[var24];
                            int var33 = field1726[var24];
                            int var34 = this.field1725[var22] * var33 + this.field1668[var22] * var32 >> 16;
                            this.field1668[var22] = this.field1668[var22] * var33 - this.field1725[var22] * var32 >> 16;
                            this.field1725[var22] = var34;
                        }
                        this.field1725[var22] += Statics.field1692;
                        this.field1667[var22] += Statics.field1720;
                        this.field1668[var22] += Statics.field1721;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1685.length) {
                    int[] var37 = this.field1685[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1725[var39] -= Statics.field1692;
                        this.field1667[var39] -= Statics.field1720;
                        this.field1668[var39] -= Statics.field1721;
                        this.field1725[var39] = this.field1725[var39] * arg2 / 128;
                        this.field1667[var39] = this.field1667[var39] * arg3 / 128;
                        this.field1668[var39] = this.field1668[var39] * arg4 / 128;
                        this.field1725[var39] += Statics.field1692;
                        this.field1667[var39] += Statics.field1720;
                        this.field1668[var39] += Statics.field1721;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1686 != null && this.field1677 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1686.length) {
                    int[] var42 = this.field1686[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1677[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1677[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dv.t()V")
    public void method2692() {
        for (int var1 = 0; var1 < this.field1687; var1++) {
            int var2 = this.field1725[var1];
            this.field1725[var1] = this.field1668[var1];
            this.field1668[var1] = -var2;
        }
        this.method2676();
    }

    @ObfuscatedName("dv.l()V")
    public void method2689() {
        for (int var1 = 0; var1 < this.field1687; var1++) {
            this.field1725[var1] = -this.field1725[var1];
            this.field1668[var1] = -this.field1668[var1];
        }
        this.method2676();
    }

    @ObfuscatedName("dv.o()V")
    public void method2680() {
        for (int var1 = 0; var1 < this.field1687; var1++) {
            int var2 = this.field1668[var1];
            this.field1668[var1] = this.field1725[var1];
            this.field1725[var1] = -var2;
        }
        this.method2676();
    }

    @ObfuscatedName("dv.u(I)V")
    public void method2737(int arg0) {
        int var2 = field1665[arg0];
        int var3 = field1726[arg0];
        for (int var4 = 0; var4 < this.field1687; var4++) {
            int var5 = this.field1667[var4] * var3 - this.field1668[var4] * var2 >> 16;
            this.field1668[var4] = this.field1668[var4] * var3 + this.field1667[var4] * var2 >> 16;
            this.field1667[var4] = var5;
        }
        this.method2676();
    }

    @ObfuscatedName("dv.y(III)V")
    public void method2739(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1687; var4++) {
            this.field1725[var4] += arg0;
            this.field1667[var4] += arg1;
            this.field1668[var4] += arg2;
        }
        this.method2676();
    }

    @ObfuscatedName("dv.k(III)V")
    public void method2693(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1687; var4++) {
            this.field1725[var4] = this.field1725[var4] * arg0 / 128;
            this.field1667[var4] = this.field1667[var4] * arg1 / 128;
            this.field1668[var4] = this.field1668[var4] * arg2 / 128;
        }
        this.method2676();
    }

    @ObfuscatedName("dv.v(IIIIIII)V")
    public final void method2694(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1709[0] = -1;
        if (this.field1688 != 2 && this.field1688 != 1) {
            this.method2709();
        }
        int var8 = Statics.field1757;
        int var9 = Statics.field1767;
        int var10 = field1665[arg0];
        int var11 = field1726[arg0];
        int var12 = field1665[arg1];
        int var13 = field1726[arg1];
        int var14 = field1665[arg2];
        int var15 = field1726[arg2];
        int var16 = field1665[arg3];
        int var17 = field1726[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1687; var19++) {
            int var20 = this.field1725[var19];
            int var21 = this.field1667[var19];
            int var22 = this.field1668[var19];
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
            field1702[var19] = class130.field1765 * var26 / var30 + var8;
            field1703[var19] = class130.field1765 * var29 / var30 + var9;
            if (this.field1690 > 0) {
                field1681[var19] = var26;
                field1663[var19] = var29;
                field1704[var19] = var30;
            }
        }
        try {
            this.method2697(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dv.c(IIIIIIII)V")
    public final void method2750(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1709[0] = -1;
        if (this.field1688 != 2 && this.field1688 != 1) {
            this.method2709();
        }
        int var9 = Statics.field1757;
        int var10 = Statics.field1767;
        int var11 = field1665[arg0];
        int var12 = field1726[arg0];
        int var13 = field1665[arg1];
        int var14 = field1726[arg1];
        int var15 = field1665[arg2];
        int var16 = field1726[arg2];
        int var17 = field1665[arg3];
        int var18 = field1726[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1687; var20++) {
            int var21 = this.field1725[var20];
            int var22 = this.field1667[var20];
            int var23 = this.field1668[var20];
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
            field1702[var20] = class130.field1765 * var27 / arg7 + var9;
            field1703[var20] = class130.field1765 * var30 / arg7 + var10;
            if (this.field1690 > 0) {
                field1681[var20] = var27;
                field1663[var20] = var30;
                field1704[var20] = var31;
            }
        }
        try {
            this.method2697(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dv.cb(IIIIIIIIJ)V")
    public void method2696(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1709[0] = -1;
        if (this.field1688 != 1) {
            this.method2683();
        }
        this.method2706(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field1707 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field1707) * class130.field1765;
        if (var16 / var14 >= Statics.field1754) {
            return;
        }
        int var17 = (this.field1707 + var15) * class130.field1765;
        if (var17 / var14 <= Statics.field1770) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field1707 * arg1 >> 16;
        int var20 = (var18 + var19) * class130.field1765;
        if (var20 / var14 <= Statics.field1772) {
            return;
        }
        int var21 = (this.field1863 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class130.field1765;
        if (var22 / var14 >= Statics.field1773) {
            return;
        }
        int var23 = (this.field1863 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field1690 > 0;
        int var27 = class128.method1935();
        int var28 = class128.method1927();
        boolean var29 = class128.method291();
        boolean var30 = arg8 != 0L && !class128.method668(arg8);
        boolean var32 = false;
        if (var30 && var29) {
            boolean var33 = false;
            if (field1722) {
                boolean var35;
                if (class128.method291()) {
                    if (!class128.field1734) {
                        int var36 = Statics.field1818;
                        int var37 = Statics.field1821;
                        int var38 = Statics.field1822;
                        int var39 = Statics.field1823;
                        byte var40 = 50;
                        short var41 = 3500;
                        int var42 = (class128.field1731 - Statics.field1757) * var40 / class130.field1765;
                        int var43 = (class128.field1733 - Statics.field1767) * var40 / class130.field1765;
                        int var44 = (class128.field1731 - Statics.field1757) * var41 / class130.field1765;
                        int var45 = (class128.field1733 - Statics.field1767) * var41 / class130.field1765;
                        int var46 = class130.method2811(var43, var40, var37, var36);
                        int var47 = class130.method2812(var43, var40, var37, var36);
                        int var49 = class130.method2811(var45, var41, var37, var36);
                        int var50 = class130.method2812(var45, var41, var37, var36);
                        int var52 = class130.method2809(var42, var47, var39, var38);
                        int var53 = class130.method2876(var42, var47, var39, var38);
                        int var55 = class130.method2809(var44, var50, var39, var38);
                        int var56 = class130.method2876(var44, var50, var39, var38);
                        Statics.field1010 = (var52 + var55) / 2;
                        Statics.field1104 = (var46 + var49) / 2;
                        Statics.field1735 = (var53 + var56) / 2;
                        Statics.field1007 = (var55 - var52) / 2;
                        Statics.field1736 = (var49 - var46) / 2;
                        Statics.field2126 = (var56 - var53) / 2;
                        Statics.field99 = Math.abs(Statics.field1007);
                        Statics.field1737 = Math.abs(Statics.field1736);
                        Statics.field430 = Math.abs(Statics.field2126);
                    }
                    int var58 = this.field1693 + arg5;
                    int var59 = this.field1694 + arg6;
                    int var60 = this.field1695 + arg7;
                    int var61 = this.field1696;
                    int var62 = this.field1705;
                    int var63 = this.field1698;
                    int var64 = Statics.field1010 - var58;
                    int var65 = Statics.field1104 - var59;
                    int var66 = Statics.field1735 - var60;
                    if (Math.abs(var64) > Statics.field99 + var61) {
                        var35 = false;
                    } else if (Math.abs(var65) > Statics.field1737 + var62) {
                        var35 = false;
                    } else if (Math.abs(var66) > Statics.field430 + var63) {
                        var35 = false;
                    } else if (Math.abs(Statics.field1736 * var66 - Statics.field2126 * var65) > Statics.field430 * var62 + Statics.field1737 * var63) {
                        var35 = false;
                    } else if (Math.abs(Statics.field2126 * var64 - Statics.field1007 * var66) > Statics.field99 * var63 + Statics.field430 * var61) {
                        var35 = false;
                    } else if (Math.abs(Statics.field1007 * var65 - Statics.field1736 * var64) > Statics.field99 * var62 + Statics.field1737 * var61) {
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
                int var72 = var27 - Statics.field1757;
                int var73 = var28 - Statics.field1767;
                if (var72 > var68 && var72 < var69 && var73 > var70 && var73 < var71) {
                    var33 = true;
                }
            }
            if (var33) {
                if (this.field1697) {
                    class128.method3756(arg8);
                } else {
                    var32 = true;
                }
            }
        }
        int var74 = Statics.field1757;
        int var75 = Statics.field1767;
        int var76 = 0;
        int var77 = 0;
        if (arg0 != 0) {
            var76 = field1665[arg0];
            var77 = field1726[arg0];
        }
        for (int var78 = 0; var78 < this.field1687; var78++) {
            int var79 = this.field1725[var78];
            int var80 = this.field1667[var78];
            int var81 = this.field1668[var78];
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
            field1682[var78] = var90 - var12;
            if (var90 >= 50) {
                field1702[var78] = class130.field1765 * var86 / var90 + var74;
                field1703[var78] = class130.field1765 * var89 / var90 + var75;
            } else {
                field1702[var78] = -5000;
                var24 = true;
            }
            if (var26) {
                field1681[var78] = var86;
                field1663[var78] = var89;
                field1704[var78] = var90;
            }
        }
        try {
            this.method2697(var24, var32, this.field1697, arg8);
        } catch (Exception var93) {
        }
    }

    @ObfuscatedName("dv.aa(ZZZJ)V")
    public final void method2697(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field1715 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field1715; var6++) {
            field1709[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field1669; var8++) {
            if (this.field1675[var8] != -2) {
                int var9 = this.field1670[var8];
                int var10 = this.field1671[var8];
                int var11 = this.field1719[var8];
                int var12 = field1702[var9];
                int var13 = field1702[var10];
                int var14 = field1702[var11];
                if (arg0 && var12 == -5000 || var13 == -5000 || var14 == -5000) {
                    int var15 = field1681[var9];
                    int var16 = field1681[var10];
                    int var17 = field1681[var11];
                    int var18 = field1663[var9];
                    int var19 = field1663[var10];
                    int var20 = field1663[var11];
                    int var21 = field1704[var9];
                    int var22 = field1704[var10];
                    int var23 = field1704[var11];
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
                        field1680[var8] = true;
                        int var33 = (field1682[var9] + field1682[var10] + field1682[var11]) / 3 + this.field1712;
                        field1710[var33][field1709[var33]++] = var8;
                    }
                } else {
                    if (arg1) {
                        int var34 = field1703[var9];
                        int var35 = field1703[var10];
                        int var36 = field1703[var11];
                        int var37 = class128.field1733 + var7;
                        boolean var38;
                        if (var37 < var34 && var37 < var35 && var37 < var36) {
                            var38 = false;
                        } else {
                            int var39 = class128.field1733 - var7;
                            if (var39 > var34 && var39 > var35 && var39 > var36) {
                                var38 = false;
                            } else {
                                int var40 = class128.field1731 + var7;
                                if (var40 < var12 && var40 < var13 && var40 < var14) {
                                    var38 = false;
                                } else {
                                    int var41 = class128.field1731 - var7;
                                    if (var41 > var12 && var41 > var13 && var41 > var14) {
                                        var38 = false;
                                    } else {
                                        var38 = true;
                                    }
                                }
                            }
                        }
                        if (var38) {
                            class128.method3756(arg3);
                            arg1 = false;
                        }
                    }
                    if ((field1703[var11] - field1703[var10]) * (var12 - var13) - (field1703[var9] - field1703[var10]) * (var14 - var13) > 0) {
                        field1680[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field1769 && var13 <= Statics.field1769 && var14 <= Statics.field1769) {
                            field1700[var8] = false;
                        } else {
                            field1700[var8] = true;
                        }
                        int var42 = (field1682[var9] + field1682[var10] + field1682[var11]) / 3 + this.field1712;
                        field1710[var42][field1709[var42]++] = var8;
                    }
                }
            }
        }
        if (this.field1676 == null) {
            for (int var43 = this.field1715 - 1; var43 >= 0; var43--) {
                int var44 = field1709[var43];
                if (var44 > 0) {
                    int[] var45 = field1710[var43];
                    for (int var46 = 0; var46 < var44; var46++) {
                        this.method2698(var45[var46]);
                    }
                }
            }
            return;
        }
        for (int var47 = 0; var47 < 12; var47++) {
            field1723[var47] = 0;
            field1701[var47] = 0;
        }
        for (int var48 = this.field1715 - 1; var48 >= 0; var48--) {
            int var49 = field1709[var48];
            if (var49 > 0) {
                int[] var50 = field1710[var48];
                for (int var51 = 0; var51 < var49; var51++) {
                    int var52 = var50[var51];
                    byte var53 = this.field1676[var52];
                    int var54 = field1723[var53]++;
                    field1716[var53][var54] = var52;
                    if (var53 < 10) {
                        field1701[var53] += var48;
                    } else if (var53 == 10) {
                        field1713[var54] = var48;
                    } else {
                        field1714[var54] = var48;
                    }
                }
            }
        }
        int var55 = 0;
        if (field1723[1] > 0 || field1723[2] > 0) {
            var55 = (field1701[1] + field1701[2]) / (field1723[1] + field1723[2]);
        }
        int var56 = 0;
        if (field1723[3] > 0 || field1723[4] > 0) {
            var56 = (field1701[3] + field1701[4]) / (field1723[3] + field1723[4]);
        }
        int var57 = 0;
        if (field1723[6] > 0 || field1723[8] > 0) {
            var57 = (field1701[6] + field1701[8]) / (field1723[6] + field1723[8]);
        }
        int var58 = 0;
        int var59 = field1723[10];
        int[] var60 = field1716[10];
        int[] var61 = field1713;
        if (var58 == var59) {
            var58 = 0;
            var59 = field1723[11];
            var60 = field1716[11];
            var61 = field1714;
        }
        int var62;
        if (var58 < var59) {
            var62 = var61[var58];
        } else {
            var62 = -1000;
        }
        for (int var63 = 0; var63 < 10; var63++) {
            while (var63 == 0 && var62 > var55) {
                this.method2698(var60[var58++]);
                if (var58 == var59 && field1716[11] != var60) {
                    var58 = 0;
                    var59 = field1723[11];
                    var60 = field1716[11];
                    var61 = field1714;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            while (var63 == 3 && var62 > var56) {
                this.method2698(var60[var58++]);
                if (var58 == var59 && field1716[11] != var60) {
                    var58 = 0;
                    var59 = field1723[11];
                    var60 = field1716[11];
                    var61 = field1714;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            while (var63 == 5 && var62 > var57) {
                this.method2698(var60[var58++]);
                if (var58 == var59 && field1716[11] != var60) {
                    var58 = 0;
                    var59 = field1723[11];
                    var60 = field1716[11];
                    var61 = field1714;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            int var64 = field1723[var63];
            int[] var65 = field1716[var63];
            for (int var66 = 0; var66 < var64; var66++) {
                this.method2698(var65[var66]);
            }
        }
        while (var62 != -1000) {
            this.method2698(var60[var58++]);
            if (var58 == var59 && field1716[11] != var60) {
                var58 = 0;
                var60 = field1716[11];
                var59 = field1723[11];
                var61 = field1714;
            }
            if (var58 < var59) {
                var62 = var61[var58];
            } else {
                var62 = -1000;
            }
        }
    }

    @ObfuscatedName("dv.ab(I)V")
    public final void method2698(int arg0) {
        if (field1680[arg0]) {
            this.method2699(arg0);
            return;
        }
        int var2 = this.field1670[arg0];
        int var3 = this.field1671[arg0];
        int var4 = this.field1719[arg0];
        class130.field1764 = field1700[arg0];
        if (this.field1677 == null) {
            class130.field1758 = 0;
        } else {
            class130.field1758 = this.field1677[arg0] & 0xFF;
        }
        if (this.field1679 != null && this.field1679[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1730 == null || this.field1730[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1730[arg0] & 0xFF;
                var6 = this.field1729[var5];
                var7 = this.field1683[var5];
                var8 = this.field1684[var5];
            }
            if (this.field1675[arg0] == -1) {
                class130.method2802(field1703[var2], field1703[var3], field1703[var4], field1702[var2], field1702[var3], field1702[var4], this.field1673[arg0], this.field1673[arg0], this.field1673[arg0], field1681[var6], field1681[var7], field1681[var8], field1663[var6], field1663[var7], field1663[var8], field1704[var6], field1704[var7], field1704[var8], this.field1679[arg0]);
            } else {
                class130.method2802(field1703[var2], field1703[var3], field1703[var4], field1702[var2], field1702[var3], field1702[var4], this.field1673[arg0], this.field1674[arg0], this.field1675[arg0], field1681[var6], field1681[var7], field1681[var8], field1663[var6], field1663[var7], field1663[var8], field1704[var6], field1704[var7], field1704[var8], this.field1679[arg0]);
            }
        } else if (this.field1675[arg0] == -1) {
            class130.method2800(field1703[var2], field1703[var3], field1703[var4], field1702[var2], field1702[var3], field1702[var4], field1727[this.field1673[arg0]]);
        } else {
            class130.method2861(field1703[var2], field1703[var3], field1703[var4], field1702[var2], field1702[var3], field1702[var4], this.field1673[arg0], this.field1674[arg0], this.field1675[arg0]);
        }
    }

    @ObfuscatedName("dv.ah(I)V")
    public final void method2699(int arg0) {
        int var2 = Statics.field1757;
        int var3 = Statics.field1767;
        int var4 = 0;
        int var5 = this.field1670[arg0];
        int var6 = this.field1671[arg0];
        int var7 = this.field1719[arg0];
        int var8 = field1704[var5];
        int var9 = field1704[var6];
        int var10 = field1704[var7];
        if (this.field1677 == null) {
            class130.field1758 = 0;
        } else {
            class130.field1758 = this.field1677[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1706[var4] = field1702[var5];
            field1717[var4] = field1703[var5];
            field1718[var4++] = this.field1673[arg0];
        } else {
            int var11 = field1681[var5];
            int var12 = field1663[var5];
            int var13 = this.field1673[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1711[var10 - var8];
                field1706[var4] = (((field1681[var7] - var11) * var14 >> 16) + var11) * class130.field1765 / 50 + var2;
                field1717[var4] = (((field1663[var7] - var12) * var14 >> 16) + var12) * class130.field1765 / 50 + var3;
                field1718[var4++] = ((this.field1675[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1711[var9 - var8];
                field1706[var4] = (((field1681[var6] - var11) * var15 >> 16) + var11) * class130.field1765 / 50 + var2;
                field1717[var4] = (((field1663[var6] - var12) * var15 >> 16) + var12) * class130.field1765 / 50 + var3;
                field1718[var4++] = ((this.field1674[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1706[var4] = field1702[var6];
            field1717[var4] = field1703[var6];
            field1718[var4++] = this.field1674[arg0];
        } else {
            int var16 = field1681[var6];
            int var17 = field1663[var6];
            int var18 = this.field1674[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1711[var8 - var9];
                field1706[var4] = (((field1681[var5] - var16) * var19 >> 16) + var16) * class130.field1765 / 50 + var2;
                field1717[var4] = (((field1663[var5] - var17) * var19 >> 16) + var17) * class130.field1765 / 50 + var3;
                field1718[var4++] = ((this.field1673[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1711[var10 - var9];
                field1706[var4] = (((field1681[var7] - var16) * var20 >> 16) + var16) * class130.field1765 / 50 + var2;
                field1717[var4] = (((field1663[var7] - var17) * var20 >> 16) + var17) * class130.field1765 / 50 + var3;
                field1718[var4++] = ((this.field1675[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1706[var4] = field1702[var7];
            field1717[var4] = field1703[var7];
            field1718[var4++] = this.field1675[arg0];
        } else {
            int var21 = field1681[var7];
            int var22 = field1663[var7];
            int var23 = this.field1675[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1711[var9 - var10];
                field1706[var4] = (((field1681[var6] - var21) * var24 >> 16) + var21) * class130.field1765 / 50 + var2;
                field1717[var4] = (((field1663[var6] - var22) * var24 >> 16) + var22) * class130.field1765 / 50 + var3;
                field1718[var4++] = ((this.field1674[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1711[var8 - var10];
                field1706[var4] = (((field1681[var5] - var21) * var25 >> 16) + var21) * class130.field1765 / 50 + var2;
                field1717[var4] = (((field1663[var5] - var22) * var25 >> 16) + var22) * class130.field1765 / 50 + var3;
                field1718[var4++] = ((this.field1673[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1706[0];
        int var27 = field1706[1];
        int var28 = field1706[2];
        int var29 = field1717[0];
        int var30 = field1717[1];
        int var31 = field1717[2];
        class130.field1764 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1769 || var27 > Statics.field1769 || var28 > Statics.field1769) {
                class130.field1764 = true;
            }
            if (this.field1679 != null && this.field1679[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1730 == null || this.field1730[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1730[arg0] & 0xFF;
                    var33 = this.field1729[var32];
                    var34 = this.field1683[var32];
                    var35 = this.field1684[var32];
                }
                if (this.field1675[arg0] == -1) {
                    class130.method2802(var29, var30, var31, var26, var27, var28, this.field1673[arg0], this.field1673[arg0], this.field1673[arg0], field1681[var33], field1681[var34], field1681[var35], field1663[var33], field1663[var34], field1663[var35], field1704[var33], field1704[var34], field1704[var35], this.field1679[arg0]);
                } else {
                    class130.method2802(var29, var30, var31, var26, var27, var28, field1718[0], field1718[1], field1718[2], field1681[var33], field1681[var34], field1681[var35], field1663[var33], field1663[var34], field1663[var35], field1704[var33], field1704[var34], field1704[var35], this.field1679[arg0]);
                }
            } else if (this.field1675[arg0] == -1) {
                class130.method2800(var29, var30, var31, var26, var27, var28, field1727[this.field1673[arg0]]);
            } else {
                class130.method2861(var29, var30, var31, var26, var27, var28, field1718[0], field1718[1], field1718[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1769 || var27 > Statics.field1769 || var28 > Statics.field1769 || field1706[3] < 0 || field1706[3] > Statics.field1769) {
            class130.field1764 = true;
        }
        if (this.field1679 != null && this.field1679[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1730 == null || this.field1730[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1730[arg0] & 0xFF;
                var37 = this.field1729[var36];
                var38 = this.field1683[var36];
                var39 = this.field1684[var36];
            }
            short var40 = this.field1679[arg0];
            if (this.field1675[arg0] == -1) {
                class130.method2802(var29, var30, var31, var26, var27, var28, this.field1673[arg0], this.field1673[arg0], this.field1673[arg0], field1681[var37], field1681[var38], field1681[var39], field1663[var37], field1663[var38], field1663[var39], field1704[var37], field1704[var38], field1704[var39], var40);
                class130.method2802(var29, var31, field1717[3], var26, var28, field1706[3], this.field1673[arg0], this.field1673[arg0], this.field1673[arg0], field1681[var37], field1681[var38], field1681[var39], field1663[var37], field1663[var38], field1663[var39], field1704[var37], field1704[var38], field1704[var39], var40);
            } else {
                class130.method2802(var29, var30, var31, var26, var27, var28, field1718[0], field1718[1], field1718[2], field1681[var37], field1681[var38], field1681[var39], field1663[var37], field1663[var38], field1663[var39], field1704[var37], field1704[var38], field1704[var39], var40);
                class130.method2802(var29, var31, field1717[3], var26, var28, field1706[3], field1718[0], field1718[2], field1718[3], field1681[var37], field1681[var38], field1681[var39], field1663[var37], field1663[var38], field1663[var39], field1704[var37], field1704[var38], field1704[var39], var40);
            }
        } else if (this.field1675[arg0] == -1) {
            int var41 = field1727[this.field1673[arg0]];
            class130.method2800(var29, var30, var31, var26, var27, var28, var41);
            class130.method2800(var29, var31, field1717[3], var26, var28, field1706[3], var41);
        } else {
            class130.method2861(var29, var30, var31, var26, var27, var28, field1718[0], field1718[1], field1718[2]);
            class130.method2861(var29, var31, field1717[3], var26, var28, field1706[3], field1718[0], field1718[2], field1718[3]);
        }
    }
}
