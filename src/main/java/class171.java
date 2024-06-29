import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class171 {

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2445;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V")
    public static final void method1118(int arg0, int arg1) {
        if (class225.field3169 == null || arg1 > class225.field3169.length) {
            class225.field3169 = new int[arg1];
        }
        if (arg0 != 1868) {
            method1118(-23, 48);
        }
        field2448++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILqi;)Ljb;")
    public static final class211 method1119(int arg0, class216 arg1) {
        field2447++;
        if (arg0 != 31962) {
            field2445 = null;
        }
        return new class211(arg1.method1357((byte) 50), arg1.method1357((byte) 50), arg1.method1357((byte) 50), arg1.method1357((byte) 50), arg1.method1382(arg0 ^ 0xFFFF837F), arg1.method1382(-51), arg1.method1407(121));
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static void method1120(byte arg0) {
        field2445 = null;
        if (arg0 < 1) {
            field2446 = 112;
        }
    }
}
