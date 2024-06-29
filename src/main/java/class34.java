import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class34 extends class745 {

    @OriginalMember(owner = "client!tfa", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field551;

    @OriginalMember(owner = "client!tfa", name = "e", descriptor = "(B)Ljava/lang/Object;", line = 6)
    public final Object method221(byte arg0) {
        if (arg0 != -118) {
            this.field551 = null;
        }
        return this.field551.get();
    }

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 15)
    public class34(Object arg0, int arg1) {
        super(arg1);
        this.field551 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(B)Z", line = 24)
    public final boolean method222(byte arg0) {
        return arg0 == 64;
    }
}
