import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class24 extends class309 {

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field301;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(Z)Z")
    public final boolean method133(boolean arg0) {
        if (arg0) {
            this.field301 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class24(Object arg0) {
        this.field301 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "(I)Ljava/lang/Object;")
    public final Object method134(int arg0) {
        int var2 = -75 % ((3 - arg0) / 48);
        return this.field301.get();
    }
}
