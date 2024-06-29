import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class186 extends class295 {

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2518;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1208(int arg0) {
        return arg0 < 98 ? (Object) null : this.field2518.get();
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)Z")
    public final boolean method1209(int arg0) {
        if (arg0 != -7) {
            this.field2518 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class186(Object arg0) {
        this.field2518 = new SoftReference(arg0);
    }
}
