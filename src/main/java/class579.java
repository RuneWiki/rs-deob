import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class579 extends class37 implements class144 {

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "P", descriptor = "()V")
    public final native void method3177();

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lda;I)V")
    public class579(class57 arg0, int arg1) {
        this.method3179(arg0, arg1);
    }

    @OriginalMember(owner = "client!a", name = "ZA", descriptor = "()V")
    public final native void method3178();

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class550.method3055((byte) -20, this);
        }
    }

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(Z)V")
    public final native void method132(boolean arg0);

    @OriginalMember(owner = "client!a", name = "wa", descriptor = "(Lda;I)V")
    private final native void method3179(class57 arg0, int arg1);
}
