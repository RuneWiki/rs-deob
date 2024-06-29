import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class353 extends class62 {

    @OriginalMember(owner = "client!raa", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4550;

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(Lwf;Ljava/lang/Object;I)V")
    public class353(class107 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field4550 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!raa", name = "g", descriptor = "(I)Z")
    public final boolean method398(int arg0) {
        return arg0 == 233 ? true : true;
    }

    @OriginalMember(owner = "client!raa", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public final Object method401(int arg0) {
        if (arg0 != 0) {
            this.field4550 = null;
        }
        return this.field4550.get();
    }
}
