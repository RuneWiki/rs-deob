import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class247 {

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "Z")
    public static boolean field4050 = false;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public int field4051;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "Lgr;")
    public class247 field4054;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "Lgl;")
    public static class356 field4053;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "Ljr;")
    public class57 field4052;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V", line = 9)
    public final void method1713(int arg0) {
        field4049++;
        if (class47.field589 >= 500) {
            return;
        }
        if (arg0 != -1479) {
            method1714(-116);
        }
        this.field4052 = null;
        this.field4054 = class101.field1411;
        this.field4051 = 0;
        class101.field1411 = this;
        class47.field589++;
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)V", line = 32)
    public static void method1714(int arg0) {
        field4053 = null;
        if (arg0 >= -83) {
            field4053 = null;
        }
    }
}
