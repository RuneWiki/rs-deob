import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public class class395 extends class596 implements class247 {

    @OriginalMember(owner = "client!za", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!za", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class69.method386(-1995, this);
        }
    }

    @OriginalMember(owner = "client!za", name = "BA", descriptor = "(Ll;Lm;II[I[I)V")
    private final native void method2271(class168 arg0, class106 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

    @OriginalMember(owner = "client!za", name = "<init>", descriptor = "(Ll;Lm;II[I[I)V")
    public class395(class168 arg0, class106 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method2271(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!za", name = "UA", descriptor = "(Z)V")
    public final native void method528(boolean arg0);
}
