import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class166 {

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "Lhh;")
    public static class182 field2112 = null;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "Lam;")
    public static class286 field2110;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIII)V")
    public static final void method884(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2111++;
        if (class63.field653 != 0 && arg4 != 0 && class119.field1487 < 50 && arg0 != -1) {
            class195.field2633[class119.field1487] = arg0;
            class289.field3935[class119.field1487] = arg4;
            class208.field2836[class119.field1487] = arg1;
            class438.field6421[class119.field1487] = null;
            class344.field4619[class119.field1487] = 0;
            class312.field4196[class119.field1487] = arg3;
            class119.field1487++;
        }
        int var5 = 124 / ((22 - arg2) / 51);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILtq;IZIIIZIIZI)V")
    public static final void method885(int arg0, class250 arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10, int arg11) {
        if (arg2 == 1) {
            arg0 = 1;
        } else if (arg2 == 2) {
            arg4 = 1;
            arg0 = 1;
        } else if (arg2 == 3) {
            arg4 = 1;
        }
        field2109++;
        if (!arg7) {
            method885(90, (class250) null, 69, true, -82, -38, 90, false, 87, -26, false, 73);
        }
        if (arg6 < 0 || class315.field4214 <= arg6 || arg11 < 0 || class340.field4549 <= arg11) {
            while (true) {
                int var14 = arg1.method1350(31351);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg1.method1350(31351);
                    return;
                }
                if (var14 <= 49) {
                    arg1.method1350(31351);
                }
            }
        }
        if (!arg3 && !arg10) {
            class282.field3872[arg8][arg6][arg11] = 0;
        }
        while (true) {
            int var12 = arg1.method1350(31351);
            if (var12 == 0) {
                if (arg3) {
                    class432.field6340[0][arg4 + arg6][arg0 + arg11] = class272.field3682[0].method271(arg4 + arg6, arg0 + arg11);
                    return;
                } else if (arg8 == 0) {
                    class432.field6340[0][arg4 + arg6][arg0 + arg11] = -class429.method2651(arg5 + 932731, arg9 + 556238, 10294) * 8;
                    return;
                } else {
                    class432.field6340[arg8][arg4 + arg6][arg0 + arg11] = class432.field6340[arg8 - 1][arg4 + arg6][arg11 + arg0] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg1.method1350(31351);
                if (arg3) {
                    class432.field6340[0][arg4 + arg6][arg11 + arg0] = class272.field3682[0].method271(arg4 + arg6, arg0 + arg11) + (var13 * 8);
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg8 != 0) {
                    class432.field6340[arg8][arg4 + arg6][arg0 + arg11] = class432.field6340[arg8 - 1][arg4 + arg6][arg0 + arg11] - (var13 * 8);
                    return;
                }
                class432.field6340[0][arg4 + arg6][arg0 + arg11] = -var13 * 8;
                return;
            }
            if (var12 <= 49) {
                if (arg10) {
                    arg1.method1350(31351);
                } else {
                    class172.field2165[arg8][arg6][arg11] = arg1.method1363((byte) 125);
                    class430.field6321[arg8][arg6][arg11] = (byte) ((var12 - 2) / 4);
                    class127.field1645[arg8][arg6][arg11] = (byte) class262.method1461(3, arg2 + var12 - 2);
                }
            } else if (var12 <= 81) {
                if (!arg3 && !arg10) {
                    class282.field3872[arg8][arg6][arg11] = (byte) (var12 - 49);
                }
            } else if (!arg10) {
                class62.field629[arg8][arg6][arg11] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
    public static void method886(int arg0) {
        field2110 = null;
        if (arg0 < 79) {
            field2110 = null;
        }
    }
}
