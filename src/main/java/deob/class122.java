package deob;

@ObfuscatedName("ds")
public class class122 extends class136 {

    @ObfuscatedName("ds.q")
    public int field1559 = 0;

    @ObfuscatedName("ds.w")
    public int[] field1577;

    @ObfuscatedName("ds.e")
    public int[] field1551;

    @ObfuscatedName("ds.p")
    public int[] field1553;

    @ObfuscatedName("ds.k")
    public int field1552 = 0;

    @ObfuscatedName("ds.l")
    public int[] field1550;

    @ObfuscatedName("ds.b")
    public int[] field1584;

    @ObfuscatedName("ds.i")
    public int[] field1557;

    @ObfuscatedName("ds.c")
    public byte[] field1558;

    @ObfuscatedName("ds.f")
    public byte[] field1560;

    @ObfuscatedName("ds.m")
    public byte[] field1588;

    @ObfuscatedName("ds.u")
    public byte[] field1561;

    @ObfuscatedName("ds.x")
    public short[] field1562;

    @ObfuscatedName("ds.r")
    public short[] field1563;

    @ObfuscatedName("ds.v")
    public byte field1564 = 0;

    @ObfuscatedName("ds.y")
    public int field1556;

    @ObfuscatedName("ds.g")
    public byte[] field1566;

    @ObfuscatedName("ds.a")
    public short[] field1567;

    @ObfuscatedName("ds.j")
    public short[] field1568;

    @ObfuscatedName("ds.t")
    public short[] field1569;

    @ObfuscatedName("ds.h")
    public int[] field1570;

    @ObfuscatedName("ds.o")
    public int[] field1554;

    @ObfuscatedName("ds.n")
    public int[][] field1572;

    @ObfuscatedName("ds.d")
    public int[][] field1573;

    @ObfuscatedName("ds.s")
    public class138[] field1574;

    @ObfuscatedName("ds.z")
    public class130[] field1575;

    @ObfuscatedName("ds.al")
    public class130[] field1582;

    @ObfuscatedName("ds.av")
    public short field1581;

    @ObfuscatedName("ds.as")
    public short field1578;

    @ObfuscatedName("ds.aw")
    public boolean field1579 = false;

    @ObfuscatedName("ds.ad")
    public int field1580;

    @ObfuscatedName("ds.ag")
    public int field1576;

    @ObfuscatedName("ds.ar")
    public int field1565;

    @ObfuscatedName("ds.ax")
    public int field1583;

    @ObfuscatedName("ds.az")
    public int field1555;

    @ObfuscatedName("ds.ae")
    public static int[] field1585 = new int[10000];

    @ObfuscatedName("ds.ao")
    public static int[] field1586 = new int[10000];

    @ObfuscatedName("ds.aj")
    public static int field1587 = 0;

    @ObfuscatedName("ds.at")
    public static int[] field1571 = class131.field1788;

    @ObfuscatedName("ds.ac")
    public static int[] field1589 = class131.field1785;

    public class122() {
    }

    @ObfuscatedName("ds.q(Lhp;II)Lds;")
    public static class122 method2512(class234 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3775(arg1, arg2);
        return var3 == null ? null : new class122(var3);
    }

    public class122(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2513(arg0);
        } else {
            this.method2536(arg0);
        }
    }

    @ObfuscatedName("ds.w([B)V")
    public void method2513(byte[] arg0) {
        class301 var2 = new class301(arg0);
        class301 var3 = new class301(arg0);
        class301 var4 = new class301(arg0);
        class301 var5 = new class301(arg0);
        class301 var6 = new class301(arg0);
        class301 var7 = new class301(arg0);
        class301 var8 = new class301(arg0);
        var2.field3733 = arg0.length - 23;
        int var9 = var2.method5069();
        int var10 = var2.method5069();
        int var11 = var2.method5077();
        int var12 = var2.method5077();
        int var13 = var2.method5077();
        int var14 = var2.method5077();
        int var15 = var2.method5077();
        int var16 = var2.method5077();
        int var17 = var2.method5077();
        int var18 = var2.method5069();
        int var19 = var2.method5069();
        int var20 = var2.method5069();
        int var21 = var2.method5069();
        int var22 = var2.method5069();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1566 = new byte[var11];
            var2.field3733 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1566[var26] = var2.method5068();
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
        this.field1559 = var9;
        this.field1552 = var10;
        this.field1556 = var11;
        this.field1577 = new int[var9];
        this.field1551 = new int[var9];
        this.field1553 = new int[var9];
        this.field1550 = new int[var10];
        this.field1584 = new int[var10];
        this.field1557 = new int[var10];
        if (var17 == 1) {
            this.field1570 = new int[var9];
        }
        if (var12 == 1) {
            this.field1558 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1560 = new byte[var10];
        } else {
            this.field1564 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1588 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1554 = new int[var10];
        }
        if (var16 == 1) {
            this.field1563 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1561 = new byte[var10];
        }
        this.field1562 = new short[var10];
        if (var11 > 0) {
            this.field1567 = new short[var11];
            this.field1568 = new short[var11];
            this.field1569 = new short[var11];
        }
        var2.field3733 = var11;
        var3.field3733 = var44;
        var4.field3733 = var46;
        var5.field3733 = var48;
        var6.field3733 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method5077();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method5080();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method5080();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method5080();
            }
            this.field1577[var67] = var64 + var69;
            this.field1551[var67] = var65 + var70;
            this.field1553[var67] = var66 + var71;
            var64 = this.field1577[var67];
            var65 = this.field1551[var67];
            var66 = this.field1553[var67];
            if (var17 == 1) {
                this.field1570[var67] = var6.method5077();
            }
        }
        var2.field3733 = var42;
        var3.field3733 = var31;
        var4.field3733 = var34;
        var5.field3733 = var37;
        var6.field3733 = var35;
        var7.field3733 = var40;
        var8.field3733 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1562[var72] = (short) var2.method5069();
            if (var12 == 1) {
                this.field1558[var72] = var3.method5068();
            }
            if (var13 == 255) {
                this.field1560[var72] = var4.method5068();
            }
            if (var14 == 1) {
                this.field1588[var72] = var5.method5068();
            }
            if (var15 == 1) {
                this.field1554[var72] = var6.method5077();
            }
            if (var16 == 1) {
                this.field1563[var72] = (short) (var7.method5069() - 1);
            }
            if (this.field1561 != null && this.field1563[var72] != -1) {
                this.field1561[var72] = (byte) (var8.method5077() - 1);
            }
        }
        var2.field3733 = var33;
        var3.field3733 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method5077();
            if (var78 == 1) {
                var73 = var2.method5080() + var76;
                var74 = var2.method5080() + var73;
                var75 = var2.method5080() + var74;
                var76 = var75;
                this.field1550[var77] = var73;
                this.field1584[var77] = var74;
                this.field1557[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method5080() + var76;
                var76 = var75;
                this.field1550[var77] = var73;
                this.field1584[var77] = var74;
                this.field1557[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method5080() + var76;
                var76 = var75;
                this.field1550[var77] = var73;
                this.field1584[var77] = var74;
                this.field1557[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method5080() + var76;
                var76 = var75;
                this.field1550[var77] = var73;
                this.field1584[var77] = var81;
                this.field1557[var77] = var75;
            }
        }
        var2.field3733 = var50;
        var3.field3733 = var52;
        var4.field3733 = var54;
        var5.field3733 = var56;
        var6.field3733 = var58;
        var7.field3733 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1566[var82] & 0xFF;
            if (var83 == 0) {
                this.field1567[var82] = (short) var2.method5069();
                this.field1568[var82] = (short) var2.method5069();
                this.field1569[var82] = (short) var2.method5069();
            }
        }
        var2.field3733 = var62;
        int var84 = var2.method5077();
        if (var84 == 0) {
            return;
        }
        new class135();
        var2.method5069();
        var2.method5069();
        var2.method5069();
        var2.method5072();
    }

    @ObfuscatedName("ds.e([B)V")
    public void method2536(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class301 var4 = new class301(arg0);
        class301 var5 = new class301(arg0);
        class301 var6 = new class301(arg0);
        class301 var7 = new class301(arg0);
        class301 var8 = new class301(arg0);
        var4.field3733 = arg0.length - 18;
        int var9 = var4.method5069();
        int var10 = var4.method5069();
        int var11 = var4.method5077();
        int var12 = var4.method5077();
        int var13 = var4.method5077();
        int var14 = var4.method5077();
        int var15 = var4.method5077();
        int var16 = var4.method5077();
        int var17 = var4.method5069();
        int var18 = var4.method5069();
        int var19 = var4.method5069();
        int var20 = var4.method5069();
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
        this.field1559 = var9;
        this.field1552 = var10;
        this.field1556 = var11;
        this.field1577 = new int[var9];
        this.field1551 = new int[var9];
        this.field1553 = new int[var9];
        this.field1550 = new int[var10];
        this.field1584 = new int[var10];
        this.field1557 = new int[var10];
        if (var11 > 0) {
            this.field1566 = new byte[var11];
            this.field1567 = new short[var11];
            this.field1568 = new short[var11];
            this.field1569 = new short[var11];
        }
        if (var16 == 1) {
            this.field1570 = new int[var9];
        }
        if (var12 == 1) {
            this.field1558 = new byte[var10];
            this.field1561 = new byte[var10];
            this.field1563 = new short[var10];
        }
        if (var13 == 255) {
            this.field1560 = new byte[var10];
        } else {
            this.field1564 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1588 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1554 = new int[var10];
        }
        this.field1562 = new short[var10];
        var4.field3733 = var21;
        var5.field3733 = var36;
        var6.field3733 = var38;
        var7.field3733 = var40;
        var8.field3733 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method5077();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method5080();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method5080();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method5080();
            }
            this.field1577[var46] = var43 + var48;
            this.field1551[var46] = var44 + var49;
            this.field1553[var46] = var45 + var50;
            var43 = this.field1577[var46];
            var44 = this.field1551[var46];
            var45 = this.field1553[var46];
            if (var16 == 1) {
                this.field1570[var46] = var8.method5077();
            }
        }
        var4.field3733 = var32;
        var5.field3733 = var28;
        var6.field3733 = var26;
        var7.field3733 = var30;
        var8.field3733 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1562[var51] = (short) var4.method5069();
            if (var12 == 1) {
                int var52 = var5.method5077();
                if ((var52 & 0x1) == 1) {
                    this.field1558[var51] = 1;
                    var2 = true;
                } else {
                    this.field1558[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1561[var51] = (byte) (var52 >> 2);
                    this.field1563[var51] = this.field1562[var51];
                    this.field1562[var51] = 127;
                    if (this.field1563[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1561[var51] = -1;
                    this.field1563[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1560[var51] = var6.method5068();
            }
            if (var14 == 1) {
                this.field1588[var51] = var7.method5068();
            }
            if (var15 == 1) {
                this.field1554[var51] = var8.method5077();
            }
        }
        var4.field3733 = var25;
        var5.field3733 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method5077();
            if (var58 == 1) {
                var53 = var4.method5080() + var56;
                var54 = var4.method5080() + var53;
                var55 = var4.method5080() + var54;
                var56 = var55;
                this.field1550[var57] = var53;
                this.field1584[var57] = var54;
                this.field1557[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method5080() + var56;
                var56 = var55;
                this.field1550[var57] = var53;
                this.field1584[var57] = var54;
                this.field1557[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method5080() + var56;
                var56 = var55;
                this.field1550[var57] = var53;
                this.field1584[var57] = var54;
                this.field1557[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method5080() + var56;
                var56 = var55;
                this.field1550[var57] = var53;
                this.field1584[var57] = var61;
                this.field1557[var57] = var55;
            }
        }
        var4.field3733 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1566[var62] = 0;
            this.field1567[var62] = (short) var4.method5069();
            this.field1568[var62] = (short) var4.method5069();
            this.field1569[var62] = (short) var4.method5069();
        }
        if (this.field1561 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1561[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1567[var65] & 0xFFFF) == this.field1550[var64] && (this.field1568[var65] & 0xFFFF) == this.field1584[var64] && (this.field1569[var65] & 0xFFFF) == this.field1557[var64]) {
                        this.field1561[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1561 = null;
            }
        }
        if (!var3) {
            this.field1563 = null;
        }
        if (!var2) {
            this.field1558 = null;
        }
    }

    public class122(class122[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1559 = 0;
        this.field1552 = 0;
        this.field1556 = 0;
        this.field1564 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class122 var10 = arg0[var9];
            if (var10 != null) {
                this.field1559 += var10.field1559;
                this.field1552 += var10.field1552;
                this.field1556 += var10.field1556;
                if (var10.field1560 == null) {
                    if (this.field1564 == -1) {
                        this.field1564 = var10.field1564;
                    }
                    if (this.field1564 != var10.field1564) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1558 != null;
                var5 |= var10.field1588 != null;
                var6 |= var10.field1554 != null;
                var7 |= var10.field1563 != null;
                var8 |= var10.field1561 != null;
            }
        }
        this.field1577 = new int[this.field1559];
        this.field1551 = new int[this.field1559];
        this.field1553 = new int[this.field1559];
        this.field1570 = new int[this.field1559];
        this.field1550 = new int[this.field1552];
        this.field1584 = new int[this.field1552];
        this.field1557 = new int[this.field1552];
        if (var3) {
            this.field1558 = new byte[this.field1552];
        }
        if (var4) {
            this.field1560 = new byte[this.field1552];
        }
        if (var5) {
            this.field1588 = new byte[this.field1552];
        }
        if (var6) {
            this.field1554 = new int[this.field1552];
        }
        if (var7) {
            this.field1563 = new short[this.field1552];
        }
        if (var8) {
            this.field1561 = new byte[this.field1552];
        }
        this.field1562 = new short[this.field1552];
        if (this.field1556 > 0) {
            this.field1566 = new byte[this.field1556];
            this.field1567 = new short[this.field1556];
            this.field1568 = new short[this.field1556];
            this.field1569 = new short[this.field1556];
        }
        this.field1559 = 0;
        this.field1552 = 0;
        this.field1556 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class122 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1552; var13++) {
                    if (var3 && var12.field1558 != null) {
                        this.field1558[this.field1552] = var12.field1558[var13];
                    }
                    if (var4) {
                        if (var12.field1560 == null) {
                            this.field1560[this.field1552] = var12.field1564;
                        } else {
                            this.field1560[this.field1552] = var12.field1560[var13];
                        }
                    }
                    if (var5 && var12.field1588 != null) {
                        this.field1588[this.field1552] = var12.field1588[var13];
                    }
                    if (var6 && var12.field1554 != null) {
                        this.field1554[this.field1552] = var12.field1554[var13];
                    }
                    if (var7) {
                        if (var12.field1563 == null) {
                            this.field1563[this.field1552] = -1;
                        } else {
                            this.field1563[this.field1552] = var12.field1563[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1561 == null || var12.field1561[var13] == -1) {
                            this.field1561[this.field1552] = -1;
                        } else {
                            this.field1561[this.field1552] = (byte) (var12.field1561[var13] + this.field1556);
                        }
                    }
                    this.field1562[this.field1552] = var12.field1562[var13];
                    this.field1550[this.field1552] = this.method2559(var12, var12.field1550[var13]);
                    this.field1584[this.field1552] = this.method2559(var12, var12.field1584[var13]);
                    this.field1557[this.field1552] = this.method2559(var12, var12.field1557[var13]);
                    this.field1552++;
                }
                for (int var14 = 0; var14 < var12.field1556; var14++) {
                    byte var15 = this.field1566[this.field1556] = var12.field1566[var14];
                    if (var15 == 0) {
                        this.field1567[this.field1556] = (short) this.method2559(var12, var12.field1567[var14]);
                        this.field1568[this.field1556] = (short) this.method2559(var12, var12.field1568[var14]);
                        this.field1569[this.field1556] = (short) this.method2559(var12, var12.field1569[var14]);
                    }
                    this.field1556++;
                }
            }
        }
    }

    @ObfuscatedName("ds.p(Lds;I)I")
    public final int method2559(class122 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1577[arg1];
        int var5 = arg0.field1551[arg1];
        int var6 = arg0.field1553[arg1];
        for (int var7 = 0; var7 < this.field1559; var7++) {
            if (this.field1577[var7] == var4 && this.field1551[var7] == var5 && this.field1553[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1577[this.field1559] = var4;
            this.field1551[this.field1559] = var5;
            this.field1553[this.field1559] = var6;
            if (arg0.field1570 != null) {
                this.field1570[this.field1559] = arg0.field1570[arg1];
            }
            var3 = this.field1559++;
        }
        return var3;
    }

    public class122(class122 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1559 = arg0.field1559;
        this.field1552 = arg0.field1552;
        this.field1556 = arg0.field1556;
        if (arg1) {
            this.field1577 = arg0.field1577;
            this.field1551 = arg0.field1551;
            this.field1553 = arg0.field1553;
        } else {
            this.field1577 = new int[this.field1559];
            this.field1551 = new int[this.field1559];
            this.field1553 = new int[this.field1559];
            for (int var6 = 0; var6 < this.field1559; var6++) {
                this.field1577[var6] = arg0.field1577[var6];
                this.field1551[var6] = arg0.field1551[var6];
                this.field1553[var6] = arg0.field1553[var6];
            }
        }
        if (arg2) {
            this.field1562 = arg0.field1562;
        } else {
            this.field1562 = new short[this.field1552];
            for (int var7 = 0; var7 < this.field1552; var7++) {
                this.field1562[var7] = arg0.field1562[var7];
            }
        }
        if (arg3 || arg0.field1563 == null) {
            this.field1563 = arg0.field1563;
        } else {
            this.field1563 = new short[this.field1552];
            for (int var8 = 0; var8 < this.field1552; var8++) {
                this.field1563[var8] = arg0.field1563[var8];
            }
        }
        if (arg4) {
            this.field1588 = arg0.field1588;
        } else {
            this.field1588 = new byte[this.field1552];
            if (arg0.field1588 == null) {
                for (int var9 = 0; var9 < this.field1552; var9++) {
                    this.field1588[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1552; var10++) {
                    this.field1588[var10] = arg0.field1588[var10];
                }
            }
        }
        this.field1550 = arg0.field1550;
        this.field1584 = arg0.field1584;
        this.field1557 = arg0.field1557;
        this.field1558 = arg0.field1558;
        this.field1560 = arg0.field1560;
        this.field1561 = arg0.field1561;
        this.field1564 = arg0.field1564;
        this.field1566 = arg0.field1566;
        this.field1567 = arg0.field1567;
        this.field1568 = arg0.field1568;
        this.field1569 = arg0.field1569;
        this.field1570 = arg0.field1570;
        this.field1554 = arg0.field1554;
        this.field1572 = arg0.field1572;
        this.field1573 = arg0.field1573;
        this.field1575 = arg0.field1575;
        this.field1574 = arg0.field1574;
        this.field1582 = arg0.field1582;
        this.field1581 = arg0.field1581;
        this.field1578 = arg0.field1578;
    }

    @ObfuscatedName("ds.k()Lds;")
    public class122 method2518() {
        class122 var1 = new class122();
        if (this.field1558 != null) {
            var1.field1558 = new byte[this.field1552];
            for (int var2 = 0; var2 < this.field1552; var2++) {
                var1.field1558[var2] = this.field1558[var2];
            }
        }
        var1.field1559 = this.field1559;
        var1.field1552 = this.field1552;
        var1.field1556 = this.field1556;
        var1.field1577 = this.field1577;
        var1.field1551 = this.field1551;
        var1.field1553 = this.field1553;
        var1.field1550 = this.field1550;
        var1.field1584 = this.field1584;
        var1.field1557 = this.field1557;
        var1.field1560 = this.field1560;
        var1.field1588 = this.field1588;
        var1.field1561 = this.field1561;
        var1.field1562 = this.field1562;
        var1.field1563 = this.field1563;
        var1.field1564 = this.field1564;
        var1.field1566 = this.field1566;
        var1.field1567 = this.field1567;
        var1.field1568 = this.field1568;
        var1.field1569 = this.field1569;
        var1.field1570 = this.field1570;
        var1.field1554 = this.field1554;
        var1.field1572 = this.field1572;
        var1.field1573 = this.field1573;
        var1.field1575 = this.field1575;
        var1.field1574 = this.field1574;
        var1.field1581 = this.field1581;
        var1.field1578 = this.field1578;
        return var1;
    }

    @ObfuscatedName("ds.l([[IIIIZI)Lds;")
    public class122 method2519(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2532();
        int var7 = this.field1576 + arg1;
        int var8 = this.field1565 + arg1;
        int var9 = this.field1555 + arg3;
        int var10 = this.field1583 + arg3;
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
            var15.field1559 = this.field1559;
            var15.field1552 = this.field1552;
            var15.field1556 = this.field1556;
            var15.field1577 = this.field1577;
            var15.field1553 = this.field1553;
            var15.field1550 = this.field1550;
            var15.field1584 = this.field1584;
            var15.field1557 = this.field1557;
            var15.field1558 = this.field1558;
            var15.field1560 = this.field1560;
            var15.field1588 = this.field1588;
            var15.field1561 = this.field1561;
            var15.field1562 = this.field1562;
            var15.field1563 = this.field1563;
            var15.field1564 = this.field1564;
            var15.field1566 = this.field1566;
            var15.field1567 = this.field1567;
            var15.field1568 = this.field1568;
            var15.field1569 = this.field1569;
            var15.field1570 = this.field1570;
            var15.field1554 = this.field1554;
            var15.field1572 = this.field1572;
            var15.field1573 = this.field1573;
            var15.field1581 = this.field1581;
            var15.field1578 = this.field1578;
            var15.field1551 = new int[var15.field1559];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1559; var16++) {
                int var17 = this.field1577[var16] + arg1;
                int var18 = this.field1553[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1551[var16] = this.field1551[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1559; var26++) {
                int var27 = (-this.field1551[var26] << 16) / this.field1874;
                if (var27 < arg5) {
                    int var28 = this.field1577[var26] + arg1;
                    int var29 = this.field1553[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1551[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1551[var26];
                }
            }
        }
        var15.method2531();
        return var15;
    }

    @ObfuscatedName("ds.b()V")
    public void method2520() {
        int var10002;
        if (this.field1570 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1559; var3++) {
                int var4 = this.field1570[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1572 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1572[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1559) {
                int var7 = this.field1570[var6];
                this.field1572[var7][var1[var7]++] = var6++;
            }
            this.field1570 = null;
        }
        if (this.field1554 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1552; var10++) {
            int var11 = this.field1554[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1573 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1573[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1552) {
            int var14 = this.field1554[var13];
            this.field1573[var14][var8[var14]++] = var13++;
        }
        this.field1554 = null;
    }

    @ObfuscatedName("ds.i()V")
    public void method2521() {
        for (int var1 = 0; var1 < this.field1559; var1++) {
            int var2 = this.field1577[var1];
            this.field1577[var1] = this.field1553[var1];
            this.field1553[var1] = -var2;
        }
        this.method2531();
    }

    @ObfuscatedName("ds.u()V")
    public void method2540() {
        for (int var1 = 0; var1 < this.field1559; var1++) {
            this.field1577[var1] = -this.field1577[var1];
            this.field1553[var1] = -this.field1553[var1];
        }
        this.method2531();
    }

    @ObfuscatedName("ds.x()V")
    public void method2523() {
        for (int var1 = 0; var1 < this.field1559; var1++) {
            int var2 = this.field1553[var1];
            this.field1553[var1] = this.field1577[var1];
            this.field1577[var1] = -var2;
        }
        this.method2531();
    }

    @ObfuscatedName("ds.r(I)V")
    public void method2524(int arg0) {
        int var2 = field1571[arg0];
        int var3 = field1589[arg0];
        for (int var4 = 0; var4 < this.field1559; var4++) {
            int var5 = this.field1577[var4] * var3 + this.field1553[var4] * var2 >> 16;
            this.field1553[var4] = this.field1553[var4] * var3 - this.field1577[var4] * var2 >> 16;
            this.field1577[var4] = var5;
        }
        this.method2531();
    }

    @ObfuscatedName("ds.v(III)V")
    public void method2525(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1559; var4++) {
            this.field1577[var4] += arg0;
            this.field1551[var4] += arg1;
            this.field1553[var4] += arg2;
        }
        this.method2531();
    }

    @ObfuscatedName("ds.y(SS)V")
    public void method2526(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1552; var3++) {
            if (this.field1562[var3] == arg0) {
                this.field1562[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ds.g(SS)V")
    public void method2527(short arg0, short arg1) {
        if (this.field1563 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1552; var3++) {
            if (this.field1563[var3] == arg0) {
                this.field1563[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ds.a()V")
    public void method2528() {
        for (int var1 = 0; var1 < this.field1559; var1++) {
            this.field1553[var1] = -this.field1553[var1];
        }
        for (int var2 = 0; var2 < this.field1552; var2++) {
            int var3 = this.field1550[var2];
            this.field1550[var2] = this.field1557[var2];
            this.field1557[var2] = var3;
        }
        this.method2531();
    }

    @ObfuscatedName("ds.j(III)V")
    public void method2529(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1559; var4++) {
            this.field1577[var4] = this.field1577[var4] * arg0 / 128;
            this.field1551[var4] = this.field1551[var4] * arg1 / 128;
            this.field1553[var4] = this.field1553[var4] * arg2 / 128;
        }
        this.method2531();
    }

    @ObfuscatedName("ds.o()V")
    public void method2530() {
        if (this.field1575 != null) {
            return;
        }
        this.field1575 = new class130[this.field1559];
        for (int var1 = 0; var1 < this.field1559; var1++) {
            this.field1575[var1] = new class130();
        }
        for (int var2 = 0; var2 < this.field1552; var2++) {
            int var3 = this.field1550[var2];
            int var4 = this.field1584[var2];
            int var5 = this.field1557[var2];
            int var6 = this.field1577[var4] - this.field1577[var3];
            int var7 = this.field1551[var4] - this.field1551[var3];
            int var8 = this.field1553[var4] - this.field1553[var3];
            int var9 = this.field1577[var5] - this.field1577[var3];
            int var10 = this.field1551[var5] - this.field1551[var3];
            int var11 = this.field1553[var5] - this.field1553[var3];
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
            if (this.field1558 == null) {
                var19 = 0;
            } else {
                var19 = this.field1558[var2];
            }
            if (var19 == 0) {
                class130 var20 = this.field1575[var3];
                var20.field1760 += var16;
                var20.field1761 += var17;
                var20.field1759 += var18;
                var20.field1762++;
                class130 var21 = this.field1575[var4];
                var21.field1760 += var16;
                var21.field1761 += var17;
                var21.field1759 += var18;
                var21.field1762++;
                class130 var22 = this.field1575[var5];
                var22.field1760 += var16;
                var22.field1761 += var17;
                var22.field1759 += var18;
                var22.field1762++;
            } else if (var19 == 1) {
                if (this.field1574 == null) {
                    this.field1574 = new class138[this.field1552];
                }
                class138 var23 = this.field1574[var2] = new class138();
                var23.field1890 = var16;
                var23.field1891 = var17;
                var23.field1889 = var18;
            }
        }
    }

    @ObfuscatedName("ds.d()V")
    public void method2531() {
        this.field1575 = null;
        this.field1582 = null;
        this.field1574 = null;
        this.field1579 = false;
    }

    @ObfuscatedName("ds.s()V")
    public void method2532() {
        if (this.field1579) {
            return;
        }
        this.field1874 = 0;
        this.field1580 = 0;
        this.field1576 = 999999;
        this.field1565 = -999999;
        this.field1583 = -99999;
        this.field1555 = 99999;
        for (int var1 = 0; var1 < this.field1559; var1++) {
            int var2 = this.field1577[var1];
            int var3 = this.field1551[var1];
            int var4 = this.field1553[var1];
            if (var2 < this.field1576) {
                this.field1576 = var2;
            }
            if (var2 > this.field1565) {
                this.field1565 = var2;
            }
            if (var4 < this.field1555) {
                this.field1555 = var4;
            }
            if (var4 > this.field1583) {
                this.field1583 = var4;
            }
            if (-var3 > this.field1874) {
                this.field1874 = -var3;
            }
            if (var3 > this.field1580) {
                this.field1580 = var3;
            }
        }
        this.field1579 = true;
    }

    @ObfuscatedName("ds.z(Lds;Lds;IIIZ)V")
    public static void method2533(class122 arg0, class122 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2532();
        arg0.method2530();
        arg1.method2532();
        arg1.method2530();
        field1587++;
        int var6 = 0;
        int[] var7 = arg1.field1577;
        int var8 = arg1.field1559;
        for (int var9 = 0; var9 < arg0.field1559; var9++) {
            class130 var10 = arg0.field1575[var9];
            if (var10.field1762 != 0) {
                int var11 = arg0.field1551[var9] - arg3;
                if (var11 <= arg1.field1580) {
                    int var12 = arg0.field1577[var9] - arg2;
                    if (var12 >= arg1.field1576 && var12 <= arg1.field1565) {
                        int var13 = arg0.field1553[var9] - arg4;
                        if (var13 >= arg1.field1555 && var13 <= arg1.field1583) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class130 var15 = arg1.field1575[var14];
                                if (var7[var14] == var12 && arg1.field1553[var14] == var13 && arg1.field1551[var14] == var11 && var15.field1762 != 0) {
                                    if (arg0.field1582 == null) {
                                        arg0.field1582 = new class130[arg0.field1559];
                                    }
                                    if (arg1.field1582 == null) {
                                        arg1.field1582 = new class130[var8];
                                    }
                                    class130 var16 = arg0.field1582[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1582[var9] = new class130(var10);
                                    }
                                    class130 var17 = arg1.field1582[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1582[var14] = new class130(var15);
                                    }
                                    var16.field1760 += var15.field1760;
                                    var16.field1761 += var15.field1761;
                                    var16.field1759 += var15.field1759;
                                    var16.field1762 += var15.field1762;
                                    var17.field1760 += var10.field1760;
                                    var17.field1761 += var10.field1761;
                                    var17.field1759 += var10.field1759;
                                    var17.field1762 += var10.field1762;
                                    var6++;
                                    field1585[var9] = field1587;
                                    field1586[var14] = field1587;
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
        for (int var18 = 0; var18 < arg0.field1552; var18++) {
            if (field1585[arg0.field1550[var18]] == field1587 && field1585[arg0.field1584[var18]] == field1587 && field1585[arg0.field1557[var18]] == field1587) {
                if (arg0.field1558 == null) {
                    arg0.field1558 = new byte[arg0.field1552];
                }
                arg0.field1558[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1552; var19++) {
            if (field1586[arg1.field1550[var19]] == field1587 && field1586[arg1.field1584[var19]] == field1587 && field1586[arg1.field1557[var19]] == field1587) {
                if (arg1.field1558 == null) {
                    arg1.field1558 = new byte[arg1.field1552];
                }
                arg1.field1558[var19] = 2;
            }
        }
    }

    @ObfuscatedName("ds.al(IIIII)Ldm;")
    public final class128 method2545(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2530();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class128 var8 = new class128();
        var8.field1698 = new int[this.field1552];
        var8.field1685 = new int[this.field1552];
        var8.field1686 = new int[this.field1552];
        if (this.field1556 > 0 && this.field1561 != null) {
            int[] var9 = new int[this.field1556];
            for (int var10 = 0; var10 < this.field1552; var10++) {
                if (this.field1561[var10] != -1) {
                    var9[this.field1561[var10] & 0xFF]++;
                }
            }
            var8.field1692 = 0;
            for (int var11 = 0; var11 < this.field1556; var11++) {
                if (var9[var11] > 0 && this.field1566[var11] == 0) {
                    var8.field1692++;
                }
            }
            var8.field1693 = new int[var8.field1692];
            var8.field1694 = new int[var8.field1692];
            var8.field1695 = new int[var8.field1692];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1556; var13++) {
                if (var9[var13] > 0 && this.field1566[var13] == 0) {
                    var8.field1693[var12] = this.field1567[var13] & 0xFFFF;
                    var8.field1694[var12] = this.field1568[var13] & 0xFFFF;
                    var8.field1695[var12] = this.field1569[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1689 = new byte[this.field1552];
            for (int var14 = 0; var14 < this.field1552; var14++) {
                if (this.field1561[var14] == -1) {
                    var8.field1689[var14] = -1;
                } else {
                    var8.field1689[var14] = (byte) var9[this.field1561[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1552; var15++) {
            byte var16;
            if (this.field1558 == null) {
                var16 = 0;
            } else {
                var16 = this.field1558[var15];
            }
            byte var17;
            if (this.field1588 == null) {
                var17 = 0;
            } else {
                var17 = this.field1588[var15];
            }
            short var18;
            if (this.field1563 == null) {
                var18 = -1;
            } else {
                var18 = this.field1563[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1562[var15] & 0xFFFF;
                    class130 var20;
                    if (this.field1582 == null || this.field1582[this.field1550[var15]] == null) {
                        var20 = this.field1575[this.field1550[var15]];
                    } else {
                        var20 = this.field1582[this.field1550[var15]];
                    }
                    int var21 = (var20.field1759 * arg4 + var20.field1761 * arg3 + var20.field1760 * arg2) / (var20.field1762 * var7) + arg0;
                    var8.field1698[var15] = method2535(var19, var21);
                    class130 var22;
                    if (this.field1582 == null || this.field1582[this.field1584[var15]] == null) {
                        var22 = this.field1575[this.field1584[var15]];
                    } else {
                        var22 = this.field1582[this.field1584[var15]];
                    }
                    int var23 = (var22.field1759 * arg4 + var22.field1761 * arg3 + var22.field1760 * arg2) / (var22.field1762 * var7) + arg0;
                    var8.field1685[var15] = method2535(var19, var23);
                    class130 var24;
                    if (this.field1582 == null || this.field1582[this.field1557[var15]] == null) {
                        var24 = this.field1575[this.field1557[var15]];
                    } else {
                        var24 = this.field1582[this.field1557[var15]];
                    }
                    int var25 = (var24.field1759 * arg4 + var24.field1761 * arg3 + var24.field1760 * arg2) / (var24.field1762 * var7) + arg0;
                    var8.field1686[var15] = method2535(var19, var25);
                } else if (var16 == 1) {
                    class138 var26 = this.field1574[var15];
                    int var27 = (var26.field1889 * arg4 + var26.field1891 * arg3 + var26.field1890 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1698[var15] = method2535(this.field1562[var15] & 0xFFFF, var27);
                    var8.field1686[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1698[var15] = 128;
                    var8.field1686[var15] = -1;
                } else {
                    var8.field1686[var15] = -2;
                }
            } else if (var16 == 0) {
                class130 var28;
                if (this.field1582 == null || this.field1582[this.field1550[var15]] == null) {
                    var28 = this.field1575[this.field1550[var15]];
                } else {
                    var28 = this.field1582[this.field1550[var15]];
                }
                int var29 = (var28.field1759 * arg4 + var28.field1761 * arg3 + var28.field1760 * arg2) / (var28.field1762 * var7) + arg0;
                var8.field1698[var15] = method2561(var29);
                class130 var30;
                if (this.field1582 == null || this.field1582[this.field1584[var15]] == null) {
                    var30 = this.field1575[this.field1584[var15]];
                } else {
                    var30 = this.field1582[this.field1584[var15]];
                }
                int var31 = (var30.field1759 * arg4 + var30.field1761 * arg3 + var30.field1760 * arg2) / (var30.field1762 * var7) + arg0;
                var8.field1685[var15] = method2561(var31);
                class130 var32;
                if (this.field1582 == null || this.field1582[this.field1557[var15]] == null) {
                    var32 = this.field1575[this.field1557[var15]];
                } else {
                    var32 = this.field1582[this.field1557[var15]];
                }
                int var33 = (var32.field1759 * arg4 + var32.field1761 * arg3 + var32.field1760 * arg2) / (var32.field1762 * var7) + arg0;
                var8.field1686[var15] = method2561(var33);
            } else if (var16 == 1) {
                class138 var34 = this.field1574[var15];
                int var35 = (var34.field1889 * arg4 + var34.field1891 * arg3 + var34.field1890 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1698[var15] = method2561(var35);
                var8.field1686[var15] = -1;
            } else {
                var8.field1686[var15] = -2;
            }
        }
        this.method2520();
        var8.field1676 = this.field1559;
        var8.field1677 = this.field1577;
        var8.field1678 = this.field1551;
        var8.field1679 = this.field1553;
        var8.field1680 = this.field1552;
        var8.field1681 = this.field1550;
        var8.field1682 = this.field1584;
        var8.field1683 = this.field1557;
        var8.field1713 = this.field1560;
        var8.field1688 = this.field1588;
        var8.field1691 = this.field1564;
        var8.field1696 = this.field1572;
        var8.field1710 = this.field1573;
        var8.field1690 = this.field1563;
        return var8;
    }

    @ObfuscatedName("ds.av(II)I")
    public static final int method2535(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("ds.as(I)I")
    public static final int method2561(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
