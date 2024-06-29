import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class617 extends class54 implements class200 {

    @OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Ll;)V", line = 4)
    public class617(class18 arg0) {
    }

    @OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class429.method2464(-88, this);
        }
    }

    @OriginalMember(owner = "client!h", name = "UA", descriptor = "(Z)V")
    public final native void method188(boolean arg0);
}
