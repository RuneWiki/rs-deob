import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class168 extends class547 {

    @OriginalMember(owner = "client!qga", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2427;

    @OriginalMember(owner = "client!qga", name = "f", descriptor = "(B)Z")
    public final boolean method1160(byte arg0) {
        if (arg0 != -41) {
            this.method1161((byte) 98);
        }
        return true;
    }

    @OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class168(Object arg0, int arg1) {
        super(arg1);
        this.field2427 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!qga", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1161(byte arg0) {
        if (arg0 < 21) {
            this.method1161((byte) -20);
        }
        return this.field2427.get();
    }
}
