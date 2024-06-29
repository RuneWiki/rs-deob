import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class185 {

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2500 = "";

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "Llia;")
    public static class477 field2501 = new class477(0, -1);

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "I")
    public static int field2503 = 0;

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(II)V")
    public static final void method1168(int arg0, int arg1) {
        field2502++;
        class592 var2 = class682.method3825(-652872096, 3, arg0);
        var2.method3350(arg1);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V")
    public static void method1169(int arg0) {
        if (arg0 == 3) {
            field2500 = null;
            field2501 = null;
        }
    }
}
