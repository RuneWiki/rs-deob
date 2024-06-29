import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class137 extends class324 {

    @OriginalMember(owner = "client!qea", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2049;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)Z")
    public final boolean method939(int arg0) {
        return arg0 == 8519;
    }

    @OriginalMember(owner = "client!qea", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method938(int arg0) {
        if (arg0 != 2) {
            this.method938(80);
        }
        return this.field2049.get();
    }

    @OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class137(Object arg0, int arg1) {
        super(arg1);
        this.field2049 = new SoftReference(arg0);
    }
}
