import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class335 extends class206 {

    @OriginalMember(owner = "client!eq", name = "N", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4329;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(B)Z")
    public final boolean method1329(byte arg0) {
        if (arg0 > -63) {
            this.method1329((byte) -21);
        }
        return true;
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1326(int arg0) {
        if (arg0 < 121) {
            this.field4329 = null;
        }
        return this.field4329.get();
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lgj;Ljava/lang/Object;I)V")
    public class335(class654 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field4329 = new SoftReference(arg1);
    }
}
