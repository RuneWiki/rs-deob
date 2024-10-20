package deob;

@ObfuscatedName("dq")
public class class122 extends class136 {

    @ObfuscatedName("dq.u")
    public int field1575 = 0;

    @ObfuscatedName("dq.f")
    public int[] field1541;

    @ObfuscatedName("dq.b")
    public int[] field1573;

    @ObfuscatedName("dq.g")
    public int[] field1543;

    @ObfuscatedName("dq.z")
    public int field1576 = 0;

    @ObfuscatedName("dq.p")
    public int[] field1545;

    @ObfuscatedName("dq.h")
    public int[] field1546;

    @ObfuscatedName("dq.y")
    public int[] field1547;

    @ObfuscatedName("dq.w")
    public byte[] field1554;

    @ObfuscatedName("dq.i")
    public byte[] field1549;

    @ObfuscatedName("dq.k")
    public byte[] field1550;

    @ObfuscatedName("dq.x")
    public byte[] field1551;

    @ObfuscatedName("dq.o")
    public short[] field1552;

    @ObfuscatedName("dq.e")
    public short[] field1556;

    @ObfuscatedName("dq.n")
    public byte field1563 = 0;

    @ObfuscatedName("dq.r")
    public int field1558;

    @ObfuscatedName("dq.c")
    public byte[] field1542;

    @ObfuscatedName("dq.a")
    public short[] field1557;

    @ObfuscatedName("dq.d")
    public short[] field1567;

    @ObfuscatedName("dq.s")
    public short[] field1559;

    @ObfuscatedName("dq.t")
    public int[] field1548;

    @ObfuscatedName("dq.m")
    public int[] field1561;

    @ObfuscatedName("dq.v")
    public int[][] field1562;

    @ObfuscatedName("dq.q")
    public int[][] field1572;

    @ObfuscatedName("dq.l")
    public class138[] field1564;

    @ObfuscatedName("dq.j")
    public class130[] field1565;

    @ObfuscatedName("dq.af")
    public class130[] field1566;

    @ObfuscatedName("dq.ad")
    public short field1540;

    @ObfuscatedName("dq.am")
    public short field1568;

    @ObfuscatedName("dq.ai")
    public boolean field1569 = false;

    @ObfuscatedName("dq.ag")
    public int field1570;

    @ObfuscatedName("dq.ao")
    public int field1571;

    @ObfuscatedName("dq.aw")
    public int field1560;

    @ObfuscatedName("dq.ak")
    public int field1555;

    @ObfuscatedName("dq.aa")
    public int field1574;

    @ObfuscatedName("dq.ab")
    public static int[] field1577 = new int[10000];

    @ObfuscatedName("dq.ar")
    public static int[] field1544 = new int[10000];

    @ObfuscatedName("dq.av")
    public static int field1553 = 0;

    @ObfuscatedName("dq.aq")
    public static int[] field1578 = class131.field1773;

    @ObfuscatedName("dq.ac")
    public static int[] field1579 = class131.field1774;

    public class122() {
    }

    @ObfuscatedName("dq.u(Lhf;II)Ldq;")
    public static class122 method2548(class234 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3928(arg1, arg2);
        return var3 == null ? null : new class122(var3);
    }

    public class122(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2549(arg0);
        } else {
            this.method2550(arg0);
        }
    }

    @ObfuscatedName("dq.f([B)V")
    public void method2549(byte[] arg0) {
        class300 var2 = new class300(arg0);
        class300 var3 = new class300(arg0);
        class300 var4 = new class300(arg0);
        class300 var5 = new class300(arg0);
        class300 var6 = new class300(arg0);
        class300 var7 = new class300(arg0);
        class300 var8 = new class300(arg0);
        var2.field3707 = arg0.length - 23;
        int var9 = var2.method5337();
        int var10 = var2.method5337();
        int var11 = var2.method5138();
        int var12 = var2.method5138();
        int var13 = var2.method5138();
        int var14 = var2.method5138();
        int var15 = var2.method5138();
        int var16 = var2.method5138();
        int var17 = var2.method5138();
        int var18 = var2.method5337();
        int var19 = var2.method5337();
        int var20 = var2.method5337();
        int var21 = var2.method5337();
        int var22 = var2.method5337();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1542 = new byte[var11];
            var2.field3707 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1542[var26] = var2.method5139();
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
        this.field1575 = var9;
        this.field1576 = var10;
        this.field1558 = var11;
        this.field1541 = new int[var9];
        this.field1573 = new int[var9];
        this.field1543 = new int[var9];
        this.field1545 = new int[var10];
        this.field1546 = new int[var10];
        this.field1547 = new int[var10];
        if (var17 == 1) {
            this.field1548 = new int[var9];
        }
        if (var12 == 1) {
            this.field1554 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1549 = new byte[var10];
        } else {
            this.field1563 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1550 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1561 = new int[var10];
        }
        if (var16 == 1) {
            this.field1556 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1551 = new byte[var10];
        }
        this.field1552 = new short[var10];
        if (var11 > 0) {
            this.field1557 = new short[var11];
            this.field1567 = new short[var11];
            this.field1559 = new short[var11];
        }
        var2.field3707 = var11;
        var3.field3707 = var44;
        var4.field3707 = var46;
        var5.field3707 = var48;
        var6.field3707 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method5138();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method5151();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method5151();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method5151();
            }
            this.field1541[var67] = var64 + var69;
            this.field1573[var67] = var65 + var70;
            this.field1543[var67] = var66 + var71;
            var64 = this.field1541[var67];
            var65 = this.field1573[var67];
            var66 = this.field1543[var67];
            if (var17 == 1) {
                this.field1548[var67] = var6.method5138();
            }
        }
        var2.field3707 = var42;
        var3.field3707 = var31;
        var4.field3707 = var34;
        var5.field3707 = var37;
        var6.field3707 = var35;
        var7.field3707 = var40;
        var8.field3707 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field1552[var72] = (short) var2.method5337();
            if (var12 == 1) {
                this.field1554[var72] = var3.method5139();
            }
            if (var13 == 255) {
                this.field1549[var72] = var4.method5139();
            }
            if (var14 == 1) {
                this.field1550[var72] = var5.method5139();
            }
            if (var15 == 1) {
                this.field1561[var72] = var6.method5138();
            }
            if (var16 == 1) {
                this.field1556[var72] = (short) (var7.method5337() - 1);
            }
            if (this.field1551 != null && this.field1556[var72] != -1) {
                this.field1551[var72] = (byte) (var8.method5138() - 1);
            }
        }
        var2.field3707 = var33;
        var3.field3707 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method5138();
            if (var78 == 1) {
                var73 = var2.method5151() + var76;
                var74 = var2.method5151() + var73;
                var75 = var2.method5151() + var74;
                var76 = var75;
                this.field1545[var77] = var73;
                this.field1546[var77] = var74;
                this.field1547[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method5151() + var76;
                var76 = var75;
                this.field1545[var77] = var73;
                this.field1546[var77] = var74;
                this.field1547[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method5151() + var76;
                var76 = var75;
                this.field1545[var77] = var73;
                this.field1546[var77] = var74;
                this.field1547[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method5151() + var76;
                var76 = var75;
                this.field1545[var77] = var73;
                this.field1546[var77] = var81;
                this.field1547[var77] = var75;
            }
        }
        var2.field3707 = var50;
        var3.field3707 = var52;
        var4.field3707 = var54;
        var5.field3707 = var56;
        var6.field3707 = var58;
        var7.field3707 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field1542[var82] & 0xFF;
            if (var83 == 0) {
                this.field1557[var82] = (short) var2.method5337();
                this.field1567[var82] = (short) var2.method5337();
                this.field1559[var82] = (short) var2.method5337();
            }
        }
        var2.field3707 = var62;
        int var84 = var2.method5138();
        if (var84 == 0) {
            return;
        }
        new class135();
        var2.method5337();
        var2.method5337();
        var2.method5337();
        var2.method5277();
    }

    @ObfuscatedName("dq.b([B)V")
    public void method2550(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class300 var4 = new class300(arg0);
        class300 var5 = new class300(arg0);
        class300 var6 = new class300(arg0);
        class300 var7 = new class300(arg0);
        class300 var8 = new class300(arg0);
        var4.field3707 = arg0.length - 18;
        int var9 = var4.method5337();
        int var10 = var4.method5337();
        int var11 = var4.method5138();
        int var12 = var4.method5138();
        int var13 = var4.method5138();
        int var14 = var4.method5138();
        int var15 = var4.method5138();
        int var16 = var4.method5138();
        int var17 = var4.method5337();
        int var18 = var4.method5337();
        int var19 = var4.method5337();
        int var20 = var4.method5337();
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
        this.field1575 = var9;
        this.field1576 = var10;
        this.field1558 = var11;
        this.field1541 = new int[var9];
        this.field1573 = new int[var9];
        this.field1543 = new int[var9];
        this.field1545 = new int[var10];
        this.field1546 = new int[var10];
        this.field1547 = new int[var10];
        if (var11 > 0) {
            this.field1542 = new byte[var11];
            this.field1557 = new short[var11];
            this.field1567 = new short[var11];
            this.field1559 = new short[var11];
        }
        if (var16 == 1) {
            this.field1548 = new int[var9];
        }
        if (var12 == 1) {
            this.field1554 = new byte[var10];
            this.field1551 = new byte[var10];
            this.field1556 = new short[var10];
        }
        if (var13 == 255) {
            this.field1549 = new byte[var10];
        } else {
            this.field1563 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1550 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1561 = new int[var10];
        }
        this.field1552 = new short[var10];
        var4.field3707 = var21;
        var5.field3707 = var36;
        var6.field3707 = var38;
        var7.field3707 = var40;
        var8.field3707 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method5138();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method5151();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method5151();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method5151();
            }
            this.field1541[var46] = var43 + var48;
            this.field1573[var46] = var44 + var49;
            this.field1543[var46] = var45 + var50;
            var43 = this.field1541[var46];
            var44 = this.field1573[var46];
            var45 = this.field1543[var46];
            if (var16 == 1) {
                this.field1548[var46] = var8.method5138();
            }
        }
        var4.field3707 = var32;
        var5.field3707 = var28;
        var6.field3707 = var26;
        var7.field3707 = var30;
        var8.field3707 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field1552[var51] = (short) var4.method5337();
            if (var12 == 1) {
                int var52 = var5.method5138();
                if ((var52 & 0x1) == 1) {
                    this.field1554[var51] = 1;
                    var2 = true;
                } else {
                    this.field1554[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field1551[var51] = (byte) (var52 >> 2);
                    this.field1556[var51] = this.field1552[var51];
                    this.field1552[var51] = 127;
                    if (this.field1556[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1551[var51] = -1;
                    this.field1556[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field1549[var51] = var6.method5139();
            }
            if (var14 == 1) {
                this.field1550[var51] = var7.method5139();
            }
            if (var15 == 1) {
                this.field1561[var51] = var8.method5138();
            }
        }
        var4.field3707 = var25;
        var5.field3707 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method5138();
            if (var58 == 1) {
                var53 = var4.method5151() + var56;
                var54 = var4.method5151() + var53;
                var55 = var4.method5151() + var54;
                var56 = var55;
                this.field1545[var57] = var53;
                this.field1546[var57] = var54;
                this.field1547[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method5151() + var56;
                var56 = var55;
                this.field1545[var57] = var53;
                this.field1546[var57] = var54;
                this.field1547[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method5151() + var56;
                var56 = var55;
                this.field1545[var57] = var53;
                this.field1546[var57] = var54;
                this.field1547[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method5151() + var56;
                var56 = var55;
                this.field1545[var57] = var53;
                this.field1546[var57] = var61;
                this.field1547[var57] = var55;
            }
        }
        var4.field3707 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field1542[var62] = 0;
            this.field1557[var62] = (short) var4.method5337();
            this.field1567[var62] = (short) var4.method5337();
            this.field1559[var62] = (short) var4.method5337();
        }
        if (this.field1551 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field1551[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field1557[var65] & 0xFFFF) == this.field1545[var64] && (this.field1567[var65] & 0xFFFF) == this.field1546[var64] && (this.field1559[var65] & 0xFFFF) == this.field1547[var64]) {
                        this.field1551[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field1551 = null;
            }
        }
        if (!var3) {
            this.field1556 = null;
        }
        if (!var2) {
            this.field1554 = null;
        }
    }

    public class122(class122[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1575 = 0;
        this.field1576 = 0;
        this.field1558 = 0;
        this.field1563 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class122 var10 = arg0[var9];
            if (var10 != null) {
                this.field1575 += var10.field1575;
                this.field1576 += var10.field1576;
                this.field1558 += var10.field1558;
                if (var10.field1549 == null) {
                    if (this.field1563 == -1) {
                        this.field1563 = var10.field1563;
                    }
                    if (this.field1563 != var10.field1563) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field1554 != null;
                var5 |= var10.field1550 != null;
                var6 |= var10.field1561 != null;
                var7 |= var10.field1556 != null;
                var8 |= var10.field1551 != null;
            }
        }
        this.field1541 = new int[this.field1575];
        this.field1573 = new int[this.field1575];
        this.field1543 = new int[this.field1575];
        this.field1548 = new int[this.field1575];
        this.field1545 = new int[this.field1576];
        this.field1546 = new int[this.field1576];
        this.field1547 = new int[this.field1576];
        if (var3) {
            this.field1554 = new byte[this.field1576];
        }
        if (var4) {
            this.field1549 = new byte[this.field1576];
        }
        if (var5) {
            this.field1550 = new byte[this.field1576];
        }
        if (var6) {
            this.field1561 = new int[this.field1576];
        }
        if (var7) {
            this.field1556 = new short[this.field1576];
        }
        if (var8) {
            this.field1551 = new byte[this.field1576];
        }
        this.field1552 = new short[this.field1576];
        if (this.field1558 > 0) {
            this.field1542 = new byte[this.field1558];
            this.field1557 = new short[this.field1558];
            this.field1567 = new short[this.field1558];
            this.field1559 = new short[this.field1558];
        }
        this.field1575 = 0;
        this.field1576 = 0;
        this.field1558 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class122 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field1576; var13++) {
                    if (var3 && var12.field1554 != null) {
                        this.field1554[this.field1576] = var12.field1554[var13];
                    }
                    if (var4) {
                        if (var12.field1549 == null) {
                            this.field1549[this.field1576] = var12.field1563;
                        } else {
                            this.field1549[this.field1576] = var12.field1549[var13];
                        }
                    }
                    if (var5 && var12.field1550 != null) {
                        this.field1550[this.field1576] = var12.field1550[var13];
                    }
                    if (var6 && var12.field1561 != null) {
                        this.field1561[this.field1576] = var12.field1561[var13];
                    }
                    if (var7) {
                        if (var12.field1556 == null) {
                            this.field1556[this.field1576] = -1;
                        } else {
                            this.field1556[this.field1576] = var12.field1556[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field1551 == null || var12.field1551[var13] == -1) {
                            this.field1551[this.field1576] = -1;
                        } else {
                            this.field1551[this.field1576] = (byte) (var12.field1551[var13] + this.field1558);
                        }
                    }
                    this.field1552[this.field1576] = var12.field1552[var13];
                    this.field1545[this.field1576] = this.method2552(var12, var12.field1545[var13]);
                    this.field1546[this.field1576] = this.method2552(var12, var12.field1546[var13]);
                    this.field1547[this.field1576] = this.method2552(var12, var12.field1547[var13]);
                    this.field1576++;
                }
                for (int var14 = 0; var14 < var12.field1558; var14++) {
                    byte var15 = this.field1542[this.field1558] = var12.field1542[var14];
                    if (var15 == 0) {
                        this.field1557[this.field1558] = (short) this.method2552(var12, var12.field1557[var14]);
                        this.field1567[this.field1558] = (short) this.method2552(var12, var12.field1567[var14]);
                        this.field1559[this.field1558] = (short) this.method2552(var12, var12.field1559[var14]);
                    }
                    this.field1558++;
                }
            }
        }
    }

    @ObfuscatedName("dq.g(Ldq;I)I")
    public final int method2552(class122 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1541[arg1];
        int var5 = arg0.field1573[arg1];
        int var6 = arg0.field1543[arg1];
        for (int var7 = 0; var7 < this.field1575; var7++) {
            if (this.field1541[var7] == var4 && this.field1573[var7] == var5 && this.field1543[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1541[this.field1575] = var4;
            this.field1573[this.field1575] = var5;
            this.field1543[this.field1575] = var6;
            if (arg0.field1548 != null) {
                this.field1548[this.field1575] = arg0.field1548[arg1];
            }
            var3 = this.field1575++;
        }
        return var3;
    }

    public class122(class122 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1575 = arg0.field1575;
        this.field1576 = arg0.field1576;
        this.field1558 = arg0.field1558;
        if (arg1) {
            this.field1541 = arg0.field1541;
            this.field1573 = arg0.field1573;
            this.field1543 = arg0.field1543;
        } else {
            this.field1541 = new int[this.field1575];
            this.field1573 = new int[this.field1575];
            this.field1543 = new int[this.field1575];
            for (int var6 = 0; var6 < this.field1575; var6++) {
                this.field1541[var6] = arg0.field1541[var6];
                this.field1573[var6] = arg0.field1573[var6];
                this.field1543[var6] = arg0.field1543[var6];
            }
        }
        if (arg2) {
            this.field1552 = arg0.field1552;
        } else {
            this.field1552 = new short[this.field1576];
            for (int var7 = 0; var7 < this.field1576; var7++) {
                this.field1552[var7] = arg0.field1552[var7];
            }
        }
        if (arg3 || arg0.field1556 == null) {
            this.field1556 = arg0.field1556;
        } else {
            this.field1556 = new short[this.field1576];
            for (int var8 = 0; var8 < this.field1576; var8++) {
                this.field1556[var8] = arg0.field1556[var8];
            }
        }
        if (arg4) {
            this.field1550 = arg0.field1550;
        } else {
            this.field1550 = new byte[this.field1576];
            if (arg0.field1550 == null) {
                for (int var9 = 0; var9 < this.field1576; var9++) {
                    this.field1550[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1576; var10++) {
                    this.field1550[var10] = arg0.field1550[var10];
                }
            }
        }
        this.field1545 = arg0.field1545;
        this.field1546 = arg0.field1546;
        this.field1547 = arg0.field1547;
        this.field1554 = arg0.field1554;
        this.field1549 = arg0.field1549;
        this.field1551 = arg0.field1551;
        this.field1563 = arg0.field1563;
        this.field1542 = arg0.field1542;
        this.field1557 = arg0.field1557;
        this.field1567 = arg0.field1567;
        this.field1559 = arg0.field1559;
        this.field1548 = arg0.field1548;
        this.field1561 = arg0.field1561;
        this.field1562 = arg0.field1562;
        this.field1572 = arg0.field1572;
        this.field1565 = arg0.field1565;
        this.field1564 = arg0.field1564;
        this.field1566 = arg0.field1566;
        this.field1540 = arg0.field1540;
        this.field1568 = arg0.field1568;
    }

    @ObfuscatedName("dq.z()Ldq;")
    public class122 method2574() {
        class122 var1 = new class122();
        if (this.field1554 != null) {
            var1.field1554 = new byte[this.field1576];
            for (int var2 = 0; var2 < this.field1576; var2++) {
                var1.field1554[var2] = this.field1554[var2];
            }
        }
        var1.field1575 = this.field1575;
        var1.field1576 = this.field1576;
        var1.field1558 = this.field1558;
        var1.field1541 = this.field1541;
        var1.field1573 = this.field1573;
        var1.field1543 = this.field1543;
        var1.field1545 = this.field1545;
        var1.field1546 = this.field1546;
        var1.field1547 = this.field1547;
        var1.field1549 = this.field1549;
        var1.field1550 = this.field1550;
        var1.field1551 = this.field1551;
        var1.field1552 = this.field1552;
        var1.field1556 = this.field1556;
        var1.field1563 = this.field1563;
        var1.field1542 = this.field1542;
        var1.field1557 = this.field1557;
        var1.field1567 = this.field1567;
        var1.field1559 = this.field1559;
        var1.field1548 = this.field1548;
        var1.field1561 = this.field1561;
        var1.field1562 = this.field1562;
        var1.field1572 = this.field1572;
        var1.field1565 = this.field1565;
        var1.field1564 = this.field1564;
        var1.field1540 = this.field1540;
        var1.field1568 = this.field1568;
        return var1;
    }

    @ObfuscatedName("dq.p([[IIIIZI)Ldq;")
    public class122 method2554(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2556();
        int var7 = this.field1571 + arg1;
        int var8 = this.field1560 + arg1;
        int var9 = this.field1574 + arg3;
        int var10 = this.field1555 + arg3;
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
            var15.field1575 = this.field1575;
            var15.field1576 = this.field1576;
            var15.field1558 = this.field1558;
            var15.field1541 = this.field1541;
            var15.field1543 = this.field1543;
            var15.field1545 = this.field1545;
            var15.field1546 = this.field1546;
            var15.field1547 = this.field1547;
            var15.field1554 = this.field1554;
            var15.field1549 = this.field1549;
            var15.field1550 = this.field1550;
            var15.field1551 = this.field1551;
            var15.field1552 = this.field1552;
            var15.field1556 = this.field1556;
            var15.field1563 = this.field1563;
            var15.field1542 = this.field1542;
            var15.field1557 = this.field1557;
            var15.field1567 = this.field1567;
            var15.field1559 = this.field1559;
            var15.field1548 = this.field1548;
            var15.field1561 = this.field1561;
            var15.field1562 = this.field1562;
            var15.field1572 = this.field1572;
            var15.field1540 = this.field1540;
            var15.field1568 = this.field1568;
            var15.field1573 = new int[var15.field1575];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1575; var16++) {
                int var17 = this.field1541[var16] + arg1;
                int var18 = this.field1543[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1573[var16] = this.field1573[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1575; var26++) {
                int var27 = (-this.field1573[var26] << 16) / this.field1863;
                if (var27 < arg5) {
                    int var28 = this.field1541[var26] + arg1;
                    int var29 = this.field1543[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1573[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1573[var26];
                }
            }
        }
        var15.method2566();
        return var15;
    }

    @ObfuscatedName("dq.h()V")
    public void method2555() {
        int var10002;
        if (this.field1548 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1575; var3++) {
                int var4 = this.field1548[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1562 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1562[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1575) {
                int var7 = this.field1548[var6];
                this.field1562[var7][var1[var7]++] = var6++;
            }
            this.field1548 = null;
        }
        if (this.field1561 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1576; var10++) {
            int var11 = this.field1561[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1572 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1572[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1576) {
            int var14 = this.field1561[var13];
            this.field1572[var14][var8[var14]++] = var13++;
        }
        this.field1561 = null;
    }

    @ObfuscatedName("dq.y()V")
    public void method2619() {
        for (int var1 = 0; var1 < this.field1575; var1++) {
            int var2 = this.field1541[var1];
            this.field1541[var1] = this.field1543[var1];
            this.field1543[var1] = -var2;
        }
        this.method2566();
    }

    @ObfuscatedName("dq.i()V")
    public void method2607() {
        for (int var1 = 0; var1 < this.field1575; var1++) {
            this.field1541[var1] = -this.field1541[var1];
            this.field1543[var1] = -this.field1543[var1];
        }
        this.method2566();
    }

    @ObfuscatedName("dq.k()V")
    public void method2558() {
        for (int var1 = 0; var1 < this.field1575; var1++) {
            int var2 = this.field1543[var1];
            this.field1543[var1] = this.field1541[var1];
            this.field1541[var1] = -var2;
        }
        this.method2566();
    }

    @ObfuscatedName("dq.x(I)V")
    public void method2557(int arg0) {
        int var2 = field1578[arg0];
        int var3 = field1579[arg0];
        for (int var4 = 0; var4 < this.field1575; var4++) {
            int var5 = this.field1543[var4] * var2 + this.field1541[var4] * var3 >> 16;
            this.field1543[var4] = this.field1543[var4] * var3 - this.field1541[var4] * var2 >> 16;
            this.field1541[var4] = var5;
        }
        this.method2566();
    }

    @ObfuscatedName("dq.o(III)V")
    public void method2559(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1575; var4++) {
            this.field1541[var4] += arg0;
            this.field1573[var4] += arg1;
            this.field1543[var4] += arg2;
        }
        this.method2566();
    }

    @ObfuscatedName("dq.e(SS)V")
    public void method2561(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1576; var3++) {
            if (this.field1552[var3] == arg0) {
                this.field1552[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dq.n(SS)V")
    public void method2617(short arg0, short arg1) {
        if (this.field1556 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1576; var3++) {
            if (this.field1556[var3] == arg0) {
                this.field1556[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dq.c()V")
    public void method2613() {
        for (int var1 = 0; var1 < this.field1575; var1++) {
            this.field1543[var1] = -this.field1543[var1];
        }
        for (int var2 = 0; var2 < this.field1576; var2++) {
            int var3 = this.field1545[var2];
            this.field1545[var2] = this.field1547[var2];
            this.field1547[var2] = var3;
        }
        this.method2566();
    }

    @ObfuscatedName("dq.s(III)V")
    public void method2564(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1575; var4++) {
            this.field1541[var4] = this.field1541[var4] * arg0 / 128;
            this.field1573[var4] = this.field1573[var4] * arg1 / 128;
            this.field1543[var4] = this.field1543[var4] * arg2 / 128;
        }
        this.method2566();
    }

    @ObfuscatedName("dq.t()V")
    public void method2547() {
        if (this.field1565 != null) {
            return;
        }
        this.field1565 = new class130[this.field1575];
        for (int var1 = 0; var1 < this.field1575; var1++) {
            this.field1565[var1] = new class130();
        }
        for (int var2 = 0; var2 < this.field1576; var2++) {
            int var3 = this.field1545[var2];
            int var4 = this.field1546[var2];
            int var5 = this.field1547[var2];
            int var6 = this.field1541[var4] - this.field1541[var3];
            int var7 = this.field1573[var4] - this.field1573[var3];
            int var8 = this.field1543[var4] - this.field1543[var3];
            int var9 = this.field1541[var5] - this.field1541[var3];
            int var10 = this.field1573[var5] - this.field1573[var3];
            int var11 = this.field1543[var5] - this.field1543[var3];
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
            if (this.field1554 == null) {
                var19 = 0;
            } else {
                var19 = this.field1554[var2];
            }
            if (var19 == 0) {
                class130 var20 = this.field1565[var3];
                var20.field1747 += var16;
                var20.field1742 += var17;
                var20.field1741 += var18;
                var20.field1744++;
                class130 var21 = this.field1565[var4];
                var21.field1747 += var16;
                var21.field1742 += var17;
                var21.field1741 += var18;
                var21.field1744++;
                class130 var22 = this.field1565[var5];
                var22.field1747 += var16;
                var22.field1742 += var17;
                var22.field1741 += var18;
                var22.field1744++;
            } else if (var19 == 1) {
                if (this.field1564 == null) {
                    this.field1564 = new class138[this.field1576];
                }
                class138 var23 = this.field1564[var2] = new class138();
                var23.field1880 = var16;
                var23.field1875 = var17;
                var23.field1876 = var18;
            }
        }
    }

    @ObfuscatedName("dq.m()V")
    public void method2566() {
        this.field1565 = null;
        this.field1566 = null;
        this.field1564 = null;
        this.field1569 = false;
    }

    @ObfuscatedName("dq.v()V")
    public void method2556() {
        if (this.field1569) {
            return;
        }
        this.field1863 = 0;
        this.field1570 = 0;
        this.field1571 = 999999;
        this.field1560 = -999999;
        this.field1555 = -99999;
        this.field1574 = 99999;
        for (int var1 = 0; var1 < this.field1575; var1++) {
            int var2 = this.field1541[var1];
            int var3 = this.field1573[var1];
            int var4 = this.field1543[var1];
            if (var2 < this.field1571) {
                this.field1571 = var2;
            }
            if (var2 > this.field1560) {
                this.field1560 = var2;
            }
            if (var4 < this.field1574) {
                this.field1574 = var4;
            }
            if (var4 > this.field1555) {
                this.field1555 = var4;
            }
            if (-var3 > this.field1863) {
                this.field1863 = -var3;
            }
            if (var3 > this.field1570) {
                this.field1570 = var3;
            }
        }
        this.field1569 = true;
    }

    @ObfuscatedName("dq.q(Ldq;Ldq;IIIZ)V")
    public static void method2563(class122 arg0, class122 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2556();
        arg0.method2547();
        arg1.method2556();
        arg1.method2547();
        field1553++;
        int var6 = 0;
        int[] var7 = arg1.field1541;
        int var8 = arg1.field1575;
        for (int var9 = 0; var9 < arg0.field1575; var9++) {
            class130 var10 = arg0.field1565[var9];
            if (var10.field1744 != 0) {
                int var11 = arg0.field1573[var9] - arg3;
                if (var11 <= arg1.field1570) {
                    int var12 = arg0.field1541[var9] - arg2;
                    if (var12 >= arg1.field1571 && var12 <= arg1.field1560) {
                        int var13 = arg0.field1543[var9] - arg4;
                        if (var13 >= arg1.field1574 && var13 <= arg1.field1555) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class130 var15 = arg1.field1565[var14];
                                if (var7[var14] == var12 && arg1.field1543[var14] == var13 && arg1.field1573[var14] == var11 && var15.field1744 != 0) {
                                    if (arg0.field1566 == null) {
                                        arg0.field1566 = new class130[arg0.field1575];
                                    }
                                    if (arg1.field1566 == null) {
                                        arg1.field1566 = new class130[var8];
                                    }
                                    class130 var16 = arg0.field1566[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field1566[var9] = new class130(var10);
                                    }
                                    class130 var17 = arg1.field1566[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field1566[var14] = new class130(var15);
                                    }
                                    var16.field1747 += var15.field1747;
                                    var16.field1742 += var15.field1742;
                                    var16.field1741 += var15.field1741;
                                    var16.field1744 += var15.field1744;
                                    var17.field1747 += var10.field1747;
                                    var17.field1742 += var10.field1742;
                                    var17.field1741 += var10.field1741;
                                    var17.field1744 += var10.field1744;
                                    var6++;
                                    field1577[var9] = field1553;
                                    field1544[var14] = field1553;
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
        for (int var18 = 0; var18 < arg0.field1576; var18++) {
            if (field1577[arg0.field1545[var18]] == field1553 && field1577[arg0.field1546[var18]] == field1553 && field1577[arg0.field1547[var18]] == field1553) {
                if (arg0.field1554 == null) {
                    arg0.field1554 = new byte[arg0.field1576];
                }
                arg0.field1554[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field1576; var19++) {
            if (field1544[arg1.field1545[var19]] == field1553 && field1544[arg1.field1546[var19]] == field1553 && field1544[arg1.field1547[var19]] == field1553) {
                if (arg1.field1554 == null) {
                    arg1.field1554 = new byte[arg1.field1576];
                }
                arg1.field1554[var19] = 2;
            }
        }
    }

    @ObfuscatedName("dq.l(IIIII)Ldf;")
    public final class128 method2568(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2547();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class128 var8 = new class128();
        var8.field1693 = new int[this.field1576];
        var8.field1660 = new int[this.field1576];
        var8.field1712 = new int[this.field1576];
        if (this.field1558 > 0 && this.field1551 != null) {
            int[] var9 = new int[this.field1558];
            for (int var10 = 0; var10 < this.field1576; var10++) {
                if (this.field1551[var10] != -1) {
                    var9[this.field1551[var10] & 0xFF]++;
                }
            }
            var8.field1680 = 0;
            for (int var11 = 0; var11 < this.field1558; var11++) {
                if (var9[var11] > 0 && this.field1542[var11] == 0) {
                    var8.field1680++;
                }
            }
            var8.field1681 = new int[var8.field1680];
            var8.field1706 = new int[var8.field1680];
            var8.field1683 = new int[var8.field1680];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field1558; var13++) {
                if (var9[var13] > 0 && this.field1542[var13] == 0) {
                    var8.field1681[var12] = this.field1557[var13] & 0xFFFF;
                    var8.field1706[var12] = this.field1567[var13] & 0xFFFF;
                    var8.field1683[var12] = this.field1559[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field1677 = new byte[this.field1576];
            for (int var14 = 0; var14 < this.field1576; var14++) {
                if (this.field1551[var14] == -1) {
                    var8.field1677[var14] = -1;
                } else {
                    var8.field1677[var14] = (byte) var9[this.field1551[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field1576; var15++) {
            byte var16;
            if (this.field1554 == null) {
                var16 = 0;
            } else {
                var16 = this.field1554[var15];
            }
            byte var17;
            if (this.field1550 == null) {
                var17 = 0;
            } else {
                var17 = this.field1550[var15];
            }
            short var18;
            if (this.field1556 == null) {
                var18 = -1;
            } else {
                var18 = this.field1556[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field1552[var15] & 0xFFFF;
                    class130 var20;
                    if (this.field1566 == null || this.field1566[this.field1545[var15]] == null) {
                        var20 = this.field1565[this.field1545[var15]];
                    } else {
                        var20 = this.field1566[this.field1545[var15]];
                    }
                    int var21 = (var20.field1741 * arg4 + var20.field1747 * arg2 + var20.field1742 * arg3) / (var20.field1744 * var7) + arg0;
                    var8.field1693[var15] = method2569(var19, var21);
                    class130 var22;
                    if (this.field1566 == null || this.field1566[this.field1546[var15]] == null) {
                        var22 = this.field1565[this.field1546[var15]];
                    } else {
                        var22 = this.field1566[this.field1546[var15]];
                    }
                    int var23 = (var22.field1741 * arg4 + var22.field1747 * arg2 + var22.field1742 * arg3) / (var22.field1744 * var7) + arg0;
                    var8.field1660[var15] = method2569(var19, var23);
                    class130 var24;
                    if (this.field1566 == null || this.field1566[this.field1547[var15]] == null) {
                        var24 = this.field1565[this.field1547[var15]];
                    } else {
                        var24 = this.field1566[this.field1547[var15]];
                    }
                    int var25 = (var24.field1741 * arg4 + var24.field1747 * arg2 + var24.field1742 * arg3) / (var24.field1744 * var7) + arg0;
                    var8.field1712[var15] = method2569(var19, var25);
                } else if (var16 == 1) {
                    class138 var26 = this.field1564[var15];
                    int var27 = (var26.field1876 * arg4 + var26.field1880 * arg2 + var26.field1875 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field1693[var15] = method2569(this.field1552[var15] & 0xFFFF, var27);
                    var8.field1712[var15] = -1;
                } else if (var16 == 3) {
                    var8.field1693[var15] = 128;
                    var8.field1712[var15] = -1;
                } else {
                    var8.field1712[var15] = -2;
                }
            } else if (var16 == 0) {
                class130 var28;
                if (this.field1566 == null || this.field1566[this.field1545[var15]] == null) {
                    var28 = this.field1565[this.field1545[var15]];
                } else {
                    var28 = this.field1566[this.field1545[var15]];
                }
                int var29 = (var28.field1741 * arg4 + var28.field1747 * arg2 + var28.field1742 * arg3) / (var28.field1744 * var7) + arg0;
                var8.field1693[var15] = method2570(var29);
                class130 var30;
                if (this.field1566 == null || this.field1566[this.field1546[var15]] == null) {
                    var30 = this.field1565[this.field1546[var15]];
                } else {
                    var30 = this.field1566[this.field1546[var15]];
                }
                int var31 = (var30.field1741 * arg4 + var30.field1747 * arg2 + var30.field1742 * arg3) / (var30.field1744 * var7) + arg0;
                var8.field1660[var15] = method2570(var31);
                class130 var32;
                if (this.field1566 == null || this.field1566[this.field1547[var15]] == null) {
                    var32 = this.field1565[this.field1547[var15]];
                } else {
                    var32 = this.field1566[this.field1547[var15]];
                }
                int var33 = (var32.field1741 * arg4 + var32.field1747 * arg2 + var32.field1742 * arg3) / (var32.field1744 * var7) + arg0;
                var8.field1712[var15] = method2570(var33);
            } else if (var16 == 1) {
                class138 var34 = this.field1564[var15];
                int var35 = (var34.field1876 * arg4 + var34.field1880 * arg2 + var34.field1875 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field1693[var15] = method2570(var35);
                var8.field1712[var15] = -1;
            } else {
                var8.field1712[var15] = -2;
            }
        }
        this.method2555();
        var8.field1664 = this.field1575;
        var8.field1665 = this.field1541;
        var8.field1722 = this.field1573;
        var8.field1667 = this.field1543;
        var8.field1702 = this.field1576;
        var8.field1669 = this.field1545;
        var8.field1670 = this.field1546;
        var8.field1666 = this.field1547;
        var8.field1675 = this.field1549;
        var8.field1676 = this.field1550;
        var8.field1679 = this.field1563;
        var8.field1684 = this.field1562;
        var8.field1717 = this.field1572;
        var8.field1678 = this.field1556;
        return var8;
    }

    @ObfuscatedName("dq.j(II)I")
    public static final int method2569(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("dq.ad(I)I")
    public static final int method2570(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
