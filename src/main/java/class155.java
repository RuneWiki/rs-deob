import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class155 extends class367 {

    @OriginalMember(owner = "client!sm", name = "M", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1908;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "(B)Z")
    public final boolean method934(byte arg0) {
        if (arg0 != -40) {
            this.method934((byte) 120);
        }
        return true;
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method935(boolean arg0) {
        if (!arg0) {
            this.method935(false);
        }
        return this.field1908.get();
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class155(Object arg0) {
        this.field1908 = new SoftReference(arg0);
    }
}
