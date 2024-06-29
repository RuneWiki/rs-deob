import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class38 extends class230 {

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field659;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)Z")
    public final boolean method347(byte arg0) {
        if (arg0 > -2) {
            this.method348(-30);
        }
        return true;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method348(int arg0) {
        return arg0 >= -40 ? (Object) null : this.field659.get();
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class38(Object arg0) {
        this.field659 = new SoftReference(arg0);
    }
}
