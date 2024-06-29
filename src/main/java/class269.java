import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class269 extends class134 {

    @OriginalMember(owner = "client!kl", name = "P", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4056;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method821(int arg0) {
        int var2 = -67 % ((-arg0 - 61) / 35);
        return this.field4056.get();
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class269(Object arg0) {
        this.field4056 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "(I)Z")
    public final boolean method820(int arg0) {
        return arg0 == -91 ? true : true;
    }
}
