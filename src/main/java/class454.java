import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class454 {

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public int field6833 = -1;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field6834 = 0;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field6837 = 1;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "[B")
    public static byte[] field6838 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!am", name = "l", descriptor = "Z")
    public static boolean field6839 = false;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field6831;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "Lqq;")
    public static class337 field6829;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "Lew;")
    public class346 field6832;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "[I")
    public int[] field6836;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "[Ljava/lang/String;")
    public String[] field6835;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
    public static void method2764(boolean arg0) {
        if (arg0) {
            method2767(-34, null, null);
        }
        field6829 = null;
        field6838 = null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/awt/Canvas;IILl;Ldq;)Lqa;")
    public static final class165 method2765(Canvas arg0, int arg1, int arg2, class15 arg3, class500 arg4) {
        field6831++;
        return arg1 == -128 ? new class124(arg2, arg0, arg3, arg4) : null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIIBIIILkg;)Z")
    public static final boolean method2766(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, class181 arg10) {
        field6830++;
        int var11 = arg3;
        int var12 = arg4;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = 91 / ((-arg6 - 5) / 60);
        int var16 = arg3 - var13;
        class427.field6483[var13][var14] = 99;
        int var17 = arg4 - var14;
        class478.field7080[var13][var14] = 0;
        byte var18 = 0;
        int var19 = 0;
        class56.field814[var18] = arg3;
        byte var10001 = var18;
        int var27 = var18 + 1;
        class1.field6[var10001] = arg4;
        int[][] var20 = arg10.field2451;
        while (var27 != var19) {
            var12 = class1.field6[var19];
            var11 = class56.field814[var19];
            int var21 = var12 - arg10.field2434;
            var19 = var19 + 1 & 0xFFF;
            int var22 = var11 - arg10.field2433;
            int var23 = var11 - var16;
            int var24 = var12 - var17;
            if (arg2 == -4) {
                if (arg8 == var11 && arg5 == var12) {
                    class106.field1495 = var12;
                    class118.field1621 = var11;
                    return true;
                }
            } else if (arg2 == -3) {
                if (class36.method314(var11, 1, arg9, arg8, var12, (byte) -46, 1, arg5, arg1)) {
                    class118.field1621 = var11;
                    class106.field1495 = var12;
                    return true;
                }
            } else if (arg2 == -2) {
                if (arg10.method1223(var12, arg0, arg8, 1, arg1, 0, arg5, 1, var11, arg9)) {
                    class106.field1495 = var12;
                    class118.field1621 = var11;
                    return true;
                }
            } else if (arg2 == -1) {
                if (arg10.method1225(arg0, arg1, arg8, 1, arg5, var11, var12, arg9, 20198)) {
                    class118.field1621 = var11;
                    class106.field1495 = var12;
                    return true;
                }
            } else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
                if (arg10.method1222(var12, arg7, var11, arg5, 2, 1, arg2, arg8)) {
                    class106.field1495 = var12;
                    class118.field1621 = var11;
                    return true;
                }
            } else if (arg10.method1228(arg2, var12, 1, arg5, arg7, var11, false, arg8)) {
                class118.field1621 = var11;
                class106.field1495 = var12;
                return true;
            }
            int var26 = class478.field7080[var23][var24] + 1;
            if (var23 > 0 && class427.field6483[var23 - 1][var24] == 0 && (var20[var22 - 1][var21] & 0x42240000) == 0) {
                class56.field814[var27] = var11 - 1;
                class1.field6[var27] = var12;
                class427.field6483[var23 - 1][var24] = 2;
                var27 = var27 + 1 & 0xFFF;
                class478.field7080[var23 - 1][var24] = var26;
            }
            if (var23 < 127 && class427.field6483[var23 + 1][var24] == 0 && (var20[var22 + 1][var21] & 0x60240000) == 0) {
                class56.field814[var27] = var11 + 1;
                class1.field6[var27] = var12;
                class427.field6483[var23 + 1][var24] = 8;
                var27 = var27 + 1 & 0xFFF;
                class478.field7080[var23 + 1][var24] = var26;
            }
            if (var24 > 0 && class427.field6483[var23][var24 - 1] == 0 && (var20[var22][var21 - 1] & 0x40A40000) == 0) {
                class56.field814[var27] = var11;
                class1.field6[var27] = var12 - 1;
                var27 = var27 + 1 & 0xFFF;
                class427.field6483[var23][var24 - 1] = 1;
                class478.field7080[var23][var24 - 1] = var26;
            }
            if (var24 < 127 && class427.field6483[var23][var24 + 1] == 0 && (var20[var22][var21 + 1] & 0x48240000) == 0) {
                class56.field814[var27] = var11;
                class1.field6[var27] = var12 + 1;
                class427.field6483[var23][var24 + 1] = 4;
                var27 = var27 + 1 & 0xFFF;
                class478.field7080[var23][var24 + 1] = var26;
            }
            if (var23 > 0 && var24 > 0 && class427.field6483[var23 - 1][var24 - 1] == 0 && (var20[var22 - 1][var21 - 1] & 0x43A40000) == 0 && (var20[var22 - 1][var21] & 0x42240000) == 0 && (var20[var22][var21 - 1] & 0x40A40000) == 0) {
                class56.field814[var27] = var11 - 1;
                class1.field6[var27] = var12 - 1;
                var27 = var27 + 1 & 0xFFF;
                class427.field6483[var23 - 1][var24 - 1] = 3;
                class478.field7080[var23 - 1][var24 - 1] = var26;
            }
            if (var23 < 127 && var24 > 0 && class427.field6483[var23 + 1][var24 - 1] == 0 && (var20[var22 + 1][var21 - 1] & 0x60E40000) == 0 && (var20[var22 + 1][var21] & 0x60240000) == 0 && (var20[var22][var21 - 1] & 0x40A40000) == 0) {
                class56.field814[var27] = var11 + 1;
                class1.field6[var27] = var12 - 1;
                class427.field6483[var23 + 1][var24 - 1] = 9;
                var27 = var27 + 1 & 0xFFF;
                class478.field7080[var23 + 1][var24 - 1] = var26;
            }
            if (var23 > 0 && var24 < 127 && class427.field6483[var23 - 1][var24 + 1] == 0 && (var20[var22 - 1][var21 + 1] & 0x4E240000) == 0 && (var20[var22 - 1][var21] & 0x42240000) == 0 && (var20[var22][var21 + 1] & 0x48240000) == 0) {
                class56.field814[var27] = var11 - 1;
                class1.field6[var27] = var12 + 1;
                var27 = var27 + 1 & 0xFFF;
                class427.field6483[var23 - 1][var24 + 1] = 6;
                class478.field7080[var23 - 1][var24 + 1] = var26;
            }
            if (var23 < 127 && var24 < 127 && class427.field6483[var23 + 1][var24 + 1] == 0 && (var20[var22 + 1][var21 + 1] & 0x78240000) == 0 && (var20[var22 + 1][var21] & 0x60240000) == 0 && (var20[var22][var21 + 1] & 0x48240000) == 0) {
                class56.field814[var27] = var11 + 1;
                class1.field6[var27] = var12 + 1;
                class427.field6483[var23 + 1][var24 + 1] = 12;
                var27 = var27 + 1 & 0xFFF;
                class478.field7080[var23 + 1][var24 + 1] = var26;
            }
        }
        class118.field1621 = var11;
        class106.field1495 = var12;
        return false;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILga;Lga;)V")
    public static final void method2767(int arg0, class282 arg1, class282 arg2) {
        class424.method2582(class126.field1716, -1);
        field6828++;
        class27.field387++;
        class538.field7879.method1073(326170192, arg1.field4029);
        class538.field7879.method1068(42, arg2.field4031);
        class538.field7879.method1097(-3, arg2.field4012);
        if (arg0 >= 116) {
            class538.field7879.method1114(arg1.field4031, 120);
            class538.field7879.method1073(326170192, arg2.field4029);
            class538.field7879.method1097(-3, arg1.field4012);
        }
    }
}
