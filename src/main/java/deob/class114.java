package deob;

@ObfuscatedName("do")
public class class114 extends class128 {

    @ObfuscatedName("do.w")
    public int field1524 = 0;

    @ObfuscatedName("do.m")
    public int[] field1492;

    @ObfuscatedName("do.q")
    public int[] field1484;

    @ObfuscatedName("do.b")
    public int[] field1485;

    @ObfuscatedName("do.f")
    public int field1483 = 0;

    @ObfuscatedName("do.n")
    public int[] field1487;

    @ObfuscatedName("do.h")
    public int[] field1488;

    @ObfuscatedName("do.x")
    public int[] field1489;

    @ObfuscatedName("do.j")
    public byte[] field1490;

    @ObfuscatedName("do.a")
    public byte[] field1510;

    @ObfuscatedName("do.l")
    public byte[] field1511;

    @ObfuscatedName("do.d")
    public byte[] field1519;

    @ObfuscatedName("do.s")
    public short[] field1494;

    @ObfuscatedName("do.p")
    public short[] field1495;

    @ObfuscatedName("do.g")
    public byte field1496 = 0;

    @ObfuscatedName("do.y")
    public int field1522;

    @ObfuscatedName("do.c")
    public byte[] field1498;

    @ObfuscatedName("do.e")
    public short[] field1501;

    @ObfuscatedName("do.t")
    public short[] field1527;

    @ObfuscatedName("do.u")
    public short[] field1493;

    @ObfuscatedName("do.i")
    public short[] field1502;

    @ObfuscatedName("do.z")
    public short[] field1509;

    @ObfuscatedName("do.k")
    public short[] field1528;

    @ObfuscatedName("do.r")
    public short[] field1505;

    @ObfuscatedName("do.v")
    public short[] field1506;

    @ObfuscatedName("do.o")
    public short[] field1507;

    @ObfuscatedName("do.ai")
    public byte[] field1508;

    @ObfuscatedName("do.at")
    public int[] field1521;

    @ObfuscatedName("do.ad")
    public int[] field1486;

    @ObfuscatedName("do.ac")
    public int[][] field1517;

    @ObfuscatedName("do.ay")
    public int[][] field1512;

    @ObfuscatedName("do.an")
    public class130[] field1513;

    @ObfuscatedName("do.as")
    public class122[] field1514;

    @ObfuscatedName("do.aw")
    public class122[] field1515;

    @ObfuscatedName("do.ag")
    public short field1516;

    @ObfuscatedName("do.ah")
    public short field1491;

    @ObfuscatedName("do.az")
    public boolean field1518 = false;

    @ObfuscatedName("do.ao")
    public int field1500;

    @ObfuscatedName("do.ap")
    public int field1520;

    @ObfuscatedName("do.af")
    public int field1499;

    @ObfuscatedName("do.am")
    public int field1497;

    @ObfuscatedName("do.aq")
    public int field1523;

    @ObfuscatedName("do.aj")
    public static int[] field1503 = new int[10000];

    @ObfuscatedName("do.ae")
    public static int[] field1525 = new int[10000];

    @ObfuscatedName("do.au")
    public static int field1504 = 0;

    @ObfuscatedName("do.av")
    public static int[] field1526 = class123.field1703;

    @ObfuscatedName("do.ab")
    public static int[] field1482 = class123.field1709;

    public class114() {
    }

    @ObfuscatedName("do.w(Liv;II)Ldo;")
    public static class114 method2406(class248 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4250(arg1, arg2);
        return var3 == null ? null : new class114(var3);
    }

    public class114(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2407(arg0);
        } else {
            this.method2409(arg0);
        }
    }

    @ObfuscatedName("do.m([B)V")
    public void method2407(byte[] arg0) {
        class183 var2 = new class183(arg0);
        class183 var3 = new class183(arg0);
        class183 var4 = new class183(arg0);
        class183 var5 = new class183(arg0);
        class183 var6 = new class183(arg0);
        class183 var7 = new class183(arg0);
        class183 var8 = new class183(arg0);
        var2.field2360 = arg0.length - 23;
        int var9 = var2.method3268();
        int var10 = var2.method3268();
        int var11 = var2.method3436();
        int var12 = var2.method3436();
        int var13 = var2.method3436();
        int var14 = var2.method3436();
        int var15 = var2.method3436();
        int var16 = var2.method3436();
        int var17 = var2.method3436();
        int var18 = var2.method3268();
        int var19 = var2.method3268();
        int var20 = var2.method3268();
        int var21 = var2.method3268();
        int var22 = var2.method3268();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1498 = new byte[var11];
            var2.field2360 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1498[var26] = var2.method3263();
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
        this.field1524 = var9;
        this.field1483 = var10;
        this.field1522 = var11;
        this.field1492 = new int[var9];
        this.field1484 = new int[var9];
        this.field1485 = new int[var9];
        this.field1487 = new int[var10];
        this.field1488 = new int[var10];
        this.field1489 = new int[var10];
        if (var17 == 1) {
            this.field1521 = new int[var9];
        }
        if (var12 == 1) {
            this.field1490 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1510 = new byte[var10];
        } else {
            this.field1496 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1511 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1486 = new int[var10];
        }
        if (var16 == 1) {
            this.field1495 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1519 = new byte[var10];
        }
        this.field1494 = new short[var10];
        if (var11 > 0) {
            this.field1501 = new short[var11];
            this.field1527 = new short[var11];
            this.field1493 = new short[var11];
            if (var24 > 0) {
                this.field1502 = new short[var24];
                this.field1509 = new short[var24];
                this.field1528 = new short[var24];
                this.field1505 = new short[var24];
                this.field1508 = new byte[var24];
                this.field1506 = new short[var24];
            }
            if (var25 > 0) {
                this.field1507 = new short[var25];
            }
        }
        var2.field2360 = var11;
        var3.field2360 = var44;
        var4.field2360 = var46;
        var5.field2360 = var48;
        var6.field2360 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method3436();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method3275();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method3275();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method3275();
            }
            this.field1492[var67] = var64 + var69;
            this.field1484[var67] = var65 + var70;
            this.field1485[var67] = var66 + var71;
            var64 = this.field1492[var67];
            var65 = this.field1484[var67];
            var66 = this.field1485[var67];
            if (var17 == 1) {
                this.field1521[var67] = var6.method3436();
            }
        }
        var2.field2360 = var42;
        var3.field2360 = var31;
        var4.field2360 = var34;
        var5.field2360 = var37;
        var6.field2360 = var35;
        var7.field2360 = var40;
        var8.field2360 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1494[var72] = (short) var2.method3268();
            if (var12 == 1) {
                this.field1490[var72] = var3.method3263();
            }
            if (var13 == 255) {
                this.field1510[var72] = var4.method3263();
            }
            if (var14 == 1) {
                this.field1511[var72] = var5.method3263();
            }
            if (var15 == 1) {
                this.field1486[var72] = var6.method3436();
            }
            if (var16 == 1) {
                this.field1495[var72] = (short) (var7.method3268() - 1);
            }
            if (this.field1519 != null && this.field1495[var72] != -1) {
                this.field1519[var72] = (byte) (var8.method3436() - 1);
            }
        }
        var2.field2360 = var33;
        var3.field2360 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method3436();
            if (var78 == 1) {
                var73 = var2.method3275() + var76;
                var74 = var2.method3275() + var73;
                var75 = var2.method3275() + var74;
                var76 = var75;
                this.field1487[var77] = var73;
                this.field1488[var77] = var74;
                this.field1489[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method3275() + var76;
                var76 = var75;
                this.field1487[var77] = var73;
                this.field1488[var77] = var74;
                this.field1489[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method3275() + var76;
                var76 = var75;
                this.field1487[var77] = var73;
                this.field1488[var77] = var74;
                this.field1489[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method3275() + var76;
                var76 = var75;
                this.field1487[var77] = var73;
                this.field1488[var77] = var81;
                this.field1489[var77] = var75;
            }
        }
        var2.field2360 = var50;
        var3.field2360 = var52;
        var4.field2360 = var54;
        var5.field2360 = var56;
        var6.field2360 = var58;
        var7.field2360 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1498[var82] & 0xFF;
            if (var83 == 0) {
                this.field1501[var82] = (short) var2.method3268();
                this.field1527[var82] = (short) var2.method3268();
                this.field1493[var82] = (short) var2.method3268();
            }
            if (var83 == 1) {
                this.field1501[var82] = (short) var3.method3268();
                this.field1527[var82] = (short) var3.method3268();
                this.field1493[var82] = (short) var3.method3268();
                this.field1502[var82] = (short) var4.method3268();
                this.field1509[var82] = (short) var4.method3268();
                this.field1528[var82] = (short) var4.method3268();
                this.field1505[var82] = (short) var5.method3268();
                this.field1508[var82] = var6.method3263();
                this.field1506[var82] = (short) var7.method3268();
            }
            if (var83 == 2) {
                this.field1501[var82] = (short) var3.method3268();
                this.field1527[var82] = (short) var3.method3268();
                this.field1493[var82] = (short) var3.method3268();
                this.field1502[var82] = (short) var4.method3268();
                this.field1509[var82] = (short) var4.method3268();
                this.field1528[var82] = (short) var4.method3268();
                this.field1505[var82] = (short) var5.method3268();
                this.field1508[var82] = var6.method3263();
                this.field1506[var82] = (short) var7.method3268();
                this.field1507[var82] = (short) var7.method3268();
            }
            if (var83 == 3) {
                this.field1501[var82] = (short) var3.method3268();
                this.field1527[var82] = (short) var3.method3268();
                this.field1493[var82] = (short) var3.method3268();
                this.field1502[var82] = (short) var4.method3268();
                this.field1509[var82] = (short) var4.method3268();
                this.field1528[var82] = (short) var4.method3268();
                this.field1505[var82] = (short) var5.method3268();
                this.field1508[var82] = var6.method3263();
                this.field1506[var82] = (short) var7.method3268();
            }
        }
        var2.field2360 = var62;
        int var84 = var2.method3436();
        if (var84 == 0) {
            return;
        }
        new class127();
        var2.method3268();
        var2.method3268();
        var2.method3268();
        var2.method3267();
    }

    @ObfuscatedName("do.q([B)V")
    public void method2409(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class183 var4 = new class183(arg0);
        class183 var5 = new class183(arg0);
        class183 var6 = new class183(arg0);
        class183 var7 = new class183(arg0);
        class183 var8 = new class183(arg0);
        var4.field2360 = arg0.length - 18;
        int var9 = var4.method3268();
        int var10 = var4.method3268();
        int var11 = var4.method3436();
        int var12 = var4.method3436();
        int var13 = var4.method3436();
        int var14 = var4.method3436();
        int var15 = var4.method3436();
        int var16 = var4.method3436();
        int var17 = var4.method3268();
        int var18 = var4.method3268();
        int var19 = var4.method3268();
        int var20 = var4.method3268();
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
        this.field1524 = var9;
        this.field1483 = var10;
        this.field1522 = var11;
        this.field1492 = new int[var9];
        this.field1484 = new int[var9];
        this.field1485 = new int[var9];
        this.field1487 = new int[var10];
        this.field1488 = new int[var10];
        this.field1489 = new int[var10];
        if (var11 > 0) {
            this.field1498 = new byte[var11];
            this.field1501 = new short[var11];
            this.field1527 = new short[var11];
            this.field1493 = new short[var11];
        }
        if (var16 == 1) {
            this.field1521 = new int[var9];
        }
        if (var12 == 1) {
            this.field1490 = new byte[var10];
            this.field1519 = new byte[var10];
            this.field1495 = new short[var10];
        }
        if (var13 == 255) {
            this.field1510 = new byte[var10];
        } else {
            this.field1496 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1511 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1486 = new int[var10];
        }
        this.field1494 = new short[var10];
        var4.field2360 = var21;
        var5.field2360 = var36;
        var6.field2360 = var38;
        var7.field2360 = var40;
        var8.field2360 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method3436();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method3275();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method3275();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method3275();
            }
            this.field1492[var46] = var43 + var48;
            this.field1484[var46] = var44 + var49;
            this.field1485[var46] = var45 + var50;
            var43 = this.field1492[var46];
            var44 = this.field1484[var46];
            var45 = this.field1485[var46];
            if (var16 == 1) {
                this.field1521[var46] = var8.method3436();
            }
        }
        var4.field2360 = var32;
        var5.field2360 = var28;
        var6.field2360 = var26;
        var7.field2360 = var30;
        var8.field2360 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1494[var51] = (short) var4.method3268();
            if (var12 == 1) {
                int var52 = var5.method3436();
                if ((var52 & 0x1) == 1) {
                    this.field1490[var51] = 1;
                    var2 = true;
                } else {
                    this.field1490[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1519[var51] = (byte) (var52 >> 2);
                    this.field1495[var51] = this.field1494[var51];
                    this.field1494[var51] = 127;
                    if (this.field1495[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1519[var51] = -1;
                    this.field1495[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1510[var51] = var6.method3263();
            }
            if (var14 == 1) {
                this.field1511[var51] = var7.method3263();
            }
            if (var15 == 1) {
                this.field1486[var51] = var8.method3436();
            }
        }
        var4.field2360 = var25;
        var5.field2360 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method3436();
            if (var58 == 1) {
                var53 = var4.method3275() + var56;
                var54 = var4.method3275() + var53;
                var55 = var4.method3275() + var54;
                var56 = var55;
                this.field1487[var57] = var53;
                this.field1488[var57] = var54;
                this.field1489[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method3275() + var56;
                var56 = var55;
                this.field1487[var57] = var53;
                this.field1488[var57] = var54;
                this.field1489[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method3275() + var56;
                var56 = var55;
                this.field1487[var57] = var53;
                this.field1488[var57] = var54;
                this.field1489[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method3275() + var56;
                var56 = var55;
                this.field1487[var57] = var53;
                this.field1488[var57] = var61;
                this.field1489[var57] = var55;
            }
        }
        var4.field2360 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1498[var62] = 0;
            this.field1501[var62] = (short) var4.method3268();
            this.field1527[var62] = (short) var4.method3268();
            this.field1493[var62] = (short) var4.method3268();
        }
        if (this.field1519 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1519[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1501[var65] & 0xFFFF) == this.field1487[var64] && (this.field1527[var65] & 0xFFFF) == this.field1488[var64] && (this.field1493[var65] & 0xFFFF) == this.field1489[var64]) {
                        this.field1519[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1519 = null;
            }
        }
        if (!var3) {
            this.field1495 = null;
        }
        if (!var2) {
            this.field1490 = null;
        }
    }

    public class114(class114[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1524 = 0;
        this.field1483 = 0;
        this.field1522 = 0;
        this.field1496 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class114 var10 = arg0[var9];
            if (var10 != null) {
                this.field1524 += var10.field1524;
                this.field1483 += var10.field1483;
                this.field1522 += var10.field1522;
                if (var10.field1510 == null) {
                    if (this.field1496 == -1) {
                        this.field1496 = var10.field1496;
                    }
                    if (this.field1496 != var10.field1496) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1490 != null;
                var5 |= var10.field1511 != null;
                var6 |= var10.field1486 != null;
                var7 |= var10.field1495 != null;
                var8 |= var10.field1519 != null;
            }
        }
        this.field1492 = new int[this.field1524];
        this.field1484 = new int[this.field1524];
        this.field1485 = new int[this.field1524];
        this.field1521 = new int[this.field1524];
        this.field1487 = new int[this.field1483];
        this.field1488 = new int[this.field1483];
        this.field1489 = new int[this.field1483];
        if (var3) {
            this.field1490 = new byte[this.field1483];
        }
        if (var4) {
            this.field1510 = new byte[this.field1483];
        }
        if (var5) {
            this.field1511 = new byte[this.field1483];
        }
        if (var6) {
            this.field1486 = new int[this.field1483];
        }
        if (var7) {
            this.field1495 = new short[this.field1483];
        }
        if (var8) {
            this.field1519 = new byte[this.field1483];
        }
        this.field1494 = new short[this.field1483];
        if (this.field1522 > 0) {
            this.field1498 = new byte[this.field1522];
            this.field1501 = new short[this.field1522];
            this.field1527 = new short[this.field1522];
            this.field1493 = new short[this.field1522];
            this.field1502 = new short[this.field1522];
            this.field1509 = new short[this.field1522];
            this.field1528 = new short[this.field1522];
            this.field1505 = new short[this.field1522];
            this.field1508 = new byte[this.field1522];
            this.field1506 = new short[this.field1522];
            this.field1507 = new short[this.field1522];
        }
        this.field1524 = 0;
        this.field1483 = 0;
        this.field1522 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class114 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1483; var13++) {
                    if (var3 && var12.field1490 != null) {
                        this.field1490[this.field1483] = var12.field1490[var13];
                    }
                    if (var4) {
                        if (var12.field1510 == null) {
                            this.field1510[this.field1483] = var12.field1496;
                        } else {
                            this.field1510[this.field1483] = var12.field1510[var13];
                        }
                    }
                    if (var5 && var12.field1511 != null) {
                        this.field1511[this.field1483] = var12.field1511[var13];
                    }
                    if (var6 && var12.field1486 != null) {
                        this.field1486[this.field1483] = var12.field1486[var13];
                    }
                    if (var7) {
                        if (var12.field1495 == null) {
                            this.field1495[this.field1483] = -1;
                        } else {
                            this.field1495[this.field1483] = var12.field1495[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1519 == null || var12.field1519[var13] == -1) {
                            this.field1519[this.field1483] = -1;
                        } else {
                            this.field1519[this.field1483] = (byte) (var12.field1519[var13] + this.field1522);
                        }
                    }
                    this.field1494[this.field1483] = var12.field1494[var13];
                    this.field1487[this.field1483] = this.method2433(var12, var12.field1487[var13]);
                    this.field1488[this.field1483] = this.method2433(var12, var12.field1488[var13]);
                    this.field1489[this.field1483] = this.method2433(var12, var12.field1489[var13]);
                    this.field1483++;
                }
                for (int var14 = 0; var14 < var12.field1522; var14++) {
                    byte var15 = this.field1498[this.field1522] = var12.field1498[var14];
                    if (var15 == 0) {
                        this.field1501[this.field1522] = (short) this.method2433(var12, var12.field1501[var14]);
                        this.field1527[this.field1522] = (short) this.method2433(var12, var12.field1527[var14]);
                        this.field1493[this.field1522] = (short) this.method2433(var12, var12.field1493[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field1501[this.field1522] = var12.field1501[var14];
                        this.field1527[this.field1522] = var12.field1527[var14];
                        this.field1493[this.field1522] = var12.field1493[var14];
                        this.field1502[this.field1522] = var12.field1502[var14];
                        this.field1509[this.field1522] = var12.field1509[var14];
                        this.field1528[this.field1522] = var12.field1528[var14];
                        this.field1505[this.field1522] = var12.field1505[var14];
                        this.field1508[this.field1522] = var12.field1508[var14];
                        this.field1506[this.field1522] = var12.field1506[var14];
                    }
                    if (var15 == 2) {
                        this.field1507[this.field1522] = var12.field1507[var14];
                    }
                    this.field1522++;
                }
            }
        }
    }

    @ObfuscatedName("do.x(Ldo;I)I")
    public final int method2433(class114 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1492[arg1];
        int var5 = arg0.field1484[arg1];
        int var6 = arg0.field1485[arg1];
        for (int var7 = 0; var7 < this.field1524; var7++) {
            if (this.field1492[var7] == var4 && this.field1484[var7] == var5 && this.field1485[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1492[this.field1524] = var4;
            this.field1484[this.field1524] = var5;
            this.field1485[this.field1524] = var6;
            if (arg0.field1521 != null) {
                this.field1521[this.field1524] = arg0.field1521[arg1];
            }
            var3 = this.field1524++;
        }
        return var3;
    }

    public class114(class114 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1524 = arg0.field1524;
        this.field1483 = arg0.field1483;
        this.field1522 = arg0.field1522;
        if (arg1) {
            this.field1492 = arg0.field1492;
            this.field1484 = arg0.field1484;
            this.field1485 = arg0.field1485;
        } else {
            this.field1492 = new int[this.field1524];
            this.field1484 = new int[this.field1524];
            this.field1485 = new int[this.field1524];
            for (int var6 = 0; var6 < this.field1524; var6++) {
                this.field1492[var6] = arg0.field1492[var6];
                this.field1484[var6] = arg0.field1484[var6];
                this.field1485[var6] = arg0.field1485[var6];
            }
        }
        if (arg2) {
            this.field1494 = arg0.field1494;
        } else {
            this.field1494 = new short[this.field1483];
            for (int var7 = 0; var7 < this.field1483; var7++) {
                this.field1494[var7] = arg0.field1494[var7];
            }
        }
        if (arg3 || arg0.field1495 == null) {
            this.field1495 = arg0.field1495;
        } else {
            this.field1495 = new short[this.field1483];
            for (int var8 = 0; var8 < this.field1483; var8++) {
                this.field1495[var8] = arg0.field1495[var8];
            }
        }
        if (arg4) {
            this.field1511 = arg0.field1511;
        } else {
            this.field1511 = new byte[this.field1483];
            if (arg0.field1511 == null) {
                for (int var9 = 0; var9 < this.field1483; var9++) {
                    this.field1511[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1483; var10++) {
                    this.field1511[var10] = arg0.field1511[var10];
                }
            }
        }
        this.field1487 = arg0.field1487;
        this.field1488 = arg0.field1488;
        this.field1489 = arg0.field1489;
        this.field1490 = arg0.field1490;
        this.field1510 = arg0.field1510;
        this.field1519 = arg0.field1519;
        this.field1496 = arg0.field1496;
        this.field1498 = arg0.field1498;
        this.field1501 = arg0.field1501;
        this.field1527 = arg0.field1527;
        this.field1493 = arg0.field1493;
        this.field1502 = arg0.field1502;
        this.field1509 = arg0.field1509;
        this.field1528 = arg0.field1528;
        this.field1505 = arg0.field1505;
        this.field1508 = arg0.field1508;
        this.field1506 = arg0.field1506;
        this.field1507 = arg0.field1507;
        this.field1521 = arg0.field1521;
        this.field1486 = arg0.field1486;
        this.field1517 = arg0.field1517;
        this.field1512 = arg0.field1512;
        this.field1514 = arg0.field1514;
        this.field1513 = arg0.field1513;
        this.field1515 = arg0.field1515;
        this.field1516 = arg0.field1516;
        this.field1491 = arg0.field1491;
    }

    @ObfuscatedName("do.j()Ldo;")
    public class114 method2411() {
        class114 var1 = new class114();
        if (this.field1490 != null) {
            var1.field1490 = new byte[this.field1483];
            for (int var2 = 0; var2 < this.field1483; var2++) {
                var1.field1490[var2] = this.field1490[var2];
            }
        }
        var1.field1524 = this.field1524;
        var1.field1483 = this.field1483;
        var1.field1522 = this.field1522;
        var1.field1492 = this.field1492;
        var1.field1484 = this.field1484;
        var1.field1485 = this.field1485;
        var1.field1487 = this.field1487;
        var1.field1488 = this.field1488;
        var1.field1489 = this.field1489;
        var1.field1510 = this.field1510;
        var1.field1511 = this.field1511;
        var1.field1519 = this.field1519;
        var1.field1494 = this.field1494;
        var1.field1495 = this.field1495;
        var1.field1496 = this.field1496;
        var1.field1498 = this.field1498;
        var1.field1501 = this.field1501;
        var1.field1527 = this.field1527;
        var1.field1493 = this.field1493;
        var1.field1502 = this.field1502;
        var1.field1509 = this.field1509;
        var1.field1528 = this.field1528;
        var1.field1505 = this.field1505;
        var1.field1508 = this.field1508;
        var1.field1506 = this.field1506;
        var1.field1507 = this.field1507;
        var1.field1521 = this.field1521;
        var1.field1486 = this.field1486;
        var1.field1517 = this.field1517;
        var1.field1512 = this.field1512;
        var1.field1514 = this.field1514;
        var1.field1513 = this.field1513;
        var1.field1516 = this.field1516;
        var1.field1491 = this.field1491;
        return var1;
    }

    @ObfuscatedName("do.a([[IIIIZI)Ldo;")
    public class114 method2412(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2424();
        int var7 = this.field1520 + arg1;
        int var8 = this.field1499 + arg1;
        int var9 = this.field1523 + arg3;
        int var10 = this.field1497 + arg3;
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
            var15.field1524 = this.field1524;
            var15.field1483 = this.field1483;
            var15.field1522 = this.field1522;
            var15.field1492 = this.field1492;
            var15.field1485 = this.field1485;
            var15.field1487 = this.field1487;
            var15.field1488 = this.field1488;
            var15.field1489 = this.field1489;
            var15.field1490 = this.field1490;
            var15.field1510 = this.field1510;
            var15.field1511 = this.field1511;
            var15.field1519 = this.field1519;
            var15.field1494 = this.field1494;
            var15.field1495 = this.field1495;
            var15.field1496 = this.field1496;
            var15.field1498 = this.field1498;
            var15.field1501 = this.field1501;
            var15.field1527 = this.field1527;
            var15.field1493 = this.field1493;
            var15.field1502 = this.field1502;
            var15.field1509 = this.field1509;
            var15.field1528 = this.field1528;
            var15.field1505 = this.field1505;
            var15.field1508 = this.field1508;
            var15.field1506 = this.field1506;
            var15.field1507 = this.field1507;
            var15.field1521 = this.field1521;
            var15.field1486 = this.field1486;
            var15.field1517 = this.field1517;
            var15.field1512 = this.field1512;
            var15.field1516 = this.field1516;
            var15.field1491 = this.field1491;
            var15.field1484 = new int[var15.field1524];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1524; var16++) {
                int var17 = this.field1492[var16] + arg1;
                int var18 = this.field1485[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1484[var16] = this.field1484[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1524; var26++) {
                int var27 = (-this.field1484[var26] << 16) / this.field1806;
                if (var27 < arg5) {
                    int var28 = this.field1492[var26] + arg1;
                    int var29 = this.field1485[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1484[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1484[var26];
                }
            }
        }
        var15.method2425();
        return var15;
    }

    @ObfuscatedName("do.l()V")
    public void method2413() {
        int var10002;
        if (this.field1521 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1524; var3++) {
                int var4 = this.field1521[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1517 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1517[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1524) {
                int var7 = this.field1521[var6];
                this.field1517[var7][var1[var7]++] = var6++;
            }
            this.field1521 = null;
        }
        if (this.field1486 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1483; var10++) {
            int var11 = this.field1486[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1512 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1512[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1483) {
            int var14 = this.field1486[var13];
            this.field1512[var14][var8[var14]++] = var13++;
        }
        this.field1486 = null;
    }

    @ObfuscatedName("do.d()V")
    public void method2436() {
        for (int var1 = 0; var1 < this.field1524; var1++) {
            int var2 = this.field1492[var1];
            this.field1492[var1] = this.field1485[var1];
            this.field1485[var1] = -var2;
        }
        this.method2425();
    }

    @ObfuscatedName("do.p()V")
    public void method2414() {
        for (int var1 = 0; var1 < this.field1524; var1++) {
            this.field1492[var1] = -this.field1492[var1];
            this.field1485[var1] = -this.field1485[var1];
        }
        this.method2425();
    }

    @ObfuscatedName("do.g()V")
    public void method2428() {
        for (int var1 = 0; var1 < this.field1524; var1++) {
            int var2 = this.field1485[var1];
            this.field1485[var1] = this.field1492[var1];
            this.field1492[var1] = -var2;
        }
        this.method2425();
    }

    @ObfuscatedName("do.y(I)V")
    public void method2450(int arg0) {
        int var2 = field1526[arg0];
        int var3 = field1482[arg0];
        for (int var4 = 0; var4 < this.field1524; var4++) {
            int var5 = this.field1492[var4] * var3 + this.field1485[var4] * var2 >> 16;
            this.field1485[var4] = this.field1485[var4] * var3 - this.field1492[var4] * var2 >> 16;
            this.field1492[var4] = var5;
        }
        this.method2425();
    }

    @ObfuscatedName("do.c(III)V")
    public void method2417(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1524; var4++) {
            this.field1492[var4] += arg0;
            this.field1484[var4] += arg1;
            this.field1485[var4] += arg2;
        }
        this.method2425();
    }

    @ObfuscatedName("do.e(SS)V")
    public void method2476(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1483; var3++) {
            if (this.field1494[var3] == arg0) {
                this.field1494[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("do.t(SS)V")
    public void method2419(short arg0, short arg1) {
        if (this.field1495 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1483; var3++) {
            if (this.field1495[var3] == arg0) {
                this.field1495[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("do.u()V")
    public void method2420() {
        for (int var1 = 0; var1 < this.field1524; var1++) {
            this.field1485[var1] = -this.field1485[var1];
        }
        for (int var2 = 0; var2 < this.field1483; var2++) {
            int var3 = this.field1487[var2];
            this.field1487[var2] = this.field1489[var2];
            this.field1489[var2] = var3;
        }
        this.method2425();
    }

    @ObfuscatedName("do.i(III)V")
    public void method2461(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1524; var4++) {
            this.field1492[var4] = this.field1492[var4] * arg0 / 128;
            this.field1484[var4] = this.field1484[var4] * arg1 / 128;
            this.field1485[var4] = this.field1485[var4] * arg2 / 128;
        }
        this.method2425();
    }

    @ObfuscatedName("do.r()V")
    public void method2422() {
        if (this.field1514 != null) {
            return;
        }
        this.field1514 = new class122[this.field1524];
        for (int var1 = 0; var1 < this.field1524; var1++) {
            this.field1514[var1] = new class122();
        }
        for (int var2 = 0; var2 < this.field1483; var2++) {
            int var3 = this.field1487[var2];
            int var4 = this.field1488[var2];
            int var5 = this.field1489[var2];
            int var6 = this.field1492[var4] - this.field1492[var3];
            int var7 = this.field1484[var4] - this.field1484[var3];
            int var8 = this.field1485[var4] - this.field1485[var3];
            int var9 = this.field1492[var5] - this.field1492[var3];
            int var10 = this.field1484[var5] - this.field1484[var3];
            int var11 = this.field1485[var5] - this.field1485[var3];
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
            if (this.field1490 == null) {
                var19 = 0;
            } else {
                var19 = this.field1490[var2];
            }
            if (var19 == 0) {
                class122 var20 = this.field1514[var3];
                var20.field1697 += var16;
                var20.field1695 += var17;
                var20.field1696 += var18;
                var20.field1699++;
                class122 var21 = this.field1514[var4];
                var21.field1697 += var16;
                var21.field1695 += var17;
                var21.field1696 += var18;
                var21.field1699++;
                class122 var22 = this.field1514[var5];
                var22.field1697 += var16;
                var22.field1695 += var17;
                var22.field1696 += var18;
                var22.field1699++;
            } else if (var19 == 1) {
                if (this.field1513 == null) {
                    this.field1513 = new class130[this.field1483];
                }
                class130 var23 = this.field1513[var2] = new class130();
                var23.field1821 = var16;
                var23.field1822 = var17;
                var23.field1820 = var18;
            }
        }
    }

    @ObfuscatedName("do.v()V")
    public void method2425() {
        this.field1514 = null;
        this.field1515 = null;
        this.field1513 = null;
        this.field1518 = false;
    }

    @ObfuscatedName("do.o()V")
    public void method2424() {
        if (this.field1518) {
            return;
        }
        this.field1806 = 0;
        this.field1500 = 0;
        this.field1520 = 999999;
        this.field1499 = -999999;
        this.field1497 = -99999;
        this.field1523 = 99999;
        for (int var1 = 0; var1 < this.field1524; var1++) {
            int var2 = this.field1492[var1];
            int var3 = this.field1484[var1];
            int var4 = this.field1485[var1];
            if (var2 < this.field1520) {
                this.field1520 = var2;
            }
            if (var2 > this.field1499) {
                this.field1499 = var2;
            }
            if (var4 < this.field1523) {
                this.field1523 = var4;
            }
            if (var4 > this.field1497) {
                this.field1497 = var4;
            }
            if (-var3 > this.field1806) {
                this.field1806 = -var3;
            }
            if (var3 > this.field1500) {
                this.field1500 = var3;
            }
        }
        this.field1518 = true;
    }

    @ObfuscatedName("do.ai(Ldo;Ldo;IIIZ)V")
    public static void method2447(class114 arg0, class114 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2424();
        arg0.method2422();
        arg1.method2424();
        arg1.method2422();
        field1504++;
        int var6 = 0;
        int[] var7 = arg1.field1492;
        int var8 = arg1.field1524;
        for (int var9 = 0; var9 < arg0.field1524; var9++) {
            class122 var10 = arg0.field1514[var9];
            if (var10.field1699 != 0) {
                int var11 = arg0.field1484[var9] - arg3;
                if (var11 <= arg1.field1500) {
                    int var12 = arg0.field1492[var9] - arg2;
                    if (var12 >= arg1.field1520 && var12 <= arg1.field1499) {
                        int var13 = arg0.field1485[var9] - arg4;
                        if (var13 >= arg1.field1523 && var13 <= arg1.field1497) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class122 var15 = arg1.field1514[var14];
                                if (var7[var14] == var12 && arg1.field1485[var14] == var13 && arg1.field1484[var14] == var11 && var15.field1699 != 0) {
                                    if (arg0.field1515 == null) {
                                        arg0.field1515 = new class122[arg0.field1524];
                                    }
                                    if (arg1.field1515 == null) {
                                        arg1.field1515 = new class122[var8];
                                    }
                                    class122 var16 = arg0.field1515[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1515[var9] = new class122(var10);
                                    }
                                    class122 var17 = arg1.field1515[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1515[var14] = new class122(var15);
                                    }
                                    var16.field1697 += var15.field1697;
                                    var16.field1695 += var15.field1695;
                                    var16.field1696 += var15.field1696;
                                    var16.field1699 += var15.field1699;
                                    var17.field1697 += var10.field1697;
                                    var17.field1695 += var10.field1695;
                                    var17.field1696 += var10.field1696;
                                    var17.field1699 += var10.field1699;
                                    var6++;
                                    field1503[var9] = field1504;
                                    field1525[var14] = field1504;
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
        for (int var18 = 0; var18 < arg0.field1483; var18++) {
            if (field1503[arg0.field1487[var18]] == field1504 && field1503[arg0.field1488[var18]] == field1504 && field1503[arg0.field1489[var18]] == field1504) {
                if (arg0.field1490 == null) {
                    arg0.field1490 = new byte[arg0.field1483];
                }
                arg0.field1490[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1483; var19++) {
            if (field1525[arg1.field1487[var19]] == field1504 && field1525[arg1.field1488[var19]] == field1504 && field1525[arg1.field1489[var19]] == field1504) {
                if (arg1.field1490 == null) {
                    arg1.field1490 = new byte[arg1.field1483];
                }
                arg1.field1490[var19] = 2;
            }
        }
    }

    @ObfuscatedName("do.at(IIIII)Ldk;")
    public final class120 method2418(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2422();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class120 var8 = new class120();
        var8.field1623 = new int[this.field1483];
        var8.field1672 = new int[this.field1483];
        var8.field1627 = new int[this.field1483];
        if (this.field1522 > 0 && this.field1519 != null) {
            int[] var9 = new int[this.field1522];
            for (int var10 = 0; var10 < this.field1483; var10++) {
                if (this.field1519[var10] != -1) {
                    var9[this.field1519[var10] & 0xFF]++;
                }
            }
            var8.field1631 = 0;
            for (int var11 = 0; var11 < this.field1522; var11++) {
                if (var9[var11] > 0 && this.field1498[var11] == 0) {
                    var8.field1631++;
                }
            }
            var8.field1636 = new int[var8.field1631];
            var8.field1633 = new int[var8.field1631];
            var8.field1634 = new int[var8.field1631];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1522; var13++) {
                if (var9[var13] > 0 && this.field1498[var13] == 0) {
                    var8.field1636[var12] = this.field1501[var13] & 0xFFFF;
                    var8.field1633[var12] = this.field1527[var13] & 0xFFFF;
                    var8.field1634[var12] = this.field1493[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1628 = new byte[this.field1483];
            for (int var14 = 0; var14 < this.field1483; var14++) {
                if (this.field1519[var14] == -1) {
                    var8.field1628[var14] = -1;
                } else {
                    var8.field1628[var14] = (byte) var9[this.field1519[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1483; var15++) {
            byte var16;
            if (this.field1490 == null) {
                var16 = 0;
            } else {
                var16 = this.field1490[var15];
            }
            byte var17;
            if (this.field1511 == null) {
                var17 = 0;
            } else {
                var17 = this.field1511[var15];
            }
            short var18;
            if (this.field1495 == null) {
                var18 = -1;
            } else {
                var18 = this.field1495[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1494[var15] & 0xFFFF;
                    class122 var20;
                    if (this.field1515 == null || this.field1515[this.field1487[var15]] == null) {
                        var20 = this.field1514[this.field1487[var15]];
                    } else {
                        var20 = this.field1515[this.field1487[var15]];
                    }
                    int var21 = (var20.field1696 * arg4 + var20.field1697 * arg2 + var20.field1695 * arg3) / (var20.field1699 * var7) + arg0;
                    var8.field1623[var15] = method2426(var19, var21);
                    class122 var22;
                    if (this.field1515 == null || this.field1515[this.field1488[var15]] == null) {
                        var22 = this.field1514[this.field1488[var15]];
                    } else {
                        var22 = this.field1515[this.field1488[var15]];
                    }
                    int var23 = (var22.field1696 * arg4 + var22.field1697 * arg2 + var22.field1695 * arg3) / (var22.field1699 * var7) + arg0;
                    var8.field1672[var15] = method2426(var19, var23);
                    class122 var24;
                    if (this.field1515 == null || this.field1515[this.field1489[var15]] == null) {
                        var24 = this.field1514[this.field1489[var15]];
                    } else {
                        var24 = this.field1515[this.field1489[var15]];
                    }
                    int var25 = (var24.field1696 * arg4 + var24.field1697 * arg2 + var24.field1695 * arg3) / (var24.field1699 * var7) + arg0;
                    var8.field1627[var15] = method2426(var19, var25);
                } else if (var16 == 1) {
                    class130 var26 = this.field1513[var15];
                    int var27 = (var26.field1820 * arg4 + var26.field1822 * arg3 + var26.field1821 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field1623[var15] = method2426(this.field1494[var15] & 0xFFFF, var27);
                    var8.field1627[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1623[var15] = 128;
                    var8.field1627[var15] = -1;
                } else {
                    var8.field1627[var15] = -2;
                }
            } else if (var16 == 0) {
                class122 var28;
                if (this.field1515 == null || this.field1515[this.field1487[var15]] == null) {
                    var28 = this.field1514[this.field1487[var15]];
                } else {
                    var28 = this.field1515[this.field1487[var15]];
                }
                int var29 = (var28.field1696 * arg4 + var28.field1697 * arg2 + var28.field1695 * arg3) / (var28.field1699 * var7) + arg0;
                var8.field1623[var15] = method2463(var29);
                class122 var30;
                if (this.field1515 == null || this.field1515[this.field1488[var15]] == null) {
                    var30 = this.field1514[this.field1488[var15]];
                } else {
                    var30 = this.field1515[this.field1488[var15]];
                }
                int var31 = (var30.field1696 * arg4 + var30.field1697 * arg2 + var30.field1695 * arg3) / (var30.field1699 * var7) + arg0;
                var8.field1672[var15] = method2463(var31);
                class122 var32;
                if (this.field1515 == null || this.field1515[this.field1489[var15]] == null) {
                    var32 = this.field1514[this.field1489[var15]];
                } else {
                    var32 = this.field1515[this.field1489[var15]];
                }
                int var33 = (var32.field1696 * arg4 + var32.field1697 * arg2 + var32.field1695 * arg3) / (var32.field1699 * var7) + arg0;
                var8.field1627[var15] = method2463(var33);
            } else if (var16 == 1) {
                class130 var34 = this.field1513[var15];
                int var35 = (var34.field1820 * arg4 + var34.field1822 * arg3 + var34.field1821 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field1623[var15] = method2463(var35);
                var8.field1627[var15] = -1;
            } else {
                var8.field1627[var15] = -2;
            }
        }
        this.method2413();
        var8.field1655 = this.field1524;
        var8.field1670 = this.field1492;
        var8.field1625 = this.field1484;
        var8.field1618 = this.field1485;
        var8.field1619 = this.field1483;
        var8.field1665 = this.field1487;
        var8.field1621 = this.field1488;
        var8.field1622 = this.field1489;
        var8.field1649 = this.field1510;
        var8.field1630 = this.field1511;
        var8.field1620 = this.field1496;
        var8.field1616 = this.field1517;
        var8.field1661 = this.field1512;
        var8.field1629 = this.field1495;
        return var8;
    }

    @ObfuscatedName("do.ad(II)I")
    public static final int method2426(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("do.ac(I)I")
    public static final int method2463(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
