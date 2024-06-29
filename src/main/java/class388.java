import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class388 {

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field5968 = 0;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field5970;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "Lqs;")
    public static class496 field5969;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "Lqs;")
    public static class496 field5971;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z[BI)I", line = 13)
    public static final int method2430(boolean arg0, byte[] arg1, int arg2) {
        if (arg0) {
            return 95;
        } else {
            field5970++;
            return class276.method1822(arg2, (byte) 79, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V", line = 31)
    public static void method2431(int arg0) {
        field5969 = null;
        field5971 = null;
        if (arg0 != 23776) {
            field5971 = null;
        }
    }
}
