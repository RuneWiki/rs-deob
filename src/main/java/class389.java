import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class389 extends class338 {

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5625;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 5)
    public final Object method1164(int arg0) {
        if (arg0 != 65536) {
            this.field5625 = null;
        }
        return this.field5625.get();
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(B)Z", line = 17)
    public final boolean method1165(byte arg0) {
        int var2 = -88 % ((-arg0 - 63) / 61);
        return true;
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lwe;Ljava/lang/Object;I)V", line = 24)
    public class389(class408 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field5625 = new SoftReference(arg1);
    }
}
