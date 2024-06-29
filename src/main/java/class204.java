import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class204 extends class64 {

    @OriginalMember(owner = "client!i", name = "E", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3195;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method413(int arg0) {
        return arg0 == -64 ? this.field3195.get() : (Object) null;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class204(Object arg0) {
        this.field3195 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(B)Z")
    public final boolean method409(byte arg0) {
        return arg0 == 59;
    }
}
