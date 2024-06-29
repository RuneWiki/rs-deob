import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class230 extends class40 {

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3740;

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lcp;Ljava/lang/Object;I)V", line = 5)
    public class230(class512 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field3740 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)Z", line = 14)
    public final boolean method378(byte arg0) {
        if (arg0 != 8) {
            this.field3740 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)Ljava/lang/Object;", line = 24)
    public final Object method381(boolean arg0) {
        if (arg0) {
            this.method378((byte) -124);
        }
        return this.field3740.get();
    }
}
