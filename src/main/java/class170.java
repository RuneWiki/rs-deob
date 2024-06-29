import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class170 extends class275 {

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field2799 = 0;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "Lph;")
    public static class229 field2798 = class266.method1858(")3runescape)3com)4l=", 0);

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field2802 = 0;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public static volatile int field2804 = 0;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "[I")
    public static int[] field2803 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLsi;Lsi;)V", line = 4)
    public static final void method1240(byte arg0, class66 arg1, class66 arg2) {
        if (arg0 != -76) {
            method1241(112);
        }
        field2801++;
        class314.field5351 = arg1;
        class256.field4289 = arg2;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V", line = 44)
    public static void method1241(int arg0) {
        if (arg0 > -73) {
            method1241(59);
        }
        field2803 = null;
        field2798 = null;
    }
}
