import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class59 extends class107 {

    @OriginalMember(owner = "client!vh", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field878;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)Z", line = 5)
    public final boolean method485(int arg0) {
        if (arg0 != 16) {
            this.field878 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)Ljava/lang/Object;", line = 16)
    public final Object method486(int arg0) {
        return arg0 <= 65 ? (Object) null : this.field878.get();
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class59(Object arg0) {
        this.field878 = new SoftReference(arg0);
    }
}
