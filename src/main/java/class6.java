import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 extends class616 {

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field60;

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lvm;Ljava/lang/Object;I)V", line = 5)
    public class6(class688 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field60 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)Ljava/lang/Object;", line = 14)
    public final Object method35(byte arg0) {
        if (arg0 != 88) {
            this.field60 = null;
        }
        return this.field60.get();
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)Z", line = 24)
    public final boolean method36(boolean arg0) {
        if (arg0) {
            this.field60 = null;
        }
        return true;
    }
}
