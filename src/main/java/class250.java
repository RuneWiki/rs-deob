import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class250 extends class22 {

    @OriginalMember(owner = "client!ph", name = "Z", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4482;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method133(int arg0) {
        return arg0 == -26125 ? this.field4482.get() : (Object) null;
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(B)Z")
    public final boolean method129(byte arg0) {
        if (arg0 != -124) {
            this.method133(-38);
        }
        return true;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class250(Object arg0) {
        this.field4482 = new SoftReference(arg0);
    }
}
