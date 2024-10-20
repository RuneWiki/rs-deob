package deob;

@ObfuscatedName("db")
public class class114 extends class128 {

    @ObfuscatedName("db.z")
    public int field1462 = 0;

    @ObfuscatedName("db.w")
    public int[] field1461;

    @ObfuscatedName("db.s")
    public int[] field1491;

    @ObfuscatedName("db.l")
    public int[] field1463;

    @ObfuscatedName("db.u")
    public int field1464 = 0;

    @ObfuscatedName("db.q")
    public int[] field1478;

    @ObfuscatedName("db.k")
    public int[] field1466;

    @ObfuscatedName("db.i")
    public int[] field1467;

    @ObfuscatedName("db.x")
    public byte[] field1468;

    @ObfuscatedName("db.e")
    public byte[] field1469;

    @ObfuscatedName("db.p")
    public byte[] field1470;

    @ObfuscatedName("db.b")
    public byte[] field1471;

    @ObfuscatedName("db.n")
    public short[] field1472;

    @ObfuscatedName("db.f")
    public short[] field1473;

    @ObfuscatedName("db.g")
    public byte field1474 = 0;

    @ObfuscatedName("db.m")
    public int field1485;

    @ObfuscatedName("db.r")
    public byte[] field1460;

    @ObfuscatedName("db.t")
    public short[] field1477;

    @ObfuscatedName("db.o")
    public short[] field1492;

    @ObfuscatedName("db.y")
    public short[] field1465;

    @ObfuscatedName("db.a")
    public int[] field1480;

    @ObfuscatedName("db.j")
    public int[] field1479;

    @ObfuscatedName("db.d")
    public int[][] field1482;

    @ObfuscatedName("db.h")
    public int[][] field1483;

    @ObfuscatedName("db.c")
    public class130[] field1484;

    @ObfuscatedName("db.v")
    public class122[] field1497;

    @ObfuscatedName("db.af")
    public class122[] field1486;

    @ObfuscatedName("db.ah")
    public short field1487;

    @ObfuscatedName("db.ab")
    public short field1488;

    @ObfuscatedName("db.aw")
    public boolean field1489 = false;

    @ObfuscatedName("db.ak")
    public int field1490;

    @ObfuscatedName("db.as")
    public int field1481;

    @ObfuscatedName("db.an")
    public int field1493;

    @ObfuscatedName("db.ao")
    public int field1499;

    @ObfuscatedName("db.at")
    public int field1494;

    @ObfuscatedName("db.ai")
    public static int[] field1495 = new int[10000];

    @ObfuscatedName("db.ac")
    public static int[] field1476 = new int[10000];

    @ObfuscatedName("db.ap")
    public static int field1475 = 0;

    @ObfuscatedName("db.aa")
    public static int[] field1498 = class123.field1682;

    @ObfuscatedName("db.ar")
    public static int[] field1496 = class123.field1694;

    public class114() {
    }

    @ObfuscatedName("db.z(Lir;II)Ldb;")
    public static class114 method2364(class248 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4247(arg1, arg2);
        return var3 == null ? null : new class114(var3);
    }

    public class114(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2428(arg0);
        } else {
            this.method2366(arg0);
        }
    }

    @ObfuscatedName("db.w([B)V")
    public void method2428(byte[] arg0) {
        class183 var2 = new class183(arg0);
        class183 var3 = new class183(arg0);
        class183 var4 = new class183(arg0);
        class183 var5 = new class183(arg0);
        class183 var6 = new class183(arg0);
        class183 var7 = new class183(arg0);
        class183 var8 = new class183(arg0);
        var2.field2340 = arg0.length - 23;
        int var9 = var2.method3253();
        int var10 = var2.method3253();
        int var11 = var2.method3247();
        int var12 = var2.method3247();
        int var13 = var2.method3247();
        int var14 = var2.method3247();
        int var15 = var2.method3247();
        int var16 = var2.method3247();
        int var17 = var2.method3247();
        int var18 = var2.method3253();
        int var19 = var2.method3253();
        int var20 = var2.method3253();
        int var21 = var2.method3253();
        int var22 = var2.method3253();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1460 = new byte[var11];
            var2.field2340 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1460[var26] = var2.method3384();
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
        this.field1462 = var9;
        this.field1464 = var10;
        this.field1485 = var11;
        this.field1461 = new int[var9];
        this.field1491 = new int[var9];
        this.field1463 = new int[var9];
        this.field1478 = new int[var10];
        this.field1466 = new int[var10];
        this.field1467 = new int[var10];
        if (var17 == 1) {
            this.field1480 = new int[var9];
        }
        if (var12 == 1) {
            this.field1468 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1469 = new byte[var10];
        } else {
            this.field1474 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1470 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1479 = new int[var10];
        }
        if (var16 == 1) {
            this.field1473 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1471 = new byte[var10];
        }
        this.field1472 = new short[var10];
        if (var11 > 0) {
            this.field1477 = new short[var11];
            this.field1492 = new short[var11];
            this.field1465 = new short[var11];
        }
        var2.field2340 = var11;
        var3.field2340 = var44;
        var4.field2340 = var46;
        var5.field2340 = var48;
        var6.field2340 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method3247();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method3264();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method3264();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method3264();
            }
            this.field1461[var67] = var64 + var69;
            this.field1491[var67] = var65 + var70;
            this.field1463[var67] = var66 + var71;
            var64 = this.field1461[var67];
            var65 = this.field1491[var67];
            var66 = this.field1463[var67];
            if (var17 == 1) {
                this.field1480[var67] = var6.method3247();
            }
        }
        var2.field2340 = var42;
        var3.field2340 = var31;
        var4.field2340 = var34;
        var5.field2340 = var37;
        var6.field2340 = var35;
        var7.field2340 = var40;
        var8.field2340 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1472[var72] = (short) var2.method3253();
            if (var12 == 1) {
                this.field1468[var72] = var3.method3384();
            }
            if (var13 == 255) {
                this.field1469[var72] = var4.method3384();
            }
            if (var14 == 1) {
                this.field1470[var72] = var5.method3384();
            }
            if (var15 == 1) {
                this.field1479[var72] = var6.method3247();
            }
            if (var16 == 1) {
                this.field1473[var72] = (short) (var7.method3253() - 1);
            }
            if (this.field1471 != null && this.field1473[var72] != -1) {
                this.field1471[var72] = (byte) (var8.method3247() - 1);
            }
        }
        var2.field2340 = var33;
        var3.field2340 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method3247();
            if (var78 == 1) {
                var73 = var2.method3264() + var76;
                var74 = var2.method3264() + var73;
                var75 = var2.method3264() + var74;
                var76 = var75;
                this.field1478[var77] = var73;
                this.field1466[var77] = var74;
                this.field1467[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method3264() + var76;
                var76 = var75;
                this.field1478[var77] = var73;
                this.field1466[var77] = var74;
                this.field1467[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method3264() + var76;
                var76 = var75;
                this.field1478[var77] = var73;
                this.field1466[var77] = var74;
                this.field1467[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method3264() + var76;
                var76 = var75;
                this.field1478[var77] = var73;
                this.field1466[var77] = var81;
                this.field1467[var77] = var75;
            }
        }
        var2.field2340 = var50;
        var3.field2340 = var52;
        var4.field2340 = var54;
        var5.field2340 = var56;
        var6.field2340 = var58;
        var7.field2340 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1460[var82] & 0xFF;
            if (var83 == 0) {
                this.field1477[var82] = (short) var2.method3253();
                this.field1492[var82] = (short) var2.method3253();
                this.field1465[var82] = (short) var2.method3253();
            }
        }
        var2.field2340 = var62;
        int var84 = var2.method3247();
        if (var84 == 0) {
            return;
        }
        new class127();
        var2.method3253();
        var2.method3253();
        var2.method3253();
        var2.method3374();
    }

    @ObfuscatedName("db.s([B)V")
    public void method2366(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class183 var4 = new class183(arg0);
        class183 var5 = new class183(arg0);
        class183 var6 = new class183(arg0);
        class183 var7 = new class183(arg0);
        class183 var8 = new class183(arg0);
        var4.field2340 = arg0.length - 18;
        int var9 = var4.method3253();
        int var10 = var4.method3253();
        int var11 = var4.method3247();
        int var12 = var4.method3247();
        int var13 = var4.method3247();
        int var14 = var4.method3247();
        int var15 = var4.method3247();
        int var16 = var4.method3247();
        int var17 = var4.method3253();
        int var18 = var4.method3253();
        int var19 = var4.method3253();
        int var20 = var4.method3253();
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
        this.field1462 = var9;
        this.field1464 = var10;
        this.field1485 = var11;
        this.field1461 = new int[var9];
        this.field1491 = new int[var9];
        this.field1463 = new int[var9];
        this.field1478 = new int[var10];
        this.field1466 = new int[var10];
        this.field1467 = new int[var10];
        if (var11 > 0) {
            this.field1460 = new byte[var11];
            this.field1477 = new short[var11];
            this.field1492 = new short[var11];
            this.field1465 = new short[var11];
        }
        if (var16 == 1) {
            this.field1480 = new int[var9];
        }
        if (var12 == 1) {
            this.field1468 = new byte[var10];
            this.field1471 = new byte[var10];
            this.field1473 = new short[var10];
        }
        if (var13 == 255) {
            this.field1469 = new byte[var10];
        } else {
            this.field1474 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1470 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1479 = new int[var10];
        }
        this.field1472 = new short[var10];
        var4.field2340 = var21;
        var5.field2340 = var36;
        var6.field2340 = var38;
        var7.field2340 = var40;
        var8.field2340 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method3247();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method3264();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method3264();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method3264();
            }
            this.field1461[var46] = var43 + var48;
            this.field1491[var46] = var44 + var49;
            this.field1463[var46] = var45 + var50;
            var43 = this.field1461[var46];
            var44 = this.field1491[var46];
            var45 = this.field1463[var46];
            if (var16 == 1) {
                this.field1480[var46] = var8.method3247();
            }
        }
        var4.field2340 = var32;
        var5.field2340 = var28;
        var6.field2340 = var26;
        var7.field2340 = var30;
        var8.field2340 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1472[var51] = (short) var4.method3253();
            if (var12 == 1) {
                int var52 = var5.method3247();
                if ((var52 & 0x1) == 1) {
                    this.field1468[var51] = 1;
                    var2 = true;
                } else {
                    this.field1468[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1471[var51] = (byte) (var52 >> 2);
                    this.field1473[var51] = this.field1472[var51];
                    this.field1472[var51] = 127;
                    if (this.field1473[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1471[var51] = -1;
                    this.field1473[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1469[var51] = var6.method3384();
            }
            if (var14 == 1) {
                this.field1470[var51] = var7.method3384();
            }
            if (var15 == 1) {
                this.field1479[var51] = var8.method3247();
            }
        }
        var4.field2340 = var25;
        var5.field2340 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method3247();
            if (var58 == 1) {
                var53 = var4.method3264() + var56;
                var54 = var4.method3264() + var53;
                var55 = var4.method3264() + var54;
                var56 = var55;
                this.field1478[var57] = var53;
                this.field1466[var57] = var54;
                this.field1467[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method3264() + var56;
                var56 = var55;
                this.field1478[var57] = var53;
                this.field1466[var57] = var54;
                this.field1467[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method3264() + var56;
                var56 = var55;
                this.field1478[var57] = var53;
                this.field1466[var57] = var54;
                this.field1467[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method3264() + var56;
                var56 = var55;
                this.field1478[var57] = var53;
                this.field1466[var57] = var61;
                this.field1467[var57] = var55;
            }
        }
        var4.field2340 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1460[var62] = 0;
            this.field1477[var62] = (short) var4.method3253();
            this.field1492[var62] = (short) var4.method3253();
            this.field1465[var62] = (short) var4.method3253();
        }
        if (this.field1471 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1471[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1477[var65] & 0xFFFF) == this.field1478[var64] && (this.field1492[var65] & 0xFFFF) == this.field1466[var64] && (this.field1465[var65] & 0xFFFF) == this.field1467[var64]) {
                        this.field1471[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1471 = null;
            }
        }
        if (!var3) {
            this.field1473 = null;
        }
        if (!var2) {
            this.field1468 = null;
        }
    }

    public class114(class114[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1462 = 0;
        this.field1464 = 0;
        this.field1485 = 0;
        this.field1474 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class114 var10 = arg0[var9];
            if (var10 != null) {
                this.field1462 += var10.field1462;
                this.field1464 += var10.field1464;
                this.field1485 += var10.field1485;
                if (var10.field1469 == null) {
                    if (this.field1474 == -1) {
                        this.field1474 = var10.field1474;
                    }
                    if (this.field1474 != var10.field1474) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1468 != null;
                var5 |= var10.field1470 != null;
                var6 |= var10.field1479 != null;
                var7 |= var10.field1473 != null;
                var8 |= var10.field1471 != null;
            }
        }
        this.field1461 = new int[this.field1462];
        this.field1491 = new int[this.field1462];
        this.field1463 = new int[this.field1462];
        this.field1480 = new int[this.field1462];
        this.field1478 = new int[this.field1464];
        this.field1466 = new int[this.field1464];
        this.field1467 = new int[this.field1464];
        if (var3) {
            this.field1468 = new byte[this.field1464];
        }
        if (var4) {
            this.field1469 = new byte[this.field1464];
        }
        if (var5) {
            this.field1470 = new byte[this.field1464];
        }
        if (var6) {
            this.field1479 = new int[this.field1464];
        }
        if (var7) {
            this.field1473 = new short[this.field1464];
        }
        if (var8) {
            this.field1471 = new byte[this.field1464];
        }
        this.field1472 = new short[this.field1464];
        if (this.field1485 > 0) {
            this.field1460 = new byte[this.field1485];
            this.field1477 = new short[this.field1485];
            this.field1492 = new short[this.field1485];
            this.field1465 = new short[this.field1485];
        }
        this.field1462 = 0;
        this.field1464 = 0;
        this.field1485 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class114 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1464; var13++) {
                    if (var3 && var12.field1468 != null) {
                        this.field1468[this.field1464] = var12.field1468[var13];
                    }
                    if (var4) {
                        if (var12.field1469 == null) {
                            this.field1469[this.field1464] = var12.field1474;
                        } else {
                            this.field1469[this.field1464] = var12.field1469[var13];
                        }
                    }
                    if (var5 && var12.field1470 != null) {
                        this.field1470[this.field1464] = var12.field1470[var13];
                    }
                    if (var6 && var12.field1479 != null) {
                        this.field1479[this.field1464] = var12.field1479[var13];
                    }
                    if (var7) {
                        if (var12.field1473 == null) {
                            this.field1473[this.field1464] = -1;
                        } else {
                            this.field1473[this.field1464] = var12.field1473[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1471 == null || var12.field1471[var13] == -1) {
                            this.field1471[this.field1464] = -1;
                        } else {
                            this.field1471[this.field1464] = (byte) (var12.field1471[var13] + this.field1485);
                        }
                    }
                    this.field1472[this.field1464] = var12.field1472[var13];
                    this.field1478[this.field1464] = this.method2368(var12, var12.field1478[var13]);
                    this.field1466[this.field1464] = this.method2368(var12, var12.field1466[var13]);
                    this.field1467[this.field1464] = this.method2368(var12, var12.field1467[var13]);
                    this.field1464++;
                }
                for (int var14 = 0; var14 < var12.field1485; var14++) {
                    byte var15 = this.field1460[this.field1485] = var12.field1460[var14];
                    if (var15 == 0) {
                        this.field1477[this.field1485] = (short) this.method2368(var12, var12.field1477[var14]);
                        this.field1492[this.field1485] = (short) this.method2368(var12, var12.field1492[var14]);
                        this.field1465[this.field1485] = (short) this.method2368(var12, var12.field1465[var14]);
                    }
                    this.field1485++;
                }
            }
        }
    }

    @ObfuscatedName("db.l(Ldb;I)I")
    public final int method2368(class114 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1461[arg1];
        int var5 = arg0.field1491[arg1];
        int var6 = arg0.field1463[arg1];
        for (int var7 = 0; var7 < this.field1462; var7++) {
            if (this.field1461[var7] == var4 && this.field1491[var7] == var5 && this.field1463[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1461[this.field1462] = var4;
            this.field1491[this.field1462] = var5;
            this.field1463[this.field1462] = var6;
            if (arg0.field1480 != null) {
                this.field1480[this.field1462] = arg0.field1480[arg1];
            }
            var3 = this.field1462++;
        }
        return var3;
    }

    public class114(class114 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1462 = arg0.field1462;
        this.field1464 = arg0.field1464;
        this.field1485 = arg0.field1485;
        if (arg1) {
            this.field1461 = arg0.field1461;
            this.field1491 = arg0.field1491;
            this.field1463 = arg0.field1463;
        } else {
            this.field1461 = new int[this.field1462];
            this.field1491 = new int[this.field1462];
            this.field1463 = new int[this.field1462];
            for (int var6 = 0; var6 < this.field1462; var6++) {
                this.field1461[var6] = arg0.field1461[var6];
                this.field1491[var6] = arg0.field1491[var6];
                this.field1463[var6] = arg0.field1463[var6];
            }
        }
        if (arg2) {
            this.field1472 = arg0.field1472;
        } else {
            this.field1472 = new short[this.field1464];
            for (int var7 = 0; var7 < this.field1464; var7++) {
                this.field1472[var7] = arg0.field1472[var7];
            }
        }
        if (arg3 || arg0.field1473 == null) {
            this.field1473 = arg0.field1473;
        } else {
            this.field1473 = new short[this.field1464];
            for (int var8 = 0; var8 < this.field1464; var8++) {
                this.field1473[var8] = arg0.field1473[var8];
            }
        }
        if (arg4) {
            this.field1470 = arg0.field1470;
        } else {
            this.field1470 = new byte[this.field1464];
            if (arg0.field1470 == null) {
                for (int var9 = 0; var9 < this.field1464; var9++) {
                    this.field1470[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1464; var10++) {
                    this.field1470[var10] = arg0.field1470[var10];
                }
            }
        }
        this.field1478 = arg0.field1478;
        this.field1466 = arg0.field1466;
        this.field1467 = arg0.field1467;
        this.field1468 = arg0.field1468;
        this.field1469 = arg0.field1469;
        this.field1471 = arg0.field1471;
        this.field1474 = arg0.field1474;
        this.field1460 = arg0.field1460;
        this.field1477 = arg0.field1477;
        this.field1492 = arg0.field1492;
        this.field1465 = arg0.field1465;
        this.field1480 = arg0.field1480;
        this.field1479 = arg0.field1479;
        this.field1482 = arg0.field1482;
        this.field1483 = arg0.field1483;
        this.field1497 = arg0.field1497;
        this.field1484 = arg0.field1484;
        this.field1486 = arg0.field1486;
        this.field1487 = arg0.field1487;
        this.field1488 = arg0.field1488;
    }

    @ObfuscatedName("db.u()Ldb;")
    public class114 method2446() {
        class114 var1 = new class114();
        if (this.field1468 != null) {
            var1.field1468 = new byte[this.field1464];
            for (int var2 = 0; var2 < this.field1464; var2++) {
                var1.field1468[var2] = this.field1468[var2];
            }
        }
        var1.field1462 = this.field1462;
        var1.field1464 = this.field1464;
        var1.field1485 = this.field1485;
        var1.field1461 = this.field1461;
        var1.field1491 = this.field1491;
        var1.field1463 = this.field1463;
        var1.field1478 = this.field1478;
        var1.field1466 = this.field1466;
        var1.field1467 = this.field1467;
        var1.field1469 = this.field1469;
        var1.field1470 = this.field1470;
        var1.field1471 = this.field1471;
        var1.field1472 = this.field1472;
        var1.field1473 = this.field1473;
        var1.field1474 = this.field1474;
        var1.field1460 = this.field1460;
        var1.field1477 = this.field1477;
        var1.field1492 = this.field1492;
        var1.field1465 = this.field1465;
        var1.field1480 = this.field1480;
        var1.field1479 = this.field1479;
        var1.field1482 = this.field1482;
        var1.field1483 = this.field1483;
        var1.field1497 = this.field1497;
        var1.field1484 = this.field1484;
        var1.field1487 = this.field1487;
        var1.field1488 = this.field1488;
        return var1;
    }

    @ObfuscatedName("db.q([[IIIIZI)Ldb;")
    public class114 method2363(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2423();
        int var7 = this.field1481 + arg1;
        int var8 = this.field1493 + arg1;
        int var9 = this.field1494 + arg3;
        int var10 = this.field1499 + arg3;
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
        class114 var15;
        if (arg4) {
            var15 = new class114();
            var15.field1462 = this.field1462;
            var15.field1464 = this.field1464;
            var15.field1485 = this.field1485;
            var15.field1461 = this.field1461;
            var15.field1463 = this.field1463;
            var15.field1478 = this.field1478;
            var15.field1466 = this.field1466;
            var15.field1467 = this.field1467;
            var15.field1468 = this.field1468;
            var15.field1469 = this.field1469;
            var15.field1470 = this.field1470;
            var15.field1471 = this.field1471;
            var15.field1472 = this.field1472;
            var15.field1473 = this.field1473;
            var15.field1474 = this.field1474;
            var15.field1460 = this.field1460;
            var15.field1477 = this.field1477;
            var15.field1492 = this.field1492;
            var15.field1465 = this.field1465;
            var15.field1480 = this.field1480;
            var15.field1479 = this.field1479;
            var15.field1482 = this.field1482;
            var15.field1483 = this.field1483;
            var15.field1487 = this.field1487;
            var15.field1488 = this.field1488;
            var15.field1491 = new int[var15.field1462];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1462; var16++) {
                int var17 = this.field1461[var16] + arg1;
                int var18 = this.field1463[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1491[var16] = this.field1491[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1462; var26++) {
                int var27 = (-this.field1491[var26] << 16) / this.field1782;
                if (var27 < arg5) {
                    int var28 = this.field1461[var26] + arg1;
                    int var29 = this.field1463[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1491[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1491[var26];
                }
            }
        }
        var15.method2382();
        return var15;
    }

    @ObfuscatedName("db.i()V")
    public void method2371() {
        int var10002;
        if (this.field1480 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1462; var3++) {
                int var4 = this.field1480[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1482 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1482[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1462) {
                int var7 = this.field1480[var6];
                this.field1482[var7][var1[var7]++] = var6++;
            }
            this.field1480 = null;
        }
        if (this.field1479 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1464; var10++) {
            int var11 = this.field1479[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1483 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1483[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1464) {
            int var14 = this.field1479[var13];
            this.field1483[var14][var8[var14]++] = var13++;
        }
        this.field1479 = null;
    }

    @ObfuscatedName("db.x()V")
    public void method2372() {
        for (int var1 = 0; var1 < this.field1462; var1++) {
            int var2 = this.field1461[var1];
            this.field1461[var1] = this.field1463[var1];
            this.field1463[var1] = -var2;
        }
        this.method2382();
    }

    @ObfuscatedName("db.p()V")
    public void method2369() {
        for (int var1 = 0; var1 < this.field1462; var1++) {
            this.field1461[var1] = -this.field1461[var1];
            this.field1463[var1] = -this.field1463[var1];
        }
        this.method2382();
    }

    @ObfuscatedName("db.b()V")
    public void method2374() {
        for (int var1 = 0; var1 < this.field1462; var1++) {
            int var2 = this.field1463[var1];
            this.field1463[var1] = this.field1461[var1];
            this.field1461[var1] = -var2;
        }
        this.method2382();
    }

    @ObfuscatedName("db.n(I)V")
    public void method2449(int arg0) {
        int var2 = field1498[arg0];
        int var3 = field1496[arg0];
        for (int var4 = 0; var4 < this.field1462; var4++) {
            int var5 = this.field1463[var4] * var2 + this.field1461[var4] * var3 >> 16;
            this.field1463[var4] = this.field1463[var4] * var3 - this.field1461[var4] * var2 >> 16;
            this.field1461[var4] = var5;
        }
        this.method2382();
    }

    @ObfuscatedName("db.f(III)V")
    public void method2376(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1462; var4++) {
            this.field1461[var4] += arg0;
            this.field1491[var4] += arg1;
            this.field1463[var4] += arg2;
        }
        this.method2382();
    }

    @ObfuscatedName("db.g(SS)V")
    public void method2377(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1464; var3++) {
            if (this.field1472[var3] == arg0) {
                this.field1472[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("db.m(SS)V")
    public void method2378(short arg0, short arg1) {
        if (this.field1473 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1464; var3++) {
            if (this.field1473[var3] == arg0) {
                this.field1473[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("db.r()V")
    public void method2379() {
        for (int var1 = 0; var1 < this.field1462; var1++) {
            this.field1463[var1] = -this.field1463[var1];
        }
        for (int var2 = 0; var2 < this.field1464; var2++) {
            int var3 = this.field1478[var2];
            this.field1478[var2] = this.field1467[var2];
            this.field1467[var2] = var3;
        }
        this.method2382();
    }

    @ObfuscatedName("db.t(III)V")
    public void method2388(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1462; var4++) {
            this.field1461[var4] = this.field1461[var4] * arg0 / 128;
            this.field1491[var4] = this.field1491[var4] * arg1 / 128;
            this.field1463[var4] = this.field1463[var4] * arg2 / 128;
        }
        this.method2382();
    }

    @ObfuscatedName("db.o()V")
    public void method2381() {
        if (this.field1497 != null) {
            return;
        }
        this.field1497 = new class122[this.field1462];
        for (int var1 = 0; var1 < this.field1462; var1++) {
            this.field1497[var1] = new class122();
        }
        for (int var2 = 0; var2 < this.field1464; var2++) {
            int var3 = this.field1478[var2];
            int var4 = this.field1466[var2];
            int var5 = this.field1467[var2];
            int var6 = this.field1461[var4] - this.field1461[var3];
            int var7 = this.field1491[var4] - this.field1491[var3];
            int var8 = this.field1463[var4] - this.field1463[var3];
            int var9 = this.field1461[var5] - this.field1461[var3];
            int var10 = this.field1491[var5] - this.field1491[var3];
            int var11 = this.field1463[var5] - this.field1463[var3];
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
            if (this.field1468 == null) {
                var19 = 0;
            } else {
                var19 = this.field1468[var2];
            }
            if (var19 == 0) {
                class122 var20 = this.field1497[var3];
                var20.field1666 += var16;
                var20.field1662 += var17;
                var20.field1663 += var18;
                var20.field1667++;
                class122 var21 = this.field1497[var4];
                var21.field1666 += var16;
                var21.field1662 += var17;
                var21.field1663 += var18;
                var21.field1667++;
                class122 var22 = this.field1497[var5];
                var22.field1666 += var16;
                var22.field1662 += var17;
                var22.field1663 += var18;
                var22.field1667++;
            } else if (var19 == 1) {
                if (this.field1484 == null) {
                    this.field1484 = new class130[this.field1464];
                }
                class130 var23 = this.field1484[var2] = new class130();
                var23.field1794 = var16;
                var23.field1795 = var17;
                var23.field1796 = var18;
            }
        }
    }

    @ObfuscatedName("db.y()V")
    public void method2382() {
        this.field1497 = null;
        this.field1486 = null;
        this.field1484 = null;
        this.field1489 = false;
    }

    @ObfuscatedName("db.a()V")
    public void method2423() {
        if (this.field1489) {
            return;
        }
        this.field1782 = 0;
        this.field1490 = 0;
        this.field1481 = 999999;
        this.field1493 = -999999;
        this.field1499 = -99999;
        this.field1494 = 99999;
        for (int var1 = 0; var1 < this.field1462; var1++) {
            int var2 = this.field1461[var1];
            int var3 = this.field1491[var1];
            int var4 = this.field1463[var1];
            if (var2 < this.field1481) {
                this.field1481 = var2;
            }
            if (var2 > this.field1493) {
                this.field1493 = var2;
            }
            if (var4 < this.field1494) {
                this.field1494 = var4;
            }
            if (var4 > this.field1499) {
                this.field1499 = var4;
            }
            if (-var3 > this.field1782) {
                this.field1782 = -var3;
            }
            if (var3 > this.field1490) {
                this.field1490 = var3;
            }
        }
        this.field1489 = true;
    }

    @ObfuscatedName("db.c(Ldb;Ldb;IIIZ)V")
    public static void method2384(class114 arg0, class114 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2423();
        arg0.method2381();
        arg1.method2423();
        arg1.method2381();
        field1475++;
        int var6 = 0;
        int[] var7 = arg1.field1461;
        int var8 = arg1.field1462;
        for (int var9 = 0; var9 < arg0.field1462; var9++) {
            class122 var10 = arg0.field1497[var9];
            if (var10.field1667 != 0) {
                int var11 = arg0.field1491[var9] - arg3;
                if (var11 <= arg1.field1490) {
                    int var12 = arg0.field1461[var9] - arg2;
                    if (var12 >= arg1.field1481 && var12 <= arg1.field1493) {
                        int var13 = arg0.field1463[var9] - arg4;
                        if (var13 >= arg1.field1494 && var13 <= arg1.field1499) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class122 var15 = arg1.field1497[var14];
                                if (var7[var14] == var12 && arg1.field1463[var14] == var13 && arg1.field1491[var14] == var11 && var15.field1667 != 0) {
                                    if (arg0.field1486 == null) {
                                        arg0.field1486 = new class122[arg0.field1462];
                                    }
                                    if (arg1.field1486 == null) {
                                        arg1.field1486 = new class122[var8];
                                    }
                                    class122 var16 = arg0.field1486[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1486[var9] = new class122(var10);
                                    }
                                    class122 var17 = arg1.field1486[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1486[var14] = new class122(var15);
                                    }
                                    var16.field1666 += var15.field1666;
                                    var16.field1662 += var15.field1662;
                                    var16.field1663 += var15.field1663;
                                    var16.field1667 += var15.field1667;
                                    var17.field1666 += var10.field1666;
                                    var17.field1662 += var10.field1662;
                                    var17.field1663 += var10.field1663;
                                    var17.field1667 += var10.field1667;
                                    var6++;
                                    field1495[var9] = field1475;
                                    field1476[var14] = field1475;
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
        for (int var18 = 0; var18 < arg0.field1464; var18++) {
            if (field1495[arg0.field1478[var18]] == field1475 && field1495[arg0.field1466[var18]] == field1475 && field1495[arg0.field1467[var18]] == field1475) {
                if (arg0.field1468 == null) {
                    arg0.field1468 = new byte[arg0.field1464];
                }
                arg0.field1468[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1464; var19++) {
            if (field1476[arg1.field1478[var19]] == field1475 && field1476[arg1.field1466[var19]] == field1475 && field1476[arg1.field1467[var19]] == field1475) {
                if (arg1.field1468 == null) {
                    arg1.field1468 = new byte[arg1.field1464];
                }
                arg1.field1468[var19] = 2;
            }
        }
    }

    @ObfuscatedName("db.v(IIIII)Ldc;")
    public final class120 method2385(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2381();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class120 var8 = new class120();
        var8.field1616 = new int[this.field1464];
        var8.field1621 = new int[this.field1464];
        var8.field1592 = new int[this.field1464];
        if (this.field1485 > 0 && this.field1471 != null) {
            int[] var9 = new int[this.field1485];
            for (int var10 = 0; var10 < this.field1464; var10++) {
                if (this.field1471[var10] != -1) {
                    var9[this.field1471[var10] & 0xFF]++;
                }
            }
            var8.field1598 = 0;
            for (int var11 = 0; var11 < this.field1485; var11++) {
                if (var9[var11] > 0 && this.field1460[var11] == 0) {
                    var8.field1598++;
                }
            }
            var8.field1622 = new int[var8.field1598];
            var8.field1600 = new int[var8.field1598];
            var8.field1601 = new int[var8.field1598];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1485; var13++) {
                if (var9[var13] > 0 && this.field1460[var13] == 0) {
                    var8.field1622[var12] = this.field1477[var13] & 0xFFFF;
                    var8.field1600[var12] = this.field1492[var13] & 0xFFFF;
                    var8.field1601[var12] = this.field1465[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1618 = new byte[this.field1464];
            for (int var14 = 0; var14 < this.field1464; var14++) {
                if (this.field1471[var14] == -1) {
                    var8.field1618[var14] = -1;
                } else {
                    var8.field1618[var14] = (byte) var9[this.field1471[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1464; var15++) {
            byte var16;
            if (this.field1468 == null) {
                var16 = 0;
            } else {
                var16 = this.field1468[var15];
            }
            byte var17;
            if (this.field1470 == null) {
                var17 = 0;
            } else {
                var17 = this.field1470[var15];
            }
            short var18;
            if (this.field1473 == null) {
                var18 = -1;
            } else {
                var18 = this.field1473[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1472[var15] & 0xFFFF;
                    class122 var20;
                    if (this.field1486 == null || this.field1486[this.field1478[var15]] == null) {
                        var20 = this.field1497[this.field1478[var15]];
                    } else {
                        var20 = this.field1486[this.field1478[var15]];
                    }
                    int var21 = (var20.field1663 * arg4 + var20.field1666 * arg2 + var20.field1662 * arg3) / (var20.field1667 * var7) + arg0;
                    var8.field1616[var15] = method2386(var19, var21);
                    class122 var22;
                    if (this.field1486 == null || this.field1486[this.field1466[var15]] == null) {
                        var22 = this.field1497[this.field1466[var15]];
                    } else {
                        var22 = this.field1486[this.field1466[var15]];
                    }
                    int var23 = (var22.field1663 * arg4 + var22.field1666 * arg2 + var22.field1662 * arg3) / (var22.field1667 * var7) + arg0;
                    var8.field1621[var15] = method2386(var19, var23);
                    class122 var24;
                    if (this.field1486 == null || this.field1486[this.field1467[var15]] == null) {
                        var24 = this.field1497[this.field1467[var15]];
                    } else {
                        var24 = this.field1486[this.field1467[var15]];
                    }
                    int var25 = (var24.field1663 * arg4 + var24.field1666 * arg2 + var24.field1662 * arg3) / (var24.field1667 * var7) + arg0;
                    var8.field1592[var15] = method2386(var19, var25);
                } else if (var16 == 1) {
                    class130 var26 = this.field1484[var15];
                    int var27 = (var26.field1796 * arg4 + var26.field1795 * arg3 + var26.field1794 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1616[var15] = method2386(this.field1472[var15] & 0xFFFF, var27);
                    var8.field1592[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1616[var15] = 128;
                    var8.field1592[var15] = -1;
                } else {
                    var8.field1592[var15] = -2;
                }
            } else if (var16 == 0) {
                class122 var28;
                if (this.field1486 == null || this.field1486[this.field1478[var15]] == null) {
                    var28 = this.field1497[this.field1478[var15]];
                } else {
                    var28 = this.field1486[this.field1478[var15]];
                }
                int var29 = (var28.field1663 * arg4 + var28.field1666 * arg2 + var28.field1662 * arg3) / (var28.field1667 * var7) + arg0;
                var8.field1616[var15] = method2387(var29);
                class122 var30;
                if (this.field1486 == null || this.field1486[this.field1466[var15]] == null) {
                    var30 = this.field1497[this.field1466[var15]];
                } else {
                    var30 = this.field1486[this.field1466[var15]];
                }
                int var31 = (var30.field1663 * arg4 + var30.field1666 * arg2 + var30.field1662 * arg3) / (var30.field1667 * var7) + arg0;
                var8.field1621[var15] = method2387(var31);
                class122 var32;
                if (this.field1486 == null || this.field1486[this.field1467[var15]] == null) {
                    var32 = this.field1497[this.field1467[var15]];
                } else {
                    var32 = this.field1486[this.field1467[var15]];
                }
                int var33 = (var32.field1663 * arg4 + var32.field1666 * arg2 + var32.field1662 * arg3) / (var32.field1667 * var7) + arg0;
                var8.field1592[var15] = method2387(var33);
            } else if (var16 == 1) {
                class130 var34 = this.field1484[var15];
                int var35 = (var34.field1796 * arg4 + var34.field1795 * arg3 + var34.field1794 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1616[var15] = method2387(var35);
                var8.field1592[var15] = -1;
            } else {
                var8.field1592[var15] = -2;
            }
        }
        this.method2371();
        var8.field1582 = this.field1462;
        var8.field1647 = this.field1461;
        var8.field1584 = this.field1491;
        var8.field1585 = this.field1463;
        var8.field1586 = this.field1464;
        var8.field1587 = this.field1478;
        var8.field1588 = this.field1466;
        var8.field1589 = this.field1467;
        var8.field1646 = this.field1469;
        var8.field1594 = this.field1470;
        var8.field1597 = this.field1474;
        var8.field1602 = this.field1482;
        var8.field1603 = this.field1483;
        var8.field1605 = this.field1473;
        return var8;
    }

    @ObfuscatedName("db.af(II)I")
    public static final int method2386(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("db.ah(I)I")
    public static final int method2387(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
