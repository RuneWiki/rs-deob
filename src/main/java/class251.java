import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class251 extends class31 implements class350 {

    @OriginalMember(owner = "client!pa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lw;)V")
    public class251(class197 arg0) {
    }

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "()V")
    public final native void method426();

    @OriginalMember(owner = "client!pa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class269.method1636(this, true);
        }
    }
}
