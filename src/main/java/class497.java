import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class497 extends class200 implements class28 {

    @OriginalMember(owner = "client!pa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lw;)V", line = 3)
    public class497(class69 arg0) {
    }

    @OriginalMember(owner = "client!pa", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class45.method300(this, 0);
        }
    }

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "()V")
    public final native void method164();
}
