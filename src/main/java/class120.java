import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class120 extends class21 implements class171 {

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    private int field1869;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Lew;")
    public static class270 field1866 = new class270(512);

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field1875 = 0;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field1877 = 0;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lpg;I[BI)V")
    public class120(class333 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field1869 = arg1;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
    public static final void method877(byte arg0) {
        class71.method568(class76.field1075.field3656, false, 2, 22050);
        ++field1867;
        class63.field920 = new class146();
        class63.field920.method1025(865, 9, 128);
        class223.field3146 = class399.method2362(class415.field6025, 22050, class346.field4985, 0, arg0 ^ -69);
        class223.field3146.method3020(class63.field920, (byte) 87);
        class40.method283(class297.field4083, class383.field5505, -9286, class481.field6956, class63.field920);
        if (arg0 == -3) {
            class515.field7534 = class399.method2362(class415.field6025, 2048, class346.field4985, 1, -118);
            class290.field3924 = new class43();
            class515.field7534.method3020(class290.field3924, (byte) 87);
            class149.field2289 = new class330(22050, class506.field7397);
            class63.field921 = class437.field6309.method2488("scape main", false);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II[BB)V")
    public final void method878(int arg0, int arg1, byte[] arg2, byte arg3) {
        this.method134(arg2, arg0);
        if (arg3 == -32) {
            ++field1873;
            this.field1869 = arg1;
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(B)V")
    public static final void method879(byte arg0) {
        ++field1870;
        int var1 = (int) ((double) class9.field111 * 34.46D);
        int var2 = var1 << 0;
        if (arg0 != 48) {
            field1866 = null;
        }
        if (class275.field3737.method514()) {
            var2 += 128;
        }
        class275.field3737.method512(50, var2);
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
    public static void method880(int arg0) {
        field1866 = null;
        if (arg0 != -1) {
            method880(92);
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lpg;ILjaggl/memory/NativeBuffer;)V")
    public class120(class333 arg0, int arg1, NativeBuffer arg2) {
        super(arg0, arg2);
        this.field1869 = arg1;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)I")
    public final int method881(int arg0) {
        ++field1871;
        if (arg0 != 13298) {
            method880(48);
        }
        return 0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)J")
    public final long method882(byte arg0) {
        ++field1876;
        if (arg0 < 112) {
            method877((byte) -34);
        }
        return super.field296.method2841();
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)I")
    public final int method883(int arg0) {
        ++field1868;
        int var2 = -104 / ((-38 - arg0) / 56);
        return this.field1869;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILet;IIIIIIIII)Z")
    public static final boolean method884(int arg0, class466 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field1874;
        int var11 = arg8;
        int var12 = arg5;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = -var13 + arg8;
        class338.field4911[var13][var14] = 99;
        int var16 = arg5 - var14;
        class75.field1059[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class126.field1966[var17] = arg8;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class3.field37[var10001] = arg5;
        if (arg9 != -1) {
            return true;
        } else {
            int[][] var19 = arg1.field6737;
            while (~var26 != ~var18) {
                var11 = class126.field1966[var18];
                var12 = class3.field37[var18];
                int var20 = -var16 + var12;
                int var21 = -var15 + var11;
                int var22 = -arg1.field6745 + var11;
                var18 = 4095 & var18 + 1;
                int var23 = -arg1.field6739 + var12;
                if (~arg2 != 3) {
                    if (~arg2 != 2) {
                        if (arg2 != -2) {
                            if (arg2 != -1) {
                                if (~arg2 != -1 && arg2 != 1 && ~arg2 != -3 && ~arg2 != -4 && arg2 != 9) {
                                    if (arg1.method2704(arg7, arg3, arg2, var11, 1, arg6, var12, (byte) -128)) {
                                        class32.field490 = var11;
                                        class211.field3012 = var12;
                                        return true;
                                    }
                                } else if (arg1.method2707(arg7, var12, arg3, 1, var11, arg2, arg6, -2)) {
                                    class32.field490 = var11;
                                    class211.field3012 = var12;
                                    return true;
                                }
                            } else if (arg1.method2712(arg6, var11, arg7, 103, var12, arg0, arg4, 1, arg10)) {
                                class211.field3012 = var12;
                                class32.field490 = var11;
                                return true;
                            }
                        } else if (arg1.method2705(var12, arg7, 1, -128, var11, arg0, arg10, arg6, 1, arg4)) {
                            class32.field490 = var11;
                            class211.field3012 = var12;
                            return true;
                        }
                    } else if (class247.method1479(1, arg7, arg4, var11, true, 1, arg6, arg10, var12)) {
                        class211.field3012 = var12;
                        class32.field490 = var11;
                        return true;
                    }
                } else if (arg6 == var11 && ~arg7 == ~var12) {
                    class32.field490 = var11;
                    class211.field3012 = var12;
                    return true;
                }
                int var25 = class75.field1059[var21][var20] + 1;
                if (~var21 < -1 && ~class338.field4911[var21 + -1][var20] == -1 && ~(1109655552 & var19[var22 + -1][var23]) == -1) {
                    class126.field1966[var26] = var11 + -1;
                    class3.field37[var26] = var12;
                    class338.field4911[var21 + -1][var20] = 2;
                    var26 = var26 - -1 & 4095;
                    class75.field1059[var21 - 1][var20] = var25;
                }
                if (var21 < 127 && class338.field4911[var21 + 1][var20] == 0 && ~(1612972032 & var19[var22 - -1][var23]) == -1) {
                    class126.field1966[var26] = var11 - -1;
                    class3.field37[var26] = var12;
                    class338.field4911[var21 + 1][var20] = 8;
                    var26 = var26 + 1 & 4095;
                    class75.field1059[var21 + 1][var20] = var25;
                }
                if (~var20 < -1 && ~class338.field4911[var21][var20 - 1] == -1 && ~(var19[var22][var23 + -1] & 1084489728) == -1) {
                    class126.field1966[var26] = var11;
                    class3.field37[var26] = var12 - 1;
                    class338.field4911[var21][var20 + -1] = 1;
                    var26 = 4095 & var26 - -1;
                    class75.field1059[var21][var20 + -1] = var25;
                }
                if (~var20 > -128 && ~class338.field4911[var21][var20 + 1] == -1 && (var19[var22][var23 + 1] & 1210318848) == 0) {
                    class126.field1966[var26] = var11;
                    class3.field37[var26] = var12 - -1;
                    class338.field4911[var21][var20 + 1] = 4;
                    var26 = 4095 & var26 + 1;
                    class75.field1059[var21][var20 - -1] = var25;
                }
                if (~var21 < -1 && var20 > 0 && ~class338.field4911[var21 + -1][var20 + -1] == -1 && (1134821376 & var19[var22 + -1][var23 - 1]) == 0 && (1109655552 & var19[var22 - 1][var23]) == 0 && ~(var19[var22][var23 + -1] & 1084489728) == -1) {
                    class126.field1966[var26] = var11 + -1;
                    class3.field37[var26] = var12 - 1;
                    class338.field4911[var21 + -1][var20 + -1] = 3;
                    var26 = var26 + 1 & 4095;
                    class75.field1059[var21 + -1][var20 + -1] = var25;
                }
                if (~var21 > -128 && ~var20 < -1 && class338.field4911[var21 + 1][var20 + -1] == 0 && ~(var19[var22 + 1][var23 + -1] & 1625554944) == -1 && ~(1612972032 & var19[var22 + 1][var23]) == -1 && ~(1084489728 & var19[var22][var23 - 1]) == -1) {
                    class126.field1966[var26] = var11 + 1;
                    class3.field37[var26] = var12 + -1;
                    class338.field4911[var21 + 1][var20 + -1] = 9;
                    var26 = var26 + 1 & 4095;
                    class75.field1059[var21 + 1][var20 - 1] = var25;
                }
                if (var21 > 0 && ~var20 > -128 && ~class338.field4911[var21 + -1][var20 + 1] == -1 && ~(1310982144 & var19[var22 - 1][var23 + 1]) == -1 && (var19[var22 + -1][var23] & 1109655552) == 0 && (var19[var22][var23 - -1] & 1210318848) == 0) {
                    class126.field1966[var26] = var11 + -1;
                    class3.field37[var26] = var12 + 1;
                    var26 = var26 + 1 & 4095;
                    class338.field4911[var21 + -1][var20 + 1] = 6;
                    class75.field1059[var21 + -1][var20 + 1] = var25;
                }
                if (~var21 > -128 && ~var20 > -128 && ~class338.field4911[var21 + 1][var20 - -1] == -1 && ~(var19[var22 + 1][var23 - -1] & 2015625216) == -1 && ~(var19[var22 - -1][var23] & 1612972032) == -1 && ~(var19[var22][var23 + 1] & 1210318848) == -1) {
                    class126.field1966[var26] = var11 - -1;
                    class3.field37[var26] = var12 + 1;
                    class338.field4911[var21 - -1][var20 - -1] = 12;
                    var26 = var26 - -1 & 4095;
                    class75.field1059[var21 + 1][var20 + 1] = var25;
                }
            }
            class211.field3012 = var12;
            class32.field490 = var11;
            return false;
        }
    }
}
