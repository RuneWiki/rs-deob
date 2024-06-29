import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public class class165 {

    @OriginalMember(owner = "client!pha", name = "b", descriptor = "Z")
    public static boolean field2607 = false;

    @OriginalMember(owner = "client!pha", name = "c", descriptor = "[Leba;")
    public static class590[] field2608 = new class590[37];

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(Z)V", line = 8)
    public static void method1207(boolean arg0) {
        if (!arg0) {
            method1207(false);
        }
        field2608 = null;
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(Lvd;I)V", line = 24)
    public static final void method1208(class39 arg0, int arg1) {
        field2606++;
        if (arg1 != 19235) {
            method1207(true);
        }
        class567.field8053 = arg0.method217("p11_full", (byte) -93);
        class357.field5182 = arg0.method217("p12_full", (byte) -93);
        class649.field9148 = arg0.method217("b12_full", (byte) -93);
    }
}
