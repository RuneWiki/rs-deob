import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class536 extends class101 {

    @OriginalMember(owner = "client!mq", name = "n", descriptor = "J")
    public long field7300;

    @OriginalMember(owner = "client!mq", name = "o", descriptor = "I")
    public static int field7301;

    @OriginalMember(owner = "client!mq", name = "p", descriptor = "I")
    public static int field7302;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)Lor;")
    public static final class668 method3067(int arg0, int arg1) {
        field7302++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class111.field1528[var2] == null || class111.field1528[var2][var3] == null) {
            boolean var4 = class768.method4253(-3, var2);
            if (!var4) {
                return null;
            }
        }
        return arg1 == 0 ? class111.field1528[var2][var3] : null;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(II)Z")
    public static final boolean method3068(int arg0, int arg1) {
        field7301++;
        if (arg0 == -15931) {
            return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V")
    public class536() {
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(J)V")
    public class536(long arg0) {
        this.field7300 = arg0;
    }
}
