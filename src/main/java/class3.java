import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class3 extends class106 {

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field31;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)Z", line = 5)
    public final boolean method15(int arg0) {
        return arg0 == 3 ? true : true;
    }

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "(B)Ljava/lang/Object;", line = 15)
    public final Object method16(byte arg0) {
        if (arg0 < 114) {
            this.method15(2);
        }
        return this.field31.get();
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class3(Object arg0) {
        this.field31 = new SoftReference(arg0);
    }
}
