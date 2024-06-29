import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class201 extends class181 {

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3200;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)Z", line = 5)
    public final boolean method33(boolean arg0) {
        if (arg0) {
            this.method33(true);
        }
        return true;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 15)
    public final Object method37(byte arg0) {
        return arg0 <= 36 ? (Object) null : this.field3200.get();
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class201(Object arg0) {
        this.field3200 = new SoftReference(arg0);
    }
}
