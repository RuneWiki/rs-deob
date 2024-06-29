import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class509 extends class155 {

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field7423;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)Z")
    public final boolean method985(boolean arg0) {
        if (arg0) {
            this.field7423 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class509(Object arg0, int arg1) {
        super(arg1);
        this.field7423 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public final Object method987(int arg0) {
        if (arg0 >= -63) {
            this.field7423 = null;
        }
        return this.field7423.get();
    }
}
