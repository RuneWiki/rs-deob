import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class310 {

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(III)Z")
    public static final boolean method1813(int arg0, int arg1, int arg2) {
        if (arg1 == 2439) {
            field3979++;
            return (arg2 & 0x400) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)V")
    public static final void method1814(byte arg0) {
        class488.field6581 = null;
        field3980++;
        if (class264.field3595 && class615.method3609((byte) 98) != 1) {
            class469.method2796(class570.method3409(-99), 0, class390.method2372(-127), true, 0, class213.field3004 == 3 || class213.field3004 == 7);
        }
        int var1 = 0;
        int var2 = 0;
        if (class264.field3595) {
            var1 = class468.method2788(false);
            var2 = class142.method934((byte) -88);
        }
        class677.method3876(class312.field4004, -1, 56, var2, var1, class58.field807 + var1, class582.field8281 + var2, var2, var1);
        if (class488.field6581 != null) {
            class583.method3454(class488.field6581, var1, class694.field9699, class316.field4062.field10016, 98, var2 + class582.field8281, -1412584499, var2, class206.field2942, true, class58.field807 + var1);
            class488.field6581 = null;
        }
        if (arg0 >= -29) {
            method1813(81, 56, 15);
        }
    }
}
