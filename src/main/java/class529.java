import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class529 extends class202 {

    @OriginalMember(owner = "client!f", name = "G", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field7805;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1039(int arg0) {
        if (arg0 != 0) {
            this.method1041((byte) 84);
        }
        return this.field7805.get();
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)Z")
    public final boolean method1041(byte arg0) {
        return arg0 < -106;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class529(Object arg0, int arg1) {
        super(arg1);
        this.field7805 = new SoftReference(arg0);
    }
}
