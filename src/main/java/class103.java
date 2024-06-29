import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class103 extends class180 {

    @OriginalMember(owner = "client!jr", name = "o", descriptor = "I")
    public int field1459 = 0;

    @OriginalMember(owner = "client!jr", name = "v", descriptor = "I")
    public int field1466 = -1;

    @OriginalMember(owner = "client!jr", name = "q", descriptor = "I")
    public static int field1461 = 0;

    @OriginalMember(owner = "client!jr", name = "w", descriptor = "I")
    public static int field1467 = -1;

    @OriginalMember(owner = "client!jr", name = "t", descriptor = "I")
    public static int field1464 = 0;

    @OriginalMember(owner = "client!jr", name = "p", descriptor = "I")
    public int field1460;

    @OriginalMember(owner = "client!jr", name = "s", descriptor = "I")
    public int field1463;

    @OriginalMember(owner = "client!jr", name = "u", descriptor = "I")
    public int field1465;

    @OriginalMember(owner = "client!jr", name = "x", descriptor = "I")
    public int field1468;

    @OriginalMember(owner = "client!jr", name = "y", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!jr", name = "z", descriptor = "I")
    public int field1470;

    @OriginalMember(owner = "client!jr", name = "A", descriptor = "I")
    public int field1471;

    @OriginalMember(owner = "client!jr", name = "B", descriptor = "I")
    public int field1472;

    @OriginalMember(owner = "client!jr", name = "C", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!jr", name = "D", descriptor = "I")
    public int field1474;

    @OriginalMember(owner = "client!jr", name = "F", descriptor = "I")
    public int field1475;

    @OriginalMember(owner = "client!jr", name = "G", descriptor = "I")
    public int field1476;

    @OriginalMember(owner = "client!jr", name = "r", descriptor = "[Lrd;")
    public static class275[] field1462;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIIIIIZIIII)V", line = 6)
    public static final void method648(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
        field1469++;
        class75 var15;
        if (arg5 >= 0) {
            int var14 = arg5 - 1;
            var15 = class256.field3581[var14];
        } else {
            int var16 = -arg5 - 1;
            if (class327.field4523 == var16) {
                var15 = class2.field21;
            } else {
                var15 = class310.field4235[var16];
            }
        }
        if (var15 == null) {
            return;
        }
        class475 var17 = class304.field4160.method2075(arg3, arg9);
        int var18;
        int var19;
        if (arg11 == 1 || arg11 == 3) {
            var18 = var17.field6714;
            var19 = var17.field6708;
        } else {
            var18 = var17.field6708;
            var19 = var17.field6714;
        }
        int var20 = arg2 + (var18 >> 1);
        int var21 = (var18 + 1 >> 1) + arg2;
        int var22 = (var19 >> 1) + arg10;
        int var23 = (var19 + 1 >> 1) + arg10;
        class269 var24 = class317.field4306[arg13];
        int var25 = var24.method710(var20, var22) - (-var24.method710(var21, var22) - var24.method710(var20, var23)) + var24.method710(var21, var23) >> 2;
        class282 var26 = new class282();
        var26.field3875 = class356.field4972 + arg4;
        var26.field3881 = arg3;
        var26.field3871 = arg8;
        if (arg1 < arg6) {
            int var27 = arg6;
            arg6 = arg1;
            arg1 = var27;
        }
        var26.field3869 = arg2;
        var26.field3876 = arg10;
        var26.field3877 = var15.field6766;
        var26.field3882 = arg11;
        var26.field3873 = class356.field4972 + arg0;
        var26.field3872 = arg2 + arg6;
        if (arg7 < arg12) {
            int var28 = arg12;
            arg12 = arg7;
            arg7 = var28;
        }
        var26.field3880 = arg2 + arg1;
        var26.field3864 = var26.field3869 * 128 + var18 * 64;
        var26.field3868 = var25;
        var26.field3883 = arg10 + arg7;
        var26.field3865 = var26.field3876 * 128 + (var19 * 64);
        var26.field3878 = arg10 + arg12;
        class411.field5697.method1553((byte) -90, var26);
        var15.field1145 = var26;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IB)Z", line = 105)
    public static final boolean method649(int arg0, byte arg1) {
        field1473++;
        if (arg0 == 11 || arg0 == 45 || arg0 == 46 || arg0 == 60 || arg0 == 1011) {
            return true;
        } else {
            if (arg1 >= -44) {
                method648(-64, -77, -123, -57, -99, 85, 89, -25, -14, false, -31, -109, -126, 27);
            }
            return arg0 == 22 || arg0 == 1007;
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(B)V", line = 143)
    public static void method650(byte arg0) {
        if (arg0 == 105) {
            field1462 = null;
        }
    }
}
