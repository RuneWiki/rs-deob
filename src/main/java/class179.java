import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class179 {

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "[J")
    public static long[] field2408 = new long[100];

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "F")
    public static float field2407;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Lkm;")
    public static class133 field2404;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Z")
    public static boolean field2405;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V", line = 8)
    public static void method1242(byte arg0) {
        field2408 = null;
        field2404 = null;
        if (arg0 != -99) {
            field2404 = (class133) null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V", line = 24)
    public static final void method1243(byte arg0) {
        class26.field330.method717((byte) 120);
        class269.field3998.method717((byte) 70);
        field2406++;
        if (arg0 < 3) {
            field2405 = false;
        }
    }
}
