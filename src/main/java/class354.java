import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class354 {

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "Lbf;")
    public static class372 field4946 = new class372(10, 5);

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V")
    public static void method2140(byte arg0) {
        field4946 = null;
        if (arg0 != 116) {
            field4946 = null;
        }
    }
}
