import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class611 implements class503 {

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "J")
    private long field8366 = 0L;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lj;")
    public class541 field8364;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lxa;")
    public class502 field8365;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIZZ)V", line = 3)
    public final void method2958(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method3470(this.field8366, this.field8364.nativeid, this.field8365.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIIIIIZZ)V", line = 9)
    public final void method2959(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method3469(this.field8366, this.field8364.nativeid, this.field8365.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Loa;Lj;Lxa;)V", line = 17)
    public class611(class694 arg0, class541 arg1, class502 arg2) {
        this.field8366 = arg0.nativeid;
        this.field8364 = arg1;
        this.field8365 = arg2;
    }

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method3469(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method3470(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);
}
