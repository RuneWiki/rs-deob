package deob;

@ObfuscatedName("df")
public class class116 extends class130 {

    @ObfuscatedName("df.c")
    public int field1558 = 0;

    @ObfuscatedName("df.q")
    public int[] field1526;

    @ObfuscatedName("df.m")
    public int[] field1541;

    @ObfuscatedName("df.j")
    public int[] field1528;

    @ObfuscatedName("df.g")
    public int field1529 = 0;

    @ObfuscatedName("df.i")
    public int[] field1530;

    @ObfuscatedName("df.h")
    public int[] field1537;

    @ObfuscatedName("df.l")
    public int[] field1564;

    @ObfuscatedName("df.d")
    public byte[] field1559;

    @ObfuscatedName("df.o")
    public byte[] field1534;

    @ObfuscatedName("df.s")
    public byte[] field1535;

    @ObfuscatedName("df.k")
    public byte[] field1536;

    @ObfuscatedName("df.v")
    public short[] field1563;

    @ObfuscatedName("df.p")
    public short[] field1538;

    @ObfuscatedName("df.n")
    public byte field1539 = 0;

    @ObfuscatedName("df.t")
    public int field1532;

    @ObfuscatedName("df.r")
    public byte[] field1527;

    @ObfuscatedName("df.x")
    public short[] field1542;

    @ObfuscatedName("df.b")
    public short[] field1543;

    @ObfuscatedName("df.w")
    public short[] field1544;

    @ObfuscatedName("df.e")
    public int[] field1545;

    @ObfuscatedName("df.a")
    public int[] field1546;

    @ObfuscatedName("df.z")
    public int[][] field1547;

    @ObfuscatedName("df.y")
    public int[][] field1525;

    @ObfuscatedName("df.u")
    public class132[] field1549;

    @ObfuscatedName("df.f")
    public class124[] field1550;

    @ObfuscatedName("df.at")
    public class124[] field1551;

    @ObfuscatedName("df.ay")
    public short field1552;

    @ObfuscatedName("df.ak")
    public short field1553;

    @ObfuscatedName("df.az")
    public boolean field1533 = false;

    @ObfuscatedName("df.aj")
    public int field1555;

    @ObfuscatedName("df.af")
    public int field1556;

    @ObfuscatedName("df.ah")
    public int field1557;

    @ObfuscatedName("df.ab")
    public int field1560;

    @ObfuscatedName("df.aa")
    public int field1548;

    @ObfuscatedName("df.ac")
    public static int[] field1531 = new int[10000];

    @ObfuscatedName("df.ad")
    public static int[] field1561 = new int[10000];

    @ObfuscatedName("df.aq")
    public static int field1562 = 0;

    @ObfuscatedName("df.ax")
    public static int[] field1540 = class125.field1766;

    @ObfuscatedName("df.an")
    public static int[] field1554 = class125.field1741;

    public class116() {
    }

    @ObfuscatedName("df.c(Lih;II)Ldf;")
    public static class116 method2376(class250 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4210(arg1, arg2);
        return var3 == null ? null : new class116(var3);
    }

    public class116(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2319(arg0);
        } else {
            this.method2320(arg0);
        }
    }

    @ObfuscatedName("df.q([B)V")
    public void method2319(byte[] arg0) {
        class185 var2 = new class185(arg0);
        class185 var3 = new class185(arg0);
        class185 var4 = new class185(arg0);
        class185 var5 = new class185(arg0);
        class185 var6 = new class185(arg0);
        class185 var7 = new class185(arg0);
        class185 var8 = new class185(arg0);
        var2.field2386 = arg0.length - 23;
        int var9 = var2.method3245();
        int var10 = var2.method3245();
        int var11 = var2.method3243();
        int var12 = var2.method3243();
        int var13 = var2.method3243();
        int var14 = var2.method3243();
        int var15 = var2.method3243();
        int var16 = var2.method3243();
        int var17 = var2.method3243();
        int var18 = var2.method3245();
        int var19 = var2.method3245();
        int var20 = var2.method3245();
        int var21 = var2.method3245();
        int var22 = var2.method3245();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1527 = new byte[var11];
            var2.field2386 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1527[var26] = var2.method3244();
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
        this.field1558 = var9;
        this.field1529 = var10;
        this.field1532 = var11;
        this.field1526 = new int[var9];
        this.field1541 = new int[var9];
        this.field1528 = new int[var9];
        this.field1530 = new int[var10];
        this.field1537 = new int[var10];
        this.field1564 = new int[var10];
        if (var17 == 1) {
            this.field1545 = new int[var9];
        }
        if (var12 == 1) {
            this.field1559 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1534 = new byte[var10];
        } else {
            this.field1539 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1535 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1546 = new int[var10];
        }
        if (var16 == 1) {
            this.field1538 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1536 = new byte[var10];
        }
        this.field1563 = new short[var10];
        if (var11 > 0) {
            this.field1542 = new short[var11];
            this.field1543 = new short[var11];
            this.field1544 = new short[var11];
        }
        var2.field2386 = var11;
        var3.field2386 = var44;
        var4.field2386 = var46;
        var5.field2386 = var48;
        var6.field2386 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method3243();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method3272();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method3272();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method3272();
            }
            this.field1526[var67] = var64 + var69;
            this.field1541[var67] = var65 + var70;
            this.field1528[var67] = var66 + var71;
            var64 = this.field1526[var67];
            var65 = this.field1541[var67];
            var66 = this.field1528[var67];
            if (var17 == 1) {
                this.field1545[var67] = var6.method3243();
            }
        }
        var2.field2386 = var42;
        var3.field2386 = var31;
        var4.field2386 = var34;
        var5.field2386 = var37;
        var6.field2386 = var35;
        var7.field2386 = var40;
        var8.field2386 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1563[var72] = (short) var2.method3245();
            if (var12 == 1) {
                this.field1559[var72] = var3.method3244();
            }
            if (var13 == 255) {
                this.field1534[var72] = var4.method3244();
            }
            if (var14 == 1) {
                this.field1535[var72] = var5.method3244();
            }
            if (var15 == 1) {
                this.field1546[var72] = var6.method3243();
            }
            if (var16 == 1) {
                this.field1538[var72] = (short) (var7.method3245() - 1);
            }
            if (this.field1536 != null && this.field1538[var72] != -1) {
                this.field1536[var72] = (byte) (var8.method3243() - 1);
            }
        }
        var2.field2386 = var33;
        var3.field2386 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method3243();
            if (var78 == 1) {
                var73 = var2.method3272() + var76;
                var74 = var2.method3272() + var73;
                var75 = var2.method3272() + var74;
                var76 = var75;
                this.field1530[var77] = var73;
                this.field1537[var77] = var74;
                this.field1564[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method3272() + var76;
                var76 = var75;
                this.field1530[var77] = var73;
                this.field1537[var77] = var74;
                this.field1564[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method3272() + var76;
                var76 = var75;
                this.field1530[var77] = var73;
                this.field1537[var77] = var74;
                this.field1564[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method3272() + var76;
                var76 = var75;
                this.field1530[var77] = var73;
                this.field1537[var77] = var81;
                this.field1564[var77] = var75;
            }
        }
        var2.field2386 = var50;
        var3.field2386 = var52;
        var4.field2386 = var54;
        var5.field2386 = var56;
        var6.field2386 = var58;
        var7.field2386 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1527[var82] & 0xFF;
            if (var83 == 0) {
                this.field1542[var82] = (short) var2.method3245();
                this.field1543[var82] = (short) var2.method3245();
                this.field1544[var82] = (short) var2.method3245();
            }
        }
        var2.field2386 = var62;
        int var84 = var2.method3243();
        if (var84 == 0) {
            return;
        }
        new class129();
        var2.method3245();
        var2.method3245();
        var2.method3245();
        var2.method3323();
    }

    @ObfuscatedName("df.m([B)V")
    public void method2320(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class185 var4 = new class185(arg0);
        class185 var5 = new class185(arg0);
        class185 var6 = new class185(arg0);
        class185 var7 = new class185(arg0);
        class185 var8 = new class185(arg0);
        var4.field2386 = arg0.length - 18;
        int var9 = var4.method3245();
        int var10 = var4.method3245();
        int var11 = var4.method3243();
        int var12 = var4.method3243();
        int var13 = var4.method3243();
        int var14 = var4.method3243();
        int var15 = var4.method3243();
        int var16 = var4.method3243();
        int var17 = var4.method3245();
        int var18 = var4.method3245();
        int var19 = var4.method3245();
        int var20 = var4.method3245();
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
        this.field1558 = var9;
        this.field1529 = var10;
        this.field1532 = var11;
        this.field1526 = new int[var9];
        this.field1541 = new int[var9];
        this.field1528 = new int[var9];
        this.field1530 = new int[var10];
        this.field1537 = new int[var10];
        this.field1564 = new int[var10];
        if (var11 > 0) {
            this.field1527 = new byte[var11];
            this.field1542 = new short[var11];
            this.field1543 = new short[var11];
            this.field1544 = new short[var11];
        }
        if (var16 == 1) {
            this.field1545 = new int[var9];
        }
        if (var12 == 1) {
            this.field1559 = new byte[var10];
            this.field1536 = new byte[var10];
            this.field1538 = new short[var10];
        }
        if (var13 == 255) {
            this.field1534 = new byte[var10];
        } else {
            this.field1539 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1535 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1546 = new int[var10];
        }
        this.field1563 = new short[var10];
        var4.field2386 = var21;
        var5.field2386 = var36;
        var6.field2386 = var38;
        var7.field2386 = var40;
        var8.field2386 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method3243();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method3272();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method3272();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method3272();
            }
            this.field1526[var46] = var43 + var48;
            this.field1541[var46] = var44 + var49;
            this.field1528[var46] = var45 + var50;
            var43 = this.field1526[var46];
            var44 = this.field1541[var46];
            var45 = this.field1528[var46];
            if (var16 == 1) {
                this.field1545[var46] = var8.method3243();
            }
        }
        var4.field2386 = var32;
        var5.field2386 = var28;
        var6.field2386 = var26;
        var7.field2386 = var30;
        var8.field2386 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1563[var51] = (short) var4.method3245();
            if (var12 == 1) {
                int var52 = var5.method3243();
                if ((var52 & 0x1) == 1) {
                    this.field1559[var51] = 1;
                    var2 = true;
                } else {
                    this.field1559[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1536[var51] = (byte) (var52 >> 2);
                    this.field1538[var51] = this.field1563[var51];
                    this.field1563[var51] = 127;
                    if (this.field1538[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1536[var51] = -1;
                    this.field1538[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1534[var51] = var6.method3244();
            }
            if (var14 == 1) {
                this.field1535[var51] = var7.method3244();
            }
            if (var15 == 1) {
                this.field1546[var51] = var8.method3243();
            }
        }
        var4.field2386 = var25;
        var5.field2386 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method3243();
            if (var58 == 1) {
                var53 = var4.method3272() + var56;
                var54 = var4.method3272() + var53;
                var55 = var4.method3272() + var54;
                var56 = var55;
                this.field1530[var57] = var53;
                this.field1537[var57] = var54;
                this.field1564[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method3272() + var56;
                var56 = var55;
                this.field1530[var57] = var53;
                this.field1537[var57] = var54;
                this.field1564[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method3272() + var56;
                var56 = var55;
                this.field1530[var57] = var53;
                this.field1537[var57] = var54;
                this.field1564[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method3272() + var56;
                var56 = var55;
                this.field1530[var57] = var53;
                this.field1537[var57] = var61;
                this.field1564[var57] = var55;
            }
        }
        var4.field2386 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1527[var62] = 0;
            this.field1542[var62] = (short) var4.method3245();
            this.field1543[var62] = (short) var4.method3245();
            this.field1544[var62] = (short) var4.method3245();
        }
        if (this.field1536 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1536[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1542[var65] & 0xFFFF) == this.field1530[var64] && (this.field1543[var65] & 0xFFFF) == this.field1537[var64] && (this.field1544[var65] & 0xFFFF) == this.field1564[var64]) {
                        this.field1536[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1536 = null;
            }
        }
        if (!var3) {
            this.field1538 = null;
        }
        if (!var2) {
            this.field1559 = null;
        }
    }

    public class116(class116[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1558 = 0;
        this.field1529 = 0;
        this.field1532 = 0;
        this.field1539 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class116 var10 = arg0[var9];
            if (var10 != null) {
                this.field1558 += var10.field1558;
                this.field1529 += var10.field1529;
                this.field1532 += var10.field1532;
                if (var10.field1534 == null) {
                    if (this.field1539 == -1) {
                        this.field1539 = var10.field1539;
                    }
                    if (this.field1539 != var10.field1539) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1559 != null;
                var5 |= var10.field1535 != null;
                var6 |= var10.field1546 != null;
                var7 |= var10.field1538 != null;
                var8 |= var10.field1536 != null;
            }
        }
        this.field1526 = new int[this.field1558];
        this.field1541 = new int[this.field1558];
        this.field1528 = new int[this.field1558];
        this.field1545 = new int[this.field1558];
        this.field1530 = new int[this.field1529];
        this.field1537 = new int[this.field1529];
        this.field1564 = new int[this.field1529];
        if (var3) {
            this.field1559 = new byte[this.field1529];
        }
        if (var4) {
            this.field1534 = new byte[this.field1529];
        }
        if (var5) {
            this.field1535 = new byte[this.field1529];
        }
        if (var6) {
            this.field1546 = new int[this.field1529];
        }
        if (var7) {
            this.field1538 = new short[this.field1529];
        }
        if (var8) {
            this.field1536 = new byte[this.field1529];
        }
        this.field1563 = new short[this.field1529];
        if (this.field1532 > 0) {
            this.field1527 = new byte[this.field1532];
            this.field1542 = new short[this.field1532];
            this.field1543 = new short[this.field1532];
            this.field1544 = new short[this.field1532];
        }
        this.field1558 = 0;
        this.field1529 = 0;
        this.field1532 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class116 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1529; var13++) {
                    if (var3 && var12.field1559 != null) {
                        this.field1559[this.field1529] = var12.field1559[var13];
                    }
                    if (var4) {
                        if (var12.field1534 == null) {
                            this.field1534[this.field1529] = var12.field1539;
                        } else {
                            this.field1534[this.field1529] = var12.field1534[var13];
                        }
                    }
                    if (var5 && var12.field1535 != null) {
                        this.field1535[this.field1529] = var12.field1535[var13];
                    }
                    if (var6 && var12.field1546 != null) {
                        this.field1546[this.field1529] = var12.field1546[var13];
                    }
                    if (var7) {
                        if (var12.field1538 == null) {
                            this.field1538[this.field1529] = -1;
                        } else {
                            this.field1538[this.field1529] = var12.field1538[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1536 == null || var12.field1536[var13] == -1) {
                            this.field1536[this.field1529] = -1;
                        } else {
                            this.field1536[this.field1529] = (byte) (var12.field1536[var13] + this.field1532);
                        }
                    }
                    this.field1563[this.field1529] = var12.field1563[var13];
                    this.field1530[this.field1529] = this.method2321(var12, var12.field1530[var13]);
                    this.field1537[this.field1529] = this.method2321(var12, var12.field1537[var13]);
                    this.field1564[this.field1529] = this.method2321(var12, var12.field1564[var13]);
                    this.field1529++;
                }
                for (int var14 = 0; var14 < var12.field1532; var14++) {
                    byte var15 = this.field1527[this.field1532] = var12.field1527[var14];
                    if (var15 == 0) {
                        this.field1542[this.field1532] = (short) this.method2321(var12, var12.field1542[var14]);
                        this.field1543[this.field1532] = (short) this.method2321(var12, var12.field1543[var14]);
                        this.field1544[this.field1532] = (short) this.method2321(var12, var12.field1544[var14]);
                    }
                    this.field1532++;
                }
            }
        }
    }

    @ObfuscatedName("df.j(Ldf;I)I")
    public final int method2321(class116 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1526[arg1];
        int var5 = arg0.field1541[arg1];
        int var6 = arg0.field1528[arg1];
        for (int var7 = 0; var7 < this.field1558; var7++) {
            if (this.field1526[var7] == var4 && this.field1541[var7] == var5 && this.field1528[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1526[this.field1558] = var4;
            this.field1541[this.field1558] = var5;
            this.field1528[this.field1558] = var6;
            if (arg0.field1545 != null) {
                this.field1545[this.field1558] = arg0.field1545[arg1];
            }
            var3 = this.field1558++;
        }
        return var3;
    }

    public class116(class116 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1558 = arg0.field1558;
        this.field1529 = arg0.field1529;
        this.field1532 = arg0.field1532;
        if (arg1) {
            this.field1526 = arg0.field1526;
            this.field1541 = arg0.field1541;
            this.field1528 = arg0.field1528;
        } else {
            this.field1526 = new int[this.field1558];
            this.field1541 = new int[this.field1558];
            this.field1528 = new int[this.field1558];
            for (int var6 = 0; var6 < this.field1558; var6++) {
                this.field1526[var6] = arg0.field1526[var6];
                this.field1541[var6] = arg0.field1541[var6];
                this.field1528[var6] = arg0.field1528[var6];
            }
        }
        if (arg2) {
            this.field1563 = arg0.field1563;
        } else {
            this.field1563 = new short[this.field1529];
            for (int var7 = 0; var7 < this.field1529; var7++) {
                this.field1563[var7] = arg0.field1563[var7];
            }
        }
        if (arg3 || arg0.field1538 == null) {
            this.field1538 = arg0.field1538;
        } else {
            this.field1538 = new short[this.field1529];
            for (int var8 = 0; var8 < this.field1529; var8++) {
                this.field1538[var8] = arg0.field1538[var8];
            }
        }
        if (arg4) {
            this.field1535 = arg0.field1535;
        } else {
            this.field1535 = new byte[this.field1529];
            if (arg0.field1535 == null) {
                for (int var9 = 0; var9 < this.field1529; var9++) {
                    this.field1535[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1529; var10++) {
                    this.field1535[var10] = arg0.field1535[var10];
                }
            }
        }
        this.field1530 = arg0.field1530;
        this.field1537 = arg0.field1537;
        this.field1564 = arg0.field1564;
        this.field1559 = arg0.field1559;
        this.field1534 = arg0.field1534;
        this.field1536 = arg0.field1536;
        this.field1539 = arg0.field1539;
        this.field1527 = arg0.field1527;
        this.field1542 = arg0.field1542;
        this.field1543 = arg0.field1543;
        this.field1544 = arg0.field1544;
        this.field1545 = arg0.field1545;
        this.field1546 = arg0.field1546;
        this.field1547 = arg0.field1547;
        this.field1525 = arg0.field1525;
        this.field1550 = arg0.field1550;
        this.field1549 = arg0.field1549;
        this.field1551 = arg0.field1551;
        this.field1552 = arg0.field1552;
        this.field1553 = arg0.field1553;
    }

    @ObfuscatedName("df.g()Ldf;")
    public class116 method2393() {
        class116 var1 = new class116();
        if (this.field1559 != null) {
            var1.field1559 = new byte[this.field1529];
            for (int var2 = 0; var2 < this.field1529; var2++) {
                var1.field1559[var2] = this.field1559[var2];
            }
        }
        var1.field1558 = this.field1558;
        var1.field1529 = this.field1529;
        var1.field1532 = this.field1532;
        var1.field1526 = this.field1526;
        var1.field1541 = this.field1541;
        var1.field1528 = this.field1528;
        var1.field1530 = this.field1530;
        var1.field1537 = this.field1537;
        var1.field1564 = this.field1564;
        var1.field1534 = this.field1534;
        var1.field1535 = this.field1535;
        var1.field1536 = this.field1536;
        var1.field1563 = this.field1563;
        var1.field1538 = this.field1538;
        var1.field1539 = this.field1539;
        var1.field1527 = this.field1527;
        var1.field1542 = this.field1542;
        var1.field1543 = this.field1543;
        var1.field1544 = this.field1544;
        var1.field1545 = this.field1545;
        var1.field1546 = this.field1546;
        var1.field1547 = this.field1547;
        var1.field1525 = this.field1525;
        var1.field1550 = this.field1550;
        var1.field1549 = this.field1549;
        var1.field1552 = this.field1552;
        var1.field1553 = this.field1553;
        return var1;
    }

    @ObfuscatedName("df.i([[IIIIZI)Ldf;")
    public class116 method2359(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2341();
        int var7 = this.field1556 + arg1;
        int var8 = this.field1557 + arg1;
        int var9 = this.field1548 + arg3;
        int var10 = this.field1560 + arg3;
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
        class116 var15;
        if (arg4) {
            var15 = new class116();
            var15.field1558 = this.field1558;
            var15.field1529 = this.field1529;
            var15.field1532 = this.field1532;
            var15.field1526 = this.field1526;
            var15.field1528 = this.field1528;
            var15.field1530 = this.field1530;
            var15.field1537 = this.field1537;
            var15.field1564 = this.field1564;
            var15.field1559 = this.field1559;
            var15.field1534 = this.field1534;
            var15.field1535 = this.field1535;
            var15.field1536 = this.field1536;
            var15.field1563 = this.field1563;
            var15.field1538 = this.field1538;
            var15.field1539 = this.field1539;
            var15.field1527 = this.field1527;
            var15.field1542 = this.field1542;
            var15.field1543 = this.field1543;
            var15.field1544 = this.field1544;
            var15.field1545 = this.field1545;
            var15.field1546 = this.field1546;
            var15.field1547 = this.field1547;
            var15.field1525 = this.field1525;
            var15.field1552 = this.field1552;
            var15.field1553 = this.field1553;
            var15.field1541 = new int[var15.field1558];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1558; var16++) {
                int var17 = this.field1526[var16] + arg1;
                int var18 = this.field1528[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1541[var16] = this.field1541[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1558; var26++) {
                int var27 = (-this.field1541[var26] << 16) / this.field1849;
                if (var27 < arg5) {
                    int var28 = this.field1526[var26] + arg1;
                    int var29 = this.field1528[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1541[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1541[var26];
                }
            }
        }
        var15.method2357();
        return var15;
    }

    @ObfuscatedName("df.h()V")
    public void method2325() {
        int var10002;
        if (this.field1545 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1558; var3++) {
                int var4 = this.field1545[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1547 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1547[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1558) {
                int var7 = this.field1545[var6];
                this.field1547[var7][var1[var7]++] = var6++;
            }
            this.field1545 = null;
        }
        if (this.field1546 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1529; var10++) {
            int var11 = this.field1546[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1525 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1525[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1529) {
            int var14 = this.field1546[var13];
            this.field1525[var14][var8[var14]++] = var13++;
        }
        this.field1546 = null;
    }

    @ObfuscatedName("df.l()V")
    public void method2361() {
        for (int var1 = 0; var1 < this.field1558; var1++) {
            int var2 = this.field1526[var1];
            this.field1526[var1] = this.field1528[var1];
            this.field1528[var1] = -var2;
        }
        this.method2357();
    }

    @ObfuscatedName("df.k()V")
    public void method2326() {
        for (int var1 = 0; var1 < this.field1558; var1++) {
            this.field1526[var1] = -this.field1526[var1];
            this.field1528[var1] = -this.field1528[var1];
        }
        this.method2357();
    }

    @ObfuscatedName("df.v()V")
    public void method2327() {
        for (int var1 = 0; var1 < this.field1558; var1++) {
            int var2 = this.field1528[var1];
            this.field1528[var1] = this.field1526[var1];
            this.field1526[var1] = -var2;
        }
        this.method2357();
    }

    @ObfuscatedName("df.p(I)V")
    public void method2328(int arg0) {
        int var2 = field1540[arg0];
        int var3 = field1554[arg0];
        for (int var4 = 0; var4 < this.field1558; var4++) {
            int var5 = this.field1528[var4] * var2 + this.field1526[var4] * var3 >> 16;
            this.field1528[var4] = this.field1528[var4] * var3 - this.field1526[var4] * var2 >> 16;
            this.field1526[var4] = var5;
        }
        this.method2357();
    }

    @ObfuscatedName("df.n(III)V")
    public void method2329(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1558; var4++) {
            this.field1526[var4] += arg0;
            this.field1541[var4] += arg1;
            this.field1528[var4] += arg2;
        }
        this.method2357();
    }

    @ObfuscatedName("df.t(SS)V")
    public void method2330(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1529; var3++) {
            if (this.field1563[var3] == arg0) {
                this.field1563[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("df.r(SS)V")
    public void method2331(short arg0, short arg1) {
        if (this.field1538 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1529; var3++) {
            if (this.field1538[var3] == arg0) {
                this.field1538[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("df.x()V")
    public void method2332() {
        for (int var1 = 0; var1 < this.field1558; var1++) {
            this.field1528[var1] = -this.field1528[var1];
        }
        for (int var2 = 0; var2 < this.field1529; var2++) {
            int var3 = this.field1530[var2];
            this.field1530[var2] = this.field1564[var2];
            this.field1564[var2] = var3;
        }
        this.method2357();
    }

    @ObfuscatedName("df.b(III)V")
    public void method2333(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1558; var4++) {
            this.field1526[var4] = this.field1526[var4] * arg0 / 128;
            this.field1541[var4] = this.field1541[var4] * arg1 / 128;
            this.field1528[var4] = this.field1528[var4] * arg2 / 128;
        }
        this.method2357();
    }

    @ObfuscatedName("df.w()V")
    public void method2334() {
        if (this.field1550 != null) {
            return;
        }
        this.field1550 = new class124[this.field1558];
        for (int var1 = 0; var1 < this.field1558; var1++) {
            this.field1550[var1] = new class124();
        }
        for (int var2 = 0; var2 < this.field1529; var2++) {
            int var3 = this.field1530[var2];
            int var4 = this.field1537[var2];
            int var5 = this.field1564[var2];
            int var6 = this.field1526[var4] - this.field1526[var3];
            int var7 = this.field1541[var4] - this.field1541[var3];
            int var8 = this.field1528[var4] - this.field1528[var3];
            int var9 = this.field1526[var5] - this.field1526[var3];
            int var10 = this.field1541[var5] - this.field1541[var3];
            int var11 = this.field1528[var5] - this.field1528[var3];
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
            if (this.field1559 == null) {
                var19 = 0;
            } else {
                var19 = this.field1559[var2];
            }
            if (var19 == 0) {
                class124 var20 = this.field1550[var3];
                var20.field1734 += var16;
                var20.field1735 += var17;
                var20.field1736 += var18;
                var20.field1739++;
                class124 var21 = this.field1550[var4];
                var21.field1734 += var16;
                var21.field1735 += var17;
                var21.field1736 += var18;
                var21.field1739++;
                class124 var22 = this.field1550[var5];
                var22.field1734 += var16;
                var22.field1735 += var17;
                var22.field1736 += var18;
                var22.field1739++;
            } else if (var19 == 1) {
                if (this.field1549 == null) {
                    this.field1549 = new class132[this.field1529];
                }
                class132 var23 = this.field1549[var2] = new class132();
                var23.field1860 = var16;
                var23.field1861 = var17;
                var23.field1865 = var18;
            }
        }
    }

    @ObfuscatedName("df.a()V")
    public void method2357() {
        this.field1550 = null;
        this.field1551 = null;
        this.field1549 = null;
        this.field1533 = false;
    }

    @ObfuscatedName("df.z()V")
    public void method2341() {
        if (this.field1533) {
            return;
        }
        this.field1849 = 0;
        this.field1555 = 0;
        this.field1556 = 999999;
        this.field1557 = -999999;
        this.field1560 = -99999;
        this.field1548 = 99999;
        for (int var1 = 0; var1 < this.field1558; var1++) {
            int var2 = this.field1526[var1];
            int var3 = this.field1541[var1];
            int var4 = this.field1528[var1];
            if (var2 < this.field1556) {
                this.field1556 = var2;
            }
            if (var2 > this.field1557) {
                this.field1557 = var2;
            }
            if (var4 < this.field1548) {
                this.field1548 = var4;
            }
            if (var4 > this.field1560) {
                this.field1560 = var4;
            }
            if (-var3 > this.field1849) {
                this.field1849 = -var3;
            }
            if (var3 > this.field1555) {
                this.field1555 = var3;
            }
        }
        this.field1533 = true;
    }

    @ObfuscatedName("df.y(Ldf;Ldf;IIIZ)V")
    public static void method2337(class116 arg0, class116 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2341();
        arg0.method2334();
        arg1.method2341();
        arg1.method2334();
        field1562++;
        int var6 = 0;
        int[] var7 = arg1.field1526;
        int var8 = arg1.field1558;
        for (int var9 = 0; var9 < arg0.field1558; var9++) {
            class124 var10 = arg0.field1550[var9];
            if (var10.field1739 != 0) {
                int var11 = arg0.field1541[var9] - arg3;
                if (var11 <= arg1.field1555) {
                    int var12 = arg0.field1526[var9] - arg2;
                    if (var12 >= arg1.field1556 && var12 <= arg1.field1557) {
                        int var13 = arg0.field1528[var9] - arg4;
                        if (var13 >= arg1.field1548 && var13 <= arg1.field1560) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class124 var15 = arg1.field1550[var14];
                                if (var7[var14] == var12 && arg1.field1528[var14] == var13 && arg1.field1541[var14] == var11 && var15.field1739 != 0) {
                                    if (arg0.field1551 == null) {
                                        arg0.field1551 = new class124[arg0.field1558];
                                    }
                                    if (arg1.field1551 == null) {
                                        arg1.field1551 = new class124[var8];
                                    }
                                    class124 var16 = arg0.field1551[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1551[var9] = new class124(var10);
                                    }
                                    class124 var17 = arg1.field1551[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1551[var14] = new class124(var15);
                                    }
                                    var16.field1734 += var15.field1734;
                                    var16.field1735 += var15.field1735;
                                    var16.field1736 += var15.field1736;
                                    var16.field1739 += var15.field1739;
                                    var17.field1734 += var10.field1734;
                                    var17.field1735 += var10.field1735;
                                    var17.field1736 += var10.field1736;
                                    var17.field1739 += var10.field1739;
                                    var6++;
                                    field1531[var9] = field1562;
                                    field1561[var14] = field1562;
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
        for (int var18 = 0; var18 < arg0.field1529; var18++) {
            if (field1531[arg0.field1530[var18]] == field1562 && field1531[arg0.field1537[var18]] == field1562 && field1531[arg0.field1564[var18]] == field1562) {
                if (arg0.field1559 == null) {
                    arg0.field1559 = new byte[arg0.field1529];
                }
                arg0.field1559[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1529; var19++) {
            if (field1561[arg1.field1530[var19]] == field1562 && field1561[arg1.field1537[var19]] == field1562 && field1561[arg1.field1564[var19]] == field1562) {
                if (arg1.field1559 == null) {
                    arg1.field1559 = new byte[arg1.field1529];
                }
                arg1.field1559[var19] = 2;
            }
        }
    }

    @ObfuscatedName("df.u(IIIII)Ldx;")
    public final class122 method2338(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2334();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class122 var8 = new class122();
        var8.field1696 = new int[this.field1529];
        var8.field1660 = new int[this.field1529];
        var8.field1661 = new int[this.field1529];
        if (this.field1532 > 0 && this.field1536 != null) {
            int[] var9 = new int[this.field1532];
            for (int var10 = 0; var10 < this.field1529; var10++) {
                if (this.field1536[var10] != -1) {
                    var9[this.field1536[var10] & 0xFF]++;
                }
            }
            var8.field1667 = 0;
            for (int var11 = 0; var11 < this.field1532; var11++) {
                if (var9[var11] > 0 && this.field1527[var11] == 0) {
                    var8.field1667++;
                }
            }
            var8.field1668 = new int[var8.field1667];
            var8.field1669 = new int[var8.field1667];
            var8.field1670 = new int[var8.field1667];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1532; var13++) {
                if (var9[var13] > 0 && this.field1527[var13] == 0) {
                    var8.field1668[var12] = this.field1542[var13] & 0xFFFF;
                    var8.field1669[var12] = this.field1543[var13] & 0xFFFF;
                    var8.field1670[var12] = this.field1544[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1664 = new byte[this.field1529];
            for (int var14 = 0; var14 < this.field1529; var14++) {
                if (this.field1536[var14] == -1) {
                    var8.field1664[var14] = -1;
                } else {
                    var8.field1664[var14] = (byte) var9[this.field1536[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1529; var15++) {
            byte var16;
            if (this.field1559 == null) {
                var16 = 0;
            } else {
                var16 = this.field1559[var15];
            }
            byte var17;
            if (this.field1535 == null) {
                var17 = 0;
            } else {
                var17 = this.field1535[var15];
            }
            short var18;
            if (this.field1538 == null) {
                var18 = -1;
            } else {
                var18 = this.field1538[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1563[var15] & 0xFFFF;
                    class124 var20;
                    if (this.field1551 == null || this.field1551[this.field1530[var15]] == null) {
                        var20 = this.field1550[this.field1530[var15]];
                    } else {
                        var20 = this.field1551[this.field1530[var15]];
                    }
                    int var21 = (var20.field1736 * arg4 + var20.field1735 * arg3 + var20.field1734 * arg2) / (var20.field1739 * var7) + arg0;
                    var8.field1696[var15] = method2339(var19, var21);
                    class124 var22;
                    if (this.field1551 == null || this.field1551[this.field1537[var15]] == null) {
                        var22 = this.field1550[this.field1537[var15]];
                    } else {
                        var22 = this.field1551[this.field1537[var15]];
                    }
                    int var23 = (var22.field1736 * arg4 + var22.field1735 * arg3 + var22.field1734 * arg2) / (var22.field1739 * var7) + arg0;
                    var8.field1660[var15] = method2339(var19, var23);
                    class124 var24;
                    if (this.field1551 == null || this.field1551[this.field1564[var15]] == null) {
                        var24 = this.field1550[this.field1564[var15]];
                    } else {
                        var24 = this.field1551[this.field1564[var15]];
                    }
                    int var25 = (var24.field1736 * arg4 + var24.field1735 * arg3 + var24.field1734 * arg2) / (var24.field1739 * var7) + arg0;
                    var8.field1661[var15] = method2339(var19, var25);
                } else if (var16 == 1) {
                    class132 var26 = this.field1549[var15];
                    int var27 = (var26.field1865 * arg4 + var26.field1861 * arg3 + var26.field1860 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1696[var15] = method2339(this.field1563[var15] & 0xFFFF, var27);
                    var8.field1661[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1696[var15] = 128;
                    var8.field1661[var15] = -1;
                } else {
                    var8.field1661[var15] = -2;
                }
            } else if (var16 == 0) {
                class124 var28;
                if (this.field1551 == null || this.field1551[this.field1530[var15]] == null) {
                    var28 = this.field1550[this.field1530[var15]];
                } else {
                    var28 = this.field1551[this.field1530[var15]];
                }
                int var29 = (var28.field1736 * arg4 + var28.field1735 * arg3 + var28.field1734 * arg2) / (var28.field1739 * var7) + arg0;
                var8.field1696[var15] = method2379(var29);
                class124 var30;
                if (this.field1551 == null || this.field1551[this.field1537[var15]] == null) {
                    var30 = this.field1550[this.field1537[var15]];
                } else {
                    var30 = this.field1551[this.field1537[var15]];
                }
                int var31 = (var30.field1736 * arg4 + var30.field1735 * arg3 + var30.field1734 * arg2) / (var30.field1739 * var7) + arg0;
                var8.field1660[var15] = method2379(var31);
                class124 var32;
                if (this.field1551 == null || this.field1551[this.field1564[var15]] == null) {
                    var32 = this.field1550[this.field1564[var15]];
                } else {
                    var32 = this.field1551[this.field1564[var15]];
                }
                int var33 = (var32.field1736 * arg4 + var32.field1735 * arg3 + var32.field1734 * arg2) / (var32.field1739 * var7) + arg0;
                var8.field1661[var15] = method2379(var33);
            } else if (var16 == 1) {
                class132 var34 = this.field1549[var15];
                int var35 = (var34.field1865 * arg4 + var34.field1861 * arg3 + var34.field1860 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1696[var15] = method2379(var35);
                var8.field1661[var15] = -1;
            } else {
                var8.field1661[var15] = -2;
            }
        }
        this.method2325();
        var8.field1698 = this.field1558;
        var8.field1652 = this.field1526;
        var8.field1653 = this.field1541;
        var8.field1654 = this.field1528;
        var8.field1655 = this.field1529;
        var8.field1656 = this.field1530;
        var8.field1657 = this.field1537;
        var8.field1650 = this.field1564;
        var8.field1662 = this.field1534;
        var8.field1663 = this.field1535;
        var8.field1700 = this.field1539;
        var8.field1671 = this.field1547;
        var8.field1672 = this.field1525;
        var8.field1677 = this.field1538;
        return var8;
    }

    @ObfuscatedName("df.f(II)I")
    public static final int method2339(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("df.at(I)I")
    public static final int method2379(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
