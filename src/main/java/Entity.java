import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class Entity extends Linkable {

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)Leb;")
    public Model method109(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return null;
    }
}
