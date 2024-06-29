import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class42 extends class343 {

    @OriginalMember(owner = "client!in", name = "L", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field634;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 6)
    public final Object method328(int arg0) {
        return arg0 == 2718 ? this.field634.get() : (Object) null;
    }

    @OriginalMember(owner = "client!in", name = "g", descriptor = "(I)Z", line = 16)
    public final boolean method329(int arg0) {
        if (arg0 != 21764) {
            this.method329(-41);
        }
        return true;
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class42(Object arg0) {
        this.field634 = new SoftReference(arg0);
    }
}
