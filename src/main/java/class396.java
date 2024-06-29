import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class396 extends class156 {

    @OriginalMember(owner = "client!eo", name = "E", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5818;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)Z")
    public final boolean method1063(byte arg0) {
        if (arg0 != -120) {
            this.method1064((byte) 82);
        }
        return true;
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class396(Object arg0, int arg1) {
        super(arg1);
        this.field5818 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1064(byte arg0) {
        if (arg0 != -108) {
            this.method1063((byte) 50);
        }
        return this.field5818.get();
    }
}
