import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class135 {

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2226 = null;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "Lkj;")
    public static class114 field2223;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "[I")
    public static int[] field2224;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "[I")
    public static int[] field2225;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static void method963(int arg0) {
        field2224 = null;
        if (arg0 != -7709) {
            field2224 = null;
        }
        field2225 = null;
        field2226 = null;
        field2223 = null;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)I")
    public static final int method964(int arg0) {
        field2227++;
        if (arg0 != 2) {
            field2223 = null;
        }
        return 2;
    }
}
