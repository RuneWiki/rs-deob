import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class133 extends class152 {

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2106;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method898(byte arg0) {
        return arg0 <= 54 ? (Object) null : this.field2106.get();
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class133(Object arg0) {
        this.field2106 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(B)Z")
    public final boolean method899(byte arg0) {
        int var2 = -88 / ((arg0 + 81) / 44);
        return true;
    }
}
