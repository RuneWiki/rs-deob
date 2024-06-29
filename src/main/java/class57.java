import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class57 {

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "Lm;")
    public static class242 field856 = new class242();

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "Ljava/lang/String;")
    public static String field859 = null;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field860 = 0;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "Ljava/lang/String;")
    public static String field858 = "flash3:";

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field861 = 0;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "Ll;")
    public static class315 field864;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Llo;ILlo;)V", line = 3)
    public static final void method419(class443 arg0, int arg1, class443 arg2) {
        field857++;
        if (arg2.field6402 != null) {
            arg2.method2764((byte) 119);
        }
        arg2.field6406 = arg0.field6406;
        arg2.field6402 = arg0;
        if (arg1 != 0) {
            method419((class443) null, -66, (class443) null);
        }
        arg2.field6402.field6406 = arg2;
        arg2.field6406.field6402 = arg2;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 40)
    public static void method420(int arg0) {
        field856 = null;
        if (arg0 == 0) {
            field864 = null;
            field859 = null;
            field858 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)Lua;", line = 59)
    public static final class400 method421(int arg0, int arg1, int arg2) {
        class77 var3 = class106.field1405[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1067;
    }
}
