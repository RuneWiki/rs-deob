import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class336 extends class269 implements class142 {

    @OriginalMember(owner = "client!pa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!pa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class409.method2220(this, (byte) 83);
        }
    }

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "(Z)V")
    public final native void method59(boolean arg0);

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lda;)V")
    public class336(class56 arg0) {
    }
}
