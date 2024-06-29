import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class638 implements class574 {

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "J")
    private long field8797 = 0L;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lj;")
    public class569 field8796;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lxa;")
    public class529 field8795;

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method3559(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method3560(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIIIIIZZ)V")
    public final void method2768(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method3559(this.field8797, this.field8796.nativeid, this.field8795.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Loa;Lj;Lxa;)V")
    public class638(class723 arg0, class569 arg1, class529 arg2) {
        this.field8797 = arg0.nativeid;
        this.field8796 = arg1;
        this.field8795 = arg2;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIZZ)V")
    public final void method2769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method3560(this.field8797, this.field8796.nativeid, this.field8795.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }
}
