import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class68 {

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public int field1461 = 0;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    private int field1466 = 0;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    private int field1477 = 100;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "[I")
    private int[] field1479 = new int[5];

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public int field1481 = 500;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "[I")
    private int[] field1471 = new int[5];

    @OriginalMember(owner = "client!k", name = "d", descriptor = "[I")
    private int[] field1464 = new int[5];

    @OriginalMember(owner = "client!k", name = "g", descriptor = "[I")
    private static int[] field1467 = new int[32768];

    @OriginalMember(owner = "client!k", name = "i", descriptor = "[I")
    private static int[] field1469;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "[I")
    private static int[] field1462;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "[I")
    private static int[] field1483;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "[I")
    private static int[] field1480;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "[I")
    private static int[] field1485;

    @OriginalMember(owner = "client!k", name = "x", descriptor = "[I")
    private static int[] field1484;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "[I")
    private static int[] field1482;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Lga;")
    private class44 field1463;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Lga;")
    private class44 field1465;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "Lga;")
    private class44 field1468;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Lga;")
    private class44 field1470;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "Lga;")
    private class44 field1472;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "Lga;")
    private class44 field1473;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "Lga;")
    private class44 field1475;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "Lga;")
    private class44 field1476;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "Lga;")
    private class44 field1478;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "Lae;")
    private class6 field1474;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lid;)V")
    public final void method542(class60 arg0) {
        this.field1470 = new class44();
        this.field1470.method311(arg0);
        this.field1468 = new class44();
        this.field1468.method311(arg0);
        int var2 = arg0.method462((byte) 116);
        if (var2 != 0) {
            arg0.field1227--;
            this.field1463 = new class44();
            this.field1463.method311(arg0);
            this.field1476 = new class44();
            this.field1476.method311(arg0);
        }
        int var3 = arg0.method462((byte) 116);
        if (var3 != 0) {
            arg0.field1227--;
            this.field1465 = new class44();
            this.field1465.method311(arg0);
            this.field1473 = new class44();
            this.field1473.method311(arg0);
        }
        int var4 = arg0.method462((byte) 116);
        if (var4 != 0) {
            arg0.field1227--;
            this.field1478 = new class44();
            this.field1478.method311(arg0);
            this.field1472 = new class44();
            this.field1472.method311(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method469((byte) -106);
            if (var6 == 0) {
                break;
            }
            this.field1471[var5] = var6;
            this.field1479[var5] = arg0.method459(false);
            this.field1464[var5] = arg0.method469((byte) -126);
        }
        this.field1466 = arg0.method469((byte) -101);
        this.field1477 = arg0.method469((byte) -84);
        this.field1481 = arg0.method467(255);
        this.field1461 = arg0.method467(255);
        this.field1474 = new class6();
        this.field1475 = new class44();
        this.field1474.method55(arg0, this.field1475);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "()V")
    public static void method543() {
        field1462 = null;
        field1467 = null;
        field1469 = null;
        field1482 = null;
        field1485 = null;
        field1480 = null;
        field1483 = null;
        field1484 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)[I")
    public final int[] method544(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1462[var3] = 0;
        }
        if (arg1 < 10) {
            return field1462;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1470.method314();
        this.field1468.method314();
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1463 != null) {
            this.field1463.method314();
            this.field1476.method314();
            var6 = (int) ((double) (this.field1463.field901 - this.field1463.field902) * 32.768D / var4);
            var7 = (int) ((double) this.field1463.field902 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1465 != null) {
            this.field1465.method314();
            this.field1473.method314();
            var9 = (int) ((double) (this.field1465.field901 - this.field1465.field902) * 32.768D / var4);
            var10 = (int) ((double) this.field1465.field902 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1471[var12] != 0) {
                field1482[var12] = 0;
                field1485[var12] = (int) ((double) this.field1464[var12] * var4);
                field1480[var12] = (this.field1471[var12] << 14) / 100;
                field1483[var12] = (int) ((double) (this.field1470.field901 - this.field1470.field902) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1479[var12]) / var4);
                field1484[var12] = (int) ((double) this.field1470.field902 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var40 = this.field1470.method313(arg0);
            int var41 = this.field1468.method313(arg0);
            if (this.field1463 != null) {
                int var42 = this.field1463.method313(arg0);
                int var43 = this.field1476.method313(arg0);
                var40 += this.method545(var8, var43, this.field1463.field905) >> 1;
                var8 += (var6 * var42 >> 16) + var7;
            }
            if (this.field1465 != null) {
                int var44 = this.field1465.method313(arg0);
                int var45 = this.field1473.method313(arg0);
                var41 = var41 * ((this.method545(var11, var45, this.field1465.field905) >> 1) + 32768) >> 15;
                var11 += (var9 * var44 >> 16) + var10;
            }
            for (int var46 = 0; var46 < 5; var46++) {
                if (this.field1471[var46] != 0) {
                    int var47 = field1485[var46] + var13;
                    if (var47 < arg0) {
                        field1462[var47] += this.method545(field1482[var46], field1480[var46] * var41 >> 15, this.field1470.field905);
                        field1482[var46] += (field1483[var46] * var40 >> 16) + field1484[var46];
                    }
                }
            }
        }
        if (this.field1478 != null) {
            this.field1478.method314();
            this.field1472.method314();
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1478.method313(arg0);
                int var19 = this.field1472.method313(arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field1478.field901 - this.field1478.field902) * var18 >> 8) + this.field1478.field902;
                } else {
                    var20 = ((this.field1478.field901 - this.field1478.field902) * var19 >> 8) + this.field1478.field902;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1462[var17] = 0;
                }
            }
        }
        if (this.field1466 > 0 && this.field1477 > 0) {
            int var21 = (int) ((double) this.field1466 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1462[var22] += field1462[var22 - var21] * this.field1477 / 100;
            }
        }
        if (this.field1474.field81[0] > 0 || this.field1474.field81[1] > 0) {
            this.field1475.method314();
            int var23 = this.field1475.method313(arg0 + 1);
            int var24 = this.field1474.method57(0, (float) var23 / 65536.0F);
            int var25 = this.field1474.method57(1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var36 = (int) ((long) field1462[var24 + var26] * (long) class6.field87 >> 16);
                    for (int var37 = 0; var37 < var24; var37++) {
                        var36 += (int) ((long) field1462[var24 + var26 - var37 - 1] * (long) class6.field82[0][var37] >> 16);
                    }
                    for (int var38 = 0; var38 < var26; var38++) {
                        var36 -= (int) ((long) field1462[var26 - var38 - 1] * (long) class6.field82[1][var38] >> 16);
                    }
                    field1462[var26] = var36;
                    var23 = this.field1475.method313(arg0 + 1);
                    var26++;
                }
                int var28 = 128;
                while (true) {
                    if (var28 > arg0 - var24) {
                        var28 = arg0 - var24;
                    }
                    while (var26 < var28) {
                        int var33 = (int) ((long) field1462[var24 + var26] * (long) class6.field87 >> 16);
                        for (int var34 = 0; var34 < var24; var34++) {
                            var33 += (int) ((long) field1462[var24 + var26 - var34 - 1] * (long) class6.field82[0][var34] >> 16);
                        }
                        for (int var35 = 0; var35 < var25; var35++) {
                            var33 -= (int) ((long) field1462[var26 - var35 - 1] * (long) class6.field82[1][var35] >> 16);
                        }
                        field1462[var26] = var33;
                        var23 = this.field1475.method313(arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var29 = 0;
                            for (int var30 = var24 + var26 - arg0; var30 < var24; var30++) {
                                var29 += (int) ((long) field1462[var24 + var26 - var30 - 1] * (long) class6.field82[0][var30] >> 16);
                            }
                            for (int var31 = 0; var31 < var25; var31++) {
                                var29 -= (int) ((long) field1462[var26 - var31 - 1] * (long) class6.field82[1][var31] >> 16);
                            }
                            field1462[var26] = var29;
                            this.field1475.method313(arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1474.method57(0, (float) var23 / 65536.0F);
                    var25 = this.field1474.method57(1, (float) var23 / 65536.0F);
                    var28 += 128;
                }
            }
        }
        for (int var39 = 0; var39 < arg0; var39++) {
            if (field1462[var39] < -32768) {
                field1462[var39] = -32768;
            }
            if (field1462[var39] > 32767) {
                field1462[var39] = 32767;
            }
        }
        return field1462;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III)I")
    private final int method545(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1469[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1467[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1467[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1469 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1469[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1462 = new int[220500];
        field1483 = new int[5];
        field1480 = new int[5];
        field1485 = new int[5];
        field1484 = new int[5];
        field1482 = new int[5];
    }
}
