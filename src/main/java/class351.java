import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class351 extends class88 implements class438 {

    @OriginalMember(owner = "client!e", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!e", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class124.method989(-123, this);
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(La;)V", line = 9)
    public class351(class326 arg0) {
    }

    @OriginalMember(owner = "client!e", name = "NA", descriptor = "(Z)V")
    public final native void method810(boolean arg0);
}
