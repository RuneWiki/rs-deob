import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class59 extends class437 implements class560 {

    @OriginalMember(owner = "client!ya", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class86.method690(this, (byte) 26);
        }
    }

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(Loa;I)V", line = 11)
    public class59(class723 arg0, int arg1) {
        this.method416(arg0, arg1);
    }

    @OriginalMember(owner = "client!ya", name = "w", descriptor = "(Z)V")
    public final native void method131(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "ga", descriptor = "()V")
    public final native void method414();

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
    public final native void method415();

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "(Loa;I)V")
    private final native void method416(class723 arg0, int arg1);
}
