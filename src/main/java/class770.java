import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class770 extends class348 implements class65 {

    @OriginalMember(owner = "client!ya", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class579.method4297(this, 126);
        }
    }

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(Loa;I)V", line = 12)
    public class770(class473 arg0, int arg1) {
        this.method5555(arg0, arg1);
    }

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
    public final native void method5553();

    @OriginalMember(owner = "client!ya", name = "ga", descriptor = "()V")
    public final native void method5554();

    @OriginalMember(owner = "client!ya", name = "w", descriptor = "(Z)V")
    public final native void method690(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "(Loa;I)V")
    private final native void method5555(class473 arg0, int arg1);
}
