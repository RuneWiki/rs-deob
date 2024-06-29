import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class346 extends class144 implements class294 {

    @OriginalMember(owner = "client!va", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class157.method1134((byte) 96, this);
        }
    }

    @OriginalMember(owner = "client!va", name = "p", descriptor = "()V")
    public final native void method615();

    @OriginalMember(owner = "client!va", name = "BA", descriptor = "(Lw;Lg;II[I[I)V")
    private final native void method2165(class197 arg0, class109 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lw;Lg;II[I[I)V")
    public class346(class197 arg0, class109 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method2165(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
