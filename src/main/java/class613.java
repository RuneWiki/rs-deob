import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class613 extends class686 implements class128 {

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "ZA", descriptor = "()V")
    public final native void method3325();

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lda;I)V")
    public class613(class396 arg0, int arg1) {
        this.method3327(arg0, arg1);
    }

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class29.method241(-125, this);
        }
    }

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(Z)V")
    public final native void method599(boolean arg0);

    @OriginalMember(owner = "client!a", name = "P", descriptor = "()V")
    public final native void method3326();

    @OriginalMember(owner = "client!a", name = "wa", descriptor = "(Lda;I)V")
    private final native void method3327(class396 arg0, int arg1);
}
