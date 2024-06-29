import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class133 extends class26 {

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2098;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)Z")
    public final boolean method192(byte arg0) {
        return arg0 == 17;
    }

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public final Object method194(int arg0) {
        if (arg0 != -3640) {
            this.method194(-84);
        }
        return this.field2098.get();
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lrf;Ljava/lang/Object;I)V")
    public class133(class83 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field2098 = new SoftReference(arg1);
    }
}
