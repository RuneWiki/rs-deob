import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class601 implements class315, class2 {

    @OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!xa", name = "w", descriptor = "(Z)V", line = 5)
    public final void method3(boolean arg0) {
        this.method3535(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(II)V", line = 11)
    public class601(int arg0, int arg1) {
        this.method3536(arg0, arg1);
    }

    @OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V", line = 15)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class301.method1765(this, 0);
        }
    }

    @OriginalMember(owner = "client!xa", name = "va", descriptor = "(JZ)V")
    private final native void method3535(long arg0, boolean arg1);

    @OriginalMember(owner = "client!xa", name = "r", descriptor = "(II)V")
    private final native void method3536(int arg0, int arg1);
}
