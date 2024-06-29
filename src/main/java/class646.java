import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class646 {

    @OriginalMember(owner = "client!am", name = "a", descriptor = "Liu;")
    public static class517 field9384 = new class517(88, 11);

    @OriginalMember(owner = "client!am", name = "c", descriptor = "Liu;")
    public static class517 field9386 = new class517(54, 6);

    @OriginalMember(owner = "client!am", name = "d", descriptor = "Ljava/lang/String;")
    public static String field9387 = "";

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field9388 = -1;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field9385;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)Ljava/lang/String;", line = 3)
    public static final String method3718(int arg0, int arg1) {
        field9385++;
        return arg0 == 255 ? (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF) : null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V", line = 20)
    public static void method3719(byte arg0) {
        field9386 = null;
        if (arg0 == 112) {
            field9384 = null;
            field9387 = null;
        }
    }
}
