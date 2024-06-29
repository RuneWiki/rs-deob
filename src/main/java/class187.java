import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class187 extends class183 {

    @OriginalMember(owner = "client!uu", name = "A", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2639;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method1199(int arg0) {
        if (arg0 != 21800) {
            this.field2639 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 15)
    public class187(Object arg0, int arg1) {
        super(arg1);
        this.field2639 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "(B)Ljava/lang/Object;", line = 24)
    public final Object method1200(byte arg0) {
        if (arg0 != 57) {
            this.field2639 = null;
        }
        return this.field2639.get();
    }
}
