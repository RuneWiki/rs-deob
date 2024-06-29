import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class50 extends class306 {

    @OriginalMember(owner = "client!gda", name = "w", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field736;

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lwea;Ljava/lang/Object;I)V", line = 5)
    public class50(class142 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field736 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)Z", line = 15)
    public final boolean method366(int arg0) {
        int var2 = -72 / ((70 - arg0) / 53);
        return true;
    }

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 23)
    public final Object method367(int arg0) {
        return arg0 == -17290 ? this.field736.get() : (Object) null;
    }
}
