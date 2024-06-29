import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class443 extends class515 implements class242 {

    @OriginalMember(owner = "client!pa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "()V")
    public final native void method224();

    @OriginalMember(owner = "client!pa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class248.method1686(false, this);
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lw;)V")
    public class443(class454 arg0) {
    }
}
