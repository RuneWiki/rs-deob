import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class631 extends class302 {

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field8757;

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lwf;Ljava/lang/Object;I)V", line = 5)
    public class631(class147 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field8757 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Z", line = 14)
    public final boolean method187(int arg0) {
        if (arg0 != 0) {
            this.field8757 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 24)
    public final Object method189(int arg0) {
        return arg0 == 0 ? this.field8757.get() : (Object) null;
    }
}
