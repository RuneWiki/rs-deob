import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public class class650 extends class591 implements class52 {

    @OriginalMember(owner = "client!za", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!za", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class493.method2818(false, this);
        }
    }

    @OriginalMember(owner = "client!za", name = "<init>", descriptor = "(Ll;Lm;II[I[I)V")
    public class650(class260 arg0, class494 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method3685(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!za", name = "UA", descriptor = "(Z)V")
    public final native void method306(boolean arg0);

    @OriginalMember(owner = "client!za", name = "BA", descriptor = "(Ll;Lm;II[I[I)V")
    private final native void method3685(class260 arg0, class494 arg1, int arg2, int arg3, int[] arg4, int[] arg5);
}
