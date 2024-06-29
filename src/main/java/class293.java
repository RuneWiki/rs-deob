import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public abstract class class293 {

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field3960 = 0;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3963 = "Prepared sound engine";

    @OriginalMember(owner = "client!k", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3964 = "Loaded fonts";

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "Lbi;")
    public static class139 field3965;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Lrk;")
    public static class427 field3961;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "Lkm;")
    public static class437 field3959;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V", line = 4)
    public static void method1893(byte arg0) {
        if (arg0 != 125) {
            method1894((long[]) null, (int[]) null, 71);
        }
        field3965 = null;
        field3964 = null;
        field3961 = null;
        field3959 = null;
        field3963 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([J[II)V", line = 23)
    public static final void method1894(long[] arg0, int[] arg1, int arg2) {
        class286.method1809(arg2, arg1, arg0.length - 1, 37, arg0);
        field3962++;
    }
}
