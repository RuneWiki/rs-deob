import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class618 extends class424 implements class438 {

    @OriginalMember(owner = "client!c", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!c", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class124.method989(-102, this);
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(La;I)V", line = 12)
    public class618(class326 arg0, int arg1) {
        this.method3498(arg0, arg1);
    }

    @OriginalMember(owner = "client!c", name = "NA", descriptor = "(Z)V")
    public final native void method810(boolean arg0);

    @OriginalMember(owner = "client!c", name = "za", descriptor = "()V")
    public final native void method3496();

    @OriginalMember(owner = "client!c", name = "O", descriptor = "()V")
    public final native void method3497();

    @OriginalMember(owner = "client!c", name = "v", descriptor = "(La;I)V")
    private final native void method3498(class326 arg0, int arg1);
}
