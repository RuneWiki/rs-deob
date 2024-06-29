import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class638 implements class769 {

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "J")
    private long field9134 = 0L;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lj;")
    public class569 field9135;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lxa;")
    public class529 field9136;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIZZ)V", line = 7)
    public final void method3587(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method4615(this.field9134, this.field9135.nativeid, this.field9136.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Loa;Lj;Lxa;)V", line = 18)
    public class638(class725 arg0, class569 arg1, class529 arg2) {
        this.field9134 = arg0.nativeid;
        this.field9135 = arg1;
        this.field9136 = arg2;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIIIIIZZ)V", line = 13)
    public final void method3585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method4614(this.field9134, this.field9135.nativeid, this.field9136.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method4614(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method4615(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);
}
