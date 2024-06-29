import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class423 extends class10 {

    @OriginalMember(owner = "client!td", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5834;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method126(int arg0) {
        int var2 = -3 % ((-arg0 - 21) / 61);
        return this.field5834.get();
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(B)Z")
    public final boolean method123(byte arg0) {
        if (arg0 != 54) {
            this.field5834 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class423(Object arg0, int arg1) {
        super(arg1);
        this.field5834 = new SoftReference(arg0);
    }
}
