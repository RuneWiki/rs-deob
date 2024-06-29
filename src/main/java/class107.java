import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class107 extends class248 {

    @OriginalMember(owner = "client!bj", name = "N", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2007;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public final Object method667(byte arg0) {
        return arg0 == 85 ? this.field2007.get() : (Object) null;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(Z)Z")
    public final boolean method668(boolean arg0) {
        return !arg0;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class107(Object arg0) {
        this.field2007 = new SoftReference(arg0);
    }
}
