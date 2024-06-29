import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class67 extends class247 {

    @OriginalMember(owner = "client!v", name = "G", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1315;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(I)Z", line = 6)
    public final boolean method72(int arg0) {
        if (arg0 > -60) {
            this.method72(-23);
        }
        return true;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(Z)Ljava/lang/Object;", line = 16)
    public final Object method71(boolean arg0) {
        if (arg0) {
            this.field1315 = (SoftReference) null;
        }
        return this.field1315.get();
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class67(Object arg0) {
        this.field1315 = new SoftReference(arg0);
    }
}
