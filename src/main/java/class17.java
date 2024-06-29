import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class17 extends class249 {

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field302;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 5)
    public final Object method146(int arg0) {
        if (arg0 != 0) {
            this.method147(37);
        }
        return this.field302.get();
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)Z", line = 15)
    public final boolean method147(int arg0) {
        return arg0 == 5 ? true : true;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class17(Object arg0) {
        this.field302 = new SoftReference(arg0);
    }
}
