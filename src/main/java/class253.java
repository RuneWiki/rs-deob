import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class253 extends class129 {

    @OriginalMember(owner = "client!fs", name = "u", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3307;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 6)
    public final Object method825(int arg0) {
        int var2 = 35 % ((42 - arg0) / 37);
        return this.field3307.get();
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)Z", line = 14)
    public final boolean method824(int arg0) {
        if (arg0 != 5342) {
            this.method825(-10);
        }
        return true;
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 23)
    public class253(Object arg0) {
        this.field3307 = new SoftReference(arg0);
    }
}
