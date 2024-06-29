import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class108 extends class15 implements class350 {

    @OriginalMember(owner = "client!g", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!g", name = "TA", descriptor = "(Lw;I)V")
    private final native void method670(class197 arg0, int arg1);

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lw;I)V")
    public class108(class197 arg0, int arg1) {
        this.method670(arg0, arg1);
    }

    @OriginalMember(owner = "client!g", name = "T", descriptor = "()V")
    public final native void method671();

    @OriginalMember(owner = "client!g", name = "IA", descriptor = "()V")
    public final native void method672();

    @OriginalMember(owner = "client!g", name = "p", descriptor = "()V")
    public final native void method426();

    @OriginalMember(owner = "client!g", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class269.method1636(this, true);
        }
    }
}
