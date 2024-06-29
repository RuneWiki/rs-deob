import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class310 {

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Lnea;")
    public static class664 field4591 = new class664(27, -2);

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field4595 = 0;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field4597 = 0;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "Lnea;")
    public static class664 field4594 = new class664(21, 3);

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method1973(int arg0, int arg1, int arg2) {
        if (arg1 != -18974) {
            field4596 = 42;
        }
        field4590++;
        return (arg0 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V", line = 17)
    public static void method1974(boolean arg0) {
        if (!arg0) {
            field4591 = null;
            field4594 = null;
        }
    }
}
