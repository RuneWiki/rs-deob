import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class197 extends class61 {

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3576;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method370(boolean arg0) {
        return arg0 ? (Object) null : this.field3576.get();
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class197(Object arg0) {
        this.field3576 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(I)Z")
    public final boolean method380(int arg0) {
        if (arg0 != 2000) {
            this.field3576 = (SoftReference) null;
        }
        return true;
    }
}
