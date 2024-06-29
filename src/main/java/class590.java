import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class590 implements class5 {

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "J")
    private long field8032 = 0L;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lj;")
    public class309 field8030;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lxa;")
    public class603 field8031;

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method3401(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIZZ)V")
    public final void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method3401(this.field8032, this.field8030.nativeid, this.field8031.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method3402(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIIIIIZZ)V")
    public final void method26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method3402(this.field8032, this.field8030.nativeid, this.field8031.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Loa;Lj;Lxa;)V")
    public class590(class408 arg0, class309 arg1, class603 arg2) {
        this.field8032 = arg0.nativeid;
        this.field8030 = arg1;
        this.field8031 = arg2;
    }
}
