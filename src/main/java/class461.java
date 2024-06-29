import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class461 extends class317 {

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field6838;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)Ljava/lang/Object;", line = 6)
    public final Object method1411(boolean arg0) {
        if (!arg0) {
            this.method1410(-63);
        }
        return this.field6838.get();
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lbg;Ljava/lang/Object;I)V", line = 15)
    public class461(class278 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field6838 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "(I)Z", line = 24)
    public final boolean method1410(int arg0) {
        if (arg0 != 8816) {
            this.method1410(-12);
        }
        return true;
    }
}
