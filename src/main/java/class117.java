import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class117 extends class6 {

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1535;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)Z")
    public final boolean method53(boolean arg0) {
        return arg0 ? true : true;
    }

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "(I)Ljava/lang/Object;")
    public final Object method54(int arg0) {
        if (arg0 != 16) {
            this.method54(-118);
        }
        return this.field1535.get();
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class117(Object arg0, int arg1) {
        super(arg1);
        this.field1535 = new SoftReference(arg0);
    }
}
