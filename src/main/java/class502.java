import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class502 implements class379, class533 {

    @OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!xa", name = "va", descriptor = "(JZ)V")
    private final native void method2801(long arg0, boolean arg1);

    @OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class280.method1680(false, this);
        }
    }

    @OriginalMember(owner = "client!xa", name = "w", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        this.method2801(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!xa", name = "r", descriptor = "(II)V")
    private final native void method2802(int arg0, int arg1);

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(II)V")
    public class502(int arg0, int arg1) {
        this.method2802(arg0, arg1);
    }
}
