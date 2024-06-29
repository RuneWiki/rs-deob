import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class192 extends class652 {

    @OriginalMember(owner = "client!ku", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2592;

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lpe;Ljava/lang/Object;I)V", line = 4)
    public class192(class611 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field2592 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "(I)Ljava/lang/Object;", line = 13)
    public final Object method1254(int arg0) {
        return arg0 == 0 ? this.field2592.get() : (Object) null;
    }

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "(I)Z", line = 23)
    public final boolean method1255(int arg0) {
        if (arg0 != -7017) {
            this.field2592 = null;
        }
        return true;
    }
}
