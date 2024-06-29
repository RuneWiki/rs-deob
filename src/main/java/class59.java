import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class59 extends class677 {

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field823;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "(I)Ljava/lang/Object;")
    public final Object method368(int arg0) {
        if (arg0 != -1) {
            this.method368(-72);
        }
        return this.field823.get();
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)Z")
    public final boolean method369(int arg0) {
        if (arg0 >= -50) {
            this.field823 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class59(Object arg0, int arg1) {
        super(arg1);
        this.field823 = new SoftReference(arg0);
    }
}
