import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class392 extends class24 {

    @OriginalMember(owner = "client!wu", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5653;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public final Object method141(byte arg0) {
        if (arg0 != -8) {
            this.field5653 = null;
        }
        return this.field5653.get();
    }

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "(B)Z")
    public final boolean method144(byte arg0) {
        if (arg0 != 30) {
            this.field5653 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lst;Ljava/lang/Object;I)V")
    public class392(class457 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field5653 = new SoftReference(arg1);
    }
}
