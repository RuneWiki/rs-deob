import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class82 extends class274 {

    @OriginalMember(owner = "client!ho", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field930;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "(I)Z")
    public final boolean method297(int arg0) {
        if (arg0 != 264559256) {
            this.field930 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public final Object method298(byte arg0) {
        if (arg0 > -38) {
            this.method298((byte) -104);
        }
        return this.field930.get();
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class82(Object arg0) {
        this.field930 = new SoftReference(arg0);
    }
}
