import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public class class748 extends class205 {

    @OriginalMember(owner = "client!eia", name = "v", descriptor = "Lue;")
    public class188 field10449;

    @OriginalMember(owner = "client!eia", name = "u", descriptor = "Lcb;")
    public static class631 field10448 = new class631(26, 3);

    @OriginalMember(owner = "client!eia", name = "t", descriptor = "I")
    public static int field10447;

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "(I)V", line = 3)
    public static void method4179(int arg0) {
        field10448 = null;
        if (arg0 != 26) {
            field10447 = 41;
        }
    }

    @OriginalMember(owner = "client!eia", name = "<init>", descriptor = "(Lue;)V", line = 20)
    public class748(class188 arg0) {
        this.field10449 = arg0;
    }
}
