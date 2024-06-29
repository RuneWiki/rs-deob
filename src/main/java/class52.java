import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class52 extends class349 {

    @OriginalMember(owner = "client!kaa", name = "w", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field577;

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method389(boolean arg0) {
        if (arg0) {
            this.method389(true);
        }
        return this.field577.get();
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Z)Z")
    public final boolean method390(boolean arg0) {
        if (arg0) {
            this.field577 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class52(Object arg0, int arg1) {
        super(arg1);
        this.field577 = new SoftReference(arg0);
    }
}
