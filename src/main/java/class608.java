import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class608 implements class116 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "J")
    private long field8818 = 0L;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lj;")
    public class538 field8819;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Lxa;")
    public class499 field8820;

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method3514(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method3515(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIIIIIZZ)V")
    public final void method124(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method3514(this.field8818, this.field8819.nativeid, this.field8820.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIZZ)V")
    public final void method123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method3515(this.field8818, this.field8819.nativeid, this.field8820.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Loa;Lj;Lxa;)V")
    public class608(class691 arg0, class538 arg1, class499 arg2) {
        this.field8818 = arg0.nativeid;
        this.field8819 = arg1;
        this.field8820 = arg2;
    }
}
