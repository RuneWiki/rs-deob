import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class64 implements class296 {

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "J")
    private long field975 = 0L;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Lj;")
    public class600 field973;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lxa;")
    public class661 field974;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIIIIIZZ)V", line = 7)
    public final void method687(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method686(this.field975, this.field973.nativeid, this.field974.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIZZ)V", line = 12)
    public final void method689(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method688(this.field975, this.field973.nativeid, this.field974.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Loa;Lj;Lxa;)V", line = 18)
    public class64(class473 arg0, class600 arg1, class661 arg2) {
        this.field975 = arg0.nativeid;
        this.field973 = arg1;
        this.field974 = arg2;
    }

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method686(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method688(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);
}
