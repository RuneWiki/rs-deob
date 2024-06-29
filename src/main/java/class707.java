import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class707 extends class217 implements class144 {

    @OriginalMember(owner = "client!f", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!f", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class550.method3055((byte) -20, this);
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lda;La;II[I[I)V", line = 10)
    public class707(class57 arg0, class579 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method3900(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!f", name = "H", descriptor = "(Z)V")
    public final native void method132(boolean arg0);

    @OriginalMember(owner = "client!f", name = "ba", descriptor = "(Lda;La;II[I[I)V")
    private final native void method3900(class57 arg0, class579 arg1, int arg2, int arg3, int[] arg4, int[] arg5);
}
