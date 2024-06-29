import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class96 {

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1454 = "Unable to find ";

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1457;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
    public static final void method645(boolean arg0) {
        field1458++;
        class178.field2541.method260(0);
        if (arg0) {
            method645(false);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static void method646(int arg0) {
        field1457 = null;
        if (arg0 != 12093) {
            method646(100);
        }
        field1454 = null;
    }
}
