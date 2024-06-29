import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class610 implements class339 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "J")
    private long field8573 = 0L;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Lj;")
    public class541 field8575;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lxa;")
    public class501 field8574;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIIIIIZZ)V", line = 3)
    public final void method2195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method3430(this.field8573, this.field8575.nativeid, this.field8574.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIZZ)V", line = 9)
    public final void method2194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method3431(this.field8573, this.field8575.nativeid, this.field8574.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Loa;Lj;Lxa;)V", line = 18)
    public class610(class693 arg0, class541 arg1, class501 arg2) {
        this.field8573 = arg0.nativeid;
        this.field8575 = arg1;
        this.field8574 = arg2;
    }

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method3430(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method3431(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);
}
