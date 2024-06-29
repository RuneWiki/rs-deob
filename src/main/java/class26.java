import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class26 extends class141 {

    @OriginalMember(owner = "client!mf", name = "Tb", descriptor = "I")
    public static int field520 = -1;

    @OriginalMember(owner = "client!mf", name = "Ob", descriptor = "Lha;")
    public static class46 field515 = class271.method1828("Lade Konfiguration )2 ", -46);

    @OriginalMember(owner = "client!mf", name = "Qb", descriptor = "Lha;")
    private static class46 field517 = class271.method1828("Hidden", -46);

    @OriginalMember(owner = "client!mf", name = "Rb", descriptor = "Z")
    public static boolean field518 = false;

    @OriginalMember(owner = "client!mf", name = "Vb", descriptor = "Lha;")
    public static class46 field522 = field517;

    @OriginalMember(owner = "client!mf", name = "Ub", descriptor = "I")
    public static int field521 = -1;

    @OriginalMember(owner = "client!mf", name = "Lb", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!mf", name = "Mb", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!mf", name = "Nb", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!mf", name = "Sb", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!mf", name = "Wb", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!mf", name = "Xb", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!mf", name = "Yb", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!mf", name = "Zb", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!mf", name = "ac", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!mf", name = "Pb", descriptor = "Lpi;")
    public static class181 field516;

    @OriginalMember(owner = "client!mf", name = "Kb", descriptor = "Ldj;")
    public class78 field511;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "()I")
    public final int method183() {
        ++field527;
        return super.field2525;
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)Z")
    public static final boolean method184(int arg0) {
        int var1 = 61 % ((6 - arg0) / 56);
        ++field514;
        return ~class76.field1427 != -1 ? true : class23.field340.method829(false);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field512;
        if (this.field511 != null) {
            class170 var11 = super.field2575 != -1 && ~super.field2533 == -1 ? class119.method951(0, super.field2575) : null;
            class170 var12 = super.field2537 == -1 || super.field2553 == super.field2537 && var11 != null ? null : class119.method951(0, super.field2537);
            class36 var13 = this.field511.method616(var12, var11, super.field2584, 0, super.field2579);
            if (var13 != null) {
                super.field2525 = var13.method183();
                class78 var14 = this.field511;
                if (var14.field1448 != null) {
                    var14 = var14.method620(-17713);
                }
                if (class250.field4416 && var14.field1483) {
                    class36 var15 = class198.method1413((byte) 91, this.field511.field1440, var13, this.field511.field1490, super.field2585, var12 != null ? var12 : var11, this.field511.field1491, super.field2572, super.field2546, super.field2520, arg0, this.field511.field1450, this.field511.field1474, var12 != null ? super.field2584 : super.field2579);
                    var15.method185(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                if (this.field511.field1453 != 0 || ~this.field511.field1476 != -1) {
                    int var19 = class62.field1049[arg0];
                    short var20 = this.field511.field1453;
                    int var21 = class62.field1042[arg0];
                    short var22 = this.field511.field1476;
                    int var23 = -var22 / 2;
                    int var24 = -var20 / 2;
                    int var25 = var19 * var23 + -(var21 * var24) >> 16;
                    int var26 = var19 * var24 + var21 * var23 >> 16;
                    int var27 = class206.method1461(super.field2546 + var25, class135.field2450, super.field2585 + var26, 4);
                    int var28 = var20 / 2;
                    int var29 = -var22 / 2;
                    int var30 = var19 * var28 + var21 * var29 >> 16;
                    int var31 = var19 * var29 + -(var21 * var28) >> 16;
                    int var32 = class206.method1461(super.field2546 + var31, class135.field2450, super.field2585 + var30, 4);
                    int var33 = var22 / 2;
                    int var34 = -var20 / 2;
                    int var35 = var19 * var34 + var21 * var33 >> 16;
                    int var36 = var19 * var33 + -(var21 * var34) >> 16;
                    int var37 = class206.method1461(super.field2546 + var36, class135.field2450, super.field2585 + var35, 4);
                    int var38 = var20 / 2;
                    int var39 = var22 / 2;
                    int var40 = var19 * var38 + var21 * var39 >> 16;
                    int var41 = var27 >= var32 ? var32 : var27;
                    int var42 = var19 * var39 + -(var21 * var38) >> 16;
                    int var43 = class206.method1461(super.field2546 + var42, class135.field2450, super.field2585 + var40, 4);
                    int var44 = var43 > var32 ? var32 : var43;
                    int var45 = ~var37 < ~var27 ? var27 : var37;
                    int var46 = var27 - -var43;
                    if (var32 + var37 < var46) {
                        var46 = var32 + var37;
                    }
                    int var47 = ~var43 < ~var37 ? var37 : var43;
                    if (var22 != 0) {
                        var16 = (int) (325.95D * Math.atan2((double) (-var47 + var41), (double) var22)) & 2047;
                        if (var16 != 0) {
                            var13.method242(var16);
                        }
                    }
                    if (var20 != 0) {
                        var17 = 2047 & (int) (Math.atan2((double) (-var44 + var45), (double) var20) * 325.95D);
                        if (~var17 != -1) {
                            var13.method229(var17);
                        }
                    }
                    var18 = (var46 >> 1) + -super.field2572;
                    if (~var18 != -1) {
                        var13.method241(0, var18, 0);
                    }
                }
                class36 var48 = null;
                if (super.field2543 != -1 && super.field2544 != -1) {
                    class272 var49 = class138.method1054(-22225, super.field2543);
                    var48 = var49.method1831((byte) 121, super.field2544);
                    if (var48 != null) {
                        var48.method241(0, -super.field2581, 0);
                        if (var49.field4759) {
                            if (var16 != 0) {
                                var48.method242(var16);
                            }
                            if (var17 != 0) {
                                var48.method229(var17);
                            }
                            if (~var18 != -1) {
                                var48.method241(0, var18, 0);
                            }
                        }
                    }
                }
                if (var48 != null) {
                    var13 = ((class192) var13).method1385(var48);
                }
                if (~this.field511.field1440 == -2) {
                    var13.field646 = true;
                }
                var13.method185(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIII)V")
    public static final void method186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field519;
        if (~class135.field2445 >= ~arg1 && ~arg0 >= ~class73.field1309 && arg2 >= class4.field70 && arg4 <= class70.field1205) {
            class220.method1526(arg2, -48, arg0, arg1, arg5, arg4);
        } else {
            class38.method257(arg5, arg1, arg0, -1, arg2, arg4);
        }
        if (arg3 > -38) {
            field516 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V")
    public static final void method187(int arg0, int arg1) {
        if (arg0 != 30945) {
            field517 = null;
        }
        ++field526;
        class207.field3713.method81((byte) 30, arg1);
        class240.field4266.method81((byte) 30, arg1);
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(B)V")
    public static final void method188(byte arg0) {
        ++field524;
        if (arg0 != -100) {
            method189(true);
        }
        class237.field4188.method83(25216);
        class28.field560.method83(25216);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
    public static void method189(boolean arg0) {
        field515 = null;
        if (arg0) {
            method188((byte) 87);
        }
        field522 = null;
        field516 = null;
        field517 = null;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)Z")
    public final boolean method190(int arg0) {
        ++field525;
        if (arg0 != 0) {
            method187(62, 111);
        }
        return this.field511 != null;
    }
}
