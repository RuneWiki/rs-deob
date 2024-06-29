import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class688 extends class213 implements class142 {

    @OriginalMember(owner = "client!f", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!f", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class409.method2220(this, (byte) 83);
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lda;La;II[I[I)V", line = 10)
    public class688(class56 arg0, class564 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method3820(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!f", name = "ba", descriptor = "(Lda;La;II[I[I)V")
    private final native void method3820(class56 arg0, class564 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

    @OriginalMember(owner = "client!f", name = "H", descriptor = "(Z)V")
    public final native void method59(boolean arg0);
}
