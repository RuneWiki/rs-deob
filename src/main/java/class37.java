import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class37 extends class105 {

    @OriginalMember(owner = "client!mm", name = "w", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field377;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public final Object method226(int arg0) {
        if (arg0 != 1) {
            this.method226(-128);
        }
        return this.field377.get();
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Ldd;Ljava/lang/Object;I)V")
    public class37(class480 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field377 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "(I)Z")
    public final boolean method227(int arg0) {
        if (arg0 < 101) {
            this.method227(22);
        }
        return true;
    }
}
