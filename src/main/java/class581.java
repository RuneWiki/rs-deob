import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class581 {

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public static int field8424;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public static int field8425;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public static int field8426;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(BII)Z")
    public static final boolean method3335(byte arg0, int arg1, int arg2) {
        if (arg0 < 50) {
            method3335((byte) -79, -8, -21);
        }
        field8426++;
        return (arg2 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V")
    public static final void method3336(byte arg0) {
        field8424++;
        class37.field1050 = 1;
        class163.field2735 = -1;
        long var1 = 0L;
        if (arg0 != 54) {
            return;
        }
        if (class687.field9733 == null) {
            class705.method3936(35, false);
        } else {
            class61 var3 = new class61(class234.method1575(class358.method2294((byte) -113, class687.field9733), -2));
            long var4 = var3.method742(arg0 + 23332);
            class350.field5249 = var3.method742(23386);
            class210.method1471(true, class424.method2586(var4, (byte) -42), (byte) -15, "");
        }
    }
}
