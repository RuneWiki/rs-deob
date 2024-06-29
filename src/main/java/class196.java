import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class196 extends class435 {

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2768;

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class196(Object arg0, int arg1) {
        super(arg1);
        this.field2768 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(Z)Z")
    public final boolean method1225(boolean arg0) {
        return arg0 ? true : true;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1226(int arg0) {
        if (arg0 != -1) {
            this.field2768 = null;
        }
        return this.field2768.get();
    }
}
