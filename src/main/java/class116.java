import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class116 extends class185 {

    @OriginalMember(owner = "client!p", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2081;

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 4)
    public class116(Object arg0) {
        this.field2081 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 13)
    public final Object method857(int arg0) {
        if (arg0 != 0) {
            this.method858(104);
        }
        return this.field2081.get();
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(I)Z", line = 23)
    public final boolean method858(int arg0) {
        return arg0 < -101;
    }
}
