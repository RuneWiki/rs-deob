import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class388 extends class184 implements class532 {

    @OriginalMember(owner = "client!ba", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Loa;)V")
    public class388(class694 arg0) {
    }

    @OriginalMember(owner = "client!ba", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class305.method1997(0, this);
        }
    }

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "(Z)V")
    public final native void method129(boolean arg0);
}
