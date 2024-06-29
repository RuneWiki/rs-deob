import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class104 extends class423 implements class415 {

    @OriginalMember(owner = "client!d", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!d", name = "pa", descriptor = "()V")
    public final native void method304();

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lc;)V")
    public class104(class124 arg0) {
    }

    @OriginalMember(owner = "client!d", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class93.method626(this, 0);
        }
    }
}
