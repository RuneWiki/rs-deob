import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class311 extends class709 implements class2 {

    @OriginalMember(owner = "client!ba", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "(Z)V")
    public final native void method12(boolean arg0);

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Loa;)V")
    public class311(class408 arg0) {
    }

    @OriginalMember(owner = "client!ba", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class556.method3276((byte) -10, this);
        }
    }
}
