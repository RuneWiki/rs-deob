package deob;

@ObfuscatedName("dt")
public class class116 extends class130 {

    @ObfuscatedName("dt.f")
    public int field1534 = 0;

    @ObfuscatedName("dt.h")
    public int[] field1504;

    @ObfuscatedName("dt.e")
    public int[] field1505;

    @ObfuscatedName("dt.b")
    public int[] field1513;

    @ObfuscatedName("dt.l")
    public int field1507 = 0;

    @ObfuscatedName("dt.w")
    public int[] field1503;

    @ObfuscatedName("dt.d")
    public int[] field1509;

    @ObfuscatedName("dt.n")
    public int[] field1510;

    @ObfuscatedName("dt.s")
    public byte[] field1511;

    @ObfuscatedName("dt.g")
    public byte[] field1512;

    @ObfuscatedName("dt.a")
    public byte[] field1527;

    @ObfuscatedName("dt.r")
    public byte[] field1514;

    @ObfuscatedName("dt.k")
    public short[] field1515;

    @ObfuscatedName("dt.m")
    public short[] field1506;

    @ObfuscatedName("dt.q")
    public byte field1521 = 0;

    @ObfuscatedName("dt.x")
    public int field1518;

    @ObfuscatedName("dt.u")
    public byte[] field1522;

    @ObfuscatedName("dt.o")
    public short[] field1533;

    @ObfuscatedName("dt.t")
    public short[] field1519;

    @ObfuscatedName("dt.v")
    public short[] field1537;

    @ObfuscatedName("dt.p")
    public int[] field1523;

    @ObfuscatedName("dt.z")
    public int[] field1524;

    @ObfuscatedName("dt.j")
    public int[][] field1508;

    @ObfuscatedName("dt.i")
    public int[][] field1526;

    @ObfuscatedName("dt.c")
    public class132[] field1542;

    @ObfuscatedName("dt.y")
    public class124[] field1528;

    @ObfuscatedName("dt.av")
    public class124[] field1529;

    @ObfuscatedName("dt.as")
    public short field1530;

    @ObfuscatedName("dt.al")
    public short field1531;

    @ObfuscatedName("dt.ax")
    public boolean field1532 = false;

    @ObfuscatedName("dt.ay")
    public int field1516;

    @ObfuscatedName("dt.aa")
    public int field1520;

    @ObfuscatedName("dt.ag")
    public int field1535;

    @ObfuscatedName("dt.aj")
    public int field1536;

    @ObfuscatedName("dt.an")
    public int field1538;

    @ObfuscatedName("dt.ap")
    public static int[] field1517 = new int[10000];

    @ObfuscatedName("dt.am")
    public static int[] field1539 = new int[10000];

    @ObfuscatedName("dt.ae")
    public static int field1540 = 0;

    @ObfuscatedName("dt.ac")
    public static int[] field1541 = class125.field1742;

    @ObfuscatedName("dt.ah")
    public static int[] field1525 = class125.field1743;

    public class116() {
    }

    @ObfuscatedName("dt.f(Lie;II)Ldt;")
    public static class116 method2385(class250 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4267(arg1, arg2);
        return var3 == null ? null : new class116(var3);
    }

    public class116(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2433(arg0);
        } else {
            this.method2465(arg0);
        }
    }

    @ObfuscatedName("dt.h([B)V")
    public void method2433(byte[] arg0) {
        class185 var2 = new class185(arg0);
        class185 var3 = new class185(arg0);
        class185 var4 = new class185(arg0);
        class185 var5 = new class185(arg0);
        class185 var6 = new class185(arg0);
        class185 var7 = new class185(arg0);
        class185 var8 = new class185(arg0);
        var2.field2397 = arg0.length - 23;
        int var9 = var2.method3325();
        int var10 = var2.method3325();
        int var11 = var2.method3323();
        int var12 = var2.method3323();
        int var13 = var2.method3323();
        int var14 = var2.method3323();
        int var15 = var2.method3323();
        int var16 = var2.method3323();
        int var17 = var2.method3323();
        int var18 = var2.method3325();
        int var19 = var2.method3325();
        int var20 = var2.method3325();
        int var21 = var2.method3325();
        int var22 = var2.method3325();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1522 = new byte[var11];
            var2.field2397 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1522[var26] = var2.method3324();
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
        this.field1534 = var9;
        this.field1507 = var10;
        this.field1518 = var11;
        this.field1504 = new int[var9];
        this.field1505 = new int[var9];
        this.field1513 = new int[var9];
        this.field1503 = new int[var10];
        this.field1509 = new int[var10];
        this.field1510 = new int[var10];
        if (var17 == 1) {
            this.field1523 = new int[var9];
        }
        if (var12 == 1) {
            this.field1511 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1512 = new byte[var10];
        } else {
            this.field1521 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1527 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1524 = new int[var10];
        }
        if (var16 == 1) {
            this.field1506 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1514 = new byte[var10];
        }
        this.field1515 = new short[var10];
        if (var11 > 0) {
            this.field1533 = new short[var11];
            this.field1519 = new short[var11];
            this.field1537 = new short[var11];
        }
        var2.field2397 = var11;
        var3.field2397 = var44;
        var4.field2397 = var46;
        var5.field2397 = var48;
        var6.field2397 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method3323();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method3336();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method3336();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method3336();
            }
            this.field1504[var67] = var64 + var69;
            this.field1505[var67] = var65 + var70;
            this.field1513[var67] = var66 + var71;
            var64 = this.field1504[var67];
            var65 = this.field1505[var67];
            var66 = this.field1513[var67];
            if (var17 == 1) {
                this.field1523[var67] = var6.method3323();
            }
        }
        var2.field2397 = var42;
        var3.field2397 = var31;
        var4.field2397 = var34;
        var5.field2397 = var37;
        var6.field2397 = var35;
        var7.field2397 = var40;
        var8.field2397 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1515[var72] = (short) var2.method3325();
            if (var12 == 1) {
                this.field1511[var72] = var3.method3324();
            }
            if (var13 == 255) {
                this.field1512[var72] = var4.method3324();
            }
            if (var14 == 1) {
                this.field1527[var72] = var5.method3324();
            }
            if (var15 == 1) {
                this.field1524[var72] = var6.method3323();
            }
            if (var16 == 1) {
                this.field1506[var72] = (short) (var7.method3325() - 1);
            }
            if (this.field1514 != null && this.field1506[var72] != -1) {
                this.field1514[var72] = (byte) (var8.method3323() - 1);
            }
        }
        var2.field2397 = var33;
        var3.field2397 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method3323();
            if (var78 == 1) {
                var73 = var2.method3336() + var76;
                var74 = var2.method3336() + var73;
                var75 = var2.method3336() + var74;
                var76 = var75;
                this.field1503[var77] = var73;
                this.field1509[var77] = var74;
                this.field1510[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method3336() + var76;
                var76 = var75;
                this.field1503[var77] = var73;
                this.field1509[var77] = var74;
                this.field1510[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method3336() + var76;
                var76 = var75;
                this.field1503[var77] = var73;
                this.field1509[var77] = var74;
                this.field1510[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method3336() + var76;
                var76 = var75;
                this.field1503[var77] = var73;
                this.field1509[var77] = var81;
                this.field1510[var77] = var75;
            }
        }
        var2.field2397 = var50;
        var3.field2397 = var52;
        var4.field2397 = var54;
        var5.field2397 = var56;
        var6.field2397 = var58;
        var7.field2397 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1522[var82] & 0xFF;
            if (var83 == 0) {
                this.field1533[var82] = (short) var2.method3325();
                this.field1519[var82] = (short) var2.method3325();
                this.field1537[var82] = (short) var2.method3325();
            }
        }
        var2.field2397 = var62;
        int var84 = var2.method3323();
        if (var84 == 0) {
            return;
        }
        new class129();
        var2.method3325();
        var2.method3325();
        var2.method3325();
        var2.method3328();
    }

    @ObfuscatedName("dt.e([B)V")
    public void method2465(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class185 var4 = new class185(arg0);
        class185 var5 = new class185(arg0);
        class185 var6 = new class185(arg0);
        class185 var7 = new class185(arg0);
        class185 var8 = new class185(arg0);
        var4.field2397 = arg0.length - 18;
        int var9 = var4.method3325();
        int var10 = var4.method3325();
        int var11 = var4.method3323();
        int var12 = var4.method3323();
        int var13 = var4.method3323();
        int var14 = var4.method3323();
        int var15 = var4.method3323();
        int var16 = var4.method3323();
        int var17 = var4.method3325();
        int var18 = var4.method3325();
        int var19 = var4.method3325();
        int var20 = var4.method3325();
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
        this.field1534 = var9;
        this.field1507 = var10;
        this.field1518 = var11;
        this.field1504 = new int[var9];
        this.field1505 = new int[var9];
        this.field1513 = new int[var9];
        this.field1503 = new int[var10];
        this.field1509 = new int[var10];
        this.field1510 = new int[var10];
        if (var11 > 0) {
            this.field1522 = new byte[var11];
            this.field1533 = new short[var11];
            this.field1519 = new short[var11];
            this.field1537 = new short[var11];
        }
        if (var16 == 1) {
            this.field1523 = new int[var9];
        }
        if (var12 == 1) {
            this.field1511 = new byte[var10];
            this.field1514 = new byte[var10];
            this.field1506 = new short[var10];
        }
        if (var13 == 255) {
            this.field1512 = new byte[var10];
        } else {
            this.field1521 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1527 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1524 = new int[var10];
        }
        this.field1515 = new short[var10];
        var4.field2397 = var21;
        var5.field2397 = var36;
        var6.field2397 = var38;
        var7.field2397 = var40;
        var8.field2397 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method3323();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method3336();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method3336();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method3336();
            }
            this.field1504[var46] = var43 + var48;
            this.field1505[var46] = var44 + var49;
            this.field1513[var46] = var45 + var50;
            var43 = this.field1504[var46];
            var44 = this.field1505[var46];
            var45 = this.field1513[var46];
            if (var16 == 1) {
                this.field1523[var46] = var8.method3323();
            }
        }
        var4.field2397 = var32;
        var5.field2397 = var28;
        var6.field2397 = var26;
        var7.field2397 = var30;
        var8.field2397 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1515[var51] = (short) var4.method3325();
            if (var12 == 1) {
                int var52 = var5.method3323();
                if ((var52 & 0x1) == 1) {
                    this.field1511[var51] = 1;
                    var2 = true;
                } else {
                    this.field1511[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1514[var51] = (byte) (var52 >> 2);
                    this.field1506[var51] = this.field1515[var51];
                    this.field1515[var51] = 127;
                    if (this.field1506[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1514[var51] = -1;
                    this.field1506[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1512[var51] = var6.method3324();
            }
            if (var14 == 1) {
                this.field1527[var51] = var7.method3324();
            }
            if (var15 == 1) {
                this.field1524[var51] = var8.method3323();
            }
        }
        var4.field2397 = var25;
        var5.field2397 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method3323();
            if (var58 == 1) {
                var53 = var4.method3336() + var56;
                var54 = var4.method3336() + var53;
                var55 = var4.method3336() + var54;
                var56 = var55;
                this.field1503[var57] = var53;
                this.field1509[var57] = var54;
                this.field1510[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method3336() + var56;
                var56 = var55;
                this.field1503[var57] = var53;
                this.field1509[var57] = var54;
                this.field1510[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method3336() + var56;
                var56 = var55;
                this.field1503[var57] = var53;
                this.field1509[var57] = var54;
                this.field1510[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method3336() + var56;
                var56 = var55;
                this.field1503[var57] = var53;
                this.field1509[var57] = var61;
                this.field1510[var57] = var55;
            }
        }
        var4.field2397 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1522[var62] = 0;
            this.field1533[var62] = (short) var4.method3325();
            this.field1519[var62] = (short) var4.method3325();
            this.field1537[var62] = (short) var4.method3325();
        }
        if (this.field1514 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1514[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1533[var65] & 0xFFFF) == this.field1503[var64] && (this.field1519[var65] & 0xFFFF) == this.field1509[var64] && (this.field1537[var65] & 0xFFFF) == this.field1510[var64]) {
                        this.field1514[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1514 = null;
            }
        }
        if (!var3) {
            this.field1506 = null;
        }
        if (!var2) {
            this.field1511 = null;
        }
    }

    public class116(class116[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1534 = 0;
        this.field1507 = 0;
        this.field1518 = 0;
        this.field1521 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class116 var10 = arg0[var9];
            if (var10 != null) {
                this.field1534 += var10.field1534;
                this.field1507 += var10.field1507;
                this.field1518 += var10.field1518;
                if (var10.field1512 == null) {
                    if (this.field1521 == -1) {
                        this.field1521 = var10.field1521;
                    }
                    if (this.field1521 != var10.field1521) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1511 != null;
                var5 |= var10.field1527 != null;
                var6 |= var10.field1524 != null;
                var7 |= var10.field1506 != null;
                var8 |= var10.field1514 != null;
            }
        }
        this.field1504 = new int[this.field1534];
        this.field1505 = new int[this.field1534];
        this.field1513 = new int[this.field1534];
        this.field1523 = new int[this.field1534];
        this.field1503 = new int[this.field1507];
        this.field1509 = new int[this.field1507];
        this.field1510 = new int[this.field1507];
        if (var3) {
            this.field1511 = new byte[this.field1507];
        }
        if (var4) {
            this.field1512 = new byte[this.field1507];
        }
        if (var5) {
            this.field1527 = new byte[this.field1507];
        }
        if (var6) {
            this.field1524 = new int[this.field1507];
        }
        if (var7) {
            this.field1506 = new short[this.field1507];
        }
        if (var8) {
            this.field1514 = new byte[this.field1507];
        }
        this.field1515 = new short[this.field1507];
        if (this.field1518 > 0) {
            this.field1522 = new byte[this.field1518];
            this.field1533 = new short[this.field1518];
            this.field1519 = new short[this.field1518];
            this.field1537 = new short[this.field1518];
        }
        this.field1534 = 0;
        this.field1507 = 0;
        this.field1518 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class116 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1507; var13++) {
                    if (var3 && var12.field1511 != null) {
                        this.field1511[this.field1507] = var12.field1511[var13];
                    }
                    if (var4) {
                        if (var12.field1512 == null) {
                            this.field1512[this.field1507] = var12.field1521;
                        } else {
                            this.field1512[this.field1507] = var12.field1512[var13];
                        }
                    }
                    if (var5 && var12.field1527 != null) {
                        this.field1527[this.field1507] = var12.field1527[var13];
                    }
                    if (var6 && var12.field1524 != null) {
                        this.field1524[this.field1507] = var12.field1524[var13];
                    }
                    if (var7) {
                        if (var12.field1506 == null) {
                            this.field1506[this.field1507] = -1;
                        } else {
                            this.field1506[this.field1507] = var12.field1506[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1514 == null || var12.field1514[var13] == -1) {
                            this.field1514[this.field1507] = -1;
                        } else {
                            this.field1514[this.field1507] = (byte) (var12.field1514[var13] + this.field1518);
                        }
                    }
                    this.field1515[this.field1507] = var12.field1515[var13];
                    this.field1503[this.field1507] = this.method2389(var12, var12.field1503[var13]);
                    this.field1509[this.field1507] = this.method2389(var12, var12.field1509[var13]);
                    this.field1510[this.field1507] = this.method2389(var12, var12.field1510[var13]);
                    this.field1507++;
                }
                for (int var14 = 0; var14 < var12.field1518; var14++) {
                    byte var15 = this.field1522[this.field1518] = var12.field1522[var14];
                    if (var15 == 0) {
                        this.field1533[this.field1518] = (short) this.method2389(var12, var12.field1533[var14]);
                        this.field1519[this.field1518] = (short) this.method2389(var12, var12.field1519[var14]);
                        this.field1537[this.field1518] = (short) this.method2389(var12, var12.field1537[var14]);
                    }
                    this.field1518++;
                }
            }
        }
    }

    @ObfuscatedName("dt.b(Ldt;I)I")
    public final int method2389(class116 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1504[arg1];
        int var5 = arg0.field1505[arg1];
        int var6 = arg0.field1513[arg1];
        for (int var7 = 0; var7 < this.field1534; var7++) {
            if (this.field1504[var7] == var4 && this.field1505[var7] == var5 && this.field1513[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1504[this.field1534] = var4;
            this.field1505[this.field1534] = var5;
            this.field1513[this.field1534] = var6;
            if (arg0.field1523 != null) {
                this.field1523[this.field1534] = arg0.field1523[arg1];
            }
            var3 = this.field1534++;
        }
        return var3;
    }

    public class116(class116 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1534 = arg0.field1534;
        this.field1507 = arg0.field1507;
        this.field1518 = arg0.field1518;
        if (arg1) {
            this.field1504 = arg0.field1504;
            this.field1505 = arg0.field1505;
            this.field1513 = arg0.field1513;
        } else {
            this.field1504 = new int[this.field1534];
            this.field1505 = new int[this.field1534];
            this.field1513 = new int[this.field1534];
            for (int var6 = 0; var6 < this.field1534; var6++) {
                this.field1504[var6] = arg0.field1504[var6];
                this.field1505[var6] = arg0.field1505[var6];
                this.field1513[var6] = arg0.field1513[var6];
            }
        }
        if (arg2) {
            this.field1515 = arg0.field1515;
        } else {
            this.field1515 = new short[this.field1507];
            for (int var7 = 0; var7 < this.field1507; var7++) {
                this.field1515[var7] = arg0.field1515[var7];
            }
        }
        if (arg3 || arg0.field1506 == null) {
            this.field1506 = arg0.field1506;
        } else {
            this.field1506 = new short[this.field1507];
            for (int var8 = 0; var8 < this.field1507; var8++) {
                this.field1506[var8] = arg0.field1506[var8];
            }
        }
        if (arg4) {
            this.field1527 = arg0.field1527;
        } else {
            this.field1527 = new byte[this.field1507];
            if (arg0.field1527 == null) {
                for (int var9 = 0; var9 < this.field1507; var9++) {
                    this.field1527[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1507; var10++) {
                    this.field1527[var10] = arg0.field1527[var10];
                }
            }
        }
        this.field1503 = arg0.field1503;
        this.field1509 = arg0.field1509;
        this.field1510 = arg0.field1510;
        this.field1511 = arg0.field1511;
        this.field1512 = arg0.field1512;
        this.field1514 = arg0.field1514;
        this.field1521 = arg0.field1521;
        this.field1522 = arg0.field1522;
        this.field1533 = arg0.field1533;
        this.field1519 = arg0.field1519;
        this.field1537 = arg0.field1537;
        this.field1523 = arg0.field1523;
        this.field1524 = arg0.field1524;
        this.field1508 = arg0.field1508;
        this.field1526 = arg0.field1526;
        this.field1528 = arg0.field1528;
        this.field1542 = arg0.field1542;
        this.field1529 = arg0.field1529;
        this.field1530 = arg0.field1530;
        this.field1531 = arg0.field1531;
    }

    @ObfuscatedName("dt.l()Ldt;")
    public class116 method2427() {
        class116 var1 = new class116();
        if (this.field1511 != null) {
            var1.field1511 = new byte[this.field1507];
            for (int var2 = 0; var2 < this.field1507; var2++) {
                var1.field1511[var2] = this.field1511[var2];
            }
        }
        var1.field1534 = this.field1534;
        var1.field1507 = this.field1507;
        var1.field1518 = this.field1518;
        var1.field1504 = this.field1504;
        var1.field1505 = this.field1505;
        var1.field1513 = this.field1513;
        var1.field1503 = this.field1503;
        var1.field1509 = this.field1509;
        var1.field1510 = this.field1510;
        var1.field1512 = this.field1512;
        var1.field1527 = this.field1527;
        var1.field1514 = this.field1514;
        var1.field1515 = this.field1515;
        var1.field1506 = this.field1506;
        var1.field1521 = this.field1521;
        var1.field1522 = this.field1522;
        var1.field1533 = this.field1533;
        var1.field1519 = this.field1519;
        var1.field1537 = this.field1537;
        var1.field1523 = this.field1523;
        var1.field1524 = this.field1524;
        var1.field1508 = this.field1508;
        var1.field1526 = this.field1526;
        var1.field1528 = this.field1528;
        var1.field1542 = this.field1542;
        var1.field1530 = this.field1530;
        var1.field1531 = this.field1531;
        return var1;
    }

    @ObfuscatedName("dt.w([[IIIIZI)Ldt;")
    public class116 method2392(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2404();
        int var7 = this.field1520 + arg1;
        int var8 = this.field1535 + arg1;
        int var9 = this.field1538 + arg3;
        int var10 = this.field1536 + arg3;
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
            var15.field1534 = this.field1534;
            var15.field1507 = this.field1507;
            var15.field1518 = this.field1518;
            var15.field1504 = this.field1504;
            var15.field1513 = this.field1513;
            var15.field1503 = this.field1503;
            var15.field1509 = this.field1509;
            var15.field1510 = this.field1510;
            var15.field1511 = this.field1511;
            var15.field1512 = this.field1512;
            var15.field1527 = this.field1527;
            var15.field1514 = this.field1514;
            var15.field1515 = this.field1515;
            var15.field1506 = this.field1506;
            var15.field1521 = this.field1521;
            var15.field1522 = this.field1522;
            var15.field1533 = this.field1533;
            var15.field1519 = this.field1519;
            var15.field1537 = this.field1537;
            var15.field1523 = this.field1523;
            var15.field1524 = this.field1524;
            var15.field1508 = this.field1508;
            var15.field1526 = this.field1526;
            var15.field1530 = this.field1530;
            var15.field1531 = this.field1531;
            var15.field1505 = new int[var15.field1534];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1534; var16++) {
                int var17 = this.field1504[var16] + arg1;
                int var18 = this.field1513[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1505[var16] = this.field1505[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1534; var26++) {
                int var27 = (-this.field1505[var26] << 16) / this.field1829;
                if (var27 < arg5) {
                    int var28 = this.field1504[var26] + arg1;
                    int var29 = this.field1513[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1505[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1505[var26];
                }
            }
        }
        var15.method2403();
        return var15;
    }

    @ObfuscatedName("dt.d()V")
    public void method2393() {
        int var10002;
        if (this.field1523 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1534; var3++) {
                int var4 = this.field1523[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1508 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1508[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1534) {
                int var7 = this.field1523[var6];
                this.field1508[var7][var1[var7]++] = var6++;
            }
            this.field1523 = null;
        }
        if (this.field1524 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1507; var10++) {
            int var11 = this.field1524[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1526 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1526[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1507) {
            int var14 = this.field1524[var13];
            this.field1526[var14][var8[var14]++] = var13++;
        }
        this.field1524 = null;
    }

    @ObfuscatedName("dt.n()V")
    public void method2394() {
        for (int var1 = 0; var1 < this.field1534; var1++) {
            int var2 = this.field1504[var1];
            this.field1504[var1] = this.field1513[var1];
            this.field1513[var1] = -var2;
        }
        this.method2403();
    }

    @ObfuscatedName("dt.g()V")
    public void method2438() {
        for (int var1 = 0; var1 < this.field1534; var1++) {
            this.field1504[var1] = -this.field1504[var1];
            this.field1513[var1] = -this.field1513[var1];
        }
        this.method2403();
    }

    @ObfuscatedName("dt.k()V")
    public void method2442() {
        for (int var1 = 0; var1 < this.field1534; var1++) {
            int var2 = this.field1513[var1];
            this.field1513[var1] = this.field1504[var1];
            this.field1504[var1] = -var2;
        }
        this.method2403();
    }

    @ObfuscatedName("dt.m(I)V")
    public void method2445(int arg0) {
        int var2 = field1541[arg0];
        int var3 = field1525[arg0];
        for (int var4 = 0; var4 < this.field1534; var4++) {
            int var5 = this.field1513[var4] * var2 + this.field1504[var4] * var3 >> 16;
            this.field1513[var4] = this.field1513[var4] * var3 - this.field1504[var4] * var2 >> 16;
            this.field1504[var4] = var5;
        }
        this.method2403();
    }

    @ObfuscatedName("dt.q(III)V")
    public void method2443(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1534; var4++) {
            this.field1504[var4] += arg0;
            this.field1505[var4] += arg1;
            this.field1513[var4] += arg2;
        }
        this.method2403();
    }

    @ObfuscatedName("dt.x(SS)V")
    public void method2398(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1507; var3++) {
            if (this.field1515[var3] == arg0) {
                this.field1515[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dt.u(SS)V")
    public void method2399(short arg0, short arg1) {
        if (this.field1506 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1507; var3++) {
            if (this.field1506[var3] == arg0) {
                this.field1506[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dt.o()V")
    public void method2400() {
        for (int var1 = 0; var1 < this.field1534; var1++) {
            this.field1513[var1] = -this.field1513[var1];
        }
        for (int var2 = 0; var2 < this.field1507; var2++) {
            int var3 = this.field1503[var2];
            this.field1503[var2] = this.field1510[var2];
            this.field1510[var2] = var3;
        }
        this.method2403();
    }

    @ObfuscatedName("dt.t(III)V")
    public void method2401(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1534; var4++) {
            this.field1504[var4] = this.field1504[var4] * arg0 / 128;
            this.field1505[var4] = this.field1505[var4] * arg1 / 128;
            this.field1513[var4] = this.field1513[var4] * arg2 / 128;
        }
        this.method2403();
    }

    @ObfuscatedName("dt.v()V")
    public void method2402() {
        if (this.field1528 != null) {
            return;
        }
        this.field1528 = new class124[this.field1534];
        for (int var1 = 0; var1 < this.field1534; var1++) {
            this.field1528[var1] = new class124();
        }
        for (int var2 = 0; var2 < this.field1507; var2++) {
            int var3 = this.field1503[var2];
            int var4 = this.field1509[var2];
            int var5 = this.field1510[var2];
            int var6 = this.field1504[var4] - this.field1504[var3];
            int var7 = this.field1505[var4] - this.field1505[var3];
            int var8 = this.field1513[var4] - this.field1513[var3];
            int var9 = this.field1504[var5] - this.field1504[var3];
            int var10 = this.field1505[var5] - this.field1505[var3];
            int var11 = this.field1513[var5] - this.field1513[var3];
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
            if (this.field1511 == null) {
                var19 = 0;
            } else {
                var19 = this.field1511[var2];
            }
            if (var19 == 0) {
                class124 var20 = this.field1528[var3];
                var20.field1713 += var16;
                var20.field1712 += var17;
                var20.field1714 += var18;
                var20.field1715++;
                class124 var21 = this.field1528[var4];
                var21.field1713 += var16;
                var21.field1712 += var17;
                var21.field1714 += var18;
                var21.field1715++;
                class124 var22 = this.field1528[var5];
                var22.field1713 += var16;
                var22.field1712 += var17;
                var22.field1714 += var18;
                var22.field1715++;
            } else if (var19 == 1) {
                if (this.field1542 == null) {
                    this.field1542 = new class132[this.field1507];
                }
                class132 var23 = this.field1542[var2] = new class132();
                var23.field1848 = var16;
                var23.field1844 = var17;
                var23.field1845 = var18;
            }
        }
    }

    @ObfuscatedName("dt.p()V")
    public void method2403() {
        this.field1528 = null;
        this.field1529 = null;
        this.field1542 = null;
        this.field1532 = false;
    }

    @ObfuscatedName("dt.z()V")
    public void method2404() {
        if (this.field1532) {
            return;
        }
        this.field1829 = 0;
        this.field1516 = 0;
        this.field1520 = 999999;
        this.field1535 = -999999;
        this.field1536 = -99999;
        this.field1538 = 99999;
        for (int var1 = 0; var1 < this.field1534; var1++) {
            int var2 = this.field1504[var1];
            int var3 = this.field1505[var1];
            int var4 = this.field1513[var1];
            if (var2 < this.field1520) {
                this.field1520 = var2;
            }
            if (var2 > this.field1535) {
                this.field1535 = var2;
            }
            if (var4 < this.field1538) {
                this.field1538 = var4;
            }
            if (var4 > this.field1536) {
                this.field1536 = var4;
            }
            if (-var3 > this.field1829) {
                this.field1829 = -var3;
            }
            if (var3 > this.field1516) {
                this.field1516 = var3;
            }
        }
        this.field1532 = true;
    }

    @ObfuscatedName("dt.j(Ldt;Ldt;IIIZ)V")
    public static void method2405(class116 arg0, class116 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2404();
        arg0.method2402();
        arg1.method2404();
        arg1.method2402();
        field1540++;
        int var6 = 0;
        int[] var7 = arg1.field1504;
        int var8 = arg1.field1534;
        for (int var9 = 0; var9 < arg0.field1534; var9++) {
            class124 var10 = arg0.field1528[var9];
            if (var10.field1715 != 0) {
                int var11 = arg0.field1505[var9] - arg3;
                if (var11 <= arg1.field1516) {
                    int var12 = arg0.field1504[var9] - arg2;
                    if (var12 >= arg1.field1520 && var12 <= arg1.field1535) {
                        int var13 = arg0.field1513[var9] - arg4;
                        if (var13 >= arg1.field1538 && var13 <= arg1.field1536) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class124 var15 = arg1.field1528[var14];
                                if (var7[var14] == var12 && arg1.field1513[var14] == var13 && arg1.field1505[var14] == var11 && var15.field1715 != 0) {
                                    if (arg0.field1529 == null) {
                                        arg0.field1529 = new class124[arg0.field1534];
                                    }
                                    if (arg1.field1529 == null) {
                                        arg1.field1529 = new class124[var8];
                                    }
                                    class124 var16 = arg0.field1529[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1529[var9] = new class124(var10);
                                    }
                                    class124 var17 = arg1.field1529[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1529[var14] = new class124(var15);
                                    }
                                    var16.field1713 += var15.field1713;
                                    var16.field1712 += var15.field1712;
                                    var16.field1714 += var15.field1714;
                                    var16.field1715 += var15.field1715;
                                    var17.field1713 += var10.field1713;
                                    var17.field1712 += var10.field1712;
                                    var17.field1714 += var10.field1714;
                                    var17.field1715 += var10.field1715;
                                    var6++;
                                    field1517[var9] = field1540;
                                    field1539[var14] = field1540;
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
        for (int var18 = 0; var18 < arg0.field1507; var18++) {
            if (field1517[arg0.field1503[var18]] == field1540 && field1517[arg0.field1509[var18]] == field1540 && field1517[arg0.field1510[var18]] == field1540) {
                if (arg0.field1511 == null) {
                    arg0.field1511 = new byte[arg0.field1507];
                }
                arg0.field1511[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1507; var19++) {
            if (field1539[arg1.field1503[var19]] == field1540 && field1539[arg1.field1509[var19]] == field1540 && field1539[arg1.field1510[var19]] == field1540) {
                if (arg1.field1511 == null) {
                    arg1.field1511 = new byte[arg1.field1507];
                }
                arg1.field1511[var19] = 2;
            }
        }
    }

    @ObfuscatedName("dt.c(IIIII)Lds;")
    public final class122 method2406(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2402();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class122 var8 = new class122();
        var8.field1634 = new int[this.field1507];
        var8.field1631 = new int[this.field1507];
        var8.field1663 = new int[this.field1507];
        if (this.field1518 > 0 && this.field1514 != null) {
            int[] var9 = new int[this.field1518];
            for (int var10 = 0; var10 < this.field1507; var10++) {
                if (this.field1514[var10] != -1) {
                    var9[this.field1514[var10] & 0xFF]++;
                }
            }
            var8.field1648 = 0;
            for (int var11 = 0; var11 < this.field1518; var11++) {
                if (var9[var11] > 0 && this.field1522[var11] == 0) {
                    var8.field1648++;
                }
            }
            var8.field1629 = new int[var8.field1648];
            var8.field1644 = new int[var8.field1648];
            var8.field1645 = new int[var8.field1648];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1518; var13++) {
                if (var9[var13] > 0 && this.field1522[var13] == 0) {
                    var8.field1629[var12] = this.field1533[var13] & 0xFFFF;
                    var8.field1644[var12] = this.field1519[var13] & 0xFFFF;
                    var8.field1645[var12] = this.field1537[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1640 = new byte[this.field1507];
            for (int var14 = 0; var14 < this.field1507; var14++) {
                if (this.field1514[var14] == -1) {
                    var8.field1640[var14] = -1;
                } else {
                    var8.field1640[var14] = (byte) var9[this.field1514[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1507; var15++) {
            byte var16;
            if (this.field1511 == null) {
                var16 = 0;
            } else {
                var16 = this.field1511[var15];
            }
            byte var17;
            if (this.field1527 == null) {
                var17 = 0;
            } else {
                var17 = this.field1527[var15];
            }
            short var18;
            if (this.field1506 == null) {
                var18 = -1;
            } else {
                var18 = this.field1506[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1515[var15] & 0xFFFF;
                    class124 var20;
                    if (this.field1529 == null || this.field1529[this.field1503[var15]] == null) {
                        var20 = this.field1528[this.field1503[var15]];
                    } else {
                        var20 = this.field1529[this.field1503[var15]];
                    }
                    int var21 = (var20.field1714 * arg4 + var20.field1713 * arg2 + var20.field1712 * arg3) / (var20.field1715 * var7) + arg0;
                    var8.field1634[var15] = method2388(var19, var21);
                    class124 var22;
                    if (this.field1529 == null || this.field1529[this.field1509[var15]] == null) {
                        var22 = this.field1528[this.field1509[var15]];
                    } else {
                        var22 = this.field1529[this.field1509[var15]];
                    }
                    int var23 = (var22.field1714 * arg4 + var22.field1713 * arg2 + var22.field1712 * arg3) / (var22.field1715 * var7) + arg0;
                    var8.field1631[var15] = method2388(var19, var23);
                    class124 var24;
                    if (this.field1529 == null || this.field1529[this.field1510[var15]] == null) {
                        var24 = this.field1528[this.field1510[var15]];
                    } else {
                        var24 = this.field1529[this.field1510[var15]];
                    }
                    int var25 = (var24.field1714 * arg4 + var24.field1713 * arg2 + var24.field1712 * arg3) / (var24.field1715 * var7) + arg0;
                    var8.field1663[var15] = method2388(var19, var25);
                } else if (var16 == 1) {
                    class132 var26 = this.field1542[var15];
                    int var27 = (var26.field1845 * arg4 + var26.field1848 * arg2 + var26.field1844 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1634[var15] = method2388(this.field1515[var15] & 0xFFFF, var27);
                    var8.field1663[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1634[var15] = 128;
                    var8.field1663[var15] = -1;
                } else {
                    var8.field1663[var15] = -2;
                }
            } else if (var16 == 0) {
                class124 var28;
                if (this.field1529 == null || this.field1529[this.field1503[var15]] == null) {
                    var28 = this.field1528[this.field1503[var15]];
                } else {
                    var28 = this.field1529[this.field1503[var15]];
                }
                int var29 = (var28.field1714 * arg4 + var28.field1713 * arg2 + var28.field1712 * arg3) / (var28.field1715 * var7) + arg0;
                var8.field1634[var15] = method2408(var29);
                class124 var30;
                if (this.field1529 == null || this.field1529[this.field1509[var15]] == null) {
                    var30 = this.field1528[this.field1509[var15]];
                } else {
                    var30 = this.field1529[this.field1509[var15]];
                }
                int var31 = (var30.field1714 * arg4 + var30.field1713 * arg2 + var30.field1712 * arg3) / (var30.field1715 * var7) + arg0;
                var8.field1631[var15] = method2408(var31);
                class124 var32;
                if (this.field1529 == null || this.field1529[this.field1510[var15]] == null) {
                    var32 = this.field1528[this.field1510[var15]];
                } else {
                    var32 = this.field1529[this.field1510[var15]];
                }
                int var33 = (var32.field1714 * arg4 + var32.field1713 * arg2 + var32.field1712 * arg3) / (var32.field1715 * var7) + arg0;
                var8.field1663[var15] = method2408(var33);
            } else if (var16 == 1) {
                class132 var34 = this.field1542[var15];
                int var35 = (var34.field1845 * arg4 + var34.field1848 * arg2 + var34.field1844 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1634[var15] = method2408(var35);
                var8.field1663[var15] = -1;
            } else {
                var8.field1663[var15] = -2;
            }
        }
        this.method2393();
        var8.field1626 = this.field1534;
        var8.field1627 = this.field1504;
        var8.field1628 = this.field1505;
        var8.field1643 = this.field1513;
        var8.field1625 = this.field1507;
        var8.field1658 = this.field1503;
        var8.field1632 = this.field1509;
        var8.field1633 = this.field1510;
        var8.field1637 = this.field1512;
        var8.field1638 = this.field1527;
        var8.field1641 = this.field1521;
        var8.field1646 = this.field1508;
        var8.field1647 = this.field1526;
        var8.field1654 = this.field1506;
        return var8;
    }

    @ObfuscatedName("dt.av(II)I")
    public static final int method2388(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("dt.as(I)I")
    public static final int method2408(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
