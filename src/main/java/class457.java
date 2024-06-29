import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class457 extends class31 {

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field6321;

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class457(Object arg0, int arg1) {
        super(arg1);
        this.field6321 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "(I)Z")
    public final boolean method245(int arg0) {
        if (arg0 != -26199) {
            this.method248((byte) 73);
        }
        return true;
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method248(byte arg0) {
        if (arg0 <= 101) {
            this.method248((byte) -27);
        }
        return this.field6321.get();
    }
}
