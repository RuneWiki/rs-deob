import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class45 extends class486 implements class532 {

    @OriginalMember(owner = "client!na", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!na", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class198.method1216((byte) 123, this);
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Loa;Lya;II[I[I)V", line = 8)
    public class45(class693 arg0, class51 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method299(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!na", name = "ma", descriptor = "(Loa;Lya;II[I[I)V")
    private final native void method299(class693 arg0, class51 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

    @OriginalMember(owner = "client!na", name = "w", descriptor = "(Z)V")
    public final native void method106(boolean arg0);
}
