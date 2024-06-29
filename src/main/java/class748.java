import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class748 extends class32 {

    @OriginalMember(owner = "client!kr", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field10399;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)Z", line = 5)
    public final boolean method274(byte arg0) {
        return arg0 >= 7;
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 14)
    public class748(Object arg0, int arg1) {
        super(arg1);
        this.field10399 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 24)
    public final Object method273(int arg0) {
        if (arg0 != 75) {
            this.field10399 = null;
        }
        return this.field10399.get();
    }
}
