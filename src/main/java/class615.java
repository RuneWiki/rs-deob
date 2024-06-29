import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class615 extends class54 implements class199 {

    @OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class542.method3175(this, 0);
        }
    }

    @OriginalMember(owner = "client!h", name = "UA", descriptor = "(Z)V")
    public final native void method221(boolean arg0);

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Ll;)V")
    public class615(class18 arg0) {
    }
}
