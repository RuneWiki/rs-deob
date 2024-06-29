import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class176 extends class493 implements class201 {

    @OriginalMember(owner = "client!m", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!m", name = "MA", descriptor = "(Ll;I)V")
    private final native void method1425(class18 arg0, int arg1);

    @OriginalMember(owner = "client!m", name = "D", descriptor = "()V")
    public final native void method1426();

    @OriginalMember(owner = "client!m", name = "UA", descriptor = "(Z)V")
    public final native void method312(boolean arg0);

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "()V")
    public final native void method1427();

    @OriginalMember(owner = "client!m", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class222.method1638(-1, this);
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Ll;I)V")
    public class176(class18 arg0, int arg1) {
        this.method1425(arg0, arg1);
    }
}
