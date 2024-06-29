import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class32 extends class117 {

    @OriginalMember(owner = "client!vo", name = "E", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field455;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)Ljava/lang/Object;", line = 5)
    public final Object method212(boolean arg0) {
        return arg0 ? (Object) null : this.field455.get();
    }

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "(I)Z", line = 15)
    public final boolean method213(int arg0) {
        return arg0 == 10535;
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 24)
    public class32(Object arg0, int arg1) {
        super(arg1);
        this.field455 = new SoftReference(arg0);
    }
}
