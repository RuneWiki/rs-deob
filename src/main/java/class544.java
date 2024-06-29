import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class544 implements class675, class752 {

    @OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!xa", name = "w", descriptor = "(Z)V")
    public final void method414(boolean arg0) {
        this.method3092(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class133.method841(0, this);
        }
    }

    @OriginalMember(owner = "client!xa", name = "r", descriptor = "(II)V")
    private final native void method3091(int arg0, int arg1);

    @OriginalMember(owner = "client!xa", name = "va", descriptor = "(JZ)V")
    private final native void method3092(long arg0, boolean arg1);

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(II)V")
    public class544(int arg0, int arg1) {
        this.method3091(arg0, arg1);
    }
}
