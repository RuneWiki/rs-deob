import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class496 extends class698 implements class52 {

    @OriginalMember(owner = "client!m", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Ll;I)V", line = 4)
    public class496(class261 arg0, int arg1) {
        this.method2975(arg0, arg1);
    }

    @OriginalMember(owner = "client!m", name = "finalize", descriptor = "()V", line = 11)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class388.method2372(this, 0);
        }
    }

    @OriginalMember(owner = "client!m", name = "MA", descriptor = "(Ll;I)V")
    private final native void method2975(class261 arg0, int arg1);

    @OriginalMember(owner = "client!m", name = "UA", descriptor = "(Z)V")
    public final native void method411(boolean arg0);

    @OriginalMember(owner = "client!m", name = "D", descriptor = "()V")
    public final native void method2976();

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "()V")
    public final native void method2977();
}
