import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class260 extends class41 {

    @OriginalMember(owner = "client!cm", name = "I", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4260;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(B)Z")
    public final boolean method249(byte arg0) {
        if (arg0 >= -67) {
            this.field4260 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public final Object method245(int arg0) {
        return arg0 == -15007 ? this.field4260.get() : (Object) null;
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class260(Object arg0) {
        this.field4260 = new SoftReference(arg0);
    }
}
