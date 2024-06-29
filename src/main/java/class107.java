import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class107 extends class110 {

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1319;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "(I)Ljava/lang/Object;", line = 5)
    public final Object method568(int arg0) {
        if (arg0 != 0) {
            this.method568(-49);
        }
        return this.field1319.get();
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)Z", line = 16)
    public final boolean method569(boolean arg0) {
        if (arg0) {
            this.method569(true);
        }
        return true;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class107(Object arg0) {
        this.field1319 = new SoftReference(arg0);
    }
}
