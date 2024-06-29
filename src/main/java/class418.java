import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class418 extends class156 {

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field6253;

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Ldt;Ljava/lang/Object;I)V")
    public class418(class431 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field6253 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)Z")
    public final boolean method1005(boolean arg0) {
        return arg0 ? true : true;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1006(byte arg0) {
        if (arg0 != 2) {
            this.method1005(false);
        }
        return this.field6253.get();
    }
}
