import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class566 extends class37 implements class141 {

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class373.method2177(this, (byte) -27);
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lda;I)V", line = 12)
    public class566(class55 arg0, int arg1) {
        this.method3133(arg0, arg1);
    }

    @OriginalMember(owner = "client!a", name = "ZA", descriptor = "()V")
    public final native void method3131();

    @OriginalMember(owner = "client!a", name = "P", descriptor = "()V")
    public final native void method3132();

    @OriginalMember(owner = "client!a", name = "wa", descriptor = "(Lda;I)V")
    private final native void method3133(class55 arg0, int arg1);

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(Z)V")
    public final native void method58(boolean arg0);
}
