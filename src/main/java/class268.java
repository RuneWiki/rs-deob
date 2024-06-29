import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class268 {

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "Lp;")
    public static class280 field4702 = null;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Lp;")
    private static class280 field4706 = class18.method140((byte) -126, "level: ");

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "Lp;")
    public static class280 field4703 = field4706;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "Ltg;")
    public static class180 field4707;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "[[[B")
    public static byte[][][] field4705;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public static void method1798(byte arg0) {
        field4702 = null;
        field4705 = null;
        field4706 = null;
        field4707 = null;
        if (arg0 != 2) {
            method1799(127, (class61) null);
        }
        field4703 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILoc;)V")
    public static final void method1799(int arg0, class61 arg1) {
        field4701++;
        if (arg0 != -23980) {
            return;
        }
        for (class23 var2 = (class23) class38.field678.method651(arg0 + 36896); var2 != null; var2 = (class23) class38.field678.method643(11066)) {
            if (var2.field415 == arg1) {
                if (var2.field411 != null) {
                    class234.field4082.method1823(var2.field411);
                    var2.field411 = null;
                }
                var2.method1146(26159);
                return;
            }
        }
    }
}
