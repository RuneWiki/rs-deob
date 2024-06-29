import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class170 extends class2 {

    @OriginalMember(owner = "client!im", name = "L", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2836;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 5)
    public final Object method9(int arg0) {
        return arg0 == 0 ? this.field2836.get() : (Object) null;
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(I)Z", line = 15)
    public final boolean method5(int arg0) {
        if (arg0 != 30757) {
            this.field2836 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class170(Object arg0) {
        this.field2836 = new SoftReference(arg0);
    }
}
