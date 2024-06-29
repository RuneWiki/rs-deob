import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class612 implements class554 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "J")
    private long field8472 = 0L;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Lj;")
    public class544 field8474;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lxa;")
    public class504 field8473;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIZZ)V", line = 4)
    public final void method2343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method3433(this.field8472, this.field8474.nativeid, this.field8473.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Loa;Lj;Lxa;)V", line = 18)
    public class612(class696 arg0, class544 arg1, class504 arg2) {
        this.field8472 = arg0.nativeid;
        this.field8474 = arg1;
        this.field8473 = arg2;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIIIIIZZ)V", line = 12)
    public final void method2341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method3432(this.field8472, this.field8474.nativeid, this.field8473.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method3432(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method3433(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);
}
