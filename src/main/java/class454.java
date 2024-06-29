import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class454 extends class241 {

    @OriginalMember(owner = "client!t", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field6974;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "(I)Z")
    public final boolean method1450(int arg0) {
        if (arg0 != 8191) {
            this.method1449(87);
        }
        return true;
    }

    @OriginalMember(owner = "client!t", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1449(int arg0) {
        int var2 = -13 / ((83 - arg0) / 34);
        return this.field6974.get();
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class454(Object arg0, int arg1) {
        super(arg1);
        this.field6974 = new SoftReference(arg0);
    }
}
