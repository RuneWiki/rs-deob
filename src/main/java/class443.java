import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class443 extends class237 {

    @OriginalMember(owner = "client!sn", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field6547;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1032(int arg0) {
        if (arg0 != 0) {
            this.method1035(-16);
        }
        return this.field6547.get();
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lsl;Ljava/lang/Object;I)V")
    public class443(class319 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field6547 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "(I)Z")
    public final boolean method1035(int arg0) {
        if (arg0 != 0) {
            this.method1035(111);
        }
        return true;
    }
}
