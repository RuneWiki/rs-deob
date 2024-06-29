import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class392 extends class482 {

    @OriginalMember(owner = "client!li", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5477;

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 4)
    public class392(Object arg0, int arg1) {
        super(arg1);
        this.field5477 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 14)
    public final Object method2244(byte arg0) {
        if (arg0 <= 75) {
            this.method2244((byte) -44);
        }
        return this.field5477.get();
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(B)Z", line = 24)
    public final boolean method2245(byte arg0) {
        return arg0 == -28;
    }
}
