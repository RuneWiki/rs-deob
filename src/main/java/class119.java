import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class119 extends class108 implements class752 {

    @OriginalMember(owner = "client!ba", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ba", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class133.method841(0, this);
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Loa;)V", line = 8)
    public class119(class50 arg0) {
    }

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "(Z)V")
    public final native void method414(boolean arg0);
}
