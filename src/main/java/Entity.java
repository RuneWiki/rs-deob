import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("w")
public class Entity extends Linkable {

    @OriginalMember(owner = "w", name = "a", descriptor = "(I)Leb;")
    public Model method105(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return null;
    }
}
