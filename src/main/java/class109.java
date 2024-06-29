import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class109 extends class385 implements class251 {

    @OriginalMember(owner = "client!m", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!m", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class402.method2265(-39, this);
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Ll;I)V", line = 10)
    public class109(class172 arg0, int arg1) {
        this.method591(arg0, arg1);
    }

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "()V")
    public final native void method589();

    @OriginalMember(owner = "client!m", name = "D", descriptor = "()V")
    public final native void method590();

    @OriginalMember(owner = "client!m", name = "MA", descriptor = "(Ll;I)V")
    private final native void method591(class172 arg0, int arg1);

    @OriginalMember(owner = "client!m", name = "UA", descriptor = "(Z)V")
    public final native void method484(boolean arg0);
}
