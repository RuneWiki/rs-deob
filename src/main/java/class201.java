import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class201 extends class261 {

    @OriginalMember(owner = "client!m", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3026;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 5)
    public final Object method1144(int arg0) {
        return arg0 == -12903 ? this.field3026.get() : (Object) null;
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(I)Z", line = 16)
    public final boolean method1142(int arg0) {
        if (arg0 != 10054) {
            this.method1142(-31);
        }
        return true;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class201(Object arg0) {
        this.field3026 = new SoftReference(arg0);
    }
}
