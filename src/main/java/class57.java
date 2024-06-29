import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TDNGNEZO")
public class class57 {

    @OriginalMember(owner = "client!TDNGNEZO", name = "i", descriptor = "[I")
    private int[] field1576 = new int[5];

    @OriginalMember(owner = "client!TDNGNEZO", name = "j", descriptor = "[I")
    private int[] field1577 = new int[5];

    @OriginalMember(owner = "client!TDNGNEZO", name = "k", descriptor = "[I")
    private int[] field1578 = new int[5];

    @OriginalMember(owner = "client!TDNGNEZO", name = "m", descriptor = "I")
    private int field1580 = 100;

    @OriginalMember(owner = "client!TDNGNEZO", name = "p", descriptor = "I")
    public int field1583 = 500;

    @OriginalMember(owner = "client!TDNGNEZO", name = "u", descriptor = "[I")
    private static int[] field1588 = new int[5];

    @OriginalMember(owner = "client!TDNGNEZO", name = "v", descriptor = "[I")
    private static int[] field1589 = new int[5];

    @OriginalMember(owner = "client!TDNGNEZO", name = "w", descriptor = "[I")
    private static int[] field1590 = new int[5];

    @OriginalMember(owner = "client!TDNGNEZO", name = "x", descriptor = "[I")
    private static int[] field1591 = new int[5];

    @OriginalMember(owner = "client!TDNGNEZO", name = "y", descriptor = "[I")
    private static int[] field1592 = new int[5];

    @OriginalMember(owner = "client!TDNGNEZO", name = "l", descriptor = "I")
    private int field1579;

    @OriginalMember(owner = "client!TDNGNEZO", name = "q", descriptor = "I")
    public int field1584;

    @OriginalMember(owner = "client!TDNGNEZO", name = "a", descriptor = "LTPZZASFL;")
    private class60 field1568;

    @OriginalMember(owner = "client!TDNGNEZO", name = "b", descriptor = "LTPZZASFL;")
    private class60 field1569;

    @OriginalMember(owner = "client!TDNGNEZO", name = "c", descriptor = "LTPZZASFL;")
    private class60 field1570;

    @OriginalMember(owner = "client!TDNGNEZO", name = "d", descriptor = "LTPZZASFL;")
    private class60 field1571;

    @OriginalMember(owner = "client!TDNGNEZO", name = "e", descriptor = "LTPZZASFL;")
    private class60 field1572;

    @OriginalMember(owner = "client!TDNGNEZO", name = "f", descriptor = "LTPZZASFL;")
    private class60 field1573;

    @OriginalMember(owner = "client!TDNGNEZO", name = "g", descriptor = "LTPZZASFL;")
    private class60 field1574;

    @OriginalMember(owner = "client!TDNGNEZO", name = "h", descriptor = "LTPZZASFL;")
    private class60 field1575;

    @OriginalMember(owner = "client!TDNGNEZO", name = "o", descriptor = "LTPZZASFL;")
    private class60 field1582;

    @OriginalMember(owner = "client!TDNGNEZO", name = "n", descriptor = "LBVWZSTJJ;")
    private class7 field1581;

    @OriginalMember(owner = "client!TDNGNEZO", name = "r", descriptor = "[I")
    private static int[] field1585;

    @OriginalMember(owner = "client!TDNGNEZO", name = "s", descriptor = "[I")
    private static int[] field1586;

    @OriginalMember(owner = "client!TDNGNEZO", name = "t", descriptor = "[I")
    private static int[] field1587;

    @OriginalMember(owner = "client!TDNGNEZO", name = "a", descriptor = "()V")
    public static final void method543() {
        field1586 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1586[var0] = 1;
            } else {
                field1586[var0] = -1;
            }
        }
        field1587 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1587[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1585 = new int[220500];
    }

    @OriginalMember(owner = "client!TDNGNEZO", name = "a", descriptor = "(II)[I")
    public final int[] method544(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1585[var3] = 0;
        }
        if (arg1 < 10) {
            return field1585;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1568.method572((byte) 2);
        this.field1569.method572((byte) 2);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1570 != null) {
            this.field1570.method572((byte) 2);
            this.field1571.method572((byte) 2);
            var6 = (int) ((double) (this.field1570.field1630 - this.field1570.field1629) * 32.768D / var4);
            var7 = (int) ((double) this.field1570.field1629 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1572 != null) {
            this.field1572.method572((byte) 2);
            this.field1573.method572((byte) 2);
            var9 = (int) ((double) (this.field1572.field1630 - this.field1572.field1629) * 32.768D / var4);
            var10 = (int) ((double) this.field1572.field1629 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1576[var12] != 0) {
                field1588[var12] = 0;
                field1589[var12] = (int) ((double) this.field1578[var12] * var4);
                field1590[var12] = (this.field1576[var12] << 14) / 100;
                field1591[var12] = (int) ((double) (this.field1568.field1630 - this.field1568.field1629) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1577[var12]) / var4);
                field1592[var12] = (int) ((double) this.field1568.field1629 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1568.method573(arg0, (byte) 6);
            int var42 = this.field1569.method573(arg0, (byte) 6);
            if (this.field1570 != null) {
                int var43 = this.field1570.method573(arg0, (byte) 6);
                int var44 = this.field1571.method573(arg0, (byte) 6);
                var41 += this.method545(var44, true, this.field1570.field1631, var8) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1572 != null) {
                int var45 = this.field1572.method573(arg0, (byte) 6);
                int var46 = this.field1573.method573(arg0, (byte) 6);
                var42 = var42 * ((this.method545(var46, true, this.field1572.field1631, var11) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1576[var47] != 0) {
                    int var48 = field1589[var47] + var13;
                    if (var48 < arg0) {
                        field1585[var48] += this.method545(field1590[var47] * var42 >> 15, true, this.field1568.field1631, field1588[var47]);
                        field1588[var47] += (field1591[var47] * var41 >> 16) + field1592[var47];
                    }
                }
            }
        }
        if (this.field1574 != null) {
            this.field1574.method572((byte) 2);
            this.field1575.method572((byte) 2);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1574.method573(arg0, (byte) 6);
                int var19 = this.field1575.method573(arg0, (byte) 6);
                int var20;
                if (var16) {
                    var20 = ((this.field1574.field1630 - this.field1574.field1629) * var18 >> 8) + this.field1574.field1629;
                } else {
                    var20 = ((this.field1574.field1630 - this.field1574.field1629) * var19 >> 8) + this.field1574.field1629;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1585[var17] = 0;
                }
            }
        }
        if (this.field1579 > 0 && this.field1580 > 0) {
            int var21 = (int) ((double) this.field1579 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1585[var22] += field1585[var22 - var21] * this.field1580 / 100;
            }
        }
        if (this.field1581.field119[0] > 0 || this.field1581.field119[1] > 0) {
            this.field1582.method572((byte) 2);
            int var23 = this.field1582.method573(arg0 + 1, (byte) 6);
            int var24 = this.field1581.method46((byte) 7, (float) var23 / 65536.0F, 0);
            int var25 = this.field1581.method46((byte) 7, (float) var23 / 65536.0F, 1);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1585[var24 + var26] * (long) class7.field126 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1585[var24 + var26 - var38 - 1] * (long) class7.field124[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1585[var26 - var39 - 1] * (long) class7.field124[1][var39] >> 16);
                    }
                    field1585[var26] = var37;
                    var23 = this.field1582.method573(arg0 + 1, (byte) 6);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1585[var24 + var26] * (long) class7.field126 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1585[var24 + var26 - var35 - 1] * (long) class7.field124[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1585[var26 - var36 - 1] * (long) class7.field124[1][var36] >> 16);
                        }
                        field1585[var26] = var34;
                        var23 = this.field1582.method573(arg0 + 1, (byte) 6);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1585[var24 + var26 - var31 - 1] * (long) class7.field124[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1585[var26 - var32 - 1] * (long) class7.field124[1][var32] >> 16);
                            }
                            field1585[var26] = var30;
                            this.field1582.method573(arg0 + 1, (byte) 6);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1581.method46((byte) 7, (float) var23 / 65536.0F, 0);
                    var25 = this.field1581.method46((byte) 7, (float) var23 / 65536.0F, 1);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1585[var40] < -32768) {
                field1585[var40] = -32768;
            }
            if (field1585[var40] > 32767) {
                field1585[var40] = 32767;
            }
        }
        return field1585;
    }

    @OriginalMember(owner = "client!TDNGNEZO", name = "a", descriptor = "(IZII)I")
    private final int method545(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg2 == 1) {
            return (arg3 & 0x7FFF) < 16384 ? arg0 : -arg0;
        } else if (arg2 == 2) {
            return field1587[arg3 & 0x7FFF] * arg0 >> 14;
        } else if (arg2 == 3) {
            return ((arg3 & 0x7FFF) * arg0 >> 14) - arg0;
        } else if (arg2 == 4) {
            return field1586[arg3 / 2607 & 0x7FFF] * arg0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!TDNGNEZO", name = "a", descriptor = "(ILMVHXDWGI;)V")
    public final void method546(int arg0, class38 arg1) {
        this.field1568 = new class60();
        this.field1568.method570(403, arg1);
        this.field1569 = new class60();
        this.field1569.method570(403, arg1);
        int var3 = arg1.method357();
        if (var3 != 0) {
            arg1.field1161--;
            this.field1570 = new class60();
            this.field1570.method570(403, arg1);
            this.field1571 = new class60();
            this.field1571.method570(403, arg1);
        }
        int var4 = arg1.method357();
        if (var4 != 0) {
            arg1.field1161--;
            this.field1572 = new class60();
            this.field1572.method570(403, arg1);
            this.field1573 = new class60();
            this.field1573.method570(403, arg1);
        }
        int var5 = arg1.method357();
        if (var5 != 0) {
            arg1.field1161--;
            this.field1574 = new class60();
            this.field1574.method570(403, arg1);
            this.field1575 = new class60();
            this.field1575.method570(403, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method371();
            if (var7 == 0) {
                break;
            }
            this.field1576[var6] = var7;
            this.field1577[var6] = arg1.method370();
            this.field1578[var6] = arg1.method371();
        }
        this.field1579 = arg1.method371();
        this.field1580 = arg1.method371();
        this.field1583 = arg1.method359();
        this.field1584 = arg1.method359();
        this.field1581 = new class7();
        if (arg0 <= 0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        this.field1582 = new class60();
        this.field1581.method47(this.field1582, arg1, (byte) 1);
    }
}
