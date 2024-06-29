import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class74 extends class256 implements class2 {

    @OriginalMember(owner = "client!ya", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class301.method1765(this, 0);
        }
    }

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(Loa;I)V", line = 10)
    public class74(class406 arg0, int arg1) {
        this.method462(arg0, arg1);
    }

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "(Loa;I)V")
    private final native void method462(class406 arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
    public final native void method463();

    @OriginalMember(owner = "client!ya", name = "ga", descriptor = "()V")
    public final native void method464();

    @OriginalMember(owner = "client!ya", name = "w", descriptor = "(Z)V")
    public final native void method3(boolean arg0);
}
