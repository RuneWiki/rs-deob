import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class70 extends class342 {

    @OriginalMember(owner = "client!er", name = "A", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field881;

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lgo;Ljava/lang/Object;I)V", line = 5)
    public class70(class451 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field881 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(Z)Ljava/lang/Object;", line = 14)
    public final Object method535(boolean arg0) {
        if (!arg0) {
            this.method535(false);
        }
        return this.field881.get();
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)Z", line = 24)
    public final boolean method536(int arg0) {
        return arg0 == -1;
    }
}
