import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class129 extends class126 {

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2278;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)Z")
    public final boolean method337(int arg0) {
        return arg0 == 710;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method341(boolean arg0) {
        if (arg0) {
            this.field2278 = (SoftReference) null;
        }
        return this.field2278.get();
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class129(Object arg0) {
        this.field2278 = new SoftReference(arg0);
    }
}
