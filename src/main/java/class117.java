import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class117 extends class93 {

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2078;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public final Object method597(byte arg0) {
        int var2 = -10 % ((-arg0 - 68) / 39);
        return this.field2078.get();
    }

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)Z")
    public final boolean method602(int arg0) {
        if (arg0 < 117) {
            this.field2078 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class117(Object arg0) {
        this.field2078 = new SoftReference(arg0);
    }
}
