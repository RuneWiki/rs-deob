import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class284 extends class152 {

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4892;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "(I)Ljava/lang/Object;", line = 5)
    public final Object method680(int arg0) {
        if (arg0 != 17439) {
            this.field4892 = (SoftReference) null;
        }
        return this.field4892.get();
    }

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "(I)Z", line = 15)
    public final boolean method679(int arg0) {
        return arg0 == -1;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class284(Object arg0) {
        this.field4892 = new SoftReference(arg0);
    }
}
