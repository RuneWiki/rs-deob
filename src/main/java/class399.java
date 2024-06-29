import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class399 {

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "Lku;")
    public static class259 field5628;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "[S")
    public static short[] field5627;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2313(boolean arg0) {
        field5627 = null;
        field5628 = null;
        if (!arg0) {
            method2313(true);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)I", line = 17)
    public static final int method2314(int arg0, int arg1) {
        field5629++;
        if (arg1 != 255) {
            field5627 = null;
        }
        return arg0 & 0xFF;
    }
}
