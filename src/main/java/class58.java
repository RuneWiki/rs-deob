import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class58 extends class437 implements class559 {

    @OriginalMember(owner = "client!ya", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ya", name = "w", descriptor = "(Z)V")
    public final native void method151(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
    public final native void method410();

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class552.method3121(this, (byte) 20);
        }
    }

    @OriginalMember(owner = "client!ya", name = "ga", descriptor = "()V")
    public final native void method411();

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "(Loa;I)V")
    private final native void method412(class724 arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(Loa;I)V")
    public class58(class724 arg0, int arg1) {
        this.method412(arg0, arg1);
    }
}
