import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public class class452 {

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!cja", name = "c", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!cja", name = "d", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!cja", name = "e", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!cja", name = "b", descriptor = "Lui;")
    public static class556 field6197;

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(IBIIII)V")
    public static final void method2657(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        class410.field5616 = arg3;
        field6200++;
        class235.field3407 = arg0;
        class355.field5022 = arg4;
        class142.field2317 = arg2;
        class313.field4422 = arg5;
        if (class235.field3407 >= 100) {
            int var6 = class355.field5022 * 512 + 256;
            int var7 = class410.field5616 * 512 + 256;
            int var8 = class577.method3399(var7, var6, arg1 - 8596, class403.field5560) - class142.field2317;
            int var9 = var6 - class733.field10199;
            int var10 = var8 - class243.field3482;
            int var11 = var7 - class286.field4204;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class99.field1437 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class642.field9037 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            class389.field5439 = 0;
            if (class99.field1437 < 1024) {
                class99.field1437 = 1024;
            }
            if (class99.field1437 > 3072) {
                class99.field1437 = 3072;
            }
        }
        if (arg1 == -128) {
            class783.field10725 = 2;
            class401.field5533 = -1;
            class743.field10323 = -1;
        }
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(I)V")
    public static void method2658(int arg0) {
        field6197 = null;
        if (arg0 != 0) {
            field6197 = null;
        }
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(ILea;IBI)V")
    public static final void method2659(int arg0, class21 arg1, int arg2, byte arg3, int arg4) {
        field6198++;
        int var5 = arg1.field4142[0];
        if (arg0 != -12974) {
            field6197 = null;
        }
        int var6 = arg1.field4136[0];
        if (var5 < 0 || class192.field2891 <= var5 || var6 < 0 || var6 >= class456.field6225 || arg2 < 0 || class192.field2891 <= arg2 || arg4 < 0 || arg4 >= class456.field6225) {
            return;
        }
        int var7 = class454.method2663(class619.field8758, arg4, arg2, 0, 0, class635.field8954, true, 0, 0, var6, var5, arg1.method209(true), class605.field8591[arg1.field10361], -19, -4);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg1.method203(class635.field8954[var8], arg3, class619.field8758[var8], -76);
            }
        }
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(Lkn;IIIIIIIIII)Z")
    public static final boolean method2660(class340 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field6196++;
        if (arg3 != -23558) {
            return false;
        }
        int var11 = arg7;
        int var12 = arg1;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg7 - var13;
        class663.field9341[var13][var14] = 99;
        int var16 = arg1 - var14;
        class336.field4774[var13][var14] = 0;
        byte var17 = 0;
        class249.field3576[var17] = arg7;
        int var18 = 0;
        int var26 = var17 + 1;
        class368.field5196[var17] = arg1;
        int[][] var19 = arg0.field4822;
        while (var26 != var18) {
            var12 = class368.field5196[var18];
            var11 = class249.field3576[var18];
            int var20 = var12 - arg0.field4837;
            int var21 = var11 - arg0.field4824;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - var15;
            int var23 = var12 - var16;
            if (arg2 == -4) {
                if (arg5 == var11 && arg10 == var12) {
                    class510.field7006 = var11;
                    class6.field85 = var12;
                    return true;
                }
            } else if (arg2 == -3) {
                if (class68.method660(arg5, true, arg10, var12, arg6, arg4, 1, var11, 1)) {
                    class510.field7006 = var11;
                    class6.field85 = var12;
                    return true;
                }
            } else if (arg2 == -2) {
                if (arg0.method2078(1, 119, 1, var12, var11, arg4, arg6, arg10, arg9, arg5)) {
                    class6.field85 = var12;
                    class510.field7006 = var11;
                    return true;
                }
            } else if (arg2 == -1) {
                if (arg0.method2090(1, var11, arg6, arg4, true, arg10, arg9, arg5, var12)) {
                    class6.field85 = var12;
                    class510.field7006 = var11;
                    return true;
                }
            } else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
                if (arg0.method2094(1, -23, arg2, arg10, arg8, arg5, var11, var12)) {
                    class6.field85 = var12;
                    class510.field7006 = var11;
                    return true;
                }
            } else if (arg0.method2077(var12, arg2, arg8, 1, arg5, arg10, arg3 ^ 0x5C42, var11)) {
                class510.field7006 = var11;
                class6.field85 = var12;
                return true;
            }
            int var25 = class336.field4774[var22][var23] + 1;
            if (var22 > 0 && class663.field9341[var22 - 1][var23] == 0 && (var19[var21 - 1][var20] & 0x42240000) == 0) {
                class249.field3576[var26] = var11 - 1;
                class368.field5196[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class663.field9341[var22 - 1][var23] = 2;
                class336.field4774[var22 - 1][var23] = var25;
            }
            if (var22 < 127 && class663.field9341[var22 + 1][var23] == 0 && (var19[var21 + 1][var20] & 0x60240000) == 0) {
                class249.field3576[var26] = var11 + 1;
                class368.field5196[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class663.field9341[var22 + 1][var23] = 8;
                class336.field4774[var22 + 1][var23] = var25;
            }
            if (var23 > 0 && class663.field9341[var22][var23 - 1] == 0 && (var19[var21][var20 - 1] & 0x40A40000) == 0) {
                class249.field3576[var26] = var11;
                class368.field5196[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class663.field9341[var22][var23 - 1] = 1;
                class336.field4774[var22][var23 - 1] = var25;
            }
            if (var23 < 127 && class663.field9341[var22][var23 + 1] == 0 && (var19[var21][var20 + 1] & 0x48240000) == 0) {
                class249.field3576[var26] = var11;
                class368.field5196[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class663.field9341[var22][var23 + 1] = 4;
                class336.field4774[var22][var23 + 1] = var25;
            }
            if (var22 > 0 && var23 > 0 && class663.field9341[var22 - 1][var23 - 1] == 0 && (var19[var21 - 1][var20 - 1] & 0x43A40000) == 0 && (var19[var21 - 1][var20] & 0x42240000) == 0 && (var19[var21][var20 - 1] & 0x40A40000) == 0) {
                class249.field3576[var26] = var11 - 1;
                class368.field5196[var26] = var12 - 1;
                class663.field9341[var22 - 1][var23 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class336.field4774[var22 - 1][var23 - 1] = var25;
            }
            if (var22 < 127 && var23 > 0 && class663.field9341[var22 + 1][var23 - 1] == 0 && (var19[var21 + 1][var20 - 1] & 0x60E40000) == 0 && (var19[var21 + 1][var20] & 0x60240000) == 0 && (var19[var21][var20 - 1] & 0x40A40000) == 0) {
                class249.field3576[var26] = var11 + 1;
                class368.field5196[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class663.field9341[var22 + 1][var23 - 1] = 9;
                class336.field4774[var22 + 1][var23 - 1] = var25;
            }
            if (var22 > 0 && var23 < 127 && class663.field9341[var22 - 1][var23 + 1] == 0 && (var19[var21 - 1][var20 + 1] & 0x4E240000) == 0 && (var19[var21 - 1][var20] & 0x42240000) == 0 && (var19[var21][var20 + 1] & 0x48240000) == 0) {
                class249.field3576[var26] = var11 - 1;
                class368.field5196[var26] = var12 + 1;
                class663.field9341[var22 - 1][var23 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class336.field4774[var22 - 1][var23 + 1] = var25;
            }
            if (var22 < 127 && var23 < 127 && class663.field9341[var22 + 1][var23 + 1] == 0 && (var19[var21 + 1][var20 + 1] & 0x78240000) == 0 && (var19[var21 + 1][var20] & 0x60240000) == 0 && (var19[var21][var20 + 1] & 0x48240000) == 0) {
                class249.field3576[var26] = var11 + 1;
                class368.field5196[var26] = var12 + 1;
                class663.field9341[var22 + 1][var23 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class336.field4774[var22 + 1][var23 + 1] = var25;
            }
        }
        class510.field7006 = var11;
        class6.field85 = var12;
        return false;
    }
}
