import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class171 {

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field2974 = 0;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Lfa;")
    public static class200 field2972 = new class200(5000);

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 7)
    public static void method1165(int arg0) {
        if (arg0 != -5) {
            field2972 = (class200) null;
        }
        field2972 = null;
    }
}
