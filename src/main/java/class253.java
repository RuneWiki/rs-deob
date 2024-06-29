import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class253 extends class31 implements class130 {

    @OriginalMember(owner = "client!pa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!pa", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class512.method3054(100, this);
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lw;)V", line = 9)
    public class253(class199 arg0) {
    }

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "()V")
    public final native void method540();
}
