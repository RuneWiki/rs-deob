import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("w")
public class Entity extends Linkable {

    @OriginalMember(owner = "w", name = "a", descriptor = "(Z)Leb;")
    public Model method108(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        return null;
    }
}
