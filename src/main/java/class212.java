import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class212 extends class142 {

    @OriginalMember(owner = "client!v", name = "S", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3754;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public final Object method937(int arg0) {
        return arg0 >= -60 ? (Object) null : this.field3754.get();
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(I)Z")
    public final boolean method936(int arg0) {
        if (arg0 < 122) {
            this.field3754 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class212(Object arg0) {
        this.field3754 = new SoftReference(arg0);
    }
}
