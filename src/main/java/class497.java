import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class497 extends class117 implements class247 {

    @OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class69.method386(-1995, this);
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Ll;)V", line = 8)
    public class497(class168 arg0) {
    }

    @OriginalMember(owner = "client!h", name = "UA", descriptor = "(Z)V")
    public final native void method528(boolean arg0);
}
