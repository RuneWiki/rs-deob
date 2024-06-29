import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class707 extends class619 {

    @OriginalMember(owner = "client!mga", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field9898;

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class707(Object arg0, int arg1) {
        super(arg1);
        this.field9898 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!mga", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2001(int arg0) {
        if (arg0 != 9) {
            this.method2001(-16);
        }
        return this.field9898.get();
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)Z")
    public final boolean method1999(int arg0) {
        return arg0 == 9;
    }
}
