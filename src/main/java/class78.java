import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class78 extends class85 {

    @OriginalMember(owner = "client!pv", name = "u", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1043;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)Z")
    public final boolean method598(byte arg0) {
        if (arg0 != 104) {
            this.method598((byte) 84);
        }
        return true;
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public final Object method599(int arg0) {
        if (arg0 != 27585) {
            this.field1043 = null;
        }
        return this.field1043.get();
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class78(Object arg0, int arg1) {
        super(arg1);
        this.field1043 = new SoftReference(arg0);
    }
}
