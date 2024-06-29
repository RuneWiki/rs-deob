import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class592 {

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "Ljava/lang/String;")
    public static String field8248 = "";

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field8246;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field8247;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field8249;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lnd;B)I", line = 6)
    public static final int method3294(class500 arg0, byte arg1) {
        field8249++;
        if (class24.field325 == arg0) {
            return 7681;
        } else if (class137.field1929 == arg0) {
            return 8448;
        } else if (class175.field2614 == arg0) {
            return 34165;
        } else if (client.field3838 == arg0) {
            return 260;
        } else if (class62.field821 == arg0) {
            return 34023;
        } else if (arg1 < 11) {
            return -125;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 38)
    public static void method3295(int arg0) {
        if (arg0 < 126) {
            field8248 = null;
        }
        field8248 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V", line = 52)
    public static final void method3296(byte arg0) {
        if (arg0 != 82) {
            field8247 = 34;
        }
        field8246++;
        class229.field3278 = false;
        class568.method3135(class371.field5287, 107, class113.field1532, class364.field5200, class174.field2605);
    }
}
