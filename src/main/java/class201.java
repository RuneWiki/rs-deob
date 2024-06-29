import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class201 extends class640 {

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2639;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)Z", line = 6)
    public final boolean method1226(int arg0) {
        if (arg0 != 16311) {
            this.field2639 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 16)
    public final Object method1227(int arg0) {
        return arg0 == -11907 ? this.field2639.get() : (Object) null;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Laf;Ljava/lang/Object;I)V", line = 25)
    public class201(class435 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field2639 = new SoftReference(arg1);
    }
}
