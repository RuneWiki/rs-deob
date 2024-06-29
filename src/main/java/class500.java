import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class500 implements class493, class531 {

    @OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!xa", name = "w", descriptor = "(Z)V", line = 4)
    public final void method83(boolean arg0) {
        this.method2970(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class684.method3871(this, true);
        }
    }

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(II)V", line = 16)
    public class500(int arg0, int arg1) {
        this.method2969(arg0, arg1);
    }

    @OriginalMember(owner = "client!xa", name = "r", descriptor = "(II)V")
    private final native void method2969(int arg0, int arg1);

    @OriginalMember(owner = "client!xa", name = "va", descriptor = "(JZ)V")
    private final native void method2970(long arg0, boolean arg1);
}
