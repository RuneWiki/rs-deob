import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class223 extends class179 {

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3801;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public final Object method413(byte arg0) {
        if (arg0 >= -21) {
            this.field3801 = (SoftReference) null;
        }
        return this.field3801.get();
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class223(Object arg0) {
        this.field3801 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(B)Z")
    public final boolean method411(byte arg0) {
        if (arg0 != 23) {
            this.method413((byte) -115);
        }
        return true;
    }
}
