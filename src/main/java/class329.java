import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class329 extends class262 {

    @OriginalMember(owner = "client!fs", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4478;

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lc;Ljava/lang/Object;)V")
    public class329(class100 arg0, Object arg1) {
        super(arg0);
        this.field4478 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "(B)Z")
    public final boolean method1273(byte arg0) {
        if (arg0 <= 88) {
            this.field4478 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1271(byte arg0) {
        return arg0 == -98 ? this.field4478.get() : (Object) null;
    }
}
