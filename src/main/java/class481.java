import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class481 {

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Lem;")
    public static class206 field6622 = new class206(104, -1);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Lsea;")
    public static class648 field6621;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method2703(int arg0) {
        if (arg0 == -1) {
            field6622 = null;
            field6621 = null;
        }
    }
}
