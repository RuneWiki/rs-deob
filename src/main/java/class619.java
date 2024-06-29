import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class619 extends class425 implements class439 {

    @OriginalMember(owner = "client!c", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!c", name = "NA", descriptor = "(Z)V")
    public final native void method503(boolean arg0);

    @OriginalMember(owner = "client!c", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class243.method1506(this, 0);
        }
    }

    @OriginalMember(owner = "client!c", name = "za", descriptor = "()V")
    public final native void method3551();

    @OriginalMember(owner = "client!c", name = "O", descriptor = "()V")
    public final native void method3552();

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(La;I)V")
    public class619(class328 arg0, int arg1) {
        this.method3553(arg0, arg1);
    }

    @OriginalMember(owner = "client!c", name = "v", descriptor = "(La;I)V")
    private final native void method3553(class328 arg0, int arg1);
}
