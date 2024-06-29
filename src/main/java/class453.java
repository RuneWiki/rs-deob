import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class453 extends class483 implements class28 {

    @OriginalMember(owner = "client!e", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!e", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class49.method261(0, this);
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(La;)V", line = 9)
    public class453(class526 arg0) {
    }

    @OriginalMember(owner = "client!e", name = "NA", descriptor = "(Z)V")
    public final native void method61(boolean arg0);
}
