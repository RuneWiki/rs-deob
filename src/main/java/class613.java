import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class613 implements class649 {

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "J")
    private long field7735 = 0L;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lj;")
    public class326 field7734;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lxa;")
    public class626 field7733;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIIIIIZZ)V")
    public final void method3183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method3275(this.field7735, this.field7734.nativeid, this.field7733.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method3275(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method3276(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIZZ)V")
    public final void method3182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method3276(this.field7735, this.field7734.nativeid, this.field7733.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Loa;Lj;Lxa;)V")
    public class613(class426 arg0, class326 arg1, class626 arg2) {
        this.field7735 = arg0.nativeid;
        this.field7734 = arg1;
        this.field7733 = arg2;
    }
}
