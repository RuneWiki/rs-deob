import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class293 {

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field4223 = new String[100];

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
    public static final void method1844(byte arg0) {
        class621.field8746 = 0;
        field4227++;
        if (arg0 != -99) {
            method1845(89, -114, -105);
        }
        class313.field4568 = new class509[50];
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V")
    public static final void method1845(int arg0, int arg1, int arg2) {
        field4225++;
        if (class543.method3045(arg0, arg2 - 29039)) {
            if (arg2 != 0) {
                field4223 = null;
            }
            class150.method1075(class177.field2593[arg0], arg1, (byte) 24);
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)V")
    public static void method1846(byte arg0) {
        field4223 = null;
        if (arg0 != 16) {
            field4223 = null;
        }
    }
}
