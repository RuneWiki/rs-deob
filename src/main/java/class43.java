import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class43 extends class86 {

    @OriginalMember(owner = "client!le", name = "I", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field560;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(B)Z")
    public final boolean method329(byte arg0) {
        if (arg0 <= 99) {
            this.method329((byte) -81);
        }
        return true;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method330(byte arg0) {
        if (arg0 <= 102) {
            this.field560 = (SoftReference) null;
        }
        return this.field560.get();
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class43(Object arg0) {
        this.field560 = new SoftReference(arg0);
    }
}
