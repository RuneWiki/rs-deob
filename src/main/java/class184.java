import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class184 extends class328 {

    @OriginalMember(owner = "client!on", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2998;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 6)
    public final Object method1255(int arg0) {
        if (arg0 != 7756) {
            this.method1255(-47);
        }
        return this.field2998.get();
    }

    @OriginalMember(owner = "client!on", name = "g", descriptor = "(I)Z", line = 16)
    public final boolean method1256(int arg0) {
        return arg0 == -2968;
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class184(Object arg0) {
        this.field2998 = new SoftReference(arg0);
    }
}
