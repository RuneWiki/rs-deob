import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class499 implements class536, class529 {

    @OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!xa", name = "w", descriptor = "(Z)V")
    public final void method107(boolean arg0) {
        this.method3002(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!xa", name = "r", descriptor = "(II)V")
    private final native void method3001(int arg0, int arg1);

    @OriginalMember(owner = "client!xa", name = "va", descriptor = "(JZ)V")
    private final native void method3002(long arg0, boolean arg1);

    @OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class727.method4045(this, 13483);
        }
    }

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(II)V")
    public class499(int arg0, int arg1) {
        this.method3001(arg0, arg1);
    }
}
