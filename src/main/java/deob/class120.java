package deob;

@ObfuscatedName("dk")
public class class120 extends class128 {

    @ObfuscatedName("dk.w")
    public static class120 field1624 = new class120();

    @ObfuscatedName("dk.m")
    public static byte[] field1612 = new byte[1];

    @ObfuscatedName("dk.q")
    public static class120 field1613 = new class120();

    @ObfuscatedName("dk.b")
    public static byte[] field1614 = new byte[1];

    @ObfuscatedName("dk.f")
    public int field1655 = 0;

    @ObfuscatedName("dk.n")
    public int[] field1670;

    @ObfuscatedName("dk.h")
    public int[] field1625;

    @ObfuscatedName("dk.x")
    public int[] field1618;

    @ObfuscatedName("dk.j")
    public int field1619 = 0;

    @ObfuscatedName("dk.a")
    public int[] field1665;

    @ObfuscatedName("dk.l")
    public int[] field1621;

    @ObfuscatedName("dk.d")
    public int[] field1622;

    @ObfuscatedName("dk.s")
    public int[] field1623;

    @ObfuscatedName("dk.p")
    public int[] field1672;

    @ObfuscatedName("dk.g")
    public int[] field1627;

    @ObfuscatedName("dk.y")
    public byte[] field1649;

    @ObfuscatedName("dk.c")
    public byte[] field1630;

    @ObfuscatedName("dk.e")
    public byte[] field1628;

    @ObfuscatedName("dk.t")
    public short[] field1629;

    @ObfuscatedName("dk.u")
    public byte field1620 = 0;

    @ObfuscatedName("dk.i")
    public int field1631 = 0;

    @ObfuscatedName("dk.z")
    public int[] field1636;

    @ObfuscatedName("dk.k")
    public int[] field1633;

    @ObfuscatedName("dk.r")
    public int[] field1634;

    @ObfuscatedName("dk.v")
    public int[][] field1616;

    @ObfuscatedName("dk.o")
    public int[][] field1661;

    @ObfuscatedName("dk.ai")
    public boolean field1637 = false;

    @ObfuscatedName("dk.at")
    public int field1638;

    @ObfuscatedName("dk.ad")
    public int field1626;

    @ObfuscatedName("dk.ac")
    public int field1640;

    @ObfuscatedName("dk.ay")
    public int field1641;

    @ObfuscatedName("dk.an")
    public int field1642;

    @ObfuscatedName("dk.as")
    public int field1643;

    @ObfuscatedName("dk.aw")
    public int field1639;

    @ObfuscatedName("dk.ag")
    public int field1650;

    @ObfuscatedName("dk.ah")
    public int field1646 = -1;

    @ObfuscatedName("dk.az")
    public int field1676 = -1;

    @ObfuscatedName("dk.ao")
    public int field1648 = -1;

    @ObfuscatedName("dk.af")
    public static boolean[] field1611 = new boolean[4700];

    @ObfuscatedName("dk.am")
    public static boolean[] field1651 = new boolean[4700];

    @ObfuscatedName("dk.aq")
    public static int[] field1652 = new int[4700];

    @ObfuscatedName("dk.aj")
    public static int[] field1653 = new int[4700];

    @ObfuscatedName("dk.ae")
    public static int[] field1654 = new int[4700];

    @ObfuscatedName("dk.au")
    public static int[] field1615 = new int[4700];

    @ObfuscatedName("dk.av")
    public static int[] field1656 = new int[4700];

    @ObfuscatedName("dk.ab")
    public static int[] field1657 = new int[4700];

    @ObfuscatedName("dk.ar")
    public static int[] field1659 = new int[1600];

    @ObfuscatedName("dk.ax")
    public static int[][] field1660 = new int[1600][512];

    @ObfuscatedName("dk.al")
    public static int[] field1632 = new int[12];

    @ObfuscatedName("dk.ak")
    public static int[][] field1662 = new int[12][2000];

    @ObfuscatedName("dk.bc")
    public static int[] field1663 = new int[2000];

    @ObfuscatedName("dk.bo")
    public static int[] field1664 = new int[2000];

    @ObfuscatedName("dk.bx")
    public static int[] field1635 = new int[12];

    @ObfuscatedName("dk.be")
    public static int[] field1666 = new int[10];

    @ObfuscatedName("dk.br")
    public static int[] field1667 = new int[10];

    @ObfuscatedName("dk.bk")
    public static int[] field1668 = new int[10];

    @ObfuscatedName("dk.by")
    public static boolean field1673 = true;

    @ObfuscatedName("dk.bi")
    public static int[] field1675 = class123.field1703;

    @ObfuscatedName("dk.bb")
    public static int[] field1645 = class123.field1709;

    @ObfuscatedName("dk.bt")
    public static int[] field1677 = class123.field1722;

    @ObfuscatedName("dk.bm")
    public static int[] field1678 = class123.field1705;

    public class120() {
    }

    public class120(class120[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1655 = 0;
        this.field1619 = 0;
        this.field1631 = 0;
        this.field1620 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class120 var8 = arg0[var7];
            if (var8 != null) {
                this.field1655 += var8.field1655;
                this.field1619 += var8.field1619;
                this.field1631 += var8.field1631;
                if (var8.field1649 == null) {
                    if (this.field1620 == -1) {
                        this.field1620 = var8.field1620;
                    }
                    if (this.field1620 != var8.field1620) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1630 != null;
                var5 |= var8.field1629 != null;
                var6 |= var8.field1628 != null;
            }
        }
        this.field1670 = new int[this.field1655];
        this.field1625 = new int[this.field1655];
        this.field1618 = new int[this.field1655];
        this.field1665 = new int[this.field1619];
        this.field1621 = new int[this.field1619];
        this.field1622 = new int[this.field1619];
        this.field1623 = new int[this.field1619];
        this.field1672 = new int[this.field1619];
        this.field1627 = new int[this.field1619];
        if (var3) {
            this.field1649 = new byte[this.field1619];
        }
        if (var4) {
            this.field1630 = new byte[this.field1619];
        }
        if (var5) {
            this.field1629 = new short[this.field1619];
        }
        if (var6) {
            this.field1628 = new byte[this.field1619];
        }
        if (this.field1631 > 0) {
            this.field1636 = new int[this.field1631];
            this.field1633 = new int[this.field1631];
            this.field1634 = new int[this.field1631];
        }
        this.field1655 = 0;
        this.field1619 = 0;
        this.field1631 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class120 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1619; var11++) {
                    this.field1665[this.field1619] = var10.field1665[var11] + this.field1655;
                    this.field1621[this.field1619] = var10.field1621[var11] + this.field1655;
                    this.field1622[this.field1619] = var10.field1622[var11] + this.field1655;
                    this.field1623[this.field1619] = var10.field1623[var11];
                    this.field1672[this.field1619] = var10.field1672[var11];
                    this.field1627[this.field1619] = var10.field1627[var11];
                    if (var3) {
                        if (var10.field1649 == null) {
                            this.field1649[this.field1619] = var10.field1620;
                        } else {
                            this.field1649[this.field1619] = var10.field1649[var11];
                        }
                    }
                    if (var4 && var10.field1630 != null) {
                        this.field1630[this.field1619] = var10.field1630[var11];
                    }
                    if (var5) {
                        if (var10.field1629 == null) {
                            this.field1629[this.field1619] = -1;
                        } else {
                            this.field1629[this.field1619] = var10.field1629[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1628 == null || var10.field1628[var11] == -1) {
                            this.field1628[this.field1619] = -1;
                        } else {
                            this.field1628[this.field1619] = (byte) (var10.field1628[var11] + this.field1631);
                        }
                    }
                    this.field1619++;
                }
                for (int var12 = 0; var12 < var10.field1631; var12++) {
                    this.field1636[this.field1631] = var10.field1636[var12] + this.field1655;
                    this.field1633[this.field1631] = var10.field1633[var12] + this.field1655;
                    this.field1634[this.field1631] = var10.field1634[var12] + this.field1655;
                    this.field1631++;
                }
                for (int var13 = 0; var13 < var10.field1655; var13++) {
                    this.field1670[this.field1655] = var10.field1670[var13];
                    this.field1625[this.field1655] = var10.field1625[var13];
                    this.field1618[this.field1655] = var10.field1618[var13];
                    this.field1655++;
                }
            }
        }
    }

    @ObfuscatedName("dk.w([[IIIIZI)Ldk;")
    public class120 method2507(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2512();
        int var7 = arg1 - this.field1640;
        int var8 = this.field1640 + arg1;
        int var9 = arg3 - this.field1640;
        int var10 = this.field1640 + arg3;
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
        class120 var15;
        if (arg4) {
            var15 = new class120();
            var15.field1655 = this.field1655;
            var15.field1619 = this.field1619;
            var15.field1631 = this.field1631;
            var15.field1670 = this.field1670;
            var15.field1618 = this.field1618;
            var15.field1665 = this.field1665;
            var15.field1621 = this.field1621;
            var15.field1622 = this.field1622;
            var15.field1623 = this.field1623;
            var15.field1672 = this.field1672;
            var15.field1627 = this.field1627;
            var15.field1649 = this.field1649;
            var15.field1630 = this.field1630;
            var15.field1628 = this.field1628;
            var15.field1629 = this.field1629;
            var15.field1620 = this.field1620;
            var15.field1636 = this.field1636;
            var15.field1633 = this.field1633;
            var15.field1634 = this.field1634;
            var15.field1616 = this.field1616;
            var15.field1661 = this.field1661;
            var15.field1637 = this.field1637;
            var15.field1625 = new int[var15.field1655];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1655; var16++) {
                int var17 = this.field1670[var16] + arg1;
                int var18 = this.field1618[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1625[var16] = this.field1625[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1655; var26++) {
                int var27 = (-this.field1625[var26] << 16) / this.field1806;
                if (var27 < arg5) {
                    int var28 = this.field1670[var26] + arg1;
                    int var29 = this.field1618[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1625[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1625[var26];
                }
            }
        }
        var15.method2515();
        return var15;
    }

    @ObfuscatedName("dk.m(Z)Ldk;")
    public class120 method2516(boolean arg0) {
        if (!arg0 && field1612.length < this.field1619) {
            field1612 = new byte[this.field1619 + 100];
        }
        return this.method2510(arg0, field1624, field1612);
    }

    @ObfuscatedName("dk.q(Z)Ldk;")
    public class120 method2509(boolean arg0) {
        if (!arg0 && field1614.length < this.field1619) {
            field1614 = new byte[this.field1619 + 100];
        }
        return this.method2510(arg0, field1613, field1614);
    }

    @ObfuscatedName("dk.x(ZLdk;[B)Ldk;")
    public class120 method2510(boolean arg0, class120 arg1, byte[] arg2) {
        arg1.field1655 = this.field1655;
        arg1.field1619 = this.field1619;
        arg1.field1631 = this.field1631;
        if (arg1.field1670 == null || arg1.field1670.length < this.field1655) {
            arg1.field1670 = new int[this.field1655 + 100];
            arg1.field1625 = new int[this.field1655 + 100];
            arg1.field1618 = new int[this.field1655 + 100];
        }
        for (int var4 = 0; var4 < this.field1655; var4++) {
            arg1.field1670[var4] = this.field1670[var4];
            arg1.field1625[var4] = this.field1625[var4];
            arg1.field1618[var4] = this.field1618[var4];
        }
        if (arg0) {
            arg1.field1630 = this.field1630;
        } else {
            arg1.field1630 = arg2;
            if (this.field1630 == null) {
                for (int var5 = 0; var5 < this.field1619; var5++) {
                    arg1.field1630[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1619; var6++) {
                    arg1.field1630[var6] = this.field1630[var6];
                }
            }
        }
        arg1.field1665 = this.field1665;
        arg1.field1621 = this.field1621;
        arg1.field1622 = this.field1622;
        arg1.field1623 = this.field1623;
        arg1.field1672 = this.field1672;
        arg1.field1627 = this.field1627;
        arg1.field1649 = this.field1649;
        arg1.field1628 = this.field1628;
        arg1.field1629 = this.field1629;
        arg1.field1620 = this.field1620;
        arg1.field1636 = this.field1636;
        arg1.field1633 = this.field1633;
        arg1.field1634 = this.field1634;
        arg1.field1616 = this.field1616;
        arg1.field1661 = this.field1661;
        arg1.field1637 = this.field1637;
        arg1.method2515();
        return arg1;
    }

    @ObfuscatedName("dk.j(I)V")
    public void method2511(int arg0) {
        if (this.field1646 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1645[arg0];
        int var9 = field1675[arg0];
        for (int var10 = 0; var10 < this.field1655; var10++) {
            int var11 = class123.method2623(this.field1670[var10], this.field1618[var10], var8, var9);
            int var12 = this.field1625[var10];
            int var13 = class123.method2643(this.field1670[var10], this.field1618[var10], var8, var9);
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
        this.field1643 = (var2 + var5) / 2;
        this.field1639 = (var3 + var6) / 2;
        this.field1650 = (var4 + var7) / 2;
        this.field1646 = (var5 - var2 + 1) / 2;
        this.field1676 = (var6 - var3 + 1) / 2;
        this.field1648 = (var7 - var4 + 1) / 2;
        if (this.field1646 < 32) {
            this.field1646 = 32;
        }
        if (this.field1648 < 32) {
            this.field1648 = 32;
        }
        if (this.field1637) {
            this.field1646 += 8;
            this.field1648 += 8;
        }
    }

    @ObfuscatedName("dk.a()V")
    public void method2512() {
        if (this.field1638 == 1) {
            return;
        }
        this.field1638 = 1;
        this.field1806 = 0;
        this.field1626 = 0;
        this.field1640 = 0;
        for (int var1 = 0; var1 < this.field1655; var1++) {
            int var2 = this.field1670[var1];
            int var3 = this.field1625[var1];
            int var4 = this.field1618[var1];
            if (-var3 > this.field1806) {
                this.field1806 = -var3;
            }
            if (var3 > this.field1626) {
                this.field1626 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1640) {
                this.field1640 = var5;
            }
        }
        this.field1640 = (int) (Math.sqrt((double) this.field1640) + 0.99D);
        this.field1642 = (int) (Math.sqrt((double) (this.field1806 * this.field1806 + this.field1640 * this.field1640)) + 0.99D);
        this.field1641 = this.field1642 + (int) (Math.sqrt((double) (this.field1640 * this.field1640 + this.field1626 * this.field1626)) + 0.99D);
    }

    @ObfuscatedName("dk.l()V")
    public void method2513() {
        if (this.field1638 == 2) {
            return;
        }
        this.field1638 = 2;
        this.field1640 = 0;
        for (int var1 = 0; var1 < this.field1655; var1++) {
            int var2 = this.field1670[var1];
            int var3 = this.field1625[var1];
            int var4 = this.field1618[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1640) {
                this.field1640 = var5;
            }
        }
        this.field1640 = (int) (Math.sqrt((double) this.field1640) + 0.99D);
        this.field1642 = this.field1640;
        this.field1641 = this.field1640 + this.field1640;
    }

    @ObfuscatedName("dk.d()I")
    public int method2514() {
        this.method2512();
        return this.field1640;
    }

    @ObfuscatedName("dk.p()V")
    public void method2515() {
        this.field1638 = 0;
        this.field1646 = -1;
    }

    @ObfuscatedName("dk.g(Lec;I)V")
    public void method2570(class131 arg0, int arg1) {
        if (this.field1616 == null || arg1 == -1) {
            return;
        }
        class118 var3 = arg0.field1826[arg1];
        class125 var4 = var3.field1578;
        Statics.field1669 = 0;
        Statics.field1617 = 0;
        Statics.field1671 = 0;
        for (int var5 = 0; var5 < var3.field1579; var5++) {
            int var6 = var3.field1580[var5];
            this.method2526(var4.field1738[var6], var4.field1736[var6], var3.field1581[var5], var3.field1582[var5], var3.field1583[var5]);
        }
        this.method2515();
    }

    @ObfuscatedName("dk.y(Lec;ILec;I[I)V")
    public void method2564(class131 arg0, int arg1, class131 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2570(arg0, arg1);
            return;
        }
        class118 var6 = arg0.field1826[arg1];
        class118 var7 = arg2.field1826[arg3];
        class125 var8 = var6.field1578;
        Statics.field1669 = 0;
        Statics.field1617 = 0;
        Statics.field1671 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1579; var11++) {
            int var12 = var6.field1580[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1738[var12] == 0) {
                this.method2526(var8.field1738[var12], var8.field1736[var12], var6.field1581[var11], var6.field1582[var11], var6.field1583[var11]);
            }
        }
        Statics.field1669 = 0;
        Statics.field1617 = 0;
        Statics.field1671 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1579; var15++) {
            int var16 = var7.field1580[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1738[var16] == 0) {
                this.method2526(var8.field1738[var16], var8.field1736[var16], var7.field1581[var15], var7.field1582[var15], var7.field1583[var15]);
            }
        }
        this.method2515();
    }

    @ObfuscatedName("dk.c(I[IIII)V")
    public void method2526(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1669 = 0;
            Statics.field1617 = 0;
            Statics.field1671 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1616.length) {
                    int[] var10 = this.field1616[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1669 += this.field1670[var12];
                        Statics.field1617 += this.field1625[var12];
                        Statics.field1671 += this.field1618[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1669 = Statics.field1669 / var7 + arg2;
                Statics.field1617 = Statics.field1617 / var7 + arg3;
                Statics.field1671 = Statics.field1671 / var7 + arg4;
            } else {
                Statics.field1669 = arg2;
                Statics.field1617 = arg3;
                Statics.field1671 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1616.length) {
                    int[] var15 = this.field1616[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1670[var17] += arg2;
                        this.field1625[var17] += arg3;
                        this.field1618[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1616.length) {
                    int[] var20 = this.field1616[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1670[var22] -= Statics.field1669;
                        this.field1625[var22] -= Statics.field1617;
                        this.field1618[var22] -= Statics.field1671;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1675[var25];
                            int var27 = field1645[var25];
                            int var28 = this.field1670[var22] * var27 + this.field1625[var22] * var26 >> 16;
                            this.field1625[var22] = this.field1625[var22] * var27 - this.field1670[var22] * var26 >> 16;
                            this.field1670[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1675[var23];
                            int var30 = field1645[var23];
                            int var31 = this.field1625[var22] * var30 - this.field1618[var22] * var29 >> 16;
                            this.field1618[var22] = this.field1625[var22] * var29 + this.field1618[var22] * var30 >> 16;
                            this.field1625[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1675[var24];
                            int var33 = field1645[var24];
                            int var34 = this.field1670[var22] * var33 + this.field1618[var22] * var32 >> 16;
                            this.field1618[var22] = this.field1618[var22] * var33 - this.field1670[var22] * var32 >> 16;
                            this.field1670[var22] = var34;
                        }
                        this.field1670[var22] += Statics.field1669;
                        this.field1625[var22] += Statics.field1617;
                        this.field1618[var22] += Statics.field1671;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1616.length) {
                    int[] var37 = this.field1616[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1670[var39] -= Statics.field1669;
                        this.field1625[var39] -= Statics.field1617;
                        this.field1618[var39] -= Statics.field1671;
                        this.field1670[var39] = this.field1670[var39] * arg2 / 128;
                        this.field1625[var39] = this.field1625[var39] * arg3 / 128;
                        this.field1618[var39] = this.field1618[var39] * arg4 / 128;
                        this.field1670[var39] += Statics.field1669;
                        this.field1625[var39] += Statics.field1617;
                        this.field1618[var39] += Statics.field1671;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1661 != null && this.field1630 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1661.length) {
                    int[] var42 = this.field1661[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1630[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1630[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dk.e()V")
    public void method2519() {
        for (int var1 = 0; var1 < this.field1655; var1++) {
            int var2 = this.field1670[var1];
            this.field1670[var1] = this.field1618[var1];
            this.field1618[var1] = -var2;
        }
        this.method2515();
    }

    @ObfuscatedName("dk.t()V")
    public void method2557() {
        for (int var1 = 0; var1 < this.field1655; var1++) {
            this.field1670[var1] = -this.field1670[var1];
            this.field1618[var1] = -this.field1618[var1];
        }
        this.method2515();
    }

    @ObfuscatedName("dk.u()V")
    public void method2521() {
        for (int var1 = 0; var1 < this.field1655; var1++) {
            int var2 = this.field1618[var1];
            this.field1618[var1] = this.field1670[var1];
            this.field1670[var1] = -var2;
        }
        this.method2515();
    }

    @ObfuscatedName("dk.i(I)V")
    public void method2522(int arg0) {
        int var2 = field1675[arg0];
        int var3 = field1645[arg0];
        for (int var4 = 0; var4 < this.field1655; var4++) {
            int var5 = this.field1625[var4] * var3 - this.field1618[var4] * var2 >> 16;
            this.field1618[var4] = this.field1625[var4] * var2 + this.field1618[var4] * var3 >> 16;
            this.field1625[var4] = var5;
        }
        this.method2515();
    }

    @ObfuscatedName("dk.r(III)V")
    public void method2523(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1655; var4++) {
            this.field1670[var4] += arg0;
            this.field1625[var4] += arg1;
            this.field1618[var4] += arg2;
        }
        this.method2515();
    }

    @ObfuscatedName("dk.v(III)V")
    public void method2546(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1655; var4++) {
            this.field1670[var4] = this.field1670[var4] * arg0 / 128;
            this.field1625[var4] = this.field1625[var4] * arg1 / 128;
            this.field1618[var4] = this.field1618[var4] * arg2 / 128;
        }
        this.method2515();
    }

    @ObfuscatedName("dk.o(IIIIIII)V")
    public final void method2525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1659[0] = -1;
        if (this.field1638 != 2 && this.field1638 != 1) {
            this.method2513();
        }
        int var8 = Statics.field1706;
        int var9 = Statics.field1714;
        int var10 = field1675[arg0];
        int var11 = field1645[arg0];
        int var12 = field1675[arg1];
        int var13 = field1645[arg1];
        int var14 = field1675[arg2];
        int var15 = field1645[arg2];
        int var16 = field1675[arg3];
        int var17 = field1645[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1655; var19++) {
            int var20 = this.field1670[var19];
            int var21 = this.field1625[var19];
            int var22 = this.field1618[var19];
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
            field1654[var19] = var30 - var18;
            field1652[var19] = class123.field1712 * var26 / var30 + var8;
            field1653[var19] = class123.field1712 * var29 / var30 + var9;
            if (this.field1631 > 0) {
                field1615[var19] = var26;
                field1656[var19] = var29;
                field1657[var19] = var30;
            }
        }
        try {
            this.method2528(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dk.ai(IIIIIIII)V")
    public final void method2533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1659[0] = -1;
        if (this.field1638 != 2 && this.field1638 != 1) {
            this.method2513();
        }
        int var9 = Statics.field1706;
        int var10 = Statics.field1714;
        int var11 = field1675[arg0];
        int var12 = field1645[arg0];
        int var13 = field1675[arg1];
        int var14 = field1645[arg1];
        int var15 = field1675[arg2];
        int var16 = field1645[arg2];
        int var17 = field1675[arg3];
        int var18 = field1645[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1655; var20++) {
            int var21 = this.field1670[var20];
            int var22 = this.field1625[var20];
            int var23 = this.field1618[var20];
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
            field1654[var20] = var31 - var19;
            field1652[var20] = class123.field1712 * var27 / arg7 + var9;
            field1653[var20] = class123.field1712 * var30 / arg7 + var10;
            if (this.field1631 > 0) {
                field1615[var20] = var27;
                field1656[var20] = var30;
                field1657[var20] = var31;
            }
        }
        try {
            this.method2528(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dk.cy(IIIIIIIIJ)V")
    public void method2558(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1659[0] = -1;
        if (this.field1638 != 1) {
            this.method2512();
        }
        this.method2511(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field1640 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field1640) * class123.field1712;
        if (var16 / var14 >= Statics.field1723) {
            return;
        }
        int var17 = (this.field1640 + var15) * class123.field1712;
        if (var17 / var14 <= Statics.field1717) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field1640 * arg1 >> 16;
        int var20 = (var18 + var19) * class123.field1712;
        if (var20 / var14 <= Statics.field1719) {
            return;
        }
        int var21 = (this.field1806 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class123.field1712;
        if (var22 / var14 >= Statics.field1720) {
            return;
        }
        int var23 = (this.field1806 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field1631 > 0;
        int var27 = class121.field1682;
        int var29 = class121.method3031();
        boolean var30 = class121.field1688;
        boolean var32 = class121.method456(arg8);
        boolean var33 = false;
        if (var32 && var30) {
            boolean var34 = false;
            if (field1673) {
                boolean var36 = class121.field1688;
                boolean var37;
                if (var36) {
                    class121.method611();
                    int var38 = this.field1643 + arg5;
                    int var39 = this.field1639 + arg6;
                    int var40 = this.field1650 + arg7;
                    int var41 = this.field1646;
                    int var42 = this.field1676;
                    int var43 = this.field1648;
                    int var44 = Statics.field1685 - var38;
                    int var45 = Statics.field1937 - var39;
                    int var46 = Statics.field3738 - var40;
                    if (Math.abs(var44) > Statics.field3693 + var41) {
                        var37 = false;
                    } else if (Math.abs(var45) > Statics.field1981 + var42) {
                        var37 = false;
                    } else if (Math.abs(var46) > Statics.field1683 + var43) {
                        var37 = false;
                    } else if (Math.abs(Statics.field3663 * var46 - Statics.field1686 * var45) > Statics.field1981 * var43 + Statics.field1683 * var42) {
                        var37 = false;
                    } else if (Math.abs(Statics.field1686 * var44 - Statics.field1057 * var46) > Statics.field3693 * var43 + Statics.field1683 * var41) {
                        var37 = false;
                    } else if (Math.abs(Statics.field1057 * var45 - Statics.field3663 * var44) > Statics.field3693 * var42 + Statics.field1981 * var41) {
                        var37 = false;
                    } else {
                        var37 = true;
                    }
                } else {
                    var37 = false;
                }
                var34 = var37;
            } else {
                int var47 = var12 - var13;
                if (var47 <= 50) {
                    var47 = 50;
                }
                int var48;
                int var49;
                if (var15 > 0) {
                    var48 = var16 / var14;
                    var49 = var17 / var47;
                } else {
                    var49 = var17 / var14;
                    var48 = var16 / var47;
                }
                int var50;
                int var51;
                if (var18 > 0) {
                    var50 = var22 / var14;
                    var51 = var20 / var47;
                } else {
                    var51 = var20 / var14;
                    var50 = var22 / var47;
                }
                int var52 = var27 - Statics.field1706;
                int var53 = var29 - Statics.field1714;
                if (var52 > var48 && var52 < var49 && var53 > var50 && var53 < var51) {
                    var34 = true;
                }
            }
            if (var34) {
                if (this.field1637) {
                    class121.field1689[++class121.field1687 - 1] = arg8;
                } else {
                    var33 = true;
                }
            }
        }
        int var56 = Statics.field1706;
        int var57 = Statics.field1714;
        int var58 = 0;
        int var59 = 0;
        if (arg0 != 0) {
            var58 = field1675[arg0];
            var59 = field1645[arg0];
        }
        for (int var60 = 0; var60 < this.field1655; var60++) {
            int var61 = this.field1670[var60];
            int var62 = this.field1625[var60];
            int var63 = this.field1618[var60];
            if (arg0 != 0) {
                int var64 = var58 * var63 + var59 * var61 >> 16;
                var63 = var59 * var63 - var58 * var61 >> 16;
                var61 = var64;
            }
            int var65 = arg5 + var61;
            int var66 = arg6 + var62;
            int var67 = arg7 + var63;
            int var68 = arg3 * var67 + arg4 * var65 >> 16;
            int var69 = arg4 * var67 - arg3 * var65 >> 16;
            int var71 = arg2 * var66 - arg1 * var69 >> 16;
            int var72 = arg1 * var66 + arg2 * var69 >> 16;
            field1654[var60] = var72 - var12;
            if (var72 >= 50) {
                field1652[var60] = class123.field1712 * var68 / var72 + var56;
                field1653[var60] = class123.field1712 * var71 / var72 + var57;
            } else {
                field1652[var60] = -5000;
                var24 = true;
            }
            if (var26) {
                field1615[var60] = var68;
                field1656[var60] = var71;
                field1657[var60] = var72;
            }
        }
        try {
            this.method2528(var24, var33, this.field1637, arg8);
        } catch (Exception var75) {
        }
    }

    @ObfuscatedName("dk.at(ZZZJ)V")
    public final void method2528(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field1641 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field1641; var6++) {
            field1659[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field1619; var8++) {
            if (this.field1627[var8] != -2) {
                int var9 = this.field1665[var8];
                int var10 = this.field1621[var8];
                int var11 = this.field1622[var8];
                int var12 = field1652[var9];
                int var13 = field1652[var10];
                int var14 = field1652[var11];
                if (arg0 && var12 == -5000 || var13 == -5000 || var14 == -5000) {
                    int var15 = field1615[var9];
                    int var16 = field1615[var10];
                    int var17 = field1615[var11];
                    int var18 = field1656[var9];
                    int var19 = field1656[var10];
                    int var20 = field1656[var11];
                    int var21 = field1657[var9];
                    int var22 = field1657[var10];
                    int var23 = field1657[var11];
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
                        field1651[var8] = true;
                        int var33 = (field1654[var9] + field1654[var10] + field1654[var11]) / 3 + this.field1642;
                        field1660[var33][field1659[var33]++] = var8;
                    }
                } else {
                    if (arg1) {
                        int var34 = field1653[var9];
                        int var35 = field1653[var10];
                        int var36 = field1653[var11];
                        int var37 = class121.field1681 + var7;
                        boolean var38;
                        if (var37 < var34 && var37 < var35 && var37 < var36) {
                            var38 = false;
                        } else {
                            int var39 = class121.field1681 - var7;
                            if (var39 > var34 && var39 > var35 && var39 > var36) {
                                var38 = false;
                            } else {
                                int var40 = class121.field1682 + var7;
                                if (var40 < var12 && var40 < var13 && var40 < var14) {
                                    var38 = false;
                                } else {
                                    int var41 = class121.field1682 - var7;
                                    if (var41 > var12 && var41 > var13 && var41 > var14) {
                                        var38 = false;
                                    } else {
                                        var38 = true;
                                    }
                                }
                            }
                        }
                        if (var38) {
                            class121.field1689[++class121.field1687 - 1] = arg3;
                            arg1 = false;
                        }
                    }
                    if ((field1653[var11] - field1653[var10]) * (var12 - var13) - (field1653[var9] - field1653[var10]) * (var14 - var13) > 0) {
                        field1651[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field1715 && var13 <= Statics.field1715 && var14 <= Statics.field1715) {
                            field1611[var8] = false;
                        } else {
                            field1611[var8] = true;
                        }
                        int var44 = (field1654[var9] + field1654[var10] + field1654[var11]) / 3 + this.field1642;
                        field1660[var44][field1659[var44]++] = var8;
                    }
                }
            }
        }
        if (this.field1649 == null) {
            for (int var45 = this.field1641 - 1; var45 >= 0; var45--) {
                int var46 = field1659[var45];
                if (var46 > 0) {
                    int[] var47 = field1660[var45];
                    for (int var48 = 0; var48 < var46; var48++) {
                        this.method2529(var47[var48]);
                    }
                }
            }
            return;
        }
        for (int var49 = 0; var49 < 12; var49++) {
            field1632[var49] = 0;
            field1635[var49] = 0;
        }
        for (int var50 = this.field1641 - 1; var50 >= 0; var50--) {
            int var51 = field1659[var50];
            if (var51 > 0) {
                int[] var52 = field1660[var50];
                for (int var53 = 0; var53 < var51; var53++) {
                    int var54 = var52[var53];
                    byte var55 = this.field1649[var54];
                    int var56 = field1632[var55]++;
                    field1662[var55][var56] = var54;
                    if (var55 < 10) {
                        field1635[var55] += var50;
                    } else if (var55 == 10) {
                        field1663[var56] = var50;
                    } else {
                        field1664[var56] = var50;
                    }
                }
            }
        }
        int var57 = 0;
        if (field1632[1] > 0 || field1632[2] > 0) {
            var57 = (field1635[1] + field1635[2]) / (field1632[1] + field1632[2]);
        }
        int var58 = 0;
        if (field1632[3] > 0 || field1632[4] > 0) {
            var58 = (field1635[3] + field1635[4]) / (field1632[3] + field1632[4]);
        }
        int var59 = 0;
        if (field1632[6] > 0 || field1632[8] > 0) {
            var59 = (field1635[6] + field1635[8]) / (field1632[6] + field1632[8]);
        }
        int var60 = 0;
        int var61 = field1632[10];
        int[] var62 = field1662[10];
        int[] var63 = field1663;
        if (var60 == var61) {
            var60 = 0;
            var61 = field1632[11];
            var62 = field1662[11];
            var63 = field1664;
        }
        int var64;
        if (var60 < var61) {
            var64 = var63[var60];
        } else {
            var64 = -1000;
        }
        for (int var65 = 0; var65 < 10; var65++) {
            while (var65 == 0 && var64 > var57) {
                this.method2529(var62[var60++]);
                if (var60 == var61 && field1662[11] != var62) {
                    var60 = 0;
                    var61 = field1632[11];
                    var62 = field1662[11];
                    var63 = field1664;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            while (var65 == 3 && var64 > var58) {
                this.method2529(var62[var60++]);
                if (var60 == var61 && field1662[11] != var62) {
                    var60 = 0;
                    var61 = field1632[11];
                    var62 = field1662[11];
                    var63 = field1664;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            while (var65 == 5 && var64 > var59) {
                this.method2529(var62[var60++]);
                if (var60 == var61 && field1662[11] != var62) {
                    var60 = 0;
                    var61 = field1632[11];
                    var62 = field1662[11];
                    var63 = field1664;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            int var66 = field1632[var65];
            int[] var67 = field1662[var65];
            for (int var68 = 0; var68 < var66; var68++) {
                this.method2529(var67[var68]);
            }
        }
        while (var64 != -1000) {
            this.method2529(var62[var60++]);
            if (var60 == var61 && field1662[11] != var62) {
                var60 = 0;
                var62 = field1662[11];
                var61 = field1632[11];
                var63 = field1664;
            }
            if (var60 < var61) {
                var64 = var63[var60];
            } else {
                var64 = -1000;
            }
        }
    }

    @ObfuscatedName("dk.ad(I)V")
    public final void method2529(int arg0) {
        if (field1651[arg0]) {
            this.method2530(arg0);
            return;
        }
        int var2 = this.field1665[arg0];
        int var3 = this.field1621[arg0];
        int var4 = this.field1622[arg0];
        class123.field1711 = field1611[arg0];
        if (this.field1630 == null) {
            class123.field1718 = 0;
        } else {
            class123.field1718 = this.field1630[arg0] & 0xFF;
        }
        if (this.field1629 != null && this.field1629[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1628 == null || this.field1628[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1628[arg0] & 0xFF;
                var6 = this.field1636[var5];
                var7 = this.field1633[var5];
                var8 = this.field1634[var5];
            }
            if (this.field1627[arg0] == -1) {
                class123.method2618(field1653[var2], field1653[var3], field1653[var4], field1652[var2], field1652[var3], field1652[var4], this.field1623[arg0], this.field1623[arg0], this.field1623[arg0], field1615[var6], field1615[var7], field1615[var8], field1656[var6], field1656[var7], field1656[var8], field1657[var6], field1657[var7], field1657[var8], this.field1629[arg0]);
            } else {
                class123.method2618(field1653[var2], field1653[var3], field1653[var4], field1652[var2], field1652[var3], field1652[var4], this.field1623[arg0], this.field1672[arg0], this.field1627[arg0], field1615[var6], field1615[var7], field1615[var8], field1656[var6], field1656[var7], field1656[var8], field1657[var6], field1657[var7], field1657[var8], this.field1629[arg0]);
            }
        } else if (this.field1627[arg0] == -1) {
            class123.method2649(field1653[var2], field1653[var3], field1653[var4], field1652[var2], field1652[var3], field1652[var4], field1677[this.field1623[arg0]]);
        } else {
            class123.method2660(field1653[var2], field1653[var3], field1653[var4], field1652[var2], field1652[var3], field1652[var4], this.field1623[arg0], this.field1672[arg0], this.field1627[arg0]);
        }
    }

    @ObfuscatedName("dk.ac(I)V")
    public final void method2530(int arg0) {
        int var2 = Statics.field1706;
        int var3 = Statics.field1714;
        int var4 = 0;
        int var5 = this.field1665[arg0];
        int var6 = this.field1621[arg0];
        int var7 = this.field1622[arg0];
        int var8 = field1657[var5];
        int var9 = field1657[var6];
        int var10 = field1657[var7];
        if (this.field1630 == null) {
            class123.field1718 = 0;
        } else {
            class123.field1718 = this.field1630[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1666[var4] = field1652[var5];
            field1667[var4] = field1653[var5];
            field1668[var4++] = this.field1623[arg0];
        } else {
            int var11 = field1615[var5];
            int var12 = field1656[var5];
            int var13 = this.field1623[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1678[var10 - var8];
                field1666[var4] = (((field1615[var7] - var11) * var14 >> 16) + var11) * class123.field1712 / 50 + var2;
                field1667[var4] = (((field1656[var7] - var12) * var14 >> 16) + var12) * class123.field1712 / 50 + var3;
                field1668[var4++] = ((this.field1627[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1678[var9 - var8];
                field1666[var4] = (((field1615[var6] - var11) * var15 >> 16) + var11) * class123.field1712 / 50 + var2;
                field1667[var4] = (((field1656[var6] - var12) * var15 >> 16) + var12) * class123.field1712 / 50 + var3;
                field1668[var4++] = ((this.field1672[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1666[var4] = field1652[var6];
            field1667[var4] = field1653[var6];
            field1668[var4++] = this.field1672[arg0];
        } else {
            int var16 = field1615[var6];
            int var17 = field1656[var6];
            int var18 = this.field1672[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1678[var8 - var9];
                field1666[var4] = (((field1615[var5] - var16) * var19 >> 16) + var16) * class123.field1712 / 50 + var2;
                field1667[var4] = (((field1656[var5] - var17) * var19 >> 16) + var17) * class123.field1712 / 50 + var3;
                field1668[var4++] = ((this.field1623[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1678[var10 - var9];
                field1666[var4] = (((field1615[var7] - var16) * var20 >> 16) + var16) * class123.field1712 / 50 + var2;
                field1667[var4] = (((field1656[var7] - var17) * var20 >> 16) + var17) * class123.field1712 / 50 + var3;
                field1668[var4++] = ((this.field1627[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1666[var4] = field1652[var7];
            field1667[var4] = field1653[var7];
            field1668[var4++] = this.field1627[arg0];
        } else {
            int var21 = field1615[var7];
            int var22 = field1656[var7];
            int var23 = this.field1627[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1678[var9 - var10];
                field1666[var4] = (((field1615[var6] - var21) * var24 >> 16) + var21) * class123.field1712 / 50 + var2;
                field1667[var4] = (((field1656[var6] - var22) * var24 >> 16) + var22) * class123.field1712 / 50 + var3;
                field1668[var4++] = ((this.field1672[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1678[var8 - var10];
                field1666[var4] = (((field1615[var5] - var21) * var25 >> 16) + var21) * class123.field1712 / 50 + var2;
                field1667[var4] = (((field1656[var5] - var22) * var25 >> 16) + var22) * class123.field1712 / 50 + var3;
                field1668[var4++] = ((this.field1623[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1666[0];
        int var27 = field1666[1];
        int var28 = field1666[2];
        int var29 = field1667[0];
        int var30 = field1667[1];
        int var31 = field1667[2];
        class123.field1711 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1715 || var27 > Statics.field1715 || var28 > Statics.field1715) {
                class123.field1711 = true;
            }
            if (this.field1629 != null && this.field1629[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1628 == null || this.field1628[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1628[arg0] & 0xFF;
                    var33 = this.field1636[var32];
                    var34 = this.field1633[var32];
                    var35 = this.field1634[var32];
                }
                if (this.field1627[arg0] == -1) {
                    class123.method2618(var29, var30, var31, var26, var27, var28, this.field1623[arg0], this.field1623[arg0], this.field1623[arg0], field1615[var33], field1615[var34], field1615[var35], field1656[var33], field1656[var34], field1656[var35], field1657[var33], field1657[var34], field1657[var35], this.field1629[arg0]);
                } else {
                    class123.method2618(var29, var30, var31, var26, var27, var28, field1668[0], field1668[1], field1668[2], field1615[var33], field1615[var34], field1615[var35], field1656[var33], field1656[var34], field1656[var35], field1657[var33], field1657[var34], field1657[var35], this.field1629[arg0]);
                }
            } else if (this.field1627[arg0] == -1) {
                class123.method2649(var29, var30, var31, var26, var27, var28, field1677[this.field1623[arg0]]);
            } else {
                class123.method2660(var29, var30, var31, var26, var27, var28, field1668[0], field1668[1], field1668[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1715 || var27 > Statics.field1715 || var28 > Statics.field1715 || field1666[3] < 0 || field1666[3] > Statics.field1715) {
            class123.field1711 = true;
        }
        if (this.field1629 != null && this.field1629[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1628 == null || this.field1628[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1628[arg0] & 0xFF;
                var37 = this.field1636[var36];
                var38 = this.field1633[var36];
                var39 = this.field1634[var36];
            }
            short var40 = this.field1629[arg0];
            if (this.field1627[arg0] == -1) {
                class123.method2618(var29, var30, var31, var26, var27, var28, this.field1623[arg0], this.field1623[arg0], this.field1623[arg0], field1615[var37], field1615[var38], field1615[var39], field1656[var37], field1656[var38], field1656[var39], field1657[var37], field1657[var38], field1657[var39], var40);
                class123.method2618(var29, var31, field1667[3], var26, var28, field1666[3], this.field1623[arg0], this.field1623[arg0], this.field1623[arg0], field1615[var37], field1615[var38], field1615[var39], field1656[var37], field1656[var38], field1656[var39], field1657[var37], field1657[var38], field1657[var39], var40);
            } else {
                class123.method2618(var29, var30, var31, var26, var27, var28, field1668[0], field1668[1], field1668[2], field1615[var37], field1615[var38], field1615[var39], field1656[var37], field1656[var38], field1656[var39], field1657[var37], field1657[var38], field1657[var39], var40);
                class123.method2618(var29, var31, field1667[3], var26, var28, field1666[3], field1668[0], field1668[2], field1668[3], field1615[var37], field1615[var38], field1615[var39], field1656[var37], field1656[var38], field1656[var39], field1657[var37], field1657[var38], field1657[var39], var40);
            }
        } else if (this.field1627[arg0] == -1) {
            int var41 = field1677[this.field1623[arg0]];
            class123.method2649(var29, var30, var31, var26, var27, var28, var41);
            class123.method2649(var29, var31, field1667[3], var26, var28, field1666[3], var41);
        } else {
            class123.method2660(var29, var30, var31, var26, var27, var28, field1668[0], field1668[1], field1668[2]);
            class123.method2660(var29, var31, field1667[3], var26, var28, field1666[3], field1668[0], field1668[2], field1668[3]);
        }
    }
}
