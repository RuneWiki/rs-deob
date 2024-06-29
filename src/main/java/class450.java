import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class450 extends class240 {

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field6583;

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lkb;Ljava/lang/Object;)V", line = 5)
    public class450(class80 arg0, Object arg1) {
        super(arg0);
        this.field6583 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 14)
    public final Object method347(int arg0) {
        if (arg0 != -27089) {
            this.field6583 = (SoftReference) null;
        }
        return this.field6583.get();
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)Z", line = 24)
    public final boolean method349(byte arg0) {
        if (arg0 != 29) {
            this.field6583 = (SoftReference) null;
        }
        return true;
    }
}
