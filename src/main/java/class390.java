import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class390 extends class239 {

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5688;

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class390(Object arg0, int arg1) {
        super(arg1);
        this.field5688 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(Z)Z")
    public final boolean method1239(boolean arg0) {
        if (!arg0) {
            this.method1236(-4);
        }
        return true;
    }

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1236(int arg0) {
        return arg0 == -5346 ? this.field5688.get() : (Object) null;
    }
}
