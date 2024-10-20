package deob;

@ObfuscatedName("es")
public class class131 extends class145 {

    @ObfuscatedName("es.h")
    public int field1576 = 0;

    @ObfuscatedName("es.v")
    public int[] field1568;

    @ObfuscatedName("es.x")
    public int[] field1566;

    @ObfuscatedName("es.w")
    public int[] field1587;

    @ObfuscatedName("es.t")
    public int field1580 = 0;

    @ObfuscatedName("es.j")
    public int[] field1569;

    @ObfuscatedName("es.n")
    public int[] field1570;

    @ObfuscatedName("es.p")
    public int[] field1585;

    @ObfuscatedName("es.l")
    public byte[] field1572;

    @ObfuscatedName("es.z")
    public byte[] field1573;

    @ObfuscatedName("es.u")
    public byte[] field1565;

    @ObfuscatedName("es.e")
    public byte[] field1590;

    @ObfuscatedName("es.m")
    public short[] field1579;

    @ObfuscatedName("es.c")
    public short[] field1575;

    @ObfuscatedName("es.i")
    public byte field1578 = 0;

    @ObfuscatedName("es.f")
    public int field1564;

    @ObfuscatedName("es.a")
    public byte[] field1571;

    @ObfuscatedName("es.b")
    public short[] field1581;

    @ObfuscatedName("es.y")
    public short[] field1591;

    @ObfuscatedName("es.r")
    public short[] field1583;

    @ObfuscatedName("es.q")
    public int[] field1584;

    @ObfuscatedName("es.g")
    public int[] field1595;

    @ObfuscatedName("es.s")
    public int[][] field1577;

    @ObfuscatedName("es.o")
    public int[][] field1574;

    @ObfuscatedName("es.k")
    public class147[] field1588;

    @ObfuscatedName("es.d")
    public class139[] field1589;

    @ObfuscatedName("es.an")
    public class139[] field1602;

    @ObfuscatedName("es.aj")
    public short field1567;

    @ObfuscatedName("es.ax")
    public short field1592;

    @ObfuscatedName("es.ag")
    public boolean field1593 = false;

    @ObfuscatedName("es.au")
    public int field1594;

    @ObfuscatedName("es.as")
    public int field1586;

    @ObfuscatedName("es.ae")
    public int field1596;

    @ObfuscatedName("es.ac")
    public int field1597;

    @ObfuscatedName("es.ak")
    public int field1598;

    @ObfuscatedName("es.av")
    public static int[] field1599 = new int[10000];

    @ObfuscatedName("es.aq")
    public static int[] field1600 = new int[10000];

    @ObfuscatedName("es.ah")
    public static int field1601 = 0;

    @ObfuscatedName("es.am")
    public static int[] field1582 = class140.field1798;

    @ObfuscatedName("es.aa")
    public static int[] field1603 = class140.field1781;

    public class131() {
    }

    @ObfuscatedName("es.h(Lib;II)Les;")
    public static class131 method2622(class245 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3834(arg1, arg2);
        return var3 == null ? null : new class131(var3);
    }

    public class131(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2623(arg0);
        } else {
            this.method2624(arg0);
        }
    }

    @ObfuscatedName("es.v([B)V")
    public void method2623(byte[] arg0) {
        class311 var2 = new class311(arg0);
        class311 var3 = new class311(arg0);
        class311 var4 = new class311(arg0);
        class311 var5 = new class311(arg0);
        class311 var6 = new class311(arg0);
        class311 var7 = new class311(arg0);
        class311 var8 = new class311(arg0);
        var2.field3752 = arg0.length - 23;
        int var9 = var2.method5342();
        int var10 = var2.method5342();
        int var11 = var2.method5274();
        int var12 = var2.method5274();
        int var13 = var2.method5274();
        int var14 = var2.method5274();
        int var15 = var2.method5274();
        int var16 = var2.method5274();
        int var17 = var2.method5274();
        int var18 = var2.method5342();
        int var19 = var2.method5342();
        int var20 = var2.method5342();
        int var21 = var2.method5342();
        int var22 = var2.method5342();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1571 = new byte[var11];
            var2.field3752 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1571[var26] = var2.method5148();
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
        this.field1576 = var9;
        this.field1580 = var10;
        this.field1564 = var11;
        this.field1568 = new int[var9];
        this.field1566 = new int[var9];
        this.field1587 = new int[var9];
        this.field1569 = new int[var10];
        this.field1570 = new int[var10];
        this.field1585 = new int[var10];
        if (var17 == 1) {
            this.field1584 = new int[var9];
        }
        if (var12 == 1) {
            this.field1572 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1573 = new byte[var10];
        } else {
            this.field1578 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1565 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1595 = new int[var10];
        }
        if (var16 == 1) {
            this.field1575 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1590 = new byte[var10];
        }
        this.field1579 = new short[var10];
        if (var11 > 0) {
            this.field1581 = new short[var11];
            this.field1591 = new short[var11];
            this.field1583 = new short[var11];
        }
        var2.field3752 = var11;
        var3.field3752 = var44;
        var4.field3752 = var46;
        var5.field3752 = var48;
        var6.field3752 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method5274();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method5128();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method5128();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method5128();
            }
            this.field1568[var67] = var64 + var69;
            this.field1566[var67] = var65 + var70;
            this.field1587[var67] = var66 + var71;
            var64 = this.field1568[var67];
            var65 = this.field1566[var67];
            var66 = this.field1587[var67];
            if (var17 == 1) {
                this.field1584[var67] = var6.method5274();
            }
        }
        var2.field3752 = var42;
        var3.field3752 = var31;
        var4.field3752 = var34;
        var5.field3752 = var37;
        var6.field3752 = var35;
        var7.field3752 = var40;
        var8.field3752 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1579[var72] = (short) var2.method5342();
            if (var12 == 1) {
                this.field1572[var72] = var3.method5148();
            }
            if (var13 == 255) {
                this.field1573[var72] = var4.method5148();
            }
            if (var14 == 1) {
                this.field1565[var72] = var5.method5148();
            }
            if (var15 == 1) {
                this.field1595[var72] = var6.method5274();
            }
            if (var16 == 1) {
                this.field1575[var72] = (short) (var7.method5342() - 1);
            }
            if (this.field1590 != null && this.field1575[var72] != -1) {
                this.field1590[var72] = (byte) (var8.method5274() - 1);
            }
        }
        var2.field3752 = var33;
        var3.field3752 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method5274();
            if (var78 == 1) {
                var73 = var2.method5128() + var76;
                var74 = var2.method5128() + var73;
                var75 = var2.method5128() + var74;
                var76 = var75;
                this.field1569[var77] = var73;
                this.field1570[var77] = var74;
                this.field1585[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method5128() + var76;
                var76 = var75;
                this.field1569[var77] = var73;
                this.field1570[var77] = var74;
                this.field1585[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method5128() + var76;
                var76 = var75;
                this.field1569[var77] = var73;
                this.field1570[var77] = var74;
                this.field1585[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method5128() + var76;
                var76 = var75;
                this.field1569[var77] = var73;
                this.field1570[var77] = var81;
                this.field1585[var77] = var75;
            }
        }
        var2.field3752 = var50;
        var3.field3752 = var52;
        var4.field3752 = var54;
        var5.field3752 = var56;
        var6.field3752 = var58;
        var7.field3752 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1571[var82] & 0xFF;
            if (var83 == 0) {
                this.field1581[var82] = (short) var2.method5342();
                this.field1591[var82] = (short) var2.method5342();
                this.field1583[var82] = (short) var2.method5342();
            }
        }
        var2.field3752 = var62;
        int var84 = var2.method5274();
        if (var84 == 0) {
            return;
        }
        new class144();
        var2.method5342();
        var2.method5342();
        var2.method5342();
        var2.method5120();
    }

    @ObfuscatedName("es.x([B)V")
    public void method2624(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class311 var4 = new class311(arg0);
        class311 var5 = new class311(arg0);
        class311 var6 = new class311(arg0);
        class311 var7 = new class311(arg0);
        class311 var8 = new class311(arg0);
        var4.field3752 = arg0.length - 18;
        int var9 = var4.method5342();
        int var10 = var4.method5342();
        int var11 = var4.method5274();
        int var12 = var4.method5274();
        int var13 = var4.method5274();
        int var14 = var4.method5274();
        int var15 = var4.method5274();
        int var16 = var4.method5274();
        int var17 = var4.method5342();
        int var18 = var4.method5342();
        int var19 = var4.method5342();
        int var20 = var4.method5342();
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
        this.field1576 = var9;
        this.field1580 = var10;
        this.field1564 = var11;
        this.field1568 = new int[var9];
        this.field1566 = new int[var9];
        this.field1587 = new int[var9];
        this.field1569 = new int[var10];
        this.field1570 = new int[var10];
        this.field1585 = new int[var10];
        if (var11 > 0) {
            this.field1571 = new byte[var11];
            this.field1581 = new short[var11];
            this.field1591 = new short[var11];
            this.field1583 = new short[var11];
        }
        if (var16 == 1) {
            this.field1584 = new int[var9];
        }
        if (var12 == 1) {
            this.field1572 = new byte[var10];
            this.field1590 = new byte[var10];
            this.field1575 = new short[var10];
        }
        if (var13 == 255) {
            this.field1573 = new byte[var10];
        } else {
            this.field1578 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1565 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1595 = new int[var10];
        }
        this.field1579 = new short[var10];
        var4.field3752 = var21;
        var5.field3752 = var36;
        var6.field3752 = var38;
        var7.field3752 = var40;
        var8.field3752 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method5274();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method5128();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method5128();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method5128();
            }
            this.field1568[var46] = var43 + var48;
            this.field1566[var46] = var44 + var49;
            this.field1587[var46] = var45 + var50;
            var43 = this.field1568[var46];
            var44 = this.field1566[var46];
            var45 = this.field1587[var46];
            if (var16 == 1) {
                this.field1584[var46] = var8.method5274();
            }
        }
        var4.field3752 = var32;
        var5.field3752 = var28;
        var6.field3752 = var26;
        var7.field3752 = var30;
        var8.field3752 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1579[var51] = (short) var4.method5342();
            if (var12 == 1) {
                int var52 = var5.method5274();
                if ((var52 & 0x1) == 1) {
                    this.field1572[var51] = 1;
                    var2 = true;
                } else {
                    this.field1572[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1590[var51] = (byte) (var52 >> 2);
                    this.field1575[var51] = this.field1579[var51];
                    this.field1579[var51] = 127;
                    if (this.field1575[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1590[var51] = -1;
                    this.field1575[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1573[var51] = var6.method5148();
            }
            if (var14 == 1) {
                this.field1565[var51] = var7.method5148();
            }
            if (var15 == 1) {
                this.field1595[var51] = var8.method5274();
            }
        }
        var4.field3752 = var25;
        var5.field3752 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method5274();
            if (var58 == 1) {
                var53 = var4.method5128() + var56;
                var54 = var4.method5128() + var53;
                var55 = var4.method5128() + var54;
                var56 = var55;
                this.field1569[var57] = var53;
                this.field1570[var57] = var54;
                this.field1585[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method5128() + var56;
                var56 = var55;
                this.field1569[var57] = var53;
                this.field1570[var57] = var54;
                this.field1585[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method5128() + var56;
                var56 = var55;
                this.field1569[var57] = var53;
                this.field1570[var57] = var54;
                this.field1585[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method5128() + var56;
                var56 = var55;
                this.field1569[var57] = var53;
                this.field1570[var57] = var61;
                this.field1585[var57] = var55;
            }
        }
        var4.field3752 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1571[var62] = 0;
            this.field1581[var62] = (short) var4.method5342();
            this.field1591[var62] = (short) var4.method5342();
            this.field1583[var62] = (short) var4.method5342();
        }
        if (this.field1590 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1590[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1581[var65] & 0xFFFF) == this.field1569[var64] && (this.field1591[var65] & 0xFFFF) == this.field1570[var64] && (this.field1583[var65] & 0xFFFF) == this.field1585[var64]) {
                        this.field1590[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1590 = null;
            }
        }
        if (!var3) {
            this.field1575 = null;
        }
        if (!var2) {
            this.field1572 = null;
        }
    }

    public class131(class131[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1576 = 0;
        this.field1580 = 0;
        this.field1564 = 0;
        this.field1578 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class131 var10 = arg0[var9];
            if (var10 != null) {
                this.field1576 += var10.field1576;
                this.field1580 += var10.field1580;
                this.field1564 += var10.field1564;
                if (var10.field1573 == null) {
                    if (this.field1578 == -1) {
                        this.field1578 = var10.field1578;
                    }
                    if (this.field1578 != var10.field1578) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1572 != null;
                var5 |= var10.field1565 != null;
                var6 |= var10.field1595 != null;
                var7 |= var10.field1575 != null;
                var8 |= var10.field1590 != null;
            }
        }
        this.field1568 = new int[this.field1576];
        this.field1566 = new int[this.field1576];
        this.field1587 = new int[this.field1576];
        this.field1584 = new int[this.field1576];
        this.field1569 = new int[this.field1580];
        this.field1570 = new int[this.field1580];
        this.field1585 = new int[this.field1580];
        if (var3) {
            this.field1572 = new byte[this.field1580];
        }
        if (var4) {
            this.field1573 = new byte[this.field1580];
        }
        if (var5) {
            this.field1565 = new byte[this.field1580];
        }
        if (var6) {
            this.field1595 = new int[this.field1580];
        }
        if (var7) {
            this.field1575 = new short[this.field1580];
        }
        if (var8) {
            this.field1590 = new byte[this.field1580];
        }
        this.field1579 = new short[this.field1580];
        if (this.field1564 > 0) {
            this.field1571 = new byte[this.field1564];
            this.field1581 = new short[this.field1564];
            this.field1591 = new short[this.field1564];
            this.field1583 = new short[this.field1564];
        }
        this.field1576 = 0;
        this.field1580 = 0;
        this.field1564 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class131 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1580; var13++) {
                    if (var3 && var12.field1572 != null) {
                        this.field1572[this.field1580] = var12.field1572[var13];
                    }
                    if (var4) {
                        if (var12.field1573 == null) {
                            this.field1573[this.field1580] = var12.field1578;
                        } else {
                            this.field1573[this.field1580] = var12.field1573[var13];
                        }
                    }
                    if (var5 && var12.field1565 != null) {
                        this.field1565[this.field1580] = var12.field1565[var13];
                    }
                    if (var6 && var12.field1595 != null) {
                        this.field1595[this.field1580] = var12.field1595[var13];
                    }
                    if (var7) {
                        if (var12.field1575 == null) {
                            this.field1575[this.field1580] = -1;
                        } else {
                            this.field1575[this.field1580] = var12.field1575[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1590 == null || var12.field1590[var13] == -1) {
                            this.field1590[this.field1580] = -1;
                        } else {
                            this.field1590[this.field1580] = (byte) (var12.field1590[var13] + this.field1564);
                        }
                    }
                    this.field1579[this.field1580] = var12.field1579[var13];
                    this.field1569[this.field1580] = this.method2626(var12, var12.field1569[var13]);
                    this.field1570[this.field1580] = this.method2626(var12, var12.field1570[var13]);
                    this.field1585[this.field1580] = this.method2626(var12, var12.field1585[var13]);
                    this.field1580++;
                }
                for (int var14 = 0; var14 < var12.field1564; var14++) {
                    byte var15 = this.field1571[this.field1564] = var12.field1571[var14];
                    if (var15 == 0) {
                        this.field1581[this.field1564] = (short) this.method2626(var12, var12.field1581[var14]);
                        this.field1591[this.field1564] = (short) this.method2626(var12, var12.field1591[var14]);
                        this.field1583[this.field1564] = (short) this.method2626(var12, var12.field1583[var14]);
                    }
                    this.field1564++;
                }
            }
        }
    }

    @ObfuscatedName("es.w(Les;I)I")
    public final int method2626(class131 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1568[arg1];
        int var5 = arg0.field1566[arg1];
        int var6 = arg0.field1587[arg1];
        for (int var7 = 0; var7 < this.field1576; var7++) {
            if (this.field1568[var7] == var4 && this.field1566[var7] == var5 && this.field1587[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1568[this.field1576] = var4;
            this.field1566[this.field1576] = var5;
            this.field1587[this.field1576] = var6;
            if (arg0.field1584 != null) {
                this.field1584[this.field1576] = arg0.field1584[arg1];
            }
            var3 = this.field1576++;
        }
        return var3;
    }

    public class131(class131 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1576 = arg0.field1576;
        this.field1580 = arg0.field1580;
        this.field1564 = arg0.field1564;
        if (arg1) {
            this.field1568 = arg0.field1568;
            this.field1566 = arg0.field1566;
            this.field1587 = arg0.field1587;
        } else {
            this.field1568 = new int[this.field1576];
            this.field1566 = new int[this.field1576];
            this.field1587 = new int[this.field1576];
            for (int var6 = 0; var6 < this.field1576; var6++) {
                this.field1568[var6] = arg0.field1568[var6];
                this.field1566[var6] = arg0.field1566[var6];
                this.field1587[var6] = arg0.field1587[var6];
            }
        }
        if (arg2) {
            this.field1579 = arg0.field1579;
        } else {
            this.field1579 = new short[this.field1580];
            for (int var7 = 0; var7 < this.field1580; var7++) {
                this.field1579[var7] = arg0.field1579[var7];
            }
        }
        if (arg3 || arg0.field1575 == null) {
            this.field1575 = arg0.field1575;
        } else {
            this.field1575 = new short[this.field1580];
            for (int var8 = 0; var8 < this.field1580; var8++) {
                this.field1575[var8] = arg0.field1575[var8];
            }
        }
        if (arg4) {
            this.field1565 = arg0.field1565;
        } else {
            this.field1565 = new byte[this.field1580];
            if (arg0.field1565 == null) {
                for (int var9 = 0; var9 < this.field1580; var9++) {
                    this.field1565[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1580; var10++) {
                    this.field1565[var10] = arg0.field1565[var10];
                }
            }
        }
        this.field1569 = arg0.field1569;
        this.field1570 = arg0.field1570;
        this.field1585 = arg0.field1585;
        this.field1572 = arg0.field1572;
        this.field1573 = arg0.field1573;
        this.field1590 = arg0.field1590;
        this.field1578 = arg0.field1578;
        this.field1571 = arg0.field1571;
        this.field1581 = arg0.field1581;
        this.field1591 = arg0.field1591;
        this.field1583 = arg0.field1583;
        this.field1584 = arg0.field1584;
        this.field1595 = arg0.field1595;
        this.field1577 = arg0.field1577;
        this.field1574 = arg0.field1574;
        this.field1589 = arg0.field1589;
        this.field1588 = arg0.field1588;
        this.field1602 = arg0.field1602;
        this.field1567 = arg0.field1567;
        this.field1592 = arg0.field1592;
    }

    @ObfuscatedName("es.t()Les;")
    public class131 method2627() {
        class131 var1 = new class131();
        if (this.field1572 != null) {
            var1.field1572 = new byte[this.field1580];
            for (int var2 = 0; var2 < this.field1580; var2++) {
                var1.field1572[var2] = this.field1572[var2];
            }
        }
        var1.field1576 = this.field1576;
        var1.field1580 = this.field1580;
        var1.field1564 = this.field1564;
        var1.field1568 = this.field1568;
        var1.field1566 = this.field1566;
        var1.field1587 = this.field1587;
        var1.field1569 = this.field1569;
        var1.field1570 = this.field1570;
        var1.field1585 = this.field1585;
        var1.field1573 = this.field1573;
        var1.field1565 = this.field1565;
        var1.field1590 = this.field1590;
        var1.field1579 = this.field1579;
        var1.field1575 = this.field1575;
        var1.field1578 = this.field1578;
        var1.field1571 = this.field1571;
        var1.field1581 = this.field1581;
        var1.field1591 = this.field1591;
        var1.field1583 = this.field1583;
        var1.field1584 = this.field1584;
        var1.field1595 = this.field1595;
        var1.field1577 = this.field1577;
        var1.field1574 = this.field1574;
        var1.field1589 = this.field1589;
        var1.field1588 = this.field1588;
        var1.field1567 = this.field1567;
        var1.field1592 = this.field1592;
        return var1;
    }

    @ObfuscatedName("es.j([[IIIIZI)Les;")
    public class131 method2628(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2669();
        int var7 = this.field1586 + arg1;
        int var8 = this.field1596 + arg1;
        int var9 = this.field1598 + arg3;
        int var10 = this.field1597 + arg3;
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
            var15.field1576 = this.field1576;
            var15.field1580 = this.field1580;
            var15.field1564 = this.field1564;
            var15.field1568 = this.field1568;
            var15.field1587 = this.field1587;
            var15.field1569 = this.field1569;
            var15.field1570 = this.field1570;
            var15.field1585 = this.field1585;
            var15.field1572 = this.field1572;
            var15.field1573 = this.field1573;
            var15.field1565 = this.field1565;
            var15.field1590 = this.field1590;
            var15.field1579 = this.field1579;
            var15.field1575 = this.field1575;
            var15.field1578 = this.field1578;
            var15.field1571 = this.field1571;
            var15.field1581 = this.field1581;
            var15.field1591 = this.field1591;
            var15.field1583 = this.field1583;
            var15.field1584 = this.field1584;
            var15.field1595 = this.field1595;
            var15.field1577 = this.field1577;
            var15.field1574 = this.field1574;
            var15.field1567 = this.field1567;
            var15.field1592 = this.field1592;
            var15.field1566 = new int[var15.field1576];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1576; var16++) {
                int var17 = this.field1568[var16] + arg1;
                int var18 = this.field1587[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1566[var16] = this.field1566[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1576; var26++) {
                int var27 = (-this.field1566[var26] << 16) / this.field1895;
                if (var27 < arg5) {
                    int var28 = this.field1568[var26] + arg1;
                    int var29 = this.field1587[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1566[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1566[var26];
                }
            }
        }
        var15.method2695();
        return var15;
    }

    @ObfuscatedName("es.n()V")
    public void method2629() {
        int var10002;
        if (this.field1584 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1576; var3++) {
                int var4 = this.field1584[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1577 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1577[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1576) {
                int var7 = this.field1584[var6];
                this.field1577[var7][var1[var7]++] = var6++;
            }
            this.field1584 = null;
        }
        if (this.field1595 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1580; var10++) {
            int var11 = this.field1595[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1574 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1574[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1580) {
            int var14 = this.field1595[var13];
            this.field1574[var14][var8[var14]++] = var13++;
        }
        this.field1595 = null;
    }

    @ObfuscatedName("es.p()V")
    public void method2630() {
        for (int var1 = 0; var1 < this.field1576; var1++) {
            int var2 = this.field1568[var1];
            this.field1568[var1] = this.field1587[var1];
            this.field1587[var1] = -var2;
        }
        this.method2695();
    }

    @ObfuscatedName("es.z()V")
    public void method2666() {
        for (int var1 = 0; var1 < this.field1576; var1++) {
            this.field1568[var1] = -this.field1568[var1];
            this.field1587[var1] = -this.field1587[var1];
        }
        this.method2695();
    }

    @ObfuscatedName("es.u()V")
    public void method2633() {
        for (int var1 = 0; var1 < this.field1576; var1++) {
            int var2 = this.field1587[var1];
            this.field1587[var1] = this.field1568[var1];
            this.field1568[var1] = -var2;
        }
        this.method2695();
    }

    @ObfuscatedName("es.e(I)V")
    public void method2641(int arg0) {
        int var2 = field1582[arg0];
        int var3 = field1603[arg0];
        for (int var4 = 0; var4 < this.field1576; var4++) {
            int var5 = this.field1587[var4] * var2 + this.field1568[var4] * var3 >> 16;
            this.field1587[var4] = this.field1587[var4] * var3 - this.field1568[var4] * var2 >> 16;
            this.field1568[var4] = var5;
        }
        this.method2695();
    }

    @ObfuscatedName("es.m(III)V")
    public void method2634(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1576; var4++) {
            this.field1568[var4] += arg0;
            this.field1566[var4] += arg1;
            this.field1587[var4] += arg2;
        }
        this.method2695();
    }

    @ObfuscatedName("es.c(SS)V")
    public void method2635(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1580; var3++) {
            if (this.field1579[var3] == arg0) {
                this.field1579[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("es.i(SS)V")
    public void method2631(short arg0, short arg1) {
        if (this.field1575 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1580; var3++) {
            if (this.field1575[var3] == arg0) {
                this.field1575[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("es.f()V")
    public void method2637() {
        for (int var1 = 0; var1 < this.field1576; var1++) {
            this.field1587[var1] = -this.field1587[var1];
        }
        for (int var2 = 0; var2 < this.field1580; var2++) {
            int var3 = this.field1569[var2];
            this.field1569[var2] = this.field1585[var2];
            this.field1585[var2] = var3;
        }
        this.method2695();
    }

    @ObfuscatedName("es.y(III)V")
    public void method2638(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1576; var4++) {
            this.field1568[var4] = this.field1568[var4] * arg0 / 128;
            this.field1566[var4] = this.field1566[var4] * arg1 / 128;
            this.field1587[var4] = this.field1587[var4] * arg2 / 128;
        }
        this.method2695();
    }

    @ObfuscatedName("es.r()V")
    public void method2639() {
        if (this.field1589 != null) {
            return;
        }
        this.field1589 = new class139[this.field1576];
        for (int var1 = 0; var1 < this.field1576; var1++) {
            this.field1589[var1] = new class139();
        }
        for (int var2 = 0; var2 < this.field1580; var2++) {
            int var3 = this.field1569[var2];
            int var4 = this.field1570[var2];
            int var5 = this.field1585[var2];
            int var6 = this.field1568[var4] - this.field1568[var3];
            int var7 = this.field1566[var4] - this.field1566[var3];
            int var8 = this.field1587[var4] - this.field1587[var3];
            int var9 = this.field1568[var5] - this.field1568[var3];
            int var10 = this.field1566[var5] - this.field1566[var3];
            int var11 = this.field1587[var5] - this.field1587[var3];
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
            if (this.field1572 == null) {
                var19 = 0;
            } else {
                var19 = this.field1572[var2];
            }
            if (var19 == 0) {
                class139 var20 = this.field1589[var3];
                var20.field1773 += var16;
                var20.field1772 += var17;
                var20.field1776 += var18;
                var20.field1774++;
                class139 var21 = this.field1589[var4];
                var21.field1773 += var16;
                var21.field1772 += var17;
                var21.field1776 += var18;
                var21.field1774++;
                class139 var22 = this.field1589[var5];
                var22.field1773 += var16;
                var22.field1772 += var17;
                var22.field1776 += var18;
                var22.field1774++;
            } else if (var19 == 1) {
                if (this.field1588 == null) {
                    this.field1588 = new class147[this.field1580];
                }
                class147 var23 = this.field1588[var2] = new class147();
                var23.field1906 = var16;
                var23.field1907 = var17;
                var23.field1908 = var18;
            }
        }
    }

    @ObfuscatedName("es.q()V")
    public void method2695() {
        this.field1589 = null;
        this.field1602 = null;
        this.field1588 = null;
        this.field1593 = false;
    }

    @ObfuscatedName("es.g()V")
    public void method2669() {
        if (this.field1593) {
            return;
        }
        this.field1895 = 0;
        this.field1594 = 0;
        this.field1586 = 999999;
        this.field1596 = -999999;
        this.field1597 = -99999;
        this.field1598 = 99999;
        for (int var1 = 0; var1 < this.field1576; var1++) {
            int var2 = this.field1568[var1];
            int var3 = this.field1566[var1];
            int var4 = this.field1587[var1];
            if (var2 < this.field1586) {
                this.field1586 = var2;
            }
            if (var2 > this.field1596) {
                this.field1596 = var2;
            }
            if (var4 < this.field1598) {
                this.field1598 = var4;
            }
            if (var4 > this.field1597) {
                this.field1597 = var4;
            }
            if (-var3 > this.field1895) {
                this.field1895 = -var3;
            }
            if (var3 > this.field1594) {
                this.field1594 = var3;
            }
        }
        this.field1593 = true;
    }

    @ObfuscatedName("es.o(Les;Les;IIIZ)V")
    public static void method2642(class131 arg0, class131 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2669();
        arg0.method2639();
        arg1.method2669();
        arg1.method2639();
        field1601++;
        int var6 = 0;
        int[] var7 = arg1.field1568;
        int var8 = arg1.field1576;
        for (int var9 = 0; var9 < arg0.field1576; var9++) {
            class139 var10 = arg0.field1589[var9];
            if (var10.field1774 != 0) {
                int var11 = arg0.field1566[var9] - arg3;
                if (var11 <= arg1.field1594) {
                    int var12 = arg0.field1568[var9] - arg2;
                    if (var12 >= arg1.field1586 && var12 <= arg1.field1596) {
                        int var13 = arg0.field1587[var9] - arg4;
                        if (var13 >= arg1.field1598 && var13 <= arg1.field1597) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class139 var15 = arg1.field1589[var14];
                                if (var7[var14] == var12 && arg1.field1587[var14] == var13 && arg1.field1566[var14] == var11 && var15.field1774 != 0) {
                                    if (arg0.field1602 == null) {
                                        arg0.field1602 = new class139[arg0.field1576];
                                    }
                                    if (arg1.field1602 == null) {
                                        arg1.field1602 = new class139[var8];
                                    }
                                    class139 var16 = arg0.field1602[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1602[var9] = new class139(var10);
                                    }
                                    class139 var17 = arg1.field1602[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1602[var14] = new class139(var15);
                                    }
                                    var16.field1773 += var15.field1773;
                                    var16.field1772 += var15.field1772;
                                    var16.field1776 += var15.field1776;
                                    var16.field1774 += var15.field1774;
                                    var17.field1773 += var10.field1773;
                                    var17.field1772 += var10.field1772;
                                    var17.field1776 += var10.field1776;
                                    var17.field1774 += var10.field1774;
                                    var6++;
                                    field1599[var9] = field1601;
                                    field1600[var14] = field1601;
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
        for (int var18 = 0; var18 < arg0.field1580; var18++) {
            if (field1599[arg0.field1569[var18]] == field1601 && field1599[arg0.field1570[var18]] == field1601 && field1599[arg0.field1585[var18]] == field1601) {
                if (arg0.field1572 == null) {
                    arg0.field1572 = new byte[arg0.field1580];
                }
                arg0.field1572[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1580; var19++) {
            if (field1600[arg1.field1569[var19]] == field1601 && field1600[arg1.field1570[var19]] == field1601 && field1600[arg1.field1585[var19]] == field1601) {
                if (arg1.field1572 == null) {
                    arg1.field1572 = new byte[arg1.field1580];
                }
                arg1.field1572[var19] = 2;
            }
        }
    }

    @ObfuscatedName("es.an(IIIII)Leh;")
    public final class137 method2674(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2639();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class137 var8 = new class137();
        var8.field1697 = new int[this.field1580];
        var8.field1685 = new int[this.field1580];
        var8.field1699 = new int[this.field1580];
        if (this.field1564 > 0 && this.field1590 != null) {
            int[] var9 = new int[this.field1564];
            for (int var10 = 0; var10 < this.field1580; var10++) {
                if (this.field1590[var10] != -1) {
                    var9[this.field1590[var10] & 0xFF]++;
                }
            }
            var8.field1705 = 0;
            for (int var11 = 0; var11 < this.field1564; var11++) {
                if (var9[var11] > 0 && this.field1571[var11] == 0) {
                    var8.field1705++;
                }
            }
            var8.field1724 = new int[var8.field1705];
            var8.field1746 = new int[var8.field1705];
            var8.field1708 = new int[var8.field1705];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1564; var13++) {
                if (var9[var13] > 0 && this.field1571[var13] == 0) {
                    var8.field1724[var12] = this.field1581[var13] & 0xFFFF;
                    var8.field1746[var12] = this.field1591[var13] & 0xFFFF;
                    var8.field1708[var12] = this.field1583[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1702 = new byte[this.field1580];
            for (int var14 = 0; var14 < this.field1580; var14++) {
                if (this.field1590[var14] == -1) {
                    var8.field1702[var14] = -1;
                } else {
                    var8.field1702[var14] = (byte) var9[this.field1590[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1580; var15++) {
            byte var16;
            if (this.field1572 == null) {
                var16 = 0;
            } else {
                var16 = this.field1572[var15];
            }
            byte var17;
            if (this.field1565 == null) {
                var17 = 0;
            } else {
                var17 = this.field1565[var15];
            }
            short var18;
            if (this.field1575 == null) {
                var18 = -1;
            } else {
                var18 = this.field1575[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1579[var15] & 0xFFFF;
                    class139 var20;
                    if (this.field1602 == null || this.field1602[this.field1569[var15]] == null) {
                        var20 = this.field1589[this.field1569[var15]];
                    } else {
                        var20 = this.field1602[this.field1569[var15]];
                    }
                    int var21 = (var20.field1776 * arg4 + var20.field1773 * arg2 + var20.field1772 * arg3) / (var20.field1774 * var7) + arg0;
                    var8.field1697[var15] = method2644(var19, var21);
                    class139 var22;
                    if (this.field1602 == null || this.field1602[this.field1570[var15]] == null) {
                        var22 = this.field1589[this.field1570[var15]];
                    } else {
                        var22 = this.field1602[this.field1570[var15]];
                    }
                    int var23 = (var22.field1776 * arg4 + var22.field1773 * arg2 + var22.field1772 * arg3) / (var22.field1774 * var7) + arg0;
                    var8.field1685[var15] = method2644(var19, var23);
                    class139 var24;
                    if (this.field1602 == null || this.field1602[this.field1585[var15]] == null) {
                        var24 = this.field1589[this.field1585[var15]];
                    } else {
                        var24 = this.field1602[this.field1585[var15]];
                    }
                    int var25 = (var24.field1776 * arg4 + var24.field1773 * arg2 + var24.field1772 * arg3) / (var24.field1774 * var7) + arg0;
                    var8.field1699[var15] = method2644(var19, var25);
                } else if (var16 == 1) {
                    class147 var26 = this.field1588[var15];
                    int var27 = (var26.field1908 * arg4 + var26.field1907 * arg3 + var26.field1906 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1697[var15] = method2644(this.field1579[var15] & 0xFFFF, var27);
                    var8.field1699[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1697[var15] = 128;
                    var8.field1699[var15] = -1;
                } else {
                    var8.field1699[var15] = -2;
                }
            } else if (var16 == 0) {
                class139 var28;
                if (this.field1602 == null || this.field1602[this.field1569[var15]] == null) {
                    var28 = this.field1589[this.field1569[var15]];
                } else {
                    var28 = this.field1602[this.field1569[var15]];
                }
                int var29 = (var28.field1776 * arg4 + var28.field1773 * arg2 + var28.field1772 * arg3) / (var28.field1774 * var7) + arg0;
                var8.field1697[var15] = method2678(var29);
                class139 var30;
                if (this.field1602 == null || this.field1602[this.field1570[var15]] == null) {
                    var30 = this.field1589[this.field1570[var15]];
                } else {
                    var30 = this.field1602[this.field1570[var15]];
                }
                int var31 = (var30.field1776 * arg4 + var30.field1773 * arg2 + var30.field1772 * arg3) / (var30.field1774 * var7) + arg0;
                var8.field1685[var15] = method2678(var31);
                class139 var32;
                if (this.field1602 == null || this.field1602[this.field1585[var15]] == null) {
                    var32 = this.field1589[this.field1585[var15]];
                } else {
                    var32 = this.field1602[this.field1585[var15]];
                }
                int var33 = (var32.field1776 * arg4 + var32.field1773 * arg2 + var32.field1772 * arg3) / (var32.field1774 * var7) + arg0;
                var8.field1699[var15] = method2678(var33);
            } else if (var16 == 1) {
                class147 var34 = this.field1588[var15];
                int var35 = (var34.field1908 * arg4 + var34.field1907 * arg3 + var34.field1906 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1697[var15] = method2678(var35);
                var8.field1699[var15] = -1;
            } else {
                var8.field1699[var15] = -2;
            }
        }
        this.method2629();
        var8.field1689 = this.field1576;
        var8.field1717 = this.field1568;
        var8.field1691 = this.field1566;
        var8.field1692 = this.field1587;
        var8.field1749 = this.field1580;
        var8.field1741 = this.field1569;
        var8.field1695 = this.field1570;
        var8.field1740 = this.field1585;
        var8.field1700 = this.field1573;
        var8.field1694 = this.field1565;
        var8.field1723 = this.field1578;
        var8.field1709 = this.field1577;
        var8.field1710 = this.field1574;
        var8.field1747 = this.field1575;
        return var8;
    }

    @ObfuscatedName("es.aj(II)I")
    public static final int method2644(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("es.ax(I)I")
    public static final int method2678(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
