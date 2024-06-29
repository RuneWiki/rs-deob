import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class133 extends class31 {

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2338;

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class133(Object arg0) {
        this.field2338 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method286(int arg0) {
        return arg0 == 12 ? this.field2338.get() : (Object) null;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(Z)Z")
    public final boolean method289(boolean arg0) {
        if (!arg0) {
            this.field2338 = (SoftReference) null;
        }
        return true;
    }
}
