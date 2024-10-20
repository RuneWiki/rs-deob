package deob;

@ObfuscatedName("dd")
public class class122 extends class136 {

    @ObfuscatedName("dd.f")
    public int field1554 = 0;

    @ObfuscatedName("dd.i")
    public int[] field1525;

    @ObfuscatedName("dd.y")
    public int[] field1546;

    @ObfuscatedName("dd.w")
    public int[] field1563;

    @ObfuscatedName("dd.p")
    public int field1527 = 0;

    @ObfuscatedName("dd.b")
    public int[] field1529;

    @ObfuscatedName("dd.e")
    public int[] field1538;

    @ObfuscatedName("dd.x")
    public int[] field1526;

    @ObfuscatedName("dd.a")
    public byte[] field1524;

    @ObfuscatedName("dd.d")
    public byte[] field1533;

    @ObfuscatedName("dd.c")
    public byte[] field1534;

    @ObfuscatedName("dd.o")
    public byte[] field1535;

    @ObfuscatedName("dd.v")
    public short[] field1536;

    @ObfuscatedName("dd.k")
    public short[] field1537;

    @ObfuscatedName("dd.s")
    public byte field1539 = 0;

    @ObfuscatedName("dd.l")
    public int field1531;

    @ObfuscatedName("dd.t")
    public byte[] field1540;

    @ObfuscatedName("dd.j")
    public short[] field1541;

    @ObfuscatedName("dd.n")
    public short[] field1561;

    @ObfuscatedName("dd.u")
    public short[] field1543;

    @ObfuscatedName("dd.z")
    public int[] field1544;

    @ObfuscatedName("dd.h")
    public int[] field1545;

    @ObfuscatedName("dd.m")
    public int[][] field1557;

    @ObfuscatedName("dd.g")
    public int[][] field1547;

    @ObfuscatedName("dd.r")
    public class138[] field1548;

    @ObfuscatedName("dd.q")
    public class130[] field1549;

    @ObfuscatedName("dd.aa")
    public class130[] field1550;

    @ObfuscatedName("dd.av")
    public short field1532;

    @ObfuscatedName("dd.aw")
    public short field1552;

    @ObfuscatedName("dd.as")
    public boolean field1553 = false;

    @ObfuscatedName("dd.ak")
    public int field1551;

    @ObfuscatedName("dd.au")
    public int field1528;

    @ObfuscatedName("dd.ah")
    public int field1556;

    @ObfuscatedName("dd.aq")
    public int field1542;

    @ObfuscatedName("dd.ao")
    public int field1530;

    @ObfuscatedName("dd.an")
    public static int[] field1559 = new int[10000];

    @ObfuscatedName("dd.ar")
    public static int[] field1560 = new int[10000];

    @ObfuscatedName("dd.az")
    public static int field1555 = 0;

    @ObfuscatedName("dd.ay")
    public static int[] field1562 = class131.field1762;

    @ObfuscatedName("dd.ag")
    public static int[] field1558 = class131.field1737;

    public class122() {
    }

    @ObfuscatedName("dd.f(Lhz;II)Ldd;")
    public static class122 method2543(class234 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3752(arg1, arg2);
        return var3 == null ? null : new class122(var3);
    }

    public class122(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2566(arg0);
        } else {
            this.method2545(arg0);
        }
    }

    @ObfuscatedName("dd.i([B)V")
    public void method2566(byte[] arg0) {
        class300 var2 = new class300(arg0);
        class300 var3 = new class300(arg0);
        class300 var4 = new class300(arg0);
        class300 var5 = new class300(arg0);
        class300 var6 = new class300(arg0);
        class300 var7 = new class300(arg0);
        class300 var8 = new class300(arg0);
        var2.field3703 = arg0.length - 23;
        int var9 = var2.method5112();
        int var10 = var2.method5112();
        int var11 = var2.method5110();
        int var12 = var2.method5110();
        int var13 = var2.method5110();
        int var14 = var2.method5110();
        int var15 = var2.method5110();
        int var16 = var2.method5110();
        int var17 = var2.method5110();
        int var18 = var2.method5112();
        int var19 = var2.method5112();
        int var20 = var2.method5112();
        int var21 = var2.method5112();
        int var22 = var2.method5112();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1540 = new byte[var11];
            var2.field3703 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1540[var26] = var2.method5297();
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
        this.field1554 = var9;
        this.field1527 = var10;
        this.field1531 = var11;
        this.field1525 = new int[var9];
        this.field1546 = new int[var9];
        this.field1563 = new int[var9];
        this.field1529 = new int[var10];
        this.field1538 = new int[var10];
        this.field1526 = new int[var10];
        if (var17 == 1) {
            this.field1544 = new int[var9];
        }
        if (var12 == 1) {
            this.field1524 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1533 = new byte[var10];
        } else {
            this.field1539 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1534 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1545 = new int[var10];
        }
        if (var16 == 1) {
            this.field1537 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1535 = new byte[var10];
        }
        this.field1536 = new short[var10];
        if (var11 > 0) {
            this.field1541 = new short[var11];
            this.field1561 = new short[var11];
            this.field1543 = new short[var11];
        }
        var2.field3703 = var11;
        var3.field3703 = var44;
        var4.field3703 = var46;
        var5.field3703 = var48;
        var6.field3703 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method5110();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method5123();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method5123();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method5123();
            }
            this.field1525[var67] = var64 + var69;
            this.field1546[var67] = var65 + var70;
            this.field1563[var67] = var66 + var71;
            var64 = this.field1525[var67];
            var65 = this.field1546[var67];
            var66 = this.field1563[var67];
            if (var17 == 1) {
                this.field1544[var67] = var6.method5110();
            }
        }
        var2.field3703 = var42;
        var3.field3703 = var31;
        var4.field3703 = var34;
        var5.field3703 = var37;
        var6.field3703 = var35;
        var7.field3703 = var40;
        var8.field3703 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1536[var72] = (short) var2.method5112();
            if (var12 == 1) {
                this.field1524[var72] = var3.method5297();
            }
            if (var13 == 255) {
                this.field1533[var72] = var4.method5297();
            }
            if (var14 == 1) {
                this.field1534[var72] = var5.method5297();
            }
            if (var15 == 1) {
                this.field1545[var72] = var6.method5110();
            }
            if (var16 == 1) {
                this.field1537[var72] = (short) (var7.method5112() - 1);
            }
            if (this.field1535 != null && this.field1537[var72] != -1) {
                this.field1535[var72] = (byte) (var8.method5110() - 1);
            }
        }
        var2.field3703 = var33;
        var3.field3703 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method5110();
            if (var78 == 1) {
                var73 = var2.method5123() + var76;
                var74 = var2.method5123() + var73;
                var75 = var2.method5123() + var74;
                var76 = var75;
                this.field1529[var77] = var73;
                this.field1538[var77] = var74;
                this.field1526[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method5123() + var76;
                var76 = var75;
                this.field1529[var77] = var73;
                this.field1538[var77] = var74;
                this.field1526[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method5123() + var76;
                var76 = var75;
                this.field1529[var77] = var73;
                this.field1538[var77] = var74;
                this.field1526[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method5123() + var76;
                var76 = var75;
                this.field1529[var77] = var73;
                this.field1538[var77] = var81;
                this.field1526[var77] = var75;
            }
        }
        var2.field3703 = var50;
        var3.field3703 = var52;
        var4.field3703 = var54;
        var5.field3703 = var56;
        var6.field3703 = var58;
        var7.field3703 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1540[var82] & 0xFF;
            if (var83 == 0) {
                this.field1541[var82] = (short) var2.method5112();
                this.field1561[var82] = (short) var2.method5112();
                this.field1543[var82] = (short) var2.method5112();
            }
        }
        var2.field3703 = var62;
        int var84 = var2.method5110();
        if (var84 == 0) {
            return;
        }
        new class135();
        var2.method5112();
        var2.method5112();
        var2.method5112();
        var2.method5192();
    }

    @ObfuscatedName("dd.y([B)V")
    public void method2545(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class300 var4 = new class300(arg0);
        class300 var5 = new class300(arg0);
        class300 var6 = new class300(arg0);
        class300 var7 = new class300(arg0);
        class300 var8 = new class300(arg0);
        var4.field3703 = arg0.length - 18;
        int var9 = var4.method5112();
        int var10 = var4.method5112();
        int var11 = var4.method5110();
        int var12 = var4.method5110();
        int var13 = var4.method5110();
        int var14 = var4.method5110();
        int var15 = var4.method5110();
        int var16 = var4.method5110();
        int var17 = var4.method5112();
        int var18 = var4.method5112();
        int var19 = var4.method5112();
        int var20 = var4.method5112();
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
        this.field1554 = var9;
        this.field1527 = var10;
        this.field1531 = var11;
        this.field1525 = new int[var9];
        this.field1546 = new int[var9];
        this.field1563 = new int[var9];
        this.field1529 = new int[var10];
        this.field1538 = new int[var10];
        this.field1526 = new int[var10];
        if (var11 > 0) {
            this.field1540 = new byte[var11];
            this.field1541 = new short[var11];
            this.field1561 = new short[var11];
            this.field1543 = new short[var11];
        }
        if (var16 == 1) {
            this.field1544 = new int[var9];
        }
        if (var12 == 1) {
            this.field1524 = new byte[var10];
            this.field1535 = new byte[var10];
            this.field1537 = new short[var10];
        }
        if (var13 == 255) {
            this.field1533 = new byte[var10];
        } else {
            this.field1539 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1534 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1545 = new int[var10];
        }
        this.field1536 = new short[var10];
        var4.field3703 = var21;
        var5.field3703 = var36;
        var6.field3703 = var38;
        var7.field3703 = var40;
        var8.field3703 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method5110();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method5123();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method5123();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method5123();
            }
            this.field1525[var46] = var43 + var48;
            this.field1546[var46] = var44 + var49;
            this.field1563[var46] = var45 + var50;
            var43 = this.field1525[var46];
            var44 = this.field1546[var46];
            var45 = this.field1563[var46];
            if (var16 == 1) {
                this.field1544[var46] = var8.method5110();
            }
        }
        var4.field3703 = var32;
        var5.field3703 = var28;
        var6.field3703 = var26;
        var7.field3703 = var30;
        var8.field3703 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1536[var51] = (short) var4.method5112();
            if (var12 == 1) {
                int var52 = var5.method5110();
                if ((var52 & 0x1) == 1) {
                    this.field1524[var51] = 1;
                    var2 = true;
                } else {
                    this.field1524[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1535[var51] = (byte) (var52 >> 2);
                    this.field1537[var51] = this.field1536[var51];
                    this.field1536[var51] = 127;
                    if (this.field1537[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1535[var51] = -1;
                    this.field1537[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1533[var51] = var6.method5297();
            }
            if (var14 == 1) {
                this.field1534[var51] = var7.method5297();
            }
            if (var15 == 1) {
                this.field1545[var51] = var8.method5110();
            }
        }
        var4.field3703 = var25;
        var5.field3703 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method5110();
            if (var58 == 1) {
                var53 = var4.method5123() + var56;
                var54 = var4.method5123() + var53;
                var55 = var4.method5123() + var54;
                var56 = var55;
                this.field1529[var57] = var53;
                this.field1538[var57] = var54;
                this.field1526[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method5123() + var56;
                var56 = var55;
                this.field1529[var57] = var53;
                this.field1538[var57] = var54;
                this.field1526[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method5123() + var56;
                var56 = var55;
                this.field1529[var57] = var53;
                this.field1538[var57] = var54;
                this.field1526[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method5123() + var56;
                var56 = var55;
                this.field1529[var57] = var53;
                this.field1538[var57] = var61;
                this.field1526[var57] = var55;
            }
        }
        var4.field3703 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1540[var62] = 0;
            this.field1541[var62] = (short) var4.method5112();
            this.field1561[var62] = (short) var4.method5112();
            this.field1543[var62] = (short) var4.method5112();
        }
        if (this.field1535 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1535[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1541[var65] & 0xFFFF) == this.field1529[var64] && (this.field1561[var65] & 0xFFFF) == this.field1538[var64] && (this.field1543[var65] & 0xFFFF) == this.field1526[var64]) {
                        this.field1535[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1535 = null;
            }
        }
        if (!var3) {
            this.field1537 = null;
        }
        if (!var2) {
            this.field1524 = null;
        }
    }

    public class122(class122[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1554 = 0;
        this.field1527 = 0;
        this.field1531 = 0;
        this.field1539 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class122 var10 = arg0[var9];
            if (var10 != null) {
                this.field1554 += var10.field1554;
                this.field1527 += var10.field1527;
                this.field1531 += var10.field1531;
                if (var10.field1533 == null) {
                    if (this.field1539 == -1) {
                        this.field1539 = var10.field1539;
                    }
                    if (this.field1539 != var10.field1539) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1524 != null;
                var5 |= var10.field1534 != null;
                var6 |= var10.field1545 != null;
                var7 |= var10.field1537 != null;
                var8 |= var10.field1535 != null;
            }
        }
        this.field1525 = new int[this.field1554];
        this.field1546 = new int[this.field1554];
        this.field1563 = new int[this.field1554];
        this.field1544 = new int[this.field1554];
        this.field1529 = new int[this.field1527];
        this.field1538 = new int[this.field1527];
        this.field1526 = new int[this.field1527];
        if (var3) {
            this.field1524 = new byte[this.field1527];
        }
        if (var4) {
            this.field1533 = new byte[this.field1527];
        }
        if (var5) {
            this.field1534 = new byte[this.field1527];
        }
        if (var6) {
            this.field1545 = new int[this.field1527];
        }
        if (var7) {
            this.field1537 = new short[this.field1527];
        }
        if (var8) {
            this.field1535 = new byte[this.field1527];
        }
        this.field1536 = new short[this.field1527];
        if (this.field1531 > 0) {
            this.field1540 = new byte[this.field1531];
            this.field1541 = new short[this.field1531];
            this.field1561 = new short[this.field1531];
            this.field1543 = new short[this.field1531];
        }
        this.field1554 = 0;
        this.field1527 = 0;
        this.field1531 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class122 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1527; var13++) {
                    if (var3 && var12.field1524 != null) {
                        this.field1524[this.field1527] = var12.field1524[var13];
                    }
                    if (var4) {
                        if (var12.field1533 == null) {
                            this.field1533[this.field1527] = var12.field1539;
                        } else {
                            this.field1533[this.field1527] = var12.field1533[var13];
                        }
                    }
                    if (var5 && var12.field1534 != null) {
                        this.field1534[this.field1527] = var12.field1534[var13];
                    }
                    if (var6 && var12.field1545 != null) {
                        this.field1545[this.field1527] = var12.field1545[var13];
                    }
                    if (var7) {
                        if (var12.field1537 == null) {
                            this.field1537[this.field1527] = -1;
                        } else {
                            this.field1537[this.field1527] = var12.field1537[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1535 == null || var12.field1535[var13] == -1) {
                            this.field1535[this.field1527] = -1;
                        } else {
                            this.field1535[this.field1527] = (byte) (var12.field1535[var13] + this.field1531);
                        }
                    }
                    this.field1536[this.field1527] = var12.field1536[var13];
                    this.field1529[this.field1527] = this.method2546(var12, var12.field1529[var13]);
                    this.field1538[this.field1527] = this.method2546(var12, var12.field1538[var13]);
                    this.field1526[this.field1527] = this.method2546(var12, var12.field1526[var13]);
                    this.field1527++;
                }
                for (int var14 = 0; var14 < var12.field1531; var14++) {
                    byte var15 = this.field1540[this.field1531] = var12.field1540[var14];
                    if (var15 == 0) {
                        this.field1541[this.field1531] = (short) this.method2546(var12, var12.field1541[var14]);
                        this.field1561[this.field1531] = (short) this.method2546(var12, var12.field1561[var14]);
                        this.field1543[this.field1531] = (short) this.method2546(var12, var12.field1543[var14]);
                    }
                    this.field1531++;
                }
            }
        }
    }

    @ObfuscatedName("dd.w(Ldd;I)I")
    public final int method2546(class122 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1525[arg1];
        int var5 = arg0.field1546[arg1];
        int var6 = arg0.field1563[arg1];
        for (int var7 = 0; var7 < this.field1554; var7++) {
            if (this.field1525[var7] == var4 && this.field1546[var7] == var5 && this.field1563[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1525[this.field1554] = var4;
            this.field1546[this.field1554] = var5;
            this.field1563[this.field1554] = var6;
            if (arg0.field1544 != null) {
                this.field1544[this.field1554] = arg0.field1544[arg1];
            }
            var3 = this.field1554++;
        }
        return var3;
    }

    public class122(class122 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1554 = arg0.field1554;
        this.field1527 = arg0.field1527;
        this.field1531 = arg0.field1531;
        if (arg1) {
            this.field1525 = arg0.field1525;
            this.field1546 = arg0.field1546;
            this.field1563 = arg0.field1563;
        } else {
            this.field1525 = new int[this.field1554];
            this.field1546 = new int[this.field1554];
            this.field1563 = new int[this.field1554];
            for (int var6 = 0; var6 < this.field1554; var6++) {
                this.field1525[var6] = arg0.field1525[var6];
                this.field1546[var6] = arg0.field1546[var6];
                this.field1563[var6] = arg0.field1563[var6];
            }
        }
        if (arg2) {
            this.field1536 = arg0.field1536;
        } else {
            this.field1536 = new short[this.field1527];
            for (int var7 = 0; var7 < this.field1527; var7++) {
                this.field1536[var7] = arg0.field1536[var7];
            }
        }
        if (arg3 || arg0.field1537 == null) {
            this.field1537 = arg0.field1537;
        } else {
            this.field1537 = new short[this.field1527];
            for (int var8 = 0; var8 < this.field1527; var8++) {
                this.field1537[var8] = arg0.field1537[var8];
            }
        }
        if (arg4) {
            this.field1534 = arg0.field1534;
        } else {
            this.field1534 = new byte[this.field1527];
            if (arg0.field1534 == null) {
                for (int var9 = 0; var9 < this.field1527; var9++) {
                    this.field1534[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1527; var10++) {
                    this.field1534[var10] = arg0.field1534[var10];
                }
            }
        }
        this.field1529 = arg0.field1529;
        this.field1538 = arg0.field1538;
        this.field1526 = arg0.field1526;
        this.field1524 = arg0.field1524;
        this.field1533 = arg0.field1533;
        this.field1535 = arg0.field1535;
        this.field1539 = arg0.field1539;
        this.field1540 = arg0.field1540;
        this.field1541 = arg0.field1541;
        this.field1561 = arg0.field1561;
        this.field1543 = arg0.field1543;
        this.field1544 = arg0.field1544;
        this.field1545 = arg0.field1545;
        this.field1557 = arg0.field1557;
        this.field1547 = arg0.field1547;
        this.field1549 = arg0.field1549;
        this.field1548 = arg0.field1548;
        this.field1550 = arg0.field1550;
        this.field1532 = arg0.field1532;
        this.field1552 = arg0.field1552;
    }

    @ObfuscatedName("dd.p()Ldd;")
    public class122 method2547() {
        class122 var1 = new class122();
        if (this.field1524 != null) {
            var1.field1524 = new byte[this.field1527];
            for (int var2 = 0; var2 < this.field1527; var2++) {
                var1.field1524[var2] = this.field1524[var2];
            }
        }
        var1.field1554 = this.field1554;
        var1.field1527 = this.field1527;
        var1.field1531 = this.field1531;
        var1.field1525 = this.field1525;
        var1.field1546 = this.field1546;
        var1.field1563 = this.field1563;
        var1.field1529 = this.field1529;
        var1.field1538 = this.field1538;
        var1.field1526 = this.field1526;
        var1.field1533 = this.field1533;
        var1.field1534 = this.field1534;
        var1.field1535 = this.field1535;
        var1.field1536 = this.field1536;
        var1.field1537 = this.field1537;
        var1.field1539 = this.field1539;
        var1.field1540 = this.field1540;
        var1.field1541 = this.field1541;
        var1.field1561 = this.field1561;
        var1.field1543 = this.field1543;
        var1.field1544 = this.field1544;
        var1.field1545 = this.field1545;
        var1.field1557 = this.field1557;
        var1.field1547 = this.field1547;
        var1.field1549 = this.field1549;
        var1.field1548 = this.field1548;
        var1.field1532 = this.field1532;
        var1.field1552 = this.field1552;
        return var1;
    }

    @ObfuscatedName("dd.b([[IIIIZI)Ldd;")
    public class122 method2548(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2589();
        int var7 = this.field1528 + arg1;
        int var8 = this.field1556 + arg1;
        int var9 = this.field1530 + arg3;
        int var10 = this.field1542 + arg3;
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
            var15.field1554 = this.field1554;
            var15.field1527 = this.field1527;
            var15.field1531 = this.field1531;
            var15.field1525 = this.field1525;
            var15.field1563 = this.field1563;
            var15.field1529 = this.field1529;
            var15.field1538 = this.field1538;
            var15.field1526 = this.field1526;
            var15.field1524 = this.field1524;
            var15.field1533 = this.field1533;
            var15.field1534 = this.field1534;
            var15.field1535 = this.field1535;
            var15.field1536 = this.field1536;
            var15.field1537 = this.field1537;
            var15.field1539 = this.field1539;
            var15.field1540 = this.field1540;
            var15.field1541 = this.field1541;
            var15.field1561 = this.field1561;
            var15.field1543 = this.field1543;
            var15.field1544 = this.field1544;
            var15.field1545 = this.field1545;
            var15.field1557 = this.field1557;
            var15.field1547 = this.field1547;
            var15.field1532 = this.field1532;
            var15.field1552 = this.field1552;
            var15.field1546 = new int[var15.field1554];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1554; var16++) {
                int var17 = this.field1525[var16] + arg1;
                int var18 = this.field1563[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1546[var16] = this.field1546[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1554; var26++) {
                int var27 = (-this.field1546[var26] << 16) / this.field1850;
                if (var27 < arg5) {
                    int var28 = this.field1525[var26] + arg1;
                    int var29 = this.field1563[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1546[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1546[var26];
                }
            }
        }
        var15.method2560();
        return var15;
    }

    @ObfuscatedName("dd.e()V")
    public void method2549() {
        int var10002;
        if (this.field1544 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1554; var3++) {
                int var4 = this.field1544[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1557 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1557[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1554) {
                int var7 = this.field1544[var6];
                this.field1557[var7][var1[var7]++] = var6++;
            }
            this.field1544 = null;
        }
        if (this.field1545 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1527; var10++) {
            int var11 = this.field1545[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1547 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1547[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1527) {
            int var14 = this.field1545[var13];
            this.field1547[var14][var8[var14]++] = var13++;
        }
        this.field1545 = null;
    }

    @ObfuscatedName("dd.x()V")
    public void method2616() {
        for (int var1 = 0; var1 < this.field1554; var1++) {
            int var2 = this.field1525[var1];
            this.field1525[var1] = this.field1563[var1];
            this.field1563[var1] = -var2;
        }
        this.method2560();
    }

    @ObfuscatedName("dd.d()V")
    public void method2551() {
        for (int var1 = 0; var1 < this.field1554; var1++) {
            this.field1525[var1] = -this.field1525[var1];
            this.field1563[var1] = -this.field1563[var1];
        }
        this.method2560();
    }

    @ObfuscatedName("dd.c()V")
    public void method2542() {
        for (int var1 = 0; var1 < this.field1554; var1++) {
            int var2 = this.field1563[var1];
            this.field1563[var1] = this.field1525[var1];
            this.field1525[var1] = -var2;
        }
        this.method2560();
    }

    @ObfuscatedName("dd.o(I)V")
    public void method2553(int arg0) {
        int var2 = field1562[arg0];
        int var3 = field1558[arg0];
        for (int var4 = 0; var4 < this.field1554; var4++) {
            int var5 = this.field1563[var4] * var2 + this.field1525[var4] * var3 >> 16;
            this.field1563[var4] = this.field1563[var4] * var3 - this.field1525[var4] * var2 >> 16;
            this.field1525[var4] = var5;
        }
        this.method2560();
    }

    @ObfuscatedName("dd.l(III)V")
    public void method2550(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1554; var4++) {
            this.field1525[var4] += arg0;
            this.field1546[var4] += arg1;
            this.field1563[var4] += arg2;
        }
        this.method2560();
    }

    @ObfuscatedName("dd.t(SS)V")
    public void method2602(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1527; var3++) {
            if (this.field1536[var3] == arg0) {
                this.field1536[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dd.j(SS)V")
    public void method2556(short arg0, short arg1) {
        if (this.field1537 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1527; var3++) {
            if (this.field1537[var3] == arg0) {
                this.field1537[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dd.n()V")
    public void method2561() {
        for (int var1 = 0; var1 < this.field1554; var1++) {
            this.field1563[var1] = -this.field1563[var1];
        }
        for (int var2 = 0; var2 < this.field1527; var2++) {
            int var3 = this.field1529[var2];
            this.field1529[var2] = this.field1526[var2];
            this.field1526[var2] = var3;
        }
        this.method2560();
    }

    @ObfuscatedName("dd.u(III)V")
    public void method2554(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1554; var4++) {
            this.field1525[var4] = this.field1525[var4] * arg0 / 128;
            this.field1546[var4] = this.field1546[var4] * arg1 / 128;
            this.field1563[var4] = this.field1563[var4] * arg2 / 128;
        }
        this.method2560();
    }

    @ObfuscatedName("dd.z()V")
    public void method2559() {
        if (this.field1549 != null) {
            return;
        }
        this.field1549 = new class130[this.field1554];
        for (int var1 = 0; var1 < this.field1554; var1++) {
            this.field1549[var1] = new class130();
        }
        for (int var2 = 0; var2 < this.field1527; var2++) {
            int var3 = this.field1529[var2];
            int var4 = this.field1538[var2];
            int var5 = this.field1526[var2];
            int var6 = this.field1525[var4] - this.field1525[var3];
            int var7 = this.field1546[var4] - this.field1546[var3];
            int var8 = this.field1563[var4] - this.field1563[var3];
            int var9 = this.field1525[var5] - this.field1525[var3];
            int var10 = this.field1546[var5] - this.field1546[var3];
            int var11 = this.field1563[var5] - this.field1563[var3];
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
            if (this.field1524 == null) {
                var19 = 0;
            } else {
                var19 = this.field1524[var2];
            }
            if (var19 == 0) {
                class130 var20 = this.field1549[var3];
                var20.field1732 += var16;
                var20.field1730 += var17;
                var20.field1734 += var18;
                var20.field1729++;
                class130 var21 = this.field1549[var4];
                var21.field1732 += var16;
                var21.field1730 += var17;
                var21.field1734 += var18;
                var21.field1729++;
                class130 var22 = this.field1549[var5];
                var22.field1732 += var16;
                var22.field1730 += var17;
                var22.field1734 += var18;
                var22.field1729++;
            } else if (var19 == 1) {
                if (this.field1548 == null) {
                    this.field1548 = new class138[this.field1527];
                }
                class138 var23 = this.field1548[var2] = new class138();
                var23.field1865 = var16;
                var23.field1864 = var17;
                var23.field1863 = var18;
            }
        }
    }

    @ObfuscatedName("dd.h()V")
    public void method2560() {
        this.field1549 = null;
        this.field1550 = null;
        this.field1548 = null;
        this.field1553 = false;
    }

    @ObfuscatedName("dd.m()V")
    public void method2589() {
        if (this.field1553) {
            return;
        }
        this.field1850 = 0;
        this.field1551 = 0;
        this.field1528 = 999999;
        this.field1556 = -999999;
        this.field1542 = -99999;
        this.field1530 = 99999;
        for (int var1 = 0; var1 < this.field1554; var1++) {
            int var2 = this.field1525[var1];
            int var3 = this.field1546[var1];
            int var4 = this.field1563[var1];
            if (var2 < this.field1528) {
                this.field1528 = var2;
            }
            if (var2 > this.field1556) {
                this.field1556 = var2;
            }
            if (var4 < this.field1530) {
                this.field1530 = var4;
            }
            if (var4 > this.field1542) {
                this.field1542 = var4;
            }
            if (-var3 > this.field1850) {
                this.field1850 = -var3;
            }
            if (var3 > this.field1551) {
                this.field1551 = var3;
            }
        }
        this.field1553 = true;
    }

    @ObfuscatedName("dd.aa(Ldd;Ldd;IIIZ)V")
    public static void method2562(class122 arg0, class122 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2589();
        arg0.method2559();
        arg1.method2589();
        arg1.method2559();
        field1555++;
        int var6 = 0;
        int[] var7 = arg1.field1525;
        int var8 = arg1.field1554;
        for (int var9 = 0; var9 < arg0.field1554; var9++) {
            class130 var10 = arg0.field1549[var9];
            if (var10.field1729 != 0) {
                int var11 = arg0.field1546[var9] - arg3;
                if (var11 <= arg1.field1551) {
                    int var12 = arg0.field1525[var9] - arg2;
                    if (var12 >= arg1.field1528 && var12 <= arg1.field1556) {
                        int var13 = arg0.field1563[var9] - arg4;
                        if (var13 >= arg1.field1530 && var13 <= arg1.field1542) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class130 var15 = arg1.field1549[var14];
                                if (var7[var14] == var12 && arg1.field1563[var14] == var13 && arg1.field1546[var14] == var11 && var15.field1729 != 0) {
                                    if (arg0.field1550 == null) {
                                        arg0.field1550 = new class130[arg0.field1554];
                                    }
                                    if (arg1.field1550 == null) {
                                        arg1.field1550 = new class130[var8];
                                    }
                                    class130 var16 = arg0.field1550[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1550[var9] = new class130(var10);
                                    }
                                    class130 var17 = arg1.field1550[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1550[var14] = new class130(var15);
                                    }
                                    var16.field1732 += var15.field1732;
                                    var16.field1730 += var15.field1730;
                                    var16.field1734 += var15.field1734;
                                    var16.field1729 += var15.field1729;
                                    var17.field1732 += var10.field1732;
                                    var17.field1730 += var10.field1730;
                                    var17.field1734 += var10.field1734;
                                    var17.field1729 += var10.field1729;
                                    var6++;
                                    field1559[var9] = field1555;
                                    field1560[var14] = field1555;
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
        for (int var18 = 0; var18 < arg0.field1527; var18++) {
            if (field1559[arg0.field1529[var18]] == field1555 && field1559[arg0.field1538[var18]] == field1555 && field1559[arg0.field1526[var18]] == field1555) {
                if (arg0.field1524 == null) {
                    arg0.field1524 = new byte[arg0.field1527];
                }
                arg0.field1524[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1527; var19++) {
            if (field1560[arg1.field1529[var19]] == field1555 && field1560[arg1.field1538[var19]] == field1555 && field1560[arg1.field1526[var19]] == field1555) {
                if (arg1.field1524 == null) {
                    arg1.field1524 = new byte[arg1.field1527];
                }
                arg1.field1524[var19] = 2;
            }
        }
    }

    @ObfuscatedName("dd.av(IIIII)Ldw;")
    public final class128 method2603(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2559();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class128 var8 = new class128();
        var8.field1656 = new int[this.field1527];
        var8.field1657 = new int[this.field1527];
        var8.field1661 = new int[this.field1527];
        if (this.field1531 > 0 && this.field1535 != null) {
            int[] var9 = new int[this.field1531];
            for (int var10 = 0; var10 < this.field1527; var10++) {
                if (this.field1535[var10] != -1) {
                    var9[this.field1535[var10] & 0xFF]++;
                }
            }
            var8.field1689 = 0;
            for (int var11 = 0; var11 < this.field1531; var11++) {
                if (var9[var11] > 0 && this.field1540[var11] == 0) {
                    var8.field1689++;
                }
            }
            var8.field1665 = new int[var8.field1689];
            var8.field1666 = new int[var8.field1689];
            var8.field1694 = new int[var8.field1689];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1531; var13++) {
                if (var9[var13] > 0 && this.field1540[var13] == 0) {
                    var8.field1665[var12] = this.field1541[var13] & 0xFFFF;
                    var8.field1666[var12] = this.field1561[var13] & 0xFFFF;
                    var8.field1694[var12] = this.field1543[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1704 = new byte[this.field1527];
            for (int var14 = 0; var14 < this.field1527; var14++) {
                if (this.field1535[var14] == -1) {
                    var8.field1704[var14] = -1;
                } else {
                    var8.field1704[var14] = (byte) var9[this.field1535[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1527; var15++) {
            byte var16;
            if (this.field1524 == null) {
                var16 = 0;
            } else {
                var16 = this.field1524[var15];
            }
            byte var17;
            if (this.field1534 == null) {
                var17 = 0;
            } else {
                var17 = this.field1534[var15];
            }
            short var18;
            if (this.field1537 == null) {
                var18 = -1;
            } else {
                var18 = this.field1537[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1536[var15] & 0xFFFF;
                    class130 var20;
                    if (this.field1550 == null || this.field1550[this.field1529[var15]] == null) {
                        var20 = this.field1549[this.field1529[var15]];
                    } else {
                        var20 = this.field1550[this.field1529[var15]];
                    }
                    int var21 = (var20.field1734 * arg4 + var20.field1732 * arg2 + var20.field1730 * arg3) / (var20.field1729 * var7) + arg0;
                    var8.field1656[var15] = method2608(var19, var21);
                    class130 var22;
                    if (this.field1550 == null || this.field1550[this.field1538[var15]] == null) {
                        var22 = this.field1549[this.field1538[var15]];
                    } else {
                        var22 = this.field1550[this.field1538[var15]];
                    }
                    int var23 = (var22.field1734 * arg4 + var22.field1732 * arg2 + var22.field1730 * arg3) / (var22.field1729 * var7) + arg0;
                    var8.field1657[var15] = method2608(var19, var23);
                    class130 var24;
                    if (this.field1550 == null || this.field1550[this.field1526[var15]] == null) {
                        var24 = this.field1549[this.field1526[var15]];
                    } else {
                        var24 = this.field1550[this.field1526[var15]];
                    }
                    int var25 = (var24.field1734 * arg4 + var24.field1732 * arg2 + var24.field1730 * arg3) / (var24.field1729 * var7) + arg0;
                    var8.field1661[var15] = method2608(var19, var25);
                } else if (var16 == 1) {
                    class138 var26 = this.field1548[var15];
                    int var27 = (var26.field1863 * arg4 + var26.field1865 * arg2 + var26.field1864 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1656[var15] = method2608(this.field1536[var15] & 0xFFFF, var27);
                    var8.field1661[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1656[var15] = 128;
                    var8.field1661[var15] = -1;
                } else {
                    var8.field1661[var15] = -2;
                }
            } else if (var16 == 0) {
                class130 var28;
                if (this.field1550 == null || this.field1550[this.field1529[var15]] == null) {
                    var28 = this.field1549[this.field1529[var15]];
                } else {
                    var28 = this.field1550[this.field1529[var15]];
                }
                int var29 = (var28.field1734 * arg4 + var28.field1732 * arg2 + var28.field1730 * arg3) / (var28.field1729 * var7) + arg0;
                var8.field1656[var15] = method2574(var29);
                class130 var30;
                if (this.field1550 == null || this.field1550[this.field1538[var15]] == null) {
                    var30 = this.field1549[this.field1538[var15]];
                } else {
                    var30 = this.field1550[this.field1538[var15]];
                }
                int var31 = (var30.field1734 * arg4 + var30.field1732 * arg2 + var30.field1730 * arg3) / (var30.field1729 * var7) + arg0;
                var8.field1657[var15] = method2574(var31);
                class130 var32;
                if (this.field1550 == null || this.field1550[this.field1526[var15]] == null) {
                    var32 = this.field1549[this.field1526[var15]];
                } else {
                    var32 = this.field1550[this.field1526[var15]];
                }
                int var33 = (var32.field1734 * arg4 + var32.field1732 * arg2 + var32.field1730 * arg3) / (var32.field1729 * var7) + arg0;
                var8.field1661[var15] = method2574(var33);
            } else if (var16 == 1) {
                class138 var34 = this.field1548[var15];
                int var35 = (var34.field1863 * arg4 + var34.field1865 * arg2 + var34.field1864 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1656[var15] = method2574(var35);
                var8.field1661[var15] = -1;
            } else {
                var8.field1661[var15] = -2;
            }
        }
        this.method2549();
        var8.field1648 = this.field1554;
        var8.field1649 = this.field1525;
        var8.field1685 = this.field1546;
        var8.field1651 = this.field1563;
        var8.field1650 = this.field1527;
        var8.field1709 = this.field1529;
        var8.field1654 = this.field1538;
        var8.field1655 = this.field1526;
        var8.field1667 = this.field1533;
        var8.field1660 = this.field1534;
        var8.field1663 = this.field1539;
        var8.field1653 = this.field1557;
        var8.field1669 = this.field1547;
        var8.field1662 = this.field1537;
        return var8;
    }

    @ObfuscatedName("dd.aw(II)I")
    public static final int method2608(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("dd.as(I)I")
    public static final int method2574(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
