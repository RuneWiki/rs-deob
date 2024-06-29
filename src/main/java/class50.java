import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class50 extends class432 {

    @OriginalMember(owner = "client!kt", name = "L", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field734;

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method486(int arg0) {
        if (arg0 != 128) {
            this.method487(105);
        }
        return this.field734.get();
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lts;Ljava/lang/Object;I)V")
    public class50(class23 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field734 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "(I)Z")
    public final boolean method487(int arg0) {
        if (arg0 != 3) {
            this.field734 = (SoftReference) null;
        }
        return true;
    }
}
