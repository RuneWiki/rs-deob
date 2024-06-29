import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class183 extends class86 {

    @OriginalMember(owner = "client!im", name = "G", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3039;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 5)
    public final Object method585(byte arg0) {
        if (arg0 != 100) {
            this.field3039 = (SoftReference) null;
        }
        return this.field3039.get();
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(I)Z", line = 15)
    public final boolean method582(int arg0) {
        if (arg0 < 70) {
            this.field3039 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class183(Object arg0) {
        this.field3039 = new SoftReference(arg0);
    }
}
