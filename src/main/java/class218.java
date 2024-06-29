import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class218 extends class111 {

    @OriginalMember(owner = "client!hi", name = "P", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3857;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "(I)Z")
    public final boolean method795(int arg0) {
        if (arg0 != 4) {
            this.field3857 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method792(byte arg0) {
        return arg0 <= 102 ? (Object) null : this.field3857.get();
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class218(Object arg0) {
        this.field3857 = new SoftReference(arg0);
    }
}
