import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class162 {

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field2281 = 0;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field2284 = -1;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field2283 = 0;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Z")
    public static volatile boolean field2285 = true;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Lra;")
    public static class57 field2280;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
    public static void method1055(byte arg0) {
        field2280 = null;
        if (arg0 != -7) {
            method1056((int[]) null, -14, -112, 23L);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([IIIJ)Ljava/lang/String;")
    public static final String method1056(int[] arg0, int arg1, int arg2, long arg3) {
        field2282++;
        if (class341.field5017 != null) {
            String var5 = class341.field5017.method429(arg1, arg3, arg0, false);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg2 <= 94) {
            method1056((int[]) null, 78, -31, -97L);
        }
        return Long.toString(arg3);
    }
}
