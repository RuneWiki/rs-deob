import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class372 extends class312 {

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5823;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public final Object method2137(byte arg0) {
        return arg0 < 27 ? (Object) null : this.field5823.get();
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lkw;Ljava/lang/Object;I)V")
    public class372(class228 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field5823 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)Z")
    public final boolean method2136(int arg0) {
        if (arg0 != -20065) {
            this.method2136(-128);
        }
        return true;
    }
}
