import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class612 implements class657 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "J")
    private long field8592 = 0L;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lj;")
    public class542 field8593;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Lxa;")
    public class502 field8594;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIZZ)V", line = 5)
    public final void method3450(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method3452(this.field8592, this.field8593.nativeid, this.field8594.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Loa;Lj;Lxa;)V", line = 15)
    public class612(class694 arg0, class542 arg1, class502 arg2) {
        this.field8592 = arg0.nativeid;
        this.field8593 = arg1;
        this.field8594 = arg2;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIIIIIZZ)V", line = 21)
    public final void method3453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method3451(this.field8592, this.field8593.nativeid, this.field8594.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method3451(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method3452(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);
}
