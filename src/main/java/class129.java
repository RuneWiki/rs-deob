import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class129 {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Lke;")
    public static class407 field2071 = new class407(16);

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Lrp;")
    public static class288 field2073 = new class288(8);

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIZI)I", line = 7)
    public static final int method869(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            method870(false);
        }
        field2072++;
        int var5 = 65536 - class195.field3077[arg0 * 8192 / arg1] >> 1;
        return ((65536 - var5) * arg4 >> 16) + (arg2 * var5 >> 16);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V", line = 27)
    public static void method870(boolean arg0) {
        field2071 = null;
        field2073 = null;
        if (arg0) {
            method870(true);
        }
    }
}
