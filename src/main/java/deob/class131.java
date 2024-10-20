package deob;

@ObfuscatedName("ea")
public class class131 extends class145 {

    @ObfuscatedName("ea.x")
    public int field1599 = 0;

    @ObfuscatedName("ea.m")
    public int[] field1567;

    @ObfuscatedName("ea.k")
    public int[] field1593;

    @ObfuscatedName("ea.d")
    public int[] field1569;

    @ObfuscatedName("ea.w")
    public int field1570 = 0;

    @ObfuscatedName("ea.v")
    public int[] field1571;

    @ObfuscatedName("ea.q")
    public int[] field1572;

    @ObfuscatedName("ea.z")
    public int[] field1590;

    @ObfuscatedName("ea.t")
    public byte[] field1574;

    @ObfuscatedName("ea.e")
    public byte[] field1575;

    @ObfuscatedName("ea.s")
    public byte[] field1576;

    @ObfuscatedName("ea.p")
    public byte[] field1603;

    @ObfuscatedName("ea.n")
    public short[] field1578;

    @ObfuscatedName("ea.u")
    public short[] field1579;

    @ObfuscatedName("ea.h")
    public byte field1580 = 0;

    @ObfuscatedName("ea.g")
    public int field1581;

    @ObfuscatedName("ea.i")
    public byte[] field1582;

    @ObfuscatedName("ea.a")
    public short[] field1583;

    @ObfuscatedName("ea.b")
    public short[] field1584;

    @ObfuscatedName("ea.l")
    public short[] field1585;

    @ObfuscatedName("ea.r")
    public int[] field1586;

    @ObfuscatedName("ea.o")
    public int[] field1587;

    @ObfuscatedName("ea.c")
    public int[][] field1601;

    @ObfuscatedName("ea.j")
    public int[][] field1597;

    @ObfuscatedName("ea.y")
    public class147[] field1573;

    @ObfuscatedName("ea.f")
    public class139[] field1591;

    @ObfuscatedName("ea.ae")
    public class139[] field1592;

    @ObfuscatedName("ea.an")
    public short field1588;

    @ObfuscatedName("ea.ai")
    public short field1594;

    @ObfuscatedName("ea.ap")
    public boolean field1566 = false;

    @ObfuscatedName("ea.ab")
    public int field1568;

    @ObfuscatedName("ea.ar")
    public int field1596;

    @ObfuscatedName("ea.af")
    public int field1598;

    @ObfuscatedName("ea.at")
    public int field1595;

    @ObfuscatedName("ea.al")
    public int field1600;

    @ObfuscatedName("ea.as")
    public static int[] field1577 = new int[10000];

    @ObfuscatedName("ea.am")
    public static int[] field1602 = new int[10000];

    @ObfuscatedName("ea.au")
    public static int field1589 = 0;

    @ObfuscatedName("ea.ao")
    public static int[] field1604 = class140.field1795;

    @ObfuscatedName("ea.aq")
    public static int[] field1605 = class140.field1796;

    public class131() {
    }

    @ObfuscatedName("ea.x(Liy;II)Lea;")
    public static class131 method2615(class244 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3869(arg1, arg2);
        return var3 == null ? null : new class131(var3);
    }

    public class131(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2630(arg0);
        } else {
            this.method2618(arg0);
        }
    }

    @ObfuscatedName("ea.m([B)V")
    public void method2630(byte[] arg0) {
        class310 var2 = new class310(arg0);
        class310 var3 = new class310(arg0);
        class310 var4 = new class310(arg0);
        class310 var5 = new class310(arg0);
        class310 var6 = new class310(arg0);
        class310 var7 = new class310(arg0);
        class310 var8 = new class310(arg0);
        var2.field3711 = arg0.length - 23;
        int var9 = var2.method5139();
        int var10 = var2.method5139();
        int var11 = var2.method5137();
        int var12 = var2.method5137();
        int var13 = var2.method5137();
        int var14 = var2.method5137();
        int var15 = var2.method5137();
        int var16 = var2.method5137();
        int var17 = var2.method5137();
        int var18 = var2.method5139();
        int var19 = var2.method5139();
        int var20 = var2.method5139();
        int var21 = var2.method5139();
        int var22 = var2.method5139();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1582 = new byte[var11];
            var2.field3711 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1582[var26] = var2.method5138();
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
        this.field1599 = var9;
        this.field1570 = var10;
        this.field1581 = var11;
        this.field1567 = new int[var9];
        this.field1593 = new int[var9];
        this.field1569 = new int[var9];
        this.field1571 = new int[var10];
        this.field1572 = new int[var10];
        this.field1590 = new int[var10];
        if (var17 == 1) {
            this.field1586 = new int[var9];
        }
        if (var12 == 1) {
            this.field1574 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1575 = new byte[var10];
        } else {
            this.field1580 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1576 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1587 = new int[var10];
        }
        if (var16 == 1) {
            this.field1579 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1603 = new byte[var10];
        }
        this.field1578 = new short[var10];
        if (var11 > 0) {
            this.field1583 = new short[var11];
            this.field1584 = new short[var11];
            this.field1585 = new short[var11];
        }
        var2.field3711 = var11;
        var3.field3711 = var44;
        var4.field3711 = var46;
        var5.field3711 = var48;
        var6.field3711 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method5137();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method5218();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method5218();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method5218();
            }
            this.field1567[var67] = var64 + var69;
            this.field1593[var67] = var65 + var70;
            this.field1569[var67] = var66 + var71;
            var64 = this.field1567[var67];
            var65 = this.field1593[var67];
            var66 = this.field1569[var67];
            if (var17 == 1) {
                this.field1586[var67] = var6.method5137();
            }
        }
        var2.field3711 = var42;
        var3.field3711 = var31;
        var4.field3711 = var34;
        var5.field3711 = var37;
        var6.field3711 = var35;
        var7.field3711 = var40;
        var8.field3711 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1578[var72] = (short) var2.method5139();
            if (var12 == 1) {
                this.field1574[var72] = var3.method5138();
            }
            if (var13 == 255) {
                this.field1575[var72] = var4.method5138();
            }
            if (var14 == 1) {
                this.field1576[var72] = var5.method5138();
            }
            if (var15 == 1) {
                this.field1587[var72] = var6.method5137();
            }
            if (var16 == 1) {
                this.field1579[var72] = (short) (var7.method5139() - 1);
            }
            if (this.field1603 != null && this.field1579[var72] != -1) {
                this.field1603[var72] = (byte) (var8.method5137() - 1);
            }
        }
        var2.field3711 = var33;
        var3.field3711 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method5137();
            if (var78 == 1) {
                var73 = var2.method5218() + var76;
                var74 = var2.method5218() + var73;
                var75 = var2.method5218() + var74;
                var76 = var75;
                this.field1571[var77] = var73;
                this.field1572[var77] = var74;
                this.field1590[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method5218() + var76;
                var76 = var75;
                this.field1571[var77] = var73;
                this.field1572[var77] = var74;
                this.field1590[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method5218() + var76;
                var76 = var75;
                this.field1571[var77] = var73;
                this.field1572[var77] = var74;
                this.field1590[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method5218() + var76;
                var76 = var75;
                this.field1571[var77] = var73;
                this.field1572[var77] = var81;
                this.field1590[var77] = var75;
            }
        }
        var2.field3711 = var50;
        var3.field3711 = var52;
        var4.field3711 = var54;
        var5.field3711 = var56;
        var6.field3711 = var58;
        var7.field3711 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1582[var82] & 0xFF;
            if (var83 == 0) {
                this.field1583[var82] = (short) var2.method5139();
                this.field1584[var82] = (short) var2.method5139();
                this.field1585[var82] = (short) var2.method5139();
            }
        }
        var2.field3711 = var62;
        int var84 = var2.method5137();
        if (var84 == 0) {
            return;
        }
        new class144();
        var2.method5139();
        var2.method5139();
        var2.method5139();
        var2.method5142();
    }

    @ObfuscatedName("ea.k([B)V")
    public void method2618(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class310 var4 = new class310(arg0);
        class310 var5 = new class310(arg0);
        class310 var6 = new class310(arg0);
        class310 var7 = new class310(arg0);
        class310 var8 = new class310(arg0);
        var4.field3711 = arg0.length - 18;
        int var9 = var4.method5139();
        int var10 = var4.method5139();
        int var11 = var4.method5137();
        int var12 = var4.method5137();
        int var13 = var4.method5137();
        int var14 = var4.method5137();
        int var15 = var4.method5137();
        int var16 = var4.method5137();
        int var17 = var4.method5139();
        int var18 = var4.method5139();
        int var19 = var4.method5139();
        int var20 = var4.method5139();
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
        this.field1599 = var9;
        this.field1570 = var10;
        this.field1581 = var11;
        this.field1567 = new int[var9];
        this.field1593 = new int[var9];
        this.field1569 = new int[var9];
        this.field1571 = new int[var10];
        this.field1572 = new int[var10];
        this.field1590 = new int[var10];
        if (var11 > 0) {
            this.field1582 = new byte[var11];
            this.field1583 = new short[var11];
            this.field1584 = new short[var11];
            this.field1585 = new short[var11];
        }
        if (var16 == 1) {
            this.field1586 = new int[var9];
        }
        if (var12 == 1) {
            this.field1574 = new byte[var10];
            this.field1603 = new byte[var10];
            this.field1579 = new short[var10];
        }
        if (var13 == 255) {
            this.field1575 = new byte[var10];
        } else {
            this.field1580 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1576 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1587 = new int[var10];
        }
        this.field1578 = new short[var10];
        var4.field3711 = var21;
        var5.field3711 = var36;
        var6.field3711 = var38;
        var7.field3711 = var40;
        var8.field3711 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method5137();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method5218();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method5218();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method5218();
            }
            this.field1567[var46] = var43 + var48;
            this.field1593[var46] = var44 + var49;
            this.field1569[var46] = var45 + var50;
            var43 = this.field1567[var46];
            var44 = this.field1593[var46];
            var45 = this.field1569[var46];
            if (var16 == 1) {
                this.field1586[var46] = var8.method5137();
            }
        }
        var4.field3711 = var32;
        var5.field3711 = var28;
        var6.field3711 = var26;
        var7.field3711 = var30;
        var8.field3711 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1578[var51] = (short) var4.method5139();
            if (var12 == 1) {
                int var52 = var5.method5137();
                if ((var52 & 0x1) == 1) {
                    this.field1574[var51] = 1;
                    var2 = true;
                } else {
                    this.field1574[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1603[var51] = (byte) (var52 >> 2);
                    this.field1579[var51] = this.field1578[var51];
                    this.field1578[var51] = 127;
                    if (this.field1579[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1603[var51] = -1;
                    this.field1579[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1575[var51] = var6.method5138();
            }
            if (var14 == 1) {
                this.field1576[var51] = var7.method5138();
            }
            if (var15 == 1) {
                this.field1587[var51] = var8.method5137();
            }
        }
        var4.field3711 = var25;
        var5.field3711 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method5137();
            if (var58 == 1) {
                var53 = var4.method5218() + var56;
                var54 = var4.method5218() + var53;
                var55 = var4.method5218() + var54;
                var56 = var55;
                this.field1571[var57] = var53;
                this.field1572[var57] = var54;
                this.field1590[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method5218() + var56;
                var56 = var55;
                this.field1571[var57] = var53;
                this.field1572[var57] = var54;
                this.field1590[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method5218() + var56;
                var56 = var55;
                this.field1571[var57] = var53;
                this.field1572[var57] = var54;
                this.field1590[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method5218() + var56;
                var56 = var55;
                this.field1571[var57] = var53;
                this.field1572[var57] = var61;
                this.field1590[var57] = var55;
            }
        }
        var4.field3711 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1582[var62] = 0;
            this.field1583[var62] = (short) var4.method5139();
            this.field1584[var62] = (short) var4.method5139();
            this.field1585[var62] = (short) var4.method5139();
        }
        if (this.field1603 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1603[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1583[var65] & 0xFFFF) == this.field1571[var64] && (this.field1584[var65] & 0xFFFF) == this.field1572[var64] && (this.field1585[var65] & 0xFFFF) == this.field1590[var64]) {
                        this.field1603[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1603 = null;
            }
        }
        if (!var3) {
            this.field1579 = null;
        }
        if (!var2) {
            this.field1574 = null;
        }
    }

    public class131(class131[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1599 = 0;
        this.field1570 = 0;
        this.field1581 = 0;
        this.field1580 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class131 var10 = arg0[var9];
            if (var10 != null) {
                this.field1599 += var10.field1599;
                this.field1570 += var10.field1570;
                this.field1581 += var10.field1581;
                if (var10.field1575 == null) {
                    if (this.field1580 == -1) {
                        this.field1580 = var10.field1580;
                    }
                    if (this.field1580 != var10.field1580) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1574 != null;
                var5 |= var10.field1576 != null;
                var6 |= var10.field1587 != null;
                var7 |= var10.field1579 != null;
                var8 |= var10.field1603 != null;
            }
        }
        this.field1567 = new int[this.field1599];
        this.field1593 = new int[this.field1599];
        this.field1569 = new int[this.field1599];
        this.field1586 = new int[this.field1599];
        this.field1571 = new int[this.field1570];
        this.field1572 = new int[this.field1570];
        this.field1590 = new int[this.field1570];
        if (var3) {
            this.field1574 = new byte[this.field1570];
        }
        if (var4) {
            this.field1575 = new byte[this.field1570];
        }
        if (var5) {
            this.field1576 = new byte[this.field1570];
        }
        if (var6) {
            this.field1587 = new int[this.field1570];
        }
        if (var7) {
            this.field1579 = new short[this.field1570];
        }
        if (var8) {
            this.field1603 = new byte[this.field1570];
        }
        this.field1578 = new short[this.field1570];
        if (this.field1581 > 0) {
            this.field1582 = new byte[this.field1581];
            this.field1583 = new short[this.field1581];
            this.field1584 = new short[this.field1581];
            this.field1585 = new short[this.field1581];
        }
        this.field1599 = 0;
        this.field1570 = 0;
        this.field1581 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class131 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1570; var13++) {
                    if (var3 && var12.field1574 != null) {
                        this.field1574[this.field1570] = var12.field1574[var13];
                    }
                    if (var4) {
                        if (var12.field1575 == null) {
                            this.field1575[this.field1570] = var12.field1580;
                        } else {
                            this.field1575[this.field1570] = var12.field1575[var13];
                        }
                    }
                    if (var5 && var12.field1576 != null) {
                        this.field1576[this.field1570] = var12.field1576[var13];
                    }
                    if (var6 && var12.field1587 != null) {
                        this.field1587[this.field1570] = var12.field1587[var13];
                    }
                    if (var7) {
                        if (var12.field1579 == null) {
                            this.field1579[this.field1570] = -1;
                        } else {
                            this.field1579[this.field1570] = var12.field1579[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1603 == null || var12.field1603[var13] == -1) {
                            this.field1603[this.field1570] = -1;
                        } else {
                            this.field1603[this.field1570] = (byte) (var12.field1603[var13] + this.field1581);
                        }
                    }
                    this.field1578[this.field1570] = var12.field1578[var13];
                    this.field1571[this.field1570] = this.method2620(var12, var12.field1571[var13]);
                    this.field1572[this.field1570] = this.method2620(var12, var12.field1572[var13]);
                    this.field1590[this.field1570] = this.method2620(var12, var12.field1590[var13]);
                    this.field1570++;
                }
                for (int var14 = 0; var14 < var12.field1581; var14++) {
                    byte var15 = this.field1582[this.field1581] = var12.field1582[var14];
                    if (var15 == 0) {
                        this.field1583[this.field1581] = (short) this.method2620(var12, var12.field1583[var14]);
                        this.field1584[this.field1581] = (short) this.method2620(var12, var12.field1584[var14]);
                        this.field1585[this.field1581] = (short) this.method2620(var12, var12.field1585[var14]);
                    }
                    this.field1581++;
                }
            }
        }
    }

    @ObfuscatedName("ea.d(Lea;I)I")
    public final int method2620(class131 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1567[arg1];
        int var5 = arg0.field1593[arg1];
        int var6 = arg0.field1569[arg1];
        for (int var7 = 0; var7 < this.field1599; var7++) {
            if (this.field1567[var7] == var4 && this.field1593[var7] == var5 && this.field1569[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1567[this.field1599] = var4;
            this.field1593[this.field1599] = var5;
            this.field1569[this.field1599] = var6;
            if (arg0.field1586 != null) {
                this.field1586[this.field1599] = arg0.field1586[arg1];
            }
            var3 = this.field1599++;
        }
        return var3;
    }

    public class131(class131 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1599 = arg0.field1599;
        this.field1570 = arg0.field1570;
        this.field1581 = arg0.field1581;
        if (arg1) {
            this.field1567 = arg0.field1567;
            this.field1593 = arg0.field1593;
            this.field1569 = arg0.field1569;
        } else {
            this.field1567 = new int[this.field1599];
            this.field1593 = new int[this.field1599];
            this.field1569 = new int[this.field1599];
            for (int var6 = 0; var6 < this.field1599; var6++) {
                this.field1567[var6] = arg0.field1567[var6];
                this.field1593[var6] = arg0.field1593[var6];
                this.field1569[var6] = arg0.field1569[var6];
            }
        }
        if (arg2) {
            this.field1578 = arg0.field1578;
        } else {
            this.field1578 = new short[this.field1570];
            for (int var7 = 0; var7 < this.field1570; var7++) {
                this.field1578[var7] = arg0.field1578[var7];
            }
        }
        if (arg3 || arg0.field1579 == null) {
            this.field1579 = arg0.field1579;
        } else {
            this.field1579 = new short[this.field1570];
            for (int var8 = 0; var8 < this.field1570; var8++) {
                this.field1579[var8] = arg0.field1579[var8];
            }
        }
        if (arg4) {
            this.field1576 = arg0.field1576;
        } else {
            this.field1576 = new byte[this.field1570];
            if (arg0.field1576 == null) {
                for (int var9 = 0; var9 < this.field1570; var9++) {
                    this.field1576[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1570; var10++) {
                    this.field1576[var10] = arg0.field1576[var10];
                }
            }
        }
        this.field1571 = arg0.field1571;
        this.field1572 = arg0.field1572;
        this.field1590 = arg0.field1590;
        this.field1574 = arg0.field1574;
        this.field1575 = arg0.field1575;
        this.field1603 = arg0.field1603;
        this.field1580 = arg0.field1580;
        this.field1582 = arg0.field1582;
        this.field1583 = arg0.field1583;
        this.field1584 = arg0.field1584;
        this.field1585 = arg0.field1585;
        this.field1586 = arg0.field1586;
        this.field1587 = arg0.field1587;
        this.field1601 = arg0.field1601;
        this.field1597 = arg0.field1597;
        this.field1591 = arg0.field1591;
        this.field1573 = arg0.field1573;
        this.field1592 = arg0.field1592;
        this.field1588 = arg0.field1588;
        this.field1594 = arg0.field1594;
    }

    @ObfuscatedName("ea.w()Lea;")
    public class131 method2621() {
        class131 var1 = new class131();
        if (this.field1574 != null) {
            var1.field1574 = new byte[this.field1570];
            for (int var2 = 0; var2 < this.field1570; var2++) {
                var1.field1574[var2] = this.field1574[var2];
            }
        }
        var1.field1599 = this.field1599;
        var1.field1570 = this.field1570;
        var1.field1581 = this.field1581;
        var1.field1567 = this.field1567;
        var1.field1593 = this.field1593;
        var1.field1569 = this.field1569;
        var1.field1571 = this.field1571;
        var1.field1572 = this.field1572;
        var1.field1590 = this.field1590;
        var1.field1575 = this.field1575;
        var1.field1576 = this.field1576;
        var1.field1603 = this.field1603;
        var1.field1578 = this.field1578;
        var1.field1579 = this.field1579;
        var1.field1580 = this.field1580;
        var1.field1582 = this.field1582;
        var1.field1583 = this.field1583;
        var1.field1584 = this.field1584;
        var1.field1585 = this.field1585;
        var1.field1586 = this.field1586;
        var1.field1587 = this.field1587;
        var1.field1601 = this.field1601;
        var1.field1597 = this.field1597;
        var1.field1591 = this.field1591;
        var1.field1573 = this.field1573;
        var1.field1588 = this.field1588;
        var1.field1594 = this.field1594;
        return var1;
    }

    @ObfuscatedName("ea.v([[IIIIZI)Lea;")
    public class131 method2622(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2635();
        int var7 = this.field1596 + arg1;
        int var8 = this.field1598 + arg1;
        int var9 = this.field1600 + arg3;
        int var10 = this.field1595 + arg3;
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
            var15.field1599 = this.field1599;
            var15.field1570 = this.field1570;
            var15.field1581 = this.field1581;
            var15.field1567 = this.field1567;
            var15.field1569 = this.field1569;
            var15.field1571 = this.field1571;
            var15.field1572 = this.field1572;
            var15.field1590 = this.field1590;
            var15.field1574 = this.field1574;
            var15.field1575 = this.field1575;
            var15.field1576 = this.field1576;
            var15.field1603 = this.field1603;
            var15.field1578 = this.field1578;
            var15.field1579 = this.field1579;
            var15.field1580 = this.field1580;
            var15.field1582 = this.field1582;
            var15.field1583 = this.field1583;
            var15.field1584 = this.field1584;
            var15.field1585 = this.field1585;
            var15.field1586 = this.field1586;
            var15.field1587 = this.field1587;
            var15.field1601 = this.field1601;
            var15.field1597 = this.field1597;
            var15.field1588 = this.field1588;
            var15.field1594 = this.field1594;
            var15.field1593 = new int[var15.field1599];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1599; var16++) {
                int var17 = this.field1567[var16] + arg1;
                int var18 = this.field1569[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1593[var16] = this.field1593[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1599; var26++) {
                int var27 = (-this.field1593[var26] << 16) / this.field1884;
                if (var27 < arg5) {
                    int var28 = this.field1567[var26] + arg1;
                    int var29 = this.field1569[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1593[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1593[var26];
                }
            }
        }
        var15.method2634();
        return var15;
    }

    @ObfuscatedName("ea.q()V")
    public void method2637() {
        int var10002;
        if (this.field1586 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1599; var3++) {
                int var4 = this.field1586[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1601 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1601[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1599) {
                int var7 = this.field1586[var6];
                this.field1601[var7][var1[var7]++] = var6++;
            }
            this.field1586 = null;
        }
        if (this.field1587 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1570; var10++) {
            int var11 = this.field1587[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1597 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1597[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1570) {
            int var14 = this.field1587[var13];
            this.field1597[var14][var8[var14]++] = var13++;
        }
        this.field1587 = null;
    }

    @ObfuscatedName("ea.z()V")
    public void method2624() {
        for (int var1 = 0; var1 < this.field1599; var1++) {
            int var2 = this.field1567[var1];
            this.field1567[var1] = this.field1569[var1];
            this.field1569[var1] = -var2;
        }
        this.method2634();
    }

    @ObfuscatedName("ea.e()V")
    public void method2625() {
        for (int var1 = 0; var1 < this.field1599; var1++) {
            this.field1567[var1] = -this.field1567[var1];
            this.field1569[var1] = -this.field1569[var1];
        }
        this.method2634();
    }

    @ObfuscatedName("ea.s()V")
    public void method2646() {
        for (int var1 = 0; var1 < this.field1599; var1++) {
            int var2 = this.field1569[var1];
            this.field1569[var1] = this.field1567[var1];
            this.field1567[var1] = -var2;
        }
        this.method2634();
    }

    @ObfuscatedName("ea.p(I)V")
    public void method2627(int arg0) {
        int var2 = field1604[arg0];
        int var3 = field1605[arg0];
        for (int var4 = 0; var4 < this.field1599; var4++) {
            int var5 = this.field1569[var4] * var2 + this.field1567[var4] * var3 >> 16;
            this.field1569[var4] = this.field1569[var4] * var3 - this.field1567[var4] * var2 >> 16;
            this.field1567[var4] = var5;
        }
        this.method2634();
    }

    @ObfuscatedName("ea.n(III)V")
    public void method2628(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1599; var4++) {
            this.field1567[var4] += arg0;
            this.field1593[var4] += arg1;
            this.field1569[var4] += arg2;
        }
        this.method2634();
    }

    @ObfuscatedName("ea.u(SS)V")
    public void method2629(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1570; var3++) {
            if (this.field1578[var3] == arg0) {
                this.field1578[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ea.h(SS)V")
    public void method2681(short arg0, short arg1) {
        if (this.field1579 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1570; var3++) {
            if (this.field1579[var3] == arg0) {
                this.field1579[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ea.g()V")
    public void method2631() {
        for (int var1 = 0; var1 < this.field1599; var1++) {
            this.field1569[var1] = -this.field1569[var1];
        }
        for (int var2 = 0; var2 < this.field1570; var2++) {
            int var3 = this.field1571[var2];
            this.field1571[var2] = this.field1590[var2];
            this.field1590[var2] = var3;
        }
        this.method2634();
    }

    @ObfuscatedName("ea.i(III)V")
    public void method2632(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1599; var4++) {
            this.field1567[var4] = this.field1567[var4] * arg0 / 128;
            this.field1593[var4] = this.field1593[var4] * arg1 / 128;
            this.field1569[var4] = this.field1569[var4] * arg2 / 128;
        }
        this.method2634();
    }

    @ObfuscatedName("ea.a()V")
    public void method2633() {
        if (this.field1591 != null) {
            return;
        }
        this.field1591 = new class139[this.field1599];
        for (int var1 = 0; var1 < this.field1599; var1++) {
            this.field1591[var1] = new class139();
        }
        for (int var2 = 0; var2 < this.field1570; var2++) {
            int var3 = this.field1571[var2];
            int var4 = this.field1572[var2];
            int var5 = this.field1590[var2];
            int var6 = this.field1567[var4] - this.field1567[var3];
            int var7 = this.field1593[var4] - this.field1593[var3];
            int var8 = this.field1569[var4] - this.field1569[var3];
            int var9 = this.field1567[var5] - this.field1567[var3];
            int var10 = this.field1593[var5] - this.field1593[var3];
            int var11 = this.field1569[var5] - this.field1569[var3];
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
            if (this.field1574 == null) {
                var19 = 0;
            } else {
                var19 = this.field1574[var2];
            }
            if (var19 == 0) {
                class139 var20 = this.field1591[var3];
                var20.field1769 += var16;
                var20.field1766 += var17;
                var20.field1767 += var18;
                var20.field1768++;
                class139 var21 = this.field1591[var4];
                var21.field1769 += var16;
                var21.field1766 += var17;
                var21.field1767 += var18;
                var21.field1768++;
                class139 var22 = this.field1591[var5];
                var22.field1769 += var16;
                var22.field1766 += var17;
                var22.field1767 += var18;
                var22.field1768++;
            } else if (var19 == 1) {
                if (this.field1573 == null) {
                    this.field1573 = new class147[this.field1570];
                }
                class147 var23 = this.field1573[var2] = new class147();
                var23.field1899 = var16;
                var23.field1896 = var17;
                var23.field1897 = var18;
            }
        }
    }

    @ObfuscatedName("ea.o()V")
    public void method2634() {
        this.field1591 = null;
        this.field1592 = null;
        this.field1573 = null;
        this.field1566 = false;
    }

    @ObfuscatedName("ea.c()V")
    public void method2635() {
        if (this.field1566) {
            return;
        }
        this.field1884 = 0;
        this.field1568 = 0;
        this.field1596 = 999999;
        this.field1598 = -999999;
        this.field1595 = -99999;
        this.field1600 = 99999;
        for (int var1 = 0; var1 < this.field1599; var1++) {
            int var2 = this.field1567[var1];
            int var3 = this.field1593[var1];
            int var4 = this.field1569[var1];
            if (var2 < this.field1596) {
                this.field1596 = var2;
            }
            if (var2 > this.field1598) {
                this.field1598 = var2;
            }
            if (var4 < this.field1600) {
                this.field1600 = var4;
            }
            if (var4 > this.field1595) {
                this.field1595 = var4;
            }
            if (-var3 > this.field1884) {
                this.field1884 = -var3;
            }
            if (var3 > this.field1568) {
                this.field1568 = var3;
            }
        }
        this.field1566 = true;
    }

    @ObfuscatedName("ea.f(Lea;Lea;IIIZ)V")
    public static void method2626(class131 arg0, class131 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2635();
        arg0.method2633();
        arg1.method2635();
        arg1.method2633();
        field1589++;
        int var6 = 0;
        int[] var7 = arg1.field1567;
        int var8 = arg1.field1599;
        for (int var9 = 0; var9 < arg0.field1599; var9++) {
            class139 var10 = arg0.field1591[var9];
            if (var10.field1768 != 0) {
                int var11 = arg0.field1593[var9] - arg3;
                if (var11 <= arg1.field1568) {
                    int var12 = arg0.field1567[var9] - arg2;
                    if (var12 >= arg1.field1596 && var12 <= arg1.field1598) {
                        int var13 = arg0.field1569[var9] - arg4;
                        if (var13 >= arg1.field1600 && var13 <= arg1.field1595) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class139 var15 = arg1.field1591[var14];
                                if (var7[var14] == var12 && arg1.field1569[var14] == var13 && arg1.field1593[var14] == var11 && var15.field1768 != 0) {
                                    if (arg0.field1592 == null) {
                                        arg0.field1592 = new class139[arg0.field1599];
                                    }
                                    if (arg1.field1592 == null) {
                                        arg1.field1592 = new class139[var8];
                                    }
                                    class139 var16 = arg0.field1592[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1592[var9] = new class139(var10);
                                    }
                                    class139 var17 = arg1.field1592[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1592[var14] = new class139(var15);
                                    }
                                    var16.field1769 += var15.field1769;
                                    var16.field1766 += var15.field1766;
                                    var16.field1767 += var15.field1767;
                                    var16.field1768 += var15.field1768;
                                    var17.field1769 += var10.field1769;
                                    var17.field1766 += var10.field1766;
                                    var17.field1767 += var10.field1767;
                                    var17.field1768 += var10.field1768;
                                    var6++;
                                    field1577[var9] = field1589;
                                    field1602[var14] = field1589;
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
        for (int var18 = 0; var18 < arg0.field1570; var18++) {
            if (field1577[arg0.field1571[var18]] == field1589 && field1577[arg0.field1572[var18]] == field1589 && field1577[arg0.field1590[var18]] == field1589) {
                if (arg0.field1574 == null) {
                    arg0.field1574 = new byte[arg0.field1570];
                }
                arg0.field1574[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1570; var19++) {
            if (field1602[arg1.field1571[var19]] == field1589 && field1602[arg1.field1572[var19]] == field1589 && field1602[arg1.field1590[var19]] == field1589) {
                if (arg1.field1574 == null) {
                    arg1.field1574 = new byte[arg1.field1570];
                }
                arg1.field1574[var19] = 2;
            }
        }
    }

    @ObfuscatedName("ea.ae(IIIII)Lel;")
    public final class137 method2636(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2633();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class137 var8 = new class137();
        var8.field1695 = new int[this.field1570];
        var8.field1696 = new int[this.field1570];
        var8.field1748 = new int[this.field1570];
        if (this.field1581 > 0 && this.field1603 != null) {
            int[] var9 = new int[this.field1581];
            for (int var10 = 0; var10 < this.field1570; var10++) {
                if (this.field1603[var10] != -1) {
                    var9[this.field1603[var10] & 0xFF]++;
                }
            }
            var8.field1699 = 0;
            for (int var11 = 0; var11 < this.field1581; var11++) {
                if (var9[var11] > 0 && this.field1582[var11] == 0) {
                    var8.field1699++;
                }
            }
            var8.field1686 = new int[var8.field1699];
            var8.field1705 = new int[var8.field1699];
            var8.field1706 = new int[var8.field1699];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1581; var13++) {
                if (var9[var13] > 0 && this.field1582[var13] == 0) {
                    var8.field1686[var12] = this.field1583[var13] & 0xFFFF;
                    var8.field1705[var12] = this.field1584[var13] & 0xFFFF;
                    var8.field1706[var12] = this.field1585[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1700 = new byte[this.field1570];
            for (int var14 = 0; var14 < this.field1570; var14++) {
                if (this.field1603[var14] == -1) {
                    var8.field1700[var14] = -1;
                } else {
                    var8.field1700[var14] = (byte) var9[this.field1603[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1570; var15++) {
            byte var16;
            if (this.field1574 == null) {
                var16 = 0;
            } else {
                var16 = this.field1574[var15];
            }
            byte var17;
            if (this.field1576 == null) {
                var17 = 0;
            } else {
                var17 = this.field1576[var15];
            }
            short var18;
            if (this.field1579 == null) {
                var18 = -1;
            } else {
                var18 = this.field1579[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1578[var15] & 0xFFFF;
                    class139 var20;
                    if (this.field1592 == null || this.field1592[this.field1571[var15]] == null) {
                        var20 = this.field1591[this.field1571[var15]];
                    } else {
                        var20 = this.field1592[this.field1571[var15]];
                    }
                    int var21 = (var20.field1767 * arg4 + var20.field1769 * arg2 + var20.field1766 * arg3) / (var20.field1768 * var7) + arg0;
                    var8.field1695[var15] = method2638(var19, var21);
                    class139 var22;
                    if (this.field1592 == null || this.field1592[this.field1572[var15]] == null) {
                        var22 = this.field1591[this.field1572[var15]];
                    } else {
                        var22 = this.field1592[this.field1572[var15]];
                    }
                    int var23 = (var22.field1767 * arg4 + var22.field1769 * arg2 + var22.field1766 * arg3) / (var22.field1768 * var7) + arg0;
                    var8.field1696[var15] = method2638(var19, var23);
                    class139 var24;
                    if (this.field1592 == null || this.field1592[this.field1590[var15]] == null) {
                        var24 = this.field1591[this.field1590[var15]];
                    } else {
                        var24 = this.field1592[this.field1590[var15]];
                    }
                    int var25 = (var24.field1767 * arg4 + var24.field1769 * arg2 + var24.field1766 * arg3) / (var24.field1768 * var7) + arg0;
                    var8.field1748[var15] = method2638(var19, var25);
                } else if (var16 == 1) {
                    class147 var26 = this.field1573[var15];
                    int var27 = (var26.field1897 * arg4 + var26.field1899 * arg2 + var26.field1896 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1695[var15] = method2638(this.field1578[var15] & 0xFFFF, var27);
                    var8.field1748[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1695[var15] = 128;
                    var8.field1748[var15] = -1;
                } else {
                    var8.field1748[var15] = -2;
                }
            } else if (var16 == 0) {
                class139 var28;
                if (this.field1592 == null || this.field1592[this.field1571[var15]] == null) {
                    var28 = this.field1591[this.field1571[var15]];
                } else {
                    var28 = this.field1592[this.field1571[var15]];
                }
                int var29 = (var28.field1767 * arg4 + var28.field1769 * arg2 + var28.field1766 * arg3) / (var28.field1768 * var7) + arg0;
                var8.field1695[var15] = method2674(var29);
                class139 var30;
                if (this.field1592 == null || this.field1592[this.field1572[var15]] == null) {
                    var30 = this.field1591[this.field1572[var15]];
                } else {
                    var30 = this.field1592[this.field1572[var15]];
                }
                int var31 = (var30.field1767 * arg4 + var30.field1769 * arg2 + var30.field1766 * arg3) / (var30.field1768 * var7) + arg0;
                var8.field1696[var15] = method2674(var31);
                class139 var32;
                if (this.field1592 == null || this.field1592[this.field1590[var15]] == null) {
                    var32 = this.field1591[this.field1590[var15]];
                } else {
                    var32 = this.field1592[this.field1590[var15]];
                }
                int var33 = (var32.field1767 * arg4 + var32.field1769 * arg2 + var32.field1766 * arg3) / (var32.field1768 * var7) + arg0;
                var8.field1748[var15] = method2674(var33);
            } else if (var16 == 1) {
                class147 var34 = this.field1573[var15];
                int var35 = (var34.field1897 * arg4 + var34.field1899 * arg2 + var34.field1896 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1695[var15] = method2674(var35);
                var8.field1748[var15] = -1;
            } else {
                var8.field1748[var15] = -2;
            }
        }
        this.method2637();
        var8.field1687 = this.field1599;
        var8.field1688 = this.field1567;
        var8.field1689 = this.field1593;
        var8.field1733 = this.field1569;
        var8.field1691 = this.field1570;
        var8.field1692 = this.field1571;
        var8.field1683 = this.field1572;
        var8.field1726 = this.field1590;
        var8.field1698 = this.field1575;
        var8.field1709 = this.field1576;
        var8.field1702 = this.field1580;
        var8.field1719 = this.field1601;
        var8.field1731 = this.field1597;
        var8.field1701 = this.field1579;
        return var8;
    }

    @ObfuscatedName("ea.an(II)I")
    public static final int method2638(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("ea.ai(I)I")
    public static final int method2674(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
