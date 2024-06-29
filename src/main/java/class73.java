import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class73 {

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "Lmv;")
    private class295 field1151;

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
    public int field1154;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "Lvg;")
    public static class622 field1149 = new class622(54, 7);

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "Liga;")
    public static class78 field1150 = new class78(0, -1);

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "[I")
    public static int[] field1156 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "S")
    public static short field1153 = 320;

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "Lau;")
    public static class692 field1152 = new class692(128, 4);

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V", line = 8)
    public static void method425(int arg0) {
        field1156 = null;
        field1150 = null;
        if (arg0 != 1109655552) {
            field1156 = null;
        }
        field1149 = null;
        field1152 = null;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIIILwg;IIIIII)Z", line = 29)
    public static final boolean method426(int arg0, int arg1, int arg2, int arg3, class516 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1155++;
        int var11 = arg3;
        int var12 = arg8;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg3 - var13;
        class369.field5475[var13][var14] = 99;
        int var16 = arg8 - var14;
        class263.field3413[var13][var14] = 0;
        byte var17 = 0;
        class618.field8964[var17] = arg3;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class390.field5889[var10001] = arg8;
        int[][] var19 = arg4.field7243;
        if (arg9 >= -13) {
            method425(105);
        }
        while (var26 != var18) {
            var11 = class618.field8964[var18];
            var12 = class390.field5889[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var12 - arg4.field7247;
            int var21 = var11 - arg4.field7242;
            int var22 = var11 - var15;
            int var23 = var12 - var16;
            if (arg2 == -4) {
                if (arg1 == var11 && arg5 == var12) {
                    class264.field3452 = var12;
                    class597.field8645 = var11;
                    return true;
                }
            } else if (arg2 == -3) {
                if (class408.method2506(var11, 1, 1, arg5, arg6, 4005, arg1, var12, arg7)) {
                    class264.field3452 = var12;
                    class597.field8645 = var11;
                    return true;
                }
            } else if (arg2 == -2) {
                if (arg4.method2914(1, var11, arg1, var12, arg7, arg6, arg5, 1, (byte) 30, arg0)) {
                    class264.field3452 = var12;
                    class597.field8645 = var11;
                    return true;
                }
            } else if (arg2 == -1) {
                if (arg4.method2915(arg0, var11, arg1, arg7, (byte) 46, arg5, 1, arg6, var12)) {
                    class597.field8645 = var11;
                    class264.field3452 = var12;
                    return true;
                }
            } else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
                if (arg4.method2909(1, arg10, arg1, var12, -1, arg2, arg5, var11)) {
                    class597.field8645 = var11;
                    class264.field3452 = var12;
                    return true;
                }
            } else if (arg4.method2913(var12, var11, arg10, arg5, -4, arg1, arg2, 1)) {
                class597.field8645 = var11;
                class264.field3452 = var12;
                return true;
            }
            int var25 = class263.field3413[var22][var23] + 1;
            if (var22 > 0 && class369.field5475[var22 - 1][var23] == 0 && (var19[var21 - 1][var20] & 0x42240000) == 0) {
                class618.field8964[var26] = var11 - 1;
                class390.field5889[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class369.field5475[var22 - 1][var23] = 2;
                class263.field3413[var22 - 1][var23] = var25;
            }
            if (var22 < 127 && class369.field5475[var22 + 1][var23] == 0 && (var19[var21 + 1][var20] & 0x60240000) == 0) {
                class618.field8964[var26] = var11 + 1;
                class390.field5889[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class369.field5475[var22 + 1][var23] = 8;
                class263.field3413[var22 + 1][var23] = var25;
            }
            if (var23 > 0 && class369.field5475[var22][var23 - 1] == 0 && (var19[var21][var20 - 1] & 0x40A40000) == 0) {
                class618.field8964[var26] = var11;
                class390.field5889[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class369.field5475[var22][var23 - 1] = 1;
                class263.field3413[var22][var23 - 1] = var25;
            }
            if (var23 < 127 && class369.field5475[var22][var23 + 1] == 0 && (var19[var21][var20 + 1] & 0x48240000) == 0) {
                class618.field8964[var26] = var11;
                class390.field5889[var26] = var12 + 1;
                class369.field5475[var22][var23 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class263.field3413[var22][var23 + 1] = var25;
            }
            if (var22 > 0 && var23 > 0 && class369.field5475[var22 - 1][var23 - 1] == 0 && (var19[var21 - 1][var20 - 1] & 0x43A40000) == 0 && (var19[var21 - 1][var20] & 0x42240000) == 0 && (var19[var21][var20 - 1] & 0x40A40000) == 0) {
                class618.field8964[var26] = var11 - 1;
                class390.field5889[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class369.field5475[var22 - 1][var23 - 1] = 3;
                class263.field3413[var22 - 1][var23 - 1] = var25;
            }
            if (var22 < 127 && var23 > 0 && class369.field5475[var22 + 1][var23 - 1] == 0 && (var19[var21 + 1][var20 - 1] & 0x60E40000) == 0 && (var19[var21 + 1][var20] & 0x60240000) == 0 && (var19[var21][var20 - 1] & 0x40A40000) == 0) {
                class618.field8964[var26] = var11 + 1;
                class390.field5889[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class369.field5475[var22 + 1][var23 - 1] = 9;
                class263.field3413[var22 + 1][var23 - 1] = var25;
            }
            if (var22 > 0 && var23 < 127 && class369.field5475[var22 - 1][var23 + 1] == 0 && (var19[var21 - 1][var20 + 1] & 0x4E240000) == 0 && (var19[var21 - 1][var20] & 0x42240000) == 0 && (var19[var21][var20 + 1] & 0x48240000) == 0) {
                class618.field8964[var26] = var11 - 1;
                class390.field5889[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class369.field5475[var22 - 1][var23 + 1] = 6;
                class263.field3413[var22 - 1][var23 + 1] = var25;
            }
            if (var22 < 127 && var23 < 127 && class369.field5475[var22 + 1][var23 + 1] == 0 && (var19[var21 + 1][var20 + 1] & 0x78240000) == 0 && (var19[var21 + 1][var20] & 0x60240000) == 0 && (var19[var21][var20 + 1] & 0x48240000) == 0) {
                class618.field8964[var26] = var11 + 1;
                class390.field5889[var26] = var12 + 1;
                class369.field5475[var22 + 1][var23 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class263.field3413[var22 + 1][var23 + 1] = var25;
            }
        }
        class597.field8645 = var11;
        class264.field3452 = var12;
        return false;
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lsea;ILmv;)V", line = 290)
    public class73(class373 arg0, int arg1, class295 arg2) {
        new class692(64);
        this.field1151 = arg2;
        this.field1154 = this.field1151.method1845(15, true);
    }
}
