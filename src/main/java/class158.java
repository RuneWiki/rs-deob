import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class158 extends class64 implements class28 {

    @OriginalMember(owner = "client!c", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!c", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class49.method261(0, this);
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(La;I)V", line = 12)
    public class158(class526 arg0, int arg1) {
        this.method872(arg0, arg1);
    }

    @OriginalMember(owner = "client!c", name = "NA", descriptor = "(Z)V")
    public final native void method61(boolean arg0);

    @OriginalMember(owner = "client!c", name = "za", descriptor = "()V")
    public final native void method870();

    @OriginalMember(owner = "client!c", name = "O", descriptor = "()V")
    public final native void method871();

    @OriginalMember(owner = "client!c", name = "v", descriptor = "(La;I)V")
    private final native void method872(class526 arg0, int arg1);
}
