import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class188 {

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "Llga;")
    public static class663 field2719 = new class663(64);

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Lfc;")
    public static class235 field2720 = new class235("WTI", 5);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V", line = 5)
    public static void method1289(byte arg0) {
        if (arg0 == 101) {
            field2719 = null;
            field2720 = null;
        }
    }
}
