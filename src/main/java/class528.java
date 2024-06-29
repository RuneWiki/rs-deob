import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class528 extends class383 {

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public int field7788;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public int field7790;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "[I")
    public static int[] field7786 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field7791 = 0;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "[F")
    public static float[] field7789 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field7784;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "Lkq;")
    public static class421 field7785;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field7787;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 7)
    public static void method3136(int arg0) {
        if (arg0 != -5434) {
            field7791 = 41;
        }
        field7789 = null;
        field7785 = null;
        field7786 = null;
        field7787 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lis;IIIIIIIIII)Z", line = 30)
    public static final boolean method3137(class348 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field7784++;
        int var11 = arg7;
        int var12 = arg5;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg7 - var13;
        class203.field2644[var13][var14] = 99;
        int var16 = arg5 - var14;
        class315.field4018[var13][var14] = 0;
        if (arg10 < 126) {
            field7786 = null;
        }
        byte var17 = 0;
        int var18 = 0;
        class448.field6412[var17] = arg7;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class85.field1069[var10001] = arg5;
        int[][] var19 = arg0.field4465;
        while (var26 != var18) {
            var11 = class448.field6412[var18];
            var12 = class85.field1069[var18];
            int var20 = var12 - arg0.field4464;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var11 - arg0.field4478;
            int var22 = var12 - var16;
            int var23 = var11 - var15;
            if (arg6 == -4) {
                if (arg3 == var11 && arg1 == var12) {
                    class391.field5262 = var12;
                    class531.field7812 = var11;
                    return true;
                }
            } else if (arg6 == -3) {
                if (class265.method1573(1, var12, (byte) 68, var11, arg4, arg1, arg2, 1, arg3)) {
                    class391.field5262 = var12;
                    class531.field7812 = var11;
                    return true;
                }
            } else if (arg6 == -2) {
                if (arg0.method1994(arg2, (byte) 81, var12, 1, arg4, arg3, arg1, arg8, 1, var11)) {
                    class531.field7812 = var11;
                    class391.field5262 = var12;
                    return true;
                }
            } else if (arg6 == -1) {
                if (arg0.method1997(var11, 1, 1, arg8, arg4, arg2, var12, arg3, arg1)) {
                    class391.field5262 = var12;
                    class531.field7812 = var11;
                    return true;
                }
            } else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
                if (arg0.method2001(arg3, arg9, arg1, arg6, var12, -1, 1, var11)) {
                    class391.field5262 = var12;
                    class531.field7812 = var11;
                    return true;
                }
            } else if (arg0.method1987(1, var12, var11, arg3, arg9, arg6, -4, arg1)) {
                class531.field7812 = var11;
                class391.field5262 = var12;
                return true;
            }
            int var25 = class315.field4018[var23][var22] + 1;
            if (var23 > 0 && class203.field2644[var23 - 1][var22] == 0 && (var19[var21 - 1][var20] & 0x42240000) == 0) {
                class448.field6412[var26] = var11 - 1;
                class85.field1069[var26] = var12;
                class203.field2644[var23 - 1][var22] = 2;
                var26 = var26 + 1 & 0xFFF;
                class315.field4018[var23 - 1][var22] = var25;
            }
            if (var23 < 127 && class203.field2644[var23 + 1][var22] == 0 && (var19[var21 + 1][var20] & 0x60240000) == 0) {
                class448.field6412[var26] = var11 + 1;
                class85.field1069[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class203.field2644[var23 + 1][var22] = 8;
                class315.field4018[var23 + 1][var22] = var25;
            }
            if (var22 > 0 && class203.field2644[var23][var22 - 1] == 0 && (var19[var21][var20 - 1] & 0x40A40000) == 0) {
                class448.field6412[var26] = var11;
                class85.field1069[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class203.field2644[var23][var22 - 1] = 1;
                class315.field4018[var23][var22 - 1] = var25;
            }
            if (var22 < 127 && class203.field2644[var23][var22 + 1] == 0 && (var19[var21][var20 + 1] & 0x48240000) == 0) {
                class448.field6412[var26] = var11;
                class85.field1069[var26] = var12 + 1;
                class203.field2644[var23][var22 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class315.field4018[var23][var22 + 1] = var25;
            }
            if (var23 > 0 && var22 > 0 && class203.field2644[var23 - 1][var22 - 1] == 0 && (var19[var21 - 1][var20 - 1] & 0x43A40000) == 0 && (var19[var21 - 1][var20] & 0x42240000) == 0 && (var19[var21][var20 - 1] & 0x40A40000) == 0) {
                class448.field6412[var26] = var11 - 1;
                class85.field1069[var26] = var12 - 1;
                class203.field2644[var23 - 1][var22 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class315.field4018[var23 - 1][var22 - 1] = var25;
            }
            if (var23 < 127 && var22 > 0 && class203.field2644[var23 + 1][var22 - 1] == 0 && (var19[var21 + 1][var20 - 1] & 0x60E40000) == 0 && (var19[var21 + 1][var20] & 0x60240000) == 0 && (var19[var21][var20 - 1] & 0x40A40000) == 0) {
                class448.field6412[var26] = var11 + 1;
                class85.field1069[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class203.field2644[var23 + 1][var22 - 1] = 9;
                class315.field4018[var23 + 1][var22 - 1] = var25;
            }
            if (var23 > 0 && var22 < 127 && class203.field2644[var23 - 1][var22 + 1] == 0 && (var19[var21 - 1][var20 + 1] & 0x4E240000) == 0 && (var19[var21 - 1][var20] & 0x42240000) == 0 && (var19[var21][var20 + 1] & 0x48240000) == 0) {
                class448.field6412[var26] = var11 - 1;
                class85.field1069[var26] = var12 + 1;
                class203.field2644[var23 - 1][var22 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class315.field4018[var23 - 1][var22 + 1] = var25;
            }
            if (var23 < 127 && var22 < 127 && class203.field2644[var23 + 1][var22 + 1] == 0 && (var19[var21 + 1][var20 + 1] & 0x78240000) == 0 && (var19[var21 + 1][var20] & 0x60240000) == 0 && (var19[var21][var20 + 1] & 0x48240000) == 0) {
                class448.field6412[var26] = var11 + 1;
                class85.field1069[var26] = var12 + 1;
                class203.field2644[var23 + 1][var22 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class315.field4018[var23 + 1][var22 + 1] = var25;
            }
        }
        class391.field5262 = var12;
        class531.field7812 = var11;
        return false;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(II)V", line = 276)
    public class528(int arg0, int arg1) {
        this.field7788 = arg0;
        this.field7790 = arg1;
    }
}
