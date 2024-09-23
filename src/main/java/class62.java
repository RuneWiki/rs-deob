import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VSTUETUV")
public class class62 {

    @OriginalMember(owner = "VSTUETUV", name = "a", descriptor = "I")
    private int field1544 = 16191;

    @OriginalMember(owner = "VSTUETUV", name = "b", descriptor = "Z")
    private boolean field1545 = false;

    @OriginalMember(owner = "VSTUETUV", name = "c", descriptor = "I")
    private int field1546 = -677;

    @OriginalMember(owner = "VSTUETUV", name = "l", descriptor = "[I")
    private int[] field1555 = new int[5];

    @OriginalMember(owner = "VSTUETUV", name = "m", descriptor = "[I")
    private int[] field1556 = new int[5];

    @OriginalMember(owner = "VSTUETUV", name = "n", descriptor = "[I")
    private int[] field1557 = new int[5];

    @OriginalMember(owner = "VSTUETUV", name = "p", descriptor = "I")
    private int field1559 = 100;

    @OriginalMember(owner = "VSTUETUV", name = "s", descriptor = "I")
    public int field1562 = 500;

    @OriginalMember(owner = "VSTUETUV", name = "x", descriptor = "[I")
    private static int[] field1567 = new int[5];

    @OriginalMember(owner = "VSTUETUV", name = "y", descriptor = "[I")
    private static int[] field1568 = new int[5];

    @OriginalMember(owner = "VSTUETUV", name = "z", descriptor = "[I")
    private static int[] field1569 = new int[5];

    @OriginalMember(owner = "VSTUETUV", name = "A", descriptor = "[I")
    private static int[] field1570 = new int[5];

    @OriginalMember(owner = "VSTUETUV", name = "B", descriptor = "[I")
    private static int[] field1571 = new int[5];

    @OriginalMember(owner = "VSTUETUV", name = "o", descriptor = "I")
    private int field1558;

    @OriginalMember(owner = "VSTUETUV", name = "t", descriptor = "I")
    public int field1563;

    @OriginalMember(owner = "VSTUETUV", name = "q", descriptor = "LERCNIFTI;")
    private class16 field1560;

    @OriginalMember(owner = "VSTUETUV", name = "d", descriptor = "LNXAZLFDC;")
    private class41 field1547;

    @OriginalMember(owner = "VSTUETUV", name = "e", descriptor = "LNXAZLFDC;")
    private class41 field1548;

    @OriginalMember(owner = "VSTUETUV", name = "f", descriptor = "LNXAZLFDC;")
    private class41 field1549;

    @OriginalMember(owner = "VSTUETUV", name = "g", descriptor = "LNXAZLFDC;")
    private class41 field1550;

    @OriginalMember(owner = "VSTUETUV", name = "h", descriptor = "LNXAZLFDC;")
    private class41 field1551;

    @OriginalMember(owner = "VSTUETUV", name = "i", descriptor = "LNXAZLFDC;")
    private class41 field1552;

    @OriginalMember(owner = "VSTUETUV", name = "j", descriptor = "LNXAZLFDC;")
    private class41 field1553;

    @OriginalMember(owner = "VSTUETUV", name = "k", descriptor = "LNXAZLFDC;")
    private class41 field1554;

    @OriginalMember(owner = "VSTUETUV", name = "r", descriptor = "LNXAZLFDC;")
    private class41 field1561;

    @OriginalMember(owner = "VSTUETUV", name = "u", descriptor = "[I")
    private static int[] field1564;

    @OriginalMember(owner = "VSTUETUV", name = "v", descriptor = "[I")
    private static int[] field1565;

    @OriginalMember(owner = "VSTUETUV", name = "w", descriptor = "[I")
    private static int[] field1566;

    @OriginalMember(owner = "VSTUETUV", name = "a", descriptor = "()V")
    public static final void method557() {
        field1565 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1565[var0] = 1;
            } else {
                field1565[var0] = -1;
            }
        }
        field1566 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1566[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1564 = new int[220500];
    }

    @OriginalMember(owner = "VSTUETUV", name = "a", descriptor = "(II)[I")
    public final int[] method558(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1564[var3] = 0;
        }
        if (arg1 < 10) {
            return field1564;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1547.method500(0);
        this.field1548.method500(0);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1549 != null) {
            this.field1549.method500(0);
            this.field1550.method500(0);
            var6 = (int) ((double) (this.field1549.field1187 - this.field1549.field1186) * 32.768D / var4);
            var7 = (int) ((double) this.field1549.field1186 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1551 != null) {
            this.field1551.method500(0);
            this.field1552.method500(0);
            var9 = (int) ((double) (this.field1551.field1187 - this.field1551.field1186) * 32.768D / var4);
            var10 = (int) ((double) this.field1551.field1186 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1555[var12] != 0) {
                field1567[var12] = 0;
                field1568[var12] = (int) ((double) this.field1557[var12] * var4);
                field1569[var12] = (this.field1555[var12] << 14) / 100;
                field1570[var12] = (int) ((double) (this.field1547.field1187 - this.field1547.field1186) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1556[var12]) / var4);
                field1571[var12] = (int) ((double) this.field1547.field1186 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1547.method501(arg0, (byte) -106);
            int var42 = this.field1548.method501(arg0, (byte) -106);
            if (this.field1549 != null) {
                int var43 = this.field1549.method501(arg0, (byte) -106);
                int var44 = this.field1550.method501(arg0, (byte) -106);
                var41 += this.method559(this.field1549.field1188, -677, var8, var44) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1551 != null) {
                int var45 = this.field1551.method501(arg0, (byte) -106);
                int var46 = this.field1552.method501(arg0, (byte) -106);
                var42 = var42 * ((this.method559(this.field1551.field1188, -677, var11, var46) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1555[var47] != 0) {
                    int var48 = field1568[var47] + var13;
                    if (var48 < arg0) {
                        field1564[var48] += this.method559(this.field1547.field1188, -677, field1567[var47], field1569[var47] * var42 >> 15);
                        field1567[var47] += (field1570[var47] * var41 >> 16) + field1571[var47];
                    }
                }
            }
        }
        if (this.field1553 != null) {
            this.field1553.method500(0);
            this.field1554.method500(0);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1553.method501(arg0, (byte) -106);
                int var19 = this.field1554.method501(arg0, (byte) -106);
                int var20;
                if (var16) {
                    var20 = ((this.field1553.field1187 - this.field1553.field1186) * var18 >> 8) + this.field1553.field1186;
                } else {
                    var20 = ((this.field1553.field1187 - this.field1553.field1186) * var19 >> 8) + this.field1553.field1186;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1564[var17] = 0;
                }
            }
        }
        if (this.field1558 > 0 && this.field1559 > 0) {
            int var21 = (int) ((double) this.field1558 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1564[var22] += field1564[var22 - var21] * this.field1559 / 100;
            }
        }
        if (this.field1560.field697[0] > 0 || this.field1560.field697[1] > 0) {
            this.field1561.method500(0);
            int var23 = this.field1561.method501(arg0 + 1, (byte) -106);
            int var24 = this.field1560.method238((float) var23 / 65536.0F, 0, -227);
            int var25 = this.field1560.method238((float) var23 / 65536.0F, 1, -227);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1564[var24 + var26] * (long) class16.field704 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1564[var24 + var26 - var38 - 1] * (long) class16.field702[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1564[var26 - var39 - 1] * (long) class16.field702[1][var39] >> 16);
                    }
                    field1564[var26] = var37;
                    var23 = this.field1561.method501(arg0 + 1, (byte) -106);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1564[var24 + var26] * (long) class16.field704 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1564[var24 + var26 - var35 - 1] * (long) class16.field702[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1564[var26 - var36 - 1] * (long) class16.field702[1][var36] >> 16);
                        }
                        field1564[var26] = var34;
                        var23 = this.field1561.method501(arg0 + 1, (byte) -106);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1564[var24 + var26 - var31 - 1] * (long) class16.field702[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1564[var26 - var32 - 1] * (long) class16.field702[1][var32] >> 16);
                            }
                            field1564[var26] = var30;
                            this.field1561.method501(arg0 + 1, (byte) -106);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1560.method238((float) var23 / 65536.0F, 0, -227);
                    var25 = this.field1560.method238((float) var23 / 65536.0F, 1, -227);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1564[var40] < -32768) {
                field1564[var40] = -32768;
            }
            if (field1564[var40] > 32767) {
                field1564[var40] = 32767;
            }
        }
        return field1564;
    }

    @OriginalMember(owner = "VSTUETUV", name = "a", descriptor = "(IIII)I")
    private final int method559(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 0) {
            this.field1546 = 19;
        }
        if (arg0 == 1) {
            return (arg2 & 0x7FFF) < 16384 ? arg3 : -arg3;
        } else if (arg0 == 2) {
            return field1566[arg2 & 0x7FFF] * arg3 >> 14;
        } else if (arg0 == 3) {
            return ((arg2 & 0x7FFF) * arg3 >> 14) - arg3;
        } else if (arg0 == 4) {
            return field1565[arg2 / 2607 & 0x7FFF] * arg3;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "VSTUETUV", name = "a", descriptor = "(LLDILQFVA;I)V")
    public final void method560(class34 arg0, int arg1) {
        this.field1547 = new class41();
        this.field1547.method498(arg0, 16191);
        this.field1548 = new class41();
        this.field1548.method498(arg0, 16191);
        if (this.field1544 != arg1) {
            this.field1546 = -331;
        }
        int var3 = arg0.method402();
        if (var3 != 0) {
            arg0.field1073--;
            this.field1549 = new class41();
            this.field1549.method498(arg0, 16191);
            this.field1550 = new class41();
            this.field1550.method498(arg0, 16191);
        }
        int var4 = arg0.method402();
        if (var4 != 0) {
            arg0.field1073--;
            this.field1551 = new class41();
            this.field1551.method498(arg0, 16191);
            this.field1552 = new class41();
            this.field1552.method498(arg0, 16191);
        }
        int var5 = arg0.method402();
        if (var5 != 0) {
            arg0.field1073--;
            this.field1553 = new class41();
            this.field1553.method498(arg0, 16191);
            this.field1554 = new class41();
            this.field1554.method498(arg0, 16191);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method416();
            if (var7 == 0) {
                break;
            }
            this.field1555[var6] = var7;
            this.field1556[var6] = arg0.method415();
            this.field1557[var6] = arg0.method416();
        }
        this.field1558 = arg0.method416();
        this.field1559 = arg0.method416();
        this.field1562 = arg0.method404();
        this.field1563 = arg0.method404();
        this.field1560 = new class16();
        this.field1561 = new class41();
        this.field1560.method239(this.field1545, arg0, this.field1561);
    }
}
