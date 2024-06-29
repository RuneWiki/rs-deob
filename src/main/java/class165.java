import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class165 extends class89 {

    @OriginalMember(owner = "client!dq", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2425;

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 4)
    public class165(Object arg0, int arg1) {
        super(arg1);
        this.field2425 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)Z", line = 13)
    public final boolean method800(byte arg0) {
        if (arg0 != -26) {
            this.field2425 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 24)
    public final Object method798(int arg0) {
        return arg0 > -25 ? (Object) null : this.field2425.get();
    }
}
