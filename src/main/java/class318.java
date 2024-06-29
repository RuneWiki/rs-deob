import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class318 extends class395 {

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4322;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method289(int arg0) {
        if (arg0 != 20239) {
            this.method290(-62);
        }
        return this.field4322.get();
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class318(Object arg0, int arg1) {
        super(arg1);
        this.field4322 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)Z")
    public final boolean method290(int arg0) {
        return arg0 <= 102 ? true : true;
    }
}
