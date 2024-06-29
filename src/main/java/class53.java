import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class53 extends class415 implements class534 {

    @OriginalMember(owner = "client!ya", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(Loa;I)V", line = 5)
    public class53(class696 arg0, int arg1) {
        this.method377(arg0, arg1);
    }

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V", line = 11)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class161.method1176(this, 0);
        }
    }

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
    public final native void method376();

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "(Loa;I)V")
    private final native void method377(class696 arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "ga", descriptor = "()V")
    public final native void method378();

    @OriginalMember(owner = "client!ya", name = "w", descriptor = "(Z)V")
    public final native void method105(boolean arg0);
}
