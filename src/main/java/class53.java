import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class53 extends class416 implements class533 {

    @OriginalMember(owner = "client!ya", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ya", name = "ga", descriptor = "()V")
    public final native void method309();

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class280.method1680(false, this);
        }
    }

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
    public final native void method310();

    @OriginalMember(owner = "client!ya", name = "w", descriptor = "(Z)V")
    public final native void method73(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "(Loa;I)V")
    private final native void method311(class694 arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(Loa;I)V")
    public class53(class694 arg0, int arg1) {
        this.method311(arg0, arg1);
    }
}
