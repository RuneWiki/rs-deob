import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class175 {

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field2468 = 0;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Z")
    public static boolean field2471 = false;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Z")
    public static boolean field2470 = true;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field2475 = 0;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field2473 = 0;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Lim;")
    public static class178 field2477 = null;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "Lkk;")
    public static class67 field2472;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
    public static void method1101(byte arg0) {
        int var1 = -121 % ((arg0 + 75) / 45);
        field2477 = null;
        field2472 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)V")
    public static final void method1102(byte arg0, int arg1) {
        class151.field2094.method943(arg1, true);
        class9.field101.method943(arg1, true);
        if (arg0 != 93) {
            field2472 = null;
        }
        field2467++;
    }
}
