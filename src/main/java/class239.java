import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class239 {

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "Lao;")
    public static class191 field3176 = new class191(51, 28);

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)I", line = 4)
    public static final int method1500(byte arg0) {
        field3177++;
        if (arg0 >= -5) {
            method1500((byte) 110);
        }
        return 16;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(B)V", line = 20)
    public static void method1501(byte arg0) {
        if (arg0 >= 113) {
            field3176 = null;
        }
    }
}
