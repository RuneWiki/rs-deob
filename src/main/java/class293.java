import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class293 extends class352 {

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4456;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(B)Z", line = 6)
    public final boolean method1782(byte arg0) {
        int var2 = 85 % ((-arg0 - 34) / 61);
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lah;Ljava/lang/Object;I)V", line = 13)
    public class293(class250 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field4456 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 23)
    public final Object method1783(byte arg0) {
        return arg0 == -72 ? this.field4456.get() : (Object) null;
    }
}
