import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class40 extends class320 {

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field562;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "(I)Ljava/lang/Object;", line = 5)
    public final Object method334(int arg0) {
        return arg0 == 16349 ? this.field562.get() : (Object) null;
    }

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "(I)Z", line = 15)
    public final boolean method335(int arg0) {
        if (arg0 <= 21) {
            this.method335(64);
        }
        return true;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class40(Object arg0) {
        this.field562 = new SoftReference(arg0);
    }
}
