import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class268 {

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)I", line = 11)
    public static final int method1787(byte arg0, int arg1) {
        if (arg0 == -58) {
            field3921++;
            return arg1 & 0x7F;
        } else {
            return 9;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)Llda;", line = 23)
    public static final class511 method1788(int arg0, int arg1, int arg2) {
        class194 var3 = class443.field6387[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2525;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIZ)V", line = 30)
    public static final void method1789(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            class714.method3955(16, arg1, arg0);
            field3920++;
        }
    }
}
