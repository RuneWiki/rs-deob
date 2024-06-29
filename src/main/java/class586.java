import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class586 implements class86 {

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "J")
    private long field8359 = 0L;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lj;")
    public class307 field8357;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lxa;")
    public class599 field8358;

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method3450(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method3451(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIIIIIZZ)V")
    public final void method687(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method3451(this.field8359, this.field8357.nativeid, this.field8358.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Loa;Lj;Lxa;)V")
    public class586(class406 arg0, class307 arg1, class599 arg2) {
        this.field8359 = arg0.nativeid;
        this.field8357 = arg1;
        this.field8358 = arg2;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIZZ)V")
    public final void method686(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method3450(this.field8359, this.field8357.nativeid, this.field8358.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }
}
