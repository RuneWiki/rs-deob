package deob;

@ObfuscatedName("dc")
public class class120 extends class128 {

    @ObfuscatedName("dc.z")
    public static class120 field1642 = new class120();

    @ObfuscatedName("dc.w")
    public static byte[] field1579 = new byte[1];

    @ObfuscatedName("dc.s")
    public static class120 field1580 = new class120();

    @ObfuscatedName("dc.l")
    public static byte[] field1581 = new byte[1];

    @ObfuscatedName("dc.u")
    public int field1582 = 0;

    @ObfuscatedName("dc.q")
    public int[] field1647;

    @ObfuscatedName("dc.k")
    public int[] field1584;

    @ObfuscatedName("dc.i")
    public int[] field1585;

    @ObfuscatedName("dc.x")
    public int field1586 = 0;

    @ObfuscatedName("dc.e")
    public int[] field1587;

    @ObfuscatedName("dc.p")
    public int[] field1588;

    @ObfuscatedName("dc.b")
    public int[] field1589;

    @ObfuscatedName("dc.n")
    public int[] field1616;

    @ObfuscatedName("dc.f")
    public int[] field1621;

    @ObfuscatedName("dc.g")
    public int[] field1592;

    @ObfuscatedName("dc.m")
    public byte[] field1646;

    @ObfuscatedName("dc.r")
    public byte[] field1594;

    @ObfuscatedName("dc.t")
    public byte[] field1618;

    @ObfuscatedName("dc.o")
    public short[] field1605;

    @ObfuscatedName("dc.y")
    public byte field1597 = 0;

    @ObfuscatedName("dc.a")
    public int field1598 = 0;

    @ObfuscatedName("dc.j")
    public int[] field1622;

    @ObfuscatedName("dc.d")
    public int[] field1600;

    @ObfuscatedName("dc.h")
    public int[] field1601;

    @ObfuscatedName("dc.c")
    public int[][] field1602;

    @ObfuscatedName("dc.v")
    public int[][] field1603;

    @ObfuscatedName("dc.af")
    public boolean field1604 = false;

    @ObfuscatedName("dc.ah")
    public int field1634;

    @ObfuscatedName("dc.ab")
    public int field1629;

    @ObfuscatedName("dc.aw")
    public int field1607;

    @ObfuscatedName("dc.ak")
    public int field1608;

    @ObfuscatedName("dc.as")
    public int field1619;

    @ObfuscatedName("dc.an")
    public int field1606;

    @ObfuscatedName("dc.ao")
    public int field1611;

    @ObfuscatedName("dc.at")
    public int field1612;

    @ObfuscatedName("dc.ai")
    public int field1615 = -1;

    @ObfuscatedName("dc.ac")
    public int field1614 = -1;

    @ObfuscatedName("dc.ap")
    public int field1630 = -1;

    @ObfuscatedName("dc.ar")
    public static boolean[] field1617 = new boolean[4700];

    @ObfuscatedName("dc.au")
    public static boolean[] field1627 = new boolean[4700];

    @ObfuscatedName("dc.av")
    public static int[] field1583 = new int[4700];

    @ObfuscatedName("dc.al")
    public static int[] field1620 = new int[4700];

    @ObfuscatedName("dc.ae")
    public static int[] field1591 = new int[4700];

    @ObfuscatedName("dc.az")
    public static int[] field1590 = new int[4700];

    @ObfuscatedName("dc.aq")
    public static int[] field1578 = new int[4700];

    @ObfuscatedName("dc.ad")
    public static int[] field1624 = new int[4700];

    @ObfuscatedName("dc.ax")
    public static int[] field1626 = new int[1600];

    @ObfuscatedName("dc.am")
    public static int[][] field1593 = new int[1600][512];

    @ObfuscatedName("dc.ay")
    public static int[] field1639 = new int[12];

    @ObfuscatedName("dc.ag")
    public static int[][] field1641 = new int[12][2000];

    @ObfuscatedName("dc.bk")
    public static int[] field1609 = new int[2000];

    @ObfuscatedName("dc.bp")
    public static int[] field1596 = new int[2000];

    @ObfuscatedName("dc.bi")
    public static int[] field1632 = new int[12];

    @ObfuscatedName("dc.bj")
    public static int[] field1633 = new int[10];

    @ObfuscatedName("dc.bo")
    public static int[] field1631 = new int[10];

    @ObfuscatedName("dc.bq")
    public static int[] field1635 = new int[10];

    @ObfuscatedName("dc.bg")
    public static boolean field1613 = true;

    @ObfuscatedName("dc.bn")
    public static int[] field1595 = class123.field1682;

    @ObfuscatedName("dc.bb")
    public static int[] field1643 = class123.field1694;

    @ObfuscatedName("dc.bx")
    public static int[] field1644 = class123.field1676;

    @ObfuscatedName("dc.bc")
    public static int[] field1599 = class123.field1692;

    public class120() {
    }

    public class120(class120[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1582 = 0;
        this.field1586 = 0;
        this.field1598 = 0;
        this.field1597 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class120 var8 = arg0[var7];
            if (var8 != null) {
                this.field1582 += var8.field1582;
                this.field1586 += var8.field1586;
                this.field1598 += var8.field1598;
                if (var8.field1646 == null) {
                    if (this.field1597 == -1) {
                        this.field1597 = var8.field1597;
                    }
                    if (this.field1597 != var8.field1597) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1594 != null;
                var5 |= var8.field1605 != null;
                var6 |= var8.field1618 != null;
            }
        }
        this.field1647 = new int[this.field1582];
        this.field1584 = new int[this.field1582];
        this.field1585 = new int[this.field1582];
        this.field1587 = new int[this.field1586];
        this.field1588 = new int[this.field1586];
        this.field1589 = new int[this.field1586];
        this.field1616 = new int[this.field1586];
        this.field1621 = new int[this.field1586];
        this.field1592 = new int[this.field1586];
        if (var3) {
            this.field1646 = new byte[this.field1586];
        }
        if (var4) {
            this.field1594 = new byte[this.field1586];
        }
        if (var5) {
            this.field1605 = new short[this.field1586];
        }
        if (var6) {
            this.field1618 = new byte[this.field1586];
        }
        if (this.field1598 > 0) {
            this.field1622 = new int[this.field1598];
            this.field1600 = new int[this.field1598];
            this.field1601 = new int[this.field1598];
        }
        this.field1582 = 0;
        this.field1586 = 0;
        this.field1598 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class120 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1586; var11++) {
                    this.field1587[this.field1586] = var10.field1587[var11] + this.field1582;
                    this.field1588[this.field1586] = var10.field1588[var11] + this.field1582;
                    this.field1589[this.field1586] = var10.field1589[var11] + this.field1582;
                    this.field1616[this.field1586] = var10.field1616[var11];
                    this.field1621[this.field1586] = var10.field1621[var11];
                    this.field1592[this.field1586] = var10.field1592[var11];
                    if (var3) {
                        if (var10.field1646 == null) {
                            this.field1646[this.field1586] = var10.field1597;
                        } else {
                            this.field1646[this.field1586] = var10.field1646[var11];
                        }
                    }
                    if (var4 && var10.field1594 != null) {
                        this.field1594[this.field1586] = var10.field1594[var11];
                    }
                    if (var5) {
                        if (var10.field1605 == null) {
                            this.field1605[this.field1586] = -1;
                        } else {
                            this.field1605[this.field1586] = var10.field1605[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1618 == null || var10.field1618[var11] == -1) {
                            this.field1618[this.field1586] = -1;
                        } else {
                            this.field1618[this.field1586] = (byte) (var10.field1618[var11] + this.field1598);
                        }
                    }
                    this.field1586++;
                }
                for (int var12 = 0; var12 < var10.field1598; var12++) {
                    this.field1622[this.field1598] = var10.field1622[var12] + this.field1582;
                    this.field1600[this.field1598] = var10.field1600[var12] + this.field1582;
                    this.field1601[this.field1598] = var10.field1601[var12] + this.field1582;
                    this.field1598++;
                }
                for (int var13 = 0; var13 < var10.field1582; var13++) {
                    this.field1647[this.field1582] = var10.field1647[var13];
                    this.field1584[this.field1582] = var10.field1584[var13];
                    this.field1585[this.field1582] = var10.field1585[var13];
                    this.field1582++;
                }
            }
        }
    }

    @ObfuscatedName("dc.z([[IIIIZI)Ldc;")
    public class120 method2461(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2466();
        int var7 = arg1 - this.field1607;
        int var8 = this.field1607 + arg1;
        int var9 = arg3 - this.field1607;
        int var10 = this.field1607 + arg3;
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
            var15.field1582 = this.field1582;
            var15.field1586 = this.field1586;
            var15.field1598 = this.field1598;
            var15.field1647 = this.field1647;
            var15.field1585 = this.field1585;
            var15.field1587 = this.field1587;
            var15.field1588 = this.field1588;
            var15.field1589 = this.field1589;
            var15.field1616 = this.field1616;
            var15.field1621 = this.field1621;
            var15.field1592 = this.field1592;
            var15.field1646 = this.field1646;
            var15.field1594 = this.field1594;
            var15.field1618 = this.field1618;
            var15.field1605 = this.field1605;
            var15.field1597 = this.field1597;
            var15.field1622 = this.field1622;
            var15.field1600 = this.field1600;
            var15.field1601 = this.field1601;
            var15.field1602 = this.field1602;
            var15.field1603 = this.field1603;
            var15.field1604 = this.field1604;
            var15.field1584 = new int[var15.field1582];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1582; var16++) {
                int var17 = this.field1647[var16] + arg1;
                int var18 = this.field1585[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1584[var16] = this.field1584[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1582; var26++) {
                int var27 = (-this.field1584[var26] << 16) / this.field1782;
                if (var27 < arg5) {
                    int var28 = this.field1647[var26] + arg1;
                    int var29 = this.field1585[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1584[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1584[var26];
                }
            }
        }
        var15.method2469();
        return var15;
    }

    @ObfuscatedName("dc.w(Z)Ldc;")
    public class120 method2462(boolean arg0) {
        if (!arg0 && field1579.length < this.field1586) {
            field1579 = new byte[this.field1586 + 100];
        }
        return this.method2537(arg0, field1642, field1579);
    }

    @ObfuscatedName("dc.s(Z)Ldc;")
    public class120 method2463(boolean arg0) {
        if (!arg0 && field1581.length < this.field1586) {
            field1581 = new byte[this.field1586 + 100];
        }
        return this.method2537(arg0, field1580, field1581);
    }

    @ObfuscatedName("dc.l(ZLdc;[B)Ldc;")
    public class120 method2537(boolean arg0, class120 arg1, byte[] arg2) {
        arg1.field1582 = this.field1582;
        arg1.field1586 = this.field1586;
        arg1.field1598 = this.field1598;
        if (arg1.field1647 == null || arg1.field1647.length < this.field1582) {
            arg1.field1647 = new int[this.field1582 + 100];
            arg1.field1584 = new int[this.field1582 + 100];
            arg1.field1585 = new int[this.field1582 + 100];
        }
        for (int var4 = 0; var4 < this.field1582; var4++) {
            arg1.field1647[var4] = this.field1647[var4];
            arg1.field1584[var4] = this.field1584[var4];
            arg1.field1585[var4] = this.field1585[var4];
        }
        if (arg0) {
            arg1.field1594 = this.field1594;
        } else {
            arg1.field1594 = arg2;
            if (this.field1594 == null) {
                for (int var5 = 0; var5 < this.field1586; var5++) {
                    arg1.field1594[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1586; var6++) {
                    arg1.field1594[var6] = this.field1594[var6];
                }
            }
        }
        arg1.field1587 = this.field1587;
        arg1.field1588 = this.field1588;
        arg1.field1589 = this.field1589;
        arg1.field1616 = this.field1616;
        arg1.field1621 = this.field1621;
        arg1.field1592 = this.field1592;
        arg1.field1646 = this.field1646;
        arg1.field1618 = this.field1618;
        arg1.field1605 = this.field1605;
        arg1.field1597 = this.field1597;
        arg1.field1622 = this.field1622;
        arg1.field1600 = this.field1600;
        arg1.field1601 = this.field1601;
        arg1.field1602 = this.field1602;
        arg1.field1603 = this.field1603;
        arg1.field1604 = this.field1604;
        arg1.method2469();
        return arg1;
    }

    @ObfuscatedName("dc.u(I)V")
    public void method2465(int arg0) {
        if (this.field1615 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1643[arg0];
        int var9 = field1595[arg0];
        for (int var10 = 0; var10 < this.field1582; var10++) {
            int var11 = class123.method2599(this.field1647[var10], this.field1585[var10], var8, var9);
            int var12 = this.field1584[var10];
            int var13 = class123.method2624(this.field1647[var10], this.field1585[var10], var8, var9);
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
        this.field1606 = (var2 + var5) / 2;
        this.field1611 = (var3 + var6) / 2;
        this.field1612 = (var4 + var7) / 2;
        this.field1615 = (var5 - var2 + 1) / 2;
        this.field1614 = (var6 - var3 + 1) / 2;
        this.field1630 = (var7 - var4 + 1) / 2;
        if (this.field1615 < 32) {
            this.field1615 = 32;
        }
        if (this.field1630 < 32) {
            this.field1630 = 32;
        }
        if (this.field1604) {
            this.field1615 += 8;
            this.field1630 += 8;
        }
    }

    @ObfuscatedName("dc.q()V")
    public void method2466() {
        if (this.field1634 == 1) {
            return;
        }
        this.field1634 = 1;
        this.field1782 = 0;
        this.field1629 = 0;
        this.field1607 = 0;
        for (int var1 = 0; var1 < this.field1582; var1++) {
            int var2 = this.field1647[var1];
            int var3 = this.field1584[var1];
            int var4 = this.field1585[var1];
            if (-var3 > this.field1782) {
                this.field1782 = -var3;
            }
            if (var3 > this.field1629) {
                this.field1629 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1607) {
                this.field1607 = var5;
            }
        }
        this.field1607 = (int) (Math.sqrt((double) this.field1607) + 0.99D);
        this.field1619 = (int) (Math.sqrt((double) (this.field1782 * this.field1782 + this.field1607 * this.field1607)) + 0.99D);
        this.field1608 = this.field1619 + (int) (Math.sqrt((double) (this.field1629 * this.field1629 + this.field1607 * this.field1607)) + 0.99D);
    }

    @ObfuscatedName("dc.i()V")
    public void method2467() {
        if (this.field1634 == 2) {
            return;
        }
        this.field1634 = 2;
        this.field1607 = 0;
        for (int var1 = 0; var1 < this.field1582; var1++) {
            int var2 = this.field1647[var1];
            int var3 = this.field1584[var1];
            int var4 = this.field1585[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1607) {
                this.field1607 = var5;
            }
        }
        this.field1607 = (int) (Math.sqrt((double) this.field1607) + 0.99D);
        this.field1619 = this.field1607;
        this.field1608 = this.field1607 + this.field1607;
    }

    @ObfuscatedName("dc.x()I")
    public int method2468() {
        this.method2466();
        return this.field1607;
    }

    @ObfuscatedName("dc.p()V")
    public void method2469() {
        this.field1634 = 0;
        this.field1615 = -1;
    }

    @ObfuscatedName("dc.b(Lew;I)V")
    public void method2520(class131 arg0, int arg1) {
        if (this.field1602 == null || arg1 == -1) {
            return;
        }
        class118 var3 = arg0.field1803[arg1];
        class125 var4 = var3.field1547;
        Statics.field1636 = 0;
        Statics.field1637 = 0;
        Statics.field1638 = 0;
        for (int var5 = 0; var5 < var3.field1548; var5++) {
            int var6 = var3.field1549[var5];
            this.method2472(var4.field1707[var6], var4.field1708[var6], var3.field1550[var5], var3.field1543[var5], var3.field1551[var5]);
        }
        this.method2469();
    }

    @ObfuscatedName("dc.n(Lew;ILew;I[I)V")
    public void method2541(class131 arg0, int arg1, class131 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2520(arg0, arg1);
            return;
        }
        class118 var6 = arg0.field1803[arg1];
        class118 var7 = arg2.field1803[arg3];
        class125 var8 = var6.field1547;
        Statics.field1636 = 0;
        Statics.field1637 = 0;
        Statics.field1638 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1548; var11++) {
            int var12 = var6.field1549[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1707[var12] == 0) {
                this.method2472(var8.field1707[var12], var8.field1708[var12], var6.field1550[var11], var6.field1543[var11], var6.field1551[var11]);
            }
        }
        Statics.field1636 = 0;
        Statics.field1637 = 0;
        Statics.field1638 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1548; var15++) {
            int var16 = var7.field1549[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1707[var16] == 0) {
                this.method2472(var8.field1707[var16], var8.field1708[var16], var7.field1550[var15], var7.field1543[var15], var7.field1551[var15]);
            }
        }
        this.method2469();
    }

    @ObfuscatedName("dc.f(I[IIII)V")
    public void method2472(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1636 = 0;
            Statics.field1637 = 0;
            Statics.field1638 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1602.length) {
                    int[] var10 = this.field1602[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1636 += this.field1647[var12];
                        Statics.field1637 += this.field1584[var12];
                        Statics.field1638 += this.field1585[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1636 = Statics.field1636 / var7 + arg2;
                Statics.field1637 = Statics.field1637 / var7 + arg3;
                Statics.field1638 = Statics.field1638 / var7 + arg4;
            } else {
                Statics.field1636 = arg2;
                Statics.field1637 = arg3;
                Statics.field1638 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1602.length) {
                    int[] var15 = this.field1602[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1647[var17] += arg2;
                        this.field1584[var17] += arg3;
                        this.field1585[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1602.length) {
                    int[] var20 = this.field1602[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1647[var22] -= Statics.field1636;
                        this.field1584[var22] -= Statics.field1637;
                        this.field1585[var22] -= Statics.field1638;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1595[var25];
                            int var27 = field1643[var25];
                            int var28 = this.field1647[var22] * var27 + this.field1584[var22] * var26 >> 16;
                            this.field1584[var22] = this.field1584[var22] * var27 - this.field1647[var22] * var26 >> 16;
                            this.field1647[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1595[var23];
                            int var30 = field1643[var23];
                            int var31 = this.field1584[var22] * var30 - this.field1585[var22] * var29 >> 16;
                            this.field1585[var22] = this.field1585[var22] * var30 + this.field1584[var22] * var29 >> 16;
                            this.field1584[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1595[var24];
                            int var33 = field1643[var24];
                            int var34 = this.field1647[var22] * var33 + this.field1585[var22] * var32 >> 16;
                            this.field1585[var22] = this.field1585[var22] * var33 - this.field1647[var22] * var32 >> 16;
                            this.field1647[var22] = var34;
                        }
                        this.field1647[var22] += Statics.field1636;
                        this.field1584[var22] += Statics.field1637;
                        this.field1585[var22] += Statics.field1638;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1602.length) {
                    int[] var37 = this.field1602[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1647[var39] -= Statics.field1636;
                        this.field1584[var39] -= Statics.field1637;
                        this.field1585[var39] -= Statics.field1638;
                        this.field1647[var39] = this.field1647[var39] * arg2 / 128;
                        this.field1584[var39] = this.field1584[var39] * arg3 / 128;
                        this.field1585[var39] = this.field1585[var39] * arg4 / 128;
                        this.field1647[var39] += Statics.field1636;
                        this.field1584[var39] += Statics.field1637;
                        this.field1585[var39] += Statics.field1638;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1603 != null && this.field1594 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1603.length) {
                    int[] var42 = this.field1603[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1594[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1594[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dc.g()V")
    public void method2473() {
        for (int var1 = 0; var1 < this.field1582; var1++) {
            int var2 = this.field1647[var1];
            this.field1647[var1] = this.field1585[var1];
            this.field1585[var1] = -var2;
        }
        this.method2469();
    }

    @ObfuscatedName("dc.m()V")
    public void method2474() {
        for (int var1 = 0; var1 < this.field1582; var1++) {
            this.field1647[var1] = -this.field1647[var1];
            this.field1585[var1] = -this.field1585[var1];
        }
        this.method2469();
    }

    @ObfuscatedName("dc.r()V")
    public void method2475() {
        for (int var1 = 0; var1 < this.field1582; var1++) {
            int var2 = this.field1585[var1];
            this.field1585[var1] = this.field1647[var1];
            this.field1647[var1] = -var2;
        }
        this.method2469();
    }

    @ObfuscatedName("dc.t(I)V")
    public void method2476(int arg0) {
        int var2 = field1595[arg0];
        int var3 = field1643[arg0];
        for (int var4 = 0; var4 < this.field1582; var4++) {
            int var5 = this.field1584[var4] * var3 - this.field1585[var4] * var2 >> 16;
            this.field1585[var4] = this.field1585[var4] * var3 + this.field1584[var4] * var2 >> 16;
            this.field1584[var4] = var5;
        }
        this.method2469();
    }

    @ObfuscatedName("dc.o(III)V")
    public void method2514(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1582; var4++) {
            this.field1647[var4] += arg0;
            this.field1584[var4] += arg1;
            this.field1585[var4] += arg2;
        }
        this.method2469();
    }

    @ObfuscatedName("dc.y(III)V")
    public void method2477(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1582; var4++) {
            this.field1647[var4] = this.field1647[var4] * arg0 / 128;
            this.field1584[var4] = this.field1584[var4] * arg1 / 128;
            this.field1585[var4] = this.field1585[var4] * arg2 / 128;
        }
        this.method2469();
    }

    @ObfuscatedName("dc.a(IIIIIII)V")
    public final void method2478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1626[0] = -1;
        if (this.field1634 != 2 && this.field1634 != 1) {
            this.method2467();
        }
        int var8 = Statics.field1688;
        int var9 = Statics.field1690;
        int var10 = field1595[arg0];
        int var11 = field1643[arg0];
        int var12 = field1595[arg1];
        int var13 = field1643[arg1];
        int var14 = field1595[arg2];
        int var15 = field1643[arg2];
        int var16 = field1595[arg3];
        int var17 = field1643[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1582; var19++) {
            int var20 = this.field1647[var19];
            int var21 = this.field1584[var19];
            int var22 = this.field1585[var19];
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
            field1591[var19] = var30 - var18;
            field1583[var19] = class123.field1679 * var26 / var30 + var8;
            field1620[var19] = class123.field1679 * var29 / var30 + var9;
            if (this.field1598 > 0) {
                field1590[var19] = var26;
                field1578[var19] = var29;
                field1624[var19] = var30;
            }
        }
        try {
            this.method2481(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dc.c(IIIIIIII)V")
    public final void method2506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1626[0] = -1;
        if (this.field1634 != 2 && this.field1634 != 1) {
            this.method2467();
        }
        int var9 = Statics.field1688;
        int var10 = Statics.field1690;
        int var11 = field1595[arg0];
        int var12 = field1643[arg0];
        int var13 = field1595[arg1];
        int var14 = field1643[arg1];
        int var15 = field1595[arg2];
        int var16 = field1643[arg2];
        int var17 = field1595[arg3];
        int var18 = field1643[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1582; var20++) {
            int var21 = this.field1647[var20];
            int var22 = this.field1584[var20];
            int var23 = this.field1585[var20];
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
            field1591[var20] = var31 - var19;
            field1583[var20] = class123.field1679 * var27 / arg7 + var9;
            field1620[var20] = class123.field1679 * var30 / arg7 + var10;
            if (this.field1598 > 0) {
                field1590[var20] = var27;
                field1578[var20] = var30;
                field1624[var20] = var31;
            }
        }
        try {
            this.method2481(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dc.cx(IIIIIIIIJ)V")
    public void method2500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1626[0] = -1;
        if (this.field1634 != 1) {
            this.method2466();
        }
        this.method2465(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field1607 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field1607) * class123.field1679;
        if (var16 / var14 >= Statics.field1685) {
            return;
        }
        int var17 = (this.field1607 + var15) * class123.field1679;
        if (var17 / var14 <= Statics.field1684) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field1607 * arg1 >> 16;
        int var20 = (var18 + var19) * class123.field1679;
        if (var20 / var14 <= Statics.field1686) {
            return;
        }
        int var21 = (this.field1782 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class123.field1679;
        if (var22 / var14 >= Statics.field1687) {
            return;
        }
        int var23 = (this.field1782 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field1598 > 0;
        int var27 = class121.method1755();
        int var28 = class121.field1650;
        boolean var30 = class121.method3143();
        boolean var31 = arg8 != 0L;
        if (var31) {
            boolean var32 = (int) (arg8 >>> 16 & 0x1L) == 1;
            var31 = !var32;
        }
        boolean var35 = false;
        if (var31 && var30) {
            boolean var36 = false;
            if (field1613) {
                boolean var38;
                if (class121.method3143()) {
                    class121.method57();
                    int var39 = this.field1606 + arg5;
                    int var40 = this.field1611 + arg6;
                    int var41 = this.field1612 + arg7;
                    int var42 = this.field1615;
                    int var43 = this.field1614;
                    int var44 = this.field1630;
                    int var45 = Statics.field1658 - var39;
                    int var46 = Statics.field1660 - var40;
                    int var47 = Statics.field2284 - var41;
                    if (Math.abs(var45) > Statics.field1336 + var42) {
                        var38 = false;
                    } else if (Math.abs(var46) > Statics.field1656 + var43) {
                        var38 = false;
                    } else if (Math.abs(var47) > Statics.field3758 + var44) {
                        var38 = false;
                    } else if (Math.abs(Statics.field1652 * var47 - Statics.field1655 * var46) > Statics.field3758 * var43 + Statics.field1656 * var44) {
                        var38 = false;
                    } else if (Math.abs(Statics.field1655 * var45 - Statics.field3722 * var47) > Statics.field3758 * var42 + Statics.field1336 * var44) {
                        var38 = false;
                    } else if (Math.abs(Statics.field3722 * var46 - Statics.field1652 * var45) > Statics.field1656 * var42 + Statics.field1336 * var43) {
                        var38 = false;
                    } else {
                        var38 = true;
                    }
                } else {
                    var38 = false;
                }
                var36 = var38;
            } else {
                int var48 = var12 - var13;
                if (var48 <= 50) {
                    var48 = 50;
                }
                int var49;
                int var50;
                if (var15 > 0) {
                    var49 = var16 / var14;
                    var50 = var17 / var48;
                } else {
                    var50 = var17 / var14;
                    var49 = var16 / var48;
                }
                int var51;
                int var52;
                if (var18 > 0) {
                    var51 = var22 / var14;
                    var52 = var20 / var48;
                } else {
                    var52 = var20 / var14;
                    var51 = var22 / var48;
                }
                int var53 = var27 - Statics.field1688;
                int var54 = var28 - Statics.field1690;
                if (var53 > var49 && var53 < var50 && var54 > var51 && var54 < var52) {
                    var36 = true;
                }
            }
            if (var36) {
                if (this.field1604) {
                    class121.field1648[++class121.field1657 - 1] = arg8;
                } else {
                    var35 = true;
                }
            }
        }
        int var57 = Statics.field1688;
        int var58 = Statics.field1690;
        int var59 = 0;
        int var60 = 0;
        if (arg0 != 0) {
            var59 = field1595[arg0];
            var60 = field1643[arg0];
        }
        for (int var61 = 0; var61 < this.field1582; var61++) {
            int var62 = this.field1647[var61];
            int var63 = this.field1584[var61];
            int var64 = this.field1585[var61];
            if (arg0 != 0) {
                int var65 = var59 * var64 + var60 * var62 >> 16;
                var64 = var60 * var64 - var59 * var62 >> 16;
                var62 = var65;
            }
            int var66 = arg5 + var62;
            int var67 = arg6 + var63;
            int var68 = arg7 + var64;
            int var69 = arg3 * var68 + arg4 * var66 >> 16;
            int var70 = arg4 * var68 - arg3 * var66 >> 16;
            int var72 = arg2 * var67 - arg1 * var70 >> 16;
            int var73 = arg1 * var67 + arg2 * var70 >> 16;
            field1591[var61] = var73 - var12;
            if (var73 >= 50) {
                field1583[var61] = class123.field1679 * var69 / var73 + var57;
                field1620[var61] = class123.field1679 * var72 / var73 + var58;
            } else {
                field1583[var61] = -5000;
                var24 = true;
            }
            if (var26) {
                field1590[var61] = var69;
                field1578[var61] = var72;
                field1624[var61] = var73;
            }
        }
        try {
            this.method2481(var24, var35, this.field1604, arg8);
        } catch (Exception var76) {
        }
    }

    @ObfuscatedName("dc.v(ZZZJ)V")
    public final void method2481(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field1608 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field1608; var6++) {
            field1626[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field1586; var8++) {
            if (this.field1592[var8] != -2) {
                int var9 = this.field1587[var8];
                int var10 = this.field1588[var8];
                int var11 = this.field1589[var8];
                int var12 = field1583[var9];
                int var13 = field1583[var10];
                int var14 = field1583[var11];
                if (arg0 && (var12 == -5000 || var13 == -5000 || var14 == -5000)) {
                    int var15 = field1590[var9];
                    int var16 = field1590[var10];
                    int var17 = field1590[var11];
                    int var18 = field1578[var9];
                    int var19 = field1578[var10];
                    int var20 = field1578[var11];
                    int var21 = field1624[var9];
                    int var22 = field1624[var10];
                    int var23 = field1624[var11];
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
                        field1627[var8] = true;
                        int var33 = (field1591[var9] + field1591[var10] + field1591[var11]) / 3 + this.field1619;
                        field1593[var33][field1626[var33]++] = var8;
                    }
                } else {
                    if (arg1 && class121.method4128(field1620[var9], field1620[var10], field1620[var11], var12, var13, var14, var7)) {
                        class121.field1648[++class121.field1657 - 1] = arg3;
                        arg1 = false;
                    }
                    if ((field1620[var11] - field1620[var10]) * (var12 - var13) - (field1620[var9] - field1620[var10]) * (var14 - var13) > 0) {
                        field1627[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field1689 && var13 <= Statics.field1689 && var14 <= Statics.field1689) {
                            field1617[var8] = false;
                        } else {
                            field1617[var8] = true;
                        }
                        int var36 = (field1591[var9] + field1591[var10] + field1591[var11]) / 3 + this.field1619;
                        field1593[var36][field1626[var36]++] = var8;
                    }
                }
            }
        }
        if (this.field1646 == null) {
            for (int var37 = this.field1608 - 1; var37 >= 0; var37--) {
                int var38 = field1626[var37];
                if (var38 > 0) {
                    int[] var39 = field1593[var37];
                    for (int var40 = 0; var40 < var38; var40++) {
                        this.method2482(var39[var40]);
                    }
                }
            }
            return;
        }
        for (int var41 = 0; var41 < 12; var41++) {
            field1639[var41] = 0;
            field1632[var41] = 0;
        }
        for (int var42 = this.field1608 - 1; var42 >= 0; var42--) {
            int var43 = field1626[var42];
            if (var43 > 0) {
                int[] var44 = field1593[var42];
                for (int var45 = 0; var45 < var43; var45++) {
                    int var46 = var44[var45];
                    byte var47 = this.field1646[var46];
                    int var48 = field1639[var47]++;
                    field1641[var47][var48] = var46;
                    if (var47 < 10) {
                        field1632[var47] += var42;
                    } else if (var47 == 10) {
                        field1609[var48] = var42;
                    } else {
                        field1596[var48] = var42;
                    }
                }
            }
        }
        int var49 = 0;
        if (field1639[1] > 0 || field1639[2] > 0) {
            var49 = (field1632[1] + field1632[2]) / (field1639[1] + field1639[2]);
        }
        int var50 = 0;
        if (field1639[3] > 0 || field1639[4] > 0) {
            var50 = (field1632[3] + field1632[4]) / (field1639[3] + field1639[4]);
        }
        int var51 = 0;
        if (field1639[6] > 0 || field1639[8] > 0) {
            var51 = (field1632[6] + field1632[8]) / (field1639[6] + field1639[8]);
        }
        int var52 = 0;
        int var53 = field1639[10];
        int[] var54 = field1641[10];
        int[] var55 = field1609;
        if (var52 == var53) {
            var52 = 0;
            var53 = field1639[11];
            var54 = field1641[11];
            var55 = field1596;
        }
        int var56;
        if (var52 < var53) {
            var56 = var55[var52];
        } else {
            var56 = -1000;
        }
        for (int var57 = 0; var57 < 10; var57++) {
            while (var57 == 0 && var56 > var49) {
                this.method2482(var54[var52++]);
                if (var52 == var53 && field1641[11] != var54) {
                    var52 = 0;
                    var53 = field1639[11];
                    var54 = field1641[11];
                    var55 = field1596;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            while (var57 == 3 && var56 > var50) {
                this.method2482(var54[var52++]);
                if (var52 == var53 && field1641[11] != var54) {
                    var52 = 0;
                    var53 = field1639[11];
                    var54 = field1641[11];
                    var55 = field1596;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            while (var57 == 5 && var56 > var51) {
                this.method2482(var54[var52++]);
                if (var52 == var53 && field1641[11] != var54) {
                    var52 = 0;
                    var53 = field1639[11];
                    var54 = field1641[11];
                    var55 = field1596;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            int var58 = field1639[var57];
            int[] var59 = field1641[var57];
            for (int var60 = 0; var60 < var58; var60++) {
                this.method2482(var59[var60]);
            }
        }
        while (var56 != -1000) {
            this.method2482(var54[var52++]);
            if (var52 == var53 && field1641[11] != var54) {
                var52 = 0;
                var54 = field1641[11];
                var53 = field1639[11];
                var55 = field1596;
            }
            if (var52 < var53) {
                var56 = var55[var52];
            } else {
                var56 = -1000;
            }
        }
    }

    @ObfuscatedName("dc.af(I)V")
    public final void method2482(int arg0) {
        if (field1627[arg0]) {
            this.method2483(arg0);
            return;
        }
        int var2 = this.field1587[arg0];
        int var3 = this.field1588[arg0];
        int var4 = this.field1589[arg0];
        class123.field1678 = field1617[arg0];
        if (this.field1594 == null) {
            class123.field1672 = 0;
        } else {
            class123.field1672 = this.field1594[arg0] & 0xFF;
        }
        if (this.field1605 != null && this.field1605[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1618 == null || this.field1618[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1618[arg0] & 0xFF;
                var6 = this.field1622[var5];
                var7 = this.field1600[var5];
                var8 = this.field1601[var5];
            }
            if (this.field1592[arg0] == -1) {
                class123.method2600(field1620[var2], field1620[var3], field1620[var4], field1583[var2], field1583[var3], field1583[var4], this.field1616[arg0], this.field1616[arg0], this.field1616[arg0], field1590[var6], field1590[var7], field1590[var8], field1578[var6], field1578[var7], field1578[var8], field1624[var6], field1624[var7], field1624[var8], this.field1605[arg0]);
            } else {
                class123.method2600(field1620[var2], field1620[var3], field1620[var4], field1583[var2], field1583[var3], field1583[var4], this.field1616[arg0], this.field1621[arg0], this.field1592[arg0], field1590[var6], field1590[var7], field1590[var8], field1578[var6], field1578[var7], field1578[var8], field1624[var6], field1624[var7], field1624[var8], this.field1605[arg0]);
            }
        } else if (this.field1592[arg0] == -1) {
            class123.method2592(field1620[var2], field1620[var3], field1620[var4], field1583[var2], field1583[var3], field1583[var4], field1644[this.field1616[arg0]]);
        } else {
            class123.method2590(field1620[var2], field1620[var3], field1620[var4], field1583[var2], field1583[var3], field1583[var4], this.field1616[arg0], this.field1621[arg0], this.field1592[arg0]);
        }
    }

    @ObfuscatedName("dc.ah(I)V")
    public final void method2483(int arg0) {
        int var2 = Statics.field1688;
        int var3 = Statics.field1690;
        int var4 = 0;
        int var5 = this.field1587[arg0];
        int var6 = this.field1588[arg0];
        int var7 = this.field1589[arg0];
        int var8 = field1624[var5];
        int var9 = field1624[var6];
        int var10 = field1624[var7];
        if (this.field1594 == null) {
            class123.field1672 = 0;
        } else {
            class123.field1672 = this.field1594[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1633[var4] = field1583[var5];
            field1631[var4] = field1620[var5];
            field1635[var4++] = this.field1616[arg0];
        } else {
            int var11 = field1590[var5];
            int var12 = field1578[var5];
            int var13 = this.field1616[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1599[var10 - var8];
                field1633[var4] = (((field1590[var7] - var11) * var14 >> 16) + var11) * class123.field1679 / 50 + var2;
                field1631[var4] = (((field1578[var7] - var12) * var14 >> 16) + var12) * class123.field1679 / 50 + var3;
                field1635[var4++] = ((this.field1592[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1599[var9 - var8];
                field1633[var4] = (((field1590[var6] - var11) * var15 >> 16) + var11) * class123.field1679 / 50 + var2;
                field1631[var4] = (((field1578[var6] - var12) * var15 >> 16) + var12) * class123.field1679 / 50 + var3;
                field1635[var4++] = ((this.field1621[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1633[var4] = field1583[var6];
            field1631[var4] = field1620[var6];
            field1635[var4++] = this.field1621[arg0];
        } else {
            int var16 = field1590[var6];
            int var17 = field1578[var6];
            int var18 = this.field1621[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1599[var8 - var9];
                field1633[var4] = (((field1590[var5] - var16) * var19 >> 16) + var16) * class123.field1679 / 50 + var2;
                field1631[var4] = (((field1578[var5] - var17) * var19 >> 16) + var17) * class123.field1679 / 50 + var3;
                field1635[var4++] = ((this.field1616[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1599[var10 - var9];
                field1633[var4] = (((field1590[var7] - var16) * var20 >> 16) + var16) * class123.field1679 / 50 + var2;
                field1631[var4] = (((field1578[var7] - var17) * var20 >> 16) + var17) * class123.field1679 / 50 + var3;
                field1635[var4++] = ((this.field1592[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1633[var4] = field1583[var7];
            field1631[var4] = field1620[var7];
            field1635[var4++] = this.field1592[arg0];
        } else {
            int var21 = field1590[var7];
            int var22 = field1578[var7];
            int var23 = this.field1592[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1599[var9 - var10];
                field1633[var4] = (((field1590[var6] - var21) * var24 >> 16) + var21) * class123.field1679 / 50 + var2;
                field1631[var4] = (((field1578[var6] - var22) * var24 >> 16) + var22) * class123.field1679 / 50 + var3;
                field1635[var4++] = ((this.field1621[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1599[var8 - var10];
                field1633[var4] = (((field1590[var5] - var21) * var25 >> 16) + var21) * class123.field1679 / 50 + var2;
                field1631[var4] = (((field1578[var5] - var22) * var25 >> 16) + var22) * class123.field1679 / 50 + var3;
                field1635[var4++] = ((this.field1616[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1633[0];
        int var27 = field1633[1];
        int var28 = field1633[2];
        int var29 = field1631[0];
        int var30 = field1631[1];
        int var31 = field1631[2];
        class123.field1678 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1689 || var27 > Statics.field1689 || var28 > Statics.field1689) {
                class123.field1678 = true;
            }
            if (this.field1605 != null && this.field1605[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1618 == null || this.field1618[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1618[arg0] & 0xFF;
                    var33 = this.field1622[var32];
                    var34 = this.field1600[var32];
                    var35 = this.field1601[var32];
                }
                if (this.field1592[arg0] == -1) {
                    class123.method2600(var29, var30, var31, var26, var27, var28, this.field1616[arg0], this.field1616[arg0], this.field1616[arg0], field1590[var33], field1590[var34], field1590[var35], field1578[var33], field1578[var34], field1578[var35], field1624[var33], field1624[var34], field1624[var35], this.field1605[arg0]);
                } else {
                    class123.method2600(var29, var30, var31, var26, var27, var28, field1635[0], field1635[1], field1635[2], field1590[var33], field1590[var34], field1590[var35], field1578[var33], field1578[var34], field1578[var35], field1624[var33], field1624[var34], field1624[var35], this.field1605[arg0]);
                }
            } else if (this.field1592[arg0] == -1) {
                class123.method2592(var29, var30, var31, var26, var27, var28, field1644[this.field1616[arg0]]);
            } else {
                class123.method2590(var29, var30, var31, var26, var27, var28, field1635[0], field1635[1], field1635[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1689 || var27 > Statics.field1689 || var28 > Statics.field1689 || field1633[3] < 0 || field1633[3] > Statics.field1689) {
            class123.field1678 = true;
        }
        if (this.field1605 != null && this.field1605[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1618 == null || this.field1618[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1618[arg0] & 0xFF;
                var37 = this.field1622[var36];
                var38 = this.field1600[var36];
                var39 = this.field1601[var36];
            }
            short var40 = this.field1605[arg0];
            if (this.field1592[arg0] == -1) {
                class123.method2600(var29, var30, var31, var26, var27, var28, this.field1616[arg0], this.field1616[arg0], this.field1616[arg0], field1590[var37], field1590[var38], field1590[var39], field1578[var37], field1578[var38], field1578[var39], field1624[var37], field1624[var38], field1624[var39], var40);
                class123.method2600(var29, var31, field1631[3], var26, var28, field1633[3], this.field1616[arg0], this.field1616[arg0], this.field1616[arg0], field1590[var37], field1590[var38], field1590[var39], field1578[var37], field1578[var38], field1578[var39], field1624[var37], field1624[var38], field1624[var39], var40);
            } else {
                class123.method2600(var29, var30, var31, var26, var27, var28, field1635[0], field1635[1], field1635[2], field1590[var37], field1590[var38], field1590[var39], field1578[var37], field1578[var38], field1578[var39], field1624[var37], field1624[var38], field1624[var39], var40);
                class123.method2600(var29, var31, field1631[3], var26, var28, field1633[3], field1635[0], field1635[2], field1635[3], field1590[var37], field1590[var38], field1590[var39], field1578[var37], field1578[var38], field1578[var39], field1624[var37], field1624[var38], field1624[var39], var40);
            }
        } else if (this.field1592[arg0] == -1) {
            int var41 = field1644[this.field1616[arg0]];
            class123.method2592(var29, var30, var31, var26, var27, var28, var41);
            class123.method2592(var29, var31, field1631[3], var26, var28, field1633[3], var41);
        } else {
            class123.method2590(var29, var30, var31, var26, var27, var28, field1635[0], field1635[1], field1635[2]);
            class123.method2590(var29, var31, field1631[3], var26, var28, field1633[3], field1635[0], field1635[2], field1635[3]);
        }
    }
}
