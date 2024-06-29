import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class273 extends class618 {

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public int field3581;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "Lwm;")
    public static class30 field3577;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "Ljava/awt/Font;")
    public static Font field3580;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V", line = 8)
    public static final void method1694(int arg0, int arg1) {
        field3579++;
        class614 var2 = class497.method2759(arg1, 5977, (long) arg0);
        var2.method3279(false);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 18)
    public static void method1695(int arg0) {
        field3577 = null;
        if (arg0 != 128) {
            field3580 = null;
        }
        field3580 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BZ)Z", line = 29)
    public static final boolean method1696(byte arg0, boolean arg1) {
        field3578++;
        int var2 = arg0 & 0xFF;
        if (arg1) {
            field3577 = null;
        }
        if (var2 == 0) {
            return false;
        } else {
            return var2 < 128 || var2 >= 160 || class264.field3516[var2 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(I)V", line = 53)
    public class273(int arg0) {
        this.field3581 = arg0;
    }
}
