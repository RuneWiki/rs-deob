import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class2 extends class254 {

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field36;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 6)
    public final Object method15(byte arg0) {
        if (arg0 < 50) {
            this.field36 = (SoftReference) null;
        }
        return this.field36.get();
    }

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "(I)Z", line = 16)
    public final boolean method16(int arg0) {
        return arg0 == 10 ? true : true;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class2(Object arg0) {
        this.field36 = new SoftReference(arg0);
    }
}
