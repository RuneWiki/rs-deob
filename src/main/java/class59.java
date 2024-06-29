import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class59 extends class434 implements class558 {

    @OriginalMember(owner = "client!ya", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "(Loa;I)V")
    private final native void method432(class721 arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class201.method1801((byte) -106, this);
        }
    }

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
    public final native void method433();

    @OriginalMember(owner = "client!ya", name = "ga", descriptor = "()V")
    public final native void method434();

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(Loa;I)V")
    public class59(class721 arg0, int arg1) {
        this.method432(arg0, arg1);
    }

    @OriginalMember(owner = "client!ya", name = "w", descriptor = "(Z)V")
    public final native void method130(boolean arg0);
}
