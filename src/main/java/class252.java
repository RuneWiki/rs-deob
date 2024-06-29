import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class252 extends class37 {

    @OriginalMember(owner = "client!a", name = "X", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3893;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public final Object method291(int arg0) {
        if (arg0 != 22473) {
            this.field3893 = (SoftReference) null;
        }
        return this.field3893.get();
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class252(Object arg0) {
        this.field3893 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)Z")
    public final boolean method293(boolean arg0) {
        return arg0 ? true : true;
    }
}
