import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class72 extends class603 {

    @OriginalMember(owner = "client!jv", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field758;

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Llo;Ljava/lang/Object;I)V", line = 5)
    public class72(class686 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field758 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 15)
    public final Object method462(int arg0) {
        int var2 = 12 / ((-arg0 - 38) / 40);
        return this.field758.get();
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)Z", line = 23)
    public final boolean method463(byte arg0) {
        if (arg0 >= -36) {
            this.method462(77);
        }
        return true;
    }
}
