import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class270 extends class9 {

    @OriginalMember(owner = "client!te", name = "S", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4571;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "(I)Z", line = 6)
    public final boolean method61(int arg0) {
        if (arg0 < 13) {
            this.method56(-47);
        }
        return true;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 14)
    public class270(Object arg0) {
        this.field4571 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!te", name = "g", descriptor = "(I)Ljava/lang/Object;", line = 24)
    public final Object method56(int arg0) {
        int var2 = 91 / ((arg0 + 48) / 57);
        return this.field4571.get();
    }
}
