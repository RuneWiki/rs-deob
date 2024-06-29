import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class214 extends class282 {

    @OriginalMember(owner = "client!le", name = "E", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3504;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(B)Z", line = 5)
    public final boolean method1433(byte arg0) {
        if (arg0 <= 10) {
            this.field3504 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 15)
    public final Object method1435(byte arg0) {
        if (arg0 != -97) {
            this.method1435((byte) -127);
        }
        return this.field3504.get();
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class214(Object arg0) {
        this.field3504 = new SoftReference(arg0);
    }
}
