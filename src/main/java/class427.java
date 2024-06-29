import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class427 extends class393 implements class28 {

    @OriginalMember(owner = "client!g", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!g", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class45.method300(this, 0);
        }
    }

    @OriginalMember(owner = "client!g", name = "TA", descriptor = "(Lw;I)V")
    private final native void method2662(class69 arg0, int arg1);

    @OriginalMember(owner = "client!g", name = "T", descriptor = "()V")
    public final native void method2663();

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lw;I)V")
    public class427(class69 arg0, int arg1) {
        this.method2662(arg0, arg1);
    }

    @OriginalMember(owner = "client!g", name = "p", descriptor = "()V")
    public final native void method164();

    @OriginalMember(owner = "client!g", name = "IA", descriptor = "()V")
    public final native void method2664();
}
