import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class424 extends class391 implements class194 {

    @OriginalMember(owner = "client!g", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!g", name = "T", descriptor = "()V")
    public final native void method2531();

    @OriginalMember(owner = "client!g", name = "TA", descriptor = "(Lw;I)V")
    private final native void method2532(class69 arg0, int arg1);

    @OriginalMember(owner = "client!g", name = "IA", descriptor = "()V")
    public final native void method2533();

    @OriginalMember(owner = "client!g", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class260.method1547(-1, this);
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lw;I)V")
    public class424(class69 arg0, int arg1) {
        this.method2532(arg0, arg1);
    }

    @OriginalMember(owner = "client!g", name = "p", descriptor = "()V")
    public final native void method442();
}
