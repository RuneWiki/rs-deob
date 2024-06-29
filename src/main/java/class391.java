import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class391 extends class218 {

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5576;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1221(int arg0) {
        if (arg0 < 59) {
            this.method1222(false);
        }
        return this.field5576.get();
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)Z")
    public final boolean method1222(boolean arg0) {
        if (!arg0) {
            this.method1221(113);
        }
        return true;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lvl;Ljava/lang/Object;I)V")
    public class391(class407 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field5576 = new SoftReference(arg1);
    }
}
