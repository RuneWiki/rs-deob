import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public class class243 extends class21 {

    @OriginalMember(owner = "client!eia", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3533;

    @OriginalMember(owner = "client!eia", name = "d", descriptor = "(I)Z")
    public final boolean method167(int arg0) {
        if (arg0 != -4) {
            this.method165(-41);
        }
        return true;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method165(int arg0) {
        return arg0 <= 75 ? (Object) null : this.field3533.get();
    }

    @OriginalMember(owner = "client!eia", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class243(Object arg0, int arg1) {
        super(arg1);
        this.field3533 = new SoftReference(arg0);
    }
}
