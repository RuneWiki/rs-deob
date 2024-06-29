import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class200 {

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field2440 = 1407;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Lkfa;")
    public static class549 field2446 = new class549(4, 3);

    @OriginalMember(owner = "client!p", name = "k", descriptor = "[I")
    public static int[] field2448 = new int[32];

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public int field2438;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public int field2439;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public int field2443;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public int field2447;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static void method1219(byte arg0) {
        field2446 = null;
        if (arg0 != 11) {
            method1219((byte) 26);
        }
        field2448 = null;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V")
    public static final void method1220(byte arg0) {
        class7.field56++;
        if (arg0 != -117) {
            return;
        }
        field2442++;
        class480.method2802(class388.field5186, 16751);
        class334.field4314.method2525(class480.method2800(32032), -81849);
        class334.field4314.method2537(arg0 ^ 0xFFFFB8CF, class399.field5336);
        class334.field4314.method2537(18244, class416.field5524);
        class334.field4314.method2525(class601.field8530.field2858, -81849);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BLjo;[ILjo;)V")
    public static final void method1221(byte arg0, class303 arg1, int[] arg2, class303 arg3) {
        if (arg2 != null) {
            class289.field3719 = arg2;
        }
        field2445++;
        class455.field6328 = arg1;
        class359.field4705 = arg3;
        int var4 = 118 % ((6 - arg0) / 35);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)Lcw;")
    public static final class165 method1222(int arg0, int arg1) {
        field2441++;
        return arg1 >= ~arg0 && arg0 < 100 ? class561.field7978[arg0] : null;
    }
}
