import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class509 extends class6 {

    @OriginalMember(owner = "client!ip", name = "G", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field7355;

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 5)
    public class509(Object arg0, int arg1) {
        super(arg1);
        this.field7355 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "(B)Z", line = 15)
    public final boolean method19(byte arg0) {
        int var2 = -88 % ((20 - arg0) / 55);
        return true;
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 23)
    public final Object method17(int arg0) {
        if (arg0 != 0) {
            this.field7355 = null;
        }
        return this.field7355.get();
    }
}
