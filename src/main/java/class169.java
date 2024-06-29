import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class169 extends class72 {

    @OriginalMember(owner = "client!bm", name = "F", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2952;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)Z", line = 6)
    public final boolean method522(int arg0) {
        int var2 = -125 / ((-arg0 - 27) / 53);
        return true;
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(Z)Ljava/lang/Object;", line = 15)
    public final Object method525(boolean arg0) {
        if (!arg0) {
            this.method525(false);
        }
        return this.field2952.get();
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 23)
    public class169(Object arg0) {
        this.field2952 = new SoftReference(arg0);
    }
}
