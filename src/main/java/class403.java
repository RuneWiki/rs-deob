import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class403 extends class198 implements class415 {

    @OriginalMember(owner = "client!k", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!k", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class93.method626(this, 0);
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lc;I)V", line = 12)
    public class403(class124 arg0, int arg1) {
        this.method2488(arg0, arg1);
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "()V")
    public final native void method2486();

    @OriginalMember(owner = "client!k", name = "KA", descriptor = "()V")
    public final native void method2487();

    @OriginalMember(owner = "client!k", name = "pa", descriptor = "()V")
    public final native void method304();

    @OriginalMember(owner = "client!k", name = "ta", descriptor = "(Lc;I)V")
    private final native void method2488(class124 arg0, int arg1);
}
