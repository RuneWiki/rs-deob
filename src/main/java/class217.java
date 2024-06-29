import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class217 extends class269 {

    @OriginalMember(owner = "client!se", name = "u", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2987;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1429(int arg0) {
        int var2 = -46 / ((-arg0 - 23) / 38);
        return this.field2987.get();
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)Z")
    public final boolean method1430(int arg0) {
        if (arg0 != 120) {
            this.field2987 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Luk;Ljava/lang/Object;I)V")
    public class217(class221 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field2987 = new SoftReference(arg1);
    }
}
