import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class56 extends class437 implements class560 {

    @OriginalMember(owner = "client!ya", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(Loa;I)V", line = 5)
    public class56(class725 arg0, int arg1) {
        this.method566(arg0, arg1);
    }

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V", line = 11)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class377.method3103(this, false);
        }
    }

    @OriginalMember(owner = "client!ya", name = "ga", descriptor = "()V")
    public final native void method564();

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
    public final native void method565();

    @OriginalMember(owner = "client!ya", name = "w", descriptor = "(Z)V")
    public final native void method121(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "(Loa;I)V")
    private final native void method566(class725 arg0, int arg1);
}
