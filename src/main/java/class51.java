import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class51 extends class413 implements class531 {

    @OriginalMember(owner = "client!ya", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ya", name = "w", descriptor = "(Z)V")
    public final native void method83(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "(Loa;I)V")
    private final native void method294(class692 arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
    public final native void method295();

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class684.method3871(this, true);
        }
    }

    @OriginalMember(owner = "client!ya", name = "ga", descriptor = "()V")
    public final native void method296();

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(Loa;I)V")
    public class51(class692 arg0, int arg1) {
        this.method294(arg0, arg1);
    }
}
