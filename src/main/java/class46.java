import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class46 extends class487 implements class532 {

    @OriginalMember(owner = "client!na", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "(Z)V")
    public final native void method129(boolean arg0);

    @OriginalMember(owner = "client!na", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class305.method1997(0, this);
        }
    }

    @OriginalMember(owner = "client!na", name = "ma", descriptor = "(Loa;Lya;II[I[I)V")
    private final native void method547(class694 arg0, class52 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Loa;Lya;II[I[I)V")
    public class46(class694 arg0, class52 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method547(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
