import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class556 extends class261 {

    @OriginalMember(owner = "client!jw", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field7938;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method936(int arg0) {
        if (arg0 != 500) {
            this.field7938 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 14)
    public class556(Object arg0, int arg1) {
        super(arg1);
        this.field7938 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(Z)Ljava/lang/Object;", line = 24)
    public final Object method938(boolean arg0) {
        if (arg0) {
            this.field7938 = null;
        }
        return this.field7938.get();
    }
}
