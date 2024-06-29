import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class155 {

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "Z")
    public static boolean field1971 = false;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V", line = 18)
    public static final void method1042(byte arg0) {
        if (arg0 != -96) {
            method1042((byte) -12);
        }
        field1970++;
        if (class342.field5116 == null) {
            return;
        }
        if (class342.field5116.field3104 == 1) {
            class342.field5116 = null;
            return;
        }
        if (class342.field5116.field3104 == 2) {
            class185.method1231(class395.field5744, class6.field78, arg0 ^ 0xFFFFC4FC, 2);
            class342.field5116 = null;
            return;
        }
    }
}
