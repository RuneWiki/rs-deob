import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class405 extends class89 {

    @OriginalMember(owner = "client!bp", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5534;

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Ldr;Ljava/lang/Object;I)V")
    public class405(class750 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field5534 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method666(int arg0) {
        if (arg0 > -12) {
            this.field5534 = null;
        }
        return this.field5534.get();
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)Z")
    public final boolean method664(int arg0) {
        return arg0 > 76;
    }
}
