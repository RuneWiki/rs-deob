import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class59 extends class435 implements class559 {

    @OriginalMember(owner = "client!ya", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class405.method2430((byte) -104, this);
        }
    }

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(Loa;I)V", line = 12)
    public class59(class724 arg0, int arg1) {
        this.method513(arg0, arg1);
    }

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "(Loa;I)V")
    private final native void method513(class724 arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
    public final native void method514();

    @OriginalMember(owner = "client!ya", name = "w", descriptor = "(Z)V")
    public final native void method229(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "ga", descriptor = "()V")
    public final native void method515();
}
