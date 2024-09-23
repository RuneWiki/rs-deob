import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XPILULJC")
public class class66 {

    @OriginalMember(owner = "XPILULJC", name = "a", descriptor = "I")
    private int field1588 = 4;

    @OriginalMember(owner = "XPILULJC", name = "j", descriptor = "[I")
    private int[] field1597 = new int[5];

    @OriginalMember(owner = "XPILULJC", name = "k", descriptor = "[I")
    private int[] field1598 = new int[5];

    @OriginalMember(owner = "XPILULJC", name = "l", descriptor = "[I")
    private int[] field1599 = new int[5];

    @OriginalMember(owner = "XPILULJC", name = "n", descriptor = "I")
    private int field1601 = 100;

    @OriginalMember(owner = "XPILULJC", name = "q", descriptor = "I")
    public int field1604 = 500;

    @OriginalMember(owner = "XPILULJC", name = "v", descriptor = "[I")
    private static int[] field1609 = new int[5];

    @OriginalMember(owner = "XPILULJC", name = "w", descriptor = "[I")
    private static int[] field1610 = new int[5];

    @OriginalMember(owner = "XPILULJC", name = "x", descriptor = "[I")
    private static int[] field1611 = new int[5];

    @OriginalMember(owner = "XPILULJC", name = "y", descriptor = "[I")
    private static int[] field1612 = new int[5];

    @OriginalMember(owner = "XPILULJC", name = "z", descriptor = "[I")
    private static int[] field1613 = new int[5];

    @OriginalMember(owner = "XPILULJC", name = "m", descriptor = "I")
    private int field1600;

    @OriginalMember(owner = "XPILULJC", name = "r", descriptor = "I")
    public int field1605;

    @OriginalMember(owner = "XPILULJC", name = "o", descriptor = "LDQYHQSPL;")
    private class15 field1602;

    @OriginalMember(owner = "XPILULJC", name = "b", descriptor = "LRSNWTZPO;")
    private class54 field1589;

    @OriginalMember(owner = "XPILULJC", name = "c", descriptor = "LRSNWTZPO;")
    private class54 field1590;

    @OriginalMember(owner = "XPILULJC", name = "d", descriptor = "LRSNWTZPO;")
    private class54 field1591;

    @OriginalMember(owner = "XPILULJC", name = "e", descriptor = "LRSNWTZPO;")
    private class54 field1592;

    @OriginalMember(owner = "XPILULJC", name = "f", descriptor = "LRSNWTZPO;")
    private class54 field1593;

    @OriginalMember(owner = "XPILULJC", name = "g", descriptor = "LRSNWTZPO;")
    private class54 field1594;

    @OriginalMember(owner = "XPILULJC", name = "h", descriptor = "LRSNWTZPO;")
    private class54 field1595;

    @OriginalMember(owner = "XPILULJC", name = "i", descriptor = "LRSNWTZPO;")
    private class54 field1596;

    @OriginalMember(owner = "XPILULJC", name = "p", descriptor = "LRSNWTZPO;")
    private class54 field1603;

    @OriginalMember(owner = "XPILULJC", name = "s", descriptor = "[I")
    private static int[] field1606;

    @OriginalMember(owner = "XPILULJC", name = "t", descriptor = "[I")
    private static int[] field1607;

    @OriginalMember(owner = "XPILULJC", name = "u", descriptor = "[I")
    private static int[] field1608;

    @OriginalMember(owner = "XPILULJC", name = "a", descriptor = "()V")
    public static final void method522() {
        field1607 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1607[var0] = 1;
            } else {
                field1607[var0] = -1;
            }
        }
        field1608 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1608[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1606 = new int[220500];
    }

    @OriginalMember(owner = "XPILULJC", name = "a", descriptor = "(II)[I")
    public final int[] method523(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1606[var3] = 0;
        }
        if (arg1 < 10) {
            return field1606;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1589.method467(35358);
        this.field1590.method467(35358);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1591 != null) {
            this.field1591.method467(35358);
            this.field1592.method467(35358);
            var6 = (int) ((double) (this.field1591.field1397 - this.field1591.field1396) * 32.768D / var4);
            var7 = (int) ((double) this.field1591.field1396 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1593 != null) {
            this.field1593.method467(35358);
            this.field1594.method467(35358);
            var9 = (int) ((double) (this.field1593.field1397 - this.field1593.field1396) * 32.768D / var4);
            var10 = (int) ((double) this.field1593.field1396 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1597[var12] != 0) {
                field1609[var12] = 0;
                field1610[var12] = (int) ((double) this.field1599[var12] * var4);
                field1611[var12] = (this.field1597[var12] << 14) / 100;
                field1612[var12] = (int) ((double) (this.field1589.field1397 - this.field1589.field1396) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1598[var12]) / var4);
                field1613[var12] = (int) ((double) this.field1589.field1396 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1589.method468(arg0, 39226);
            int var42 = this.field1590.method468(arg0, 39226);
            if (this.field1591 != null) {
                int var43 = this.field1591.method468(arg0, 39226);
                int var44 = this.field1592.method468(arg0, 39226);
                var41 += this.method524(var8, this.field1591.field1398, var44, 0) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1593 != null) {
                int var45 = this.field1593.method468(arg0, 39226);
                int var46 = this.field1594.method468(arg0, 39226);
                var42 = var42 * ((this.method524(var11, this.field1593.field1398, var46, 0) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1597[var47] != 0) {
                    int var48 = field1610[var47] + var13;
                    if (var48 < arg0) {
                        field1606[var48] += this.method524(field1609[var47], this.field1589.field1398, field1611[var47] * var42 >> 15, 0);
                        field1609[var47] += (field1612[var47] * var41 >> 16) + field1613[var47];
                    }
                }
            }
        }
        if (this.field1595 != null) {
            this.field1595.method467(35358);
            this.field1596.method467(35358);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1595.method468(arg0, 39226);
                int var19 = this.field1596.method468(arg0, 39226);
                int var20;
                if (var16) {
                    var20 = ((this.field1595.field1397 - this.field1595.field1396) * var18 >> 8) + this.field1595.field1396;
                } else {
                    var20 = ((this.field1595.field1397 - this.field1595.field1396) * var19 >> 8) + this.field1595.field1396;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1606[var17] = 0;
                }
            }
        }
        if (this.field1600 > 0 && this.field1601 > 0) {
            int var21 = (int) ((double) this.field1600 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1606[var22] += field1606[var22 - var21] * this.field1601 / 100;
            }
        }
        if (this.field1602.field765[0] > 0 || this.field1602.field765[1] > 0) {
            this.field1603.method467(35358);
            int var23 = this.field1603.method468(arg0 + 1, 39226);
            int var24 = this.field1602.method245(0, -23379, (float) var23 / 65536.0F);
            int var25 = this.field1602.method245(1, -23379, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1606[var24 + var26] * (long) class15.field772 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1606[var24 + var26 - var38 - 1] * (long) class15.field770[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1606[var26 - var39 - 1] * (long) class15.field770[1][var39] >> 16);
                    }
                    field1606[var26] = var37;
                    var23 = this.field1603.method468(arg0 + 1, 39226);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1606[var24 + var26] * (long) class15.field772 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1606[var24 + var26 - var35 - 1] * (long) class15.field770[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1606[var26 - var36 - 1] * (long) class15.field770[1][var36] >> 16);
                        }
                        field1606[var26] = var34;
                        var23 = this.field1603.method468(arg0 + 1, 39226);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1606[var24 + var26 - var31 - 1] * (long) class15.field770[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1606[var26 - var32 - 1] * (long) class15.field770[1][var32] >> 16);
                            }
                            field1606[var26] = var30;
                            this.field1603.method468(arg0 + 1, 39226);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1602.method245(0, -23379, (float) var23 / 65536.0F);
                    var25 = this.field1602.method245(1, -23379, (float) var23 / 65536.0F);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1606[var40] < -32768) {
                field1606[var40] = -32768;
            }
            if (field1606[var40] > 32767) {
                field1606[var40] = 32767;
            }
        }
        return field1606;
    }

    @OriginalMember(owner = "XPILULJC", name = "a", descriptor = "(IIII)I")
    private final int method524(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            this.field1588 = -153;
        }
        if (arg1 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg2 : -arg2;
        } else if (arg1 == 2) {
            return field1608[arg0 & 0x7FFF] * arg2 >> 14;
        } else if (arg1 == 3) {
            return ((arg0 & 0x7FFF) * arg2 >> 14) - arg2;
        } else if (arg1 == 4) {
            return field1607[arg0 / 2607 & 0x7FFF] * arg2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "XPILULJC", name = "a", descriptor = "(ILINLHDAGO;)V")
    public final void method525(int arg0, class29 arg1) {
        this.field1589 = new class54();
        this.field1589.method465(6, arg1);
        this.field1590 = new class54();
        this.field1590.method465(6, arg1);
        int var3 = arg1.method308();
        if (var3 != 0) {
            arg1.field1107--;
            this.field1591 = new class54();
            this.field1591.method465(6, arg1);
            this.field1592 = new class54();
            this.field1592.method465(6, arg1);
        }
        int var4 = arg1.method308();
        if (var4 != 0) {
            arg1.field1107--;
            this.field1593 = new class54();
            this.field1593.method465(6, arg1);
            this.field1594 = new class54();
            this.field1594.method465(6, arg1);
        }
        int var5 = arg1.method308();
        if (var5 != 0) {
            arg1.field1107--;
            this.field1595 = new class54();
            this.field1595.method465(6, arg1);
            this.field1596 = new class54();
            this.field1596.method465(6, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method322();
            if (var7 == 0) {
                break;
            }
            this.field1597[var6] = var7;
            this.field1598[var6] = arg1.method321();
            this.field1599[var6] = arg1.method322();
        }
        this.field1600 = arg1.method322();
        this.field1601 = arg1.method322();
        this.field1604 = arg1.method310();
        this.field1605 = arg1.method310();
        this.field1602 = new class15();
        this.field1603 = new class54();
        this.field1602.method246(-45827, this.field1603, arg1);
        if (arg0 < 6 || arg0 > 6) {
            throw new NullPointerException();
        }
    }
}
