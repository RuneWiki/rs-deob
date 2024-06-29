import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class335 {

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "S")
    public static short field4562 = 320;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)I", line = 5)
    public static final int method1854(int arg0, byte arg1) {
        if (arg1 != 7) {
            field4562 = 73;
        }
        field4561++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZLjava/awt/Component;Z)Lto;", line = 16)
    public static final class8 method1855(boolean arg0, Component arg1, boolean arg2) {
        if (arg2) {
            field4560++;
            return new class170(arg1, arg0);
        } else {
            return null;
        }
    }
}
