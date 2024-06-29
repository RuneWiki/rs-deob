import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class466 extends class484 {

    @OriginalMember(owner = "client!pl", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field6877;

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 5)
    public class466(Object arg0, int arg1) {
        super(arg1);
        this.field6877 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 14)
    public final Object method2842(byte arg0) {
        return arg0 == -15 ? this.field6877.get() : (Object) null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)Z", line = 24)
    public final boolean method2843(int arg0) {
        if (arg0 != 20716) {
            this.field6877 = null;
        }
        return true;
    }
}
