import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class153 {

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "Le;")
    public static class191 field2629 = class54.method368("http:)4)4", 2047);

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "Leg;")
    public static class33 field2628 = null;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field2631 = 2;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "Lng;")
    public static class121 field2627;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "[Lwa;")
    public static class226[] field2624;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)I")
    public static final int method1035(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1036(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2626++;
        int var8 = 0;
        int var9 = arg0;
        int var10 = arg4 - arg3;
        int var11 = 0;
        int var12 = arg0 - arg3;
        int var13 = arg4 * arg4;
        int var14 = arg0 * arg0;
        int var15 = var10 * var10;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var12 << 1;
        int var21 = arg0 << 1;
        int var22 = (1 - var20) * var15 + var19;
        int var23 = var15 << 1;
        int var24 = var16 - (var20 - 1) * var23;
        int var25 = (1 - var21) * var13 + var17;
        int var26 = var14 - ((arg6 + var21) * var18);
        int var27 = var14 << 2;
        int var28 = var13 << 2;
        int var29 = var15 << 2;
        int var30 = var17 * 3;
        int var31 = (var21 - 3) * var18;
        int var32 = (var20 - 3) * var23;
        int var33 = var19 * 3;
        int var34 = (arg0 - 1) * var28;
        int var35 = var16 << 2;
        int var36 = var27;
        int var37 = var35;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class232.field4151[arg5];
        class242.method1700(7, arg2, arg1 - var10, var39, arg1 - arg4);
        class242.method1700(7, arg7, arg1 + var10, var39, arg1 - var10);
        class242.method1700(7, arg2, arg1 + arg4, var39, arg1 + var10);
        while (var9 > 0) {
            if (var25 < 0) {
                while (var25 < 0) {
                    var26 += var36;
                    var25 += var30;
                    var8++;
                    var36 += var27;
                    var30 += var27;
                }
            }
            if (var26 < 0) {
                var8++;
                var25 += var30;
                var30 += var27;
                var26 += var36;
                var36 += var27;
            }
            var25 += -var34;
            var34 -= var28;
            var26 += -var31;
            boolean var40 = var12 >= var9;
            var9--;
            int var41 = arg1 + var8;
            int var42 = arg5 + var9;
            if (var40) {
                if (var22 < 0) {
                    while (var22 < 0) {
                        var24 += var37;
                        var37 += var35;
                        var22 += var33;
                        var11++;
                        var33 += var35;
                    }
                }
                if (var24 < 0) {
                    var11++;
                    var24 += var37;
                    var37 += var35;
                    var22 += var33;
                    var33 += var35;
                }
                var24 += -var32;
                var32 -= var29;
                var22 += -var38;
                var38 -= var29;
            }
            var31 -= var28;
            int var43 = arg5 - var9;
            int var44 = arg1 - var8;
            if (var40) {
                int var45 = arg1 + var11;
                int var46 = arg1 - var11;
                class242.method1700(arg6 ^ 0xFFFFFFF8, arg2, var46, class232.field4151[var43], var44);
                class242.method1700(7, arg7, var45, class232.field4151[var43], var46);
                class242.method1700(7, arg2, var41, class232.field4151[var43], var45);
                class242.method1700(arg6 + 8, arg2, var46, class232.field4151[var42], var44);
                class242.method1700(7, arg7, var45, class232.field4151[var42], var46);
                class242.method1700(7, arg2, var41, class232.field4151[var42], var45);
            } else {
                class242.method1700(7, arg2, var41, class232.field4151[var43], var44);
                class242.method1700(7, arg2, var41, class232.field4151[var42], var44);
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(IIIIIIII)V")
    public static final void method1037(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2622++;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = arg6 - arg2;
        int var12 = arg3 - arg2;
        int var13 = arg6 * arg6;
        int var14 = arg3 * arg3;
        int var15 = var12 * var12;
        int var16 = var14 << 1;
        int var17 = var11 * var11;
        int var18 = var13 << 1;
        int var19 = var15 << 1;
        int var20 = arg3 << 1;
        int var21 = var14 - (var20 - 1) * var18;
        int var22 = var12 << 1;
        int var23 = (1 - var20) * var13 + var16;
        int var24 = var17 << 1;
        int var25 = (1 - var22) * var17 + var19;
        int var26 = var15 - ((var22 - 1) * var24);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var17 << 2;
        int var31 = var16 * 3;
        int var32 = -94 % ((83 - arg7) / 38);
        int var33 = (var20 - 3) * var18;
        int var34 = var19 * 3;
        int var35 = var28;
        int var36 = (var22 - 3) * var24;
        int var37 = (arg3 - 1) * var27;
        int var38 = var29;
        int var39 = (var12 - 1) * var30;
        if (class242.field4314 <= arg1 && class99.field1584 >= arg1) {
            int[] var40 = class232.field4151[arg1];
            int var41 = class213.method1459(arg4 - arg6, (byte) -99, class37.field678, class207.field3680);
            int var42 = class213.method1459(arg4 + arg6, (byte) -14, class37.field678, class207.field3680);
            int var43 = class213.method1459(arg4 - var11, (byte) -100, class37.field678, class207.field3680);
            int var44 = class213.method1459(arg4 + var11, (byte) -13, class37.field678, class207.field3680);
            class242.method1700(7, arg0, var43, var40, var41);
            class242.method1700(7, arg5, var44, var40, var43);
            class242.method1700(7, arg0, var42, var40, var44);
        }
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var23 += var31;
                    var21 += var35;
                    var31 += var28;
                    var35 += var28;
                }
            }
            if (var21 < 0) {
                var8++;
                var21 += var35;
                var35 += var28;
                var23 += var31;
                var31 += var28;
            }
            var23 += -var37;
            var37 -= var27;
            var21 += -var33;
            var33 -= var27;
            boolean var45 = var12 >= var9;
            var9--;
            int var46 = arg1 + var9;
            if (var45) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var38;
                        var10++;
                        var25 += var34;
                        var38 += var29;
                        var34 += var29;
                    }
                }
                if (var26 < 0) {
                    var26 += var38;
                    var38 += var29;
                    var25 += var34;
                    var10++;
                    var34 += var29;
                }
                var25 += -var39;
                var39 -= var30;
                var26 += -var36;
                var36 -= var30;
            }
            int var47 = arg1 - var9;
            if (var46 >= class242.field4314 && class99.field1584 >= var47) {
                int var48 = class213.method1459(arg4 + var8, (byte) -117, class37.field678, class207.field3680);
                int var49 = class213.method1459(arg4 - var8, (byte) -19, class37.field678, class207.field3680);
                if (var45) {
                    int var50 = class213.method1459(arg4 + var10, (byte) -31, class37.field678, class207.field3680);
                    int var51 = class213.method1459(arg4 - var10, (byte) -119, class37.field678, class207.field3680);
                    if (class242.field4314 <= var47) {
                        int[] var52 = class232.field4151[var47];
                        class242.method1700(7, arg0, var51, var52, var49);
                        class242.method1700(7, arg5, var50, var52, var51);
                        class242.method1700(7, arg0, var48, var52, var50);
                    }
                    if (var46 <= class99.field1584) {
                        int[] var53 = class232.field4151[var46];
                        class242.method1700(7, arg0, var51, var53, var49);
                        class242.method1700(7, arg5, var50, var53, var51);
                        class242.method1700(7, arg0, var48, var53, var50);
                    }
                } else {
                    if (class242.field4314 <= var47) {
                        class242.method1700(7, arg0, var48, class232.field4151[var47], var49);
                    }
                    if (class99.field1584 >= var46) {
                        class242.method1700(7, arg0, var48, class232.field4151[var46], var49);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BII)V")
    public static final void method1038(byte arg0, int arg1, int arg2) {
        field2630++;
        if (arg0 < 44) {
            method1040(-3);
        }
        if (class167.field2824 < 2 && class192.field3446 == 0 && !class197.field3523) {
            return;
        }
        class191 var3;
        if (class192.field3446 == 1 && class167.field2824 < 2) {
            var3 = class228.method1629(new class191[] { class266.field4708, class179.field3077, class69.field1216, class273.field4828 }, (byte) -62);
        } else if (class197.field3523 && class167.field2824 < 2) {
            var3 = class228.method1629(new class191[] { class14.field171, class179.field3077, class45.field806, class273.field4828 }, (byte) -8);
        } else {
            var3 = class106.method683(-8029, class167.field2824 - 1);
        }
        if (class167.field2824 > 2) {
            var3 = class228.method1629(new class191[] { var3, class16.field213, class92.method563(-113, class167.field2824 - 2), class242.field4310 }, (byte) -70);
        }
        int var4 = class230.field4128.method307(var3, arg2 + 4, arg1 - -15, 16777215, 0, class27.field390, class271.field4779);
        class71.method469(-117, 15, arg1, arg2 + 4, var4 + class230.field4128.method302(var3));
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lng;B)V")
    public static final void method1039(class121 arg0, byte arg1) {
        if (arg1 > -27) {
            field2627 = null;
        }
        class262.field4648 = arg0.method824(true, class132.field2226);
        field2623++;
        class169.field2854 = arg0.method824(true, class66.field1153);
        class114.field1889 = arg0.method824(true, class36.field657);
        class27.field394 = arg0.method824(true, class107.field1773);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static void method1040(int arg0) {
        int var1 = 61 / ((-arg0 - 16) / 55);
        field2629 = null;
        field2628 = null;
        field2627 = null;
        field2624 = null;
    }
}
