import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class342 implements class344 {

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "J")
    private long field4447 = 0L;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lj;")
    public class319 field4445;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lxa;")
    public class544 field4446;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIIIIIZZ)V", line = 6)
    public final void method335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method2022(this.field4447, this.field4445.nativeid, this.field4446.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIZZ)V", line = 10)
    public final void method332(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method2021(this.field4447, this.field4445.nativeid, this.field4446.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Loa;Lj;Lxa;)V", line = 18)
    public class342(class50 arg0, class319 arg1, class544 arg2) {
        this.field4447 = arg0.nativeid;
        this.field4445 = arg1;
        this.field4446 = arg2;
    }

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method2021(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method2022(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);
}
