import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class416 extends class594 implements class439 {

    @OriginalMember(owner = "client!ta", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class75.method437(this, -1);
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(La;Lc;II[I[I)V", line = 10)
    public class416(class329 arg0, class618 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method2477(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ta", name = "DA", descriptor = "(La;Lc;II[I[I)V")
    private final native void method2477(class329 arg0, class618 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

    @OriginalMember(owner = "client!ta", name = "NA", descriptor = "(Z)V")
    public final native void method530(boolean arg0);
}
