import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class618 extends class425 implements class439 {

    @OriginalMember(owner = "client!c", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(La;I)V", line = 5)
    public class618(class329 arg0, int arg1) {
        this.method3581(arg0, arg1);
    }

    @OriginalMember(owner = "client!c", name = "finalize", descriptor = "()V", line = 11)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class75.method437(this, -1);
        }
    }

    @OriginalMember(owner = "client!c", name = "O", descriptor = "()V")
    public final native void method3579();

    @OriginalMember(owner = "client!c", name = "za", descriptor = "()V")
    public final native void method3580();

    @OriginalMember(owner = "client!c", name = "NA", descriptor = "(Z)V")
    public final native void method530(boolean arg0);

    @OriginalMember(owner = "client!c", name = "v", descriptor = "(La;I)V")
    private final native void method3581(class329 arg0, int arg1);
}
