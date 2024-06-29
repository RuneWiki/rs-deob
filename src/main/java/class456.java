import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class456 extends class485 implements class28 {

    @OriginalMember(owner = "client!e", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!e", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class292.method1797(-75, this);
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(La;)V", line = 8)
    public class456(class530 arg0) {
    }

    @OriginalMember(owner = "client!e", name = "NA", descriptor = "(Z)V")
    public final native void method63(boolean arg0);
}
