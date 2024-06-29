import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class489 extends class336 implements class194 {

    @OriginalMember(owner = "client!va", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!va", name = "BA", descriptor = "(Lw;Lg;II[I[I)V")
    private final native void method2904(class69 arg0, class424 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lw;Lg;II[I[I)V")
    public class489(class69 arg0, class424 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method2904(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!va", name = "p", descriptor = "()V")
    public final native void method442();

    @OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class260.method1547(-1, this);
        }
    }
}
