import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class137 extends class172 {

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1941;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)Ljava/lang/Object;", line = 5)
    public final Object method1080(int arg0) {
        return arg0 == 0 ? this.field1941.get() : (Object) null;
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(B)Z", line = 16)
    public final boolean method1081(byte arg0) {
        if (arg0 > -68) {
            this.method1080(64);
        }
        return true;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class137(Object arg0) {
        this.field1941 = new SoftReference(arg0);
    }
}
