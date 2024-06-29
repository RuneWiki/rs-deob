import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class386 extends class180 implements class532 {

    @OriginalMember(owner = "client!ba", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ba", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class198.method1216((byte) 123, this);
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Loa;)V", line = 9)
    public class386(class693 arg0) {
    }

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "(Z)V")
    public final native void method106(boolean arg0);
}
