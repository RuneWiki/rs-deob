import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class494 extends class698 implements class52 {

    @OriginalMember(owner = "client!m", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Ll;I)V", line = 3)
    public class494(class260 arg0, int arg1) {
        this.method2825(arg0, arg1);
    }

    @OriginalMember(owner = "client!m", name = "finalize", descriptor = "()V", line = 9)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class493.method2818(false, this);
        }
    }

    @OriginalMember(owner = "client!m", name = "D", descriptor = "()V")
    public final native void method2823();

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "()V")
    public final native void method2824();

    @OriginalMember(owner = "client!m", name = "MA", descriptor = "(Ll;I)V")
    private final native void method2825(class260 arg0, int arg1);

    @OriginalMember(owner = "client!m", name = "UA", descriptor = "(Z)V")
    public final native void method306(boolean arg0);
}
