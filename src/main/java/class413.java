import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class413 {

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field5318 = 0;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "Lra;")
    public static class361 field5315 = new class361(0, 0);

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "Lxa;")
    public static class511 field5316;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
    public static void method2334(byte arg0) {
        if (arg0 <= 80) {
            field5318 = -65;
        }
        field5315 = null;
        field5316 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZIIII)V")
    public static final void method2335(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field5320++;
        if (!arg1) {
            method2335(0, true, -79, -69, 40, -23);
        }
        if (class265.field3552 <= arg0 && arg2 <= class641.field8924 && arg5 >= class165.field2061 && arg4 <= class99.field1309) {
            class125.method916(arg4, !arg1, arg3, arg0, arg5, arg2);
        } else {
            class596.method3232(arg4, 34963, arg3, arg0, arg5, arg2);
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)Ljava/lang/String;")
    public static final String method2336(byte arg0) {
        field5321++;
        int var1 = 40 % ((arg0 + 61) / 34);
        return class594.field8025 || class218.field2855 == null ? "" : class218.field2855.field761;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method2337(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5319++;
        if (arg6 != -51) {
            method2334((byte) -6);
        }
        if ((arg0 ? class260.field3509.field1280 : class260.field3509.field1289) != 0 && arg1 != 0 && class202.field2639 < 50 && arg2 != -1) {
            class47.field666[class202.field2639++] = new class64((byte) (arg0 ? 3 : 2), arg2, arg1, arg4, arg5, arg3);
        }
    }
}
