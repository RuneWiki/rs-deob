import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class404 extends class192 implements class556 {

    @OriginalMember(owner = "client!ba", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Loa;)V", line = 3)
    public class404(class721 arg0) {
    }

    @OriginalMember(owner = "client!ba", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class349.method2206(18, this);
        }
    }

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "(Z)V")
    public final native void method156(boolean arg0);
}
