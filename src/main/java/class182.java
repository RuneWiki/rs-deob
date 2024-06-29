import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class182 {

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field2882 = 0;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lbk;ILjava/lang/Object;)V", line = 19)
    public static final void method1329(class69 arg0, int arg1, Object arg2) {
        field2884++;
        if (arg1 != 1001) {
            field2885 = -67;
        }
        if (arg0.field1041 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field1041.peekEvent() != null; var3++) {
            class245.method1729(120, 1L);
        }
        if (arg2 != null) {
            arg0.field1041.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }
}
