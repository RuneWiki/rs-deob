import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class66 {

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "Lvp;")
    public static class112 field844 = new class112("", 13);

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "F")
    public static float field847;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "Lb;")
    public static class201 field842;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "Lb;")
    public static class201 field848;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "Ljava/lang/String;")
    public static String field846;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I[BI)I")
    public static final int method401(int arg0, byte[] arg1, int arg2) {
        field845++;
        return arg0 > -18 ? -99 : class411.method2433(883512936, arg2, arg1, 0);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V")
    public static void method402(byte arg0) {
        field842 = null;
        field844 = null;
        field846 = null;
        field848 = null;
        if (arg0 <= 17) {
            field846 = null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BLb;Lnp;)V")
    public static final void method403(byte arg0, class201 arg1, class313 arg2) {
        field843++;
        if (class413.field5818) {
            return;
        }
        arg2.method678(0);
        class320.field4650 = arg2.method644(class72.method427(arg1, class405.field5699), true);
        class320.field4650.method1079((class144.field1900 - class320.field4650.method516()) / 2, (class244.field3634 - class320.field4650.method524()) / 2);
        class330.field4784 = arg2.method644(class72.method427(arg1, class29.field389), true);
        if (arg0 == -38) {
            class330.field4784.method1079((class144.field1900 - class330.field4784.method516()) / 2, 18);
            class413.field5818 = true;
        }
    }
}
