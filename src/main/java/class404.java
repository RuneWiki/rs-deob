import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class404 extends class200 implements class416 {

    @OriginalMember(owner = "client!k", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!k", name = "KA", descriptor = "()V")
    public final native void method2412();

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lc;I)V")
    public class404(class125 arg0, int arg1) {
        this.method2413(arg0, arg1);
    }

    @OriginalMember(owner = "client!k", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class493.method2895(this, false);
        }
    }

    @OriginalMember(owner = "client!k", name = "ta", descriptor = "(Lc;I)V")
    private final native void method2413(class125 arg0, int arg1);

    @OriginalMember(owner = "client!k", name = "d", descriptor = "()V")
    public final native void method2414();

    @OriginalMember(owner = "client!k", name = "pa", descriptor = "()V")
    public final native void method382();
}
