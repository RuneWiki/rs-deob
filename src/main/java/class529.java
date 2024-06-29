import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class529 extends InputStream {

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!fe", name = "read", descriptor = "()I")
    public final int read() {
        class561.method3202(30000L, (byte) -97);
        field7442++;
        return -1;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method3026(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class597.field8435 = arg3;
        field7441++;
        class318.field4691 = arg1;
        class338.field4983 = arg2;
        class555.field7858 = arg4;
        class467.field6718 = arg6;
        if (arg5 && class555.field7858 >= 100) {
            class131.field1928 = class467.field6718 * 512 + 256;
            class413.field6011 = class318.field4691 * 512 + 256;
            class568.field7998 = class674.method3748(class131.field1928, class58.field1112, 108, class413.field6011) - class597.field8435;
        }
        if (arg0 != 512) {
            method3026(-78, -31, 65, 91, 97, false, -106);
        }
        class666.field9399 = -1;
        class563.field7927 = -1;
        class43.field700 = 2;
    }
}
