import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class368 extends class437 {

    @OriginalMember(owner = "client!uv", name = "E", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5146;

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lek;Ljava/lang/Object;I)V", line = 5)
    public class368(class510 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field5146 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)Z", line = 14)
    public final boolean method2172(byte arg0) {
        if (arg0 >= -62) {
            this.method2173(121);
        }
        return true;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 24)
    public final Object method2173(int arg0) {
        if (arg0 != -1) {
            this.field5146 = null;
        }
        return this.field5146.get();
    }
}
