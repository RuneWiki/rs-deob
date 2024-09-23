import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UHNEGZAI")
public class class58 {

    @OriginalMember(owner = "UHNEGZAI", name = "a", descriptor = "I")
    private int field1465 = 49845;

    @OriginalMember(owner = "UHNEGZAI", name = "b", descriptor = "I")
    private int field1466 = 662;

    @OriginalMember(owner = "UHNEGZAI", name = "k", descriptor = "[I")
    private int[] field1475 = new int[5];

    @OriginalMember(owner = "UHNEGZAI", name = "l", descriptor = "[I")
    private int[] field1476 = new int[5];

    @OriginalMember(owner = "UHNEGZAI", name = "m", descriptor = "[I")
    private int[] field1477 = new int[5];

    @OriginalMember(owner = "UHNEGZAI", name = "o", descriptor = "I")
    private int field1479 = 100;

    @OriginalMember(owner = "UHNEGZAI", name = "r", descriptor = "I")
    public int field1482 = 500;

    @OriginalMember(owner = "UHNEGZAI", name = "w", descriptor = "[I")
    private static int[] field1487 = new int[5];

    @OriginalMember(owner = "UHNEGZAI", name = "x", descriptor = "[I")
    private static int[] field1488 = new int[5];

    @OriginalMember(owner = "UHNEGZAI", name = "y", descriptor = "[I")
    private static int[] field1489 = new int[5];

    @OriginalMember(owner = "UHNEGZAI", name = "z", descriptor = "[I")
    private static int[] field1490 = new int[5];

    @OriginalMember(owner = "UHNEGZAI", name = "A", descriptor = "[I")
    private static int[] field1491 = new int[5];

    @OriginalMember(owner = "UHNEGZAI", name = "n", descriptor = "I")
    private int field1478;

    @OriginalMember(owner = "UHNEGZAI", name = "s", descriptor = "I")
    public int field1483;

    @OriginalMember(owner = "UHNEGZAI", name = "c", descriptor = "LGJKLDIZT;")
    private class15 field1467;

    @OriginalMember(owner = "UHNEGZAI", name = "d", descriptor = "LGJKLDIZT;")
    private class15 field1468;

    @OriginalMember(owner = "UHNEGZAI", name = "e", descriptor = "LGJKLDIZT;")
    private class15 field1469;

    @OriginalMember(owner = "UHNEGZAI", name = "f", descriptor = "LGJKLDIZT;")
    private class15 field1470;

    @OriginalMember(owner = "UHNEGZAI", name = "g", descriptor = "LGJKLDIZT;")
    private class15 field1471;

    @OriginalMember(owner = "UHNEGZAI", name = "h", descriptor = "LGJKLDIZT;")
    private class15 field1472;

    @OriginalMember(owner = "UHNEGZAI", name = "i", descriptor = "LGJKLDIZT;")
    private class15 field1473;

    @OriginalMember(owner = "UHNEGZAI", name = "j", descriptor = "LGJKLDIZT;")
    private class15 field1474;

    @OriginalMember(owner = "UHNEGZAI", name = "q", descriptor = "LGJKLDIZT;")
    private class15 field1481;

    @OriginalMember(owner = "UHNEGZAI", name = "p", descriptor = "LGLZZOSSI;")
    private class16 field1480;

    @OriginalMember(owner = "UHNEGZAI", name = "t", descriptor = "[I")
    private static int[] field1484;

    @OriginalMember(owner = "UHNEGZAI", name = "u", descriptor = "[I")
    private static int[] field1485;

    @OriginalMember(owner = "UHNEGZAI", name = "v", descriptor = "[I")
    private static int[] field1486;

    @OriginalMember(owner = "UHNEGZAI", name = "a", descriptor = "()V")
    public static final void method458() {
        field1485 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1485[var0] = 1;
            } else {
                field1485[var0] = -1;
            }
        }
        field1486 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1486[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1484 = new int[220500];
    }

    @OriginalMember(owner = "UHNEGZAI", name = "a", descriptor = "(II)[I")
    public final int[] method459(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1484[var3] = 0;
        }
        if (arg1 < 10) {
            return field1484;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1467.method249((byte) 4);
        this.field1468.method249((byte) 4);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1469 != null) {
            this.field1469.method249((byte) 4);
            this.field1470.method249((byte) 4);
            var6 = (int) ((double) (this.field1469.field689 - this.field1469.field688) * 32.768D / var4);
            var7 = (int) ((double) this.field1469.field688 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1471 != null) {
            this.field1471.method249((byte) 4);
            this.field1472.method249((byte) 4);
            var9 = (int) ((double) (this.field1471.field689 - this.field1471.field688) * 32.768D / var4);
            var10 = (int) ((double) this.field1471.field688 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1475[var12] != 0) {
                field1487[var12] = 0;
                field1488[var12] = (int) ((double) this.field1477[var12] * var4);
                field1489[var12] = (this.field1475[var12] << 14) / 100;
                field1490[var12] = (int) ((double) (this.field1467.field689 - this.field1467.field688) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1476[var12]) / var4);
                field1491[var12] = (int) ((double) this.field1467.field688 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1467.method250(arg0, (byte) 8);
            int var42 = this.field1468.method250(arg0, (byte) 8);
            if (this.field1469 != null) {
                int var43 = this.field1469.method250(arg0, (byte) 8);
                int var44 = this.field1470.method250(arg0, (byte) 8);
                var41 += this.method460((byte) -47, var44, this.field1469.field690, var8) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1471 != null) {
                int var45 = this.field1471.method250(arg0, (byte) 8);
                int var46 = this.field1472.method250(arg0, (byte) 8);
                var42 = var42 * ((this.method460((byte) -47, var46, this.field1471.field690, var11) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1475[var47] != 0) {
                    int var48 = field1488[var47] + var13;
                    if (var48 < arg0) {
                        field1484[var48] += this.method460((byte) -47, field1489[var47] * var42 >> 15, this.field1467.field690, field1487[var47]);
                        field1487[var47] += (field1490[var47] * var41 >> 16) + field1491[var47];
                    }
                }
            }
        }
        if (this.field1473 != null) {
            this.field1473.method249((byte) 4);
            this.field1474.method249((byte) 4);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1473.method250(arg0, (byte) 8);
                int var19 = this.field1474.method250(arg0, (byte) 8);
                int var20;
                if (var16) {
                    var20 = ((this.field1473.field689 - this.field1473.field688) * var18 >> 8) + this.field1473.field688;
                } else {
                    var20 = ((this.field1473.field689 - this.field1473.field688) * var19 >> 8) + this.field1473.field688;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1484[var17] = 0;
                }
            }
        }
        if (this.field1478 > 0 && this.field1479 > 0) {
            int var21 = (int) ((double) this.field1478 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1484[var22] += field1484[var22 - var21] * this.field1479 / 100;
            }
        }
        if (this.field1480.field697[0] > 0 || this.field1480.field697[1] > 0) {
            this.field1481.method249((byte) 4);
            int var23 = this.field1481.method250(arg0 + 1, (byte) 8);
            int var24 = this.field1480.method254(0, 0, (float) var23 / 65536.0F);
            int var25 = this.field1480.method254(1, 0, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1484[var24 + var26] * (long) class16.field704 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1484[var24 + var26 - var38 - 1] * (long) class16.field702[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1484[var26 - var39 - 1] * (long) class16.field702[1][var39] >> 16);
                    }
                    field1484[var26] = var37;
                    var23 = this.field1481.method250(arg0 + 1, (byte) 8);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1484[var24 + var26] * (long) class16.field704 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1484[var24 + var26 - var35 - 1] * (long) class16.field702[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1484[var26 - var36 - 1] * (long) class16.field702[1][var36] >> 16);
                        }
                        field1484[var26] = var34;
                        var23 = this.field1481.method250(arg0 + 1, (byte) 8);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1484[var24 + var26 - var31 - 1] * (long) class16.field702[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1484[var26 - var32 - 1] * (long) class16.field702[1][var32] >> 16);
                            }
                            field1484[var26] = var30;
                            this.field1481.method250(arg0 + 1, (byte) 8);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1480.method254(0, 0, (float) var23 / 65536.0F);
                    var25 = this.field1480.method254(1, 0, (float) var23 / 65536.0F);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1484[var40] < -32768) {
                field1484[var40] = -32768;
            }
            if (field1484[var40] > 32767) {
                field1484[var40] = 32767;
            }
        }
        return field1484;
    }

    @OriginalMember(owner = "UHNEGZAI", name = "a", descriptor = "(BIII)I")
    private final int method460(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -47) {
            this.field1466 = 11;
        }
        if (arg2 == 1) {
            return (arg3 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1486[arg3 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg3 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1485[arg3 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "UHNEGZAI", name = "a", descriptor = "(LDNRIFKTO;I)V")
    public final void method461(class11 arg0, int arg1) {
        while (arg1 >= 0) {
            this.field1465 = -456;
        }
        this.field1467 = new class15();
        this.field1467.method247(arg0, -25);
        this.field1468 = new class15();
        this.field1468.method247(arg0, -25);
        int var3 = arg0.method189();
        if (var3 != 0) {
            arg0.field643--;
            this.field1469 = new class15();
            this.field1469.method247(arg0, -25);
            this.field1470 = new class15();
            this.field1470.method247(arg0, -25);
        }
        int var4 = arg0.method189();
        if (var4 != 0) {
            arg0.field643--;
            this.field1471 = new class15();
            this.field1471.method247(arg0, -25);
            this.field1472 = new class15();
            this.field1472.method247(arg0, -25);
        }
        int var5 = arg0.method189();
        if (var5 != 0) {
            arg0.field643--;
            this.field1473 = new class15();
            this.field1473.method247(arg0, -25);
            this.field1474 = new class15();
            this.field1474.method247(arg0, -25);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method203();
            if (var7 == 0) {
                break;
            }
            this.field1475[var6] = var7;
            this.field1476[var6] = arg0.method202();
            this.field1477[var6] = arg0.method203();
        }
        this.field1478 = arg0.method203();
        this.field1479 = arg0.method203();
        this.field1482 = arg0.method191();
        this.field1483 = arg0.method191();
        this.field1480 = new class16();
        this.field1481 = new class15();
        this.field1480.method255(arg0, this.field1481, (byte) 1);
    }

    @OriginalMember(owner = "UHNEGZAI", name = "<init>", descriptor = "()V")
    public class58() {
        if (class2.field14) {
        }
    }
}
