import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class242 {

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "Lmh;")
    public static class128 field4141 = class22.method156(124, "::wm2");

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "[I")
    public static int[] field4143 = new int[2];

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "Lmh;")
    private static class128 field4148 = class22.method156(124, "Discard");

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "Lmh;")
    public static class128 field4145 = field4148;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "Lem;")
    public static class10 field4146;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "[Lvd;")
    public static class127[] field4139;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "[Lfb;")
    public static class55[] field4147;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lgj;Lgj;I)V", line = 49)
    public static final void method1642(class220 arg0, class220 arg1, int arg2) {
        if (arg1.field3880 != null) {
            arg1.method1521(-3810);
        }
        if (arg2 != 10) {
            return;
        }
        arg1.field3880 = arg0;
        field4144++;
        arg1.field3881 = arg0.field3881;
        arg1.field3880.field3881 = arg1;
        arg1.field3881.field3880 = arg1;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IB)V", line = 71)
    public static final void method1643(int arg0, byte arg1) {
        class245 var2 = (class245) class151.field2591.method728(false, (long) arg0);
        field4138++;
        if (var2 != null) {
            if (arg1 <= 22) {
                method1644(101, 11, -90, 10, 40);
            }
            var2.method1978((byte) 122);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIII)V", line = 88)
    public static final void method1644(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class229 var5 = class241.method1638(10, 116, arg3);
        var5.method1574(arg2 ^ 0xFFFF9BA3);
        field4142++;
        var5.field3981 = arg4;
        var5.field3983 = arg0;
        if (arg2 != -26660) {
            field4143 = (int[]) null;
        }
        var5.field3980 = arg1;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 108)
    public static void method1645(int arg0) {
        field4139 = null;
        field4146 = null;
        if (arg0 != 17109) {
            return;
        }
        field4148 = null;
        field4147 = null;
        field4145 = null;
        field4141 = null;
        field4143 = null;
    }
}
