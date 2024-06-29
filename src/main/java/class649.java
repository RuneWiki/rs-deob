import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public class class649 extends class591 implements class52 {

    @OriginalMember(owner = "client!za", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!za", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class388.method2372(this, 0);
        }
    }

    @OriginalMember(owner = "client!za", name = "<init>", descriptor = "(Ll;Lm;II[I[I)V", line = 10)
    public class649(class261 arg0, class496 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method3638(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!za", name = "UA", descriptor = "(Z)V")
    public final native void method411(boolean arg0);

    @OriginalMember(owner = "client!za", name = "BA", descriptor = "(Ll;Lm;II[I[I)V")
    private final native void method3638(class261 arg0, class496 arg1, int arg2, int arg3, int[] arg4, int[] arg5);
}
