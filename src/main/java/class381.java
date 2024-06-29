import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public class class381 extends class616 implements class199 {

    @OriginalMember(owner = "client!za", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!za", name = "BA", descriptor = "(Ll;Lm;II[I[I)V")
    private final native void method2202(class18 arg0, class174 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

    @OriginalMember(owner = "client!za", name = "UA", descriptor = "(Z)V")
    public final native void method221(boolean arg0);

    @OriginalMember(owner = "client!za", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class542.method3175(this, 0);
        }
    }

    @OriginalMember(owner = "client!za", name = "<init>", descriptor = "(Ll;Lm;II[I[I)V")
    public class381(class18 arg0, class174 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method2202(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
