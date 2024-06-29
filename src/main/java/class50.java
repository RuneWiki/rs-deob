import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class50 extends class105 {

    @OriginalMember(owner = "client!fu", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field830;

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(Z)Z", line = 5)
    public final boolean method360(boolean arg0) {
        if (arg0) {
            this.field830 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 15)
    public final Object method361(int arg0) {
        if (arg0 != -14111) {
            this.field830 = null;
        }
        return this.field830.get();
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lmb;Ljava/lang/Object;I)V", line = 24)
    public class50(class288 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field830 = new SoftReference(arg1);
    }
}
