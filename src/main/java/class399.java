import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public class class399 extends class598 implements class251 {

    @OriginalMember(owner = "client!za", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!za", name = "UA", descriptor = "(Z)V")
    public final native void method484(boolean arg0);

    @OriginalMember(owner = "client!za", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class402.method2265(-34, this);
        }
    }

    @OriginalMember(owner = "client!za", name = "<init>", descriptor = "(Ll;Lm;II[I[I)V")
    public class399(class172 arg0, class109 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method2250(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!za", name = "BA", descriptor = "(Ll;Lm;II[I[I)V")
    private final native void method2250(class172 arg0, class109 arg1, int arg2, int arg3, int[] arg4, int[] arg5);
}
