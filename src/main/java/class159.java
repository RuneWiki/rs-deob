import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class159 extends class371 {

    @OriginalMember(owner = "client!ov", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2335;

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class159(Object arg0, int arg1) {
        super(arg1);
        this.field2335 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)Z")
    public final boolean method1023(byte arg0) {
        if (arg0 >= -72) {
            this.method1024(-5);
        }
        return true;
    }

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1024(int arg0) {
        if (arg0 <= 25) {
            this.field2335 = null;
        }
        return this.field2335.get();
    }
}
