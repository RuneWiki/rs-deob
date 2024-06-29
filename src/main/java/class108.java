import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class108 {

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field1799 = 0;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "J")
    public static long field1800 = 0L;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "Lkl;")
    public static class64 field1802 = new class64();

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field1805 = 0;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Ltl;")
    public static class59 field1804 = class279.method1955(3896, 160);

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "Z")
    public static boolean field1807 = false;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIII)V", line = 73)
    public static final void method802(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 0) {
            return;
        }
        class186 var5 = class67.method561(32, arg1, 8);
        field1801++;
        var5.method1380(arg2 ^ 0xCDD);
        var5.field3114 = arg3;
        var5.field3123 = arg0;
        var5.field3117 = arg4;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V", line = 169)
    public static void method803(boolean arg0) {
        field1802 = null;
        field1804 = null;
        if (!arg0) {
            field1802 = (class64) null;
        }
    }
}
