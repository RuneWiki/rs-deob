import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class208 extends class281 {

    @OriginalMember(owner = "client!f", name = "M", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3814;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method1471(boolean arg0) {
        if (arg0) {
            this.field3814 = (SoftReference) null;
        }
        return this.field3814.get();
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class208(Object arg0) {
        this.field3814 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(Z)Z")
    public final boolean method1472(boolean arg0) {
        return arg0 ? true : true;
    }
}
