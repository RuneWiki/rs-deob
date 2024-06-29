import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class320 extends class135 {

    @OriginalMember(owner = "client!nq", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4521;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "(B)Z")
    public final boolean method1030(byte arg0) {
        return arg0 > 57;
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class320(Object arg0, int arg1) {
        super(arg1);
        this.field4521 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1032(int arg0) {
        return arg0 == 250 ? this.field4521.get() : (Object) null;
    }
}
