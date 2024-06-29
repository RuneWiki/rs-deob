import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class163 extends class179 {

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Lft;")
    public class4 field2536 = new class4();

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field2535 = 0;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "Lbn;")
    public static class295 field2534;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V", line = 9)
    public static void method1037(byte arg0) {
        field2534 = null;
        if (arg0 != -22) {
            method1037((byte) 89);
        }
    }
}
