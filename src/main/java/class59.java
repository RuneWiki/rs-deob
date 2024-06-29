import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class59 extends class432 implements class556 {

    @OriginalMember(owner = "client!ya", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class349.method2206(60, this);
        }
    }

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(Loa;I)V", line = 12)
    public class59(class721 arg0, int arg1) {
        this.method369(arg0, arg1);
    }

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
    public final native void method367();

    @OriginalMember(owner = "client!ya", name = "ga", descriptor = "()V")
    public final native void method368();

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "(Loa;I)V")
    private final native void method369(class721 arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "w", descriptor = "(Z)V")
    public final native void method156(boolean arg0);
}
