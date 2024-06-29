import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class106 extends class381 implements class247 {

    @OriginalMember(owner = "client!m", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!m", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class69.method386(-1995, this);
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Ll;I)V", line = 10)
    public class106(class168 arg0, int arg1) {
        this.method580(arg0, arg1);
    }

    @OriginalMember(owner = "client!m", name = "MA", descriptor = "(Ll;I)V")
    private final native void method580(class168 arg0, int arg1);

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "()V")
    public final native void method581();

    @OriginalMember(owner = "client!m", name = "UA", descriptor = "(Z)V")
    public final native void method528(boolean arg0);

    @OriginalMember(owner = "client!m", name = "D", descriptor = "()V")
    public final native void method582();
}
