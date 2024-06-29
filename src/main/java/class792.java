import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class792 {

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "Z")
    public static boolean field10866 = false;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public static int field10867;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public static int field10868;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    public static int field10869;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
    public static int field10870;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIIIIIIIBLeq;I)Z")
    public static final boolean method4327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, class224 arg9, int arg10) {
        if (arg8 >= -117) {
            field10866 = false;
        }
        field10867++;
        int var11 = arg1;
        int var12 = arg0;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg1 - var13;
        int var16 = arg0 - var14;
        class437.field6319[var13][var14] = 99;
        class85.field1207[var13][var14] = 0;
        byte var17 = 0;
        class58.field761[var17] = arg1;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class560.field7681[var10001] = arg0;
        int[][] var19 = arg9.field2908;
        while (var26 != var18) {
            var11 = class58.field761[var18];
            var12 = class560.field7681[var18];
            int var20 = var12 - var16;
            int var21 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - arg9.field2896;
            int var23 = var12 - arg9.field2912;
            if (arg7 == -4) {
                if (arg3 == var11 && arg4 == var12) {
                    class399.field5715 = var12;
                    class6.field44 = var11;
                    return true;
                }
            } else if (arg7 == -3) {
                if (class452.method2688(arg3, var11, 2, -65535, arg4, arg2, 2, arg10, var12)) {
                    class6.field44 = var11;
                    class399.field5715 = var12;
                    return true;
                }
            } else if (arg7 == -2) {
                if (arg9.method1435(32, arg2, arg10, 2, arg5, 2, arg4, arg3, var12, var11)) {
                    class6.field44 = var11;
                    class399.field5715 = var12;
                    return true;
                }
            } else if (arg7 == -1) {
                if (arg9.method1434(arg2, 2, arg3, arg10, arg5, arg4, var12, 256, var11)) {
                    class399.field5715 = var12;
                    class6.field44 = var11;
                    return true;
                }
            } else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
                if (arg9.method1430(arg7, arg3, 2, arg4, true, arg6, var11, var12)) {
                    class399.field5715 = var12;
                    class6.field44 = var11;
                    return true;
                }
            } else if (arg9.method1423(var12, var11, (byte) 59, 2, arg3, arg4, arg7, arg6)) {
                class6.field44 = var11;
                class399.field5715 = var12;
                return true;
            }
            int var25 = class85.field1207[var21][var20] + 1;
            if (var21 > 0 && class437.field6319[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class58.field761[var26] = var11 - 1;
                class560.field7681[var26] = var12;
                class437.field6319[var21 - 1][var20] = 2;
                var26 = var26 + 1 & 0xFFF;
                class85.field1207[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class437.field6319[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class58.field761[var26] = var11 + 1;
                class560.field7681[var26] = var12;
                class437.field6319[var21 + 1][var20] = 8;
                var26 = var26 + 1 & 0xFFF;
                class85.field1207[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class437.field6319[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class58.field761[var26] = var11;
                class560.field7681[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class437.field6319[var21][var20 - 1] = 1;
                class85.field1207[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class437.field6319[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class58.field761[var26] = var11;
                class560.field7681[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class437.field6319[var21][var20 + 1] = 4;
                class85.field1207[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class437.field6319[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class58.field761[var26] = var11 - 1;
                class560.field7681[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class437.field6319[var21 - 1][var20 - 1] = 3;
                class85.field1207[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class437.field6319[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class58.field761[var26] = var11 + 1;
                class560.field7681[var26] = var12 - 1;
                class437.field6319[var21 + 1][var20 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class85.field1207[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class437.field6319[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class58.field761[var26] = var11 - 1;
                class560.field7681[var26] = var12 + 1;
                class437.field6319[var21 - 1][var20 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class85.field1207[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class437.field6319[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class58.field761[var26] = var11 + 1;
                class560.field7681[var26] = var12 + 1;
                class437.field6319[var21 + 1][var20 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class85.field1207[var21 + 1][var20 + 1] = var25;
            }
        }
        class399.field5715 = var12;
        class6.field44 = var11;
        return false;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIB)Z")
    public static final boolean method4328(int arg0, int arg1, byte arg2) {
        field10870++;
        if (arg2 != 24) {
            method4328(-41, -31, (byte) -55);
        }
        return (arg0 & 0x800) != 0 | class286.method1850(arg0, -1, arg1) || class655.method3640(-21797, arg0, arg1);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lha;ZII)Lda;")
    public static final class67 method4329(class66 arg0, boolean arg1, int arg2, int arg3) {
        field10868++;
        class14 var4 = class222.method1419(arg3, arg0, true, arg1);
        if (var4 == null) {
            return null;
        } else if (arg2 > -23) {
            return null;
        } else {
            return var4.field142;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
    public static final void method4330(int arg0) {
        class107.field1511.method887((byte) -128);
        field10869++;
        class103.field1471.method3666(0);
        class345.field4846.method1297(-22585);
        class210.field2705.method1361((byte) -108);
        class107.field1507.method3580(-12);
        class16.field156.method2128(arg0 - 22836);
        class693.field9223.method2384(-32400);
        class641.field8643.method912(-92);
        class547.field7563.method3716(1);
        class2.field14.method4322(89);
        class285.field4087.method1795(64);
        class175.field2314.method2635(54);
        class548.field7574.method3177(14);
        class323.field4586.method2069(36);
        class222.field2875.method3210((byte) 110);
        class315.field4447.method3520(84);
        class629.field8517.method4127(84);
        class297.field4200.method2328(arg0);
        class224.field2905.method3997(-11553);
        class453.field6503.method1513(-1951749335);
        class130.field1795.method3481((byte) 31);
        class83.field1185.method2902(20);
        class441.method2630(arg0 ^ 0xFFFFFFFD);
        class635.method3502(false);
        class83.method676(arg0 + 60);
        class526.method3054((byte) 19);
        class789.method4318((byte) 110);
        class618.field8350.method3113(arg0 - 127);
        class355.field5177.method3113(arg0 - 127);
        class145.field1948.method3113(-127);
        class377.field5511.method3113(-128);
        class727.field9855.method3113(arg0 - 127);
    }
}
