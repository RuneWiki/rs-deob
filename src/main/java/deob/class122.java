package deob;

@ObfuscatedName("ds")
public class class122 extends class136 {

    @ObfuscatedName("ds.c")
    public int field1531 = 0;

    @ObfuscatedName("ds.x")
    public int[] field1518;

    @ObfuscatedName("ds.t")
    public int[] field1519;

    @ObfuscatedName("ds.g")
    public int[] field1520;

    @ObfuscatedName("ds.l")
    public int field1551 = 0;

    @ObfuscatedName("ds.u")
    public int[] field1522;

    @ObfuscatedName("ds.j")
    public int[] field1523;

    @ObfuscatedName("ds.v")
    public int[] field1517;

    @ObfuscatedName("ds.d")
    public byte[] field1525;

    @ObfuscatedName("ds.z")
    public byte[] field1526;

    @ObfuscatedName("ds.n")
    public byte[] field1538;

    @ObfuscatedName("ds.h")
    public byte[] field1537;

    @ObfuscatedName("ds.f")
    public short[] field1529;

    @ObfuscatedName("ds.s")
    public short[] field1524;

    @ObfuscatedName("ds.p")
    public byte field1546 = 0;

    @ObfuscatedName("ds.e")
    public int field1550;

    @ObfuscatedName("ds.i")
    public byte[] field1530;

    @ObfuscatedName("ds.q")
    public short[] field1534;

    @ObfuscatedName("ds.y")
    public short[] field1535;

    @ObfuscatedName("ds.r")
    public short[] field1536;

    @ObfuscatedName("ds.k")
    public int[] field1528;

    @ObfuscatedName("ds.w")
    public int[] field1533;

    @ObfuscatedName("ds.m")
    public int[][] field1539;

    @ObfuscatedName("ds.o")
    public int[][] field1540;

    @ObfuscatedName("ds.a")
    public class138[] field1541;

    @ObfuscatedName("ds.b")
    public class130[] field1542;

    @ObfuscatedName("ds.ag")
    public class130[] field1543;

    @ObfuscatedName("ds.at")
    public short field1544;

    @ObfuscatedName("ds.ao")
    public short field1545;

    @ObfuscatedName("ds.av")
    public boolean field1548 = false;

    @ObfuscatedName("ds.an")
    public int field1547;

    @ObfuscatedName("ds.al")
    public int field1532;

    @ObfuscatedName("ds.as")
    public int field1527;

    @ObfuscatedName("ds.ad")
    public int field1549;

    @ObfuscatedName("ds.ap")
    public int field1521;

    @ObfuscatedName("ds.ax")
    public static int[] field1552 = new int[10000];

    @ObfuscatedName("ds.aj")
    public static int[] field1553 = new int[10000];

    @ObfuscatedName("ds.ab")
    public static int field1554 = 0;

    @ObfuscatedName("ds.af")
    public static int[] field1555 = class131.field1752;

    @ObfuscatedName("ds.ak")
    public static int[] field1556 = class131.field1737;

    public class122() {
    }

    @ObfuscatedName("ds.c(Lhz;II)Lds;")
    public static class122 method2525(class234 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3825(arg1, arg2);
        return var3 == null ? null : new class122(var3);
    }

    public class122(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2526(arg0);
        } else {
            this.method2576(arg0);
        }
    }

    @ObfuscatedName("ds.x([B)V")
    public void method2526(byte[] arg0) {
        class300 var2 = new class300(arg0);
        class300 var3 = new class300(arg0);
        class300 var4 = new class300(arg0);
        class300 var5 = new class300(arg0);
        class300 var6 = new class300(arg0);
        class300 var7 = new class300(arg0);
        class300 var8 = new class300(arg0);
        var2.field3696 = arg0.length - 23;
        int var9 = var2.method5304();
        int var10 = var2.method5304();
        int var11 = var2.method5103();
        int var12 = var2.method5103();
        int var13 = var2.method5103();
        int var14 = var2.method5103();
        int var15 = var2.method5103();
        int var16 = var2.method5103();
        int var17 = var2.method5103();
        int var18 = var2.method5304();
        int var19 = var2.method5304();
        int var20 = var2.method5304();
        int var21 = var2.method5304();
        int var22 = var2.method5304();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1530 = new byte[var11];
            var2.field3696 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1530[var26] = var2.method5168();
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
        this.field1531 = var9;
        this.field1551 = var10;
        this.field1550 = var11;
        this.field1518 = new int[var9];
        this.field1519 = new int[var9];
        this.field1520 = new int[var9];
        this.field1522 = new int[var10];
        this.field1523 = new int[var10];
        this.field1517 = new int[var10];
        if (var17 == 1) {
            this.field1528 = new int[var9];
        }
        if (var12 == 1) {
            this.field1525 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1526 = new byte[var10];
        } else {
            this.field1546 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1538 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1533 = new int[var10];
        }
        if (var16 == 1) {
            this.field1524 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1537 = new byte[var10];
        }
        this.field1529 = new short[var10];
        if (var11 > 0) {
            this.field1534 = new short[var11];
            this.field1535 = new short[var11];
            this.field1536 = new short[var11];
        }
        var2.field3696 = var11;
        var3.field3696 = var44;
        var4.field3696 = var46;
        var5.field3696 = var48;
        var6.field3696 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method5103();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method5116();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method5116();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method5116();
            }
            this.field1518[var67] = var64 + var69;
            this.field1519[var67] = var65 + var70;
            this.field1520[var67] = var66 + var71;
            var64 = this.field1518[var67];
            var65 = this.field1519[var67];
            var66 = this.field1520[var67];
            if (var17 == 1) {
                this.field1528[var67] = var6.method5103();
            }
        }
        var2.field3696 = var42;
        var3.field3696 = var31;
        var4.field3696 = var34;
        var5.field3696 = var37;
        var6.field3696 = var35;
        var7.field3696 = var40;
        var8.field3696 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1529[var72] = (short) var2.method5304();
            if (var12 == 1) {
                this.field1525[var72] = var3.method5168();
            }
            if (var13 == 255) {
                this.field1526[var72] = var4.method5168();
            }
            if (var14 == 1) {
                this.field1538[var72] = var5.method5168();
            }
            if (var15 == 1) {
                this.field1533[var72] = var6.method5103();
            }
            if (var16 == 1) {
                this.field1524[var72] = (short) (var7.method5304() - 1);
            }
            if (this.field1537 != null && this.field1524[var72] != -1) {
                this.field1537[var72] = (byte) (var8.method5103() - 1);
            }
        }
        var2.field3696 = var33;
        var3.field3696 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method5103();
            if (var78 == 1) {
                var73 = var2.method5116() + var76;
                var74 = var2.method5116() + var73;
                var75 = var2.method5116() + var74;
                var76 = var75;
                this.field1522[var77] = var73;
                this.field1523[var77] = var74;
                this.field1517[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method5116() + var76;
                var76 = var75;
                this.field1522[var77] = var73;
                this.field1523[var77] = var74;
                this.field1517[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method5116() + var76;
                var76 = var75;
                this.field1522[var77] = var73;
                this.field1523[var77] = var74;
                this.field1517[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method5116() + var76;
                var76 = var75;
                this.field1522[var77] = var73;
                this.field1523[var77] = var81;
                this.field1517[var77] = var75;
            }
        }
        var2.field3696 = var50;
        var3.field3696 = var52;
        var4.field3696 = var54;
        var5.field3696 = var56;
        var6.field3696 = var58;
        var7.field3696 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1530[var82] & 0xFF;
            if (var83 == 0) {
                this.field1534[var82] = (short) var2.method5304();
                this.field1535[var82] = (short) var2.method5304();
                this.field1536[var82] = (short) var2.method5304();
            }
        }
        var2.field3696 = var62;
        int var84 = var2.method5103();
        if (var84 == 0) {
            return;
        }
        new class135();
        var2.method5304();
        var2.method5304();
        var2.method5304();
        var2.method5208();
    }

    @ObfuscatedName("ds.t([B)V")
    public void method2576(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class300 var4 = new class300(arg0);
        class300 var5 = new class300(arg0);
        class300 var6 = new class300(arg0);
        class300 var7 = new class300(arg0);
        class300 var8 = new class300(arg0);
        var4.field3696 = arg0.length - 18;
        int var9 = var4.method5304();
        int var10 = var4.method5304();
        int var11 = var4.method5103();
        int var12 = var4.method5103();
        int var13 = var4.method5103();
        int var14 = var4.method5103();
        int var15 = var4.method5103();
        int var16 = var4.method5103();
        int var17 = var4.method5304();
        int var18 = var4.method5304();
        int var19 = var4.method5304();
        int var20 = var4.method5304();
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
        this.field1531 = var9;
        this.field1551 = var10;
        this.field1550 = var11;
        this.field1518 = new int[var9];
        this.field1519 = new int[var9];
        this.field1520 = new int[var9];
        this.field1522 = new int[var10];
        this.field1523 = new int[var10];
        this.field1517 = new int[var10];
        if (var11 > 0) {
            this.field1530 = new byte[var11];
            this.field1534 = new short[var11];
            this.field1535 = new short[var11];
            this.field1536 = new short[var11];
        }
        if (var16 == 1) {
            this.field1528 = new int[var9];
        }
        if (var12 == 1) {
            this.field1525 = new byte[var10];
            this.field1537 = new byte[var10];
            this.field1524 = new short[var10];
        }
        if (var13 == 255) {
            this.field1526 = new byte[var10];
        } else {
            this.field1546 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1538 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1533 = new int[var10];
        }
        this.field1529 = new short[var10];
        var4.field3696 = var21;
        var5.field3696 = var36;
        var6.field3696 = var38;
        var7.field3696 = var40;
        var8.field3696 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method5103();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method5116();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method5116();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method5116();
            }
            this.field1518[var46] = var43 + var48;
            this.field1519[var46] = var44 + var49;
            this.field1520[var46] = var45 + var50;
            var43 = this.field1518[var46];
            var44 = this.field1519[var46];
            var45 = this.field1520[var46];
            if (var16 == 1) {
                this.field1528[var46] = var8.method5103();
            }
        }
        var4.field3696 = var32;
        var5.field3696 = var28;
        var6.field3696 = var26;
        var7.field3696 = var30;
        var8.field3696 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1529[var51] = (short) var4.method5304();
            if (var12 == 1) {
                int var52 = var5.method5103();
                if ((var52 & 0x1) == 1) {
                    this.field1525[var51] = 1;
                    var2 = true;
                } else {
                    this.field1525[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1537[var51] = (byte) (var52 >> 2);
                    this.field1524[var51] = this.field1529[var51];
                    this.field1529[var51] = 127;
                    if (this.field1524[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1537[var51] = -1;
                    this.field1524[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1526[var51] = var6.method5168();
            }
            if (var14 == 1) {
                this.field1538[var51] = var7.method5168();
            }
            if (var15 == 1) {
                this.field1533[var51] = var8.method5103();
            }
        }
        var4.field3696 = var25;
        var5.field3696 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method5103();
            if (var58 == 1) {
                var53 = var4.method5116() + var56;
                var54 = var4.method5116() + var53;
                var55 = var4.method5116() + var54;
                var56 = var55;
                this.field1522[var57] = var53;
                this.field1523[var57] = var54;
                this.field1517[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method5116() + var56;
                var56 = var55;
                this.field1522[var57] = var53;
                this.field1523[var57] = var54;
                this.field1517[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method5116() + var56;
                var56 = var55;
                this.field1522[var57] = var53;
                this.field1523[var57] = var54;
                this.field1517[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method5116() + var56;
                var56 = var55;
                this.field1522[var57] = var53;
                this.field1523[var57] = var61;
                this.field1517[var57] = var55;
            }
        }
        var4.field3696 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1530[var62] = 0;
            this.field1534[var62] = (short) var4.method5304();
            this.field1535[var62] = (short) var4.method5304();
            this.field1536[var62] = (short) var4.method5304();
        }
        if (this.field1537 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1537[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1534[var65] & 0xFFFF) == this.field1522[var64] && (this.field1535[var65] & 0xFFFF) == this.field1523[var64] && (this.field1536[var65] & 0xFFFF) == this.field1517[var64]) {
                        this.field1537[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1537 = null;
            }
        }
        if (!var3) {
            this.field1524 = null;
        }
        if (!var2) {
            this.field1525 = null;
        }
    }

    public class122(class122[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1531 = 0;
        this.field1551 = 0;
        this.field1550 = 0;
        this.field1546 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class122 var10 = arg0[var9];
            if (var10 != null) {
                this.field1531 += var10.field1531;
                this.field1551 += var10.field1551;
                this.field1550 += var10.field1550;
                if (var10.field1526 == null) {
                    if (this.field1546 == -1) {
                        this.field1546 = var10.field1546;
                    }
                    if (this.field1546 != var10.field1546) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1525 != null;
                var5 |= var10.field1538 != null;
                var6 |= var10.field1533 != null;
                var7 |= var10.field1524 != null;
                var8 |= var10.field1537 != null;
            }
        }
        this.field1518 = new int[this.field1531];
        this.field1519 = new int[this.field1531];
        this.field1520 = new int[this.field1531];
        this.field1528 = new int[this.field1531];
        this.field1522 = new int[this.field1551];
        this.field1523 = new int[this.field1551];
        this.field1517 = new int[this.field1551];
        if (var3) {
            this.field1525 = new byte[this.field1551];
        }
        if (var4) {
            this.field1526 = new byte[this.field1551];
        }
        if (var5) {
            this.field1538 = new byte[this.field1551];
        }
        if (var6) {
            this.field1533 = new int[this.field1551];
        }
        if (var7) {
            this.field1524 = new short[this.field1551];
        }
        if (var8) {
            this.field1537 = new byte[this.field1551];
        }
        this.field1529 = new short[this.field1551];
        if (this.field1550 > 0) {
            this.field1530 = new byte[this.field1550];
            this.field1534 = new short[this.field1550];
            this.field1535 = new short[this.field1550];
            this.field1536 = new short[this.field1550];
        }
        this.field1531 = 0;
        this.field1551 = 0;
        this.field1550 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class122 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1551; var13++) {
                    if (var3 && var12.field1525 != null) {
                        this.field1525[this.field1551] = var12.field1525[var13];
                    }
                    if (var4) {
                        if (var12.field1526 == null) {
                            this.field1526[this.field1551] = var12.field1546;
                        } else {
                            this.field1526[this.field1551] = var12.field1526[var13];
                        }
                    }
                    if (var5 && var12.field1538 != null) {
                        this.field1538[this.field1551] = var12.field1538[var13];
                    }
                    if (var6 && var12.field1533 != null) {
                        this.field1533[this.field1551] = var12.field1533[var13];
                    }
                    if (var7) {
                        if (var12.field1524 == null) {
                            this.field1524[this.field1551] = -1;
                        } else {
                            this.field1524[this.field1551] = var12.field1524[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1537 == null || var12.field1537[var13] == -1) {
                            this.field1537[this.field1551] = -1;
                        } else {
                            this.field1537[this.field1551] = (byte) (var12.field1537[var13] + this.field1550);
                        }
                    }
                    this.field1529[this.field1551] = var12.field1529[var13];
                    this.field1522[this.field1551] = this.method2528(var12, var12.field1522[var13]);
                    this.field1523[this.field1551] = this.method2528(var12, var12.field1523[var13]);
                    this.field1517[this.field1551] = this.method2528(var12, var12.field1517[var13]);
                    this.field1551++;
                }
                for (int var14 = 0; var14 < var12.field1550; var14++) {
                    byte var15 = this.field1530[this.field1550] = var12.field1530[var14];
                    if (var15 == 0) {
                        this.field1534[this.field1550] = (short) this.method2528(var12, var12.field1534[var14]);
                        this.field1535[this.field1550] = (short) this.method2528(var12, var12.field1535[var14]);
                        this.field1536[this.field1550] = (short) this.method2528(var12, var12.field1536[var14]);
                    }
                    this.field1550++;
                }
            }
        }
    }

    @ObfuscatedName("ds.g(Lds;I)I")
    public final int method2528(class122 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1518[arg1];
        int var5 = arg0.field1519[arg1];
        int var6 = arg0.field1520[arg1];
        for (int var7 = 0; var7 < this.field1531; var7++) {
            if (this.field1518[var7] == var4 && this.field1519[var7] == var5 && this.field1520[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1518[this.field1531] = var4;
            this.field1519[this.field1531] = var5;
            this.field1520[this.field1531] = var6;
            if (arg0.field1528 != null) {
                this.field1528[this.field1531] = arg0.field1528[arg1];
            }
            var3 = this.field1531++;
        }
        return var3;
    }

    public class122(class122 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1531 = arg0.field1531;
        this.field1551 = arg0.field1551;
        this.field1550 = arg0.field1550;
        if (arg1) {
            this.field1518 = arg0.field1518;
            this.field1519 = arg0.field1519;
            this.field1520 = arg0.field1520;
        } else {
            this.field1518 = new int[this.field1531];
            this.field1519 = new int[this.field1531];
            this.field1520 = new int[this.field1531];
            for (int var6 = 0; var6 < this.field1531; var6++) {
                this.field1518[var6] = arg0.field1518[var6];
                this.field1519[var6] = arg0.field1519[var6];
                this.field1520[var6] = arg0.field1520[var6];
            }
        }
        if (arg2) {
            this.field1529 = arg0.field1529;
        } else {
            this.field1529 = new short[this.field1551];
            for (int var7 = 0; var7 < this.field1551; var7++) {
                this.field1529[var7] = arg0.field1529[var7];
            }
        }
        if (arg3 || arg0.field1524 == null) {
            this.field1524 = arg0.field1524;
        } else {
            this.field1524 = new short[this.field1551];
            for (int var8 = 0; var8 < this.field1551; var8++) {
                this.field1524[var8] = arg0.field1524[var8];
            }
        }
        if (arg4) {
            this.field1538 = arg0.field1538;
        } else {
            this.field1538 = new byte[this.field1551];
            if (arg0.field1538 == null) {
                for (int var9 = 0; var9 < this.field1551; var9++) {
                    this.field1538[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1551; var10++) {
                    this.field1538[var10] = arg0.field1538[var10];
                }
            }
        }
        this.field1522 = arg0.field1522;
        this.field1523 = arg0.field1523;
        this.field1517 = arg0.field1517;
        this.field1525 = arg0.field1525;
        this.field1526 = arg0.field1526;
        this.field1537 = arg0.field1537;
        this.field1546 = arg0.field1546;
        this.field1530 = arg0.field1530;
        this.field1534 = arg0.field1534;
        this.field1535 = arg0.field1535;
        this.field1536 = arg0.field1536;
        this.field1528 = arg0.field1528;
        this.field1533 = arg0.field1533;
        this.field1539 = arg0.field1539;
        this.field1540 = arg0.field1540;
        this.field1542 = arg0.field1542;
        this.field1541 = arg0.field1541;
        this.field1543 = arg0.field1543;
        this.field1544 = arg0.field1544;
        this.field1545 = arg0.field1545;
    }

    @ObfuscatedName("ds.l()Lds;")
    public class122 method2529() {
        class122 var1 = new class122();
        if (this.field1525 != null) {
            var1.field1525 = new byte[this.field1551];
            for (int var2 = 0; var2 < this.field1551; var2++) {
                var1.field1525[var2] = this.field1525[var2];
            }
        }
        var1.field1531 = this.field1531;
        var1.field1551 = this.field1551;
        var1.field1550 = this.field1550;
        var1.field1518 = this.field1518;
        var1.field1519 = this.field1519;
        var1.field1520 = this.field1520;
        var1.field1522 = this.field1522;
        var1.field1523 = this.field1523;
        var1.field1517 = this.field1517;
        var1.field1526 = this.field1526;
        var1.field1538 = this.field1538;
        var1.field1537 = this.field1537;
        var1.field1529 = this.field1529;
        var1.field1524 = this.field1524;
        var1.field1546 = this.field1546;
        var1.field1530 = this.field1530;
        var1.field1534 = this.field1534;
        var1.field1535 = this.field1535;
        var1.field1536 = this.field1536;
        var1.field1528 = this.field1528;
        var1.field1533 = this.field1533;
        var1.field1539 = this.field1539;
        var1.field1540 = this.field1540;
        var1.field1542 = this.field1542;
        var1.field1541 = this.field1541;
        var1.field1544 = this.field1544;
        var1.field1545 = this.field1545;
        return var1;
    }

    @ObfuscatedName("ds.u([[IIIIZI)Lds;")
    public class122 method2527(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2543();
        int var7 = this.field1532 + arg1;
        int var8 = this.field1527 + arg1;
        int var9 = this.field1521 + arg3;
        int var10 = this.field1549 + arg3;
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
            var15.field1531 = this.field1531;
            var15.field1551 = this.field1551;
            var15.field1550 = this.field1550;
            var15.field1518 = this.field1518;
            var15.field1520 = this.field1520;
            var15.field1522 = this.field1522;
            var15.field1523 = this.field1523;
            var15.field1517 = this.field1517;
            var15.field1525 = this.field1525;
            var15.field1526 = this.field1526;
            var15.field1538 = this.field1538;
            var15.field1537 = this.field1537;
            var15.field1529 = this.field1529;
            var15.field1524 = this.field1524;
            var15.field1546 = this.field1546;
            var15.field1530 = this.field1530;
            var15.field1534 = this.field1534;
            var15.field1535 = this.field1535;
            var15.field1536 = this.field1536;
            var15.field1528 = this.field1528;
            var15.field1533 = this.field1533;
            var15.field1539 = this.field1539;
            var15.field1540 = this.field1540;
            var15.field1544 = this.field1544;
            var15.field1545 = this.field1545;
            var15.field1519 = new int[var15.field1531];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1531; var16++) {
                int var17 = this.field1518[var16] + arg1;
                int var18 = this.field1520[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1519[var16] = this.field1519[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1531; var26++) {
                int var27 = (-this.field1519[var26] << 16) / this.field1837;
                if (var27 < arg5) {
                    int var28 = this.field1518[var26] + arg1;
                    int var29 = this.field1520[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1519[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1519[var26];
                }
            }
        }
        var15.method2556();
        return var15;
    }

    @ObfuscatedName("ds.j()V")
    public void method2531() {
        int var10002;
        if (this.field1528 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1531; var3++) {
                int var4 = this.field1528[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1539 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1539[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1531) {
                int var7 = this.field1528[var6];
                this.field1539[var7][var1[var7]++] = var6++;
            }
            this.field1528 = null;
        }
        if (this.field1533 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1551; var10++) {
            int var11 = this.field1533[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1540 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1540[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1551) {
            int var14 = this.field1533[var13];
            this.field1540[var14][var8[var14]++] = var13++;
        }
        this.field1533 = null;
    }

    @ObfuscatedName("ds.v()V")
    public void method2532() {
        for (int var1 = 0; var1 < this.field1531; var1++) {
            int var2 = this.field1518[var1];
            this.field1518[var1] = this.field1520[var1];
            this.field1520[var1] = -var2;
        }
        this.method2556();
    }

    @ObfuscatedName("ds.z()V")
    public void method2533() {
        for (int var1 = 0; var1 < this.field1531; var1++) {
            this.field1518[var1] = -this.field1518[var1];
            this.field1520[var1] = -this.field1520[var1];
        }
        this.method2556();
    }

    @ObfuscatedName("ds.s()V")
    public void method2534() {
        for (int var1 = 0; var1 < this.field1531; var1++) {
            int var2 = this.field1520[var1];
            this.field1520[var1] = this.field1518[var1];
            this.field1518[var1] = -var2;
        }
        this.method2556();
    }

    @ObfuscatedName("ds.p(I)V")
    public void method2535(int arg0) {
        int var2 = field1555[arg0];
        int var3 = field1556[arg0];
        for (int var4 = 0; var4 < this.field1531; var4++) {
            int var5 = this.field1520[var4] * var2 + this.field1518[var4] * var3 >> 16;
            this.field1520[var4] = this.field1520[var4] * var3 - this.field1518[var4] * var2 >> 16;
            this.field1518[var4] = var5;
        }
        this.method2556();
    }

    @ObfuscatedName("ds.e(III)V")
    public void method2536(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1531; var4++) {
            this.field1518[var4] += arg0;
            this.field1519[var4] += arg1;
            this.field1520[var4] += arg2;
        }
        this.method2556();
    }

    @ObfuscatedName("ds.i(SS)V")
    public void method2537(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1551; var3++) {
            if (this.field1529[var3] == arg0) {
                this.field1529[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ds.q(SS)V")
    public void method2538(short arg0, short arg1) {
        if (this.field1524 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1551; var3++) {
            if (this.field1524[var3] == arg0) {
                this.field1524[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ds.r()V")
    public void method2570() {
        for (int var1 = 0; var1 < this.field1531; var1++) {
            this.field1520[var1] = -this.field1520[var1];
        }
        for (int var2 = 0; var2 < this.field1551; var2++) {
            int var3 = this.field1522[var2];
            this.field1522[var2] = this.field1517[var2];
            this.field1517[var2] = var3;
        }
        this.method2556();
    }

    @ObfuscatedName("ds.k(III)V")
    public void method2540(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1531; var4++) {
            this.field1518[var4] = this.field1518[var4] * arg0 / 128;
            this.field1519[var4] = this.field1519[var4] * arg1 / 128;
            this.field1520[var4] = this.field1520[var4] * arg2 / 128;
        }
        this.method2556();
    }

    @ObfuscatedName("ds.w()V")
    public void method2569() {
        if (this.field1542 != null) {
            return;
        }
        this.field1542 = new class130[this.field1531];
        for (int var1 = 0; var1 < this.field1531; var1++) {
            this.field1542[var1] = new class130();
        }
        for (int var2 = 0; var2 < this.field1551; var2++) {
            int var3 = this.field1522[var2];
            int var4 = this.field1523[var2];
            int var5 = this.field1517[var2];
            int var6 = this.field1518[var4] - this.field1518[var3];
            int var7 = this.field1519[var4] - this.field1519[var3];
            int var8 = this.field1520[var4] - this.field1520[var3];
            int var9 = this.field1518[var5] - this.field1518[var3];
            int var10 = this.field1519[var5] - this.field1519[var3];
            int var11 = this.field1520[var5] - this.field1520[var3];
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
            if (this.field1525 == null) {
                var19 = 0;
            } else {
                var19 = this.field1525[var2];
            }
            if (var19 == 0) {
                class130 var20 = this.field1542[var3];
                var20.field1722 += var16;
                var20.field1723 += var17;
                var20.field1724 += var18;
                var20.field1725++;
                class130 var21 = this.field1542[var4];
                var21.field1722 += var16;
                var21.field1723 += var17;
                var21.field1724 += var18;
                var21.field1725++;
                class130 var22 = this.field1542[var5];
                var22.field1722 += var16;
                var22.field1723 += var17;
                var22.field1724 += var18;
                var22.field1725++;
            } else if (var19 == 1) {
                if (this.field1541 == null) {
                    this.field1541 = new class138[this.field1551];
                }
                class138 var23 = this.field1541[var2] = new class138();
                var23.field1854 = var16;
                var23.field1855 = var17;
                var23.field1856 = var18;
            }
        }
    }

    @ObfuscatedName("ds.m()V")
    public void method2556() {
        this.field1542 = null;
        this.field1543 = null;
        this.field1541 = null;
        this.field1548 = false;
    }

    @ObfuscatedName("ds.o()V")
    public void method2543() {
        if (this.field1548) {
            return;
        }
        this.field1837 = 0;
        this.field1547 = 0;
        this.field1532 = 999999;
        this.field1527 = -999999;
        this.field1549 = -99999;
        this.field1521 = 99999;
        for (int var1 = 0; var1 < this.field1531; var1++) {
            int var2 = this.field1518[var1];
            int var3 = this.field1519[var1];
            int var4 = this.field1520[var1];
            if (var2 < this.field1532) {
                this.field1532 = var2;
            }
            if (var2 > this.field1527) {
                this.field1527 = var2;
            }
            if (var4 < this.field1521) {
                this.field1521 = var4;
            }
            if (var4 > this.field1549) {
                this.field1549 = var4;
            }
            if (-var3 > this.field1837) {
                this.field1837 = -var3;
            }
            if (var3 > this.field1547) {
                this.field1547 = var3;
            }
        }
        this.field1548 = true;
    }

    @ObfuscatedName("ds.a(Lds;Lds;IIIZ)V")
    public static void method2601(class122 arg0, class122 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2543();
        arg0.method2569();
        arg1.method2543();
        arg1.method2569();
        field1554++;
        int var6 = 0;
        int[] var7 = arg1.field1518;
        int var8 = arg1.field1531;
        for (int var9 = 0; var9 < arg0.field1531; var9++) {
            class130 var10 = arg0.field1542[var9];
            if (var10.field1725 != 0) {
                int var11 = arg0.field1519[var9] - arg3;
                if (var11 <= arg1.field1547) {
                    int var12 = arg0.field1518[var9] - arg2;
                    if (var12 >= arg1.field1532 && var12 <= arg1.field1527) {
                        int var13 = arg0.field1520[var9] - arg4;
                        if (var13 >= arg1.field1521 && var13 <= arg1.field1549) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class130 var15 = arg1.field1542[var14];
                                if (var7[var14] == var12 && arg1.field1520[var14] == var13 && arg1.field1519[var14] == var11 && var15.field1725 != 0) {
                                    if (arg0.field1543 == null) {
                                        arg0.field1543 = new class130[arg0.field1531];
                                    }
                                    if (arg1.field1543 == null) {
                                        arg1.field1543 = new class130[var8];
                                    }
                                    class130 var16 = arg0.field1543[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1543[var9] = new class130(var10);
                                    }
                                    class130 var17 = arg1.field1543[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1543[var14] = new class130(var15);
                                    }
                                    var16.field1722 += var15.field1722;
                                    var16.field1723 += var15.field1723;
                                    var16.field1724 += var15.field1724;
                                    var16.field1725 += var15.field1725;
                                    var17.field1722 += var10.field1722;
                                    var17.field1723 += var10.field1723;
                                    var17.field1724 += var10.field1724;
                                    var17.field1725 += var10.field1725;
                                    var6++;
                                    field1552[var9] = field1554;
                                    field1553[var14] = field1554;
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
        for (int var18 = 0; var18 < arg0.field1551; var18++) {
            if (field1552[arg0.field1522[var18]] == field1554 && field1552[arg0.field1523[var18]] == field1554 && field1552[arg0.field1517[var18]] == field1554) {
                if (arg0.field1525 == null) {
                    arg0.field1525 = new byte[arg0.field1551];
                }
                arg0.field1525[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1551; var19++) {
            if (field1553[arg1.field1522[var19]] == field1554 && field1553[arg1.field1523[var19]] == field1554 && field1553[arg1.field1517[var19]] == field1554) {
                if (arg1.field1525 == null) {
                    arg1.field1525 = new byte[arg1.field1551];
                }
                arg1.field1525[var19] = 2;
            }
        }
    }

    @ObfuscatedName("ds.b(IIIII)Ldr;")
    public final class128 method2545(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2569();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class128 var8 = new class128();
        var8.field1650 = new int[this.field1551];
        var8.field1651 = new int[this.field1551];
        var8.field1652 = new int[this.field1551];
        if (this.field1550 > 0 && this.field1537 != null) {
            int[] var9 = new int[this.field1550];
            for (int var10 = 0; var10 < this.field1551; var10++) {
                if (this.field1537[var10] != -1) {
                    var9[this.field1537[var10] & 0xFF]++;
                }
            }
            var8.field1658 = 0;
            for (int var11 = 0; var11 < this.field1550; var11++) {
                if (var9[var11] > 0 && this.field1530[var11] == 0) {
                    var8.field1658++;
                }
            }
            var8.field1659 = new int[var8.field1658];
            var8.field1660 = new int[var8.field1658];
            var8.field1661 = new int[var8.field1658];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1550; var13++) {
                if (var9[var13] > 0 && this.field1530[var13] == 0) {
                    var8.field1659[var12] = this.field1534[var13] & 0xFFFF;
                    var8.field1660[var12] = this.field1535[var13] & 0xFFFF;
                    var8.field1661[var12] = this.field1536[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1702 = new byte[this.field1551];
            for (int var14 = 0; var14 < this.field1551; var14++) {
                if (this.field1537[var14] == -1) {
                    var8.field1702[var14] = -1;
                } else {
                    var8.field1702[var14] = (byte) var9[this.field1537[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1551; var15++) {
            byte var16;
            if (this.field1525 == null) {
                var16 = 0;
            } else {
                var16 = this.field1525[var15];
            }
            byte var17;
            if (this.field1538 == null) {
                var17 = 0;
            } else {
                var17 = this.field1538[var15];
            }
            short var18;
            if (this.field1524 == null) {
                var18 = -1;
            } else {
                var18 = this.field1524[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1529[var15] & 0xFFFF;
                    class130 var20;
                    if (this.field1543 == null || this.field1543[this.field1522[var15]] == null) {
                        var20 = this.field1542[this.field1522[var15]];
                    } else {
                        var20 = this.field1543[this.field1522[var15]];
                    }
                    int var21 = (var20.field1724 * arg4 + var20.field1723 * arg3 + var20.field1722 * arg2) / (var20.field1725 * var7) + arg0;
                    var8.field1650[var15] = method2546(var19, var21);
                    class130 var22;
                    if (this.field1543 == null || this.field1543[this.field1523[var15]] == null) {
                        var22 = this.field1542[this.field1523[var15]];
                    } else {
                        var22 = this.field1543[this.field1523[var15]];
                    }
                    int var23 = (var22.field1724 * arg4 + var22.field1723 * arg3 + var22.field1722 * arg2) / (var22.field1725 * var7) + arg0;
                    var8.field1651[var15] = method2546(var19, var23);
                    class130 var24;
                    if (this.field1543 == null || this.field1543[this.field1517[var15]] == null) {
                        var24 = this.field1542[this.field1517[var15]];
                    } else {
                        var24 = this.field1543[this.field1517[var15]];
                    }
                    int var25 = (var24.field1724 * arg4 + var24.field1723 * arg3 + var24.field1722 * arg2) / (var24.field1725 * var7) + arg0;
                    var8.field1652[var15] = method2546(var19, var25);
                } else if (var16 == 1) {
                    class138 var26 = this.field1541[var15];
                    int var27 = (var26.field1856 * arg4 + var26.field1855 * arg3 + var26.field1854 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1650[var15] = method2546(this.field1529[var15] & 0xFFFF, var27);
                    var8.field1652[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1650[var15] = 128;
                    var8.field1652[var15] = -1;
                } else {
                    var8.field1652[var15] = -2;
                }
            } else if (var16 == 0) {
                class130 var28;
                if (this.field1543 == null || this.field1543[this.field1522[var15]] == null) {
                    var28 = this.field1542[this.field1522[var15]];
                } else {
                    var28 = this.field1543[this.field1522[var15]];
                }
                int var29 = (var28.field1724 * arg4 + var28.field1723 * arg3 + var28.field1722 * arg2) / (var28.field1725 * var7) + arg0;
                var8.field1650[var15] = method2577(var29);
                class130 var30;
                if (this.field1543 == null || this.field1543[this.field1523[var15]] == null) {
                    var30 = this.field1542[this.field1523[var15]];
                } else {
                    var30 = this.field1543[this.field1523[var15]];
                }
                int var31 = (var30.field1724 * arg4 + var30.field1723 * arg3 + var30.field1722 * arg2) / (var30.field1725 * var7) + arg0;
                var8.field1651[var15] = method2577(var31);
                class130 var32;
                if (this.field1543 == null || this.field1543[this.field1517[var15]] == null) {
                    var32 = this.field1542[this.field1517[var15]];
                } else {
                    var32 = this.field1543[this.field1517[var15]];
                }
                int var33 = (var32.field1724 * arg4 + var32.field1723 * arg3 + var32.field1722 * arg2) / (var32.field1725 * var7) + arg0;
                var8.field1652[var15] = method2577(var33);
            } else if (var16 == 1) {
                class138 var34 = this.field1541[var15];
                int var35 = (var34.field1856 * arg4 + var34.field1855 * arg3 + var34.field1854 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1650[var15] = method2577(var35);
                var8.field1652[var15] = -1;
            } else {
                var8.field1652[var15] = -2;
            }
        }
        this.method2531();
        var8.field1666 = this.field1531;
        var8.field1643 = this.field1518;
        var8.field1644 = this.field1519;
        var8.field1645 = this.field1520;
        var8.field1640 = this.field1551;
        var8.field1647 = this.field1522;
        var8.field1648 = this.field1523;
        var8.field1685 = this.field1517;
        var8.field1653 = this.field1526;
        var8.field1654 = this.field1538;
        var8.field1657 = this.field1546;
        var8.field1662 = this.field1539;
        var8.field1683 = this.field1540;
        var8.field1663 = this.field1524;
        return var8;
    }

    @ObfuscatedName("ds.ag(II)I")
    public static final int method2546(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("ds.at(I)I")
    public static final int method2577(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
