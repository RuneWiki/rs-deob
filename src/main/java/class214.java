import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class214 extends class104 {

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3647;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(B)Z")
    public final boolean method755(byte arg0) {
        if (arg0 > -9) {
            this.method755((byte) -73);
        }
        return true;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method752(byte arg0) {
        int var2 = 10 / ((-arg0 - 21) / 63);
        return this.field3647.get();
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class214(Object arg0) {
        this.field3647 = new SoftReference(arg0);
    }
}
