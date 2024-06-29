import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class11 extends class249 {

    @OriginalMember(owner = "client!se", name = "X", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field100;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "(I)Z", line = 5)
    public final boolean method59(int arg0) {
        return arg0 == 256 ? true : true;
    }

    @OriginalMember(owner = "client!se", name = "j", descriptor = "(I)Ljava/lang/Object;", line = 15)
    public final Object method60(int arg0) {
        return arg0 == 256 ? this.field100.get() : (Object) null;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class11(Object arg0) {
        this.field100 = new SoftReference(arg0);
    }
}
