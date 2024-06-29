import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class421 extends class26 {

    @OriginalMember(owner = "client!hea", name = "E", descriptor = "Ljava/lang/Object;")
    private Object field5912;

    @OriginalMember(owner = "client!hea", name = "A", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!hea", name = "D", descriptor = "I")
    public static int field5911;

    @OriginalMember(owner = "client!hea", name = "F", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!hea", name = "G", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!hea", name = "H", descriptor = "Z")
    public static boolean field5915;

    @OriginalMember(owner = "client!hea", name = "I", descriptor = "[[[Lmf;")
    public static class416[][][] field5916;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(II)V")
    public static final void method2576(int arg0, int arg1) {
        if (arg0 < 11) {
            field5915 = false;
        }
        field5911++;
        class354 var2 = class501.method3012(arg1, 14, 2145997216);
        var2.method2216(0);
    }

    @OriginalMember(owner = "client!hea", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public final Object method194(int arg0) {
        if (arg0 != -3640) {
            this.method192((byte) 93);
        }
        field5910++;
        return this.field5912;
    }

    @OriginalMember(owner = "client!hea", name = "i", descriptor = "(I)V")
    public static void method2577(int arg0) {
        if (arg0 != 0) {
            method2577(54);
        }
        field5916 = null;
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(B)Z")
    public final boolean method192(byte arg0) {
        if (arg0 != 17) {
            this.method192((byte) 109);
        }
        field5913++;
        return false;
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lrf;Ljava/lang/Object;I)V")
    public class421(class83 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field5912 = arg1;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIIILjn;IBIII)Z")
    public static final boolean method2578(int arg0, int arg1, int arg2, int arg3, int arg4, class716 arg5, int arg6, byte arg7, int arg8, int arg9, int arg10) {
        field5914++;
        int var11 = arg8;
        int var12 = arg1;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg8 - var13;
        int var16 = arg1 - var14;
        class73.field1288[var13][var14] = 99;
        class668.field9364[var13][var14] = 0;
        byte var17 = 0;
        class541.field7609[var17] = arg8;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class667.field9346[var10001] = arg1;
        int[][] var19 = arg5.field9991;
        while (var26 != var18) {
            var11 = class541.field7609[var18];
            var12 = class667.field9346[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var11 - var15;
            int var21 = var12 - arg5.field10004;
            int var22 = var12 - var16;
            int var23 = var11 - arg5.field9992;
            if (arg10 == -4) {
                if (arg3 == var11 && arg4 == var12) {
                    class40.field591 = var12;
                    class33.field437 = var11;
                    return true;
                }
            } else if (arg10 == -3) {
                if (class78.method779(arg6, arg7 + 1296, arg9, var12, 1, var11, arg3, 1, arg4)) {
                    class40.field591 = var12;
                    class33.field437 = var11;
                    return true;
                }
            } else if (arg10 == -2) {
                if (arg5.method3990((byte) 68, arg4, arg6, var12, 1, var11, arg3, arg9, 1, arg2)) {
                    class40.field591 = var12;
                    class33.field437 = var11;
                    return true;
                }
            } else if (arg10 == -1) {
                if (arg5.method3984(var11, var12, arg2, 1, arg3, (byte) 89, arg6, arg4, arg9)) {
                    class33.field437 = var11;
                    class40.field591 = var12;
                    return true;
                }
            } else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
                if (arg5.method3998(arg4, var12, arg10, arg0, 1, arg3, 1, var11)) {
                    class33.field437 = var11;
                    class40.field591 = var12;
                    return true;
                }
            } else if (arg5.method3991(1, arg4, arg0, (byte) 104, var11, arg10, arg3, var12)) {
                class33.field437 = var11;
                class40.field591 = var12;
                return true;
            }
            int var25 = class668.field9364[var20][var22] + 1;
            if (var20 > 0 && class73.field1288[var20 - 1][var22] == 0 && (var19[var23 - 1][var21] & 0x42240000) == 0) {
                class541.field7609[var26] = var11 - 1;
                class667.field9346[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class73.field1288[var20 - 1][var22] = 2;
                class668.field9364[var20 - 1][var22] = var25;
            }
            if (var20 < 127 && class73.field1288[var20 + 1][var22] == 0 && (var19[var23 + 1][var21] & 0x60240000) == 0) {
                class541.field7609[var26] = var11 + 1;
                class667.field9346[var26] = var12;
                class73.field1288[var20 + 1][var22] = 8;
                var26 = var26 + 1 & 0xFFF;
                class668.field9364[var20 + 1][var22] = var25;
            }
            if (var22 > 0 && class73.field1288[var20][var22 - 1] == 0 && (var19[var23][var21 - 1] & 0x40A40000) == 0) {
                class541.field7609[var26] = var11;
                class667.field9346[var26] = var12 - 1;
                class73.field1288[var20][var22 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class668.field9364[var20][var22 - 1] = var25;
            }
            if (var22 < 127 && class73.field1288[var20][var22 + 1] == 0 && (var19[var23][var21 + 1] & 0x48240000) == 0) {
                class541.field7609[var26] = var11;
                class667.field9346[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class73.field1288[var20][var22 + 1] = 4;
                class668.field9364[var20][var22 + 1] = var25;
            }
            if (var20 > 0 && var22 > 0 && class73.field1288[var20 - 1][var22 - 1] == 0 && (var19[var23 - 1][var21 - 1] & 0x43A40000) == 0 && (var19[var23 - 1][var21] & 0x42240000) == 0 && (var19[var23][var21 - 1] & 0x40A40000) == 0) {
                class541.field7609[var26] = var11 - 1;
                class667.field9346[var26] = var12 - 1;
                class73.field1288[var20 - 1][var22 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class668.field9364[var20 - 1][var22 - 1] = var25;
            }
            if (var20 < 127 && var22 > 0 && class73.field1288[var20 + 1][var22 - 1] == 0 && (var19[var23 + 1][var21 - 1] & 0x60E40000) == 0 && (var19[var23 + 1][var21] & 0x60240000) == 0 && (var19[var23][var21 - 1] & 0x40A40000) == 0) {
                class541.field7609[var26] = var11 + 1;
                class667.field9346[var26] = var12 - 1;
                class73.field1288[var20 + 1][var22 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class668.field9364[var20 + 1][var22 - 1] = var25;
            }
            if (var20 > 0 && var22 < 127 && class73.field1288[var20 - 1][var22 + 1] == 0 && (var19[var23 - 1][var21 + 1] & 0x4E240000) == 0 && (var19[var23 - 1][var21] & 0x42240000) == 0 && (var19[var23][var21 + 1] & 0x48240000) == 0) {
                class541.field7609[var26] = var11 - 1;
                class667.field9346[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class73.field1288[var20 - 1][var22 + 1] = 6;
                class668.field9364[var20 - 1][var22 + 1] = var25;
            }
            if (var20 < 127 && var22 < 127 && class73.field1288[var20 + 1][var22 + 1] == 0 && (var19[var23 + 1][var21 + 1] & 0x78240000) == 0 && (var19[var23 + 1][var21] & 0x60240000) == 0 && (var19[var23][var21 + 1] & 0x48240000) == 0) {
                class541.field7609[var26] = var11 + 1;
                class667.field9346[var26] = var12 + 1;
                class73.field1288[var20 + 1][var22 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class668.field9364[var20 + 1][var22 + 1] = var25;
            }
        }
        if (arg7 == -21) {
            class40.field591 = var12;
            class33.field437 = var11;
            return false;
        } else {
            return false;
        }
    }
}
