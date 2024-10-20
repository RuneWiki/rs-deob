package deob;

@ObfuscatedName("cb")
public class class106 extends class7 {

    @ObfuscatedName("cb.f")
    public static int field1449 = 0;

    @ObfuscatedName("cb.o")
    public static int field1452 = 0;

    @ObfuscatedName("cb.s")
    public static int field1453 = 0;

    @ObfuscatedName("cb.p")
    public static int field1451 = 0;

    @ObfuscatedName("cb.cx(IIIIII)V")
    public static void method1528(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1453) {
            arg2 -= field1453 - arg0;
            arg0 = field1453;
        }
        if (arg1 < field1451) {
            var6 += (field1451 - arg1) * var7;
            arg3 -= field1451 - arg1;
            arg1 = field1451;
        }
        if (arg0 + arg2 > field1449) {
            arg2 = field1449 - arg0;
        }
        if (arg1 + arg3 > field1452) {
            arg3 = field1452 - arg1;
        }
        int var8 = Statics.field1450 - arg2;
        int var9 = Statics.field1450 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1454[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("cb.cq()V")
    public static void method1530() {
        field1453 = 0;
        field1451 = 0;
        field1449 = Statics.field1450;
        field1452 = Statics.field1448;
    }

    @ObfuscatedName("cb.ci(IIII)V")
    public static void method1531(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1450) {
            arg2 = Statics.field1450;
        }
        if (arg3 > Statics.field1448) {
            arg3 = Statics.field1448;
        }
        field1453 = arg0;
        field1451 = arg1;
        field1449 = arg2;
        field1452 = arg3;
    }

    @ObfuscatedName("cb.dj(IIIII)V")
    public static void method1532(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1453 || arg0 >= field1449) {
            return;
        }
        if (arg1 < field1451) {
            arg2 -= field1451 - arg1;
            arg1 = field1451;
        }
        if (arg1 + arg2 > field1452) {
            arg2 = field1452 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1450 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1454[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1454[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1454[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1454[var9] = var14;
            var9 += Statics.field1450;
        }
    }

    @ObfuscatedName("cb.ca([I)V")
    public static void method1533(int[] arg0) {
        arg0[0] = field1453;
        arg0[1] = field1451;
        arg0[2] = field1449;
        arg0[3] = field1452;
    }

    @ObfuscatedName("cb.cw([I)V")
    public static void method1535(int[] arg0) {
        field1453 = arg0[0];
        field1451 = arg0[1];
        field1449 = arg0[2];
        field1452 = arg0[3];
    }

    @ObfuscatedName("cb.cp(IIIIII)V")
    public static void method1536(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1453) {
            arg2 -= field1453 - arg0;
            arg0 = field1453;
        }
        if (arg1 < field1451) {
            arg3 -= field1451 - arg1;
            arg1 = field1451;
        }
        if (arg0 + arg2 > field1449) {
            arg2 = field1449 - arg0;
        }
        if (arg1 + arg3 > field1452) {
            arg3 = field1452 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1450 - arg2;
        int var9 = Statics.field1450 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1454[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1454[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("cb.cy(IIIII)V")
    public static void method1537(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1453) {
            arg2 -= field1453 - arg0;
            arg0 = field1453;
        }
        if (arg1 < field1451) {
            arg3 -= field1451 - arg1;
            arg1 = field1451;
        }
        if (arg0 + arg2 > field1449) {
            arg2 = field1449 - arg0;
        }
        if (arg1 + arg3 > field1452) {
            arg3 = field1452 - arg1;
        }
        int var5 = Statics.field1450 - arg2;
        int var6 = Statics.field1450 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1454[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("cb.ce(IIIII)V")
    public static void method1539(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1541(arg0, arg1, arg2, arg4);
        method1541(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1543(arg0, arg1, arg3, arg4);
        method1543(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("cb.ck(IIII)V")
    public static void method1541(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1451 || arg1 >= field1452) {
            return;
        }
        if (arg0 < field1453) {
            arg2 -= field1453 - arg0;
            arg0 = field1453;
        }
        if (arg0 + arg2 > field1449) {
            arg2 = field1449 - arg0;
        }
        int var4 = Statics.field1450 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1454[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("cb.co(IIIII)V")
    public static void method1542(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1451 || arg1 >= field1452) {
            return;
        }
        if (arg0 < field1453) {
            arg2 -= field1453 - arg0;
            arg0 = field1453;
        }
        if (arg0 + arg2 > field1449) {
            arg2 = field1449 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1450 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1454[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1454[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1454[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1454[var9++] = var14;
        }
    }

    @ObfuscatedName("cb.ch(IIII)V")
    public static void method1543(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1453 || arg0 >= field1449) {
            return;
        }
        if (arg1 < field1451) {
            arg2 -= field1451 - arg1;
            arg1 = field1451;
        }
        if (arg1 + arg2 > field1452) {
            arg2 = field1452 - arg1;
        }
        int var4 = Statics.field1450 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1454[Statics.field1450 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("cb.dq(III[I[I)V")
    public static void method1546(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1450 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1454[var7++] = arg2;
            }
            var5 += Statics.field1450;
        }
    }

    @ObfuscatedName("cb.dm(IIIII)V")
    public static void method1547(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1541(arg0, arg1, var5 + 1, arg4);
            } else {
                method1541(arg0 + var5, arg1, -var5 + 1, arg4);
            }
        } else if (var5 != 0) {
            if (var5 + var6 < 0) {
                arg0 += var5;
                var5 = -var5;
                arg1 += var6;
                var6 = -var6;
            }
            if (var5 > var6) {
                int var7 = arg1 << 16;
                int var8 = var7 + 32768;
                int var9 = var6 << 16;
                int var10 = (int) Math.floor((double) var9 / (double) var5 + 0.5D);
                int var11 = arg0 + var5;
                if (arg0 < field1453) {
                    var8 += (field1453 - arg0) * var10;
                    arg0 = field1453;
                }
                if (var11 >= field1449) {
                    var11 = field1449 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1451 && var12 < field1452) {
                        Statics.field1454[Statics.field1450 * var12 + arg0] = arg4;
                    }
                    var8 += var10;
                    arg0++;
                }
            } else {
                int var13 = arg0 << 16;
                int var14 = var13 + 32768;
                int var15 = var5 << 16;
                int var16 = (int) Math.floor((double) var15 / (double) var6 + 0.5D);
                int var17 = arg1 + var6;
                if (arg1 < field1451) {
                    var14 += (field1451 - arg1) * var16;
                    arg1 = field1451;
                }
                if (var17 >= field1452) {
                    var17 = field1452 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1453 && var18 < field1449) {
                        Statics.field1454[Statics.field1450 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1543(arg0, arg1, var6 + 1, arg4);
        } else {
            method1543(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("cb.cc([III)V")
    public static void method1548(int[] arg0, int arg1, int arg2) {
        Statics.field1454 = arg0;
        Statics.field1450 = arg1;
        Statics.field1448 = arg2;
        method1531(0, 0, arg1, arg2);
    }

    @ObfuscatedName("cb.cl(IIIIII)V")
    public static void method1573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1542(arg0, arg1, arg2, arg4, arg5);
        method1542(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1532(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1532(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("cb.cm()V")
    public static void method1584() {
        int var0 = 0;
        int var1 = Statics.field1450 * Statics.field1448 - 7;
        while (var0 < var1) {
            Statics.field1454[var0++] = 0;
            Statics.field1454[var0++] = 0;
            Statics.field1454[var0++] = 0;
            Statics.field1454[var0++] = 0;
            Statics.field1454[var0++] = 0;
            Statics.field1454[var0++] = 0;
            Statics.field1454[var0++] = 0;
            Statics.field1454[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1454[var0++] = 0;
        }
    }

    @ObfuscatedName("cb.cr(IIII)V")
    public static void method1586(int arg0, int arg1, int arg2, int arg3) {
        if (field1453 < arg0) {
            field1453 = arg0;
        }
        if (field1451 < arg1) {
            field1451 = arg1;
        }
        if (field1449 > arg2) {
            field1449 = arg2;
        }
        if (field1452 > arg3) {
            field1452 = arg3;
        }
    }
}
