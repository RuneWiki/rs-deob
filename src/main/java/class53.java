import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class53 extends class416 implements class535 {

    @OriginalMember(owner = "client!ya", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "(Loa;I)V")
    private final native void method396(class696 arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class166.method1167(this, -1);
        }
    }

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
    public final native void method397();

    @OriginalMember(owner = "client!ya", name = "ga", descriptor = "()V")
    public final native void method398();

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(Loa;I)V")
    public class53(class696 arg0, int arg1) {
        this.method396(arg0, arg1);
    }

    @OriginalMember(owner = "client!ya", name = "w", descriptor = "(Z)V")
    public final native void method123(boolean arg0);
}
