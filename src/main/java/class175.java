import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class175 extends class493 implements class200 {

    @OriginalMember(owner = "client!m", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!m", name = "MA", descriptor = "(Ll;I)V")
    private final native void method1228(class18 arg0, int arg1);

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "()V")
    public final native void method1229();

    @OriginalMember(owner = "client!m", name = "D", descriptor = "()V")
    public final native void method1230();

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Ll;I)V")
    public class175(class18 arg0, int arg1) {
        this.method1228(arg0, arg1);
    }

    @OriginalMember(owner = "client!m", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class429.method2464(-13, this);
        }
    }

    @OriginalMember(owner = "client!m", name = "UA", descriptor = "(Z)V")
    public final native void method188(boolean arg0);
}
