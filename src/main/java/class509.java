import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class509 extends class186 {

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field7393;

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Leq;Ljava/lang/Object;I)V")
    public class509(class137 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field7393 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1420(byte arg0) {
        return arg0 == 122 ? this.field7393.get() : (Object) null;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)Z")
    public final boolean method1422(int arg0) {
        if (arg0 != 0) {
            this.method1420((byte) 115);
        }
        return true;
    }
}
