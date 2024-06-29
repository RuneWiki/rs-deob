import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class Entity extends Linkable {

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Z")
    private boolean field301 = true;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)Leb;")
    public Model method107(int arg0) {
        if (arg0 != 7) {
            this.field301 = !this.field301;
        }
        return null;
    }
}
