import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class200 extends class208 {

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    private int field2908;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
    private int field2912;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    private int field2905;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    private int field2910;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "Lhi;")
    public static class45 field2909 = new class45(24, -1);

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "Lla;")
    public static class306 field2913;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)V")
    public final void method818(int arg0, int arg1, int arg2) {
        if (arg2 != 32627) {
            field2909 = null;
        }
        ++field2904;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(III)V")
    public final void method820(int arg0, int arg1, int arg2) {
        ++field2906;
        int var4 = this.field2908 * arg0 >> 12;
        int var5 = this.field2905 * arg0 >> 12;
        int var6 = this.field2912 * arg1 >> 12;
        int var7 = this.field2910 * arg1 >> 12;
        class423.method2526(var5, (byte) -118, var6, super.field2972, var7, var4);
        if (arg2 != 31431) {
            field2913 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
    public static void method1302(byte arg0) {
        field2913 = null;
        field2909 = null;
        int var1 = -17 % ((arg0 - 43) / 44);
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(IIIIII)V")
    public class200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2908 = arg0;
        this.field2912 = arg1;
        this.field2905 = arg2;
        this.field2910 = arg3;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Let;IIBIIIIIII)Z")
    public static final boolean method1303(class466 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field2911;
        int var11 = arg2;
        int var12 = arg4;
        byte var13 = 64;
        byte var14 = 64;
        if (arg3 != 82) {
            field2913 = null;
        }
        int var15 = -var13 + arg2;
        class338.field4911[var13][var14] = 99;
        int var16 = -var14 + arg4;
        class75.field1059[var13][var14] = 0;
        byte var17 = 0;
        class126.field1966[var17] = arg2;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class3.field37[var10001] = arg4;
        int[][] var19 = arg0.field6737;
        while (var26 != var18) {
            var11 = class126.field1966[var18];
            var12 = class3.field37[var18];
            int var20 = -var15 + var11;
            int var21 = -var16 + var12;
            var18 = 4095 & var18 + 1;
            int var22 = -arg0.field6745 + var11;
            int var23 = -arg0.field6739 + var12;
            if (~arg9 != 3) {
                if (~arg9 != 2) {
                    if (~arg9 != 1) {
                        if (~arg9 != 0) {
                            if (~arg9 != -1 && arg9 != 1 && arg9 != 2 && ~arg9 != -4 && ~arg9 != -10) {
                                if (arg0.method2704(arg7, arg1, arg9, var11, 2, arg6, var12, (byte) -120)) {
                                    class32.field490 = var11;
                                    class211.field3012 = var12;
                                    return true;
                                }
                            } else if (arg0.method2707(arg7, var12, arg1, 2, var11, arg9, arg6, -2)) {
                                class211.field3012 = var12;
                                class32.field490 = var11;
                                return true;
                            }
                        } else if (arg0.method2712(arg6, var11, arg7, arg3 + 37, var12, arg10, arg5, 2, arg8)) {
                            class32.field490 = var11;
                            class211.field3012 = var12;
                            return true;
                        }
                    } else if (arg0.method2705(var12, arg7, 2, arg3 ^ 54, var11, arg10, arg8, arg6, 2, arg5)) {
                        class32.field490 = var11;
                        class211.field3012 = var12;
                        return true;
                    }
                } else if (class247.method1479(2, arg7, arg5, var11, true, 2, arg6, arg8, var12)) {
                    class211.field3012 = var12;
                    class32.field490 = var11;
                    return true;
                }
            } else if (arg6 == var11 && ~arg7 == ~var12) {
                class32.field490 = var11;
                class211.field3012 = var12;
                return true;
            }
            int var25 = class75.field1059[var20][var21] + 1;
            if (var20 > 0 && class338.field4911[var20 - 1][var21] == 0 && (1134821376 & var19[var22 + -1][var23]) == 0 && (1310982144 & var19[var22 - 1][var23 + 1]) == 0) {
                class126.field1966[var26] = var11 + -1;
                class3.field37[var26] = var12;
                class338.field4911[var20 + -1][var21] = 2;
                var26 = 4095 & var26 + 1;
                class75.field1059[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class338.field4911[var20 + 1][var21] == 0 && (1625554944 & var19[var22 - -2][var23]) == 0 && ~(var19[var22 + 2][var23 - -1] & 2015625216) == -1) {
                class126.field1966[var26] = var11 + 1;
                class3.field37[var26] = var12;
                class338.field4911[var20 - -1][var21] = 8;
                var26 = var26 + 1 & 4095;
                class75.field1059[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class338.field4911[var20][var21 + -1] == 0 && ~(var19[var22][var23 + -1] & 1134821376) == -1 && (var19[var22 + 1][var23 - 1] & 1625554944) == 0) {
                class126.field1966[var26] = var11;
                class3.field37[var26] = var12 + -1;
                class338.field4911[var20][var21 + -1] = 1;
                var26 = 4095 & var26 - -1;
                class75.field1059[var20][var21 + -1] = var25;
            }
            if (var21 < 126 && ~class338.field4911[var20][var21 + 1] == -1 && (var19[var22][var23 + 2] & 1310982144) == 0 && (var19[var22 + 1][var23 - -2] & 2015625216) == 0) {
                class126.field1966[var26] = var11;
                class3.field37[var26] = var12 + 1;
                var26 = var26 - -1 & 4095;
                class338.field4911[var20][var21 - -1] = 4;
                class75.field1059[var20][var21 + 1] = var25;
            }
            if (~var20 < -1 && var21 > 0 && ~class338.field4911[var20 - 1][var21 - 1] == -1 && ~(1336147968 & var19[var22 - 1][var23]) == -1 && ~(var19[var22 - 1][var23 + -1] & 1134821376) == -1 && (var19[var22][var23 - 1] & 1675886592) == 0) {
                class126.field1966[var26] = var11 + -1;
                class3.field37[var26] = var12 + -1;
                var26 = 4095 & var26 + 1;
                class338.field4911[var20 + -1][var21 + -1] = 3;
                class75.field1059[var20 + -1][var21 + -1] = var25;
            }
            if (var20 < 126 && ~var21 < -1 && class338.field4911[var20 + 1][var21 - 1] == 0 && (1675886592 & var19[var22 - -1][var23 - 1]) == 0 && ~(var19[var22 + 2][var23 + -1] & 1625554944) == -1 && ~(2028208128 & var19[var22 - -2][var23]) == -1) {
                class126.field1966[var26] = var11 + 1;
                class3.field37[var26] = var12 + -1;
                class338.field4911[var20 + 1][var21 + -1] = 9;
                var26 = var26 + 1 & 4095;
                class75.field1059[var20 + 1][var21 + -1] = var25;
            }
            if (var20 > 0 && var21 < 126 && ~class338.field4911[var20 + -1][var21 + 1] == -1 && (var19[var22 + -1][var23 + 1] & 1336147968) == 0 && ~(1310982144 & var19[var22 + -1][var23 + 2]) == -1 && ~(var19[var22][var23 - -2] & 2116288512) == -1) {
                class126.field1966[var26] = var11 + -1;
                class3.field37[var26] = var12 - -1;
                class338.field4911[var20 - 1][var21 - -1] = 6;
                var26 = 4095 & var26 + 1;
                class75.field1059[var20 + -1][var21 + 1] = var25;
            }
            if (~var20 > -127 && ~var21 > -127 && ~class338.field4911[var20 + 1][var21 + 1] == -1 && ~(var19[var22 - -1][var23 + 2] & 2116288512) == -1 && (var19[var22 + 2][var23 + 2] & 2015625216) == 0 && ~(var19[var22 + 2][var23 + 1] & 2028208128) == -1) {
                class126.field1966[var26] = var11 + 1;
                class3.field37[var26] = var12 - -1;
                var26 = 4095 & var26 - -1;
                class338.field4911[var20 - -1][var21 + 1] = 12;
                class75.field1059[var20 - -1][var21 + 1] = var25;
            }
        }
        class211.field3012 = var12;
        class32.field490 = var11;
        return false;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZII)V")
    public final void method814(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            this.field2912 = -64;
        }
        ++field2907;
    }
}
