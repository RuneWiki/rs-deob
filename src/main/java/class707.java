import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class707 extends class219 implements class145 {

    @OriginalMember(owner = "client!f", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!f", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class368.method2146((byte) -99, this);
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lda;La;II[I[I)V", line = 9)
    public class707(class57 arg0, class579 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method3901(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!f", name = "H", descriptor = "(Z)V")
    public final native void method57(boolean arg0);

    @OriginalMember(owner = "client!f", name = "ba", descriptor = "(Lda;La;II[I[I)V")
    private final native void method3901(class57 arg0, class579 arg1, int arg2, int arg3, int[] arg4, int[] arg5);
}
