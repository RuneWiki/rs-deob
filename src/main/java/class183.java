import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class183 extends class451 implements class89 {

    @OriginalMember(owner = "client!pa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!pa", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class146.method989((byte) 89, this);
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lda;)V", line = 9)
    public class183(class682 arg0) {
    }

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "(Z)V")
    public final native void method80(boolean arg0);
}
