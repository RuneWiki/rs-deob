import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class190 extends class377 {

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2484;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)Z")
    public final boolean method1060(int arg0) {
        int var2 = -83 / ((arg0 + 68) / 57);
        return true;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class190(Object arg0, int arg1) {
        super(arg1);
        this.field2484 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1061(byte arg0) {
        if (arg0 != 45) {
            this.field2484 = null;
        }
        return this.field2484.get();
    }
}
