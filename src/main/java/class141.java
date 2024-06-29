import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class141 extends class247 {

    @OriginalMember(owner = "client!tk", name = "M", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2567;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 5)
    public final Object method1034(int arg0) {
        if (arg0 > -38) {
            this.field2567 = (SoftReference) null;
        }
        return this.field2567.get();
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(B)Z", line = 15)
    public final boolean method1035(byte arg0) {
        if (arg0 != 46) {
            this.field2567 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class141(Object arg0) {
        this.field2567 = new SoftReference(arg0);
    }
}
