import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class349 extends class145 implements class130 {

    @OriginalMember(owner = "client!va", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class512.method3054(76, this);
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lw;Lg;II[I[I)V", line = 8)
    public class349(class199 arg0, class109 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method2065(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!va", name = "p", descriptor = "()V")
    public final native void method540();

    @OriginalMember(owner = "client!va", name = "BA", descriptor = "(Lw;Lg;II[I[I)V")
    private final native void method2065(class199 arg0, class109 arg1, int arg2, int arg3, int[] arg4, int[] arg5);
}
