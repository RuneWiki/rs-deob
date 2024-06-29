import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class166 {

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "Lwl;")
    public static class280 field2411 = new class280();

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field2414 = -1;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "Lqa;")
    public static class162 field2412;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "Lcd;")
    public static class205 field2413;

    @OriginalMember(owner = "client!ok", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2410++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(II)V")
    public class166(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V")
    public static void method1117(boolean arg0) {
        field2413 = null;
        if (!arg0) {
            method1117(false);
        }
        field2412 = null;
        field2411 = null;
    }
}
