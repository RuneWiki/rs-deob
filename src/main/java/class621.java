import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class621 {

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Llga;")
    public static class712 field8700 = new class712(57, -1);

    @OriginalMember(owner = "client!of", name = "b", descriptor = "Loq;")
    public static class362 field8701 = new class362();

    @OriginalMember(owner = "client!of", name = "c", descriptor = "Luaa;")
    public static class119 field8702;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static void method3515(byte arg0) {
        field8701 = null;
        if (arg0 < -42) {
            field8700 = null;
            field8702 = null;
        }
    }
}
