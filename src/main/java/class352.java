import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class352 extends class728 {

    @OriginalMember(owner = "client!st", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4290;

    @OriginalMember(owner = "client!st", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public final Object method828(byte arg0) {
        return arg0 > -105 ? (Object) null : this.field4290.get();
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lofa;Ljava/lang/Object;I)V")
    public class352(class320 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field4290 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B)Z")
    public final boolean method825(byte arg0) {
        if (arg0 != -117) {
            this.field4290 = null;
        }
        return true;
    }
}
