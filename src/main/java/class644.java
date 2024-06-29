import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class644 extends class622 {

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "Lbv;")
    public static class568 field9336 = new class568();

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
    public static int field9338;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "[Lha;")
    public static class116[] field9337;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
    public static void method3712(int arg0) {
        field9337 = null;
        if (arg0 == -1) {
            field9336 = null;
        }
    }
}
