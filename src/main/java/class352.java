import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class352 extends class324 {

    @OriginalMember(owner = "client!fa", name = "V", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5213;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "(I)Z")
    public final boolean method1993(int arg0) {
        if (arg0 != -29135) {
            this.method1994((byte) 112);
        }
        return true;
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1994(byte arg0) {
        return arg0 > -47 ? (Object) null : this.field5213.get();
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lur;Ljava/lang/Object;I)V")
    public class352(class260 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field5213 = new SoftReference(arg1);
    }
}
