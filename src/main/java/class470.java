import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class470 extends class533 {

    @OriginalMember(owner = "client!bca", name = "t", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field6684;

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "(I)Z")
    public final boolean method2837(int arg0) {
        if (arg0 != 14559) {
            this.field6684 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class470(Object arg0, int arg1) {
        super(arg1);
        this.field6684 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method2838(byte arg0) {
        if (arg0 != -107) {
            this.method2837(-55);
        }
        return this.field6684.get();
    }
}
