import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class448 extends class521 implements class400 {

    @OriginalMember(owner = "client!pa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!pa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class431.method2721(this, false);
        }
    }

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "()V")
    public final native void method175();

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lw;)V")
    public class448(class459 arg0) {
    }
}
