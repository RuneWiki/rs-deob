import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class368 {

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Lan;")
    public static class22 field4788;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lfp;IB)V", line = 3)
    public static final void method2014(class292 arg0, int arg1, byte arg2) {
        field4789++;
        int var3 = -1;
        int var4 = 0;
        if (class469.field6549 < arg0.field3783) {
            class362.method1986(arg2 ^ 0x72, arg0);
        } else if (class469.field6549 > arg0.field3826) {
            class644.method3614(arg2 ^ 0xFFFFD8E6, arg0, false);
            var3 = class86.field915;
            var4 = class370.field4802;
        } else {
            class385.method2113(512, arg0);
        }
        if (arg0.field4641 < 512 || arg0.field4647 < 512 || arg0.field4641 >= (class399.field5338 - 1) * 512 || arg0.field4647 >= (class349.field4567 - 1) * 512) {
            arg0.field3785 = -1;
            arg0.field3826 = 0;
            var4 = 0;
            var3 = -1;
            arg0.field3783 = 0;
            arg0.field3774 = -1;
            arg0.field3778 = -1;
            arg0.field4641 = arg0.field3839[0] * 512 + (arg0.method1656(true) * 256);
            arg0.field4647 = arg0.field3841[0] * 512 + arg0.method1656(true) * 256;
            arg0.method1650(-42);
        }
        if (class377.field4914 == arg0 && (arg0.field4641 < 6144 || arg0.field4647 < 6144 || arg0.field4641 >= class399.field5338 * 512 - 6144 || ((class349.field4567 - 12) * 512) <= arg0.field4647)) {
            arg0.field3778 = -1;
            arg0.field3774 = -1;
            arg0.field3785 = -1;
            var4 = 0;
            arg0.field3783 = 0;
            arg0.field3826 = 0;
            var3 = -1;
            arg0.field4641 = arg0.field3839[0] * 512 + (arg0.method1656(true) * 256);
            arg0.field4647 = arg0.field3841[0] * 512 + arg0.method1656(true) * 256;
            arg0.method1650(127);
        }
        int var5 = class407.method2210(arg0, (byte) 83);
        class146.method798(arg0, (byte) -86, var4, var5, var3);
        if (arg2 != -50) {
            field4788 = null;
        }
        class194.method1111((byte) -73, arg0);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IBI)Z", line = 71)
    public static final boolean method2015(int arg0, byte arg1, int arg2) {
        field4787++;
        return arg1 <= 117 ? false : false;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)V", line = 82)
    public static final void method2016(int arg0, byte arg1) {
        field4786++;
        if (arg1 != 29) {
            field4788 = null;
        }
        class530 var2 = class242.method1402(arg1 - 140, 9, arg0);
        var2.method3027((byte) -71);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V", line = 95)
    public static void method2017(byte arg0) {
        field4788 = null;
        if (arg0 >= -2) {
            field4788 = null;
        }
    }
}
