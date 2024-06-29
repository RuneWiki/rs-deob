import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public class class380 extends class617 implements class201 {

    @OriginalMember(owner = "client!za", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!za", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class222.method1638(-1, this);
        }
    }

    @OriginalMember(owner = "client!za", name = "<init>", descriptor = "(Ll;Lm;II[I[I)V", line = 10)
    public class380(class18 arg0, class176 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method2498(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!za", name = "UA", descriptor = "(Z)V")
    public final native void method312(boolean arg0);

    @OriginalMember(owner = "client!za", name = "BA", descriptor = "(Ll;Lm;II[I[I)V")
    private final native void method2498(class18 arg0, class176 arg1, int arg2, int arg3, int[] arg4, int[] arg5);
}
