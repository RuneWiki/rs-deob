import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class169 {

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "[[Z")
    public static boolean[][] field2577 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2580 = "Loaded interfaces";

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2581 = "";

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "Lng;")
    public static class245 field2576;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V", line = 8)
    public static final void method1145(int arg0, int arg1) {
        field2578++;
        class342.field5334 = arg0;
        class324.field5050 = -1;
        class324.field5050 = arg1;
        class242.method1649(arg1 + 2);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 33)
    public static void method1146(int arg0) {
        field2580 = null;
        field2576 = null;
        if (arg0 > 94) {
            field2581 = null;
            field2577 = (boolean[][]) null;
        }
    }
}
