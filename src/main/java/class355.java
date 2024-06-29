import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class355 {

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "Lhu;")
    public static class133 field4993;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
    public static void method2119(byte arg0) {
        field4993 = null;
        if (arg0 != -55) {
            method2119((byte) -110);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
    public static final void method2120(int arg0) {
        class30.method265(false);
        field4994++;
        if (arg0 == -1877) {
            class403.field5625 = false;
            class310.method1908(class141.field2261, class477.field6534, arg0 + 1818, class733.field10151, class575.field7554);
        }
    }
}
