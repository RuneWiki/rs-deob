import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class218 extends class245 {

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3950;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1382(int arg0) {
        if (arg0 != 0) {
            this.method1382(23);
        }
        return this.field3950.get();
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)Z")
    public final boolean method1383(int arg0) {
        if (arg0 < 91) {
            this.method1383(86);
        }
        return true;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class218(Object arg0) {
        this.field3950 = new SoftReference(arg0);
    }
}
