import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class191 extends class375 {

    @OriginalMember(owner = "client!su", name = "y", descriptor = "Ldg;")
    public static class376 field2756 = new class376(62, 8);

    @OriginalMember(owner = "client!su", name = "A", descriptor = "Ldg;")
    public static class376 field2758 = new class376(14, 7);

    @OriginalMember(owner = "client!su", name = "t", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!su", name = "v", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!su", name = "w", descriptor = "I")
    public int field2754;

    @OriginalMember(owner = "client!su", name = "x", descriptor = "I")
    public int field2755;

    @OriginalMember(owner = "client!su", name = "z", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!su", name = "B", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!su", name = "C", descriptor = "I")
    public int field2760;

    @OriginalMember(owner = "client!su", name = "D", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!su", name = "E", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!su", name = "F", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!su", name = "u", descriptor = "Ljava/lang/String;")
    public String field2752;

    @OriginalMember(owner = "client!su", name = "d", descriptor = "(B)V")
    public final void method1284(byte arg0) {
        ++field2757;
        if (arg0 >= -25) {
            this.field2754 = -97;
        }
        super.field5344 = super.field5344 & Long.MIN_VALUE | 500L + class490.method2840(true);
        class655.field9192.method852(true, this);
    }

    @OriginalMember(owner = "client!su", name = "e", descriptor = "(B)V")
    public final void method1285(byte arg0) {
        if (arg0 != -1) {
            this.field2754 = -108;
        }
        super.field5344 |= Long.MIN_VALUE;
        ++field2753;
        if (this.method1288(-7415) == 0L) {
            class554.field7853.method852(true, this);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)I")
    public final int method1286(int arg0) {
        if (arg0 != 2) {
            this.field2754 = 92;
        }
        ++field2763;
        return (int) (255L & super.field9386 >>> 32);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIIIIILcp;III)Z")
    public static final boolean method1287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class674 arg7, int arg8, int arg9, int arg10) {
        if (arg2 <= 50) {
            return false;
        } else {
            ++field2751;
            int var11 = arg9;
            int var12 = arg5;
            byte var13 = 64;
            byte var14 = 64;
            int var15 = -var13 + arg9;
            int var16 = -var14 + arg5;
            class178.field2537[var13][var14] = 99;
            class226.field3183[var13][var14] = 0;
            byte var17 = 0;
            int var18 = 0;
            class184.field2588[var17] = arg9;
            byte var10001 = var17;
            int var26 = var17 + 1;
            class416.field6035[var10001] = arg5;
            int[][] var19 = arg7.field9532;
            while (~var26 != ~var18) {
                var11 = class184.field2588[var18];
                var12 = class416.field6035[var18];
                var18 = var18 - -1 & 4095;
                int var20 = -var16 + var12;
                int var21 = -var15 + var11;
                int var22 = -arg7.field9541 + var11;
                int var23 = var12 - arg7.field9538;
                if (arg1 != -4) {
                    if (~arg1 != 2) {
                        if (arg1 != -2) {
                            if (arg1 != -1) {
                                if (arg1 != 0 && arg1 != 1 && arg1 != 2 && ~arg1 != -4 && arg1 != 9) {
                                    if (arg7.method3743(2, arg1, var12, (byte) -102, arg4, arg10, arg6, var11)) {
                                        class218.field3056 = var12;
                                        class107.field1645 = var11;
                                        return true;
                                    }
                                } else if (arg7.method3738(true, var11, arg1, arg6, arg4, var12, 2, arg10)) {
                                    class218.field3056 = var12;
                                    class107.field1645 = var11;
                                    return true;
                                }
                            } else if (arg7.method3752(-27907, arg10, arg8, arg3, arg4, var12, var11, arg0, 2)) {
                                class218.field3056 = var12;
                                class107.field1645 = var11;
                                return true;
                            }
                        } else if (arg7.method3750(2, arg8, arg4, var12, arg10, arg0, var11, 2, arg3, (byte) -110)) {
                            class218.field3056 = var12;
                            class107.field1645 = var11;
                            return true;
                        }
                    } else if (class328.method2063(arg3, arg8, 2, var11, var12, arg4, -1, 2, arg10)) {
                        class218.field3056 = var12;
                        class107.field1645 = var11;
                        return true;
                    }
                } else if (arg4 == var11 && ~arg10 == ~var12) {
                    class218.field3056 = var12;
                    class107.field1645 = var11;
                    return true;
                }
                int var25 = class226.field3183[var21][var20] + 1;
                if (~var21 < -1 && ~class178.field2537[var21 + -1][var20] == -1 && (1134821376 & var19[var22 + -1][var23]) == 0 && (var19[var22 + -1][var23 - -1] & 1310982144) == 0) {
                    class184.field2588[var26] = var11 + -1;
                    class416.field6035[var26] = var12;
                    var26 = var26 + 1 & 4095;
                    class178.field2537[var21 + -1][var20] = 2;
                    class226.field3183[var21 + -1][var20] = var25;
                }
                if (~var21 > -127 && ~class178.field2537[var21 + 1][var20] == -1 && (1625554944 & var19[var22 + 2][var23]) == 0 && (var19[var22 - -2][var23 + 1] & 2015625216) == 0) {
                    class184.field2588[var26] = var11 + 1;
                    class416.field6035[var26] = var12;
                    var26 = var26 + 1 & 4095;
                    class178.field2537[var21 + 1][var20] = 8;
                    class226.field3183[var21 - -1][var20] = var25;
                }
                if (~var20 < -1 && class178.field2537[var21][var20 + -1] == 0 && ~(var19[var22][var23 + -1] & 1134821376) == -1 && ~(1625554944 & var19[var22 - -1][var23 + -1]) == -1) {
                    class184.field2588[var26] = var11;
                    class416.field6035[var26] = var12 + -1;
                    var26 = 4095 & var26 + 1;
                    class178.field2537[var21][var20 + -1] = 1;
                    class226.field3183[var21][var20 - 1] = var25;
                }
                if (var20 < 126 && class178.field2537[var21][var20 - -1] == 0 && (var19[var22][var23 + 2] & 1310982144) == 0 && ~(var19[var22 + 1][var23 + 2] & 2015625216) == -1) {
                    class184.field2588[var26] = var11;
                    class416.field6035[var26] = var12 + 1;
                    class178.field2537[var21][var20 + 1] = 4;
                    var26 = var26 + 1 & 4095;
                    class226.field3183[var21][var20 + 1] = var25;
                }
                if (var21 > 0 && var20 > 0 && class178.field2537[var21 + -1][var20 - 1] == 0 && ~(1336147968 & var19[var22 - 1][var23]) == -1 && ~(1134821376 & var19[var22 + -1][var23 + -1]) == -1 && ~(1675886592 & var19[var22][var23 + -1]) == -1) {
                    class184.field2588[var26] = var11 + -1;
                    class416.field6035[var26] = var12 + -1;
                    var26 = var26 + 1 & 4095;
                    class178.field2537[var21 + -1][var20 + -1] = 3;
                    class226.field3183[var21 + -1][var20 + -1] = var25;
                }
                if (var21 < 126 && var20 > 0 && ~class178.field2537[var21 + 1][var20 + -1] == -1 && ~(1675886592 & var19[var22 + 1][var23 - 1]) == -1 && (var19[var22 - -2][var23 + -1] & 1625554944) == 0 && (var19[var22 + 2][var23] & 2028208128) == 0) {
                    class184.field2588[var26] = var11 + 1;
                    class416.field6035[var26] = var12 - 1;
                    var26 = var26 + 1 & 4095;
                    class178.field2537[var21 + 1][var20 + -1] = 9;
                    class226.field3183[var21 + 1][var20 + -1] = var25;
                }
                if (var21 > 0 && var20 < 126 && ~class178.field2537[var21 + -1][var20 + 1] == -1 && ~(var19[var22 + -1][var23 - -1] & 1336147968) == -1 && ~(var19[var22 + -1][var23 - -2] & 1310982144) == -1 && (var19[var22][var23 + 2] & 2116288512) == 0) {
                    class184.field2588[var26] = var11 - 1;
                    class416.field6035[var26] = var12 + 1;
                    var26 = 4095 & var26 + 1;
                    class178.field2537[var21 - 1][var20 + 1] = 6;
                    class226.field3183[var21 + -1][var20 + 1] = var25;
                }
                if (var21 < 126 && var20 < 126 && class178.field2537[var21 + 1][var20 - -1] == 0 && ~(var19[var22 + 1][var23 - -2] & 2116288512) == -1 && (2015625216 & var19[var22 - -2][var23 + 2]) == 0 && (var19[var22 + 2][var23 + 1] & 2028208128) == 0) {
                    class184.field2588[var26] = var11 + 1;
                    class416.field6035[var26] = var12 + 1;
                    class178.field2537[var21 + 1][var20 + 1] = 12;
                    var26 = 4095 & var26 + 1;
                    class226.field3183[var21 - -1][var20 - -1] = var25;
                }
            }
            class107.field1645 = var11;
            class218.field3056 = var12;
            return false;
        }
    }

    @OriginalMember(owner = "client!su", name = "c", descriptor = "(I)J")
    public final long method1288(int arg0) {
        ++field2759;
        return arg0 != -7415 ? 127L : super.field5344 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!su", name = "f", descriptor = "(B)V")
    public static void method1289(byte arg0) {
        if (arg0 >= 114) {
            field2756 = null;
            field2758 = null;
        }
    }

    @OriginalMember(owner = "client!su", name = "e", descriptor = "(I)I")
    public final int method1290(int arg0) {
        ++field2762;
        return arg0 != 8 ? -21 : (int) super.field9386;
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(II)V")
    public class191(int arg0, int arg1) {
        super.field9386 = (long) arg1 | (long) arg0 << 32;
    }
}
