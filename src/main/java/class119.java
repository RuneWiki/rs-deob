import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class119 extends class47 {

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1471;

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class119(Object arg0, int arg1) {
        super(arg1);
        this.field1471 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)Z")
    public final boolean method287(int arg0) {
        if (arg0 != -23906) {
            this.field1471 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method285(byte arg0) {
        return arg0 <= 45 ? (Object) null : this.field1471.get();
    }
}
