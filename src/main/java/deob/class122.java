package deob;

@ObfuscatedName("da")
public class class122 extends class130 {

    @ObfuscatedName("da.v")
    public static class122 field1646 = new class122();

    @ObfuscatedName("da.s")
    public static byte[] field1633 = new byte[1];

    @ObfuscatedName("da.o")
    public static class122 field1651 = new class122();

    @ObfuscatedName("da.k")
    public static byte[] field1683 = new byte[1];

    @ObfuscatedName("da.u")
    public int field1694 = 0;

    @ObfuscatedName("da.i")
    public int[] field1666;

    @ObfuscatedName("da.t")
    public int[] field1638;

    @ObfuscatedName("da.p")
    public int[] field1639;

    @ObfuscatedName("da.l")
    public int field1635 = 0;

    @ObfuscatedName("da.b")
    public int[] field1641;

    @ObfuscatedName("da.c")
    public int[] field1642;

    @ObfuscatedName("da.d")
    public int[] field1643;

    @ObfuscatedName("da.w")
    public int[] field1644;

    @ObfuscatedName("da.a")
    public int[] field1645;

    @ObfuscatedName("da.z")
    public int[] field1672;

    @ObfuscatedName("da.e")
    public byte[] field1660;

    @ObfuscatedName("da.q")
    public byte[] field1648;

    @ObfuscatedName("da.j")
    public byte[] field1649;

    @ObfuscatedName("da.y")
    public short[] field1650;

    @ObfuscatedName("da.m")
    public byte field1695 = 0;

    @ObfuscatedName("da.h")
    public int field1652 = 0;

    @ObfuscatedName("da.x")
    public int[] field1654;

    @ObfuscatedName("da.f")
    public int[] field1675;

    @ObfuscatedName("da.r")
    public int[] field1655;

    @ObfuscatedName("da.n")
    public int[][] field1656;

    @ObfuscatedName("da.g")
    public int[][] field1637;

    @ObfuscatedName("da.ac")
    public boolean field1701 = false;

    @ObfuscatedName("da.ab")
    public int field1659;

    @ObfuscatedName("da.ao")
    public int field1653;

    @ObfuscatedName("da.an")
    public int field1665;

    @ObfuscatedName("da.ay")
    public int field1662;

    @ObfuscatedName("da.av")
    public int field1679;

    @ObfuscatedName("da.af")
    public int field1664;

    @ObfuscatedName("da.ar")
    public int field1657;

    @ObfuscatedName("da.am")
    public int field1647;

    @ObfuscatedName("da.aj")
    public int field1667 = -1;

    @ObfuscatedName("da.aq")
    public int field1668 = -1;

    @ObfuscatedName("da.ak")
    public int field1669 = -1;

    @ObfuscatedName("da.aw")
    public static boolean[] field1671 = new boolean[4700];

    @ObfuscatedName("da.au")
    public static boolean[] field1663 = new boolean[4700];

    @ObfuscatedName("da.ad")
    public static int[] field1673 = new int[4700];

    @ObfuscatedName("da.ah")
    public static int[] field1674 = new int[4700];

    @ObfuscatedName("da.as")
    public static int[] field1661 = new int[4700];

    @ObfuscatedName("da.ag")
    public static int[] field1687 = new int[4700];

    @ObfuscatedName("da.at")
    public static int[] field1634 = new int[4700];

    @ObfuscatedName("da.ae")
    public static int[] field1678 = new int[4700];

    @ObfuscatedName("da.ai")
    public static int[] field1680 = new int[1600];

    @ObfuscatedName("da.aa")
    public static int[][] field1681 = new int[1600][512];

    @ObfuscatedName("da.az")
    public static int[] field1682 = new int[12];

    @ObfuscatedName("da.al")
    public static int[][] field1689 = new int[12][2000];

    @ObfuscatedName("da.be")
    public static int[] field1684 = new int[2000];

    @ObfuscatedName("da.br")
    public static int[] field1685 = new int[2000];

    @ObfuscatedName("da.bi")
    public static int[] field1686 = new int[12];

    @ObfuscatedName("da.bg")
    public static int[] field1640 = new int[10];

    @ObfuscatedName("da.ba")
    public static int[] field1676 = new int[10];

    @ObfuscatedName("da.bw")
    public static int[] field1677 = new int[10];

    @ObfuscatedName("da.bp")
    public static boolean field1693 = true;

    @ObfuscatedName("da.bj")
    public static int[] field1696 = class125.field1731;

    @ObfuscatedName("da.by")
    public static int[] field1697 = class125.field1745;

    @ObfuscatedName("da.bv")
    public static int[] field1698 = class125.field1738;

    @ObfuscatedName("da.bn")
    public static int[] field1699 = class125.field1743;

    public class122() {
    }

    public class122(class122[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1694 = 0;
        this.field1635 = 0;
        this.field1652 = 0;
        this.field1695 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class122 var8 = arg0[var7];
            if (var8 != null) {
                this.field1694 += var8.field1694;
                this.field1635 += var8.field1635;
                this.field1652 += var8.field1652;
                if (var8.field1660 == null) {
                    if (this.field1695 == -1) {
                        this.field1695 = var8.field1695;
                    }
                    if (this.field1695 != var8.field1695) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1648 != null;
                var5 |= var8.field1650 != null;
                var6 |= var8.field1649 != null;
            }
        }
        this.field1666 = new int[this.field1694];
        this.field1638 = new int[this.field1694];
        this.field1639 = new int[this.field1694];
        this.field1641 = new int[this.field1635];
        this.field1642 = new int[this.field1635];
        this.field1643 = new int[this.field1635];
        this.field1644 = new int[this.field1635];
        this.field1645 = new int[this.field1635];
        this.field1672 = new int[this.field1635];
        if (var3) {
            this.field1660 = new byte[this.field1635];
        }
        if (var4) {
            this.field1648 = new byte[this.field1635];
        }
        if (var5) {
            this.field1650 = new short[this.field1635];
        }
        if (var6) {
            this.field1649 = new byte[this.field1635];
        }
        if (this.field1652 > 0) {
            this.field1654 = new int[this.field1652];
            this.field1675 = new int[this.field1652];
            this.field1655 = new int[this.field1652];
        }
        this.field1694 = 0;
        this.field1635 = 0;
        this.field1652 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class122 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1635; var11++) {
                    this.field1641[this.field1635] = var10.field1641[var11] + this.field1694;
                    this.field1642[this.field1635] = var10.field1642[var11] + this.field1694;
                    this.field1643[this.field1635] = var10.field1643[var11] + this.field1694;
                    this.field1644[this.field1635] = var10.field1644[var11];
                    this.field1645[this.field1635] = var10.field1645[var11];
                    this.field1672[this.field1635] = var10.field1672[var11];
                    if (var3) {
                        if (var10.field1660 == null) {
                            this.field1660[this.field1635] = var10.field1695;
                        } else {
                            this.field1660[this.field1635] = var10.field1660[var11];
                        }
                    }
                    if (var4 && var10.field1648 != null) {
                        this.field1648[this.field1635] = var10.field1648[var11];
                    }
                    if (var5) {
                        if (var10.field1650 == null) {
                            this.field1650[this.field1635] = -1;
                        } else {
                            this.field1650[this.field1635] = var10.field1650[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1649 == null || var10.field1649[var11] == -1) {
                            this.field1649[this.field1635] = -1;
                        } else {
                            this.field1649[this.field1635] = (byte) (var10.field1649[var11] + this.field1652);
                        }
                    }
                    this.field1635++;
                }
                for (int var12 = 0; var12 < var10.field1652; var12++) {
                    this.field1654[this.field1652] = var10.field1654[var12] + this.field1694;
                    this.field1675[this.field1652] = var10.field1675[var12] + this.field1694;
                    this.field1655[this.field1652] = var10.field1655[var12] + this.field1694;
                    this.field1652++;
                }
                for (int var13 = 0; var13 < var10.field1694; var13++) {
                    this.field1666[this.field1694] = var10.field1666[var13];
                    this.field1638[this.field1694] = var10.field1638[var13];
                    this.field1639[this.field1694] = var10.field1639[var13];
                    this.field1694++;
                }
            }
        }
    }

    @ObfuscatedName("da.v([[IIIIZI)Lda;")
    public class122 method2518(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2532();
        int var7 = arg1 - this.field1665;
        int var8 = this.field1665 + arg1;
        int var9 = arg3 - this.field1665;
        int var10 = this.field1665 + arg3;
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
            var15.field1694 = this.field1694;
            var15.field1635 = this.field1635;
            var15.field1652 = this.field1652;
            var15.field1666 = this.field1666;
            var15.field1639 = this.field1639;
            var15.field1641 = this.field1641;
            var15.field1642 = this.field1642;
            var15.field1643 = this.field1643;
            var15.field1644 = this.field1644;
            var15.field1645 = this.field1645;
            var15.field1672 = this.field1672;
            var15.field1660 = this.field1660;
            var15.field1648 = this.field1648;
            var15.field1649 = this.field1649;
            var15.field1650 = this.field1650;
            var15.field1695 = this.field1695;
            var15.field1654 = this.field1654;
            var15.field1675 = this.field1675;
            var15.field1655 = this.field1655;
            var15.field1656 = this.field1656;
            var15.field1637 = this.field1637;
            var15.field1701 = this.field1701;
            var15.field1638 = new int[var15.field1694];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1694; var16++) {
                int var17 = this.field1666[var16] + arg1;
                int var18 = this.field1639[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1638[var16] = this.field1638[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1694; var26++) {
                int var27 = (-this.field1638[var26] << 16) / this.field1833;
                if (var27 < arg5) {
                    int var28 = this.field1666[var26] + arg1;
                    int var29 = this.field1639[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1638[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1638[var26];
                }
            }
        }
        var15.method2517();
        return var15;
    }

    @ObfuscatedName("da.s(Z)Lda;")
    public class122 method2526(boolean arg0) {
        if (!arg0 && field1633.length < this.field1635) {
            field1633 = new byte[this.field1635 + 100];
        }
        return this.method2471(arg0, field1646, field1633);
    }

    @ObfuscatedName("da.o(Z)Lda;")
    public class122 method2470(boolean arg0) {
        if (!arg0 && field1683.length < this.field1635) {
            field1683 = new byte[this.field1635 + 100];
        }
        return this.method2471(arg0, field1651, field1683);
    }

    @ObfuscatedName("da.k(ZLda;[B)Lda;")
    public class122 method2471(boolean arg0, class122 arg1, byte[] arg2) {
        arg1.field1694 = this.field1694;
        arg1.field1635 = this.field1635;
        arg1.field1652 = this.field1652;
        if (arg1.field1666 == null || arg1.field1666.length < this.field1694) {
            arg1.field1666 = new int[this.field1694 + 100];
            arg1.field1638 = new int[this.field1694 + 100];
            arg1.field1639 = new int[this.field1694 + 100];
        }
        for (int var4 = 0; var4 < this.field1694; var4++) {
            arg1.field1666[var4] = this.field1666[var4];
            arg1.field1638[var4] = this.field1638[var4];
            arg1.field1639[var4] = this.field1639[var4];
        }
        if (arg0) {
            arg1.field1648 = this.field1648;
        } else {
            arg1.field1648 = arg2;
            if (this.field1648 == null) {
                for (int var5 = 0; var5 < this.field1635; var5++) {
                    arg1.field1648[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1635; var6++) {
                    arg1.field1648[var6] = this.field1648[var6];
                }
            }
        }
        arg1.field1641 = this.field1641;
        arg1.field1642 = this.field1642;
        arg1.field1643 = this.field1643;
        arg1.field1644 = this.field1644;
        arg1.field1645 = this.field1645;
        arg1.field1672 = this.field1672;
        arg1.field1660 = this.field1660;
        arg1.field1649 = this.field1649;
        arg1.field1650 = this.field1650;
        arg1.field1695 = this.field1695;
        arg1.field1654 = this.field1654;
        arg1.field1675 = this.field1675;
        arg1.field1655 = this.field1655;
        arg1.field1656 = this.field1656;
        arg1.field1637 = this.field1637;
        arg1.field1701 = this.field1701;
        arg1.method2517();
        return arg1;
    }

    @ObfuscatedName("da.u(I)V")
    public void method2484(int arg0) {
        if (this.field1667 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1697[arg0];
        int var9 = field1696[arg0];
        for (int var10 = 0; var10 < this.field1694; var10++) {
            int var11 = class125.method2606(this.field1666[var10], this.field1639[var10], var8, var9);
            int var12 = this.field1638[var10];
            int var13 = class125.method2599(this.field1666[var10], this.field1639[var10], var8, var9);
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
        this.field1664 = (var2 + var5) / 2;
        this.field1657 = (var3 + var6) / 2;
        this.field1647 = (var4 + var7) / 2;
        this.field1667 = (var5 - var2 + 1) / 2;
        this.field1668 = (var6 - var3 + 1) / 2;
        this.field1669 = (var7 - var4 + 1) / 2;
        if (this.field1667 < 32) {
            this.field1667 = 32;
        }
        if (this.field1669 < 32) {
            this.field1669 = 32;
        }
        if (this.field1701) {
            this.field1667 += 8;
            this.field1669 += 8;
        }
    }

    @ObfuscatedName("da.i()V")
    public void method2532() {
        if (this.field1659 == 1) {
            return;
        }
        this.field1659 = 1;
        this.field1833 = 0;
        this.field1653 = 0;
        this.field1665 = 0;
        for (int var1 = 0; var1 < this.field1694; var1++) {
            int var2 = this.field1666[var1];
            int var3 = this.field1638[var1];
            int var4 = this.field1639[var1];
            if (-var3 > this.field1833) {
                this.field1833 = -var3;
            }
            if (var3 > this.field1653) {
                this.field1653 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1665) {
                this.field1665 = var5;
            }
        }
        this.field1665 = (int) (Math.sqrt((double) this.field1665) + 0.99D);
        this.field1679 = (int) (Math.sqrt((double) (this.field1833 * this.field1833 + this.field1665 * this.field1665)) + 0.99D);
        this.field1662 = this.field1679 + (int) (Math.sqrt((double) (this.field1665 * this.field1665 + this.field1653 * this.field1653)) + 0.99D);
    }

    @ObfuscatedName("da.t()V")
    public void method2474() {
        if (this.field1659 == 2) {
            return;
        }
        this.field1659 = 2;
        this.field1665 = 0;
        for (int var1 = 0; var1 < this.field1694; var1++) {
            int var2 = this.field1666[var1];
            int var3 = this.field1638[var1];
            int var4 = this.field1639[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1665) {
                this.field1665 = var5;
            }
        }
        this.field1665 = (int) (Math.sqrt((double) this.field1665) + 0.99D);
        this.field1679 = this.field1665;
        this.field1662 = this.field1665 + this.field1665;
    }

    @ObfuscatedName("da.c()I")
    public int method2467() {
        this.method2532();
        return this.field1665;
    }

    @ObfuscatedName("da.a()V")
    public void method2517() {
        this.field1659 = 0;
        this.field1667 = -1;
    }

    @ObfuscatedName("da.z(Lex;I)V")
    public void method2542(class133 arg0, int arg1) {
        if (this.field1656 == null || arg1 == -1) {
            return;
        }
        class120 var3 = arg0.field1856[arg1];
        class127 var4 = var3.field1601;
        Statics.field1690 = 0;
        Statics.field1691 = 0;
        Statics.field1692 = 0;
        for (int var5 = 0; var5 < var3.field1602; var5++) {
            int var6 = var3.field1604[var5];
            this.method2479(var4.field1757[var6], var4.field1760[var6], var3.field1603[var5], var3.field1605[var5], var3.field1606[var5]);
        }
        this.method2517();
    }

    @ObfuscatedName("da.e(Lex;ILex;I[I)V")
    public void method2478(class133 arg0, int arg1, class133 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2542(arg0, arg1);
            return;
        }
        class120 var6 = arg0.field1856[arg1];
        class120 var7 = arg2.field1856[arg3];
        class127 var8 = var6.field1601;
        Statics.field1690 = 0;
        Statics.field1691 = 0;
        Statics.field1692 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1602; var11++) {
            int var12 = var6.field1604[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1757[var12] == 0) {
                this.method2479(var8.field1757[var12], var8.field1760[var12], var6.field1603[var11], var6.field1605[var11], var6.field1606[var11]);
            }
        }
        Statics.field1690 = 0;
        Statics.field1691 = 0;
        Statics.field1692 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1602; var15++) {
            int var16 = var7.field1604[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1757[var16] == 0) {
                this.method2479(var8.field1757[var16], var8.field1760[var16], var7.field1603[var15], var7.field1605[var15], var7.field1606[var15]);
            }
        }
        this.method2517();
    }

    @ObfuscatedName("da.q(I[IIII)V")
    public void method2479(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1690 = 0;
            Statics.field1691 = 0;
            Statics.field1692 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1656.length) {
                    int[] var10 = this.field1656[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1690 += this.field1666[var12];
                        Statics.field1691 += this.field1638[var12];
                        Statics.field1692 += this.field1639[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1690 = Statics.field1690 / var7 + arg2;
                Statics.field1691 = Statics.field1691 / var7 + arg3;
                Statics.field1692 = Statics.field1692 / var7 + arg4;
            } else {
                Statics.field1690 = arg2;
                Statics.field1691 = arg3;
                Statics.field1692 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1656.length) {
                    int[] var15 = this.field1656[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1666[var17] += arg2;
                        this.field1638[var17] += arg3;
                        this.field1639[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1656.length) {
                    int[] var20 = this.field1656[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1666[var22] -= Statics.field1690;
                        this.field1638[var22] -= Statics.field1691;
                        this.field1639[var22] -= Statics.field1692;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1696[var25];
                            int var27 = field1697[var25];
                            int var28 = this.field1666[var22] * var27 + this.field1638[var22] * var26 >> 16;
                            this.field1638[var22] = this.field1638[var22] * var27 - this.field1666[var22] * var26 >> 16;
                            this.field1666[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1696[var23];
                            int var30 = field1697[var23];
                            int var31 = this.field1638[var22] * var30 - this.field1639[var22] * var29 >> 16;
                            this.field1639[var22] = this.field1639[var22] * var30 + this.field1638[var22] * var29 >> 16;
                            this.field1638[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1696[var24];
                            int var33 = field1697[var24];
                            int var34 = this.field1666[var22] * var33 + this.field1639[var22] * var32 >> 16;
                            this.field1639[var22] = this.field1639[var22] * var33 - this.field1666[var22] * var32 >> 16;
                            this.field1666[var22] = var34;
                        }
                        this.field1666[var22] += Statics.field1690;
                        this.field1638[var22] += Statics.field1691;
                        this.field1639[var22] += Statics.field1692;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1656.length) {
                    int[] var37 = this.field1656[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1666[var39] -= Statics.field1690;
                        this.field1638[var39] -= Statics.field1691;
                        this.field1639[var39] -= Statics.field1692;
                        this.field1666[var39] = this.field1666[var39] * arg2 / 128;
                        this.field1638[var39] = this.field1638[var39] * arg3 / 128;
                        this.field1639[var39] = this.field1639[var39] * arg4 / 128;
                        this.field1666[var39] += Statics.field1690;
                        this.field1638[var39] += Statics.field1691;
                        this.field1639[var39] += Statics.field1692;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1637 != null && this.field1648 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1637.length) {
                    int[] var42 = this.field1637[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1648[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1648[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("da.j()V")
    public void method2480() {
        for (int var1 = 0; var1 < this.field1694; var1++) {
            int var2 = this.field1666[var1];
            this.field1666[var1] = this.field1639[var1];
            this.field1639[var1] = -var2;
        }
        this.method2517();
    }

    @ObfuscatedName("da.y()V")
    public void method2481() {
        for (int var1 = 0; var1 < this.field1694; var1++) {
            this.field1666[var1] = -this.field1666[var1];
            this.field1639[var1] = -this.field1639[var1];
        }
        this.method2517();
    }

    @ObfuscatedName("da.m()V")
    public void method2482() {
        for (int var1 = 0; var1 < this.field1694; var1++) {
            int var2 = this.field1639[var1];
            this.field1639[var1] = this.field1666[var1];
            this.field1666[var1] = -var2;
        }
        this.method2517();
    }

    @ObfuscatedName("da.h(I)V")
    public void method2513(int arg0) {
        int var2 = field1696[arg0];
        int var3 = field1697[arg0];
        for (int var4 = 0; var4 < this.field1694; var4++) {
            int var5 = this.field1638[var4] * var3 - this.field1639[var4] * var2 >> 16;
            this.field1639[var4] = this.field1639[var4] * var3 + this.field1638[var4] * var2 >> 16;
            this.field1638[var4] = var5;
        }
        this.method2517();
    }

    @ObfuscatedName("da.x(III)V")
    public void method2516(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1694; var4++) {
            this.field1666[var4] += arg0;
            this.field1638[var4] += arg1;
            this.field1639[var4] += arg2;
        }
        this.method2517();
    }

    @ObfuscatedName("da.f(III)V")
    public void method2490(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1694; var4++) {
            this.field1666[var4] = this.field1666[var4] * arg0 / 128;
            this.field1638[var4] = this.field1638[var4] * arg1 / 128;
            this.field1639[var4] = this.field1639[var4] * arg2 / 128;
        }
        this.method2517();
    }

    @ObfuscatedName("da.r(IIIIIII)V")
    public final void method2486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1680[0] = -1;
        if (this.field1659 != 2 && this.field1659 != 1) {
            this.method2474();
        }
        int var8 = Statics.field1732;
        int var9 = Statics.field1719;
        int var10 = field1696[arg0];
        int var11 = field1697[arg0];
        int var12 = field1696[arg1];
        int var13 = field1697[arg1];
        int var14 = field1696[arg2];
        int var15 = field1697[arg2];
        int var16 = field1696[arg3];
        int var17 = field1697[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1694; var19++) {
            int var20 = this.field1666[var19];
            int var21 = this.field1638[var19];
            int var22 = this.field1639[var19];
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
            field1661[var19] = var30 - var18;
            field1673[var19] = class125.field1730 * var26 / var30 + var8;
            field1674[var19] = class125.field1730 * var29 / var30 + var9;
            if (this.field1652 > 0) {
                field1687[var19] = var26;
                field1634[var19] = var29;
                field1678[var19] = var30;
            }
        }
        try {
            this.method2489(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("da.n(IIIIIIII)V")
    public final void method2487(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1680[0] = -1;
        if (this.field1659 != 2 && this.field1659 != 1) {
            this.method2474();
        }
        int var9 = Statics.field1732;
        int var10 = Statics.field1719;
        int var11 = field1696[arg0];
        int var12 = field1697[arg0];
        int var13 = field1696[arg1];
        int var14 = field1697[arg1];
        int var15 = field1696[arg2];
        int var16 = field1697[arg2];
        int var17 = field1696[arg3];
        int var18 = field1697[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1694; var20++) {
            int var21 = this.field1666[var20];
            int var22 = this.field1638[var20];
            int var23 = this.field1639[var20];
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
            field1661[var20] = var31 - var19;
            field1673[var20] = class125.field1730 * var27 / arg7 + var9;
            field1674[var20] = class125.field1730 * var30 / arg7 + var10;
            if (this.field1652 > 0) {
                field1687[var20] = var27;
                field1634[var20] = var30;
                field1678[var20] = var31;
            }
        }
        try {
            this.method2489(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("da.cx(IIIIIIIIJ)V")
    public void method2488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1680[0] = -1;
        if (this.field1659 != 1) {
            this.method2532();
        }
        this.method2484(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field1665 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field1665) * class125.field1730;
        if (var16 / var14 >= Statics.field1736) {
            return;
        }
        int var17 = (this.field1665 + var15) * class125.field1730;
        if (var17 / var14 <= Statics.field1735) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field1665 * arg1 >> 16;
        int var20 = (var18 + var19) * class125.field1730;
        if (var20 / var14 <= Statics.field1744) {
            return;
        }
        int var21 = (this.field1833 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class125.field1730;
        if (var22 / var14 >= Statics.field1740) {
            return;
        }
        int var23 = (this.field1833 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field1652 > 0;
        int var27 = class123.field1709;
        int var29 = class123.field1704;
        boolean var31 = class123.field1708;
        boolean var33 = class123.method2997(arg8);
        boolean var34 = false;
        if (var33 && var31) {
            boolean var35 = false;
            if (field1693) {
                var35 = class123.method460(this, arg5, arg6, arg7);
            } else {
                int var36 = var12 - var13;
                if (var36 <= 50) {
                    var36 = 50;
                }
                int var37;
                int var38;
                if (var15 > 0) {
                    var37 = var16 / var14;
                    var38 = var17 / var36;
                } else {
                    var38 = var17 / var14;
                    var37 = var16 / var36;
                }
                int var39;
                int var40;
                if (var18 > 0) {
                    var39 = var22 / var14;
                    var40 = var20 / var36;
                } else {
                    var40 = var20 / var14;
                    var39 = var22 / var36;
                }
                int var41 = var27 - Statics.field1732;
                int var42 = var29 - Statics.field1719;
                if (var41 > var37 && var41 < var38 && var42 > var39 && var42 < var40) {
                    var35 = true;
                }
            }
            if (var35) {
                if (this.field1701) {
                    class123.field1710[++class123.field1706 - 1] = arg8;
                } else {
                    var34 = true;
                }
            }
        }
        int var45 = Statics.field1732;
        int var46 = Statics.field1719;
        int var47 = 0;
        int var48 = 0;
        if (arg0 != 0) {
            var47 = field1696[arg0];
            var48 = field1697[arg0];
        }
        for (int var49 = 0; var49 < this.field1694; var49++) {
            int var50 = this.field1666[var49];
            int var51 = this.field1638[var49];
            int var52 = this.field1639[var49];
            if (arg0 != 0) {
                int var53 = var47 * var52 + var48 * var50 >> 16;
                var52 = var48 * var52 - var47 * var50 >> 16;
                var50 = var53;
            }
            int var54 = arg5 + var50;
            int var55 = arg6 + var51;
            int var56 = arg7 + var52;
            int var57 = arg3 * var56 + arg4 * var54 >> 16;
            int var58 = arg4 * var56 - arg3 * var54 >> 16;
            int var60 = arg2 * var55 - arg1 * var58 >> 16;
            int var61 = arg1 * var55 + arg2 * var58 >> 16;
            field1661[var49] = var61 - var12;
            if (var61 >= 50) {
                field1673[var49] = class125.field1730 * var57 / var61 + var45;
                field1674[var49] = class125.field1730 * var60 / var61 + var46;
            } else {
                field1673[var49] = -5000;
                var24 = true;
            }
            if (var26) {
                field1687[var49] = var57;
                field1634[var49] = var60;
                field1678[var49] = var61;
            }
        }
        try {
            this.method2489(var24, var34, this.field1701, arg8);
        } catch (Exception var64) {
        }
    }

    @ObfuscatedName("da.g(ZZZJ)V")
    public final void method2489(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field1662 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field1662; var6++) {
            field1680[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field1635; var8++) {
            if (this.field1672[var8] != -2) {
                int var9 = this.field1641[var8];
                int var10 = this.field1642[var8];
                int var11 = this.field1643[var8];
                int var12 = field1673[var9];
                int var13 = field1673[var10];
                int var14 = field1673[var11];
                if (arg0 && (var12 == -5000 || var13 == -5000 || var14 == -5000)) {
                    int var15 = field1687[var9];
                    int var16 = field1687[var10];
                    int var17 = field1687[var11];
                    int var18 = field1634[var9];
                    int var19 = field1634[var10];
                    int var20 = field1634[var11];
                    int var21 = field1678[var9];
                    int var22 = field1678[var10];
                    int var23 = field1678[var11];
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
                        field1663[var8] = true;
                        int var33 = (field1661[var9] + field1661[var10] + field1661[var11]) / 3 + this.field1679;
                        field1681[var33][field1680[var33]++] = var8;
                    }
                } else {
                    if (arg1 && class123.method1081(field1674[var9], field1674[var10], field1674[var11], var12, var13, var14, var7)) {
                        class123.field1710[++class123.field1706 - 1] = arg3;
                        arg1 = false;
                    }
                    if ((field1674[var11] - field1674[var10]) * (var12 - var13) - (field1674[var9] - field1674[var10]) * (var14 - var13) > 0) {
                        field1663[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field1742 && var13 <= Statics.field1742 && var14 <= Statics.field1742) {
                            field1671[var8] = false;
                        } else {
                            field1671[var8] = true;
                        }
                        int var36 = (field1661[var9] + field1661[var10] + field1661[var11]) / 3 + this.field1679;
                        field1681[var36][field1680[var36]++] = var8;
                    }
                }
            }
        }
        if (this.field1660 == null) {
            for (int var37 = this.field1662 - 1; var37 >= 0; var37--) {
                int var38 = field1680[var37];
                if (var38 > 0) {
                    int[] var39 = field1681[var37];
                    for (int var40 = 0; var40 < var38; var40++) {
                        this.method2543(var39[var40]);
                    }
                }
            }
            return;
        }
        for (int var41 = 0; var41 < 12; var41++) {
            field1682[var41] = 0;
            field1686[var41] = 0;
        }
        for (int var42 = this.field1662 - 1; var42 >= 0; var42--) {
            int var43 = field1680[var42];
            if (var43 > 0) {
                int[] var44 = field1681[var42];
                for (int var45 = 0; var45 < var43; var45++) {
                    int var46 = var44[var45];
                    byte var47 = this.field1660[var46];
                    int var48 = field1682[var47]++;
                    field1689[var47][var48] = var46;
                    if (var47 < 10) {
                        field1686[var47] += var42;
                    } else if (var47 == 10) {
                        field1684[var48] = var42;
                    } else {
                        field1685[var48] = var42;
                    }
                }
            }
        }
        int var49 = 0;
        if (field1682[1] > 0 || field1682[2] > 0) {
            var49 = (field1686[1] + field1686[2]) / (field1682[1] + field1682[2]);
        }
        int var50 = 0;
        if (field1682[3] > 0 || field1682[4] > 0) {
            var50 = (field1686[3] + field1686[4]) / (field1682[3] + field1682[4]);
        }
        int var51 = 0;
        if (field1682[6] > 0 || field1682[8] > 0) {
            var51 = (field1686[6] + field1686[8]) / (field1682[6] + field1682[8]);
        }
        int var52 = 0;
        int var53 = field1682[10];
        int[] var54 = field1689[10];
        int[] var55 = field1684;
        if (var52 == var53) {
            var52 = 0;
            var53 = field1682[11];
            var54 = field1689[11];
            var55 = field1685;
        }
        int var56;
        if (var52 < var53) {
            var56 = var55[var52];
        } else {
            var56 = -1000;
        }
        for (int var57 = 0; var57 < 10; var57++) {
            while (var57 == 0 && var56 > var49) {
                this.method2543(var54[var52++]);
                if (var52 == var53 && field1689[11] != var54) {
                    var52 = 0;
                    var53 = field1682[11];
                    var54 = field1689[11];
                    var55 = field1685;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            while (var57 == 3 && var56 > var50) {
                this.method2543(var54[var52++]);
                if (var52 == var53 && field1689[11] != var54) {
                    var52 = 0;
                    var53 = field1682[11];
                    var54 = field1689[11];
                    var55 = field1685;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            while (var57 == 5 && var56 > var51) {
                this.method2543(var54[var52++]);
                if (var52 == var53 && field1689[11] != var54) {
                    var52 = 0;
                    var53 = field1682[11];
                    var54 = field1689[11];
                    var55 = field1685;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            int var58 = field1682[var57];
            int[] var59 = field1689[var57];
            for (int var60 = 0; var60 < var58; var60++) {
                this.method2543(var59[var60]);
            }
        }
        while (var56 != -1000) {
            this.method2543(var54[var52++]);
            if (var52 == var53 && field1689[11] != var54) {
                var52 = 0;
                var54 = field1689[11];
                var53 = field1682[11];
                var55 = field1685;
            }
            if (var52 < var53) {
                var56 = var55[var52];
            } else {
                var56 = -1000;
            }
        }
    }

    @ObfuscatedName("da.ab(I)V")
    public final void method2543(int arg0) {
        if (field1663[arg0]) {
            this.method2491(arg0);
            return;
        }
        int var2 = this.field1641[arg0];
        int var3 = this.field1642[arg0];
        int var4 = this.field1643[arg0];
        class125.field1733 = field1671[arg0];
        if (this.field1648 == null) {
            class125.field1723 = 0;
        } else {
            class125.field1723 = this.field1648[arg0] & 0xFF;
        }
        if (this.field1650 != null && this.field1650[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1649 == null || this.field1649[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1649[arg0] & 0xFF;
                var6 = this.field1654[var5];
                var7 = this.field1675[var5];
                var8 = this.field1655[var5];
            }
            if (this.field1672[arg0] == -1) {
                class125.method2612(field1674[var2], field1674[var3], field1674[var4], field1673[var2], field1673[var3], field1673[var4], this.field1644[arg0], this.field1644[arg0], this.field1644[arg0], field1687[var6], field1687[var7], field1687[var8], field1634[var6], field1634[var7], field1634[var8], field1678[var6], field1678[var7], field1678[var8], this.field1650[arg0]);
            } else {
                class125.method2612(field1674[var2], field1674[var3], field1674[var4], field1673[var2], field1673[var3], field1673[var4], this.field1644[arg0], this.field1645[arg0], this.field1672[arg0], field1687[var6], field1687[var7], field1687[var8], field1634[var6], field1634[var7], field1634[var8], field1678[var6], field1678[var7], field1678[var8], this.field1650[arg0]);
            }
        } else if (this.field1672[arg0] == -1) {
            class125.method2600(field1674[var2], field1674[var3], field1674[var4], field1673[var2], field1673[var3], field1673[var4], field1698[this.field1644[arg0]]);
        } else {
            class125.method2632(field1674[var2], field1674[var3], field1674[var4], field1673[var2], field1673[var3], field1673[var4], this.field1644[arg0], this.field1645[arg0], this.field1672[arg0]);
        }
    }

    @ObfuscatedName("da.ao(I)V")
    public final void method2491(int arg0) {
        int var2 = Statics.field1732;
        int var3 = Statics.field1719;
        int var4 = 0;
        int var5 = this.field1641[arg0];
        int var6 = this.field1642[arg0];
        int var7 = this.field1643[arg0];
        int var8 = field1678[var5];
        int var9 = field1678[var6];
        int var10 = field1678[var7];
        if (this.field1648 == null) {
            class125.field1723 = 0;
        } else {
            class125.field1723 = this.field1648[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1640[var4] = field1673[var5];
            field1676[var4] = field1674[var5];
            field1677[var4++] = this.field1644[arg0];
        } else {
            int var11 = field1687[var5];
            int var12 = field1634[var5];
            int var13 = this.field1644[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1699[var10 - var8];
                field1640[var4] = (((field1687[var7] - var11) * var14 >> 16) + var11) * class125.field1730 / 50 + var2;
                field1676[var4] = (((field1634[var7] - var12) * var14 >> 16) + var12) * class125.field1730 / 50 + var3;
                field1677[var4++] = ((this.field1672[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1699[var9 - var8];
                field1640[var4] = (((field1687[var6] - var11) * var15 >> 16) + var11) * class125.field1730 / 50 + var2;
                field1676[var4] = (((field1634[var6] - var12) * var15 >> 16) + var12) * class125.field1730 / 50 + var3;
                field1677[var4++] = ((this.field1645[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1640[var4] = field1673[var6];
            field1676[var4] = field1674[var6];
            field1677[var4++] = this.field1645[arg0];
        } else {
            int var16 = field1687[var6];
            int var17 = field1634[var6];
            int var18 = this.field1645[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1699[var8 - var9];
                field1640[var4] = (((field1687[var5] - var16) * var19 >> 16) + var16) * class125.field1730 / 50 + var2;
                field1676[var4] = (((field1634[var5] - var17) * var19 >> 16) + var17) * class125.field1730 / 50 + var3;
                field1677[var4++] = ((this.field1644[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1699[var10 - var9];
                field1640[var4] = (((field1687[var7] - var16) * var20 >> 16) + var16) * class125.field1730 / 50 + var2;
                field1676[var4] = (((field1634[var7] - var17) * var20 >> 16) + var17) * class125.field1730 / 50 + var3;
                field1677[var4++] = ((this.field1672[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1640[var4] = field1673[var7];
            field1676[var4] = field1674[var7];
            field1677[var4++] = this.field1672[arg0];
        } else {
            int var21 = field1687[var7];
            int var22 = field1634[var7];
            int var23 = this.field1672[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1699[var9 - var10];
                field1640[var4] = (((field1687[var6] - var21) * var24 >> 16) + var21) * class125.field1730 / 50 + var2;
                field1676[var4] = (((field1634[var6] - var22) * var24 >> 16) + var22) * class125.field1730 / 50 + var3;
                field1677[var4++] = ((this.field1645[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1699[var8 - var10];
                field1640[var4] = (((field1687[var5] - var21) * var25 >> 16) + var21) * class125.field1730 / 50 + var2;
                field1676[var4] = (((field1634[var5] - var22) * var25 >> 16) + var22) * class125.field1730 / 50 + var3;
                field1677[var4++] = ((this.field1644[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1640[0];
        int var27 = field1640[1];
        int var28 = field1640[2];
        int var29 = field1676[0];
        int var30 = field1676[1];
        int var31 = field1676[2];
        class125.field1733 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1742 || var27 > Statics.field1742 || var28 > Statics.field1742) {
                class125.field1733 = true;
            }
            if (this.field1650 != null && this.field1650[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1649 == null || this.field1649[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1649[arg0] & 0xFF;
                    var33 = this.field1654[var32];
                    var34 = this.field1675[var32];
                    var35 = this.field1655[var32];
                }
                if (this.field1672[arg0] == -1) {
                    class125.method2612(var29, var30, var31, var26, var27, var28, this.field1644[arg0], this.field1644[arg0], this.field1644[arg0], field1687[var33], field1687[var34], field1687[var35], field1634[var33], field1634[var34], field1634[var35], field1678[var33], field1678[var34], field1678[var35], this.field1650[arg0]);
                } else {
                    class125.method2612(var29, var30, var31, var26, var27, var28, field1677[0], field1677[1], field1677[2], field1687[var33], field1687[var34], field1687[var35], field1634[var33], field1634[var34], field1634[var35], field1678[var33], field1678[var34], field1678[var35], this.field1650[arg0]);
                }
            } else if (this.field1672[arg0] == -1) {
                class125.method2600(var29, var30, var31, var26, var27, var28, field1698[this.field1644[arg0]]);
            } else {
                class125.method2632(var29, var30, var31, var26, var27, var28, field1677[0], field1677[1], field1677[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1742 || var27 > Statics.field1742 || var28 > Statics.field1742 || field1640[3] < 0 || field1640[3] > Statics.field1742) {
            class125.field1733 = true;
        }
        if (this.field1650 != null && this.field1650[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1649 == null || this.field1649[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1649[arg0] & 0xFF;
                var37 = this.field1654[var36];
                var38 = this.field1675[var36];
                var39 = this.field1655[var36];
            }
            short var40 = this.field1650[arg0];
            if (this.field1672[arg0] == -1) {
                class125.method2612(var29, var30, var31, var26, var27, var28, this.field1644[arg0], this.field1644[arg0], this.field1644[arg0], field1687[var37], field1687[var38], field1687[var39], field1634[var37], field1634[var38], field1634[var39], field1678[var37], field1678[var38], field1678[var39], var40);
                class125.method2612(var29, var31, field1676[3], var26, var28, field1640[3], this.field1644[arg0], this.field1644[arg0], this.field1644[arg0], field1687[var37], field1687[var38], field1687[var39], field1634[var37], field1634[var38], field1634[var39], field1678[var37], field1678[var38], field1678[var39], var40);
            } else {
                class125.method2612(var29, var30, var31, var26, var27, var28, field1677[0], field1677[1], field1677[2], field1687[var37], field1687[var38], field1687[var39], field1634[var37], field1634[var38], field1634[var39], field1678[var37], field1678[var38], field1678[var39], var40);
                class125.method2612(var29, var31, field1676[3], var26, var28, field1640[3], field1677[0], field1677[2], field1677[3], field1687[var37], field1687[var38], field1687[var39], field1634[var37], field1634[var38], field1634[var39], field1678[var37], field1678[var38], field1678[var39], var40);
            }
        } else if (this.field1672[arg0] == -1) {
            int var41 = field1698[this.field1644[arg0]];
            class125.method2600(var29, var30, var31, var26, var27, var28, var41);
            class125.method2600(var29, var31, field1676[3], var26, var28, field1640[3], var41);
        } else {
            class125.method2632(var29, var30, var31, var26, var27, var28, field1677[0], field1677[1], field1677[2]);
            class125.method2632(var29, var31, field1676[3], var26, var28, field1640[3], field1677[0], field1677[2], field1677[3]);
        }
    }
}
