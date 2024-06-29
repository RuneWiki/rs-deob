import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class471 extends class249 {

    @OriginalMember(owner = "client!qj", name = "G", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field6492;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method472(byte arg0) {
        if (arg0 != -85) {
            this.field6492 = null;
        }
        return this.field6492.get();
    }

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "(I)Z")
    public final boolean method470(int arg0) {
        if (arg0 != 18398) {
            this.method470(94);
        }
        return true;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Loga;Ljava/lang/Object;I)V")
    public class471(class438 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field6492 = new SoftReference(arg1);
    }
}
