import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class297 {

    @OriginalMember(owner = "client!li", name = "d", descriptor = "J")
    public static long field3915 = 0L;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "Lao;")
    public static class191 field3914 = new class191(103, 3);

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIILuj;Luj;)V")
    public static final void method1777(int arg0, int arg1, int arg2, class262 arg3, class262 arg4) {
        class498 var5 = class61.method369(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field7264 = arg3;
            var5.field7257 = arg4;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V")
    public static void method1778(boolean arg0) {
        field3914 = null;
        if (!arg0) {
            method1778(true);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIZLas;IIIIII)Z")
    public static final boolean method1779(int arg0, int arg1, int arg2, boolean arg3, class106 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3916++;
        int var11 = arg6;
        int var12 = arg2;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg6 - var13;
        class360.field4889[var13][var14] = 99;
        int var16 = arg2 - var14;
        class71.field913[var13][var14] = 0;
        byte var17 = 0;
        class476.field7051[var17] = arg6;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class490.field7182[var10001] = arg2;
        int[][] var19 = arg4.field1421;
        if (arg3) {
            field3915 = -98L;
        }
        while (var26 != var18) {
            var11 = class476.field7051[var18];
            var12 = class490.field7182[var18];
            int var20 = var11 - var15;
            int var21 = var12 - arg4.field1440;
            int var22 = var12 - var16;
            int var23 = var11 - arg4.field1444;
            var18 = var18 + 1 & 0xFFF;
            if (arg1 == -4) {
                if (arg8 == var11 && arg10 == var12) {
                    class407.field5849 = var12;
                    class79.field966 = var11;
                    return true;
                }
            } else if (arg1 == -3) {
                if (class415.method2541(var12, var11, 1, arg9, arg0, 1, arg8, true, arg10)) {
                    class407.field5849 = var12;
                    class79.field966 = var11;
                    return true;
                }
            } else if (arg1 == -2) {
                if (arg4.method645(var12, var11, arg10, 1, arg0, (byte) -106, 1, arg5, arg8, arg9)) {
                    class79.field966 = var11;
                    class407.field5849 = var12;
                    return true;
                }
            } else if (arg1 == -1) {
                if (arg4.method644(arg9, arg10, arg8, 1, var12, arg5, arg0, var11, 0)) {
                    class407.field5849 = var12;
                    class79.field966 = var11;
                    return true;
                }
            } else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
                if (arg4.method650(1, arg7, -10856, arg8, arg1, var12, arg10, var11)) {
                    class407.field5849 = var12;
                    class79.field966 = var11;
                    return true;
                }
            } else if (arg4.method651(arg1, var12, 1, arg8, arg10, arg7, 25507, var11)) {
                class407.field5849 = var12;
                class79.field966 = var11;
                return true;
            }
            int var25 = class71.field913[var20][var22] + 1;
            if (var20 > 0 && class360.field4889[var20 - 1][var22] == 0 && (var19[var23 - 1][var21] & 0x42240000) == 0) {
                class476.field7051[var26] = var11 - 1;
                class490.field7182[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class360.field4889[var20 - 1][var22] = 2;
                class71.field913[var20 - 1][var22] = var25;
            }
            if (var20 < 127 && class360.field4889[var20 + 1][var22] == 0 && (var19[var23 + 1][var21] & 0x60240000) == 0) {
                class476.field7051[var26] = var11 + 1;
                class490.field7182[var26] = var12;
                class360.field4889[var20 + 1][var22] = 8;
                var26 = var26 + 1 & 0xFFF;
                class71.field913[var20 + 1][var22] = var25;
            }
            if (var22 > 0 && class360.field4889[var20][var22 - 1] == 0 && (var19[var23][var21 - 1] & 0x40A40000) == 0) {
                class476.field7051[var26] = var11;
                class490.field7182[var26] = var12 - 1;
                class360.field4889[var20][var22 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class71.field913[var20][var22 - 1] = var25;
            }
            if (var22 < 127 && class360.field4889[var20][var22 + 1] == 0 && (var19[var23][var21 + 1] & 0x48240000) == 0) {
                class476.field7051[var26] = var11;
                class490.field7182[var26] = var12 + 1;
                class360.field4889[var20][var22 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class71.field913[var20][var22 + 1] = var25;
            }
            if (var20 > 0 && var22 > 0 && class360.field4889[var20 - 1][var22 - 1] == 0 && (var19[var23 - 1][var21 - 1] & 0x43A40000) == 0 && (var19[var23 - 1][var21] & 0x42240000) == 0 && (var19[var23][var21 - 1] & 0x40A40000) == 0) {
                class476.field7051[var26] = var11 - 1;
                class490.field7182[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class360.field4889[var20 - 1][var22 - 1] = 3;
                class71.field913[var20 - 1][var22 - 1] = var25;
            }
            if (var20 < 127 && var22 > 0 && class360.field4889[var20 + 1][var22 - 1] == 0 && (var19[var23 + 1][var21 - 1] & 0x60E40000) == 0 && (var19[var23 + 1][var21] & 0x60240000) == 0 && (var19[var23][var21 - 1] & 0x40A40000) == 0) {
                class476.field7051[var26] = var11 + 1;
                class490.field7182[var26] = var12 - 1;
                class360.field4889[var20 + 1][var22 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class71.field913[var20 + 1][var22 - 1] = var25;
            }
            if (var20 > 0 && var22 < 127 && class360.field4889[var20 - 1][var22 + 1] == 0 && (var19[var23 - 1][var21 + 1] & 0x4E240000) == 0 && (var19[var23 - 1][var21] & 0x42240000) == 0 && (var19[var23][var21 + 1] & 0x48240000) == 0) {
                class476.field7051[var26] = var11 - 1;
                class490.field7182[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class360.field4889[var20 - 1][var22 + 1] = 6;
                class71.field913[var20 - 1][var22 + 1] = var25;
            }
            if (var20 < 127 && var22 < 127 && class360.field4889[var20 + 1][var22 + 1] == 0 && (var19[var23 + 1][var21 + 1] & 0x78240000) == 0 && (var19[var23 + 1][var21] & 0x60240000) == 0 && (var19[var23][var21 + 1] & 0x48240000) == 0) {
                class476.field7051[var26] = var11 + 1;
                class490.field7182[var26] = var12 + 1;
                class360.field4889[var20 + 1][var22 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class71.field913[var20 + 1][var22 + 1] = var25;
            }
        }
        class79.field966 = var11;
        class407.field5849 = var12;
        return false;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILfo;B)Lgf;")
    public static final class183 method1780(int arg0, class361 arg1, byte arg2) {
        if (arg2 <= 58) {
            field3917 = 85;
        }
        field3913++;
        byte[] var3 = arg1.method2128(-2, arg0);
        return var3 == null ? null : new class183(var3);
    }
}
