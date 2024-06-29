import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class187 extends class371 {

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2427;

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class187(Object arg0, int arg1) {
        super(arg1);
        this.field2427 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method188(int arg0) {
        if (arg0 != 21051) {
            this.method187(2);
        }
        return this.field2427.get();
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)Z")
    public final boolean method187(int arg0) {
        return arg0 == 2;
    }
}
