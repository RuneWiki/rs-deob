package deob;

@ObfuscatedName("dx")
public class class128 extends class136 {

    @ObfuscatedName("dx.c")
    public static class128 field1682 = new class128();

    @ObfuscatedName("dx.t")
    public static byte[] field1658 = new byte[1];

    @ObfuscatedName("dx.o")
    public static class128 field1659 = new class128();

    @ObfuscatedName("dx.e")
    public static byte[] field1675 = new byte[1];

    @ObfuscatedName("dx.i")
    public int field1661 = 0;

    @ObfuscatedName("dx.g")
    public int[] field1662;

    @ObfuscatedName("dx.d")
    public int[] field1663;

    @ObfuscatedName("dx.l")
    public int[] field1664;

    @ObfuscatedName("dx.j")
    public int field1691 = 0;

    @ObfuscatedName("dx.m")
    public int[] field1698;

    @ObfuscatedName("dx.p")
    public int[] field1667;

    @ObfuscatedName("dx.h")
    public int[] field1692;

    @ObfuscatedName("dx.v")
    public int[] field1669;

    @ObfuscatedName("dx.n")
    public int[] field1670;

    @ObfuscatedName("dx.x")
    public int[] field1704;

    @ObfuscatedName("dx.w")
    public byte[] field1672;

    @ObfuscatedName("dx.k")
    public byte[] field1673;

    @ObfuscatedName("dx.q")
    public byte[] field1687;

    @ObfuscatedName("dx.z")
    public short[] field1696;

    @ObfuscatedName("dx.y")
    public byte field1676 = 0;

    @ObfuscatedName("dx.f")
    public int field1677 = 0;

    @ObfuscatedName("dx.b")
    public int[] field1678;

    @ObfuscatedName("dx.r")
    public int[] field1679;

    @ObfuscatedName("dx.s")
    public int[] field1657;

    @ObfuscatedName("dx.a")
    public int[][] field1681;

    @ObfuscatedName("dx.u")
    public int[][] field1722;

    @ObfuscatedName("dx.ae")
    public boolean field1683 = false;

    @ObfuscatedName("dx.af")
    public int field1684;

    @ObfuscatedName("dx.az")
    public int field1703;

    @ObfuscatedName("dx.ax")
    public int field1686;

    @ObfuscatedName("dx.aj")
    public int field1668;

    @ObfuscatedName("dx.au")
    public int field1688;

    @ObfuscatedName("dx.ay")
    public int field1689;

    @ObfuscatedName("dx.aa")
    public int field1690;

    @ObfuscatedName("dx.aq")
    public int field1665;

    @ObfuscatedName("dx.as")
    public int field1693 = -1;

    @ObfuscatedName("dx.ak")
    public int field1706 = -1;

    @ObfuscatedName("dx.ac")
    public int field1680 = -1;

    @ObfuscatedName("dx.ar")
    public static boolean[] field1674 = new boolean[4700];

    @ObfuscatedName("dx.av")
    public static boolean[] field1697 = new boolean[4700];

    @ObfuscatedName("dx.al")
    public static int[] field1725 = new int[4700];

    @ObfuscatedName("dx.ad")
    public static int[] field1666 = new int[4700];

    @ObfuscatedName("dx.am")
    public static int[] field1700 = new int[4700];

    @ObfuscatedName("dx.ao")
    public static int[] field1701 = new int[4700];

    @ObfuscatedName("dx.at")
    public static int[] field1702 = new int[4700];

    @ObfuscatedName("dx.an")
    public static int[] field1694 = new int[4700];

    @ObfuscatedName("dx.ai")
    public static int[] field1705 = new int[1600];

    @ObfuscatedName("dx.ab")
    public static int[][] field1723 = new int[1600][512];

    @ObfuscatedName("dx.ap")
    public static int[] field1671 = new int[12];

    @ObfuscatedName("dx.ah")
    public static int[][] field1708 = new int[12][2000];

    @ObfuscatedName("dx.bq")
    public static int[] field1709 = new int[2000];

    @ObfuscatedName("dx.bf")
    public static int[] field1710 = new int[2000];

    @ObfuscatedName("dx.bc")
    public static int[] field1685 = new int[12];

    @ObfuscatedName("dx.bk")
    public static int[] field1712 = new int[10];

    @ObfuscatedName("dx.bb")
    public static int[] field1713 = new int[10];

    @ObfuscatedName("dx.bi")
    public static int[] field1720 = new int[10];

    @ObfuscatedName("dx.be")
    public static boolean field1718 = true;

    @ObfuscatedName("dx.bn")
    public static int[] field1721 = class131.field1780;

    @ObfuscatedName("dx.bm")
    public static int[] field1699 = class131.field1781;

    @ObfuscatedName("dx.ba")
    public static int[] field1714 = class131.field1776;

    @ObfuscatedName("dx.bd")
    public static int[] field1724 = class131.field1779;

    public class128() {
    }

    public class128(class128[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1661 = 0;
        this.field1691 = 0;
        this.field1677 = 0;
        this.field1676 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class128 var8 = arg0[var7];
            if (var8 != null) {
                this.field1661 += var8.field1661;
                this.field1691 += var8.field1691;
                this.field1677 += var8.field1677;
                if (var8.field1672 == null) {
                    if (this.field1676 == -1) {
                        this.field1676 = var8.field1676;
                    }
                    if (this.field1676 != var8.field1676) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1673 != null;
                var5 |= var8.field1696 != null;
                var6 |= var8.field1687 != null;
            }
        }
        this.field1662 = new int[this.field1661];
        this.field1663 = new int[this.field1661];
        this.field1664 = new int[this.field1661];
        this.field1698 = new int[this.field1691];
        this.field1667 = new int[this.field1691];
        this.field1692 = new int[this.field1691];
        this.field1669 = new int[this.field1691];
        this.field1670 = new int[this.field1691];
        this.field1704 = new int[this.field1691];
        if (var3) {
            this.field1672 = new byte[this.field1691];
        }
        if (var4) {
            this.field1673 = new byte[this.field1691];
        }
        if (var5) {
            this.field1696 = new short[this.field1691];
        }
        if (var6) {
            this.field1687 = new byte[this.field1691];
        }
        if (this.field1677 > 0) {
            this.field1678 = new int[this.field1677];
            this.field1679 = new int[this.field1677];
            this.field1657 = new int[this.field1677];
        }
        this.field1661 = 0;
        this.field1691 = 0;
        this.field1677 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class128 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1691; var11++) {
                    this.field1698[this.field1691] = var10.field1698[var11] + this.field1661;
                    this.field1667[this.field1691] = var10.field1667[var11] + this.field1661;
                    this.field1692[this.field1691] = var10.field1692[var11] + this.field1661;
                    this.field1669[this.field1691] = var10.field1669[var11];
                    this.field1670[this.field1691] = var10.field1670[var11];
                    this.field1704[this.field1691] = var10.field1704[var11];
                    if (var3) {
                        if (var10.field1672 == null) {
                            this.field1672[this.field1691] = var10.field1676;
                        } else {
                            this.field1672[this.field1691] = var10.field1672[var11];
                        }
                    }
                    if (var4 && var10.field1673 != null) {
                        this.field1673[this.field1691] = var10.field1673[var11];
                    }
                    if (var5) {
                        if (var10.field1696 == null) {
                            this.field1696[this.field1691] = -1;
                        } else {
                            this.field1696[this.field1691] = var10.field1696[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1687 == null || var10.field1687[var11] == -1) {
                            this.field1687[this.field1691] = -1;
                        } else {
                            this.field1687[this.field1691] = (byte) (var10.field1687[var11] + this.field1677);
                        }
                    }
                    this.field1691++;
                }
                for (int var12 = 0; var12 < var10.field1677; var12++) {
                    this.field1678[this.field1677] = var10.field1678[var12] + this.field1661;
                    this.field1679[this.field1677] = var10.field1679[var12] + this.field1661;
                    this.field1657[this.field1677] = var10.field1657[var12] + this.field1661;
                    this.field1677++;
                }
                for (int var13 = 0; var13 < var10.field1661; var13++) {
                    this.field1662[this.field1661] = var10.field1662[var13];
                    this.field1663[this.field1661] = var10.field1663[var13];
                    this.field1664[this.field1661] = var10.field1664[var13];
                    this.field1661++;
                }
            }
        }
    }

    @ObfuscatedName("dx.c([[IIIIZI)Ldx;")
    public class128 method2665(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2722();
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
            var15.field1661 = this.field1661;
            var15.field1691 = this.field1691;
            var15.field1677 = this.field1677;
            var15.field1662 = this.field1662;
            var15.field1664 = this.field1664;
            var15.field1698 = this.field1698;
            var15.field1667 = this.field1667;
            var15.field1692 = this.field1692;
            var15.field1669 = this.field1669;
            var15.field1670 = this.field1670;
            var15.field1704 = this.field1704;
            var15.field1672 = this.field1672;
            var15.field1673 = this.field1673;
            var15.field1687 = this.field1687;
            var15.field1696 = this.field1696;
            var15.field1676 = this.field1676;
            var15.field1678 = this.field1678;
            var15.field1679 = this.field1679;
            var15.field1657 = this.field1657;
            var15.field1681 = this.field1681;
            var15.field1722 = this.field1722;
            var15.field1683 = this.field1683;
            var15.field1663 = new int[var15.field1661];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1661; var16++) {
                int var17 = this.field1662[var16] + arg1;
                int var18 = this.field1664[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1663[var16] = this.field1663[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1661; var26++) {
                int var27 = (-this.field1663[var26] << 16) / this.field1869;
                if (var27 < arg5) {
                    int var28 = this.field1662[var26] + arg1;
                    int var29 = this.field1664[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1663[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1663[var26];
                }
            }
        }
        var15.method2673();
        return var15;
    }

    @ObfuscatedName("dx.t(Z)Ldx;")
    public class128 method2666(boolean arg0) {
        if (!arg0 && field1658.length < this.field1691) {
            field1658 = new byte[this.field1691 + 100];
        }
        return this.method2668(arg0, field1682, field1658);
    }

    @ObfuscatedName("dx.o(Z)Ldx;")
    public class128 method2667(boolean arg0) {
        if (!arg0 && field1675.length < this.field1691) {
            field1675 = new byte[this.field1691 + 100];
        }
        return this.method2668(arg0, field1659, field1675);
    }

    @ObfuscatedName("dx.e(ZLdx;[B)Ldx;")
    public class128 method2668(boolean arg0, class128 arg1, byte[] arg2) {
        arg1.field1661 = this.field1661;
        arg1.field1691 = this.field1691;
        arg1.field1677 = this.field1677;
        if (arg1.field1662 == null || arg1.field1662.length < this.field1661) {
            arg1.field1662 = new int[this.field1661 + 100];
            arg1.field1663 = new int[this.field1661 + 100];
            arg1.field1664 = new int[this.field1661 + 100];
        }
        for (int var4 = 0; var4 < this.field1661; var4++) {
            arg1.field1662[var4] = this.field1662[var4];
            arg1.field1663[var4] = this.field1663[var4];
            arg1.field1664[var4] = this.field1664[var4];
        }
        if (arg0) {
            arg1.field1673 = this.field1673;
        } else {
            arg1.field1673 = arg2;
            if (this.field1673 == null) {
                for (int var5 = 0; var5 < this.field1691; var5++) {
                    arg1.field1673[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1691; var6++) {
                    arg1.field1673[var6] = this.field1673[var6];
                }
            }
        }
        arg1.field1698 = this.field1698;
        arg1.field1667 = this.field1667;
        arg1.field1692 = this.field1692;
        arg1.field1669 = this.field1669;
        arg1.field1670 = this.field1670;
        arg1.field1704 = this.field1704;
        arg1.field1672 = this.field1672;
        arg1.field1687 = this.field1687;
        arg1.field1696 = this.field1696;
        arg1.field1676 = this.field1676;
        arg1.field1678 = this.field1678;
        arg1.field1679 = this.field1679;
        arg1.field1657 = this.field1657;
        arg1.field1681 = this.field1681;
        arg1.field1722 = this.field1722;
        arg1.field1683 = this.field1683;
        arg1.method2673();
        return arg1;
    }

    @ObfuscatedName("dx.i(I)V")
    public void method2713(int arg0) {
        if (this.field1693 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1699[arg0];
        int var9 = field1721[arg0];
        for (int var10 = 0; var10 < this.field1661; var10++) {
            int var11 = class131.method2819(this.field1662[var10], this.field1664[var10], var8, var9);
            int var12 = this.field1663[var10];
            int var13 = class131.method2820(this.field1662[var10], this.field1664[var10], var8, var9);
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
        this.field1689 = (var2 + var5) / 2;
        this.field1690 = (var3 + var6) / 2;
        this.field1665 = (var4 + var7) / 2;
        this.field1693 = (var5 - var2 + 1) / 2;
        this.field1706 = (var6 - var3 + 1) / 2;
        this.field1680 = (var7 - var4 + 1) / 2;
        if (this.field1693 < 32) {
            this.field1693 = 32;
        }
        if (this.field1680 < 32) {
            this.field1680 = 32;
        }
        if (this.field1683) {
            this.field1693 += 8;
            this.field1680 += 8;
        }
    }

    @ObfuscatedName("dx.g()V")
    public void method2722() {
        if (this.field1684 == 1) {
            return;
        }
        this.field1684 = 1;
        this.field1869 = 0;
        this.field1703 = 0;
        this.field1686 = 0;
        for (int var1 = 0; var1 < this.field1661; var1++) {
            int var2 = this.field1662[var1];
            int var3 = this.field1663[var1];
            int var4 = this.field1664[var1];
            if (-var3 > this.field1869) {
                this.field1869 = -var3;
            }
            if (var3 > this.field1703) {
                this.field1703 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1686) {
                this.field1686 = var5;
            }
        }
        this.field1686 = (int) (Math.sqrt((double) this.field1686) + 0.99D);
        this.field1688 = (int) (Math.sqrt((double) (this.field1869 * this.field1869 + this.field1686 * this.field1686)) + 0.99D);
        this.field1668 = this.field1688 + (int) (Math.sqrt((double) (this.field1703 * this.field1703 + this.field1686 * this.field1686)) + 0.99D);
    }

    @ObfuscatedName("dx.d()V")
    public void method2686() {
        if (this.field1684 == 2) {
            return;
        }
        this.field1684 = 2;
        this.field1686 = 0;
        for (int var1 = 0; var1 < this.field1661; var1++) {
            int var2 = this.field1662[var1];
            int var3 = this.field1663[var1];
            int var4 = this.field1664[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1686) {
                this.field1686 = var5;
            }
        }
        this.field1686 = (int) (Math.sqrt((double) this.field1686) + 0.99D);
        this.field1688 = this.field1686;
        this.field1668 = this.field1686 + this.field1686;
    }

    @ObfuscatedName("dx.l()I")
    public int method2688() {
        this.method2722();
        return this.field1686;
    }

    @ObfuscatedName("dx.m()V")
    public void method2673() {
        this.field1684 = 0;
        this.field1693 = -1;
    }

    @ObfuscatedName("dx.p(Les;I)V")
    public void method2741(class139 arg0, int arg1) {
        if (this.field1681 == null || arg1 == -1) {
            return;
        }
        class126 var3 = arg0.field1885[arg1];
        class133 var4 = var3.field1625;
        Statics.field1715 = 0;
        Statics.field1716 = 0;
        Statics.field1717 = 0;
        for (int var5 = 0; var5 < var3.field1626; var5++) {
            int var6 = var3.field1627[var5];
            this.method2664(var4.field1793[var6], var4.field1790[var6], var3.field1621[var5], var3.field1631[var5], var3.field1630[var5]);
        }
        this.method2673();
    }

    @ObfuscatedName("dx.h(Les;ILes;I[I)V")
    public void method2675(class139 arg0, int arg1, class139 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2741(arg0, arg1);
            return;
        }
        class126 var6 = arg0.field1885[arg1];
        class126 var7 = arg2.field1885[arg3];
        class133 var8 = var6.field1625;
        Statics.field1715 = 0;
        Statics.field1716 = 0;
        Statics.field1717 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1626; var11++) {
            int var12 = var6.field1627[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1793[var12] == 0) {
                this.method2664(var8.field1793[var12], var8.field1790[var12], var6.field1621[var11], var6.field1631[var11], var6.field1630[var11]);
            }
        }
        Statics.field1715 = 0;
        Statics.field1716 = 0;
        Statics.field1717 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1626; var15++) {
            int var16 = var7.field1627[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1793[var16] == 0) {
                this.method2664(var8.field1793[var16], var8.field1790[var16], var7.field1621[var15], var7.field1631[var15], var7.field1630[var15]);
            }
        }
        this.method2673();
    }

    @ObfuscatedName("dx.v(I[IIII)V")
    public void method2664(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1715 = 0;
            Statics.field1716 = 0;
            Statics.field1717 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1681.length) {
                    int[] var10 = this.field1681[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1715 += this.field1662[var12];
                        Statics.field1716 += this.field1663[var12];
                        Statics.field1717 += this.field1664[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1715 = Statics.field1715 / var7 + arg2;
                Statics.field1716 = Statics.field1716 / var7 + arg3;
                Statics.field1717 = Statics.field1717 / var7 + arg4;
            } else {
                Statics.field1715 = arg2;
                Statics.field1716 = arg3;
                Statics.field1717 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1681.length) {
                    int[] var15 = this.field1681[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1662[var17] += arg2;
                        this.field1663[var17] += arg3;
                        this.field1664[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1681.length) {
                    int[] var20 = this.field1681[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1662[var22] -= Statics.field1715;
                        this.field1663[var22] -= Statics.field1716;
                        this.field1664[var22] -= Statics.field1717;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1721[var25];
                            int var27 = field1699[var25];
                            int var28 = this.field1663[var22] * var26 + this.field1662[var22] * var27 >> 16;
                            this.field1663[var22] = this.field1663[var22] * var27 - this.field1662[var22] * var26 >> 16;
                            this.field1662[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1721[var23];
                            int var30 = field1699[var23];
                            int var31 = this.field1663[var22] * var30 - this.field1664[var22] * var29 >> 16;
                            this.field1664[var22] = this.field1664[var22] * var30 + this.field1663[var22] * var29 >> 16;
                            this.field1663[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1721[var24];
                            int var33 = field1699[var24];
                            int var34 = this.field1664[var22] * var32 + this.field1662[var22] * var33 >> 16;
                            this.field1664[var22] = this.field1664[var22] * var33 - this.field1662[var22] * var32 >> 16;
                            this.field1662[var22] = var34;
                        }
                        this.field1662[var22] += Statics.field1715;
                        this.field1663[var22] += Statics.field1716;
                        this.field1664[var22] += Statics.field1717;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1681.length) {
                    int[] var37 = this.field1681[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1662[var39] -= Statics.field1715;
                        this.field1663[var39] -= Statics.field1716;
                        this.field1664[var39] -= Statics.field1717;
                        this.field1662[var39] = this.field1662[var39] * arg2 / 128;
                        this.field1663[var39] = this.field1663[var39] * arg3 / 128;
                        this.field1664[var39] = this.field1664[var39] * arg4 / 128;
                        this.field1662[var39] += Statics.field1715;
                        this.field1663[var39] += Statics.field1716;
                        this.field1664[var39] += Statics.field1717;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1722 != null && this.field1673 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1722.length) {
                    int[] var42 = this.field1722[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1673[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1673[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dx.n()V")
    public void method2689() {
        for (int var1 = 0; var1 < this.field1661; var1++) {
            int var2 = this.field1662[var1];
            this.field1662[var1] = this.field1664[var1];
            this.field1664[var1] = -var2;
        }
        this.method2673();
    }

    @ObfuscatedName("dx.x()V")
    public void method2721() {
        for (int var1 = 0; var1 < this.field1661; var1++) {
            this.field1662[var1] = -this.field1662[var1];
            this.field1664[var1] = -this.field1664[var1];
        }
        this.method2673();
    }

    @ObfuscatedName("dx.w()V")
    public void method2678() {
        for (int var1 = 0; var1 < this.field1661; var1++) {
            int var2 = this.field1664[var1];
            this.field1664[var1] = this.field1662[var1];
            this.field1662[var1] = -var2;
        }
        this.method2673();
    }

    @ObfuscatedName("dx.q(I)V")
    public void method2679(int arg0) {
        int var2 = field1721[arg0];
        int var3 = field1699[arg0];
        for (int var4 = 0; var4 < this.field1661; var4++) {
            int var5 = this.field1663[var4] * var3 - this.field1664[var4] * var2 >> 16;
            this.field1664[var4] = this.field1664[var4] * var3 + this.field1663[var4] * var2 >> 16;
            this.field1663[var4] = var5;
        }
        this.method2673();
    }

    @ObfuscatedName("dx.z(III)V")
    public void method2680(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1661; var4++) {
            this.field1662[var4] += arg0;
            this.field1663[var4] += arg1;
            this.field1664[var4] += arg2;
        }
        this.method2673();
    }

    @ObfuscatedName("dx.y(III)V")
    public void method2750(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1661; var4++) {
            this.field1662[var4] = this.field1662[var4] * arg0 / 128;
            this.field1663[var4] = this.field1663[var4] * arg1 / 128;
            this.field1664[var4] = this.field1664[var4] * arg2 / 128;
        }
        this.method2673();
    }

    @ObfuscatedName("dx.f(IIIIIII)V")
    public final void method2682(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1705[0] = -1;
        if (this.field1684 != 2 && this.field1684 != 1) {
            this.method2686();
        }
        int var8 = Statics.field1767;
        int var9 = Statics.field1768;
        int var10 = field1721[arg0];
        int var11 = field1699[arg0];
        int var12 = field1721[arg1];
        int var13 = field1699[arg1];
        int var14 = field1721[arg2];
        int var15 = field1699[arg2];
        int var16 = field1721[arg3];
        int var17 = field1699[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1661; var19++) {
            int var20 = this.field1662[var19];
            int var21 = this.field1663[var19];
            int var22 = this.field1664[var19];
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
            field1700[var19] = var30 - var18;
            field1725[var19] = class131.field1766 * var26 / var30 + var8;
            field1666[var19] = class131.field1766 * var29 / var30 + var9;
            if (this.field1677 > 0) {
                field1701[var19] = var26;
                field1702[var19] = var29;
                field1694[var19] = var30;
            }
        }
        try {
            this.method2683(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dx.a(IIIIIIII)V")
    public final void method2674(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1705[0] = -1;
        if (this.field1684 != 2 && this.field1684 != 1) {
            this.method2686();
        }
        int var9 = Statics.field1767;
        int var10 = Statics.field1768;
        int var11 = field1721[arg0];
        int var12 = field1699[arg0];
        int var13 = field1721[arg1];
        int var14 = field1699[arg1];
        int var15 = field1721[arg2];
        int var16 = field1699[arg2];
        int var17 = field1721[arg3];
        int var18 = field1699[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1661; var20++) {
            int var21 = this.field1662[var20];
            int var22 = this.field1663[var20];
            int var23 = this.field1664[var20];
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
            field1700[var20] = var31 - var19;
            field1725[var20] = class131.field1766 * var27 / arg7 + var9;
            field1666[var20] = class131.field1766 * var30 / arg7 + var10;
            if (this.field1677 > 0) {
                field1701[var20] = var27;
                field1702[var20] = var30;
                field1694[var20] = var31;
            }
        }
        try {
            this.method2683(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dx.cn(IIIIIIIIJ)V")
    public void method2720(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1705[0] = -1;
        if (this.field1684 != 1) {
            this.method2722();
        }
        this.method2713(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field1686 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field1686) * class131.field1766;
        if (var16 / var14 >= Statics.field1772) {
            return;
        }
        int var17 = (this.field1686 + var15) * class131.field1766;
        if (var17 / var14 <= Statics.field1759) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field1686 * arg1 >> 16;
        int var20 = (var18 + var19) * class131.field1766;
        if (var20 / var14 <= Statics.field1760) {
            return;
        }
        int var21 = (this.field1869 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class131.field1766;
        if (var22 / var14 >= Statics.field1774) {
            return;
        }
        int var23 = (this.field1869 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field1677 > 0;
        int var27 = class129.method3553();
        int var28 = class129.field1731;
        boolean var30 = class129.method2379();
        boolean var31 = class129.method703(arg8);
        boolean var32 = false;
        if (var31 && var30) {
            boolean var33 = false;
            if (field1718) {
                boolean var35;
                if (class129.method2379()) {
                    class129.method1062();
                    int var36 = this.field1689 + arg5;
                    int var37 = this.field1690 + arg6;
                    int var38 = this.field1665 + arg7;
                    int var39 = this.field1693;
                    int var40 = this.field1706;
                    int var41 = this.field1680;
                    int var42 = Statics.field1730 - var36;
                    int var43 = Statics.field1732 - var37;
                    int var44 = Statics.field1737 - var38;
                    if (Math.abs(var42) > Statics.field1979 + var39) {
                        var35 = false;
                    } else if (Math.abs(var43) > Statics.field27 + var40) {
                        var35 = false;
                    } else if (Math.abs(var44) > Statics.field382 + var41) {
                        var35 = false;
                    } else if (Math.abs(Statics.field1734 * var44 - Statics.field1743 * var43) > Statics.field382 * var40 + Statics.field27 * var41) {
                        var35 = false;
                    } else if (Math.abs(Statics.field1743 * var42 - Statics.field1513 * var44) > Statics.field382 * var39 + Statics.field1979 * var41) {
                        var35 = false;
                    } else if (Math.abs(Statics.field1513 * var43 - Statics.field1734 * var42) > Statics.field27 * var39 + Statics.field1979 * var40) {
                        var35 = false;
                    } else {
                        var35 = true;
                    }
                } else {
                    var35 = false;
                }
                var33 = var35;
            } else {
                int var45 = var12 - var13;
                if (var45 <= 50) {
                    var45 = 50;
                }
                int var46;
                int var47;
                if (var15 > 0) {
                    var46 = var16 / var14;
                    var47 = var17 / var45;
                } else {
                    var47 = var17 / var14;
                    var46 = var16 / var45;
                }
                int var48;
                int var49;
                if (var18 > 0) {
                    var48 = var22 / var14;
                    var49 = var20 / var45;
                } else {
                    var49 = var20 / var14;
                    var48 = var22 / var45;
                }
                int var50 = var27 - Statics.field1767;
                int var51 = var28 - Statics.field1768;
                if (var50 > var46 && var50 < var47 && var51 > var48 && var51 < var49) {
                    var33 = true;
                }
            }
            if (var33) {
                if (this.field1683) {
                    class129.method3161(arg8);
                } else {
                    var32 = true;
                }
            }
        }
        int var52 = Statics.field1767;
        int var53 = Statics.field1768;
        int var54 = 0;
        int var55 = 0;
        if (arg0 != 0) {
            var54 = field1721[arg0];
            var55 = field1699[arg0];
        }
        for (int var56 = 0; var56 < this.field1661; var56++) {
            int var57 = this.field1662[var56];
            int var58 = this.field1663[var56];
            int var59 = this.field1664[var56];
            if (arg0 != 0) {
                int var60 = var54 * var59 + var55 * var57 >> 16;
                var59 = var55 * var59 - var54 * var57 >> 16;
                var57 = var60;
            }
            int var61 = arg5 + var57;
            int var62 = arg6 + var58;
            int var63 = arg7 + var59;
            int var64 = arg3 * var63 + arg4 * var61 >> 16;
            int var65 = arg4 * var63 - arg3 * var61 >> 16;
            int var67 = arg2 * var62 - arg1 * var65 >> 16;
            int var68 = arg1 * var62 + arg2 * var65 >> 16;
            field1700[var56] = var68 - var12;
            if (var68 >= 50) {
                field1725[var56] = class131.field1766 * var64 / var68 + var52;
                field1666[var56] = class131.field1766 * var67 / var68 + var53;
            } else {
                field1725[var56] = -5000;
                var24 = true;
            }
            if (var26) {
                field1701[var56] = var64;
                field1702[var56] = var67;
                field1694[var56] = var68;
            }
        }
        try {
            this.method2683(var24, var32, this.field1683, arg8);
        } catch (Exception var71) {
        }
    }

    @ObfuscatedName("dx.u(ZZZJ)V")
    public final void method2683(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field1668 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field1668; var6++) {
            field1705[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field1691; var8++) {
            if (this.field1704[var8] != -2) {
                int var9 = this.field1698[var8];
                int var10 = this.field1667[var8];
                int var11 = this.field1692[var8];
                int var12 = field1725[var9];
                int var13 = field1725[var10];
                int var14 = field1725[var11];
                if (arg0 && (var12 == -5000 || var13 == -5000 || var14 == -5000)) {
                    int var15 = field1701[var9];
                    int var16 = field1701[var10];
                    int var17 = field1701[var11];
                    int var18 = field1702[var9];
                    int var19 = field1702[var10];
                    int var20 = field1702[var11];
                    int var21 = field1694[var9];
                    int var22 = field1694[var10];
                    int var23 = field1694[var11];
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
                        field1697[var8] = true;
                        int var33 = (field1700[var9] + field1700[var10] + field1700[var11]) / 3 + this.field1688;
                        field1723[var33][field1705[var33]++] = var8;
                    }
                } else {
                    if (arg1 && class129.method2547(field1666[var9], field1666[var10], field1666[var11], var12, var13, var14, var7)) {
                        class129.field1733[++class129.field1736 - 1] = arg3;
                        arg1 = false;
                    }
                    if ((field1666[var11] - field1666[var10]) * (var12 - var13) - (field1666[var9] - field1666[var10]) * (var14 - var13) > 0) {
                        field1697[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field1769 && var13 <= Statics.field1769 && var14 <= Statics.field1769) {
                            field1674[var8] = false;
                        } else {
                            field1674[var8] = true;
                        }
                        int var36 = (field1700[var9] + field1700[var10] + field1700[var11]) / 3 + this.field1688;
                        field1723[var36][field1705[var36]++] = var8;
                    }
                }
            }
        }
        if (this.field1672 == null) {
            for (int var37 = this.field1668 - 1; var37 >= 0; var37--) {
                int var38 = field1705[var37];
                if (var38 > 0) {
                    int[] var39 = field1723[var37];
                    for (int var40 = 0; var40 < var38; var40++) {
                        this.method2728(var39[var40]);
                    }
                }
            }
            return;
        }
        for (int var41 = 0; var41 < 12; var41++) {
            field1671[var41] = 0;
            field1685[var41] = 0;
        }
        for (int var42 = this.field1668 - 1; var42 >= 0; var42--) {
            int var43 = field1705[var42];
            if (var43 > 0) {
                int[] var44 = field1723[var42];
                for (int var45 = 0; var45 < var43; var45++) {
                    int var46 = var44[var45];
                    byte var47 = this.field1672[var46];
                    int var48 = field1671[var47]++;
                    field1708[var47][var48] = var46;
                    if (var47 < 10) {
                        field1685[var47] += var42;
                    } else if (var47 == 10) {
                        field1709[var48] = var42;
                    } else {
                        field1710[var48] = var42;
                    }
                }
            }
        }
        int var49 = 0;
        if (field1671[1] > 0 || field1671[2] > 0) {
            var49 = (field1685[1] + field1685[2]) / (field1671[1] + field1671[2]);
        }
        int var50 = 0;
        if (field1671[3] > 0 || field1671[4] > 0) {
            var50 = (field1685[3] + field1685[4]) / (field1671[3] + field1671[4]);
        }
        int var51 = 0;
        if (field1671[6] > 0 || field1671[8] > 0) {
            var51 = (field1685[6] + field1685[8]) / (field1671[6] + field1671[8]);
        }
        int var52 = 0;
        int var53 = field1671[10];
        int[] var54 = field1708[10];
        int[] var55 = field1709;
        if (var52 == var53) {
            var52 = 0;
            var53 = field1671[11];
            var54 = field1708[11];
            var55 = field1710;
        }
        int var56;
        if (var52 < var53) {
            var56 = var55[var52];
        } else {
            var56 = -1000;
        }
        for (int var57 = 0; var57 < 10; var57++) {
            while (var57 == 0 && var56 > var49) {
                this.method2728(var54[var52++]);
                if (var52 == var53 && field1708[11] != var54) {
                    var52 = 0;
                    var53 = field1671[11];
                    var54 = field1708[11];
                    var55 = field1710;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            while (var57 == 3 && var56 > var50) {
                this.method2728(var54[var52++]);
                if (var52 == var53 && field1708[11] != var54) {
                    var52 = 0;
                    var53 = field1671[11];
                    var54 = field1708[11];
                    var55 = field1710;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            while (var57 == 5 && var56 > var51) {
                this.method2728(var54[var52++]);
                if (var52 == var53 && field1708[11] != var54) {
                    var52 = 0;
                    var53 = field1671[11];
                    var54 = field1708[11];
                    var55 = field1710;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            int var58 = field1671[var57];
            int[] var59 = field1708[var57];
            for (int var60 = 0; var60 < var58; var60++) {
                this.method2728(var59[var60]);
            }
        }
        while (var56 != -1000) {
            this.method2728(var54[var52++]);
            if (var52 == var53 && field1708[11] != var54) {
                var52 = 0;
                var54 = field1708[11];
                var53 = field1671[11];
                var55 = field1710;
            }
            if (var52 < var53) {
                var56 = var55[var52];
            } else {
                var56 = -1000;
            }
        }
    }

    @ObfuscatedName("dx.ae(I)V")
    public final void method2728(int arg0) {
        if (field1697[arg0]) {
            this.method2724(arg0);
            return;
        }
        int var2 = this.field1698[arg0];
        int var3 = this.field1667[arg0];
        int var4 = this.field1692[arg0];
        class131.field1762 = field1674[arg0];
        if (this.field1673 == null) {
            class131.field1770 = 0;
        } else {
            class131.field1770 = this.field1673[arg0] & 0xFF;
        }
        if (this.field1696 != null && this.field1696[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1687 == null || this.field1687[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1687[arg0] & 0xFF;
                var6 = this.field1678[var5];
                var7 = this.field1679[var5];
                var8 = this.field1657[var5];
            }
            if (this.field1704[arg0] == -1) {
                class131.method2814(field1666[var2], field1666[var3], field1666[var4], field1725[var2], field1725[var3], field1725[var4], this.field1669[arg0], this.field1669[arg0], this.field1669[arg0], field1701[var6], field1701[var7], field1701[var8], field1702[var6], field1702[var7], field1702[var8], field1694[var6], field1694[var7], field1694[var8], this.field1696[arg0]);
            } else {
                class131.method2814(field1666[var2], field1666[var3], field1666[var4], field1725[var2], field1725[var3], field1725[var4], this.field1669[arg0], this.field1670[arg0], this.field1704[arg0], field1701[var6], field1701[var7], field1701[var8], field1702[var6], field1702[var7], field1702[var8], field1694[var6], field1694[var7], field1694[var8], this.field1696[arg0]);
            }
        } else if (this.field1704[arg0] == -1) {
            class131.method2859(field1666[var2], field1666[var3], field1666[var4], field1725[var2], field1725[var3], field1725[var4], field1714[this.field1669[arg0]]);
        } else {
            class131.method2852(field1666[var2], field1666[var3], field1666[var4], field1725[var2], field1725[var3], field1725[var4], this.field1669[arg0], this.field1670[arg0], this.field1704[arg0]);
        }
    }

    @ObfuscatedName("dx.af(I)V")
    public final void method2724(int arg0) {
        int var2 = Statics.field1767;
        int var3 = Statics.field1768;
        int var4 = 0;
        int var5 = this.field1698[arg0];
        int var6 = this.field1667[arg0];
        int var7 = this.field1692[arg0];
        int var8 = field1694[var5];
        int var9 = field1694[var6];
        int var10 = field1694[var7];
        if (this.field1673 == null) {
            class131.field1770 = 0;
        } else {
            class131.field1770 = this.field1673[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1712[var4] = field1725[var5];
            field1713[var4] = field1666[var5];
            field1720[var4++] = this.field1669[arg0];
        } else {
            int var11 = field1701[var5];
            int var12 = field1702[var5];
            int var13 = this.field1669[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1724[var10 - var8];
                field1712[var4] = (((field1701[var7] - var11) * var14 >> 16) + var11) * class131.field1766 / 50 + var2;
                field1713[var4] = (((field1702[var7] - var12) * var14 >> 16) + var12) * class131.field1766 / 50 + var3;
                field1720[var4++] = ((this.field1704[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1724[var9 - var8];
                field1712[var4] = (((field1701[var6] - var11) * var15 >> 16) + var11) * class131.field1766 / 50 + var2;
                field1713[var4] = (((field1702[var6] - var12) * var15 >> 16) + var12) * class131.field1766 / 50 + var3;
                field1720[var4++] = ((this.field1670[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1712[var4] = field1725[var6];
            field1713[var4] = field1666[var6];
            field1720[var4++] = this.field1670[arg0];
        } else {
            int var16 = field1701[var6];
            int var17 = field1702[var6];
            int var18 = this.field1670[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1724[var8 - var9];
                field1712[var4] = (((field1701[var5] - var16) * var19 >> 16) + var16) * class131.field1766 / 50 + var2;
                field1713[var4] = (((field1702[var5] - var17) * var19 >> 16) + var17) * class131.field1766 / 50 + var3;
                field1720[var4++] = ((this.field1669[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1724[var10 - var9];
                field1712[var4] = (((field1701[var7] - var16) * var20 >> 16) + var16) * class131.field1766 / 50 + var2;
                field1713[var4] = (((field1702[var7] - var17) * var20 >> 16) + var17) * class131.field1766 / 50 + var3;
                field1720[var4++] = ((this.field1704[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1712[var4] = field1725[var7];
            field1713[var4] = field1666[var7];
            field1720[var4++] = this.field1704[arg0];
        } else {
            int var21 = field1701[var7];
            int var22 = field1702[var7];
            int var23 = this.field1704[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1724[var9 - var10];
                field1712[var4] = (((field1701[var6] - var21) * var24 >> 16) + var21) * class131.field1766 / 50 + var2;
                field1713[var4] = (((field1702[var6] - var22) * var24 >> 16) + var22) * class131.field1766 / 50 + var3;
                field1720[var4++] = ((this.field1670[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1724[var8 - var10];
                field1712[var4] = (((field1701[var5] - var21) * var25 >> 16) + var21) * class131.field1766 / 50 + var2;
                field1713[var4] = (((field1702[var5] - var22) * var25 >> 16) + var22) * class131.field1766 / 50 + var3;
                field1720[var4++] = ((this.field1669[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1712[0];
        int var27 = field1712[1];
        int var28 = field1712[2];
        int var29 = field1713[0];
        int var30 = field1713[1];
        int var31 = field1713[2];
        class131.field1762 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1769 || var27 > Statics.field1769 || var28 > Statics.field1769) {
                class131.field1762 = true;
            }
            if (this.field1696 != null && this.field1696[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1687 == null || this.field1687[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1687[arg0] & 0xFF;
                    var33 = this.field1678[var32];
                    var34 = this.field1679[var32];
                    var35 = this.field1657[var32];
                }
                if (this.field1704[arg0] == -1) {
                    class131.method2814(var29, var30, var31, var26, var27, var28, this.field1669[arg0], this.field1669[arg0], this.field1669[arg0], field1701[var33], field1701[var34], field1701[var35], field1702[var33], field1702[var34], field1702[var35], field1694[var33], field1694[var34], field1694[var35], this.field1696[arg0]);
                } else {
                    class131.method2814(var29, var30, var31, var26, var27, var28, field1720[0], field1720[1], field1720[2], field1701[var33], field1701[var34], field1701[var35], field1702[var33], field1702[var34], field1702[var35], field1694[var33], field1694[var34], field1694[var35], this.field1696[arg0]);
                }
            } else if (this.field1704[arg0] == -1) {
                class131.method2859(var29, var30, var31, var26, var27, var28, field1714[this.field1669[arg0]]);
            } else {
                class131.method2852(var29, var30, var31, var26, var27, var28, field1720[0], field1720[1], field1720[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1769 || var27 > Statics.field1769 || var28 > Statics.field1769 || field1712[3] < 0 || field1712[3] > Statics.field1769) {
            class131.field1762 = true;
        }
        if (this.field1696 != null && this.field1696[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1687 == null || this.field1687[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1687[arg0] & 0xFF;
                var37 = this.field1678[var36];
                var38 = this.field1679[var36];
                var39 = this.field1657[var36];
            }
            short var40 = this.field1696[arg0];
            if (this.field1704[arg0] == -1) {
                class131.method2814(var29, var30, var31, var26, var27, var28, this.field1669[arg0], this.field1669[arg0], this.field1669[arg0], field1701[var37], field1701[var38], field1701[var39], field1702[var37], field1702[var38], field1702[var39], field1694[var37], field1694[var38], field1694[var39], var40);
                class131.method2814(var29, var31, field1713[3], var26, var28, field1712[3], this.field1669[arg0], this.field1669[arg0], this.field1669[arg0], field1701[var37], field1701[var38], field1701[var39], field1702[var37], field1702[var38], field1702[var39], field1694[var37], field1694[var38], field1694[var39], var40);
            } else {
                class131.method2814(var29, var30, var31, var26, var27, var28, field1720[0], field1720[1], field1720[2], field1701[var37], field1701[var38], field1701[var39], field1702[var37], field1702[var38], field1702[var39], field1694[var37], field1694[var38], field1694[var39], var40);
                class131.method2814(var29, var31, field1713[3], var26, var28, field1712[3], field1720[0], field1720[2], field1720[3], field1701[var37], field1701[var38], field1701[var39], field1702[var37], field1702[var38], field1702[var39], field1694[var37], field1694[var38], field1694[var39], var40);
            }
        } else if (this.field1704[arg0] == -1) {
            int var41 = field1714[this.field1669[arg0]];
            class131.method2859(var29, var30, var31, var26, var27, var28, var41);
            class131.method2859(var29, var31, field1713[3], var26, var28, field1712[3], var41);
        } else {
            class131.method2852(var29, var30, var31, var26, var27, var28, field1720[0], field1720[1], field1720[2]);
            class131.method2852(var29, var31, field1713[3], var26, var28, field1712[3], field1720[0], field1720[2], field1720[3]);
        }
    }
}
