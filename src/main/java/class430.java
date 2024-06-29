import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class430 extends class263 {

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field6360;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)Z", line = 5)
    public final boolean method451(int arg0) {
        return arg0 >= -92 ? true : true;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 14)
    public class430(Object arg0) {
        this.field6360 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 23)
    public final Object method447(int arg0) {
        return arg0 == 27816 ? this.field6360.get() : (Object) null;
    }
}
