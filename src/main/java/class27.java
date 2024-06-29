import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class27 extends class331 {

    @OriginalMember(owner = "client!ir", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field252;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)Z")
    public final boolean method121(byte arg0) {
        int var2 = 42 / ((arg0 + 56) / 57);
        return true;
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method122(byte arg0) {
        if (arg0 < 104) {
            this.field252 = null;
        }
        return this.field252.get();
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lws;Ljava/lang/Object;I)V")
    public class27(class531 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field252 = new SoftReference(arg1);
    }
}
