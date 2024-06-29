import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class335 extends class81 {

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4534;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method653(int arg0) {
        return arg0 == -1 ? this.field4534.get() : (Object) null;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)Z")
    public final boolean method654(byte arg0) {
        if (arg0 != 104) {
            this.method654((byte) -119);
        }
        return true;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class335(Object arg0) {
        this.field4534 = new SoftReference(arg0);
    }
}
