import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class247 {

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "[I")
    public static int[] field4135 = new int[128];

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "Lwm;")
    private static class152 field4137 = class157.method1048("Allocating memory", 119);

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Lwm;")
    public static class152 field4131 = field4137;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "[I")
    public static int[] field4136 = new int[32];

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "Lqe;")
    public static class186 field4139;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "[S")
    public static short[] field4138;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 47)
    public static final void method1695(int arg0) {
        class241.field3947.method1613(-22696);
        class228.field3733.method1613(arg0 ^ 0xFFFFE859);
        field4132++;
        if (arg0 != 20225) {
            method1696(false, 95);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)I", line = 66)
    public static final int method1696(boolean arg0, int arg1) {
        if (arg0) {
            field4135 = (int[]) null;
        }
        field4133++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V", line = 78)
    public static void method1697(boolean arg0) {
        field4139 = null;
        if (arg0) {
            method1695(-80);
        }
        field4135 = null;
        field4131 = null;
        field4137 = null;
        field4136 = null;
        field4138 = null;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V", line = 108)
    public class247() {
        new class323();
    }
}
