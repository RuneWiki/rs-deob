import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class502 implements class686, class532 {

    @OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!xa", name = "w", descriptor = "(Z)V", line = 5)
    public final void method129(boolean arg0) {
        this.method2957(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V", line = 8)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class305.method1997(0, this);
        }
    }

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(II)V", line = 16)
    public class502(int arg0, int arg1) {
        this.method2956(arg0, arg1);
    }

    @OriginalMember(owner = "client!xa", name = "r", descriptor = "(II)V")
    private final native void method2956(int arg0, int arg1);

    @OriginalMember(owner = "client!xa", name = "va", descriptor = "(JZ)V")
    private final native void method2957(long arg0, boolean arg1);
}
