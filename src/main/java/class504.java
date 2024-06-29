import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class504 implements class488, class535 {

    @OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class166.method1167(this, -1);
        }
    }

    @OriginalMember(owner = "client!xa", name = "w", descriptor = "(Z)V", line = 11)
    public final void method123(boolean arg0) {
        this.method2946(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(II)V", line = 16)
    public class504(int arg0, int arg1) {
        this.method2945(arg0, arg1);
    }

    @OriginalMember(owner = "client!xa", name = "r", descriptor = "(II)V")
    private final native void method2945(int arg0, int arg1);

    @OriginalMember(owner = "client!xa", name = "va", descriptor = "(JZ)V")
    private final native void method2946(long arg0, boolean arg1);
}
