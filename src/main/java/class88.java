import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class88 extends class22 {

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1336;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 7)
    public final Object method185(int arg0) {
        int var2 = -26 % ((arg0 - 7) / 60);
        return this.field1336.get();
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lig;Ljava/lang/Object;I)V", line = 14)
    public class88(class281 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field1336 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)Z", line = 23)
    public final boolean method183(boolean arg0) {
        if (arg0) {
            this.method183(false);
        }
        return true;
    }
}
