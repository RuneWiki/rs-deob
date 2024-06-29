import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class491 {

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "Ljava/lang/String;")
    public String field7461;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public int field7456;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "Lia;")
    public static class399 field7457 = new class399(5000);

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "Lsk;")
    public static class423 field7463 = new class423(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)Lab;")
    public static final class455 method2950(int arg0, int arg1, int arg2) {
        class268 var3 = class321.field4830[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4063;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIILea;IIIZI)Z")
    public static final boolean method2951(int arg0, int arg1, int arg2, int arg3, int arg4, class367 arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        if (!arg9) {
            return true;
        }
        field7462++;
        int var11 = arg1;
        int var12 = arg7;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg1 - var13;
        class397.field5789[var13][var14] = 99;
        int var16 = arg7 - var14;
        class88.field1530[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class165.field2566[var17] = arg1;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class230.field3499[var10001] = arg7;
        int[][] var19 = arg5.field5398;
        while (var26 != var18) {
            var11 = class165.field2566[var18];
            var12 = class230.field3499[var18];
            int var20 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var12 - var16;
            int var22 = var11 - arg5.field5389;
            int var23 = var12 - arg5.field5384;
            if (arg4 == -4) {
                if (arg2 == var11 && arg8 == var12) {
                    class324.field4869 = var12;
                    class47.field717 = var11;
                    return true;
                }
            } else if (arg4 == -3) {
                if (class169.method1062(arg3, 21264, 2, var12, arg6, arg2, arg8, var11, 2)) {
                    class324.field4869 = var12;
                    class47.field717 = var11;
                    return true;
                }
            } else if (arg4 == -2) {
                if (arg5.method2222(arg6, var11, arg10, var12, 2, arg2, arg3, arg8, 2, 121)) {
                    class47.field717 = var11;
                    class324.field4869 = var12;
                    return true;
                }
            } else if (arg4 == -1) {
                if (arg5.method2226(var11, var12, arg2, arg6, arg10, arg3, 2, arg8, (byte) 67)) {
                    class324.field4869 = var12;
                    class47.field717 = var11;
                    return true;
                }
            } else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
                if (arg5.method2229(arg2, var11, arg8, arg0, var12, 2, arg4, 2883872)) {
                    class324.field4869 = var12;
                    class47.field717 = var11;
                    return true;
                }
            } else if (arg5.method2216(arg8, arg0, var12, var11, 2, arg4, arg2, -1)) {
                class324.field4869 = var12;
                class47.field717 = var11;
                return true;
            }
            int var25 = class88.field1530[var20][var21] + 1;
            if (var20 > 0 && class397.field5789[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class165.field2566[var26] = var11 - 1;
                class230.field3499[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class397.field5789[var20 - 1][var21] = 2;
                class88.field1530[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class397.field5789[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class165.field2566[var26] = var11 + 1;
                class230.field3499[var26] = var12;
                class397.field5789[var20 + 1][var21] = 8;
                var26 = var26 + 1 & 0xFFF;
                class88.field1530[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class397.field5789[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class165.field2566[var26] = var11;
                class230.field3499[var26] = var12 - 1;
                class397.field5789[var20][var21 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class88.field1530[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class397.field5789[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class165.field2566[var26] = var11;
                class230.field3499[var26] = var12 + 1;
                class397.field5789[var20][var21 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class88.field1530[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class397.field5789[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class165.field2566[var26] = var11 - 1;
                class230.field3499[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class397.field5789[var20 - 1][var21 - 1] = 3;
                class88.field1530[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class397.field5789[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class165.field2566[var26] = var11 + 1;
                class230.field3499[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class397.field5789[var20 + 1][var21 - 1] = 9;
                class88.field1530[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class397.field5789[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class165.field2566[var26] = var11 - 1;
                class230.field3499[var26] = var12 + 1;
                class397.field5789[var20 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class88.field1530[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class397.field5789[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class165.field2566[var26] = var11 + 1;
                class230.field3499[var26] = var12 + 1;
                class397.field5789[var20 + 1][var21 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class88.field1530[var20 + 1][var21 + 1] = var25;
            }
        }
        class324.field4869 = var12;
        class47.field717 = var11;
        return false;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V")
    public static void method2952(boolean arg0) {
        if (arg0) {
            method2952(false);
        }
        field7457 = null;
        field7463 = null;
    }

    @OriginalMember(owner = "client!cm", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7460++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class491(String arg0, int arg1) {
        this.field7461 = arg0;
        this.field7456 = arg1;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V")
    public static final void method2953(byte arg0) {
        field7459++;
        if (arg0 != -80) {
            method2953((byte) -47);
        }
        if (class490.field7451 == 5) {
            class490.field7451 = 6;
        }
    }
}
