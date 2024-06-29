import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class439 extends class163 {

    @OriginalMember(owner = "client!rk", name = "H", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field6383;

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class439(Object arg0, int arg1) {
        super(arg1);
        this.field6383 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(Z)Z")
    public final boolean method809(boolean arg0) {
        if (arg0) {
            this.method809(false);
        }
        return true;
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public final Object method808(byte arg0) {
        if (arg0 < 97) {
            this.field6383 = (SoftReference) null;
        }
        return this.field6383.get();
    }
}
