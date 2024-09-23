import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("w")
public class Entity extends Linkable {

    @OriginalMember(owner = "w", name = "e", descriptor = "I")
    private int field305;

    @OriginalMember(owner = "w", name = "a", descriptor = "(I)Leb;")
    public Model method109(int arg0) {
        if (this.field305 != arg0) {
            throw new NullPointerException();
        }
        return null;
    }
}
