import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class416 extends class594 implements class439 {

    @OriginalMember(owner = "client!ta", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ta", name = "NA", descriptor = "(Z)V")
    public final native void method503(boolean arg0);

    @OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class243.method1506(this, 0);
        }
    }

    @OriginalMember(owner = "client!ta", name = "DA", descriptor = "(La;Lc;II[I[I)V")
    private final native void method2476(class328 arg0, class619 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(La;Lc;II[I[I)V")
    public class416(class328 arg0, class619 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method2476(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
