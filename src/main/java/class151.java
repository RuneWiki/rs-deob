import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class151 extends class77 {

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Ltl;")
    public static class400 field2117 = new class400(8);

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field2118 = 0;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V", line = 10)
    public static void method1023(byte arg0) {
        if (arg0 > -25) {
            field2118 = 118;
        }
        field2117 = null;
    }
}
