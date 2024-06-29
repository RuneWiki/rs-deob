import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class193 {

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "Lhq;")
    public static class108 field2708 = new class108(5000);

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public static int field2709 = 0;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "Lvj;")
    public static class304 field2710 = new class304("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "Lai;")
    public static class423 field2711;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)Lii;", line = 3)
    public static final class386 method1241(byte arg0) {
        field2707++;
        if (class391.field5303.length > class377.field5105) {
            return class391.field5303[class377.field5105++];
        } else {
            if (arg0 != 85) {
                method1242(67);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V", line = 19)
    public static void method1242(int arg0) {
        field2710 = null;
        field2708 = null;
        if (arg0 != 5000) {
            field2709 = 13;
        }
        field2711 = null;
    }
}
