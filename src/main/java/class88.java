import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class88 extends class306 {

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1369;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)Z")
    public final boolean method168(byte arg0) {
        int var2 = 33 / ((22 - arg0) / 56);
        return true;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method170(byte arg0) {
        if (arg0 != -81) {
            this.method170((byte) -88);
        }
        return this.field1369.get();
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class88(Object arg0) {
        this.field1369 = new SoftReference(arg0);
    }
}
