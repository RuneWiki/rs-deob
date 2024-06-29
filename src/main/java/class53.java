import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class53 extends class380 {

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field719;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public final Object method367(int arg0) {
        if (arg0 != 21800) {
            this.field719 = (SoftReference) null;
        }
        return this.field719.get();
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)Z")
    public final boolean method368(int arg0) {
        return arg0 == 22;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class53(Object arg0) {
        this.field719 = new SoftReference(arg0);
    }
}
