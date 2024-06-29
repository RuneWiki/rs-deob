import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class390 extends class491 {

    @OriginalMember(owner = "client!po", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5118;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "(B)Z")
    public final boolean method2326(byte arg0) {
        if (arg0 != 6) {
            this.field5118 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method2327(boolean arg0) {
        if (!arg0) {
            this.field5118 = null;
        }
        return this.field5118.get();
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Ls;Ljava/lang/Object;I)V")
    public class390(class160 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field5118 = new SoftReference(arg1);
    }
}
