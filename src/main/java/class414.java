import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class414 extends class174 {

    @OriginalMember(owner = "client!jk", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5654;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)Z", line = 5)
    public final boolean method1005(int arg0) {
        return arg0 == 27969;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Liq;Ljava/lang/Object;I)V", line = 15)
    public class414(class396 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field5654 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 24)
    public final Object method1006(byte arg0) {
        if (arg0 != 106) {
            this.field5654 = (SoftReference) null;
        }
        return this.field5654.get();
    }
}
