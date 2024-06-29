import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class405 extends class7 {

    @OriginalMember(owner = "client!ar", name = "w", descriptor = "Lle;")
    public class166 field6026;

    @OriginalMember(owner = "client!ar", name = "v", descriptor = "Ljava/lang/String;")
    public static String field6025 = "flash2:";

    @OriginalMember(owner = "client!ar", name = "B", descriptor = "[I")
    public static int[] field6031 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ar", name = "y", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!ar", name = "A", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!ar", name = "x", descriptor = "[Lgl;")
    public static class356[] field6027;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IILne;I)V", line = 13)
    public static final void method2540(int arg0, int arg1, class172 arg2, int arg3) {
        class422.field6247 = arg0;
        field6028++;
        class314.field4933 = arg1;
        class61.field792 = arg2;
        if (arg3 != -1) {
            method2540(47, 103, (class172) null, -39);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)I", line = 28)
    public static final int method2541(int arg0, int arg1) {
        if (arg0 != 127) {
            method2542(-35, -103, -45, 88, 5, 56, -56, (class72) null, 19, -92, -38);
        }
        field6029++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIIIIILfn;III)Z", line = 41)
    public static final boolean method2542(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class72 arg7, int arg8, int arg9, int arg10) {
        int var11 = 113 / ((arg2 - 28) / 60);
        field6030++;
        int var12 = arg8;
        int var13 = arg4;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg8 - var14;
        int var17 = arg4 - var15;
        class74.field939[var14][var15] = 99;
        class238.field3973[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class303.field4790[var18] = arg8;
        byte var10001 = var18;
        int var27 = var18 + 1;
        class354.field5453[var10001] = arg4;
        int[][] var20 = arg7.field889;
        while (var27 != var19) {
            var12 = class303.field4790[var19];
            var13 = class354.field5453[var19];
            int var21 = var13 - var17;
            int var22 = var12 - arg7.field896;
            int var23 = var13 - arg7.field911;
            int var24 = var12 - var16;
            var19 = var19 + 1 & 0xFFF;
            if (arg9 == -4) {
                if (arg10 == var12 && arg1 == var13) {
                    class134.field2111 = var13;
                    class193.field3142 = var12;
                    return true;
                }
            } else if (arg9 == -3) {
                if (class62.method407(1, 1, true, var13, arg1, var12, arg3, arg5, arg10)) {
                    class193.field3142 = var12;
                    class134.field2111 = var13;
                    return true;
                }
            } else if (arg9 == -2) {
                if (arg7.method455(arg6, arg5, arg3, arg1, var12, 1, arg10, var13, 28303, 1)) {
                    class134.field2111 = var13;
                    class193.field3142 = var12;
                    return true;
                }
            } else if (arg9 == -1) {
                if (arg7.method457(var12, arg5, 1, arg6, var13, 67, arg1, arg10, arg3)) {
                    class193.field3142 = var12;
                    class134.field2111 = var13;
                    return true;
                }
            } else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
                if (arg7.method462(arg9, var13, 1, arg0, arg10, var12, arg1, 30)) {
                    class134.field2111 = var13;
                    class193.field3142 = var12;
                    return true;
                }
            } else if (arg7.method463(arg10, 1, arg9, (byte) -128, arg0, var12, var13, arg1)) {
                class134.field2111 = var13;
                class193.field3142 = var12;
                return true;
            }
            int var26 = class238.field3973[var24][var21] + 1;
            if (var24 > 0 && class74.field939[var24 - 1][var21] == 0 && (var20[var22 - 1][var23] & 0x42240000) == 0) {
                class303.field4790[var27] = var12 - 1;
                class354.field5453[var27] = var13;
                var27 = var27 + 1 & 0xFFF;
                class74.field939[var24 - 1][var21] = 2;
                class238.field3973[var24 - 1][var21] = var26;
            }
            if (var24 < 127 && class74.field939[var24 + 1][var21] == 0 && (var20[var22 + 1][var23] & 0x60240000) == 0) {
                class303.field4790[var27] = var12 + 1;
                class354.field5453[var27] = var13;
                class74.field939[var24 + 1][var21] = 8;
                var27 = var27 + 1 & 0xFFF;
                class238.field3973[var24 + 1][var21] = var26;
            }
            if (var21 > 0 && class74.field939[var24][var21 - 1] == 0 && (var20[var22][var23 - 1] & 0x40A40000) == 0) {
                class303.field4790[var27] = var12;
                class354.field5453[var27] = var13 - 1;
                var27 = var27 + 1 & 0xFFF;
                class74.field939[var24][var21 - 1] = 1;
                class238.field3973[var24][var21 - 1] = var26;
            }
            if (var21 < 127 && class74.field939[var24][var21 + 1] == 0 && (var20[var22][var23 + 1] & 0x48240000) == 0) {
                class303.field4790[var27] = var12;
                class354.field5453[var27] = var13 + 1;
                var27 = var27 + 1 & 0xFFF;
                class74.field939[var24][var21 + 1] = 4;
                class238.field3973[var24][var21 + 1] = var26;
            }
            if (var24 > 0 && var21 > 0 && class74.field939[var24 - 1][var21 - 1] == 0 && (var20[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var20[var22 - 1][var23] & 0x42240000) == 0 && (var20[var22][var23 - 1] & 0x40A40000) == 0) {
                class303.field4790[var27] = var12 - 1;
                class354.field5453[var27] = var13 - 1;
                var27 = var27 + 1 & 0xFFF;
                class74.field939[var24 - 1][var21 - 1] = 3;
                class238.field3973[var24 - 1][var21 - 1] = var26;
            }
            if (var24 < 127 && var21 > 0 && class74.field939[var24 + 1][var21 - 1] == 0 && (var20[var22 + 1][var23 - 1] & 0x60E40000) == 0 && (var20[var22 + 1][var23] & 0x60240000) == 0 && (var20[var22][var23 - 1] & 0x40A40000) == 0) {
                class303.field4790[var27] = var12 + 1;
                class354.field5453[var27] = var13 - 1;
                class74.field939[var24 + 1][var21 - 1] = 9;
                var27 = var27 + 1 & 0xFFF;
                class238.field3973[var24 + 1][var21 - 1] = var26;
            }
            if (var24 > 0 && var21 < 127 && class74.field939[var24 - 1][var21 + 1] == 0 && (var20[var22 - 1][var23 + 1] & 0x4E240000) == 0 && (var20[var22 - 1][var23] & 0x42240000) == 0 && (var20[var22][var23 + 1] & 0x48240000) == 0) {
                class303.field4790[var27] = var12 - 1;
                class354.field5453[var27] = var13 + 1;
                var27 = var27 + 1 & 0xFFF;
                class74.field939[var24 - 1][var21 + 1] = 6;
                class238.field3973[var24 - 1][var21 + 1] = var26;
            }
            if (var24 < 127 && var21 < 127 && class74.field939[var24 + 1][var21 + 1] == 0 && (var20[var22 + 1][var23 + 1] & 0x78240000) == 0 && (var20[var22 + 1][var23] & 0x60240000) == 0 && (var20[var22][var23 + 1] & 0x48240000) == 0) {
                class303.field4790[var27] = var12 + 1;
                class354.field5453[var27] = var13 + 1;
                class74.field939[var24 + 1][var21 + 1] = 12;
                var27 = var27 + 1 & 0xFFF;
                class238.field3973[var24 + 1][var21 + 1] = var26;
            }
        }
        class134.field2111 = var13;
        class193.field3142 = var12;
        return false;
    }

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(B)V", line = 290)
    public static void method2543(byte arg0) {
        field6025 = null;
        if (arg0 < 32) {
            field6027 = null;
        }
        field6031 = null;
        field6027 = null;
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lle;)V", line = 304)
    public class405(class166 arg0) {
        this.field6026 = arg0;
    }
}
