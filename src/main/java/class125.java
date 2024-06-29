import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class125 {

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Lce;")
    public static class126 field2105 = class206.method1445(-7923, "::shiftclick");

    @OriginalMember(owner = "client!le", name = "g", descriptor = "[S")
    public static short[] field2110 = new short[] { 12, 13, 24, 60, 25, 3, 14, 46 };

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Lce;")
    public static class126 field2108 = class206.method1445(-7923, "::rebuild");

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Lce;")
    public static class126 field2111 = class206.method1445(-7923, "Cache:");

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Lae;")
    public static class100 field2106;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "Ltc;")
    public static class144 field2109;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)I", line = 17)
    public static final int method831(byte arg0, int arg1) {
        field2107++;
        if (arg0 > -10) {
            field2105 = (class126) null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIIZI)V", line = 36)
    public static final void method832(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        int var9 = arg2 - arg0;
        field2112++;
        int var10 = arg5 - arg1;
        int var11 = (arg6 - arg8 << 16) / var9;
        int var12 = (arg4 - arg3 << 16) / var10;
        class269.method1808(0, arg7, arg0, var12, arg2, arg5, 0, var11, arg1, arg3, arg8);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V", line = 51)
    public static final void method833(boolean arg0) {
        if (class118.field1993 != null) {
            class118.field1993.method1052((byte) 123);
        }
        if (field2109 != null) {
            field2109.method1052((byte) 123);
        }
        class33.method177(-29991, 22050, 2, class280.field4660);
        field2104++;
        class118.field1993 = class175.method1268(arg0, class24.field342, 0, 22050, class161.field2907);
        class118.field1993.method1053(0, class106.field1669);
        field2109 = class175.method1268(false, class24.field342, 1, 2048, class161.field2907);
        field2109.method1053(0, class278.field4633);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 80)
    public static void method834(int arg0) {
        field2106 = null;
        if (arg0 != 25) {
            method833(false);
        }
        field2110 = null;
        field2109 = null;
        field2108 = null;
        field2111 = null;
        field2105 = null;
    }
}
