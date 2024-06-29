import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class331 extends class385 {

    @OriginalMember(owner = "client!bg", name = "H", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4898;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 5)
    public final Object method2097(byte arg0) {
        return arg0 < 62 ? (Object) null : this.field4898.get();
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Ltp;Ljava/lang/Object;I)V", line = 15)
    public class331(class379 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field4898 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)Z", line = 24)
    public final boolean method2098(int arg0) {
        return arg0 > -83 ? true : true;
    }
}
