import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class266 extends class186 {

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4254;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method559(int arg0) {
        if (arg0 != 17395) {
            this.method559(119);
        }
        return this.field4254.get();
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(Z)Z")
    public final boolean method563(boolean arg0) {
        return arg0;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class266(Object arg0) {
        this.field4254 = new SoftReference(arg0);
    }
}
