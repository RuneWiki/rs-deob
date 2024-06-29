import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class202 extends class22 {

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3667;

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 4)
    public class202(Object arg0) {
        this.field3667 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(Z)Z", line = 13)
    public final boolean method146(boolean arg0) {
        if (!arg0) {
            this.field3667 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "(I)Ljava/lang/Object;", line = 23)
    public final Object method141(int arg0) {
        if (arg0 != -15111) {
            this.method146(false);
        }
        return this.field3667.get();
    }
}
