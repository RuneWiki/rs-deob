package deob;

@ObfuscatedName("db")
public class class116 extends class130 {

    @ObfuscatedName("db.f")
    public int field1519 = 0;

    @ObfuscatedName("db.l")
    public int[] field1543;

    @ObfuscatedName("db.w")
    public int[] field1520;

    @ObfuscatedName("db.s")
    public int[] field1521;

    @ObfuscatedName("db.e")
    public int field1539 = 0;

    @ObfuscatedName("db.a")
    public int[] field1523;

    @ObfuscatedName("db.c")
    public int[] field1532;

    @ObfuscatedName("db.p")
    public int[] field1525;

    @ObfuscatedName("db.r")
    public byte[] field1526;

    @ObfuscatedName("db.m")
    public byte[] field1527;

    @ObfuscatedName("db.d")
    public byte[] field1522;

    @ObfuscatedName("db.z")
    public byte[] field1529;

    @ObfuscatedName("db.x")
    public short[] field1518;

    @ObfuscatedName("db.v")
    public short[] field1531;

    @ObfuscatedName("db.g")
    public byte field1550 = 0;

    @ObfuscatedName("db.j")
    public int field1542;

    @ObfuscatedName("db.b")
    public byte[] field1534;

    @ObfuscatedName("db.u")
    public short[] field1535;

    @ObfuscatedName("db.t")
    public short[] field1536;

    @ObfuscatedName("db.n")
    public short[] field1537;

    @ObfuscatedName("db.h")
    public int[] field1541;

    @ObfuscatedName("db.o")
    public int[] field1556;

    @ObfuscatedName("db.i")
    public int[][] field1540;

    @ObfuscatedName("db.k")
    public int[][] field1551;

    @ObfuscatedName("db.q")
    public class132[] field1538;

    @ObfuscatedName("db.y")
    public class124[] field1528;

    @ObfuscatedName("db.av")
    public class124[] field1544;

    @ObfuscatedName("db.ag")
    public short field1545;

    @ObfuscatedName("db.af")
    public short field1546;

    @ObfuscatedName("db.az")
    public boolean field1547 = false;

    @ObfuscatedName("db.at")
    public int field1548;

    @ObfuscatedName("db.ac")
    public int field1549;

    @ObfuscatedName("db.am")
    public int field1524;

    @ObfuscatedName("db.aw")
    public int field1533;

    @ObfuscatedName("db.aa")
    public int field1530;

    @ObfuscatedName("db.as")
    public static int[] field1553 = new int[10000];

    @ObfuscatedName("db.al")
    public static int[] field1554 = new int[10000];

    @ObfuscatedName("db.ad")
    public static int field1555 = 0;

    @ObfuscatedName("db.ax")
    public static int[] field1552 = class125.field1749;

    @ObfuscatedName("db.ao")
    public static int[] field1557 = class125.field1743;

    public class116() {
    }

    @ObfuscatedName("db.f(Lik;II)Ldb;")
    public static class116 method2435(class250 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4289(arg1, arg2);
        return var3 == null ? null : new class116(var3);
    }

    public class116(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2465(arg0);
        } else {
            this.method2437(arg0);
        }
    }

    @ObfuscatedName("db.l([B)V")
    public void method2465(byte[] arg0) {
        class185 var2 = new class185(arg0);
        class185 var3 = new class185(arg0);
        class185 var4 = new class185(arg0);
        class185 var5 = new class185(arg0);
        class185 var6 = new class185(arg0);
        class185 var7 = new class185(arg0);
        class185 var8 = new class185(arg0);
        var2.field2414 = arg0.length - 23;
        int var9 = var2.method3346();
        int var10 = var2.method3346();
        int var11 = var2.method3344();
        int var12 = var2.method3344();
        int var13 = var2.method3344();
        int var14 = var2.method3344();
        int var15 = var2.method3344();
        int var16 = var2.method3344();
        int var17 = var2.method3344();
        int var18 = var2.method3346();
        int var19 = var2.method3346();
        int var20 = var2.method3346();
        int var21 = var2.method3346();
        int var22 = var2.method3346();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1534 = new byte[var11];
            var2.field2414 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1534[var26] = var2.method3345();
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
        this.field1519 = var9;
        this.field1539 = var10;
        this.field1542 = var11;
        this.field1543 = new int[var9];
        this.field1520 = new int[var9];
        this.field1521 = new int[var9];
        this.field1523 = new int[var10];
        this.field1532 = new int[var10];
        this.field1525 = new int[var10];
        if (var17 == 1) {
            this.field1541 = new int[var9];
        }
        if (var12 == 1) {
            this.field1526 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1527 = new byte[var10];
        } else {
            this.field1550 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1522 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1556 = new int[var10];
        }
        if (var16 == 1) {
            this.field1531 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1529 = new byte[var10];
        }
        this.field1518 = new short[var10];
        if (var11 > 0) {
            this.field1535 = new short[var11];
            this.field1536 = new short[var11];
            this.field1537 = new short[var11];
        }
        var2.field2414 = var11;
        var3.field2414 = var44;
        var4.field2414 = var46;
        var5.field2414 = var48;
        var6.field2414 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method3344();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method3427();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method3427();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method3427();
            }
            this.field1543[var67] = var64 + var69;
            this.field1520[var67] = var65 + var70;
            this.field1521[var67] = var66 + var71;
            var64 = this.field1543[var67];
            var65 = this.field1520[var67];
            var66 = this.field1521[var67];
            if (var17 == 1) {
                this.field1541[var67] = var6.method3344();
            }
        }
        var2.field2414 = var42;
        var3.field2414 = var31;
        var4.field2414 = var34;
        var5.field2414 = var37;
        var6.field2414 = var35;
        var7.field2414 = var40;
        var8.field2414 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1518[var72] = (short) var2.method3346();
            if (var12 == 1) {
                this.field1526[var72] = var3.method3345();
            }
            if (var13 == 255) {
                this.field1527[var72] = var4.method3345();
            }
            if (var14 == 1) {
                this.field1522[var72] = var5.method3345();
            }
            if (var15 == 1) {
                this.field1556[var72] = var6.method3344();
            }
            if (var16 == 1) {
                this.field1531[var72] = (short) (var7.method3346() - 1);
            }
            if (this.field1529 != null && this.field1531[var72] != -1) {
                this.field1529[var72] = (byte) (var8.method3344() - 1);
            }
        }
        var2.field2414 = var33;
        var3.field2414 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method3344();
            if (var78 == 1) {
                var73 = var2.method3427() + var76;
                var74 = var2.method3427() + var73;
                var75 = var2.method3427() + var74;
                var76 = var75;
                this.field1523[var77] = var73;
                this.field1532[var77] = var74;
                this.field1525[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method3427() + var76;
                var76 = var75;
                this.field1523[var77] = var73;
                this.field1532[var77] = var74;
                this.field1525[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method3427() + var76;
                var76 = var75;
                this.field1523[var77] = var73;
                this.field1532[var77] = var74;
                this.field1525[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method3427() + var76;
                var76 = var75;
                this.field1523[var77] = var73;
                this.field1532[var77] = var81;
                this.field1525[var77] = var75;
            }
        }
        var2.field2414 = var50;
        var3.field2414 = var52;
        var4.field2414 = var54;
        var5.field2414 = var56;
        var6.field2414 = var58;
        var7.field2414 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1534[var82] & 0xFF;
            if (var83 == 0) {
                this.field1535[var82] = (short) var2.method3346();
                this.field1536[var82] = (short) var2.method3346();
                this.field1537[var82] = (short) var2.method3346();
            }
        }
        var2.field2414 = var62;
        int var84 = var2.method3344();
        if (var84 == 0) {
            return;
        }
        new class129();
        var2.method3346();
        var2.method3346();
        var2.method3346();
        var2.method3432();
    }

    @ObfuscatedName("db.w([B)V")
    public void method2437(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class185 var4 = new class185(arg0);
        class185 var5 = new class185(arg0);
        class185 var6 = new class185(arg0);
        class185 var7 = new class185(arg0);
        class185 var8 = new class185(arg0);
        var4.field2414 = arg0.length - 18;
        int var9 = var4.method3346();
        int var10 = var4.method3346();
        int var11 = var4.method3344();
        int var12 = var4.method3344();
        int var13 = var4.method3344();
        int var14 = var4.method3344();
        int var15 = var4.method3344();
        int var16 = var4.method3344();
        int var17 = var4.method3346();
        int var18 = var4.method3346();
        int var19 = var4.method3346();
        int var20 = var4.method3346();
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
        this.field1519 = var9;
        this.field1539 = var10;
        this.field1542 = var11;
        this.field1543 = new int[var9];
        this.field1520 = new int[var9];
        this.field1521 = new int[var9];
        this.field1523 = new int[var10];
        this.field1532 = new int[var10];
        this.field1525 = new int[var10];
        if (var11 > 0) {
            this.field1534 = new byte[var11];
            this.field1535 = new short[var11];
            this.field1536 = new short[var11];
            this.field1537 = new short[var11];
        }
        if (var16 == 1) {
            this.field1541 = new int[var9];
        }
        if (var12 == 1) {
            this.field1526 = new byte[var10];
            this.field1529 = new byte[var10];
            this.field1531 = new short[var10];
        }
        if (var13 == 255) {
            this.field1527 = new byte[var10];
        } else {
            this.field1550 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1522 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1556 = new int[var10];
        }
        this.field1518 = new short[var10];
        var4.field2414 = var21;
        var5.field2414 = var36;
        var6.field2414 = var38;
        var7.field2414 = var40;
        var8.field2414 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method3344();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method3427();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method3427();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method3427();
            }
            this.field1543[var46] = var43 + var48;
            this.field1520[var46] = var44 + var49;
            this.field1521[var46] = var45 + var50;
            var43 = this.field1543[var46];
            var44 = this.field1520[var46];
            var45 = this.field1521[var46];
            if (var16 == 1) {
                this.field1541[var46] = var8.method3344();
            }
        }
        var4.field2414 = var32;
        var5.field2414 = var28;
        var6.field2414 = var26;
        var7.field2414 = var30;
        var8.field2414 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1518[var51] = (short) var4.method3346();
            if (var12 == 1) {
                int var52 = var5.method3344();
                if ((var52 & 0x1) == 1) {
                    this.field1526[var51] = 1;
                    var2 = true;
                } else {
                    this.field1526[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1529[var51] = (byte) (var52 >> 2);
                    this.field1531[var51] = this.field1518[var51];
                    this.field1518[var51] = 127;
                    if (this.field1531[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1529[var51] = -1;
                    this.field1531[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1527[var51] = var6.method3345();
            }
            if (var14 == 1) {
                this.field1522[var51] = var7.method3345();
            }
            if (var15 == 1) {
                this.field1556[var51] = var8.method3344();
            }
        }
        var4.field2414 = var25;
        var5.field2414 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method3344();
            if (var58 == 1) {
                var53 = var4.method3427() + var56;
                var54 = var4.method3427() + var53;
                var55 = var4.method3427() + var54;
                var56 = var55;
                this.field1523[var57] = var53;
                this.field1532[var57] = var54;
                this.field1525[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method3427() + var56;
                var56 = var55;
                this.field1523[var57] = var53;
                this.field1532[var57] = var54;
                this.field1525[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method3427() + var56;
                var56 = var55;
                this.field1523[var57] = var53;
                this.field1532[var57] = var54;
                this.field1525[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method3427() + var56;
                var56 = var55;
                this.field1523[var57] = var53;
                this.field1532[var57] = var61;
                this.field1525[var57] = var55;
            }
        }
        var4.field2414 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1534[var62] = 0;
            this.field1535[var62] = (short) var4.method3346();
            this.field1536[var62] = (short) var4.method3346();
            this.field1537[var62] = (short) var4.method3346();
        }
        if (this.field1529 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1529[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1535[var65] & 0xFFFF) == this.field1523[var64] && (this.field1536[var65] & 0xFFFF) == this.field1532[var64] && (this.field1537[var65] & 0xFFFF) == this.field1525[var64]) {
                        this.field1529[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1529 = null;
            }
        }
        if (!var3) {
            this.field1531 = null;
        }
        if (!var2) {
            this.field1526 = null;
        }
    }

    public class116(class116[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1519 = 0;
        this.field1539 = 0;
        this.field1542 = 0;
        this.field1550 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class116 var10 = arg0[var9];
            if (var10 != null) {
                this.field1519 += var10.field1519;
                this.field1539 += var10.field1539;
                this.field1542 += var10.field1542;
                if (var10.field1527 == null) {
                    if (this.field1550 == -1) {
                        this.field1550 = var10.field1550;
                    }
                    if (this.field1550 != var10.field1550) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1526 != null;
                var5 |= var10.field1522 != null;
                var6 |= var10.field1556 != null;
                var7 |= var10.field1531 != null;
                var8 |= var10.field1529 != null;
            }
        }
        this.field1543 = new int[this.field1519];
        this.field1520 = new int[this.field1519];
        this.field1521 = new int[this.field1519];
        this.field1541 = new int[this.field1519];
        this.field1523 = new int[this.field1539];
        this.field1532 = new int[this.field1539];
        this.field1525 = new int[this.field1539];
        if (var3) {
            this.field1526 = new byte[this.field1539];
        }
        if (var4) {
            this.field1527 = new byte[this.field1539];
        }
        if (var5) {
            this.field1522 = new byte[this.field1539];
        }
        if (var6) {
            this.field1556 = new int[this.field1539];
        }
        if (var7) {
            this.field1531 = new short[this.field1539];
        }
        if (var8) {
            this.field1529 = new byte[this.field1539];
        }
        this.field1518 = new short[this.field1539];
        if (this.field1542 > 0) {
            this.field1534 = new byte[this.field1542];
            this.field1535 = new short[this.field1542];
            this.field1536 = new short[this.field1542];
            this.field1537 = new short[this.field1542];
        }
        this.field1519 = 0;
        this.field1539 = 0;
        this.field1542 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class116 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1539; var13++) {
                    if (var3 && var12.field1526 != null) {
                        this.field1526[this.field1539] = var12.field1526[var13];
                    }
                    if (var4) {
                        if (var12.field1527 == null) {
                            this.field1527[this.field1539] = var12.field1550;
                        } else {
                            this.field1527[this.field1539] = var12.field1527[var13];
                        }
                    }
                    if (var5 && var12.field1522 != null) {
                        this.field1522[this.field1539] = var12.field1522[var13];
                    }
                    if (var6 && var12.field1556 != null) {
                        this.field1556[this.field1539] = var12.field1556[var13];
                    }
                    if (var7) {
                        if (var12.field1531 == null) {
                            this.field1531[this.field1539] = -1;
                        } else {
                            this.field1531[this.field1539] = var12.field1531[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1529 == null || var12.field1529[var13] == -1) {
                            this.field1529[this.field1539] = -1;
                        } else {
                            this.field1529[this.field1539] = (byte) (var12.field1529[var13] + this.field1542);
                        }
                    }
                    this.field1518[this.field1539] = var12.field1518[var13];
                    this.field1523[this.field1539] = this.method2473(var12, var12.field1523[var13]);
                    this.field1532[this.field1539] = this.method2473(var12, var12.field1532[var13]);
                    this.field1525[this.field1539] = this.method2473(var12, var12.field1525[var13]);
                    this.field1539++;
                }
                for (int var14 = 0; var14 < var12.field1542; var14++) {
                    byte var15 = this.field1534[this.field1542] = var12.field1534[var14];
                    if (var15 == 0) {
                        this.field1535[this.field1542] = (short) this.method2473(var12, var12.field1535[var14]);
                        this.field1536[this.field1542] = (short) this.method2473(var12, var12.field1536[var14]);
                        this.field1537[this.field1542] = (short) this.method2473(var12, var12.field1537[var14]);
                    }
                    this.field1542++;
                }
            }
        }
    }

    @ObfuscatedName("db.s(Ldb;I)I")
    public final int method2473(class116 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1543[arg1];
        int var5 = arg0.field1520[arg1];
        int var6 = arg0.field1521[arg1];
        for (int var7 = 0; var7 < this.field1519; var7++) {
            if (this.field1543[var7] == var4 && this.field1520[var7] == var5 && this.field1521[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1543[this.field1519] = var4;
            this.field1520[this.field1519] = var5;
            this.field1521[this.field1519] = var6;
            if (arg0.field1541 != null) {
                this.field1541[this.field1519] = arg0.field1541[arg1];
            }
            var3 = this.field1519++;
        }
        return var3;
    }

    public class116(class116 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1519 = arg0.field1519;
        this.field1539 = arg0.field1539;
        this.field1542 = arg0.field1542;
        if (arg1) {
            this.field1543 = arg0.field1543;
            this.field1520 = arg0.field1520;
            this.field1521 = arg0.field1521;
        } else {
            this.field1543 = new int[this.field1519];
            this.field1520 = new int[this.field1519];
            this.field1521 = new int[this.field1519];
            for (int var6 = 0; var6 < this.field1519; var6++) {
                this.field1543[var6] = arg0.field1543[var6];
                this.field1520[var6] = arg0.field1520[var6];
                this.field1521[var6] = arg0.field1521[var6];
            }
        }
        if (arg2) {
            this.field1518 = arg0.field1518;
        } else {
            this.field1518 = new short[this.field1539];
            for (int var7 = 0; var7 < this.field1539; var7++) {
                this.field1518[var7] = arg0.field1518[var7];
            }
        }
        if (arg3 || arg0.field1531 == null) {
            this.field1531 = arg0.field1531;
        } else {
            this.field1531 = new short[this.field1539];
            for (int var8 = 0; var8 < this.field1539; var8++) {
                this.field1531[var8] = arg0.field1531[var8];
            }
        }
        if (arg4) {
            this.field1522 = arg0.field1522;
        } else {
            this.field1522 = new byte[this.field1539];
            if (arg0.field1522 == null) {
                for (int var9 = 0; var9 < this.field1539; var9++) {
                    this.field1522[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1539; var10++) {
                    this.field1522[var10] = arg0.field1522[var10];
                }
            }
        }
        this.field1523 = arg0.field1523;
        this.field1532 = arg0.field1532;
        this.field1525 = arg0.field1525;
        this.field1526 = arg0.field1526;
        this.field1527 = arg0.field1527;
        this.field1529 = arg0.field1529;
        this.field1550 = arg0.field1550;
        this.field1534 = arg0.field1534;
        this.field1535 = arg0.field1535;
        this.field1536 = arg0.field1536;
        this.field1537 = arg0.field1537;
        this.field1541 = arg0.field1541;
        this.field1556 = arg0.field1556;
        this.field1540 = arg0.field1540;
        this.field1551 = arg0.field1551;
        this.field1528 = arg0.field1528;
        this.field1538 = arg0.field1538;
        this.field1544 = arg0.field1544;
        this.field1545 = arg0.field1545;
        this.field1546 = arg0.field1546;
    }

    @ObfuscatedName("db.e()Ldb;")
    public class116 method2439() {
        class116 var1 = new class116();
        if (this.field1526 != null) {
            var1.field1526 = new byte[this.field1539];
            for (int var2 = 0; var2 < this.field1539; var2++) {
                var1.field1526[var2] = this.field1526[var2];
            }
        }
        var1.field1519 = this.field1519;
        var1.field1539 = this.field1539;
        var1.field1542 = this.field1542;
        var1.field1543 = this.field1543;
        var1.field1520 = this.field1520;
        var1.field1521 = this.field1521;
        var1.field1523 = this.field1523;
        var1.field1532 = this.field1532;
        var1.field1525 = this.field1525;
        var1.field1527 = this.field1527;
        var1.field1522 = this.field1522;
        var1.field1529 = this.field1529;
        var1.field1518 = this.field1518;
        var1.field1531 = this.field1531;
        var1.field1550 = this.field1550;
        var1.field1534 = this.field1534;
        var1.field1535 = this.field1535;
        var1.field1536 = this.field1536;
        var1.field1537 = this.field1537;
        var1.field1541 = this.field1541;
        var1.field1556 = this.field1556;
        var1.field1540 = this.field1540;
        var1.field1551 = this.field1551;
        var1.field1528 = this.field1528;
        var1.field1538 = this.field1538;
        var1.field1545 = this.field1545;
        var1.field1546 = this.field1546;
        return var1;
    }

    @ObfuscatedName("db.c([[IIIIZI)Ldb;")
    public class116 method2440(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2453();
        int var7 = this.field1549 + arg1;
        int var8 = this.field1524 + arg1;
        int var9 = this.field1530 + arg3;
        int var10 = this.field1533 + arg3;
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
            var15.field1519 = this.field1519;
            var15.field1539 = this.field1539;
            var15.field1542 = this.field1542;
            var15.field1543 = this.field1543;
            var15.field1521 = this.field1521;
            var15.field1523 = this.field1523;
            var15.field1532 = this.field1532;
            var15.field1525 = this.field1525;
            var15.field1526 = this.field1526;
            var15.field1527 = this.field1527;
            var15.field1522 = this.field1522;
            var15.field1529 = this.field1529;
            var15.field1518 = this.field1518;
            var15.field1531 = this.field1531;
            var15.field1550 = this.field1550;
            var15.field1534 = this.field1534;
            var15.field1535 = this.field1535;
            var15.field1536 = this.field1536;
            var15.field1537 = this.field1537;
            var15.field1541 = this.field1541;
            var15.field1556 = this.field1556;
            var15.field1540 = this.field1540;
            var15.field1551 = this.field1551;
            var15.field1545 = this.field1545;
            var15.field1546 = this.field1546;
            var15.field1520 = new int[var15.field1519];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1519; var16++) {
                int var17 = this.field1543[var16] + arg1;
                int var18 = this.field1521[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1520[var16] = this.field1520[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1519; var26++) {
                int var27 = (-this.field1520[var26] << 16) / this.field1841;
                if (var27 < arg5) {
                    int var28 = this.field1543[var26] + arg1;
                    int var29 = this.field1521[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1520[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1520[var26];
                }
            }
        }
        var15.method2452();
        return var15;
    }

    @ObfuscatedName("db.p()V")
    public void method2441() {
        int var10002;
        if (this.field1541 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1519; var3++) {
                int var4 = this.field1541[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1540 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1540[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1519) {
                int var7 = this.field1541[var6];
                this.field1540[var7][var1[var7]++] = var6++;
            }
            this.field1541 = null;
        }
        if (this.field1556 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1539; var10++) {
            int var11 = this.field1556[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1551 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1551[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1539) {
            int var14 = this.field1556[var13];
            this.field1551[var14][var8[var14]++] = var13++;
        }
        this.field1556 = null;
    }

    @ObfuscatedName("db.r()V")
    public void method2442() {
        for (int var1 = 0; var1 < this.field1519; var1++) {
            int var2 = this.field1543[var1];
            this.field1543[var1] = this.field1521[var1];
            this.field1521[var1] = -var2;
        }
        this.method2452();
    }

    @ObfuscatedName("db.d()V")
    public void method2476() {
        for (int var1 = 0; var1 < this.field1519; var1++) {
            this.field1543[var1] = -this.field1543[var1];
            this.field1521[var1] = -this.field1521[var1];
        }
        this.method2452();
    }

    @ObfuscatedName("db.z()V")
    public void method2444() {
        for (int var1 = 0; var1 < this.field1519; var1++) {
            int var2 = this.field1521[var1];
            this.field1521[var1] = this.field1543[var1];
            this.field1543[var1] = -var2;
        }
        this.method2452();
    }

    @ObfuscatedName("db.x(I)V")
    public void method2445(int arg0) {
        int var2 = field1552[arg0];
        int var3 = field1557[arg0];
        for (int var4 = 0; var4 < this.field1519; var4++) {
            int var5 = this.field1543[var4] * var3 + this.field1521[var4] * var2 >> 16;
            this.field1521[var4] = this.field1521[var4] * var3 - this.field1543[var4] * var2 >> 16;
            this.field1543[var4] = var5;
        }
        this.method2452();
    }

    @ObfuscatedName("db.v(III)V")
    public void method2446(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1519; var4++) {
            this.field1543[var4] += arg0;
            this.field1520[var4] += arg1;
            this.field1521[var4] += arg2;
        }
        this.method2452();
    }

    @ObfuscatedName("db.g(SS)V")
    public void method2447(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1539; var3++) {
            if (this.field1518[var3] == arg0) {
                this.field1518[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("db.u(SS)V")
    public void method2448(short arg0, short arg1) {
        if (this.field1531 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1539; var3++) {
            if (this.field1531[var3] == arg0) {
                this.field1531[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("db.o()V")
    public void method2449() {
        for (int var1 = 0; var1 < this.field1519; var1++) {
            this.field1521[var1] = -this.field1521[var1];
        }
        for (int var2 = 0; var2 < this.field1539; var2++) {
            int var3 = this.field1523[var2];
            this.field1523[var2] = this.field1525[var2];
            this.field1525[var2] = var3;
        }
        this.method2452();
    }

    @ObfuscatedName("db.i(III)V")
    public void method2450(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1519; var4++) {
            this.field1543[var4] = this.field1543[var4] * arg0 / 128;
            this.field1520[var4] = this.field1520[var4] * arg1 / 128;
            this.field1521[var4] = this.field1521[var4] * arg2 / 128;
        }
        this.method2452();
    }

    @ObfuscatedName("db.k()V")
    public void method2451() {
        if (this.field1528 != null) {
            return;
        }
        this.field1528 = new class124[this.field1519];
        for (int var1 = 0; var1 < this.field1519; var1++) {
            this.field1528[var1] = new class124();
        }
        for (int var2 = 0; var2 < this.field1539; var2++) {
            int var3 = this.field1523[var2];
            int var4 = this.field1532[var2];
            int var5 = this.field1525[var2];
            int var6 = this.field1543[var4] - this.field1543[var3];
            int var7 = this.field1520[var4] - this.field1520[var3];
            int var8 = this.field1521[var4] - this.field1521[var3];
            int var9 = this.field1543[var5] - this.field1543[var3];
            int var10 = this.field1520[var5] - this.field1520[var3];
            int var11 = this.field1521[var5] - this.field1521[var3];
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
            if (this.field1526 == null) {
                var19 = 0;
            } else {
                var19 = this.field1526[var2];
            }
            if (var19 == 0) {
                class124 var20 = this.field1528[var3];
                var20.field1718 += var16;
                var20.field1719 += var17;
                var20.field1723 += var18;
                var20.field1721++;
                class124 var21 = this.field1528[var4];
                var21.field1718 += var16;
                var21.field1719 += var17;
                var21.field1723 += var18;
                var21.field1721++;
                class124 var22 = this.field1528[var5];
                var22.field1718 += var16;
                var22.field1719 += var17;
                var22.field1723 += var18;
                var22.field1721++;
            } else if (var19 == 1) {
                if (this.field1538 == null) {
                    this.field1538 = new class132[this.field1539];
                }
                class132 var23 = this.field1538[var2] = new class132();
                var23.field1852 = var16;
                var23.field1851 = var17;
                var23.field1853 = var18;
            }
        }
    }

    @ObfuscatedName("db.q()V")
    public void method2452() {
        this.field1528 = null;
        this.field1544 = null;
        this.field1538 = null;
        this.field1547 = false;
    }

    @ObfuscatedName("db.y()V")
    public void method2453() {
        if (this.field1547) {
            return;
        }
        this.field1841 = 0;
        this.field1548 = 0;
        this.field1549 = 999999;
        this.field1524 = -999999;
        this.field1533 = -99999;
        this.field1530 = 99999;
        for (int var1 = 0; var1 < this.field1519; var1++) {
            int var2 = this.field1543[var1];
            int var3 = this.field1520[var1];
            int var4 = this.field1521[var1];
            if (var2 < this.field1549) {
                this.field1549 = var2;
            }
            if (var2 > this.field1524) {
                this.field1524 = var2;
            }
            if (var4 < this.field1530) {
                this.field1530 = var4;
            }
            if (var4 > this.field1533) {
                this.field1533 = var4;
            }
            if (-var3 > this.field1841) {
                this.field1841 = -var3;
            }
            if (var3 > this.field1548) {
                this.field1548 = var3;
            }
        }
        this.field1547 = true;
    }

    @ObfuscatedName("db.av(Ldb;Ldb;IIIZ)V")
    public static void method2463(class116 arg0, class116 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2453();
        arg0.method2451();
        arg1.method2453();
        arg1.method2451();
        field1555++;
        int var6 = 0;
        int[] var7 = arg1.field1543;
        int var8 = arg1.field1519;
        for (int var9 = 0; var9 < arg0.field1519; var9++) {
            class124 var10 = arg0.field1528[var9];
            if (var10.field1721 != 0) {
                int var11 = arg0.field1520[var9] - arg3;
                if (var11 <= arg1.field1548) {
                    int var12 = arg0.field1543[var9] - arg2;
                    if (var12 >= arg1.field1549 && var12 <= arg1.field1524) {
                        int var13 = arg0.field1521[var9] - arg4;
                        if (var13 >= arg1.field1530 && var13 <= arg1.field1533) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class124 var15 = arg1.field1528[var14];
                                if (var7[var14] == var12 && arg1.field1521[var14] == var13 && arg1.field1520[var14] == var11 && var15.field1721 != 0) {
                                    if (arg0.field1544 == null) {
                                        arg0.field1544 = new class124[arg0.field1519];
                                    }
                                    if (arg1.field1544 == null) {
                                        arg1.field1544 = new class124[var8];
                                    }
                                    class124 var16 = arg0.field1544[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1544[var9] = new class124(var10);
                                    }
                                    class124 var17 = arg1.field1544[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1544[var14] = new class124(var15);
                                    }
                                    var16.field1718 += var15.field1718;
                                    var16.field1719 += var15.field1719;
                                    var16.field1723 += var15.field1723;
                                    var16.field1721 += var15.field1721;
                                    var17.field1718 += var10.field1718;
                                    var17.field1719 += var10.field1719;
                                    var17.field1723 += var10.field1723;
                                    var17.field1721 += var10.field1721;
                                    var6++;
                                    field1553[var9] = field1555;
                                    field1554[var14] = field1555;
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
        for (int var18 = 0; var18 < arg0.field1539; var18++) {
            if (field1553[arg0.field1523[var18]] == field1555 && field1553[arg0.field1532[var18]] == field1555 && field1553[arg0.field1525[var18]] == field1555) {
                if (arg0.field1526 == null) {
                    arg0.field1526 = new byte[arg0.field1539];
                }
                arg0.field1526[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1539; var19++) {
            if (field1554[arg1.field1523[var19]] == field1555 && field1554[arg1.field1532[var19]] == field1555 && field1554[arg1.field1525[var19]] == field1555) {
                if (arg1.field1526 == null) {
                    arg1.field1526 = new byte[arg1.field1539];
                }
                arg1.field1526[var19] = 2;
            }
        }
    }

    @ObfuscatedName("db.ag(IIIII)Lds;")
    public final class122 method2468(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2451();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class122 var8 = new class122();
        var8.field1649 = new int[this.field1539];
        var8.field1650 = new int[this.field1539];
        var8.field1637 = new int[this.field1539];
        if (this.field1542 > 0 && this.field1529 != null) {
            int[] var9 = new int[this.field1542];
            for (int var10 = 0; var10 < this.field1539; var10++) {
                if (this.field1529[var10] != -1) {
                    var9[this.field1529[var10] & 0xFF]++;
                }
            }
            var8.field1651 = 0;
            for (int var11 = 0; var11 < this.field1542; var11++) {
                if (var9[var11] > 0 && this.field1534[var11] == 0) {
                    var8.field1651++;
                }
            }
            var8.field1672 = new int[var8.field1651];
            var8.field1657 = new int[var8.field1651];
            var8.field1660 = new int[var8.field1651];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1542; var13++) {
                if (var9[var13] > 0 && this.field1534[var13] == 0) {
                    var8.field1672[var12] = this.field1535[var13] & 0xFFFF;
                    var8.field1657[var12] = this.field1536[var13] & 0xFFFF;
                    var8.field1660[var12] = this.field1537[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1654 = new byte[this.field1539];
            for (int var14 = 0; var14 < this.field1539; var14++) {
                if (this.field1529[var14] == -1) {
                    var8.field1654[var14] = -1;
                } else {
                    var8.field1654[var14] = (byte) var9[this.field1529[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1539; var15++) {
            byte var16;
            if (this.field1526 == null) {
                var16 = 0;
            } else {
                var16 = this.field1526[var15];
            }
            byte var17;
            if (this.field1522 == null) {
                var17 = 0;
            } else {
                var17 = this.field1522[var15];
            }
            short var18;
            if (this.field1531 == null) {
                var18 = -1;
            } else {
                var18 = this.field1531[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1518[var15] & 0xFFFF;
                    class124 var20;
                    if (this.field1544 == null || this.field1544[this.field1523[var15]] == null) {
                        var20 = this.field1528[this.field1523[var15]];
                    } else {
                        var20 = this.field1544[this.field1523[var15]];
                    }
                    int var21 = (var20.field1723 * arg4 + var20.field1719 * arg3 + var20.field1718 * arg2) / (var20.field1721 * var7) + arg0;
                    var8.field1649[var15] = method2506(var19, var21);
                    class124 var22;
                    if (this.field1544 == null || this.field1544[this.field1532[var15]] == null) {
                        var22 = this.field1528[this.field1532[var15]];
                    } else {
                        var22 = this.field1544[this.field1532[var15]];
                    }
                    int var23 = (var22.field1723 * arg4 + var22.field1719 * arg3 + var22.field1718 * arg2) / (var22.field1721 * var7) + arg0;
                    var8.field1650[var15] = method2506(var19, var23);
                    class124 var24;
                    if (this.field1544 == null || this.field1544[this.field1525[var15]] == null) {
                        var24 = this.field1528[this.field1525[var15]];
                    } else {
                        var24 = this.field1544[this.field1525[var15]];
                    }
                    int var25 = (var24.field1723 * arg4 + var24.field1719 * arg3 + var24.field1718 * arg2) / (var24.field1721 * var7) + arg0;
                    var8.field1637[var15] = method2506(var19, var25);
                } else if (var16 == 1) {
                    class132 var26 = this.field1538[var15];
                    int var27 = (var26.field1853 * arg4 + var26.field1852 * arg2 + var26.field1851 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1649[var15] = method2506(this.field1518[var15] & 0xFFFF, var27);
                    var8.field1637[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1649[var15] = 128;
                    var8.field1637[var15] = -1;
                } else {
                    var8.field1637[var15] = -2;
                }
            } else if (var16 == 0) {
                class124 var28;
                if (this.field1544 == null || this.field1544[this.field1523[var15]] == null) {
                    var28 = this.field1528[this.field1523[var15]];
                } else {
                    var28 = this.field1544[this.field1523[var15]];
                }
                int var29 = (var28.field1723 * arg4 + var28.field1719 * arg3 + var28.field1718 * arg2) / (var28.field1721 * var7) + arg0;
                var8.field1649[var15] = method2512(var29);
                class124 var30;
                if (this.field1544 == null || this.field1544[this.field1532[var15]] == null) {
                    var30 = this.field1528[this.field1532[var15]];
                } else {
                    var30 = this.field1544[this.field1532[var15]];
                }
                int var31 = (var30.field1723 * arg4 + var30.field1719 * arg3 + var30.field1718 * arg2) / (var30.field1721 * var7) + arg0;
                var8.field1650[var15] = method2512(var31);
                class124 var32;
                if (this.field1544 == null || this.field1544[this.field1525[var15]] == null) {
                    var32 = this.field1528[this.field1525[var15]];
                } else {
                    var32 = this.field1544[this.field1525[var15]];
                }
                int var33 = (var32.field1723 * arg4 + var32.field1719 * arg3 + var32.field1718 * arg2) / (var32.field1721 * var7) + arg0;
                var8.field1637[var15] = method2512(var33);
            } else if (var16 == 1) {
                class132 var34 = this.field1538[var15];
                int var35 = (var34.field1853 * arg4 + var34.field1852 * arg2 + var34.field1851 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1649[var15] = method2512(var35);
                var8.field1637[var15] = -1;
            } else {
                var8.field1637[var15] = -2;
            }
        }
        this.method2441();
        var8.field1704 = this.field1519;
        var8.field1642 = this.field1543;
        var8.field1705 = this.field1520;
        var8.field1644 = this.field1521;
        var8.field1645 = this.field1539;
        var8.field1646 = this.field1523;
        var8.field1684 = this.field1532;
        var8.field1648 = this.field1525;
        var8.field1683 = this.field1527;
        var8.field1653 = this.field1522;
        var8.field1656 = this.field1550;
        var8.field1687 = this.field1540;
        var8.field1662 = this.field1551;
        var8.field1655 = this.field1531;
        return var8;
    }

    @ObfuscatedName("db.af(II)I")
    public static final int method2506(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("db.az(I)I")
    public static final int method2512(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
