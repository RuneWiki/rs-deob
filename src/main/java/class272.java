import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class272 extends class432 {

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3569;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(B)Z")
    public final boolean method1620(byte arg0) {
        if (arg0 != -48) {
            this.field3569 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1621(byte arg0) {
        if (arg0 > -72) {
            this.method1620((byte) -76);
        }
        return this.field3569.get();
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lkr;Ljava/lang/Object;I)V")
    public class272(class524 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field3569 = new SoftReference(arg1);
    }
}
