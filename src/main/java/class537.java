import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class537 extends class35 implements class137 {

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class284.method1838(this, -93);
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lda;I)V", line = 10)
    public class537(class54 arg0, int arg1) {
        this.method3132(arg0, arg1);
    }

    @OriginalMember(owner = "client!a", name = "ZA", descriptor = "()V")
    public final native void method3131();

    @OriginalMember(owner = "client!a", name = "wa", descriptor = "(Lda;I)V")
    private final native void method3132(class54 arg0, int arg1);

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(Z)V")
    public final native void method70(boolean arg0);

    @OriginalMember(owner = "client!a", name = "P", descriptor = "()V")
    public final native void method3133();
}
