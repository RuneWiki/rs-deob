import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class66 extends class213 {

    @OriginalMember(owner = "client!gt", name = "w", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field889;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 5)
    public final Object method462(int arg0) {
        if (arg0 != 29793) {
            this.method462(-105);
        }
        return this.field889.get();
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 14)
    public class66(Object arg0, int arg1) {
        super(arg1);
        this.field889 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(B)Z", line = 25)
    public final boolean method463(byte arg0) {
        int var2 = -73 / ((arg0 - 15) / 50);
        return true;
    }
}
