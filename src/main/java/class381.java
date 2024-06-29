import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class381 extends class578 {

    @OriginalMember(owner = "client!uv", name = "y", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!uv", name = "z", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIII)V", line = 5)
    public final void method1980(int arg0, int arg1, int arg2, int arg3) {
        super.field8174 = arg2;
        super.field8165 = arg0;
        super.field8177 = arg3;
        if (arg1 == 0) {
            ++field5459;
        }
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(IIIIIF)V", line = 19)
    public class381(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IF)V", line = 23)
    public final void method1981(int arg0, float arg1) {
        ++field5460;
        super.field8169 = arg1;
        int var3 = 114 / ((arg0 - -28) / 52);
    }
}
