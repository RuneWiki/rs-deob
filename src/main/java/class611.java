import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class611 implements class23 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "J")
    private long field8144 = 0L;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Lj;")
    public class542 field8146;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lxa;")
    public class504 field8145;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIIIIIZZ)V", line = 3)
    public final void method233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method3329(this.field8144, this.field8146.nativeid, this.field8145.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Loa;Lj;Lxa;)V", line = 18)
    public class611(class695 arg0, class542 arg1, class504 arg2) {
        this.field8144 = arg0.nativeid;
        this.field8146 = arg1;
        this.field8145 = arg2;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIZZ)V", line = 16)
    public final void method232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method3328(this.field8144, this.field8146.nativeid, this.field8145.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method3328(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method3329(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);
}
