import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class404 extends class453 implements class400 {

    @OriginalMember(owner = "client!va", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "()V")
    public final native void method175();

    @OriginalMember(owner = "client!va", name = "BA", descriptor = "(Lw;Lg;II[I[I)V")
    private final native void method2597(class459 arg0, class97 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

    @OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class431.method2721(this, false);
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lw;Lg;II[I[I)V")
    public class404(class459 arg0, class97 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method2597(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
