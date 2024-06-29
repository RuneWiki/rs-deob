import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class455 extends class485 implements class27 {

    @OriginalMember(owner = "client!e", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!e", name = "NA", descriptor = "(Z)V")
    public final native void method134(boolean arg0);

    @OriginalMember(owner = "client!e", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class138.method926(this, -1);
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(La;)V")
    public class455(class530 arg0) {
    }
}
