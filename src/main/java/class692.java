import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class692 extends class212 implements class141 {

    @OriginalMember(owner = "client!f", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!f", name = "ba", descriptor = "(Lda;La;II[I[I)V")
    private final native void method3804(class55 arg0, class566 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lda;La;II[I[I)V")
    public class692(class55 arg0, class566 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method3804(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!f", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class373.method2177(this, (byte) -27);
        }
    }

    @OriginalMember(owner = "client!f", name = "H", descriptor = "(Z)V")
    public final native void method58(boolean arg0);
}
