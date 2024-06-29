import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class289 {

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "Lgda;")
    public static class53 field4079 = new class53(66, 15);

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "Lgda;")
    public static class53 field4081 = new class53(73, -1);

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "D")
    public static double field4082;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "J")
    public static long field4078;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)V")
    public static final void method1889(int arg0, int arg1) {
        field4080++;
        class206.field2719 = -1;
        class193.field2580 = arg0;
        class206.field2719 = arg1;
        class82.method633((byte) 56);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z)V")
    public static final void method1890(boolean arg0) {
        if (!arg0) {
            method1891((byte) 17);
        }
        class124.field1496 = null;
        class462.field6506 = null;
        class278.field3937 = null;
        class603.field8477 = null;
        class543.field7582 = null;
        field4077++;
        class156.field2179 = false;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)V")
    public static void method1891(byte arg0) {
        field4081 = null;
        field4079 = null;
        if (arg0 != -26) {
            method1890(true);
        }
    }
}
