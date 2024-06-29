import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class500 extends class120 implements class251 {

    @OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Ll;)V", line = 3)
    public class500(class172 arg0) {
    }

    @OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class402.method2265(-100, this);
        }
    }

    @OriginalMember(owner = "client!h", name = "UA", descriptor = "(Z)V")
    public final native void method484(boolean arg0);
}
