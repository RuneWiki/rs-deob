import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class186 extends class172 {

    @OriginalMember(owner = "client!p", name = "t", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2308;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)Z", line = 5)
    public final boolean method991(byte arg0) {
        return arg0 < -52;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)Ljava/lang/Object;", line = 15)
    public final Object method988(boolean arg0) {
        if (!arg0) {
            this.method991((byte) -78);
        }
        return this.field2308.get();
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 25)
    public class186(Object arg0, int arg1) {
        super(arg1);
        this.field2308 = new SoftReference(arg0);
    }
}
