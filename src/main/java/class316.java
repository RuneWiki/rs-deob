import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class316 {

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public int field4106 = 0;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "Lnj;")
    public static class415 field4107 = new class415(1, -1);

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "[Lxa;")
    public static class511[] field4104;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIILwca;IIIII)Z")
    public static final boolean method1846(int arg0, int arg1, int arg2, int arg3, int arg4, class36 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field4102++;
        int var11 = arg0;
        int var12 = arg7;
        byte var13 = 64;
        byte var14 = 64;
        if (arg1 != 1) {
            return true;
        }
        int var15 = arg0 - var13;
        int var16 = arg7 - var14;
        class366.field4724[var13][var14] = 99;
        class649.field9041[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class191.field2440[var17] = arg0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class181.field2231[var10001] = arg7;
        int[][] var19 = arg5.field530;
        while (var26 != var18) {
            var12 = class181.field2231[var18];
            var11 = class191.field2440[var18];
            int var20 = var11 - var15;
            int var21 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - arg5.field523;
            int var23 = var12 - arg5.field519;
            if (arg2 == -4) {
                if (arg4 == var11 && arg3 == var12) {
                    class354.field4560 = var11;
                    class289.field3734 = var12;
                    return true;
                }
            } else if (arg2 == -3) {
                if (class663.method3632(var12, (byte) 119, 2, 2, var11, arg9, arg4, arg8, arg3)) {
                    class354.field4560 = var11;
                    class289.field3734 = var12;
                    return true;
                }
            } else if (arg2 == -2) {
                if (arg5.method298(126, arg4, arg8, 2, var11, var12, arg3, arg10, arg9, 2)) {
                    class354.field4560 = var11;
                    class289.field3734 = var12;
                    return true;
                }
            } else if (arg2 == -1) {
                if (arg5.method291(0, arg4, arg9, var12, arg8, arg3, var11, arg10, 2)) {
                    class354.field4560 = var11;
                    class289.field3734 = var12;
                    return true;
                }
            } else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
                if (arg5.method295(arg4, (byte) 106, 2, arg2, arg6, arg3, var11, var12)) {
                    class289.field3734 = var12;
                    class354.field4560 = var11;
                    return true;
                }
            } else if (arg5.method293(var12, 2, arg3, arg4, arg6, arg2, var11, (byte) 97)) {
                class289.field3734 = var12;
                class354.field4560 = var11;
                return true;
            }
            int var25 = class649.field9041[var20][var21] + 1;
            if (var20 > 0 && class366.field4724[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class191.field2440[var26] = var11 - 1;
                class181.field2231[var26] = var12;
                class366.field4724[var20 - 1][var21] = 2;
                var26 = var26 + 1 & 0xFFF;
                class649.field9041[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class366.field4724[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class191.field2440[var26] = var11 + 1;
                class181.field2231[var26] = var12;
                class366.field4724[var20 + 1][var21] = 8;
                var26 = var26 + 1 & 0xFFF;
                class649.field9041[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class366.field4724[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class191.field2440[var26] = var11;
                class181.field2231[var26] = var12 - 1;
                class366.field4724[var20][var21 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class649.field9041[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class366.field4724[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class191.field2440[var26] = var11;
                class181.field2231[var26] = var12 + 1;
                class366.field4724[var20][var21 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class649.field9041[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class366.field4724[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class191.field2440[var26] = var11 - 1;
                class181.field2231[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class366.field4724[var20 - 1][var21 - 1] = 3;
                class649.field9041[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class366.field4724[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class191.field2440[var26] = var11 + 1;
                class181.field2231[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class366.field4724[var20 + 1][var21 - 1] = 9;
                class649.field9041[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class366.field4724[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class191.field2440[var26] = var11 - 1;
                class181.field2231[var26] = var12 + 1;
                class366.field4724[var20 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class649.field9041[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class366.field4724[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class191.field2440[var26] = var11 + 1;
                class181.field2231[var26] = var12 + 1;
                class366.field4724[var20 + 1][var21 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class649.field9041[var20 + 1][var21 + 1] = var25;
            }
        }
        class354.field4560 = var11;
        class289.field3734 = var12;
        return false;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILfd;I)V")
    private final void method1847(int arg0, class418 arg1, int arg2) {
        if (arg0 == -7514) {
            field4103++;
            if (arg2 == 5) {
                this.field4106 = arg1.method2393(arg0 ^ 0x655F);
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
    public static void method1848(byte arg0) {
        field4107 = null;
        if (arg0 == 70) {
            field4104 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILfd;)V")
    public final void method1849(int arg0, class418 arg1) {
        field4105++;
        if (arg0 != 0) {
            method1848((byte) -98);
        }
        while (true) {
            int var3 = arg1.method2396(94);
            if (var3 == 0) {
                return;
            }
            this.method1847(arg0 ^ 0xFFFFE2A6, arg1, var3);
        }
    }
}
