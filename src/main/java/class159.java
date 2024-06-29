import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class159 extends class115 {

    @OriginalMember(owner = "client!nm", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2428;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method980(int arg0) {
        if (arg0 != 8216) {
            this.field2428 = (SoftReference) null;
        }
        return this.field2428.get();
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(Z)Z")
    public final boolean method985(boolean arg0) {
        return arg0;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class159(Object arg0) {
        this.field2428 = new SoftReference(arg0);
    }
}
