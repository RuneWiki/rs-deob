import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class113 extends class338 {

    @OriginalMember(owner = "client!bba", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1191;

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Lon;Ljava/lang/Object;I)V")
    public class113(class335 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field1191 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!bba", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public final Object method753(int arg0) {
        if (arg0 != 15640) {
            this.method753(-116);
        }
        return this.field1191.get();
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)Z")
    public final boolean method754(int arg0) {
        if (arg0 != 0) {
            this.field1191 = null;
        }
        return true;
    }
}
