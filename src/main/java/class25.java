import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class25 extends class569 {

    @OriginalMember(owner = "client!uv", name = "A", descriptor = "I")
    public int field438;

    @OriginalMember(owner = "client!uv", name = "y", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!uv", name = "z", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)Lqi;")
    public final class669 method271(boolean arg0) {
        if (arg0) {
            this.field438 = -63;
        }
        field437++;
        return class540.field7604;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILkha;)V")
    public static final void method272(int arg0, class687 arg1) {
        if (arg0 >= -80) {
            method272(105, null);
        }
        class726.field10175 = arg1;
        field436++;
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lgq;Lkfa;IIIIIIIIIIIIII)V")
    public class25(class761 arg0, class407 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field438 = arg15;
    }
}
