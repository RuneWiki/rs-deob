import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class277 extends class567 {

    @OriginalMember(owner = "client!vw", name = "D", descriptor = "I")
    public int field3784;

    @OriginalMember(owner = "client!vw", name = "A", descriptor = "Lmq;")
    public static class472 field3783 = new class472(5);

    @OriginalMember(owner = "client!vw", name = "E", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Z)V", line = 5)
    public static void method1676(boolean arg0) {
        if (arg0) {
            method1676(false);
        }
        field3783 = null;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(B)Lsq;", line = 15)
    public final class161 method448(byte arg0) {
        if (arg0 == 25) {
            field3785++;
            return class531.field7748;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lpe;Lop;IIIIIIIIIIIIII)V", line = 34)
    public class277(class564 arg0, class172 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field3784 = arg15;
    }
}
