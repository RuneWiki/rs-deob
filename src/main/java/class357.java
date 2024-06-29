import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class357 implements class730 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "J")
    private long field5072 = 0L;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Lj;")
    public class332 field5074;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lxa;")
    public class571 field5073;

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Loa;Lj;Lxa;)V", line = 16)
    public class357(class53 arg0, class332 arg1, class571 arg2) {
        this.field5072 = arg0.nativeid;
        this.field5074 = arg1;
        this.field5073 = arg2;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIIIIIZZ)V", line = 8)
    public final void method2161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method2160(this.field5072, this.field5074.nativeid, this.field5073.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIZZ)V", line = 13)
    public final void method2163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.method2162(this.field5072, this.field5074.nativeid, this.field5073.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method2160(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "(JJJIIIIIIZZ)V")
    private final native void method2162(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);
}
