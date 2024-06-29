import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nja")
public class class524 extends class486 {

    @OriginalMember(owner = "client!nja", name = "H", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field7332;

    @OriginalMember(owner = "client!nja", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class524(Object arg0, int arg1) {
        super(arg1);
        this.field7332 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method2642(byte arg0) {
        return arg0 < 86 ? (Object) null : this.field7332.get();
    }

    @OriginalMember(owner = "client!nja", name = "h", descriptor = "(I)Z")
    public final boolean method2643(int arg0) {
        int var2 = 87 / ((arg0 + 26) / 40);
        return true;
    }
}
