import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!UJYLHBCS")
public class class59 {

    @OriginalMember(owner = "client!UJYLHBCS", name = "i", descriptor = "[I")
    private int[] field1470 = new int[5];

    @OriginalMember(owner = "client!UJYLHBCS", name = "j", descriptor = "[I")
    private int[] field1471 = new int[5];

    @OriginalMember(owner = "client!UJYLHBCS", name = "k", descriptor = "[I")
    private int[] field1472 = new int[5];

    @OriginalMember(owner = "client!UJYLHBCS", name = "m", descriptor = "I")
    private int field1474 = 100;

    @OriginalMember(owner = "client!UJYLHBCS", name = "p", descriptor = "I")
    public int field1477 = 500;

    @OriginalMember(owner = "client!UJYLHBCS", name = "u", descriptor = "[I")
    private static int[] field1482 = new int[5];

    @OriginalMember(owner = "client!UJYLHBCS", name = "v", descriptor = "[I")
    private static int[] field1483 = new int[5];

    @OriginalMember(owner = "client!UJYLHBCS", name = "w", descriptor = "[I")
    private static int[] field1484 = new int[5];

    @OriginalMember(owner = "client!UJYLHBCS", name = "x", descriptor = "[I")
    private static int[] field1485 = new int[5];

    @OriginalMember(owner = "client!UJYLHBCS", name = "y", descriptor = "[I")
    private static int[] field1486 = new int[5];

    @OriginalMember(owner = "client!UJYLHBCS", name = "l", descriptor = "I")
    private int field1473;

    @OriginalMember(owner = "client!UJYLHBCS", name = "q", descriptor = "I")
    public int field1478;

    @OriginalMember(owner = "client!UJYLHBCS", name = "n", descriptor = "LIOYFKQTX;")
    private class29 field1475;

    @OriginalMember(owner = "client!UJYLHBCS", name = "a", descriptor = "LANPSASQF;")
    private class2 field1462;

    @OriginalMember(owner = "client!UJYLHBCS", name = "b", descriptor = "LANPSASQF;")
    private class2 field1463;

    @OriginalMember(owner = "client!UJYLHBCS", name = "c", descriptor = "LANPSASQF;")
    private class2 field1464;

    @OriginalMember(owner = "client!UJYLHBCS", name = "d", descriptor = "LANPSASQF;")
    private class2 field1465;

    @OriginalMember(owner = "client!UJYLHBCS", name = "e", descriptor = "LANPSASQF;")
    private class2 field1466;

    @OriginalMember(owner = "client!UJYLHBCS", name = "f", descriptor = "LANPSASQF;")
    private class2 field1467;

    @OriginalMember(owner = "client!UJYLHBCS", name = "g", descriptor = "LANPSASQF;")
    private class2 field1468;

    @OriginalMember(owner = "client!UJYLHBCS", name = "h", descriptor = "LANPSASQF;")
    private class2 field1469;

    @OriginalMember(owner = "client!UJYLHBCS", name = "o", descriptor = "LANPSASQF;")
    private class2 field1476;

    @OriginalMember(owner = "client!UJYLHBCS", name = "r", descriptor = "[I")
    private static int[] field1479;

    @OriginalMember(owner = "client!UJYLHBCS", name = "s", descriptor = "[I")
    private static int[] field1480;

    @OriginalMember(owner = "client!UJYLHBCS", name = "t", descriptor = "[I")
    private static int[] field1481;

    @OriginalMember(owner = "client!UJYLHBCS", name = "a", descriptor = "()V")
    public static final void method527() {
        field1480 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1480[var0] = 1;
            } else {
                field1480[var0] = -1;
            }
        }
        field1481 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1481[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1479 = new int[220500];
    }

    @OriginalMember(owner = "client!UJYLHBCS", name = "a", descriptor = "(II)[I")
    public final int[] method528(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1479[var3] = 0;
        }
        if (arg1 < 10) {
            return field1479;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1462.method5(3);
        this.field1463.method5(3);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1464 != null) {
            this.field1464.method5(3);
            this.field1465.method5(3);
            var6 = (int) ((double) (this.field1464.field19 - this.field1464.field18) * 32.768D / var4);
            var7 = (int) ((double) this.field1464.field18 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1466 != null) {
            this.field1466.method5(3);
            this.field1467.method5(3);
            var9 = (int) ((double) (this.field1466.field19 - this.field1466.field18) * 32.768D / var4);
            var10 = (int) ((double) this.field1466.field18 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1470[var12] != 0) {
                field1482[var12] = 0;
                field1483[var12] = (int) ((double) this.field1472[var12] * var4);
                field1484[var12] = (this.field1470[var12] << 14) / 100;
                field1485[var12] = (int) ((double) (this.field1462.field19 - this.field1462.field18) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1471[var12]) / var4);
                field1486[var12] = (int) ((double) this.field1462.field18 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1462.method6((byte) 75, arg0);
            int var42 = this.field1463.method6((byte) 75, arg0);
            if (this.field1464 != null) {
                int var43 = this.field1464.method6((byte) 75, arg0);
                int var44 = this.field1465.method6((byte) 75, arg0);
                var41 += this.method529(this.field1464.field20, 856, var44, var8) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1466 != null) {
                int var45 = this.field1466.method6((byte) 75, arg0);
                int var46 = this.field1467.method6((byte) 75, arg0);
                var42 = var42 * ((this.method529(this.field1466.field20, 856, var46, var11) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1470[var47] != 0) {
                    int var48 = field1483[var47] + var13;
                    if (var48 < arg0) {
                        field1479[var48] += this.method529(this.field1462.field20, 856, field1484[var47] * var42 >> 15, field1482[var47]);
                        field1482[var47] += (field1485[var47] * var41 >> 16) + field1486[var47];
                    }
                }
            }
        }
        if (this.field1468 != null) {
            this.field1468.method5(3);
            this.field1469.method5(3);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1468.method6((byte) 75, arg0);
                int var19 = this.field1469.method6((byte) 75, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field1468.field19 - this.field1468.field18) * var18 >> 8) + this.field1468.field18;
                } else {
                    var20 = ((this.field1468.field19 - this.field1468.field18) * var19 >> 8) + this.field1468.field18;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1479[var17] = 0;
                }
            }
        }
        if (this.field1473 > 0 && this.field1474 > 0) {
            int var21 = (int) ((double) this.field1473 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1479[var22] += field1479[var22 - var21] * this.field1474 / 100;
            }
        }
        if (this.field1475.field988[0] > 0 || this.field1475.field988[1] > 0) {
            this.field1476.method5(3);
            int var23 = this.field1476.method6((byte) 75, arg0 + 1);
            int var24 = this.field1475.method364(0, (float) var23 / 65536.0F, 413);
            int var25 = this.field1475.method364(1, (float) var23 / 65536.0F, 413);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1479[var24 + var26] * (long) class29.field995 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1479[var24 + var26 - var38 - 1] * (long) class29.field993[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1479[var26 - var39 - 1] * (long) class29.field993[1][var39] >> 16);
                    }
                    field1479[var26] = var37;
                    var23 = this.field1476.method6((byte) 75, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1479[var24 + var26] * (long) class29.field995 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1479[var24 + var26 - var35 - 1] * (long) class29.field993[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1479[var26 - var36 - 1] * (long) class29.field993[1][var36] >> 16);
                        }
                        field1479[var26] = var34;
                        var23 = this.field1476.method6((byte) 75, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1479[var24 + var26 - var31 - 1] * (long) class29.field993[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1479[var26 - var32 - 1] * (long) class29.field993[1][var32] >> 16);
                            }
                            field1479[var26] = var30;
                            this.field1476.method6((byte) 75, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1475.method364(0, (float) var23 / 65536.0F, 413);
                    var25 = this.field1475.method364(1, (float) var23 / 65536.0F, 413);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1479[var40] < -32768) {
                field1479[var40] = -32768;
            }
            if (field1479[var40] > 32767) {
                field1479[var40] = 32767;
            }
        }
        return field1479;
    }

    @OriginalMember(owner = "client!UJYLHBCS", name = "a", descriptor = "(IIII)I")
    private final int method529(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 59 / arg1;
        if (arg0 == 1) {
            return (arg3 & 0x7FFF) < 16384 ? arg2 : -arg2;
        } else if (arg0 == 2) {
            return field1481[arg3 & 0x7FFF] * arg2 >> 14;
        } else if (arg0 == 3) {
            return ((arg3 & 0x7FFF) * arg2 >> 14) - arg2;
        } else if (arg0 == 4) {
            return field1480[arg3 / 2607 & 0x7FFF] * arg2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!UJYLHBCS", name = "a", descriptor = "(BLEYMNCFMK;)V")
    public final void method530(byte arg0, class18 arg1) {
        this.field1462 = new class2();
        this.field1462.method3((byte) 5, arg1);
        this.field1463 = new class2();
        this.field1463.method3((byte) 5, arg1);
        int var3 = arg1.method239();
        if (var3 != 0) {
            arg1.field794--;
            this.field1464 = new class2();
            this.field1464.method3((byte) 5, arg1);
            this.field1465 = new class2();
            this.field1465.method3((byte) 5, arg1);
        }
        int var4 = arg1.method239();
        if (var4 != 0) {
            arg1.field794--;
            this.field1466 = new class2();
            this.field1466.method3((byte) 5, arg1);
            this.field1467 = new class2();
            this.field1467.method3((byte) 5, arg1);
        }
        int var5 = arg1.method239();
        if (var5 != 0) {
            arg1.field794--;
            this.field1468 = new class2();
            this.field1468.method3((byte) 5, arg1);
            this.field1469 = new class2();
            this.field1469.method3((byte) 5, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method253();
            if (var7 == 0) {
                break;
            }
            this.field1470[var6] = var7;
            this.field1471[var6] = arg1.method252();
            this.field1472[var6] = arg1.method253();
        }
        this.field1473 = arg1.method253();
        this.field1474 = arg1.method253();
        this.field1477 = arg1.method241();
        this.field1478 = arg1.method241();
        this.field1475 = new class29();
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        boolean var8 = false;
        this.field1476 = new class2();
        this.field1475.method365(this.field1476, arg1, 24145);
    }
}
