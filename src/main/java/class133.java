import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class133 extends class265 {

    @OriginalMember(owner = "client!wi", name = "N", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2539;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "(I)Z")
    public final boolean method934(int arg0) {
        if (arg0 != -1) {
            this.method934(-2);
        }
        return true;
    }

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public final Object method935(int arg0) {
        if (arg0 < 30) {
            this.field2539 = (SoftReference) null;
        }
        return this.field2539.get();
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class133(Object arg0) {
        this.field2539 = new SoftReference(arg0);
    }
}
