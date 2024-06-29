import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class80 {

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field1362 = 0;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field1361 = 0;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static volatile int field1367 = 0;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "Lhi;")
    private static class82 field1368 = class95.method664((byte) -120, " has logged out)3");

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Lhi;")
    public static class82 field1365 = field1368;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lum;")
    public static class222 field1366;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V", line = 13)
    public static void method508(byte arg0) {
        field1368 = null;
        field1366 = null;
        field1365 = null;
        if (arg0 != 120) {
            field1366 = (class222) null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIILrm;IJIIII)Z", line = 26)
    public static final boolean method509(int arg0, int arg1, int arg2, int arg3, class175 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class323.method2231(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIILum;)Lti;", line = 36)
    public static final class186 method510(int arg0, int arg1, int arg2, class222 arg3) {
        if (arg0 != 1) {
            method509(-7, -109, 127, 51, (class175) null, -5, 117L, -27, 121, 34, -100);
        }
        field1369++;
        return client.method866(arg1, arg2, (byte) 49, arg3) ? class14.method77((byte) -30) : null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V", line = 51)
    public static final void method511(int arg0, int arg1) {
        if (arg0 == 1) {
            field1364++;
            class159.field2751.method2177(arg1, -120);
        }
    }
}
