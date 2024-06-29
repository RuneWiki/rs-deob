import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class599 implements class290, class2 {

    @OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!xa", name = "w", descriptor = "(Z)V", line = 3)
    public final void method9(boolean arg0) {
        this.method3501(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V", line = 9)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class260.method1726(this, false);
        }
    }

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(II)V", line = 16)
    public class599(int arg0, int arg1) {
        this.method3502(arg0, arg1);
    }

    @OriginalMember(owner = "client!xa", name = "va", descriptor = "(JZ)V")
    private final native void method3501(long arg0, boolean arg1);

    @OriginalMember(owner = "client!xa", name = "r", descriptor = "(II)V")
    private final native void method3502(int arg0, int arg1);
}
