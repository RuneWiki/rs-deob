import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class166 {

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "I")
    public static int field2281 = 0;

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2280 = null;

    @OriginalMember(owner = "client!cfa", name = "f", descriptor = "Lik;")
    public static class207 field2284 = new class207();

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "I")
    public int field2279;

    @OriginalMember(owner = "client!cfa", name = "d", descriptor = "Lmn;")
    public class366 field2282;

    @OriginalMember(owner = "client!cfa", name = "g", descriptor = "Loia;")
    public static class88 field2285;

    @OriginalMember(owner = "client!cfa", name = "e", descriptor = "[I")
    public int[] field2283;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1084(boolean arg0) {
        field2284 = null;
        if (arg0) {
            method1084(false);
        }
        field2280 = null;
        field2285 = null;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(JJ)J", line = 26)
    public static long method1085(long arg0, long arg1) {
        return arg0 ^ arg1;
    }
}
