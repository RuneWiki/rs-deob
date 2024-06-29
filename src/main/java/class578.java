import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class578 extends class521 {

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field7935;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)Z")
    public final boolean method3102(boolean arg0) {
        if (!arg0) {
            this.field7935 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method3108(byte arg0) {
        int var2 = 80 % ((arg0 - 32) / 47);
        return this.field7935.get();
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class578(Object arg0, int arg1) {
        super(arg1);
        this.field7935 = new SoftReference(arg0);
    }
}
