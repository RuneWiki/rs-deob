import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class96 extends class511 implements class242 {

    @OriginalMember(owner = "client!g", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "()V")
    public final native void method224();

    @OriginalMember(owner = "client!g", name = "TA", descriptor = "(Lw;I)V")
    private final native void method668(class454 arg0, int arg1);

    @OriginalMember(owner = "client!g", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class248.method1686(false, this);
        }
    }

    @OriginalMember(owner = "client!g", name = "T", descriptor = "()V")
    public final native void method669();

    @OriginalMember(owner = "client!g", name = "IA", descriptor = "()V")
    public final native void method670();

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lw;I)V")
    public class96(class454 arg0, int arg1) {
        this.method668(arg0, arg1);
    }
}
