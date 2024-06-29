import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class231 extends class311 {

    @OriginalMember(owner = "client!oh", name = "H", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3259;

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lmn;Ljava/lang/Object;)V")
    public class231(class205 arg0, Object arg1) {
        super(arg0);
        this.field3259 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public final Object method423(int arg0) {
        return arg0 == -27364 ? this.field3259.get() : (Object) null;
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)Z")
    public final boolean method422(int arg0) {
        return arg0 < 111 ? true : true;
    }
}
