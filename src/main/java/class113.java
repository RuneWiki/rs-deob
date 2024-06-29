import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class113 extends class92 {

    @OriginalMember(owner = "client!th", name = "L", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1635;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "(I)Ljava/lang/Object;")
    public final Object method601(int arg0) {
        return arg0 == 0 ? this.field1635.get() : (Object) null;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class113(Object arg0) {
        this.field1635 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!th", name = "h", descriptor = "(I)Z")
    public final boolean method599(int arg0) {
        if (arg0 != 128) {
            this.field1635 = (SoftReference) null;
        }
        return true;
    }
}
