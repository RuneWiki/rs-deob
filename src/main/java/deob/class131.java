package deob;

@ObfuscatedName("ee")
public class class131 extends class145 {

    @ObfuscatedName("ee.z")
    public int field1586 = 0;

    @ObfuscatedName("ee.k")
    public int[] field1573;

    @ObfuscatedName("ee.s")
    public int[] field1574;

    @ObfuscatedName("ee.t")
    public int[] field1575;

    @ObfuscatedName("ee.i")
    public int field1576 = 0;

    @ObfuscatedName("ee.o")
    public int[] field1583;

    @ObfuscatedName("ee.x")
    public int[] field1578;

    @ObfuscatedName("ee.w")
    public int[] field1587;

    @ObfuscatedName("ee.g")
    public byte[] field1580;

    @ObfuscatedName("ee.m")
    public byte[] field1581;

    @ObfuscatedName("ee.n")
    public byte[] field1582;

    @ObfuscatedName("ee.d")
    public byte[] field1598;

    @ObfuscatedName("ee.h")
    public short[] field1584;

    @ObfuscatedName("ee.a")
    public short[] field1585;

    @ObfuscatedName("ee.q")
    public byte field1597 = 0;

    @ObfuscatedName("ee.c")
    public int field1609;

    @ObfuscatedName("ee.f")
    public byte[] field1588;

    @ObfuscatedName("ee.y")
    public short[] field1589;

    @ObfuscatedName("ee.v")
    public short[] field1572;

    @ObfuscatedName("ee.j")
    public short[] field1591;

    @ObfuscatedName("ee.r")
    public int[] field1592;

    @ObfuscatedName("ee.u")
    public int[] field1593;

    @ObfuscatedName("ee.p")
    public int[][] field1594;

    @ObfuscatedName("ee.b")
    public int[][] field1595;

    @ObfuscatedName("ee.l")
    public class147[] field1596;

    @ObfuscatedName("ee.e")
    public class139[] field1608;

    @ObfuscatedName("ee.ab")
    public class139[] field1600;

    @ObfuscatedName("ee.ag")
    public short field1579;

    @ObfuscatedName("ee.ao")
    public short field1577;

    @ObfuscatedName("ee.ae")
    public boolean field1601 = false;

    @ObfuscatedName("ee.an")
    public int field1599;

    @ObfuscatedName("ee.am")
    public int field1602;

    @ObfuscatedName("ee.ap")
    public int field1604;

    @ObfuscatedName("ee.au")
    public int field1605;

    @ObfuscatedName("ee.aa")
    public int field1590;

    @ObfuscatedName("ee.ar")
    public static int[] field1607 = new int[10000];

    @ObfuscatedName("ee.at")
    public static int[] field1603 = new int[10000];

    @ObfuscatedName("ee.aq")
    public static int field1606 = 0;

    @ObfuscatedName("ee.al")
    public static int[] field1610 = class140.field1811;

    @ObfuscatedName("ee.ah")
    public static int[] field1611 = class140.field1794;

    public class131() {
    }

    @ObfuscatedName("ee.z(Lic;II)Lee;")
    public static class131 method2636(class244 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3873(arg1, arg2);
        return var3 == null ? null : new class131(var3);
    }

    public class131(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2638(arg0);
        } else {
            this.method2678(arg0);
        }
    }

    @ObfuscatedName("ee.k([B)V")
    public void method2638(byte[] arg0) {
        class310 var2 = new class310(arg0);
        class310 var3 = new class310(arg0);
        class310 var4 = new class310(arg0);
        class310 var5 = new class310(arg0);
        class310 var6 = new class310(arg0);
        class310 var7 = new class310(arg0);
        class310 var8 = new class310(arg0);
        var2.field3734 = arg0.length - 23;
        int var9 = var2.method5195();
        int var10 = var2.method5195();
        int var11 = var2.method5193();
        int var12 = var2.method5193();
        int var13 = var2.method5193();
        int var14 = var2.method5193();
        int var15 = var2.method5193();
        int var16 = var2.method5193();
        int var17 = var2.method5193();
        int var18 = var2.method5195();
        int var19 = var2.method5195();
        int var20 = var2.method5195();
        int var21 = var2.method5195();
        int var22 = var2.method5195();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1588 = new byte[var11];
            var2.field3734 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1588[var26] = var2.method5194();
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 * 2 + var56;
        int var60 = var24 + var58;
        int var62 = var24 * 2 + var25 * 2 + var60;
        this.field1586 = var9;
        this.field1576 = var10;
        this.field1609 = var11;
        this.field1573 = new int[var9];
        this.field1574 = new int[var9];
        this.field1575 = new int[var9];
        this.field1583 = new int[var10];
        this.field1578 = new int[var10];
        this.field1587 = new int[var10];
        if (var17 == 1) {
            this.field1592 = new int[var9];
        }
        if (var12 == 1) {
            this.field1580 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1581 = new byte[var10];
        } else {
            this.field1597 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1582 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1593 = new int[var10];
        }
        if (var16 == 1) {
            this.field1585 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1598 = new byte[var10];
        }
        this.field1584 = new short[var10];
        if (var11 > 0) {
            this.field1589 = new short[var11];
            this.field1572 = new short[var11];
            this.field1591 = new short[var11];
        }
        var2.field3734 = var11;
        var3.field3734 = var44;
        var4.field3734 = var46;
        var5.field3734 = var48;
        var6.field3734 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method5193();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method5291();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method5291();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method5291();
            }
            this.field1573[var67] = var64 + var69;
            this.field1574[var67] = var65 + var70;
            this.field1575[var67] = var66 + var71;
            var64 = this.field1573[var67];
            var65 = this.field1574[var67];
            var66 = this.field1575[var67];
            if (var17 == 1) {
                this.field1592[var67] = var6.method5193();
            }
        }
        var2.field3734 = var42;
        var3.field3734 = var31;
        var4.field3734 = var34;
        var5.field3734 = var37;
        var6.field3734 = var35;
        var7.field3734 = var40;
        var8.field3734 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1584[var72] = (short) var2.method5195();
            if (var12 == 1) {
                this.field1580[var72] = var3.method5194();
            }
            if (var13 == 255) {
                this.field1581[var72] = var4.method5194();
            }
            if (var14 == 1) {
                this.field1582[var72] = var5.method5194();
            }
            if (var15 == 1) {
                this.field1593[var72] = var6.method5193();
            }
            if (var16 == 1) {
                this.field1585[var72] = (short) (var7.method5195() - 1);
            }
            if (this.field1598 != null && this.field1585[var72] != -1) {
                this.field1598[var72] = (byte) (var8.method5193() - 1);
            }
        }
        var2.field3734 = var33;
        var3.field3734 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method5193();
            if (var78 == 1) {
                var73 = var2.method5291() + var76;
                var74 = var2.method5291() + var73;
                var75 = var2.method5291() + var74;
                var76 = var75;
                this.field1583[var77] = var73;
                this.field1578[var77] = var74;
                this.field1587[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method5291() + var76;
                var76 = var75;
                this.field1583[var77] = var73;
                this.field1578[var77] = var74;
                this.field1587[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method5291() + var76;
                var76 = var75;
                this.field1583[var77] = var73;
                this.field1578[var77] = var74;
                this.field1587[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method5291() + var76;
                var76 = var75;
                this.field1583[var77] = var73;
                this.field1578[var77] = var81;
                this.field1587[var77] = var75;
            }
        }
        var2.field3734 = var50;
        var3.field3734 = var52;
        var4.field3734 = var54;
        var5.field3734 = var56;
        var6.field3734 = var58;
        var7.field3734 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1588[var82] & 0xFF;
            if (var83 == 0) {
                this.field1589[var82] = (short) var2.method5195();
                this.field1572[var82] = (short) var2.method5195();
                this.field1591[var82] = (short) var2.method5195();
            }
        }
        var2.field3734 = var62;
        int var84 = var2.method5193();
        if (var84 == 0) {
            return;
        }
        new class144();
        var2.method5195();
        var2.method5195();
        var2.method5195();
        var2.method5270();
    }

    @ObfuscatedName("ee.s([B)V")
    public void method2678(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class310 var4 = new class310(arg0);
        class310 var5 = new class310(arg0);
        class310 var6 = new class310(arg0);
        class310 var7 = new class310(arg0);
        class310 var8 = new class310(arg0);
        var4.field3734 = arg0.length - 18;
        int var9 = var4.method5195();
        int var10 = var4.method5195();
        int var11 = var4.method5193();
        int var12 = var4.method5193();
        int var13 = var4.method5193();
        int var14 = var4.method5193();
        int var15 = var4.method5193();
        int var16 = var4.method5193();
        int var17 = var4.method5195();
        int var18 = var4.method5195();
        int var19 = var4.method5195();
        int var20 = var4.method5195();
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field1586 = var9;
        this.field1576 = var10;
        this.field1609 = var11;
        this.field1573 = new int[var9];
        this.field1574 = new int[var9];
        this.field1575 = new int[var9];
        this.field1583 = new int[var10];
        this.field1578 = new int[var10];
        this.field1587 = new int[var10];
        if (var11 > 0) {
            this.field1588 = new byte[var11];
            this.field1589 = new short[var11];
            this.field1572 = new short[var11];
            this.field1591 = new short[var11];
        }
        if (var16 == 1) {
            this.field1592 = new int[var9];
        }
        if (var12 == 1) {
            this.field1580 = new byte[var10];
            this.field1598 = new byte[var10];
            this.field1585 = new short[var10];
        }
        if (var13 == 255) {
            this.field1581 = new byte[var10];
        } else {
            this.field1597 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1582 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1593 = new int[var10];
        }
        this.field1584 = new short[var10];
        var4.field3734 = var21;
        var5.field3734 = var36;
        var6.field3734 = var38;
        var7.field3734 = var40;
        var8.field3734 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method5193();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method5291();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method5291();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method5291();
            }
            this.field1573[var46] = var43 + var48;
            this.field1574[var46] = var44 + var49;
            this.field1575[var46] = var45 + var50;
            var43 = this.field1573[var46];
            var44 = this.field1574[var46];
            var45 = this.field1575[var46];
            if (var16 == 1) {
                this.field1592[var46] = var8.method5193();
            }
        }
        var4.field3734 = var32;
        var5.field3734 = var28;
        var6.field3734 = var26;
        var7.field3734 = var30;
        var8.field3734 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1584[var51] = (short) var4.method5195();
            if (var12 == 1) {
                int var52 = var5.method5193();
                if ((var52 & 0x1) == 1) {
                    this.field1580[var51] = 1;
                    var2 = true;
                } else {
                    this.field1580[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1598[var51] = (byte) (var52 >> 2);
                    this.field1585[var51] = this.field1584[var51];
                    this.field1584[var51] = 127;
                    if (this.field1585[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1598[var51] = -1;
                    this.field1585[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1581[var51] = var6.method5194();
            }
            if (var14 == 1) {
                this.field1582[var51] = var7.method5194();
            }
            if (var15 == 1) {
                this.field1593[var51] = var8.method5193();
            }
        }
        var4.field3734 = var25;
        var5.field3734 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method5193();
            if (var58 == 1) {
                var53 = var4.method5291() + var56;
                var54 = var4.method5291() + var53;
                var55 = var4.method5291() + var54;
                var56 = var55;
                this.field1583[var57] = var53;
                this.field1578[var57] = var54;
                this.field1587[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method5291() + var56;
                var56 = var55;
                this.field1583[var57] = var53;
                this.field1578[var57] = var54;
                this.field1587[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method5291() + var56;
                var56 = var55;
                this.field1583[var57] = var53;
                this.field1578[var57] = var54;
                this.field1587[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method5291() + var56;
                var56 = var55;
                this.field1583[var57] = var53;
                this.field1578[var57] = var61;
                this.field1587[var57] = var55;
            }
        }
        var4.field3734 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1588[var62] = 0;
            this.field1589[var62] = (short) var4.method5195();
            this.field1572[var62] = (short) var4.method5195();
            this.field1591[var62] = (short) var4.method5195();
        }
        if (this.field1598 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1598[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1589[var65] & 0xFFFF) == this.field1583[var64] && (this.field1572[var65] & 0xFFFF) == this.field1578[var64] && (this.field1591[var65] & 0xFFFF) == this.field1587[var64]) {
                        this.field1598[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1598 = null;
            }
        }
        if (!var3) {
            this.field1585 = null;
        }
        if (!var2) {
            this.field1580 = null;
        }
    }

    public class131(class131[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1586 = 0;
        this.field1576 = 0;
        this.field1609 = 0;
        this.field1597 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class131 var10 = arg0[var9];
            if (var10 != null) {
                this.field1586 += var10.field1586;
                this.field1576 += var10.field1576;
                this.field1609 += var10.field1609;
                if (var10.field1581 == null) {
                    if (this.field1597 == -1) {
                        this.field1597 = var10.field1597;
                    }
                    if (this.field1597 != var10.field1597) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1580 != null;
                var5 |= var10.field1582 != null;
                var6 |= var10.field1593 != null;
                var7 |= var10.field1585 != null;
                var8 |= var10.field1598 != null;
            }
        }
        this.field1573 = new int[this.field1586];
        this.field1574 = new int[this.field1586];
        this.field1575 = new int[this.field1586];
        this.field1592 = new int[this.field1586];
        this.field1583 = new int[this.field1576];
        this.field1578 = new int[this.field1576];
        this.field1587 = new int[this.field1576];
        if (var3) {
            this.field1580 = new byte[this.field1576];
        }
        if (var4) {
            this.field1581 = new byte[this.field1576];
        }
        if (var5) {
            this.field1582 = new byte[this.field1576];
        }
        if (var6) {
            this.field1593 = new int[this.field1576];
        }
        if (var7) {
            this.field1585 = new short[this.field1576];
        }
        if (var8) {
            this.field1598 = new byte[this.field1576];
        }
        this.field1584 = new short[this.field1576];
        if (this.field1609 > 0) {
            this.field1588 = new byte[this.field1609];
            this.field1589 = new short[this.field1609];
            this.field1572 = new short[this.field1609];
            this.field1591 = new short[this.field1609];
        }
        this.field1586 = 0;
        this.field1576 = 0;
        this.field1609 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class131 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1576; var13++) {
                    if (var3 && var12.field1580 != null) {
                        this.field1580[this.field1576] = var12.field1580[var13];
                    }
                    if (var4) {
                        if (var12.field1581 == null) {
                            this.field1581[this.field1576] = var12.field1597;
                        } else {
                            this.field1581[this.field1576] = var12.field1581[var13];
                        }
                    }
                    if (var5 && var12.field1582 != null) {
                        this.field1582[this.field1576] = var12.field1582[var13];
                    }
                    if (var6 && var12.field1593 != null) {
                        this.field1593[this.field1576] = var12.field1593[var13];
                    }
                    if (var7) {
                        if (var12.field1585 == null) {
                            this.field1585[this.field1576] = -1;
                        } else {
                            this.field1585[this.field1576] = var12.field1585[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1598 == null || var12.field1598[var13] == -1) {
                            this.field1598[this.field1576] = -1;
                        } else {
                            this.field1598[this.field1576] = (byte) (var12.field1598[var13] + this.field1609);
                        }
                    }
                    this.field1584[this.field1576] = var12.field1584[var13];
                    this.field1583[this.field1576] = this.method2662(var12, var12.field1583[var13]);
                    this.field1578[this.field1576] = this.method2662(var12, var12.field1578[var13]);
                    this.field1587[this.field1576] = this.method2662(var12, var12.field1587[var13]);
                    this.field1576++;
                }
                for (int var14 = 0; var14 < var12.field1609; var14++) {
                    byte var15 = this.field1588[this.field1609] = var12.field1588[var14];
                    if (var15 == 0) {
                        this.field1589[this.field1609] = (short) this.method2662(var12, var12.field1589[var14]);
                        this.field1572[this.field1609] = (short) this.method2662(var12, var12.field1572[var14]);
                        this.field1591[this.field1609] = (short) this.method2662(var12, var12.field1591[var14]);
                    }
                    this.field1609++;
                }
            }
        }
    }

    @ObfuscatedName("ee.t(Lee;I)I")
    public final int method2662(class131 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1573[arg1];
        int var5 = arg0.field1574[arg1];
        int var6 = arg0.field1575[arg1];
        for (int var7 = 0; var7 < this.field1586; var7++) {
            if (this.field1573[var7] == var4 && this.field1574[var7] == var5 && this.field1575[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1573[this.field1586] = var4;
            this.field1574[this.field1586] = var5;
            this.field1575[this.field1586] = var6;
            if (arg0.field1592 != null) {
                this.field1592[this.field1586] = arg0.field1592[arg1];
            }
            var3 = this.field1586++;
        }
        return var3;
    }

    public class131(class131 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1586 = arg0.field1586;
        this.field1576 = arg0.field1576;
        this.field1609 = arg0.field1609;
        if (arg1) {
            this.field1573 = arg0.field1573;
            this.field1574 = arg0.field1574;
            this.field1575 = arg0.field1575;
        } else {
            this.field1573 = new int[this.field1586];
            this.field1574 = new int[this.field1586];
            this.field1575 = new int[this.field1586];
            for (int var6 = 0; var6 < this.field1586; var6++) {
                this.field1573[var6] = arg0.field1573[var6];
                this.field1574[var6] = arg0.field1574[var6];
                this.field1575[var6] = arg0.field1575[var6];
            }
        }
        if (arg2) {
            this.field1584 = arg0.field1584;
        } else {
            this.field1584 = new short[this.field1576];
            for (int var7 = 0; var7 < this.field1576; var7++) {
                this.field1584[var7] = arg0.field1584[var7];
            }
        }
        if (arg3 || arg0.field1585 == null) {
            this.field1585 = arg0.field1585;
        } else {
            this.field1585 = new short[this.field1576];
            for (int var8 = 0; var8 < this.field1576; var8++) {
                this.field1585[var8] = arg0.field1585[var8];
            }
        }
        if (arg4) {
            this.field1582 = arg0.field1582;
        } else {
            this.field1582 = new byte[this.field1576];
            if (arg0.field1582 == null) {
                for (int var9 = 0; var9 < this.field1576; var9++) {
                    this.field1582[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1576; var10++) {
                    this.field1582[var10] = arg0.field1582[var10];
                }
            }
        }
        this.field1583 = arg0.field1583;
        this.field1578 = arg0.field1578;
        this.field1587 = arg0.field1587;
        this.field1580 = arg0.field1580;
        this.field1581 = arg0.field1581;
        this.field1598 = arg0.field1598;
        this.field1597 = arg0.field1597;
        this.field1588 = arg0.field1588;
        this.field1589 = arg0.field1589;
        this.field1572 = arg0.field1572;
        this.field1591 = arg0.field1591;
        this.field1592 = arg0.field1592;
        this.field1593 = arg0.field1593;
        this.field1594 = arg0.field1594;
        this.field1595 = arg0.field1595;
        this.field1608 = arg0.field1608;
        this.field1596 = arg0.field1596;
        this.field1600 = arg0.field1600;
        this.field1579 = arg0.field1579;
        this.field1577 = arg0.field1577;
    }

    @ObfuscatedName("ee.i()Lee;")
    public class131 method2703() {
        class131 var1 = new class131();
        if (this.field1580 != null) {
            var1.field1580 = new byte[this.field1576];
            for (int var2 = 0; var2 < this.field1576; var2++) {
                var1.field1580[var2] = this.field1580[var2];
            }
        }
        var1.field1586 = this.field1586;
        var1.field1576 = this.field1576;
        var1.field1609 = this.field1609;
        var1.field1573 = this.field1573;
        var1.field1574 = this.field1574;
        var1.field1575 = this.field1575;
        var1.field1583 = this.field1583;
        var1.field1578 = this.field1578;
        var1.field1587 = this.field1587;
        var1.field1581 = this.field1581;
        var1.field1582 = this.field1582;
        var1.field1598 = this.field1598;
        var1.field1584 = this.field1584;
        var1.field1585 = this.field1585;
        var1.field1597 = this.field1597;
        var1.field1588 = this.field1588;
        var1.field1589 = this.field1589;
        var1.field1572 = this.field1572;
        var1.field1591 = this.field1591;
        var1.field1592 = this.field1592;
        var1.field1593 = this.field1593;
        var1.field1594 = this.field1594;
        var1.field1595 = this.field1595;
        var1.field1608 = this.field1608;
        var1.field1596 = this.field1596;
        var1.field1579 = this.field1579;
        var1.field1577 = this.field1577;
        return var1;
    }

    @ObfuscatedName("ee.o([[IIIIZI)Lee;")
    public class131 method2641(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2694();
        int var7 = this.field1602 + arg1;
        int var8 = this.field1604 + arg1;
        int var9 = this.field1590 + arg3;
        int var10 = this.field1605 + arg3;
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
        class131 var15;
        if (arg4) {
            var15 = new class131();
            var15.field1586 = this.field1586;
            var15.field1576 = this.field1576;
            var15.field1609 = this.field1609;
            var15.field1573 = this.field1573;
            var15.field1575 = this.field1575;
            var15.field1583 = this.field1583;
            var15.field1578 = this.field1578;
            var15.field1587 = this.field1587;
            var15.field1580 = this.field1580;
            var15.field1581 = this.field1581;
            var15.field1582 = this.field1582;
            var15.field1598 = this.field1598;
            var15.field1584 = this.field1584;
            var15.field1585 = this.field1585;
            var15.field1597 = this.field1597;
            var15.field1588 = this.field1588;
            var15.field1589 = this.field1589;
            var15.field1572 = this.field1572;
            var15.field1591 = this.field1591;
            var15.field1592 = this.field1592;
            var15.field1593 = this.field1593;
            var15.field1594 = this.field1594;
            var15.field1595 = this.field1595;
            var15.field1579 = this.field1579;
            var15.field1577 = this.field1577;
            var15.field1574 = new int[var15.field1586];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1586; var16++) {
                int var17 = this.field1573[var16] + arg1;
                int var18 = this.field1575[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1574[var16] = this.field1574[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1586; var26++) {
                int var27 = (-this.field1574[var26] << 16) / this.field1906;
                if (var27 < arg5) {
                    int var28 = this.field1573[var26] + arg1;
                    int var29 = this.field1575[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1574[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1574[var26];
                }
            }
        }
        var15.method2653();
        return var15;
    }

    @ObfuscatedName("ee.x()V")
    public void method2642() {
        int var10002;
        if (this.field1592 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1586; var3++) {
                int var4 = this.field1592[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1594 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1594[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1586) {
                int var7 = this.field1592[var6];
                this.field1594[var7][var1[var7]++] = var6++;
            }
            this.field1592 = null;
        }
        if (this.field1593 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1576; var10++) {
            int var11 = this.field1593[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1595 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1595[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1576) {
            int var14 = this.field1593[var13];
            this.field1595[var14][var8[var14]++] = var13++;
        }
        this.field1593 = null;
    }

    @ObfuscatedName("ee.w()V")
    public void method2643() {
        for (int var1 = 0; var1 < this.field1586; var1++) {
            int var2 = this.field1573[var1];
            this.field1573[var1] = this.field1575[var1];
            this.field1575[var1] = -var2;
        }
        this.method2653();
    }

    @ObfuscatedName("ee.m()V")
    public void method2644() {
        for (int var1 = 0; var1 < this.field1586; var1++) {
            this.field1573[var1] = -this.field1573[var1];
            this.field1575[var1] = -this.field1575[var1];
        }
        this.method2653();
    }

    @ObfuscatedName("ee.n()V")
    public void method2639() {
        for (int var1 = 0; var1 < this.field1586; var1++) {
            int var2 = this.field1575[var1];
            this.field1575[var1] = this.field1573[var1];
            this.field1573[var1] = -var2;
        }
        this.method2653();
    }

    @ObfuscatedName("ee.d(I)V")
    public void method2646(int arg0) {
        int var2 = field1610[arg0];
        int var3 = field1611[arg0];
        for (int var4 = 0; var4 < this.field1586; var4++) {
            int var5 = this.field1575[var4] * var2 + this.field1573[var4] * var3 >> 16;
            this.field1575[var4] = this.field1575[var4] * var3 - this.field1573[var4] * var2 >> 16;
            this.field1573[var4] = var5;
        }
        this.method2653();
    }

    @ObfuscatedName("ee.h(III)V")
    public void method2701(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1586; var4++) {
            this.field1573[var4] += arg0;
            this.field1574[var4] += arg1;
            this.field1575[var4] += arg2;
        }
        this.method2653();
    }

    @ObfuscatedName("ee.a(SS)V")
    public void method2691(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1576; var3++) {
            if (this.field1584[var3] == arg0) {
                this.field1584[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ee.q(SS)V")
    public void method2652(short arg0, short arg1) {
        if (this.field1585 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1576; var3++) {
            if (this.field1585[var3] == arg0) {
                this.field1585[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ee.c()V")
    public void method2650() {
        for (int var1 = 0; var1 < this.field1586; var1++) {
            this.field1575[var1] = -this.field1575[var1];
        }
        for (int var2 = 0; var2 < this.field1576; var2++) {
            int var3 = this.field1583[var2];
            this.field1583[var2] = this.field1587[var2];
            this.field1587[var2] = var3;
        }
        this.method2653();
    }

    @ObfuscatedName("ee.j(III)V")
    public void method2651(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1586; var4++) {
            this.field1573[var4] = this.field1573[var4] * arg0 / 128;
            this.field1574[var4] = this.field1574[var4] * arg1 / 128;
            this.field1575[var4] = this.field1575[var4] * arg2 / 128;
        }
        this.method2653();
    }

    @ObfuscatedName("ee.r()V")
    public void method2649() {
        if (this.field1608 != null) {
            return;
        }
        this.field1608 = new class139[this.field1586];
        for (int var1 = 0; var1 < this.field1586; var1++) {
            this.field1608[var1] = new class139();
        }
        for (int var2 = 0; var2 < this.field1576; var2++) {
            int var3 = this.field1583[var2];
            int var4 = this.field1578[var2];
            int var5 = this.field1587[var2];
            int var6 = this.field1573[var4] - this.field1573[var3];
            int var7 = this.field1574[var4] - this.field1574[var3];
            int var8 = this.field1575[var4] - this.field1575[var3];
            int var9 = this.field1573[var5] - this.field1573[var3];
            int var10 = this.field1574[var5] - this.field1574[var3];
            int var11 = this.field1575[var5] - this.field1575[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field1580 == null) {
                var19 = 0;
            } else {
                var19 = this.field1580[var2];
            }
            if (var19 == 0) {
                class139 var20 = this.field1608[var3];
                var20.field1782 += var16;
                var20.field1785 += var17;
                var20.field1783 += var18;
                var20.field1784++;
                class139 var21 = this.field1608[var4];
                var21.field1782 += var16;
                var21.field1785 += var17;
                var21.field1783 += var18;
                var21.field1784++;
                class139 var22 = this.field1608[var5];
                var22.field1782 += var16;
                var22.field1785 += var17;
                var22.field1783 += var18;
                var22.field1784++;
            } else if (var19 == 1) {
                if (this.field1596 == null) {
                    this.field1596 = new class147[this.field1576];
                }
                class147 var23 = this.field1596[var2] = new class147();
                var23.field1924 = var16;
                var23.field1921 = var17;
                var23.field1922 = var18;
            }
        }
    }

    @ObfuscatedName("ee.u()V")
    public void method2653() {
        this.field1608 = null;
        this.field1600 = null;
        this.field1596 = null;
        this.field1601 = false;
    }

    @ObfuscatedName("ee.p()V")
    public void method2694() {
        if (this.field1601) {
            return;
        }
        this.field1906 = 0;
        this.field1599 = 0;
        this.field1602 = 999999;
        this.field1604 = -999999;
        this.field1605 = -99999;
        this.field1590 = 99999;
        for (int var1 = 0; var1 < this.field1586; var1++) {
            int var2 = this.field1573[var1];
            int var3 = this.field1574[var1];
            int var4 = this.field1575[var1];
            if (var2 < this.field1602) {
                this.field1602 = var2;
            }
            if (var2 > this.field1604) {
                this.field1604 = var2;
            }
            if (var4 < this.field1590) {
                this.field1590 = var4;
            }
            if (var4 > this.field1605) {
                this.field1605 = var4;
            }
            if (-var3 > this.field1906) {
                this.field1906 = -var3;
            }
            if (var3 > this.field1599) {
                this.field1599 = var3;
            }
        }
        this.field1601 = true;
    }

    @ObfuscatedName("ee.b(Lee;Lee;IIIZ)V")
    public static void method2693(class131 arg0, class131 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2694();
        arg0.method2649();
        arg1.method2694();
        arg1.method2649();
        field1606++;
        int var6 = 0;
        int[] var7 = arg1.field1573;
        int var8 = arg1.field1586;
        for (int var9 = 0; var9 < arg0.field1586; var9++) {
            class139 var10 = arg0.field1608[var9];
            if (var10.field1784 != 0) {
                int var11 = arg0.field1574[var9] - arg3;
                if (var11 <= arg1.field1599) {
                    int var12 = arg0.field1573[var9] - arg2;
                    if (var12 >= arg1.field1602 && var12 <= arg1.field1604) {
                        int var13 = arg0.field1575[var9] - arg4;
                        if (var13 >= arg1.field1590 && var13 <= arg1.field1605) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class139 var15 = arg1.field1608[var14];
                                if (var7[var14] == var12 && arg1.field1575[var14] == var13 && arg1.field1574[var14] == var11 && var15.field1784 != 0) {
                                    if (arg0.field1600 == null) {
                                        arg0.field1600 = new class139[arg0.field1586];
                                    }
                                    if (arg1.field1600 == null) {
                                        arg1.field1600 = new class139[var8];
                                    }
                                    class139 var16 = arg0.field1600[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1600[var9] = new class139(var10);
                                    }
                                    class139 var17 = arg1.field1600[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1600[var14] = new class139(var15);
                                    }
                                    var16.field1782 += var15.field1782;
                                    var16.field1785 += var15.field1785;
                                    var16.field1783 += var15.field1783;
                                    var16.field1784 += var15.field1784;
                                    var17.field1782 += var10.field1782;
                                    var17.field1785 += var10.field1785;
                                    var17.field1783 += var10.field1783;
                                    var17.field1784 += var10.field1784;
                                    var6++;
                                    field1607[var9] = field1606;
                                    field1603[var14] = field1606;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 < 3 || !arg5) {
            return;
        }
        for (int var18 = 0; var18 < arg0.field1576; var18++) {
            if (field1607[arg0.field1583[var18]] == field1606 && field1607[arg0.field1578[var18]] == field1606 && field1607[arg0.field1587[var18]] == field1606) {
                if (arg0.field1580 == null) {
                    arg0.field1580 = new byte[arg0.field1576];
                }
                arg0.field1580[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1576; var19++) {
            if (field1603[arg1.field1583[var19]] == field1606 && field1603[arg1.field1578[var19]] == field1606 && field1603[arg1.field1587[var19]] == field1606) {
                if (arg1.field1580 == null) {
                    arg1.field1580 = new byte[arg1.field1576];
                }
                arg1.field1580[var19] = 2;
            }
        }
    }

    @ObfuscatedName("ee.l(IIIII)Ler;")
    public final class137 method2656(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2649();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class137 var8 = new class137();
        var8.field1707 = new int[this.field1576];
        var8.field1708 = new int[this.field1576];
        var8.field1709 = new int[this.field1576];
        if (this.field1609 > 0 && this.field1598 != null) {
            int[] var9 = new int[this.field1609];
            for (int var10 = 0; var10 < this.field1576; var10++) {
                if (this.field1598[var10] != -1) {
                    var9[this.field1598[var10] & 0xFF]++;
                }
            }
            var8.field1715 = 0;
            for (int var11 = 0; var11 < this.field1609; var11++) {
                if (var9[var11] > 0 && this.field1588[var11] == 0) {
                    var8.field1715++;
                }
            }
            var8.field1716 = new int[var8.field1715];
            var8.field1717 = new int[var8.field1715];
            var8.field1718 = new int[var8.field1715];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1609; var13++) {
                if (var9[var13] > 0 && this.field1588[var13] == 0) {
                    var8.field1716[var12] = this.field1589[var13] & 0xFFFF;
                    var8.field1717[var12] = this.field1572[var13] & 0xFFFF;
                    var8.field1718[var12] = this.field1591[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1758 = new byte[this.field1576];
            for (int var14 = 0; var14 < this.field1576; var14++) {
                if (this.field1598[var14] == -1) {
                    var8.field1758[var14] = -1;
                } else {
                    var8.field1758[var14] = (byte) var9[this.field1598[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1576; var15++) {
            byte var16;
            if (this.field1580 == null) {
                var16 = 0;
            } else {
                var16 = this.field1580[var15];
            }
            byte var17;
            if (this.field1582 == null) {
                var17 = 0;
            } else {
                var17 = this.field1582[var15];
            }
            short var18;
            if (this.field1585 == null) {
                var18 = -1;
            } else {
                var18 = this.field1585[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1584[var15] & 0xFFFF;
                    class139 var20;
                    if (this.field1600 == null || this.field1600[this.field1583[var15]] == null) {
                        var20 = this.field1608[this.field1583[var15]];
                    } else {
                        var20 = this.field1600[this.field1583[var15]];
                    }
                    int var21 = (var20.field1783 * arg4 + var20.field1785 * arg3 + var20.field1782 * arg2) / (var20.field1784 * var7) + arg0;
                    var8.field1707[var15] = method2714(var19, var21);
                    class139 var22;
                    if (this.field1600 == null || this.field1600[this.field1578[var15]] == null) {
                        var22 = this.field1608[this.field1578[var15]];
                    } else {
                        var22 = this.field1600[this.field1578[var15]];
                    }
                    int var23 = (var22.field1783 * arg4 + var22.field1785 * arg3 + var22.field1782 * arg2) / (var22.field1784 * var7) + arg0;
                    var8.field1708[var15] = method2714(var19, var23);
                    class139 var24;
                    if (this.field1600 == null || this.field1600[this.field1587[var15]] == null) {
                        var24 = this.field1608[this.field1587[var15]];
                    } else {
                        var24 = this.field1600[this.field1587[var15]];
                    }
                    int var25 = (var24.field1783 * arg4 + var24.field1785 * arg3 + var24.field1782 * arg2) / (var24.field1784 * var7) + arg0;
                    var8.field1709[var15] = method2714(var19, var25);
                } else if (var16 == 1) {
                    class147 var26 = this.field1596[var15];
                    int var27 = (var26.field1922 * arg4 + var26.field1924 * arg2 + var26.field1921 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1707[var15] = method2714(this.field1584[var15] & 0xFFFF, var27);
                    var8.field1709[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1707[var15] = 128;
                    var8.field1709[var15] = -1;
                } else {
                    var8.field1709[var15] = -2;
                }
            } else if (var16 == 0) {
                class139 var28;
                if (this.field1600 == null || this.field1600[this.field1583[var15]] == null) {
                    var28 = this.field1608[this.field1583[var15]];
                } else {
                    var28 = this.field1600[this.field1583[var15]];
                }
                int var29 = (var28.field1783 * arg4 + var28.field1785 * arg3 + var28.field1782 * arg2) / (var28.field1784 * var7) + arg0;
                var8.field1707[var15] = method2658(var29);
                class139 var30;
                if (this.field1600 == null || this.field1600[this.field1578[var15]] == null) {
                    var30 = this.field1608[this.field1578[var15]];
                } else {
                    var30 = this.field1600[this.field1578[var15]];
                }
                int var31 = (var30.field1783 * arg4 + var30.field1785 * arg3 + var30.field1782 * arg2) / (var30.field1784 * var7) + arg0;
                var8.field1708[var15] = method2658(var31);
                class139 var32;
                if (this.field1600 == null || this.field1600[this.field1587[var15]] == null) {
                    var32 = this.field1608[this.field1587[var15]];
                } else {
                    var32 = this.field1600[this.field1587[var15]];
                }
                int var33 = (var32.field1783 * arg4 + var32.field1785 * arg3 + var32.field1782 * arg2) / (var32.field1784 * var7) + arg0;
                var8.field1709[var15] = method2658(var33);
            } else if (var16 == 1) {
                class147 var34 = this.field1596[var15];
                int var35 = (var34.field1922 * arg4 + var34.field1924 * arg2 + var34.field1921 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1707[var15] = method2658(var35);
                var8.field1709[var15] = -1;
            } else {
                var8.field1709[var15] = -2;
            }
        }
        this.method2642();
        var8.field1734 = this.field1586;
        var8.field1700 = this.field1573;
        var8.field1698 = this.field1574;
        var8.field1736 = this.field1575;
        var8.field1699 = this.field1576;
        var8.field1704 = this.field1583;
        var8.field1705 = this.field1578;
        var8.field1710 = this.field1587;
        var8.field1730 = this.field1581;
        var8.field1711 = this.field1582;
        var8.field1721 = this.field1597;
        var8.field1719 = this.field1594;
        var8.field1720 = this.field1595;
        var8.field1713 = this.field1585;
        return var8;
    }

    @ObfuscatedName("ee.e(II)I")
    public static final int method2714(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("ee.ab(I)I")
    public static final int method2658(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
