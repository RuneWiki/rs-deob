package deob;

import java.util.Random;

@ObfuscatedName("dk")
public class class127 {

    @ObfuscatedName("dk.f")
    public class116 field1549;

    @ObfuscatedName("dk.b")
    public class116 field1529;

    @ObfuscatedName("dk.l")
    public class116 field1530;

    @ObfuscatedName("dk.m")
    public class116 field1534;

    @ObfuscatedName("dk.z")
    public class116 field1532;

    @ObfuscatedName("dk.q")
    public class116 field1533;

    @ObfuscatedName("dk.k")
    public class116 field1550;

    @ObfuscatedName("dk.c")
    public class116 field1552;

    @ObfuscatedName("dk.u")
    public int[] field1536 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dk.t")
    public int[] field1537 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dk.e")
    public int[] field1542 = new int[] { 0, 0, 0, 0, 0 };

    @ObfuscatedName("dk.o")
    public int field1539 = 0;

    @ObfuscatedName("dk.n")
    public int field1540 = 100;

    @ObfuscatedName("dk.x")
    public class124 field1541;

    @ObfuscatedName("dk.p")
    public class116 field1551;

    @ObfuscatedName("dk.r")
    public int field1543 = 500;

    @ObfuscatedName("dk.y")
    public int field1544 = 0;

    @ObfuscatedName("dk.s")
    public static int[] field1545;

    @ObfuscatedName("dk.j")
    public static int[] field1528 = new int[32768];

    @ObfuscatedName("dk.w")
    public static int[] field1547;

    @ObfuscatedName("dk.d")
    public static int[] field1535;

    @ObfuscatedName("dk.a")
    public static int[] field1553;

    @ObfuscatedName("dk.g")
    public static int[] field1538;

    @ObfuscatedName("dk.h")
    public static int[] field1546;

    @ObfuscatedName("dk.i")
    public static int[] field1531;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1528[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1547 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1547[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1545 = new int[220500];
        field1535 = new int[5];
        field1553 = new int[5];
        field1538 = new int[5];
        field1546 = new int[5];
        field1531 = new int[5];
    }

    @ObfuscatedName("dk.f(II)[I")
    public final int[] method2609(int arg0, int arg1) {
        class312.method5427(field1545, 0, arg0);
        if (arg1 < 10) {
            return field1545;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1549.method2396();
        this.field1529.method2396();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1530 != null) {
            this.field1530.method2396();
            this.field1534.method2396();
            var5 = (int) ((double) (this.field1530.field1462 - this.field1530.field1459) * 32.768D / var3);
            var6 = (int) ((double) this.field1530.field1459 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1532 != null) {
            this.field1532.method2396();
            this.field1533.method2396();
            var8 = (int) ((double) (this.field1532.field1462 - this.field1532.field1459) * 32.768D / var3);
            var9 = (int) ((double) this.field1532.field1459 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1536[var11] != 0) {
                field1535[var11] = 0;
                field1553[var11] = (int) ((double) this.field1542[var11] * var3);
                field1538[var11] = (this.field1536[var11] << 14) / 100;
                field1546[var11] = (int) ((double) (this.field1549.field1462 - this.field1549.field1459) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1537[var11]) / var3);
                field1531[var11] = (int) ((double) this.field1549.field1459 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.field1549.method2392(arg0);
            int var14 = this.field1529.method2392(arg0);
            if (this.field1530 != null) {
                int var15 = this.field1530.method2392(arg0);
                int var16 = this.field1534.method2392(arg0);
                var13 += this.method2614(var7, var16, this.field1530.field1463) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.field1532 != null) {
                int var17 = this.field1532.method2392(arg0);
                int var18 = this.field1533.method2392(arg0);
                var14 = var14 * ((this.method2614(var10, var18, this.field1532.field1463) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1536[var19] != 0) {
                    int var20 = field1553[var19] + var12;
                    if (var20 < arg0) {
                        field1545[var20] += this.method2614(field1535[var19], field1538[var19] * var14 >> 15, this.field1549.field1463);
                        field1535[var19] += (field1546[var19] * var13 >> 16) + field1531[var19];
                    }
                }
            }
        }
        if (this.field1550 != null) {
            this.field1550.method2396();
            this.field1552.method2396();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.field1550.method2392(arg0);
                int var26 = this.field1552.method2392(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.field1550.field1462 - this.field1550.field1459) * var25 >> 8) + this.field1550.field1459;
                } else {
                    var27 = ((this.field1550.field1462 - this.field1550.field1459) * var26 >> 8) + this.field1550.field1459;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    field1545[var24] = 0;
                }
            }
        }
        if (this.field1539 > 0 && this.field1540 > 0) {
            int var28 = (int) ((double) this.field1539 * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                field1545[var29] += field1545[var29 - var28] * this.field1540 / 100;
            }
        }
        if (this.field1541.field1510[0] > 0 || this.field1541.field1510[1] > 0) {
            this.field1551.method2396();
            int var30 = this.field1551.method2392(arg0 + 1);
            int var31 = this.field1541.method2592(0, (float) var30 / 65536.0F);
            int var32 = this.field1541.method2592(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) field1545[var31 + var33] * (long) Statics.field1513 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) field1545[var31 + var33 - 1 - var36] * (long) class124.field1514[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) field1545[var33 - 1 - var37] * (long) class124.field1514[1][var37] >> 16);
                    }
                    field1545[var33] = var35;
                    var30 = this.field1551.method2392(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) field1545[var31 + var33] * (long) Statics.field1513 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) field1545[var31 + var33 - 1 - var40] * (long) class124.field1514[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) field1545[var33 - 1 - var41] * (long) class124.field1514[1][var41] >> 16);
                        }
                        field1545[var33] = var39;
                        var30 = this.field1551.method2392(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) field1545[var31 + var33 - 1 - var43] * (long) class124.field1514[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) field1545[var33 - 1 - var44] * (long) class124.field1514[1][var44] >> 16);
                            }
                            field1545[var33] = var42;
                            this.field1551.method2392(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.field1541.method2592(0, (float) var30 / 65536.0F);
                    var32 = this.field1541.method2592(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (field1545[var46] < -32768) {
                field1545[var46] = -32768;
            }
            if (field1545[var46] > 32767) {
                field1545[var46] = 32767;
            }
        }
        return field1545;
    }

    @ObfuscatedName("dk.b(III)I")
    public final int method2614(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1547[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1528[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dk.l(Lkb;)V")
    public final void method2610(class311 arg0) {
        this.field1549 = new class116();
        this.field1549.method2398(arg0);
        this.field1529 = new class116();
        this.field1529.method2398(arg0);
        int var2 = arg0.method5276();
        if (var2 != 0) {
            arg0.field3741--;
            this.field1530 = new class116();
            this.field1530.method2398(arg0);
            this.field1534 = new class116();
            this.field1534.method2398(arg0);
        }
        int var3 = arg0.method5276();
        if (var3 != 0) {
            arg0.field3741--;
            this.field1532 = new class116();
            this.field1532.method2398(arg0);
            this.field1533 = new class116();
            this.field1533.method2398(arg0);
        }
        int var4 = arg0.method5276();
        if (var4 != 0) {
            arg0.field3741--;
            this.field1550 = new class116();
            this.field1550.method2398(arg0);
            this.field1552 = new class116();
            this.field1552.method2398(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method5194();
            if (var6 == 0) {
                break;
            }
            this.field1536[var5] = var6;
            this.field1537[var5] = arg0.method5390();
            this.field1542[var5] = arg0.method5194();
        }
        this.field1539 = arg0.method5194();
        this.field1540 = arg0.method5194();
        this.field1543 = arg0.method5163();
        this.field1544 = arg0.method5163();
        this.field1541 = new class124();
        this.field1551 = new class116();
        this.field1541.method2600(arg0, this.field1551);
    }
}
