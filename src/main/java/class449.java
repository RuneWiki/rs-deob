import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class449 extends class43 {

    @OriginalMember(owner = "client!si", name = "A", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field6449;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "(B)Z", line = 6)
    public final boolean method307(byte arg0) {
        if (arg0 < 42) {
            this.field6449 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 16)
    public final Object method303(byte arg0) {
        if (arg0 >= -104) {
            this.method307((byte) 58);
        }
        return this.field6449.get();
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class449(Object arg0) {
        this.field6449 = new SoftReference(arg0);
    }
}
