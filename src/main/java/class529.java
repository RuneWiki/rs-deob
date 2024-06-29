import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class529 implements class380, class560 {

    @OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class86.method690(this, (byte) 15);
        }
    }

    @OriginalMember(owner = "client!xa", name = "va", descriptor = "(JZ)V")
    private final native void method3008(long arg0, boolean arg1);

    @OriginalMember(owner = "client!xa", name = "w", descriptor = "(Z)V")
    public final void method131(boolean arg0) {
        this.method3008(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!xa", name = "r", descriptor = "(II)V")
    private final native void method3009(int arg0, int arg1);

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(II)V")
    public class529(int arg0, int arg1) {
        this.method3009(arg0, arg1);
    }
}
