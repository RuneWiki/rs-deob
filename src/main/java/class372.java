import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class372 {

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field5638 = -2;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "Led;")
    public static class366 field5640 = null;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "Ltm;")
    public static class334 field5637 = new class334(116, -2);

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "Leha;")
    public static class162 field5643;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "Lro;")
    public static class522 field5642;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "Lcl;")
    public static class746 field5641;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIIIIILup;ZI)Z")
    public static final boolean method2367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class238 arg8, boolean arg9, int arg10) {
        field5639++;
        int var11 = arg2;
        int var12 = arg5;
        byte var13 = 64;
        byte var14 = 64;
        if (arg9) {
            return false;
        }
        int var15 = arg2 - var13;
        int var16 = arg5 - var14;
        class339.field4967[var13][var14] = 99;
        class532.field7661[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class457.field6638[var17] = arg2;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class707.field9973[var10001] = arg5;
        int[][] var19 = arg8.field3831;
        while (var26 != var18) {
            var11 = class457.field6638[var18];
            var12 = class707.field9973[var18];
            int var20 = var12 - var16;
            int var21 = var11 - arg8.field3832;
            int var22 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            int var23 = var12 - arg8.field3828;
            if (arg3 == -4) {
                if (arg0 == var11 && arg1 == var12) {
                    class689.field9795 = var12;
                    class594.field8340 = var11;
                    return true;
                }
            } else if (arg3 == -3) {
                if (class590.method3391((byte) -93, arg0, arg1, var12, 1, 1, var11, arg6, arg4)) {
                    class689.field9795 = var12;
                    class594.field8340 = var11;
                    return true;
                }
            } else if (arg3 == -2) {
                if (arg8.method1648(var11, 1, 1, arg1, var12, arg6, arg4, -16827, arg0, arg7)) {
                    class594.field8340 = var11;
                    class689.field9795 = var12;
                    return true;
                }
            } else if (arg3 == -1) {
                if (arg8.method1646(arg0, arg6, var11, var12, arg4, (byte) 106, arg7, 1, arg1)) {
                    class594.field8340 = var11;
                    class689.field9795 = var12;
                    return true;
                }
            } else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
                if (arg8.method1637(var11, arg1, 1, arg3, var12, arg10, true, arg0)) {
                    class689.field9795 = var12;
                    class594.field8340 = var11;
                    return true;
                }
            } else if (arg8.method1654(arg10, arg1, arg3, 1, 1, arg0, var12, var11)) {
                class689.field9795 = var12;
                class594.field8340 = var11;
                return true;
            }
            int var25 = class532.field7661[var22][var20] + 1;
            if (var22 > 0 && class339.field4967[var22 - 1][var20] == 0 && (var19[var21 - 1][var23] & 0x42240000) == 0) {
                class457.field6638[var26] = var11 - 1;
                class707.field9973[var26] = var12;
                class339.field4967[var22 - 1][var20] = 2;
                var26 = var26 + 1 & 0xFFF;
                class532.field7661[var22 - 1][var20] = var25;
            }
            if (var22 < 127 && class339.field4967[var22 + 1][var20] == 0 && (var19[var21 + 1][var23] & 0x60240000) == 0) {
                class457.field6638[var26] = var11 + 1;
                class707.field9973[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class339.field4967[var22 + 1][var20] = 8;
                class532.field7661[var22 + 1][var20] = var25;
            }
            if (var20 > 0 && class339.field4967[var22][var20 - 1] == 0 && (var19[var21][var23 - 1] & 0x40A40000) == 0) {
                class457.field6638[var26] = var11;
                class707.field9973[var26] = var12 - 1;
                class339.field4967[var22][var20 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class532.field7661[var22][var20 - 1] = var25;
            }
            if (var20 < 127 && class339.field4967[var22][var20 + 1] == 0 && (var19[var21][var23 + 1] & 0x48240000) == 0) {
                class457.field6638[var26] = var11;
                class707.field9973[var26] = var12 + 1;
                class339.field4967[var22][var20 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class532.field7661[var22][var20 + 1] = var25;
            }
            if (var22 > 0 && var20 > 0 && class339.field4967[var22 - 1][var20 - 1] == 0 && (var19[var21 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var21 - 1][var23] & 0x42240000) == 0 && (var19[var21][var23 - 1] & 0x40A40000) == 0) {
                class457.field6638[var26] = var11 - 1;
                class707.field9973[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class339.field4967[var22 - 1][var20 - 1] = 3;
                class532.field7661[var22 - 1][var20 - 1] = var25;
            }
            if (var22 < 127 && var20 > 0 && class339.field4967[var22 + 1][var20 - 1] == 0 && (var19[var21 + 1][var23 - 1] & 0x60E40000) == 0 && (var19[var21 + 1][var23] & 0x60240000) == 0 && (var19[var21][var23 - 1] & 0x40A40000) == 0) {
                class457.field6638[var26] = var11 + 1;
                class707.field9973[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class339.field4967[var22 + 1][var20 - 1] = 9;
                class532.field7661[var22 + 1][var20 - 1] = var25;
            }
            if (var22 > 0 && var20 < 127 && class339.field4967[var22 - 1][var20 + 1] == 0 && (var19[var21 - 1][var23 + 1] & 0x4E240000) == 0 && (var19[var21 - 1][var23] & 0x42240000) == 0 && (var19[var21][var23 + 1] & 0x48240000) == 0) {
                class457.field6638[var26] = var11 - 1;
                class707.field9973[var26] = var12 + 1;
                class339.field4967[var22 - 1][var20 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class532.field7661[var22 - 1][var20 + 1] = var25;
            }
            if (var22 < 127 && var20 < 127 && class339.field4967[var22 + 1][var20 + 1] == 0 && (var19[var21 + 1][var23 + 1] & 0x78240000) == 0 && (var19[var21 + 1][var23] & 0x60240000) == 0 && (var19[var21][var23 + 1] & 0x48240000) == 0) {
                class457.field6638[var26] = var11 + 1;
                class707.field9973[var26] = var12 + 1;
                class339.field4967[var22 + 1][var20 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class532.field7661[var22 + 1][var20 + 1] = var25;
            }
        }
        class689.field9795 = var12;
        class594.field8340 = var11;
        return false;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method2368(int arg0, String arg1) {
        field5636++;
        if (arg1 == null) {
            return false;
        }
        int var2 = 76 % ((arg0 + 67) / 56);
        for (int var3 = 0; var3 < class270.field4155; var3++) {
            if (arg1.equalsIgnoreCase(class387.field5800[var3])) {
                return true;
            }
            if (arg1.equalsIgnoreCase(class73.field1097[var3])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public static void method2369(int arg0) {
        field5637 = null;
        field5640 = null;
        if (arg0 <= -60) {
            field5643 = null;
            field5642 = null;
            field5641 = null;
        }
    }
}
