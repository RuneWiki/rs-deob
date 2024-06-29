import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class74 extends class257 implements class2 {

    @OriginalMember(owner = "client!ya", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(Loa;I)V", line = 7)
    public class74(class408 arg0, int arg1) {
        this.method563(arg0, arg1);
    }

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V", line = 11)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class556.method3276((byte) -10, this);
        }
    }

    @OriginalMember(owner = "client!ya", name = "ga", descriptor = "()V")
    public final native void method562();

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "(Loa;I)V")
    private final native void method563(class408 arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "w", descriptor = "(Z)V")
    public final native void method12(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
    public final native void method564();
}
