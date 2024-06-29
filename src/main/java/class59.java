import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class59 extends class434 implements class557 {

    @OriginalMember(owner = "client!ya", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "(Loa;I)V")
    private final native void method399(class722 arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "w", descriptor = "(Z)V")
    public final native void method211(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "ga", descriptor = "()V")
    public final native void method400();

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class196.method1359(this, (byte) 90);
        }
    }

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
    public final native void method401();

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(Loa;I)V")
    public class59(class722 arg0, int arg1) {
        this.method399(arg0, arg1);
    }
}
