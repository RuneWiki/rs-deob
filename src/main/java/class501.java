import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class501 implements class666, class532 {

    @OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class198.method1216((byte) 123, this);
        }
    }

    @OriginalMember(owner = "client!xa", name = "w", descriptor = "(Z)V", line = 10)
    public final void method106(boolean arg0) {
        this.method2980(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(II)V", line = 16)
    public class501(int arg0, int arg1) {
        this.method2979(arg0, arg1);
    }

    @OriginalMember(owner = "client!xa", name = "r", descriptor = "(II)V")
    private final native void method2979(int arg0, int arg1);

    @OriginalMember(owner = "client!xa", name = "va", descriptor = "(JZ)V")
    private final native void method2980(long arg0, boolean arg1);
}
