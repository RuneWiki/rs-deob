import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class305 extends class265 {

    @OriginalMember(owner = "client!ks", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4557;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method1588(int arg0) {
        if (arg0 != 14511) {
            this.field4557 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 15)
    public class305(Object arg0, int arg1) {
        super(arg1);
        this.field4557 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "(B)Ljava/lang/Object;", line = 25)
    public final Object method1589(byte arg0) {
        int var2 = 105 % ((arg0 - 43) / 62);
        return this.field4557.get();
    }
}
