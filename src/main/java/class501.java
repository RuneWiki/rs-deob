import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class501 extends class119 implements class249 {

    @OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class499.method2689(this, (byte) -81);
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Ll;)V", line = 8)
    public class501(class171 arg0) {
    }

    @OriginalMember(owner = "client!h", name = "UA", descriptor = "(Z)V")
    public final native void method548(boolean arg0);
}
