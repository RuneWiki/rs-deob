import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class303 extends class183 {

    @OriginalMember(owner = "client!ti", name = "H", descriptor = "Ljava/lang/Object;")
    private Object field4000;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "[Ldr;")
    public static class504[] field3996 = new class504[14];

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!ti", name = "F", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!ti", name = "G", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(B)Ljava/lang/Object;", line = 6)
    public final Object method1200(byte arg0) {
        field3998++;
        if (arg0 != 57) {
            field3996 = null;
        }
        return this.field4000;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)Z", line = 17)
    public final boolean method1199(int arg0) {
        field3997++;
        if (arg0 != 21800) {
            field3996 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 28)
    public class303(Object arg0, int arg1) {
        super(arg1);
        this.field4000 = arg0;
    }

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)V", line = 36)
    public static void method1761(int arg0) {
        if (arg0 != 4095) {
            method1762(-86, -8, 32, 107, 94, -128, -83, (byte) -66, 81, -112, null);
        }
        field3996 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIIIBIILcl;)Z", line = 52)
    public static final boolean method1762(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, class173 arg10) {
        field3999++;
        int var11 = -93 % ((42 - arg7) / 38);
        int var12 = arg0;
        int var13 = arg8;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg0 - var14;
        int var17 = arg8 - var15;
        class430.field5885[var14][var15] = 99;
        class494.field6867[var14][var15] = 0;
        byte var18 = 0;
        class153.field2210[var18] = arg0;
        int var19 = 0;
        byte var10001 = var18;
        int var27 = var18 + 1;
        class71.field1066[var10001] = arg8;
        int[][] var20 = arg10.field2519;
        while (var27 != var19) {
            var13 = class71.field1066[var19];
            var12 = class153.field2210[var19];
            int var21 = var13 - var17;
            int var22 = var12 - var16;
            var19 = var19 + 1 & 0xFFF;
            int var23 = var12 - arg10.field2512;
            int var24 = var13 - arg10.field2522;
            if (arg4 == -4) {
                if (arg9 == var12 && arg3 == var13) {
                    class212.field2888 = var13;
                    class296.field3878 = var12;
                    return true;
                }
            } else if (arg4 == -3) {
                if (class201.method1289(2, arg5, true, arg1, arg9, arg3, 2, var12, var13)) {
                    class212.field2888 = var13;
                    class296.field3878 = var12;
                    return true;
                }
            } else if (arg4 == -2) {
                if (arg10.method1151(2, arg9, arg1, arg5, arg2, var12, var13, arg3, -65537, 2)) {
                    class296.field3878 = var12;
                    class212.field2888 = var13;
                    return true;
                }
            } else if (arg4 == -1) {
                if (arg10.method1152(-96, var12, arg1, arg2, var13, 2, arg9, arg5, arg3)) {
                    class296.field3878 = var12;
                    class212.field2888 = var13;
                    return true;
                }
            } else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
                if (arg10.method1154(arg9, var12, arg3, arg4, (byte) 74, var13, 2, arg6)) {
                    class212.field2888 = var13;
                    class296.field3878 = var12;
                    return true;
                }
            } else if (arg10.method1150(var12, arg3, var13, arg4, 2, arg9, -24128, arg6)) {
                class296.field3878 = var12;
                class212.field2888 = var13;
                return true;
            }
            int var26 = class494.field6867[var22][var21] + 1;
            if (var22 > 0 && class430.field5885[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + 1] & 0x4E240000) == 0) {
                class153.field2210[var27] = var12 - 1;
                class71.field1066[var27] = var13;
                var27 = var27 + 1 & 0xFFF;
                class430.field5885[var22 - 1][var21] = 2;
                class494.field6867[var22 - 1][var21] = var26;
            }
            if (var22 < 126 && class430.field5885[var22 + 1][var21] == 0 && (var20[var23 + 2][var24] & 0x60E40000) == 0 && (var20[var23 + 2][var24 + 1] & 0x78240000) == 0) {
                class153.field2210[var27] = var12 + 1;
                class71.field1066[var27] = var13;
                class430.field5885[var22 + 1][var21] = 8;
                var27 = var27 + 1 & 0xFFF;
                class494.field6867[var22 + 1][var21] = var26;
            }
            if (var21 > 0 && class430.field5885[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + 1][var24 - 1] & 0x60E40000) == 0) {
                class153.field2210[var27] = var12;
                class71.field1066[var27] = var13 - 1;
                var27 = var27 + 1 & 0xFFF;
                class430.field5885[var22][var21 - 1] = 1;
                class494.field6867[var22][var21 - 1] = var26;
            }
            if (var21 < 126 && class430.field5885[var22][var21 + 1] == 0 && (var20[var23][var24 + 2] & 0x4E240000) == 0 && (var20[var23 + 1][var24 + 2] & 0x78240000) == 0) {
                class153.field2210[var27] = var12;
                class71.field1066[var27] = var13 + 1;
                var27 = var27 + 1 & 0xFFF;
                class430.field5885[var22][var21 + 1] = 4;
                class494.field6867[var22][var21 + 1] = var26;
            }
            if (var22 > 0 && var21 > 0 && class430.field5885[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24] & 0x4FA40000) == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0 && (var20[var23][var24 - 1] & 0x63E40000) == 0) {
                class153.field2210[var27] = var12 - 1;
                class71.field1066[var27] = var13 - 1;
                class430.field5885[var22 - 1][var21 - 1] = 3;
                var27 = var27 + 1 & 0xFFF;
                class494.field6867[var22 - 1][var21 - 1] = var26;
            }
            if (var22 < 126 && var21 > 0 && class430.field5885[var22 + 1][var21 - 1] == 0 && (var20[var23 + 1][var24 - 1] & 0x63E40000) == 0 && (var20[var23 + 2][var24 - 1] & 0x60E40000) == 0 && (var20[var23 + 2][var24] & 0x78E40000) == 0) {
                class153.field2210[var27] = var12 + 1;
                class71.field1066[var27] = var13 - 1;
                var27 = var27 + 1 & 0xFFF;
                class430.field5885[var22 + 1][var21 - 1] = 9;
                class494.field6867[var22 + 1][var21 - 1] = var26;
            }
            if (var22 > 0 && var21 < 126 && class430.field5885[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][var24 + 1] & 0x4FA40000) == 0 && (var20[var23 - 1][var24 + 2] & 0x4E240000) == 0 && (var20[var23][var24 + 2] & 0x7E240000) == 0) {
                class153.field2210[var27] = var12 - 1;
                class71.field1066[var27] = var13 + 1;
                class430.field5885[var22 - 1][var21 + 1] = 6;
                var27 = var27 + 1 & 0xFFF;
                class494.field6867[var22 - 1][var21 + 1] = var26;
            }
            if (var22 < 126 && var21 < 126 && class430.field5885[var22 + 1][var21 + 1] == 0 && (var20[var23 + 1][var24 + 2] & 0x7E240000) == 0 && (var20[var23 + 2][var24 + 2] & 0x78240000) == 0 && (var20[var23 + 2][var24 + 1] & 0x78E40000) == 0) {
                class153.field2210[var27] = var12 + 1;
                class71.field1066[var27] = var13 + 1;
                var27 = var27 + 1 & 0xFFF;
                class430.field5885[var22 + 1][var21 + 1] = 12;
                class494.field6867[var22 + 1][var21 + 1] = var26;
            }
        }
        class212.field2888 = var13;
        class296.field3878 = var12;
        return false;
    }
}
