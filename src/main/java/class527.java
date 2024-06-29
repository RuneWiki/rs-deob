import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class527 implements class35, class558 {

    @OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!xa", name = "r", descriptor = "(II)V")
    private final native void method3984(int arg0, int arg1);

    @OriginalMember(owner = "client!xa", name = "w", descriptor = "(Z)V")
    public final void method130(boolean arg0) {
        this.method3985(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!xa", name = "va", descriptor = "(JZ)V")
    private final native void method3985(long arg0, boolean arg1);

    @OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class201.method1801((byte) -46, this);
        }
    }

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(II)V")
    public class527(int arg0, int arg1) {
        this.method3984(arg0, arg1);
    }
}
