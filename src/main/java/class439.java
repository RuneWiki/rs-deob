import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class439 {

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "F")
    public static float field6146;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public int field6142;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
    public int field6144;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    public int field6147;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
    public int field6148;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)V", line = 9)
    public static final void method2481(int arg0, int arg1) {
        field6145++;
        class252 var2 = class150.method916(arg1, arg0 - 72, arg0);
        var2.method1497(0);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIILoi;ILoi;III)V", line = 19)
    public static final void method2482(int arg0, int arg1, int arg2, int arg3, class74 arg4, int arg5, class74 arg6, int arg7, int arg8, int arg9) {
        field6149++;
        int var10 = arg6.method544(28213);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class680 var12 = (class680) class375.field5217.method1571(-120, (long) var10);
        if (var12 == null) {
            class204[] var13 = class204.method1124(class97.field1282, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class21.field142.method366(var13[0], true);
            class375.field5217.method1574((long) var10, var12, (byte) -80);
        }
        class310.method1867(arg8 >> 1, arg4.field2170, arg9 >> 1, arg4.method543(0) * 256, (byte) 94, arg4.field2165, arg0, arg4.field2175, arg2, 0);
        int var14 = arg1 + class118.field1560[0] - 18;
        int var15 = class118.field1560[1] + arg5 - 70;
        int var16 = arg7 / 4 * 18 + var14;
        int var17 = arg7 % 4 * 18 + var15;
        var12.method3859(var16, var17);
        if (arg4 == arg6) {
            class21.field142.method393(true, 18, 18, -256, var16 - 1, var17 + -1);
        }
        class207.method1157(var17 + 18, var17 + -1, false, var16 - 1, var16 + 18);
        class396 var18 = class140.method867(-90);
        if (arg3 <= 15) {
            return;
        }
        var18.field5618 = var17;
        var18.field5626 = arg6;
        var18.field5624 = var17 + 16;
        var18.field5621 = var16 + 16;
        var18.field5623 = var16;
        class337.field4552.method118(true, var18);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIII)V", line = 73)
    public static final void method2483(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class574.field8077 != null) {
            class574.field8077[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class622.field8711 != null) {
            class622.field8711[arg0][arg1] = (short) arg3;
        }
        if (class425.field5983 != null) {
            class425.field5983[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lgv;Z)I", line = 86)
    public static final int method2484(class83 arg0, boolean arg1) {
        field6143++;
        if (!arg1) {
            return -121;
        }
        int var2 = arg0.field1125;
        class351 var3 = arg0.method548(1);
        if (arg0.field837 == -1 || arg0.field803) {
            var2 = arg0.field1132;
        } else if (arg0.field837 == var3.field4682 || arg0.field837 == var3.field4650 || arg0.field837 == var3.field4697 || arg0.field837 == var3.field4645) {
            var2 = arg0.field1120;
        } else if (arg0.field837 == var3.field4657 || arg0.field837 == var3.field4689 || arg0.field837 == var3.field4698 || arg0.field837 == var3.field4667) {
            var2 = arg0.field1128;
        }
        return var2;
    }
}
