import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class265 extends class272 {

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4744;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "(I)Z")
    public final boolean method1300(int arg0) {
        if (arg0 != 950234311) {
            this.method1299(-39);
        }
        return true;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class265(Object arg0) {
        this.field4744 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1299(int arg0) {
        if (arg0 <= 8) {
            this.method1300(-50);
        }
        return this.field4744.get();
    }
}
