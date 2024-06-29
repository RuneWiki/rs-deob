import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class97 {

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "B")
    private byte field1426;

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "I")
    public int field1430;

    @OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
    public int field1433;

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
    public int field1428;

    @OriginalMember(owner = "client!ct", name = "l", descriptor = "I")
    public int field1434;

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
    public int field1425;

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "Lwk;")
    public static class430 field1427 = new class430(12, 7);

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "Lcb;")
    public static class631 field1432 = new class631(40, 1);

    @OriginalMember(owner = "client!ct", name = "n", descriptor = "I")
    public static int field1436 = 0;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!ct", name = "m", descriptor = "Lit;")
    public static class34 field1435;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)V", line = 4)
    public static void method792(boolean arg0) {
        if (arg0) {
            method793(-8, (byte) -8, null, 117, -73, 87, -40, 101, 21, -34, 89);
        }
        field1435 = null;
        field1427 = null;
        field1432 = null;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IBLup;IIIIIIII)Z", line = 18)
    public static final boolean method793(int arg0, byte arg1, class238 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1429++;
        int var11 = arg3;
        int var12 = arg5;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg3 - var13;
        class339.field4967[var13][var14] = 99;
        int var16 = arg5 - var14;
        class532.field7661[var13][var14] = 0;
        byte var17 = 0;
        class457.field6638[var17] = arg3;
        if (arg1 < 11) {
            field1436 = -127;
        }
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class707.field9973[var10001] = arg5;
        int[][] var19 = arg2.field3831;
        while (var26 != var18) {
            var12 = class707.field9973[var18];
            var11 = class457.field6638[var18];
            int var20 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var12 - var16;
            int var22 = var11 - arg2.field3832;
            int var23 = var12 - arg2.field3828;
            if (arg10 == -4) {
                if (arg6 == var11 && arg7 == var12) {
                    class689.field9795 = var12;
                    class594.field8340 = var11;
                    return true;
                }
            } else if (arg10 == -3) {
                if (class590.method3391((byte) -81, arg6, arg7, var12, 2, 2, var11, arg0, arg4)) {
                    class689.field9795 = var12;
                    class594.field8340 = var11;
                    return true;
                }
            } else if (arg10 == -2) {
                if (arg2.method1648(var11, 2, 2, arg7, var12, arg0, arg4, -16827, arg6, arg8)) {
                    class594.field8340 = var11;
                    class689.field9795 = var12;
                    return true;
                }
            } else if (arg10 == -1) {
                if (arg2.method1646(arg6, arg0, var11, var12, arg4, (byte) -125, arg8, 2, arg7)) {
                    class689.field9795 = var12;
                    class594.field8340 = var11;
                    return true;
                }
            } else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
                if (arg2.method1637(var11, arg7, 2, arg10, var12, arg9, true, arg6)) {
                    class689.field9795 = var12;
                    class594.field8340 = var11;
                    return true;
                }
            } else if (arg2.method1654(arg9, arg7, arg10, 2, 1, arg6, var12, var11)) {
                class689.field9795 = var12;
                class594.field8340 = var11;
                return true;
            }
            int var25 = class532.field7661[var20][var21] + 1;
            if (var20 > 0 && class339.field4967[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class457.field6638[var26] = var11 - 1;
                class707.field9973[var26] = var12;
                class339.field4967[var20 - 1][var21] = 2;
                var26 = var26 + 1 & 0xFFF;
                class532.field7661[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class339.field4967[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class457.field6638[var26] = var11 + 1;
                class707.field9973[var26] = var12;
                class339.field4967[var20 + 1][var21] = 8;
                var26 = var26 + 1 & 0xFFF;
                class532.field7661[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class339.field4967[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class457.field6638[var26] = var11;
                class707.field9973[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class339.field4967[var20][var21 - 1] = 1;
                class532.field7661[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class339.field4967[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class457.field6638[var26] = var11;
                class707.field9973[var26] = var12 + 1;
                class339.field4967[var20][var21 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class532.field7661[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class339.field4967[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class457.field6638[var26] = var11 - 1;
                class707.field9973[var26] = var12 - 1;
                class339.field4967[var20 - 1][var21 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class532.field7661[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class339.field4967[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class457.field6638[var26] = var11 + 1;
                class707.field9973[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class339.field4967[var20 + 1][var21 - 1] = 9;
                class532.field7661[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class339.field4967[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class457.field6638[var26] = var11 - 1;
                class707.field9973[var26] = var12 + 1;
                class339.field4967[var20 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class532.field7661[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class339.field4967[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class457.field6638[var26] = var11 + 1;
                class707.field9973[var26] = var12 + 1;
                class339.field4967[var20 + 1][var21 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class532.field7661[var20 + 1][var21 + 1] = var25;
            }
        }
        class689.field9795 = var12;
        class594.field8340 = var11;
        return false;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)I", line = 371)
    public final int method794(byte arg0) {
        field1431++;
        int var2 = 26 / ((arg0 + 18) / 63);
        return this.field1426 & 0x7;
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(B)Z", line = 381)
    public static final boolean method795(byte arg0) {
        field1424++;
        boolean var1 = true;
        if (class447.field6530 == null) {
            if (class101.field1494.method2621(class19.field200, -28975)) {
                class447.field6530 = class726.method4014(class101.field1494, class19.field200);
            } else {
                var1 = false;
            }
        }
        if (arg0 != -20) {
            method793(-93, (byte) -83, null, 27, 13, 75, 5, 51, 57, 75, -5);
        }
        if (class718.field10074 == null) {
            if (class101.field1494.method2621(class64.field1033, -28975)) {
                class718.field10074 = class726.method4014(class101.field1494, class64.field1033);
            } else {
                var1 = false;
            }
        }
        if (class401.field5954 == null) {
            if (class101.field1494.method2621(class124.field1899, arg0 - 28955)) {
                class401.field5954 = class726.method4014(class101.field1494, class124.field1899);
            } else {
                var1 = false;
            }
        }
        if (class43.field734 == null) {
            if (class312.field4704.method2621(class144.field2235, arg0 - 28955)) {
                class43.field734 = class273.method1796(-91, class312.field4704, class144.field2235);
            } else {
                var1 = false;
            }
        }
        if (class403.field5984 == null) {
            if (class101.field1494.method2621(class144.field2235, -28975)) {
                class403.field5984 = class726.method4016(class101.field1494, class144.field2235);
            } else {
                var1 = false;
            }
        }
        return var1;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)I", line = 474)
    public final int method796(int arg0) {
        if (arg0 == 1) {
            field1423++;
            return (this.field1426 & 0x8) == 8 ? 1 : 0;
        } else {
            return 36;
        }
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "()V", line = 485)
    public class97() {
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lofa;)V", line = 490)
    public class97(class301 arg0) {
        this.field1426 = arg0.method1984(4);
        this.field1430 = arg0.method1989((byte) -37);
        this.field1433 = arg0.method1934(-2);
        this.field1428 = arg0.method1934(-2);
        this.field1434 = arg0.method1934(-2);
        this.field1425 = arg0.method1934(-2);
    }
}
