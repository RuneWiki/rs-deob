import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class179 extends class310 implements class27 {

    @OriginalMember(owner = "client!ta", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class138.method926(this, -1);
        }
    }

    @OriginalMember(owner = "client!ta", name = "DA", descriptor = "(La;Lc;II[I[I)V")
    private final native void method1132(class530 arg0, class158 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

    @OriginalMember(owner = "client!ta", name = "NA", descriptor = "(Z)V")
    public final native void method134(boolean arg0);

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(La;Lc;II[I[I)V")
    public class179(class530 arg0, class158 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method1132(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
