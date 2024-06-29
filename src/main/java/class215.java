import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class215 extends class103 {

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3801;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method729(boolean arg0) {
        if (!arg0) {
            this.field3801 = (SoftReference) null;
        }
        return this.field3801.get();
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(Z)Z")
    public final boolean method732(boolean arg0) {
        if (!arg0) {
            this.field3801 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class215(Object arg0) {
        this.field3801 = new SoftReference(arg0);
    }
}
