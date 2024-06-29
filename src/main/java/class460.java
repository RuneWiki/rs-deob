import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class460 extends class40 {

    @OriginalMember(owner = "client!em", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field6504;

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lvk;Ljava/lang/Object;I)V")
    public class460(class308 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field6504 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!em", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method306(int arg0) {
        return arg0 == -7728 ? this.field6504.get() : (Object) null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)Z")
    public final boolean method302(byte arg0) {
        if (arg0 <= 82) {
            this.field6504 = (SoftReference) null;
        }
        return true;
    }
}
