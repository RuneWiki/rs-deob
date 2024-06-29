import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public class class379 extends class618 implements class200 {

    @OriginalMember(owner = "client!za", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!za", name = "UA", descriptor = "(Z)V")
    public final native void method188(boolean arg0);

    @OriginalMember(owner = "client!za", name = "BA", descriptor = "(Ll;Lm;II[I[I)V")
    private final native void method2171(class18 arg0, class175 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

    @OriginalMember(owner = "client!za", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class429.method2464(-13, this);
        }
    }

    @OriginalMember(owner = "client!za", name = "<init>", descriptor = "(Ll;Lm;II[I[I)V")
    public class379(class18 arg0, class175 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method2171(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
