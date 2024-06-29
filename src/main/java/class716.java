import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class716 extends class242 {

    @OriginalMember(owner = "client!gw", name = "t", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field9410;

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class716(Object arg0, int arg1) {
        super(arg1);
        this.field9410 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method1380(boolean arg0) {
        return arg0 ? (Object) null : this.field9410.get();
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)Z")
    public final boolean method1377(byte arg0) {
        if (arg0 != -106) {
            this.method1377((byte) -56);
        }
        return true;
    }
}
