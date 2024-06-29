import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class44 extends class8 {

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field700;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)Ljava/lang/Object;", line = 5)
    public final Object method53(boolean arg0) {
        if (!arg0) {
            this.method53(true);
        }
        return this.field700.get();
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)Z", line = 15)
    public final boolean method54(int arg0) {
        if (arg0 != -22358) {
            this.field700 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class44(Object arg0) {
        this.field700 = new SoftReference(arg0);
    }
}
