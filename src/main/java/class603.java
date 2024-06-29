import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class603 implements class208, class2 {

    @OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!xa", name = "r", descriptor = "(II)V")
    private final native void method3434(int arg0, int arg1);

    @OriginalMember(owner = "client!xa", name = "w", descriptor = "(Z)V")
    public final void method12(boolean arg0) {
        this.method3435(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!xa", name = "va", descriptor = "(JZ)V")
    private final native void method3435(long arg0, boolean arg1);

    @OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class556.method3276((byte) -10, this);
        }
    }

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(II)V")
    public class603(int arg0, int arg1) {
        this.method3434(arg0, arg1);
    }
}
