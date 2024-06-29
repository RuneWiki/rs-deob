import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class156 extends class506 {

    @OriginalMember(owner = "client!faa", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1996;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method622(boolean arg0) {
        if (!arg0) {
            this.field1996 = null;
        }
        return this.field1996.get();
    }

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class156(Object arg0, int arg1) {
        super(arg1);
        this.field1996 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "(I)Z")
    public final boolean method626(int arg0) {
        return arg0 <= 116 ? true : true;
    }
}
