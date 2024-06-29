import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class526 implements class560, class557 {

    @OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class196.method1359(this, (byte) 90);
        }
    }

    @OriginalMember(owner = "client!xa", name = "w", descriptor = "(Z)V")
    public final void method211(boolean arg0) {
        this.method3175(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!xa", name = "r", descriptor = "(II)V")
    private final native void method3174(int arg0, int arg1);

    @OriginalMember(owner = "client!xa", name = "va", descriptor = "(JZ)V")
    private final native void method3175(long arg0, boolean arg1);

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(II)V")
    public class526(int arg0, int arg1) {
        this.method3174(arg0, arg1);
    }
}
