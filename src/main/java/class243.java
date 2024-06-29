import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class243 extends class223 {

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4171;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(Z)Ljava/lang/Object;", line = 5)
    public final Object method1535(boolean arg0) {
        if (arg0) {
            this.field4171 = (SoftReference) null;
        }
        return this.field4171.get();
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(B)Z", line = 16)
    public final boolean method1532(byte arg0) {
        int var2 = 17 % ((arg0 - 71) / 42);
        return true;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 23)
    public class243(Object arg0) {
        this.field4171 = new SoftReference(arg0);
    }
}
