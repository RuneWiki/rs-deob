import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class202 extends class21 {

    @OriginalMember(owner = "client!ru", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3186;

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lnba;Ljava/lang/Object;I)V")
    public class202(class314 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field3186 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method139(boolean arg0) {
        return arg0 ? this.field3186.get() : (Object) null;
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(B)Z")
    public final boolean method138(byte arg0) {
        if (arg0 != 101) {
            this.field3186 = null;
        }
        return true;
    }
}
