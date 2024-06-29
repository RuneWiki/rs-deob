import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class366 implements class702 {

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
    public int field5279;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "Lwq;")
    public static class176 field5281 = null;

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)Lve;")
    public final class527 method606(int arg0) {
        field5280++;
        return arg0 == 0 ? class365.field5277 : null;
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(I)V")
    public class366(int arg0) {
        this.field5279 = arg0;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V")
    public static void method2280(byte arg0) {
        field5281 = null;
        if (arg0 >= -94) {
            field5282 = 110;
        }
    }
}
