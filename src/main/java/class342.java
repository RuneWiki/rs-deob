import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class342 extends class286 {

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5306;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 5)
    public final Object method724(byte arg0) {
        return arg0 == -114 ? this.field5306.get() : (Object) null;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 14)
    public class342(Object arg0) {
        this.field5306 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(B)Z", line = 23)
    public final boolean method728(byte arg0) {
        if (arg0 <= 11) {
            this.field5306 = (SoftReference) null;
        }
        return true;
    }
}
