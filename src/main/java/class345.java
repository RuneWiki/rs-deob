import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class345 extends class144 implements class350 {

    @OriginalMember(owner = "client!va", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class269.method1636(this, true);
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lw;Lg;II[I[I)V", line = 10)
    public class345(class197 arg0, class108 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method2002(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!va", name = "BA", descriptor = "(Lw;Lg;II[I[I)V")
    private final native void method2002(class197 arg0, class108 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

    @OriginalMember(owner = "client!va", name = "p", descriptor = "()V")
    public final native void method426();
}
