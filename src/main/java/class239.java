import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class239 extends class317 {

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    public int field4123 = -1;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "[I")
    public static int[] field4122 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "Lfr;")
    public static class231 field4117 = new class231(4);

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public int field4128;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "Ljava/lang/String;")
    public String field4119;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "Ljava/lang/String;")
    public String field4127;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(CIB)I", line = 5)
    public static final int method1636(char arg0, int arg1, byte arg2) {
        ++field4124;
        int var3 = arg0 << 4;
        if (arg2 != -93) {
            field4117 = null;
        }
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            arg0 = Character.toLowerCase(arg0);
            var3 = (arg0 << 4) + 1;
        }
        if (arg0 == 241 && arg1 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIBIIII)V", line = 27)
    public static final void method1637(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        if (~class182.field2877 >= ~arg6 && arg6 <= class235.field4076 && arg1 >= class182.field2877 && ~class235.field4076 <= ~arg1 && ~class182.field2877 >= ~arg2 && ~arg2 >= ~class235.field4076 && arg9 >= class182.field2877 && arg9 <= class235.field4076 && ~class29.field460 >= ~arg7 && ~arg7 >= ~class472.field6996 && arg4 >= class29.field460 && ~class472.field6996 <= ~arg4 && arg8 >= class29.field460 && ~class472.field6996 <= ~arg8 && ~arg3 <= ~class29.field460 && ~arg3 >= ~class472.field6996) {
            class415.method2561(arg7, arg3, arg1, arg8, (byte) -126, arg6, arg2, arg4, arg0, arg9);
        } else {
            class177.method1199((byte) -89, arg4, arg1, arg0, arg8, arg6, arg9, arg3, arg2, arg7);
        }
        ++field4120;
        if (arg5 < 24) {
            field4117 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V", line = 49)
    public static final void method1638(int arg0) {
        class498.field7308.method1604(4);
        if (arg0 < -101) {
            ++field4118;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIZII)V", line = 60)
    public static final void method1639(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field4121;
        if (class468.method2782(arg4, arg1 ^ -3875)) {
            if (arg1 != 28248) {
                method1640(-94, -109, -115, -4, 105, 8, false, -82, -6);
            }
            class156.method1094(class508.field7389[arg4], arg2, arg0, arg1 + -49085, -1, arg3);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIZII)Z", line = 75)
    public static final boolean method1640(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        ++field4126;
        if (arg6) {
            method1637(-19, 117, -31, 102, 99, (byte) -77, 73, -15, -105, -37);
        }
        if (arg2 < arg5 - -arg7 && ~(arg2 - -arg8) < ~arg5) {
            return arg3 < arg1 + arg4 && arg3 - -arg0 > arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)Lpb;", line = 99)
    public final class2 method1641(int arg0) {
        if (arg0 != -12531) {
            method1643(11);
        }
        ++field4125;
        return class240.field4131[super.field4986];
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZIII)V", line = 116)
    public static final void method1642(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field4116;
        if (arg1 || class419.field6341 != arg4 || ~class344.field5393 != ~arg3 || class93.field1556 != class229.field3994 && !class510.field7403.method1188(class511.field7485, -120)) {
            class419.field6341 = arg4;
            class344.field5393 = arg3;
            class229.field3994 = class93.field1556;
            if (class510.field7403.method1188(class511.field7485, arg2 ^ 119)) {
                class229.field3994 = 0;
            }
            class75.method540(-7, arg0);
            class499.method2954(true, class519.field7664.method1954(class300.field4813, arg2 ^ 30359), 114, class531.field7796);
            int var5 = class16.field181;
            class16.field181 = (-(class217.field3775 >> 4) + class419.field6341) * 8;
            int var6 = class455.field6794;
            class455.field6794 = (-(class277.field4548 >> 4) + class344.field5393) * 8;
            class246.field4203 = class210.method1377(class419.field6341 * 8, class344.field5393 * 8);
            class15.field172 = null;
            int var7 = -var5 + class16.field181;
            int var8 = -var6 + class455.field6794;
            if (arg0 != 10) {
                class86.field1471 = 0;
                boolean var9 = false;
                int var10 = class217.field3775 * 128 + -128;
                int var11 = class277.field4548 * 128 + -128;
                for (int var12 = 0; var12 < class353.field5506; ++var12) {
                    class505 var13 = class393.field6008[var12];
                    if (var13 != null) {
                        class265 var14 = var13.field7355;
                        var14.field4714 -= var8 * 128;
                        var14.field4716 -= var7 * 128;
                        if (~var14.field4716 <= -1 && var10 >= var14.field4716 && var14.field4714 >= 0 && var14.field4714 <= var11) {
                            boolean var15 = true;
                            for (int var16 = 0; var16 < 10; ++var16) {
                                var14.field3159[var16] -= var7;
                                var14.field3158[var16] -= var8;
                                if (~var14.field3159[var16] > -1 || var14.field3159[var16] >= class217.field3775 || var14.field3158[var16] < 0 || ~var14.field3158[var16] <= ~class277.field4548) {
                                    var15 = false;
                                }
                            }
                            if (var15) {
                                class371.field5734[class86.field1471++] = var14.field3130;
                            } else {
                                var14.method1764(-1, (class510) null);
                                var9 = true;
                                var13.method1821((byte) -85);
                            }
                        } else {
                            var14.method1764(arg2 ^ 10, (class510) null);
                            var9 = true;
                            var13.method1821((byte) 69);
                        }
                    }
                }
                if (var9) {
                    class353.field5506 = class147.field2396.method2521((byte) -99);
                    class147.field2396.method2523(114, class393.field6008);
                }
            } else {
                for (int var17 = 0; ~var17 > ~class353.field5506; ++var17) {
                    class505 var30 = class393.field6008[var17];
                    if (var30 != null) {
                        class265 var31 = var30.field7355;
                        for (int var32 = 0; ~var32 > -11; ++var32) {
                            var31.field3159[var32] -= var7;
                            var31.field3158[var32] -= var8;
                        }
                        var31.field4716 -= var7 * 128;
                        var31.field4714 -= var8 * 128;
                    }
                }
            }
            for (int var18 = 0; var18 < 2048; ++var18) {
                class166 var28 = class435.field6489[var18];
                if (var28 != null) {
                    for (int var29 = 0; var29 < 10; ++var29) {
                        var28.field3159[var29] -= var7;
                        var28.field3158[var29] -= var8;
                    }
                    var28.field4716 -= var7 * 128;
                    var28.field4714 -= var8 * 128;
                }
            }
            class475[] var19 = class413.field6289;
            for (int var20 = 0; var19.length > var20; ++var20) {
                class475 var27 = var19[var20];
                if (var27 != null) {
                    var27.field7035 -= var8 * 128;
                    var27.field7034 -= var7 * 128;
                }
            }
            for (class283 var21 = (class283) class240.field4130.method2538(-3); var21 != null; var21 = (class283) class240.field4130.method2535((byte) -53)) {
                var21.field4628 -= var8;
                var21.field4621 -= var7;
                if (~class194.field3037 != -5 && (~var21.field4621 > -1 || var21.field4628 < 0 || class217.field3775 <= var21.field4621 || class277.field4548 <= var21.field4628)) {
                    var21.method1821((byte) 100);
                }
            }
            if (~class194.field3037 != -5) {
                for (class279 var22 = (class279) class244.field4176.method2518(-126); var22 != null; var22 = (class279) class244.field4176.method2524(0)) {
                    int var23 = (int) (16383L & var22.field4542);
                    int var24 = -class16.field181 + var23;
                    int var25 = (int) (var22.field4542 >> 14 & 16383L);
                    int var26 = -class455.field6794 + var25;
                    if (var24 < 0 || var26 < 0 || ~class217.field3775 >= ~var24 || class277.field4548 <= var26) {
                        var22.method1821((byte) -87);
                    }
                }
            }
            if (~class314.field4946 != -1) {
                class314.field4946 -= var7;
                class420.field6346 -= var8;
            }
            class57.method392(false);
            if (~arg0 == arg2) {
                if (~class190.field2963 != -5) {
                    class190.field2963 = 1;
                } else {
                    class165.field2606 -= var7 * 128;
                    class535.field7865 -= var8 * 128;
                    class296.field4782 -= var7 * 128;
                    class139.field2318 -= var8 * 128;
                }
            } else {
                class49.field790 -= var7;
                class60.field922 -= var7;
                class48.field764 -= var8 * 128;
                class407.field6188 -= var8;
                class475.field7031 -= var8;
                class473.field7021 -= var7 * 128;
                if (Math.abs(var7) > class217.field3775 || ~Math.abs(var8) < ~class277.field4548) {
                    class171.method1160(arg2 + -19843);
                }
            }
            class318.method2020((byte) 65);
            class104.method714(arg2 + 10);
            class359.field5586.method2543(arg2 + 7666);
            class328.field5171.method2543(7655);
            class194.field3020.method566(true);
            class46.method332(arg2 ^ 97);
        }
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V", line = 383)
    public static void method1643(int arg0) {
        if (arg0 >= -123) {
            method1638(-13);
        }
        field4122 = null;
        field4117 = null;
    }
}
