import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class442 {

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Lvea;")
    public static class277 field5874;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "[Lrba;")
    public static class435[] field5873;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
    public static void method2507(byte arg0) {
        field5874 = null;
        field5873 = null;
        if (arg0 < 92) {
            field5873 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V")
    public static final void method2508(byte arg0) {
        field5872++;
        class387.method2206(false);
        class414.method2326(22050, class748.field10451.field10408.method1903((byte) -47) == 1, true, 2);
        class684.field9529 = class760.method4225(class162.field2227, 1, 0, class262.field3311, 22050);
        class660.method3715(class143.method1036(-48, null), true, 5);
        class317.field4106 = class760.method4225(class162.field2227, 1, 1, class262.field3311, 2048);
        if (arg0 < -16) {
            class317.field4106.method3651((byte) -106, class307.field4055);
        }
    }
}
