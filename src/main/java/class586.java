import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class586 {

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "I")
    public static int field8269 = 7000;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "I")
    public static int field8268 = field8269;

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "Loh;")
    public static class404 field8270;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)V", line = 8)
    public static void method3364(byte arg0) {
        if (arg0 != 57) {
            method3364((byte) 104);
        }
        field8270 = null;
    }
}
