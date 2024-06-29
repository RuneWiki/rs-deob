import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class491 extends class437 {

    @OriginalMember(owner = "client!hl", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field7034;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2649(int arg0) {
        if (arg0 >= -121) {
            this.method2650(-108);
        }
        return this.field7034.get();
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lbga;Ljava/lang/Object;I)V")
    public class491(class329 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field7034 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "(I)Z")
    public final boolean method2650(int arg0) {
        if (arg0 != -1) {
            this.method2650(-126);
        }
        return true;
    }
}
