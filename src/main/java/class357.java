import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class357 extends class225 {

    @OriginalMember(owner = "client!cu", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5145;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "(B)Z", line = 5)
    public final boolean method1396(byte arg0) {
        if (arg0 != 65) {
            this.method1395((byte) 112);
        }
        return true;
    }

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 15)
    public final Object method1395(byte arg0) {
        if (arg0 > -9) {
            this.field5145 = null;
        }
        return this.field5145.get();
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Ljo;Ljava/lang/Object;I)V", line = 25)
    public class357(class381 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field5145 = new SoftReference(arg1);
    }
}
