package deob;

@ObfuscatedName("dm")
public class class128 extends class136 {

    @ObfuscatedName("dm.q")
    public static class128 field1704 = new class128();

    @ObfuscatedName("dm.w")
    public static byte[] field1706 = new byte[1];

    @ObfuscatedName("dm.e")
    public static class128 field1709 = new class128();

    @ObfuscatedName("dm.p")
    public static byte[] field1723 = new byte[1];

    @ObfuscatedName("dm.k")
    public int field1676 = 0;

    @ObfuscatedName("dm.l")
    public int[] field1677;

    @ObfuscatedName("dm.b")
    public int[] field1678;

    @ObfuscatedName("dm.i")
    public int[] field1679;

    @ObfuscatedName("dm.c")
    public int field1680 = 0;

    @ObfuscatedName("dm.f")
    public int[] field1681;

    @ObfuscatedName("dm.m")
    public int[] field1682;

    @ObfuscatedName("dm.u")
    public int[] field1683;

    @ObfuscatedName("dm.x")
    public int[] field1698;

    @ObfuscatedName("dm.r")
    public int[] field1685;

    @ObfuscatedName("dm.v")
    public int[] field1686;

    @ObfuscatedName("dm.y")
    public byte[] field1713;

    @ObfuscatedName("dm.g")
    public byte[] field1688;

    @ObfuscatedName("dm.a")
    public byte[] field1689;

    @ObfuscatedName("dm.j")
    public short[] field1690;

    @ObfuscatedName("dm.t")
    public byte field1691 = 0;

    @ObfuscatedName("dm.h")
    public int field1692 = 0;

    @ObfuscatedName("dm.o")
    public int[] field1693;

    @ObfuscatedName("dm.n")
    public int[] field1694;

    @ObfuscatedName("dm.d")
    public int[] field1695;

    @ObfuscatedName("dm.s")
    public int[][] field1696;

    @ObfuscatedName("dm.z")
    public int[][] field1710;

    @ObfuscatedName("dm.al")
    public boolean field1731 = false;

    @ObfuscatedName("dm.av")
    public int field1699;

    @ObfuscatedName("dm.as")
    public int field1707;

    @ObfuscatedName("dm.aw")
    public int field1674;

    @ObfuscatedName("dm.ad")
    public int field1702;

    @ObfuscatedName("dm.ag")
    public int field1703;

    @ObfuscatedName("dm.ar")
    public int field1735;

    @ObfuscatedName("dm.ax")
    public int field1705;

    @ObfuscatedName("dm.az")
    public int field1701;

    @ObfuscatedName("dm.ae")
    public int field1672 = -1;

    @ObfuscatedName("dm.ao")
    public int field1708 = -1;

    @ObfuscatedName("dm.aj")
    public int field1675 = -1;

    @ObfuscatedName("dm.ac")
    public static boolean[] field1711 = new boolean[4700];

    @ObfuscatedName("dm.ap")
    public static boolean[] field1724 = new boolean[4700];

    @ObfuscatedName("dm.aq")
    public static int[] field1720 = new int[4700];

    @ObfuscatedName("dm.aa")
    public static int[] field1714 = new int[4700];

    @ObfuscatedName("dm.an")
    public static int[] field1715 = new int[4700];

    @ObfuscatedName("dm.au")
    public static int[] field1716 = new int[4700];

    @ObfuscatedName("dm.ai")
    public static int[] field1717 = new int[4700];

    @ObfuscatedName("dm.ak")
    public static int[] field1718 = new int[4700];

    @ObfuscatedName("dm.am")
    public static int[] field1712 = new int[1600];

    @ObfuscatedName("dm.ay")
    public static int[][] field1721 = new int[1600][512];

    @ObfuscatedName("dm.af")
    public static int[] field1722 = new int[12];

    @ObfuscatedName("dm.ab")
    public static int[][] field1730 = new int[12][2000];

    @ObfuscatedName("dm.bp")
    public static int[] field1740 = new int[2000];

    @ObfuscatedName("dm.bz")
    public static int[] field1725 = new int[2000];

    @ObfuscatedName("dm.bi")
    public static int[] field1726 = new int[12];

    @ObfuscatedName("dm.bg")
    public static int[] field1727 = new int[10];

    @ObfuscatedName("dm.bh")
    public static int[] field1700 = new int[10];

    @ObfuscatedName("dm.bm")
    public static int[] field1729 = new int[10];

    @ObfuscatedName("dm.bo")
    public static boolean field1733 = true;

    @ObfuscatedName("dm.bj")
    public static int[] field1684 = class131.field1788;

    @ObfuscatedName("dm.bl")
    public static int[] field1737 = class131.field1785;

    @ObfuscatedName("dm.bd")
    public static int[] field1738 = class131.field1784;

    @ObfuscatedName("dm.by")
    public static int[] field1739 = class131.field1787;

    public class128() {
    }

    public class128(class128[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1676 = 0;
        this.field1680 = 0;
        this.field1692 = 0;
        this.field1691 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class128 var8 = arg0[var7];
            if (var8 != null) {
                this.field1676 += var8.field1676;
                this.field1680 += var8.field1680;
                this.field1692 += var8.field1692;
                if (var8.field1713 == null) {
                    if (this.field1691 == -1) {
                        this.field1691 = var8.field1691;
                    }
                    if (this.field1691 != var8.field1691) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1688 != null;
                var5 |= var8.field1690 != null;
                var6 |= var8.field1689 != null;
            }
        }
        this.field1677 = new int[this.field1676];
        this.field1678 = new int[this.field1676];
        this.field1679 = new int[this.field1676];
        this.field1681 = new int[this.field1680];
        this.field1682 = new int[this.field1680];
        this.field1683 = new int[this.field1680];
        this.field1698 = new int[this.field1680];
        this.field1685 = new int[this.field1680];
        this.field1686 = new int[this.field1680];
        if (var3) {
            this.field1713 = new byte[this.field1680];
        }
        if (var4) {
            this.field1688 = new byte[this.field1680];
        }
        if (var5) {
            this.field1690 = new short[this.field1680];
        }
        if (var6) {
            this.field1689 = new byte[this.field1680];
        }
        if (this.field1692 > 0) {
            this.field1693 = new int[this.field1692];
            this.field1694 = new int[this.field1692];
            this.field1695 = new int[this.field1692];
        }
        this.field1676 = 0;
        this.field1680 = 0;
        this.field1692 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class128 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1680; var11++) {
                    this.field1681[this.field1680] = var10.field1681[var11] + this.field1676;
                    this.field1682[this.field1680] = var10.field1682[var11] + this.field1676;
                    this.field1683[this.field1680] = var10.field1683[var11] + this.field1676;
                    this.field1698[this.field1680] = var10.field1698[var11];
                    this.field1685[this.field1680] = var10.field1685[var11];
                    this.field1686[this.field1680] = var10.field1686[var11];
                    if (var3) {
                        if (var10.field1713 == null) {
                            this.field1713[this.field1680] = var10.field1691;
                        } else {
                            this.field1713[this.field1680] = var10.field1713[var11];
                        }
                    }
                    if (var4 && var10.field1688 != null) {
                        this.field1688[this.field1680] = var10.field1688[var11];
                    }
                    if (var5) {
                        if (var10.field1690 == null) {
                            this.field1690[this.field1680] = -1;
                        } else {
                            this.field1690[this.field1680] = var10.field1690[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1689 == null || var10.field1689[var11] == -1) {
                            this.field1689[this.field1680] = -1;
                        } else {
                            this.field1689[this.field1680] = (byte) (var10.field1689[var11] + this.field1692);
                        }
                    }
                    this.field1680++;
                }
                for (int var12 = 0; var12 < var10.field1692; var12++) {
                    this.field1693[this.field1692] = var10.field1693[var12] + this.field1676;
                    this.field1694[this.field1692] = var10.field1694[var12] + this.field1676;
                    this.field1695[this.field1692] = var10.field1695[var12] + this.field1676;
                    this.field1692++;
                }
                for (int var13 = 0; var13 < var10.field1676; var13++) {
                    this.field1677[this.field1676] = var10.field1677[var13];
                    this.field1678[this.field1676] = var10.field1678[var13];
                    this.field1679[this.field1676] = var10.field1679[var13];
                    this.field1676++;
                }
            }
        }
    }

    @ObfuscatedName("dm.q([[IIIIZI)Ldm;")
    public class128 method2601(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2642();
        int var7 = arg1 - this.field1674;
        int var8 = this.field1674 + arg1;
        int var9 = arg3 - this.field1674;
        int var10 = this.field1674 + arg3;
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
            var15.field1676 = this.field1676;
            var15.field1680 = this.field1680;
            var15.field1692 = this.field1692;
            var15.field1677 = this.field1677;
            var15.field1679 = this.field1679;
            var15.field1681 = this.field1681;
            var15.field1682 = this.field1682;
            var15.field1683 = this.field1683;
            var15.field1698 = this.field1698;
            var15.field1685 = this.field1685;
            var15.field1686 = this.field1686;
            var15.field1713 = this.field1713;
            var15.field1688 = this.field1688;
            var15.field1689 = this.field1689;
            var15.field1690 = this.field1690;
            var15.field1691 = this.field1691;
            var15.field1693 = this.field1693;
            var15.field1694 = this.field1694;
            var15.field1695 = this.field1695;
            var15.field1696 = this.field1696;
            var15.field1710 = this.field1710;
            var15.field1731 = this.field1731;
            var15.field1678 = new int[var15.field1676];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1676; var16++) {
                int var17 = this.field1677[var16] + arg1;
                int var18 = this.field1679[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1678[var16] = this.field1678[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1676; var26++) {
                int var27 = (-this.field1678[var26] << 16) / this.field1874;
                if (var27 < arg5) {
                    int var28 = this.field1677[var26] + arg1;
                    int var29 = this.field1679[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1678[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1678[var26];
                }
            }
        }
        var15.method2608();
        return var15;
    }

    @ObfuscatedName("dm.w(Z)Ldm;")
    public class128 method2602(boolean arg0) {
        if (!arg0 && field1706.length < this.field1680) {
            field1706 = new byte[this.field1680 + 100];
        }
        return this.method2673(arg0, field1704, field1706);
    }

    @ObfuscatedName("dm.e(Z)Ldm;")
    public class128 method2603(boolean arg0) {
        if (!arg0 && field1723.length < this.field1680) {
            field1723 = new byte[this.field1680 + 100];
        }
        return this.method2673(arg0, field1709, field1723);
    }

    @ObfuscatedName("dm.p(ZLdm;[B)Ldm;")
    public class128 method2673(boolean arg0, class128 arg1, byte[] arg2) {
        arg1.field1676 = this.field1676;
        arg1.field1680 = this.field1680;
        arg1.field1692 = this.field1692;
        if (arg1.field1677 == null || arg1.field1677.length < this.field1676) {
            arg1.field1677 = new int[this.field1676 + 100];
            arg1.field1678 = new int[this.field1676 + 100];
            arg1.field1679 = new int[this.field1676 + 100];
        }
        for (int var4 = 0; var4 < this.field1676; var4++) {
            arg1.field1677[var4] = this.field1677[var4];
            arg1.field1678[var4] = this.field1678[var4];
            arg1.field1679[var4] = this.field1679[var4];
        }
        if (arg0) {
            arg1.field1688 = this.field1688;
        } else {
            arg1.field1688 = arg2;
            if (this.field1688 == null) {
                for (int var5 = 0; var5 < this.field1680; var5++) {
                    arg1.field1688[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1680; var6++) {
                    arg1.field1688[var6] = this.field1688[var6];
                }
            }
        }
        arg1.field1681 = this.field1681;
        arg1.field1682 = this.field1682;
        arg1.field1683 = this.field1683;
        arg1.field1698 = this.field1698;
        arg1.field1685 = this.field1685;
        arg1.field1686 = this.field1686;
        arg1.field1713 = this.field1713;
        arg1.field1689 = this.field1689;
        arg1.field1690 = this.field1690;
        arg1.field1691 = this.field1691;
        arg1.field1693 = this.field1693;
        arg1.field1694 = this.field1694;
        arg1.field1695 = this.field1695;
        arg1.field1696 = this.field1696;
        arg1.field1710 = this.field1710;
        arg1.field1731 = this.field1731;
        arg1.method2608();
        return arg1;
    }

    @ObfuscatedName("dm.k(I)V")
    public void method2604(int arg0) {
        if (this.field1672 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1737[arg0];
        int var9 = field1684[arg0];
        for (int var10 = 0; var10 < this.field1676; var10++) {
            int var11 = class131.method2783(this.field1677[var10], this.field1679[var10], var8, var9);
            int var12 = this.field1678[var10];
            int var13 = class131.method2804(this.field1677[var10], this.field1679[var10], var8, var9);
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
        this.field1735 = (var2 + var5) / 2;
        this.field1705 = (var3 + var6) / 2;
        this.field1701 = (var4 + var7) / 2;
        this.field1672 = (var5 - var2 + 1) / 2;
        this.field1708 = (var6 - var3 + 1) / 2;
        this.field1675 = (var7 - var4 + 1) / 2;
        if (this.field1672 < 32) {
            this.field1672 = 32;
        }
        if (this.field1675 < 32) {
            this.field1675 = 32;
        }
        if (this.field1731) {
            this.field1672 += 8;
            this.field1675 += 8;
        }
    }

    @ObfuscatedName("dm.l()V")
    public void method2642() {
        if (this.field1699 == 1) {
            return;
        }
        this.field1699 = 1;
        this.field1874 = 0;
        this.field1707 = 0;
        this.field1674 = 0;
        for (int var1 = 0; var1 < this.field1676; var1++) {
            int var2 = this.field1677[var1];
            int var3 = this.field1678[var1];
            int var4 = this.field1679[var1];
            if (-var3 > this.field1874) {
                this.field1874 = -var3;
            }
            if (var3 > this.field1707) {
                this.field1707 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1674) {
                this.field1674 = var5;
            }
        }
        this.field1674 = (int) (Math.sqrt((double) this.field1674) + 0.99D);
        this.field1703 = (int) (Math.sqrt((double) (this.field1874 * this.field1874 + this.field1674 * this.field1674)) + 0.99D);
        this.field1702 = this.field1703 + (int) (Math.sqrt((double) (this.field1707 * this.field1707 + this.field1674 * this.field1674)) + 0.99D);
    }

    @ObfuscatedName("dm.b()V")
    public void method2653() {
        if (this.field1699 == 2) {
            return;
        }
        this.field1699 = 2;
        this.field1674 = 0;
        for (int var1 = 0; var1 < this.field1676; var1++) {
            int var2 = this.field1677[var1];
            int var3 = this.field1678[var1];
            int var4 = this.field1679[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1674) {
                this.field1674 = var5;
            }
        }
        this.field1674 = (int) (Math.sqrt((double) this.field1674) + 0.99D);
        this.field1703 = this.field1674;
        this.field1702 = this.field1674 + this.field1674;
    }

    @ObfuscatedName("dm.i()I")
    public int method2607() {
        this.method2642();
        return this.field1674;
    }

    @ObfuscatedName("dm.u()V")
    public void method2608() {
        this.field1699 = 0;
        this.field1672 = -1;
    }

    @ObfuscatedName("dm.x(Lek;I)V")
    public void method2631(class139 arg0, int arg1) {
        if (this.field1696 == null || arg1 == -1) {
            return;
        }
        class126 var3 = arg0.field1894[arg1];
        class133 var4 = var3.field1635;
        Statics.field1728 = 0;
        Statics.field1673 = 0;
        Statics.field1732 = 0;
        for (int var5 = 0; var5 < var3.field1638; var5++) {
            int var6 = var3.field1641[var5];
            this.method2611(var4.field1799[var6], var4.field1797[var6], var3.field1642[var5], var3.field1643[var5], var3.field1644[var5]);
        }
        this.method2608();
    }

    @ObfuscatedName("dm.r(Lek;ILek;I[I)V")
    public void method2610(class139 arg0, int arg1, class139 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2631(arg0, arg1);
            return;
        }
        class126 var6 = arg0.field1894[arg1];
        class126 var7 = arg2.field1894[arg3];
        class133 var8 = var6.field1635;
        Statics.field1728 = 0;
        Statics.field1673 = 0;
        Statics.field1732 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1638; var11++) {
            int var12 = var6.field1641[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1799[var12] == 0) {
                this.method2611(var8.field1799[var12], var8.field1797[var12], var6.field1642[var11], var6.field1643[var11], var6.field1644[var11]);
            }
        }
        Statics.field1728 = 0;
        Statics.field1673 = 0;
        Statics.field1732 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1638; var15++) {
            int var16 = var7.field1641[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1799[var16] == 0) {
                this.method2611(var8.field1799[var16], var8.field1797[var16], var7.field1642[var15], var7.field1643[var15], var7.field1644[var15]);
            }
        }
        this.method2608();
    }

    @ObfuscatedName("dm.v(I[IIII)V")
    public void method2611(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1728 = 0;
            Statics.field1673 = 0;
            Statics.field1732 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1696.length) {
                    int[] var10 = this.field1696[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1728 += this.field1677[var12];
                        Statics.field1673 += this.field1678[var12];
                        Statics.field1732 += this.field1679[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1728 = Statics.field1728 / var7 + arg2;
                Statics.field1673 = Statics.field1673 / var7 + arg3;
                Statics.field1732 = Statics.field1732 / var7 + arg4;
            } else {
                Statics.field1728 = arg2;
                Statics.field1673 = arg3;
                Statics.field1732 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1696.length) {
                    int[] var15 = this.field1696[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1677[var17] += arg2;
                        this.field1678[var17] += arg3;
                        this.field1679[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1696.length) {
                    int[] var20 = this.field1696[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1677[var22] -= Statics.field1728;
                        this.field1678[var22] -= Statics.field1673;
                        this.field1679[var22] -= Statics.field1732;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1684[var25];
                            int var27 = field1737[var25];
                            int var28 = this.field1678[var22] * var26 + this.field1677[var22] * var27 >> 16;
                            this.field1678[var22] = this.field1678[var22] * var27 - this.field1677[var22] * var26 >> 16;
                            this.field1677[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1684[var23];
                            int var30 = field1737[var23];
                            int var31 = this.field1678[var22] * var30 - this.field1679[var22] * var29 >> 16;
                            this.field1679[var22] = this.field1679[var22] * var30 + this.field1678[var22] * var29 >> 16;
                            this.field1678[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1684[var24];
                            int var33 = field1737[var24];
                            int var34 = this.field1679[var22] * var32 + this.field1677[var22] * var33 >> 16;
                            this.field1679[var22] = this.field1679[var22] * var33 - this.field1677[var22] * var32 >> 16;
                            this.field1677[var22] = var34;
                        }
                        this.field1677[var22] += Statics.field1728;
                        this.field1678[var22] += Statics.field1673;
                        this.field1679[var22] += Statics.field1732;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1696.length) {
                    int[] var37 = this.field1696[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1677[var39] -= Statics.field1728;
                        this.field1678[var39] -= Statics.field1673;
                        this.field1679[var39] -= Statics.field1732;
                        this.field1677[var39] = this.field1677[var39] * arg2 / 128;
                        this.field1678[var39] = this.field1678[var39] * arg3 / 128;
                        this.field1679[var39] = this.field1679[var39] * arg4 / 128;
                        this.field1677[var39] += Statics.field1728;
                        this.field1678[var39] += Statics.field1673;
                        this.field1679[var39] += Statics.field1732;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1710 != null && this.field1688 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1710.length) {
                    int[] var42 = this.field1710[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1688[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1688[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dm.y()V")
    public void method2612() {
        for (int var1 = 0; var1 < this.field1676; var1++) {
            int var2 = this.field1677[var1];
            this.field1677[var1] = this.field1679[var1];
            this.field1679[var1] = -var2;
        }
        this.method2608();
    }

    @ObfuscatedName("dm.g()V")
    public void method2613() {
        for (int var1 = 0; var1 < this.field1676; var1++) {
            this.field1677[var1] = -this.field1677[var1];
            this.field1679[var1] = -this.field1679[var1];
        }
        this.method2608();
    }

    @ObfuscatedName("dm.a()V")
    public void method2614() {
        for (int var1 = 0; var1 < this.field1676; var1++) {
            int var2 = this.field1679[var1];
            this.field1679[var1] = this.field1677[var1];
            this.field1677[var1] = -var2;
        }
        this.method2608();
    }

    @ObfuscatedName("dm.j(I)V")
    public void method2606(int arg0) {
        int var2 = field1684[arg0];
        int var3 = field1737[arg0];
        for (int var4 = 0; var4 < this.field1676; var4++) {
            int var5 = this.field1678[var4] * var3 - this.field1679[var4] * var2 >> 16;
            this.field1679[var4] = this.field1679[var4] * var3 + this.field1678[var4] * var2 >> 16;
            this.field1678[var4] = var5;
        }
        this.method2608();
    }

    @ObfuscatedName("dm.o(III)V")
    public void method2644(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1676; var4++) {
            this.field1677[var4] += arg0;
            this.field1678[var4] += arg1;
            this.field1679[var4] += arg2;
        }
        this.method2608();
    }

    @ObfuscatedName("dm.d(III)V")
    public void method2687(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1676; var4++) {
            this.field1677[var4] = this.field1677[var4] * arg0 / 128;
            this.field1678[var4] = this.field1678[var4] * arg1 / 128;
            this.field1679[var4] = this.field1679[var4] * arg2 / 128;
        }
        this.method2608();
    }

    @ObfuscatedName("dm.s(IIIIIII)V")
    public final void method2609(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1712[0] = -1;
        if (this.field1699 != 2 && this.field1699 != 1) {
            this.method2653();
        }
        int var8 = Statics.field1775;
        int var9 = Statics.field1776;
        int var10 = field1684[arg0];
        int var11 = field1737[arg0];
        int var12 = field1684[arg1];
        int var13 = field1737[arg1];
        int var14 = field1684[arg2];
        int var15 = field1737[arg2];
        int var16 = field1684[arg3];
        int var17 = field1737[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1676; var19++) {
            int var20 = this.field1677[var19];
            int var21 = this.field1678[var19];
            int var22 = this.field1679[var19];
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
            field1715[var19] = var30 - var18;
            field1720[var19] = class131.field1774 * var26 / var30 + var8;
            field1714[var19] = class131.field1774 * var29 / var30 + var9;
            if (this.field1692 > 0) {
                field1716[var19] = var26;
                field1717[var19] = var29;
                field1718[var19] = var30;
            }
        }
        try {
            this.method2621(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dm.z(IIIIIIII)V")
    public final void method2619(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1712[0] = -1;
        if (this.field1699 != 2 && this.field1699 != 1) {
            this.method2653();
        }
        int var9 = Statics.field1775;
        int var10 = Statics.field1776;
        int var11 = field1684[arg0];
        int var12 = field1737[arg0];
        int var13 = field1684[arg1];
        int var14 = field1737[arg1];
        int var15 = field1684[arg2];
        int var16 = field1737[arg2];
        int var17 = field1684[arg3];
        int var18 = field1737[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1676; var20++) {
            int var21 = this.field1677[var20];
            int var22 = this.field1678[var20];
            int var23 = this.field1679[var20];
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
            field1715[var20] = var31 - var19;
            field1720[var20] = class131.field1774 * var27 / arg7 + var9;
            field1714[var20] = class131.field1774 * var30 / arg7 + var10;
            if (this.field1692 > 0) {
                field1716[var20] = var27;
                field1717[var20] = var30;
                field1718[var20] = var31;
            }
        }
        try {
            this.method2621(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dm.ct(IIIIIIIIJ)V")
    public void method2620(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1712[0] = -1;
        if (this.field1699 != 1) {
            this.method2642();
        }
        this.method2604(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field1674 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field1674) * class131.field1774;
        if (var16 / var14 >= Statics.field1780) {
            return;
        }
        int var17 = (this.field1674 + var15) * class131.field1774;
        if (var17 / var14 <= Statics.field1779) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field1674 * arg1 >> 16;
        int var20 = (var18 + var19) * class131.field1774;
        if (var20 / var14 <= Statics.field1781) {
            return;
        }
        int var21 = (this.field1874 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class131.field1774;
        if (var22 / var14 >= Statics.field1778) {
            return;
        }
        int var23 = (this.field1874 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field1692 > 0;
        int var27 = class129.field1743;
        int var29 = class129.field1744;
        boolean var31 = class129.field1754;
        boolean var33 = arg8 != 0L;
        if (var33) {
            boolean var34 = (int) (arg8 >>> 16 & 0x1L) == 1;
            var33 = !var34;
        }
        boolean var37 = false;
        if (var33 && var31) {
            boolean var38 = false;
            if (field1733) {
                var38 = class129.method3009(this, arg5, arg6, arg7);
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
                int var44 = var27 - Statics.field1775;
                int var45 = var29 - Statics.field1776;
                if (var44 > var40 && var44 < var41 && var45 > var42 && var45 < var43) {
                    var38 = true;
                }
            }
            if (var38) {
                if (this.field1731) {
                    class129.field1751[++class129.field1749 - 1] = arg8;
                } else {
                    var37 = true;
                }
            }
        }
        int var48 = Statics.field1775;
        int var49 = Statics.field1776;
        int var50 = 0;
        int var51 = 0;
        if (arg0 != 0) {
            var50 = field1684[arg0];
            var51 = field1737[arg0];
        }
        for (int var52 = 0; var52 < this.field1676; var52++) {
            int var53 = this.field1677[var52];
            int var54 = this.field1678[var52];
            int var55 = this.field1679[var52];
            if (arg0 != 0) {
                int var56 = var50 * var55 + var51 * var53 >> 16;
                var55 = var51 * var55 - var50 * var53 >> 16;
                var53 = var56;
            }
            int var57 = arg5 + var53;
            int var58 = arg6 + var54;
            int var59 = arg7 + var55;
            int var60 = arg3 * var59 + arg4 * var57 >> 16;
            int var61 = arg4 * var59 - arg3 * var57 >> 16;
            int var63 = arg2 * var58 - arg1 * var61 >> 16;
            int var64 = arg1 * var58 + arg2 * var61 >> 16;
            field1715[var52] = var64 - var12;
            if (var64 >= 50) {
                field1720[var52] = class131.field1774 * var60 / var64 + var48;
                field1714[var52] = class131.field1774 * var63 / var64 + var49;
            } else {
                field1720[var52] = -5000;
                var24 = true;
            }
            if (var26) {
                field1716[var52] = var60;
                field1717[var52] = var63;
                field1718[var52] = var64;
            }
        }
        try {
            this.method2621(var24, var37, this.field1731, arg8);
        } catch (Exception var67) {
        }
    }

    @ObfuscatedName("dm.al(ZZZJ)V")
    public final void method2621(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field1702 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field1702; var6++) {
            field1712[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field1680; var8++) {
            if (this.field1686[var8] != -2) {
                int var9 = this.field1681[var8];
                int var10 = this.field1682[var8];
                int var11 = this.field1683[var8];
                int var12 = field1720[var9];
                int var13 = field1720[var10];
                int var14 = field1720[var11];
                if (arg0 && var12 == -5000 || var13 == -5000 || var14 == -5000) {
                    int var15 = field1716[var9];
                    int var16 = field1716[var10];
                    int var17 = field1716[var11];
                    int var18 = field1717[var9];
                    int var19 = field1717[var10];
                    int var20 = field1717[var11];
                    int var21 = field1718[var9];
                    int var22 = field1718[var10];
                    int var23 = field1718[var11];
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
                        field1724[var8] = true;
                        int var33 = (field1715[var9] + field1715[var10] + field1715[var11]) / 3 + this.field1703;
                        field1721[var33][field1712[var33]++] = var8;
                    }
                } else {
                    if (arg1) {
                        int var34 = field1714[var9];
                        int var35 = field1714[var10];
                        int var36 = field1714[var11];
                        int var37 = class129.field1744 + var7;
                        boolean var38;
                        if (var37 < var34 && var37 < var35 && var37 < var36) {
                            var38 = false;
                        } else {
                            int var39 = class129.field1744 - var7;
                            if (var39 > var34 && var39 > var35 && var39 > var36) {
                                var38 = false;
                            } else {
                                int var40 = class129.field1743 + var7;
                                if (var40 < var12 && var40 < var13 && var40 < var14) {
                                    var38 = false;
                                } else {
                                    int var41 = class129.field1743 - var7;
                                    if (var41 > var12 && var41 > var13 && var41 > var14) {
                                        var38 = false;
                                    } else {
                                        var38 = true;
                                    }
                                }
                            }
                        }
                        if (var38) {
                            class129.field1751[++class129.field1749 - 1] = arg3;
                            arg1 = false;
                        }
                    }
                    if ((field1714[var11] - field1714[var10]) * (var12 - var13) - (field1714[var9] - field1714[var10]) * (var14 - var13) > 0) {
                        field1724[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field1789 && var13 <= Statics.field1789 && var14 <= Statics.field1789) {
                            field1711[var8] = false;
                        } else {
                            field1711[var8] = true;
                        }
                        int var44 = (field1715[var9] + field1715[var10] + field1715[var11]) / 3 + this.field1703;
                        field1721[var44][field1712[var44]++] = var8;
                    }
                }
            }
        }
        if (this.field1713 == null) {
            for (int var45 = this.field1702 - 1; var45 >= 0; var45--) {
                int var46 = field1712[var45];
                if (var46 > 0) {
                    int[] var47 = field1721[var45];
                    for (int var48 = 0; var48 < var46; var48++) {
                        this.method2622(var47[var48]);
                    }
                }
            }
            return;
        }
        for (int var49 = 0; var49 < 12; var49++) {
            field1722[var49] = 0;
            field1726[var49] = 0;
        }
        for (int var50 = this.field1702 - 1; var50 >= 0; var50--) {
            int var51 = field1712[var50];
            if (var51 > 0) {
                int[] var52 = field1721[var50];
                for (int var53 = 0; var53 < var51; var53++) {
                    int var54 = var52[var53];
                    byte var55 = this.field1713[var54];
                    int var56 = field1722[var55]++;
                    field1730[var55][var56] = var54;
                    if (var55 < 10) {
                        field1726[var55] += var50;
                    } else if (var55 == 10) {
                        field1740[var56] = var50;
                    } else {
                        field1725[var56] = var50;
                    }
                }
            }
        }
        int var57 = 0;
        if (field1722[1] > 0 || field1722[2] > 0) {
            var57 = (field1726[1] + field1726[2]) / (field1722[1] + field1722[2]);
        }
        int var58 = 0;
        if (field1722[3] > 0 || field1722[4] > 0) {
            var58 = (field1726[3] + field1726[4]) / (field1722[3] + field1722[4]);
        }
        int var59 = 0;
        if (field1722[6] > 0 || field1722[8] > 0) {
            var59 = (field1726[6] + field1726[8]) / (field1722[6] + field1722[8]);
        }
        int var60 = 0;
        int var61 = field1722[10];
        int[] var62 = field1730[10];
        int[] var63 = field1740;
        if (var60 == var61) {
            var60 = 0;
            var61 = field1722[11];
            var62 = field1730[11];
            var63 = field1725;
        }
        int var64;
        if (var60 < var61) {
            var64 = var63[var60];
        } else {
            var64 = -1000;
        }
        for (int var65 = 0; var65 < 10; var65++) {
            while (var65 == 0 && var64 > var57) {
                this.method2622(var62[var60++]);
                if (var60 == var61 && field1730[11] != var62) {
                    var60 = 0;
                    var61 = field1722[11];
                    var62 = field1730[11];
                    var63 = field1725;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            while (var65 == 3 && var64 > var58) {
                this.method2622(var62[var60++]);
                if (var60 == var61 && field1730[11] != var62) {
                    var60 = 0;
                    var61 = field1722[11];
                    var62 = field1730[11];
                    var63 = field1725;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            while (var65 == 5 && var64 > var59) {
                this.method2622(var62[var60++]);
                if (var60 == var61 && field1730[11] != var62) {
                    var60 = 0;
                    var61 = field1722[11];
                    var62 = field1730[11];
                    var63 = field1725;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            int var66 = field1722[var65];
            int[] var67 = field1730[var65];
            for (int var68 = 0; var68 < var66; var68++) {
                this.method2622(var67[var68]);
            }
        }
        while (var64 != -1000) {
            this.method2622(var62[var60++]);
            if (var60 == var61 && field1730[11] != var62) {
                var60 = 0;
                var62 = field1730[11];
                var61 = field1722[11];
                var63 = field1725;
            }
            if (var60 < var61) {
                var64 = var63[var60];
            } else {
                var64 = -1000;
            }
        }
    }

    @ObfuscatedName("dm.av(I)V")
    public final void method2622(int arg0) {
        if (field1724[arg0]) {
            this.method2623(arg0);
            return;
        }
        int var2 = this.field1681[arg0];
        int var3 = this.field1682[arg0];
        int var4 = this.field1683[arg0];
        class131.field1764 = field1711[arg0];
        if (this.field1688 == null) {
            class131.field1767 = 0;
        } else {
            class131.field1767 = this.field1688[arg0] & 0xFF;
        }
        if (this.field1690 != null && this.field1690[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1689 == null || this.field1689[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1689[arg0] & 0xFF;
                var6 = this.field1693[var5];
                var7 = this.field1694[var5];
                var8 = this.field1695[var5];
            }
            if (this.field1686[arg0] == -1) {
                class131.method2729(field1714[var2], field1714[var3], field1714[var4], field1720[var2], field1720[var3], field1720[var4], this.field1698[arg0], this.field1698[arg0], this.field1698[arg0], field1716[var6], field1716[var7], field1716[var8], field1717[var6], field1717[var7], field1717[var8], field1718[var6], field1718[var7], field1718[var8], this.field1690[arg0]);
            } else {
                class131.method2729(field1714[var2], field1714[var3], field1714[var4], field1720[var2], field1720[var3], field1720[var4], this.field1698[arg0], this.field1685[arg0], this.field1686[arg0], field1716[var6], field1716[var7], field1716[var8], field1717[var6], field1717[var7], field1717[var8], field1718[var6], field1718[var7], field1718[var8], this.field1690[arg0]);
            }
        } else if (this.field1686[arg0] == -1) {
            class131.method2750(field1714[var2], field1714[var3], field1714[var4], field1720[var2], field1720[var3], field1720[var4], field1738[this.field1698[arg0]]);
        } else {
            class131.method2763(field1714[var2], field1714[var3], field1714[var4], field1720[var2], field1720[var3], field1720[var4], this.field1698[arg0], this.field1685[arg0], this.field1686[arg0]);
        }
    }

    @ObfuscatedName("dm.as(I)V")
    public final void method2623(int arg0) {
        int var2 = Statics.field1775;
        int var3 = Statics.field1776;
        int var4 = 0;
        int var5 = this.field1681[arg0];
        int var6 = this.field1682[arg0];
        int var7 = this.field1683[arg0];
        int var8 = field1718[var5];
        int var9 = field1718[var6];
        int var10 = field1718[var7];
        if (this.field1688 == null) {
            class131.field1767 = 0;
        } else {
            class131.field1767 = this.field1688[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1727[var4] = field1720[var5];
            field1700[var4] = field1714[var5];
            field1729[var4++] = this.field1698[arg0];
        } else {
            int var11 = field1716[var5];
            int var12 = field1717[var5];
            int var13 = this.field1698[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1739[var10 - var8];
                field1727[var4] = (((field1716[var7] - var11) * var14 >> 16) + var11) * class131.field1774 / 50 + var2;
                field1700[var4] = (((field1717[var7] - var12) * var14 >> 16) + var12) * class131.field1774 / 50 + var3;
                field1729[var4++] = ((this.field1686[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1739[var9 - var8];
                field1727[var4] = (((field1716[var6] - var11) * var15 >> 16) + var11) * class131.field1774 / 50 + var2;
                field1700[var4] = (((field1717[var6] - var12) * var15 >> 16) + var12) * class131.field1774 / 50 + var3;
                field1729[var4++] = ((this.field1685[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1727[var4] = field1720[var6];
            field1700[var4] = field1714[var6];
            field1729[var4++] = this.field1685[arg0];
        } else {
            int var16 = field1716[var6];
            int var17 = field1717[var6];
            int var18 = this.field1685[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1739[var8 - var9];
                field1727[var4] = (((field1716[var5] - var16) * var19 >> 16) + var16) * class131.field1774 / 50 + var2;
                field1700[var4] = (((field1717[var5] - var17) * var19 >> 16) + var17) * class131.field1774 / 50 + var3;
                field1729[var4++] = ((this.field1698[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1739[var10 - var9];
                field1727[var4] = (((field1716[var7] - var16) * var20 >> 16) + var16) * class131.field1774 / 50 + var2;
                field1700[var4] = (((field1717[var7] - var17) * var20 >> 16) + var17) * class131.field1774 / 50 + var3;
                field1729[var4++] = ((this.field1686[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1727[var4] = field1720[var7];
            field1700[var4] = field1714[var7];
            field1729[var4++] = this.field1686[arg0];
        } else {
            int var21 = field1716[var7];
            int var22 = field1717[var7];
            int var23 = this.field1686[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1739[var9 - var10];
                field1727[var4] = (((field1716[var6] - var21) * var24 >> 16) + var21) * class131.field1774 / 50 + var2;
                field1700[var4] = (((field1717[var6] - var22) * var24 >> 16) + var22) * class131.field1774 / 50 + var3;
                field1729[var4++] = ((this.field1685[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1739[var8 - var10];
                field1727[var4] = (((field1716[var5] - var21) * var25 >> 16) + var21) * class131.field1774 / 50 + var2;
                field1700[var4] = (((field1717[var5] - var22) * var25 >> 16) + var22) * class131.field1774 / 50 + var3;
                field1729[var4++] = ((this.field1698[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1727[0];
        int var27 = field1727[1];
        int var28 = field1727[2];
        int var29 = field1700[0];
        int var30 = field1700[1];
        int var31 = field1700[2];
        class131.field1764 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1789 || var27 > Statics.field1789 || var28 > Statics.field1789) {
                class131.field1764 = true;
            }
            if (this.field1690 != null && this.field1690[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1689 == null || this.field1689[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1689[arg0] & 0xFF;
                    var33 = this.field1693[var32];
                    var34 = this.field1694[var32];
                    var35 = this.field1695[var32];
                }
                if (this.field1686[arg0] == -1) {
                    class131.method2729(var29, var30, var31, var26, var27, var28, this.field1698[arg0], this.field1698[arg0], this.field1698[arg0], field1716[var33], field1716[var34], field1716[var35], field1717[var33], field1717[var34], field1717[var35], field1718[var33], field1718[var34], field1718[var35], this.field1690[arg0]);
                } else {
                    class131.method2729(var29, var30, var31, var26, var27, var28, field1729[0], field1729[1], field1729[2], field1716[var33], field1716[var34], field1716[var35], field1717[var33], field1717[var34], field1717[var35], field1718[var33], field1718[var34], field1718[var35], this.field1690[arg0]);
                }
            } else if (this.field1686[arg0] == -1) {
                class131.method2750(var29, var30, var31, var26, var27, var28, field1738[this.field1698[arg0]]);
            } else {
                class131.method2763(var29, var30, var31, var26, var27, var28, field1729[0], field1729[1], field1729[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1789 || var27 > Statics.field1789 || var28 > Statics.field1789 || field1727[3] < 0 || field1727[3] > Statics.field1789) {
            class131.field1764 = true;
        }
        if (this.field1690 != null && this.field1690[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1689 == null || this.field1689[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1689[arg0] & 0xFF;
                var37 = this.field1693[var36];
                var38 = this.field1694[var36];
                var39 = this.field1695[var36];
            }
            short var40 = this.field1690[arg0];
            if (this.field1686[arg0] == -1) {
                class131.method2729(var29, var30, var31, var26, var27, var28, this.field1698[arg0], this.field1698[arg0], this.field1698[arg0], field1716[var37], field1716[var38], field1716[var39], field1717[var37], field1717[var38], field1717[var39], field1718[var37], field1718[var38], field1718[var39], var40);
                class131.method2729(var29, var31, field1700[3], var26, var28, field1727[3], this.field1698[arg0], this.field1698[arg0], this.field1698[arg0], field1716[var37], field1716[var38], field1716[var39], field1717[var37], field1717[var38], field1717[var39], field1718[var37], field1718[var38], field1718[var39], var40);
            } else {
                class131.method2729(var29, var30, var31, var26, var27, var28, field1729[0], field1729[1], field1729[2], field1716[var37], field1716[var38], field1716[var39], field1717[var37], field1717[var38], field1717[var39], field1718[var37], field1718[var38], field1718[var39], var40);
                class131.method2729(var29, var31, field1700[3], var26, var28, field1727[3], field1729[0], field1729[2], field1729[3], field1716[var37], field1716[var38], field1716[var39], field1717[var37], field1717[var38], field1717[var39], field1718[var37], field1718[var38], field1718[var39], var40);
            }
        } else if (this.field1686[arg0] == -1) {
            int var41 = field1738[this.field1698[arg0]];
            class131.method2750(var29, var30, var31, var26, var27, var28, var41);
            class131.method2750(var29, var31, field1700[3], var26, var28, field1727[3], var41);
        } else {
            class131.method2763(var29, var30, var31, var26, var27, var28, field1729[0], field1729[1], field1729[2]);
            class131.method2763(var29, var31, field1700[3], var26, var28, field1727[3], field1729[0], field1729[2], field1729[3]);
        }
    }
}
