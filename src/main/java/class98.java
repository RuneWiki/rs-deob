import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class98 extends class132 {

    @OriginalMember(owner = "client!qm", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1443;

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class98(Object arg0, int arg1) {
        super(arg1);
        this.field1443 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)Z")
    public final boolean method651(byte arg0) {
        int var2 = -18 / ((61 - arg0) / 38);
        return true;
    }

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public final Object method652(int arg0) {
        if (arg0 > -33) {
            this.method652(19);
        }
        return this.field1443.get();
    }
}
