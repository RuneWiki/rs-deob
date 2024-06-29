import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class669 extends class325 {

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "Ljava/lang/Object;")
    private Object field9181;

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "F")
    public static float field9182 = 0.25F;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "Ldia;")
    public static class247 field9185 = null;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
    public static int field9183;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "I")
    public static int field9184;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
    public static int field9186;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
    public static int field9187;

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
    public static int field9188;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(Z)V")
    public static final void method3754(boolean arg0) {
        field9183++;
        if (class737.field10285 == class616.field8277) {
            return;
        }
        try {
            class745.method4171("tbrefresh", class90.field1195, (byte) 93);
            if (arg0) {
                method3755(false);
            }
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(Z)V")
    public static void method3755(boolean arg0) {
        if (!arg0) {
            method3756(0, 124, null, -24, 95, -98, 126, 48, -82, 43, 50);
        }
        field9185 = null;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class669(Object arg0, int arg1) {
        super(arg1);
        this.field9181 = arg0;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)Z")
    public final boolean method1932(byte arg0) {
        if (arg0 < 11) {
            return true;
        } else {
            field9188++;
            return false;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILwj;IIIIIIII)Z")
    public static final boolean method3756(int arg0, int arg1, class415 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field9184++;
        int var11 = arg6;
        int var12 = arg0;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg6 - var13;
        class578.field7880[var13][var14] = 99;
        int var16 = arg0 - var14;
        class68.field931[var13][var14] = 0;
        byte var17 = 0;
        class186.field2252[var17] = arg6;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class496.field6942[var10001] = arg0;
        if (arg4 < 94) {
            field9185 = null;
        }
        int[][] var19 = arg2.field5428;
        while (var26 != var18) {
            var11 = class186.field2252[var18];
            var12 = class496.field6942[var18];
            int var20 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var11 - var15;
            int var22 = var11 - arg2.field5435;
            int var23 = var12 - arg2.field5415;
            if (arg10 == -4) {
                if (arg8 == var11 && arg3 == var12) {
                    class324.field4020 = var11;
                    class394.field5108 = var12;
                    return true;
                }
            } else if (arg10 == -3) {
                if (class631.method3566(var12, 2, arg7, arg8, 2, arg5, arg3, (byte) -19, var11)) {
                    class324.field4020 = var11;
                    class394.field5108 = var12;
                    return true;
                }
            } else if (arg10 == -2) {
                if (arg2.method2482(-118, arg7, arg5, 2, 2, var12, arg3, var11, arg1, arg8)) {
                    class324.field4020 = var11;
                    class394.field5108 = var12;
                    return true;
                }
            } else if (arg10 == -1) {
                if (arg2.method2478(arg7, 2, (byte) 37, arg3, arg8, var11, arg5, var12, arg1)) {
                    class394.field5108 = var12;
                    class324.field4020 = var11;
                    return true;
                }
            } else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
                if (arg2.method2479(-1, arg3, arg10, var12, arg8, var11, arg9, 2)) {
                    class394.field5108 = var12;
                    class324.field4020 = var11;
                    return true;
                }
            } else if (arg2.method2474(-127, arg8, var12, arg3, arg10, arg9, var11, 2)) {
                class324.field4020 = var11;
                class394.field5108 = var12;
                return true;
            }
            int var25 = class68.field931[var21][var20] + 1;
            if (var21 > 0 && class578.field7880[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class186.field2252[var26] = var11 - 1;
                class496.field6942[var26] = var12;
                class578.field7880[var21 - 1][var20] = 2;
                var26 = var26 + 1 & 0xFFF;
                class68.field931[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class578.field7880[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class186.field2252[var26] = var11 + 1;
                class496.field6942[var26] = var12;
                class578.field7880[var21 + 1][var20] = 8;
                var26 = var26 + 1 & 0xFFF;
                class68.field931[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class578.field7880[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class186.field2252[var26] = var11;
                class496.field6942[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class578.field7880[var21][var20 - 1] = 1;
                class68.field931[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class578.field7880[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class186.field2252[var26] = var11;
                class496.field6942[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class578.field7880[var21][var20 + 1] = 4;
                class68.field931[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class578.field7880[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class186.field2252[var26] = var11 - 1;
                class496.field6942[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class578.field7880[var21 - 1][var20 - 1] = 3;
                class68.field931[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class578.field7880[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class186.field2252[var26] = var11 + 1;
                class496.field6942[var26] = var12 - 1;
                class578.field7880[var21 + 1][var20 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class68.field931[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class578.field7880[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class186.field2252[var26] = var11 - 1;
                class496.field6942[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class578.field7880[var21 - 1][var20 + 1] = 6;
                class68.field931[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class578.field7880[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class186.field2252[var26] = var11 + 1;
                class496.field6942[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class578.field7880[var21 + 1][var20 + 1] = 12;
                class68.field931[var21 + 1][var20 + 1] = var25;
            }
        }
        class324.field4020 = var11;
        class394.field5108 = var12;
        return false;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1934(int arg0) {
        field9186++;
        return arg0 == 648 ? this.field9181 : null;
    }
}
