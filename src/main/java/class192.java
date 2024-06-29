import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class192 {

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field2763 = 0;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Z")
    public static boolean field2764 = false;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Llc;ILlc;)V", line = 8)
    public static final void method1329(class175 arg0, int arg1, class175 arg2) {
        class276.field4292 = class254.method1848(-1, arg2, class149.field2064, arg0, 0);
        if (class250.field3787) {
            class322.field4948 = class272.method1969(class149.field2064, arg2, arg0, 0, (byte) -75);
        } else {
            class322.field4948 = (class82) class276.field4292;
        }
        class179.field2601 = class254.method1848(-1, arg2, class175.field2524, arg0, 0);
        class88.field1097 = class254.method1848(-1, arg2, class313.field4843, arg0, arg1);
        field2765++;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLcc;I)I", line = 27)
    public static final int method1330(byte arg0, class263 arg1, int arg2) {
        field2762++;
        if (!client.method1952(arg1).method1122(arg2, 1) && arg1.field4043 == null) {
            return -1;
        } else if (arg0 == -53) {
            return arg1.field4108 == null || arg1.field4108.length <= arg2 ? -1 : arg1.field4108[arg2];
        } else {
            return -123;
        }
    }
}
