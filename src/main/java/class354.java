import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class354 extends class88 implements class439 {

    @OriginalMember(owner = "client!e", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!e", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class75.method437(this, -1);
        }
    }

    @OriginalMember(owner = "client!e", name = "NA", descriptor = "(Z)V")
    public final native void method530(boolean arg0);

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(La;)V")
    public class354(class329 arg0) {
    }
}
