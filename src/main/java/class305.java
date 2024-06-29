import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class305 extends class702 implements class752 {

    @OriginalMember(owner = "client!ya", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "(Loa;I)V")
    private final native void method1799(class50 arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "w", descriptor = "(Z)V")
    public final native void method414(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
    public final native void method1800();

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class133.method841(0, this);
        }
    }

    @OriginalMember(owner = "client!ya", name = "ga", descriptor = "()V")
    public final native void method1801();

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(Loa;I)V")
    public class305(class50 arg0, int arg1) {
        this.method1799(arg0, arg1);
    }
}
