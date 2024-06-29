import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class179 extends class309 implements class28 {

    @OriginalMember(owner = "client!ta", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class49.method261(0, this);
        }
    }

    @OriginalMember(owner = "client!ta", name = "DA", descriptor = "(La;Lc;II[I[I)V")
    private final native void method986(class526 arg0, class158 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

    @OriginalMember(owner = "client!ta", name = "NA", descriptor = "(Z)V")
    public final native void method61(boolean arg0);

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(La;Lc;II[I[I)V")
    public class179(class526 arg0, class158 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method986(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
