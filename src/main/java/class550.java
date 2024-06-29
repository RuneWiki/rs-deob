import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class550 extends class415 {

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field8212;

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lnba;Ljava/lang/Object;I)V")
    public class550(class249 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field8212 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "(I)Z")
    public final boolean method2447(int arg0) {
        if (arg0 != 28) {
            this.field8212 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2446(int arg0) {
        return arg0 == -10061 ? this.field8212.get() : (Object) null;
    }
}
