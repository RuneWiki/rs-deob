import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class503 implements class512, class534 {

    @OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!xa", name = "w", descriptor = "(Z)V")
    public final void method105(boolean arg0) {
        this.method2990(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class161.method1176(this, 0);
        }
    }

    @OriginalMember(owner = "client!xa", name = "r", descriptor = "(II)V")
    private final native void method2989(int arg0, int arg1);

    @OriginalMember(owner = "client!xa", name = "va", descriptor = "(JZ)V")
    private final native void method2990(long arg0, boolean arg1);

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(II)V")
    public class503(int arg0, int arg1) {
        this.method2989(arg0, arg1);
    }
}
