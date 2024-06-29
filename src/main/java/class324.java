import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class324 extends class164 {

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4976;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)Z", line = 5)
    public final boolean method1074(byte arg0) {
        if (arg0 != 47) {
            this.field4976 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 15)
    public final Object method1075(byte arg0) {
        if (arg0 > -14) {
            this.method1075((byte) 14);
        }
        return this.field4976.get();
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class324(Object arg0) {
        this.field4976 = new SoftReference(arg0);
    }
}
