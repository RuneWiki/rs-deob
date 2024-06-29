import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class206 extends class611 {

    @OriginalMember(owner = "client!ru", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2453;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)Z")
    public final boolean method790(int arg0) {
        if (arg0 != 14) {
            this.method790(39);
        }
        return true;
    }

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method788(int arg0) {
        return arg0 == 14 ? this.field2453.get() : (Object) null;
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lwe;Ljava/lang/Object;I)V")
    public class206(class428 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field2453 = new SoftReference(arg1);
    }
}
