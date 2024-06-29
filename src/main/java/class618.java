import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public abstract class class618 extends class307 {

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field8350;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Lvo;")
    public static class345 field8349;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V", line = 7)
    public static void method3375(byte arg0) {
        if (arg0 != -46) {
            field8350 = -117;
        }
        field8349 = null;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)Ltda;")
    public abstract class342 method2064(byte arg0);
}
