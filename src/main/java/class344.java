import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class344 extends class279 implements class145 {

    @OriginalMember(owner = "client!pa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!pa", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class368.method2146((byte) -99, this);
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lda;)V", line = 9)
    public class344(class57 arg0) {
    }

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "(Z)V")
    public final native void method57(boolean arg0);
}
