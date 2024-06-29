import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class434 extends class185 implements class89 {

    @OriginalMember(owner = "client!f", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lda;La;II[I[I)V", line = 4)
    public class434(class682 arg0, class405 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method2497(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!f", name = "finalize", descriptor = "()V", line = 9)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class146.method989((byte) 89, this);
        }
    }

    @OriginalMember(owner = "client!f", name = "H", descriptor = "(Z)V")
    public final native void method80(boolean arg0);

    @OriginalMember(owner = "client!f", name = "ba", descriptor = "(Lda;La;II[I[I)V")
    private final native void method2497(class682 arg0, class405 arg1, int arg2, int arg3, int[] arg4, int[] arg5);
}
