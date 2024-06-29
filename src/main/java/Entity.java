import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class Entity extends Linkable {

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    private int field305;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)Leb;")
    public Model method109(int arg0) {
        if (this.field305 != arg0) {
            throw new NullPointerException();
        }
        return null;
    }
}
